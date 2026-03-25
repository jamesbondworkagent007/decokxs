package o;

import com.just.agentweb.DefaultWebClient;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.OkHttpClient;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.sTs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C44540sTs extends C43280rmM {
    public static final Application Companion = new Application(null);
    public final Function0<C44535sTn> EZpvd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C44540sTs(@NotNull Function0<C44535sTn> function0) {
        super(null, 1, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(function0, "");
        this.EZpvd = function0;
        java.lang.String strFJNWhG = C43292rmY.OLrzqt.fJNWhG();
        if (strFJNWhG.length() == 0) {
            java.lang.String strFJNWhG2 = C59442zhC.fJNWhG("\n                ❌ CRITICAL ERROR: OKNetworkConfig.httpBaseUrl is EMPTY!\n                \n                This means OKNetworkConfig was NOT initialized before OKLive module.\n                \n                Possible causes:\n                1. Initialization order issue - OKLive module loaded before network config\n                2. Multi-process issue - network not initialized in this process\n                3. Cold start race condition\n                \n                Expected behavior:\n                - BaseApplication.networkSetupCommon() should be called BEFORE OKLive module registration\n                - Network initialization priority = 10\n                - OKLive module priority = 310\n                \n                Current state:\n                - httpBaseUrl = '" + strFJNWhG + "' (empty)\n                \n                Solution:\n                - Ensure OKNetworkConfig.initWithChains() is called in BaseApplication\n                - Check that network initialization task completes before module registration\n            ");
            pUU.copydefault("LiveRequestConfig", strFJNWhG2);
            throw new java.lang.IllegalStateException(strFJNWhG2);
        }
        if (!C59449zhJ.startsWith$default(strFJNWhG, DefaultWebClient.HTTP_SCHEME, false, 2, null) && !C59449zhJ.startsWith$default(strFJNWhG, DefaultWebClient.HTTPS_SCHEME, false, 2, null)) {
            java.lang.String strFJNWhG3 = C59442zhC.fJNWhG("\n                ❌ CRITICAL ERROR: OKNetworkConfig.httpBaseUrl has invalid URL scheme!\n                \n                Expected: URL starting with 'http://' or 'https://'\n                Actual: '" + strFJNWhG + "'\n                \n                This will cause Retrofit to throw:\n                java.lang.IllegalArgumentException: Expected URL scheme 'http' or 'https' but no scheme was found\n                \n                Solution:\n                - Ensure OKNetworkConfig.updateUrl() is called with a valid URL\n                - Check the URL format in your environment configuration\n            ");
            pUU.copydefault("LiveRequestConfig", strFJNWhG3);
            throw new java.lang.IllegalStateException(strFJNWhG3);
        }
        pUU.EZpvd("LiveRequestConfig", "✅ LiveRequestConfig initialized successfully with baseUrl: " + strFJNWhG);
    }

    /* JADX INFO: renamed from: o.sTs$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.sTs.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    @Override // o.C43280rmM
    public OkHttpClient.Builder initClientBuilder() {
        OkHttpClient.Builder builderInitClientBuilder = super.initClientBuilder();
        builderInitClientBuilder.addInterceptor(new C44533sTl(this.EZpvd));
        return builderInitClientBuilder;
    }
}
