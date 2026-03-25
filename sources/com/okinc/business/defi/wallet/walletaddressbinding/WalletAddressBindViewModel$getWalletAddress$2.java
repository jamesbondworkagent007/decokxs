package com.okinc.business.defi.wallet.walletaddressbinding;

import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.rx2.RxAwaitKt;
import o.AbstractC12782ctV;
import o.AbstractC58260yxt;
import o.C33129mqd;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes5.dex */
public final class WalletAddressBindViewModel$getWalletAddress$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends String>>, Object> {
    final /* synthetic */ String $accountId;
    Object L$0;
    int label;
    final /* synthetic */ WalletAddressBindViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletAddressBindViewModel$getWalletAddress$2(WalletAddressBindViewModel walletAddressBindViewModel, String str, Continuation<? super WalletAddressBindViewModel$getWalletAddress$2> continuation) {
        super(2, continuation);
        this.this$0 = walletAddressBindViewModel;
        this.$accountId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WalletAddressBindViewModel$getWalletAddress$2(this.this$0, this.$accountId, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends String>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super Result<String>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Result<String>> continuation) {
        return ((WalletAddressBindViewModel$getWalletAddress$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        WalletAddressBindViewModel walletAddressBindViewModel;
        AbstractC12782ctV abstractC12782ctV;
        String strOLrzqt;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                WalletAddressBindViewModel walletAddressBindViewModel2 = this.this$0;
                String str = this.$accountId;
                Result.Application application = Result.Companion;
                AbstractC58260yxt<AbstractC12782ctV> abstractC58260yxtOLrzqt = walletAddressBindViewModel2.gEmmrt.OLrzqt(str, false);
                this.L$0 = walletAddressBindViewModel2;
                this.label = 1;
                Object objAwait = RxAwaitKt.await(abstractC58260yxtOLrzqt, this);
                if (objAwait == objCopydefault) {
                    return objCopydefault;
                }
                walletAddressBindViewModel = walletAddressBindViewModel2;
                obj = objAwait;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                walletAddressBindViewModel = (WalletAddressBindViewModel) this.L$0;
                C56391yDq.AEQbTJ(obj);
            }
            abstractC12782ctV = (AbstractC12782ctV) obj;
            strOLrzqt = walletAddressBindViewModel.OLrzqt();
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (strOLrzqt == null) {
            Result.Application application3 = Result.Companion;
            return Result.m7376boximpl(Result.m7377constructorimpl(C56391yDq.EZpvd(new IllegalArgumentException("Chain ID is not valid"))));
        }
        objM7377constructorimpl = Result.m7377constructorimpl(abstractC12782ctV.EZpvd(C33129mqd.valueOf(strOLrzqt)));
        return Result.m7376boximpl(objM7377constructorimpl);
    }
}
