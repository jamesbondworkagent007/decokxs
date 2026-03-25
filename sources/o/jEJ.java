package o;

import androidx.camera.video.AudioStats;
import com.okinc.business.market.common.constants.StringBooleanType;
import com.okinc.business.market.data.model.CompactTagData;
import com.okinc.business.market.data.model.TagExtraData;
import com.okinc.business.market.data.model.TrackingAddressData;
import com.okinc.business.market.features.address_tracker.domain.TrackingAddressAlias;
import com.okinc.localization.util.format.DisplaySign;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Marker;

/* JADX INFO: loaded from: classes6.dex */
public final class jEJ {
    public static final jEJ copydefault = new jEJ();

    private jEJ() {
    }

    public static /* synthetic */ jEP mapToUIModel$default(jEJ jej, TrackingAddressData trackingAddressData, boolean z, java.util.Map map, java.util.Map map2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return jej.OLrzqt(trackingAddressData, z, map, map2);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x015b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final jEP OLrzqt(@NotNull TrackingAddressData trackingAddressData, boolean z, @NotNull java.util.Map<java.lang.String, java.lang.String> map, @NotNull java.util.Map<java.lang.String, TrackingAddressAlias> map2) {
        java.lang.String address$default;
        TagExtraData tagExtraDataAEQbTJ;
        java.lang.String strAhwBna;
        java.lang.String str;
        TagExtraData tagExtraDataAEQbTJ2;
        java.lang.String strDjBIcL;
        TagExtraData tagExtraDataAEQbTJ3;
        TagExtraData tagExtraDataAEQbTJ4;
        java.lang.String strGEmmrt;
        Intrinsics.checkNotNullParameter(trackingAddressData, "");
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(map2, "");
        double dAEQbTJ = C33129mqd.AEQbTJ(trackingAddressData.valueOf());
        int i = dAEQbTJ > AudioStats.AUDIO_AMPLITUDE_NONE ? 1 : dAEQbTJ < AudioStats.AUDIO_AMPLITUDE_NONE ? -1 : 0;
        java.lang.String strCopydefault = copydefault(dAEQbTJ);
        java.lang.String strKWHzl = KWHzl(trackingAddressData.fetchVPNInfo());
        java.lang.String strIsConnected = trackingAddressData.isConnected();
        java.lang.String address$default2 = C25352ivB.formatAddress$default(trackingAddressData.isConnected(), 6, 4, null, 4, null);
        java.lang.String strAEQbTJ = trackingAddressData.AEQbTJ();
        StringBooleanType stringBooleanTypeGEmmrt = trackingAddressData.gEmmrt();
        StringBooleanType stringBooleanType = StringBooleanType.TRUE;
        if (stringBooleanTypeGEmmrt == stringBooleanType && (!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) trackingAddressData.AEQbTJ()))) {
            address$default = trackingAddressData.AEQbTJ();
        } else {
            CompactTagData compactTagData = (CompactTagData) CollectionsKt___CollectionsKt.firstOrNull(trackingAddressData.AhwBna());
            if (compactTagData != null && (tagExtraDataAEQbTJ = compactTagData.AEQbTJ()) != null && (strAhwBna = tagExtraDataAEQbTJ.AhwBna()) != null && C33129mqd.OLrzqt((java.lang.CharSequence) strAhwBna)) {
                CompactTagData compactTagData2 = (CompactTagData) CollectionsKt___CollectionsKt.firstOrNull(trackingAddressData.AhwBna());
                address$default = (compactTagData2 == null || (tagExtraDataAEQbTJ2 = compactTagData2.AEQbTJ()) == null) ? null : tagExtraDataAEQbTJ2.AhwBna();
                if (address$default == null) {
                    str = "";
                }
                CompactTagData compactTagData3 = (CompactTagData) CollectionsKt___CollectionsKt.firstOrNull(trackingAddressData.AhwBna());
                java.lang.String str2 = (compactTagData3 != null || (tagExtraDataAEQbTJ4 = compactTagData3.AEQbTJ()) == null || (strGEmmrt = tagExtraDataAEQbTJ4.gEmmrt()) == null) ? "" : strGEmmrt;
                CompactTagData compactTagData4 = (CompactTagData) CollectionsKt___CollectionsKt.firstOrNull(trackingAddressData.AhwBna());
                java.lang.String strDjBIcL2 = (compactTagData4 != null || (tagExtraDataAEQbTJ3 = compactTagData4.AEQbTJ()) == null) ? null : tagExtraDataAEQbTJ3.djBIcL();
                java.lang.String strEZpvd = trackingAddressData.AYXKKw() > 0 ? "--" : C25322iuY.OLrzqt.EZpvd(java.lang.String.valueOf(trackingAddressData.AYXKKw()));
                java.lang.String strKWHzl2 = trackingAddressData.copydefault().KWHzl();
                strDjBIcL = trackingAddressData.djBIcL();
                if (strDjBIcL.length() == 0) {
                    strDjBIcL = "0";
                }
                java.lang.String str3 = strDjBIcL;
                java.lang.String strValueOf = trackingAddressData.valueOf();
                java.lang.String strFetchVPNInfo = trackingAddressData.fetchVPNInfo();
                boolean z2 = trackingAddressData.EZpvd() != stringBooleanType;
                java.lang.String orDefault = map.getOrDefault(trackingAddressData.isConnected(), "");
                TrackingAddressAlias trackingAddressAlias = map2.get(trackingAddressData.isConnected());
                return new jEP(strIsConnected, address$default2, strAEQbTJ, str, str2, strDjBIcL2, strEZpvd, strKWHzl2, str3, strValueOf, strCopydefault, strFetchVPNInfo, strKWHzl, z2, false, i, z, orDefault, trackingAddressAlias == null ? trackingAddressAlias.getAddressAliasColorHex() : null);
            }
            address$default = C25352ivB.formatAddress$default(trackingAddressData.isConnected(), 6, 4, null, 4, null);
        }
        str = address$default;
        CompactTagData compactTagData32 = (CompactTagData) CollectionsKt___CollectionsKt.firstOrNull(trackingAddressData.AhwBna());
        if (compactTagData32 != null) {
        }
        CompactTagData compactTagData42 = (CompactTagData) CollectionsKt___CollectionsKt.firstOrNull(trackingAddressData.AhwBna());
        if (compactTagData42 != null) {
        }
        java.lang.String strEZpvd2 = trackingAddressData.AYXKKw() > 0 ? "--" : C25322iuY.OLrzqt.EZpvd(java.lang.String.valueOf(trackingAddressData.AYXKKw()));
        java.lang.String strKWHzl22 = trackingAddressData.copydefault().KWHzl();
        strDjBIcL = trackingAddressData.djBIcL();
        if (strDjBIcL.length() == 0) {
        }
        java.lang.String str32 = strDjBIcL;
        java.lang.String strValueOf2 = trackingAddressData.valueOf();
        java.lang.String strFetchVPNInfo2 = trackingAddressData.fetchVPNInfo();
        if (trackingAddressData.EZpvd() != stringBooleanType) {
        }
        java.lang.String orDefault2 = map.getOrDefault(trackingAddressData.isConnected(), "");
        TrackingAddressAlias trackingAddressAlias2 = map2.get(trackingAddressData.isConnected());
        return new jEP(strIsConnected, address$default2, strAEQbTJ, str, str2, strDjBIcL2, strEZpvd2, strKWHzl22, str32, strValueOf2, strCopydefault, strFetchVPNInfo2, strKWHzl, z2, false, i, z, orDefault2, trackingAddressAlias2 == null ? trackingAddressAlias2.getAddressAliasColorHex() : null);
    }

    public static /* synthetic */ java.util.List mapToUIModelList$default(jEJ jej, java.util.List list, boolean z, java.util.Map map, java.util.Map map2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return jej.EZpvd(list, z, map, map2);
    }

    public final java.lang.String copydefault(double d) {
        return C23272hvB.formatScientificCurrency$default(C23272hvB.KWHzl, java.lang.String.valueOf(d), true, null, false, false, false, false, DisplaySign.EXCEPT_ZERO, false, false, 446, null);
    }

    public final java.lang.String KWHzl(java.lang.String str) {
        try {
            java.lang.Double dAuCTel = C59443zhD.AuCTel(str);
            double dDoubleValue = dAuCTel != null ? dAuCTel.doubleValue() : 0.0d;
            java.lang.String str2 = dDoubleValue >= AudioStats.AUDIO_AMPLITUDE_NONE ? Marker.ANY_NON_NULL_MARKER : "";
            C56529yIt c56529yIt = C56529yIt.KWHzl;
            java.lang.String str3 = java.lang.String.format("%.2f", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Double.valueOf(dDoubleValue)}, 1));
            Intrinsics.checkNotNullExpressionValue(str3, "");
            return str2 + str3 + "%";
        } catch (java.lang.Exception unused) {
            return str;
        }
    }

    public final java.util.List<jEP> EZpvd(@NotNull java.util.List<TrackingAddressData> list, boolean z, @NotNull java.util.Map<java.lang.String, java.lang.String> map, @NotNull java.util.Map<java.lang.String, TrackingAddressAlias> map2) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(map2, "");
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(copydefault.OLrzqt((TrackingAddressData) it.next(), z, map, map2));
        }
        return arrayList;
    }
}
