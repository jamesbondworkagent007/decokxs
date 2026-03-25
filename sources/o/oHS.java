package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public abstract class oHS extends android.text.style.ClickableSpan {
    public boolean AEQbTJ;
    public final int AhwBna;
    public final int EZpvd;
    public boolean copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(boolean z) {
        this.copydefault = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(boolean z) {
        this.AEQbTJ = z;
    }

    public oHS(int i, int i2) {
        this.EZpvd = i;
        this.AhwBna = i2;
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(@NotNull android.text.TextPaint textPaint) {
        Intrinsics.checkNotNullParameter(textPaint, "");
        super.updateDrawState(textPaint);
        int i = this.EZpvd;
        textPaint.setAntiAlias(true);
        textPaint.setColor(i);
        textPaint.setUnderlineText(false);
        textPaint.bgColor = 0;
    }
}
