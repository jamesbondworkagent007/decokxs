package com.okinc.buysell.ui.bsc.cryptolist;

import com.okinc.okex.lite.home.bean.LiteUserResidenceType;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import o.C32989mnw;
import o.C43251rlk;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC31670lzr;

/* JADX INFO: loaded from: classes18.dex */
public final class CryptoListBottomSheetViewModel$requestUserResidenceType$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ CryptoListBottomSheetViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CryptoListBottomSheetViewModel$requestUserResidenceType$1(CryptoListBottomSheetViewModel cryptoListBottomSheetViewModel, Continuation<? super CryptoListBottomSheetViewModel$requestUserResidenceType$1> continuation) {
        super(2, continuation);
        this.this$0 = cryptoListBottomSheetViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CryptoListBottomSheetViewModel$requestUserResidenceType$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CryptoListBottomSheetViewModel$requestUserResidenceType$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC31670lzr interfaceC31670lzr = (InterfaceC31670lzr) C43251rlk.copydefault(InterfaceC31670lzr.class);
            this.label = 1;
            obj = interfaceC31670lzr.AEQbTJ(this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
        }
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
        this.label = 2;
        if (FlowKt.collectLatest((Flow) obj, anonymousClass1, this) == objCopydefault) {
            return objCopydefault;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: com.okinc.buysell.ui.bsc.cryptolist.CryptoListBottomSheetViewModel$requestUserResidenceType$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<LiteUserResidenceType, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ CryptoListBottomSheetViewModel this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(CryptoListBottomSheetViewModel cryptoListBottomSheetViewModel, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = cryptoListBottomSheetViewModel;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiteUserResidenceType liteUserResidenceType, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(liteUserResidenceType, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                this.this$0.DbNXlk.setValue(new C32989mnw(C56443yFo.KWHzl(((LiteUserResidenceType) this.L$0) == LiteUserResidenceType.REQUIRING_WARNING)));
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
