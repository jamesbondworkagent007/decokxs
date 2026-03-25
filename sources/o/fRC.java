package o;

import com.okinc.wallet.api.bean.ThemeType;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public abstract class fRC extends AbstractC32996moC {
    public android.content.Context fetchVPNInfo;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.content.Context isConnected() {
        return this.fetchVPNInfo;
    }

    public abstract ThemeType valueOf();

    @Override // androidx.fragment.app.Fragment
    public void onAttach(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        super.onAttach(context);
        this.fetchVPNInfo = copydefault(context);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
        this.fetchVPNInfo = null;
    }

    public final android.content.Context copydefault(android.content.Context context) {
        return C17779fRz.OLrzqt(context, valueOf());
    }
}
