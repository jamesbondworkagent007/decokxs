package com.amplifyframework.core.model.query.predicate;

import androidx.core.util.ObjectsCompat;
import com.amplifyframework.core.model.query.predicate.QueryOperator;

/* JADX INFO: loaded from: classes21.dex */
public final class NotContainsQueryOperator extends QueryOperator<String> {
    private final String value;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Object value() {
        return this.value;
    }

    public NotContainsQueryOperator(String str) {
        super(QueryOperator.Type.NOT_CONTAINS);
        this.value = str;
    }

    /* JADX DEBUG: Method merged with bridge method: evaluate(Ljava/lang/Object;)Z */
    @Override // com.amplifyframework.core.model.query.predicate.Evaluable
    public boolean evaluate(String str) {
        return !str.contains(this.value);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || NotContainsQueryOperator.class != obj.getClass()) {
            return false;
        }
        NotContainsQueryOperator notContainsQueryOperator = (NotContainsQueryOperator) obj;
        return ObjectsCompat.equals(type(), notContainsQueryOperator.type()) && ObjectsCompat.equals(value(), notContainsQueryOperator.value());
    }

    public int hashCode() {
        return ObjectsCompat.hash(type(), value());
    }

    public String toString() {
        return "NotContainsQueryOperator { type: " + type() + ", value: " + value() + " }";
    }
}
