package com.okinc.assets.backend.api.model;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Serializable
public final class RecommendedProducts {
    private final List<Product> recommendedProducts;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(Product$$serializer.INSTANCE)};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.assets.backend.api.model.RecommendedProducts */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RecommendedProducts copy$default(RecommendedProducts recommendedProducts, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = recommendedProducts.recommendedProducts;
        }
        return recommendedProducts.copy(list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Product> component1() {
        return this.recommendedProducts;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RecommendedProducts copy(@NotNull List<Product> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return new RecommendedProducts(list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RecommendedProducts) && Intrinsics.EZpvd(this.recommendedProducts, ((RecommendedProducts) obj).recommendedProducts);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Product> getRecommendedProducts() {
        return this.recommendedProducts;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.recommendedProducts.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "RecommendedProducts(recommendedProducts=" + this.recommendedProducts + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.assets.backend.api.model.RecommendedProducts.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<RecommendedProducts> serializer() {
            return RecommendedProducts$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ RecommendedProducts(int i, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, RecommendedProducts$$serializer.INSTANCE.getDescriptor());
        }
        this.recommendedProducts = list;
    }

    public RecommendedProducts(@NotNull List<Product> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.recommendedProducts = list;
    }
}
