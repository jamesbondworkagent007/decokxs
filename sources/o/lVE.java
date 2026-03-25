package o;

import com.geetest.captcha.GTCaptcha4Client;
import com.geetest.captcha.GTCaptcha4Config;
import com.okinc.business.defi.api.model.tx.signdata.MultiTransferSignData;
import com.okinc.captcha.impl.geetest.GeetestCaptchaUserCancelException;
import com.okinc.captcha.impl.geetest.GeetestCaptchaVerificationException;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes15.dex */
public final class lVE {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int KWHzl = 8;
    public final android.app.Activity AEQbTJ;
    public final GTCaptcha4Client EZpvd;
    public final GTCaptcha4Config OLrzqt;
    public final java.lang.String copydefault;
    public final java.lang.String gEmmrt;

    public lVE(@NotNull android.app.Activity activity, @NotNull java.lang.String str, @NotNull java.lang.String str2) {
        GTCaptcha4Client gTCaptcha4ClientInit;
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.AEQbTJ = activity;
        this.copydefault = str;
        this.gEmmrt = str2;
        GTCaptcha4Config gTCaptcha4ConfigBuild = new GTCaptcha4Config.Builder().setLanguage(EZpvd()).setParams(AEQbTJ()).build();
        this.OLrzqt = gTCaptcha4ConfigBuild;
        try {
            gTCaptcha4ClientInit = GTCaptcha4Client.getClient(activity).init(str, gTCaptcha4ConfigBuild);
        } catch (java.lang.Exception unused) {
            gTCaptcha4ClientInit = null;
        }
        this.EZpvd = gTCaptcha4ClientInit;
    }

    public static final class StateListAnimator implements GTCaptcha4Client.OnSuccessListener {
        public final /* synthetic */ CancellableContinuation<java.util.Map<java.lang.String, java.lang.String>> OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlinx.coroutines.CancellableContinuation<? super java.util.Map<java.lang.String, java.lang.String>> */
        /* JADX WARN: Multi-variable type inference failed */
        public StateListAnimator(CancellableContinuation<? super java.util.Map<java.lang.String, java.lang.String>> cancellableContinuation) {
            this.OLrzqt = cancellableContinuation;
        }

