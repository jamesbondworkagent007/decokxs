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

/* JADX INFO: loaded from: classes9.dex */
public final class pGD implements InterfaceC37953pGv {
    public final java.lang.String KWHzl = "MACDIndicatorJsonManage";

    public void AEQbTJ(Out out, Expression.Parameter parameter) {
        InterfaceC37953pGv.Application.OLrzqt(this, out, parameter);
    }

    public java.lang.String EZpvd(@NotNull java.lang.String str, boolean z) {
        return InterfaceC37953pGv.Application.KWHzl(this, str, z);
    }

    public Out KWHzl(Expression.Parameter parameter) {
        return InterfaceC37953pGv.Application.EZpvd(this, parameter);
    }

    @Override // o.InterfaceC37953pGv
    public kotlin.Pair<AbstractC36262oVg, java.lang.Boolean> AEQbTJ(@NotNull KlineIndicatorBean klineIndicatorBean) {
        Out histogram;
        Expression.Parameter parameterCopydefault;
        Out signal;
        Expression.Parameter parameterCopydefault2;
        Out macd;
        Expression.Parameter parameterCopydefault3;
        Length signalLength;
        java.lang.Double value;
        Length slowLength;
        java.lang.Double value2;
        Length fastLength;
        java.lang.Double value3;
        Intrinsics.checkNotNullParameter(klineIndicatorBean, "");
        oVC ovc = new oVC("MACD");
        ovc.AkhnZx();
        ovc.fetchVPNInfo();
        IndicatorBean indicatorBean = (IndicatorBean) new Gson().fromJson(klineIndicatorBean.getIndicator(), IndicatorBean.class);
        try {
            com.okinc.kline.ui.view.model.Params params = indicatorBean.getParams();
            if (params != null && (fastLength = params.getFastLength()) != null && (value3 = fastLength.getValue()) != null) {
                double dDoubleValue = value3.doubleValue();
                Expression.Parameter parameterEZpvd = ovc.EZpvd(0);
                if (parameterEZpvd != null) {
                    parameterEZpvd.setTempValue(dDoubleValue);
                }
            }
            com.okinc.kline.ui.view.model.Params params2 = indicatorBean.getParams();
            if (params2 != null && (slowLength = params2.getSlowLength()) != null && (value2 = slowLength.getValue()) != null) {
                double dDoubleValue2 = value2.doubleValue();
                Expression.Parameter parameterEZpvd2 = ovc.EZpvd(1);
                if (parameterEZpvd2 != null) {
                    parameterEZpvd2.setTempValue(dDoubleValue2);
                }
            }
            com.okinc.kline.ui.view.model.Params params3 = indicatorBean.getParams();
            if (params3 != null && (signalLength = params3.getSignalLength()) != null && (value = signalLength.getValue()) != null) {
                double dDoubleValue3 = value.doubleValue();
                Expression.Parameter parameterEZpvd3 = ovc.EZpvd(2);
                if (parameterEZpvd3 != null) {
                    parameterEZpvd3.setTempValue(dDoubleValue3);
                }
            }
            com.okinc.kline.ui.view.model.Params params4 = indicatorBean.getParams();
            if (params4 != null && (macd = params4.getMacd()) != null && (parameterCopydefault3 = ovc.copydefault(0)) != null) {
                AEQbTJ(macd, parameterCopydefault3);
            }
            com.okinc.kline.ui.view.model.Params params5 = indicatorBean.getParams();
            if (params5 != null && (signal = params5.getSignal()) != null && (parameterCopydefault2 = ovc.copydefault(1)) != null) {
                AEQbTJ(signal, parameterCopydefault2);
            }
            com.okinc.kline.ui.view.model.Params params6 = indicatorBean.getParams();
            if (params6 != null && (histogram = params6.getHistogram()) != null && (parameterCopydefault = ovc.copydefault(2)) != null) {
                AEQbTJ(histogram, parameterCopydefault);
            }
        } catch (java.lang.Exception e) {
            pUU.copydefault(this.KWHzl, "handleJsonData: " + e);
        }
        ovc.EZpvd();
        ovc.fJNWhG();
        java.lang.String strEjfBZ = ovc.ejfBZ();
        Intrinsics.checkNotNullExpressionValue(strEjfBZ, "");
        C36278oVw.KWHzl("ds0", EZpvd(strEjfBZ, indicatorBean.getMain()), ovc.AuCTel());
        ovc.copydefault();
        java.lang.String strEjfBZ2 = ovc.ejfBZ();
        Intrinsics.checkNotNullExpressionValue(strEjfBZ2, "");
        C36278oVw.copydefault("ds0", EZpvd(strEjfBZ2, indicatorBean.getMain()), new Gson().toJson(ovc.isConnected()));
        return new kotlin.Pair<>(ovc, java.lang.Boolean.valueOf(indicatorBean.getMain()));
    }

    @Override // o.InterfaceC37953pGv
    public java.lang.String OLrzqt(@NotNull AbstractC36262oVg abstractC36262oVg, @NotNull IndicatorBean indicatorBean, boolean z) {
        Intrinsics.checkNotNullParameter(abstractC36262oVg, "");
        Intrinsics.checkNotNullParameter(indicatorBean, "");
        com.okinc.kline.ui.view.model.Params params = indicatorBean.getParams();
        if (params == null) {
            params = new com.okinc.kline.ui.view.model.Params(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 32767, null);
            try {
                Expression.Parameter parameterEZpvd = abstractC36262oVg.EZpvd(0);
                params.setFastLength(new Length(parameterEZpvd != null ? java.lang.Double.valueOf(parameterEZpvd.getValue()) : null));
                Expression.Parameter parameterEZpvd2 = abstractC36262oVg.EZpvd(1);
                params.setSlowLength(new Length(parameterEZpvd2 != null ? java.lang.Double.valueOf(parameterEZpvd2.getValue()) : null));
                Expression.Parameter parameterEZpvd3 = abstractC36262oVg.EZpvd(2);
                params.setSignalLength(new Length(parameterEZpvd3 != null ? java.lang.Double.valueOf(parameterEZpvd3.getValue()) : null));
                params.setMacd(KWHzl(abstractC36262oVg.copydefault(0)));
                params.setSignal(KWHzl(abstractC36262oVg.copydefault(1)));
                params.setHistogram(KWHzl(abstractC36262oVg.copydefault(2)));
            } catch (java.lang.Exception e) {
                pUU.copydefault(this.KWHzl, "indicator2Json: " + e);
            }
        }
        indicatorBean.setParams(params);
        indicatorBean.setVisible(java.lang.Boolean.valueOf(z));
        return new Gson().toJson(indicatorBean);
    }
}
