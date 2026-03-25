package com.okinc.business.defi.biz.core.wallet;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.rx2.RxAwaitKt;
import o.AbstractC12782ctV;
import o.AbstractC58260yxt;
import o.C12827cuN;
import o.C56391yDq;
import o.C56402yEa;
import o.C56442yFn;
import o.pUU;
import o.yDY;

/* JADX INFO: loaded from: classes4.dex */
public final class WalletManager$fetchMainWallets$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends AbstractC12782ctV>>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ C12827cuN this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletManager$fetchMainWallets$2(C12827cuN c12827cuN, Continuation<? super WalletManager$fetchMainWallets$2> continuation) {
        super(2, continuation);
        this.this$0 = c12827cuN;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WalletManager$fetchMainWallets$2(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends AbstractC12782ctV>> continuation) {
        return ((WalletManager$fetchMainWallets$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        AbstractC12782ctV abstractC12782ctV;
        AbstractC12782ctV abstractC12782ctV2;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            AbstractC58260yxt abstractC58260yxtFetchAllWallets$default = C12827cuN.fetchAllWallets$default(this.this$0, false, true, false, 5, null);
            this.label = 1;
            obj = RxAwaitKt.await(abstractC58260yxtFetchAllWallets$default, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                abstractC12782ctV2 = (AbstractC12782ctV) this.L$0;
                C56391yDq.AEQbTJ(obj);
                abstractC12782ctV = abstractC12782ctV2;
                return C56402yEa.EZpvd(abstractC12782ctV);
            }
            C56391yDq.AEQbTJ(obj);
        }
        Collection arrayList = (Collection) obj;
        C12827cuN c12827cuN = this.this$0;
        if (arrayList.isEmpty()) {
            arrayList = new ArrayList(c12827cuN.copydefault);
        }
        List list = (List) arrayList;
        if (list.isEmpty()) {
            pUU.copydefault("MainWalletError", "There is no main wallet.");
            return yDY.AhwBna();
        }
        Intrinsics.copydefault(list);
        abstractC12782ctV = (AbstractC12782ctV) CollectionsKt___CollectionsKt.AuCTelauCTel(list);
        if (!abstractC12782ctV.zuWLRA()) {
            abstractC12782ctV.AEQbTJ(true);
            AbstractC58260yxt<Integer> abstractC58260yxtFARcdN = this.this$0.AhwBna().fARcdN(abstractC12782ctV.DbNXlk());
            this.L$0 = abstractC12782ctV;
            this.label = 2;
            if (RxAwaitKt.await(abstractC58260yxtFARcdN, this) == objCopydefault) {
                return objCopydefault;
            }
            abstractC12782ctV2 = abstractC12782ctV;
            abstractC12782ctV = abstractC12782ctV2;
        }
        return C56402yEa.EZpvd(abstractC12782ctV);
    }
}
