package o;

import androidx.core.os.BundleCompat;
import androidx.viewbinding.ViewBinding;
import com.okinc.business.dex.api.bean.TradeParam;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ilm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC24860ilm<VB extends ViewBinding> extends AbstractC32998moE {
    public VB getNewProxyInstance;
    public TradeParam zLjUOn;
    public final InterfaceC56387yDm zsXlph = C31200lpY.copydefault(this);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final VB AwvSrB() {
        return this.getNewProxyInstance;
    }

    public abstract VB EZpvd(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle);

    public abstract void KWHzl(@NotNull VB vb, android.os.Bundle bundle);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeParam gHZMYf() {
        return this.zLjUOn;
    }

    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return -1;
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public android.view.View onCreateView(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        VB vb = (VB) EZpvd(layoutInflater, viewGroup, bundle);
        this.getNewProxyInstance = vb;
        if (vb != null) {
            return vb.getRoot();
        }
        return null;
    }

    public final java.lang.String zuBGHE() {
        return (java.lang.String) this.zsXlph.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        android.os.Bundle arguments = getArguments();
        if (arguments != null) {
            this.zLjUOn = (TradeParam) ((android.os.Parcelable) BundleCompat.getParcelable(arguments, "trade_data", TradeParam.class));
        }
    }

    @Override // o.AbstractC32996moC
    public final void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        VB vb = this.getNewProxyInstance;
        if (vb != null) {
            KWHzl(vb, bundle);
        }
    }
}
