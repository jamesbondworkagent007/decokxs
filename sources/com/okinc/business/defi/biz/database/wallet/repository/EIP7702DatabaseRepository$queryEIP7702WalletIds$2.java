package com.okinc.business.defi.biz.database.wallet.repository;

import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC11330cKf;
import o.cPS;

/* JADX INFO: loaded from: classes4.dex */
public final class EIP7702DatabaseRepository$queryEIP7702WalletIds$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends String>>, Object> {
    final /* synthetic */ List<Long> $chainIds;
    final /* synthetic */ int $hdWalletType;
    final /* synthetic */ int $keyWalletType;
    final /* synthetic */ List<String> $walletIds;
    int label;
    final /* synthetic */ cPS this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EIP7702DatabaseRepository$queryEIP7702WalletIds$2(cPS cps, List<String> list, int i, int i2, List<Long> list2, Continuation<? super EIP7702DatabaseRepository$queryEIP7702WalletIds$2> continuation) {
        super(2, continuation);
        this.this$0 = cps;
        this.$walletIds = list;
        this.$hdWalletType = i;
        this.$keyWalletType = i2;
        this.$chainIds = list2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new EIP7702DatabaseRepository$queryEIP7702WalletIds$2(this.this$0, this.$walletIds, this.$hdWalletType, this.$keyWalletType, this.$chainIds, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends String>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super List<String>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super List<String>> continuation) {
        return ((EIP7702DatabaseRepository$queryEIP7702WalletIds$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC11330cKf interfaceC11330cKf = this.this$0.KWHzl;
            List<String> list = this.$walletIds;
            int i2 = this.$hdWalletType;
            int i3 = this.$keyWalletType;
            List<Long> list2 = this.$chainIds;
            this.label = 1;
            obj = interfaceC11330cKf.EZpvd(list, i2, i3, list2, this);
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
