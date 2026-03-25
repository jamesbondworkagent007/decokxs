package com.okinc.okrisk.service;

import com.google.gson.annotations.SerializedName;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class DeviceProfileRemoteConfig {
    public static final int $stable = 8;
    private final ArrayList<String> bk;
    private final int charLimit;
    private final ArrayList<String> emuList;
    private final int freq;

    @SerializedName("profile_checkpoints")
    private final ArrayList<String> profileCheckPoints;

    @SerializedName("refresh_cycle")
    private final int refreshCycle;
    private final int retryCount;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DeviceProfileRemoteConfig() {
        this(null, null, 0, 0, 0, 0, null, 127, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: com.okinc.okrisk.service.DeviceProfileRemoteConfig */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DeviceProfileRemoteConfig copy$default(DeviceProfileRemoteConfig deviceProfileRemoteConfig, ArrayList arrayList, ArrayList arrayList2, int i, int i2, int i3, int i4, ArrayList arrayList3, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            arrayList = deviceProfileRemoteConfig.bk;
        }
        if ((i5 & 2) != 0) {
            arrayList2 = deviceProfileRemoteConfig.profileCheckPoints;
        }
        ArrayList arrayList4 = arrayList2;
        if ((i5 & 4) != 0) {
            i = deviceProfileRemoteConfig.freq;
        }
        int i6 = i;
        if ((i5 & 8) != 0) {
            i2 = deviceProfileRemoteConfig.charLimit;
        }
        int i7 = i2;
        if ((i5 & 16) != 0) {
            i3 = deviceProfileRemoteConfig.retryCount;
        }
        int i8 = i3;
        if ((i5 & 32) != 0) {
            i4 = deviceProfileRemoteConfig.refreshCycle;
        }
        int i9 = i4;
        if ((i5 & 64) != 0) {
            arrayList3 = deviceProfileRemoteConfig.emuList;
        }
        return deviceProfileRemoteConfig.copy(arrayList, arrayList4, i6, i7, i8, i9, arrayList3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<String> component1() {
        return this.bk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<String> component2() {
        return this.profileCheckPoints;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component3() {
        return this.freq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component4() {
        return this.charLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component5() {
        return this.retryCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component6() {
        return this.refreshCycle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<String> component7() {
        return this.emuList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DeviceProfileRemoteConfig copy(@NotNull ArrayList<String> arrayList, @NotNull ArrayList<String> arrayList2, int i, int i2, int i3, int i4, @NotNull ArrayList<String> arrayList3) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        Intrinsics.checkNotNullParameter(arrayList2, "");
        Intrinsics.checkNotNullParameter(arrayList3, "");
        return new DeviceProfileRemoteConfig(arrayList, arrayList2, i, i2, i3, i4, arrayList3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeviceProfileRemoteConfig)) {
            return false;
        }
        DeviceProfileRemoteConfig deviceProfileRemoteConfig = (DeviceProfileRemoteConfig) obj;
        return Intrinsics.EZpvd(this.bk, deviceProfileRemoteConfig.bk) && Intrinsics.EZpvd(this.profileCheckPoints, deviceProfileRemoteConfig.profileCheckPoints) && this.freq == deviceProfileRemoteConfig.freq && this.charLimit == deviceProfileRemoteConfig.charLimit && this.retryCount == deviceProfileRemoteConfig.retryCount && this.refreshCycle == deviceProfileRemoteConfig.refreshCycle && Intrinsics.EZpvd(this.emuList, deviceProfileRemoteConfig.emuList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<String> getBk() {
        return this.bk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getCharLimit() {
        return this.charLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<String> getEmuList() {
        return this.emuList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getFreq() {
        return this.freq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<String> getProfileCheckPoints() {
        return this.profileCheckPoints;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getRefreshCycle() {
        return this.refreshCycle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getRetryCount() {
        return this.retryCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((this.bk.hashCode() * 31) + this.profileCheckPoints.hashCode()) * 31) + Integer.hashCode(this.freq)) * 31) + Integer.hashCode(this.charLimit)) * 31) + Integer.hashCode(this.retryCount)) * 31) + Integer.hashCode(this.refreshCycle)) * 31) + this.emuList.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "DeviceProfileRemoteConfig(bk=" + this.bk + ", profileCheckPoints=" + this.profileCheckPoints + ", freq=" + this.freq + ", charLimit=" + this.charLimit + ", retryCount=" + this.retryCount + ", refreshCycle=" + this.refreshCycle + ", emuList=" + this.emuList + ")";
    }

    public DeviceProfileRemoteConfig(@NotNull ArrayList<String> arrayList, @NotNull ArrayList<String> arrayList2, int i, int i2, int i3, int i4, @NotNull ArrayList<String> arrayList3) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        Intrinsics.checkNotNullParameter(arrayList2, "");
        Intrinsics.checkNotNullParameter(arrayList3, "");
        this.bk = arrayList;
        this.profileCheckPoints = arrayList2;
        this.freq = i;
        this.charLimit = i2;
        this.retryCount = i3;
        this.refreshCycle = i4;
        this.emuList = arrayList3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0040: CONSTRUCTOR 
  (wrap:java.util.ArrayList:?: TERNARY null = ((wrap:int:0x0000: ARITH (r13v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.ArrayList:0x0006: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:83) call: java.util.ArrayList.<init>():void type: CONSTRUCTOR) : (r6v0 java.util.ArrayList))
  (wrap:java.util.ArrayList:0x0012: TERNARY null = ((wrap:int:0x0009: ARITH (r13v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.ArrayList:0x000f: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:85) call: java.util.ArrayList.<init>():void type: CONSTRUCTOR) : (r7v0 java.util.ArrayList))
  (wrap:int:0x001a: TERNARY null = ((wrap:int:0x0013: ARITH (r13v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:int:0x0017: SGET  A[WRAPPED] com.huawei.hms.push.constant.RemoteMessageConst.DEFAULT_TTL int) : (r8v0 int))
  (wrap:int:0x0020: TERNARY null = ((wrap:int:0x001b: ARITH (r13v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (6 int) : (r9v0 int))
  (wrap:int:0x0026: TERNARY null = ((wrap:int:0x0021: ARITH (r13v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (5 int) : (r10v0 int))
  (wrap:int:0x002d: TERNARY null = ((wrap:int:0x0027: ARITH (r13v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (60 int) : (r11v0 int))
  (wrap:java.util.ArrayList:?: TERNARY null = ((wrap:int:0x002e: ARITH (r13v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.ArrayList:0x0034: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:91) call: java.util.ArrayList.<init>():void type: CONSTRUCTOR) : (r12v0 java.util.ArrayList))
 A[MD:(java.util.ArrayList<java.lang.String>, java.util.ArrayList<java.lang.String>, int, int, int, int, java.util.ArrayList<java.lang.String>):void (m)] (LINE:82) call: com.okinc.okrisk.service.DeviceProfileRemoteConfig.<init>(java.util.ArrayList, java.util.ArrayList, int, int, int, int, java.util.ArrayList):void type: THIS */
    public /* synthetic */ DeviceProfileRemoteConfig(ArrayList arrayList, ArrayList arrayList2, int i, int i2, int i3, int i4, ArrayList arrayList3, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? new ArrayList() : arrayList, (i5 & 2) != 0 ? new ArrayList() : arrayList2, (i5 & 4) != 0 ? RemoteMessageConst.DEFAULT_TTL : i, (i5 & 8) != 0 ? 6 : i2, (i5 & 16) != 0 ? 5 : i3, (i5 & 32) != 0 ? 60 : i4, (i5 & 64) != 0 ? new ArrayList() : arrayList3);
    }
}
