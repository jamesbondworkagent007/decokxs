package o;

import androidx.viewpager.widget.PagerAdapter;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yjM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C57485yjM extends C33542myS {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C57485yjM(@NotNull android.content.Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
 A[MD:(android.content.Context, android.util.AttributeSet):void (m)] (LINE:7) call: o.yjM.<init>(android.content.Context, android.util.AttributeSet):void type: THIS */
    public /* synthetic */ C57485yjM(android.content.Context context, android.util.AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57485yjM(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public void onMeasure(int i, int i2) {
        int count;
        super.onMeasure(i, i2);
        int currentItem = getCurrentItem();
        if (currentItem < 0 || getAdapter() == null) {
            count = 0;
        } else {
            PagerAdapter adapter = getAdapter();
            Intrinsics.copydefault(adapter);
            count = currentItem % adapter.getCount();
        }
        android.view.View childAt = getChildAt(count);
        if (childAt != null) {
            childAt.measure(i, i2);
            setMeasuredDimension(getMeasuredWidth(), childAt.getMeasuredHeight());
        }
    }
}
