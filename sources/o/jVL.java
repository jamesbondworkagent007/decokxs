package o;

import android.widget.CompoundButton;
import com.okinc.business.market.features.filter.ui.binder.range.RangeSwitchFilterItemBinder$1;
import com.okinc.uilab.item.OKRegularCell;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class jVL extends AbstractC25436iwg<jVK, hDS> {
    public final Function1<kotlin.Pair<java.lang.Integer, java.lang.Boolean>, Unit> copydefault;

    public static final java.lang.String OLrzqt(java.lang.String str) {
        return str;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super kotlin.Pair<java.lang.Integer, java.lang.Boolean>, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public jVL(@NotNull Function1<? super kotlin.Pair<java.lang.Integer, java.lang.Boolean>, Unit> function1) {
        super(RangeSwitchFilterItemBinder$1.INSTANCE);
        Intrinsics.checkNotNullParameter(function1, "");
        this.copydefault = function1;
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull final C25435iwf<hDS> c25435iwf, @NotNull jVK jvk) {
        Intrinsics.checkNotNullParameter(c25435iwf, "");
        Intrinsics.checkNotNullParameter(jvk, "");
        ((hDS) c25435iwf.EZpvd()).getRoot().getContext();
        hDS hds = (hDS) c25435iwf.EZpvd();
        OKRegularCell oKRegularCell = hds.AEQbTJ;
        java.lang.String strAEQbTJ = jvk.AEQbTJ();
        final java.lang.String str = "--";
        oKRegularCell.setTitle(C31256lqb.KWHzl(C33129mqd.OLrzqt((java.lang.CharSequence) strAEQbTJ) ? strAEQbTJ : "", (Function0<java.lang.String>) new Function0() { // from class: o.jVM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return jVL.OLrzqt(str);
            }
        }));
        hds.copydefault.setChecked(jvk.KWHzl());
        hds.copydefault.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: o.jVN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z) {
                jVL.KWHzl(this.KWHzl, c25435iwf, compoundButton, z);
            }
        });
    }

    public static final void KWHzl(jVL jvl, C25435iwf c25435iwf, android.widget.CompoundButton compoundButton, boolean z) {
        jvl.copydefault.invoke(C56390yDp.OLrzqt(java.lang.Integer.valueOf(jvl.getPosition(c25435iwf)), java.lang.Boolean.valueOf(z)));
    }
}
