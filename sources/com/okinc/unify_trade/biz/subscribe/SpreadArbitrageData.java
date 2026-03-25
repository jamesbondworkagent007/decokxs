package com.okinc.unify_trade.biz.subscribe;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.okinc.unify_trade.biz.ArbitrageSetFavoriteBean;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.InterfaceC55813xqy;
import o.pUU;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Serializable
public final class SpreadArbitrageData implements Parcelable, InterfaceC55813xqy {
    private String apy;
    private String arbitrageId;
    private String arbitrageType;
    private String buyInstAlias;
    private String buyInstId;
    private String buyInstType;
    private String ccy;
    private String ccyType;
    private String ctType;
    private String duration;
    private String groupType;
    private String instFamily;
    private boolean isSearchVisible;
    private boolean isShow;
    private String notionalUsd;
    private String sellInstAlias;
    private String sellInstId;
    private String sellInstType;
    private String spread;
    private String state;
    private String ts;
    private String type;
    private String uly;
    private String yieldPer10K;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<SpreadArbitrageData> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<SpreadArbitrageData> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SpreadArbitrageData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new SpreadArbitrageData(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SpreadArbitrageData[] newArray(int i) {
            return new SpreadArbitrageData[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SpreadArbitrageData() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, false, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 16777215, (DefaultConstructorMarker) null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getApy() {
        return this.apy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC55813xqy
    public String getArbCcy() {
        String str = this.ccy;
        return str == null ? "" : str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC55813xqy
    public String getArbCtType() {
        String str = this.ctType;
        return str == null ? "" : str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC55813xqy
    public String getArbGroupType() {
        String str = this.groupType;
        return str == null ? "" : str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC55813xqy
    public String getArbId() {
        String str = this.arbitrageId;
        return str == null ? "" : str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC55813xqy
    public String getArbLeftInstId() {
        String str = this.sellInstId;
        return str == null ? "" : str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC55813xqy
    public String getArbLeftInstType() {
        String str = this.sellInstType;
        return str == null ? "" : str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getArbLeftSide() {
        return "sell";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC55813xqy
    public String getArbRightInstId() {
        String str = this.buyInstId;
        return str == null ? "" : str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC55813xqy
    public String getArbRightInstType() {
        String str = this.buyInstType;
        return str == null ? "" : str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getArbRightSide() {
        return "buy";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC55813xqy
    public String getArbType() {
        String str = this.arbitrageType;
        return str == null ? "" : str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getArbitrageId() {
        return this.arbitrageId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getArbitrageType() {
        return this.arbitrageType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBuyInstAlias() {
        return this.buyInstAlias;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBuyInstId() {
        return this.buyInstId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBuyInstType() {
        return this.buyInstType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCcy() {
        return this.ccy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCcyType() {
        return this.ccyType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCtType() {
        return this.ctType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDuration() {
        return this.duration;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getGroupType() {
        return this.groupType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInstFamily() {
        return this.instFamily;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNotionalUsd() {
        return this.notionalUsd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSellInstAlias() {
        return this.sellInstAlias;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSellInstId() {
        return this.sellInstId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSellInstType() {
        return this.sellInstType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSpread() {
        return this.spread;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getState() {
        return this.state;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTs() {
        return this.ts;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getType() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUly() {
        return this.uly;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getYieldPer10K() {
        return this.yieldPer10K;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isSearchVisible() {
        return this.isSearchVisible;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isShow() {
        return this.isShow;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setApy(String str) {
        this.apy = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setArbitrageId(String str) {
        this.arbitrageId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setArbitrageType(String str) {
        this.arbitrageType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBuyInstAlias(String str) {
        this.buyInstAlias = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBuyInstId(String str) {
        this.buyInstId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBuyInstType(String str) {
        this.buyInstType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCcy(String str) {
        this.ccy = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCcyType(String str) {
        this.ccyType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCtType(String str) {
        this.ctType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDuration(String str) {
        this.duration = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setGroupType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.groupType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInstFamily(String str) {
        this.instFamily = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNotionalUsd(String str) {
        this.notionalUsd = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSearchVisible(boolean z) {
        this.isSearchVisible = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSellInstAlias(String str) {
        this.sellInstAlias = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSellInstId(String str) {
        this.sellInstId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSellInstType(String str) {
        this.sellInstType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setShow(boolean z) {
        this.isShow = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSpread(String str) {
        this.spread = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setState(String str) {
        this.state = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTs(String str) {
        this.ts = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setType(String str) {
        this.type = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUly(String str) {
        this.uly = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setYieldPer10K(String str) {
        this.yieldPer10K = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.arbitrageId);
        parcel.writeString(this.buyInstId);
        parcel.writeString(this.sellInstId);
        parcel.writeString(this.buyInstType);
        parcel.writeString(this.sellInstType);
        parcel.writeString(this.buyInstAlias);
        parcel.writeString(this.sellInstAlias);
        parcel.writeString(this.apy);
        parcel.writeString(this.spread);
        parcel.writeString(this.type);
        parcel.writeString(this.uly);
        parcel.writeString(this.state);
        parcel.writeString(this.ts);
        parcel.writeInt(this.isShow ? 1 : 0);
        parcel.writeInt(this.isSearchVisible ? 1 : 0);
        parcel.writeString(this.ccy);
        parcel.writeString(this.yieldPer10K);
        parcel.writeString(this.duration);
        parcel.writeString(this.notionalUsd);
        parcel.writeString(this.groupType);
        parcel.writeString(this.ctType);
        parcel.writeString(this.arbitrageType);
        parcel.writeString(this.ccyType);
        parcel.writeString(this.instFamily);
    }

    public /* synthetic */ SpreadArbitrageData(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, boolean z, boolean z2, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.arbitrageId = null;
        } else {
            this.arbitrageId = str;
        }
        if ((i & 2) == 0) {
            this.buyInstId = null;
        } else {
            this.buyInstId = str2;
        }
        if ((i & 4) == 0) {
            this.sellInstId = null;
        } else {
            this.sellInstId = str3;
        }
        if ((i & 8) == 0) {
            this.buyInstType = null;
        } else {
            this.buyInstType = str4;
        }
        if ((i & 16) == 0) {
            this.sellInstType = null;
        } else {
            this.sellInstType = str5;
        }
        if ((i & 32) == 0) {
            this.buyInstAlias = null;
        } else {
            this.buyInstAlias = str6;
        }
        if ((i & 64) == 0) {
            this.sellInstAlias = null;
        } else {
            this.sellInstAlias = str7;
        }
        if ((i & 128) == 0) {
            this.apy = null;
        } else {
            this.apy = str8;
        }
        if ((i & 256) == 0) {
            this.spread = null;
        } else {
            this.spread = str9;
        }
        if ((i & 512) == 0) {
            this.type = null;
        } else {
            this.type = str10;
        }
        if ((i & 1024) == 0) {
            this.uly = null;
        } else {
            this.uly = str11;
        }
        if ((i & 2048) == 0) {
            this.state = null;
        } else {
            this.state = str12;
        }
        if ((i & 4096) == 0) {
            this.ts = null;
        } else {
            this.ts = str13;
        }
        this.isShow = (i & 8192) == 0 ? true : z;
        this.isSearchVisible = (i & 16384) == 0 ? false : z2;
        if ((32768 & i) == 0) {
            this.ccy = null;
        } else {
            this.ccy = str14;
        }
        if ((65536 & i) == 0) {
            this.yieldPer10K = null;
        } else {
            this.yieldPer10K = str15;
        }
        if ((131072 & i) == 0) {
            this.duration = null;
        } else {
            this.duration = str16;
        }
        if ((262144 & i) == 0) {
            this.notionalUsd = null;
        } else {
            this.notionalUsd = str17;
        }
        this.groupType = (524288 & i) == 0 ? "spread" : str18;
        if ((1048576 & i) == 0) {
            this.ctType = null;
        } else {
            this.ctType = str19;
        }
        if ((2097152 & i) == 0) {
            this.arbitrageType = null;
        } else {
            this.arbitrageType = str20;
        }
        if ((4194304 & i) == 0) {
            this.ccyType = null;
        } else {
            this.ccyType = str21;
        }
        if ((i & 8388608) == 0) {
            this.instFamily = null;
        } else {
            this.instFamily = str22;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(SpreadArbitrageData spreadArbitrageData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || spreadArbitrageData.arbitrageId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, spreadArbitrageData.arbitrageId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || spreadArbitrageData.buyInstId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, spreadArbitrageData.buyInstId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || spreadArbitrageData.sellInstId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, spreadArbitrageData.sellInstId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || spreadArbitrageData.buyInstType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, spreadArbitrageData.buyInstType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || spreadArbitrageData.sellInstType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, spreadArbitrageData.sellInstType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || spreadArbitrageData.buyInstAlias != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, spreadArbitrageData.buyInstAlias);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || spreadArbitrageData.sellInstAlias != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, spreadArbitrageData.sellInstAlias);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || spreadArbitrageData.apy != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, spreadArbitrageData.apy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || spreadArbitrageData.spread != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, spreadArbitrageData.spread);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || spreadArbitrageData.type != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, spreadArbitrageData.type);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || spreadArbitrageData.uly != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, StringSerializer.INSTANCE, spreadArbitrageData.uly);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || spreadArbitrageData.state != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, StringSerializer.INSTANCE, spreadArbitrageData.state);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || spreadArbitrageData.ts != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, StringSerializer.INSTANCE, spreadArbitrageData.ts);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || !spreadArbitrageData.isShow) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 13, spreadArbitrageData.isShow);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || spreadArbitrageData.isSearchVisible) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 14, spreadArbitrageData.isSearchVisible);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || spreadArbitrageData.ccy != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 15, StringSerializer.INSTANCE, spreadArbitrageData.ccy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || spreadArbitrageData.yieldPer10K != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 16, StringSerializer.INSTANCE, spreadArbitrageData.yieldPer10K);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || spreadArbitrageData.duration != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 17, StringSerializer.INSTANCE, spreadArbitrageData.duration);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) || spreadArbitrageData.notionalUsd != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 18, StringSerializer.INSTANCE, spreadArbitrageData.notionalUsd);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 19) || !Intrinsics.EZpvd((Object) spreadArbitrageData.groupType, (Object) "spread")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 19, spreadArbitrageData.groupType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 20) || spreadArbitrageData.ctType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 20, StringSerializer.INSTANCE, spreadArbitrageData.ctType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 21) || spreadArbitrageData.arbitrageType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 21, StringSerializer.INSTANCE, spreadArbitrageData.arbitrageType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 22) || spreadArbitrageData.ccyType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 22, StringSerializer.INSTANCE, spreadArbitrageData.ccyType);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 23) && spreadArbitrageData.instFamily == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 23, StringSerializer.INSTANCE, spreadArbitrageData.instFamily);
    }

    public SpreadArbitrageData(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, boolean z, boolean z2, String str14, String str15, String str16, String str17, @NotNull String str18, String str19, String str20, String str21, String str22) {
        Intrinsics.checkNotNullParameter(str18, "");
        this.arbitrageId = str;
        this.buyInstId = str2;
        this.sellInstId = str3;
        this.buyInstType = str4;
        this.sellInstType = str5;
        this.buyInstAlias = str6;
        this.sellInstAlias = str7;
        this.apy = str8;
        this.spread = str9;
        this.type = str10;
        this.uly = str11;
        this.state = str12;
        this.ts = str13;
        this.isShow = z;
        this.isSearchVisible = z2;
        this.ccy = str14;
        this.yieldPer10K = str15;
        this.duration = str16;
        this.notionalUsd = str17;
        this.groupType = str18;
        this.ctType = str19;
        this.arbitrageType = str20;
        this.ccyType = str21;
        this.instFamily = str22;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x010f: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r50v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r26v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r50v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r27v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0012: ARITH (r50v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r28v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001a: ARITH (r50v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r29v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0022: ARITH (r50v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r30v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002a: ARITH (r50v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r31v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0032: ARITH (r50v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r32v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003a: ARITH (r50v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r33v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0042: ARITH (r50v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r34v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004a: ARITH (r50v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r35v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0052: ARITH (r50v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r36v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005a: ARITH (r50v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r37v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0062: ARITH (r50v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r38v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x006a: ARITH (r50v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? true : (r39v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0072: ARITH (r50v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? false : (r40v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x007d: ARITH (r50v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r41v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0088: ARITH (r50v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r42v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0093: ARITH (r50v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r43v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x009e: ARITH (r50v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r44v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00a9: ARITH (r50v0 int) & (524288 int) A[WRAPPED]) != (0 int)) ? ("spread") : (r45v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00b4: ARITH (r50v0 int) & (1048576 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r46v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00bf: ARITH (r50v0 int) & (2097152 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r47v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00ca: ARITH (r50v0 int) & (4194304 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r48v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00d5: ARITH (r50v0 int) & (8388608 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r49v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:139) call: com.okinc.unify_trade.biz.subscribe.SpreadArbitrageData.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ SpreadArbitrageData(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, boolean z, boolean z2, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8, (i & 256) != 0 ? null : str9, (i & 512) != 0 ? null : str10, (i & 1024) != 0 ? null : str11, (i & 2048) != 0 ? null : str12, (i & 4096) != 0 ? null : str13, (i & 8192) != 0 ? true : z, (i & 16384) != 0 ? false : z2, (i & 32768) != 0 ? null : str14, (i & 65536) != 0 ? null : str15, (i & 131072) != 0 ? null : str16, (i & 262144) != 0 ? null : str17, (i & 524288) != 0 ? "spread" : str18, (i & 1048576) != 0 ? null : str19, (i & 2097152) != 0 ? null : str20, (i & 4194304) != 0 ? null : str21, (i & 8388608) != 0 ? null : str22);
    }

    public static final class Companion {

        public static final class Activity extends TypeToken<List<? extends SpreadArbitrageData>> {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.subscribe.SpreadArbitrageData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<SpreadArbitrageData> serializer() {
            return SpreadArbitrageData$$serializer.INSTANCE;
        }

        public final List<SpreadArbitrageData> EZpvd(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            try {
                List<SpreadArbitrageData> list = (List) new Gson().fromJson(str, new Activity().getType());
                if (list != null) {
                    if (!list.isEmpty()) {
                        return list;
                    }
                }
            } catch (Exception e) {
                pUU.KWHzl("JSON PARSE", "SpreadArbitrageData-jsonConvertList" + e.getMessage());
            }
            return null;
        }
    }

    public final boolean filterBySearch(@NotNull String str) {
        String str2;
        Intrinsics.checkNotNullParameter(str, "");
        String str3 = this.buyInstId;
        return (str3 != null && StringsKt__StringsKt.contains$default((CharSequence) str3, (CharSequence) str, false, 2, (Object) null)) || ((str2 = this.sellInstId) != null && StringsKt__StringsKt.contains$default((CharSequence) str2, (CharSequence) str, false, 2, (Object) null));
    }

    public final ArbitrageSetFavoriteBean toSetFavoriteBean(int i, @NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        ArbitrageSetFavoriteBean arbitrageSetFavoriteBean = new ArbitrageSetFavoriteBean();
        arbitrageSetFavoriteBean.setOperator(Integer.valueOf(i));
        String str3 = this.arbitrageId;
        if (str3 == null) {
            str3 = "";
        }
        arbitrageSetFavoriteBean.setArbitrageId(str3);
        String str4 = this.ccy;
        arbitrageSetFavoriteBean.setCcy(str4 != null ? str4 : "");
        arbitrageSetFavoriteBean.setGroupType("spread");
        arbitrageSetFavoriteBean.setCtType(str);
        arbitrageSetFavoriteBean.setArbitrageType(str2);
        return arbitrageSetFavoriteBean;
    }
}
