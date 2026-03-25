package com.okinc.base.bugreport;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.C33490mxT;
import o.pUU;

/* JADX INFO: loaded from: classes3.dex */
public class DetectionInfoBean implements Serializable {
    public long debugInfo;
    public boolean isApplicationHooked = false;
    public boolean isDeviceRooted = false;
    public boolean isRunningInEmulator = false;
    public boolean isDebuggerAttached = false;
    public boolean isRunningInVirtualEnvironment = false;
    public boolean isAppTampered = false;
    public boolean isFileTampered = false;
    public boolean isCertificateTampered = false;
    public boolean isMemoryScanning = false;
    public boolean isOsIntegrity = false;

    @Deprecated
    public boolean isTampered = false;

    @Deprecated
    public boolean isAppDebuggable = false;

    @Deprecated
    public boolean isSignedWithDebugKeys = false;

    @Deprecated
    public boolean isClockTampered = false;

    @Deprecated
    public boolean isMemoryTampered = false;

    @Deprecated
    public boolean debugBlockerFailed = false;

    @Deprecated
    public boolean debugBlockerAttacked = false;

    @Deprecated
    public boolean isSelinuxIntegrity = false;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r0v32 */
    /* JADX WARN: Type inference failed for: r0v33 */
    /* JADX WARN: Type inference failed for: r0v34 */
    /* JADX WARN: Type inference failed for: r0v35 */
    /* JADX WARN: Type inference failed for: r0v36 */
    /* JADX WARN: Type inference failed for: r0v37 */
    /* JADX WARN: Type inference failed for: r0v38 */
    /* JADX WARN: Type inference failed for: r0v39 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v40 */
    /* JADX WARN: Type inference failed for: r0v41 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8, types: [int] */
    public int getFlag() {
        boolean z = this.isApplicationHooked;
        ?? r0 = z;
        if (this.isDeviceRooted) {
            r0 = (z ? 1 : 0) | 2;
        }
        ?? r02 = r0;
        if (this.isRunningInEmulator) {
            r02 = (r0 == true ? 1 : 0) | 4;
        }
        ?? r03 = r02;
        if (this.isDebuggerAttached) {
            r03 = (r02 == true ? 1 : 0) | 8;
        }
        ?? r04 = r03;
        if (this.isRunningInVirtualEnvironment) {
            r04 = (r03 == true ? 1 : 0) | 16;
        }
        ?? r05 = r04;
        if (this.isAppTampered) {
            r05 = (r04 == true ? 1 : 0) | 32;
        }
        ?? r06 = r05;
        if (this.isFileTampered) {
            r06 = (r05 == true ? 1 : 0) | 64;
        }
        ?? r07 = r06;
        if (this.isCertificateTampered) {
            r07 = (r06 == true ? 1 : 0) | 128;
        }
        ?? r08 = r07;
        if (this.isMemoryScanning) {
            r08 = (r07 == true ? 1 : 0) | 256;
        }
        return this.isOsIntegrity ? r08 | 512 : r08;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void initByFlag(int i) {
        if ((i & 1) != 0) {
            this.isApplicationHooked = true;
        } else {
            this.isApplicationHooked = false;
        }
        if ((i & 2) != 0) {
            this.isDeviceRooted = true;
        } else {
            this.isDeviceRooted = false;
        }
        if ((i & 4) != 0) {
            this.isRunningInEmulator = true;
        } else {
            this.isRunningInEmulator = false;
        }
        if ((i & 8) != 0) {
            this.isDebuggerAttached = true;
        } else {
            this.isDebuggerAttached = false;
        }
        if ((i & 16) != 0) {
            this.isRunningInVirtualEnvironment = true;
        } else {
            this.isRunningInVirtualEnvironment = false;
        }
        if ((i & 32) != 0) {
            this.isAppTampered = true;
        } else {
            this.isAppTampered = false;
        }
        if ((i & 64) != 0) {
            this.isFileTampered = true;
        } else {
            this.isFileTampered = false;
        }
        if ((i & 128) != 0) {
            this.isCertificateTampered = true;
        } else {
            this.isCertificateTampered = false;
        }
        if ((i & 256) != 0) {
            this.isMemoryScanning = true;
        } else {
            this.isMemoryScanning = false;
        }
        if ((i & 512) != 0) {
            this.isOsIntegrity = true;
        } else {
            this.isOsIntegrity = false;
        }
    }

    public String toJsonString() {
        return C33490mxT.OLrzqt(this);
    }

    public Map<String, String> toMap() {
        HashMap map = new HashMap();
        for (Field field : getClass().getDeclaredFields()) {
            try {
                if (!field.isAnnotationPresent(Deprecated.class)) {
                    boolean zIsAccessible = field.isAccessible();
                    field.setAccessible(true);
                    field.getAnnotations();
                    Object obj = field.get(this);
                    if (obj != null) {
                        map.put(field.getName(), obj.toString());
                        pUU.OLrzqt("field:" + field.getName());
                    } else {
                        map.put(field.getName(), "");
                    }
                    field.setAccessible(zIsAccessible);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return map;
    }

    public String toString() {
        return "DetectionInfoBean{isApplicationHooked=" + this.isApplicationHooked + ", isDeviceRooted=" + this.isDeviceRooted + ", isRunningInEmulator=" + this.isRunningInEmulator + ", isDebuggerAttached=" + this.isDebuggerAttached + ", isRunningInVirtualEnvironment=" + this.isRunningInVirtualEnvironment + ", isAppTampered=" + this.isAppTampered + ", isFileTampered=" + this.isFileTampered + ", isCertificateTampered=" + this.isCertificateTampered + ", isMemoryScanning=" + this.isMemoryScanning + ", isOsIntegrity=" + this.isOsIntegrity + AbstractJsonLexerKt.END_OBJ;
    }
}
