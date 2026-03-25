package com.okinc.buysell.ui.result.view;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class BannerClickCallback implements Parcelable {
    public static final int $stable = 0;
    private final Integer currencyId;
    private final String token;
    private final String type;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<BannerClickCallback> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<BannerClickCallback> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BannerClickCallback createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new BannerClickCallback(parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BannerClickCallback[] newArray(int i) {
            return new BannerClickCallback[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public BannerClickCallback() {
        this((String) null, (Integer) null, (String) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ BannerClickCallback copy$default(BannerClickCallback bannerClickCallback, String str, Integer num, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bannerClickCallback.type;
        }
        if ((i & 2) != 0) {
            num = bannerClickCallback.currencyId;
        }
        if ((i & 4) != 0) {
            str2 = bannerClickCallback.token;
        }
        return bannerClickCallback.copy(str, num, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component2() {
        return this.currencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.token;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BannerClickCallback copy(String str, Integer num, String str2) {
        return new BannerClickCallback(str, num, str2);
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
        if (!(obj instanceof BannerClickCallback)) {
            return false;
        }
        BannerClickCallback bannerClickCallback = (BannerClickCallback) obj;
        return Intrinsics.EZpvd((Object) this.type, (Object) bannerClickCallback.type) && Intrinsics.EZpvd(this.currencyId, bannerClickCallback.currencyId) && Intrinsics.EZpvd((Object) this.token, (Object) bannerClickCallback.token);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getCurrencyId() {
        return this.currencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getToken() {
        return this.token;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getType() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.type;
        int iHashCode = str == null ? 0 : str.hashCode();
        Integer num = this.currencyId;
        int iHashCode2 = num == null ? 0 : num.hashCode();
        String str2 = this.token;
        return (((iHashCode * 31) + iHashCode2) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "BannerClickCallback(type=" + this.type + ", currencyId=" + this.currencyId + ", token=" + this.token + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int iIntValue;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.type);
        Integer num = this.currencyId;
        if (num == null) {
            iIntValue = 0;
        } else {
            parcel.writeInt(1);
            iIntValue = num.intValue();
        }
        parcel.writeInt(iIntValue);
        parcel.writeString(this.token);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.buysell.ui.result.view.BannerClickCallback.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<BannerClickCallback> serializer() {
            return BannerClickCallback$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ BannerClickCallback(int i, String str, Integer num, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.type = "";
        } else {
            this.type = str;
        }
        if ((i & 2) == 0) {
            this.currencyId = -1;
        } else {
            this.currencyId = num;
        }
        if ((i & 4) == 0) {
            this.token = "";
        } else {
            this.token = str2;
        }
    }

    public static final /* synthetic */ void write$Self$OKBuySell_buysell_impl(BannerClickCallback bannerClickCallback, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        Integer num;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) bannerClickCallback.type, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, bannerClickCallback.type);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || (num = bannerClickCallback.currencyId) == null || num.intValue() != -1) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, IntSerializer.INSTANCE, bannerClickCallback.currencyId);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && Intrinsics.EZpvd((Object) bannerClickCallback.token, (Object) "")) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, bannerClickCallback.token);
    }

    public BannerClickCallback(String str, Integer num, String str2) {
        this.type = str;
        this.currencyId = num;
        this.token = str2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0007: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (-1 int) : (r3v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.Integer, java.lang.String):void (m)] (LINE:27) call: com.okinc.buysell.ui.result.view.BannerClickCallback.<init>(java.lang.String, java.lang.Integer, java.lang.String):void type: THIS */
    public /* synthetic */ BannerClickCallback(String str, Integer num, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? -1 : num, (i & 4) != 0 ? "" : str2);
    }
}
