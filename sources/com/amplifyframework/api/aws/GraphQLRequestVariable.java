package com.amplifyframework.api.aws;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class GraphQLRequestVariable {
    private final String key;
    private final String type;
    private final Object value;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ GraphQLRequestVariable copy$default(GraphQLRequestVariable graphQLRequestVariable, String str, Object obj, String str2, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = graphQLRequestVariable.key;
        }
        if ((i & 2) != 0) {
            obj = graphQLRequestVariable.value;
        }
        if ((i & 4) != 0) {
            str2 = graphQLRequestVariable.type;
        }
        return graphQLRequestVariable.copy(str, obj, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.key;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Object component2() {
        return this.value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GraphQLRequestVariable copy(@NotNull String str, @NotNull Object obj, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new GraphQLRequestVariable(str, obj, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GraphQLRequestVariable)) {
            return false;
        }
        GraphQLRequestVariable graphQLRequestVariable = (GraphQLRequestVariable) obj;
        return Intrinsics.EZpvd((Object) this.key, (Object) graphQLRequestVariable.key) && Intrinsics.EZpvd(this.value, graphQLRequestVariable.value) && Intrinsics.EZpvd((Object) this.type, (Object) graphQLRequestVariable.type);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getKey() {
        return this.key;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getType() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Object getValue() {
        return this.value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.key.hashCode() * 31) + this.value.hashCode()) * 31) + this.type.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "GraphQLRequestVariable(key=" + this.key + ", value=" + this.value + ", type=" + this.type + ")";
    }

    public GraphQLRequestVariable(@NotNull String str, @NotNull Object obj, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.key = str;
        this.value = obj;
        this.type = str2;
    }
}
