package com.amplitude.experiment.storage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import o.C5297Mh;
import o.LP;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class CacheKt$getVariantStorage$2 extends FunctionReferenceImpl implements Function1<LP, String> {
    public static final CacheKt$getVariantStorage$2 INSTANCE = new CacheKt$getVariantStorage$2();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CacheKt$getVariantStorage$2() {
        super(1, C5297Mh.class, "encodeVariantToStorage", "encodeVariantToStorage(Lcom/amplitude/experiment/Variant;)Ljava/lang/String;", 1);
    }

    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function1
    public final String invoke(@NotNull LP lp) {
        Intrinsics.checkNotNullParameter(lp, "");
        return C5297Mh.OLrzqt(lp);
    }
}
