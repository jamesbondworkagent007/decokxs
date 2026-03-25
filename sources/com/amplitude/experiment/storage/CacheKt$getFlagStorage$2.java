package com.amplitude.experiment.storage;

import com.amplitude.experiment.evaluation.EvaluationFlag;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import o.C5297Mh;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class CacheKt$getFlagStorage$2 extends FunctionReferenceImpl implements Function1<EvaluationFlag, String> {
    public static final CacheKt$getFlagStorage$2 INSTANCE = new CacheKt$getFlagStorage$2();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CacheKt$getFlagStorage$2() {
        super(1, C5297Mh.class, "encodeFlagToStorage", "encodeFlagToStorage(Lcom/amplitude/experiment/evaluation/EvaluationFlag;)Ljava/lang/String;", 1);
    }

    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function1
    public final String invoke(@NotNull EvaluationFlag evaluationFlag) {
        Intrinsics.checkNotNullParameter(evaluationFlag, "");
        return C5297Mh.OLrzqt(evaluationFlag);
    }
}
