package com.amplifyframework.predictions.aws.service;

import com.amplifyframework.core.Consumer;
import com.amplifyframework.predictions.PredictionsException;
import com.amplifyframework.predictions.aws.AWSPredictionsPluginConfiguration;
import com.amplifyframework.predictions.models.LanguageType;
import com.amplifyframework.predictions.result.TranslateTextResult;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import o.C48723ub;
import o.C48776uc;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC44254sJ;
import o.InterfaceC52805wZ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class AWSTranslateService {
    private final InterfaceC52805wZ authCredentialsProvider;
    private final InterfaceC44254sJ client;
    private final ExecutorService executor;
    private final AWSPredictionsPluginConfiguration pluginConfiguration;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC44254sJ getClient() {
        return this.client;
    }

    public AWSTranslateService(@NotNull AWSPredictionsPluginConfiguration aWSPredictionsPluginConfiguration, @NotNull InterfaceC52805wZ interfaceC52805wZ) {
        Intrinsics.checkNotNullParameter(aWSPredictionsPluginConfiguration, "");
        Intrinsics.checkNotNullParameter(interfaceC52805wZ, "");
        this.pluginConfiguration = aWSPredictionsPluginConfiguration;
        this.authCredentialsProvider = interfaceC52805wZ;
        this.client = InterfaceC44254sJ.gEmmrt.copydefault(new Function1<InterfaceC44254sJ.Application.C0936Application, Unit>() { // from class: com.amplifyframework.predictions.aws.service.AWSTranslateService$client$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(1);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC44254sJ.Application.C0936Application c0936Application) {
                invoke2(c0936Application);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull InterfaceC44254sJ.Application.C0936Application c0936Application) {
                Intrinsics.checkNotNullParameter(c0936Application, "");
                c0936Application.OLrzqt(this.this$0.pluginConfiguration.getDefaultRegion());
                c0936Application.EZpvd(this.this$0.authCredentialsProvider);
            }
        });
        this.executor = Executors.newCachedThreadPool();
    }

    /* JADX INFO: renamed from: com.amplifyframework.predictions.aws.service.AWSTranslateService$translate$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function1<Continuation<? super TranslateTextResult>, Object> {
        final /* synthetic */ LanguageType $sourceLanguage;
        final /* synthetic */ LanguageType $targetLanguage;
        final /* synthetic */ String $textToTranslate;
        int label;
        final /* synthetic */ AWSTranslateService this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(LanguageType languageType, AWSTranslateService aWSTranslateService, LanguageType languageType2, String str, Continuation<? super AnonymousClass1> continuation) {
            super(1, continuation);
            this.$sourceLanguage = languageType;
            this.this$0 = aWSTranslateService;
            this.$targetLanguage = languageType2;
            this.$textToTranslate = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(@NotNull Continuation<?> continuation) {
            return new AnonymousClass1(this.$sourceLanguage, this.this$0, this.$targetLanguage, this.$textToTranslate, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super TranslateTextResult> continuation) {
            return ((AnonymousClass1) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                LanguageType languageType = LanguageType.UNKNOWN;
                LanguageType sourceLanguage = this.$sourceLanguage;
                if (languageType == sourceLanguage) {
                    sourceLanguage = this.this$0.pluginConfiguration.getTranslateTextConfiguration().getSourceLanguage();
                    Intrinsics.checkNotNullExpressionValue(sourceLanguage, "");
                }
                LanguageType targetLanguage = this.$targetLanguage;
                if (languageType == targetLanguage) {
                    targetLanguage = this.this$0.pluginConfiguration.getTranslateTextConfiguration().getTargetLanguage();
                    Intrinsics.checkNotNullExpressionValue(targetLanguage, "");
                }
                InterfaceC44254sJ client = this.this$0.getClient();
                String str = this.$textToTranslate;
                C48723ub.Application application = new C48723ub.Application();
                application.AEQbTJ(str);
                application.KWHzl(sourceLanguage.getLanguageCode());
                application.OLrzqt(targetLanguage.getLanguageCode());
                C48723ub c48723ubKWHzl = application.KWHzl();
                this.label = 1;
                obj = client.copydefault(c48723ubKWHzl, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            C48776uc c48776uc = (C48776uc) obj;
            String strEZpvd = c48776uc.EZpvd();
            LanguageType languageTypeFrom = LanguageType.from(c48776uc.KWHzl());
            TranslateTextResult.Builder builder = TranslateTextResult.builder();
            if (strEZpvd == null) {
                strEZpvd = "";
            }
            TranslateTextResult translateTextResultBuild = builder.translatedText(strEZpvd).targetLanguage(languageTypeFrom).build();
            Intrinsics.checkNotNullExpressionValue(translateTextResultBuild, "");
            return translateTextResultBuild;
        }
    }

    public final void translate(@NotNull String str, @NotNull LanguageType languageType, @NotNull LanguageType languageType2, @NotNull Consumer<TranslateTextResult> consumer, @NotNull Consumer<PredictionsException> consumer2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(languageType, "");
        Intrinsics.checkNotNullParameter(languageType2, "");
        Intrinsics.checkNotNullParameter(consumer, "");
        Intrinsics.checkNotNullParameter(consumer2, "");
        execute(new AnonymousClass1(languageType, this, languageType2, str, null), new Function1<Throwable, PredictionsException>() { // from class: com.amplifyframework.predictions.aws.service.AWSTranslateService.translate.2
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function1
            public final PredictionsException invoke(@NotNull Throwable th) {
                Intrinsics.checkNotNullParameter(th, "");
                return new PredictionsException("AWS Translate encountered an error while translating text.", th, "See attached exception for more details.");
            }
        }, consumer, consumer2);
    }

    private final <T> void execute(final Function1<? super Continuation<? super T>, ? extends Object> function1, final Function1<? super Throwable, ? extends PredictionsException> function12, final Consumer<T> consumer, final Consumer<PredictionsException> consumer2) {
        this.executor.execute(new Runnable() { // from class: com.amplifyframework.predictions.aws.service.AWSTranslateService$$ExternalSyntheticLambda0
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                AWSTranslateService.execute$lambda$0(function12, consumer2, function1, consumer);
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
            BuildersKt__BuildersKt.runBlocking$default(null, new AWSTranslateService$execute$1$1(function12, consumer2, null), 1, null);
        } catch (Throwable th) {
            consumer.accept((PredictionsException) function1.invoke(th));
        }
    }
}
