package org.tensorflow.lite.support.common;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.tensorflow.lite.support.common.internal.SupportPreconditions;

/* JADX INFO: loaded from: classes13.dex */
public class SequentialProcessor<T> implements Processor<T> {
    public final Map<String, List<Integer>> operatorIndex;
    public final List<Operator<T>> operatorList;

    public SequentialProcessor(Builder<T> builder) {
        this.operatorList = ((Builder) builder).operatorList;
        this.operatorIndex = Collections.unmodifiableMap(((Builder) builder).operatorIndex);
    }

    @Override // org.tensorflow.lite.support.common.Processor
    public T process(T t) {
        Iterator<Operator<T>> it = this.operatorList.iterator();
        while (it.hasNext()) {
            t = it.next().apply(t);
        }
        return t;
    }

    public static class Builder<T> {
        private final List<Operator<T>> operatorList = new ArrayList();
        private final Map<String, List<Integer>> operatorIndex = new HashMap();

        public Builder<T> add(Operator<T> operator) {
            SupportPreconditions.checkNotNull(operator, "Adding null Op is illegal.");
            this.operatorList.add(operator);
            String name = operator.getClass().getName();
            if (!this.operatorIndex.containsKey(name)) {
                this.operatorIndex.put(name, new ArrayList());
            }
            this.operatorIndex.get(name).add(Integer.valueOf(this.operatorList.size() - 1));
            return this;
        }

        public SequentialProcessor<T> build() {
            return new SequentialProcessor<>(this);
        }
    }
}
