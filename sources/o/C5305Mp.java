package o;

import com.amplitude.experiment.evaluation.EvaluationFlag;
import com.google.android.gms.common.internal.ImagesContract;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.Mp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5305Mp {
    public static final boolean OLrzqt(EvaluationFlag evaluationFlag) {
        java.util.Map<java.lang.String, java.lang.Object> mapOLrzqt;
        return Intrinsics.EZpvd((evaluationFlag == null || (mapOLrzqt = evaluationFlag.OLrzqt()) == null) ? null : mapOLrzqt.get("evaluationMode"), (java.lang.Object) ImagesContract.LOCAL);
    }
}
