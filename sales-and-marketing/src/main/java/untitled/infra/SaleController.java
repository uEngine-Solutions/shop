package untitled.infra;

import java.util.Optional;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import untitled.domain.*;

@RestController
// @RequestMapping(value="/sales")
@Transactional
public class SaleController {

    @Autowired
    SaleRepository saleRepository;

    @RequestMapping(
        value = "sales/{id}/보류",
        method = RequestMethod.PUT,
        produces = "application/json;charset=UTF-8"
    )
    public Sale 보류(
        @PathVariable(value = "id") String id,
        HttpServletRequest request,
        HttpServletResponse response
    ) throws Exception {
        System.out.println("##### /sale/보류  called #####");
        Optional<Sale> optionalSale = saleRepository.findById(id);

        optionalSale.orElseThrow(() -> new Exception("No Entity Found"));
        Sale sale = optionalSale.get();
        sale.보류();

        saleRepository.save(sale);
        return sale;
    }
}
