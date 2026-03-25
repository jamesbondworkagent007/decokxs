package com.okinc.business.defi.biz.impl;

import com.okinc.account.api.model.wallet.BoundWalletAccountsResult;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC8107awW;
import o.yDY;

/* JADX INFO: loaded from: classes4.dex */
public final class WalletCefiBindingServiceImpl$startCefiBindingProcess$5$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends BoundWalletAccountsResult>>, Object> {
    final /* synthetic */ InterfaceC8107awW $cDefiService;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletCefiBindingServiceImpl$startCefiBindingProcess$5$1(InterfaceC8107awW interfaceC8107awW, Continuation<? super WalletCefiBindingServiceImpl$startCefiBindingProcess$5$1> continuation) {
        super(2, continuation);
        this.$cDefiService = interfaceC8107awW;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WalletCefiBindingServiceImpl$startCefiBindingProcess$5$1(this.$cDefiService, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends BoundWalletAccountsResult>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super Result<BoundWalletAccountsResult>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Result<BoundWalletAccountsResult>> continuation) {
        return ((WalletCefiBindingServiceImpl$startCefiBindingProcess$5$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objOLrzqt;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC8107awW interfaceC8107awW = this.$cDefiService;
            List<String> listAhwBna = yDY.AhwBna();
            this.label = 1;
            objOLrzqt = interfaceC8107awW.OLrzqt(listAhwBna, this);
            if (objOLrzqt == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objOLrzqt = ((Result) obj).m7386unboximpl();
        }
        return Result.m7376boximpl(objOLrzqt);
    }
}
