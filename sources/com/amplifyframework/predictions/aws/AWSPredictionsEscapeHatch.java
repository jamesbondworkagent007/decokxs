package com.amplifyframework.predictions.aws;

import androidx.annotation.NonNull;
import java.util.Objects;
import o.InterfaceC31925mJ;
import o.InterfaceC44254sJ;
import o.LocalSocket;
import o.UrlInterceptRegistry;
import o.ViewHierarchyEncoder;

/* JADX INFO: loaded from: classes14.dex */
public final class AWSPredictionsEscapeHatch {
    private final LocalSocket comprehend;
    private final ViewHierarchyEncoder polly;
    private final UrlInterceptRegistry rekognition;
    private final InterfaceC31925mJ textract;
    private final InterfaceC44254sJ translate;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public LocalSocket getComprehendClient() {
        return this.comprehend;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ViewHierarchyEncoder getPollyClient() {
        return this.polly;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public UrlInterceptRegistry getRekognitionClient() {
        return this.rekognition;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InterfaceC31925mJ getTextractClient() {
        return this.textract;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InterfaceC44254sJ getTranslateClient() {
        return this.translate;
    }

    public AWSPredictionsEscapeHatch(@NonNull InterfaceC44254sJ interfaceC44254sJ, @NonNull ViewHierarchyEncoder viewHierarchyEncoder, @NonNull UrlInterceptRegistry urlInterceptRegistry, @NonNull InterfaceC31925mJ interfaceC31925mJ, @NonNull LocalSocket localSocket) {
        Objects.requireNonNull(interfaceC44254sJ);
        this.translate = interfaceC44254sJ;
        Objects.requireNonNull(viewHierarchyEncoder);
        this.polly = viewHierarchyEncoder;
        Objects.requireNonNull(urlInterceptRegistry);
        this.rekognition = urlInterceptRegistry;
        Objects.requireNonNull(interfaceC31925mJ);
        this.textract = interfaceC31925mJ;
        Objects.requireNonNull(localSocket);
        this.comprehend = localSocket;
    }
}
