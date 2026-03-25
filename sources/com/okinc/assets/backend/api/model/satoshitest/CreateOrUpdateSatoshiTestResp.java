package com.okinc.assets.backend.api.model.satoshitest;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
public final class CreateOrUpdateSatoshiTestResp {
    public static final int $stable = 8;
    private final List<NetworkSupportedCurrency> currencies;
    private final String network;
    private final String verifyingAddress;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CreateOrUpdateSatoshiTestResp() {
        this(null, null, null, 7, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.assets.backend.api.model.satoshitest.CreateOrUpdateSatoshiTestResp */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CreateOrUpdateSatoshiTestResp copy$default(CreateOrUpdateSatoshiTestResp createOrUpdateSatoshiTestResp, String str, String str2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = createOrUpdateSatoshiTestResp.verifyingAddress;
        }
        if ((i & 2) != 0) {
            str2 = createOrUpdateSatoshiTestResp.network;
        }
        if ((i & 4) != 0) {
            list = createOrUpdateSatoshiTestResp.currencies;
        }
        return createOrUpdateSatoshiTestResp.copy(str, str2, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.verifyingAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.network;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<NetworkSupportedCurrency> component3() {
        return this.currencies;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CreateOrUpdateSatoshiTestResp copy(String str, String str2, @NotNull List<NetworkSupportedCurrency> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return new CreateOrUpdateSatoshiTestResp(str, str2, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CreateOrUpdateSatoshiTestResp)) {
            return false;
        }
        CreateOrUpdateSatoshiTestResp createOrUpdateSatoshiTestResp = (CreateOrUpdateSatoshiTestResp) obj;
        return Intrinsics.EZpvd((Object) this.verifyingAddress, (Object) createOrUpdateSatoshiTestResp.verifyingAddress) && Intrinsics.EZpvd((Object) this.network, (Object) createOrUpdateSatoshiTestResp.network) && Intrinsics.EZpvd(this.currencies, createOrUpdateSatoshiTestResp.currencies);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<NetworkSupportedCurrency> getCurrencies() {
        return this.currencies;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNetwork() {
        return this.network;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getVerifyingAddress() {
        return this.verifyingAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.verifyingAddress;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.network;
        return (((iHashCode * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + this.currencies.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CreateOrUpdateSatoshiTestResp(verifyingAddress=" + this.verifyingAddress + ", network=" + this.network + ", currencies=" + this.currencies + ")";
    }

    public CreateOrUpdateSatoshiTestResp(String str, String str2, @NotNull List<NetworkSupportedCurrency> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.verifyingAddress = str;
        this.network = str2;
        this.currencies = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0013: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x000f: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:9)) : (r4v0 java.util.List))
 A[MD:(java.lang.String, java.lang.String, java.util.List<com.okinc.assets.backend.api.model.satoshitest.NetworkSupportedCurrency>):void (m)] (LINE:6) call: com.okinc.assets.backend.api.model.satoshitest.CreateOrUpdateSatoshiTestResp.<init>(java.lang.String, java.lang.String, java.util.List):void type: THIS */
    public /* synthetic */ CreateOrUpdateSatoshiTestResp(String str, String str2, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? yDY.AhwBna() : list);
    }
}
