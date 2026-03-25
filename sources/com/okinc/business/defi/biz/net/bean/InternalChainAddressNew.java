package com.okinc.business.defi.biz.net.bean;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
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
public final class InternalChainAddressNew implements Parcelable {
    private String address;
    private int addressType;
    private String baseChainSign;
    private Long baseSignChainIndex;
    private ArrayList<Long> chainIndexList;
    private String chainPubKey;
    private String chainSign;
    private String eoaAddress;
    private int isDefault;
    private String proxyAddres;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<InternalChainAddressNew> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, null, null, null, new ArrayListSerializer(LongSerializer.INSTANCE)};

    public static final class Creator implements Parcelable.Creator<InternalChainAddressNew> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InternalChainAddressNew createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            int i = parcel.readInt();
            int i2 = parcel.readInt();
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            int i3 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i3);
            for (int i4 = 0; i4 != i3; i4++) {
                arrayList.add(Long.valueOf(parcel.readLong()));
            }
            return new InternalChainAddressNew(string, string2, string3, i, i2, lValueOf, string4, string5, string6, arrayList);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InternalChainAddressNew[] newArray(int i) {
            return new InternalChainAddressNew[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<Long> component10() {
        return this.chainIndexList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.eoaAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.proxyAddres;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component4() {
        return this.addressType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component5() {
        return this.isDefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component6() {
        return this.baseSignChainIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.baseChainSign;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.chainPubKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.chainSign;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InternalChainAddressNew copy(@NotNull String str, @NotNull String str2, @NotNull String str3, int i, int i2, Long l, String str4, @NotNull String str5, @NotNull String str6, @NotNull ArrayList<Long> arrayList) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(arrayList, "");
        return new InternalChainAddressNew(str, str2, str3, i, i2, l, str4, str5, str6, arrayList);
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
        if (!(obj instanceof InternalChainAddressNew)) {
            return false;
        }
        InternalChainAddressNew internalChainAddressNew = (InternalChainAddressNew) obj;
        return Intrinsics.EZpvd((Object) this.address, (Object) internalChainAddressNew.address) && Intrinsics.EZpvd((Object) this.eoaAddress, (Object) internalChainAddressNew.eoaAddress) && Intrinsics.EZpvd((Object) this.proxyAddres, (Object) internalChainAddressNew.proxyAddres) && this.addressType == internalChainAddressNew.addressType && this.isDefault == internalChainAddressNew.isDefault && Intrinsics.EZpvd(this.baseSignChainIndex, internalChainAddressNew.baseSignChainIndex) && Intrinsics.EZpvd((Object) this.baseChainSign, (Object) internalChainAddressNew.baseChainSign) && Intrinsics.EZpvd((Object) this.chainPubKey, (Object) internalChainAddressNew.chainPubKey) && Intrinsics.EZpvd((Object) this.chainSign, (Object) internalChainAddressNew.chainSign) && Intrinsics.EZpvd(this.chainIndexList, internalChainAddressNew.chainIndexList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAddress() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getAddressType() {
        return this.addressType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBaseChainSign() {
        return this.baseChainSign;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getBaseSignChainIndex() {
        return this.baseSignChainIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<Long> getChainIndexList() {
        return this.chainIndexList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainPubKey() {
        return this.chainPubKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainSign() {
        return this.chainSign;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEoaAddress() {
        return this.eoaAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getProxyAddres() {
        return this.proxyAddres;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.address.hashCode();
        int iHashCode2 = this.eoaAddress.hashCode();
        int iHashCode3 = this.proxyAddres.hashCode();
        int iHashCode4 = Integer.hashCode(this.addressType);
        int iHashCode5 = Integer.hashCode(this.isDefault);
        Long l = this.baseSignChainIndex;
        int iHashCode6 = l == null ? 0 : l.hashCode();
        String str = this.baseChainSign;
        return (((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (str != null ? str.hashCode() : 0)) * 31) + this.chainPubKey.hashCode()) * 31) + this.chainSign.hashCode()) * 31) + this.chainIndexList.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int isDefault() {
        return this.isDefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAddress(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.address = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAddressType(int i) {
        this.addressType = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBaseChainSign(String str) {
        this.baseChainSign = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBaseSignChainIndex(Long l) {
        this.baseSignChainIndex = l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setChainIndexList(@NotNull ArrayList<Long> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        this.chainIndexList = arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setChainPubKey(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.chainPubKey = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setChainSign(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.chainSign = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDefault(int i) {
        this.isDefault = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEoaAddress(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.eoaAddress = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setProxyAddres(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.proxyAddres = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "InternalChainAddressNew(address=" + this.address + ", eoaAddress=" + this.eoaAddress + ", proxyAddres=" + this.proxyAddres + ", addressType=" + this.addressType + ", isDefault=" + this.isDefault + ", baseSignChainIndex=" + this.baseSignChainIndex + ", baseChainSign=" + this.baseChainSign + ", chainPubKey=" + this.chainPubKey + ", chainSign=" + this.chainSign + ", chainIndexList=" + this.chainIndexList + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.address);
        parcel.writeString(this.eoaAddress);
        parcel.writeString(this.proxyAddres);
        parcel.writeInt(this.addressType);
        parcel.writeInt(this.isDefault);
        Long l = this.baseSignChainIndex;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        parcel.writeString(this.baseChainSign);
        parcel.writeString(this.chainPubKey);
        parcel.writeString(this.chainSign);
        ArrayList<Long> arrayList = this.chainIndexList;
        parcel.writeInt(arrayList.size());
        Iterator<Long> it = arrayList.iterator();
        while (it.hasNext()) {
            parcel.writeLong(it.next().longValue());
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.net.bean.InternalChainAddressNew.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<InternalChainAddressNew> serializer() {
            return InternalChainAddressNew$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ InternalChainAddressNew(int i, String str, String str2, String str3, int i2, int i3, Long l, String str4, String str5, String str6, ArrayList arrayList, SerializationConstructorMarker serializationConstructorMarker) {
        if (536 != (i & 536)) {
            PluginExceptionsKt.throwMissingFieldException(i, 536, InternalChainAddressNew$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.address = "";
        } else {
            this.address = str;
        }
        if ((i & 2) == 0) {
            this.eoaAddress = "";
        } else {
            this.eoaAddress = str2;
        }
        if ((i & 4) == 0) {
            this.proxyAddres = "";
        } else {
            this.proxyAddres = str3;
        }
        this.addressType = i2;
        this.isDefault = i3;
        if ((i & 32) == 0) {
            this.baseSignChainIndex = null;
        } else {
            this.baseSignChainIndex = l;
        }
        if ((i & 64) == 0) {
            this.baseChainSign = null;
        } else {
            this.baseChainSign = str4;
        }
        if ((i & 128) == 0) {
            this.chainPubKey = "";
        } else {
            this.chainPubKey = str5;
        }
        if ((i & 256) == 0) {
            this.chainSign = "";
        } else {
            this.chainSign = str6;
        }
        this.chainIndexList = arrayList;
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(InternalChainAddressNew internalChainAddressNew, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) internalChainAddressNew.address, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, internalChainAddressNew.address);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) internalChainAddressNew.eoaAddress, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, internalChainAddressNew.eoaAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) internalChainAddressNew.proxyAddres, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, internalChainAddressNew.proxyAddres);
        }
        compositeEncoder.encodeIntElement(serialDescriptor, 3, internalChainAddressNew.addressType);
        compositeEncoder.encodeIntElement(serialDescriptor, 4, internalChainAddressNew.isDefault);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || internalChainAddressNew.baseSignChainIndex != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, LongSerializer.INSTANCE, internalChainAddressNew.baseSignChainIndex);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || internalChainAddressNew.baseChainSign != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, internalChainAddressNew.baseChainSign);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) internalChainAddressNew.chainPubKey, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, internalChainAddressNew.chainPubKey);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) internalChainAddressNew.chainSign, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, internalChainAddressNew.chainSign);
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 9, kSerializerArr[9], internalChainAddressNew.chainIndexList);
    }

    public InternalChainAddressNew(@NotNull String str, @NotNull String str2, @NotNull String str3, int i, int i2, Long l, String str4, @NotNull String str5, @NotNull String str6, @NotNull ArrayList<Long> arrayList) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(arrayList, "");
        this.address = str;
        this.eoaAddress = str2;
        this.proxyAddres = str3;
        this.addressType = i;
        this.isDefault = i2;
        this.baseSignChainIndex = l;
        this.baseChainSign = str4;
        this.chainPubKey = str5;
        this.chainSign = str6;
        this.chainIndexList = arrayList;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0043: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r25v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r25v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0013: ARITH (r25v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
  (r18v0 int)
  (r19v0 int)
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x001b: ARITH (r25v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r20v0 java.lang.Long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r25v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002c: ARITH (r25v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r22v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0034: ARITH (r25v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r23v0 java.lang.String))
  (r24v0 java.util.ArrayList)
 A[MD:(java.lang.String, java.lang.String, java.lang.String, int, int, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.util.ArrayList<java.lang.Long>):void (m)] (LINE:121) call: com.okinc.business.defi.biz.net.bean.InternalChainAddressNew.<init>(java.lang.String, java.lang.String, java.lang.String, int, int, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.util.ArrayList):void type: THIS */
    public /* synthetic */ InternalChainAddressNew(String str, String str2, String str3, int i, int i2, Long l, String str4, String str5, String str6, ArrayList arrayList, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? "" : str2, (i3 & 4) != 0 ? "" : str3, i, i2, (i3 & 32) != 0 ? null : l, (i3 & 64) != 0 ? null : str4, (i3 & 128) != 0 ? "" : str5, (i3 & 256) != 0 ? "" : str6, arrayList);
    }
}
