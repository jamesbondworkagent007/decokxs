package com.okinc.business.defi.wallet.home.addressDetail.ui;

import com.okinc.business.defi.biz.net.bean.AddressCoinBalanceDetail;
import com.okinc.business.defi.biz.net.bean.AddressTokenAsset;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import o.ActivityC15870eYi;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;

/* JADX INFO: loaded from: classes18.dex */
public final class ProfileAssetCoinDetailActivity$initFlowListener$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ ActivityC15870eYi this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfileAssetCoinDetailActivity$initFlowListener$1(ActivityC15870eYi activityC15870eYi, Continuation<? super ProfileAssetCoinDetailActivity$initFlowListener$1> continuation) {
        super(2, continuation);
        this.this$0 = activityC15870eYi;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ProfileAssetCoinDetailActivity$initFlowListener$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ProfileAssetCoinDetailActivity$initFlowListener$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.business.defi.wallet.home.addressDetail.ui.ProfileAssetCoinDetailActivity$initFlowListener$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<AddressTokenAsset, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ ActivityC15870eYi this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ActivityC15870eYi activityC15870eYi, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = activityC15870eYi;
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
        public final Object invoke(AddressTokenAsset addressTokenAsset, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(addressTokenAsset, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            List<AddressCoinBalanceDetail> coinBalanceDetails;
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                AddressTokenAsset addressTokenAsset = (AddressTokenAsset) this.L$0;
                if (addressTokenAsset == null) {
                    return Unit.INSTANCE;
                }
                List<AddressCoinBalanceDetail> coinBalanceDetails2 = addressTokenAsset.getCoinBalanceDetails();
                Integer numAEQbTJ = coinBalanceDetails2 != null ? C56443yFo.AEQbTJ(coinBalanceDetails2.size()) : null;
                AddressTokenAsset addressTokenAsset2 = this.this$0.valueOf;
                if (Intrinsics.EZpvd(numAEQbTJ, (addressTokenAsset2 == null || (coinBalanceDetails = addressTokenAsset2.getCoinBalanceDetails()) == null) ? null : C56443yFo.AEQbTJ(coinBalanceDetails.size()))) {
                    String currencyAmount = addressTokenAsset.getCurrencyAmount();
                    AddressTokenAsset addressTokenAsset3 = this.this$0.valueOf;
                    if (Intrinsics.EZpvd((Object) currencyAmount, (Object) (addressTokenAsset3 != null ? addressTokenAsset3.getCurrencyAmount() : null))) {
                        return Unit.INSTANCE;
                    }
                }
                this.this$0.valueOf = addressTokenAsset;
                this.this$0.djBIcL();
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
            MutableSharedFlow<AddressTokenAsset> mutableSharedFlowAEQbTJ = this.this$0.AEQbTJ().AEQbTJ();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
            this.label = 1;
            if (FlowKt.collectLatest(mutableSharedFlowAEQbTJ, anonymousClass1, this) == objCopydefault) {
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
