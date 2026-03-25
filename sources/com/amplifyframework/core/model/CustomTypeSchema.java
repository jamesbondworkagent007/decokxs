package com.amplifyframework.core.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.util.ObjectsCompat;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes21.dex */
public final class CustomTypeSchema {
    private final Map<String, CustomTypeField> fields;
    private final String name;
    private final String pluralName;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Map<String, CustomTypeField> getFields() {
        return this.fields;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getName() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getPluralName() {
        return this.pluralName;
    }

    private CustomTypeSchema(Builder builder) {
        this.name = builder.name;
        this.pluralName = builder.pluralName;
        this.fields = builder.fields;
    }

    public static Builder builder() {
        return new Builder();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || CustomTypeSchema.class != obj.getClass()) {
            return false;
        }
        CustomTypeSchema customTypeSchema = (CustomTypeSchema) obj;
        return ObjectsCompat.equals(getName(), customTypeSchema.getName()) && ObjectsCompat.equals(getPluralName(), customTypeSchema.getPluralName()) && ObjectsCompat.equals(getFields(), customTypeSchema.getFields());
    }

    public int hashCode() {
        return ObjectsCompat.hash(getName(), getPluralName(), getFields());
    }

    public String toString() {
        return "CustomTypeSchema{name='" + this.name + "', pluralName='" + this.pluralName + "', fields=" + this.fields + AbstractJsonLexerKt.END_OBJ;
    }

    public static final class Builder {
        private final Map<String, CustomTypeField> fields = new TreeMap();
        private String name;
        private String pluralName;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Builder pluralName(@Nullable String str) {
            this.pluralName = str;
            return this;
        }

        public Builder name(@NonNull String str) {
            Objects.requireNonNull(str);
            this.name = str;
            return this;
        }

        public Builder fields(@NonNull Map<String, CustomTypeField> map) {
            Objects.requireNonNull(map);
            this.fields.clear();
            this.fields.putAll(map);
            return this;
        }

        public CustomTypeSchema build() {
            Objects.requireNonNull(this.name);
            return new CustomTypeSchema(this);
        }
    }
}
