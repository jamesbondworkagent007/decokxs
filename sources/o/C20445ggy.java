package o;

import androidx.fragment.app.FragmentActivity;
import com.okinc.business.defi.wallet.transaction.moduleModel.bean.DataInputModuleModel;
import com.okinc.localization.util.format.DisplaySign;
import com.okinc.wallet.api.bean.WalletRechargeBean;
import com.okinc.web3Uilib.bean.TransactionTopReminderInfoBean;
import java.math.RoundingMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import o.C52812wZg;
import o.C57406yhn;
import o.InterfaceC54829xWw;
import org.jetbrains.annotations.NotNull;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: renamed from: o.ggy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C20445ggy extends C20446ggz<C9615bYt> {
    public static final StateListAnimator Companion = new StateListAnimator(null);

    /* JADX INFO: renamed from: o.ggy$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.ggy.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final C20445ggy copydefault(android.os.Bundle bundle) {
            C20445ggy c20445ggy = new C20445ggy();
            c20445ggy.setArguments(bundle);
            return c20445ggy;
        }
    }

    /* JADX DEBUG: Possible override for method o.gaF.EZpvd()V */
    @Override // o.AbstractC20080gaD
    public C57429yiJ EZpvd() {
        C57429yiJ c57429yiJEZpvd = super.EZpvd();
        KWHzl(c57429yiJEZpvd);
        return c57429yiJEZpvd;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v7, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public final void KWHzl(C57429yiJ c57429yiJ) {
        if (((C9615bYt) ejfBZ()).dUDNAs().sSMYrx() || ((C9615bYt) ejfBZ()).isConnected() == 0) {
            return;
        }
        c57429yiJ.OLrzqt(((C9615bYt) ejfBZ()).isConnected(), new Function1() { // from class: o.ggC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C20445ggy.OLrzqt(this.KWHzl, ((java.lang.Integer) obj).intValue());
            }
        });
        EZpvd(c57429yiJ);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r2v2, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit OLrzqt(C20445ggy c20445ggy, int i) {
        T tEjfBZ = c20445ggy.ejfBZ();
        C9615bYt c9615bYt = tEjfBZ instanceof C9615bYt ? (C9615bYt) tEjfBZ : null;
        if (c9615bYt != null) {
            c9615bYt.OLrzqt(i);
            ((C9615bYt) c20445ggy.ejfBZ()).EZpvd(2);
        }
        return Unit.INSTANCE;
    }

    public final void EZpvd(C57429yiJ c57429yiJ) {
        if (C17948fYf.copydefault.AEQbTJ()) {
            try {
                final android.view.View viewEZpvd = c57429yiJ.EZpvd();
                viewEZpvd.post(new java.lang.Runnable() { // from class: o.ggB
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // java.lang.Runnable
                    public final void run() {
                        C20445ggy.OLrzqt(this.AEQbTJ, viewEZpvd);
                    }
                });
            } catch (java.lang.Exception unused) {
            }
        }
    }

    public static final void OLrzqt(C20445ggy c20445ggy, android.view.View view) {
        C17948fYf.copydefault.AEQbTJ(false);
        android.content.Context contextRequireContext = c20445ggy.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        C52812wZg c52812wZg = new C52812wZg(contextRequireContext);
        C52812wZg.StateListAnimator stateListAnimator = new C52812wZg.StateListAnimator(view);
        stateListAnimator.EZpvd(3);
        stateListAnimator.OLrzqt(C55298xhM.dpInt$default(10.0f, (android.content.Context) null, 1, (java.lang.Object) null));
        stateListAnimator.KWHzl(C55298xhM.dpInt$default(10.0f, (android.content.Context) null, 1, (java.lang.Object) null));
        stateListAnimator.copydefault(C55298xhM.dpInt$default(10.0f, (android.content.Context) null, 1, (java.lang.Object) null));
        stateListAnimator.AEQbTJ(C55298xhM.dpInt$default(10.0f, (android.content.Context) null, 1, (java.lang.Object) null));
        stateListAnimator.AEQbTJ(C55298xhM.dp2pxFloat$default(8.0f, null, 1, null));
        stateListAnimator.AEQbTJ(C33070mpX.AYXKKw(C57406yhn.ActionBar.gEmmrt));
        stateListAnimator.OLrzqt(C33070mpX.AYXKKw(C57406yhn.ActionBar.valueOf));
        c52812wZg.AEQbTJ(stateListAnimator);
        c52812wZg.OLrzqt(2);
        c52812wZg.KWHzl(true);
        c52812wZg.fARcdN();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r1v13, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r1v16, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r1v19, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r1v5, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r1v9, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r2v11, resolved type: Fee */
    /* JADX DEBUG: Multi-variable search result rejected for r2v18, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r2v25, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r2v3, resolved type: Fee */
    /* JADX DEBUG: Multi-variable search result rejected for r2v9, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r3v11, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r3v17, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r3v6, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.C20446ggz, o.AbstractC20080gaD, o.AbstractC20082gaF
    public void copydefault(@NotNull java.util.Collection<? extends AbstractC9832bcy> collection) {
        Intrinsics.checkNotNullParameter(collection, "");
        if (((C9615bYt) ejfBZ()).UlJrfe().AEQbTJ(C56524yIo.AEQbTJ(C9879bds.class))) {
            KWHzl(new TransactionTopReminderInfoBean((java.lang.String) null, C33069mpW.copydefault(C13754dXa.FragmentManager.reopenMenu, C56424yEw.gEmmrt(C56390yDp.OLrzqt(DataInputModuleModel.DataInputItem.INPUT_TYPE_NUMBER, C33129mqd.gEmmrt(((C9615bYt) ejfBZ()).OLrzqt(true, false))), C56390yDp.OLrzqt("token", ((C9615bYt) ejfBZ()).dHguZz().fJNWhG()))), (java.lang.CharSequence) null, (Function0) null, (java.lang.CharSequence) null, (Function0) null, 61, (DefaultConstructorMarker) null));
            return;
        }
        if (((C9615bYt) ejfBZ()).UlJrfe().AEQbTJ(C56524yIo.AEQbTJ(C9878bdr.class))) {
            KWHzl(new TransactionTopReminderInfoBean((java.lang.String) null, C33069mpW.copydefault(C13754dXa.FragmentManager.onKeyDownPanel, C56424yEw.gEmmrt(C56390yDp.OLrzqt(DataInputModuleModel.DataInputItem.INPUT_TYPE_NUMBER, C33129mqd.gEmmrt(((C9615bYt) ejfBZ()).copydefault(true, false))), C56390yDp.OLrzqt("token", ((C9615bYt) ejfBZ()).dHguZz().fJNWhG()))), (java.lang.CharSequence) null, (Function0) null, (java.lang.CharSequence) null, (Function0) null, 61, (DefaultConstructorMarker) null));
        } else if (((C9615bYt) ejfBZ()).UlJrfe().AEQbTJ(C56524yIo.AEQbTJ(C9880bdt.class))) {
            KWHzl(new TransactionTopReminderInfoBean((java.lang.String) null, C33069mpW.copydefault(C13754dXa.FragmentManager.initializePanelMenu, C56424yEw.gEmmrt(C56390yDp.OLrzqt(DataInputModuleModel.DataInputItem.INPUT_TYPE_NUMBER, C54870xYj.KWHzl(C54862xYb.convertToBigIntegerString$default(((C9615bYt) ejfBZ()).EZpvd(((C9592bYW) ((C9615bYt) ejfBZ()).QKudOq()).KWHzl().getFeeAmount()), false, (RoundingMode) null, 3, (java.lang.Object) null), ((C9615bYt) ejfBZ()).dHguZz().valueOf(), ((C9615bYt) ejfBZ()).dHguZz().fZBcTu(), null, (CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA & 8) != 0 ? DisplaySign.AUTO : null, (CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA & 16) != 0 ? false : false, (CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA & 32) != 0 ? null : null, (CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA & 64) != 0 ? false : false, (CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA & 128) != 0 ? RoundingMode.DOWN : null)), C56390yDp.OLrzqt("token", ((C9615bYt) ejfBZ()).dHguZz().fJNWhG()))), C33069mpW.copydefault(C13754dXa.FragmentManager.AudioAttributesImplApi21Parcelizer, C56423yEv.EZpvd(C56390yDp.OLrzqt("token", ((C9592bYW) ((C9615bYt) ejfBZ()).QKudOq()).KWHzl().getFeeCoinMeta().fJNWhG()))), new Function0() { // from class: o.ggA
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C20445ggy.KWHzl(this.copydefault);
                }
            }, (java.lang.CharSequence) null, (Function0) null, 49, (DefaultConstructorMarker) null));
        } else {
            super.copydefault(collection);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: Fee */
    /* JADX DEBUG: Multi-variable search result rejected for r0v9, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit KWHzl(C20445ggy c20445ggy) {
        C10854bwM feeCoinMeta = ((C9592bYW) ((C9615bYt) c20445ggy.ejfBZ()).QKudOq()).KWHzl().getFeeCoinMeta();
        InterfaceC54829xWw interfaceC54829xWw = (InterfaceC54829xWw) C43251rlk.copydefault(InterfaceC54829xWw.class);
        FragmentActivity activity = c20445ggy.getActivity();
        AbstractActivityC33041mov abstractActivityC33041mov = activity instanceof AbstractActivityC33041mov ? (AbstractActivityC33041mov) activity : null;
        if (abstractActivityC33041mov != null) {
            InterfaceC54829xWw.ActionBar.showRechargeDialog$default(interfaceC54829xWw, abstractActivityC33041mov, new WalletRechargeBean(C33129mqd.gEmmrt(java.lang.Long.valueOf(feeCoinMeta.fetchVPNInfo())), C33129mqd.gEmmrt(feeCoinMeta.OLrzqt()), "wallet", "balance", yDY.copydefault("gas_station"), (java.util.ArrayList) null, false, (java.lang.String) null, ((C9615bYt) c20445ggy.ejfBZ()).fERRXa().getAddressType(), 224, (DefaultConstructorMarker) null), 0, null, 12, null);
            return Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }
}
