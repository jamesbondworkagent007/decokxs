package o;

import android.view.ViewGroup;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fEg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C17409fEg extends android.view.View {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17409fEg(@NotNull android.content.Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17409fEg(@NotNull android.content.Context context, @NotNull android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(attributeSet, "");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17409fEg(@NotNull android.content.Context context, @NotNull android.util.AttributeSet attributeSet, int i) {
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
        if (getLayoutParams() == null) {
            setLayoutParams(new ViewGroup.LayoutParams(-1, C33570myu.gEmmrt(getContext())));
            return;
        }
        getLayoutParams().height = C33570myu.gEmmrt(getContext());
        getLayoutParams().width = -1;
        setLayoutParams(getLayoutParams());
    }
}
