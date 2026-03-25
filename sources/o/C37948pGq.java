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

/* JADX INFO: renamed from: o.pGq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C37948pGq implements InterfaceC37953pGv {
    public final java.lang.String KWHzl = "CCIIndicatorJsonManage";

    public Out AEQbTJ(Expression.Parameter parameter) {
        return InterfaceC37953pGv.Application.EZpvd(this, parameter);
    }

    public void EZpvd(Out out, Expression.Parameter parameter) {
        InterfaceC37953pGv.Application.OLrzqt(this, out, parameter);
    }

    public java.lang.String copydefault(@NotNull java.lang.String str, boolean z) {
        return InterfaceC37953pGv.Application.KWHzl(this, str, z);
    }

    @Override // o.InterfaceC37953pGv
    public kotlin.Pair<AbstractC36262oVg, java.lang.Boolean> AEQbTJ(@NotNull KlineIndicatorBean klineIndicatorBean) {
        Out out;
        Expression.Parameter parameterCopydefault;
        Length length;
        java.lang.Double value;
        Intrinsics.checkNotNullParameter(klineIndicatorBean, "");
        C36268oVm c36268oVm = new C36268oVm("CCI");
        c36268oVm.AkhnZx();
        c36268oVm.fetchVPNInfo();
        IndicatorBean indicatorBean = (IndicatorBean) new Gson().fromJson(klineIndicatorBean.getIndicator(), IndicatorBean.class);
        try {
            com.okinc.kline.ui.view.model.Params params = indicatorBean.getParams();
            if (params != null && (length = params.getLength()) != null && (value = length.getValue()) != null) {
                double dDoubleValue = value.doubleValue();
                Expression.Parameter parameterEZpvd = c36268oVm.EZpvd(0);
                if (parameterEZpvd != null) {
                    parameterEZpvd.setTempValue(dDoubleValue);
                }
            }
            com.okinc.kline.ui.view.model.Params params2 = indicatorBean.getParams();
            if (params2 != null && (out = params2.getOut()) != null && (parameterCopydefault = c36268oVm.copydefault(0)) != null) {
                EZpvd(out, parameterCopydefault);
            }
        } catch (java.lang.Exception e) {
            pUU.copydefault(this.KWHzl, "handleJsonData: " + e);
        }
        c36268oVm.EZpvd();
        c36268oVm.fJNWhG();
        java.lang.String strEjfBZ = c36268oVm.ejfBZ();
        Intrinsics.checkNotNullExpressionValue(strEjfBZ, "");
        C36278oVw.KWHzl("ds0", copydefault(strEjfBZ, indicatorBean.getMain()), c36268oVm.AuCTel());
        c36268oVm.copydefault();
        java.lang.String strEjfBZ2 = c36268oVm.ejfBZ();
        Intrinsics.checkNotNullExpressionValue(strEjfBZ2, "");
        C36278oVw.copydefault("ds0", copydefault(strEjfBZ2, indicatorBean.getMain()), new Gson().toJson(c36268oVm.isConnected()));
        return new kotlin.Pair<>(c36268oVm, java.lang.Boolean.valueOf(indicatorBean.getMain()));
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
