package com.okinc.business.defi.wallet.mine.search.ui.view;

import androidx.recyclerview.widget.RecyclerView;
import com.okinc.business.defi.wallet.mine.search.data.model.SearchRecommendResponse;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import o.C16629enY;
import o.C18980fse;
import o.C18982fsg;
import o.C18995fst;
import o.C19056fuA;
import o.C55113xdn;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes5.dex */
public final class WalletSearchAllResultFragment$addDataListener$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ C19056fuA this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletSearchAllResultFragment$addDataListener$2(C19056fuA c19056fuA, Continuation<? super WalletSearchAllResultFragment$addDataListener$2> continuation) {
        super(2, continuation);
        this.this$0 = c19056fuA;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WalletSearchAllResultFragment$addDataListener$2(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((WalletSearchAllResultFragment$addDataListener$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.business.defi.wallet.mine.search.ui.view.WalletSearchAllResultFragment$addDataListener$2$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<C18980fse, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ C19056fuA this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(C19056fuA c19056fuA, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = c19056fuA;
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
        public final Object invoke(C18980fse c18980fse, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(c18980fse, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            RecyclerView recyclerView;
            C55113xdn c55113xdn;
            RecyclerView recyclerView2;
            C55113xdn c55113xdn2;
            RecyclerView recyclerView3;
            C55113xdn c55113xdn3;
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                C18980fse c18980fse = (C18980fse) this.L$0;
                if (c18980fse.djBIcL()) {
                    C16629enY c16629enY = this.this$0.AhwBna;
                    if (c16629enY != null && (c55113xdn3 = c16629enY.AEQbTJ) != null) {
                        c55113xdn3.setVisibility(0);
                    }
                    C16629enY c16629enY2 = this.this$0.AhwBna;
                    if (c16629enY2 != null && (recyclerView3 = c16629enY2.EZpvd) != null) {
                        recyclerView3.setVisibility(4);
                    }
                    return Unit.INSTANCE;
                }
                if (c18980fse.gEmmrt()) {
                    C16629enY c16629enY3 = this.this$0.AhwBna;
                    if (c16629enY3 != null && (c55113xdn2 = c16629enY3.AEQbTJ) != null) {
                        c55113xdn2.setVisibility(8);
                    }
                    C16629enY c16629enY4 = this.this$0.AhwBna;
                    if (c16629enY4 != null && (recyclerView2 = c16629enY4.EZpvd) != null) {
                        recyclerView2.setVisibility(0);
                    }
                    return Unit.INSTANCE;
                }
                C16629enY c16629enY5 = this.this$0.AhwBna;
                if (c16629enY5 != null && (c55113xdn = c16629enY5.AEQbTJ) != null) {
                    c55113xdn.setVisibility(8);
                }
                C16629enY c16629enY6 = this.this$0.AhwBna;
                if (c16629enY6 != null && (recyclerView = c16629enY6.EZpvd) != null) {
                    recyclerView.setVisibility(0);
                }
                if (c18980fse.AYXKKw() == null) {
                    return Unit.INSTANCE;
                }
                C19056fuA c19056fuA = this.this$0;
                List<C18982fsg> listAYXKKw = c18980fse.AYXKKw();
                C18995fst value = this.this$0.isConnected().KWHzl().getValue();
                SearchRecommendResponse searchRecommendResponseEZpvd = value != null ? value.EZpvd() : null;
                C18995fst value2 = this.this$0.isConnected().KWHzl().getValue();
                c19056fuA.copydefault(listAYXKKw, searchRecommendResponseEZpvd, value2 != null ? value2.KWHzl() : null, c18980fse.KWHzl(), c18980fse.OLrzqt(), c18980fse.EZpvd(), true);
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
            SharedFlow<C18980fse> sharedFlowKWHzl = this.this$0.DbNXlk().KWHzl();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
            this.label = 1;
            if (FlowKt.collectLatest(sharedFlowKWHzl, anonymousClass1, this) == objCopydefault) {
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
