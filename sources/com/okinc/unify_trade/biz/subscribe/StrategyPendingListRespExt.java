package com.okinc.unify_trade.biz.subscribe;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.unify_trade.biz.bot.TpSlTriggerParamReqResp;
import com.okinc.unify_trade.biz.bot.TpSlTriggerParamReqResp$$serializer;
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
public final class StrategyPendingListRespExt implements Parcelable {
    private final String slTriggerPx;
    private final String tpTriggerPx;
    private final TpSlTriggerParamReqResp tpslTriggerParam;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<StrategyPendingListRespExt> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<StrategyPendingListRespExt> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final StrategyPendingListRespExt createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new StrategyPendingListRespExt(parcel.readInt() == 0 ? null : TpSlTriggerParamReqResp.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final StrategyPendingListRespExt[] newArray(int i) {
            return new StrategyPendingListRespExt[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public StrategyPendingListRespExt() {
        this((TpSlTriggerParamReqResp) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ StrategyPendingListRespExt copy$default(StrategyPendingListRespExt strategyPendingListRespExt, TpSlTriggerParamReqResp tpSlTriggerParamReqResp, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            tpSlTriggerParamReqResp = strategyPendingListRespExt.tpslTriggerParam;
        }
        if ((i & 2) != 0) {
            str = strategyPendingListRespExt.tpTriggerPx;
        }
        if ((i & 4) != 0) {
            str2 = strategyPendingListRespExt.slTriggerPx;
        }
        return strategyPendingListRespExt.copy(tpSlTriggerParamReqResp, str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TpSlTriggerParamReqResp component1() {
        return this.tpslTriggerParam;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.tpTriggerPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.slTriggerPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StrategyPendingListRespExt copy(TpSlTriggerParamReqResp tpSlTriggerParamReqResp, @NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new StrategyPendingListRespExt(tpSlTriggerParamReqResp, str, str2);
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
        if (!(obj instanceof StrategyPendingListRespExt)) {
            return false;
        }
        StrategyPendingListRespExt strategyPendingListRespExt = (StrategyPendingListRespExt) obj;
        return Intrinsics.EZpvd(this.tpslTriggerParam, strategyPendingListRespExt.tpslTriggerParam) && Intrinsics.EZpvd((Object) this.tpTriggerPx, (Object) strategyPendingListRespExt.tpTriggerPx) && Intrinsics.EZpvd((Object) this.slTriggerPx, (Object) strategyPendingListRespExt.slTriggerPx);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSlTriggerPx() {
        return this.slTriggerPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTpTriggerPx() {
        return this.tpTriggerPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TpSlTriggerParamReqResp getTpslTriggerParam() {
        return this.tpslTriggerParam;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        TpSlTriggerParamReqResp tpSlTriggerParamReqResp = this.tpslTriggerParam;
        return ((((tpSlTriggerParamReqResp == null ? 0 : tpSlTriggerParamReqResp.hashCode()) * 31) + this.tpTriggerPx.hashCode()) * 31) + this.slTriggerPx.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "StrategyPendingListRespExt(tpslTriggerParam=" + this.tpslTriggerParam + ", tpTriggerPx=" + this.tpTriggerPx + ", slTriggerPx=" + this.slTriggerPx + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        TpSlTriggerParamReqResp tpSlTriggerParamReqResp = this.tpslTriggerParam;
        if (tpSlTriggerParamReqResp == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            tpSlTriggerParamReqResp.writeToParcel(parcel, i);
        }
        parcel.writeString(this.tpTriggerPx);
        parcel.writeString(this.slTriggerPx);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.subscribe.StrategyPendingListRespExt.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<StrategyPendingListRespExt> serializer() {
            return StrategyPendingListRespExt$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ StrategyPendingListRespExt(int i, TpSlTriggerParamReqResp tpSlTriggerParamReqResp, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        this.tpslTriggerParam = (i & 1) == 0 ? null : tpSlTriggerParamReqResp;
        if ((i & 2) == 0) {
            this.tpTriggerPx = "";
        } else {
            this.tpTriggerPx = str;
        }
        if ((i & 4) == 0) {
            this.slTriggerPx = "";
        } else {
            this.slTriggerPx = str2;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(StrategyPendingListRespExt strategyPendingListRespExt, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || strategyPendingListRespExt.tpslTriggerParam != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, TpSlTriggerParamReqResp$$serializer.INSTANCE, strategyPendingListRespExt.tpslTriggerParam);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) strategyPendingListRespExt.tpTriggerPx, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, strategyPendingListRespExt.tpTriggerPx);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && Intrinsics.EZpvd((Object) strategyPendingListRespExt.slTriggerPx, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 2, strategyPendingListRespExt.slTriggerPx);
    }

    public StrategyPendingListRespExt(TpSlTriggerParamReqResp tpSlTriggerParamReqResp, @NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.tpslTriggerParam = tpSlTriggerParamReqResp;
        this.tpTriggerPx = str;
        this.slTriggerPx = str2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: CONSTRUCTOR 
  (wrap:com.okinc.unify_trade.biz.bot.TpSlTriggerParamReqResp:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.unify_trade.biz.bot.TpSlTriggerParamReqResp) : (r2v0 com.okinc.unify_trade.biz.bot.TpSlTriggerParamReqResp))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0005: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
 A[MD:(com.okinc.unify_trade.biz.bot.TpSlTriggerParamReqResp, java.lang.String, java.lang.String):void (m)] (LINE:1435) call: com.okinc.unify_trade.biz.subscribe.StrategyPendingListRespExt.<init>(com.okinc.unify_trade.biz.bot.TpSlTriggerParamReqResp, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ StrategyPendingListRespExt(TpSlTriggerParamReqResp tpSlTriggerParamReqResp, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : tpSlTriggerParamReqResp, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2);
    }
}
