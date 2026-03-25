package com.okinc.business.defi.biz.walletconnect;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class NativeCurrency {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final Integer decimals;
    private final String name;
    private final String symbol;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ NativeCurrency copy$default(NativeCurrency nativeCurrency, Integer num, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            num = nativeCurrency.decimals;
        }
        if ((i & 2) != 0) {
            str = nativeCurrency.name;
        }
        if ((i & 4) != 0) {
            str2 = nativeCurrency.symbol;
        }
        return nativeCurrency.copy(num, str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component1() {
        return this.decimals;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.symbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final NativeCurrency copy(Integer num, String str, String str2) {
        return new NativeCurrency(num, str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NativeCurrency)) {
            return false;
        }
        NativeCurrency nativeCurrency = (NativeCurrency) obj;
        return Intrinsics.EZpvd(this.decimals, nativeCurrency.decimals) && Intrinsics.EZpvd((Object) this.name, (Object) nativeCurrency.name) && Intrinsics.EZpvd((Object) this.symbol, (Object) nativeCurrency.symbol);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getDecimals() {
        return this.decimals;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getName() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSymbol() {
        return this.symbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Integer num = this.decimals;
        int iHashCode = num == null ? 0 : num.hashCode();
        String str = this.name;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.symbol;
        return (((iHashCode * 31) + iHashCode2) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "NativeCurrency(decimals=" + this.decimals + ", name=" + this.name + ", symbol=" + this.symbol + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.walletconnect.NativeCurrency.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<NativeCurrency> serializer() {
            return NativeCurrency$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ NativeCurrency(int i, Integer num, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i, 7, NativeCurrency$$serializer.INSTANCE.getDescriptor());
        }
        this.decimals = num;
        this.name = str;
        this.symbol = str2;
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(NativeCurrency nativeCurrency, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, IntSerializer.INSTANCE, nativeCurrency.decimals);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, nativeCurrency.name);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, nativeCurrency.symbol);
    }

    public NativeCurrency(Integer num, String str, String str2) {
        this.decimals = num;
        this.name = str;
        this.symbol = str2;
    }
}
