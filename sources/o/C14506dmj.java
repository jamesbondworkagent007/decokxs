package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.dmj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C14506dmj implements InterfaceC14518dmv {
    public final boolean AEQbTJ;
    public final Function0<Unit> EZpvd;
    public final java.lang.String KWHzl;
    public final java.lang.String OLrzqt;
    public final androidx.fragment.app.FragmentManager copydefault;
    public final Function1<java.lang.String, Unit> djBIcL;

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public C14506dmj(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull java.lang.String str, boolean z, Function1<? super java.lang.String, Unit> function1, Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.copydefault = fragmentManager;
        this.OLrzqt = str;
        this.AEQbTJ = z;
        this.djBIcL = function1;
        this.EZpvd = function0;
        this.KWHzl = "RuntimeIntervalPasswordCheckStrategy";
    }

    @Override // o.InterfaceC14518dmv
    public void EZpvd() {
        InterfaceC14518dmv c14461dlr;
        C10856bwO.copydefault(this.KWHzl, 0, "checkPassword");
        Function1 function1 = new Function1() { // from class: o.dmm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C14506dmj.EZpvd(this.OLrzqt, (java.lang.String) obj);
            }
        };
        if (this.AEQbTJ && C14521dmy.EZpvd.EZpvd()) {
            c14461dlr = new C14513dmq(this.copydefault, this.OLrzqt, function1, this.EZpvd);
        } else {
            c14461dlr = new C14461dlr(this.copydefault, this.OLrzqt, function1, this.EZpvd, null, false, 48, null);
        }
        c14461dlr.EZpvd();
    }

    public static final Unit EZpvd(C14506dmj c14506dmj, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C14521dmy.EZpvd.KWHzl();
        C8342bAs.Companion.EZpvd().OLrzqt(str);
        Function1<java.lang.String, Unit> function1 = c14506dmj.djBIcL;
        if (function1 != null) {
            function1.invoke(str);
        }
        return Unit.INSTANCE;
    }
}
