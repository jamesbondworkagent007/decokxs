package o;

import com.okinc.mln.miniapp.AppJson;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC43022rhT;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rhK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C43013rhK implements InterfaceC43022rhT {
    public final java.lang.String EZpvd;
    public final C43045rhq KWHzl;
    public final AppJson OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC43022rhT
    public C43045rhq AEQbTJ(@NotNull InterfaceC43022rhT.StateListAnimator stateListAnimator) {
        Intrinsics.checkNotNullParameter(stateListAnimator, "");
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC43022rhT
    public AppJson EZpvd() {
        return this.OLrzqt;
    }

    @Override // o.InterfaceC43022rhT
    public java.lang.String copydefault() {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC43022rhT
    public void copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
    }

    public C43013rhK(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.EZpvd = str;
        int iEZpvd = C43045rhq.Companion.EZpvd();
        java.lang.String absolutePath = C7324ahg.copydefault().getAbsolutePath();
        Intrinsics.checkNotNullExpressionValue(absolutePath, "");
        C43045rhq c43045rhq = new C43045rhq(iEZpvd, absolutePath);
        this.KWHzl = c43045rhq;
        this.OLrzqt = InterfaceC43022rhT.Companion.EZpvd(c43045rhq);
    }

    @Override // o.InterfaceC43022rhT
    public java.lang.String OLrzqt() {
        AppJson appJson = this.OLrzqt;
        if (appJson != null) {
            return appJson.getVersion();
        }
        return null;
    }

    @Override // o.InterfaceC43022rhT
    public java.util.Set<java.lang.String> KWHzl() {
        return yEE.copydefault();
    }
}
