package o;

import androidx.core.os.BundleCompat;
import androidx.viewbinding.ViewBinding;
import com.okinc.business.dex.api.bean.TradeParam;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public abstract class hTH<VB extends ViewBinding> extends AbstractC32998moE {
    public android.widget.FrameLayout ejfBZ;
    public TradeParam fARcdN;
    public final InterfaceC56387yDm fIwbmz = C31200lpY.copydefault(this);
    public VB fJNWhG;

    public void DbNXlk() {
    }

    public abstract VB OLrzqt(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle);

    public abstract void OLrzqt(@NotNull VB vb, android.os.Bundle bundle);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public android.widget.FrameLayout ejfBZ() {
        return this.ejfBZ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final VB fARcdN() {
        return this.fJNWhG;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeParam fIwbmz() {
        return this.fARcdN;
    }

    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return -1;
    }

    @Override // o.AbstractC32998moE
    public void onInvisible() {
    }

    @Override // o.AbstractC32998moE
    public void onVisible() {
    }

    public final java.lang.String AuCTel() {
        return (java.lang.String) this.fIwbmz.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        android.os.Bundle arguments = getArguments();
        if (arguments != null) {
            this.fARcdN = (TradeParam) ((android.os.Parcelable) BundleCompat.getParcelable(arguments, "trade_data", TradeParam.class));
        }
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public final android.view.View onCreateView(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        VB vb = (VB) OLrzqt(layoutInflater, viewGroup, bundle);
        this.fJNWhG = vb;
        if (vb != null) {
            return vb.getRoot();
        }
        return null;
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        DbNXlk();
    }

    @Override // o.AbstractC32996moC
    public final void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        VB vb = this.fJNWhG;
        if (vb != null) {
            OLrzqt(vb, bundle);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.fJNWhG = null;
    }
}
