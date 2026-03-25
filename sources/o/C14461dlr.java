package o;

import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C11010bzJ;
import o.C12827cuN;
import o.C15519eLi;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.dlr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C14461dlr implements InterfaceC14518dmv {
    public final java.lang.String AEQbTJ;
    public final java.lang.String EZpvd;
    public final Function0<Unit> KWHzl;
    public final java.lang.String OLrzqt;
    public final androidx.fragment.app.FragmentManager copydefault;
    public final boolean djBIcL;
    public final Function1<java.lang.String, Unit> valueOf;

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public C14461dlr(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull java.lang.String str, Function1<? super java.lang.String, Unit> function1, Function0<Unit> function0, @NotNull java.lang.String str2, boolean z) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.copydefault = fragmentManager;
        this.OLrzqt = str;
        this.valueOf = function1;
        this.KWHzl = function0;
        this.EZpvd = str2;
        this.djBIcL = z;
        this.AEQbTJ = "CommonPasswordCheckStrategy";
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0023: CONSTRUCTOR 
  (r10v0 androidx.fragment.app.FragmentManager)
  (r11v0 java.lang.String)
  (wrap:kotlin.jvm.functions.Function1:?: TERNARY null = ((wrap:int:0x0000: ARITH (r16v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function1) : (r12v0 kotlin.jvm.functions.Function1))
  (wrap:kotlin.jvm.functions.Function0:?: TERNARY null = ((wrap:int:0x0008: ARITH (r16v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function0) : (r13v0 kotlin.jvm.functions.Function0))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000f: ARITH (r16v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r14v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0018: ARITH (r16v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? true : (r15v0 boolean))
 A[MD:(androidx.fragment.app.FragmentManager, java.lang.String, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit>, kotlin.jvm.functions.Function0<kotlin.Unit>, java.lang.String, boolean):void (m)] (LINE:14) call: o.dlr.<init>(androidx.fragment.app.FragmentManager, java.lang.String, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, java.lang.String, boolean):void type: THIS */
    public /* synthetic */ C14461dlr(androidx.fragment.app.FragmentManager fragmentManager, java.lang.String str, Function1 function1, Function0 function0, java.lang.String str2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(fragmentManager, str, (i & 4) != 0 ? null : function1, (i & 8) != 0 ? null : function0, (i & 16) != 0 ? "" : str2, (i & 32) != 0 ? true : z);
    }

    @Override // o.InterfaceC14518dmv
    public void EZpvd() {
        C10856bwO.copydefault(this.AEQbTJ, 0, "checkPassword from=" + this.OLrzqt);
        final Function1 function1 = new Function1() { // from class: o.dlu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C14461dlr.copydefault(this.OLrzqt, (java.lang.String) obj);
            }
        };
        C14471dmA c14471dmA = C14471dmA.EZpvd;
        if (c14471dmA.copydefault()) {
            if (c14471dmA.OLrzqt(C9678baC.Companion.AEQbTJ())) {
                new C14430dlM(this.copydefault, this.OLrzqt, false, function1, this.KWHzl, null, this.djBIcL, 36, null).EZpvd();
                return;
            }
            new C14514dmr(this.copydefault, this.OLrzqt, false, function1, this.KWHzl, null, this.djBIcL, 36, null).EZpvd();
            return;
        }
        C11010bzJ.ActionBar.getInstance$default(C11010bzJ.Companion, null, 1, null).AEQbTJ().copydefault(new InterfaceC58227yxM() { // from class: o.dlw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C14461dlr.EZpvd(this.EZpvd, function1, (java.lang.Boolean) obj);
            }
        });
    }

    public static final Unit copydefault(C14461dlr c14461dlr, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C14521dmy.EZpvd.KWHzl();
        C14436dlS.KWHzl.EZpvd(java.lang.System.currentTimeMillis());
        C8342bAs.Companion.EZpvd().OLrzqt(str);
        C15519eLi.Application.getInstance$default(C15519eLi.Companion, null, null, null, 7, null).OLrzqt((AbstractC12782ctV) CollectionsKt___CollectionsKt.firstOrNull(C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).copydefault()), str);
        Function1<java.lang.String, Unit> function1 = c14461dlr.valueOf;
        if (function1 != null) {
            function1.invoke(str);
        }
        return Unit.INSTANCE;
    }

    public static final void EZpvd(C14461dlr c14461dlr, Function1 function1, java.lang.Boolean bool) {
        if (bool.booleanValue()) {
            new C14498dmb(c14461dlr.copydefault, function1, c14461dlr.KWHzl, c14461dlr.EZpvd, c14461dlr.djBIcL).EZpvd();
            return;
        }
        C14471dmA c14471dmA = C14471dmA.EZpvd;
        c14471dmA.OLrzqt();
        if (c14471dmA.OLrzqt(C9678baC.Companion.AEQbTJ())) {
            new C14430dlM(c14461dlr.copydefault, c14461dlr.OLrzqt, false, function1, c14461dlr.KWHzl, null, c14461dlr.djBIcL, 36, null).EZpvd();
            return;
        }
        new C14514dmr(c14461dlr.copydefault, c14461dlr.OLrzqt, false, function1, c14461dlr.KWHzl, null, c14461dlr.djBIcL, 36, null).EZpvd();
    }
}
