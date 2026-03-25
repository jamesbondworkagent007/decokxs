package com.okinc.business.defi.wallet.common.okxconnect.util;

import com.okinc.business.defi.wallet.common.okxconnect.util.DAppConnectRequestHelper$updateCosmosReferencesAndChainIds$2;
import com.okinc.network.okg.response.ResponseData;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.reactive.AwaitKt;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonObject;
import o.AbstractC58185ywX;
import o.C15935eaT;
import o.C16013ebs;
import o.C43423rox;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;

/* JADX INFO: loaded from: classes4.dex */
public final class DAppConnectRequestHelper$updateCosmosReferencesAndChainIds$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ C16013ebs this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DAppConnectRequestHelper$updateCosmosReferencesAndChainIds$2(C16013ebs c16013ebs, Continuation<? super DAppConnectRequestHelper$updateCosmosReferencesAndChainIds$2> continuation) {
        super(2, continuation);
        this.this$0 = c16013ebs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DAppConnectRequestHelper$updateCosmosReferencesAndChainIds$2(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DAppConnectRequestHelper$updateCosmosReferencesAndChainIds$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Set<Map.Entry<String, JsonElement>> setEntrySet;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                C16013ebs c16013ebs = this.this$0;
                Result.Application application = Result.Companion;
                AbstractC58185ywX abstractC58185ywXOLrzqt = C43423rox.OLrzqt(c16013ebs.values.AYXKKw(), new Function1() { // from class: o.ebD
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return java.lang.Boolean.valueOf(DAppConnectRequestHelper$updateCosmosReferencesAndChainIds$2.invokeSuspend$lambda$1$lambda$0((ResponseData) obj2));
                    }
                });
                this.label = 1;
                obj = AwaitKt.awaitFirst(abstractC58185ywXOLrzqt, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            objM7377constructorimpl = Result.m7377constructorimpl((JsonObject) obj);
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            pUU.AEQbTJ("DAppConnectRequestHelper", "getCosmosChainIds API failed", thM7380exceptionOrNullimpl);
        }
        if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
            objM7377constructorimpl = null;
        }
        JsonObject jsonObject = (JsonObject) objM7377constructorimpl;
        if (jsonObject == null || (setEntrySet = jsonObject.entrySet()) == null) {
            return null;
        }
        Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            C15935eaT.ActionBar.getInstance$default(C15935eaT.Companion, null, 1, null).EZpvd().put(entry.getKey(), JsonElementKt.getJsonPrimitive((JsonElement) entry.getValue()).getContent());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean invokeSuspend$lambda$1$lambda$0(ResponseData responseData) {
        return responseData.getCode() == 0 && responseData.getData() != null;
    }
}
