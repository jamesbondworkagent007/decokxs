package com.okinc.okex.common.bean;

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

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class ChatMetadata implements Parcelable {
    public static final int $stable = 0;
    private final String anonymousUserImToken;
    private final String anonymousUserImUid;
    private final String imChannelId;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<ChatMetadata> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<ChatMetadata> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ChatMetadata createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new ChatMetadata(parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ChatMetadata[] newArray(int i) {
            return new ChatMetadata[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ChatMetadata() {
        this((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ ChatMetadata copy$default(ChatMetadata chatMetadata, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = chatMetadata.imChannelId;
        }
        if ((i & 2) != 0) {
            str2 = chatMetadata.anonymousUserImToken;
        }
        if ((i & 4) != 0) {
            str3 = chatMetadata.anonymousUserImUid;
        }
        return chatMetadata.copy(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.imChannelId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.anonymousUserImToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.anonymousUserImUid;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ChatMetadata copy(String str, String str2, String str3) {
        return new ChatMetadata(str, str2, str3);
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
        if (!(obj instanceof ChatMetadata)) {
            return false;
        }
        ChatMetadata chatMetadata = (ChatMetadata) obj;
        return Intrinsics.EZpvd((Object) this.imChannelId, (Object) chatMetadata.imChannelId) && Intrinsics.EZpvd((Object) this.anonymousUserImToken, (Object) chatMetadata.anonymousUserImToken) && Intrinsics.EZpvd((Object) this.anonymousUserImUid, (Object) chatMetadata.anonymousUserImUid);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAnonymousUserImToken() {
        return this.anonymousUserImToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAnonymousUserImUid() {
        return this.anonymousUserImUid;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getImChannelId() {
        return this.imChannelId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.imChannelId;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.anonymousUserImToken;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.anonymousUserImUid;
        return (((iHashCode * 31) + iHashCode2) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ChatMetadata(imChannelId=" + this.imChannelId + ", anonymousUserImToken=" + this.anonymousUserImToken + ", anonymousUserImUid=" + this.anonymousUserImUid + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.imChannelId);
        parcel.writeString(this.anonymousUserImToken);
        parcel.writeString(this.anonymousUserImUid);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.common.bean.ChatMetadata.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ChatMetadata> serializer() {
            return ChatMetadata$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ChatMetadata(int i, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.imChannelId = null;
        } else {
            this.imChannelId = str;
        }
        if ((i & 2) == 0) {
            this.anonymousUserImToken = null;
        } else {
            this.anonymousUserImToken = str2;
        }
        if ((i & 4) == 0) {
            this.anonymousUserImUid = null;
        } else {
            this.anonymousUserImUid = str3;
        }
    }

    public static final /* synthetic */ void write$Self$OKSupport_support_api(ChatMetadata chatMetadata, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || chatMetadata.imChannelId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, chatMetadata.imChannelId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || chatMetadata.anonymousUserImToken != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, chatMetadata.anonymousUserImToken);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && chatMetadata.anonymousUserImUid == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, chatMetadata.anonymousUserImUid);
    }

    public ChatMetadata(String str, String str2, String str3) {
        this.imChannelId = str;
        this.anonymousUserImToken = str2;
        this.anonymousUserImUid = str3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r4v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:15) call: com.okinc.okex.common.bean.ChatMetadata.<init>(java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ ChatMetadata(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }
}
