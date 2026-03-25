package com.okinc.homepage.bean;

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

/* JADX INFO: loaded from: classes15.dex */
@Serializable
public final class Interaction implements Parcelable {
    public static final int $stable = 0;
    private final String bizId;
    private final int resourceId;
    private final Integer resourceType;
    private final int type;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<Interaction> CREATOR = new Creator();

    /* JADX INFO: loaded from: classes23.dex */
    public static final class Creator implements Parcelable.Creator<Interaction> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Interaction createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new Interaction(parcel.readInt(), parcel.readInt(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Interaction[] newArray(int i) {
            return new Interaction[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ Interaction copy$default(Interaction interaction, int i, int i2, Integer num, String str, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = interaction.resourceId;
        }
        if ((i3 & 2) != 0) {
            i2 = interaction.type;
        }
        if ((i3 & 4) != 0) {
            num = interaction.resourceType;
        }
        if ((i3 & 8) != 0) {
            str = interaction.bizId;
        }
        return interaction.copy(i, i2, num, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component1() {
        return this.resourceId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component2() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component3() {
        return this.resourceType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.bizId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Interaction copy(int i, int i2, Integer num, String str) {
        return new Interaction(i, i2, num, str);
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
        if (!(obj instanceof Interaction)) {
            return false;
        }
        Interaction interaction = (Interaction) obj;
        return this.resourceId == interaction.resourceId && this.type == interaction.type && Intrinsics.EZpvd(this.resourceType, interaction.resourceType) && Intrinsics.EZpvd((Object) this.bizId, (Object) interaction.bizId);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBizId() {
        return this.bizId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getResourceId() {
        return this.resourceId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getResourceType() {
        return this.resourceType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getType() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = Integer.hashCode(this.resourceId);
        int iHashCode2 = Integer.hashCode(this.type);
        Integer num = this.resourceType;
        int iHashCode3 = num == null ? 0 : num.hashCode();
        String str = this.bizId;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str != null ? str.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "Interaction(resourceId=" + this.resourceId + ", type=" + this.type + ", resourceType=" + this.resourceType + ", bizId=" + this.bizId + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int iIntValue;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.resourceId);
        parcel.writeInt(this.type);
        Integer num = this.resourceType;
        if (num == null) {
            iIntValue = 0;
        } else {
            parcel.writeInt(1);
            iIntValue = num.intValue();
        }
        parcel.writeInt(iIntValue);
        parcel.writeString(this.bizId);
    }

    /* JADX INFO: loaded from: classes23.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.homepage.bean.Interaction.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<Interaction> serializer() {
            return Interaction$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ Interaction(int i, int i2, int i3, Integer num, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, Interaction$$serializer.INSTANCE.getDescriptor());
        }
        this.resourceId = i2;
        this.type = i3;
        if ((i & 4) == 0) {
            this.resourceType = null;
        } else {
            this.resourceType = num;
        }
        if ((i & 8) == 0) {
            this.bizId = null;
        } else {
            this.bizId = str;
        }
    }

    public static final /* synthetic */ void write$Self$OKHome_home_page_api(Interaction interaction, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeIntElement(serialDescriptor, 0, interaction.resourceId);
        compositeEncoder.encodeIntElement(serialDescriptor, 1, interaction.type);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || interaction.resourceType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, IntSerializer.INSTANCE, interaction.resourceType);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && interaction.bizId == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, interaction.bizId);
    }

    public Interaction(int i, int i2, Integer num, String str) {
        this.resourceId = i;
        this.type = i2;
        this.resourceType = num;
        this.bizId = str;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (r2v0 int)
  (r3v0 int)
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r4v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r5v0 java.lang.String))
 A[MD:(int, int, java.lang.Integer, java.lang.String):void (m)] (LINE:18) call: com.okinc.homepage.bean.Interaction.<init>(int, int, java.lang.Integer, java.lang.String):void type: THIS */
    public /* synthetic */ Interaction(int i, int i2, Integer num, String str, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, (i3 & 4) != 0 ? null : num, (i3 & 8) != 0 ? null : str);
    }
}
