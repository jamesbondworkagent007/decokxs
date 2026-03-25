package com.amplifyframework.datastore.appsync;

import androidx.annotation.NonNull;
import androidx.core.util.ObjectsCompat;
import com.amplifyframework.core.model.Model;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.util.Objects;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes21.dex */
public final class ModelWithMetadata<M extends Model> {
    private final M model;
    private final ModelMetadata syncMetadata;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public M getModel() {
        return this.model;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ModelMetadata getSyncMetadata() {
        return this.syncMetadata;
    }

    public ModelWithMetadata(@NonNull M m, @NonNull ModelMetadata modelMetadata) {
        Objects.requireNonNull(m);
        this.model = m;
        Objects.requireNonNull(modelMetadata);
        this.syncMetadata = new ModelMetadata(m.getModelName() + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + m.getPrimaryKeyString(), modelMetadata.isDeleted(), modelMetadata.getVersion(), modelMetadata.getLastChangedAt());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ModelWithMetadata.class != obj.getClass()) {
            return false;
        }
        ModelWithMetadata modelWithMetadata = (ModelWithMetadata) obj;
        if (ObjectsCompat.equals(this.model, modelWithMetadata.model)) {
            return ObjectsCompat.equals(this.syncMetadata, modelWithMetadata.syncMetadata);
        }
        return false;
    }

    public int hashCode() {
        M m = this.model;
        int iHashCode = m != null ? m.hashCode() : 0;
        ModelMetadata modelMetadata = this.syncMetadata;
        return (iHashCode * 31) + (modelMetadata != null ? modelMetadata.hashCode() : 0);
    }

    public String toString() {
        return "ModelWithMetadata{model=" + this.model + ", syncMetadata=" + this.syncMetadata + AbstractJsonLexerKt.END_OBJ;
    }
}
