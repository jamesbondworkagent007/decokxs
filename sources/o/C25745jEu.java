package o;

import androidx.camera.video.AudioStats;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.okinc.business.market.data.model.CompactTagData;
import com.okinc.business.market.data.model.TagExtraData;
import com.okinc.business.market.data.model.common.ProtocolInfoData;
import com.okinc.business.market.features.address_tracker.domain.TrackingAddressAlias;
import com.okinc.business.market.features.address_tracker_sa.ui.tracker.model.TrackerActivityResponse;
import java.math.RoundingMode;
import java.text.NumberFormat;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Marker;

/* JADX INFO: renamed from: o.jEu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C25745jEu {
    public static final C25745jEu AEQbTJ = new C25745jEu();
    public static final NumberFormat OLrzqt;
    public static final int copydefault;

    private C25745jEu() {
    }

    static {
        NumberFormat numberInstance = NumberFormat.getNumberInstance(java.util.Locale.getDefault());
        OLrzqt = numberInstance;
        numberInstance.setMaximumFractionDigits(2);
        copydefault = 8;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0164  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final jEB OLrzqt(@NotNull TrackerActivityResponse trackerActivityResponse, boolean z, @NotNull java.util.Map<java.lang.String, java.lang.String> map, @NotNull java.util.Map<java.lang.String, TrackingAddressAlias> map2, @NotNull java.util.List<ProtocolInfoData> list) {
        TagExtraData tagExtraDataAEQbTJ;
        java.lang.String strAhwBna;
        TagExtraData tagExtraDataAEQbTJ2;
        CompactTagData compactTagData;
        ProtocolInfoData protocolInfoData;
        TagExtraData tagExtraDataAEQbTJ3;
        java.util.List<java.lang.String> protocolGradientColor;
        java.lang.String str;
        java.util.List<java.lang.String> protocolGradientColor2;
        java.lang.String strCopydefault;
        java.lang.Object next;
        Intrinsics.checkNotNullParameter(trackerActivityResponse, "");
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(map2, "");
        Intrinsics.checkNotNullParameter(list, "");
        TrackingAddressAlias orDefault = map2.getOrDefault(trackerActivityResponse.iwGUEr(), null);
        java.lang.String addressAlias = orDefault != null ? orDefault.getAddressAlias() : null;
        if (C33129mqd.OLrzqt((java.lang.CharSequence) trackerActivityResponse.KWHzl())) {
            addressAlias = trackerActivityResponse.KWHzl();
        } else {
            if (!C33129mqd.OLrzqt((java.lang.CharSequence) addressAlias)) {
                CompactTagData compactTagData2 = (CompactTagData) CollectionsKt___CollectionsKt.firstOrNull(trackerActivityResponse.values());
                if (compactTagData2 != null && (tagExtraDataAEQbTJ = compactTagData2.AEQbTJ()) != null && (strAhwBna = tagExtraDataAEQbTJ.AhwBna()) != null && C33129mqd.OLrzqt((java.lang.CharSequence) strAhwBna)) {
                    CompactTagData compactTagData3 = (CompactTagData) CollectionsKt___CollectionsKt.firstOrNull(trackerActivityResponse.values());
                    addressAlias = (compactTagData3 == null || (tagExtraDataAEQbTJ2 = compactTagData3.AEQbTJ()) == null) ? null : tagExtraDataAEQbTJ2.AhwBna();
                    if (addressAlias == null) {
                        addressAlias = "";
                    }
                } else {
                    addressAlias = copydefault(trackerActivityResponse.iwGUEr());
                }
            }
            compactTagData = (CompactTagData) CollectionsKt___CollectionsKt.firstOrNull(trackerActivityResponse.AuCTel());
            if (compactTagData != null || (strCopydefault = compactTagData.copydefault()) == null) {
                protocolInfoData = null;
            } else {
                java.util.Iterator<T> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (Intrinsics.EZpvd((java.lang.Object) ((ProtocolInfoData) next).getProtocolTagKey(), (java.lang.Object) strCopydefault)) {
                        break;
                    }
                }
                protocolInfoData = (ProtocolInfoData) next;
            }
            int iKWHzl = C31256lqb.KWHzl((protocolInfoData != null || (protocolGradientColor2 = protocolInfoData.getProtocolGradientColor()) == null) ? null : (java.lang.String) CollectionsKt___CollectionsKt.AkhnZx(protocolGradientColor2, 0), C25382ivf.KWHzl(C52761wXj.Activity.QwvEab));
            int iKWHzl2 = (protocolInfoData != null || (protocolGradientColor = protocolInfoData.getProtocolGradientColor()) == null || (str = (java.lang.String) CollectionsKt___CollectionsKt.AkhnZx(protocolGradientColor, 1)) == null) ? iKWHzl : C31256lqb.KWHzl(str, C25382ivf.KWHzl(C52761wXj.Activity.QwvEab));
            CompactTagData compactTagData4 = (CompactTagData) CollectionsKt___CollectionsKt.firstOrNull(trackerActivityResponse.values());
            java.lang.String strGEmmrt = (compactTagData4 != null || (tagExtraDataAEQbTJ3 = compactTagData4.AEQbTJ()) == null) ? null : tagExtraDataAEQbTJ3.gEmmrt();
            java.lang.String str2 = strGEmmrt != null ? "" : strGEmmrt;
            java.lang.String strIwGUEr = trackerActivityResponse.iwGUEr();
            java.lang.String str3 = addressAlias != null ? "" : addressAlias;
            long jFJNWhG = trackerActivityResponse.fJNWhG();
            TrackingAddressAlias trackingAddressAlias = map2.get(trackerActivityResponse.iwGUEr());
            java.lang.String addressAliasColorHex = trackingAddressAlias == null ? trackingAddressAlias.getAddressAliasColorHex() : null;
            java.lang.String strAkhnZx = trackerActivityResponse.AkhnZx();
            int iUzCIH = trackerActivityResponse.uzCIH();
            java.lang.String strCopydefault2 = trackerActivityResponse.copydefault();
            java.lang.String strEjfBZ = trackerActivityResponse.ejfBZ();
            java.lang.String strFARcdN = trackerActivityResponse.fARcdN();
            java.lang.String strFIwbmz = trackerActivityResponse.fIwbmz();
            java.lang.String strAEQbTJ = trackerActivityResponse.AEQbTJ();
            java.lang.String orDefault2 = map.getOrDefault(addressAlias, "");
            java.lang.String protocolLogo = protocolInfoData != null ? protocolInfoData.getProtocolLogo() : null;
            return new jEB(str2, strIwGUEr, str3, jFJNWhG, addressAliasColorHex, strAkhnZx, iUzCIH, strCopydefault2, strEjfBZ, strFARcdN, strFIwbmz, strAEQbTJ, orDefault2, protocolLogo != null ? "" : protocolLogo, iKWHzl, iKWHzl2, trackerActivityResponse.gEmmrt(), null, OLrzqt(trackerActivityResponse), AEQbTJ(trackerActivityResponse), true, z, trackerActivityResponse.getFieldNames(), trackerActivityResponse.fetchVPNInfo(), trackerActivityResponse.isConnected(), trackerActivityResponse.OLrzqt(), trackerActivityResponse.AkhnZx(), trackerActivityResponse.DbNXlk(), trackerActivityResponse.getFieldNames(), trackerActivityResponse.djBIcL(), trackerActivityResponse.valueOf(), 131072, null);
        }
        compactTagData = (CompactTagData) CollectionsKt___CollectionsKt.firstOrNull(trackerActivityResponse.AuCTel());
        if (compactTagData != null) {
            protocolInfoData = null;
        }
        int iKWHzl3 = C31256lqb.KWHzl((protocolInfoData != null || (protocolGradientColor2 = protocolInfoData.getProtocolGradientColor()) == null) ? null : (java.lang.String) CollectionsKt___CollectionsKt.AkhnZx(protocolGradientColor2, 0), C25382ivf.KWHzl(C52761wXj.Activity.QwvEab));
        if (protocolInfoData != null) {
        }
        CompactTagData compactTagData42 = (CompactTagData) CollectionsKt___CollectionsKt.firstOrNull(trackerActivityResponse.values());
        if (compactTagData42 != null) {
        }
        if (strGEmmrt != null) {
        }
        java.lang.String strIwGUEr2 = trackerActivityResponse.iwGUEr();
        if (addressAlias != null) {
        }
        long jFJNWhG2 = trackerActivityResponse.fJNWhG();
        TrackingAddressAlias trackingAddressAlias2 = map2.get(trackerActivityResponse.iwGUEr());
        if (trackingAddressAlias2 == null) {
        }
        java.lang.String strAkhnZx2 = trackerActivityResponse.AkhnZx();
        int iUzCIH2 = trackerActivityResponse.uzCIH();
        java.lang.String strCopydefault22 = trackerActivityResponse.copydefault();
        java.lang.String strEjfBZ2 = trackerActivityResponse.ejfBZ();
        java.lang.String strFARcdN2 = trackerActivityResponse.fARcdN();
        java.lang.String strFIwbmz2 = trackerActivityResponse.fIwbmz();
        java.lang.String strAEQbTJ2 = trackerActivityResponse.AEQbTJ();
        java.lang.String orDefault22 = map.getOrDefault(addressAlias, "");
        if (protocolInfoData != null) {
        }
        return new jEB(str2, strIwGUEr2, str3, jFJNWhG2, addressAliasColorHex, strAkhnZx2, iUzCIH2, strCopydefault22, strEjfBZ2, strFARcdN2, strFIwbmz2, strAEQbTJ2, orDefault22, protocolLogo != null ? "" : protocolLogo, iKWHzl3, iKWHzl2, trackerActivityResponse.gEmmrt(), null, OLrzqt(trackerActivityResponse), AEQbTJ(trackerActivityResponse), true, z, trackerActivityResponse.getFieldNames(), trackerActivityResponse.fetchVPNInfo(), trackerActivityResponse.isConnected(), trackerActivityResponse.OLrzqt(), trackerActivityResponse.AkhnZx(), trackerActivityResponse.DbNXlk(), trackerActivityResponse.getFieldNames(), trackerActivityResponse.djBIcL(), trackerActivityResponse.valueOf(), 131072, null);
    }

    public final java.lang.String copydefault(java.lang.String str) {
        if (str.length() <= 10) {
            return str;
        }
        return C59454zhO.AkhnZx(str, 6) + "..." + C59454zhO.isConnected(str, 4);
    }

    public final java.lang.String OLrzqt(TrackerActivityResponse trackerActivityResponse) {
        boolean zCopydefault = C27599jyI.copydefault(trackerActivityResponse.uzCIH());
        java.lang.String str = Marker.ANY_NON_NULL_MARKER;
        if (zCopydefault) {
            if (C33129mqd.AEQbTJ(trackerActivityResponse.hDKMBd()) <= AudioStats.AUDIO_AMPLITUDE_NONE) {
                str = "";
            }
            java.lang.String scientificCurrency$default = C23272hvB.formatScientificCurrency$default(C23272hvB.KWHzl, trackerActivityResponse.hDKMBd(), true, RoundingMode.DOWN, false, false, false, false, null, false, false, TypedValues.PositionType.TYPE_CURVE_FIT, null);
            C23271hvA c23271hvA = C23271hvA.copydefault;
            java.lang.String newProxyInstance = trackerActivityResponse.getNewProxyInstance();
            if (newProxyInstance.length() == 0) {
                newProxyInstance = "0";
            }
            return str + scientificCurrency$default + " (" + C23271hvA.dexFormatPercentage$default(c23271hvA, newProxyInstance, 0, null, null, false, 30, null) + ")";
        }
        if (C33129mqd.AEQbTJ(trackerActivityResponse.AhwBna()) <= AudioStats.AUDIO_AMPLITUDE_NONE) {
            str = "";
        }
        java.lang.String scientificCurrency$default2 = C23272hvB.formatScientificCurrency$default(C23272hvB.KWHzl, trackerActivityResponse.AhwBna(), true, RoundingMode.DOWN, false, false, false, false, null, false, false, TypedValues.PositionType.TYPE_CURVE_FIT, null);
        C23271hvA c23271hvA2 = C23271hvA.copydefault;
        java.lang.String strAYXKKw = trackerActivityResponse.AYXKKw();
        if (strAYXKKw.length() == 0) {
            strAYXKKw = "0";
        }
        return str + scientificCurrency$default2 + " (" + C23271hvA.dexFormatPercentage$default(c23271hvA2, strAYXKKw, 0, null, null, false, 30, null) + ")";
    }

    public final int AEQbTJ(TrackerActivityResponse trackerActivityResponse) {
        java.lang.String strAhwBna;
        if (C27599jyI.copydefault(trackerActivityResponse.uzCIH())) {
            strAhwBna = trackerActivityResponse.hDKMBd();
        } else {
            strAhwBna = trackerActivityResponse.AhwBna();
        }
        if (C33129mqd.AEQbTJ(strAhwBna) > AudioStats.AUDIO_AMPLITUDE_NONE) {
            return 1;
        }
        return C33129mqd.AEQbTJ(strAhwBna) < AudioStats.AUDIO_AMPLITUDE_NONE ? -1 : 0;
    }
}
