package com.okinc.business.defi.wallet.common.okxconnect.util;

import com.okinc.business.defi.wallet.common.okxconnect.model.DAppInfo;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.serialization.json.JsonObject;
import o.C15974ebF;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;

/* JADX INFO: loaded from: classes4.dex */
public final class DAppMethodHelper$onAptosInteraction$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends String>>, Object> {
    final /* synthetic */ String $caip2ChainId;
    final /* synthetic */ JsonObject $content;
    final /* synthetic */ DAppInfo $dAppInfo;
    final /* synthetic */ boolean $isBroadcastToBlockchain;
    final /* synthetic */ String $messageId;
    final /* synthetic */ String $walletId;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C15974ebF this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DAppMethodHelper$onAptosInteraction$2(C15974ebF c15974ebF, String str, JsonObject jsonObject, String str2, DAppInfo dAppInfo, boolean z, String str3, Continuation<? super DAppMethodHelper$onAptosInteraction$2> continuation) {
        super(2, continuation);
        this.this$0 = c15974ebF;
        this.$caip2ChainId = str;
        this.$content = jsonObject;
        this.$walletId = str2;
        this.$dAppInfo = dAppInfo;
        this.$isBroadcastToBlockchain = z;
        this.$messageId = str3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        DAppMethodHelper$onAptosInteraction$2 dAppMethodHelper$onAptosInteraction$2 = new DAppMethodHelper$onAptosInteraction$2(this.this$0, this.$caip2ChainId, this.$content, this.$walletId, this.$dAppInfo, this.$isBroadcastToBlockchain, this.$messageId, continuation);
        dAppMethodHelper$onAptosInteraction$2.L$0 = obj;
        return dAppMethodHelper$onAptosInteraction$2;
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
        return ((DAppMethodHelper$onAptosInteraction$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                C15974ebF c15974ebF = this.this$0;
                String str = this.$caip2ChainId;
                JsonObject jsonObject = this.$content;
                String str2 = this.$walletId;
                DAppInfo dAppInfo = this.$dAppInfo;
                boolean z = this.$isBroadcastToBlockchain;
                String str3 = this.$messageId;
                Result.Application application = Result.Companion;
                pUU.KWHzl("DAppMethodHelper", "Start onAptosInteraction");
                DAppMethodHelper$onAptosInteraction$2$1$1 dAppMethodHelper$onAptosInteraction$2$1$1 = new DAppMethodHelper$onAptosInteraction$2$1$1(c15974ebF, str, jsonObject, str2, dAppInfo, z, str3, null);
                this.label = 1;
                obj = c15974ebF.KWHzl(dAppMethodHelper$onAptosInteraction$2$1$1, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            objM7377constructorimpl = Result.m7377constructorimpl((String) obj);
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        return Result.m7376boximpl(objM7377constructorimpl);
    }
}
