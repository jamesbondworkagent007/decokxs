package com.okinc.business.defi.wallet.home.addressDetail;

import android.graphics.drawable.Drawable;
import com.okinc.business.defi.wallet.home.addressDetail.viewmodel.AddressProfileAssetInfoViewModel;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SharedFlow;
import o.C33129mqd;
import o.C55326xho;
import o.C56391yDq;
import o.C56442yFn;
import o.eVR;

/* JADX INFO: loaded from: classes5.dex */
public final class DefiWalletProfileAssetDetailFragment$initListener$7 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ eVR this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefiWalletProfileAssetDetailFragment$initListener$7(eVR evr, Continuation<? super DefiWalletProfileAssetDetailFragment$initListener$7> continuation) {
        super(2, continuation);
        this.this$0 = evr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DefiWalletProfileAssetDetailFragment$initListener$7(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DefiWalletProfileAssetDetailFragment$initListener$7) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            SharedFlow<AddressProfileAssetInfoViewModel.AliasUIState> sharedFlowCopydefault = this.this$0.valueOf().copydefault();
            final eVR evr = this.this$0;
            FlowCollector<? super AddressProfileAssetInfoViewModel.AliasUIState> flowCollector = new FlowCollector() { // from class: com.okinc.business.defi.wallet.home.addressDetail.DefiWalletProfileAssetDetailFragment$initListener$7.4
                /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
                public final Object emit(AddressProfileAssetInfoViewModel.AliasUIState aliasUIState, Continuation<? super Unit> continuation) {
                    if (aliasUIState instanceof AddressProfileAssetInfoViewModel.AliasUIState.StateListAnimator) {
                        evr.EZpvd(((AddressProfileAssetInfoViewModel.AliasUIState.StateListAnimator) aliasUIState).KWHzl());
                    } else if (aliasUIState instanceof AddressProfileAssetInfoViewModel.AliasUIState.Application) {
                        evr.EZpvd(((AddressProfileAssetInfoViewModel.AliasUIState.Application) aliasUIState).AEQbTJ());
                    } else if (aliasUIState instanceof AddressProfileAssetInfoViewModel.AliasUIState.TaskDescription) {
                        String strEZpvd = evr.EZpvd(((AddressProfileAssetInfoViewModel.AliasUIState.TaskDescription) aliasUIState).AEQbTJ());
                        if (C33129mqd.OLrzqt((CharSequence) strEZpvd)) {
                            C55326xho.toast$default(strEZpvd, (Drawable) null, 0, (Integer) null, 0, 0, 31, (Object) null);
                        }
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                    return Unit.INSTANCE;
                }
            };
            this.label = 1;
            if (sharedFlowCopydefault.collect(flowCollector, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        throw new KotlinNothingValueException();
    }
}
