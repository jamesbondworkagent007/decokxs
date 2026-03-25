package com.okinc.business.defi.biz.database.addressbook.entity;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class AddressBookEntity {
    public static final int $stable = 8;
    private String address;
    private List<String> chainNames;
    private List<String> chainUrls;
    private long createTime;
    private boolean isLineShow;
    private String name;
    private int smartContract;
    private long updateTime;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AddressBookEntity() {
        this(null, null, null, null, 0L, 0L, 0, false, 255, null);
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
    public final List<String> component3() {
        return this.chainNames;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component4() {
        return this.chainUrls;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component5() {
        return this.createTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component6() {
        return this.updateTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component7() {
        return this.smartContract;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component8() {
        return this.isLineShow;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AddressBookEntity copy(@NotNull String str, @NotNull String str2, @NotNull List<String> list, @NotNull List<String> list2, long j, long j2, int i, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        return new AddressBookEntity(str, str2, list, list2, j, j2, i, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AddressBookEntity)) {
            return false;
        }
        AddressBookEntity addressBookEntity = (AddressBookEntity) obj;
        return Intrinsics.EZpvd((Object) this.name, (Object) addressBookEntity.name) && Intrinsics.EZpvd((Object) this.address, (Object) addressBookEntity.address) && Intrinsics.EZpvd(this.chainNames, addressBookEntity.chainNames) && Intrinsics.EZpvd(this.chainUrls, addressBookEntity.chainUrls) && this.createTime == addressBookEntity.createTime && this.updateTime == addressBookEntity.updateTime && this.smartContract == addressBookEntity.smartContract && this.isLineShow == addressBookEntity.isLineShow;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAddress() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getChainNames() {
        return this.chainNames;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getChainUrls() {
        return this.chainUrls;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getCreateTime() {
        return this.createTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getName() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getSmartContract() {
        return this.smartContract;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getUpdateTime() {
        return this.updateTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((this.name.hashCode() * 31) + this.address.hashCode()) * 31) + this.chainNames.hashCode()) * 31) + this.chainUrls.hashCode()) * 31) + Long.hashCode(this.createTime)) * 31) + Long.hashCode(this.updateTime)) * 31) + Integer.hashCode(this.smartContract)) * 31) + Boolean.hashCode(this.isLineShow);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isLineShow() {
        return this.isLineShow;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isSmartContract() {
        return this.smartContract == 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAddress(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.address = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setChainNames(@NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.chainNames = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setChainUrls(@NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.chainUrls = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCreateTime(long j) {
        this.createTime = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLineShow(boolean z) {
        this.isLineShow = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.name = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSmartContract() {
        this.smartContract = 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSmartContract(int i) {
        this.smartContract = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUpdateTime(long j) {
        this.updateTime = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AddressBookEntity(name=" + this.name + ", address=" + this.address + ", chainNames=" + this.chainNames + ", chainUrls=" + this.chainUrls + ", createTime=" + this.createTime + ", updateTime=" + this.updateTime + ", smartContract=" + this.smartContract + ", isLineShow=" + this.isLineShow + ")";
    }

    public AddressBookEntity(@NotNull String str, @NotNull String str2, @NotNull List<String> list, @NotNull List<String> list2, long j, long j2, int i, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        this.name = str;
        this.address = str2;
        this.chainNames = list;
        this.chainUrls = list2;
        this.createTime = j;
        this.updateTime = j2;
        this.smartContract = i;
        this.isLineShow = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0052: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r21v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r11v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r21v0 int) & (2 int) A[WRAPPED]) == (0 int)) ? (r12v0 java.lang.String) : (""))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0011: ARITH (r21v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0015: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:15)) : (r13v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x001b: ARITH (r21v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x001f: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:16)) : (r14v0 java.util.List))
  (wrap:long:?: TERNARY null = ((wrap:int:0x0025: ARITH (r21v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r15v0 long))
  (wrap:long:?: TERNARY null = ((wrap:int:0x002e: ARITH (r21v0 int) & (32 int) A[WRAPPED]) == (0 int)) ? (r17v0 long) : (0 long))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0035: ARITH (r21v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r19v0 int))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x003d: ARITH (r21v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? true : (r20v0 boolean))
 A[MD:(java.lang.String, java.lang.String, java.util.List<java.lang.String>, java.util.List<java.lang.String>, long, long, int, boolean):void (m)] (LINE:12) call: com.okinc.business.defi.biz.database.addressbook.entity.AddressBookEntity.<init>(java.lang.String, java.lang.String, java.util.List, java.util.List, long, long, int, boolean):void type: THIS */
    public /* synthetic */ AddressBookEntity(String str, String str2, List list, List list2, long j, long j2, int i, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) == 0 ? str2 : "", (i2 & 4) != 0 ? yDY.AhwBna() : list, (i2 & 8) != 0 ? yDY.AhwBna() : list2, (i2 & 16) != 0 ? 0L : j, (i2 & 32) == 0 ? j2 : 0L, (i2 & 64) != 0 ? 0 : i, (i2 & 128) != 0 ? true : z);
    }
}
