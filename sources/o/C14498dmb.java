package o;

import android.content.DialogInterface;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.okinc.business.defi.biz.core.password.PasswordCheckResult;
import com.okinc.business.defi.biz.core.wallet.update.WalletUpdateWorker;
import com.okinc.core.util.SPUtils;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import o.C11010bzJ;
import o.C13754dXa;
import o.C14585doI;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.dmb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C14498dmb implements InterfaceC14518dmv {
    public final boolean AEQbTJ;
    public final androidx.fragment.app.FragmentManager EZpvd;
    public final Function0<Unit> KWHzl;
    public final java.lang.String OLrzqt;
    public final java.lang.String copydefault;
    public final Function1<java.lang.String, Unit> djBIcL;

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public C14498dmb(@NotNull androidx.fragment.app.FragmentManager fragmentManager, Function1<? super java.lang.String, Unit> function1, Function0<Unit> function0, @NotNull java.lang.String str, boolean z) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.EZpvd = fragmentManager;
        this.djBIcL = function1;
        this.KWHzl = function0;
        this.copydefault = str;
        this.AEQbTJ = z;
        this.OLrzqt = "InputPasswordCheckStrategy";
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001e: CONSTRUCTOR 
  (r8v0 androidx.fragment.app.FragmentManager)
  (wrap:kotlin.jvm.functions.Function1:?: TERNARY null = ((wrap:int:0x0000: ARITH (r13v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function1) : (r9v0 kotlin.jvm.functions.Function1))
  (wrap:kotlin.jvm.functions.Function0:?: TERNARY null = ((wrap:int:0x0008: ARITH (r13v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function0) : (r10v0 kotlin.jvm.functions.Function0))
  (wrap:java.lang.String:0x0015: TERNARY null = ((wrap:int:0x000f: ARITH (r13v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r11v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0016: ARITH (r13v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? true : (r12v0 boolean))
 A[MD:(androidx.fragment.app.FragmentManager, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit>, kotlin.jvm.functions.Function0<kotlin.Unit>, java.lang.String, boolean):void (m)] (LINE:18) call: o.dmb.<init>(androidx.fragment.app.FragmentManager, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, java.lang.String, boolean):void type: THIS */
    public /* synthetic */ C14498dmb(androidx.fragment.app.FragmentManager fragmentManager, Function1 function1, Function0 function0, java.lang.String str, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(fragmentManager, (i & 2) != 0 ? null : function1, (i & 4) != 0 ? null : function0, (i & 8) != 0 ? "" : str, (i & 16) != 0 ? true : z);
    }

    @Override // o.InterfaceC14518dmv
    public void EZpvd() {
        C10856bwO.copydefault(this.OLrzqt, 0, "checkPassword");
        C14585doI.StateListAnimator stateListAnimator = C14585doI.Companion;
        java.lang.String strAYXKKw = this.copydefault;
        if (strAYXKKw.length() == 0) {
            strAYXKKw = C33070mpX.AYXKKw(C13754dXa.FragmentManager.HJWChPDXdlte);
        }
        final C14585doI c14585doIKWHzl = stateListAnimator.KWHzl(strAYXKKw);
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        c14585doIKWHzl.KWHzl(new Function1() { // from class: o.dmn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C14498dmb.KWHzl(this.AEQbTJ, booleanRef, c14585doIKWHzl, (java.lang.String) obj);
            }
        });
        c14585doIKWHzl.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: o.dml
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(android.content.DialogInterface dialogInterface) {
                C14498dmb.copydefault(booleanRef, this, dialogInterface);
            }
        });
        c14585doIKWHzl.show(this.EZpvd, (java.lang.String) null);
    }

    public static final InterfaceC58261yxu AhwBna(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final Unit KWHzl(final C14498dmb c14498dmb, final Ref.BooleanRef booleanRef, final C14585doI c14585doI, final java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        AbstractC58260yxt<PasswordCheckResult> abstractC58260yxtOLrzqt = C11010bzJ.ActionBar.getInstance$default(C11010bzJ.Companion, null, 1, null).OLrzqt(str);
        final Function1 function1 = new Function1() { // from class: o.dma
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C14498dmb.EZpvd(str, (PasswordCheckResult) obj);
            }
        };
        AbstractC58260yxt<R> abstractC58260yxtOLrzqt2 = abstractC58260yxtOLrzqt.OLrzqt(new InterfaceC58229yxO() { // from class: o.dlZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C14498dmb.AhwBna(function1, obj);
            }
        });
        final Function1 function12 = new Function1() { // from class: o.dmi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C14498dmb.copydefault(this.OLrzqt, booleanRef, str, c14585doI, (PasswordCheckResult) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.dme
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C14498dmb.gEmmrt(function12, obj);
            }
        };
        final Function1 function13 = new Function1() { // from class: o.dmh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C14498dmb.EZpvd(this.copydefault, (java.lang.Throwable) obj);
            }
        };
        abstractC58260yxtOLrzqt2.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.dmg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C14498dmb.AYXKKw(function13, obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final InterfaceC58261yxu EZpvd(java.lang.String str, final PasswordCheckResult passwordCheckResult) {
        Intrinsics.checkNotNullParameter(passwordCheckResult, "");
        if (SPUtils.getBoolean("wallet_first_input_pwd", true) && passwordCheckResult.isPassed()) {
            AbstractC58260yxt<Unit> abstractC58260yxtAEQbTJ = C11010bzJ.ActionBar.getInstance$default(C11010bzJ.Companion, null, 1, null).AEQbTJ(str);
            final Function1 function1 = new Function1() { // from class: o.dmf
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C14498dmb.KWHzl(passwordCheckResult, (Unit) obj);
                }
            };
            return abstractC58260yxtAEQbTJ.copydefault(new InterfaceC58229yxO() { // from class: o.dmk
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return C14498dmb.copydefault(function1, obj);
                }
            });
        }
        return AbstractC58260yxt.copydefault(passwordCheckResult);
    }

    public static final PasswordCheckResult copydefault(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (PasswordCheckResult) function1.invoke(obj);
    }

    public static final PasswordCheckResult KWHzl(PasswordCheckResult passwordCheckResult, Unit unit) {
        Intrinsics.checkNotNullParameter(unit, "");
        SPUtils.put("wallet_first_input_pwd", java.lang.Boolean.FALSE);
        return passwordCheckResult;
    }

    public static final void gEmmrt(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(C14498dmb c14498dmb, Ref.BooleanRef booleanRef, java.lang.String str, C14585doI c14585doI, PasswordCheckResult passwordCheckResult) {
        java.lang.String str2;
        if (passwordCheckResult.isPassed()) {
            C10856bwO.copydefault(c14498dmb.OLrzqt, 0, "isPassed");
            booleanRef.element = true;
            if (c14498dmb.AEQbTJ) {
                WalletUpdateWorker.completeWalletsAddresses$OKWallet_wallet_impl$default(WalletUpdateWorker.Application.getInstance$default(WalletUpdateWorker.Companion, null, 1, null), str, null, 2, null);
            }
            C8342bAs.Companion.EZpvd().OLrzqt(str);
            c14585doI.dismissAllowingStateLoss();
            Function1<java.lang.String, Unit> function1 = c14498dmb.djBIcL;
            if (function1 != null) {
                function1.invoke(str);
            }
        } else if (passwordCheckResult.isFailed()) {
            C10856bwO.copydefault(c14498dmb.OLrzqt, 0, "isFailed");
            C8342bAs.Companion.EZpvd().EZpvd();
            c14585doI.copydefault(C33069mpW.copydefault(C13754dXa.FragmentManager.fQQVvf, C56424yEw.AYXKKw(C56390yDp.OLrzqt("count", java.lang.String.valueOf(passwordCheckResult.getRemain())))));
        } else if (passwordCheckResult.isLocked()) {
            C10856bwO.copydefault(c14498dmb.OLrzqt, 0, "isLocked");
            C8342bAs.Companion.EZpvd().EZpvd();
            java.lang.String first = passwordCheckResult.m6402getLockRemain().getFirst();
            java.lang.String second = passwordCheckResult.m6402getLockRemain().getSecond();
            if (C33129mqd.AhwBna(first, 0)) {
                if (C33129mqd.AhwBna(second, 0)) {
                    str2 = first + C33070mpX.AYXKKw(C13754dXa.FragmentManager.UJpkuA) + second + C33070mpX.AYXKKw(C13754dXa.FragmentManager.compare);
                } else {
                    str2 = first + C33070mpX.AYXKKw(C13754dXa.FragmentManager.UJpkuA);
                }
            } else {
                str2 = second + C33070mpX.AYXKKw(C13754dXa.FragmentManager.compare);
            }
            c14585doI.copydefault(C33069mpW.copydefault(C13754dXa.FragmentManager.Dff, C56424yEw.AYXKKw(C56390yDp.OLrzqt(CrashHianalyticsData.TIME, str2))));
        }
        return Unit.INSTANCE;
    }

    public static final void AYXKKw(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(C14498dmb c14498dmb, java.lang.Throwable th) {
        C10856bwO.copydefault(c14498dmb.OLrzqt, 0, "onException " + th.getMessage(), th);
        return Unit.INSTANCE;
    }

    public static final void copydefault(Ref.BooleanRef booleanRef, C14498dmb c14498dmb, android.content.DialogInterface dialogInterface) {
        Function0<Unit> function0;
        if (booleanRef.element || (function0 = c14498dmb.KWHzl) == null) {
            return;
        }
        function0.invoke();
    }
}
