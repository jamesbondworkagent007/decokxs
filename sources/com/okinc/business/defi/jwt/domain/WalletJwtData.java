package com.okinc.business.defi.jwt.domain;

import com.okinc.business.defi.jwt.AddressLoginResponse;
import com.okinc.business.defi.jwt.AddressLoginResponse$$serializer;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.C56424yEw;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class WalletJwtData {
    public final Map<String, AddressLoginResponse> items;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final KSerializer<Object>[] $childSerializers = {new LinkedHashMapSerializer(StringSerializer.INSTANCE, AddressLoginResponse$$serializer.INSTANCE)};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public WalletJwtData() {
        this((Map) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.defi.jwt.domain.WalletJwtData */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WalletJwtData copy$default(WalletJwtData walletJwtData, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            map = walletJwtData.items;
        }
        return walletJwtData.OLrzqt(map);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Map<String, AddressLoginResponse> EZpvd() {
        return this.items;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WalletJwtData OLrzqt(@NotNull Map<String, AddressLoginResponse> map) {
        Intrinsics.checkNotNullParameter(map, "");
        return new WalletJwtData(map);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof WalletJwtData) && Intrinsics.EZpvd(this.items, ((WalletJwtData) obj).items);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.items.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "WalletJwtData(items=" + this.items + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.jwt.domain.WalletJwtData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<WalletJwtData> serializer() {
            return WalletJwtData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ WalletJwtData(int i, Map map, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.items = C56424yEw.KWHzl();
        } else {
            this.items = map;
        }
    }

    public static final /* synthetic */ void AEQbTJ(WalletJwtData walletJwtData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) && Intrinsics.EZpvd(walletJwtData.items, C56424yEw.KWHzl())) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], walletJwtData.items);
    }

    public WalletJwtData(@NotNull Map<String, AddressLoginResponse> map) {
        Intrinsics.checkNotNullParameter(map, "");
        this.items = map;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0008: CONSTRUCTOR 
  (wrap:java.util.Map:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.Map:0x0004: INVOKE  STATIC call: o.yEw.KWHzl():java.util.Map A[MD:<K, V>:():java.util.Map<K, V> (m), WRAPPED] (LINE:62)) : (r1v0 java.util.Map))
 A[MD:(java.util.Map<java.lang.String, com.okinc.business.defi.jwt.AddressLoginResponse>):void (m)] (LINE:60) call: com.okinc.business.defi.jwt.domain.WalletJwtData.<init>(java.util.Map):void type: THIS */
    public /* synthetic */ WalletJwtData(Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C56424yEw.KWHzl() : map);
    }
}
