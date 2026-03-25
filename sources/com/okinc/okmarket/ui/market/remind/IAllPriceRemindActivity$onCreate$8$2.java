package com.okinc.okmarket.ui.market.remind;

import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.market.common.biz_spot.bean.InstrumentActiveInfo;
import com.okinc.market.common.service.BizMarketService;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.okmarket.ui.market.remind.IAllPriceRemindActivity$onCreate$8$2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DebugKt;
import o.AbstractActivityC46767tdQ;
import o.C32866mlf;
import o.C33129mqd;
import o.C46705tcH;
import o.C46768tdR;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes19.dex */
public final class IAllPriceRemindActivity$onCreate$8$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ C46705tcH $item;
    final /* synthetic */ C46705tcH $tmpItem;
    int label;
    final /* synthetic */ AbstractActivityC46767tdQ this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IAllPriceRemindActivity$onCreate$8$2(AbstractActivityC46767tdQ abstractActivityC46767tdQ, C46705tcH c46705tcH, C46705tcH c46705tcH2, Continuation<? super IAllPriceRemindActivity$onCreate$8$2> continuation) {
        super(2, continuation);
        this.this$0 = abstractActivityC46767tdQ;
        this.$tmpItem = c46705tcH;
        this.$item = c46705tcH2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new IAllPriceRemindActivity$onCreate$8$2(this.this$0, this.$tmpItem, this.$item, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((IAllPriceRemindActivity$onCreate$8$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.okmarket.ui.market.remind.IAllPriceRemindActivity$onCreate$8$2$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
        final /* synthetic */ C46705tcH $item;
        final /* synthetic */ C46705tcH $tmpItem;
        int label;
        final /* synthetic */ AbstractActivityC46767tdQ this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AbstractActivityC46767tdQ abstractActivityC46767tdQ, C46705tcH c46705tcH, C46705tcH c46705tcH2, Continuation<? super AnonymousClass1> continuation) {
            super(1, continuation);
            this.this$0 = abstractActivityC46767tdQ;
            this.$tmpItem = c46705tcH;
            this.$item = c46705tcH2;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$tmpItem, this.$item, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                BizMarketService bizMarketService = this.this$0.AkhnZx;
                InstrumentActiveInfo instrumentActiveInfo = new InstrumentActiveInfo(C33129mqd.valueOf(this.$tmpItem.fARcdN()), (this.$tmpItem.copydefault() + 1) % 2, this.$item.AuCTel());
                this.label = 1;
                obj = bizMarketService.editPriceRemindsActive(instrumentActiveInfo, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            final C46705tcH c46705tcH = this.$tmpItem;
            C32866mlf.onEvent$default("PriceAlert_AllAlerts_Toggle_Click", (TrackChannel[]) null, new Function1() { // from class: o.ter
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return IAllPriceRemindActivity$onCreate$8$2.AnonymousClass1.invokeSuspend$lambda$0(c46705tcH, (EventParamsList) obj2);
                }
            }, 1, (Object) null);
            if (((ResponseData) obj).getCode() == 0) {
                this.this$0.AEQbTJ();
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$0(C46705tcH c46705tcH, EventParamsList eventParamsList) {
            if (c46705tcH.copydefault() == 1) {
                EventParamsList.put$default(eventParamsList, "toggle_status", DebugKt.DEBUG_PROPERTY_VALUE_OFF, false, 4, null);
            } else {
                EventParamsList.put$default(eventParamsList, "toggle_status", DebugKt.DEBUG_PROPERTY_VALUE_ON, false, 4, null);
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
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$tmpItem, this.$item, null);
            this.label = 1;
            if (C46768tdR.copydefault(anonymousClass1, this) == objCopydefault) {
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
