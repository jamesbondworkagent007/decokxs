package com.amplifyframework.predictions.aws.request;

import androidx.annotation.NonNull;
import com.amplifyframework.predictions.models.LanguageType;
import java.util.Objects;

/* JADX INFO: loaded from: classes14.dex */
public final class AWSTranslateRequest {
    private final LanguageType sourceLanguage;
    private final LanguageType targetLanguage;
    private final String text;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public LanguageType getSourceLanguage() {
        return this.sourceLanguage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public LanguageType getTargetLanguage() {
        return this.targetLanguage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getText() {
        return this.text;
    }

    public AWSTranslateRequest(@NonNull String str, @NonNull LanguageType languageType, @NonNull LanguageType languageType2) {
        Objects.requireNonNull(str);
        this.text = str;
        Objects.requireNonNull(languageType);
        this.sourceLanguage = languageType;
        Objects.requireNonNull(languageType2);
        this.targetLanguage = languageType2;
    }
}
