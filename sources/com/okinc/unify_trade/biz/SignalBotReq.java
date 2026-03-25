package com.okinc.unify_trade.biz;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.unify_trade.bot.data.SignalCoinPairItemData;
import com.okinc.unify_trade.bot.data.SignalCoinPairItemData$$serializer;
import java.util.ArrayList;
import java.util.Iterator;
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

/* JADX INFO: loaded from: classes11.dex */
@Serializable
public final class SignalBotReq implements Parcelable {
    private boolean allowMultipleEntry;
    private boolean containsUnSupportPair;
    private String instId;
    private ArrayList<String> instIds;
    private String lever;
    private String ordType;
    private String ratio;
    private ExitSignalOrderAmtParam signalBotOrderStopParam;
    private String signalChanId;
    private ThirdSignalDetail signalItem;
    private EntrySignalOrderAmtParam signalOrderAmtParam;
    private String subOrdType;
    private String totalAmt;
    private ArrayList<SignalCoinPairItemData> totalCoinPairs;
    private AutoVipProfitInfo vipProfit;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<SignalBotReq> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, new ArrayListSerializer(StringSerializer.INSTANCE), null, null, null, null, null, null, null, null, null, new ArrayListSerializer(SignalCoinPairItemData$$serializer.INSTANCE), null, null};

    public static final class Creator implements Parcelable.Creator<SignalBotReq> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SignalBotReq createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            EntrySignalOrderAmtParam entrySignalOrderAmtParamCreateFromParcel = parcel.readInt() == 0 ? null : EntrySignalOrderAmtParam.CREATOR.createFromParcel(parcel);
            ExitSignalOrderAmtParam exitSignalOrderAmtParamCreateFromParcel = parcel.readInt() == 0 ? null : ExitSignalOrderAmtParam.CREATOR.createFromParcel(parcel);
            boolean z = parcel.readInt() != 0;
            ThirdSignalDetail thirdSignalDetailCreateFromParcel = parcel.readInt() == 0 ? null : ThirdSignalDetail.CREATOR.createFromParcel(parcel);
            boolean z2 = parcel.readInt() != 0;
            int i = parcel.readInt();
            boolean z3 = z2;
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(parcel.readParcelable(SignalBotReq.class.getClassLoader()));
            }
            return new SignalBotReq(string, string2, arrayListCreateStringArrayList, string3, string4, string5, string6, entrySignalOrderAmtParamCreateFromParcel, exitSignalOrderAmtParamCreateFromParcel, z, thirdSignalDetailCreateFromParcel, z3, arrayList, parcel.readString(), parcel.readInt() == 0 ? null : AutoVipProfitInfo.CREATOR.createFromParcel(parcel));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SignalBotReq[] newArray(int i) {
            return new SignalBotReq[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SignalBotReq() {
        this((String) null, (String) null, (ArrayList) null, (String) null, (String) null, (String) null, (String) null, (EntrySignalOrderAmtParam) null, (ExitSignalOrderAmtParam) null, false, (ThirdSignalDetail) null, false, (ArrayList) null, (String) null, (AutoVipProfitInfo) null, 32767, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.signalChanId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component10() {
        return this.allowMultipleEntry;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ThirdSignalDetail component11() {
        return this.signalItem;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component12() {
        return this.containsUnSupportPair;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<SignalCoinPairItemData> component13() {
        return this.totalCoinPairs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AutoVipProfitInfo component15() {
        return this.vipProfit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.ordType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<String> component3() {
        return this.instIds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.lever;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.totalAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.subOrdType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.ratio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EntrySignalOrderAmtParam component8() {
        return this.signalOrderAmtParam;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ExitSignalOrderAmtParam component9() {
        return this.signalBotOrderStopParam;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SignalBotReq copy(@NotNull String str, @NotNull String str2, @NotNull ArrayList<String> arrayList, @NotNull String str3, @NotNull String str4, @NotNull String str5, String str6, EntrySignalOrderAmtParam entrySignalOrderAmtParam, ExitSignalOrderAmtParam exitSignalOrderAmtParam, boolean z, ThirdSignalDetail thirdSignalDetail, boolean z2, @NotNull ArrayList<SignalCoinPairItemData> arrayList2, String str7, AutoVipProfitInfo autoVipProfitInfo) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(arrayList, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(arrayList2, "");
        return new SignalBotReq(str, str2, arrayList, str3, str4, str5, str6, entrySignalOrderAmtParam, exitSignalOrderAmtParam, z, thirdSignalDetail, z2, arrayList2, str7, autoVipProfitInfo);
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
        if (!(obj instanceof SignalBotReq)) {
            return false;
        }
        SignalBotReq signalBotReq = (SignalBotReq) obj;
        return Intrinsics.EZpvd((Object) this.signalChanId, (Object) signalBotReq.signalChanId) && Intrinsics.EZpvd((Object) this.ordType, (Object) signalBotReq.ordType) && Intrinsics.EZpvd(this.instIds, signalBotReq.instIds) && Intrinsics.EZpvd((Object) this.lever, (Object) signalBotReq.lever) && Intrinsics.EZpvd((Object) this.totalAmt, (Object) signalBotReq.totalAmt) && Intrinsics.EZpvd((Object) this.subOrdType, (Object) signalBotReq.subOrdType) && Intrinsics.EZpvd((Object) this.ratio, (Object) signalBotReq.ratio) && Intrinsics.EZpvd(this.signalOrderAmtParam, signalBotReq.signalOrderAmtParam) && Intrinsics.EZpvd(this.signalBotOrderStopParam, signalBotReq.signalBotOrderStopParam) && this.allowMultipleEntry == signalBotReq.allowMultipleEntry && Intrinsics.EZpvd(this.signalItem, signalBotReq.signalItem) && this.containsUnSupportPair == signalBotReq.containsUnSupportPair && Intrinsics.EZpvd(this.totalCoinPairs, signalBotReq.totalCoinPairs) && Intrinsics.EZpvd((Object) this.instId, (Object) signalBotReq.instId) && Intrinsics.EZpvd(this.vipProfit, signalBotReq.vipProfit);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getAllowMultipleEntry() {
        return this.allowMultipleEntry;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getContainsUnSupportPair() {
        return this.containsUnSupportPair;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInstId() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<String> getInstIds() {
        return this.instIds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLever() {
        return this.lever;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOrdType() {
        return this.ordType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRatio() {
        return this.ratio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ExitSignalOrderAmtParam getSignalBotOrderStopParam() {
        return this.signalBotOrderStopParam;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSignalChanId() {
        return this.signalChanId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ThirdSignalDetail getSignalItem() {
        return this.signalItem;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EntrySignalOrderAmtParam getSignalOrderAmtParam() {
        return this.signalOrderAmtParam;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSubOrdType() {
        return this.subOrdType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTotalAmt() {
        return this.totalAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<SignalCoinPairItemData> getTotalCoinPairs() {
        return this.totalCoinPairs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AutoVipProfitInfo getVipProfit() {
        return this.vipProfit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.signalChanId.hashCode();
        int iHashCode2 = this.ordType.hashCode();
        int iHashCode3 = this.instIds.hashCode();
        int iHashCode4 = this.lever.hashCode();
        int iHashCode5 = this.totalAmt.hashCode();
        int iHashCode6 = this.subOrdType.hashCode();
        String str = this.ratio;
        int iHashCode7 = str == null ? 0 : str.hashCode();
        EntrySignalOrderAmtParam entrySignalOrderAmtParam = this.signalOrderAmtParam;
        int iHashCode8 = entrySignalOrderAmtParam == null ? 0 : entrySignalOrderAmtParam.hashCode();
        ExitSignalOrderAmtParam exitSignalOrderAmtParam = this.signalBotOrderStopParam;
        int iHashCode9 = exitSignalOrderAmtParam == null ? 0 : exitSignalOrderAmtParam.hashCode();
        int iHashCode10 = Boolean.hashCode(this.allowMultipleEntry);
        ThirdSignalDetail thirdSignalDetail = this.signalItem;
        int iHashCode11 = thirdSignalDetail == null ? 0 : thirdSignalDetail.hashCode();
        int iHashCode12 = Boolean.hashCode(this.containsUnSupportPair);
        int iHashCode13 = this.totalCoinPairs.hashCode();
        String str2 = this.instId;
        int iHashCode14 = str2 == null ? 0 : str2.hashCode();
        AutoVipProfitInfo autoVipProfitInfo = this.vipProfit;
        return (((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + (autoVipProfitInfo == null ? 0 : autoVipProfitInfo.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAllowMultipleEntry(boolean z) {
        this.allowMultipleEntry = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setContainsUnSupportPair(boolean z) {
        this.containsUnSupportPair = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInstId(String str) {
        this.instId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInstIds(@NotNull ArrayList<String> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        this.instIds = arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLever(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.lever = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOrdType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.ordType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRatio(String str) {
        this.ratio = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSignalBotOrderStopParam(ExitSignalOrderAmtParam exitSignalOrderAmtParam) {
        this.signalBotOrderStopParam = exitSignalOrderAmtParam;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSignalChanId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.signalChanId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSignalItem(ThirdSignalDetail thirdSignalDetail) {
        this.signalItem = thirdSignalDetail;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSignalOrderAmtParam(EntrySignalOrderAmtParam entrySignalOrderAmtParam) {
        this.signalOrderAmtParam = entrySignalOrderAmtParam;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSubOrdType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.subOrdType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTotalAmt(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.totalAmt = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTotalCoinPairs(@NotNull ArrayList<SignalCoinPairItemData> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        this.totalCoinPairs = arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setVipProfit(AutoVipProfitInfo autoVipProfitInfo) {
        this.vipProfit = autoVipProfitInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SignalBotReq(signalChanId=" + this.signalChanId + ", ordType=" + this.ordType + ", instIds=" + this.instIds + ", lever=" + this.lever + ", totalAmt=" + this.totalAmt + ", subOrdType=" + this.subOrdType + ", ratio=" + this.ratio + ", signalOrderAmtParam=" + this.signalOrderAmtParam + ", signalBotOrderStopParam=" + this.signalBotOrderStopParam + ", allowMultipleEntry=" + this.allowMultipleEntry + ", signalItem=" + this.signalItem + ", containsUnSupportPair=" + this.containsUnSupportPair + ", totalCoinPairs=" + this.totalCoinPairs + ", instId=" + this.instId + ", vipProfit=" + this.vipProfit + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.signalChanId);
        parcel.writeString(this.ordType);
        parcel.writeStringList(this.instIds);
        parcel.writeString(this.lever);
        parcel.writeString(this.totalAmt);
        parcel.writeString(this.subOrdType);
        parcel.writeString(this.ratio);
        EntrySignalOrderAmtParam entrySignalOrderAmtParam = this.signalOrderAmtParam;
        if (entrySignalOrderAmtParam == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            entrySignalOrderAmtParam.writeToParcel(parcel, i);
        }
        ExitSignalOrderAmtParam exitSignalOrderAmtParam = this.signalBotOrderStopParam;
        if (exitSignalOrderAmtParam == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            exitSignalOrderAmtParam.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.allowMultipleEntry ? 1 : 0);
        ThirdSignalDetail thirdSignalDetail = this.signalItem;
        if (thirdSignalDetail == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            thirdSignalDetail.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.containsUnSupportPair ? 1 : 0);
        ArrayList<SignalCoinPairItemData> arrayList = this.totalCoinPairs;
        parcel.writeInt(arrayList.size());
        Iterator<SignalCoinPairItemData> it = arrayList.iterator();
        while (it.hasNext()) {
            parcel.writeParcelable(it.next(), i);
        }
        parcel.writeString(this.instId);
        AutoVipProfitInfo autoVipProfitInfo = this.vipProfit;
        if (autoVipProfitInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            autoVipProfitInfo.writeToParcel(parcel, i);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.SignalBotReq.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SignalBotReq> serializer() {
            return SignalBotReq$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SignalBotReq(int i, String str, String str2, ArrayList arrayList, String str3, String str4, String str5, String str6, EntrySignalOrderAmtParam entrySignalOrderAmtParam, ExitSignalOrderAmtParam exitSignalOrderAmtParam, boolean z, ThirdSignalDetail thirdSignalDetail, boolean z2, ArrayList arrayList2, String str7, AutoVipProfitInfo autoVipProfitInfo, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.signalChanId = "";
        } else {
            this.signalChanId = str;
        }
        if ((i & 2) == 0) {
            this.ordType = "";
        } else {
            this.ordType = str2;
        }
        this.instIds = (i & 4) == 0 ? new ArrayList() : arrayList;
        if ((i & 8) == 0) {
            this.lever = "";
        } else {
            this.lever = str3;
        }
        if ((i & 16) == 0) {
            this.totalAmt = "";
        } else {
            this.totalAmt = str4;
        }
        if ((i & 32) == 0) {
            this.subOrdType = "";
        } else {
            this.subOrdType = str5;
        }
        if ((i & 64) == 0) {
            this.ratio = null;
        } else {
            this.ratio = str6;
        }
        if ((i & 128) == 0) {
            this.signalOrderAmtParam = null;
        } else {
            this.signalOrderAmtParam = entrySignalOrderAmtParam;
        }
        if ((i & 256) == 0) {
            this.signalBotOrderStopParam = null;
        } else {
            this.signalBotOrderStopParam = exitSignalOrderAmtParam;
        }
        this.allowMultipleEntry = (i & 512) == 0 ? true : z;
        if ((i & 1024) == 0) {
            this.signalItem = null;
        } else {
            this.signalItem = thirdSignalDetail;
        }
        this.containsUnSupportPair = (i & 2048) == 0 ? false : z2;
        this.totalCoinPairs = (i & 4096) == 0 ? new ArrayList() : arrayList2;
        if ((i & 8192) == 0) {
            this.instId = null;
        } else {
            this.instId = str7;
        }
        if ((i & 16384) == 0) {
            this.vipProfit = null;
        } else {
            this.vipProfit = autoVipProfitInfo;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(SignalBotReq signalBotReq, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) signalBotReq.signalChanId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, signalBotReq.signalChanId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) signalBotReq.ordType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, signalBotReq.ordType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd(signalBotReq.instIds, new ArrayList())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], signalBotReq.instIds);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) signalBotReq.lever, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, signalBotReq.lever);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) signalBotReq.totalAmt, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, signalBotReq.totalAmt);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) signalBotReq.subOrdType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, signalBotReq.subOrdType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || signalBotReq.ratio != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, signalBotReq.ratio);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || signalBotReq.signalOrderAmtParam != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, EntrySignalOrderAmtParam$$serializer.INSTANCE, signalBotReq.signalOrderAmtParam);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || signalBotReq.signalBotOrderStopParam != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, ExitSignalOrderAmtParam$$serializer.INSTANCE, signalBotReq.signalBotOrderStopParam);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !signalBotReq.allowMultipleEntry) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 9, signalBotReq.allowMultipleEntry);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || signalBotReq.signalItem != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, ThirdSignalDetail$$serializer.INSTANCE, signalBotReq.signalItem);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || signalBotReq.containsUnSupportPair) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 11, signalBotReq.containsUnSupportPair);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || !Intrinsics.EZpvd(signalBotReq.totalCoinPairs, new ArrayList())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 12, kSerializerArr[12], signalBotReq.totalCoinPairs);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || signalBotReq.instId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 13, StringSerializer.INSTANCE, signalBotReq.instId);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) && signalBotReq.vipProfit == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 14, AutoVipProfitInfo$$serializer.INSTANCE, signalBotReq.vipProfit);
    }

    public SignalBotReq(@NotNull String str, @NotNull String str2, @NotNull ArrayList<String> arrayList, @NotNull String str3, @NotNull String str4, @NotNull String str5, String str6, EntrySignalOrderAmtParam entrySignalOrderAmtParam, ExitSignalOrderAmtParam exitSignalOrderAmtParam, boolean z, ThirdSignalDetail thirdSignalDetail, boolean z2, @NotNull ArrayList<SignalCoinPairItemData> arrayList2, String str7, AutoVipProfitInfo autoVipProfitInfo) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(arrayList, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(arrayList2, "");
        this.signalChanId = str;
        this.ordType = str2;
        this.instIds = arrayList;
        this.lever = str3;
        this.totalAmt = str4;
        this.subOrdType = str5;
        this.ratio = str6;
        this.signalOrderAmtParam = entrySignalOrderAmtParam;
        this.signalBotOrderStopParam = exitSignalOrderAmtParam;
        this.allowMultipleEntry = z;
        this.signalItem = thirdSignalDetail;
        this.containsUnSupportPair = z2;
        this.totalCoinPairs = arrayList2;
        this.instId = str7;
        this.vipProfit = autoVipProfitInfo;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00a3: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r32v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r32v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r18v0 java.lang.String))
  (wrap:java.util.ArrayList:?: TERNARY null = ((wrap:int:0x0014: ARITH (r32v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x001a: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:521) call: java.util.ArrayList.<init>():void type: CONSTRUCTOR) : (r19v0 java.util.ArrayList))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0020: ARITH (r32v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0028: ARITH (r32v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0030: ARITH (r32v0 int) & (32 int) A[WRAPPED]) == (0 int)) ? (r22v0 java.lang.String) : (""))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0037: ARITH (r32v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r23v0 java.lang.String))
  (wrap:com.okinc.unify_trade.biz.EntrySignalOrderAmtParam:?: TERNARY null = ((wrap:int:0x0040: ARITH (r32v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.unify_trade.biz.EntrySignalOrderAmtParam) : (r24v0 com.okinc.unify_trade.biz.EntrySignalOrderAmtParam))
  (wrap:com.okinc.unify_trade.biz.ExitSignalOrderAmtParam:?: TERNARY null = ((wrap:int:0x0048: ARITH (r32v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.unify_trade.biz.ExitSignalOrderAmtParam) : (r25v0 com.okinc.unify_trade.biz.ExitSignalOrderAmtParam))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0050: ARITH (r32v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? true : (r26v0 boolean))
  (wrap:com.okinc.unify_trade.biz.ThirdSignalDetail:?: TERNARY null = ((wrap:int:0x0058: ARITH (r32v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.unify_trade.biz.ThirdSignalDetail) : (r27v0 com.okinc.unify_trade.biz.ThirdSignalDetail))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0060: ARITH (r32v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? false : (r28v0 boolean))
  (wrap:java.util.ArrayList:?: TERNARY null = ((wrap:int:0x0068: ARITH (r32v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x006e: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:531) call: java.util.ArrayList.<init>():void type: CONSTRUCTOR) : (r29v0 java.util.ArrayList))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0074: ARITH (r32v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r30v0 java.lang.String))
  (wrap:com.okinc.unify_trade.biz.AutoVipProfitInfo:?: TERNARY null = ((wrap:int:0x007c: ARITH (r32v0 int) & (16384 int) A[WRAPPED]) == (0 int)) ? (r31v0 com.okinc.unify_trade.biz.AutoVipProfitInfo) : (null com.okinc.unify_trade.biz.AutoVipProfitInfo))
 A[MD:(java.lang.String, java.lang.String, java.util.ArrayList<java.lang.String>, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.unify_trade.biz.EntrySignalOrderAmtParam, com.okinc.unify_trade.biz.ExitSignalOrderAmtParam, boolean, com.okinc.unify_trade.biz.ThirdSignalDetail, boolean, java.util.ArrayList<com.okinc.unify_trade.bot.data.SignalCoinPairItemData>, java.lang.String, com.okinc.unify_trade.biz.AutoVipProfitInfo):void (m)] (LINE:518) call: com.okinc.unify_trade.biz.SignalBotReq.<init>(java.lang.String, java.lang.String, java.util.ArrayList, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.unify_trade.biz.EntrySignalOrderAmtParam, com.okinc.unify_trade.biz.ExitSignalOrderAmtParam, boolean, com.okinc.unify_trade.biz.ThirdSignalDetail, boolean, java.util.ArrayList, java.lang.String, com.okinc.unify_trade.biz.AutoVipProfitInfo):void type: THIS */
    public /* synthetic */ SignalBotReq(String str, String str2, ArrayList arrayList, String str3, String str4, String str5, String str6, EntrySignalOrderAmtParam entrySignalOrderAmtParam, ExitSignalOrderAmtParam exitSignalOrderAmtParam, boolean z, ThirdSignalDetail thirdSignalDetail, boolean z2, ArrayList arrayList2, String str7, AutoVipProfitInfo autoVipProfitInfo, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? new ArrayList() : arrayList, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? "" : str4, (i & 32) == 0 ? str5 : "", (i & 64) != 0 ? null : str6, (i & 128) != 0 ? null : entrySignalOrderAmtParam, (i & 256) != 0 ? null : exitSignalOrderAmtParam, (i & 512) != 0 ? true : z, (i & 1024) != 0 ? null : thirdSignalDetail, (i & 2048) != 0 ? false : z2, (i & 4096) != 0 ? new ArrayList() : arrayList2, (i & 8192) != 0 ? null : str7, (i & 16384) == 0 ? autoVipProfitInfo : null);
    }
}
