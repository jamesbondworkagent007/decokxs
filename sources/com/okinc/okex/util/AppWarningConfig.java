package com.okinc.okex.util;

import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class AppWarningConfig {
    public static final int $stable = 8;
    private ArrayList<String> deviceList;
    private int showAlert;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AppWarningConfig() {
        this(0, null, 3, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.okex.util.AppWarningConfig */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AppWarningConfig copy$default(AppWarningConfig appWarningConfig, int i, ArrayList arrayList, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = appWarningConfig.showAlert;
        }
        if ((i2 & 2) != 0) {
            arrayList = appWarningConfig.deviceList;
        }
        return appWarningConfig.copy(i, arrayList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component1() {
        return this.showAlert;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<String> component2() {
        return this.deviceList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AppWarningConfig copy(int i, @NotNull ArrayList<String> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        return new AppWarningConfig(i, arrayList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppWarningConfig)) {
            return false;
        }
        AppWarningConfig appWarningConfig = (AppWarningConfig) obj;
        return this.showAlert == appWarningConfig.showAlert && Intrinsics.EZpvd(this.deviceList, appWarningConfig.deviceList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<String> getDeviceList() {
        return this.deviceList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getShowAlert() {
        return this.showAlert;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (Integer.hashCode(this.showAlert) * 31) + this.deviceList.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDeviceList(@NotNull ArrayList<String> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        this.deviceList = arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setShowAlert(int i) {
        this.showAlert = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AppWarningConfig(showAlert=" + this.showAlert + ", deviceList=" + this.deviceList + ")";
    }

    public AppWarningConfig(int i, @NotNull ArrayList<String> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        this.showAlert = i;
        this.deviceList = arrayList;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000e: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r1v0 int))
  (wrap:java.util.ArrayList:?: TERNARY null = ((wrap:int:0x0005: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.ArrayList:0x000b: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:408) call: java.util.ArrayList.<init>():void type: CONSTRUCTOR) : (r2v0 java.util.ArrayList))
 A[MD:(int, java.util.ArrayList<java.lang.String>):void (m)] (LINE:408) call: com.okinc.okex.util.AppWarningConfig.<init>(int, java.util.ArrayList):void type: THIS */
    public /* synthetic */ AppWarningConfig(int i, ArrayList arrayList, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? new ArrayList() : arrayList);
    }
}
