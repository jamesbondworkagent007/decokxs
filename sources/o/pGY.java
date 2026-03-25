package o;

import com.okinc.kline.ui.view.model.MarketTypeSelect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C35966oKh;
import o.oKA;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public class pGY extends android.widget.FrameLayout {
    public InterfaceC35970oKl AEQbTJ;
    public boolean OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public pGY(@NotNull android.content.Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setIView(InterfaceC35970oKl interfaceC35970oKl) {
        this.AEQbTJ = interfaceC35970oKl;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
 A[MD:(android.content.Context, android.util.AttributeSet):void (m)] (LINE:20) call: o.pGY.<init>(android.content.Context, android.util.AttributeSet):void type: THIS */
    public /* synthetic */ pGY(android.content.Context context, android.util.AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pGY(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        this.OLrzqt = true;
        oKA oka = (oKA) C43251rlk.OLrzqt(oKA.class);
        android.view.View indexView$default = oka != null ? oKA.TaskDescription.getIndexView$default(oka, context, attributeSet, 0, 4, null) : null;
        InterfaceC35970oKl interfaceC35970oKl = indexView$default instanceof InterfaceC35970oKl ? (InterfaceC35970oKl) indexView$default : null;
        this.AEQbTJ = interfaceC35970oKl;
        if (interfaceC35970oKl != null) {
            android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C35966oKh.ActionBar.KWHzl);
            Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
            this.OLrzqt = typedArrayObtainStyledAttributes.getBoolean(C35966oKh.ActionBar.OLrzqt, true);
            typedArrayObtainStyledAttributes.recycle();
            interfaceC35970oKl.setIsProfit(this.OLrzqt);
            addView(interfaceC35970oKl.OLrzqt());
        }
        InterfaceC35970oKl interfaceC35970oKl2 = this.AEQbTJ;
        if (interfaceC35970oKl2 != null) {
            interfaceC35970oKl2.setIsShowSRIndicator(false);
        }
        InterfaceC35970oKl interfaceC35970oKl3 = this.AEQbTJ;
        if (interfaceC35970oKl3 != null) {
            interfaceC35970oKl3.setIsShowSTIndicator(false);
        }
        InterfaceC35970oKl interfaceC35970oKl4 = this.AEQbTJ;
        if (interfaceC35970oKl4 != null) {
            interfaceC35970oKl4.setIsShowEnvelopeIndicator(false);
        }
        InterfaceC35970oKl interfaceC35970oKl5 = this.AEQbTJ;
        if (interfaceC35970oKl5 != null) {
            interfaceC35970oKl5.setIsShowVWAPIndicator(false);
        }
    }

    public final void setOnItemSelectListener(@NotNull Function1<? super MarketTypeSelect, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        InterfaceC35970oKl interfaceC35970oKl = this.AEQbTJ;
        if (interfaceC35970oKl != null) {
            interfaceC35970oKl.setOnItemSelectListener(function1);
        }
    }

    public final void setMainIndicatorSelect() {
        InterfaceC35970oKl interfaceC35970oKl = this.AEQbTJ;
        if (interfaceC35970oKl != null) {
            interfaceC35970oKl.setMainIndicatorSelect();
        }
    }

    public final void setSideIndicators(@NotNull java.util.List<java.lang.String> list) {
        Intrinsics.checkNotNullParameter(list, "");
        InterfaceC35970oKl interfaceC35970oKl = this.AEQbTJ;
        if (interfaceC35970oKl != null) {
            interfaceC35970oKl.setSideIndicators(list);
        }
    }

    public final void setSideIndicator(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        InterfaceC35970oKl interfaceC35970oKl = this.AEQbTJ;
        if (interfaceC35970oKl != null) {
            interfaceC35970oKl.setSideIndicator(str);
        }
    }
}
