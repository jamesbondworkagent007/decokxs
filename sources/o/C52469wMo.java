package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wMo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C52469wMo {
    public final android.content.Context EZpvd;
    public final java.lang.String KWHzl;

    public C52469wMo(@NotNull android.content.Context context, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.EZpvd = context;
        this.KWHzl = str;
    }

    public final AbstractC51292vkK AEQbTJ() {
        return Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) "smart_portfolio") ? new C52472wMr(this.EZpvd) : new C52472wMr(this.EZpvd);
    }
}
