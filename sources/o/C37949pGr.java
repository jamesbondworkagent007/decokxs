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

/* JADX INFO: renamed from: o.pGr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C37949pGr implements InterfaceC37953pGv {
    public final java.lang.String copydefault = "DMAIndicatorJsonManage";

    public Out EZpvd(java.lang.Double d, Expression.Parameter parameter) {
        return InterfaceC37953pGv.Application.copydefault(this, d, parameter);
    }

    public Out KWHzl(Expression.Parameter parameter) {
        return InterfaceC37953pGv.Application.EZpvd(this, parameter);
    }

    public java.lang.String KWHzl(@NotNull java.lang.String str, boolean z) {
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
        Length slowLength;
        java.lang.Double value2;
        Length fastLength;
        java.lang.Double value3;
        Intrinsics.checkNotNullParameter(klineIndicatorBean, "");
        C36271oVp c36271oVp = new C36271oVp("DMA");
        c36271oVp.AkhnZx();
        c36271oVp.fetchVPNInfo();
        IndicatorBean indicatorBean = (IndicatorBean) new Gson().fromJson(klineIndicatorBean.getIndicator(), IndicatorBean.class);
        com.okinc.kline.ui.view.model.Params params = indicatorBean.getParams();
        if (params != null && (fastLength = params.getFastLength()) != null && (value3 = fastLength.getValue()) != null) {
            double dDoubleValue = value3.doubleValue();
            Expression.Parameter parameterEZpvd = c36271oVp.EZpvd(0);
            if (parameterEZpvd != null) {
                parameterEZpvd.setTempValue(dDoubleValue);
            }
        }
        com.okinc.kline.ui.view.model.Params params2 = indicatorBean.getParams();
        if (params2 != null && (slowLength = params2.getSlowLength()) != null && (value2 = slowLength.getValue()) != null) {
            double dDoubleValue2 = value2.doubleValue();
            Expression.Parameter parameterEZpvd2 = c36271oVp.EZpvd(1);
            if (parameterEZpvd2 != null) {
                parameterEZpvd2.setTempValue(dDoubleValue2);
            }
        }
        com.okinc.kline.ui.view.model.Params params3 = indicatorBean.getParams();
        if (params3 != null && (out22 = params3.getOut2()) != null && (value = out22.getValue()) != null) {
            double dDoubleValue3 = value.doubleValue();
            Expression.Parameter parameterEZpvd3 = c36271oVp.EZpvd(2);
            if (parameterEZpvd3 != null) {
                parameterEZpvd3.setTempValue(dDoubleValue3);
            }
        }
        com.okinc.kline.ui.view.model.Params params4 = indicatorBean.getParams();
        if (params4 != null && (out1 = params4.getOut1()) != null && (parameterCopydefault2 = c36271oVp.copydefault(0)) != null) {
            OLrzqt(out1, parameterCopydefault2);
        }
        com.okinc.kline.ui.view.model.Params params5 = indicatorBean.getParams();
        if (params5 != null && (out2 = params5.getOut2()) != null && (parameterCopydefault = c36271oVp.copydefault(1)) != null) {
            OLrzqt(out2, parameterCopydefault);
        }
        c36271oVp.EZpvd();
        c36271oVp.fJNWhG();
        java.lang.String strEjfBZ = c36271oVp.ejfBZ();
        Intrinsics.checkNotNullExpressionValue(strEjfBZ, "");
        C36278oVw.KWHzl("ds0", KWHzl(strEjfBZ, indicatorBean.getMain()), c36271oVp.AuCTel());
        c36271oVp.copydefault();
        java.lang.String strEjfBZ2 = c36271oVp.ejfBZ();
        Intrinsics.checkNotNullExpressionValue(strEjfBZ2, "");
        C36278oVw.copydefault("ds0", KWHzl(strEjfBZ2, indicatorBean.getMain()), new Gson().toJson(c36271oVp.isConnected()));
        return new kotlin.Pair<>(c36271oVp, java.lang.Boolean.valueOf(indicatorBean.getMain()));
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
                params.setOut1(KWHzl(abstractC36262oVg.copydefault(0)));
                params.setOut2(EZpvd(java.lang.Double.valueOf(abstractC36262oVg.EZpvd(2).getValue()), abstractC36262oVg.copydefault(1)));
            } catch (java.lang.Exception e) {
                pUU.copydefault(this.copydefault, "indicator2Json: " + e);
            }
        }
        indicatorBean.setParams(params);
        indicatorBean.setVisible(java.lang.Boolean.valueOf(z));
        return new Gson().toJson(indicatorBean);
    }
}
