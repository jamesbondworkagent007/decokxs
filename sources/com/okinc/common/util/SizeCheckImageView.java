package com.okinc.common.util;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.os.MessageQueue;
import android.util.AttributeSet;
import android.widget.ImageView;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C32581mgL;
import o.C32582mgM;
import o.C5332Nq;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public class SizeCheckImageView extends ImageView implements MessageQueue.IdleHandler {
    public static final int $stable = 0;
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int LOCAL_IMAGE_SIZE_FILTER = 100;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SizeCheckImageView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SizeCheckImageView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:20) call: com.okinc.common.util.SizeCheckImageView.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ SizeCheckImageView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SizeCheckImageView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        if (drawable == null) {
            return;
        }
        monitor();
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        if (bitmap == null) {
            return;
        }
        monitor();
    }

    private final void monitor() {
        if (C32582mgM.EZpvd.copydefault() && getTag(C5332Nq.StateListAnimator.OLrzqt) == null) {
            Looper.myQueue().removeIdleHandler(this);
            Looper.myQueue().addIdleHandler(this);
        }
    }

    @Override // android.os.MessageQueue.IdleHandler
    public boolean queueIdle() {
        checkImageSize();
        return false;
    }

    private final void checkImageSize() {
        Drawable drawable = getDrawable();
        if (drawable != null && (drawable instanceof BitmapDrawable)) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            int width = bitmapDrawable.getBitmap().getWidth();
            int height = bitmapDrawable.getBitmap().getHeight();
            if (height >= 100 || width >= 100) {
                C32581mgL.Companion.EZpvd(width, height, getMeasuredWidth(), getMeasuredHeight(), this);
            }
        }
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.common.util.SizeCheckImageView.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }
}
