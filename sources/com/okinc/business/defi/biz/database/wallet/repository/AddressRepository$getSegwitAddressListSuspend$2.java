package com.okinc.business.defi.biz.database.wallet.repository;

import com.okinc.business.defi.biz.database.wallet.entity.ChainAddressSegWitEntity;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC11289cIs;
import o.cOG;

/* JADX INFO: loaded from: classes4.dex */
public final class AddressRepository$getSegwitAddressListSuspend$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Map<String, ? extends List<? extends ChainAddressSegWitEntity>>>, Object> {
    final /* synthetic */ List<Integer> $addressTypeList;
    final /* synthetic */ List<Long> $chainIdList;
    final /* synthetic */ List<String> $walletIds;
    int label;
    final /* synthetic */ cOG this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddressRepository$getSegwitAddressListSuspend$2(cOG cog, List<String> list, List<Long> list2, List<Integer> list3, Continuation<? super AddressRepository$getSegwitAddressListSuspend$2> continuation) {
        super(2, continuation);
        this.this$0 = cog;
        this.$walletIds = list;
        this.$chainIdList = list2;
        this.$addressTypeList = list3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AddressRepository$getSegwitAddressListSuspend$2(this.this$0, this.$walletIds, this.$chainIdList, this.$addressTypeList, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Map<String, ? extends List<? extends ChainAddressSegWitEntity>>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super Map<String, ? extends List<ChainAddressSegWitEntity>>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Map<String, ? extends List<ChainAddressSegWitEntity>>> continuation) {
        return ((AddressRepository$getSegwitAddressListSuspend$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC11289cIs interfaceC11289cIs = this.this$0.OLrzqt;
            List<String> list = this.$walletIds;
            List<Long> list2 = this.$chainIdList;
            List<Integer> list3 = this.$addressTypeList;
            this.label = 1;
            obj = interfaceC11289cIs.EZpvd(list, list2, list3, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return obj;
    }
}
