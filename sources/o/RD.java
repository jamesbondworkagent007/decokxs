package o;

import android.os.Build;
import android.os.Handler;
import androidx.fragment.app.FragmentActivity;
import com.bumptech.glide.Glide;
import com.reown.foundation.util.jwt.JwtUtilsKt;
import java.util.Objects;
import o.C5328Nm;

/* JADX INFO: loaded from: classes2.dex */
public class RD implements Handler.Callback {
    public static final TaskDescription EZpvd = new TaskDescription() { // from class: o.RD.3
        @Override // o.RD.TaskDescription
        public ComponentCallbacks2C5333Nr KWHzl(@androidx.annotation.NonNull Glide glide, @androidx.annotation.NonNull InterfaceC5444Ry interfaceC5444Ry, @androidx.annotation.NonNull RH rh, @androidx.annotation.NonNull android.content.Context context) {
            return new ComponentCallbacks2C5333Nr(glide, interfaceC5444Ry, rh, context);
        }
    };
    public final TaskDescription AEQbTJ;
    public final InterfaceC5440Ru KWHzl;
    public volatile ComponentCallbacks2C5333Nr OLrzqt;
    public final android.os.Handler copydefault;
    public final RC djBIcL;
    public final java.util.Map<android.app.FragmentManager, FragmentC5445Rz> AYXKKw = new java.util.HashMap();
    public final java.util.Map<androidx.fragment.app.FragmentManager, RG> AhwBna = new java.util.HashMap();
    public final androidx.collection.ArrayMap<android.view.View, androidx.fragment.app.Fragment> fetchVPNInfo = new androidx.collection.ArrayMap<>();
    public final androidx.collection.ArrayMap<android.view.View, android.app.Fragment> valueOf = new androidx.collection.ArrayMap<>();
    public final android.os.Bundle gEmmrt = new android.os.Bundle();

    public interface TaskDescription {
        ComponentCallbacks2C5333Nr KWHzl(@androidx.annotation.NonNull Glide glide, @androidx.annotation.NonNull InterfaceC5444Ry interfaceC5444Ry, @androidx.annotation.NonNull RH rh, @androidx.annotation.NonNull android.content.Context context);
    }

    public RD(@androidx.annotation.Nullable TaskDescription taskDescription, C5331Np c5331Np) {
        taskDescription = taskDescription == null ? EZpvd : taskDescription;
        this.AEQbTJ = taskDescription;
        this.copydefault = new android.os.Handler(android.os.Looper.getMainLooper(), this);
        this.djBIcL = new RC(taskDescription);
        this.KWHzl = EZpvd(c5331Np);
    }

    public static InterfaceC5440Ru EZpvd(C5331Np c5331Np) {
        if (!C5414Qu.copydefault || !C5414Qu.AEQbTJ) {
            return new C5436Rq();
        }
        if (c5331Np.EZpvd(C5328Nm.Application.class)) {
            return new ComponentCallbacks2C5443Rx();
        }
        return new C5442Rw();
    }

    public final ComponentCallbacks2C5333Nr EZpvd(@androidx.annotation.NonNull android.content.Context context) {
        if (this.OLrzqt == null) {
            synchronized (this) {
                if (this.OLrzqt == null) {
                    this.OLrzqt = this.AEQbTJ.KWHzl(Glide.OLrzqt(context.getApplicationContext()), new C5430Rk(), new C5435Rp(), context.getApplicationContext());
                }
            }
        }
        return this.OLrzqt;
    }

    public ComponentCallbacks2C5333Nr OLrzqt(@androidx.annotation.NonNull android.content.Context context) {
        if (context == null) {
            throw new java.lang.IllegalArgumentException("You cannot start a load on a null Context");
        }
        if (SI.OLrzqt() && !(context instanceof android.app.Application)) {
            if (context instanceof FragmentActivity) {
                return copydefault((FragmentActivity) context);
            }
            if (context instanceof android.app.Activity) {
                return OLrzqt((android.app.Activity) context);
            }
            if (context instanceof android.content.ContextWrapper) {
                android.content.ContextWrapper contextWrapper = (android.content.ContextWrapper) context;
                if (contextWrapper.getBaseContext().getApplicationContext() != null) {
                    return OLrzqt(contextWrapper.getBaseContext());
                }
            }
        }
        return EZpvd(context);
    }

