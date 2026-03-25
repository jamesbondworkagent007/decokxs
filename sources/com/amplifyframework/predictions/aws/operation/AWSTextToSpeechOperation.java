package com.amplifyframework.predictions.aws.operation;

import androidx.annotation.NonNull;
import com.amplifyframework.core.Consumer;
import com.amplifyframework.predictions.PredictionsException;
import com.amplifyframework.predictions.aws.request.AWSPollyRequest;
import com.amplifyframework.predictions.aws.service.AWSPredictionsService;
import com.amplifyframework.predictions.operation.TextToSpeechOperation;
import com.amplifyframework.predictions.result.TextToSpeechResult;
import java.util.Objects;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes14.dex */
public final class AWSTextToSpeechOperation extends TextToSpeechOperation<AWSPollyRequest> {
    private final ExecutorService executorService;
    private final Consumer<PredictionsException> onError;
    private final Consumer<TextToSpeechResult> onSuccess;
    private final AWSPredictionsService predictionsService;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AWSTextToSpeechOperation(@NonNull AWSPredictionsService aWSPredictionsService, @NonNull ExecutorService executorService, @NonNull AWSPollyRequest aWSPollyRequest, @NonNull Consumer<TextToSpeechResult> consumer, @NonNull Consumer<PredictionsException> consumer2) {
        super(aWSPollyRequest);
        Objects.requireNonNull(aWSPollyRequest);
        Objects.requireNonNull(aWSPredictionsService);
        this.predictionsService = aWSPredictionsService;
        Objects.requireNonNull(executorService);
        this.executorService = executorService;
        Objects.requireNonNull(consumer);
        this.onSuccess = consumer;
        Objects.requireNonNull(consumer2);
        this.onError = consumer2;
    }

    @Override // com.amplifyframework.core.async.AmplifyOperation
    public void start() {
        this.executorService.execute(new Runnable() { // from class: com.amplifyframework.predictions.aws.operation.AWSTextToSpeechOperation$$ExternalSyntheticLambda0
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.lambda$start$0();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$start$0() {
        this.predictionsService.synthesizeSpeech(getRequest().getText(), getRequest().getVoiceType(), this.onSuccess, this.onError);
    }
}
