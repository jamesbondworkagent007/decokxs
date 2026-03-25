package o;

import com.okinc.business.defi.wallet.mine.search.ui.view.WalletSearchContainerFragment;
import com.okinc.wallet.api.bean.WalletSearchConfiguration;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.xWQ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.daf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C13866daf extends AbstractC43215rlA implements xWQ {
    @Override // o.xWQ
    public androidx.fragment.app.Fragment EZpvd(@NotNull WalletSearchConfiguration walletSearchConfiguration) {
        Intrinsics.checkNotNullParameter(walletSearchConfiguration, "");
        WalletSearchContainerFragment.Application application = WalletSearchContainerFragment.Companion;
        boolean showBanner = walletSearchConfiguration.getShowBanner();
        java.lang.String source = walletSearchConfiguration.getSource();
        WalletSearchConfiguration.DisplayOptions displayOptions = walletSearchConfiguration.getDisplayOptions();
        return application.OLrzqt(new WalletSearchContainerFragment.Config(showBanner, source, displayOptions != null ? new WalletSearchContainerFragment.Config.DisplayOptions(displayOptions.getSearchBarTransitionName(), displayOptions.getShowStatusBar()) : null));
    }

    public static final androidx.fragment.app.Fragment copydefault(androidx.fragment.app.Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "");
        return fragment.getParentFragment();
    }

    @Override // o.xWQ
    public xWQ.Activity AEQbTJ(@NotNull androidx.fragment.app.Fragment fragment) {
        java.lang.Object next;
        Intrinsics.checkNotNullParameter(fragment, "");
        java.util.Iterator it = C59405zgS.EZpvd(fragment.getParentFragment(), (Function1<? super androidx.fragment.app.Fragment, ? extends androidx.fragment.app.Fragment>) ((Function1<? super java.lang.Object, ? extends java.lang.Object>) new Function1() { // from class: o.dad
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C13866daf.copydefault((androidx.fragment.app.Fragment) obj);
            }
        })).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((androidx.fragment.app.Fragment) next) instanceof xWQ.Activity) {
                break;
            }
        }
        if (next instanceof xWQ.Activity) {
            return (xWQ.Activity) next;
        }
        return null;
    }
}
