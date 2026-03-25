package com.okinc.kyc.api.biz.restriction;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.kyc.api.biz.restriction.OKComplianceRestrictionService;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.LinkedHashSetSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Serializable
public final class FeatureRestrictionDiffSet implements Parcelable {
    private final LinkedHashSet<OKComplianceRestrictionService.Feature> action;
    private final LinkedHashSet<OKComplianceRestrictionService.Feature> content;
    private final LinkedHashSet<OKComplianceRestrictionService.Feature> country;
    private final LinkedHashSet<OKComplianceRestrictionService.Feature> countryName;
    private final LinkedHashSet<OKComplianceRestrictionService.Mode> crTradingModes;
    private final LinkedHashSet<OKComplianceRestrictionService.Mode> crTradingPageModes;
    private boolean entityIdChange;
    private final LinkedHashSet<OKComplianceRestrictionService.Feature> featureModes;
    private final LinkedHashSet<OKComplianceRestrictionService.Feature> hidden;
    private final LinkedHashSet<OKComplianceRestrictionService.Feature> kycLevel;
    private boolean languageChange;
    private final LinkedHashSet<OKComplianceRestrictionService.Feature> limit;
    private final LinkedHashSet<OKComplianceRestrictionService.Mode> mode;
    private final LinkedHashSet<OKComplianceRestrictionService.Feature> politStatus;
    private final LinkedHashSet<OKComplianceRestrictionService.Feature> province;
    private final LinkedHashSet<OKComplianceRestrictionService.Feature> provinceCode;
    private final LinkedHashSet<OKComplianceRestrictionService.Feature> removeUserFlag;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<FeatureRestrictionDiffSet> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {new LinkedHashSetSerializer(EnumsKt.createSimpleEnumSerializer("com.okinc.kyc.api.biz.restriction.OKComplianceRestrictionService.Feature", OKComplianceRestrictionService.Feature.values())), new LinkedHashSetSerializer(EnumsKt.createSimpleEnumSerializer("com.okinc.kyc.api.biz.restriction.OKComplianceRestrictionService.Feature", OKComplianceRestrictionService.Feature.values())), new LinkedHashSetSerializer(EnumsKt.createSimpleEnumSerializer("com.okinc.kyc.api.biz.restriction.OKComplianceRestrictionService.Feature", OKComplianceRestrictionService.Feature.values())), new LinkedHashSetSerializer(EnumsKt.createSimpleEnumSerializer("com.okinc.kyc.api.biz.restriction.OKComplianceRestrictionService.Feature", OKComplianceRestrictionService.Feature.values())), new LinkedHashSetSerializer(EnumsKt.createSimpleEnumSerializer("com.okinc.kyc.api.biz.restriction.OKComplianceRestrictionService.Feature", OKComplianceRestrictionService.Feature.values())), new LinkedHashSetSerializer(EnumsKt.createSimpleEnumSerializer("com.okinc.kyc.api.biz.restriction.OKComplianceRestrictionService.Feature", OKComplianceRestrictionService.Feature.values())), new LinkedHashSetSerializer(EnumsKt.createSimpleEnumSerializer("com.okinc.kyc.api.biz.restriction.OKComplianceRestrictionService.Feature", OKComplianceRestrictionService.Feature.values())), new LinkedHashSetSerializer(EnumsKt.createSimpleEnumSerializer("com.okinc.kyc.api.biz.restriction.OKComplianceRestrictionService.Feature", OKComplianceRestrictionService.Feature.values())), new LinkedHashSetSerializer(EnumsKt.createSimpleEnumSerializer("com.okinc.kyc.api.biz.restriction.OKComplianceRestrictionService.Feature", OKComplianceRestrictionService.Feature.values())), new LinkedHashSetSerializer(EnumsKt.createSimpleEnumSerializer("com.okinc.kyc.api.biz.restriction.OKComplianceRestrictionService.Feature", OKComplianceRestrictionService.Feature.values())), new LinkedHashSetSerializer(EnumsKt.createSimpleEnumSerializer("com.okinc.kyc.api.biz.restriction.OKComplianceRestrictionService.Feature", OKComplianceRestrictionService.Feature.values())), new LinkedHashSetSerializer(EnumsKt.createSimpleEnumSerializer("com.okinc.kyc.api.biz.restriction.OKComplianceRestrictionService.Feature", OKComplianceRestrictionService.Feature.values())), new LinkedHashSetSerializer(EnumsKt.createSimpleEnumSerializer("com.okinc.kyc.api.biz.restriction.OKComplianceRestrictionService.Mode", OKComplianceRestrictionService.Mode.values())), new LinkedHashSetSerializer(EnumsKt.createSimpleEnumSerializer("com.okinc.kyc.api.biz.restriction.OKComplianceRestrictionService.Mode", OKComplianceRestrictionService.Mode.values())), new LinkedHashSetSerializer(EnumsKt.createSimpleEnumSerializer("com.okinc.kyc.api.biz.restriction.OKComplianceRestrictionService.Mode", OKComplianceRestrictionService.Mode.values())), null, null};

