package com.amplitude.experiment.storage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import o.C5297Mh;
import o.LP;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class CacheKt$getVariantStorage$1 extends FunctionReferenceImpl implements Function1<String, LP> {
    public static final CacheKt$getVariantStorage$1 INSTANCE = new CacheKt$getVariantStorage$1();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CacheKt$getVariantStorage$1() {
        super(1, C5297Mh.class, "decodeVariantFromStorage", "decodeVariantFromStorage(Ljava/lang/String;)Lcom/amplitude/experiment/Variant;", 1);
    }

    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function1
    public final LP invoke(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return C5297Mh.EZpvd(str);
    }
}
