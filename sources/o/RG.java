package o;

import com.bumptech.glide.Glide;
import java.util.Collections;

/* JADX INFO: loaded from: classes14.dex */
public class RG extends androidx.fragment.app.Fragment {
    public ComponentCallbacks2C5333Nr AEQbTJ;
    public RG AYXKKw;
    public androidx.fragment.app.Fragment EZpvd;
    public final C5434Ro KWHzl;
    public final RH OLrzqt;
    public final java.util.Set<RG> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ComponentCallbacks2C5333Nr KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C5434Ro OLrzqt() {
        return this.KWHzl;
    }

    public RG() {
        this(new C5434Ro());
    }

    public RG(@androidx.annotation.NonNull C5434Ro c5434Ro) {
        this.OLrzqt = new StateListAnimator();
        this.copydefault = new java.util.HashSet();
        this.KWHzl = c5434Ro;
    }

    public final void EZpvd(RG rg) {
        this.copydefault.add(rg);
    }

    public final void OLrzqt(RG rg) {
        this.copydefault.remove(rg);
    }

    public java.util.Set<RG> copydefault() {
        RG rg = this.AYXKKw;
        if (rg == null) {
            return Collections.emptySet();
        }
        if (equals(rg)) {
            return Collections.unmodifiableSet(this.copydefault);
        }
        java.util.HashSet hashSet = new java.util.HashSet();
        for (RG rg2 : this.AYXKKw.copydefault()) {
            if (copydefault(rg2.EZpvd())) {
                hashSet.add(rg2);
            }
        }
        return Collections.unmodifiableSet(hashSet);
    }

    public void KWHzl(@androidx.annotation.Nullable androidx.fragment.app.Fragment fragment) {
        androidx.fragment.app.FragmentManager fragmentManagerEZpvd;
        this.EZpvd = fragment;
        if (fragment == null || fragment.getContext() == null || (fragmentManagerEZpvd = EZpvd(fragment)) == null) {
            return;
        }
        copydefault(fragment.getContext(), fragmentManagerEZpvd);
    }

    public static androidx.fragment.app.FragmentManager EZpvd(@androidx.annotation.NonNull androidx.fragment.app.Fragment fragment) {
        while (fragment.getParentFragment() != null) {
            fragment = fragment.getParentFragment();
        }
        return fragment.getFragmentManager();
    }

    public final androidx.fragment.app.Fragment EZpvd() {
        androidx.fragment.app.Fragment parentFragment = getParentFragment();
        return parentFragment != null ? parentFragment : this.EZpvd;
    }

    public final boolean copydefault(@androidx.annotation.NonNull androidx.fragment.app.Fragment fragment) {
        androidx.fragment.app.Fragment fragmentEZpvd = EZpvd();
        while (true) {
            androidx.fragment.app.Fragment parentFragment = fragment.getParentFragment();
            if (parentFragment == null) {
                return false;
            }
            if (parentFragment.equals(fragmentEZpvd)) {
                return true;
            }
            fragment = fragment.getParentFragment();
        }
    }

    public final void copydefault(@androidx.annotation.NonNull android.content.Context context, @androidx.annotation.NonNull androidx.fragment.app.FragmentManager fragmentManager) {
        AEQbTJ();
        RG rgCopydefault = Glide.OLrzqt(context).AYXKKw().copydefault(fragmentManager);
        this.AYXKKw = rgCopydefault;
        if (equals(rgCopydefault)) {
            return;
        }
        this.AYXKKw.EZpvd(this);
    }

    public final void AEQbTJ() {
        RG rg = this.AYXKKw;
        if (rg != null) {
            rg.OLrzqt(this);
            this.AYXKKw = null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(android.content.Context context) {
        super.onAttach(context);
        androidx.fragment.app.FragmentManager fragmentManagerEZpvd = EZpvd((androidx.fragment.app.Fragment) this);
        if (fragmentManagerEZpvd == null) {
            return;
        }
        try {
            copydefault(getContext(), fragmentManagerEZpvd);
        } catch (java.lang.IllegalStateException unused) {
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
        this.EZpvd = null;
        AEQbTJ();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        this.KWHzl.copydefault();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        this.KWHzl.AEQbTJ();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.KWHzl.EZpvd();
        AEQbTJ();
    }

    @Override // androidx.fragment.app.Fragment
    public java.lang.String toString() {
        return super.toString() + "{parent=" + EZpvd() + "}";
    }

    /* JADX INFO: loaded from: classes17.dex */
    public class StateListAnimator implements RH {
        public StateListAnimator() {
        }

        @Override // o.RH
        public java.util.Set<ComponentCallbacks2C5333Nr> copydefault() {
            java.util.Set<RG> setCopydefault = RG.this.copydefault();
            java.util.HashSet hashSet = new java.util.HashSet(setCopydefault.size());
            for (RG rg : setCopydefault) {
                if (rg.KWHzl() != null) {
                    hashSet.add(rg.KWHzl());
                }
            }
            return hashSet;
        }

        public java.lang.String toString() {
            return super.toString() + "{fragment=" + RG.this + "}";
        }
    }
}
