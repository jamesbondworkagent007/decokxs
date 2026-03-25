package com.okinc.business.invest_biz.mln.service;

import com.okinc.business.invest_biz.data.contants.InvestmentKind;
import com.okinc.business.invest_biz.ui.widget.product_details.ProductDetailsClickAction;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import o.C23673iFb;
import o.C23678iFg;
import o.C23927iOm;
import o.C23936iOv;
import o.C56391yDq;
import o.C56442yFn;
import o.iOG;

/* JADX INFO: loaded from: classes23.dex */
public final class DeFiLuaDataService$showTvlDialog$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ long $investmentId;
    final /* synthetic */ InvestmentKind $kind;
    int label;
    final /* synthetic */ C23936iOv this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeFiLuaDataService$showTvlDialog$1(C23936iOv c23936iOv, long j, InvestmentKind investmentKind, Continuation<? super DeFiLuaDataService$showTvlDialog$1> continuation) {
        super(2, continuation);
        this.this$0 = c23936iOv;
        this.$investmentId = j;
        this.$kind = investmentKind;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DeFiLuaDataService$showTvlDialog$1(this.this$0, this.$investmentId, this.$kind, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DeFiLuaDataService$showTvlDialog$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objKWHzl;
        String strAEQbTJ;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            iOG iog = this.this$0.EZpvd;
            long j = this.$investmentId;
            InvestmentKind investmentKind = this.$kind;
            this.label = 1;
            objKWHzl = iog.KWHzl(j, investmentKind, this);
            if (objKWHzl == objCopydefault) {
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
            objKWHzl = ((Result) obj).m7386unboximpl();
        }
        if (Result.m7383isFailureimpl(objKWHzl)) {
            objKWHzl = null;
        }
        C23673iFb c23673iFb = (C23673iFb) objKWHzl;
        if (c23673iFb == null) {
            return Unit.INSTANCE;
        }
        C23678iFg c23678iFgCopydefault = c23673iFb.copydefault();
        if (c23678iFgCopydefault == null || (strAEQbTJ = c23678iFgCopydefault.AEQbTJ()) == null) {
            return Unit.INSTANCE;
        }
        MainCoroutineDispatcher main = Dispatchers.getMain();
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$investmentId, strAEQbTJ, null);
        this.label = 2;
        if (BuildersKt.withContext(main, anonymousClass1, this) == objCopydefault) {
            return objCopydefault;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: com.okinc.business.invest_biz.mln.service.DeFiLuaDataService$showTvlDialog$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ long $investmentId;
        final /* synthetic */ String $tvl;
        int label;
        final /* synthetic */ C23936iOv this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(C23936iOv c23936iOv, long j, String str, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = c23936iOv;
            this.$investmentId = j;
            this.$tvl = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$investmentId, this.$tvl, continuation);
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
                    c23927iOm.KWHzl(new ProductDetailsClickAction.Fragment(this.$investmentId, this.$tvl));
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
