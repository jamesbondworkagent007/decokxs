package com.okinc.business.invest_biz.data.bean;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class STOKTDrawDetailRecordInfo implements Parcelable {
    public static final int $stable = 0;
    private final String drawAmount;
    private final String drawTime;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<STOKTDrawDetailRecordInfo> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<STOKTDrawDetailRecordInfo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final STOKTDrawDetailRecordInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new STOKTDrawDetailRecordInfo(parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final STOKTDrawDetailRecordInfo[] newArray(int i) {
            return new STOKTDrawDetailRecordInfo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public STOKTDrawDetailRecordInfo() {
        this((String) null, (String) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ STOKTDrawDetailRecordInfo copy$default(STOKTDrawDetailRecordInfo sTOKTDrawDetailRecordInfo, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = sTOKTDrawDetailRecordInfo.drawAmount;
        }
        if ((i & 2) != 0) {
            str2 = sTOKTDrawDetailRecordInfo.drawTime;
        }
        return sTOKTDrawDetailRecordInfo.copy(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.drawAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.drawTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final STOKTDrawDetailRecordInfo copy(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new STOKTDrawDetailRecordInfo(str, str2);
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
        if (!(obj instanceof STOKTDrawDetailRecordInfo)) {
            return false;
        }
        STOKTDrawDetailRecordInfo sTOKTDrawDetailRecordInfo = (STOKTDrawDetailRecordInfo) obj;
        return Intrinsics.EZpvd((Object) this.drawAmount, (Object) sTOKTDrawDetailRecordInfo.drawAmount) && Intrinsics.EZpvd((Object) this.drawTime, (Object) sTOKTDrawDetailRecordInfo.drawTime);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDrawAmount() {
        return this.drawAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDrawTime() {
        return this.drawTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.drawAmount.hashCode() * 31) + this.drawTime.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "STOKTDrawDetailRecordInfo(drawAmount=" + this.drawAmount + ", drawTime=" + this.drawTime + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.drawAmount);
        parcel.writeString(this.drawTime);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.data.bean.STOKTDrawDetailRecordInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<STOKTDrawDetailRecordInfo> serializer() {
            return STOKTDrawDetailRecordInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ STOKTDrawDetailRecordInfo(int i, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.drawAmount = "";
        } else {
            this.drawAmount = str;
        }
        if ((i & 2) == 0) {
            this.drawTime = "";
        } else {
            this.drawTime = str2;
        }
    }

    public static final /* synthetic */ void write$Self$OKDeFi_invest_biz(STOKTDrawDetailRecordInfo sTOKTDrawDetailRecordInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) sTOKTDrawDetailRecordInfo.drawAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, sTOKTDrawDetailRecordInfo.drawAmount);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && Intrinsics.EZpvd((Object) sTOKTDrawDetailRecordInfo.drawTime, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 1, sTOKTDrawDetailRecordInfo.drawTime);
    }

    public STOKTDrawDetailRecordInfo(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.drawAmount = str;
        this.drawTime = str2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000c: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String):void (m)] (LINE:318) call: com.okinc.business.invest_biz.data.bean.STOKTDrawDetailRecordInfo.<init>(java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ STOKTDrawDetailRecordInfo(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
    }
}
