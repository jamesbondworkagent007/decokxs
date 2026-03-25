package com.okinc.unify_trade.bot.data;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Serializable
public class SignalCoinPairItemData implements Parcelable {
    private final int VPadding;
    private final String ccy;
    private final String instId;
    private final String instType;
    private final boolean isItemClick;
    private final boolean isRightClick;
    private final boolean isRightIconVisible;
    private final String maxLever;
    private final Integer rightIcon;
    private boolean singleLine;
    private final String title;
    private final Integer titleIcon;
    private String titleUrl;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<SignalCoinPairItemData> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<SignalCoinPairItemData> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SignalCoinPairItemData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new SignalCoinPairItemData(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt(), parcel.readInt() != 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SignalCoinPairItemData[] newArray(int i) {
            return new SignalCoinPairItemData[i];
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCcy() {
        return this.ccy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInstId() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInstType() {
        return this.instType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMaxLever() {
        return this.maxLever;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getRightIcon() {
        return this.rightIcon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getSingleLine() {
        return this.singleLine;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTitle() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getTitleIcon() {
        return this.titleIcon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTitleUrl() {
        return this.titleUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getVPadding() {
        return this.VPadding;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isItemClick() {
        return this.isItemClick;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isRightClick() {
        return this.isRightClick;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isRightIconVisible() {
        return this.isRightIconVisible;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSingleLine(boolean z) {
        this.singleLine = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTitleUrl(String str) {
        this.titleUrl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.title);
        parcel.writeString(this.titleUrl);
        Integer num = this.titleIcon;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Integer num2 = this.rightIcon;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        parcel.writeString(this.instId);
        parcel.writeString(this.instType);
        parcel.writeString(this.ccy);
        parcel.writeString(this.maxLever);
        parcel.writeInt(this.isItemClick ? 1 : 0);
        parcel.writeInt(this.isRightClick ? 1 : 0);
        parcel.writeInt(this.isRightIconVisible ? 1 : 0);
        parcel.writeInt(this.VPadding);
        parcel.writeInt(this.singleLine ? 1 : 0);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.bot.data.SignalCoinPairItemData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SignalCoinPairItemData> serializer() {
            return SignalCoinPairItemData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SignalCoinPairItemData(int i, String str, String str2, Integer num, Integer num2, String str3, String str4, String str5, String str6, boolean z, boolean z2, boolean z3, int i2, boolean z4, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, SignalCoinPairItemData$$serializer.INSTANCE.getDescriptor());
        }
        this.title = str;
        this.titleUrl = (i & 2) == 0 ? null : str2;
        this.titleIcon = (i & 4) == 0 ? 0 : num;
        this.rightIcon = (i & 8) == 0 ? 0 : num2;
        if ((i & 16) == 0) {
            this.instId = "";
        } else {
            this.instId = str3;
        }
        if ((i & 32) == 0) {
            this.instType = "";
        } else {
            this.instType = str4;
        }
        if ((i & 64) == 0) {
            this.ccy = "";
        } else {
            this.ccy = str5;
        }
        if ((i & 128) == 0) {
            this.maxLever = "";
        } else {
            this.maxLever = str6;
        }
        if ((i & 256) == 0) {
            this.isItemClick = false;
        } else {
            this.isItemClick = z;
        }
        if ((i & 512) == 0) {
            this.isRightClick = true;
        } else {
            this.isRightClick = z2;
        }
        if ((i & 1024) == 0) {
            this.isRightIconVisible = true;
        } else {
            this.isRightIconVisible = z3;
        }
        if ((i & 2048) == 0) {
            this.VPadding = 0;
        } else {
            this.VPadding = i2;
        }
        if ((i & 4096) == 0) {
            this.singleLine = false;
        } else {
            this.singleLine = z4;
        }
    }

    public static final /* synthetic */ void write$Self(SignalCoinPairItemData signalCoinPairItemData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        Integer num;
        Integer num2;
        compositeEncoder.encodeStringElement(serialDescriptor, 0, signalCoinPairItemData.title);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || signalCoinPairItemData.titleUrl != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, signalCoinPairItemData.titleUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || (num2 = signalCoinPairItemData.titleIcon) == null || num2.intValue() != 0) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, IntSerializer.INSTANCE, signalCoinPairItemData.titleIcon);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || (num = signalCoinPairItemData.rightIcon) == null || num.intValue() != 0) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, IntSerializer.INSTANCE, signalCoinPairItemData.rightIcon);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) signalCoinPairItemData.instId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, signalCoinPairItemData.instId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) signalCoinPairItemData.instType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, signalCoinPairItemData.instType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) signalCoinPairItemData.ccy, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, signalCoinPairItemData.ccy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) signalCoinPairItemData.maxLever, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, signalCoinPairItemData.maxLever);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || signalCoinPairItemData.isItemClick) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 8, signalCoinPairItemData.isItemClick);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !signalCoinPairItemData.isRightClick) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 9, signalCoinPairItemData.isRightClick);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !signalCoinPairItemData.isRightIconVisible) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 10, signalCoinPairItemData.isRightIconVisible);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || signalCoinPairItemData.VPadding != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 11, signalCoinPairItemData.VPadding);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || signalCoinPairItemData.singleLine) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 12, signalCoinPairItemData.singleLine);
        }
    }

    public SignalCoinPairItemData(@NotNull String str, String str2, Integer num, Integer num2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, boolean z, boolean z2, boolean z3, int i, boolean z4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        this.title = str;
        this.titleUrl = str2;
        this.titleIcon = num;
        this.rightIcon = num2;
        this.instId = str3;
        this.instType = str4;
        this.ccy = str5;
        this.maxLever = str6;
        this.isItemClick = z;
        this.isRightClick = z2;
        this.isRightIconVisible = z3;
        this.VPadding = i;
        this.singleLine = z4;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0083: CONSTRUCTOR 
  (r14v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r27v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r15v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0009: ARITH (r27v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r16v0 java.lang.Integer))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0015: ARITH (r27v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r17v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0020: ARITH (r27v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002a: ARITH (r27v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0032: ARITH (r27v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003a: ARITH (r27v0 int) & (128 int) A[WRAPPED]) == (0 int)) ? (r21v0 java.lang.String) : (""))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0041: ARITH (r27v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? false : (r22v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0049: ARITH (r27v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? true : (r23v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0052: ARITH (r27v0 int) & (1024 int) A[WRAPPED]) == (0 int)) ? (r24v0 boolean) : true)
  (wrap:int:?: TERNARY null = ((wrap:int:0x0059: ARITH (r27v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r25v0 int))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0061: ARITH (r27v0 int) & (4096 int) A[WRAPPED]) == (0 int)) ? (r26v0 boolean) : false)
 A[MD:(java.lang.String, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, boolean, int, boolean):void (m)] (LINE:768) call: com.okinc.unify_trade.bot.data.SignalCoinPairItemData.<init>(java.lang.String, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, boolean, int, boolean):void type: THIS */
    public /* synthetic */ SignalCoinPairItemData(String str, String str2, Integer num, Integer num2, String str3, String str4, String str5, String str6, boolean z, boolean z2, boolean z3, int i, boolean z4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i2 & 2) != 0 ? null : str2, (i2 & 4) != 0 ? 0 : num, (i2 & 8) != 0 ? 0 : num2, (i2 & 16) != 0 ? "" : str3, (i2 & 32) != 0 ? "" : str4, (i2 & 64) != 0 ? "" : str5, (i2 & 128) == 0 ? str6 : "", (i2 & 256) != 0 ? false : z, (i2 & 512) != 0 ? true : z2, (i2 & 1024) == 0 ? z3 : true, (i2 & 2048) != 0 ? 0 : i, (i2 & 4096) == 0 ? z4 : false);
    }
}
