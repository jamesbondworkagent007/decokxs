package o;

import com.okinc.impact.net.AppOpenReq;
import com.okinc.impact.net.OKImpactResponse;
import com.okinc.network.okg.response.ResponseData;
import kotlin.jvm.functions.Function0;
import o.oJM;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.POST;

/* JADX INFO: loaded from: classes8.dex */
public interface oJM {
    public static final ActionBar Companion = ActionBar.EZpvd;

    @POST("/priapi/v3/growth/mobile/impact/app-install")
    AbstractC58185ywX<ResponseData<OKImpactResponse>> EZpvd();

    @POST("/priapi/v3/growth/mobile/impact/page-load")
    AbstractC58185ywX<ResponseData<OKImpactResponse>> OLrzqt(@Body @NotNull AppOpenReq appOpenReq);

    public static final class ActionBar {
        public static final /* synthetic */ ActionBar EZpvd = new ActionBar();
        public static final InterfaceC56387yDm<oJM> KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.oJS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return oJM.ActionBar.KWHzl();
            }
        });

        private ActionBar() {
        }

        public static final oJM KWHzl() {
            return (oJM) C43417ror.OLrzqt(C56524yIo.AEQbTJ(oJM.class));
        }

        public final oJM copydefault() {
            return KWHzl.getValue();
        }

        public final oJM AEQbTJ() {
            return copydefault();
        }
    }
}
