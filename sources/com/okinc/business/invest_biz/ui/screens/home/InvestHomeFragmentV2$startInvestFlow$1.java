package com.okinc.business.invest_biz.ui.screens.home;

import com.okinc.business.invest_biz.data.bean.TokenInvestDetail;
import com.okinc.business.invest_biz.data.bean.TokenInvestDetailResponse;
import com.okinc.business.invest_biz.ui.screens.base_transaction.model.InvestPageSource;
import com.okinc.business.invest_biz.ui.screens.base_transaction.model.TransactionConfig;
import com.okinc.business.invest_biz.ui.screens.home.InvestHomeFragmentV2$startInvestFlow$1;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import o.C26588jfE;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes6.dex */
public final class InvestHomeFragmentV2$startInvestFlow$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $hasMultipleProtocols;
    final /* synthetic */ long $investmentId;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ InvestHomeFragmentV2 this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvestHomeFragmentV2$startInvestFlow$1(InvestHomeFragmentV2 investHomeFragmentV2, long j, boolean z, Continuation<? super InvestHomeFragmentV2$startInvestFlow$1> continuation) {
        super(2, continuation);
        this.this$0 = investHomeFragmentV2;
        this.$investmentId = j;
        this.$hasMultipleProtocols = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new InvestHomeFragmentV2$startInvestFlow$1(this.this$0, this.$investmentId, this.$hasMultipleProtocols, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((InvestHomeFragmentV2$startInvestFlow$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r13v16, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r13v17, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r13v27, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r7v1, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r7v8, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c9 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Ref.ObjectRef objectRef;
        T t;
        Ref.ObjectRef objectRef2;
        Object objOLrzqt;
        Ref.ObjectRef objectRef3;
        Object next;
        MainCoroutineDispatcher main;
        AnonymousClass1 anonymousClass1;
        List<TokenInvestDetail> listOLrzqt;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            objectRef = new Ref.ObjectRef();
            List<TokenInvestDetail> value = this.this$0.valueOf().fetchVPNInfo().getValue();
            if (value != null) {
                long j = this.$investmentId;
                Iterator<T> it = value.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (j == ((TokenInvestDetail) next).AEQbTJ()) {
                        break;
                    }
                }
                t = (TokenInvestDetail) next;
            } else {
                t = 0;
            }
            objectRef.element = t;
            if (t == 0) {
                this.this$0.showLoading();
                InvestHomeV2ViewModel investHomeV2ViewModelValueOf = this.this$0.valueOf();
                long j2 = this.$investmentId;
                this.L$0 = objectRef;
                this.L$1 = objectRef;
                this.label = 1;
                objOLrzqt = investHomeV2ViewModelValueOf.OLrzqt(j2, this);
                if (objOLrzqt == objCopydefault) {
                    return objCopydefault;
                }
                objectRef3 = objectRef;
            } else {
                objectRef2 = objectRef;
                main = Dispatchers.getMain();
                anonymousClass1 = new AnonymousClass1(objectRef2, this.this$0, this.$investmentId, this.$hasMultipleProtocols, null);
                this.L$0 = null;
                this.L$1 = null;
                this.label = 2;
                if (BuildersKt.withContext(main, anonymousClass1, this) == objCopydefault) {
                    return objCopydefault;
                }
                return Unit.INSTANCE;
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
            C56391yDq.AEQbTJ(obj);
            objOLrzqt = ((Result) obj).m7386unboximpl();
        }
        if (Result.m7383isFailureimpl(objOLrzqt)) {
            objOLrzqt = null;
        }
        TokenInvestDetailResponse tokenInvestDetailResponse = (TokenInvestDetailResponse) objOLrzqt;
        objectRef.element = (tokenInvestDetailResponse == null || (listOLrzqt = tokenInvestDetailResponse.OLrzqt()) == null) ? 0 : (TokenInvestDetail) CollectionsKt___CollectionsKt.AkhnZx(listOLrzqt, 0);
        this.this$0.dismissLoading();
        objectRef2 = objectRef3;
        main = Dispatchers.getMain();
        anonymousClass1 = new AnonymousClass1(objectRef2, this.this$0, this.$investmentId, this.$hasMultipleProtocols, null);
        this.L$0 = null;
        this.L$1 = null;
        this.label = 2;
        if (BuildersKt.withContext(main, anonymousClass1, this) == objCopydefault) {
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: com.okinc.business.invest_biz.ui.screens.home.InvestHomeFragmentV2$startInvestFlow$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Ref.ObjectRef<TokenInvestDetail> $detail;
        final /* synthetic */ boolean $hasMultipleProtocols;
        final /* synthetic */ long $investmentId;
        int label;
        final /* synthetic */ InvestHomeFragmentV2 this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Ref.ObjectRef<TokenInvestDetail> objectRef, InvestHomeFragmentV2 investHomeFragmentV2, long j, boolean z, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$detail = objectRef;
            this.this$0 = investHomeFragmentV2;
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
                    C26588jfE c26588jfEFJNWhG = this.this$0.fJNWhG();
                    long j = this.$investmentId;
                    TokenInvestDetail tokenInvestDetail = this.$detail.element;
                    boolean z = this.$hasMultipleProtocols;
                    InvestPageSource investPageSource = InvestPageSource.Home;
                    final InvestHomeFragmentV2 investHomeFragmentV2 = this.this$0;
                    c26588jfEFJNWhG.copydefault(j, tokenInvestDetail, (68 & 4) != 0 ? false : z, (68 & 8) != 0 ? InvestPageSource.Default : investPageSource, (68 & 16) != 0 ? null : new Function1() { // from class: o.jcW
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            return InvestHomeFragmentV2$startInvestFlow$1.AnonymousClass1.invokeSuspend$lambda$0(investHomeFragmentV2, (TransactionConfig) obj2);
                        }
                    }, (68 & 32) != 0 ? null : null, (68 & 64) != 0 ? false : false);
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$0(InvestHomeFragmentV2 investHomeFragmentV2, TransactionConfig transactionConfig) {
            investHomeFragmentV2.valueOf().values();
            return Unit.INSTANCE;
        }
    }
}
