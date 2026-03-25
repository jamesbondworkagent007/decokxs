package com.amplifyframework.core.model;

import androidx.core.util.ObjectsCompat;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes21.dex */
public final class ModelIndex {
    private final List<String> indexFieldNames;
    private final String indexName;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public List<String> getIndexFieldNames() {
        return this.indexFieldNames;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getIndexName() {
        return this.indexName;
    }

    private ModelIndex(String str, List<String> list) {
        this.indexName = str;
        this.indexFieldNames = list;
    }

    public static Builder builder() {
        return new Builder();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ModelIndex.class != obj.getClass()) {
            return false;
        }
        ModelIndex modelIndex = (ModelIndex) obj;
        if (ObjectsCompat.equals(this.indexName, modelIndex.indexName)) {
            return ObjectsCompat.equals(this.indexFieldNames, modelIndex.indexFieldNames);
        }
        return false;
    }

    public int hashCode() {
        String str = this.indexName;
        int iHashCode = str != null ? str.hashCode() : 0;
        List<String> list = this.indexFieldNames;
        return (iHashCode * 31) + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        return "ModelIndex{indexName='" + this.indexName + "', indexFieldNames=" + this.indexFieldNames + AbstractJsonLexerKt.END_OBJ;
    }

    public static final class Builder {
        private List<String> indexFieldNames;
        private String indexName;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Builder indexFieldNames(List<String> list) {
            this.indexFieldNames = list;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Builder indexName(String str) {
            this.indexName = str;
            return this;
        }

        public ModelIndex build() {
            return new ModelIndex(this.indexName, this.indexFieldNames);
        }
    }
}
