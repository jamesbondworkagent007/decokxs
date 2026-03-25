package com.amplifyframework.datastore.appsync;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.util.ObjectsCompat;
import com.amplifyframework.core.model.Model;
import com.amplifyframework.core.model.annotations.ModelConfig;
import com.amplifyframework.core.model.annotations.ModelField;
import com.amplifyframework.core.model.temporal.Temporal;
import java.util.Objects;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes17.dex */
@ModelConfig
public final class ModelMetadata implements Model {

    @ModelField(targetType = "Boolean")
    private final Boolean _deleted;

    @ModelField(targetType = "AWSTimestamp")
    private final Temporal.Timestamp _lastChangedAt;

    @ModelField(targetType = "Int")
    private final Integer _version;

    @ModelField(isRequired = true, targetType = "ID")
    private final String id;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Temporal.Timestamp getLastChangedAt() {
        return this._lastChangedAt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Integer getVersion() {
        return this._version;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Boolean isDeleted() {
        return this._deleted;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: resolveIdentifier()Ljava/io/Serializable; */
    @Override // com.amplifyframework.core.model.Model
    public String resolveIdentifier() {
        return this.id;
    }

    public ModelMetadata(@NonNull String str, @Nullable Boolean bool, @Nullable Integer num, @Nullable Temporal.Timestamp timestamp) {
        Objects.requireNonNull(str);
        this.id = str;
        this._deleted = bool;
        this._version = num;
        this._lastChangedAt = timestamp;
    }

    public String getTypename() {
        return this.id.split("\\|")[0];
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ModelMetadata.class != obj.getClass()) {
            return false;
        }
        ModelMetadata modelMetadata = (ModelMetadata) obj;
        if (ObjectsCompat.equals(this.id, modelMetadata.id) && ObjectsCompat.equals(this._deleted, modelMetadata._deleted) && ObjectsCompat.equals(this._version, modelMetadata._version)) {
            return ObjectsCompat.equals(this._lastChangedAt, modelMetadata._lastChangedAt);
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode();
        Boolean bool = this._deleted;
        int iHashCode2 = bool != null ? bool.hashCode() : 0;
        Integer num = this._version;
        int iHashCode3 = num != null ? num.hashCode() : 0;
        Temporal.Timestamp timestamp = this._lastChangedAt;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (timestamp != null ? timestamp.hashCode() : 0);
    }

    public String toString() {
        return "ModelMetadata{id='" + this.id + "', _deleted=" + this._deleted + ", _version=" + this._version + ", _lastChangedAt=" + this._lastChangedAt + AbstractJsonLexerKt.END_OBJ;
    }
}
