package com.okinc.unify_trade.biz;

import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Serializable
public final class InstConfigInfo {
    private final ArrayList<InstMarginModeConfigs> instMarginModeConfigs;
    private final SpotCopyInstSwitchConfig spotCopyInstSwitchConfig;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, new ArrayListSerializer(InstMarginModeConfigs$$serializer.INSTANCE)};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.unify_trade.biz.InstConfigInfo */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InstConfigInfo copy$default(InstConfigInfo instConfigInfo, SpotCopyInstSwitchConfig spotCopyInstSwitchConfig, ArrayList arrayList, int i, Object obj) {
        if ((i & 1) != 0) {
            spotCopyInstSwitchConfig = instConfigInfo.spotCopyInstSwitchConfig;
        }
        if ((i & 2) != 0) {
            arrayList = instConfigInfo.instMarginModeConfigs;
        }
        return instConfigInfo.copy(spotCopyInstSwitchConfig, arrayList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SpotCopyInstSwitchConfig component1() {
        return this.spotCopyInstSwitchConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<InstMarginModeConfigs> component2() {
        return this.instMarginModeConfigs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InstConfigInfo copy(@NotNull SpotCopyInstSwitchConfig spotCopyInstSwitchConfig, @NotNull ArrayList<InstMarginModeConfigs> arrayList) {
        Intrinsics.checkNotNullParameter(spotCopyInstSwitchConfig, "");
        Intrinsics.checkNotNullParameter(arrayList, "");
        return new InstConfigInfo(spotCopyInstSwitchConfig, arrayList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InstConfigInfo)) {
            return false;
        }
        InstConfigInfo instConfigInfo = (InstConfigInfo) obj;
        return Intrinsics.EZpvd(this.spotCopyInstSwitchConfig, instConfigInfo.spotCopyInstSwitchConfig) && Intrinsics.EZpvd(this.instMarginModeConfigs, instConfigInfo.instMarginModeConfigs);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<InstMarginModeConfigs> getInstMarginModeConfigs() {
        return this.instMarginModeConfigs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SpotCopyInstSwitchConfig getSpotCopyInstSwitchConfig() {
        return this.spotCopyInstSwitchConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.spotCopyInstSwitchConfig.hashCode() * 31) + this.instMarginModeConfigs.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "InstConfigInfo(spotCopyInstSwitchConfig=" + this.spotCopyInstSwitchConfig + ", instMarginModeConfigs=" + this.instMarginModeConfigs + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.InstConfigInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<InstConfigInfo> serializer() {
            return InstConfigInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ InstConfigInfo(int i, SpotCopyInstSwitchConfig spotCopyInstSwitchConfig, ArrayList arrayList, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, InstConfigInfo$$serializer.INSTANCE.getDescriptor());
        }
        this.spotCopyInstSwitchConfig = spotCopyInstSwitchConfig;
        this.instMarginModeConfigs = arrayList;
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(InstConfigInfo instConfigInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeSerializableElement(serialDescriptor, 0, SpotCopyInstSwitchConfig$$serializer.INSTANCE, instConfigInfo.spotCopyInstSwitchConfig);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], instConfigInfo.instMarginModeConfigs);
    }

    public InstConfigInfo(@NotNull SpotCopyInstSwitchConfig spotCopyInstSwitchConfig, @NotNull ArrayList<InstMarginModeConfigs> arrayList) {
        Intrinsics.checkNotNullParameter(spotCopyInstSwitchConfig, "");
        Intrinsics.checkNotNullParameter(arrayList, "");
        this.spotCopyInstSwitchConfig = spotCopyInstSwitchConfig;
        this.instMarginModeConfigs = arrayList;
    }
}
