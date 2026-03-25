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
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Serializable
public final class InstListData {
    private final String initMarginMode;
    private final ArrayList<String> instFamilyList;
    private final String instType;
    private final String marginMode;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(StringSerializer.INSTANCE), null, null, null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.unify_trade.biz.InstListData */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InstListData copy$default(InstListData instListData, ArrayList arrayList, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            arrayList = instListData.instFamilyList;
        }
        if ((i & 2) != 0) {
            str = instListData.marginMode;
        }
        if ((i & 4) != 0) {
            str2 = instListData.instType;
        }
        if ((i & 8) != 0) {
            str3 = instListData.initMarginMode;
        }
        return instListData.copy(arrayList, str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<String> component1() {
        return this.instFamilyList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.marginMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.instType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.initMarginMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InstListData copy(@NotNull ArrayList<String> arrayList, @NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new InstListData(arrayList, str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InstListData)) {
            return false;
        }
        InstListData instListData = (InstListData) obj;
        return Intrinsics.EZpvd(this.instFamilyList, instListData.instFamilyList) && Intrinsics.EZpvd((Object) this.marginMode, (Object) instListData.marginMode) && Intrinsics.EZpvd((Object) this.instType, (Object) instListData.instType) && Intrinsics.EZpvd((Object) this.initMarginMode, (Object) instListData.initMarginMode);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInitMarginMode() {
        return this.initMarginMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<String> getInstFamilyList() {
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
        return (((((this.instFamilyList.hashCode() * 31) + this.marginMode.hashCode()) * 31) + this.instType.hashCode()) * 31) + this.initMarginMode.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "InstListData(instFamilyList=" + this.instFamilyList + ", marginMode=" + this.marginMode + ", instType=" + this.instType + ", initMarginMode=" + this.initMarginMode + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.InstListData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<InstListData> serializer() {
            return InstListData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ InstListData(int i, ArrayList arrayList, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i, 15, InstListData$$serializer.INSTANCE.getDescriptor());
        }
        this.instFamilyList = arrayList;
        this.marginMode = str;
        this.instType = str2;
        this.initMarginMode = str3;
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(InstListData instListData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeSerializableElement(serialDescriptor, 0, $childSerializers[0], instListData.instFamilyList);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, instListData.marginMode);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, instListData.instType);
        compositeEncoder.encodeStringElement(serialDescriptor, 3, instListData.initMarginMode);
    }

    public InstListData(@NotNull ArrayList<String> arrayList, @NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.instFamilyList = arrayList;
        this.marginMode = str;
        this.instType = str2;
        this.initMarginMode = str3;
    }
}
