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
public final class pGQ implements InterfaceC37953pGv {
    public final java.lang.String copydefault = "WRIndicatorJsonManage";

    public Out EZpvd(java.lang.Double d, Expression.Parameter parameter) {
        return InterfaceC37953pGv.Application.copydefault(this, d, parameter);
    }

    public java.lang.String OLrzqt(@NotNull java.lang.String str, boolean z) {
        return InterfaceC37953pGv.Application.KWHzl(this, str, z);
    }

    public void OLrzqt(Out out, Expression.Parameter parameter) {
        InterfaceC37953pGv.Application.OLrzqt(this, out, parameter);
    }

    @Override // o.InterfaceC37953pGv
    public kotlin.Pair<AbstractC36262oVg, java.lang.Boolean> AEQbTJ(@NotNull KlineIndicatorBean klineIndicatorBean) {
        Out out2;
        Expression.Parameter parameterCopydefault;
        Out out1;
        Expression.Parameter parameterCopydefault2;
        Out out22;
        java.lang.Double value;
        Out out12;
        java.lang.Double value2;
        Intrinsics.checkNotNullParameter(klineIndicatorBean, "");
        oVV ovv = new oVV("WR");
        ovv.AkhnZx();
        ovv.fetchVPNInfo();
        IndicatorBean indicatorBean = (IndicatorBean) new Gson().fromJson(klineIndicatorBean.getIndicator(), IndicatorBean.class);
        com.okinc.kline.ui.view.model.Params params = indicatorBean.getParams();
        if (params != null && (out12 = params.getOut1()) != null && (value2 = out12.getValue()) != null) {
            double dDoubleValue = value2.doubleValue();
            Expression.Parameter parameterEZpvd = ovv.EZpvd(0);
            if (parameterEZpvd != null) {
                parameterEZpvd.setTempValue(dDoubleValue);
            }
        }
        com.okinc.kline.ui.view.model.Params params2 = indicatorBean.getParams();
        if (params2 != null && (out22 = params2.getOut2()) != null && (value = out22.getValue()) != null) {
            double dDoubleValue2 = value.doubleValue();
            Expression.Parameter parameterEZpvd2 = ovv.EZpvd(1);
            if (parameterEZpvd2 != null) {
                parameterEZpvd2.setTempValue(dDoubleValue2);
            }
        }
        com.okinc.kline.ui.view.model.Params params3 = indicatorBean.getParams();
        if (params3 != null && (out1 = params3.getOut1()) != null && (parameterCopydefault2 = ovv.copydefault(0)) != null) {
            OLrzqt(out1, parameterCopydefault2);
        }
        com.okinc.kline.ui.view.model.Params params4 = indicatorBean.getParams();
        if (params4 != null && (out2 = params4.getOut2()) != null && (parameterCopydefault = ovv.copydefault(1)) != null) {
            OLrzqt(out2, parameterCopydefault);
        }
        ovv.EZpvd();
        ovv.fJNWhG();
        java.lang.String strEjfBZ = ovv.ejfBZ();
        Intrinsics.checkNotNullExpressionValue(strEjfBZ, "");
        C36278oVw.KWHzl("ds0", OLrzqt(strEjfBZ, indicatorBean.getMain()), ovv.AuCTel());
        ovv.copydefault();
        java.lang.String strEjfBZ2 = ovv.ejfBZ();
        Intrinsics.checkNotNullExpressionValue(strEjfBZ2, "");
        C36278oVw.copydefault("ds0", OLrzqt(strEjfBZ2, indicatorBean.getMain()), new Gson().toJson(ovv.isConnected()));
        return new kotlin.Pair<>(ovv, java.lang.Boolean.valueOf(indicatorBean.getMain()));
    }

    @Override // o.InterfaceC37953pGv
    public java.lang.String OLrzqt(@NotNull AbstractC36262oVg abstractC36262oVg, @NotNull IndicatorBean indicatorBean, boolean z) {
        Intrinsics.checkNotNullParameter(abstractC36262oVg, "");
        Intrinsics.checkNotNullParameter(indicatorBean, "");
        com.okinc.kline.ui.view.model.Params params = indicatorBean.getParams();
        if (params == null) {
            params = new com.okinc.kline.ui.view.model.Params(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 32767, null);
            try {
                params.setOut1(EZpvd(java.lang.Double.valueOf(abstractC36262oVg.EZpvd(0).getValue()), abstractC36262oVg.copydefault(0)));
                params.setOut2(EZpvd(java.lang.Double.valueOf(abstractC36262oVg.EZpvd(1).getValue()), abstractC36262oVg.copydefault(1)));
            } catch (java.lang.Exception e) {
                pUU.copydefault(this.copydefault, "indicator2Json: " + e);
            }
        }
        indicatorBean.setParams(params);
        indicatorBean.setVisible(java.lang.Boolean.valueOf(z));
        return new Gson().toJson(indicatorBean);
    }
}
