package com.okinc.core.widget.rtlviewpager;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import java.util.HashMap;
import o.C31705mAw;

/* JADX INFO: loaded from: classes8.dex */
public class RtlViewPager extends ViewPager {
    public int getFieldNames;
    public final HashMap<ViewPager.OnPageChangeListener, Application> iwGUEr;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: Access modifiers changed from: private */
    public boolean AEQbTJ() {
        return this.getFieldNames == 1;
    }

    public RtlViewPager(Context context) {
        super(context);
        this.iwGUEr = new HashMap<>();
        this.getFieldNames = 0;
    }

    public RtlViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.iwGUEr = new HashMap<>();
        this.getFieldNames = 0;
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        int i2 = i != 1 ? 0 : 1;
        if (i2 != this.getFieldNames) {
            PagerAdapter adapter = super.getAdapter();
            int currentItem = adapter != null ? getCurrentItem() : 0;
            this.getFieldNames = i2;
            if (adapter != null) {
                adapter.notifyDataSetChanged();
                setCurrentItem(currentItem);
            }
        }
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void setAdapter(PagerAdapter pagerAdapter) {
        if (pagerAdapter != null) {
            pagerAdapter = new Activity(pagerAdapter);
        }
        super.setAdapter(pagerAdapter);
        setCurrentItem(0);
    }

    @Override // androidx.viewpager.widget.ViewPager
    public PagerAdapter getAdapter() {
        Activity activity = (Activity) super.getAdapter();
        if (activity == null) {
            return null;
        }
        return activity.copydefault();
    }

