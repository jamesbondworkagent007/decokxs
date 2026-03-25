package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class TruncateAt {
    public static final InterfaceC52805wZ KWHzl(@NotNull InterfaceC52778wY interfaceC52778wY) {
        Intrinsics.checkNotNullParameter(interfaceC52778wY, "");
        return interfaceC52778wY instanceof Spannable ? interfaceC52778wY : new Spannable(interfaceC52778wY);
    }
}
