package com.okinc.network.okg.encrypt;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* JADX INFO: loaded from: classes9.dex */
@Serializable
public final class TimeBeanNew {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    public final Long ts;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TimeBeanNew() {
        this((Long) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ TimeBeanNew copy$default(TimeBeanNew timeBeanNew, Long l, int i, Object obj) {
        if ((i & 1) != 0) {
            l = timeBeanNew.ts;
        }
        return timeBeanNew.OLrzqt(l);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TimeBeanNew OLrzqt(Long l) {
        return new TimeBeanNew(l);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long copydefault() {
        return this.ts;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TimeBeanNew) && Intrinsics.EZpvd(this.ts, ((TimeBeanNew) obj).ts);
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
        return "TimeBeanNew(ts=" + this.ts + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.network.okg.encrypt.TimeBeanNew.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TimeBeanNew> serializer() {
            return TimeBeanNew$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TimeBeanNew(int i, Long l, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.ts = null;
        } else {
            this.ts = l;
        }
    }

    public static final /* synthetic */ void EZpvd(TimeBeanNew timeBeanNew, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) && timeBeanNew.ts == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, LongSerializer.INSTANCE, timeBeanNew.ts);
    }

    public TimeBeanNew(Long l) {
        this.ts = l;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r1v0 java.lang.Long))
 A[MD:(java.lang.Long):void (m)] (LINE:12) call: com.okinc.network.okg.encrypt.TimeBeanNew.<init>(java.lang.Long):void type: THIS */
    public /* synthetic */ TimeBeanNew(Long l, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : l);
    }
}
