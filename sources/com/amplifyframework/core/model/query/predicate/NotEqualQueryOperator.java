package com.amplifyframework.core.model.query.predicate;

import androidx.core.util.ObjectsCompat;
import com.amplifyframework.core.model.query.predicate.QueryOperator;

/* JADX INFO: loaded from: classes21.dex */
public final class NotEqualQueryOperator extends QueryOperator<Object> {
    private final Object value;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Object value() {
        return this.value;
    }

    public NotEqualQueryOperator(Object obj) {
        super(QueryOperator.Type.NOT_EQUAL);
        this.value = obj;
    }

    @Override // com.amplifyframework.core.model.query.predicate.Evaluable
    public boolean evaluate(Object obj) {
        return !obj.equals(this.value);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || NotEqualQueryOperator.class != obj.getClass()) {
            return false;
        }
        NotEqualQueryOperator notEqualQueryOperator = (NotEqualQueryOperator) obj;
        return ObjectsCompat.equals(type(), notEqualQueryOperator.type()) && ObjectsCompat.equals(value(), notEqualQueryOperator.value());
    }

    public int hashCode() {
        return ObjectsCompat.hash(type(), value());
    }

    public String toString() {
        return "NotEqualQueryOperator { type: " + type() + ", value: " + value() + " }";
    }
}
