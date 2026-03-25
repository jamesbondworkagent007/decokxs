package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.Db, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C5057Db extends CY {
    public final java.io.Closeable EZpvd;

    public C5057Db(@NotNull java.io.Closeable closeable) {
        Intrinsics.checkNotNullParameter(closeable, "");
        this.EZpvd = closeable;
    }

    @Override // o.CY, o.InterfaceC5056Da
    public boolean AEQbTJ() throws java.io.IOException {
        boolean zAEQbTJ = super.AEQbTJ();
        if (zAEQbTJ) {
            this.EZpvd.close();
        }
        return zAEQbTJ;
    }
}
