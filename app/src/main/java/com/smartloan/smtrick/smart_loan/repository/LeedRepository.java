package com.smartloan.smtrick.smart_loan.repository;

import android.content.Context;

import com.smartloan.smtrick.smart_loan.callback.CallBack;
import com.smartloan.smtrick.smart_loan.models.LeedsModel;

import java.util.Map;

public interface LeedRepository {
    void readAllLeeds(final CallBack callback);

    void readLeedsByUserId(final Context context, final String userId, final CallBack callBack);

    void createLeed(final LeedsModel leedsModel, final CallBack callback);

    void deleteLeed(final String leedId, final CallBack callback);

    void updateLeed(final String leedId, final Map leedMap, final CallBack callback);

    void readLeedByLeedId(final String leedId, final CallBack callBack);

    void updateLeedDocuments(final String leedId, final Map leedMap, final CallBack callback);

    void updateLeedHistory(final String leedId, final Map leedMap, final CallBack callback);
}
