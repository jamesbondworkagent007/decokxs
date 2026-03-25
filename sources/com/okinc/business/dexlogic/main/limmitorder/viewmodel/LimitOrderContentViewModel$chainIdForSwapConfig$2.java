package com.okinc.business.dexlogic.main.limmitorder.viewmodel;

import androidx.lifecycle.ViewModelKt;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import o.C22495hgT;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC22299hcj;
import o.pUU;

/* JADX INFO: loaded from: classes6.dex */
public final class LimitOrderContentViewModel$chainIdForSwapConfig$2 extends SuspendLambda implements Function2<String, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C22495hgT this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LimitOrderContentViewModel$chainIdForSwapConfig$2(C22495hgT c22495hgT, Continuation<? super LimitOrderContentViewModel$chainIdForSwapConfig$2> continuation) {
        super(2, continuation);
        this.this$0 = c22495hgT;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        LimitOrderContentViewModel$chainIdForSwapConfig$2 limitOrderContentViewModel$chainIdForSwapConfig$2 = new LimitOrderContentViewModel$chainIdForSwapConfig$2(this.this$0, continuation);
        limitOrderContentViewModel$chainIdForSwapConfig$2.L$0 = obj;
        return limitOrderContentViewModel$chainIdForSwapConfig$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(String str, Continuation<? super Unit> continuation) {
        return ((LimitOrderContentViewModel$chainIdForSwapConfig$2) create(str, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            String str = (String) this.L$0;
            pUU.KWHzl("LimitOrderContentViewModel", "chainId=" + str);
            if (str != null) {
                BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this.this$0), null, null, new AnonymousClass1(this.this$0, str, null), 3, null);
                C22495hgT c22495hgT = this.this$0;
                c22495hgT.copydefault(c22495hgT.fARcdN(), this.this$0.gwTjWJ());
                return Unit.INSTANCE;
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    /* JADX INFO: renamed from: com.okinc.business.dexlogic.main.limmitorder.viewmodel.LimitOrderContentViewModel$chainIdForSwapConfig$2$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $chainId;
        int label;
        final /* synthetic */ C22495hgT this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(C22495hgT c22495hgT, String str, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = c22495hgT;
            this.$chainId = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$chainId, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                InterfaceC22299hcj interfaceC22299hcj = this.this$0.accept;
                String str = this.$chainId;
                this.label = 1;
                if (interfaceC22299hcj.AEQbTJ(str, this) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                ((Result) obj).m7386unboximpl();
            }
            return Unit.INSTANCE;
        }
    }
}
