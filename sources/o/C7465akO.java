package o;

import android.view.ViewGroup;
import androidx.core.widget.NestedScrollView;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.immomo.mls.fun.ud.view.UDViewPager;
import com.immomo.mls.fun.ud.view.viewpager.UDViewPagerAdapter;
import com.immomo.mls.fun.ud.view.viewpager.UDViewPagerCell;
import o.C7978aty;
import o.InterfaceC7534ale;
import org.luaj.vm2.Globals;

/* JADX INFO: renamed from: o.akO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7465akO extends PagerAdapter implements InterfaceC7534ale.Application {
    public C7978aty.Activity AhwBna;
    public UDViewPager KWHzl;
    public android.util.SparseArray<C7462akL> OLrzqt;
    public UDViewPagerAdapter djBIcL;
    public boolean AEQbTJ = true;
    public int gEmmrt = C7330ahm.fJNWhG;
    public final C7463akM EZpvd = new C7463akM();
    public final android.util.SparseArray<C7462akL> copydefault = new android.util.SparseArray<>();
    public final android.util.SparseArray<android.view.View> AYXKKw = new android.util.SparseArray<>();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static boolean AEQbTJ(java.lang.String str) {
        return (str == null || str == "NONE_REUSE_ID") ? false : true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void AEQbTJ(C7978aty.Activity activity) {
        this.AhwBna = activity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void EZpvd(boolean z) {
        this.AEQbTJ = z;
    }

    @Override // o.InterfaceC7534ale.Application
    public void OLrzqt(int i) {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void copydefault(int i) {
        this.gEmmrt = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void copydefault(UDViewPager uDViewPager) {
        this.KWHzl = uDViewPager;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public boolean isViewFromObject(android.view.View view, java.lang.Object obj) {
        return view == obj;
    }

    public C7465akO(UDViewPagerAdapter uDViewPagerAdapter) {
        this.djBIcL = uDViewPagerAdapter;
    }

    public C7462akL EZpvd(int i) {
        return this.copydefault.get(i);
    }

    public android.view.View KWHzl(int i) {
        return this.AYXKKw.get(i);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getCount() {
        if (!copydefault() || OLrzqt() <= 0) {
            return OLrzqt();
        }
        return Integer.MAX_VALUE;
    }

    public int OLrzqt() {
        int iAEQbTJ = this.djBIcL.AEQbTJ();
        C7978aty.Activity activity = this.AhwBna;
        if (activity != null) {
            activity.copydefault(iAEQbTJ);
        }
        return iAEQbTJ;
    }

    public boolean copydefault() {
        UDViewPager uDViewPager = this.KWHzl;
        return uDViewPager != null && uDViewPager.fARcdN();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getItemPosition(@androidx.annotation.NonNull java.lang.Object obj) {
        if (this.gEmmrt == 0) {
            return super.getItemPosition(obj);
        }
        int iIndexOfValue = this.AYXKKw.indexOfValue((android.view.View) obj);
        if (iIndexOfValue < 0) {
            return -2;
        }
        return this.AYXKKw.keyAt(iIndexOfValue);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void notifyDataSetChanged() {
        this.AYXKKw.clear();
        super.notifyDataSetChanged();
    }

    /* JADX DEBUG: Method merged with bridge method: instantiateItem(Landroid/view/ViewGroup;I)Ljava/lang/Object; */
    /* JADX DEBUG: Multi-variable search result rejected for r0v14, resolved type: V */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.viewpager.widget.PagerAdapter
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public android.view.View instantiateItem(android.view.ViewGroup viewGroup, int i) {
        Globals globals = this.djBIcL.getGlobals();
        if (globals == null || globals.isDestroyed()) {
            return new android.view.View(viewGroup.getContext());
        }
        if (copydefault() && OLrzqt() != 0) {
            i %= OLrzqt();
        }
        java.lang.String strKWHzl = this.djBIcL.KWHzl(i);
        C7462akL c7462akLAEQbTJ = AEQbTJ(strKWHzl) ? this.EZpvd.AEQbTJ(strKWHzl) : null;
        boolean zEZpvd = EZpvd(viewGroup, i);
        if (c7462akLAEQbTJ == null) {
            c7462akLAEQbTJ = (C7462akL) new UDViewPagerCell(globals).f_();
            copydefault(viewGroup, c7462akLAEQbTJ);
        }
        if (C7326ahi.EZpvd) {
            C7870arw.AEQbTJ("instantiateItem " + i + " " + c7462akLAEQbTJ.KWHzl() + " " + zEZpvd);
        }
        if (zEZpvd) {
            if (!c7462akLAEQbTJ.KWHzl()) {
                this.djBIcL.copydefault(c7462akLAEQbTJ.copydefault(), strKWHzl, i);
            }
            this.djBIcL.KWHzl(c7462akLAEQbTJ.copydefault(), strKWHzl, i);
        } else {
            if (this.OLrzqt == null) {
                this.OLrzqt = new android.util.SparseArray<>();
            }
            this.OLrzqt.put(i, c7462akLAEQbTJ);
        }
        c7462akLAEQbTJ.setOnClickListener(this.djBIcL.KWHzl());
        viewGroup.addView(c7462akLAEQbTJ);
        this.copydefault.put(i, c7462akLAEQbTJ);
        this.AYXKKw.put(i, c7462akLAEQbTJ);
        this.djBIcL.isConnected.DbNXlk().OLrzqt(i);
        return c7462akLAEQbTJ;
    }

    public final void copydefault(android.view.ViewGroup viewGroup, android.view.View view) {
        int i;
        ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
        if (layoutParams != null) {
            int i2 = layoutParams.width;
            if (i2 == 0) {
                i2 = -1;
            }
            int i3 = layoutParams.height;
            i = i3 != 0 ? i3 : -1;
            i = i2;
        } else {
            i = -1;
        }
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        if (layoutParams2 == null) {
            layoutParams2 = new ViewGroup.LayoutParams(i, i);
        } else {
            layoutParams2.width = i;
            layoutParams2.height = i;
        }
        view.setLayoutParams(layoutParams2);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void destroyItem(android.view.ViewGroup viewGroup, int i, java.lang.Object obj) {
        if (copydefault() && OLrzqt() != 0) {
            i %= OLrzqt();
        }
        int iOLrzqt = OLrzqt();
        boolean z = copydefault() && (iOLrzqt == 2 || iOLrzqt == 3);
        viewGroup.removeView((android.view.View) obj);
        android.util.SparseArray<C7462akL> sparseArray = this.OLrzqt;
        if (sparseArray != null && !z) {
            sparseArray.remove(i);
        }
        java.lang.String strKWHzl = this.djBIcL.KWHzl(i);
        if (AEQbTJ(strKWHzl)) {
            this.EZpvd.OLrzqt(strKWHzl, (C7462akL) obj);
        }
    }

    public final boolean EZpvd(android.view.ViewGroup viewGroup, int i) {
        return this.AEQbTJ || EZpvd(viewGroup) == i;
    }

    public final int EZpvd(android.view.ViewGroup viewGroup) {
        if (copydefault() && OLrzqt() != 0) {
            return ((ViewPager) viewGroup).getCurrentItem() % OLrzqt();
        }
        return ((ViewPager) viewGroup).getCurrentItem();
    }

    @Override // o.InterfaceC7534ale.Application
    public void AEQbTJ(int i) {
        if (this.OLrzqt != null) {
            if (copydefault() && OLrzqt() != 0) {
                i %= OLrzqt();
            }
            C7462akL c7462akL = this.OLrzqt.get(i);
            if (c7462akL != null) {
                java.lang.String strKWHzl = this.djBIcL.KWHzl(i);
                if (!c7462akL.KWHzl()) {
                    this.djBIcL.copydefault(c7462akL.copydefault(), strKWHzl, i);
                }
                this.djBIcL.KWHzl(c7462akL.copydefault(), strKWHzl, i);
            }
            this.OLrzqt.remove(i);
        }
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public java.lang.CharSequence getPageTitle(int i) {
        return this.djBIcL.copydefault(i + 1);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void setPrimaryItem(@androidx.annotation.NonNull android.view.ViewGroup viewGroup, int i, @androidx.annotation.NonNull java.lang.Object obj) {
        super.setPrimaryItem(viewGroup, i, obj);
        android.view.ViewGroup viewGroupAEQbTJ = C7911ask.AEQbTJ(obj);
        if (viewGroupAEQbTJ instanceof NestedScrollView) {
            ((NestedScrollView) viewGroupAEQbTJ).setNestedScrollingEnabled(true);
            for (int i2 = 0; i2 < getCount(); i2++) {
                if (i2 != i) {
                    android.view.ViewGroup viewGroupAEQbTJ2 = C7911ask.AEQbTJ(EZpvd(i2));
                    if (viewGroupAEQbTJ2 instanceof NestedScrollView) {
                        ((NestedScrollView) viewGroupAEQbTJ2).setNestedScrollingEnabled(false);
                    }
                }
            }
            viewGroup.requestLayout();
        }
    }
}
