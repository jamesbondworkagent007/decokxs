package com.okinc.unify_trade.bot.data;

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
public final class ItemDataToggle implements Parcelable {
    public static final int $stable = 0;
    public final boolean isToggleEnabled;
    public final boolean isToggled;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<ItemDataToggle> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<ItemDataToggle> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ItemDataToggle createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new ItemDataToggle(parcel.readInt() != 0, parcel.readInt() != 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ItemDataToggle[] newArray(int i) {
            return new ItemDataToggle[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Illegal instructions before constructor call */
    public ItemDataToggle() {
        boolean z = false;
        this(z, z, 3, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ ItemDataToggle copy$default(ItemDataToggle itemDataToggle, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = itemDataToggle.isToggleEnabled;
        }
        if ((i & 2) != 0) {
            z2 = itemDataToggle.isToggled;
        }
        return itemDataToggle.EZpvd(z, z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ItemDataToggle EZpvd(boolean z, boolean z2) {
        return new ItemDataToggle(z, z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean KWHzl() {
        return this.isToggled;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean OLrzqt() {
        return this.isToggleEnabled;
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
        if (!(obj instanceof ItemDataToggle)) {
            return false;
        }
        ItemDataToggle itemDataToggle = (ItemDataToggle) obj;
        return this.isToggleEnabled == itemDataToggle.isToggleEnabled && this.isToggled == itemDataToggle.isToggled;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (Boolean.hashCode(this.isToggleEnabled) * 31) + Boolean.hashCode(this.isToggled);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ItemDataToggle(isToggleEnabled=" + this.isToggleEnabled + ", isToggled=" + this.isToggled + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.isToggleEnabled ? 1 : 0);
        parcel.writeInt(this.isToggled ? 1 : 0);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.bot.data.ItemDataToggle.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ItemDataToggle> serializer() {
            return ItemDataToggle$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ItemDataToggle(int i, boolean z, boolean z2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.isToggleEnabled = false;
        } else {
            this.isToggleEnabled = z;
        }
        if ((i & 2) == 0) {
            this.isToggled = false;
        } else {
            this.isToggled = z2;
        }
    }

    public static final /* synthetic */ void KWHzl(ItemDataToggle itemDataToggle, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || itemDataToggle.isToggleEnabled) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 0, itemDataToggle.isToggleEnabled);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || itemDataToggle.isToggled) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 1, itemDataToggle.isToggled);
        }
    }

    public ItemDataToggle(boolean z, boolean z2) {
        this.isToggleEnabled = z;
        this.isToggled = z2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? false : (r2v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? false : (r3v0 boolean))
 A[MD:(boolean, boolean):void (m)] (LINE:129) call: com.okinc.unify_trade.bot.data.ItemDataToggle.<init>(boolean, boolean):void type: THIS */
    public /* synthetic */ ItemDataToggle(boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2);
    }
}
