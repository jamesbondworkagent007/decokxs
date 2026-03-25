package o;

import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.okinc.business.dexlogic.bean.TransactionBean;
import com.okinc.business.dexlogic.track.enums.DexSwapSignatureActionClick;
import com.okinc.business.dexui.main.swap.trade.transaction.TransactionPageFragment;
import com.okinc.business.dexui.main.swap.trade.transaction.pages.SolPMMTransactionPageFragment$getAssemblyListData$1;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.liveness.lca.EopTrackEvent;
import com.okinc.network.okg.response.ResponseData;
import java.util.Objects;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC9740bbL;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ite, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C25275ite extends AbstractC25200isI<C22966hpN> {
    public final java.lang.Object iwGUEr = new java.lang.Object();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.business.dexui.main.swap.trade.transaction.TransactionPageFragment
    public void AEQbTJ(@NotNull AbstractC9832bcy abstractC9832bcy, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(abstractC9832bcy, "");
        Intrinsics.checkNotNullParameter(str, "");
    }

    @Override // com.okinc.business.dexui.main.swap.trade.transaction.TransactionPageFragment
    public void ORxRYg() {
    }

    @Override // com.okinc.business.dexui.main.swap.trade.transaction.TransactionPageFragment
    public void valueOf() {
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: VM */
    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ C22966hpN OLrzqt(C25275ite c25275ite) {
        return (C22966hpN) c25275ite.zLjUOn();
    }

    /* JADX INFO: renamed from: o.ite$StateListAnimator */
    public static final class StateListAnimator implements ViewModelProvider.Factory {
        public StateListAnimator() {
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public <T extends ViewModel> T create(java.lang.Class<T> cls) {
            Intrinsics.checkNotNullParameter(cls, "");
            return new C22966hpN(C25275ite.this.AEQbTJ());
        }
    }

    /* JADX DEBUG: Method merged with bridge method: QKVWgx()Lo/hpY; */
    /* JADX DEBUG: Possible override for method com.okinc.business.dexui.main.swap.trade.transaction.TransactionPageFragment.djSkpj()V */
    @Override // com.okinc.business.dexui.main.swap.trade.transaction.TransactionPageFragment
    /* JADX INFO: renamed from: djSkpj, reason: merged with bridge method [inline-methods] */
    public C22966hpN QKVWgx() {
        return (C22966hpN) new ViewModelProvider(this, new StateListAnimator()).get(C22966hpN.class);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.okinc.business.dexui.main.swap.trade.transaction.TransactionPageFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object EZpvd(@NotNull Continuation<? super java.util.List<? extends java.lang.Object>> continuation) throws java.lang.Throwable {
        SolPMMTransactionPageFragment$getAssemblyListData$1 solPMMTransactionPageFragment$getAssemblyListData$1;
        java.util.List list;
        C25275ite c25275ite;
        if (continuation instanceof SolPMMTransactionPageFragment$getAssemblyListData$1) {
            solPMMTransactionPageFragment$getAssemblyListData$1 = (SolPMMTransactionPageFragment$getAssemblyListData$1) continuation;
            int i = solPMMTransactionPageFragment$getAssemblyListData$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                solPMMTransactionPageFragment$getAssemblyListData$1.label = i - Integer.MIN_VALUE;
            } else {
                solPMMTransactionPageFragment$getAssemblyListData$1 = new SolPMMTransactionPageFragment$getAssemblyListData$1(this, continuation);
            }
        }
        java.lang.Object obj = solPMMTransactionPageFragment$getAssemblyListData$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = solPMMTransactionPageFragment$getAssemblyListData$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(C25409iwF.AEQbTJ);
            arrayList.add(DTwDnp());
            arrayList.add(QOLQEE());
            arrayList.add(C25410iwG.OLrzqt);
            OLrzqt(arrayList);
            solPMMTransactionPageFragment$getAssemblyListData$1.L$0 = this;
            solPMMTransactionPageFragment$getAssemblyListData$1.L$1 = arrayList;
            solPMMTransactionPageFragment$getAssemblyListData$1.label = 1;
            java.lang.Object objKWHzl = KWHzl(solPMMTransactionPageFragment$getAssemblyListData$1);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
            list = arrayList;
            obj = objKWHzl;
            c25275ite = this;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            list = (java.util.List) solPMMTransactionPageFragment$getAssemblyListData$1.L$1;
            c25275ite = (C25275ite) solPMMTransactionPageFragment$getAssemblyListData$1.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        C25144irF c25144irF = (C25144irF) obj;
        if (c25144irF != null) {
            C56443yFo.KWHzl(list.add(c25144irF));
        }
        list.add(TransactionPageFragment.walletUsedData$default(c25275ite, null, 1, null));
        list.add(c25275ite.isConnected());
        list.add(c25275ite.OcIXYQ());
        list.add(c25275ite.sSMYrx());
        return list;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: VM */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.okinc.business.dexui.main.swap.trade.transaction.TransactionPageFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        C33050mpD.OLrzqt(this.iwGUEr);
        ((C22966hpN) zLjUOn()).gHZMYf();
    }

    @Override // com.okinc.business.dexui.main.swap.trade.transaction.TransactionPageFragment
    public void copydefault(AbstractC9832bcy abstractC9832bcy) {
        EZpvd(DexSwapSignatureActionClick.ButtonName.CONFIRM.getValue(), DexSwapSignatureActionClick.BusinessType.INTENT.getValue());
        RcXXUw();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VM */
    /* JADX WARN: Multi-variable type inference failed */
    private final void RcXXUw() {
        FragmentActivity activity;
        ((C22966hpN) zLjUOn()).DbNXlk().setValue(java.lang.Boolean.TRUE);
        InterfaceC9740bbL interfaceC9740bbLAYXKKw = C22380heK.OLrzqt.copydefault(AEQbTJ()).fARcdN().AYXKKw();
        Objects.toString(hDKMBd());
        InterfaceC9734bbF interfaceC9734bbFHDKMBd = hDKMBd();
        if (interfaceC9734bbFHDKMBd == null || (activity = getActivity()) == null) {
            return;
        }
        AbstractC58260yxt<ResponseData<C9748bbT>> abstractC58260yxtCopydefault = interfaceC9740bbLAYXKKw.copydefault(activity, interfaceC9734bbFHDKMBd, (InterfaceC9740bbL.TaskDescription) new ActionBar(), false);
        final Function1 function1 = new Function1() { // from class: o.ita
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C25275ite.EZpvd(this.OLrzqt, (ResponseData) obj);
            }
        };
        InterfaceC58227yxM<? super ResponseData<C9748bbT>> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.itb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C25275ite.fIwbmz(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.ith
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C25275ite.OLrzqt(this.EZpvd, (java.lang.Throwable) obj);
            }
        };
        InterfaceC58217yxC interfaceC58217yxCAEQbTJ = abstractC58260yxtCopydefault.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.iti
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C25275ite.AuCTel(function12, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(interfaceC58217yxCAEQbTJ, "");
        C33050mpD.EZpvd(interfaceC58217yxCAEQbTJ, this.iwGUEr);
    }

    /* JADX INFO: renamed from: o.ite$ActionBar */
    public static final class ActionBar implements InterfaceC9740bbL.TaskDescription {
        @Override // o.InterfaceC9740bbL.TaskDescription
        public void EZpvd() {
        }

        public ActionBar() {
        }

        @Override // o.InterfaceC9740bbL.TaskDescription
        public void copydefault() {
            C25275ite.OLrzqt(C25275ite.this).DbNXlk().setValue(java.lang.Boolean.TRUE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void fIwbmz(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v5, resolved type: VM */
    /* JADX DEBUG: Multi-variable search result rejected for r0v9, resolved type: VM */
    /* JADX DEBUG: Multi-variable search result rejected for r3v3, resolved type: VM */
    /* JADX DEBUG: Multi-variable search result rejected for r4v1, resolved type: VM */
    /* JADX DEBUG: Multi-variable search result rejected for r4v4, resolved type: VM */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit EZpvd(C25275ite c25275ite, ResponseData responseData) {
        java.lang.String strKWHzl;
        int code = responseData.getCode();
        if (code == -5014 || code == -5007) {
            ((C22966hpN) c25275ite.zLjUOn()).DbNXlk().setValue(java.lang.Boolean.FALSE);
            c25275ite.ejfBZ().EZpvd();
        } else if (code == -5001) {
            InterfaceC22824hme interfaceC22824hmeOLrzqt = C22380heK.OLrzqt.copydefault(c25275ite.AEQbTJ()).OLrzqt(c25275ite.AwvSrB());
            C9748bbT c9748bbT = (C9748bbT) responseData.getData();
            if (c9748bbT == null || (strKWHzl = c9748bbT.KWHzl()) == null) {
                strKWHzl = "";
            }
            interfaceC22824hmeOLrzqt.KWHzl(strKWHzl);
            TransactionBean transactionBeanFJNWhG = ((C22966hpN) c25275ite.zLjUOn()).fJNWhG();
            if (transactionBeanFJNWhG != null) {
                C9748bbT c9748bbT2 = (C9748bbT) responseData.getData();
                java.lang.String strAEQbTJ = c9748bbT2 != null ? c9748bbT2.AEQbTJ() : null;
                transactionBeanFJNWhG.setSignedTx(strAEQbTJ != null ? strAEQbTJ : "");
            }
            ((C22966hpN) c25275ite.zLjUOn()).DbNXlk().setValue(java.lang.Boolean.FALSE);
            ((C22966hpN) c25275ite.zLjUOn()).AhwBna().setValue(java.lang.Boolean.TRUE);
        } else {
            ((C22966hpN) c25275ite.zLjUOn()).DbNXlk().setValue(java.lang.Boolean.FALSE);
            c25275ite.ejfBZ().EZpvd();
            C25189iry.AEQbTJ(responseData.getMsg());
            pUU.copydefault(TransactionPageFragment.class.getName(), "code = " + responseData.getCode() + "msg= " + responseData.getMsg());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AuCTel(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: VM */
    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: VM */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit OLrzqt(C25275ite c25275ite, java.lang.Throwable th) {
        ((C22966hpN) c25275ite.zLjUOn()).DbNXlk().setValue(java.lang.Boolean.FALSE);
        ((C22966hpN) c25275ite.zLjUOn()).AhwBna().setValue(java.lang.Boolean.TRUE);
        C25189iry.AEQbTJ("");
        pUU.copydefault(C25275ite.class.getName(), "submitWithCheck is error");
        return Unit.INSTANCE;
    }

    private final void EZpvd(final java.lang.String str, final java.lang.String str2) {
        C32866mlf.onEvent$default("DEXSwap_Signature_Action_Click", (TrackChannel[]) null, new Function1() { // from class: o.itj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C25275ite.EZpvd(str, str2, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit EZpvd(java.lang.String str, java.lang.String str2, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put(EopTrackEvent.KEY_BUTTON_NAME, str, true);
        eventParamsList.put("business_type", str2, true);
        return Unit.INSTANCE;
    }

    @Override // com.okinc.business.dexui.main.swap.trade.transaction.TransactionPageFragment
    public void zuBGHE() {
        EZpvd(DexSwapSignatureActionClick.ButtonName.BACK.getValue(), DexSwapSignatureActionClick.BusinessType.INTENT.getValue());
    }
}
