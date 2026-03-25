package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import com.okinc.tradingbot.impl.market_place.common.BotSelectedItemBinder;
import com.okinc.unify_trade.biz.CategoryTag;
import com.okinc.unify_trade.biz.OrderCategory;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vwo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C51958vwo extends ConstraintLayout {
    public uXF copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C51958vwo(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C51958vwo(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:27) call: o.vwo.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C51958vwo(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C51958vwo(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        setClipChildren(false);
        setClipToPadding(false);
        setBackgroundColor(C33070mpX.copydefault(C52761wXj.Activity.EZpvd));
        this.copydefault = (uXF) DataBindingUtil.inflate(android.view.LayoutInflater.from(context), C48033uCm.Activity.aQtmcU, this, true);
    }

    public final void setData(int i, @NotNull java.lang.String str, @NotNull java.lang.String str2) {
        xOR xorCopydefault;
        java.util.List<OrderCategory> listAEQbTJ;
        java.lang.Object next;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.copydefault.KWHzl.setImageResource(i);
        this.copydefault.OLrzqt.setText(str);
        this.copydefault.copydefault.removeAllViews();
        InterfaceC54581xNr interfaceC54581xNrCopydefault = C54589xNz.EZpvd.copydefault();
        if (interfaceC54581xNrCopydefault == null || (xorCopydefault = interfaceC54581xNrCopydefault.copydefault()) == null || (listAEQbTJ = xorCopydefault.AEQbTJ()) == null) {
            return;
        }
        java.util.Iterator<T> it = listAEQbTJ.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (Intrinsics.EZpvd((java.lang.Object) ((OrderCategory) next).getStrategyType(), (java.lang.Object) str2)) {
                    break;
                }
            }
        }
        OrderCategory orderCategory = (OrderCategory) next;
        if (orderCategory != null) {
            android.content.Context context = this.copydefault.copydefault.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            android.view.View viewCopydefault = copydefault(context, orderCategory.getTags());
            if (viewCopydefault != null) {
                this.copydefault.copydefault.addView(viewCopydefault);
            }
        }
    }

    private final android.view.View copydefault(android.content.Context context, java.util.List<CategoryTag> list) {
        java.lang.Object next;
        if (list == null) {
            return null;
        }
        java.util.Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (!Intrinsics.EZpvd((java.lang.Object) ((CategoryTag) next).getType(), (java.lang.Object) BotSelectedItemBinder.BotTagType.LOSS_INSURANCE.getType())) {
                break;
            }
        }
        CategoryTag categoryTag = (CategoryTag) next;
        if (categoryTag == null) {
            return null;
        }
        C55251xgS c55251xgS = new C55251xgS(context, null, 0, 6, null);
        c55251xgS.setOKDSStyle(7);
        c55251xgS.setOKDSSize(-5);
        c55251xgS.setText(categoryTag.getName());
        return c55251xgS;
    }
}
