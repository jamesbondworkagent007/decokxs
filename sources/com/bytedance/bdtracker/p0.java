package com.bytedance.bdtracker;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.core.view.InputDeviceCompat;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class p0 extends q0 {
    public final Paint b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public p0(Drawable drawable) {
        super(drawable);
        Paint paint = new Paint();
        this.b = paint;
        paint.setColor(InputDeviceCompat.SOURCE_ANY);
        paint.setStrokeWidth(8.0f);
        paint.setStyle(Paint.Style.STROKE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Drawable
    public void draw(@NotNull Canvas canvas) {
        Intrinsics.EZpvd((Object) canvas, "");
        Drawable drawable = this.f244a;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        canvas.drawRect(new Rect(0, 0, canvas.getWidth(), canvas.getHeight()), this.b);
    }
}
