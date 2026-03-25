package o;

import androidx.lifecycle.Lifecycle;
import com.bumptech.glide.Glide;
import com.bumptech.glide.manager.LifecycleLifecycle;
import o.RD;

/* JADX INFO: loaded from: classes2.dex */
public final class RC {
    public final java.util.Map<Lifecycle, ComponentCallbacks2C5333Nr> AEQbTJ = new java.util.HashMap();
    public final RD.TaskDescription KWHzl;

    public RC(@androidx.annotation.NonNull RD.TaskDescription taskDescription) {
        this.KWHzl = taskDescription;
    }

    public ComponentCallbacks2C5333Nr OLrzqt(Lifecycle lifecycle) {
        SI.copydefault();
        return this.AEQbTJ.get(lifecycle);
    }

    public ComponentCallbacks2C5333Nr AEQbTJ(android.content.Context context, Glide glide, final Lifecycle lifecycle, androidx.fragment.app.FragmentManager fragmentManager, boolean z) {
        SI.copydefault();
        ComponentCallbacks2C5333Nr componentCallbacks2C5333NrOLrzqt = OLrzqt(lifecycle);
        if (componentCallbacks2C5333NrOLrzqt != null) {
            return componentCallbacks2C5333NrOLrzqt;
        }
        LifecycleLifecycle lifecycleLifecycle = new LifecycleLifecycle(lifecycle);
        ComponentCallbacks2C5333Nr componentCallbacks2C5333NrKWHzl = this.KWHzl.KWHzl(glide, lifecycleLifecycle, new Application(fragmentManager), context);
        this.AEQbTJ.put(lifecycle, componentCallbacks2C5333NrKWHzl);
        lifecycleLifecycle.AEQbTJ(new InterfaceC5441Rv() { // from class: o.RC.2
            @Override // o.InterfaceC5441Rv
            public void AYXKKw() {
            }

            @Override // o.InterfaceC5441Rv
            public void AhwBna() {
            }

            @Override // o.InterfaceC5441Rv
            public void valueOf() {
                RC.this.AEQbTJ.remove(lifecycle);
            }
        });
        if (z) {
            componentCallbacks2C5333NrKWHzl.AYXKKw();
        }
        return componentCallbacks2C5333NrKWHzl;
    }

    public final class Application implements RH {
        public final androidx.fragment.app.FragmentManager EZpvd;

        public Application(androidx.fragment.app.FragmentManager fragmentManager) {
            this.EZpvd = fragmentManager;
        }

        @Override // o.RH
        public java.util.Set<ComponentCallbacks2C5333Nr> copydefault() {
            java.util.HashSet hashSet = new java.util.HashSet();
            OLrzqt(this.EZpvd, hashSet);
            return hashSet;
        }

        public final void OLrzqt(androidx.fragment.app.FragmentManager fragmentManager, java.util.Set<ComponentCallbacks2C5333Nr> set) {
            java.util.List<androidx.fragment.app.Fragment> fragments = fragmentManager.getFragments();
            int size = fragments.size();
            for (int i = 0; i < size; i++) {
                androidx.fragment.app.Fragment fragment = fragments.get(i);
                OLrzqt(fragment.getChildFragmentManager(), set);
                ComponentCallbacks2C5333Nr componentCallbacks2C5333NrOLrzqt = RC.this.OLrzqt(fragment.getLifecycle());
                if (componentCallbacks2C5333NrOLrzqt != null) {
                    set.add(componentCallbacks2C5333NrOLrzqt);
                }
            }
        }
    }
}
