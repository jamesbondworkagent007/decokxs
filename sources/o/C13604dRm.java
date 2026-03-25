package o;

import com.okinc.modular.deeplinkv2.DeeplinkMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC43232rlR;
import o.InterfaceC43233rlS;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.dRm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C13604dRm {
    public static final C13604dRm copydefault = new C13604dRm();

    private C13604dRm() {
    }

    /* JADX INFO: renamed from: o.dRm$Application */
    public static final class Application implements InterfaceC43233rlS {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC43233rlS
        public java.lang.String OLrzqt() {
            return "wc";
        }

        @Override // o.InterfaceC43233rlS
        public boolean copydefault() {
            return false;
        }

        @Override // o.InterfaceC43233rlS
        public java.util.List<C43240rlZ> AEQbTJ() {
            return InterfaceC43233rlS.Application.copydefault(this);
        }

        @Override // o.InterfaceC43233rlS
        public boolean AYXKKw() {
            return InterfaceC43233rlS.Application.AEQbTJ(this);
        }

        @Override // o.InterfaceC43233rlS
        public boolean EZpvd() {
            return InterfaceC43233rlS.Application.OLrzqt(this);
        }

        @Override // o.InterfaceC43233rlS
        public DeeplinkMode KWHzl() {
            return DeeplinkMode.WALLET;
        }
    }

    public final void OLrzqt(@NotNull android.content.Context context, @NotNull InterfaceC43237rlW interfaceC43237rlW) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(interfaceC43237rlW, "");
        interfaceC43237rlW.KWHzl(new Application(), C56392yDr.copydefault(new Function0() { // from class: o.dRr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C13604dRm.fetchVPNInfo();
            }
        }));
        interfaceC43237rlW.KWHzl(new ActionBar(), C56392yDr.copydefault(new Function0() { // from class: o.dRz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C13604dRm.DbNXlk();
            }
        }));
        interfaceC43237rlW.EZpvd(new TaskDescription(), C56392yDr.copydefault(new Function0() { // from class: o.dRw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C13604dRm.uzCIH();
            }
        }));
        interfaceC43237rlW.EZpvd(new Activity(), C56392yDr.copydefault(new Function0() { // from class: o.dRy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C13604dRm.hDKMBd();
            }
        }));
        interfaceC43237rlW.EZpvd(new StateListAnimator(), C56392yDr.copydefault(new Function0() { // from class: o.dRF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C13604dRm.iwGUEr();
            }
        }));
        java.util.Iterator it = yDY.gEmmrt(new xZS("wallet/home", null, false, 6, null), new xZS("wallet/home/page", null, false, 6, null), new xZS("wallet/home/h5", null, false, 6, null), new xZS("wallet/home/web", null, false, 6, null), new xZS("wallet/home/freeGasPage", null, false, 6, null), new xZS("wallet/home/defi", null, false, 6, null), new xZS("wallet/home/approvals", null, false, 6, null), new xZS("wallet/home/scan", null, false, 6, null), new xZS("wallet/home/airdropZone", null, false, 6, null), new xZS("wallet/home/mpcBackupTip", null, false, 6, null), new xZS("wallet/send", null, false, 6, null), new xZS("wallet/receive", null, false, 6, null), new xZS("wallet/history", null, false, 6, null), new xZS("wallet/history/detail", null, false, 6, null), new xZS("wallet/fastTransfer", null, false, 6, null), new xZS("wallet/hardware/keystone", null, false, 6, null), new xZS("wallet/hardware/ledger", null, false, 6, null), new xZS("wallet/hardware/onekey", null, false, 6, null), new xZS("wallet/home/batchCreateAccount", null, false, 6, null), new xZS("wallet/detail", null, false, 6, null), new xZS("wallet/tonconnect", null, false, 6, null), new xZS("wallet/connect", null, false, 6, null), new xZS("wallet/home/multiTransfer", null, false, 6, null), new xZS("wallet/objectivity", null, false, 6, null), new xZS("wallet/home/eip7702Upgrade", null, false, 6, null), new xZS("wallet/home/smallAssetsConverter", null, false, 6, null), new xZS("wallet/teeAccount/statusPage", null, false, 6, null), new xZS("wallet/referral/invitation", null, false, 6, null), new xZS("wallet/referral/affiliates", null, false, 6, null), new xZS("wallet/home/usdgActivity", null, false, 6, null), new xZS("wallet/management/aboutAccount", null, false, 6, null), new xZS("wallet/management/customNetwork", null, false, 6, null), new xZS("wallet/management/resetWallet", null, false, 6, null), new xZS("wallet/management/aboutWallet", null, false, 6, null), new xZS("wallet/management/editWallet", null, false, 6, null), new xZS("wallet/pandora/walletTools", null, false, 6, null)).iterator();
        while (it.hasNext()) {
            interfaceC43237rlW.copydefault((xZS) it.next(), C56392yDr.copydefault(new Function0() { // from class: o.dRD
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C13604dRm.getNewProxyInstance();
                }
            }));
        }
        java.util.Iterator it2 = yDY.gEmmrt(new xZS("wallet/backup/wallet", null, false, 6, null), new xZS("wallet/password", null, false, 6, null), new xZS("wallet/mpc/escape", null, false, 6, null), new xZS("wallet/security/audit", null, false, 6, null), new xZS("wallet/device/security", null, false, 6, null), new xZS("wallet/manage", null, false, 6, null), new xZS("wallet/custom/network", null, false, 6, null), new xZS("wallet/address/book", null, false, 6, null), new xZS("wallet/preference/setting", null, false, 6, null), new xZS("wallet/account/linking", null, false, 6, null), new xZS("wallet/service/terms", null, false, 6, null), new xZS("wallet/privacy/policy", null, false, 6, null), new xZS("wallet/communities/add", null, false, 6, null), new xZS("wallet/support/center", null, false, 6, null), new xZS("wallet/referral/dashboard", null, false, 6, null)).iterator();
        while (it2.hasNext()) {
            interfaceC43237rlW.copydefault((xZS) it2.next(), C56392yDr.copydefault(new Function0() { // from class: o.dRC
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C13604dRm.AuCTelauCTel();
                }
            }));
        }
        if (C34703nhO.copydefault()) {
            java.util.Iterator it3 = yDY.gEmmrt(new xZS("wallet/cedefi/startbind", null, false, 6, null), new xZS("wallet/cedefi/bindresult", null, false, 6, null)).iterator();
            while (it3.hasNext()) {
                interfaceC43237rlW.copydefault((xZS) it3.next(), C56392yDr.copydefault(new Function0() { // from class: o.dRu
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return C13604dRm.ejfBZ();
                    }
                }));
            }
        }
        java.util.Iterator it4 = yDY.gEmmrt(new xZS("mainwc", null, false, 6, null), new xZS("main/wc", null, false, 6, null)).iterator();
        while (it4.hasNext()) {
            interfaceC43237rlW.copydefault((xZS) it4.next(), C56392yDr.copydefault(new Function0() { // from class: o.dRt
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C13604dRm.AuCTel();
                }
            }));
        }
        interfaceC43237rlW.copydefault(new xZS("wallet/cefiWalletBinding", null, false, 6, null), C56392yDr.copydefault(new Function0() { // from class: o.dRv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C13604dRm.fJNWhG();
            }
        }));
        interfaceC43237rlW.copydefault(new xZS("wallet/cefiWalletBinding/redirect", null, false, 6, null), C56392yDr.copydefault(new Function0() { // from class: o.dRs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C13604dRm.fIwbmz();
            }
        }));
        java.util.Iterator it5 = yDY.gEmmrt(new xZV("passkeyWallet/escape/execute", null, false, 6, null), new xZV("passkeyWallet/escape/statusPage", null, false, 6, null)).iterator();
        while (it5.hasNext()) {
            interfaceC43237rlW.copydefault((xZV) it5.next(), C56392yDr.copydefault(new Function0() { // from class: o.dRx
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C13604dRm.fARcdN();
                }
            }));
        }
        interfaceC43237rlW.copydefault(new xZZ("wallet/download", null, false, 6, null), C56392yDr.copydefault(new Function0() { // from class: o.dRA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C13604dRm.getFieldNames();
            }
        }));
    }

    public static final dJZ fetchVPNInfo() {
        return new dJZ();
    }

    /* JADX INFO: renamed from: o.dRm$ActionBar */
    public static final class ActionBar implements InterfaceC43233rlS {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC43233rlS
        public java.lang.String OLrzqt() {
            return "tc";
        }

        @Override // o.InterfaceC43233rlS
        public boolean copydefault() {
            return false;
        }

        @Override // o.InterfaceC43233rlS
        public java.util.List<C43240rlZ> AEQbTJ() {
            return InterfaceC43233rlS.Application.copydefault(this);
        }

        @Override // o.InterfaceC43233rlS
        public boolean AYXKKw() {
            return InterfaceC43233rlS.Application.AEQbTJ(this);
        }

        @Override // o.InterfaceC43233rlS
        public boolean EZpvd() {
            return InterfaceC43233rlS.Application.OLrzqt(this);
        }

        @Override // o.InterfaceC43233rlS
        public DeeplinkMode KWHzl() {
            return DeeplinkMode.WALLET;
        }
    }

    public static final dJZ DbNXlk() {
        return new dJZ();
    }

    /* JADX INFO: renamed from: o.dRm$TaskDescription */
    public static final class TaskDescription implements InterfaceC43232rlR {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC43232rlR
        public java.lang.String AEQbTJ() {
            return "join";
        }

        @Override // o.InterfaceC43232rlR
        public boolean EZpvd() {
            return InterfaceC43232rlR.TaskDescription.OLrzqt(this);
        }

        @Override // o.InterfaceC43232rlR
        public boolean KWHzl() {
            return InterfaceC43232rlR.TaskDescription.copydefault(this);
        }

        @Override // o.InterfaceC43232rlR
        public boolean OLrzqt() {
            return InterfaceC43232rlR.TaskDescription.AEQbTJ(this);
        }

        @Override // o.InterfaceC43232rlR
        public DeeplinkMode copydefault() {
            return DeeplinkMode.WALLET;
        }

        @Override // o.InterfaceC43232rlR
        public java.util.List<java.lang.String> djBIcL() {
            return C56402yEa.EZpvd(C48787ucK.AEQbTJ.copydefault("dexReferralV2Config.web3path", "https://web3.okx.com"));
        }
    }

    public static final C13408dKf uzCIH() {
        return new C13408dKf();
    }

    /* JADX INFO: renamed from: o.dRm$Activity */
    public static final class Activity implements InterfaceC43232rlR {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC43232rlR
        public java.lang.String AEQbTJ() {
            return "token";
        }

        @Override // o.InterfaceC43232rlR
        public boolean EZpvd() {
            return InterfaceC43232rlR.TaskDescription.OLrzqt(this);
        }

        @Override // o.InterfaceC43232rlR
        public boolean KWHzl() {
            return InterfaceC43232rlR.TaskDescription.copydefault(this);
        }

        @Override // o.InterfaceC43232rlR
        public boolean OLrzqt() {
            return InterfaceC43232rlR.TaskDescription.AEQbTJ(this);
        }

        @Override // o.InterfaceC43232rlR
        public DeeplinkMode copydefault() {
            return DeeplinkMode.WALLET;
        }

        @Override // o.InterfaceC43232rlR
        public java.util.List<java.lang.String> djBIcL() {
            return C56402yEa.EZpvd(C48787ucK.AEQbTJ.copydefault("dexReferralV2Config.web3path", "https://web3.okx.com"));
        }
    }

    public static final C13411dKi hDKMBd() {
        return new C13411dKi();
    }

    /* JADX INFO: renamed from: o.dRm$StateListAnimator */
    public static final class StateListAnimator implements InterfaceC43232rlR {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC43232rlR
        public java.lang.String AEQbTJ() {
            return "affiliates";
        }

        @Override // o.InterfaceC43232rlR
        public boolean EZpvd() {
            return InterfaceC43232rlR.TaskDescription.OLrzqt(this);
        }

        @Override // o.InterfaceC43232rlR
        public boolean KWHzl() {
            return InterfaceC43232rlR.TaskDescription.copydefault(this);
        }

        @Override // o.InterfaceC43232rlR
        public boolean OLrzqt() {
            return InterfaceC43232rlR.TaskDescription.AEQbTJ(this);
        }

        @Override // o.InterfaceC43232rlR
        public DeeplinkMode copydefault() {
            return DeeplinkMode.WALLET;
        }

        @Override // o.InterfaceC43232rlR
        public java.util.List<java.lang.String> djBIcL() {
            return C56402yEa.EZpvd(C48787ucK.AEQbTJ.copydefault("dexReferralV2Config.web3path", "https://web3.okx.com"));
        }
    }

    public static final C13407dKe iwGUEr() {
        return new C13407dKe();
    }

    public static final dJZ getNewProxyInstance() {
        return new dJZ();
    }

    public static final dJY AuCTelauCTel() {
        return new dJY();
    }

    public static final fAB ejfBZ() {
        return new fAB();
    }

    public static final dJX AuCTel() {
        return new dJX();
    }

    public static final dJO fJNWhG() {
        return new dJO();
    }

    public static final dJV fIwbmz() {
        return new dJV();
    }

    public static final dJM fARcdN() {
        return new dJM();
    }

    public static final C13413dKk getFieldNames() {
        return new C13413dKk();
    }
}
