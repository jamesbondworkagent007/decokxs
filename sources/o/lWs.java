package o;

import androidx.fragment.app.FragmentActivity;
import com.okinc.captcha.impl.data.CaptchaScene;
import com.okinc.captcha.impl.tencent.TencentCaptchaId;
import com.okinc.captcha.impl.tencent.TencentCaptchaService$startCaptcha$1;
import com.okinc.captcha.impl.tencent.TencentCaptchaUserCancelException;
import com.okinc.captcha.impl.tencent.TencentCaptchaVerificationException;
import com.okinc.components.track.bean.EventParamsList;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.AbstractC30369lVv;
import o.C30368lVu;
import o.C6697aUI;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class lWs {
    public static final ActionBar Companion = new ActionBar(null);

    @yCM
    public lWs() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [79=5, 81=5] */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:103:0x0099 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:107:? */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:14:0x005e */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 15, insn: 0x0186: MOVE (r3 I:??[OBJECT, ARRAY]) = (r15 I:??[OBJECT, ARRAY]), block:B:70:0x0186 */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x020c  */
    /* JADX WARN: Type inference failed for: r14v0, types: [o.mzt] */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v10, types: [o.mzt] */
    /* JADX WARN: Type inference failed for: r14v12, types: [o.mzt] */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r5v10, types: [o.mzt] */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12, types: [o.mzt] */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object, o.mzt] */
    /* JADX WARN: Type inference failed for: r5v6, types: [o.mzt] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(@NotNull FragmentActivity fragmentActivity, @NotNull CaptchaScene captchaScene, @NotNull java.lang.String str, Function1<? super EventParamsList, Unit> function1, Function1<? super EventParamsList, Unit> function12, Function1<? super java.lang.Boolean, Unit> function13, boolean z, @NotNull Continuation<? super AbstractC30369lVv> continuation) throws java.lang.Throwable {
        TencentCaptchaService$startCaptcha$1 tencentCaptchaService$startCaptcha$1;
        Function1<? super java.lang.Boolean, Unit> function14;
        Function1<? super java.lang.Boolean, Unit> function15;
        ?? r14;
        ?? r5;
        final ?? c33622mzt;
        FragmentActivity fragmentActivity2;
        long j;
        lWs lws;
        java.lang.String str2;
        FragmentActivity fragmentActivity3;
        java.lang.Object obj;
        long j2;
        Function1<? super EventParamsList, Unit> function16;
        CaptchaScene captchaScene2;
        java.lang.String str3;
        ?? r52;
        long jCurrentTimeMillis;
        ?? r53;
        final Function1<? super java.lang.Boolean, Unit> function17 = function13;
        final boolean z2 = z;
        if (continuation instanceof TencentCaptchaService$startCaptcha$1) {
            tencentCaptchaService$startCaptcha$1 = (TencentCaptchaService$startCaptcha$1) continuation;
            int i = tencentCaptchaService$startCaptcha$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                tencentCaptchaService$startCaptcha$1.label = i - Integer.MIN_VALUE;
            } else {
                tencentCaptchaService$startCaptcha$1 = new TencentCaptchaService$startCaptcha$1(this, continuation);
            }
        }
        java.lang.Object obj2 = tencentCaptchaService$startCaptcha$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = tencentCaptchaService$startCaptcha$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(obj2);
                lWr.KWHzl.EZpvd(str, function1);
                long jCurrentTimeMillis2 = java.lang.System.currentTimeMillis();
                c33622mzt = new C33622mzt();
                if (z2) {
                    try {
                        try {
                            try {
                                c33622mzt.OLrzqt(fragmentActivity, (50 & 2) != 0, (50 & 4) != 0, (50 & 8) == 0 ? false : true, (50 & 16) != 0 ? 500L : 0L, (50 & 32) != 0 ? fragmentActivity.getResources().getString(C6697aUI.Activity.OLrzqt) : null);
                            } catch (TencentCaptchaUserCancelException unused) {
                                function15 = function17;
                                r53 = c33622mzt;
                                pUU.copydefault("CaptchaService", "[TencentCaptchaService] user cancels captcha");
                                AbstractC30369lVv.TaskDescription taskDescription = new AbstractC30369lVv.TaskDescription(null, true);
                                if (z2) {
                                    r53.copydefault();
                                }
                                if (function15 != null) {
                                    function15.invoke(C56443yFo.KWHzl(false));
                                }
                                return taskDescription;
                            } catch (CancellationException e) {
                                e = e;
                                pUU.copydefault("CaptchaService", "[TencentCaptchaService] coroutine CancellationException");
                                throw e;
                            } catch (java.lang.Exception e2) {
                                e = e2;
                                function15 = function17;
                                r52 = c33622mzt;
                                pUU.copydefault("CaptchaService", "[TencentCaptchaService] general exception: message: " + e.getMessage());
                                AbstractC30369lVv.TaskDescription taskDescription2 = new AbstractC30369lVv.TaskDescription(e.getMessage(), false, 2, null);
                                if (z2) {
                                    r52.copydefault();
                                }
                                if (function15 != null) {
                                    function15.invoke(C56443yFo.KWHzl(false));
                                }
                                return taskDescription2;
                            }
                        } catch (java.lang.Throwable th) {
                            th = th;
                            r5 = c33622mzt;
                            function15 = function17;
                            r14 = r5;
                            if (z2) {
                                r14.copydefault();
                            }
                            if (function15 != null) {
                                function15.invoke(C56443yFo.KWHzl(false));
                            }
                            throw th;
                        }
                    } catch (TencentCaptchaVerificationException e3) {
                        e = e3;
                        fragmentActivity3 = fragmentActivity;
                        lws = this;
                        str2 = str;
                        j = 0;
                        c33622mzt = c33622mzt;
                        pUU.copydefault("CaptchaService", "[TencentCaptchaService] captcha verification client exception: code: " + e.getCode() + " message: " + e.getMessage());
                        lWr.KWHzl.copydefault(str2, j, e);
                        lWt.EZpvd.EZpvd(e, str2);
                        AbstractC30369lVv.TaskDescription taskDescription3 = new AbstractC30369lVv.TaskDescription(lws.OLrzqt(fragmentActivity3, e.getCode()), false, 2, null);
                        if (z2) {
                        }
                        if (function17 != null) {
                        }
                        return taskDescription3;
                    }
                }
                if (function17 != null) {
                    function17.invoke(C56443yFo.KWHzl(true));
                }
                try {
                    java.lang.String captchaId = TencentCaptchaId.Companion.EZpvd(captchaScene).getCaptchaId();
                    lWb lwb = new lWb(fragmentActivity, captchaId, OLrzqt(), C33492mxV.OLrzqt(), new Function0() { // from class: o.lWq
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return lWs.copydefault(z2, c33622mzt, function17);
                        }
                    });
                    tencentCaptchaService$startCaptcha$1.L$0 = this;
                    fragmentActivity2 = fragmentActivity;
                    try {
                        tencentCaptchaService$startCaptcha$1.L$1 = fragmentActivity2;
                        tencentCaptchaService$startCaptcha$1.L$2 = captchaScene;
                        tencentCaptchaService$startCaptcha$1.L$3 = str;
                        tencentCaptchaService$startCaptcha$1.L$4 = function12;
                        tencentCaptchaService$startCaptcha$1.L$5 = function17;
                        tencentCaptchaService$startCaptcha$1.L$6 = c33622mzt;
                        tencentCaptchaService$startCaptcha$1.L$7 = captchaId;
                        tencentCaptchaService$startCaptcha$1.Z$0 = z2;
                        tencentCaptchaService$startCaptcha$1.J$0 = jCurrentTimeMillis2;
                        j = 0;
                    } catch (TencentCaptchaVerificationException e4) {
                        e = e4;
                        j = 0;
                        lws = this;
                        str2 = str;
                        fragmentActivity3 = fragmentActivity2;
                        c33622mzt = c33622mzt;
                        pUU.copydefault("CaptchaService", "[TencentCaptchaService] captcha verification client exception: code: " + e.getCode() + " message: " + e.getMessage());
                        lWr.KWHzl.copydefault(str2, j, e);
                        lWt.EZpvd.EZpvd(e, str2);
                        AbstractC30369lVv.TaskDescription taskDescription32 = new AbstractC30369lVv.TaskDescription(lws.OLrzqt(fragmentActivity3, e.getCode()), false, 2, null);
                        if (z2) {
                        }
                        if (function17 != null) {
                        }
                        return taskDescription32;
                    }
                    try {
                        tencentCaptchaService$startCaptcha$1.J$1 = 0L;
                        tencentCaptchaService$startCaptcha$1.label = 1;
                        java.lang.Object objOLrzqt = lwb.OLrzqt(tencentCaptchaService$startCaptcha$1);
                        if (objOLrzqt == objCopydefault) {
                            return objCopydefault;
                        }
                        r14 = c33622mzt;
                        obj = objOLrzqt;
                        j2 = jCurrentTimeMillis2;
                        function16 = function12;
                        fragmentActivity3 = fragmentActivity2;
                        lws = this;
                        str2 = str;
                        function15 = function17;
                        captchaScene2 = captchaScene;
                        str3 = captchaId;
                    } catch (TencentCaptchaVerificationException e5) {
                        e = e5;
                        lws = this;
                        str2 = str;
                        fragmentActivity3 = fragmentActivity2;
                        c33622mzt = c33622mzt;
                        pUU.copydefault("CaptchaService", "[TencentCaptchaService] captcha verification client exception: code: " + e.getCode() + " message: " + e.getMessage());
                        lWr.KWHzl.copydefault(str2, j, e);
                        lWt.EZpvd.EZpvd(e, str2);
                        AbstractC30369lVv.TaskDescription taskDescription322 = new AbstractC30369lVv.TaskDescription(lws.OLrzqt(fragmentActivity3, e.getCode()), false, 2, null);
                        if (z2) {
                            c33622mzt.copydefault();
                        }
                        if (function17 != null) {
                            function17.invoke(C56443yFo.KWHzl(false));
                        }
                        return taskDescription322;
                    }
                } catch (TencentCaptchaVerificationException e6) {
                    e = e6;
                    fragmentActivity2 = fragmentActivity;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jCurrentTimeMillis = tencentCaptchaService$startCaptcha$1.J$1;
                j2 = tencentCaptchaService$startCaptcha$1.J$0;
                z2 = tencentCaptchaService$startCaptcha$1.Z$0;
                str3 = (java.lang.String) tencentCaptchaService$startCaptcha$1.L$7;
                r14 = (C33622mzt) tencentCaptchaService$startCaptcha$1.L$6;
                function15 = (Function1) tencentCaptchaService$startCaptcha$1.L$5;
                function16 = (Function1) tencentCaptchaService$startCaptcha$1.L$4;
                str2 = (java.lang.String) tencentCaptchaService$startCaptcha$1.L$3;
                captchaScene2 = (CaptchaScene) tencentCaptchaService$startCaptcha$1.L$2;
                fragmentActivity3 = (FragmentActivity) tencentCaptchaService$startCaptcha$1.L$1;
                lws = (lWs) tencentCaptchaService$startCaptcha$1.L$0;
                try {
                    C56391yDq.AEQbTJ(obj2);
                    obj = obj2;
                    r14 = r14;
                } catch (TencentCaptchaUserCancelException unused2) {
                    r53 = r14;
                    pUU.copydefault("CaptchaService", "[TencentCaptchaService] user cancels captcha");
                    AbstractC30369lVv.TaskDescription taskDescription4 = new AbstractC30369lVv.TaskDescription(null, true);
                    if (z2) {
                    }
                    if (function15 != null) {
                    }
                    return taskDescription4;
                } catch (TencentCaptchaVerificationException e7) {
                    e = e7;
                    j = jCurrentTimeMillis;
                    c33622mzt = r14;
                    function17 = function15;
                    pUU.copydefault("CaptchaService", "[TencentCaptchaService] captcha verification client exception: code: " + e.getCode() + " message: " + e.getMessage());
                    lWr.KWHzl.copydefault(str2, j, e);
                    lWt.EZpvd.EZpvd(e, str2);
                    AbstractC30369lVv.TaskDescription taskDescription3222 = new AbstractC30369lVv.TaskDescription(lws.OLrzqt(fragmentActivity3, e.getCode()), false, 2, null);
                    if (z2) {
                    }
                    if (function17 != null) {
                    }
                    return taskDescription3222;
                } catch (CancellationException e8) {
                    e = e8;
                    pUU.copydefault("CaptchaService", "[TencentCaptchaService] coroutine CancellationException");
                    throw e;
                } catch (java.lang.Exception e9) {
                    e = e9;
                    r52 = r14;
                    pUU.copydefault("CaptchaService", "[TencentCaptchaService] general exception: message: " + e.getMessage());
                    AbstractC30369lVv.TaskDescription taskDescription22 = new AbstractC30369lVv.TaskDescription(e.getMessage(), false, 2, null);
                    if (z2) {
                    }
                    if (function15 != null) {
                    }
                    return taskDescription22;
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    if (z2) {
                    }
                    if (function15 != null) {
                    }
                    throw th;
                }
            }
            pUU.KWHzl("CaptchaService", "[TencentCaptchaService] captcha verification success");
            jCurrentTimeMillis = java.lang.System.currentTimeMillis() - j2;
            lWr.KWHzl.EZpvd(str2, jCurrentTimeMillis, function16);
            AbstractC30369lVv.Activity activity = new AbstractC30369lVv.Activity((java.util.Map) obj, captchaScene2.getKey(), str3);
            if (z2) {
                r14.copydefault();
            }
            if (function15 != null) {
                function15.invoke(C56443yFo.KWHzl(false));
            }
            return activity;
        } catch (java.lang.Throwable th3) {
            th = th3;
            function17 = function14;
            r5 = obj2;
        }
    }

    public static final Unit copydefault(boolean z, C33622mzt c33622mzt, Function1 function1) {
        if (z) {
            c33622mzt.copydefault();
        }
        if (function1 != null) {
            function1.invoke(java.lang.Boolean.FALSE);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0160 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.String OLrzqt() {
        java.lang.String str;
        java.lang.String strKWHzl = pSC.AEQbTJ.KWHzl();
        switch (strKWHzl.hashCode()) {
            case -1295825987:
                return !strKWHzl.equals("es-419") ? strKWHzl : "es-la";
            case 3383:
                str = "ja";
                if (!strKWHzl.equals("ja")) {
                    return strKWHzl;
                }
                return str;
            case 3428:
                str = "ko";
                if (!strKWHzl.equals("ko")) {
                    return strKWHzl;
                }
                return str;
            case 93023167:
                return !strKWHzl.equals("ar-EH") ? strKWHzl : "ar";
            case 94899956:
                return !strKWHzl.equals("cs-CZ") ? strKWHzl : "cs-cz";
            case 95406413:
                return !strKWHzl.equals("de-DE") ? strKWHzl : "de";
            case 96598217:
                return !strKWHzl.equals("en-IN") ? strKWHzl : "en-in";
            case 96598594:
                return !strKWHzl.equals("en-US") ? strKWHzl : "en";
            case 96747053:
                return !strKWHzl.equals("es-ES") ? strKWHzl : "es";
            case 96747252:
                if (!strKWHzl.equals("es-LA")) {
                    return strKWHzl;
                }
                break;
            case 97640813:
                return !strKWHzl.equals("fr-FR") ? strKWHzl : "fr";
            case 99219825:
                return !strKWHzl.equals("hi-IN") ? strKWHzl : "hi";
            case 99994381:
                return !strKWHzl.equals("id-ID") ? strKWHzl : "id";
            case 100471053:
                return !strKWHzl.equals("it-IT") ? strKWHzl : "it";
            case 104850477:
                return !strKWHzl.equals("nl-NL") ? strKWHzl : "nl";
            case 106697581:
                return !strKWHzl.equals("pl-PL") ? strKWHzl : "pl";
            case 106935481:
                return !strKWHzl.equals("pt-BR") ? strKWHzl : "pt";
            case 106935917:
                return !strKWHzl.equals("pt-PT") ? strKWHzl : "pt-pt";
            case 108634061:
                return !strKWHzl.equals("ro-RO") ? strKWHzl : "ro-ro";
            case 108812813:
                return !strKWHzl.equals("ru-RU") ? strKWHzl : "ru";
            case 110272621:
                return !strKWHzl.equals("th-TH") ? strKWHzl : "th";
            case 110570541:
                return !strKWHzl.equals("tr-TR") ? strKWHzl : "tr";
            case 111285539:
                return !strKWHzl.equals("uk-UA") ? strKWHzl : "uk-ua";
            case 112149522:
                return !strKWHzl.equals("vi-VN") ? strKWHzl : "vi";
            case 115813226:
                return !strKWHzl.equals("zh-CN") ? strKWHzl : "zh-cn";
            case 115813762:
                return !strKWHzl.equals("zh-TW") ? strKWHzl : "zh-tw";
            default:
                return strKWHzl;
        }
    }

    public final java.lang.String OLrzqt(android.app.Activity activity, java.lang.String str) {
        return C33069mpW.KWHzl(activity, C30368lVu.ActionBar.copydefault, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("code", str)));
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.lWs.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }
}
