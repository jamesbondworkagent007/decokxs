package com.okinc.unify_trade.biz;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes17.dex */
@Serializable
public final class CloseBatchPositionResponse {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String ccy;
    private final String clOrdId;
    private final String instId;
    private final String mgnMode;
    private final String posSide;
    private final String sCode;
    private final String sMsg;
    private final String tag;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.posSide;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.ccy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.mgnMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.clOrdId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.tag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.sCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.sMsg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CloseBatchPositionResponse copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        return new CloseBatchPositionResponse(str, str2, str3, str4, str5, str6, str7, str8);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CloseBatchPositionResponse)) {
            return false;
        }
        CloseBatchPositionResponse closeBatchPositionResponse = (CloseBatchPositionResponse) obj;
        return Intrinsics.EZpvd((Object) this.instId, (Object) closeBatchPositionResponse.instId) && Intrinsics.EZpvd((Object) this.posSide, (Object) closeBatchPositionResponse.posSide) && Intrinsics.EZpvd((Object) this.ccy, (Object) closeBatchPositionResponse.ccy) && Intrinsics.EZpvd((Object) this.mgnMode, (Object) closeBatchPositionResponse.mgnMode) && Intrinsics.EZpvd((Object) this.clOrdId, (Object) closeBatchPositionResponse.clOrdId) && Intrinsics.EZpvd((Object) this.tag, (Object) closeBatchPositionResponse.tag) && Intrinsics.EZpvd((Object) this.sCode, (Object) closeBatchPositionResponse.sCode) && Intrinsics.EZpvd((Object) this.sMsg, (Object) closeBatchPositionResponse.sMsg);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCcy() {
        return this.ccy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getClOrdId() {
        return this.clOrdId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInstId() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMgnMode() {
        return this.mgnMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPosSide() {
        return this.posSide;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSCode() {
        return this.sCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSMsg() {
        return this.sMsg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTag() {
        return this.tag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.instId;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.posSide;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.ccy;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.mgnMode;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.clOrdId;
        int iHashCode5 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.tag;
        int iHashCode6 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.sCode;
        int iHashCode7 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.sMsg;
        return (((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + (str8 != null ? str8.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CloseBatchPositionResponse(instId=" + this.instId + ", posSide=" + this.posSide + ", ccy=" + this.ccy + ", mgnMode=" + this.mgnMode + ", clOrdId=" + this.clOrdId + ", tag=" + this.tag + ", sCode=" + this.sCode + ", sMsg=" + this.sMsg + ")";
    }

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.CloseBatchPositionResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CloseBatchPositionResponse> serializer() {
            return CloseBatchPositionResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ CloseBatchPositionResponse(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, SerializationConstructorMarker serializationConstructorMarker) {
        if (255 != (i & 255)) {
            PluginExceptionsKt.throwMissingFieldException(i, 255, CloseBatchPositionResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.instId = str;
        this.posSide = str2;
        this.ccy = str3;
        this.mgnMode = str4;
        this.clOrdId = str5;
        this.tag = str6;
        this.sCode = str7;
        this.sMsg = str8;
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(CloseBatchPositionResponse closeBatchPositionResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, closeBatchPositionResponse.instId);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, closeBatchPositionResponse.posSide);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, closeBatchPositionResponse.ccy);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, closeBatchPositionResponse.mgnMode);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, stringSerializer, closeBatchPositionResponse.clOrdId);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, stringSerializer, closeBatchPositionResponse.tag);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, stringSerializer, closeBatchPositionResponse.sCode);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, stringSerializer, closeBatchPositionResponse.sMsg);
    }

    public CloseBatchPositionResponse(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        this.instId = str;
        this.posSide = str2;
        this.ccy = str3;
        this.mgnMode = str4;
        this.clOrdId = str5;
        this.tag = str6;
        this.sCode = str7;
        this.sMsg = str8;
    }
}
