package com.okinc.wallet.dependency;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.preference.data.model.ValuationCurrencyBean;
import java.util.List;
import o.AbstractC58185ywX;
import retrofit2.http.GET;

/* JADX INFO: loaded from: classes12.dex */
public interface DependencyApiService {
    @GET("v3/users/common/list/currencies")
    AbstractC58185ywX<ResponseData<List<ValuationCurrencyBean>>> currencies();
}
