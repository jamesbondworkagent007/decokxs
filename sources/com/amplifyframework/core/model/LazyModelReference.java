package com.amplifyframework.core.model;

import com.amplifyframework.AmplifyException;
import com.amplifyframework.core.Consumer;
import com.amplifyframework.core.NullableConsumer;
import com.amplifyframework.core.model.Model;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public interface LazyModelReference<M extends Model> extends ModelReference<M> {
    /* synthetic */ Object fetchModel(Continuation continuation) throws AmplifyException;

    void fetchModel(@NotNull NullableConsumer<M> nullableConsumer, @NotNull Consumer<AmplifyException> consumer);
}
