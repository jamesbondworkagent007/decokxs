package o;

import com.immomo.mls.fun.ui.custom.data.JDImageInfo;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: renamed from: o.alR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class C7521alR {
    public JDImageInfo EZpvd;
    public float KWHzl;
    public float copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public float AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public float EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public JDImageInfo KWHzl() {
        return this.EZpvd;
    }

    public C7521alR() {
    }

    public C7521alR(float f, float f2) {
        this.KWHzl = f;
        this.copydefault = f2;
    }

    public C7521alR(float f, float f2, JDImageInfo jDImageInfo) {
        this.KWHzl = f;
        this.copydefault = f2;
        this.EZpvd = jDImageInfo;
    }

    public java.lang.String toString() {
        return "OKLineChartPoint{x=" + this.KWHzl + ", y=" + this.copydefault + AbstractJsonLexerKt.END_OBJ;
    }
}
