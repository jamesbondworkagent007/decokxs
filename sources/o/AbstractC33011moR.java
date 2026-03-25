package o;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.PagerAdapter;

/* JADX INFO: renamed from: o.moR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public abstract class AbstractC33011moR extends PagerAdapter {
    public final androidx.fragment.app.FragmentManager copydefault;
    public androidx.fragment.app.FragmentTransaction AEQbTJ = null;
    public java.util.ArrayList<Fragment.SavedState> KWHzl = new java.util.ArrayList<>();
    public java.util.ArrayList<androidx.fragment.app.Fragment> OLrzqt = new java.util.ArrayList<>();
    public androidx.fragment.app.Fragment EZpvd = null;

    public abstract androidx.fragment.app.Fragment KWHzl(int i);

    public AbstractC33011moR(androidx.fragment.app.FragmentManager fragmentManager) {
        this.copydefault = fragmentManager;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void startUpdate(android.view.ViewGroup viewGroup) {
        if (viewGroup.getId() != -1) {
            return;
        }
        throw new java.lang.IllegalStateException("ViewPager with adapter " + this + " requires a view id");
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public java.lang.Object instantiateItem(android.view.ViewGroup viewGroup, int i) {
        Fragment.SavedState savedState;
        androidx.fragment.app.Fragment fragment;
        if (this.OLrzqt.size() > i && (fragment = this.OLrzqt.get(i)) != null) {
            return fragment;
        }
        if (this.AEQbTJ == null) {
            this.AEQbTJ = this.copydefault.beginTransaction();
        }
        androidx.fragment.app.Fragment fragmentKWHzl = KWHzl(i);
        if (this.KWHzl.size() > i && (savedState = this.KWHzl.get(i)) != null) {
            fragmentKWHzl.setInitialSavedState(savedState);
        }
        while (this.OLrzqt.size() <= i) {
            this.OLrzqt.add(null);
        }
        fragmentKWHzl.setMenuVisibility(false);
        fragmentKWHzl.setUserVisibleHint(false);
        this.OLrzqt.set(i, fragmentKWHzl);
        this.AEQbTJ.add(viewGroup.getId(), fragmentKWHzl);
        return fragmentKWHzl;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void destroyItem(android.view.ViewGroup viewGroup, int i, java.lang.Object obj) {
        androidx.fragment.app.Fragment fragment = (androidx.fragment.app.Fragment) obj;
        if (this.AEQbTJ == null) {
            this.AEQbTJ = this.copydefault.beginTransaction();
        }
        while (this.KWHzl.size() <= i) {
            this.KWHzl.add(null);
        }
        this.KWHzl.set(i, fragment.isAdded() ? this.copydefault.saveFragmentInstanceState(fragment) : null);
        this.OLrzqt.set(i, null);
        this.AEQbTJ.remove(fragment);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void setPrimaryItem(android.view.ViewGroup viewGroup, int i, java.lang.Object obj) {
        androidx.fragment.app.Fragment fragment = (androidx.fragment.app.Fragment) obj;
        androidx.fragment.app.Fragment fragment2 = this.EZpvd;
        if (fragment != fragment2) {
            if (fragment2 != null) {
                fragment2.setMenuVisibility(false);
                this.EZpvd.setUserVisibleHint(false);
            }
            if (fragment != null) {
                fragment.setMenuVisibility(true);
                fragment.setUserVisibleHint(true);
            }
            this.EZpvd = fragment;
        }
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void finishUpdate(android.view.ViewGroup viewGroup) {
        androidx.fragment.app.FragmentTransaction fragmentTransaction = this.AEQbTJ;
        if (fragmentTransaction != null) {
            fragmentTransaction.commitNowAllowingStateLoss();
            this.AEQbTJ = null;
        }
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public boolean isViewFromObject(android.view.View view, java.lang.Object obj) {
        return ((androidx.fragment.app.Fragment) obj).getView() == view;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public android.os.Parcelable saveState() {
        android.os.Bundle bundle;
        if (this.KWHzl.size() > 0) {
            bundle = new android.os.Bundle();
            Fragment.SavedState[] savedStateArr = new Fragment.SavedState[this.KWHzl.size()];
            this.KWHzl.toArray(savedStateArr);
            bundle.putParcelableArray("states", savedStateArr);
        } else {
            bundle = null;
        }
        for (int i = 0; i < this.OLrzqt.size(); i++) {
            androidx.fragment.app.Fragment fragment = this.OLrzqt.get(i);
            if (fragment != null && fragment.isAdded()) {
                if (bundle == null) {
                    bundle = new android.os.Bundle();
                }
                this.copydefault.putFragment(bundle, "f" + i, fragment);
            }
        }
        return bundle;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void restoreState(android.os.Parcelable parcelable, java.lang.ClassLoader classLoader) {
        if (parcelable != null) {
            android.os.Bundle bundle = (android.os.Bundle) parcelable;
            bundle.setClassLoader(classLoader);
            android.os.Parcelable[] parcelableArray = bundle.getParcelableArray("states");
            this.KWHzl.clear();
            this.OLrzqt.clear();
            if (parcelableArray != null) {
                for (android.os.Parcelable parcelable2 : parcelableArray) {
                    this.KWHzl.add((Fragment.SavedState) parcelable2);
                }
            }
            for (java.lang.String str : bundle.keySet()) {
                if (str.startsWith("f")) {
                    int i = java.lang.Integer.parseInt(str.substring(1));
                    androidx.fragment.app.Fragment fragment = this.copydefault.getFragment(bundle, str);
                    if (fragment != null) {
                        while (this.OLrzqt.size() <= i) {
                            this.OLrzqt.add(null);
                        }
                        fragment.setMenuVisibility(false);
                        this.OLrzqt.set(i, fragment);
                    }
                }
            }
        }
    }
}
