package com.okinc.planet.biz_content.publisher;

import com.okinc.planet.biz_content.input.data.InputDraft;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC47552tsK;
import o.C47793twn;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC47550tsI;
import o.pUU;

/* JADX INFO: loaded from: classes10.dex */
public final class PlanetPublisherViewModel$checkForRestorableDrafts$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ C47793twn this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlanetPublisherViewModel$checkForRestorableDrafts$1(C47793twn c47793twn, Continuation<? super PlanetPublisherViewModel$checkForRestorableDrafts$1> continuation) {
        super(2, continuation);
        this.this$0 = c47793twn;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PlanetPublisherViewModel$checkForRestorableDrafts$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PlanetPublisherViewModel$checkForRestorableDrafts$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            try {
                if (i == 0) {
                    C56391yDq.AEQbTJ(obj);
                    this.this$0.sSMYrx.setValue(C56443yFo.KWHzl(true));
                    InterfaceC47550tsI interfaceC47550tsI = this.this$0.aKErDB;
                    this.label = 1;
                    obj = interfaceC47550tsI.AEQbTJ(this);
                    if (obj == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                }
                AbstractC47552tsK abstractC47552tsK = (AbstractC47552tsK) obj;
                if (abstractC47552tsK.copydefault()) {
                    Intrinsics.copydefault(abstractC47552tsK, "");
                    InputDraft inputDraft = (InputDraft) ((AbstractC47552tsK.StateListAnimator) abstractC47552tsK).EZpvd();
                    if (inputDraft != null && inputDraft.needsRestore()) {
                        this.this$0.OcIXYQ.setValue(inputDraft);
                        return Unit.INSTANCE;
                    }
                }
            } catch (Exception e) {
                pUU.copydefault("PlanetPublisherViewModel", "Failed to check for restorable drafts: " + e);
            }
            this.this$0.sSMYrx.setValue(C56443yFo.KWHzl(false));
            return Unit.INSTANCE;
        } finally {
            this.this$0.sSMYrx.setValue(C56443yFo.KWHzl(false));
        }
    }
}
