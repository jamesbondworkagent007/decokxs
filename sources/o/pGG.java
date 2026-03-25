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
public final class pGG implements InterfaceC37953pGv {
    public final java.lang.String copydefault = "SARIndicatorJsonManage";

    public java.lang.String KWHzl(@NotNull java.lang.String str, boolean z) {
        return InterfaceC37953pGv.Application.KWHzl(this, str, z);
    }

    @Override // o.InterfaceC37953pGv
    public kotlin.Pair<AbstractC36262oVg, java.lang.Boolean> AEQbTJ(@NotNull KlineIndicatorBean klineIndicatorBean) {
        Out out;
        Expression.Parameter parameterCopydefault;
        Intrinsics.checkNotNullParameter(klineIndicatorBean, "");
        oVI ovi = new oVI("SAR");
        ovi.AkhnZx();
        ovi.fetchVPNInfo();
        IndicatorBean indicatorBean = (IndicatorBean) new Gson().fromJson(klineIndicatorBean.getIndicator(), IndicatorBean.class);
        com.okinc.kline.ui.view.model.Params params = indicatorBean.getParams();
        if (params != null && (out = params.getOut()) != null && (parameterCopydefault = ovi.copydefault(0)) != null) {
            java.lang.String color = out.getColor();
            if (color != null) {
                java.lang.String lowerCase = color.toLowerCase(java.util.Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "");
                parameterCopydefault.setColorTemp(lowerCase);
            }
            parameterCopydefault.setColorBlkTemp(out.getColorBlk());
        }
        ovi.EZpvd();
        ovi.fJNWhG();
        java.lang.String strEjfBZ = ovi.ejfBZ();
        Intrinsics.checkNotNullExpressionValue(strEjfBZ, "");
        C36278oVw.KWHzl("ds0", KWHzl(strEjfBZ, indicatorBean.getMain()), ovi.AuCTel());
        ovi.copydefault();
        java.lang.String strEjfBZ2 = ovi.ejfBZ();
        Intrinsics.checkNotNullExpressionValue(strEjfBZ2, "");
        C36278oVw.copydefault("ds0", KWHzl(strEjfBZ2, indicatorBean.getMain()), new Gson().toJson(ovi.isConnected()));
        return new kotlin.Pair<>(ovi, java.lang.Boolean.valueOf(indicatorBean.getMain()));
    }

    @Override // o.InterfaceC37953pGv
    public java.lang.String OLrzqt(@NotNull AbstractC36262oVg abstractC36262oVg, @NotNull IndicatorBean indicatorBean, boolean z) {
        java.lang.String colorBlkTemp;
        Intrinsics.checkNotNullParameter(abstractC36262oVg, "");
        Intrinsics.checkNotNullParameter(indicatorBean, "");
        com.okinc.kline.ui.view.model.Params params = indicatorBean.getParams();
        if (params == null) {
            params = new com.okinc.kline.ui.view.model.Params(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 32767, null);
            try {
                Expression.Parameter parameterCopydefault = abstractC36262oVg.copydefault(0);
                params.setOut(new Out(null, parameterCopydefault != null ? parameterCopydefault.getColor() : null, null, java.lang.Boolean.TRUE, null, (parameterCopydefault == null || (colorBlkTemp = parameterCopydefault.getColorBlkTemp()) == null) ? "" : colorBlkTemp, 16, null));
            } catch (java.lang.Exception e) {
                pUU.copydefault(this.copydefault, "indicator2Json: " + e);
            }
        }
        indicatorBean.setParams(params);
        indicatorBean.setVisible(java.lang.Boolean.valueOf(z));
        return new Gson().toJson(indicatorBean);
    }
}
