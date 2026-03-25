package o;

import com.okinc.modular.deeplinkv2.DeeplinkMode;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC43233rlS;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ntm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C35357ntm implements InterfaceC43233rlS {
    public final java.lang.String KWHzl;
    public final DeeplinkMode OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC43233rlS
    public DeeplinkMode KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC43233rlS
    public java.lang.String OLrzqt() {
        return this.KWHzl;
    }

    @Override // o.InterfaceC43233rlS
    public boolean copydefault() {
        return true;
    }

    public C35357ntm(@NotNull DeeplinkMode deeplinkMode) {
        Intrinsics.checkNotNullParameter(deeplinkMode, "");
        this.OLrzqt = deeplinkMode;
        this.KWHzl = "im/conversationList";
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
