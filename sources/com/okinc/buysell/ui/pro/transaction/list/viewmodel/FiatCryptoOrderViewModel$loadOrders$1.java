package com.okinc.buysell.ui.pro.transaction.list.viewmodel;

import com.okinc.buysell.ui.pro.transaction.list.viewmodel.FiatCryptoOrderViewModel;
import com.okinc.crcore.shared.net.responsebean.bsc.FiatOrderItemBean;
import com.okinc.crcore.shared.net.responsebean.bsc.FiatOrderListBean;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC43419rot;
import o.C30200lPo;
import o.C30201lPp;
import o.C32989mnw;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC31764mDa;

/* JADX INFO: loaded from: classes7.dex */
public final class FiatCryptoOrderViewModel$loadOrders$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ int $pageIndex;
    final /* synthetic */ C30200lPo $req;
    int label;
    final /* synthetic */ FiatCryptoOrderViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FiatCryptoOrderViewModel$loadOrders$1(FiatCryptoOrderViewModel fiatCryptoOrderViewModel, C30200lPo c30200lPo, int i, Continuation<? super FiatCryptoOrderViewModel$loadOrders$1> continuation) {
        super(2, continuation);
        this.this$0 = fiatCryptoOrderViewModel;
        this.$req = c30200lPo;
        this.$pageIndex = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FiatCryptoOrderViewModel$loadOrders$1(this.this$0, this.$req, this.$pageIndex, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((FiatCryptoOrderViewModel$loadOrders$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC31764mDa interfaceC31764mDa = this.this$0.KWHzl;
            String strDjBIcL = this.$req.djBIcL();
            String strCopydefault = this.$req.copydefault();
            String strKWHzl = this.$req.KWHzl();
            int iOLrzqt = this.$req.OLrzqt();
            int iAEQbTJ = this.$req.AEQbTJ();
            String strEZpvd = this.$req.EZpvd();
            Integer numGEmmrt = this.$req.gEmmrt();
            this.label = 1;
            obj = interfaceC31764mDa.EZpvd(strCopydefault, strKWHzl, iOLrzqt, iAEQbTJ, strDjBIcL, strEZpvd, numGEmmrt, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        AbstractC43419rot abstractC43419rot = (AbstractC43419rot) obj;
        int i2 = this.$pageIndex;
        FiatCryptoOrderViewModel fiatCryptoOrderViewModel = this.this$0;
        if (abstractC43419rot instanceof AbstractC43419rot.StateListAnimator) {
            List<FiatOrderItemBean> items = ((FiatOrderListBean) ((AbstractC43419rot.StateListAnimator) abstractC43419rot).KWHzl()).getItems();
            ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(items, 10));
            Iterator<T> it = items.iterator();
            while (it.hasNext()) {
                arrayList.add(C30201lPp.KWHzl((FiatOrderItemBean) it.next()));
            }
            fiatCryptoOrderViewModel.KWHzl().setValue(new C32989mnw<>(new FiatCryptoOrderViewModel.TaskDescription(arrayList, i2 != 1)));
            fiatCryptoOrderViewModel.AEQbTJ().setValue(new C32989mnw<>(C56443yFo.KWHzl(true)));
        }
        return Unit.INSTANCE;
    }
}
