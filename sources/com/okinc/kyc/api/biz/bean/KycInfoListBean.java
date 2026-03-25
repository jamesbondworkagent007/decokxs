package com.okinc.kyc.api.biz.bean;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.util.Iterator;
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
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes9.dex */
@Serializable
public final class KycInfoListBean implements java.io.Serializable {
    private CompanyBean company;
    private PersonalBean personal;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CompanyBean getCompany() {
        return this.company;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PersonalBean getPersonal() {
        return this.personal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCompany(CompanyBean companyBean) {
        this.company = companyBean;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPersonal(PersonalBean personalBean) {
        this.personal = personalBean;
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.kyc.api.biz.bean.KycInfoListBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<KycInfoListBean> serializer() {
            return KycInfoListBean$$serializer.INSTANCE;
        }
    }

    public KycInfoListBean() {
    }

    public /* synthetic */ KycInfoListBean(int i, PersonalBean personalBean, CompanyBean companyBean, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.personal = null;
        } else {
            this.personal = personalBean;
        }
        if ((i & 2) == 0) {
            this.company = null;
        } else {
            this.company = companyBean;
        }
    }

    public static final /* synthetic */ void write$Self$OKCompliance_ok_compliance_api(KycInfoListBean kycInfoListBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || kycInfoListBean.personal != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, KycInfoListBean$PersonalBean$$serializer.INSTANCE, kycInfoListBean.personal);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && kycInfoListBean.company == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, KycInfoListBean$CompanyBean$$serializer.INSTANCE, kycInfoListBean.company);
    }

    public final int getLevel() {
        PersonalBean personalBean = this.personal;
        if (personalBean != null) {
            Intrinsics.copydefault(personalBean);
            return personalBean.getLevel();
        }
        CompanyBean companyBean = this.company;
        if (companyBean == null) {
            return 0;
        }
        Intrinsics.copydefault(companyBean);
        return companyBean.getLevel();
    }

    public final String getTagStr() {
        PersonalBean personalBean = this.personal;
        if (personalBean != null) {
            if (personalBean != null) {
                return personalBean.getTagStr();
            }
            return null;
        }
        CompanyBean companyBean = this.company;
        if (companyBean == null || companyBean == null) {
            return null;
        }
        return companyBean.getTagStr();
    }

