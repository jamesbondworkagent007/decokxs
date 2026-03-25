package com.amplifyframework.api.graphql;

import android.text.TextUtils;
import androidx.core.util.ObjectsCompat;
import com.amplifyframework.core.model.ModelIdentifier;
import com.amplifyframework.util.Wrap;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes14.dex */
public abstract class GraphQLRequest<R> {
    private final Type responseType;
    private final VariablesSerializer variablesSerializer;

    /* JADX INFO: loaded from: classes21.dex */
    public interface VariablesSerializer {
        String serialize(Map<String, Object> map);
    }

    public abstract String getQuery();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Type getResponseType() {
        return this.responseType;
    }

    public abstract Map<String, Object> getVariables();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public VariablesSerializer getVariablesSerializer() {
        return this.variablesSerializer;
    }

    public GraphQLRequest(Type type, VariablesSerializer variablesSerializer) {
        this.responseType = type;
        this.variablesSerializer = variablesSerializer;
    }

    public String getContent() {
        String strReplace = getQuery().replace(ModelIdentifier.Helper.PRIMARY_KEY_ENCAPSULATE_CHAR, "\\\"").replace("\n", "\\n");
        String strSerialize = getVariables().isEmpty() ? null : this.variablesSerializer.serialize(getVariables());
        return Wrap.inBraces(TextUtils.join(", ", Arrays.asList(Wrap.inDoubleQuotes("query") + ": " + Wrap.inDoubleQuotes(strReplace), Wrap.inDoubleQuotes("variables") + ": " + strSerialize)));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        GraphQLRequest graphQLRequest = (GraphQLRequest) obj;
        return ObjectsCompat.equals(this.responseType, graphQLRequest.responseType) && ObjectsCompat.equals(this.variablesSerializer, graphQLRequest.variablesSerializer);
    }

    public int hashCode() {
        int iHashCode = this.responseType.hashCode();
        VariablesSerializer variablesSerializer = this.variablesSerializer;
        return (iHashCode * 31) + (variablesSerializer != null ? variablesSerializer.hashCode() : 0);
    }

    public String toString() {
        return "GraphQLRequest{, responseType='" + this.responseType + "', variablesSerializer='" + this.variablesSerializer + "'" + AbstractJsonLexerKt.END_OBJ;
    }
}
