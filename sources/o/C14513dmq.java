package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C8342bAs;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.dmq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C14513dmq implements InterfaceC14518dmv {
    public final Function0<Unit> AEQbTJ;
    public final Function1<java.lang.String, Unit> EZpvd;
    public final java.lang.String KWHzl;
    public final java.lang.String OLrzqt;
    public final androidx.fragment.app.FragmentManager copydefault;

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public C14513dmq(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull java.lang.String str, Function1<? super java.lang.String, Unit> function1, Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.copydefault = fragmentManager;
        this.KWHzl = str;
        this.EZpvd = function1;
        this.AEQbTJ = function0;
        this.OLrzqt = "RuntimePasswordCheckStrategy";
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (r2v0 androidx.fragment.app.FragmentManager)
  (r3v0 java.lang.String)
  (wrap:kotlin.jvm.functions.Function1:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function1) : (r4v0 kotlin.jvm.functions.Function1))
  (wrap:kotlin.jvm.functions.Function0:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function0) : (r5v0 kotlin.jvm.functions.Function0))
 A[MD:(androidx.fragment.app.FragmentManager, java.lang.String, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit>, kotlin.jvm.functions.Function0<kotlin.Unit>):void (m)] (LINE:7) call: o.dmq.<init>(androidx.fragment.app.FragmentManager, java.lang.String, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0):void type: THIS */
    public /* synthetic */ C14513dmq(androidx.fragment.app.FragmentManager fragmentManager, java.lang.String str, Function1 function1, Function0 function0, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(fragmentManager, str, (i & 4) != 0 ? null : function1, (i & 8) != 0 ? null : function0);
    }

    @Override // o.InterfaceC14518dmv
    public void EZpvd() {
        C10856bwO.copydefault(this.OLrzqt, 0, "checkPassword");
        C8342bAs.Activity activity = C8342bAs.Companion;
        if (activity.EZpvd().AEQbTJ()) {
            C10856bwO.copydefault(this.OLrzqt, 0, "has runtime");
            Function1<java.lang.String, Unit> function1 = this.EZpvd;
            if (function1 != null) {
                function1.invoke(activity.EZpvd().OLrzqt());
                return;
            }
            return;
        }
        C10856bwO.copydefault(this.OLrzqt, 0, "no runtime");
        new C14461dlr(this.copydefault, this.KWHzl, new Function1() { // from class: o.dmp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C14513dmq.OLrzqt(this.KWHzl, (java.lang.String) obj);
            }
        }, this.AEQbTJ, null, false, 48, null).EZpvd();
    }

    public static final Unit OLrzqt(C14513dmq c14513dmq, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C8342bAs.Companion.EZpvd().OLrzqt(str);
        Function1<java.lang.String, Unit> function1 = c14513dmq.EZpvd;
        if (function1 != null) {
            function1.invoke(str);
        }
        return Unit.INSTANCE;
    }
}
