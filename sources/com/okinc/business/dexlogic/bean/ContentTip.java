package com.okinc.business.dexlogic.bean;

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

/* JADX INFO: loaded from: classes5.dex */
@Serializable
public final class ContentTip implements Parcelable {
    public static final int $stable = 0;
    private final Extra extra;
    private final String msg;
    private final String title;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<ContentTip> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<ContentTip> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ContentTip createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new ContentTip(parcel.readInt() == 0 ? null : Extra.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ContentTip[] newArray(int i) {
            return new ContentTip[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ContentTip() {
        this((Extra) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ ContentTip copy$default(ContentTip contentTip, Extra extra, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            extra = contentTip.extra;
        }
        if ((i & 2) != 0) {
            str = contentTip.msg;
        }
        if ((i & 4) != 0) {
            str2 = contentTip.title;
        }
        return contentTip.copy(extra, str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Extra component1() {
        return this.extra;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.msg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ContentTip copy(Extra extra, @NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new ContentTip(extra, str, str2);
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
        if (!(obj instanceof ContentTip)) {
            return false;
        }
        ContentTip contentTip = (ContentTip) obj;
        return Intrinsics.EZpvd(this.extra, contentTip.extra) && Intrinsics.EZpvd((Object) this.msg, (Object) contentTip.msg) && Intrinsics.EZpvd((Object) this.title, (Object) contentTip.title);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Extra getExtra() {
        return this.extra;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMsg() {
        return this.msg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTitle() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Extra extra = this.extra;
        return ((((extra == null ? 0 : extra.hashCode()) * 31) + this.msg.hashCode()) * 31) + this.title.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ContentTip(extra=" + this.extra + ", msg=" + this.msg + ", title=" + this.title + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        Extra extra = this.extra;
        if (extra == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            extra.writeToParcel(parcel, i);
        }
        parcel.writeString(this.msg);
        parcel.writeString(this.title);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dexlogic.bean.ContentTip.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ContentTip> serializer() {
            return ContentTip$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ContentTip(int i, Extra extra, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        this.extra = (i & 1) == 0 ? null : extra;
        if ((i & 2) == 0) {
            this.msg = "";
        } else {
            this.msg = str;
        }
        if ((i & 4) == 0) {
            this.title = "";
        } else {
            this.title = str2;
        }
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(ContentTip contentTip, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || contentTip.extra != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, Extra$$serializer.INSTANCE, contentTip.extra);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) contentTip.msg, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, contentTip.msg);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && Intrinsics.EZpvd((Object) contentTip.title, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 2, contentTip.title);
    }

    public ContentTip(Extra extra, @NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.extra = extra;
        this.msg = str;
        this.title = str2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: CONSTRUCTOR 
  (wrap:com.okinc.business.dexlogic.bean.Extra:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.dexlogic.bean.Extra) : (r2v0 com.okinc.business.dexlogic.bean.Extra))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0005: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
 A[MD:(com.okinc.business.dexlogic.bean.Extra, java.lang.String, java.lang.String):void (m)] (LINE:1993) call: com.okinc.business.dexlogic.bean.ContentTip.<init>(com.okinc.business.dexlogic.bean.Extra, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ ContentTip(Extra extra, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : extra, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2);
    }
}
