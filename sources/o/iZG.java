package o;

import com.amplifyframework.core.model.ModelIdentifier;
import com.engagelab.privates.core.constants.MTCoreConstants;
import com.okinc.business.defi.api.bean.CurrencyDisplayStyle;
import com.okinc.business.invest_biz.data.bean.InvestAssetPositionType;
import com.okinc.business.invest_biz.data.bean.InvestBaseDefiTokenInfo;
import com.okinc.business.invest_biz.data.bean.InvestLogo;
import com.okinc.business.invest_biz.data.bean.InvestPositionDetailExtraFieldData;
import com.okinc.business.invest_biz.data.bean.InvestTipInfoVo;
import com.okinc.business.invest_biz.data.bean.InvestUserRewardElementInfo;
import com.okinc.business.invest_biz.data.bean.InvestUserRewardInfoByInvestment;
import com.okinc.business.invest_biz.data.bean.Perpetual;
import com.okinc.business.invest_biz.data.bean.RewardType;
import com.okinc.business.invest_biz.data.bean.response.InvestExtraAssetData;
import com.okinc.business.invest_biz.data.bean.response.PositionInfo;
import com.okinc.business.invest_biz.data.contants.ProductType;
import com.okinc.business.invest_biz.data.repository.defi_dashboard.model.InvestmentAssetDetails;
import com.okinc.business.invest_biz.data.repository.defi_dashboard.model.MarketInvestmentItem;
import com.okinc.business.invest_biz.ui.screens.defi_dashboard.novice.bean.DeFiTokenModelAssetDetail;
import com.okinc.localization.util.format.DisplaySign;
import java.math.BigDecimal;
import java.math.RoundingMode;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C25493ixk;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class iZG {
    public final android.content.Context OLrzqt;
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int EZpvd = 8;
    public static final ProductType copydefault = ProductType.Perpetual;
    public static final ProductType KWHzl = ProductType.NftBorrow;

    public final /* synthetic */ class ActionBar {
        public static final /* synthetic */ int[] OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[InvestAssetPositionType.values().length];
            try {
                iArr[InvestAssetPositionType.UNI_V3_POSITION.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[InvestAssetPositionType.EXPIRY_POSITION.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            OLrzqt = iArr;
        }
    }

    @yCM
    public iZG(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        this.OLrzqt = context;
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.iZG.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    public final DeFiTokenModelAssetDetail copydefault(@NotNull iEC iec) {
        boolean z;
        kotlin.Pair pairOLrzqt;
        Intrinsics.checkNotNullParameter(iec, "");
        java.util.ArrayList<C24236iZy> arrayList = new java.util.ArrayList();
        java.util.Iterator<T> it = iec.OLrzqt().iterator();
        while (true) {
            z = true;
            if (!it.hasNext()) {
                break;
            }
            C23669iEy c23669iEy = (C23669iEy) it.next();
            if (!(true ^ c23669iEy.AEQbTJ().AYXKKw().isEmpty())) {
                arrayList.add(copydefault(c23669iEy));
            } else {
                java.util.Iterator<T> it2 = c23669iEy.AEQbTJ().AYXKKw().iterator();
                while (it2.hasNext()) {
                    arrayList.add(OLrzqt(c23669iEy, (PositionInfo) it2.next()));
                }
            }
        }
        for (iEB ieb : iec.copydefault()) {
            for (MarketInvestmentItem marketInvestmentItem : ieb.KWHzl().OLrzqt()) {
                java.util.Iterator<T> it3 = marketInvestmentItem.gEmmrt().iterator();
                while (it3.hasNext()) {
                    arrayList.add(AEQbTJ((InvestBaseDefiTokenInfo) it3.next(), ieb, marketInvestmentItem));
                }
            }
        }
        if (!arrayList.isEmpty()) {
            java.util.Iterator it4 = arrayList.iterator();
            while (true) {
                if (!it4.hasNext()) {
                    break;
                }
                C24236iZy c24236iZy = (C24236iZy) it4.next();
                java.lang.Long lGEmmrt = c24236iZy.gEmmrt();
                if (lGEmmrt == null || lGEmmrt.longValue() != 0) {
                    if (c24236iZy.gEmmrt() != null) {
                        z = false;
                        break;
                    }
                }
            }
        }
        if (z) {
            pairOLrzqt = C56390yDp.OLrzqt(C33069mpW.KWHzl(this.OLrzqt, C25493ixk.FragmentManager.QXDzTk, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt(MTCoreConstants.Protocol.KEY_PROTOCOL, iec.EZpvd().KWHzl()))), null);
        } else {
            pairOLrzqt = C56390yDp.OLrzqt(null, null);
        }
        java.lang.String str = (java.lang.String) pairOLrzqt.component1();
        java.lang.Object obj = (java.lang.Void) pairOLrzqt.component2();
        java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList, 10));
        for (C24236iZy c24236iZyOLrzqt : arrayList) {
            java.lang.Long lGEmmrt2 = c24236iZyOLrzqt.gEmmrt();
            if (((lGEmmrt2 != null && lGEmmrt2.longValue() == 0) || c24236iZyOLrzqt.gEmmrt() == null) && !z) {
                c24236iZyOLrzqt = c24236iZyOLrzqt.OLrzqt((249855 & 1) != 0 ? c24236iZyOLrzqt.gEmmrt : null, (249855 & 2) != 0 ? c24236iZyOLrzqt.DbNXlk : null, (249855 & 4) != 0 ? c24236iZyOLrzqt.fIwbmz : null, (249855 & 8) != 0 ? c24236iZyOLrzqt.AkhnZx : null, (249855 & 16) != 0 ? c24236iZyOLrzqt.valueOf : null, (249855 & 32) != 0 ? c24236iZyOLrzqt.djBIcL : null, (249855 & 64) != 0 ? c24236iZyOLrzqt.KWHzl : null, (249855 & 128) != 0 ? c24236iZyOLrzqt.ejfBZ : null, (249855 & 256) != 0 ? c24236iZyOLrzqt.EZpvd : null, (249855 & 512) != 0 ? c24236iZyOLrzqt.isConnected : null, (249855 & 1024) != 0 ? c24236iZyOLrzqt.fetchVPNInfo : null, (249855 & 2048) != 0 ? c24236iZyOLrzqt.AhwBna : null, (249855 & 4096) != 0 ? c24236iZyOLrzqt.AEQbTJ : C33069mpW.KWHzl(this.OLrzqt, C25493ixk.FragmentManager.QXDzTk, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt(MTCoreConstants.Protocol.KEY_PROTOCOL, iec.EZpvd().KWHzl()))), (249855 & 8192) != 0 ? c24236iZyOLrzqt.AYXKKw : null, (249855 & 16384) != 0 ? c24236iZyOLrzqt.fARcdN : null, (249855 & 32768) != 0 ? c24236iZyOLrzqt.copydefault : null, (249855 & 65536) != 0 ? c24236iZyOLrzqt.values : null, (249855 & 131072) != 0 ? c24236iZyOLrzqt.OLrzqt : null);
            }
            arrayList2.add(c24236iZyOLrzqt);
        }
        return new DeFiTokenModelAssetDetail(arrayList2, str, (Function0) obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C24236iZy OLrzqt(C23669iEy c23669iEy, PositionInfo positionInfo) {
        java.lang.String strAYXKKw;
        java.lang.String str;
        java.lang.String str2;
        iEA ieaEZpvd = c23669iEy.EZpvd();
        java.lang.String strDjBIcL = ieaEZpvd.djBIcL();
        java.lang.String strGEmmrt = ieaEZpvd.gEmmrt();
        InvestAssetPositionType investAssetPositionTypeEZpvd = positionInfo.EZpvd();
        int i = investAssetPositionTypeEZpvd == null ? -1 : ActionBar.OLrzqt[investAssetPositionTypeEZpvd.ordinal()];
        if (i == 1) {
            strAYXKKw = positionInfo.AYXKKw();
            if (strAYXKKw.length() <= 0) {
                strAYXKKw = null;
            }
            if (strAYXKKw == null) {
                strAYXKKw = positionInfo.valueOf();
                if (strAYXKKw.length() > 0) {
                }
            }
            str = strAYXKKw;
        } else if (i == 2) {
            strAYXKKw = positionInfo.AYXKKw();
            if (strAYXKKw.length() > 0) {
                str = strAYXKKw;
            }
        } else {
            strAYXKKw = positionInfo.AYXKKw();
            if (strAYXKKw.length() <= 0) {
                strAYXKKw = null;
            }
            if (strAYXKKw == null) {
                strAYXKKw = positionInfo.valueOf();
                if (strAYXKKw.length() <= 0) {
                    str = null;
                }
            }
            str = strAYXKKw;
        }
        java.lang.String strFetchVPNInfo = positionInfo.fetchVPNInfo();
        if (strFetchVPNInfo.length() <= 0) {
            strFetchVPNInfo = null;
        }
        if (strFetchVPNInfo == null) {
            strFetchVPNInfo = ieaEZpvd.valueOf();
        }
        java.lang.String str3 = strFetchVPNInfo;
        C24230iZs c24230iZsKWHzl = KWHzl(c23669iEy, positionInfo);
        long jOLrzqt = c23669iEy.KWHzl().OLrzqt();
        java.lang.String strCopydefault = positionInfo.copydefault();
        if (strCopydefault.length() == 0) {
            java.lang.String strEZpvd = ieaEZpvd.EZpvd();
            if (strEZpvd.length() == 0) {
                strEZpvd = strDjBIcL;
            }
            str2 = strEZpvd;
        } else {
            str2 = strCopydefault;
        }
        ProductType productTypeAEQbTJ = c23669iEy.KWHzl().AEQbTJ();
        iEA ieaEZpvd2 = c23669iEy.EZpvd();
        return new C24236iZy(java.lang.Long.valueOf(jOLrzqt), productTypeAEQbTJ, str2, strDjBIcL, null, ieaEZpvd2 != null ? ieaEZpvd2.OLrzqt() : null, str3, null, null, ModelIdentifier.Helper.PRIMARY_KEY_DELIMITER + C59454zhO.isConnected(positionInfo.gEmmrt(), 6), str, strGEmmrt, null, null, DeFiTokenModelAssetDetail.StyleType.POSITION, investAssetPositionTypeEZpvd, positionInfo.AEQbTJ(), c24230iZsKWHzl, 12688, null);
    }

    public final C24236iZy copydefault(C23669iEy c23669iEy) {
        iEA ieaEZpvd = c23669iEy.EZpvd();
        java.lang.String strDjBIcL = ieaEZpvd.djBIcL();
        java.lang.String strGEmmrt = ieaEZpvd.gEmmrt();
        java.lang.String strEZpvd = ieaEZpvd.EZpvd();
        java.lang.String str = strEZpvd.length() == 0 ? strDjBIcL : strEZpvd;
        java.lang.String strValueOf = ieaEZpvd.valueOf();
        java.lang.String strEZpvd2 = EZpvd(c23669iEy);
        InvestLogo investLogoKWHzl = ieaEZpvd.KWHzl();
        DeFiTokenModelAssetDetail.StyleType styleType = DeFiTokenModelAssetDetail.StyleType.BASIC;
        C24230iZs c24230iZsAEQbTJ = AEQbTJ(c23669iEy);
        long jOLrzqt = c23669iEy.KWHzl().OLrzqt();
        ProductType productTypeAEQbTJ = c23669iEy.KWHzl().AEQbTJ();
        iEA ieaEZpvd2 = c23669iEy.EZpvd();
        return new C24236iZy(java.lang.Long.valueOf(jOLrzqt), productTypeAEQbTJ, str, strDjBIcL, investLogoKWHzl, ieaEZpvd2 != null ? ieaEZpvd2.OLrzqt() : null, strValueOf, strEZpvd2, null, null, null, strGEmmrt, null, null, styleType, null, null, c24230iZsAEQbTJ, 110848, null);
    }

    public static /* synthetic */ C24236iZy createPrimaryAssetFromBorrowedAsset$default(iZG izg, InvestBaseDefiTokenInfo investBaseDefiTokenInfo, iEB ieb, MarketInvestmentItem marketInvestmentItem, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            marketInvestmentItem = null;
        }
        return izg.AEQbTJ(investBaseDefiTokenInfo, ieb, marketInvestmentItem);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C24236iZy AEQbTJ(InvestBaseDefiTokenInfo investBaseDefiTokenInfo, iEB ieb, MarketInvestmentItem marketInvestmentItem) {
        java.lang.String currencyAmount;
        InvestLogo investLogo;
        C23670iEz c23670iEzAEQbTJ;
        java.util.List<InvestBaseDefiTokenInfo> listGEmmrt;
        java.lang.String strAEQbTJ;
        C23668iEx c23668iExOLrzqt;
        java.lang.String strCopydefault;
        C23668iEx c23668iExOLrzqt2;
        java.lang.String strKWHzl;
        java.lang.String str = (ieb == null || (c23668iExOLrzqt2 = ieb.OLrzqt()) == null || (strKWHzl = c23668iExOLrzqt2.KWHzl()) == null) ? "" : strKWHzl;
        java.lang.String str2 = (ieb == null || (c23668iExOLrzqt = ieb.OLrzqt()) == null || (strCopydefault = c23668iExOLrzqt.copydefault()) == null || strCopydefault.length() <= 0) ? null : strCopydefault;
        java.lang.String tokenSymbol = investBaseDefiTokenInfo.getTokenSymbol();
        java.lang.String str3 = tokenSymbol == null ? "" : tokenSymbol;
        if (marketInvestmentItem == null || (currencyAmount = marketInvestmentItem.djBIcL()) == null) {
            currencyAmount = investBaseDefiTokenInfo.getCurrencyAmount();
            if (currencyAmount == null) {
                currencyAmount = "0";
            }
        } else {
            if (currencyAmount.length() <= 0) {
                currencyAmount = null;
            }
            if (currencyAmount == null) {
            }
        }
        java.lang.String str4 = currencyAmount;
        if (marketInvestmentItem == null || (investLogo = marketInvestmentItem.EZpvd()) == null) {
            investLogo = new InvestLogo((java.util.List) null, (java.util.List) null, (java.util.List) null, (java.util.List) null, 15, (DefaultConstructorMarker) null);
        }
        return new C24236iZy(marketInvestmentItem != null ? java.lang.Long.valueOf(marketInvestmentItem.OLrzqt()) : null, marketInvestmentItem != null ? marketInvestmentItem.AhwBna() : null, str3, str, investLogo, marketInvestmentItem != null ? marketInvestmentItem.copydefault() : null, str4, (marketInvestmentItem == null || (strAEQbTJ = marketInvestmentItem.AEQbTJ()) == null || strAEQbTJ.length() <= 0) ? null : strAEQbTJ, (ieb == null || (c23670iEzAEQbTJ = ieb.AEQbTJ()) == null) ? null : c23670iEzAEQbTJ.EZpvd(), null, null, str2, null, null, null, null, null, EZpvd(investBaseDefiTokenInfo, ieb, marketInvestmentItem != null ? marketInvestmentItem.KWHzl() : null, iZM.OLrzqt((marketInvestmentItem == null || (listGEmmrt = marketInvestmentItem.gEmmrt()) == null) ? 0 : listGEmmrt.size(), C33129mqd.gEmmrt(marketInvestmentItem != null ? marketInvestmentItem.valueOf() : null)), marketInvestmentItem != null ? marketInvestmentItem.valueOf() : null), 126976, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.String EZpvd(C23669iEy c23669iEy) {
        java.lang.String strValues;
        ProductType productTypeAEQbTJ = c23669iEy.KWHzl().AEQbTJ();
        iEA ieaEZpvd = c23669iEy.EZpvd();
        if (productTypeAEQbTJ == copydefault) {
            InvestTipInfoVo investmentNameTip = ieaEZpvd.isConnected().getInvestmentNameTip();
            if (investmentNameTip == null || (strValues = investmentNameTip.getTipContent()) == null) {
                strValues = "";
            }
        } else {
            strValues = ieaEZpvd.values();
            if (strValues.length() == 0) {
            }
        }
        if (strValues.length() > 0) {
            return strValues;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x02b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C24230iZs AEQbTJ(C23669iEy c23669iEy) {
        ProductType productType;
        java.lang.String str;
        java.lang.String str2;
        java.util.List listAhwBna;
        kotlin.Pair pairOLrzqt;
        java.lang.String pnl;
        java.lang.String tradePair;
        java.lang.String str3;
        java.util.List<InvestBaseDefiTokenInfo> margin;
        java.util.List<InvestBaseDefiTokenInfo> position;
        InvestmentAssetDetails investmentAssetDetailsAEQbTJ = c23669iEy.AEQbTJ();
        long jKWHzl = c23669iEy.KWHzl().KWHzl();
        ProductType productTypeAEQbTJ = c23669iEy.KWHzl().AEQbTJ();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.String strOLrzqt = iZM.OLrzqt(investmentAssetDetailsAEQbTJ.AhwBna().size() + investmentAssetDetailsAEQbTJ.AEQbTJ().size(), c23669iEy.EZpvd().AhwBna());
        boolean z = strOLrzqt != null;
        java.lang.String strCopydefault = iZM.copydefault(this.OLrzqt, false, z);
        java.lang.String str4 = "";
        int i = 10;
        if (productTypeAEQbTJ == copydefault) {
            Perpetual perpetualAYXKKw = c23669iEy.EZpvd().AYXKKw();
            if (perpetualAYXKKw != null && (position = perpetualAYXKKw.getPosition()) != null) {
                if (!(!position.isEmpty())) {
                    position = null;
                }
                if (position != null) {
                    java.lang.String string = this.OLrzqt.getString(C25493ixk.FragmentManager.fvQaOB);
                    Intrinsics.checkNotNullExpressionValue(string, "");
                    java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(position, 10));
                    java.util.Iterator<T> it = position.iterator();
                    while (it.hasNext()) {
                        java.util.ArrayList arrayList3 = arrayList2;
                        arrayList3.add(iZM.AEQbTJ((InvestBaseDefiTokenInfo) it.next(), jKWHzl, false, strOLrzqt, c23669iEy.EZpvd().AhwBna()));
                        arrayList2 = arrayList3;
                    }
                    arrayList.add(new C24224iZm(string, strCopydefault, arrayList2));
                }
            }
            if (perpetualAYXKKw != null && (margin = perpetualAYXKKw.getMargin()) != null) {
                if (!(!margin.isEmpty())) {
                    margin = null;
                }
                if (margin != null) {
                    java.lang.String string2 = this.OLrzqt.getString(C25493ixk.FragmentManager.gasjUx);
                    Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                    java.util.ArrayList arrayList4 = new java.util.ArrayList(C56403yEb.AYXKKw(margin, 10));
                    java.util.Iterator<T> it2 = margin.iterator();
                    while (it2.hasNext()) {
                        arrayList4.add(iZM.AEQbTJ((InvestBaseDefiTokenInfo) it2.next(), jKWHzl, false, strOLrzqt, c23669iEy.EZpvd().AhwBna()));
                    }
                    arrayList.add(new C24224iZm(string2, strCopydefault, arrayList4));
                }
            }
        } else {
            if (productTypeAEQbTJ != KWHzl) {
                if (!investmentAssetDetailsAEQbTJ.AhwBna().isEmpty()) {
                    java.lang.String string3 = this.OLrzqt.getString(C25493ixk.FragmentManager.FQMcgE);
                    Intrinsics.checkNotNullExpressionValue(string3, "");
                    java.util.List<InvestBaseDefiTokenInfo> listAhwBna2 = investmentAssetDetailsAEQbTJ.AhwBna();
                    char c = '\n';
                    java.util.ArrayList arrayList5 = new java.util.ArrayList(C56403yEb.AYXKKw(listAhwBna2, 10));
                    java.util.Iterator<T> it3 = listAhwBna2.iterator();
                    while (it3.hasNext()) {
                        ProductType productType2 = productTypeAEQbTJ;
                        java.util.ArrayList arrayList6 = arrayList5;
                        arrayList6.add(iZM.AEQbTJ((InvestBaseDefiTokenInfo) it3.next(), jKWHzl, false, strOLrzqt, c23669iEy.EZpvd().AhwBna()));
                        arrayList5 = arrayList6;
                        str4 = str4;
                        productTypeAEQbTJ = productType2;
                        strOLrzqt = strOLrzqt;
                        c = '\n';
                    }
                    productType = productTypeAEQbTJ;
                    str = strOLrzqt;
                    str2 = str4;
                    arrayList.add(new C24224iZm(string3, strCopydefault, arrayList5));
                } else {
                    productType = productTypeAEQbTJ;
                    str = strOLrzqt;
                    str2 = "";
                }
                if (!investmentAssetDetailsAEQbTJ.AEQbTJ().isEmpty()) {
                    java.lang.String string4 = this.OLrzqt.getString(C25493ixk.FragmentManager.giSNqX);
                    Intrinsics.checkNotNullExpressionValue(string4, str2);
                    java.lang.String strCopydefault2 = iZM.copydefault(this.OLrzqt, true, z);
                    java.util.List<InvestBaseDefiTokenInfo> listAEQbTJ = investmentAssetDetailsAEQbTJ.AEQbTJ();
                    java.util.ArrayList arrayList7 = new java.util.ArrayList(C56403yEb.AYXKKw(listAEQbTJ, 10));
                    java.util.Iterator<T> it4 = listAEQbTJ.iterator();
                    while (it4.hasNext()) {
                        arrayList7.add(iZM.AEQbTJ((InvestBaseDefiTokenInfo) it4.next(), jKWHzl, false, str, c23669iEy.EZpvd().AhwBna()));
                    }
                    arrayList.add(new C24224iZm(string4, strCopydefault2, arrayList7));
                }
                C24229iZr c24229iZrAEQbTJ = AEQbTJ(c23669iEy.AEQbTJ().KWHzl());
                java.util.List<InvestPositionDetailExtraFieldData> listAEQbTJ2 = c23669iEy.EZpvd().AEQbTJ();
                java.util.ArrayList<InvestPositionDetailExtraFieldData> arrayList8 = new java.util.ArrayList();
                for (java.lang.Object obj : listAEQbTJ2) {
                    if (((InvestPositionDetailExtraFieldData) obj).getFieldName().length() > 0) {
                        arrayList8.add(obj);
                    }
                }
                java.util.ArrayList arrayList9 = new java.util.ArrayList();
                for (InvestPositionDetailExtraFieldData investPositionDetailExtraFieldData : arrayList8) {
                    java.util.List<java.lang.String> fieldValue = investPositionDetailExtraFieldData.getFieldValue();
                    C24228iZq c24228iZq = (fieldValue == null || (str3 = (java.lang.String) CollectionsKt___CollectionsKt.firstOrNull(fieldValue)) == null) ? null : new C24228iZq(investPositionDetailExtraFieldData.getFieldName(), str3);
                    if (c24228iZq != null) {
                        arrayList9.add(c24228iZq);
                    }
                }
                java.util.ArrayList arrayList10 = !(arrayList9.isEmpty() ^ true) ? arrayList9 : null;
                if (productType != copydefault) {
                    Perpetual perpetualAYXKKw2 = c23669iEy.EZpvd().AYXKKw();
                    if (perpetualAYXKKw2 == null || (pnl = perpetualAYXKKw2.getPnl()) == null || pnl.length() <= 0) {
                        pnl = null;
                    }
                    if (perpetualAYXKKw2 == null || (tradePair = perpetualAYXKKw2.getTradePair()) == null || tradePair.length() <= 0) {
                        tradePair = null;
                    }
                    pairOLrzqt = C56390yDp.OLrzqt(pnl, tradePair);
                } else {
                    pairOLrzqt = C56390yDp.OLrzqt(null, null);
                }
                return new C24230iZs(arrayList, c24229iZrAEQbTJ, null, arrayList10, (java.lang.String) pairOLrzqt.component2(), (java.lang.String) pairOLrzqt.component1(), null);
            }
            for (InvestExtraAssetData investExtraAssetData : c23669iEy.AEQbTJ().EZpvd()) {
                java.lang.String strCopydefault3 = investExtraAssetData.copydefault();
                java.util.List<InvestBaseDefiTokenInfo> listAEQbTJ3 = investExtraAssetData.AEQbTJ();
                if (listAEQbTJ3 == null) {
                    listAhwBna = yDY.AhwBna();
                } else {
                    listAhwBna = new java.util.ArrayList(C56403yEb.AYXKKw(listAEQbTJ3, i));
                    java.util.Iterator<T> it5 = listAEQbTJ3.iterator();
                    while (it5.hasNext()) {
                        listAhwBna.add(iZM.AEQbTJ((InvestBaseDefiTokenInfo) it5.next(), jKWHzl, false, strOLrzqt, c23669iEy.EZpvd().AhwBna()));
                    }
                }
                arrayList.add(new C24224iZm(strCopydefault3, strCopydefault, listAhwBna));
                i = 10;
            }
        }
        productType = productTypeAEQbTJ;
        C24229iZr c24229iZrAEQbTJ2 = AEQbTJ(c23669iEy.AEQbTJ().KWHzl());
        java.util.List<InvestPositionDetailExtraFieldData> listAEQbTJ22 = c23669iEy.EZpvd().AEQbTJ();
        java.util.ArrayList<InvestPositionDetailExtraFieldData> arrayList82 = new java.util.ArrayList();
        while (r1.hasNext()) {
        }
        java.util.ArrayList arrayList92 = new java.util.ArrayList();
        while (r2.hasNext()) {
        }
        if (!(arrayList92.isEmpty() ^ true)) {
        }
        if (productType != copydefault) {
        }
        return new C24230iZs(arrayList, c24229iZrAEQbTJ2, null, arrayList10, (java.lang.String) pairOLrzqt.component2(), (java.lang.String) pairOLrzqt.component1(), null);
    }

    public final C24230iZs KWHzl(C23669iEy c23669iEy, PositionInfo positionInfo) {
        java.util.List listEZpvd;
        long jKWHzl = c23669iEy.KWHzl().KWHzl();
        InvestAssetPositionType investAssetPositionTypeEZpvd = positionInfo.EZpvd();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.String strOLrzqt = iZM.OLrzqt(positionInfo.AhwBna().size(), c23669iEy.EZpvd().AhwBna());
        java.lang.String strCopydefault = iZM.copydefault(this.OLrzqt, false, strOLrzqt != null);
        if (!positionInfo.AhwBna().isEmpty()) {
            java.lang.String string = this.OLrzqt.getString(C25493ixk.FragmentManager.FQMcgE);
            Intrinsics.checkNotNullExpressionValue(string, "");
            java.util.List<InvestBaseDefiTokenInfo> listAhwBna = positionInfo.AhwBna();
            java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(listAhwBna, 10));
            java.util.Iterator<T> it = listAhwBna.iterator();
            while (it.hasNext()) {
                java.util.ArrayList arrayList3 = arrayList2;
                arrayList3.add(iZM.AEQbTJ((InvestBaseDefiTokenInfo) it.next(), jKWHzl, true, strOLrzqt, c23669iEy.EZpvd().AhwBna()));
                arrayList2 = arrayList3;
            }
            arrayList.add(new C24224iZm(string, strCopydefault, arrayList2));
        }
        C24224iZm c24224iZmAEQbTJ = investAssetPositionTypeEZpvd == InvestAssetPositionType.UNI_V3_POSITION ? iZM.AEQbTJ(positionInfo.isConnected(), this.OLrzqt, jKWHzl, true) : null;
        C24229iZr c24229iZrAEQbTJ = AEQbTJ(positionInfo.KWHzl());
        if (investAssetPositionTypeEZpvd != InvestAssetPositionType.EXPIRY_POSITION || positionInfo.djBIcL() == null || positionInfo.djBIcL().length() <= 0) {
            listEZpvd = null;
        } else {
            java.lang.String string2 = this.OLrzqt.getString(C25493ixk.FragmentManager.hCLrkq);
            Intrinsics.checkNotNullExpressionValue(string2, "");
            listEZpvd = C56402yEa.EZpvd(new C24228iZq(string2, positionInfo.djBIcL()));
        }
        return new C24230iZs(arrayList, c24229iZrAEQbTJ, null, listEZpvd, null, null, c24224iZmAEQbTJ);
    }

    public final C24230iZs EZpvd(InvestBaseDefiTokenInfo investBaseDefiTokenInfo, iEB ieb, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        C23670iEz c23670iEzAEQbTJ;
        long jAEQbTJ = (ieb == null || (c23670iEzAEQbTJ = ieb.AEQbTJ()) == null) ? 0L : c23670iEzAEQbTJ.AEQbTJ();
        java.lang.String str4 = (str2 == null || str2.length() <= 0) ? null : str2;
        boolean z = str4 != null;
        boolean zEZpvd = Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) iDY.Companion.OLrzqt());
        java.lang.String strCopydefault = iZM.copydefault(this.OLrzqt, !zEZpvd, z);
        java.lang.String strAYXKKw = zEZpvd ? C33070mpX.AYXKKw(C25493ixk.FragmentManager.AxsJAYaxsJAY) : null;
        if (strAYXKKw == null) {
            strAYXKKw = C33070mpX.AYXKKw(C25493ixk.FragmentManager.giSNqX);
        }
        return new C24230iZs(C56402yEa.EZpvd(new C24224iZm(strAYXKKw, strCopydefault, C56402yEa.EZpvd(iZM.AEQbTJ(investBaseDefiTokenInfo, jAEQbTJ, false, str4, str3)))), null, null, null, null, null, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x007c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C24229iZr AEQbTJ(java.util.List<InvestUserRewardInfoByInvestment> list) {
        BigDecimal bigDecimalAdd;
        BigDecimal bigDecimalEZpvd;
        if (list.isEmpty()) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            if (((InvestUserRewardInfoByInvestment) obj).getRewardType() == RewardType.COMMON) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        BigDecimal bigDecimal = BigDecimal.ZERO;
        java.util.Iterator it = arrayList.iterator();
        BigDecimal bigDecimalAdd2 = bigDecimal;
        while (it.hasNext()) {
            java.util.List<InvestUserRewardElementInfo> baseDefiTokenInfos = ((InvestUserRewardInfoByInvestment) it.next()).getBaseDefiTokenInfos();
            if (baseDefiTokenInfos != null) {
                bigDecimalAdd = BigDecimal.ZERO;
                for (InvestUserRewardElementInfo investUserRewardElementInfo : baseDefiTokenInfos) {
                    Intrinsics.copydefault(bigDecimalAdd);
                    java.lang.String currencyAmount = investUserRewardElementInfo.getCurrencyAmount();
                    if (currencyAmount == null || (bigDecimalEZpvd = C33129mqd.EZpvd(currencyAmount)) == null) {
                        bigDecimalEZpvd = BigDecimal.ZERO;
                    }
                    Intrinsics.copydefault(bigDecimalEZpvd);
                    bigDecimalAdd = bigDecimalAdd.add(bigDecimalEZpvd);
                    Intrinsics.checkNotNullExpressionValue(bigDecimalAdd, "");
                }
                if (bigDecimalAdd == null) {
                    bigDecimalAdd = BigDecimal.ZERO;
                }
            }
            Intrinsics.copydefault(bigDecimalAdd2);
            Intrinsics.copydefault(bigDecimalAdd);
            bigDecimalAdd2 = bigDecimalAdd2.add(bigDecimalAdd);
            Intrinsics.checkNotNullExpressionValue(bigDecimalAdd2, "");
        }
        if (bigDecimalAdd2.compareTo(BigDecimal.ZERO) <= 0) {
            return null;
        }
        C27586jxw c27586jxw = C27586jxw.OLrzqt;
        Intrinsics.copydefault(bigDecimalAdd2);
        java.lang.String strKWHzl = c27586jxw.KWHzl(bigDecimalAdd2, (46 & 2) != 0 ? 2 : 0, (46 & 4) == 0 ? 0 : 2, (46 & 8) != 0 ? DisplaySign.AUTO : null, (46 & 16) != 0 ? CurrencyDisplayStyle.CURRENCY_AMOUNT_ONLY : CurrencyDisplayStyle.CURRENCY_SYMBOL_PREFIX, (46 & 32) != 0 ? RoundingMode.DOWN : null);
        java.lang.String string = this.OLrzqt.getString(C25493ixk.FragmentManager.DFbvW);
        Intrinsics.checkNotNullExpressionValue(string, "");
        return new C24229iZr(strKWHzl, string);
    }
}
