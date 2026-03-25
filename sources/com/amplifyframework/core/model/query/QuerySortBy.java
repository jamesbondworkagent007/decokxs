package com.amplifyframework.core.model.query;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.util.ObjectsCompat;
import com.amplifyframework.util.Wrap;
import java.util.Objects;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes21.dex */
public final class QuerySortBy {
    private final String field;
    private final String modelName;
    private final QuerySortOrder sortOrder;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getField() {
        return this.field;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getModelName() {
        return this.modelName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public QuerySortOrder getSortOrder() {
        return this.sortOrder;
    }

    public QuerySortBy(@NonNull String str, @NonNull QuerySortOrder querySortOrder) {
        this(null, str, querySortOrder);
    }

    public QuerySortBy(@Nullable String str, @NonNull String str2, @NonNull QuerySortOrder querySortOrder) {
        this.modelName = str;
        Objects.requireNonNull(str2);
        this.field = str2;
        Objects.requireNonNull(querySortOrder);
        this.sortOrder = querySortOrder;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || QuerySortBy.class != obj.getClass()) {
            return false;
        }
        QuerySortBy querySortBy = (QuerySortBy) obj;
        return ObjectsCompat.equals(this.modelName, querySortBy.modelName) && ObjectsCompat.equals(this.field, querySortBy.field) && ObjectsCompat.equals(this.sortOrder, querySortBy.sortOrder);
    }

    public int hashCode() {
        return ObjectsCompat.hash(this.modelName, this.field, this.sortOrder);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("QuerySortBy{model=");
        String str = this.modelName;
        sb.append(str == null ? null : Wrap.inSingleQuotes(str));
        sb.append(", field=");
        sb.append(Wrap.inSingleQuotes(this.field));
        sb.append(", sortOrder=");
        sb.append(this.sortOrder);
        sb.append(AbstractJsonLexerKt.END_OBJ);
        return sb.toString();
    }
}
