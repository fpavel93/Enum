package com.pavel;

import enums.MailHttpCodes;

public class HttpMailHandler {

    public void handleHttpCode(int code){

        MailHttpCodes httpCode = MailHttpCodes.findByCode(code);
        httpCode.getHandler().handle();
    }
}
