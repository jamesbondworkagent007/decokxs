package com.okinc.business.invest_biz.ui.screens.defi_dashboard;

import com.okinc.business.invest_biz.data.bean.TokenInvestDetail;
import com.okinc.business.invest_biz.ui.screens.base_transaction.model.InvestPageSource;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import o.C24204iYt;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes6.dex */
public final class DashboardFragment$startRecommendInvestFlow$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $hasMultipleProtocols;
    final /* synthetic */ long $investmentId;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ DashboardFragment this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DashboardFragment$startRecommendInvestFlow$1(DashboardFragment dashboardFragment, long j, boolean z, Continuation<? super DashboardFragment$startRecommendInvestFlow$1> continuation) {
        super(2, continuation);
        this.this$0 = dashboardFragment;
        this.$investmentId = j;
        this.$hasMultipleProtocols = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DashboardFragment$startRecommendInvestFlow$1(this.this$0, this.$investmentId, this.$hasMultipleProtocols, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DashboardFragment$startRecommendInvestFlow$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r13v15, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r13v7, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r13v8, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Ref.ObjectRef objectRef;
        Ref.ObjectRef objectRef2;
        Ref.ObjectRef objectRef3;
        Object objM7386unboximpl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            objectRef = new Ref.ObjectRef();
            try {
                C24204iYt c24204iYtIsConnected = this.this$0.isConnected();
                long j = this.$investmentId;
                this.L$0 = objectRef;
                this.L$1 = objectRef;
                this.label = 1;
                Object objAEQbTJ = c24204iYtIsConnected.AEQbTJ(j, this);
                if (objAEQbTJ == objCopydefault) {
                    return objCopydefault;
                }
                objectRef3 = objectRef;
                objM7386unboximpl = objAEQbTJ;
            } catch (Exception unused) {
                objectRef2 = objectRef;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            }
            objectRef = (Ref.ObjectRef) this.L$1;
            objectRef3 = (Ref.ObjectRef) this.L$0;
            try {
                C56391yDq.AEQbTJ(obj);
                objM7386unboximpl = ((Result) obj).m7386unboximpl();
            } catch (Exception unused2) {
            }
        }
        boolean zM7383isFailureimpl = Result.m7383isFailureimpl(objM7386unboximpl);
        T t = objM7386unboximpl;
        if (zM7383isFailureimpl) {
            t = 0;
        }
        objectRef.element = t;
        objectRef2 = objectRef3;
        MainCoroutineDispatcher main = Dispatchers.getMain();
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(objectRef2, this.this$0, this.$investmentId, this.$hasMultipleProtocols, null);
        this.L$0 = null;
        this.L$1 = null;
        this.label = 2;
        if (BuildersKt.withContext(main, anonymousClass1, this) == objCopydefault) {
            return objCopydefault;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: com.okinc.business.invest_biz.ui.screens.defi_dashboard.DashboardFragment$startRecommendInvestFlow$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Ref.ObjectRef<TokenInvestDetail> $detail;
        final /* synthetic */ boolean $hasMultipleProtocols;
        final /* synthetic */ long $investmentId;
        int label;
        final /* synthetic */ DashboardFragment this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Ref.ObjectRef<TokenInvestDetail> objectRef, DashboardFragment dashboardFragment, long j, boolean z, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$detail = objectRef;
            this.this$0 = dashboardFragment;
            this.$investmentId = j;
            this.$hasMultipleProtocols = z;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$detail, this.this$0, this.$investmentId, this.$hasMultipleProtocols, continuation);
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
                if (this.$detail.element != null) {
                    this.this$0.valueOf().copydefault(this.$investmentId, this.$detail.element, (68 & 4) != 0 ? false : this.$hasMultipleProtocols, (68 & 8) != 0 ? InvestPageSource.Default : InvestPageSource.Home, (68 & 16) != 0 ? null : null, (68 & 32) != 0 ? null : null, (68 & 64) != 0 ? false : false);
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
