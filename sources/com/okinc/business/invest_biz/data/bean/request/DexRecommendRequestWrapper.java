package com.okinc.business.invest_biz.data.bean.request;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class DexRecommendRequestWrapper {
    private final List<DexRecommendApyListRequest> paramList;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(DexRecommendApyListRequest$$serializer.INSTANCE)};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.invest_biz.data.bean.request.DexRecommendRequestWrapper */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DexRecommendRequestWrapper copy$default(DexRecommendRequestWrapper dexRecommendRequestWrapper, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = dexRecommendRequestWrapper.paramList;
        }
        return dexRecommendRequestWrapper.copy(list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<DexRecommendApyListRequest> component1() {
        return this.paramList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexRecommendRequestWrapper copy(@NotNull List<DexRecommendApyListRequest> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return new DexRecommendRequestWrapper(list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DexRecommendRequestWrapper) && Intrinsics.EZpvd(this.paramList, ((DexRecommendRequestWrapper) obj).paramList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<DexRecommendApyListRequest> getParamList() {
        return this.paramList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.paramList.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "DexRecommendRequestWrapper(paramList=" + this.paramList + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.data.bean.request.DexRecommendRequestWrapper.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<DexRecommendRequestWrapper> serializer() {
            return DexRecommendRequestWrapper$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ DexRecommendRequestWrapper(int i, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, DexRecommendRequestWrapper$$serializer.INSTANCE.getDescriptor());
        }
        this.paramList = list;
    }

    public DexRecommendRequestWrapper(@NotNull List<DexRecommendApyListRequest> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.paramList = list;
    }
}
