package com.okinc.business.invest_biz.data.bean.request;

import com.okinc.business.invest_api.bean.TokenInfo;
import com.okinc.business.invest_api.bean.TokenInfo$$serializer;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class DexRecommendApyListRequest {
    private final List<TokenInfo> assetList;
    private final String tokenTicker;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(TokenInfo$$serializer.INSTANCE), null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.invest_biz.data.bean.request.DexRecommendApyListRequest */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DexRecommendApyListRequest copy$default(DexRecommendApyListRequest dexRecommendApyListRequest, List list, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            list = dexRecommendApyListRequest.assetList;
        }
        if ((i & 2) != 0) {
            str = dexRecommendApyListRequest.tokenTicker;
        }
        return dexRecommendApyListRequest.copy(list, str);
    }

    @SerialName("holdingAssetList")
    public static /* synthetic */ void getAssetList$annotations() {
    }

    @SerialName("tokenTicker")
    public static /* synthetic */ void getTokenTicker$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<TokenInfo> component1() {
        return this.assetList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.tokenTicker;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexRecommendApyListRequest copy(@NotNull List<TokenInfo> list, @NotNull String str) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        return new DexRecommendApyListRequest(list, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DexRecommendApyListRequest)) {
            return false;
        }
        DexRecommendApyListRequest dexRecommendApyListRequest = (DexRecommendApyListRequest) obj;
        return Intrinsics.EZpvd(this.assetList, dexRecommendApyListRequest.assetList) && Intrinsics.EZpvd((Object) this.tokenTicker, (Object) dexRecommendApyListRequest.tokenTicker);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<TokenInfo> getAssetList() {
        return this.assetList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenTicker() {
        return this.tokenTicker;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.assetList.hashCode() * 31) + this.tokenTicker.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "DexRecommendApyListRequest(assetList=" + this.assetList + ", tokenTicker=" + this.tokenTicker + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.data.bean.request.DexRecommendApyListRequest.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<DexRecommendApyListRequest> serializer() {
            return DexRecommendApyListRequest$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ DexRecommendApyListRequest(int i, List list, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, DexRecommendApyListRequest$$serializer.INSTANCE.getDescriptor());
        }
        this.assetList = list;
        this.tokenTicker = str;
    }

    public static final /* synthetic */ void write$Self$OKDeFi_invest_biz(DexRecommendApyListRequest dexRecommendApyListRequest, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeSerializableElement(serialDescriptor, 0, $childSerializers[0], dexRecommendApyListRequest.assetList);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, dexRecommendApyListRequest.tokenTicker);
    }

    public DexRecommendApyListRequest(@NotNull List<TokenInfo> list, @NotNull String str) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.assetList = list;
        this.tokenTicker = str;
    }
}
