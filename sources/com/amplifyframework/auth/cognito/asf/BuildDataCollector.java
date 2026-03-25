package com.amplifyframework.auth.cognito.asf;

import android.content.Context;
import android.os.Build;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C56390yDp;
import o.C56424yEw;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class BuildDataCollector implements DataCollector {
    public static final String BOOTLOADER = "Bootloader";
    public static final String BRAND = "DeviceBrand";
    public static final String BUILD_TYPE = "BuildType";
    public static final Companion Companion = new Companion(null);
    public static final String FINGERPRINT = "DeviceFingerprint";
    public static final String HARDWARE = "DeviceHardware";
    public static final String MANUFACTURER = "DeviceManufacturer";
    public static final String MODEL = "DeviceName";
    public static final String PRODUCT = "Product";
    public static final String VERSION_RELEASE = "DeviceOsReleaseVersion";
    public static final String VERSION_SDK = "DeviceSdkVersion";

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.amplifyframework.auth.cognito.asf.BuildDataCollector.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Override // com.amplifyframework.auth.cognito.asf.DataCollector
    public Map<String, String> collect(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        return C56424yEw.gEmmrt(C56390yDp.OLrzqt(BRAND, Build.BRAND), C56390yDp.OLrzqt(FINGERPRINT, Build.FINGERPRINT), C56390yDp.OLrzqt(HARDWARE, Build.HARDWARE), C56390yDp.OLrzqt(MODEL, Build.MODEL), C56390yDp.OLrzqt(PRODUCT, Build.PRODUCT), C56390yDp.OLrzqt(BUILD_TYPE, Build.TYPE), C56390yDp.OLrzqt(VERSION_RELEASE, Build.VERSION.RELEASE), C56390yDp.OLrzqt(VERSION_SDK, Build.VERSION.SDK));
    }
}
