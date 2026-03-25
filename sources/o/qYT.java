package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class qYT {
    public static final float copydefault(@NotNull android.graphics.Paint paint, @NotNull java.lang.Number number) {
        Intrinsics.checkNotNullParameter(paint, "");
        Intrinsics.checkNotNullParameter(number, "");
        return (number.floatValue() - ((paint.getFontMetrics().bottom - paint.getFontMetrics().top) / 2)) - paint.getFontMetrics().top;
    }
}
