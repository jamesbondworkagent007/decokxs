package com.okinc.business.invest_biz.mln.service;

import android.app.Activity;
import com.okinc.business.invest_biz.data.bean.InvestProductDetailResponse;
import com.okinc.business.invest_biz.data.contants.InvestmentKind;
import com.okinc.business.invest_biz.mln.service.DeFiLuaDataService$showDetailShare$1;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import o.C23936iOv;
import o.C27182jqP;
import o.C55296xhK;
import o.C56391yDq;
import o.C56442yFn;
import o.iOG;

/* JADX INFO: loaded from: classes23.dex */
public final class DeFiLuaDataService$showDetailShare$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Activity $activity;
    final /* synthetic */ long $investmentId;
    final /* synthetic */ InvestmentKind $kind;
    int label;
    final /* synthetic */ C23936iOv this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeFiLuaDataService$showDetailShare$1(C23936iOv c23936iOv, long j, InvestmentKind investmentKind, Activity activity, Continuation<? super DeFiLuaDataService$showDetailShare$1> continuation) {
        super(2, continuation);
        this.this$0 = c23936iOv;
        this.$investmentId = j;
        this.$kind = investmentKind;
        this.$activity = activity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DeFiLuaDataService$showDetailShare$1(this.this$0, this.$investmentId, this.$kind, this.$activity, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DeFiLuaDataService$showDetailShare$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objOLrzqt;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            iOG iog = this.this$0.EZpvd;
            long j = this.$investmentId;
            InvestmentKind investmentKind = this.$kind;
            this.label = 1;
            objOLrzqt = iog.OLrzqt(j, investmentKind, this);
            if (objOLrzqt == objCopydefault) {
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
            objOLrzqt = ((Result) obj).m7386unboximpl();
        }
        if (Result.m7383isFailureimpl(objOLrzqt)) {
            objOLrzqt = null;
        }
        InvestProductDetailResponse investProductDetailResponse = (InvestProductDetailResponse) objOLrzqt;
        if (investProductDetailResponse == null) {
            return Unit.INSTANCE;
        }
        MainCoroutineDispatcher main = Dispatchers.getMain();
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(investProductDetailResponse, this.$activity, null);
        this.label = 2;
        if (BuildersKt.withContext(main, anonymousClass1, this) == objCopydefault) {
            return objCopydefault;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: com.okinc.business.invest_biz.mln.service.DeFiLuaDataService$showDetailShare$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Activity $activity;
        final /* synthetic */ InvestProductDetailResponse $detailData;
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(InvestProductDetailResponse investProductDetailResponse, Activity activity, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$detailData = investProductDetailResponse;
            this.$activity = activity;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Activity invokeSuspend$lambda$0(Activity activity) {
            return activity;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$detailData, this.$activity, continuation);
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
                InvestProductDetailResponse investProductDetailResponse = this.$detailData;
                int iAEQbTJ = C55296xhK.AEQbTJ(this.$activity);
                final Activity activity = this.$activity;
                new C27182jqP(investProductDetailResponse, "Yield_Investment_Detail_Page_Channels", iAEQbTJ, new Function0() { // from class: o.iOt
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return DeFiLuaDataService$showDetailShare$1.AnonymousClass1.invokeSuspend$lambda$0(activity);
                    }
                }).KWHzl();
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
