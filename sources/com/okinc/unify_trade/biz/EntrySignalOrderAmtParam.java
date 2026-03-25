package com.okinc.unify_trade.biz;

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
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Serializable
public final class EntrySignalOrderAmtParam implements Parcelable {
    private String amt;
    private String amtRatio;
    private String deleType;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<EntrySignalOrderAmtParam> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<EntrySignalOrderAmtParam> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EntrySignalOrderAmtParam createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new EntrySignalOrderAmtParam(parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EntrySignalOrderAmtParam[] newArray(int i) {
            return new EntrySignalOrderAmtParam[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public EntrySignalOrderAmtParam() {
        this((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ EntrySignalOrderAmtParam copy$default(EntrySignalOrderAmtParam entrySignalOrderAmtParam, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = entrySignalOrderAmtParam.deleType;
        }
        if ((i & 2) != 0) {
            str2 = entrySignalOrderAmtParam.amt;
        }
        if ((i & 4) != 0) {
            str3 = entrySignalOrderAmtParam.amtRatio;
        }
        return entrySignalOrderAmtParam.copy(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.deleType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.amt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.amtRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EntrySignalOrderAmtParam copy(String str, String str2, String str3) {
        return new EntrySignalOrderAmtParam(str, str2, str3);
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
        if (!(obj instanceof EntrySignalOrderAmtParam)) {
            return false;
        }
        EntrySignalOrderAmtParam entrySignalOrderAmtParam = (EntrySignalOrderAmtParam) obj;
        return Intrinsics.EZpvd((Object) this.deleType, (Object) entrySignalOrderAmtParam.deleType) && Intrinsics.EZpvd((Object) this.amt, (Object) entrySignalOrderAmtParam.amt) && Intrinsics.EZpvd((Object) this.amtRatio, (Object) entrySignalOrderAmtParam.amtRatio);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAmt() {
        return this.amt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAmtRatio() {
        return this.amtRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDeleType() {
        return this.deleType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.deleType;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.amt;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.amtRatio;
        return (((iHashCode * 31) + iHashCode2) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAmt(String str) {
        this.amt = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAmtRatio(String str) {
        this.amtRatio = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDeleType(String str) {
        this.deleType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "EntrySignalOrderAmtParam(deleType=" + this.deleType + ", amt=" + this.amt + ", amtRatio=" + this.amtRatio + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.deleType);
        parcel.writeString(this.amt);
        parcel.writeString(this.amtRatio);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.EntrySignalOrderAmtParam.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<EntrySignalOrderAmtParam> serializer() {
            return EntrySignalOrderAmtParam$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ EntrySignalOrderAmtParam(int i, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.deleType = null;
        } else {
            this.deleType = str;
        }
        if ((i & 2) == 0) {
            this.amt = null;
        } else {
            this.amt = str2;
        }
        if ((i & 4) == 0) {
            this.amtRatio = null;
        } else {
            this.amtRatio = str3;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(EntrySignalOrderAmtParam entrySignalOrderAmtParam, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || entrySignalOrderAmtParam.deleType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, entrySignalOrderAmtParam.deleType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || entrySignalOrderAmtParam.amt != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, entrySignalOrderAmtParam.amt);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && entrySignalOrderAmtParam.amtRatio == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, entrySignalOrderAmtParam.amtRatio);
    }

    public EntrySignalOrderAmtParam(String str, String str2, String str3) {
        this.deleType = str;
        this.amt = str2;
        this.amtRatio = str3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r4v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:572) call: com.okinc.unify_trade.biz.EntrySignalOrderAmtParam.<init>(java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ EntrySignalOrderAmtParam(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }
}
