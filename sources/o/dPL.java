package o;

import androidx.fragment.app.FragmentActivity;
import com.okinc.business.defi.biz.constant.WalletType;
import com.okinc.wallet.api.bean.EnterWalletMainBean;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C12827cuN;
import o.C13754dXa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class dPL extends AbstractC57329ygP {

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
        C11607cUn.OLrzqt(C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).copydefault(false), (Function1<? super java.lang.Throwable, Unit>) new Function1() { // from class: o.dPQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return dPL.copydefault(interfaceC57336ygW, message, (java.lang.Throwable) obj);
            }
        }, new Function1() { // from class: o.dPS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return dPL.EZpvd(this.OLrzqt, message, interfaceC57336ygW, (AbstractC12782ctV) obj);
            }
        });
    }

    public static final Unit copydefault(InterfaceC57336ygW interfaceC57336ygW, com.okinc.jsbridge.Message message, java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        interfaceC57336ygW.copydefault(message, "fail");
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(dPL dpl, com.okinc.jsbridge.Message message, InterfaceC57336ygW interfaceC57336ygW, AbstractC12782ctV abstractC12782ctV) {
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        if (abstractC12782ctV.QwvEab() == WalletType.TrackingWallet || abstractC12782ctV.QwvEab() == WalletType.DemoWallet) {
            dpl.KWHzl(message, interfaceC57336ygW);
        } else if (!abstractC12782ctV.zLjUOn()) {
            android.content.Context contextAEQbTJ = interfaceC57336ygW.AEQbTJ();
            if (contextAEQbTJ instanceof AbstractActivityC33041mov) {
                C55326xho.toast$default(((AbstractActivityC33041mov) contextAEQbTJ).getString(C13754dXa.FragmentManager.HJWChPdIKEqB), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) 17, 0, 0, 27, (java.lang.Object) null);
            } else {
                interfaceC57336ygW.copydefault(message, "fail");
            }
        } else {
            dpl.EZpvd(abstractC12782ctV.DbNXlk(), message, interfaceC57336ygW);
        }
        return Unit.INSTANCE;
    }

    public final void EZpvd(java.lang.String str, com.okinc.jsbridge.Message message, InterfaceC57336ygW interfaceC57336ygW) {
        final android.content.Context contextAEQbTJ = interfaceC57336ygW.AEQbTJ();
        if (contextAEQbTJ instanceof AbstractActivityC33041mov) {
            ((AbstractActivityC33041mov) contextAEQbTJ).getIntent().putExtra("ITransferActivity", true);
            interfaceC57336ygW.OLrzqt(message, C12764ctD.OLrzqt.AEQbTJ(C56423yEv.EZpvd(C56390yDp.OLrzqt("result", 3))));
            C20690gle.OLrzqt.KWHzl((106 & 1) != 0 ? null : null, (106 & 2) != 0 ? null : (FragmentActivity) contextAEQbTJ, str, (106 & 8) != 0 ? null : null, "", (106 & 32) != 0 ? null : null, (106 & 64) != 0 ? false : false, (106 & 128) != 0 ? null : new Function1() { // from class: o.dPP
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return dPL.OLrzqt(contextAEQbTJ, (android.os.Bundle) obj);
                }
            });
            return;
        }
        interfaceC57336ygW.copydefault(message, "fail");
    }

    public static final Unit OLrzqt(android.content.Context context, android.os.Bundle bundle) {
        if (bundle != null && bundle.getBoolean("send_coin_status", false)) {
            dZK.AEQbTJ.AEQbTJ((android.app.Activity) context, new EnterWalletMainBean((java.lang.Boolean) null, (java.lang.String) null, (java.lang.Integer) null, (java.lang.String) null, false, false, (com.okinc.wallet.api.bean.ScanResult) null, 127, (DefaultConstructorMarker) null));
        }
        return Unit.INSTANCE;
    }

    public final void KWHzl(final com.okinc.jsbridge.Message message, final InterfaceC57336ygW interfaceC57336ygW) {
        final android.content.Context contextAEQbTJ = interfaceC57336ygW.AEQbTJ();
        if (contextAEQbTJ instanceof AbstractActivityC33041mov) {
            C14140dfo c14140dfoGHZMYf = C13458dMb.EZpvd(contextAEQbTJ).gHZMYf();
            androidx.fragment.app.FragmentManager supportFragmentManager = ((AbstractActivityC33041mov) contextAEQbTJ).getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
            C14140dfo.showConnectWalletDialog$default(c14140dfoGHZMYf, supportFragmentManager, true, new Activity(), 0, new InterfaceC54856xXw() { // from class: o.dPR
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC54856xXw
                public final void OLrzqt(android.os.Bundle bundle) {
                    dPL.OLrzqt(interfaceC57336ygW, message, contextAEQbTJ, bundle);
                }
            }, 8, null);
            return;
        }
        interfaceC57336ygW.copydefault(message, "fail");
    }

    public static final void OLrzqt(InterfaceC57336ygW interfaceC57336ygW, com.okinc.jsbridge.Message message, android.content.Context context, android.os.Bundle bundle) {
        if (Intrinsics.EZpvd(bundle != null ? java.lang.Boolean.valueOf(bundle.getBoolean("result", false)) : null, java.lang.Boolean.TRUE)) {
            interfaceC57336ygW.OLrzqt(message, C12764ctD.OLrzqt.AEQbTJ(C56423yEv.EZpvd(C56390yDp.OLrzqt("result", 1))));
            dZK.AEQbTJ.AEQbTJ((android.app.Activity) context, new EnterWalletMainBean((java.lang.Boolean) null, (java.lang.String) null, (java.lang.Integer) null, (java.lang.String) null, false, false, (com.okinc.wallet.api.bean.ScanResult) null, 127, (DefaultConstructorMarker) null));
        } else {
            interfaceC57336ygW.OLrzqt(message, C12764ctD.OLrzqt.AEQbTJ(C56423yEv.EZpvd(C56390yDp.OLrzqt("result", 2))));
        }
    }

    @Override // o.AbstractC57329ygP
    public java.util.Set<java.lang.String> getSupportJSMethods() {
        return yEE.AhwBna("navigateToTransferPage", "web3/wallet/js/navigateToTransferPage");
    }
}
