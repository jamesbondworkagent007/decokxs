package o;

import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.okinc.business.dexui.main.swap.trade.transaction.TransactionPageFragment;
import com.okinc.network.okg.response.ResponseData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC9740bbL;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.isH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C25199isH extends AbstractC25197isF<C23001hpw> {
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
    public static final /* synthetic */ C23001hpw EZpvd(C25199isH c25199isH) {
        return (C23001hpw) c25199isH.zLjUOn();
    }

    /* JADX INFO: renamed from: o.isH$StateListAnimator */
    public static final class StateListAnimator implements ViewModelProvider.Factory {
        public StateListAnimator() {
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public <T extends ViewModel> T create(java.lang.Class<T> cls) {
            Intrinsics.checkNotNullParameter(cls, "");
            return new C23001hpw(C25199isH.this.AEQbTJ());
        }
    }

    /* JADX DEBUG: Method merged with bridge method: QKVWgx()Lo/hpY; */
    /* JADX DEBUG: Possible override for method com.okinc.business.dexui.main.swap.trade.transaction.TransactionPageFragment.UeEOUB()V */
    @Override // com.okinc.business.dexui.main.swap.trade.transaction.TransactionPageFragment
    /* JADX INFO: renamed from: UeEOUB, reason: merged with bridge method [inline-methods] */
    public C23001hpw QKVWgx() {
        return (C23001hpw) new ViewModelProvider(this, new StateListAnimator()).get(C23001hpw.class);
    }

    @Override // com.okinc.business.dexui.main.swap.trade.transaction.TransactionPageFragment
    public java.lang.Object EZpvd(@NotNull Continuation<? super java.util.List<? extends java.lang.Object>> continuation) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(C25409iwF.AEQbTJ);
        arrayList.add(DTwDnp());
        arrayList.add(QOLQEE());
        arrayList.add(C25410iwG.OLrzqt);
        OLrzqt(arrayList);
        arrayList.add(TransactionPageFragment.walletUsedData$default(this, null, 1, null));
        arrayList.add(OcIXYQ());
        arrayList.add(values());
        arrayList.add(sSMYrx());
        return arrayList;
    }

    @Override // com.okinc.business.dexui.main.swap.trade.transaction.TransactionPageFragment
    public void copydefault(AbstractC9832bcy abstractC9832bcy) {
        aKErDB();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VM */
    /* JADX DEBUG: Multi-variable search result rejected for r1v5, resolved type: VM */
    /* JADX WARN: Multi-variable type inference failed */
    public final void aKErDB() {
        FragmentActivity activity;
        ((C23001hpw) zLjUOn()).DbNXlk().setValue(java.lang.Boolean.TRUE);
        InterfaceC9740bbL interfaceC9740bbLAYXKKw = C22380heK.OLrzqt.copydefault(AEQbTJ()).fARcdN().AYXKKw();
        InterfaceC9734bbF interfaceC9734bbFHDKMBd = hDKMBd();
        if (interfaceC9734bbFHDKMBd == null || (activity = getActivity()) == null) {
            return;
        }
        AbstractC58260yxt<ResponseData<C9748bbT>> abstractC58260yxtCopydefault = interfaceC9740bbLAYXKKw.copydefault(activity, interfaceC9734bbFHDKMBd, new Application());
        final Function1 function1 = new Function1() { // from class: o.isG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C25199isH.OLrzqt(this.EZpvd, (ResponseData) obj);
            }
        };
        InterfaceC58227yxM<? super ResponseData<C9748bbT>> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.isK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C25199isH.AuCTel(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.isO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C25199isH.copydefault(this.EZpvd, (java.lang.Throwable) obj);
            }
        };
        InterfaceC58217yxC interfaceC58217yxCAEQbTJ = abstractC58260yxtCopydefault.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.isL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C25199isH.fARcdN(function12, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(interfaceC58217yxCAEQbTJ, "");
        yBK.EZpvd(interfaceC58217yxCAEQbTJ, ((C23001hpw) zLjUOn()).call());
    }

    /* JADX INFO: renamed from: o.isH$Application */
    public static final class Application implements InterfaceC9740bbL.TaskDescription {
        @Override // o.InterfaceC9740bbL.TaskDescription
        public void EZpvd() {
        }

        public Application() {
        }

        @Override // o.InterfaceC9740bbL.TaskDescription
        public void copydefault() {
            C25199isH.EZpvd(C25199isH.this).DbNXlk().setValue(java.lang.Boolean.TRUE);
        }
    }

    public static final void AuCTel(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: VM */
    /* JADX DEBUG: Multi-variable search result rejected for r2v5, resolved type: VM */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit OLrzqt(C25199isH c25199isH, ResponseData responseData) {
        int code = responseData.getCode();
        if (code == -5014 || code == -5007) {
            ((C23001hpw) c25199isH.zLjUOn()).DbNXlk().setValue(java.lang.Boolean.FALSE);
        } else if (code == -5001) {
            java.lang.Object data = responseData.getData();
            Intrinsics.copydefault(data);
            c25199isH.copydefault((C9748bbT) data);
        } else {
            ((C23001hpw) c25199isH.zLjUOn()).DbNXlk().setValue(java.lang.Boolean.FALSE);
            C25189iry.AEQbTJ(responseData.getMsg());
        }
        return Unit.INSTANCE;
    }

    public static final void fARcdN(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: VM */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit copydefault(C25199isH c25199isH, java.lang.Throwable th) {
        ((C23001hpw) c25199isH.zLjUOn()).DbNXlk().setValue(java.lang.Boolean.FALSE);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VM */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: VM */
    /* JADX WARN: Multi-variable type inference failed */
    private final void copydefault(C9748bbT c9748bbT) {
        java.lang.String strAEQbTJ = c9748bbT.AEQbTJ();
        if (strAEQbTJ == null) {
            strAEQbTJ = "";
        }
        ((C23001hpw) zLjUOn()).DbNXlk().setValue(java.lang.Boolean.TRUE);
        ((C23001hpw) zLjUOn()).OLrzqt(strAEQbTJ);
    }
}
