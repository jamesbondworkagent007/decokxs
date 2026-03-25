package com.okinc.market.common.biz_spot.bean;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Serializable
public final class DeleteRuleRep implements Parcelable {
    private int bizType;
    private String ruleId;
    private final int sourceType;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<DeleteRuleRep> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<DeleteRuleRep> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DeleteRuleRep createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new DeleteRuleRep(parcel.readInt(), parcel.readString(), parcel.readInt());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DeleteRuleRep[] newArray(int i) {
            return new DeleteRuleRep[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ DeleteRuleRep copy$default(DeleteRuleRep deleteRuleRep, int i, String str, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = deleteRuleRep.sourceType;
        }
        if ((i3 & 2) != 0) {
            str = deleteRuleRep.ruleId;
        }
        if ((i3 & 4) != 0) {
            i2 = deleteRuleRep.bizType;
        }
        return deleteRuleRep.copy(i, str, i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component1() {
        return this.sourceType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.ruleId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component3() {
        return this.bizType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DeleteRuleRep copy(int i, @NotNull String str, int i2) {
        Intrinsics.checkNotNullParameter(str, "");
        return new DeleteRuleRep(i, str, i2);
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
        if (!(obj instanceof DeleteRuleRep)) {
            return false;
        }
        DeleteRuleRep deleteRuleRep = (DeleteRuleRep) obj;
        return this.sourceType == deleteRuleRep.sourceType && Intrinsics.EZpvd((Object) this.ruleId, (Object) deleteRuleRep.ruleId) && this.bizType == deleteRuleRep.bizType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getBizType() {
        return this.bizType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRuleId() {
        return this.ruleId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getSourceType() {
        return this.sourceType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((Integer.hashCode(this.sourceType) * 31) + this.ruleId.hashCode()) * 31) + Integer.hashCode(this.bizType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBizType(int i) {
        this.bizType = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRuleId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.ruleId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "DeleteRuleRep(sourceType=" + this.sourceType + ", ruleId=" + this.ruleId + ", bizType=" + this.bizType + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.sourceType);
        parcel.writeString(this.ruleId);
        parcel.writeInt(this.bizType);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.market.common.biz_spot.bean.DeleteRuleRep.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<DeleteRuleRep> serializer() {
            return DeleteRuleRep$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ DeleteRuleRep(int i, int i2, String str, int i3, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, DeleteRuleRep$$serializer.INSTANCE.getDescriptor());
        }
        this.sourceType = i2;
        if ((i & 2) == 0) {
            this.ruleId = "";
        } else {
            this.ruleId = str;
        }
        if ((i & 4) == 0) {
            this.bizType = 0;
        } else {
            this.bizType = i3;
        }
    }

    public static final /* synthetic */ void write$Self$OKMarket_market_api(DeleteRuleRep deleteRuleRep, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeIntElement(serialDescriptor, 0, deleteRuleRep.sourceType);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) deleteRuleRep.ruleId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, deleteRuleRep.ruleId);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && deleteRuleRep.bizType == 0) {
            return;
        }
        compositeEncoder.encodeIntElement(serialDescriptor, 2, deleteRuleRep.bizType);
    }

    public DeleteRuleRep(int i, @NotNull String str, int i2) {
        Intrinsics.checkNotNullParameter(str, "");
        this.sourceType = i;
        this.ruleId = str;
        this.bizType = i2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (r1v0 int)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(int, java.lang.String, int):void (m)] (LINE:91) call: com.okinc.market.common.biz_spot.bean.DeleteRuleRep.<init>(int, java.lang.String, int):void type: THIS */
    public /* synthetic */ DeleteRuleRep(int i, String str, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i3 & 2) != 0 ? "" : str, (i3 & 4) != 0 ? 0 : i2);
    }
}
