package o;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.core.view.ViewGroupKt;
import androidx.core.widget.NestedScrollView;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xci, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C55055xci extends NestedScrollView implements InterfaceC55054xch {
    public int AEQbTJ;
    public final /* synthetic */ C55058xcl KWHzl;
    public final android.widget.LinearLayout OLrzqt;
    public static final ActionBar Companion = new ActionBar(null);
    public static final int copydefault = 8;
    public static int EZpvd = 24;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C55055xci(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C55055xci(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC55062xcp
    public java.util.Map<java.lang.CharSequence, java.lang.Object> AEQbTJ() {
        return this.KWHzl.AEQbTJ();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC55062xcp
    public boolean AhwBna() {
        return this.KWHzl.AhwBna();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC55062xcp
    public boolean EZpvd() {
        return this.KWHzl.EZpvd();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setFinishCallback(@NotNull InterfaceC55053xcg interfaceC55053xcg) {
        Intrinsics.checkNotNullParameter(interfaceC55053xcg, "");
        this.KWHzl.KWHzl(interfaceC55053xcg);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setItemSpace(int i) {
        this.AEQbTJ = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setSubmit(@NotNull android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        this.KWHzl.OLrzqt(view);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC55062xcp
    public boolean valueOf() {
        return this.KWHzl.valueOf();
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:24) call: o.xci.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C55055xci(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C55055xci(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.KWHzl = new C55058xcl();
        android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(context);
        this.OLrzqt = linearLayout;
        super.addView(linearLayout, -1, new FrameLayout.LayoutParams(-1, -2));
        linearLayout.setOrientation(1);
        setOverScrollMode(2);
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C52761wXj.PictureInPictureParams.DcMfJKsgNvtZ);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
        this.AEQbTJ = typedArrayObtainStyledAttributes.getDimensionPixelSize(C52761wXj.PictureInPictureParams.DlABUU, C55298xhM.OLrzqt(EZpvd, context));
        setGravity(typedArrayObtainStyledAttributes.getInteger(C52761wXj.PictureInPictureParams.DfrfUJ, 0));
        typedArrayObtainStyledAttributes.recycle();
    }

    public static /* synthetic */ void setGravity$default(C55055xci c55055xci, int i, int i2, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setGravity");
        }
        if ((i2 & 1) != 0) {
            i = 0;
        }
        c55055xci.setGravity(i);
    }

    public final void setGravity(int i) {
        this.OLrzqt.setGravity(i);
    }

    @Override // android.view.View
    public void setPadding(int i, int i2, int i3, int i4) {
        this.OLrzqt.setPaddingRelative(i, i2, i3, i4);
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.ViewGroup
    public void addView(android.view.View view, int i, ViewGroup.LayoutParams layoutParams) {
        android.view.View view2;
        if (view != null && (view2 = (android.view.View) C59467zhb.gHZMYf(ViewGroupKt.getChildren(this.OLrzqt))) != null) {
            EZpvd(view2);
        }
        this.OLrzqt.addView(view, i, layoutParams);
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.ViewGroup
    public void addView(@NotNull android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        addView(view, -1);
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.ViewGroup
    public void addView(android.view.View view, int i) {
        if (view == null) {
            throw new java.lang.IllegalArgumentException("Cannot add a null child view to a ViewGroup".toString());
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = OLrzqt();
        }
        addView(view, i, layoutParams);
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.ViewGroup, android.view.ViewManager
    public void addView(android.view.View view, ViewGroup.LayoutParams layoutParams) {
        addView(view, -1, layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(android.view.View view) {
        this.OLrzqt.removeView(view);
    }

    @Override // android.view.ViewGroup
    public void removeViewAt(int i) {
        this.OLrzqt.removeViewAt(i);
    }

    @Override // android.view.ViewGroup
    public void removeAllViewsInLayout() {
        this.OLrzqt.removeAllViewsInLayout();
    }

    @Override // android.view.ViewGroup
    public void removeViewInLayout(android.view.View view) {
        this.OLrzqt.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public void removeViews(int i, int i2) {
        this.OLrzqt.removeViews(i, i2);
    }

    @Override // android.view.ViewGroup
    public void removeViewsInLayout(int i, int i2) {
        this.OLrzqt.removeViewsInLayout(i, i2);
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        C55296xhK.AEQbTJ(this, z);
    }

    private final void EZpvd(android.view.View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            } else {
                marginLayoutParams = new ViewGroup.MarginLayoutParams(layoutParams);
            }
        } else {
            marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
        }
        marginLayoutParams.bottomMargin += this.AEQbTJ;
        view.setLayoutParams(marginLayoutParams);
    }

    public final LinearLayout.LayoutParams OLrzqt() {
        return new LinearLayout.LayoutParams(-1, -2);
    }

    /* JADX INFO: renamed from: o.xci$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.xci.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }
}
