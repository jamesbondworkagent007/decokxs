package o;

import android.text.Editable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.textfield.TextInputLayout;
import com.okinc.tradeuilib.widget.oktinputlayout.MaxValueJudgeListener;
import com.okinc.tradeuilib.widget.oktinputlayout.appendview.InputLayoutBothSidesViewState;
import com.okinc.tradeuilib.widget.oktinputlayout.core.InputLayoutState;
import com.okinc.tradeuilib.widget.oktinputlayout.core.TradeInputBasicsView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C49511upt;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.uAv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C47988uAv extends android.widget.FrameLayout {
    public InterfaceC59495ziC AYXKKw;
    public java.util.ArrayList<uBH> AhwBna;
    public java.lang.String AkhnZx;
    public long AuCTel;
    public InterfaceC58217yxC AuCTelauCTel;
    public final InterfaceC56387yDm AubY;
    public C48007uBn AwvSrB;
    public View.OnLayoutChangeListener AxsJAY;
    public int DTwDnp;
    public C48007uBn DbNXlk;
    public boolean EZpvd;
    public java.util.ArrayList<uBH> KWHzl;
    public long OLrzqt;
    public C48012uBs ORxRYg;
    public java.util.ArrayList<uBH> QOLQEE;
    public java.lang.String copydefault;
    public final TradeInputBasicsView djBIcL;
    public float ejfBZ;
    public Function1<? super java.lang.Float, Unit> fARcdN;
    public InterfaceC58217yxC fIwbmz;
    public java.lang.String fJNWhG;
    public java.lang.String fetchVPNInfo;
    public final java.util.List<Function2<C47988uAv, java.lang.Boolean, Unit>> gEmmrt;
    public final InterfaceC56387yDm gHZMYf;
    public MaxValueJudgeListener getFieldNames;
    public Function1<? super java.lang.String, Unit> getNewProxyInstance;
    public Function2<? super C47988uAv, ? super java.lang.String, Unit> hDKMBd;
    public java.lang.String isConnected;
    public Function1<? super InputLayoutState, Unit> iwGUEr;
    public Function1<? super java.lang.Integer, Unit> sSMYrx;
    public Function2<? super C47988uAv, ? super java.lang.Boolean, Unit> uzCIH;
    public View.OnLayoutChangeListener valueOf;
    public View.OnLayoutChangeListener values;
    public android.widget.TextView wlaJM;
    public boolean zLjUOn;
    public final java.util.List<Function1<java.lang.Float, Unit>> zsXlph;
    public Function1<? super java.lang.Float, Unit> zuBGHE;
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int AEQbTJ = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C47988uAv(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C47988uAv(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.ArrayList<uBH> fIwbmz() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDelayed(long j) {
        this.OLrzqt = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInputListenerList(java.util.ArrayList<uBH> arrayList) {
        this.AhwBna = arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMOnPercentCallback(Function1<? super java.lang.Float, Unit> function1) {
        this.fARcdN = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMaxValue(java.lang.String str) {
        this.fJNWhG = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMaxValueJudgeListener(MaxValueJudgeListener maxValueJudgeListener) {
        this.getFieldNames = maxValueJudgeListener;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOnFocusChangeCallback(Function2<? super C47988uAv, ? super java.lang.Boolean, Unit> function2) {
        this.uzCIH = function2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOnMaxValueTriggerCallback(Function1<? super java.lang.String, Unit> function1) {
        this.getNewProxyInstance = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOnStateChangeCallback(Function1<? super InputLayoutState, Unit> function1) {
        this.iwGUEr = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOnTextChangeCallback(Function2<? super C47988uAv, ? super java.lang.String, Unit> function2) {
        this.hDKMBd = function2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPercentSeekBarListener(Function1<? super java.lang.Float, Unit> function1) {
        this.fARcdN = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSeekBarClickCallback(Function1<? super java.lang.Float, Unit> function1) {
        this.zuBGHE = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSeekbarStateCallback(Function1<? super java.lang.Integer, Unit> function1) {
        this.sSMYrx = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean wlaJM() {
        return this.DTwDnp == 2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:51) call: o.uAv.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C47988uAv(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C47988uAv(@NotNull final android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.AkhnZx = "";
        this.fetchVPNInfo = "";
        this.isConnected = "";
        this.AubY = C56392yDr.copydefault(new Function0() { // from class: o.uAG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C47988uAv.copydefault(context);
            }
        });
        this.gHZMYf = C56392yDr.copydefault(new Function0() { // from class: o.uAK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C47988uAv.KWHzl(context);
            }
        });
        this.OLrzqt = 500L;
        this.zsXlph = new java.util.ArrayList();
        this.gEmmrt = new java.util.ArrayList();
        this.DTwDnp = 1;
        TradeInputBasicsView tradeInputBasicsView = new TradeInputBasicsView(context, attributeSet, new Function1() { // from class: o.uAO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C47988uAv.KWHzl(this.AEQbTJ, (java.lang.String) obj);
            }
        }, new Function1() { // from class: o.uAN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C47988uAv.KWHzl(this.KWHzl, ((java.lang.Boolean) obj).booleanValue());
            }
        });
        this.djBIcL = tradeInputBasicsView;
        addView(tradeInputBasicsView);
        EZpvd(attributeSet);
        KWHzl(attributeSet);
        post(new java.lang.Runnable() { // from class: o.uAM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C47988uAv.DbNXlk(this.EZpvd);
            }
        });
    }

    private final C48004uBk ORxRYg() {
        return (C48004uBk) this.AubY.getValue();
    }

    public static final C48004uBk copydefault(android.content.Context context) {
        return new C48004uBk(context, null, 0, 6, null);
    }

    public static final C48010uBq KWHzl(android.content.Context context) {
        return new C48010uBq(context);
    }

    private final C48010uBq OcIXYQ() {
        return (C48010uBq) this.gHZMYf.getValue();
    }

    /* JADX INFO: renamed from: o.uAv$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.uAv.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    public static final Unit KWHzl(C47988uAv c47988uAv, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        c47988uAv.KWHzl(str);
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(C47988uAv c47988uAv, boolean z) {
        c47988uAv.KWHzl(z);
        return Unit.INSTANCE;
    }

    public static final void DbNXlk(C47988uAv c47988uAv) {
        android.view.ViewParent parent = c47988uAv.getParent();
        android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.setClipChildren(false);
        }
        android.view.ViewParent parent2 = c47988uAv.getParent();
        android.view.ViewGroup viewGroup2 = parent2 instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent2 : null;
        if (viewGroup2 != null) {
            viewGroup2.setClipToPadding(false);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (wlaJM()) {
            android.widget.TextView textView = this.wlaJM;
            if (textView != null && textView.getVisibility() == 0) {
                android.widget.TextView textView2 = this.wlaJM;
                measuredHeight = (textView2 != null ? textView2.getMeasuredHeight() : 0) + C55298xhM.dp2px$default(8.0f, null, 1, null);
            }
            TradeInputBasicsView tradeInputBasicsView = this.djBIcL;
            ViewGroup.LayoutParams layoutParams = tradeInputBasicsView.getLayoutParams();
            Intrinsics.copydefault(layoutParams, "");
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams2.topMargin = measuredHeight;
            tradeInputBasicsView.setLayoutParams(layoutParams2);
        }
    }

    public final void EZpvd(android.util.AttributeSet attributeSet) {
        android.content.res.TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C49511upt.Fragment.AuCTel, 0, 0);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
        try {
            this.DTwDnp = typedArrayObtainStyledAttributes.getInteger(C49511upt.Fragment.gHZMYf, 0);
            this.EZpvd = typedArrayObtainStyledAttributes.getBoolean(C49511upt.Fragment.zLjUOn, false);
            typedArrayObtainStyledAttributes.recycle();
            gEmmrt();
            valueOf();
        } catch (java.lang.Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final void gEmmrt() {
        if (wlaJM()) {
            android.widget.TextView textView = new android.widget.TextView(getContext());
            textView.setTextAppearance(C52761wXj.LoaderManager.gHZMYf);
            textView.setTextColor(textView.getContext().getColor(C52761wXj.Activity.fdOvFl));
            textView.setGravity(8388659);
            textView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
            textView.setVisibility(this.EZpvd ? 0 : 8);
            addView(textView);
            this.wlaJM = textView;
        }
    }

    public final void valueOf() {
        android.util.AttributeSet attributeSet = null;
        byte b = 0;
        byte b2 = 0;
        byte b3 = 0;
        byte b4 = 0;
        byte b5 = 0;
        byte b6 = 0;
        byte b7 = 0;
        int i = 2;
        if (this.DTwDnp == 2) {
            android.content.Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            C48005uBl c48005uBl = new C48005uBl(context, attributeSet, i, b7 == true ? 1 : 0);
            c48005uBl.valueOf();
            this.DbNXlk = c48005uBl;
            android.content.Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            C48005uBl c48005uBl2 = new C48005uBl(context2, b6 == true ? 1 : 0, i, b5 == true ? 1 : 0);
            c48005uBl2.valueOf();
            this.AwvSrB = c48005uBl2;
            return;
        }
        android.content.Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "");
        C48007uBn c48007uBn = new C48007uBn(context3, b4 == true ? 1 : 0, i, b3 == true ? 1 : 0);
        c48007uBn.valueOf();
        this.DbNXlk = c48007uBn;
        android.content.Context context4 = getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "");
        C48007uBn c48007uBn2 = new C48007uBn(context4, b2 == true ? 1 : 0, i, b == true ? 1 : 0);
        c48007uBn2.valueOf();
        this.AwvSrB = c48007uBn2;
    }

    public final void KWHzl(android.util.AttributeSet attributeSet) {
        if (attributeSet == null) {
            return;
        }
        android.content.res.TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C49511upt.Fragment.AuCTel, 0, 0);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
        try {
            C33054mpH.AEQbTJ(typedArrayObtainStyledAttributes.getResourceId(C49511upt.Fragment.iwGUEr, 0), (Function1<? super java.lang.Integer, Unit>) new Function1() { // from class: o.uAV
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C47988uAv.valueOf(this.AEQbTJ, ((java.lang.Integer) obj).intValue());
                }
            });
            if (typedArrayObtainStyledAttributes.getBoolean(C49511upt.Fragment.wlaJM, false)) {
                EZpvd(attributeSet, typedArrayObtainStyledAttributes.getBoolean(C49511upt.Fragment.AuCTelauCTel, false));
            }
            if (typedArrayObtainStyledAttributes.getBoolean(C49511upt.Fragment.zsXlph, false)) {
                OLrzqt();
                C33054mpH.AEQbTJ(typedArrayObtainStyledAttributes.getResourceId(C49511upt.Fragment.AubY, 0), (Function1<? super java.lang.Integer, Unit>) new Function1() { // from class: o.uAY
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C47988uAv.djBIcL(this.OLrzqt, ((java.lang.Integer) obj).intValue());
                    }
                });
            }
            C33054mpH.AEQbTJ(typedArrayObtainStyledAttributes.getResourceId(C49511upt.Fragment.getNewProxyInstance, 0), (Function1<? super java.lang.Integer, Unit>) new Function1() { // from class: o.uAU
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C47988uAv.AYXKKw(this.AEQbTJ, ((java.lang.Integer) obj).intValue());
                }
            });
            C33054mpH.AEQbTJ(typedArrayObtainStyledAttributes.getResourceId(C49511upt.Fragment.sSMYrx, 0), (Function1<? super java.lang.Integer, Unit>) new Function1() { // from class: o.uAZ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C47988uAv.isConnected(this.copydefault, ((java.lang.Integer) obj).intValue());
                }
            });
            C33054mpH.AEQbTJ(typedArrayObtainStyledAttributes.getResourceId(C49511upt.Fragment.getFieldNames, 0), (Function1<? super java.lang.Integer, Unit>) new Function1() { // from class: o.uBc
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C47988uAv.fetchVPNInfo(this.OLrzqt, ((java.lang.Integer) obj).intValue());
                }
            });
            C33054mpH.AEQbTJ(typedArrayObtainStyledAttributes.getResourceId(C49511upt.Fragment.hDKMBd, 0), (Function1<? super java.lang.Integer, Unit>) new Function1() { // from class: o.uBb
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C47988uAv.values(this.AEQbTJ, ((java.lang.Integer) obj).intValue());
                }
            });
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static final Unit valueOf(C47988uAv c47988uAv, int i) {
        setInputLabel$default(c47988uAv, c47988uAv.getContext().getString(i), null, 2, null);
        return Unit.INSTANCE;
    }

    public static final Unit djBIcL(C47988uAv c47988uAv, int i) {
        c47988uAv.setInputPop(c47988uAv.getContext().getString(i));
        return Unit.INSTANCE;
    }

    public static final Unit AYXKKw(C47988uAv c47988uAv, int i) {
        setInputContent$default(c47988uAv, c47988uAv.getContext().getString(i), false, false, 6, null);
        return Unit.INSTANCE;
    }

    public static final Unit isConnected(C47988uAv c47988uAv, int i) {
        c47988uAv.setInputUnit(c47988uAv.getContext().getString(i));
        return Unit.INSTANCE;
    }

    public static final Unit fetchVPNInfo(C47988uAv c47988uAv, int i) {
        c47988uAv.setInputHint(c47988uAv.getContext().getString(i));
        return Unit.INSTANCE;
    }

    public static final Unit values(C47988uAv c47988uAv, int i) {
        c47988uAv.setInputCover(c47988uAv.getContext().getString(i));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void showInputSeekBar$default(C47988uAv c47988uAv, android.util.AttributeSet attributeSet, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            attributeSet = null;
        }
        if ((i & 2) != 0) {
            z = false;
        }
        c47988uAv.EZpvd(attributeSet, z);
    }

    public final void EZpvd(android.util.AttributeSet attributeSet, boolean z) {
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        C48012uBs c48012uBs = new C48012uBs(context, attributeSet, z, new Function1() { // from class: o.uAI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C47988uAv.copydefault(this.EZpvd, ((java.lang.Float) obj).floatValue());
            }
        });
        this.ORxRYg = c48012uBs;
        c48012uBs.setOnPercentChange(new Function1() { // from class: o.uAH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C47988uAv.AEQbTJ(this.AEQbTJ, ((java.lang.Float) obj).floatValue());
            }
        });
        C48012uBs c48012uBs2 = this.ORxRYg;
        if (c48012uBs2 != null) {
            c48012uBs2.setSeekbarStateCallback(new Function1() { // from class: o.uAF
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C47988uAv.AkhnZx(this.AEQbTJ, ((java.lang.Integer) obj).intValue());
                }
            });
        }
        TradeInputBasicsView tradeInputBasicsView = this.djBIcL;
        C48012uBs c48012uBs3 = this.ORxRYg;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = C55298xhM.dp2px$default(8.0f, null, 1, null);
        Unit unit = Unit.INSTANCE;
        tradeInputBasicsView.addView(c48012uBs3, layoutParams);
    }

    public static final Unit copydefault(C47988uAv c47988uAv, float f) {
        Function1<? super java.lang.Float, Unit> function1 = c47988uAv.zuBGHE;
        if (function1 != null) {
            function1.invoke(java.lang.Float.valueOf(f));
        }
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(C47988uAv c47988uAv, float f) {
        if (c47988uAv.ejfBZ != f) {
            c47988uAv.ejfBZ();
            c47988uAv.AEQbTJ();
            Function1<? super java.lang.Float, Unit> function1 = c47988uAv.fARcdN;
            if (function1 != null) {
                function1.invoke(java.lang.Float.valueOf(f));
            }
            java.util.Iterator<T> it = c47988uAv.zsXlph.iterator();
            while (it.hasNext()) {
                ((Function1) it.next()).invoke(java.lang.Float.valueOf(f));
            }
        }
        c47988uAv.ejfBZ = f;
        return Unit.INSTANCE;
    }

    public static final Unit AkhnZx(C47988uAv c47988uAv, int i) {
        Function1<? super java.lang.Integer, Unit> function1 = c47988uAv.sSMYrx;
        if (function1 != null) {
            function1.invoke(java.lang.Integer.valueOf(i));
        }
        return Unit.INSTANCE;
    }

    public final java.lang.String AkhnZx() {
        return this.djBIcL.copydefault();
    }

    public final C55001xbh djBIcL() {
        return this.djBIcL.EZpvd();
    }

    public static /* synthetic */ void setInputContent$default(C47988uAv c47988uAv, java.lang.String str, boolean z, boolean z2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            z2 = false;
        }
        c47988uAv.setInputContent(str, z, z2);
    }

    public final void setInputContent(java.lang.String str, boolean z, boolean z2) {
        if (z2) {
            clearSeekBarData$default(this, false, 1, null);
            setInputLayoutState$default(this, InputLayoutState.NORMAL, false, 2, null);
        }
        TradeInputBasicsView tradeInputBasicsView = this.djBIcL;
        if (str == null) {
            str = "";
        }
        tradeInputBasicsView.setContent(str);
        if (!z || wlaJM()) {
            return;
        }
        this.djBIcL.fIwbmz();
    }

    public static /* synthetic */ void setInputContentIgnoreCallback$default(C47988uAv c47988uAv, java.lang.String str, boolean z, boolean z2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            z2 = false;
        }
        c47988uAv.setInputContentIgnoreCallback(str, z, z2);
    }

    public final void setInputContentIgnoreCallback(java.lang.String str, boolean z, boolean z2) {
        Function2<? super C47988uAv, ? super java.lang.String, Unit> function2 = this.hDKMBd;
        this.hDKMBd = null;
        setInputContent(str, z, z2);
        this.hDKMBd = function2;
    }

    public final void setInputHint(java.lang.String str) {
        this.djBIcL.setHint(str == null ? "" : str);
        final android.widget.TextView textView = (android.widget.TextView) this.djBIcL.findViewById(C49511upt.Application.RcXXUw);
        this.AkhnZx = "";
        this.fetchVPNInfo = "";
        this.isConnected = "";
        if (textView != null) {
            if (str == null) {
                str = "";
            }
            if (str.length() > 0) {
                textView.post(new java.lang.Runnable() { // from class: o.uAS
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.OLrzqt.EZpvd(textView);
                    }
                });
            }
        }
        C48007uBn c48007uBn = this.DbNXlk;
        C48007uBn c48007uBn2 = null;
        if (c48007uBn == null) {
            Intrinsics.gEmmrt("");
            c48007uBn = null;
        }
        if (c48007uBn.getParent() != null) {
            C48007uBn c48007uBn3 = this.AwvSrB;
            if (c48007uBn3 == null) {
                Intrinsics.gEmmrt("");
            } else {
                c48007uBn2 = c48007uBn3;
            }
            if (c48007uBn2.getParent() != null) {
                zuBGHE();
                return;
            }
        }
        if (textView != null) {
            textView.post(new java.lang.Runnable() { // from class: o.uAX
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    C47988uAv.getNewProxyInstance(this.AEQbTJ);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getNewProxyInstance(C47988uAv c47988uAv) {
        c47988uAv.zuBGHE();
    }

    public final void setFloatingHint(java.lang.String str) {
        TradeInputBasicsView tradeInputBasicsView = this.djBIcL;
        if (str == null) {
            str = "";
        }
        tradeInputBasicsView.setFloatingHint(str);
    }

    public final void setInputTitle(java.lang.String str) {
        setInputTitleVisibility(C33129mqd.OLrzqt((java.lang.CharSequence) str));
        android.widget.TextView textView = this.wlaJM;
        if (textView != null) {
            textView.setText(str);
        }
    }

    public final void setInputTitleVisibility(boolean z) {
        android.widget.TextView textView = this.wlaJM;
        if (textView != null) {
            textView.setVisibility(z ? 0 : 8);
        }
    }

    public static /* synthetic */ C48007uBn setInputLabel$default(C47988uAv c47988uAv, java.lang.String str, InputLayoutBothSidesViewState inputLayoutBothSidesViewState, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            inputLayoutBothSidesViewState = InputLayoutBothSidesViewState.NORMAL;
        }
        return c47988uAv.AEQbTJ(str, inputLayoutBothSidesViewState);
    }

    public final C48007uBn AEQbTJ(java.lang.String str, @NotNull InputLayoutBothSidesViewState inputLayoutBothSidesViewState) {
        Intrinsics.checkNotNullParameter(inputLayoutBothSidesViewState, "");
        setInputLabelVisible(C33129mqd.OLrzqt((java.lang.CharSequence) str));
        C48007uBn c48007uBn = this.DbNXlk;
        if (c48007uBn == null) {
            Intrinsics.gEmmrt("");
            c48007uBn = null;
        }
        if (str == null) {
            str = "";
        }
        c48007uBn.setLabel(str);
        C48007uBn c48007uBn2 = this.DbNXlk;
        if (c48007uBn2 == null) {
            Intrinsics.gEmmrt("");
            c48007uBn2 = null;
        }
        if (c48007uBn2.getParent() == null) {
            TradeInputBasicsView tradeInputBasicsView = this.djBIcL;
            C48007uBn c48007uBn3 = this.DbNXlk;
            if (c48007uBn3 == null) {
                Intrinsics.gEmmrt("");
                c48007uBn3 = null;
            }
            tradeInputBasicsView.setLeftSideView(c48007uBn3);
        }
        this.AkhnZx = "";
        this.fetchVPNInfo = "";
        this.isConnected = "";
        AxsJAY();
        this.djBIcL.fetchVPNInfo();
        if (inputLayoutBothSidesViewState != InputLayoutBothSidesViewState.NORMAL) {
            C48007uBn c48007uBn4 = this.DbNXlk;
            if (c48007uBn4 == null) {
                Intrinsics.gEmmrt("");
                c48007uBn4 = null;
            }
            c48007uBn4.setStatus(inputLayoutBothSidesViewState);
        }
        C48007uBn c48007uBn5 = this.DbNXlk;
        if (c48007uBn5 != null) {
            return c48007uBn5;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public final java.lang.String values() {
        C48007uBn c48007uBn = this.DbNXlk;
        if (c48007uBn == null) {
            Intrinsics.gEmmrt("");
            c48007uBn = null;
        }
        return c48007uBn.KWHzl();
    }

    public final void setNegativeMode() {
        this.djBIcL.setNegativeMode();
    }

    public final void setPositiveMode() {
        this.djBIcL.setPositiveMode();
    }

    public final void setInputLabelVisible(boolean z) {
        C48007uBn c48007uBn = this.DbNXlk;
        if (c48007uBn == null) {
            Intrinsics.gEmmrt("");
            c48007uBn = null;
        }
        c48007uBn.setVisibility(z ? 0 : 8);
    }

    public final void setInputUnitBolded(boolean z) {
        C48007uBn c48007uBn = this.AwvSrB;
        if (c48007uBn == null) {
            Intrinsics.gEmmrt("");
            c48007uBn = null;
        }
        c48007uBn.setLabelBolded(z);
    }

    public final void setPlusMinusViewVisible(boolean z) {
        ORxRYg().setVisibility(z ? 0 : 8);
        if (this.zLjUOn && z && ORxRYg().getParent() == null) {
            this.djBIcL.setSecondRightSideView(ORxRYg());
        }
    }

    public void setInputUnit(java.lang.String str) {
        setInputUnitVisible(C33129mqd.OLrzqt((java.lang.CharSequence) str) && !this.zLjUOn);
        C48007uBn c48007uBn = this.AwvSrB;
        C48007uBn c48007uBn2 = null;
        if (c48007uBn == null) {
            Intrinsics.gEmmrt("");
            c48007uBn = null;
        }
        if (str == null) {
            str = "";
        }
        c48007uBn.setLabel(str);
        C48007uBn c48007uBn3 = this.AwvSrB;
        if (c48007uBn3 == null) {
            Intrinsics.gEmmrt("");
            c48007uBn3 = null;
        }
        c48007uBn3.setContentGravity(8388613);
        C48007uBn c48007uBn4 = this.AwvSrB;
        if (c48007uBn4 == null) {
            Intrinsics.gEmmrt("");
            c48007uBn4 = null;
        }
        if (c48007uBn4.getParent() == null) {
            TradeInputBasicsView tradeInputBasicsView = this.djBIcL;
            C48007uBn c48007uBn5 = this.AwvSrB;
            if (c48007uBn5 == null) {
                Intrinsics.gEmmrt("");
                c48007uBn5 = null;
            }
            tradeInputBasicsView.setRightSideView(c48007uBn5);
        }
        this.AkhnZx = "";
        this.fetchVPNInfo = "";
        this.isConnected = "";
        zuBGHE();
        C48007uBn c48007uBn6 = this.AwvSrB;
        if (c48007uBn6 == null) {
            Intrinsics.gEmmrt("");
            c48007uBn6 = null;
        }
        if (!c48007uBn6.AEQbTJ()) {
            C48007uBn c48007uBn7 = this.AwvSrB;
            if (c48007uBn7 == null) {
                Intrinsics.gEmmrt("");
                c48007uBn7 = null;
            }
            if (c48007uBn7.OLrzqt() == InputLayoutBothSidesViewState.NORMAL) {
                C48007uBn c48007uBn8 = this.AwvSrB;
                if (c48007uBn8 == null) {
                    Intrinsics.gEmmrt("");
                    c48007uBn8 = null;
                }
                c48007uBn8.setOnClickListener(new View.OnClickListener() { // from class: o.uAL
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view) {
                        C47988uAv.setInputUnit$lambda$26(this.OLrzqt, view);
                    }
                });
            }
        }
        C48007uBn c48007uBn9 = this.AwvSrB;
        if (c48007uBn9 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c48007uBn2 = c48007uBn9;
        }
        if (c48007uBn2.AEQbTJ()) {
            this.djBIcL.AuCTel();
        }
        this.djBIcL.fetchVPNInfo();
    }

    public static final void setInputUnit$lambda$26(C47988uAv c47988uAv, android.view.View view) {
        C48007uBn c48007uBn = c47988uAv.AwvSrB;
        C48007uBn c48007uBn2 = null;
        if (c48007uBn == null) {
            Intrinsics.gEmmrt("");
            c48007uBn = null;
        }
        if (c48007uBn.copydefault()) {
            return;
        }
        C48007uBn c48007uBn3 = c47988uAv.AwvSrB;
        if (c48007uBn3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c48007uBn2 = c48007uBn3;
        }
        if (c48007uBn2.OLrzqt() != InputLayoutBothSidesViewState.NORMAL) {
            return;
        }
        c47988uAv.zsXlph();
    }

    public final java.lang.String fARcdN() {
        C48007uBn c48007uBn = this.AwvSrB;
        if (c48007uBn == null) {
            Intrinsics.gEmmrt("");
            c48007uBn = null;
        }
        return c48007uBn.KWHzl();
    }

    public final void setInputUnitVisible(boolean z) {
        C48007uBn c48007uBn = this.AwvSrB;
        if (c48007uBn == null) {
            Intrinsics.gEmmrt("");
            c48007uBn = null;
        }
        c48007uBn.setVisibility(z ? 0 : 8);
    }

    public static /* synthetic */ void setInputErrorMsg$default(C47988uAv c47988uAv, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        c47988uAv.setInputErrorMsg(str);
    }

    public final void setInputErrorMsg(java.lang.String str) {
        this.djBIcL.setErrorState(true);
        TradeInputBasicsView tradeInputBasicsView = this.djBIcL;
        if (str == null) {
            str = "";
        }
        tradeInputBasicsView.setErrorMsg(str);
    }

    public final java.lang.String fetchVPNInfo() {
        return this.djBIcL.KWHzl();
    }

    public final void copydefault() {
        this.djBIcL.setErrorState(false);
        this.copydefault = null;
    }

    public final boolean getFieldNames() {
        return this.djBIcL.AYXKKw();
    }

    public final boolean hDKMBd() {
        if (getVisibility() != 8) {
            return fetchVPNInfo().length() == 0 && (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) AkhnZx()) ^ true);
        }
        return true;
    }

    public final boolean uzCIH() {
        return getVisibility() == 0 && StringsKt__StringsKt.fARcdN((java.lang.CharSequence) AkhnZx());
    }

    public final boolean KWHzl() {
        boolean zAEQbTJ = C33129mqd.AEQbTJ(AkhnZx(), 0);
        if (!zAEQbTJ) {
            zsXlph();
        }
        return zAEQbTJ;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.uAv */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setLabelClickable$default(C47988uAv c47988uAv, boolean z, Function0 function0, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            function0 = null;
        }
        c47988uAv.setLabelClickable(z, function0);
    }

    public final void setLabelClickable(boolean z, final Function0<Unit> function0) {
        C48007uBn c48007uBn = this.DbNXlk;
        C48007uBn c48007uBn2 = null;
        if (c48007uBn == null) {
            Intrinsics.gEmmrt("");
            c48007uBn = null;
        }
        c48007uBn.setSupportClick(z);
        if (z) {
            C48007uBn c48007uBn3 = this.DbNXlk;
            if (c48007uBn3 == null) {
                Intrinsics.gEmmrt("");
            } else {
                c48007uBn2 = c48007uBn3;
            }
            c48007uBn2.setOnClickListener(new View.OnClickListener() { // from class: o.uBa
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C47988uAv.setLabelClickable$lambda$27(function0, this, view);
                }
            });
        }
    }

    public static final void setLabelClickable$lambda$27(Function0 function0, C47988uAv c47988uAv, android.view.View view) {
        if (function0 != null) {
            function0.invoke();
        }
        C48007uBn c48007uBn = c47988uAv.DbNXlk;
        if (c48007uBn == null) {
            Intrinsics.gEmmrt("");
            c48007uBn = null;
        }
        c48007uBn.setLabelSelected(true);
    }

    public final void setUnClickButShowArrow() {
        C48007uBn c48007uBn = this.AwvSrB;
        if (c48007uBn == null) {
            Intrinsics.gEmmrt("");
            c48007uBn = null;
        }
        c48007uBn.setUnClickButShowArrow();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.uAv */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setUnitClickable$default(C47988uAv c47988uAv, boolean z, Function0 function0, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            function0 = null;
        }
        c47988uAv.setUnitClickable(z, function0);
    }

    public final void setUnitClickable(final boolean z, final Function0<Unit> function0) {
        C48007uBn c48007uBn = this.AwvSrB;
        C48007uBn c48007uBn2 = null;
        if (c48007uBn == null) {
            Intrinsics.gEmmrt("");
            c48007uBn = null;
        }
        c48007uBn.setSupportClick(z);
        if (z) {
            this.djBIcL.AuCTel();
        }
        C48007uBn c48007uBn3 = this.AwvSrB;
        if (c48007uBn3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c48007uBn2 = c48007uBn3;
        }
        c48007uBn2.setOnClickListener(new View.OnClickListener() { // from class: o.uBi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C47988uAv.setUnitClickable$lambda$28(z, function0, this, view);
            }
        });
    }

    public static final void setUnitClickable$lambda$28(boolean z, Function0 function0, C47988uAv c47988uAv, android.view.View view) {
        C48007uBn c48007uBn = null;
        if (z) {
            if (function0 != null) {
                function0.invoke();
            }
            C48007uBn c48007uBn2 = c47988uAv.AwvSrB;
            if (c48007uBn2 == null) {
                Intrinsics.gEmmrt("");
            } else {
                c48007uBn = c48007uBn2;
            }
            c48007uBn.setLabelSelected(true);
            return;
        }
        C48007uBn c48007uBn3 = c47988uAv.AwvSrB;
        if (c48007uBn3 == null) {
            Intrinsics.gEmmrt("");
            c48007uBn3 = null;
        }
        if (c48007uBn3.copydefault()) {
            return;
        }
        C48007uBn c48007uBn4 = c47988uAv.AwvSrB;
        if (c48007uBn4 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c48007uBn = c48007uBn4;
        }
        if (c48007uBn.OLrzqt() != InputLayoutBothSidesViewState.NORMAL) {
            return;
        }
        c47988uAv.zsXlph();
    }

    public final void setMaxDecimal(int i) {
        this.djBIcL.setMaxDecimal(i);
    }

    public final int AuCTel() {
        return this.djBIcL.AhwBna();
    }

    public static /* synthetic */ void setInputLayoutState$default(C47988uAv c47988uAv, InputLayoutState inputLayoutState, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        c47988uAv.setInputLayoutState(inputLayoutState, z);
    }

    public final void setInputLayoutState(@NotNull InputLayoutState inputLayoutState, boolean z) {
        Function1<? super InputLayoutState, Unit> function1;
        Intrinsics.checkNotNullParameter(inputLayoutState, "");
        this.djBIcL.setStatus(inputLayoutState);
        if (!z || (function1 = this.iwGUEr) == null) {
            return;
        }
        function1.invoke(inputLayoutState);
    }

    public final void setEnableClickCallback(Function1<? super java.lang.Boolean, Unit> function1) {
        this.djBIcL.setClickCallback(function1);
    }

    public final InputLayoutState isConnected() {
        return this.djBIcL.AkhnZx();
    }

    public final void setInputCover(java.lang.String str) {
        TradeInputBasicsView tradeInputBasicsView = this.djBIcL;
        if (str == null) {
            str = "";
        }
        tradeInputBasicsView.setCoverText(str);
    }

    public final java.lang.String DbNXlk() {
        return this.djBIcL.AEQbTJ();
    }

    public final void zsXlph() {
        this.djBIcL.post(new java.lang.Runnable() { // from class: o.uAW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C47988uAv.fARcdN(this.copydefault);
            }
        });
    }

    public static final void fARcdN(C47988uAv c47988uAv) {
        c47988uAv.djBIcL.fARcdN();
    }

    public final void ejfBZ() {
        this.djBIcL.values();
    }

    public final void OLrzqt(@NotNull Function2<? super C47988uAv, ? super java.lang.Boolean, Unit> function2) {
        Intrinsics.checkNotNullParameter(function2, "");
        if (this.gEmmrt.contains(function2)) {
            return;
        }
        this.gEmmrt.add(function2);
    }

    public final void KWHzl(@NotNull Function2<? super C47988uAv, ? super java.lang.Boolean, Unit> function2) {
        Intrinsics.checkNotNullParameter(function2, "");
        this.gEmmrt.remove(function2);
    }

    public final void setInputErrorMsg(java.lang.String[] strArr) {
        if (strArr != null && strArr.length == 2) {
            setInputErrorMsg(strArr[0]);
            this.copydefault = strArr[1];
        } else {
            copydefault();
        }
    }

    public final void AEQbTJ() {
        this.djBIcL.setFocus(false);
    }

    public final void setInputFocus() {
        this.djBIcL.setFocus(true);
    }

    public final boolean getNewProxyInstance() {
        return this.djBIcL.valueOf();
    }

    public final void AuCTelauCTel() {
        if (C33129mqd.OLrzqt((java.lang.CharSequence) this.copydefault)) {
            this.djBIcL.setErrorState(false);
            setInputContent$default(this, this.copydefault, false, false, 6, null);
            this.copydefault = null;
        }
    }

    public final void setPercentVisible(int i) {
        C48012uBs c48012uBs = this.ORxRYg;
        if (c48012uBs != null) {
            c48012uBs.setVisibility(i);
        }
    }

    public final void setPercentEnabled(boolean z) {
        C48012uBs c48012uBs = this.ORxRYg;
        if (c48012uBs != null) {
            c48012uBs.setEnable(z);
        }
    }

    public final void setSidesLabelUnselect() {
        C48007uBn c48007uBn = this.DbNXlk;
        C48007uBn c48007uBn2 = null;
        if (c48007uBn == null) {
            Intrinsics.gEmmrt("");
            c48007uBn = null;
        }
        c48007uBn.setLabelSelected(false);
        C48007uBn c48007uBn3 = this.AwvSrB;
        if (c48007uBn3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c48007uBn2 = c48007uBn3;
        }
        c48007uBn2.setLabelSelected(false);
    }

    public final void OLrzqt() {
        if (OcIXYQ().getParent() == null) {
            addView(OcIXYQ());
            OcIXYQ().setVisibility(4);
        }
    }

    public final void setInputPop(java.lang.CharSequence charSequence) {
        if (C33129mqd.OLrzqt(charSequence)) {
            OLrzqt();
            C48010uBq c48010uBqOcIXYQ = OcIXYQ();
            if (charSequence == null) {
                charSequence = "";
            }
            c48010uBqOcIXYQ.setPopText(charSequence);
            return;
        }
        OcIXYQ().setVisibility(4);
    }

    public static /* synthetic */ void setInputPopWithDuration$default(C47988uAv c47988uAv, java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, long j, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            j = 3;
        }
        c47988uAv.setInputPopWithDuration(charSequence, charSequence2, j);
    }

    public final void setInputPopWithDuration(java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, long j) {
        InterfaceC58217yxC interfaceC58217yxC = this.AuCTelauCTel;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        if (C33129mqd.OLrzqt(charSequence) || C33129mqd.OLrzqt(charSequence2)) {
            OLrzqt();
            C48010uBq c48010uBqOcIXYQ = OcIXYQ();
            if (charSequence == null) {
                charSequence = "";
            }
            if (charSequence2 == null) {
                charSequence2 = "";
            }
            c48010uBqOcIXYQ.setPopText(charSequence, charSequence2);
            AbstractC58247yxg<java.lang.Long> abstractC58247yxgTimer = AbstractC58247yxg.timer(j, java.util.concurrent.TimeUnit.SECONDS);
            final Function1 function1 = new Function1() { // from class: o.uAQ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C47988uAv.OLrzqt(this.OLrzqt, (java.lang.Long) obj);
                }
            };
            this.AuCTelauCTel = abstractC58247yxgTimer.subscribe(new InterfaceC58227yxM() { // from class: o.uAR
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    function1.invoke(obj);
                }
            });
            return;
        }
        OcIXYQ().setVisibility(4);
        this.AuCTelauCTel = null;
    }

    public static final Unit OLrzqt(C47988uAv c47988uAv, java.lang.Long l) {
        c47988uAv.OcIXYQ().setVisibility(4);
        c47988uAv.AuCTelauCTel = null;
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.uAv */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setPercentSeekBarListener$default(C47988uAv c47988uAv, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = null;
        }
        c47988uAv.setPercentSeekBarListener(function1);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.uAv */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void addPercentSeekBarListener$default(C47988uAv c47988uAv, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = null;
        }
        c47988uAv.copydefault((Function1<? super java.lang.Float, Unit>) function1);
    }

    public final void copydefault(Function1<? super java.lang.Float, Unit> function1) {
        if (function1 == null || this.zsXlph.contains(function1)) {
            return;
        }
        this.zsXlph.add(function1);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.uAv */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void removePercentSeekBarListener$default(C47988uAv c47988uAv, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = null;
        }
        c47988uAv.AEQbTJ((Function1<? super java.lang.Float, Unit>) function1);
    }

    public final void AEQbTJ(Function1<? super java.lang.Float, Unit> function1) {
        if (function1 == null) {
            return;
        }
        this.zsXlph.remove(function1);
    }

    public final float fJNWhG() {
        pUU.valueOf("OKTInputLayout", "getSeekBarPercent--seekbarView != null:" + (this.ORxRYg != null));
        C48012uBs c48012uBs = this.ORxRYg;
        if (c48012uBs != null) {
            return c48012uBs.EZpvd();
        }
        return 0.0f;
    }

    public static /* synthetic */ void setMaxPercent$default(C47988uAv c47988uAv, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        c47988uAv.setMaxPercent(z);
    }

    public final void setMaxPercent(boolean z) {
        C48012uBs c48012uBs = this.ORxRYg;
        if (c48012uBs != null) {
            c48012uBs.setMaxPercent(z);
        }
    }

    public final boolean zLjUOn() {
        return !(fJNWhG() == 0.0f);
    }

    public final void setSeekBarPercent(float f) {
        C48012uBs c48012uBs = this.ORxRYg;
        if (c48012uBs != null) {
            c48012uBs.setPercent(f);
        }
    }

    public static /* synthetic */ void clearSeekBarData$default(C47988uAv c47988uAv, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        c47988uAv.OLrzqt(z);
    }

    public final void OLrzqt(boolean z) {
        Function1<? super java.lang.Float, Unit> function1;
        C48012uBs c48012uBs = this.ORxRYg;
        if (c48012uBs != null) {
            c48012uBs.OLrzqt();
        }
        java.util.Iterator<T> it = this.zsXlph.iterator();
        while (it.hasNext()) {
            ((Function1) it.next()).invoke(java.lang.Float.valueOf(fJNWhG()));
        }
        if (z && (function1 = this.fARcdN) != null) {
            function1.invoke(java.lang.Float.valueOf(fJNWhG()));
        }
        this.ejfBZ = 0.0f;
    }

    public final void KWHzl(java.lang.String str) {
        if (copydefault(str)) {
            return;
        }
        Function2<? super C47988uAv, ? super java.lang.String, Unit> function2 = this.hDKMBd;
        if (function2 != null) {
            function2.invoke(this, str);
        }
        java.util.ArrayList<uBH> arrayList = this.AhwBna;
        if (arrayList != null) {
            java.util.Iterator<T> it = arrayList.iterator();
            while (it.hasNext()) {
                ((uBH) it.next()).afterTextChanged(android.text.SpannableStringBuilder.valueOf(""));
            }
        }
        this.AuCTel = java.lang.System.currentTimeMillis();
    }

    public final void KWHzl(boolean z) {
        Function2<? super C47988uAv, ? super java.lang.Boolean, Unit> function2 = this.uzCIH;
        if (function2 != null) {
            function2.invoke(this, java.lang.Boolean.valueOf(z));
        }
        if (!z) {
            OcIXYQ().setVisibility(4);
        }
        java.util.Iterator<T> it = this.gEmmrt.iterator();
        while (it.hasNext()) {
            ((Function2) it.next()).invoke(this, java.lang.Boolean.valueOf(z));
        }
        if (z) {
            if (DbNXlk().length() > 0) {
                OLrzqt(true);
                this.ejfBZ = 0.0f;
                return;
            }
            return;
        }
        AuCTelauCTel();
    }

    public final boolean copydefault(java.lang.String str) {
        if (C33129mqd.OLrzqt((java.lang.CharSequence) this.fJNWhG) && C33129mqd.AEQbTJ(str, this.fJNWhG)) {
            setInputContent$default(this, this.fJNWhG, false, false, 6, null);
            Function1<? super java.lang.String, Unit> function1 = this.getNewProxyInstance;
            if (function1 != null) {
                java.lang.String str2 = this.fJNWhG;
                function1.invoke(str2 != null ? str2 : "");
            }
            return true;
        }
        MaxValueJudgeListener maxValueJudgeListener = this.getFieldNames;
        java.lang.String strAfterTextChange = maxValueJudgeListener != null ? maxValueJudgeListener.afterTextChange(this, str) : null;
        if (!C33129mqd.OLrzqt((java.lang.CharSequence) strAfterTextChange)) {
            return false;
        }
        setInputContent$default(this, strAfterTextChange, false, false, 6, null);
        Function1<? super java.lang.String, Unit> function12 = this.getNewProxyInstance;
        if (function12 != null) {
            function12.invoke(strAfterTextChange != null ? strAfterTextChange : "");
        }
        return true;
    }

    public final void setInputSkipCallback(@NotNull uBH... ubhArr) {
        Intrinsics.checkNotNullParameter(ubhArr, "");
        if (this.QOLQEE == null) {
            this.QOLQEE = new java.util.ArrayList<>();
        }
        for (uBH ubh : ubhArr) {
            java.util.ArrayList<uBH> arrayList = this.QOLQEE;
            if (arrayList != null) {
                arrayList.add(ubh);
            }
        }
    }

    public final void KWHzl(@NotNull uBH ubh) {
        java.util.ArrayList<uBH> arrayList;
        Intrinsics.checkNotNullParameter(ubh, "");
        if (this.AhwBna == null) {
            this.AhwBna = new java.util.ArrayList<>();
        }
        java.util.ArrayList<uBH> arrayList2 = this.AhwBna;
        if (arrayList2 == null || arrayList2.contains(ubh) || (arrayList = this.AhwBna) == null) {
            return;
        }
        arrayList.add(ubh);
    }

    public final void OLrzqt(@NotNull uBH ubh) {
        Intrinsics.checkNotNullParameter(ubh, "");
        java.util.ArrayList<uBH> arrayList = this.AhwBna;
        java.util.Iterator<uBH> it = arrayList != null ? arrayList.iterator() : null;
        while (it != null && it.hasNext()) {
            uBH next = it.next();
            Intrinsics.checkNotNullExpressionValue(next, "");
            if (Intrinsics.EZpvd(next, ubh)) {
                it.remove();
            }
        }
    }

    public final void copydefault(@NotNull uBH ubh) {
        java.util.ArrayList<uBH> arrayList;
        Intrinsics.checkNotNullParameter(ubh, "");
        AwvSrB();
        if (this.KWHzl == null) {
            this.KWHzl = new java.util.ArrayList<>();
        }
        java.util.ArrayList<uBH> arrayList2 = this.KWHzl;
        if (arrayList2 == null || arrayList2.contains(ubh) || (arrayList = this.KWHzl) == null) {
            return;
        }
        arrayList.add(ubh);
    }

    public final void EZpvd() {
        java.util.ArrayList<uBH> arrayList = this.AhwBna;
        if (arrayList != null) {
            arrayList.clear();
        }
        java.util.ArrayList<uBH> arrayList2 = this.KWHzl;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        gHZMYf();
    }

    public final void AEQbTJ(@NotNull uBH ubh) {
        int iIndexOf;
        Intrinsics.checkNotNullParameter(ubh, "");
        java.util.ArrayList<uBH> arrayList = this.KWHzl;
        if (arrayList != null && (iIndexOf = arrayList.indexOf(ubh)) >= 0) {
            arrayList.remove(iIndexOf);
        }
        java.util.ArrayList<uBH> arrayList2 = this.KWHzl;
        if (arrayList2 == null || !arrayList2.isEmpty()) {
            return;
        }
        gHZMYf();
    }

    public final void setInputBasicsFunctionButton(@NotNull android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        this.djBIcL.setRightSideView(view, 17);
    }

    public final void sSMYrx() {
        TradeInputBasicsView tradeInputBasicsView = this.djBIcL;
        ConstraintLayout constraintLayout = (ConstraintLayout) tradeInputBasicsView.findViewById(C49511upt.Application.finit);
        if (constraintLayout != null) {
            ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
            if (layoutParams != null) {
                android.content.Context context = constraintLayout.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                layoutParams.height = C55298xhM.copydefault(48.0f, context);
                constraintLayout.setLayoutParams(layoutParams);
            } else {
                throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
        }
        TextInputLayout textInputLayout = (TextInputLayout) tradeInputBasicsView.findViewById(C49511upt.Application.dxcTrN);
        if (textInputLayout != null) {
            android.content.Context context2 = tradeInputBasicsView.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            int iCopydefault = C55298xhM.copydefault(4.0f, context2);
            android.content.Context context3 = tradeInputBasicsView.getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "");
            textInputLayout.setPaddingRelative(textInputLayout.getPaddingStart(), iCopydefault, textInputLayout.getPaddingEnd(), C55298xhM.copydefault(4.0f, context3));
        }
    }

    public final void AwvSrB() {
        if (this.fIwbmz != null) {
            return;
        }
        this.AuCTel = 0L;
        AbstractC58247yxg<java.lang.Long> abstractC58247yxgInterval = AbstractC58247yxg.interval(0L, this.OLrzqt, java.util.concurrent.TimeUnit.MILLISECONDS, C58266yxz.OLrzqt());
        final Function1 function1 = new Function1() { // from class: o.uAA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C47988uAv.KWHzl(this.EZpvd, (java.lang.Long) obj);
            }
        };
        InterfaceC58227yxM<? super java.lang.Long> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.uAC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C47988uAv.EZpvd(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.uAE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C47988uAv.AEQbTJ(this.copydefault, (java.lang.Throwable) obj);
            }
        };
        this.fIwbmz = abstractC58247yxgInterval.subscribe(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.uAD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C47988uAv.copydefault(function12, obj);
            }
        });
    }

    public static final void EZpvd(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit KWHzl(C47988uAv c47988uAv, java.lang.Long l) {
        if (c47988uAv.AuCTel != 0 && C33129mqd.copydefault(C33129mqd.subS$default(java.lang.Long.valueOf(java.lang.System.currentTimeMillis()), java.lang.Long.valueOf(c47988uAv.AuCTel), null, null, null, 14, null), java.lang.Long.valueOf(c47988uAv.OLrzqt))) {
            c47988uAv.AuCTel = 0L;
            java.util.ArrayList<uBH> arrayList = c47988uAv.KWHzl;
            if (arrayList != null) {
                for (uBH ubh : arrayList) {
                    java.util.ArrayList<uBH> arrayList2 = c47988uAv.QOLQEE;
                    if (arrayList2 == null || !arrayList2.contains(ubh)) {
                        ubh.afterTextChanged(Editable.Factory.getInstance().newEditable(c47988uAv.AkhnZx()));
                    }
                }
            }
            java.util.ArrayList<uBH> arrayList3 = c47988uAv.QOLQEE;
            if (arrayList3 != null) {
                arrayList3.clear();
            }
        }
        return Unit.INSTANCE;
    }

    public static final void copydefault(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(C47988uAv c47988uAv, java.lang.Throwable th) {
        java.util.ArrayList<uBH> arrayList = c47988uAv.QOLQEE;
        if (arrayList != null) {
            arrayList.clear();
        }
        c47988uAv.AuCTel = 0L;
        return Unit.INSTANCE;
    }

    public final void gHZMYf() {
        InterfaceC58217yxC interfaceC58217yxC = this.fIwbmz;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        this.fIwbmz = null;
        this.AuCTel = 0L;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        AhwBna();
        try {
            post(new java.lang.Runnable() { // from class: o.uBd
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    C47988uAv.fetchVPNInfo(this.AEQbTJ);
                }
            });
        } catch (java.lang.Exception e) {
            pUU.KWHzl("OKTInputLayout", "registerEventListener--exception: " + e.getMessage());
        }
    }

    public static final void fetchVPNInfo(final C47988uAv c47988uAv) {
        InterfaceC59495ziC interfaceC59495ziC = c47988uAv.AYXKKw;
        if (interfaceC59495ziC != null) {
            interfaceC59495ziC.copydefault();
        }
        android.content.Context context = c47988uAv.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        AppCompatActivity appCompatActivityCopydefault = C49955uyM.copydefault(context);
        if (appCompatActivityCopydefault != null) {
            c47988uAv.AYXKKw = C59541ziw.AEQbTJ.copydefault(appCompatActivityCopydefault, new InterfaceC59496ziD() { // from class: o.uAP
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC59496ziD
                public final void OLrzqt(boolean z) {
                    C47988uAv.AEQbTJ(this.EZpvd, z);
                }
            });
        }
        c47988uAv.postDelayed(new java.lang.Runnable() { // from class: o.uAT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C47988uAv.fJNWhG(this.EZpvd);
            }
        }, 100L);
    }

    public static final void AEQbTJ(C47988uAv c47988uAv, boolean z) {
        if (z) {
            return;
        }
        c47988uAv.AEQbTJ();
    }

    public static final void fJNWhG(C47988uAv c47988uAv) {
        c47988uAv.AYXKKw();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        InterfaceC59495ziC interfaceC59495ziC = this.AYXKKw;
        if (interfaceC59495ziC != null) {
            interfaceC59495ziC.copydefault();
        }
        InterfaceC58217yxC interfaceC58217yxC = this.AuCTelauCTel;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        gHZMYf();
        AhwBna();
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onVisibilityChanged(@NotNull android.view.View view, int i) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onVisibilityChanged(view, i);
        if (i != 0) {
            AhwBna();
        } else {
            post(new java.lang.Runnable() { // from class: o.uAx
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    C47988uAv.fIwbmz(this.copydefault);
                }
            });
        }
    }

    public static final void fIwbmz(C47988uAv c47988uAv) {
        c47988uAv.AhwBna();
        c47988uAv.AYXKKw();
    }

    /* JADX INFO: renamed from: o.uAv$Application */
    public static final class Application implements ViewTreeObserver.OnGlobalLayoutListener {
        public Application() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            C47988uAv.this.djBIcL.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            if (C47988uAv.this.djBIcL.getWidth() > 0) {
                C47988uAv.this.AubY();
            }
        }
    }

    public final void AYXKKw() {
        this.AkhnZx = "";
        this.fetchVPNInfo = "";
        this.isConnected = "";
        if (this.djBIcL.getWidth() == 0) {
            this.djBIcL.getViewTreeObserver().addOnGlobalLayoutListener(new Application());
        } else {
            AubY();
        }
    }

    public final void AubY() {
        C48007uBn c48007uBn = this.DbNXlk;
        C48007uBn c48007uBn2 = null;
        if (c48007uBn == null) {
            Intrinsics.gEmmrt("");
            c48007uBn = null;
        }
        if (c48007uBn.getParent() != null) {
            C48007uBn c48007uBn3 = this.AwvSrB;
            if (c48007uBn3 == null) {
                Intrinsics.gEmmrt("");
                c48007uBn3 = null;
            }
            if (c48007uBn3.getParent() != null) {
                zuBGHE();
                return;
            }
        }
        C48007uBn c48007uBn4 = this.DbNXlk;
        if (c48007uBn4 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c48007uBn2 = c48007uBn4;
        }
        if (c48007uBn2.getParent() != null) {
            AxsJAY();
        }
    }

    public final void AhwBna() {
        this.AkhnZx = "";
        this.fetchVPNInfo = "";
        this.isConnected = "";
        View.OnLayoutChangeListener onLayoutChangeListener = this.valueOf;
        if (onLayoutChangeListener != null) {
            this.djBIcL.removeOnLayoutChangeListener(onLayoutChangeListener);
            this.valueOf = null;
        }
        View.OnLayoutChangeListener onLayoutChangeListener2 = this.values;
        if (onLayoutChangeListener2 != null) {
            C48007uBn c48007uBn = this.DbNXlk;
            if (c48007uBn == null) {
                Intrinsics.gEmmrt("");
                c48007uBn = null;
            }
            c48007uBn.removeOnLayoutChangeListener(onLayoutChangeListener2);
            this.values = null;
        }
        View.OnLayoutChangeListener onLayoutChangeListener3 = this.AxsJAY;
        if (onLayoutChangeListener3 != null) {
            C48007uBn c48007uBn2 = this.AwvSrB;
            if (c48007uBn2 == null) {
                Intrinsics.gEmmrt("");
                c48007uBn2 = null;
            }
            c48007uBn2.removeOnLayoutChangeListener(onLayoutChangeListener3);
            this.AxsJAY = null;
        }
    }

    public final int AEQbTJ(android.widget.TextView textView) {
        java.lang.String string = textView.getText().toString();
        if (string.length() > 0) {
            return (int) textView.getPaint().measureText(string);
        }
        return 0;
    }

    public final void EZpvd(android.widget.TextView textView) {
        int iCopydefault;
        if (textView != null) {
            java.lang.CharSequence text = textView.getText();
            Intrinsics.checkNotNullExpressionValue(text, "");
            if (text.length() <= 0 || textView.getVisibility() != 0) {
                return;
            }
            int iMeasureText = (int) textView.getPaint().measureText(textView.getText().toString());
            if (textView.getMinWidth() != iMeasureText) {
                textView.setMinWidth(iMeasureText);
            }
            if (textView.getWidth() == 0) {
                ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
                ConstraintLayout.LayoutParams layoutParams2 = layoutParams instanceof ConstraintLayout.LayoutParams ? (ConstraintLayout.LayoutParams) layoutParams : null;
                if (layoutParams2 == null || ((ViewGroup.MarginLayoutParams) layoutParams2).width == (iCopydefault = C56548yJl.copydefault(iMeasureText, textView.getMinWidth()))) {
                    return;
                }
                ((ViewGroup.MarginLayoutParams) layoutParams2).width = iCopydefault;
                textView.setLayoutParams(layoutParams2);
                textView.requestLayout();
                pUU.EZpvd("OKTInputLayout", "ensureHintWidth - fixed hint width to " + ((ViewGroup.MarginLayoutParams) layoutParams2).width);
            }
        }
    }

    public final void EZpvd(int i, int i2, int i3, int i4) {
        int i5 = (int) (i2 * 0.8f);
        int i6 = (i2 - i3) - i4;
        int iCopydefault = (i > i6 || i > i5) ? C56548yJl.copydefault(C56548yJl.valueOf(i6, i5), 0) : Integer.MAX_VALUE;
        C48007uBn c48007uBn = this.DbNXlk;
        C48007uBn c48007uBn2 = null;
        if (c48007uBn == null) {
            Intrinsics.gEmmrt("");
            c48007uBn = null;
        }
        if (c48007uBn.gEmmrt().getMaxWidth() != iCopydefault) {
            C48007uBn c48007uBn3 = this.DbNXlk;
            if (c48007uBn3 == null) {
                Intrinsics.gEmmrt("");
            } else {
                c48007uBn2 = c48007uBn3;
            }
            c48007uBn2.gEmmrt().setMaxWidth(iCopydefault);
        }
    }

    public final void OLrzqt(int i, int i2, int i3) {
        int i4 = (i - i2) - i3;
        C48007uBn c48007uBn = null;
        int iCopydefault = C56548yJl.copydefault(i4 - C55298xhM.dp2px$default(34.0f, null, 1, null), 0);
        if (iCopydefault <= C55298xhM.dp2px$default(20.0f, null, 1, null)) {
            iCopydefault = Integer.MAX_VALUE;
        }
        C48007uBn c48007uBn2 = this.AwvSrB;
        if (c48007uBn2 == null) {
            Intrinsics.gEmmrt("");
            c48007uBn2 = null;
        }
        if (c48007uBn2.gEmmrt().getMaxWidth() != iCopydefault) {
            C48007uBn c48007uBn3 = this.AwvSrB;
            if (c48007uBn3 == null) {
                Intrinsics.gEmmrt("");
            } else {
                c48007uBn = c48007uBn3;
            }
            c48007uBn.gEmmrt().setMaxWidth(iCopydefault);
        }
    }

    public final void AxsJAY() {
        C48007uBn c48007uBn = this.DbNXlk;
        if (c48007uBn == null) {
            Intrinsics.gEmmrt("");
            c48007uBn = null;
        }
        c48007uBn.post(new java.lang.Runnable() { // from class: o.uAJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C47988uAv.AuCTel(this.AEQbTJ);
            }
        });
    }

    public static final void AuCTel(final C47988uAv c47988uAv) {
        final Function0 function0 = new Function0() { // from class: o.uBf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C47988uAv.ejfBZ(this.OLrzqt);
            }
        };
        View.OnLayoutChangeListener onLayoutChangeListener = c47988uAv.valueOf;
        if (onLayoutChangeListener != null) {
            c47988uAv.djBIcL.removeOnLayoutChangeListener(onLayoutChangeListener);
        }
        View.OnLayoutChangeListener onLayoutChangeListener2 = new View.OnLayoutChangeListener() { // from class: o.uBg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(android.view.View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                C47988uAv.KWHzl(function0, view, i, i2, i3, i4, i5, i6, i7, i8);
            }
        };
        c47988uAv.valueOf = onLayoutChangeListener2;
        TradeInputBasicsView tradeInputBasicsView = c47988uAv.djBIcL;
        Intrinsics.copydefault(onLayoutChangeListener2);
        tradeInputBasicsView.addOnLayoutChangeListener(onLayoutChangeListener2);
        function0.invoke();
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00fb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit ejfBZ(C47988uAv c47988uAv) {
        java.lang.String string;
        java.lang.String string2;
        C48007uBn c48007uBn;
        int iAEQbTJ;
        java.lang.CharSequence text;
        C48007uBn c48007uBn2 = c47988uAv.DbNXlk;
        C48007uBn c48007uBn3 = null;
        if (c48007uBn2 == null) {
            Intrinsics.gEmmrt("");
            c48007uBn2 = null;
        }
        android.view.ViewParent parent = c48007uBn2.getParent();
        if ((parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null) != null && c47988uAv.djBIcL.getWidth() > 0) {
            C48007uBn c48007uBn4 = c47988uAv.DbNXlk;
            if (c48007uBn4 == null) {
                Intrinsics.gEmmrt("");
                c48007uBn4 = null;
            }
            java.lang.String string3 = c48007uBn4.gEmmrt().getText().toString();
            C48007uBn c48007uBn5 = c47988uAv.AwvSrB;
            if (c48007uBn5 == null) {
                Intrinsics.gEmmrt("");
                c48007uBn5 = null;
            }
            android.view.ViewParent parent2 = c48007uBn5.getParent();
            android.view.ViewGroup viewGroup = parent2 instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent2 : null;
            android.widget.TextView textView = (android.widget.TextView) c47988uAv.djBIcL.findViewById(C49511upt.Application.RcXXUw);
            if (textView == null || (text = textView.getText()) == null || (string = text.toString()) == null) {
                string = "";
            }
            if (viewGroup != null) {
                C48007uBn c48007uBn6 = c47988uAv.AwvSrB;
                if (c48007uBn6 == null) {
                    Intrinsics.gEmmrt("");
                    c48007uBn6 = null;
                }
                if (c48007uBn6.getVisibility() == 0) {
                    C48007uBn c48007uBn7 = c47988uAv.AwvSrB;
                    if (c48007uBn7 == null) {
                        Intrinsics.gEmmrt("");
                        c48007uBn7 = null;
                    }
                    string2 = c48007uBn7.gEmmrt().getText().toString();
                }
                if (c47988uAv.AkhnZx.length() != 0) {
                    c47988uAv.AkhnZx = string3;
                    c47988uAv.fetchVPNInfo = string2;
                    c47988uAv.isConnected = string;
                    int width = c47988uAv.djBIcL.getWidth();
                    c48007uBn = c47988uAv.DbNXlk;
                    if (c48007uBn == null) {
                    }
                    int iAEQbTJ2 = c47988uAv.AEQbTJ(c48007uBn.gEmmrt());
                    int iOLrzqt = c47988uAv.OLrzqt(textView);
                    if (viewGroup != null) {
                    }
                } else {
                    c47988uAv.AkhnZx = string3;
                    c47988uAv.fetchVPNInfo = string2;
                    c47988uAv.isConnected = string;
                    int width2 = c47988uAv.djBIcL.getWidth();
                    c48007uBn = c47988uAv.DbNXlk;
                    if (c48007uBn == null) {
                    }
                    int iAEQbTJ22 = c47988uAv.AEQbTJ(c48007uBn.gEmmrt());
                    int iOLrzqt2 = c47988uAv.OLrzqt(textView);
                    if (viewGroup != null) {
                    }
                }
            } else {
                string2 = "";
                if ((c47988uAv.AkhnZx.length() != 0 && c47988uAv.fetchVPNInfo.length() == 0 && c47988uAv.isConnected.length() == 0) || !Intrinsics.EZpvd((java.lang.Object) string3, (java.lang.Object) c47988uAv.AkhnZx) || !Intrinsics.EZpvd((java.lang.Object) string2, (java.lang.Object) c47988uAv.fetchVPNInfo) || !Intrinsics.EZpvd((java.lang.Object) string, (java.lang.Object) c47988uAv.isConnected)) {
                    c47988uAv.AkhnZx = string3;
                    c47988uAv.fetchVPNInfo = string2;
                    c47988uAv.isConnected = string;
                    int width22 = c47988uAv.djBIcL.getWidth();
                    c48007uBn = c47988uAv.DbNXlk;
                    if (c48007uBn == null) {
                        Intrinsics.gEmmrt("");
                        c48007uBn = null;
                    }
                    int iAEQbTJ222 = c47988uAv.AEQbTJ(c48007uBn.gEmmrt());
                    int iOLrzqt22 = c47988uAv.OLrzqt(textView);
                    if (viewGroup != null) {
                        C48007uBn c48007uBn8 = c47988uAv.AwvSrB;
                        if (c48007uBn8 == null) {
                            Intrinsics.gEmmrt("");
                            c48007uBn8 = null;
                        }
                        if (c48007uBn8.getVisibility() == 0) {
                            C48007uBn c48007uBn9 = c47988uAv.AwvSrB;
                            if (c48007uBn9 == null) {
                                Intrinsics.gEmmrt("");
                            } else {
                                c48007uBn3 = c48007uBn9;
                            }
                            iAEQbTJ = c47988uAv.AEQbTJ(c48007uBn3.gEmmrt());
                        }
                        c47988uAv.EZpvd(iAEQbTJ222, width22, iOLrzqt22, iAEQbTJ);
                    } else {
                        iAEQbTJ = 0;
                        c47988uAv.EZpvd(iAEQbTJ222, width22, iOLrzqt22, iAEQbTJ);
                    }
                }
            }
        }
        return Unit.INSTANCE;
    }

    public static final void KWHzl(Function0 function0, android.view.View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        function0.invoke();
    }

    public final void zuBGHE() {
        C48007uBn c48007uBn = this.DbNXlk;
        if (c48007uBn == null) {
            Intrinsics.gEmmrt("");
            c48007uBn = null;
        }
        c48007uBn.post(new java.lang.Runnable() { // from class: o.uAz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C47988uAv.iwGUEr(this.OLrzqt);
            }
        });
    }

    public static final void iwGUEr(final C47988uAv c47988uAv) {
        C48007uBn c48007uBn = c47988uAv.AwvSrB;
        if (c48007uBn == null) {
            Intrinsics.gEmmrt("");
            c48007uBn = null;
        }
        c48007uBn.post(new java.lang.Runnable() { // from class: o.uAB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C47988uAv.hDKMBd(this.OLrzqt);
            }
        });
    }

    public static final void hDKMBd(final C47988uAv c47988uAv) {
        final Function0 function0 = new Function0() { // from class: o.uBe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C47988uAv.getFieldNames(this.OLrzqt);
            }
        };
        View.OnLayoutChangeListener onLayoutChangeListener = c47988uAv.valueOf;
        if (onLayoutChangeListener != null) {
            c47988uAv.djBIcL.removeOnLayoutChangeListener(onLayoutChangeListener);
        }
        View.OnLayoutChangeListener onLayoutChangeListener2 = c47988uAv.values;
        C48007uBn c48007uBn = null;
        if (onLayoutChangeListener2 != null) {
            C48007uBn c48007uBn2 = c47988uAv.DbNXlk;
            if (c48007uBn2 == null) {
                Intrinsics.gEmmrt("");
                c48007uBn2 = null;
            }
            c48007uBn2.removeOnLayoutChangeListener(onLayoutChangeListener2);
        }
        c47988uAv.valueOf = new View.OnLayoutChangeListener() { // from class: o.uBh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(android.view.View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                C47988uAv.copydefault(function0, view, i, i2, i3, i4, i5, i6, i7, i8);
            }
        };
        c47988uAv.values = new View.OnLayoutChangeListener() { // from class: o.uAy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(android.view.View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                C47988uAv.valueOf(function0, view, i, i2, i3, i4, i5, i6, i7, i8);
            }
        };
        TradeInputBasicsView tradeInputBasicsView = c47988uAv.djBIcL;
        View.OnLayoutChangeListener onLayoutChangeListener3 = c47988uAv.valueOf;
        Intrinsics.copydefault(onLayoutChangeListener3);
        tradeInputBasicsView.addOnLayoutChangeListener(onLayoutChangeListener3);
        C48007uBn c48007uBn3 = c47988uAv.DbNXlk;
        if (c48007uBn3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c48007uBn = c48007uBn3;
        }
        View.OnLayoutChangeListener onLayoutChangeListener4 = c47988uAv.values;
        Intrinsics.copydefault(onLayoutChangeListener4);
        c48007uBn.addOnLayoutChangeListener(onLayoutChangeListener4);
        function0.invoke();
    }

    /* JADX WARN: Removed duplicated region for block: B:80:0x0132  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit getFieldNames(C47988uAv c47988uAv) {
        java.lang.String string;
        java.lang.String string2;
        int iAEQbTJ;
        java.lang.CharSequence text;
        C48007uBn c48007uBn = c47988uAv.DbNXlk;
        C48007uBn c48007uBn2 = null;
        if (c48007uBn == null) {
            Intrinsics.gEmmrt("");
            c48007uBn = null;
        }
        android.view.ViewParent parent = c48007uBn.getParent();
        android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
        C48007uBn c48007uBn3 = c47988uAv.AwvSrB;
        if (c48007uBn3 == null) {
            Intrinsics.gEmmrt("");
            c48007uBn3 = null;
        }
        android.view.ViewParent parent2 = c48007uBn3.getParent();
        android.view.ViewGroup viewGroup2 = parent2 instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent2 : null;
        if (viewGroup != null && viewGroup2 != null && c47988uAv.djBIcL.getWidth() > 0) {
            C48007uBn c48007uBn4 = c47988uAv.DbNXlk;
            if (c48007uBn4 == null) {
                Intrinsics.gEmmrt("");
                c48007uBn4 = null;
            }
            java.lang.String string3 = c48007uBn4.gEmmrt().getText().toString();
            android.widget.TextView textView = (android.widget.TextView) c47988uAv.djBIcL.findViewById(C49511upt.Application.RcXXUw);
            if (textView == null || (text = textView.getText()) == null || (string = text.toString()) == null) {
                string = "";
            }
            C48007uBn c48007uBn5 = c47988uAv.AwvSrB;
            if (c48007uBn5 == null) {
                Intrinsics.gEmmrt("");
                c48007uBn5 = null;
            }
            if (c48007uBn5.getVisibility() == 0) {
                C48007uBn c48007uBn6 = c47988uAv.AwvSrB;
                if (c48007uBn6 == null) {
                    Intrinsics.gEmmrt("");
                    c48007uBn6 = null;
                }
                string2 = c48007uBn6.gEmmrt().getText().toString();
            } else {
                string2 = "";
            }
            if ((c47988uAv.AkhnZx.length() == 0 && c47988uAv.fetchVPNInfo.length() == 0 && c47988uAv.isConnected.length() == 0) || !Intrinsics.EZpvd((java.lang.Object) string3, (java.lang.Object) c47988uAv.AkhnZx) || !Intrinsics.EZpvd((java.lang.Object) string2, (java.lang.Object) c47988uAv.fetchVPNInfo) || !Intrinsics.EZpvd((java.lang.Object) string, (java.lang.Object) c47988uAv.isConnected)) {
                c47988uAv.AkhnZx = string3;
                c47988uAv.fetchVPNInfo = string2;
                c47988uAv.isConnected = string;
                int width = c47988uAv.djBIcL.getWidth();
                int width2 = viewGroup.getWidth();
                C48007uBn c48007uBn7 = c47988uAv.DbNXlk;
                if (c48007uBn7 == null) {
                    Intrinsics.gEmmrt("");
                    c48007uBn7 = null;
                }
                int iAEQbTJ2 = c47988uAv.AEQbTJ(c48007uBn7.gEmmrt());
                c47988uAv.EZpvd(textView);
                int iOLrzqt = c47988uAv.OLrzqt(textView);
                C48007uBn c48007uBn8 = c47988uAv.AwvSrB;
                if (c48007uBn8 == null) {
                    Intrinsics.gEmmrt("");
                    c48007uBn8 = null;
                }
                if (c48007uBn8.getVisibility() == 0) {
                    C48007uBn c48007uBn9 = c47988uAv.AwvSrB;
                    if (c48007uBn9 == null) {
                        Intrinsics.gEmmrt("");
                        c48007uBn9 = null;
                    }
                    iAEQbTJ = c47988uAv.AEQbTJ(c48007uBn9.gEmmrt());
                } else {
                    iAEQbTJ = 0;
                }
                int i = (int) (width * 0.8f);
                boolean z = iAEQbTJ2 > (width - iOLrzqt) - iAEQbTJ || iAEQbTJ2 > i;
                C48007uBn c48007uBn10 = c47988uAv.AwvSrB;
                if (c48007uBn10 == null) {
                    Intrinsics.gEmmrt("");
                    c48007uBn10 = null;
                }
                if (c48007uBn10.getVisibility() == 0) {
                    boolean z2 = iAEQbTJ > C56548yJl.copydefault(((width - i) - iOLrzqt) - C55298xhM.dp2px$default(34.0f, null, 1, null), 0);
                    if (z && z2) {
                        C48007uBn c48007uBn11 = c47988uAv.DbNXlk;
                        if (c48007uBn11 == null) {
                            Intrinsics.gEmmrt("");
                            c48007uBn11 = null;
                        }
                        c48007uBn11.gEmmrt().setMaxWidth(i);
                        int iCopydefault = C56548yJl.copydefault((width - i) - iOLrzqt, 0);
                        C48007uBn c48007uBn12 = c47988uAv.AwvSrB;
                        if (c48007uBn12 == null) {
                            Intrinsics.gEmmrt("");
                            c48007uBn12 = null;
                        }
                        if (c48007uBn12.gEmmrt().getMaxWidth() != iCopydefault) {
                            C48007uBn c48007uBn13 = c47988uAv.AwvSrB;
                            if (c48007uBn13 == null) {
                                Intrinsics.gEmmrt("");
                            } else {
                                c48007uBn2 = c48007uBn13;
                            }
                            c48007uBn2.gEmmrt().setMaxWidth(iCopydefault);
                        }
                    } else {
                        c47988uAv.EZpvd(iAEQbTJ2, width, iOLrzqt, iAEQbTJ);
                        if (width2 <= 0) {
                            C48007uBn c48007uBn14 = c47988uAv.DbNXlk;
                            if (c48007uBn14 == null) {
                                Intrinsics.gEmmrt("");
                            } else {
                                c48007uBn2 = c48007uBn14;
                            }
                            width2 = (c48007uBn2.getVisibility() != 0 || iAEQbTJ2 <= 0) ? 0 : iAEQbTJ2;
                        }
                        c47988uAv.OLrzqt(width, width2, iOLrzqt);
                    }
                }
            }
        }
        return Unit.INSTANCE;
    }

    public static final void copydefault(Function0 function0, android.view.View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        function0.invoke();
    }

    public static final void valueOf(Function0 function0, android.view.View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        function0.invoke();
    }

    public final boolean iwGUEr() {
        C48012uBs c48012uBs = this.ORxRYg;
        return c48012uBs != null && c48012uBs.getVisibility() == 0;
    }

    public final int OLrzqt(android.widget.TextView textView) {
        if (textView != null && textView.getVisibility() == 0) {
            java.lang.CharSequence text = textView.getText();
            Intrinsics.checkNotNullExpressionValue(text, "");
            if (text.length() > 0) {
                if (textView.getWidth() > 0) {
                    return textView.getWidth();
                }
                return (int) textView.getPaint().measureText(textView.getText().toString());
            }
        }
        return 0;
    }
}
