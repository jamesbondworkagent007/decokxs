package o;

import com.okinc.business.invest_biz.data.bean.ButtonType;
import com.okinc.business.invest_biz.data.bean.InvestBaseDefiTokenInfo;
import com.okinc.business.invest_biz.data.bean.InvestUserRewardElementInfo;
import com.okinc.business.invest_biz.data.bean.InvestUserRewardInfoByInvestment;
import com.okinc.business.invest_biz.data.contants.InvestAction;
import com.okinc.business.invest_biz.data.repository.defi_dashboard.model.InvestmentAssetDetails;
import com.okinc.business.invest_biz.ui.screens.defi_dashboard.asset_details.AssetRawData;
import com.okinc.business.invest_biz.ui.widget.defi_dashboard.ButtonAction;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.C25493ixk;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.iEf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C23650iEf {
    public final iDP AEQbTJ;
    public final android.content.Context EZpvd;
    public final C23659iEo OLrzqt;

    @yCM
    public C23650iEf(@NotNull android.content.Context context, @NotNull iDP idp, @NotNull C23659iEo c23659iEo) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(idp, "");
        Intrinsics.checkNotNullParameter(c23659iEo, "");
        this.EZpvd = context;
        this.AEQbTJ = idp;
        this.OLrzqt = c23659iEo;
    }

    public static /* synthetic */ C27296jsX mapAssetsIfNotEmpty$default(C23650iEf c23650iEf, java.lang.String str, java.util.List list, AssetRawData assetRawData, java.lang.Long l, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            assetRawData = null;
        }
        if ((i & 8) != 0) {
            l = null;
        }
        return c23650iEf.copydefault(str, list, assetRawData, l);
    }

    public final C27296jsX copydefault(java.lang.String str, java.util.List<InvestBaseDefiTokenInfo> list, final AssetRawData assetRawData, java.lang.Long l) {
        ButtonAction buttonAction;
        if (!(!list.isEmpty())) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(this.AEQbTJ.AEQbTJ((InvestBaseDefiTokenInfo) it.next(), l));
        }
        if (assetRawData != null && assetRawData.valueOf()) {
            buttonAction = ButtonAction.ADD_LIQUIDITY;
        } else {
            buttonAction = ButtonAction.CLAIM;
        }
        return new C27296jsX(str, null, arrayList, null, KWHzl(new Function0() { // from class: o.iEk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C23650iEf.KWHzl(assetRawData);
            }
        }), buttonAction, false, false, false, false, assetRawData, false, false, 7114, null);
    }

    public static final ButtonType KWHzl(AssetRawData assetRawData) {
        if (assetRawData != null && assetRawData.valueOf()) {
            return ButtonType.CLAIM_TYPE_ENABLE;
        }
        return ButtonType.CLAIM_TYPE_NO_NEED_SHOW;
    }

    public static /* synthetic */ java.util.List mapRewardsAssetsIfNotEmpty$default(C23650iEf c23650iEf, java.lang.String str, java.util.List list, AssetRawData assetRawData, boolean z, boolean z2, java.lang.Long l, int i, java.lang.Object obj) {
        if ((i & 16) != 0) {
            z2 = false;
        }
        boolean z3 = z2;
        if ((i & 32) != 0) {
            l = null;
        }
        return c23650iEf.OLrzqt(str, list, assetRawData, z, z3, l);
    }

    public final java.util.List<C27296jsX> OLrzqt(java.lang.String str, final java.util.List<InvestUserRewardInfoByInvestment> list, AssetRawData assetRawData, boolean z, boolean z2, java.lang.Long l) {
        java.util.List listAhwBna;
        if (!(!list.isEmpty())) {
            return yDY.AhwBna();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        for (final InvestUserRewardInfoByInvestment investUserRewardInfoByInvestment : list) {
            java.util.List<InvestUserRewardElementInfo> baseDefiTokenInfos = investUserRewardInfoByInvestment.getBaseDefiTokenInfos();
            if (baseDefiTokenInfos == null) {
                listAhwBna = yDY.AhwBna();
            } else {
                listAhwBna = new java.util.ArrayList(C56403yEb.AYXKKw(baseDefiTokenInfos, 10));
                java.util.Iterator<T> it = baseDefiTokenInfos.iterator();
                while (it.hasNext()) {
                    listAhwBna.add(this.OLrzqt.KWHzl((InvestUserRewardElementInfo) it.next(), investUserRewardInfoByInvestment.KWHzl(), l));
                }
            }
            java.util.List list2 = listAhwBna;
            java.util.List<InvestUserRewardElementInfo> baseDefiTokenInfos2 = investUserRewardInfoByInvestment.getBaseDefiTokenInfos();
            InvestAction investAction = InvestAction.Claim;
            java.util.List<InvestUserRewardElementInfo> baseDefiTokenInfos3 = investUserRewardInfoByInvestment.getBaseDefiTokenInfos();
            if (baseDefiTokenInfos3 == null) {
                baseDefiTokenInfos3 = yDY.AhwBna();
            }
            arrayList.add(new C27296jsX(str, null, list2, baseDefiTokenInfos2, KWHzl(new Function0() { // from class: o.iEj
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C23650iEf.OLrzqt(list, investUserRewardInfoByInvestment);
                }
            }), null, false, false, false, false, new AssetRawData(investAction, investUserRewardInfoByInvestment.getClaimMode(), investUserRewardInfoByInvestment.getCallDataExtJson(), baseDefiTokenInfos3, assetRawData != null ? assetRawData.AEQbTJ() : null, assetRawData != null ? assetRawData.djBIcL() : null, null, assetRawData != null ? assetRawData.valueOf() : false, null, null, false, 1856, null), z, z2, 994, null));
        }
        return arrayList;
    }

    public final ButtonType KWHzl(Function0<? extends ButtonType> function0) {
        if (C24193iYi.OLrzqt.AEQbTJ()) {
            return ButtonType.CLAIM_TYPE_NO_NEED_SHOW;
        }
        return function0.invoke();
    }

    public static /* synthetic */ java.util.List invoke$default(C23650iEf c23650iEf, InvestmentAssetDetails investmentAssetDetails, java.lang.Long l, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            l = null;
        }
        return c23650iEf.EZpvd(investmentAssetDetails, l);
    }

    public final java.util.List<C27296jsX> EZpvd(@NotNull InvestmentAssetDetails investmentAssetDetails, java.lang.Long l) {
        Intrinsics.checkNotNullParameter(investmentAssetDetails, "");
        java.util.List listOLrzqt = C56402yEa.OLrzqt();
        java.lang.String string = this.EZpvd.getString(C25493ixk.FragmentManager.FQMcgE);
        Intrinsics.checkNotNullExpressionValue(string, "");
        C27296jsX c27296jsXCopydefault = copydefault(string, investmentAssetDetails.AhwBna(), investmentAssetDetails.OLrzqt(), l);
        if (c27296jsXCopydefault != null) {
            listOLrzqt.add(c27296jsXCopydefault);
        }
        java.lang.String string2 = this.EZpvd.getString(C25493ixk.FragmentManager.FQMcgE);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        C27296jsX c27296jsXCopydefault2 = copydefault(string2, investmentAssetDetails.AEQbTJ(), investmentAssetDetails.OLrzqt(), l);
        if (c27296jsXCopydefault2 != null) {
            listOLrzqt.add(c27296jsXCopydefault2);
        }
        java.lang.String string3 = this.EZpvd.getString(C25493ixk.FragmentManager.DFbvW);
        Intrinsics.checkNotNullExpressionValue(string3, "");
        listOLrzqt.addAll(mapRewardsAssetsIfNotEmpty$default(this, string3, investmentAssetDetails.KWHzl(), investmentAssetDetails.OLrzqt(), true, false, l, 16, null));
        java.lang.String string4 = this.EZpvd.getString(C25493ixk.FragmentManager.OEgNct);
        Intrinsics.checkNotNullExpressionValue(string4, "");
        listOLrzqt.addAll(OLrzqt(string4, investmentAssetDetails.valueOf(), investmentAssetDetails.OLrzqt(), true, true, l));
        return C56402yEa.fARcdN(listOLrzqt);
    }

    public static final ButtonType OLrzqt(java.util.List list, InvestUserRewardInfoByInvestment investUserRewardInfoByInvestment) {
        ButtonType buttonType;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            if (investUserRewardInfoByInvestment.getButtonType() != ButtonType.CLAIM_TYPE_NO_NEED_SHOW) {
                arrayList.add(obj);
            }
        }
        InvestUserRewardInfoByInvestment investUserRewardInfoByInvestment2 = (InvestUserRewardInfoByInvestment) CollectionsKt___CollectionsKt.wlaJM(arrayList);
        return (investUserRewardInfoByInvestment2 == null || (buttonType = investUserRewardInfoByInvestment2.getButtonType()) == null) ? ButtonType.CLAIM_TYPE_NO_NEED_SHOW : buttonType;
    }
}
