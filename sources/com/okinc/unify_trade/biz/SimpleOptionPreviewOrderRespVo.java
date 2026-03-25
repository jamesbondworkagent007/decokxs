package com.okinc.unify_trade.biz;

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

/* JADX INFO: loaded from: classes24.dex */
@Serializable
public final class SimpleOptionPreviewOrderRespVo implements Parcelable {
    private SimpleOptionPreviewOrderResponse previewOrderResp;
    private final String source;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<SimpleOptionPreviewOrderRespVo> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<SimpleOptionPreviewOrderRespVo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SimpleOptionPreviewOrderRespVo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new SimpleOptionPreviewOrderRespVo(parcel.readString(), parcel.readInt() == 0 ? null : SimpleOptionPreviewOrderResponse.CREATOR.createFromParcel(parcel));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SimpleOptionPreviewOrderRespVo[] newArray(int i) {
            return new SimpleOptionPreviewOrderRespVo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SimpleOptionPreviewOrderRespVo() {
        this((String) null, (SimpleOptionPreviewOrderResponse) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ SimpleOptionPreviewOrderRespVo copy$default(SimpleOptionPreviewOrderRespVo simpleOptionPreviewOrderRespVo, String str, SimpleOptionPreviewOrderResponse simpleOptionPreviewOrderResponse, int i, Object obj) {
        if ((i & 1) != 0) {
            str = simpleOptionPreviewOrderRespVo.source;
        }
        if ((i & 2) != 0) {
            simpleOptionPreviewOrderResponse = simpleOptionPreviewOrderRespVo.previewOrderResp;
        }
        return simpleOptionPreviewOrderRespVo.copy(str, simpleOptionPreviewOrderResponse);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.source;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SimpleOptionPreviewOrderResponse component2() {
        return this.previewOrderResp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SimpleOptionPreviewOrderRespVo copy(@NotNull String str, SimpleOptionPreviewOrderResponse simpleOptionPreviewOrderResponse) {
        Intrinsics.checkNotNullParameter(str, "");
        return new SimpleOptionPreviewOrderRespVo(str, simpleOptionPreviewOrderResponse);
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
        if (!(obj instanceof SimpleOptionPreviewOrderRespVo)) {
            return false;
        }
        SimpleOptionPreviewOrderRespVo simpleOptionPreviewOrderRespVo = (SimpleOptionPreviewOrderRespVo) obj;
        return Intrinsics.EZpvd((Object) this.source, (Object) simpleOptionPreviewOrderRespVo.source) && Intrinsics.EZpvd(this.previewOrderResp, simpleOptionPreviewOrderRespVo.previewOrderResp);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SimpleOptionPreviewOrderResponse getPreviewOrderResp() {
        return this.previewOrderResp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSource() {
        return this.source;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.source.hashCode();
        SimpleOptionPreviewOrderResponse simpleOptionPreviewOrderResponse = this.previewOrderResp;
        return (iHashCode * 31) + (simpleOptionPreviewOrderResponse == null ? 0 : simpleOptionPreviewOrderResponse.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPreviewOrderResp(SimpleOptionPreviewOrderResponse simpleOptionPreviewOrderResponse) {
        this.previewOrderResp = simpleOptionPreviewOrderResponse;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SimpleOptionPreviewOrderRespVo(source=" + this.source + ", previewOrderResp=" + this.previewOrderResp + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.source);
        SimpleOptionPreviewOrderResponse simpleOptionPreviewOrderResponse = this.previewOrderResp;
        if (simpleOptionPreviewOrderResponse == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            simpleOptionPreviewOrderResponse.writeToParcel(parcel, i);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.SimpleOptionPreviewOrderRespVo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SimpleOptionPreviewOrderRespVo> serializer() {
            return SimpleOptionPreviewOrderRespVo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SimpleOptionPreviewOrderRespVo(int i, String str, SimpleOptionPreviewOrderResponse simpleOptionPreviewOrderResponse, SerializationConstructorMarker serializationConstructorMarker) {
        this.source = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.previewOrderResp = null;
        } else {
            this.previewOrderResp = simpleOptionPreviewOrderResponse;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(SimpleOptionPreviewOrderRespVo simpleOptionPreviewOrderRespVo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) simpleOptionPreviewOrderRespVo.source, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, simpleOptionPreviewOrderRespVo.source);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && simpleOptionPreviewOrderRespVo.previewOrderResp == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, SimpleOptionPreviewOrderResponse$$serializer.INSTANCE, simpleOptionPreviewOrderRespVo.previewOrderResp);
    }

    public SimpleOptionPreviewOrderRespVo(@NotNull String str, SimpleOptionPreviewOrderResponse simpleOptionPreviewOrderResponse) {
        Intrinsics.checkNotNullParameter(str, "");
        this.source = str;
        this.previewOrderResp = simpleOptionPreviewOrderResponse;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r1v0 java.lang.String))
  (wrap:com.okinc.unify_trade.biz.SimpleOptionPreviewOrderResponse:?: TERNARY null = ((wrap:int:0x0006: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.unify_trade.biz.SimpleOptionPreviewOrderResponse) : (r2v0 com.okinc.unify_trade.biz.SimpleOptionPreviewOrderResponse))
 A[MD:(java.lang.String, com.okinc.unify_trade.biz.SimpleOptionPreviewOrderResponse):void (m)] (LINE:5437) call: com.okinc.unify_trade.biz.SimpleOptionPreviewOrderRespVo.<init>(java.lang.String, com.okinc.unify_trade.biz.SimpleOptionPreviewOrderResponse):void type: THIS */
    public /* synthetic */ SimpleOptionPreviewOrderRespVo(String str, SimpleOptionPreviewOrderResponse simpleOptionPreviewOrderResponse, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : simpleOptionPreviewOrderResponse);
    }
}
