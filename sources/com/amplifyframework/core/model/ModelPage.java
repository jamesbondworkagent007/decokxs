package com.amplifyframework.core.model;

import com.amplifyframework.core.model.Model;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public interface ModelPage<M extends Model> {
    boolean getHasNextPage();

    List<M> getItems();

    PaginationToken getNextToken();

    public static final class DefaultImpls {
        public static <M extends Model> boolean getHasNextPage(@NotNull ModelPage<? extends M> modelPage) {
            return modelPage.getNextToken() != null;
        }
    }
}
