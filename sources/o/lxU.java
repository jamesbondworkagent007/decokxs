package o;

import com.okinc.modular.deeplinkv2.DeeplinkMode;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC43233rlS;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class lxU implements InterfaceC43233rlS {
    public final DeeplinkMode AEQbTJ;
    public final java.lang.String OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC43233rlS
    public DeeplinkMode KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC43233rlS
    public java.lang.String OLrzqt() {
        return this.OLrzqt;
    }

    @Override // o.InterfaceC43233rlS
    public boolean copydefault() {
        return false;
    }

    public lxU(@NotNull DeeplinkMode deeplinkMode) {
        Intrinsics.checkNotNullParameter(deeplinkMode, "");
        this.AEQbTJ = deeplinkMode;
        this.OLrzqt = "buysell/e2e/master";
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
}
