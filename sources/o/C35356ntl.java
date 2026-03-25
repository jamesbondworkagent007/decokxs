package o;

import com.okinc.modular.deeplinkv2.DeeplinkMode;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC43233rlS;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ntl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C35356ntl implements InterfaceC43233rlS {
    public final java.lang.String OLrzqt;
    public final DeeplinkMode copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC43233rlS
    public DeeplinkMode KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC43233rlS
    public java.lang.String OLrzqt() {
        return this.OLrzqt;
    }

    @Override // o.InterfaceC43233rlS
    public boolean copydefault() {
        return true;
    }

    public C35356ntl(@NotNull DeeplinkMode deeplinkMode) {
        Intrinsics.checkNotNullParameter(deeplinkMode, "");
        this.copydefault = deeplinkMode;
        this.OLrzqt = "im/addRelation";
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
