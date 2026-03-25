package o;

import com.bumptech.glide.Glide;
import java.util.Collections;

/* JADX INFO: renamed from: o.Rz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@java.lang.Deprecated
public class FragmentC5445Rz extends android.app.Fragment {
    public android.app.Fragment AEQbTJ;
    public final C5434Ro EZpvd;
    public ComponentCallbacks2C5333Nr KWHzl;
    public final RH OLrzqt;
    public final java.util.Set<FragmentC5445Rz> copydefault;
    public FragmentC5445Rz djBIcL;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C5434Ro EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ComponentCallbacks2C5333Nr OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void OLrzqt(@androidx.annotation.Nullable ComponentCallbacks2C5333Nr componentCallbacks2C5333Nr) {
        this.KWHzl = componentCallbacks2C5333Nr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public RH copydefault() {
        return this.OLrzqt;
    }

    public FragmentC5445Rz() {
        this(new C5434Ro());
    }

    public FragmentC5445Rz(@androidx.annotation.NonNull C5434Ro c5434Ro) {
        this.OLrzqt = new ActionBar();
        this.copydefault = new java.util.HashSet();
        this.EZpvd = c5434Ro;
    }

    public final void AEQbTJ(FragmentC5445Rz fragmentC5445Rz) {
        this.copydefault.add(fragmentC5445Rz);
    }

    public final void OLrzqt(FragmentC5445Rz fragmentC5445Rz) {
        this.copydefault.remove(fragmentC5445Rz);
    }

    public java.util.Set<FragmentC5445Rz> AEQbTJ() {
        if (equals(this.djBIcL)) {
            return Collections.unmodifiableSet(this.copydefault);
        }
        if (this.djBIcL == null) {
            return Collections.emptySet();
        }
        java.util.HashSet hashSet = new java.util.HashSet();
        for (FragmentC5445Rz fragmentC5445Rz : this.djBIcL.AEQbTJ()) {
            if (EZpvd(fragmentC5445Rz.getParentFragment())) {
                hashSet.add(fragmentC5445Rz);
            }
        }
        return Collections.unmodifiableSet(hashSet);
    }

    public void AEQbTJ(@androidx.annotation.Nullable android.app.Fragment fragment) {
        this.AEQbTJ = fragment;
        if (fragment == null || fragment.getActivity() == null) {
            return;
        }
        KWHzl(fragment.getActivity());
    }

    public final android.app.Fragment KWHzl() {
        android.app.Fragment parentFragment = getParentFragment();
        return parentFragment != null ? parentFragment : this.AEQbTJ;
    }

    public final boolean EZpvd(@androidx.annotation.NonNull android.app.Fragment fragment) {
        android.app.Fragment parentFragment = getParentFragment();
        while (true) {
            android.app.Fragment parentFragment2 = fragment.getParentFragment();
            if (parentFragment2 == null) {
                return false;
            }
            if (parentFragment2.equals(parentFragment)) {
                return true;
            }
            fragment = fragment.getParentFragment();
        }
    }

    public final void KWHzl(@androidx.annotation.NonNull android.app.Activity activity) {
        djBIcL();
        FragmentC5445Rz fragmentC5445RzEZpvd = Glide.OLrzqt((android.content.Context) activity).AYXKKw().EZpvd(activity);
        this.djBIcL = fragmentC5445RzEZpvd;
        if (equals(fragmentC5445RzEZpvd)) {
            return;
        }
        this.djBIcL.AEQbTJ(this);
    }

    public final void djBIcL() {
        FragmentC5445Rz fragmentC5445Rz = this.djBIcL;
        if (fragmentC5445Rz != null) {
            fragmentC5445Rz.OLrzqt(this);
            this.djBIcL = null;
        }
    }

    @Override // android.app.Fragment
    public void onAttach(android.app.Activity activity) {
        super.onAttach(activity);
        try {
            KWHzl(activity);
        } catch (java.lang.IllegalStateException unused) {
        }
    }

    @Override // android.app.Fragment
    public void onDetach() {
        super.onDetach();
        djBIcL();
    }

    @Override // android.app.Fragment
    public void onStart() {
        super.onStart();
        this.EZpvd.copydefault();
    }

    @Override // android.app.Fragment
    public void onStop() {
        super.onStop();
        this.EZpvd.AEQbTJ();
    }

    @Override // android.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.EZpvd.EZpvd();
        djBIcL();
    }

    @Override // android.app.Fragment
    public java.lang.String toString() {
        return super.toString() + "{parent=" + KWHzl() + "}";
    }

    /* JADX INFO: renamed from: o.Rz$ActionBar */
    public class ActionBar implements RH {
        public ActionBar() {
        }

        @Override // o.RH
        public java.util.Set<ComponentCallbacks2C5333Nr> copydefault() {
            java.util.Set<FragmentC5445Rz> setAEQbTJ = FragmentC5445Rz.this.AEQbTJ();
            java.util.HashSet hashSet = new java.util.HashSet(setAEQbTJ.size());
            for (FragmentC5445Rz fragmentC5445Rz : setAEQbTJ) {
                if (fragmentC5445Rz.OLrzqt() != null) {
                    hashSet.add(fragmentC5445Rz.OLrzqt());
                }
            }
            return hashSet;
        }

        public java.lang.String toString() {
            return super.toString() + "{fragment=" + FragmentC5445Rz.this + "}";
        }
    }

    @Override // android.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
    }
}
