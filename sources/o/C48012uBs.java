package o;

import android.os.Build;
import android.widget.FrameLayout;
import com.okinc.tradeuilib.widget.TradeSeekBar;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C49511upt;
import o.C57406yhn;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.uBs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C48012uBs extends android.widget.FrameLayout {
    public Function1<? super java.lang.Float, Unit> AEQbTJ;
    public Function1<? super java.lang.Integer, Unit> AYXKKw;
    public Function1<? super java.lang.Float, Unit> EZpvd;
    public int KWHzl;
    public int OLrzqt;
    public float copydefault;
    public final TradeSeekBar djBIcL;
    public boolean valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C48012uBs(@NotNull android.content.Context context) {
        this(context, null, false, null, 14, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C48012uBs(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, false, null, 12, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOnClickCallback(Function1<? super java.lang.Float, Unit> function1) {
        this.EZpvd = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOnPercentChange(Function1<? super java.lang.Float, Unit> function1) {
        this.AEQbTJ = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSeekbarStateCallback(Function1<? super java.lang.Integer, Unit> function1) {
        this.AYXKKw = function1;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (r2v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r3v0 android.util.AttributeSet))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? false : (r4v0 boolean))
  (wrap:kotlin.jvm.functions.Function1:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function1) : (r5v0 kotlin.jvm.functions.Function1))
 A[MD:(android.content.Context, android.util.AttributeSet, boolean, kotlin.jvm.functions.Function1<? super java.lang.Float, kotlin.Unit>):void (m)] (LINE:37) call: o.uBs.<init>(android.content.Context, android.util.AttributeSet, boolean, kotlin.jvm.functions.Function1):void type: THIS */
    public /* synthetic */ C48012uBs(android.content.Context context, android.util.AttributeSet attributeSet, boolean z, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet, (i & 4) != 0 ? false : z, (i & 8) != 0 ? null : function1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C48012uBs(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, boolean z, Function1<? super java.lang.Float, Unit> function1) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        this.valueOf = z;
        this.EZpvd = function1;
        this.OLrzqt = 5;
        this.KWHzl = 100;
        OLrzqt(attributeSet);
        TradeSeekBar tradeSeekBar = new TradeSeekBar(context, attributeSet, this.OLrzqt, this.valueOf);
        this.djBIcL = tradeSeekBar;
        addView(tradeSeekBar, new FrameLayout.LayoutParams(-1, C33052mpF.EZpvd(this.valueOf ? 36.0f : 24.0f, context)));
        KWHzl();
    }

    public final void OLrzqt(android.util.AttributeSet attributeSet) {
        if (attributeSet == null) {
            return;
        }
        android.content.res.TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C49511upt.Fragment.fARcdN, 0, 0);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
        try {
            this.OLrzqt = typedArrayObtainStyledAttributes.getInteger(C49511upt.Fragment.fIwbmz, 5);
            this.valueOf = this.valueOf || typedArrayObtainStyledAttributes.getBoolean(C49511upt.Fragment.ejfBZ, false);
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public final void KWHzl() {
        final android.view.View viewInflate = android.view.LayoutInflater.from(getContext()).inflate(C49511upt.StateListAnimator.ejfBZ, (android.view.ViewGroup) null);
        android.view.View viewFindViewById = viewInflate.findViewById(C49511upt.Application.DSiOMJ);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
        final android.widget.TextView textView = (android.widget.TextView) viewFindViewById;
        final uBB ubb = new uBB(getContext());
        textView.setBackground(C33070mpX.KWHzl(C57406yhn.Activity.KWHzl));
        this.djBIcL.setOnPercentCallback(new Function2() { // from class: o.uBt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C48012uBs.OLrzqt(this.copydefault, viewInflate, ubb, textView, ((java.lang.Float) obj).floatValue(), ((java.lang.Float) obj2).floatValue());
            }
        });
        this.djBIcL.setOnClickCallback(new Function1() { // from class: o.uBu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C48012uBs.KWHzl(this.EZpvd, ((java.lang.Float) obj).floatValue());
            }
        });
        this.djBIcL.setOnCancelCallBack(new Function0() { // from class: o.uBx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C48012uBs.AEQbTJ(this.OLrzqt, viewInflate);
            }
        });
        this.djBIcL.setSeekbarStateCallback(new Function1() { // from class: o.uBw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C48012uBs.OLrzqt(this.EZpvd, ((java.lang.Integer) obj).intValue());
            }
        });
    }

    public static final Unit OLrzqt(final C48012uBs c48012uBs, android.view.View view, uBB ubb, android.widget.TextView textView, final float f, float f2) {
        float fDjBIcL;
        if (c48012uBs.copydefault != f) {
            c48012uBs.EZpvd(30L);
        }
        c48012uBs.copydefault = f;
        c48012uBs.post(new java.lang.Runnable() { // from class: o.uBv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C48012uBs.AEQbTJ(this.copydefault, f);
            }
        });
        TradeSeekBar tradeSeekBar = c48012uBs.djBIcL;
        Intrinsics.copydefault(view);
        int[] iArrAEQbTJ = c48012uBs.AEQbTJ(tradeSeekBar, view, ubb, f2, f);
        textView.setText(pTB.formatPercent$default(pTB.OLrzqt(java.lang.Double.valueOf(C33129mqd.AEQbTJ(java.lang.Float.valueOf(f)))), 0, null, 2, null));
        int[] iArr = new int[2];
        c48012uBs.djBIcL.getLocationOnScreen(iArr);
        android.content.Context context = c48012uBs.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        if (C55296xhK.OLrzqt(context)) {
            fDjBIcL = -(((C33570myu.AEQbTJ() - iArr[0]) - (view.getWidth() * 0.5f)) + C57681ymx.OLrzqt(c48012uBs, 6.0f) + (f * (100.0f / c48012uBs.KWHzl) * (c48012uBs.djBIcL.getWidth() - C57681ymx.OLrzqt(c48012uBs, 12.0f))));
        } else {
            fDjBIcL = ((C33129mqd.djBIcL(java.lang.Integer.valueOf(iArr[0])) + C57681ymx.OLrzqt(c48012uBs, 6.0f)) + ((f * (100.0f / c48012uBs.KWHzl)) * (c48012uBs.djBIcL.getWidth() - C57681ymx.OLrzqt(c48012uBs, 12.0f)))) - (view.getWidth() * 0.5f);
        }
        android.view.View rootView = c48012uBs.getRootView();
        c48012uBs.copydefault(rootView instanceof android.view.ViewGroup ? (android.view.ViewGroup) rootView : null, view, pTB.formatPercent$default(pTB.OLrzqt(java.lang.Double.valueOf(C33129mqd.AEQbTJ(java.lang.Float.valueOf(f)))), 0, null, 2, null), C33129mqd.AhwBna(java.lang.Float.valueOf(fDjBIcL)), iArrAEQbTJ[1] - C57681ymx.OLrzqt(c48012uBs, 6.0f));
        return Unit.INSTANCE;
    }

    public static final void AEQbTJ(C48012uBs c48012uBs, float f) {
        Function1<? super java.lang.Float, Unit> function1 = c48012uBs.AEQbTJ;
        if (function1 != null) {
            function1.invoke(java.lang.Float.valueOf(f));
        }
    }

    public static final Unit KWHzl(C48012uBs c48012uBs, float f) {
        Function1<? super java.lang.Float, Unit> function1 = c48012uBs.AEQbTJ;
        if (function1 != null) {
            function1.invoke(java.lang.Float.valueOf(f));
        }
        Function1<? super java.lang.Float, Unit> function12 = c48012uBs.EZpvd;
        if (function12 != null) {
            function12.invoke(java.lang.Float.valueOf(f));
        }
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(C48012uBs c48012uBs, android.view.View view) {
        Intrinsics.copydefault(view);
        c48012uBs.copydefault(view);
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(C48012uBs c48012uBs, int i) {
        Function1<? super java.lang.Integer, Unit> function1 = c48012uBs.AYXKKw;
        if (function1 != null) {
            function1.invoke(java.lang.Integer.valueOf(i));
        }
        return Unit.INSTANCE;
    }

    public final void EZpvd(long j) {
        InterfaceC46554tYq interfaceC46554tYq = (InterfaceC46554tYq) C43251rlk.OLrzqt(InterfaceC46554tYq.class);
        if (interfaceC46554tYq == null || !interfaceC46554tYq.copydefault()) {
            return;
        }
        try {
            java.lang.Object systemService = getContext().getSystemService("vibrator");
            android.os.Vibrator vibrator = systemService instanceof android.os.Vibrator ? (android.os.Vibrator) systemService : null;
            if (vibrator != null) {
                if (Build.VERSION.SDK_INT >= 26) {
                    vibrator.vibrate(android.os.VibrationEffect.createOneShot(j, -1));
                } else {
                    vibrator.vibrate(j);
                }
            }
        } catch (java.lang.Exception e) {
            e.printStackTrace();
            pUU.AEQbTJ("InputLayoutSeekbarView", Unit.INSTANCE);
        }
    }

    public final void copydefault(android.view.View view) {
        android.view.ViewParent parent = view.getParent();
        android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
    }

    public final void copydefault(android.view.ViewGroup viewGroup, android.view.View view, java.lang.String str, int i, int i2) {
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

    public final int[] AEQbTJ(android.view.View view, android.view.View view2, android.view.View view3, float f, float f2) {
        int[] iArr = new int[2];
        int[] iArr2 = new int[2];
        view.getLocationOnScreen(iArr2);
        int height = view.getHeight();
        int iEZpvd = C33570myu.EZpvd() - C57681ymx.OLrzqt(this, 60.0f);
        int iAEQbTJ = C33570myu.AEQbTJ();
        if (height > iEZpvd) {
            height = iEZpvd;
        }
        view2.measure(0, 0);
        view2.getMeasuredWidth();
        iArr[1] = (iArr2[1] - view2.getMeasuredHeight()) + (height / 5) + C33052mpF.dp2px$default(5.0f, null, 1, null);
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        if (C55296xhK.OLrzqt(context)) {
            iArr[0] = ((((int) f) - iAEQbTJ) + (view3.getWidth() / 2)) - yII.EZpvd((1 - f2) * C57681ymx.OLrzqt(this, 3.0f));
        } else {
            iArr[0] = (((int) f) - (view3.getWidth() / 2)) + yII.EZpvd((1 - f2) * C57681ymx.OLrzqt(this, 3.0f));
        }
        int i = iArr[0];
        int i2 = iArr[1];
        return iArr;
    }

    public final float EZpvd() {
        float fOLrzqt = this.djBIcL.OLrzqt();
        pUU.valueOf("OKTInputLayout", "InputLayoutSeekbarView#getPercent, percent--" + fOLrzqt);
        return fOLrzqt;
    }

    public final void setDefaultPercentNum(int i) {
        this.KWHzl = i;
        this.djBIcL.setDefaultPercentNum(i);
    }

    public final void setMaxPercent(boolean z) {
        this.djBIcL.setMaxPercent(z);
    }

    public final void setPercent(float f) {
        this.djBIcL.setPercent(f);
    }

    public final void OLrzqt() {
        this.djBIcL.AEQbTJ();
    }

    public final void setEnable(boolean z) {
        this.djBIcL.setMIsEnabled(z);
    }
}
