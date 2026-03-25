package com.okinc.assets.backend.api.model.addressbook;

import com.okinc.assets.backend.api.model.WithdrawAddress;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
public final class AddressBookPage {
    public static final int $stable = 8;
    private final int addressBookMaxUpdateDeleteInBatch;
    private final List<WithdrawAddress> addresses;
    private final boolean evmCompatible;
    private final boolean googleVerification;
    private final int minId;
    private final boolean monitor;
    private final long numOfAddressLocked;
    private final int page;
    private final boolean phoneVerification;
    private final int size;
    private final List<EvmNetworkInfo> supportedEvm;
    private final int totalRecords;
    private final boolean travelRuleEnabled;
    private final boolean upgraded;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AddressBookPage() {
        this(false, 0L, false, false, false, false, null, 0, 0, 0, 0, 0, null, false, 16383, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component1() {
        return this.travelRuleEnabled;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component10() {
        return this.totalRecords;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component11() {
        return this.minId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component12() {
        return this.addressBookMaxUpdateDeleteInBatch;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<EvmNetworkInfo> component13() {
        return this.supportedEvm;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component14() {
        return this.upgraded;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component2() {
        return this.numOfAddressLocked;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component3() {
        return this.evmCompatible;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component4() {
        return this.monitor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component5() {
        return this.phoneVerification;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component6() {
        return this.googleVerification;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<WithdrawAddress> component7() {
        return this.addresses;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component8() {
        return this.size;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component9() {
        return this.page;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AddressBookPage copy(boolean z, long j, boolean z2, boolean z3, boolean z4, boolean z5, @NotNull List<WithdrawAddress> list, int i, int i2, int i3, int i4, int i5, @NotNull List<EvmNetworkInfo> list2, boolean z6) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        return new AddressBookPage(z, j, z2, z3, z4, z5, list, i, i2, i3, i4, i5, list2, z6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AddressBookPage)) {
            return false;
        }
        AddressBookPage addressBookPage = (AddressBookPage) obj;
        return this.travelRuleEnabled == addressBookPage.travelRuleEnabled && this.numOfAddressLocked == addressBookPage.numOfAddressLocked && this.evmCompatible == addressBookPage.evmCompatible && this.monitor == addressBookPage.monitor && this.phoneVerification == addressBookPage.phoneVerification && this.googleVerification == addressBookPage.googleVerification && Intrinsics.EZpvd(this.addresses, addressBookPage.addresses) && this.size == addressBookPage.size && this.page == addressBookPage.page && this.totalRecords == addressBookPage.totalRecords && this.minId == addressBookPage.minId && this.addressBookMaxUpdateDeleteInBatch == addressBookPage.addressBookMaxUpdateDeleteInBatch && Intrinsics.EZpvd(this.supportedEvm, addressBookPage.supportedEvm) && this.upgraded == addressBookPage.upgraded;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getAddressBookMaxUpdateDeleteInBatch() {
        return this.addressBookMaxUpdateDeleteInBatch;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<WithdrawAddress> getAddresses() {
        return this.addresses;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getEvmCompatible() {
        return this.evmCompatible;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getGoogleVerification() {
        return this.googleVerification;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getMinId() {
        return this.minId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getMonitor() {
        return this.monitor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getNumOfAddressLocked() {
        return this.numOfAddressLocked;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getPage() {
        return this.page;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getPhoneVerification() {
        return this.phoneVerification;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getSize() {
        return this.size;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<EvmNetworkInfo> getSupportedEvm() {
        return this.supportedEvm;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getTotalRecords() {
        return this.totalRecords;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getTravelRuleEnabled() {
        return this.travelRuleEnabled;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getUpgraded() {
        return this.upgraded;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((((((((((Boolean.hashCode(this.travelRuleEnabled) * 31) + Long.hashCode(this.numOfAddressLocked)) * 31) + Boolean.hashCode(this.evmCompatible)) * 31) + Boolean.hashCode(this.monitor)) * 31) + Boolean.hashCode(this.phoneVerification)) * 31) + Boolean.hashCode(this.googleVerification)) * 31) + this.addresses.hashCode()) * 31) + Integer.hashCode(this.size)) * 31) + Integer.hashCode(this.page)) * 31) + Integer.hashCode(this.totalRecords)) * 31) + Integer.hashCode(this.minId)) * 31) + Integer.hashCode(this.addressBookMaxUpdateDeleteInBatch)) * 31) + this.supportedEvm.hashCode()) * 31) + Boolean.hashCode(this.upgraded);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AddressBookPage(travelRuleEnabled=" + this.travelRuleEnabled + ", numOfAddressLocked=" + this.numOfAddressLocked + ", evmCompatible=" + this.evmCompatible + ", monitor=" + this.monitor + ", phoneVerification=" + this.phoneVerification + ", googleVerification=" + this.googleVerification + ", addresses=" + this.addresses + ", size=" + this.size + ", page=" + this.page + ", totalRecords=" + this.totalRecords + ", minId=" + this.minId + ", addressBookMaxUpdateDeleteInBatch=" + this.addressBookMaxUpdateDeleteInBatch + ", supportedEvm=" + this.supportedEvm + ", upgraded=" + this.upgraded + ")";
    }

    public AddressBookPage(boolean z, long j, boolean z2, boolean z3, boolean z4, boolean z5, @NotNull List<WithdrawAddress> list, int i, int i2, int i3, int i4, int i5, @NotNull List<EvmNetworkInfo> list2, boolean z6) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        this.travelRuleEnabled = z;
        this.numOfAddressLocked = j;
        this.evmCompatible = z2;
        this.monitor = z3;
        this.phoneVerification = z4;
        this.googleVerification = z5;
        this.addresses = list;
        this.size = i;
        this.page = i2;
        this.totalRecords = i3;
        this.minId = i4;
        this.addressBookMaxUpdateDeleteInBatch = i5;
        this.supportedEvm = list2;
        this.upgraded = z6;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0098: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0002: ARITH (r32v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? false : (r17v0 boolean))
  (wrap:long:?: TERNARY null = ((wrap:int:0x000b: ARITH (r32v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r18v0 long))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0014: ARITH (r32v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? false : (r20v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x001c: ARITH (r32v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? false : (r21v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0024: ARITH (r32v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? false : (r22v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x002c: ARITH (r32v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? false : (r23v0 boolean))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0034: ARITH (r32v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0038: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:16)) : (r24v0 java.util.List))
  (wrap:int:?: TERNARY null = ((wrap:int:0x003f: ARITH (r32v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r25v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0047: ARITH (r32v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r26v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x004f: ARITH (r32v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r27v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0057: ARITH (r32v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r28v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x005f: ARITH (r32v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (50 int) : (r29v0 int))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0068: ARITH (r32v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x006c: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:22)) : (r30v0 java.util.List))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0073: ARITH (r32v0 int) & (8192 int) A[WRAPPED]) == (0 int)) ? (r31v0 boolean) : false)
 A[MD:(boolean, long, boolean, boolean, boolean, boolean, java.util.List<com.okinc.assets.backend.api.model.WithdrawAddress>, int, int, int, int, int, java.util.List<com.okinc.assets.backend.api.model.addressbook.EvmNetworkInfo>, boolean):void (m)] (LINE:9) call: com.okinc.assets.backend.api.model.addressbook.AddressBookPage.<init>(boolean, long, boolean, boolean, boolean, boolean, java.util.List, int, int, int, int, int, java.util.List, boolean):void type: THIS */
    public /* synthetic */ AddressBookPage(boolean z, long j, boolean z2, boolean z3, boolean z4, boolean z5, List list, int i, int i2, int i3, int i4, int i5, List list2, boolean z6, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this((i6 & 1) != 0 ? false : z, (i6 & 2) != 0 ? 0L : j, (i6 & 4) != 0 ? false : z2, (i6 & 8) != 0 ? false : z3, (i6 & 16) != 0 ? false : z4, (i6 & 32) != 0 ? false : z5, (i6 & 64) != 0 ? yDY.AhwBna() : list, (i6 & 128) != 0 ? 0 : i, (i6 & 256) != 0 ? 0 : i2, (i6 & 512) != 0 ? 0 : i3, (i6 & 1024) != 0 ? 0 : i4, (i6 & 2048) != 0 ? 50 : i5, (i6 & 4096) != 0 ? yDY.AhwBna() : list2, (i6 & 8192) == 0 ? z6 : false);
    }
}
