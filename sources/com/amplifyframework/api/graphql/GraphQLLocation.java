package com.amplifyframework.api.graphql;

import androidx.annotation.Nullable;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes21.dex */
public final class GraphQLLocation {
    private int column;
    private int line;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int getColumn() {
        return this.column;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int getLine() {
        return this.line;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.line * 31) + this.column;
    }

    public GraphQLLocation(int i, int i2) {
        this.line = i;
        this.column = i2;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || GraphQLLocation.class != obj.getClass()) {
            return false;
        }
        GraphQLLocation graphQLLocation = (GraphQLLocation) obj;
        return this.line == graphQLLocation.line && this.column == graphQLLocation.column;
    }

    public String toString() {
        return "GraphQLLocation{line='" + this.line + "', column='" + this.column + "'" + AbstractJsonLexerKt.END_OBJ;
    }
}
