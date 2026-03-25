package com.okinc.business.defi.biz.core.segwit.bean;

import com.okinc.wallet.api.bean.AddressType;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import o.C33070mpX;
import o.C33129mqd;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class AddressData {
    public static final int $stable = 8;
    private String address;
    private int addressType;
    private boolean isChecked;
    private boolean isSupported;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AddressData() {
        this(0, false, false, null, 15, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ AddressData copy$default(AddressData addressData, int i, boolean z, boolean z2, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = addressData.addressType;
        }
        if ((i2 & 2) != 0) {
            z = addressData.isChecked;
        }
        if ((i2 & 4) != 0) {
            z2 = addressData.isSupported;
        }
        if ((i2 & 8) != 0) {
            str = addressData.address;
        }
        return addressData.copy(i, z, z2, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component1() {
        return this.addressType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component2() {
        return this.isChecked;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component3() {
        return this.isSupported;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AddressData copy(int i, boolean z, boolean z2, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new AddressData(i, z, z2, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AddressData)) {
            return false;
        }
        AddressData addressData = (AddressData) obj;
        return this.addressType == addressData.addressType && this.isChecked == addressData.isChecked && this.isSupported == addressData.isSupported && Intrinsics.EZpvd((Object) this.address, (Object) addressData.address);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAddress() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getAddressType() {
        return this.addressType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((Integer.hashCode(this.addressType) * 31) + Boolean.hashCode(this.isChecked)) * 31) + Boolean.hashCode(this.isSupported)) * 31) + this.address.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isChecked() {
        return this.isChecked;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isSupported() {
        return this.isSupported;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAddress(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.address = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAddressType(int i) {
        this.addressType = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setChecked(boolean z) {
        this.isChecked = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSupported(boolean z) {
        this.isSupported = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AddressData(addressType=" + this.addressType + ", isChecked=" + this.isChecked + ", isSupported=" + this.isSupported + ", address=" + this.address + ")";
    }

    public AddressData(int i, boolean z, boolean z2, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.addressType = i;
        this.isChecked = z;
        this.isSupported = z2;
        this.address = str;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001b: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:int:0x0006: INVOKE 
  (wrap:com.okinc.wallet.api.bean.AddressType:0x0004: SGET  A[WRAPPED] (LINE:11) com.okinc.wallet.api.bean.AddressType.Legacy com.okinc.wallet.api.bean.AddressType)
 VIRTUAL call: com.okinc.wallet.api.bean.AddressType.getValue():int A[MD:():int (m), WRAPPED] (LINE:11)) : (r2v0 int))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x000a: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? false : (r3v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0010: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? false : (r4v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0015: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r5v0 java.lang.String))
 A[MD:(int, boolean, boolean, java.lang.String):void (m)] (LINE:10) call: com.okinc.business.defi.biz.core.segwit.bean.AddressData.<init>(int, boolean, boolean, java.lang.String):void type: THIS */
    public /* synthetic */ AddressData(int i, boolean z, boolean z2, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? AddressType.Legacy.getValue() : i, (i2 & 2) != 0 ? false : z, (i2 & 4) != 0 ? false : z2, (i2 & 8) != 0 ? "" : str);
    }

    public final String getAddressFormat() {
        int i = this.addressType;
        if (i == AddressType.Legacy.getValue()) {
            return C33070mpX.AYXKKw(C13754dXa.FragmentManager.reset);
        }
        if (i == AddressType.P2SHType.getValue() || i == AddressType.P2SHCommonType.getValue()) {
            return C33070mpX.AYXKKw(C13754dXa.FragmentManager.DQzvGNdrmXxu);
        }
        if (i == AddressType.BCHPubKeyAddr.getValue() || i == AddressType.Bech32Type.getValue()) {
            return C33070mpX.AYXKKw(C13754dXa.FragmentManager.zLAIeZ);
        }
        return i == AddressType.P2TRType.getValue() ? C33070mpX.AYXKKw(C13754dXa.FragmentManager.onEvent) : "";
    }

    public final String getTipsContent() {
        int i = this.addressType;
        if (i != AddressType.Legacy.getValue()) {
            if (i == AddressType.P2SHType.getValue() || i == AddressType.P2SHCommonType.getValue()) {
                return C33070mpX.AYXKKw(C13754dXa.FragmentManager.ActivityResultContractSynchronousResult);
            }
            if (i == AddressType.BCHPubKeyAddr.getValue() || i == AddressType.Bech32Type.getValue()) {
                return C33070mpX.AYXKKw(C13754dXa.FragmentManager.getSynchronousResult);
            }
            if (i == AddressType.P2TRType.getValue()) {
                return C33070mpX.AYXKKw(this.isSupported ? C13754dXa.FragmentManager.getSynchronousResult : C13754dXa.FragmentManager.RatingCompat1);
            }
        }
        return "";
    }

    public final String getAddressTips() {
        return C33129mqd.OLrzqt((CharSequence) this.address) ? this.address : getTipsContent();
    }
}
