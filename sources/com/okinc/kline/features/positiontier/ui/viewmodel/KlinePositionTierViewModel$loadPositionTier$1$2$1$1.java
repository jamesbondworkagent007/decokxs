package com.okinc.kline.features.positiontier.ui.viewmodel;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.biz.UserTierData;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlinx.coroutines.CoroutineScope;
import o.C36180oSf;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC49371unL;
import o.pUU;

/* JADX INFO: loaded from: classes8.dex */
public final class KlinePositionTierViewModel$loadPositionTier$1$2$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ResponseData<List<UserTierData>> $response;
    int label;
    final /* synthetic */ KlinePositionTierViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KlinePositionTierViewModel$loadPositionTier$1$2$1$1(ResponseData<List<UserTierData>> responseData, KlinePositionTierViewModel klinePositionTierViewModel, Continuation<? super KlinePositionTierViewModel$loadPositionTier$1$2$1$1> continuation) {
        super(2, continuation);
        this.$response = responseData;
        this.this$0 = klinePositionTierViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new KlinePositionTierViewModel$loadPositionTier$1$2$1$1(this.$response, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((KlinePositionTierViewModel$loadPositionTier$1$2$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            if (this.$response.getCode() == 0) {
                List<UserTierData> data = this.$response.getData();
                if (data != null && !data.isEmpty()) {
                    KlinePositionTierViewModel klinePositionTierViewModel = this.this$0;
                    AnonymousClass1 anonymousClass1 = new MutablePropertyReference1Impl() { // from class: com.okinc.kline.features.positiontier.ui.viewmodel.KlinePositionTierViewModel$loadPositionTier$1$2$1$1.1
                        @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
                        public Object get(Object obj2) {
                            return ((C36180oSf) obj2).EZpvd();
                        }

                        @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
                        public void set(Object obj2, Object obj3) {
                            ((C36180oSf) obj2).AEQbTJ((InterfaceC49371unL) obj3);
                        }
                    };
                    InterfaceC49371unL.Activity activity = new InterfaceC49371unL.Activity(data);
                    this.label = 1;
                    if (klinePositionTierViewModel.KWHzl(anonymousClass1, activity, this) == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    KlinePositionTierViewModel klinePositionTierViewModel2 = this.this$0;
                    AnonymousClass2 anonymousClass2 = new MutablePropertyReference1Impl() { // from class: com.okinc.kline.features.positiontier.ui.viewmodel.KlinePositionTierViewModel$loadPositionTier$1$2$1$1.2
                        @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
                        public Object get(Object obj2) {
                            return ((C36180oSf) obj2).EZpvd();
                        }

                        @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
                        public void set(Object obj2, Object obj3) {
                            ((C36180oSf) obj2).AEQbTJ((InterfaceC49371unL) obj3);
                        }
                    };
                    InterfaceC49371unL.TaskDescription taskDescription = new InterfaceC49371unL.TaskDescription(null, 1, null);
                    this.label = 2;
                    if (klinePositionTierViewModel2.KWHzl(anonymousClass2, taskDescription, this) == objCopydefault) {
                        return objCopydefault;
                    }
                }
            } else {
                pUU.copydefault("PositionTierViewModel", "loadPositionTier failed: " + this.$response.getMsg());
                KlinePositionTierViewModel klinePositionTierViewModel3 = this.this$0;
                AnonymousClass3 anonymousClass3 = new MutablePropertyReference1Impl() { // from class: com.okinc.kline.features.positiontier.ui.viewmodel.KlinePositionTierViewModel$loadPositionTier$1$2$1$1.3
                    @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
                    public Object get(Object obj2) {
                        return ((C36180oSf) obj2).EZpvd();
                    }

                    @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
                    public void set(Object obj2, Object obj3) {
                        ((C36180oSf) obj2).AEQbTJ((InterfaceC49371unL) obj3);
                    }
                };
                InterfaceC49371unL.Application application = new InterfaceC49371unL.Application(new Exception(this.$response.getMsg()), null, 2, null);
                this.label = 3;
                if (klinePositionTierViewModel3.KWHzl(anonymousClass3, application, this) == objCopydefault) {
                    return objCopydefault;
                }
            }
        } else {
            if (i != 1 && i != 2 && i != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return Unit.INSTANCE;
    }
}
