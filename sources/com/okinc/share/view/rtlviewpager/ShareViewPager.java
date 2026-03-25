package com.okinc.share.view.rtlviewpager;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import java.util.HashMap;
import o.C49308umB;

/* JADX INFO: loaded from: classes11.dex */
public class ShareViewPager extends ViewPager {
    public int AEQbTJ;
    public Boolean EZpvd;
    public int KWHzl;
    public final HashMap<ViewPager.OnPageChangeListener, TaskDescription> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: Access modifiers changed from: private */
    public boolean copydefault() {
        return this.AEQbTJ == 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setMaxHeight(int i) {
        this.KWHzl = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setScrollable(Boolean bool) {
        this.EZpvd = bool;
    }

    public ShareViewPager(Context context) {
        super(context);
        this.copydefault = new HashMap<>();
        this.AEQbTJ = 0;
        this.KWHzl = 0;
        this.EZpvd = Boolean.TRUE;
    }

    public ShareViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.copydefault = new HashMap<>();
        this.AEQbTJ = 0;
        this.KWHzl = 0;
        this.EZpvd = Boolean.TRUE;
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.EZpvd.booleanValue()) {
            return false;
        }
        try {
            return super.onTouchEvent(motionEvent);
        } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException unused) {
            return false;
        }
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.EZpvd.booleanValue()) {
            return false;
        }
        try {
            return super.onInterceptTouchEvent(motionEvent);
        } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException unused) {
            return false;
        }
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        int i2 = i != 1 ? 0 : 1;
        if (i2 != this.AEQbTJ) {
            PagerAdapter adapter = super.getAdapter();
            int currentItem = adapter != null ? getCurrentItem() : 0;
            this.AEQbTJ = i2;
            if (adapter != null) {
                adapter.notifyDataSetChanged();
                setCurrentItem(currentItem);
            }
        }
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void setAdapter(PagerAdapter pagerAdapter) {
        if (pagerAdapter != null) {
            pagerAdapter = new ActionBar(pagerAdapter);
        }
        super.setAdapter(pagerAdapter);
        setCurrentItem(0);
    }

    @Override // androidx.viewpager.widget.ViewPager
    public PagerAdapter getAdapter() {
        ActionBar actionBar = (ActionBar) super.getAdapter();
        if (actionBar == null) {
            return null;
        }
        return actionBar.copydefault();
    }

    @Override // androidx.viewpager.widget.ViewPager
    public int getCurrentItem() {
        int currentItem = super.getCurrentItem();
        return (super.getAdapter() == null || !copydefault()) ? currentItem : (r1.getCount() - currentItem) - 1;
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void setCurrentItem(int i, boolean z) {
        PagerAdapter adapter = super.getAdapter();
        if (adapter != null && copydefault()) {
            i = (adapter.getCount() - i) - 1;
        }
        super.setCurrentItem(i, z);
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void setCurrentItem(int i) {
        PagerAdapter adapter = super.getAdapter();
        if (adapter != null && copydefault()) {
            i = (adapter.getCount() - i) - 1;
        }
        super.setCurrentItem(i);
    }

    @Override // androidx.viewpager.widget.ViewPager
    @Deprecated
    public void setOnPageChangeListener(@NonNull ViewPager.OnPageChangeListener onPageChangeListener) {
        super.setOnPageChangeListener(new TaskDescription(onPageChangeListener));
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public Parcelable onSaveInstanceState() {
        return new SavedState(super.onSaveInstanceState(), this.AEQbTJ);
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        this.AEQbTJ = savedState.EZpvd;
        super.onRestoreInstanceState(savedState.AEQbTJ);
    }

    /* JADX INFO: loaded from: classes16.dex */
    public static class SavedState implements Parcelable {
        public static final Parcelable.ClassLoaderCreator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: com.okinc.share.view.rtlviewpager.ShareViewPager.SavedState.1
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
        public final Parcelable AEQbTJ;
        public final int EZpvd;

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public SavedState(Parcelable parcelable, int i) {
            this.AEQbTJ = parcelable;
            this.EZpvd = i;
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            this.AEQbTJ = parcel.readParcelable(classLoader == null ? getClass().getClassLoader() : classLoader);
            this.EZpvd = parcel.readInt();
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.AEQbTJ, i);
            parcel.writeInt(this.EZpvd);
        }
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void addOnPageChangeListener(@NonNull ViewPager.OnPageChangeListener onPageChangeListener) {
        TaskDescription taskDescription = new TaskDescription(onPageChangeListener);
        this.copydefault.put(onPageChangeListener, taskDescription);
        super.addOnPageChangeListener(taskDescription);
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void removeOnPageChangeListener(@NonNull ViewPager.OnPageChangeListener onPageChangeListener) {
        TaskDescription taskDescriptionRemove = this.copydefault.remove(onPageChangeListener);
        if (taskDescriptionRemove != null) {
            super.removeOnPageChangeListener(taskDescriptionRemove);
        }
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void clearOnPageChangeListeners() {
        super.clearOnPageChangeListeners();
        this.copydefault.clear();
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public void onMeasure(int i, int i2) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec((View.MeasureSpec.getSize(i) - getPaddingStart()) - getPaddingEnd(), Integer.MIN_VALUE);
        int size = View.MeasureSpec.getSize(i2);
        int i3 = 0;
        for (int i4 = 0; i4 < getChildCount(); i4++) {
            View childAt = getChildAt(i4);
            childAt.measure(iMakeMeasureSpec, View.MeasureSpec.makeMeasureSpec(0, 0));
            int measuredHeight = childAt.getMeasuredHeight();
            if (measuredHeight > i3) {
                i3 = measuredHeight;
            }
        }
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(Math.min(size, i3), 1073741824));
    }

    public class TaskDescription implements ViewPager.OnPageChangeListener {
        public final ViewPager.OnPageChangeListener AEQbTJ;

        public TaskDescription(ViewPager.OnPageChangeListener onPageChangeListener) {
            this.AEQbTJ = onPageChangeListener;
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i, float f, int i2) {
            int width = ShareViewPager.this.getWidth();
            PagerAdapter adapter = ShareViewPager.super.getAdapter();
            if (ShareViewPager.this.copydefault() && adapter != null) {
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
            this.AEQbTJ.onPageScrolled(i, f, i2);
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int i) {
            PagerAdapter adapter = ShareViewPager.super.getAdapter();
            if (ShareViewPager.this.copydefault() && adapter != null) {
                i = (adapter.getCount() - i) - 1;
            }
            this.AEQbTJ.onPageSelected(i);
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i) {
            this.AEQbTJ.onPageScrollStateChanged(i);
        }
    }

    public class ActionBar extends C49308umB {
        public ActionBar(@NonNull PagerAdapter pagerAdapter) {
            super(pagerAdapter);
        }

        @Override // o.C49308umB, androidx.viewpager.widget.PagerAdapter
        public void destroyItem(@NonNull ViewGroup viewGroup, int i, @NonNull Object obj) {
            if (ShareViewPager.this.copydefault()) {
                i = (getCount() - i) - 1;
            }
            super.destroyItem(viewGroup, i, obj);
        }

        @Override // o.C49308umB, androidx.viewpager.widget.PagerAdapter
        @Deprecated
        public void destroyItem(@NonNull View view, int i, @NonNull Object obj) {
            if (ShareViewPager.this.copydefault()) {
                i = (getCount() - i) - 1;
            }
            super.destroyItem(view, i, obj);
        }

        @Override // o.C49308umB, androidx.viewpager.widget.PagerAdapter
        public int getItemPosition(@NonNull Object obj) {
            int itemPosition = super.getItemPosition(obj);
            if (!ShareViewPager.this.copydefault()) {
                return itemPosition;
            }
            if (itemPosition == -1 || itemPosition == -2) {
                return -2;
            }
            return (getCount() - itemPosition) - 1;
        }

        @Override // o.C49308umB, androidx.viewpager.widget.PagerAdapter
        public CharSequence getPageTitle(int i) {
            if (ShareViewPager.this.copydefault()) {
                i = (getCount() - i) - 1;
            }
            return super.getPageTitle(i);
        }

        @Override // o.C49308umB, androidx.viewpager.widget.PagerAdapter
        public float getPageWidth(int i) {
            if (ShareViewPager.this.copydefault()) {
                i = (getCount() - i) - 1;
            }
            return super.getPageWidth(i);
        }

        @Override // o.C49308umB, androidx.viewpager.widget.PagerAdapter
        public Object instantiateItem(@NonNull ViewGroup viewGroup, int i) {
            if (ShareViewPager.this.copydefault()) {
                i = (getCount() - i) - 1;
            }
            return super.instantiateItem(viewGroup, i);
        }

        @Override // o.C49308umB, androidx.viewpager.widget.PagerAdapter
        @Deprecated
        public Object instantiateItem(@NonNull View view, int i) {
            if (ShareViewPager.this.copydefault()) {
                i = (getCount() - i) - 1;
            }
            return super.instantiateItem(view, i);
        }

        @Override // o.C49308umB, androidx.viewpager.widget.PagerAdapter
        public void setPrimaryItem(@NonNull ViewGroup viewGroup, int i, @NonNull Object obj) {
            if (ShareViewPager.this.copydefault()) {
                i = (getCount() - i) - 1;
            }
            super.setPrimaryItem(viewGroup, i, obj);
        }

        @Override // o.C49308umB, androidx.viewpager.widget.PagerAdapter
        @Deprecated
        public void setPrimaryItem(@NonNull View view, int i, @NonNull Object obj) {
            if (ShareViewPager.this.copydefault()) {
                i = (getCount() - i) - 1;
            }
            super.setPrimaryItem(view, i, obj);
        }
    }
}
