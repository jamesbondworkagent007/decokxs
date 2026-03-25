package com.okinc.okimcore.model.room.inhouseim;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.NamedCompanion;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class ConversationIcon implements Parcelable {
    public static final int $stable = 0;
    public static final CREATE CREATE = new CREATE(null);
    public static final Parcelable.Creator<ConversationIcon> CREATOR = new Creator();
    private final String dark;
    private final String light;

    public static final class Creator implements Parcelable.Creator<ConversationIcon> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ConversationIcon createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new ConversationIcon(parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ConversationIcon[] newArray(int i) {
            return new ConversationIcon[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ConversationIcon() {
        this((String) null, (String) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ ConversationIcon copy$default(ConversationIcon conversationIcon, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = conversationIcon.light;
        }
        if ((i & 2) != 0) {
            str2 = conversationIcon.dark;
        }
        return conversationIcon.copy(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.light;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.dark;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ConversationIcon copy(String str, String str2) {
        return new ConversationIcon(str, str2);
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
        if (!(obj instanceof ConversationIcon)) {
            return false;
        }
        ConversationIcon conversationIcon = (ConversationIcon) obj;
        return Intrinsics.EZpvd((Object) this.light, (Object) conversationIcon.light) && Intrinsics.EZpvd((Object) this.dark, (Object) conversationIcon.dark);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDark() {
        return this.dark;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLight() {
        return this.light;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.light;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.dark;
        return (iHashCode * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ConversationIcon(light=" + this.light + ", dark=" + this.dark + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.light);
        parcel.writeString(this.dark);
    }

    public /* synthetic */ ConversationIcon(int i, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.light = null;
        } else {
            this.light = str;
        }
        if ((i & 2) == 0) {
            this.dark = null;
        } else {
            this.dark = str2;
        }
    }

    public static final /* synthetic */ void write$Self$OKIMCore_okimcore(ConversationIcon conversationIcon, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || conversationIcon.light != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, conversationIcon.light);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && conversationIcon.dark == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, conversationIcon.dark);
    }

    public ConversationIcon(String str, String str2) {
        this.light = str;
        this.dark = str2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String):void (m)] (LINE:117) call: com.okinc.okimcore.model.room.inhouseim.ConversationIcon.<init>(java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ ConversationIcon(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ConversationIcon(@NotNull Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "");
        String string = parcel.readString();
        string = string == null ? "" : string;
        String string2 = parcel.readString();
        this(string, string2 != null ? string2 : "");
    }

    @NamedCompanion
    public static final class CREATE implements Parcelable.Creator<ConversationIcon> {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.room.inhouseim.ConversationIcon.CREATE.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ CREATE(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private CREATE() {
        }

        public final KSerializer<ConversationIcon> serializer() {
            return ConversationIcon$$serializer.INSTANCE;
        }

        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ConversationIcon createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new ConversationIcon(parcel);
        }

        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ConversationIcon[] newArray(int i) {
            return new ConversationIcon[i];
        }
    }
}
