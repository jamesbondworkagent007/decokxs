package com.okinc.tradingbot.impl.market_place.bot_copy.itembinder;

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

/* JADX INFO: loaded from: classes19.dex */
@Serializable
public final class BotParamMultiContentData implements Parcelable {
    public static final int $stable = 0;
    public final int right1TextColor;
    public final int right2TextColor;
    public final String text1;
    public final String text2;
    public final String title;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<BotParamMultiContentData> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<BotParamMultiContentData> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BotParamMultiContentData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new BotParamMultiContentData(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BotParamMultiContentData[] newArray(int i) {
            return new BotParamMultiContentData[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public BotParamMultiContentData() {
        this((String) null, (String) null, (String) null, 0, 0, 31, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ BotParamMultiContentData copy$default(BotParamMultiContentData botParamMultiContentData, String str, String str2, String str3, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = botParamMultiContentData.title;
        }
        if ((i3 & 2) != 0) {
            str2 = botParamMultiContentData.text1;
        }
        String str4 = str2;
        if ((i3 & 4) != 0) {
            str3 = botParamMultiContentData.text2;
        }
        String str5 = str3;
        if ((i3 & 8) != 0) {
            i = botParamMultiContentData.right1TextColor;
        }
        int i4 = i;
        if ((i3 & 16) != 0) {
            i2 = botParamMultiContentData.right2TextColor;
        }
        return botParamMultiContentData.KWHzl(str, str4, str5, i4, i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AEQbTJ() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String EZpvd() {
        return this.text1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BotParamMultiContentData KWHzl(@NotNull String str, @NotNull String str2, @NotNull String str3, int i, int i2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new BotParamMultiContentData(str, str2, str3, i, i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String KWHzl() {
        return this.text2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int OLrzqt() {
        return this.right2TextColor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int copydefault() {
        return this.right1TextColor;
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
        if (!(obj instanceof BotParamMultiContentData)) {
            return false;
        }
        BotParamMultiContentData botParamMultiContentData = (BotParamMultiContentData) obj;
        return Intrinsics.EZpvd((Object) this.title, (Object) botParamMultiContentData.title) && Intrinsics.EZpvd((Object) this.text1, (Object) botParamMultiContentData.text1) && Intrinsics.EZpvd((Object) this.text2, (Object) botParamMultiContentData.text2) && this.right1TextColor == botParamMultiContentData.right1TextColor && this.right2TextColor == botParamMultiContentData.right2TextColor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((this.title.hashCode() * 31) + this.text1.hashCode()) * 31) + this.text2.hashCode()) * 31) + Integer.hashCode(this.right1TextColor)) * 31) + Integer.hashCode(this.right2TextColor);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "BotParamMultiContentData(title=" + this.title + ", text1=" + this.text1 + ", text2=" + this.text2 + ", right1TextColor=" + this.right1TextColor + ", right2TextColor=" + this.right2TextColor + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.title);
        parcel.writeString(this.text1);
        parcel.writeString(this.text2);
        parcel.writeInt(this.right1TextColor);
        parcel.writeInt(this.right2TextColor);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.tradingbot.impl.market_place.bot_copy.itembinder.BotParamMultiContentData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<BotParamMultiContentData> serializer() {
            return BotParamMultiContentData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ BotParamMultiContentData(int i, String str, String str2, String str3, int i2, int i3, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.title = "";
        } else {
            this.title = str;
        }
        if ((i & 2) == 0) {
            this.text1 = "";
        } else {
            this.text1 = str2;
        }
        if ((i & 4) == 0) {
            this.text2 = "";
        } else {
            this.text2 = str3;
        }
        if ((i & 8) == 0) {
            this.right1TextColor = 0;
        } else {
            this.right1TextColor = i2;
        }
        if ((i & 16) == 0) {
            this.right2TextColor = 0;
        } else {
            this.right2TextColor = i3;
        }
    }

    public static final /* synthetic */ void EZpvd(BotParamMultiContentData botParamMultiContentData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) botParamMultiContentData.title, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, botParamMultiContentData.title);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) botParamMultiContentData.text1, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, botParamMultiContentData.text1);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) botParamMultiContentData.text2, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, botParamMultiContentData.text2);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || botParamMultiContentData.right1TextColor != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 3, botParamMultiContentData.right1TextColor);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) && botParamMultiContentData.right2TextColor == 0) {
            return;
        }
        compositeEncoder.encodeIntElement(serialDescriptor, 4, botParamMultiContentData.right2TextColor);
    }

    public BotParamMultiContentData(@NotNull String str, @NotNull String str2, @NotNull String str3, int i, int i2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.title = str;
        this.text1 = str2;
        this.text2 = str3;
        this.right1TextColor = i;
        this.right2TextColor = i2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x002a: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r9v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r9v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r5v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r9v0 int) & (4 int) A[WRAPPED]) == (0 int)) ? (r6v0 java.lang.String) : (""))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0016: ARITH (r9v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r7v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x001e: ARITH (r9v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r8v0 int))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, int, int):void (m)] (LINE:59) call: com.okinc.tradingbot.impl.market_place.bot_copy.itembinder.BotParamMultiContentData.<init>(java.lang.String, java.lang.String, java.lang.String, int, int):void type: THIS */
    public /* synthetic */ BotParamMultiContentData(String str, String str2, String str3, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? "" : str2, (i3 & 4) == 0 ? str3 : "", (i3 & 8) != 0 ? 0 : i, (i3 & 16) != 0 ? 0 : i2);
    }
}
