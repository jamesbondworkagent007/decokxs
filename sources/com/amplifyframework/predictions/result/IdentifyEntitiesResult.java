package com.amplifyframework.predictions.result;

import androidx.annotation.NonNull;
import com.amplifyframework.predictions.models.EntityDetails;
import com.amplifyframework.util.Immutable;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes21.dex */
public final class IdentifyEntitiesResult implements IdentifyResult {
    private final List<EntityDetails> entities;

    private IdentifyEntitiesResult(List<EntityDetails> list) {
        this.entities = list;
    }

    public static IdentifyEntitiesResult fromEntityDetails(@NonNull List<EntityDetails> list) {
        Objects.requireNonNull(list);
        return new IdentifyEntitiesResult(list);
    }

    public List<EntityDetails> getEntities() {
        return Immutable.of(this.entities);
    }
}