    public static final class Creator implements Parcelable.Creator<FeatureRestrictionDiffSet> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FeatureRestrictionDiffSet createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            int i = parcel.readInt();
            LinkedHashSet linkedHashSet = new LinkedHashSet(i);
            for (int i2 = 0; i2 != i; i2++) {
                linkedHashSet.add(OKComplianceRestrictionService.Feature.valueOf(parcel.readString()));
            }
            int i3 = parcel.readInt();
            LinkedHashSet linkedHashSet2 = new LinkedHashSet(i3);
            for (int i4 = 0; i4 != i3; i4++) {
                linkedHashSet2.add(OKComplianceRestrictionService.Feature.valueOf(parcel.readString()));
            }
            int i5 = parcel.readInt();
            LinkedHashSet linkedHashSet3 = new LinkedHashSet(i5);
            for (int i6 = 0; i6 != i5; i6++) {
                linkedHashSet3.add(OKComplianceRestrictionService.Feature.valueOf(parcel.readString()));
            }
            int i7 = parcel.readInt();
            LinkedHashSet linkedHashSet4 = new LinkedHashSet(i7);
            for (int i8 = 0; i8 != i7; i8++) {
                linkedHashSet4.add(OKComplianceRestrictionService.Feature.valueOf(parcel.readString()));
            }
            int i9 = parcel.readInt();
            LinkedHashSet linkedHashSet5 = new LinkedHashSet(i9);
            for (int i10 = 0; i10 != i9; i10++) {
                linkedHashSet5.add(OKComplianceRestrictionService.Feature.valueOf(parcel.readString()));
            }
            int i11 = parcel.readInt();
            LinkedHashSet linkedHashSet6 = new LinkedHashSet(i11);
            for (int i12 = 0; i12 != i11; i12++) {
                linkedHashSet6.add(OKComplianceRestrictionService.Feature.valueOf(parcel.readString()));
            }
            int i13 = parcel.readInt();
            LinkedHashSet linkedHashSet7 = new LinkedHashSet(i13);
            for (int i14 = 0; i14 != i13; i14++) {
                linkedHashSet7.add(OKComplianceRestrictionService.Feature.valueOf(parcel.readString()));
            }
            int i15 = parcel.readInt();
            LinkedHashSet linkedHashSet8 = new LinkedHashSet(i15);
            for (int i16 = 0; i16 != i15; i16++) {
                linkedHashSet8.add(OKComplianceRestrictionService.Feature.valueOf(parcel.readString()));
            }
            int i17 = parcel.readInt();
            LinkedHashSet linkedHashSet9 = new LinkedHashSet(i17);
            for (int i18 = 0; i18 != i17; i18++) {
                linkedHashSet9.add(OKComplianceRestrictionService.Feature.valueOf(parcel.readString()));
            }
            int i19 = parcel.readInt();
            LinkedHashSet linkedHashSet10 = new LinkedHashSet(i19);
            for (int i20 = 0; i20 != i19; i20++) {
                linkedHashSet10.add(OKComplianceRestrictionService.Feature.valueOf(parcel.readString()));
            }
            int i21 = parcel.readInt();
            LinkedHashSet linkedHashSet11 = new LinkedHashSet(i21);
            for (int i22 = 0; i22 != i21; i22++) {
                linkedHashSet11.add(OKComplianceRestrictionService.Feature.valueOf(parcel.readString()));
            }
            int i23 = parcel.readInt();
            LinkedHashSet linkedHashSet12 = new LinkedHashSet(i23);
            for (int i24 = 0; i24 != i23; i24++) {
                linkedHashSet12.add(OKComplianceRestrictionService.Feature.valueOf(parcel.readString()));
            }
            int i25 = parcel.readInt();
            LinkedHashSet linkedHashSet13 = new LinkedHashSet(i25);
            int i26 = 0;
            while (i26 != i25) {
                linkedHashSet13.add(OKComplianceRestrictionService.Mode.valueOf(parcel.readString()));
                i26++;
                i25 = i25;
            }
            int i27 = parcel.readInt();
            LinkedHashSet linkedHashSet14 = new LinkedHashSet(i27);
            int i28 = 0;
            while (i28 != i27) {
                linkedHashSet14.add(OKComplianceRestrictionService.Mode.valueOf(parcel.readString()));
                i28++;
                i27 = i27;
            }
            int i29 = parcel.readInt();
            LinkedHashSet linkedHashSet15 = new LinkedHashSet(i29);
            int i30 = 0;
            while (i30 != i29) {
                linkedHashSet15.add(OKComplianceRestrictionService.Mode.valueOf(parcel.readString()));
                i30++;
                i29 = i29;
            }
            return new FeatureRestrictionDiffSet(linkedHashSet, linkedHashSet2, linkedHashSet3, linkedHashSet4, linkedHashSet5, linkedHashSet6, linkedHashSet7, linkedHashSet8, linkedHashSet9, linkedHashSet10, linkedHashSet11, linkedHashSet12, linkedHashSet13, linkedHashSet14, linkedHashSet15, parcel.readInt() != 0, parcel.readInt() != 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FeatureRestrictionDiffSet[] newArray(int i) {
            return new FeatureRestrictionDiffSet[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public FeatureRestrictionDiffSet() {
        this((LinkedHashSet) null, (LinkedHashSet) null, (LinkedHashSet) null, (LinkedHashSet) null, (LinkedHashSet) null, (LinkedHashSet) null, (LinkedHashSet) null, (LinkedHashSet) null, (LinkedHashSet) null, (LinkedHashSet) null, (LinkedHashSet) null, (LinkedHashSet) null, (LinkedHashSet) null, (LinkedHashSet) null, (LinkedHashSet) null, false, false, 131071, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LinkedHashSet<OKComplianceRestrictionService.Feature> component1() {
        return this.content;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LinkedHashSet<OKComplianceRestrictionService.Feature> component10() {
        return this.action;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LinkedHashSet<OKComplianceRestrictionService.Feature> component11() {
        return this.removeUserFlag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LinkedHashSet<OKComplianceRestrictionService.Feature> component12() {
        return this.featureModes;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LinkedHashSet<OKComplianceRestrictionService.Mode> component13() {
        return this.mode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LinkedHashSet<OKComplianceRestrictionService.Mode> component14() {
        return this.crTradingModes;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LinkedHashSet<OKComplianceRestrictionService.Mode> component15() {
        return this.crTradingPageModes;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component16() {
        return this.entityIdChange;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component17() {
        return this.languageChange;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LinkedHashSet<OKComplianceRestrictionService.Feature> component2() {
        return this.country;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LinkedHashSet<OKComplianceRestrictionService.Feature> component3() {
        return this.countryName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LinkedHashSet<OKComplianceRestrictionService.Feature> component4() {
        return this.hidden;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LinkedHashSet<OKComplianceRestrictionService.Feature> component5() {
        return this.limit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LinkedHashSet<OKComplianceRestrictionService.Feature> component6() {
        return this.kycLevel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LinkedHashSet<OKComplianceRestrictionService.Feature> component7() {
        return this.provinceCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LinkedHashSet<OKComplianceRestrictionService.Feature> component8() {
        return this.province;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LinkedHashSet<OKComplianceRestrictionService.Feature> component9() {
        return this.politStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FeatureRestrictionDiffSet copy(@NotNull LinkedHashSet<OKComplianceRestrictionService.Feature> linkedHashSet, @NotNull LinkedHashSet<OKComplianceRestrictionService.Feature> linkedHashSet2, @NotNull LinkedHashSet<OKComplianceRestrictionService.Feature> linkedHashSet3, @NotNull LinkedHashSet<OKComplianceRestrictionService.Feature> linkedHashSet4, @NotNull LinkedHashSet<OKComplianceRestrictionService.Feature> linkedHashSet5, @NotNull LinkedHashSet<OKComplianceRestrictionService.Feature> linkedHashSet6, @NotNull LinkedHashSet<OKComplianceRestrictionService.Feature> linkedHashSet7, @NotNull LinkedHashSet<OKComplianceRestrictionService.Feature> linkedHashSet8, @NotNull LinkedHashSet<OKComplianceRestrictionService.Feature> linkedHashSet9, @NotNull LinkedHashSet<OKComplianceRestrictionService.Feature> linkedHashSet10, @NotNull LinkedHashSet<OKComplianceRestrictionService.Feature> linkedHashSet11, @NotNull LinkedHashSet<OKComplianceRestrictionService.Feature> linkedHashSet12, @NotNull LinkedHashSet<OKComplianceRestrictionService.Mode> linkedHashSet13, @NotNull LinkedHashSet<OKComplianceRestrictionService.Mode> linkedHashSet14, @NotNull LinkedHashSet<OKComplianceRestrictionService.Mode> linkedHashSet15, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(linkedHashSet, "");
        Intrinsics.checkNotNullParameter(linkedHashSet2, "");
        Intrinsics.checkNotNullParameter(linkedHashSet3, "");
        Intrinsics.checkNotNullParameter(linkedHashSet4, "");
        Intrinsics.checkNotNullParameter(linkedHashSet5, "");
        Intrinsics.checkNotNullParameter(linkedHashSet6, "");
        Intrinsics.checkNotNullParameter(linkedHashSet7, "");
        Intrinsics.checkNotNullParameter(linkedHashSet8, "");
        Intrinsics.checkNotNullParameter(linkedHashSet9, "");
        Intrinsics.checkNotNullParameter(linkedHashSet10, "");
        Intrinsics.checkNotNullParameter(linkedHashSet11, "");
        Intrinsics.checkNotNullParameter(linkedHashSet12, "");
        Intrinsics.checkNotNullParameter(linkedHashSet13, "");
        Intrinsics.checkNotNullParameter(linkedHashSet14, "");
        Intrinsics.checkNotNullParameter(linkedHashSet15, "");
        return new FeatureRestrictionDiffSet(linkedHashSet, linkedHashSet2, linkedHashSet3, linkedHashSet4, linkedHashSet5, linkedHashSet6, linkedHashSet7, linkedHashSet8, linkedHashSet9, linkedHashSet10, linkedHashSet11, linkedHashSet12, linkedHashSet13, linkedHashSet14, linkedHashSet15, z, z2);
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
        if (!(obj instanceof FeatureRestrictionDiffSet)) {
            return false;
        }
        FeatureRestrictionDiffSet featureRestrictionDiffSet = (FeatureRestrictionDiffSet) obj;
        return Intrinsics.EZpvd(this.content, featureRestrictionDiffSet.content) && Intrinsics.EZpvd(this.country, featureRestrictionDiffSet.country) && Intrinsics.EZpvd(this.countryName, featureRestrictionDiffSet.countryName) && Intrinsics.EZpvd(this.hidden, featureRestrictionDiffSet.hidden) && Intrinsics.EZpvd(this.limit, featureRestrictionDiffSet.limit) && Intrinsics.EZpvd(this.kycLevel, featureRestrictionDiffSet.kycLevel) && Intrinsics.EZpvd(this.provinceCode, featureRestrictionDiffSet.provinceCode) && Intrinsics.EZpvd(this.province, featureRestrictionDiffSet.province) && Intrinsics.EZpvd(this.politStatus, featureRestrictionDiffSet.politStatus) && Intrinsics.EZpvd(this.action, featureRestrictionDiffSet.action) && Intrinsics.EZpvd(this.removeUserFlag, featureRestrictionDiffSet.removeUserFlag) && Intrinsics.EZpvd(this.featureModes, featureRestrictionDiffSet.featureModes) && Intrinsics.EZpvd(this.mode, featureRestrictionDiffSet.mode) && Intrinsics.EZpvd(this.crTradingModes, featureRestrictionDiffSet.crTradingModes) && Intrinsics.EZpvd(this.crTradingPageModes, featureRestrictionDiffSet.crTradingPageModes) && this.entityIdChange == featureRestrictionDiffSet.entityIdChange && this.languageChange == featureRestrictionDiffSet.languageChange;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LinkedHashSet<OKComplianceRestrictionService.Feature> getAction() {
        return this.action;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LinkedHashSet<OKComplianceRestrictionService.Feature> getContent() {
        return this.content;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LinkedHashSet<OKComplianceRestrictionService.Feature> getCountry() {
        return this.country;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LinkedHashSet<OKComplianceRestrictionService.Feature> getCountryName() {
        return this.countryName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LinkedHashSet<OKComplianceRestrictionService.Mode> getCrTradingModes() {
        return this.crTradingModes;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LinkedHashSet<OKComplianceRestrictionService.Mode> getCrTradingPageModes() {
        return this.crTradingPageModes;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getEntityIdChange() {
        return this.entityIdChange;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LinkedHashSet<OKComplianceRestrictionService.Feature> getFeatureModes() {
        return this.featureModes;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LinkedHashSet<OKComplianceRestrictionService.Feature> getHidden() {
        return this.hidden;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LinkedHashSet<OKComplianceRestrictionService.Feature> getKycLevel() {
        return this.kycLevel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getLanguageChange() {
        return this.languageChange;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LinkedHashSet<OKComplianceRestrictionService.Feature> getLimit() {
        return this.limit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LinkedHashSet<OKComplianceRestrictionService.Mode> getMode() {
        return this.mode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LinkedHashSet<OKComplianceRestrictionService.Feature> getPolitStatus() {
        return this.politStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LinkedHashSet<OKComplianceRestrictionService.Feature> getProvince() {
        return this.province;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LinkedHashSet<OKComplianceRestrictionService.Feature> getProvinceCode() {
        return this.provinceCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LinkedHashSet<OKComplianceRestrictionService.Feature> getRemoveUserFlag() {
        return this.removeUserFlag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((((((((((((((((this.content.hashCode() * 31) + this.country.hashCode()) * 31) + this.countryName.hashCode()) * 31) + this.hidden.hashCode()) * 31) + this.limit.hashCode()) * 31) + this.kycLevel.hashCode()) * 31) + this.provinceCode.hashCode()) * 31) + this.province.hashCode()) * 31) + this.politStatus.hashCode()) * 31) + this.action.hashCode()) * 31) + this.removeUserFlag.hashCode()) * 31) + this.featureModes.hashCode()) * 31) + this.mode.hashCode()) * 31) + this.crTradingModes.hashCode()) * 31) + this.crTradingPageModes.hashCode()) * 31) + Boolean.hashCode(this.entityIdChange)) * 31) + Boolean.hashCode(this.languageChange);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEntityIdChange(boolean z) {
        this.entityIdChange = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLanguageChange(boolean z) {
        this.languageChange = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "FeatureRestrictionDiffSet(content=" + this.content + ", country=" + this.country + ", countryName=" + this.countryName + ", hidden=" + this.hidden + ", limit=" + this.limit + ", kycLevel=" + this.kycLevel + ", provinceCode=" + this.provinceCode + ", province=" + this.province + ", politStatus=" + this.politStatus + ", action=" + this.action + ", removeUserFlag=" + this.removeUserFlag + ", featureModes=" + this.featureModes + ", mode=" + this.mode + ", crTradingModes=" + this.crTradingModes + ", crTradingPageModes=" + this.crTradingPageModes + ", entityIdChange=" + this.entityIdChange + ", languageChange=" + this.languageChange + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        LinkedHashSet<OKComplianceRestrictionService.Feature> linkedHashSet = this.content;
        parcel.writeInt(linkedHashSet.size());
        Iterator<OKComplianceRestrictionService.Feature> it = linkedHashSet.iterator();
        while (it.hasNext()) {
            parcel.writeString(it.next().name());
        }
        LinkedHashSet<OKComplianceRestrictionService.Feature> linkedHashSet2 = this.country;
        parcel.writeInt(linkedHashSet2.size());
        Iterator<OKComplianceRestrictionService.Feature> it2 = linkedHashSet2.iterator();
        while (it2.hasNext()) {
            parcel.writeString(it2.next().name());
        }
        LinkedHashSet<OKComplianceRestrictionService.Feature> linkedHashSet3 = this.countryName;
        parcel.writeInt(linkedHashSet3.size());
        Iterator<OKComplianceRestrictionService.Feature> it3 = linkedHashSet3.iterator();
        while (it3.hasNext()) {
            parcel.writeString(it3.next().name());
        }
        LinkedHashSet<OKComplianceRestrictionService.Feature> linkedHashSet4 = this.hidden;
        parcel.writeInt(linkedHashSet4.size());
        Iterator<OKComplianceRestrictionService.Feature> it4 = linkedHashSet4.iterator();
        while (it4.hasNext()) {
            parcel.writeString(it4.next().name());
        }
        LinkedHashSet<OKComplianceRestrictionService.Feature> linkedHashSet5 = this.limit;
        parcel.writeInt(linkedHashSet5.size());
        Iterator<OKComplianceRestrictionService.Feature> it5 = linkedHashSet5.iterator();
        while (it5.hasNext()) {
            parcel.writeString(it5.next().name());
        }
        LinkedHashSet<OKComplianceRestrictionService.Feature> linkedHashSet6 = this.kycLevel;
        parcel.writeInt(linkedHashSet6.size());
        Iterator<OKComplianceRestrictionService.Feature> it6 = linkedHashSet6.iterator();
        while (it6.hasNext()) {
            parcel.writeString(it6.next().name());
        }
        LinkedHashSet<OKComplianceRestrictionService.Feature> linkedHashSet7 = this.provinceCode;
        parcel.writeInt(linkedHashSet7.size());
        Iterator<OKComplianceRestrictionService.Feature> it7 = linkedHashSet7.iterator();
        while (it7.hasNext()) {
            parcel.writeString(it7.next().name());
        }
        LinkedHashSet<OKComplianceRestrictionService.Feature> linkedHashSet8 = this.province;
        parcel.writeInt(linkedHashSet8.size());
        Iterator<OKComplianceRestrictionService.Feature> it8 = linkedHashSet8.iterator();
        while (it8.hasNext()) {
            parcel.writeString(it8.next().name());
        }
        LinkedHashSet<OKComplianceRestrictionService.Feature> linkedHashSet9 = this.politStatus;
        parcel.writeInt(linkedHashSet9.size());
        Iterator<OKComplianceRestrictionService.Feature> it9 = linkedHashSet9.iterator();
        while (it9.hasNext()) {
            parcel.writeString(it9.next().name());
        }
        LinkedHashSet<OKComplianceRestrictionService.Feature> linkedHashSet10 = this.action;
        parcel.writeInt(linkedHashSet10.size());
        Iterator<OKComplianceRestrictionService.Feature> it10 = linkedHashSet10.iterator();
        while (it10.hasNext()) {
            parcel.writeString(it10.next().name());
        }
        LinkedHashSet<OKComplianceRestrictionService.Feature> linkedHashSet11 = this.removeUserFlag;
        parcel.writeInt(linkedHashSet11.size());
        Iterator<OKComplianceRestrictionService.Feature> it11 = linkedHashSet11.iterator();
        while (it11.hasNext()) {
            parcel.writeString(it11.next().name());
        }
        LinkedHashSet<OKComplianceRestrictionService.Feature> linkedHashSet12 = this.featureModes;
        parcel.writeInt(linkedHashSet12.size());
        Iterator<OKComplianceRestrictionService.Feature> it12 = linkedHashSet12.iterator();
        while (it12.hasNext()) {
            parcel.writeString(it12.next().name());
        }
        LinkedHashSet<OKComplianceRestrictionService.Mode> linkedHashSet13 = this.mode;
        parcel.writeInt(linkedHashSet13.size());
        Iterator<OKComplianceRestrictionService.Mode> it13 = linkedHashSet13.iterator();
        while (it13.hasNext()) {
            parcel.writeString(it13.next().name());
        }
        LinkedHashSet<OKComplianceRestrictionService.Mode> linkedHashSet14 = this.crTradingModes;
        parcel.writeInt(linkedHashSet14.size());
        Iterator<OKComplianceRestrictionService.Mode> it14 = linkedHashSet14.iterator();
        while (it14.hasNext()) {
            parcel.writeString(it14.next().name());
        }
        LinkedHashSet<OKComplianceRestrictionService.Mode> linkedHashSet15 = this.crTradingPageModes;
        parcel.writeInt(linkedHashSet15.size());
        Iterator<OKComplianceRestrictionService.Mode> it15 = linkedHashSet15.iterator();
        while (it15.hasNext()) {
            parcel.writeString(it15.next().name());
        }
        parcel.writeInt(this.entityIdChange ? 1 : 0);
        parcel.writeInt(this.languageChange ? 1 : 0);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.kyc.api.biz.restriction.FeatureRestrictionDiffSet.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<FeatureRestrictionDiffSet> serializer() {
            return FeatureRestrictionDiffSet$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ FeatureRestrictionDiffSet(int i, LinkedHashSet linkedHashSet, LinkedHashSet linkedHashSet2, LinkedHashSet linkedHashSet3, LinkedHashSet linkedHashSet4, LinkedHashSet linkedHashSet5, LinkedHashSet linkedHashSet6, LinkedHashSet linkedHashSet7, LinkedHashSet linkedHashSet8, LinkedHashSet linkedHashSet9, LinkedHashSet linkedHashSet10, LinkedHashSet linkedHashSet11, LinkedHashSet linkedHashSet12, LinkedHashSet linkedHashSet13, LinkedHashSet linkedHashSet14, LinkedHashSet linkedHashSet15, boolean z, boolean z2, SerializationConstructorMarker serializationConstructorMarker) {
        this.content = (i & 1) == 0 ? new LinkedHashSet() : linkedHashSet;
        this.country = (i & 2) == 0 ? new LinkedHashSet() : linkedHashSet2;
        this.countryName = (i & 4) == 0 ? new LinkedHashSet() : linkedHashSet3;
        this.hidden = (i & 8) == 0 ? new LinkedHashSet() : linkedHashSet4;
        this.limit = (i & 16) == 0 ? new LinkedHashSet() : linkedHashSet5;
        this.kycLevel = (i & 32) == 0 ? new LinkedHashSet() : linkedHashSet6;
        this.provinceCode = (i & 64) == 0 ? new LinkedHashSet() : linkedHashSet7;
        this.province = (i & 128) == 0 ? new LinkedHashSet() : linkedHashSet8;
        this.politStatus = (i & 256) == 0 ? new LinkedHashSet() : linkedHashSet9;
        this.action = (i & 512) == 0 ? new LinkedHashSet() : linkedHashSet10;
        this.removeUserFlag = (i & 1024) == 0 ? new LinkedHashSet() : linkedHashSet11;
        this.featureModes = (i & 2048) == 0 ? new LinkedHashSet() : linkedHashSet12;
        this.mode = (i & 4096) == 0 ? new LinkedHashSet() : linkedHashSet13;
        this.crTradingModes = (i & 8192) == 0 ? new LinkedHashSet() : linkedHashSet14;
        this.crTradingPageModes = (i & 16384) == 0 ? new LinkedHashSet() : linkedHashSet15;
        if ((32768 & i) == 0) {
            this.entityIdChange = false;
        } else {
            this.entityIdChange = z;
        }
        if ((i & 65536) == 0) {
            this.languageChange = false;
        } else {
            this.languageChange = z2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [56=16] */
    public static final /* synthetic */ void write$Self$OKFeatureRestriction_ok_feature_restriction_impl(FeatureRestrictionDiffSet featureRestrictionDiffSet, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd(featureRestrictionDiffSet.content, new LinkedHashSet())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], featureRestrictionDiffSet.content);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd(featureRestrictionDiffSet.country, new LinkedHashSet())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], featureRestrictionDiffSet.country);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd(featureRestrictionDiffSet.countryName, new LinkedHashSet())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], featureRestrictionDiffSet.countryName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd(featureRestrictionDiffSet.hidden, new LinkedHashSet())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 3, kSerializerArr[3], featureRestrictionDiffSet.hidden);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd(featureRestrictionDiffSet.limit, new LinkedHashSet())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 4, kSerializerArr[4], featureRestrictionDiffSet.limit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd(featureRestrictionDiffSet.kycLevel, new LinkedHashSet())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 5, kSerializerArr[5], featureRestrictionDiffSet.kycLevel);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd(featureRestrictionDiffSet.provinceCode, new LinkedHashSet())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 6, kSerializerArr[6], featureRestrictionDiffSet.provinceCode);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd(featureRestrictionDiffSet.province, new LinkedHashSet())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 7, kSerializerArr[7], featureRestrictionDiffSet.province);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd(featureRestrictionDiffSet.politStatus, new LinkedHashSet())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 8, kSerializerArr[8], featureRestrictionDiffSet.politStatus);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd(featureRestrictionDiffSet.action, new LinkedHashSet())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 9, kSerializerArr[9], featureRestrictionDiffSet.action);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd(featureRestrictionDiffSet.removeUserFlag, new LinkedHashSet())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 10, kSerializerArr[10], featureRestrictionDiffSet.removeUserFlag);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd(featureRestrictionDiffSet.featureModes, new LinkedHashSet())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 11, kSerializerArr[11], featureRestrictionDiffSet.featureModes);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || !Intrinsics.EZpvd(featureRestrictionDiffSet.mode, new LinkedHashSet())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 12, kSerializerArr[12], featureRestrictionDiffSet.mode);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || !Intrinsics.EZpvd(featureRestrictionDiffSet.crTradingModes, new LinkedHashSet())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 13, kSerializerArr[13], featureRestrictionDiffSet.crTradingModes);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || !Intrinsics.EZpvd(featureRestrictionDiffSet.crTradingPageModes, new LinkedHashSet())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 14, kSerializerArr[14], featureRestrictionDiffSet.crTradingPageModes);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || featureRestrictionDiffSet.entityIdChange) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 15, featureRestrictionDiffSet.entityIdChange);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || featureRestrictionDiffSet.languageChange) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 16, featureRestrictionDiffSet.languageChange);
        }
    }

    public FeatureRestrictionDiffSet(@NotNull LinkedHashSet<OKComplianceRestrictionService.Feature> linkedHashSet, @NotNull LinkedHashSet<OKComplianceRestrictionService.Feature> linkedHashSet2, @NotNull LinkedHashSet<OKComplianceRestrictionService.Feature> linkedHashSet3, @NotNull LinkedHashSet<OKComplianceRestrictionService.Feature> linkedHashSet4, @NotNull LinkedHashSet<OKComplianceRestrictionService.Feature> linkedHashSet5, @NotNull LinkedHashSet<OKComplianceRestrictionService.Feature> linkedHashSet6, @NotNull LinkedHashSet<OKComplianceRestrictionService.Feature> linkedHashSet7, @NotNull LinkedHashSet<OKComplianceRestrictionService.Feature> linkedHashSet8, @NotNull LinkedHashSet<OKComplianceRestrictionService.Feature> linkedHashSet9, @NotNull LinkedHashSet<OKComplianceRestrictionService.Feature> linkedHashSet10, @NotNull LinkedHashSet<OKComplianceRestrictionService.Feature> linkedHashSet11, @NotNull LinkedHashSet<OKComplianceRestrictionService.Feature> linkedHashSet12, @NotNull LinkedHashSet<OKComplianceRestrictionService.Mode> linkedHashSet13, @NotNull LinkedHashSet<OKComplianceRestrictionService.Mode> linkedHashSet14, @NotNull LinkedHashSet<OKComplianceRestrictionService.Mode> linkedHashSet15, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(linkedHashSet, "");
        Intrinsics.checkNotNullParameter(linkedHashSet2, "");
        Intrinsics.checkNotNullParameter(linkedHashSet3, "");
        Intrinsics.checkNotNullParameter(linkedHashSet4, "");
        Intrinsics.checkNotNullParameter(linkedHashSet5, "");
        Intrinsics.checkNotNullParameter(linkedHashSet6, "");
        Intrinsics.checkNotNullParameter(linkedHashSet7, "");
        Intrinsics.checkNotNullParameter(linkedHashSet8, "");
        Intrinsics.checkNotNullParameter(linkedHashSet9, "");
        Intrinsics.checkNotNullParameter(linkedHashSet10, "");
        Intrinsics.checkNotNullParameter(linkedHashSet11, "");
        Intrinsics.checkNotNullParameter(linkedHashSet12, "");
        Intrinsics.checkNotNullParameter(linkedHashSet13, "");
        Intrinsics.checkNotNullParameter(linkedHashSet14, "");
        Intrinsics.checkNotNullParameter(linkedHashSet15, "");
        this.content = linkedHashSet;
        this.country = linkedHashSet2;
        this.countryName = linkedHashSet3;
        this.hidden = linkedHashSet4;
        this.limit = linkedHashSet5;
        this.kycLevel = linkedHashSet6;
        this.provinceCode = linkedHashSet7;
        this.province = linkedHashSet8;
        this.politStatus = linkedHashSet9;
        this.action = linkedHashSet10;
        this.removeUserFlag = linkedHashSet11;
        this.featureModes = linkedHashSet12;
        this.mode = linkedHashSet13;
        this.crTradingModes = linkedHashSet14;
        this.crTradingPageModes = linkedHashSet15;
        this.entityIdChange = z;
        this.languageChange = z2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00f1: CONSTRUCTOR 
  (wrap:java.util.LinkedHashSet:?: TERNARY null = ((wrap:int:0x0002: ARITH (r37v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0008: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:60) call: java.util.LinkedHashSet.<init>():void type: CONSTRUCTOR) : (r20v0 java.util.LinkedHashSet))
  (wrap:java.util.LinkedHashSet:?: TERNARY null = ((wrap:int:0x000e: ARITH (r37v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0014: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:61) call: java.util.LinkedHashSet.<init>():void type: CONSTRUCTOR) : (r21v0 java.util.LinkedHashSet))
  (wrap:java.util.LinkedHashSet:?: TERNARY null = ((wrap:int:0x001a: ARITH (r37v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0020: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:62) call: java.util.LinkedHashSet.<init>():void type: CONSTRUCTOR) : (r22v0 java.util.LinkedHashSet))
  (wrap:java.util.LinkedHashSet:?: TERNARY null = ((wrap:int:0x0026: ARITH (r37v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x002c: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:63) call: java.util.LinkedHashSet.<init>():void type: CONSTRUCTOR) : (r23v0 java.util.LinkedHashSet))
  (wrap:java.util.LinkedHashSet:?: TERNARY null = ((wrap:int:0x0032: ARITH (r37v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0038: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:64) call: java.util.LinkedHashSet.<init>():void type: CONSTRUCTOR) : (r24v0 java.util.LinkedHashSet))
  (wrap:java.util.LinkedHashSet:?: TERNARY null = ((wrap:int:0x003e: ARITH (r37v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0044: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:65) call: java.util.LinkedHashSet.<init>():void type: CONSTRUCTOR) : (r25v0 java.util.LinkedHashSet))
  (wrap:java.util.LinkedHashSet:?: TERNARY null = ((wrap:int:0x004a: ARITH (r37v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0050: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:66) call: java.util.LinkedHashSet.<init>():void type: CONSTRUCTOR) : (r26v0 java.util.LinkedHashSet))
  (wrap:java.util.LinkedHashSet:?: TERNARY null = ((wrap:int:0x0056: ARITH (r37v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x005c: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:67) call: java.util.LinkedHashSet.<init>():void type: CONSTRUCTOR) : (r27v0 java.util.LinkedHashSet))
  (wrap:java.util.LinkedHashSet:?: TERNARY null = ((wrap:int:0x0062: ARITH (r37v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0068: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:68) call: java.util.LinkedHashSet.<init>():void type: CONSTRUCTOR) : (r28v0 java.util.LinkedHashSet))
  (wrap:java.util.LinkedHashSet:?: TERNARY null = ((wrap:int:0x006e: ARITH (r37v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0074: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:69) call: java.util.LinkedHashSet.<init>():void type: CONSTRUCTOR) : (r29v0 java.util.LinkedHashSet))
  (wrap:java.util.LinkedHashSet:?: TERNARY null = ((wrap:int:0x007a: ARITH (r37v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0080: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:70) call: java.util.LinkedHashSet.<init>():void type: CONSTRUCTOR) : (r30v0 java.util.LinkedHashSet))
  (wrap:java.util.LinkedHashSet:?: TERNARY null = ((wrap:int:0x0086: ARITH (r37v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x008c: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:71) call: java.util.LinkedHashSet.<init>():void type: CONSTRUCTOR) : (r31v0 java.util.LinkedHashSet))
  (wrap:java.util.LinkedHashSet:?: TERNARY null = ((wrap:int:0x0092: ARITH (r37v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0098: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:72) call: java.util.LinkedHashSet.<init>():void type: CONSTRUCTOR) : (r32v0 java.util.LinkedHashSet))
  (wrap:java.util.LinkedHashSet:?: TERNARY null = ((wrap:int:0x009e: ARITH (r37v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x00a4: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:73) call: java.util.LinkedHashSet.<init>():void type: CONSTRUCTOR) : (r33v0 java.util.LinkedHashSet))
  (wrap:java.util.LinkedHashSet:?: TERNARY null = ((wrap:int:0x00aa: ARITH (r37v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x00b0: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:74) call: java.util.LinkedHashSet.<init>():void type: CONSTRUCTOR) : (r34v0 java.util.LinkedHashSet))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x00b9: ARITH (r37v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? false : (r35v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x00c6: ARITH (r37v0 int) & (65536 int) A[WRAPPED]) == (0 int)) ? (r36v0 boolean) : false)
 A[MD:(java.util.LinkedHashSet<com.okinc.kyc.api.biz.restriction.OKComplianceRestrictionService$Feature>, java.util.LinkedHashSet<com.okinc.kyc.api.biz.restriction.OKComplianceRestrictionService$Feature>, java.util.LinkedHashSet<com.okinc.kyc.api.biz.restriction.OKComplianceRestrictionService$Feature>, java.util.LinkedHashSet<com.okinc.kyc.api.biz.restriction.OKComplianceRestrictionService$Feature>, java.util.LinkedHashSet<com.okinc.kyc.api.biz.restriction.OKComplianceRestrictionService$Feature>, java.util.LinkedHashSet<com.okinc.kyc.api.biz.restriction.OKComplianceRestrictionService$Feature>, java.util.LinkedHashSet<com.okinc.kyc.api.biz.restriction.OKComplianceRestrictionService$Feature>, java.util.LinkedHashSet<com.okinc.kyc.api.biz.restriction.OKComplianceRestrictionService$Feature>, java.util.LinkedHashSet<com.okinc.kyc.api.biz.restriction.OKComplianceRestrictionService$Feature>, java.util.LinkedHashSet<com.okinc.kyc.api.biz.restriction.OKComplianceRestrictionService$Feature>, java.util.LinkedHashSet<com.okinc.kyc.api.biz.restriction.OKComplianceRestrictionService$Feature>, java.util.LinkedHashSet<com.okinc.kyc.api.biz.restriction.OKComplianceRestrictionService$Feature>, java.util.LinkedHashSet<com.okinc.kyc.api.biz.restriction.OKComplianceRestrictionService$Mode>, java.util.LinkedHashSet<com.okinc.kyc.api.biz.restriction.OKComplianceRestrictionService$Mode>, java.util.LinkedHashSet<com.okinc.kyc.api.biz.restriction.OKComplianceRestrictionService$Mode>, boolean, boolean):void (m)] (LINE:59) call: com.okinc.kyc.api.biz.restriction.FeatureRestrictionDiffSet.<init>(java.util.LinkedHashSet, java.util.LinkedHashSet, java.util.LinkedHashSet, java.util.LinkedHashSet, java.util.LinkedHashSet, java.util.LinkedHashSet, java.util.LinkedHashSet, java.util.LinkedHashSet, java.util.LinkedHashSet, java.util.LinkedHashSet, java.util.LinkedHashSet, java.util.LinkedHashSet, java.util.LinkedHashSet, java.util.LinkedHashSet, java.util.LinkedHashSet, boolean, boolean):void type: THIS */
    public /* synthetic */ FeatureRestrictionDiffSet(LinkedHashSet linkedHashSet, LinkedHashSet linkedHashSet2, LinkedHashSet linkedHashSet3, LinkedHashSet linkedHashSet4, LinkedHashSet linkedHashSet5, LinkedHashSet linkedHashSet6, LinkedHashSet linkedHashSet7, LinkedHashSet linkedHashSet8, LinkedHashSet linkedHashSet9, LinkedHashSet linkedHashSet10, LinkedHashSet linkedHashSet11, LinkedHashSet linkedHashSet12, LinkedHashSet linkedHashSet13, LinkedHashSet linkedHashSet14, LinkedHashSet linkedHashSet15, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new LinkedHashSet() : linkedHashSet, (i & 2) != 0 ? new LinkedHashSet() : linkedHashSet2, (i & 4) != 0 ? new LinkedHashSet() : linkedHashSet3, (i & 8) != 0 ? new LinkedHashSet() : linkedHashSet4, (i & 16) != 0 ? new LinkedHashSet() : linkedHashSet5, (i & 32) != 0 ? new LinkedHashSet() : linkedHashSet6, (i & 64) != 0 ? new LinkedHashSet() : linkedHashSet7, (i & 128) != 0 ? new LinkedHashSet() : linkedHashSet8, (i & 256) != 0 ? new LinkedHashSet() : linkedHashSet9, (i & 512) != 0 ? new LinkedHashSet() : linkedHashSet10, (i & 1024) != 0 ? new LinkedHashSet() : linkedHashSet11, (i & 2048) != 0 ? new LinkedHashSet() : linkedHashSet12, (i & 4096) != 0 ? new LinkedHashSet() : linkedHashSet13, (i & 8192) != 0 ? new LinkedHashSet() : linkedHashSet14, (i & 16384) != 0 ? new LinkedHashSet() : linkedHashSet15, (i & 32768) != 0 ? false : z, (i & 65536) == 0 ? z2 : false);
    }
}
