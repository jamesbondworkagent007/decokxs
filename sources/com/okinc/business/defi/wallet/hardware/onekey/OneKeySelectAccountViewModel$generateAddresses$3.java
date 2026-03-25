package com.okinc.business.defi.wallet.hardware.onekey;

import com.okinc.wallet.hardware.api.onekey.EVMAddress;
import com.okinc.wallet.hardware.api.onekey.EVMGetMultipleAddressParams;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C15423eHu;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC57039yar;

/* JADX INFO: loaded from: classes5.dex */
public final class OneKeySelectAccountViewModel$generateAddresses$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends EVMAddress>>, Object> {
    final /* synthetic */ C15423eHu.Activity $addressParams;
    int label;
    final /* synthetic */ C15423eHu this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneKeySelectAccountViewModel$generateAddresses$3(C15423eHu c15423eHu, C15423eHu.Activity activity, Continuation<? super OneKeySelectAccountViewModel$generateAddresses$3> continuation) {
        super(2, continuation);
        this.this$0 = c15423eHu;
        this.$addressParams = activity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OneKeySelectAccountViewModel$generateAddresses$3(this.this$0, this.$addressParams, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends EVMAddress>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super List<EVMAddress>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super List<EVMAddress>> continuation) {
        return ((OneKeySelectAccountViewModel$generateAddresses$3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC57039yar interfaceC57039yarAYXKKw = this.this$0.AYXKKw();
            String str = this.this$0.OLrzqt;
            String str2 = this.this$0.valueOf;
            EVMGetMultipleAddressParams eVMGetMultipleAddressParams = new EVMGetMultipleAddressParams(this.$addressParams.EZpvd());
            this.label = 1;
            obj = InterfaceC57039yar.Activity.getMultipleEVMAddresses$default(interfaceC57039yarAYXKKw, str, str2, eVMGetMultipleAddressParams, null, this, 8, null);
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
