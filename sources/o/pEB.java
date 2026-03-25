package o;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.okinc.core.util.SPUtils;
import com.okinc.kline.library.drawline.DrawLineData;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class pEB {
    public static final pEB OLrzqt = new pEB();
    public static final InterfaceC56387yDm KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.pEJ
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return pEB.AEQbTJ();
        }
    });
    public static final InterfaceC56387yDm copydefault = C56392yDr.copydefault(new Function0() { // from class: o.pEG
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return pEB.copydefault();
        }
    });
    public static final int EZpvd = 8;

    public static final class ActionBar extends TypeToken<java.util.ArrayList<DrawLineData.DrawLineFiboBean>> {
    }

    private pEB() {
    }

    public static final Gson AEQbTJ() {
        return new Gson();
    }

    public final Gson AYXKKw() {
        return (Gson) KWHzl.getValue();
    }

    public final java.lang.reflect.Type AhwBna() {
        return (java.lang.reflect.Type) copydefault.getValue();
    }

    public static final java.lang.reflect.Type copydefault() {
        return new ActionBar().getType();
    }

    public final java.util.ArrayList<DrawLineData.DrawLineFiboBean> KWHzl() {
        return yDY.copydefault(new DrawLineData.DrawLineFiboBean(0.0f, true), new DrawLineData.DrawLineFiboBean(0.236f, true), new DrawLineData.DrawLineFiboBean(0.382f, true), new DrawLineData.DrawLineFiboBean(0.5f, true), new DrawLineData.DrawLineFiboBean(0.618f, true), new DrawLineData.DrawLineFiboBean(0.786f, true), new DrawLineData.DrawLineFiboBean(1.0f, true), new DrawLineData.DrawLineFiboBean(1.382f, true), new DrawLineData.DrawLineFiboBean(1.5f, false), new DrawLineData.DrawLineFiboBean(1.618f, true), new DrawLineData.DrawLineFiboBean(2.0f, false), new DrawLineData.DrawLineFiboBean(2.236f, false), new DrawLineData.DrawLineFiboBean(2.382f, false), new DrawLineData.DrawLineFiboBean(2.5f, false), new DrawLineData.DrawLineFiboBean(2.618f, true), new DrawLineData.DrawLineFiboBean(3.0f, false), new DrawLineData.DrawLineFiboBean(3.236f, false), new DrawLineData.DrawLineFiboBean(3.382f, false), new DrawLineData.DrawLineFiboBean(3.5f, false), new DrawLineData.DrawLineFiboBean(3.618f, false));
    }

    public final java.util.ArrayList<DrawLineData.DrawLineFiboBean> gEmmrt() {
        java.lang.String string = SPUtils.getString("draw_line_fibo", null);
        if (string != null) {
            try {
                java.lang.Object objFromJson = AYXKKw().fromJson(string, AhwBna());
                Intrinsics.checkNotNullExpressionValue(objFromJson, "");
                java.util.ArrayList<DrawLineData.DrawLineFiboBean> arrayList = (java.util.ArrayList) objFromJson;
                if (!arrayList.isEmpty()) {
                    return arrayList;
                }
            } catch (java.lang.Exception e) {
                pUU.copydefault("KlineFiboHelper", "getUserFiboSettings error " + e.getMessage());
            }
        }
        return KWHzl();
    }

    public final void AEQbTJ(@NotNull java.util.ArrayList<DrawLineData.DrawLineFiboBean> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        try {
            SPUtils.put("draw_line_fibo", AYXKKw().toJson(arrayList));
        } catch (java.lang.Exception e) {
            pUU.copydefault("KlineFiboHelper", "saveUserFiboSettings error " + e.getMessage());
        }
    }
}
