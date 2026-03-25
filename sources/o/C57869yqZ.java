package o;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import androidx.camera.video.AudioStats;
import androidx.core.view.NestedScrollingChildHelper;
import androidx.core.view.NestedScrollingParent;
import androidx.core.view.NestedScrollingParentHelper;
import androidx.core.view.ViewCompat;
import com.scwang.smartrefresh.layout.constant.RefreshState;
import o.C57923yra;

/* JADX INFO: renamed from: o.yqZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public class C57869yqZ extends android.view.ViewGroup implements InterfaceC57934yrl, NestedScrollingParent {
    public static ViewGroup.MarginLayoutParams AkhnZx = new ViewGroup.MarginLayoutParams(-1, -1);
    public static InterfaceC57924yrb DbNXlk;
    public static InterfaceC57929yrg fJNWhG;
    public static InterfaceC57926yrd values;
    public boolean AuCTel;
    public boolean AuCTelauCTel;
    public boolean AubY;
    public boolean AwvSrB;
    public boolean AxsJAY;
    public int AxsJAYaxsJAY;
    public InterfaceC57931yri AxsJAYsNCnLh;
    public float DAIeex;
    public boolean DCJXGO;
    public InterfaceC57902yrF DCUTEI;
    public android.widget.Scroller DLWbHP;
    public boolean DTwDnp;
    public boolean DXXBbs;
    public boolean DarRvM;
    public android.graphics.Paint OBJEWx;
    public int ODWQjV;
    public InterfaceC57932yrj ODXsMY;
    public boolean OFhtUX;
    public int OHqIaq;
    public int OJuSTm;
    public boolean ORxRYg;
    public boolean OcIXYQ;
    public InterfaceC57900yrD OqFWZa;
    public NestedScrollingChildHelper OuxcSI;
    public float OxVOHk;
    public int QCjLjM;
    public android.view.animation.Interpolator QHmsKR;
    public boolean QKVWgx;
    public int QKudOq;
    public boolean QOLQEE;
    public int[] QSBOWP;
    public int QSLkRj;
    public int QUSxYX;
    public int QVAiDq;
    public float QVsKAR;
    public android.view.MotionEvent QbewEr;
    public int QfsBiF;
    public int[] QkdxfA;
    public android.view.VelocityTracker QwvEab;
    public int RJOkX;
    public int RKDWNf;
    public C57938yrp RcXXUw;
    public InterfaceC57935yrm RdAHlO;
    public float RlQdEF;
    public boolean USBtdM;
    public boolean UeEOUB;
    public android.animation.ValueAnimator UlJrfe;
    public float aKErDB;
    public long accept;
    public int dHguZz;
    public int dNCPSb;
    public RefreshState dUDNAs;
    public int djSkpj;
    public InterfaceC57935yrm dmfpNf;
    public int dvKsVJ;
    public float dxcTrN;
    public boolean ejfBZ;
    public int fARcdN;
    public boolean fFgQHt;
    public java.lang.Runnable fIwbmz;
    public boolean fZBcTu;
    public boolean ffGIBT;
    public boolean finit;
    public C57938yrp flVtFt;
    public android.os.Handler fvQaOB;
    public int gGvvIC;
    public boolean gHZMYf;
    public int gasjUx;
    public boolean getFieldNames;
    public char getNewProxyInstance;
    public NestedScrollingParentHelper getPostValueLengthLimit;
    public int giSNqX;
    public boolean gkJEwt;
    public InterfaceC57903yrG gwTjWJ;
    public InterfaceC57928yrf hBpjJd;
    public boolean hDKMBd;
    public boolean hUfVAv;
    public RefreshState hrNTAI;
    public float iRxXKY;
    public float iZzfmt;
    public float iwGUEr;
    public boolean sSMYrx;
    public boolean uzCIH;
    public boolean wlaJM;
    public boolean zLjUOn;
    public boolean zsXlph;
    public boolean zuBGHE;
    public int zuWLRA;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static void setDefaultRefreshFooterCreator(@androidx.annotation.NonNull InterfaceC57924yrb interfaceC57924yrb) {
        DbNXlk = interfaceC57924yrb;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static void setDefaultRefreshHeaderCreator(@androidx.annotation.NonNull InterfaceC57926yrd interfaceC57926yrd) {
        values = interfaceC57926yrd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static void setDefaultRefreshInitializer(@androidx.annotation.NonNull InterfaceC57929yrg interfaceC57929yrg) {
        fJNWhG = interfaceC57929yrg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InterfaceC57934yrl AYXKKw(boolean z) {
        this.zsXlph = z;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InterfaceC57934yrl AhwBna(boolean z) {
        this.DCJXGO = true;
        this.zuBGHE = z;
        return this;
    }

    @Override // o.InterfaceC57934yrl
    public android.view.ViewGroup AkhnZx() {
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC57934yrl
    public RefreshState DbNXlk() {
        return this.hrNTAI;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean EZpvd(boolean z) {
        return z && !this.QKVWgx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InterfaceC57934yrl KWHzl(InterfaceC57900yrD interfaceC57900yrD) {
        this.OqFWZa = interfaceC57900yrD;
        this.zuBGHE = this.zuBGHE || !(this.DCJXGO || interfaceC57900yrD == null);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InterfaceC57934yrl KWHzl(InterfaceC57902yrF interfaceC57902yrF) {
        this.DCUTEI = interfaceC57902yrF;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InterfaceC57934yrl OLrzqt(int i) {
        this.RKDWNf = i;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InterfaceC57934yrl OLrzqt(InterfaceC57901yrE interfaceC57901yrE) {
        this.gwTjWJ = interfaceC57901yrE;
        this.OqFWZa = interfaceC57901yrE;
        this.zuBGHE = this.zuBGHE || !(this.DCJXGO || interfaceC57901yrE == null);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InterfaceC57934yrl OLrzqt(InterfaceC57903yrG interfaceC57903yrG) {
        this.gwTjWJ = interfaceC57903yrG;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InterfaceC57934yrl OLrzqt(boolean z) {
        this.hDKMBd = z;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InterfaceC57934yrl djBIcL(boolean z) {
        this.QOLQEE = z;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean isNestedScrollingEnabled() {
        return this.sSMYrx && (this.gHZMYf || this.QOLQEE || this.zuBGHE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InterfaceC57934yrl valueOf(boolean z) {
        this.AuCTelauCTel = z;
        this.DXXBbs = true;
        return this;
    }

    public C57869yqZ(android.content.Context context) {
        this(context, null);
    }

    public C57869yqZ(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.QUSxYX = 300;
        this.RKDWNf = 300;
        this.iwGUEr = 0.5f;
        this.getNewProxyInstance = 'n';
        this.QVAiDq = -1;
        this.QfsBiF = -1;
        this.AxsJAYaxsJAY = -1;
        this.dvKsVJ = -1;
        this.QOLQEE = true;
        this.zuBGHE = false;
        this.zLjUOn = true;
        this.getFieldNames = true;
        this.AuCTelauCTel = true;
        this.AubY = true;
        this.zsXlph = false;
        this.OcIXYQ = true;
        this.AwvSrB = true;
        this.gHZMYf = false;
        this.hDKMBd = true;
        this.QKVWgx = false;
        this.ORxRYg = true;
        this.DTwDnp = true;
        this.AxsJAY = true;
        this.sSMYrx = true;
        this.uzCIH = false;
        this.AuCTel = false;
        this.fZBcTu = false;
        this.fFgQHt = false;
        this.DCJXGO = false;
        this.DXXBbs = false;
        this.DarRvM = false;
        this.QSBOWP = new int[2];
        this.OuxcSI = new NestedScrollingChildHelper(this);
        this.getPostValueLengthLimit = new NestedScrollingParentHelper(this);
        C57938yrp c57938yrp = C57938yrp.gEmmrt;
        this.flVtFt = c57938yrp;
        this.RcXXUw = c57938yrp;
        this.iRxXKY = 2.5f;
        this.aKErDB = 2.5f;
        this.iZzfmt = 1.0f;
        this.dxcTrN = 1.0f;
        this.AxsJAYsNCnLh = new ActionBar();
        RefreshState refreshState = RefreshState.None;
        this.hrNTAI = refreshState;
        this.dUDNAs = refreshState;
        this.accept = 0L;
        this.giSNqX = 0;
        this.RJOkX = 0;
        this.UeEOUB = false;
        this.USBtdM = false;
        this.QbewEr = null;
        android.view.ViewConfiguration viewConfiguration = android.view.ViewConfiguration.get(context);
        this.fvQaOB = new android.os.Handler();
        this.DLWbHP = new android.widget.Scroller(context);
        this.QwvEab = android.view.VelocityTracker.obtain();
        this.dHguZz = context.getResources().getDisplayMetrics().heightPixels;
        this.QHmsKR = new InterpolatorC57905yrI(InterpolatorC57905yrI.KWHzl);
        this.QCjLjM = viewConfiguration.getScaledTouchSlop();
        this.zuWLRA = viewConfiguration.getScaledMinimumFlingVelocity();
        this.ODWQjV = viewConfiguration.getScaledMaximumFlingVelocity();
        this.djSkpj = InterpolatorC57905yrI.OLrzqt(60.0f);
        this.gGvvIC = InterpolatorC57905yrI.OLrzqt(100.0f);
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C57923yra.StateListAnimator.zuBGHE);
        if (!typedArrayObtainStyledAttributes.hasValue(C57923yra.StateListAnimator.DTwDnp)) {
            super.setClipToPadding(false);
        }
        if (!typedArrayObtainStyledAttributes.hasValue(C57923yra.StateListAnimator.QKVWgx)) {
            super.setClipChildren(false);
        }
        InterfaceC57929yrg interfaceC57929yrg = fJNWhG;
        if (interfaceC57929yrg != null) {
            interfaceC57929yrg.KWHzl(context, this);
        }
        this.iwGUEr = typedArrayObtainStyledAttributes.getFloat(C57923yra.StateListAnimator.QVAiDq, this.iwGUEr);
        this.iRxXKY = typedArrayObtainStyledAttributes.getFloat(C57923yra.StateListAnimator.QKudOq, this.iRxXKY);
        this.aKErDB = typedArrayObtainStyledAttributes.getFloat(C57923yra.StateListAnimator.iZzfmt, this.aKErDB);
        this.iZzfmt = typedArrayObtainStyledAttributes.getFloat(C57923yra.StateListAnimator.DarRvM, this.iZzfmt);
        this.dxcTrN = typedArrayObtainStyledAttributes.getFloat(C57923yra.StateListAnimator.AxsJAYsNCnLh, this.dxcTrN);
        this.QOLQEE = typedArrayObtainStyledAttributes.getBoolean(C57923yra.StateListAnimator.gGvvIC, this.QOLQEE);
        this.RKDWNf = typedArrayObtainStyledAttributes.getInt(C57923yra.StateListAnimator.OqFWZa, this.RKDWNf);
        this.zuBGHE = typedArrayObtainStyledAttributes.getBoolean(C57923yra.StateListAnimator.aKErDB, this.zuBGHE);
        this.gGvvIC = typedArrayObtainStyledAttributes.getDimensionPixelOffset(C57923yra.StateListAnimator.DAIeex, this.gGvvIC);
        this.djSkpj = typedArrayObtainStyledAttributes.getDimensionPixelOffset(C57923yra.StateListAnimator.gkJEwt, this.djSkpj);
        this.gasjUx = typedArrayObtainStyledAttributes.getDimensionPixelOffset(C57923yra.StateListAnimator.RlQdEF, this.gasjUx);
        this.dNCPSb = typedArrayObtainStyledAttributes.getDimensionPixelOffset(C57923yra.StateListAnimator.iRxXKY, this.dNCPSb);
        this.uzCIH = typedArrayObtainStyledAttributes.getBoolean(C57923yra.StateListAnimator.QbewEr, this.uzCIH);
        this.AuCTel = typedArrayObtainStyledAttributes.getBoolean(C57923yra.StateListAnimator.OcIXYQ, this.AuCTel);
        this.AuCTelauCTel = typedArrayObtainStyledAttributes.getBoolean(C57923yra.StateListAnimator.djSkpj, this.AuCTelauCTel);
        this.AubY = typedArrayObtainStyledAttributes.getBoolean(C57923yra.StateListAnimator.UeEOUB, this.AubY);
        this.OcIXYQ = typedArrayObtainStyledAttributes.getBoolean(C57923yra.StateListAnimator.dvKsVJ, this.OcIXYQ);
        this.hDKMBd = typedArrayObtainStyledAttributes.getBoolean(C57923yra.StateListAnimator.RJOkX, this.hDKMBd);
        this.AwvSrB = typedArrayObtainStyledAttributes.getBoolean(C57923yra.StateListAnimator.fFgQHt, this.AwvSrB);
        this.QKVWgx = typedArrayObtainStyledAttributes.getBoolean(C57923yra.StateListAnimator.flVtFt, this.QKVWgx);
        this.ORxRYg = typedArrayObtainStyledAttributes.getBoolean(C57923yra.StateListAnimator.fvQaOB, this.ORxRYg);
        this.DTwDnp = typedArrayObtainStyledAttributes.getBoolean(C57923yra.StateListAnimator.gasjUx, this.DTwDnp);
        this.AxsJAY = typedArrayObtainStyledAttributes.getBoolean(C57923yra.StateListAnimator.dxcTrN, this.AxsJAY);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(C57923yra.StateListAnimator.dNCPSb, this.zsXlph);
        this.zsXlph = z;
        this.zsXlph = typedArrayObtainStyledAttributes.getBoolean(C57923yra.StateListAnimator.RcXXUw, z);
        this.zLjUOn = typedArrayObtainStyledAttributes.getBoolean(C57923yra.StateListAnimator.QfsBiF, this.zLjUOn);
        this.getFieldNames = typedArrayObtainStyledAttributes.getBoolean(C57923yra.StateListAnimator.QUSxYX, this.getFieldNames);
        this.gHZMYf = typedArrayObtainStyledAttributes.getBoolean(C57923yra.StateListAnimator.fZBcTu, this.gHZMYf);
        this.QVAiDq = typedArrayObtainStyledAttributes.getResourceId(C57923yra.StateListAnimator.hUfVAv, this.QVAiDq);
        this.QfsBiF = typedArrayObtainStyledAttributes.getResourceId(C57923yra.StateListAnimator.giSNqX, this.QfsBiF);
        this.AxsJAYaxsJAY = typedArrayObtainStyledAttributes.getResourceId(C57923yra.StateListAnimator.accept, this.AxsJAYaxsJAY);
        this.dvKsVJ = typedArrayObtainStyledAttributes.getResourceId(C57923yra.StateListAnimator.AxsJAYaxsJAY, this.dvKsVJ);
        boolean z2 = typedArrayObtainStyledAttributes.getBoolean(C57923yra.StateListAnimator.finit, this.sSMYrx);
        this.sSMYrx = z2;
        this.OuxcSI.setNestedScrollingEnabled(z2);
        this.DCJXGO = this.DCJXGO || typedArrayObtainStyledAttributes.hasValue(C57923yra.StateListAnimator.aKErDB);
        this.DXXBbs = this.DXXBbs || typedArrayObtainStyledAttributes.hasValue(C57923yra.StateListAnimator.djSkpj);
        this.DarRvM = this.DarRvM || typedArrayObtainStyledAttributes.hasValue(C57923yra.StateListAnimator.UeEOUB);
        this.flVtFt = typedArrayObtainStyledAttributes.hasValue(C57923yra.StateListAnimator.DAIeex) ? C57938yrp.djBIcL : this.flVtFt;
        this.RcXXUw = typedArrayObtainStyledAttributes.hasValue(C57923yra.StateListAnimator.gkJEwt) ? C57938yrp.djBIcL : this.RcXXUw;
        int color = typedArrayObtainStyledAttributes.getColor(C57923yra.StateListAnimator.ORxRYg, 0);
        int color2 = typedArrayObtainStyledAttributes.getColor(C57923yra.StateListAnimator.DXXBbs, 0);
        if (color2 != 0) {
            if (color != 0) {
                this.QkdxfA = new int[]{color2, color};
            } else {
                this.QkdxfA = new int[]{color2};
            }
        } else if (color != 0) {
            this.QkdxfA = new int[]{0, color};
        }
        if (this.QKVWgx && !this.DCJXGO && !this.zuBGHE) {
            this.zuBGHE = true;
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v2, resolved type: android.view.View */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004d  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onFinishInflate() {
        int i;
        int i2;
        super.onFinishInflate();
        int childCount = super.getChildCount();
        if (childCount > 3) {
            throw new java.lang.RuntimeException("最多只支持3个子View，Most only support three sub view");
        }
        int i3 = 0;
        char c = 0;
        int i4 = -1;
        while (true) {
            if (i3 >= childCount) {
                break;
            }
            android.view.View childAt = super.getChildAt(i3);
            if (InterpolatorC57905yrI.OLrzqt(childAt) && (c < 2 || i3 == 1)) {
                i4 = i3;
                c = 2;
            } else if (!(childAt instanceof InterfaceC57935yrm) && c < 1) {
                c = i3 > 0 ? (char) 1 : (char) 0;
                i4 = i3;
            }
            i3++;
        }
        if (i4 >= 0) {
            this.hBpjJd = new C57941yrs(super.getChildAt(i4));
            if (i4 == 1) {
                i2 = childCount != 3 ? -1 : 2;
                i = 0;
            } else if (childCount == 2) {
                i = -1;
                i2 = 1;
            } else {
                i = -1;
                i2 = -1;
            }
        }
        for (int i5 = 0; i5 < childCount; i5++) {
            android.view.View childAt2 = super.getChildAt(i5);
            if (i5 == i || (i5 != i2 && i == -1 && this.RdAHlO == null && (childAt2 instanceof InterfaceC57933yrk))) {
                this.RdAHlO = childAt2 instanceof InterfaceC57933yrk ? (InterfaceC57933yrk) childAt2 : new C57942yrt(childAt2);
            } else if (i5 == i2 || (i2 == -1 && (childAt2 instanceof InterfaceC57927yre))) {
                this.zuBGHE = this.zuBGHE || !this.DCJXGO;
                this.dmfpNf = childAt2 instanceof InterfaceC57927yre ? (InterfaceC57927yre) childAt2 : new C57944yrv(childAt2);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00eb  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onAttachedToWindow() {
        InterfaceC57935yrm interfaceC57935yrm;
        super.onAttachedToWindow();
        boolean z = true;
        this.ejfBZ = true;
        if (!isInEditMode()) {
            if (this.RdAHlO == null) {
                InterfaceC57926yrd interfaceC57926yrd = values;
                if (interfaceC57926yrd != null) {
                    AEQbTJ(interfaceC57926yrd.KWHzl(getContext(), this));
                } else {
                    AEQbTJ(new C57936yrn(getContext()));
                }
            }
            if (this.dmfpNf == null) {
                InterfaceC57924yrb interfaceC57924yrb = DbNXlk;
                if (interfaceC57924yrb != null) {
                    OLrzqt(interfaceC57924yrb.OLrzqt(getContext(), this));
                    if (this.hBpjJd == null) {
                        int childCount = getChildCount();
                        for (int i = 0; i < childCount; i++) {
                            android.view.View childAt = getChildAt(i);
                            InterfaceC57935yrm interfaceC57935yrm2 = this.RdAHlO;
                            if ((interfaceC57935yrm2 == null || childAt != interfaceC57935yrm2.copydefault()) && ((interfaceC57935yrm = this.dmfpNf) == null || childAt != interfaceC57935yrm.copydefault())) {
                                this.hBpjJd = new C57941yrs(childAt);
                            }
                        }
                    }
                    if (this.hBpjJd == null) {
                        int iOLrzqt = InterpolatorC57905yrI.OLrzqt(20.0f);
                        android.widget.TextView textView = new android.widget.TextView(getContext());
                        textView.setTextColor(-39424);
                        textView.setGravity(17);
                        textView.setTextSize(20.0f);
                        textView.setText(C57923yra.Application.OLrzqt);
                        super.addView(textView, 0, new Application(-1, -1));
                        C57941yrs c57941yrs = new C57941yrs(textView);
                        this.hBpjJd = c57941yrs;
                        c57941yrs.EZpvd().setPadding(iOLrzqt, iOLrzqt, iOLrzqt, iOLrzqt);
                    }
                    android.view.View viewFindViewById = findViewById(this.QVAiDq);
                    android.view.View viewFindViewById2 = findViewById(this.QfsBiF);
                    this.hBpjJd.AEQbTJ(this.ODXsMY);
                    this.hBpjJd.EZpvd(this.AxsJAY);
                    this.hBpjJd.KWHzl(this.AxsJAYsNCnLh, viewFindViewById, viewFindViewById2);
                    if (this.OHqIaq != 0) {
                        EZpvd(RefreshState.None);
                        InterfaceC57928yrf interfaceC57928yrf = this.hBpjJd;
                        this.OHqIaq = 0;
                        interfaceC57928yrf.KWHzl(0, this.AxsJAYaxsJAY, this.dvKsVJ);
                    }
                } else {
                    z = this.zuBGHE;
                    OLrzqt(new C57937yro(getContext()));
                }
            } else if (!this.zuBGHE && this.DCJXGO) {
                z = false;
            }
            this.zuBGHE = z;
            if (this.hBpjJd == null) {
            }
            if (this.hBpjJd == null) {
            }
            android.view.View viewFindViewById3 = findViewById(this.QVAiDq);
            android.view.View viewFindViewById22 = findViewById(this.QfsBiF);
            this.hBpjJd.AEQbTJ(this.ODXsMY);
            this.hBpjJd.EZpvd(this.AxsJAY);
            this.hBpjJd.KWHzl(this.AxsJAYsNCnLh, viewFindViewById3, viewFindViewById22);
            if (this.OHqIaq != 0) {
            }
        }
        int[] iArr = this.QkdxfA;
        if (iArr != null) {
            InterfaceC57935yrm interfaceC57935yrm3 = this.RdAHlO;
            if (interfaceC57935yrm3 != null) {
                interfaceC57935yrm3.setPrimaryColors(iArr);
            }
            InterfaceC57935yrm interfaceC57935yrm4 = this.dmfpNf;
            if (interfaceC57935yrm4 != null) {
                interfaceC57935yrm4.setPrimaryColors(this.QkdxfA);
            }
        }
        InterfaceC57928yrf interfaceC57928yrf2 = this.hBpjJd;
        if (interfaceC57928yrf2 != null) {
            super.bringChildToFront(interfaceC57928yrf2.EZpvd());
        }
        InterfaceC57935yrm interfaceC57935yrm5 = this.RdAHlO;
        if (interfaceC57935yrm5 != null && interfaceC57935yrm5.KWHzl().gEmmrt) {
            super.bringChildToFront(this.RdAHlO.copydefault());
        }
        InterfaceC57935yrm interfaceC57935yrm6 = this.dmfpNf;
        if (interfaceC57935yrm6 == null || !interfaceC57935yrm6.KWHzl().gEmmrt) {
            return;
        }
        super.bringChildToFront(this.dmfpNf.copydefault());
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int size;
        boolean z = isInEditMode() && this.OcIXYQ;
        int i7 = 0;
        int measuredHeight = 0;
        for (int childCount = super.getChildCount(); i7 < childCount; childCount = i3) {
            android.view.View childAt = super.getChildAt(i7);
            if (childAt.getVisibility() == 8 || childAt.getTag(C57923yra.Application.AEQbTJ) == childAt) {
                i3 = childCount;
            } else {
                InterfaceC57935yrm interfaceC57935yrm = this.RdAHlO;
                if (interfaceC57935yrm == null || interfaceC57935yrm.copydefault() != childAt) {
                    i3 = childCount;
                } else {
                    android.view.View viewCopydefault = this.RdAHlO.copydefault();
                    ViewGroup.LayoutParams layoutParams = viewCopydefault.getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : AkhnZx;
                    int childMeasureSpec = android.view.ViewGroup.getChildMeasureSpec(i, marginLayoutParams.leftMargin + marginLayoutParams.rightMargin, layoutParams.width);
                    int iMax = this.gGvvIC;
                    C57938yrp c57938yrp = this.flVtFt;
                    if (c57938yrp.values < C57938yrp.djBIcL.values) {
                        int i8 = layoutParams.height;
                        if (i8 > 0) {
                            int i9 = marginLayoutParams.bottomMargin;
                            int i10 = marginLayoutParams.topMargin;
                            i3 = childCount;
                            C57938yrp c57938yrp2 = C57938yrp.AYXKKw;
                            if (c57938yrp.EZpvd(c57938yrp2)) {
                                this.gGvvIC = layoutParams.height + marginLayoutParams.bottomMargin + marginLayoutParams.topMargin;
                                this.flVtFt = c57938yrp2;
                            }
                            iMax = i8 + i9 + i10;
                        } else {
                            i3 = childCount;
                            if (i8 == -2 && (this.RdAHlO.KWHzl() != C57940yrr.EZpvd || !this.flVtFt.AkhnZx)) {
                                int iMax2 = java.lang.Math.max((View.MeasureSpec.getSize(i2) - marginLayoutParams.bottomMargin) - marginLayoutParams.topMargin, 0);
                                viewCopydefault.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(iMax2, Integer.MIN_VALUE));
                                int measuredHeight2 = viewCopydefault.getMeasuredHeight();
                                if (measuredHeight2 > 0) {
                                    if (measuredHeight2 != iMax2) {
                                        C57938yrp c57938yrp3 = this.flVtFt;
                                        C57938yrp c57938yrp4 = C57938yrp.isConnected;
                                        if (c57938yrp3.EZpvd(c57938yrp4)) {
                                            this.gGvvIC = measuredHeight2 + marginLayoutParams.bottomMargin + marginLayoutParams.topMargin;
                                            this.flVtFt = c57938yrp4;
                                        }
                                    }
                                    iMax = -1;
                                }
                            }
                        }
                    } else {
                        i3 = childCount;
                    }
                    if (this.RdAHlO.KWHzl() == C57940yrr.EZpvd) {
                        size = View.MeasureSpec.getSize(i2);
                        i6 = 0;
                    } else {
                        if (!this.RdAHlO.KWHzl().AhwBna || z) {
                            i6 = 0;
                        } else {
                            i6 = 0;
                            iMax = java.lang.Math.max(0, EZpvd(this.QOLQEE) ? this.OHqIaq : 0);
                        }
                        size = iMax;
                    }
                    if (size != -1) {
                        viewCopydefault.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(java.lang.Math.max((size - marginLayoutParams.bottomMargin) - marginLayoutParams.topMargin, i6), 1073741824));
                    }
                    C57938yrp c57938yrp5 = this.flVtFt;
                    if (!c57938yrp5.AkhnZx) {
                        this.flVtFt = c57938yrp5.AEQbTJ();
                        InterfaceC57935yrm interfaceC57935yrm2 = this.RdAHlO;
                        InterfaceC57931yri interfaceC57931yri = this.AxsJAYsNCnLh;
                        int i11 = this.gGvvIC;
                        interfaceC57935yrm2.EZpvd(interfaceC57931yri, i11, (int) (this.iRxXKY * i11));
                    }
                    if (z && EZpvd(this.QOLQEE)) {
                        measuredHeight += viewCopydefault.getMeasuredHeight();
                    }
                }
                InterfaceC57935yrm interfaceC57935yrm3 = this.dmfpNf;
                if (interfaceC57935yrm3 == null || interfaceC57935yrm3.copydefault() != childAt) {
                    i4 = 0;
                } else {
                    android.view.View viewCopydefault2 = this.dmfpNf.copydefault();
                    ViewGroup.LayoutParams layoutParams2 = viewCopydefault2.getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : AkhnZx;
                    int childMeasureSpec2 = android.view.ViewGroup.getChildMeasureSpec(i, marginLayoutParams2.leftMargin + marginLayoutParams2.rightMargin, layoutParams2.width);
                    int iMax3 = this.djSkpj;
                    C57938yrp c57938yrp6 = this.RcXXUw;
                    if (c57938yrp6.values < C57938yrp.djBIcL.values) {
                        int i12 = layoutParams2.height;
                        if (i12 > 0) {
                            int i13 = marginLayoutParams2.bottomMargin + i12 + marginLayoutParams2.topMargin;
                            C57938yrp c57938yrp7 = C57938yrp.AYXKKw;
                            if (c57938yrp6.EZpvd(c57938yrp7)) {
                                this.djSkpj = layoutParams2.height + marginLayoutParams2.topMargin + marginLayoutParams2.bottomMargin;
                                this.RcXXUw = c57938yrp7;
                            }
                            iMax3 = i13;
                        } else if (i12 == -2 && (this.dmfpNf.KWHzl() != C57940yrr.EZpvd || !this.RcXXUw.AkhnZx)) {
                            int iMax4 = java.lang.Math.max((View.MeasureSpec.getSize(i2) - marginLayoutParams2.bottomMargin) - marginLayoutParams2.topMargin, 0);
                            viewCopydefault2.measure(childMeasureSpec2, View.MeasureSpec.makeMeasureSpec(iMax4, Integer.MIN_VALUE));
                            int measuredHeight3 = viewCopydefault2.getMeasuredHeight();
                            if (measuredHeight3 > 0) {
                                if (measuredHeight3 != iMax4) {
                                    C57938yrp c57938yrp8 = this.RcXXUw;
                                    C57938yrp c57938yrp9 = C57938yrp.isConnected;
                                    if (c57938yrp8.EZpvd(c57938yrp9)) {
                                        this.djSkpj = measuredHeight3 + marginLayoutParams2.topMargin + marginLayoutParams2.bottomMargin;
                                        this.RcXXUw = c57938yrp9;
                                    }
                                }
                                iMax3 = -1;
                            }
                        }
                    }
                    if (this.dmfpNf.KWHzl() == C57940yrr.EZpvd) {
                        iMax3 = View.MeasureSpec.getSize(i2);
                        i5 = -1;
                        i4 = 0;
                    } else {
                        if (!this.dmfpNf.KWHzl().AhwBna || z) {
                            i4 = 0;
                        } else {
                            i4 = 0;
                            iMax3 = java.lang.Math.max(0, EZpvd(this.zuBGHE) ? -this.OHqIaq : 0);
                        }
                        i5 = -1;
                    }
                    if (iMax3 != i5) {
                        viewCopydefault2.measure(childMeasureSpec2, View.MeasureSpec.makeMeasureSpec(java.lang.Math.max((iMax3 - marginLayoutParams2.bottomMargin) - marginLayoutParams2.topMargin, i4), 1073741824));
                    }
                    C57938yrp c57938yrp10 = this.RcXXUw;
                    if (!c57938yrp10.AkhnZx) {
                        this.RcXXUw = c57938yrp10.AEQbTJ();
                        InterfaceC57935yrm interfaceC57935yrm4 = this.dmfpNf;
                        InterfaceC57931yri interfaceC57931yri2 = this.AxsJAYsNCnLh;
                        int i14 = this.djSkpj;
                        interfaceC57935yrm4.EZpvd(interfaceC57931yri2, i14, (int) (this.aKErDB * i14));
                    }
                    if (z && EZpvd(this.zuBGHE)) {
                        measuredHeight += viewCopydefault2.getMeasuredHeight();
                    }
                }
                InterfaceC57928yrf interfaceC57928yrf = this.hBpjJd;
                if (interfaceC57928yrf != null && interfaceC57928yrf.EZpvd() == childAt) {
                    android.view.View viewEZpvd = this.hBpjJd.EZpvd();
                    ViewGroup.LayoutParams layoutParams3 = viewEZpvd.getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : AkhnZx;
                    int i15 = (this.RdAHlO != null && EZpvd(this.QOLQEE) && AEQbTJ(this.AuCTelauCTel, this.RdAHlO)) ? 1 : i4;
                    int i16 = (this.dmfpNf != null && EZpvd(this.zuBGHE) && AEQbTJ(this.AubY, this.dmfpNf)) ? 1 : i4;
                    int childMeasureSpec3 = android.view.ViewGroup.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + marginLayoutParams3.leftMargin + marginLayoutParams3.rightMargin, layoutParams3.width);
                    int paddingTop = getPaddingTop();
                    int paddingBottom = getPaddingBottom();
                    int i17 = marginLayoutParams3.topMargin;
                    viewEZpvd.measure(childMeasureSpec3, android.view.ViewGroup.getChildMeasureSpec(i2, paddingTop + paddingBottom + i17 + marginLayoutParams3.bottomMargin + ((!z || i15 == 0) ? 0 : this.gGvvIC) + ((!z || i16 == 0) ? 0 : this.djSkpj), layoutParams3.height));
                    measuredHeight += viewEZpvd.getMeasuredHeight();
                }
            }
            i7++;
        }
        super.setMeasuredDimension(android.view.View.resolveSize(super.getSuggestedMinimumWidth(), i), android.view.View.resolveSize(measuredHeight, i2));
        this.RlQdEF = getMeasuredWidth() / 2.0f;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int iMax;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        getPaddingBottom();
        int childCount = super.getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            android.view.View childAt = super.getChildAt(i5);
            if (childAt.getVisibility() != 8 && childAt.getTag(C57923yra.Application.AEQbTJ) != childAt) {
                InterfaceC57928yrf interfaceC57928yrf = this.hBpjJd;
                if (interfaceC57928yrf != null && interfaceC57928yrf.EZpvd() == childAt) {
                    boolean z2 = isInEditMode() && this.OcIXYQ && EZpvd(this.QOLQEE) && this.RdAHlO != null;
                    android.view.View viewEZpvd = this.hBpjJd.EZpvd();
                    ViewGroup.LayoutParams layoutParams = viewEZpvd.getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : AkhnZx;
                    int i6 = marginLayoutParams.leftMargin + paddingLeft;
                    int i7 = marginLayoutParams.topMargin + paddingTop;
                    int measuredWidth = viewEZpvd.getMeasuredWidth();
                    int measuredHeight = viewEZpvd.getMeasuredHeight() + i7;
                    if (z2 && AEQbTJ(this.AuCTelauCTel, this.RdAHlO)) {
                        int i8 = this.gGvvIC;
                        i7 += i8;
                        measuredHeight += i8;
                    }
                    viewEZpvd.layout(i6, i7, measuredWidth + i6, measuredHeight);
                }
                InterfaceC57935yrm interfaceC57935yrm = this.RdAHlO;
                if (interfaceC57935yrm != null && interfaceC57935yrm.copydefault() == childAt) {
                    boolean z3 = isInEditMode() && this.OcIXYQ && EZpvd(this.QOLQEE);
                    android.view.View viewCopydefault = this.RdAHlO.copydefault();
                    ViewGroup.LayoutParams layoutParams2 = viewCopydefault.getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : AkhnZx;
                    int i9 = marginLayoutParams2.leftMargin;
                    int i10 = marginLayoutParams2.topMargin + this.gasjUx;
                    int measuredWidth2 = viewCopydefault.getMeasuredWidth();
                    int measuredHeight2 = viewCopydefault.getMeasuredHeight() + i10;
                    if (!z3 && this.RdAHlO.KWHzl() == C57940yrr.KWHzl) {
                        int i11 = this.gGvvIC;
                        i10 -= i11;
                        measuredHeight2 -= i11;
                    }
                    viewCopydefault.layout(i9, i10, measuredWidth2 + i9, measuredHeight2);
                }
                InterfaceC57935yrm interfaceC57935yrm2 = this.dmfpNf;
                if (interfaceC57935yrm2 != null && interfaceC57935yrm2.copydefault() == childAt) {
                    boolean z4 = isInEditMode() && this.OcIXYQ && EZpvd(this.zuBGHE);
                    android.view.View viewCopydefault2 = this.dmfpNf.copydefault();
                    ViewGroup.LayoutParams layoutParams3 = viewCopydefault2.getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : AkhnZx;
                    C57940yrr c57940yrrKWHzl = this.dmfpNf.KWHzl();
                    int i12 = marginLayoutParams3.leftMargin;
                    int measuredHeight3 = (marginLayoutParams3.topMargin + getMeasuredHeight()) - this.dNCPSb;
                    if (this.fZBcTu && this.fFgQHt && this.zsXlph && this.hBpjJd != null && this.dmfpNf.KWHzl() == C57940yrr.KWHzl && EZpvd(this.zuBGHE)) {
                        android.view.View viewEZpvd2 = this.hBpjJd.EZpvd();
                        ViewGroup.LayoutParams layoutParams4 = viewEZpvd2.getLayoutParams();
                        measuredHeight3 = viewEZpvd2.getMeasuredHeight() + paddingTop + paddingTop + (layoutParams4 instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams4).topMargin : 0);
                    }
                    if (c57940yrrKWHzl == C57940yrr.EZpvd) {
                        measuredHeight3 = marginLayoutParams3.topMargin - this.dNCPSb;
                    } else {
                        if (z4 || c57940yrrKWHzl == C57940yrr.AEQbTJ || c57940yrrKWHzl == C57940yrr.OLrzqt) {
                            iMax = this.djSkpj;
                        } else if (c57940yrrKWHzl.AhwBna && this.OHqIaq < 0) {
                            iMax = java.lang.Math.max(EZpvd(this.zuBGHE) ? -this.OHqIaq : 0, 0);
                        }
                        measuredHeight3 -= iMax;
                    }
                    viewCopydefault2.layout(i12, measuredHeight3, viewCopydefault2.getMeasuredWidth() + i12, viewCopydefault2.getMeasuredHeight() + measuredHeight3);
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.ejfBZ = false;
        this.AxsJAYsNCnLh.copydefault(0, true);
        EZpvd(RefreshState.None);
        android.os.Handler handler = this.fvQaOB;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        this.DCJXGO = true;
        this.fIwbmz = null;
        android.animation.ValueAnimator valueAnimator = this.UlJrfe;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.UlJrfe.removeAllUpdateListeners();
            this.UlJrfe.setDuration(0L);
            this.UlJrfe.cancel();
            this.UlJrfe = null;
        }
        this.UeEOUB = false;
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(android.graphics.Canvas canvas, android.view.View view, long j) {
        android.graphics.Paint paint;
        android.graphics.Paint paint2;
        InterfaceC57928yrf interfaceC57928yrf = this.hBpjJd;
        android.view.View viewEZpvd = interfaceC57928yrf != null ? interfaceC57928yrf.EZpvd() : null;
        InterfaceC57935yrm interfaceC57935yrm = this.RdAHlO;
        if (interfaceC57935yrm != null && interfaceC57935yrm.copydefault() == view) {
            if (!EZpvd(this.QOLQEE) || (!this.OcIXYQ && isInEditMode())) {
                return true;
            }
            if (viewEZpvd != null) {
                int iMax = java.lang.Math.max(viewEZpvd.getTop() + viewEZpvd.getPaddingTop() + this.OHqIaq, view.getTop());
                int i = this.giSNqX;
                if (i != 0 && (paint2 = this.OBJEWx) != null) {
                    paint2.setColor(i);
                    if (this.RdAHlO.KWHzl().AhwBna) {
                        iMax = view.getBottom();
                    } else if (this.RdAHlO.KWHzl() == C57940yrr.KWHzl) {
                        iMax = view.getBottom() + this.OHqIaq;
                    }
                    canvas.drawRect(0.0f, view.getTop(), getWidth(), iMax, this.OBJEWx);
                }
                if ((this.zLjUOn && this.RdAHlO.KWHzl() == C57940yrr.OLrzqt) || this.RdAHlO.KWHzl().AhwBna) {
                    canvas.save();
                    canvas.clipRect(view.getLeft(), view.getTop(), view.getRight(), iMax);
                    boolean zDrawChild = super.drawChild(canvas, view, j);
                    canvas.restore();
                    return zDrawChild;
                }
            }
        }
        InterfaceC57935yrm interfaceC57935yrm2 = this.dmfpNf;
        if (interfaceC57935yrm2 != null && interfaceC57935yrm2.copydefault() == view) {
            if (!EZpvd(this.zuBGHE) || (!this.OcIXYQ && isInEditMode())) {
                return true;
            }
            if (viewEZpvd != null) {
                int iMin = java.lang.Math.min((viewEZpvd.getBottom() - viewEZpvd.getPaddingBottom()) + this.OHqIaq, view.getBottom());
                int i2 = this.RJOkX;
                if (i2 != 0 && (paint = this.OBJEWx) != null) {
                    paint.setColor(i2);
                    if (this.dmfpNf.KWHzl().AhwBna) {
                        iMin = view.getTop();
                    } else if (this.dmfpNf.KWHzl() == C57940yrr.KWHzl) {
                        iMin = view.getTop() + this.OHqIaq;
                    }
                    canvas.drawRect(0.0f, iMin, getWidth(), view.getBottom(), this.OBJEWx);
                }
                if ((this.getFieldNames && this.dmfpNf.KWHzl() == C57940yrr.OLrzqt) || this.dmfpNf.KWHzl().AhwBna) {
                    canvas.save();
                    canvas.clipRect(view.getLeft(), iMin, view.getRight(), view.getBottom());
                    boolean zDrawChild2 = super.drawChild(canvas, view, j);
                    canvas.restore();
                    return zDrawChild2;
                }
            }
        }
        return super.drawChild(canvas, view, j);
    }

    @Override // android.view.View
    public void computeScroll() {
        this.DLWbHP.getCurrY();
        if (this.DLWbHP.computeScrollOffset()) {
            int finalY = this.DLWbHP.getFinalY();
            if ((finalY < 0 && ((this.QOLQEE || this.gHZMYf) && this.hBpjJd.AEQbTJ())) || (finalY > 0 && ((this.zuBGHE || this.gHZMYf) && this.hBpjJd.copydefault()))) {
                if (this.USBtdM) {
                    copydefault(finalY > 0 ? -this.DLWbHP.getCurrVelocity() : this.DLWbHP.getCurrVelocity());
                }
                this.DLWbHP.forceFinished(true);
            } else {
                this.USBtdM = true;
                invalidate();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:76:0x00dc, code lost:
    
        if (r2.isFooter == false) goto L78;
     */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00cc  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        RefreshState refreshState;
        char c;
        InterfaceC57935yrm interfaceC57935yrm;
        InterfaceC57935yrm interfaceC57935yrm2;
        int actionMasked = motionEvent.getActionMasked();
        int i = 0;
        boolean z = actionMasked == 6;
        int actionIndex = z ? motionEvent.getActionIndex() : -1;
        int pointerCount = motionEvent.getPointerCount();
        float y = 0.0f;
        float x = 0.0f;
        for (int i2 = 0; i2 < pointerCount; i2++) {
            if (actionIndex != i2) {
                x += motionEvent.getX(i2);
                y += motionEvent.getY(i2);
            }
        }
        if (z) {
            pointerCount--;
        }
        float f = pointerCount;
        float f2 = x / f;
        float f3 = y / f;
        if ((actionMasked == 6 || actionMasked == 5) && this.hUfVAv) {
            this.OxVOHk += f3 - this.DAIeex;
        }
        this.RlQdEF = f2;
        this.DAIeex = f3;
        if (this.ffGIBT) {
            int i3 = this.QSLkRj;
            boolean zDispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
            if (actionMasked == 2 && i3 == this.QSLkRj) {
                int i4 = (int) this.RlQdEF;
                int width = getWidth();
                float f4 = this.RlQdEF / (width != 0 ? width : 1);
                if (EZpvd(this.QOLQEE) && this.OHqIaq > 0 && (interfaceC57935yrm2 = this.RdAHlO) != null && interfaceC57935yrm2.gEmmrt()) {
                    this.RdAHlO.OLrzqt(f4, i4, width);
                } else if (EZpvd(this.zuBGHE) && this.OHqIaq < 0 && (interfaceC57935yrm = this.dmfpNf) != null && interfaceC57935yrm.gEmmrt()) {
                    this.dmfpNf.OLrzqt(f4, i4, width);
                }
            }
            return zDispatchTouchEvent;
        }
        if (isEnabled() && (this.QOLQEE || this.zuBGHE || this.gHZMYf)) {
            if (this.gkJEwt) {
                RefreshState refreshState2 = this.hrNTAI;
                if ((!refreshState2.isOpening && !refreshState2.isFinishing) || !refreshState2.isHeader) {
                    if (this.finit) {
                        RefreshState refreshState3 = this.hrNTAI;
                        if (!refreshState3.isOpening) {
                            if (refreshState3.isFinishing) {
                            }
                        }
                    }
                    if (!copydefault(actionMasked)) {
                        RefreshState refreshState4 = this.hrNTAI;
                        if (!refreshState4.isFinishing && ((refreshState4 != (refreshState = RefreshState.Loading) || !this.AuCTel) && (refreshState4 != RefreshState.Refreshing || !this.uzCIH))) {
                            if (actionMasked == 0) {
                                this.fARcdN = 0;
                                this.QwvEab.addMovement(motionEvent);
                                this.DLWbHP.forceFinished(true);
                                this.QVsKAR = f2;
                                this.OxVOHk = f3;
                                this.QKudOq = 0;
                                this.OJuSTm = this.OHqIaq;
                                this.hUfVAv = false;
                                this.wlaJM = false;
                                this.OFhtUX = super.dispatchTouchEvent(motionEvent);
                                if (this.hrNTAI == RefreshState.TwoLevel && this.OxVOHk < (getMeasuredHeight() * 5.0f) / 6.0f) {
                                    this.getNewProxyInstance = 'h';
                                    return this.OFhtUX;
                                }
                                InterfaceC57928yrf interfaceC57928yrf = this.hBpjJd;
                                if (interfaceC57928yrf != null) {
                                    interfaceC57928yrf.EZpvd(motionEvent);
                                }
                                return true;
                            }
                            if (actionMasked == 1) {
                                this.QwvEab.addMovement(motionEvent);
                                this.QwvEab.computeCurrentVelocity(1000, this.ODWQjV);
                                this.fARcdN = (int) this.QwvEab.getYVelocity();
                                valueOf(0.0f);
                            } else {
                                if (actionMasked == 2) {
                                    float f5 = f2 - this.QVsKAR;
                                    float f6 = f3 - this.OxVOHk;
                                    this.QwvEab.addMovement(motionEvent);
                                    if (!this.hUfVAv && !this.wlaJM && (c = this.getNewProxyInstance) != 'h' && this.hBpjJd != null) {
                                        if (c == 'v' || (java.lang.Math.abs(f6) >= this.QCjLjM && java.lang.Math.abs(f5) < java.lang.Math.abs(f6))) {
                                            this.getNewProxyInstance = 'v';
                                            if (f6 > 0.0f && (this.OHqIaq < 0 || ((this.gHZMYf || this.QOLQEE) && this.hBpjJd.AEQbTJ()))) {
                                                this.hUfVAv = true;
                                                this.OxVOHk = f3 - this.QCjLjM;
                                            } else if (f6 < 0.0f && (this.OHqIaq > 0 || ((this.gHZMYf || this.zuBGHE) && ((this.hrNTAI == refreshState && this.UeEOUB) || this.hBpjJd.copydefault())))) {
                                                this.hUfVAv = true;
                                                this.OxVOHk = this.QCjLjM + f3;
                                            }
                                            if (this.hUfVAv) {
                                                f6 = f3 - this.OxVOHk;
                                                if (this.OFhtUX) {
                                                    motionEvent.setAction(3);
                                                    super.dispatchTouchEvent(motionEvent);
                                                }
                                                InterfaceC57931yri interfaceC57931yri = this.AxsJAYsNCnLh;
                                                int i5 = this.OHqIaq;
                                                interfaceC57931yri.AEQbTJ((i5 > 0 || (i5 == 0 && f6 > 0.0f)) ? RefreshState.PullDownToRefresh : RefreshState.PullUpToLoad);
                                                android.view.ViewParent parent = getParent();
                                                if (parent instanceof android.view.ViewGroup) {
                                                    ((android.view.ViewGroup) parent).requestDisallowInterceptTouchEvent(true);
                                                }
                                            }
                                        } else if (java.lang.Math.abs(f5) >= this.QCjLjM && java.lang.Math.abs(f5) > java.lang.Math.abs(f6) && this.getNewProxyInstance != 'v') {
                                            this.getNewProxyInstance = 'h';
                                        }
                                    }
                                    if (this.hUfVAv) {
                                        int i6 = ((int) f6) + this.OJuSTm;
                                        RefreshState refreshState5 = this.dUDNAs;
                                        if ((refreshState5.isHeader && (i6 < 0 || this.QKudOq < 0)) || (refreshState5.isFooter && (i6 > 0 || this.QKudOq > 0))) {
                                            this.QKudOq = i6;
                                            long eventTime = motionEvent.getEventTime();
                                            if (this.QbewEr == null) {
                                                android.view.MotionEvent motionEventObtain = android.view.MotionEvent.obtain(eventTime, eventTime, 0, this.QVsKAR + f5, this.OxVOHk, 0);
                                                this.QbewEr = motionEventObtain;
                                                super.dispatchTouchEvent(motionEventObtain);
                                            }
                                            android.view.MotionEvent motionEventObtain2 = android.view.MotionEvent.obtain(eventTime, eventTime, 2, this.QVsKAR + f5, this.OxVOHk + i6, 0);
                                            super.dispatchTouchEvent(motionEventObtain2);
                                            if (this.UeEOUB && f6 > this.QCjLjM && this.OHqIaq < 0) {
                                                this.UeEOUB = false;
                                            }
                                            if (i6 > 0 && ((this.gHZMYf || this.QOLQEE) && this.hBpjJd.AEQbTJ())) {
                                                this.DAIeex = f3;
                                                this.OxVOHk = f3;
                                                this.OJuSTm = 0;
                                                this.AxsJAYsNCnLh.AEQbTJ(RefreshState.PullDownToRefresh);
                                            } else if (i6 >= 0 || !((this.gHZMYf || this.zuBGHE) && this.hBpjJd.copydefault())) {
                                                i = i6;
                                            } else {
                                                this.DAIeex = f3;
                                                this.OxVOHk = f3;
                                                this.OJuSTm = 0;
                                                this.AxsJAYsNCnLh.AEQbTJ(RefreshState.PullUpToLoad);
                                            }
                                            RefreshState refreshState6 = this.dUDNAs;
                                            if ((refreshState6.isHeader && i < 0) || (refreshState6.isFooter && i > 0)) {
                                                if (this.OHqIaq != 0) {
                                                    AEQbTJ(0.0f);
                                                }
                                                return true;
                                            }
                                            if (this.QbewEr != null) {
                                                this.QbewEr = null;
                                                motionEventObtain2.setAction(3);
                                                super.dispatchTouchEvent(motionEventObtain2);
                                            }
                                            motionEventObtain2.recycle();
                                            i6 = i;
                                        }
                                        AEQbTJ(i6);
                                        return true;
                                    }
                                    if (this.UeEOUB && f6 > this.QCjLjM && this.OHqIaq < 0) {
                                        this.UeEOUB = false;
                                    }
                                } else if (actionMasked == 3) {
                                }
                                return super.dispatchTouchEvent(motionEvent);
                            }
                            this.QwvEab.clear();
                            this.getNewProxyInstance = 'n';
                            android.view.MotionEvent motionEvent2 = this.QbewEr;
                            if (motionEvent2 != null) {
                                motionEvent2.recycle();
                                this.QbewEr = null;
                                long eventTime2 = motionEvent.getEventTime();
                                android.view.MotionEvent motionEventObtain3 = android.view.MotionEvent.obtain(eventTime2, eventTime2, actionMasked, this.QVsKAR, f3, 0);
                                super.dispatchTouchEvent(motionEventObtain3);
                                motionEventObtain3.recycle();
                            }
                            fetchVPNInfo();
                            if (this.hUfVAv) {
                                this.hUfVAv = false;
                                return true;
                            }
                            return super.dispatchTouchEvent(motionEvent);
                        }
                    }
                    return false;
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        if (ViewCompat.isNestedScrollingEnabled(this.hBpjJd.KWHzl())) {
            this.wlaJM = z;
            super.requestDisallowInterceptTouchEvent(z);
        }
    }

    public boolean valueOf(float f) {
        if (f == 0.0f) {
            f = this.fARcdN;
        }
        if (Build.VERSION.SDK_INT > 27 && this.hBpjJd != null) {
            getScaleY();
            android.view.View viewEZpvd = this.hBpjJd.EZpvd();
            if (getScaleY() == -1.0f && viewEZpvd.getScaleY() == -1.0f) {
                f = -f;
            }
        }
        if (java.lang.Math.abs(f) > this.zuWLRA) {
            int i = this.OHqIaq;
            if (i * f < 0.0f) {
                RefreshState refreshState = this.hrNTAI;
                if (refreshState == RefreshState.Refreshing || refreshState == RefreshState.Loading || (i < 0 && this.fZBcTu)) {
                    this.fIwbmz = new Activity(f).KWHzl();
                    return true;
                }
                if (refreshState.isReleaseToOpening) {
                    return true;
                }
            }
            if ((f < 0.0f && ((this.AwvSrB && (this.zuBGHE || this.gHZMYf)) || ((this.hrNTAI == RefreshState.Loading && i >= 0) || (this.hDKMBd && EZpvd(this.zuBGHE))))) || (f > 0.0f && ((this.AwvSrB && this.QOLQEE) || this.gHZMYf || (this.hrNTAI == RefreshState.Refreshing && this.OHqIaq <= 0)))) {
                this.USBtdM = false;
                this.DLWbHP.fling(0, 0, 0, (int) (-f), 0, 0, -2147483647, Integer.MAX_VALUE);
                this.DLWbHP.computeScrollOffset();
                invalidate();
            }
        }
        return false;
    }

    public boolean copydefault(int i) {
        if (i == 0) {
            if (this.UlJrfe != null) {
                RefreshState refreshState = this.hrNTAI;
                if (refreshState.isFinishing || refreshState == RefreshState.TwoLevelReleased || refreshState == RefreshState.RefreshReleased || refreshState == RefreshState.LoadReleased) {
                    return true;
                }
                if (refreshState == RefreshState.PullDownCanceled) {
                    this.AxsJAYsNCnLh.AEQbTJ(RefreshState.PullDownToRefresh);
                } else if (refreshState == RefreshState.PullUpCanceled) {
                    this.AxsJAYsNCnLh.AEQbTJ(RefreshState.PullUpToLoad);
                }
                this.UlJrfe.setDuration(0L);
                this.UlJrfe.cancel();
                this.UlJrfe = null;
            }
            this.fIwbmz = null;
        }
        return this.UlJrfe != null;
    }

    public void EZpvd(RefreshState refreshState) {
        RefreshState refreshState2 = this.hrNTAI;
        if (refreshState2 == refreshState) {
            if (this.dUDNAs != refreshState2) {
                this.dUDNAs = refreshState2;
                return;
            }
            return;
        }
        this.hrNTAI = refreshState;
        this.dUDNAs = refreshState;
        InterfaceC57935yrm interfaceC57935yrm = this.RdAHlO;
        InterfaceC57935yrm interfaceC57935yrm2 = this.dmfpNf;
        InterfaceC57902yrF interfaceC57902yrF = this.DCUTEI;
        if (interfaceC57935yrm != null) {
            interfaceC57935yrm.OLrzqt(this, refreshState2, refreshState);
        }
        if (interfaceC57935yrm2 != null) {
            interfaceC57935yrm2.OLrzqt(this, refreshState2, refreshState);
        }
        if (interfaceC57902yrF != null) {
            interfaceC57902yrF.OLrzqt(this, refreshState2, refreshState);
        }
        if (refreshState == RefreshState.LoadFinish) {
            this.UeEOUB = false;
        }
    }

    public void setStateDirectLoading(boolean z) {
        RefreshState refreshState = this.hrNTAI;
        RefreshState refreshState2 = RefreshState.Loading;
        if (refreshState != refreshState2) {
            this.accept = java.lang.System.currentTimeMillis();
            this.UeEOUB = true;
            EZpvd(refreshState2);
            InterfaceC57900yrD interfaceC57900yrD = this.OqFWZa;
            if (interfaceC57900yrD != null) {
                if (z) {
                    interfaceC57900yrD.EZpvd(this);
                }
            } else if (this.DCUTEI == null) {
                AEQbTJ(2000);
            }
            InterfaceC57935yrm interfaceC57935yrm = this.dmfpNf;
            if (interfaceC57935yrm != null) {
                int i = this.djSkpj;
                interfaceC57935yrm.KWHzl(this, i, (int) (this.aKErDB * i));
            }
            InterfaceC57902yrF interfaceC57902yrF = this.DCUTEI;
            if (interfaceC57902yrF == null || !(this.dmfpNf instanceof InterfaceC57927yre)) {
                return;
            }
            if (z) {
                interfaceC57902yrF.EZpvd(this);
            }
            InterfaceC57902yrF interfaceC57902yrF2 = this.DCUTEI;
            InterfaceC57927yre interfaceC57927yre = (InterfaceC57927yre) this.dmfpNf;
            int i2 = this.djSkpj;
            interfaceC57902yrF2.OLrzqt(interfaceC57927yre, i2, (int) (this.aKErDB * i2));
        }
    }

    public void setStateLoading(final boolean z) {
        android.animation.AnimatorListenerAdapter animatorListenerAdapter = new android.animation.AnimatorListenerAdapter() { // from class: o.yqZ.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(android.animation.Animator animator) {
                if (animator == null || animator.getDuration() != 0) {
                    C57869yqZ.this.setStateDirectLoading(z);
                }
            }
        };
        EZpvd(RefreshState.LoadReleased);
        android.animation.ValueAnimator valueAnimatorKWHzl = this.AxsJAYsNCnLh.KWHzl(-this.djSkpj);
        if (valueAnimatorKWHzl != null) {
            valueAnimatorKWHzl.addListener(animatorListenerAdapter);
        }
        InterfaceC57935yrm interfaceC57935yrm = this.dmfpNf;
        if (interfaceC57935yrm != null) {
            int i = this.djSkpj;
            interfaceC57935yrm.OLrzqt(this, i, (int) (this.aKErDB * i));
        }
        InterfaceC57902yrF interfaceC57902yrF = this.DCUTEI;
        if (interfaceC57902yrF != null) {
            InterfaceC57935yrm interfaceC57935yrm2 = this.dmfpNf;
            if (interfaceC57935yrm2 instanceof InterfaceC57927yre) {
                int i2 = this.djSkpj;
                interfaceC57902yrF.EZpvd((InterfaceC57927yre) interfaceC57935yrm2, i2, (int) (this.aKErDB * i2));
            }
        }
        if (valueAnimatorKWHzl == null) {
            animatorListenerAdapter.onAnimationEnd(null);
        }
    }

    public void setStateRefreshing(final boolean z) {
        android.animation.AnimatorListenerAdapter animatorListenerAdapter = new android.animation.AnimatorListenerAdapter() { // from class: o.yqZ.5
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(android.animation.Animator animator) {
                if (animator == null || animator.getDuration() != 0) {
                    C57869yqZ.this.accept = java.lang.System.currentTimeMillis();
                    C57869yqZ.this.EZpvd(RefreshState.Refreshing);
                    C57869yqZ c57869yqZ = C57869yqZ.this;
                    InterfaceC57903yrG interfaceC57903yrG = c57869yqZ.gwTjWJ;
                    if (interfaceC57903yrG != null) {
                        if (z) {
                            interfaceC57903yrG.copydefault(c57869yqZ);
                        }
                    } else if (c57869yqZ.DCUTEI == null) {
                        c57869yqZ.KWHzl(3000);
                    }
                    C57869yqZ c57869yqZ2 = C57869yqZ.this;
                    InterfaceC57935yrm interfaceC57935yrm = c57869yqZ2.RdAHlO;
                    if (interfaceC57935yrm != null) {
                        int i = c57869yqZ2.gGvvIC;
                        interfaceC57935yrm.KWHzl(c57869yqZ2, i, (int) (c57869yqZ2.iRxXKY * i));
                    }
                    C57869yqZ c57869yqZ3 = C57869yqZ.this;
                    InterfaceC57902yrF interfaceC57902yrF = c57869yqZ3.DCUTEI;
                    if (interfaceC57902yrF == null || !(c57869yqZ3.RdAHlO instanceof InterfaceC57933yrk)) {
                        return;
                    }
                    if (z) {
                        interfaceC57902yrF.copydefault(c57869yqZ3);
                    }
                    C57869yqZ c57869yqZ4 = C57869yqZ.this;
                    InterfaceC57902yrF interfaceC57902yrF2 = c57869yqZ4.DCUTEI;
                    InterfaceC57933yrk interfaceC57933yrk = (InterfaceC57933yrk) c57869yqZ4.RdAHlO;
                    int i2 = c57869yqZ4.gGvvIC;
                    interfaceC57902yrF2.KWHzl(interfaceC57933yrk, i2, (int) (c57869yqZ4.iRxXKY * i2));
                }
            }
        };
        EZpvd(RefreshState.RefreshReleased);
        android.animation.ValueAnimator valueAnimatorKWHzl = this.AxsJAYsNCnLh.KWHzl(this.gGvvIC);
        if (valueAnimatorKWHzl != null) {
            valueAnimatorKWHzl.addListener(animatorListenerAdapter);
        }
        InterfaceC57935yrm interfaceC57935yrm = this.RdAHlO;
        if (interfaceC57935yrm != null) {
            int i = this.gGvvIC;
            interfaceC57935yrm.OLrzqt(this, i, (int) (this.iRxXKY * i));
        }
        InterfaceC57902yrF interfaceC57902yrF = this.DCUTEI;
        if (interfaceC57902yrF != null) {
            InterfaceC57935yrm interfaceC57935yrm2 = this.RdAHlO;
            if (interfaceC57935yrm2 instanceof InterfaceC57933yrk) {
                int i2 = this.gGvvIC;
                interfaceC57902yrF.EZpvd((InterfaceC57933yrk) interfaceC57935yrm2, i2, (int) (this.iRxXKY * i2));
            }
        }
        if (valueAnimatorKWHzl == null) {
            animatorListenerAdapter.onAnimationEnd(null);
        }
    }

    public void setViceState(RefreshState refreshState) {
        RefreshState refreshState2 = this.hrNTAI;
        if (refreshState2.isDragging && refreshState2.isHeader != refreshState.isHeader) {
            EZpvd(RefreshState.None);
        }
        if (this.dUDNAs != refreshState) {
            this.dUDNAs = refreshState;
        }
    }

    public boolean AEQbTJ(boolean z, InterfaceC57935yrm interfaceC57935yrm) {
        return z || this.QKVWgx || interfaceC57935yrm == null || interfaceC57935yrm.KWHzl() == C57940yrr.OLrzqt;
    }

    /* JADX INFO: renamed from: o.yqZ$Activity */
    public class Activity implements java.lang.Runnable {
        public int OLrzqt;
        public float djBIcL;
        public int EZpvd = 0;
        public int AEQbTJ = 10;
        public float copydefault = 0.98f;
        public long AhwBna = 0;
        public long KWHzl = android.view.animation.AnimationUtils.currentAnimationTimeMillis();

        public Activity(float f) {
            this.djBIcL = f;
            this.OLrzqt = C57869yqZ.this.OHqIaq;
        }

        /* JADX WARN: Removed duplicated region for block: B:29:0x004b  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x0059  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public java.lang.Runnable KWHzl() {
            RefreshState refreshState;
            C57869yqZ c57869yqZ = C57869yqZ.this;
            RefreshState refreshState2 = c57869yqZ.hrNTAI;
            if (refreshState2.isFinishing) {
                return null;
            }
            if (c57869yqZ.OHqIaq != 0) {
                if (refreshState2.isOpening || (c57869yqZ.fZBcTu && c57869yqZ.zsXlph && c57869yqZ.fFgQHt && c57869yqZ.EZpvd(c57869yqZ.zuBGHE))) {
                    C57869yqZ c57869yqZ2 = C57869yqZ.this;
                    if (c57869yqZ2.hrNTAI == RefreshState.Loading || (c57869yqZ2.fZBcTu && c57869yqZ2.zsXlph && c57869yqZ2.fFgQHt && c57869yqZ2.EZpvd(c57869yqZ2.zuBGHE))) {
                        C57869yqZ c57869yqZ3 = C57869yqZ.this;
                        if (c57869yqZ3.OHqIaq >= (-c57869yqZ3.djSkpj)) {
                            C57869yqZ c57869yqZ4 = C57869yqZ.this;
                            if (c57869yqZ4.hrNTAI == RefreshState.Refreshing && c57869yqZ4.OHqIaq > c57869yqZ4.gGvvIC) {
                                int i = C57869yqZ.this.OHqIaq;
                                float fPow = this.djBIcL;
                                int i2 = 0;
                                int i3 = i;
                                while (true) {
                                    if (i * i3 <= 0) {
                                        break;
                                    }
                                    i2++;
                                    fPow = (float) (((double) fPow) * java.lang.Math.pow(this.copydefault, (this.AEQbTJ * i2) / 10.0f));
                                    float f = ((this.AEQbTJ * 1.0f) / 1000.0f) * fPow;
                                    if (java.lang.Math.abs(f) < 1.0f) {
                                        C57869yqZ c57869yqZ5 = C57869yqZ.this;
                                        RefreshState refreshState3 = c57869yqZ5.hrNTAI;
                                        if (!refreshState3.isOpening || ((refreshState3 == (refreshState = RefreshState.Refreshing) && i3 > c57869yqZ5.gGvvIC) || (refreshState3 != refreshState && i3 < (-c57869yqZ5.djSkpj)))) {
                                            return null;
                                        }
                                    } else {
                                        i3 = (int) (i3 + f);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            this.AhwBna = android.view.animation.AnimationUtils.currentAnimationTimeMillis();
            C57869yqZ.this.fvQaOB.postDelayed(this, this.AEQbTJ);
            return this;
        }

        @Override // java.lang.Runnable
        public void run() {
            C57869yqZ c57869yqZ = C57869yqZ.this;
            if (c57869yqZ.fIwbmz != this || c57869yqZ.hrNTAI.isFinishing) {
                return;
            }
            long jCurrentAnimationTimeMillis = android.view.animation.AnimationUtils.currentAnimationTimeMillis();
            long j = this.KWHzl;
            float fPow = (float) (((double) this.djBIcL) * java.lang.Math.pow(this.copydefault, (jCurrentAnimationTimeMillis - this.AhwBna) / (1000.0f / this.AEQbTJ)));
            this.djBIcL = fPow;
            float f = fPow * (((jCurrentAnimationTimeMillis - j) * 1.0f) / 1000.0f);
            if (java.lang.Math.abs(f) > 1.0f) {
                this.KWHzl = jCurrentAnimationTimeMillis;
                int i = (int) (this.OLrzqt + f);
                this.OLrzqt = i;
                C57869yqZ c57869yqZ2 = C57869yqZ.this;
                if (c57869yqZ2.OHqIaq * i > 0) {
                    c57869yqZ2.AxsJAYsNCnLh.copydefault(i, true);
                    C57869yqZ.this.fvQaOB.postDelayed(this, this.AEQbTJ);
                    return;
                }
                c57869yqZ2.fIwbmz = null;
                c57869yqZ2.AxsJAYsNCnLh.copydefault(0, true);
                InterpolatorC57905yrI.KWHzl(C57869yqZ.this.hBpjJd.KWHzl(), (int) (-this.djBIcL));
                C57869yqZ c57869yqZ3 = C57869yqZ.this;
                if (!c57869yqZ3.UeEOUB || f <= 0.0f) {
                    return;
                }
                c57869yqZ3.UeEOUB = false;
                return;
            }
            C57869yqZ.this.fIwbmz = null;
        }
    }

    /* JADX INFO: renamed from: o.yqZ$StateListAnimator */
    /* JADX INFO: loaded from: classes17.dex */
    public class StateListAnimator implements java.lang.Runnable {
        public int KWHzl;
        public float valueOf;
        public int copydefault = 0;
        public int AEQbTJ = 10;
        public float EZpvd = 0.0f;
        public long OLrzqt = android.view.animation.AnimationUtils.currentAnimationTimeMillis();

        public StateListAnimator(float f, int i) {
            this.valueOf = f;
            this.KWHzl = i;
            C57869yqZ.this.fvQaOB.postDelayed(this, this.AEQbTJ);
            if (f > 0.0f) {
                C57869yqZ.this.AxsJAYsNCnLh.AEQbTJ(RefreshState.PullDownToRefresh);
            } else {
                C57869yqZ.this.AxsJAYsNCnLh.AEQbTJ(RefreshState.PullUpToLoad);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            C57869yqZ c57869yqZ = C57869yqZ.this;
            if (c57869yqZ.fIwbmz != this || c57869yqZ.hrNTAI.isFinishing) {
                return;
            }
            if (java.lang.Math.abs(c57869yqZ.OHqIaq) < java.lang.Math.abs(this.KWHzl)) {
                double d = this.valueOf;
                this.copydefault = this.copydefault + 1;
                this.valueOf = (float) (d * java.lang.Math.pow(0.949999988079071d, r2 * 2));
            } else if (this.KWHzl != 0) {
                double d2 = this.valueOf;
                this.copydefault = this.copydefault + 1;
                this.valueOf = (float) (d2 * java.lang.Math.pow(0.44999998807907104d, r2 * 2));
            } else {
                double d3 = this.valueOf;
                this.copydefault = this.copydefault + 1;
                this.valueOf = (float) (d3 * java.lang.Math.pow(0.8500000238418579d, r2 * 2));
            }
            long jCurrentAnimationTimeMillis = android.view.animation.AnimationUtils.currentAnimationTimeMillis();
            float f = this.valueOf * (((jCurrentAnimationTimeMillis - this.OLrzqt) * 1.0f) / 1000.0f);
            if (java.lang.Math.abs(f) >= 1.0f) {
                this.OLrzqt = jCurrentAnimationTimeMillis;
                float f2 = this.EZpvd + f;
                this.EZpvd = f2;
                C57869yqZ.this.AEQbTJ(f2);
                C57869yqZ.this.fvQaOB.postDelayed(this, this.AEQbTJ);
                return;
            }
            C57869yqZ c57869yqZ2 = C57869yqZ.this;
            RefreshState refreshState = c57869yqZ2.dUDNAs;
            boolean z = refreshState.isDragging;
            if (z && refreshState.isHeader) {
                c57869yqZ2.AxsJAYsNCnLh.AEQbTJ(RefreshState.PullDownCanceled);
            } else if (z && refreshState.isFooter) {
                c57869yqZ2.AxsJAYsNCnLh.AEQbTJ(RefreshState.PullUpCanceled);
            }
            C57869yqZ c57869yqZ3 = C57869yqZ.this;
            c57869yqZ3.fIwbmz = null;
            if (java.lang.Math.abs(c57869yqZ3.OHqIaq) >= java.lang.Math.abs(this.KWHzl)) {
                int iMin = java.lang.Math.min(java.lang.Math.max((int) InterpolatorC57905yrI.KWHzl(java.lang.Math.abs(C57869yqZ.this.OHqIaq - this.KWHzl)), 30), 100);
                C57869yqZ c57869yqZ4 = C57869yqZ.this;
                c57869yqZ4.OLrzqt(this.KWHzl, 0, c57869yqZ4.QHmsKR, iMin * 10);
            }
        }
    }

    public android.animation.ValueAnimator OLrzqt(int i, int i2, android.view.animation.Interpolator interpolator, int i3) {
        if (this.OHqIaq == i) {
            return null;
        }
        android.animation.ValueAnimator valueAnimator = this.UlJrfe;
        if (valueAnimator != null) {
            valueAnimator.setDuration(0L);
            this.UlJrfe.cancel();
            this.UlJrfe = null;
        }
        this.fIwbmz = null;
        android.animation.ValueAnimator valueAnimatorOfInt = android.animation.ValueAnimator.ofInt(this.OHqIaq, i);
        this.UlJrfe = valueAnimatorOfInt;
        valueAnimatorOfInt.setDuration(i3);
        this.UlJrfe.setInterpolator(interpolator);
        this.UlJrfe.addListener(new android.animation.AnimatorListenerAdapter() { // from class: o.yqZ.3
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(android.animation.Animator animator) {
                RefreshState refreshState;
                RefreshState refreshState2;
                if (animator == null || animator.getDuration() != 0) {
                    C57869yqZ c57869yqZ = C57869yqZ.this;
                    c57869yqZ.UlJrfe = null;
                    if (c57869yqZ.OHqIaq == 0 && (refreshState = c57869yqZ.hrNTAI) != (refreshState2 = RefreshState.None) && !refreshState.isOpening && !refreshState.isDragging) {
                        c57869yqZ.EZpvd(refreshState2);
                        return;
                    }
                    RefreshState refreshState3 = c57869yqZ.hrNTAI;
                    if (refreshState3 != c57869yqZ.dUDNAs) {
                        c57869yqZ.setViceState(refreshState3);
                    }
                }
            }
        });
        this.UlJrfe.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o.yqZ.2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator2) {
                C57869yqZ c57869yqZ = C57869yqZ.this;
                if (c57869yqZ.UlJrfe != null) {
                    c57869yqZ.AxsJAYsNCnLh.copydefault(((java.lang.Integer) valueAnimator2.getAnimatedValue()).intValue(), false);
                }
            }
        });
        this.UlJrfe.setStartDelay(i2);
        this.UlJrfe.start();
        return this.UlJrfe;
    }

    public void copydefault(float f) {
        RefreshState refreshState;
        if (this.UlJrfe == null) {
            if (f > 0.0f && ((refreshState = this.hrNTAI) == RefreshState.Refreshing || refreshState == RefreshState.TwoLevel)) {
                this.fIwbmz = new StateListAnimator(f, this.gGvvIC);
                return;
            }
            if (f < 0.0f && (this.hrNTAI == RefreshState.Loading || ((this.zsXlph && this.fZBcTu && this.fFgQHt && EZpvd(this.zuBGHE)) || (this.hDKMBd && !this.fZBcTu && EZpvd(this.zuBGHE) && this.hrNTAI != RefreshState.Refreshing)))) {
                this.fIwbmz = new StateListAnimator(f, -this.djSkpj);
            } else if (this.OHqIaq == 0 && this.AwvSrB) {
                this.fIwbmz = new StateListAnimator(f, 0);
            }
        }
    }

    public void fetchVPNInfo() {
        RefreshState refreshState = this.hrNTAI;
        if (refreshState == RefreshState.TwoLevel) {
            if (this.fARcdN <= -1000 || this.OHqIaq <= getMeasuredHeight() / 2) {
                if (this.hUfVAv) {
                    this.AxsJAYsNCnLh.KWHzl();
                    return;
                }
                return;
            } else {
                android.animation.ValueAnimator valueAnimatorKWHzl = this.AxsJAYsNCnLh.KWHzl(getMeasuredHeight());
                if (valueAnimatorKWHzl != null) {
                    valueAnimatorKWHzl.setDuration(this.QUSxYX);
                    return;
                }
                return;
            }
        }
        RefreshState refreshState2 = RefreshState.Loading;
        if (refreshState == refreshState2 || (this.zsXlph && this.fZBcTu && this.fFgQHt && this.OHqIaq < 0 && EZpvd(this.zuBGHE))) {
            int i = this.OHqIaq;
            int i2 = -this.djSkpj;
            if (i < i2) {
                this.AxsJAYsNCnLh.KWHzl(i2);
                return;
            } else {
                if (i > 0) {
                    this.AxsJAYsNCnLh.KWHzl(0);
                    return;
                }
                return;
            }
        }
        RefreshState refreshState3 = this.hrNTAI;
        RefreshState refreshState4 = RefreshState.Refreshing;
        if (refreshState3 == refreshState4) {
            int i3 = this.OHqIaq;
            int i4 = this.gGvvIC;
            if (i3 > i4) {
                this.AxsJAYsNCnLh.KWHzl(i4);
                return;
            } else {
                if (i3 < 0) {
                    this.AxsJAYsNCnLh.KWHzl(0);
                    return;
                }
                return;
            }
        }
        if (refreshState3 == RefreshState.PullDownToRefresh) {
            this.AxsJAYsNCnLh.AEQbTJ(RefreshState.PullDownCanceled);
            return;
        }
        if (refreshState3 == RefreshState.PullUpToLoad) {
            this.AxsJAYsNCnLh.AEQbTJ(RefreshState.PullUpCanceled);
            return;
        }
        if (refreshState3 == RefreshState.ReleaseToRefresh) {
            this.AxsJAYsNCnLh.AEQbTJ(refreshState4);
            return;
        }
        if (refreshState3 == RefreshState.ReleaseToLoad) {
            this.AxsJAYsNCnLh.AEQbTJ(refreshState2);
            return;
        }
        if (refreshState3 == RefreshState.ReleaseToTwoLevel) {
            this.AxsJAYsNCnLh.AEQbTJ(RefreshState.TwoLevelReleased);
            return;
        }
        if (refreshState3 == RefreshState.RefreshReleased) {
            if (this.UlJrfe == null) {
                this.AxsJAYsNCnLh.KWHzl(this.gGvvIC);
            }
        } else if (refreshState3 == RefreshState.LoadReleased) {
            if (this.UlJrfe == null) {
                this.AxsJAYsNCnLh.KWHzl(-this.djSkpj);
            }
        } else if (this.OHqIaq != 0) {
            this.AxsJAYsNCnLh.KWHzl(0);
        }
    }

    public void AEQbTJ(float f) {
        RefreshState refreshState;
        float f2 = (!this.ffGIBT || this.AxsJAY || f >= 0.0f || this.hBpjJd.copydefault()) ? f : 0.0f;
        if (f2 > this.dHguZz * 5 && getTag() == null) {
            float f3 = this.DAIeex;
            float f4 = this.dHguZz;
            if (f3 < f4 / 6.0f && this.RlQdEF < f4 / 16.0f) {
                android.widget.Toast.makeText(getContext(), "你这么死拉，臣妾做不到啊！", 0).show();
                setTag("你这么死拉，臣妾做不到啊！");
            }
        }
        RefreshState refreshState2 = this.hrNTAI;
        if (refreshState2 == RefreshState.TwoLevel && f2 > 0.0f) {
            this.AxsJAYsNCnLh.copydefault(java.lang.Math.min((int) f2, getMeasuredHeight()), true);
        } else if (refreshState2 == RefreshState.Refreshing && f2 >= 0.0f) {
            float f5 = this.gGvvIC;
            if (f2 < f5) {
                this.AxsJAYsNCnLh.copydefault((int) f2, true);
            } else {
                double d = (this.iRxXKY - 1.0f) * f5;
                int iMax = java.lang.Math.max((this.dHguZz * 4) / 3, getHeight());
                int i = this.gGvvIC;
                double d2 = iMax - i;
                double dMax = java.lang.Math.max(0.0f, (f2 - i) * this.iwGUEr);
                double d3 = -dMax;
                if (d2 == AudioStats.AUDIO_AMPLITUDE_NONE) {
                    d2 = 1.0d;
                }
                this.AxsJAYsNCnLh.copydefault(((int) java.lang.Math.min(d * (1.0d - java.lang.Math.pow(100.0d, d3 / d2)), dMax)) + this.gGvvIC, true);
            }
        } else if (f2 < 0.0f && (refreshState2 == RefreshState.Loading || ((this.zsXlph && this.fZBcTu && this.fFgQHt && EZpvd(this.zuBGHE)) || (this.hDKMBd && !this.fZBcTu && EZpvd(this.zuBGHE))))) {
            int i2 = this.djSkpj;
            if (f2 > (-i2)) {
                this.AxsJAYsNCnLh.copydefault((int) f2, true);
            } else {
                double d4 = (this.aKErDB - 1.0f) * i2;
                int iMax2 = java.lang.Math.max((this.dHguZz * 4) / 3, getHeight());
                int i3 = this.djSkpj;
                double d5 = iMax2 - i3;
                double d6 = -java.lang.Math.min(0.0f, (i3 + f2) * this.iwGUEr);
                double d7 = -d6;
                if (d5 == AudioStats.AUDIO_AMPLITUDE_NONE) {
                    d5 = 1.0d;
                }
                this.AxsJAYsNCnLh.copydefault(((int) (-java.lang.Math.min(d4 * (1.0d - java.lang.Math.pow(100.0d, d7 / d5)), d6))) - this.djSkpj, true);
            }
        } else if (f2 >= 0.0f) {
            double d8 = this.iRxXKY * this.gGvvIC;
            double dMax2 = java.lang.Math.max(this.dHguZz / 2, getHeight());
            double dMax3 = java.lang.Math.max(0.0f, this.iwGUEr * f2);
            double d9 = -dMax3;
            if (dMax2 == AudioStats.AUDIO_AMPLITUDE_NONE) {
                dMax2 = 1.0d;
            }
            this.AxsJAYsNCnLh.copydefault((int) java.lang.Math.min(d8 * (1.0d - java.lang.Math.pow(100.0d, d9 / dMax2)), dMax3), true);
        } else {
            double d10 = this.aKErDB * this.djSkpj;
            double dMax4 = java.lang.Math.max(this.dHguZz / 2, getHeight());
            double d11 = -java.lang.Math.min(0.0f, this.iwGUEr * f2);
            double d12 = -d11;
            if (dMax4 == AudioStats.AUDIO_AMPLITUDE_NONE) {
                dMax4 = 1.0d;
            }
            this.AxsJAYsNCnLh.copydefault((int) (-java.lang.Math.min(d10 * (1.0d - java.lang.Math.pow(100.0d, d12 / dMax4)), d11)), true);
        }
        if (!this.hDKMBd || this.fZBcTu || !EZpvd(this.zuBGHE) || f2 >= 0.0f || (refreshState = this.hrNTAI) == RefreshState.Refreshing || refreshState == RefreshState.Loading || refreshState == RefreshState.LoadFinish) {
            return;
        }
        if (this.AuCTel) {
            this.fIwbmz = null;
            this.AxsJAYsNCnLh.KWHzl(-this.djSkpj);
        }
        setStateDirectLoading(false);
        this.fvQaOB.postDelayed(new java.lang.Runnable() { // from class: o.yqZ.10
            @Override // java.lang.Runnable
            public void run() {
                C57869yqZ c57869yqZ = C57869yqZ.this;
                InterfaceC57900yrD interfaceC57900yrD = c57869yqZ.OqFWZa;
                if (interfaceC57900yrD != null) {
                    interfaceC57900yrD.EZpvd(c57869yqZ);
                } else if (c57869yqZ.DCUTEI == null) {
                    c57869yqZ.AEQbTJ(2000);
                }
                C57869yqZ c57869yqZ2 = C57869yqZ.this;
                InterfaceC57902yrF interfaceC57902yrF = c57869yqZ2.DCUTEI;
                if (interfaceC57902yrF != null) {
                    interfaceC57902yrF.EZpvd(c57869yqZ2);
                }
            }
        }, this.RKDWNf);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(android.util.AttributeSet attributeSet) {
        return new Application(getContext(), attributeSet);
    }

    /* JADX INFO: renamed from: o.yqZ$Application */
    public static class Application extends ViewGroup.MarginLayoutParams {
        public C57940yrr AEQbTJ;
        public int EZpvd;

        public Application(android.content.Context context, android.util.AttributeSet attributeSet) {
            super(context, attributeSet);
            this.EZpvd = 0;
            this.AEQbTJ = null;
            android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C57923yra.StateListAnimator.AwvSrB);
            this.EZpvd = typedArrayObtainStyledAttributes.getColor(C57923yra.StateListAnimator.AxsJAY, this.EZpvd);
            if (typedArrayObtainStyledAttributes.hasValue(C57923yra.StateListAnimator.QOLQEE)) {
                this.AEQbTJ = C57940yrr.djBIcL[typedArrayObtainStyledAttributes.getInt(C57923yra.StateListAnimator.QOLQEE, C57940yrr.KWHzl.AYXKKw)];
            }
            typedArrayObtainStyledAttributes.recycle();
        }

        public Application(int i, int i2) {
            super(i, i2);
            this.EZpvd = 0;
            this.AEQbTJ = null;
        }
    }

    @Override // android.view.ViewGroup, androidx.core.view.NestedScrollingParent
    public int getNestedScrollAxes() {
        return this.getPostValueLengthLimit.getNestedScrollAxes();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public boolean onStartNestedScroll(@androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull android.view.View view2, int i) {
        return isEnabled() && isNestedScrollingEnabled() && (i & 2) != 0 && (this.gHZMYf || this.QOLQEE || this.zuBGHE);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public void onNestedScrollAccepted(@androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull android.view.View view2, int i) {
        this.getPostValueLengthLimit.onNestedScrollAccepted(view, view2, i);
        this.OuxcSI.startNestedScroll(i & 2);
        this.QSLkRj = this.OHqIaq;
        this.ffGIBT = true;
        copydefault(0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public void onNestedPreScroll(@androidx.annotation.NonNull android.view.View view, int i, int i2, @androidx.annotation.NonNull int[] iArr) {
        int i3 = this.QSLkRj;
        int i4 = 0;
        if (i2 * i3 > 0) {
            if (java.lang.Math.abs(i2) > java.lang.Math.abs(this.QSLkRj)) {
                int i5 = this.QSLkRj;
                this.QSLkRj = 0;
                i4 = i5;
            } else {
                this.QSLkRj -= i2;
                i4 = i2;
            }
            AEQbTJ(this.QSLkRj);
        } else if (i2 > 0 && this.UeEOUB) {
            int i6 = i3 - i2;
            this.QSLkRj = i6;
            AEQbTJ(i6);
            i4 = i2;
        }
        this.OuxcSI.dispatchNestedPreScroll(i, i2 - i4, iArr, null);
        iArr[1] = iArr[1] + i4;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public void onNestedScroll(@androidx.annotation.NonNull android.view.View view, int i, int i2, int i3, int i4) {
        InterfaceC57932yrj interfaceC57932yrj;
        InterfaceC57932yrj interfaceC57932yrj2;
        boolean zDispatchNestedScroll = this.OuxcSI.dispatchNestedScroll(i, i2, i3, i4, this.QSBOWP);
        int i5 = i4 + this.QSBOWP[1];
        if ((i5 < 0 && ((this.QOLQEE || this.gHZMYf) && (this.QSLkRj != 0 || (interfaceC57932yrj2 = this.ODXsMY) == null || interfaceC57932yrj2.EZpvd(this.hBpjJd.EZpvd())))) || (i5 > 0 && ((this.zuBGHE || this.gHZMYf) && (this.QSLkRj != 0 || (interfaceC57932yrj = this.ODXsMY) == null || interfaceC57932yrj.copydefault(this.hBpjJd.EZpvd()))))) {
            RefreshState refreshState = this.dUDNAs;
            if (refreshState == RefreshState.None || refreshState.isOpening) {
                this.AxsJAYsNCnLh.AEQbTJ(i5 > 0 ? RefreshState.PullUpToLoad : RefreshState.PullDownToRefresh);
                if (!zDispatchNestedScroll) {
                    android.view.ViewParent parent = getParent();
                    if (parent instanceof android.view.ViewGroup) {
                        ((android.view.ViewGroup) parent).requestDisallowInterceptTouchEvent(true);
                    }
                }
            }
            int i6 = this.QSLkRj - i5;
            this.QSLkRj = i6;
            AEQbTJ(i6);
        }
        if (!this.UeEOUB || i2 >= 0) {
            return;
        }
        this.UeEOUB = false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public boolean onNestedPreFling(@androidx.annotation.NonNull android.view.View view, float f, float f2) {
        return (this.UeEOUB && f2 > 0.0f) || valueOf(-f2) || this.OuxcSI.dispatchNestedPreFling(f, f2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public boolean onNestedFling(@androidx.annotation.NonNull android.view.View view, float f, float f2, boolean z) {
        return this.OuxcSI.dispatchNestedFling(f, f2, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public void onStopNestedScroll(@androidx.annotation.NonNull android.view.View view) {
        this.getPostValueLengthLimit.onStopNestedScroll(view);
        this.ffGIBT = false;
        this.QSLkRj = 0;
        fetchVPNInfo();
        this.OuxcSI.stopNestedScroll();
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public void setNestedScrollingEnabled(boolean z) {
        this.sSMYrx = z;
        this.OuxcSI.setNestedScrollingEnabled(z);
    }

    public InterfaceC57934yrl EZpvd(float f) {
        int iOLrzqt = InterpolatorC57905yrI.OLrzqt(f);
        if (iOLrzqt == this.gGvvIC) {
            return this;
        }
        C57938yrp c57938yrp = this.flVtFt;
        C57938yrp c57938yrp2 = C57938yrp.AEQbTJ;
        if (c57938yrp.EZpvd(c57938yrp2)) {
            this.gGvvIC = iOLrzqt;
            InterfaceC57935yrm interfaceC57935yrm = this.RdAHlO;
            if (interfaceC57935yrm != null && this.ejfBZ && this.flVtFt.AkhnZx) {
                C57940yrr c57940yrrKWHzl = interfaceC57935yrm.KWHzl();
                if (c57940yrrKWHzl != C57940yrr.EZpvd && !c57940yrrKWHzl.AhwBna) {
                    android.view.View viewCopydefault = this.RdAHlO.copydefault();
                    ViewGroup.LayoutParams layoutParams = viewCopydefault.getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : AkhnZx;
                    viewCopydefault.measure(View.MeasureSpec.makeMeasureSpec(viewCopydefault.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(java.lang.Math.max((this.gGvvIC - marginLayoutParams.bottomMargin) - marginLayoutParams.topMargin, 0), 1073741824));
                    int i = marginLayoutParams.leftMargin;
                    int i2 = (marginLayoutParams.topMargin + this.gasjUx) - (c57940yrrKWHzl == C57940yrr.KWHzl ? this.gGvvIC : 0);
                    viewCopydefault.layout(i, i2, viewCopydefault.getMeasuredWidth() + i, viewCopydefault.getMeasuredHeight() + i2);
                }
                this.flVtFt = c57938yrp2;
                InterfaceC57935yrm interfaceC57935yrm2 = this.RdAHlO;
                InterfaceC57931yri interfaceC57931yri = this.AxsJAYsNCnLh;
                int i3 = this.gGvvIC;
                interfaceC57935yrm2.EZpvd(interfaceC57931yri, i3, (int) (this.iRxXKY * i3));
            } else {
                this.flVtFt = C57938yrp.copydefault;
            }
        }
        return this;
    }

    public InterfaceC57934yrl KWHzl(float f) {
        this.gasjUx = InterpolatorC57905yrI.OLrzqt(f);
        return this;
    }

    @Override // o.InterfaceC57934yrl
    public InterfaceC57934yrl OLrzqt(float f) {
        this.iRxXKY = f;
        InterfaceC57935yrm interfaceC57935yrm = this.RdAHlO;
        if (interfaceC57935yrm != null && this.ejfBZ) {
            InterfaceC57931yri interfaceC57931yri = this.AxsJAYsNCnLh;
            int i = this.gGvvIC;
            interfaceC57935yrm.EZpvd(interfaceC57931yri, i, (int) (f * i));
        } else {
            this.flVtFt = this.flVtFt.copydefault();
        }
        return this;
    }

    @Override // o.InterfaceC57934yrl
    public InterfaceC57934yrl gEmmrt(boolean z) {
        setNestedScrollingEnabled(z);
        return this;
    }

    public InterfaceC57934yrl AEQbTJ(@androidx.annotation.NonNull InterfaceC57933yrk interfaceC57933yrk) {
        return KWHzl(interfaceC57933yrk, 0, 0);
    }

    public InterfaceC57934yrl KWHzl(@androidx.annotation.NonNull InterfaceC57933yrk interfaceC57933yrk, int i, int i2) {
        InterfaceC57935yrm interfaceC57935yrm;
        InterfaceC57935yrm interfaceC57935yrm2 = this.RdAHlO;
        if (interfaceC57935yrm2 != null) {
            super.removeView(interfaceC57935yrm2.copydefault());
        }
        this.RdAHlO = interfaceC57933yrk;
        this.giSNqX = 0;
        this.gkJEwt = false;
        this.flVtFt = this.flVtFt.copydefault();
        if (this.RdAHlO != null) {
            if (i == 0) {
                i = -1;
            }
            if (i2 == 0) {
                i2 = -2;
            }
            Application application = new Application(i, i2);
            ViewGroup.LayoutParams layoutParams = interfaceC57933yrk.copydefault().getLayoutParams();
            if (layoutParams instanceof Application) {
                application = (Application) layoutParams;
            }
            if (this.RdAHlO.KWHzl().gEmmrt) {
                super.addView(this.RdAHlO.copydefault(), getChildCount(), application);
            } else {
                super.addView(this.RdAHlO.copydefault(), 0, application);
            }
            int[] iArr = this.QkdxfA;
            if (iArr != null && (interfaceC57935yrm = this.RdAHlO) != null) {
                interfaceC57935yrm.setPrimaryColors(iArr);
            }
        }
        return this;
    }

    public InterfaceC57934yrl OLrzqt(@androidx.annotation.NonNull InterfaceC57927yre interfaceC57927yre) {
        return AEQbTJ(interfaceC57927yre, 0, 0);
    }

    public InterfaceC57934yrl AEQbTJ(@androidx.annotation.NonNull InterfaceC57927yre interfaceC57927yre, int i, int i2) {
        InterfaceC57935yrm interfaceC57935yrm;
        InterfaceC57935yrm interfaceC57935yrm2 = this.dmfpNf;
        if (interfaceC57935yrm2 != null) {
            super.removeView(interfaceC57935yrm2.copydefault());
        }
        this.dmfpNf = interfaceC57927yre;
        this.UeEOUB = false;
        this.RJOkX = 0;
        this.fFgQHt = false;
        this.finit = false;
        this.RcXXUw = this.RcXXUw.copydefault();
        this.zuBGHE = !this.DCJXGO || this.zuBGHE;
        if (this.dmfpNf != null) {
            if (i == 0) {
                i = -1;
            }
            if (i2 == 0) {
                i2 = -2;
            }
            Application application = new Application(i, i2);
            ViewGroup.LayoutParams layoutParams = interfaceC57927yre.copydefault().getLayoutParams();
            if (layoutParams instanceof Application) {
                application = (Application) layoutParams;
            }
            if (this.dmfpNf.KWHzl().gEmmrt) {
                super.addView(this.dmfpNf.copydefault(), getChildCount(), application);
            } else {
                super.addView(this.dmfpNf.copydefault(), 0, application);
            }
            int[] iArr = this.QkdxfA;
            if (iArr != null && (interfaceC57935yrm = this.dmfpNf) != null) {
                interfaceC57935yrm.setPrimaryColors(iArr);
            }
        }
        return this;
    }

    public InterfaceC57934yrl EZpvd(@androidx.annotation.NonNull android.view.View view) {
        return AEQbTJ(view, 0, 0);
    }

    public InterfaceC57934yrl AEQbTJ(@androidx.annotation.NonNull android.view.View view, int i, int i2) {
        InterfaceC57928yrf interfaceC57928yrf = this.hBpjJd;
        if (interfaceC57928yrf != null) {
            super.removeView(interfaceC57928yrf.EZpvd());
        }
        if (i == 0) {
            i = -1;
        }
        if (i2 == 0) {
            i2 = -1;
        }
        Application application = new Application(i, i2);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof Application) {
            application = (Application) layoutParams;
        }
        super.addView(view, getChildCount(), application);
        this.hBpjJd = new C57941yrs(view);
        if (this.ejfBZ) {
            android.view.View viewFindViewById = findViewById(this.QVAiDq);
            android.view.View viewFindViewById2 = findViewById(this.QfsBiF);
            this.hBpjJd.AEQbTJ(this.ODXsMY);
            this.hBpjJd.EZpvd(this.AxsJAY);
            this.hBpjJd.KWHzl(this.AxsJAYsNCnLh, viewFindViewById, viewFindViewById2);
        }
        InterfaceC57935yrm interfaceC57935yrm = this.RdAHlO;
        if (interfaceC57935yrm != null && interfaceC57935yrm.KWHzl().gEmmrt) {
            super.bringChildToFront(this.RdAHlO.copydefault());
        }
        InterfaceC57935yrm interfaceC57935yrm2 = this.dmfpNf;
        if (interfaceC57935yrm2 != null && interfaceC57935yrm2.KWHzl().gEmmrt) {
            super.bringChildToFront(this.dmfpNf.copydefault());
        }
        return this;
    }

    @Override // o.InterfaceC57934yrl
    public InterfaceC57927yre isConnected() {
        InterfaceC57935yrm interfaceC57935yrm = this.dmfpNf;
        if (interfaceC57935yrm instanceof InterfaceC57927yre) {
            return (InterfaceC57927yre) interfaceC57935yrm;
        }
        return null;
    }

    public InterfaceC57934yrl KWHzl(InterfaceC57932yrj interfaceC57932yrj) {
        this.ODXsMY = interfaceC57932yrj;
        InterfaceC57928yrf interfaceC57928yrf = this.hBpjJd;
        if (interfaceC57928yrf != null) {
            interfaceC57928yrf.AEQbTJ(interfaceC57932yrj);
        }
        return this;
    }

    public InterfaceC57934yrl KWHzl(boolean z) {
        RefreshState refreshState = this.hrNTAI;
        if (refreshState == RefreshState.Refreshing && z) {
            OLrzqt();
        } else if (refreshState == RefreshState.Loading && z) {
            AYXKKw();
        } else if (this.fZBcTu != z) {
            this.fZBcTu = z;
            InterfaceC57935yrm interfaceC57935yrm = this.dmfpNf;
            if (interfaceC57935yrm instanceof InterfaceC57927yre) {
                if (((InterfaceC57927yre) interfaceC57935yrm).AEQbTJ(z)) {
                    this.fFgQHt = true;
                    if (this.fZBcTu && this.zsXlph && this.OHqIaq > 0 && this.dmfpNf.KWHzl() == C57940yrr.KWHzl && EZpvd(this.zuBGHE) && AEQbTJ(this.QOLQEE, this.RdAHlO)) {
                        this.dmfpNf.copydefault().setTranslationY(this.OHqIaq);
                    }
                } else {
                    this.fFgQHt = false;
                    new java.lang.RuntimeException("Footer:" + this.dmfpNf + " NoMoreData is not supported.(不支持NoMoreData，请使用[ClassicsFooter]或者[自定义Footer并实现setNoMoreData方法且返回true])").printStackTrace();
                }
            }
        }
        return this;
    }

    public InterfaceC57934yrl copydefault() {
        return KWHzl(false);
    }

    public InterfaceC57934yrl AEQbTJ() {
        return AEQbTJ(true);
    }

    public InterfaceC57934yrl valueOf() {
        return copydefault(true);
    }

    public InterfaceC57934yrl KWHzl(int i) {
        return KWHzl(i, true, java.lang.Boolean.FALSE);
    }

    public InterfaceC57934yrl AEQbTJ(boolean z) {
        if (z) {
            return KWHzl(java.lang.Math.min(java.lang.Math.max(0, 300 - ((int) (java.lang.System.currentTimeMillis() - this.accept))), 300) << 16, true, java.lang.Boolean.FALSE);
        }
        return KWHzl(0, false, (java.lang.Boolean) null);
    }

    public InterfaceC57934yrl KWHzl(int i, final boolean z, final java.lang.Boolean bool) {
        int i2 = (i << 16) >> 16;
        final int i3 = i >> 16;
        java.lang.Runnable runnable = new java.lang.Runnable() { // from class: o.yqZ.9
            public int OLrzqt = 0;

            @Override // java.lang.Runnable
            public void run() {
                int i4 = this.OLrzqt;
                if (i4 == 0) {
                    C57869yqZ c57869yqZ = C57869yqZ.this;
                    RefreshState refreshState = c57869yqZ.hrNTAI;
                    RefreshState refreshState2 = RefreshState.None;
                    if (refreshState == refreshState2 && c57869yqZ.dUDNAs == RefreshState.Refreshing) {
                        c57869yqZ.dUDNAs = refreshState2;
                    } else {
                        android.animation.ValueAnimator valueAnimator = c57869yqZ.UlJrfe;
                        if (valueAnimator != null && refreshState.isHeader && (refreshState.isDragging || refreshState == RefreshState.RefreshReleased)) {
                            valueAnimator.setDuration(0L);
                            C57869yqZ.this.UlJrfe.cancel();
                            C57869yqZ c57869yqZ2 = C57869yqZ.this;
                            c57869yqZ2.UlJrfe = null;
                            if (c57869yqZ2.AxsJAYsNCnLh.KWHzl(0) == null) {
                                C57869yqZ.this.EZpvd(refreshState2);
                            } else {
                                C57869yqZ.this.EZpvd(RefreshState.PullDownCanceled);
                            }
                        } else if (refreshState == RefreshState.Refreshing && c57869yqZ.RdAHlO != null && c57869yqZ.hBpjJd != null) {
                            this.OLrzqt = i4 + 1;
                            c57869yqZ.fvQaOB.postDelayed(this, i3);
                            C57869yqZ.this.EZpvd(RefreshState.RefreshFinish);
                            if (bool == java.lang.Boolean.FALSE) {
                                C57869yqZ.this.KWHzl(false);
                            }
                        }
                    }
                    if (bool == java.lang.Boolean.TRUE) {
                        C57869yqZ.this.KWHzl(true);
                        return;
                    }
                    return;
                }
                C57869yqZ c57869yqZ3 = C57869yqZ.this;
                int iEZpvd = c57869yqZ3.RdAHlO.EZpvd(c57869yqZ3, z);
                C57869yqZ c57869yqZ4 = C57869yqZ.this;
                InterfaceC57902yrF interfaceC57902yrF = c57869yqZ4.DCUTEI;
                if (interfaceC57902yrF != null) {
                    InterfaceC57935yrm interfaceC57935yrm = c57869yqZ4.RdAHlO;
                    if (interfaceC57935yrm instanceof InterfaceC57933yrk) {
                        interfaceC57902yrF.AEQbTJ((InterfaceC57933yrk) interfaceC57935yrm, z);
                    }
                }
                if (iEZpvd < Integer.MAX_VALUE) {
                    C57869yqZ c57869yqZ5 = C57869yqZ.this;
                    if (c57869yqZ5.hUfVAv || c57869yqZ5.ffGIBT) {
                        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                        C57869yqZ c57869yqZ6 = C57869yqZ.this;
                        if (c57869yqZ6.hUfVAv) {
                            float f = c57869yqZ6.DAIeex;
                            c57869yqZ6.OxVOHk = f;
                            c57869yqZ6.OJuSTm = 0;
                            c57869yqZ6.hUfVAv = false;
                            C57869yqZ.super.dispatchTouchEvent(android.view.MotionEvent.obtain(jCurrentTimeMillis, jCurrentTimeMillis, 0, c57869yqZ6.RlQdEF, (f + c57869yqZ6.OHqIaq) - (c57869yqZ6.QCjLjM * 2), 0));
                            C57869yqZ c57869yqZ7 = C57869yqZ.this;
                            C57869yqZ.super.dispatchTouchEvent(android.view.MotionEvent.obtain(jCurrentTimeMillis, jCurrentTimeMillis, 2, c57869yqZ7.RlQdEF, c57869yqZ7.DAIeex + c57869yqZ7.OHqIaq, 0));
                        }
                        C57869yqZ c57869yqZ8 = C57869yqZ.this;
                        if (c57869yqZ8.ffGIBT) {
                            c57869yqZ8.QSLkRj = 0;
                            C57869yqZ.super.dispatchTouchEvent(android.view.MotionEvent.obtain(jCurrentTimeMillis, jCurrentTimeMillis, 1, c57869yqZ8.RlQdEF, c57869yqZ8.DAIeex, 0));
                            C57869yqZ c57869yqZ9 = C57869yqZ.this;
                            c57869yqZ9.ffGIBT = false;
                            c57869yqZ9.OJuSTm = 0;
                        }
                    }
                    C57869yqZ c57869yqZ10 = C57869yqZ.this;
                    int i5 = c57869yqZ10.OHqIaq;
                    if (i5 <= 0) {
                        if (i5 < 0) {
                            c57869yqZ10.OLrzqt(0, iEZpvd, c57869yqZ10.QHmsKR, c57869yqZ10.RKDWNf);
                            return;
                        } else {
                            c57869yqZ10.AxsJAYsNCnLh.copydefault(0, false);
                            C57869yqZ.this.AxsJAYsNCnLh.AEQbTJ(RefreshState.None);
                            return;
                        }
                    }
                    android.animation.ValueAnimator valueAnimatorOLrzqt = c57869yqZ10.OLrzqt(0, iEZpvd, c57869yqZ10.QHmsKR, c57869yqZ10.RKDWNf);
                    C57869yqZ c57869yqZ11 = C57869yqZ.this;
                    ValueAnimator.AnimatorUpdateListener animatorUpdateListenerKWHzl = c57869yqZ11.DTwDnp ? c57869yqZ11.hBpjJd.KWHzl(c57869yqZ11.OHqIaq) : null;
                    if (valueAnimatorOLrzqt == null || animatorUpdateListenerKWHzl == null) {
                        return;
                    }
                    valueAnimatorOLrzqt.addUpdateListener(animatorUpdateListenerKWHzl);
                }
            }
        };
        if (i2 > 0) {
            this.fvQaOB.postDelayed(runnable, i2);
        } else {
            runnable.run();
        }
        return this;
    }

    public InterfaceC57934yrl OLrzqt() {
        return KWHzl(java.lang.Math.min(java.lang.Math.max(0, 300 - ((int) (java.lang.System.currentTimeMillis() - this.accept))), 300) << 16, true, java.lang.Boolean.TRUE);
    }

    public InterfaceC57934yrl AEQbTJ(int i) {
        return copydefault(i, true, false);
    }

    public InterfaceC57934yrl copydefault(boolean z) {
        return copydefault(z ? java.lang.Math.min(java.lang.Math.max(0, 300 - ((int) (java.lang.System.currentTimeMillis() - this.accept))), 300) << 16 : 0, z, false);
    }

    /* JADX INFO: renamed from: o.yqZ$7, reason: invalid class name */
    public class AnonymousClass7 implements java.lang.Runnable {
        public int EZpvd = 0;
        public final /* synthetic */ boolean KWHzl;
        public final /* synthetic */ int OLrzqt;
        public final /* synthetic */ boolean copydefault;

        public AnonymousClass7(int i, boolean z, boolean z2) {
            this.OLrzqt = i;
            this.copydefault = z;
            this.KWHzl = z2;
        }

        /* JADX WARN: Removed duplicated region for block: B:48:0x00b3  */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void run() {
            boolean z;
            int i = this.EZpvd;
            if (i == 0) {
                C57869yqZ c57869yqZ = C57869yqZ.this;
                RefreshState refreshState = c57869yqZ.hrNTAI;
                RefreshState refreshState2 = RefreshState.None;
                if (refreshState == refreshState2 && c57869yqZ.dUDNAs == RefreshState.Loading) {
                    c57869yqZ.dUDNAs = refreshState2;
                } else {
                    android.animation.ValueAnimator valueAnimator = c57869yqZ.UlJrfe;
                    if (valueAnimator != null && ((refreshState.isDragging || refreshState == RefreshState.LoadReleased) && refreshState.isFooter)) {
                        valueAnimator.setDuration(0L);
                        C57869yqZ.this.UlJrfe.cancel();
                        C57869yqZ c57869yqZ2 = C57869yqZ.this;
                        c57869yqZ2.UlJrfe = null;
                        if (c57869yqZ2.AxsJAYsNCnLh.KWHzl(0) == null) {
                            C57869yqZ.this.EZpvd(refreshState2);
                        } else {
                            C57869yqZ.this.EZpvd(RefreshState.PullUpCanceled);
                        }
                    } else if (refreshState == RefreshState.Loading && c57869yqZ.dmfpNf != null && c57869yqZ.hBpjJd != null) {
                        this.EZpvd = i + 1;
                        c57869yqZ.fvQaOB.postDelayed(this, this.OLrzqt);
                        C57869yqZ.this.EZpvd(RefreshState.LoadFinish);
                        return;
                    }
                }
                if (this.copydefault) {
                    C57869yqZ.this.KWHzl(true);
                    return;
                }
                return;
            }
            C57869yqZ c57869yqZ3 = C57869yqZ.this;
            int iEZpvd = c57869yqZ3.dmfpNf.EZpvd(c57869yqZ3, this.KWHzl);
            C57869yqZ c57869yqZ4 = C57869yqZ.this;
            InterfaceC57902yrF interfaceC57902yrF = c57869yqZ4.DCUTEI;
            if (interfaceC57902yrF != null) {
                InterfaceC57935yrm interfaceC57935yrm = c57869yqZ4.dmfpNf;
                if (interfaceC57935yrm instanceof InterfaceC57927yre) {
                    interfaceC57902yrF.copydefault((InterfaceC57927yre) interfaceC57935yrm, this.KWHzl);
                }
            }
            if (iEZpvd < Integer.MAX_VALUE) {
                if (this.copydefault) {
                    C57869yqZ c57869yqZ5 = C57869yqZ.this;
                    z = c57869yqZ5.zsXlph && c57869yqZ5.OHqIaq < 0 && c57869yqZ5.hBpjJd.copydefault();
                }
                C57869yqZ c57869yqZ6 = C57869yqZ.this;
                int i2 = c57869yqZ6.OHqIaq;
                final int iMax = i2 - (z ? java.lang.Math.max(i2, -c57869yqZ6.djSkpj) : 0);
                C57869yqZ c57869yqZ7 = C57869yqZ.this;
                if (c57869yqZ7.hUfVAv || c57869yqZ7.ffGIBT) {
                    long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                    C57869yqZ c57869yqZ8 = C57869yqZ.this;
                    if (c57869yqZ8.hUfVAv) {
                        float f = c57869yqZ8.DAIeex;
                        c57869yqZ8.OxVOHk = f;
                        c57869yqZ8.OJuSTm = c57869yqZ8.OHqIaq - iMax;
                        c57869yqZ8.hUfVAv = false;
                        float f2 = c57869yqZ8.AubY ? iMax : 0;
                        C57869yqZ.super.dispatchTouchEvent(android.view.MotionEvent.obtain(jCurrentTimeMillis, jCurrentTimeMillis, 0, c57869yqZ8.RlQdEF, f + f2 + (c57869yqZ8.QCjLjM * 2), 0));
                        C57869yqZ c57869yqZ9 = C57869yqZ.this;
                        C57869yqZ.super.dispatchTouchEvent(android.view.MotionEvent.obtain(jCurrentTimeMillis, jCurrentTimeMillis, 2, c57869yqZ9.RlQdEF, c57869yqZ9.DAIeex + f2, 0));
                    }
                    C57869yqZ c57869yqZ10 = C57869yqZ.this;
                    if (c57869yqZ10.ffGIBT) {
                        c57869yqZ10.QSLkRj = 0;
                        C57869yqZ.super.dispatchTouchEvent(android.view.MotionEvent.obtain(jCurrentTimeMillis, jCurrentTimeMillis, 1, c57869yqZ10.RlQdEF, c57869yqZ10.DAIeex, 0));
                        C57869yqZ c57869yqZ11 = C57869yqZ.this;
                        c57869yqZ11.ffGIBT = false;
                        c57869yqZ11.OJuSTm = 0;
                    }
                }
                C57869yqZ.this.fvQaOB.postDelayed(new java.lang.Runnable() { // from class: o.yqZ.7.3
                    @Override // java.lang.Runnable
                    public void run() {
                        ValueAnimator.AnimatorUpdateListener animatorUpdateListenerKWHzl;
                        android.animation.ValueAnimator valueAnimatorKWHzl;
                        C57869yqZ c57869yqZ12 = C57869yqZ.this;
                        if (!c57869yqZ12.ORxRYg || iMax >= 0) {
                            animatorUpdateListenerKWHzl = null;
                        } else {
                            animatorUpdateListenerKWHzl = c57869yqZ12.hBpjJd.KWHzl(c57869yqZ12.OHqIaq);
                            if (animatorUpdateListenerKWHzl != null) {
                                animatorUpdateListenerKWHzl.onAnimationUpdate(android.animation.ValueAnimator.ofInt(0, 0));
                            }
                        }
                        android.animation.AnimatorListenerAdapter animatorListenerAdapter = new android.animation.AnimatorListenerAdapter() { // from class: o.yqZ.7.3.5
                            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                            public void onAnimationEnd(android.animation.Animator animator) {
                                if (animator == null || animator.getDuration() != 0) {
                                    AnonymousClass7 anonymousClass7 = AnonymousClass7.this;
                                    C57869yqZ c57869yqZ13 = C57869yqZ.this;
                                    c57869yqZ13.UeEOUB = false;
                                    if (anonymousClass7.copydefault) {
                                        c57869yqZ13.KWHzl(true);
                                    }
                                    C57869yqZ c57869yqZ14 = C57869yqZ.this;
                                    if (c57869yqZ14.hrNTAI == RefreshState.LoadFinish) {
                                        c57869yqZ14.EZpvd(RefreshState.None);
                                    }
                                }
                            }
                        };
                        AnonymousClass7 anonymousClass7 = AnonymousClass7.this;
                        C57869yqZ c57869yqZ13 = C57869yqZ.this;
                        int i3 = c57869yqZ13.OHqIaq;
                        if (i3 > 0) {
                            valueAnimatorKWHzl = c57869yqZ13.AxsJAYsNCnLh.KWHzl(0);
                        } else {
                            if (animatorUpdateListenerKWHzl != null || i3 == 0) {
                                android.animation.ValueAnimator valueAnimator2 = c57869yqZ13.UlJrfe;
                                if (valueAnimator2 != null) {
                                    valueAnimator2.setDuration(0L);
                                    C57869yqZ.this.UlJrfe.cancel();
                                    C57869yqZ.this.UlJrfe = null;
                                }
                                C57869yqZ.this.AxsJAYsNCnLh.copydefault(0, false);
                                C57869yqZ.this.AxsJAYsNCnLh.AEQbTJ(RefreshState.None);
                            } else if (anonymousClass7.copydefault && c57869yqZ13.zsXlph) {
                                int i4 = -c57869yqZ13.djSkpj;
                                if (i3 >= i4) {
                                    c57869yqZ13.EZpvd(RefreshState.None);
                                } else {
                                    valueAnimatorKWHzl = c57869yqZ13.AxsJAYsNCnLh.KWHzl(i4);
                                }
                            } else {
                                valueAnimatorKWHzl = c57869yqZ13.AxsJAYsNCnLh.KWHzl(0);
                            }
                            valueAnimatorKWHzl = null;
                        }
                        if (valueAnimatorKWHzl != null) {
                            valueAnimatorKWHzl.addListener(animatorListenerAdapter);
                        } else {
                            animatorListenerAdapter.onAnimationEnd(null);
                        }
                    }
                }, C57869yqZ.this.OHqIaq < 0 ? iEZpvd : 0L);
            }
        }
    }

    public InterfaceC57934yrl copydefault(int i, boolean z, boolean z2) {
        int i2 = (i << 16) >> 16;
        AnonymousClass7 anonymousClass7 = new AnonymousClass7(i >> 16, z2, z);
        if (i2 > 0) {
            this.fvQaOB.postDelayed(anonymousClass7, i2);
        } else {
            anonymousClass7.run();
        }
        return this;
    }

    public InterfaceC57934yrl AYXKKw() {
        return copydefault(java.lang.Math.min(java.lang.Math.max(0, 300 - ((int) (java.lang.System.currentTimeMillis() - this.accept))), 300) << 16, true, true);
    }

    public boolean AhwBna() {
        int i = this.ejfBZ ? 0 : 400;
        int i2 = this.RKDWNf;
        float f = this.iRxXKY / 2.0f;
        int i3 = this.gGvvIC;
        float f2 = i3;
        if (i3 == 0) {
            i3 = 1;
        }
        return AEQbTJ(i, i2, (((f + 0.5f) * f2) * 1.0f) / i3, false);
    }

    public boolean djBIcL() {
        int i = this.ejfBZ ? 0 : 400;
        int i2 = this.RKDWNf;
        float f = this.iRxXKY / 2.0f;
        int i3 = this.gGvvIC;
        float f2 = i3;
        if (i3 == 0) {
            i3 = 1;
        }
        return AEQbTJ(i, i2, (((f + 0.5f) * f2) * 1.0f) / i3, true);
    }

    public boolean AEQbTJ(int i, final int i2, final float f, final boolean z) {
        if (this.hrNTAI != RefreshState.None || !EZpvd(this.QOLQEE)) {
            return false;
        }
        java.lang.Runnable runnable = new java.lang.Runnable() { // from class: o.yqZ.6
            @Override // java.lang.Runnable
            public void run() {
                C57869yqZ c57869yqZ = C57869yqZ.this;
                if (c57869yqZ.dUDNAs != RefreshState.Refreshing) {
                    return;
                }
                android.animation.ValueAnimator valueAnimator = c57869yqZ.UlJrfe;
                if (valueAnimator != null) {
                    valueAnimator.setDuration(0L);
                    C57869yqZ.this.UlJrfe.cancel();
                    C57869yqZ.this.UlJrfe = null;
                }
                C57869yqZ.this.RlQdEF = r0.getMeasuredWidth() / 2.0f;
                C57869yqZ.this.AxsJAYsNCnLh.AEQbTJ(RefreshState.PullDownToRefresh);
                C57869yqZ c57869yqZ2 = C57869yqZ.this;
                c57869yqZ2.UlJrfe = android.animation.ValueAnimator.ofInt(c57869yqZ2.OHqIaq, (int) (c57869yqZ2.gGvvIC * f));
                C57869yqZ.this.UlJrfe.setDuration(i2);
                C57869yqZ.this.UlJrfe.setInterpolator(new InterpolatorC57905yrI(InterpolatorC57905yrI.KWHzl));
                C57869yqZ.this.UlJrfe.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o.yqZ.6.3
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator2) {
                        C57869yqZ c57869yqZ3 = C57869yqZ.this;
                        if (c57869yqZ3.UlJrfe == null || c57869yqZ3.RdAHlO == null) {
                            return;
                        }
                        c57869yqZ3.AxsJAYsNCnLh.copydefault(((java.lang.Integer) valueAnimator2.getAnimatedValue()).intValue(), true);
                    }
                });
                C57869yqZ.this.UlJrfe.addListener(new android.animation.AnimatorListenerAdapter() { // from class: o.yqZ.6.1
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(android.animation.Animator animator) {
                        if (animator == null || animator.getDuration() != 0) {
                            C57869yqZ c57869yqZ3 = C57869yqZ.this;
                            c57869yqZ3.UlJrfe = null;
                            if (c57869yqZ3.RdAHlO != null) {
                                RefreshState refreshState = c57869yqZ3.hrNTAI;
                                RefreshState refreshState2 = RefreshState.ReleaseToRefresh;
                                if (refreshState != refreshState2) {
                                    c57869yqZ3.AxsJAYsNCnLh.AEQbTJ(refreshState2);
                                }
                                C57869yqZ.this.setStateRefreshing(!z);
                                return;
                            }
                            c57869yqZ3.AxsJAYsNCnLh.AEQbTJ(RefreshState.None);
                        }
                    }
                });
                C57869yqZ.this.UlJrfe.start();
            }
        };
        setViceState(RefreshState.Refreshing);
        if (i > 0) {
            this.fvQaOB.postDelayed(runnable, i);
            return true;
        }
        runnable.run();
        return true;
    }

    public boolean gEmmrt() {
        int i = this.RKDWNf;
        int i2 = this.djSkpj;
        float f = i2;
        float f2 = this.aKErDB / 2.0f;
        if (i2 == 0) {
            i2 = 1;
        }
        return KWHzl(0, i, ((f * (f2 + 0.5f)) * 1.0f) / i2, false);
    }

    public boolean KWHzl(int i, final int i2, final float f, final boolean z) {
        if (this.hrNTAI != RefreshState.None || !EZpvd(this.zuBGHE) || this.fZBcTu) {
            return false;
        }
        java.lang.Runnable runnable = new java.lang.Runnable() { // from class: o.yqZ.8
            @Override // java.lang.Runnable
            public void run() {
                C57869yqZ c57869yqZ = C57869yqZ.this;
                if (c57869yqZ.dUDNAs != RefreshState.Loading) {
                    return;
                }
                android.animation.ValueAnimator valueAnimator = c57869yqZ.UlJrfe;
                if (valueAnimator != null) {
                    valueAnimator.setDuration(0L);
                    C57869yqZ.this.UlJrfe.cancel();
                    C57869yqZ.this.UlJrfe = null;
                }
                C57869yqZ.this.RlQdEF = r0.getMeasuredWidth() / 2.0f;
                C57869yqZ.this.AxsJAYsNCnLh.AEQbTJ(RefreshState.PullUpToLoad);
                C57869yqZ c57869yqZ2 = C57869yqZ.this;
                c57869yqZ2.UlJrfe = android.animation.ValueAnimator.ofInt(c57869yqZ2.OHqIaq, -((int) (c57869yqZ2.djSkpj * f)));
                C57869yqZ.this.UlJrfe.setDuration(i2);
                C57869yqZ.this.UlJrfe.setInterpolator(new InterpolatorC57905yrI(InterpolatorC57905yrI.KWHzl));
                C57869yqZ.this.UlJrfe.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o.yqZ.8.1
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator2) {
                        C57869yqZ c57869yqZ3 = C57869yqZ.this;
                        if (c57869yqZ3.UlJrfe == null || c57869yqZ3.dmfpNf == null) {
                            return;
                        }
                        c57869yqZ3.AxsJAYsNCnLh.copydefault(((java.lang.Integer) valueAnimator2.getAnimatedValue()).intValue(), true);
                    }
                });
                C57869yqZ.this.UlJrfe.addListener(new android.animation.AnimatorListenerAdapter() { // from class: o.yqZ.8.2
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(android.animation.Animator animator) {
                        if (animator == null || animator.getDuration() != 0) {
                            C57869yqZ c57869yqZ3 = C57869yqZ.this;
                            c57869yqZ3.UlJrfe = null;
                            if (c57869yqZ3.dmfpNf != null) {
                                RefreshState refreshState = c57869yqZ3.hrNTAI;
                                RefreshState refreshState2 = RefreshState.ReleaseToLoad;
                                if (refreshState != refreshState2) {
                                    c57869yqZ3.AxsJAYsNCnLh.AEQbTJ(refreshState2);
                                }
                                C57869yqZ.this.setStateLoading(!z);
                                return;
                            }
                            c57869yqZ3.AxsJAYsNCnLh.AEQbTJ(RefreshState.None);
                        }
                    }
                });
                C57869yqZ.this.UlJrfe.start();
            }
        };
        setViceState(RefreshState.Loading);
        if (i > 0) {
            this.fvQaOB.postDelayed(runnable, i);
            return true;
        }
        runnable.run();
        return true;
    }

    /* JADX INFO: renamed from: o.yqZ$ActionBar */
    public class ActionBar implements InterfaceC57931yri {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC57931yri
        public InterfaceC57934yrl copydefault() {
            return C57869yqZ.this;
        }

        public ActionBar() {
        }

        @Override // o.InterfaceC57931yri
        public InterfaceC57931yri AEQbTJ(@androidx.annotation.NonNull RefreshState refreshState) {
            switch (AnonymousClass4.EZpvd[refreshState.ordinal()]) {
                case 1:
                    C57869yqZ c57869yqZ = C57869yqZ.this;
                    RefreshState refreshState2 = c57869yqZ.hrNTAI;
                    RefreshState refreshState3 = RefreshState.None;
                    if (refreshState2 != refreshState3 && c57869yqZ.OHqIaq == 0) {
                        c57869yqZ.EZpvd(refreshState3);
                    } else if (c57869yqZ.OHqIaq != 0) {
                        KWHzl(0);
                    }
                    break;
                case 2:
                    C57869yqZ c57869yqZ2 = C57869yqZ.this;
                    if (!c57869yqZ2.hrNTAI.isOpening && c57869yqZ2.EZpvd(c57869yqZ2.QOLQEE)) {
                        C57869yqZ.this.EZpvd(RefreshState.PullDownToRefresh);
                    } else {
                        C57869yqZ.this.setViceState(RefreshState.PullDownToRefresh);
                    }
                    break;
                case 3:
                    C57869yqZ c57869yqZ3 = C57869yqZ.this;
                    if (c57869yqZ3.EZpvd(c57869yqZ3.zuBGHE)) {
                        C57869yqZ c57869yqZ4 = C57869yqZ.this;
                        RefreshState refreshState4 = c57869yqZ4.hrNTAI;
                        if (!refreshState4.isOpening && !refreshState4.isFinishing && (!c57869yqZ4.fZBcTu || !c57869yqZ4.zsXlph || !c57869yqZ4.fFgQHt)) {
                            c57869yqZ4.EZpvd(RefreshState.PullUpToLoad);
                        }
                    }
                    C57869yqZ.this.setViceState(RefreshState.PullUpToLoad);
                    break;
                case 4:
                    C57869yqZ c57869yqZ5 = C57869yqZ.this;
                    if (!c57869yqZ5.hrNTAI.isOpening && c57869yqZ5.EZpvd(c57869yqZ5.QOLQEE)) {
                        C57869yqZ.this.EZpvd(RefreshState.PullDownCanceled);
                        AEQbTJ(RefreshState.None);
                    } else {
                        C57869yqZ.this.setViceState(RefreshState.PullDownCanceled);
                    }
                    break;
                case 5:
                    C57869yqZ c57869yqZ6 = C57869yqZ.this;
                    if (c57869yqZ6.EZpvd(c57869yqZ6.zuBGHE)) {
                        C57869yqZ c57869yqZ7 = C57869yqZ.this;
                        if (!c57869yqZ7.hrNTAI.isOpening && (!c57869yqZ7.fZBcTu || !c57869yqZ7.zsXlph || !c57869yqZ7.fFgQHt)) {
                            c57869yqZ7.EZpvd(RefreshState.PullUpCanceled);
                            AEQbTJ(RefreshState.None);
                        }
                    }
                    C57869yqZ.this.setViceState(RefreshState.PullUpCanceled);
                    break;
                case 6:
                    C57869yqZ c57869yqZ8 = C57869yqZ.this;
                    if (!c57869yqZ8.hrNTAI.isOpening && c57869yqZ8.EZpvd(c57869yqZ8.QOLQEE)) {
                        C57869yqZ.this.EZpvd(RefreshState.ReleaseToRefresh);
                    } else {
                        C57869yqZ.this.setViceState(RefreshState.ReleaseToRefresh);
                    }
                    break;
                case 7:
                    C57869yqZ c57869yqZ9 = C57869yqZ.this;
                    if (c57869yqZ9.EZpvd(c57869yqZ9.zuBGHE)) {
                        C57869yqZ c57869yqZ10 = C57869yqZ.this;
                        RefreshState refreshState5 = c57869yqZ10.hrNTAI;
                        if (!refreshState5.isOpening && !refreshState5.isFinishing && (!c57869yqZ10.fZBcTu || !c57869yqZ10.zsXlph || !c57869yqZ10.fFgQHt)) {
                            c57869yqZ10.EZpvd(RefreshState.ReleaseToLoad);
                        }
                    }
                    C57869yqZ.this.setViceState(RefreshState.ReleaseToLoad);
                    break;
                case 8:
                    C57869yqZ c57869yqZ11 = C57869yqZ.this;
                    if (!c57869yqZ11.hrNTAI.isOpening && c57869yqZ11.EZpvd(c57869yqZ11.QOLQEE)) {
                        C57869yqZ.this.EZpvd(RefreshState.ReleaseToTwoLevel);
                    } else {
                        C57869yqZ.this.setViceState(RefreshState.ReleaseToTwoLevel);
                    }
                    break;
                case 9:
                    C57869yqZ c57869yqZ12 = C57869yqZ.this;
                    if (!c57869yqZ12.hrNTAI.isOpening && c57869yqZ12.EZpvd(c57869yqZ12.QOLQEE)) {
                        C57869yqZ.this.EZpvd(RefreshState.RefreshReleased);
                    } else {
                        C57869yqZ.this.setViceState(RefreshState.RefreshReleased);
                    }
                    break;
                case 10:
                    C57869yqZ c57869yqZ13 = C57869yqZ.this;
                    if (!c57869yqZ13.hrNTAI.isOpening && c57869yqZ13.EZpvd(c57869yqZ13.zuBGHE)) {
                        C57869yqZ.this.EZpvd(RefreshState.LoadReleased);
                    } else {
                        C57869yqZ.this.setViceState(RefreshState.LoadReleased);
                    }
                    break;
                case 11:
                    C57869yqZ.this.setStateRefreshing(true);
                    break;
                case 12:
                    C57869yqZ.this.setStateLoading(true);
                    break;
                default:
                    C57869yqZ.this.EZpvd(refreshState);
                    break;
            }
            return null;
        }

        /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
        @Override // o.InterfaceC57931yri
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public InterfaceC57931yri KWHzl(boolean z) {
            if (z) {
                android.animation.AnimatorListenerAdapter animatorListenerAdapter = new android.animation.AnimatorListenerAdapter() { // from class: o.yqZ.ActionBar.5
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(android.animation.Animator animator) {
                        if (animator == null || animator.getDuration() != 0) {
                            C57869yqZ.this.AxsJAYsNCnLh.AEQbTJ(RefreshState.TwoLevel);
                        }
                    }
                };
                android.animation.ValueAnimator valueAnimatorKWHzl = KWHzl(C57869yqZ.this.getMeasuredHeight());
                if (valueAnimatorKWHzl != null) {
                    if (valueAnimatorKWHzl == C57869yqZ.this.UlJrfe) {
                        valueAnimatorKWHzl.setDuration(r1.QUSxYX);
                        valueAnimatorKWHzl.addListener(animatorListenerAdapter);
                    } else {
                        animatorListenerAdapter.onAnimationEnd(null);
                    }
                }
            } else if (KWHzl(0) == null) {
                C57869yqZ.this.EZpvd(RefreshState.None);
            }
            return this;
        }

        @Override // o.InterfaceC57931yri
        public InterfaceC57931yri KWHzl() {
            C57869yqZ c57869yqZ = C57869yqZ.this;
            if (c57869yqZ.hrNTAI == RefreshState.TwoLevel) {
                c57869yqZ.AxsJAYsNCnLh.AEQbTJ(RefreshState.TwoLevelFinish);
                if (C57869yqZ.this.OHqIaq == 0) {
                    copydefault(0, false);
                    C57869yqZ.this.EZpvd(RefreshState.None);
                } else {
                    KWHzl(0).setDuration(C57869yqZ.this.QUSxYX);
                }
            }
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:48:0x009c  */
        /* JADX WARN: Removed duplicated region for block: B:52:0x00aa  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x00ad  */
        /* JADX WARN: Removed duplicated region for block: B:57:0x00b3  */
        @Override // o.InterfaceC57931yri
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public InterfaceC57931yri copydefault(int i, boolean z) {
            int i2;
            InterfaceC57902yrF interfaceC57902yrF;
            InterfaceC57902yrF interfaceC57902yrF2;
            int i3;
            boolean z2;
            InterfaceC57935yrm interfaceC57935yrm;
            InterfaceC57935yrm interfaceC57935yrm2;
            C57869yqZ c57869yqZ;
            InterfaceC57935yrm interfaceC57935yrm3;
            InterfaceC57935yrm interfaceC57935yrm4;
            InterfaceC57935yrm interfaceC57935yrm5;
            InterfaceC57935yrm interfaceC57935yrm6;
            C57869yqZ c57869yqZ2 = C57869yqZ.this;
            if (c57869yqZ2.OHqIaq == i && (((interfaceC57935yrm5 = c57869yqZ2.RdAHlO) == null || !interfaceC57935yrm5.gEmmrt()) && ((interfaceC57935yrm6 = C57869yqZ.this.dmfpNf) == null || !interfaceC57935yrm6.gEmmrt()))) {
                return this;
            }
            C57869yqZ c57869yqZ3 = C57869yqZ.this;
            int i4 = c57869yqZ3.OHqIaq;
            c57869yqZ3.OHqIaq = i;
            if (z) {
                RefreshState refreshState = c57869yqZ3.dUDNAs;
                if (refreshState.isDragging || refreshState.isOpening) {
                    if (i > c57869yqZ3.gGvvIC * c57869yqZ3.iZzfmt) {
                        if (c57869yqZ3.hrNTAI != RefreshState.ReleaseToTwoLevel) {
                            c57869yqZ3.AxsJAYsNCnLh.AEQbTJ(RefreshState.ReleaseToRefresh);
                        }
                    } else if ((-i) > c57869yqZ3.djSkpj * c57869yqZ3.dxcTrN && !c57869yqZ3.fZBcTu) {
                        c57869yqZ3.AxsJAYsNCnLh.AEQbTJ(RefreshState.ReleaseToLoad);
                    } else if (i < 0 && !c57869yqZ3.fZBcTu) {
                        c57869yqZ3.AxsJAYsNCnLh.AEQbTJ(RefreshState.PullUpToLoad);
                    } else if (i > 0) {
                        c57869yqZ3.AxsJAYsNCnLh.AEQbTJ(RefreshState.PullDownToRefresh);
                    }
                }
            }
            C57869yqZ c57869yqZ4 = C57869yqZ.this;
            if (c57869yqZ4.hBpjJd != null) {
                if (i < 0 || (interfaceC57935yrm4 = c57869yqZ4.RdAHlO) == null) {
                    i3 = 0;
                    z2 = false;
                    if (i <= 0 && (interfaceC57935yrm3 = (c57869yqZ = C57869yqZ.this).dmfpNf) != null) {
                        if (!c57869yqZ.AEQbTJ(c57869yqZ.AubY, interfaceC57935yrm3)) {
                            i3 = i;
                        } else if (i4 > 0) {
                            i3 = 0;
                        }
                        z2 = true;
                    }
                    if (z2) {
                        C57869yqZ c57869yqZ5 = C57869yqZ.this;
                        c57869yqZ5.hBpjJd.KWHzl(i3, c57869yqZ5.AxsJAYaxsJAY, c57869yqZ5.dvKsVJ);
                        C57869yqZ c57869yqZ6 = C57869yqZ.this;
                        if (c57869yqZ6.fZBcTu && c57869yqZ6.fFgQHt && c57869yqZ6.zsXlph) {
                            InterfaceC57935yrm interfaceC57935yrm7 = c57869yqZ6.dmfpNf;
                            if ((interfaceC57935yrm7 instanceof InterfaceC57927yre) && interfaceC57935yrm7.KWHzl() == C57940yrr.KWHzl) {
                                C57869yqZ c57869yqZ7 = C57869yqZ.this;
                                if (c57869yqZ7.EZpvd(c57869yqZ7.zuBGHE)) {
                                    C57869yqZ.this.dmfpNf.copydefault().setTranslationY(java.lang.Math.max(0, i3));
                                }
                            }
                        }
                        C57869yqZ c57869yqZ8 = C57869yqZ.this;
                        boolean z3 = (c57869yqZ8.zLjUOn && (interfaceC57935yrm2 = c57869yqZ8.RdAHlO) != null && interfaceC57935yrm2.KWHzl() == C57940yrr.OLrzqt) || C57869yqZ.this.giSNqX != 0;
                        C57869yqZ c57869yqZ9 = C57869yqZ.this;
                        boolean z4 = (c57869yqZ9.getFieldNames && (interfaceC57935yrm = c57869yqZ9.dmfpNf) != null && interfaceC57935yrm.KWHzl() == C57940yrr.OLrzqt) || C57869yqZ.this.RJOkX != 0;
                        if ((z3 && (i3 >= 0 || i4 > 0)) || (z4 && (i3 <= 0 || i4 < 0))) {
                            c57869yqZ3.invalidate();
                        }
                    }
                } else {
                    if (c57869yqZ4.AEQbTJ(c57869yqZ4.AuCTelauCTel, interfaceC57935yrm4)) {
                        i3 = i;
                    } else {
                        if (i4 < 0) {
                            i3 = 0;
                        }
                        i3 = 0;
                        z2 = false;
                        if (i <= 0) {
                            if (!c57869yqZ.AEQbTJ(c57869yqZ.AubY, interfaceC57935yrm3)) {
                            }
                            z2 = true;
                        }
                        if (z2) {
                        }
                    }
                    z2 = true;
                    if (i <= 0) {
                    }
                    if (z2) {
                    }
                }
            }
            if ((i >= 0 || i4 > 0) && C57869yqZ.this.RdAHlO != null) {
                int iMax = java.lang.Math.max(i, 0);
                C57869yqZ c57869yqZ10 = C57869yqZ.this;
                int i5 = c57869yqZ10.gGvvIC;
                int i6 = (int) (i5 * c57869yqZ10.iRxXKY);
                float f = (iMax * 1.0f) / (i5 == 0 ? 1 : i5);
                if (c57869yqZ10.EZpvd(c57869yqZ10.QOLQEE) || (C57869yqZ.this.hrNTAI == RefreshState.RefreshFinish && !z)) {
                    C57869yqZ c57869yqZ11 = C57869yqZ.this;
                    if (i4 != c57869yqZ11.OHqIaq) {
                        if (c57869yqZ11.RdAHlO.KWHzl() == C57940yrr.KWHzl) {
                            C57869yqZ.this.RdAHlO.copydefault().setTranslationY(C57869yqZ.this.OHqIaq);
                            C57869yqZ c57869yqZ12 = C57869yqZ.this;
                            if (c57869yqZ12.giSNqX != 0 && c57869yqZ12.OBJEWx != null && !c57869yqZ12.AEQbTJ(c57869yqZ12.AuCTelauCTel, c57869yqZ12.RdAHlO)) {
                                c57869yqZ3.invalidate();
                            }
                        } else if (C57869yqZ.this.RdAHlO.KWHzl().AhwBna) {
                            android.view.View viewCopydefault = C57869yqZ.this.RdAHlO.copydefault();
                            ViewGroup.LayoutParams layoutParams = viewCopydefault.getLayoutParams();
                            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : C57869yqZ.AkhnZx;
                            viewCopydefault.measure(View.MeasureSpec.makeMeasureSpec(viewCopydefault.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(java.lang.Math.max((C57869yqZ.this.OHqIaq - marginLayoutParams.bottomMargin) - marginLayoutParams.topMargin, 0), 1073741824));
                            int i7 = marginLayoutParams.leftMargin;
                            int i8 = marginLayoutParams.topMargin + C57869yqZ.this.gasjUx;
                            viewCopydefault.layout(i7, i8, viewCopydefault.getMeasuredWidth() + i7, viewCopydefault.getMeasuredHeight() + i8);
                        }
                        i2 = i6;
                        C57869yqZ.this.RdAHlO.copydefault(z, f, iMax, i5, i6);
                    } else {
                        i2 = i6;
                    }
                    if (z && C57869yqZ.this.RdAHlO.gEmmrt()) {
                        int i9 = (int) C57869yqZ.this.RlQdEF;
                        int width = c57869yqZ3.getWidth();
                        C57869yqZ c57869yqZ13 = C57869yqZ.this;
                        c57869yqZ13.RdAHlO.OLrzqt(c57869yqZ13.RlQdEF / (width == 0 ? 1 : width), i9, width);
                    }
                } else {
                    i2 = i6;
                }
                C57869yqZ c57869yqZ14 = C57869yqZ.this;
                if (i4 != c57869yqZ14.OHqIaq && (interfaceC57902yrF = c57869yqZ14.DCUTEI) != null) {
                    InterfaceC57935yrm interfaceC57935yrm8 = c57869yqZ14.RdAHlO;
                    if (interfaceC57935yrm8 instanceof InterfaceC57933yrk) {
                        interfaceC57902yrF.KWHzl((InterfaceC57933yrk) interfaceC57935yrm8, z, f, iMax, i5, i2);
                    }
                }
            }
            if ((i <= 0 || i4 < 0) && C57869yqZ.this.dmfpNf != null) {
                int i10 = -java.lang.Math.min(i, 0);
                C57869yqZ c57869yqZ15 = C57869yqZ.this;
                int i11 = c57869yqZ15.djSkpj;
                int i12 = (int) (i11 * c57869yqZ15.aKErDB);
                float f2 = (i10 * 1.0f) / (i11 == 0 ? 1 : i11);
                if (c57869yqZ15.EZpvd(c57869yqZ15.zuBGHE) || (C57869yqZ.this.hrNTAI == RefreshState.LoadFinish && !z)) {
                    C57869yqZ c57869yqZ16 = C57869yqZ.this;
                    if (i4 != c57869yqZ16.OHqIaq) {
                        if (c57869yqZ16.dmfpNf.KWHzl() == C57940yrr.KWHzl) {
                            C57869yqZ.this.dmfpNf.copydefault().setTranslationY(C57869yqZ.this.OHqIaq);
                            C57869yqZ c57869yqZ17 = C57869yqZ.this;
                            if (c57869yqZ17.RJOkX != 0 && c57869yqZ17.OBJEWx != null && !c57869yqZ17.AEQbTJ(c57869yqZ17.AubY, c57869yqZ17.dmfpNf)) {
                                c57869yqZ3.invalidate();
                            }
                        } else if (C57869yqZ.this.dmfpNf.KWHzl().AhwBna) {
                            android.view.View viewCopydefault2 = C57869yqZ.this.dmfpNf.copydefault();
                            ViewGroup.LayoutParams layoutParams2 = viewCopydefault2.getLayoutParams();
                            ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : C57869yqZ.AkhnZx;
                            viewCopydefault2.measure(View.MeasureSpec.makeMeasureSpec(viewCopydefault2.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(java.lang.Math.max(((-C57869yqZ.this.OHqIaq) - marginLayoutParams2.bottomMargin) - marginLayoutParams2.topMargin, 0), 1073741824));
                            int i13 = marginLayoutParams2.leftMargin;
                            int measuredHeight = (marginLayoutParams2.topMargin + c57869yqZ3.getMeasuredHeight()) - C57869yqZ.this.dNCPSb;
                            viewCopydefault2.layout(i13, measuredHeight - viewCopydefault2.getMeasuredHeight(), viewCopydefault2.getMeasuredWidth() + i13, measuredHeight);
                        }
                        C57869yqZ.this.dmfpNf.copydefault(z, f2, i10, i11, i12);
                    }
                    if (z && C57869yqZ.this.dmfpNf.gEmmrt()) {
                        int i14 = (int) C57869yqZ.this.RlQdEF;
                        int width2 = c57869yqZ3.getWidth();
                        C57869yqZ c57869yqZ18 = C57869yqZ.this;
                        c57869yqZ18.dmfpNf.OLrzqt(c57869yqZ18.RlQdEF / (width2 != 0 ? width2 : 1), i14, width2);
                    }
                }
                C57869yqZ c57869yqZ19 = C57869yqZ.this;
                if (i4 != c57869yqZ19.OHqIaq && (interfaceC57902yrF2 = c57869yqZ19.DCUTEI) != null) {
                    InterfaceC57935yrm interfaceC57935yrm9 = c57869yqZ19.dmfpNf;
                    if (interfaceC57935yrm9 instanceof InterfaceC57927yre) {
                        interfaceC57902yrF2.AEQbTJ((InterfaceC57927yre) interfaceC57935yrm9, z, f2, i10, i11, i12);
                    }
                }
            }
            return this;
        }

        @Override // o.InterfaceC57931yri
        public android.animation.ValueAnimator KWHzl(int i) {
            C57869yqZ c57869yqZ = C57869yqZ.this;
            return c57869yqZ.OLrzqt(i, 0, c57869yqZ.QHmsKR, c57869yqZ.RKDWNf);
        }

        @Override // o.InterfaceC57931yri
        public InterfaceC57931yri AEQbTJ(@androidx.annotation.NonNull InterfaceC57935yrm interfaceC57935yrm, int i) {
            C57869yqZ c57869yqZ = C57869yqZ.this;
            if (c57869yqZ.OBJEWx == null && i != 0) {
                c57869yqZ.OBJEWx = new android.graphics.Paint();
            }
            if (interfaceC57935yrm.equals(C57869yqZ.this.RdAHlO)) {
                C57869yqZ.this.giSNqX = i;
            } else if (interfaceC57935yrm.equals(C57869yqZ.this.dmfpNf)) {
                C57869yqZ.this.RJOkX = i;
            }
            return this;
        }

        @Override // o.InterfaceC57931yri
        public InterfaceC57931yri copydefault(@androidx.annotation.NonNull InterfaceC57935yrm interfaceC57935yrm, boolean z) {
            if (interfaceC57935yrm.equals(C57869yqZ.this.RdAHlO)) {
                C57869yqZ.this.gkJEwt = z;
            } else if (interfaceC57935yrm.equals(C57869yqZ.this.dmfpNf)) {
                C57869yqZ.this.finit = z;
            }
            return this;
        }

        @Override // o.InterfaceC57931yri
        public InterfaceC57931yri KWHzl(@androidx.annotation.NonNull InterfaceC57935yrm interfaceC57935yrm, boolean z) {
            if (interfaceC57935yrm.equals(C57869yqZ.this.RdAHlO)) {
                C57869yqZ c57869yqZ = C57869yqZ.this;
                if (!c57869yqZ.DXXBbs) {
                    c57869yqZ.DXXBbs = true;
                    c57869yqZ.AuCTelauCTel = z;
                }
            } else if (interfaceC57935yrm.equals(C57869yqZ.this.dmfpNf)) {
                C57869yqZ c57869yqZ2 = C57869yqZ.this;
                if (!c57869yqZ2.DarRvM) {
                    c57869yqZ2.DarRvM = true;
                    c57869yqZ2.AubY = z;
                }
            }
            return this;
        }

        @Override // o.InterfaceC57931yri
        public InterfaceC57931yri copydefault(int i) {
            C57869yqZ.this.QUSxYX = i;
            return this;
        }
    }

    /* JADX INFO: renamed from: o.yqZ$4, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass4 {
        public static final /* synthetic */ int[] EZpvd;

        static {
            int[] iArr = new int[RefreshState.values().length];
            EZpvd = iArr;
            try {
                iArr[RefreshState.None.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                EZpvd[RefreshState.PullDownToRefresh.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                EZpvd[RefreshState.PullUpToLoad.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                EZpvd[RefreshState.PullDownCanceled.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                EZpvd[RefreshState.PullUpCanceled.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                EZpvd[RefreshState.ReleaseToRefresh.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                EZpvd[RefreshState.ReleaseToLoad.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                EZpvd[RefreshState.ReleaseToTwoLevel.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                EZpvd[RefreshState.RefreshReleased.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                EZpvd[RefreshState.LoadReleased.ordinal()] = 10;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            try {
                EZpvd[RefreshState.Refreshing.ordinal()] = 11;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
            try {
                EZpvd[RefreshState.Loading.ordinal()] = 12;
            } catch (java.lang.NoSuchFieldError unused12) {
            }
        }
    }
}
