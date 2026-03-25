package com.okinc.business.trade.features.home.advanced.viewmodel.delegate;

import androidx.fragment.app.FragmentActivity;
import com.okinc.business.dex.trade.core.domain.model.V6BaseQuoteResponse;
import com.okinc.business.trade.features.home.advanced.viewmodel.delegate.AdvancedOrderSubmissionDelegate$proceedToOrder$1;
import com.okinc.business.trade.features.home.ui.cefi.common.AdvancedOrderType;
import com.okinc.business.trade.features.home.ui.cefi.data.AdvancedQuoteAndCallData;
import com.okinc.business.trade.features.home.ui.cefi.data.AdvancedQuoteUiData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C28231kTt;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;

/* JADX INFO: loaded from: classes7.dex */
public final class AdvancedOrderSubmissionDelegate$proceedToOrder$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ FragmentActivity $activity;
    final /* synthetic */ C28231kTt.ActionBar $callback;
    final /* synthetic */ C28231kTt.Activity $snapshot;
    int label;
    final /* synthetic */ C28231kTt this$0;

    /* JADX INFO: loaded from: classes23.dex */
    public final /* synthetic */ class TaskDescription {
        public static final /* synthetic */ int[] copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[AdvancedOrderType.values().length];
            try {
                iArr[AdvancedOrderType.MARKET.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AdvancedOrderType.LIMIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            copydefault = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdvancedOrderSubmissionDelegate$proceedToOrder$1(C28231kTt.ActionBar actionBar, C28231kTt.Activity activity, C28231kTt c28231kTt, FragmentActivity fragmentActivity, Continuation<? super AdvancedOrderSubmissionDelegate$proceedToOrder$1> continuation) {
        super(2, continuation);
        this.$callback = actionBar;
        this.$snapshot = activity;
        this.this$0 = c28231kTt;
        this.$activity = fragmentActivity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AdvancedOrderSubmissionDelegate$proceedToOrder$1(this.$callback, this.$snapshot, this.this$0, this.$activity, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AdvancedOrderSubmissionDelegate$proceedToOrder$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            this.$callback.EZpvd(true);
            this.$callback.AEQbTJ();
            int i2 = TaskDescription.copydefault[this.$snapshot.gEmmrt().ordinal()];
            if (i2 == 1) {
                AdvancedQuoteUiData advancedQuoteUiDataValueOf = this.$snapshot.valueOf();
                AdvancedQuoteAndCallData advancedQuoteAndCallDataKWHzl = advancedQuoteUiDataValueOf != null ? advancedQuoteUiDataValueOf.KWHzl() : null;
                AdvancedQuoteAndCallData.V6 v6 = advancedQuoteAndCallDataKWHzl instanceof AdvancedQuoteAndCallData.V6 ? (AdvancedQuoteAndCallData.V6) advancedQuoteAndCallDataKWHzl : null;
                if (v6 == null) {
                    return Unit.INSTANCE;
                }
                V6BaseQuoteResponse v6BaseQuoteResponseSSMYrx = v6.sSMYrx();
                if (this.$snapshot.ejfBZ() && this.$snapshot.AEQbTJ() && v6BaseQuoteResponseSSMYrx.isOKXPlatform() && (this.$snapshot.EZpvd() != null || !this.$snapshot.fJNWhG())) {
                    C28231kTt c28231kTt = this.this$0;
                    FragmentActivity fragmentActivity = this.$activity;
                    C28231kTt.Activity activity = this.$snapshot;
                    C28231kTt.ActionBar actionBar = this.$callback;
                    this.label = 1;
                    if (C28231kTt.submitTeeMarketOrder$default(c28231kTt, fragmentActivity, v6BaseQuoteResponseSSMYrx, activity, actionBar, false, this, 16, null) == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    C28231kTt.submitEoaOrder$default(this.this$0, this.$activity, v6BaseQuoteResponseSSMYrx, this.$snapshot, this.$callback, false, 16, null);
                }
            } else if (i2 == 2) {
                if (!this.$snapshot.ejfBZ()) {
                    pUU.copydefault("OrderSubmissionDelegate", "Feature flag turned off when submitting limit order");
                    this.this$0.EZpvd(new IllegalStateException("Feature flag turned off when submitting limit order"), this.$snapshot, this.$callback, new Function1() { // from class: o.kTz
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            return AdvancedOrderSubmissionDelegate$proceedToOrder$1.invokeSuspend$lambda$0(((java.lang.Boolean) obj2).booleanValue());
                        }
                    });
                    return Unit.INSTANCE;
                }
                if (this.$snapshot.AEQbTJ()) {
                    C28231kTt c28231kTt2 = this.this$0;
                    FragmentActivity fragmentActivity2 = this.$activity;
                    C28231kTt.Activity activity2 = this.$snapshot;
                    C28231kTt.ActionBar actionBar2 = this.$callback;
                    this.label = 2;
                    if (c28231kTt2.EZpvd(fragmentActivity2, activity2, actionBar2, false, (Continuation<? super Unit>) this) == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    pUU.copydefault("OrderSubmissionDelegate", "Smart account can't be used when submitting limit order");
                    this.this$0.EZpvd(new IllegalStateException("Smart account can't be used when submitting limit order"), this.$snapshot, this.$callback, new Function1() { // from class: o.kTC
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            return AdvancedOrderSubmissionDelegate$proceedToOrder$1.invokeSuspend$lambda$1(((java.lang.Boolean) obj2).booleanValue());
                        }
                    });
                    return Unit.INSTANCE;
                }
            }
        } else {
            if (i != 1 && i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(boolean z) {
        pUU.copydefault("OrderSubmissionDelegate", "ERROR - LIMIT Feature flag Retry -> Should NEVER reach here");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$1(boolean z) {
        pUU.copydefault("OrderSubmissionDelegate", "ERROR - LIMIT Smart Account Retry -> Should NEVER reach here");
        return Unit.INSTANCE;
    }
}
