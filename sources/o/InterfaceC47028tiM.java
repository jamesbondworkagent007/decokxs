package o;

import com.okinc.network.okg.cor.SubdomainStrategy;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.okrisk.service.CommonBody;
import com.okinc.okrisk.service.DeviceProfileResponse;
import com.okinc.okrisk.service.DidBody;
import com.okinc.okrisk.service.DidResponseTmp;
import com.okinc.okrisk.service.DimBody;
import com.okinc.okrisk.service.GccResponseData;
import com.okinc.okrisk.service.RsdResponseData;
import com.okinc.okrisk.service.TypingSpeedBody;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.POST;

/* JADX INFO: renamed from: o.tiM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public interface InterfaceC47028tiM {
    public static final ActionBar Companion = ActionBar.AEQbTJ;

    @POST("/priapi/v1/dis/gcc")
    java.lang.Object KWHzl(@Body @NotNull CommonBody commonBody, @Header("Subdomain-Strategy") @NotNull SubdomainStrategy subdomainStrategy, @NotNull Continuation<? super ResponseData<GccResponseData>> continuation);

    @POST("/priapi/v1/dis/did")
    java.lang.Object KWHzl(@Body @NotNull DidBody didBody, @Header("Subdomain-Strategy") @NotNull SubdomainStrategy subdomainStrategy, @NotNull Continuation<? super ResponseData<DidResponseTmp>> continuation);

    @POST("/api/v5/fd/ts")
    java.lang.Object KWHzl(@Body @NotNull TypingSpeedBody typingSpeedBody, @NotNull Continuation<? super ResponseData<DeviceProfileResponse>> continuation);

    @POST("/api/v5/fd/dp/{tnx_session_id}")
    java.lang.Object KWHzl(@retrofit2.http.Path(encoded = true, value = "tnx_session_id") @NotNull java.lang.String str, @Body @NotNull C47025tiJ c47025tiJ, @NotNull Continuation<? super ResponseData<DeviceProfileResponse>> continuation);

    @POST("/priapi/v1/dis/rsd")
    java.lang.Object copydefault(@Body @NotNull CommonBody commonBody, @Header("Subdomain-Strategy") @NotNull SubdomainStrategy subdomainStrategy, @NotNull Continuation<? super ResponseData<RsdResponseData>> continuation);

    @POST("/priapi/v1/dis/dim")
    java.lang.Object copydefault(@Body @NotNull DimBody dimBody, @Header("Subdomain-Strategy") @NotNull SubdomainStrategy subdomainStrategy, @NotNull Continuation<? super ResponseData<Unit>> continuation);

    /* JADX INFO: renamed from: o.tiM$ActionBar */
    public static final class ActionBar {
        public static final /* synthetic */ ActionBar AEQbTJ = new ActionBar();

        private ActionBar() {
        }

        public final InterfaceC47028tiM EZpvd() {
            return (InterfaceC47028tiM) C43393roT.EZpvd(C56524yIo.AEQbTJ(InterfaceC47028tiM.class), new C47023tiH());
        }
    }

    /* JADX INFO: renamed from: o.tiM$Application */
    public static final class Application {
        public static /* synthetic */ java.lang.Object postDid$default(InterfaceC47028tiM interfaceC47028tiM, DidBody didBody, SubdomainStrategy subdomainStrategy, Continuation continuation, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: postDid");
            }
            if ((i & 2) != 0) {
                subdomainStrategy = SubdomainStrategy.Auto.KWHzl;
            }
            return interfaceC47028tiM.KWHzl(didBody, subdomainStrategy, (Continuation<? super ResponseData<DidResponseTmp>>) continuation);
        }

        public static /* synthetic */ java.lang.Object postDim$default(InterfaceC47028tiM interfaceC47028tiM, DimBody dimBody, SubdomainStrategy subdomainStrategy, Continuation continuation, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: postDim");
            }
            if ((i & 2) != 0) {
                subdomainStrategy = SubdomainStrategy.Auto.KWHzl;
            }
            return interfaceC47028tiM.copydefault(dimBody, subdomainStrategy, (Continuation<? super ResponseData<Unit>>) continuation);
        }

        public static /* synthetic */ java.lang.Object postGcc$default(InterfaceC47028tiM interfaceC47028tiM, CommonBody commonBody, SubdomainStrategy subdomainStrategy, Continuation continuation, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: postGcc");
            }
            if ((i & 2) != 0) {
                subdomainStrategy = SubdomainStrategy.Auto.KWHzl;
            }
            return interfaceC47028tiM.KWHzl(commonBody, subdomainStrategy, (Continuation<? super ResponseData<GccResponseData>>) continuation);
        }

        public static /* synthetic */ java.lang.Object postRsd$default(InterfaceC47028tiM interfaceC47028tiM, CommonBody commonBody, SubdomainStrategy subdomainStrategy, Continuation continuation, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: postRsd");
            }
            if ((i & 2) != 0) {
                subdomainStrategy = SubdomainStrategy.Auto.KWHzl;
            }
            return interfaceC47028tiM.copydefault(commonBody, subdomainStrategy, (Continuation<? super ResponseData<RsdResponseData>>) continuation);
        }
    }
}
