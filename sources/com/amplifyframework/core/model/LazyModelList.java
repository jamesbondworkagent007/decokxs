package com.amplifyframework.core.model;

import com.amplifyframework.AmplifyException;
import com.amplifyframework.core.Consumer;
import com.amplifyframework.core.model.Model;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public interface LazyModelList<M extends Model> extends ModelList<M> {
    /* synthetic */ Object fetchPage(PaginationToken paginationToken, Continuation continuation) throws AmplifyException;

    void fetchPage(@NotNull Consumer<ModelPage<M>> consumer, @NotNull Consumer<AmplifyException> consumer2);

    void fetchPage(PaginationToken paginationToken, @NotNull Consumer<ModelPage<M>> consumer, @NotNull Consumer<AmplifyException> consumer2);

    public static final class DefaultImpls {
        public static /* synthetic */ Object fetchPage$default(LazyModelList lazyModelList, PaginationToken paginationToken, Continuation continuation, int i, Object obj) throws AmplifyException {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fetchPage");
            }
            if ((i & 1) != 0) {
                paginationToken = null;
            }
            return lazyModelList.fetchPage(paginationToken, continuation);
        }
    }
}
