package com.amplifyframework.predictions.operation;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amplifyframework.core.async.AmplifyOperation;
import com.amplifyframework.core.category.CategoryType;
import com.amplifyframework.predictions.models.IdentifyAction;
import java.util.Objects;

/* JADX INFO: loaded from: classes14.dex */
public abstract class IdentifyOperation<R> extends AmplifyOperation<R> {
    private final IdentifyAction identifyAction;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public IdentifyAction getIdentifyAction() {
        return this.identifyAction;
    }

    public IdentifyOperation(@NonNull IdentifyAction identifyAction, @Nullable R r) {
        super(CategoryType.PREDICTIONS, r);
        Objects.requireNonNull(identifyAction);
        this.identifyAction = identifyAction;
    }
}
