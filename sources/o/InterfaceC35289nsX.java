package o;

import com.okinc.im.config.serviceprovider.GeneralAction;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nsX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public interface InterfaceC35289nsX {
    void AEQbTJ(@NotNull java.util.List<? extends GeneralAction> list);

    void KWHzl(@NotNull GeneralAction generalAction);

    /* JADX INFO: renamed from: o.nsX$ActionBar */
    /* JADX INFO: loaded from: classes15.dex */
    public static final class ActionBar {
        public static void OLrzqt(@NotNull InterfaceC35289nsX interfaceC35289nsX, @NotNull GeneralAction generalAction) {
            Intrinsics.checkNotNullParameter(generalAction, "");
            interfaceC35289nsX.AEQbTJ(C56402yEa.EZpvd(generalAction));
        }
    }
}
