package o;

import androidx.fragment.app.FragmentStatePagerAdapter;

/* JADX INFO: renamed from: o.moD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@java.lang.Deprecated
public abstract class AbstractC32997moD extends FragmentStatePagerAdapter {
    public final androidx.fragment.app.FragmentManager KWHzl;
    public androidx.fragment.app.Fragment copydefault;

    public boolean AEQbTJ() {
        return false;
    }

    public AbstractC32997moD(androidx.fragment.app.FragmentManager fragmentManager) {
        super(fragmentManager, 1);
        this.copydefault = null;
        this.KWHzl = fragmentManager;
    }

    @Override // androidx.fragment.app.FragmentStatePagerAdapter, androidx.viewpager.widget.PagerAdapter
    public void setPrimaryItem(@androidx.annotation.NonNull android.view.ViewGroup viewGroup, int i, @androidx.annotation.NonNull java.lang.Object obj) {
        androidx.fragment.app.Fragment fragment = (androidx.fragment.app.Fragment) obj;
        if (fragment != this.copydefault) {
            this.copydefault = fragment;
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
