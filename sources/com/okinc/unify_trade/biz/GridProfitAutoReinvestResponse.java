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
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Serializable
public final class GridProfitAutoReinvestResponse implements Parcelable {
    public static final int $stable = 0;
    private final boolean editable;
    private final boolean enabled;
    private final String startTime;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<GridProfitAutoReinvestResponse> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<GridProfitAutoReinvestResponse> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GridProfitAutoReinvestResponse createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new GridProfitAutoReinvestResponse(parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GridProfitAutoReinvestResponse[] newArray(int i) {
            return new GridProfitAutoReinvestResponse[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public GridProfitAutoReinvestResponse() {
        this(false, false, (String) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ GridProfitAutoReinvestResponse copy$default(GridProfitAutoReinvestResponse gridProfitAutoReinvestResponse, boolean z, boolean z2, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            z = gridProfitAutoReinvestResponse.editable;
        }
        if ((i & 2) != 0) {
            z2 = gridProfitAutoReinvestResponse.enabled;
        }
        if ((i & 4) != 0) {
            str = gridProfitAutoReinvestResponse.startTime;
        }
        return gridProfitAutoReinvestResponse.copy(z, z2, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component1() {
        return this.editable;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component2() {
        return this.enabled;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.startTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GridProfitAutoReinvestResponse copy(boolean z, boolean z2, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new GridProfitAutoReinvestResponse(z, z2, str);
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
        if (!(obj instanceof GridProfitAutoReinvestResponse)) {
            return false;
        }
        GridProfitAutoReinvestResponse gridProfitAutoReinvestResponse = (GridProfitAutoReinvestResponse) obj;
        return this.editable == gridProfitAutoReinvestResponse.editable && this.enabled == gridProfitAutoReinvestResponse.enabled && Intrinsics.EZpvd((Object) this.startTime, (Object) gridProfitAutoReinvestResponse.startTime);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getEditable() {
        return this.editable;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getEnabled() {
        return this.enabled;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStartTime() {
        return this.startTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((Boolean.hashCode(this.editable) * 31) + Boolean.hashCode(this.enabled)) * 31) + this.startTime.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "GridProfitAutoReinvestResponse(editable=" + this.editable + ", enabled=" + this.enabled + ", startTime=" + this.startTime + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.editable ? 1 : 0);
        parcel.writeInt(this.enabled ? 1 : 0);
        parcel.writeString(this.startTime);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.GridProfitAutoReinvestResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<GridProfitAutoReinvestResponse> serializer() {
            return GridProfitAutoReinvestResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ GridProfitAutoReinvestResponse(int i, boolean z, boolean z2, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.editable = false;
        } else {
            this.editable = z;
        }
        if ((i & 2) == 0) {
            this.enabled = false;
        } else {
            this.enabled = z2;
        }
        if ((i & 4) == 0) {
            this.startTime = "";
        } else {
            this.startTime = str;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(GridProfitAutoReinvestResponse gridProfitAutoReinvestResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || gridProfitAutoReinvestResponse.editable) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 0, gridProfitAutoReinvestResponse.editable);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || gridProfitAutoReinvestResponse.enabled) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 1, gridProfitAutoReinvestResponse.enabled);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && Intrinsics.EZpvd((Object) gridProfitAutoReinvestResponse.startTime, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 2, gridProfitAutoReinvestResponse.startTime);
    }

    public GridProfitAutoReinvestResponse(boolean z, boolean z2, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.editable = z;
        this.enabled = z2;
        this.startTime = str;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? false : (r2v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? false : (r3v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
 A[MD:(boolean, boolean, java.lang.String):void (m)] (LINE:5606) call: com.okinc.unify_trade.biz.GridProfitAutoReinvestResponse.<init>(boolean, boolean, java.lang.String):void type: THIS */
    public /* synthetic */ GridProfitAutoReinvestResponse(boolean z, boolean z2, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? "" : str);
    }
}
