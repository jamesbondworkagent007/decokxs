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

/* JADX INFO: renamed from: o.pGx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C37955pGx implements InterfaceC37953pGv {
    public final java.lang.String copydefault = "KDJIndicatorJsonManage";

    public java.lang.String EZpvd(@NotNull java.lang.String str, boolean z) {
        return InterfaceC37953pGv.Application.KWHzl(this, str, z);
    }

    public Out OLrzqt(Expression.Parameter parameter) {
        return InterfaceC37953pGv.Application.EZpvd(this, parameter);
    }

    public void copydefault(Out out, Expression.Parameter parameter) {
        InterfaceC37953pGv.Application.OLrzqt(this, out, parameter);
    }

    @Override // o.InterfaceC37953pGv
    public kotlin.Pair<AbstractC36262oVg, java.lang.Boolean> AEQbTJ(@NotNull KlineIndicatorBean klineIndicatorBean) {
        Out j;
        Expression.Parameter parameterCopydefault;
        Out d;
        Expression.Parameter parameterCopydefault2;
        Out k;
        Expression.Parameter parameterCopydefault3;
        Length smoothD;
        java.lang.Double value;
        Length smoothK;
        java.lang.Double value2;
        Length length;
        java.lang.Double value3;
        Intrinsics.checkNotNullParameter(klineIndicatorBean, "");
        C36279oVx c36279oVx = new C36279oVx("KDJ");
        c36279oVx.AkhnZx();
        c36279oVx.fetchVPNInfo();
        IndicatorBean indicatorBean = (IndicatorBean) new Gson().fromJson(klineIndicatorBean.getIndicator(), IndicatorBean.class);
        try {
            com.okinc.kline.ui.view.model.Params params = indicatorBean.getParams();
            if (params != null && (length = params.getLength()) != null && (value3 = length.getValue()) != null) {
                double dDoubleValue = value3.doubleValue();
                Expression.Parameter parameterEZpvd = c36279oVx.EZpvd(0);
                if (parameterEZpvd != null) {
                    parameterEZpvd.setTempValue(dDoubleValue);
                }
            }
            com.okinc.kline.ui.view.model.Params params2 = indicatorBean.getParams();
            if (params2 != null && (smoothK = params2.getSmoothK()) != null && (value2 = smoothK.getValue()) != null) {
                double dDoubleValue2 = value2.doubleValue();
                Expression.Parameter parameterEZpvd2 = c36279oVx.EZpvd(1);
                if (parameterEZpvd2 != null) {
                    parameterEZpvd2.setTempValue(dDoubleValue2);
                }
            }
            com.okinc.kline.ui.view.model.Params params3 = indicatorBean.getParams();
            if (params3 != null && (smoothD = params3.getSmoothD()) != null && (value = smoothD.getValue()) != null) {
                double dDoubleValue3 = value.doubleValue();
                Expression.Parameter parameterEZpvd3 = c36279oVx.EZpvd(2);
                if (parameterEZpvd3 != null) {
                    parameterEZpvd3.setTempValue(dDoubleValue3);
                }
            }
            com.okinc.kline.ui.view.model.Params params4 = indicatorBean.getParams();
            if (params4 != null && (k = params4.getK()) != null && (parameterCopydefault3 = c36279oVx.copydefault(0)) != null) {
                copydefault(k, parameterCopydefault3);
            }
            com.okinc.kline.ui.view.model.Params params5 = indicatorBean.getParams();
            if (params5 != null && (d = params5.getD()) != null && (parameterCopydefault2 = c36279oVx.copydefault(1)) != null) {
                copydefault(d, parameterCopydefault2);
            }
            com.okinc.kline.ui.view.model.Params params6 = indicatorBean.getParams();
            if (params6 != null && (j = params6.getJ()) != null && (parameterCopydefault = c36279oVx.copydefault(2)) != null) {
                copydefault(j, parameterCopydefault);
            }
        } catch (java.lang.Exception e) {
            pUU.copydefault(this.copydefault, "handleJsonData: " + e);
        }
        c36279oVx.EZpvd();
        c36279oVx.fJNWhG();
        java.lang.String strEjfBZ = c36279oVx.ejfBZ();
        Intrinsics.checkNotNullExpressionValue(strEjfBZ, "");
        C36278oVw.KWHzl("ds0", EZpvd(strEjfBZ, indicatorBean.getMain()), c36279oVx.AuCTel());
        c36279oVx.copydefault();
        java.lang.String strEjfBZ2 = c36279oVx.ejfBZ();
        Intrinsics.checkNotNullExpressionValue(strEjfBZ2, "");
        C36278oVw.copydefault("ds0", EZpvd(strEjfBZ2, indicatorBean.getMain()), new Gson().toJson(c36279oVx.isConnected()));
        return new kotlin.Pair<>(c36279oVx, java.lang.Boolean.valueOf(indicatorBean.getMain()));
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
                Expression.Parameter parameterEZpvd2 = abstractC36262oVg.EZpvd(1);
                params.setSmoothK(new Length(parameterEZpvd2 != null ? java.lang.Double.valueOf(parameterEZpvd2.getValue()) : null));
                Expression.Parameter parameterEZpvd3 = abstractC36262oVg.EZpvd(2);
                params.setSmoothD(new Length(parameterEZpvd3 != null ? java.lang.Double.valueOf(parameterEZpvd3.getValue()) : null));
                params.setK(OLrzqt(abstractC36262oVg.copydefault(0)));
                params.setD(OLrzqt(abstractC36262oVg.copydefault(1)));
                params.setJ(OLrzqt(abstractC36262oVg.copydefault(2)));
            } catch (java.lang.Exception e) {
                pUU.copydefault(this.copydefault, "indicator2Json: " + e);
            }
        }
        indicatorBean.setParams(params);
        indicatorBean.setVisible(java.lang.Boolean.valueOf(z));
        return new Gson().toJson(indicatorBean);
    }
}
