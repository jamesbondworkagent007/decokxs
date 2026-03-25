package com.amplifyframework.core.model;

import androidx.annotation.NonNull;
import androidx.core.util.ObjectsCompat;
import com.amplifyframework.core.model.annotations.BelongsTo;
import java.util.Objects;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes21.dex */
public final class ModelAssociation {
    private final String associatedName;
    private final String associatedType;
    private final String name;
    private final String targetName;
    private final String[] targetNames;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getAssociatedName() {
        return this.associatedName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getAssociatedType() {
        return this.associatedType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getName() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getTargetName() {
        return this.targetName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String[] getTargetNames() {
        return this.targetNames;
    }

    private ModelAssociation(@NonNull Builder builder) {
        String str = builder.name;
        Objects.requireNonNull(str);
        this.name = str;
        this.targetName = builder.targetName;
        this.targetNames = builder.targetNames;
        this.associatedName = builder.associatedName;
        this.associatedType = builder.associatedType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public boolean isOwner() {
        return BelongsTo.class.getSimpleName().equals(getName());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ModelAssociation.class != obj.getClass()) {
            return false;
        }
        ModelAssociation modelAssociation = (ModelAssociation) obj;
        if (ObjectsCompat.equals(this.name, modelAssociation.name) && ObjectsCompat.equals(this.targetName, modelAssociation.targetName) && ObjectsCompat.equals(this.associatedName, modelAssociation.associatedName)) {
            return ObjectsCompat.equals(this.associatedType, modelAssociation.associatedType);
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = this.name.hashCode();
        String str = this.targetName;
        int iHashCode2 = str != null ? str.hashCode() : 0;
        String str2 = this.associatedName;
        int iHashCode3 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.associatedType;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        return "ModelAssociation{name='" + this.name + "', targetName='" + this.targetName + "', associatedName='" + this.associatedName + "', associatedType='" + this.associatedType + '\'' + AbstractJsonLexerKt.END_OBJ;
    }

    public static final class Builder {
        private String associatedName;
        private String associatedType;
        private String name;
        private String targetName;
        private String[] targetNames;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Builder associatedName(String str) {
            this.associatedName = str;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Builder associatedType(String str) {
            this.associatedType = str;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Builder targetName(String str) {
            this.targetName = str;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Builder targetNames(String[] strArr) {
            this.targetNames = strArr;
            return this;
        }

        public Builder name(@NonNull String str) {
            Objects.requireNonNull(str);
            this.name = str;
            return this;
        }

        public ModelAssociation build() {
            return new ModelAssociation(this);
        }
    }
}
