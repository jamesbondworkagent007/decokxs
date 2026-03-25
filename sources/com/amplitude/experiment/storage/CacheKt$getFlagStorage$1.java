package com.amplitude.experiment.storage;

import com.amplitude.experiment.evaluation.EvaluationFlag;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import o.C5297Mh;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class CacheKt$getFlagStorage$1 extends FunctionReferenceImpl implements Function1<String, EvaluationFlag> {
    public static final CacheKt$getFlagStorage$1 INSTANCE = new CacheKt$getFlagStorage$1();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CacheKt$getFlagStorage$1() {
        super(1, C5297Mh.class, "decodeFlagFromStorage", "decodeFlagFromStorage(Ljava/lang/String;)Lcom/amplitude/experiment/evaluation/EvaluationFlag;", 1);
    }

    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function1
    public final EvaluationFlag invoke(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return C5297Mh.copydefault(str);
    }
}
