package o;

import com.engagelab.privates.api.MTPrivatesApi;
import com.engagelab.privates.common.global.MTGlobal;
import com.engagelab.privates.core.api.Address;
import com.engagelab.privates.core.api.MTCorePrivatesApi;
import com.engagelab.privates.push.api.MTPushPrivatesApi;
import com.google.gson.JsonElement;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tgJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C46919tgJ implements InterfaceC46921tgL {
    public static final Application Companion = new Application(null);
    public static final int OLrzqt = 8;
    public final android.content.Context copydefault;

    @Override // o.InterfaceC46921tgL
    public void AEQbTJ() {
    }

    @Override // o.InterfaceC46921tgL
    public void AhwBna() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC46921tgL
    public java.lang.Boolean copydefault() {
        return java.lang.Boolean.TRUE;
    }

    public C46919tgJ(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        this.copydefault = context;
        pUU.KWHzl("JiGuangPushImpl", "JPushImpl init");
        android.content.Context applicationContext = context.getApplicationContext();
        Application application = Companion;
        Intrinsics.copydefault(applicationContext);
        application.EZpvd(applicationContext);
        MTPushPrivatesApi.init(applicationContext);
        pUU.KWHzl("JiGuangPushImpl", "JPushImpl, countryCode:" + MTGlobal.getCountryCode(context));
    }

    /* JADX INFO: renamed from: o.tgJ$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.tgJ.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final C46920tgK copydefault() {
            return (C46920tgK) C33488mxR.KWHzl().fromJson((JsonElement) C48787ucK.AEQbTJ.AEQbTJ("jpushConfig"), C46920tgK.class);
        }

        public final void EZpvd(@NotNull android.content.Context context) {
            Intrinsics.checkNotNullParameter(context, "");
            MTCorePrivatesApi.configDebugMode(context, false);
            MTCorePrivatesApi.configConnectRetryCount(context, 3);
            MTPrivatesApi.configAddress(context, EZpvd());
        }

        public final Address EZpvd() {
            java.lang.String strKWHzl;
            java.lang.String strOLrzqt;
            java.lang.String strAEQbTJ;
            Address defaultIp = new Address().setSisHostArray(null).setSisIpArray(null).setSisPort(0).setDefaultIp(null);
            C46920tgK c46920tgKCopydefault = copydefault();
            if (c46920tgKCopydefault == null || (strKWHzl = c46920tgKCopydefault.KWHzl()) == null) {
                strKWHzl = "jpush.coinall.ltd";
            }
            Address defaultHost = defaultIp.setDefaultHost(strKWHzl);
            C46920tgK c46920tgKCopydefault2 = copydefault();
            Address defaultPort = defaultHost.setDefaultPort((c46920tgKCopydefault2 == null || (strAEQbTJ = c46920tgKCopydefault2.AEQbTJ()) == null) ? 3000 : C33129mqd.AhwBna(strAEQbTJ));
            C46920tgK c46920tgKCopydefault3 = copydefault();
            if (c46920tgKCopydefault3 == null || (strOLrzqt = c46920tgKCopydefault3.OLrzqt()) == null) {
                strOLrzqt = "https://jpush.coinall.ltd";
            }
            Address defaultReportUrl = defaultPort.setDefaultReportUrl(strOLrzqt);
            Intrinsics.checkNotNullExpressionValue(defaultReportUrl, "");
            return defaultReportUrl;
        }
    }

    @Override // o.InterfaceC46921tgL
    public java.lang.String EZpvd() {
        return gEmmrt();
    }

    public final java.lang.String gEmmrt() {
        java.lang.String registrationId = MTCorePrivatesApi.getRegistrationId(this.copydefault);
        Intrinsics.checkNotNullExpressionValue(registrationId, "");
        pUU.KWHzl("JiGuangPushImpl", "registrationId : " + registrationId);
        return registrationId;
    }

    @Override // o.InterfaceC46921tgL
    public java.lang.String KWHzl() {
        java.lang.String strEZpvd;
        C46920tgK c46920tgKCopydefault = Companion.copydefault();
        return (c46920tgKCopydefault == null || (strEZpvd = c46920tgKCopydefault.EZpvd()) == null) ? "3" : strEZpvd;
    }

    @Override // o.InterfaceC46921tgL
    public java.lang.String OLrzqt() {
        java.lang.String strCopydefault;
        C46920tgK c46920tgKCopydefault = Companion.copydefault();
        return (c46920tgKCopydefault == null || (strCopydefault = c46920tgKCopydefault.copydefault()) == null) ? "JPush" : strCopydefault;
    }
}
