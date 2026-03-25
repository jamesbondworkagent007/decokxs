package o;

import androidx.core.os.BundleCompat;
import com.okinc.business.dex.api.bean.TradeParam;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.hwW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC23346hwW extends AbstractC32998moE {
    public TradeParam AEQbTJ;
    public final InterfaceC56387yDm OLrzqt = C31200lpY.copydefault(this);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeParam EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
    }

    @Override // o.AbstractC32998moE
    public void onInvisible() {
    }

    @Override // o.AbstractC32998moE
    public void onVisible() {
    }

    public final java.lang.String AEQbTJ() {
        return (java.lang.String) this.OLrzqt.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        android.os.Bundle arguments = getArguments();
        if (arguments != null) {
            this.AEQbTJ = (TradeParam) ((android.os.Parcelable) BundleCompat.getParcelable(arguments, "trade_data", TradeParam.class));
        }
    }
}
