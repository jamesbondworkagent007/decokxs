package o;

import android.animation.ValueAnimator;
import android.text.TextUtils;
import android.view.View;
import androidx.core.widget.TextViewCompat;
import com.okinc.market.ext.UpDownColor;
import com.robinhood.ticker.TickerView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qqb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C41426qqb {

    /* JADX INFO: renamed from: o.qqb$Application */
    public final /* synthetic */ class Application {
        public static final /* synthetic */ int[] copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[UpDownColor.values().length];
            try {
                iArr[UpDownColor.UP.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[UpDownColor.DOWN.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            copydefault = iArr;
        }
    }

    public static final void copydefault(@NotNull final android.widget.TextView textView, @NotNull final Function1<? super C40547qZx, Unit> function1) {
        Intrinsics.checkNotNullParameter(textView, "");
        Intrinsics.checkNotNullParameter(function1, "");
        final Ref.FloatRef floatRef = new Ref.FloatRef();
        final Ref.FloatRef floatRef2 = new Ref.FloatRef();
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        textView.setOnTouchListener(new View.OnTouchListener() { // from class: o.qpY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
                return C41426qqb.OLrzqt(floatRef, floatRef2, objectRef, textView, function1, view, motionEvent);
            }
        });
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: android.text.Spanned */
    /* JADX DEBUG: Multi-variable search result rejected for r4v1, resolved type: android.text.Spanned */
    /* JADX DEBUG: Multi-variable search result rejected for r9v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v7, types: [T, java.lang.Object, o.qZx] */
    public static final boolean OLrzqt(Ref.FloatRef floatRef, Ref.FloatRef floatRef2, Ref.ObjectRef objectRef, android.widget.TextView textView, Function1 function1, android.view.View view, android.view.MotionEvent motionEvent) {
        int scaledTouchSlop = android.view.ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int action = motionEvent.getAction();
        if (action == 0) {
            floatRef.element = motionEvent.getX();
            floatRef2.element = motionEvent.getY();
            objectRef.element = null;
            android.text.Layout layout = textView.getLayout();
            if (layout == null) {
                return false;
            }
            int lineForVertical = layout.getLineForVertical((int) motionEvent.getY());
            java.lang.CharSequence text = textView.getText();
            android.text.Spanned spanned = text instanceof android.text.Spanned ? (android.text.Spanned) text : null;
            C40547qZx[] c40547qZxArr = spanned != null ? (C40547qZx[]) spanned.getSpans(0, textView.getText().length(), C40547qZx.class) : null;
            if (c40547qZxArr != null && c40547qZxArr.length != 0) {
                java.util.Iterator itEZpvd = yHX.EZpvd(c40547qZxArr);
                while (itEZpvd.hasNext()) {
                    ?? r11 = (C40547qZx) itEZpvd.next();
                    java.lang.CharSequence text2 = textView.getText();
                    Intrinsics.copydefault(text2, "");
                    int spanStart = ((android.text.Spanned) text2).getSpanStart(r11);
                    java.lang.CharSequence text3 = textView.getText();
                    Intrinsics.copydefault(text3, "");
                    int spanEnd = ((android.text.Spanned) text3).getSpanEnd(r11);
                    float primaryHorizontal = layout.getPrimaryHorizontal(spanStart);
                    float primaryHorizontal2 = layout.getPrimaryHorizontal(spanEnd);
                    int lineForOffset = layout.getLineForOffset(spanStart);
                    boolean z = motionEvent.getX() >= primaryHorizontal && motionEvent.getX() <= primaryHorizontal2;
                    boolean z2 = lineForVertical == lineForOffset;
                    if (z && z2) {
                        objectRef.element = r11;
                        return true;
                    }
                }
            }
        } else if (action == 1) {
            C40547qZx c40547qZx = (C40547qZx) objectRef.element;
            if (c40547qZx != null) {
                float fAbs = java.lang.Math.abs(motionEvent.getX() - floatRef.element);
                float fAbs2 = java.lang.Math.abs(motionEvent.getY() - floatRef2.element);
                float f = scaledTouchSlop;
                if (fAbs <= f && fAbs2 <= f) {
                    function1.invoke(c40547qZx);
                }
                objectRef.element = null;
                return true;
            }
        } else if (action != 2) {
            if (action == 3) {
                objectRef.element = null;
            }
        } else if (objectRef.element != 0) {
            float fAbs3 = java.lang.Math.abs(motionEvent.getX() - floatRef.element);
            float fAbs4 = java.lang.Math.abs(motionEvent.getY() - floatRef2.element);
            float f2 = scaledTouchSlop;
            if (fAbs3 <= f2 && fAbs4 <= f2) {
                return true;
            }
            objectRef.element = null;
            return false;
        }
        return false;
    }

    /* JADX INFO: renamed from: o.qqb$Activity */
    public static final class Activity extends android.text.style.ClickableSpan {
        public final /* synthetic */ Function0<Unit> EZpvd;
        public final /* synthetic */ int OLrzqt;

        public Activity(int i, Function0<Unit> function0) {
            this.OLrzqt = i;
            this.EZpvd = function0;
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(android.text.TextPaint textPaint) {
            Intrinsics.checkNotNullParameter(textPaint, "");
            super.updateDrawState(textPaint);
            textPaint.setUnderlineText(false);
            textPaint.setColor(this.OLrzqt);
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(android.view.View view) {
            Intrinsics.checkNotNullParameter(view, "");
            Function0<Unit> function0 = this.EZpvd;
            if (function0 != null) {
                function0.invoke();
            }
        }
    }

    public static /* synthetic */ void setClickSpan$default(android.widget.TextView textView, java.lang.String str, java.lang.String str2, int i, Function0 function0, int i2, java.lang.Object obj) {
        if ((i2 & 8) != 0) {
            function0 = null;
        }
        OLrzqt(textView, str, str2, i, (Function0<Unit>) function0);
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.myy.setupSpanStyles$default(java.lang.CharSequence, java.lang.String[], int, com.okinc.core.util.format.MatchPattern, boolean, kotlin.jvm.functions.Function1, int, java.lang.Object):java.lang.CharSequence */
    public static final void OLrzqt(@NotNull android.widget.TextView textView, @NotNull java.lang.String str, @NotNull java.lang.String str2, @androidx.annotation.ColorInt int i, Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(textView, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        final Activity activity = new Activity(i, function0);
        textView.setText(C33574myy.setupSpanStyles$default(str, new java.lang.String[]{str2}, 0, null, false, new Function1() { // from class: o.qpZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C41426qqb.EZpvd(activity, (java.util.List) obj);
            }
        }, 14, null));
        textView.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
    }

    public static final Unit EZpvd(Activity activity, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        list.add(activity);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void setText$default(android.widget.TextView textView, UpDownColor upDownColor, java.lang.CharSequence charSequence, int i, int i2, int i3, boolean z, int i4, java.lang.Object obj) {
        int iKWHzl;
        int iKWHzl2;
        int iKWHzl3;
        if ((i4 & 4) != 0) {
            int i5 = C52761wXj.ActionBar.iPSTqm;
            android.content.Context context = textView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            iKWHzl = C55366xib.KWHzl(i5, context);
        } else {
            iKWHzl = i;
        }
        if ((i4 & 8) != 0) {
            int i6 = C52761wXj.ActionBar.dvImUD;
            android.content.Context context2 = textView.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            iKWHzl2 = C55366xib.KWHzl(i6, context2);
        } else {
            iKWHzl2 = i2;
        }
        if ((i4 & 16) != 0) {
            int i7 = C52761wXj.ActionBar.getPostValueLengthLimit;
            android.content.Context context3 = textView.getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "");
            iKWHzl3 = C55366xib.KWHzl(i7, context3);
        } else {
            iKWHzl3 = i3;
        }
        OLrzqt(textView, upDownColor, charSequence, iKWHzl, iKWHzl2, iKWHzl3, (i4 & 32) != 0 ? false : z);
    }

    public static final void OLrzqt(@NotNull android.widget.TextView textView, @NotNull UpDownColor upDownColor, @NotNull java.lang.CharSequence charSequence, @androidx.annotation.ColorInt int i, @androidx.annotation.ColorInt int i2, @androidx.annotation.ColorInt int i3, boolean z) {
        Intrinsics.checkNotNullParameter(textView, "");
        Intrinsics.checkNotNullParameter(upDownColor, "");
        Intrinsics.checkNotNullParameter(charSequence, "");
        if (z) {
            int i4 = C52761wXj.ActionBar.iPSTqm;
            android.content.Context context = textView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            int iKWHzl = C55366xib.KWHzl(i4, new C55365xia(context, 32));
            int i5 = C52761wXj.ActionBar.dvImUD;
            android.content.Context context2 = textView.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            int iKWHzl2 = C55366xib.KWHzl(i5, new C55365xia(context2, 32));
            int i6 = C52761wXj.ActionBar.getPostValueLengthLimit;
            android.content.Context context3 = textView.getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "");
            textView.setTextColor(C41431qqg.getColor$default(textView, upDownColor, iKWHzl, iKWHzl2, C55366xib.KWHzl(i6, new C55365xia(context3, 32)), false, 16, null));
            textView.setText(charSequence);
            return;
        }
        textView.setTextColor(C41431qqg.getColor$default(textView, upDownColor, i, i2, i3, false, 16, null));
        textView.setText(charSequence);
    }

    public static /* synthetic */ void setText$default(TickerView tickerView, UpDownColor upDownColor, java.lang.String str, int i, int i2, int i3, boolean z, int i4, java.lang.Object obj) {
        int iKWHzl;
        int iKWHzl2;
        int iKWHzl3;
        if ((i4 & 4) != 0) {
            int i5 = C52761wXj.ActionBar.iPSTqm;
            android.content.Context context = tickerView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            iKWHzl = C55366xib.KWHzl(i5, context);
        } else {
            iKWHzl = i;
        }
        if ((i4 & 8) != 0) {
            int i6 = C52761wXj.ActionBar.dvImUD;
            android.content.Context context2 = tickerView.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            iKWHzl2 = C55366xib.KWHzl(i6, context2);
        } else {
            iKWHzl2 = i2;
        }
        if ((i4 & 16) != 0) {
            int i7 = C52761wXj.ActionBar.getPostValueLengthLimit;
            android.content.Context context3 = tickerView.getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "");
            iKWHzl3 = C55366xib.KWHzl(i7, context3);
        } else {
            iKWHzl3 = i3;
        }
        EZpvd(tickerView, upDownColor, str, iKWHzl, iKWHzl2, iKWHzl3, (i4 & 32) != 0 ? false : z);
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.qqg.getColor$default(android.view.View, com.okinc.market.ext.UpDownColor, int, int, int, boolean, int, java.lang.Object):int */
    public static final void EZpvd(@NotNull TickerView tickerView, @NotNull UpDownColor upDownColor, @NotNull java.lang.String str, @androidx.annotation.ColorInt int i, @androidx.annotation.ColorInt int i2, @androidx.annotation.ColorInt int i3, boolean z) {
        Intrinsics.checkNotNullParameter(tickerView, "");
        Intrinsics.checkNotNullParameter(upDownColor, "");
        Intrinsics.checkNotNullParameter(str, "");
        if (z) {
            int i4 = C52761wXj.ActionBar.iPSTqm;
            android.content.Context context = tickerView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            int iKWHzl = C55366xib.KWHzl(i4, new C55365xia(context, 32));
            int i5 = C52761wXj.ActionBar.dvImUD;
            android.content.Context context2 = tickerView.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            int iKWHzl2 = C55366xib.KWHzl(i5, new C55365xia(context2, 32));
            int i6 = C52761wXj.ActionBar.getPostValueLengthLimit;
            android.content.Context context3 = tickerView.getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "");
            tickerView.setTextColor(C41431qqg.getColor$default(tickerView, upDownColor, iKWHzl, iKWHzl2, C55366xib.KWHzl(i6, new C55365xia(context3, 32)), false, 16, null));
            tickerView.setText(str);
            return;
        }
        tickerView.setTextColor(C41431qqg.getColor$default(tickerView, upDownColor, i, i2, i3, false, 16, null));
        tickerView.setText(str);
    }

    public static /* synthetic */ void setTextWithTransition$default(android.widget.TextView textView, java.lang.String str, long j, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            j = 200;
        }
        AEQbTJ(textView, str, j);
    }

    public static final void AEQbTJ(@NotNull final android.widget.TextView textView, @NotNull final java.lang.String str, long j) {
        Intrinsics.checkNotNullParameter(textView, "");
        Intrinsics.checkNotNullParameter(str, "");
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        android.animation.ObjectAnimator objectAnimatorOfFloat = android.animation.ObjectAnimator.ofFloat(textView, "alpha", 1.0f, 0.0f, 1.0f);
        objectAnimatorOfFloat.setDuration(j);
        objectAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o.qpX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
                C41426qqb.copydefault(booleanRef, textView, str, valueAnimator);
            }
        });
        objectAnimatorOfFloat.start();
    }

    public static final void copydefault(Ref.BooleanRef booleanRef, android.widget.TextView textView, java.lang.String str, android.animation.ValueAnimator valueAnimator) {
        Intrinsics.checkNotNullParameter(valueAnimator, "");
        if (booleanRef.element || valueAnimator.getAnimatedFraction() < 0.5f) {
            return;
        }
        booleanRef.element = true;
        textView.setText(str);
    }

    public static /* synthetic */ void setAutoSizeText$default(android.widget.TextView textView, java.lang.CharSequence charSequence, float f, int i, int i2, java.lang.Object obj) {
        if ((i2 & 4) != 0) {
            i = 1;
        }
        copydefault(textView, charSequence, f, i);
    }

    public static final void copydefault(@NotNull android.widget.TextView textView, @NotNull java.lang.CharSequence charSequence, float f, int i) {
        Intrinsics.checkNotNullParameter(textView, "");
        Intrinsics.checkNotNullParameter(charSequence, "");
        textView.setText(charSequence);
        textView.setMaxLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTextSize(2, f);
        TextViewCompat.setAutoSizeTextTypeWithDefaults(textView, 1);
        TextViewCompat.setAutoSizeTextTypeUniformWithConfiguration(textView, (int) (f / 2), (int) f, i, 2);
    }

    public static /* synthetic */ void updateDrawable$default(android.widget.TextView textView, int i, int i2, int i3, int i4, int i5, java.lang.Object obj) {
        if ((i5 & 1) != 0) {
            i = 0;
        }
        if ((i5 & 2) != 0) {
            i2 = 0;
        }
        if ((i5 & 4) != 0) {
            i3 = 0;
        }
        if ((i5 & 8) != 0) {
            i4 = 0;
        }
        OLrzqt(textView, i, i2, i3, i4);
    }

    public static final void OLrzqt(@NotNull android.widget.TextView textView, @androidx.annotation.DrawableRes int i, @androidx.annotation.DrawableRes int i2, @androidx.annotation.DrawableRes int i3, @androidx.annotation.DrawableRes int i4) {
        Intrinsics.checkNotNullParameter(textView, "");
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds(i, i2, i3, i4);
    }

    public static final void EZpvd(@NotNull android.widget.TextView textView, @NotNull java.lang.CharSequence charSequence, UpDownColor upDownColor) {
        int iCopydefault;
        Intrinsics.checkNotNullParameter(textView, "");
        Intrinsics.checkNotNullParameter(charSequence, "");
        int i = upDownColor == null ? -1 : Application.copydefault[upDownColor.ordinal()];
        if (i == 1) {
            android.content.Context context = textView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            iCopydefault = C33508mxl.copydefault(context);
        } else if (i == 2) {
            android.content.Context context2 = textView.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            iCopydefault = C33508mxl.AEQbTJ(context2);
        } else {
            iCopydefault = C33070mpX.copydefault(C52761wXj.Activity.QwvEab);
        }
        textView.setTextColor(iCopydefault);
        textView.setText(charSequence);
    }
}
