package o;

import com.google.gson.Gson;
import com.okinc.kline.library.indicator.Expression;
import com.okinc.kline.ui.view.model.IndicatorBean;
import com.okinc.kline.ui.view.model.KlineIndicatorBean;
import com.okinc.kline.ui.view.model.Out;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC37953pGv;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pGy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C37956pGy implements InterfaceC37953pGv {
    public final java.lang.String AEQbTJ = "LSPosIndicatorJsonManage";

    public java.lang.String AEQbTJ(@NotNull java.lang.String str, boolean z) {
        return InterfaceC37953pGv.Application.KWHzl(this, str, z);
    }

    public void EZpvd(Out out, Expression.Parameter parameter) {
        InterfaceC37953pGv.Application.OLrzqt(this, out, parameter);
    }

    public Out OLrzqt(Expression.Parameter parameter) {
        return InterfaceC37953pGv.Application.EZpvd(this, parameter);
    }

    @Override // o.InterfaceC37953pGv
    public kotlin.Pair<AbstractC36262oVg, java.lang.Boolean> AEQbTJ(@NotNull KlineIndicatorBean klineIndicatorBean) {
        Out out;
        Out out2;
        Out ratio;
        Intrinsics.checkNotNullParameter(klineIndicatorBean, "");
        C36281oVz c36281oVz = new C36281oVz("LSPos");
        c36281oVz.EZpvd = true;
        c36281oVz.AkhnZx();
        c36281oVz.fetchVPNInfo();
        IndicatorBean indicatorBean = (IndicatorBean) new Gson().fromJson(klineIndicatorBean.getIndicator(), IndicatorBean.class);
        try {
            com.okinc.kline.ui.view.model.Params params = indicatorBean.getParams();
            if (params != null && (ratio = params.getRatio()) != null) {
                EZpvd(ratio, c36281oVz.copydefault(0));
                C36278oVw.OLrzqt("ds0", c36281oVz.ejfBZ(), ratio.getVisible() == null || Intrinsics.EZpvd(ratio.getVisible(), java.lang.Boolean.TRUE));
            }
            com.okinc.kline.ui.view.model.Params params2 = indicatorBean.getParams();
            if (params2 != null && (out2 = params2.getLong()) != null) {
                EZpvd(out2, c36281oVz.copydefault(1));
            }
            com.okinc.kline.ui.view.model.Params params3 = indicatorBean.getParams();
            if (params3 != null && (out = params3.getShort()) != null) {
                EZpvd(out, c36281oVz.copydefault(2));
            }
        } catch (java.lang.Exception e) {
            pUU.copydefault(this.AEQbTJ, "handleJsonData: " + e);
        }
        c36281oVz.EZpvd();
        c36281oVz.fJNWhG();
        java.lang.String strEjfBZ = c36281oVz.ejfBZ();
        Intrinsics.checkNotNullExpressionValue(strEjfBZ, "");
        C36278oVw.KWHzl("ds0", AEQbTJ(strEjfBZ, indicatorBean.getMain()), c36281oVz.AuCTel());
        c36281oVz.copydefault();
        java.lang.String strEjfBZ2 = c36281oVz.ejfBZ();
        Intrinsics.checkNotNullExpressionValue(strEjfBZ2, "");
        C36278oVw.copydefault("ds0", AEQbTJ(strEjfBZ2, indicatorBean.getMain()), new Gson().toJson(c36281oVz.isConnected()));
        return new kotlin.Pair<>(c36281oVz, java.lang.Boolean.valueOf(indicatorBean.getMain()));
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
                params.setRatio(OLrzqt(abstractC36262oVg.copydefault(0)));
                Expression.Parameter parameterCopydefault = abstractC36262oVg.copydefault(1);
                java.lang.String color = parameterCopydefault != null ? parameterCopydefault.getColor() : null;
                java.lang.Double dValueOf = parameterCopydefault != null ? java.lang.Double.valueOf(parameterCopydefault.getLineWidth()) : null;
                java.lang.Boolean bool = java.lang.Boolean.TRUE;
                params.setLong(new Out(null, color, dValueOf, bool, null, (parameterCopydefault == null || (colorBlk2 = parameterCopydefault.getColorBlk()) == null) ? "" : colorBlk2, 16, null));
                Expression.Parameter parameterCopydefault2 = abstractC36262oVg.copydefault(2);
                params.setShort(new Out(null, parameterCopydefault2 != null ? parameterCopydefault2.getColor() : null, parameterCopydefault2 != null ? java.lang.Double.valueOf(parameterCopydefault2.getLineWidth()) : null, bool, null, (parameterCopydefault2 == null || (colorBlk = parameterCopydefault2.getColorBlk()) == null) ? "" : colorBlk, 16, null));
            } catch (java.lang.Exception e) {
                pUU.copydefault(this.AEQbTJ, "indicator2Json: " + e);
            }
        }
        indicatorBean.setParams(params);
        indicatorBean.setVisible(java.lang.Boolean.valueOf(z));
        return new Gson().toJson(indicatorBean);
    }
}
