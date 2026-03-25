package o;

import com.google.gson.Gson;
import com.okinc.kline.library.indicator.Expression;
import com.okinc.kline.ui.view.model.IndicatorBean;
import com.okinc.kline.ui.view.model.KlineIndicatorBean;
import com.okinc.kline.ui.view.model.Length;
import com.okinc.kline.ui.view.model.Out;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC37953pGv;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pGs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C37950pGs implements InterfaceC37953pGv {
    public final java.lang.String EZpvd = "EnvelopeIndicatorJsonManage";

    public Out EZpvd(Expression.Parameter parameter) {
        return InterfaceC37953pGv.Application.EZpvd(this, parameter);
    }

    public void EZpvd(Out out, Expression.Parameter parameter) {
        InterfaceC37953pGv.Application.OLrzqt(this, out, parameter);
    }

    public java.lang.String copydefault(@NotNull java.lang.String str, boolean z) {
        return InterfaceC37953pGv.Application.KWHzl(this, str, z);
    }

    @Override // o.InterfaceC37953pGv
    public kotlin.Pair<AbstractC36262oVg, java.lang.Boolean> AEQbTJ(@NotNull KlineIndicatorBean klineIndicatorBean) {
        Out background;
        Expression.Parameter parameterCopydefault;
        Out lower;
        Expression.Parameter parameterCopydefault2;
        Out upper;
        Expression.Parameter parameterCopydefault3;
        Length lookback;
        java.lang.Double value;
        Length mult;
        java.lang.Double value2;
        Length length;
        java.lang.Double value3;
        Intrinsics.checkNotNullParameter(klineIndicatorBean, "");
        C36277oVv c36277oVv = new C36277oVv("ENVELOPE");
        c36277oVv.AkhnZx();
        c36277oVv.fetchVPNInfo();
        IndicatorBean indicatorBean = (IndicatorBean) new Gson().fromJson(klineIndicatorBean.getIndicator(), IndicatorBean.class);
        try {
            com.okinc.kline.ui.view.model.Params params = indicatorBean.getParams();
            if (params != null && (length = params.getLength()) != null && (value3 = length.getValue()) != null) {
                double dDoubleValue = value3.doubleValue();
                Expression.Parameter parameterEZpvd = c36277oVv.EZpvd(0);
                if (parameterEZpvd != null) {
                    parameterEZpvd.setTempValue(dDoubleValue);
                }
            }
            com.okinc.kline.ui.view.model.Params params2 = indicatorBean.getParams();
            if (params2 != null && (mult = params2.getMult()) != null && (value2 = mult.getValue()) != null) {
                double dDoubleValue2 = value2.doubleValue();
                Expression.Parameter parameterEZpvd2 = c36277oVv.EZpvd(1);
                if (parameterEZpvd2 != null) {
                    parameterEZpvd2.setTempValue(dDoubleValue2);
                }
            }
            com.okinc.kline.ui.view.model.Params params3 = indicatorBean.getParams();
            if (params3 != null && (lookback = params3.getLookback()) != null && (value = lookback.getValue()) != null) {
                double dDoubleValue3 = value.doubleValue();
                Expression.Parameter parameterEZpvd3 = c36277oVv.EZpvd(2);
                if (parameterEZpvd3 != null) {
                    parameterEZpvd3.setTempValue(dDoubleValue3);
                }
            }
            com.okinc.kline.ui.view.model.Params params4 = indicatorBean.getParams();
            if (params4 != null && (upper = params4.getUpper()) != null && (parameterCopydefault3 = c36277oVv.copydefault(0)) != null) {
                EZpvd(upper, parameterCopydefault3);
            }
            com.okinc.kline.ui.view.model.Params params5 = indicatorBean.getParams();
            if (params5 != null && (lower = params5.getLower()) != null && (parameterCopydefault2 = c36277oVv.copydefault(1)) != null) {
                EZpvd(lower, parameterCopydefault2);
            }
            com.okinc.kline.ui.view.model.Params params6 = indicatorBean.getParams();
            if (params6 != null && (background = params6.getBackground()) != null && (parameterCopydefault = c36277oVv.copydefault(2)) != null) {
                java.lang.String color = background.getColor();
                if (color != null) {
                    kotlin.Pair<java.lang.String, java.lang.Integer> pairKWHzl = pEL.OLrzqt.KWHzl(color);
                    java.lang.String lowerCase = pairKWHzl.getFirst().toLowerCase(java.util.Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(lowerCase, "");
                    parameterCopydefault.setColorTemp(lowerCase);
                    parameterCopydefault.setTransparencyTemp(pairKWHzl.getSecond().intValue());
                }
                parameterCopydefault.setColorBlkTemp(background.getColorBlk());
                parameterCopydefault.setIsShowTemp(background.getVisible() == null || Intrinsics.EZpvd(background.getVisible(), java.lang.Boolean.TRUE));
            }
        } catch (java.lang.Exception e) {
            pUU.copydefault(this.EZpvd, "handleJsonData: " + e);
        }
        c36277oVv.EZpvd();
        c36277oVv.fJNWhG();
        java.lang.String strEjfBZ = c36277oVv.ejfBZ();
        Intrinsics.checkNotNullExpressionValue(strEjfBZ, "");
        C36278oVw.KWHzl("ds0", copydefault(strEjfBZ, indicatorBean.getMain()), c36277oVv.AuCTel());
        c36277oVv.copydefault();
        java.lang.String strEjfBZ2 = c36277oVv.ejfBZ();
        Intrinsics.checkNotNullExpressionValue(strEjfBZ2, "");
        C36278oVw.copydefault("ds0", copydefault(strEjfBZ2, indicatorBean.getMain()), new Gson().toJson(c36277oVv.isConnected()));
        return new kotlin.Pair<>(c36277oVv, java.lang.Boolean.valueOf(indicatorBean.getMain()));
    }

    @Override // o.InterfaceC37953pGv
    public java.lang.String OLrzqt(@NotNull AbstractC36262oVg abstractC36262oVg, @NotNull IndicatorBean indicatorBean, boolean z) {
        java.lang.String color;
        Intrinsics.checkNotNullParameter(abstractC36262oVg, "");
        Intrinsics.checkNotNullParameter(indicatorBean, "");
        com.okinc.kline.ui.view.model.Params params = indicatorBean.getParams();
        if (params == null) {
            params = new com.okinc.kline.ui.view.model.Params(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 32767, null);
            try {
                Expression.Parameter parameterEZpvd = abstractC36262oVg.EZpvd(0);
                params.setLength(new Length(parameterEZpvd != null ? java.lang.Double.valueOf(parameterEZpvd.getValue()) : null));
                Expression.Parameter parameterEZpvd2 = abstractC36262oVg.EZpvd(1);
                params.setMult(new Length(parameterEZpvd2 != null ? java.lang.Double.valueOf(parameterEZpvd2.getValue()) : null));
                Expression.Parameter parameterEZpvd3 = abstractC36262oVg.EZpvd(2);
                params.setLookback(new Length(parameterEZpvd3 != null ? java.lang.Double.valueOf(parameterEZpvd3.getValue()) : null));
                params.setUpper(EZpvd(abstractC36262oVg.copydefault(0)));
                params.setLower(EZpvd(abstractC36262oVg.copydefault(1)));
                Expression.Parameter parameterCopydefault = abstractC36262oVg.copydefault(2);
                pEL pel = pEL.OLrzqt;
                if (parameterCopydefault == null || (color = parameterCopydefault.getColor()) == null) {
                    color = "#FFA726";
                }
                java.lang.String strKWHzl = pel.KWHzl(color, parameterCopydefault != null ? parameterCopydefault.getTransparency() : 20);
                boolean isShow = parameterCopydefault.getIsShow();
                java.lang.String colorBlk = parameterCopydefault.getColorBlk();
                params.setBackground(new Out(null, strKWHzl, null, java.lang.Boolean.valueOf(isShow), null, colorBlk == null ? "" : colorBlk, 16, null));
            } catch (java.lang.Exception e) {
                pUU.copydefault(this.EZpvd, "indicator2Json: " + e);
            }
        }
        indicatorBean.setParams(params);
        indicatorBean.setVisible(java.lang.Boolean.valueOf(z));
        return new Gson().toJson(indicatorBean);
    }
}
