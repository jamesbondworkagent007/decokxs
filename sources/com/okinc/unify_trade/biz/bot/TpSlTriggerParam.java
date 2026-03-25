package com.okinc.unify_trade.biz.bot;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.unify_trade.bot.config.SpotTpSlTypeConfigData;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Serializable
public final class TpSlTriggerParam implements Parcelable, Cloneable {
    private String delaySeconds;
    private final TpSLTriggerItem sl;
    private String stopType;
    private final TpSLTriggerItem tp;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<TpSlTriggerParam> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<TpSlTriggerParam> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TpSlTriggerParam createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            Parcelable.Creator<TpSLTriggerItem> creator = TpSLTriggerItem.CREATOR;
            return new TpSlTriggerParam(string, string2, creator.createFromParcel(parcel), creator.createFromParcel(parcel));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TpSlTriggerParam[] newArray(int i) {
            return new TpSlTriggerParam[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TpSlTriggerParam() {
        this((String) null, (String) null, (TpSLTriggerItem) null, (TpSLTriggerItem) null, 15, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ TpSlTriggerParam copy$default(TpSlTriggerParam tpSlTriggerParam, String str, String str2, TpSLTriggerItem tpSLTriggerItem, TpSLTriggerItem tpSLTriggerItem2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = tpSlTriggerParam.stopType;
        }
        if ((i & 2) != 0) {
            str2 = tpSlTriggerParam.delaySeconds;
        }
        if ((i & 4) != 0) {
            tpSLTriggerItem = tpSlTriggerParam.tp;
        }
        if ((i & 8) != 0) {
            tpSLTriggerItem2 = tpSlTriggerParam.sl;
        }
        return tpSlTriggerParam.copy(str, str2, tpSLTriggerItem, tpSLTriggerItem2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.stopType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.delaySeconds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TpSLTriggerItem component3() {
        return this.tp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TpSLTriggerItem component4() {
        return this.sl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TpSlTriggerParam copy(String str, String str2, @NotNull TpSLTriggerItem tpSLTriggerItem, @NotNull TpSLTriggerItem tpSLTriggerItem2) {
        Intrinsics.checkNotNullParameter(tpSLTriggerItem, "");
        Intrinsics.checkNotNullParameter(tpSLTriggerItem2, "");
        return new TpSlTriggerParam(str, str2, tpSLTriggerItem, tpSLTriggerItem2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDelaySeconds() {
        return this.delaySeconds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TpSLTriggerItem getSl() {
        return this.sl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStopType() {
        return this.stopType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TpSLTriggerItem getTp() {
        return this.tp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.stopType;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.delaySeconds;
        return (((((iHashCode * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + this.tp.hashCode()) * 31) + this.sl.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDelaySeconds(String str) {
        this.delaySeconds = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setStopType(String str) {
        this.stopType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TpSlTriggerParam(stopType=" + this.stopType + ", delaySeconds=" + this.delaySeconds + ", tp=" + this.tp + ", sl=" + this.sl + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.stopType);
        parcel.writeString(this.delaySeconds);
        this.tp.writeToParcel(parcel, i);
        this.sl.writeToParcel(parcel, i);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.bot.TpSlTriggerParam.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TpSlTriggerParam> serializer() {
            return TpSlTriggerParam$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TpSlTriggerParam(int i, String str, String str2, TpSLTriggerItem tpSLTriggerItem, TpSLTriggerItem tpSLTriggerItem2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.stopType = null;
        } else {
            this.stopType = str;
        }
        if ((i & 2) == 0) {
            this.delaySeconds = null;
        } else {
            this.delaySeconds = str2;
        }
        if ((i & 4) == 0) {
            this.tp = new TpSLTriggerItem("tp", SpotTpSlTypeConfigData.PRICE.getType(), (String) null, 4, (DefaultConstructorMarker) null);
        } else {
            this.tp = tpSLTriggerItem;
        }
        if ((i & 8) == 0) {
            this.sl = new TpSLTriggerItem("sl", SpotTpSlTypeConfigData.PRICE.getType(), (String) null, 4, (DefaultConstructorMarker) null);
        } else {
            this.sl = tpSLTriggerItem2;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(TpSlTriggerParam tpSlTriggerParam, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || tpSlTriggerParam.stopType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, tpSlTriggerParam.stopType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || tpSlTriggerParam.delaySeconds != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, tpSlTriggerParam.delaySeconds);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd(tpSlTriggerParam.tp, new TpSLTriggerItem("tp", SpotTpSlTypeConfigData.PRICE.getType(), (String) null, 4, (DefaultConstructorMarker) null))) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 2, TpSLTriggerItem$$serializer.INSTANCE, tpSlTriggerParam.tp);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && Intrinsics.EZpvd(tpSlTriggerParam.sl, new TpSLTriggerItem("sl", SpotTpSlTypeConfigData.PRICE.getType(), (String) null, 4, (DefaultConstructorMarker) null))) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 3, TpSLTriggerItem$$serializer.INSTANCE, tpSlTriggerParam.sl);
    }

    public TpSlTriggerParam(String str, String str2, @NotNull TpSLTriggerItem tpSLTriggerItem, @NotNull TpSLTriggerItem tpSLTriggerItem2) {
        Intrinsics.checkNotNullParameter(tpSLTriggerItem, "");
        Intrinsics.checkNotNullParameter(tpSLTriggerItem2, "");
        this.stopType = str;
        this.delaySeconds = str2;
        this.tp = tpSLTriggerItem;
        this.sl = tpSLTriggerItem2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0035: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r11v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r11v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r8v0 java.lang.String))
  (wrap:com.okinc.unify_trade.biz.bot.TpSLTriggerItem:?: TERNARY null = ((wrap:int:0x000b: ARITH (r11v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.unify_trade.biz.bot.TpSLTriggerItem:0x001d: CONSTRUCTOR 
  ("tp")
  (wrap:java.lang.String:0x0011: INVOKE 
  (wrap:com.okinc.unify_trade.bot.config.SpotTpSlTypeConfigData:0x000f: SGET  A[WRAPPED] (LINE:23) com.okinc.unify_trade.bot.config.SpotTpSlTypeConfigData.PRICE com.okinc.unify_trade.bot.config.SpotTpSlTypeConfigData)
 VIRTUAL call: com.okinc.unify_trade.bot.config.SpotTpSlTypeConfigData.getType():java.lang.String A[MD:():java.lang.String (m), WRAPPED] (LINE:23))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (4 int)
  (wrap:kotlin.jvm.internal.DefaultConstructorMarker:?: CAST (kotlin.jvm.internal.DefaultConstructorMarker) (null kotlin.jvm.internal.DefaultConstructorMarker))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:21) call: com.okinc.unify_trade.biz.bot.TpSLTriggerItem.<init>(java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r9v0 com.okinc.unify_trade.biz.bot.TpSLTriggerItem))
  (wrap:com.okinc.unify_trade.biz.bot.TpSLTriggerItem:?: TERNARY null = ((wrap:int:0x0020: ARITH (r11v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.unify_trade.biz.bot.TpSLTriggerItem:0x0032: CONSTRUCTOR 
  ("sl")
  (wrap:java.lang.String:0x0026: INVOKE 
  (wrap:com.okinc.unify_trade.bot.config.SpotTpSlTypeConfigData:0x0024: SGET  A[WRAPPED] (LINE:27) com.okinc.unify_trade.bot.config.SpotTpSlTypeConfigData.PRICE com.okinc.unify_trade.bot.config.SpotTpSlTypeConfigData)
 VIRTUAL call: com.okinc.unify_trade.bot.config.SpotTpSlTypeConfigData.getType():java.lang.String A[MD:():java.lang.String (m), WRAPPED] (LINE:27))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (4 int)
  (wrap:kotlin.jvm.internal.DefaultConstructorMarker:?: CAST (kotlin.jvm.internal.DefaultConstructorMarker) (null kotlin.jvm.internal.DefaultConstructorMarker))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:25) call: com.okinc.unify_trade.biz.bot.TpSLTriggerItem.<init>(java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r10v0 com.okinc.unify_trade.biz.bot.TpSLTriggerItem))
 A[MD:(java.lang.String, java.lang.String, com.okinc.unify_trade.biz.bot.TpSLTriggerItem, com.okinc.unify_trade.biz.bot.TpSLTriggerItem):void (m)] (LINE:18) call: com.okinc.unify_trade.biz.bot.TpSlTriggerParam.<init>(java.lang.String, java.lang.String, com.okinc.unify_trade.biz.bot.TpSLTriggerItem, com.okinc.unify_trade.biz.bot.TpSLTriggerItem):void type: THIS */
    public /* synthetic */ TpSlTriggerParam(String str, String str2, TpSLTriggerItem tpSLTriggerItem, TpSLTriggerItem tpSLTriggerItem2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? new TpSLTriggerItem("tp", SpotTpSlTypeConfigData.PRICE.getType(), (String) null, 4, (DefaultConstructorMarker) null) : tpSLTriggerItem, (i & 8) != 0 ? new TpSLTriggerItem("sl", SpotTpSlTypeConfigData.PRICE.getType(), (String) null, 4, (DefaultConstructorMarker) null) : tpSLTriggerItem2);
    }

    /* JADX DEBUG: Method merged with bridge method: clone()Ljava/lang/Object; */
    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public TpSlTriggerParam m7132clone() {
        return new TpSlTriggerParam(this.stopType, this.delaySeconds, new TpSLTriggerItem(this.tp.getType(), this.tp.getIndicator(), this.tp.getValue()), new TpSLTriggerItem(this.sl.getType(), this.sl.getIndicator(), this.sl.getValue()));
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof TpSlTriggerParam)) {
            return false;
        }
        TpSlTriggerParam tpSlTriggerParam = (TpSlTriggerParam) obj;
        return Intrinsics.EZpvd((Object) tpSlTriggerParam.stopType, (Object) this.stopType) && Intrinsics.EZpvd((Object) tpSlTriggerParam.delaySeconds, (Object) this.delaySeconds) && Intrinsics.EZpvd((Object) tpSlTriggerParam.tp.getType(), (Object) this.tp.getType()) && Intrinsics.EZpvd((Object) tpSlTriggerParam.tp.getIndicator(), (Object) this.tp.getIndicator()) && Intrinsics.EZpvd((Object) tpSlTriggerParam.tp.getValue(), (Object) this.tp.getValue()) && Intrinsics.EZpvd((Object) tpSlTriggerParam.sl.getType(), (Object) this.sl.getType()) && Intrinsics.EZpvd((Object) tpSlTriggerParam.sl.getIndicator(), (Object) this.sl.getIndicator()) && Intrinsics.EZpvd((Object) tpSlTriggerParam.sl.getValue(), (Object) this.sl.getValue());
    }

    public final TpSlTriggerParam updateWith(TpSlTriggerParam tpSlTriggerParam) {
        String value;
        String value2;
        if (tpSlTriggerParam == null) {
            return this;
        }
        this.stopType = tpSlTriggerParam.stopType;
        this.delaySeconds = tpSlTriggerParam.delaySeconds;
        String value3 = this.tp.getValue();
        if ((value3 == null || StringsKt__StringsKt.fARcdN((CharSequence) value3)) && ((value = tpSlTriggerParam.tp.getValue()) == null || StringsKt__StringsKt.fARcdN((CharSequence) value))) {
            this.tp.setValue(null);
            this.tp.setIndicator("");
        } else {
            this.tp.setValue(tpSlTriggerParam.tp.getValue());
            this.tp.setIndicator(tpSlTriggerParam.tp.getIndicator());
        }
        String value4 = this.sl.getValue();
        if ((value4 == null || StringsKt__StringsKt.fARcdN((CharSequence) value4)) && ((value2 = tpSlTriggerParam.sl.getValue()) == null || StringsKt__StringsKt.fARcdN((CharSequence) value2))) {
            this.sl.setValue(null);
            this.sl.setIndicator("");
        } else {
            this.sl.setValue(tpSlTriggerParam.sl.getValue());
            this.sl.setIndicator(tpSlTriggerParam.sl.getIndicator());
        }
        return this;
    }
}
