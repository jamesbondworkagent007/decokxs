package com.okinc.biz.statistics.repository;

import com.okinc.biz.statistics.data.bean.StatisticsRequest;
import com.okinc.biz.statistics.data.bean.StatisticsResp;
import o.AbstractC58247yxg;
import retrofit2.http.Body;
import retrofit2.http.POST;

/* JADX INFO: loaded from: classes3.dex */
public interface StatisticsAPI {
    @POST("/appstat/")
    AbstractC58247yxg<StatisticsResp> reportData(@Body StatisticsRequest statisticsRequest);
}
