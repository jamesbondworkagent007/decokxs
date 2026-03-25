package o;

import androidx.viewpager.widget.ViewPager;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yiM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C57432yiM extends android.widget.LinearLayout implements ViewPager.OnPageChangeListener {
    public final C55254xgV KWHzl;
    public final C57379yhM copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C57432yiM(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C57432yiM(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrollStateChanged(int i) {
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrolled(int i, float f, int i2) {
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:15) call: o.yiM.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C57432yiM(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57432yiM(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        C57379yhM c57379yhMCopydefault = C57379yhM.copydefault(android.view.LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(c57379yhMCopydefault, "");
        this.copydefault = c57379yhMCopydefault;
        C55254xgV c55254xgV = c57379yhMCopydefault.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(c55254xgV, "");
        this.KWHzl = c55254xgV;
        setOrientation(1);
        c55254xgV.copydefault().setTabTextColors(C33070mpX.copydefault(C52761wXj.Activity.QwvEab), C33070mpX.copydefault(C52761wXj.Activity.fdOvFl));
        c55254xgV.KWHzl(false);
        c55254xgV.setupWithViewPager(c57379yhMCopydefault.KWHzl);
        c57379yhMCopydefault.KWHzl.addOnPageChangeListener(this);
        setPadding(0, C55298xhM.dpInt$default(16, (android.content.Context) null, 1, (java.lang.Object) null), 0, C55298xhM.dpInt$default(16, (android.content.Context) null, 1, (java.lang.Object) null));
    }

    public final void setViewDataBean(@NotNull C57411yhs c57411yhs) {
        Intrinsics.checkNotNullParameter(c57411yhs, "");
        this.copydefault.KWHzl.setAdapter(c57411yhs.AEQbTJ());
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageSelected(int i) {
        this.copydefault.KWHzl.requestLayout();
    }
}
