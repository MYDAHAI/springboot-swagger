package com.yr.springbootswagger.controller;

import com.yr.springbootswagger.entity.User;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

//@Api(tags = "这是一个controller") // 用在请求的类上，表示对类的说明
@Tag(name = "TestController",description = "这是一个controller--测试2")
@Controller
public class TestController {

    @ApiResponses({
            @ApiResponse(responseCode = "404",description = "请求找不到")
    })
    @Operation(method = "get",summary = "用于测试访问",description = "里面就随便打印"
//            parameters =  {
//                @Parameter(name = "name",description = "用户名")
//            },
//            responses = {
//                @ApiResponse(responseCode = "404",description = "请求找不到")
//            }
    )
    @ResponseBody
    @RequestMapping(value = "/testGet",method = RequestMethod.GET)
    public User testGet(@Parameter(description = "用户名") String name){
        System.out.println("testGet");
        return new User();
    }

//    @ApiResponses({ //用在请求的方法上，表示一组响应
//        @ApiResponse(code = 404,message = "请求资源未找到"),
//        @ApiResponse(code = 403,message = "没有访问权限"),
//        @ApiResponse(code = 500,message = "内部错误")
//    })
//    @ApiImplicitParams({ //用在请求的方法上，表示一组参数说明
//        @ApiImplicitParam(name = "id",value = "用户id",required = true,
//                paramType = "query",dataType = "Integer",defaultValue = "null"),
//        @ApiImplicitParam(name = "name",value = "用户名",required = true,
//                paramType = "query",dataType = "String",defaultValue = "")
//    })
//    @ApiOperation(value = "用于测试访问2",notes = "里面就随便打印2")  //用在请求的方法上，说明方法的用途、作用
//    @ResponseBody
//    @RequestMapping(value = "/testPost",method = RequestMethod.POST)
//    public User testPost(Integer id, String name){
//        System.out.println("testPost");
//        return new User();
//    }


}
