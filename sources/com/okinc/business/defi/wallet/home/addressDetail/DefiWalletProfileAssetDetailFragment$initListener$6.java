package com.okinc.business.defi.wallet.home.addressDetail;

import android.graphics.drawable.Drawable;
import com.okinc.business.defi.wallet.home.addressDetail.viewmodel.AddressProfileAssetInfoViewModel;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import o.C33129mqd;
import o.C55326xho;
import o.C56391yDq;
import o.C56442yFn;
import o.eVR;

/* JADX INFO: loaded from: classes5.dex */
public final class DefiWalletProfileAssetDetailFragment$initListener$6 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ eVR this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefiWalletProfileAssetDetailFragment$initListener$6(eVR evr, Continuation<? super DefiWalletProfileAssetDetailFragment$initListener$6> continuation) {
        super(2, continuation);
        this.this$0 = evr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DefiWalletProfileAssetDetailFragment$initListener$6(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DefiWalletProfileAssetDetailFragment$initListener$6) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.business.defi.wallet.home.addressDetail.DefiWalletProfileAssetDetailFragment$initListener$6$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<AddressProfileAssetInfoViewModel.NotificationState, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ eVR this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(eVR evr, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = evr;
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
        public final Object invoke(AddressProfileAssetInfoViewModel.NotificationState notificationState, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(notificationState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Integer numOLrzqt;
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                AddressProfileAssetInfoViewModel.NotificationState notificationState = (AddressProfileAssetInfoViewModel.NotificationState) this.L$0;
                if (notificationState instanceof AddressProfileAssetInfoViewModel.NotificationState.TaskDescription) {
                    this.this$0.AEQbTJ(((AddressProfileAssetInfoViewModel.NotificationState.TaskDescription) notificationState).KWHzl());
                } else {
                    if (!(notificationState instanceof AddressProfileAssetInfoViewModel.NotificationState.Activity)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    AddressProfileAssetInfoViewModel.NotificationState.Activity activity = (AddressProfileAssetInfoViewModel.NotificationState.Activity) notificationState;
                    String strEZpvd = this.this$0.EZpvd(activity.OLrzqt());
                    if (C33129mqd.OLrzqt((CharSequence) strEZpvd)) {
                        C55326xho.toast$default(strEZpvd, (Drawable) null, 0, (Integer) null, 0, 0, 31, (Object) null);
                    }
                    Integer numOLrzqt2 = activity.OLrzqt();
                    if ((numOLrzqt2 != null && numOLrzqt2.intValue() == 10060) || ((numOLrzqt = activity.OLrzqt()) != null && numOLrzqt.intValue() == 10061)) {
                        eVR evr = this.this$0;
                        this.label = 1;
                        if (evr.EZpvd(false, (Continuation<? super Unit>) this) == objCopydefault) {
                            return objCopydefault;
                        }
                    }
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

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            SharedFlow<AddressProfileAssetInfoViewModel.NotificationState> sharedFlowAEQbTJ = this.this$0.valueOf().AEQbTJ();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
            this.label = 1;
            if (FlowKt.collectLatest(sharedFlowAEQbTJ, anonymousClass1, this) == objCopydefault) {
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
