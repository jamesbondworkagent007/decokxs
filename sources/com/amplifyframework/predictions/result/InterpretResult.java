package com.amplifyframework.predictions.result;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amplifyframework.predictions.models.Entity;
import com.amplifyframework.predictions.models.Feature;
import com.amplifyframework.predictions.models.KeyPhrase;
import com.amplifyframework.predictions.models.Language;
import com.amplifyframework.predictions.models.Sentiment;
import com.amplifyframework.predictions.models.Syntax;
import com.amplifyframework.util.Immutable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes14.dex */
public final class InterpretResult {
    private final List<Entity> entities;
    private final List<Feature<?>> features;
    private final List<KeyPhrase> keyPhrases;
    private final Language language;
    private final Sentiment sentiment;
    private final List<Syntax> syntax;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Language getLanguage() {
        return this.language;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Sentiment getSentiment() {
        return this.sentiment;
    }

    private InterpretResult(Builder builder) {
        this.language = builder.getLanguage();
        this.sentiment = builder.getSentiment();
        this.keyPhrases = builder.getKeyPhrases();
        this.entities = builder.getEntities();
        this.syntax = builder.getSyntax();
        this.features = builder.getFeatures();
    }

    public List<KeyPhrase> getKeyPhrases() {
        return Immutable.of(this.keyPhrases);
    }

    public List<Entity> getEntities() {
        return Immutable.of(this.entities);
    }

    public List<Syntax> getSyntax() {
        return Immutable.of(this.syntax);
    }

    public List<Feature<?>> getFeatures() {
        return Immutable.of(this.features);
    }

    public static Builder builder() {
        return new Builder();
    }

    /* JADX INFO: loaded from: classes21.dex */
    public static final class Builder {
        private List<Entity> entities;
        private List<Feature<?>> features;
        private List<KeyPhrase> keyPhrases;
        private Language language;
        private Sentiment sentiment;
        private List<Syntax> syntax;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Builder entities(@Nullable List<Entity> list) {
            this.entities = list;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public List<Entity> getEntities() {
            return this.entities;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public List<Feature<?>> getFeatures() {
            return this.features;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public List<KeyPhrase> getKeyPhrases() {
            return this.keyPhrases;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Language getLanguage() {
            return this.language;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Sentiment getSentiment() {
            return this.sentiment;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public List<Syntax> getSyntax() {
            return this.syntax;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Builder keyPhrases(@Nullable List<KeyPhrase> list) {
            this.keyPhrases = list;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Builder language(@Nullable Language language) {
            this.language = language;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Builder sentiment(@Nullable Sentiment sentiment) {
            this.sentiment = sentiment;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Builder syntax(@Nullable List<Syntax> list) {
            this.syntax = list;
            return this;
        }

        private Builder() {
            this.features = new ArrayList();
        }

        public Builder features(@NonNull List<Feature<?>> list) {
            Objects.requireNonNull(list);
            this.features = list;
            return this;
        }

        public Builder feature(@NonNull Feature<?> feature) {
            List<Feature<?>> list = this.features;
            Objects.requireNonNull(feature);
            list.add(feature);
            return this;
        }

        public InterpretResult build() {
            return new InterpretResult(this);
        }
    }
}
