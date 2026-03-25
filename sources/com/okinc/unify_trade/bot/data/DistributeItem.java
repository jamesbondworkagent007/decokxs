package com.okinc.unify_trade.bot.data;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.C33070mpX;
import o.C52761wXj;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Serializable
public final class DistributeItem implements Parcelable {
    private String coinImgUrl;
    private String coinName;
    private int coinNum;
    private String coinPercent;
    private int color;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<DistributeItem> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<DistributeItem> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DistributeItem createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new DistributeItem(parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readInt());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DistributeItem[] newArray(int i) {
            return new DistributeItem[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ DistributeItem copy$default(DistributeItem distributeItem, String str, int i, String str2, String str3, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = distributeItem.coinName;
        }
        if ((i3 & 2) != 0) {
            i = distributeItem.coinNum;
        }
        int i4 = i;
        if ((i3 & 4) != 0) {
            str2 = distributeItem.coinPercent;
        }
        String str4 = str2;
        if ((i3 & 8) != 0) {
            str3 = distributeItem.coinImgUrl;
        }
        String str5 = str3;
        if ((i3 & 16) != 0) {
            i2 = distributeItem.color;
        }
        return distributeItem.copy(str, i4, str4, str5, i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.coinName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component2() {
        return this.coinNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.coinPercent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.coinImgUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component5() {
        return this.color;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DistributeItem copy(@NotNull String str, int i, String str2, String str3, int i2) {
        Intrinsics.checkNotNullParameter(str, "");
        return new DistributeItem(str, i, str2, str3, i2);
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
        if (!(obj instanceof DistributeItem)) {
            return false;
        }
        DistributeItem distributeItem = (DistributeItem) obj;
        return Intrinsics.EZpvd((Object) this.coinName, (Object) distributeItem.coinName) && this.coinNum == distributeItem.coinNum && Intrinsics.EZpvd((Object) this.coinPercent, (Object) distributeItem.coinPercent) && Intrinsics.EZpvd((Object) this.coinImgUrl, (Object) distributeItem.coinImgUrl) && this.color == distributeItem.color;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCoinImgUrl() {
        return this.coinImgUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCoinName() {
        return this.coinName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getCoinNum() {
        return this.coinNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCoinPercent() {
        return this.coinPercent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getColor() {
        return this.color;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.coinName.hashCode();
        int iHashCode2 = Integer.hashCode(this.coinNum);
        String str = this.coinPercent;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        String str2 = this.coinImgUrl;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + Integer.hashCode(this.color);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCoinImgUrl(String str) {
        this.coinImgUrl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCoinName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.coinName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCoinNum(int i) {
        this.coinNum = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCoinPercent(String str) {
        this.coinPercent = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setColor(int i) {
        this.color = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "DistributeItem(coinName=" + this.coinName + ", coinNum=" + this.coinNum + ", coinPercent=" + this.coinPercent + ", coinImgUrl=" + this.coinImgUrl + ", color=" + this.color + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.coinName);
        parcel.writeInt(this.coinNum);
        parcel.writeString(this.coinPercent);
        parcel.writeString(this.coinImgUrl);
        parcel.writeInt(this.color);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.bot.data.DistributeItem.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<DistributeItem> serializer() {
            return DistributeItem$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ DistributeItem(int i, String str, int i2, String str2, String str3, int i3, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, DistributeItem$$serializer.INSTANCE.getDescriptor());
        }
        this.coinName = str;
        this.coinNum = (i & 2) == 0 ? 0 : i2;
        if ((i & 4) == 0) {
            this.coinPercent = "";
        } else {
            this.coinPercent = str2;
        }
        if ((i & 8) == 0) {
            this.coinImgUrl = "";
        } else {
            this.coinImgUrl = str3;
        }
        this.color = (i & 16) == 0 ? C33070mpX.copydefault(((Number) CollectionsKt___CollectionsKt.AEQbTJ(yDY.gEmmrt(Integer.valueOf(C52761wXj.Activity.geAOna), Integer.valueOf(C52761wXj.Activity.HJWChPzRXNTw), Integer.valueOf(C52761wXj.Activity.fzHEvu), Integer.valueOf(C52761wXj.Activity.resume), Integer.valueOf(C52761wXj.Activity.unregister), Integer.valueOf(C52761wXj.Activity.GiPPlLQAswws), Integer.valueOf(C52761wXj.Activity.setLocationManually), Integer.valueOf(C52761wXj.Activity.getSessionID), Integer.valueOf(C52761wXj.Activity.sendBehavioSecData), Integer.valueOf(C52761wXj.Activity.DsL)), Random.Default)).intValue()) : i3;
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(DistributeItem distributeItem, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, distributeItem.coinName);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || distributeItem.coinNum != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 1, distributeItem.coinNum);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) distributeItem.coinPercent, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, distributeItem.coinPercent);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) distributeItem.coinImgUrl, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, distributeItem.coinImgUrl);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) && distributeItem.color == C33070mpX.copydefault(((Number) CollectionsKt___CollectionsKt.AEQbTJ(yDY.gEmmrt(Integer.valueOf(C52761wXj.Activity.geAOna), Integer.valueOf(C52761wXj.Activity.HJWChPzRXNTw), Integer.valueOf(C52761wXj.Activity.fzHEvu), Integer.valueOf(C52761wXj.Activity.resume), Integer.valueOf(C52761wXj.Activity.unregister), Integer.valueOf(C52761wXj.Activity.GiPPlLQAswws), Integer.valueOf(C52761wXj.Activity.setLocationManually), Integer.valueOf(C52761wXj.Activity.getSessionID), Integer.valueOf(C52761wXj.Activity.sendBehavioSecData), Integer.valueOf(C52761wXj.Activity.DsL)), Random.Default)).intValue())) {
            return;
        }
        compositeEncoder.encodeIntElement(serialDescriptor, 4, distributeItem.color);
    }

    public DistributeItem(@NotNull String str, int i, String str2, String str3, int i2) {
        Intrinsics.checkNotNullParameter(str, "");
        this.coinName = str;
        this.coinNum = i;
        this.coinPercent = str2;
        this.coinImgUrl = str3;
        this.color = i2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0080: CONSTRUCTOR 
  (r15v0 java.lang.String)
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r20v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r16v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r20v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0012: ARITH (r20v0 int) & (8 int) A[WRAPPED]) == (0 int)) ? (r18v0 java.lang.String) : (""))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0019: ARITH (r20v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x006d: INVOKE 
  (wrap:int:0x0069: INVOKE 
  (wrap:java.lang.Number:0x0067: CHECK_CAST (java.lang.Number) (wrap:java.lang.Object:0x0063: INVOKE 
  (wrap:java.util.List:0x005d: INVOKE 
  (wrap:java.lang.Integer[]:0x0059: FILLED_NEW_ARRAY 
  (wrap:java.lang.Integer:0x001f: INVOKE (wrap:int:0x001d: SGET  A[WRAPPED] o.wXj.Activity.geAOna int) STATIC call: java.lang.Integer.valueOf(int):java.lang.Integer A[MD:(int):java.lang.Integer (c), WRAPPED] (LINE:649))
  (wrap:java.lang.Integer:0x0025: INVOKE (wrap:int:0x0023: SGET  A[WRAPPED] o.wXj.Activity.HJWChPzRXNTw int) STATIC call: java.lang.Integer.valueOf(int):java.lang.Integer A[MD:(int):java.lang.Integer (c), WRAPPED] (LINE:650))
  (wrap:java.lang.Integer:0x002b: INVOKE (wrap:int:0x0029: SGET  A[WRAPPED] o.wXj.Activity.fzHEvu int) STATIC call: java.lang.Integer.valueOf(int):java.lang.Integer A[MD:(int):java.lang.Integer (c), WRAPPED] (LINE:651))
  (wrap:java.lang.Integer:0x0031: INVOKE (wrap:int:0x002f: SGET  A[WRAPPED] o.wXj.Activity.resume int) STATIC call: java.lang.Integer.valueOf(int):java.lang.Integer A[MD:(int):java.lang.Integer (c), WRAPPED] (LINE:652))
  (wrap:java.lang.Integer:0x0037: INVOKE (wrap:int:0x0035: SGET  A[WRAPPED] o.wXj.Activity.unregister int) STATIC call: java.lang.Integer.valueOf(int):java.lang.Integer A[MD:(int):java.lang.Integer (c), WRAPPED] (LINE:653))
  (wrap:java.lang.Integer:0x003d: INVOKE (wrap:int:0x003b: SGET  A[WRAPPED] o.wXj.Activity.GiPPlLQAswws int) STATIC call: java.lang.Integer.valueOf(int):java.lang.Integer A[MD:(int):java.lang.Integer (c), WRAPPED] (LINE:654))
  (wrap:java.lang.Integer:0x0043: INVOKE (wrap:int:0x0041: SGET  A[WRAPPED] o.wXj.Activity.setLocationManually int) STATIC call: java.lang.Integer.valueOf(int):java.lang.Integer A[MD:(int):java.lang.Integer (c), WRAPPED] (LINE:655))
  (wrap:java.lang.Integer:0x0049: INVOKE (wrap:int:0x0047: SGET  A[WRAPPED] o.wXj.Activity.getSessionID int) STATIC call: java.lang.Integer.valueOf(int):java.lang.Integer A[MD:(int):java.lang.Integer (c), WRAPPED] (LINE:656))
  (wrap:java.lang.Integer:0x004f: INVOKE (wrap:int:0x004d: SGET  A[WRAPPED] o.wXj.Activity.sendBehavioSecData int) STATIC call: java.lang.Integer.valueOf(int):java.lang.Integer A[MD:(int):java.lang.Integer (c), WRAPPED] (LINE:657))
  (wrap:java.lang.Integer:0x0055: INVOKE (wrap:int:0x0053: SGET  A[WRAPPED] o.wXj.Activity.DsL int) STATIC call: java.lang.Integer.valueOf(int):java.lang.Integer A[MD:(int):java.lang.Integer (c), WRAPPED] (LINE:658))
 A[WRAPPED] (LINE:658) elemType: java.lang.Integer)
 STATIC call: o.yDY.gEmmrt(java.lang.Object[]):java.util.List A[MD:<T>:(T[]):java.util.List<T> VARARG (m), VARARG_CALL, WRAPPED] (LINE:648))
  (wrap:kotlin.random.Random$Default:0x0061: SGET  A[WRAPPED] (LINE:659) kotlin.random.Random.Default kotlin.random.Random$Default)
 STATIC call: kotlin.collections.CollectionsKt___CollectionsKt.AEQbTJ(java.util.Collection, kotlin.random.Random):java.lang.Object A[MD:<T>:(java.util.Collection<? extends T>, kotlin.random.Random):T (m), WRAPPED] (LINE:659)))
 VIRTUAL call: java.lang.Number.intValue():int A[MD:():int (c), WRAPPED] (LINE:659))
 STATIC call: o.mpX.copydefault(int):int A[MD:(int):int (m), WRAPPED] (LINE:659)) : (r19v0 int))
 A[MD:(java.lang.String, int, java.lang.String, java.lang.String, int):void (m)] (LINE:643) call: com.okinc.unify_trade.bot.data.DistributeItem.<init>(java.lang.String, int, java.lang.String, java.lang.String, int):void type: THIS */
    public /* synthetic */ DistributeItem(String str, int i, String str2, String str3, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i3 & 2) != 0 ? 0 : i, (i3 & 4) != 0 ? "" : str2, (i3 & 8) == 0 ? str3 : "", (i3 & 16) != 0 ? C33070mpX.copydefault(((Number) CollectionsKt___CollectionsKt.AEQbTJ(yDY.gEmmrt(Integer.valueOf(C52761wXj.Activity.geAOna), Integer.valueOf(C52761wXj.Activity.HJWChPzRXNTw), Integer.valueOf(C52761wXj.Activity.fzHEvu), Integer.valueOf(C52761wXj.Activity.resume), Integer.valueOf(C52761wXj.Activity.unregister), Integer.valueOf(C52761wXj.Activity.GiPPlLQAswws), Integer.valueOf(C52761wXj.Activity.setLocationManually), Integer.valueOf(C52761wXj.Activity.getSessionID), Integer.valueOf(C52761wXj.Activity.sendBehavioSecData), Integer.valueOf(C52761wXj.Activity.DsL)), Random.Default)).intValue()) : i2);
    }
}
