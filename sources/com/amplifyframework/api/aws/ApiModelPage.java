package com.amplifyframework.api.aws;

import com.amplifyframework.core.model.Model;
import com.amplifyframework.core.model.ModelPage;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class ApiModelPage<M extends Model> implements ModelPage<M> {
    private final List<M> items;
    private final ApiPaginationToken nextToken;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.amplifyframework.core.model.ModelPage
    public List<M> getItems() {
        return this.items;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getNextToken()Lcom/amplifyframework/core/model/PaginationToken; */
    @Override // com.amplifyframework.core.model.ModelPage
    public ApiPaginationToken getNextToken() {
        return this.nextToken;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends M extends com.amplifyframework.core.model.Model> */
    /* JADX WARN: Multi-variable type inference failed */
    public ApiModelPage(@NotNull List<? extends M> list, ApiPaginationToken apiPaginationToken) {
        Intrinsics.checkNotNullParameter(list, "");
        this.items = list;
        this.nextToken = apiPaginationToken;
    }

    @Override // com.amplifyframework.core.model.ModelPage
    public boolean getHasNextPage() {
        return ModelPage.DefaultImpls.getHasNextPage(this);
    }
}
