package com.amplifyframework.api.aws;

import com.amplifyframework.core.model.PaginationToken;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class ApiPaginationToken implements PaginationToken {
    private final String nextToken;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNextToken() {
        return this.nextToken;
    }

    public ApiPaginationToken(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.nextToken = str;
    }
}
