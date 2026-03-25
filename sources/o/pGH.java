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
public final class pGH implements InterfaceC37953pGv {
    public Out KWHzl(java.lang.Double d, Expression.Parameter parameter) {
        return InterfaceC37953pGv.Application.copydefault(this, d, parameter);
    }

    public java.lang.String copydefault(@NotNull java.lang.String str, boolean z) {
        return InterfaceC37953pGv.Application.KWHzl(this, str, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0067  */
    @Override // o.InterfaceC37953pGv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public kotlin.Pair<AbstractC36262oVg, java.lang.Boolean> AEQbTJ(@NotNull KlineIndicatorBean klineIndicatorBean) {
        Out background;
        Expression.Parameter parameterCopydefault;
        Out out1;
        Intrinsics.checkNotNullParameter(klineIndicatorBean, "");
        oVE ove = new oVE("RSI");
        ove.AkhnZx();
        IndicatorBean indicatorBean = (IndicatorBean) new Gson().fromJson(klineIndicatorBean.getIndicator(), IndicatorBean.class);
        int i = 0;
        while (true) {
            boolean z = true;
            if (i >= 5) {
                break;
            }
            if (i == 0) {
                com.okinc.kline.ui.view.model.Params params = indicatorBean.getParams();
                if (params != null) {
                    out1 = params.getOut1();
                }
            } else if (i == 1) {
                com.okinc.kline.ui.view.model.Params params2 = indicatorBean.getParams();
                if (params2 != null) {
                    out1 = params2.getOut2();
                }
            } else if (i == 2) {
                com.okinc.kline.ui.view.model.Params params3 = indicatorBean.getParams();
                if (params3 != null) {
                    out1 = params3.getOut3();
                }
            } else if (i == 3) {
                com.okinc.kline.ui.view.model.Params params4 = indicatorBean.getParams();
                if (params4 != null) {
                    out1 = params4.getUpperBound();
                }
            } else {
                com.okinc.kline.ui.view.model.Params params5 = indicatorBean.getParams();
                out1 = params5 != null ? params5.getLowerBound() : null;
            }
            if (out1 != null) {
                Expression.Parameter parameterEZpvd = ove.EZpvd(i);
                java.lang.Double value = out1.getValue();
                if (value != null) {
                    double dDoubleValue = value.doubleValue();
                    if (parameterEZpvd != null) {
                        parameterEZpvd.setTempValue(dDoubleValue);
                    }
                }
                Expression.Parameter parameterCopydefault2 = ove.copydefault(i);
                java.lang.String color = out1.getColor();
                if (color != null && parameterCopydefault2 != null) {
                    java.lang.String lowerCase = color.toLowerCase(java.util.Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(lowerCase, "");
                    parameterCopydefault2.setColorTemp(lowerCase);
                }
                java.lang.String colorBlk = out1.getColorBlk();
                if (parameterCopydefault2 != null) {
                    parameterCopydefault2.setColorBlkTemp(colorBlk);
                }
                java.lang.Double lineWidth = out1.getLineWidth();
                if (lineWidth != null) {
                    double dDoubleValue2 = lineWidth.doubleValue();
                    if (parameterCopydefault2 != null) {
                        parameterCopydefault2.setLineWidth(dDoubleValue2);
                    }
                }
                if (parameterCopydefault2 != null) {
                    if (out1.getVisible() != null && !Intrinsics.EZpvd(out1.getVisible(), java.lang.Boolean.TRUE)) {
                        z = false;
                    }
                    parameterCopydefault2.setIsShowTemp(z);
                }
            }
            i++;
        }
        com.okinc.kline.ui.view.model.Params params6 = indicatorBean.getParams();
        if (params6 != null && (background = params6.getBackground()) != null && (parameterCopydefault = ove.copydefault(5)) != null) {
            java.lang.String color2 = background.getColor();
            if (color2 != null) {
                kotlin.Pair<java.lang.String, java.lang.Integer> pairKWHzl = pEL.OLrzqt.KWHzl(color2);
                java.lang.String lowerCase2 = pairKWHzl.getFirst().toLowerCase(java.util.Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase2, "");
                parameterCopydefault.setColorTemp(lowerCase2);
                parameterCopydefault.setTransparencyTemp(pairKWHzl.getSecond().intValue());
            }
            parameterCopydefault.setColorBlkTemp(background.getColorBlk());
            parameterCopydefault.setIsShowTemp(background.getVisible() == null || Intrinsics.EZpvd(background.getVisible(), java.lang.Boolean.TRUE));
        }
        ove.EZpvd();
        ove.fJNWhG();
        java.lang.String strEjfBZ = ove.ejfBZ();
        Intrinsics.checkNotNullExpressionValue(strEjfBZ, "");
        C36278oVw.KWHzl("ds0", copydefault(strEjfBZ, indicatorBean.getMain()), ove.AuCTel());
        ove.copydefault();
        java.lang.String strEjfBZ2 = ove.ejfBZ();
        Intrinsics.checkNotNullExpressionValue(strEjfBZ2, "");
        C36278oVw.copydefault("ds0", copydefault(strEjfBZ2, indicatorBean.getMain()), new Gson().toJson(ove.isConnected()));
        return new kotlin.Pair<>(ove, java.lang.Boolean.valueOf(indicatorBean.getMain()));
    }

    @Override // o.InterfaceC37953pGv
    public java.lang.String OLrzqt(@NotNull AbstractC36262oVg abstractC36262oVg, @NotNull IndicatorBean indicatorBean, boolean z) {
        java.lang.String color;
        java.lang.String colorBlk;
        Intrinsics.checkNotNullParameter(abstractC36262oVg, "");
        Intrinsics.checkNotNullParameter(indicatorBean, "");
        com.okinc.kline.ui.view.model.Params params = indicatorBean.getParams();
        if (params == null) {
            params = new com.okinc.kline.ui.view.model.Params(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 32767, null);
            int i = 0;
            while (true) {
                if (i >= 5) {
                    break;
                }
                Expression.Parameter parameterEZpvd = abstractC36262oVg.EZpvd(i);
                Out outKWHzl = KWHzl(parameterEZpvd != null ? java.lang.Double.valueOf(parameterEZpvd.getValue()) : null, abstractC36262oVg.copydefault(i));
                if (i == 0) {
                    params.setOut1(outKWHzl);
                } else if (i == 1) {
                    params.setOut2(outKWHzl);
                } else if (i == 2) {
                    params.setOut3(outKWHzl);
                } else if (i == 3) {
                    params.setUpperBound(outKWHzl);
                } else {
                    params.setLowerBound(outKWHzl);
                }
                i++;
            }
            Expression.Parameter parameterCopydefault = abstractC36262oVg.copydefault(5);
            pEL pel = pEL.OLrzqt;
            if (parameterCopydefault == null || (color = parameterCopydefault.getColor()) == null) {
                color = "#FFA726";
            }
            params.setBackground(new Out(null, pel.KWHzl(color, parameterCopydefault != null ? parameterCopydefault.getTransparency() : 20), null, java.lang.Boolean.valueOf(parameterCopydefault != null ? parameterCopydefault.getIsShow() : true), null, (parameterCopydefault == null || (colorBlk = parameterCopydefault.getColorBlk()) == null) ? "" : colorBlk, 16, null));
        }
        indicatorBean.setParams(params);
        indicatorBean.setVisible(java.lang.Boolean.valueOf(z));
        return new Gson().toJson(indicatorBean);
    }
}
