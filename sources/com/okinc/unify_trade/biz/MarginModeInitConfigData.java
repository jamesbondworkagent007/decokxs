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
public final class MarginModeInitConfigData {
    private final String accountMode;
    private final ArrayList<InstListData> instList;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, new ArrayListSerializer(InstListData$$serializer.INSTANCE)};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.unify_trade.biz.MarginModeInitConfigData */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MarginModeInitConfigData copy$default(MarginModeInitConfigData marginModeInitConfigData, String str, ArrayList arrayList, int i, Object obj) {
        if ((i & 1) != 0) {
            str = marginModeInitConfigData.accountMode;
        }
        if ((i & 2) != 0) {
            arrayList = marginModeInitConfigData.instList;
        }
        return marginModeInitConfigData.copy(str, arrayList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.accountMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<InstListData> component2() {
        return this.instList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MarginModeInitConfigData copy(@NotNull String str, @NotNull ArrayList<InstListData> arrayList) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(arrayList, "");
        return new MarginModeInitConfigData(str, arrayList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarginModeInitConfigData)) {
            return false;
        }
        MarginModeInitConfigData marginModeInitConfigData = (MarginModeInitConfigData) obj;
        return Intrinsics.EZpvd((Object) this.accountMode, (Object) marginModeInitConfigData.accountMode) && Intrinsics.EZpvd(this.instList, marginModeInitConfigData.instList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAccountMode() {
        return this.accountMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<InstListData> getInstList() {
        return this.instList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.accountMode.hashCode() * 31) + this.instList.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "MarginModeInitConfigData(accountMode=" + this.accountMode + ", instList=" + this.instList + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.MarginModeInitConfigData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<MarginModeInitConfigData> serializer() {
            return MarginModeInitConfigData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ MarginModeInitConfigData(int i, String str, ArrayList arrayList, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, MarginModeInitConfigData$$serializer.INSTANCE.getDescriptor());
        }
        this.accountMode = str;
        this.instList = arrayList;
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(MarginModeInitConfigData marginModeInitConfigData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeStringElement(serialDescriptor, 0, marginModeInitConfigData.accountMode);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], marginModeInitConfigData.instList);
    }

    public MarginModeInitConfigData(@NotNull String str, @NotNull ArrayList<InstListData> arrayList) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(arrayList, "");
        this.accountMode = str;
        this.instList = arrayList;
    }
}
