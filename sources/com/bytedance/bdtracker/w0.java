package com.bytedance.bdtracker;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import com.bytedance.applog.R;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class w0 implements Application.ActivityLifecycleCallbacks, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public WeakReference<Activity> f281a;
    public ViewTreeObserver.OnDrawListener b;
    public ViewTreeObserver.OnGlobalLayoutListener c;
    public ViewTreeObserver.OnGlobalFocusChangeListener d;
    public ViewTreeObserver.OnScrollChangedListener e;
    public ViewTreeObserver.OnWindowFocusChangeListener f;
    public Function1<? super Activity, Unit> g;
    public Function2<? super Activity, ? super Boolean, Unit> h;
    public final Application i;

    public static final class a implements ViewTreeObserver.OnDrawListener {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public a() {
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.view.ViewTreeObserver.OnDrawListener
        public final void onDraw() {
            w0.this.a();
        }
    }

    public static final class b implements ViewTreeObserver.OnGlobalFocusChangeListener {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public b() {
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
        public final void onGlobalFocusChanged(View view, View view2) {
            w0.this.a();
        }
    }

    public static final class c implements ViewTreeObserver.OnGlobalLayoutListener {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public c() {
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            w0.this.a();
        }
    }

    public static final class d implements ViewTreeObserver.OnScrollChangedListener {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public d() {
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.view.ViewTreeObserver.OnScrollChangedListener
        public final void onScrollChanged() {
            w0.this.a();
        }
    }

    public static final class e implements ViewTreeObserver.OnWindowFocusChangeListener {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public e() {
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
        public final void onWindowFocusChanged(boolean z) {
            w0.this.a();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public w0(@NotNull Application application) {
        Intrinsics.EZpvd((Object) application, "");
        this.i = application;
        this.f281a = new WeakReference<>(null);
        this.b = new a();
        this.c = new c();
        this.d = new b();
        this.e = new d();
        this.f = new e();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void a() {
        try {
            Activity activity = this.f281a.get();
            if (activity != null) {
                Intrinsics.AEQbTJ(activity, "");
                Function1<? super Activity, Unit> function1 = this.g;
                if (function1 != null) {
                    function1.invoke(activity);
                }
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void a(@NotNull View view) {
        Intrinsics.EZpvd((Object) view, "");
        if (!view.isAttachedToWindow()) {
            view.addOnAttachStateChangeListener(this);
            return;
        }
        View rootView = view.getRootView();
        Intrinsics.AEQbTJ(rootView, "");
        b(rootView);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void a(@NotNull Function1<? super Activity, Unit> function1) {
        Intrinsics.EZpvd((Object) function1, "");
        if (this.g == null) {
            this.g = function1;
            this.i.registerActivityLifecycleCallbacks(this);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void a(@NotNull Function2<? super Activity, ? super Boolean, Unit> function2) {
        Intrinsics.EZpvd((Object) function2, "");
        this.h = function2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void b(View view) {
        Object tag = view.getTag(R.id.applog_tag_view_exposure_observe_flag);
        Boolean bool = Boolean.TRUE;
        if (Intrinsics.EZpvd(tag, bool)) {
            return;
        }
        view.setTag(R.id.applog_tag_view_exposure_observe_flag, bool);
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        viewTreeObserver.addOnGlobalFocusChangeListener(this.d);
        viewTreeObserver.addOnScrollChangedListener(this.e);
        viewTreeObserver.addOnDrawListener(this.b);
        viewTreeObserver.addOnGlobalLayoutListener(this.c);
        viewTreeObserver.addOnWindowFocusChangeListener(this.f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(@NotNull Activity activity, Bundle bundle) {
        Intrinsics.EZpvd((Object) activity, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(@NotNull Activity activity) {
        Intrinsics.EZpvd((Object) activity, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(@NotNull Activity activity) {
        Intrinsics.EZpvd((Object) activity, "");
        Window window = activity.getWindow();
        Intrinsics.AEQbTJ(window, "");
        View decorView = window.getDecorView();
        Intrinsics.AEQbTJ(decorView, "");
        if (!Intrinsics.EZpvd(decorView.getTag(R.id.applog_tag_view_exposure_observe_flag), Boolean.TRUE)) {
            return;
        }
        decorView.setTag(R.id.applog_tag_view_exposure_observe_flag, Boolean.FALSE);
        ViewTreeObserver viewTreeObserver = decorView.getViewTreeObserver();
        viewTreeObserver.removeOnGlobalFocusChangeListener(this.d);
        viewTreeObserver.removeOnScrollChangedListener(this.e);
        viewTreeObserver.removeOnDrawListener(this.b);
        viewTreeObserver.removeOnGlobalLayoutListener(this.c);
        viewTreeObserver.removeOnWindowFocusChangeListener(this.f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(@NotNull Activity activity) {
        Intrinsics.EZpvd((Object) activity, "");
        this.f281a = new WeakReference<>(activity);
        Window window = activity.getWindow();
        Intrinsics.AEQbTJ(window, "");
        View decorView = window.getDecorView();
        Intrinsics.AEQbTJ(decorView, "");
        b(decorView);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(@NotNull Activity activity, @NotNull Bundle bundle) {
        Intrinsics.EZpvd((Object) activity, "");
        Intrinsics.EZpvd((Object) bundle, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(@NotNull Activity activity) {
        Intrinsics.EZpvd((Object) activity, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(@NotNull Activity activity) {
        Function2<? super Activity, ? super Boolean, Unit> function2;
        Intrinsics.EZpvd((Object) activity, "");
        Activity activity2 = this.f281a.get();
        if (activity2 == null || (function2 = this.h) == null) {
            return;
        }
        function2.invoke(activity, Boolean.valueOf(Intrinsics.EZpvd(activity2, activity)));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        if (view != null) {
            View rootView = view.getRootView();
            Intrinsics.AEQbTJ(rootView, "");
            b(rootView);
            view.removeOnAttachStateChangeListener(this);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
    }
}
