package com.okinc.assets.backend.api.model;

import androidx.core.app.FrameMetricsAggregator;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
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
import o.C56423yEv;
import o.C56444yFp;
import o.C56548yJl;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Serializable
public final class CannotWithdrawAssetsResponse {
    private final String accountAvailable;
    private final String currencyAccountAvailable;
    private final ArrayList<DetailsItem> details;
    private final Boolean isFiat;
    private final String lockedAsset;
    private final String protectedAsset;
    private final String totalAsset;
    private final String unavailableAsset;
    private final Integer version;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(CannotWithdrawAssetsResponse$DetailsItem$$serializer.INSTANCE), null, null, null, null, null, null, null, null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CannotWithdrawAssetsResponse() {
        this((ArrayList) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Boolean) null, (Integer) null, FrameMetricsAggregator.EVERY_DURATION, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<DetailsItem> component1() {
        return this.details;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.lockedAsset;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.totalAsset;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.protectedAsset;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.accountAvailable;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.unavailableAsset;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.currencyAccountAvailable;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component8() {
        return this.isFiat;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component9() {
        return this.version;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CannotWithdrawAssetsResponse copy(ArrayList<DetailsItem> arrayList, String str, String str2, String str3, String str4, String str5, String str6, Boolean bool, Integer num) {
        return new CannotWithdrawAssetsResponse(arrayList, str, str2, str3, str4, str5, str6, bool, num);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CannotWithdrawAssetsResponse)) {
            return false;
        }
        CannotWithdrawAssetsResponse cannotWithdrawAssetsResponse = (CannotWithdrawAssetsResponse) obj;
        return Intrinsics.EZpvd(this.details, cannotWithdrawAssetsResponse.details) && Intrinsics.EZpvd((Object) this.lockedAsset, (Object) cannotWithdrawAssetsResponse.lockedAsset) && Intrinsics.EZpvd((Object) this.totalAsset, (Object) cannotWithdrawAssetsResponse.totalAsset) && Intrinsics.EZpvd((Object) this.protectedAsset, (Object) cannotWithdrawAssetsResponse.protectedAsset) && Intrinsics.EZpvd((Object) this.accountAvailable, (Object) cannotWithdrawAssetsResponse.accountAvailable) && Intrinsics.EZpvd((Object) this.unavailableAsset, (Object) cannotWithdrawAssetsResponse.unavailableAsset) && Intrinsics.EZpvd((Object) this.currencyAccountAvailable, (Object) cannotWithdrawAssetsResponse.currencyAccountAvailable) && Intrinsics.EZpvd(this.isFiat, cannotWithdrawAssetsResponse.isFiat) && Intrinsics.EZpvd(this.version, cannotWithdrawAssetsResponse.version);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAccountAvailable() {
        return this.accountAvailable;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCurrencyAccountAvailable() {
        return this.currencyAccountAvailable;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<DetailsItem> getDetails() {
        return this.details;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLockedAsset() {
        return this.lockedAsset;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getProtectedAsset() {
        return this.protectedAsset;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTotalAsset() {
        return this.totalAsset;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUnavailableAsset() {
        return this.unavailableAsset;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getVersion() {
        return this.version;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        ArrayList<DetailsItem> arrayList = this.details;
        int iHashCode = arrayList == null ? 0 : arrayList.hashCode();
        String str = this.lockedAsset;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.totalAsset;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.protectedAsset;
        int iHashCode4 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.accountAvailable;
        int iHashCode5 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.unavailableAsset;
        int iHashCode6 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.currencyAccountAvailable;
        int iHashCode7 = str6 == null ? 0 : str6.hashCode();
        Boolean bool = this.isFiat;
        int iHashCode8 = bool == null ? 0 : bool.hashCode();
        Integer num = this.version;
        return (((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + (num != null ? num.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean isFiat() {
        return this.isFiat;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CannotWithdrawAssetsResponse(details=" + this.details + ", lockedAsset=" + this.lockedAsset + ", totalAsset=" + this.totalAsset + ", protectedAsset=" + this.protectedAsset + ", accountAvailable=" + this.accountAvailable + ", unavailableAsset=" + this.unavailableAsset + ", currencyAccountAvailable=" + this.currencyAccountAvailable + ", isFiat=" + this.isFiat + ", version=" + this.version + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.assets.backend.api.model.CannotWithdrawAssetsResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CannotWithdrawAssetsResponse> serializer() {
            return CannotWithdrawAssetsResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ CannotWithdrawAssetsResponse(int i, ArrayList arrayList, String str, String str2, String str3, String str4, String str5, String str6, Boolean bool, Integer num, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.details = null;
        } else {
            this.details = arrayList;
        }
        if ((i & 2) == 0) {
            this.lockedAsset = null;
        } else {
            this.lockedAsset = str;
        }
        if ((i & 4) == 0) {
            this.totalAsset = null;
        } else {
            this.totalAsset = str2;
        }
        if ((i & 8) == 0) {
            this.protectedAsset = null;
        } else {
            this.protectedAsset = str3;
        }
        if ((i & 16) == 0) {
            this.accountAvailable = null;
        } else {
            this.accountAvailable = str4;
        }
        if ((i & 32) == 0) {
            this.unavailableAsset = null;
        } else {
            this.unavailableAsset = str5;
        }
        if ((i & 64) == 0) {
            this.currencyAccountAvailable = null;
        } else {
            this.currencyAccountAvailable = str6;
        }
        if ((i & 128) == 0) {
            this.isFiat = Boolean.FALSE;
        } else {
            this.isFiat = bool;
        }
        if ((i & 256) == 0) {
            this.version = null;
        } else {
            this.version = num;
        }
    }

    public static final /* synthetic */ void write$Self$OKAssets_assets_pro_api(CannotWithdrawAssetsResponse cannotWithdrawAssetsResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || cannotWithdrawAssetsResponse.details != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, kSerializerArr[0], cannotWithdrawAssetsResponse.details);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || cannotWithdrawAssetsResponse.lockedAsset != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, cannotWithdrawAssetsResponse.lockedAsset);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || cannotWithdrawAssetsResponse.totalAsset != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, cannotWithdrawAssetsResponse.totalAsset);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || cannotWithdrawAssetsResponse.protectedAsset != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, cannotWithdrawAssetsResponse.protectedAsset);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || cannotWithdrawAssetsResponse.accountAvailable != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, cannotWithdrawAssetsResponse.accountAvailable);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || cannotWithdrawAssetsResponse.unavailableAsset != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, cannotWithdrawAssetsResponse.unavailableAsset);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || cannotWithdrawAssetsResponse.currencyAccountAvailable != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, cannotWithdrawAssetsResponse.currencyAccountAvailable);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd(cannotWithdrawAssetsResponse.isFiat, Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, BooleanSerializer.INSTANCE, cannotWithdrawAssetsResponse.isFiat);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) && cannotWithdrawAssetsResponse.version == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, IntSerializer.INSTANCE, cannotWithdrawAssetsResponse.version);
    }

    public CannotWithdrawAssetsResponse(ArrayList<DetailsItem> arrayList, String str, String str2, String str3, String str4, String str5, String str6, Boolean bool, Integer num) {
        this.details = arrayList;
        this.lockedAsset = str;
        this.totalAsset = str2;
        this.protectedAsset = str3;
        this.accountAvailable = str4;
        this.unavailableAsset = str5;
        this.currencyAccountAvailable = str6;
        this.isFiat = bool;
        this.version = num;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0055: CONSTRUCTOR 
  (wrap:java.util.ArrayList:?: TERNARY null = ((wrap:int:0x0002: ARITH (r20v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.util.ArrayList) : (r11v0 java.util.ArrayList))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r20v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0011: ARITH (r20v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r13v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0018: ARITH (r20v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001f: ARITH (r20v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0026: ARITH (r20v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002e: ARITH (r20v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r17v0 java.lang.String))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0036: ARITH (r20v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x003a: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r18v0 java.lang.Boolean))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x003f: ARITH (r20v0 int) & (256 int) A[WRAPPED]) == (0 int)) ? (r19v0 java.lang.Integer) : (null java.lang.Integer))
 A[MD:(java.util.ArrayList<com.okinc.assets.backend.api.model.CannotWithdrawAssetsResponse$DetailsItem>, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.Integer):void (m)] (LINE:10) call: com.okinc.assets.backend.api.model.CannotWithdrawAssetsResponse.<init>(java.util.ArrayList, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.Integer):void type: THIS */
    public /* synthetic */ CannotWithdrawAssetsResponse(ArrayList arrayList, String str, String str2, String str3, String str4, String str5, String str6, Boolean bool, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : arrayList, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : str6, (i & 128) != 0 ? Boolean.FALSE : bool, (i & 256) == 0 ? num : null);
    }

    @Serializable
    public static final class DetailsItem {
        public static final int $stable = 0;
        public static final Companion Companion = new Companion(null);
        private final String amountStr;
        private final String amountValuation;
        private final Integer category;
        private final Integer confirmations;
        private final Long cryptoWithdrawExpireTime;
        private final String currency;
        private final Integer currencyId;
        private final Long depositTime;
        private final String remainingAmountValuation;
        private final Long timestamp;
        private final String totalLimitAmountValuation;
        private final Integer type;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public DetailsItem() {
            this((String) null, (String) null, (Integer) null, (String) null, (Integer) null, (Long) null, (String) null, (Long) null, (Long) null, (String) null, (Integer) null, (Integer) null, 4095, (DefaultConstructorMarker) null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.amountStr;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component10() {
            return this.totalLimitAmountValuation;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Integer component11() {
            return this.type;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Integer component12() {
            return this.category;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component2() {
            return this.amountValuation;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Integer component3() {
            return this.confirmations;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component4() {
            return this.currency;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Integer component5() {
            return this.currencyId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Long component6() {
            return this.depositTime;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component7() {
            return this.remainingAmountValuation;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Long component8() {
            return this.timestamp;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Long component9() {
            return this.cryptoWithdrawExpireTime;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final DetailsItem copy(String str, String str2, Integer num, String str3, Integer num2, Long l, String str4, Long l2, Long l3, String str5, Integer num3, Integer num4) {
            return new DetailsItem(str, str2, num, str3, num2, l, str4, l2, l3, str5, num3, num4);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DetailsItem)) {
                return false;
            }
            DetailsItem detailsItem = (DetailsItem) obj;
            return Intrinsics.EZpvd((Object) this.amountStr, (Object) detailsItem.amountStr) && Intrinsics.EZpvd((Object) this.amountValuation, (Object) detailsItem.amountValuation) && Intrinsics.EZpvd(this.confirmations, detailsItem.confirmations) && Intrinsics.EZpvd((Object) this.currency, (Object) detailsItem.currency) && Intrinsics.EZpvd(this.currencyId, detailsItem.currencyId) && Intrinsics.EZpvd(this.depositTime, detailsItem.depositTime) && Intrinsics.EZpvd((Object) this.remainingAmountValuation, (Object) detailsItem.remainingAmountValuation) && Intrinsics.EZpvd(this.timestamp, detailsItem.timestamp) && Intrinsics.EZpvd(this.cryptoWithdrawExpireTime, detailsItem.cryptoWithdrawExpireTime) && Intrinsics.EZpvd((Object) this.totalLimitAmountValuation, (Object) detailsItem.totalLimitAmountValuation) && Intrinsics.EZpvd(this.type, detailsItem.type) && Intrinsics.EZpvd(this.category, detailsItem.category);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getAmountStr() {
            return this.amountStr;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getAmountValuation() {
            return this.amountValuation;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Integer getCategory() {
            return this.category;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Integer getConfirmations() {
            return this.confirmations;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Long getCryptoWithdrawExpireTime() {
            return this.cryptoWithdrawExpireTime;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getCurrency() {
            return this.currency;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Integer getCurrencyId() {
            return this.currencyId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Long getDepositTime() {
            return this.depositTime;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getRemainingAmountValuation() {
            return this.remainingAmountValuation;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Long getTimestamp() {
            return this.timestamp;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getTotalLimitAmountValuation() {
            return this.totalLimitAmountValuation;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Integer getType() {
            return this.type;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            String str = this.amountStr;
            int iHashCode = str == null ? 0 : str.hashCode();
            String str2 = this.amountValuation;
            int iHashCode2 = str2 == null ? 0 : str2.hashCode();
            Integer num = this.confirmations;
            int iHashCode3 = num == null ? 0 : num.hashCode();
            String str3 = this.currency;
            int iHashCode4 = str3 == null ? 0 : str3.hashCode();
            Integer num2 = this.currencyId;
            int iHashCode5 = num2 == null ? 0 : num2.hashCode();
            Long l = this.depositTime;
            int iHashCode6 = l == null ? 0 : l.hashCode();
            String str4 = this.remainingAmountValuation;
            int iHashCode7 = str4 == null ? 0 : str4.hashCode();
            Long l2 = this.timestamp;
            int iHashCode8 = l2 == null ? 0 : l2.hashCode();
            Long l3 = this.cryptoWithdrawExpireTime;
            int iHashCode9 = l3 == null ? 0 : l3.hashCode();
            String str5 = this.totalLimitAmountValuation;
            int iHashCode10 = str5 == null ? 0 : str5.hashCode();
            Integer num3 = this.type;
            int iHashCode11 = num3 == null ? 0 : num3.hashCode();
            Integer num4 = this.category;
            return (((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + (num4 != null ? num4.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "DetailsItem(amountStr=" + this.amountStr + ", amountValuation=" + this.amountValuation + ", confirmations=" + this.confirmations + ", currency=" + this.currency + ", currencyId=" + this.currencyId + ", depositTime=" + this.depositTime + ", remainingAmountValuation=" + this.remainingAmountValuation + ", timestamp=" + this.timestamp + ", cryptoWithdrawExpireTime=" + this.cryptoWithdrawExpireTime + ", totalLimitAmountValuation=" + this.totalLimitAmountValuation + ", type=" + this.type + ", category=" + this.category + ")";
        }

        public static final class Companion {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private Companion() {
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.assets.backend.api.model.CannotWithdrawAssetsResponse.DetailsItem.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<DetailsItem> serializer() {
                return CannotWithdrawAssetsResponse$DetailsItem$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ DetailsItem(int i, String str, String str2, Integer num, String str3, Integer num2, Long l, String str4, Long l2, Long l3, String str5, Integer num3, Integer num4, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.amountStr = null;
            } else {
                this.amountStr = str;
            }
            if ((i & 2) == 0) {
                this.amountValuation = null;
            } else {
                this.amountValuation = str2;
            }
            if ((i & 4) == 0) {
                this.confirmations = null;
            } else {
                this.confirmations = num;
            }
            if ((i & 8) == 0) {
                this.currency = null;
            } else {
                this.currency = str3;
            }
            if ((i & 16) == 0) {
                this.currencyId = null;
            } else {
                this.currencyId = num2;
            }
            if ((i & 32) == 0) {
                this.depositTime = null;
            } else {
                this.depositTime = l;
            }
            if ((i & 64) == 0) {
                this.remainingAmountValuation = null;
            } else {
                this.remainingAmountValuation = str4;
            }
            if ((i & 128) == 0) {
                this.timestamp = null;
            } else {
                this.timestamp = l2;
            }
            if ((i & 256) == 0) {
                this.cryptoWithdrawExpireTime = null;
            } else {
                this.cryptoWithdrawExpireTime = l3;
            }
            if ((i & 512) == 0) {
                this.totalLimitAmountValuation = null;
            } else {
                this.totalLimitAmountValuation = str5;
            }
            if ((i & 1024) == 0) {
                this.type = null;
            } else {
                this.type = num3;
            }
            if ((i & 2048) == 0) {
                this.category = null;
            } else {
                this.category = num4;
            }
        }

        public static final /* synthetic */ void write$Self$OKAssets_assets_pro_api(DetailsItem detailsItem, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || detailsItem.amountStr != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, detailsItem.amountStr);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || detailsItem.amountValuation != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, detailsItem.amountValuation);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || detailsItem.confirmations != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, IntSerializer.INSTANCE, detailsItem.confirmations);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || detailsItem.currency != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, detailsItem.currency);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || detailsItem.currencyId != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, IntSerializer.INSTANCE, detailsItem.currencyId);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || detailsItem.depositTime != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, LongSerializer.INSTANCE, detailsItem.depositTime);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || detailsItem.remainingAmountValuation != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, detailsItem.remainingAmountValuation);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || detailsItem.timestamp != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, LongSerializer.INSTANCE, detailsItem.timestamp);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || detailsItem.cryptoWithdrawExpireTime != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, LongSerializer.INSTANCE, detailsItem.cryptoWithdrawExpireTime);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || detailsItem.totalLimitAmountValuation != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, detailsItem.totalLimitAmountValuation);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || detailsItem.type != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, IntSerializer.INSTANCE, detailsItem.type);
            }
            if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) && detailsItem.category == null) {
                return;
            }
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, IntSerializer.INSTANCE, detailsItem.category);
        }

        public DetailsItem(String str, String str2, Integer num, String str3, Integer num2, Long l, String str4, Long l2, Long l3, String str5, Integer num3, Integer num4) {
            this.amountStr = str;
            this.amountValuation = str2;
            this.confirmations = num;
            this.currency = str3;
            this.currencyId = num2;
            this.depositTime = l;
            this.remainingAmountValuation = str4;
            this.timestamp = l2;
            this.cryptoWithdrawExpireTime = l3;
            this.totalLimitAmountValuation = str5;
            this.type = num3;
            this.category = num4;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0078: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r26v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r26v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r15v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0011: ARITH (r26v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r16v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0019: ARITH (r26v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r17v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0021: ARITH (r26v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r18v0 java.lang.Integer))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0029: ARITH (r26v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r19v0 java.lang.Long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0031: ARITH (r26v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r20v0 java.lang.String))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0039: ARITH (r26v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r21v0 java.lang.Long))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0041: ARITH (r26v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r22v0 java.lang.Long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0049: ARITH (r26v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r23v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0051: ARITH (r26v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r24v0 java.lang.Integer))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0059: ARITH (r26v0 int) & (2048 int) A[WRAPPED]) == (0 int)) ? (r25v0 java.lang.Integer) : (null java.lang.Integer))
 A[MD:(java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.Integer, java.lang.Long, java.lang.String, java.lang.Long, java.lang.Long, java.lang.String, java.lang.Integer, java.lang.Integer):void (m)] (LINE:24) call: com.okinc.assets.backend.api.model.CannotWithdrawAssetsResponse.DetailsItem.<init>(java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.Integer, java.lang.Long, java.lang.String, java.lang.Long, java.lang.Long, java.lang.String, java.lang.Integer, java.lang.Integer):void type: THIS */
        public /* synthetic */ DetailsItem(String str, String str2, Integer num, String str3, Integer num2, Long l, String str4, Long l2, Long l3, String str5, Integer num3, Integer num4, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : num2, (i & 32) != 0 ? null : l, (i & 64) != 0 ? null : str4, (i & 128) != 0 ? null : l2, (i & 256) != 0 ? null : l3, (i & 512) != 0 ? null : str5, (i & 1024) != 0 ? null : num3, (i & 2048) == 0 ? num4 : null);
        }

        public final ItemType getTypeEnum() {
            return ItemType.Companion.EZpvd(this.type);
        }

        public final ItemType6v124 getTypeEnum_6_124() {
            return ItemType6v124.Companion.EZpvd(this.type);
        }

        public final Category getCategoryPre6v124() {
            return Category.Companion.EZpvd(getTypeEnum());
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class ItemType6v124 {
            private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
            private static final /* synthetic */ ItemType6v124[] $VALUES;
            public static final StateListAnimator Companion;
            public static final ItemType6v124 WithdrawalConfirmationOrDoubleSpending = new ItemType6v124("WithdrawalConfirmationOrDoubleSpending", 0);
            public static final ItemType6v124 P2PTradeLock = new ItemType6v124("P2PTradeLock", 1);
            public static final ItemType6v124 AirdropPayBack = new ItemType6v124("AirdropPayBack", 2);
            public static final ItemType6v124 UnderDepositProtection = new ItemType6v124("UnderDepositProtection", 3);
            public static final ItemType6v124 FundsUnderWithdrawalControl = new ItemType6v124("FundsUnderWithdrawalControl", 4);
            public static final ItemType6v124 PaymentLock = new ItemType6v124("PaymentLock", 5);
            public static final ItemType6v124 Others = new ItemType6v124("Others", 6);

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private static final /* synthetic */ ItemType6v124[] $values() {
                return new ItemType6v124[]{WithdrawalConfirmationOrDoubleSpending, P2PTradeLock, AirdropPayBack, UnderDepositProtection, FundsUnderWithdrawalControl, PaymentLock, Others};
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static InterfaceC56445yFq<ItemType6v124> getEntries() {
                return $ENTRIES;
            }

            private ItemType6v124(String str, int i) {
            }

            static {
                ItemType6v124[] itemType6v124Arr$values = $values();
                $VALUES = itemType6v124Arr$values;
                $ENTRIES = C56444yFp.AEQbTJ(itemType6v124Arr$values);
                Companion = new StateListAnimator(null);
            }

            public static final class StateListAnimator {
                /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.assets.backend.api.model.CannotWithdrawAssetsResponse.DetailsItem.ItemType6v124.StateListAnimator.<init>():void type: THIS */
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private StateListAnimator() {
                }

                public final ItemType6v124 EZpvd(Integer num) {
                    return (num != null && num.intValue() == 1) ? ItemType6v124.WithdrawalConfirmationOrDoubleSpending : (num != null && num.intValue() == 3) ? ItemType6v124.P2PTradeLock : (num != null && num.intValue() == 4) ? ItemType6v124.AirdropPayBack : (num != null && num.intValue() == 5) ? ItemType6v124.UnderDepositProtection : (num != null && num.intValue() == 6) ? ItemType6v124.FundsUnderWithdrawalControl : (num != null && num.intValue() == 7) ? ItemType6v124.PaymentLock : ItemType6v124.Others;
                }
            }

            public static ItemType6v124 valueOf(String str) {
                return (ItemType6v124) Enum.valueOf(ItemType6v124.class, str);
            }

            public static ItemType6v124[] values() {
                return (ItemType6v124[]) $VALUES.clone();
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class ItemType {
            private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
            private static final /* synthetic */ ItemType[] $VALUES;
            public static final ActionBar Companion;
            public static final ItemType WithdrawalConfirmationOrDoubleSpending = new ItemType("WithdrawalConfirmationOrDoubleSpending", 0);
            public static final ItemType P2PTradeLock = new ItemType("P2PTradeLock", 1);
            public static final ItemType AirdropPayBack = new ItemType("AirdropPayBack", 2);
            public static final ItemType UnderDepositProtection = new ItemType("UnderDepositProtection", 3);
            public static final ItemType FundsUnderWithdrawalControl = new ItemType("FundsUnderWithdrawalControl", 4);
            public static final ItemType PaymentLock = new ItemType("PaymentLock", 5);
            public static final ItemType WithdrawalOnHold = new ItemType("WithdrawalOnHold", 6);
            public static final ItemType Others = new ItemType("Others", 7);

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private static final /* synthetic */ ItemType[] $values() {
                return new ItemType[]{WithdrawalConfirmationOrDoubleSpending, P2PTradeLock, AirdropPayBack, UnderDepositProtection, FundsUnderWithdrawalControl, PaymentLock, WithdrawalOnHold, Others};
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static InterfaceC56445yFq<ItemType> getEntries() {
                return $ENTRIES;
            }

            private ItemType(String str, int i) {
            }

            static {
                ItemType[] itemTypeArr$values = $values();
                $VALUES = itemTypeArr$values;
                $ENTRIES = C56444yFp.AEQbTJ(itemTypeArr$values);
                Companion = new ActionBar(null);
            }

            public static final class ActionBar {
                /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.assets.backend.api.model.CannotWithdrawAssetsResponse.DetailsItem.ItemType.ActionBar.<init>():void type: THIS */
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private ActionBar() {
                }

                public final ItemType EZpvd(Integer num) {
                    return (num != null && num.intValue() == 1) ? ItemType.WithdrawalConfirmationOrDoubleSpending : (num != null && num.intValue() == 3) ? ItemType.P2PTradeLock : (num != null && num.intValue() == 4) ? ItemType.AirdropPayBack : (num != null && num.intValue() == 5) ? ItemType.UnderDepositProtection : (num != null && num.intValue() == 6) ? ItemType.FundsUnderWithdrawalControl : (num != null && num.intValue() == 7) ? ItemType.PaymentLock : (num != null && num.intValue() == 11) ? ItemType.WithdrawalOnHold : ItemType.Others;
                }
            }

            public static ItemType valueOf(String str) {
                return (ItemType) Enum.valueOf(ItemType.class, str);
            }

            public static ItemType[] values() {
                return (ItemType[]) $VALUES.clone();
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class Category {
            private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
            private static final /* synthetic */ Category[] $VALUES;
            public static final Application Companion;
            public static final Category Protected = new Category("Protected", 0);
            public static final Category Locked = new Category("Locked", 1);

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private static final /* synthetic */ Category[] $values() {
                return new Category[]{Protected, Locked};
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static InterfaceC56445yFq<Category> getEntries() {
                return $ENTRIES;
            }

            private Category(String str, int i) {
            }

            static {
                Category[] categoryArr$values = $values();
                $VALUES = categoryArr$values;
                $ENTRIES = C56444yFp.AEQbTJ(categoryArr$values);
                Companion = new Application(null);
            }

            public static final class Application {

                public final /* synthetic */ class Activity {
                    public static final /* synthetic */ int[] KWHzl;

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    static {
                        int[] iArr = new int[ItemType.values().length];
                        try {
                            iArr[ItemType.WithdrawalConfirmationOrDoubleSpending.ordinal()] = 1;
                        } catch (NoSuchFieldError unused) {
                        }
                        try {
                            iArr[ItemType.P2PTradeLock.ordinal()] = 2;
                        } catch (NoSuchFieldError unused2) {
                        }
                        try {
                            iArr[ItemType.AirdropPayBack.ordinal()] = 3;
                        } catch (NoSuchFieldError unused3) {
                        }
                        try {
                            iArr[ItemType.PaymentLock.ordinal()] = 4;
                        } catch (NoSuchFieldError unused4) {
                        }
                        try {
                            iArr[ItemType.UnderDepositProtection.ordinal()] = 5;
                        } catch (NoSuchFieldError unused5) {
                        }
                        try {
                            iArr[ItemType.FundsUnderWithdrawalControl.ordinal()] = 6;
                        } catch (NoSuchFieldError unused6) {
                        }
                        try {
                            iArr[ItemType.WithdrawalOnHold.ordinal()] = 7;
                        } catch (NoSuchFieldError unused7) {
                        }
                        try {
                            iArr[ItemType.Others.ordinal()] = 8;
                        } catch (NoSuchFieldError unused8) {
                        }
                        KWHzl = iArr;
                    }
                }

                /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.assets.backend.api.model.CannotWithdrawAssetsResponse.DetailsItem.Category.Application.<init>():void type: THIS */
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Application() {
                }

                public final Category EZpvd(@NotNull ItemType itemType) {
                    Intrinsics.checkNotNullParameter(itemType, "");
                    switch (Activity.KWHzl[itemType.ordinal()]) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                            return Category.Locked;
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                            return Category.Protected;
                        default:
                            throw new NoWhenBranchMatchedException();
                    }
                }
            }

            public static Category valueOf(String str) {
                return (Category) Enum.valueOf(Category.class, str);
            }

            public static Category[] values() {
                return (Category[]) $VALUES.clone();
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class Category6v124 {
            private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
            private static final /* synthetic */ Category6v124[] $VALUES;
            public static final Activity Companion;
            public static final Category6v124 Locked = new Category6v124("Locked", 0, 1);
            public static final Category6v124 Protected = new Category6v124("Protected", 1, 2);
            private static final Map<Integer, Category6v124> valueMap;
            private final int value;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private static final /* synthetic */ Category6v124[] $values() {
                return new Category6v124[]{Locked, Protected};
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static InterfaceC56445yFq<Category6v124> getEntries() {
                return $ENTRIES;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final int getValue() {
                return this.value;
            }

            private Category6v124(String str, int i, int i2) {
                this.value = i2;
            }

            static {
                Category6v124[] category6v124Arr$values = $values();
                $VALUES = category6v124Arr$values;
                $ENTRIES = C56444yFp.AEQbTJ(category6v124Arr$values);
                Companion = new Activity(null);
                Category6v124[] category6v124ArrValues = values();
                LinkedHashMap linkedHashMap = new LinkedHashMap(C56548yJl.copydefault(C56423yEv.copydefault(category6v124ArrValues.length), 16));
                for (Category6v124 category6v124 : category6v124ArrValues) {
                    linkedHashMap.put(Integer.valueOf(category6v124.value), category6v124);
                }
                valueMap = linkedHashMap;
            }

            public static final class Activity {
                /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.assets.backend.api.model.CannotWithdrawAssetsResponse.DetailsItem.Category6v124.Activity.<init>():void type: THIS */
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Activity() {
                }
            }

            public static Category6v124 valueOf(String str) {
                return (Category6v124) Enum.valueOf(Category6v124.class, str);
            }

            public static Category6v124[] values() {
                return (Category6v124[]) $VALUES.clone();
            }
        }
    }
}
