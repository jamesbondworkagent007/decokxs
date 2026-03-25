package com.okinc.business.trade.features.home.ui.cefi.data;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Serializable
public final class AdvancedDefaultPreset implements Parcelable {
    public static final int $stable = 0;
    private final Boolean isEnableMev;
    private final Integer priorityFeeType;
    private final String routerModeType;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<AdvancedDefaultPreset> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<AdvancedDefaultPreset> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AdvancedDefaultPreset createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Intrinsics.checkNotNullParameter(parcel, "");
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new AdvancedDefaultPreset(boolValueOf, parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AdvancedDefaultPreset[] newArray(int i) {
            return new AdvancedDefaultPreset[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AdvancedDefaultPreset() {
        this((Boolean) null, (Integer) null, (String) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ AdvancedDefaultPreset copy$default(AdvancedDefaultPreset advancedDefaultPreset, Boolean bool, Integer num, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = advancedDefaultPreset.isEnableMev;
        }
        if ((i & 2) != 0) {
            num = advancedDefaultPreset.priorityFeeType;
        }
        if ((i & 4) != 0) {
            str = advancedDefaultPreset.routerModeType;
        }
        return advancedDefaultPreset.copy(bool, num, str);
    }

    @SerialName("priorityFeeType")
    public static /* synthetic */ void getPriorityFeeType$annotations() {
    }

    @SerialName("routerModeType")
    public static /* synthetic */ void getRouterModeType$annotations() {
    }

    @SerialName("isEnableMev")
    public static /* synthetic */ void isEnableMev$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component1() {
        return this.isEnableMev;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component2() {
        return this.priorityFeeType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.routerModeType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AdvancedDefaultPreset copy(Boolean bool, Integer num, String str) {
        return new AdvancedDefaultPreset(bool, num, str);
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
        if (!(obj instanceof AdvancedDefaultPreset)) {
            return false;
        }
        AdvancedDefaultPreset advancedDefaultPreset = (AdvancedDefaultPreset) obj;
        return Intrinsics.EZpvd(this.isEnableMev, advancedDefaultPreset.isEnableMev) && Intrinsics.EZpvd(this.priorityFeeType, advancedDefaultPreset.priorityFeeType) && Intrinsics.EZpvd((Object) this.routerModeType, (Object) advancedDefaultPreset.routerModeType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getPriorityFeeType() {
        return this.priorityFeeType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRouterModeType() {
        return this.routerModeType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Boolean bool = this.isEnableMev;
        int iHashCode = bool == null ? 0 : bool.hashCode();
        Integer num = this.priorityFeeType;
        int iHashCode2 = num == null ? 0 : num.hashCode();
        String str = this.routerModeType;
        return (((iHashCode * 31) + iHashCode2) * 31) + (str != null ? str.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean isEnableMev() {
        return this.isEnableMev;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AdvancedDefaultPreset(isEnableMev=" + this.isEnableMev + ", priorityFeeType=" + this.priorityFeeType + ", routerModeType=" + this.routerModeType + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        Boolean bool = this.isEnableMev;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Integer num = this.priorityFeeType;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeString(this.routerModeType);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.trade.features.home.ui.cefi.data.AdvancedDefaultPreset.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<AdvancedDefaultPreset> serializer() {
            return AdvancedDefaultPreset$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ AdvancedDefaultPreset(int i, Boolean bool, Integer num, String str, SerializationConstructorMarker serializationConstructorMarker) {
        this.isEnableMev = (i & 1) == 0 ? Boolean.FALSE : bool;
        if ((i & 2) == 0) {
            this.priorityFeeType = -1;
        } else {
            this.priorityFeeType = num;
        }
        if ((i & 4) == 0) {
            this.routerModeType = "";
        } else {
            this.routerModeType = str;
        }
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(AdvancedDefaultPreset advancedDefaultPreset, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        Integer num;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd(advancedDefaultPreset.isEnableMev, Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, BooleanSerializer.INSTANCE, advancedDefaultPreset.isEnableMev);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || (num = advancedDefaultPreset.priorityFeeType) == null || num.intValue() != -1) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, IntSerializer.INSTANCE, advancedDefaultPreset.priorityFeeType);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && Intrinsics.EZpvd((Object) advancedDefaultPreset.routerModeType, (Object) "")) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, advancedDefaultPreset.routerModeType);
    }

    public AdvancedDefaultPreset(Boolean bool, Integer num, String str) {
        this.isEnableMev = bool;
        this.priorityFeeType = num;
        this.routerModeType = str;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: CONSTRUCTOR 
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:java.lang.Boolean:0x0004: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r1v0 java.lang.Boolean))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (-1 int) : (r2v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000f: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
 A[MD:(java.lang.Boolean, java.lang.Integer, java.lang.String):void (m)] (LINE:172) call: com.okinc.business.trade.features.home.ui.cefi.data.AdvancedDefaultPreset.<init>(java.lang.Boolean, java.lang.Integer, java.lang.String):void type: THIS */
    public /* synthetic */ AdvancedDefaultPreset(Boolean bool, Integer num, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Boolean.FALSE : bool, (i & 2) != 0 ? -1 : num, (i & 4) != 0 ? "" : str);
    }
}
