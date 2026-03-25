package com.okinc.business.invest_biz.data.bean;

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

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class InvestCustomRedirectData implements Parcelable {
    public static final int $stable = 0;
    public static final String LOCATION_LSD = "LSD";
    public static final String LOCATION_STOKT = "stOKT";
    private final String location;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<InvestCustomRedirectData> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<InvestCustomRedirectData> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InvestCustomRedirectData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new InvestCustomRedirectData(parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InvestCustomRedirectData[] newArray(int i) {
            return new InvestCustomRedirectData[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InvestCustomRedirectData() {
        this((String) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ InvestCustomRedirectData copy$default(InvestCustomRedirectData investCustomRedirectData, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = investCustomRedirectData.location;
        }
        return investCustomRedirectData.copy(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.location;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestCustomRedirectData copy(String str) {
        return new InvestCustomRedirectData(str);
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
        return (obj instanceof InvestCustomRedirectData) && Intrinsics.EZpvd((Object) this.location, (Object) ((InvestCustomRedirectData) obj).location);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLocation() {
        return this.location;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.location;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "InvestCustomRedirectData(location=" + this.location + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.location);
    }

    public /* synthetic */ InvestCustomRedirectData(int i, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.location = null;
        } else {
            this.location = str;
        }
    }

    public static final /* synthetic */ void write$Self$OKDeFi_invest_biz(InvestCustomRedirectData investCustomRedirectData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) && investCustomRedirectData.location == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, investCustomRedirectData.location);
    }

    public InvestCustomRedirectData(String str) {
        this.location = str;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r1v0 java.lang.String))
 A[MD:(java.lang.String):void (m)] (LINE:258) call: com.okinc.business.invest_biz.data.bean.InvestCustomRedirectData.<init>(java.lang.String):void type: THIS */
    public /* synthetic */ InvestCustomRedirectData(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str);
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.data.bean.InvestCustomRedirectData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<InvestCustomRedirectData> serializer() {
            return InvestCustomRedirectData$$serializer.INSTANCE;
        }
    }
}
