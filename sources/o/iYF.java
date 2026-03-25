package o;

import com.okinc.business.invest_biz.ui.screens.defi_dashboard.asset_details.AssetRawData;
import com.okinc.business.invest_biz.ui.widget.defi_dashboard.ButtonAction;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class iYF extends AbstractC27470jvm {
    public iYF(@NotNull Function2<? super ButtonAction, ? super AssetRawData, Unit> function2) {
        Intrinsics.checkNotNullParameter(function2, "");
        register(iYS.class, new iYV());
        register(C27296jsX.class, new iYO(function2));
    }
}
