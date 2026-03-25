package com.okinc.business.invest_biz.repository;

import android.content.Context;
import androidx.fragment.app.FragmentManager;
import com.okinc.business.invest_biz.data.bean.TokenInvestDetail;
import com.okinc.business.invest_biz.data.bean.TokenInvestDetailResponse;
import com.okinc.business.invest_biz.ui.screens.base_transaction.model.InvestPageSource;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import o.AbstractActivityC33041mov;
import o.AbstractC32996moC;
import o.C23944iPc;
import o.C33129mqd;
import o.C56391yDq;
import o.C56402yEa;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC33075mpc;
import o.iGF;
import o.iON;
import o.iOZ;

/* JADX INFO: loaded from: classes23.dex */
public final class InvestIndependentCheckFlowRepository$startSignalCheckInvestFlow$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ FragmentManager $fragmentManager;
    final /* synthetic */ boolean $hasMultipleProtocols;
    final /* synthetic */ long $investmentId;
    final /* synthetic */ CoroutineScope $lifecycleScope;
    int label;
    final /* synthetic */ C23944iPc this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvestIndependentCheckFlowRepository$startSignalCheckInvestFlow$1(C23944iPc c23944iPc, long j, Context context, FragmentManager fragmentManager, CoroutineScope coroutineScope, boolean z, Continuation<? super InvestIndependentCheckFlowRepository$startSignalCheckInvestFlow$1> continuation) {
        super(2, continuation);
        this.this$0 = c23944iPc;
        this.$investmentId = j;
        this.$context = context;
        this.$fragmentManager = fragmentManager;
        this.$lifecycleScope = coroutineScope;
        this.$hasMultipleProtocols = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new InvestIndependentCheckFlowRepository$startSignalCheckInvestFlow$1(this.this$0, this.$investmentId, this.$context, this.$fragmentManager, this.$lifecycleScope, this.$hasMultipleProtocols, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((InvestIndependentCheckFlowRepository$startSignalCheckInvestFlow$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objKWHzl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            iGF igf = this.this$0.AEQbTJ;
            List<String> listEZpvd = C56402yEa.EZpvd(C33129mqd.gEmmrt(C56443yFo.KWHzl(this.$investmentId)));
            this.label = 1;
            objKWHzl = igf.KWHzl(listEZpvd, this);
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
        Object obj2 = objKWHzl;
        MainCoroutineDispatcher main = Dispatchers.getMain();
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$context, obj2, this.$fragmentManager, this.$lifecycleScope, this.this$0, this.$investmentId, this.$hasMultipleProtocols, null);
        this.label = 2;
        if (BuildersKt.withContext(main, anonymousClass1, this) == objCopydefault) {
            return objCopydefault;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: com.okinc.business.invest_biz.repository.InvestIndependentCheckFlowRepository$startSignalCheckInvestFlow$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends TokenInvestDetailResponse>>, Object> {
        final /* synthetic */ Context $context;
        final /* synthetic */ FragmentManager $fragmentManager;
        final /* synthetic */ boolean $hasMultipleProtocols;
        final /* synthetic */ long $investmentId;
        final /* synthetic */ CoroutineScope $lifecycleScope;
        final /* synthetic */ Object $result;
        int label;
        final /* synthetic */ C23944iPc this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Context context, Object obj, FragmentManager fragmentManager, CoroutineScope coroutineScope, C23944iPc c23944iPc, long j, boolean z, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$context = context;
            this.$result = obj;
            this.$fragmentManager = fragmentManager;
            this.$lifecycleScope = coroutineScope;
            this.this$0 = c23944iPc;
            this.$investmentId = j;
            this.$hasMultipleProtocols = z;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$context, this.$result, this.$fragmentManager, this.$lifecycleScope, this.this$0, this.$investmentId, this.$hasMultipleProtocols, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends TokenInvestDetailResponse>> continuation) {
            return invoke2(coroutineScope, (Continuation<? super Result<TokenInvestDetailResponse>>) continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Result<TokenInvestDetailResponse>> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: android.content.Context */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                Object obj2 = this.$context;
                if ((obj2 instanceof AbstractC32996moC) || (obj2 instanceof AbstractActivityC33041mov)) {
                    ((InterfaceC33075mpc) obj2).showLoading(0L);
                }
                Object obj3 = this.$result;
                Context context = this.$context;
                FragmentManager fragmentManager = this.$fragmentManager;
                CoroutineScope coroutineScope = this.$lifecycleScope;
                C23944iPc c23944iPc = this.this$0;
                long j = this.$investmentId;
                boolean z = this.$hasMultipleProtocols;
                if (Result.m7384isSuccessimpl(obj3)) {
                    List<TokenInvestDetail> listOLrzqt = ((TokenInvestDetailResponse) obj3).OLrzqt();
                    TokenInvestDetail tokenInvestDetail = listOLrzqt != null ? (TokenInvestDetail) CollectionsKt___CollectionsKt.AkhnZx(listOLrzqt, 0) : null;
                    if ((context instanceof AbstractC32996moC) || (context instanceof AbstractActivityC33041mov)) {
                        ((InterfaceC33075mpc) context).dismissLoading();
                    }
                    if (tokenInvestDetail != null) {
                        new iOZ(c23944iPc.EZpvd, new iON(context, fragmentManager, coroutineScope)).OLrzqt(j, tokenInvestDetail, z, InvestPageSource.Home, null, null);
                    }
                }
                Object obj4 = this.$context;
                if (Result.m7380exceptionOrNullimpl(obj3) != null && ((obj4 instanceof AbstractC32996moC) || (obj4 instanceof AbstractActivityC33041mov))) {
                    ((InterfaceC33075mpc) obj4).dismissLoading();
                }
                return Result.m7376boximpl(obj3);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
