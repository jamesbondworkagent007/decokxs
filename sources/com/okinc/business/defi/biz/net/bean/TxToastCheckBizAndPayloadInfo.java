package com.okinc.business.defi.biz.net.bean;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class TxToastCheckBizAndPayloadInfo implements Parcelable {
    private Integer txToastCheckBizLine;
    private String txToastCheckPayload;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<TxToastCheckBizAndPayloadInfo> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<TxToastCheckBizAndPayloadInfo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TxToastCheckBizAndPayloadInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new TxToastCheckBizAndPayloadInfo(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TxToastCheckBizAndPayloadInfo[] newArray(int i) {
            return new TxToastCheckBizAndPayloadInfo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ TxToastCheckBizAndPayloadInfo copy$default(TxToastCheckBizAndPayloadInfo txToastCheckBizAndPayloadInfo, Integer num, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            num = txToastCheckBizAndPayloadInfo.txToastCheckBizLine;
        }
        if ((i & 2) != 0) {
            str = txToastCheckBizAndPayloadInfo.txToastCheckPayload;
        }
        return txToastCheckBizAndPayloadInfo.copy(num, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component1() {
        return this.txToastCheckBizLine;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.txToastCheckPayload;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TxToastCheckBizAndPayloadInfo copy(Integer num, String str) {
        return new TxToastCheckBizAndPayloadInfo(num, str);
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
        if (!(obj instanceof TxToastCheckBizAndPayloadInfo)) {
            return false;
        }
        TxToastCheckBizAndPayloadInfo txToastCheckBizAndPayloadInfo = (TxToastCheckBizAndPayloadInfo) obj;
        return Intrinsics.EZpvd(this.txToastCheckBizLine, txToastCheckBizAndPayloadInfo.txToastCheckBizLine) && Intrinsics.EZpvd((Object) this.txToastCheckPayload, (Object) txToastCheckBizAndPayloadInfo.txToastCheckPayload);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getTxToastCheckBizLine() {
        return this.txToastCheckBizLine;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTxToastCheckPayload() {
        return this.txToastCheckPayload;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Integer num = this.txToastCheckBizLine;
        int iHashCode = num == null ? 0 : num.hashCode();
        String str = this.txToastCheckPayload;
        return (iHashCode * 31) + (str != null ? str.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTxToastCheckBizLine(Integer num) {
        this.txToastCheckBizLine = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTxToastCheckPayload(String str) {
        this.txToastCheckPayload = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TxToastCheckBizAndPayloadInfo(txToastCheckBizLine=" + this.txToastCheckBizLine + ", txToastCheckPayload=" + this.txToastCheckPayload + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int iIntValue;
        Intrinsics.checkNotNullParameter(parcel, "");
        Integer num = this.txToastCheckBizLine;
        if (num == null) {
            iIntValue = 0;
        } else {
            parcel.writeInt(1);
            iIntValue = num.intValue();
        }
        parcel.writeInt(iIntValue);
        parcel.writeString(this.txToastCheckPayload);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.net.bean.TxToastCheckBizAndPayloadInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TxToastCheckBizAndPayloadInfo> serializer() {
            return TxToastCheckBizAndPayloadInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TxToastCheckBizAndPayloadInfo(int i, Integer num, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, TxToastCheckBizAndPayloadInfo$$serializer.INSTANCE.getDescriptor());
        }
        this.txToastCheckBizLine = num;
        if ((i & 2) == 0) {
            this.txToastCheckPayload = null;
        } else {
            this.txToastCheckPayload = str;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(TxToastCheckBizAndPayloadInfo txToastCheckBizAndPayloadInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, IntSerializer.INSTANCE, txToastCheckBizAndPayloadInfo.txToastCheckBizLine);
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && txToastCheckBizAndPayloadInfo.txToastCheckPayload == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, txToastCheckBizAndPayloadInfo.txToastCheckPayload);
    }

    public TxToastCheckBizAndPayloadInfo(Integer num, String str) {
        this.txToastCheckBizLine = num;
        this.txToastCheckPayload = str;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 java.lang.Integer)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
 A[MD:(java.lang.Integer, java.lang.String):void (m)] (LINE:1475) call: com.okinc.business.defi.biz.net.bean.TxToastCheckBizAndPayloadInfo.<init>(java.lang.Integer, java.lang.String):void type: THIS */
    public /* synthetic */ TxToastCheckBizAndPayloadInfo(Integer num, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(num, (i & 2) != 0 ? null : str);
    }
}
