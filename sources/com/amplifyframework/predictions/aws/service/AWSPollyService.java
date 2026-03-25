package com.amplifyframework.predictions.aws.service;

import com.amplifyframework.core.Consumer;
import com.amplifyframework.predictions.PredictionsException;
import com.amplifyframework.predictions.aws.AWSPredictionsPluginConfiguration;
import com.amplifyframework.predictions.aws.configuration.SpeechGeneratorConfiguration;
import com.amplifyframework.predictions.aws.models.AWSVoiceType;
import com.amplifyframework.predictions.result.TextToSpeechResult;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import o.AccelerateInterpolator;
import o.AutofillManager;
import o.C56391yDq;
import o.C56442yFn;
import o.DecelerateInterpolator;
import o.InterfaceC52805wZ;
import o.PathInterpolator;
import o.TranslateYAnimation;
import o.ViewHierarchyEncoder;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class AWSPollyService {
    public static final Companion Companion = new Companion(null);
    private static final int MP3_SAMPLE_RATE = 24000;
    private final InterfaceC52805wZ authCredentialsProvider;
    private final ViewHierarchyEncoder client;
    private final ExecutorService executor;
    private final AWSPredictionsPluginConfiguration pluginConfiguration;

    /* JADX INFO: renamed from: com.amplifyframework.predictions.aws.service.AWSPollyService$synthesizeSpeech$3, reason: invalid class name */
    public static final class AnonymousClass3 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass3(Continuation<? super AnonymousClass3> continuation) {
            super(continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AWSPollyService.this.synthesizeSpeech(null, null, this);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ViewHierarchyEncoder getClient() {
        return this.client;
    }

    public AWSPollyService(@NotNull AWSPredictionsPluginConfiguration aWSPredictionsPluginConfiguration, @NotNull InterfaceC52805wZ interfaceC52805wZ) {
        Intrinsics.checkNotNullParameter(aWSPredictionsPluginConfiguration, "");
        Intrinsics.checkNotNullParameter(interfaceC52805wZ, "");
        this.pluginConfiguration = aWSPredictionsPluginConfiguration;
        this.authCredentialsProvider = interfaceC52805wZ;
        this.client = new AmazonPollyPresigningClient(ViewHierarchyEncoder.gEmmrt.copydefault(new Function1<ViewHierarchyEncoder.StateListAnimator.Activity, Unit>() { // from class: com.amplifyframework.predictions.aws.service.AWSPollyService$client$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(1);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ViewHierarchyEncoder.StateListAnimator.Activity activity) {
                invoke2(activity);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull ViewHierarchyEncoder.StateListAnimator.Activity activity) {
                Intrinsics.checkNotNullParameter(activity, "");
                activity.OLrzqt(this.this$0.pluginConfiguration.getDefaultRegion());
                activity.AEQbTJ(this.this$0.authCredentialsProvider);
            }
        }));
        this.executor = Executors.newCachedThreadPool();
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.amplifyframework.predictions.aws.service.AWSPollyService.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: com.amplifyframework.predictions.aws.service.AWSPollyService$synthesizeSpeech$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function1<Continuation<? super TextToSpeechResult>, Object> {
        final /* synthetic */ String $text;
        final /* synthetic */ AWSVoiceType $voiceType;
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, AWSVoiceType aWSVoiceType, Continuation<? super AnonymousClass1> continuation) {
            super(1, continuation);
            this.$text = str;
            this.$voiceType = aWSVoiceType;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(@NotNull Continuation<?> continuation) {
            return AWSPollyService.this.new AnonymousClass1(this.$text, this.$voiceType, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super TextToSpeechResult> continuation) {
            return ((AnonymousClass1) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                AWSPollyService aWSPollyService = AWSPollyService.this;
                String str = this.$text;
                AWSVoiceType aWSVoiceType = this.$voiceType;
                this.label = 1;
                obj = aWSPollyService.synthesizeSpeech(str, aWSVoiceType, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            TextToSpeechResult textToSpeechResultFromAudioData = TextToSpeechResult.fromAudioData((InputStream) obj);
            Intrinsics.checkNotNullExpressionValue(textToSpeechResultFromAudioData, "");
            return textToSpeechResultFromAudioData;
        }
    }

    public final void synthesizeSpeech(@NotNull String str, @NotNull AWSVoiceType aWSVoiceType, @NotNull Consumer<TextToSpeechResult> consumer, @NotNull Consumer<PredictionsException> consumer2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(aWSVoiceType, "");
        Intrinsics.checkNotNullParameter(consumer, "");
        Intrinsics.checkNotNullParameter(consumer2, "");
        execute(new AnonymousClass1(str, aWSVoiceType, null), new Function1<Throwable, PredictionsException>() { // from class: com.amplifyframework.predictions.aws.service.AWSPollyService.synthesizeSpeech.2
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function1
            public final PredictionsException invoke(@NotNull Throwable th) {
                Intrinsics.checkNotNullParameter(th, "");
                return new PredictionsException("AWS Polly encountered an error while synthesizing speech.", th, "See attached exception for more details.");
            }
        }, consumer, consumer2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object synthesizeSpeech(final String str, AWSVoiceType aWSVoiceType, Continuation<? super InputStream> continuation) throws Throwable {
        AnonymousClass3 anonymousClass3;
        final String languageCode;
        final String strName;
        if (continuation instanceof AnonymousClass3) {
            anonymousClass3 = (AnonymousClass3) continuation;
            int i = anonymousClass3.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                anonymousClass3.label = i - Integer.MIN_VALUE;
            } else {
                anonymousClass3 = new AnonymousClass3(continuation);
            }
        }
        Object objSynthesizeSpeech = anonymousClass3.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = anonymousClass3.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objSynthesizeSpeech);
            if (AWSVoiceType.UNKNOWN == aWSVoiceType) {
                SpeechGeneratorConfiguration speechGeneratorConfiguration = this.pluginConfiguration.getSpeechGeneratorConfiguration();
                Intrinsics.checkNotNullExpressionValue(speechGeneratorConfiguration, "");
                languageCode = speechGeneratorConfiguration.getLanguage();
                Intrinsics.checkNotNullExpressionValue(languageCode, "");
                strName = speechGeneratorConfiguration.getVoice();
                Intrinsics.checkNotNullExpressionValue(strName, "");
            } else {
                languageCode = aWSVoiceType.getLanguageCode();
                Intrinsics.checkNotNullExpressionValue(languageCode, "");
                strName = aWSVoiceType.name();
            }
            PathInterpolator pathInterpolatorKWHzl = PathInterpolator.EZpvd.KWHzl(new Function1<PathInterpolator.Application, Unit>() { // from class: com.amplifyframework.predictions.aws.service.AWSPollyService$synthesizeSpeech$synthesizeSpeechRequest$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(PathInterpolator.Application application) {
                    invoke2(application);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull PathInterpolator.Application application) {
                    Intrinsics.checkNotNullParameter(application, "");
                    application.EZpvd(str);
                    application.copydefault(AutofillManager.Activity.EZpvd);
                    application.KWHzl(AccelerateInterpolator.EZpvd.AEQbTJ(languageCode));
                    application.copydefault(TranslateYAnimation.copydefault.OLrzqt(strName));
                    application.EZpvd(DecelerateInterpolator.Activity.EZpvd);
                    application.copydefault("24000");
                }
            });
            ViewHierarchyEncoder viewHierarchyEncoder = this.client;
            AWSPollyService$synthesizeSpeech$audioStream$1 aWSPollyService$synthesizeSpeech$audioStream$1 = new AWSPollyService$synthesizeSpeech$audioStream$1(null);
            anonymousClass3.label = 1;
            objSynthesizeSpeech = viewHierarchyEncoder.synthesizeSpeech(pathInterpolatorKWHzl, aWSPollyService$synthesizeSpeech$audioStream$1, anonymousClass3);
            if (objSynthesizeSpeech == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objSynthesizeSpeech);
        }
        ByteArrayInputStream byteArrayInputStream = (ByteArrayInputStream) objSynthesizeSpeech;
        if (byteArrayInputStream != null) {
            return byteArrayInputStream;
        }
        byte[] bytes = "".getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "");
        return new ByteArrayInputStream(bytes);
    }

    private final <T> void execute(final Function1<? super Continuation<? super T>, ? extends Object> function1, final Function1<? super Throwable, ? extends PredictionsException> function12, final Consumer<T> consumer, final Consumer<PredictionsException> consumer2) {
        this.executor.execute(new Runnable() { // from class: com.amplifyframework.predictions.aws.service.AWSPollyService$$ExternalSyntheticLambda0
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                AWSPollyService.execute$lambda$0(function12, consumer2, function1, consumer);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void execute$lambda$0(Function1 function1, Consumer consumer, Function1 function12, Consumer consumer2) {
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(consumer, "");
        Intrinsics.checkNotNullParameter(function12, "");
        Intrinsics.checkNotNullParameter(consumer2, "");
        try {
            BuildersKt__BuildersKt.runBlocking$default(null, new AWSPollyService$execute$1$1(function12, consumer2, null), 1, null);
        } catch (Throwable th) {
            consumer.accept((PredictionsException) function1.invoke(th));
        }
    }
}
