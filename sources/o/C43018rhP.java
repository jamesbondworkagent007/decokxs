package o;

import com.okinc.mln.miniapp.AppJson;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC43022rhT;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rhP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C43018rhP implements InterfaceC43022rhT {
    public final java.lang.String AEQbTJ;
    public final InterfaceC56387yDm EZpvd;
    public final InterfaceC56387yDm OLrzqt;
    public final java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC43022rhT
    public java.lang.String copydefault() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC43022rhT
    public void copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
    }

    public C43018rhP(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.AEQbTJ = str;
        this.copydefault = str2;
        this.EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.rhS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C43018rhP.KWHzl(this.copydefault);
            }
        });
        this.OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.rhW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C43018rhP.AEQbTJ(this.copydefault);
            }
        });
    }

    private final C43045rhq valueOf() {
        return (C43045rhq) this.EZpvd.getValue();
    }

    public static final C43045rhq KWHzl(C43018rhP c43018rhP) {
        int iEZpvd = C43045rhq.Companion.EZpvd();
        java.io.File fileAYXKKw = C7788aqT.AEQbTJ().AYXKKw();
        Intrinsics.checkNotNullExpressionValue(fileAYXKKw, "");
        return new C43045rhq(iEZpvd, C48833udD.copydefault(fileAYXKKw, c43018rhP.copydefault));
    }

    private final AppJson AEQbTJ() {
        return (AppJson) this.OLrzqt.getValue();
    }

    public static final AppJson AEQbTJ(C43018rhP c43018rhP) {
        return InterfaceC43022rhT.Companion.EZpvd(c43018rhP.valueOf());
    }

    @Override // o.InterfaceC43022rhT
    public AppJson EZpvd() {
        return AEQbTJ();
    }

    @Override // o.InterfaceC43022rhT
    public java.lang.String OLrzqt() {
        AppJson appJsonAEQbTJ = AEQbTJ();
        if (appJsonAEQbTJ != null) {
            return appJsonAEQbTJ.getVersion();
        }
        return null;
    }

    @Override // o.InterfaceC43022rhT
    public C43045rhq AEQbTJ(@NotNull InterfaceC43022rhT.StateListAnimator stateListAnimator) {
        Intrinsics.checkNotNullParameter(stateListAnimator, "");
        return valueOf();
    }

    @Override // o.InterfaceC43022rhT
    public java.util.Set<java.lang.String> KWHzl() {
        return yEE.copydefault();
    }
}
