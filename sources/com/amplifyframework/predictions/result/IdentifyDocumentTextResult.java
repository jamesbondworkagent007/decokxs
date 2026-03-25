package com.amplifyframework.predictions.result;

import androidx.annotation.NonNull;
import com.amplifyframework.predictions.models.BoundedKeyValue;
import com.amplifyframework.predictions.models.IdentifiedText;
import com.amplifyframework.predictions.models.Selection;
import com.amplifyframework.predictions.models.Table;
import com.amplifyframework.util.Immutable;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes14.dex */
public final class IdentifyDocumentTextResult implements IdentifyResult {
    private final String fullText;
    private final List<BoundedKeyValue> keyValues;
    private final List<IdentifiedText> lines;
    private final List<String> rawLineText;
    private final List<Selection> selections;
    private final List<Table> tables;
    private final List<IdentifiedText> words;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getFullText() {
        return this.fullText;
    }

    private IdentifyDocumentTextResult(Builder builder) {
        this.fullText = builder.getFullText();
        this.rawLineText = builder.getRawLineText();
        this.words = builder.getWords();
        this.lines = builder.getLines();
        this.selections = builder.getSelections();
        this.tables = builder.getTables();
        this.keyValues = builder.getKeyValues();
    }

    public List<String> getRawLineText() {
        return Immutable.of(this.rawLineText);
    }

    public List<IdentifiedText> getWords() {
        return Immutable.of(this.words);
    }

    public List<IdentifiedText> getLines() {
        return Immutable.of(this.lines);
    }

    public List<Selection> getSelections() {
        return Immutable.of(this.selections);
    }

    public List<Table> getTables() {
        return Immutable.of(this.tables);
    }

    public List<BoundedKeyValue> getKeyValues() {
        return Immutable.of(this.keyValues);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static final class Builder {
        private String fullText;
        private List<BoundedKeyValue> keyValues;
        private List<IdentifiedText> lines;
        private List<String> rawLineText;
        private List<Selection> selections;
        private List<Table> tables;
        private List<IdentifiedText> words;

        private Builder() {
            this.rawLineText = Collections.emptyList();
            this.words = Collections.emptyList();
            this.lines = Collections.emptyList();
            this.selections = Collections.emptyList();
            this.tables = Collections.emptyList();
            this.keyValues = Collections.emptyList();
        }

        public Builder fullText(@NonNull String str) {
            Objects.requireNonNull(str);
            this.fullText = str;
            return this;
        }

        public Builder rawLineText(@NonNull List<String> list) {
            Objects.requireNonNull(list);
            this.rawLineText = list;
            return this;
        }

        public Builder words(@NonNull List<IdentifiedText> list) {
            Objects.requireNonNull(list);
            this.words = list;
            return this;
        }

        public Builder lines(@NonNull List<IdentifiedText> list) {
            Objects.requireNonNull(list);
            this.lines = list;
            return this;
        }

        public Builder selections(@NonNull List<Selection> list) {
            Objects.requireNonNull(list);
            this.selections = list;
            return this;
        }

        public Builder tables(@NonNull List<Table> list) {
            Objects.requireNonNull(list);
            this.tables = list;
            return this;
        }

        public Builder keyValues(@NonNull List<BoundedKeyValue> list) {
            Objects.requireNonNull(list);
            this.keyValues = list;
            return this;
        }

        public IdentifyDocumentTextResult build() {
            return new IdentifyDocumentTextResult(this);
        }

        public String getFullText() {
            String str = this.fullText;
            Objects.requireNonNull(str);
            return str;
        }

        public List<String> getRawLineText() {
            List<String> list = this.rawLineText;
            Objects.requireNonNull(list);
            return list;
        }

        public List<IdentifiedText> getWords() {
            List<IdentifiedText> list = this.words;
            Objects.requireNonNull(list);
            return list;
        }

        public List<IdentifiedText> getLines() {
            List<IdentifiedText> list = this.lines;
            Objects.requireNonNull(list);
            return list;
        }

        public List<Selection> getSelections() {
            List<Selection> list = this.selections;
            Objects.requireNonNull(list);
            return list;
        }

        public List<Table> getTables() {
            List<Table> list = this.tables;
            Objects.requireNonNull(list);
            return list;
        }

        public List<BoundedKeyValue> getKeyValues() {
            List<BoundedKeyValue> list = this.keyValues;
            Objects.requireNonNull(list);
            return list;
        }
    }
}
