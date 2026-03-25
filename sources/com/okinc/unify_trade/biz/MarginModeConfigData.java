package com.okinc.unify_trade.biz;

import java.util.List;
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

/* JADX INFO: loaded from: classes17.dex */
@Serializable
public final class MarginModeConfigData {
    private final String accountMode;
    private final List<ConfigInstListData> instList;
    private final String type;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, null, new ArrayListSerializer(ConfigInstListData$$serializer.INSTANCE)};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.unify_trade.biz.MarginModeConfigData */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MarginModeConfigData copy$default(MarginModeConfigData marginModeConfigData, String str, String str2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = marginModeConfigData.type;
        }
        if ((i & 2) != 0) {
            str2 = marginModeConfigData.accountMode;
        }
        if ((i & 4) != 0) {
            list = marginModeConfigData.instList;
        }
        return marginModeConfigData.copy(str, str2, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.accountMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<ConfigInstListData> component3() {
        return this.instList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MarginModeConfigData copy(@NotNull String str, @NotNull String str2, @NotNull List<ConfigInstListData> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new MarginModeConfigData(str, str2, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarginModeConfigData)) {
            return false;
        }
        MarginModeConfigData marginModeConfigData = (MarginModeConfigData) obj;
        return Intrinsics.EZpvd((Object) this.type, (Object) marginModeConfigData.type) && Intrinsics.EZpvd((Object) this.accountMode, (Object) marginModeConfigData.accountMode) && Intrinsics.EZpvd(this.instList, marginModeConfigData.instList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAccountMode() {
        return this.accountMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<ConfigInstListData> getInstList() {
        return this.instList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getType() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.type.hashCode() * 31) + this.accountMode.hashCode()) * 31) + this.instList.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "MarginModeConfigData(type=" + this.type + ", accountMode=" + this.accountMode + ", instList=" + this.instList + ")";
    }

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.MarginModeConfigData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<MarginModeConfigData> serializer() {
            return MarginModeConfigData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ MarginModeConfigData(int i, String str, String str2, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (4 != (i & 4)) {
            PluginExceptionsKt.throwMissingFieldException(i, 4, MarginModeConfigData$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.type = "";
        } else {
            this.type = str;
        }
        if ((i & 2) == 0) {
            this.accountMode = "";
        } else {
            this.accountMode = str2;
        }
        this.instList = list;
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(MarginModeConfigData marginModeConfigData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) marginModeConfigData.type, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, marginModeConfigData.type);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) marginModeConfigData.accountMode, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, marginModeConfigData.accountMode);
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], marginModeConfigData.instList);
    }

    public MarginModeConfigData(@NotNull String str, @NotNull String str2, @NotNull List<ConfigInstListData> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.type = str;
        this.accountMode = str2;
        this.instList = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000c: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
  (r4v0 java.util.List)
 A[MD:(java.lang.String, java.lang.String, java.util.List<com.okinc.unify_trade.biz.ConfigInstListData>):void (m)] (LINE:4261) call: com.okinc.unify_trade.biz.MarginModeConfigData.<init>(java.lang.String, java.lang.String, java.util.List):void type: THIS */
    public /* synthetic */ MarginModeConfigData(String str, String str2, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, list);
    }
}
