package com.okinc.convenientbanner;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.viewpager.widget.ViewPager;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import o.C32113mPz;
import o.C32968mnb;
import o.C32970mnd;
import o.C32976mnj;
import o.InterfaceC32975mni;

/* JADX INFO: loaded from: classes7.dex */
public class ConvenientBanner<T> extends LinearLayout {
    public long AEQbTJ;
    public ArrayList<ImageView> AYXKKw;
    public C32968mnb AhwBna;
    public C32976mnj AkhnZx;
    public boolean EZpvd;
    public List<T> KWHzl;
    public ActionBar OLrzqt;
    public boolean copydefault;
    public boolean djBIcL;
    public boolean fetchVPNInfo;
    public int[] gEmmrt;
    public C32970mnd valueOf;

    /* JADX INFO: loaded from: classes15.dex */
    public enum PageIndicatorAlign {
        ALIGN_PARENT_LEFT,
        ALIGN_PARENT_RIGHT,
        CENTER_HORIZONTAL
    }

    public ConvenientBanner KWHzl(int[] iArr) {
        return this;
    }

    public void setScroll(boolean z) {
        this.AkhnZx.setScrollEnable(z);
    }

    public ConvenientBanner(Context context) {
        super(context);
        this.AYXKKw = new ArrayList<>();
        this.copydefault = false;
        this.djBIcL = true;
        this.EZpvd = true;
        EZpvd(context);
    }

    public ConvenientBanner(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.AYXKKw = new ArrayList<>();
        this.copydefault = false;
        this.djBIcL = true;
        this.EZpvd = true;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C32113mPz.PendingIntent.AxsJAY);
        this.EZpvd = typedArrayObtainStyledAttributes.getBoolean(C32113mPz.PendingIntent.AwvSrB, true);
        typedArrayObtainStyledAttributes.recycle();
        EZpvd(context);
    }

    public ConvenientBanner(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.AYXKKw = new ArrayList<>();
        this.copydefault = false;
        this.djBIcL = true;
        this.EZpvd = true;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C32113mPz.PendingIntent.AxsJAY);
        this.EZpvd = typedArrayObtainStyledAttributes.getBoolean(C32113mPz.PendingIntent.AwvSrB, true);
        typedArrayObtainStyledAttributes.recycle();
        EZpvd(context);
    }

    public final void EZpvd(Context context) {
        C32976mnj c32976mnj = (C32976mnj) LayoutInflater.from(context).inflate(C32113mPz.Fragment.AYXKKw, (ViewGroup) this, true).findViewById(C32113mPz.FragmentManager.AhwBna);
        this.AkhnZx = c32976mnj;
        c32976mnj.setOffscreenPageLimit(1);
        EZpvd();
        this.OLrzqt = new ActionBar(this);
    }

    public static class ActionBar implements Runnable {
        public final WeakReference<ConvenientBanner> EZpvd;

        public ActionBar(ConvenientBanner convenientBanner) {
            this.EZpvd = new WeakReference<>(convenientBanner);
        }

        @Override // java.lang.Runnable
        public void run() {
            ConvenientBanner convenientBanner = this.EZpvd.get();
            if (convenientBanner == null || convenientBanner.AkhnZx == null || !convenientBanner.fetchVPNInfo) {
                return;
            }
            convenientBanner.AkhnZx.setCurrentItem(convenientBanner.AkhnZx.getCurrentItem() + 1);
            convenientBanner.postDelayed(convenientBanner.OLrzqt, convenientBanner.AEQbTJ);
        }
    }

    public ConvenientBanner EZpvd(InterfaceC32975mni interfaceC32975mni, List<T> list) {
        this.KWHzl = list;
        C32970mnd c32970mnd = this.valueOf;
        if (c32970mnd != null) {
            c32970mnd.KWHzl(interfaceC32975mni);
            this.valueOf.KWHzl(list);
        } else {
            C32970mnd c32970mnd2 = new C32970mnd(interfaceC32975mni, list);
            this.valueOf = c32970mnd2;
            this.AkhnZx.setAdapter(c32970mnd2, this.EZpvd);
        }
        int[] iArr = this.gEmmrt;
        if (iArr != null) {
            KWHzl(iArr);
        }
        return this;
    }

    public ConvenientBanner AEQbTJ(long j) {
        if (this.fetchVPNInfo) {
            KWHzl();
        }
        this.copydefault = true;
        this.AEQbTJ = j;
        this.fetchVPNInfo = true;
        postDelayed(this.OLrzqt, j);
        return this;
    }

    public void KWHzl() {
        this.fetchVPNInfo = false;
        removeCallbacks(this.OLrzqt);
    }

    public final void EZpvd() {
        try {
            Field declaredField = ViewPager.class.getDeclaredField("mScroller");
            declaredField.setAccessible(true);
            C32968mnb c32968mnb = new C32968mnb(this.AkhnZx.getContext());
            this.AhwBna = c32968mnb;
            declaredField.set(this.AkhnZx, c32968mnb);
        } catch (IllegalAccessException e) {
            Log.getStackTraceString(e);
        } catch (IllegalArgumentException e2) {
            Log.getStackTraceString(e2);
        } catch (NoSuchFieldException e3) {
            Log.getStackTraceString(e3);
        }
    }

    public void setManualPageable(boolean z) {
        this.AkhnZx.setCanScroll(z);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 1 || action == 3 || action == 4) {
            if (this.copydefault) {
                AEQbTJ(this.AEQbTJ);
            }
        } else if (action == 0 && this.copydefault) {
            KWHzl();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public void setcurrentitem(int i) {
        C32976mnj c32976mnj = this.AkhnZx;
        if (c32976mnj != null) {
            c32976mnj.setCurrentItem(i);
        }
    }

    public void setScrollDuration(int i) {
        this.AhwBna.EZpvd(i);
    }

    public void setCanLoop(boolean z) {
        this.EZpvd = z;
        this.AkhnZx.setCanLoop(z);
    }
}
