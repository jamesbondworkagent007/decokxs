package o;

import android.view.ViewGroup;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.widget.NestedScrollView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import o.InterfaceC22285hcV;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.hcR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C22281hcR extends android.widget.FrameLayout implements InterfaceC22285hcV {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int KWHzl = 8;
    public final InterfaceC56387yDm OLrzqt;
    public int copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C22281hcR(@NotNull android.content.Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
 A[MD:(android.content.Context, android.util.AttributeSet):void (m)] (LINE:18) call: o.hcR.<init>(android.content.Context, android.util.AttributeSet):void type: THIS */
    public /* synthetic */ C22281hcR(android.content.Context context, android.util.AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    @Override // o.InterfaceC22278hcO
    public void AEQbTJ(boolean z) {
        InterfaceC22285hcV.StateListAnimator.AEQbTJ(this, z);
    }

    @Override // o.InterfaceC22278hcO
    public boolean AEQbTJ() {
        return InterfaceC22285hcV.StateListAnimator.OLrzqt(this);
    }

    @Override // o.InterfaceC22278hcO
    public void EZpvd() {
        InterfaceC22285hcV.StateListAnimator.AEQbTJ(this);
    }

    @Override // o.InterfaceC22278hcO
    public void EZpvd(Function0<Unit> function0) {
        InterfaceC22285hcV.StateListAnimator.AEQbTJ(this, function0);
    }

    @Override // o.InterfaceC22278hcO
    public void OLrzqt(boolean z) {
        InterfaceC22285hcV.StateListAnimator.copydefault(this, z);
    }

    @Override // o.InterfaceC22278hcO
    public void OLrzqt(boolean z, @NotNull Function0<Unit> function0) {
        InterfaceC22285hcV.StateListAnimator.copydefault(this, z, function0);
    }

    @Override // o.InterfaceC22278hcO
    public void copydefault() {
        InterfaceC22285hcV.StateListAnimator.KWHzl(this);
    }

    @Override // o.InterfaceC22278hcO
    public void setRefreshListener(@NotNull Function0<Unit> function0) {
        InterfaceC22285hcV.StateListAnimator.OLrzqt(this, function0);
    }

    @Override // o.InterfaceC22278hcO
    public void setStickScrollChangeListener(@NotNull InterfaceC22283hcT interfaceC22283hcT) {
        InterfaceC22285hcV.StateListAnimator.copydefault(this, interfaceC22283hcT);
    }

    /* JADX INFO: renamed from: o.hcR$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.hcR.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22281hcR(@NotNull final android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        this.OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.hcS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C22281hcR.AEQbTJ(context, this);
            }
        });
        if (isInEditMode()) {
            return;
        }
        int[] iArr = C23274hvD.LoaderManager.RJOkX;
        Intrinsics.checkNotNullExpressionValue(iArr, "");
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
        setEnableLoadMore(typedArrayObtainStyledAttributes.getBoolean(C23274hvD.LoaderManager.QVAiDq, false));
        setEnableRefresh(typedArrayObtainStyledAttributes.getBoolean(C23274hvD.LoaderManager.QUSxYX, false));
        typedArrayObtainStyledAttributes.recycle();
    }

    private final C21560hDx valueOf() {
        return (C21560hDx) this.OLrzqt.getValue();
    }

    public static final C21560hDx AEQbTJ(android.content.Context context, C22281hcR c22281hcR) {
        return C21560hDx.AEQbTJ(android.view.LayoutInflater.from(context), c22281hcR);
    }

    @Override // o.InterfaceC22285hcV
    public InterfaceC22278hcO OLrzqt() {
        C22288hcY c22288hcY = valueOf().valueOf;
        Intrinsics.checkNotNullExpressionValue(c22288hcY, "");
        return c22288hcY;
    }

    @Override // android.view.ViewGroup
    public void addView(android.view.View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (isInEditMode()) {
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) findViewWithTag("EDIT_MODE_LAYOUT_TAG");
            if (viewGroup == null) {
                LinearLayoutCompat linearLayoutCompat = new LinearLayoutCompat(getContext());
                linearLayoutCompat.setOrientation(1);
                linearLayoutCompat.setTag("EDIT_MODE_LAYOUT_TAG");
                linearLayoutCompat.addView(view, new ViewGroup.MarginLayoutParams(layoutParams));
                super.addView(linearLayoutCompat, i, new ViewGroup.MarginLayoutParams(-1, -1));
                return;
            }
            viewGroup.addView(view, new ViewGroup.MarginLayoutParams(layoutParams));
            return;
        }
        if (view != null && view.getId() == C23274hvD.Application.LocalActivityResultRegistryOwner) {
            super.addView(view, i, layoutParams);
            return;
        }
        int i2 = this.copydefault;
        if (i2 == 0) {
            valueOf().OLrzqt.addView(view, new ViewGroup.MarginLayoutParams(layoutParams));
            this.copydefault++;
        } else if (i2 == 1) {
            valueOf().AEQbTJ.addView(view, new ViewGroup.MarginLayoutParams(layoutParams));
            this.copydefault++;
        } else {
            if (i2 != 2) {
                return;
            }
            valueOf().KWHzl.addView(view, new ViewGroup.MarginLayoutParams(layoutParams));
            this.copydefault++;
        }
    }

    public final NestedScrollView AYXKKw() {
        C22288hcY c22288hcY = valueOf().valueOf;
        Intrinsics.checkNotNullExpressionValue(c22288hcY, "");
        return c22288hcY;
    }

    public final C33603mza djBIcL() {
        C33603mza c33603mza = valueOf().EZpvd;
        Intrinsics.checkNotNullExpressionValue(c33603mza, "");
        return c33603mza;
    }

    public final C33546myW AhwBna() {
        C33546myW c33546myW = valueOf().AYXKKw;
        Intrinsics.checkNotNullExpressionValue(c33546myW, "");
        return c33546myW;
    }

    public final void setStickyVisible(boolean z) {
        android.widget.FrameLayout frameLayout = valueOf().KWHzl;
        Intrinsics.checkNotNullExpressionValue(frameLayout, "");
        frameLayout.setVisibility(z ? 0 : 8);
        android.widget.FrameLayout frameLayout2 = valueOf().AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(frameLayout2, "");
        frameLayout2.setVisibility(z ? 0 : 8);
    }

    public final void setEnableRefresh(boolean z) {
        valueOf().AYXKKw.djBIcL(z);
    }

    public final void setEnableLoadMore(boolean z) {
        valueOf().AYXKKw.AhwBna(z);
    }

    public final void KWHzl() {
        valueOf().AYXKKw.AEQbTJ();
    }

    public final void setOnRefreshListener(@NotNull final Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        valueOf().AYXKKw.OLrzqt(new InterfaceC57903yrG() { // from class: o.hcU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC57903yrG
            public final void copydefault(InterfaceC57934yrl interfaceC57934yrl) {
                C22281hcR.setOnRefreshListener$lambda$3(function0, interfaceC57934yrl);
            }
        });
    }

    public static final void setOnRefreshListener$lambda$3(Function0 function0, InterfaceC57934yrl interfaceC57934yrl) {
        Intrinsics.checkNotNullParameter(interfaceC57934yrl, "");
        function0.invoke();
    }
}
