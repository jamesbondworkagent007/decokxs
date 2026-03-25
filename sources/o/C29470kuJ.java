package o;

import com.okinc.business.market.data.model.smart_money.SmartMoneyAddressData;
import com.okinc.business.market.features.address_tracker.domain.TrackingAddressAlias;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kuJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C29470kuJ {
    @yCM
    public C29470kuJ() {
    }

    public final C29626kxG AEQbTJ(@NotNull SmartMoneyAddressData smartMoneyAddressData, @NotNull java.lang.String str, @NotNull java.util.Map<java.lang.String, java.lang.String> map, @NotNull java.util.Map<java.lang.String, TrackingAddressAlias> map2) {
        java.lang.String strAEQbTJ;
        Intrinsics.checkNotNullParameter(smartMoneyAddressData, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(map2, "");
        boolean zEZpvd = smartMoneyAddressData.KWHzl().EZpvd();
        java.lang.String strKWHzl = smartMoneyAddressData.KWHzl().KWHzl();
        if (C33129mqd.OLrzqt((java.lang.CharSequence) smartMoneyAddressData.copydefault())) {
            strAEQbTJ = smartMoneyAddressData.copydefault();
        } else {
            strAEQbTJ = smartMoneyAddressData.KWHzl().EZpvd() ? smartMoneyAddressData.KWHzl().AEQbTJ() : C25352ivB.formatAddress$default(smartMoneyAddressData.OLrzqt(), 4, 4, null, 4, null);
        }
        java.lang.String strOLrzqt = smartMoneyAddressData.OLrzqt();
        java.lang.String strAhwBna = smartMoneyAddressData.AhwBna();
        java.lang.String strEZpvd = smartMoneyAddressData.EZpvd();
        java.lang.String strAEQbTJ2 = smartMoneyAddressData.AEQbTJ();
        java.lang.String orDefault = map.getOrDefault(smartMoneyAddressData.OLrzqt(), "");
        TrackingAddressAlias trackingAddressAlias = map2.get(smartMoneyAddressData.OLrzqt());
        return new C29626kxG(zEZpvd, strKWHzl, strAEQbTJ, strOLrzqt, strAhwBna, strEZpvd, strAEQbTJ2, str, orDefault, trackingAddressAlias != null ? trackingAddressAlias.getAddressAliasColorHex() : null);
    }
}
