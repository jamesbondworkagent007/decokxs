package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class dOK extends AbstractC57329ygP {

    public static final class Activity implements InterfaceC54859xXz {
        @Override // o.InterfaceC54859xXz
        public void EZpvd() {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC57329ygP
    public java.lang.String getSupportJSObjectUri() {
        return "window";
    }

    @Override // o.AbstractC57329ygP
    public void performJSMethod(@NotNull final com.okinc.jsbridge.Message message, @NotNull final InterfaceC57336ygW interfaceC57336ygW) {
        Intrinsics.checkNotNullParameter(message, "");
        Intrinsics.checkNotNullParameter(interfaceC57336ygW, "");
        android.content.Context contextAEQbTJ = interfaceC57336ygW.AEQbTJ();
        if (contextAEQbTJ instanceof AbstractActivityC33041mov) {
            C14140dfo c14140dfoGHZMYf = C13458dMb.EZpvd(contextAEQbTJ).gHZMYf();
            androidx.fragment.app.FragmentManager supportFragmentManager = ((AbstractActivityC33041mov) contextAEQbTJ).getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
            C14140dfo.showConnectWalletDialog$default(c14140dfoGHZMYf, supportFragmentManager, true, new Activity(), 0, new InterfaceC54856xXw() { // from class: o.dOH
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC54856xXw
                public final void OLrzqt(android.os.Bundle bundle) {
                    dOK.copydefault(interfaceC57336ygW, message, bundle);
                }
            }, 8, null);
            return;
        }
        interfaceC57336ygW.copydefault(message, "fail");
    }

    public static final void copydefault(InterfaceC57336ygW interfaceC57336ygW, com.okinc.jsbridge.Message message, android.os.Bundle bundle) {
        if (Intrinsics.EZpvd(bundle != null ? java.lang.Boolean.valueOf(bundle.getBoolean("result", false)) : null, java.lang.Boolean.TRUE)) {
            interfaceC57336ygW.OLrzqt(message, C12764ctD.OLrzqt.AEQbTJ(C56423yEv.EZpvd(C56390yDp.OLrzqt("result", 1))));
        } else {
            interfaceC57336ygW.OLrzqt(message, C12764ctD.OLrzqt.AEQbTJ(C56423yEv.EZpvd(C56390yDp.OLrzqt("result", 2))));
        }
    }

    @Override // o.AbstractC57329ygP
    public java.util.Set<java.lang.String> getSupportJSMethods() {
        return yEE.AhwBna("createOrImportWallet", "web3/wallet/js/createOrImportWallet");
    }
}
