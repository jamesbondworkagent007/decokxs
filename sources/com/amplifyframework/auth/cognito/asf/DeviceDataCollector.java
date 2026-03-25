package com.amplifyframework.auth.cognito.asf;

import android.content.Context;
import android.view.Display;
import android.view.WindowManager;
import java.util.Arrays;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C56390yDp;
import o.C56424yEw;
import o.C56529yIt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class DeviceDataCollector implements DataCollector {
    public static final Companion Companion = new Companion(null);
    public static final String DEVICE_AGENT = "DeviceId";
    public static final String DEVICE_HEIGHT = "ScreenHeightPixels";
    public static final String DEVICE_LANGUAGE = "DeviceLanguage";
    public static final String DEVICE_WIDTH = "ScreenWidthPixels";
    public static final String PLATFORM_KEY = "Platform";
    private static final String PLATFORM_VALUE = "ANDROID";
    public static final String THIRD_PARTY_DEVICE_AGENT = "ThirdPartyDeviceId";
    public static final String TIMEZONE = "ClientTimezone";
    private final String deviceId;
    private final String language;
    private final String thirdPartyDeviceAgent;
    private final TimeZone timezone;

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.amplifyframework.auth.cognito.asf.DeviceDataCollector.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public DeviceDataCollector(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.deviceId = str;
        this.thirdPartyDeviceAgent = "android_id";
        String string = Locale.getDefault().toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        this.language = string;
        TimeZone timeZone = TimeZone.getDefault();
        Intrinsics.checkNotNullExpressionValue(timeZone, "");
        this.timezone = timeZone;
    }

    private final String getTimezoneOffset() {
        long rawOffset = this.timezone.getRawOffset();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        long hours = timeUnit.toHours(rawOffset);
        long minutes = timeUnit.toMinutes(rawOffset);
        long minutes2 = TimeUnit.HOURS.toMinutes(hours);
        String str = hours < 0 ? "-" : "";
        C56529yIt c56529yIt = C56529yIt.KWHzl;
        String str2 = String.format(Locale.US, "%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(Math.abs(hours)), Long.valueOf(minutes - minutes2)}, 2));
        Intrinsics.checkNotNullExpressionValue(str2, "");
        return str + str2;
    }

    private final Display getDisplay(Context context) {
        Object systemService = context.getSystemService("window");
        Intrinsics.copydefault(systemService, "");
        Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
        Intrinsics.checkNotNullExpressionValue(defaultDisplay, "");
        return defaultDisplay;
    }

    @Override // com.amplifyframework.auth.cognito.asf.DataCollector
    public Map<String, String> collect(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        Display display = getDisplay(context);
        return C56424yEw.gEmmrt(C56390yDp.OLrzqt(TIMEZONE, getTimezoneOffset()), C56390yDp.OLrzqt(PLATFORM_KEY, PLATFORM_VALUE), C56390yDp.OLrzqt(THIRD_PARTY_DEVICE_AGENT, this.thirdPartyDeviceAgent), C56390yDp.OLrzqt(DEVICE_AGENT, this.deviceId), C56390yDp.OLrzqt(DEVICE_LANGUAGE, this.language), C56390yDp.OLrzqt(DEVICE_HEIGHT, String.valueOf(display.getHeight())), C56390yDp.OLrzqt(DEVICE_WIDTH, String.valueOf(display.getWidth())));
    }
}
