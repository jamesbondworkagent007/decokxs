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
public final class pGI implements InterfaceC37953pGv {
    public final java.lang.String AEQbTJ = "SKDJIndicatorJsonManage";

    public Out KWHzl(Expression.Parameter parameter) {
        return InterfaceC37953pGv.Application.EZpvd(this, parameter);
    }

    public java.lang.String KWHzl(@NotNull java.lang.String str, boolean z) {
        return InterfaceC37953pGv.Application.KWHzl(this, str, z);
    }

    public void KWHzl(Out out, Expression.Parameter parameter) {
        InterfaceC37953pGv.Application.OLrzqt(this, out, parameter);
    }

    @Override // o.InterfaceC37953pGv
    public kotlin.Pair<AbstractC36262oVg, java.lang.Boolean> AEQbTJ(@NotNull KlineIndicatorBean klineIndicatorBean) {
        Out d;
        Expression.Parameter parameterCopydefault;
        Out k;
        Expression.Parameter parameterCopydefault2;
        Length smooth;
        java.lang.Double value;
        Length length;
        java.lang.Double value2;
        Intrinsics.checkNotNullParameter(klineIndicatorBean, "");
        oVJ ovj = new oVJ("SKDJ");
        ovj.AkhnZx();
        ovj.fetchVPNInfo();
        IndicatorBean indicatorBean = (IndicatorBean) new Gson().fromJson(klineIndicatorBean.getIndicator(), IndicatorBean.class);
        try {
            com.okinc.kline.ui.view.model.Params params = indicatorBean.getParams();
            if (params != null && (length = params.getLength()) != null && (value2 = length.getValue()) != null) {
                double dDoubleValue = value2.doubleValue();
                Expression.Parameter parameterEZpvd = ovj.EZpvd(0);
                if (parameterEZpvd != null) {
                    parameterEZpvd.setTempValue(dDoubleValue);
                }
            }
            com.okinc.kline.ui.view.model.Params params2 = indicatorBean.getParams();
            if (params2 != null && (smooth = params2.getSmooth()) != null && (value = smooth.getValue()) != null) {
                double dDoubleValue2 = value.doubleValue();
                Expression.Parameter parameterEZpvd2 = ovj.EZpvd(1);
                if (parameterEZpvd2 != null) {
                    parameterEZpvd2.setTempValue(dDoubleValue2);
                }
            }
            com.okinc.kline.ui.view.model.Params params3 = indicatorBean.getParams();
            if (params3 != null && (k = params3.getK()) != null && (parameterCopydefault2 = ovj.copydefault(0)) != null) {
                KWHzl(k, parameterCopydefault2);
            }
            com.okinc.kline.ui.view.model.Params params4 = indicatorBean.getParams();
            if (params4 != null && (d = params4.getD()) != null && (parameterCopydefault = ovj.copydefault(1)) != null) {
                KWHzl(d, parameterCopydefault);
            }
        } catch (java.lang.Exception e) {
            pUU.copydefault(this.AEQbTJ, "handleJsonData: " + e);
        }
        ovj.EZpvd();
        ovj.fJNWhG();
        java.lang.String strEjfBZ = ovj.ejfBZ();
        Intrinsics.checkNotNullExpressionValue(strEjfBZ, "");
        C36278oVw.KWHzl("ds0", KWHzl(strEjfBZ, indicatorBean.getMain()), ovj.AuCTel());
        ovj.copydefault();
        java.lang.String strEjfBZ2 = ovj.ejfBZ();
        Intrinsics.checkNotNullExpressionValue(strEjfBZ2, "");
        C36278oVw.copydefault("ds0", KWHzl(strEjfBZ2, indicatorBean.getMain()), new Gson().toJson(ovj.isConnected()));
        return new kotlin.Pair<>(ovj, java.lang.Boolean.valueOf(indicatorBean.getMain()));
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
                Expression.Parameter parameter = null;
                if (parameterEZpvd == null) {
                    parameterEZpvd = null;
                }
                params.setLength(new Length(parameterEZpvd != null ? java.lang.Double.valueOf(parameterEZpvd.getValue()) : null));
                Expression.Parameter parameterEZpvd2 = abstractC36262oVg.EZpvd(1);
                if (parameterEZpvd2 == null) {
                    parameterEZpvd2 = null;
                }
                params.setSmooth(new Length(parameterEZpvd2 != null ? java.lang.Double.valueOf(parameterEZpvd2.getValue()) : null));
                Expression.Parameter parameterCopydefault = abstractC36262oVg.copydefault(0);
                if (parameterCopydefault == null) {
                    parameterCopydefault = null;
                }
                params.setK(KWHzl(parameterCopydefault));
                Expression.Parameter parameterCopydefault2 = abstractC36262oVg.copydefault(1);
                if (parameterCopydefault2 != null) {
                    parameter = parameterCopydefault2;
                }
                params.setD(KWHzl(parameter));
            } catch (java.lang.Exception e) {
                pUU.copydefault(this.AEQbTJ, "indicator2Json: " + e);
            }
        }
        indicatorBean.setParams(params);
        indicatorBean.setVisible(java.lang.Boolean.valueOf(z));
        return new Gson().toJson(indicatorBean);
    }
}
