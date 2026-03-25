package o;

import com.google.gson.Gson;
import com.okinc.kline.library.indicator.Expression;
import com.okinc.kline.ui.view.model.IndicatorBean;
import com.okinc.kline.ui.view.model.KlineIndicatorBean;
import com.okinc.kline.ui.view.model.Out;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC37953pGv;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pGo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C37946pGo implements InterfaceC37953pGv {
    public final java.lang.String OLrzqt = "BSVOLIndicatorJsonManage";

    public java.lang.String EZpvd(@NotNull java.lang.String str, boolean z) {
        return InterfaceC37953pGv.Application.KWHzl(this, str, z);
    }

    public void KWHzl(Out out, Expression.Parameter parameter) {
        InterfaceC37953pGv.Application.OLrzqt(this, out, parameter);
    }

    @Override // o.InterfaceC37953pGv
    public kotlin.Pair<AbstractC36262oVg, java.lang.Boolean> AEQbTJ(@NotNull KlineIndicatorBean klineIndicatorBean) {
        Out sell;
        Out buy;
        Intrinsics.checkNotNullParameter(klineIndicatorBean, "");
        C36269oVn c36269oVn = new C36269oVn("BSVol");
        c36269oVn.AkhnZx();
        c36269oVn.fetchVPNInfo();
        IndicatorBean indicatorBean = (IndicatorBean) new Gson().fromJson(klineIndicatorBean.getIndicator(), IndicatorBean.class);
        try {
            com.okinc.kline.ui.view.model.Params params = indicatorBean.getParams();
            if (params != null && (buy = params.getBuy()) != null) {
                KWHzl(buy, c36269oVn.copydefault(1));
            }
            com.okinc.kline.ui.view.model.Params params2 = indicatorBean.getParams();
            if (params2 != null && (sell = params2.getSell()) != null) {
                KWHzl(sell, c36269oVn.copydefault(2));
            }
        } catch (java.lang.Exception e) {
            pUU.copydefault(this.OLrzqt, "handleJsonData: " + e);
        }
        c36269oVn.EZpvd();
        c36269oVn.fJNWhG();
        java.lang.String strEjfBZ = c36269oVn.ejfBZ();
        Intrinsics.checkNotNullExpressionValue(strEjfBZ, "");
        C36278oVw.KWHzl("ds0", EZpvd(strEjfBZ, indicatorBean.getMain()), c36269oVn.AuCTel());
        c36269oVn.copydefault();
        java.lang.String strEjfBZ2 = c36269oVn.ejfBZ();
        Intrinsics.checkNotNullExpressionValue(strEjfBZ2, "");
        C36278oVw.copydefault("ds0", EZpvd(strEjfBZ2, indicatorBean.getMain()), new Gson().toJson(c36269oVn.isConnected()));
        return new kotlin.Pair<>(c36269oVn, java.lang.Boolean.valueOf(indicatorBean.getMain()));
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
                Expression.Parameter parameterCopydefault = abstractC36262oVg.copydefault(1);
                java.lang.String color = parameterCopydefault != null ? parameterCopydefault.getColor() : null;
                java.lang.Double dValueOf = parameterCopydefault != null ? java.lang.Double.valueOf(parameterCopydefault.getLineWidth()) : null;
                java.lang.Boolean bool = java.lang.Boolean.TRUE;
                params.setBuy(new Out(null, color, dValueOf, bool, null, (parameterCopydefault == null || (colorBlk2 = parameterCopydefault.getColorBlk()) == null) ? "" : colorBlk2, 16, null));
                Expression.Parameter parameterCopydefault2 = abstractC36262oVg.copydefault(2);
                params.setSell(new Out(null, parameterCopydefault2 != null ? parameterCopydefault2.getColor() : null, parameterCopydefault2 != null ? java.lang.Double.valueOf(parameterCopydefault2.getLineWidth()) : null, bool, null, (parameterCopydefault2 == null || (colorBlk = parameterCopydefault2.getColorBlk()) == null) ? "" : colorBlk, 16, null));
            } catch (java.lang.Exception e) {
                pUU.copydefault(this.OLrzqt, "indicator2Json: " + e);
            }
        }
        indicatorBean.setParams(params);
        indicatorBean.setVisible(java.lang.Boolean.valueOf(z));
        return new Gson().toJson(indicatorBean);
    }
}
