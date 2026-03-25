package o;

import android.view.View;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.databinding.BindingAdapter;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C30329lUi;
import o.C31351lsQ;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lUi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C30329lUi {
    public static final C30329lUi AEQbTJ = new C30329lUi();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final WindowInsetsCompat OLrzqt(android.view.View view, WindowInsetsCompat windowInsetsCompat) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(windowInsetsCompat, "");
        return windowInsetsCompat;
    }

    private C30329lUi() {
    }

    public final android.content.res.ColorStateList copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (KWHzl(str)) {
            return android.content.res.ColorStateList.valueOf(C33070mpX.copydefault(C52761wXj.Activity.fZBcTu));
        }
        if (OLrzqt(str)) {
            return android.content.res.ColorStateList.valueOf(C33070mpX.copydefault(C52761wXj.Activity.invokespecialDPHOMC));
        }
        return null;
    }

    public final int EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return KWHzl(str) ? C52761wXj.Activity.DQzvGNdrmXxudrmXxu : OLrzqt(str) ? C52761wXj.Activity.Dmq : C52761wXj.Activity.DCUTEIddSDPG;
    }

    public final boolean KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "tier1");
    }

    public final boolean OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "tier2");
    }

    /* JADX INFO: renamed from: o.lUi$Application */
    public static final class Application implements View.OnLayoutChangeListener {
        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(@NotNull android.view.View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            Intrinsics.checkNotNullParameter(view, "");
            view.removeOnLayoutChangeListener(this);
            ViewCompat.requestApplyInsets(view);
        }
    }

    public final android.text.SpannableStringBuilder AEQbTJ(@NotNull android.content.Context context, @NotNull java.lang.String str, @NotNull java.lang.String str2, int i, @NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(function0, "");
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(str);
        try {
            Result.Application application = Result.Companion;
            int iIndexOf$default = StringsKt__StringsKt.indexOf$default((java.lang.CharSequence) str, str2, 0, false, 6, (java.lang.Object) null);
            int length = str2.length() + iIndexOf$default;
            spannableStringBuilder.setSpan(new StateListAnimator(function0), iIndexOf$default, length, 33);
            spannableStringBuilder.setSpan(new android.text.style.ForegroundColorSpan(i), iIndexOf$default, length, 33);
            spannableStringBuilder.setSpan(new android.text.style.TextAppearanceSpan(context, C52761wXj.LoaderManager.giSNqX), iIndexOf$default, length, 33);
            spannableStringBuilder.setSpan(new android.text.style.UnderlineSpan(), iIndexOf$default, length, 33);
            Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        return spannableStringBuilder;
    }

    /* JADX INFO: renamed from: o.lUi$StateListAnimator */
    public static final class StateListAnimator extends android.text.style.ClickableSpan {
        public final /* synthetic */ Function0<Unit> KWHzl;

        public StateListAnimator(Function0<Unit> function0) {
            this.KWHzl = function0;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(final android.view.View view) {
            Intrinsics.checkNotNullParameter(view, "");
            this.KWHzl.invoke();
            if (view instanceof android.widget.TextView) {
                view.post(new java.lang.Runnable() { // from class: o.lUm
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // java.lang.Runnable
                    public final void run() {
                        C30329lUi.StateListAnimator.AEQbTJ(view);
                    }
                });
            }
        }

        public static final void AEQbTJ(android.view.View view) {
            java.lang.CharSequence text = ((android.widget.TextView) view).getText();
            if (text instanceof android.text.Spanned) {
                android.text.Selection.removeSelection((android.text.Spannable) text);
            }
            view.clearFocus();
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(android.text.TextPaint textPaint) {
            Intrinsics.checkNotNullParameter(textPaint, "");
            textPaint.setUnderlineText(false);
        }
    }

    /* JADX INFO: renamed from: o.lUi$ActionBar */
    public static final class ActionBar implements View.OnAttachStateChangeListener {
        public final /* synthetic */ android.view.View OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(@NotNull android.view.View view) {
            Intrinsics.checkNotNullParameter(view, "");
        }

        public ActionBar(android.view.View view) {
            this.OLrzqt = view;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(@NotNull android.view.View view) {
            Intrinsics.checkNotNullParameter(view, "");
            this.OLrzqt.removeOnAttachStateChangeListener(this);
            ViewCompat.requestApplyInsets(view);
        }
    }

    /* JADX INFO: renamed from: o.lUi$TaskDescription */
    public static final class TaskDescription implements View.OnAttachStateChangeListener {
        public final /* synthetic */ android.view.View KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(@NotNull android.view.View view) {
            Intrinsics.checkNotNullParameter(view, "");
        }

        public TaskDescription(android.view.View view) {
            this.KWHzl = view;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(@NotNull android.view.View view) {
            Intrinsics.checkNotNullParameter(view, "");
            this.KWHzl.removeOnAttachStateChangeListener(this);
            ViewCompat.requestApplyInsets(view);
        }
    }

    @BindingAdapter({"statusBarPaddingTopIfAtWindowTop"})
    public static final void EZpvd(@NotNull android.view.View view, boolean z) {
        final int iIntValue;
        Intrinsics.checkNotNullParameter(view, "");
        java.lang.Object tag = view.getTag(C31351lsQ.Application.QOLQEE);
        java.lang.Integer num = tag instanceof java.lang.Integer ? (java.lang.Integer) tag : null;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            view.setTag(C31351lsQ.Application.QOLQEE, 0);
            iIntValue = 0;
        }
        if (!z) {
            ViewCompat.setOnApplyWindowInsetsListener(view, new androidx.core.view.OnApplyWindowInsetsListener() { // from class: o.lUj
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // androidx.core.view.OnApplyWindowInsetsListener
                public final WindowInsetsCompat onApplyWindowInsets(android.view.View view2, WindowInsetsCompat windowInsetsCompat) {
                    return C30329lUi.OLrzqt(view2, windowInsetsCompat);
                }
            });
            view.setPadding(view.getPaddingLeft(), iIntValue, view.getPaddingRight(), view.getPaddingBottom());
            if (ViewCompat.isAttachedToWindow(view)) {
                ViewCompat.requestApplyInsets(view);
                return;
            } else {
                view.addOnAttachStateChangeListener(new ActionBar(view));
                return;
            }
        }
        view.setPadding(view.getPaddingLeft(), iIntValue, view.getPaddingRight(), view.getPaddingBottom());
        ViewCompat.setOnApplyWindowInsetsListener(view, new androidx.core.view.OnApplyWindowInsetsListener() { // from class: o.lUn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public final WindowInsetsCompat onApplyWindowInsets(android.view.View view2, WindowInsetsCompat windowInsetsCompat) {
                return C30329lUi.OLrzqt(iIntValue, view2, windowInsetsCompat);
            }
        });
        if (ViewCompat.isAttachedToWindow(view)) {
            ViewCompat.requestApplyInsets(view);
        } else {
            view.addOnAttachStateChangeListener(new TaskDescription(view));
        }
    }

    public static final WindowInsetsCompat OLrzqt(int i, android.view.View view, WindowInsetsCompat windowInsetsCompat) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(windowInsetsCompat, "");
        if (view.isLaidOut()) {
            int[] iArr = new int[2];
            view.getLocationInWindow(iArr);
            boolean z = iArr[1] <= 0;
            int i2 = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.statusBars()).top;
            if (z) {
                i += i2;
            }
            view.setPadding(view.getPaddingLeft(), i, view.getPaddingRight(), view.getPaddingBottom());
            return windowInsetsCompat;
        }
        if (ViewCompat.isLaidOut(view) && !view.isLayoutRequested()) {
            ViewCompat.requestApplyInsets(view);
        } else {
            view.addOnLayoutChangeListener(new Application());
        }
        return windowInsetsCompat;
    }
}
