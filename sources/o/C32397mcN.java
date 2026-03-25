package o;

import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.okinc.rxutils.RxBus;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import o.C32549mfg;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mcN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C32397mcN extends AbstractC32980mnn {
    public AtomicBoolean copydefault;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32397mcN(@NotNull C32399mcP c32399mcP) {
        super(c32399mcP);
        Intrinsics.checkNotNullParameter(c32399mcP, "");
        this.copydefault = new AtomicBoolean(false);
    }

    @Override // o.AbstractC32980mnn, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(@NotNull android.app.Activity activity, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "");
        super.onActivityCreated(activity, bundle);
        C32979mnm.EZpvd.KWHzl().add(new WeakReference<>(activity));
        if (activity instanceof FragmentActivity) {
            KWHzl((FragmentActivity) activity);
        }
        if (!this.copydefault.get()) {
            pUU.KWHzl("onActivityCreated", "first Activity created, will post event!");
            RxBus.KWHzl("event_first_activity_created");
            this.copydefault.set(true);
        }
        java.lang.String name = activity.getClass().getName();
        Intrinsics.checkNotNullExpressionValue(name, "");
        AEQbTJ(name);
        mNS mns = mNS.copydefault;
        java.lang.String name2 = activity.getClass().getName();
        Intrinsics.checkNotNullExpressionValue(name2, "");
        mns.KWHzl(RequestParameters.SUBRESOURCE_LIFECYCLE, name2, "onActivityCreated", java.lang.String.valueOf(activity.hashCode()));
    }

    @Override // o.AbstractC32980mnn, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(@NotNull android.app.Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        super.onActivityStarted(activity);
    }

    @Override // o.AbstractC32980mnn, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(@NotNull android.app.Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        super.onActivityStopped(activity);
        mNS mns = mNS.copydefault;
        java.lang.String name = activity.getClass().getName();
        Intrinsics.checkNotNullExpressionValue(name, "");
        mns.KWHzl(RequestParameters.SUBRESOURCE_LIFECYCLE, name, "onActivityStopped", java.lang.String.valueOf(activity.hashCode()));
    }

    @Override // o.AbstractC32980mnn, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(@NotNull android.app.Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        super.onActivityDestroyed(activity);
        C32979mnm c32979mnm = C32979mnm.EZpvd;
        if (!c32979mnm.KWHzl().isEmpty()) {
            java.util.Iterator<WeakReference<android.app.Activity>> it = c32979mnm.KWHzl().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (it.next().get() == activity) {
                    it.remove();
                    break;
                }
            }
        }
        mNS mns = mNS.copydefault;
        java.lang.String name = activity.getClass().getName();
        Intrinsics.checkNotNullExpressionValue(name, "");
        mns.KWHzl(RequestParameters.SUBRESOURCE_LIFECYCLE, name, "onActivityDestroyed", java.lang.String.valueOf(activity.hashCode()));
    }

    @Override // o.AbstractC32980mnn
    public void OLrzqt(@NotNull AbstractActivityC33041mov abstractActivityC33041mov) {
        Intrinsics.checkNotNullParameter(abstractActivityC33041mov, "");
        try {
            java.lang.String name = abstractActivityC33041mov.getClass().getName();
            mNS mns = mNS.copydefault;
            java.lang.String name2 = abstractActivityC33041mov.getClass().getName();
            Intrinsics.checkNotNullExpressionValue(name2, "");
            mns.KWHzl(RequestParameters.SUBRESOURCE_LIFECYCLE, name2, "onActivityResumed", java.lang.String.valueOf(abstractActivityC33041mov.hashCode()));
            C32402mcS c32402mcS = C32402mcS.copydefault;
            Intrinsics.copydefault((java.lang.Object) name);
            c32402mcS.copydefault(name);
            KWHzl(name);
        } catch (java.lang.Exception e) {
            android.util.Log.getStackTraceString(e);
        }
    }

    public final void KWHzl(FragmentActivity fragmentActivity) {
        fragmentActivity.getSupportFragmentManager().registerFragmentLifecycleCallbacks(new ActionBar(), true);
    }

    /* JADX INFO: renamed from: o.mcN$ActionBar */
    public static final class ActionBar extends FragmentManager.FragmentLifecycleCallbacks {
        @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
        public void onFragmentCreated(androidx.fragment.app.FragmentManager fragmentManager, androidx.fragment.app.Fragment fragment, android.os.Bundle bundle) {
            Intrinsics.checkNotNullParameter(fragmentManager, "");
            Intrinsics.checkNotNullParameter(fragment, "");
            super.onFragmentCreated(fragmentManager, fragment, bundle);
            mNS mns = mNS.copydefault;
            java.lang.String name = fragment.getClass().getName();
            Intrinsics.checkNotNullExpressionValue(name, "");
            mns.KWHzl(RequestParameters.SUBRESOURCE_LIFECYCLE, name, "onFragmentCreated", java.lang.String.valueOf(fragment.hashCode()));
        }

        @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
        public void onFragmentResumed(androidx.fragment.app.FragmentManager fragmentManager, androidx.fragment.app.Fragment fragment) {
            Intrinsics.checkNotNullParameter(fragmentManager, "");
            Intrinsics.checkNotNullParameter(fragment, "");
            super.onFragmentResumed(fragmentManager, fragment);
            mNS mns = mNS.copydefault;
            java.lang.String name = fragment.getClass().getName();
            Intrinsics.checkNotNullExpressionValue(name, "");
            mns.KWHzl(RequestParameters.SUBRESOURCE_LIFECYCLE, name, "onFragmentResumed", java.lang.String.valueOf(fragment.hashCode()));
            C32402mcS c32402mcS = C32402mcS.copydefault;
            java.lang.String name2 = fragment.getClass().getName();
            Intrinsics.checkNotNullExpressionValue(name2, "");
            c32402mcS.copydefault(name2);
        }

        @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
        public void onFragmentStopped(androidx.fragment.app.FragmentManager fragmentManager, androidx.fragment.app.Fragment fragment) {
            Intrinsics.checkNotNullParameter(fragmentManager, "");
            Intrinsics.checkNotNullParameter(fragment, "");
            super.onFragmentStopped(fragmentManager, fragment);
            mNS mns = mNS.copydefault;
            java.lang.String name = fragment.getClass().getName();
            Intrinsics.checkNotNullExpressionValue(name, "");
            mns.KWHzl(RequestParameters.SUBRESOURCE_LIFECYCLE, name, "onFragmentStopped", java.lang.String.valueOf(fragment.hashCode()));
        }

        @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
        public void onFragmentDestroyed(androidx.fragment.app.FragmentManager fragmentManager, androidx.fragment.app.Fragment fragment) {
            Intrinsics.checkNotNullParameter(fragmentManager, "");
            Intrinsics.checkNotNullParameter(fragment, "");
            super.onFragmentDestroyed(fragmentManager, fragment);
            mNS mns = mNS.copydefault;
            java.lang.String name = fragment.getClass().getName();
            Intrinsics.checkNotNullExpressionValue(name, "");
            mns.KWHzl(RequestParameters.SUBRESOURCE_LIFECYCLE, name, "onFragmentDestroyed", java.lang.String.valueOf(fragment.hashCode()));
        }
    }

    public final void KWHzl(java.lang.String str) {
        boolean z = C43396roW.EZpvd().AYXKKw().booleanValue() && !C43372rnz.copydefault.AuCTel();
        if (z) {
            pUU.KWHzl("doAppNetAvailableCheck", str + ", isNetworkDisabled: " + z);
            C55328xhq.show$default(C55328xhq.OLrzqt, C32979mnm.EZpvd.OLrzqt().getString(C32549mfg.StateListAnimator.fZBcTu), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 62, (java.lang.Object) null);
        }
    }

    public final void AEQbTJ(java.lang.String str) {
        if (Intrinsics.EZpvd(android.os.Looper.myLooper(), android.os.Looper.getMainLooper())) {
            pUU.KWHzl("LogIdleHandler", "addIdleHandler  activity:" + str);
            android.os.Looper.myQueue().addIdleHandler(new C38348pVl(str));
        }
    }
}
