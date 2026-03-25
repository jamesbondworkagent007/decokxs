package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.roT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C43393roT {
    public static final <T> T EZpvd(@NotNull InterfaceC56551yJo<T> interfaceC56551yJo, InterfaceC43391roR interfaceC43391roR) {
        Intrinsics.checkNotNullParameter(interfaceC56551yJo, "");
        C43392roS c43392roS = C43392roS.EZpvd;
        if (interfaceC43391roR == null) {
            interfaceC43391roR = C43280rmM.Companion.copydefault();
        }
        return (T) c43392roS.OLrzqt(interfaceC56551yJo, interfaceC43391roR);
    }

    public static /* synthetic */ java.lang.Object httpService$default(InterfaceC56551yJo interfaceC56551yJo, InterfaceC43391roR interfaceC43391roR, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            interfaceC43391roR = null;
        }
        return EZpvd(interfaceC56551yJo, interfaceC43391roR);
    }
}
