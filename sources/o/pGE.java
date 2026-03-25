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
public final class pGE implements InterfaceC37953pGv {
    public final java.lang.String KWHzl = "OIIndicatorJsonManage";

    public Out AEQbTJ(Expression.Parameter parameter) {
        return InterfaceC37953pGv.Application.EZpvd(this, parameter);
    }

    public java.lang.String OLrzqt(@NotNull java.lang.String str, boolean z) {
        return InterfaceC37953pGv.Application.KWHzl(this, str, z);
    }

    @Override // o.InterfaceC37953pGv
    public kotlin.Pair<AbstractC36262oVg, java.lang.Boolean> AEQbTJ(@NotNull KlineIndicatorBean klineIndicatorBean) {
        Out out;
        Expression.Parameter parameterCopydefault;
        Intrinsics.checkNotNullParameter(klineIndicatorBean, "");
        oVG ovg = new oVG("OI");
        ovg.AkhnZx();
        ovg.fetchVPNInfo();
        IndicatorBean indicatorBean = (IndicatorBean) new Gson().fromJson(klineIndicatorBean.getIndicator(), IndicatorBean.class);
        try {
            com.okinc.kline.ui.view.model.Params params = indicatorBean.getParams();
            if (params != null && (out = params.getOut()) != null && (parameterCopydefault = ovg.copydefault(0)) != null) {
                java.lang.String color = out.getColor();
                if (color != null) {
                    java.lang.String lowerCase = color.toLowerCase(java.util.Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(lowerCase, "");
                    parameterCopydefault.setColorTemp(lowerCase);
                }
                parameterCopydefault.setColorBlkTemp(out.getColorBlk());
                java.lang.Double lineWidth = out.getLineWidth();
                if (lineWidth != null) {
                    parameterCopydefault.setLineWidth(lineWidth.doubleValue());
                }
            }
        } catch (java.lang.Exception e) {
            pUU.copydefault(this.KWHzl, "handleJsonData: " + e);
        }
        ovg.EZpvd();
        ovg.fJNWhG();
        java.lang.String strEjfBZ = ovg.ejfBZ();
        Intrinsics.checkNotNullExpressionValue(strEjfBZ, "");
        C36278oVw.KWHzl("ds0", OLrzqt(strEjfBZ, indicatorBean.getMain()), ovg.AuCTel());
        ovg.copydefault();
        java.lang.String strEjfBZ2 = ovg.ejfBZ();
        Intrinsics.checkNotNullExpressionValue(strEjfBZ2, "");
        C36278oVw.copydefault("ds0", OLrzqt(strEjfBZ2, indicatorBean.getMain()), new Gson().toJson(ovg.isConnected()));
        return new kotlin.Pair<>(ovg, java.lang.Boolean.valueOf(indicatorBean.getMain()));
    }

    @Override // o.InterfaceC37953pGv
    public java.lang.String OLrzqt(@NotNull AbstractC36262oVg abstractC36262oVg, @NotNull IndicatorBean indicatorBean, boolean z) {
        Intrinsics.checkNotNullParameter(abstractC36262oVg, "");
        Intrinsics.checkNotNullParameter(indicatorBean, "");
        com.okinc.kline.ui.view.model.Params params = indicatorBean.getParams();
        if (params == null) {
            params = new com.okinc.kline.ui.view.model.Params(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 32767, null);
            try {
                params.setOut(AEQbTJ(abstractC36262oVg.copydefault(0)));
            } catch (java.lang.Exception e) {
                pUU.copydefault(this.KWHzl, "indicator2Json: " + e);
            }
        }
        indicatorBean.setParams(params);
        indicatorBean.setVisible(java.lang.Boolean.valueOf(z));
        return new Gson().toJson(indicatorBean);
    }
}
