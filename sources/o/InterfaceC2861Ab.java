package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.Ab, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC2861Ab {
    InterfaceC3179Ah AEQbTJ();

    InterfaceC5045Cp KWHzl(@NotNull InterfaceC5053Cx interfaceC5053Cx);

    java.lang.String copydefault();

    /* JADX INFO: renamed from: o.Ab$ActionBar */
    public static final class ActionBar {
        public static InterfaceC5045Cp OLrzqt(@NotNull InterfaceC2861Ab interfaceC2861Ab, @NotNull InterfaceC5053Cx interfaceC5053Cx) {
            Intrinsics.checkNotNullParameter(interfaceC5053Cx, "");
            return interfaceC5053Cx.EZpvd(interfaceC2861Ab.copydefault());
        }
    }
}
