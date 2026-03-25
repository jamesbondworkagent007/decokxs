package com.amplifyframework.core.model.query.predicate;

import androidx.annotation.NonNull;
import androidx.core.util.ObjectsCompat;
import com.amplifyframework.annotations.InternalAmplifyApi;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes21.dex */
public final class QueryPredicateGroup implements QueryPredicate {
    private final List<QueryPredicate> predicates;
    private final Type type;

    public enum Type {
        AND,
        OR,
        NOT
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public List<QueryPredicate> predicates() {
        return this.predicates;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Type type() {
        return this.type;
    }

    @InternalAmplifyApi
    public QueryPredicateGroup(@NonNull Type type, @NonNull List<QueryPredicate> list) {
        this.type = type;
        this.predicates = new ArrayList(list);
        if (list.isEmpty()) {
            throw new IllegalArgumentException("A predicate group must contain at least one predicate element");
        }
    }

    public static QueryPredicate andOf(QueryPredicate queryPredicate) {
        return new QueryPredicateGroup(Type.AND, Arrays.asList(queryPredicate));
    }

    /* JADX DEBUG: Method merged with bridge method: and(Lcom/amplifyframework/core/model/query/predicate/QueryPredicate;)Lcom/amplifyframework/core/model/query/predicate/QueryPredicate; */
    @Override // com.amplifyframework.core.model.query.predicate.QueryPredicate
    public QueryPredicateGroup and(QueryPredicate queryPredicate) {
        Type type = Type.AND;
        if (!type.equals(this.type)) {
            return new QueryPredicateGroup(type, Arrays.asList(this, queryPredicate));
        }
        this.predicates.add(queryPredicate);
        return this;
    }

    /* JADX DEBUG: Method merged with bridge method: or(Lcom/amplifyframework/core/model/query/predicate/QueryPredicate;)Lcom/amplifyframework/core/model/query/predicate/QueryPredicate; */
    @Override // com.amplifyframework.core.model.query.predicate.QueryPredicate
    public QueryPredicateGroup or(QueryPredicate queryPredicate) {
        Type type = Type.OR;
        if (!type.equals(this.type)) {
            return new QueryPredicateGroup(type, Arrays.asList(this, queryPredicate));
        }
        this.predicates.add(queryPredicate);
        return this;
    }

    public static QueryPredicateGroup not(QueryPredicateGroup queryPredicateGroup) {
        return new QueryPredicateGroup(Type.NOT, Collections.singletonList(queryPredicateGroup));
    }

    /* JADX INFO: renamed from: com.amplifyframework.core.model.query.predicate.QueryPredicateGroup$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$amplifyframework$core$model$query$predicate$QueryPredicateGroup$Type;

        static {
            int[] iArr = new int[Type.values().length];
            $SwitchMap$com$amplifyframework$core$model$query$predicate$QueryPredicateGroup$Type = iArr;
            try {
                iArr[Type.OR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$amplifyframework$core$model$query$predicate$QueryPredicateGroup$Type[Type.AND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$amplifyframework$core$model$query$predicate$QueryPredicateGroup$Type[Type.NOT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    @Override // com.amplifyframework.core.model.query.predicate.Evaluable
    public boolean evaluate(Object obj) throws IllegalArgumentException {
        int i = AnonymousClass1.$SwitchMap$com$amplifyframework$core$model$query$predicate$QueryPredicateGroup$Type[this.type.ordinal()];
        if (i == 1) {
            Iterator<QueryPredicate> it = this.predicates.iterator();
            while (it.hasNext()) {
                if (it.next().evaluate(obj)) {
                    return true;
                }
            }
            return false;
        }
        if (i != 2) {
            if (i != 3) {
                return false;
            }
            return !this.predicates.get(0).evaluate(obj);
        }
        Iterator<QueryPredicate> it2 = this.predicates.iterator();
        while (it2.hasNext()) {
            if (!it2.next().evaluate(obj)) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || QueryPredicateGroup.class != obj.getClass()) {
            return false;
        }
        QueryPredicateGroup queryPredicateGroup = (QueryPredicateGroup) obj;
        return ObjectsCompat.equals(type(), queryPredicateGroup.type()) && ObjectsCompat.equals(predicates(), queryPredicateGroup.predicates());
    }

    public int hashCode() {
        return ObjectsCompat.hash(type(), predicates());
    }

    public String toString() {
        return "QueryPredicateGroup { type: " + type() + ", predicates: " + predicates() + " }";
    }
}
