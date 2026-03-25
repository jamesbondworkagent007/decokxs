package o;

import com.okinc.kline.data.DrawLineBean;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class oUJ {
    public static DrawLineBean EZpvd;
    public static final oUJ KWHzl = new oUJ();
    public static final int AEQbTJ = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DrawLineBean AEQbTJ() {
        return EZpvd;
    }

    private oUJ() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [25=6] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        DrawLineBean drawLineBean;
        DrawLineBean drawLineBean2;
        DrawLineBean drawLineBean3;
        DrawLineBean drawLineBean4;
        DrawLineBean drawLineBean5;
        DrawLineBean drawLineBean6;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        DrawLineBean drawLineBean7 = new DrawLineBean(null, null, 3, null);
        EZpvd = drawLineBean7;
        drawLineBean7.setCoinId(str);
        switch (str2.hashCode()) {
            case -2027980370:
                if (str2.equals("MARGIN") && (drawLineBean = EZpvd) != null) {
                    drawLineBean.setType(4);
                }
                break;
            case -1956807563:
                if (str2.equals("OPTION") && (drawLineBean2 = EZpvd) != null) {
                    drawLineBean2.setType(5);
                }
                break;
            case 2552066:
                if (str2.equals("SPOT") && (drawLineBean3 = EZpvd) != null) {
                    drawLineBean3.setType(3);
                }
                break;
            case 2558355:
                if (str2.equals("SWAP") && (drawLineBean4 = EZpvd) != null) {
                    drawLineBean4.setType(1);
                }
                break;
            case 69808306:
                if (str2.equals("INDEX") && (drawLineBean5 = EZpvd) != null) {
                    drawLineBean5.setType(0);
                    break;
                }
                break;
            case 214415088:
                if (str2.equals("FUTURES") && (drawLineBean6 = EZpvd) != null) {
                    drawLineBean6.setType(2);
                }
                break;
        }
    }
}
