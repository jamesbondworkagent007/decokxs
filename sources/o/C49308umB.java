package o;

import androidx.viewpager.widget.PagerAdapter;

/* JADX INFO: renamed from: o.umB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C49308umB extends PagerAdapter {
    public final PagerAdapter copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public PagerAdapter copydefault() {
        return this.copydefault;
    }

    public C49308umB(@androidx.annotation.NonNull PagerAdapter pagerAdapter) {
        this.copydefault = pagerAdapter;
        pagerAdapter.registerDataSetObserver(new TaskDescription());
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getCount() {
        return this.copydefault.getCount();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void startUpdate(@androidx.annotation.NonNull android.view.ViewGroup viewGroup) {
        this.copydefault.startUpdate(viewGroup);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public java.lang.Object instantiateItem(@androidx.annotation.NonNull android.view.ViewGroup viewGroup, int i) {
        return this.copydefault.instantiateItem(viewGroup, i);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void destroyItem(@androidx.annotation.NonNull android.view.ViewGroup viewGroup, int i, @androidx.annotation.NonNull java.lang.Object obj) {
        this.copydefault.destroyItem(viewGroup, i, obj);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void setPrimaryItem(@androidx.annotation.NonNull android.view.ViewGroup viewGroup, int i, @androidx.annotation.NonNull java.lang.Object obj) {
        this.copydefault.setPrimaryItem(viewGroup, i, obj);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void finishUpdate(@androidx.annotation.NonNull android.view.ViewGroup viewGroup) {
        this.copydefault.finishUpdate(viewGroup);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    @java.lang.Deprecated
    public void startUpdate(@androidx.annotation.NonNull android.view.View view) {
        this.copydefault.startUpdate(view);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    @java.lang.Deprecated
    public java.lang.Object instantiateItem(@androidx.annotation.NonNull android.view.View view, int i) {
        return this.copydefault.instantiateItem(view, i);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    @java.lang.Deprecated
    public void destroyItem(@androidx.annotation.NonNull android.view.View view, int i, @androidx.annotation.NonNull java.lang.Object obj) {
        this.copydefault.destroyItem(view, i, obj);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    @java.lang.Deprecated
    public void setPrimaryItem(@androidx.annotation.NonNull android.view.View view, int i, @androidx.annotation.NonNull java.lang.Object obj) {
        this.copydefault.setPrimaryItem(view, i, obj);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    @java.lang.Deprecated
    public void finishUpdate(@androidx.annotation.NonNull android.view.View view) {
        this.copydefault.finishUpdate(view);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public boolean isViewFromObject(@androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull java.lang.Object obj) {
        return this.copydefault.isViewFromObject(view, obj);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public android.os.Parcelable saveState() {
        return this.copydefault.saveState();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void restoreState(android.os.Parcelable parcelable, java.lang.ClassLoader classLoader) {
        this.copydefault.restoreState(parcelable, classLoader);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getItemPosition(@androidx.annotation.NonNull java.lang.Object obj) {
        return this.copydefault.getItemPosition(obj);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        this.copydefault.notifyDataSetChanged();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void registerDataSetObserver(@androidx.annotation.NonNull android.database.DataSetObserver dataSetObserver) {
        this.copydefault.registerDataSetObserver(dataSetObserver);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void unregisterDataSetObserver(@androidx.annotation.NonNull android.database.DataSetObserver dataSetObserver) {
        this.copydefault.unregisterDataSetObserver(dataSetObserver);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public java.lang.CharSequence getPageTitle(int i) {
        return this.copydefault.getPageTitle(i);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public float getPageWidth(int i) {
        return this.copydefault.getPageWidth(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void OLrzqt() {
        super.notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: o.umB$TaskDescription */
    public static class TaskDescription extends android.database.DataSetObserver {
        public final C49308umB AEQbTJ;

        public TaskDescription(C49308umB c49308umB) {
            this.AEQbTJ = c49308umB;
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            C49308umB c49308umB = this.AEQbTJ;
            if (c49308umB != null) {
                c49308umB.OLrzqt();
            }
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            onChanged();
        }
    }
}
