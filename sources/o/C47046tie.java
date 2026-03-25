package o;

import android.location.Location;
import android.location.LocationManager;
import android.os.Build;
import androidx.core.content.ContextCompat;
import com.okinc.okrisk.OKRiskPayloadManager;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.tie, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C47046tie {
    public static final C47046tie KWHzl = new C47046tie();

    public final int copydefault(android.content.Context context) {
        return -1;
    }

    private C47046tie() {
    }

    public final java.lang.String copydefault() {
        try {
            OKRiskPayloadManager oKRiskPayloadManager = OKRiskPayloadManager.copydefault;
            if (!oKRiskPayloadManager.wlaJM()) {
                return "";
            }
            android.app.Application applicationOLrzqt = C32979mnm.EZpvd.OLrzqt();
            int iCopydefault = copydefault(applicationOLrzqt);
            int iAEQbTJ = AEQbTJ(applicationOLrzqt);
            java.lang.String strAEQbTJ = AEQbTJ(iCopydefault, iAEQbTJ);
            if (oKRiskPayloadManager.fJNWhG() == null) {
                pUU.valueOf("OKRiskSecTokenGenerator", "nativeBridge is null, cannot generate secToken");
                C47220tlt.log$default(C47220tlt.KWHzl, "OKRiskSecTokenGenerator", "nativeBridge is null, cannot generate secToken", null, null, 12, null);
                return "";
            }
            java.lang.String strGEmmrt = C47136tkO.AEQbTJ.gEmmrt(applicationOLrzqt);
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            C47220tlt c47220tlt = C47220tlt.KWHzl;
            C47220tlt.log$default(c47220tlt, "OKRiskSecTokenGenerator", "produceToken START", null, null, 12, null);
            java.lang.String strAEQbTJ2 = C47000thl.KWHzl.AEQbTJ(applicationOLrzqt, strAEQbTJ, strGEmmrt, java.lang.String.valueOf(jCurrentTimeMillis));
            C47220tlt.log$default(c47220tlt, "OKRiskSecTokenGenerator", "produceToken END, took " + (java.lang.System.currentTimeMillis() - jCurrentTimeMillis), null, null, 12, null);
            if (strAEQbTJ2.length() > 0) {
                pUU.EZpvd("OKRiskSecTokenGenerator", "Generated secToken successfully: length=" + strAEQbTJ2.length() + ", mockLocationSetting=" + iCopydefault + ", mockLocationProvider=" + iAEQbTJ + ", otherData=" + strAEQbTJ);
                C47220tlt.log$default(c47220tlt, "OKRiskSecTokenGenerator", "Generated secToken successfully: length=" + strAEQbTJ2.length() + ", mockLocationSetting=" + iCopydefault + ", mockLocationProvider=" + iAEQbTJ + ", otherData=" + strAEQbTJ, null, null, 12, null);
            } else {
                pUU.valueOf("OKRiskSecTokenGenerator", "produceToken returned empty secToken");
                C47220tlt.log$default(c47220tlt, "OKRiskSecTokenGenerator", "produceToken returned empty secToken", null, null, 12, null);
            }
            return strAEQbTJ2;
        } catch (java.lang.Exception e) {
            pUU.AEQbTJ("OKRiskSecTokenGenerator", "Failed to generate secToken: " + e.getLocalizedMessage(), e);
            C47220tlt.log$default(C47220tlt.KWHzl, "OKRiskSecTokenGenerator", "Failed to generate secToken: " + e.getLocalizedMessage(), null, null, 12, null);
            return "";
        }
    }

    public final int AEQbTJ(android.content.Context context) {
        boolean zIsFromMockProvider;
        try {
            java.lang.Object systemService = context.getSystemService("location");
            LocationManager locationManager = systemService instanceof LocationManager ? (LocationManager) systemService : null;
            if (locationManager == null) {
                return 0;
            }
            if (ContextCompat.checkSelfPermission(context, "android.permission.ACCESS_FINE_LOCATION") != 0 && ContextCompat.checkSelfPermission(context, "android.permission.ACCESS_COARSE_LOCATION") != 0) {
                pUU.EZpvd("OKRiskSecTokenGenerator", "No location permission, cannot check mock location");
                C47220tlt.log$default(C47220tlt.KWHzl, "OKRiskSecTokenGenerator", "No location permission, cannot check mock location", null, null, 12, null);
                return -2;
            }
            java.util.List<java.lang.String> providers = locationManager.getProviders(true);
            Intrinsics.checkNotNullExpressionValue(providers, "");
            if ((providers instanceof java.util.Collection) && providers.isEmpty()) {
                return 0;
            }
            for (java.lang.String str : providers) {
                try {
                    try {
                        Location lastKnownLocation = locationManager.getLastKnownLocation(str);
                        if (lastKnownLocation == null) {
                            continue;
                        } else {
                            if (Build.VERSION.SDK_INT >= 31) {
                                zIsFromMockProvider = lastKnownLocation.isMock();
                            } else {
                                zIsFromMockProvider = lastKnownLocation.isFromMockProvider();
                            }
                            if (zIsFromMockProvider) {
                                return 1;
                            }
                        }
                    } catch (java.lang.Exception e) {
                        pUU.valueOf("OKRiskSecTokenGenerator", "Error getting location from " + str + ": " + e.getLocalizedMessage());
                        C47220tlt.log$default(C47220tlt.KWHzl, "OKRiskSecTokenGenerator", "Error getting location from " + str + ": " + e.getLocalizedMessage(), null, null, 12, null);
                    }
                } catch (java.lang.SecurityException e2) {
                    pUU.EZpvd("OKRiskSecTokenGenerator", "SecurityException getting location from " + str + ": " + e2.getLocalizedMessage());
                    C47220tlt.log$default(C47220tlt.KWHzl, "OKRiskSecTokenGenerator", "SecurityException getting location from " + str + ": " + e2.getLocalizedMessage(), null, null, 12, null);
                }
            }
            return 0;
        } catch (java.lang.Exception e3) {
            pUU.AEQbTJ("OKRiskSecTokenGenerator", "Error checking mock location: " + e3.getMessage(), e3);
            C47220tlt.log$default(C47220tlt.KWHzl, "OKRiskSecTokenGenerator", "Error checking mock location: " + e3.getLocalizedMessage(), null, null, 12, null);
            return 0;
        }
    }

    public final java.lang.String AEQbTJ(int i, int i2) {
        return "{\"mockLocationSetting\":" + i + ",\"mockLocationProvider\":" + i2 + "}";
    }
}
