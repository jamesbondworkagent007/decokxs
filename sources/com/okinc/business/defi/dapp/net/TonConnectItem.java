package com.okinc.business.defi.dapp.net;

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

/* JADX INFO: loaded from: classes14.dex */
@Serializable
public final class TonConnectItem implements Parcelable {
    private String name;
    private String payload;
    private String url;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<TonConnectItem> CREATOR = new Creator();

    /* JADX INFO: loaded from: classes23.dex */
    public static final class Creator implements Parcelable.Creator<TonConnectItem> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TonConnectItem createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new TonConnectItem(parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TonConnectItem[] newArray(int i) {
            return new TonConnectItem[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TonConnectItem() {
        this((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ TonConnectItem copy$default(TonConnectItem tonConnectItem, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = tonConnectItem.name;
        }
        if ((i & 2) != 0) {
            str2 = tonConnectItem.payload;
        }
        if ((i & 4) != 0) {
            str3 = tonConnectItem.url;
        }
        return tonConnectItem.copy(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.payload;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.url;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TonConnectItem copy(@NotNull String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        return new TonConnectItem(str, str2, str3);
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
        if (!(obj instanceof TonConnectItem)) {
            return false;
        }
        TonConnectItem tonConnectItem = (TonConnectItem) obj;
        return Intrinsics.EZpvd((Object) this.name, (Object) tonConnectItem.name) && Intrinsics.EZpvd((Object) this.payload, (Object) tonConnectItem.payload) && Intrinsics.EZpvd((Object) this.url, (Object) tonConnectItem.url);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getName() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPayload() {
        return this.payload;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUrl() {
        return this.url;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.name.hashCode();
        String str = this.payload;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.url;
        return (((iHashCode * 31) + iHashCode2) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.name = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPayload(String str) {
        this.payload = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUrl(String str) {
        this.url = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TonConnectItem(name=" + this.name + ", payload=" + this.payload + ", url=" + this.url + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.name);
        parcel.writeString(this.payload);
        parcel.writeString(this.url);
    }

    /* JADX INFO: loaded from: classes23.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.dapp.net.TonConnectItem.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TonConnectItem> serializer() {
            return TonConnectItem$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TonConnectItem(int i, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        this.name = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.payload = null;
        } else {
            this.payload = str2;
        }
        if ((i & 4) == 0) {
            this.url = null;
        } else {
            this.url = str3;
        }
    }

    public static final /* synthetic */ void write$Self$OKDiscover_discover_impl(TonConnectItem tonConnectItem, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) tonConnectItem.name, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, tonConnectItem.name);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || tonConnectItem.payload != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, tonConnectItem.payload);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && tonConnectItem.url == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, tonConnectItem.url);
    }

    public TonConnectItem(@NotNull String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        this.name = str;
        this.payload = str2;
        this.url = str3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r4v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:251) call: com.okinc.business.defi.dapp.net.TonConnectItem.<init>(java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ TonConnectItem(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }
}