    public ComponentCallbacks2C5333Nr copydefault(@androidx.annotation.NonNull FragmentActivity fragmentActivity) {
        if (SI.EZpvd()) {
            return OLrzqt(fragmentActivity.getApplicationContext());
        }
        AEQbTJ((android.app.Activity) fragmentActivity);
        this.KWHzl.KWHzl(fragmentActivity);
        boolean zAEQbTJ = AEQbTJ((android.content.Context) fragmentActivity);
        return this.djBIcL.AEQbTJ(fragmentActivity, Glide.OLrzqt(fragmentActivity.getApplicationContext()), fragmentActivity.getLifecycle(), fragmentActivity.getSupportFragmentManager(), zAEQbTJ);
    }

    public ComponentCallbacks2C5333Nr AEQbTJ(@androidx.annotation.NonNull androidx.fragment.app.Fragment fragment) {
        SE.copydefault(fragment.getContext(), "You cannot start a load on a fragment before it is attached or after it is destroyed");
        if (SI.EZpvd()) {
            return OLrzqt(fragment.getContext().getApplicationContext());
        }
        if (fragment.getActivity() != null) {
            this.KWHzl.KWHzl(fragment.getActivity());
        }
        androidx.fragment.app.FragmentManager childFragmentManager = fragment.getChildFragmentManager();
        android.content.Context context = fragment.getContext();
        return this.djBIcL.AEQbTJ(context, Glide.OLrzqt(context.getApplicationContext()), fragment.getLifecycle(), childFragmentManager, fragment.isVisible());
    }

    @java.lang.Deprecated
    public ComponentCallbacks2C5333Nr OLrzqt(@androidx.annotation.NonNull android.app.Activity activity) {
        if (SI.EZpvd()) {
            return OLrzqt(activity.getApplicationContext());
        }
        if (activity instanceof FragmentActivity) {
            return copydefault((FragmentActivity) activity);
        }
        AEQbTJ(activity);
        this.KWHzl.KWHzl(activity);
        return copydefault(activity, activity.getFragmentManager(), null, AEQbTJ((android.content.Context) activity));
    }

    public ComponentCallbacks2C5333Nr OLrzqt(@androidx.annotation.NonNull android.view.View view) {
        if (SI.EZpvd()) {
            return OLrzqt(view.getContext().getApplicationContext());
        }
        SE.OLrzqt(view);
        SE.copydefault(view.getContext(), "Unable to obtain a request manager for a view without a Context");
        android.app.Activity activityCopydefault = copydefault(view.getContext());
        if (activityCopydefault == null) {
            return OLrzqt(view.getContext().getApplicationContext());
        }
        if (activityCopydefault instanceof FragmentActivity) {
            FragmentActivity fragmentActivity = (FragmentActivity) activityCopydefault;
            androidx.fragment.app.Fragment fragmentOLrzqt = OLrzqt(view, fragmentActivity);
            return fragmentOLrzqt != null ? AEQbTJ(fragmentOLrzqt) : copydefault(fragmentActivity);
        }
        android.app.Fragment fragmentOLrzqt2 = OLrzqt(view, activityCopydefault);
        if (fragmentOLrzqt2 == null) {
            return OLrzqt(activityCopydefault);
        }
        return KWHzl(fragmentOLrzqt2);
    }

    public static void AEQbTJ(@androidx.annotation.Nullable java.util.Collection<androidx.fragment.app.Fragment> collection, @androidx.annotation.NonNull java.util.Map<android.view.View, androidx.fragment.app.Fragment> map) {
        if (collection == null) {
            return;
        }
        for (androidx.fragment.app.Fragment fragment : collection) {
            if (fragment != null && fragment.getView() != null) {
                map.put(fragment.getView(), fragment);
                AEQbTJ(fragment.getChildFragmentManager().getFragments(), map);
            }
        }
    }

