package com.okinc.planet.biz_content.leaderboard.bean;

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

/* JADX INFO: loaded from: classes19.dex */
@Serializable
public final class NewsFlashAuthor implements Parcelable {
    public static final int $stable = 0;
    private final String authorId;
    private final String nickName;
    private final String portrait;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<NewsFlashAuthor> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<NewsFlashAuthor> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final NewsFlashAuthor createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new NewsFlashAuthor(parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final NewsFlashAuthor[] newArray(int i) {
            return new NewsFlashAuthor[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public NewsFlashAuthor() {
        this((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ NewsFlashAuthor copy$default(NewsFlashAuthor newsFlashAuthor, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = newsFlashAuthor.nickName;
        }
        if ((i & 2) != 0) {
            str2 = newsFlashAuthor.portrait;
        }
        if ((i & 4) != 0) {
            str3 = newsFlashAuthor.authorId;
        }
        return newsFlashAuthor.copy(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.nickName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.portrait;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.authorId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final NewsFlashAuthor copy(String str, String str2, String str3) {
        return new NewsFlashAuthor(str, str2, str3);
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
        if (!(obj instanceof NewsFlashAuthor)) {
            return false;
        }
        NewsFlashAuthor newsFlashAuthor = (NewsFlashAuthor) obj;
        return Intrinsics.EZpvd((Object) this.nickName, (Object) newsFlashAuthor.nickName) && Intrinsics.EZpvd((Object) this.portrait, (Object) newsFlashAuthor.portrait) && Intrinsics.EZpvd((Object) this.authorId, (Object) newsFlashAuthor.authorId);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAuthorId() {
        return this.authorId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNickName() {
        return this.nickName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPortrait() {
        return this.portrait;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.nickName;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.portrait;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.authorId;
        return (((iHashCode * 31) + iHashCode2) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "NewsFlashAuthor(nickName=" + this.nickName + ", portrait=" + this.portrait + ", authorId=" + this.authorId + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.nickName);
        parcel.writeString(this.portrait);
        parcel.writeString(this.authorId);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.planet.biz_content.leaderboard.bean.NewsFlashAuthor.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<NewsFlashAuthor> serializer() {
            return NewsFlashAuthor$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ NewsFlashAuthor(int i, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.nickName = null;
        } else {
            this.nickName = str;
        }
        if ((i & 2) == 0) {
            this.portrait = null;
        } else {
            this.portrait = str2;
        }
        if ((i & 4) == 0) {
            this.authorId = null;
        } else {
            this.authorId = str3;
        }
    }

    public static final /* synthetic */ void write$Self$OKPlanet_ok_feature_planet_impl(NewsFlashAuthor newsFlashAuthor, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || newsFlashAuthor.nickName != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, newsFlashAuthor.nickName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || newsFlashAuthor.portrait != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, newsFlashAuthor.portrait);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && newsFlashAuthor.authorId == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, newsFlashAuthor.authorId);
    }

    public NewsFlashAuthor(String str, String str2, String str3) {
        this.nickName = str;
        this.portrait = str2;
        this.authorId = str3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r4v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:55) call: com.okinc.planet.biz_content.leaderboard.bean.NewsFlashAuthor.<init>(java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ NewsFlashAuthor(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }
}
