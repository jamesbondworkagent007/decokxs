package o;

import com.okinc.localization2.bean.server.AppLanguage;
import com.okinc.localization2.bean.server.AppLink;
import com.okinc.network.okg.cor.SubdomainStrategy;
import com.okinc.network.okg.response.ResponseData;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Query;

/* JADX INFO: loaded from: classes9.dex */
public interface pSG {
    public static final StateListAnimator Companion = StateListAnimator.copydefault;
    public static final java.lang.String PATH_GET_LANGUAGE_LIST_V3 = "/priapi/v3/i18n/app/languages";
    public static final java.lang.String PATH_GET_LANGUAGE_PACK_V3 = "/priapi/v3/i18n/app/link";

    @GET(PATH_GET_LANGUAGE_PACK_V3)
    java.lang.Object copydefault(@Header("Subdomain-Strategy") @NotNull SubdomainStrategy subdomainStrategy, @Header("x-native-cdn") @NotNull java.lang.String str, @NotNull @Query("market") java.lang.String str2, @NotNull @Query("language") java.lang.String str3, @NotNull Continuation<? super ResponseData<AppLink>> continuation);

    @GET(PATH_GET_LANGUAGE_LIST_V3)
    java.lang.Object copydefault(@Header("Subdomain-Strategy") @NotNull SubdomainStrategy subdomainStrategy, @NotNull @Query("market") java.lang.String str, @NotNull Continuation<? super ResponseData<AppLanguage>> continuation);

    public static final class StateListAnimator {
        public static final /* synthetic */ StateListAnimator copydefault = new StateListAnimator();

        private StateListAnimator() {
        }
    }

    public static final class Application {
        public static /* synthetic */ java.lang.Object getLanguageListV3$default(pSG psg, SubdomainStrategy subdomainStrategy, java.lang.String str, Continuation continuation, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getLanguageListV3");
            }
            if ((i & 1) != 0) {
                subdomainStrategy = SubdomainStrategy.Global.INSTANCE;
            }
            return psg.copydefault(subdomainStrategy, str, continuation);
        }

        public static /* synthetic */ java.lang.Object getAppLinkV3$default(pSG psg, SubdomainStrategy subdomainStrategy, java.lang.String str, java.lang.String str2, java.lang.String str3, Continuation continuation, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getAppLinkV3");
            }
            if ((i & 1) != 0) {
                subdomainStrategy = SubdomainStrategy.Global.INSTANCE;
            }
            return psg.copydefault(subdomainStrategy, str, str2, str3, continuation);
        }
    }
}
