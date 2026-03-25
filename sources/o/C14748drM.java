package o;

import com.okinc.business.defi.biz.walletconnect.ShowWCAuthRequestArgs;
import com.okinc.business.defi.biz.walletconnect.WCSessionMeta;
import com.okinc.business.defi.wallet.common.WalletConnectUtils;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.C12827cuN;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.drM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C14748drM {
    public static Function2<? super java.lang.String, ? super java.lang.String, Unit> AEQbTJ;
    public static final C14748drM KWHzl = new C14748drM();
    public static java.lang.String OLrzqt = "";
    public static final Application copydefault = new Application();
    public static final int EZpvd = 8;

    private C14748drM() {
    }

    public final android.app.Activity EZpvd() {
        return C54819xWm.KWHzl().AEQbTJ();
    }

    public static final void copydefault(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public final void EZpvd(@NotNull final java.lang.String str, Function2<? super java.lang.String, ? super java.lang.String, Unit> function2) {
        Intrinsics.checkNotNullParameter(str, "");
        OLrzqt = str;
        AEQbTJ = function2;
        AbstractC58260yxt<AbstractC12782ctV> abstractC58260yxtCopydefault = C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).copydefault(false);
        final Function1 function1 = new Function1() { // from class: o.drR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C14748drM.OLrzqt(str, (AbstractC12782ctV) obj);
            }
        };
        InterfaceC58227yxM<? super AbstractC12782ctV> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.drQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C14748drM.copydefault(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.drO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C14748drM.AEQbTJ((java.lang.Throwable) obj);
            }
        };
        abstractC58260yxtCopydefault.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.drN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C14748drM.KWHzl(function12, obj);
            }
        });
    }

    public static final Unit OLrzqt(final java.lang.String str, AbstractC12782ctV abstractC12782ctV) {
        WalletConnectUtils instance$default = WalletConnectUtils.ActionBar.getInstance$default(WalletConnectUtils.Companion, null, 1, null);
        Intrinsics.copydefault(abstractC12782ctV);
        instance$default.KWHzl(str, abstractC12782ctV, (java.lang.String) null, new yHO() { // from class: o.drP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHO
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return C14748drM.copydefault(str, ((java.lang.Boolean) obj).booleanValue(), ((java.lang.Integer) obj2).intValue(), (java.lang.String) obj3);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(java.lang.String str, boolean z, int i, java.lang.String str2) {
        if (z) {
            try {
                android.app.Activity activityEZpvd = KWHzl.EZpvd();
                AbstractActivityC33041mov abstractActivityC33041mov = activityEZpvd instanceof AbstractActivityC33041mov ? (AbstractActivityC33041mov) activityEZpvd : null;
                if (abstractActivityC33041mov != null) {
                    abstractActivityC33041mov.showLoading();
                }
            } catch (java.lang.Exception e) {
                pUU.AEQbTJ("DappWalletConnectUtil", "jumpUrl - Failed to showLoading", e);
            }
            WalletConnectUtils.ActionBar.getInstance$default(WalletConnectUtils.Companion, null, 1, null).AEQbTJ(copydefault);
        } else if (i == 4) {
            KWHzl.copydefault(str);
        }
        if (C33129mqd.OLrzqt((java.lang.CharSequence) str2) && str2 != null) {
            C33134mqi.copydefault(str2, 17, 0, 0);
        }
        return Unit.INSTANCE;
    }

    public static final void KWHzl(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(java.lang.Throwable th) {
        java.lang.String message = th.getMessage();
        if (message != null) {
            C33134mqi.copydefault(message, 17, 0, 0);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.drM$Application */
    public static final class Application implements WalletConnectUtils.StateListAnimator {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.business.defi.wallet.common.WalletConnectUtils.StateListAnimator
        public void AEQbTJ(java.lang.String str, java.lang.String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.business.defi.wallet.common.WalletConnectUtils.StateListAnimator
        public void KWHzl(java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
        }

        @Override // com.okinc.business.defi.wallet.common.WalletConnectUtils.StateListAnimator
        public void KWHzl(java.lang.String str, java.lang.String str2) {
            WalletConnectUtils.StateListAnimator.Activity.EZpvd(this, str, str2);
        }

        @Override // com.okinc.business.defi.wallet.common.WalletConnectUtils.StateListAnimator
        public void copydefault(java.lang.String str, java.lang.String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            WalletConnectUtils.StateListAnimator.Activity.copydefault(this, str, str2);
            try {
                android.app.Activity activityEZpvd = C14748drM.KWHzl.EZpvd();
                AbstractActivityC33041mov abstractActivityC33041mov = activityEZpvd instanceof AbstractActivityC33041mov ? (AbstractActivityC33041mov) activityEZpvd : null;
                if (abstractActivityC33041mov != null) {
                    abstractActivityC33041mov.dismissLoading();
                }
            } catch (java.lang.Exception e) {
                pUU.AEQbTJ("DappWalletConnectUtil", "onConnect - Failed to dismissLoading", e);
            }
            C14748drM.KWHzl.copydefault(str, str2);
        }

        @Override // com.okinc.business.defi.wallet.common.WalletConnectUtils.StateListAnimator
        public void AEQbTJ(ShowWCAuthRequestArgs showWCAuthRequestArgs) {
            Intrinsics.checkNotNullParameter(showWCAuthRequestArgs, "");
            android.app.Activity activityEZpvd = C14748drM.KWHzl.EZpvd();
            if (activityEZpvd != null) {
                WalletConnectUtils.ActionBar actionBar = WalletConnectUtils.Companion;
                WalletConnectUtils.ActionBar.getInstance$default(actionBar, null, 1, null).copydefault(activityEZpvd, showWCAuthRequestArgs);
                WalletConnectUtils.ActionBar.getInstance$default(actionBar, null, 1, null).copydefault(this);
            }
        }

        @Override // com.okinc.business.defi.wallet.common.WalletConnectUtils.StateListAnimator
        public void OLrzqt(java.lang.String str, java.lang.String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Function2 function2 = C14748drM.AEQbTJ;
            if (function2 != null) {
                function2.invoke(str2, WalletConnectUtils.ActionBar.getInstance$default(WalletConnectUtils.Companion, null, 1, null).djBIcL(str));
            }
            WalletConnectUtils.ActionBar.getInstance$default(WalletConnectUtils.Companion, null, 1, null).copydefault(this);
        }

        @Override // com.okinc.business.defi.wallet.common.WalletConnectUtils.StateListAnimator
        public void OLrzqt(java.lang.String str) {
            try {
                android.app.Activity activityEZpvd = C14748drM.KWHzl.EZpvd();
                AbstractActivityC33041mov abstractActivityC33041mov = activityEZpvd instanceof AbstractActivityC33041mov ? (AbstractActivityC33041mov) activityEZpvd : null;
                if (abstractActivityC33041mov != null) {
                    abstractActivityC33041mov.dismissLoading();
                }
            } catch (java.lang.Exception e) {
                pUU.AEQbTJ("DappWalletConnectUtil", "onFail - Failed to dismissLoading", e);
            }
            WalletConnectUtils.ActionBar.getInstance$default(WalletConnectUtils.Companion, null, 1, null).copydefault(this);
        }

        @Override // com.okinc.business.defi.wallet.common.WalletConnectUtils.StateListAnimator
        public void KWHzl(java.lang.String str, boolean z) {
            Intrinsics.checkNotNullParameter(str, "");
            try {
                android.app.Activity activityEZpvd = C14748drM.KWHzl.EZpvd();
                AbstractActivityC33041mov abstractActivityC33041mov = activityEZpvd instanceof AbstractActivityC33041mov ? (AbstractActivityC33041mov) activityEZpvd : null;
                if (abstractActivityC33041mov != null) {
                    abstractActivityC33041mov.dismissLoading();
                }
            } catch (java.lang.Exception e) {
                pUU.AEQbTJ("DappWalletConnectUtil", "onDisConnect - Failed to dismissLoading", e);
            }
            WalletConnectUtils.ActionBar.getInstance$default(WalletConnectUtils.Companion, null, 1, null).copydefault(this);
        }
    }

    public final void copydefault(java.lang.Integer num, int i, java.lang.String str, java.lang.String str2) {
        C18355fgo c18355fgo = C18355fgo.KWHzl;
        android.app.Activity activityEZpvd = EZpvd();
        if (activityEZpvd == null) {
            return;
        }
        c18355fgo.EZpvd(activityEZpvd, num != null ? num.intValue() : 0, i, str, str2);
    }

    public final void copydefault(java.lang.String str, java.lang.String str2) {
        copydefault((java.lang.Integer) 0, 0, str, str2);
    }

    public final void copydefault(java.lang.String str) {
        java.lang.String topic;
        java.lang.String walletId;
        WCSessionMeta wCSessionMetaIsConnected = WalletConnectUtils.ActionBar.getInstance$default(WalletConnectUtils.Companion, null, 1, null).isConnected(str);
        java.lang.String str2 = "";
        if (wCSessionMetaIsConnected == null || (topic = wCSessionMetaIsConnected.getTopic()) == null) {
            topic = "";
        }
        if (wCSessionMetaIsConnected != null && (walletId = wCSessionMetaIsConnected.getWalletId()) != null) {
            str2 = walletId;
        }
        copydefault((java.lang.Integer) null, 3, topic, str2);
    }
}
