package o;

import android.graphics.Color;
import com.okinc.core.util.SPUtils;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.pCb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C37825pCb {
    public static final C37825pCb KWHzl = new C37825pCb();
    public static java.lang.Integer OLrzqt = SPUtils.getInt("chart_price_window_theme", 1);
    public static final int AEQbTJ = 8;

    private C37825pCb() {
    }

    public final int AEQbTJ() {
        java.lang.Integer num = OLrzqt;
        Intrinsics.checkNotNullExpressionValue(num, "");
        return num.intValue();
    }

    public final boolean KWHzl() {
        java.lang.Integer num = OLrzqt;
        return num != null && num.intValue() == 0;
    }

    public final int copydefault() {
        java.lang.Integer num = OLrzqt;
        if (num != null && num.intValue() == 0) {
            return Color.parseColor("#000000");
        }
        return Color.parseColor("#DCE0E8");
    }

    public final int OLrzqt() {
        java.lang.Integer num = OLrzqt;
        if (num != null && num.intValue() == 0) {
            return Color.parseColor("#3D3D3D");
        }
        return Color.parseColor("#E3E3E3");
    }

    public final int EZpvd() {
        java.lang.Integer num = OLrzqt;
        if (num != null && num.intValue() == 0) {
            return Color.parseColor("#EDF0F7");
        }
        return Color.parseColor("#444C5D");
    }

    public final void gEmmrt() {
        EZpvd(0);
    }

    public final void AYXKKw() {
        EZpvd(1);
    }

    public final void EZpvd(int i) {
        OLrzqt = java.lang.Integer.valueOf(i);
        SPUtils.put("chart_price_window_theme", java.lang.Integer.valueOf(i));
        if (i == 0) {
            pBO.dxcTrN.AEQbTJ(0);
        } else {
            if (i != 1) {
                return;
            }
            pBO.dxcTrN.AEQbTJ(1);
        }
    }
}
