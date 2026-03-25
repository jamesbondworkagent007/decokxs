package o;

import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC5306Mq;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.Mu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5310Mu implements InterfaceC5306Mq {
    public static InterfaceC5306Mq OLrzqt;
    public static final C5310Mu copydefault = new C5310Mu();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(InterfaceC5306Mq interfaceC5306Mq) {
        OLrzqt = interfaceC5306Mq;
    }

    private C5310Mu() {
    }

    @Override // o.InterfaceC5306Mq
    public void KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        InterfaceC5306Mq interfaceC5306Mq = OLrzqt;
        if (interfaceC5306Mq != null) {
            interfaceC5306Mq.KWHzl(str);
        }
    }

    @Override // o.InterfaceC5306Mq
    public void AEQbTJ(@NotNull java.lang.String str, java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(str, "");
        InterfaceC5306Mq interfaceC5306Mq = OLrzqt;
        if (interfaceC5306Mq != null) {
            InterfaceC5306Mq.ActionBar.w$default(interfaceC5306Mq, str, null, 2, null);
        }
    }

    @Override // o.InterfaceC5306Mq
    public void copydefault(@NotNull java.lang.String str, java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(str, "");
        InterfaceC5306Mq interfaceC5306Mq = OLrzqt;
        if (interfaceC5306Mq != null) {
            interfaceC5306Mq.copydefault(str, th);
        }
    }
}
