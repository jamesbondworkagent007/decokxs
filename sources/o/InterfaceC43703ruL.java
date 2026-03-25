package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.ok_kyc_core_api.model.CountryBean;
import java.util.TreeMap;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Query;

/* JADX INFO: renamed from: o.ruL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public interface InterfaceC43703ruL {
    public static final ActionBar Companion = ActionBar.AEQbTJ;

    @GET("/v3/comp/kyc/platform/common/provinceList")
    java.lang.Object EZpvd(@Header("Cache-Strategy") @NotNull java.lang.String str, @Header("Cache-Expire") int i, @Header("Cache-Token-Valid") int i2, @NotNull @Query("countryCode") java.lang.String str2, @NotNull Continuation<? super ResponseData<TreeMap<java.lang.String, java.util.ArrayList<CountryBean.Country>>>> continuation);

    @GET("/v3/users/support/common/countriesIncludeCommon")
    java.lang.Object copydefault(@Header("Cache-Strategy") @NotNull java.lang.String str, @Header("Cache-Expire") int i, @Header("Cache-Token-Valid") int i2, @Query("functionType") int i3, @NotNull Continuation<? super ResponseData<TreeMap<java.lang.String, java.util.ArrayList<CountryBean.Country>>>> continuation);

    /* JADX INFO: renamed from: o.ruL$ActionBar */
    public static final class ActionBar {
        public static final /* synthetic */ ActionBar AEQbTJ = new ActionBar();

        private ActionBar() {
        }

        public final InterfaceC43703ruL KWHzl() {
            return (InterfaceC43703ruL) C43417ror.OLrzqt(C56524yIo.AEQbTJ(InterfaceC43703ruL.class));
        }
    }
}
