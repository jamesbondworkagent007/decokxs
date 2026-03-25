package o;

import android.graphics.Paint;
import com.okinc.planet.biz_content.input.data.InputHyperlinkType;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ttk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C47631ttk extends android.text.style.ReplacementSpan {
    public final java.lang.String AEQbTJ;
    public final int EZpvd;
    public final java.lang.String KWHzl;
    public final InputHyperlinkType OLrzqt;
    public final java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InputHyperlinkType AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.KWHzl;
    }

    public C47631ttk(@NotNull java.lang.String str, int i, @NotNull java.lang.String str2, @NotNull InputHyperlinkType inputHyperlinkType, @NotNull java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(inputHyperlinkType, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.copydefault = str;
        this.EZpvd = i;
        this.AEQbTJ = str2;
        this.OLrzqt = inputHyperlinkType;
        this.KWHzl = str3;
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(@NotNull android.graphics.Paint paint, java.lang.CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        Intrinsics.checkNotNullParameter(paint, "");
        return (int) paint.measureText(this.copydefault);
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(@NotNull android.graphics.Canvas canvas, java.lang.CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, @NotNull android.graphics.Paint paint) {
        Intrinsics.checkNotNullParameter(canvas, "");
        Intrinsics.checkNotNullParameter(paint, "");
        int color = paint.getColor();
        paint.setColor(this.EZpvd);
        canvas.drawText(this.copydefault, f, i4, paint);
        paint.setColor(color);
    }
}
