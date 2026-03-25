package o;

import android.view.ViewTreeObserver;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;
import com.bumptech.glide.Glide;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mpH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C33054mpH {
    public static /* synthetic */ android.view.View inflate$default(android.view.ViewGroup viewGroup, int i, boolean z, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        return AEQbTJ(viewGroup, i, z);
    }

    public static final android.view.View AEQbTJ(@NotNull android.view.ViewGroup viewGroup, @androidx.annotation.LayoutRes int i, boolean z) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        android.view.View viewInflate = android.view.LayoutInflater.from(viewGroup.getContext()).inflate(i, viewGroup, z);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "");
        return viewInflate;
    }

    public static final <T extends android.view.View> T copydefault(@NotNull android.view.View view, int i) {
        Intrinsics.checkNotNullParameter(view, "");
        return (T) view.findViewById(i);
    }

    public static /* synthetic */ void justReplace$default(FragmentActivity fragmentActivity, int i, androidx.fragment.app.Fragment fragment, int i2, int i3, int i4, java.lang.Object obj) {
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = 0;
        }
        AEQbTJ(fragmentActivity, i, fragment, i2, i3);
    }

    public static final void AEQbTJ(@NotNull FragmentActivity fragmentActivity, int i, @NotNull androidx.fragment.app.Fragment fragment, int i2, int i3) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "");
        Intrinsics.checkNotNullParameter(fragment, "");
        fragmentActivity.getSupportFragmentManager().beginTransaction().setTransition(androidx.fragment.app.FragmentTransaction.TRANSIT_FRAGMENT_FADE).replace(i, fragment, fragment.getClass().getName()).commitAllowingStateLoss();
    }

    public static final void copydefault(@NotNull androidx.fragment.app.Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "");
        FragmentActivity activity = fragment.getActivity();
        android.view.View currentFocus = activity != null ? activity.getCurrentFocus() : null;
        if (currentFocus != null) {
            FragmentActivity activity2 = fragment.getActivity();
            java.lang.Object systemService = activity2 != null ? activity2.getSystemService("input_method") : null;
            Intrinsics.copydefault(systemService, "");
            ((android.view.inputmethod.InputMethodManager) systemService).hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
        }
    }

    public static /* synthetic */ void internalShowKeyboard$default(android.view.View view, java.lang.Long l, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            l = null;
        }
        KWHzl(view, l);
    }

    public static final void KWHzl(final android.view.View view, java.lang.Long l) {
        java.lang.Runnable runnable = new java.lang.Runnable() { // from class: o.mpI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C33054mpH.OLrzqt(view);
            }
        };
        if (l == null) {
            view.post(runnable);
        } else {
            view.postDelayed(runnable, l.longValue());
        }
    }

    public static final void OLrzqt(android.view.View view) {
        android.content.Context context = view.getContext();
        java.lang.Object systemService = context != null ? context.getSystemService("input_method") : null;
        android.view.inputmethod.InputMethodManager inputMethodManager = systemService instanceof android.view.inputmethod.InputMethodManager ? (android.view.inputmethod.InputMethodManager) systemService : null;
        if (inputMethodManager != null) {
            inputMethodManager.showSoftInput(view, 1);
        }
    }

    public static /* synthetic */ void internalPerformShowKeyboard$default(android.app.Activity activity, java.lang.Long l, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            l = null;
        }
        copydefault(activity, l);
    }

    public static final void copydefault(android.app.Activity activity, java.lang.Long l) {
        android.view.View currentFocus;
        if (activity == null || (currentFocus = activity.getCurrentFocus()) == null) {
            return;
        }
        if (activity.hasWindowFocus()) {
            KWHzl(currentFocus, l);
            return;
        }
        Application application = new Application(currentFocus, l);
        android.view.ViewTreeObserver viewTreeObserver = currentFocus.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.addOnWindowFocusChangeListener(application);
        }
    }

    /* JADX INFO: renamed from: o.mpH$Application */
    public static final class Application implements ViewTreeObserver.OnWindowFocusChangeListener {
        public final /* synthetic */ java.lang.Long EZpvd;
        public final /* synthetic */ android.view.View OLrzqt;

        public Application(android.view.View view, java.lang.Long l) {
            this.OLrzqt = view;
            this.EZpvd = l;
        }

        @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
        public void onWindowFocusChanged(boolean z) {
            if (z) {
                C33054mpH.KWHzl(this.OLrzqt, this.EZpvd);
                android.view.ViewTreeObserver viewTreeObserver = this.OLrzqt.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeOnWindowFocusChangeListener(this);
                }
            }
        }
    }

    public static /* synthetic */ void showKeyBoardDelay$default(androidx.fragment.app.Fragment fragment, long j, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            j = 400;
        }
        copydefault(fragment, j);
    }

    public static final void copydefault(@NotNull androidx.fragment.app.Fragment fragment, long j) {
        Intrinsics.checkNotNullParameter(fragment, "");
        copydefault(fragment.getActivity(), java.lang.Long.valueOf(j));
    }

    public static final void EZpvd(@NotNull androidx.fragment.app.Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "");
        copydefault(fragment.getActivity(), (java.lang.Long) null);
    }

    public static final void EZpvd(@NotNull android.app.Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        copydefault(activity, (java.lang.Long) null);
    }

    public static /* synthetic */ void loadUrl$default(android.widget.ImageView imageView, java.lang.String str, java.lang.String str2, int i, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 2) != 0) {
            str2 = null;
        }
        if ((i3 & 4) != 0) {
            i = -1;
        }
        if ((i3 & 8) != 0) {
            i2 = -1;
        }
        EZpvd(imageView, str, str2, i, i2);
    }

    public static final void EZpvd(@NotNull android.widget.ImageView imageView, java.lang.String str, java.lang.String str2, int i, int i2) {
        Intrinsics.checkNotNullParameter(imageView, "");
        OLrzqt(imageView, str, 0, str2, i, i2, null);
    }

    public static /* synthetic */ void loadUrl$default(android.widget.ImageView imageView, java.lang.String str, int i, java.lang.String str2, int i2, int i3, Function1 function1, int i4, java.lang.Object obj) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        int i5 = i;
        if ((i4 & 4) != 0) {
            str2 = null;
        }
        OLrzqt(imageView, str, i5, str2, (i4 & 8) != 0 ? -1 : i2, (i4 & 16) != 0 ? -1 : i3, function1);
    }

    public static final void OLrzqt(android.widget.ImageView imageView, java.lang.String str, int i, java.lang.String str2, int i2, int i3, Function1<? super android.graphics.drawable.Drawable, Unit> function1) {
        if (str == null || str.length() == 0 || !valueOf(imageView.getContext())) {
            if (function1 != null) {
                function1.invoke(null);
            }
        } else {
            ComponentCallbacks2C5333Nr componentCallbacks2C5333NrAEQbTJ = Glide.AEQbTJ(imageView.getContext());
            Intrinsics.checkNotNullExpressionValue(componentCallbacks2C5333NrAEQbTJ, "");
            C55297xhL.AEQbTJ(componentCallbacks2C5333NrAEQbTJ, str, str2, i2, i3).OLrzqt((RX<?>) new C5448Sc().djBIcL().copydefault(AbstractC5360Os.copydefault).copydefault(false).KWHzl(i)).OLrzqt(new ActionBar(function1, imageView));
        }
    }

    /* JADX INFO: renamed from: o.mpH$ActionBar */
    public static final class ActionBar extends AbstractC5454Si<android.graphics.drawable.Drawable> {
        public final /* synthetic */ Function1<android.graphics.drawable.Drawable, Unit> AEQbTJ;
        public final /* synthetic */ android.widget.ImageView KWHzl;

        @Override // o.AbstractC5453Sh, o.InterfaceC5462Sq
        public void a_(android.graphics.drawable.Drawable drawable) {
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function1<? super android.graphics.drawable.Drawable, kotlin.Unit> */
        /* JADX WARN: Multi-variable type inference failed */
        public ActionBar(Function1<? super android.graphics.drawable.Drawable, Unit> function1, android.widget.ImageView imageView) {
            this.AEQbTJ = function1;
            this.KWHzl = imageView;
        }

        @Override // o.InterfaceC5462Sq
        public /* bridge */ /* synthetic */ void copydefault(java.lang.Object obj, InterfaceC5460So interfaceC5460So) {
            copydefault((android.graphics.drawable.Drawable) obj, (InterfaceC5460So<? super android.graphics.drawable.Drawable>) interfaceC5460So);
        }

        public void copydefault(android.graphics.drawable.Drawable drawable, InterfaceC5460So<? super android.graphics.drawable.Drawable> interfaceC5460So) {
            Intrinsics.checkNotNullParameter(drawable, "");
            this.KWHzl.setImageDrawable(drawable);
            Function1<android.graphics.drawable.Drawable, Unit> function1 = this.AEQbTJ;
            if (function1 != null) {
                function1.invoke(drawable);
            }
        }

        @Override // o.AbstractC5453Sh, o.InterfaceC5462Sq
        public void AEQbTJ(android.graphics.drawable.Drawable drawable) {
            super.AEQbTJ(drawable);
            Function1<android.graphics.drawable.Drawable, Unit> function1 = this.AEQbTJ;
            if (function1 != null) {
                function1.invoke(drawable);
            }
        }
    }

    public static final void EZpvd(@NotNull android.widget.ImageView imageView, java.lang.String str, int i, java.lang.String str2, int i2, int i3, Function0<Unit> function0, Function1<? super android.graphics.drawable.Drawable, Unit> function1) {
        int i4;
        Intrinsics.checkNotNullParameter(imageView, "");
        Ref.IntRef intRef = new Ref.IntRef();
        intRef.element = i3;
        Ref.IntRef intRef2 = new Ref.IntRef();
        intRef2.element = i2;
        if (i2 == -1 || (i4 = intRef.element) == -1) {
            imageView.getViewTreeObserver().addOnPreDrawListener(new Activity(imageView, intRef2, intRef, str, i, str2, function1, function0));
        } else {
            OLrzqt(imageView, str, i, str2, i2, i4, function1);
        }
    }

    /* JADX INFO: renamed from: o.mpH$Activity */
    public static final class Activity implements ViewTreeObserver.OnPreDrawListener {
        public final /* synthetic */ Function0<Unit> AEQbTJ;
        public final /* synthetic */ Ref.IntRef AYXKKw;
        public final /* synthetic */ java.lang.String AhwBna;
        public final /* synthetic */ Ref.IntRef EZpvd;
        public final /* synthetic */ int KWHzl;
        public final /* synthetic */ java.lang.String OLrzqt;
        public final /* synthetic */ Function1<android.graphics.drawable.Drawable, Unit> copydefault;
        public final /* synthetic */ android.widget.ImageView gEmmrt;

        /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: kotlin.jvm.functions.Function1<? super android.graphics.drawable.Drawable, kotlin.Unit> */
        /* JADX WARN: Multi-variable type inference failed */
        public Activity(android.widget.ImageView imageView, Ref.IntRef intRef, Ref.IntRef intRef2, java.lang.String str, int i, java.lang.String str2, Function1<? super android.graphics.drawable.Drawable, Unit> function1, Function0<Unit> function0) {
            this.gEmmrt = imageView;
            this.EZpvd = intRef;
            this.AYXKKw = intRef2;
            this.AhwBna = str;
            this.KWHzl = i;
            this.OLrzqt = str2;
            this.copydefault = function1;
            this.AEQbTJ = function0;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            this.gEmmrt.getViewTreeObserver().removeOnPreDrawListener(this);
            this.EZpvd.element = this.gEmmrt.getMeasuredHeight();
            this.AYXKKw.element = this.gEmmrt.getMeasuredWidth();
            C33054mpH.OLrzqt(this.gEmmrt, this.AhwBna, this.KWHzl, this.OLrzqt, this.EZpvd.element, this.AYXKKw.element, this.copydefault);
            Unit unit = Unit.INSTANCE;
            Function0<Unit> function0 = this.AEQbTJ;
            if (function0 == null) {
                return true;
            }
            function0.invoke();
            return true;
        }
    }

    public static final void AEQbTJ(@NotNull android.widget.ImageView imageView, java.lang.String str, int i, int i2) {
        Intrinsics.checkNotNullParameter(imageView, "");
        if (str == null || str.length() == 0 || !valueOf(imageView.getContext())) {
            return;
        }
        Glide.AEQbTJ(imageView.getContext()).EZpvd(str).OLrzqt((RX<?>) new C5448Sc().djBIcL().copydefault(AbstractC5360Os.copydefault).copydefault(false).copydefault(i, i2)).EZpvd(imageView);
    }

    public static final void copydefault(@NotNull android.widget.ImageView imageView, java.lang.String str, @NotNull Function1<? super java.lang.Boolean, Unit> function1) {
        Intrinsics.checkNotNullParameter(imageView, "");
        Intrinsics.checkNotNullParameter(function1, "");
        if (str != null && str.length() != 0 && valueOf(imageView.getContext())) {
            Intrinsics.copydefault(Glide.AEQbTJ(imageView.getContext()).EZpvd(str).OLrzqt((RX<?>) new C5448Sc().djBIcL().copydefault(AbstractC5360Os.copydefault).copydefault(false)).OLrzqt(new Fragment(function1, imageView)));
        } else {
            function1.invoke(java.lang.Boolean.FALSE);
        }
    }

    /* JADX INFO: renamed from: o.mpH$Fragment */
    public static final class Fragment extends AbstractC5454Si<android.graphics.drawable.Drawable> {
        public final /* synthetic */ android.widget.ImageView AEQbTJ;
        public final /* synthetic */ Function1<java.lang.Boolean, Unit> KWHzl;

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> */
        /* JADX WARN: Multi-variable type inference failed */
        public Fragment(Function1<? super java.lang.Boolean, Unit> function1, android.widget.ImageView imageView) {
            this.KWHzl = function1;
            this.AEQbTJ = imageView;
        }

        /* JADX DEBUG: Method merged with bridge method: copydefault(Ljava/lang/Object;Lo/So;)V */
        @Override // o.InterfaceC5462Sq
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public void copydefault(android.graphics.drawable.Drawable drawable, InterfaceC5460So<? super android.graphics.drawable.Drawable> interfaceC5460So) {
            Intrinsics.checkNotNullParameter(drawable, "");
            this.AEQbTJ.setImageDrawable(drawable);
            this.KWHzl.invoke(java.lang.Boolean.TRUE);
        }

        @Override // o.AbstractC5453Sh, o.InterfaceC5462Sq
        public void AEQbTJ(android.graphics.drawable.Drawable drawable) {
            super.AEQbTJ(drawable);
            this.KWHzl.invoke(java.lang.Boolean.FALSE);
        }
    }

    public static final void AEQbTJ(@NotNull android.widget.ImageView imageView, java.lang.String str, int i) {
        Intrinsics.checkNotNullParameter(imageView, "");
        if (str == null || str.length() == 0 || !valueOf(imageView.getContext())) {
            return;
        }
        Glide.AEQbTJ(imageView.getContext()).EZpvd(str).OLrzqt((RX<?>) new C5448Sc().KWHzl(i).copydefault(AbstractC5360Os.copydefault).copydefault(false)).EZpvd(imageView);
    }

    public static final void KWHzl(@NotNull android.widget.ImageView imageView, java.lang.String str, int i, int i2) {
        Intrinsics.checkNotNullParameter(imageView, "");
        if (str == null || str.length() == 0 || !valueOf(imageView.getContext())) {
            return;
        }
        Glide.AEQbTJ(imageView.getContext()).EZpvd(str).KWHzl(i).copydefault(i2).OLrzqt((RX<?>) C5448Sc.KWHzl((NN<android.graphics.Bitmap>) new C5417Qx(90))).EZpvd(imageView);
    }

    public static final void KWHzl(@NotNull android.widget.ImageView imageView, java.lang.String str) {
        Intrinsics.checkNotNullParameter(imageView, "");
        if (str == null || str.length() == 0 || !valueOf(imageView.getContext())) {
            return;
        }
        Glide.AEQbTJ(imageView.getContext()).EZpvd(str).OLrzqt((RX<?>) C5448Sc.KWHzl((NN<android.graphics.Bitmap>) new C5417Qx(90))).EZpvd(imageView);
    }

    public static final void EZpvd(@NotNull android.widget.ImageView imageView, java.lang.String str, int i) {
        Intrinsics.checkNotNullParameter(imageView, "");
        if (valueOf(imageView.getContext())) {
            if (str != null && str.length() != 0) {
                Glide.AEQbTJ(imageView.getContext()).EZpvd(str).KWHzl(i).copydefault(i).OLrzqt((RX<?>) C5448Sc.KWHzl((NN<android.graphics.Bitmap>) new C5417Qx(90))).EZpvd(imageView);
            } else {
                Glide.AEQbTJ(imageView.getContext()).OLrzqt(java.lang.Integer.valueOf(i)).OLrzqt((RX<?>) C5448Sc.KWHzl((NN<android.graphics.Bitmap>) new C5417Qx(90))).EZpvd(imageView);
            }
        }
    }

    public static final void OLrzqt(@NotNull android.widget.ImageView imageView, java.lang.Integer num) {
        Intrinsics.checkNotNullParameter(imageView, "");
        if (num == null || !valueOf(imageView.getContext())) {
            return;
        }
        Glide.AEQbTJ(imageView.getContext()).OLrzqt(num).OLrzqt((RX<?>) C5448Sc.KWHzl((NN<android.graphics.Bitmap>) new C5417Qx(90))).EZpvd(imageView);
    }

    public static final void KWHzl(@NotNull android.widget.ImageView imageView, java.lang.String str, @NotNull Function1<? super java.lang.Boolean, Unit> function1) {
        Intrinsics.checkNotNullParameter(imageView, "");
        Intrinsics.checkNotNullParameter(function1, "");
        if (str != null && str.length() != 0 && valueOf(imageView.getContext())) {
            Intrinsics.copydefault(Glide.AEQbTJ(imageView.getContext()).EZpvd(str).OLrzqt((RX<?>) new C5448Sc().copydefault(AbstractC5360Os.copydefault).copydefault(false)).OLrzqt(new TaskDescription(function1, imageView)));
        } else {
            function1.invoke(java.lang.Boolean.FALSE);
        }
    }

    /* JADX INFO: renamed from: o.mpH$TaskDescription */
    public static final class TaskDescription extends AbstractC5454Si<android.graphics.drawable.Drawable> {
        public final /* synthetic */ android.widget.ImageView AEQbTJ;
        public final /* synthetic */ Function1<java.lang.Boolean, Unit> KWHzl;

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> */
        /* JADX WARN: Multi-variable type inference failed */
        public TaskDescription(Function1<? super java.lang.Boolean, Unit> function1, android.widget.ImageView imageView) {
            this.KWHzl = function1;
            this.AEQbTJ = imageView;
        }

        /* JADX DEBUG: Method merged with bridge method: copydefault(Ljava/lang/Object;Lo/So;)V */
        @Override // o.InterfaceC5462Sq
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public void copydefault(android.graphics.drawable.Drawable drawable, InterfaceC5460So<? super android.graphics.drawable.Drawable> interfaceC5460So) {
            Intrinsics.checkNotNullParameter(drawable, "");
            this.AEQbTJ.setImageDrawable(drawable);
            this.KWHzl.invoke(java.lang.Boolean.TRUE);
        }

        @Override // o.AbstractC5453Sh, o.InterfaceC5462Sq
        public void AEQbTJ(android.graphics.drawable.Drawable drawable) {
            super.AEQbTJ(drawable);
            this.KWHzl.invoke(java.lang.Boolean.FALSE);
        }
    }

    public static /* synthetic */ void loadRoundImage$default(android.widget.ImageView imageView, java.lang.String str, int i, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            i = 4;
        }
        copydefault(imageView, str, i);
    }

    public static final void copydefault(@NotNull android.widget.ImageView imageView, java.lang.String str, int i) {
        Intrinsics.checkNotNullParameter(imageView, "");
        if (str == null || str.length() == 0 || !valueOf(imageView.getContext())) {
            return;
        }
        Glide.AEQbTJ(imageView.getContext()).EZpvd(str).OLrzqt((RX<?>) C5448Sc.KWHzl((NN<android.graphics.Bitmap>) new C5417Qx(i))).EZpvd(imageView);
    }

    public static final void AEQbTJ(@NotNull android.widget.ImageView imageView, java.lang.String str) {
        Intrinsics.checkNotNullParameter(imageView, "");
        if (str == null || str.length() == 0 || !valueOf(imageView.getContext())) {
            return;
        }
        Glide.AEQbTJ(imageView.getContext()).EZpvd(str).EZpvd(imageView);
    }

    public static final void AEQbTJ(@NotNull android.widget.ImageView imageView, java.lang.Integer num) {
        Intrinsics.checkNotNullParameter(imageView, "");
        if (num != null) {
            num.intValue();
            if (valueOf(imageView.getContext())) {
                Glide.AEQbTJ(imageView.getContext()).OLrzqt(num).EZpvd(imageView);
            }
        }
    }

    public static /* synthetic */ void loadBannerRoundImage$default(android.widget.ImageView imageView, java.lang.String str, android.graphics.drawable.Drawable drawable, int i, int i2, java.lang.Object obj) {
        if ((i2 & 4) != 0) {
            i = 4;
        }
        AEQbTJ(imageView, str, drawable, i);
    }

    public static final void AEQbTJ(@NotNull android.widget.ImageView imageView, @NotNull java.lang.String str, @NotNull android.graphics.drawable.Drawable drawable, int i) {
        Intrinsics.checkNotNullParameter(imageView, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(drawable, "");
        if (str.length() <= 0 || !valueOf(imageView.getContext())) {
            return;
        }
        Glide.AEQbTJ(imageView.getContext()).EZpvd(str).OLrzqt((RX<?>) new C5448Sc().AEQbTJ(drawable).djBIcL().EZpvd(new C33481mxK(imageView.getContext(), i)).copydefault(AbstractC5360Os.copydefault).copydefault(false)).EZpvd(imageView);
    }

    public static final boolean copydefault(android.app.Activity activity) {
        return activity == null || activity.isFinishing() || activity.isDestroyed();
    }

    public static final void OLrzqt(@NotNull android.content.Context context, android.view.View view) {
        Intrinsics.checkNotNullParameter(context, "");
        try {
            java.lang.Object systemService = context.getSystemService("input_method");
            Intrinsics.copydefault(systemService, "");
            ((android.view.inputmethod.InputMethodManager) systemService).hideSoftInputFromWindow(view != null ? view.getWindowToken() : null, 0);
        } catch (java.lang.Exception e) {
            android.util.Log.getStackTraceString(e);
        }
    }

    public static /* synthetic */ void setBooleanVisibility$default(android.view.View view, boolean z, boolean z2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z2 = true;
        }
        AEQbTJ(view, z, z2);
    }

    public static final void AEQbTJ(@NotNull android.view.View view, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(view, "");
        view.setVisibility(z ? 0 : z2 ? 8 : 4);
    }

    public static final void AEQbTJ(int i, @NotNull Function1<? super java.lang.Integer, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        if (i != 0) {
            function1.invoke(java.lang.Integer.valueOf(i));
        }
    }

    public static final java.lang.String AEQbTJ(int i) {
        return i != 0 ? C33070mpX.AYXKKw(i) : "";
    }

    public static final boolean valueOf(android.content.Context context) {
        if (context == null) {
            return false;
        }
        android.app.Activity activityEZpvd = EZpvd(context);
        if (activityEZpvd != null) {
            return (activityEZpvd.isDestroyed() || activityEZpvd.isFinishing()) ? false : true;
        }
        return true;
    }

    public static final boolean AEQbTJ(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        int i = context.getResources().getConfiguration().uiMode & 48;
        if (i == 16) {
            return false;
        }
        if (i != 32) {
            return C33492mxV.OLrzqt();
        }
        return true;
    }

    public static final android.app.Activity EZpvd(android.content.Context context) {
        if (context == null) {
            return null;
        }
        while (context instanceof android.content.ContextWrapper) {
            if (context instanceof android.app.Activity) {
                return (android.app.Activity) context;
            }
            context = ((android.content.ContextWrapper) context).getBaseContext();
        }
        return null;
    }

    public static final Unit AEQbTJ(boolean z) {
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void loadAvatar$default(android.widget.ImageView imageView, java.lang.String str, java.lang.String str2, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            function1 = new Function1() { // from class: o.mpG
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return C33054mpH.AEQbTJ(((java.lang.Boolean) obj2).booleanValue());
                }
            };
        }
        EZpvd(imageView, str, str2, function1);
    }

    public static final void EZpvd(@NotNull android.widget.ImageView imageView, @NotNull java.lang.String str, java.lang.String str2, @NotNull Function1<? super java.lang.Boolean, Unit> function1) {
        android.graphics.drawable.Drawable drawableCopydefault;
        Intrinsics.checkNotNullParameter(imageView, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function1, "");
        if (str.length() == 0) {
            if (str2 != null) {
                android.content.Context context = imageView.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                drawableCopydefault = copydefault(context, str2);
            } else {
                android.content.Context context2 = imageView.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "");
                drawableCopydefault = copydefault(context2);
            }
            imageView.setImageDrawable(drawableCopydefault);
            function1.invoke(java.lang.Boolean.TRUE);
            return;
        }
        android.content.Context context3 = imageView.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "");
        android.graphics.drawable.Drawable drawableOLrzqt = OLrzqt(context3);
        Glide.KWHzl(imageView).EZpvd(str).gEmmrt().AEQbTJ(drawableOLrzqt).OLrzqt(drawableOLrzqt).OLrzqt(new StateListAnimator(imageView, function1));
    }

    /* JADX INFO: renamed from: o.mpH$StateListAnimator */
    public static final class StateListAnimator extends AbstractC5450Se<android.widget.ImageView, android.graphics.drawable.Drawable> {
        public final /* synthetic */ android.widget.ImageView djBIcL;
        public final /* synthetic */ Function1<java.lang.Boolean, Unit> gEmmrt;

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public StateListAnimator(android.widget.ImageView imageView, Function1<? super java.lang.Boolean, Unit> function1) {
            super(imageView);
            this.djBIcL = imageView;
            this.gEmmrt = function1;
        }

        @Override // o.InterfaceC5462Sq
        public /* bridge */ /* synthetic */ void copydefault(java.lang.Object obj, InterfaceC5460So interfaceC5460So) {
            copydefault((android.graphics.drawable.Drawable) obj, (InterfaceC5460So<? super android.graphics.drawable.Drawable>) interfaceC5460So);
        }

        public void copydefault(android.graphics.drawable.Drawable drawable, InterfaceC5460So<? super android.graphics.drawable.Drawable> interfaceC5460So) {
            Intrinsics.checkNotNullParameter(drawable, "");
            this.djBIcL.setImageDrawable(drawable);
            this.gEmmrt.invoke(java.lang.Boolean.TRUE);
        }

        @Override // o.AbstractC5450Se
        public void OLrzqt(android.graphics.drawable.Drawable drawable) {
            this.djBIcL.setImageDrawable(drawable);
        }

        @Override // o.InterfaceC5462Sq
        public void AEQbTJ(android.graphics.drawable.Drawable drawable) {
            this.djBIcL.setImageDrawable(drawable);
            this.gEmmrt.invoke(java.lang.Boolean.FALSE);
        }
    }

    public static final android.graphics.drawable.Drawable KWHzl(android.content.Context context) {
        android.graphics.drawable.Drawable drawable = ContextCompat.getDrawable(context, C52761wXj.TaskDescription.UimiPOhkCVbT);
        int color = ContextCompat.getColor(context, C52761wXj.Activity.DCUTEIddSDPG);
        if (drawable != null) {
            drawable.setTint(color);
        }
        return drawable;
    }

    public static final android.graphics.drawable.Drawable copydefault(android.content.Context context, java.lang.String str) {
        return new C33034moo(str, KWHzl(context), ContextCompat.getColor(context, C52761wXj.Activity.invokespecialDPHOMC), ContextCompat.getColor(context, C52761wXj.Activity.DCUTEIddSDPG));
    }

    public static final android.graphics.drawable.Drawable OLrzqt(android.content.Context context) {
        return ContextCompat.getDrawable(context, C52761wXj.TaskDescription.getLocation);
    }

    public static final android.graphics.drawable.Drawable copydefault(android.content.Context context) {
        return ContextCompat.getDrawable(context, C52761wXj.TaskDescription.gtCCJH);
    }
}
