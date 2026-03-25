package o;

import com.okinc.business.invest_biz.data.models.ChainInfo;
import com.okinc.wallet.api.bean.CurrentWalletNotSupportedMode;
import com.okinc.wallet.api.bean.CurrentWalletSwitchConfig;
import com.okinc.wallet.api.bean.CurrentWalletSwitchNetworkMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.C25493ixk;
import o.InterfaceC26557jea;
import o.xWO;
import o.xWX;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jeD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C26534jeD {
    public final InterfaceC25466ixJ OLrzqt;
    public final C25491ixi copydefault;

    /* JADX INFO: renamed from: o.jeD$TaskDescription */
    public static final class TaskDescription implements InterfaceC54859xXz {
        @Override // o.InterfaceC54859xXz
        public void EZpvd() {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final boolean AEQbTJ(InterfaceC9738bbJ interfaceC9738bbJ, java.lang.Long l) {
        Intrinsics.checkNotNullParameter(interfaceC9738bbJ, "");
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final boolean copydefault(InterfaceC9738bbJ interfaceC9738bbJ, java.lang.Long l) {
        Intrinsics.checkNotNullParameter(interfaceC9738bbJ, "");
        return true;
    }

    public C26534jeD(@NotNull InterfaceC25466ixJ interfaceC25466ixJ, @NotNull C25491ixi c25491ixi) {
        Intrinsics.checkNotNullParameter(interfaceC25466ixJ, "");
        Intrinsics.checkNotNullParameter(c25491ixi, "");
        this.OLrzqt = interfaceC25466ixJ;
        this.copydefault = c25491ixi;
    }

    public final android.content.Context AEQbTJ() {
        return this.OLrzqt.AEQbTJ();
    }

    public final AbstractActivityC33041mov copydefault() {
        return this.OLrzqt.EZpvd();
    }

    public static /* synthetic */ void handlePreCheckAction$default(C26534jeD c26534jeD, InterfaceC26557jea interfaceC26557jea, InterfaceC54855xXv interfaceC54855xXv, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            interfaceC54855xXv = null;
        }
        c26534jeD.copydefault(interfaceC26557jea, interfaceC54855xXv);
    }

    public final void copydefault(@NotNull InterfaceC26557jea interfaceC26557jea, InterfaceC54855xXv interfaceC54855xXv) {
        Intrinsics.checkNotNullParameter(interfaceC26557jea, "");
        if (interfaceC26557jea instanceof InterfaceC26557jea.ActionBar) {
            C25491ixi c25491ixi = this.copydefault;
            if (c25491ixi != null) {
                c25491ixi.OLrzqt();
            }
            OLrzqt();
            return;
        }
        if (interfaceC26557jea instanceof InterfaceC26557jea.Activity) {
            AbstractActivityC33041mov abstractActivityC33041movEZpvd = this.OLrzqt.EZpvd();
            if (!(abstractActivityC33041movEZpvd instanceof AbstractActivityC33041mov)) {
                abstractActivityC33041movEZpvd = null;
            }
            if (abstractActivityC33041movEZpvd != null) {
                new C27583jxt().copydefault(abstractActivityC33041movEZpvd, this.OLrzqt.OLrzqt(), ((InterfaceC26557jea.Activity) interfaceC26557jea).KWHzl());
                return;
            }
            return;
        }
        if (interfaceC26557jea instanceof InterfaceC26557jea.Dialog) {
            ((InterfaceC54829xWw) C43251rlk.copydefault(InterfaceC54829xWw.class)).copydefault(((InterfaceC26557jea.Dialog) interfaceC26557jea).EZpvd(), this.OLrzqt.OLrzqt(), new Function1() { // from class: o.jeI
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C26534jeD.AEQbTJ(((java.lang.Boolean) obj).booleanValue());
                }
            });
            return;
        }
        if (interfaceC26557jea instanceof InterfaceC26557jea.Fragment) {
            C25491ixi c25491ixi2 = this.copydefault;
            if (c25491ixi2 != null) {
                c25491ixi2.OLrzqt();
            }
            if (interfaceC54855xXv != null) {
                InterfaceC26557jea.Fragment fragment = (InterfaceC26557jea.Fragment) interfaceC26557jea;
                AEQbTJ(interfaceC54855xXv, fragment.copydefault(), fragment.OLrzqt());
                return;
            }
            return;
        }
        if (!(interfaceC26557jea instanceof InterfaceC26557jea.FragmentManager)) {
            if (interfaceC26557jea instanceof InterfaceC26557jea.Application) {
                InterfaceC26557jea.Application application = (InterfaceC26557jea.Application) interfaceC26557jea;
                AEQbTJ(application.OLrzqt(), application.KWHzl());
                return;
            }
            return;
        }
        C25491ixi c25491ixi3 = this.copydefault;
        if (c25491ixi3 != null) {
            c25491ixi3.OLrzqt();
        }
        if (interfaceC54855xXv != null) {
            AEQbTJ(interfaceC54855xXv);
        }
    }

    public static final Unit AEQbTJ(boolean z) {
        return Unit.INSTANCE;
    }

    public final void AEQbTJ(InterfaceC54855xXv interfaceC54855xXv, int i, ChainInfo chainInfo) {
        java.lang.String string;
        CurrentWalletNotSupportedMode.NetworkNotSupportedForWalletType networkNotSupportedForWalletType = new CurrentWalletNotSupportedMode.NetworkNotSupportedForWalletType(i, chainInfo.EZpvd());
        CurrentWalletSwitchNetworkMode.SingleNetwork singleNetwork = new CurrentWalletSwitchNetworkMode.SingleNetwork(chainInfo.OLrzqt());
        android.content.Context contextAEQbTJ = AEQbTJ();
        if (contextAEQbTJ == null || (string = contextAEQbTJ.getString(C25493ixk.FragmentManager.sZqaRl)) == null) {
            string = "";
        }
        xWX.TaskDescription.showCurrentWalletNotSupportedScreen$default((xWX) C43251rlk.copydefault(InterfaceC23916iOb.class), this.OLrzqt.OLrzqt(), networkNotSupportedForWalletType, new CurrentWalletSwitchConfig(null, singleNetwork, string, null, null, 0, null, null, 249, null), new Function2() { // from class: o.jeB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return java.lang.Boolean.valueOf(C26534jeD.copydefault((InterfaceC9738bbJ) obj, (java.lang.Long) obj2));
            }
        }, null, interfaceC54855xXv, 16, null);
    }

    public final void AEQbTJ(InterfaceC54855xXv interfaceC54855xXv) {
        java.lang.String string;
        this.copydefault.OLrzqt();
        CurrentWalletSwitchNetworkMode.Ignored ignored = CurrentWalletSwitchNetworkMode.Ignored.OLrzqt;
        android.content.Context contextAEQbTJ = AEQbTJ();
        if (contextAEQbTJ == null || (string = contextAEQbTJ.getString(C25493ixk.FragmentManager.sZqaRl)) == null) {
            string = "";
        }
        xWX.TaskDescription.showCurrentWalletSwitchScreen$default((xWX) C43251rlk.copydefault(InterfaceC23916iOb.class), this.OLrzqt.OLrzqt(), new CurrentWalletSwitchConfig(null, ignored, string, null, null, 0, null, null, 249, null), new Function2() { // from class: o.jeH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return java.lang.Boolean.valueOf(C26534jeD.AEQbTJ((InterfaceC9738bbJ) obj, (java.lang.Long) obj2));
            }
        }, null, interfaceC54855xXv, 8, null);
    }

    public final void AEQbTJ(boolean z, ChainInfo chainInfo) {
        this.copydefault.OLrzqt();
        if (z) {
            AbstractActivityC33041mov abstractActivityC33041movCopydefault = copydefault();
            if (abstractActivityC33041movCopydefault != null) {
                C27496jwL.EZpvd.copydefault(abstractActivityC33041movCopydefault, chainInfo.EZpvd(), new Function0() { // from class: o.jeJ
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return C26534jeD.EZpvd(this.KWHzl);
                    }
                });
                return;
            }
            return;
        }
        OLrzqt();
    }

    public static final Unit EZpvd(C26534jeD c26534jeD) {
        c26534jeD.OLrzqt();
        return Unit.INSTANCE;
    }

    public final void OLrzqt() {
        xWO.ActionBar.showConnectWalletDialog$default((xWO) C43251rlk.copydefault(xWO.class), this.OLrzqt.OLrzqt(), new TaskDescription(), (java.util.List) null, (java.util.List) null, (InterfaceC54856xXw) null, 28, (java.lang.Object) null);
    }
}
