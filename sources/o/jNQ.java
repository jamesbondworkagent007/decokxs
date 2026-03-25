package o;

import com.okinc.business.market.data.model.CompactTagData;
import com.okinc.business.market.data.model.DevAnalysisCreatedTokens;
import com.okinc.business.market.data.model.DevAnalysisData;
import com.okinc.business.market.features.coindetail.domain.models.TokenRugType;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class jNQ {
    public static final jNR AEQbTJ(@NotNull DevAnalysisData devAnalysisData) {
        Intrinsics.checkNotNullParameter(devAnalysisData, "");
        return new jNR(new jNU(devAnalysisData.copydefault().copydefault(), devAnalysisData.copydefault().valueOf(), devAnalysisData.copydefault().AhwBna(), devAnalysisData.copydefault().KWHzl(), devAnalysisData.copydefault().gEmmrt(), devAnalysisData.copydefault().AEQbTJ(), devAnalysisData.copydefault().OLrzqt(), devAnalysisData.copydefault().EZpvd()), KWHzl(devAnalysisData.AEQbTJ()), devAnalysisData.copydefault().djBIcL(), devAnalysisData.copydefault().AYXKKw(), devAnalysisData.copydefault().isConnected());
    }

    public static final TokenRugType copydefault(DevAnalysisCreatedTokens devAnalysisCreatedTokens) {
        if (!devAnalysisCreatedTokens.djBIcL()) {
            return TokenRugType.NONE;
        }
        return TokenRugType.Companion.AEQbTJ(devAnalysisCreatedTokens.gEmmrt());
    }

    public static final java.util.List<jNX> KWHzl(@NotNull java.util.List<DevAnalysisCreatedTokens> list) {
        boolean z;
        boolean z2;
        boolean z3;
        Intrinsics.checkNotNullParameter(list, "");
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        for (DevAnalysisCreatedTokens devAnalysisCreatedTokens : list) {
            java.lang.String strValues = devAnalysisCreatedTokens.values();
            java.lang.String strAEQbTJ = devAnalysisCreatedTokens.AEQbTJ();
            java.lang.String strCopydefault = devAnalysisCreatedTokens.copydefault();
            java.lang.String strFetchVPNInfo = devAnalysisCreatedTokens.fetchVPNInfo();
            java.util.List<CompactTagData> listIsConnected = devAnalysisCreatedTokens.isConnected();
            if ((listIsConnected instanceof java.util.Collection) && listIsConnected.isEmpty()) {
                z = false;
            } else {
                java.util.Iterator<T> it = listIsConnected.iterator();
                while (it.hasNext()) {
                    if (Intrinsics.EZpvd((java.lang.Object) ((CompactTagData) it.next()).copydefault(), (java.lang.Object) "pumpfun")) {
                        z = true;
                        break;
                    }
                }
                z = false;
            }
            java.util.List<CompactTagData> listIsConnected2 = devAnalysisCreatedTokens.isConnected();
            if ((listIsConnected2 instanceof java.util.Collection) && listIsConnected2.isEmpty()) {
                z2 = false;
            } else {
                java.util.Iterator<T> it2 = listIsConnected2.iterator();
                while (it2.hasNext()) {
                    if (Intrinsics.EZpvd((java.lang.Object) ((CompactTagData) it2.next()).copydefault(), (java.lang.Object) "goldDog")) {
                        z2 = true;
                        break;
                    }
                }
                z2 = false;
            }
            java.lang.String strAkhnZx = devAnalysisCreatedTokens.AkhnZx();
            java.lang.String strDbNXlk = devAnalysisCreatedTokens.DbNXlk();
            TokenRugType tokenRugTypeCopydefault = copydefault(devAnalysisCreatedTokens);
            java.util.List<CompactTagData> listIsConnected3 = devAnalysisCreatedTokens.isConnected();
            if ((listIsConnected3 instanceof java.util.Collection) && listIsConnected3.isEmpty()) {
                z3 = false;
            } else {
                java.util.Iterator<T> it3 = listIsConnected3.iterator();
                while (it3.hasNext()) {
                    if (Intrinsics.EZpvd((java.lang.Object) ((CompactTagData) it3.next()).copydefault(), (java.lang.Object) "devHoldingStatus_sellAll")) {
                        z3 = true;
                        break;
                    }
                }
                z3 = false;
            }
            arrayList.add(new jNX(strValues, strAEQbTJ, strCopydefault, strFetchVPNInfo, z, z2, strAkhnZx, strDbNXlk, tokenRugTypeCopydefault, z3, devAnalysisCreatedTokens.EZpvd(), devAnalysisCreatedTokens.AYXKKw(), Intrinsics.EZpvd((java.lang.Object) devAnalysisCreatedTokens.valueOf(), (java.lang.Object) "1"), devAnalysisCreatedTokens.AhwBna(), devAnalysisCreatedTokens.OLrzqt(), devAnalysisCreatedTokens.fIwbmz()));
        }
        return arrayList;
    }
}
