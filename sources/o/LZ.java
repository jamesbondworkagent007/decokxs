package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class LZ implements InterfaceC5293Md {
    public final java.util.Map<?, ?> copydefault;

    public LZ(@NotNull java.util.Map<?, ?> map) {
        Intrinsics.checkNotNullParameter(map, "");
        this.copydefault = map;
    }

    @Override // o.InterfaceC5293Md
    public java.lang.Object AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return this.copydefault.get(str);
    }
}
