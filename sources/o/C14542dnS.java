package o;

import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import com.okinc.wallet.api.bean.SupportedNetworkType;
import com.okinc.wallet.api.bean.UnsupportedWalletType;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.dnS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C14542dnS extends ViewModel {
    public final java.util.ArrayList<SupportedNetworkType> EZpvd;
    public final InterfaceC56387yDm KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.ArrayList<SupportedNetworkType> AEQbTJ() {
        return this.EZpvd;
    }

    public C14542dnS(@NotNull final SavedStateHandle savedStateHandle, @NotNull final C10948byA c10948byA) {
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        Intrinsics.checkNotNullParameter(c10948byA, "");
        this.EZpvd = (java.util.ArrayList) savedStateHandle.get("SUPPORTED_NETWORK_TYPES");
        this.KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.dnT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C14542dnS.KWHzl(savedStateHandle, this, c10948byA);
            }
        });
    }

    public final java.util.ArrayList<UnsupportedWalletType> copydefault() {
        return (java.util.ArrayList) this.KWHzl.getValue();
    }

    public static final java.util.ArrayList KWHzl(SavedStateHandle savedStateHandle, C14542dnS c14542dnS, C10948byA c10948byA) {
        java.util.ArrayList arrayList = (java.util.ArrayList) savedStateHandle.get("UNSUPPORTED_WALLET_TYPES");
        if (arrayList == null) {
            arrayList = new java.util.ArrayList();
        }
        java.util.ArrayList<SupportedNetworkType> arrayList2 = c14542dnS.EZpvd;
        if (arrayList2 != null) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.util.Iterator<T> it = arrayList2.iterator();
            while (it.hasNext()) {
                C10854bwM c10854bwMCopydefault = c10948byA.copydefault(((SupportedNetworkType) it.next()).KWHzl());
                if (c10854bwMCopydefault != null) {
                    arrayList3.add(c10854bwMCopydefault);
                }
            }
            if (!arrayList3.isEmpty()) {
                java.util.Iterator it2 = arrayList3.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    if (!((C10854bwM) it2.next()).hrNTAI()) {
                        UnsupportedWalletType unsupportedWalletType = UnsupportedWalletType.MPCWallet;
                        if (!arrayList.contains(unsupportedWalletType)) {
                            arrayList.add(unsupportedWalletType);
                        }
                    }
                }
            }
        }
        return arrayList;
    }
}
