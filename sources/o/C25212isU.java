package o;

import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.okinc.business.dexlogic.bean.DeFiPlatformForSwap;
import com.okinc.business.dexlogic.bean.QuotePriceRes;
import com.okinc.business.dexlogic.bean.TradeMode;
import com.okinc.business.dexlogic.main.swap.trade.transaction.base.bean.CallDataError;
import com.okinc.business.dexlogic.track.enums.DexSwapSignatureActionClick;
import com.okinc.business.dexui.main.swap.trade.transaction.TransactionPageFragment;
import com.okinc.business.dexui.main.swap.trade.transaction.pages.PMMTransactionPageFragment$getAssemblyListData$1;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.liveness.lca.EopTrackEvent;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import java.util.Objects;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import o.InterfaceC9740bbL;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.isU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C25212isU extends AbstractC25193isB<C22960hpH> {
    public final java.lang.Object uzCIH = new java.lang.Object();

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
    public static final /* synthetic */ C22960hpH copydefault(C25212isU c25212isU) {
        return (C22960hpH) c25212isU.zLjUOn();
    }

    /* JADX INFO: renamed from: o.isU$StateListAnimator */
    public static final class StateListAnimator implements ViewModelProvider.Factory {
        public StateListAnimator() {
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public <T extends ViewModel> T create(java.lang.Class<T> cls) {
            Intrinsics.checkNotNullParameter(cls, "");
            return new C22960hpH(C25212isU.this.AEQbTJ());
        }
    }

    /* JADX DEBUG: Method merged with bridge method: QKVWgx()Lo/hpY; */
    /* JADX DEBUG: Possible override for method com.okinc.business.dexui.main.swap.trade.transaction.TransactionPageFragment.dNCPSb()Z */
    /* JADX DEBUG: Possible override for method o.isB.dNCPSb()V */
    @Override // com.okinc.business.dexui.main.swap.trade.transaction.TransactionPageFragment
    /* JADX INFO: renamed from: dNCPSb, reason: merged with bridge method [inline-methods] */
    public C22960hpH QKVWgx() {
        return (C22960hpH) new ViewModelProvider(this, new StateListAnimator()).get(C22960hpH.class);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.okinc.business.dexui.main.swap.trade.transaction.TransactionPageFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object EZpvd(@NotNull Continuation<? super java.util.List<? extends java.lang.Object>> continuation) throws java.lang.Throwable {
        PMMTransactionPageFragment$getAssemblyListData$1 pMMTransactionPageFragment$getAssemblyListData$1;
        java.util.List list;
        C25212isU c25212isU;
        if (continuation instanceof PMMTransactionPageFragment$getAssemblyListData$1) {
            pMMTransactionPageFragment$getAssemblyListData$1 = (PMMTransactionPageFragment$getAssemblyListData$1) continuation;
            int i = pMMTransactionPageFragment$getAssemblyListData$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                pMMTransactionPageFragment$getAssemblyListData$1.label = i - Integer.MIN_VALUE;
            } else {
                pMMTransactionPageFragment$getAssemblyListData$1 = new PMMTransactionPageFragment$getAssemblyListData$1(this, continuation);
            }
        }
        java.lang.Object obj = pMMTransactionPageFragment$getAssemblyListData$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = pMMTransactionPageFragment$getAssemblyListData$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(C25409iwF.AEQbTJ);
            arrayList.add(DTwDnp());
            arrayList.add(QOLQEE());
            arrayList.add(C25410iwG.OLrzqt);
            OLrzqt(arrayList);
            pMMTransactionPageFragment$getAssemblyListData$1.L$0 = this;
            pMMTransactionPageFragment$getAssemblyListData$1.L$1 = arrayList;
            pMMTransactionPageFragment$getAssemblyListData$1.label = 1;
            java.lang.Object objKWHzl = KWHzl(pMMTransactionPageFragment$getAssemblyListData$1);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
            list = arrayList;
            obj = objKWHzl;
            c25212isU = this;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            list = (java.util.List) pMMTransactionPageFragment$getAssemblyListData$1.L$1;
            c25212isU = (C25212isU) pMMTransactionPageFragment$getAssemblyListData$1.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        C25144irF c25144irF = (C25144irF) obj;
        if (c25144irF != null) {
            C56443yFo.KWHzl(list.add(c25144irF));
        }
        list.add(TransactionPageFragment.walletUsedData$default(c25212isU, null, 1, null));
        list.add(c25212isU.isConnected());
        list.add(c25212isU.OcIXYQ());
        list.add(c25212isU.sSMYrx());
        return list;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: VM */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.okinc.business.dexui.main.swap.trade.transaction.TransactionPageFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        C33050mpD.OLrzqt(this.uzCIH);
        ((C22960hpH) zLjUOn()).gHZMYf();
    }

    @Override // com.okinc.business.dexui.main.swap.trade.transaction.TransactionPageFragment
    public void copydefault(AbstractC9832bcy abstractC9832bcy) {
        EZpvd(DexSwapSignatureActionClick.ButtonName.CONFIRM.getValue(), DexSwapSignatureActionClick.BusinessType.INTENT.getValue());
        aKErDB();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VM */
    /* JADX WARN: Multi-variable type inference failed */
    private final void aKErDB() {
        FragmentActivity activity;
        ((C22960hpH) zLjUOn()).DbNXlk().setValue(java.lang.Boolean.TRUE);
        InterfaceC9740bbL interfaceC9740bbLAYXKKw = C22380heK.OLrzqt.copydefault(AEQbTJ()).fARcdN().AYXKKw();
        Objects.toString(hDKMBd());
        InterfaceC9734bbF interfaceC9734bbFHDKMBd = hDKMBd();
        if (interfaceC9734bbFHDKMBd == null || (activity = getActivity()) == null) {
            return;
        }
        AbstractC58260yxt<ResponseData<C9748bbT>> abstractC58260yxtCopydefault = interfaceC9740bbLAYXKKw.copydefault(activity, interfaceC9734bbFHDKMBd, (InterfaceC9740bbL.TaskDescription) new ActionBar(), false);
        final Function1 function1 = new Function1() { // from class: o.isX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C25212isU.OLrzqt(this.EZpvd, (ResponseData) obj);
            }
        };
        InterfaceC58227yxM<? super ResponseData<C9748bbT>> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.isZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C25212isU.getNewProxyInstance(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.isV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C25212isU.OLrzqt(this.AEQbTJ, (java.lang.Throwable) obj);
            }
        };
        InterfaceC58217yxC interfaceC58217yxCAEQbTJ = abstractC58260yxtCopydefault.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.isY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C25212isU.iwGUEr(function12, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(interfaceC58217yxCAEQbTJ, "");
        C33050mpD.EZpvd(interfaceC58217yxCAEQbTJ, this.uzCIH);
    }

    /* JADX INFO: renamed from: o.isU$ActionBar */
    public static final class ActionBar implements InterfaceC9740bbL.TaskDescription {
        @Override // o.InterfaceC9740bbL.TaskDescription
        public void EZpvd() {
        }

        public ActionBar() {
        }

        @Override // o.InterfaceC9740bbL.TaskDescription
        public void copydefault() {
            C25212isU.copydefault(C25212isU.this).DbNXlk().setValue(java.lang.Boolean.TRUE);
        }
    }

    public static final void getNewProxyInstance(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: VM */
    /* JADX DEBUG: Multi-variable search result rejected for r2v5, resolved type: VM */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit OLrzqt(C25212isU c25212isU, ResponseData responseData) {
        int code = responseData.getCode();
        if (code == -5014 || code == -5007) {
            ((C22960hpH) c25212isU.zLjUOn()).DbNXlk().setValue(java.lang.Boolean.FALSE);
        } else if (code == -5001) {
            java.lang.Object data = responseData.getData();
            Intrinsics.copydefault(data);
            c25212isU.EZpvd((C9748bbT) data);
        } else {
            ((C22960hpH) c25212isU.zLjUOn()).DbNXlk().setValue(java.lang.Boolean.FALSE);
            C25189iry.AEQbTJ(responseData.getMsg());
        }
        return Unit.INSTANCE;
    }

    public static final void iwGUEr(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: VM */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit OLrzqt(C25212isU c25212isU, java.lang.Throwable th) {
        ((C22960hpH) c25212isU.zLjUOn()).DbNXlk().setValue(java.lang.Boolean.FALSE);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: VM */
    /* JADX DEBUG: Multi-variable search result rejected for r1v3, resolved type: VM */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: VM */
    /* JADX WARN: Multi-variable type inference failed */
    private final void EZpvd(C9748bbT c9748bbT) {
        DeFiPlatformForSwap selectedDeFiPlatform;
        final java.lang.String strAEQbTJ = c9748bbT.AEQbTJ();
        if (strAEQbTJ == null) {
            strAEQbTJ = "";
        }
        ((C22960hpH) zLjUOn()).DbNXlk().setValue(java.lang.Boolean.TRUE);
        C22960hpH c22960hpH = (C22960hpH) zLjUOn();
        boolean zAwvSrB = AwvSrB();
        QuotePriceRes quotePriceResAkhnZx = ((C22960hpH) zLjUOn()).AkhnZx();
        AbstractC58185ywX<ResponseData<java.lang.String>> abstractC58185ywXAEQbTJ = c22960hpH.AEQbTJ(strAEQbTJ, zAwvSrB, (quotePriceResAkhnZx == null || (selectedDeFiPlatform = quotePriceResAkhnZx.getSelectedDeFiPlatform()) == null) ? null : selectedDeFiPlatform.getDefiPlatformId(), TradeMode.SwapMode.getType());
        final Function1 function1 = new Function1() { // from class: o.isT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C25212isU.AEQbTJ(this.AEQbTJ, strAEQbTJ, (ResponseData) obj);
            }
        };
        InterfaceC58227yxM<? super ResponseData<java.lang.String>> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.isS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C25212isU.uzCIH(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.isQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C25212isU.copydefault(this.AEQbTJ, (java.lang.Throwable) obj);
            }
        };
        InterfaceC58217yxC interfaceC58217yxCAEQbTJ = abstractC58185ywXAEQbTJ.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.isW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C25212isU.hDKMBd(function12, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(interfaceC58217yxCAEQbTJ, "");
        C33050mpD.EZpvd(interfaceC58217yxCAEQbTJ, this.uzCIH);
    }

    public static final void uzCIH(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: VM */
    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: VM */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit AEQbTJ(C25212isU c25212isU, java.lang.String str, ResponseData responseData) {
        C22380heK.OLrzqt.copydefault(c25212isU.AEQbTJ()).OLrzqt(c25212isU.AwvSrB()).KWHzl(str);
        ((C22960hpH) c25212isU.zLjUOn()).DbNXlk().setValue(java.lang.Boolean.FALSE);
        ((C22960hpH) c25212isU.zLjUOn()).AhwBna().setValue(java.lang.Boolean.TRUE);
        return Unit.INSTANCE;
    }

    public static final void hDKMBd(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VM */
    /* JADX DEBUG: Multi-variable search result rejected for r0v10, resolved type: VM */
    /* JADX DEBUG: Multi-variable search result rejected for r10v1, resolved type: VM */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit copydefault(C25212isU c25212isU, java.lang.Throwable th) {
        ((C22960hpH) c25212isU.zLjUOn()).DbNXlk().setValue(java.lang.Boolean.FALSE);
        java.lang.String strAYXKKw = C33070mpX.AYXKKw(C23274hvD.Fragment.getShuffleMode);
        if (th instanceof OKServerException) {
            OKServerException oKServerException = (OKServerException) th;
            if (oKServerException.getCode() == 10055) {
                MutableLiveData<CallDataError> mutableLiveDataGEmmrt = ((C22960hpH) c25212isU.zLjUOn()).gEmmrt();
                java.lang.String message = oKServerException.getMessage();
                mutableLiveDataGEmmrt.setValue(new CallDataError("10055", message == null ? strAYXKKw : message, false, 4, (DefaultConstructorMarker) null));
            } else {
                java.lang.String message2 = oKServerException.getMessage();
                if (message2 != null) {
                    C55326xho.toastWithFailedIcon$default(message2, 0, 1, (java.lang.Object) null);
                }
            }
            InterfaceC22824hme interfaceC22824hmeOLrzqt = C22380heK.OLrzqt.copydefault(c25212isU.AEQbTJ()).OLrzqt(c25212isU.AwvSrB());
            java.lang.String message3 = oKServerException.getMessage();
            if (message3 != null) {
                strAYXKKw = message3;
            }
            interfaceC22824hmeOLrzqt.OLrzqt(strAYXKKw);
        } else {
            C55328xhq.show$default(C55328xhq.OLrzqt, strAYXKKw, (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 62, (java.lang.Object) null);
        }
        ((C22960hpH) c25212isU.zLjUOn()).AhwBna().setValue(java.lang.Boolean.TRUE);
        return Unit.INSTANCE;
    }

    public final void EZpvd(final java.lang.String str, final java.lang.String str2) {
        C32866mlf.onEvent$default("DEXSwap_Signature_Action_Click", (TrackChannel[]) null, new Function1() { // from class: o.itd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C25212isU.AEQbTJ(str, str2, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit AEQbTJ(java.lang.String str, java.lang.String str2, EventParamsList eventParamsList) {
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
