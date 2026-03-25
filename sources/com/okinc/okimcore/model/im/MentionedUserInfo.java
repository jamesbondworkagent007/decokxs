package com.okinc.okimcore.model.im;

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
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class MentionedUserInfo implements Parcelable {
    public static final int $stable = 0;
    private final String atUserName;
    private final String userId;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<MentionedUserInfo> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<MentionedUserInfo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MentionedUserInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new MentionedUserInfo(parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MentionedUserInfo[] newArray(int i) {
            return new MentionedUserInfo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ MentionedUserInfo copy$default(MentionedUserInfo mentionedUserInfo, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = mentionedUserInfo.userId;
        }
        if ((i & 2) != 0) {
            str2 = mentionedUserInfo.atUserName;
        }
        return mentionedUserInfo.copy(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.userId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.atUserName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MentionedUserInfo copy(@NotNull String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        return new MentionedUserInfo(str, str2);
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
        if (!(obj instanceof MentionedUserInfo)) {
            return false;
        }
        MentionedUserInfo mentionedUserInfo = (MentionedUserInfo) obj;
        return Intrinsics.EZpvd((Object) this.userId, (Object) mentionedUserInfo.userId) && Intrinsics.EZpvd((Object) this.atUserName, (Object) mentionedUserInfo.atUserName);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAtUserName() {
        return this.atUserName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUserId() {
        return this.userId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.userId.hashCode();
        String str = this.atUserName;
        return (iHashCode * 31) + (str == null ? 0 : str.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "MentionedUserInfo(userId=" + this.userId + ", atUserName=" + this.atUserName + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.userId);
        parcel.writeString(this.atUserName);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.im.MentionedUserInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<MentionedUserInfo> serializer() {
            return MentionedUserInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ MentionedUserInfo(int i, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, MentionedUserInfo$$serializer.INSTANCE.getDescriptor());
        }
        this.userId = str;
        if ((i & 2) == 0) {
            this.atUserName = null;
        } else {
            this.atUserName = str2;
        }
    }

    public static final /* synthetic */ void write$Self$OKIMCore_okimcore(MentionedUserInfo mentionedUserInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, mentionedUserInfo.userId);
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && mentionedUserInfo.atUserName == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, mentionedUserInfo.atUserName);
    }

    public MentionedUserInfo(@NotNull String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        this.userId = str;
        this.atUserName = str2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String):void (m)] (LINE:77) call: com.okinc.okimcore.model.im.MentionedUserInfo.<init>(java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ MentionedUserInfo(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2);
    }
}
