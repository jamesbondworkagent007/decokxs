package com.okinc.business.market.data.model.smart_money;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class AddressInfo {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    public final String avatarUrl;
    public final boolean isKOL;
    public final String name;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AddressInfo() {
        this((String) null, false, (String) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ AddressInfo copy$default(AddressInfo addressInfo, String str, boolean z, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = addressInfo.avatarUrl;
        }
        if ((i & 2) != 0) {
            z = addressInfo.isKOL;
        }
        if ((i & 4) != 0) {
            str2 = addressInfo.name;
        }
        return addressInfo.EZpvd(str, z, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AEQbTJ() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AddressInfo EZpvd(@NotNull String str, boolean z, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new AddressInfo(str, z, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean EZpvd() {
        return this.isKOL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String KWHzl() {
        return this.avatarUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AddressInfo)) {
            return false;
        }
        AddressInfo addressInfo = (AddressInfo) obj;
        return Intrinsics.EZpvd((Object) this.avatarUrl, (Object) addressInfo.avatarUrl) && this.isKOL == addressInfo.isKOL && Intrinsics.EZpvd((Object) this.name, (Object) addressInfo.name);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.avatarUrl.hashCode() * 31) + Boolean.hashCode(this.isKOL)) * 31) + this.name.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AddressInfo(avatarUrl=" + this.avatarUrl + ", isKOL=" + this.isKOL + ", name=" + this.name + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.data.model.smart_money.AddressInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<AddressInfo> serializer() {
            return AddressInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ AddressInfo(int i, String str, boolean z, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.avatarUrl = "";
        } else {
            this.avatarUrl = str;
        }
        if ((i & 2) == 0) {
            this.isKOL = false;
        } else {
            this.isKOL = z;
        }
        if ((i & 4) == 0) {
            this.name = "";
        } else {
            this.name = str2;
        }
    }

    public static final /* synthetic */ void copydefault(AddressInfo addressInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) addressInfo.avatarUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, addressInfo.avatarUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || addressInfo.isKOL) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 1, addressInfo.isKOL);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && Intrinsics.EZpvd((Object) addressInfo.name, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 2, addressInfo.name);
    }

    public AddressInfo(@NotNull String str, boolean z, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.avatarUrl = str;
        this.isKOL = z;
        this.name = str2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0007: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? false : (r3v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
 A[MD:(java.lang.String, boolean, java.lang.String):void (m)] (LINE:7) call: com.okinc.business.market.data.model.smart_money.AddressInfo.<init>(java.lang.String, boolean, java.lang.String):void type: THIS */
    public /* synthetic */ AddressInfo(String str, boolean z, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? false : z, (i & 4) != 0 ? "" : str2);
    }
}
