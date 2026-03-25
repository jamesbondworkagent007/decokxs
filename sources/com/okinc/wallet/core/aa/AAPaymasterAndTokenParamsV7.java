package com.okinc.wallet.core.aa;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Serializable
public final class AAPaymasterAndTokenParamsV7 {
    private List<AAPaymasterAndToken> params;
    private int sigTime;
    private int sigType;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, null, new ArrayListSerializer(AAPaymasterAndToken$$serializer.INSTANCE)};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AAPaymasterAndTokenParamsV7() {
        this(0, 0, (List) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.wallet.core.aa.AAPaymasterAndTokenParamsV7 */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AAPaymasterAndTokenParamsV7 copy$default(AAPaymasterAndTokenParamsV7 aAPaymasterAndTokenParamsV7, int i, int i2, List list, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = aAPaymasterAndTokenParamsV7.sigTime;
        }
        if ((i3 & 2) != 0) {
            i2 = aAPaymasterAndTokenParamsV7.sigType;
        }
        if ((i3 & 4) != 0) {
            list = aAPaymasterAndTokenParamsV7.params;
        }
        return aAPaymasterAndTokenParamsV7.copy(i, i2, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component1() {
        return this.sigTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component2() {
        return this.sigType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<AAPaymasterAndToken> component3() {
        return this.params;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AAPaymasterAndTokenParamsV7 copy(int i, int i2, @NotNull List<AAPaymasterAndToken> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return new AAPaymasterAndTokenParamsV7(i, i2, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AAPaymasterAndTokenParamsV7)) {
            return false;
        }
        AAPaymasterAndTokenParamsV7 aAPaymasterAndTokenParamsV7 = (AAPaymasterAndTokenParamsV7) obj;
        return this.sigTime == aAPaymasterAndTokenParamsV7.sigTime && this.sigType == aAPaymasterAndTokenParamsV7.sigType && Intrinsics.EZpvd(this.params, aAPaymasterAndTokenParamsV7.params);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<AAPaymasterAndToken> getParams() {
        return this.params;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getSigTime() {
        return this.sigTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getSigType() {
        return this.sigType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((Integer.hashCode(this.sigTime) * 31) + Integer.hashCode(this.sigType)) * 31) + this.params.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setParams(@NotNull List<AAPaymasterAndToken> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.params = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSigTime(int i) {
        this.sigTime = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSigType(int i) {
        this.sigType = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AAPaymasterAndTokenParamsV7(sigTime=" + this.sigTime + ", sigType=" + this.sigType + ", params=" + this.params + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.wallet.core.aa.AAPaymasterAndTokenParamsV7.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<AAPaymasterAndTokenParamsV7> serializer() {
            return AAPaymasterAndTokenParamsV7$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ AAPaymasterAndTokenParamsV7(int i, int i2, int i3, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.sigTime = 0;
        } else {
            this.sigTime = i2;
        }
        if ((i & 2) == 0) {
            this.sigType = 0;
        } else {
            this.sigType = i3;
        }
        if ((i & 4) == 0) {
            this.params = yDY.AhwBna();
        } else {
            this.params = list;
        }
    }

    public static final /* synthetic */ void write$Self$OKWalletCore_wallet_lib(AAPaymasterAndTokenParamsV7 aAPaymasterAndTokenParamsV7, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || aAPaymasterAndTokenParamsV7.sigTime != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 0, aAPaymasterAndTokenParamsV7.sigTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || aAPaymasterAndTokenParamsV7.sigType != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 1, aAPaymasterAndTokenParamsV7.sigType);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && Intrinsics.EZpvd(aAPaymasterAndTokenParamsV7.params, yDY.AhwBna())) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], aAPaymasterAndTokenParamsV7.params);
    }

    public AAPaymasterAndTokenParamsV7(int i, int i2, @NotNull List<AAPaymasterAndToken> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.sigTime = i;
        this.sigType = i2;
        this.params = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0013: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r2v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x000f: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:26)) : (r4v0 java.util.List))
 A[MD:(int, int, java.util.List<com.okinc.wallet.core.aa.AAPaymasterAndToken>):void (m)] (LINE:23) call: com.okinc.wallet.core.aa.AAPaymasterAndTokenParamsV7.<init>(int, int, java.util.List):void type: THIS */
    public /* synthetic */ AAPaymasterAndTokenParamsV7(int i, int i2, List list, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2, (i3 & 4) != 0 ? yDY.AhwBna() : list);
    }
}
