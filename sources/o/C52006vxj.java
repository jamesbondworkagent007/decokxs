package o;

import android.view.View;
import com.google.android.material.tabs.TabLayout;
import com.okinc.biz.TacticsType;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vxj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C52006vxj extends android.widget.LinearLayout {
    public TacticsType AEQbTJ;
    public android.view.View KWHzl;
    public C54990xbW OLrzqt;
    public Function1<? super TacticsType, Unit> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C52006vxj(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C52006vxj(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C54990xbW AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOnBotSelectCallback(Function1<? super TacticsType, Unit> function1) {
        this.copydefault = function1;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:23) call: o.vxj.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C52006vxj(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C52006vxj(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.AEQbTJ = TacticsType.TACTICS_GRDE;
        C54990xbW c54990xbW = (C54990xbW) android.view.LayoutInflater.from(context).inflate(C48033uCm.Activity.isTimeProfileEmpty, this).findViewById(C48033uCm.Application.OqhRBMiKdSzF);
        this.OLrzqt = c54990xbW;
        this.KWHzl = c54990xbW.findViewById(C48033uCm.Application.DzCpqu);
    }

    public final void OLrzqt(@NotNull C54982xbO c54982xbO) {
        Intrinsics.checkNotNullParameter(c54982xbO, "");
        this.OLrzqt.setData(yDY.copydefault(c54982xbO), new Function2() { // from class: o.vxl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C52006vxj.OLrzqt(this.KWHzl, (TabLayout.Tab) obj, ((java.lang.Integer) obj2).intValue());
            }
        }, new Function2() { // from class: o.vxm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C52006vxj.copydefault((TabLayout.Tab) obj, ((java.lang.Integer) obj2).intValue());
            }
        }, new Function2() { // from class: o.vxk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C52006vxj.KWHzl((TabLayout.Tab) obj, ((java.lang.Integer) obj2).intValue());
            }
        });
    }

    public static final Unit copydefault(TabLayout.Tab tab, int i) {
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(TabLayout.Tab tab, int i) {
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(C52006vxj c52006vxj, TabLayout.Tab tab, int i) {
        Function1<? super TacticsType, Unit> function1 = c52006vxj.copydefault;
        if (function1 != null) {
            function1.invoke(c52006vxj.AEQbTJ);
        }
        return Unit.INSTANCE;
    }

    public final void EZpvd(int i, @NotNull C54982xbO c54982xbO) {
        Intrinsics.checkNotNullParameter(c54982xbO, "");
        this.OLrzqt.OLrzqt(i, c54982xbO);
        this.OLrzqt.copydefault();
    }

    public final void setSelectIconVisibility(boolean z) {
        this.OLrzqt.setSelectIconVisibility(z);
    }

    public final void setSelectClickListener(@NotNull View.OnClickListener onClickListener) {
        Intrinsics.checkNotNullParameter(onClickListener, "");
        this.OLrzqt.setSelectClickListener(onClickListener);
    }

    public final void OLrzqt() {
        android.view.View view = this.KWHzl;
        if (view != null) {
            view.setVisibility(8);
        }
    }
}
