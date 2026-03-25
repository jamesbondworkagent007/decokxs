package com.okinc.business.dex.trade.order.ui.viewmodel;

import com.okinc.business.dexlogic.bean.DefiChainInfo;
import com.okinc.business.trade.features.home.domain.model.ChainBizType;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC43419rot;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC20070gZu;
import o.kUH;

/* JADX INFO: loaded from: classes5.dex */
public final class OrderListViewModel$updateCurrentChain$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $chainId;
    Object L$0;
    int label;
    final /* synthetic */ OrderListViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderListViewModel$updateCurrentChain$1(OrderListViewModel orderListViewModel, String str, Continuation<? super OrderListViewModel$updateCurrentChain$1> continuation) {
        super(2, continuation);
        this.this$0 = orderListViewModel;
        this.$chainId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OrderListViewModel$updateCurrentChain$1(this.this$0, this.$chainId, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OrderListViewModel$updateCurrentChain$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00aa  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        List list;
        List list2;
        boolean z;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        boolean z2 = true;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            kUH kuh = this.this$0.KWHzl;
            ChainBizType chainBizType = ChainBizType.Bridge;
            this.label = 1;
            obj = kuh.EZpvd(chainBizType, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                list = (List) this.L$0;
                C56391yDq.AEQbTJ(obj);
                list2 = (List) ((AbstractC43419rot) obj).copydefault();
                if (list == null) {
                    String str = this.$chainId;
                    if (list.isEmpty()) {
                        z = false;
                    } else {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            if (Intrinsics.EZpvd((Object) ((DefiChainInfo) it.next()).getChainId(), (Object) str)) {
                                z = true;
                                break;
                            }
                        }
                        z = false;
                    }
                }
                if (list2 == null) {
                    String str2 = this.$chainId;
                    if (list2.isEmpty()) {
                        z2 = false;
                    } else {
                        Iterator it2 = list2.iterator();
                        while (it2.hasNext()) {
                            if (Intrinsics.EZpvd((Object) ((DefiChainInfo) it2.next()).getChainId(), (Object) str2)) {
                                break;
                            }
                        }
                        z2 = false;
                    }
                }
                this.this$0.copydefault.setValue(new InterfaceC20070gZu.Application(this.$chainId, z, z2));
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
        }
        List list3 = (List) ((AbstractC43419rot) obj).copydefault();
        kUH kuh2 = this.this$0.KWHzl;
        ChainBizType chainBizType2 = ChainBizType.Single;
        this.L$0 = list3;
        this.label = 2;
        Object objEZpvd = kuh2.EZpvd(chainBizType2, this);
        if (objEZpvd == objCopydefault) {
            return objCopydefault;
        }
        list = list3;
        obj = objEZpvd;
        list2 = (List) ((AbstractC43419rot) obj).copydefault();
        if (list == null) {
        }
        if (list2 == null) {
        }
        this.this$0.copydefault.setValue(new InterfaceC20070gZu.Application(this.$chainId, z, z2));
        return Unit.INSTANCE;
    }
}
