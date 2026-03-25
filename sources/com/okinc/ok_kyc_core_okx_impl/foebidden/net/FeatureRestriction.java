package com.okinc.ok_kyc_core_okx_impl.foebidden.net;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class FeatureRestriction implements Parcelable {
    private String action;
    private Long content;
    private String country;
    private Boolean crMarket;
    private String displayCountryName;
    private String entityId;
    private Boolean hidden;
    private Integer kycLevel;
    private Boolean limit;
    private List<String> mode;
    private Integer politStatus;
    private String province;
    private String provinceCode;
    private Boolean removeUserFlag;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<FeatureRestriction> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, null, null, null, null, null, null, new ArrayListSerializer(StringSerializer.INSTANCE), null};

    public static final class Creator implements Parcelable.Creator<FeatureRestriction> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FeatureRestriction createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Boolean boolValueOf2;
            Boolean boolValueOf3;
            Intrinsics.checkNotNullParameter(parcel, "");
            Boolean boolValueOf4 = null;
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            Integer numValueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                boolValueOf2 = null;
            } else {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf3 = null;
            } else {
                boolValueOf3 = Boolean.valueOf(parcel.readInt() != 0);
            }
            String string6 = parcel.readString();
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            if (parcel.readInt() != 0) {
                boolValueOf4 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new FeatureRestriction(lValueOf, string, string2, boolValueOf, numValueOf, string3, string4, string5, numValueOf2, boolValueOf2, boolValueOf3, string6, arrayListCreateStringArrayList, boolValueOf4);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FeatureRestriction[] newArray(int i) {
            return new FeatureRestriction[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public FeatureRestriction() {
        this((Long) null, (String) null, (String) null, (Boolean) null, (Integer) null, (String) null, (String) null, (String) null, (Integer) null, (Boolean) null, (Boolean) null, (String) null, (List) null, (Boolean) null, 16383, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component1() {
        return this.content;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component10() {
        return this.removeUserFlag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component11() {
        return this.limit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.entityId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component13() {
        return this.mode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component14() {
        return this.crMarket;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.country;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.displayCountryName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component4() {
        return this.hidden;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component5() {
        return this.kycLevel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.provinceCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.action;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.province;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component9() {
        return this.politStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FeatureRestriction copy(Long l, String str, String str2, Boolean bool, Integer num, String str3, String str4, String str5, Integer num2, Boolean bool2, Boolean bool3, String str6, List<String> list, Boolean bool4) {
        return new FeatureRestriction(l, str, str2, bool, num, str3, str4, str5, num2, bool2, bool3, str6, list, bool4);
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
        if (!(obj instanceof FeatureRestriction)) {
            return false;
        }
        FeatureRestriction featureRestriction = (FeatureRestriction) obj;
        return Intrinsics.EZpvd(this.content, featureRestriction.content) && Intrinsics.EZpvd((Object) this.country, (Object) featureRestriction.country) && Intrinsics.EZpvd((Object) this.displayCountryName, (Object) featureRestriction.displayCountryName) && Intrinsics.EZpvd(this.hidden, featureRestriction.hidden) && Intrinsics.EZpvd(this.kycLevel, featureRestriction.kycLevel) && Intrinsics.EZpvd((Object) this.provinceCode, (Object) featureRestriction.provinceCode) && Intrinsics.EZpvd((Object) this.action, (Object) featureRestriction.action) && Intrinsics.EZpvd((Object) this.province, (Object) featureRestriction.province) && Intrinsics.EZpvd(this.politStatus, featureRestriction.politStatus) && Intrinsics.EZpvd(this.removeUserFlag, featureRestriction.removeUserFlag) && Intrinsics.EZpvd(this.limit, featureRestriction.limit) && Intrinsics.EZpvd((Object) this.entityId, (Object) featureRestriction.entityId) && Intrinsics.EZpvd(this.mode, featureRestriction.mode) && Intrinsics.EZpvd(this.crMarket, featureRestriction.crMarket);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAction() {
        return this.action;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getContent() {
        return this.content;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCountry() {
        return this.country;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getCrMarket() {
        return this.crMarket;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDisplayCountryName() {
        return this.displayCountryName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEntityId() {
        return this.entityId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getHidden() {
        return this.hidden;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getKycLevel() {
        return this.kycLevel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getLimit() {
        return this.limit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getMode() {
        return this.mode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getPolitStatus() {
        return this.politStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getProvince() {
        return this.province;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getProvinceCode() {
        return this.provinceCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getRemoveUserFlag() {
        return this.removeUserFlag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Long l = this.content;
        int iHashCode = l == null ? 0 : l.hashCode();
        String str = this.country;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.displayCountryName;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        Boolean bool = this.hidden;
        int iHashCode4 = bool == null ? 0 : bool.hashCode();
        Integer num = this.kycLevel;
        int iHashCode5 = num == null ? 0 : num.hashCode();
        String str3 = this.provinceCode;
        int iHashCode6 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.action;
        int iHashCode7 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.province;
        int iHashCode8 = str5 == null ? 0 : str5.hashCode();
        Integer num2 = this.politStatus;
        int iHashCode9 = num2 == null ? 0 : num2.hashCode();
        Boolean bool2 = this.removeUserFlag;
        int iHashCode10 = bool2 == null ? 0 : bool2.hashCode();
        Boolean bool3 = this.limit;
        int iHashCode11 = bool3 == null ? 0 : bool3.hashCode();
        String str6 = this.entityId;
        int iHashCode12 = str6 == null ? 0 : str6.hashCode();
        List<String> list = this.mode;
        int iHashCode13 = list == null ? 0 : list.hashCode();
        Boolean bool4 = this.crMarket;
        return (((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + (bool4 != null ? bool4.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAction(String str) {
        this.action = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setContent(Long l) {
        this.content = l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCountry(String str) {
        this.country = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCrMarket(Boolean bool) {
        this.crMarket = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDisplayCountryName(String str) {
        this.displayCountryName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEntityId(String str) {
        this.entityId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setHidden(Boolean bool) {
        this.hidden = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setKycLevel(Integer num) {
        this.kycLevel = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLimit(Boolean bool) {
        this.limit = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMode(List<String> list) {
        this.mode = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPolitStatus(Integer num) {
        this.politStatus = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setProvince(String str) {
        this.province = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setProvinceCode(String str) {
        this.provinceCode = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRemoveUserFlag(Boolean bool) {
        this.removeUserFlag = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "FeatureRestriction(content=" + this.content + ", country=" + this.country + ", displayCountryName=" + this.displayCountryName + ", hidden=" + this.hidden + ", kycLevel=" + this.kycLevel + ", provinceCode=" + this.provinceCode + ", action=" + this.action + ", province=" + this.province + ", politStatus=" + this.politStatus + ", removeUserFlag=" + this.removeUserFlag + ", limit=" + this.limit + ", entityId=" + this.entityId + ", mode=" + this.mode + ", crMarket=" + this.crMarket + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        Long l = this.content;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        parcel.writeString(this.country);
        parcel.writeString(this.displayCountryName);
        Boolean bool = this.hidden;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Integer num = this.kycLevel;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeString(this.provinceCode);
        parcel.writeString(this.action);
        parcel.writeString(this.province);
        Integer num2 = this.politStatus;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        Boolean bool2 = this.removeUserFlag;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        Boolean bool3 = this.limit;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool3.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.entityId);
        parcel.writeStringList(this.mode);
        Boolean bool4 = this.crMarket;
        if (bool4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool4.booleanValue() ? 1 : 0);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.ok_kyc_core_okx_impl.foebidden.net.FeatureRestriction.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<FeatureRestriction> serializer() {
            return FeatureRestriction$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ FeatureRestriction(int i, Long l, String str, String str2, Boolean bool, Integer num, String str3, String str4, String str5, Integer num2, Boolean bool2, Boolean bool3, String str6, List list, Boolean bool4, SerializationConstructorMarker serializationConstructorMarker) {
        this.content = (i & 1) == 0 ? 0L : l;
        if ((i & 2) == 0) {
            this.country = "";
        } else {
            this.country = str;
        }
        if ((i & 4) == 0) {
            this.displayCountryName = "";
        } else {
            this.displayCountryName = str2;
        }
        this.hidden = (i & 8) == 0 ? Boolean.FALSE : bool;
        this.kycLevel = (i & 16) == 0 ? 0 : num;
        if ((i & 32) == 0) {
            this.provinceCode = "";
        } else {
            this.provinceCode = str3;
        }
        if ((i & 64) == 0) {
            this.action = "";
        } else {
            this.action = str4;
        }
        if ((i & 128) == 0) {
            this.province = "";
        } else {
            this.province = str5;
        }
        this.politStatus = (i & 256) == 0 ? -1 : num2;
        this.removeUserFlag = (i & 512) == 0 ? Boolean.FALSE : bool2;
        this.limit = (i & 1024) == 0 ? Boolean.FALSE : bool3;
        if ((i & 2048) == 0) {
            this.entityId = "";
        } else {
            this.entityId = str6;
        }
        this.mode = (i & 4096) == 0 ? null : list;
        this.crMarket = (i & 8192) == 0 ? Boolean.FALSE : bool4;
    }

    public static final /* synthetic */ void write$Self$OKFeatureRestriction_ok_feature_restriction_impl(FeatureRestriction featureRestriction, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        Integer num;
        Integer num2;
        Long l;
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || (l = featureRestriction.content) == null || l.longValue() != 0) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, LongSerializer.INSTANCE, featureRestriction.content);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) featureRestriction.country, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, featureRestriction.country);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) featureRestriction.displayCountryName, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, featureRestriction.displayCountryName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd(featureRestriction.hidden, Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, BooleanSerializer.INSTANCE, featureRestriction.hidden);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || (num2 = featureRestriction.kycLevel) == null || num2.intValue() != 0) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, IntSerializer.INSTANCE, featureRestriction.kycLevel);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) featureRestriction.provinceCode, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, featureRestriction.provinceCode);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) featureRestriction.action, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, featureRestriction.action);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) featureRestriction.province, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, featureRestriction.province);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || (num = featureRestriction.politStatus) == null || num.intValue() != -1) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, IntSerializer.INSTANCE, featureRestriction.politStatus);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd(featureRestriction.removeUserFlag, Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, BooleanSerializer.INSTANCE, featureRestriction.removeUserFlag);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd(featureRestriction.limit, Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, BooleanSerializer.INSTANCE, featureRestriction.limit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd((Object) featureRestriction.entityId, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, StringSerializer.INSTANCE, featureRestriction.entityId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || featureRestriction.mode != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, kSerializerArr[12], featureRestriction.mode);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) && Intrinsics.EZpvd(featureRestriction.crMarket, Boolean.FALSE)) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 13, BooleanSerializer.INSTANCE, featureRestriction.crMarket);
    }

    public FeatureRestriction(Long l, String str, String str2, Boolean bool, Integer num, String str3, String str4, String str5, Integer num2, Boolean bool2, Boolean bool3, String str6, List<String> list, Boolean bool4) {
        this.content = l;
        this.country = str;
        this.displayCountryName = str2;
        this.hidden = bool;
        this.kycLevel = num;
        this.provinceCode = str3;
        this.action = str4;
        this.province = str5;
        this.politStatus = num2;
        this.removeUserFlag = bool2;
        this.limit = bool3;
        this.entityId = str6;
        this.mode = list;
        this.crMarket = bool4;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00a0: CONSTRUCTOR 
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0002: ARITH (r29v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r15v0 java.lang.Long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000e: ARITH (r29v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0018: ARITH (r29v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0020: ARITH (r29v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0024: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r18v0 java.lang.Boolean))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0029: ARITH (r29v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r19v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0035: ARITH (r29v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003d: ARITH (r29v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0045: ARITH (r29v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r22v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x004d: ARITH (r29v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (-1 int) : (r23v0 java.lang.Integer))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0059: ARITH (r29v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x005d: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r24v0 java.lang.Boolean))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0062: ARITH (r29v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0066: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r25v0 java.lang.Boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x006b: ARITH (r29v0 int) & (2048 int) A[WRAPPED]) == (0 int)) ? (r26v0 java.lang.String) : (""))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0072: ARITH (r29v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r27v0 java.util.List))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x007a: ARITH (r29v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x007e: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r28v0 java.lang.Boolean))
 A[MD:(java.lang.Long, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.Boolean, java.lang.Boolean, java.lang.String, java.util.List<java.lang.String>, java.lang.Boolean):void (m)] (LINE:12) call: com.okinc.ok_kyc_core_okx_impl.foebidden.net.FeatureRestriction.<init>(java.lang.Long, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.Boolean, java.lang.Boolean, java.lang.String, java.util.List, java.lang.Boolean):void type: THIS */
    public /* synthetic */ FeatureRestriction(Long l, String str, String str2, Boolean bool, Integer num, String str3, String str4, String str5, Integer num2, Boolean bool2, Boolean bool3, String str6, List list, Boolean bool4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : l, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? Boolean.FALSE : bool, (i & 16) != 0 ? 0 : num, (i & 32) != 0 ? "" : str3, (i & 64) != 0 ? "" : str4, (i & 128) != 0 ? "" : str5, (i & 256) != 0 ? -1 : num2, (i & 512) != 0 ? Boolean.FALSE : bool2, (i & 1024) != 0 ? Boolean.FALSE : bool3, (i & 2048) == 0 ? str6 : "", (i & 4096) != 0 ? null : list, (i & 8192) != 0 ? Boolean.FALSE : bool4);
    }
}
