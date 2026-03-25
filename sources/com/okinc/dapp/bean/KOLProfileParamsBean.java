package com.okinc.dapp.bean;

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

/* JADX INFO: loaded from: classes15.dex */
@Serializable
public final class KOLProfileParamsBean implements Parcelable {
    public static final int $stable = 0;
    private final String authorId;
    private final String nickName;
    private final String portrait;
    private final String source;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<KOLProfileParamsBean> CREATOR = new Creator();

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Creator implements Parcelable.Creator<KOLProfileParamsBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final KOLProfileParamsBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new KOLProfileParamsBean(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final KOLProfileParamsBean[] newArray(int i) {
            return new KOLProfileParamsBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ KOLProfileParamsBean copy$default(KOLProfileParamsBean kOLProfileParamsBean, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = kOLProfileParamsBean.authorId;
        }
        if ((i & 2) != 0) {
            str2 = kOLProfileParamsBean.nickName;
        }
        if ((i & 4) != 0) {
            str3 = kOLProfileParamsBean.portrait;
        }
        if ((i & 8) != 0) {
            str4 = kOLProfileParamsBean.source;
        }
        return kOLProfileParamsBean.copy(str, str2, str3, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.authorId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.nickName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.portrait;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.source;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final KOLProfileParamsBean copy(@NotNull String str, String str2, String str3, String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        return new KOLProfileParamsBean(str, str2, str3, str4);
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
        if (!(obj instanceof KOLProfileParamsBean)) {
            return false;
        }
        KOLProfileParamsBean kOLProfileParamsBean = (KOLProfileParamsBean) obj;
        return Intrinsics.EZpvd((Object) this.authorId, (Object) kOLProfileParamsBean.authorId) && Intrinsics.EZpvd((Object) this.nickName, (Object) kOLProfileParamsBean.nickName) && Intrinsics.EZpvd((Object) this.portrait, (Object) kOLProfileParamsBean.portrait) && Intrinsics.EZpvd((Object) this.source, (Object) kOLProfileParamsBean.source);
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
    public final String getSource() {
        return this.source;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.authorId.hashCode();
        String str = this.nickName;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.portrait;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.source;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "KOLProfileParamsBean(authorId=" + this.authorId + ", nickName=" + this.nickName + ", portrait=" + this.portrait + ", source=" + this.source + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.authorId);
        parcel.writeString(this.nickName);
        parcel.writeString(this.portrait);
        parcel.writeString(this.source);
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.dapp.bean.KOLProfileParamsBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<KOLProfileParamsBean> serializer() {
            return KOLProfileParamsBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ KOLProfileParamsBean(int i, String str, String str2, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, KOLProfileParamsBean$$serializer.INSTANCE.getDescriptor());
        }
        this.authorId = str;
        if ((i & 2) == 0) {
            this.nickName = "";
        } else {
            this.nickName = str2;
        }
        if ((i & 4) == 0) {
            this.portrait = "";
        } else {
            this.portrait = str3;
        }
        if ((i & 8) == 0) {
            this.source = "";
        } else {
            this.source = str4;
        }
    }

    public static final /* synthetic */ void write$Self$OKDiscover_discover_api(KOLProfileParamsBean kOLProfileParamsBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, kOLProfileParamsBean.authorId);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) kOLProfileParamsBean.nickName, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, kOLProfileParamsBean.nickName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) kOLProfileParamsBean.portrait, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, kOLProfileParamsBean.portrait);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && Intrinsics.EZpvd((Object) kOLProfileParamsBean.source, (Object) "")) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, kOLProfileParamsBean.source);
    }

    public KOLProfileParamsBean(@NotNull String str, String str2, String str3, String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        this.authorId = str;
        this.nickName = str2;
        this.portrait = str3;
        this.source = str4;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: CONSTRUCTOR 
  (r2v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r5v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:94) call: com.okinc.dapp.bean.KOLProfileParamsBean.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ KOLProfileParamsBean(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4);
    }
}
