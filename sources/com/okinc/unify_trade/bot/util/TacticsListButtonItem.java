package com.okinc.unify_trade.bot.util;

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

/* JADX INFO: loaded from: classes12.dex */
@Serializable
public final class TacticsListButtonItem implements Parcelable {
    public static final int $stable = 0;
    public final String buttonType;
    public final String desc;
    public final boolean isEnable;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<TacticsListButtonItem> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<TacticsListButtonItem> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TacticsListButtonItem createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new TacticsListButtonItem(parcel.readString(), parcel.readInt() != 0, parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TacticsListButtonItem[] newArray(int i) {
            return new TacticsListButtonItem[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TacticsListButtonItem() {
        this((String) null, false, (String) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ TacticsListButtonItem copy$default(TacticsListButtonItem tacticsListButtonItem, String str, boolean z, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = tacticsListButtonItem.buttonType;
        }
        if ((i & 2) != 0) {
            z = tacticsListButtonItem.isEnable;
        }
        if ((i & 4) != 0) {
            str2 = tacticsListButtonItem.desc;
        }
        return tacticsListButtonItem.AEQbTJ(str, z, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TacticsListButtonItem AEQbTJ(@NotNull String str, boolean z, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new TacticsListButtonItem(str, z, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AEQbTJ() {
        return this.buttonType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean EZpvd() {
        return this.isEnable;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OLrzqt() {
        return this.desc;
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
        if (!(obj instanceof TacticsListButtonItem)) {
            return false;
        }
        TacticsListButtonItem tacticsListButtonItem = (TacticsListButtonItem) obj;
        return Intrinsics.EZpvd((Object) this.buttonType, (Object) tacticsListButtonItem.buttonType) && this.isEnable == tacticsListButtonItem.isEnable && Intrinsics.EZpvd((Object) this.desc, (Object) tacticsListButtonItem.desc);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.buttonType.hashCode() * 31) + Boolean.hashCode(this.isEnable)) * 31) + this.desc.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TacticsListButtonItem(buttonType=" + this.buttonType + ", isEnable=" + this.isEnable + ", desc=" + this.desc + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.buttonType);
        parcel.writeInt(this.isEnable ? 1 : 0);
        parcel.writeString(this.desc);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.bot.util.TacticsListButtonItem.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TacticsListButtonItem> serializer() {
            return TacticsListButtonItem$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TacticsListButtonItem(int i, String str, boolean z, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.buttonType = "";
        } else {
            this.buttonType = str;
        }
        if ((i & 2) == 0) {
            this.isEnable = true;
        } else {
            this.isEnable = z;
        }
        if ((i & 4) == 0) {
            this.desc = "";
        } else {
            this.desc = str2;
        }
    }

    public static final /* synthetic */ void KWHzl(TacticsListButtonItem tacticsListButtonItem, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) tacticsListButtonItem.buttonType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, tacticsListButtonItem.buttonType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !tacticsListButtonItem.isEnable) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 1, tacticsListButtonItem.isEnable);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && Intrinsics.EZpvd((Object) tacticsListButtonItem.desc, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 2, tacticsListButtonItem.desc);
    }

    public TacticsListButtonItem(@NotNull String str, boolean z, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.buttonType = str;
        this.isEnable = z;
        this.desc = str2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0007: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? true : (r3v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
 A[MD:(java.lang.String, boolean, java.lang.String):void (m)] (LINE:1015) call: com.okinc.unify_trade.bot.util.TacticsListButtonItem.<init>(java.lang.String, boolean, java.lang.String):void type: THIS */
    public /* synthetic */ TacticsListButtonItem(String str, boolean z, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? true : z, (i & 4) != 0 ? "" : str2);
    }
}
