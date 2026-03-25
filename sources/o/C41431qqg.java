package o;

import android.content.res.Resources;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.view.ViewCompat;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.okinc.market.ext.UpDownColor;
import com.okinc.market.ext.ViewExtKt$safeRepeatOnLifecycleResumed$1$1;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Job;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qqg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C41431qqg {

    /* JADX INFO: renamed from: o.qqg$ActionBar */
    public final /* synthetic */ class ActionBar {
        public static final /* synthetic */ int[] EZpvd;

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
            try {
                iArr[UpDownColor.NEUTRAL.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            EZpvd = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final int AEQbTJ(@NotNull android.view.View view, @androidx.annotation.ColorInt int i, @androidx.annotation.ColorInt int i2) {
        Intrinsics.checkNotNullParameter(view, "");
        return i2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final int copydefault(@NotNull android.view.View view, @androidx.annotation.ColorInt int i, @androidx.annotation.ColorInt int i2) {
        Intrinsics.checkNotNullParameter(view, "");
        return i;
    }

    public static final void AEQbTJ(@NotNull android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        android.view.ViewGroup viewGroup = null;
        android.view.ViewGroup viewGroup2 = view instanceof android.view.ViewGroup ? (android.view.ViewGroup) view : null;
        if (viewGroup2 == null) {
            android.view.ViewParent parent = view.getParent();
            if (parent instanceof android.view.ViewGroup) {
                viewGroup = (android.view.ViewGroup) parent;
            }
        } else {
            viewGroup = viewGroup2;
        }
        if (viewGroup != null) {
            androidx.transition.TransitionManager.beginDelayedTransition(viewGroup);
        }
    }

    public static /* synthetic */ int getColor$default(android.view.View view, int i, Resources.Theme theme, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            theme = null;
        }
        return KWHzl(view, i, theme);
    }

    public static final int KWHzl(@NotNull android.view.View view, @androidx.annotation.ColorRes int i, Resources.Theme theme) {
        Intrinsics.checkNotNullParameter(view, "");
        return ResourcesCompat.getColor(view.getResources(), i, theme);
    }

    public static final java.lang.String copydefault(@NotNull android.view.View view, @androidx.annotation.StringRes int i) {
        Intrinsics.checkNotNullParameter(view, "");
        java.lang.String string = view.getContext().getString(i);
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public static final float OLrzqt(@NotNull android.view.View view, @androidx.annotation.DimenRes int i) {
        Intrinsics.checkNotNullParameter(view, "");
        return view.getResources().getDimension(i);
    }

    public static final android.graphics.Point copydefault(@NotNull android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return new android.graphics.Point(iArr[0] + (view.getWidth() / 2), iArr[1] + (view.getHeight() / 2));
    }

    public static /* synthetic */ int getRaiseColor$default(android.view.View view, int i, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            int i4 = C52761wXj.ActionBar.iPSTqm;
            android.content.Context context = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            i = C55366xib.KWHzl(i4, context);
        }
        if ((i3 & 2) != 0) {
            int i5 = C52761wXj.ActionBar.dvImUD;
            android.content.Context context2 = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            i2 = C55366xib.KWHzl(i5, context2);
        }
        return copydefault(view, i, i2);
    }

    public static /* synthetic */ int getDownColor$default(android.view.View view, int i, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            int i4 = C52761wXj.ActionBar.iPSTqm;
            android.content.Context context = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            i = C55366xib.KWHzl(i4, context);
        }
        if ((i3 & 2) != 0) {
            int i5 = C52761wXj.ActionBar.dvImUD;
            android.content.Context context2 = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            i2 = C55366xib.KWHzl(i5, context2);
        }
        return AEQbTJ(view, i, i2);
    }

    public static /* synthetic */ int getColor$default(android.view.View view, UpDownColor upDownColor, int i, int i2, int i3, boolean z, int i4, java.lang.Object obj) {
        if ((i4 & 2) != 0) {
            int i5 = C52761wXj.ActionBar.iPSTqm;
            android.content.Context context = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            i = C55366xib.KWHzl(i5, context);
        }
        int i6 = i;
        if ((i4 & 4) != 0) {
            int i7 = C52761wXj.ActionBar.dvImUD;
            android.content.Context context2 = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            i2 = C55366xib.KWHzl(i7, context2);
        }
        int i8 = i2;
        if ((i4 & 8) != 0) {
            int i9 = C52761wXj.ActionBar.getPostValueLengthLimit;
            android.content.Context context3 = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "");
            i3 = C55366xib.KWHzl(i9, context3);
        }
        int i10 = i3;
        if ((i4 & 16) != 0) {
            z = false;
        }
        return KWHzl(view, upDownColor, i6, i8, i10, z);
    }

    public static final int KWHzl(@NotNull android.view.View view, @NotNull UpDownColor upDownColor, @androidx.annotation.ColorInt int i, @androidx.annotation.ColorInt int i2, @androidx.annotation.ColorInt int i3, boolean z) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(upDownColor, "");
        if (z) {
            int i4 = ActionBar.EZpvd[upDownColor.ordinal()];
            if (i4 == 1) {
                int i5 = C52761wXj.ActionBar.iPSTqm;
                android.content.Context context = view.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                return C55366xib.KWHzl(i5, new C55365xia(context, 32));
            }
            if (i4 == 2) {
                int i6 = C52761wXj.ActionBar.dvImUD;
                android.content.Context context2 = view.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "");
                return C55366xib.KWHzl(i6, new C55365xia(context2, 32));
            }
            if (i4 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            int i7 = C52761wXj.ActionBar.getPostValueLengthLimit;
            android.content.Context context3 = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "");
            return C55366xib.KWHzl(i7, new C55365xia(context3, 32));
        }
        int i8 = ActionBar.EZpvd[upDownColor.ordinal()];
        if (i8 == 1) {
            return i;
        }
        if (i8 == 2) {
            return i2;
        }
        if (i8 == 3) {
            return i3;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: o.qqg$TaskDescription */
    public static final class TaskDescription implements View.OnAttachStateChangeListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ Ref.ObjectRef KWHzl;
        public final /* synthetic */ Function1 OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(@NotNull android.view.View view) {
            Intrinsics.checkNotNullParameter(view, "");
        }

        public TaskDescription(android.view.View view, android.view.View view2, Ref.ObjectRef objectRef, Function1 function1) {
            this.EZpvd = view;
            this.AEQbTJ = view2;
            this.KWHzl = objectRef;
            this.OLrzqt = function1;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r1v3, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r1v4, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(@NotNull android.view.View view) {
            LifecycleCoroutineScope lifecycleScope;
            Intrinsics.checkNotNullParameter(view, "");
            this.EZpvd.removeOnAttachStateChangeListener(this);
            LifecycleOwner lifecycleOwner = ViewTreeLifecycleOwner.get(this.AEQbTJ);
            Ref.ObjectRef objectRef = this.KWHzl;
            T tLaunch$default = 0;
            tLaunch$default = 0;
            if (lifecycleOwner != null && (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(lifecycleOwner)) != null) {
                tLaunch$default = BuildersKt__Builders_commonKt.launch$default(lifecycleScope, null, null, new ViewExtKt$safeRepeatOnLifecycleResumed$1$1(lifecycleOwner, this.OLrzqt, null), 3, null);
            }
            objectRef.element = tLaunch$default;
        }
    }

    public static /* synthetic */ int getChartColor$default(android.view.View view, UpDownColor upDownColor, int i, int i2, int i3, boolean z, int i4, java.lang.Object obj) {
        if ((i4 & 2) != 0) {
            int i5 = C52761wXj.ActionBar.swzYdv;
            android.content.Context context = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            i = C55366xib.KWHzl(i5, context);
        }
        int i6 = i;
        if ((i4 & 4) != 0) {
            int i7 = C52761wXj.ActionBar.fLIjIY;
            android.content.Context context2 = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            i2 = C55366xib.KWHzl(i7, context2);
        }
        int i8 = i2;
        if ((i4 & 8) != 0) {
            int i9 = C52761wXj.ActionBar.QHmsKR;
            android.content.Context context3 = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "");
            i3 = C55366xib.KWHzl(i9, context3);
        }
        int i10 = i3;
        if ((i4 & 16) != 0) {
            z = false;
        }
        return AEQbTJ(view, upDownColor, i6, i8, i10, z);
    }

    public static final int AEQbTJ(@NotNull android.view.View view, @NotNull UpDownColor upDownColor, @androidx.annotation.ColorInt int i, @androidx.annotation.ColorInt int i2, @androidx.annotation.ColorInt int i3, boolean z) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(upDownColor, "");
        if (z) {
            int i4 = ActionBar.EZpvd[upDownColor.ordinal()];
            if (i4 == 1) {
                int i5 = C52761wXj.ActionBar.OBJEWx;
                android.content.Context context = view.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                return C55366xib.KWHzl(i5, new C55365xia(context, 32));
            }
            if (i4 == 2) {
                int i6 = C52761wXj.ActionBar.zuWLRA;
                android.content.Context context2 = view.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "");
                return C55366xib.KWHzl(i6, new C55365xia(context2, 32));
            }
            if (i4 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            int i7 = C52761wXj.ActionBar.QHmsKR;
            android.content.Context context3 = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "");
            return C55366xib.KWHzl(i7, new C55365xia(context3, 32));
        }
        int i8 = ActionBar.EZpvd[upDownColor.ordinal()];
        if (i8 == 1) {
            return i;
        }
        if (i8 == 2) {
            return i2;
        }
        if (i8 == 3) {
            return i3;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: o.qqg$Activity */
    public static final class Activity implements View.OnAttachStateChangeListener {
        public final /* synthetic */ Ref.ObjectRef KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(@NotNull android.view.View view) {
            Intrinsics.checkNotNullParameter(view, "");
        }

        public Activity(android.view.View view, Ref.ObjectRef objectRef) {
            this.OLrzqt = view;
            this.KWHzl = objectRef;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(@NotNull android.view.View view) {
            Intrinsics.checkNotNullParameter(view, "");
            this.OLrzqt.removeOnAttachStateChangeListener(this);
            Job job = (Job) this.KWHzl.element;
            if (job != null) {
                Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (java.lang.Object) null);
            }
        }
    }

    public static /* synthetic */ int getModernHighlightBgColor$default(android.view.View view, UpDownColor upDownColor, int i, int i2, int i3, int i4, java.lang.Object obj) {
        if ((i4 & 2) != 0) {
            i = C33070mpX.copydefault(C52761wXj.Activity.DcqEDu);
        }
        if ((i4 & 4) != 0) {
            i2 = C33070mpX.copydefault(C52761wXj.Activity.fHqPtx);
        }
        if ((i4 & 8) != 0) {
            i3 = C33070mpX.copydefault(C52761wXj.Activity.invokespecialDPHOMC);
        }
        return KWHzl(view, upDownColor, i, i2, i3);
    }

    public static final int KWHzl(@NotNull android.view.View view, @NotNull UpDownColor upDownColor, @androidx.annotation.ColorInt int i, @androidx.annotation.ColorInt int i2, @androidx.annotation.ColorInt int i3) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(upDownColor, "");
        if (C33512mxp.AEQbTJ.isConnected() == 1) {
            int i4 = ActionBar.EZpvd[upDownColor.ordinal()];
            if (i4 == 1) {
                return i2;
            }
            if (i4 == 2) {
                return i;
            }
            if (i4 == 3) {
                return i3;
            }
            throw new NoWhenBranchMatchedException();
        }
        int i5 = ActionBar.EZpvd[upDownColor.ordinal()];
        if (i5 == 1) {
            return i;
        }
        if (i5 == 2) {
            return i2;
        }
        if (i5 == 3) {
            return i3;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static /* synthetic */ int getModernTextColor$default(android.view.View view, UpDownColor upDownColor, int i, int i2, int i3, int i4, java.lang.Object obj) {
        if ((i4 & 2) != 0) {
            i = C33070mpX.copydefault(C52761wXj.Activity.DKtBnz);
        }
        if ((i4 & 4) != 0) {
            i2 = C33070mpX.copydefault(C52761wXj.Activity.DPHNDa);
        }
        if ((i4 & 8) != 0) {
            int i5 = C52761wXj.ActionBar.getPostValueLengthLimit;
            android.content.Context context = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            i3 = C55366xib.KWHzl(i5, context);
        }
        return copydefault(view, upDownColor, i, i2, i3);
    }

    public static final int copydefault(@NotNull android.view.View view, @NotNull UpDownColor upDownColor, @androidx.annotation.ColorInt int i, @androidx.annotation.ColorInt int i2, @androidx.annotation.ColorInt int i3) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(upDownColor, "");
        if (C33512mxp.AEQbTJ.isConnected() == 1) {
            int i4 = ActionBar.EZpvd[upDownColor.ordinal()];
            if (i4 == 1) {
                return i2;
            }
            if (i4 == 2) {
                return i;
            }
            if (i4 == 3) {
                return i3;
            }
            throw new NoWhenBranchMatchedException();
        }
        int i5 = ActionBar.EZpvd[upDownColor.ordinal()];
        if (i5 == 1) {
            return i;
        }
        if (i5 == 2) {
            return i2;
        }
        if (i5 == 3) {
            return i3;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static /* synthetic */ int getModernColor$default(android.view.View view, UpDownColor upDownColor, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return copydefault(view, upDownColor, z);
    }

    public static final int copydefault(@NotNull android.view.View view, @NotNull UpDownColor upDownColor, boolean z) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(upDownColor, "");
        if (z) {
            int i = ActionBar.EZpvd[upDownColor.ordinal()];
            if (i == 1) {
                return C33512mxp.AEQbTJ.isConnected() == 0 ? C33070mpX.copydefault(C52761wXj.Activity.dPnHjp) : C33070mpX.copydefault(C52761wXj.Activity.aVhqwO);
            }
            if (i != 2) {
                return C33070mpX.copydefault(C52761wXj.Activity.ixgjPv);
            }
            return C33512mxp.AEQbTJ.isConnected() == 0 ? C33070mpX.copydefault(C52761wXj.Activity.aVhqwO) : C33070mpX.copydefault(C52761wXj.Activity.dPnHjp);
        }
        int i2 = ActionBar.EZpvd[upDownColor.ordinal()];
        if (i2 == 1) {
            return C33512mxp.AEQbTJ.isConnected() == 0 ? C33070mpX.copydefault(C52761wXj.Activity.DLGVGj) : C33070mpX.copydefault(C52761wXj.Activity.zzQwtT);
        }
        if (i2 != 2) {
            return C33070mpX.copydefault(C52761wXj.Activity.zblBkD);
        }
        return C33512mxp.AEQbTJ.isConnected() == 0 ? C33070mpX.copydefault(C52761wXj.Activity.zzQwtT) : C33070mpX.copydefault(C52761wXj.Activity.DLGVGj);
    }

    public static final void KWHzl(Function0 function0, android.view.View view) {
        function0.invoke();
    }

    public static final void EZpvd(@NotNull final android.view.View view, @NotNull final android.content.Context context) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(context, "");
        if (!view.isFocused()) {
            view.requestFocus();
        }
        view.post(new java.lang.Runnable() { // from class: o.qqf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C41431qqg.EZpvd(context, view);
            }
        });
    }

    public static final void EZpvd(android.content.Context context, android.view.View view) {
        java.lang.Object systemService = context.getSystemService("input_method");
        Intrinsics.copydefault(systemService, "");
        ((android.view.inputmethod.InputMethodManager) systemService).showSoftInput(view, 1);
    }

    public static final void AEQbTJ(@NotNull final android.view.View view, @NotNull final android.content.Context context) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(context, "");
        if (view.isFocused()) {
            view.clearFocus();
        }
        view.post(new java.lang.Runnable() { // from class: o.qqc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C41431qqg.copydefault(context, view);
            }
        });
    }

    public static final void copydefault(android.content.Context context, android.view.View view) {
        java.lang.Object systemService = context.getSystemService("input_method");
        Intrinsics.copydefault(systemService, "");
        ((android.view.inputmethod.InputMethodManager) systemService).hideSoftInputFromWindow(view.getWindowToken(), 0);
    }

    public static final android.graphics.Point EZpvd(@NotNull android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return new android.graphics.Point(iArr[0], iArr[1]);
    }

    public static /* synthetic */ void setCornerRadius$default(android.view.View view, float f, float f2, float f3, float f4, int i, float f5, int i2, java.lang.Object obj) {
        if ((i2 & 32) != 0) {
            f5 = 1.0f;
        }
        copydefault(view, f, f2, f3, f4, i, f5);
    }

    public static final void copydefault(@NotNull android.view.View view, float f, float f2, float f3, float f4, int i, float f5) {
        ShapeAppearanceModel shapeAppearanceModelBuild;
        Intrinsics.checkNotNullParameter(view, "");
        if (C55296xhK.AEQbTJ(view)) {
            shapeAppearanceModelBuild = ShapeAppearanceModel.builder().setTopLeftCorner(f3 < 0.1f ? 1 : 0, C55298xhM.dp2pxFloat$default(f3, null, 1, null)).setBottomLeftCorner(f4 < 0.1f ? 1 : 0, C55298xhM.dp2pxFloat$default(f4, null, 1, null)).setTopRightCorner(f < 0.1f ? 1 : 0, C55298xhM.dp2pxFloat$default(f, null, 1, null)).setBottomRightCorner(f2 < 0.1f ? 1 : 0, C55298xhM.dp2pxFloat$default(f2, null, 1, null)).build();
        } else {
            shapeAppearanceModelBuild = ShapeAppearanceModel.builder().setTopLeftCorner(f < 0.1f ? 1 : 0, C55298xhM.dp2pxFloat$default(f, null, 1, null)).setBottomLeftCorner(f2 < 0.1f ? 1 : 0, C55298xhM.dp2pxFloat$default(f2, null, 1, null)).setTopRightCorner(f3 < 0.1f ? 1 : 0, C55298xhM.dp2pxFloat$default(f3, null, 1, null)).setBottomRightCorner(f4 < 0.1f ? 1 : 0, C55298xhM.dp2pxFloat$default(f4, null, 1, null)).build();
        }
        Intrinsics.copydefault(shapeAppearanceModelBuild);
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(shapeAppearanceModelBuild);
        view.setBackgroundTintList(android.content.res.ColorStateList.valueOf(i));
        materialShapeDrawable.setAlpha((int) (f5 * 255.0f));
        view.setBackground(materialShapeDrawable);
    }

    public static final android.view.View copydefault(@NotNull android.view.ViewGroup viewGroup, @NotNull Function1<? super android.view.View, java.lang.Boolean> function1) {
        android.view.View viewCopydefault;
        Intrinsics.checkNotNullParameter(viewGroup, "");
        Intrinsics.checkNotNullParameter(function1, "");
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            android.view.View childAt = viewGroup.getChildAt(i);
            Intrinsics.copydefault(childAt);
            if (function1.invoke(childAt).booleanValue()) {
                return childAt;
            }
            if ((childAt instanceof android.view.ViewGroup) && (viewCopydefault = copydefault((android.view.ViewGroup) childAt, function1)) != null) {
                return viewCopydefault;
            }
        }
        return null;
    }

    public static final android.app.Activity KWHzl(@NotNull android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        return C33569myt.OLrzqt(view.getContext());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r10v4, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r10v5, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r10v7, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void EZpvd(@NotNull android.view.View view, @NotNull Function1<? super Continuation<? super Unit>, ? extends java.lang.Object> function1) {
        LifecycleCoroutineScope lifecycleScope;
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        if (ViewCompat.isAttachedToWindow(view)) {
            LifecycleOwner lifecycleOwner = ViewTreeLifecycleOwner.get(view);
            objectRef.element = (lifecycleOwner == null || (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(lifecycleOwner)) == null) ? 0 : BuildersKt__Builders_commonKt.launch$default(lifecycleScope, null, null, new ViewExtKt$safeRepeatOnLifecycleResumed$1$1(lifecycleOwner, function1, null), 3, null);
        } else {
            view.addOnAttachStateChangeListener(new TaskDescription(view, view, objectRef, function1));
        }
        if (!ViewCompat.isAttachedToWindow(view)) {
            Job job = (Job) objectRef.element;
            if (job != null) {
                Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (java.lang.Object) null);
                return;
            }
            return;
        }
        view.addOnAttachStateChangeListener(new Activity(view, objectRef));
    }

    public static final boolean OLrzqt(@NotNull android.view.View view) {
        AppCompatDelegate delegate;
        Intrinsics.checkNotNullParameter(view, "");
        android.app.Activity activityKWHzl = KWHzl(view);
        java.lang.Integer numValueOf = null;
        AppCompatActivity appCompatActivity = activityKWHzl instanceof AppCompatActivity ? (AppCompatActivity) activityKWHzl : null;
        if (appCompatActivity != null && (delegate = appCompatActivity.getDelegate()) != null) {
            numValueOf = java.lang.Integer.valueOf(delegate.getLocalNightMode());
        }
        if (numValueOf != null && numValueOf.intValue() == 2) {
            return true;
        }
        if (numValueOf != null && numValueOf.intValue() == 1) {
            return false;
        }
        return C33492mxV.OLrzqt();
    }

    public static final <T extends android.view.View> void AEQbTJ(@NotNull T t, boolean z, @NotNull Function1<? super T, Unit> function1) {
        Intrinsics.checkNotNullParameter(t, "");
        Intrinsics.checkNotNullParameter(function1, "");
        t.setVisibility(z ? 0 : 8);
        if (z) {
            function1.invoke(t);
        }
    }

    public static final void EZpvd(@NotNull android.view.View[] viewArr, @NotNull final Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(viewArr, "");
        Intrinsics.checkNotNullParameter(function0, "");
        for (android.view.View view : viewArr) {
            view.setOnClickListener(new View.OnClickListener() { // from class: o.qqe
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view2) {
                    C41431qqg.KWHzl(function0, view2);
                }
            });
        }
    }
}
