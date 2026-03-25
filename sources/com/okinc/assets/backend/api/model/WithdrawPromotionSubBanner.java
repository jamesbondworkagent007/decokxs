package com.okinc.assets.backend.api.model;

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

/* JADX INFO: loaded from: classes22.dex */
@Serializable
public final class WithdrawPromotionSubBanner implements Parcelable {
    private String content;
    private String header;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<WithdrawPromotionSubBanner> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<WithdrawPromotionSubBanner> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WithdrawPromotionSubBanner createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new WithdrawPromotionSubBanner(parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WithdrawPromotionSubBanner[] newArray(int i) {
            return new WithdrawPromotionSubBanner[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public WithdrawPromotionSubBanner() {
        this((String) null, (String) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ WithdrawPromotionSubBanner copy$default(WithdrawPromotionSubBanner withdrawPromotionSubBanner, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = withdrawPromotionSubBanner.header;
        }
        if ((i & 2) != 0) {
            str2 = withdrawPromotionSubBanner.content;
        }
        return withdrawPromotionSubBanner.copy(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.header;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.content;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WithdrawPromotionSubBanner copy(String str, String str2) {
        return new WithdrawPromotionSubBanner(str, str2);
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
        if (!(obj instanceof WithdrawPromotionSubBanner)) {
            return false;
        }
        WithdrawPromotionSubBanner withdrawPromotionSubBanner = (WithdrawPromotionSubBanner) obj;
        return Intrinsics.EZpvd((Object) this.header, (Object) withdrawPromotionSubBanner.header) && Intrinsics.EZpvd((Object) this.content, (Object) withdrawPromotionSubBanner.content);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getContent() {
        return this.content;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getHeader() {
        return this.header;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.header;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.content;
        return (iHashCode * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setContent(String str) {
        this.content = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setHeader(String str) {
        this.header = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "WithdrawPromotionSubBanner(header=" + this.header + ", content=" + this.content + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.header);
        parcel.writeString(this.content);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.assets.backend.api.model.WithdrawPromotionSubBanner.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<WithdrawPromotionSubBanner> serializer() {
            return WithdrawPromotionSubBanner$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ WithdrawPromotionSubBanner(int i, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.header = null;
        } else {
            this.header = str;
        }
        if ((i & 2) == 0) {
            this.content = null;
        } else {
            this.content = str2;
        }
    }

    public static final /* synthetic */ void write$Self$OKAssets_assets_pro_api(WithdrawPromotionSubBanner withdrawPromotionSubBanner, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || withdrawPromotionSubBanner.header != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, withdrawPromotionSubBanner.header);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && withdrawPromotionSubBanner.content == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, withdrawPromotionSubBanner.content);
    }

    public WithdrawPromotionSubBanner(String str, String str2) {
        this.header = str;
        this.content = str2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String):void (m)] (LINE:23) call: com.okinc.assets.backend.api.model.WithdrawPromotionSubBanner.<init>(java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ WithdrawPromotionSubBanner(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }
}
