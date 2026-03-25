package com.okinc.unify_trade.biz;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Serializable
public final class ArbitrageOrderBean implements Parcelable {
    private String _last;
    private String accFillSz;
    private String avgPx;
    private String instId;
    private String instType;
    private String lever;
    private Boolean major;
    private String posSide;
    private String px;
    private String pxType;
    private Boolean reduceOnly;
    private String side;
    private String state;
    private String subOrderState;
    private String sz;
    private String tdMode;
    private Boolean transform;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<ArbitrageOrderBean> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<ArbitrageOrderBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ArbitrageOrderBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.readInt();
            return new ArbitrageOrderBean();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ArbitrageOrderBean[] newArray(int i) {
            return new ArbitrageOrderBean[i];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAccFillSz() {
        return this.accFillSz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAvgPx() {
        return this.avgPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInstId() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInstType() {
        return this.instType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLever() {
        return this.lever;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getMajor() {
        return this.major;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPosSide() {
        return this.posSide;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPx() {
        return this.px;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPxType() {
        return this.pxType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getReduceOnly() {
        return this.reduceOnly;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSide() {
        return this.side;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getState() {
        return this.state;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSubOrderState() {
        return this.subOrderState;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSz() {
        return this.sz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTdMode() {
        return this.tdMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getTransform() {
        return this.transform;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String get_last() {
        return this._last;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAccFillSz(String str) {
        this.accFillSz = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAvgPx(String str) {
        this.avgPx = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInstId(String str) {
        this.instId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInstType(String str) {
        this.instType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLever(String str) {
        this.lever = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMajor(Boolean bool) {
        this.major = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPosSide(String str) {
        this.posSide = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPx(String str) {
        this.px = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPxType(String str) {
        this.pxType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setReduceOnly(Boolean bool) {
        this.reduceOnly = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSide(String str) {
        this.side = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setState(String str) {
        this.state = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSubOrderState(String str) {
        this.subOrderState = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSz(String str) {
        this.sz = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTdMode(String str) {
        this.tdMode = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTransform(Boolean bool) {
        this.transform = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void set_last(String str) {
        this._last = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(1);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.ArbitrageOrderBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ArbitrageOrderBean> serializer() {
            return ArbitrageOrderBean$$serializer.INSTANCE;
        }
    }

    public ArbitrageOrderBean() {
    }

    public /* synthetic */ ArbitrageOrderBean(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Boolean bool, String str9, String str10, Boolean bool2, String str11, String str12, String str13, String str14, Boolean bool3, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.instType = null;
        } else {
            this.instType = str;
        }
        if ((i & 2) == 0) {
            this.instId = null;
        } else {
            this.instId = str2;
        }
        if ((i & 4) == 0) {
            this.posSide = null;
        } else {
            this.posSide = str3;
        }
        if ((i & 8) == 0) {
            this.side = null;
        } else {
            this.side = str4;
        }
        if ((i & 16) == 0) {
            this.avgPx = null;
        } else {
            this.avgPx = str5;
        }
        if ((i & 32) == 0) {
            this.accFillSz = null;
        } else {
            this.accFillSz = str6;
        }
        if ((i & 64) == 0) {
            this.px = null;
        } else {
            this.px = str7;
        }
        if ((i & 128) == 0) {
            this.sz = null;
        } else {
            this.sz = str8;
        }
        if ((i & 256) == 0) {
            this.reduceOnly = null;
        } else {
            this.reduceOnly = bool;
        }
        if ((i & 512) == 0) {
            this.subOrderState = null;
        } else {
            this.subOrderState = str9;
        }
        if ((i & 1024) == 0) {
            this.state = null;
        } else {
            this.state = str10;
        }
        if ((i & 2048) == 0) {
            this.major = null;
        } else {
            this.major = bool2;
        }
        if ((i & 4096) == 0) {
            this.lever = null;
        } else {
            this.lever = str11;
        }
        if ((i & 8192) == 0) {
            this.tdMode = null;
        } else {
            this.tdMode = str12;
        }
        if ((i & 16384) == 0) {
            this.pxType = null;
        } else {
            this.pxType = str13;
        }
        if ((32768 & i) == 0) {
            this._last = null;
        } else {
            this._last = str14;
        }
        if ((i & 65536) == 0) {
            this.transform = null;
        } else {
            this.transform = bool3;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(ArbitrageOrderBean arbitrageOrderBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || arbitrageOrderBean.instType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, arbitrageOrderBean.instType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || arbitrageOrderBean.instId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, arbitrageOrderBean.instId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || arbitrageOrderBean.posSide != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, arbitrageOrderBean.posSide);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || arbitrageOrderBean.side != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, arbitrageOrderBean.side);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || arbitrageOrderBean.avgPx != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, arbitrageOrderBean.avgPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || arbitrageOrderBean.accFillSz != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, arbitrageOrderBean.accFillSz);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || arbitrageOrderBean.px != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, arbitrageOrderBean.px);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || arbitrageOrderBean.sz != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, arbitrageOrderBean.sz);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || arbitrageOrderBean.reduceOnly != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, BooleanSerializer.INSTANCE, arbitrageOrderBean.reduceOnly);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || arbitrageOrderBean.subOrderState != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, arbitrageOrderBean.subOrderState);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || arbitrageOrderBean.state != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, StringSerializer.INSTANCE, arbitrageOrderBean.state);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || arbitrageOrderBean.major != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, BooleanSerializer.INSTANCE, arbitrageOrderBean.major);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || arbitrageOrderBean.lever != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, StringSerializer.INSTANCE, arbitrageOrderBean.lever);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || arbitrageOrderBean.tdMode != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 13, StringSerializer.INSTANCE, arbitrageOrderBean.tdMode);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || arbitrageOrderBean.pxType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 14, StringSerializer.INSTANCE, arbitrageOrderBean.pxType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || arbitrageOrderBean._last != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 15, StringSerializer.INSTANCE, arbitrageOrderBean._last);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) && arbitrageOrderBean.transform == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 16, BooleanSerializer.INSTANCE, arbitrageOrderBean.transform);
    }
}
