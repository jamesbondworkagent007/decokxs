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
public final class pGU implements InterfaceC37953pGv {
    public final java.lang.String copydefault = "VWAPIndicatorJsonManage";

    public void EZpvd(Out out, Expression.Parameter parameter) {
        InterfaceC37953pGv.Application.OLrzqt(this, out, parameter);
    }

    public java.lang.String OLrzqt(@NotNull java.lang.String str, boolean z) {
        return InterfaceC37953pGv.Application.KWHzl(this, str, z);
    }

    public Out copydefault(java.lang.Double d, Expression.Parameter parameter) {
        return InterfaceC37953pGv.Application.copydefault(this, d, parameter);
    }

    @Override // o.InterfaceC37953pGv
    public kotlin.Pair<AbstractC36262oVg, java.lang.Boolean> AEQbTJ(@NotNull KlineIndicatorBean klineIndicatorBean) {
        Out vwap;
        Intrinsics.checkNotNullParameter(klineIndicatorBean, "");
        oVQ ovq = new oVQ("VWAP");
        ovq.AkhnZx();
        ovq.fetchVPNInfo();
        IndicatorBean indicatorBean = (IndicatorBean) new Gson().fromJson(klineIndicatorBean.getIndicator(), IndicatorBean.class);
        try {
            com.okinc.kline.ui.view.model.Params params = indicatorBean.getParams();
            if (params != null && (vwap = params.getVwap()) != null) {
                java.lang.Double value = vwap.getValue();
                if (value != null) {
                    double dDoubleValue = value.doubleValue();
                    Expression.Parameter parameterEZpvd = ovq.EZpvd(0);
                    if (parameterEZpvd != null) {
                        parameterEZpvd.setTempValue(dDoubleValue);
                    }
                }
                Expression.Parameter parameterCopydefault = ovq.copydefault(0);
                if (parameterCopydefault != null) {
                    EZpvd(vwap, parameterCopydefault);
                }
            }
        } catch (java.lang.Exception e) {
            pUU.copydefault(this.copydefault, "handleJsonData: " + e);
        }
        ovq.EZpvd();
        ovq.fJNWhG();
        java.lang.String strEjfBZ = ovq.ejfBZ();
        Intrinsics.checkNotNullExpressionValue(strEjfBZ, "");
        C36278oVw.KWHzl("ds0", OLrzqt(strEjfBZ, indicatorBean.getMain()), ovq.AuCTel());
        ovq.copydefault();
        java.lang.String strEjfBZ2 = ovq.ejfBZ();
        Intrinsics.checkNotNullExpressionValue(strEjfBZ2, "");
        C36278oVw.copydefault("ds0", OLrzqt(strEjfBZ2, indicatorBean.getMain()), new Gson().toJson(ovq.isConnected()));
        return new kotlin.Pair<>(ovq, java.lang.Boolean.valueOf(indicatorBean.getMain()));
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
                params.setVwap(copydefault(parameterEZpvd != null ? java.lang.Double.valueOf(parameterEZpvd.getValue()) : null, abstractC36262oVg.copydefault(0)));
            } catch (java.lang.Exception e) {
                pUU.copydefault(this.copydefault, "indicator2Json: " + e);
            }
        }
        indicatorBean.setParams(params);
        indicatorBean.setVisible(java.lang.Boolean.valueOf(z));
        return new Gson().toJson(indicatorBean);
    }
}
