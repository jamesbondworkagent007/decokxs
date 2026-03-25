package o;

import androidx.fragment.app.FragmentPagerAdapter;

/* JADX INFO: renamed from: o.moG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@java.lang.Deprecated
public abstract class AbstractC33000moG extends FragmentPagerAdapter {
    public final androidx.fragment.app.FragmentManager AYXKKw;
    public androidx.fragment.app.Fragment AhwBna;

    public boolean AEQbTJ() {
        return false;
    }

    public AbstractC33000moG(androidx.fragment.app.FragmentManager fragmentManager) {
        super(fragmentManager, 1);
        this.AhwBna = null;
        this.AYXKKw = fragmentManager;
    }

    public AbstractC33000moG(androidx.fragment.app.FragmentManager fragmentManager, androidx.fragment.app.Fragment fragment) {
        super(fragmentManager, 1);
        this.AhwBna = null;
        this.AYXKKw = fragmentManager;
    }

    @Override // androidx.fragment.app.FragmentPagerAdapter, androidx.viewpager.widget.PagerAdapter
    public void setPrimaryItem(@androidx.annotation.NonNull android.view.ViewGroup viewGroup, int i, @androidx.annotation.NonNull java.lang.Object obj) {
        androidx.fragment.app.Fragment fragment = (androidx.fragment.app.Fragment) obj;
        if (fragment != this.AhwBna) {
            this.AhwBna = fragment;
        }
        super.setPrimaryItem(viewGroup, i, obj);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getItemPosition(@androidx.annotation.NonNull java.lang.Object obj) {
        if (AEQbTJ()) {
            return -2;
        }
        return super.getItemPosition(obj);
    }
}
