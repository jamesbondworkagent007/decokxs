package com.okinc.unify_trade.biz;

import android.os.Parcel;
import android.os.Parcelable;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.PolymorphicSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.C56524yIo;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Serializable
public final class BotTradeData implements Parcelable {
    private final String botType;
    private final String instFamily;
    private final String instId;
    private final String instType;
    private final boolean isDeepLink;
    private final boolean isOneClickCopy;
    private final String recommendId;
    private final Parcelable req;
    private final List<FundingRateArbCoin> reqList;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<BotTradeData> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, new PolymorphicSerializer(C56524yIo.AEQbTJ(Parcelable.class), new Annotation[0]), null, null, null, null, new ArrayListSerializer(FundingRateArbCoin$$serializer.INSTANCE)};

    public static final class Creator implements Parcelable.Creator<BotTradeData> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BotTradeData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            Parcelable parcelable = parcel.readParcelable(BotTradeData.class.getClassLoader());
            boolean z = parcel.readInt() != 0;
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            boolean z2 = parcel.readInt() != 0;
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(FundingRateArbCoin.CREATOR.createFromParcel(parcel));
            }
            return new BotTradeData(string, string2, string3, parcelable, z, string4, string5, z2, arrayList);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BotTradeData[] newArray(int i) {
            return new BotTradeData[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.botType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.instType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Parcelable component4() {
        return this.req;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component5() {
        return this.isOneClickCopy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.recommendId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.instFamily;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component8() {
        return this.isDeepLink;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<FundingRateArbCoin> component9() {
        return this.reqList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BotTradeData copy(@NotNull String str, @NotNull String str2, @NotNull String str3, Parcelable parcelable, boolean z, String str4, String str5, boolean z2, @NotNull List<FundingRateArbCoin> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new BotTradeData(str, str2, str3, parcelable, z, str4, str5, z2, list);
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
        if (!(obj instanceof BotTradeData)) {
            return false;
        }
        BotTradeData botTradeData = (BotTradeData) obj;
        return Intrinsics.EZpvd((Object) this.botType, (Object) botTradeData.botType) && Intrinsics.EZpvd((Object) this.instId, (Object) botTradeData.instId) && Intrinsics.EZpvd((Object) this.instType, (Object) botTradeData.instType) && Intrinsics.EZpvd(this.req, botTradeData.req) && this.isOneClickCopy == botTradeData.isOneClickCopy && Intrinsics.EZpvd((Object) this.recommendId, (Object) botTradeData.recommendId) && Intrinsics.EZpvd((Object) this.instFamily, (Object) botTradeData.instFamily) && this.isDeepLink == botTradeData.isDeepLink && Intrinsics.EZpvd(this.reqList, botTradeData.reqList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBotType() {
        return this.botType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInstFamily() {
        return this.instFamily;
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
    public final String getRecommendId() {
        return this.recommendId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Parcelable getReq() {
        return this.req;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<FundingRateArbCoin> getReqList() {
        return this.reqList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.botType.hashCode();
        int iHashCode2 = this.instId.hashCode();
        int iHashCode3 = this.instType.hashCode();
        Parcelable parcelable = this.req;
        int iHashCode4 = parcelable == null ? 0 : parcelable.hashCode();
        int iHashCode5 = Boolean.hashCode(this.isOneClickCopy);
        String str = this.recommendId;
        int iHashCode6 = str == null ? 0 : str.hashCode();
        String str2 = this.instFamily;
        return (((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + Boolean.hashCode(this.isDeepLink)) * 31) + this.reqList.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isDeepLink() {
        return this.isDeepLink;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isOneClickCopy() {
        return this.isOneClickCopy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "BotTradeData(botType=" + this.botType + ", instId=" + this.instId + ", instType=" + this.instType + ", req=" + this.req + ", isOneClickCopy=" + this.isOneClickCopy + ", recommendId=" + this.recommendId + ", instFamily=" + this.instFamily + ", isDeepLink=" + this.isDeepLink + ", reqList=" + this.reqList + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.botType);
        parcel.writeString(this.instId);
        parcel.writeString(this.instType);
        parcel.writeParcelable(this.req, i);
        parcel.writeInt(this.isOneClickCopy ? 1 : 0);
        parcel.writeString(this.recommendId);
        parcel.writeString(this.instFamily);
        parcel.writeInt(this.isDeepLink ? 1 : 0);
        List<FundingRateArbCoin> list = this.reqList;
        parcel.writeInt(list.size());
        Iterator<FundingRateArbCoin> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.BotTradeData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<BotTradeData> serializer() {
            return BotTradeData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ BotTradeData(int i, String str, String str2, String str3, Parcelable parcelable, boolean z, String str4, String str5, boolean z2, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i, 7, BotTradeData$$serializer.INSTANCE.getDescriptor());
        }
        this.botType = str;
        this.instId = str2;
        this.instType = str3;
        if ((i & 8) == 0) {
            this.req = null;
        } else {
            this.req = parcelable;
        }
        if ((i & 16) == 0) {
            this.isOneClickCopy = false;
        } else {
            this.isOneClickCopy = z;
        }
        if ((i & 32) == 0) {
            this.recommendId = null;
        } else {
            this.recommendId = str4;
        }
        if ((i & 64) == 0) {
            this.instFamily = null;
        } else {
            this.instFamily = str5;
        }
        if ((i & 128) == 0) {
            this.isDeepLink = false;
        } else {
            this.isDeepLink = z2;
        }
        if ((i & 256) == 0) {
            this.reqList = yDY.AhwBna();
        } else {
            this.reqList = list;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(BotTradeData botTradeData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeStringElement(serialDescriptor, 0, botTradeData.botType);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, botTradeData.instId);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, botTradeData.instType);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || botTradeData.req != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, kSerializerArr[3], botTradeData.req);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || botTradeData.isOneClickCopy) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 4, botTradeData.isOneClickCopy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || botTradeData.recommendId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, botTradeData.recommendId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || botTradeData.instFamily != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, botTradeData.instFamily);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || botTradeData.isDeepLink) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 7, botTradeData.isDeepLink);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) && Intrinsics.EZpvd(botTradeData.reqList, yDY.AhwBna())) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 8, kSerializerArr[8], botTradeData.reqList);
    }

    public BotTradeData(@NotNull String str, @NotNull String str2, @NotNull String str3, Parcelable parcelable, boolean z, String str4, String str5, boolean z2, @NotNull List<FundingRateArbCoin> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.botType = str;
        this.instId = str2;
        this.instType = str3;
        this.req = parcelable;
        this.isOneClickCopy = z;
        this.recommendId = str4;
        this.instFamily = str5;
        this.isDeepLink = z2;
        this.reqList = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x003d: CONSTRUCTOR 
  (r14v0 java.lang.String)
  (r15v0 java.lang.String)
  (r16v0 java.lang.String)
  (wrap:android.os.Parcelable:?: TERNARY null = ((wrap:int:0x0002: ARITH (r23v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null android.os.Parcelable) : (r17v0 android.os.Parcelable))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x000b: ARITH (r23v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? false : (r18v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r23v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r23v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r20v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0024: ARITH (r23v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? false : (r21v0 boolean))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x002c: ARITH (r23v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0034: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:48)) : (r22v0 java.util.List))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, android.os.Parcelable, boolean, java.lang.String, java.lang.String, boolean, java.util.List<com.okinc.unify_trade.biz.FundingRateArbCoin>):void (m)] (LINE:39) call: com.okinc.unify_trade.biz.BotTradeData.<init>(java.lang.String, java.lang.String, java.lang.String, android.os.Parcelable, boolean, java.lang.String, java.lang.String, boolean, java.util.List):void type: THIS */
    public /* synthetic */ BotTradeData(String str, String str2, String str3, Parcelable parcelable, boolean z, String str4, String str5, boolean z2, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i & 8) != 0 ? null : parcelable, (i & 16) != 0 ? false : z, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : str5, (i & 128) != 0 ? false : z2, (i & 256) != 0 ? yDY.AhwBna() : list);
    }
}
