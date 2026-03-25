package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oYh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C36344oYh {
    public android.os.Handler KWHzl;
    public InterfaceC36340oYd OLrzqt;

    public final void OLrzqt() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
    }

    public C36344oYh(@NotNull android.content.Context context, @NotNull InterfaceC36340oYd interfaceC36340oYd) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(interfaceC36340oYd, "");
        this.KWHzl = new android.os.Handler(android.os.Looper.getMainLooper());
        this.OLrzqt = interfaceC36340oYd;
        copydefault(context);
    }

    public final void EZpvd() {
        this.KWHzl.post(new java.lang.Runnable() { // from class: o.oYj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C36344oYh.EZpvd(this.AEQbTJ);
            }
        });
    }

    public static final void EZpvd(C36344oYh c36344oYh) {
        InterfaceC36340oYd interfaceC36340oYd = c36344oYh.OLrzqt;
        if (interfaceC36340oYd != null) {
            interfaceC36340oYd.KWHzl(null);
        }
    }
}
