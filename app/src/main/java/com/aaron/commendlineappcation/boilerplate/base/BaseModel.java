package com.aaron.commendlineappcation.boilerplate.base;

public class BaseModel {

    private BaseView mBaseView;
    private BaseController mBaseController;

    public void setController(BaseController baseController){
        mBaseController = baseController;
    }
    public void setView(BaseView baseView){
        mBaseView = baseView;
    }
}
