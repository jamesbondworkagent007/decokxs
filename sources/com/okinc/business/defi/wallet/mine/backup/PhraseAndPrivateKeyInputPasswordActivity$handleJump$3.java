package com.okinc.business.defi.wallet.mine.backup;

import com.okinc.web3.security.service.Web3SecurityServiceProvider;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.rx2.RxAwaitKt;
import o.AbstractC12782ctV;
import o.AbstractC58260yxt;
import o.ActivityC18760foV;
import o.C12827cuN;
import o.C18807fpQ;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes15.dex */
public final class PhraseAndPrivateKeyInputPasswordActivity$handleJump$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $password;
    Object L$0;
    int label;
    final /* synthetic */ ActivityC18760foV this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PhraseAndPrivateKeyInputPasswordActivity$handleJump$3(ActivityC18760foV activityC18760foV, String str, Continuation<? super PhraseAndPrivateKeyInputPasswordActivity$handleJump$3> continuation) {
        super(2, continuation);
        this.this$0 = activityC18760foV;
        this.$password = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PhraseAndPrivateKeyInputPasswordActivity$handleJump$3(this.this$0, this.$password, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PhraseAndPrivateKeyInputPasswordActivity$handleJump$3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        AbstractC12782ctV abstractC12782ctV;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            this.this$0.showLoading();
            AbstractC58260yxt<AbstractC12782ctV> abstractC58260yxtOLrzqt = C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).OLrzqt(this.this$0.copydefault(), false);
            this.label = 1;
            obj = RxAwaitKt.await(abstractC58260yxtOLrzqt, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                abstractC12782ctV = (AbstractC12782ctV) this.L$0;
                C56391yDq.AEQbTJ(obj);
                this.this$0.dismissLoading();
                Web3SecurityServiceProvider.getService().startBackupPrivateKeys(this.this$0, abstractC12782ctV.AkhnZx(), this.$password, (ArrayList) obj);
                this.this$0.finish();
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
        }
        AbstractC12782ctV abstractC12782ctV2 = (AbstractC12782ctV) obj;
        C18807fpQ c18807fpQAEQbTJ = this.this$0.AEQbTJ();
        Intrinsics.copydefault(abstractC12782ctV2);
        String str = this.$password;
        this.L$0 = abstractC12782ctV2;
        this.label = 2;
        Object objEZpvd = c18807fpQAEQbTJ.EZpvd(abstractC12782ctV2, str, this);
        if (objEZpvd == objCopydefault) {
            return objCopydefault;
        }
        abstractC12782ctV = abstractC12782ctV2;
        obj = objEZpvd;
        this.this$0.dismissLoading();
        Web3SecurityServiceProvider.getService().startBackupPrivateKeys(this.this$0, abstractC12782ctV.AkhnZx(), this.$password, (ArrayList) obj);
        this.this$0.finish();
        return Unit.INSTANCE;
    }
}
