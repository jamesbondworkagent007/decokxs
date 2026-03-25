package com.okinc.business.invest_biz.data.bean;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class InvestmentLogoData implements Parcelable {
    private String lbLogo;
    private String ltLogo;
    private String rbLogo;
    private String rtLogo;
    private List<String> tokenLogo;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<InvestmentLogoData> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(StringSerializer.INSTANCE), null, null, null, null};

    public static final class Creator implements Parcelable.Creator<InvestmentLogoData> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InvestmentLogoData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new InvestmentLogoData(parcel.createStringArrayList(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InvestmentLogoData[] newArray(int i) {
            return new InvestmentLogoData[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.okinc.business.invest_biz.data.bean.InvestmentLogoData */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InvestmentLogoData copy$default(InvestmentLogoData investmentLogoData, List list, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            list = investmentLogoData.tokenLogo;
        }
        if ((i & 2) != 0) {
            str = investmentLogoData.ltLogo;
        }
        String str5 = str;
        if ((i & 4) != 0) {
            str2 = investmentLogoData.rtLogo;
        }
        String str6 = str2;
        if ((i & 8) != 0) {
            str3 = investmentLogoData.lbLogo;
        }
        String str7 = str3;
        if ((i & 16) != 0) {
            str4 = investmentLogoData.rbLogo;
        }
        return investmentLogoData.copy(list, str5, str6, str7, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component1() {
        return this.tokenLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.ltLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.rtLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.lbLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.rbLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestmentLogoData copy(List<String> list, String str, String str2, String str3, String str4) {
        return new InvestmentLogoData(list, str, str2, str3, str4);
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
        if (!(obj instanceof InvestmentLogoData)) {
            return false;
        }
        InvestmentLogoData investmentLogoData = (InvestmentLogoData) obj;
        return Intrinsics.EZpvd(this.tokenLogo, investmentLogoData.tokenLogo) && Intrinsics.EZpvd((Object) this.ltLogo, (Object) investmentLogoData.ltLogo) && Intrinsics.EZpvd((Object) this.rtLogo, (Object) investmentLogoData.rtLogo) && Intrinsics.EZpvd((Object) this.lbLogo, (Object) investmentLogoData.lbLogo) && Intrinsics.EZpvd((Object) this.rbLogo, (Object) investmentLogoData.rbLogo);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLbLogo() {
        return this.lbLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLtLogo() {
        return this.ltLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRbLogo() {
        return this.rbLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRtLogo() {
        return this.rtLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getTokenLogo() {
        return this.tokenLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        List<String> list = this.tokenLogo;
        int iHashCode = list == null ? 0 : list.hashCode();
        String str = this.ltLogo;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.rtLogo;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.lbLogo;
        int iHashCode4 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.rbLogo;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (str4 != null ? str4.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLbLogo(String str) {
        this.lbLogo = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLtLogo(String str) {
        this.ltLogo = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRbLogo(String str) {
        this.rbLogo = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRtLogo(String str) {
        this.rtLogo = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTokenLogo(List<String> list) {
        this.tokenLogo = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "InvestmentLogoData(tokenLogo=" + this.tokenLogo + ", ltLogo=" + this.ltLogo + ", rtLogo=" + this.rtLogo + ", lbLogo=" + this.lbLogo + ", rbLogo=" + this.rbLogo + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeStringList(this.tokenLogo);
        parcel.writeString(this.ltLogo);
        parcel.writeString(this.rtLogo);
        parcel.writeString(this.lbLogo);
        parcel.writeString(this.rbLogo);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.data.bean.InvestmentLogoData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<InvestmentLogoData> serializer() {
            return InvestmentLogoData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ InvestmentLogoData(int i, List list, String str, String str2, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, InvestmentLogoData$$serializer.INSTANCE.getDescriptor());
        }
        this.tokenLogo = list;
        if ((i & 2) == 0) {
            this.ltLogo = "";
        } else {
            this.ltLogo = str;
        }
        if ((i & 4) == 0) {
            this.rtLogo = "";
        } else {
            this.rtLogo = str2;
        }
        if ((i & 8) == 0) {
            this.lbLogo = "";
        } else {
            this.lbLogo = str3;
        }
        if ((i & 16) == 0) {
            this.rbLogo = "";
        } else {
            this.rbLogo = str4;
        }
    }

    public static final /* synthetic */ void write$Self$OKDeFi_invest_biz(InvestmentLogoData investmentLogoData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, $childSerializers[0], investmentLogoData.tokenLogo);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) investmentLogoData.ltLogo, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, investmentLogoData.ltLogo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) investmentLogoData.rtLogo, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, investmentLogoData.rtLogo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) investmentLogoData.lbLogo, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, investmentLogoData.lbLogo);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) && Intrinsics.EZpvd((Object) investmentLogoData.rbLogo, (Object) "")) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, investmentLogoData.rbLogo);
    }

    public InvestmentLogoData(List<String> list, String str, String str2, String str3, String str4) {
        this.tokenLogo = list;
        this.ltLogo = str;
        this.rtLogo = str2;
        this.lbLogo = str3;
        this.rbLogo = str4;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0020: CONSTRUCTOR 
  (r8v0 java.util.List)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r13v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r9v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r13v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r10v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r13v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r11v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0017: ARITH (r13v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r12v0 java.lang.String))
 A[MD:(java.util.List<java.lang.String>, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:26) call: com.okinc.business.invest_biz.data.bean.InvestmentLogoData.<init>(java.util.List, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ InvestmentLogoData(List list, String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? "" : str4);
    }
}
