package com.okinc.business.dexlogic.main.market.bean;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class BubbleMapData implements Parcelable {
    public static final int $stable = 0;
    private final String okxDarkDefaultLogo;
    private final String okxLightDefaultLogo;
    private final String okxWebSiteUrl;
    private final String thirdPartyWebSiteColorLogo;
    private final String thirdPartyWebSiteUrl;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<BubbleMapData> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<BubbleMapData> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BubbleMapData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new BubbleMapData(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BubbleMapData[] newArray(int i) {
            return new BubbleMapData[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public BubbleMapData() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, 31, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ BubbleMapData copy$default(BubbleMapData bubbleMapData, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bubbleMapData.okxWebSiteUrl;
        }
        if ((i & 2) != 0) {
            str2 = bubbleMapData.okxDarkDefaultLogo;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = bubbleMapData.okxLightDefaultLogo;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = bubbleMapData.thirdPartyWebSiteUrl;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = bubbleMapData.thirdPartyWebSiteColorLogo;
        }
        return bubbleMapData.copy(str, str6, str7, str8, str5);
    }

    @SerialName("okxDarkDefaultLogo")
    public static /* synthetic */ void getOkxDarkDefaultLogo$annotations() {
    }

    @SerialName("okxLightDefaultLogo")
    public static /* synthetic */ void getOkxLightDefaultLogo$annotations() {
    }

    @SerialName("okxWebSiteUrl")
    public static /* synthetic */ void getOkxWebSiteUrl$annotations() {
    }

    @SerialName("thirdPartyWebSiteColorLogo")
    public static /* synthetic */ void getThirdPartyWebSiteColorLogo$annotations() {
    }

    @SerialName("thirdPartyWebSiteUrl")
    public static /* synthetic */ void getThirdPartyWebSiteUrl$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.okxWebSiteUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.okxDarkDefaultLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.okxLightDefaultLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.thirdPartyWebSiteUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.thirdPartyWebSiteColorLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BubbleMapData copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        return new BubbleMapData(str, str2, str3, str4, str5);
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
        if (!(obj instanceof BubbleMapData)) {
            return false;
        }
        BubbleMapData bubbleMapData = (BubbleMapData) obj;
        return Intrinsics.EZpvd((Object) this.okxWebSiteUrl, (Object) bubbleMapData.okxWebSiteUrl) && Intrinsics.EZpvd((Object) this.okxDarkDefaultLogo, (Object) bubbleMapData.okxDarkDefaultLogo) && Intrinsics.EZpvd((Object) this.okxLightDefaultLogo, (Object) bubbleMapData.okxLightDefaultLogo) && Intrinsics.EZpvd((Object) this.thirdPartyWebSiteUrl, (Object) bubbleMapData.thirdPartyWebSiteUrl) && Intrinsics.EZpvd((Object) this.thirdPartyWebSiteColorLogo, (Object) bubbleMapData.thirdPartyWebSiteColorLogo);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOkxDarkDefaultLogo() {
        return this.okxDarkDefaultLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOkxLightDefaultLogo() {
        return this.okxLightDefaultLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOkxWebSiteUrl() {
        return this.okxWebSiteUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getThirdPartyWebSiteColorLogo() {
        return this.thirdPartyWebSiteColorLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getThirdPartyWebSiteUrl() {
        return this.thirdPartyWebSiteUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((this.okxWebSiteUrl.hashCode() * 31) + this.okxDarkDefaultLogo.hashCode()) * 31) + this.okxLightDefaultLogo.hashCode()) * 31) + this.thirdPartyWebSiteUrl.hashCode()) * 31) + this.thirdPartyWebSiteColorLogo.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "BubbleMapData(okxWebSiteUrl=" + this.okxWebSiteUrl + ", okxDarkDefaultLogo=" + this.okxDarkDefaultLogo + ", okxLightDefaultLogo=" + this.okxLightDefaultLogo + ", thirdPartyWebSiteUrl=" + this.thirdPartyWebSiteUrl + ", thirdPartyWebSiteColorLogo=" + this.thirdPartyWebSiteColorLogo + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.okxWebSiteUrl);
        parcel.writeString(this.okxDarkDefaultLogo);
        parcel.writeString(this.okxLightDefaultLogo);
        parcel.writeString(this.thirdPartyWebSiteUrl);
        parcel.writeString(this.thirdPartyWebSiteColorLogo);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dexlogic.main.market.bean.BubbleMapData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<BubbleMapData> serializer() {
            return BubbleMapData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ BubbleMapData(int i, String str, String str2, String str3, String str4, String str5, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.okxWebSiteUrl = "";
        } else {
            this.okxWebSiteUrl = str;
        }
        if ((i & 2) == 0) {
            this.okxDarkDefaultLogo = "";
        } else {
            this.okxDarkDefaultLogo = str2;
        }
        if ((i & 4) == 0) {
            this.okxLightDefaultLogo = "";
        } else {
            this.okxLightDefaultLogo = str3;
        }
        if ((i & 8) == 0) {
            this.thirdPartyWebSiteUrl = "";
        } else {
            this.thirdPartyWebSiteUrl = str4;
        }
        if ((i & 16) == 0) {
            this.thirdPartyWebSiteColorLogo = "";
        } else {
            this.thirdPartyWebSiteColorLogo = str5;
        }
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(BubbleMapData bubbleMapData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) bubbleMapData.okxWebSiteUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, bubbleMapData.okxWebSiteUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) bubbleMapData.okxDarkDefaultLogo, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, bubbleMapData.okxDarkDefaultLogo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) bubbleMapData.okxLightDefaultLogo, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, bubbleMapData.okxLightDefaultLogo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) bubbleMapData.thirdPartyWebSiteUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, bubbleMapData.thirdPartyWebSiteUrl);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) && Intrinsics.EZpvd((Object) bubbleMapData.thirdPartyWebSiteColorLogo, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 4, bubbleMapData.thirdPartyWebSiteColorLogo);
    }

    public BubbleMapData(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.okxWebSiteUrl = str;
        this.okxDarkDefaultLogo = str2;
        this.okxLightDefaultLogo = str3;
        this.thirdPartyWebSiteUrl = str4;
        this.thirdPartyWebSiteColorLogo = str5;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x002a: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r10v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r5v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r10v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r10v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0017: ARITH (r10v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001e: ARITH (r10v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r9v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:194) call: com.okinc.business.dexlogic.main.market.bean.BubbleMapData.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ BubbleMapData(String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5);
    }
}
