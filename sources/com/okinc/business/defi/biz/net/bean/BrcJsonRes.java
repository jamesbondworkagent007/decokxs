package com.okinc.business.defi.biz.net.bean;

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

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class BrcJsonRes implements Parcelable {
    public static final int $stable = 0;
    private final String brcJson;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<BrcJsonRes> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<BrcJsonRes> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BrcJsonRes createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new BrcJsonRes(parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BrcJsonRes[] newArray(int i) {
            return new BrcJsonRes[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public BrcJsonRes() {
        this((String) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ BrcJsonRes copy$default(BrcJsonRes brcJsonRes, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = brcJsonRes.brcJson;
        }
        return brcJsonRes.copy(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.brcJson;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BrcJsonRes copy(String str) {
        return new BrcJsonRes(str);
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
        return (obj instanceof BrcJsonRes) && Intrinsics.EZpvd((Object) this.brcJson, (Object) ((BrcJsonRes) obj).brcJson);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBrcJson() {
        return this.brcJson;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.brcJson;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "BrcJsonRes(brcJson=" + this.brcJson + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.brcJson);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.net.bean.BrcJsonRes.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<BrcJsonRes> serializer() {
            return BrcJsonRes$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ BrcJsonRes(int i, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.brcJson = null;
        } else {
            this.brcJson = str;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(BrcJsonRes brcJsonRes, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) && brcJsonRes.brcJson == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, brcJsonRes.brcJson);
    }

    public BrcJsonRes(String str) {
        this.brcJson = str;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r1v0 java.lang.String))
 A[MD:(java.lang.String):void (m)] (LINE:1265) call: com.okinc.business.defi.biz.net.bean.BrcJsonRes.<init>(java.lang.String):void type: THIS */
    public /* synthetic */ BrcJsonRes(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str);
    }
}
