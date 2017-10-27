package com.watent.pojo.pojo;

import com.watent.pojo.exception.PojoException;
import com.watent.pojo.exception.RestResult;
import com.watent.pojo.model.Pojo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/api/exp")
public class ExceptionController {


    @ResponseBody
    @RequestMapping(value = "/pojoes", method = RequestMethod.GET)
    public RestResult<List<Pojo>> all() {
        List<Pojo> all = new ArrayList<>();
        return RestResult.genSuccessResult(all);
    }

    @ResponseBody
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public RestResult<Pojo> get(@PathVariable Long id) {

        int i = 1 / 0;

        return RestResult.genSuccessResult();
    }

    @RequestMapping(value = "/toview", method = RequestMethod.GET)
    public String view() {

        int i = 1 / 0;

        return "view";
    }

    @RequestMapping(value = "/toview/{id}", method = RequestMethod.GET)
    public String view2(@PathVariable Long id) {
        if (1 == id) {
            throw new PojoException();
        }
        return "view";
    }

}
