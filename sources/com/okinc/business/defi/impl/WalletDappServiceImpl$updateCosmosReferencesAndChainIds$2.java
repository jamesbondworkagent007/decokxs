package com.okinc.business.defi.impl;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonObject;
import o.AbstractC43419rot;
import o.C13934dbu;
import o.C15935eaT;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;

/* JADX INFO: loaded from: classes4.dex */
public final class WalletDappServiceImpl$updateCosmosReferencesAndChainIds$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public WalletDappServiceImpl$updateCosmosReferencesAndChainIds$2(Continuation<? super WalletDappServiceImpl$updateCosmosReferencesAndChainIds$2> continuation) {
        super(2, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WalletDappServiceImpl$updateCosmosReferencesAndChainIds$2(continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((WalletDappServiceImpl$updateCosmosReferencesAndChainIds$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Set<Map.Entry<String, JsonElement>> setEntrySet;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                pUU.EZpvd("WalletDappServiceImpl", "updateCosmosReferencesAndChainIds start");
                C13934dbu c13934dbu = new C13934dbu();
                this.label = 1;
                obj = c13934dbu.gEmmrt(this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            AbstractC43419rot abstractC43419rot = (AbstractC43419rot) obj;
            if (abstractC43419rot.EZpvd()) {
                JsonObject jsonObject = (JsonObject) abstractC43419rot.copydefault();
                pUU.EZpvd("WalletDappServiceImpl", "Got result: " + jsonObject);
                if (jsonObject != null && (setEntrySet = jsonObject.entrySet()) != null) {
                    Iterator<T> it = setEntrySet.iterator();
                    while (it.hasNext()) {
                        Map.Entry entry = (Map.Entry) it.next();
                        C15935eaT.ActionBar.getInstance$default(C15935eaT.Companion, null, 1, null).EZpvd().put(entry.getKey(), JsonElementKt.getJsonPrimitive((JsonElement) entry.getValue()).getContent());
                    }
                }
            } else {
                pUU.copydefault("WalletDappServiceImpl", "Failed to get cosmos chain ids");
            }
            pUU.EZpvd("WalletDappServiceImpl", "updateCosmosReferencesAndChainIds completed");
        } catch (Exception e) {
            pUU.AEQbTJ("WalletDappServiceImpl", "updateCosmosReferencesAndChainIds failed", e);
        }
        return Unit.INSTANCE;
    }
}
