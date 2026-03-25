package com.okinc.business.invest_biz.mln.service;

import com.okinc.business.invest_biz.ui.widget.product_details.ProductDetailsClickAction;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import o.C23927iOm;
import o.C23936iOv;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes23.dex */
public final class DeFiLuaDataService$showHistoryActivity$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ long $chainId;
    final /* synthetic */ int $investType;
    final /* synthetic */ long $investmentId;
    final /* synthetic */ int $poolVersion;
    int label;
    final /* synthetic */ C23936iOv this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeFiLuaDataService$showHistoryActivity$1(C23936iOv c23936iOv, long j, long j2, int i, int i2, Continuation<? super DeFiLuaDataService$showHistoryActivity$1> continuation) {
        super(2, continuation);
        this.this$0 = c23936iOv;
        this.$investmentId = j;
        this.$chainId = j2;
        this.$investType = i;
        this.$poolVersion = i2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DeFiLuaDataService$showHistoryActivity$1(this.this$0, this.$investmentId, this.$chainId, this.$investType, this.$poolVersion, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DeFiLuaDataService$showHistoryActivity$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.business.invest_biz.mln.service.DeFiLuaDataService$showHistoryActivity$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ long $chainId;
        final /* synthetic */ int $investType;
        final /* synthetic */ long $investmentId;
        final /* synthetic */ int $poolVersion;
        int label;
        final /* synthetic */ C23936iOv this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(C23936iOv c23936iOv, long j, long j2, int i, int i2, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = c23936iOv;
            this.$investmentId = j;
            this.$chainId = j2;
            this.$investType = i;
            this.$poolVersion = i2;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$investmentId, this.$chainId, this.$investType, this.$poolVersion, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                C23927iOm c23927iOm = this.this$0.AEQbTJ;
                if (c23927iOm != null) {
                    c23927iOm.KWHzl(new ProductDetailsClickAction.TaskDescription(this.$investmentId, this.$chainId, this.$investType, this.$poolVersion));
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            MainCoroutineDispatcher main = Dispatchers.getMain();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$investmentId, this.$chainId, this.$investType, this.$poolVersion, null);
            this.label = 1;
            if (BuildersKt.withContext(main, anonymousClass1, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return Unit.INSTANCE;
    }
}
