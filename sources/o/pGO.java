package o;

import com.google.gson.Gson;
import com.okinc.kline.library.indicator.Expression;
import com.okinc.kline.ui.view.model.IndicatorBean;
import com.okinc.kline.ui.view.model.KlineIndicatorBean;
import com.okinc.kline.ui.view.model.Out;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC37953pGv;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class pGO implements InterfaceC37953pGv {
    public java.lang.String EZpvd(@NotNull java.lang.String str, boolean z) {
        return InterfaceC37953pGv.Application.KWHzl(this, str, z);
    }

    public Out KWHzl(java.lang.Double d, Expression.Parameter parameter) {
        return InterfaceC37953pGv.Application.copydefault(this, d, parameter);
    }

    @Override // o.InterfaceC37953pGv
    public kotlin.Pair<AbstractC36262oVg, java.lang.Boolean> AEQbTJ(@NotNull KlineIndicatorBean klineIndicatorBean) {
        Out ma2;
        Out ma1;
        Out out;
        java.lang.String color;
        Expression.Parameter parameterCopydefault;
        Intrinsics.checkNotNullParameter(klineIndicatorBean, "");
        oVP ovp = new oVP("VOLUME");
        ovp.AkhnZx();
        ovp.fetchVPNInfo();
        IndicatorBean indicatorBean = (IndicatorBean) new Gson().fromJson(klineIndicatorBean.getIndicator(), IndicatorBean.class);
        com.okinc.kline.ui.view.model.Params params = indicatorBean.getParams();
        if (params != null && (out = params.getOut()) != null && (color = out.getColor()) != null && (parameterCopydefault = ovp.copydefault(0)) != null) {
            java.lang.String lowerCase = color.toLowerCase(java.util.Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "");
            parameterCopydefault.setColorTemp(lowerCase);
        }
        com.okinc.kline.ui.view.model.Params params2 = indicatorBean.getParams();
        if (params2 != null && (ma1 = params2.getMa1()) != null) {
            java.lang.Double value = ma1.getValue();
            if (value != null) {
                double dDoubleValue = value.doubleValue();
                Expression.Parameter parameterEZpvd = ovp.EZpvd(0);
                if (parameterEZpvd != null) {
                    parameterEZpvd.setTempValue(dDoubleValue);
                }
            }
            Expression.Parameter parameterCopydefault2 = ovp.copydefault(1);
            if (parameterCopydefault2 != null) {
                java.lang.String color2 = ma1.getColor();
                if (color2 != null) {
                    java.lang.String lowerCase2 = color2.toLowerCase(java.util.Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(lowerCase2, "");
                    parameterCopydefault2.setColorTemp(lowerCase2);
                }
                parameterCopydefault2.setColorBlkTemp(ma1.getColorBlk());
                java.lang.Double lineWidth = ma1.getLineWidth();
                if (lineWidth != null) {
                    parameterCopydefault2.setLineWidth(lineWidth.doubleValue());
                }
                java.lang.Boolean visible = ma1.getVisible();
                if (visible != null) {
                    parameterCopydefault2.setIsShowTemp(visible.booleanValue());
                }
            }
        }
        com.okinc.kline.ui.view.model.Params params3 = indicatorBean.getParams();
        if (params3 != null && (ma2 = params3.getMa2()) != null) {
            java.lang.Double value2 = ma2.getValue();
            if (value2 != null) {
                double dDoubleValue2 = value2.doubleValue();
                Expression.Parameter parameterEZpvd2 = ovp.EZpvd(1);
                if (parameterEZpvd2 != null) {
                    parameterEZpvd2.setTempValue(dDoubleValue2);
                }
            }
            Expression.Parameter parameterCopydefault3 = ovp.copydefault(2);
            if (parameterCopydefault3 != null) {
                java.lang.String color3 = ma2.getColor();
                if (color3 != null) {
                    java.lang.String lowerCase3 = color3.toLowerCase(java.util.Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(lowerCase3, "");
                    parameterCopydefault3.setColorTemp(lowerCase3);
                }
                parameterCopydefault3.setColorBlkTemp(ma2.getColorBlk());
                java.lang.Double lineWidth2 = ma2.getLineWidth();
                if (lineWidth2 != null) {
                    parameterCopydefault3.setLineWidth(lineWidth2.doubleValue());
                }
                java.lang.Boolean visible2 = ma2.getVisible();
                if (visible2 != null) {
                    parameterCopydefault3.setIsShowTemp(visible2.booleanValue());
                }
            }
        }
        ovp.EZpvd();
        ovp.fJNWhG();
        java.lang.String strEjfBZ = ovp.ejfBZ();
        Intrinsics.checkNotNullExpressionValue(strEjfBZ, "");
        C36278oVw.KWHzl("ds0", EZpvd(strEjfBZ, indicatorBean.getMain()), ovp.AuCTel());
        ovp.copydefault();
        java.lang.String strEjfBZ2 = ovp.ejfBZ();
        Intrinsics.checkNotNullExpressionValue(strEjfBZ2, "");
        C36278oVw.copydefault("ds0", EZpvd(strEjfBZ2, indicatorBean.getMain()), new Gson().toJson(ovp.isConnected()));
        return new kotlin.Pair<>(ovp, java.lang.Boolean.valueOf(indicatorBean.getMain()));
    }

    @Override // o.InterfaceC37953pGv
    public java.lang.String OLrzqt(@NotNull AbstractC36262oVg abstractC36262oVg, @NotNull IndicatorBean indicatorBean, boolean z) {
        double dDivD$default;
        Intrinsics.checkNotNullParameter(abstractC36262oVg, "");
        Intrinsics.checkNotNullParameter(indicatorBean, "");
        com.okinc.kline.ui.view.model.Params params = indicatorBean.getParams();
        if (params == null) {
            params = new com.okinc.kline.ui.view.model.Params(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 32767, null);
            Expression.Parameter parameterCopydefault = abstractC36262oVg.copydefault(0);
            if (indicatorBean.getMain()) {
                dDivD$default = C33129mqd.divD$default(java.lang.Integer.valueOf(C36246oUr.copydefault().ffGIBT()), 255, null, null, null, 14, null);
            } else {
                dDivD$default = C33129mqd.divD$default(java.lang.Integer.valueOf(C36246oUr.copydefault().QkdxfA()), 255, null, null, null, 14, null);
            }
            params.setOut(new Out(null, parameterCopydefault != null ? parameterCopydefault.getColor() : null, null, java.lang.Boolean.TRUE, java.lang.Double.valueOf(dDivD$default), null, 32, null));
            params.setMa1(KWHzl(java.lang.Double.valueOf(abstractC36262oVg.EZpvd(0).getValue()), abstractC36262oVg.copydefault(1)));
            params.setMa2(KWHzl(java.lang.Double.valueOf(abstractC36262oVg.EZpvd(1).getValue()), abstractC36262oVg.copydefault(2)));
        }
        indicatorBean.setParams(params);
        indicatorBean.setVisible(java.lang.Boolean.valueOf(z));
        return new Gson().toJson(indicatorBean);
    }
}
