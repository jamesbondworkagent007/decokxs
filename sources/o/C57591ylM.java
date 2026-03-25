package o;

import android.widget.LinearLayout;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ylM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C57591ylM extends android.view.View {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57591ylM(@NotNull android.content.Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57591ylM(@NotNull android.content.Context context, @NotNull android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(attributeSet, "");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57591ylM(@NotNull android.content.Context context, @NotNull android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(attributeSet, "");
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (isInEditMode()) {
            return;
        }
        setLayoutParams(new LinearLayout.LayoutParams(-1, C33570myu.OLrzqt()));
    }
}
