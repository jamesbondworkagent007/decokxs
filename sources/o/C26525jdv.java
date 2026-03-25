package o;

import androidx.recyclerview.widget.AsyncListDiffer;
import com.okinc.business.invest_biz.ui.screens.network_fee.model.InvestNetworkFeeItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jdv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C26525jdv extends C43316rmw {
    public final Function1<InvestNetworkFeeItem, Unit> KWHzl;
    public final Function1<InvestNetworkFeeItem, Unit> OLrzqt;
    public final AsyncListDiffer<InvestNetworkFeeItem> copydefault;

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.business.invest_biz.ui.screens.network_fee.model.InvestNetworkFeeItem, kotlin.Unit> */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.business.invest_biz.ui.screens.network_fee.model.InvestNetworkFeeItem, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public C26525jdv(@NotNull Function1<? super InvestNetworkFeeItem, Unit> function1, Function1<? super InvestNetworkFeeItem, Unit> function12) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.KWHzl = function1;
        this.OLrzqt = function12;
        this.copydefault = new AsyncListDiffer<>(this, C26529jdz.copydefault);
        register(InvestNetworkFeeItem.class, new C26489jdL(function1, function12));
    }

    public final void AEQbTJ(@NotNull java.util.List<InvestNetworkFeeItem> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.copydefault.submitList(list, new java.lang.Runnable() { // from class: o.jdB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C26525jdv.AEQbTJ(this.EZpvd);
            }
        });
    }

    public static final void AEQbTJ(C26525jdv c26525jdv) {
        super.setItems(c26525jdv.copydefault.getCurrentList());
    }
}
