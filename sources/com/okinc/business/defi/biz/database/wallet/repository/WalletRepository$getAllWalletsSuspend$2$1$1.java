package com.okinc.business.defi.biz.database.wallet.repository;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.AwaitKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC12782ctV;
import o.AbstractC12784ctX;
import o.C11571cTe;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.cQM;
import o.cSX;

/* JADX INFO: loaded from: classes4.dex */
public final class WalletRepository$getAllWalletsSuspend$2$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends AbstractC12782ctV>>, Object> {
    final /* synthetic */ String $rootWalletId;
    final /* synthetic */ Map<String, cSX> $rootWalletViewById;
    final /* synthetic */ List<C11571cTe> $walletViews;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ cQM this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletRepository$getAllWalletsSuspend$2$1$1(Map<String, cSX> map, String str, List<C11571cTe> list, cQM cqm, Continuation<? super WalletRepository$getAllWalletsSuspend$2$1$1> continuation) {
        super(2, continuation);
        this.$rootWalletViewById = map;
        this.$rootWalletId = str;
        this.$walletViews = list;
        this.this$0 = cqm;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        WalletRepository$getAllWalletsSuspend$2$1$1 walletRepository$getAllWalletsSuspend$2$1$1 = new WalletRepository$getAllWalletsSuspend$2$1$1(this.$rootWalletViewById, this.$rootWalletId, this.$walletViews, this.this$0, continuation);
        walletRepository$getAllWalletsSuspend$2$1$1.L$0 = obj;
        return walletRepository$getAllWalletsSuspend$2$1$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends AbstractC12782ctV>> continuation) {
        return ((WalletRepository$getAllWalletsSuspend$2$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        AbstractC12784ctX abstractC12784ctX;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            abstractC12784ctX = (AbstractC12784ctX) this.L$0;
            C56391yDq.AEQbTJ(obj);
        } else {
            C56391yDq.AEQbTJ(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            cSX csx = this.$rootWalletViewById.get(this.$rootWalletId);
            AbstractC12784ctX abstractC12784ctXKWHzl = csx != null ? this.this$0.KWHzl(csx) : null;
            List<C11571cTe> list = this.$walletViews;
            cQM cqm = this.this$0;
            ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new WalletRepository$getAllWalletsSuspend$2$1$1$walletsOfRootWallet$1$1(cqm, (C11571cTe) it.next(), abstractC12784ctXKWHzl, null), 3, null));
            }
            this.L$0 = abstractC12784ctXKWHzl;
            this.label = 1;
            obj = AwaitKt.awaitAll(arrayList, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
            abstractC12784ctX = abstractC12784ctXKWHzl;
        }
        List<? extends AbstractC12782ctV> list2 = (List) obj;
        if (abstractC12784ctX != null) {
            abstractC12784ctX.OLrzqt(list2);
        }
        if (abstractC12784ctX != null) {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : list2) {
                if (!((AbstractC12782ctV) obj2).zblBkD()) {
                    arrayList2.add(obj2);
                }
            }
            abstractC12784ctX.AEQbTJ(arrayList2);
        }
        return list2;
    }
}
