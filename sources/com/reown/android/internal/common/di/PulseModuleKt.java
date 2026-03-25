package com.reown.android.internal.common.di;

import com.reown.android.internal.common.model.TelemetryEnabled;
import com.reown.android.internal.common.storage.events.EventsRepository;
import com.reown.android.pulse.data.PulseService;
import com.reown.android.pulse.domain.InsertEventUseCase;
import com.reown.android.pulse.domain.InsertTelemetryEventUseCase;
import com.reown.android.pulse.domain.SendBatchEventUseCase;
import com.reown.android.pulse.domain.SendEventInterface;
import com.reown.android.pulse.domain.SendEventUseCase;
import com.reown.foundation.util.Logger;
import com.squareup.moshi.Moshi;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC59982ztK;
import o.C56524yIo;
import o.C59976ztE;
import o.C59978ztG;
import o.C59990ztS;
import o.C59991ztT;
import o.C60053zuc;
import o.C60055zue;
import o.C60058zuh;
import o.C60059zui;
import o.C60060zuj;
import o.C60064zun;
import o.InterfaceC59997ztZ;
import o.yDY;
import okhttp3.OkHttpClient;
import org.jetbrains.annotations.NotNull;
import org.koin.core.definition.Kind;
import retrofit2.Retrofit;
import retrofit2.converter.moshi.MoshiConverterFactory;

