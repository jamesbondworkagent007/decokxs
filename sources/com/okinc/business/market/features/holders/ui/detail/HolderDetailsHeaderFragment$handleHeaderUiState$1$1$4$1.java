package com.okinc.business.market.features.holders.ui.detail;

import android.content.Context;
import androidx.fragment.app.FragmentManager;
import com.okinc.business.dexlogic.main.market.detail.TrackingAddressViewModel;
import com.okinc.business.market.features.holders.ui.detail.HolderDetailsHeaderFragment$handleHeaderUiState$1$1$4$1;
import com.okinc.business.market.features.holders.ui.detail.widget.HolderDetailsUiModel;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C43251rlk;
import o.C56391yDq;
import o.C56442yFn;
import o.gKN;
import o.jZE;

/* JADX INFO: loaded from: classes7.dex */
public final class HolderDetailsHeaderFragment$handleHeaderUiState$1$1$4$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ HolderDetailsUiModel $details;
    int label;
    final /* synthetic */ jZE this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HolderDetailsHeaderFragment$handleHeaderUiState$1$1$4$1(jZE jze, HolderDetailsUiModel holderDetailsUiModel, Continuation<? super HolderDetailsHeaderFragment$handleHeaderUiState$1$1$4$1> continuation) {
        super(2, continuation);
        this.this$0 = jze;
        this.$details = holderDetailsUiModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new HolderDetailsHeaderFragment$handleHeaderUiState$1$1$4$1(this.this$0, this.$details, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((HolderDetailsHeaderFragment$handleHeaderUiState$1$1$4$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            gKN gkn = (gKN) C43251rlk.copydefault(gKN.class);
            Context contextRequireContext = this.this$0.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            FragmentManager childFragmentManager = this.this$0.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
            String strValueOf = this.$details.OLrzqt().valueOf();
            boolean newProxyInstance = this.$details.OLrzqt().getNewProxyInstance();
            final HolderDetailsUiModel holderDetailsUiModel = this.$details;
            final jZE jze = this.this$0;
            Function1<? super Boolean, Unit> function1 = new Function1() { // from class: o.jZN
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return HolderDetailsHeaderFragment$handleHeaderUiState$1$1$4$1.invokeSuspend$lambda$0(holderDetailsUiModel, jze, ((java.lang.Boolean) obj2).booleanValue());
                }
            };
            this.label = 1;
            if (gkn.EZpvd(contextRequireContext, childFragmentManager, strValueOf, newProxyInstance, function1, this) == objCopydefault) {
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(HolderDetailsUiModel holderDetailsUiModel, jZE jze, boolean z) {
        if (holderDetailsUiModel.OLrzqt().getNewProxyInstance() != z) {
            TrackingAddressViewModel.reload$default(jze.AYXKKw(), false, 1, null);
        }
        return Unit.INSTANCE;
    }
}
