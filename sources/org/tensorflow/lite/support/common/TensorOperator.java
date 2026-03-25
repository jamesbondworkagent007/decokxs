package org.tensorflow.lite.support.common;

import org.tensorflow.lite.support.tensorbuffer.TensorBuffer;

/* JADX INFO: loaded from: classes13.dex */
public interface TensorOperator extends Operator<TensorBuffer> {
    /* JADX DEBUG: Method merged with bridge method: apply(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // org.tensorflow.lite.support.common.Operator
    TensorBuffer apply(TensorBuffer tensorBuffer);
}
