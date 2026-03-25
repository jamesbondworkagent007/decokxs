package o;

import com.google.gson.Gson;
import com.okinc.kline.library.indicator.Expression;
import com.okinc.kline.ui.view.model.IndicatorBean;
import com.okinc.kline.ui.view.model.KlineIndicatorBean;
import com.okinc.kline.ui.view.model.Out;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC37953pGv;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pGw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C37954pGw implements InterfaceC37953pGv {
    public final java.lang.String EZpvd = "LSRatioIndicatorJsonManage";

    public java.lang.String AEQbTJ(@NotNull java.lang.String str, boolean z) {
        return InterfaceC37953pGv.Application.KWHzl(this, str, z);
    }

    public void AEQbTJ(Out out, Expression.Parameter parameter) {
        InterfaceC37953pGv.Application.OLrzqt(this, out, parameter);
    }

    public Out KWHzl(Expression.Parameter parameter) {
        return InterfaceC37953pGv.Application.EZpvd(this, parameter);
    }

    @Override // o.InterfaceC37953pGv
    public kotlin.Pair<AbstractC36262oVg, java.lang.Boolean> AEQbTJ(@NotNull KlineIndicatorBean klineIndicatorBean) {
        Out out;
        Out out2;
        Out ratio;
        Intrinsics.checkNotNullParameter(klineIndicatorBean, "");
        oVB ovb = new oVB("LSRatio");
        ovb.EZpvd = true;
        ovb.AkhnZx();
        ovb.fetchVPNInfo();
        IndicatorBean indicatorBean = (IndicatorBean) new Gson().fromJson(klineIndicatorBean.getIndicator(), IndicatorBean.class);
        try {
            com.okinc.kline.ui.view.model.Params params = indicatorBean.getParams();
            if (params != null && (ratio = params.getRatio()) != null) {
                AEQbTJ(ratio, ovb.copydefault(0));
                C36278oVw.OLrzqt("ds0", ovb.ejfBZ(), ratio.getVisible() == null || Intrinsics.EZpvd(ratio.getVisible(), java.lang.Boolean.TRUE));
            }
            com.okinc.kline.ui.view.model.Params params2 = indicatorBean.getParams();
            if (params2 != null && (out2 = params2.getLong()) != null) {
                AEQbTJ(out2, ovb.copydefault(1));
            }
            com.okinc.kline.ui.view.model.Params params3 = indicatorBean.getParams();
            if (params3 != null && (out = params3.getShort()) != null) {
                AEQbTJ(out, ovb.copydefault(2));
            }
        } catch (java.lang.Exception e) {
            pUU.copydefault(this.EZpvd, "handleJsonData: " + e);
        }
        ovb.EZpvd();
        ovb.fJNWhG();
        java.lang.String strEjfBZ = ovb.ejfBZ();
        Intrinsics.checkNotNullExpressionValue(strEjfBZ, "");
        C36278oVw.KWHzl("ds0", AEQbTJ(strEjfBZ, indicatorBean.getMain()), ovb.AuCTel());
        ovb.copydefault();
        java.lang.String strEjfBZ2 = ovb.ejfBZ();
        Intrinsics.checkNotNullExpressionValue(strEjfBZ2, "");
        C36278oVw.copydefault("ds0", AEQbTJ(strEjfBZ2, indicatorBean.getMain()), new Gson().toJson(ovb.isConnected()));
        return new kotlin.Pair<>(ovb, java.lang.Boolean.valueOf(indicatorBean.getMain()));
    }

    @Override // o.InterfaceC37953pGv
    public java.lang.String OLrzqt(@NotNull AbstractC36262oVg abstractC36262oVg, @NotNull IndicatorBean indicatorBean, boolean z) {
        java.lang.String colorBlk;
        java.lang.String colorBlk2;
        Intrinsics.checkNotNullParameter(abstractC36262oVg, "");
        Intrinsics.checkNotNullParameter(indicatorBean, "");
        com.okinc.kline.ui.view.model.Params params = indicatorBean.getParams();
        if (params == null) {
            params = new com.okinc.kline.ui.view.model.Params(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 32767, null);
            try {
                params.setRatio(KWHzl(abstractC36262oVg.copydefault(0)));
                Expression.Parameter parameterCopydefault = abstractC36262oVg.copydefault(1);
                java.lang.String color = parameterCopydefault != null ? parameterCopydefault.getColor() : null;
                java.lang.Double dValueOf = parameterCopydefault != null ? java.lang.Double.valueOf(parameterCopydefault.getLineWidth()) : null;
                java.lang.Boolean bool = java.lang.Boolean.TRUE;
                params.setLong(new Out(null, color, dValueOf, bool, null, (parameterCopydefault == null || (colorBlk2 = parameterCopydefault.getColorBlk()) == null) ? "" : colorBlk2, 16, null));
                Expression.Parameter parameterCopydefault2 = abstractC36262oVg.copydefault(2);
                params.setShort(new Out(null, parameterCopydefault2 != null ? parameterCopydefault2.getColor() : null, parameterCopydefault2 != null ? java.lang.Double.valueOf(parameterCopydefault2.getLineWidth()) : null, bool, null, (parameterCopydefault2 == null || (colorBlk = parameterCopydefault2.getColorBlk()) == null) ? "" : colorBlk, 16, null));
            } catch (java.lang.Exception e) {
                pUU.copydefault(this.EZpvd, "indicator2Json: " + e);
            }
        }
        indicatorBean.setParams(params);
        indicatorBean.setVisible(java.lang.Boolean.valueOf(z));
        return new Gson().toJson(indicatorBean);
    }
}
