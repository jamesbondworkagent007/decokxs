package o;

import android.graphics.DashPathEffect;
import android.graphics.Paint;
import kotlin.jvm.internal.Intrinsics;
import o.C47315tni;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.stI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C45607stI extends android.view.View {
    public int AEQbTJ;
    public int AhwBna;
    public int EZpvd;
    public android.graphics.Paint KWHzl;
    public int OLrzqt;
    public int copydefault;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C45607stI(@NotNull android.content.Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
        this.KWHzl = new android.graphics.Paint();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C45607stI(@NotNull android.content.Context context, @NotNull android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(attributeSet, "");
        this.KWHzl = new android.graphics.Paint();
        AEQbTJ(context, attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C45607stI(@NotNull android.content.Context context, @NotNull android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(attributeSet, "");
        this.KWHzl = new android.graphics.Paint();
        AEQbTJ(context, attributeSet);
    }

    public final void AEQbTJ(@NotNull android.content.Context context, @NotNull android.util.AttributeSet attributeSet) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(attributeSet, "");
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C47315tni.FragmentManager.KWHzl, 0, 0);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
        try {
            this.EZpvd = typedArrayObtainStyledAttributes.getDimensionPixelSize(C47315tni.FragmentManager.OLrzqt, 0);
            this.AEQbTJ = typedArrayObtainStyledAttributes.getDimensionPixelSize(C47315tni.FragmentManager.AEQbTJ, 0);
            this.OLrzqt = typedArrayObtainStyledAttributes.getDimensionPixelSize(C47315tni.FragmentManager.EZpvd, 0);
            this.copydefault = typedArrayObtainStyledAttributes.getColor(C47315tni.FragmentManager.copydefault, 0);
            this.AhwBna = typedArrayObtainStyledAttributes.getInt(C47315tni.FragmentManager.gEmmrt, 0);
            typedArrayObtainStyledAttributes.recycle();
            this.KWHzl.setAntiAlias(true);
            this.KWHzl.setColor(this.copydefault);
            this.KWHzl.setStyle(Paint.Style.STROKE);
            this.KWHzl.setStrokeWidth(this.OLrzqt);
            this.KWHzl.setPathEffect(new DashPathEffect(new float[]{this.EZpvd, this.AEQbTJ}, 0.0f));
        } catch (java.lang.Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    @Override // android.view.View
    public void onDraw(@NotNull android.graphics.Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "");
        super.onDraw(canvas);
        if (this.AhwBna == 0) {
            float height = getHeight() * 0.5f;
            canvas.drawLine(0.0f, height, getWidth(), height, this.KWHzl);
        } else {
            float width = getWidth() * 0.5f;
            canvas.drawLine(width, 0.0f, width, getHeight(), this.KWHzl);
        }
    }
}
