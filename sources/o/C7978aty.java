package o;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.camera.video.AudioStats;
import androidx.core.internal.view.SupportMenu;
import androidx.core.util.Pools;
import androidx.core.view.InputDeviceCompat;
import androidx.core.view.ViewCompat;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import java.lang.ref.WeakReference;
import o.C7343ahz;

/* JADX INFO: renamed from: o.aty, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@ViewPager.DecorView
public class C7978aty extends C7814aqt {
    public StateListAnimator AYXKKw;
    public TaskDescription AhwBna;
    public android.database.DataSetObserver AkhnZx;
    public final int AuCTel;
    public int AuCTelauCTel;
    public int AubY;
    public float AwvSrB;
    public float AxsJAY;
    public int DTwDnp;
    public Fragment DbNXlk;
    public final java.util.ArrayList<Dialog> ORxRYg;
    public final Pools.Pool<AssistContent> OcIXYQ;
    public ViewPager QKVWgx;
    public int djBIcL;
    public final int ejfBZ;
    public final java.util.ArrayList<StateListAnimator> fARcdN;
    public StateListAnimator fIwbmz;
    public android.animation.ValueAnimator fJNWhG;
    public final int fetchVPNInfo;
    public boolean gEmmrt;
    public int gHZMYf;
    public final int getFieldNames;
    public int getNewProxyInstance;
    public Dialog hDKMBd;
    public int isConnected;
    public boolean iwGUEr;
    public final PendingIntent sSMYrx;
    public Activity uzCIH;
    public InterfaceC7476akZ valueOf;
    public PagerAdapter values;
    public int wlaJM;
    public int zLjUOn;
    public int zsXlph;
    public android.content.res.ColorStateList zuBGHE;
    public static final android.view.animation.Interpolator KWHzl = new FastOutSlowInInterpolator();
    public static final Pools.Pool<Dialog> EZpvd = new Pools.SynchronizedPool(16);

    /* JADX INFO: renamed from: o.aty$ActionBar */
    public interface ActionBar {
        void KWHzl(android.graphics.Canvas canvas, int i, int i2, int i3, int i4, float f);
    }

    /* JADX INFO: renamed from: o.aty$Activity */
    public interface Activity {
        void copydefault(int i);
    }

    /* JADX INFO: renamed from: o.aty$StateListAnimator */
    public interface StateListAnimator {
        void KWHzl(Dialog dialog);

        void OLrzqt(Dialog dialog);

        void copydefault(Dialog dialog);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private int DbNXlk() {
        int i = this.AuCTel;
        if (i != -1) {
            return i;
        }
        if (this.isConnected == 0) {
            return this.ejfBZ;
        }
        return 0;
    }

    private int isConnected() {
        return 48;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean AhwBna() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int copydefault() {
        return this.zsXlph;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public PendingIntent djBIcL() {
        return this.sSMYrx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setTotalCount(int i) {
        this.DTwDnp = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setmITabLayoutScrollProgress(InterfaceC7476akZ interfaceC7476akZ) {
        this.valueOf = interfaceC7476akZ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int valueOf() {
        return this.DTwDnp;
    }

    public C7978aty(android.content.Context context) {
        this(context, null);
    }

    public C7978aty(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C7978aty(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context);
        this.ORxRYg = new java.util.ArrayList<>();
        this.zsXlph = Integer.MAX_VALUE;
        this.gEmmrt = true;
        this.fARcdN = new java.util.ArrayList<>();
        this.OcIXYQ = new Pools.SimplePool(12);
        this.DTwDnp = -1;
        setHorizontalScrollBarEnabled(false);
        PendingIntent pendingIntent = new PendingIntent(context);
        this.sSMYrx = pendingIntent;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -1);
        layoutParams.gravity = 16;
        super.addView(pendingIntent, 0, layoutParams);
        pendingIntent.setSelectedIndicatorHeight(C7865arr.copydefault(2.0f));
        pendingIntent.setSelectedIndicatorColor(0);
        this.AuCTelauCTel = 0;
        this.AubY = 0;
        this.wlaJM = 0;
        this.zLjUOn = 0;
        this.zLjUOn = C7865arr.copydefault(12.0f);
        this.AubY = C7865arr.copydefault(12.0f);
        this.AwvSrB = C7865arr.OLrzqt(14.0f);
        this.zuBGHE = OLrzqt(-1, InputDeviceCompat.SOURCE_ANY, -16776961, SupportMenu.CATEGORY_MASK);
        this.AuCTel = -1;
        this.fetchVPNInfo = C7865arr.copydefault(264.0f);
        this.getFieldNames = 0;
        this.djBIcL = 0;
        this.isConnected = 1;
        this.getNewProxyInstance = 0;
        if (getResources() != null) {
            this.AxsJAY = r6.getDimensionPixelSize(C7343ahz.Application.EZpvd);
            this.ejfBZ = C7865arr.copydefault(30.0f);
        } else {
            this.AxsJAY = C7865arr.OLrzqt(12.0f);
            this.ejfBZ = C7865arr.copydefault(30.0f);
        }
        EZpvd();
    }

    public void setStartEndPadding(float f) {
        this.zLjUOn = C7865arr.copydefault(f);
        this.AubY = C7865arr.copydefault(f);
        EZpvd();
    }

    public void setTabStripGravity(int i) {
        FrameLayout.LayoutParams layoutParams;
        PendingIntent pendingIntent = this.sSMYrx;
        if (pendingIntent == null || (layoutParams = (FrameLayout.LayoutParams) pendingIntent.getLayoutParams()) == null) {
            return;
        }
        layoutParams.gravity = i;
        this.sSMYrx.requestLayout();
    }

    public void setSelectedTabIndicatorColor(@androidx.annotation.ColorInt int i) {
        this.sSMYrx.setSelectedIndicatorColor(i);
    }

    public void setSelectedTabIndicatorHeight(int i) {
        this.sSMYrx.setSelectedIndicatorHeight(i);
    }

    public void setSelectedTabSlidingIndicator(ActionBar actionBar) {
        this.sSMYrx.setSlidingIndicator(actionBar);
    }

    public void setScrollPosition(int i, float f, boolean z) {
        setScrollPosition(i, f, z, true);
    }

    public void setScrollPosition(int i, float f, boolean z, boolean z2) {
        int iRound = java.lang.Math.round(i + f);
        if (iRound < 0 || iRound >= this.sSMYrx.getChildCount()) {
            return;
        }
        if (z2) {
            this.sSMYrx.setIndicatorPositionFromTabPosition(i, f);
        }
        android.animation.ValueAnimator valueAnimator = this.fJNWhG;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.fJNWhG.cancel();
        }
        scrollTo(AEQbTJ(i, f), 0);
        if (z) {
            copydefault(iRound);
        }
    }

    public void copydefault(@androidx.annotation.NonNull Dialog dialog) {
        KWHzl(dialog, this.ORxRYg.isEmpty());
    }

    public void KWHzl(@androidx.annotation.NonNull Dialog dialog, boolean z) {
        AEQbTJ(dialog, this.ORxRYg.size(), z);
    }

    public void AEQbTJ(@androidx.annotation.NonNull Dialog dialog, int i, boolean z) {
        if (dialog.EZpvd != this) {
            throw new java.lang.IllegalArgumentException("Tab belongs to a different TabLayout.");
        }
        AEQbTJ(dialog, i);
        EZpvd(dialog);
        if (z) {
            dialog.valueOf();
        }
    }

    public final void KWHzl(@androidx.annotation.NonNull C7934atG c7934atG) {
        Dialog dialogGEmmrt = gEmmrt();
        java.lang.CharSequence charSequence = c7934atG.copydefault;
        if (charSequence != null) {
            dialogGEmmrt.OLrzqt(charSequence);
        }
        if (!android.text.TextUtils.isEmpty(c7934atG.getContentDescription())) {
            dialogGEmmrt.copydefault(c7934atG.getContentDescription());
        }
        copydefault(dialogGEmmrt);
    }

    @java.lang.Deprecated
    public void setOnTabSelectedListener(@androidx.annotation.Nullable StateListAnimator stateListAnimator) {
        StateListAnimator stateListAnimator2 = this.fIwbmz;
        if (stateListAnimator2 != null) {
            AEQbTJ(stateListAnimator2);
        }
        this.fIwbmz = stateListAnimator;
        if (stateListAnimator != null) {
            EZpvd(stateListAnimator);
        }
    }

    public void EZpvd(@androidx.annotation.NonNull StateListAnimator stateListAnimator) {
        if (this.fARcdN.contains(stateListAnimator)) {
            return;
        }
        this.fARcdN.add(stateListAnimator);
    }

    public void AEQbTJ(@androidx.annotation.NonNull StateListAnimator stateListAnimator) {
        this.fARcdN.remove(stateListAnimator);
    }

    public Dialog gEmmrt() {
        Dialog dialogAcquire = EZpvd.acquire();
        if (dialogAcquire == null) {
            dialogAcquire = new Dialog();
        }
        dialogAcquire.EZpvd = this;
        dialogAcquire.djBIcL = AEQbTJ(dialogAcquire);
        return dialogAcquire;
    }

    public int OLrzqt() {
        return this.ORxRYg.size();
    }

    public Dialog AEQbTJ(int i) {
        if (i < 0 || i >= OLrzqt()) {
            return null;
        }
        return this.ORxRYg.get(i);
    }

    public int KWHzl() {
        Dialog dialog = this.hDKMBd;
        if (dialog != null) {
            return dialog.OLrzqt();
        }
        return -1;
    }

    public void setSelectedTabPosition(int i) {
        if (i < 0 || i >= this.ORxRYg.size()) {
            return;
        }
        valueOf(this.ORxRYg.get(i));
    }

    public void values() {
        for (int childCount = this.sSMYrx.getChildCount() - 1; childCount >= 0; childCount--) {
            OLrzqt(childCount);
        }
        java.util.Iterator<Dialog> it = this.ORxRYg.iterator();
        while (it.hasNext()) {
            Dialog next = it.next();
            it.remove();
            next.AYXKKw();
            EZpvd.release(next);
        }
        this.hDKMBd = null;
    }

    public void setTabMode(int i) {
        if (i != this.isConnected) {
            this.isConnected = i;
            EZpvd();
        }
    }

    public void setTabGravity(int i) {
        if (this.getNewProxyInstance != i) {
            this.getNewProxyInstance = i;
            EZpvd();
        }
    }

    public void setEnableScale(boolean z) {
        boolean z2 = this.gEmmrt != z;
        this.gEmmrt = z;
        if (z2) {
            fetchVPNInfo();
        }
    }

    public void setTabTextColors(@androidx.annotation.Nullable android.content.res.ColorStateList colorStateList) {
        if (this.zuBGHE != colorStateList) {
            this.zuBGHE = colorStateList;
            fetchVPNInfo();
        }
    }

    public void setTabTextColors(int i, int i2) {
        setTabTextColors(AEQbTJ(i, i2));
    }

    public void setupWithViewPager(@androidx.annotation.Nullable ViewPager viewPager) {
        setupWithViewPager(viewPager, true);
    }

    public void setupWithViewPager(@androidx.annotation.Nullable ViewPager viewPager, boolean z) {
        setupWithViewPager(viewPager, z, false);
    }

    public final void setupWithViewPager(@androidx.annotation.Nullable ViewPager viewPager, boolean z, boolean z2) {
        ViewPager viewPager2 = this.QKVWgx;
        if (viewPager2 != null) {
            Fragment fragment = this.DbNXlk;
            if (fragment != null) {
                viewPager2.removeOnPageChangeListener(fragment);
            }
            TaskDescription taskDescription = this.AhwBna;
            if (taskDescription != null) {
                this.QKVWgx.removeOnAdapterChangeListener(taskDescription);
            }
        }
        StateListAnimator stateListAnimator = this.AYXKKw;
        if (stateListAnimator != null) {
            AEQbTJ(stateListAnimator);
            this.AYXKKw = null;
        }
        if (viewPager != null) {
            this.QKVWgx = viewPager;
            PagerAdapter adapter = viewPager.getAdapter();
            if (adapter != null) {
                setPagerAdapter(adapter, z);
            }
            if (this.DbNXlk == null) {
                this.DbNXlk = new Fragment(this, this.valueOf);
            }
            this.DbNXlk.EZpvd();
            viewPager.addOnPageChangeListener(this.DbNXlk);
            VoiceInteractor voiceInteractor = new VoiceInteractor(viewPager, false);
            this.AYXKKw = voiceInteractor;
            EZpvd(voiceInteractor);
            if (this.AhwBna == null) {
                this.AhwBna = new TaskDescription();
            }
            this.AhwBna.AEQbTJ(z);
            viewPager.addOnAdapterChangeListener(this.AhwBna);
            setScrollPosition(viewPager.getCurrentItem(), 0.0f, true);
        } else {
            this.QKVWgx = null;
            setPagerAdapter(null, false);
        }
        this.iwGUEr = z2;
    }

    @java.lang.Deprecated
    public void setTabsFromPagerAdapter(@androidx.annotation.Nullable PagerAdapter pagerAdapter) {
        setPagerAdapter(pagerAdapter, false);
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return AkhnZx() > 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.QKVWgx == null) {
            android.view.ViewParent parent = getParent();
            if (parent instanceof ViewPager) {
                setupWithViewPager((ViewPager) parent, true, true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.iwGUEr) {
            setupWithViewPager(null);
            this.iwGUEr = false;
        }
        android.animation.ValueAnimator valueAnimator = this.fJNWhG;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.fJNWhG.removeAllUpdateListeners();
            this.fJNWhG = null;
        }
        PendingIntent pendingIntent = this.sSMYrx;
        if (pendingIntent == null || pendingIntent.copydefault == null) {
            return;
        }
        this.sSMYrx.copydefault.cancel();
        this.sSMYrx.copydefault.removeAllListeners();
        this.sSMYrx.copydefault.removeAllUpdateListeners();
        this.sSMYrx.copydefault = null;
    }

    private int AkhnZx() {
        int width = this.sSMYrx.getWidth();
        int width2 = getWidth();
        return java.lang.Math.max(0, ((width - width2) - getPaddingLeft()) - getPaddingRight());
    }

    public void setPagerAdapter(@androidx.annotation.Nullable PagerAdapter pagerAdapter, boolean z) {
        android.database.DataSetObserver dataSetObserver;
        PagerAdapter pagerAdapter2 = this.values;
        if (pagerAdapter2 != null && (dataSetObserver = this.AkhnZx) != null) {
            pagerAdapter2.unregisterDataSetObserver(dataSetObserver);
        }
        PagerAdapter pagerAdapter3 = this.values;
        if ((pagerAdapter3 instanceof C7465akO) && this.uzCIH != null) {
            ((C7465akO) pagerAdapter3).AEQbTJ((Activity) null);
        }
        this.values = pagerAdapter;
        if (z && pagerAdapter != null) {
            if (this.AkhnZx == null) {
                this.AkhnZx = new Application();
            }
            pagerAdapter.registerDataSetObserver(this.AkhnZx);
        }
        if (this.values instanceof C7465akO) {
            if (this.uzCIH == null) {
                this.uzCIH = new Activity() { // from class: o.aty.3
                    @Override // o.C7978aty.Activity
                    public void copydefault(int i) {
                        C7978aty.this.setTotalCount(i);
                    }
                };
            }
            ((C7465akO) this.values).AEQbTJ(this.uzCIH);
        }
        AYXKKw();
    }

    public void AYXKKw() {
        int currentItem;
        values();
        PagerAdapter pagerAdapter = this.values;
        if (pagerAdapter != null) {
            int count = pagerAdapter.getCount();
            for (int i = 0; i < count; i++) {
                copydefault(gEmmrt().OLrzqt(this.values.getPageTitle(i)));
            }
            ViewPager viewPager = this.QKVWgx;
            if (viewPager == null || count <= 0 || (currentItem = viewPager.getCurrentItem()) == KWHzl() || currentItem >= OLrzqt()) {
                return;
            }
            valueOf(AEQbTJ(currentItem));
        }
    }

    public final void fetchVPNInfo() {
        int size = this.ORxRYg.size();
        for (int i = 0; i < size; i++) {
            this.ORxRYg.get(i).AhwBna();
        }
    }

    public final AssistContent AEQbTJ(@androidx.annotation.NonNull Dialog dialog) {
        Pools.Pool<AssistContent> pool = this.OcIXYQ;
        AssistContent assistContentAcquire = pool != null ? pool.acquire() : null;
        if (assistContentAcquire == null) {
            assistContentAcquire = new AssistContent(getContext());
        }
        assistContentAcquire.setTab(dialog);
        assistContentAcquire.setFocusable(true);
        assistContentAcquire.setMinimumWidth(DbNXlk());
        return assistContentAcquire;
    }

    public final void AEQbTJ(Dialog dialog, int i) {
        dialog.copydefault(i);
        this.ORxRYg.add(i, dialog);
        int size = this.ORxRYg.size();
        while (true) {
            i++;
            if (i >= size) {
                return;
            } else {
                this.ORxRYg.get(i).copydefault(i);
            }
        }
    }

    public final void EZpvd(Dialog dialog) {
        this.sSMYrx.addView(dialog.djBIcL, dialog.OLrzqt(), AEQbTJ());
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(android.view.View view) {
        copydefault(view);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(android.view.View view, int i) {
        copydefault(view);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup, android.view.ViewManager
    public void addView(android.view.View view, ViewGroup.LayoutParams layoutParams) {
        copydefault(view);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(android.view.View view, int i, ViewGroup.LayoutParams layoutParams) {
        copydefault(view);
    }

    public final void copydefault(android.view.View view) {
        if (view instanceof C7934atG) {
            KWHzl((C7934atG) view);
            return;
        }
        throw new java.lang.IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    public final FrameLayout.LayoutParams AEQbTJ() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -1);
        copydefault(layoutParams);
        return layoutParams;
    }

    public final void copydefault(ViewGroup.LayoutParams layoutParams) {
        if (this.isConnected == 1 && this.getNewProxyInstance == 0) {
            layoutParams.width = -1;
        } else {
            layoutParams.width = -2;
        }
    }

    public int EZpvd(int i) {
        return java.lang.Math.round(getResources().getDisplayMetrics().density * i);
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int iEZpvd = EZpvd(isConnected()) + getPaddingTop() + getPaddingBottom();
        int mode = View.MeasureSpec.getMode(i2);
        if (mode == Integer.MIN_VALUE) {
            i2 = View.MeasureSpec.makeMeasureSpec(java.lang.Math.min(iEZpvd, View.MeasureSpec.getSize(i2)), 1073741824);
        } else if (mode == 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(iEZpvd, 1073741824);
        }
        int size = View.MeasureSpec.getSize(i);
        if (View.MeasureSpec.getMode(i) != 0) {
            int iEZpvd2 = this.fetchVPNInfo;
            if (iEZpvd2 <= 0) {
                iEZpvd2 = size - EZpvd(56);
            }
            this.zsXlph = iEZpvd2;
        }
        super.onMeasure(i, i2);
        if (getChildCount() == 1) {
            android.view.View childAt = getChildAt(0);
            int i3 = this.isConnected;
            if (i3 == 0) {
                if (childAt.getMeasuredWidth() >= getMeasuredWidth()) {
                    return;
                }
            } else if (i3 != 1 || childAt.getMeasuredWidth() == getMeasuredWidth()) {
                return;
            }
            childAt.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), android.view.ViewGroup.getChildMeasureSpec(i2, getPaddingTop() + getPaddingBottom(), childAt.getLayoutParams().height));
        }
    }

    public final void OLrzqt(int i) {
        AssistContent assistContent = (AssistContent) this.sSMYrx.getChildAt(i);
        this.sSMYrx.removeViewAt(i);
        if (assistContent != null) {
            assistContent.KWHzl();
            this.OcIXYQ.release(assistContent);
        }
        requestLayout();
    }

    public final void KWHzl(int i) {
        if (i == -1) {
            return;
        }
        if (getWindowToken() == null || !ViewCompat.isLaidOut(this) || this.sSMYrx.EZpvd()) {
            setScrollPosition(i, 0.0f, true);
            return;
        }
        int scrollX = getScrollX();
        int iAEQbTJ = AEQbTJ(i, 0.0f);
        if (scrollX != iAEQbTJ) {
            if (this.fJNWhG == null) {
                android.animation.ValueAnimator valueAnimator = new android.animation.ValueAnimator();
                this.fJNWhG = valueAnimator;
                valueAnimator.setInterpolator(KWHzl);
                this.fJNWhG.setDuration(300L);
                this.fJNWhG.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o.aty.2
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator2) {
                        C7978aty.this.scrollTo(((java.lang.Number) valueAnimator2.getAnimatedValue()).intValue(), 0);
                    }
                });
            }
            this.fJNWhG.setIntValues(scrollX, iAEQbTJ);
            this.fJNWhG.start();
        }
        this.sSMYrx.copydefault(i, 300);
    }

    private void copydefault(int i) {
        int childCount = this.sSMYrx.getChildCount();
        if (i < childCount) {
            int i2 = 0;
            while (i2 < childCount) {
                this.sSMYrx.getChildAt(i2).setSelected(i2 == i);
                i2++;
            }
        }
    }

    public void valueOf(Dialog dialog) {
        EZpvd(dialog, true);
    }

    public void EZpvd(Dialog dialog, boolean z) {
        Dialog dialog2 = this.hDKMBd;
        if (dialog2 == dialog) {
            if (dialog2 != null) {
                KWHzl(dialog);
                return;
            }
            return;
        }
        int iOLrzqt = dialog != null ? dialog.OLrzqt() : -1;
        if (z) {
            if ((dialog2 == null || dialog2.OLrzqt() == -1) && iOLrzqt != -1) {
                setScrollPosition(iOLrzqt, 0.0f, true);
            } else {
                KWHzl(iOLrzqt);
            }
            if (iOLrzqt != -1) {
                copydefault(iOLrzqt);
            }
        }
        if (dialog2 != null) {
            AYXKKw(dialog2);
        }
        this.hDKMBd = dialog;
        if (dialog != null) {
            OLrzqt(dialog);
        }
    }

    public final void OLrzqt(@androidx.annotation.NonNull Dialog dialog) {
        for (int size = this.fARcdN.size() - 1; size >= 0; size--) {
            this.fARcdN.get(size).OLrzqt(dialog);
        }
    }

    public final void AYXKKw(@androidx.annotation.NonNull Dialog dialog) {
        for (int size = this.fARcdN.size() - 1; size >= 0; size--) {
            this.fARcdN.get(size).copydefault(dialog);
        }
    }

    public final void KWHzl(@androidx.annotation.NonNull Dialog dialog) {
        for (int size = this.fARcdN.size() - 1; size >= 0; size--) {
            this.fARcdN.get(size).KWHzl(dialog);
        }
    }

    public final int AEQbTJ(int i, float f) {
        if (this.isConnected != 0) {
            return 0;
        }
        android.view.View childAt = this.sSMYrx.getChildAt(i);
        int i2 = i + 1;
        return ((childAt.getLeft() + ((int) ((((childAt != null ? childAt.getWidth() : 0) + ((i2 < this.sSMYrx.getChildCount() ? this.sSMYrx.getChildAt(i2) : null) != null ? r4.getWidth() : 0)) * f) * 0.5f))) + (childAt.getWidth() / 2)) - (getWidth() / 2);
    }

    public final void EZpvd() {
        ViewCompat.setPaddingRelative(this.sSMYrx, this.isConnected == 0 ? java.lang.Math.max(0, this.djBIcL - this.zLjUOn) : 0, 0, 0, 0);
        KWHzl(true);
    }

    public void KWHzl(boolean z) {
        for (int i = 0; i < this.sSMYrx.getChildCount(); i++) {
            android.view.View childAt = this.sSMYrx.getChildAt(i);
            childAt.setMinimumWidth(DbNXlk());
            copydefault(childAt.getLayoutParams());
            if (z) {
                childAt.requestLayout();
            }
        }
    }

    /* JADX INFO: renamed from: o.aty$Dialog */
    public static final class Dialog {
        public int AEQbTJ = -1;
        public java.lang.CharSequence AhwBna;
        public C7978aty EZpvd;
        public java.lang.CharSequence KWHzl;
        public FragmentManager OLrzqt;
        public android.view.View copydefault;
        public AssistContent djBIcL;
        public java.lang.Object gEmmrt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public <T extends FragmentManager> T AEQbTJ() {
            return (T) this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public void AYXKKw() {
            this.EZpvd = null;
            this.djBIcL = null;
            this.gEmmrt = null;
            this.AhwBna = null;
            this.KWHzl = null;
            this.AEQbTJ = -1;
            this.copydefault = null;
            this.OLrzqt = null;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.CharSequence EZpvd() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public android.view.View KWHzl() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int OLrzqt() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public void copydefault(int i) {
            this.AEQbTJ = i;
        }

        public Dialog OLrzqt(@androidx.annotation.Nullable FragmentManager fragmentManager) {
            if (fragmentManager == null) {
                return this;
            }
            this.OLrzqt = fragmentManager;
            this.copydefault = fragmentManager.copydefault(this.EZpvd);
            AhwBna();
            return this;
        }

        public Dialog OLrzqt(@androidx.annotation.Nullable java.lang.CharSequence charSequence) {
            this.AhwBna = charSequence;
            if (LoaderManager.class.isInstance(this.OLrzqt)) {
                ((LoaderManager) this.OLrzqt).AEQbTJ(this.AhwBna);
            } else {
                FragmentManager fragmentManager = this.OLrzqt;
                if (fragmentManager == null) {
                    OLrzqt(new LoaderManager(this.AhwBna));
                } else if (C7944atQ.class.isInstance(fragmentManager)) {
                    ((C7944atQ) this.OLrzqt).EZpvd(this.AhwBna);
                } else {
                    throw new java.lang.IllegalStateException("Can not setText with TabInfo=" + this.OLrzqt.getClass().getName());
                }
            }
            return this;
        }

        public void valueOf() {
            C7978aty c7978aty = this.EZpvd;
            if (c7978aty == null) {
                throw new java.lang.IllegalArgumentException("Tab not attached to a TabLayout");
            }
            c7978aty.valueOf(this);
        }

        public boolean copydefault() {
            C7978aty c7978aty = this.EZpvd;
            if (c7978aty != null) {
                return c7978aty.KWHzl() == this.AEQbTJ;
            }
            throw new java.lang.IllegalArgumentException("Tab not attached to a TabLayout");
        }

        public Dialog copydefault(@androidx.annotation.Nullable java.lang.CharSequence charSequence) {
            this.KWHzl = charSequence;
            AhwBna();
            return this;
        }

        public void AhwBna() {
            AssistContent assistContent = this.djBIcL;
            if (assistContent != null) {
                assistContent.AEQbTJ();
            }
        }
    }

    /* JADX INFO: renamed from: o.aty$AssistContent */
    public class AssistContent extends android.widget.FrameLayout implements View.OnLongClickListener {
        public Dialog AEQbTJ;
        public android.view.View OLrzqt;

        public AssistContent(android.content.Context context) {
            super(context);
            int i = C7978aty.this.getFieldNames;
            if (i != 0) {
                setBackgroundDrawable(AppCompatResources.getDrawable(context, i));
            }
            ViewCompat.setPaddingRelative(this, C7978aty.this.zLjUOn, C7978aty.this.wlaJM, C7978aty.this.AubY, C7978aty.this.AuCTelauCTel);
            setClickable(true);
        }

        @Override // android.view.View
        public boolean performClick() {
            boolean zPerformClick = super.performClick();
            Dialog dialog = this.AEQbTJ;
            if (dialog == null) {
                return zPerformClick;
            }
            dialog.valueOf();
            return true;
        }

        @Override // android.view.View
        public void setSelected(boolean z) {
            isSelected();
            super.setSelected(z);
            android.view.View view = this.OLrzqt;
            if (view != null) {
                view.setSelected(z);
            }
        }

        @Override // android.view.View
        public void onInitializeAccessibilityEvent(android.view.accessibility.AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setClassName(ActionBar.Tab.class.getName());
        }

        @Override // android.view.View
        public void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName(ActionBar.Tab.class.getName());
        }

        @Override // android.widget.FrameLayout, android.view.View
        public void onMeasure(int i, int i2) {
            int size = View.MeasureSpec.getSize(i);
            int mode = View.MeasureSpec.getMode(i);
            int iCopydefault = C7978aty.this.copydefault();
            if (iCopydefault > 0 && (mode == 0 || size > iCopydefault)) {
                i = View.MeasureSpec.makeMeasureSpec(C7978aty.this.zsXlph, Integer.MIN_VALUE);
            }
            super.onMeasure(i, i2);
        }

        public void setTab(@androidx.annotation.Nullable Dialog dialog) {
            if (dialog != this.AEQbTJ) {
                this.AEQbTJ = dialog;
                AEQbTJ();
            }
        }

        public void KWHzl() {
            setTab(null);
            setSelected(false);
        }

        public final void AEQbTJ() {
            Dialog dialog = this.AEQbTJ;
            android.view.View viewKWHzl = dialog != null ? dialog.KWHzl() : null;
            boolean z = false;
            if (viewKWHzl != null) {
                android.view.ViewParent parent = viewKWHzl.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((android.view.ViewGroup) parent).removeView(viewKWHzl);
                    }
                    addView(viewKWHzl, new FrameLayout.LayoutParams(-2, -2));
                }
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewKWHzl.getLayoutParams();
                layoutParams.bottomMargin = 0;
                layoutParams.gravity = 17;
                this.OLrzqt = viewKWHzl;
            } else {
                android.view.View view = this.OLrzqt;
                if (view != null) {
                    removeView(view);
                    this.OLrzqt = null;
                }
            }
            if (dialog != null && dialog.copydefault()) {
                z = true;
            }
            setSelected(z);
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(android.view.View view) {
            int[] iArr = new int[2];
            android.graphics.Rect rect = new android.graphics.Rect();
            getLocationOnScreen(iArr);
            getWindowVisibleDisplayFrame(rect);
            android.content.Context context = getContext();
            int width = getWidth();
            int height = getHeight();
            int i = iArr[1];
            int i2 = height / 2;
            int i3 = iArr[0] + (width / 2);
            if (ViewCompat.getLayoutDirection(view) == 0) {
                i3 = context.getResources().getDisplayMetrics().widthPixels - i3;
            }
            int i4 = i3;
            if (i + i2 < rect.height()) {
                C55328xhq.OLrzqt.AEQbTJ(this.AEQbTJ.EZpvd(), null, 0, 8388661, i4, (iArr[1] + height) - rect.top);
            } else {
                C55328xhq.OLrzqt.AEQbTJ(this.AEQbTJ.EZpvd(), null, 0, 81, 0, height);
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: o.aty$PendingIntent */
    public class PendingIntent extends android.view.ViewGroup {
        public int AEQbTJ;
        public int AhwBna;
        public int EZpvd;
        public int KWHzl;
        public int OLrzqt;
        public android.animation.ValueAnimator copydefault;
        public float djBIcL;
        public final android.graphics.Paint gEmmrt;
        public ActionBar valueOf;

        public PendingIntent(android.content.Context context) {
            super(context);
            this.KWHzl = -1;
            this.AhwBna = -1;
            this.OLrzqt = -1;
            this.EZpvd = -1;
            setWillNotDraw(false);
            this.gEmmrt = new android.graphics.Paint();
        }

        public void setSelectedIndicatorColor(int i) {
            if (this.gEmmrt.getColor() != i) {
                this.gEmmrt.setColor(i);
                ViewCompat.postInvalidateOnAnimation(this);
            }
        }

        public void setSelectedIndicatorHeight(int i) {
            if (this.AEQbTJ != i) {
                this.AEQbTJ = i;
                ViewCompat.postInvalidateOnAnimation(this);
            }
        }

        public void setSlidingIndicator(ActionBar actionBar) {
            if (this.valueOf != actionBar) {
                this.valueOf = actionBar;
                ViewCompat.postInvalidateOnAnimation(this);
            }
        }

        public boolean EZpvd() {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                if (getChildAt(i).getWidth() <= 0) {
                    return true;
                }
            }
            return false;
        }

        public void setIndicatorPositionFromTabPosition(int i, float f) {
            android.animation.ValueAnimator valueAnimator = this.copydefault;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.copydefault.cancel();
            }
            this.KWHzl = this.AhwBna;
            this.AhwBna = i;
            this.djBIcL = f;
            EZpvd(true);
        }

        @Override // android.view.View
        public void onMeasure(int i, int i2) {
            int size;
            if (View.MeasureSpec.getMode(i) != 1073741824) {
                super.onMeasure(i, i2);
                return;
            }
            int i3 = 0;
            if (C7978aty.this.isConnected == 1) {
                int childCount = getChildCount();
                if (childCount > 0) {
                    size = View.MeasureSpec.getSize(i) / childCount;
                } else {
                    size = View.MeasureSpec.getSize(i);
                }
                while (i3 < childCount) {
                    measureChild(getChildAt(i3), View.MeasureSpec.makeMeasureSpec(size, 1073741824), i2);
                    i3++;
                }
                super.onMeasure(i, i2);
                return;
            }
            int childCount2 = getChildCount();
            int measuredWidth = 0;
            int iMax = 0;
            while (i3 < childCount2) {
                android.view.View childAt = getChildAt(i3);
                measureChild(childAt, i, i2);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
                measuredWidth += childAt.getMeasuredWidth() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
                iMax = java.lang.Math.max(iMax, childAt.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin);
                i3++;
            }
            setMeasuredDimension(measuredWidth, iMax);
        }

        @Override // android.view.ViewGroup, android.view.View
        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
            int paddingLeft = getPaddingLeft();
            int bottom = getBottom();
            int top = getTop();
            int paddingTop = getPaddingTop();
            int paddingBottom = getPaddingBottom();
            int childCount = getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                android.view.View childAt = getChildAt(i5);
                if (childAt.getVisibility() != 8) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
                    int i6 = paddingLeft + marginLayoutParams.leftMargin;
                    int paddingTop2 = getPaddingTop() + (((((((bottom - top) - paddingTop) - paddingBottom) - measuredHeight) - marginLayoutParams.topMargin) - marginLayoutParams.bottomMargin) / 2);
                    childAt.layout(i6, paddingTop2, i6 + measuredWidth, measuredHeight + paddingTop2);
                    paddingLeft = i6 + measuredWidth + marginLayoutParams.rightMargin;
                }
            }
            android.animation.ValueAnimator valueAnimator = this.copydefault;
            if (valueAnimator == null || !valueAnimator.isRunning()) {
                EZpvd(false);
            }
        }

        public void copydefault(int i, float f) {
            Dialog dialogAEQbTJ = C7978aty.this.AEQbTJ(i);
            if (dialogAEQbTJ == null || dialogAEQbTJ.OLrzqt == null) {
                return;
            }
            dialogAEQbTJ.OLrzqt.EZpvd(dialogAEQbTJ.EZpvd, i, f);
        }

        public final void EZpvd(boolean z) {
            int left;
            int right;
            android.view.View childAt = getChildAt(this.AhwBna);
            if (childAt == null || childAt.getWidth() <= 0) {
                left = -1;
                right = -1;
            } else {
                left = childAt.getLeft();
                right = childAt.getRight();
                if (this.djBIcL > 0.0f && this.AhwBna < getChildCount() - 1) {
                    android.view.View childAt2 = getChildAt(this.AhwBna + 1);
                    float f = this.djBIcL;
                    float left2 = childAt2.getLeft();
                    float f2 = this.djBIcL;
                    left = (int) ((f * left2) + ((1.0f - f2) * left));
                    right = (int) ((f2 * childAt2.getRight()) + ((1.0f - this.djBIcL) * right));
                }
            }
            if (z) {
                int i = this.KWHzl;
                int i2 = this.AhwBna;
                if (i != i2 && i != i2 + 1) {
                    copydefault(i, 0.0f);
                }
                copydefault(this.AhwBna, java.lang.Math.abs(1.0f - this.djBIcL));
                copydefault(this.AhwBna + 1, java.lang.Math.abs(this.djBIcL));
                requestLayout();
            }
            setIndicatorPosition(left, right);
        }

        public void setIndicatorPosition(int i, int i2) {
            if (i == this.OLrzqt && i2 == this.EZpvd) {
                return;
            }
            this.OLrzqt = i;
            this.EZpvd = i2;
            ViewCompat.postInvalidateOnAnimation(this);
        }

        public void copydefault(final int i, int i2) {
            final int i3;
            final int i4;
            android.animation.ValueAnimator valueAnimator = this.copydefault;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.copydefault.cancel();
            }
            boolean z = ViewCompat.getLayoutDirection(this) == 1;
            final android.view.View childAt = getChildAt(i);
            if (childAt == null) {
                EZpvd(true);
                return;
            }
            int left = childAt.getLeft();
            int right = childAt.getRight();
            if (java.lang.Math.abs(i - this.AhwBna) <= 1) {
                int i5 = this.OLrzqt;
                i4 = this.EZpvd;
                i3 = i5;
            } else {
                int iEZpvd = C7978aty.this.EZpvd(24);
                i3 = (i >= this.AhwBna ? !z : z) ? left - iEZpvd : iEZpvd + right;
                i4 = i3;
            }
            if (i3 == left && i4 == right) {
                return;
            }
            final boolean z2 = this.AhwBna == i;
            android.animation.ValueAnimator valueAnimator2 = this.copydefault;
            if (valueAnimator2 == null) {
                valueAnimator2 = new android.animation.ValueAnimator();
                this.copydefault = valueAnimator2;
            } else {
                valueAnimator2.removeAllUpdateListeners();
                valueAnimator2.removeAllListeners();
            }
            valueAnimator2.setDuration(i2);
            valueAnimator2.setFloatValues(0.0f, 1.0f);
            final boolean z3 = z2;
            valueAnimator2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o.aty.PendingIntent.4
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator3) {
                    float animatedFraction = valueAnimator3.getAnimatedFraction();
                    PendingIntent pendingIntent = PendingIntent.this;
                    pendingIntent.setIndicatorPosition(C7978aty.this.KWHzl(i3, childAt.getLeft(), animatedFraction), C7978aty.this.KWHzl(i4, childAt.getRight(), animatedFraction));
                    if (!z3) {
                        PendingIntent pendingIntent2 = PendingIntent.this;
                        pendingIntent2.copydefault(pendingIntent2.AhwBna, 1.0f - animatedFraction);
                    }
                    PendingIntent.this.copydefault(i, animatedFraction);
                    PendingIntent.this.requestLayout();
                }
            });
            valueAnimator2.addListener(new android.animation.AnimatorListenerAdapter() { // from class: o.aty.PendingIntent.1
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(android.animation.Animator animator) {
                    if (!z2) {
                        PendingIntent pendingIntent = PendingIntent.this;
                        pendingIntent.copydefault(pendingIntent.AhwBna, 0.0f);
                        PendingIntent.this.copydefault(r4.AhwBna - 1, 0.0f);
                        PendingIntent pendingIntent2 = PendingIntent.this;
                        pendingIntent2.copydefault(pendingIntent2.AhwBna + 1, 0.0f);
                    }
                    PendingIntent.this.copydefault(i, 1.0f);
                    PendingIntent.this.requestLayout();
                    PendingIntent pendingIntent3 = PendingIntent.this;
                    pendingIntent3.KWHzl = pendingIntent3.AhwBna;
                    pendingIntent3.AhwBna = i;
                    pendingIntent3.djBIcL = 0.0f;
                }
            });
            valueAnimator2.start();
        }

        @Override // android.view.View
        public void draw(android.graphics.Canvas canvas) {
            int i;
            super.draw(canvas);
            int i2 = this.OLrzqt;
            if (i2 < 0 || (i = this.EZpvd) <= i2) {
                return;
            }
            ActionBar actionBar = this.valueOf;
            if (actionBar != null) {
                actionBar.KWHzl(canvas, i2, 0, i, getHeight(), this.djBIcL);
            } else {
                canvas.drawRect(i2, getHeight() - this.AEQbTJ, this.EZpvd, getHeight(), this.gEmmrt);
            }
        }
    }

    @Override // android.view.View
    public void invalidate() {
        super.invalidate();
        this.sSMYrx.invalidate();
    }

    public static android.content.res.ColorStateList AEQbTJ(int i, int i2) {
        return new android.content.res.ColorStateList(new int[][]{android.widget.HorizontalScrollView.SELECTED_STATE_SET, android.widget.HorizontalScrollView.EMPTY_STATE_SET}, new int[]{i2, i});
    }

    /* JADX DEBUG: Method merged with bridge method: generateLayoutParams(Landroid/util/AttributeSet;)Landroid/view/ViewGroup$LayoutParams; */
    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public FrameLayout.LayoutParams generateLayoutParams(android.util.AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    /* JADX INFO: renamed from: o.aty$Fragment */
    /* JADX INFO: loaded from: classes14.dex */
    public static class Fragment implements ViewPager.OnPageChangeListener {
        public final WeakReference<C7978aty> AEQbTJ;
        public int EZpvd;
        public int KWHzl;
        public float OLrzqt = -1.0f;
        public boolean copydefault = false;
        public InterfaceC7476akZ gEmmrt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public void EZpvd() {
            this.KWHzl = 0;
            this.EZpvd = 0;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i) {
            this.EZpvd = this.KWHzl;
            this.KWHzl = i;
            if (i == 0) {
                this.OLrzqt = -1.0f;
            }
        }

        public Fragment(C7978aty c7978aty, InterfaceC7476akZ interfaceC7476akZ) {
            this.AEQbTJ = new WeakReference<>(c7978aty);
            this.gEmmrt = interfaceC7476akZ;
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i, float f, int i2) {
            C7978aty c7978aty = this.AEQbTJ.get();
            if (c7978aty != null) {
                int iValueOf = c7978aty.valueOf();
                if (iValueOf != -1 && i >= iValueOf) {
                    i %= iValueOf;
                }
                int i3 = this.KWHzl;
                c7978aty.setScrollPosition(i, f, i3 != 2 || this.EZpvd == 1, (i3 == 2 && this.EZpvd == 0) ? false : true);
            }
            EZpvd(i, f, i2);
        }

        public final void EZpvd(int i, float f, int i2) {
            int i3;
            double d;
            if (this.OLrzqt == -1.0f) {
                this.OLrzqt = f;
                this.copydefault = false;
            }
            if (this.copydefault) {
                return;
            }
            if (f != 0.0f) {
                float f2 = this.OLrzqt;
                float f3 = i2;
                if (f2 > f3) {
                    d = 1.0f - f;
                    i3 = i;
                    i++;
                } else if (f2 < f3) {
                    d = f;
                    i3 = i + 1;
                } else {
                    i = 0;
                    i3 = 0;
                    d = 0.0d;
                }
                if (d >= 0.99d) {
                    d = 1.0d;
                }
                InterfaceC7476akZ interfaceC7476akZ = this.gEmmrt;
                if (interfaceC7476akZ != null && d != AudioStats.AUDIO_AMPLITUDE_NONE) {
                    interfaceC7476akZ.AEQbTJ(d, i, i3);
                }
                if (d == 1.0d) {
                    this.copydefault = true;
                }
            }
            this.OLrzqt = i2;
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int i) {
            C7978aty c7978aty = this.AEQbTJ.get();
            if (c7978aty == null || c7978aty.KWHzl() == i || i >= c7978aty.OLrzqt()) {
                return;
            }
            int i2 = this.KWHzl;
            c7978aty.EZpvd(c7978aty.AEQbTJ(i), i2 == 0 || (i2 == 2 && this.EZpvd == 0));
        }
    }

    /* JADX INFO: renamed from: o.aty$VoiceInteractor */
    /* JADX INFO: loaded from: classes14.dex */
    public static class VoiceInteractor implements StateListAnimator {
        public boolean AEQbTJ;
        public final ViewPager OLrzqt;

        @Override // o.C7978aty.StateListAnimator
        public void KWHzl(Dialog dialog) {
        }

        @Override // o.C7978aty.StateListAnimator
        public void copydefault(Dialog dialog) {
        }

        public VoiceInteractor(ViewPager viewPager, boolean z) {
            this.OLrzqt = viewPager;
            this.AEQbTJ = z;
        }

        @Override // o.C7978aty.StateListAnimator
        public void OLrzqt(Dialog dialog) {
            if (this.OLrzqt.getCurrentItem() != dialog.AEQbTJ) {
                this.OLrzqt.setCurrentItem(dialog.OLrzqt(), this.AEQbTJ);
            }
        }
    }

    /* JADX INFO: renamed from: o.aty$Application */
    /* JADX INFO: loaded from: classes14.dex */
    public class Application extends android.database.DataSetObserver {
        public Application() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            C7978aty.this.AYXKKw();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            C7978aty.this.AYXKKw();
        }
    }

    /* JADX INFO: renamed from: o.aty$TaskDescription */
    /* JADX INFO: loaded from: classes14.dex */
    public class TaskDescription implements ViewPager.OnAdapterChangeListener {
        public boolean copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public void AEQbTJ(boolean z) {
            this.copydefault = z;
        }

        public TaskDescription() {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnAdapterChangeListener
        public void onAdapterChanged(@androidx.annotation.NonNull ViewPager viewPager, @androidx.annotation.Nullable PagerAdapter pagerAdapter, @androidx.annotation.Nullable PagerAdapter pagerAdapter2) {
            C7978aty c7978aty = C7978aty.this;
            if (c7978aty.QKVWgx == viewPager) {
                c7978aty.setPagerAdapter(pagerAdapter2, this.copydefault);
            }
        }
    }

    /* JADX INFO: renamed from: o.aty$FragmentManager */
    public static abstract class FragmentManager {
        public android.view.View KWHzl;

        public abstract void AEQbTJ(@androidx.annotation.NonNull C7978aty c7978aty, @androidx.annotation.NonNull android.view.View view, float f);

        public abstract android.view.View OLrzqt(@androidx.annotation.NonNull C7978aty c7978aty);

        public void AEQbTJ(@androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull C7978aty c7978aty) {
            textView.setGravity(17);
            textView.setTextAppearance(c7978aty.getContext(), c7978aty.gHZMYf);
            textView.setTextColor(c7978aty.zuBGHE);
        }

        public android.view.View copydefault(@androidx.annotation.NonNull C7978aty c7978aty) {
            if (this.KWHzl == null) {
                this.KWHzl = OLrzqt(c7978aty);
            }
            return this.KWHzl;
        }

        public void EZpvd(C7978aty c7978aty, int i, float f) {
            android.view.View view = this.KWHzl;
            if (view == null) {
                return;
            }
            AEQbTJ(c7978aty, view, f);
        }
    }

    /* JADX INFO: renamed from: o.aty$LoaderManager */
    public static class LoaderManager extends FragmentManager {
        public android.widget.TextView AEQbTJ;
        public java.lang.CharSequence EZpvd;

        public LoaderManager(@androidx.annotation.Nullable java.lang.CharSequence charSequence) {
            this.EZpvd = charSequence;
        }

        public void AEQbTJ(@androidx.annotation.Nullable java.lang.CharSequence charSequence) {
            this.EZpvd = charSequence;
            android.widget.TextView textView = this.AEQbTJ;
            if (textView != null) {
                textView.setText(charSequence);
            }
        }

        @Override // o.C7978aty.FragmentManager
        public void AEQbTJ(@androidx.annotation.NonNull C7978aty c7978aty, @androidx.annotation.NonNull android.view.View view, float f) {
            if (c7978aty.AhwBna()) {
                float f2 = (f * 0.6f) + 1.0f;
                ((C7938atK) view).setChildScale(f2, f2);
            }
        }

        @Override // o.C7978aty.FragmentManager
        public android.view.View OLrzqt(@androidx.annotation.NonNull C7978aty c7978aty) {
            android.widget.TextView textView = new android.widget.TextView(c7978aty.getContext());
            this.AEQbTJ = textView;
            AEQbTJ(textView, c7978aty);
            this.AEQbTJ.setText(this.EZpvd);
            return new C7938atK(this.AEQbTJ);
        }
    }

    public final int KWHzl(int i, int i2, float f) {
        return i + java.lang.Math.round(f * (i2 - i));
    }

    public final android.content.res.ColorStateList OLrzqt(int i, int i2, int i3, int i4) {
        return new android.content.res.ColorStateList(new int[][]{new int[]{android.R.attr.state_pressed, android.R.attr.state_enabled}, new int[]{android.R.attr.state_enabled, android.R.attr.state_focused}, new int[]{android.R.attr.state_enabled}, new int[]{android.R.attr.state_focused}, new int[]{android.R.attr.state_window_focused}, new int[0]}, new int[]{i2, i3, i, i3, i4, i});
    }
}
