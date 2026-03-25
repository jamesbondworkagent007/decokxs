package o;

import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.dexlogic.bean.QuotePriceRes;
import com.okinc.business.dexlogic.bean.TransactionBean;
import com.okinc.business.dexlogic.track.DexTrackEventParameter;
import com.okinc.business.dexui.main.swap.trade.transaction.TransactionPageFragment;
import com.okinc.business.dexui.main.swap.trade.transaction.pages.EvmTransactionPageFragment$getAssemblyListData$1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC23194htd;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.isz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C25243isz extends AbstractC25196isE<C23000hpv> {

    /* JADX INFO: renamed from: o.isz$StateListAnimator */
    public static final /* synthetic */ class StateListAnimator implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.EZpvd = function1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean equals(java.lang.Object obj) {
            if ((obj instanceof Observer) && (obj instanceof InterfaceC56514yIe)) {
                return Intrinsics.EZpvd(getFunctionDelegate(), ((InterfaceC56514yIe) obj).getFunctionDelegate());
            }
            return false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC56514yIe
        public final InterfaceC56388yDn<?> getFunctionDelegate() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.EZpvd.invoke(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.business.dexui.main.swap.trade.transaction.TransactionPageFragment
    public void AEQbTJ(@NotNull AbstractC9832bcy abstractC9832bcy, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(abstractC9832bcy, "");
        Intrinsics.checkNotNullParameter(str, "");
    }

    @Override // com.okinc.business.dexui.main.swap.trade.transaction.TransactionPageFragment
    public void copydefault(AbstractC9832bcy abstractC9832bcy) {
    }

    /* JADX INFO: renamed from: o.isz$Activity */
    public static final class Activity implements ViewModelProvider.Factory {
        public Activity() {
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public <T extends ViewModel> T create(java.lang.Class<T> cls) {
            Intrinsics.checkNotNullParameter(cls, "");
            return new C23000hpv(C25243isz.this.AEQbTJ());
        }
    }

    /* JADX DEBUG: Method merged with bridge method: QKVWgx()Lo/hpY; */
    /* JADX DEBUG: Possible override for method com.okinc.business.dexui.main.swap.trade.transaction.TransactionPageFragment.aKErDB()V */
    @Override // com.okinc.business.dexui.main.swap.trade.transaction.TransactionPageFragment
    /* JADX INFO: renamed from: aKErDB, reason: merged with bridge method [inline-methods] */
    public C23000hpv QKVWgx() {
        return (C23000hpv) new ViewModelProvider(this, new Activity()).get(C23000hpv.class);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.okinc.business.dexui.main.swap.trade.transaction.TransactionPageFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object EZpvd(@NotNull Continuation<? super java.util.List<? extends java.lang.Object>> continuation) throws java.lang.Throwable {
        EvmTransactionPageFragment$getAssemblyListData$1 evmTransactionPageFragment$getAssemblyListData$1;
        java.util.List list;
        C25243isz c25243isz;
        if (continuation instanceof EvmTransactionPageFragment$getAssemblyListData$1) {
            evmTransactionPageFragment$getAssemblyListData$1 = (EvmTransactionPageFragment$getAssemblyListData$1) continuation;
            int i = evmTransactionPageFragment$getAssemblyListData$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                evmTransactionPageFragment$getAssemblyListData$1.label = i - Integer.MIN_VALUE;
            } else {
                evmTransactionPageFragment$getAssemblyListData$1 = new EvmTransactionPageFragment$getAssemblyListData$1(this, continuation);
            }
        }
        java.lang.Object obj = evmTransactionPageFragment$getAssemblyListData$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = evmTransactionPageFragment$getAssemblyListData$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(C25409iwF.AEQbTJ);
            arrayList.add(DTwDnp());
            arrayList.add(QOLQEE());
            arrayList.add(C25407iwD.AEQbTJ);
            arrayList.add(AxsJAY());
            OLrzqt(arrayList);
            evmTransactionPageFragment$getAssemblyListData$1.L$0 = this;
            evmTransactionPageFragment$getAssemblyListData$1.L$1 = arrayList;
            evmTransactionPageFragment$getAssemblyListData$1.label = 1;
            java.lang.Object objKWHzl = KWHzl(evmTransactionPageFragment$getAssemblyListData$1);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
            list = arrayList;
            obj = objKWHzl;
            c25243isz = this;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            list = (java.util.List) evmTransactionPageFragment$getAssemblyListData$1.L$1;
            c25243isz = (C25243isz) evmTransactionPageFragment$getAssemblyListData$1.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        C25144irF c25144irF = (C25144irF) obj;
        if (c25144irF != null) {
            C56443yFo.KWHzl(list.add(c25144irF));
        }
        list.add(TransactionPageFragment.walletUsedData$default(c25243isz, null, 1, null));
        QuotePriceRes newProxyInstance = c25243isz.getNewProxyInstance();
        if (newProxyInstance != null && newProxyInstance.isSingle()) {
            list.add(c25243isz.isConnected());
        }
        list.add(c25243isz.OcIXYQ());
        QuotePriceRes newProxyInstance2 = c25243isz.getNewProxyInstance();
        if (newProxyInstance2 == null || !newProxyInstance2.isSingle()) {
            list.add(c25243isz.values());
        }
        list.add(c25243isz.sSMYrx());
        list.add(c25243isz.fetchVPNInfo());
        return list;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VM */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.okinc.business.dexui.main.swap.trade.transaction.TransactionPageFragment
    public void valueOf() {
        ((C23000hpv) zLjUOn()).OLrzqt().observe(getViewLifecycleOwner(), new StateListAnimator(new Function1() { // from class: o.isw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C25243isz.KWHzl(this.copydefault, (java.lang.Boolean) obj);
            }
        }));
        DbNXlk().EZpvd().observe(getViewLifecycleOwner(), new StateListAnimator(new Function1() { // from class: o.isx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C25243isz.OLrzqt(this.KWHzl, (java.lang.Boolean) obj);
            }
        }));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: VM */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit KWHzl(final C25243isz c25243isz, java.lang.Boolean bool) {
        java.lang.String chainId;
        InterfaceC9734bbF interfaceC9734bbFHDKMBd = c25243isz.hDKMBd();
        final InterfaceC9743bbO interfaceC9743bbO = interfaceC9734bbFHDKMBd instanceof InterfaceC9743bbO ? (InterfaceC9743bbO) interfaceC9734bbFHDKMBd : null;
        DexMultiTokenInfoBean dexMultiTokenInfoBeanFIwbmz = c25243isz.fIwbmz();
        if (dexMultiTokenInfoBeanFIwbmz == null || (chainId = dexMultiTokenInfoBeanFIwbmz.getChainId()) == null) {
            chainId = "";
        }
        ((C23000hpv) c25243isz.zLjUOn()).OLrzqt(c25243isz.AEQbTJ(), chainId, new Function1() { // from class: o.isA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C25243isz.EZpvd(this.copydefault, interfaceC9743bbO, (java.util.List) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VM */
    /* JADX DEBUG: Multi-variable search result rejected for r2v4, resolved type: VM */
    /* JADX DEBUG: Multi-variable search result rejected for r4v2, resolved type: VM */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit EZpvd(C25243isz c25243isz, InterfaceC9743bbO interfaceC9743bbO, java.util.List list) {
        if (list != null) {
            c25243isz.DbNXlk().OLrzqt(((C23000hpv) c25243isz.zLjUOn()).EZpvd());
            TransactionBean transactionBeanFJNWhG = ((C23000hpv) c25243isz.zLjUOn()).fJNWhG();
            boolean openMev = transactionBeanFJNWhG != null ? transactionBeanFJNWhG.getOpenMev() : false;
            c25243isz.DbNXlk().KWHzl().setValue(java.lang.Boolean.valueOf(openMev));
            if (openMev && interfaceC9743bbO != null) {
                interfaceC9743bbO.a_(((C23000hpv) c25243isz.zLjUOn()).EZpvd());
            }
        } else {
            if (interfaceC9743bbO != null) {
                interfaceC9743bbO.fARcdN();
            }
            c25243isz.DbNXlk().KWHzl().setValue(null);
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v2, resolved type: VM */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit OLrzqt(C25243isz c25243isz, java.lang.Boolean bool) {
        TransactionPageFragment.swapContractInteractionButtonClick$default(c25243isz, bool.booleanValue() ? DexTrackEventParameter.ButtonName.Mev_On.getValue() : DexTrackEventParameter.ButtonName.Mev_off.getValue(), null, 2, null);
        InterfaceC9734bbF interfaceC9734bbFHDKMBd = c25243isz.hDKMBd();
        InterfaceC9743bbO interfaceC9743bbO = interfaceC9734bbFHDKMBd instanceof InterfaceC9743bbO ? (InterfaceC9743bbO) interfaceC9734bbFHDKMBd : null;
        if (interfaceC9743bbO == null) {
            return Unit.INSTANCE;
        }
        if (bool.booleanValue()) {
            interfaceC9743bbO.a_(((C23000hpv) c25243isz.zLjUOn()).EZpvd());
        } else {
            interfaceC9743bbO.fARcdN();
        }
        return Unit.INSTANCE;
    }

    @Override // com.okinc.business.dexui.main.swap.trade.transaction.TransactionPageFragment
    public void ORxRYg() {
        InterfaceC9731bbC interfaceC9731bbCEZpvd;
        java.lang.String strGEmmrt;
        InterfaceC9731bbC interfaceC9731bbCEZpvd2;
        java.lang.String strOLrzqt;
        InterfaceC9734bbF interfaceC9734bbFHDKMBd = hDKMBd();
        InterfaceC9752bbX interfaceC9752bbXGEmmrt = interfaceC9734bbFHDKMBd != null ? interfaceC9734bbFHDKMBd.gEmmrt() : null;
        java.lang.String str = (interfaceC9752bbXGEmmrt == null || (interfaceC9731bbCEZpvd2 = interfaceC9752bbXGEmmrt.EZpvd()) == null || (strOLrzqt = interfaceC9731bbCEZpvd2.OLrzqt()) == null) ? "" : strOLrzqt;
        java.lang.String str2 = (interfaceC9752bbXGEmmrt == null || (interfaceC9731bbCEZpvd = interfaceC9752bbXGEmmrt.EZpvd()) == null || (strGEmmrt = C33129mqd.gEmmrt(java.lang.Long.valueOf(interfaceC9731bbCEZpvd.fetchVPNInfo()))) == null) ? "" : strGEmmrt;
        InterfaceC23194htd interfaceC23194htdFARcdN = C22380heK.OLrzqt.copydefault(AEQbTJ()).fARcdN();
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.copydefault(fragmentActivityRequireActivity, "");
        InterfaceC23194htd.Application.showRechargeDialog$default(interfaceC23194htdFARcdN, (AbstractActivityC33041mov) fragmentActivityRequireActivity, str2, str, yDY.copydefault("dex"), null, null, 48, null);
        TransactionPageFragment.swapContractInteractionButtonClick$default(this, "fill_up", null, 2, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VM */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.okinc.business.dexui.main.swap.trade.transaction.TransactionPageFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        ((C23000hpv) zLjUOn()).gHZMYf();
    }
}
