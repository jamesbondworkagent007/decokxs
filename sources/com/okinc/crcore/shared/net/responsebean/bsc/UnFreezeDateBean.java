package com.okinc.crcore.shared.net.responsebean.bsc;

import com.okinc.crcore.coreapi.net.responsebean.bsc.UnFreezeDateResponseBean;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Serializable
public final class UnFreezeDateBean {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final Long fiatDepositCryptoHold;
    private final Long fiatDepositFiatHold;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public UnFreezeDateBean() {
        this((Long) null, (Long) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ UnFreezeDateBean copy$default(UnFreezeDateBean unFreezeDateBean, Long l, Long l2, int i, Object obj) {
        if ((i & 1) != 0) {
            l = unFreezeDateBean.fiatDepositCryptoHold;
        }
        if ((i & 2) != 0) {
            l2 = unFreezeDateBean.fiatDepositFiatHold;
        }
        return unFreezeDateBean.copy(l, l2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component1() {
        return this.fiatDepositCryptoHold;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component2() {
        return this.fiatDepositFiatHold;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UnFreezeDateBean copy(Long l, Long l2) {
        return new UnFreezeDateBean(l, l2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UnFreezeDateBean)) {
            return false;
        }
        UnFreezeDateBean unFreezeDateBean = (UnFreezeDateBean) obj;
        return Intrinsics.EZpvd(this.fiatDepositCryptoHold, unFreezeDateBean.fiatDepositCryptoHold) && Intrinsics.EZpvd(this.fiatDepositFiatHold, unFreezeDateBean.fiatDepositFiatHold);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getFiatDepositCryptoHold() {
        return this.fiatDepositCryptoHold;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getFiatDepositFiatHold() {
        return this.fiatDepositFiatHold;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Long l = this.fiatDepositCryptoHold;
        int iHashCode = l == null ? 0 : l.hashCode();
        Long l2 = this.fiatDepositFiatHold;
        return (iHashCode * 31) + (l2 != null ? l2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "UnFreezeDateBean(fiatDepositCryptoHold=" + this.fiatDepositCryptoHold + ", fiatDepositFiatHold=" + this.fiatDepositFiatHold + ")";
    }

    public /* synthetic */ UnFreezeDateBean(int i, Long l, Long l2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.fiatDepositCryptoHold = null;
        } else {
            this.fiatDepositCryptoHold = l;
        }
        if ((i & 2) == 0) {
            this.fiatDepositFiatHold = null;
        } else {
            this.fiatDepositFiatHold = l2;
        }
    }

    public static final /* synthetic */ void write$Self$OKCRCore_cr_core(UnFreezeDateBean unFreezeDateBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || unFreezeDateBean.fiatDepositCryptoHold != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, LongSerializer.INSTANCE, unFreezeDateBean.fiatDepositCryptoHold);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && unFreezeDateBean.fiatDepositFiatHold == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, LongSerializer.INSTANCE, unFreezeDateBean.fiatDepositFiatHold);
    }

    public UnFreezeDateBean(Long l, Long l2) {
        this.fiatDepositCryptoHold = l;
        this.fiatDepositFiatHold = l2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r2v0 java.lang.Long))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r3v0 java.lang.Long))
 A[MD:(java.lang.Long, java.lang.Long):void (m)] (LINE:343) call: com.okinc.crcore.shared.net.responsebean.bsc.UnFreezeDateBean.<init>(java.lang.Long, java.lang.Long):void type: THIS */
    public /* synthetic */ UnFreezeDateBean(Long l, Long l2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : l, (i & 2) != 0 ? null : l2);
    }

    /* JADX INFO: loaded from: classes23.dex */
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.crcore.shared.net.responsebean.bsc.UnFreezeDateBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<UnFreezeDateBean> serializer() {
            return UnFreezeDateBean$$serializer.INSTANCE;
        }

        public final UnFreezeDateBean AEQbTJ(@NotNull UnFreezeDateResponseBean unFreezeDateResponseBean) {
            Intrinsics.checkNotNullParameter(unFreezeDateResponseBean, "");
            return new UnFreezeDateBean(unFreezeDateResponseBean.getFiatDepositCryptoHold(), unFreezeDateResponseBean.getFiatDepositFiatHold());
        }
    }
}
