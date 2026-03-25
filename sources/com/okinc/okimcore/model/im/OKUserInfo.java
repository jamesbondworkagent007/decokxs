package com.okinc.okimcore.model.im;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.engagelab.privates.analysis.constants.MTAnalysisConstants;
import com.okinc.okimcore.model.utility.UriSerializer;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class OKUserInfo implements Parcelable {
    private String alias;
    private String extra;
    private String name;
    private Uri portraitUri;
    private String userId;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<OKUserInfo> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<OKUserInfo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OKUserInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new OKUserInfo(parcel.readString(), parcel.readString(), parcel.readString(), (Uri) parcel.readParcelable(OKUserInfo.class.getClassLoader()), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OKUserInfo[] newArray(int i) {
            return new OKUserInfo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public OKUserInfo() {
        this((String) null, (String) null, (String) null, (Uri) null, (String) null, 31, (DefaultConstructorMarker) null);
    }

    @SerialName("")
    public static /* synthetic */ void getAlias$annotations() {
    }

    @SerialName(MTAnalysisConstants.ACCOUNT_EXTRA_ATTR)
    public static /* synthetic */ void getExtra$annotations() {
    }

    @SerialName("name")
    public static /* synthetic */ void getName$annotations() {
    }

    @SerialName("portrait")
    @Serializable(with = UriSerializer.class)
    public static /* synthetic */ void getPortraitUri$annotations() {
    }

    @SerialName("id")
    public static /* synthetic */ void getUserId$annotations() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAlias() {
        return this.alias;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getExtra() {
        return this.extra;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getName() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Uri getPortraitUri() {
        return this.portraitUri;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUserId() {
        return this.userId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAlias(String str) {
        this.alias = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setExtra(String str) {
        this.extra = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setName(String str) {
        this.name = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPortraitUri(Uri uri) {
        this.portraitUri = uri;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUserId(String str) {
        this.userId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.userId);
        parcel.writeString(this.name);
        parcel.writeString(this.alias);
        parcel.writeParcelable(this.portraitUri, i);
        parcel.writeString(this.extra);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.im.OKUserInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<OKUserInfo> serializer() {
            return OKUserInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ OKUserInfo(int i, String str, String str2, String str3, Uri uri, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.userId = null;
        } else {
            this.userId = str;
        }
        if ((i & 2) == 0) {
            this.name = null;
        } else {
            this.name = str2;
        }
        if ((i & 4) == 0) {
            this.alias = null;
        } else {
            this.alias = str3;
        }
        if ((i & 8) == 0) {
            this.portraitUri = null;
        } else {
            this.portraitUri = uri;
        }
        if ((i & 16) == 0) {
            this.extra = null;
        } else {
            this.extra = str4;
        }
    }

    public static final /* synthetic */ void write$Self$OKIMCore_okimcore(OKUserInfo oKUserInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || oKUserInfo.userId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, oKUserInfo.userId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || oKUserInfo.name != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, oKUserInfo.name);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || oKUserInfo.alias != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, oKUserInfo.alias);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || oKUserInfo.portraitUri != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, UriSerializer.INSTANCE, oKUserInfo.portraitUri);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) && oKUserInfo.extra == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, oKUserInfo.extra);
    }

    public OKUserInfo(String str, String str2, String str3, Uri uri, String str4) {
        this.userId = str;
        this.name = str2;
        this.alias = str3;
        this.portraitUri = uri;
        this.extra = str4;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0029: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r10v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r5v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r10v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000f: ARITH (r10v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r7v0 java.lang.String))
  (wrap:android.net.Uri:?: TERNARY null = ((wrap:int:0x0016: ARITH (r10v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null android.net.Uri) : (r8v0 android.net.Uri))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001d: ARITH (r10v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r9v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, android.net.Uri, java.lang.String):void (m)] (LINE:17) call: com.okinc.okimcore.model.im.OKUserInfo.<init>(java.lang.String, java.lang.String, java.lang.String, android.net.Uri, java.lang.String):void type: THIS */
    public /* synthetic */ OKUserInfo(String str, String str2, String str3, Uri uri, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : uri, (i & 16) != 0 ? null : str4);
    }
}
