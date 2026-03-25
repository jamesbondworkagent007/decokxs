package o;

import android.view.View;
import com.okinc.components.track.bean.EventParamsList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes9.dex */
public class pAK extends C33542myS {
    public boolean AEQbTJ;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setScroll(boolean z) {
        this.AEQbTJ = z;
    }

    public pAK(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.AEQbTJ = false;
    }

    public pAK(android.content.Context context) {
        super(context);
        this.AEQbTJ = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // o.C33542myS, androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        if (this.AEQbTJ) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // o.C33542myS, androidx.viewpager.widget.ViewPager, android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        if (this.AEQbTJ) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public android.os.Parcelable onSaveInstanceState() {
        try {
            return super.onSaveInstanceState();
        } catch (java.lang.Exception e) {
            C32866mlf.AEQbTJ("Kline_crash_track", C32868mlh.OLrzqt.copydefault(), new Function1<EventParamsList, Unit>() { // from class: o.pAK.1
                /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
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
