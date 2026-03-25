package o;

import android.content.IntentSender;
import android.os.Handler;
import com.jeppeman.globallydynamic.globalsplitinstall.GlobalSplitInstallException;
import com.okinc.dynamicfeature.manage.FeatureException;
import java.util.concurrent.TimeoutException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C34733nhs;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nhe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C34719nhe {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int EZpvd = 8;
    public final AbstractC34734nhv AEQbTJ;
    public final C34730nhp AYXKKw;
    public final InterfaceC56387yDm AhwBna;
    public final InterfaceC8083avz KWHzl;
    public final java.lang.String OLrzqt;
    public final android.app.Activity copydefault;
    public int djBIcL;
    public final android.os.Handler gEmmrt;
    public final long valueOf;

    public C34719nhe(@NotNull android.app.Activity activity, @NotNull java.lang.String str, @NotNull AbstractC34734nhv abstractC34734nhv, long j) {
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(abstractC34734nhv, "");
        this.copydefault = activity;
        this.OLrzqt = str;
        this.AEQbTJ = abstractC34734nhv;
        this.valueOf = j;
        this.AhwBna = C56392yDr.copydefault(new Function0() { // from class: o.nhh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C34719nhe.KWHzl(this.AEQbTJ);
            }
        });
        this.gEmmrt = new android.os.Handler(android.os.Looper.getMainLooper(), new Handler.Callback() { // from class: o.nhi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(android.os.Message message) {
                return C34719nhe.copydefault(this.copydefault, message);
            }
        });
        this.KWHzl = new InterfaceC8083avz() { // from class: o.nhf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC8083avz
            public final void KWHzl(InterfaceC8076avs interfaceC8076avs) throws IntentSender.SendIntentException {
                C34719nhe.OLrzqt(this.AEQbTJ, interfaceC8076avs);
            }
        };
        this.AYXKKw = new C34730nhp(str);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (r7v0 android.app.Activity)
  (r8v0 java.lang.String)
  (r9v0 o.nhv)
  (wrap:long:?: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (30000 long) : (r10v0 long))
 A[MD:(android.app.Activity, java.lang.String, o.nhv, long):void (m)] (LINE:12) call: o.nhe.<init>(android.app.Activity, java.lang.String, o.nhv, long):void type: THIS */
    public /* synthetic */ C34719nhe(android.app.Activity activity, java.lang.String str, AbstractC34734nhv abstractC34734nhv, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(activity, str, abstractC34734nhv, (i & 8) != 0 ? 30000L : j);
    }

    public final InterfaceC8075avr EZpvd() {
        java.lang.Object value = this.AhwBna.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        return (InterfaceC8075avr) value;
    }

    public static final InterfaceC8075avr KWHzl(C34719nhe c34719nhe) {
        return C8079avv.EZpvd(c34719nhe.copydefault);
    }

    public static final boolean copydefault(C34719nhe c34719nhe, android.os.Message message) {
        Intrinsics.checkNotNullParameter(message, "");
        if (message.what == 1 && c34719nhe.djBIcL != 0) {
            c34719nhe.KWHzl(1, new TimeoutException("Timeout after " + c34719nhe.valueOf + " ms"));
            c34719nhe.copydefault(true);
        }
        return true;
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.nhs.StateListAnimator.w$default(o.nhs$StateListAnimator, java.lang.String, java.lang.String, java.lang.Throwable, int, java.lang.Object):void */
    public static final void OLrzqt(C34719nhe c34719nhe, InterfaceC8076avs interfaceC8076avs) throws IntentSender.SendIntentException {
        if (interfaceC8076avs.AhwBna() == c34719nhe.djBIcL) {
            int i = 99;
            switch (interfaceC8076avs.AYXKKw()) {
                case 2:
                    c34719nhe.AYXKKw.copydefault(interfaceC8076avs.OLrzqt());
                    c34719nhe.AYXKKw.OLrzqt(interfaceC8076avs.gEmmrt());
                    try {
                        c34719nhe.gEmmrt.removeMessages(1);
                        int iEZpvd = yII.EZpvd((interfaceC8076avs.OLrzqt() / interfaceC8076avs.gEmmrt()) * 100.0f);
                        AbstractC34734nhv abstractC34734nhv = c34719nhe.AEQbTJ;
                        if (iEZpvd <= 99) {
                            i = iEZpvd;
                        }
                        abstractC34734nhv.OLrzqt(i);
                    } catch (java.lang.Exception unused) {
                        return;
                    }
                    break;
                case 3:
                default:
                    c34719nhe.AYXKKw.copydefault(java.lang.String.valueOf(interfaceC8076avs.AYXKKw()));
                    break;
                case 4:
                    c34719nhe.AYXKKw.copydefault(java.lang.String.valueOf(interfaceC8076avs.AYXKKw()));
                    c34719nhe.gEmmrt.removeMessages(1);
                    c34719nhe.AEQbTJ.OLrzqt(99);
                    C34733nhs.StateListAnimator stateListAnimatorKWHzl = C34733nhs.Companion.KWHzl();
                    if (stateListAnimatorKWHzl != null) {
                        stateListAnimatorKWHzl.EZpvd("DynamicFeatureManager", "status->installing");
                    }
                    break;
                case 5:
                    c34719nhe.AYXKKw.copydefault(java.lang.String.valueOf(interfaceC8076avs.AYXKKw()));
                    C34733nhs.StateListAnimator stateListAnimatorKWHzl2 = C34733nhs.Companion.KWHzl();
                    if (stateListAnimatorKWHzl2 != null) {
                        stateListAnimatorKWHzl2.EZpvd("DynamicFeatureManager", "status->installed");
                    }
                    c34719nhe.djBIcL = 0;
                    c34719nhe.gEmmrt.removeMessages(1);
                    callback$default(c34719nhe, 0, null, 2, null);
                    break;
                case 6:
                    c34719nhe.AYXKKw.copydefault(interfaceC8076avs.AYXKKw() + ":" + interfaceC8076avs.copydefault());
                    C34733nhs.StateListAnimator stateListAnimatorKWHzl3 = C34733nhs.Companion.KWHzl();
                    if (stateListAnimatorKWHzl3 != null) {
                        C34733nhs.StateListAnimator.e$default(stateListAnimatorKWHzl3, "DynamicFeatureManager", "status->failed(" + interfaceC8076avs.copydefault() + ")", null, 4, null);
                    }
                    break;
                case 7:
                    c34719nhe.AYXKKw.copydefault(java.lang.String.valueOf(interfaceC8076avs.AYXKKw()));
                    C34733nhs.StateListAnimator stateListAnimatorKWHzl4 = C34733nhs.Companion.KWHzl();
                    if (stateListAnimatorKWHzl4 != null) {
                        C34733nhs.StateListAnimator.w$default(stateListAnimatorKWHzl4, "DynamicFeatureManager", "status->canceled", null, 4, null);
                    }
                    if (c34719nhe.djBIcL != 0) {
                        c34719nhe.djBIcL = 0;
                        callback$default(c34719nhe, 2, null, 2, null);
                    }
                    break;
                case 8:
                    c34719nhe.AYXKKw.copydefault(java.lang.String.valueOf(interfaceC8076avs.AYXKKw()));
                    C34733nhs.StateListAnimator stateListAnimatorKWHzl5 = C34733nhs.Companion.KWHzl();
                    if (stateListAnimatorKWHzl5 != null) {
                        stateListAnimatorKWHzl5.EZpvd("DynamicFeatureManager", "status->confirmation");
                    }
                    c34719nhe.gEmmrt.removeMessages(1);
                    c34719nhe.EZpvd().EZpvd(interfaceC8076avs, c34719nhe.copydefault, 1989);
                    break;
            }
        }
    }

    public final void KWHzl() {
        this.AYXKKw.AEQbTJ();
        if (this.OLrzqt.length() == 0) {
            C34733nhs.StateListAnimator stateListAnimatorKWHzl = C34733nhs.Companion.KWHzl();
            if (stateListAnimatorKWHzl != null) {
                C34733nhs.StateListAnimator.e$default(stateListAnimatorKWHzl, "DynamicFeatureManager", "Module name is empty", null, 4, null);
            }
            KWHzl(1, new FeatureException(2, "Module name is empty"));
            return;
        }
        if (EZpvd().KWHzl().contains(this.OLrzqt)) {
            C34733nhs.StateListAnimator stateListAnimatorKWHzl2 = C34733nhs.Companion.KWHzl();
            if (stateListAnimatorKWHzl2 != null) {
                stateListAnimatorKWHzl2.EZpvd("DynamicFeatureManager", "module already installed");
            }
            callback$default(this, 0, null, 2, null);
            return;
        }
        AEQbTJ();
    }

    public static /* synthetic */ void cancel$default(C34719nhe c34719nhe, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        c34719nhe.copydefault(z);
    }

    public final void copydefault(boolean z) {
        C34733nhs.StateListAnimator stateListAnimatorKWHzl = C34733nhs.Companion.KWHzl();
        if (stateListAnimatorKWHzl != null) {
            C34733nhs.StateListAnimator.w$default(stateListAnimatorKWHzl, "DynamicFeatureManager", "cancel called, sessionId: " + this.djBIcL + ", cancelByTimeout: " + z, null, 4, null);
        }
        try {
            if (this.djBIcL != 0) {
                EZpvd().copydefault(this.djBIcL);
            }
            if (z) {
                this.djBIcL = 0;
            }
        } catch (java.lang.Exception unused) {
        }
    }

    public final void AEQbTJ() {
        C8077avt c8077avtCopydefault = C8077avt.KWHzl().copydefault(this.OLrzqt).copydefault();
        EZpvd().AEQbTJ(this.KWHzl);
        C34733nhs.StateListAnimator stateListAnimatorKWHzl = C34733nhs.Companion.KWHzl();
        if (stateListAnimatorKWHzl != null) {
            stateListAnimatorKWHzl.EZpvd("DynamicFeatureManager", "start install");
        }
        android.os.Handler handler = this.gEmmrt;
        long j = this.valueOf;
        if (j <= 0) {
            j = 30000;
        }
        handler.sendEmptyMessageDelayed(1, j);
        EZpvd().EZpvd(c8077avtCopydefault).copydefault(new InterfaceC8034avC() { // from class: o.nhn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC8034avC
            public final void AEQbTJ(java.lang.Object obj) {
                C34719nhe.EZpvd(this.EZpvd, (java.lang.Integer) obj);
            }
        }).copydefault(new InterfaceC8032avA() { // from class: o.nhl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC8032avA
            public final void AEQbTJ(java.lang.Exception exc) {
                C34719nhe.AEQbTJ(this.OLrzqt, exc);
            }
        });
    }

    public static final void EZpvd(C34719nhe c34719nhe, java.lang.Integer num) {
        C34733nhs.StateListAnimator stateListAnimatorKWHzl = C34733nhs.Companion.KWHzl();
        if (stateListAnimatorKWHzl != null) {
            stateListAnimatorKWHzl.EZpvd("DynamicFeatureManager", "sessionId is " + num);
        }
        if (num != null && num.intValue() == 0) {
            c34719nhe.gEmmrt.removeMessages(1);
            callback$default(c34719nhe, 0, null, 2, null);
        } else {
            c34719nhe.djBIcL = num.intValue();
            c34719nhe.AYXKKw.copydefault(num.intValue());
        }
    }

    public static final void AEQbTJ(C34719nhe c34719nhe, java.lang.Exception exc) {
        if ((exc instanceof GlobalSplitInstallException) && ((GlobalSplitInstallException) exc).getErrorCode() == -1) {
            c34719nhe.copydefault();
        }
        C34733nhs.StateListAnimator stateListAnimatorKWHzl = C34733nhs.Companion.KWHzl();
        if (stateListAnimatorKWHzl != null) {
            stateListAnimatorKWHzl.EZpvd("DynamicFeatureManager", "Install fail", exc);
        }
        c34719nhe.djBIcL = 0;
        c34719nhe.gEmmrt.removeMessages(1);
        c34719nhe.KWHzl(1, exc);
    }

    public final void copydefault() {
        EZpvd().OLrzqt().EZpvd(new InterfaceC8080avw() { // from class: o.nhg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC8080avw
            public final void KWHzl(InterfaceC8081avx interfaceC8081avx) {
                C34719nhe.KWHzl(this.copydefault, interfaceC8081avx);
            }
        });
    }

    public static final void KWHzl(C34719nhe c34719nhe, InterfaceC8081avx interfaceC8081avx) {
        if (interfaceC8081avx.EZpvd()) {
            for (InterfaceC8076avs interfaceC8076avs : (java.util.List) interfaceC8081avx.AEQbTJ()) {
                if (interfaceC8076avs.AYXKKw() == 2) {
                    c34719nhe.EZpvd().copydefault(interfaceC8076avs.AhwBna());
                }
            }
        }
    }

    public final void OLrzqt(int i, int i2, android.content.Intent intent) {
        if (i == 1989 && intent != null && intent.hasExtra("com.jeppeman.globallydynamic.EXTRA_RESULT")) {
            int intExtra = intent.getIntExtra("com.jeppeman.globallydynamic.EXTRA_RESULT", 0);
            if (intExtra != 1) {
                C34733nhs.StateListAnimator stateListAnimatorKWHzl = C34733nhs.Companion.KWHzl();
                if (stateListAnimatorKWHzl != null) {
                    C34733nhs.StateListAnimator.w$default(stateListAnimatorKWHzl, "DynamicFeatureManager", "confirmResult is not RESULT_CONFIRMED: " + intExtra, null, 4, null);
                }
                callback$default(this, 2, null, 2, null);
                return;
            }
            AEQbTJ();
        }
    }

    public static /* synthetic */ void callback$default(C34719nhe c34719nhe, int i, java.lang.Exception exc, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            exc = null;
        }
        c34719nhe.KWHzl(i, exc);
    }

    public final void KWHzl(int i, java.lang.Exception exc) {
        if (i == 0) {
            this.AYXKKw.copydefault();
            this.AEQbTJ.EZpvd();
        } else if (i == 1) {
            this.AYXKKw.copydefault(exc);
            AbstractC34734nhv abstractC34734nhv = this.AEQbTJ;
            Intrinsics.copydefault(exc);
            abstractC34734nhv.EZpvd(exc);
        } else if (i == 2) {
            this.AYXKKw.OLrzqt();
            this.AEQbTJ.AEQbTJ();
        }
        EZpvd().KWHzl(this.KWHzl);
    }

    /* JADX INFO: renamed from: o.nhe$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.nhe.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }
}
