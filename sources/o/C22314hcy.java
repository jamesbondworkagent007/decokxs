package o;

import android.view.ViewGroup;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.hcy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C22314hcy extends AbstractC31189lpN<C22264hcA, hCI> {
    public final int EZpvd;
    public final int KWHzl;
    public final Function0<Unit> OLrzqt;
    public final int copydefault;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (-1 int) : (r2v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (-1 int) : (r3v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (-1 int) : (r4v0 int))
  (r5v0 kotlin.jvm.functions.Function0)
 A[MD:(int, int, int, kotlin.jvm.functions.Function0<kotlin.Unit>):void (m)] (LINE:10) call: o.hcy.<init>(int, int, int, kotlin.jvm.functions.Function0):void type: THIS */
    public /* synthetic */ C22314hcy(int i, int i2, int i3, Function0 function0, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? -1 : i, (i4 & 2) != 0 ? -1 : i2, (i4 & 4) != 0 ? -1 : i3, function0);
    }

    public C22314hcy(int i, int i2, int i3, @NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        this.KWHzl = i;
        this.copydefault = i2;
        this.EZpvd = i3;
        this.OLrzqt = function0;
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/viewbinding/ViewBinding; */
    @Override // o.AbstractC31189lpN
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public hCI KWHzl(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        hCI hciEZpvd = hCI.EZpvd(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(hciEZpvd, "");
        return hciEZpvd;
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Landroidx/viewbinding/ViewBinding;Ljava/lang/Object;)V */
    @Override // o.AbstractC31189lpN
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public void KWHzl(@NotNull hCI hci, @NotNull C22264hcA c22264hcA) {
        Intrinsics.checkNotNullParameter(hci, "");
        Intrinsics.checkNotNullParameter(c22264hcA, "");
        java.lang.String strKWHzl = c22264hcA.KWHzl();
        if (strKWHzl != null) {
            hci.KWHzl.setTitle(strKWHzl);
        }
        C22313hcx root = hci.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        ViewGroup.LayoutParams layoutParams = root.getLayoutParams();
        if (layoutParams == null) {
            throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        int i = this.KWHzl;
        if (i != -1) {
            marginLayoutParams.topMargin = i;
        }
        int i2 = this.copydefault;
        if (i2 != -1) {
            marginLayoutParams.setMarginStart(i2);
        }
        int i3 = this.EZpvd;
        if (i3 != -1) {
            marginLayoutParams.setMarginEnd(i3);
        }
        root.setLayoutParams(marginLayoutParams);
        hci.KWHzl.setSubTitle(c22264hcA.AEQbTJ());
        hci.KWHzl.setOnSuccessListener(this.OLrzqt);
    }
}
