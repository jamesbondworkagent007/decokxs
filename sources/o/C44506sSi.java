package o;

import com.okinc.core.util.SPUtils;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.sSi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C44506sSi {
    public final C44518sSu KWHzl;

    @yCM
    public C44506sSi(@NotNull C44518sSu c44518sSu) {
        Intrinsics.checkNotNullParameter(c44518sSu, "");
        this.KWHzl = c44518sSu;
    }

    public final boolean copydefault() {
        java.lang.Long l = SPUtils.getLong(this.KWHzl.copydefault(), 0L);
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        Intrinsics.copydefault(l);
        return java.lang.Math.abs(jCurrentTimeMillis - l.longValue()) <= ((long) 86400000);
    }
}
