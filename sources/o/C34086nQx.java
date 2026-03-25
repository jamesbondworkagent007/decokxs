package o;

import android.text.TextUtils;
import android.view.View;
import androidx.core.content.ContextCompat;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C35399nuc;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nQx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C34086nQx {
    public static final C34086nQx AEQbTJ = new C34086nQx();

    private C34086nQx() {
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: o.nQx */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setupAnnouncementText$default(C34086nQx c34086nQx, android.widget.TextView textView, int i, java.lang.Integer num, boolean z, Function1 function1, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = C52761wXj.Activity.Dmq;
        }
        int i3 = i;
        java.lang.Integer num2 = (i2 & 2) != 0 ? null : num;
        if ((i2 & 4) != 0) {
            z = true;
        }
        c34086nQx.AEQbTJ(textView, i3, num2, z, (i2 & 8) != 0 ? null : function1);
    }

    public final void AEQbTJ(@NotNull final android.widget.TextView textView, int i, java.lang.Integer num, boolean z, Function1<? super java.lang.String, Unit> function1) {
        Intrinsics.checkNotNullParameter(textView, "");
        TextUtils.TruncateAt ellipsize = textView.getEllipsize();
        android.text.method.TransformationMethod transformationMethod = textView.getTransformationMethod();
        android.text.method.MovementMethod movementMethod = textView.getMovementMethod();
        textView.setTextColor(ContextCompat.getColor(textView.getContext(), i));
        textView.setLinkTextColor(ContextCompat.getColor(textView.getContext(), i));
        final android.text.SpannableString spannableString = new android.text.SpannableString(textView.getText());
        android.text.util.Linkify.addLinks(spannableString, 1);
        java.util.Iterator itEZpvd = yHX.EZpvd((android.text.style.URLSpan[]) spannableString.getSpans(0, spannableString.length(), android.text.style.URLSpan.class));
        while (itEZpvd.hasNext()) {
            android.text.style.URLSpan uRLSpan = (android.text.style.URLSpan) itEZpvd.next();
            int spanStart = spannableString.getSpanStart(uRLSpan);
            int spanEnd = spannableString.getSpanEnd(uRLSpan);
            java.lang.String url = uRLSpan.getURL();
            spannableString.removeSpan(uRLSpan);
            spannableString.setSpan(new StateListAnimator(function1, url, textView), spanStart, spanEnd, 33);
        }
        textView.setText(spannableString);
        textView.setEllipsize(ellipsize);
        textView.setMaxLines(num != null ? num.intValue() : textView.getMaxLines());
        textView.setTransformationMethod(transformationMethod);
        java.lang.Object[] spans = spannableString.getSpans(0, spannableString.length(), android.text.style.ClickableSpan.class);
        Intrinsics.checkNotNullExpressionValue(spans, "");
        boolean z2 = !(spans.length == 0);
        if (z) {
            if (z2) {
                movementMethod = android.text.method.LinkMovementMethod.getInstance();
            }
            textView.setMovementMethod(movementMethod);
            textView.setOnClickListener(new View.OnClickListener() { // from class: o.nQB
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C34086nQx.copydefault(spannableString, view);
                }
            });
        } else {
            textView.setMovementMethod(movementMethod);
            textView.setHorizontallyScrolling(false);
            textView.setVerticalScrollBarEnabled(false);
            textView.setHorizontalScrollBarEnabled(false);
            if (z2) {
                textView.setClickable(true);
                textView.setFocusable(false);
                textView.setOnTouchListener(new View.OnTouchListener() { // from class: o.nQC
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.View.OnTouchListener
                    public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
                        return C34086nQx.AEQbTJ(spannableString, view, motionEvent);
                    }
                });
            }
        }
        textView.setHighlightColor(ContextCompat.getColor(textView.getContext(), C35399nuc.Application.KWHzl));
        textView.post(new java.lang.Runnable() { // from class: o.nQD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C34086nQx.AEQbTJ(textView);
            }
        });
    }

    /* JADX INFO: renamed from: o.nQx$StateListAnimator */
    public static final class StateListAnimator extends android.text.style.ClickableSpan {
        public final /* synthetic */ android.widget.TextView AEQbTJ;
        public final /* synthetic */ Function1<java.lang.String, Unit> EZpvd;
        public final /* synthetic */ java.lang.String OLrzqt;

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> */
        /* JADX WARN: Multi-variable type inference failed */
        public StateListAnimator(Function1<? super java.lang.String, Unit> function1, java.lang.String str, android.widget.TextView textView) {
            this.EZpvd = function1;
            this.OLrzqt = str;
            this.AEQbTJ = textView;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(android.view.View view) {
            Intrinsics.checkNotNullParameter(view, "");
            Function1<java.lang.String, Unit> function1 = this.EZpvd;
            if (function1 != null) {
                java.lang.String str = this.OLrzqt;
                Intrinsics.copydefault((java.lang.Object) str);
                function1.invoke(str);
            }
            C34086nQx c34086nQx = C34086nQx.AEQbTJ;
            android.content.Context context = this.AEQbTJ.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            java.lang.String str2 = this.OLrzqt;
            Intrinsics.copydefault((java.lang.Object) str2);
            c34086nQx.copydefault(context, str2);
        }
    }

    public static final void copydefault(android.text.SpannableString spannableString, android.view.View view) {
        android.text.style.ClickableSpan[] clickableSpanArr = (android.text.style.ClickableSpan[]) spannableString.getSpans(0, spannableString.length(), android.text.style.ClickableSpan.class);
        Intrinsics.copydefault(clickableSpanArr);
        if (clickableSpanArr.length == 0) {
            java.lang.Object parent = view.getParent();
            android.view.View view2 = parent instanceof android.view.View ? (android.view.View) parent : null;
            if (view2 != null) {
                view2.performClick();
            }
        }
    }

    public static final boolean AEQbTJ(android.text.SpannableString spannableString, android.view.View view, android.view.MotionEvent motionEvent) {
        int lineForVertical;
        if (motionEvent.getAction() == 1) {
            Intrinsics.copydefault(view, "");
            android.widget.TextView textView = (android.widget.TextView) view;
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            int totalPaddingLeft = textView.getTotalPaddingLeft();
            int totalPaddingTop = textView.getTotalPaddingTop();
            int scrollX = textView.getScrollX();
            int scrollY = textView.getScrollY();
            android.text.Layout layout = textView.getLayout();
            if (layout != null && (lineForVertical = layout.getLineForVertical((y - totalPaddingTop) + scrollY)) >= 0 && lineForVertical < layout.getLineCount()) {
                int offsetForHorizontal = layout.getOffsetForHorizontal(lineForVertical, (x - totalPaddingLeft) + scrollX);
                android.text.style.ClickableSpan[] clickableSpanArr = (android.text.style.ClickableSpan[]) spannableString.getSpans(C56548yJl.copydefault(offsetForHorizontal - 1, 0), C56548yJl.valueOf(offsetForHorizontal + 1, spannableString.length()), android.text.style.ClickableSpan.class);
                Intrinsics.copydefault(clickableSpanArr);
                if (!(clickableSpanArr.length == 0)) {
                    textView.performClick();
                    clickableSpanArr[0].onClick(textView);
                    return true;
                }
            }
        }
        return false;
    }

    public static final void AEQbTJ(android.widget.TextView textView) {
        textView.requestLayout();
    }

    public final void copydefault(final android.content.Context context, final java.lang.String str) {
        oGV ogv = oGV.EZpvd;
        if (ogv.KWHzl(str)) {
            oGV.processDeeplink$default(ogv, context, str, null, null, new Function1() { // from class: o.nQA
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C34086nQx.KWHzl((AbstractC43238rlX) obj);
                }
            }, 12, null);
        } else {
            OLrzqt(context, new Function0() { // from class: o.nQE
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C34086nQx.OLrzqt(context, str);
                }
            });
        }
    }

    public static final Unit KWHzl(AbstractC43238rlX abstractC43238rlX) {
        Intrinsics.checkNotNullParameter(abstractC43238rlX, "");
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(android.content.Context context, java.lang.String str) {
        oGV.processDeeplink$default(oGV.EZpvd, context, str, null, null, new Function1() { // from class: o.nQI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C34086nQx.copydefault((AbstractC43238rlX) obj);
            }
        }, 12, null);
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(AbstractC43238rlX abstractC43238rlX) {
        Intrinsics.checkNotNullParameter(abstractC43238rlX, "");
        return Unit.INSTANCE;
    }

    public final void OLrzqt(android.content.Context context, final Function0<Unit> function0) {
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
        viewOnClickListenerC54939xaY.setTitle(C35399nuc.LoaderManager.aBDePw);
        viewOnClickListenerC54939xaY.copydefault(C35399nuc.LoaderManager.UCQKYV);
        viewOnClickListenerC54939xaY.EZpvd(C35399nuc.LoaderManager.fIwbmz, new View.OnClickListener() { // from class: o.nQH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C34086nQx.KWHzl(function0, viewOnClickListenerC54939xaY, view);
            }
        });
        ViewOnClickListenerC54939xaY.setSecondaryButton$default(viewOnClickListenerC54939xaY, C35399nuc.LoaderManager.iwGUEr, (View.OnClickListener) null, 2, (java.lang.Object) null);
        viewOnClickListenerC54939xaY.setCancelable(true);
        viewOnClickListenerC54939xaY.setCanceledOnTouchOutside(true);
        viewOnClickListenerC54939xaY.show();
    }

    public static final void KWHzl(Function0 function0, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        function0.invoke();
        viewOnClickListenerC54939xaY.dismiss();
    }
}
