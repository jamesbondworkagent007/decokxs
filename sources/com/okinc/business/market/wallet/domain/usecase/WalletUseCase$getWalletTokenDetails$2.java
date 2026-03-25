package com.okinc.business.market.wallet.domain.usecase;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC9731bbC;
import o.InterfaceC9738bbJ;
import o.InterfaceC9742bbN;
import o.kKG;

/* JADX INFO: loaded from: classes7.dex */
public final class WalletUseCase$getWalletTokenDetails$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super InterfaceC9742bbN>, Object> {
    final /* synthetic */ long $chainId;
    final /* synthetic */ String $tokenAddress;
    Object L$0;
    int label;
    final /* synthetic */ kKG this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletUseCase$getWalletTokenDetails$2(kKG kkg, String str, long j, Continuation<? super WalletUseCase$getWalletTokenDetails$2> continuation) {
        super(2, continuation);
        this.this$0 = kkg;
        this.$tokenAddress = str;
        this.$chainId = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WalletUseCase$getWalletTokenDetails$2(this.this$0, this.$tokenAddress, this.$chainId, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super InterfaceC9742bbN> continuation) {
        return ((WalletUseCase$getWalletTokenDetails$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        InterfaceC9731bbC interfaceC9731bbCOLrzqt;
        InterfaceC9731bbC interfaceC9731bbC;
        InterfaceC9738bbJ interfaceC9738bbJ;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            kKG kkg = this.this$0;
            this.label = 1;
            obj = kkg.AYXKKw(this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                interfaceC9731bbC = (InterfaceC9731bbC) this.L$0;
                C56391yDq.AEQbTJ(obj);
                interfaceC9738bbJ = (InterfaceC9738bbJ) obj;
                if (interfaceC9738bbJ == null) {
                    return interfaceC9738bbJ.AEQbTJ(C56443yFo.KWHzl(interfaceC9731bbC.AhwBna()));
                }
                return null;
            }
            C56391yDq.AEQbTJ(obj);
        }
        if (!((Boolean) obj).booleanValue() || (interfaceC9731bbCOLrzqt = this.this$0.OLrzqt.OLrzqt(this.$tokenAddress, this.$chainId)) == null) {
            return null;
        }
        Flow<InterfaceC9738bbJ> flowOLrzqt = this.this$0.OLrzqt.OLrzqt();
        this.L$0 = interfaceC9731bbCOLrzqt;
        this.label = 2;
        Object objFirstOrNull = FlowKt.firstOrNull(flowOLrzqt, this);
        if (objFirstOrNull == objCopydefault) {
            return objCopydefault;
        }
        interfaceC9731bbC = interfaceC9731bbCOLrzqt;
        obj = objFirstOrNull;
        interfaceC9738bbJ = (InterfaceC9738bbJ) obj;
        if (interfaceC9738bbJ == null) {
        }
    }
}
