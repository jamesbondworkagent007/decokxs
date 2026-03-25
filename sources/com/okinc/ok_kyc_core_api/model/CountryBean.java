package com.okinc.ok_kyc_core_api.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.text.Normalizer;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import o.C59449zhJ;
import o.pUU;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Marker;

/* JADX INFO: loaded from: classes19.dex */
@Serializable
public final class CountryBean {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: loaded from: classes23.dex */
    public static final class CountryAreaCode {
        public static final int $stable = 8;
        private String areaCode = "";
        private String areaName = "";
        private String countryCode = "";
        private int userId;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getAreaCode() {
            return this.areaCode;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getAreaName() {
            return this.areaName;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getCountryCode() {
            return this.countryCode;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int getUserId() {
            return this.userId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setAreaCode(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.areaCode = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setAreaName(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.areaName = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setCountryCode(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.countryCode = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setUserId(int i) {
            this.userId = i;
        }
    }

    public static final /* synthetic */ void write$Self$OKCompliance_ok_compliance_api(CountryBean countryBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.ok_kyc_core_api.model.CountryBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CountryBean> serializer() {
            return CountryBean$$serializer.INSTANCE;
        }
    }

    public CountryBean() {
    }

    public /* synthetic */ CountryBean(int i, SerializationConstructorMarker serializationConstructorMarker) {
    }

    /* JADX INFO: loaded from: classes23.dex */
    public static final class AreaResp {
        public static final int $stable = 8;
        private ArrayList<CountryAreaCode> areaList = new ArrayList<>();
        private int errorCode;
        private boolean result;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ArrayList<CountryAreaCode> getAreaList() {
            return this.areaList;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int getErrorCode() {
            return this.errorCode;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean getResult() {
            return this.result;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setAreaList(ArrayList<CountryAreaCode> arrayList) {
            this.areaList = arrayList;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setErrorCode(int i) {
            this.errorCode = i;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setResult(boolean z) {
            this.result = z;
        }

        public final ArrayList<Country> toCountryList() {
            ArrayList<Country> arrayList = new ArrayList<>();
            ArrayList<CountryAreaCode> arrayList2 = this.areaList;
            if (arrayList2 == null) {
                return arrayList;
            }
            Intrinsics.copydefault(arrayList2);
            Iterator<CountryAreaCode> it = arrayList2.iterator();
            Intrinsics.checkNotNullExpressionValue(it, "");
            while (it.hasNext()) {
                CountryAreaCode next = it.next();
                Intrinsics.checkNotNullExpressionValue(next, "");
                CountryAreaCode countryAreaCode = next;
                Country country = new Country();
                country.setTelephoneCode(countryAreaCode.getAreaCode());
                country.setChineseName(countryAreaCode.getAreaName());
                country.setTraditionalName(countryAreaCode.getAreaName());
                country.setCommonName(countryAreaCode.getAreaName());
                arrayList.add(country);
            }
            return arrayList;
        }
    }

    /* JADX INFO: loaded from: classes16.dex */
    public static final class Country implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Country> CREATOR = new Creator();
        private boolean disablePrefill;
        private boolean isTitle;
        private boolean showProvince;
        private int telStatus;
        private String chineseName = "";
        private String chinesePhoneticize = "";
        private String traditionalName = "";
        private String countryPinyin = "";
        private String commonName = "";
        private String displayName = "";
        private boolean enable = true;
        private String formalName = "";
        private String id = "";
        private String localName = "";
        private String nationalFlag = "";
        private String startChar = "";
        private String telephoneCode = "";
        private String title = "";
        private String countryFlagUrl = "";

        /* JADX INFO: loaded from: classes19.dex */
        public static final class Creator implements Parcelable.Creator<Country> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Country createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                return new Country();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Country[] newArray(int i) {
                return new Country[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getChineseName() {
            return this.chineseName;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getChinesePhoneticize() {
            return this.chinesePhoneticize;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getCommonName() {
            return this.commonName;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getCountryFlagUrl() {
            return this.countryFlagUrl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getCountryPinyin() {
            return this.countryPinyin;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean getDisablePrefill() {
            return this.disablePrefill;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getDisplayName() {
            return this.displayName;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean getEnable() {
            return this.enable;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getFormalName() {
            return this.formalName;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getId() {
            return this.id;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getLocalName() {
            return this.localName;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getNationalFlag() {
            return this.nationalFlag;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean getShowProvince() {
            return this.showProvince;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getStartChar() {
            return this.startChar;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int getTelStatus() {
            return this.telStatus;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getTelephoneCode() {
            return this.telephoneCode;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getTitle() {
            return this.title;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getTraditionalName() {
            return this.traditionalName;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean isTitle() {
            return this.isTitle;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setChineseName(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.chineseName = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setChinesePhoneticize(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.chinesePhoneticize = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setCommonName(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.commonName = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setCountryFlagUrl(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.countryFlagUrl = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setCountryPinyin(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.countryPinyin = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setDisablePrefill(boolean z) {
            this.disablePrefill = z;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setDisplayName(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.displayName = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setEnable(boolean z) {
            this.enable = z;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setFormalName(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.formalName = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setId(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.id = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setLocalName(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.localName = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setNationalFlag(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.nationalFlag = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setShowProvince(boolean z) {
            this.showProvince = z;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setStartChar(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.startChar = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setTelStatus(int i) {
            this.telStatus = i;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setTelephoneCode(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.telephoneCode = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setTitle(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.title = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setTitle(boolean z) {
            this.isTitle = z;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setTraditionalName(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.traditionalName = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeInt(1);
        }

        public final boolean isMatch(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return StringsKt__StringsKt.AhwBna((CharSequence) this.displayName, (CharSequence) str, true) || StringsKt__StringsKt.AhwBna((CharSequence) removeAccents(this.displayName), (CharSequence) str, true) || StringsKt__StringsKt.AhwBna((CharSequence) this.formalName, (CharSequence) str, true) || StringsKt__StringsKt.AhwBna((CharSequence) this.localName, (CharSequence) str, true) || StringsKt__StringsKt.AhwBna((CharSequence) this.id, (CharSequence) str, true) || C59449zhJ.AYXKKw(removePlus(this.telephoneCode), removePlus(str), true) || StringsKt__StringsKt.AhwBna((CharSequence) this.chineseName, (CharSequence) str, true);
        }

        public final int sortingOrder(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return StringsKt__StringsKt.AhwBna((CharSequence) this.displayName, (CharSequence) str, true) ? 0 : Integer.MAX_VALUE;
        }

        public final int sortingOrder(@NotNull String str, @NotNull Country country) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(country, "");
            boolean zAYXKKw = C59449zhJ.AYXKKw(this.displayName, str, true);
            boolean zAYXKKw2 = C59449zhJ.AYXKKw(country.displayName, str, true);
            if (zAYXKKw && !zAYXKKw2) {
                return -1;
            }
            if (zAYXKKw || !zAYXKKw2) {
                return C59449zhJ.OLrzqt(this.displayName, country.displayName, true);
            }
            return 1;
        }

        public final String removeAccents(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            try {
                String strNormalize = Normalizer.normalize(str, Normalizer.Form.NFKD);
                Intrinsics.copydefault((Object) strNormalize);
                return new Regex("\\p{M}").replace(strNormalize, "");
            } catch (Exception unused) {
                pUU.KWHzl("Compliance_Country_error", str);
                return str;
            }
        }

        private final String removePlus(String str) {
            return C59449zhJ.KWHzl(str, Marker.ANY_NON_NULL_MARKER, "", true);
        }
    }
}
