package com.okinc.assets.backend.api.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class AddressList {
    private Integer addrType;
    private String address;
    private Boolean hasExAddress;
    private Long id;
    public Boolean isIsolation;
    private String memo;
    private String tag;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ AddressList copy$default(AddressList addressList, String str, Boolean bool, Long l, Boolean bool2, String str2, String str3, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            str = addressList.address;
        }
        if ((i & 2) != 0) {
            bool = addressList.hasExAddress;
        }
        Boolean bool3 = bool;
        if ((i & 4) != 0) {
            l = addressList.id;
        }
        Long l2 = l;
        if ((i & 8) != 0) {
            bool2 = addressList.isIsolation;
        }
        Boolean bool4 = bool2;
        if ((i & 16) != 0) {
            str2 = addressList.memo;
        }
        String str4 = str2;
        if ((i & 32) != 0) {
            str3 = addressList.tag;
        }
        String str5 = str3;
        if ((i & 64) != 0) {
            num = addressList.addrType;
        }
        return addressList.copy(str, bool3, l2, bool4, str4, str5, num);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component2() {
        return this.hasExAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component3() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component4() {
        return this.isIsolation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.memo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.tag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component7() {
        return this.addrType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AddressList copy(String str, Boolean bool, Long l, Boolean bool2, String str2, String str3, Integer num) {
        return new AddressList(str, bool, l, bool2, str2, str3, num);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AddressList)) {
            return false;
        }
        AddressList addressList = (AddressList) obj;
        return Intrinsics.EZpvd((Object) this.address, (Object) addressList.address) && Intrinsics.EZpvd(this.hasExAddress, addressList.hasExAddress) && Intrinsics.EZpvd(this.id, addressList.id) && Intrinsics.EZpvd(this.isIsolation, addressList.isIsolation) && Intrinsics.EZpvd((Object) this.memo, (Object) addressList.memo) && Intrinsics.EZpvd((Object) this.tag, (Object) addressList.tag) && Intrinsics.EZpvd(this.addrType, addressList.addrType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getAddrType() {
        return this.addrType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAddress() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getHasExAddress() {
        return this.hasExAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getId() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMemo() {
        return this.memo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTag() {
        return this.tag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.address;
        int iHashCode = str == null ? 0 : str.hashCode();
        Boolean bool = this.hasExAddress;
        int iHashCode2 = bool == null ? 0 : bool.hashCode();
        Long l = this.id;
        int iHashCode3 = l == null ? 0 : l.hashCode();
        Boolean bool2 = this.isIsolation;
        int iHashCode4 = bool2 == null ? 0 : bool2.hashCode();
        String str2 = this.memo;
        int iHashCode5 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.tag;
        int iHashCode6 = str3 == null ? 0 : str3.hashCode();
        Integer num = this.addrType;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (num != null ? num.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAddrType(Integer num) {
        this.addrType = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAddress(String str) {
        this.address = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setHasExAddress(Boolean bool) {
        this.hasExAddress = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setId(Long l) {
        this.id = l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMemo(String str) {
        this.memo = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTag(String str) {
        this.tag = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AddressList(address=" + this.address + ", hasExAddress=" + this.hasExAddress + ", id=" + this.id + ", isIsolation=" + this.isIsolation + ", memo=" + this.memo + ", tag=" + this.tag + ", addrType=" + this.addrType + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.assets.backend.api.model.AddressList.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<AddressList> serializer() {
            return AddressList$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ AddressList(int i, String str, Boolean bool, Long l, Boolean bool2, String str2, String str3, Integer num, SerializationConstructorMarker serializationConstructorMarker) {
        if (127 != (i & 127)) {
            PluginExceptionsKt.throwMissingFieldException(i, 127, AddressList$$serializer.INSTANCE.getDescriptor());
        }
        this.address = str;
        this.hasExAddress = bool;
        this.id = l;
        this.isIsolation = bool2;
        this.memo = str2;
        this.tag = str3;
        this.addrType = num;
    }

    public static final /* synthetic */ void write$Self$OKAssets_assets_pro_api(AddressList addressList, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, addressList.address);
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, booleanSerializer, addressList.hasExAddress);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, LongSerializer.INSTANCE, addressList.id);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, booleanSerializer, addressList.isIsolation);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, stringSerializer, addressList.memo);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, stringSerializer, addressList.tag);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, IntSerializer.INSTANCE, addressList.addrType);
    }

    public AddressList(String str, Boolean bool, Long l, Boolean bool2, String str2, String str3, Integer num) {
        this.address = str;
        this.hasExAddress = bool;
        this.id = l;
        this.isIsolation = bool2;
        this.memo = str2;
        this.tag = str3;
        this.addrType = num;
    }
}
