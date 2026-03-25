package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.Ew, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5104Ew {
    public static final <T> void EZpvd(@NotNull EB eb, @NotNull C5101Et c5101Et, T t, @NotNull Function2<? super InterfaceC5106Ey, ? super T, Unit> function2) {
        Intrinsics.checkNotNullParameter(eb, "");
        Intrinsics.checkNotNullParameter(c5101Et, "");
        Intrinsics.checkNotNullParameter(function2, "");
        eb.EZpvd(c5101Et, new C5102Eu(t, function2));
    }

    public static final <T> InterfaceC5103Ev EZpvd(T t, @NotNull Function2<? super InterfaceC5106Ey, ? super T, Unit> function2) {
        Intrinsics.checkNotNullParameter(function2, "");
        return new C5102Eu(t, function2);
    }
}
