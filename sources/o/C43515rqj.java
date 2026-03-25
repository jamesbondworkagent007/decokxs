package o;

import com.okinc.nft.nftmarket.NFTBridge;
import com.okinc.nft.nftmarket.NFTDeepLinkBridge;
import com.okinc.wallet.api.bean.WalletScanInformationBean;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import o.C43471rps;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rqj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C43515rqj extends AbstractC43215rlA implements InterfaceC9773bbs {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC9773bbs
    public int KWHzl() {
        return C43471rps.ActionBar.OLrzqt;
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Ljava/lang/String;)Landroidx/fragment/app/Fragment; */
    @Override // o.InterfaceC9773bbs
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public AbstractC32996moC AEQbTJ(java.lang.String str) {
        return C43555rrW.Companion.KWHzl(str);
    }

    @Override // o.InterfaceC9773bbs
    public void KWHzl(@NotNull android.content.Context context, java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
        Intrinsics.checkNotNullParameter(context, "");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (map != null && !map.isEmpty()) {
            linkedHashMap.putAll(map);
        }
        linkedHashMap.put("to", "NFTWalletToCoinDetailVC");
        linkedHashMap.put("appearance", "alternativeweb3");
        C43056riA.AEQbTJ.copydefault(context, "okluanft", "/nftRouter", linkedHashMap);
    }

    @Override // o.InterfaceC9773bbs
    public void copydefault(@NotNull android.content.Context context, @NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        C43514rqi.EZpvd.AEQbTJ(context, str, str2);
    }

    @Override // o.InterfaceC9773bbs
    public void copydefault(@NotNull android.content.Context context, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, boolean z) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        java.util.HashMap map = new java.util.HashMap();
        map.put("project", str);
        map.put("projectName", str2);
        map.put("isShowOwned", java.lang.String.valueOf(z));
        map.put("chainId", str3);
        map.put("to", "NFTCollectionsVC");
        map.put("appearance", "alternativeweb3");
        C43056riA.AEQbTJ.copydefault(context, "okluanft", "/mlnRouter", map);
    }

    @Override // o.InterfaceC9773bbs
    public void KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        NFTDeepLinkBridge.copydefault(str);
    }

    @Override // o.InterfaceC9773bbs
    public void EZpvd() {
        try {
            NFTBridge.sContainer = null;
            C7455akE.OLrzqt();
            C7323ahf.AYXKKw().copydefault();
        } catch (java.lang.Exception unused) {
        }
    }

    @Override // o.InterfaceC9773bbs
    public void copydefault(@NotNull WalletScanInformationBean walletScanInformationBean) {
        Intrinsics.checkNotNullParameter(walletScanInformationBean, "");
        InterfaceC7298ahG interfaceC7298ahGKWHzl = C7323ahf.KWHzl();
        java.lang.String address = walletScanInformationBean.getAddress();
        if (address == null || address.length() == 0) {
            interfaceC7298ahGKWHzl.AEQbTJ("OKTQRCodeInvalidAddress", null, null);
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("qrAddressStr", walletScanInformationBean.getAddress());
        interfaceC7298ahGKWHzl.AEQbTJ("OKNFTGetQRCodeString", null, linkedHashMap);
    }

    @Override // o.InterfaceC9773bbs
    public void KWHzl(@NotNull android.content.Context context, @NotNull android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        java.util.HashMap map = new java.util.HashMap();
        java.util.Set<java.lang.String> setKeySet = bundle.keySet();
        Intrinsics.checkNotNullExpressionValue(setKeySet, "");
        for (java.lang.String str : setKeySet) {
            java.lang.Object obj = bundle.get(str);
            if (obj != null) {
                map.put(str, obj);
            }
        }
        map.put("appearance", "alternativeweb3");
        C43056riA.AEQbTJ.copydefault(context, "okluanft", "/nft", map);
    }

    @Override // o.InterfaceC9773bbs
    public java.lang.Object OLrzqt(@NotNull Continuation<? super java.lang.Boolean> continuation) {
        return C43651rtM.AEQbTJ(continuation);
    }

    @Override // o.InterfaceC9773bbs
    public java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull android.content.Context context, @NotNull Continuation<? super java.lang.Boolean> continuation) {
        return C43651rtM.AEQbTJ(continuation);
    }

    @Override // o.InterfaceC9773bbs
    public boolean EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return kNT.AEQbTJ(str);
    }

    @Override // o.InterfaceC9773bbs
    public void OLrzqt(@NotNull android.content.Context context, java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
        Intrinsics.checkNotNullParameter(context, "");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("to", "NFTWalletGiveawayHubVC");
        if (map != null) {
            linkedHashMap.putAll(map);
        }
        linkedHashMap.put("appearance", "alternativeweb3");
        C43056riA.AEQbTJ.copydefault(context, "okluanft", "/nftRouter", linkedHashMap);
    }

    @Override // o.InterfaceC9773bbs
    public void OLrzqt(@NotNull android.content.Context context, long j, @NotNull java.lang.String str, @NotNull java.lang.String str2, int i, @NotNull yHS<? super java.lang.Boolean, ? super java.lang.Long, ? super java.lang.String, ? super java.lang.String, ? super java.lang.Integer, Unit> yhs) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(yhs, "");
        if (j == 0) {
            java.lang.String strCopydefault = C48787ucK.AEQbTJ.copydefault("mlnconfig.runesShutDownVersion", "9.99.99");
            if (i == 13 && C48833udD.copydefault(C34703nhO.valueOf(context), strCopydefault) >= 0 && C48833udD.copydefault(C7326ahi.gEmmrt(), "6.64.1") >= 0) {
                yhs.invoke(java.lang.Boolean.TRUE, java.lang.Long.valueOf(j), str, str2, java.lang.Integer.valueOf(i));
                return;
            } else if (i == 1 || i == 2 || i == 6) {
                yhs.invoke(java.lang.Boolean.TRUE, java.lang.Long.valueOf(j), str, str2, java.lang.Integer.valueOf(i));
                return;
            }
        } else if (j == 70000061) {
            if (i == 14 && C48833udD.copydefault(C7326ahi.gEmmrt(), C48787ucK.AEQbTJ.copydefault("mlnconfig.nftFractalMarketLuaVersion", "6.85.5")) > 0) {
                yhs.invoke(java.lang.Boolean.TRUE, java.lang.Long.valueOf(j), str, str2, java.lang.Integer.valueOf(i));
                return;
            } else if (i == 17 && C48833udD.copydefault(C7326ahi.gEmmrt(), C48787ucK.AEQbTJ.copydefault("mlnconfig.nftCat20MarketLuaVersion", "6.102.3")) > 0) {
                yhs.invoke(java.lang.Boolean.TRUE, java.lang.Long.valueOf(j), str, str2, java.lang.Integer.valueOf(i));
                return;
            }
        }
        yhs.invoke(java.lang.Boolean.FALSE, java.lang.Long.valueOf(j), str, str2, java.lang.Integer.valueOf(i));
    }

    @Override // o.InterfaceC9773bbs
    public void AEQbTJ(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        C43514rqi.EZpvd.copydefault(context);
    }
}
