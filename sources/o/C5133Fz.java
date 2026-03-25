package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.Fz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C5133Fz {
    public static final void AEQbTJ(@NotNull InterfaceC5132Fy interfaceC5132Fy, @NotNull java.lang.Number number) {
        Intrinsics.checkNotNullParameter(interfaceC5132Fy, "");
        Intrinsics.checkNotNullParameter(number, "");
        interfaceC5132Fy.KWHzl(number.toString());
    }

    public static final InterfaceC5132Fy AEQbTJ(boolean z) {
        return new FQ(z);
    }

    public static /* synthetic */ InterfaceC5132Fy xmlStreamWriter$default(boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return AEQbTJ(z);
    }
}
