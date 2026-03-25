package o;

import android.view.View;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.okinc.business.market.features.filter.ui.binder.range.RangeFilterItemBinder$1;
import com.okinc.uilab.item.OKRegularCell;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class jVI extends AbstractC25436iwg<jVE, hDT> {
    public final Function1<jVE, Unit> EZpvd;

    public static final java.lang.String copydefault(java.lang.String str) {
        return str;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super o.jVE, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public jVI(@NotNull Function1<? super jVE, Unit> function1) {
        super(RangeFilterItemBinder$1.INSTANCE);
        Intrinsics.checkNotNullParameter(function1, "");
        this.EZpvd = function1;
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C25435iwf<hDT> c25435iwf, @NotNull jVE jve) {
        Intrinsics.checkNotNullParameter(c25435iwf, "");
        Intrinsics.checkNotNullParameter(jve, "");
        ((hDT) c25435iwf.EZpvd()).getRoot().getContext();
        hDT hdt = (hDT) c25435iwf.EZpvd();
        OKRegularCell oKRegularCell = hdt.EZpvd;
        java.lang.String strEZpvd = jve.EZpvd();
        final java.lang.String str = "--";
        oKRegularCell.setTitle(C31256lqb.KWHzl(C33129mqd.OLrzqt((java.lang.CharSequence) strEZpvd) ? strEZpvd : "", (Function0<java.lang.String>) new Function0() { // from class: o.jVH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return jVI.copydefault(str);
            }
        }));
        hdt.KWHzl.setText(jve.OLrzqt(jve.AEQbTJ()));
        LinearLayoutCompat root = ((hDT) c25435iwf.EZpvd()).getRoot();
        root.setOnClickListener(new ActionBar(root, 1000L, this, jve));
    }

    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ jVI KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ jVE copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, jVI jvi, jVE jve) {
            this.OLrzqt = view;
            this.AEQbTJ = j;
            this.KWHzl = jvi;
            this.copydefault = jve;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.AEQbTJ || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.KWHzl.EZpvd.invoke(this.copydefault);
            }
        }
    }
}
