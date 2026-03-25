package com.okinc.business.defi.biz.net.bean;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.business.defi.api.model.tx.signdata.EVMAuthorization;
import com.okinc.business.defi.api.model.tx.signdata.EVMAuthorization$$serializer;
import com.okinc.business.defi.api.model.tx.signdata.EVMStateOverride;
import com.okinc.business.defi.api.model.tx.signdata.EVMStateOverride$$serializer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class GasLimitReq implements Parcelable {
    private String address;
    private List<EVMAuthorization> authorizationList;
    private Long coinId;
    private String inputData;
    private final List<EVMStateOverride> stateOverrideList;
    private String tokenAddress;
    private String userAddress;
    private String value;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<GasLimitReq> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, new ArrayListSerializer(EVMAuthorization$$serializer.INSTANCE), null, new ArrayListSerializer(EVMStateOverride$$serializer.INSTANCE)};

    public static final class Creator implements Parcelable.Creator<GasLimitReq> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GasLimitReq createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            String string4 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(parcel.readParcelable(GasLimitReq.class.getClassLoader()));
                }
            }
            String string5 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i3 = parcel.readInt();
                arrayList2 = new ArrayList(i3);
                for (int i4 = 0; i4 != i3; i4++) {
                    arrayList2.add(parcel.readParcelable(GasLimitReq.class.getClassLoader()));
                }
            }
            return new GasLimitReq(string, string2, string3, lValueOf, string4, arrayList, string5, arrayList2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GasLimitReq[] newArray(int i) {
            return new GasLimitReq[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.inputData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.tokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component4() {
        return this.coinId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<EVMAuthorization> component6() {
        return this.authorizationList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.userAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<EVMStateOverride> component8() {
        return this.stateOverrideList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GasLimitReq copy(String str, String str2, @NotNull String str3, Long l, String str4, List<EVMAuthorization> list, String str5, List<EVMStateOverride> list2) {
        Intrinsics.checkNotNullParameter(str3, "");
        return new GasLimitReq(str, str2, str3, l, str4, list, str5, list2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GasLimitReq)) {
            return false;
        }
        GasLimitReq gasLimitReq = (GasLimitReq) obj;
        return Intrinsics.EZpvd((Object) this.address, (Object) gasLimitReq.address) && Intrinsics.EZpvd((Object) this.inputData, (Object) gasLimitReq.inputData) && Intrinsics.EZpvd((Object) this.tokenAddress, (Object) gasLimitReq.tokenAddress) && Intrinsics.EZpvd(this.coinId, gasLimitReq.coinId) && Intrinsics.EZpvd((Object) this.value, (Object) gasLimitReq.value) && Intrinsics.EZpvd(this.authorizationList, gasLimitReq.authorizationList) && Intrinsics.EZpvd((Object) this.userAddress, (Object) gasLimitReq.userAddress) && Intrinsics.EZpvd(this.stateOverrideList, gasLimitReq.stateOverrideList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAddress() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<EVMAuthorization> getAuthorizationList() {
        return this.authorizationList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getCoinId() {
        return this.coinId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInputData() {
        return this.inputData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<EVMStateOverride> getStateOverrideList() {
        return this.stateOverrideList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenAddress() {
        return this.tokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUserAddress() {
        return this.userAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getValue() {
        return this.value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.address;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.inputData;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        int iHashCode3 = this.tokenAddress.hashCode();
        Long l = this.coinId;
        int iHashCode4 = l == null ? 0 : l.hashCode();
        String str3 = this.value;
        int iHashCode5 = str3 == null ? 0 : str3.hashCode();
        List<EVMAuthorization> list = this.authorizationList;
        int iHashCode6 = list == null ? 0 : list.hashCode();
        String str4 = this.userAddress;
        int iHashCode7 = str4 == null ? 0 : str4.hashCode();
        List<EVMStateOverride> list2 = this.stateOverrideList;
        return (((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + (list2 != null ? list2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAddress(String str) {
        this.address = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAuthorizationList(List<EVMAuthorization> list) {
        this.authorizationList = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCoinId(Long l) {
        this.coinId = l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInputData(String str) {
        this.inputData = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTokenAddress(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.tokenAddress = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUserAddress(String str) {
        this.userAddress = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setValue(String str) {
        this.value = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "GasLimitReq(address=" + this.address + ", inputData=" + this.inputData + ", tokenAddress=" + this.tokenAddress + ", coinId=" + this.coinId + ", value=" + this.value + ", authorizationList=" + this.authorizationList + ", userAddress=" + this.userAddress + ", stateOverrideList=" + this.stateOverrideList + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.address);
        parcel.writeString(this.inputData);
        parcel.writeString(this.tokenAddress);
        Long l = this.coinId;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        parcel.writeString(this.value);
        List<EVMAuthorization> list = this.authorizationList;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<EVMAuthorization> it = list.iterator();
            while (it.hasNext()) {
                parcel.writeParcelable(it.next(), i);
            }
        }
        parcel.writeString(this.userAddress);
        List<EVMStateOverride> list2 = this.stateOverrideList;
        if (list2 == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(list2.size());
        Iterator<EVMStateOverride> it2 = list2.iterator();
        while (it2.hasNext()) {
            parcel.writeParcelable(it2.next(), i);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.net.bean.GasLimitReq.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<GasLimitReq> serializer() {
            return GasLimitReq$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ GasLimitReq(int i, String str, String str2, String str3, Long l, String str4, List list, String str5, List list2, SerializationConstructorMarker serializationConstructorMarker) {
        if (5 != (i & 5)) {
            PluginExceptionsKt.throwMissingFieldException(i, 5, GasLimitReq$$serializer.INSTANCE.getDescriptor());
        }
        this.address = str;
        if ((i & 2) == 0) {
            this.inputData = null;
        } else {
            this.inputData = str2;
        }
        this.tokenAddress = str3;
        if ((i & 8) == 0) {
            this.coinId = null;
        } else {
            this.coinId = l;
        }
        if ((i & 16) == 0) {
            this.value = null;
        } else {
            this.value = str4;
        }
        if ((i & 32) == 0) {
            this.authorizationList = null;
        } else {
            this.authorizationList = list;
        }
        if ((i & 64) == 0) {
            this.userAddress = null;
        } else {
            this.userAddress = str5;
        }
        if ((i & 128) == 0) {
            this.stateOverrideList = null;
        } else {
            this.stateOverrideList = list2;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(GasLimitReq gasLimitReq, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, gasLimitReq.address);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || gasLimitReq.inputData != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, gasLimitReq.inputData);
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 2, gasLimitReq.tokenAddress);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || gasLimitReq.coinId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, LongSerializer.INSTANCE, gasLimitReq.coinId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || gasLimitReq.value != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, stringSerializer, gasLimitReq.value);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || gasLimitReq.authorizationList != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, kSerializerArr[5], gasLimitReq.authorizationList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || gasLimitReq.userAddress != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, stringSerializer, gasLimitReq.userAddress);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) && gasLimitReq.stateOverrideList == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, kSerializerArr[7], gasLimitReq.stateOverrideList);
    }

    public GasLimitReq(String str, String str2, @NotNull String str3, Long l, String str4, List<EVMAuthorization> list, String str5, List<EVMStateOverride> list2) {
        Intrinsics.checkNotNullParameter(str3, "");
        this.address = str;
        this.inputData = str2;
        this.tokenAddress = str3;
        this.coinId = l;
        this.value = str4;
        this.authorizationList = list;
        this.userAddress = str5;
        this.stateOverrideList = list2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0035: CONSTRUCTOR 
  (r13v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r21v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r14v0 java.lang.String))
  (r15v0 java.lang.String)
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x000a: ARITH (r21v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r16v0 java.lang.Long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0012: ARITH (r21v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r17v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x001a: ARITH (r21v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r18v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0022: ARITH (r21v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r19v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x002a: ARITH (r21v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r20v0 java.util.List))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.Long, java.lang.String, java.util.List<com.okinc.business.defi.api.model.tx.signdata.EVMAuthorization>, java.lang.String, java.util.List<com.okinc.business.defi.api.model.tx.signdata.EVMStateOverride>):void (m)] (LINE:383) call: com.okinc.business.defi.biz.net.bean.GasLimitReq.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.Long, java.lang.String, java.util.List, java.lang.String, java.util.List):void type: THIS */
    public /* synthetic */ GasLimitReq(String str, String str2, String str3, Long l, String str4, List list, String str5, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, str3, (i & 8) != 0 ? null : l, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : list, (i & 64) != 0 ? null : str5, (i & 128) != 0 ? null : list2);
    }
}
