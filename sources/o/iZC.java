package o;

import com.amplifyframework.core.model.ModelIdentifier;
import com.engagelab.privates.core.constants.MTCoreConstants;
import com.okinc.business.defi.api.bean.CurrencyDisplayStyle;
import com.okinc.business.invest_biz.data.bean.InvestAssetPositionType;
import com.okinc.business.invest_biz.data.bean.InvestBaseDefiTokenInfo;
import com.okinc.business.invest_biz.data.bean.InvestPositionDetailExtraFieldData;
import com.okinc.business.invest_biz.data.bean.InvestTipInfoVo;
import com.okinc.business.invest_biz.data.bean.InvestUserAssetDetailPromptInformation;
import com.okinc.business.invest_biz.data.bean.Perpetual;
import com.okinc.business.invest_biz.data.bean.response.InvestExtraAssetData;
import com.okinc.business.invest_biz.data.bean.response.InvestedToken;
import com.okinc.business.invest_biz.data.bean.response.PositionInfo;
import com.okinc.business.invest_biz.data.contants.ProductType;
import com.okinc.business.invest_biz.ui.screens.defi_dashboard.novice.bean.DeFiTokenModelAssetDetail;
import com.okinc.localization.util.format.DisplaySign;
import java.math.RoundingMode;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C25493ixk;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class iZC {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int KWHzl = 8;
    public static final ProductType OLrzqt = ProductType.Perpetual;
    public static final ProductType copydefault = ProductType.NftBorrow;
    public final android.content.Context AEQbTJ;

    public final /* synthetic */ class StateListAnimator {
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
    public iZC(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        this.AEQbTJ = context;
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.iZC.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    public final DeFiTokenModelAssetDetail copydefault(@NotNull InvestedToken investedToken, @NotNull java.lang.String str, @NotNull java.lang.String str2, long j) {
        Intrinsics.checkNotNullParameter(investedToken, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (!(!investedToken.AuCTel().isEmpty())) {
            arrayList.add(KWHzl(investedToken, str, str2, j));
        } else {
            java.util.Iterator<T> it = investedToken.AuCTel().iterator();
            while (it.hasNext()) {
                arrayList.add(AEQbTJ(investedToken, (PositionInfo) it.next(), str, str2, j));
            }
        }
        return new DeFiTokenModelAssetDetail(arrayList, investedToken.isConnected() == 0 ? C33069mpW.KWHzl(this.AEQbTJ, C25493ixk.FragmentManager.QXDzTk, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt(MTCoreConstants.Protocol.KEY_PROTOCOL, str))) : null, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0094 A[PHI: r0
  0x0094: PHI (r0v11 java.lang.String) = (r0v10 java.lang.String), (r0v15 java.lang.String) binds: [B:38:0x0085, B:40:0x008f] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C24236iZy AEQbTJ(InvestedToken investedToken, PositionInfo positionInfo, java.lang.String str, java.lang.String str2, long j) {
        java.lang.String strAYXKKw;
        java.lang.String str3;
        java.lang.String str4;
        InvestAssetPositionType investAssetPositionTypeEZpvd = positionInfo.EZpvd();
        int i = investAssetPositionTypeEZpvd == null ? -1 : StateListAnimator.OLrzqt[investAssetPositionTypeEZpvd.ordinal()];
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
            str3 = strAYXKKw;
        } else if (i == 2) {
            strAYXKKw = positionInfo.AYXKKw();
            if (strAYXKKw.length() > 0) {
                str3 = strAYXKKw;
            }
        } else {
            strAYXKKw = positionInfo.AYXKKw();
            if (strAYXKKw.length() <= 0) {
                strAYXKKw = null;
            }
            if (strAYXKKw == null) {
                strAYXKKw = positionInfo.valueOf();
                if (strAYXKKw.length() <= 0) {
                    str3 = null;
                }
            }
            str3 = strAYXKKw;
        }
        java.lang.String strFetchVPNInfo = positionInfo.fetchVPNInfo();
        java.lang.String str5 = strFetchVPNInfo.length() > 0 ? strFetchVPNInfo : null;
        java.lang.String fieldNames = str5 == null ? investedToken.getFieldNames() : str5;
        C24230iZs c24230iZsOLrzqt = OLrzqt(positionInfo, j, investedToken.iwGUEr());
        long jIsConnected = investedToken.isConnected();
        java.lang.String strCopydefault = positionInfo.copydefault();
        if (strCopydefault.length() == 0) {
            strCopydefault = investedToken.DbNXlk();
            str4 = strCopydefault.length() == 0 ? str : strCopydefault;
        }
        return new C24236iZy(java.lang.Long.valueOf(jIsConnected), investedToken.fJNWhG(), str4, str, null, investedToken.fetchVPNInfo(), fieldNames, null, null, ModelIdentifier.Helper.PRIMARY_KEY_DELIMITER + C59454zhO.isConnected(positionInfo.gEmmrt(), 6), str3, str2, null, null, DeFiTokenModelAssetDetail.StyleType.POSITION, investAssetPositionTypeEZpvd, positionInfo.AEQbTJ(), c24230iZsOLrzqt, 12688, null);
    }

    public final C24236iZy KWHzl(InvestedToken investedToken, java.lang.String str, java.lang.String str2, long j) {
        java.lang.String strDbNXlk = investedToken.DbNXlk();
        java.lang.String str3 = strDbNXlk.length() == 0 ? str : strDbNXlk;
        java.lang.String fieldNames = investedToken.getFieldNames();
        java.lang.String strKWHzl = KWHzl(investedToken);
        return new C24236iZy(java.lang.Long.valueOf(investedToken.isConnected()), investedToken.fJNWhG(), str3, str, investedToken.djBIcL(), investedToken.fetchVPNInfo(), fieldNames, strKWHzl, null, null, null, str2, null, null, DeFiTokenModelAssetDetail.StyleType.BASIC, null, null, copydefault(investedToken, j), 110848, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.String KWHzl(InvestedToken investedToken) {
        java.lang.String strGEmmrt;
        InvestTipInfoVo investmentNameTip;
        if (investedToken.fJNWhG() == OLrzqt) {
            InvestUserAssetDetailPromptInformation investUserAssetDetailPromptInformationCopydefault = investedToken.copydefault();
            if (investUserAssetDetailPromptInformationCopydefault == null || (investmentNameTip = investUserAssetDetailPromptInformationCopydefault.getInvestmentNameTip()) == null || (strGEmmrt = investmentNameTip.getTipContent()) == null) {
                strGEmmrt = "";
            }
        } else {
            strGEmmrt = investedToken.gEmmrt();
            if (strGEmmrt.length() == 0) {
            }
        }
        if (strGEmmrt.length() <= 0) {
            strGEmmrt = null;
        }
        return strGEmmrt == null ? "" : strGEmmrt;
    }

    public final C24230iZs copydefault(InvestedToken investedToken, long j) {
        java.util.List listAhwBna;
        C24229iZr c24229iZr;
        kotlin.Pair pairOLrzqt;
        java.lang.String pnl;
        java.lang.String tradePair;
        java.lang.String str;
        java.util.List<InvestBaseDefiTokenInfo> margin;
        java.util.List<InvestBaseDefiTokenInfo> position;
        ProductType productTypeFJNWhG = investedToken.fJNWhG();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.String strOLrzqt = iZM.OLrzqt(investedToken.getNewProxyInstance().size() + investedToken.AEQbTJ().size(), investedToken.iwGUEr());
        java.lang.String strCopydefault = iZM.copydefault(this.AEQbTJ, investedToken.fJNWhG() == ProductType.Borrow, strOLrzqt != null);
        if (productTypeFJNWhG == OLrzqt) {
            Perpetual perpetualFARcdN = investedToken.fARcdN();
            if (perpetualFARcdN != null && (position = perpetualFARcdN.getPosition()) != null) {
                if (!(!position.isEmpty())) {
                    position = null;
                }
                if (position != null) {
                    java.lang.String string = this.AEQbTJ.getString(C25493ixk.FragmentManager.fvQaOB);
                    Intrinsics.checkNotNullExpressionValue(string, "");
                    java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(position, 10));
                    java.util.Iterator<T> it = position.iterator();
                    while (it.hasNext()) {
                        java.util.ArrayList arrayList3 = arrayList2;
                        arrayList3.add(iZM.AEQbTJ((InvestBaseDefiTokenInfo) it.next(), j, false, strOLrzqt, investedToken.iwGUEr()));
                        string = string;
                        arrayList2 = arrayList3;
                    }
                    arrayList.add(new C24224iZm(string, strCopydefault, arrayList2));
                }
            }
            if (perpetualFARcdN != null && (margin = perpetualFARcdN.getMargin()) != null) {
                if (!(!margin.isEmpty())) {
                    margin = null;
                }
                if (margin != null) {
                    java.lang.String string2 = this.AEQbTJ.getString(C25493ixk.FragmentManager.gasjUx);
                    Intrinsics.checkNotNullExpressionValue(string2, "");
                    java.util.ArrayList arrayList4 = new java.util.ArrayList(C56403yEb.AYXKKw(margin, 10));
                    java.util.Iterator<T> it2 = margin.iterator();
                    while (it2.hasNext()) {
                        arrayList4.add(iZM.AEQbTJ((InvestBaseDefiTokenInfo) it2.next(), j, false, strOLrzqt, investedToken.iwGUEr()));
                    }
                    arrayList.add(new C24224iZm(string2, strCopydefault, arrayList4));
                }
            }
        } else if (productTypeFJNWhG != copydefault) {
            if (!investedToken.getNewProxyInstance().isEmpty()) {
                java.lang.String string3 = this.AEQbTJ.getString(C25493ixk.FragmentManager.FQMcgE);
                Intrinsics.checkNotNullExpressionValue(string3, "");
                java.util.List<InvestBaseDefiTokenInfo> newProxyInstance = investedToken.getNewProxyInstance();
                java.util.ArrayList arrayList5 = new java.util.ArrayList(C56403yEb.AYXKKw(newProxyInstance, 10));
                java.util.Iterator<T> it3 = newProxyInstance.iterator();
                while (it3.hasNext()) {
                    arrayList5.add(iZM.AEQbTJ((InvestBaseDefiTokenInfo) it3.next(), j, false, strOLrzqt, investedToken.iwGUEr()));
                }
                arrayList.add(new C24224iZm(string3, strCopydefault, arrayList5));
            }
            if (!investedToken.AEQbTJ().isEmpty()) {
                java.lang.String string4 = this.AEQbTJ.getString(C25493ixk.FragmentManager.giSNqX);
                Intrinsics.checkNotNullExpressionValue(string4, "");
                java.util.List<InvestBaseDefiTokenInfo> listAEQbTJ = investedToken.AEQbTJ();
                java.util.ArrayList arrayList6 = new java.util.ArrayList(C56403yEb.AYXKKw(listAEQbTJ, 10));
                java.util.Iterator<T> it4 = listAEQbTJ.iterator();
                while (it4.hasNext()) {
                    arrayList6.add(iZM.AEQbTJ((InvestBaseDefiTokenInfo) it4.next(), j, false, strOLrzqt, investedToken.iwGUEr()));
                }
                arrayList.add(new C24224iZm(string4, strCopydefault, arrayList6));
            }
        } else {
            for (InvestExtraAssetData investExtraAssetData : investedToken.EZpvd()) {
                java.lang.String strCopydefault2 = investExtraAssetData.copydefault();
                java.util.List<InvestBaseDefiTokenInfo> listAEQbTJ2 = investExtraAssetData.AEQbTJ();
                if (listAEQbTJ2 == null) {
                    listAhwBna = yDY.AhwBna();
                } else {
                    listAhwBna = new java.util.ArrayList(C56403yEb.AYXKKw(listAEQbTJ2, 10));
                    java.util.Iterator<T> it5 = listAEQbTJ2.iterator();
                    while (it5.hasNext()) {
                        listAhwBna.add(iZM.AEQbTJ((InvestBaseDefiTokenInfo) it5.next(), j, false, strOLrzqt, investedToken.iwGUEr()));
                    }
                }
                arrayList.add(new C24224iZm(strCopydefault2, strCopydefault, listAhwBna));
            }
        }
        java.lang.String strUzCIH = investedToken.uzCIH();
        if (strUzCIH.length() <= 0) {
            strUzCIH = null;
        }
        if (strUzCIH != null) {
            java.lang.String strKWHzl = C27586jxw.OLrzqt.KWHzl(C33129mqd.EZpvd(strUzCIH), (46 & 2) != 0 ? 2 : 0, (46 & 4) == 0 ? 0 : 2, (46 & 8) != 0 ? DisplaySign.AUTO : null, (46 & 16) != 0 ? CurrencyDisplayStyle.CURRENCY_AMOUNT_ONLY : CurrencyDisplayStyle.CURRENCY_SYMBOL_PREFIX, (46 & 32) != 0 ? RoundingMode.DOWN : null);
            java.lang.String string5 = this.AEQbTJ.getString(C25493ixk.FragmentManager.aHXSQp);
            Intrinsics.checkNotNullExpressionValue(string5, "");
            c24229iZr = new C24229iZr(strKWHzl, string5);
        } else {
            c24229iZr = null;
        }
        java.util.List<InvestPositionDetailExtraFieldData> listAYXKKw = investedToken.AYXKKw();
        java.util.ArrayList<InvestPositionDetailExtraFieldData> arrayList7 = new java.util.ArrayList();
        for (java.lang.Object obj : listAYXKKw) {
            if (((InvestPositionDetailExtraFieldData) obj).getFieldName().length() > 0) {
                arrayList7.add(obj);
            }
        }
        java.util.ArrayList arrayList8 = new java.util.ArrayList();
        for (InvestPositionDetailExtraFieldData investPositionDetailExtraFieldData : arrayList7) {
            java.util.List<java.lang.String> fieldValue = investPositionDetailExtraFieldData.getFieldValue();
            C24228iZq c24228iZq = (fieldValue == null || (str = (java.lang.String) CollectionsKt___CollectionsKt.firstOrNull(fieldValue)) == null) ? null : new C24228iZq(investPositionDetailExtraFieldData.getFieldName(), str);
            if (c24228iZq != null) {
                arrayList8.add(c24228iZq);
            }
        }
        java.util.ArrayList arrayList9 = true ^ arrayList8.isEmpty() ? arrayList8 : null;
        if (productTypeFJNWhG == OLrzqt) {
            Perpetual perpetualFARcdN2 = investedToken.fARcdN();
            if (perpetualFARcdN2 == null || (pnl = perpetualFARcdN2.getPnl()) == null || pnl.length() <= 0) {
                pnl = null;
            }
            pairOLrzqt = C56390yDp.OLrzqt(pnl, (perpetualFARcdN2 == null || (tradePair = perpetualFARcdN2.getTradePair()) == null || tradePair.length() <= 0) ? null : tradePair);
        } else {
            pairOLrzqt = C56390yDp.OLrzqt(null, null);
        }
        return new C24230iZs(arrayList, c24229iZr, null, arrayList9, (java.lang.String) pairOLrzqt.component2(), (java.lang.String) pairOLrzqt.component1(), null);
    }

    public final C24230iZs OLrzqt(PositionInfo positionInfo, long j, java.lang.String str) {
        java.util.List listEZpvd;
        InvestAssetPositionType investAssetPositionTypeEZpvd = positionInfo.EZpvd();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.String strCopydefault = iZM.copydefault(this.AEQbTJ, false, false);
        java.util.List<InvestBaseDefiTokenInfo> listAhwBna = positionInfo.AhwBna();
        java.lang.String strOLrzqt = iZM.OLrzqt(listAhwBna != null ? listAhwBna.size() : 0, str);
        if (!positionInfo.AhwBna().isEmpty()) {
            java.lang.String string = this.AEQbTJ.getString(C25493ixk.FragmentManager.FQMcgE);
            Intrinsics.checkNotNullExpressionValue(string, "");
            java.util.List<InvestBaseDefiTokenInfo> listAhwBna2 = positionInfo.AhwBna();
            java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(listAhwBna2, 10));
            java.util.Iterator<T> it = listAhwBna2.iterator();
            while (it.hasNext()) {
                arrayList2.add(iZM.AEQbTJ((InvestBaseDefiTokenInfo) it.next(), j, true, strOLrzqt, str));
            }
            arrayList.add(new C24224iZm(string, strCopydefault, arrayList2));
        }
        C24224iZm c24224iZmAEQbTJ = investAssetPositionTypeEZpvd == InvestAssetPositionType.UNI_V3_POSITION ? iZM.AEQbTJ(positionInfo.isConnected(), this.AEQbTJ, j, true) : null;
        if (investAssetPositionTypeEZpvd != InvestAssetPositionType.EXPIRY_POSITION || positionInfo.djBIcL() == null || positionInfo.djBIcL().length() <= 0) {
            listEZpvd = null;
        } else {
            java.lang.String string2 = this.AEQbTJ.getString(C25493ixk.FragmentManager.hCLrkq);
            Intrinsics.checkNotNullExpressionValue(string2, "");
            listEZpvd = C56402yEa.EZpvd(new C24228iZq(string2, positionInfo.djBIcL()));
        }
        return new C24230iZs(arrayList, null, null, listEZpvd, null, null, c24224iZmAEQbTJ);
    }
}
