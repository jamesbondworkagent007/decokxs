package com.okinc.unify_trade.biz;

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
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Serializable
public final class DcaAiData implements Parcelable {
    private String algoOrdType;
    private String apy;
    private String ccy;
    private String direction;
    private String duration;
    private String initOrdPct;
    private String initOrds;
    private String instId;
    private String lever;
    private String maxSafetyOrds;
    private String minInvestment;
    private String pxSteps;
    private String pxStepsMult;
    private boolean reserveFunds;
    private String slMode;
    private String slPct;
    private String tpPct;
    private List<DcaTriggerParam> triggerParams;
    private String triggerType;
    private String volMult;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<DcaAiData> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new ArrayListSerializer(DcaTriggerParam$$serializer.INSTANCE)};

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Creator implements Parcelable.Creator<DcaAiData> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DcaAiData createFromParcel(Parcel parcel) {
            String str;
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            boolean z = parcel.readInt() != 0;
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            String string9 = parcel.readString();
            String string10 = parcel.readString();
            String string11 = parcel.readString();
            String string12 = parcel.readString();
            String string13 = parcel.readString();
            String string14 = parcel.readString();
            String string15 = parcel.readString();
            String string16 = parcel.readString();
            String string17 = parcel.readString();
            String string18 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
                str = string12;
            } else {
                int i = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i);
                str = string12;
                int i2 = 0;
                while (i2 != i) {
                    arrayList2.add(DcaTriggerParam.CREATOR.createFromParcel(parcel));
                    i2++;
                    i = i;
                }
                arrayList = arrayList2;
            }
            return new DcaAiData(string, string2, string3, string4, z, string5, string6, string7, string8, string9, string10, string11, str, string13, string14, string15, string16, string17, string18, arrayList);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DcaAiData[] newArray(int i) {
            return new DcaAiData[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DcaAiData() {
        this((String) null, (String) null, (String) null, (String) null, false, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, 1048575, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.duration;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.pxSteps;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.pxStepsMult;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.volMult;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.tpPct;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component15() {
        return this.slPct;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component16() {
        return this.minInvestment;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component17() {
        return this.ccy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component18() {
        return this.lever;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component19() {
        return this.slMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.algoOrdType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<DcaTriggerParam> component20() {
        return this.triggerParams;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.direction;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.apy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component5() {
        return this.reserveFunds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.triggerType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.initOrds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.initOrdPct;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.maxSafetyOrds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DcaAiData copy(String str, String str2, String str3, String str4, boolean z, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, List<DcaTriggerParam> list) {
        return new DcaAiData(str, str2, str3, str4, z, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, str18, list);
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
        if (!(obj instanceof DcaAiData)) {
            return false;
        }
        DcaAiData dcaAiData = (DcaAiData) obj;
        return Intrinsics.EZpvd((Object) this.instId, (Object) dcaAiData.instId) && Intrinsics.EZpvd((Object) this.algoOrdType, (Object) dcaAiData.algoOrdType) && Intrinsics.EZpvd((Object) this.direction, (Object) dcaAiData.direction) && Intrinsics.EZpvd((Object) this.apy, (Object) dcaAiData.apy) && this.reserveFunds == dcaAiData.reserveFunds && Intrinsics.EZpvd((Object) this.triggerType, (Object) dcaAiData.triggerType) && Intrinsics.EZpvd((Object) this.initOrds, (Object) dcaAiData.initOrds) && Intrinsics.EZpvd((Object) this.initOrdPct, (Object) dcaAiData.initOrdPct) && Intrinsics.EZpvd((Object) this.maxSafetyOrds, (Object) dcaAiData.maxSafetyOrds) && Intrinsics.EZpvd((Object) this.duration, (Object) dcaAiData.duration) && Intrinsics.EZpvd((Object) this.pxSteps, (Object) dcaAiData.pxSteps) && Intrinsics.EZpvd((Object) this.pxStepsMult, (Object) dcaAiData.pxStepsMult) && Intrinsics.EZpvd((Object) this.volMult, (Object) dcaAiData.volMult) && Intrinsics.EZpvd((Object) this.tpPct, (Object) dcaAiData.tpPct) && Intrinsics.EZpvd((Object) this.slPct, (Object) dcaAiData.slPct) && Intrinsics.EZpvd((Object) this.minInvestment, (Object) dcaAiData.minInvestment) && Intrinsics.EZpvd((Object) this.ccy, (Object) dcaAiData.ccy) && Intrinsics.EZpvd((Object) this.lever, (Object) dcaAiData.lever) && Intrinsics.EZpvd((Object) this.slMode, (Object) dcaAiData.slMode) && Intrinsics.EZpvd(this.triggerParams, dcaAiData.triggerParams);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAlgoOrdType() {
        return this.algoOrdType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getApy() {
        return this.apy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCcy() {
        return this.ccy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDirection() {
        return this.direction;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDuration() {
        return this.duration;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInitOrdPct() {
        return this.initOrdPct;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInitOrds() {
        return this.initOrds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInstId() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLever() {
        return this.lever;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMaxSafetyOrds() {
        return this.maxSafetyOrds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMinInvestment() {
        return this.minInvestment;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPxSteps() {
        return this.pxSteps;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPxStepsMult() {
        return this.pxStepsMult;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getReserveFunds() {
        return this.reserveFunds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSlMode() {
        return this.slMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSlPct() {
        return this.slPct;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTpPct() {
        return this.tpPct;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<DcaTriggerParam> getTriggerParams() {
        return this.triggerParams;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTriggerType() {
        return this.triggerType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getVolMult() {
        return this.volMult;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.instId;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.algoOrdType;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.direction;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.apy;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        int iHashCode5 = Boolean.hashCode(this.reserveFunds);
        String str5 = this.triggerType;
        int iHashCode6 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.initOrds;
        int iHashCode7 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.initOrdPct;
        int iHashCode8 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.maxSafetyOrds;
        int iHashCode9 = str8 == null ? 0 : str8.hashCode();
        String str9 = this.duration;
        int iHashCode10 = str9 == null ? 0 : str9.hashCode();
        String str10 = this.pxSteps;
        int iHashCode11 = str10 == null ? 0 : str10.hashCode();
        String str11 = this.pxStepsMult;
        int iHashCode12 = str11 == null ? 0 : str11.hashCode();
        String str12 = this.volMult;
        int iHashCode13 = str12 == null ? 0 : str12.hashCode();
        String str13 = this.tpPct;
        int iHashCode14 = str13 == null ? 0 : str13.hashCode();
        String str14 = this.slPct;
        int iHashCode15 = str14 == null ? 0 : str14.hashCode();
        String str15 = this.minInvestment;
        int iHashCode16 = str15 == null ? 0 : str15.hashCode();
        String str16 = this.ccy;
        int iHashCode17 = str16 == null ? 0 : str16.hashCode();
        String str17 = this.lever;
        int iHashCode18 = str17 == null ? 0 : str17.hashCode();
        String str18 = this.slMode;
        int iHashCode19 = str18 == null ? 0 : str18.hashCode();
        List<DcaTriggerParam> list = this.triggerParams;
        return (((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + (list == null ? 0 : list.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAlgoOrdType(String str) {
        this.algoOrdType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setApy(String str) {
        this.apy = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCcy(String str) {
        this.ccy = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDirection(String str) {
        this.direction = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDuration(String str) {
        this.duration = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInitOrdPct(String str) {
        this.initOrdPct = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInitOrds(String str) {
        this.initOrds = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInstId(String str) {
        this.instId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLever(String str) {
        this.lever = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMaxSafetyOrds(String str) {
        this.maxSafetyOrds = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMinInvestment(String str) {
        this.minInvestment = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPxSteps(String str) {
        this.pxSteps = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPxStepsMult(String str) {
        this.pxStepsMult = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setReserveFunds(boolean z) {
        this.reserveFunds = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSlMode(String str) {
        this.slMode = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSlPct(String str) {
        this.slPct = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTpPct(String str) {
        this.tpPct = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTriggerParams(List<DcaTriggerParam> list) {
        this.triggerParams = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTriggerType(String str) {
        this.triggerType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setVolMult(String str) {
        this.volMult = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "DcaAiData(instId=" + this.instId + ", algoOrdType=" + this.algoOrdType + ", direction=" + this.direction + ", apy=" + this.apy + ", reserveFunds=" + this.reserveFunds + ", triggerType=" + this.triggerType + ", initOrds=" + this.initOrds + ", initOrdPct=" + this.initOrdPct + ", maxSafetyOrds=" + this.maxSafetyOrds + ", duration=" + this.duration + ", pxSteps=" + this.pxSteps + ", pxStepsMult=" + this.pxStepsMult + ", volMult=" + this.volMult + ", tpPct=" + this.tpPct + ", slPct=" + this.slPct + ", minInvestment=" + this.minInvestment + ", ccy=" + this.ccy + ", lever=" + this.lever + ", slMode=" + this.slMode + ", triggerParams=" + this.triggerParams + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.instId);
        parcel.writeString(this.algoOrdType);
        parcel.writeString(this.direction);
        parcel.writeString(this.apy);
        parcel.writeInt(this.reserveFunds ? 1 : 0);
        parcel.writeString(this.triggerType);
        parcel.writeString(this.initOrds);
        parcel.writeString(this.initOrdPct);
        parcel.writeString(this.maxSafetyOrds);
        parcel.writeString(this.duration);
        parcel.writeString(this.pxSteps);
        parcel.writeString(this.pxStepsMult);
        parcel.writeString(this.volMult);
        parcel.writeString(this.tpPct);
        parcel.writeString(this.slPct);
        parcel.writeString(this.minInvestment);
        parcel.writeString(this.ccy);
        parcel.writeString(this.lever);
        parcel.writeString(this.slMode);
        List<DcaTriggerParam> list = this.triggerParams;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(list.size());
        Iterator<DcaTriggerParam> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
    }

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.DcaAiData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<DcaAiData> serializer() {
            return DcaAiData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ DcaAiData(int i, String str, String str2, String str3, String str4, boolean z, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.instId = null;
        } else {
            this.instId = str;
        }
        if ((i & 2) == 0) {
            this.algoOrdType = null;
        } else {
            this.algoOrdType = str2;
        }
        if ((i & 4) == 0) {
            this.direction = null;
        } else {
            this.direction = str3;
        }
        if ((i & 8) == 0) {
            this.apy = null;
        } else {
            this.apy = str4;
        }
        this.reserveFunds = (i & 16) == 0 ? false : z;
        if ((i & 32) == 0) {
            this.triggerType = null;
        } else {
            this.triggerType = str5;
        }
        if ((i & 64) == 0) {
            this.initOrds = null;
        } else {
            this.initOrds = str6;
        }
        if ((i & 128) == 0) {
            this.initOrdPct = null;
        } else {
            this.initOrdPct = str7;
        }
        if ((i & 256) == 0) {
            this.maxSafetyOrds = null;
        } else {
            this.maxSafetyOrds = str8;
        }
        if ((i & 512) == 0) {
            this.duration = null;
        } else {
            this.duration = str9;
        }
        if ((i & 1024) == 0) {
            this.pxSteps = null;
        } else {
            this.pxSteps = str10;
        }
        if ((i & 2048) == 0) {
            this.pxStepsMult = null;
        } else {
            this.pxStepsMult = str11;
        }
        if ((i & 4096) == 0) {
            this.volMult = null;
        } else {
            this.volMult = str12;
        }
        if ((i & 8192) == 0) {
            this.tpPct = null;
        } else {
            this.tpPct = str13;
        }
        if ((i & 16384) == 0) {
            this.slPct = null;
        } else {
            this.slPct = str14;
        }
        if ((32768 & i) == 0) {
            this.minInvestment = null;
        } else {
            this.minInvestment = str15;
        }
        if ((65536 & i) == 0) {
            this.ccy = null;
        } else {
            this.ccy = str16;
        }
        if ((131072 & i) == 0) {
            this.lever = null;
        } else {
            this.lever = str17;
        }
        if ((262144 & i) == 0) {
            this.slMode = null;
        } else {
            this.slMode = str18;
        }
        if ((i & 524288) == 0) {
            this.triggerParams = null;
        } else {
            this.triggerParams = list;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(DcaAiData dcaAiData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || dcaAiData.instId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, dcaAiData.instId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || dcaAiData.algoOrdType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, dcaAiData.algoOrdType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || dcaAiData.direction != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, dcaAiData.direction);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || dcaAiData.apy != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, dcaAiData.apy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || dcaAiData.reserveFunds) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 4, dcaAiData.reserveFunds);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || dcaAiData.triggerType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, dcaAiData.triggerType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || dcaAiData.initOrds != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, dcaAiData.initOrds);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || dcaAiData.initOrdPct != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, dcaAiData.initOrdPct);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || dcaAiData.maxSafetyOrds != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, dcaAiData.maxSafetyOrds);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || dcaAiData.duration != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, dcaAiData.duration);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || dcaAiData.pxSteps != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, StringSerializer.INSTANCE, dcaAiData.pxSteps);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || dcaAiData.pxStepsMult != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, StringSerializer.INSTANCE, dcaAiData.pxStepsMult);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || dcaAiData.volMult != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, StringSerializer.INSTANCE, dcaAiData.volMult);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || dcaAiData.tpPct != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 13, StringSerializer.INSTANCE, dcaAiData.tpPct);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || dcaAiData.slPct != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 14, StringSerializer.INSTANCE, dcaAiData.slPct);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || dcaAiData.minInvestment != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 15, StringSerializer.INSTANCE, dcaAiData.minInvestment);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || dcaAiData.ccy != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 16, StringSerializer.INSTANCE, dcaAiData.ccy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || dcaAiData.lever != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 17, StringSerializer.INSTANCE, dcaAiData.lever);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) || dcaAiData.slMode != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 18, StringSerializer.INSTANCE, dcaAiData.slMode);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 19) && dcaAiData.triggerParams == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 19, kSerializerArr[19], dcaAiData.triggerParams);
    }

    public DcaAiData(String str, String str2, String str3, String str4, boolean z, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, List<DcaTriggerParam> list) {
        this.instId = str;
        this.algoOrdType = str2;
        this.direction = str3;
        this.apy = str4;
        this.reserveFunds = z;
        this.triggerType = str5;
        this.initOrds = str6;
        this.initOrdPct = str7;
        this.maxSafetyOrds = str8;
        this.duration = str9;
        this.pxSteps = str10;
        this.pxStepsMult = str11;
        this.volMult = str12;
        this.tpPct = str13;
        this.slPct = str14;
        this.minInvestment = str15;
        this.ccy = str16;
        this.lever = str17;
        this.slMode = str18;
        this.triggerParams = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00db: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r42v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r22v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r42v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r23v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0012: ARITH (r42v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r24v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001a: ARITH (r42v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r25v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0022: ARITH (r42v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? false : (r26v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002a: ARITH (r42v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r27v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0032: ARITH (r42v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r28v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003a: ARITH (r42v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r29v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0042: ARITH (r42v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r30v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004a: ARITH (r42v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r31v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0052: ARITH (r42v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r32v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005a: ARITH (r42v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r33v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0062: ARITH (r42v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r34v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x006a: ARITH (r42v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r35v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0072: ARITH (r42v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r36v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x007d: ARITH (r42v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r37v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0088: ARITH (r42v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r38v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0093: ARITH (r42v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r39v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x009e: ARITH (r42v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r40v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x00a9: ARITH (r42v0 int) & (524288 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r41v0 java.util.List))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List<com.okinc.unify_trade.biz.DcaTriggerParam>):void (m)] (LINE:2740) call: com.okinc.unify_trade.biz.DcaAiData.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List):void type: THIS */
    public /* synthetic */ DcaAiData(String str, String str2, String str3, String str4, boolean z, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? false : z, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : str6, (i & 128) != 0 ? null : str7, (i & 256) != 0 ? null : str8, (i & 512) != 0 ? null : str9, (i & 1024) != 0 ? null : str10, (i & 2048) != 0 ? null : str11, (i & 4096) != 0 ? null : str12, (i & 8192) != 0 ? null : str13, (i & 16384) != 0 ? null : str14, (i & 32768) != 0 ? null : str15, (i & 65536) != 0 ? null : str16, (i & 131072) != 0 ? null : str17, (i & 262144) != 0 ? null : str18, (i & 524288) != 0 ? null : list);
    }
}
