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

/* JADX INFO: renamed from: o.pGn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C37945pGn implements InterfaceC37953pGv {
    public void EZpvd(Out out, Expression.Parameter parameter) {
        InterfaceC37953pGv.Application.OLrzqt(this, out, parameter);
    }

    public java.lang.String OLrzqt(@NotNull java.lang.String str, boolean z) {
        return InterfaceC37953pGv.Application.KWHzl(this, str, z);
    }

    public Out copydefault(Expression.Parameter parameter) {
        return InterfaceC37953pGv.Application.EZpvd(this, parameter);
    }

    @Override // o.InterfaceC37953pGv
    public kotlin.Pair<AbstractC36262oVg, java.lang.Boolean> AEQbTJ(@NotNull KlineIndicatorBean klineIndicatorBean) {
        Out background;
        Expression.Parameter parameterCopydefault;
        Out lower;
        Expression.Parameter parameterCopydefault2;
        Out upper;
        Expression.Parameter parameterCopydefault3;
        Out median;
        Expression.Parameter parameterCopydefault4;
        Length mult;
        java.lang.Double value;
        Length length;
        java.lang.Double value2;
        Intrinsics.checkNotNullParameter(klineIndicatorBean, "");
        C36266oVk c36266oVk = new C36266oVk("BOLL");
        c36266oVk.AkhnZx();
        c36266oVk.fetchVPNInfo();
        IndicatorBean indicatorBean = (IndicatorBean) new Gson().fromJson(klineIndicatorBean.getIndicator(), IndicatorBean.class);
        com.okinc.kline.ui.view.model.Params params = indicatorBean.getParams();
        if (params != null && (length = params.getLength()) != null && (value2 = length.getValue()) != null) {
            double dDoubleValue = value2.doubleValue();
            Expression.Parameter parameterEZpvd = c36266oVk.EZpvd(0);
            if (parameterEZpvd != null) {
                parameterEZpvd.setTempValue(dDoubleValue);
            }
        }
        com.okinc.kline.ui.view.model.Params params2 = indicatorBean.getParams();
        if (params2 != null && (mult = params2.getMult()) != null && (value = mult.getValue()) != null) {
            double dDoubleValue2 = value.doubleValue();
            Expression.Parameter parameterEZpvd2 = c36266oVk.EZpvd(1);
            if (parameterEZpvd2 != null) {
                parameterEZpvd2.setTempValue(dDoubleValue2);
            }
        }
        com.okinc.kline.ui.view.model.Params params3 = indicatorBean.getParams();
        if (params3 != null && (median = params3.getMedian()) != null && (parameterCopydefault4 = c36266oVk.copydefault(0)) != null) {
            EZpvd(median, parameterCopydefault4);
        }
        com.okinc.kline.ui.view.model.Params params4 = indicatorBean.getParams();
        if (params4 != null && (upper = params4.getUpper()) != null && (parameterCopydefault3 = c36266oVk.copydefault(1)) != null) {
            EZpvd(upper, parameterCopydefault3);
        }
        com.okinc.kline.ui.view.model.Params params5 = indicatorBean.getParams();
        if (params5 != null && (lower = params5.getLower()) != null && (parameterCopydefault2 = c36266oVk.copydefault(2)) != null) {
            EZpvd(lower, parameterCopydefault2);
        }
        com.okinc.kline.ui.view.model.Params params6 = indicatorBean.getParams();
        if (params6 != null && (background = params6.getBackground()) != null && (parameterCopydefault = c36266oVk.copydefault(3)) != null) {
            java.lang.String color = background.getColor();
            if (color != null) {
                kotlin.Pair<java.lang.String, java.lang.Integer> pairKWHzl = pEL.OLrzqt.KWHzl(color);
                java.lang.String lowerCase = pairKWHzl.getFirst().toLowerCase(java.util.Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "");
                parameterCopydefault.setColorTemp(lowerCase);
                parameterCopydefault.setTransparencyTemp(pairKWHzl.getSecond().intValue());
            }
            parameterCopydefault.setColorBlkTemp(background.getColorBlk());
            parameterCopydefault.setIsShowTemp(background.getVisible() == null || Intrinsics.EZpvd(background.getVisible(), java.lang.Boolean.TRUE));
        }
        c36266oVk.EZpvd();
        c36266oVk.fJNWhG();
        java.lang.String strEjfBZ = c36266oVk.ejfBZ();
        Intrinsics.checkNotNullExpressionValue(strEjfBZ, "");
        C36278oVw.KWHzl("ds0", OLrzqt(strEjfBZ, indicatorBean.getMain()), c36266oVk.AuCTel());
        c36266oVk.copydefault();
        java.lang.String strEjfBZ2 = c36266oVk.ejfBZ();
        Intrinsics.checkNotNullExpressionValue(strEjfBZ2, "");
        C36278oVw.copydefault("ds0", OLrzqt(strEjfBZ2, indicatorBean.getMain()), new Gson().toJson(c36266oVk.isConnected()));
        return new kotlin.Pair<>(c36266oVk, java.lang.Boolean.valueOf(indicatorBean.getMain()));
    }

    @Override // o.InterfaceC37953pGv
    public java.lang.String OLrzqt(@NotNull AbstractC36262oVg abstractC36262oVg, @NotNull IndicatorBean indicatorBean, boolean z) {
        java.lang.String color;
        Intrinsics.checkNotNullParameter(abstractC36262oVg, "");
        Intrinsics.checkNotNullParameter(indicatorBean, "");
        com.okinc.kline.ui.view.model.Params params = indicatorBean.getParams();
        if (params == null) {
            params = new com.okinc.kline.ui.view.model.Params(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 32767, null);
            Expression.Parameter parameterEZpvd = abstractC36262oVg.EZpvd(0);
            params.setLength(new Length(parameterEZpvd != null ? java.lang.Double.valueOf(parameterEZpvd.getValue()) : null));
            Expression.Parameter parameterEZpvd2 = abstractC36262oVg.EZpvd(1);
            params.setMult(new Length(parameterEZpvd2 != null ? java.lang.Double.valueOf(parameterEZpvd2.getValue()) : null));
            params.setMedian(copydefault(abstractC36262oVg.copydefault(0)));
            params.setUpper(copydefault(abstractC36262oVg.copydefault(1)));
            params.setLower(copydefault(abstractC36262oVg.copydefault(2)));
            Expression.Parameter parameterCopydefault = abstractC36262oVg.copydefault(3);
            pEL pel = pEL.OLrzqt;
            if (parameterCopydefault == null || (color = parameterCopydefault.getColor()) == null) {
                color = "#FFA726";
            }
            java.lang.String strKWHzl = pel.KWHzl(color, parameterCopydefault != null ? parameterCopydefault.getTransparency() : 20);
            boolean isShow = parameterCopydefault.getIsShow();
            java.lang.String colorBlk = parameterCopydefault.getColorBlk();
            params.setBackground(new Out(null, strKWHzl, null, java.lang.Boolean.valueOf(isShow), null, colorBlk == null ? "" : colorBlk, 16, null));
        }
        indicatorBean.setParams(params);
        indicatorBean.setVisible(java.lang.Boolean.valueOf(z));
        return new Gson().toJson(indicatorBean);
    }
}
