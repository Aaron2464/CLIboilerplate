package com.aaron.commendlineappcation.boilerplate;

public class BaseController {
    private BaseModel mBaseModel;
    private BaseView mBaseView;

    public void setModel(BaseModel baseModel) {
        mBaseModel = baseModel;
    }

    public void setView(BaseView baseView) {
        mBaseView = baseView;
    }
}
