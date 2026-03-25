package com.amplifyframework.api.graphql;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.util.ObjectsCompat;
import com.amplifyframework.api.ApiException;
import com.amplifyframework.util.Immutable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes14.dex */
public final class GraphQLResponse<R> {
    private final R data;
    private final List<Error> errors;

    /* JADX INFO: loaded from: classes21.dex */
    public interface Factory {
        <R> GraphQLResponse<R> buildResponse(GraphQLRequest<R> graphQLRequest, String str) throws ApiException;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public R getData() {
        return this.data;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public List<Error> getErrors() {
        return this.errors;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean hasData() {
        return this.data != null;
    }

    public GraphQLResponse(@Nullable R r, @Nullable List<Error> list) {
        this.data = r;
        ArrayList arrayList = new ArrayList();
        this.errors = arrayList;
        if (list != null) {
            arrayList.addAll(list);
        }
    }

    public boolean hasErrors() {
        return this.errors.size() > 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || GraphQLResponse.class != obj.getClass()) {
            return false;
        }
        GraphQLResponse graphQLResponse = (GraphQLResponse) obj;
        if (ObjectsCompat.equals(this.data, graphQLResponse.data)) {
            return ObjectsCompat.equals(this.errors, graphQLResponse.errors);
        }
        return false;
    }

    public int hashCode() {
        R r = this.data;
        int iHashCode = r != null ? r.hashCode() : 0;
        List<Error> list = this.errors;
        return (iHashCode * 31) + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        return "GraphQLResponse{data='" + this.data + "', errors='" + this.errors + "'" + AbstractJsonLexerKt.END_OBJ;
    }

    /* JADX INFO: loaded from: classes21.dex */
    public static final class Error {
        private final Map<String, Object> extensions;
        private final List<GraphQLLocation> locations;
        private final String message;
        private final List<GraphQLPathSegment> path;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String getMessage() {
            return this.message;
        }

        public Error(@NonNull String str, @Nullable List<GraphQLLocation> list, @Nullable List<GraphQLPathSegment> list2, @Nullable Map<String, Object> map) {
            Objects.requireNonNull(str);
            this.message = str;
            this.locations = list;
            this.path = list2;
            this.extensions = map;
        }

        public List<GraphQLLocation> getLocations() {
            return Immutable.of(this.locations);
        }

        public List<GraphQLPathSegment> getPath() {
            return Immutable.of(this.path);
        }

        public Map<String, Object> getExtensions() {
            return Immutable.of(this.extensions);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || Error.class != obj.getClass()) {
                return false;
            }
            Error error = (Error) obj;
            return ObjectsCompat.equals(this.message, error.message) && ObjectsCompat.equals(this.locations, error.locations) && ObjectsCompat.equals(this.path, error.path) && ObjectsCompat.equals(this.extensions, error.extensions);
        }

        public int hashCode() {
            int iHashCode = this.message.hashCode();
            List<GraphQLLocation> list = this.locations;
            int iHashCode2 = list != null ? list.hashCode() : 0;
            List<GraphQLPathSegment> list2 = this.path;
            int iHashCode3 = list2 != null ? list2.hashCode() : 0;
            Map<String, Object> map = this.extensions;
            return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (map != null ? map.hashCode() : 0);
        }

        public String toString() {
            return "GraphQLResponse.Error{message='" + this.message + "', locations='" + this.locations + "', path='" + this.path + "', extensions='" + this.extensions + "'" + AbstractJsonLexerKt.END_OBJ;
        }
    }
}
