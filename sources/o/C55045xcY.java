package o;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xcY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C55045xcY extends RecyclerView.ItemDecoration {
    public android.graphics.drawable.Drawable AEQbTJ;
    public boolean EZpvd;
    public int KWHzl;
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int copydefault = 8;
    public static final int[] OLrzqt = {android.R.attr.listDivider};

    public C55045xcY(@NotNull android.content.Context context, int i) {
        Intrinsics.checkNotNullParameter(context, "");
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(OLrzqt);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
        this.AEQbTJ = typedArrayObtainStyledAttributes.getDrawable(0);
        typedArrayObtainStyledAttributes.recycle();
        AEQbTJ(i);
    }

    private final void AEQbTJ(int i) {
        if (i != 0 && i != 1) {
            throw new java.lang.IllegalArgumentException("invalid orientation".toString());
        }
        this.KWHzl = i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void onDraw(@NotNull android.graphics.Canvas canvas, @NotNull RecyclerView recyclerView, @NotNull RecyclerView.State state) {
        Intrinsics.checkNotNullParameter(canvas, "");
        Intrinsics.checkNotNullParameter(recyclerView, "");
        Intrinsics.checkNotNullParameter(state, "");
        if (this.EZpvd) {
            if (this.KWHzl == 1) {
                KWHzl(canvas, recyclerView);
            } else {
                OLrzqt(canvas, recyclerView);
            }
        }
    }

    private final void KWHzl(android.graphics.Canvas canvas, RecyclerView recyclerView) {
        int paddingLeft = recyclerView.getPaddingLeft();
        int width = recyclerView.getWidth();
        int paddingRight = recyclerView.getPaddingRight();
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            android.view.View childAt = recyclerView.getChildAt(i);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            Intrinsics.copydefault(layoutParams, "");
            int bottom = childAt.getBottom() + ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) layoutParams)).bottomMargin;
            android.graphics.drawable.Drawable drawable = this.AEQbTJ;
            Intrinsics.copydefault(drawable);
            int intrinsicHeight = drawable.getIntrinsicHeight();
            android.graphics.drawable.Drawable drawable2 = this.AEQbTJ;
            if (drawable2 != null) {
                drawable2.setBounds(paddingLeft, bottom, width - paddingRight, intrinsicHeight + bottom);
                Intrinsics.copydefault(canvas);
                drawable2.draw(canvas);
            }
        }
    }

    private final void OLrzqt(android.graphics.Canvas canvas, RecyclerView recyclerView) {
        int paddingTop = recyclerView.getPaddingTop();
        int height = recyclerView.getHeight();
        int paddingBottom = recyclerView.getPaddingBottom();
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            android.view.View childAt = recyclerView.getChildAt(i);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            Intrinsics.copydefault(layoutParams, "");
            int right = childAt.getRight() + ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) layoutParams)).rightMargin;
            android.graphics.drawable.Drawable drawable = this.AEQbTJ;
            Intrinsics.copydefault(drawable);
            int intrinsicHeight = drawable.getIntrinsicHeight();
            android.graphics.drawable.Drawable drawable2 = this.AEQbTJ;
            if (drawable2 != null) {
                drawable2.setBounds(right, paddingTop, intrinsicHeight + right, height - paddingBottom);
                Intrinsics.copydefault(canvas);
                drawable2.draw(canvas);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(@NotNull android.graphics.Rect rect, @NotNull android.view.View view, @NotNull RecyclerView recyclerView, @NotNull RecyclerView.State state) {
        Intrinsics.checkNotNullParameter(rect, "");
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(recyclerView, "");
        Intrinsics.checkNotNullParameter(state, "");
        if (this.KWHzl == 1) {
            android.graphics.drawable.Drawable drawable = this.AEQbTJ;
            rect.set(0, 0, 0, drawable != null ? drawable.getIntrinsicHeight() : 0);
        } else {
            android.graphics.drawable.Drawable drawable2 = this.AEQbTJ;
            rect.set(0, 0, drawable2 != null ? drawable2.getIntrinsicWidth() : 0, 0);
        }
    }

    /* JADX INFO: renamed from: o.xcY$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.xcY.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }
}
