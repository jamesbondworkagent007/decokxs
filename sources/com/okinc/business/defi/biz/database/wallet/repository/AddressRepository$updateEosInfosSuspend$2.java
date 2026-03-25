package com.okinc.business.defi.biz.database.wallet.repository;

import com.okinc.business.defi.biz.database.wallet.entity.ChainAddressEntity;
import com.okinc.business.defi.biz.database.wallet.entity.EOSInfoEntity;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC11289cIs;
import o.cOG;

/* JADX INFO: loaded from: classes4.dex */
public final class AddressRepository$updateEosInfosSuspend$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Long>, Object> {
    final /* synthetic */ List<ChainAddressEntity> $addressEntities;
    final /* synthetic */ List<EOSInfoEntity> $eosInfos;
    int label;
    final /* synthetic */ cOG this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddressRepository$updateEosInfosSuspend$2(cOG cog, List<EOSInfoEntity> list, List<ChainAddressEntity> list2, Continuation<? super AddressRepository$updateEosInfosSuspend$2> continuation) {
        super(2, continuation);
        this.this$0 = cog;
        this.$eosInfos = list;
        this.$addressEntities = list2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AddressRepository$updateEosInfosSuspend$2(this.this$0, this.$eosInfos, this.$addressEntities, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Long> continuation) {
        return ((AddressRepository$updateEosInfosSuspend$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC11289cIs interfaceC11289cIs = this.this$0.OLrzqt;
            List<EOSInfoEntity> list = this.$eosInfos;
            List<ChainAddressEntity> list2 = this.$addressEntities;
            this.label = 1;
            obj = interfaceC11289cIs.EZpvd(list, list2, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        Long l = (Long) CollectionsKt___CollectionsKt.firstOrNull((List) obj);
        return C56443yFo.KWHzl(l != null ? l.longValue() : 0L);
    }
}
