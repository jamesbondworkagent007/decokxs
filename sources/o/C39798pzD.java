package o;

import android.view.View;
import android.widget.LinearLayout;
import com.okinc.components.track.bean.EventParamsList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: o.pzD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public class C39798pzD extends C33542myS {
    public int AEQbTJ;
    public boolean EZpvd;
    public int copydefault;

    public C39798pzD(android.content.Context context) {
        super(context);
        this.EZpvd = false;
        this.AEQbTJ = C57676yms.EZpvd(getContext(), 260.0f);
    }

    public C39798pzD(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.EZpvd = false;
        this.AEQbTJ = C57676yms.EZpvd(getContext(), 260.0f);
    }

    @Override // o.C33542myS, androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        try {
            return super.onInterceptTouchEvent(motionEvent);
        } catch (java.lang.Exception unused) {
            return false;
        }
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public void onMeasure(int i, int i2) {
        int measuredHeight;
        this.copydefault = i;
        int i3 = 0;
        if (this.EZpvd) {
            if (getChildCount() > 1) {
                i3 = this.AEQbTJ;
            }
        } else {
            int i4 = 0;
            for (int i5 = 0; i5 < getChildCount(); i5++) {
                try {
                    android.view.View childAt = getChildAt(i5);
                    childAt.measure(i, View.MeasureSpec.makeMeasureSpec(0, 0));
                    measuredHeight = childAt.getMeasuredHeight();
                } catch (java.lang.Exception e) {
                    e.printStackTrace();
                    measuredHeight = 0;
                }
                if (measuredHeight > i4) {
                    i4 = measuredHeight;
                }
            }
            i3 = i4;
        }
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(i3, 1073741824));
    }

    public void KWHzl(boolean z) {
        int measuredHeight;
        this.EZpvd = z;
        if (z) {
            if (getChildCount() > 1) {
                int i = this.AEQbTJ;
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getLayoutParams();
                if (layoutParams == null) {
                    layoutParams = new LinearLayout.LayoutParams(-1, i);
                } else {
                    layoutParams.height = i;
                }
                setLayoutParams(layoutParams);
                return;
            }
            return;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            try {
                android.view.View childAt = getChildAt(i3);
                childAt.measure(this.copydefault, View.MeasureSpec.makeMeasureSpec(0, 0));
                measuredHeight = childAt.getMeasuredHeight();
            } catch (java.lang.Exception e) {
                e.printStackTrace();
                measuredHeight = 0;
            }
            if (measuredHeight > i2) {
                i2 = measuredHeight;
            }
        }
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) getLayoutParams();
        if (layoutParams2 == null) {
            layoutParams2 = new LinearLayout.LayoutParams(-1, i2);
        } else {
            layoutParams2.height = i2;
        }
        setLayoutParams(layoutParams2);
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public android.os.Parcelable onSaveInstanceState() {
        try {
            return super.onSaveInstanceState();
        } catch (java.lang.Exception e) {
            C32866mlf.AEQbTJ("Kline_crash_track", C32868mlh.OLrzqt.copydefault(), new Function1<EventParamsList, Unit>() { // from class: o.pzD.4
                /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
                public Unit invoke(EventParamsList eventParamsList) {
                    eventParamsList.put("Kline_crash_track_page_info", getClass().getSimpleName(), false);
                    eventParamsList.put("Kline_crash_track_exception", e.toString(), false);
                    eventParamsList.put("Kline_crash_track_time", java.lang.System.currentTimeMillis() + "", false);
                    return null;
                }
            });
            return View.BaseSavedState.EMPTY_STATE;
        }
    }
}
