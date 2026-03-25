package com.okinc.business.defi.wallet.home.addressDetail.viewmodel;

import com.okinc.business.defi.wallet.home.addressDetail.viewmodel.AddressProfileAssetInfoViewModel;
import com.okinc.business.defi.wallet.home.bean.NotificationInfo;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes5.dex */
public final class AddressProfileAssetInfoViewModel$loadNotificationStatus$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $collectAddress;
    int label;
    final /* synthetic */ AddressProfileAssetInfoViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddressProfileAssetInfoViewModel$loadNotificationStatus$1(AddressProfileAssetInfoViewModel addressProfileAssetInfoViewModel, String str, Continuation<? super AddressProfileAssetInfoViewModel$loadNotificationStatus$1> continuation) {
        super(2, continuation);
        this.this$0 = addressProfileAssetInfoViewModel;
        this.$collectAddress = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AddressProfileAssetInfoViewModel$loadNotificationStatus$1(this.this$0, this.$collectAddress, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AddressProfileAssetInfoViewModel$loadNotificationStatus$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            String strAhwBna = this.this$0.AhwBna();
            if (strAhwBna == null || strAhwBna.length() == 0) {
                strAhwBna = "";
            }
            AddressProfileAssetInfoViewModel addressProfileAssetInfoViewModel = this.this$0;
            String str = this.$collectAddress;
            this.label = 1;
            obj = addressProfileAssetInfoViewModel.copydefault(strAhwBna, str, this);
            if (obj == objCopydefault) {
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
        }
        NotificationInfo notificationInfo = (NotificationInfo) obj;
        if (notificationInfo != null) {
            this.this$0.AkhnZx = notificationInfo.AEQbTJ() == 1;
            MutableSharedFlow mutableSharedFlow = this.this$0.AEQbTJ;
            AddressProfileAssetInfoViewModel.NotificationState.TaskDescription taskDescription = new AddressProfileAssetInfoViewModel.NotificationState.TaskDescription(notificationInfo.AEQbTJ() == 1);
            this.label = 2;
            if (mutableSharedFlow.emit(taskDescription, this) == objCopydefault) {
                return objCopydefault;
            }
        }
        return Unit.INSTANCE;
    }
}
