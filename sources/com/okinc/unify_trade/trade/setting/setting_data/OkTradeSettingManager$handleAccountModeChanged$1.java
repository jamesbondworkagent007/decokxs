package com.okinc.unify_trade.trade.setting.setting_data;

import androidx.lifecycle.MutableLiveData;
import com.okinc.tradeapi.bean.SourceResp;
import com.okinc.unify_trade.trade.setting.setting_data.OkTradeSettingManager$handleAccountModeChanged$1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import o.C54589xNz;
import o.C54630xPm;
import o.C56095xwO;
import o.C56106xwZ;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC54581xNr;
import o.yHO;

/* JADX INFO: loaded from: classes24.dex */
public final class OkTradeSettingManager$handleAccountModeChanged$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $isSupportBot;
    final /* synthetic */ MutableLiveData<String> $liveData;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OkTradeSettingManager$handleAccountModeChanged$1(boolean z, MutableLiveData<String> mutableLiveData, Continuation<? super OkTradeSettingManager$handleAccountModeChanged$1> continuation) {
        super(2, continuation);
        this.$isSupportBot = z;
        this.$liveData = mutableLiveData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OkTradeSettingManager$handleAccountModeChanged$1(this.$isSupportBot, this.$liveData, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OkTradeSettingManager$handleAccountModeChanged$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C56095xwO c56095xwO = new C56095xwO();
            InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
            Flow flowM7441catch = FlowKt.m7441catch(c56095xwO.EZpvd(interfaceC54581xNrOLrzqt != null && interfaceC54581xNrOLrzqt.sSMYrx(), this.$isSupportBot), new AnonymousClass1(this.$liveData, null));
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$liveData);
            this.label = 1;
            if (flowM7441catch.collect(anonymousClass2, this) == objCopydefault) {
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

    /* JADX INFO: renamed from: com.okinc.unify_trade.trade.setting.setting_data.OkTradeSettingManager$handleAccountModeChanged$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements yHO<FlowCollector<? super C56106xwZ>, Throwable, Continuation<? super Unit>, Object> {
        final /* synthetic */ MutableLiveData<String> $liveData;
        /* synthetic */ Object L$0;
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(MutableLiveData<String> mutableLiveData, Continuation<? super AnonymousClass1> continuation) {
            super(3, continuation);
            this.$liveData = mutableLiveData;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // o.yHO
        public final Object invoke(FlowCollector<? super C56106xwZ> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$liveData, continuation);
            anonymousClass1.L$0 = th;
            return anonymousClass1.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                Throwable th = (Throwable) this.L$0;
                MutableLiveData<String> mutableLiveData = this.$liveData;
                String message = th.getMessage();
                if (message == null) {
                    message = "";
                }
                mutableLiveData.setValue(message);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: com.okinc.unify_trade.trade.setting.setting_data.OkTradeSettingManager$handleAccountModeChanged$1$2, reason: invalid class name */
    public static final class AnonymousClass2<T> implements FlowCollector {
        public final /* synthetic */ MutableLiveData<String> copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass2(MutableLiveData<String> mutableLiveData) {
            this.copydefault = mutableLiveData;
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public final Object emit(C56106xwZ c56106xwZ, Continuation<? super Unit> continuation) {
            MutableLiveData mutableLiveData = new MutableLiveData();
            InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
            if (interfaceC54581xNrOLrzqt != null) {
                InterfaceC54581xNr.TaskDescription.loadTradeSetting$default(interfaceC54581xNrOLrzqt, mutableLiveData, c56106xwZ.KWHzl(), c56106xwZ.EZpvd(), false, 8, null);
            }
            final MutableLiveData<String> mutableLiveData2 = this.copydefault;
            mutableLiveData.observeForever(new C54630xPm.Application(new Function1() { // from class: o.xPq
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return OkTradeSettingManager$handleAccountModeChanged$1.AnonymousClass2.copydefault(mutableLiveData2, (SourceResp) obj);
                }
            }));
            return Unit.INSTANCE;
        }

        public static final Unit copydefault(MutableLiveData mutableLiveData, SourceResp sourceResp) {
            if (sourceResp != null) {
                mutableLiveData.setValue("");
            }
            return Unit.INSTANCE;
        }
    }
}
