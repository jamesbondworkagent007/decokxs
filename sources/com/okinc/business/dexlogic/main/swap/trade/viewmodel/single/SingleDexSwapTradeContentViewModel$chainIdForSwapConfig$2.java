package com.okinc.business.dexlogic.main.swap.trade.viewmodel.single;

import androidx.lifecycle.ViewModelKt;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import o.C22380heK;
import o.C23159hsv;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC19755gOc;
import o.InterfaceC22299hcj;
import o.pUU;

/* JADX INFO: loaded from: classes6.dex */
public final class SingleDexSwapTradeContentViewModel$chainIdForSwapConfig$2 extends SuspendLambda implements Function2<String, Continuation<? super Unit>, Object> {
    final /* synthetic */ InterfaceC19755gOc $preCheckRepository;
    final /* synthetic */ String $sourceType;
    final /* synthetic */ InterfaceC22299hcj $swapConfigRepository;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C23159hsv this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SingleDexSwapTradeContentViewModel$chainIdForSwapConfig$2(C23159hsv c23159hsv, String str, InterfaceC22299hcj interfaceC22299hcj, InterfaceC19755gOc interfaceC19755gOc, Continuation<? super SingleDexSwapTradeContentViewModel$chainIdForSwapConfig$2> continuation) {
        super(2, continuation);
        this.this$0 = c23159hsv;
        this.$sourceType = str;
        this.$swapConfigRepository = interfaceC22299hcj;
        this.$preCheckRepository = interfaceC19755gOc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SingleDexSwapTradeContentViewModel$chainIdForSwapConfig$2 singleDexSwapTradeContentViewModel$chainIdForSwapConfig$2 = new SingleDexSwapTradeContentViewModel$chainIdForSwapConfig$2(this.this$0, this.$sourceType, this.$swapConfigRepository, this.$preCheckRepository, continuation);
        singleDexSwapTradeContentViewModel$chainIdForSwapConfig$2.L$0 = obj;
        return singleDexSwapTradeContentViewModel$chainIdForSwapConfig$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(String str, Continuation<? super Unit> continuation) {
        return ((SingleDexSwapTradeContentViewModel$chainIdForSwapConfig$2) create(str, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            String str = (String) this.L$0;
            pUU.KWHzl("BaseSwapTradeViewModel", "chainId=" + str);
            if (str != null) {
                BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this.this$0), null, null, new AnonymousClass1(this.$sourceType, this.$swapConfigRepository, str, this.$preCheckRepository, this.this$0, null), 3, null);
                return Unit.INSTANCE;
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    /* JADX INFO: renamed from: com.okinc.business.dexlogic.main.swap.trade.viewmodel.single.SingleDexSwapTradeContentViewModel$chainIdForSwapConfig$2$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $chainId;
        final /* synthetic */ InterfaceC19755gOc $preCheckRepository;
        final /* synthetic */ String $sourceType;
        final /* synthetic */ InterfaceC22299hcj $swapConfigRepository;
        int label;
        final /* synthetic */ C23159hsv this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, InterfaceC22299hcj interfaceC22299hcj, String str2, InterfaceC19755gOc interfaceC19755gOc, C23159hsv c23159hsv, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$sourceType = str;
            this.$swapConfigRepository = interfaceC22299hcj;
            this.$chainId = str2;
            this.$preCheckRepository = interfaceC19755gOc;
            this.this$0 = c23159hsv;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$sourceType, this.$swapConfigRepository, this.$chainId, this.$preCheckRepository, this.this$0, continuation);
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
                C22380heK.OLrzqt.copydefault(this.$sourceType).djBIcL().gEmmrt().AEQbTJ();
                InterfaceC22299hcj interfaceC22299hcj = this.$swapConfigRepository;
                String str = this.$chainId;
                this.label = 1;
                if (interfaceC22299hcj.AEQbTJ(str, this) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                    ((Result) obj).m7386unboximpl();
                    return Unit.INSTANCE;
                }
                C56391yDq.AEQbTJ(obj);
                ((Result) obj).m7386unboximpl();
            }
            InterfaceC19755gOc interfaceC19755gOc = this.$preCheckRepository;
            String str2 = this.$chainId;
            String strQCjLjM = this.this$0.QCjLjM();
            this.label = 2;
            if (interfaceC19755gOc.OLrzqt(str2, strQCjLjM, this) == objCopydefault) {
                return objCopydefault;
            }
            return Unit.INSTANCE;
        }
    }
}
