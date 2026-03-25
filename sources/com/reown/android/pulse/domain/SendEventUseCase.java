package com.reown.android.pulse.domain;

import com.reown.android.internal.common.KoinApplicationKt;
import com.reown.android.internal.common.WalletConnectScopeKt;
import com.reown.android.internal.common.di.AndroidCommonDITags;
import com.reown.android.internal.utils.Time;
import com.reown.android.pulse.data.PulseService;
import com.reown.android.pulse.model.Event;
import com.reown.android.pulse.model.SDKType;
import com.reown.android.pulse.model.properties.Props;
import com.reown.foundation.util.Logger;
import com.reown.util.UtilFunctionsKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.SupervisorKt;
import o.C56391yDq;
import o.C56392yDr;
import o.C56442yFn;
import o.C56524yIo;
import o.C60022zty;
import o.C60058zuh;
import o.InterfaceC56387yDm;
import org.jetbrains.annotations.NotNull;
import retrofit2.Response;

/* JADX INFO: loaded from: classes12.dex */
public final class SendEventUseCase implements SendEventInterface {
    public final String bundleId;
    public final InterfaceC56387yDm enableW3MAnalytics$delegate;
    public final Logger logger;
    public final PulseService pulseService;

    public SendEventUseCase(@NotNull PulseService pulseService, @NotNull Logger logger, @NotNull String str) {
        Intrinsics.checkNotNullParameter(pulseService, "");
        Intrinsics.checkNotNullParameter(logger, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.pulseService = pulseService;
        this.logger = logger;
        this.bundleId = str;
        this.enableW3MAnalytics$delegate = C56392yDr.copydefault(new Function0<Boolean>() { // from class: com.reown.android.pulse.domain.SendEventUseCase$enableW3MAnalytics$2
            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Boolean invoke() {
                C60022zty c60022ztyOLrzqt = KoinApplicationKt.getWcKoinApp().OLrzqt();
                return (Boolean) c60022ztyOLrzqt.EZpvd().OLrzqt().AEQbTJ(C56524yIo.AEQbTJ(Boolean.class), C60058zuh.OLrzqt(AndroidCommonDITags.ENABLE_WEB_3_MODAL_ANALYTICS), null);
            }
        });
    }

    public final boolean getEnableW3MAnalytics() {
        return ((Boolean) this.enableW3MAnalytics$delegate.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: com.reown.android.pulse.domain.SendEventUseCase$send$1, reason: invalid class name */
    /* JADX INFO: loaded from: classes24.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ Long $id;
        public final /* synthetic */ Props $props;
        public final /* synthetic */ SDKType $sdkType;
        public final /* synthetic */ Long $timestamp;
        public int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Long l, Long l2, Props props, SDKType sDKType, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$timestamp = l;
            this.$id = l2;
            this.$props = props;
            this.$sdkType = sDKType;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            return SendEventUseCase.this.new AnonymousClass1(this.$timestamp, this.$id, this.$props, this.$sdkType, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: renamed from: com.reown.android.pulse.domain.SendEventUseCase$send$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C07121 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public final /* synthetic */ Long $id;
            public final /* synthetic */ Props $props;
            public final /* synthetic */ SDKType $sdkType;
            public final /* synthetic */ Long $timestamp;
            public Object L$0;
            public int label;
            public final /* synthetic */ SendEventUseCase this$0;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C07121(SendEventUseCase sendEventUseCase, Long l, Long l2, Props props, SDKType sDKType, Continuation<? super C07121> continuation) {
                super(2, continuation);
                this.this$0 = sendEventUseCase;
                this.$timestamp = l;
                this.$id = l2;
                this.$props = props;
                this.$sdkType = sDKType;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
                return new C07121(this.this$0, this.$timestamp, this.$id, this.$props, this.$sdkType, continuation);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C07121) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
                Event event;
                Object objCopydefault = C56442yFn.copydefault();
                int i = this.label;
                try {
                    if (i == 0) {
                        C56391yDq.AEQbTJ(obj);
                        String str = this.this$0.bundleId;
                        Long l = this.$timestamp;
                        long jLongValue = l != null ? l.longValue() : Time.getCurrentTimeInSeconds();
                        Long l2 = this.$id;
                        Event event2 = new Event(l2 != null ? l2.longValue() : UtilFunctionsKt.generateId(), str, jLongValue, this.$props);
                        PulseService pulseService = this.this$0.pulseService;
                        String type = this.$sdkType.getType();
                        this.L$0 = event2;
                        this.label = 1;
                        Object objSendEvent = pulseService.sendEvent(type, event2, this);
                        if (objSendEvent == objCopydefault) {
                            return objCopydefault;
                        }
                        event = event2;
                        obj = objSendEvent;
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        event = (Event) this.L$0;
                        C56391yDq.AEQbTJ(obj);
                    }
                    if (!((Response) obj).isSuccessful()) {
                        this.this$0.logger.error("Failed to send event: " + event.getProps().getType());
                    } else {
                        this.this$0.logger.log("Event sent successfully: " + event.getProps().getType());
                    }
                } catch (Exception e) {
                    this.this$0.logger.error("Failed to send event: " + this.$props.getType() + ", error: " + e);
                }
                return Unit.INSTANCE;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                C07121 c07121 = new C07121(SendEventUseCase.this, this.$timestamp, this.$id, this.$props, this.$sdkType, null);
                this.label = 1;
                if (SupervisorKt.supervisorScope(c07121, this) == objCopydefault) {
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

    @Override // com.reown.android.pulse.domain.SendEventInterface
    public void send(@NotNull Props props, @NotNull SDKType sDKType, Long l, Long l2) {
        Intrinsics.checkNotNullParameter(props, "");
        Intrinsics.checkNotNullParameter(sDKType, "");
        if (getEnableW3MAnalytics()) {
            BuildersKt__Builders_commonKt.launch$default(WalletConnectScopeKt.getScope(), null, null, new AnonymousClass1(l, l2, props, sDKType, null), 3, null);
        }
    }
}
