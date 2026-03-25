package o;

import androidx.lifecycle.LifecycleOwner;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.oKA;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public class pGV extends android.widget.FrameLayout {
    public InterfaceC35977oKs copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public pGV(@NotNull android.content.Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setIView(InterfaceC35977oKs interfaceC35977oKs) {
        this.copydefault = interfaceC35977oKs;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
 A[MD:(android.content.Context, android.util.AttributeSet):void (m)] (LINE:21) call: o.pGV.<init>(android.content.Context, android.util.AttributeSet):void type: THIS */
    public /* synthetic */ pGV(android.content.Context context, android.util.AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pGV(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        oKA oka = (oKA) C43251rlk.OLrzqt(oKA.class);
        InterfaceC35977oKs multiChartView$default = oka != null ? oKA.TaskDescription.getMultiChartView$default(oka, context, attributeSet, 0, 4, null) : null;
        this.copydefault = multiChartView$default;
        if (multiChartView$default != null) {
            addView(multiChartView$default.KWHzl());
        }
    }

    public final void AEQbTJ(@NotNull LifecycleOwner lifecycleOwner, @NotNull C35969oKk c35969oKk) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        Intrinsics.checkNotNullParameter(c35969oKk, "");
        InterfaceC35977oKs interfaceC35977oKs = this.copydefault;
        if (interfaceC35977oKs != null) {
            interfaceC35977oKs.EZpvd(lifecycleOwner, c35969oKk);
        }
    }

    public final void copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, int i, int i2, int i3, @NotNull java.lang.String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        InterfaceC35977oKs interfaceC35977oKs = this.copydefault;
        if (interfaceC35977oKs != null) {
            interfaceC35977oKs.KWHzl(str, str2, str3, i, i2, i3, str4);
        }
    }

    public final void OLrzqt(@NotNull java.util.List<C35965oKg> list) {
        Intrinsics.checkNotNullParameter(list, "");
        InterfaceC35977oKs interfaceC35977oKs = this.copydefault;
        if (interfaceC35977oKs != null) {
            interfaceC35977oKs.AEQbTJ(list);
        }
    }

    public final void KWHzl(@NotNull java.util.List<C35965oKg> list) {
        Intrinsics.checkNotNullParameter(list, "");
        InterfaceC35977oKs interfaceC35977oKs = this.copydefault;
        if (interfaceC35977oKs != null) {
            interfaceC35977oKs.copydefault(list);
        }
    }

    public final void setMultiChartViewClickListener(@NotNull InterfaceC35981oKw interfaceC35981oKw) {
        Intrinsics.checkNotNullParameter(interfaceC35981oKw, "");
        InterfaceC35977oKs interfaceC35977oKs = this.copydefault;
        if (interfaceC35977oKs != null) {
            interfaceC35977oKs.setMultiChartViewClickListener(interfaceC35981oKw);
        }
    }

    public final void setMarginTop(int i) {
        InterfaceC35977oKs interfaceC35977oKs = this.copydefault;
        if (interfaceC35977oKs != null) {
            interfaceC35977oKs.setMarginTop(i);
        }
    }

    public final int AEQbTJ() {
        InterfaceC35977oKs interfaceC35977oKs = this.copydefault;
        if (interfaceC35977oKs != null) {
            return interfaceC35977oKs.copydefault();
        }
        return 60;
    }

    public final void EZpvd() {
        InterfaceC35977oKs interfaceC35977oKs = this.copydefault;
        if (interfaceC35977oKs != null) {
            interfaceC35977oKs.AEQbTJ();
        }
    }

    public final void setPriceFractionDigits(int i) {
        InterfaceC35977oKs interfaceC35977oKs = this.copydefault;
        if (interfaceC35977oKs != null) {
            interfaceC35977oKs.setPriceFractionDigits(i);
        }
    }
}
