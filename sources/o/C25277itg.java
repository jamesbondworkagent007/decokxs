package o;

import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.okinc.business.dexlogic.bean.TransactionBean;
import com.okinc.business.dexui.main.swap.trade.transaction.TransactionPageFragment;
import com.okinc.business.dexui.main.swap.trade.transaction.pages.TransferTransactionPageFragment$getAssemblyListData$1;
import com.okinc.web3Uilib.bean.TransactionTopReminderInfoBean;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import o.InterfaceC23194htd;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.itg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C25277itg extends AbstractC25201isJ<C22976hpX> {
    @Override // com.okinc.business.dexui.main.swap.trade.transaction.TransactionPageFragment
    public void valueOf() {
    }

    /* JADX INFO: renamed from: o.itg$Application */
    public static final class Application implements ViewModelProvider.Factory {
        public Application() {
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public <T extends ViewModel> T create(java.lang.Class<T> cls) {
            Intrinsics.checkNotNullParameter(cls, "");
            return new C22976hpX(C25277itg.this.AEQbTJ());
        }
    }

    /* JADX DEBUG: Method merged with bridge method: QKVWgx()Lo/hpY; */
    /* JADX DEBUG: Possible override for method com.okinc.business.dexui.main.swap.trade.transaction.TransactionPageFragment.UeEOUB()V */
    /* JADX DEBUG: Possible override for method o.isJ.UeEOUB()V */
    @Override // com.okinc.business.dexui.main.swap.trade.transaction.TransactionPageFragment
    /* JADX INFO: renamed from: UeEOUB, reason: merged with bridge method [inline-methods] */
    public C22976hpX QKVWgx() {
        return (C22976hpX) new ViewModelProvider(this, new Application()).get(C22976hpX.class);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.okinc.business.dexui.main.swap.trade.transaction.TransactionPageFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object EZpvd(@NotNull Continuation<? super java.util.List<? extends java.lang.Object>> continuation) throws java.lang.Throwable {
        TransferTransactionPageFragment$getAssemblyListData$1 transferTransactionPageFragment$getAssemblyListData$1;
        java.util.List list;
        C25277itg c25277itg;
        if (continuation instanceof TransferTransactionPageFragment$getAssemblyListData$1) {
            transferTransactionPageFragment$getAssemblyListData$1 = (TransferTransactionPageFragment$getAssemblyListData$1) continuation;
            int i = transferTransactionPageFragment$getAssemblyListData$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                transferTransactionPageFragment$getAssemblyListData$1.label = i - Integer.MIN_VALUE;
            } else {
                transferTransactionPageFragment$getAssemblyListData$1 = new TransferTransactionPageFragment$getAssemblyListData$1(this, continuation);
            }
        }
        java.lang.Object obj = transferTransactionPageFragment$getAssemblyListData$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = transferTransactionPageFragment$getAssemblyListData$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(C25409iwF.AEQbTJ);
            arrayList.add(DTwDnp());
            arrayList.add(QOLQEE());
            TransactionBean transactionBeanFJNWhG = ((C22976hpX) zLjUOn()).fJNWhG();
            arrayList.add(AEQbTJ(transactionBeanFJNWhG != null ? transactionBeanFJNWhG.getWalletAddressType() : null));
            TransactionBean transactionBeanFJNWhG2 = ((C22976hpX) zLjUOn()).fJNWhG();
            if (C33129mqd.OLrzqt((java.lang.CharSequence) (transactionBeanFJNWhG2 != null ? transactionBeanFJNWhG2.getReceiveWalletAddress() : null))) {
                arrayList.add(QUSxYX());
            }
            if (((C22976hpX) zLjUOn()).wlaJM()) {
                arrayList.add(isConnected());
            }
            arrayList.add(AxsJAY());
            OLrzqt(arrayList);
            transferTransactionPageFragment$getAssemblyListData$1.L$0 = this;
            transferTransactionPageFragment$getAssemblyListData$1.L$1 = arrayList;
            transferTransactionPageFragment$getAssemblyListData$1.label = 1;
            java.lang.Object objKWHzl = KWHzl(transferTransactionPageFragment$getAssemblyListData$1);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
            list = arrayList;
            obj = objKWHzl;
            c25277itg = this;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            list = (java.util.List) transferTransactionPageFragment$getAssemblyListData$1.L$1;
            c25277itg = (C25277itg) transferTransactionPageFragment$getAssemblyListData$1.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        C25144irF c25144irF = (C25144irF) obj;
        if (c25144irF != null) {
            C56443yFo.KWHzl(list.add(c25144irF));
        }
        list.add(c25277itg.OcIXYQ());
        list.add(c25277itg.sSMYrx());
        list.add(c25277itg.fetchVPNInfo());
        return list;
    }

    @Override // com.okinc.business.dexui.main.swap.trade.transaction.TransactionPageFragment
    public void AEQbTJ(@NotNull AbstractC9832bcy abstractC9832bcy, @NotNull java.lang.String str) {
        InterfaceC9734bbF interfaceC9734bbFHDKMBd;
        C57436yiQ c57436yiQ;
        android.view.View view;
        InterfaceC9731bbC interfaceC9731bbCEZpvd;
        java.lang.String strFJNWhG;
        C57436yiQ c57436yiQ2;
        android.view.View view2;
        C57436yiQ c57436yiQ3;
        android.view.View view3;
        C57436yiQ c57436yiQ4;
        InterfaceC9752bbX interfaceC9752bbXGEmmrt;
        InterfaceC9731bbC interfaceC9731bbCEZpvd2;
        java.lang.String strFJNWhG2;
        android.view.View view4;
        java.lang.String str2 = "";
        Intrinsics.checkNotNullParameter(abstractC9832bcy, "");
        Intrinsics.checkNotNullParameter(str, "");
        if (abstractC9832bcy instanceof C9811bcd) {
            C21615hFy c21615hFyFJNWhG = fJNWhG();
            if (c21615hFyFJNWhG != null && (c57436yiQ4 = c21615hFyFJNWhG.OLrzqt) != null) {
                c57436yiQ4.setVisibility(0);
                C21615hFy c21615hFyFJNWhG2 = fJNWhG();
                if (c21615hFyFJNWhG2 != null && (view4 = c21615hFyFJNWhG2.copydefault) != null) {
                    view4.setVisibility(0);
                }
                int i = C23274hvD.Fragment.LocalOnBackPressedDispatcherOwner;
                InterfaceC9734bbF interfaceC9734bbFHDKMBd2 = hDKMBd();
                if (interfaceC9734bbFHDKMBd2 != null && (interfaceC9752bbXGEmmrt = interfaceC9734bbFHDKMBd2.gEmmrt()) != null && (interfaceC9731bbCEZpvd2 = interfaceC9752bbXGEmmrt.EZpvd()) != null && (strFJNWhG2 = interfaceC9731bbCEZpvd2.fJNWhG()) != null) {
                    str2 = strFJNWhG2;
                }
                c57436yiQ4.setViewDataBean(new TransactionTopReminderInfoBean((java.lang.String) null, str, (java.lang.CharSequence) null, (Function0) null, C33069mpW.copydefault(i, C56423yEv.EZpvd(C56390yDp.OLrzqt("symbol", str2))), new Function0() { // from class: o.itl
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return C25277itg.OLrzqt(this.EZpvd);
                    }
                }, 13, (DefaultConstructorMarker) null));
            }
            TransactionPageFragment.updateButtonStatus$default(this, false, 0, null, 4, null);
            ejfBZ().DbNXlk();
            return;
        }
        if (abstractC9832bcy instanceof C9813bcf) {
            ejfBZ().DbNXlk();
            return;
        }
        if (abstractC9832bcy instanceof C9879bds) {
            C21615hFy c21615hFyFJNWhG3 = fJNWhG();
            if (c21615hFyFJNWhG3 != null && (c57436yiQ3 = c21615hFyFJNWhG3.OLrzqt) != null) {
                c57436yiQ3.setVisibility(0);
                C21615hFy c21615hFyFJNWhG4 = fJNWhG();
                if (c21615hFyFJNWhG4 != null && (view3 = c21615hFyFJNWhG4.copydefault) != null) {
                    view3.setVisibility(0);
                }
                c57436yiQ3.setViewDataBean(new TransactionTopReminderInfoBean((java.lang.String) null, str, (java.lang.CharSequence) null, (Function0) null, (java.lang.CharSequence) null, (Function0) null, 61, (DefaultConstructorMarker) null));
            }
            TransactionPageFragment.updateButtonStatus$default(this, false, 0, null, 4, null);
            ejfBZ().DbNXlk();
            return;
        }
        if (abstractC9832bcy instanceof C9878bdr) {
            C21615hFy c21615hFyFJNWhG5 = fJNWhG();
            if (c21615hFyFJNWhG5 != null && (c57436yiQ2 = c21615hFyFJNWhG5.OLrzqt) != null) {
                c57436yiQ2.setVisibility(0);
                C21615hFy c21615hFyFJNWhG6 = fJNWhG();
                if (c21615hFyFJNWhG6 != null && (view2 = c21615hFyFJNWhG6.copydefault) != null) {
                    view2.setVisibility(0);
                }
                c57436yiQ2.setViewDataBean(new TransactionTopReminderInfoBean((java.lang.String) null, str, (java.lang.CharSequence) null, (Function0) null, (java.lang.CharSequence) null, (Function0) null, 61, (DefaultConstructorMarker) null));
            }
            TransactionPageFragment.updateButtonStatus$default(this, false, 0, null, 4, null);
            ejfBZ().DbNXlk();
            return;
        }
        if (!(abstractC9832bcy instanceof C9880bdt) || (interfaceC9734bbFHDKMBd = hDKMBd()) == null) {
            return;
        }
        InterfaceC9752bbX interfaceC9752bbXGEmmrt2 = interfaceC9734bbFHDKMBd.gEmmrt();
        if (interfaceC9752bbXGEmmrt2 != null && (interfaceC9731bbCEZpvd = interfaceC9752bbXGEmmrt2.EZpvd()) != null && (strFJNWhG = interfaceC9731bbCEZpvd.fJNWhG()) != null) {
            str2 = strFJNWhG;
        }
        C21615hFy c21615hFyFJNWhG7 = fJNWhG();
        if (c21615hFyFJNWhG7 != null && (c57436yiQ = c21615hFyFJNWhG7.OLrzqt) != null) {
            c57436yiQ.setVisibility(0);
            C21615hFy c21615hFyFJNWhG8 = fJNWhG();
            if (c21615hFyFJNWhG8 != null && (view = c21615hFyFJNWhG8.copydefault) != null) {
                view.setVisibility(0);
            }
            c57436yiQ.setViewDataBean(new TransactionTopReminderInfoBean((java.lang.String) null, str, (java.lang.CharSequence) null, (Function0) null, C33069mpW.copydefault(C23274hvD.Fragment.LocalOnBackPressedDispatcherOwner, C56423yEv.EZpvd(C56390yDp.OLrzqt("symbol", str2))), new Function0() { // from class: o.ito
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C25277itg.KWHzl(this.EZpvd);
                }
            }, 13, (DefaultConstructorMarker) null));
        }
        TransactionPageFragment.updateButtonStatus$default(this, false, 0, null, 4, null);
        ejfBZ().DbNXlk();
    }

    public static final Unit OLrzqt(C25277itg c25277itg) {
        c25277itg.ORxRYg();
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(C25277itg c25277itg) {
        c25277itg.ORxRYg();
        return Unit.INSTANCE;
    }

    @Override // com.okinc.business.dexui.main.swap.trade.transaction.TransactionPageFragment
    public void copydefault(AbstractC9832bcy abstractC9832bcy) {
        if ((abstractC9832bcy instanceof C9811bcd) || (abstractC9832bcy instanceof C9879bds) || (abstractC9832bcy instanceof C9878bdr)) {
            ORxRYg();
        } else if (abstractC9832bcy instanceof C9813bcf) {
            ORxRYg();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v8, resolved type: VM */
    /* JADX WARN: Multi-variable type inference failed */
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
        AbstractActivityC33041mov abstractActivityC33041mov = (AbstractActivityC33041mov) fragmentActivityRequireActivity;
        java.util.ArrayList arrayListCopydefault = yDY.copydefault("dex");
        TransactionBean transactionBeanFJNWhG = ((C22976hpX) zLjUOn()).fJNWhG();
        InterfaceC23194htd.Application.showRechargeDialog$default(interfaceC23194htdFARcdN, abstractActivityC33041mov, str2, str, arrayListCopydefault, null, transactionBeanFJNWhG != null ? transactionBeanFJNWhG.getWalletAddressType() : null, 16, null);
        TransactionPageFragment.swapContractInteractionButtonClick$default(this, "fill_up", null, 2, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VM */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.okinc.business.dexui.main.swap.trade.transaction.TransactionPageFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        ((C22976hpX) zLjUOn()).gHZMYf();
    }
}
