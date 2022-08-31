package com.ewsdroid.nycschools.nycapi.domain;

import com.ewsdroid.nycschools.nycapi.model.NYCSchoolModel;

import java.util.ArrayList;

public interface CallbackResponse {
    void callbackResponse(ArrayList<NYCSchoolModel> response);
}