    public final String getSubKyc() {
        List<PersonalBean.KycInfoBean> kycInfo;
        PersonalBean.KycInfoBean kycInfoBean;
        List<PersonalBean.KycInfoBean> kycInfo2;
        Object next;
        PersonalBean personalBean = this.personal;
        if (personalBean == null || personalBean == null || (kycInfo = personalBean.getKycInfo()) == null || !(!kycInfo.isEmpty())) {
            return null;
        }
        PersonalBean personalBean2 = this.personal;
        if (personalBean2 == null || (kycInfo2 = personalBean2.getKycInfo()) == null) {
            kycInfoBean = null;
        } else {
            Iterator<T> it = kycInfo2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((PersonalBean.KycInfoBean) next).getLevel() == 1) {
                    break;
                }
            }
            kycInfoBean = (PersonalBean.KycInfoBean) next;
        }
        if (kycInfoBean == null) {
            return null;
        }
        JsonElement jsonElement = new JsonParser().parse(kycInfoBean.getInfo());
        Intrinsics.copydefault(jsonElement, "");
        JsonElement jsonElement2 = ((JsonObject) jsonElement).get("subKyc");
        if (jsonElement2 != null) {
            return jsonElement2.getAsString();
        }
        return null;
    }

    public final Integer getTagType() {
        PersonalBean personalBean = this.personal;
        if (personalBean != null) {
            if (personalBean != null) {
                return personalBean.getTagType();
            }
            return null;
        }
        CompanyBean companyBean = this.company;
        if (companyBean == null || companyBean == null) {
            return null;
        }
        return companyBean.getTagType();
    }

    public final String getKycName() {
        List<PersonalBean.KycInfoBean> kycInfo;
        PersonalBean.KycInfoBean kycInfoBean;
        PersonalBean.KycInfoBean kycInfoBean2;
        List<PersonalBean.KycInfoBean> kycInfo2;
        Object next;
        List<PersonalBean.KycInfoBean> kycInfo3;
        Object next2;
        PersonalBean personalBean = this.personal;
        if (personalBean != null && personalBean != null && (kycInfo = personalBean.getKycInfo()) != null && (!kycInfo.isEmpty())) {
            PersonalBean personalBean2 = this.personal;
            if (personalBean2 == null || (kycInfo3 = personalBean2.getKycInfo()) == null) {
                kycInfoBean = null;
            } else {
                Iterator<T> it = kycInfo3.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it.next();
                    if (((PersonalBean.KycInfoBean) next2).getLevel() == 2) {
                        break;
                    }
                }
                kycInfoBean = (PersonalBean.KycInfoBean) next2;
            }
            PersonalBean personalBean3 = this.personal;
            if (personalBean3 == null || (kycInfo2 = personalBean3.getKycInfo()) == null) {
                kycInfoBean2 = null;
            } else {
                Iterator<T> it2 = kycInfo2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it2.next();
                    if (((PersonalBean.KycInfoBean) next).getLevel() == 1) {
                        break;
                    }
                }
                kycInfoBean2 = (PersonalBean.KycInfoBean) next;
            }
            if (kycInfoBean != null && kycInfoBean.getLevelFlag() == 2 && kycInfoBean2 != null && kycInfoBean2.getLevelFlag() != 3) {
                JsonElement jsonElement = new JsonParser().parse(kycInfoBean2.getInfo());
                Intrinsics.copydefault(jsonElement, "");
                JsonObject jsonObject = (JsonObject) jsonElement;
                PersonalBean personalBean4 = this.personal;
                if (Intrinsics.EZpvd((Object) (personalBean4 != null ? personalBean4.getCountryId() : null), (Object) "CN")) {
                    JsonElement jsonElement2 = jsonObject.get("fullName");
                    if (jsonElement2 != null) {
                        return jsonElement2.getAsString();
                    }
                    return null;
                }
                JsonElement jsonElement3 = jsonObject.get("firstName");
                String asString = jsonElement3 != null ? jsonElement3.getAsString() : null;
                JsonElement jsonElement4 = jsonObject.get("lastName");
                return asString + " " + (jsonElement4 != null ? jsonElement4.getAsString() : null);
            }
        }
        return null;
    }

    public final Integer getEntityId() {
        PersonalBean personalBean = this.personal;
        if (personalBean != null) {
            if (personalBean != null) {
                return personalBean.getSubjectType();
            }
            return null;
        }
        CompanyBean companyBean = this.company;
        if (companyBean == null || companyBean == null) {
            return null;
        }
        return companyBean.getSubjectType();
    }

    @Serializable
    public static final class PersonalBean implements java.io.Serializable {
        private boolean authStatus;
        private boolean bindBankCardFlag;
        private int birthDayLock;
        private String certificateType;
        private String country;
        private String countryId;
        private String currentCountry;
        private Detection detection;
        private int enforceId;
        private int extraLock;
        private int extraStatus;
        private Integer formType;
        private Integer includeAddress;
        private int isLimitCountry;
        private List<KycInfoBean> kycInfo;
        private int level;
        private boolean leverSwitchFlag;
        private boolean manualFlag;
        private int netCount;
        private boolean newView;
        private boolean reAuthFlag;
        private int reAuthTimes;
        private int riskLevel;
        private Integer subjectType;
        private String tagStr;
        private Integer tagType;
        private boolean updateKycInfo;
        private int vendorType;
        public static final Companion Companion = new Companion(null);
        public static final int $stable = 8;
        private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, null, null, null, null, null, null, new ArrayListSerializer(KycInfoListBean$PersonalBean$KycInfoBean$$serializer.INSTANCE), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null};

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean getAuthStatus() {
            return this.authStatus;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean getBindBankCardFlag() {
            return this.bindBankCardFlag;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int getBirthDayLock() {
            return this.birthDayLock;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getCertificateType() {
            return this.certificateType;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getCountry() {
            return this.country;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getCountryId() {
            return this.countryId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getCurrentCountry() {
            return this.currentCountry;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Detection getDetection() {
            return this.detection;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int getEnforceId() {
            return this.enforceId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int getExtraLock() {
            return this.extraLock;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int getExtraStatus() {
            return this.extraStatus;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Integer getFormType() {
            return this.formType;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Integer getIncludeAddress() {
            return this.includeAddress;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<KycInfoBean> getKycInfo() {
            return this.kycInfo;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int getLevel() {
            return this.level;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean getLeverSwitchFlag() {
            return this.leverSwitchFlag;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean getManualFlag() {
            return this.manualFlag;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int getNetCount() {
            return this.netCount;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean getNewView() {
            return this.newView;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean getReAuthFlag() {
            return this.reAuthFlag;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int getReAuthTimes() {
            return this.reAuthTimes;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int getRiskLevel() {
            return this.riskLevel;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Integer getSubjectType() {
            return this.subjectType;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getTagStr() {
            return this.tagStr;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Integer getTagType() {
            return this.tagType;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean getUpdateKycInfo() {
            return this.updateKycInfo;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int getVendorType() {
            return this.vendorType;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int isLimitCountry() {
            return this.isLimitCountry;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setAuthStatus(boolean z) {
            this.authStatus = z;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setBindBankCardFlag(boolean z) {
            this.bindBankCardFlag = z;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setBirthDayLock(int i) {
            this.birthDayLock = i;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setCertificateType(String str) {
            this.certificateType = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setCountry(String str) {
            this.country = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setCountryId(String str) {
            this.countryId = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setCurrentCountry(String str) {
            this.currentCountry = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setDetection(Detection detection) {
            this.detection = detection;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setEnforceId(int i) {
            this.enforceId = i;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setExtraLock(int i) {
            this.extraLock = i;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setExtraStatus(int i) {
            this.extraStatus = i;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setFormType(Integer num) {
            this.formType = num;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setIncludeAddress(Integer num) {
            this.includeAddress = num;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setKycInfo(List<KycInfoBean> list) {
            this.kycInfo = list;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setLevel(int i) {
            this.level = i;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setLeverSwitchFlag(boolean z) {
            this.leverSwitchFlag = z;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setLimitCountry(int i) {
            this.isLimitCountry = i;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setManualFlag(boolean z) {
            this.manualFlag = z;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setNetCount(int i) {
            this.netCount = i;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setNewView(boolean z) {
            this.newView = z;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setReAuthFlag(boolean z) {
            this.reAuthFlag = z;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setReAuthTimes(int i) {
            this.reAuthTimes = i;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setRiskLevel(int i) {
            this.riskLevel = i;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setSubjectType(Integer num) {
            this.subjectType = num;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setTagStr(String str) {
            this.tagStr = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setTagType(Integer num) {
            this.tagType = num;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setUpdateKycInfo(boolean z) {
            this.updateKycInfo = z;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setVendorType(int i) {
            this.vendorType = i;
        }

        public static final class Companion {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private Companion() {
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.kyc.api.biz.bean.KycInfoListBean.PersonalBean.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<PersonalBean> serializer() {
                return KycInfoListBean$PersonalBean$$serializer.INSTANCE;
            }
        }

        public PersonalBean() {
            this.leverSwitchFlag = true;
            this.isLimitCountry = -1;
            this.country = "";
            this.certificateType = "";
            this.currentCountry = "";
            this.extraStatus = 1;
        }

        public /* synthetic */ PersonalBean(int i, String str, Integer num, String str2, boolean z, boolean z2, boolean z3, int i2, boolean z4, int i3, int i4, boolean z5, int i5, List list, boolean z6, boolean z7, Integer num2, Integer num3, Integer num4, int i6, int i7, Detection detection, int i8, int i9, String str3, String str4, String str5, int i10, int i11, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.tagStr = null;
            } else {
                this.tagStr = str;
            }
            if ((i & 2) == 0) {
                this.tagType = null;
            } else {
                this.tagType = num;
            }
            if ((i & 4) == 0) {
                this.countryId = null;
            } else {
                this.countryId = str2;
            }
            if ((i & 8) == 0) {
                this.newView = false;
            } else {
                this.newView = z;
            }
            if ((i & 16) == 0) {
                this.manualFlag = false;
            } else {
                this.manualFlag = z2;
            }
            if ((i & 32) == 0) {
                this.reAuthFlag = false;
            } else {
                this.reAuthFlag = z3;
            }
            if ((i & 64) == 0) {
                this.reAuthTimes = 0;
            } else {
                this.reAuthTimes = i2;
            }
            if ((i & 128) == 0) {
                this.leverSwitchFlag = true;
            } else {
                this.leverSwitchFlag = z4;
            }
            if ((i & 256) == 0) {
                this.netCount = 0;
            } else {
                this.netCount = i3;
            }
            if ((i & 512) == 0) {
                this.vendorType = 0;
            } else {
                this.vendorType = i4;
            }
            if ((i & 1024) == 0) {
                this.updateKycInfo = false;
            } else {
                this.updateKycInfo = z5;
            }
            this.isLimitCountry = (i & 2048) == 0 ? -1 : i5;
            if ((i & 4096) == 0) {
                this.kycInfo = null;
            } else {
                this.kycInfo = list;
            }
            if ((i & 8192) == 0) {
                this.bindBankCardFlag = false;
            } else {
                this.bindBankCardFlag = z6;
            }
            if ((i & 16384) == 0) {
                this.authStatus = false;
            } else {
                this.authStatus = z7;
            }
            if ((32768 & i) == 0) {
                this.subjectType = null;
            } else {
                this.subjectType = num2;
            }
            if ((65536 & i) == 0) {
                this.formType = null;
            } else {
                this.formType = num3;
            }
            if ((131072 & i) == 0) {
                this.includeAddress = null;
            } else {
                this.includeAddress = num4;
            }
            if ((262144 & i) == 0) {
                this.level = 0;
            } else {
                this.level = i6;
            }
            if ((524288 & i) == 0) {
                this.enforceId = 0;
            } else {
                this.enforceId = i7;
            }
            if ((1048576 & i) == 0) {
                this.detection = null;
            } else {
                this.detection = detection;
            }
            if ((2097152 & i) == 0) {
                this.birthDayLock = 0;
            } else {
                this.birthDayLock = i8;
            }
            if ((4194304 & i) == 0) {
                this.riskLevel = 0;
            } else {
                this.riskLevel = i9;
            }
            if ((8388608 & i) == 0) {
                this.country = "";
            } else {
                this.country = str3;
            }
            if ((16777216 & i) == 0) {
                this.certificateType = "";
            } else {
                this.certificateType = str4;
            }
            if ((33554432 & i) == 0) {
                this.currentCountry = "";
            } else {
                this.currentCountry = str5;
            }
            if ((67108864 & i) == 0) {
                this.extraStatus = 1;
            } else {
                this.extraStatus = i10;
            }
            if ((i & 134217728) == 0) {
                this.extraLock = 0;
            } else {
                this.extraLock = i11;
            }
        }

        public static final /* synthetic */ void write$Self$OKCompliance_ok_compliance_api(PersonalBean personalBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            KSerializer<Object>[] kSerializerArr = $childSerializers;
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || personalBean.tagStr != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, personalBean.tagStr);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || personalBean.tagType != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, IntSerializer.INSTANCE, personalBean.tagType);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || personalBean.countryId != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, personalBean.countryId);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || personalBean.newView) {
                compositeEncoder.encodeBooleanElement(serialDescriptor, 3, personalBean.newView);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || personalBean.manualFlag) {
                compositeEncoder.encodeBooleanElement(serialDescriptor, 4, personalBean.manualFlag);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || personalBean.reAuthFlag) {
                compositeEncoder.encodeBooleanElement(serialDescriptor, 5, personalBean.reAuthFlag);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || personalBean.reAuthTimes != 0) {
                compositeEncoder.encodeIntElement(serialDescriptor, 6, personalBean.reAuthTimes);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !personalBean.leverSwitchFlag) {
                compositeEncoder.encodeBooleanElement(serialDescriptor, 7, personalBean.leverSwitchFlag);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || personalBean.netCount != 0) {
                compositeEncoder.encodeIntElement(serialDescriptor, 8, personalBean.netCount);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || personalBean.vendorType != 0) {
                compositeEncoder.encodeIntElement(serialDescriptor, 9, personalBean.vendorType);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || personalBean.updateKycInfo) {
                compositeEncoder.encodeBooleanElement(serialDescriptor, 10, personalBean.updateKycInfo);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || personalBean.isLimitCountry != -1) {
                compositeEncoder.encodeIntElement(serialDescriptor, 11, personalBean.isLimitCountry);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || personalBean.kycInfo != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, kSerializerArr[12], personalBean.kycInfo);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || personalBean.bindBankCardFlag) {
                compositeEncoder.encodeBooleanElement(serialDescriptor, 13, personalBean.bindBankCardFlag);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || personalBean.authStatus) {
                compositeEncoder.encodeBooleanElement(serialDescriptor, 14, personalBean.authStatus);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || personalBean.subjectType != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 15, IntSerializer.INSTANCE, personalBean.subjectType);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || personalBean.formType != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 16, IntSerializer.INSTANCE, personalBean.formType);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || personalBean.includeAddress != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 17, IntSerializer.INSTANCE, personalBean.includeAddress);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) || personalBean.level != 0) {
                compositeEncoder.encodeIntElement(serialDescriptor, 18, personalBean.level);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 19) || personalBean.enforceId != 0) {
                compositeEncoder.encodeIntElement(serialDescriptor, 19, personalBean.enforceId);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 20) || personalBean.detection != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 20, KycInfoListBean$PersonalBean$Detection$$serializer.INSTANCE, personalBean.detection);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 21) || personalBean.birthDayLock != 0) {
                compositeEncoder.encodeIntElement(serialDescriptor, 21, personalBean.birthDayLock);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 22) || personalBean.riskLevel != 0) {
                compositeEncoder.encodeIntElement(serialDescriptor, 22, personalBean.riskLevel);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 23) || !Intrinsics.EZpvd((Object) personalBean.country, (Object) "")) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 23, StringSerializer.INSTANCE, personalBean.country);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 24) || !Intrinsics.EZpvd((Object) personalBean.certificateType, (Object) "")) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 24, StringSerializer.INSTANCE, personalBean.certificateType);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 25) || !Intrinsics.EZpvd((Object) personalBean.currentCountry, (Object) "")) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 25, StringSerializer.INSTANCE, personalBean.currentCountry);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 26) || personalBean.extraStatus != 1) {
                compositeEncoder.encodeIntElement(serialDescriptor, 26, personalBean.extraStatus);
            }
            if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 27) && personalBean.extraLock == 0) {
                return;
            }
            compositeEncoder.encodeIntElement(serialDescriptor, 27, personalBean.extraLock);
        }

        /* JADX INFO: loaded from: classes16.dex */
        @Serializable
        public static final class Detection implements java.io.Serializable {
            private int enforceId;
            private int freezeTransactions;
            private int shield;
            public static final Companion Companion = new Companion(null);
            public static final int $stable = 8;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final int getEnforceId() {
                return this.enforceId;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final int getFreezeTransactions() {
                return this.freezeTransactions;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final int getShield() {
                return this.shield;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final void setEnforceId(int i) {
                this.enforceId = i;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final void setFreezeTransactions(int i) {
                this.freezeTransactions = i;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final void setShield(int i) {
                this.shield = i;
            }

            /* JADX INFO: loaded from: classes23.dex */
            public static final class Companion {
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                private Companion() {
                }

                /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.kyc.api.biz.bean.KycInfoListBean.PersonalBean.Detection.Companion.<init>():void type: THIS */
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final KSerializer<Detection> serializer() {
                    return KycInfoListBean$PersonalBean$Detection$$serializer.INSTANCE;
                }
            }

            public Detection() {
            }

            public /* synthetic */ Detection(int i, int i2, int i3, int i4, SerializationConstructorMarker serializationConstructorMarker) {
                if ((i & 1) == 0) {
                    this.shield = 0;
                } else {
                    this.shield = i2;
                }
                if ((i & 2) == 0) {
                    this.freezeTransactions = 0;
                } else {
                    this.freezeTransactions = i3;
                }
                if ((i & 4) == 0) {
                    this.enforceId = 0;
                } else {
                    this.enforceId = i4;
                }
            }

            public static final /* synthetic */ void write$Self$OKCompliance_ok_compliance_api(Detection detection, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
                if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || detection.shield != 0) {
                    compositeEncoder.encodeIntElement(serialDescriptor, 0, detection.shield);
                }
                if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || detection.freezeTransactions != 0) {
                    compositeEncoder.encodeIntElement(serialDescriptor, 1, detection.freezeTransactions);
                }
                if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && detection.enforceId == 0) {
                    return;
                }
                compositeEncoder.encodeIntElement(serialDescriptor, 2, detection.enforceId);
            }
        }

        @Serializable
        public static final class KycInfoBean implements java.io.Serializable {
            private final String corKey;
            private int faceStatus;
            private String failReason;
            private String info;
            private long kycId;
            private int level;
            private int levelFlag;
            private String passTip1;
            private String passTip2;
            public static final Companion Companion = new Companion(null);
            public static final int $stable = 8;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final int getFaceStatus() {
                return this.faceStatus;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String getFailReason() {
                return this.failReason;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String getInfo() {
                return this.info;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final long getKycId() {
                return this.kycId;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final int getLevel() {
                return this.level;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final int getLevelFlag() {
                return this.levelFlag;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String getPassTip1() {
                return this.passTip1;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String getPassTip2() {
                return this.passTip2;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final void setFaceStatus(int i) {
                this.faceStatus = i;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final void setFailReason(String str) {
                this.failReason = str;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final void setInfo(String str) {
                this.info = str;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final void setKycId(long j) {
                this.kycId = j;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final void setLevel(int i) {
                this.level = i;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final void setLevelFlag(int i) {
                this.levelFlag = i;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final void setPassTip1(String str) {
                this.passTip1 = str;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final void setPassTip2(String str) {
                this.passTip2 = str;
            }

            public static final class Companion {
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                private Companion() {
                }

                /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.kyc.api.biz.bean.KycInfoListBean.PersonalBean.KycInfoBean.Companion.<init>():void type: THIS */
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final KSerializer<KycInfoBean> serializer() {
                    return KycInfoListBean$PersonalBean$KycInfoBean$$serializer.INSTANCE;
                }
            }

            public KycInfoBean() {
                this.corKey = "currentCountry";
                this.kycId = -1L;
                this.level = -1;
                this.levelFlag = -1;
                this.faceStatus = -1;
                this.passTip1 = "";
                this.passTip2 = "";
            }

            public /* synthetic */ KycInfoBean(int i, String str, long j, int i2, int i3, int i4, String str2, String str3, String str4, String str5, SerializationConstructorMarker serializationConstructorMarker) {
                this.corKey = (i & 1) == 0 ? "currentCountry" : str;
                if ((i & 2) == 0) {
                    this.kycId = -1L;
                } else {
                    this.kycId = j;
                }
                if ((i & 4) == 0) {
                    this.level = -1;
                } else {
                    this.level = i2;
                }
                if ((i & 8) == 0) {
                    this.levelFlag = -1;
                } else {
                    this.levelFlag = i3;
                }
                if ((i & 16) == 0) {
                    this.faceStatus = -1;
                } else {
                    this.faceStatus = i4;
                }
                if ((i & 32) == 0) {
                    this.info = null;
                } else {
                    this.info = str2;
                }
                if ((i & 64) == 0) {
                    this.passTip1 = "";
                } else {
                    this.passTip1 = str3;
                }
                if ((i & 128) == 0) {
                    this.passTip2 = "";
                } else {
                    this.passTip2 = str4;
                }
                if ((i & 256) == 0) {
                    this.failReason = null;
                } else {
                    this.failReason = str5;
                }
            }

            public static final /* synthetic */ void write$Self$OKCompliance_ok_compliance_api(KycInfoBean kycInfoBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
                if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) kycInfoBean.corKey, (Object) "currentCountry")) {
                    compositeEncoder.encodeStringElement(serialDescriptor, 0, kycInfoBean.corKey);
                }
                if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || kycInfoBean.kycId != -1) {
                    compositeEncoder.encodeLongElement(serialDescriptor, 1, kycInfoBean.kycId);
                }
                if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || kycInfoBean.level != -1) {
                    compositeEncoder.encodeIntElement(serialDescriptor, 2, kycInfoBean.level);
                }
                if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || kycInfoBean.levelFlag != -1) {
                    compositeEncoder.encodeIntElement(serialDescriptor, 3, kycInfoBean.levelFlag);
                }
                if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || kycInfoBean.faceStatus != -1) {
                    compositeEncoder.encodeIntElement(serialDescriptor, 4, kycInfoBean.faceStatus);
                }
                if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || kycInfoBean.info != null) {
                    compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, kycInfoBean.info);
                }
                if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) kycInfoBean.passTip1, (Object) "")) {
                    compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, kycInfoBean.passTip1);
                }
                if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) kycInfoBean.passTip2, (Object) "")) {
                    compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, kycInfoBean.passTip2);
                }
                if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) && kycInfoBean.failReason == null) {
                    return;
                }
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, kycInfoBean.failReason);
            }
        }
    }

    @Serializable
    public static final class CompanyBean implements java.io.Serializable {
        private boolean authStatus;
        private List<KycInfoBean> kycInfo;
        private int level;
        private Integer subjectType;
        private String tagStr;
        private Integer tagType;
        private int type;
        public static final Companion Companion = new Companion(null);
        public static final int $stable = 8;
        private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, new ArrayListSerializer(KycInfoListBean$CompanyBean$KycInfoBean$$serializer.INSTANCE)};

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean getAuthStatus() {
            return this.authStatus;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<KycInfoBean> getKycInfo() {
            return this.kycInfo;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int getLevel() {
            return this.level;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Integer getSubjectType() {
            return this.subjectType;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getTagStr() {
            return this.tagStr;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Integer getTagType() {
            return this.tagType;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int getType() {
            return this.type;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setAuthStatus(boolean z) {
            this.authStatus = z;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setKycInfo(List<KycInfoBean> list) {
            this.kycInfo = list;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setLevel(int i) {
            this.level = i;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setSubjectType(Integer num) {
            this.subjectType = num;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setTagStr(String str) {
            this.tagStr = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setTagType(Integer num) {
            this.tagType = num;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setType(int i) {
            this.type = i;
        }

        public static final class Companion {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private Companion() {
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.kyc.api.biz.bean.KycInfoListBean.CompanyBean.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<CompanyBean> serializer() {
                return KycInfoListBean$CompanyBean$$serializer.INSTANCE;
            }
        }

        public CompanyBean() {
        }

        public /* synthetic */ CompanyBean(int i, Integer num, boolean z, int i2, int i3, Integer num2, String str, List list, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.subjectType = null;
            } else {
                this.subjectType = num;
            }
            if ((i & 2) == 0) {
                this.authStatus = false;
            } else {
                this.authStatus = z;
            }
            if ((i & 4) == 0) {
                this.type = 0;
            } else {
                this.type = i2;
            }
            if ((i & 8) == 0) {
                this.level = 0;
            } else {
                this.level = i3;
            }
            if ((i & 16) == 0) {
                this.tagType = null;
            } else {
                this.tagType = num2;
            }
            if ((i & 32) == 0) {
                this.tagStr = null;
            } else {
                this.tagStr = str;
            }
            if ((i & 64) == 0) {
                this.kycInfo = null;
            } else {
                this.kycInfo = list;
            }
        }

        public static final /* synthetic */ void write$Self$OKCompliance_ok_compliance_api(CompanyBean companyBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            KSerializer<Object>[] kSerializerArr = $childSerializers;
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || companyBean.subjectType != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, IntSerializer.INSTANCE, companyBean.subjectType);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || companyBean.authStatus) {
                compositeEncoder.encodeBooleanElement(serialDescriptor, 1, companyBean.authStatus);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || companyBean.type != 0) {
                compositeEncoder.encodeIntElement(serialDescriptor, 2, companyBean.type);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || companyBean.level != 0) {
                compositeEncoder.encodeIntElement(serialDescriptor, 3, companyBean.level);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || companyBean.tagType != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, IntSerializer.INSTANCE, companyBean.tagType);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || companyBean.tagStr != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, companyBean.tagStr);
            }
            if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) && companyBean.kycInfo == null) {
                return;
            }
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, kSerializerArr[6], companyBean.kycInfo);
        }

        @Serializable
        public static final class KycInfoBean implements java.io.Serializable {
            private String failReason;
            private String info;
            private int level;
            private int levelFlag;
            private Boolean showBindBankCardFlag;
            public static final Companion Companion = new Companion(null);
            public static final int $stable = 8;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String getFailReason() {
                return this.failReason;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String getInfo() {
                return this.info;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final int getLevel() {
                return this.level;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final int getLevelFlag() {
                return this.levelFlag;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Boolean getShowBindBankCardFlag() {
                return this.showBindBankCardFlag;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final void setFailReason(String str) {
                this.failReason = str;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final void setInfo(String str) {
                this.info = str;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final void setLevel(int i) {
                this.level = i;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final void setLevelFlag(int i) {
                this.levelFlag = i;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final void setShowBindBankCardFlag(Boolean bool) {
                this.showBindBankCardFlag = bool;
            }

            public static final class Companion {
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                private Companion() {
                }

                /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.kyc.api.biz.bean.KycInfoListBean.CompanyBean.KycInfoBean.Companion.<init>():void type: THIS */
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final KSerializer<KycInfoBean> serializer() {
                    return KycInfoListBean$CompanyBean$KycInfoBean$$serializer.INSTANCE;
                }
            }

            public KycInfoBean() {
                this.level = -1;
                this.levelFlag = -1;
                this.showBindBankCardFlag = Boolean.FALSE;
            }

            public /* synthetic */ KycInfoBean(int i, int i2, int i3, String str, String str2, Boolean bool, SerializationConstructorMarker serializationConstructorMarker) {
                if ((i & 1) == 0) {
                    this.level = -1;
                } else {
                    this.level = i2;
                }
                if ((i & 2) == 0) {
                    this.levelFlag = -1;
                } else {
                    this.levelFlag = i3;
                }
                if ((i & 4) == 0) {
                    this.info = null;
                } else {
                    this.info = str;
                }
                if ((i & 8) == 0) {
                    this.failReason = null;
                } else {
                    this.failReason = str2;
                }
                if ((i & 16) == 0) {
                    this.showBindBankCardFlag = Boolean.FALSE;
                } else {
                    this.showBindBankCardFlag = bool;
                }
            }

            public static final /* synthetic */ void write$Self$OKCompliance_ok_compliance_api(KycInfoBean kycInfoBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
                if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || kycInfoBean.level != -1) {
                    compositeEncoder.encodeIntElement(serialDescriptor, 0, kycInfoBean.level);
                }
                if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || kycInfoBean.levelFlag != -1) {
                    compositeEncoder.encodeIntElement(serialDescriptor, 1, kycInfoBean.levelFlag);
                }
                if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || kycInfoBean.info != null) {
                    compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, kycInfoBean.info);
                }
                if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || kycInfoBean.failReason != null) {
                    compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, kycInfoBean.failReason);
                }
                if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) && Intrinsics.EZpvd(kycInfoBean.showBindBankCardFlag, Boolean.FALSE)) {
                    return;
                }
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, BooleanSerializer.INSTANCE, kycInfoBean.showBindBankCardFlag);
            }
        }
    }
}
