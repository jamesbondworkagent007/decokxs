package org.tensorflow.lite.support.label.ops;

import android.content.Context;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.tensorflow.lite.support.common.FileUtil;
import org.tensorflow.lite.support.common.internal.SupportPreconditions;
import org.tensorflow.lite.support.label.TensorLabel;
import org.tensorflow.lite.support.tensorbuffer.TensorBuffer;

/* JADX INFO: loaded from: classes25.dex */
public class LabelAxisOp {
    private final Map<Integer, List<String>> axisLabels;

    public LabelAxisOp(Builder builder) {
        this.axisLabels = builder.axisLabels;
    }

    public TensorLabel apply(TensorBuffer tensorBuffer) {
        SupportPreconditions.checkNotNull(tensorBuffer, "Tensor buffer cannot be null.");
        return new TensorLabel(this.axisLabels, tensorBuffer);
    }

    public static class Builder {
        private final Map<Integer, List<String>> axisLabels = new HashMap();

        public Builder addAxisLabel(Context context, int i, String str) throws IOException {
            SupportPreconditions.checkNotNull(context, "Context cannot be null.");
            SupportPreconditions.checkNotNull(str, "File path cannot be null.");
            this.axisLabels.put(Integer.valueOf(i), FileUtil.loadLabels(context, str));
            return this;
        }

        public Builder addAxisLabel(int i, List<String> list) {
            this.axisLabels.put(Integer.valueOf(i), list);
            return this;
        }

        public LabelAxisOp build() {
            return new LabelAxisOp(this);
        }
    }
}
