package o;

import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.dexlogic.bean.QuotePriceRes;
import com.okinc.business.dexlogic.bean.UnsignedSwapData;
import com.okinc.business.dexui.main.swap.trade.transaction.TransactionPageFragment;
import com.okinc.business.dexui.main.swap.trade.transaction.pages.IsomerismTransactionPageFragment$getAssemblyListData$1;
import com.okinc.web3Uilib.bean.TransactionTopReminderInfoBean;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import o.InterfaceC23194htd;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.isN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C25205isN extends AbstractC25194isC<C22963hpK> {
    @Override // com.okinc.business.dexui.main.swap.trade.transaction.TransactionPageFragment
    public void valueOf() {
    }

    /* JADX INFO: renamed from: o.isN$TaskDescription */
    public static final class TaskDescription implements ViewModelProvider.Factory {
        public TaskDescription() {
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public <T extends ViewModel> T create(java.lang.Class<T> cls) {
            Intrinsics.checkNotNullParameter(cls, "");
            return new C22963hpK(C25205isN.this.AEQbTJ(), null, 2, 0 == true ? 1 : 0);
        }
    }

    /* JADX DEBUG: Method merged with bridge method: QKVWgx()Lo/hpY; */
    /* JADX DEBUG: Possible override for method com.okinc.business.dexui.main.swap.trade.transaction.TransactionPageFragment.djSkpj()V */
    @Override // com.okinc.business.dexui.main.swap.trade.transaction.TransactionPageFragment
    /* JADX INFO: renamed from: djSkpj, reason: merged with bridge method [inline-methods] */
    public C22963hpK QKVWgx() {
        return (C22963hpK) new ViewModelProvider(this, new TaskDescription()).get(C22963hpK.class);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.okinc.business.dexui.main.swap.trade.transaction.TransactionPageFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object EZpvd(@NotNull Continuation<? super java.util.List<? extends java.lang.Object>> continuation) throws java.lang.Throwable {
        IsomerismTransactionPageFragment$getAssemblyListData$1 isomerismTransactionPageFragment$getAssemblyListData$1;
        java.util.List list;
        C25205isN c25205isN;
        C25144irF c25144irF;
        C25144irF c25144irF2;
        if (continuation instanceof IsomerismTransactionPageFragment$getAssemblyListData$1) {
            isomerismTransactionPageFragment$getAssemblyListData$1 = (IsomerismTransactionPageFragment$getAssemblyListData$1) continuation;
            int i = isomerismTransactionPageFragment$getAssemblyListData$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                isomerismTransactionPageFragment$getAssemblyListData$1.label = i - Integer.MIN_VALUE;
            } else {
                isomerismTransactionPageFragment$getAssemblyListData$1 = new IsomerismTransactionPageFragment$getAssemblyListData$1(this, continuation);
            }
        }
        java.lang.Object obj = isomerismTransactionPageFragment$getAssemblyListData$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = isomerismTransactionPageFragment$getAssemblyListData$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(C25409iwF.AEQbTJ);
            arrayList.add(DTwDnp());
            arrayList.add(QOLQEE());
            if (((C22963hpK) zLjUOn()).wlaJM()) {
                arrayList.add(C25407iwD.AEQbTJ);
                arrayList.add(AxsJAY());
                OLrzqt(arrayList);
                isomerismTransactionPageFragment$getAssemblyListData$1.L$0 = this;
                isomerismTransactionPageFragment$getAssemblyListData$1.L$1 = arrayList;
                isomerismTransactionPageFragment$getAssemblyListData$1.label = 1;
                java.lang.Object objKWHzl = KWHzl(isomerismTransactionPageFragment$getAssemblyListData$1);
                if (objKWHzl == objCopydefault) {
                    return objCopydefault;
                }
                list = arrayList;
                obj = objKWHzl;
                c25205isN = this;
                c25144irF = (C25144irF) obj;
                if (c25144irF != null) {
                }
                list.add(TransactionPageFragment.walletUsedData$default(c25205isN, null, 1, null));
                C56443yFo.KWHzl(list.add(c25205isN.isConnected()));
            } else {
                arrayList.add(C25408iwE.OLrzqt);
                arrayList.add(TransactionPageFragment.walletUsedData$default(this, null, 1, null));
                arrayList.add(QUSxYX());
                arrayList.add(isConnected());
                arrayList.add(AxsJAY());
                OLrzqt(arrayList);
                isomerismTransactionPageFragment$getAssemblyListData$1.L$0 = this;
                isomerismTransactionPageFragment$getAssemblyListData$1.L$1 = arrayList;
                isomerismTransactionPageFragment$getAssemblyListData$1.label = 2;
                java.lang.Object objKWHzl2 = KWHzl(isomerismTransactionPageFragment$getAssemblyListData$1);
                if (objKWHzl2 == objCopydefault) {
                    return objCopydefault;
                }
                list = arrayList;
                obj = objKWHzl2;
                c25205isN = this;
                c25144irF2 = (C25144irF) obj;
                if (c25144irF2 != null) {
                }
            }
        } else if (i2 == 1) {
            list = (java.util.List) isomerismTransactionPageFragment$getAssemblyListData$1.L$1;
            c25205isN = (C25205isN) isomerismTransactionPageFragment$getAssemblyListData$1.L$0;
            C56391yDq.AEQbTJ(obj);
            c25144irF = (C25144irF) obj;
            if (c25144irF != null) {
                C56443yFo.KWHzl(list.add(c25144irF));
            }
            list.add(TransactionPageFragment.walletUsedData$default(c25205isN, null, 1, null));
            C56443yFo.KWHzl(list.add(c25205isN.isConnected()));
        } else {
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            list = (java.util.List) isomerismTransactionPageFragment$getAssemblyListData$1.L$1;
            c25205isN = (C25205isN) isomerismTransactionPageFragment$getAssemblyListData$1.L$0;
            C56391yDq.AEQbTJ(obj);
            c25144irF2 = (C25144irF) obj;
            if (c25144irF2 != null) {
                C56443yFo.KWHzl(list.add(c25144irF2));
            }
        }
        list.add(c25205isN.OcIXYQ());
        list.add(c25205isN.sSMYrx());
        list.add(c25205isN.fetchVPNInfo());
        return list;
    }

    @Override // com.okinc.business.dexui.main.swap.trade.transaction.TransactionPageFragment
    public void AEQbTJ(@NotNull AbstractC9832bcy abstractC9832bcy, @NotNull java.lang.String str) {
        C57436yiQ c57436yiQ;
        android.view.View view;
        InterfaceC9734bbF interfaceC9734bbFHDKMBd;
        C57436yiQ c57436yiQ2;
        android.view.View view2;
        InterfaceC9731bbC interfaceC9731bbCEZpvd;
        java.lang.String strFJNWhG;
        C57436yiQ c57436yiQ3;
        android.view.View view3;
        java.lang.String str2 = "";
        Intrinsics.checkNotNullParameter(abstractC9832bcy, "");
        Intrinsics.checkNotNullParameter(str, "");
        if ((abstractC9832bcy instanceof C9870bdj) || (abstractC9832bcy instanceof C9879bds)) {
            if (hDKMBd() == null) {
                return;
            }
            C21615hFy c21615hFyFJNWhG = fJNWhG();
            if (c21615hFyFJNWhG != null && (c57436yiQ = c21615hFyFJNWhG.OLrzqt) != null) {
                c57436yiQ.setVisibility(0);
                C21615hFy c21615hFyFJNWhG2 = fJNWhG();
                if (c21615hFyFJNWhG2 != null && (view = c21615hFyFJNWhG2.copydefault) != null) {
                    view.setVisibility(0);
                }
                c57436yiQ.setViewDataBean(new TransactionTopReminderInfoBean((java.lang.String) null, str, (java.lang.CharSequence) null, (Function0) null, (java.lang.CharSequence) null, (Function0) null, 61, (DefaultConstructorMarker) null));
            }
            TransactionPageFragment.updateButtonStatus$default(this, false, 0, null, 4, null);
            ejfBZ().DbNXlk();
            return;
        }
        if (abstractC9832bcy instanceof C9878bdr) {
            if (hDKMBd() == null) {
                return;
            }
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
        if (!(abstractC9832bcy instanceof C9880bdt) || (interfaceC9734bbFHDKMBd = hDKMBd()) == null) {
            return;
        }
        InterfaceC9752bbX interfaceC9752bbXGEmmrt = interfaceC9734bbFHDKMBd.gEmmrt();
        if (interfaceC9752bbXGEmmrt != null && (interfaceC9731bbCEZpvd = interfaceC9752bbXGEmmrt.EZpvd()) != null && (strFJNWhG = interfaceC9731bbCEZpvd.fJNWhG()) != null) {
            str2 = strFJNWhG;
        }
        C21615hFy c21615hFyFJNWhG5 = fJNWhG();
        if (c21615hFyFJNWhG5 != null && (c57436yiQ2 = c21615hFyFJNWhG5.OLrzqt) != null) {
            c57436yiQ2.setVisibility(0);
            C21615hFy c21615hFyFJNWhG6 = fJNWhG();
            if (c21615hFyFJNWhG6 != null && (view2 = c21615hFyFJNWhG6.copydefault) != null) {
                view2.setVisibility(0);
            }
            c57436yiQ2.setViewDataBean(new TransactionTopReminderInfoBean((java.lang.String) null, str, (java.lang.CharSequence) null, (Function0) null, C33069mpW.copydefault(C23274hvD.Fragment.LocalOnBackPressedDispatcherOwner, C56423yEv.EZpvd(C56390yDp.OLrzqt("symbol", str2))), new Function0() { // from class: o.isP
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C25205isN.AEQbTJ(this.OLrzqt);
                }
            }, 13, (DefaultConstructorMarker) null));
        }
        OLrzqt(true, 0, C33069mpW.copydefault(C23274hvD.Fragment.LocalOnBackPressedDispatcherOwner, C56423yEv.EZpvd(C56390yDp.OLrzqt("symbol", str2))));
        ejfBZ().DbNXlk();
    }

    public static final Unit AEQbTJ(C25205isN c25205isN) {
        c25205isN.ORxRYg();
        return Unit.INSTANCE;
    }

    @Override // com.okinc.business.dexui.main.swap.trade.transaction.TransactionPageFragment
    public void copydefault(AbstractC9832bcy abstractC9832bcy) {
        if ((abstractC9832bcy instanceof C9879bds) || (abstractC9832bcy instanceof C9878bdr)) {
            ORxRYg();
        }
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
        ((C22963hpK) zLjUOn()).gHZMYf();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VM */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.okinc.business.dexui.main.swap.trade.transaction.TransactionPageFragment
    public java.lang.String fARcdN() {
        java.lang.String chainId;
        DexMultiTokenInfoBean dexMultiTokenInfoBeanFromToken;
        UnsignedSwapData value = ((C22963hpK) zLjUOn()).KWHzl().getValue();
        if (value == null) {
            return "";
        }
        java.lang.String strAEQbTJ = AEQbTJ();
        QuotePriceRes newProxyInstance = getNewProxyInstance();
        if (newProxyInstance == null || (dexMultiTokenInfoBeanFromToken = newProxyInstance.fromToken()) == null || (chainId = dexMultiTokenInfoBeanFromToken.getChainId()) == null) {
            chainId = "";
        }
        java.lang.String convertJiToFeeAmount = value.getConvertJiToFeeAmount(strAEQbTJ, chainId);
        return convertJiToFeeAmount == null ? "" : convertJiToFeeAmount;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VM */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.okinc.business.dexui.main.swap.trade.transaction.TransactionPageFragment
    public boolean gHZMYf() {
        UnsignedSwapData value = ((C22963hpK) zLjUOn()).KWHzl().getValue();
        if (value != null) {
            return value.getJitoEnable();
        }
        return false;
    }
}