    @Override // androidx.viewpager.widget.ViewPager
    public int getCurrentItem() {
        int currentItem = super.getCurrentItem();
        return (super.getAdapter() == null || !AEQbTJ()) ? currentItem : (r1.getCount() - currentItem) - 1;
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void setCurrentItem(int i, boolean z) {
        PagerAdapter adapter = super.getAdapter();
        if (adapter != null && AEQbTJ()) {
            i = (adapter.getCount() - i) - 1;
        }
        super.setCurrentItem(i, z);
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void setCurrentItem(int i) {
        PagerAdapter adapter = super.getAdapter();
        if (adapter != null && AEQbTJ()) {
            i = (adapter.getCount() - i) - 1;
        }
        super.setCurrentItem(i);
    }

    @Override // androidx.viewpager.widget.ViewPager
    @Deprecated
    public void setOnPageChangeListener(@NonNull ViewPager.OnPageChangeListener onPageChangeListener) {
        super.setOnPageChangeListener(new Application(onPageChangeListener));
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public Parcelable onSaveInstanceState() {
        return new SavedState(super.onSaveInstanceState(), this.getFieldNames);
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        this.getFieldNames = savedState.KWHzl;
        super.onRestoreInstanceState(savedState.copydefault);
    }

    /* JADX INFO: loaded from: classes15.dex */
    public static class SavedState implements Parcelable {
        public static final Parcelable.ClassLoaderCreator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: com.okinc.core.widget.rtlviewpager.RtlViewPager.SavedState.1
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            @Override // android.os.Parcelable.Creator
            public SavedState createFromParcel(Parcel parcel) {
                return createFromParcel(parcel, (ClassLoader) null);
            }

            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;Ljava/lang/ClassLoader;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.ClassLoaderCreator
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            @Override // android.os.Parcelable.Creator
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        };
        public final int KWHzl;
        public final Parcelable copydefault;

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public SavedState(Parcelable parcelable, int i) {
            this.copydefault = parcelable;
            this.KWHzl = i;
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            this.copydefault = parcel.readParcelable(classLoader == null ? getClass().getClassLoader() : classLoader);
            this.KWHzl = parcel.readInt();
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.copydefault, i);
            parcel.writeInt(this.KWHzl);
        }
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void addOnPageChangeListener(@NonNull ViewPager.OnPageChangeListener onPageChangeListener) {
        Application application = new Application(onPageChangeListener);
        this.iwGUEr.put(onPageChangeListener, application);
        super.addOnPageChangeListener(application);
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void removeOnPageChangeListener(@NonNull ViewPager.OnPageChangeListener onPageChangeListener) {
        Application applicationRemove = this.iwGUEr.remove(onPageChangeListener);
        if (applicationRemove != null) {
            super.removeOnPageChangeListener(applicationRemove);
        }
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void clearOnPageChangeListeners() {
        super.clearOnPageChangeListeners();
        this.iwGUEr.clear();
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public void onMeasure(int i, int i2) {
        if (View.MeasureSpec.getMode(i2) == 0) {
            int i3 = 0;
            for (int i4 = 0; i4 < getChildCount(); i4++) {
                View childAt = getChildAt(i4);
                childAt.measure(i, View.MeasureSpec.makeMeasureSpec(0, 0));
                int measuredHeight = childAt.getMeasuredHeight();
                if (measuredHeight > i3) {
                    i3 = measuredHeight;
                }
            }
            i2 = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
        }
        super.onMeasure(i, i2);
    }

    public class Application implements ViewPager.OnPageChangeListener {
        public final ViewPager.OnPageChangeListener KWHzl;

        public Application(ViewPager.OnPageChangeListener onPageChangeListener) {
            this.KWHzl = onPageChangeListener;
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i, float f, int i2) {
            int width = RtlViewPager.this.getWidth();
            PagerAdapter adapter = RtlViewPager.super.getAdapter();
            if (RtlViewPager.this.AEQbTJ() && adapter != null) {
                int count = adapter.getCount();
                float f2 = width;
                int pageWidth = ((int) ((1.0f - adapter.getPageWidth(i)) * f2)) + i2;
                while (i < count && pageWidth > 0) {
                    i++;
                    pageWidth -= (int) (adapter.getPageWidth(i) * f2);
                }
                i = (count - i) - 1;
                i2 = -pageWidth;
                f = i2 / (f2 * adapter.getPageWidth(i));
            }
            this.KWHzl.onPageScrolled(i, f, i2);
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int i) {
            PagerAdapter adapter = RtlViewPager.super.getAdapter();
            if (RtlViewPager.this.AEQbTJ() && adapter != null) {
                i = (adapter.getCount() - i) - 1;
            }
            this.KWHzl.onPageSelected(i);
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i) {
            this.KWHzl.onPageScrollStateChanged(i);
        }
    }

    public class Activity extends C31705mAw {
        public Activity(@NonNull PagerAdapter pagerAdapter) {
            super(pagerAdapter);
        }

        @Override // o.C31705mAw, androidx.viewpager.widget.PagerAdapter
        public void destroyItem(@NonNull ViewGroup viewGroup, int i, @NonNull Object obj) {
            if (RtlViewPager.this.AEQbTJ()) {
                i = (getCount() - i) - 1;
            }
            super.destroyItem(viewGroup, i, obj);
        }

        @Override // o.C31705mAw, androidx.viewpager.widget.PagerAdapter
        @Deprecated
        public void destroyItem(@NonNull View view, int i, @NonNull Object obj) {
            if (RtlViewPager.this.AEQbTJ()) {
                i = (getCount() - i) - 1;
            }
            super.destroyItem(view, i, obj);
        }

        @Override // o.C31705mAw, androidx.viewpager.widget.PagerAdapter
        public int getItemPosition(@NonNull Object obj) {
            int itemPosition = super.getItemPosition(obj);
            if (!RtlViewPager.this.AEQbTJ()) {
                return itemPosition;
            }
            if (itemPosition == -1 || itemPosition == -2) {
                return -2;
            }
            return (getCount() - itemPosition) - 1;
        }

        @Override // o.C31705mAw, androidx.viewpager.widget.PagerAdapter
        public CharSequence getPageTitle(int i) {
            if (RtlViewPager.this.AEQbTJ()) {
                i = (getCount() - i) - 1;
            }
            return super.getPageTitle(i);
        }

        @Override // o.C31705mAw, androidx.viewpager.widget.PagerAdapter
        public float getPageWidth(int i) {
            if (RtlViewPager.this.AEQbTJ()) {
                i = (getCount() - i) - 1;
            }
            return super.getPageWidth(i);
        }

        @Override // o.C31705mAw, androidx.viewpager.widget.PagerAdapter
        public Object instantiateItem(@NonNull ViewGroup viewGroup, int i) {
            if (RtlViewPager.this.AEQbTJ()) {
                i = (getCount() - i) - 1;
            }
            return super.instantiateItem(viewGroup, i);
        }

        @Override // o.C31705mAw, androidx.viewpager.widget.PagerAdapter
        @Deprecated
        public Object instantiateItem(@NonNull View view, int i) {
            if (RtlViewPager.this.AEQbTJ()) {
                i = (getCount() - i) - 1;
            }
            return super.instantiateItem(view, i);
        }

        @Override // o.C31705mAw, androidx.viewpager.widget.PagerAdapter
        public void setPrimaryItem(@NonNull ViewGroup viewGroup, int i, @NonNull Object obj) {
            if (RtlViewPager.this.AEQbTJ()) {
                i = (getCount() - i) - 1;
            }
            super.setPrimaryItem(viewGroup, i, obj);
        }

        @Override // o.C31705mAw, androidx.viewpager.widget.PagerAdapter
        @Deprecated
        public void setPrimaryItem(@NonNull View view, int i, @NonNull Object obj) {
            if (RtlViewPager.this.AEQbTJ()) {
                i = (getCount() - i) - 1;
            }
            super.setPrimaryItem(view, i, obj);
        }
    }
}
