package com.okinc.business.dex.trade.copytrading.home.data;

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
import kotlinx.serialization.internal.StringSerializer;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Serializable
public final class CTUpdateStatusRequest {
    private static final KSerializer<Object>[] $childSerializers;
    private final String accountId;
    private final List<String> strategyIds;
    private final int useStatus;
    private final List<String> walletAddressList;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.dex.trade.copytrading.home.data.CTUpdateStatusRequest */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CTUpdateStatusRequest copy$default(CTUpdateStatusRequest cTUpdateStatusRequest, String str, List list, int i, List list2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = cTUpdateStatusRequest.accountId;
        }
        if ((i2 & 2) != 0) {
            list = cTUpdateStatusRequest.strategyIds;
        }
        if ((i2 & 4) != 0) {
            i = cTUpdateStatusRequest.useStatus;
        }
        if ((i2 & 8) != 0) {
            list2 = cTUpdateStatusRequest.walletAddressList;
        }
        return cTUpdateStatusRequest.copy(str, list, i, list2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.accountId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component2() {
        return this.strategyIds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component3() {
        return this.useStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component4() {
        return this.walletAddressList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CTUpdateStatusRequest copy(@NotNull String str, @NotNull List<String> list, int i, @NotNull List<String> list2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        return new CTUpdateStatusRequest(str, list, i, list2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CTUpdateStatusRequest)) {
            return false;
        }
        CTUpdateStatusRequest cTUpdateStatusRequest = (CTUpdateStatusRequest) obj;
        return Intrinsics.EZpvd((Object) this.accountId, (Object) cTUpdateStatusRequest.accountId) && Intrinsics.EZpvd(this.strategyIds, cTUpdateStatusRequest.strategyIds) && this.useStatus == cTUpdateStatusRequest.useStatus && Intrinsics.EZpvd(this.walletAddressList, cTUpdateStatusRequest.walletAddressList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAccountId() {
        return this.accountId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getStrategyIds() {
        return this.strategyIds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getUseStatus() {
        return this.useStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getWalletAddressList() {
        return this.walletAddressList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.accountId.hashCode() * 31) + this.strategyIds.hashCode()) * 31) + Integer.hashCode(this.useStatus)) * 31) + this.walletAddressList.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CTUpdateStatusRequest(accountId=" + this.accountId + ", strategyIds=" + this.strategyIds + ", useStatus=" + this.useStatus + ", walletAddressList=" + this.walletAddressList + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dex.trade.copytrading.home.data.CTUpdateStatusRequest.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CTUpdateStatusRequest> serializer() {
            return CTUpdateStatusRequest$$serializer.INSTANCE;
        }
    }

    static {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        $childSerializers = new KSerializer[]{null, new ArrayListSerializer(stringSerializer), null, new ArrayListSerializer(stringSerializer)};
    }

    public /* synthetic */ CTUpdateStatusRequest(int i, String str, List list, int i2, List list2, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i, 7, CTUpdateStatusRequest$$serializer.INSTANCE.getDescriptor());
        }
        this.accountId = str;
        this.strategyIds = list;
        this.useStatus = i2;
        if ((i & 8) == 0) {
            this.walletAddressList = yDY.AhwBna();
        } else {
            this.walletAddressList = list2;
        }
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(CTUpdateStatusRequest cTUpdateStatusRequest, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeStringElement(serialDescriptor, 0, cTUpdateStatusRequest.accountId);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], cTUpdateStatusRequest.strategyIds);
        compositeEncoder.encodeIntElement(serialDescriptor, 2, cTUpdateStatusRequest.useStatus);
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && Intrinsics.EZpvd(cTUpdateStatusRequest.walletAddressList, yDY.AhwBna())) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 3, kSerializerArr[3], cTUpdateStatusRequest.walletAddressList);
    }

    public CTUpdateStatusRequest(@NotNull String str, @NotNull List<String> list, int i, @NotNull List<String> list2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        this.accountId = str;
        this.strategyIds = list;
        this.useStatus = i;
        this.walletAddressList = list2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0008: CONSTRUCTOR 
  (r1v0 java.lang.String)
  (r2v0 java.util.List)
  (r3v0 int)
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0004: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:267)) : (r4v0 java.util.List))
 A[MD:(java.lang.String, java.util.List<java.lang.String>, int, java.util.List<java.lang.String>):void (m)] (LINE:263) call: com.okinc.business.dex.trade.copytrading.home.data.CTUpdateStatusRequest.<init>(java.lang.String, java.util.List, int, java.util.List):void type: THIS */
    public /* synthetic */ CTUpdateStatusRequest(String str, List list, int i, List list2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, list, i, (i2 & 8) != 0 ? yDY.AhwBna() : list2);
    }
}
