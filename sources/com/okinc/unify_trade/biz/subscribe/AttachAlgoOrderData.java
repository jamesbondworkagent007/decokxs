package com.okinc.unify_trade.biz.subscribe;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.C33129mqd;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
@Serializable
public final class AttachAlgoOrderData implements Parcelable {
    private String algoId;
    private String amendPxOnTriggerType;
    private String businessLine;
    private final String cTime;
    private String isTpLimit;
    private final String last;
    private LinkedAlgoOrd linkedAlgoOrd;
    private LinkedOrd linkedOrd;
    private String ordId;
    private String ordType;
    private String px;
    private String reduceOnly;
    private String slOrdPx;
    private String slTriggerPx;
    private String slTriggerPxType;
    private final String sz;
    private String tpOrdPx;
    private String tpTriggerPx;
    private String tpTriggerPxType;
    private final String uTime;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<AttachAlgoOrderData> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<AttachAlgoOrderData> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AttachAlgoOrderData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new AttachAlgoOrderData(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : LinkedOrd.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? LinkedAlgoOrd.CREATOR.createFromParcel(parcel) : null, parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AttachAlgoOrderData[] newArray(int i) {
            return new AttachAlgoOrderData[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AttachAlgoOrderData() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (LinkedOrd) null, (LinkedAlgoOrd) null, (String) null, 1048575, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.algoId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.sz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.ordType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.last;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.isTpLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.reduceOnly;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component15() {
        return this.amendPxOnTriggerType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component16() {
        return this.ordId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component17() {
        return this.px;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LinkedOrd component18() {
        return this.linkedOrd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LinkedAlgoOrd component19() {
        return this.linkedAlgoOrd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.tpTriggerPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component20() {
        return this.businessLine;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.tpOrdPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.tpTriggerPxType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.slTriggerPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.slOrdPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.slTriggerPxType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.cTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.uTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AttachAlgoOrderData copy(@NotNull String str, @NotNull String str2, @NotNull String str3, String str4, @NotNull String str5, @NotNull String str6, String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14, @NotNull String str15, @NotNull String str16, @NotNull String str17, LinkedOrd linkedOrd, LinkedAlgoOrd linkedAlgoOrd, String str18) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str12, "");
        Intrinsics.checkNotNullParameter(str13, "");
        Intrinsics.checkNotNullParameter(str14, "");
        Intrinsics.checkNotNullParameter(str15, "");
        Intrinsics.checkNotNullParameter(str16, "");
        Intrinsics.checkNotNullParameter(str17, "");
        return new AttachAlgoOrderData(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, linkedOrd, linkedAlgoOrd, str18);
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
        if (!(obj instanceof AttachAlgoOrderData)) {
            return false;
        }
        AttachAlgoOrderData attachAlgoOrderData = (AttachAlgoOrderData) obj;
        return Intrinsics.EZpvd((Object) this.algoId, (Object) attachAlgoOrderData.algoId) && Intrinsics.EZpvd((Object) this.tpTriggerPx, (Object) attachAlgoOrderData.tpTriggerPx) && Intrinsics.EZpvd((Object) this.tpOrdPx, (Object) attachAlgoOrderData.tpOrdPx) && Intrinsics.EZpvd((Object) this.tpTriggerPxType, (Object) attachAlgoOrderData.tpTriggerPxType) && Intrinsics.EZpvd((Object) this.slTriggerPx, (Object) attachAlgoOrderData.slTriggerPx) && Intrinsics.EZpvd((Object) this.slOrdPx, (Object) attachAlgoOrderData.slOrdPx) && Intrinsics.EZpvd((Object) this.slTriggerPxType, (Object) attachAlgoOrderData.slTriggerPxType) && Intrinsics.EZpvd((Object) this.cTime, (Object) attachAlgoOrderData.cTime) && Intrinsics.EZpvd((Object) this.uTime, (Object) attachAlgoOrderData.uTime) && Intrinsics.EZpvd((Object) this.sz, (Object) attachAlgoOrderData.sz) && Intrinsics.EZpvd((Object) this.ordType, (Object) attachAlgoOrderData.ordType) && Intrinsics.EZpvd((Object) this.last, (Object) attachAlgoOrderData.last) && Intrinsics.EZpvd((Object) this.isTpLimit, (Object) attachAlgoOrderData.isTpLimit) && Intrinsics.EZpvd((Object) this.reduceOnly, (Object) attachAlgoOrderData.reduceOnly) && Intrinsics.EZpvd((Object) this.amendPxOnTriggerType, (Object) attachAlgoOrderData.amendPxOnTriggerType) && Intrinsics.EZpvd((Object) this.ordId, (Object) attachAlgoOrderData.ordId) && Intrinsics.EZpvd((Object) this.px, (Object) attachAlgoOrderData.px) && Intrinsics.EZpvd(this.linkedOrd, attachAlgoOrderData.linkedOrd) && Intrinsics.EZpvd(this.linkedAlgoOrd, attachAlgoOrderData.linkedAlgoOrd) && Intrinsics.EZpvd((Object) this.businessLine, (Object) attachAlgoOrderData.businessLine);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAlgoId() {
        return this.algoId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAmendPxOnTriggerType() {
        return this.amendPxOnTriggerType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBusinessLine() {
        return this.businessLine;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCTime() {
        return this.cTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLast() {
        return this.last;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LinkedAlgoOrd getLinkedAlgoOrd() {
        return this.linkedAlgoOrd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LinkedOrd getLinkedOrd() {
        return this.linkedOrd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOrdId() {
        return this.ordId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOrdType() {
        return this.ordType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPx() {
        return this.px;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getReduceOnly() {
        return this.reduceOnly;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSlOrdPx() {
        return this.slOrdPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSlTriggerPx() {
        return this.slTriggerPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSlTriggerPxType() {
        return this.slTriggerPxType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSz() {
        return this.sz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTpOrdPx() {
        return this.tpOrdPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTpTriggerPx() {
        return this.tpTriggerPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTpTriggerPxType() {
        return this.tpTriggerPxType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUTime() {
        return this.uTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.algoId.hashCode();
        int iHashCode2 = this.tpTriggerPx.hashCode();
        int iHashCode3 = this.tpOrdPx.hashCode();
        String str = this.tpTriggerPxType;
        int iHashCode4 = str == null ? 0 : str.hashCode();
        int iHashCode5 = this.slTriggerPx.hashCode();
        int iHashCode6 = this.slOrdPx.hashCode();
        String str2 = this.slTriggerPxType;
        int iHashCode7 = str2 == null ? 0 : str2.hashCode();
        int iHashCode8 = this.cTime.hashCode();
        int iHashCode9 = this.uTime.hashCode();
        int iHashCode10 = this.sz.hashCode();
        int iHashCode11 = this.ordType.hashCode();
        int iHashCode12 = this.last.hashCode();
        int iHashCode13 = this.isTpLimit.hashCode();
        int iHashCode14 = this.reduceOnly.hashCode();
        int iHashCode15 = this.amendPxOnTriggerType.hashCode();
        int iHashCode16 = this.ordId.hashCode();
        int iHashCode17 = this.px.hashCode();
        LinkedOrd linkedOrd = this.linkedOrd;
        int iHashCode18 = linkedOrd == null ? 0 : linkedOrd.hashCode();
        LinkedAlgoOrd linkedAlgoOrd = this.linkedAlgoOrd;
        int iHashCode19 = linkedAlgoOrd == null ? 0 : linkedAlgoOrd.hashCode();
        String str3 = this.businessLine;
        return (((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + (str3 == null ? 0 : str3.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String isTpLimit() {
        return this.isTpLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAlgoId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.algoId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAmendPxOnTriggerType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.amendPxOnTriggerType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBusinessLine(String str) {
        this.businessLine = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLinkedAlgoOrd(LinkedAlgoOrd linkedAlgoOrd) {
        this.linkedAlgoOrd = linkedAlgoOrd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLinkedOrd(LinkedOrd linkedOrd) {
        this.linkedOrd = linkedOrd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOrdId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.ordId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOrdType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.ordType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPx(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.px = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setReduceOnly(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.reduceOnly = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSlOrdPx(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.slOrdPx = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSlTriggerPx(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.slTriggerPx = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSlTriggerPxType(String str) {
        this.slTriggerPxType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTpLimit(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.isTpLimit = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTpOrdPx(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.tpOrdPx = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTpTriggerPx(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.tpTriggerPx = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTpTriggerPxType(String str) {
        this.tpTriggerPxType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AttachAlgoOrderData(algoId=" + this.algoId + ", tpTriggerPx=" + this.tpTriggerPx + ", tpOrdPx=" + this.tpOrdPx + ", tpTriggerPxType=" + this.tpTriggerPxType + ", slTriggerPx=" + this.slTriggerPx + ", slOrdPx=" + this.slOrdPx + ", slTriggerPxType=" + this.slTriggerPxType + ", cTime=" + this.cTime + ", uTime=" + this.uTime + ", sz=" + this.sz + ", ordType=" + this.ordType + ", last=" + this.last + ", isTpLimit=" + this.isTpLimit + ", reduceOnly=" + this.reduceOnly + ", amendPxOnTriggerType=" + this.amendPxOnTriggerType + ", ordId=" + this.ordId + ", px=" + this.px + ", linkedOrd=" + this.linkedOrd + ", linkedAlgoOrd=" + this.linkedAlgoOrd + ", businessLine=" + this.businessLine + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.algoId);
        parcel.writeString(this.tpTriggerPx);
        parcel.writeString(this.tpOrdPx);
        parcel.writeString(this.tpTriggerPxType);
        parcel.writeString(this.slTriggerPx);
        parcel.writeString(this.slOrdPx);
        parcel.writeString(this.slTriggerPxType);
        parcel.writeString(this.cTime);
        parcel.writeString(this.uTime);
        parcel.writeString(this.sz);
        parcel.writeString(this.ordType);
        parcel.writeString(this.last);
        parcel.writeString(this.isTpLimit);
        parcel.writeString(this.reduceOnly);
        parcel.writeString(this.amendPxOnTriggerType);
        parcel.writeString(this.ordId);
        parcel.writeString(this.px);
        LinkedOrd linkedOrd = this.linkedOrd;
        if (linkedOrd == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            linkedOrd.writeToParcel(parcel, i);
        }
        LinkedAlgoOrd linkedAlgoOrd = this.linkedAlgoOrd;
        if (linkedAlgoOrd == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            linkedAlgoOrd.writeToParcel(parcel, i);
        }
        parcel.writeString(this.businessLine);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.subscribe.AttachAlgoOrderData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<AttachAlgoOrderData> serializer() {
            return AttachAlgoOrderData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ AttachAlgoOrderData(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, LinkedOrd linkedOrd, LinkedAlgoOrd linkedAlgoOrd, String str18, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.algoId = "";
        } else {
            this.algoId = str;
        }
        if ((i & 2) == 0) {
            this.tpTriggerPx = "";
        } else {
            this.tpTriggerPx = str2;
        }
        if ((i & 4) == 0) {
            this.tpOrdPx = "";
        } else {
            this.tpOrdPx = str3;
        }
        if ((i & 8) == 0) {
            this.tpTriggerPxType = null;
        } else {
            this.tpTriggerPxType = str4;
        }
        if ((i & 16) == 0) {
            this.slTriggerPx = "";
        } else {
            this.slTriggerPx = str5;
        }
        if ((i & 32) == 0) {
            this.slOrdPx = "";
        } else {
            this.slOrdPx = str6;
        }
        if ((i & 64) == 0) {
            this.slTriggerPxType = null;
        } else {
            this.slTriggerPxType = str7;
        }
        if ((i & 128) == 0) {
            this.cTime = "";
        } else {
            this.cTime = str8;
        }
        if ((i & 256) == 0) {
            this.uTime = "";
        } else {
            this.uTime = str9;
        }
        if ((i & 512) == 0) {
            this.sz = "";
        } else {
            this.sz = str10;
        }
        if ((i & 1024) == 0) {
            this.ordType = "";
        } else {
            this.ordType = str11;
        }
        if ((i & 2048) == 0) {
            this.last = "";
        } else {
            this.last = str12;
        }
        if ((i & 4096) == 0) {
            this.isTpLimit = "";
        } else {
            this.isTpLimit = str13;
        }
        if ((i & 8192) == 0) {
            this.reduceOnly = "";
        } else {
            this.reduceOnly = str14;
        }
        this.amendPxOnTriggerType = (i & 16384) == 0 ? "0" : str15;
        if ((32768 & i) == 0) {
            this.ordId = "";
        } else {
            this.ordId = str16;
        }
        if ((65536 & i) == 0) {
            this.px = "";
        } else {
            this.px = str17;
        }
        if ((131072 & i) == 0) {
            this.linkedOrd = null;
        } else {
            this.linkedOrd = linkedOrd;
        }
        if ((262144 & i) == 0) {
            this.linkedAlgoOrd = null;
        } else {
            this.linkedAlgoOrd = linkedAlgoOrd;
        }
        if ((i & 524288) == 0) {
            this.businessLine = null;
        } else {
            this.businessLine = str18;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(AttachAlgoOrderData attachAlgoOrderData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) attachAlgoOrderData.algoId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, attachAlgoOrderData.algoId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) attachAlgoOrderData.tpTriggerPx, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, attachAlgoOrderData.tpTriggerPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) attachAlgoOrderData.tpOrdPx, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, attachAlgoOrderData.tpOrdPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || attachAlgoOrderData.tpTriggerPxType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, attachAlgoOrderData.tpTriggerPxType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) attachAlgoOrderData.slTriggerPx, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, attachAlgoOrderData.slTriggerPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) attachAlgoOrderData.slOrdPx, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, attachAlgoOrderData.slOrdPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || attachAlgoOrderData.slTriggerPxType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, attachAlgoOrderData.slTriggerPxType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) attachAlgoOrderData.cTime, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, attachAlgoOrderData.cTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) attachAlgoOrderData.uTime, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, attachAlgoOrderData.uTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) attachAlgoOrderData.sz, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 9, attachAlgoOrderData.sz);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd((Object) attachAlgoOrderData.ordType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 10, attachAlgoOrderData.ordType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd((Object) attachAlgoOrderData.last, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 11, attachAlgoOrderData.last);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || !Intrinsics.EZpvd((Object) attachAlgoOrderData.isTpLimit, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 12, attachAlgoOrderData.isTpLimit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || !Intrinsics.EZpvd((Object) attachAlgoOrderData.reduceOnly, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 13, attachAlgoOrderData.reduceOnly);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || !Intrinsics.EZpvd((Object) attachAlgoOrderData.amendPxOnTriggerType, (Object) "0")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 14, attachAlgoOrderData.amendPxOnTriggerType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || !Intrinsics.EZpvd((Object) attachAlgoOrderData.ordId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 15, attachAlgoOrderData.ordId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || !Intrinsics.EZpvd((Object) attachAlgoOrderData.px, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 16, attachAlgoOrderData.px);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || attachAlgoOrderData.linkedOrd != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 17, LinkedOrd$$serializer.INSTANCE, attachAlgoOrderData.linkedOrd);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) || attachAlgoOrderData.linkedAlgoOrd != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 18, LinkedAlgoOrd$$serializer.INSTANCE, attachAlgoOrderData.linkedAlgoOrd);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 19) && attachAlgoOrderData.businessLine == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 19, StringSerializer.INSTANCE, attachAlgoOrderData.businessLine);
    }

    public AttachAlgoOrderData(@NotNull String str, @NotNull String str2, @NotNull String str3, String str4, @NotNull String str5, @NotNull String str6, String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14, @NotNull String str15, @NotNull String str16, @NotNull String str17, LinkedOrd linkedOrd, LinkedAlgoOrd linkedAlgoOrd, String str18) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str12, "");
        Intrinsics.checkNotNullParameter(str13, "");
        Intrinsics.checkNotNullParameter(str14, "");
        Intrinsics.checkNotNullParameter(str15, "");
        Intrinsics.checkNotNullParameter(str16, "");
        Intrinsics.checkNotNullParameter(str17, "");
        this.algoId = str;
        this.tpTriggerPx = str2;
        this.tpOrdPx = str3;
        this.tpTriggerPxType = str4;
        this.slTriggerPx = str5;
        this.slOrdPx = str6;
        this.slTriggerPxType = str7;
        this.cTime = str8;
        this.uTime = str9;
        this.sz = str10;
        this.ordType = str11;
        this.last = str12;
        this.isTpLimit = str13;
        this.reduceOnly = str14;
        this.amendPxOnTriggerType = str15;
        this.ordId = str16;
        this.px = str17;
        this.linkedOrd = linkedOrd;
        this.linkedAlgoOrd = linkedAlgoOrd;
        this.businessLine = str18;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00e0: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r42v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r22v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r42v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r23v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r42v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r24v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r42v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r25v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r42v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r26v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002c: ARITH (r42v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r27v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0034: ARITH (r42v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r28v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003c: ARITH (r42v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r29v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0044: ARITH (r42v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r30v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004c: ARITH (r42v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r31v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0054: ARITH (r42v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r32v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005c: ARITH (r42v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? ("") : (r33v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0064: ARITH (r42v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? ("") : (r34v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x006c: ARITH (r42v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? ("") : (r35v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0076: ARITH (r42v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? ("0") : (r36v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0082: ARITH (r42v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? ("") : (r37v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x008d: ARITH (r42v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? ("") : (r38v0 java.lang.String))
  (wrap:com.okinc.unify_trade.biz.subscribe.LinkedOrd:?: TERNARY null = ((wrap:int:0x0098: ARITH (r42v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.unify_trade.biz.subscribe.LinkedOrd) : (r39v0 com.okinc.unify_trade.biz.subscribe.LinkedOrd))
  (wrap:com.okinc.unify_trade.biz.subscribe.LinkedAlgoOrd:?: TERNARY null = ((wrap:int:0x00a3: ARITH (r42v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.unify_trade.biz.subscribe.LinkedAlgoOrd) : (r40v0 com.okinc.unify_trade.biz.subscribe.LinkedAlgoOrd))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00ae: ARITH (r42v0 int) & (524288 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r41v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.unify_trade.biz.subscribe.LinkedOrd, com.okinc.unify_trade.biz.subscribe.LinkedAlgoOrd, java.lang.String):void (m)] (LINE:26) call: com.okinc.unify_trade.biz.subscribe.AttachAlgoOrderData.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.unify_trade.biz.subscribe.LinkedOrd, com.okinc.unify_trade.biz.subscribe.LinkedAlgoOrd, java.lang.String):void type: THIS */
    public /* synthetic */ AttachAlgoOrderData(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, LinkedOrd linkedOrd, LinkedAlgoOrd linkedAlgoOrd, String str18, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? "" : str8, (i & 256) != 0 ? "" : str9, (i & 512) != 0 ? "" : str10, (i & 1024) != 0 ? "" : str11, (i & 2048) != 0 ? "" : str12, (i & 4096) != 0 ? "" : str13, (i & 8192) != 0 ? "" : str14, (i & 16384) != 0 ? "0" : str15, (i & 32768) != 0 ? "" : str16, (i & 65536) != 0 ? "" : str17, (i & 131072) != 0 ? null : linkedOrd, (i & 262144) != 0 ? null : linkedAlgoOrd, (i & 524288) != 0 ? null : str18);
    }

    public final String getCalculteProfitTpPrice() {
        return Intrinsics.EZpvd((Object) this.isTpLimit, (Object) "true") ? this.px : C33129mqd.AEQbTJ(this.tpOrdPx, 0) ? this.tpOrdPx : this.tpTriggerPx;
    }
}
