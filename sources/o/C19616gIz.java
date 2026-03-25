package o;

import androidx.recyclerview.widget.LinearSmoothScroller;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gIz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C19616gIz extends LinearSmoothScroller {
    public final float EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // androidx.recyclerview.widget.LinearSmoothScroller
    public float calculateSpeedPerPixel(@NotNull android.util.DisplayMetrics displayMetrics) {
        Intrinsics.checkNotNullParameter(displayMetrics, "");
        return this.EZpvd;
    }

    @Override // androidx.recyclerview.widget.LinearSmoothScroller
    public int getVerticalSnapPreference() {
        return -1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19616gIz(@NotNull android.content.Context context, float f) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
        this.EZpvd = f;
    }
}
