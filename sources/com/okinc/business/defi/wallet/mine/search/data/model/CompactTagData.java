package com.okinc.business.defi.wallet.mine.search.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import com.ibm.icu.text.DateFormat;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Serializable
public final class CompactTagData implements Parcelable {
    public static final int $stable = 0;

    @SerializedName("e")
    private final TagExtra extra;

    @SerializedName(DateFormat.MINUTE)
    private final String hasMetadata;

    @SerializedName("k")
    private final String key;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<CompactTagData> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<CompactTagData> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CompactTagData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new CompactTagData(parcel.readString(), parcel.readString(), TagExtra.CREATOR.createFromParcel(parcel));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CompactTagData[] newArray(int i) {
            return new CompactTagData[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CompactTagData() {
        this((String) null, (String) null, (TagExtra) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ CompactTagData copy$default(CompactTagData compactTagData, String str, String str2, TagExtra tagExtra, int i, Object obj) {
        if ((i & 1) != 0) {
            str = compactTagData.key;
        }
        if ((i & 2) != 0) {
            str2 = compactTagData.hasMetadata;
        }
        if ((i & 4) != 0) {
            tagExtra = compactTagData.extra;
        }
        return compactTagData.OLrzqt(str, str2, tagExtra);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AEQbTJ() {
        return this.key;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String KWHzl() {
        return this.hasMetadata;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CompactTagData OLrzqt(@NotNull String str, @NotNull String str2, @NotNull TagExtra tagExtra) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(tagExtra, "");
        return new CompactTagData(str, str2, tagExtra);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TagExtra OLrzqt() {
        return this.extra;
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
        if (!(obj instanceof CompactTagData)) {
            return false;
        }
        CompactTagData compactTagData = (CompactTagData) obj;
        return Intrinsics.EZpvd((Object) this.key, (Object) compactTagData.key) && Intrinsics.EZpvd((Object) this.hasMetadata, (Object) compactTagData.hasMetadata) && Intrinsics.EZpvd(this.extra, compactTagData.extra);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.key.hashCode() * 31) + this.hasMetadata.hashCode()) * 31) + this.extra.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CompactTagData(key=" + this.key + ", hasMetadata=" + this.hasMetadata + ", extra=" + this.extra + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.key);
        parcel.writeString(this.hasMetadata);
        this.extra.writeToParcel(parcel, i);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.wallet.mine.search.data.model.CompactTagData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CompactTagData> serializer() {
            return CompactTagData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ CompactTagData(int i, String str, String str2, TagExtra tagExtra, SerializationConstructorMarker serializationConstructorMarker) {
        this.key = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.hasMetadata = "0";
        } else {
            this.hasMetadata = str2;
        }
        if ((i & 4) == 0) {
            this.extra = new TagExtra((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 63, (DefaultConstructorMarker) null);
        } else {
            this.extra = tagExtra;
        }
    }

    public static final /* synthetic */ void KWHzl(CompactTagData compactTagData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) compactTagData.key, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, compactTagData.key);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) compactTagData.hasMetadata, (Object) "0")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, compactTagData.hasMetadata);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && Intrinsics.EZpvd(compactTagData.extra, new TagExtra((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 63, (DefaultConstructorMarker) null))) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 2, TagExtra$$serializer.INSTANCE, compactTagData.extra);
    }

    public CompactTagData(@NotNull String str, @NotNull String str2, @NotNull TagExtra tagExtra) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(tagExtra, "");
        this.key = str;
        this.hasMetadata = str2;
        this.extra = tagExtra;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001f: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r13v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r10v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r13v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("0") : (r11v0 java.lang.String))
  (wrap:com.okinc.business.defi.wallet.mine.search.data.model.TagExtra:?: TERNARY null = ((wrap:int:0x000c: ARITH (r13v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.business.defi.wallet.mine.search.data.model.TagExtra:0x001c: CONSTRUCTOR 
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (63 int)
  (wrap:kotlin.jvm.internal.DefaultConstructorMarker:?: CAST (kotlin.jvm.internal.DefaultConstructorMarker) (null kotlin.jvm.internal.DefaultConstructorMarker))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:195) call: com.okinc.business.defi.wallet.mine.search.data.model.TagExtra.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r12v0 com.okinc.business.defi.wallet.mine.search.data.model.TagExtra))
 A[MD:(java.lang.String, java.lang.String, com.okinc.business.defi.wallet.mine.search.data.model.TagExtra):void (m)] (LINE:186) call: com.okinc.business.defi.wallet.mine.search.data.model.CompactTagData.<init>(java.lang.String, java.lang.String, com.okinc.business.defi.wallet.mine.search.data.model.TagExtra):void type: THIS */
    public /* synthetic */ CompactTagData(String str, String str2, TagExtra tagExtra, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "0" : str2, (i & 4) != 0 ? new TagExtra((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 63, (DefaultConstructorMarker) null) : tagExtra);
    }
}
