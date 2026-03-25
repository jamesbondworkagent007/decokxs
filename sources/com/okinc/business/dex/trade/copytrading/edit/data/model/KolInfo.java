package com.okinc.business.dex.trade.copytrading.edit.data.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Serializable
public final class KolInfo {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String address;
    private final String logo;
    private final String name;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public KolInfo() {
        this((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ KolInfo copy$default(KolInfo kolInfo, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = kolInfo.name;
        }
        if ((i & 2) != 0) {
            str2 = kolInfo.address;
        }
        if ((i & 4) != 0) {
            str3 = kolInfo.logo;
        }
        return kolInfo.copy(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.logo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final KolInfo copy(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new KolInfo(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KolInfo)) {
            return false;
        }
        KolInfo kolInfo = (KolInfo) obj;
        return Intrinsics.EZpvd((Object) this.name, (Object) kolInfo.name) && Intrinsics.EZpvd((Object) this.address, (Object) kolInfo.address) && Intrinsics.EZpvd((Object) this.logo, (Object) kolInfo.logo);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAddress() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLogo() {
        return this.logo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getName() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.name.hashCode() * 31) + this.address.hashCode()) * 31) + this.logo.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "KolInfo(name=" + this.name + ", address=" + this.address + ", logo=" + this.logo + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dex.trade.copytrading.edit.data.model.KolInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<KolInfo> serializer() {
            return KolInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ KolInfo(int i, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.name = "";
        } else {
            this.name = str;
        }
        if ((i & 2) == 0) {
            this.address = "";
        } else {
            this.address = str2;
        }
        if ((i & 4) == 0) {
            this.logo = "";
        } else {
            this.logo = str3;
        }
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(KolInfo kolInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) kolInfo.name, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, kolInfo.name);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) kolInfo.address, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, kolInfo.address);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && Intrinsics.EZpvd((Object) kolInfo.logo, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 2, kolInfo.logo);
    }

    public KolInfo(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.name = str;
        this.address = str2;
        this.logo = str3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:146) call: com.okinc.business.dex.trade.copytrading.edit.data.model.KolInfo.<init>(java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ KolInfo(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3);
    }
}
