package com.okinc.unify_trade.biz;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Serializable
public final class ConfigInstListData {
    private final List<String> instFamilyList;
    private final String instType;
    private final boolean isSetAllByInstType;
    private final String marginMode;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, new ArrayListSerializer(BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE)), null, null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.unify_trade.biz.ConfigInstListData */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ConfigInstListData copy$default(ConfigInstListData configInstListData, String str, List list, String str2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = configInstListData.marginMode;
        }
        if ((i & 2) != 0) {
            list = configInstListData.instFamilyList;
        }
        if ((i & 4) != 0) {
            str2 = configInstListData.instType;
        }
        if ((i & 8) != 0) {
            z = configInstListData.isSetAllByInstType;
        }
        return configInstListData.copy(str, list, str2, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.marginMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component2() {
        return this.instFamilyList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.instType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component4() {
        return this.isSetAllByInstType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ConfigInstListData copy(@NotNull String str, List<String> list, String str2, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        return new ConfigInstListData(str, list, str2, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConfigInstListData)) {
            return false;
        }
        ConfigInstListData configInstListData = (ConfigInstListData) obj;
        return Intrinsics.EZpvd((Object) this.marginMode, (Object) configInstListData.marginMode) && Intrinsics.EZpvd(this.instFamilyList, configInstListData.instFamilyList) && Intrinsics.EZpvd((Object) this.instType, (Object) configInstListData.instType) && this.isSetAllByInstType == configInstListData.isSetAllByInstType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getInstFamilyList() {
        return this.instFamilyList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInstType() {
        return this.instType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMarginMode() {
        return this.marginMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.marginMode.hashCode();
        List<String> list = this.instFamilyList;
        int iHashCode2 = list == null ? 0 : list.hashCode();
        String str = this.instType;
        return (((((iHashCode * 31) + iHashCode2) * 31) + (str != null ? str.hashCode() : 0)) * 31) + Boolean.hashCode(this.isSetAllByInstType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isSetAllByInstType() {
        return this.isSetAllByInstType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ConfigInstListData(marginMode=" + this.marginMode + ", instFamilyList=" + this.instFamilyList + ", instType=" + this.instType + ", isSetAllByInstType=" + this.isSetAllByInstType + ")";
    }

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.ConfigInstListData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ConfigInstListData> serializer() {
            return ConfigInstListData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ConfigInstListData(int i, String str, List list, String str2, boolean z, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i, 15, ConfigInstListData$$serializer.INSTANCE.getDescriptor());
        }
        this.marginMode = str;
        this.instFamilyList = list;
        this.instType = str2;
        this.isSetAllByInstType = z;
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(ConfigInstListData configInstListData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeStringElement(serialDescriptor, 0, configInstListData.marginMode);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, kSerializerArr[1], configInstListData.instFamilyList);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, configInstListData.instType);
        compositeEncoder.encodeBooleanElement(serialDescriptor, 3, configInstListData.isSetAllByInstType);
    }

    public ConfigInstListData(@NotNull String str, List<String> list, String str2, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        this.marginMode = str;
        this.instFamilyList = list;
        this.instType = str2;
        this.isSetAllByInstType = z;
    }
}
