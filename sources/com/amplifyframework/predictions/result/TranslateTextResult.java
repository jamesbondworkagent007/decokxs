package com.amplifyframework.predictions.result;

import androidx.annotation.NonNull;
import com.amplifyframework.predictions.models.LanguageType;
import java.util.Objects;

/* JADX INFO: loaded from: classes14.dex */
public final class TranslateTextResult {
    private final LanguageType targetLanguage;
    private final String translatedText;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public LanguageType getTargetLanguage() {
        return this.targetLanguage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getTranslatedText() {
        return this.translatedText;
    }

    private TranslateTextResult(Builder builder) {
        this.translatedText = builder.getTranslatedText();
        this.targetLanguage = builder.getTargetLanguage();
    }

    public static Builder builder() {
        return new Builder();
    }

    /* JADX INFO: loaded from: classes21.dex */
    public static final class Builder {
        private LanguageType targetLanguage;
        private String translatedText;

        public Builder translatedText(@NonNull String str) {
            Objects.requireNonNull(str);
            this.translatedText = str;
            return this;
        }

        public Builder targetLanguage(@NonNull LanguageType languageType) {
            Objects.requireNonNull(languageType);
            this.targetLanguage = languageType;
            return this;
        }

        public TranslateTextResult build() {
            return new TranslateTextResult(this);
        }

        public String getTranslatedText() {
            String str = this.translatedText;
            Objects.requireNonNull(str);
            return str;
        }

        public LanguageType getTargetLanguage() {
            LanguageType languageType = this.targetLanguage;
            Objects.requireNonNull(languageType);
            return languageType;
        }
    }
}
