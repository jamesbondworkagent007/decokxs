package com.okinc.business.dex.trade.copytrading.home.data;

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
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Serializable
public final class CTStrategiesRequest {
    private static final KSerializer<Object>[] $childSerializers;
    private final String accountId;
    private final List<String> chainIdList;
    private final String cursor;
    private final int limit;
    private final int queryStatus;
    private final List<String> walletAddressList;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: com.okinc.business.dex.trade.copytrading.home.data.CTStrategiesRequest */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CTStrategiesRequest copy$default(CTStrategiesRequest cTStrategiesRequest, String str, List list, int i, String str2, int i2, List list2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = cTStrategiesRequest.accountId;
        }
        if ((i3 & 2) != 0) {
            list = cTStrategiesRequest.walletAddressList;
        }
        List list3 = list;
        if ((i3 & 4) != 0) {
            i = cTStrategiesRequest.queryStatus;
        }
        int i4 = i;
        if ((i3 & 8) != 0) {
            str2 = cTStrategiesRequest.cursor;
        }
        String str3 = str2;
        if ((i3 & 16) != 0) {
            i2 = cTStrategiesRequest.limit;
        }
        int i5 = i2;
        if ((i3 & 32) != 0) {
            list2 = cTStrategiesRequest.chainIdList;
        }
        return cTStrategiesRequest.copy(str, list3, i4, str3, i5, list2);
    }

    @SerialName("accountId")
    public static /* synthetic */ void getAccountId$annotations() {
    }

    @SerialName("chainIdList")
    public static /* synthetic */ void getChainIdList$annotations() {
    }

    @SerialName("cursor")
    public static /* synthetic */ void getCursor$annotations() {
    }

    @SerialName("limit")
    public static /* synthetic */ void getLimit$annotations() {
    }

    @SerialName("queryStatus")
    public static /* synthetic */ void getQueryStatus$annotations() {
    }

    @SerialName("walletAddressList")
    public static /* synthetic */ void getWalletAddressList$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.accountId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component2() {
        return this.walletAddressList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component3() {
        return this.queryStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.cursor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component5() {
        return this.limit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component6() {
        return this.chainIdList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CTStrategiesRequest copy(@NotNull String str, @NotNull List<String> list, int i, @NotNull String str2, int i2, @NotNull List<String> list2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list2, "");
        return new CTStrategiesRequest(str, list, i, str2, i2, list2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CTStrategiesRequest)) {
            return false;
        }
        CTStrategiesRequest cTStrategiesRequest = (CTStrategiesRequest) obj;
        return Intrinsics.EZpvd((Object) this.accountId, (Object) cTStrategiesRequest.accountId) && Intrinsics.EZpvd(this.walletAddressList, cTStrategiesRequest.walletAddressList) && this.queryStatus == cTStrategiesRequest.queryStatus && Intrinsics.EZpvd((Object) this.cursor, (Object) cTStrategiesRequest.cursor) && this.limit == cTStrategiesRequest.limit && Intrinsics.EZpvd(this.chainIdList, cTStrategiesRequest.chainIdList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAccountId() {
        return this.accountId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getChainIdList() {
        return this.chainIdList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCursor() {
        return this.cursor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getLimit() {
        return this.limit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getQueryStatus() {
        return this.queryStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getWalletAddressList() {
        return this.walletAddressList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((this.accountId.hashCode() * 31) + this.walletAddressList.hashCode()) * 31) + Integer.hashCode(this.queryStatus)) * 31) + this.cursor.hashCode()) * 31) + Integer.hashCode(this.limit)) * 31) + this.chainIdList.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CTStrategiesRequest(accountId=" + this.accountId + ", walletAddressList=" + this.walletAddressList + ", queryStatus=" + this.queryStatus + ", cursor=" + this.cursor + ", limit=" + this.limit + ", chainIdList=" + this.chainIdList + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dex.trade.copytrading.home.data.CTStrategiesRequest.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CTStrategiesRequest> serializer() {
            return CTStrategiesRequest$$serializer.INSTANCE;
        }
    }

    static {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        $childSerializers = new KSerializer[]{null, new ArrayListSerializer(stringSerializer), null, null, null, new ArrayListSerializer(stringSerializer)};
    }

    public /* synthetic */ CTStrategiesRequest(int i, String str, List list, int i2, String str2, int i3, List list2, SerializationConstructorMarker serializationConstructorMarker) {
        if (63 != (i & 63)) {
            PluginExceptionsKt.throwMissingFieldException(i, 63, CTStrategiesRequest$$serializer.INSTANCE.getDescriptor());
        }
        this.accountId = str;
        this.walletAddressList = list;
        this.queryStatus = i2;
        this.cursor = str2;
        this.limit = i3;
        this.chainIdList = list2;
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(CTStrategiesRequest cTStrategiesRequest, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeStringElement(serialDescriptor, 0, cTStrategiesRequest.accountId);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], cTStrategiesRequest.walletAddressList);
        compositeEncoder.encodeIntElement(serialDescriptor, 2, cTStrategiesRequest.queryStatus);
        compositeEncoder.encodeStringElement(serialDescriptor, 3, cTStrategiesRequest.cursor);
        compositeEncoder.encodeIntElement(serialDescriptor, 4, cTStrategiesRequest.limit);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 5, kSerializerArr[5], cTStrategiesRequest.chainIdList);
    }

    public CTStrategiesRequest(@NotNull String str, @NotNull List<String> list, int i, @NotNull String str2, int i2, @NotNull List<String> list2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list2, "");
        this.accountId = str;
        this.walletAddressList = list;
        this.queryStatus = i;
        this.cursor = str2;
        this.limit = i2;
        this.chainIdList = list2;
    }
}
