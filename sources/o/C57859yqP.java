package o;

import android.graphics.Paint;
import com.robinhood.ticker.TickerView;

/* JADX INFO: renamed from: o.yqP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public class C57859yqP {
    public final android.graphics.Paint AEQbTJ;
    public float KWHzl;
    public float OLrzqt;
    public final java.util.Map<java.lang.Character, java.lang.Float> EZpvd = new java.util.HashMap(256);
    public TickerView.ScrollingDirection copydefault = TickerView.ScrollingDirection.ANY;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public float AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void EZpvd(TickerView.ScrollingDirection scrollingDirection) {
        this.copydefault = scrollingDirection;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public float KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TickerView.ScrollingDirection copydefault() {
        return this.copydefault;
    }

    public C57859yqP(android.graphics.Paint paint) {
        this.AEQbTJ = paint;
        EZpvd();
    }

    public void EZpvd() {
        this.EZpvd.clear();
        Paint.FontMetrics fontMetrics = this.AEQbTJ.getFontMetrics();
        float f = fontMetrics.bottom;
        float f2 = fontMetrics.top;
        this.KWHzl = f - f2;
        this.OLrzqt = -f2;
    }

    public float EZpvd(char c) {
        if (c == 0) {
            return 0.0f;
        }
        java.lang.Float f = this.EZpvd.get(java.lang.Character.valueOf(c));
        if (f != null) {
            return f.floatValue();
        }
        float fMeasureText = this.AEQbTJ.measureText(java.lang.Character.toString(c));
        this.EZpvd.put(java.lang.Character.valueOf(c), java.lang.Float.valueOf(fMeasureText));
        return fMeasureText;
    }
}
