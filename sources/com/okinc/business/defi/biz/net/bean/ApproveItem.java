package com.okinc.business.defi.biz.net.bean;

import android.content.res.Resources;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
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
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class ApproveItem implements Parcelable {
    private String approvalAddress;
    private final String blackTag;
    private final Long blackTagAlarmGapTime;
    private final Long blackTagAlarmTime;
    private final Integer blackTagLongTimeDayLimit;
    private final Integer blackTagType;
    private List<EIP7702RevokeInfo> chainList;
    private String coinId;
    private String linkApprovalAddress;
    private String network;
    private String projectDesc;
    private String projectIcon;
    private String projectName;
    private List<ApproveToken> tokens;
    private String type;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<ApproveItem> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, null, null, new ArrayListSerializer(ApproveToken$$serializer.INSTANCE), new ArrayListSerializer(EIP7702RevokeInfo$$serializer.INSTANCE), null, null, null, null, null};

    public static final class Creator implements Parcelable.Creator<ApproveItem> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ApproveItem createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(ApproveToken.CREATOR.createFromParcel(parcel));
                }
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i3 = parcel.readInt();
                arrayList2 = new ArrayList(i3);
                for (int i4 = 0; i4 != i3; i4++) {
                    arrayList2.add(EIP7702RevokeInfo.CREATOR.createFromParcel(parcel));
                }
            }
            return new ApproveItem(string, string2, string3, string4, string5, string6, string7, string8, arrayList, arrayList2, parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ApproveItem[] newArray(int i) {
            return new ApproveItem[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ApproveItem() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (List) null, (String) null, (Integer) null, (Long) null, (Integer) null, (Long) null, 32767, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<EIP7702RevokeInfo> component10() {
        return this.chainList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.blackTag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component12() {
        return this.blackTagType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component13() {
        return this.blackTagAlarmTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component14() {
        return this.blackTagLongTimeDayLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component15() {
        return this.blackTagAlarmGapTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.coinId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.network;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.projectIcon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.projectName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.projectDesc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.approvalAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.linkApprovalAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<ApproveToken> component9() {
        return this.tokens;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ApproveItem copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, List<ApproveToken> list, List<EIP7702RevokeInfo> list2, String str9, Integer num, Long l, Integer num2, Long l2) {
        return new ApproveItem(str, str2, str3, str4, str5, str6, str7, str8, list, list2, str9, num, l, num2, l2);
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
        if (!(obj instanceof ApproveItem)) {
            return false;
        }
        ApproveItem approveItem = (ApproveItem) obj;
        return Intrinsics.EZpvd((Object) this.type, (Object) approveItem.type) && Intrinsics.EZpvd((Object) this.coinId, (Object) approveItem.coinId) && Intrinsics.EZpvd((Object) this.network, (Object) approveItem.network) && Intrinsics.EZpvd((Object) this.projectIcon, (Object) approveItem.projectIcon) && Intrinsics.EZpvd((Object) this.projectName, (Object) approveItem.projectName) && Intrinsics.EZpvd((Object) this.projectDesc, (Object) approveItem.projectDesc) && Intrinsics.EZpvd((Object) this.approvalAddress, (Object) approveItem.approvalAddress) && Intrinsics.EZpvd((Object) this.linkApprovalAddress, (Object) approveItem.linkApprovalAddress) && Intrinsics.EZpvd(this.tokens, approveItem.tokens) && Intrinsics.EZpvd(this.chainList, approveItem.chainList) && Intrinsics.EZpvd((Object) this.blackTag, (Object) approveItem.blackTag) && Intrinsics.EZpvd(this.blackTagType, approveItem.blackTagType) && Intrinsics.EZpvd(this.blackTagAlarmTime, approveItem.blackTagAlarmTime) && Intrinsics.EZpvd(this.blackTagLongTimeDayLimit, approveItem.blackTagLongTimeDayLimit) && Intrinsics.EZpvd(this.blackTagAlarmGapTime, approveItem.blackTagAlarmGapTime);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getApprovalAddress() {
        return this.approvalAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBlackTag() {
        return this.blackTag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getBlackTagAlarmGapTime() {
        return this.blackTagAlarmGapTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getBlackTagAlarmTime() {
        return this.blackTagAlarmTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getBlackTagLongTimeDayLimit() {
        return this.blackTagLongTimeDayLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getBlackTagType() {
        return this.blackTagType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<EIP7702RevokeInfo> getChainList() {
        return this.chainList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCoinId() {
        return this.coinId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLinkApprovalAddress() {
        return this.linkApprovalAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNetwork() {
        return this.network;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getProjectDesc() {
        return this.projectDesc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getProjectIcon() {
        return this.projectIcon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getProjectName() {
        return this.projectName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<ApproveToken> getTokens() {
        return this.tokens;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getType() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.type;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.coinId;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.network;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.projectIcon;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.projectName;
        int iHashCode5 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.projectDesc;
        int iHashCode6 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.approvalAddress;
        int iHashCode7 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.linkApprovalAddress;
        int iHashCode8 = str8 == null ? 0 : str8.hashCode();
        List<ApproveToken> list = this.tokens;
        int iHashCode9 = list == null ? 0 : list.hashCode();
        List<EIP7702RevokeInfo> list2 = this.chainList;
        int iHashCode10 = list2 == null ? 0 : list2.hashCode();
        String str9 = this.blackTag;
        int iHashCode11 = str9 == null ? 0 : str9.hashCode();
        Integer num = this.blackTagType;
        int iHashCode12 = num == null ? 0 : num.hashCode();
        Long l = this.blackTagAlarmTime;
        int iHashCode13 = l == null ? 0 : l.hashCode();
        Integer num2 = this.blackTagLongTimeDayLimit;
        int iHashCode14 = num2 == null ? 0 : num2.hashCode();
        Long l2 = this.blackTagAlarmGapTime;
        return (((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + (l2 == null ? 0 : l2.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setApprovalAddress(String str) {
        this.approvalAddress = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setChainList(List<EIP7702RevokeInfo> list) {
        this.chainList = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCoinId(String str) {
        this.coinId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLinkApprovalAddress(String str) {
        this.linkApprovalAddress = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNetwork(String str) {
        this.network = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setProjectDesc(String str) {
        this.projectDesc = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setProjectIcon(String str) {
        this.projectIcon = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setProjectName(String str) {
        this.projectName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTokens(List<ApproveToken> list) {
        this.tokens = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setType(String str) {
        this.type = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ApproveItem(type=" + this.type + ", coinId=" + this.coinId + ", network=" + this.network + ", projectIcon=" + this.projectIcon + ", projectName=" + this.projectName + ", projectDesc=" + this.projectDesc + ", approvalAddress=" + this.approvalAddress + ", linkApprovalAddress=" + this.linkApprovalAddress + ", tokens=" + this.tokens + ", chainList=" + this.chainList + ", blackTag=" + this.blackTag + ", blackTagType=" + this.blackTagType + ", blackTagAlarmTime=" + this.blackTagAlarmTime + ", blackTagLongTimeDayLimit=" + this.blackTagLongTimeDayLimit + ", blackTagAlarmGapTime=" + this.blackTagAlarmGapTime + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.type);
        parcel.writeString(this.coinId);
        parcel.writeString(this.network);
        parcel.writeString(this.projectIcon);
        parcel.writeString(this.projectName);
        parcel.writeString(this.projectDesc);
        parcel.writeString(this.approvalAddress);
        parcel.writeString(this.linkApprovalAddress);
        List<ApproveToken> list = this.tokens;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<ApproveToken> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(parcel, i);
            }
        }
        List<EIP7702RevokeInfo> list2 = this.chainList;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list2.size());
            Iterator<EIP7702RevokeInfo> it2 = list2.iterator();
            while (it2.hasNext()) {
                it2.next().writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this.blackTag);
        Integer num = this.blackTagType;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Long l = this.blackTagAlarmTime;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        Integer num2 = this.blackTagLongTimeDayLimit;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        Long l2 = this.blackTagAlarmGapTime;
        if (l2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l2.longValue());
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.net.bean.ApproveItem.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ApproveItem> serializer() {
            return ApproveItem$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ApproveItem(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, List list, List list2, String str9, Integer num, Long l, Integer num2, Long l2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.type = null;
        } else {
            this.type = str;
        }
        if ((i & 2) == 0) {
            this.coinId = null;
        } else {
            this.coinId = str2;
        }
        if ((i & 4) == 0) {
            this.network = null;
        } else {
            this.network = str3;
        }
        if ((i & 8) == 0) {
            this.projectIcon = null;
        } else {
            this.projectIcon = str4;
        }
        if ((i & 16) == 0) {
            this.projectName = null;
        } else {
            this.projectName = str5;
        }
        if ((i & 32) == 0) {
            this.projectDesc = null;
        } else {
            this.projectDesc = str6;
        }
        if ((i & 64) == 0) {
            this.approvalAddress = null;
        } else {
            this.approvalAddress = str7;
        }
        if ((i & 128) == 0) {
            this.linkApprovalAddress = null;
        } else {
            this.linkApprovalAddress = str8;
        }
        if ((i & 256) == 0) {
            this.tokens = null;
        } else {
            this.tokens = list;
        }
        if ((i & 512) == 0) {
            this.chainList = null;
        } else {
            this.chainList = list2;
        }
        if ((i & 1024) == 0) {
            this.blackTag = null;
        } else {
            this.blackTag = str9;
        }
        if ((i & 2048) == 0) {
            this.blackTagType = null;
        } else {
            this.blackTagType = num;
        }
        if ((i & 4096) == 0) {
            this.blackTagAlarmTime = null;
        } else {
            this.blackTagAlarmTime = l;
        }
        if ((i & 8192) == 0) {
            this.blackTagLongTimeDayLimit = null;
        } else {
            this.blackTagLongTimeDayLimit = num2;
        }
        if ((i & 16384) == 0) {
            this.blackTagAlarmGapTime = null;
        } else {
            this.blackTagAlarmGapTime = l2;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(ApproveItem approveItem, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || approveItem.type != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, approveItem.type);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || approveItem.coinId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, approveItem.coinId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || approveItem.network != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, approveItem.network);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || approveItem.projectIcon != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, approveItem.projectIcon);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || approveItem.projectName != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, approveItem.projectName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || approveItem.projectDesc != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, approveItem.projectDesc);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || approveItem.approvalAddress != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, approveItem.approvalAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || approveItem.linkApprovalAddress != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, approveItem.linkApprovalAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || approveItem.tokens != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, kSerializerArr[8], approveItem.tokens);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || approveItem.chainList != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, kSerializerArr[9], approveItem.chainList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || approveItem.blackTag != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, StringSerializer.INSTANCE, approveItem.blackTag);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || approveItem.blackTagType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, IntSerializer.INSTANCE, approveItem.blackTagType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || approveItem.blackTagAlarmTime != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, LongSerializer.INSTANCE, approveItem.blackTagAlarmTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || approveItem.blackTagLongTimeDayLimit != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 13, IntSerializer.INSTANCE, approveItem.blackTagLongTimeDayLimit);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) && approveItem.blackTagAlarmGapTime == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 14, LongSerializer.INSTANCE, approveItem.blackTagAlarmGapTime);
    }

    public ApproveItem(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, List<ApproveToken> list, List<EIP7702RevokeInfo> list2, String str9, Integer num, Long l, Integer num2, Long l2) {
        this.type = str;
        this.coinId = str2;
        this.network = str3;
        this.projectIcon = str4;
        this.projectName = str5;
        this.projectDesc = str6;
        this.approvalAddress = str7;
        this.linkApprovalAddress = str8;
        this.tokens = list;
        this.chainList = list2;
        this.blackTag = str9;
        this.blackTagType = num;
        this.blackTagAlarmTime = l;
        this.blackTagLongTimeDayLimit = num2;
        this.blackTagAlarmGapTime = l2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x009a: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r32v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r32v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0013: ARITH (r32v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001b: ARITH (r32v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0023: ARITH (r32v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002b: ARITH (r32v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r22v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0033: ARITH (r32v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r23v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003b: ARITH (r32v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r24v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0043: ARITH (r32v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r25v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x004b: ARITH (r32v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r26v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0053: ARITH (r32v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r27v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x005b: ARITH (r32v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r28v0 java.lang.Integer))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0063: ARITH (r32v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r29v0 java.lang.Long))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x006b: ARITH (r32v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r30v0 java.lang.Integer))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0073: ARITH (r32v0 int) & (16384 int) A[WRAPPED]) == (0 int)) ? (r31v0 java.lang.Long) : (null java.lang.Long))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List<com.okinc.business.defi.biz.net.bean.ApproveToken>, java.util.List<com.okinc.business.defi.biz.net.bean.EIP7702RevokeInfo>, java.lang.String, java.lang.Integer, java.lang.Long, java.lang.Integer, java.lang.Long):void (m)] (LINE:408) call: com.okinc.business.defi.biz.net.bean.ApproveItem.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.util.List, java.lang.String, java.lang.Integer, java.lang.Long, java.lang.Integer, java.lang.Long):void type: THIS */
    public /* synthetic */ ApproveItem(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, List list, List list2, String str9, Integer num, Long l, Integer num2, Long l2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8, (i & 256) != 0 ? null : list, (i & 512) != 0 ? null : list2, (i & 1024) != 0 ? null : str9, (i & 2048) != 0 ? null : num, (i & 4096) != 0 ? null : l, (i & 8192) != 0 ? null : num2, (i & 16384) == 0 ? l2 : null);
    }

    public final boolean isRiskyProject() {
        String str = this.blackTag;
        return !(str == null || str.length() == 0);
    }

    public final boolean isEIP7702Upgrade() {
        return Intrinsics.EZpvd((Object) this.type, (Object) "1");
    }

    public final String getShowProjectName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (Intrinsics.EZpvd((Object) this.projectName, (Object) "Unknown")) {
            return str;
        }
        String str2 = this.projectName;
        return str2 == null ? "" : str2;
    }

    public final int getShowProjectIconResource(int i) {
        if (Intrinsics.EZpvd((Object) this.projectName, (Object) "Unknown")) {
            return i;
        }
        return 0;
    }

    public final String getShowProjectIconUri(@NotNull Resources resources, int i) {
        Intrinsics.checkNotNullParameter(resources, "");
        if (!Intrinsics.EZpvd((Object) this.projectName, (Object) "Unknown")) {
            return this.projectIcon;
        }
        return Uri.parse("android.resource://" + resources.getResourcePackageName(i) + "/" + resources.getResourceTypeName(i) + "/" + resources.getResourceEntryName(i)).toString();
    }
}
