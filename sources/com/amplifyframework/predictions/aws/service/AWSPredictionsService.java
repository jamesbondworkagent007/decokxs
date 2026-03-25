package com.amplifyframework.predictions.aws.service;

import androidx.annotation.NonNull;
import com.amplifyframework.core.Consumer;
import com.amplifyframework.predictions.PredictionsException;
import com.amplifyframework.predictions.aws.AWSPredictionsPluginConfiguration;
import com.amplifyframework.predictions.aws.models.AWSVoiceType;
import com.amplifyframework.predictions.models.IdentifyAction;
import com.amplifyframework.predictions.models.LabelType;
import com.amplifyframework.predictions.models.LanguageType;
import com.amplifyframework.predictions.models.TextFormatType;
import com.amplifyframework.predictions.result.IdentifyResult;
import com.amplifyframework.predictions.result.InterpretResult;
import com.amplifyframework.predictions.result.TextToSpeechResult;
import com.amplifyframework.predictions.result.TranslateTextResult;
import java.nio.ByteBuffer;
import o.InterfaceC31925mJ;
import o.InterfaceC44254sJ;
import o.InterfaceC52805wZ;
import o.LocalSocket;
import o.UrlInterceptRegistry;
import o.ViewHierarchyEncoder;

/* JADX INFO: loaded from: classes2.dex */
public final class AWSPredictionsService {
    private final AWSComprehendService comprehendService;
    private final AWSPredictionsPluginConfiguration configuration;
    private final AWSPollyService pollyService;
    private final AWSRekognitionService rekognitionService;
    private final AWSTextractService textractService;
    private final AWSTranslateService translateService;

    public AWSPredictionsService(@NonNull AWSPredictionsPluginConfiguration aWSPredictionsPluginConfiguration, @NonNull InterfaceC52805wZ interfaceC52805wZ) {
        this.configuration = aWSPredictionsPluginConfiguration;
        this.pollyService = new AWSPollyService(aWSPredictionsPluginConfiguration, interfaceC52805wZ);
        this.translateService = new AWSTranslateService(aWSPredictionsPluginConfiguration, interfaceC52805wZ);
        this.rekognitionService = new AWSRekognitionService(aWSPredictionsPluginConfiguration, interfaceC52805wZ);
        this.textractService = new AWSTextractService(aWSPredictionsPluginConfiguration, interfaceC52805wZ);
        this.comprehendService = new AWSComprehendService(aWSPredictionsPluginConfiguration, interfaceC52805wZ);
    }

    public void synthesizeSpeech(@NonNull String str, @NonNull AWSVoiceType aWSVoiceType, @NonNull Consumer<TextToSpeechResult> consumer, @NonNull Consumer<PredictionsException> consumer2) {
        this.pollyService.synthesizeSpeech(str, aWSVoiceType, consumer, consumer2);
    }

    public void translate(@NonNull String str, @NonNull LanguageType languageType, @NonNull LanguageType languageType2, @NonNull Consumer<TranslateTextResult> consumer, @NonNull Consumer<PredictionsException> consumer2) {
        this.translateService.translate(str, languageType, languageType2, consumer, consumer2);
    }

    public void detectLabels(@NonNull IdentifyAction identifyAction, @NonNull ByteBuffer byteBuffer, @NonNull Consumer<IdentifyResult> consumer, @NonNull Consumer<PredictionsException> consumer2) {
        try {
            this.rekognitionService.detectLabels(getLabelType(identifyAction), byteBuffer, consumer, consumer2);
        } catch (PredictionsException e) {
            consumer2.accept(e);
        }
    }

    public void recognizeCelebrities(@NonNull ByteBuffer byteBuffer, @NonNull Consumer<IdentifyResult> consumer, @NonNull Consumer<PredictionsException> consumer2) {
        this.rekognitionService.recognizeCelebrities(byteBuffer, consumer, consumer2);
    }

    public void detectEntities(@NonNull ByteBuffer byteBuffer, @NonNull Consumer<IdentifyResult> consumer, @NonNull Consumer<PredictionsException> consumer2) {
        this.rekognitionService.detectEntities(byteBuffer, consumer, consumer2);
    }

    public void detectText(@NonNull IdentifyAction identifyAction, @NonNull ByteBuffer byteBuffer, @NonNull Consumer<IdentifyResult> consumer, @NonNull Consumer<PredictionsException> consumer2) {
        try {
            TextFormatType textFormatType = getTextFormatType(identifyAction);
            if (TextFormatType.PLAIN.equals(textFormatType)) {
                this.rekognitionService.detectPlainText(byteBuffer, consumer, consumer2);
            } else {
                this.textractService.detectDocumentText(textFormatType, byteBuffer, consumer, consumer2);
            }
        } catch (PredictionsException e) {
            consumer2.accept(e);
        }
    }

    public void comprehend(@NonNull String str, @NonNull Consumer<InterpretResult> consumer, @NonNull Consumer<PredictionsException> consumer2) {
        this.comprehendService.comprehend(str, consumer, consumer2);
    }

    private LabelType getLabelType(IdentifyAction identifyAction) throws PredictionsException {
        try {
            return (LabelType) identifyAction;
        } catch (ClassCastException unused) {
            return this.configuration.getIdentifyLabelsConfiguration().getType();
        }
    }

    private TextFormatType getTextFormatType(IdentifyAction identifyAction) throws PredictionsException {
        try {
            return (TextFormatType) identifyAction;
        } catch (ClassCastException unused) {
            return this.configuration.getIdentifyTextConfiguration().getFormat();
        }
    }

    public InterfaceC44254sJ getTranslateClient() {
        return this.translateService.getClient();
    }

    public ViewHierarchyEncoder getPollyClient() {
        return this.pollyService.getClient();
    }

    public UrlInterceptRegistry getRekognitionClient() {
        return this.rekognitionService.getClient();
    }

    public InterfaceC31925mJ getTextractClient() {
        return this.textractService.getClient();
    }

    public LocalSocket getComprehendClient() {
        return this.comprehendService.getClient();
    }
}
