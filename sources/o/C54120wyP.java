package o;

import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.view.View;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewCompat;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wyP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C54120wyP extends android.widget.FrameLayout {
    public final C50996veg KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C54120wyP(@NotNull android.content.Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
 A[MD:(android.content.Context, android.util.AttributeSet):void (m)] (LINE:27) call: o.wyP.<init>(android.content.Context, android.util.AttributeSet):void type: THIS */
    public /* synthetic */ C54120wyP(android.content.Context context, android.util.AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C54120wyP(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        C50996veg c50996vegEZpvd = C50996veg.EZpvd(android.view.LayoutInflater.from(getContext()), this, true);
        Intrinsics.checkNotNullExpressionValue(c50996vegEZpvd, "");
        this.KWHzl = c50996vegEZpvd;
    }

    /* JADX INFO: renamed from: o.wyP$Activity */
    public static final class Activity implements View.OnLayoutChangeListener {
        public final /* synthetic */ android.view.View KWHzl;

        public Activity(android.view.View view) {
            this.KWHzl = view;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(@NotNull android.view.View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            Intrinsics.checkNotNullParameter(view, "");
            view.removeOnLayoutChangeListener(this);
            C54120wyP.OLrzqt(this.KWHzl, view);
        }
    }

    @Override // android.view.View
    public int getBaseline() {
        android.widget.TextView textView = this.KWHzl.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        int baseline = textView.getBaseline();
        return baseline >= 0 ? textView.getTop() + baseline : super.getBaseline();
    }

    public final void setLevel(java.lang.String str) {
        java.lang.String strAYXKKw = C33129mqd.AYXKKw(str);
        setVisibility(C33129mqd.AhwBna(strAYXKKw, 0) ? 0 : 8);
        OLrzqt(this);
        android.widget.TextView textView = this.KWHzl.OLrzqt;
        Intrinsics.copydefault(textView);
        wPQ.KWHzl(textView, C48033uCm.StateListAnimator.fetchVPNInfo, C48033uCm.StateListAnimator.DbNXlk);
        textView.setText(C33069mpW.copydefault(C48033uCm.Fragment.HJWChPiaHEvk, C56423yEv.EZpvd(C56390yDp.OLrzqt("lvl", strAYXKKw))));
    }

    public static final void OLrzqt(android.view.View view, android.view.View view2) {
        float fCopydefault = C56548yJl.copydefault(view2.getHeight(), 1);
        float f = fCopydefault / 2.0f;
        ActionBar actionBar = new ActionBar(ContextCompat.getColor(view.getContext(), C48033uCm.StateListAnimator.fetchVPNInfo), ContextCompat.getColor(view.getContext(), C48033uCm.StateListAnimator.DbNXlk), yII.EZpvd(C56548yJl.valueOf(C56548yJl.copydefault(fCopydefault * 0.05f, 1.0f), f - 1.0f)), f);
        view2.setBackgroundColor(0);
        int paddingLeft = view2.getPaddingLeft();
        int paddingTop = view2.getPaddingTop();
        int paddingRight = view2.getPaddingRight();
        int paddingBottom = view2.getPaddingBottom();
        view2.setBackground(actionBar);
        view2.setPadding(paddingLeft, paddingTop, paddingRight, paddingBottom);
    }

    /* JADX INFO: renamed from: o.wyP$ActionBar */
    public static final class ActionBar extends android.graphics.drawable.Drawable {
        public final /* synthetic */ int AEQbTJ;
        public final RectF AYXKKw;
        public final android.graphics.Paint EZpvd;
        public final /* synthetic */ int KWHzl;
        public final /* synthetic */ int OLrzqt;
        public final /* synthetic */ float copydefault;

        @Override // android.graphics.drawable.Drawable
        public int getOpacity() {
            return -3;
        }

        public ActionBar(int i, int i2, int i3, float f) {
            this.KWHzl = i;
            this.AEQbTJ = i2;
            this.OLrzqt = i3;
            this.copydefault = f;
            android.graphics.Paint paint = new android.graphics.Paint(1);
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeCap(Paint.Cap.ROUND);
            paint.setStrokeJoin(Paint.Join.ROUND);
            paint.setDither(true);
            this.EZpvd = paint;
            this.AYXKKw = new RectF();
        }

        @Override // android.graphics.drawable.Drawable
        public void onBoundsChange(android.graphics.Rect rect) {
            Intrinsics.checkNotNullParameter(rect, "");
            super.onBoundsChange(rect);
            this.EZpvd.setShader(new LinearGradient(rect.left, rect.centerY(), rect.right, rect.centerY(), this.KWHzl, this.AEQbTJ, Shader.TileMode.CLAMP));
        }

        @Override // android.graphics.drawable.Drawable
        public void draw(android.graphics.Canvas canvas) {
            Intrinsics.checkNotNullParameter(canvas, "");
            this.EZpvd.setStrokeWidth(this.OLrzqt);
            this.AYXKKw.set(getBounds());
            float f = this.OLrzqt / 2.0f;
            this.AYXKKw.inset(f, f);
            RectF rectF = this.AYXKKw;
            float f2 = this.copydefault;
            canvas.drawRoundRect(rectF, f2, f2, this.EZpvd);
        }

        @Override // android.graphics.drawable.Drawable
        public void setAlpha(int i) {
            this.EZpvd.setAlpha(i);
        }

        @Override // android.graphics.drawable.Drawable
        public void setColorFilter(ColorFilter colorFilter) {
            this.EZpvd.setColorFilter(colorFilter);
        }
    }

    public static final void copydefault(android.view.View view, android.view.View view2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (view2.getHeight() > 0) {
            Intrinsics.copydefault(view2);
            OLrzqt(view, view2);
        }
    }

    public final void OLrzqt(final android.view.View view) {
        if (ViewCompat.isLaidOut(view) && !view.isLayoutRequested()) {
            OLrzqt(view, view);
        } else {
            view.addOnLayoutChangeListener(new Activity(view));
        }
        view.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: o.wyN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(android.view.View view2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                C54120wyP.copydefault(view, view2, i, i2, i3, i4, i5, i6, i7, i8);
            }
        });
    }
}
