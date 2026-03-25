package com.amplifyframework.datastore;

import androidx.annotation.NonNull;
import androidx.core.util.ObjectsCompat;
import com.amplifyframework.AmplifyException;
import com.amplifyframework.api.graphql.GraphQLResponse;
import com.amplifyframework.util.Immutable;
import java.util.List;
import java.util.Objects;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public class DataStoreException extends AmplifyException {
    private static final long serialVersionUID = 1;

    public DataStoreException(@NonNull String str, Throwable th, @NonNull String str2) {
        super(str, th, str2);
    }

    public DataStoreException(@NonNull String str, @NonNull String str2) {
        super(str, str2);
    }

    /* JADX INFO: loaded from: classes21.dex */
    public static final class GraphQLResponseException extends DataStoreException {
        private static final long serialVersionUID = 1;
        private final List<GraphQLResponse.Error> errors;

        public GraphQLResponseException(String str, @NonNull List<GraphQLResponse.Error> list) {
            super(str, "See attached list of GraphQLResponse.Error objects.");
            Objects.requireNonNull(list);
            this.errors = list;
        }

        public List<GraphQLResponse.Error> getErrors() {
            return Immutable.of(this.errors);
        }

        @Override // com.amplifyframework.AmplifyException
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && GraphQLResponseException.class == obj.getClass() && super.equals(obj)) {
                return ObjectsCompat.equals(this.errors, ((GraphQLResponseException) obj).errors);
            }
            return false;
        }

        @Override // com.amplifyframework.AmplifyException
        public int hashCode() {
            int iHashCode = super.hashCode();
            return ObjectsCompat.hash(Integer.valueOf(iHashCode), this.errors);
        }

        @Override // com.amplifyframework.AmplifyException, java.lang.Throwable
        public String toString() {
            return "GraphQLResponseException{message=" + getMessage() + ", errors=" + this.errors + ", recoverySuggestion=" + getRecoverySuggestion() + AbstractJsonLexerKt.END_OBJ;
        }
    }

    /* JADX INFO: loaded from: classes21.dex */
    public static class IrRecoverableException extends DataStoreException {
        private static final long serialVersionUID = 1;

        public IrRecoverableException(@NonNull @NotNull String str, @NotNull String str2) {
            super(str, str2);
        }
    }
}
