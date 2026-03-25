package o;

import com.okinc.business.defi.biz.core.wallet.update.WalletUpdateWorker;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C11010bzJ;
import o.C13754dXa;
import o.C14522dmz;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.dlM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C14430dlM implements InterfaceC14518dmv, C14522dmz.TaskDescription {
    public final Function0<Unit> AEQbTJ;
    public final boolean AhwBna;
    public final Function0<Unit> EZpvd;
    public final java.lang.String KWHzl;
    public final java.lang.String OLrzqt;
    public final androidx.fragment.app.FragmentManager copydefault;
    public final boolean djBIcL;
    public final Function1<java.lang.String, Unit> gEmmrt;

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public C14430dlM(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull java.lang.String str, boolean z, Function1<? super java.lang.String, Unit> function1, Function0<Unit> function0, Function0<Unit> function02, boolean z2) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.copydefault = fragmentManager;
        this.OLrzqt = str;
        this.djBIcL = z;
        this.gEmmrt = function1;
        this.AEQbTJ = function0;
        this.EZpvd = function02;
        this.AhwBna = z2;
        this.KWHzl = "FingerprintPasswordCheckStrategy";
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x002a: CONSTRUCTOR 
  (r10v0 androidx.fragment.app.FragmentManager)
  (r11v0 java.lang.String)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r17v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? false : (r12v0 boolean))
  (wrap:kotlin.jvm.functions.Function1:?: TERNARY null = ((wrap:int:0x0008: ARITH (r17v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function1) : (r13v0 kotlin.jvm.functions.Function1))
  (wrap:kotlin.jvm.functions.Function0:?: TERNARY null = ((wrap:int:0x0010: ARITH (r17v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function0) : (r14v0 kotlin.jvm.functions.Function0))
  (wrap:kotlin.jvm.functions.Function0:?: TERNARY null = ((wrap:int:0x0017: ARITH (r17v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function0) : (r15v0 kotlin.jvm.functions.Function0))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x001e: ARITH (r17v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? true : (r16v0 boolean))
 A[MD:(androidx.fragment.app.FragmentManager, java.lang.String, boolean, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit>, kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.jvm.functions.Function0<kotlin.Unit>, boolean):void (m)] (LINE:14) call: o.dlM.<init>(androidx.fragment.app.FragmentManager, java.lang.String, boolean, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, boolean):void type: THIS */
    public /* synthetic */ C14430dlM(androidx.fragment.app.FragmentManager fragmentManager, java.lang.String str, boolean z, Function1 function1, Function0 function0, Function0 function02, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(fragmentManager, str, (i & 4) != 0 ? false : z, (i & 8) != 0 ? null : function1, (i & 16) != 0 ? null : function0, (i & 32) != 0 ? null : function02, (i & 64) != 0 ? true : z2);
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.dmz.KWHzl(int, int, java.lang.Object[], int, int, int, int):java.lang.Object */
    @Override // o.InterfaceC14518dmv
    public void EZpvd() {
        C10856bwO.copydefault(this.KWHzl, 0, "checkPassword from=" + this.OLrzqt);
        C14522dmz c14522dmz = new C14522dmz();
        C14522dmz.KWHzl(-521175130, C39638pwC.OLrzqt(), new java.lang.Object[]{c14522dmz, this}, C39638pwC.OLrzqt(), C39638pwC.OLrzqt(), 521175130, C39638pwC.OLrzqt());
        c14522dmz.show(this.copydefault, (java.lang.String) null);
    }

    @Override // o.C14522dmz.TaskDescription
    public void KWHzl() {
        if (this.djBIcL) {
            Function0<Unit> function0 = this.EZpvd;
            if (function0 != null) {
                function0.invoke();
                return;
            }
            return;
        }
        AbstractC58260yxt<java.lang.String> abstractC58260yxtAYXKKw = C11010bzJ.ActionBar.getInstance$default(C11010bzJ.Companion, null, 1, null).AYXKKw(this.OLrzqt);
        final Function1 function1 = new Function1() { // from class: o.dlQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C14430dlM.copydefault(this.KWHzl, (java.lang.String) obj);
            }
        };
        InterfaceC58227yxM<? super java.lang.String> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.dlP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C14430dlM.KWHzl(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.dlT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C14430dlM.copydefault(this.copydefault, (java.lang.Throwable) obj);
            }
        };
        abstractC58260yxtAYXKKw.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.dlR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C14430dlM.OLrzqt(function12, obj);
            }
        });
    }

    public static final void KWHzl(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(C14430dlM c14430dlM, java.lang.String str) {
        C10856bwO.copydefault(c14430dlM.KWHzl, 0, "success");
        if (c14430dlM.AhwBna) {
            WalletUpdateWorker instance$default = WalletUpdateWorker.Application.getInstance$default(WalletUpdateWorker.Companion, null, 1, null);
            Intrinsics.copydefault((java.lang.Object) str);
            WalletUpdateWorker.completeWalletsAddresses$OKWallet_wallet_impl$default(instance$default, str, null, 2, null);
        }
        C8342bAs c8342bAsEZpvd = C8342bAs.Companion.EZpvd();
        Intrinsics.copydefault((java.lang.Object) str);
        c8342bAsEZpvd.OLrzqt(str);
        Function1<java.lang.String, Unit> function1 = c14430dlM.gEmmrt;
        if (function1 != null) {
            function1.invoke(str);
        }
        return Unit.INSTANCE;
    }

    public static final void OLrzqt(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(C14430dlM c14430dlM, java.lang.Throwable th) {
        C55326xho.toast$default(C33070mpX.AYXKKw(C13754dXa.FragmentManager.getMediaController), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
        C10856bwO.copydefault(c14430dlM.KWHzl, 0, "fail message=" + th.getMessage(), th);
        return Unit.INSTANCE;
    }

    @Override // o.C14522dmz.TaskDescription
    public void KWHzl(int i) {
        C10856bwO.copydefault(this.KWHzl, 0, "onError " + i);
    }

    @Override // o.C14522dmz.TaskDescription
    public void copydefault() {
        Function0<Unit> function0 = this.AEQbTJ;
        if (function0 != null) {
            function0.invoke();
        }
    }

    @Override // o.C14522dmz.TaskDescription
    public void OLrzqt() {
        new C14514dmr(this.copydefault, this.OLrzqt, this.djBIcL, this.gEmmrt, this.AEQbTJ, this.EZpvd, false, 64, null).EZpvd();
    }
}
