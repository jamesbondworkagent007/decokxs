package o;

import android.widget.FrameLayout;
import com.okinc.business.trade.widget.PercentSeekbarLayout$1;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.C23274hvD;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lpx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C31225lpx extends android.widget.FrameLayout {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int EZpvd = 8;
    public final long AEQbTJ;
    public int AYXKKw;
    public final MutableStateFlow<java.lang.Float> AhwBna;
    public float KWHzl;
    public Function1<? super java.lang.Float, Unit> OLrzqt;
    public int copydefault;
    public final C31218lpq djBIcL;
    public Function1<? super java.lang.Integer, Unit> gEmmrt;
    public boolean isConnected;
    public Function1<? super java.lang.Float, Unit> valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C31225lpx(@NotNull android.content.Context context) {
        this(context, null, false, null, 14, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C31225lpx(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, false, null, 12, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOnPercentChange(Function1<? super java.lang.Float, Unit> function1) {
        this.valueOf = function1;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (r2v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r3v0 android.util.AttributeSet))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? false : (r4v0 boolean))
  (wrap:kotlin.jvm.functions.Function1:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function1) : (r5v0 kotlin.jvm.functions.Function1))
 A[MD:(android.content.Context, android.util.AttributeSet, boolean, kotlin.jvm.functions.Function1<? super java.lang.Float, kotlin.Unit>):void (m)] (LINE:33) call: o.lpx.<init>(android.content.Context, android.util.AttributeSet, boolean, kotlin.jvm.functions.Function1):void type: THIS */
    public /* synthetic */ C31225lpx(android.content.Context context, android.util.AttributeSet attributeSet, boolean z, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet, (i & 4) != 0 ? false : z, (i & 8) != 0 ? null : function1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31225lpx(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, boolean z, Function1<? super java.lang.Float, Unit> function1) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        this.isConnected = z;
        this.OLrzqt = function1;
        this.AYXKKw = 5;
        this.copydefault = 100;
        this.AhwBna = StateFlowKt.MutableStateFlow(java.lang.Float.valueOf(0.0f));
        this.AEQbTJ = 10L;
        OLrzqt(attributeSet);
        C31218lpq c31218lpq = new C31218lpq(context, attributeSet, this.AYXKKw, this.isConnected);
        this.djBIcL = c31218lpq;
        addView(c31218lpq, new FrameLayout.LayoutParams(-1, C55298xhM.dp2px$default(this.isConnected ? 36.0f : 24.0f, null, 1, null)));
        AEQbTJ();
        C25389ivm.safeLaunch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getMain()), null, null, new PercentSeekbarLayout$1(this, null), 3, null);
    }

    /* JADX INFO: renamed from: o.lpx$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.lpx.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    public final void OLrzqt(android.util.AttributeSet attributeSet) {
        if (attributeSet == null) {
            return;
        }
        android.content.res.TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C23274hvD.LoaderManager.AxsJAY, 0, 0);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
        try {
            this.AYXKKw = typedArrayObtainStyledAttributes.getInteger(C23274hvD.LoaderManager.AwvSrB, 5);
            this.isConnected = this.isConnected || typedArrayObtainStyledAttributes.getBoolean(C23274hvD.LoaderManager.zuBGHE, false);
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public final void AEQbTJ() {
        final android.view.View viewInflate = android.view.LayoutInflater.from(getContext()).inflate(C23274hvD.Activity.QYNZmZ, (android.view.ViewGroup) null);
        this.djBIcL.setOnPercentCallback(new Function2() { // from class: o.lpy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C31225lpx.KWHzl(this.AEQbTJ, viewInflate, ((java.lang.Float) obj).floatValue(), ((java.lang.Float) obj2).floatValue());
            }
        });
        this.djBIcL.setOnClickCallback(new Function1() { // from class: o.lpz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C31225lpx.copydefault(this.copydefault, ((java.lang.Float) obj).floatValue());
            }
        });
        this.djBIcL.setOnCancelCallBack(new Function0() { // from class: o.lpw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C31225lpx.OLrzqt(this.OLrzqt, viewInflate);
            }
        });
        this.djBIcL.setSeekbarStateCallback(new Function1() { // from class: o.lpB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C31225lpx.OLrzqt(this.EZpvd, ((java.lang.Integer) obj).intValue());
            }
        });
    }

    public static final Unit KWHzl(C31225lpx c31225lpx, android.view.View view, float f, float f2) {
        Intrinsics.copydefault(view);
        c31225lpx.copydefault(f, f2, view);
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(C31225lpx c31225lpx, float f) {
        c31225lpx.AhwBna.setValue(java.lang.Float.valueOf(f));
        Function1<? super java.lang.Float, Unit> function1 = c31225lpx.OLrzqt;
        if (function1 != null) {
            function1.invoke(java.lang.Float.valueOf(f));
        }
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(C31225lpx c31225lpx, android.view.View view) {
        Intrinsics.copydefault(view);
        c31225lpx.EZpvd(view);
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(C31225lpx c31225lpx, int i) {
        Function1<? super java.lang.Integer, Unit> function1 = c31225lpx.gEmmrt;
        if (function1 != null) {
            function1.invoke(java.lang.Integer.valueOf(i));
        }
        return Unit.INSTANCE;
    }

    public final void EZpvd(android.view.View view) {
        android.view.ViewParent parent = view.getParent();
        android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
    }

    public final void EZpvd(android.view.ViewGroup viewGroup, android.view.View view, java.lang.String str, int i, int i2) {
        if (viewGroup == null) {
            return;
        }
        if (!android.text.TextUtils.isEmpty(str)) {
            view.setTranslationX(i);
            view.setTranslationY(i2);
        }
        if (view.getParent() == null) {
            viewGroup.addView(view, -2, -2);
        }
    }

    public final void copydefault(final float f, float f2, android.view.View view) {
        float fDjBIcL;
        if (this.KWHzl != f) {
            C25352ivB.startVibrator$default(0L, 1, null);
        }
        this.KWHzl = f;
        post(new java.lang.Runnable() { // from class: o.lpv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C31225lpx.OLrzqt(this.OLrzqt, f);
            }
        });
        int[] iArrAEQbTJ = AEQbTJ(this.djBIcL, view, f2, f);
        java.lang.String iCUPercent$default = pTB.formatICUPercent$default(pTB.OLrzqt(java.lang.Double.valueOf(C33129mqd.AEQbTJ(java.lang.Float.valueOf(f)))), null, C38307pTy.Companion.AEQbTJ(0), null, java.lang.Double.valueOf(C33129mqd.AEQbTJ(100)), null, 21, null);
        ((android.widget.TextView) view.findViewById(C23274hvD.Application.createEditText)).setText(iCUPercent$default);
        int[] iArr = new int[2];
        this.djBIcL.getLocationOnScreen(iArr);
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        if (C55296xhK.OLrzqt(context)) {
            fDjBIcL = -(((C33570myu.AEQbTJ() - iArr[0]) - (view.getWidth() * 0.5f)) + C55298xhM.dp2px$default(6.0f, null, 1, null) + (f * (100.0f / this.copydefault) * (this.djBIcL.getWidth() - C55298xhM.dp2px$default(12.0f, null, 1, null))));
        } else {
            fDjBIcL = ((C33129mqd.djBIcL(java.lang.Integer.valueOf(iArr[0])) + C55298xhM.dp2px$default(6.0f, null, 1, null)) + ((f * (100.0f / this.copydefault)) * (this.djBIcL.getWidth() - C55298xhM.dp2px$default(12.0f, null, 1, null)))) - (view.getWidth() * 0.5f);
        }
        android.view.View rootView = getRootView();
        EZpvd(rootView instanceof android.view.ViewGroup ? (android.view.ViewGroup) rootView : null, view, iCUPercent$default, C33129mqd.AhwBna(java.lang.Float.valueOf(fDjBIcL)), iArrAEQbTJ[1] - C55298xhM.dp2px$default(6.0f, null, 1, null));
    }

    public static final void OLrzqt(C31225lpx c31225lpx, float f) {
        c31225lpx.AhwBna.setValue(java.lang.Float.valueOf(f));
    }

    public final int[] AEQbTJ(android.view.View view, android.view.View view2, float f, float f2) {
        int[] iArr = new int[2];
        int[] iArr2 = new int[2];
        view.getLocationOnScreen(iArr2);
        int height = view.getHeight();
        int iEZpvd = C33570myu.EZpvd() - C55298xhM.dp2px$default(60.0f, null, 1, null);
        int iAEQbTJ = C33570myu.AEQbTJ();
        if (height > iEZpvd) {
            height = iEZpvd;
        }
        view2.measure(0, 0);
        iArr[1] = (iArr2[1] - view2.getMeasuredHeight()) + (height / 5) + C55298xhM.dp2px$default(5.0f, null, 1, null);
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        if (C55296xhK.OLrzqt(context)) {
            iArr[0] = (((int) f) - iAEQbTJ) - yII.EZpvd((1 - f2) * C55298xhM.dp2px$default(3.0f, null, 1, null));
        } else {
            iArr[0] = ((int) f) + yII.EZpvd((1 - f2) * C55298xhM.dp2px$default(3.0f, null, 1, null));
        }
        return iArr;
    }

    public final void KWHzl() {
        this.AhwBna.setValue(java.lang.Float.valueOf(0.0f));
        this.djBIcL.EZpvd();
    }

    public final void copydefault() {
        this.djBIcL.EZpvd();
    }

    public final void setEnable(boolean z) {
        this.djBIcL.setMIsEnabled(z);
        if (z) {
            return;
        }
        KWHzl();
    }
}
