package o;

import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.ContextCompat;
import com.okinc.uilab.util.SpanUtils;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xhi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C55320xhi extends AppCompatTextView {
    public static final Application Companion = new Application(null);
    public static final int EZpvd = 8;
    public int AEQbTJ;
    public final android.graphics.Paint AYXKKw;
    public boolean AhwBna;
    public int DbNXlk;
    public C55312xha KWHzl;
    public Function0<Unit> OLrzqt;
    public java.lang.CharSequence copydefault;
    public View.OnClickListener djBIcL;
    public boolean gEmmrt;
    public int isConnected;
    public boolean valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C55320xhi(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C55320xhi(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AEQbTJ() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function0<Unit> EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.CharSequence KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean OLrzqt() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final View.OnClickListener copydefault() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAttachClickListener(Function0<Unit> function0) {
        this.OLrzqt = function0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setHyperLabelLayout$OKUILib_uilib(C55312xha c55312xha) {
        this.KWHzl = c55312xha;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOnClickListener$OKUILib_uilib(View.OnClickListener onClickListener) {
        this.djBIcL = onClickListener;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:28) call: o.xhi.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C55320xhi(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C55320xhi(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.DbNXlk = 2;
        this.valueOf = true;
        this.isConnected = ContextCompat.getColor(context, C52761wXj.Activity.DCUTEIddSDPG);
        android.graphics.Paint paint = new android.graphics.Paint();
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(C55298xhM.EZpvd(0.5f, context));
        paint.setColor(this.isConnected);
        paint.setPathEffect(new DashPathEffect(new float[]{10.0f, 5.0f}, 0.0f));
        this.AYXKKw = paint;
        setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
        setHighlightColor(0);
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C52761wXj.PictureInPictureParams.IPostMessageServiceStub);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
        setUnderlineColor(typedArrayObtainStyledAttributes.getColor(C52761wXj.PictureInPictureParams.ITrustedWebActivityCallbackDefault, ContextCompat.getColor(context, C52761wXj.Activity.DCUTEIddSDPG)));
        setShowUnderline(typedArrayObtainStyledAttributes.getBoolean(C52761wXj.PictureInPictureParams.ITrustedWebActivityCallbackStubProxy, false));
        setLineStyle(typedArrayObtainStyledAttributes.getInteger(C52761wXj.PictureInPictureParams.areNotificationsEnabled, 0));
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void setVerticalAlignment(int i) {
        this.DbNXlk = i;
        requestLayout();
        invalidate();
    }

    public final void setShowAttachmentView(boolean z) {
        this.valueOf = z;
        setText(this.copydefault);
    }

    public final void setUnderlineColor(int i) {
        this.isConnected = i;
        this.AYXKKw.setColor(i);
        invalidate();
    }

    public final void setShowUnderline(boolean z) {
        this.gEmmrt = z;
        invalidate();
    }

    public final void setLineStyle(int i) {
        this.AEQbTJ = i;
        this.AYXKKw.setPathEffect(i == 1 ? null : new DashPathEffect(new float[]{10.0f, 5.0f}, 0.0f));
        invalidate();
    }

    @Override // android.widget.TextView, android.view.View
    public void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        setTextDirection(C55296xhK.AEQbTJ(this) ? 4 : 3);
    }

    @Override // android.widget.TextView
    public void setText(java.lang.CharSequence charSequence, TextView.BufferType bufferType) {
        java.lang.CharSequence charSequence2;
        C55312xha c55312xha;
        C55318xhg c55318xhgEZpvd;
        C55312xha c55312xha2;
        C55318xhg c55318xhgEZpvd2;
        C55318xhg c55318xhgEZpvd3;
        this.copydefault = charSequence;
        if (charSequence == null) {
            this.copydefault = "";
        }
        C55312xha c55312xha3 = this.KWHzl;
        if (c55312xha3 != null) {
            c55312xha3.removeView(c55312xha3 != null ? c55312xha3.EZpvd() : null);
        }
        C55312xha c55312xha4 = this.KWHzl;
        boolean z = false;
        android.graphics.Bitmap bitmapViewToBitmap$default = (c55312xha4 == null || (c55318xhgEZpvd3 = c55312xha4.EZpvd()) == null) ? null : C55296xhK.viewToBitmap$default(c55318xhgEZpvd3, 0, 0, 3, null);
        SpanUtils.Activity activity = bitmapViewToBitmap$default != null ? new SpanUtils.Activity(bitmapViewToBitmap$default, this.DbNXlk) : null;
        if (activity != null && (c55312xha2 = this.KWHzl) != null && (c55318xhgEZpvd2 = c55312xha2.EZpvd()) != null && c55318xhgEZpvd2.getVisibility() == 0 && this.valueOf) {
            z = true;
        }
        this.AhwBna = z;
        if (z) {
            charSequence2 = ((java.lang.Object) this.copydefault) + " ";
        } else {
            charSequence2 = this.copydefault;
        }
        android.text.SpannableString spannableString = new android.text.SpannableString(charSequence2);
        if (activity != null && (c55312xha = this.KWHzl) != null && (c55318xhgEZpvd = c55312xha.EZpvd()) != null && c55318xhgEZpvd.getVisibility() == 0 && this.valueOf) {
            ActionBar actionBar = new ActionBar(this);
            spannableString.setSpan(activity, spannableString.length() - 1, spannableString.length(), 17);
            spannableString.setSpan(actionBar, spannableString.length() - 1, spannableString.length(), 17);
        }
        super.setText(spannableString, bufferType);
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight() + yII.EZpvd(this.AYXKKw.getStrokeWidth() + 1.0f));
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(@NotNull android.graphics.Canvas canvas) {
        android.text.Layout layout;
        float lineLeft;
        int paddingStart;
        float lineRight;
        int paddingEnd;
        float paddingStart2;
        float primaryHorizontal;
        Intrinsics.checkNotNullParameter(canvas, "");
        super.onDraw(canvas);
        if (!this.gEmmrt || (layout = getLayout()) == null) {
            return;
        }
        int lineCount = layout.getLineCount();
        for (int i = 0; i < lineCount; i++) {
            int lineBottom = layout.getLineBottom(i);
            int paddingTop = getPaddingTop();
            if (C55296xhK.AEQbTJ(this)) {
                lineLeft = layout.getLineRight(i);
                paddingStart = getPaddingStart();
            } else {
                lineLeft = layout.getLineLeft(i);
                paddingStart = getPaddingStart();
            }
            float f = paddingStart;
            if (i == lineCount - 1) {
                if (this.AhwBna) {
                    primaryHorizontal = layout.getPrimaryHorizontal(getText().length() - 1);
                } else {
                    primaryHorizontal = layout.getPrimaryHorizontal(getText().length());
                }
                paddingStart2 = primaryHorizontal + getPaddingStart();
            } else {
                if (C55296xhK.AEQbTJ(this)) {
                    lineRight = layout.getLineLeft(i);
                    paddingEnd = getPaddingEnd();
                } else {
                    lineRight = layout.getLineRight(i);
                    paddingEnd = getPaddingEnd();
                }
                paddingStart2 = lineRight - paddingEnd;
            }
            float f2 = lineBottom + paddingTop;
            canvas.drawLine(lineLeft + f, f2 + this.AYXKKw.getStrokeWidth(), paddingStart2, f2 + this.AYXKKw.getStrokeWidth(), this.AYXKKw);
        }
    }

    public final void gEmmrt() {
        setShowUnderline(true);
        requestLayout();
        invalidate();
    }

    public final void AYXKKw() {
        setShowUnderline(false);
        requestLayout();
        invalidate();
    }

    /* JADX INFO: renamed from: o.xhi$ActionBar */
    /* JADX INFO: loaded from: classes17.dex */
    public static final class ActionBar extends android.text.style.ClickableSpan {
        public final WeakReference<C55320xhi> EZpvd;

        public ActionBar(@NotNull C55320xhi c55320xhi) {
            Intrinsics.checkNotNullParameter(c55320xhi, "");
            this.EZpvd = new WeakReference<>(c55320xhi);
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(@NotNull android.view.View view) {
            Intrinsics.checkNotNullParameter(view, "");
            C55320xhi c55320xhi = this.EZpvd.get();
            if (c55320xhi != null) {
                View.OnClickListener onClickListenerCopydefault = c55320xhi.copydefault();
                if (onClickListenerCopydefault != null) {
                    onClickListenerCopydefault.onClick(c55320xhi);
                }
                Function0<Unit> function0EZpvd = c55320xhi.EZpvd();
                if (function0EZpvd != null) {
                    function0EZpvd.invoke();
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.xhi$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.xhi.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }
}
