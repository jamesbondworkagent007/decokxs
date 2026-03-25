package com.amplifyframework.predictions.aws;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amplifyframework.annotations.InternalAmplifyApi;
import com.amplifyframework.auth.AWSCredentials;
import com.amplifyframework.auth.AWSCredentialsProvider;
import com.amplifyframework.auth.AWSCredentialsProviderKt;
import com.amplifyframework.auth.CognitoCredentialsProvider;
import com.amplifyframework.core.Action;
import com.amplifyframework.core.Consumer;
import com.amplifyframework.predictions.PredictionsException;
import com.amplifyframework.predictions.PredictionsPlugin;
import com.amplifyframework.predictions.aws.models.AWSVoiceType;
import com.amplifyframework.predictions.aws.operation.AWSIdentifyOperation;
import com.amplifyframework.predictions.aws.operation.AWSInterpretOperation;
import com.amplifyframework.predictions.aws.operation.AWSTextToSpeechOperation;
import com.amplifyframework.predictions.aws.operation.AWSTranslateTextOperation;
import com.amplifyframework.predictions.aws.options.AWSFaceLivenessSessionOptions;
import com.amplifyframework.predictions.aws.request.AWSComprehendRequest;
import com.amplifyframework.predictions.aws.request.AWSImageIdentifyRequest;
import com.amplifyframework.predictions.aws.request.AWSPollyRequest;
import com.amplifyframework.predictions.aws.request.AWSTranslateRequest;
import com.amplifyframework.predictions.aws.service.AWSPredictionsService;
import com.amplifyframework.predictions.aws.service.RunFaceLivenessSession;
import com.amplifyframework.predictions.models.FaceLivenessSession;
import com.amplifyframework.predictions.models.FaceLivenessSessionInformation;
import com.amplifyframework.predictions.models.IdentifyAction;
import com.amplifyframework.predictions.models.LanguageType;
import com.amplifyframework.predictions.operation.IdentifyOperation;
import com.amplifyframework.predictions.operation.InterpretOperation;
import com.amplifyframework.predictions.operation.TextToSpeechOperation;
import com.amplifyframework.predictions.operation.TranslateTextOperation;
import com.amplifyframework.predictions.options.FaceLivenessSessionOptions;
import com.amplifyframework.predictions.options.IdentifyOptions;
import com.amplifyframework.predictions.options.InterpretOptions;
import com.amplifyframework.predictions.options.TextToSpeechOptions;
import com.amplifyframework.predictions.options.TranslateTextOptions;
import com.amplifyframework.predictions.result.IdentifyResult;
import com.amplifyframework.predictions.result.InterpretResult;
import com.amplifyframework.predictions.result.TextToSpeechResult;
import com.amplifyframework.predictions.result.TranslateTextResult;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import o.InterfaceC52805wZ;
import okhttp3.OkHttpClient;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class AWSPredictionsPlugin extends PredictionsPlugin<AWSPredictionsEscapeHatch> {
    private static final String AWS_PREDICTIONS_PLUGIN_KEY = "awsPredictionsPlugin";
    private AWSPredictionsPluginConfiguration configuration;
    private InterfaceC52805wZ credentialsProvider;
    private InterfaceC52805wZ credentialsProviderOverride;
    private final ExecutorService executorService;
    private AWSPredictionsService predictionsService;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.amplifyframework.core.plugin.Plugin
    public String getPluginKey() {
        return AWS_PREDICTIONS_PLUGIN_KEY;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.amplifyframework.core.plugin.Plugin
    public String getVersion() {
        return "2.14.12";
    }

    public AWSPredictionsPlugin() {
        this.executorService = Executors.newCachedThreadPool();
    }

    public AWSPredictionsPlugin(InterfaceC52805wZ interfaceC52805wZ) {
        this();
        this.credentialsProviderOverride = interfaceC52805wZ;
    }

    @Override // com.amplifyframework.core.plugin.Plugin
    public void configure(JSONObject jSONObject, @NonNull Context context) throws PredictionsException {
        this.configuration = AWSPredictionsPluginConfiguration.fromJson(jSONObject);
        InterfaceC52805wZ cognitoCredentialsProvider = this.credentialsProviderOverride;
        if (cognitoCredentialsProvider == null) {
            try {
                cognitoCredentialsProvider = new CognitoCredentialsProvider();
            } catch (IllegalStateException e) {
                throw new PredictionsException("AWSPredictionsPlugin depends on AWSCognitoAuthPlugin but it is currently missing", e, "Before configuring Amplify, be sure to add AWSPredictionsPlugin same as you added AWSPinpointAnalyticsPlugin.");
            }
        }
        this.predictionsService = new AWSPredictionsService(this.configuration, cognitoCredentialsProvider);
        this.credentialsProvider = cognitoCredentialsProvider;
    }

    /* JADX DEBUG: Method merged with bridge method: getEscapeHatch()Ljava/lang/Object; */
    @Override // com.amplifyframework.core.plugin.Plugin
    public AWSPredictionsEscapeHatch getEscapeHatch() {
        return new AWSPredictionsEscapeHatch(this.predictionsService.getTranslateClient(), this.predictionsService.getPollyClient(), this.predictionsService.getRekognitionClient(), this.predictionsService.getTextractClient(), this.predictionsService.getComprehendClient());
    }

    @Override // com.amplifyframework.predictions.PredictionsCategoryBehavior
    public TextToSpeechOperation<?> convertTextToSpeech(@NonNull String str, @NonNull Consumer<TextToSpeechResult> consumer, @NonNull Consumer<PredictionsException> consumer2) {
        return convertTextToSpeech(str, TextToSpeechOptions.defaults(), consumer, consumer2);
    }

    @Override // com.amplifyframework.predictions.PredictionsCategoryBehavior
    public TextToSpeechOperation<?> convertTextToSpeech(@NonNull String str, @NonNull TextToSpeechOptions textToSpeechOptions, @NonNull Consumer<TextToSpeechResult> consumer, @NonNull Consumer<PredictionsException> consumer2) {
        AWSTextToSpeechOperation aWSTextToSpeechOperation = new AWSTextToSpeechOperation(this.predictionsService, this.executorService, new AWSPollyRequest(str, AWSVoiceType.fromVoice(textToSpeechOptions.getVoiceType())), consumer, consumer2);
        aWSTextToSpeechOperation.start();
        return aWSTextToSpeechOperation;
    }

    @Override // com.amplifyframework.predictions.PredictionsCategoryBehavior
    public TranslateTextOperation<?> translateText(@NonNull String str, @NonNull Consumer<TranslateTextResult> consumer, @NonNull Consumer<PredictionsException> consumer2) {
        return translateText(str, TranslateTextOptions.defaults(), consumer, consumer2);
    }

    @Override // com.amplifyframework.predictions.PredictionsCategoryBehavior
    public TranslateTextOperation<?> translateText(@NonNull String str, @NonNull TranslateTextOptions translateTextOptions, @NonNull Consumer<TranslateTextResult> consumer, @NonNull Consumer<PredictionsException> consumer2) {
        LanguageType languageType = LanguageType.UNKNOWN;
        return translateText(str, languageType, languageType, translateTextOptions, consumer, consumer2);
    }

    @Override // com.amplifyframework.predictions.PredictionsCategoryBehavior
    public TranslateTextOperation<?> translateText(@NonNull String str, @NonNull LanguageType languageType, @NonNull LanguageType languageType2, @NonNull Consumer<TranslateTextResult> consumer, @NonNull Consumer<PredictionsException> consumer2) {
        return translateText(str, languageType, languageType2, TranslateTextOptions.defaults(), consumer, consumer2);
    }

    @Override // com.amplifyframework.predictions.PredictionsCategoryBehavior
    public TranslateTextOperation<?> translateText(@NonNull String str, @NonNull LanguageType languageType, @NonNull LanguageType languageType2, @NonNull TranslateTextOptions translateTextOptions, @NonNull Consumer<TranslateTextResult> consumer, @NonNull Consumer<PredictionsException> consumer2) {
        AWSTranslateTextOperation aWSTranslateTextOperation = new AWSTranslateTextOperation(this.predictionsService, this.executorService, new AWSTranslateRequest(str, languageType, languageType2), consumer, consumer2);
        aWSTranslateTextOperation.start();
        return aWSTranslateTextOperation;
    }

    @Override // com.amplifyframework.predictions.PredictionsCategoryBehavior
    public IdentifyOperation<?> identify(@NonNull IdentifyAction identifyAction, @NonNull Bitmap bitmap, @NonNull Consumer<IdentifyResult> consumer, @NonNull Consumer<PredictionsException> consumer2) {
        return identify(identifyAction, bitmap, IdentifyOptions.defaults(), consumer, consumer2);
    }

    @Override // com.amplifyframework.predictions.PredictionsCategoryBehavior
    public IdentifyOperation<?> identify(@NonNull IdentifyAction identifyAction, @NonNull Bitmap bitmap, @NonNull IdentifyOptions identifyOptions, @NonNull Consumer<IdentifyResult> consumer, @NonNull Consumer<PredictionsException> consumer2) {
        AWSIdentifyOperation aWSIdentifyOperation = new AWSIdentifyOperation(this.predictionsService, this.executorService, identifyAction, AWSImageIdentifyRequest.fromBitmap(bitmap), consumer, consumer2);
        aWSIdentifyOperation.start();
        return aWSIdentifyOperation;
    }

    @Override // com.amplifyframework.predictions.PredictionsCategoryBehavior
    public InterpretOperation<?> interpret(@NonNull String str, @NonNull Consumer<InterpretResult> consumer, @NonNull Consumer<PredictionsException> consumer2) {
        return interpret(str, InterpretOptions.defaults(), consumer, consumer2);
    }

    @Override // com.amplifyframework.predictions.PredictionsCategoryBehavior
    public InterpretOperation<?> interpret(@NonNull String str, @NonNull InterpretOptions interpretOptions, @NonNull Consumer<InterpretResult> consumer, @NonNull Consumer<PredictionsException> consumer2) {
        AWSInterpretOperation aWSInterpretOperation = new AWSInterpretOperation(this.predictionsService, this.executorService, new AWSComprehendRequest(str), consumer, consumer2);
        aWSInterpretOperation.start();
        return aWSInterpretOperation;
    }

    @InternalAmplifyApi
    public static void startFaceLivenessSession(@NonNull String str, @NonNull FaceLivenessSessionInformation faceLivenessSessionInformation, @NonNull Consumer<FaceLivenessSession> consumer, @NonNull Action action, @NonNull Consumer<PredictionsException> consumer2, @Nullable Consumer<OkHttpClient.Builder> consumer3, @NonNull String str2, @NonNull Boolean bool) {
        startFaceLivenessSession(str, faceLivenessSessionInformation, FaceLivenessSessionOptions.defaults(), consumer, action, consumer2, consumer3, str2, bool);
    }

    @InternalAmplifyApi
    public static void startFaceLivenessSession(@NonNull String str, @NonNull FaceLivenessSessionInformation faceLivenessSessionInformation, @NonNull FaceLivenessSessionOptions faceLivenessSessionOptions, @NonNull Consumer<FaceLivenessSession> consumer, @NonNull Action action, @NonNull Consumer<PredictionsException> consumer2, @Nullable Consumer<OkHttpClient.Builder> consumer3, @NonNull String str2, @NonNull Boolean bool) {
        startFaceLivenessSession(str, faceLivenessSessionInformation, faceLivenessSessionOptions, null, consumer, action, consumer2, consumer3, str2, bool);
    }

    @InternalAmplifyApi
    public static void startFaceLivenessSession(@NonNull String str, @NonNull FaceLivenessSessionInformation faceLivenessSessionInformation, @Nullable String str2, @NonNull Consumer<FaceLivenessSession> consumer, @NonNull Action action, @NonNull Consumer<PredictionsException> consumer2, @Nullable Consumer<OkHttpClient.Builder> consumer3, @NonNull String str3, @NonNull Boolean bool) {
        startFaceLivenessSession(str, faceLivenessSessionInformation, FaceLivenessSessionOptions.defaults(), str2, consumer, action, consumer2, consumer3, str3, bool);
    }

    @InternalAmplifyApi
    public static void startFaceLivenessSession(@NonNull String str, @NonNull FaceLivenessSessionInformation faceLivenessSessionInformation, @NonNull FaceLivenessSessionOptions faceLivenessSessionOptions, @Nullable String str2, @NonNull Consumer<FaceLivenessSession> consumer, @NonNull Action action, @NonNull Consumer<PredictionsException> consumer2, @Nullable Consumer<OkHttpClient.Builder> consumer3, @NonNull String str3, @NonNull Boolean bool) {
        InterfaceC52805wZ interfaceC52805wZConvertToSdkCredentialsProvider;
        AWSCredentialsProvider<AWSCredentials> credentialsProvider = faceLivenessSessionOptions instanceof AWSFaceLivenessSessionOptions ? ((AWSFaceLivenessSessionOptions) faceLivenessSessionOptions).getCredentialsProvider() : null;
        if (credentialsProvider == null) {
            interfaceC52805wZConvertToSdkCredentialsProvider = new CognitoCredentialsProvider();
        } else {
            interfaceC52805wZConvertToSdkCredentialsProvider = AWSCredentialsProviderKt.convertToSdkCredentialsProvider(credentialsProvider);
        }
        new RunFaceLivenessSession(str, faceLivenessSessionInformation, interfaceC52805wZConvertToSdkCredentialsProvider, str2, consumer, action, consumer2, consumer3, str3, bool.booleanValue());
    }
}
