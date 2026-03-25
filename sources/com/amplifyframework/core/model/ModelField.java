package com.amplifyframework.core.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.util.ObjectsCompat;
import java.util.ArrayList;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes21.dex */
public final class ModelField {
    private final List<AuthRule> authRules;
    private final boolean isArray;
    private final boolean isCustomType;
    private final boolean isEnum;
    private final boolean isModel;
    private final boolean isModelList;
    private final boolean isModelReference;
    private final boolean isReadOnly;
    private final boolean isRequired;
    private final Class<?> javaClassForValue;
    private final String name;
    private final String targetType;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public List<AuthRule> getAuthRules() {
        return this.authRules;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Class<?> getJavaClassForValue() {
        return this.javaClassForValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getName() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getTargetType() {
        return this.targetType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean isArray() {
        return this.isArray;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean isCustomType() {
        return this.isCustomType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean isEnum() {
        return this.isEnum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean isModel() {
        return this.isModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean isModelList() {
        return this.isModelList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean isModelReference() {
        return this.isModelReference;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean isReadOnly() {
        return this.isReadOnly;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean isRequired() {
        return this.isRequired;
    }

    private ModelField(@NonNull ModelFieldBuilder modelFieldBuilder) {
        this.name = modelFieldBuilder.name;
        this.javaClassForValue = modelFieldBuilder.javaClassForValue;
        this.targetType = modelFieldBuilder.targetType;
        this.isReadOnly = modelFieldBuilder.isReadOnly;
        this.isRequired = modelFieldBuilder.isRequired;
        this.isArray = modelFieldBuilder.isArray;
        this.isEnum = modelFieldBuilder.isEnum;
        this.isModel = modelFieldBuilder.isModel;
        this.isModelReference = modelFieldBuilder.isModelReference;
        this.isModelList = modelFieldBuilder.isModelList;
        this.isCustomType = modelFieldBuilder.isCustomType;
        this.authRules = modelFieldBuilder.authRules;
    }

    public static ModelFieldBuilder builder() {
        return new ModelFieldBuilder();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ModelField.class != obj.getClass()) {
            return false;
        }
        ModelField modelField = (ModelField) obj;
        if (this.isReadOnly == modelField.isReadOnly && this.isRequired == modelField.isRequired && this.isArray == modelField.isArray && this.isEnum == modelField.isEnum && this.isModel == modelField.isModel && this.isModelReference == modelField.isModelReference && this.isModelList == modelField.isModelList && this.isCustomType == modelField.isCustomType && ObjectsCompat.equals(this.name, modelField.name) && ObjectsCompat.equals(this.javaClassForValue, modelField.javaClassForValue)) {
            return ObjectsCompat.equals(this.targetType, modelField.targetType);
        }
        return false;
    }

    public int hashCode() {
        String str = this.name;
        int iHashCode = str != null ? str.hashCode() : 0;
        Class<?> cls = this.javaClassForValue;
        int iHashCode2 = cls != null ? cls.hashCode() : 0;
        String str2 = this.targetType;
        return (((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + (this.isReadOnly ? 1 : 0)) * 31) + (this.isRequired ? 1 : 0)) * 31) + (this.isArray ? 1 : 0)) * 31) + (this.isEnum ? 1 : 0)) * 31) + (this.isModel ? 1 : 0)) * 31) + (this.isModelReference ? 1 : 0)) * 31) + (this.isModelList ? 1 : 0)) * 31) + (this.isCustomType ? 1 : 0);
    }

    public String toString() {
        return "ModelField{name='" + this.name + "', javaClassForValue='" + this.javaClassForValue + "', targetType='" + this.targetType + "', isReadOnly=" + this.isReadOnly + ", isRequired=" + this.isRequired + ", isArray=" + this.isArray + ", isEnum=" + this.isEnum + ", isModel=" + this.isModel + ", isModelReference=" + this.isModelReference + ", isModelList=" + this.isModelList + ", isCustomType=" + this.isCustomType + AbstractJsonLexerKt.END_OBJ;
    }

    public static class ModelFieldBuilder {
        private Class<?> javaClassForValue;
        private String name;
        private String targetType;
        private boolean isReadOnly = false;
        private boolean isRequired = false;
        private boolean isArray = false;
        private boolean isEnum = false;
        private boolean isModel = false;
        private boolean isModelReference = false;
        private boolean isModelList = false;
        private boolean isCustomType = false;
        private List<AuthRule> authRules = new ArrayList();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ModelFieldBuilder authRules(List<AuthRule> list) {
            this.authRules = list;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ModelFieldBuilder isArray(boolean z) {
            this.isArray = z;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ModelFieldBuilder isCustomType(boolean z) {
            this.isCustomType = z;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ModelFieldBuilder isEnum(boolean z) {
            this.isEnum = z;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ModelFieldBuilder isModel(boolean z) {
            this.isModel = z;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ModelFieldBuilder isModelList(boolean z) {
            this.isModelList = z;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ModelFieldBuilder isModelReference(boolean z) {
            this.isModelReference = z;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ModelFieldBuilder isReadOnly(boolean z) {
            this.isReadOnly = z;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ModelFieldBuilder isRequired(boolean z) {
            this.isRequired = z;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ModelFieldBuilder javaClassForValue(@Nullable Class<?> cls) {
            this.javaClassForValue = cls;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ModelFieldBuilder name(String str) {
            this.name = str;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ModelFieldBuilder targetType(String str) {
            this.targetType = str;
            return this;
        }

        public ModelField build() {
            return new ModelField(this);
        }
    }
}
