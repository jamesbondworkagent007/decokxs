package com.amplifyframework.api.aws;

import com.amplifyframework.core.model.LoadedModelList;
import com.amplifyframework.core.model.Model;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class ApiLoadedModelList<M extends Model> implements LoadedModelList<M> {
    private final List<M> items;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.amplifyframework.core.model.LoadedModelList
    public List<M> getItems() {
        return this.items;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends M extends com.amplifyframework.core.model.Model> */
    /* JADX WARN: Multi-variable type inference failed */
    public ApiLoadedModelList(@NotNull List<? extends M> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.items = list;
    }
}
