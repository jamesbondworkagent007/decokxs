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
public final class pGF implements InterfaceC37953pGv {
    public Out copydefault(java.lang.Double d, Expression.Parameter parameter) {
        return InterfaceC37953pGv.Application.copydefault(this, d, parameter);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0039  */
    @Override // o.InterfaceC37953pGv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public kotlin.Pair<AbstractC36262oVg, java.lang.Boolean> AEQbTJ(@NotNull KlineIndicatorBean klineIndicatorBean) {
        AbstractC36262oVg ova;
        Out out1;
        Intrinsics.checkNotNullParameter(klineIndicatorBean, "");
        if (!Intrinsics.EZpvd((java.lang.Object) klineIndicatorBean.getKeyName(), (java.lang.Object) "MA")) {
            if (Intrinsics.EZpvd((java.lang.Object) klineIndicatorBean.getKeyName(), (java.lang.Object) ("MA" + C37957pGz.copydefault.OLrzqt()))) {
                ova = new oVA("MA");
            } else {
                ova = new C36272oVq("EMA");
            }
        }
        ova.AkhnZx();
        ova.fetchVPNInfo();
        IndicatorBean indicatorBean = (IndicatorBean) new Gson().fromJson(klineIndicatorBean.getIndicator(), IndicatorBean.class);
        for (int i = 0; i < 6; i++) {
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
                    out1 = params4.getOut4();
                }
            } else if (i == 4) {
                com.okinc.kline.ui.view.model.Params params5 = indicatorBean.getParams();
                if (params5 != null) {
                    out1 = params5.getOut5();
                }
            } else {
                com.okinc.kline.ui.view.model.Params params6 = indicatorBean.getParams();
                out1 = params6 != null ? params6.getOut6() : null;
            }
            if (out1 != null) {
                Expression.Parameter parameterEZpvd = ova.EZpvd(i);
                java.lang.Double value = out1.getValue();
                if (value != null) {
                    double dDoubleValue = value.doubleValue();
                    if (parameterEZpvd != null) {
                        parameterEZpvd.setTempValue(dDoubleValue);
                    }
                }
                Expression.Parameter parameterCopydefault = ova.copydefault(i);
                java.lang.String color = out1.getColor();
                if (color != null && parameterCopydefault != null) {
                    java.lang.String lowerCase = color.toLowerCase(java.util.Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(lowerCase, "");
                    parameterCopydefault.setColorTemp(lowerCase);
                }
                java.lang.String colorBlk = out1.getColorBlk();
                if (parameterCopydefault != null) {
                    parameterCopydefault.setColorBlkTemp(colorBlk);
                }
                java.lang.Boolean visible = out1.getVisible();
                if (visible != null) {
                    boolean zBooleanValue = visible.booleanValue();
                    if (parameterCopydefault != null) {
                        parameterCopydefault.setIsShowTemp(zBooleanValue);
                    }
                }
                java.lang.Double lineWidth = out1.getLineWidth();
                if (lineWidth != null) {
                    double dDoubleValue2 = lineWidth.doubleValue();
                    if (parameterCopydefault != null) {
                        parameterCopydefault.setLineWidth(dDoubleValue2);
                    }
                }
            }
        }
        ova.EZpvd();
        ova.fJNWhG();
        C36278oVw.KWHzl("ds0", indicatorBean.getId(), ova.AuCTel());
        ova.copydefault();
        C36278oVw.copydefault("ds0", indicatorBean.getId(), new Gson().toJson(ova.isConnected()));
        return new kotlin.Pair<>(ova, java.lang.Boolean.valueOf(indicatorBean.getMain()));
    }

    @Override // o.InterfaceC37953pGv
    public java.lang.String OLrzqt(@NotNull AbstractC36262oVg abstractC36262oVg, @NotNull IndicatorBean indicatorBean, boolean z) {
        Intrinsics.checkNotNullParameter(abstractC36262oVg, "");
        Intrinsics.checkNotNullParameter(indicatorBean, "");
        com.okinc.kline.ui.view.model.Params params = indicatorBean.getParams();
        if (params == null) {
            params = new com.okinc.kline.ui.view.model.Params(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 32767, null);
            for (int i = 0; i < 6; i++) {
                Expression.Parameter parameterEZpvd = abstractC36262oVg.EZpvd(i);
                Out outCopydefault = copydefault(java.lang.Double.valueOf(parameterEZpvd.getValue()), abstractC36262oVg.copydefault(i));
                if (i == 0) {
                    params.setOut1(outCopydefault);
                } else if (i == 1) {
                    params.setOut2(outCopydefault);
                } else if (i == 2) {
                    params.setOut3(outCopydefault);
                } else if (i == 3) {
                    params.setOut4(outCopydefault);
                } else if (i == 4) {
                    params.setOut5(outCopydefault);
                } else {
                    params.setOut6(outCopydefault);
                }
            }
        }
        indicatorBean.setParams(params);
        indicatorBean.setVisible(java.lang.Boolean.valueOf(z));
        indicatorBean.setMain(true);
        return new Gson().toJson(indicatorBean);
    }
}
