package o;

import com.okinc.modular.deeplinkv2.DeeplinkMode;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC43233rlS;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rAq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C41946rAq implements InterfaceC43233rlS {
    public final DeeplinkMode EZpvd;
    public java.lang.String OLrzqt;
    public final java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC43233rlS
    public DeeplinkMode KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC43233rlS
    public java.lang.String OLrzqt() {
        return this.copydefault;
    }

    public C41946rAq(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.OLrzqt = str;
        this.copydefault = str;
        this.EZpvd = DeeplinkMode.PRO;
    }

    @Override // o.InterfaceC43233rlS
    public java.util.List<C43240rlZ> AEQbTJ() {
        return InterfaceC43233rlS.Application.copydefault(this);
    }

    @Override // o.InterfaceC43233rlS
    public boolean AYXKKw() {
        return InterfaceC43233rlS.Application.AEQbTJ(this);
    }

    @Override // o.InterfaceC43233rlS
    public boolean EZpvd() {
        return InterfaceC43233rlS.Application.OLrzqt(this);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0028 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x002a A[ORIG_RETURN, RETURN] */
    @Override // o.InterfaceC43233rlS
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean copydefault() {
        java.lang.String str;
        java.lang.String str2 = this.OLrzqt;
        switch (str2.hashCode()) {
            case -2125363556:
                return !str2.equals("comp/general/vendor/redirect");
            case -990394138:
                if (!str2.equals("kyc/facial")) {
                }
                break;
            case 106677:
                str = "kyc";
                str2.equals(str);
            case 397100009:
                str = "kyc/risk";
                str2.equals(str);
            case 437040118:
                str = "kyc/redirect";
                str2.equals(str);
        }
    }
}
