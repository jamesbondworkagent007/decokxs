package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tto, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C47635tto extends android.text.style.CharacterStyle {
    public final int copydefault;

    public C47635tto(int i) {
        this.copydefault = i;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(@NotNull android.text.TextPaint textPaint) {
        Intrinsics.checkNotNullParameter(textPaint, "");
        textPaint.setColor(this.copydefault);
    }
}
