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
public final class InstMarginModeConfigs {
    private final String afterSetAllMarginMode;
    private final ArrayList<InstList> instList;
    private final String instType;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, null, new ArrayListSerializer(InstList$$serializer.INSTANCE)};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.unify_trade.biz.InstMarginModeConfigs */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InstMarginModeConfigs copy$default(InstMarginModeConfigs instMarginModeConfigs, String str, String str2, ArrayList arrayList, int i, Object obj) {
        if ((i & 1) != 0) {
            str = instMarginModeConfigs.afterSetAllMarginMode;
        }
        if ((i & 2) != 0) {
            str2 = instMarginModeConfigs.instType;
        }
        if ((i & 4) != 0) {
            arrayList = instMarginModeConfigs.instList;
        }
        return instMarginModeConfigs.copy(str, str2, arrayList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.afterSetAllMarginMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.instType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<InstList> component3() {
        return this.instList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InstMarginModeConfigs copy(@NotNull String str, @NotNull String str2, @NotNull ArrayList<InstList> arrayList) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(arrayList, "");
        return new InstMarginModeConfigs(str, str2, arrayList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InstMarginModeConfigs)) {
            return false;
        }
        InstMarginModeConfigs instMarginModeConfigs = (InstMarginModeConfigs) obj;
        return Intrinsics.EZpvd((Object) this.afterSetAllMarginMode, (Object) instMarginModeConfigs.afterSetAllMarginMode) && Intrinsics.EZpvd((Object) this.instType, (Object) instMarginModeConfigs.instType) && Intrinsics.EZpvd(this.instList, instMarginModeConfigs.instList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAfterSetAllMarginMode() {
        return this.afterSetAllMarginMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<InstList> getInstList() {
        return this.instList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInstType() {
        return this.instType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.afterSetAllMarginMode.hashCode() * 31) + this.instType.hashCode()) * 31) + this.instList.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "InstMarginModeConfigs(afterSetAllMarginMode=" + this.afterSetAllMarginMode + ", instType=" + this.instType + ", instList=" + this.instList + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.InstMarginModeConfigs.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<InstMarginModeConfigs> serializer() {
            return InstMarginModeConfigs$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ InstMarginModeConfigs(int i, String str, String str2, ArrayList arrayList, SerializationConstructorMarker serializationConstructorMarker) {
        if (4 != (i & 4)) {
            PluginExceptionsKt.throwMissingFieldException(i, 4, InstMarginModeConfigs$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.afterSetAllMarginMode = "";
        } else {
            this.afterSetAllMarginMode = str;
        }
        if ((i & 2) == 0) {
            this.instType = "";
        } else {
            this.instType = str2;
        }
        this.instList = arrayList;
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(InstMarginModeConfigs instMarginModeConfigs, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) instMarginModeConfigs.afterSetAllMarginMode, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, instMarginModeConfigs.afterSetAllMarginMode);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) instMarginModeConfigs.instType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, instMarginModeConfigs.instType);
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], instMarginModeConfigs.instList);
    }

    public InstMarginModeConfigs(@NotNull String str, @NotNull String str2, @NotNull ArrayList<InstList> arrayList) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(arrayList, "");
        this.afterSetAllMarginMode = str;
        this.instType = str2;
        this.instList = arrayList;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000c: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
  (r4v0 java.util.ArrayList)
 A[MD:(java.lang.String, java.lang.String, java.util.ArrayList<com.okinc.unify_trade.biz.InstList>):void (m)] (LINE:267) call: com.okinc.unify_trade.biz.InstMarginModeConfigs.<init>(java.lang.String, java.lang.String, java.util.ArrayList):void type: THIS */
    public /* synthetic */ InstMarginModeConfigs(String str, String str2, ArrayList arrayList, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, arrayList);
    }
}
