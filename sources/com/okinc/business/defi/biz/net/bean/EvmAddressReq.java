package com.okinc.business.defi.biz.net.bean;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
@Serializable
public final class EvmAddressReq {
    public String address;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public EvmAddressReq() {
        this((String) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ EvmAddressReq copy$default(EvmAddressReq evmAddressReq, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = evmAddressReq.address;
        }
        return evmAddressReq.AEQbTJ(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EvmAddressReq AEQbTJ(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new EvmAddressReq(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof EvmAddressReq) && Intrinsics.EZpvd((Object) this.address, (Object) ((EvmAddressReq) obj).address);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.address.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "EvmAddressReq(address=" + this.address + ")";
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.net.bean.EvmAddressReq.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<EvmAddressReq> serializer() {
            return EvmAddressReq$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ EvmAddressReq(int i, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.address = "";
        } else {
            this.address = str;
        }
    }

    public static final /* synthetic */ void copydefault(EvmAddressReq evmAddressReq, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) && Intrinsics.EZpvd((Object) evmAddressReq.address, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 0, evmAddressReq.address);
    }

    public EvmAddressReq(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.address = str;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r1v0 java.lang.String))
 A[MD:(java.lang.String):void (m)] (LINE:796) call: com.okinc.business.defi.biz.net.bean.EvmAddressReq.<init>(java.lang.String):void type: THIS */
    public /* synthetic */ EvmAddressReq(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str);
    }
}