        @Override // com.geetest.captcha.GTCaptcha4Client.OnSuccessListener
        public final void onSuccess(boolean z, java.lang.String str) {
            if (this.OLrzqt.isActive() && z) {
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    java.util.Map mapGEmmrt = C56424yEw.gEmmrt(C56390yDp.OLrzqt("lot_number", jSONObject.optString("lot_number")), C56390yDp.OLrzqt("captcha_output", jSONObject.optString("captcha_output")), C56390yDp.OLrzqt("pass_token", jSONObject.optString("pass_token")), C56390yDp.OLrzqt("gen_time", jSONObject.optString("gen_time")));
                    CancellableContinuation<java.util.Map<java.lang.String, java.lang.String>> cancellableContinuation = this.OLrzqt;
                    Result.Application application = Result.Companion;
                    cancellableContinuation.resumeWith(Result.m7377constructorimpl(mapGEmmrt));
                } catch (java.lang.Exception e) {
                    CancellableContinuation<java.util.Map<java.lang.String, java.lang.String>> cancellableContinuation2 = this.OLrzqt;
                    Result.Application application2 = Result.Companion;
                    cancellableContinuation2.resumeWith(Result.m7377constructorimpl(C56391yDq.EZpvd(e)));
                }
            }
        }
    }

    public static final class Activity implements GTCaptcha4Client.OnFailureListener {
        public final /* synthetic */ CancellableContinuation<java.util.Map<java.lang.String, java.lang.String>> AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlinx.coroutines.CancellableContinuation<? super java.util.Map<java.lang.String, java.lang.String>> */
        /* JADX WARN: Multi-variable type inference failed */
        public Activity(CancellableContinuation<? super java.util.Map<java.lang.String, java.lang.String>> cancellableContinuation) {
            this.AEQbTJ = cancellableContinuation;
        }

        @Override // com.geetest.captcha.GTCaptcha4Client.OnFailureListener
        public final void onFailure(java.lang.String str) {
            if (this.AEQbTJ.isActive()) {
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    java.lang.String strOptString = jSONObject.optString("code");
                    java.lang.String strOptString2 = jSONObject.optString("msg");
                    if (Intrinsics.EZpvd((java.lang.Object) strOptString, (java.lang.Object) "-14460")) {
                        CancellableContinuation<java.util.Map<java.lang.String, java.lang.String>> cancellableContinuation = this.AEQbTJ;
                        Result.Application application = Result.Companion;
                        cancellableContinuation.resumeWith(Result.m7377constructorimpl(C56391yDq.EZpvd(new GeetestCaptchaUserCancelException())));
                    } else {
                        CancellableContinuation<java.util.Map<java.lang.String, java.lang.String>> cancellableContinuation2 = this.AEQbTJ;
                        Result.Application application2 = Result.Companion;
                        Intrinsics.copydefault((java.lang.Object) strOptString);
                        Intrinsics.copydefault((java.lang.Object) strOptString2);
                        cancellableContinuation2.resumeWith(Result.m7377constructorimpl(C56391yDq.EZpvd(new GeetestCaptchaVerificationException(strOptString, strOptString2))));
                    }
                } catch (java.lang.Exception e) {
                    CancellableContinuation<java.util.Map<java.lang.String, java.lang.String>> cancellableContinuation3 = this.AEQbTJ;
                    Result.Application application3 = Result.Companion;
                    cancellableContinuation3.resumeWith(Result.m7377constructorimpl(C56391yDq.EZpvd(e)));
                }
            }
        }
    }

    public final void OLrzqt() {
        GTCaptcha4Client gTCaptcha4Client = this.EZpvd;
        if (gTCaptcha4Client != null) {
            gTCaptcha4Client.destroy();
        }
    }

    public final java.util.Map<java.lang.String, java.lang.Object> AEQbTJ() {
        return C56424yEw.djBIcL(C56390yDp.OLrzqt("riskType", this.gEmmrt), C56390yDp.OLrzqt("hideSuccess", java.lang.Boolean.TRUE), C56390yDp.OLrzqt("loading", "empty.gif"));
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final java.lang.String EZpvd() {
        java.lang.String strKWHzl = pSC.AEQbTJ.KWHzl();
        switch (strKWHzl.hashCode()) {
            case -1295825987:
                if (!strKWHzl.equals("es-419")) {
                }
                break;
            case 3383:
                if (!strKWHzl.equals("ja")) {
                }
                break;
            case 3428:
                if (!strKWHzl.equals("ko")) {
                }
                break;
            case 93023167:
                if (!strKWHzl.equals("ar-EH")) {
                }
                break;
            case 94899956:
                if (!strKWHzl.equals("cs-CZ")) {
                }
                break;
            case 95406413:
                if (!strKWHzl.equals("de-DE")) {
                }
                break;
            case 96598217:
                if (!strKWHzl.equals("en-IN")) {
                }
                break;
            case 96598594:
                if (!strKWHzl.equals("en-US")) {
                }
                break;
            case 96747053:
                if (!strKWHzl.equals("es-ES")) {
                }
                break;
            case 96747252:
                if (!strKWHzl.equals("es-LA")) {
                }
                break;
            case 97640813:
                if (!strKWHzl.equals("fr-FR")) {
                }
                break;
            case 99219825:
                if (!strKWHzl.equals("hi-IN")) {
                }
                break;
            case 99994381:
                if (!strKWHzl.equals("id-ID")) {
                }
                break;
            case 100471053:
                if (!strKWHzl.equals("it-IT")) {
                }
                break;
            case 104850477:
                if (!strKWHzl.equals("nl-NL")) {
                }
                break;
            case 106697581:
                if (!strKWHzl.equals("pl-PL")) {
                }
                break;
            case 106935481:
                if (!strKWHzl.equals("pt-BR")) {
                }
                break;
            case 106935917:
                if (!strKWHzl.equals("pt-PT")) {
                }
                break;
            case 108634061:
                if (!strKWHzl.equals("ro-RO")) {
                }
                break;
            case 108812813:
                if (!strKWHzl.equals("ru-RU")) {
                }
                break;
            case 110272621:
                if (!strKWHzl.equals("th-TH")) {
                }
                break;
            case 110570541:
                if (!strKWHzl.equals("tr-TR")) {
                }
                break;
            case 111285539:
                if (!strKWHzl.equals("uk-UA")) {
                }
                break;
            case 112149522:
                if (!strKWHzl.equals("vi-VN")) {
                }
                break;
            case 115813226:
                if (!strKWHzl.equals("zh-CN")) {
                }
                break;
            case 115813762:
                if (!strKWHzl.equals("zh-TW")) {
                }
                break;
        }
        return strKWHzl;
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.lVE.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    public final java.lang.Object copydefault(@NotNull Continuation<? super java.util.Map<java.lang.String, java.lang.String>> continuation) throws JSONException {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(C56441yFm.OLrzqt(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        if (this.EZpvd == null) {
            Result.Application application = Result.Companion;
            cancellableContinuationImpl.resumeWith(Result.m7377constructorimpl(C56391yDq.EZpvd(new GeetestCaptchaVerificationException(MultiTransferSignData.DEFAULT_INTERVAL, "webview resource not found"))));
        } else {
            this.EZpvd.addOnSuccessListener(new StateListAnimator(cancellableContinuationImpl)).addOnFailureListener(new Activity(cancellableContinuationImpl)).verifyWithCaptcha();
        }
        java.lang.Object result = cancellableContinuationImpl.getResult();
        if (result == C56442yFn.copydefault()) {
            C56447yFs.copydefault(continuation);
        }
        return result;
    }
}
