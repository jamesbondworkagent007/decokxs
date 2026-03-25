package o;

import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.github.mikephil.charting.components.MarkerView;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.utils.MPPointF;
import com.github.mikephil.charting.utils.Transformer;
import com.okinc.business.defi.api.bean.CurrencyDisplayStyle;
import com.okinc.business.invest_biz.data.contants.RateType;
import com.okinc.business.invest_biz.ui.bean.InvestKLineCandleInfo;
import com.okinc.business.invest_biz.ui.bean.InvestKLineDataPoint;
import com.okinc.localization.util.format.DisplaySign;
import java.math.RoundingMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Triple;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C25493ixk;
import o.C27425juu;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.juu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C27425juu extends android.widget.FrameLayout {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int copydefault = 8;
    public Highlight AEQbTJ;
    public StateListAnimator AYXKKw;
    public boolean AhwBna;
    public float AkhnZx;
    public TaskDescription AuCTel;
    public float DbNXlk;
    public final InterfaceC56387yDm EZpvd;
    public float KWHzl;
    public InterfaceC27428jux OLrzqt;
    public float djBIcL;
    public Entry ejfBZ;
    public Entry fIwbmz;
    public final InterfaceC56387yDm fJNWhG;
    public float fetchVPNInfo;
    public C27398juT gEmmrt;
    public boolean isConnected;
    public float valueOf;
    public Highlight values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C27425juu(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C27425juu(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    public final void copydefault(java.lang.String str) {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean copydefault(float f, float f2) {
        return f > f2 * ((float) 2) && f > 50.0f && !this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(@NotNull android.view.MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(motionEvent, "");
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setChartSelectedCallback(InterfaceC27428jux interfaceC27428jux) {
        this.OLrzqt = interfaceC27428jux;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:72) call: o.juu.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C27425juu(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27425juu(@NotNull final android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.juw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C27425juu.AEQbTJ(context, this);
            }
        });
        this.fJNWhG = C56392yDr.copydefault(new Function0() { // from class: o.juC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C27425juu.copydefault();
            }
        });
        this.fetchVPNInfo = 30.0f;
        this.KWHzl = 5.0f;
        EZpvd();
    }

    /* JADX INFO: renamed from: o.juu$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.juu.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    private final C23858iLy djBIcL() {
        return (C23858iLy) this.EZpvd.getValue();
    }

    public static final C23858iLy AEQbTJ(android.content.Context context, C27425juu c27425juu) {
        return C23858iLy.copydefault(android.view.LayoutInflater.from(context), c27425juu, true);
    }

    private final android.graphics.Paint gEmmrt() {
        return (android.graphics.Paint) this.fJNWhG.getValue();
    }

    public static final android.graphics.Paint copydefault() {
        android.graphics.Paint paint = new android.graphics.Paint();
        paint.setTextSize(C55298xhM.sp2pxFloat$default(12.0f, null, 1, null));
        return paint;
    }

    public final void EZpvd() {
        android.widget.FrameLayout frameLayout = djBIcL().AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(frameLayout, "");
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        this.AYXKKw = new StateListAnimator(this, context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        StateListAnimator stateListAnimator = this.AYXKKw;
        StateListAnimator stateListAnimator2 = null;
        if (stateListAnimator == null) {
            Intrinsics.gEmmrt("");
            stateListAnimator = null;
        }
        stateListAnimator.setLayoutParams(layoutParams);
        StateListAnimator stateListAnimator3 = this.AYXKKw;
        if (stateListAnimator3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            stateListAnimator2 = stateListAnimator3;
        }
        frameLayout.addView(stateListAnimator2);
        C27382juD c27382juD = djBIcL().KWHzl;
        android.content.Context context2 = c27382juD.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        TaskDescription taskDescription = new TaskDescription(context2, C25493ixk.Activity.aGOrKO);
        this.AuCTel = taskDescription;
        Intrinsics.copydefault(c27382juD);
        taskDescription.setChartReference(c27382juD);
        c27382juD.setMarker(this.AuCTel);
        android.widget.TextView textView = djBIcL().AhwBna;
        textView.setVisibility(4);
        textView.setText(" ");
        textView.setClickable(false);
        textView.setFocusable(false);
        LinearLayoutCompat linearLayoutCompat = djBIcL().EZpvd;
        linearLayoutCompat.setClickable(false);
        linearLayoutCompat.setFocusable(false);
        LinearLayoutCompat linearLayoutCompat2 = djBIcL().djBIcL;
        linearLayoutCompat2.setClickable(false);
        linearLayoutCompat2.setFocusable(false);
        android.widget.TextView textView2 = djBIcL().AYXKKw;
        textView2.setClickable(false);
        textView2.setFocusable(false);
        android.widget.TextView textView3 = djBIcL().valueOf;
        textView3.setClickable(false);
        textView3.setFocusable(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002c  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(@NotNull android.view.MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(motionEvent, "");
        boolean zAEQbTJ = AEQbTJ(motionEvent);
        int action = motionEvent.getAction();
        if (action == 0) {
            AEQbTJ(motionEvent, zAEQbTJ);
            this.isConnected = false;
            this.AhwBna = false;
            this.djBIcL = motionEvent.getX();
            this.valueOf = motionEvent.getY();
        } else if (action == 1) {
            AEQbTJ();
            this.isConnected = false;
            this.AhwBna = false;
            for (android.view.ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
                parent.requestDisallowInterceptTouchEvent(false);
            }
        } else {
            if (action == 2) {
                if (!KWHzl(motionEvent, zAEQbTJ)) {
                    return false;
                }
                java.lang.Math.abs(motionEvent.getX() - this.DbNXlk);
                return true;
            }
            if (action == 3) {
            }
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(@NotNull android.view.MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(motionEvent, "");
        return super.dispatchTouchEvent(motionEvent);
    }

    public final boolean AEQbTJ(android.view.MotionEvent motionEvent) {
        return motionEvent.getX() >= ((float) getPaddingLeft()) && motionEvent.getX() <= ((float) (getWidth() - getPaddingRight())) && motionEvent.getY() >= ((float) getPaddingTop()) && motionEvent.getY() <= ((float) (getHeight() - getPaddingBottom()));
    }

    public final void AEQbTJ(android.view.MotionEvent motionEvent, boolean z) {
        if (z) {
            OLrzqt(motionEvent);
            KWHzl(false);
            AhwBna();
            Highlight highlight = this.values;
            this.DbNXlk = highlight != null ? highlight.getXPx() : 0.0f;
            this.AkhnZx = motionEvent.getY();
            return;
        }
        OLrzqt();
    }

    public final boolean KWHzl(android.view.MotionEvent motionEvent, boolean z) {
        if (!z) {
            OLrzqt();
            return false;
        }
        float fAbs = java.lang.Math.abs(motionEvent.getX() - this.djBIcL);
        float fAbs2 = java.lang.Math.abs(motionEvent.getY() - this.valueOf);
        float fAbs3 = java.lang.Math.abs(motionEvent.getX() - this.DbNXlk);
        if (!this.isConnected && fAbs > 10.0f && fAbs > 2 * fAbs2 && copydefault(fAbs, fAbs2)) {
            OLrzqt();
            return false;
        }
        if (!this.isConnected) {
            this.isConnected = true;
            if (!this.AhwBna) {
                for (android.view.ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
                    parent.requestDisallowInterceptTouchEvent(true);
                }
                this.AhwBna = true;
            }
        }
        if (fAbs3 < this.fetchVPNInfo) {
            return true;
        }
        OLrzqt(motionEvent);
        C27424jut c27424jut = djBIcL().copydefault;
        Intrinsics.checkNotNullExpressionValue(c27424jut, "");
        if (c27424jut.getVisibility() != 0 ? this.values != null : !(this.AEQbTJ == null && this.values == null)) {
            KWHzl(false);
            AhwBna();
            this.DbNXlk = motionEvent.getX();
            this.AkhnZx = motionEvent.getY();
        }
        return true;
    }

    public final void AEQbTJ() {
        TaskDescription taskDescription = this.AuCTel;
        if (taskDescription != null) {
            taskDescription.setVisibility(8);
            taskDescription.refreshContent(null, null);
        }
        C27398juT c27398juT = this.gEmmrt;
        if (c27398juT != null) {
            C27424jut c27424jut = djBIcL().copydefault;
            Intrinsics.checkNotNullExpressionValue(c27424jut, "");
            if (c27424jut.getVisibility() == 0 && c27398juT.copydefault().length() > 0) {
                KWHzl(EZpvd(c27398juT.copydefault()));
            }
        }
        djBIcL().KWHzl.setMarker(null);
        djBIcL().KWHzl.highlightValue(null);
        C27424jut c27424jut2 = djBIcL().copydefault;
        Intrinsics.checkNotNullExpressionValue(c27424jut2, "");
        if (c27424jut2.getVisibility() == 0) {
            djBIcL().copydefault.highlightValue(null);
        }
        OLrzqt();
    }

    public final void OLrzqt(android.view.MotionEvent motionEvent) {
        Entry entryByTouchPoint;
        this.values = djBIcL().KWHzl.getHighlightByTouchPoint(motionEvent.getX(), motionEvent.getY());
        this.fIwbmz = djBIcL().KWHzl.getEntryByTouchPoint(motionEvent.getX(), motionEvent.getY());
        C27424jut c27424jut = djBIcL().copydefault;
        Intrinsics.checkNotNullExpressionValue(c27424jut, "");
        if (c27424jut.getVisibility() == 0) {
            this.AEQbTJ = djBIcL().copydefault.getHighlightByTouchPoint(motionEvent.getX(), motionEvent.getY());
            entryByTouchPoint = djBIcL().copydefault.getEntryByTouchPoint(motionEvent.getX(), motionEvent.getY());
        } else {
            entryByTouchPoint = null;
            this.AEQbTJ = null;
        }
        this.ejfBZ = entryByTouchPoint;
        djBIcL().OLrzqt.setClipBounds(AEQbTJ(false, this.values));
    }

    public final void KWHzl(boolean z) {
        if (z) {
            djBIcL().KWHzl.highlightValue(null);
            djBIcL().KWHzl.OLrzqt(true, (Highlight) null);
            C27424jut c27424jut = djBIcL().copydefault;
            Intrinsics.checkNotNullExpressionValue(c27424jut, "");
            if (c27424jut.getVisibility() == 0) {
                djBIcL().copydefault.AEQbTJ(true, (Highlight) null);
            }
            djBIcL().OLrzqt.setClipBounds(AEQbTJ(true, (Highlight) null));
            TaskDescription taskDescription = this.AuCTel;
            if (taskDescription != null) {
                taskDescription.setVisibility(8);
                taskDescription.refreshContent(null, null);
            }
            djBIcL().KWHzl.setMarker(null);
            C27398juT c27398juT = this.gEmmrt;
            if (c27398juT != null) {
                C27424jut c27424jut2 = djBIcL().copydefault;
                Intrinsics.checkNotNullExpressionValue(c27424jut2, "");
                if (c27424jut2.getVisibility() == 0 && c27398juT.copydefault().length() > 0) {
                    KWHzl(EZpvd(c27398juT.copydefault()));
                }
            }
            djBIcL().EZpvd.setVisibility(0);
            djBIcL().djBIcL.setVisibility(0);
            djBIcL().KWHzl.invalidate();
            djBIcL().OLrzqt.invalidate();
            EZpvd(null, null, -1, true);
            return;
        }
        djBIcL().KWHzl.highlightValue(this.values);
        djBIcL().KWHzl.OLrzqt(false, this.values);
        C27424jut c27424jut3 = djBIcL().copydefault;
        Intrinsics.checkNotNullExpressionValue(c27424jut3, "");
        if (c27424jut3.getVisibility() == 0) {
            djBIcL().copydefault.AEQbTJ(false, this.AEQbTJ);
        }
        djBIcL().OLrzqt.setClipBounds(AEQbTJ(false, this.values));
        djBIcL().KWHzl.setMarker(this.AuCTel);
        TaskDescription taskDescription2 = this.AuCTel;
        if (taskDescription2 != null) {
            taskDescription2.setVisibility(0);
            taskDescription2.refreshContent(this.fIwbmz, this.values);
        }
        C27424jut c27424jut4 = djBIcL().copydefault;
        Intrinsics.checkNotNullExpressionValue(c27424jut4, "");
        if (c27424jut4.getVisibility() == 0) {
            AYXKKw();
        }
        djBIcL().EZpvd.setVisibility(4);
        djBIcL().djBIcL.setVisibility(4);
        Entry entry = this.fIwbmz;
        EZpvd(this.fIwbmz, this.ejfBZ, (entry == null && (entry = this.ejfBZ) == null) ? -1 : (int) entry.getX(), false);
    }

    public static /* synthetic */ void handleSelectCallback$default(C27425juu c27425juu, Entry entry, Entry entry2, int i, boolean z, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            entry = null;
        }
        if ((i2 & 2) != 0) {
            entry2 = null;
        }
        if ((i2 & 4) != 0) {
            i = -1;
        }
        c27425juu.EZpvd(entry, entry2, i, z);
    }

    public final void EZpvd(Entry entry, Entry entry2, int i, boolean z) {
        InterfaceC27428jux interfaceC27428jux = this.OLrzqt;
        if (interfaceC27428jux != null) {
            interfaceC27428jux.OLrzqt(entry, entry2, i, z);
        }
    }

    public static /* synthetic */ void updateLabel$default(C27425juu c27425juu, java.lang.String str, int i, int i2, android.view.View view, android.widget.TextView textView, float f, int i3, java.lang.Object obj) {
        if ((i3 & 32) != 0) {
            f = 8.0f;
        }
        c27425juu.KWHzl(str, i, i2, view, textView, f);
    }

    public final void KWHzl(java.lang.String str, int i, int i2, android.view.View view, android.widget.TextView textView, float f) {
        boolean z = str.length() > 0 && i != -1;
        view.setVisibility(z ? 0 : 8);
        if (z) {
            textView.setText(str);
            ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
            if (layoutParams != null) {
                LinearLayoutCompat.LayoutParams layoutParams2 = (LinearLayoutCompat.LayoutParams) layoutParams;
                Intrinsics.checkNotNullExpressionValue(getContext(), "");
                layoutParams2.setMarginStart((int) AEQbTJ(str, i, i2, C55298xhM.copydefault(f, r0)));
                textView.setLayoutParams(layoutParams2);
                return;
            }
            throw new java.lang.NullPointerException("null cannot be cast to non-null type androidx.appcompat.widget.LinearLayoutCompat.LayoutParams");
        }
    }

    public final float AEQbTJ(java.lang.String str, int i, int i2, float f) {
        boolean zAEQbTJ = C55296xhK.AEQbTJ(this);
        C33566myq c33566myq = C33566myq.EZpvd;
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        float fEZpvd = c33566myq.EZpvd(context);
        float f2 = fEZpvd - f;
        float fAEQbTJ = AEQbTJ(str);
        float f3 = ((i * 1.0f) / (i2 - 1)) * fEZpvd;
        if (zAEQbTJ) {
            f3 = fEZpvd - f3;
        }
        float f4 = fAEQbTJ / 2;
        return java.lang.Math.max(f3 + f4 > f2 ? f2 - fAEQbTJ : f3 - f4, f);
    }

    public final float AEQbTJ(java.lang.String str) {
        gEmmrt().getTextBounds(str, 0, str.length(), new android.graphics.Rect());
        return r0.width();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void AhwBna() {
        java.lang.Float fValueOf;
        java.lang.Float fValueOf2;
        Highlight highlight;
        C27424jut c27424jut = djBIcL().copydefault;
        Intrinsics.checkNotNullExpressionValue(c27424jut, "");
        StateListAnimator stateListAnimator = null;
        if (c27424jut.getVisibility() != 0 || (highlight = this.AEQbTJ) == null) {
            Highlight highlight2 = this.values;
            fValueOf = highlight2 != null ? java.lang.Float.valueOf(highlight2.getXPx()) : null;
        } else if (highlight != null) {
            fValueOf = java.lang.Float.valueOf(highlight.getXPx());
        }
        Entry entry = this.fIwbmz;
        if (entry != null) {
            Transformer transformer = djBIcL().KWHzl.getTransformer(YAxis.AxisDependency.LEFT);
            float[] fArr = {entry.getX(), entry.getY()};
            transformer.pointValuesToPixel(fArr);
            fValueOf2 = java.lang.Float.valueOf(fArr[1] + djBIcL().KWHzl.getTop());
        } else {
            Highlight highlight3 = this.values;
            fValueOf2 = highlight3 != null ? java.lang.Float.valueOf(highlight3.getYPx()) : null;
        }
        StateListAnimator stateListAnimator2 = this.AYXKKw;
        if (stateListAnimator2 == null) {
            Intrinsics.gEmmrt("");
            stateListAnimator2 = null;
        }
        stateListAnimator2.AEQbTJ(fValueOf, fValueOf2, this.fIwbmz);
        StateListAnimator stateListAnimator3 = this.AYXKKw;
        if (stateListAnimator3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            stateListAnimator = stateListAnimator3;
        }
        stateListAnimator.invalidate();
    }

    public final void AYXKKw() {
        java.lang.String strEZpvd;
        Entry entry = this.ejfBZ;
        if (entry != null) {
            java.lang.Object data = entry.getData();
            InvestKLineDataPoint investKLineDataPoint = data instanceof InvestKLineDataPoint ? (InvestKLineDataPoint) data : null;
            float y = entry.getY();
            if (investKLineDataPoint != null) {
                java.lang.String strAEQbTJ = investKLineDataPoint.AEQbTJ();
                if (strAEQbTJ == null) {
                    strAEQbTJ = java.lang.String.valueOf(y);
                }
                strEZpvd = EZpvd(strAEQbTJ);
            } else {
                strEZpvd = EZpvd(java.lang.String.valueOf(y));
            }
            KWHzl(strEZpvd);
            return;
        }
        C27398juT c27398juT = this.gEmmrt;
        if (c27398juT != null && c27398juT.copydefault().length() > 0) {
            KWHzl(EZpvd(c27398juT.copydefault()));
        }
        copydefault("No bar entry selected, showing default value");
    }

    public final java.lang.String EZpvd(java.lang.String str) {
        java.lang.String strKWHzl = C27586jxw.OLrzqt.KWHzl(C33129mqd.EZpvd(str), (46 & 2) != 0 ? 2 : 0, (46 & 4) == 0 ? 0 : 2, (46 & 8) != 0 ? DisplaySign.AUTO : null, (46 & 16) != 0 ? CurrencyDisplayStyle.CURRENCY_AMOUNT_ONLY : CurrencyDisplayStyle.CURRENCY_SYMBOL_PREFIX, (46 & 32) != 0 ? RoundingMode.DOWN : null);
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        return pTD.KWHzl(context, C25493ixk.FragmentManager.AuCTel, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("value", strKWHzl)));
    }

    public final void KWHzl(java.lang.String str) {
        djBIcL().AhwBna.setText(str);
    }

    public final void OLrzqt() {
        this.DbNXlk = 0.0f;
        this.AkhnZx = 0.0f;
        this.djBIcL = 0.0f;
        this.valueOf = 0.0f;
        this.isConnected = false;
        this.AhwBna = false;
        this.values = null;
        this.AEQbTJ = null;
        this.fIwbmz = null;
        this.ejfBZ = null;
        KWHzl(true);
        StateListAnimator stateListAnimator = this.AYXKKw;
        if (stateListAnimator == null) {
            Intrinsics.gEmmrt("");
            stateListAnimator = null;
        }
        stateListAnimator.AEQbTJ(null, null, null);
        StateListAnimator stateListAnimator2 = this.AYXKKw;
        if (stateListAnimator2 == null) {
            Intrinsics.gEmmrt("");
            stateListAnimator2 = null;
        }
        stateListAnimator2.invalidate();
        djBIcL().KWHzl.invalidate();
        djBIcL().OLrzqt.invalidate();
        C27424jut c27424jut = djBIcL().copydefault;
        Intrinsics.checkNotNullExpressionValue(c27424jut, "");
        if (c27424jut.getVisibility() == 0) {
            djBIcL().copydefault.invalidate();
        }
        C27398juT c27398juT = this.gEmmrt;
        if (c27398juT != null) {
            C27424jut c27424jut2 = djBIcL().copydefault;
            Intrinsics.checkNotNullExpressionValue(c27424jut2, "");
            if (c27424jut2.getVisibility() == 0 && c27398juT.copydefault().length() > 0) {
                KWHzl(EZpvd(c27398juT.copydefault()));
            }
        }
        EZpvd(null, null, -1, true);
    }

    public final void setData(@NotNull final C27398juT c27398juT) {
        Intrinsics.checkNotNullParameter(c27398juT, "");
        this.gEmmrt = c27398juT;
        djBIcL().KWHzl.setChartData(c27398juT.EZpvd(), 0.12f);
        djBIcL().OLrzqt.setChartData(c27398juT.EZpvd(), 1.0f);
        TaskDescription taskDescription = this.AuCTel;
        if (taskDescription != null) {
            taskDescription.setRateType(c27398juT.AYXKKw());
        }
        java.lang.String strAhwBna = c27398juT.AhwBna();
        int iDjBIcL = c27398juT.djBIcL();
        int iCopydefault = copydefault(c27398juT.EZpvd());
        LinearLayoutCompat linearLayoutCompat = djBIcL().EZpvd;
        Intrinsics.checkNotNullExpressionValue(linearLayoutCompat, "");
        android.widget.TextView textView = djBIcL().AYXKKw;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        updateLabel$default(this, strAhwBna, iDjBIcL, iCopydefault, linearLayoutCompat, textView, 0.0f, 32, null);
        java.lang.String strValueOf = c27398juT.valueOf();
        int iGEmmrt = c27398juT.gEmmrt();
        int iCopydefault2 = copydefault(c27398juT.EZpvd());
        LinearLayoutCompat linearLayoutCompat2 = djBIcL().djBIcL;
        Intrinsics.checkNotNullExpressionValue(linearLayoutCompat2, "");
        android.widget.TextView textView2 = djBIcL().valueOf;
        Intrinsics.checkNotNullExpressionValue(textView2, "");
        updateLabel$default(this, strValueOf, iGEmmrt, iCopydefault2, linearLayoutCompat2, textView2, 0.0f, 32, null);
        boolean z = !c27398juT.OLrzqt().isEmpty();
        C27424jut c27424jut = djBIcL().copydefault;
        Intrinsics.checkNotNullExpressionValue(c27424jut, "");
        if ((c27424jut.getVisibility() == 0) != z) {
            if (z) {
                C27424jut c27424jut2 = djBIcL().copydefault;
                Intrinsics.checkNotNullExpressionValue(c27424jut2, "");
                c27424jut2.setVisibility(0);
                djBIcL().AhwBna.setVisibility(0);
                djBIcL().copydefault.setChartData(c27398juT.OLrzqt(), java.lang.Integer.valueOf(c27398juT.OLrzqt().size()));
                copydefault("BarChart data available: " + c27398juT.OLrzqt().size() + " items, showing barChart and tvBarValue");
            } else {
                C27424jut c27424jut3 = djBIcL().copydefault;
                Intrinsics.checkNotNullExpressionValue(c27424jut3, "");
                c27424jut3.setVisibility(8);
                djBIcL().AhwBna.setVisibility(4);
                copydefault("BarChart data is empty, hiding barChart and tvBarValue");
            }
        } else if (z) {
            djBIcL().copydefault.setChartData(c27398juT.OLrzqt(), java.lang.Integer.valueOf(c27398juT.OLrzqt().size()));
            copydefault("BarChart data updated: " + c27398juT.OLrzqt().size() + " items, visibility unchanged");
        }
        if (z && c27398juT.copydefault().length() > 0) {
            KWHzl(EZpvd(c27398juT.copydefault()));
        }
        post(new java.lang.Runnable() { // from class: o.juB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C27425juu.setData$lambda$20(c27398juT, this);
            }
        });
        invalidate();
    }

    public static final void setData$lambda$20(C27398juT c27398juT, C27425juu c27425juu) {
        int size;
        if (c27398juT.OLrzqt().isEmpty()) {
            size = c27425juu.copydefault(c27398juT.EZpvd());
        } else {
            size = c27398juT.OLrzqt().size();
        }
        float fMax = java.lang.Math.max((float) java.lang.Math.floor(c27425juu.getWidth() / java.lang.Math.max(size, 1.0f)), 10.0f);
        c27425juu.fetchVPNInfo = fMax;
        c27425juu.KWHzl = 0.25f * fMax;
        C27424jut c27424jut = c27425juu.djBIcL().copydefault;
        Intrinsics.checkNotNullExpressionValue(c27424jut, "");
        c27425juu.copydefault("Calculated invalidateThreshold: " + fMax + " based on dataCount: " + size + " (barChart visible: " + (c27424jut.getVisibility() == 0) + ")");
    }

    public final int copydefault(C23949iPh c23949iPh) {
        java.util.Iterator<T> it = c23949iPh.copydefault().iterator();
        int size = 0;
        int size2 = 0;
        while (it.hasNext()) {
            size2 += ((java.util.List) it.next()).size();
        }
        java.util.Iterator<T> it2 = c23949iPh.EZpvd().iterator();
        while (it2.hasNext()) {
            size += ((java.util.List) it2.next()).size();
        }
        int i = size2 + size;
        copydefault("LineChart data counts - normal: " + size2 + ", bonus: " + size + ", total: " + i);
        return i;
    }

    /* JADX INFO: renamed from: o.juu$StateListAnimator */
    public final class StateListAnimator extends AppCompatImageView {
        public Entry AEQbTJ;
        public final InterfaceC56387yDm AYXKKw;
        public final InterfaceC56387yDm AhwBna;
        public final int EZpvd;
        public final android.graphics.Paint KWHzl;
        public final int OLrzqt;
        public final InterfaceC56387yDm copydefault;
        public final /* synthetic */ C27425juu djBIcL;
        public java.lang.Float gEmmrt;
        public final android.graphics.Paint valueOf;
        public java.lang.Float values;

        /* JADX INFO: renamed from: o.juu$StateListAnimator$ActionBar */
        public final /* synthetic */ class ActionBar {
            public static final /* synthetic */ int[] EZpvd;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            static {
                int[] iArr = new int[InvestKLineDataPoint.Type.values().length];
                try {
                    iArr[InvestKLineDataPoint.Type.BONUS.ordinal()] = 1;
                } catch (java.lang.NoSuchFieldError unused) {
                }
                try {
                    iArr[InvestKLineDataPoint.Type.NORMAL.ordinal()] = 2;
                } catch (java.lang.NoSuchFieldError unused2) {
                }
                EZpvd = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull C27425juu c27425juu, final android.content.Context context) {
            super(context);
            Intrinsics.checkNotNullParameter(context, "");
            this.djBIcL = c27425juu;
            this.valueOf = new android.graphics.Paint();
            this.KWHzl = new android.graphics.Paint();
            C27421juq c27421juq = C27421juq.copydefault;
            this.EZpvd = c27421juq.KWHzl(context);
            this.OLrzqt = c27421juq.OLrzqt(context);
            this.copydefault = C56392yDr.copydefault(new Function0() { // from class: o.juz
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return java.lang.Float.valueOf(C27425juu.StateListAnimator.OLrzqt(context));
                }
            });
            this.AYXKKw = C56392yDr.copydefault(new Function0() { // from class: o.juy
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return java.lang.Float.valueOf(C27425juu.StateListAnimator.KWHzl(this.EZpvd));
                }
            });
            this.AhwBna = C56392yDr.copydefault(new Function0() { // from class: o.juA
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return java.lang.Float.valueOf(C27425juu.StateListAnimator.AEQbTJ(this.OLrzqt));
                }
            });
            setupPaints();
            setWillNotDraw(false);
            setBackgroundColor(0);
            setClickable(false);
            setFocusable(false);
        }

        public final float KWHzl() {
            return ((java.lang.Number) this.copydefault.getValue()).floatValue();
        }

        public static final float OLrzqt(android.content.Context context) {
            return android.util.TypedValue.applyDimension(1, 5.0f, context.getResources().getDisplayMetrics());
        }

        public final float copydefault() {
            return ((java.lang.Number) this.AYXKKw.getValue()).floatValue();
        }

        public static final float KWHzl(StateListAnimator stateListAnimator) {
            return stateListAnimator.KWHzl() * 2.8f;
        }

        public final float AEQbTJ() {
            return ((java.lang.Number) this.AhwBna.getValue()).floatValue();
        }

        public static final float AEQbTJ(StateListAnimator stateListAnimator) {
            return stateListAnimator.KWHzl() * 6.2f;
        }

        public final void setupPaints() {
            android.graphics.Paint paint = this.valueOf;
            paint.setColor(this.EZpvd);
            paint.setStrokeWidth(android.util.TypedValue.applyDimension(1, 0.5f, getContext().getResources().getDisplayMetrics()));
            paint.setStyle(Paint.Style.STROKE);
            paint.setPathEffect(new DashPathEffect(new float[]{10.0f, 10.0f}, 0.0f));
            android.graphics.Paint paint2 = this.KWHzl;
            paint2.setColor(this.EZpvd);
            paint2.setStyle(Paint.Style.FILL);
        }

        public static /* synthetic */ void updateLine$default(StateListAnimator stateListAnimator, java.lang.Float f, java.lang.Float f2, Entry entry, int i, java.lang.Object obj) {
            if ((i & 4) != 0) {
                entry = null;
            }
            stateListAnimator.AEQbTJ(f, f2, entry);
        }

        public final void AEQbTJ(java.lang.Float f, java.lang.Float f2, Entry entry) {
            this.gEmmrt = f;
            this.values = f2;
            this.AEQbTJ = entry;
            AEQbTJ(entry);
            invalidate();
        }

        public final void AEQbTJ(Entry entry) {
            int i;
            java.lang.Object data = entry != null ? entry.getData() : null;
            InvestKLineDataPoint investKLineDataPoint = data instanceof InvestKLineDataPoint ? (InvestKLineDataPoint) data : null;
            InvestKLineDataPoint.Type typeValueOf = investKLineDataPoint != null ? investKLineDataPoint.valueOf() : null;
            int i2 = typeValueOf == null ? -1 : ActionBar.EZpvd[typeValueOf.ordinal()];
            if (i2 == -1) {
                i = this.EZpvd;
            } else if (i2 != 1) {
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i = this.EZpvd;
            } else {
                i = this.OLrzqt;
            }
            this.valueOf.setColor(i);
            this.KWHzl.setColor(i);
        }

        @Override // android.widget.ImageView, android.view.View
        public void onDraw(@NotNull android.graphics.Canvas canvas) {
            Intrinsics.checkNotNullParameter(canvas, "");
            super.onDraw(canvas);
            java.lang.Float f = this.gEmmrt;
            if (f != null) {
                float fFloatValue = f.floatValue();
                canvas.drawLine(fFloatValue, 0.0f, fFloatValue, getHeight(), this.valueOf);
                java.lang.Float f2 = this.values;
                if (f2 != null) {
                    copydefault(canvas, fFloatValue, f2.floatValue());
                }
            }
        }

        public final void copydefault(android.graphics.Canvas canvas, float f, float f2) {
            this.KWHzl.setAlpha(5);
            canvas.drawCircle(f, f2, copydefault(), this.KWHzl);
            this.KWHzl.setAlpha(25);
            canvas.drawCircle(f, f2, AEQbTJ(), this.KWHzl);
            this.KWHzl.setAlpha(255);
            canvas.drawCircle(f, f2, KWHzl(), this.KWHzl);
        }
    }

    /* JADX INFO: renamed from: o.juu$TaskDescription */
    public static final class TaskDescription extends MarkerView {
        public final android.widget.TextView AEQbTJ;
        public final android.widget.TextView AhwBna;
        public android.view.View EZpvd;
        public Highlight KWHzl;
        public final android.widget.TextView OLrzqt;
        public final android.widget.TextView copydefault;
        public final android.widget.LinearLayout gEmmrt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setChartReference(@NotNull android.view.View view) {
            Intrinsics.checkNotNullParameter(view, "");
            this.EZpvd = view;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TaskDescription(@NotNull android.content.Context context, int i) {
            super(context, i);
            Intrinsics.checkNotNullParameter(context, "");
            android.view.View viewFindViewById = findViewById(C25493ixk.ActionBar.onNavigationEvent);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
            this.gEmmrt = (android.widget.LinearLayout) viewFindViewById;
            android.view.View viewFindViewById2 = findViewById(C25493ixk.ActionBar.onPostMessage);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "");
            this.AEQbTJ = (android.widget.TextView) viewFindViewById2;
            android.view.View viewFindViewById3 = findViewById(C25493ixk.ActionBar.onMessageChannelReady);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "");
            this.AhwBna = (android.widget.TextView) viewFindViewById3;
            android.view.View viewFindViewById4 = findViewById(C25493ixk.ActionBar.ICustomTabsCallback);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "");
            this.copydefault = (android.widget.TextView) viewFindViewById4;
            android.view.View viewFindViewById5 = findViewById(C25493ixk.ActionBar.sTbpmZ);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "");
            this.OLrzqt = (android.widget.TextView) viewFindViewById5;
        }

        public final void setRateType(@NotNull RateType rateType) {
            java.lang.String string;
            java.lang.String string2;
            Intrinsics.checkNotNullParameter(rateType, "");
            android.widget.TextView textView = this.copydefault;
            android.content.Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            Triple<java.lang.String, java.lang.String, java.lang.String> tripleOLrzqt = C25511iyB.OLrzqt(rateType, context);
            if (tripleOLrzqt == null || (string = tripleOLrzqt.getFirst()) == null) {
                string = getContext().getString(C25493ixk.FragmentManager.fIwbmz);
                Intrinsics.checkNotNullExpressionValue(string, "");
            }
            textView.setText(string);
            android.widget.TextView textView2 = this.AEQbTJ;
            android.content.Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            Triple<java.lang.String, java.lang.String, java.lang.String> tripleOLrzqt2 = C25511iyB.OLrzqt(rateType, context2);
            if (tripleOLrzqt2 == null || (string2 = tripleOLrzqt2.getSecond()) == null) {
                string2 = getContext().getString(C25493ixk.FragmentManager.getNewProxyInstance);
                Intrinsics.checkNotNullExpressionValue(string2, "");
            }
            textView2.setText(string2);
        }

        @Override // com.github.mikephil.charting.components.MarkerView, com.github.mikephil.charting.components.IMarker
        public void refreshContent(Entry entry, Highlight highlight) {
            InvestKLineCandleInfo investKLineCandleInfoCopydefault;
            this.KWHzl = highlight;
            if (entry != null && highlight != null) {
                java.lang.Object data = entry.getData();
                InvestKLineDataPoint investKLineDataPoint = data instanceof InvestKLineDataPoint ? (InvestKLineDataPoint) data : null;
                if (investKLineDataPoint != null && (investKLineCandleInfoCopydefault = investKLineDataPoint.copydefault()) != null) {
                    boolean z = investKLineCandleInfoCopydefault.KWHzl().length() > 0;
                    this.gEmmrt.setVisibility(z ? 0 : 8);
                    if (z) {
                        this.AhwBna.setText(C27492jwH.OLrzqt.AEQbTJ(C33129mqd.subS$default(investKLineCandleInfoCopydefault.KWHzl(), investKLineCandleInfoCopydefault.AEQbTJ(), null, null, null, 14, null), false));
                    }
                    this.OLrzqt.setText(C27492jwH.OLrzqt.AEQbTJ(investKLineCandleInfoCopydefault.AEQbTJ(), false));
                }
                setVisibility(0);
            } else {
                this.AhwBna.setText("");
                setVisibility(8);
            }
            super.refreshContent(entry, highlight);
        }

        @Override // com.github.mikephil.charting.components.MarkerView, com.github.mikephil.charting.components.IMarker
        public MPPointF getOffset() {
            Highlight highlight = this.KWHzl;
            if (highlight == null) {
                return new MPPointF((-getWidth()) / 2.0f, (-getHeight()) / 2);
            }
            float xPx = highlight.getXPx();
            float yPx = highlight.getYPx();
            float f = xPx > ((float) (getContext().getResources().getDisplayMetrics().widthPixels / 2)) ? (-getWidth()) - 30.0f : 30.0f;
            float height = (-getHeight()) / 2;
            android.view.View view = this.EZpvd;
            if (view != null) {
                float height2 = view.getHeight();
                float f2 = yPx + height;
                float height3 = getHeight();
                if (f2 < 0.0f) {
                    height = (0.0f - yPx) + 10.0f;
                } else if (height3 + f2 > height2) {
                    height = ((height2 - yPx) - getHeight()) - 10.0f;
                }
            }
            return new MPPointF(f, height);
        }
    }

    public final android.graphics.Rect AEQbTJ(boolean z, Highlight highlight) {
        int xPx;
        C27382juD c27382juD = djBIcL().OLrzqt;
        if (z || highlight == null) {
            return new android.graphics.Rect(0, 0, c27382juD.getWidth(), c27382juD.getHeight());
        }
        try {
            xPx = C33129mqd.AhwBna(java.lang.Double.valueOf(c27382juD.getPixelForValues(highlight.getX(), highlight.getY(), YAxis.AxisDependency.LEFT).x));
        } catch (java.lang.Exception unused) {
            xPx = (int) highlight.getXPx();
        }
        return new android.graphics.Rect(0, 0, C56548yJl.EZpvd(xPx, 0, c27382juD.getWidth()), c27382juD.getHeight());
    }
}
