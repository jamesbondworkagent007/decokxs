package com.okinc.productmatrix.biz.net;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.p2p.api.OtcExtraKeys;
import com.okinc.productmatrix.biz.bean.ProductMatrixInfo;
import com.okinc.productmatrix.biz.bean.ProductUpdateReq;
import com.okinc.productmatrix.biz.net.ProductMatrixApiService;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import o.AbstractC58185ywX;
import o.C43417ror;
import o.C56392yDr;
import o.C56524yIo;
import o.InterfaceC56387yDm;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;

/* JADX INFO: loaded from: classes19.dex */
public interface ProductMatrixApiService {
    public static final ActionBar Companion = ActionBar.AEQbTJ;

    @GET("/v3/users/mobile/product-matrix")
    AbstractC58185ywX<ResponseData<ProductMatrixInfo>> getMatrixProducts(@Header("Cache-Strategy") @NotNull String str, @NotNull @Query(OtcExtraKeys.MODE) String str2, @QueryMap @NotNull Map<String, String> map);

    @POST("/v3/users/mobile/product-matrix/update")
    AbstractC58185ywX<ResponseData<Unit>> updateUseCenterPersonalProduct(@Body @NotNull ProductUpdateReq productUpdateReq);

    public static final class ActionBar {
        public static final /* synthetic */ ActionBar AEQbTJ = new ActionBar();
        public static final InterfaceC56387yDm<ProductMatrixApiService> copydefault = C56392yDr.copydefault(new Function0() { // from class: o.uaM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return ProductMatrixApiService.ActionBar.AEQbTJ();
            }
        });

        private ActionBar() {
        }

        public static final ProductMatrixApiService AEQbTJ() {
            return (ProductMatrixApiService) C43417ror.OLrzqt(C56524yIo.AEQbTJ(ProductMatrixApiService.class));
        }

        public final ProductMatrixApiService KWHzl() {
            return copydefault.getValue();
        }

        public final ProductMatrixApiService OLrzqt() {
            return KWHzl();
        }
    }
}
