package o;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kBh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C27732kBh<T, VB extends ViewBinding> extends android.view.ViewGroup {
    public boolean EZpvd;
    public java.util.List<C27726kBb<T>> KWHzl;
    public InterfaceC27734kBj<T, VB> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C27732kBh(@NotNull android.content.Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
 A[MD:(android.content.Context, android.util.AttributeSet):void (m)] (LINE:13) call: o.kBh.<init>(android.content.Context, android.util.AttributeSet):void type: THIS */
    public /* synthetic */ C27732kBh(android.content.Context context, android.util.AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27732kBh(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        this.KWHzl = yDY.AhwBna();
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            measureChild(getChildAt(i3), 0, 0);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if ((!z && !this.EZpvd) || this.KWHzl.isEmpty() || this.copydefault == null) {
            return;
        }
        KWHzl();
    }

    public final void setItems(@NotNull java.util.List<C27726kBb<T>> list, @NotNull InterfaceC27734kBj<T, VB> interfaceC27734kBj) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(interfaceC27734kBj, "");
        this.KWHzl = list;
        this.copydefault = interfaceC27734kBj;
        this.EZpvd = true;
        requestLayout();
    }

    public final void KWHzl() {
        this.EZpvd = false;
        java.util.List listEZpvd = C27735kBk.EZpvd(getWidth(), getHeight(), 0, 0, this.KWHzl);
        removeAllViews();
        int size = this.KWHzl.size();
        for (int i = 0; i < size; i++) {
            C27730kBf c27730kBf = (C27730kBf) listEZpvd.get(i);
            InterfaceC27734kBj<T, VB> interfaceC27734kBj = this.copydefault;
            Intrinsics.copydefault(interfaceC27734kBj);
            android.content.Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            ViewBinding viewBindingAEQbTJ = interfaceC27734kBj.AEQbTJ(context, this);
            InterfaceC27734kBj<T, VB> interfaceC27734kBj2 = this.copydefault;
            Intrinsics.copydefault(interfaceC27734kBj2);
            interfaceC27734kBj2.EZpvd(viewBindingAEQbTJ, (T) c27730kBf.KWHzl());
            viewBindingAEQbTJ.getRoot().measure(View.MeasureSpec.makeMeasureSpec((int) c27730kBf.AEQbTJ(), 1073741824), View.MeasureSpec.makeMeasureSpec((int) c27730kBf.EZpvd(), 1073741824));
            viewBindingAEQbTJ.getRoot().layout(c27730kBf.copydefault(), c27730kBf.OLrzqt(), (int) (c27730kBf.copydefault() + c27730kBf.AEQbTJ()), (int) (c27730kBf.OLrzqt() + c27730kBf.EZpvd()));
        }
    }
}
