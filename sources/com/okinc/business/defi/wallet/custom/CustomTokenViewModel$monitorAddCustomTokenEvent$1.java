package com.okinc.business.defi.wallet.custom;

import com.okinc.business.defi.wallet.metricsmonitor.AddOrRemoveType;
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
import o.C16204efX;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC18445fiY;

/* JADX INFO: loaded from: classes18.dex */
public final class CustomTokenViewModel$monitorAddCustomTokenEvent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Long $chainId;
    final /* synthetic */ String $chainName;
    final /* synthetic */ String $path;
    final /* synthetic */ String $symbol;
    int label;
    final /* synthetic */ C16204efX this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomTokenViewModel$monitorAddCustomTokenEvent$1(C16204efX c16204efX, String str, String str2, String str3, Long l, Continuation<? super CustomTokenViewModel$monitorAddCustomTokenEvent$1> continuation) {
        super(2, continuation);
        this.this$0 = c16204efX;
        this.$path = str;
        this.$chainName = str2;
        this.$symbol = str3;
        this.$chainId = l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CustomTokenViewModel$monitorAddCustomTokenEvent$1(this.this$0, this.$path, this.$chainName, this.$symbol, this.$chainId, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CustomTokenViewModel$monitorAddCustomTokenEvent$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                C16204efX c16204efX = this.this$0;
                Result.Application application = Result.Companion;
                AbstractC58260yxt<AbstractC12782ctV> abstractC58260yxtCopydefault = c16204efX.KWHzl.copydefault(false);
                this.label = 1;
                obj = RxAwaitKt.await(abstractC58260yxtCopydefault, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            objM7377constructorimpl = Result.m7377constructorimpl((AbstractC12782ctV) obj);
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
            objM7377constructorimpl = null;
        }
        AbstractC12782ctV abstractC12782ctV = (AbstractC12782ctV) objM7377constructorimpl;
        InterfaceC18445fiY interfaceC18445fiY = this.this$0.gEmmrt;
        String str = this.$path;
        String str2 = this.$chainName;
        if (str2 == null) {
            str2 = "";
        }
        interfaceC18445fiY.KWHzl(str, str2, this.$symbol, this.$chainId, AddOrRemoveType.ADD, abstractC12782ctV != null ? abstractC12782ctV.QwvEab() : null);
        return Unit.INSTANCE;
    }
}