    public final androidx.fragment.app.Fragment OLrzqt(@androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull FragmentActivity fragmentActivity) {
        this.fetchVPNInfo.clear();
        AEQbTJ(fragmentActivity.getSupportFragmentManager().getFragments(), this.fetchVPNInfo);
        android.view.View viewFindViewById = fragmentActivity.findViewById(android.R.id.content);
        androidx.fragment.app.Fragment fragment = null;
        while (!view.equals(viewFindViewById) && (fragment = this.fetchVPNInfo.get(view)) == null && (view.getParent() instanceof android.view.View)) {
            view = (android.view.View) view.getParent();
        }
        this.fetchVPNInfo.clear();
        return fragment;
    }

    @java.lang.Deprecated
    public final android.app.Fragment OLrzqt(@androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull android.app.Activity activity) {
        this.valueOf.clear();
        KWHzl(activity.getFragmentManager(), this.valueOf);
        android.view.View viewFindViewById = activity.findViewById(android.R.id.content);
        android.app.Fragment fragment = null;
        while (!view.equals(viewFindViewById) && (fragment = this.valueOf.get(view)) == null && (view.getParent() instanceof android.view.View)) {
            view = (android.view.View) view.getParent();
        }
        this.valueOf.clear();
        return fragment;
    }

    @java.lang.Deprecated
    public final void KWHzl(@androidx.annotation.NonNull android.app.FragmentManager fragmentManager, @androidx.annotation.NonNull androidx.collection.ArrayMap<android.view.View, android.app.Fragment> arrayMap) {
        if (Build.VERSION.SDK_INT >= 26) {
            for (android.app.Fragment fragment : fragmentManager.getFragments()) {
                if (fragment.getView() != null) {
                    arrayMap.put(fragment.getView(), fragment);
                    KWHzl(fragment.getChildFragmentManager(), arrayMap);
                }
            }
            return;
        }
        OLrzqt(fragmentManager, arrayMap);
    }

    @java.lang.Deprecated
    public final void OLrzqt(@androidx.annotation.NonNull android.app.FragmentManager fragmentManager, @androidx.annotation.NonNull androidx.collection.ArrayMap<android.view.View, android.app.Fragment> arrayMap) {
        android.app.Fragment fragment;
        int i = 0;
        while (true) {
            this.gEmmrt.putInt(JwtUtilsKt.DID_METHOD_KEY, i);
            try {
                fragment = fragmentManager.getFragment(this.gEmmrt, JwtUtilsKt.DID_METHOD_KEY);
            } catch (java.lang.Exception unused) {
                fragment = null;
            }
            if (fragment == null) {
                return;
            }
            if (fragment.getView() != null) {
                arrayMap.put(fragment.getView(), fragment);
                KWHzl(fragment.getChildFragmentManager(), arrayMap);
            }
            i++;
        }
    }

