package com.okinc.okassetslite.api.assets_lite_api.transactionhistory.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class TimeStampBean {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    public final Long ts;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TimeStampBean() {
        this((Long) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ TimeStampBean copy$default(TimeStampBean timeStampBean, Long l, int i, Object obj) {
        if ((i & 1) != 0) {
            l = timeStampBean.ts;
        }
        return timeStampBean.AEQbTJ(l);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TimeStampBean AEQbTJ(Long l) {
        return new TimeStampBean(l);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TimeStampBean) && Intrinsics.EZpvd(this.ts, ((TimeStampBean) obj).ts);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Long l = this.ts;
        if (l == null) {
            return 0;
        }
        return l.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TimeStampBean(ts=" + this.ts + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okassetslite.api.assets_lite_api.transactionhistory.model.TimeStampBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TimeStampBean> serializer() {
            return TimeStampBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TimeStampBean(int i, Long l, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.ts = null;
        } else {
            this.ts = l;
        }
    }

    public static final /* synthetic */ void AEQbTJ(TimeStampBean timeStampBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) && timeStampBean.ts == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, LongSerializer.INSTANCE, timeStampBean.ts);
    }

    public TimeStampBean(Long l) {
        this.ts = l;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r1v0 java.lang.Long))
 A[MD:(java.lang.Long):void (m)] (LINE:6) call: com.okinc.okassetslite.api.assets_lite_api.transactionhistory.model.TimeStampBean.<init>(java.lang.Long):void type: THIS */
    public /* synthetic */ TimeStampBean(Long l, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : l);
    }
}
