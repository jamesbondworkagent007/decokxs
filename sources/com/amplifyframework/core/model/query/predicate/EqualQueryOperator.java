package com.amplifyframework.core.model.query.predicate;

import androidx.core.util.ObjectsCompat;
import com.amplifyframework.core.model.query.predicate.QueryOperator;

/* JADX INFO: loaded from: classes21.dex */
public final class EqualQueryOperator extends QueryOperator<Object> {
    private final Object value;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Object value() {
        return this.value;
    }

    public EqualQueryOperator(Object obj) {
        super(QueryOperator.Type.EQUAL);
        this.value = obj;
    }

    @Override // com.amplifyframework.core.model.query.predicate.Evaluable
    public boolean evaluate(Object obj) {
        return obj.equals(this.value);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || EqualQueryOperator.class != obj.getClass()) {
            return false;
        }
        EqualQueryOperator equalQueryOperator = (EqualQueryOperator) obj;
        return ObjectsCompat.equals(type(), equalQueryOperator.type()) && ObjectsCompat.equals(value(), equalQueryOperator.value());
    }

    public int hashCode() {
        return ObjectsCompat.hash(type(), value());
    }

    public String toString() {
        return "EqualQueryOperator { type: " + type() + ", value: " + value() + " }";
    }
}
