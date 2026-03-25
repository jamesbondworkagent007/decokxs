package o;

import com.okinc.core.util.SPUtils;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.arY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC7846arY<T> implements yIP<java.lang.Object, T> {
    public final T AEQbTJ;
    public final java.lang.String EZpvd;
    public final java.lang.String KWHzl;

    public abstract T EZpvd(@NotNull java.lang.String str, T t);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.EZpvd;
    }

    public AbstractC7846arY(@NotNull java.lang.String str, @NotNull java.lang.String str2, T t) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.EZpvd = str;
        this.KWHzl = str2;
        this.AEQbTJ = t;
    }

    public final void AEQbTJ(@NotNull java.lang.String str, T t) {
        Intrinsics.checkNotNullParameter(str, "");
        SPUtils.put(str, t, this.EZpvd);
    }

    @Override // o.yIP, o.yIO
    public T getValue(@NotNull java.lang.Object obj, @NotNull yJA<?> yja) {
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(yja, "");
        return EZpvd(this.KWHzl, this.AEQbTJ);
    }

    @Override // o.yIP
    public void KWHzl(@NotNull java.lang.Object obj, @NotNull yJA<?> yja, T t) {
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(yja, "");
        AEQbTJ(this.KWHzl, t);
    }
}
