package o;

import android.view.ViewGroup;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.immomo.mls.fun.ud.view.UDViewPager;
import com.immomo.mls.fun.ui.DefaultPageIndicator;
import o.InterfaceC7383aim;
import o.InterfaceC7534ale;

/* JADX INFO: renamed from: o.alp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7545alp extends C7818aqx implements InterfaceC7534ale<UDViewPager> {
    public java.util.List<InterfaceC7534ale.Application> AEQbTJ;
    public boolean AYXKKw;
    public int AhwBna;
    public boolean AkhnZx;
    public boolean AuCTel;
    public boolean DbNXlk;
    public boolean EZpvd;
    public InterfaceC7383aim.ActionBar KWHzl;
    public final ActionBar OLrzqt;
    public final android.database.DataSetObserver copydefault;
    public int djBIcL;
    public InterfaceC7553alx fARcdN;
    public final UDViewPager fIwbmz;
    public boolean fJNWhG;
    public ViewPager.OnPageChangeListener fetchVPNInfo;
    public int gEmmrt;
    public C7825arD isConnected;
    public float valueOf;
    public float values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean AYXKKw() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public float AhwBna() {
        return this.valueOf / 1000.0f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean AkhnZx() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InterfaceC7553alx djBIcL() {
        return this.fARcdN;
    }

    public C7545alp gEmmrt() {
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean isConnected() {
        return this.AuCTel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setFrameInterval(float f) {
        this.valueOf = f * 1000.0f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setRelatedTabLayout(boolean z) {
        this.DbNXlk = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setRepeat(boolean z) {
        this.AuCTel = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setViewLifeCycleCallback(InterfaceC7383aim.ActionBar actionBar) {
        this.KWHzl = actionBar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getUserdata()Lcom/immomo/mls/fun/ud/view/UDView; */
    @Override // o.InterfaceC7383aim
    /* JADX INFO: renamed from: valueOf, reason: merged with bridge method [inline-methods] */
    public UDViewPager getUserdata() {
        return this.fIwbmz;
    }

    public C7545alp(@androidx.annotation.NonNull android.content.Context context, UDViewPager uDViewPager) {
        super(context);
        this.EZpvd = false;
        this.AuCTel = false;
        this.valueOf = 2000.0f;
        this.AkhnZx = true;
        this.fJNWhG = true;
        this.isConnected = new C7825arD();
        this.DbNXlk = false;
        this.copydefault = new android.database.DataSetObserver() { // from class: o.alp.3
            @Override // android.database.DataSetObserver
            public void onChanged() {
                if (C7545alp.this.EZpvd) {
                    C7545alp.this.OLrzqt.OLrzqt();
                    if (C7545alp.this.DbNXlk()) {
                        return;
                    }
                    C7545alp.this.OLrzqt.KWHzl();
                }
            }
        };
        this.AhwBna = getCurrentItem();
        this.fetchVPNInfo = new ViewPager.SimpleOnPageChangeListener() { // from class: o.alp.1
            public float EZpvd = -1.0f;
            public boolean copydefault = false;

            @Override // androidx.viewpager.widget.ViewPager.SimpleOnPageChangeListener, androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageScrollStateChanged(int i) {
                C7545alp.this.fIwbmz.AhwBna(i);
                if (i == 1 || i == 2) {
                    C7545alp.this.OLrzqt.OLrzqt();
                } else {
                    C7545alp.this.OLrzqt.KWHzl();
                    this.EZpvd = -1.0f;
                    C7545alp.this.values = -1.0f;
                }
                this.copydefault = false;
            }

            @Override // androidx.viewpager.widget.ViewPager.SimpleOnPageChangeListener, androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageScrolled(int i, float f, int i2) {
                C7545alp.this.EZpvd(i, f, i2);
                C7545alp.this.fIwbmz.AEQbTJ(i, f, i2);
                if (this.EZpvd == -1.0f) {
                    if (f == 0.0f) {
                        return;
                    }
                    this.EZpvd = f;
                    return;
                }
                if (C7545alp.this.AEQbTJ != null) {
                    if (f == 0.0f) {
                        this.copydefault = false;
                        if (C7545alp.this.AhwBna != i) {
                            for (InterfaceC7534ale.Application application : C7545alp.this.AEQbTJ) {
                                application.AEQbTJ(i);
                                application.OLrzqt(i);
                            }
                        }
                    } else {
                        if (this.copydefault) {
                            return;
                        }
                        if (this.EZpvd > f) {
                            this.copydefault = true;
                            java.util.Iterator it = C7545alp.this.AEQbTJ.iterator();
                            while (it.hasNext()) {
                                ((InterfaceC7534ale.Application) it.next()).AEQbTJ(i);
                            }
                        } else {
                            int count = C7545alp.this.getAdapter().getCount();
                            int i3 = i + 1;
                            if (i3 >= count) {
                                i3 = count - 1;
                            }
                            this.copydefault = true;
                            java.util.Iterator it2 = C7545alp.this.AEQbTJ.iterator();
                            while (it2.hasNext()) {
                                ((InterfaceC7534ale.Application) it2.next()).AEQbTJ(i3);
                            }
                        }
                    }
                    this.EZpvd = f;
                }
            }

            @Override // androidx.viewpager.widget.ViewPager.SimpleOnPageChangeListener, androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageSelected(int i) {
                int iEZpvd = C7545alp.this.fIwbmz.EZpvd(i);
                C7545alp.this.fIwbmz.djBIcL(iEZpvd);
                if (C7545alp.this.AEQbTJ != null) {
                    for (InterfaceC7534ale.Application application : C7545alp.this.AEQbTJ) {
                        if (!this.copydefault) {
                            application.AEQbTJ(iEZpvd);
                        }
                        application.OLrzqt(iEZpvd);
                    }
                }
                if (this.EZpvd == 0.0f) {
                    this.copydefault = false;
                }
                C7545alp.this.fIwbmz.OLrzqt(C7545alp.this.AhwBna);
                C7545alp.this.fIwbmz.AEQbTJ(iEZpvd);
                C7545alp.this.isConnected.OLrzqt(C7545alp.this.fIwbmz, C7545alp.this.AhwBna, iEZpvd, C7545alp.this.EZpvd);
                C7545alp.this.AhwBna = iEZpvd;
            }
        };
        this.AYXKKw = false;
        this.djBIcL = -1;
        this.gEmmrt = -1;
        this.values = -1.0f;
        this.fIwbmz = uDViewPager;
        setViewLifeCycleCallback(uDViewPager);
        addOnPageChangeListener(this.fetchVPNInfo);
        this.OLrzqt = new ActionBar();
    }

    public void OLrzqt() {
        super.onAttachedToWindow();
        if (this.fARcdN != null) {
            KWHzl();
        }
        InterfaceC7383aim.ActionBar actionBar = this.KWHzl;
        if (actionBar != null) {
            actionBar.copydefault();
        }
    }

    public void copydefault() {
        OLrzqt(0);
    }

    public void OLrzqt(int i) {
        if (this.AkhnZx) {
            this.fIwbmz.EZpvd(i, true);
        }
    }

    /* JADX DEBUG: Possible override for method com.okinc.core.widget.rtlviewpager.RtlViewPager.AEQbTJ()Z */
    public void AEQbTJ() {
        super.onDetachedFromWindow();
        InterfaceC7383aim.ActionBar actionBar = this.KWHzl;
        if (actionBar != null) {
            actionBar.AEQbTJ();
        }
        if (DbNXlk()) {
            this.fIwbmz.OLrzqt(0);
        }
    }

    public final boolean DbNXlk() {
        return getAdapter() == null || ((C7465akO) getAdapter()).OLrzqt() <= 1;
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        InterfaceC7383aim.ActionBar actionBar = this.KWHzl;
        if (actionBar != null) {
            actionBar.AEQbTJ();
        }
        if (DbNXlk()) {
            this.fIwbmz.OLrzqt(0);
        }
    }

    @Override // android.view.View
    public void onVisibilityChanged(@androidx.annotation.NonNull android.view.View view, int i) {
        if (i == 0) {
            this.OLrzqt.KWHzl();
        } else {
            this.OLrzqt.OLrzqt();
        }
    }

    @Override // com.okinc.core.widget.rtlviewpager.RtlViewPager, androidx.viewpager.widget.ViewPager
    public void setAdapter(PagerAdapter pagerAdapter) {
        if (getAdapter() != null) {
            getAdapter().unregisterDataSetObserver(this.copydefault);
        }
        super.setAdapter(pagerAdapter);
        if (pagerAdapter != null) {
            EZpvd();
            this.OLrzqt.KWHzl();
            pagerAdapter.registerDataSetObserver(this.copydefault);
        }
    }

    public void setAutoScroll(boolean z) {
        this.EZpvd = z;
        if (!z) {
            this.OLrzqt.OLrzqt();
        }
        if (getAdapter() != null) {
            this.OLrzqt.KWHzl();
        }
    }

    public void setPageIndicator(InterfaceC7553alx interfaceC7553alx) {
        if (interfaceC7553alx != null) {
            this.fARcdN = interfaceC7553alx;
            KWHzl();
            EZpvd();
            this.fARcdN.setCurrentItem(getCurrentItem());
            return;
        }
        InterfaceC7553alx interfaceC7553alx2 = this.fARcdN;
        if (interfaceC7553alx2 != null) {
            interfaceC7553alx2.EZpvd();
            this.fARcdN = null;
        }
    }

    public void EZpvd(InterfaceC7534ale.Application application) {
        if (this.AEQbTJ == null) {
            this.AEQbTJ = new java.util.ArrayList();
        }
        this.AEQbTJ.add(application);
    }

    public void OLrzqt(InterfaceC7534ale.Application application) {
        java.util.List<InterfaceC7534ale.Application> list = this.AEQbTJ;
        if (list != null) {
            list.remove(application);
        }
    }

    /* JADX INFO: renamed from: o.alp$ActionBar */
    public final class ActionBar extends android.os.Handler {
        public boolean copydefault;

        public ActionBar() {
            this.copydefault = false;
        }

        @Override // android.os.Handler
        public void handleMessage(android.os.Message message) {
            removeMessages(1);
            if (this.copydefault && message.what == 1) {
                if (C7545alp.this.fetchVPNInfo()) {
                    sendEmptyMessageDelayed(1, (int) C7545alp.this.valueOf);
                } else {
                    this.copydefault = false;
                }
            }
        }

        public void KWHzl() {
            if (this.copydefault || C7545alp.this.DbNXlk() || !C7545alp.this.EZpvd) {
                return;
            }
            AEQbTJ();
        }

        public void AEQbTJ() {
            this.copydefault = true;
            sendEmptyMessageDelayed(1, (int) C7545alp.this.valueOf);
        }

        public void OLrzqt() {
            this.copydefault = false;
            removeMessages(1);
        }
    }

    public void setLastPosition(int i) {
        if (i < 0 || i >= getAdapter().getCount()) {
            return;
        }
        this.AhwBna = i;
    }

    @Override // com.okinc.core.widget.rtlviewpager.RtlViewPager, androidx.viewpager.widget.ViewPager
    public void setCurrentItem(int i) {
        this.isConnected.KWHzl = false;
        super.setCurrentItem(i);
    }

    @Override // com.okinc.core.widget.rtlviewpager.RtlViewPager, androidx.viewpager.widget.ViewPager
    public void setCurrentItem(int i, boolean z) {
        this.isConnected.KWHzl = z;
        super.setCurrentItem(i, z);
    }

    public final boolean fetchVPNInfo() {
        PagerAdapter adapter = getAdapter();
        if (adapter == null) {
            return false;
        }
        int count = adapter.getCount();
        int currentItem = getCurrentItem();
        if (this.EZpvd && currentItem >= count - 1) {
            setCurrentItem(0, true);
        } else {
            setCurrentItem(currentItem + 1, true);
        }
        return true;
    }

    public final void EZpvd() {
        if (this.fARcdN == null || getAdapter() == null) {
            return;
        }
        this.fARcdN.setViewPager(this);
        KWHzl(this.fJNWhG);
    }

    public final void KWHzl() {
        android.view.View view = (android.view.View) this.fARcdN;
        if (view.getParent() != null) {
            return;
        }
        android.view.ViewParent parent = getParent();
        if (parent instanceof C7773aqE) {
            C7773aqE c7773aqE = (C7773aqE) parent;
            int iIndexOfChild = c7773aqE.indexOfChild(this);
            c7773aqE.removeView(this);
            android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(getContext());
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            frameLayout.addView(this, new ViewGroup.MarginLayoutParams(-1, -1));
            frameLayout.addView(view);
            c7773aqE.addView(frameLayout, iIndexOfChild, layoutParams);
            return;
        }
        if (parent instanceof android.view.ViewGroup) {
            ((android.view.ViewGroup) parent).addView(view);
        }
    }

    public void setScrollable(boolean z) {
        this.fJNWhG = z;
        KWHzl(z);
    }

    private void KWHzl(boolean z) {
        InterfaceC7553alx interfaceC7553alx = this.fARcdN;
        if (interfaceC7553alx instanceof DefaultPageIndicator) {
            ((DefaultPageIndicator) interfaceC7553alx).setScrollable(z);
        }
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        try {
            if (this.fJNWhG) {
                if (super.onInterceptTouchEvent(motionEvent)) {
                    return true;
                }
            }
        } catch (java.lang.IllegalArgumentException unused) {
        }
        return false;
    }

    @Override // o.C7818aqx, androidx.viewpager.widget.ViewPager, android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        try {
            if (this.fJNWhG) {
                if (super.onTouchEvent(motionEvent)) {
                    return true;
                }
            }
        } catch (java.lang.IllegalArgumentException unused) {
        }
        return false;
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public boolean canScrollHorizontally(int i) {
        if (this.fJNWhG) {
            return super.canScrollHorizontally(i);
        }
        return false;
    }

    @Override // android.view.View
    public boolean canScrollVertically(int i) {
        if (this.fJNWhG) {
            return super.canScrollVertically(i);
        }
        return false;
    }

    public void setViewPagerScroller(int i) {
        try {
            java.lang.reflect.Field declaredField = ViewPager.class.getDeclaredField("mScroller");
            declaredField.setAccessible(true);
            ViewPager.class.getDeclaredField("sInterpolator").setAccessible(true);
            C7506alC c7506alC = new C7506alC(getContext(), new android.view.animation.LinearInterpolator());
            c7506alC.KWHzl(i);
            declaredField.set(this, c7506alC);
        } catch (java.lang.Exception e) {
            pUU.copydefault("mln", android.util.Log.getStackTraceString(e));
        }
    }

    public final void EZpvd(int i, float f, int i2) {
        int i3;
        if (this.values == -1.0f) {
            this.values = i2;
            this.AYXKKw = false;
        }
        if (this.AYXKKw && this.djBIcL == i && (f == 0.0f || f == 1.0f)) {
            return;
        }
        if (f != 0.0f) {
            float f2 = this.values;
            float f3 = i2;
            if (f2 > f3) {
                f = 1.0f - f;
                i3 = i;
                i++;
            } else if (f2 < f3) {
                i3 = i + 1;
            } else {
                i = 0;
                i3 = 0;
                f = 0.0f;
            }
            if (f != 0.0f) {
                this.gEmmrt = i;
                this.fIwbmz.AEQbTJ(f, i, i3);
            }
        } else {
            this.AYXKKw = true;
            this.djBIcL = i;
            this.fIwbmz.AEQbTJ(1.0f, this.gEmmrt, i);
        }
        this.values = i2;
    }

    @Override // o.C7818aqx, o.C7774aqF, androidx.viewpager.widget.ViewPager, android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (this.fIwbmz.gEmmrt() != null) {
            this.fIwbmz.gEmmrt().OLrzqt();
        }
    }
}
