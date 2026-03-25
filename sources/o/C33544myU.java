package o;

/* JADX INFO: renamed from: o.myU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C33544myU extends C33542myS {
    public final java.lang.String KWHzl;
    public boolean copydefault;

    @Override // o.C33542myS, androidx.viewpager.widget.ViewPager, android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setIntercept(boolean z) {
        this.copydefault = z;
    }

    public C33544myU(android.content.Context context) {
        super(context);
        this.KWHzl = "NoScrollViewPager";
    }

    public C33544myU(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.KWHzl = "NoScrollViewPager";
    }

    @Override // o.C33542myS, androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        return this.copydefault && super.onInterceptTouchEvent(motionEvent);
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void setCurrentItem(int i) {
        super.setCurrentItem(i);
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void setCurrentItem(int i, boolean z) {
        try {
            super.setCurrentItem(i, z);
        } catch (java.lang.Exception e) {
            e.toString();
        }
    }
}
