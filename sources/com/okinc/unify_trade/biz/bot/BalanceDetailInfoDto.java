package com.okinc.unify_trade.biz.bot;

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

/* JADX INFO: loaded from: classes12.dex */
@Serializable
public final class BalanceDetailInfoDto implements Parcelable {
    public static final int $stable = 0;
    public static final String Key = "BalanceDetailInfoDto";
    private final String accGridProfit;
    private final String actualMargin;
    private final String assetInBot;
    private final String curGridProfit;
    private final String displayAccGridProfit;
    private final String displayCurGridProfit;
    private final String extraMargin;
    private final String frozenGridProfit;
    private final String withdrawnGridProfit;
    private final String withdrawnMargin;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<BalanceDetailInfoDto> CREATOR = new Creator();
    private static final BalanceDetailInfoDto Empty = new BalanceDetailInfoDto((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 1023, (DefaultConstructorMarker) null);

    public static final class Creator implements Parcelable.Creator<BalanceDetailInfoDto> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BalanceDetailInfoDto createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new BalanceDetailInfoDto(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BalanceDetailInfoDto[] newArray(int i) {
            return new BalanceDetailInfoDto[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public BalanceDetailInfoDto() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 1023, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.accGridProfit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.assetInBot;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.curGridProfit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.displayCurGridProfit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.displayAccGridProfit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.withdrawnGridProfit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.frozenGridProfit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.withdrawnMargin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.extraMargin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.actualMargin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BalanceDetailInfoDto copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        return new BalanceDetailInfoDto(str, str2, str3, str4, str5, str6, str7, str8, str9, str10);
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
        if (!(obj instanceof BalanceDetailInfoDto)) {
            return false;
        }
        BalanceDetailInfoDto balanceDetailInfoDto = (BalanceDetailInfoDto) obj;
        return Intrinsics.EZpvd((Object) this.accGridProfit, (Object) balanceDetailInfoDto.accGridProfit) && Intrinsics.EZpvd((Object) this.curGridProfit, (Object) balanceDetailInfoDto.curGridProfit) && Intrinsics.EZpvd((Object) this.displayCurGridProfit, (Object) balanceDetailInfoDto.displayCurGridProfit) && Intrinsics.EZpvd((Object) this.displayAccGridProfit, (Object) balanceDetailInfoDto.displayAccGridProfit) && Intrinsics.EZpvd((Object) this.withdrawnGridProfit, (Object) balanceDetailInfoDto.withdrawnGridProfit) && Intrinsics.EZpvd((Object) this.frozenGridProfit, (Object) balanceDetailInfoDto.frozenGridProfit) && Intrinsics.EZpvd((Object) this.withdrawnMargin, (Object) balanceDetailInfoDto.withdrawnMargin) && Intrinsics.EZpvd((Object) this.extraMargin, (Object) balanceDetailInfoDto.extraMargin) && Intrinsics.EZpvd((Object) this.actualMargin, (Object) balanceDetailInfoDto.actualMargin) && Intrinsics.EZpvd((Object) this.assetInBot, (Object) balanceDetailInfoDto.assetInBot);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAccGridProfit() {
        return this.accGridProfit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getActualMargin() {
        return this.actualMargin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAssetInBot() {
        return this.assetInBot;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCurGridProfit() {
        return this.curGridProfit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDisplayAccGridProfit() {
        return this.displayAccGridProfit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDisplayCurGridProfit() {
        return this.displayCurGridProfit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getExtraMargin() {
        return this.extraMargin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFrozenGridProfit() {
        return this.frozenGridProfit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getWithdrawnGridProfit() {
        return this.withdrawnGridProfit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getWithdrawnMargin() {
        return this.withdrawnMargin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((this.accGridProfit.hashCode() * 31) + this.curGridProfit.hashCode()) * 31) + this.displayCurGridProfit.hashCode()) * 31) + this.displayAccGridProfit.hashCode()) * 31) + this.withdrawnGridProfit.hashCode()) * 31) + this.frozenGridProfit.hashCode()) * 31) + this.withdrawnMargin.hashCode()) * 31) + this.extraMargin.hashCode()) * 31) + this.actualMargin.hashCode()) * 31) + this.assetInBot.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "BalanceDetailInfoDto(accGridProfit=" + this.accGridProfit + ", curGridProfit=" + this.curGridProfit + ", displayCurGridProfit=" + this.displayCurGridProfit + ", displayAccGridProfit=" + this.displayAccGridProfit + ", withdrawnGridProfit=" + this.withdrawnGridProfit + ", frozenGridProfit=" + this.frozenGridProfit + ", withdrawnMargin=" + this.withdrawnMargin + ", extraMargin=" + this.extraMargin + ", actualMargin=" + this.actualMargin + ", assetInBot=" + this.assetInBot + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.accGridProfit);
        parcel.writeString(this.curGridProfit);
        parcel.writeString(this.displayCurGridProfit);
        parcel.writeString(this.displayAccGridProfit);
        parcel.writeString(this.withdrawnGridProfit);
        parcel.writeString(this.frozenGridProfit);
        parcel.writeString(this.withdrawnMargin);
        parcel.writeString(this.extraMargin);
        parcel.writeString(this.actualMargin);
        parcel.writeString(this.assetInBot);
    }

    public /* synthetic */ BalanceDetailInfoDto(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.accGridProfit = "";
        } else {
            this.accGridProfit = str;
        }
        if ((i & 2) == 0) {
            this.curGridProfit = "";
        } else {
            this.curGridProfit = str2;
        }
        if ((i & 4) == 0) {
            this.displayCurGridProfit = "";
        } else {
            this.displayCurGridProfit = str3;
        }
        if ((i & 8) == 0) {
            this.displayAccGridProfit = "";
        } else {
            this.displayAccGridProfit = str4;
        }
        if ((i & 16) == 0) {
            this.withdrawnGridProfit = "";
        } else {
            this.withdrawnGridProfit = str5;
        }
        if ((i & 32) == 0) {
            this.frozenGridProfit = "";
        } else {
            this.frozenGridProfit = str6;
        }
        if ((i & 64) == 0) {
            this.withdrawnMargin = "";
        } else {
            this.withdrawnMargin = str7;
        }
        if ((i & 128) == 0) {
            this.extraMargin = "";
        } else {
            this.extraMargin = str8;
        }
        if ((i & 256) == 0) {
            this.actualMargin = "";
        } else {
            this.actualMargin = str9;
        }
        if ((i & 512) == 0) {
            this.assetInBot = "";
        } else {
            this.assetInBot = str10;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(BalanceDetailInfoDto balanceDetailInfoDto, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) balanceDetailInfoDto.accGridProfit, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, balanceDetailInfoDto.accGridProfit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) balanceDetailInfoDto.curGridProfit, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, balanceDetailInfoDto.curGridProfit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) balanceDetailInfoDto.displayCurGridProfit, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, balanceDetailInfoDto.displayCurGridProfit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) balanceDetailInfoDto.displayAccGridProfit, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, balanceDetailInfoDto.displayAccGridProfit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) balanceDetailInfoDto.withdrawnGridProfit, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, balanceDetailInfoDto.withdrawnGridProfit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) balanceDetailInfoDto.frozenGridProfit, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, balanceDetailInfoDto.frozenGridProfit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) balanceDetailInfoDto.withdrawnMargin, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, balanceDetailInfoDto.withdrawnMargin);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) balanceDetailInfoDto.extraMargin, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, balanceDetailInfoDto.extraMargin);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) balanceDetailInfoDto.actualMargin, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, balanceDetailInfoDto.actualMargin);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) && Intrinsics.EZpvd((Object) balanceDetailInfoDto.assetInBot, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 9, balanceDetailInfoDto.assetInBot);
    }

    public BalanceDetailInfoDto(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        this.accGridProfit = str;
        this.curGridProfit = str2;
        this.displayCurGridProfit = str3;
        this.displayAccGridProfit = str4;
        this.withdrawnGridProfit = str5;
        this.frozenGridProfit = str6;
        this.withdrawnMargin = str7;
        this.extraMargin = str8;
        this.actualMargin = str9;
        this.assetInBot = str10;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0061: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r22v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r22v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r13v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0012: ARITH (r22v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0019: ARITH (r22v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0020: ARITH (r22v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0028: ARITH (r22v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0030: ARITH (r22v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0038: ARITH (r22v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0040: ARITH (r22v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0048: ARITH (r22v0 int) & (512 int) A[WRAPPED]) == (0 int)) ? (r21v0 java.lang.String) : (""))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:11) call: com.okinc.unify_trade.biz.bot.BalanceDetailInfoDto.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ BalanceDetailInfoDto(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? "" : str8, (i & 256) != 0 ? "" : str9, (i & 512) == 0 ? str10 : "");
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.bot.BalanceDetailInfoDto.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<BalanceDetailInfoDto> serializer() {
            return BalanceDetailInfoDto$$serializer.INSTANCE;
        }

        public final BalanceDetailInfoDto EZpvd() {
            return BalanceDetailInfoDto.Empty;
        }
    }
}
