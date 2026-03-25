package com.okinc.business.defi.wallet.switchComponent.fragments;

import androidx.fragment.app.Fragment;
import com.okinc.uilab.list.OKAnchorSelection;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import o.C17748fQv;
import o.C56391yDq;
import o.C56442yFn;
import o.fRN;
import o.rVN;
import o.yDY;

/* JADX INFO: loaded from: classes5.dex */
public final class CurrentWalletSelectNetworkFragment$observeNetworkResults$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ OKAnchorSelection $anchorSelection;
    int label;
    final /* synthetic */ C17748fQv this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CurrentWalletSelectNetworkFragment$observeNetworkResults$1(C17748fQv c17748fQv, OKAnchorSelection oKAnchorSelection, Continuation<? super CurrentWalletSelectNetworkFragment$observeNetworkResults$1> continuation) {
        super(2, continuation);
        this.this$0 = c17748fQv;
        this.$anchorSelection = oKAnchorSelection;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CurrentWalletSelectNetworkFragment$observeNetworkResults$1(this.this$0, this.$anchorSelection, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CurrentWalletSelectNetworkFragment$observeNetworkResults$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.business.defi.wallet.switchComponent.fragments.CurrentWalletSelectNetworkFragment$observeNetworkResults$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<fRN.Application, Continuation<? super Unit>, Object> {
        final /* synthetic */ OKAnchorSelection $anchorSelection;
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ C17748fQv this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(OKAnchorSelection oKAnchorSelection, C17748fQv c17748fQv, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$anchorSelection = oKAnchorSelection;
            this.this$0 = c17748fQv;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$anchorSelection, this.this$0, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(fRN.Application application, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(application, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                fRN.Application application = (fRN.Application) this.L$0;
                if (application == null) {
                    return Unit.INSTANCE;
                }
                Map<String, List<fRN.ActionBar>> mapKWHzl = application.KWHzl();
                List<fRN.ActionBar> listEZpvd = application.EZpvd();
                List<fRN.ActionBar> listOLrzqt = application.OLrzqt();
                boolean z = listOLrzqt.size() + listEZpvd.size() <= 10;
                this.$anchorSelection.djBIcL().setVisibility(z ? 8 : 0);
                this.$anchorSelection.OLrzqt().setVisibility(z ? 8 : 0);
                boolean z2 = !z;
                this.$anchorSelection.setDividerLineVisibility(z2);
                C17748fQv c17748fQv = this.this$0;
                OKAnchorSelection oKAnchorSelection = this.$anchorSelection;
                if (z) {
                    listEZpvd = yDY.AhwBna();
                }
                c17748fQv.EZpvd(oKAnchorSelection, listEZpvd, mapKWHzl, z2);
                this.this$0.copydefault(this.$anchorSelection, (List<fRN.ActionBar>) listOLrzqt);
                rVN.reportFullyDrawn$default((Fragment) this.this$0, true, (String) null, 2, (Object) null);
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
            StateFlow<fRN.Application> stateFlowKWHzl = this.this$0.OLrzqt().KWHzl();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$anchorSelection, this.this$0, null);
            this.label = 1;
            if (FlowKt.collectLatest(stateFlowKWHzl, anonymousClass1, this) == objCopydefault) {
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
