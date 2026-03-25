package com.okinc.unify_trade.biz.bot;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.GravityInt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Serializable
public final class BotRecommendDetailItem implements Parcelable {
    public static final int $stable = 0;
    private final String doubt;
    private final int gravity;
    private final String title;
    private final String value;
    private final FontStyleBean valueFont;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<BotRecommendDetailItem> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<BotRecommendDetailItem> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BotRecommendDetailItem createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new BotRecommendDetailItem(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt() == 0 ? null : FontStyleBean.CREATOR.createFromParcel(parcel));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BotRecommendDetailItem[] newArray(int i) {
            return new BotRecommendDetailItem[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ BotRecommendDetailItem copy$default(BotRecommendDetailItem botRecommendDetailItem, String str, String str2, String str3, int i, FontStyleBean fontStyleBean, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = botRecommendDetailItem.title;
        }
        if ((i2 & 2) != 0) {
            str2 = botRecommendDetailItem.value;
        }
        String str4 = str2;
        if ((i2 & 4) != 0) {
            str3 = botRecommendDetailItem.doubt;
        }
        String str5 = str3;
        if ((i2 & 8) != 0) {
            i = botRecommendDetailItem.gravity;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
            fontStyleBean = botRecommendDetailItem.valueFont;
        }
        return botRecommendDetailItem.copy(str, str4, str5, i3, fontStyleBean);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.doubt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component4() {
        return this.gravity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FontStyleBean component5() {
        return this.valueFont;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BotRecommendDetailItem copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @GravityInt int i, FontStyleBean fontStyleBean) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new BotRecommendDetailItem(str, str2, str3, i, fontStyleBean);
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
        if (!(obj instanceof BotRecommendDetailItem)) {
            return false;
        }
        BotRecommendDetailItem botRecommendDetailItem = (BotRecommendDetailItem) obj;
        return Intrinsics.EZpvd((Object) this.title, (Object) botRecommendDetailItem.title) && Intrinsics.EZpvd((Object) this.value, (Object) botRecommendDetailItem.value) && Intrinsics.EZpvd((Object) this.doubt, (Object) botRecommendDetailItem.doubt) && this.gravity == botRecommendDetailItem.gravity && Intrinsics.EZpvd(this.valueFont, botRecommendDetailItem.valueFont);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDoubt() {
        return this.doubt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getGravity() {
        return this.gravity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTitle() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getValue() {
        return this.value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FontStyleBean getValueFont() {
        return this.valueFont;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.title.hashCode();
        int iHashCode2 = this.value.hashCode();
        int iHashCode3 = this.doubt.hashCode();
        int iHashCode4 = Integer.hashCode(this.gravity);
        FontStyleBean fontStyleBean = this.valueFont;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (fontStyleBean == null ? 0 : fontStyleBean.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "BotRecommendDetailItem(title=" + this.title + ", value=" + this.value + ", doubt=" + this.doubt + ", gravity=" + this.gravity + ", valueFont=" + this.valueFont + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.title);
        parcel.writeString(this.value);
        parcel.writeString(this.doubt);
        parcel.writeInt(this.gravity);
        FontStyleBean fontStyleBean = this.valueFont;
        if (fontStyleBean == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            fontStyleBean.writeToParcel(parcel, i);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.bot.BotRecommendDetailItem.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<BotRecommendDetailItem> serializer() {
            return BotRecommendDetailItem$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ BotRecommendDetailItem(int i, String str, String str2, String str3, int i2, FontStyleBean fontStyleBean, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, BotRecommendDetailItem$$serializer.INSTANCE.getDescriptor());
        }
        this.title = str;
        this.value = str2;
        if ((i & 4) == 0) {
            this.doubt = "";
        } else {
            this.doubt = str3;
        }
        if ((i & 8) == 0) {
            this.gravity = 8388611;
        } else {
            this.gravity = i2;
        }
        if ((i & 16) == 0) {
            this.valueFont = null;
        } else {
            this.valueFont = fontStyleBean;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(BotRecommendDetailItem botRecommendDetailItem, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, botRecommendDetailItem.title);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, botRecommendDetailItem.value);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) botRecommendDetailItem.doubt, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, botRecommendDetailItem.doubt);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || botRecommendDetailItem.gravity != 8388611) {
            compositeEncoder.encodeIntElement(serialDescriptor, 3, botRecommendDetailItem.gravity);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) && botRecommendDetailItem.valueFont == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, FontStyleBean$$serializer.INSTANCE, botRecommendDetailItem.valueFont);
    }

    public BotRecommendDetailItem(@NotNull String str, @NotNull String str2, @NotNull String str3, @GravityInt int i, FontStyleBean fontStyleBean) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.title = str;
        this.value = str2;
        this.doubt = str3;
        this.gravity = i;
        this.valueFont = fontStyleBean;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0018: CONSTRUCTOR 
  (r7v0 java.lang.String)
  (r8v0 java.lang.String)
  (wrap:java.lang.String:0x0006: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r9v0 java.lang.String))
  (wrap:int:0x000e: TERNARY null = ((wrap:int:0x0007: ARITH (r12v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (8388611 int) : (r10v0 int))
  (wrap:com.okinc.unify_trade.biz.bot.FontStyleBean:?: TERNARY null = ((wrap:int:0x000f: ARITH (r12v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.unify_trade.biz.bot.FontStyleBean) : (r11v0 com.okinc.unify_trade.biz.bot.FontStyleBean))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, int, com.okinc.unify_trade.biz.bot.FontStyleBean):void (m)] (LINE:137) call: com.okinc.unify_trade.biz.bot.BotRecommendDetailItem.<init>(java.lang.String, java.lang.String, java.lang.String, int, com.okinc.unify_trade.biz.bot.FontStyleBean):void type: THIS */
    public /* synthetic */ BotRecommendDetailItem(String str, String str2, String str3, int i, FontStyleBean fontStyleBean, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i2 & 4) != 0 ? "" : str3, (i2 & 8) != 0 ? 8388611 : i, (i2 & 16) != 0 ? null : fontStyleBean);
    }
}
