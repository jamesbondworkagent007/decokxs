package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ugs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C49033ugs implements InterfaceC43234rlT {
    @Override // o.InterfaceC43234rlT
    public void OLrzqt(@NotNull android.content.Context context, @NotNull InterfaceC43233rlS interfaceC43233rlS, @NotNull java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(interfaceC43233rlS, "");
        Intrinsics.checkNotNullParameter(map, "");
        if (C33569myt.OLrzqt(context) == null) {
            pUU.copydefault("ShareDeepLinkHandler", "error:activity=null");
        } else if (Intrinsics.EZpvd(interfaceC43233rlS, C49035ugu.EZpvd)) {
            C55326xho.toast$default("unsupport deeplink,please use jsbridge of share", (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
        } else {
            C55326xho.toast$default("unknown deeplink", (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
        }
    }
}
