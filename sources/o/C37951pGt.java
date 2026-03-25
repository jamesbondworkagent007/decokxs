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

/* JADX INFO: renamed from: o.pGt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C37951pGt implements InterfaceC37953pGv {
    public final java.lang.String KWHzl = "DMIIndicatorJsonManage";

    public Out AEQbTJ(Expression.Parameter parameter) {
        return InterfaceC37953pGv.Application.EZpvd(this, parameter);
    }

    public void AEQbTJ(Out out, Expression.Parameter parameter) {
        InterfaceC37953pGv.Application.OLrzqt(this, out, parameter);
    }

    public java.lang.String OLrzqt(@NotNull java.lang.String str, boolean z) {
        return InterfaceC37953pGv.Application.KWHzl(this, str, z);
    }

    @Override // o.InterfaceC37953pGv
    public kotlin.Pair<AbstractC36262oVg, java.lang.Boolean> AEQbTJ(@NotNull KlineIndicatorBean klineIndicatorBean) {
        Out adxr;
        Expression.Parameter parameterCopydefault;
        Out adx;
        Expression.Parameter parameterCopydefault2;
        Out minusDI;
        Expression.Parameter parameterCopydefault3;
        Out plusDI;
        Expression.Parameter parameterCopydefault4;
        Length lengthADX;
        java.lang.Double value;
        Length lengthDI;
        java.lang.Double value2;
        Intrinsics.checkNotNullParameter(klineIndicatorBean, "");
        C36274oVs c36274oVs = new C36274oVs("DMI");
        c36274oVs.AkhnZx();
        c36274oVs.fetchVPNInfo();
        IndicatorBean indicatorBean = (IndicatorBean) new Gson().fromJson(klineIndicatorBean.getIndicator(), IndicatorBean.class);
        com.okinc.kline.ui.view.model.Params params = indicatorBean.getParams();
        if (params != null && (lengthDI = params.getLengthDI()) != null && (value2 = lengthDI.getValue()) != null) {
            double dDoubleValue = value2.doubleValue();
            Expression.Parameter parameterEZpvd = c36274oVs.EZpvd(0);
            if (parameterEZpvd != null) {
                parameterEZpvd.setTempValue(dDoubleValue);
            }
        }
        com.okinc.kline.ui.view.model.Params params2 = indicatorBean.getParams();
        if (params2 != null && (lengthADX = params2.getLengthADX()) != null && (value = lengthADX.getValue()) != null) {
            double dDoubleValue2 = value.doubleValue();
            Expression.Parameter parameterEZpvd2 = c36274oVs.EZpvd(1);
            if (parameterEZpvd2 != null) {
                parameterEZpvd2.setTempValue(dDoubleValue2);
            }
        }
        com.okinc.kline.ui.view.model.Params params3 = indicatorBean.getParams();
        if (params3 != null && (plusDI = params3.getPlusDI()) != null && (parameterCopydefault4 = c36274oVs.copydefault(0)) != null) {
            AEQbTJ(plusDI, parameterCopydefault4);
        }
        com.okinc.kline.ui.view.model.Params params4 = indicatorBean.getParams();
        if (params4 != null && (minusDI = params4.getMinusDI()) != null && (parameterCopydefault3 = c36274oVs.copydefault(1)) != null) {
            AEQbTJ(minusDI, parameterCopydefault3);
        }
        com.okinc.kline.ui.view.model.Params params5 = indicatorBean.getParams();
        if (params5 != null && (adx = params5.getAdx()) != null && (parameterCopydefault2 = c36274oVs.copydefault(2)) != null) {
            AEQbTJ(adx, parameterCopydefault2);
        }
        com.okinc.kline.ui.view.model.Params params6 = indicatorBean.getParams();
        if (params6 != null && (adxr = params6.getAdxr()) != null && (parameterCopydefault = c36274oVs.copydefault(3)) != null) {
            AEQbTJ(adxr, parameterCopydefault);
        }
        c36274oVs.EZpvd();
        c36274oVs.fJNWhG();
        java.lang.String strEjfBZ = c36274oVs.ejfBZ();
        Intrinsics.checkNotNullExpressionValue(strEjfBZ, "");
        C36278oVw.KWHzl("ds0", OLrzqt(strEjfBZ, indicatorBean.getMain()), c36274oVs.AuCTel());
        c36274oVs.copydefault();
        java.lang.String strEjfBZ2 = c36274oVs.ejfBZ();
        Intrinsics.checkNotNullExpressionValue(strEjfBZ2, "");
        C36278oVw.copydefault("ds0", OLrzqt(strEjfBZ2, indicatorBean.getMain()), new Gson().toJson(c36274oVs.isConnected()));
        return new kotlin.Pair<>(c36274oVs, java.lang.Boolean.valueOf(indicatorBean.getMain()));
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
                params.setLengthDI(new Length(parameterEZpvd != null ? java.lang.Double.valueOf(parameterEZpvd.getValue()) : null));
                Expression.Parameter parameterEZpvd2 = abstractC36262oVg.EZpvd(1);
                params.setLengthADX(new Length(parameterEZpvd2 != null ? java.lang.Double.valueOf(parameterEZpvd2.getValue()) : null));
                params.setPlusDI(AEQbTJ(abstractC36262oVg.copydefault(0)));
                params.setMinusDI(AEQbTJ(abstractC36262oVg.copydefault(1)));
                params.setAdx(AEQbTJ(abstractC36262oVg.copydefault(2)));
                params.setAdxr(AEQbTJ(abstractC36262oVg.copydefault(3)));
            } catch (java.lang.Exception e) {
                pUU.copydefault(this.KWHzl, "indicator2Json: " + e);
            }
        }
        indicatorBean.setParams(params);
        indicatorBean.setVisible(java.lang.Boolean.valueOf(z));
        return new Gson().toJson(indicatorBean);
    }
}
