package o;

import android.graphics.RectF;
import com.github.mikephil.charting.data.ChartData;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.highlight.Highlight;
import com.okinc.localization.util.format.OKDateEnum;
import com.okinc.localization.util.format.OKTimeEnum;
import com.okinc.unify_trade.biz.ProfitMarginPerCcyVo;
import com.okinc.unify_trade.biz.StrategyProfitResponse;
import com.okinc.unify_trade.biz.TradeCoinInfo;
import java.math.BigDecimal;
import java.util.Date;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C48033uCm;
import o.C52761wXj;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wQr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C52580wQr extends AbstractC52587wQy {
    public RectF AEQbTJ;
    public double AYXKKw;
    public java.lang.String EZpvd;
    public java.lang.String KWHzl;
    public java.lang.String OLrzqt;
    public java.lang.String copydefault;
    public boolean gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.view.View
    public boolean onTouchEvent(@NotNull android.view.MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(motionEvent, "");
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C52580wQr(@NotNull android.content.Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
        this.AYXKKw = 1.0d;
        this.AEQbTJ = new RectF();
    }

    @Override // o.AbstractC52582wQt
    public java.util.ArrayList<java.lang.Integer> KWHzl() {
        int iTradeFallGraph$default;
        java.lang.Integer[] numArr = new java.lang.Integer[1];
        if (this.AYXKKw > -1.0E-9d) {
            C33512mxp c33512mxp = C33512mxp.AEQbTJ;
            android.content.Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            iTradeFallGraph$default = C33512mxp.tradeRiseGraph$default(c33512mxp, context, 0.0f, 2, null);
        } else {
            C33512mxp c33512mxp2 = C33512mxp.AEQbTJ;
            android.content.Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            iTradeFallGraph$default = C33512mxp.tradeFallGraph$default(c33512mxp2, context2, 0.0f, 2, null);
        }
        numArr[0] = java.lang.Integer.valueOf(iTradeFallGraph$default);
        return yDY.copydefault(numArr);
    }

    public final void copydefault(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, double d, boolean z) {
        int iTradeFallGraph$default;
        this.KWHzl = str;
        this.OLrzqt = str2;
        this.EZpvd = str3;
        this.copydefault = str4;
        this.AYXKKw = d;
        this.gEmmrt = z;
        android.graphics.Paint paintAEQbTJ = AEQbTJ();
        if (d > -1.0E-9d) {
            C33512mxp c33512mxp = C33512mxp.AEQbTJ;
            android.content.Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            iTradeFallGraph$default = C33512mxp.tradeRiseGraph$default(c33512mxp, context, 0.0f, 2, null);
        } else {
            C33512mxp c33512mxp2 = C33512mxp.AEQbTJ;
            android.content.Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            iTradeFallGraph$default = C33512mxp.tradeFallGraph$default(c33512mxp2, context2, 0.0f, 2, null);
        }
        paintAEQbTJ.setColor(iTradeFallGraph$default);
    }

    public final boolean AEQbTJ(float f, float f2) {
        this.AEQbTJ.set(EZpvd().x - (getWidth() / 2.0f), EZpvd().y, EZpvd().x + (getWidth() / 2.0f), EZpvd().y + getHeight());
        return this.AEQbTJ.contains(f, f2);
    }

    public final void copydefault() {
        EZpvd().x = 0.0f;
        EZpvd().y = 0.0f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [94=4] */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006d  */
    @Override // o.AbstractC52582wQt, com.github.mikephil.charting.components.MarkerView, com.github.mikephil.charting.components.IMarker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void refreshContent(Entry entry, Highlight highlight) {
        java.lang.String totalPnl;
        java.lang.String str;
        java.lang.String strOLrzqt;
        java.lang.String str2;
        java.util.List listSplit$default;
        if (entry != null) {
            ChartData data = getChartView().getData();
            Intrinsics.copydefault(data, "");
            java.lang.String str3 = this.copydefault;
            if (str3 != null) {
                switch (str3.hashCode()) {
                    case -1831183611:
                        if (!str3.equals("spot_dca")) {
                            C33070mpX.AYXKKw(C55688xof.Application.ReportDrawnCompositionobserveReporter1);
                        } else {
                            C33070mpX.AYXKKw(C55688xof.Application.RlQdEF);
                        }
                        break;
                    case -1402017003:
                        if (str3.equals("contract_dca")) {
                            C33070mpX.AYXKKw(C55688xof.Application.DcMfJKOmnske);
                            break;
                        }
                        break;
                    case -1216369070:
                        if (str3.equals("smart_portfolio")) {
                            C33070mpX.AYXKKw(C55688xof.Application.f1070api);
                            break;
                        }
                        break;
                    case -1086683216:
                        if (!str3.equals("signal_bot")) {
                        }
                        break;
                    case -557961837:
                        if (!str3.equals("smart_arbitrage")) {
                        }
                        break;
                    case 1165749981:
                        if (str3.equals("recurring")) {
                            C33070mpX.AYXKKw(C55688xof.Application.fromCustomAction);
                            break;
                        }
                        break;
                }
                java.util.List<java.lang.String> listAhwBna = yDY.AhwBna(C33070mpX.AYXKKw(C48033uCm.Fragment.sZqaRl), C33070mpX.AYXKKw(C55688xof.Application.setErrorMessage), C33070mpX.AYXKKw(C55688xof.Application.AnimatorRes));
                java.lang.Object data2 = entry.getData();
                StrategyProfitResponse strategyProfitResponse = data2 instanceof StrategyProfitResponse ? (StrategyProfitResponse) data2 : null;
                if (strategyProfitResponse != null) {
                    java.lang.String str4 = StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strategyProfitResponse.getCTime()) ? "--" : pTA.format$default(new Date(java.lang.Long.parseLong(strategyProfitResponse.getCTime())), OKDateEnum.DATE_FORMAT_SIMPLE_MD, OKTimeEnum.TIME_FORMAT_SIMPLE_HM, null, null, false, 28, null);
                    if (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strategyProfitResponse.getTotalPnl())) {
                        totalPnl = "--";
                    } else if (Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) "recurring") || Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) "smart_portfolio")) {
                        if (C33129mqd.OLrzqt((java.lang.CharSequence) this.KWHzl)) {
                            java.lang.String str5 = this.KWHzl;
                            java.lang.String str6 = str5 == null ? "" : str5;
                            java.lang.String str7 = this.OLrzqt;
                            java.lang.String str8 = str7 == null ? "" : str7;
                            java.lang.String totalPnl2 = strategyProfitResponse.getTotalPnl();
                            java.lang.String str9 = this.EZpvd;
                            totalPnl = C56033xvF.getBotPnl$default(str6, str8, totalPnl2, str9 == null ? "" : str9, false, true, null, false, null, null, null, 1792, null);
                        } else {
                            totalPnl = strategyProfitResponse.getTotalPnl();
                        }
                    } else if (this.KWHzl == null || this.OLrzqt == null) {
                        totalPnl = OLrzqt(this, strategyProfitResponse);
                    } else {
                        if (!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strategyProfitResponse.getSourceCcy())) {
                            java.lang.String str10 = this.KWHzl;
                            if (str10 == null || (listSplit$default = StringsKt__StringsKt.split$default((java.lang.CharSequence) str10, new java.lang.String[]{"-"}, false, 0, 6, (java.lang.Object) null)) == null || (str2 = (java.lang.String) CollectionsKt___CollectionsKt.AkhnZx(listSplit$default, 1)) == null) {
                                str2 = "BTC";
                            }
                            str = str2 + "-" + strategyProfitResponse.getSourceCcy();
                            strOLrzqt = strategyProfitResponse.getTotalPnlInSourceCcy();
                        } else {
                            str = this.KWHzl;
                            strOLrzqt = OLrzqt(this, strategyProfitResponse);
                        }
                        java.lang.String str11 = strOLrzqt;
                        java.lang.String str12 = str == null ? "" : str;
                        java.lang.String str13 = this.OLrzqt;
                        totalPnl = C56033xvF.getBotPnl$default(str12, str13 == null ? "" : str13, str11, "", false, true, copydefault(this), false, this.EZpvd, null, null, 1536, null);
                    }
                    java.lang.String strCopydefault = copydefault(this, strategyProfitResponse);
                    java.lang.String strFmtBotPnlPercent$default = StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strCopydefault) ? "--" : C56033xvF.fmtBotPnlPercent$default(strCopydefault, true, 0, 4, null);
                    setLeftTitleText(listAhwBna);
                    setContents(C52581wQs.EZpvd("", str4, C33070mpX.copydefault(C52761wXj.Activity.fdOvFl)), C52581wQs.EZpvd("", totalPnl, copydefault(totalPnl)), C52581wQs.EZpvd("", strFmtBotPnlPercent$default, copydefault(strCopydefault)));
                } else {
                    setLeftTitleText(listAhwBna);
                    setContents(C52581wQs.EZpvd("", "--", C33070mpX.copydefault(C52761wXj.Activity.fdOvFl)), C52581wQs.EZpvd("", "--", C33070mpX.copydefault(C52761wXj.Activity.fdOvFl)), C52581wQs.EZpvd("", "--", C33070mpX.copydefault(C52761wXj.Activity.fdOvFl)));
                }
            }
        }
        super.refreshContent(entry, highlight);
    }

    public static final java.lang.String OLrzqt(C52580wQr c52580wQr, StrategyProfitResponse strategyProfitResponse) {
        java.lang.String totalPnl;
        if (!c52580wQr.gEmmrt) {
            return strategyProfitResponse.getTotalPnl();
        }
        ProfitMarginPerCcyVo profitMarginPerCcyVo = strategyProfitResponse.getMarginPerCcy().get("USDT");
        return (profitMarginPerCcyVo == null || (totalPnl = profitMarginPerCcyVo.getTotalPnl()) == null) ? strategyProfitResponse.getTotalPnl() : totalPnl;
    }

    public static final java.lang.String copydefault(C52580wQr c52580wQr) {
        InterfaceC54581xNr interfaceC54581xNrCopydefault;
        TradeCoinInfo tradeCoinInfoAhwBna;
        if (!c52580wQr.gEmmrt || (interfaceC54581xNrCopydefault = C54589xNz.EZpvd.copydefault()) == null || (tradeCoinInfoAhwBna = interfaceC54581xNrCopydefault.AhwBna("USDT")) == null) {
            return null;
        }
        return tradeCoinInfoAhwBna.getSizeDig();
    }

    public static final java.lang.String copydefault(C52580wQr c52580wQr, StrategyProfitResponse strategyProfitResponse) {
        ProfitMarginPerCcyVo profitMarginPerCcyVo;
        java.lang.String pnlRatio;
        java.lang.String pnlRatio2 = StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strategyProfitResponse.getSourceCcy()) ? strategyProfitResponse.getPnlRatio() : strategyProfitResponse.getPnlRatioInSourceCcy();
        return (!c52580wQr.gEmmrt || (profitMarginPerCcyVo = strategyProfitResponse.getMarginPerCcy().get("USDT")) == null || (pnlRatio = profitMarginPerCcyVo.getPnlRatio()) == null) ? pnlRatio2 : pnlRatio;
    }

    private final int copydefault(java.lang.String str) {
        BigDecimal bigDecimalOLrzqt = pTB.OLrzqt((java.lang.Object) str);
        if (C33129mqd.OLrzqt(bigDecimalOLrzqt, "0")) {
            return C33070mpX.copydefault(C52761wXj.Activity.fdOvFl);
        }
        if (C33129mqd.copydefault((java.lang.Object) bigDecimalOLrzqt, (java.lang.Object) 0)) {
            C33512mxp c33512mxp = C33512mxp.AEQbTJ;
            android.content.Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            return C33512mxp.tradeRiseGraph$default(c33512mxp, context, 0.0f, 2, null);
        }
        C33512mxp c33512mxp2 = C33512mxp.AEQbTJ;
        android.content.Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        return C33512mxp.tradeFallGraph$default(c33512mxp2, context2, 0.0f, 2, null);
    }
}
