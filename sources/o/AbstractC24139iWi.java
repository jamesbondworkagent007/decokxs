package o;

import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.ContextCompat;
import com.okinc.business.invest_biz.ui.page.order.details.viewbinder.InvestOrderDetailsNavigationItemBinder$1;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import o.iVX;
import o.iVX.ActionBar;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.iWi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public abstract class AbstractC24139iWi<T extends iVX.ActionBar> extends AbstractC27119jpF<T, iIV> {
    public final java.lang.Integer AEQbTJ;
    public final Function2<android.view.View, T, Unit> EZpvd;
    public final int copydefault;

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function2<? super android.view.View, ? super T extends o.iVX$ActionBar, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC24139iWi(@androidx.annotation.StringRes int i, @androidx.annotation.DrawableRes java.lang.Integer num, @NotNull Function2<? super android.view.View, ? super T, Unit> function2) {
        super(InvestOrderDetailsNavigationItemBinder$1.INSTANCE);
        Intrinsics.checkNotNullParameter(function2, "");
        this.copydefault = i;
        this.AEQbTJ = num;
        this.EZpvd = function2;
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Landroidx/viewbinding/ViewBinding;Ljava/lang/Object;)V */
    @Override // o.AbstractC27119jpF
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public void KWHzl(@NotNull iIV iiv, @NotNull T t) {
        Intrinsics.checkNotNullParameter(iiv, "");
        Intrinsics.checkNotNullParameter(t, "");
        android.content.Context context = iiv.getRoot().getContext();
        iiv.getRoot().setContentDescription("web3_defi_order_detail_action_btn");
        iiv.getRoot().setText(this.copydefault);
        android.widget.TextView root = iiv.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        ViewGroup.LayoutParams layoutParams = root.getLayoutParams();
        if (layoutParams != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            int iOLrzqt = t.OLrzqt();
            Intrinsics.copydefault(context);
            marginLayoutParams.topMargin = C55298xhM.OLrzqt(iOLrzqt, context);
            root.setLayoutParams(marginLayoutParams);
            if (this.AEQbTJ != null) {
                C27569jxf c27569jxf = C27569jxf.OLrzqt;
                android.widget.TextView root2 = iiv.getRoot();
                Intrinsics.checkNotNullExpressionValue(root2, "");
                int iIntValue = this.AEQbTJ.intValue();
                int iOLrzqt2 = C55298xhM.OLrzqt(20, context);
                int color = ContextCompat.getColor(context, C52761wXj.Activity.KWHzl);
                c27569jxf.copydefault(root2, iIntValue, iOLrzqt2, true, java.lang.Integer.valueOf(color), C55298xhM.OLrzqt(8, context));
            } else {
                iiv.getRoot().setCompoundDrawablesRelative(null, null, null, null);
            }
            android.widget.TextView root3 = iiv.getRoot();
            root3.setOnClickListener(new ActionBar(root3, 1000L, this, t));
            return;
        }
        throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }

    /* JADX INFO: renamed from: o.iWi$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ AbstractC24139iWi OLrzqt;
        public final /* synthetic */ iVX.ActionBar copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, AbstractC24139iWi abstractC24139iWi, iVX.ActionBar actionBar) {
            this.KWHzl = view;
            this.AEQbTJ = j;
            this.OLrzqt = abstractC24139iWi;
            this.copydefault = actionBar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.AEQbTJ || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                android.widget.TextView textView = (android.widget.TextView) this.KWHzl;
                Function2 function2 = this.OLrzqt.EZpvd;
                Intrinsics.copydefault(textView);
                function2.invoke(textView, this.copydefault);
            }
        }
    }
}
