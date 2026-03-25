package o;

import com.okinc.business.defi.biz.core.wallet.update.WalletUpdateWorker;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C11010bzJ;
import o.C13754dXa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.dmr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C14514dmr implements InterfaceC14518dmv {
    public final java.lang.String AEQbTJ;
    public final java.lang.String EZpvd;
    public final Function0<Unit> KWHzl;
    public final Function0<Unit> OLrzqt;
    public final androidx.fragment.app.FragmentManager copydefault;
    public final boolean djBIcL;
    public final Function1<java.lang.String, Unit> gEmmrt;
    public final boolean valueOf;

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public C14514dmr(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull java.lang.String str, boolean z, Function1<? super java.lang.String, Unit> function1, Function0<Unit> function0, Function0<Unit> function02, boolean z2) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.copydefault = fragmentManager;
        this.AEQbTJ = str;
        this.djBIcL = z;
        this.gEmmrt = function1;
        this.KWHzl = function0;
        this.OLrzqt = function02;
        this.valueOf = z2;
        this.EZpvd = "SystemUserPasswordCheckStrategy";
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x002a: CONSTRUCTOR 
  (r10v0 androidx.fragment.app.FragmentManager)
  (r11v0 java.lang.String)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r17v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? false : (r12v0 boolean))
  (wrap:kotlin.jvm.functions.Function1:?: TERNARY null = ((wrap:int:0x0008: ARITH (r17v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function1) : (r13v0 kotlin.jvm.functions.Function1))
  (wrap:kotlin.jvm.functions.Function0:?: TERNARY null = ((wrap:int:0x0010: ARITH (r17v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function0) : (r14v0 kotlin.jvm.functions.Function0))
  (wrap:kotlin.jvm.functions.Function0:?: TERNARY null = ((wrap:int:0x0017: ARITH (r17v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function0) : (r15v0 kotlin.jvm.functions.Function0))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x001e: ARITH (r17v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? true : (r16v0 boolean))
 A[MD:(androidx.fragment.app.FragmentManager, java.lang.String, boolean, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit>, kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.jvm.functions.Function0<kotlin.Unit>, boolean):void (m)] (LINE:14) call: o.dmr.<init>(androidx.fragment.app.FragmentManager, java.lang.String, boolean, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, boolean):void type: THIS */
    public /* synthetic */ C14514dmr(androidx.fragment.app.FragmentManager fragmentManager, java.lang.String str, boolean z, Function1 function1, Function0 function0, Function0 function02, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(fragmentManager, str, (i & 4) != 0 ? false : z, (i & 8) != 0 ? null : function1, (i & 16) != 0 ? null : function0, (i & 32) != 0 ? null : function02, (i & 64) != 0 ? true : z2);
    }

    @Override // o.InterfaceC14518dmv
    public void EZpvd() {
        C10856bwO.copydefault(this.EZpvd, 0, "checkPassword from=" + this.AEQbTJ);
        C14477dmG c14477dmG = new C14477dmG();
        c14477dmG.AEQbTJ(new Function0() { // from class: o.dms
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C14514dmr.copydefault(this.AEQbTJ);
            }
        }, new Function0() { // from class: o.dmo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C14514dmr.EZpvd(this.OLrzqt);
            }
        });
        this.copydefault.beginTransaction().add(c14477dmG, (java.lang.String) null).commitAllowingStateLoss();
    }

    public static final Unit copydefault(final C14514dmr c14514dmr) {
        C10856bwO.copydefault(c14514dmr.EZpvd, 0, "onSuccess");
        if (c14514dmr.djBIcL) {
            Function0<Unit> function0 = c14514dmr.OLrzqt;
            if (function0 != null) {
                function0.invoke();
            }
        } else {
            AbstractC58260yxt<java.lang.String> abstractC58260yxtAYXKKw = C11010bzJ.ActionBar.getInstance$default(C11010bzJ.Companion, null, 1, null).AYXKKw(c14514dmr.AEQbTJ);
            final Function1 function1 = new Function1() { // from class: o.dmu
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C14514dmr.AEQbTJ(this.OLrzqt, (java.lang.String) obj);
                }
            };
            InterfaceC58227yxM<? super java.lang.String> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.dmx
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    C14514dmr.copydefault(function1, obj);
                }
            };
            final Function1 function12 = new Function1() { // from class: o.dmt
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C14514dmr.EZpvd(this.AEQbTJ, (java.lang.Throwable) obj);
                }
            };
            abstractC58260yxtAYXKKw.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.dmw
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    C14514dmr.OLrzqt(function12, obj);
                }
            });
        }
        return Unit.INSTANCE;
    }

    public static final void copydefault(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(C14514dmr c14514dmr, java.lang.String str) {
        C10856bwO.copydefault(c14514dmr.EZpvd, 0, "success");
        if (c14514dmr.valueOf) {
            WalletUpdateWorker instance$default = WalletUpdateWorker.Application.getInstance$default(WalletUpdateWorker.Companion, null, 1, null);
            Intrinsics.copydefault((java.lang.Object) str);
            WalletUpdateWorker.completeWalletsAddresses$OKWallet_wallet_impl$default(instance$default, str, null, 2, null);
        }
        C8342bAs c8342bAsEZpvd = C8342bAs.Companion.EZpvd();
        Intrinsics.copydefault((java.lang.Object) str);
        c8342bAsEZpvd.OLrzqt(str);
        Function1<java.lang.String, Unit> function1 = c14514dmr.gEmmrt;
        if (function1 != null) {
            function1.invoke(str);
        }
        return Unit.INSTANCE;
    }

    public static final void OLrzqt(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(C14514dmr c14514dmr, java.lang.Throwable th) {
        C55326xho.toast$default(C33070mpX.AYXKKw(C13754dXa.FragmentManager.getMediaController), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
        C10856bwO.copydefault(c14514dmr.EZpvd, 0, "fail message=" + th.getMessage(), th);
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(C14514dmr c14514dmr) {
        C55326xho.toast$default(C33070mpX.AYXKKw(C13754dXa.FragmentManager.getMediaController), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
        C10856bwO.copydefault(c14514dmr.EZpvd, 0, "onFailed");
        Function0<Unit> function0 = c14514dmr.KWHzl;
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }
}
