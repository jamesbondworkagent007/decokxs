package com.okinc.kyc.api.biz.restriction;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.kyc.api.biz.restriction.OKComplianceRestrictionService;
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
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: loaded from: classes9.dex */
@Serializable
public final class FeatureRestrictionInfo implements Parcelable {
    private final OKComplianceRestrictionService.FeatureAction action;
    private final Long content;
    private final String country;
    private final String countryName;
    private final Boolean crMarket;
    private final String entityId;
    private final OKComplianceRestrictionService.Feature feature;
    private final Boolean hidden;
    private Boolean isDebugMock;
    private final Integer kycLevel;
    private final List<String> mode;
    private final Integer politStatus;
    private final String province;
    private final String provinceCode;
    private final Boolean removeUserFlag;
    private final Boolean restricted;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<FeatureRestrictionInfo> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, EnumsKt.createSimpleEnumSerializer("com.okinc.kyc.api.biz.restriction.OKComplianceRestrictionService.Feature", OKComplianceRestrictionService.Feature.values()), null, null, null, EnumsKt.createSimpleEnumSerializer("com.okinc.kyc.api.biz.restriction.OKComplianceRestrictionService.FeatureAction", OKComplianceRestrictionService.FeatureAction.values()), null, null, null, null, null, new ArrayListSerializer(StringSerializer.INSTANCE), null, null};

    public static final class Creator implements Parcelable.Creator<FeatureRestrictionInfo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FeatureRestrictionInfo createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Boolean boolValueOf2;
            Boolean boolValueOf3;
            Boolean boolValueOf4;
            Intrinsics.checkNotNullParameter(parcel, "");
            Boolean boolValueOf5 = null;
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            String string = parcel.readString();
            String string2 = parcel.readString();
            OKComplianceRestrictionService.Feature featureValueOf = OKComplianceRestrictionService.Feature.valueOf(parcel.readString());
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String string3 = parcel.readString();
            OKComplianceRestrictionService.FeatureAction featureActionValueOf = OKComplianceRestrictionService.FeatureAction.valueOf(parcel.readString());
            String string4 = parcel.readString();
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
            String string5 = parcel.readString();
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            if (parcel.readInt() == 0) {
                boolValueOf4 = null;
            } else {
                boolValueOf4 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() != 0) {
                boolValueOf5 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new FeatureRestrictionInfo(lValueOf, string, string2, featureValueOf, boolValueOf, numValueOf, string3, featureActionValueOf, string4, numValueOf2, boolValueOf2, boolValueOf3, string5, arrayListCreateStringArrayList, boolValueOf4, boolValueOf5);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FeatureRestrictionInfo[] newArray(int i) {
            return new FeatureRestrictionInfo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component1() {
        return this.content;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component10() {
        return this.politStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component11() {
        return this.removeUserFlag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component12() {
        return this.restricted;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.entityId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component14() {
        return this.mode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component15() {
        return this.crMarket;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component16() {
        return this.isDebugMock;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.country;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.countryName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OKComplianceRestrictionService.Feature component4() {
        return this.feature;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component5() {
        return this.hidden;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component6() {
        return this.kycLevel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.provinceCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OKComplianceRestrictionService.FeatureAction component8() {
        return this.action;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.province;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FeatureRestrictionInfo copy(Long l, String str, String str2, @NotNull OKComplianceRestrictionService.Feature feature, Boolean bool, Integer num, String str3, @NotNull OKComplianceRestrictionService.FeatureAction featureAction, String str4, Integer num2, Boolean bool2, Boolean bool3, String str5, List<String> list, Boolean bool4, Boolean bool5) {
        Intrinsics.checkNotNullParameter(feature, "");
        Intrinsics.checkNotNullParameter(featureAction, "");
        return new FeatureRestrictionInfo(l, str, str2, feature, bool, num, str3, featureAction, str4, num2, bool2, bool3, str5, list, bool4, bool5);
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
        if (!(obj instanceof FeatureRestrictionInfo)) {
            return false;
        }
        FeatureRestrictionInfo featureRestrictionInfo = (FeatureRestrictionInfo) obj;
        return Intrinsics.EZpvd(this.content, featureRestrictionInfo.content) && Intrinsics.EZpvd((Object) this.country, (Object) featureRestrictionInfo.country) && Intrinsics.EZpvd((Object) this.countryName, (Object) featureRestrictionInfo.countryName) && this.feature == featureRestrictionInfo.feature && Intrinsics.EZpvd(this.hidden, featureRestrictionInfo.hidden) && Intrinsics.EZpvd(this.kycLevel, featureRestrictionInfo.kycLevel) && Intrinsics.EZpvd((Object) this.provinceCode, (Object) featureRestrictionInfo.provinceCode) && this.action == featureRestrictionInfo.action && Intrinsics.EZpvd((Object) this.province, (Object) featureRestrictionInfo.province) && Intrinsics.EZpvd(this.politStatus, featureRestrictionInfo.politStatus) && Intrinsics.EZpvd(this.removeUserFlag, featureRestrictionInfo.removeUserFlag) && Intrinsics.EZpvd(this.restricted, featureRestrictionInfo.restricted) && Intrinsics.EZpvd((Object) this.entityId, (Object) featureRestrictionInfo.entityId) && Intrinsics.EZpvd(this.mode, featureRestrictionInfo.mode) && Intrinsics.EZpvd(this.crMarket, featureRestrictionInfo.crMarket) && Intrinsics.EZpvd(this.isDebugMock, featureRestrictionInfo.isDebugMock);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OKComplianceRestrictionService.FeatureAction getAction() {
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
    public final String getCountryName() {
        return this.countryName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getCrMarket() {
        return this.crMarket;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEntityId() {
        return this.entityId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OKComplianceRestrictionService.Feature getFeature() {
        return this.feature;
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
    public final Boolean getRestricted() {
        return this.restricted;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Long l = this.content;
        int iHashCode = l == null ? 0 : l.hashCode();
        String str = this.country;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.countryName;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        int iHashCode4 = this.feature.hashCode();
        Boolean bool = this.hidden;
        int iHashCode5 = bool == null ? 0 : bool.hashCode();
        Integer num = this.kycLevel;
        int iHashCode6 = num == null ? 0 : num.hashCode();
        String str3 = this.provinceCode;
        int iHashCode7 = str3 == null ? 0 : str3.hashCode();
        int iHashCode8 = this.action.hashCode();
        String str4 = this.province;
        int iHashCode9 = str4 == null ? 0 : str4.hashCode();
        Integer num2 = this.politStatus;
        int iHashCode10 = num2 == null ? 0 : num2.hashCode();
        Boolean bool2 = this.removeUserFlag;
        int iHashCode11 = bool2 == null ? 0 : bool2.hashCode();
        Boolean bool3 = this.restricted;
        int iHashCode12 = bool3 == null ? 0 : bool3.hashCode();
        String str5 = this.entityId;
        int iHashCode13 = str5 == null ? 0 : str5.hashCode();
        List<String> list = this.mode;
        int iHashCode14 = list == null ? 0 : list.hashCode();
        Boolean bool4 = this.crMarket;
        int iHashCode15 = bool4 == null ? 0 : bool4.hashCode();
        Boolean bool5 = this.isDebugMock;
        return (((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + (bool5 == null ? 0 : bool5.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean isDebugMock() {
        return this.isDebugMock;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDebugMock(Boolean bool) {
        this.isDebugMock = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "FeatureRestrictionInfo(content=" + this.content + ", country=" + this.country + ", countryName=" + this.countryName + ", feature=" + this.feature + ", hidden=" + this.hidden + ", kycLevel=" + this.kycLevel + ", provinceCode=" + this.provinceCode + ", action=" + this.action + ", province=" + this.province + ", politStatus=" + this.politStatus + ", removeUserFlag=" + this.removeUserFlag + ", restricted=" + this.restricted + ", entityId=" + this.entityId + ", mode=" + this.mode + ", crMarket=" + this.crMarket + ", isDebugMock=" + this.isDebugMock + ")";
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
        parcel.writeString(this.countryName);
        parcel.writeString(this.feature.name());
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
        parcel.writeString(this.action.name());
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
        Boolean bool3 = this.restricted;
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
        Boolean bool5 = this.isDebugMock;
        if (bool5 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool5.booleanValue() ? 1 : 0);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.kyc.api.biz.restriction.FeatureRestrictionInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<FeatureRestrictionInfo> serializer() {
            return FeatureRestrictionInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ FeatureRestrictionInfo(int i, Long l, String str, String str2, OKComplianceRestrictionService.Feature feature, Boolean bool, Integer num, String str3, OKComplianceRestrictionService.FeatureAction featureAction, String str4, Integer num2, Boolean bool2, Boolean bool3, String str5, List list, Boolean bool4, Boolean bool5, SerializationConstructorMarker serializationConstructorMarker) {
        if (136 != (i & CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA)) {
            PluginExceptionsKt.throwMissingFieldException(i, CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA, FeatureRestrictionInfo$$serializer.INSTANCE.getDescriptor());
        }
        this.content = (i & 1) == 0 ? 0L : l;
        if ((i & 2) == 0) {
            this.country = "";
        } else {
            this.country = str;
        }
        if ((i & 4) == 0) {
            this.countryName = "";
        } else {
            this.countryName = str2;
        }
        this.feature = feature;
        this.hidden = (i & 16) == 0 ? Boolean.FALSE : bool;
        this.kycLevel = (i & 32) == 0 ? -1 : num;
        if ((i & 64) == 0) {
            this.provinceCode = "";
        } else {
            this.provinceCode = str3;
        }
        this.action = featureAction;
        if ((i & 256) == 0) {
            this.province = "";
        } else {
            this.province = str4;
        }
        this.politStatus = (i & 512) == 0 ? -1 : num2;
        this.removeUserFlag = (i & 1024) == 0 ? Boolean.FALSE : bool2;
        this.restricted = (i & 2048) == 0 ? Boolean.FALSE : bool3;
        if ((i & 4096) == 0) {
            this.entityId = "";
        } else {
            this.entityId = str5;
        }
        this.mode = (i & 8192) == 0 ? null : list;
        this.crMarket = (i & 16384) == 0 ? Boolean.FALSE : bool4;
        this.isDebugMock = (i & 32768) == 0 ? Boolean.FALSE : bool5;
    }

    public static final /* synthetic */ void write$Self$OKFeatureRestriction_ok_feature_restriction_impl(FeatureRestrictionInfo featureRestrictionInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        Integer num;
        Integer num2;
        Long l;
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || (l = featureRestrictionInfo.content) == null || l.longValue() != 0) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, LongSerializer.INSTANCE, featureRestrictionInfo.content);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) featureRestrictionInfo.country, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, featureRestrictionInfo.country);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) featureRestrictionInfo.countryName, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, featureRestrictionInfo.countryName);
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 3, kSerializerArr[3], featureRestrictionInfo.feature);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd(featureRestrictionInfo.hidden, Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, BooleanSerializer.INSTANCE, featureRestrictionInfo.hidden);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || (num2 = featureRestrictionInfo.kycLevel) == null || num2.intValue() != -1) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, IntSerializer.INSTANCE, featureRestrictionInfo.kycLevel);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) featureRestrictionInfo.provinceCode, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, featureRestrictionInfo.provinceCode);
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 7, kSerializerArr[7], featureRestrictionInfo.action);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) featureRestrictionInfo.province, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, featureRestrictionInfo.province);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || (num = featureRestrictionInfo.politStatus) == null || num.intValue() != -1) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, IntSerializer.INSTANCE, featureRestrictionInfo.politStatus);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd(featureRestrictionInfo.removeUserFlag, Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, BooleanSerializer.INSTANCE, featureRestrictionInfo.removeUserFlag);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd(featureRestrictionInfo.restricted, Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, BooleanSerializer.INSTANCE, featureRestrictionInfo.restricted);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || !Intrinsics.EZpvd((Object) featureRestrictionInfo.entityId, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, StringSerializer.INSTANCE, featureRestrictionInfo.entityId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || featureRestrictionInfo.mode != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 13, kSerializerArr[13], featureRestrictionInfo.mode);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || !Intrinsics.EZpvd(featureRestrictionInfo.crMarket, Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 14, BooleanSerializer.INSTANCE, featureRestrictionInfo.crMarket);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) && Intrinsics.EZpvd(featureRestrictionInfo.isDebugMock, Boolean.FALSE)) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 15, BooleanSerializer.INSTANCE, featureRestrictionInfo.isDebugMock);
    }

    public FeatureRestrictionInfo(Long l, String str, String str2, @NotNull OKComplianceRestrictionService.Feature feature, Boolean bool, Integer num, String str3, @NotNull OKComplianceRestrictionService.FeatureAction featureAction, String str4, Integer num2, Boolean bool2, Boolean bool3, String str5, List<String> list, Boolean bool4, Boolean bool5) {
        Intrinsics.checkNotNullParameter(feature, "");
        Intrinsics.checkNotNullParameter(featureAction, "");
        this.content = l;
        this.country = str;
        this.countryName = str2;
        this.feature = feature;
        this.hidden = bool;
        this.kycLevel = num;
        this.provinceCode = str3;
        this.action = featureAction;
        this.province = str4;
        this.politStatus = num2;
        this.removeUserFlag = bool2;
        this.restricted = bool3;
        this.entityId = str5;
        this.mode = list;
        this.crMarket = bool4;
        this.isDebugMock = bool5;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0099: CONSTRUCTOR 
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0002: ARITH (r36v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r20v0 java.lang.Long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r36v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001a: ARITH (r36v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r22v0 java.lang.String))
  (r23v0 com.okinc.kyc.api.biz.restriction.OKComplianceRestrictionService$Feature)
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0022: ARITH (r36v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0028: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r24v0 java.lang.Boolean))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x002c: ARITH (r36v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (-1 int) : (r25v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0039: ARITH (r36v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r26v0 java.lang.String))
  (r27v0 com.okinc.kyc.api.biz.restriction.OKComplianceRestrictionService$FeatureAction)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0041: ARITH (r36v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r28v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0049: ARITH (r36v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (-1 int) : (r29v0 java.lang.Integer))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0055: ARITH (r36v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x005b: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r30v0 java.lang.Boolean))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x005f: ARITH (r36v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0065: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r31v0 java.lang.Boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0069: ARITH (r36v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? ("") : (r32v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0071: ARITH (r36v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r33v0 java.util.List))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x007b: ARITH (r36v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0081: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r34v0 java.lang.Boolean))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0089: ARITH (r36v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x008e: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r35v0 java.lang.Boolean))
 A[MD:(java.lang.Long, java.lang.String, java.lang.String, com.okinc.kyc.api.biz.restriction.OKComplianceRestrictionService$Feature, java.lang.Boolean, java.lang.Integer, java.lang.String, com.okinc.kyc.api.biz.restriction.OKComplianceRestrictionService$FeatureAction, java.lang.String, java.lang.Integer, java.lang.Boolean, java.lang.Boolean, java.lang.String, java.util.List<java.lang.String>, java.lang.Boolean, java.lang.Boolean):void (m)] (LINE:15) call: com.okinc.kyc.api.biz.restriction.FeatureRestrictionInfo.<init>(java.lang.Long, java.lang.String, java.lang.String, com.okinc.kyc.api.biz.restriction.OKComplianceRestrictionService$Feature, java.lang.Boolean, java.lang.Integer, java.lang.String, com.okinc.kyc.api.biz.restriction.OKComplianceRestrictionService$FeatureAction, java.lang.String, java.lang.Integer, java.lang.Boolean, java.lang.Boolean, java.lang.String, java.util.List, java.lang.Boolean, java.lang.Boolean):void type: THIS */
    public /* synthetic */ FeatureRestrictionInfo(Long l, String str, String str2, OKComplianceRestrictionService.Feature feature, Boolean bool, Integer num, String str3, OKComplianceRestrictionService.FeatureAction featureAction, String str4, Integer num2, Boolean bool2, Boolean bool3, String str5, List list, Boolean bool4, Boolean bool5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : l, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, feature, (i & 16) != 0 ? Boolean.FALSE : bool, (i & 32) != 0 ? -1 : num, (i & 64) != 0 ? "" : str3, featureAction, (i & 256) != 0 ? "" : str4, (i & 512) != 0 ? -1 : num2, (i & 1024) != 0 ? Boolean.FALSE : bool2, (i & 2048) != 0 ? Boolean.FALSE : bool3, (i & 4096) != 0 ? "" : str5, (i & 8192) != 0 ? null : list, (i & 16384) != 0 ? Boolean.FALSE : bool4, (i & 32768) != 0 ? Boolean.FALSE : bool5);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public FeatureRestrictionInfo() {
        OKComplianceRestrictionService.Feature feature = OKComplianceRestrictionService.Feature.FINANCIAL_PRODUCT;
        Boolean bool = Boolean.FALSE;
        this(0L, "", "", feature, bool, -1, "", OKComplianceRestrictionService.FeatureAction.NO_FEATURE, "", -1, bool, bool, "", null, bool, bool);
    }
}
