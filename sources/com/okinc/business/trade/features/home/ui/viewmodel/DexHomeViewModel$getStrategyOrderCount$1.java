package com.okinc.business.trade.features.home.ui.viewmodel;

import com.okinc.business.dex.trade.order.domain.model.GetOrderCountRequest;
import com.okinc.business.dex.trade.order.domain.model.OrderCountResponse;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC43419rot;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC9738bbJ;
import o.InterfaceC9780bbz;
import o.gZF;
import o.yDY;

/* JADX INFO: loaded from: classes7.dex */
public final class DexHomeViewModel$getStrategyOrderCount$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ DexHomeViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DexHomeViewModel$getStrategyOrderCount$1(DexHomeViewModel dexHomeViewModel, Continuation<? super DexHomeViewModel$getStrategyOrderCount$1> continuation) {
        super(2, continuation);
        this.this$0 = dexHomeViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DexHomeViewModel$getStrategyOrderCount$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DexHomeViewModel$getStrategyOrderCount$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objAEQbTJ;
        InterfaceC9780bbz interfaceC9780bbzAddressFromRealChainId$default;
        InterfaceC9780bbz interfaceC9780bbzAddressFromRealChainId$default2;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC9738bbJ interfaceC9738bbJKWHzl = this.this$0.AubY.KWHzl();
            gZF gzf = this.this$0.DbNXlk;
            String address = null;
            String strDbNXlk = interfaceC9738bbJKWHzl != null ? interfaceC9738bbJKWHzl.DbNXlk() : null;
            String str = strDbNXlk == null ? "" : strDbNXlk;
            String[] strArr = new String[2];
            String address2 = (interfaceC9738bbJKWHzl == null || (interfaceC9780bbzAddressFromRealChainId$default2 = InterfaceC9738bbJ.StateListAnimator.addressFromRealChainId$default(interfaceC9738bbJKWHzl, 1L, null, 2, null)) == null) ? null : interfaceC9780bbzAddressFromRealChainId$default2.getAddress();
            if (address2 == null) {
                address2 = "";
            }
            strArr[0] = address2;
            if (interfaceC9738bbJKWHzl != null && (interfaceC9780bbzAddressFromRealChainId$default = InterfaceC9738bbJ.StateListAnimator.addressFromRealChainId$default(interfaceC9738bbJKWHzl, 501L, null, 2, null)) != null) {
                address = interfaceC9780bbzAddressFromRealChainId$default.getAddress();
            }
            strArr[1] = address != null ? address : "";
            GetOrderCountRequest getOrderCountRequest = new GetOrderCountRequest(str, yDY.gEmmrt(strArr), null, 4, null);
            this.label = 1;
            objAEQbTJ = gzf.AEQbTJ(getOrderCountRequest, this);
            if (objAEQbTJ == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objAEQbTJ = obj;
        }
        AbstractC43419rot abstractC43419rot = (AbstractC43419rot) objAEQbTJ;
        DexHomeViewModel dexHomeViewModel = this.this$0;
        if (abstractC43419rot instanceof AbstractC43419rot.StateListAnimator) {
            dexHomeViewModel.iwGUEr = ((OrderCountResponse) ((AbstractC43419rot.StateListAnimator) abstractC43419rot).KWHzl()).getNumLimit();
        }
        if (abstractC43419rot instanceof AbstractC43419rot.ActionBar) {
        }
        return Unit.INSTANCE;
    }
}
