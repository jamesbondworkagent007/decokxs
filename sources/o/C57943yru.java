package o;

import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.scwang.smartrefresh.layout.constant.RefreshState;
import o.C57923yra;

/* JADX INFO: renamed from: o.yru, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public class C57943yru extends AbstractC57946yrx implements InterfaceC57933yrk {
    public float AYXKKw;
    public float AhwBna;
    public InterfaceC57935yrm AkhnZx;
    public InterfaceC57931yri DbNXlk;
    public boolean EZpvd;
    public boolean OLrzqt;
    public boolean copydefault;
    public float djBIcL;
    public int fetchVPNInfo;
    public int gEmmrt;
    public float isConnected;
    public int valueOf;
    public InterfaceC57930yrh values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C57943yru AEQbTJ(int i) {
        this.valueOf = i;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C57943yru KWHzl(float f) {
        this.AYXKKw = f;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C57943yru OLrzqt(float f) {
        this.isConnected = f;
        return this;
    }

    public C57943yru(android.content.Context context) {
        this(context, null);
    }

    public C57943yru(android.content.Context context, @androidx.annotation.Nullable android.util.AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.AhwBna = 0.0f;
        this.djBIcL = 2.5f;
        this.AYXKKw = 1.9f;
        this.isConnected = 1.0f;
        this.EZpvd = true;
        this.OLrzqt = true;
        this.copydefault = true;
        this.valueOf = 1000;
        this.AuCTelauCTel = C57940yrr.OLrzqt;
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C57923yra.StateListAnimator.DCJXGO);
        this.djBIcL = typedArrayObtainStyledAttributes.getFloat(C57923yra.StateListAnimator.QHmsKR, this.djBIcL);
        this.AYXKKw = typedArrayObtainStyledAttributes.getFloat(C57923yra.StateListAnimator.OuxcSI, this.AYXKKw);
        this.isConnected = typedArrayObtainStyledAttributes.getFloat(C57923yra.StateListAnimator.RKDWNf, this.isConnected);
        this.djBIcL = typedArrayObtainStyledAttributes.getFloat(C57923yra.StateListAnimator.OBJEWx, this.djBIcL);
        this.AYXKKw = typedArrayObtainStyledAttributes.getFloat(C57923yra.StateListAnimator.DCUTEI, this.AYXKKw);
        this.isConnected = typedArrayObtainStyledAttributes.getFloat(C57923yra.StateListAnimator.QSBOWP, this.isConnected);
        this.valueOf = typedArrayObtainStyledAttributes.getInt(C57923yra.StateListAnimator.zuWLRA, this.valueOf);
        this.EZpvd = typedArrayObtainStyledAttributes.getBoolean(C57923yra.StateListAnimator.ffGIBT, this.EZpvd);
        this.copydefault = typedArrayObtainStyledAttributes.getBoolean(C57923yra.StateListAnimator.getPostValueLengthLimit, this.copydefault);
        this.OLrzqt = typedArrayObtainStyledAttributes.getBoolean(C57923yra.StateListAnimator.ODWQjV, this.OLrzqt);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: android.view.View */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            android.view.View childAt = getChildAt(i);
            if (childAt instanceof InterfaceC57933yrk) {
                this.AkhnZx = (InterfaceC57933yrk) childAt;
                this.zsXlph = (InterfaceC57935yrm) childAt;
                bringChildToFront(childAt);
                return;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.AuCTelauCTel = C57940yrr.EZpvd;
        if (this.AkhnZx == null) {
            OLrzqt(new C57939yrq(getContext()));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.AuCTelauCTel = C57940yrr.OLrzqt;
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public void onMeasure(int i, int i2) {
        InterfaceC57935yrm interfaceC57935yrm = this.AkhnZx;
        if (interfaceC57935yrm != null) {
            if (View.MeasureSpec.getMode(i2) == Integer.MIN_VALUE) {
                interfaceC57935yrm.copydefault().measure(i, i2);
                super.setMeasuredDimension(android.view.View.resolveSize(super.getSuggestedMinimumWidth(), i), interfaceC57935yrm.copydefault().getMeasuredHeight());
                return;
            }
            super.onMeasure(i, i2);
            return;
        }
        super.onMeasure(i, i2);
    }

    @Override // o.AbstractC57946yrx
    public boolean equals(java.lang.Object obj) {
        InterfaceC57935yrm interfaceC57935yrm = this.AkhnZx;
        return (interfaceC57935yrm != null && interfaceC57935yrm.equals(obj)) || super.equals(obj);
    }

    @Override // o.AbstractC57946yrx, o.InterfaceC57935yrm
    public void EZpvd(@androidx.annotation.NonNull InterfaceC57931yri interfaceC57931yri, int i, int i2) {
        InterfaceC57935yrm interfaceC57935yrm = this.AkhnZx;
        if (interfaceC57935yrm == null) {
            return;
        }
        if (((i2 + i) * 1.0f) / i != this.djBIcL && this.gEmmrt == 0) {
            this.gEmmrt = i;
            this.AkhnZx = null;
            interfaceC57931yri.copydefault().OLrzqt(this.djBIcL);
            this.AkhnZx = interfaceC57935yrm;
        }
        if (this.DbNXlk == null && interfaceC57935yrm.KWHzl() == C57940yrr.KWHzl && !isInEditMode()) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) interfaceC57935yrm.copydefault().getLayoutParams();
            marginLayoutParams.topMargin -= i;
            interfaceC57935yrm.copydefault().setLayoutParams(marginLayoutParams);
        }
        this.gEmmrt = i;
        this.DbNXlk = interfaceC57931yri;
        interfaceC57931yri.copydefault(this.valueOf);
        interfaceC57931yri.copydefault(this, !this.OLrzqt);
        interfaceC57935yrm.EZpvd(interfaceC57931yri, i, i2);
    }

    @Override // o.AbstractC57946yrx, o.InterfaceC57908yrL
    public void OLrzqt(@androidx.annotation.NonNull InterfaceC57934yrl interfaceC57934yrl, @androidx.annotation.NonNull RefreshState refreshState, @androidx.annotation.NonNull RefreshState refreshState2) {
        InterfaceC57935yrm interfaceC57935yrm = this.AkhnZx;
        if (interfaceC57935yrm != null) {
            if (refreshState2 == RefreshState.ReleaseToRefresh && !this.copydefault) {
                refreshState2 = RefreshState.PullDownToRefresh;
            }
            interfaceC57935yrm.OLrzqt(interfaceC57934yrl, refreshState, refreshState2);
            int i = AnonymousClass5.EZpvd[refreshState2.ordinal()];
            boolean z = true;
            if (i != 1) {
                if (i == 3) {
                    if (interfaceC57935yrm.copydefault() != this) {
                        interfaceC57935yrm.copydefault().animate().alpha(1.0f).setDuration(this.valueOf / 2);
                        return;
                    }
                    return;
                } else {
                    if (i == 4 && interfaceC57935yrm.copydefault().getAlpha() == 0.0f && interfaceC57935yrm.copydefault() != this) {
                        interfaceC57935yrm.copydefault().setAlpha(1.0f);
                        return;
                    }
                    return;
                }
            }
            if (interfaceC57935yrm.copydefault() != this) {
                interfaceC57935yrm.copydefault().animate().alpha(0.0f).setDuration(this.valueOf / 2);
            }
            InterfaceC57931yri interfaceC57931yri = this.DbNXlk;
            if (interfaceC57931yri != null) {
                InterfaceC57930yrh interfaceC57930yrh = this.values;
                if (interfaceC57930yrh != null && !interfaceC57930yrh.AEQbTJ(interfaceC57934yrl)) {
                    z = false;
                }
                interfaceC57931yri.KWHzl(z);
            }
        }
    }

    /* JADX INFO: renamed from: o.yru$5, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass5 {
        public static final /* synthetic */ int[] EZpvd;

        static {
            int[] iArr = new int[RefreshState.values().length];
            EZpvd = iArr;
            try {
                iArr[RefreshState.TwoLevelReleased.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                EZpvd[RefreshState.TwoLevel.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                EZpvd[RefreshState.TwoLevelFinish.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                EZpvd[RefreshState.PullDownToRefresh.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
        }
    }

    @Override // o.AbstractC57946yrx, o.InterfaceC57935yrm
    public void copydefault(boolean z, float f, int i, int i2, int i3) {
        EZpvd(i);
        InterfaceC57935yrm interfaceC57935yrm = this.AkhnZx;
        InterfaceC57931yri interfaceC57931yri = this.DbNXlk;
        if (interfaceC57935yrm != null) {
            interfaceC57935yrm.copydefault(z, f, i, i2, i3);
        }
        if (z) {
            float f2 = this.AhwBna;
            float f3 = this.AYXKKw;
            if (f2 < f3 && f >= f3 && this.EZpvd) {
                interfaceC57931yri.AEQbTJ(RefreshState.ReleaseToTwoLevel);
            } else if (f2 >= f3 && f < this.isConnected) {
                interfaceC57931yri.AEQbTJ(RefreshState.PullDownToRefresh);
            } else if (f2 >= f3 && f < f3 && this.copydefault) {
                interfaceC57931yri.AEQbTJ(RefreshState.ReleaseToRefresh);
            } else if (!this.copydefault && interfaceC57931yri.copydefault().DbNXlk() != RefreshState.ReleaseToTwoLevel) {
                interfaceC57931yri.AEQbTJ(RefreshState.PullDownToRefresh);
            }
            this.AhwBna = f;
        }
    }

    public void EZpvd(int i) {
        InterfaceC57935yrm interfaceC57935yrm = this.AkhnZx;
        if (this.fetchVPNInfo == i || interfaceC57935yrm == null) {
            return;
        }
        this.fetchVPNInfo = i;
        C57940yrr c57940yrrKWHzl = interfaceC57935yrm.KWHzl();
        if (c57940yrrKWHzl == C57940yrr.KWHzl) {
            interfaceC57935yrm.copydefault().setTranslationY(i);
        } else if (c57940yrrKWHzl.AhwBna) {
            android.view.View viewCopydefault = interfaceC57935yrm.copydefault();
            viewCopydefault.layout(viewCopydefault.getLeft(), viewCopydefault.getTop(), viewCopydefault.getRight(), viewCopydefault.getTop() + java.lang.Math.max(0, i));
        }
    }

    public C57943yru OLrzqt(InterfaceC57933yrk interfaceC57933yrk) {
        return OLrzqt(interfaceC57933yrk, -1, -2);
    }

    public C57943yru OLrzqt(InterfaceC57933yrk interfaceC57933yrk, int i, int i2) {
        if (interfaceC57933yrk != null) {
            if (i == 0) {
                i = -1;
            }
            if (i2 == 0) {
                i2 = -2;
            }
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i, i2);
            ViewGroup.LayoutParams layoutParams2 = interfaceC57933yrk.copydefault().getLayoutParams();
            if (layoutParams2 instanceof RelativeLayout.LayoutParams) {
                layoutParams = (RelativeLayout.LayoutParams) layoutParams2;
            }
            InterfaceC57935yrm interfaceC57935yrm = this.AkhnZx;
            if (interfaceC57935yrm != null) {
                removeView(interfaceC57935yrm.copydefault());
            }
            if (interfaceC57933yrk.KWHzl() == C57940yrr.OLrzqt) {
                addView(interfaceC57933yrk.copydefault(), 0, layoutParams);
            } else {
                addView(interfaceC57933yrk.copydefault(), getChildCount(), layoutParams);
            }
            this.AkhnZx = interfaceC57933yrk;
            this.zsXlph = interfaceC57933yrk;
        }
        return this;
    }

    public C57943yru AEQbTJ(float f) {
        if (this.djBIcL != f) {
            this.djBIcL = f;
            InterfaceC57931yri interfaceC57931yri = this.DbNXlk;
            if (interfaceC57931yri != null) {
                this.gEmmrt = 0;
                interfaceC57931yri.copydefault().OLrzqt(this.djBIcL);
            }
        }
        return this;
    }

    public C57943yru OLrzqt() {
        InterfaceC57931yri interfaceC57931yri = this.DbNXlk;
        if (interfaceC57931yri != null) {
            interfaceC57931yri.KWHzl();
        }
        return this;
    }
}
