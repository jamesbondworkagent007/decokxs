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
public final class pGK implements InterfaceC37953pGv {
    public final java.lang.String EZpvd = "PSYIndicatorJsonManage";

    public java.lang.String AEQbTJ(@NotNull java.lang.String str, boolean z) {
        return InterfaceC37953pGv.Application.KWHzl(this, str, z);
    }

    public Out EZpvd(Expression.Parameter parameter) {
        return InterfaceC37953pGv.Application.EZpvd(this, parameter);
    }

    public void EZpvd(Out out, Expression.Parameter parameter) {
        InterfaceC37953pGv.Application.OLrzqt(this, out, parameter);
    }

    public Out copydefault(java.lang.Double d, Expression.Parameter parameter) {
        return InterfaceC37953pGv.Application.copydefault(this, d, parameter);
    }

    @Override // o.InterfaceC37953pGv
    public kotlin.Pair<AbstractC36262oVg, java.lang.Boolean> AEQbTJ(@NotNull KlineIndicatorBean klineIndicatorBean) {
        Out ma1;
        Expression.Parameter parameterCopydefault;
        Out out;
        Expression.Parameter parameterCopydefault2;
        Out ma12;
        java.lang.Double value;
        Length length;
        java.lang.Double value2;
        Intrinsics.checkNotNullParameter(klineIndicatorBean, "");
        oVF ovf = new oVF("PSY");
        ovf.AkhnZx();
        ovf.fetchVPNInfo();
        IndicatorBean indicatorBean = (IndicatorBean) new Gson().fromJson(klineIndicatorBean.getIndicator(), IndicatorBean.class);
        com.okinc.kline.ui.view.model.Params params = indicatorBean.getParams();
        if (params != null && (length = params.getLength()) != null && (value2 = length.getValue()) != null) {
            double dDoubleValue = value2.doubleValue();
            Expression.Parameter parameterEZpvd = ovf.EZpvd(0);
            if (parameterEZpvd != null) {
                parameterEZpvd.setTempValue(dDoubleValue);
            }
        }
        com.okinc.kline.ui.view.model.Params params2 = indicatorBean.getParams();
        if (params2 != null && (ma12 = params2.getMa1()) != null && (value = ma12.getValue()) != null) {
            double dDoubleValue2 = value.doubleValue();
            Expression.Parameter parameterEZpvd2 = ovf.EZpvd(1);
            if (parameterEZpvd2 != null) {
                parameterEZpvd2.setTempValue(dDoubleValue2);
            }
        }
        com.okinc.kline.ui.view.model.Params params3 = indicatorBean.getParams();
        if (params3 != null && (out = params3.getOut()) != null && (parameterCopydefault2 = ovf.copydefault(0)) != null) {
            EZpvd(out, parameterCopydefault2);
        }
        com.okinc.kline.ui.view.model.Params params4 = indicatorBean.getParams();
        if (params4 != null && (ma1 = params4.getMa1()) != null && (parameterCopydefault = ovf.copydefault(1)) != null) {
            EZpvd(ma1, parameterCopydefault);
        }
        ovf.EZpvd();
        ovf.fJNWhG();
        java.lang.String strEjfBZ = ovf.ejfBZ();
        Intrinsics.checkNotNullExpressionValue(strEjfBZ, "");
        C36278oVw.KWHzl("ds0", AEQbTJ(strEjfBZ, indicatorBean.getMain()), ovf.AuCTel());
        ovf.copydefault();
        java.lang.String strEjfBZ2 = ovf.ejfBZ();
        Intrinsics.checkNotNullExpressionValue(strEjfBZ2, "");
        C36278oVw.copydefault("ds0", AEQbTJ(strEjfBZ2, indicatorBean.getMain()), new Gson().toJson(ovf.isConnected()));
        return new kotlin.Pair<>(ovf, java.lang.Boolean.valueOf(indicatorBean.getMain()));
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
                params.setLength(new Length(parameterEZpvd != null ? java.lang.Double.valueOf(parameterEZpvd.getValue()) : null));
                params.setOut(EZpvd(abstractC36262oVg.copydefault(0)));
                params.setMa1(copydefault(java.lang.Double.valueOf(abstractC36262oVg.EZpvd(1).getValue()), abstractC36262oVg.copydefault(1)));
            } catch (java.lang.Exception e) {
                pUU.copydefault(this.EZpvd, "indicator2Json: " + e);
            }
        }
        indicatorBean.setParams(params);
        indicatorBean.setVisible(java.lang.Boolean.valueOf(z));
        return new Gson().toJson(indicatorBean);
    }
}
