package com.okinc.assets.backend.api.model;

import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class GetDepositSupportResponse {
    private ArrayList<AddressList> addressList;
    private Integer currencyId;
    private String depositLimit;
    private Boolean support;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, new ArrayListSerializer(AddressList$$serializer.INSTANCE)};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.assets.backend.api.model.GetDepositSupportResponse */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GetDepositSupportResponse copy$default(GetDepositSupportResponse getDepositSupportResponse, Integer num, String str, Boolean bool, ArrayList arrayList, int i, Object obj) {
        if ((i & 1) != 0) {
            num = getDepositSupportResponse.currencyId;
        }
        if ((i & 2) != 0) {
            str = getDepositSupportResponse.depositLimit;
        }
        if ((i & 4) != 0) {
            bool = getDepositSupportResponse.support;
        }
        if ((i & 8) != 0) {
            arrayList = getDepositSupportResponse.addressList;
        }
        return getDepositSupportResponse.copy(num, str, bool, arrayList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component1() {
        return this.currencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.depositLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component3() {
        return this.support;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<AddressList> component4() {
        return this.addressList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GetDepositSupportResponse copy(Integer num, String str, Boolean bool, ArrayList<AddressList> arrayList) {
        return new GetDepositSupportResponse(num, str, bool, arrayList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetDepositSupportResponse)) {
            return false;
        }
        GetDepositSupportResponse getDepositSupportResponse = (GetDepositSupportResponse) obj;
        return Intrinsics.EZpvd(this.currencyId, getDepositSupportResponse.currencyId) && Intrinsics.EZpvd((Object) this.depositLimit, (Object) getDepositSupportResponse.depositLimit) && Intrinsics.EZpvd(this.support, getDepositSupportResponse.support) && Intrinsics.EZpvd(this.addressList, getDepositSupportResponse.addressList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<AddressList> getAddressList() {
        return this.addressList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getCurrencyId() {
        return this.currencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDepositLimit() {
        return this.depositLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getSupport() {
        return this.support;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Integer num = this.currencyId;
        int iHashCode = num == null ? 0 : num.hashCode();
        String str = this.depositLimit;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        Boolean bool = this.support;
        int iHashCode3 = bool == null ? 0 : bool.hashCode();
        ArrayList<AddressList> arrayList = this.addressList;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (arrayList != null ? arrayList.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAddressList(ArrayList<AddressList> arrayList) {
        this.addressList = arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCurrencyId(Integer num) {
        this.currencyId = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDepositLimit(String str) {
        this.depositLimit = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSupport(Boolean bool) {
        this.support = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "GetDepositSupportResponse(currencyId=" + this.currencyId + ", depositLimit=" + this.depositLimit + ", support=" + this.support + ", addressList=" + this.addressList + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.assets.backend.api.model.GetDepositSupportResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<GetDepositSupportResponse> serializer() {
            return GetDepositSupportResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ GetDepositSupportResponse(int i, Integer num, String str, Boolean bool, ArrayList arrayList, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i, 15, GetDepositSupportResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.currencyId = num;
        this.depositLimit = str;
        this.support = bool;
        this.addressList = arrayList;
    }

    public static final /* synthetic */ void write$Self$OKAssets_assets_pro_api(GetDepositSupportResponse getDepositSupportResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, IntSerializer.INSTANCE, getDepositSupportResponse.currencyId);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, getDepositSupportResponse.depositLimit);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, BooleanSerializer.INSTANCE, getDepositSupportResponse.support);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, kSerializerArr[3], getDepositSupportResponse.addressList);
    }

    public GetDepositSupportResponse(Integer num, String str, Boolean bool, ArrayList<AddressList> arrayList) {
        this.currencyId = num;
        this.depositLimit = str;
        this.support = bool;
        this.addressList = arrayList;
    }
}
