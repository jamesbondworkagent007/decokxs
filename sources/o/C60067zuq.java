package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zuq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C60067zuq {
    public static final java.util.Map<InterfaceC56551yJo<?>, java.lang.String> KWHzl = C60071zuu.OLrzqt.copydefault();

    public static final java.lang.String KWHzl(@NotNull InterfaceC56551yJo<?> interfaceC56551yJo) {
        Intrinsics.checkNotNullParameter(interfaceC56551yJo, "");
        java.lang.String str = KWHzl.get(interfaceC56551yJo);
        return str == null ? copydefault(interfaceC56551yJo) : str;
    }

    public static final java.lang.String copydefault(@NotNull InterfaceC56551yJo<?> interfaceC56551yJo) {
        Intrinsics.checkNotNullParameter(interfaceC56551yJo, "");
        java.lang.String strEZpvd = C60071zuu.OLrzqt.EZpvd(interfaceC56551yJo);
        KWHzl.put(interfaceC56551yJo, strEZpvd);
        return strEZpvd;
    }
}
