package o;

import com.okinc.business.defi.api.bean.CurrencyDisplayStyle;
import com.okinc.business.invest_biz.data.bean.BonusRewards;
import com.okinc.business.invest_biz.data.bean.InvestApyDetailInfo;
import com.okinc.business.invest_biz.data.bean.InvestApySubDetailInfo;
import com.okinc.business.invest_biz.data.bean.InvestBonusRules;
import com.okinc.business.invest_biz.data.bean.InvestRateKeyValue;
import com.okinc.business.invest_biz.data.bean.InvestTipInfoVo;
import com.okinc.business.invest_biz.data.bean.InvestmentBonusInfo;
import com.okinc.business.invest_biz.data.contants.ApyType;
import com.okinc.business.invest_biz.data.models.InvestTokenWithAmount;
import java.math.BigDecimal;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import o.C25493ixk;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jdO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C26492jdO {
    public final android.content.Context KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int KWHzl() {
        return C25493ixk.TaskDescription.EZpvd;
    }

    @yCM
    public C26492jdO(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        this.KWHzl = context;
    }

    public final int AEQbTJ() {
        C27569jxf c27569jxf = C27569jxf.OLrzqt;
        int i = C52761wXj.ActionBar.sVXHln;
        android.app.Activity activityAEQbTJ = C54819xWm.KWHzl().AEQbTJ();
        Intrinsics.checkNotNullExpressionValue(activityAEQbTJ, "");
        return c27569jxf.EZpvd(i, activityAEQbTJ);
    }

    public final C26502jdY KWHzl(@NotNull InvestmentBonusInfo investmentBonusInfo) {
        Intrinsics.checkNotNullParameter(investmentBonusInfo, "");
        if (java.lang.System.currentTimeMillis() < investmentBonusInfo.getBonusStartTime()) {
            return OLrzqt(investmentBonusInfo);
        }
        return EZpvd(investmentBonusInfo);
    }

    public final C26502jdY EZpvd(InvestmentBonusInfo investmentBonusInfo) {
        java.lang.String strCopydefault = copydefault(investmentBonusInfo.getBonusRewards());
        java.util.List<InvestApyDetailInfo> apyDetailInfo = investmentBonusInfo.getApyDetailInfo();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(apyDetailInfo, 10));
        int i = 0;
        for (java.lang.Object obj : apyDetailInfo) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            arrayList.add(EZpvd(i, (InvestApyDetailInfo) obj));
            i++;
        }
        java.util.List<InterfaceC27436jvE> listKWHzl = KWHzl(investmentBonusInfo.getApyDetailInfo());
        C27467jvj c27467jvjOLrzqt = OLrzqt();
        java.util.List<C27460jvc> listAEQbTJ = AEQbTJ(investmentBonusInfo.getBonusRules());
        java.lang.String title = investmentBonusInfo.getTitle();
        if (title == null) {
            title = this.KWHzl.getString(C25493ixk.FragmentManager.zLjUOn);
            Intrinsics.checkNotNullExpressionValue(title, "");
        }
        java.lang.String str = title;
        java.lang.String bonusDes = investmentBonusInfo.getBonusDes();
        long bonusEndTime = investmentBonusInfo.getBonusEndTime();
        long bonusStartTime = investmentBonusInfo.getBonusStartTime();
        java.lang.String strLocalizeLargeValueStrategy$default = C27586jxw.localizeLargeValueStrategy$default(C27586jxw.OLrzqt, C33129mqd.EZpvd(investmentBonusInfo.getBonusTotalAmount()), null, CurrencyDisplayStyle.CURRENCY_SYMBOL_PREFIX, null, 10, null);
        InvestTipInfoVo templateTip = investmentBonusInfo.getTemplateTip();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.addAll(listKWHzl);
        arrayList2.add(new C27433jvB(8.0f));
        arrayList2.add(c27467jvjOLrzqt);
        arrayList2.addAll(listAEQbTJ);
        arrayList2.add(new C27433jvB(24.0f));
        return new C26502jdY(0L, 0L, bonusDes, arrayList, arrayList2, bonusEndTime, bonusStartTime, strLocalizeLargeValueStrategy$default, strCopydefault, true, templateTip, str, 3, null);
    }

    public final C26502jdY OLrzqt(InvestmentBonusInfo investmentBonusInfo) {
        java.lang.String string = this.KWHzl.getString(C25493ixk.FragmentManager.getFieldNames);
        Intrinsics.checkNotNullExpressionValue(string, "");
        C27586jxw c27586jxw = C27586jxw.OLrzqt;
        BigDecimal bigDecimalEZpvd = C33129mqd.EZpvd(investmentBonusInfo.getBonusTotalAmount());
        CurrencyDisplayStyle currencyDisplayStyle = CurrencyDisplayStyle.CURRENCY_SYMBOL_PREFIX;
        C27469jvl c27469jvl = new C27469jvl(string, C27586jxw.localizeLargeValueStrategy$default(c27586jxw, bigDecimalEZpvd, null, currencyDisplayStyle, null, 10, null));
        java.util.List<C27463jvf> listEZpvd = EZpvd(investmentBonusInfo.getBonusRewards());
        C27467jvj c27467jvjOLrzqt = OLrzqt();
        java.util.List<C27460jvc> listAEQbTJ = AEQbTJ(investmentBonusInfo.getBonusRules());
        java.lang.String bonusDes = investmentBonusInfo.getBonusDes();
        long bonusEndTime = investmentBonusInfo.getBonusEndTime();
        long bonusStartTime = investmentBonusInfo.getBonusStartTime();
        java.lang.String strLocalizeLargeValueStrategy$default = C27586jxw.localizeLargeValueStrategy$default(c27586jxw, C33129mqd.EZpvd(investmentBonusInfo.getBonusTotalAmount()), null, currencyDisplayStyle, null, 10, null);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(c27469jvl);
        arrayList.add(new C27433jvB(8.0f));
        arrayList.addAll(listEZpvd);
        arrayList.add(c27467jvjOLrzqt);
        arrayList.addAll(listAEQbTJ);
        arrayList.add(new C27433jvB(24.0f));
        return new C26502jdY(0L, 0L, bonusDes, null, arrayList, bonusEndTime, bonusStartTime, strLocalizeLargeValueStrategy$default, null, false, null, null, 3339, null);
    }

    public final java.util.List<InterfaceC27436jvE> KWHzl(java.util.List<InvestApyDetailInfo> list) {
        int iKWHzl;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        for (InvestApyDetailInfo investApyDetailInfo : list) {
            for (InvestApySubDetailInfo investApySubDetailInfo : investApyDetailInfo.getSubDetailInfoList()) {
                ApyType type = investApyDetailInfo.getType();
                java.lang.String subTitle = investApySubDetailInfo.getSubTitle();
                java.lang.String strEZpvd = C27492jwH.OLrzqt.EZpvd(investApySubDetailInfo.getRate());
                if (investApyDetailInfo.getType() == ApyType.BaseApy) {
                    iKWHzl = AEQbTJ();
                } else {
                    iKWHzl = KWHzl();
                }
                arrayList.add(new C27466jvi(subTitle, strEZpvd, type, true, java.lang.Integer.valueOf(iKWHzl), investApySubDetailInfo.getTemplateTip()));
                for (InvestRateKeyValue investRateKeyValue : investApySubDetailInfo.getKeyValueList()) {
                    arrayList.add(new C27468jvk(investRateKeyValue.getLogo(), investApyDetailInfo.getType(), investRateKeyValue.getKey(), C27492jwH.OLrzqt.EZpvd(investRateKeyValue.getValue()), true, investRateKeyValue.getTemplateTip()));
                }
            }
            arrayList2.add(Unit.INSTANCE);
        }
        return arrayList;
    }

    public final C27390juL EZpvd(int i, InvestApyDetailInfo investApyDetailInfo) {
        int iAEQbTJ;
        java.lang.String title = investApyDetailInfo.getTitle();
        float fDjBIcL = C33129mqd.djBIcL(investApyDetailInfo.getRate());
        if (investApyDetailInfo.getType() == ApyType.BonusApy) {
            iAEQbTJ = KWHzl();
        } else {
            iAEQbTJ = AEQbTJ();
        }
        return new C27390juL(fDjBIcL, title, iAEQbTJ, null, investApyDetailInfo.getType(), 8, null);
    }

    public final java.lang.String copydefault(java.util.List<BonusRewards> list) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.util.ArrayList<InvestTokenWithAmount> arrayList = new java.util.ArrayList();
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            C56406yEe.KWHzl(arrayList, ((BonusRewards) it.next()).OLrzqt());
        }
        java.util.ArrayList<java.lang.String> arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList, 10));
        for (InvestTokenWithAmount investTokenWithAmount : arrayList) {
            C27586jxw c27586jxw = C27586jxw.OLrzqt;
            arrayList2.add(C27586jxw.localizeCryptoAmount$default(c27586jxw, C33129mqd.EZpvd(investTokenWithAmount.getCoinAmount()), 0, c27586jxw.OLrzqt(java.lang.Long.valueOf(investTokenWithAmount.getChainId()), investTokenWithAmount.getTokenAddress()), null, null, null, 58, null) + " " + investTokenWithAmount.getTokenSymbol());
        }
        for (java.lang.String str : arrayList2) {
            if (sb.length() > 0) {
                sb.append(" + ");
            }
            sb.append(str);
        }
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public final C27467jvj OLrzqt() {
        java.lang.String string = this.KWHzl.getString(C25493ixk.FragmentManager.uzCIH);
        Intrinsics.checkNotNullExpressionValue(string, "");
        return new C27467jvj(null, string, 0, 5, null);
    }

    public final java.util.List<C27460jvc> AEQbTJ(InvestBonusRules investBonusRules) {
        if (investBonusRules != null) {
            int i = 0;
            boolean z = investBonusRules.getBonusRulesTips().size() == 1;
            java.util.List<InvestTipInfoVo> bonusRulesTips = investBonusRules.getBonusRulesTips();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : bonusRulesTips) {
                int i2 = i + 1;
                if (i < 0) {
                    yDY.AYXKKw();
                }
                InvestTipInfoVo investTipInfoVo = (InvestTipInfoVo) obj;
                java.util.List listOLrzqt = C56402yEa.OLrzqt();
                java.lang.String tipContent = investTipInfoVo != null ? investTipInfoVo.getTipContent() : null;
                if (tipContent == null) {
                    tipContent = "";
                }
                listOLrzqt.add(new C27460jvc(tipContent, null, i2, 0, z, 10, null));
                C56406yEe.KWHzl(arrayList, C56402yEa.fARcdN(listOLrzqt));
                i = i2;
            }
            return arrayList;
        }
        return yDY.AhwBna();
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.jxw.localizeCryptoAmount$default(o.jxw, java.math.BigDecimal, int, int, java.lang.String, com.okinc.localization.util.format.DisplaySign, java.math.RoundingMode, int, java.lang.Object):java.lang.String */
    public final java.util.List<C27463jvf> EZpvd(java.util.List<BonusRewards> list) {
        java.util.ArrayList<InvestTokenWithAmount> arrayList = new java.util.ArrayList();
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            C56406yEe.KWHzl(arrayList, ((BonusRewards) it.next()).OLrzqt());
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (InvestTokenWithAmount investTokenWithAmount : arrayList) {
            java.util.List listOLrzqt = C56402yEa.OLrzqt();
            java.lang.String tokenLogo = investTokenWithAmount.getTokenLogo();
            C27586jxw c27586jxw = C27586jxw.OLrzqt;
            listOLrzqt.add(new C27463jvf(tokenLogo, C27586jxw.localizeCryptoAmount$default(c27586jxw, C33129mqd.EZpvd(investTokenWithAmount.getCoinAmount()), 0, c27586jxw.OLrzqt(java.lang.Long.valueOf(investTokenWithAmount.getChainId()), investTokenWithAmount.getTokenAddress()), null, null, null, 58, null), investTokenWithAmount.getTokenSymbol(), C27492jwH.formatCurrencyData$default(C27492jwH.OLrzqt, investTokenWithAmount.getCurrencyAmount(), null, null, java.lang.Boolean.TRUE, 6, null)));
            C56406yEe.KWHzl(arrayList2, C56402yEa.fARcdN(listOLrzqt));
        }
        return arrayList2;
    }
}
