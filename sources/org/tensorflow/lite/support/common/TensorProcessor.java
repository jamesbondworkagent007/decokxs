package org.tensorflow.lite.support.common;

import org.tensorflow.lite.support.common.SequentialProcessor;
import org.tensorflow.lite.support.tensorbuffer.TensorBuffer;

/* JADX INFO: loaded from: classes25.dex */
public class TensorProcessor extends SequentialProcessor<TensorBuffer> {
    private TensorProcessor(Builder builder) {
        super(builder);
    }

    public static class Builder extends SequentialProcessor.Builder<TensorBuffer> {
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [org.tensorflow.lite.support.common.Operator] */
        /* JADX DEBUG: Return type fixed from 'org.tensorflow.lite.support.common.SequentialProcessor$Builder' to match base method */
        @Override // org.tensorflow.lite.support.common.SequentialProcessor.Builder
        public /* bridge */ /* synthetic */ SequentialProcessor.Builder<TensorBuffer> add(Operator<TensorBuffer> operator) {
            return super.add(operator);
        }

        public Builder add(TensorOperator tensorOperator) {
            super.add((Operator) tensorOperator);
            return this;
        }

        /* JADX DEBUG: Method merged with bridge method: build()Lorg/tensorflow/lite/support/common/SequentialProcessor; */
        /* JADX DEBUG: Return type fixed from 'org.tensorflow.lite.support.common.TensorProcessor' to match base method */
        @Override // org.tensorflow.lite.support.common.SequentialProcessor.Builder
        public SequentialProcessor<TensorBuffer> build() {
            return new TensorProcessor(this);
        }
    }
}
