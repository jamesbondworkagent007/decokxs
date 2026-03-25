package o;

import androidx.recyclerview.widget.AsyncListDiffer;
import com.okinc.business.invest_biz.ui.finality_provider.InvestFinalityProviderItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class iPK extends C43316rmw {
    public final Function1<InvestFinalityProviderItem, Unit> OLrzqt;
    public final AsyncListDiffer<InvestFinalityProviderItem> copydefault;

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.business.invest_biz.ui.finality_provider.InvestFinalityProviderItem, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public iPK(@NotNull Function1<? super InvestFinalityProviderItem, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.OLrzqt = function1;
        this.copydefault = new AsyncListDiffer<>(this, iPM.AEQbTJ);
        register(InvestFinalityProviderItem.class, new iPJ(function1));
    }

    public final void KWHzl(@NotNull java.util.List<InvestFinalityProviderItem> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.copydefault.submitList(list, new java.lang.Runnable() { // from class: o.iPL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                iPK.copydefault(this.AEQbTJ);
            }
        });
    }

    public static final void copydefault(iPK ipk) {
        super.setItems(ipk.copydefault.getCurrentList());
    }
}
