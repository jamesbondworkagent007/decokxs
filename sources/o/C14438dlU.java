package o;

import com.okinc.business.defi.biz.core.error.WalletPasswordError;
import com.okinc.business.defi.common.password.SilentSignErrorCode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C11010bzJ;
import o.C8342bAs;
import o.InterfaceC32807mkZ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.dlU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C14438dlU implements InterfaceC14518dmv {
    public final Function2<java.lang.String, java.lang.Boolean, Unit> AhwBna;
    public final Function0<Unit> EZpvd;
    public final java.lang.String KWHzl;
    public final java.lang.String OLrzqt;
    public final androidx.fragment.app.FragmentManager copydefault;
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int AEQbTJ = 8;

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.lang.Boolean, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public C14438dlU(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull Function2<? super java.lang.String, ? super java.lang.Boolean, Unit> function2, Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(function2, "");
        this.copydefault = fragmentManager;
        this.KWHzl = str;
        this.OLrzqt = str2;
        this.AhwBna = function2;
        this.EZpvd = function0;
    }

    /* JADX INFO: renamed from: o.dlU$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.dlU.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    @Override // o.InterfaceC14518dmv
    public void EZpvd() {
        pUU.KWHzl("ForegroundRuntimePasswordCheckStrategy", "checkPassword");
        final Function1 function1 = new Function1() { // from class: o.dlY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C14438dlU.copydefault(this.EZpvd, (java.lang.String) obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.dlV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C14438dlU.EZpvd(this.AEQbTJ, (java.lang.String) obj);
            }
        };
        if (InterfaceC32807mkZ.StateListAnimator.hasRisk$default((InterfaceC32807mkZ) C43251rlk.copydefault(InterfaceC32807mkZ.class), null, 1, null)) {
            pUU.KWHzl("ForegroundRuntimePasswordCheckStrategy", "accessibility risk detected");
            C14499dmc.AEQbTJ(SilentSignErrorCode.ACCESSIBILITY_RISK, "accessibility risk detected");
            C8342bAs.Companion.EZpvd().EZpvd();
            new C14461dlr(this.copydefault, this.KWHzl, function1, this.EZpvd, null, false, 48, null).EZpvd();
            return;
        }
        if (C14454dlk.EZpvd.OLrzqt() && C14473dmC.EZpvd.KWHzl()) {
            pUU.KWHzl("ForegroundRuntimePasswordCheckStrategy", "device environment risk detected");
            C14499dmc.AEQbTJ(SilentSignErrorCode.DEVICE_ENV_RISK, "device environment risk detected");
            new C14461dlr(this.copydefault, this.KWHzl, function1, this.EZpvd, null, false, 48, null).EZpvd();
            return;
        }
        C8342bAs.Activity activity = C8342bAs.Companion;
        if (!activity.EZpvd().AEQbTJ()) {
            new C14461dlr(this.copydefault, this.KWHzl, function1, this.EZpvd, null, false, 48, null).EZpvd();
        } else if (C14436dlS.KWHzl.OLrzqt()) {
            new C14461dlr(this.copydefault, this.KWHzl, function1, this.EZpvd, null, false, 48, null).EZpvd();
        } else {
            final java.lang.String strOLrzqt = activity.EZpvd().OLrzqt();
            yBI.KWHzl(C11010bzJ.ActionBar.getInstance$default(C11010bzJ.Companion, null, 1, null).AhwBna(strOLrzqt), (Function1<? super java.lang.Throwable, Unit>) new Function1() { // from class: o.dlX
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C14438dlU.AEQbTJ(this.AEQbTJ, function1, (java.lang.Throwable) obj);
                }
            }, new Function1() { // from class: o.dlW
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C14438dlU.EZpvd(strOLrzqt, this, function12, function1, (java.lang.String) obj);
                }
            });
        }
    }

    public static final Unit copydefault(C14438dlU c14438dlU, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        c14438dlU.copydefault(str);
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(C14438dlU c14438dlU, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        c14438dlU.AEQbTJ(str);
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(java.lang.String str, C14438dlU c14438dlU, Function1 function1, Function1 function12, java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str2, "");
        if (xXW.OLrzqt.AEQbTJ(str, str2, c14438dlU.OLrzqt, true).length() > 0) {
            new C14513dmq(c14438dlU.copydefault, c14438dlU.KWHzl, function1, c14438dlU.EZpvd).EZpvd();
        } else {
            pUU.KWHzl("ForegroundRuntimePasswordCheckStrategy", "wallet data decode failed");
            C14499dmc.AEQbTJ(SilentSignErrorCode.CHECK_DECODE_DATA, "wallet data decode failed");
            new C14461dlr(c14438dlU.copydefault, c14438dlU.KWHzl, function12, c14438dlU.EZpvd, null, false, 48, null).EZpvd();
        }
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(C14438dlU c14438dlU, Function1 function1, java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        pUU.AEQbTJ("ForegroundRuntimePasswordCheckStrategy", "get passwordHash error", th);
        if (th instanceof WalletPasswordError) {
            C14499dmc.AEQbTJ(SilentSignErrorCode.CHECK_PWD_AND_HASH, "password and hash mismatch");
            C8342bAs.Companion.EZpvd().EZpvd();
        } else {
            SilentSignErrorCode silentSignErrorCode = SilentSignErrorCode.UNKNOWN;
            java.lang.String message = th.getMessage();
            C14499dmc.AEQbTJ(silentSignErrorCode, message != null ? message : "");
        }
        new C14461dlr(c14438dlU.copydefault, c14438dlU.KWHzl, function1, c14438dlU.EZpvd, null, false, 48, null).EZpvd();
        return Unit.INSTANCE;
    }

    public final void copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C14436dlS.KWHzl.EZpvd(java.lang.System.currentTimeMillis());
        C8342bAs.Companion.EZpvd().OLrzqt(str);
        this.AhwBna.invoke(str, java.lang.Boolean.FALSE);
    }

    public final void AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C8342bAs.Companion.EZpvd().OLrzqt(str);
        this.AhwBna.invoke(str, java.lang.Boolean.TRUE);
    }
}
