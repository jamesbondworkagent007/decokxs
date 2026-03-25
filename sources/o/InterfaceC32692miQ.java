package o;

import com.okinc.components.security.scanner.AppHash;
import com.okinc.components.security.scanner.SecurityAppsReq;
import com.okinc.network.okg.response.ResponseData;
import kotlin.jvm.functions.Function0;
import o.InterfaceC32692miQ;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.POST;

/* JADX INFO: renamed from: o.miQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public interface InterfaceC32692miQ {
    public static final ActionBar Companion = ActionBar.AEQbTJ;

    @POST("/priapi/v1/dis/aid")
    AbstractC58185ywX<ResponseData<java.util.List<AppHash>>> KWHzl(@Body @NotNull SecurityAppsReq securityAppsReq, @Header("Encrypt-Strategy") @NotNull java.lang.String str, @Header("sign") @NotNull java.lang.String str2);

    @POST("/api/v5/audit/scanner/dapp/tlog/hash-verify")
    AbstractC58185ywX<ResponseData<java.util.List<AppHash>>> copydefault(@Body @NotNull SecurityAppsReq securityAppsReq, @Header("Encrypt-Strategy") @NotNull java.lang.String str, @Header("sign") @NotNull java.lang.String str2);

    /* JADX INFO: renamed from: o.miQ$ActionBar */
    public static final class ActionBar {
        public static final /* synthetic */ ActionBar AEQbTJ = new ActionBar();
        public static final InterfaceC56387yDm<C32695miT> OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.miR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return InterfaceC32692miQ.ActionBar.AEQbTJ();
            }
        });

        private ActionBar() {
        }

        public static final C32695miT AEQbTJ() {
            return new C32695miT();
        }

        public final C32695miT copydefault() {
            return OLrzqt.getValue();
        }

        public final InterfaceC32692miQ EZpvd() {
            return (InterfaceC32692miQ) C43393roT.EZpvd(C56524yIo.AEQbTJ(InterfaceC32692miQ.class), copydefault());
        }
    }

    /* JADX INFO: renamed from: o.miQ$Activity */
    public static final class Activity {
        public static /* synthetic */ AbstractC58185ywX hashVerify$default(InterfaceC32692miQ interfaceC32692miQ, SecurityAppsReq securityAppsReq, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: hashVerify");
            }
            if ((i & 2) != 0) {
                str = "TIME";
            }
            if ((i & 4) != 0) {
                str2 = "sign";
            }
            return interfaceC32692miQ.copydefault(securityAppsReq, str, str2);
        }

        public static /* synthetic */ AbstractC58185ywX hashVerifyV2$default(InterfaceC32692miQ interfaceC32692miQ, SecurityAppsReq securityAppsReq, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: hashVerifyV2");
            }
            if ((i & 2) != 0) {
                str = "TIME";
            }
            if ((i & 4) != 0) {
                str2 = "sign";
            }
            return interfaceC32692miQ.KWHzl(securityAppsReq, str, str2);
        }
    }
}
