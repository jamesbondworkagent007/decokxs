package com.okinc.business.defi.biz.net.bean;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class SyncMpcEscapeStatusRes {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final Integer resultCode;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SyncMpcEscapeStatusRes() {
        this((Integer) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ SyncMpcEscapeStatusRes copy$default(SyncMpcEscapeStatusRes syncMpcEscapeStatusRes, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            num = syncMpcEscapeStatusRes.resultCode;
        }
        return syncMpcEscapeStatusRes.copy(num);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component1() {
        return this.resultCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SyncMpcEscapeStatusRes copy(Integer num) {
        return new SyncMpcEscapeStatusRes(num);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SyncMpcEscapeStatusRes) && Intrinsics.EZpvd(this.resultCode, ((SyncMpcEscapeStatusRes) obj).resultCode);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getResultCode() {
        return this.resultCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Integer num = this.resultCode;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SyncMpcEscapeStatusRes(resultCode=" + this.resultCode + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.net.bean.SyncMpcEscapeStatusRes.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SyncMpcEscapeStatusRes> serializer() {
            return SyncMpcEscapeStatusRes$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SyncMpcEscapeStatusRes(int i, Integer num, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.resultCode = null;
        } else {
            this.resultCode = num;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(SyncMpcEscapeStatusRes syncMpcEscapeStatusRes, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) && syncMpcEscapeStatusRes.resultCode == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, IntSerializer.INSTANCE, syncMpcEscapeStatusRes.resultCode);
    }

    public SyncMpcEscapeStatusRes(Integer num) {
        this.resultCode = num;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r1v0 java.lang.Integer))
 A[MD:(java.lang.Integer):void (m)] (LINE:1118) call: com.okinc.business.defi.biz.net.bean.SyncMpcEscapeStatusRes.<init>(java.lang.Integer):void type: THIS */
    public /* synthetic */ SyncMpcEscapeStatusRes(Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num);
    }
}