    public static android.app.Activity copydefault(@androidx.annotation.NonNull android.content.Context context) {
        if (context instanceof android.app.Activity) {
            return (android.app.Activity) context;
        }
        if (context instanceof android.content.ContextWrapper) {
            return copydefault(((android.content.ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    public static void AEQbTJ(@androidx.annotation.NonNull android.app.Activity activity) {
        if (activity.isDestroyed()) {
            throw new java.lang.IllegalArgumentException("You cannot start a load for a destroyed activity");
        }
    }

    @java.lang.Deprecated
    public ComponentCallbacks2C5333Nr KWHzl(@androidx.annotation.NonNull android.app.Fragment fragment) {
        if (fragment.getActivity() == null) {
            throw new java.lang.IllegalArgumentException("You cannot start a load on a fragment before it is attached");
        }
        if (SI.EZpvd()) {
            return OLrzqt(fragment.getActivity().getApplicationContext());
        }
        if (fragment.getActivity() != null) {
            this.KWHzl.KWHzl(fragment.getActivity());
        }
        return copydefault(fragment.getActivity(), fragment.getChildFragmentManager(), fragment, fragment.isVisible());
    }

    @java.lang.Deprecated
    public FragmentC5445Rz EZpvd(android.app.Activity activity) {
        return copydefault(activity.getFragmentManager(), (android.app.Fragment) null);
    }

    public final FragmentC5445Rz copydefault(@androidx.annotation.NonNull android.app.FragmentManager fragmentManager, @androidx.annotation.Nullable android.app.Fragment fragment) {
        FragmentC5445Rz fragmentC5445Rz = this.AYXKKw.get(fragmentManager);
        if (fragmentC5445Rz != null) {
            return fragmentC5445Rz;
        }
        FragmentC5445Rz fragmentC5445Rz2 = (FragmentC5445Rz) fragmentManager.findFragmentByTag("com.bumptech.glide.manager");
        if (fragmentC5445Rz2 == null) {
            fragmentC5445Rz2 = new FragmentC5445Rz();
            fragmentC5445Rz2.AEQbTJ(fragment);
            this.AYXKKw.put(fragmentManager, fragmentC5445Rz2);
            fragmentManager.beginTransaction().add(fragmentC5445Rz2, "com.bumptech.glide.manager").commitAllowingStateLoss();
            this.copydefault.obtainMessage(1, fragmentManager).sendToTarget();
        }
        return fragmentC5445Rz2;
    }

    @java.lang.Deprecated
    public final ComponentCallbacks2C5333Nr copydefault(@androidx.annotation.NonNull android.content.Context context, @androidx.annotation.NonNull android.app.FragmentManager fragmentManager, @androidx.annotation.Nullable android.app.Fragment fragment, boolean z) {
        FragmentC5445Rz fragmentC5445RzCopydefault = copydefault(fragmentManager, fragment);
        ComponentCallbacks2C5333Nr componentCallbacks2C5333NrOLrzqt = fragmentC5445RzCopydefault.OLrzqt();
        if (componentCallbacks2C5333NrOLrzqt == null) {
            componentCallbacks2C5333NrOLrzqt = this.AEQbTJ.KWHzl(Glide.OLrzqt(context), fragmentC5445RzCopydefault.EZpvd(), fragmentC5445RzCopydefault.copydefault(), context);
            if (z) {
                componentCallbacks2C5333NrOLrzqt.AYXKKw();
            }
            fragmentC5445RzCopydefault.OLrzqt(componentCallbacks2C5333NrOLrzqt);
        }
        return componentCallbacks2C5333NrOLrzqt;
    }

    public RG copydefault(androidx.fragment.app.FragmentManager fragmentManager) {
        return KWHzl(fragmentManager, (androidx.fragment.app.Fragment) null);
    }

    public static boolean AEQbTJ(android.content.Context context) {
        android.app.Activity activityCopydefault = copydefault(context);
        return activityCopydefault == null || !activityCopydefault.isFinishing();
    }

    public final RG KWHzl(@androidx.annotation.NonNull androidx.fragment.app.FragmentManager fragmentManager, @androidx.annotation.Nullable androidx.fragment.app.Fragment fragment) {
        RG rg = this.AhwBna.get(fragmentManager);
        if (rg != null) {
            return rg;
        }
        RG rg2 = (RG) fragmentManager.findFragmentByTag("com.bumptech.glide.manager");
        if (rg2 == null) {
            rg2 = new RG();
            rg2.KWHzl(fragment);
            this.AhwBna.put(fragmentManager, rg2);
            fragmentManager.beginTransaction().add(rg2, "com.bumptech.glide.manager").commitAllowingStateLoss();
            this.copydefault.obtainMessage(2, fragmentManager).sendToTarget();
        }
        return rg2;
    }

    public final boolean KWHzl(android.app.FragmentManager fragmentManager, boolean z) {
        FragmentC5445Rz fragmentC5445Rz = this.AYXKKw.get(fragmentManager);
        FragmentC5445Rz fragmentC5445Rz2 = (FragmentC5445Rz) fragmentManager.findFragmentByTag("com.bumptech.glide.manager");
        if (fragmentC5445Rz2 == fragmentC5445Rz) {
            return true;
        }
        if (fragmentC5445Rz2 != null && fragmentC5445Rz2.OLrzqt() != null) {
            throw new java.lang.IllegalStateException("We've added two fragments with requests! Old: " + fragmentC5445Rz2 + " New: " + fragmentC5445Rz);
        }
        if (!z && !fragmentManager.isDestroyed()) {
            android.app.FragmentTransaction fragmentTransactionAdd = fragmentManager.beginTransaction().add(fragmentC5445Rz, "com.bumptech.glide.manager");
            if (fragmentC5445Rz2 != null) {
                fragmentTransactionAdd.remove(fragmentC5445Rz2);
            }
            fragmentTransactionAdd.commitAllowingStateLoss();
            this.copydefault.obtainMessage(1, 1, 0, fragmentManager).sendToTarget();
            return false;
        }
        if (android.util.Log.isLoggable("RMRetriever", 5)) {
            fragmentManager.isDestroyed();
        }
        fragmentC5445Rz.EZpvd().EZpvd();
        return true;
    }

    public final boolean copydefault(androidx.fragment.app.FragmentManager fragmentManager, boolean z) {
        RG rg = this.AhwBna.get(fragmentManager);
        RG rg2 = (RG) fragmentManager.findFragmentByTag("com.bumptech.glide.manager");
        if (rg2 == rg) {
            return true;
        }
        if (rg2 != null && rg2.KWHzl() != null) {
            throw new java.lang.IllegalStateException("We've added two fragments with requests! Old: " + rg2 + " New: " + rg);
        }
        if (!z && !fragmentManager.isDestroyed()) {
            androidx.fragment.app.FragmentTransaction fragmentTransactionAdd = fragmentManager.beginTransaction().add(rg, "com.bumptech.glide.manager");
            if (rg2 != null) {
                fragmentTransactionAdd.remove(rg2);
            }
            fragmentTransactionAdd.commitNowAllowingStateLoss();
            this.copydefault.obtainMessage(2, 1, 0, fragmentManager).sendToTarget();
            return false;
        }
        fragmentManager.isDestroyed();
        rg.OLrzqt().EZpvd();
        return true;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(android.os.Message message) {
        java.lang.Object objRemove;
        androidx.fragment.app.FragmentManager fragmentManager;
        androidx.fragment.app.FragmentManager fragmentManager2;
        boolean z = true;
        boolean z2 = false;
        boolean z3 = message.arg1 == 1;
        int i = message.what;
        java.lang.Object obj = null;
        if (i == 1) {
            android.app.FragmentManager fragmentManager3 = (android.app.FragmentManager) message.obj;
            if (KWHzl(fragmentManager3, z3)) {
                objRemove = this.AYXKKw.remove(fragmentManager3);
                fragmentManager2 = fragmentManager3;
                obj = objRemove;
                z2 = true;
                fragmentManager = fragmentManager2;
            }
            fragmentManager = null;
            z2 = true;
            z = false;
        } else if (i != 2) {
            z = false;
            fragmentManager = null;
        } else {
            androidx.fragment.app.FragmentManager fragmentManager4 = (androidx.fragment.app.FragmentManager) message.obj;
            if (copydefault(fragmentManager4, z3)) {
                objRemove = this.AhwBna.remove(fragmentManager4);
                fragmentManager2 = fragmentManager4;
                obj = objRemove;
                z2 = true;
                fragmentManager = fragmentManager2;
            }
            fragmentManager = null;
            z2 = true;
            z = false;
        }
        if (android.util.Log.isLoggable("RMRetriever", 5) && z && obj == null) {
            Objects.toString(fragmentManager);
        }
        return z2;
    }
}
