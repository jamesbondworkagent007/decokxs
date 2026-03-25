package com.okinc.business.invest_biz.data.bean;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.NamedCompanion;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementSerializer;
import o.C33489mxS;
import o.C56403yEb;
import o.C56423yEv;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class InvestCallDataExtra implements Parcelable {
    private static final KSerializer<Object>[] $childSerializers;
    private Long analysisPlatformId;
    private String callDataExtJson;
    private final List<JsonElement> claimCallDataExtInfo;
    private List<String> claimIndex;
    private Integer claimOverdue;
    private final Boolean isSingle;
    private final Boolean openZap;
    private final String providerPubkey;
    private final String pubkey;
    private Integer redeemAll;
    private final List<Map<String, String>> redeemCalldataExtInfo;
    private final String redeemPercent;
    private Boolean revertApproval;
    private final String rewardAddress;
    private final String subscribeCallDataExtInfo;
    private final String swapSlipPoint;
    private Integer tickLower;
    private Integer tickUpper;
    private String tokenId;
    public static final CREATOR CREATOR = new CREATOR(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InvestCallDataExtra() {
        this((Integer) null, (Long) null, (List) null, (Integer) null, (List) null, (List) null, (String) null, (String) null, (String) null, (Integer) null, (Integer) null, (Boolean) null, (String) null, (String) null, (String) null, (String) null, (Boolean) null, (Boolean) null, (String) null, 524287, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component1() {
        return this.redeemAll;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component10() {
        return this.tickUpper;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component11() {
        return this.tickLower;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component12() {
        return this.revertApproval;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.pubkey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.redeemPercent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component15() {
        return this.providerPubkey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component16() {
        return this.subscribeCallDataExtInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component17() {
        return this.openZap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component18() {
        return this.isSingle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component19() {
        return this.swapSlipPoint;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component2() {
        return this.analysisPlatformId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component3() {
        return this.claimIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component4() {
        return this.claimOverdue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<JsonElement> component5() {
        return this.claimCallDataExtInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Map<String, String>> component6() {
        return this.redeemCalldataExtInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.rewardAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.tokenId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.callDataExtJson;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestCallDataExtra copy(Integer num, Long l, List<String> list, Integer num2, List<? extends JsonElement> list2, List<? extends Map<String, String>> list3, String str, String str2, String str3, Integer num3, Integer num4, Boolean bool, String str4, String str5, String str6, String str7, Boolean bool2, Boolean bool3, String str8) {
        return new InvestCallDataExtra(num, l, list, num2, list2, list3, str, str2, str3, num3, num4, bool, str4, str5, str6, str7, bool2, bool3, str8);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InvestCallDataExtra)) {
            return false;
        }
        InvestCallDataExtra investCallDataExtra = (InvestCallDataExtra) obj;
        return Intrinsics.EZpvd(this.redeemAll, investCallDataExtra.redeemAll) && Intrinsics.EZpvd(this.analysisPlatformId, investCallDataExtra.analysisPlatformId) && Intrinsics.EZpvd(this.claimIndex, investCallDataExtra.claimIndex) && Intrinsics.EZpvd(this.claimOverdue, investCallDataExtra.claimOverdue) && Intrinsics.EZpvd(this.claimCallDataExtInfo, investCallDataExtra.claimCallDataExtInfo) && Intrinsics.EZpvd(this.redeemCalldataExtInfo, investCallDataExtra.redeemCalldataExtInfo) && Intrinsics.EZpvd((Object) this.rewardAddress, (Object) investCallDataExtra.rewardAddress) && Intrinsics.EZpvd((Object) this.tokenId, (Object) investCallDataExtra.tokenId) && Intrinsics.EZpvd((Object) this.callDataExtJson, (Object) investCallDataExtra.callDataExtJson) && Intrinsics.EZpvd(this.tickUpper, investCallDataExtra.tickUpper) && Intrinsics.EZpvd(this.tickLower, investCallDataExtra.tickLower) && Intrinsics.EZpvd(this.revertApproval, investCallDataExtra.revertApproval) && Intrinsics.EZpvd((Object) this.pubkey, (Object) investCallDataExtra.pubkey) && Intrinsics.EZpvd((Object) this.redeemPercent, (Object) investCallDataExtra.redeemPercent) && Intrinsics.EZpvd((Object) this.providerPubkey, (Object) investCallDataExtra.providerPubkey) && Intrinsics.EZpvd((Object) this.subscribeCallDataExtInfo, (Object) investCallDataExtra.subscribeCallDataExtInfo) && Intrinsics.EZpvd(this.openZap, investCallDataExtra.openZap) && Intrinsics.EZpvd(this.isSingle, investCallDataExtra.isSingle) && Intrinsics.EZpvd((Object) this.swapSlipPoint, (Object) investCallDataExtra.swapSlipPoint);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getAnalysisPlatformId() {
        return this.analysisPlatformId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCallDataExtJson() {
        return this.callDataExtJson;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<JsonElement> getClaimCallDataExtInfo() {
        return this.claimCallDataExtInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getClaimIndex() {
        return this.claimIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getClaimOverdue() {
        return this.claimOverdue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getOpenZap() {
        return this.openZap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getProviderPubkey() {
        return this.providerPubkey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPubkey() {
        return this.pubkey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getRedeemAll() {
        return this.redeemAll;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Map<String, String>> getRedeemCalldataExtInfo() {
        return this.redeemCalldataExtInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRedeemPercent() {
        return this.redeemPercent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getRevertApproval() {
        return this.revertApproval;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRewardAddress() {
        return this.rewardAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSubscribeCallDataExtInfo() {
        return this.subscribeCallDataExtInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSwapSlipPoint() {
        return this.swapSlipPoint;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getTickLower() {
        return this.tickLower;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getTickUpper() {
        return this.tickUpper;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenId() {
        return this.tokenId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Integer num = this.redeemAll;
        int iHashCode = num == null ? 0 : num.hashCode();
        Long l = this.analysisPlatformId;
        int iHashCode2 = l == null ? 0 : l.hashCode();
        List<String> list = this.claimIndex;
        int iHashCode3 = list == null ? 0 : list.hashCode();
        Integer num2 = this.claimOverdue;
        int iHashCode4 = num2 == null ? 0 : num2.hashCode();
        List<JsonElement> list2 = this.claimCallDataExtInfo;
        int iHashCode5 = list2 == null ? 0 : list2.hashCode();
        List<Map<String, String>> list3 = this.redeemCalldataExtInfo;
        int iHashCode6 = list3 == null ? 0 : list3.hashCode();
        String str = this.rewardAddress;
        int iHashCode7 = str == null ? 0 : str.hashCode();
        String str2 = this.tokenId;
        int iHashCode8 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.callDataExtJson;
        int iHashCode9 = str3 == null ? 0 : str3.hashCode();
        Integer num3 = this.tickUpper;
        int iHashCode10 = num3 == null ? 0 : num3.hashCode();
        Integer num4 = this.tickLower;
        int iHashCode11 = num4 == null ? 0 : num4.hashCode();
        Boolean bool = this.revertApproval;
        int iHashCode12 = bool == null ? 0 : bool.hashCode();
        String str4 = this.pubkey;
        int iHashCode13 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.redeemPercent;
        int iHashCode14 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.providerPubkey;
        int iHashCode15 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.subscribeCallDataExtInfo;
        int iHashCode16 = str7 == null ? 0 : str7.hashCode();
        Boolean bool2 = this.openZap;
        int iHashCode17 = bool2 == null ? 0 : bool2.hashCode();
        Boolean bool3 = this.isSingle;
        int iHashCode18 = bool3 == null ? 0 : bool3.hashCode();
        String str8 = this.swapSlipPoint;
        return (((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + (str8 == null ? 0 : str8.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean isSingle() {
        return this.isSingle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAnalysisPlatformId(Long l) {
        this.analysisPlatformId = l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCallDataExtJson(String str) {
        this.callDataExtJson = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setClaimIndex(List<String> list) {
        this.claimIndex = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setClaimOverdue(Integer num) {
        this.claimOverdue = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRedeemAll(Integer num) {
        this.redeemAll = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRevertApproval(Boolean bool) {
        this.revertApproval = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTickLower(Integer num) {
        this.tickLower = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTickUpper(Integer num) {
        this.tickUpper = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTokenId(String str) {
        this.tokenId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "InvestCallDataExtra(redeemAll=" + this.redeemAll + ", analysisPlatformId=" + this.analysisPlatformId + ", claimIndex=" + this.claimIndex + ", claimOverdue=" + this.claimOverdue + ", claimCallDataExtInfo=" + this.claimCallDataExtInfo + ", redeemCalldataExtInfo=" + this.redeemCalldataExtInfo + ", rewardAddress=" + this.rewardAddress + ", tokenId=" + this.tokenId + ", callDataExtJson=" + this.callDataExtJson + ", tickUpper=" + this.tickUpper + ", tickLower=" + this.tickLower + ", revertApproval=" + this.revertApproval + ", pubkey=" + this.pubkey + ", redeemPercent=" + this.redeemPercent + ", providerPubkey=" + this.providerPubkey + ", subscribeCallDataExtInfo=" + this.subscribeCallDataExtInfo + ", openZap=" + this.openZap + ", isSingle=" + this.isSingle + ", swapSlipPoint=" + this.swapSlipPoint + ")";
    }

    public /* synthetic */ InvestCallDataExtra(int i, Integer num, Long l, List list, Integer num2, List list2, List list3, String str, String str2, String str3, Integer num3, Integer num4, Boolean bool, String str4, String str5, String str6, String str7, Boolean bool2, Boolean bool3, String str8, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.redeemAll = null;
        } else {
            this.redeemAll = num;
        }
        if ((i & 2) == 0) {
            this.analysisPlatformId = null;
        } else {
            this.analysisPlatformId = l;
        }
        if ((i & 4) == 0) {
            this.claimIndex = null;
        } else {
            this.claimIndex = list;
        }
        if ((i & 8) == 0) {
            this.claimOverdue = null;
        } else {
            this.claimOverdue = num2;
        }
        if ((i & 16) == 0) {
            this.claimCallDataExtInfo = null;
        } else {
            this.claimCallDataExtInfo = list2;
        }
        if ((i & 32) == 0) {
            this.redeemCalldataExtInfo = null;
        } else {
            this.redeemCalldataExtInfo = list3;
        }
        if ((i & 64) == 0) {
            this.rewardAddress = null;
        } else {
            this.rewardAddress = str;
        }
        if ((i & 128) == 0) {
            this.tokenId = null;
        } else {
            this.tokenId = str2;
        }
        if ((i & 256) == 0) {
            this.callDataExtJson = null;
        } else {
            this.callDataExtJson = str3;
        }
        if ((i & 512) == 0) {
            this.tickUpper = null;
        } else {
            this.tickUpper = num3;
        }
        if ((i & 1024) == 0) {
            this.tickLower = null;
        } else {
            this.tickLower = num4;
        }
        if ((i & 2048) == 0) {
            this.revertApproval = null;
        } else {
            this.revertApproval = bool;
        }
        if ((i & 4096) == 0) {
            this.pubkey = null;
        } else {
            this.pubkey = str4;
        }
        if ((i & 8192) == 0) {
            this.redeemPercent = null;
        } else {
            this.redeemPercent = str5;
        }
        if ((i & 16384) == 0) {
            this.providerPubkey = null;
        } else {
            this.providerPubkey = str6;
        }
        if ((32768 & i) == 0) {
            this.subscribeCallDataExtInfo = null;
        } else {
            this.subscribeCallDataExtInfo = str7;
        }
        if ((65536 & i) == 0) {
            this.openZap = null;
        } else {
            this.openZap = bool2;
        }
        if ((131072 & i) == 0) {
            this.isSingle = null;
        } else {
            this.isSingle = bool3;
        }
        if ((i & 262144) == 0) {
            this.swapSlipPoint = null;
        } else {
            this.swapSlipPoint = str8;
        }
    }

    public static final /* synthetic */ void write$Self$OKDeFi_invest_biz(InvestCallDataExtra investCallDataExtra, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || investCallDataExtra.redeemAll != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, IntSerializer.INSTANCE, investCallDataExtra.redeemAll);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || investCallDataExtra.analysisPlatformId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, LongSerializer.INSTANCE, investCallDataExtra.analysisPlatformId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || investCallDataExtra.claimIndex != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, kSerializerArr[2], investCallDataExtra.claimIndex);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || investCallDataExtra.claimOverdue != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, IntSerializer.INSTANCE, investCallDataExtra.claimOverdue);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || investCallDataExtra.claimCallDataExtInfo != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, kSerializerArr[4], investCallDataExtra.claimCallDataExtInfo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || investCallDataExtra.redeemCalldataExtInfo != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, kSerializerArr[5], investCallDataExtra.redeemCalldataExtInfo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || investCallDataExtra.rewardAddress != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, investCallDataExtra.rewardAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || investCallDataExtra.tokenId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, investCallDataExtra.tokenId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || investCallDataExtra.callDataExtJson != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, investCallDataExtra.callDataExtJson);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || investCallDataExtra.tickUpper != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, IntSerializer.INSTANCE, investCallDataExtra.tickUpper);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || investCallDataExtra.tickLower != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, IntSerializer.INSTANCE, investCallDataExtra.tickLower);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || investCallDataExtra.revertApproval != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, BooleanSerializer.INSTANCE, investCallDataExtra.revertApproval);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || investCallDataExtra.pubkey != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, StringSerializer.INSTANCE, investCallDataExtra.pubkey);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || investCallDataExtra.redeemPercent != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 13, StringSerializer.INSTANCE, investCallDataExtra.redeemPercent);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || investCallDataExtra.providerPubkey != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 14, StringSerializer.INSTANCE, investCallDataExtra.providerPubkey);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || investCallDataExtra.subscribeCallDataExtInfo != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 15, StringSerializer.INSTANCE, investCallDataExtra.subscribeCallDataExtInfo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || investCallDataExtra.openZap != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 16, BooleanSerializer.INSTANCE, investCallDataExtra.openZap);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || investCallDataExtra.isSingle != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 17, BooleanSerializer.INSTANCE, investCallDataExtra.isSingle);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) && investCallDataExtra.swapSlipPoint == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 18, StringSerializer.INSTANCE, investCallDataExtra.swapSlipPoint);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: java.util.List<? extends kotlinx.serialization.json.JsonElement> */
    /* JADX DEBUG: Multi-variable search result rejected for r8v0, resolved type: java.util.List<? extends java.util.Map<java.lang.String, java.lang.String>> */
    /* JADX WARN: Multi-variable type inference failed */
    public InvestCallDataExtra(Integer num, Long l, List<String> list, Integer num2, List<? extends JsonElement> list2, List<? extends Map<String, String>> list3, String str, String str2, String str3, Integer num3, Integer num4, Boolean bool, String str4, String str5, String str6, String str7, Boolean bool2, Boolean bool3, String str8) {
        this.redeemAll = num;
        this.analysisPlatformId = l;
        this.claimIndex = list;
        this.claimOverdue = num2;
        this.claimCallDataExtInfo = list2;
        this.redeemCalldataExtInfo = list3;
        this.rewardAddress = str;
        this.tokenId = str2;
        this.callDataExtJson = str3;
        this.tickUpper = num3;
        this.tickLower = num4;
        this.revertApproval = bool;
        this.pubkey = str4;
        this.redeemPercent = str5;
        this.providerPubkey = str6;
        this.subscribeCallDataExtInfo = str7;
        this.openZap = bool2;
        this.isSingle = bool3;
        this.swapSlipPoint = str8;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00ce: CONSTRUCTOR 
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0002: ARITH (r40v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r21v0 java.lang.Integer))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x000a: ARITH (r40v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r22v0 java.lang.Long))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0012: ARITH (r40v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r23v0 java.util.List))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x001a: ARITH (r40v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r24v0 java.lang.Integer))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0022: ARITH (r40v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r25v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x002a: ARITH (r40v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r26v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0032: ARITH (r40v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r27v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003a: ARITH (r40v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r28v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0042: ARITH (r40v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r29v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x004a: ARITH (r40v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r30v0 java.lang.Integer))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0052: ARITH (r40v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r31v0 java.lang.Integer))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x005a: ARITH (r40v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r32v0 java.lang.Boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0062: ARITH (r40v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r33v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x006a: ARITH (r40v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r34v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0072: ARITH (r40v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r35v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x007d: ARITH (r40v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r36v0 java.lang.String))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0088: ARITH (r40v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r37v0 java.lang.Boolean))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0093: ARITH (r40v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r38v0 java.lang.Boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x009e: ARITH (r40v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r39v0 java.lang.String))
 A[MD:(java.lang.Integer, java.lang.Long, java.util.List<java.lang.String>, java.lang.Integer, java.util.List<? extends kotlinx.serialization.json.JsonElement>, java.util.List<? extends java.util.Map<java.lang.String, java.lang.String>>, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.Boolean, java.lang.String):void (m)] (LINE:524) call: com.okinc.business.invest_biz.data.bean.InvestCallDataExtra.<init>(java.lang.Integer, java.lang.Long, java.util.List, java.lang.Integer, java.util.List, java.util.List, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.Boolean, java.lang.String):void type: THIS */
    public /* synthetic */ InvestCallDataExtra(Integer num, Long l, List list, Integer num2, List list2, List list3, String str, String str2, String str3, Integer num3, Integer num4, Boolean bool, String str4, String str5, String str6, String str7, Boolean bool2, Boolean bool3, String str8, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : l, (i & 4) != 0 ? null : list, (i & 8) != 0 ? null : num2, (i & 16) != 0 ? null : list2, (i & 32) != 0 ? null : list3, (i & 64) != 0 ? null : str, (i & 128) != 0 ? null : str2, (i & 256) != 0 ? null : str3, (i & 512) != 0 ? null : num3, (i & 1024) != 0 ? null : num4, (i & 2048) != 0 ? null : bool, (i & 4096) != 0 ? null : str4, (i & 8192) != 0 ? null : str5, (i & 16384) != 0 ? null : str6, (i & 32768) != 0 ? null : str7, (i & 65536) != 0 ? null : bool2, (i & 131072) != 0 ? null : bool3, (i & 262144) != 0 ? null : str8);
    }

    public InvestCallDataExtra(@NotNull Parcel parcel) {
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(parcel, "");
        Class cls = Integer.TYPE;
        Object value = parcel.readValue(cls.getClassLoader());
        Integer num = value instanceof Integer ? (Integer) value : null;
        Object value2 = parcel.readValue(Long.TYPE.getClassLoader());
        Long l = value2 instanceof Long ? (Long) value2 : null;
        ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
        Object value3 = parcel.readValue(cls.getClassLoader());
        Integer num2 = value3 instanceof Integer ? (Integer) value3 : null;
        ArrayList<String> arrayListCreateStringArrayList2 = parcel.createStringArrayList();
        if (arrayListCreateStringArrayList2 != null) {
            ArrayList arrayList2 = new ArrayList(C56403yEb.AYXKKw(arrayListCreateStringArrayList2, 10));
            for (String str : arrayListCreateStringArrayList2) {
                C33489mxS c33489mxS = C33489mxS.KWHzl;
                Intrinsics.copydefault((Object) str);
                arrayList2.add((JsonElement) c33489mxS.OLrzqt((DeserializationStrategy) JsonElement.Companion.serializer(), str));
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        List redeemCalldataExtInfo = CREATOR.readRedeemCalldataExtInfo(parcel);
        String string = parcel.readString();
        String string2 = parcel.readString();
        String string3 = parcel.readString();
        Class cls2 = Integer.TYPE;
        Object value4 = parcel.readValue(cls2.getClassLoader());
        Integer num3 = value4 instanceof Integer ? (Integer) value4 : null;
        Object value5 = parcel.readValue(cls2.getClassLoader());
        Integer num4 = value5 instanceof Integer ? (Integer) value5 : null;
        Object value6 = parcel.readValue(Boolean.TYPE.getClassLoader());
        this(num, l, arrayListCreateStringArrayList, num2, arrayList, redeemCalldataExtInfo, string, string2, string3, num3, num4, value6 instanceof Boolean ? (Boolean) value6 : null, parcel.readString(), (String) null, (String) null, (String) null, (Boolean) null, (Boolean) null, (String) null, 516096, (DefaultConstructorMarker) null);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeValue(this.redeemAll);
        parcel.writeValue(this.analysisPlatformId);
        parcel.writeStringList(this.claimIndex);
        parcel.writeValue(this.claimOverdue);
        List<JsonElement> list = this.claimCallDataExtInfo;
        if (list != null) {
            arrayList = new ArrayList(C56403yEb.AYXKKw(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(C33489mxS.KWHzl.KWHzl(JsonElement.Companion.serializer(), (JsonElement) it.next()));
            }
        } else {
            arrayList = null;
        }
        parcel.writeStringList(arrayList);
        CREATOR.writeRedeemCalldataExtInfo(parcel, this.redeemCalldataExtInfo);
        parcel.writeString(this.rewardAddress);
        parcel.writeString(this.tokenId);
        parcel.writeString(this.callDataExtJson);
        parcel.writeValue(this.revertApproval);
        parcel.writeValue(this.pubkey);
    }

    @NamedCompanion
    public static final class CREATOR implements Parcelable.Creator<InvestCallDataExtra> {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.data.bean.InvestCallDataExtra.CREATOR.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ CREATOR(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private CREATOR() {
        }

        public final KSerializer<InvestCallDataExtra> serializer() {
            return InvestCallDataExtra$$serializer.INSTANCE;
        }

        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public InvestCallDataExtra createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new InvestCallDataExtra(parcel);
        }

        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public InvestCallDataExtra[] newArray(int i) {
            return new InvestCallDataExtra[i];
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void writeRedeemCalldataExtInfo(Parcel parcel, List<? extends Map<String, String>> list) {
            if (list == null) {
                parcel.writeInt(-1);
                return;
            }
            parcel.writeInt(list.size());
            for (Map<String, String> map : list) {
                parcel.writeInt(map.size());
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    String key = entry.getKey();
                    String value = entry.getValue();
                    parcel.writeString(key);
                    parcel.writeString(value);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final List<Map<String, String>> readRedeemCalldataExtInfo(Parcel parcel) {
            int i = parcel.readInt();
            if (i < 0) {
                return null;
            }
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 < i; i2++) {
                int i3 = parcel.readInt();
                Map mapEZpvd = C56423yEv.EZpvd(i3);
                for (int i4 = 0; i4 < i3; i4++) {
                    String string = parcel.readString();
                    Intrinsics.copydefault((Object) string);
                    String string2 = parcel.readString();
                    Intrinsics.copydefault((Object) string2);
                    mapEZpvd.put(string, string2);
                }
                arrayList.add(C56423yEv.AYXKKw(mapEZpvd));
            }
            return arrayList;
        }
    }

    static {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        $childSerializers = new KSerializer[]{null, null, new ArrayListSerializer(stringSerializer), null, new ArrayListSerializer(JsonElementSerializer.INSTANCE), new ArrayListSerializer(new LinkedHashMapSerializer(stringSerializer, stringSerializer)), null, null, null, null, null, null, null, null, null, null, null, null, null};
    }
}
