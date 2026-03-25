package com.okinc.business.web3pay.lib.features.asset.model;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class AssetAll {
    private final List<TokenAsset> groupBalanceDTO;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(TokenAsset$$serializer.INSTANCE)};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.web3pay.lib.features.asset.model.AssetAll */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AssetAll copy$default(AssetAll assetAll, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = assetAll.groupBalanceDTO;
        }
        return assetAll.copy(list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<TokenAsset> component1() {
        return this.groupBalanceDTO;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AssetAll copy(@NotNull List<TokenAsset> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return new AssetAll(list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AssetAll) && Intrinsics.EZpvd(this.groupBalanceDTO, ((AssetAll) obj).groupBalanceDTO);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<TokenAsset> getGroupBalanceDTO() {
        return this.groupBalanceDTO;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.groupBalanceDTO.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AssetAll(groupBalanceDTO=" + this.groupBalanceDTO + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.web3pay.lib.features.asset.model.AssetAll.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<AssetAll> serializer() {
            return AssetAll$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ AssetAll(int i, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, AssetAll$$serializer.INSTANCE.getDescriptor());
        }
        this.groupBalanceDTO = list;
    }

    public AssetAll(@NotNull List<TokenAsset> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.groupBalanceDTO = list;
    }
}
