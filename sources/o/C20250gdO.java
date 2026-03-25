package o;

import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.okinc.business.defi.api.bean.ReserveBean;
import com.okinc.business.defi.biz.core.error.CoinMetaError;
import com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction;
import com.okinc.business.defi.wallet.transaction.moduleModel.bean.DataInputModuleModel;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.localization.util.format.DisplaySign;
import com.okinc.wallet.api.bean.WalletRechargeBean;
import com.okinc.wallet.api.bean.WalletRechargeResult;
import com.okinc.web3Uilib.bean.TransactionTopReminderInfoBean;
import java.math.RoundingMode;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC8601bFm;
import o.C13754dXa;
import org.jetbrains.annotations.NotNull;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: renamed from: o.gdO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public class C20250gdO<T extends AbstractC8601bFm<?, ?>> extends AbstractC20238gdC<T> {
    public Function0<Unit> getFieldNames;
    public InterfaceC58217yxC uzCIH;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(@NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        this.getFieldNames = function0;
    }

    @Override // o.AbstractC20082gaF, o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.initView(view, bundle);
        if (ejfBZ().aUsmxb() == OKWBaseTransaction.TransactionType.DappTransfer && C33129mqd.OLrzqt((java.lang.CharSequence) ejfBZ().RlQdEF())) {
            OLrzqt(ejfBZ().RlQdEF());
        }
    }

    @Override // o.AbstractC20238gdC, o.AbstractC20237gdB, o.AbstractC20082gaF
    public void copydefault(@NotNull java.util.Collection<? extends AbstractC9832bcy> collection) throws CoinMetaError {
        java.lang.String strCopydefault;
        java.lang.String str;
        C10854bwM c10854bwMDHguZz;
        C10854bwM c10854bwMDHguZz2;
        strCopydefault = "";
        Intrinsics.checkNotNullParameter(collection, "");
        final AbstractC9832bcy abstractC9832bcy = (AbstractC9832bcy) CollectionsKt___CollectionsKt.RcXXUw(collection);
        boolean z = abstractC9832bcy instanceof C9786bcE;
        if (z || (abstractC9832bcy instanceof C9784bcC)) {
            final C10854bwM c10854bwMAYXKKw = ejfBZ().QKudOq().AYXKKw();
            Function0 function0 = new Function0() { // from class: o.gdP
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C20250gdO.copydefault(this.KWHzl, c10854bwMAYXKKw);
                }
            };
            if (z) {
                KWHzl(new TransactionTopReminderInfoBean((java.lang.String) null, C33069mpW.copydefault(C13754dXa.FragmentManager.apLTlu, C56423yEv.EZpvd(C56390yDp.OLrzqt("symbol", c10854bwMAYXKKw.fJNWhG()))), C33069mpW.copydefault(C13754dXa.FragmentManager.AudioAttributesImplApi21Parcelizer, C56423yEv.EZpvd(C56390yDp.OLrzqt("token", c10854bwMAYXKKw.fJNWhG()))), function0, C33069mpW.copydefault(C13754dXa.FragmentManager.iMXFZQ, C56423yEv.EZpvd(C56390yDp.OLrzqt("symbol", c10854bwMAYXKKw.fJNWhG()))), new Function0() { // from class: o.gdR
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return C20250gdO.KWHzl(this.OLrzqt, c10854bwMAYXKKw, abstractC9832bcy);
                    }
                }, 1, (DefaultConstructorMarker) null));
                return;
            }
            if (abstractC9832bcy instanceof C9784bcC) {
                C8486bDd c8486bDdKWHzl = ejfBZ().QKudOq().KWHzl();
                java.lang.String strFJNWhG = c8486bDdKWHzl.getFeeCoinMeta().fJNWhG();
                C9784bcC c9784bcC = (C9784bcC) abstractC9832bcy;
                java.lang.String strCopydefault2 = c9784bcC.copydefault();
                if (strCopydefault2 == null || strCopydefault2.length() == 0) {
                    if (!(c8486bDdKWHzl instanceof C9215bRQ)) {
                        strCopydefault = C33069mpW.copydefault(C13754dXa.FragmentManager.onFitSystemWindows, C56423yEv.EZpvd(C56390yDp.OLrzqt("symbol", strFJNWhG)));
                    } else {
                        strCopydefault = C33069mpW.copydefault(C13754dXa.FragmentManager.invokespecialODCBUN, C56423yEv.EZpvd(C56390yDp.OLrzqt("symbol", strFJNWhG)));
                    }
                } else {
                    java.lang.String strCopydefault3 = c9784bcC.copydefault();
                    if (strCopydefault3 != null) {
                        str = strCopydefault3;
                    }
                    KWHzl(new TransactionTopReminderInfoBean((java.lang.String) null, str, C33069mpW.copydefault(C13754dXa.FragmentManager.AudioAttributesImplApi21Parcelizer, C56423yEv.EZpvd(C56390yDp.OLrzqt("token", c10854bwMAYXKKw.fJNWhG()))), function0, (java.lang.CharSequence) null, (Function0) null, 49, (DefaultConstructorMarker) null));
                    return;
                }
                str = strCopydefault;
                KWHzl(new TransactionTopReminderInfoBean((java.lang.String) null, str, C33069mpW.copydefault(C13754dXa.FragmentManager.AudioAttributesImplApi21Parcelizer, C56423yEv.EZpvd(C56390yDp.OLrzqt("token", c10854bwMAYXKKw.fJNWhG()))), function0, (java.lang.CharSequence) null, (Function0) null, 49, (DefaultConstructorMarker) null));
                return;
            }
            return;
        }
        if (abstractC9832bcy instanceof C9808bca) {
            KWHzl(new TransactionTopReminderInfoBean((java.lang.String) null, C33070mpX.AYXKKw(C13754dXa.FragmentManager.DQYQgr), C33070mpX.AYXKKw(C13754dXa.FragmentManager.ggKfIT), new Function0() { // from class: o.gdW
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C20250gdO.EZpvd(this.copydefault);
                }
            }, (java.lang.CharSequence) null, (Function0) null, 49, (DefaultConstructorMarker) null));
            return;
        }
        java.lang.String strFJNWhG2 = null;
        if (abstractC9832bcy instanceof C9879bds) {
            int i = C13754dXa.FragmentManager.reopenMenu;
            kotlin.Pair[] pairArr = new kotlin.Pair[2];
            T tEjfBZ = ejfBZ();
            InterfaceC9462bVz interfaceC9462bVz = tEjfBZ instanceof InterfaceC9462bVz ? (InterfaceC9462bVz) tEjfBZ : null;
            java.lang.String strOLrzqt = interfaceC9462bVz != null ? interfaceC9462bVz.OLrzqt(true, false) : null;
            if (strOLrzqt == null) {
                strOLrzqt = "";
            }
            pairArr[0] = C56390yDp.OLrzqt(DataInputModuleModel.DataInputItem.INPUT_TYPE_NUMBER, strOLrzqt);
            T tEjfBZ2 = ejfBZ();
            InterfaceC9462bVz interfaceC9462bVz2 = tEjfBZ2 instanceof InterfaceC9462bVz ? (InterfaceC9462bVz) tEjfBZ2 : null;
            if (interfaceC9462bVz2 != null && (c10854bwMDHguZz2 = interfaceC9462bVz2.dHguZz()) != null) {
                strFJNWhG2 = c10854bwMDHguZz2.fJNWhG();
            }
            pairArr[1] = C56390yDp.OLrzqt("token", strFJNWhG2 != null ? strFJNWhG2 : "");
            KWHzl(new TransactionTopReminderInfoBean((java.lang.String) null, C33069mpW.copydefault(i, C56424yEw.gEmmrt(pairArr)), (java.lang.CharSequence) null, (Function0) null, (java.lang.CharSequence) null, (Function0) null, 61, (DefaultConstructorMarker) null));
            return;
        }
        if (abstractC9832bcy instanceof C9878bdr) {
            int i2 = C13754dXa.FragmentManager.onKeyDownPanel;
            kotlin.Pair[] pairArr2 = new kotlin.Pair[2];
            T tEjfBZ3 = ejfBZ();
            InterfaceC9462bVz interfaceC9462bVz3 = tEjfBZ3 instanceof InterfaceC9462bVz ? (InterfaceC9462bVz) tEjfBZ3 : null;
            java.lang.String strCopydefault4 = interfaceC9462bVz3 != null ? interfaceC9462bVz3.copydefault(true, false) : null;
            if (strCopydefault4 == null) {
                strCopydefault4 = "";
            }
            pairArr2[0] = C56390yDp.OLrzqt(DataInputModuleModel.DataInputItem.INPUT_TYPE_NUMBER, strCopydefault4);
            T tEjfBZ4 = ejfBZ();
            InterfaceC9462bVz interfaceC9462bVz4 = tEjfBZ4 instanceof InterfaceC9462bVz ? (InterfaceC9462bVz) tEjfBZ4 : null;
            if (interfaceC9462bVz4 != null && (c10854bwMDHguZz = interfaceC9462bVz4.dHguZz()) != null) {
                strFJNWhG2 = c10854bwMDHguZz.fJNWhG();
            }
            pairArr2[1] = C56390yDp.OLrzqt("token", strFJNWhG2 != null ? strFJNWhG2 : "");
            KWHzl(new TransactionTopReminderInfoBean((java.lang.String) null, C33069mpW.copydefault(i2, C56424yEw.gEmmrt(pairArr2)), (java.lang.CharSequence) null, (Function0) null, (java.lang.CharSequence) null, (Function0) null, 61, (DefaultConstructorMarker) null));
            return;
        }
        if (abstractC9832bcy instanceof C9880bdt) {
            T tEjfBZ5 = ejfBZ();
            InterfaceC9462bVz interfaceC9462bVz5 = tEjfBZ5 instanceof InterfaceC9462bVz ? (InterfaceC9462bVz) tEjfBZ5 : null;
            KWHzl(new TransactionTopReminderInfoBean((java.lang.String) null, C33069mpW.copydefault(C13754dXa.FragmentManager.initializePanelMenu, C56424yEw.gEmmrt(C56390yDp.OLrzqt("token", ejfBZ().dHguZz().fJNWhG()), C56390yDp.OLrzqt(DataInputModuleModel.DataInputItem.INPUT_TYPE_NUMBER, C54870xYj.KWHzl(C54862xYb.convertToBigIntegerString$default(interfaceC9462bVz5 != null ? interfaceC9462bVz5.EZpvd(ejfBZ().QKudOq().KWHzl().getFeeAmount()) : null, false, (RoundingMode) null, 3, (java.lang.Object) null), ejfBZ().dHguZz().valueOf(), ejfBZ().dHguZz().fZBcTu(), null, (CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA & 8) != 0 ? DisplaySign.AUTO : null, (CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA & 16) != 0 ? false : false, (CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA & 32) != 0 ? null : null, (CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA & 64) != 0 ? false : false, (CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA & 128) != 0 ? RoundingMode.DOWN : null)))), C33069mpW.copydefault(C13754dXa.FragmentManager.AudioAttributesImplApi21Parcelizer, C56423yEv.EZpvd(C56390yDp.OLrzqt("token", ejfBZ().QKudOq().AYXKKw().fJNWhG()))), new Function0() { // from class: o.gdX
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C20250gdO.KWHzl(this.KWHzl);
                }
            }, (java.lang.CharSequence) null, (Function0) null, 49, (DefaultConstructorMarker) null));
            return;
        }
        super.copydefault(collection);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v6, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit copydefault(final C20250gdO c20250gdO, C10854bwM c10854bwM) {
        c20250gdO.gHZMYf();
        InterfaceC54829xWw interfaceC54829xWw = (InterfaceC54829xWw) C43251rlk.copydefault(InterfaceC54829xWw.class);
        FragmentActivity activity = c20250gdO.getActivity();
        AbstractActivityC33041mov abstractActivityC33041mov = activity instanceof AbstractActivityC33041mov ? (AbstractActivityC33041mov) activity : null;
        if (abstractActivityC33041mov == null) {
            return Unit.INSTANCE;
        }
        interfaceC54829xWw.EZpvd(abstractActivityC33041mov, new WalletRechargeBean(C33129mqd.gEmmrt(java.lang.Long.valueOf(c10854bwM.fetchVPNInfo())), C33129mqd.gEmmrt(c10854bwM.OLrzqt()), "wallet", "gas", yDY.copydefault("dex"), (java.util.ArrayList) null, false, (java.lang.String) null, ((AbstractC8601bFm) c20250gdO.ejfBZ()).fERRXa().getAddressType(), 224, (DefaultConstructorMarker) null), C13754dXa.LoaderManager.AuCTel, new Function1() { // from class: o.gec
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C20250gdO.OLrzqt(this.KWHzl, (WalletRechargeResult) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(C20250gdO c20250gdO, WalletRechargeResult walletRechargeResult) {
        FragmentActivity activity;
        Intrinsics.checkNotNullParameter(walletRechargeResult, "");
        if (walletRechargeResult.isSubmit() && (activity = c20250gdO.getActivity()) != null) {
            activity.finish();
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit KWHzl(final C20250gdO c20250gdO, final C10854bwM c10854bwM, final AbstractC9832bcy abstractC9832bcy) {
        c20250gdO.showLoading();
        InterfaceC58217yxC interfaceC58217yxC = c20250gdO.uzCIH;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        AbstractC58260yxt<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58260yxtEZpvd = ((AbstractC8601bFm) c20250gdO.ejfBZ()).aj_().EZpvd(new ReserveBean(c10854bwM.AuCTel(), c10854bwM.OLrzqt(), ((C9786bcE) abstractC9832bcy).OLrzqt(), c10854bwM.valueOf()));
        LifecycleOwner viewLifecycleOwner = c20250gdO.getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        AbstractC58260yxt abstractC58260yxtAEQbTJ = C58156yvv.AEQbTJ(abstractC58260yxtEZpvd, viewLifecycleOwner, Lifecycle.Event.ON_DESTROY);
        final Function1 function1 = new Function1() { // from class: o.gea
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C20250gdO.OLrzqt(this.OLrzqt, abstractC9832bcy, c10854bwM, (kotlin.Pair) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.gdY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C20250gdO.AYXKKw(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.gdQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C20250gdO.AEQbTJ(this.KWHzl, (java.lang.Throwable) obj);
            }
        };
        c20250gdO.uzCIH = abstractC58260yxtAEQbTJ.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.gdS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C20250gdO.djBIcL(function12, obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final void AYXKKw(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r11v4, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [o.bCW] */
    public static final Unit OLrzqt(C20250gdO c20250gdO, AbstractC9832bcy abstractC9832bcy, C10854bwM c10854bwM, kotlin.Pair pair) {
        c20250gdO.dismissLoading();
        if (((java.lang.Boolean) pair.getFirst()).booleanValue()) {
            c20250gdO.OLrzqt();
            FragmentActivity activity = c20250gdO.getActivity();
            if (activity == null) {
                return Unit.INSTANCE;
            }
            C55097xdX c55097xdX = new C55097xdX(activity, null, 0, 4, null);
            c55097xdX.setTitle(C33069mpW.copydefault(C13754dXa.FragmentManager.DtnWsU, C56424yEw.gEmmrt(C56390yDp.OLrzqt("value", AbstractC8426bCW.formatToFeeCoinAmount$default(((AbstractC8601bFm) c20250gdO.ejfBZ()).QKudOq(), ((C9786bcE) abstractC9832bcy).AEQbTJ(), false, false, false, 10, null)), C56390yDp.OLrzqt("symbol", c10854bwM.fJNWhG()))));
            c55097xdX.setState(2);
            c55097xdX.setType(1);
            c55097xdX.setCloseBtnShow(false);
            c55097xdX.setMessage(null);
            C57656ymY.showNotificationViewWithToast$default(C57656ymY.OLrzqt, c55097xdX, 3000L, 0, 0, 0, 28, null);
        } else {
            java.lang.String str = (java.lang.String) pair.getSecond();
            if (str != null) {
                C55326xho.toastWithFailedIcon$default(str, 0, 1, (java.lang.Object) null);
            }
        }
        return Unit.INSTANCE;
    }

    public static final void djBIcL(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(C20250gdO c20250gdO, java.lang.Throwable th) {
        if (c20250gdO.getViewLifecycleOwner().getLifecycle().getCurrentState() == Lifecycle.State.DESTROYED) {
            return Unit.INSTANCE;
        }
        c20250gdO.dismissLoading();
        Intrinsics.copydefault(th);
        C10857bwP.copydefault("ContractFragment", th);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit EZpvd(C20250gdO c20250gdO) {
        DialogInterfaceOnKeyListenerC14659dpd dialogInterfaceOnKeyListenerC14659dpdCopydefault = DialogInterfaceOnKeyListenerC14659dpd.Companion.copydefault(0.92f);
        dialogInterfaceOnKeyListenerC14659dpdCopydefault.KWHzl(ViewOnClickListenerC20995grR.Companion.copydefault(((AbstractC8601bFm) c20250gdO.ejfBZ()).dUDNAs().DbNXlk(), java.lang.String.valueOf(((AbstractC8601bFm) c20250gdO.ejfBZ()).dHguZz().AhwBna()), (1772 & 4) != 0 ? false : false, (1772 & 8) != 0 ? "" : null, (1772 & 16) != 0 ? false : false, (1772 & 32) != 0 ? false : false, (1772 & 64) != 0 ? -1 : 0, (1772 & 128) != 0 ? -1L : 0L, (1772 & 256) != 0 ? "" : null, (1772 & 512) != 0 ? 1 : 0, (1772 & 1024) != 0 ? null : null));
        dialogInterfaceOnKeyListenerC14659dpdCopydefault.show(c20250gdO.getChildFragmentManager(), ViewOnClickListenerC20995grR.class.getSimpleName());
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit KWHzl(C20250gdO c20250gdO) {
        DialogInterfaceOnKeyListenerC14659dpd dialogInterfaceOnKeyListenerC14659dpdCopydefault = DialogInterfaceOnKeyListenerC14659dpd.Companion.copydefault(0.92f);
        dialogInterfaceOnKeyListenerC14659dpdCopydefault.KWHzl(ViewOnClickListenerC20995grR.Companion.copydefault(((AbstractC8601bFm) c20250gdO.ejfBZ()).dUDNAs().DbNXlk(), java.lang.String.valueOf(((AbstractC8601bFm) c20250gdO.ejfBZ()).dHguZz().AhwBna()), (1772 & 4) != 0 ? false : false, (1772 & 8) != 0 ? "" : null, (1772 & 16) != 0 ? false : false, (1772 & 32) != 0 ? false : false, (1772 & 64) != 0 ? -1 : 0, (1772 & 128) != 0 ? -1L : 0L, (1772 & 256) != 0 ? "" : null, (1772 & 512) != 0 ? 1 : 0, (1772 & 1024) != 0 ? null : null));
        dialogInterfaceOnKeyListenerC14659dpdCopydefault.show(c20250gdO.getChildFragmentManager(), ViewOnClickListenerC20995grR.class.getSimpleName());
        return Unit.INSTANCE;
    }

    @Override // o.AbstractC20082gaF
    public void OLrzqt(@NotNull C9748bbT c9748bbT) {
        Intrinsics.checkNotNullParameter(c9748bbT, "");
        copydefault(c9748bbT.gEmmrt());
        Function0<Unit> function0 = this.getFieldNames;
        if (function0 == null) {
            EZpvd(c9748bbT);
        } else if (function0 != null) {
            function0.invoke();
        }
    }

    private final void copydefault(final java.lang.String str) {
        int iQwvEab = ejfBZ().QwvEab();
        if (iQwvEab == 3) {
            TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
            C32866mlf.AEQbTJ("app_metax_wallet_trade_click", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.gdU
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C20250gdO.EZpvd(str, (EventParamsList) obj);
                }
            });
        } else if (iQwvEab == 4) {
            TrackChannel[] trackChannelArrCopydefault2 = C32868mlh.OLrzqt.copydefault();
            C32866mlf.AEQbTJ("app_metax_wallet_NFT_click", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault2, trackChannelArrCopydefault2.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.gdV
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C20250gdO.AEQbTJ(str, (EventParamsList) obj);
                }
            });
        } else {
            TrackChannel[] trackChannelArrCopydefault3 = C32868mlh.OLrzqt.copydefault();
            C32866mlf.AEQbTJ("app_metax_wallet_contractinteract_click", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault3, trackChannelArrCopydefault3.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.gdT
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C20250gdO.djBIcL(str, (EventParamsList) obj);
                }
            });
        }
    }

    public static final Unit EZpvd(java.lang.String str, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        if (str == null) {
            str = "";
        }
        eventParamsList.put("tx_id", str, false);
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(java.lang.String str, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        if (str == null) {
            str = "";
        }
        eventParamsList.put("tx_id", str, false);
        return Unit.INSTANCE;
    }

    public static final Unit djBIcL(java.lang.String str, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        if (str == null) {
            str = "";
        }
        eventParamsList.put("tx_id", str, false);
        return Unit.INSTANCE;
    }

    @Override // o.AbstractC20082gaF
    public void getNewProxyInstance() {
        super.getNewProxyInstance();
        C32866mlf.onEvent$default("Web3WalletContractInteraction_Btm_Reject_Click", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        InterfaceC58217yxC interfaceC58217yxC = this.uzCIH;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
    }
}
