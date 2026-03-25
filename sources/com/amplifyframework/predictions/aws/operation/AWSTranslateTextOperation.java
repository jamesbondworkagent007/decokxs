package com.amplifyframework.predictions.aws.operation;

import androidx.annotation.NonNull;
import com.amplifyframework.core.Consumer;
import com.amplifyframework.predictions.PredictionsException;
import com.amplifyframework.predictions.aws.request.AWSTranslateRequest;
import com.amplifyframework.predictions.aws.service.AWSPredictionsService;
import com.amplifyframework.predictions.operation.TranslateTextOperation;
import com.amplifyframework.predictions.result.TranslateTextResult;
import java.util.Objects;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes14.dex */
public final class AWSTranslateTextOperation extends TranslateTextOperation<AWSTranslateRequest> {
    private final ExecutorService executorService;
    private final Consumer<PredictionsException> onError;
    private final Consumer<TranslateTextResult> onSuccess;
    private final AWSPredictionsService predictionsService;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AWSTranslateTextOperation(@NonNull AWSPredictionsService aWSPredictionsService, @NonNull ExecutorService executorService, @NonNull AWSTranslateRequest aWSTranslateRequest, @NonNull Consumer<TranslateTextResult> consumer, @NonNull Consumer<PredictionsException> consumer2) {
        super(aWSTranslateRequest);
        Objects.requireNonNull(aWSTranslateRequest);
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
        this.executorService.execute(new Runnable() { // from class: com.amplifyframework.predictions.aws.operation.AWSTranslateTextOperation$$ExternalSyntheticLambda0
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.lambda$start$0();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$start$0() {
        this.predictionsService.translate(getRequest().getText(), getRequest().getSourceLanguage(), getRequest().getTargetLanguage(), this.onSuccess, this.onError);
    }
}
