package com.aaron.commendlineappcation;

import com.aaron.commendlineappcation.boilerplate.ApplicationCotroller;
import com.aaron.commendlineappcation.boilerplate.ApplicationModel;
import com.aaron.commendlineappcation.boilerplate.ApplicationView;

public class Application {

    private static Application instance;

    private Application(String[] args) {
        initialize();
        for (int i = 0; i < args.length; i++) {
            mController.addCommandLineArgments(args[i]);
        }
        mView.printCommandLineArgments();
    }

    private ApplicationModel mModel;
    private ApplicationView mView;
    private ApplicationCotroller mController;

    public static void main(String[] args) {
        instance = new Application(args);
    }

    private void initialize() {
        mController = new ApplicationCotroller();
        mView = new ApplicationView();
        mModel = new ApplicationModel();

        mController.setModel(mModel);
        mController.setView(mView);

        mView.setController(mController);
        mView.setModel(mModel);

        mModel.setController(mController);
        mModel.setView(mView);
    }
}