package com.amplifyframework.predictions.aws.operation;

import androidx.annotation.NonNull;
import com.amplifyframework.core.Consumer;
import com.amplifyframework.predictions.PredictionsException;
import com.amplifyframework.predictions.aws.request.AWSImageIdentifyRequest;
import com.amplifyframework.predictions.aws.service.AWSPredictionsService;
import com.amplifyframework.predictions.models.IdentifyAction;
import com.amplifyframework.predictions.models.IdentifyActionType;
import com.amplifyframework.predictions.operation.IdentifyOperation;
import com.amplifyframework.predictions.result.IdentifyResult;
import java.util.Objects;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes14.dex */
public final class AWSIdentifyOperation extends IdentifyOperation<AWSImageIdentifyRequest> {
    private final ExecutorService executorService;
    private final Consumer<PredictionsException> onError;
    private final Consumer<IdentifyResult> onSuccess;
    private final AWSPredictionsService predictionsService;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AWSIdentifyOperation(@NonNull AWSPredictionsService aWSPredictionsService, @NonNull ExecutorService executorService, @NonNull IdentifyAction identifyAction, @NonNull AWSImageIdentifyRequest aWSImageIdentifyRequest, @NonNull Consumer<IdentifyResult> consumer, @NonNull Consumer<PredictionsException> consumer2) {
        super(identifyAction, aWSImageIdentifyRequest);
        Objects.requireNonNull(aWSImageIdentifyRequest);
        Objects.requireNonNull(aWSPredictionsService);
        this.predictionsService = aWSPredictionsService;
        Objects.requireNonNull(executorService);
        this.executorService = executorService;
        Objects.requireNonNull(consumer);
        this.onSuccess = consumer;
        Objects.requireNonNull(consumer2);
        this.onError = consumer2;
    }

    /* JADX INFO: renamed from: com.amplifyframework.predictions.aws.operation.AWSIdentifyOperation$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$amplifyframework$predictions$models$IdentifyActionType;

        static {
            int[] iArr = new int[IdentifyActionType.values().length];
            $SwitchMap$com$amplifyframework$predictions$models$IdentifyActionType = iArr;
            try {
                iArr[IdentifyActionType.DETECT_CELEBRITIES.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$amplifyframework$predictions$models$IdentifyActionType[IdentifyActionType.DETECT_LABELS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$amplifyframework$predictions$models$IdentifyActionType[IdentifyActionType.DETECT_ENTITIES.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$amplifyframework$predictions$models$IdentifyActionType[IdentifyActionType.DETECT_TEXT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    @Override // com.amplifyframework.core.async.AmplifyOperation
    public void start() {
        int i = AnonymousClass1.$SwitchMap$com$amplifyframework$predictions$models$IdentifyActionType[getIdentifyAction().getType().ordinal()];
        if (i == 1) {
            startCelebritiesDetection();
            return;
        }
        if (i == 2) {
            startLabelsDetection();
        } else if (i == 3) {
            startEntitiesDetection();
        } else {
            if (i != 4) {
                return;
            }
            startTextDetection();
        }
    }

    private void startCelebritiesDetection() {
        this.executorService.execute(new Runnable() { // from class: com.amplifyframework.predictions.aws.operation.AWSIdentifyOperation$$ExternalSyntheticLambda0
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.lambda$startCelebritiesDetection$0();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startCelebritiesDetection$0() {
        this.predictionsService.recognizeCelebrities(getRequest().getImageData(), this.onSuccess, this.onError);
    }

    private void startLabelsDetection() {
        this.executorService.execute(new Runnable() { // from class: com.amplifyframework.predictions.aws.operation.AWSIdentifyOperation$$ExternalSyntheticLambda3
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.lambda$startLabelsDetection$1();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startLabelsDetection$1() {
        this.predictionsService.detectLabels(getIdentifyAction(), getRequest().getImageData(), this.onSuccess, this.onError);
    }

    private void startEntitiesDetection() {
        this.executorService.execute(new Runnable() { // from class: com.amplifyframework.predictions.aws.operation.AWSIdentifyOperation$$ExternalSyntheticLambda1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.lambda$startEntitiesDetection$2();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startEntitiesDetection$2() {
        this.predictionsService.detectEntities(getRequest().getImageData(), this.onSuccess, this.onError);
    }

    private void startTextDetection() {
        this.executorService.execute(new Runnable() { // from class: com.amplifyframework.predictions.aws.operation.AWSIdentifyOperation$$ExternalSyntheticLambda2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.lambda$startTextDetection$3();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startTextDetection$3() {
        this.predictionsService.detectText(getIdentifyAction(), getRequest().getImageData(), this.onSuccess, this.onError);
    }
}
