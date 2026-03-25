package o;

import com.okinc.business.dex.trade.copytrading.edit.data.model.SellSettings;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gSl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C19872gSl {
    public static final boolean copydefault(@NotNull SellSettings sellSettings) {
        Intrinsics.checkNotNullParameter(sellSettings, "");
        return sellSettings.getCopySell() || Intrinsics.EZpvd((java.lang.Object) sellSettings.getCopySellType(), (java.lang.Object) "1") || Intrinsics.EZpvd((java.lang.Object) sellSettings.getCopySellType(), (java.lang.Object) "3");
    }

    public static final boolean EZpvd(@NotNull SellSettings sellSettings) {
        Intrinsics.checkNotNullParameter(sellSettings, "");
        return Intrinsics.EZpvd((java.lang.Object) sellSettings.getCopySellType(), (java.lang.Object) "2") || Intrinsics.EZpvd((java.lang.Object) sellSettings.getCopySellType(), (java.lang.Object) "3");
    }
}
