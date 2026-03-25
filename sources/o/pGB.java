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
public final class pGB implements InterfaceC37953pGv {
    public final java.lang.String copydefault = "OBVIndicatorJsonManage";

    public Out AEQbTJ(java.lang.Double d, Expression.Parameter parameter) {
        return InterfaceC37953pGv.Application.copydefault(this, d, parameter);
    }

    public Out EZpvd(Expression.Parameter parameter) {
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
        Out ma1;
        Expression.Parameter parameterCopydefault;
        Out out;
        Expression.Parameter parameterCopydefault2;
        Out ma12;
        java.lang.Double value;
        Intrinsics.checkNotNullParameter(klineIndicatorBean, "");
        oVH ovh = new oVH("OBV");
        ovh.AkhnZx();
        ovh.fetchVPNInfo();
        IndicatorBean indicatorBean = (IndicatorBean) new Gson().fromJson(klineIndicatorBean.getIndicator(), IndicatorBean.class);
        com.okinc.kline.ui.view.model.Params params = indicatorBean.getParams();
        if (params != null && (ma12 = params.getMa1()) != null && (value = ma12.getValue()) != null) {
            double dDoubleValue = value.doubleValue();
            Expression.Parameter parameterEZpvd = ovh.EZpvd(0);
            if (parameterEZpvd != null) {
                parameterEZpvd.setTempValue(dDoubleValue);
            }
        }
        com.okinc.kline.ui.view.model.Params params2 = indicatorBean.getParams();
        if (params2 != null && (out = params2.getOut()) != null && (parameterCopydefault2 = ovh.copydefault(0)) != null) {
            java.lang.String color = out.getColor();
            if (color != null) {
                java.lang.String lowerCase = color.toLowerCase(java.util.Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "");
                parameterCopydefault2.setColorTemp(lowerCase);
            }
            parameterCopydefault2.setColorBlkTemp(out.getColorBlk());
            parameterCopydefault2.setIsShowTemp(out.getVisible() == null || Intrinsics.EZpvd(out.getVisible(), java.lang.Boolean.TRUE));
        }
        com.okinc.kline.ui.view.model.Params params3 = indicatorBean.getParams();
        if (params3 != null && (ma1 = params3.getMa1()) != null && (parameterCopydefault = ovh.copydefault(1)) != null) {
            KWHzl(ma1, parameterCopydefault);
        }
        ovh.EZpvd();
        ovh.fJNWhG();
        java.lang.String strEjfBZ = ovh.ejfBZ();
        Intrinsics.checkNotNullExpressionValue(strEjfBZ, "");
        C36278oVw.KWHzl("ds0", KWHzl(strEjfBZ, indicatorBean.getMain()), ovh.AuCTel());
        ovh.copydefault();
        java.lang.String strEjfBZ2 = ovh.ejfBZ();
        Intrinsics.checkNotNullExpressionValue(strEjfBZ2, "");
        C36278oVw.copydefault("ds0", KWHzl(strEjfBZ2, indicatorBean.getMain()), new Gson().toJson(ovh.isConnected()));
        return new kotlin.Pair<>(ovh, java.lang.Boolean.valueOf(indicatorBean.getMain()));
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
                params.setOut(EZpvd(abstractC36262oVg.copydefault(0)));
                params.setMa1(AEQbTJ(java.lang.Double.valueOf(parameterEZpvd.getValue()), abstractC36262oVg.copydefault(1)));
            } catch (java.lang.Exception e) {
                pUU.copydefault(this.copydefault, "indicator2Json: " + e);
            }
        }
        indicatorBean.setParams(params);
        indicatorBean.setVisible(java.lang.Boolean.valueOf(z));
        return new Gson().toJson(indicatorBean);
    }
}
