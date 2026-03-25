package o;

import android.graphics.Color;
import com.okinc.kline.library.indicator.Expression;
import com.okinc.kline.ui.view.model.IndicatorBean;
import com.okinc.kline.ui.view.model.KlineIndicatorBean;
import com.okinc.kline.ui.view.model.Out;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pGv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public interface InterfaceC37953pGv {
    kotlin.Pair<AbstractC36262oVg, java.lang.Boolean> AEQbTJ(@NotNull KlineIndicatorBean klineIndicatorBean);

    java.lang.String OLrzqt(@NotNull AbstractC36262oVg abstractC36262oVg, @NotNull IndicatorBean indicatorBean, boolean z);

    /* JADX INFO: renamed from: o.pGv$Application */
    public static final class Application {
        public static java.lang.String KWHzl(@NotNull InterfaceC37953pGv interfaceC37953pGv, @NotNull java.lang.String str, boolean z) {
            Intrinsics.checkNotNullParameter(str, "");
            if (z) {
                return str;
            }
            return str + "_sub";
        }

        public static Out EZpvd(@NotNull InterfaceC37953pGv interfaceC37953pGv, Expression.Parameter parameter) {
            java.lang.String colorBlk;
            java.lang.String color = parameter != null ? parameter.getColor() : null;
            java.lang.Double dValueOf = parameter != null ? java.lang.Double.valueOf(parameter.getLineWidth()) : null;
            java.lang.Boolean boolValueOf = parameter != null ? java.lang.Boolean.valueOf(parameter.getIsShow()) : null;
            if (parameter == null || (colorBlk = parameter.getColorBlk()) == null) {
                colorBlk = "";
            }
            return new Out(null, color, dValueOf, boolValueOf, null, colorBlk, 16, null);
        }

        public static Out copydefault(@NotNull InterfaceC37953pGv interfaceC37953pGv, java.lang.Double d, Expression.Parameter parameter) {
            java.lang.String colorBlk;
            java.lang.String color = parameter != null ? parameter.getColor() : null;
            java.lang.Double dValueOf = parameter != null ? java.lang.Double.valueOf(parameter.getLineWidth()) : null;
            java.lang.Boolean boolValueOf = parameter != null ? java.lang.Boolean.valueOf(parameter.getIsShow()) : null;
            if (parameter == null || (colorBlk = parameter.getColorBlk()) == null) {
                colorBlk = "";
            }
            return new Out(d, color, dValueOf, boolValueOf, null, colorBlk, 16, null);
        }

        public static void OLrzqt(@NotNull InterfaceC37953pGv interfaceC37953pGv, Out out, Expression.Parameter parameter) {
            java.lang.Double lineWidth;
            if (out != null) {
                try {
                    java.lang.String color = out.getColor();
                    if (color != null) {
                        Color.parseColor(color);
                        if (parameter != null) {
                            java.lang.String lowerCase = color.toLowerCase(java.util.Locale.ROOT);
                            Intrinsics.checkNotNullExpressionValue(lowerCase, "");
                            parameter.setColorTemp(lowerCase);
                        }
                    }
                } catch (java.lang.Exception e) {
                    pUU.copydefault("read Indicator from Service error " + e.getMessage());
                    if (parameter != null) {
                        parameter.setColorTemp(pDT.Companion.KWHzl().AhwBna());
                    }
                }
            }
            java.lang.String colorBlk = out != null ? out.getColorBlk() : null;
            if (parameter != null) {
                parameter.setColorBlkTemp(colorBlk);
            }
            if (out != null && (lineWidth = out.getLineWidth()) != null) {
                double dDoubleValue = lineWidth.doubleValue();
                if (parameter != null) {
                    parameter.setLineWidth(dDoubleValue);
                }
            }
            if (parameter != null) {
                parameter.setIsShowTemp((out != null ? out.getVisible() : null) == null || Intrinsics.EZpvd(out.getVisible(), java.lang.Boolean.TRUE));
            }
        }
    }
}
