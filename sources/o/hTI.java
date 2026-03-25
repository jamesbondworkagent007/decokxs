package o;

import com.okinc.business.dexui.main.shared.model.TradeMode;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class hTI {
    public static final TradeMode OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "cefi_mode") ? TradeMode.Advanced : TradeMode.SwapMarket;
    }
}
