package com.amplifyframework.core.model.query.predicate;

import androidx.core.util.ObjectsCompat;
import com.amplifyframework.core.model.query.predicate.QueryOperator;
import java.lang.Comparable;

/* JADX INFO: loaded from: classes21.dex */
public final class LessThanQueryOperator<T extends Comparable<T>> extends QueryOperator<T> {
    private final T value;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public T value() {
        return this.value;
    }

    public LessThanQueryOperator(T t) {
        super(QueryOperator.Type.LESS_THAN);
        this.value = t;
    }

    /* JADX DEBUG: Method merged with bridge method: evaluate(Ljava/lang/Object;)Z */
    @Override // com.amplifyframework.core.model.query.predicate.Evaluable
    public boolean evaluate(T t) {
        return t.compareTo(this.value) < 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || LessThanQueryOperator.class != obj.getClass()) {
            return false;
        }
        LessThanQueryOperator lessThanQueryOperator = (LessThanQueryOperator) obj;
        return ObjectsCompat.equals(type(), lessThanQueryOperator.type()) && ObjectsCompat.equals(value(), lessThanQueryOperator.value());
    }

    public int hashCode() {
        return ObjectsCompat.hash(type(), value());
    }

    public String toString() {
        return "LessThanQueryOperator { type: " + type() + ", value: " + value() + " }";
    }
}
