package o;

import androidx.viewpager.widget.PagerAdapter;
import o.C32113mPz;

/* JADX INFO: renamed from: o.mnd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public class C32970mnd<T> extends PagerAdapter {
    public java.util.List<T> AEQbTJ;
    public InterfaceC32975mni EZpvd;
    public C32976mnj KWHzl;
    public boolean copydefault = true;
    public final int OLrzqt = 300;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void EZpvd(boolean z) {
        this.copydefault = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void KWHzl(InterfaceC32975mni interfaceC32975mni) {
        this.EZpvd = interfaceC32975mni;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void KWHzl(C32976mnj c32976mnj) {
        this.KWHzl = c32976mnj;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getItemPosition(java.lang.Object obj) {
        return -2;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public boolean isViewFromObject(android.view.View view, java.lang.Object obj) {
        return view == obj;
    }

    public int KWHzl(int i) {
        int iKWHzl = KWHzl();
        if (iKWHzl == 0) {
            return 0;
        }
        return i % iKWHzl;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getCount() {
        return this.copydefault ? KWHzl() * 300 : KWHzl();
    }

    public int KWHzl() {
        java.util.List<T> list = this.AEQbTJ;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public java.lang.Object instantiateItem(android.view.ViewGroup viewGroup, int i) {
        android.view.View viewAEQbTJ = AEQbTJ(KWHzl(i), null, viewGroup);
        viewGroup.addView(viewAEQbTJ);
        return viewAEQbTJ;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void destroyItem(android.view.ViewGroup viewGroup, int i, java.lang.Object obj) {
        viewGroup.removeView((android.view.View) obj);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void finishUpdate(android.view.ViewGroup viewGroup) {
        int currentItem = this.KWHzl.getCurrentItem();
        if (currentItem == 0) {
            currentItem = this.KWHzl.KWHzl();
        } else if (currentItem == getCount() - 1) {
            currentItem = this.KWHzl.AEQbTJ();
        }
        try {
            this.KWHzl.setCurrentItem(currentItem, false);
        } catch (java.lang.IllegalStateException unused) {
        }
    }

    public C32970mnd(InterfaceC32975mni interfaceC32975mni, java.util.List<T> list) {
        this.EZpvd = interfaceC32975mni;
        this.AEQbTJ = list;
    }

    public void KWHzl(java.util.List<T> list) {
        this.AEQbTJ = list;
        notifyDataSetChanged();
    }

    public android.view.View AEQbTJ(int i, android.view.View view, android.view.ViewGroup viewGroup) {
        android.view.View viewOLrzqt;
        InterfaceC32973mng interfaceC32973mng;
        if (view == null) {
            interfaceC32973mng = (InterfaceC32973mng) this.EZpvd.OLrzqt();
            viewOLrzqt = interfaceC32973mng.OLrzqt(viewGroup.getContext());
            viewOLrzqt.setTag(C32113mPz.FragmentManager.djBIcL, interfaceC32973mng);
        } else {
            viewOLrzqt = view;
            interfaceC32973mng = (InterfaceC32973mng) view.getTag(C32113mPz.FragmentManager.djBIcL);
        }
        java.util.List<T> list = this.AEQbTJ;
        if (list != null && !list.isEmpty()) {
            interfaceC32973mng.KWHzl(viewGroup.getContext(), i, this.AEQbTJ.get(i));
        }
        return viewOLrzqt;
    }
}
