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
public final class pGL implements InterfaceC37953pGv {
    public final java.lang.String copydefault = "STOCHRSIIndicatorJsonManage";

    public void AEQbTJ(Out out, Expression.Parameter parameter) {
        InterfaceC37953pGv.Application.OLrzqt(this, out, parameter);
    }

    public java.lang.String KWHzl(@NotNull java.lang.String str, boolean z) {
        return InterfaceC37953pGv.Application.KWHzl(this, str, z);
    }

    public Out OLrzqt(Expression.Parameter parameter) {
        return InterfaceC37953pGv.Application.EZpvd(this, parameter);
    }

    @Override // o.InterfaceC37953pGv
    public kotlin.Pair<AbstractC36262oVg, java.lang.Boolean> AEQbTJ(@NotNull KlineIndicatorBean klineIndicatorBean) {
        Out d;
        Expression.Parameter parameterCopydefault;
        Out k;
        Expression.Parameter parameterCopydefault2;
        Length smoothD;
        java.lang.Double value;
        Length smoothK;
        java.lang.Double value2;
        Length lengthStoch;
        java.lang.Double value3;
        Length lengthRSI;
        java.lang.Double value4;
        Intrinsics.checkNotNullParameter(klineIndicatorBean, "");
        oVL ovl = new oVL("StochRSI");
        ovl.AkhnZx();
        ovl.fetchVPNInfo();
        IndicatorBean indicatorBean = (IndicatorBean) new Gson().fromJson(klineIndicatorBean.getIndicator(), IndicatorBean.class);
        com.okinc.kline.ui.view.model.Params params = indicatorBean.getParams();
        if (params != null && (lengthRSI = params.getLengthRSI()) != null && (value4 = lengthRSI.getValue()) != null) {
            double dDoubleValue = value4.doubleValue();
            Expression.Parameter parameterEZpvd = ovl.EZpvd(0);
            if (parameterEZpvd != null) {
                parameterEZpvd.setTempValue(dDoubleValue);
            }
        }
        com.okinc.kline.ui.view.model.Params params2 = indicatorBean.getParams();
        if (params2 != null && (lengthStoch = params2.getLengthStoch()) != null && (value3 = lengthStoch.getValue()) != null) {
            double dDoubleValue2 = value3.doubleValue();
            Expression.Parameter parameterEZpvd2 = ovl.EZpvd(1);
            if (parameterEZpvd2 != null) {
                parameterEZpvd2.setTempValue(dDoubleValue2);
            }
        }
        com.okinc.kline.ui.view.model.Params params3 = indicatorBean.getParams();
        if (params3 != null && (smoothK = params3.getSmoothK()) != null && (value2 = smoothK.getValue()) != null) {
            double dDoubleValue3 = value2.doubleValue();
            Expression.Parameter parameterEZpvd3 = ovl.EZpvd(2);
            if (parameterEZpvd3 != null) {
                parameterEZpvd3.setTempValue(dDoubleValue3);
            }
        }
        com.okinc.kline.ui.view.model.Params params4 = indicatorBean.getParams();
        if (params4 != null && (smoothD = params4.getSmoothD()) != null && (value = smoothD.getValue()) != null) {
            double dDoubleValue4 = value.doubleValue();
            Expression.Parameter parameterEZpvd4 = ovl.EZpvd(3);
            if (parameterEZpvd4 != null) {
                parameterEZpvd4.setTempValue(dDoubleValue4);
            }
        }
        com.okinc.kline.ui.view.model.Params params5 = indicatorBean.getParams();
        if (params5 != null && (k = params5.getK()) != null && (parameterCopydefault2 = ovl.copydefault(0)) != null) {
            AEQbTJ(k, parameterCopydefault2);
        }
        com.okinc.kline.ui.view.model.Params params6 = indicatorBean.getParams();
        if (params6 != null && (d = params6.getD()) != null && (parameterCopydefault = ovl.copydefault(1)) != null) {
            AEQbTJ(d, parameterCopydefault);
        }
        ovl.EZpvd();
        ovl.fJNWhG();
        java.lang.String strEjfBZ = ovl.ejfBZ();
        Intrinsics.checkNotNullExpressionValue(strEjfBZ, "");
        C36278oVw.KWHzl("ds0", KWHzl(strEjfBZ, indicatorBean.getMain()), ovl.AuCTel());
        ovl.copydefault();
        java.lang.String strEjfBZ2 = ovl.ejfBZ();
        Intrinsics.checkNotNullExpressionValue(strEjfBZ2, "");
        C36278oVw.copydefault("ds0", KWHzl(strEjfBZ2, indicatorBean.getMain()), new Gson().toJson(ovl.isConnected()));
        return new kotlin.Pair<>(ovl, java.lang.Boolean.valueOf(indicatorBean.getMain()));
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
                params.setLengthRSI(new Length(parameterEZpvd != null ? java.lang.Double.valueOf(parameterEZpvd.getValue()) : null));
                Expression.Parameter parameterEZpvd2 = abstractC36262oVg.EZpvd(1);
                params.setLengthStoch(new Length(parameterEZpvd2 != null ? java.lang.Double.valueOf(parameterEZpvd2.getValue()) : null));
                Expression.Parameter parameterEZpvd3 = abstractC36262oVg.EZpvd(2);
                params.setSmoothK(new Length(parameterEZpvd3 != null ? java.lang.Double.valueOf(parameterEZpvd3.getValue()) : null));
                Expression.Parameter parameterEZpvd4 = abstractC36262oVg.EZpvd(3);
                params.setSmoothD(new Length(parameterEZpvd4 != null ? java.lang.Double.valueOf(parameterEZpvd4.getValue()) : null));
                params.setK(OLrzqt(abstractC36262oVg.copydefault(0)));
                params.setD(OLrzqt(abstractC36262oVg.copydefault(1)));
            } catch (java.lang.Exception e) {
                pUU.copydefault(this.copydefault, "indicator2Json: " + e);
            }
        }
        indicatorBean.setParams(params);
        indicatorBean.setVisible(java.lang.Boolean.valueOf(z));
        return new Gson().toJson(indicatorBean);
    }
}
