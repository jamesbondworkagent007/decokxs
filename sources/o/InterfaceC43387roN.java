package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.network.okg.unifieddomain.DomainConfigRequest;
import com.okinc.network.okg.unifieddomain.DomainConfigResponse;
import com.okinc.network.okg.unifieddomain.DomainConfigType;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.POST;

/* JADX INFO: renamed from: o.roN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public interface InterfaceC43387roN {
    @POST("/v2/support/variants")
    java.lang.Object copydefault(@Body @NotNull DomainConfigRequest domainConfigRequest, @NotNull Continuation<? super ResponseData<DomainConfigResponse>> continuation);

    /* JADX INFO: renamed from: o.roN$ActionBar */
    public static final class ActionBar {
        public static /* synthetic */ java.lang.Object requestUnifyDomains$default(InterfaceC43387roN interfaceC43387roN, DomainConfigRequest domainConfigRequest, Continuation continuation, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: requestUnifyDomains");
            }
            if ((i & 1) != 0) {
                domainConfigRequest = new DomainConfigRequest("biz_domains_aggregate", yDY.gEmmrt(DomainConfigType.CDN.getTypeName(), DomainConfigType.OSS.getTypeName()));
            }
            return interfaceC43387roN.copydefault(domainConfigRequest, continuation);
        }
    }
}
