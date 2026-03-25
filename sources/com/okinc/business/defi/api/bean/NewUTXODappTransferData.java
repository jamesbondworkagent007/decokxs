package com.okinc.business.defi.api.bean;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class NewUTXODappTransferData {
    public static final int $stable = 8;
    private String fromAddress;
    private NewUTXODappOptions options;
    private String satoshis;
    private String toAddress;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public NewUTXODappTransferData() {
        this(null, null, null, null, 15, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ NewUTXODappTransferData copy$default(NewUTXODappTransferData newUTXODappTransferData, String str, String str2, String str3, NewUTXODappOptions newUTXODappOptions, int i, Object obj) {
        if ((i & 1) != 0) {
            str = newUTXODappTransferData.fromAddress;
        }
        if ((i & 2) != 0) {
            str2 = newUTXODappTransferData.toAddress;
        }
        if ((i & 4) != 0) {
            str3 = newUTXODappTransferData.satoshis;
        }
        if ((i & 8) != 0) {
            newUTXODappOptions = newUTXODappTransferData.options;
        }
        return newUTXODappTransferData.copy(str, str2, str3, newUTXODappOptions);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.fromAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.toAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.satoshis;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final NewUTXODappOptions component4() {
        return this.options;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final NewUTXODappTransferData copy(String str, String str2, String str3, NewUTXODappOptions newUTXODappOptions) {
        return new NewUTXODappTransferData(str, str2, str3, newUTXODappOptions);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NewUTXODappTransferData)) {
            return false;
        }
        NewUTXODappTransferData newUTXODappTransferData = (NewUTXODappTransferData) obj;
        return Intrinsics.EZpvd((Object) this.fromAddress, (Object) newUTXODappTransferData.fromAddress) && Intrinsics.EZpvd((Object) this.toAddress, (Object) newUTXODappTransferData.toAddress) && Intrinsics.EZpvd((Object) this.satoshis, (Object) newUTXODappTransferData.satoshis) && Intrinsics.EZpvd(this.options, newUTXODappTransferData.options);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFromAddress() {
        return this.fromAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final NewUTXODappOptions getOptions() {
        return this.options;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSatoshis() {
        return this.satoshis;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getToAddress() {
        return this.toAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.fromAddress;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.toAddress;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.satoshis;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        NewUTXODappOptions newUTXODappOptions = this.options;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (newUTXODappOptions != null ? newUTXODappOptions.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFromAddress(String str) {
        this.fromAddress = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOptions(NewUTXODappOptions newUTXODappOptions) {
        this.options = newUTXODappOptions;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSatoshis(String str) {
        this.satoshis = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setToAddress(String str) {
        this.toAddress = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "NewUTXODappTransferData(fromAddress=" + this.fromAddress + ", toAddress=" + this.toAddress + ", satoshis=" + this.satoshis + ", options=" + this.options + ")";
    }

    public NewUTXODappTransferData(String str, String str2, String str3, NewUTXODappOptions newUTXODappOptions) {
        this.fromAddress = str;
        this.toAddress = str2;
        this.satoshis = str3;
        this.options = newUTXODappOptions;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r4v0 java.lang.String))
  (wrap:com.okinc.business.defi.api.bean.NewUTXODappOptions:?: TERNARY null = ((wrap:int:0x0010: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.defi.api.bean.NewUTXODappOptions) : (r5v0 com.okinc.business.defi.api.bean.NewUTXODappOptions))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, com.okinc.business.defi.api.bean.NewUTXODappOptions):void (m)] (LINE:466) call: com.okinc.business.defi.api.bean.NewUTXODappTransferData.<init>(java.lang.String, java.lang.String, java.lang.String, com.okinc.business.defi.api.bean.NewUTXODappOptions):void type: THIS */
    public /* synthetic */ NewUTXODappTransferData(String str, String str2, String str3, NewUTXODappOptions newUTXODappOptions, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : newUTXODappOptions);
    }
}