/* JADX INFO: loaded from: classes12.dex */
public final class PulseModuleKt {
    public static final /* synthetic */ C59991ztT pulseModule(final String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return C60064zun.module$default(false, new Function1<C59991ztT, Unit>() { // from class: com.reown.android.internal.common.di.PulseModuleKt.pulseModule.1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C59991ztT c59991ztT) {
                invoke2(c59991ztT);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull C59991ztT c59991ztT) {
                Intrinsics.checkNotNullParameter(c59991ztT, "");
                InterfaceC59997ztZ interfaceC59997ztZOLrzqt = C60058zuh.OLrzqt(AndroidCommonDITags.PULSE_URL);
                C07001 c07001 = new Function2<C60060zuj, C60053zuc, String>() { // from class: com.reown.android.internal.common.di.PulseModuleKt.pulseModule.1.1
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                    @Override // kotlin.jvm.functions.Function2
                    public final String invoke(@NotNull C60060zuj c60060zuj, @NotNull C60053zuc c60053zuc) {
                        Intrinsics.checkNotNullParameter(c60060zuj, "");
                        Intrinsics.checkNotNullParameter(c60053zuc, "");
                        return "https://pulse.walletconnect.org";
                    }
                };
                C60059zui.TaskDescription taskDescription = C60059zui.KWHzl;
                C60055zue c60055zueKWHzl = taskDescription.KWHzl();
                Kind kind = Kind.Singleton;
                C59990ztS<?> c59990ztS = new C59990ztS<>(new C59978ztG(c60055zueKWHzl, C56524yIo.AEQbTJ(String.class), interfaceC59997ztZOLrzqt, c07001, kind, yDY.AhwBna()));
                c59991ztT.KWHzl((AbstractC59982ztK<?>) c59990ztS);
                if (c59991ztT.OLrzqt()) {
                    c59991ztT.KWHzl(c59990ztS);
                }
                new C59976ztE(c59991ztT, c59990ztS);
                InterfaceC59997ztZ interfaceC59997ztZOLrzqt2 = C60058zuh.OLrzqt(AndroidCommonDITags.PULSE_RETROFIT);
                AnonymousClass2 anonymousClass2 = new Function2<C60060zuj, C60053zuc, Retrofit>() { // from class: com.reown.android.internal.common.di.PulseModuleKt.pulseModule.1.2
                    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                    @Override // kotlin.jvm.functions.Function2
                    public final Retrofit invoke(@NotNull C60060zuj c60060zuj, @NotNull C60053zuc c60053zuc) {
                        Intrinsics.checkNotNullParameter(c60060zuj, "");
                        Intrinsics.checkNotNullParameter(c60053zuc, "");
                        return new Retrofit.Builder().baseUrl((String) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(String.class), C60058zuh.OLrzqt(AndroidCommonDITags.PULSE_URL), null)).client((OkHttpClient) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(OkHttpClient.class), C60058zuh.OLrzqt(AndroidCommonDITags.APPKIT_OKHTTP), null)).addConverterFactory(MoshiConverterFactory.create(((Moshi.Builder) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Moshi.Builder.class), C60058zuh.OLrzqt(AndroidCommonDITags.MOSHI), null)).build())).build();
                    }
                };
                C59990ztS<?> c59990ztS2 = new C59990ztS<>(new C59978ztG(taskDescription.KWHzl(), C56524yIo.AEQbTJ(Retrofit.class), interfaceC59997ztZOLrzqt2, anonymousClass2, kind, yDY.AhwBna()));
                c59991ztT.KWHzl((AbstractC59982ztK<?>) c59990ztS2);
                if (c59991ztT.OLrzqt()) {
                    c59991ztT.KWHzl(c59990ztS2);
                }
                new C59976ztE(c59991ztT, c59990ztS2);
                AnonymousClass3 anonymousClass3 = new Function2<C60060zuj, C60053zuc, PulseService>() { // from class: com.reown.android.internal.common.di.PulseModuleKt.pulseModule.1.3
                    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                    @Override // kotlin.jvm.functions.Function2
                    public final PulseService invoke(@NotNull C60060zuj c60060zuj, @NotNull C60053zuc c60053zuc) {
                        Intrinsics.checkNotNullParameter(c60060zuj, "");
                        Intrinsics.checkNotNullParameter(c60053zuc, "");
                        return (PulseService) ((Retrofit) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Retrofit.class), C60058zuh.OLrzqt(AndroidCommonDITags.PULSE_RETROFIT), null)).create(PulseService.class);
                    }
                };
                C59990ztS<?> c59990ztS3 = new C59990ztS<>(new C59978ztG(taskDescription.KWHzl(), C56524yIo.AEQbTJ(PulseService.class), null, anonymousClass3, kind, yDY.AhwBna()));
                c59991ztT.KWHzl((AbstractC59982ztK<?>) c59990ztS3);
                if (c59991ztT.OLrzqt()) {
                    c59991ztT.KWHzl(c59990ztS3);
                }
                new C59976ztE(c59991ztT, c59990ztS3);
                final String str2 = str;
                Function2<C60060zuj, C60053zuc, SendEventInterface> function2 = new Function2<C60060zuj, C60053zuc, SendEventInterface>() { // from class: com.reown.android.internal.common.di.PulseModuleKt.pulseModule.1.4
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                    @Override // kotlin.jvm.functions.Function2
                    public final SendEventInterface invoke(@NotNull C60060zuj c60060zuj, @NotNull C60053zuc c60053zuc) {
                        Intrinsics.checkNotNullParameter(c60060zuj, "");
                        Intrinsics.checkNotNullParameter(c60053zuc, "");
                        return new SendEventUseCase((PulseService) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(PulseService.class), null, null), (Logger) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Logger.class), C60058zuh.OLrzqt(AndroidCommonDITags.LOGGER), null), str2);
                    }
                };
                C59990ztS<?> c59990ztS4 = new C59990ztS<>(new C59978ztG(taskDescription.KWHzl(), C56524yIo.AEQbTJ(SendEventInterface.class), null, function2, kind, yDY.AhwBna()));
                c59991ztT.KWHzl((AbstractC59982ztK<?>) c59990ztS4);
                if (c59991ztT.OLrzqt()) {
                    c59991ztT.KWHzl(c59990ztS4);
                }
                new C59976ztE(c59991ztT, c59990ztS4);
                AnonymousClass5 anonymousClass5 = new Function2<C60060zuj, C60053zuc, SendBatchEventUseCase>() { // from class: com.reown.android.internal.common.di.PulseModuleKt.pulseModule.1.5
                    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                    @Override // kotlin.jvm.functions.Function2
                    public final SendBatchEventUseCase invoke(@NotNull C60060zuj c60060zuj, @NotNull C60053zuc c60053zuc) {
                        Intrinsics.checkNotNullParameter(c60060zuj, "");
                        Intrinsics.checkNotNullParameter(c60053zuc, "");
                        PulseService pulseService = (PulseService) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(PulseService.class), null, null);
                        Logger logger = (Logger) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Logger.class), C60058zuh.OLrzqt(AndroidCommonDITags.LOGGER), null);
                        return new SendBatchEventUseCase(pulseService, (EventsRepository) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(EventsRepository.class), null, null), ((TelemetryEnabled) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(TelemetryEnabled.class), C60058zuh.OLrzqt(AndroidCommonDITags.TELEMETRY_ENABLED), null)).m7252unboximpl(), logger, null);
                    }
                };
                C59990ztS<?> c59990ztS5 = new C59990ztS<>(new C59978ztG(taskDescription.KWHzl(), C56524yIo.AEQbTJ(SendBatchEventUseCase.class), null, anonymousClass5, kind, yDY.AhwBna()));
                c59991ztT.KWHzl((AbstractC59982ztK<?>) c59990ztS5);
                if (c59991ztT.OLrzqt()) {
                    c59991ztT.KWHzl(c59990ztS5);
                }
                new C59976ztE(c59991ztT, c59990ztS5);
                AnonymousClass6 anonymousClass6 = new Function2<C60060zuj, C60053zuc, InsertTelemetryEventUseCase>() { // from class: com.reown.android.internal.common.di.PulseModuleKt.pulseModule.1.6
                    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                    @Override // kotlin.jvm.functions.Function2
                    public final InsertTelemetryEventUseCase invoke(@NotNull C60060zuj c60060zuj, @NotNull C60053zuc c60053zuc) {
                        Intrinsics.checkNotNullParameter(c60060zuj, "");
                        Intrinsics.checkNotNullParameter(c60053zuc, "");
                        return new InsertTelemetryEventUseCase((EventsRepository) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(EventsRepository.class), null, null), (Logger) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Logger.class), C60058zuh.OLrzqt(AndroidCommonDITags.LOGGER), null));
                    }
                };
                C59990ztS<?> c59990ztS6 = new C59990ztS<>(new C59978ztG(taskDescription.KWHzl(), C56524yIo.AEQbTJ(InsertTelemetryEventUseCase.class), null, anonymousClass6, kind, yDY.AhwBna()));
                c59991ztT.KWHzl((AbstractC59982ztK<?>) c59990ztS6);
                if (c59991ztT.OLrzqt()) {
                    c59991ztT.KWHzl(c59990ztS6);
                }
                new C59976ztE(c59991ztT, c59990ztS6);
                AnonymousClass7 anonymousClass7 = new Function2<C60060zuj, C60053zuc, InsertEventUseCase>() { // from class: com.reown.android.internal.common.di.PulseModuleKt.pulseModule.1.7
                    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                    @Override // kotlin.jvm.functions.Function2
                    public final InsertEventUseCase invoke(@NotNull C60060zuj c60060zuj, @NotNull C60053zuc c60053zuc) {
                        Intrinsics.checkNotNullParameter(c60060zuj, "");
                        Intrinsics.checkNotNullParameter(c60053zuc, "");
                        return new InsertEventUseCase((EventsRepository) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(EventsRepository.class), null, null), (Logger) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Logger.class), C60058zuh.OLrzqt(AndroidCommonDITags.LOGGER), null));
                    }
                };
                C59990ztS<?> c59990ztS7 = new C59990ztS<>(new C59978ztG(taskDescription.KWHzl(), C56524yIo.AEQbTJ(InsertEventUseCase.class), null, anonymousClass7, kind, yDY.AhwBna()));
                c59991ztT.KWHzl((AbstractC59982ztK<?>) c59990ztS7);
                if (c59991ztT.OLrzqt()) {
                    c59991ztT.KWHzl(c59990ztS7);
                }
                new C59976ztE(c59991ztT, c59990ztS7);
            }
        }, 1, null);
    }
}
