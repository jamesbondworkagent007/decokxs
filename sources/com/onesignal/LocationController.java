package com.onesignal;

import android.content.Context;
import android.location.Location;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import com.onesignal.OneSignal;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.C57687ynC;
import o.C57693ynI;
import o.C57720ynj;
import o.C57730ynt;
import o.C57733ynw;
import o.C57762yoY;
import o.C57791ypA;
import o.C57834ypr;

/* JADX INFO: loaded from: classes12.dex */
public class LocationController {
    public static Context AEQbTJ;
    public static Application AYXKKw;
    public static Location EZpvd;
    public static Thread OLrzqt;
    public static boolean djBIcL;
    public static String gEmmrt;
    public static final List<Activity> AhwBna = new ArrayList();
    public static ConcurrentHashMap<PermissionType, StateListAnimator> valueOf = new ConcurrentHashMap<>();
    public static final Object isConnected = new Object() { // from class: com.onesignal.LocationController.1
    };

    public static abstract class Activity implements StateListAnimator {
        public void AEQbTJ(OneSignal.PromptActionResult promptActionResult) {
        }
    }

    public enum PermissionType {
        STARTUP,
        PROMPT_LOCATION,
        SYNC_SERVICE
    }

    public interface StateListAnimator {
        void EZpvd(ActionBar actionBar);

        PermissionType OLrzqt();
    }

    public static Application fetchVPNInfo() {
        if (AYXKKw == null) {
            synchronized (isConnected) {
                if (AYXKKw == null) {
                    AYXKKw = new Application();
                }
            }
        }
        return AYXKKw;
    }

    public static class ActionBar {
        public Boolean AEQbTJ;
        public Integer AYXKKw;
        public Float EZpvd;
        public Double KWHzl;
        public Double OLrzqt;
        public Long copydefault;

        public String toString() {
            return "LocationPoint{lat=" + this.OLrzqt + ", log=" + this.KWHzl + ", accuracy=" + this.EZpvd + ", type=" + this.AYXKKw + ", bg=" + this.AEQbTJ + ", timeStamp=" + this.copydefault + AbstractJsonLexerKt.END_OBJ;
        }
    }

    public static boolean copydefault(Context context) {
        if (!OLrzqt(context)) {
            OneSignal.AEQbTJ(OneSignal.LOG_LEVEL.DEBUG, "LocationController scheduleUpdate not possible, location permission not enabled");
            return false;
        }
        if (!OneSignal.hUfVAv()) {
            OneSignal.AEQbTJ(OneSignal.LOG_LEVEL.DEBUG, "LocationController scheduleUpdate not possible, location shared not enabled");
            return false;
        }
        long jKWHzl = OneSignal.aKErDB().KWHzl() - valueOf();
        long j = (OneSignal.iRxXKY() ? 300L : 600L) * 1000;
        OneSignal.AEQbTJ(OneSignal.LOG_LEVEL.DEBUG, "LocationController scheduleUpdate lastTime: " + jKWHzl + " minTime: " + j);
        C57762yoY.valueOf().copydefault(context, j - jKWHzl);
        return true;
    }

    public static void AEQbTJ(long j) {
        C57834ypr.EZpvd(C57834ypr.copydefault, "OS_LAST_LOCATION_TIME", j);
    }

    public static long valueOf() {
        return C57834ypr.OLrzqt(C57834ypr.copydefault, "OS_LAST_LOCATION_TIME", -600000L);
    }

    public static boolean OLrzqt(Context context) {
        return C57720ynj.Activity.copydefault(context, "android.permission.ACCESS_FINE_LOCATION") == 0 || C57720ynj.Activity.copydefault(context, "android.permission.ACCESS_COARSE_LOCATION") == 0;
    }

    public static void EZpvd(StateListAnimator stateListAnimator) {
        if (stateListAnimator instanceof Activity) {
            List<Activity> list = AhwBna;
            synchronized (list) {
                list.add((Activity) stateListAnimator);
            }
        }
    }

    public static void copydefault(boolean z, OneSignal.PromptActionResult promptActionResult) {
        if (!z) {
            OneSignal.AEQbTJ(OneSignal.LOG_LEVEL.DEBUG, "LocationController sendAndClearPromptHandlers from non prompt flow");
            return;
        }
        List<Activity> list = AhwBna;
        synchronized (list) {
            OneSignal.AEQbTJ(OneSignal.LOG_LEVEL.DEBUG, "LocationController calling prompt handlers");
            Iterator<Activity> it = list.iterator();
            while (it.hasNext()) {
                it.next().AEQbTJ(promptActionResult);
            }
            AhwBna.clear();
        }
    }

    public static void OLrzqt(Context context, boolean z, boolean z2, StateListAnimator stateListAnimator) {
        int iCopydefault;
        EZpvd(stateListAnimator);
        AEQbTJ = context;
        valueOf.put(stateListAnimator.OLrzqt(), stateListAnimator);
        if (!OneSignal.hUfVAv()) {
            copydefault(z, OneSignal.PromptActionResult.ERROR);
            djBIcL();
            return;
        }
        int iCopydefault2 = C57720ynj.Activity.copydefault(context, "android.permission.ACCESS_FINE_LOCATION");
        if (iCopydefault2 == -1) {
            iCopydefault = C57720ynj.Activity.copydefault(context, "android.permission.ACCESS_COARSE_LOCATION");
            djBIcL = true;
        } else {
            iCopydefault = -1;
        }
        int i = Build.VERSION.SDK_INT;
        int iCopydefault3 = i >= 29 ? C57720ynj.Activity.copydefault(context, "android.permission.ACCESS_BACKGROUND_LOCATION") : -1;
        if (iCopydefault2 == 0) {
            if (i >= 29 && iCopydefault3 != 0) {
                copydefault(context, z, z2);
                return;
            } else {
                copydefault(z, OneSignal.PromptActionResult.PERMISSION_GRANTED);
                AkhnZx();
                return;
            }
        }
        C57733ynw c57733ynwEZpvd = C57791ypA.Companion.EZpvd(context, context.getPackageName(), 4096);
        if (!c57733ynwEZpvd.EZpvd() || c57733ynwEZpvd.OLrzqt() == null) {
            copydefault(z, OneSignal.PromptActionResult.ERROR);
            return;
        }
        List listAsList = Arrays.asList(c57733ynwEZpvd.OLrzqt().requestedPermissions);
        OneSignal.PromptActionResult promptActionResult = OneSignal.PromptActionResult.PERMISSION_DENIED;
        if (listAsList.contains("android.permission.ACCESS_FINE_LOCATION")) {
            gEmmrt = "android.permission.ACCESS_FINE_LOCATION";
        } else if (!listAsList.contains("android.permission.ACCESS_COARSE_LOCATION")) {
            OneSignal.AEQbTJ(OneSignal.LOG_LEVEL.INFO, "Location permissions not added on AndroidManifest file");
            promptActionResult = OneSignal.PromptActionResult.LOCATION_PERMISSIONS_MISSING_MANIFEST;
        } else if (iCopydefault != 0) {
            gEmmrt = "android.permission.ACCESS_COARSE_LOCATION";
        } else if (i >= 29 && listAsList.contains("android.permission.ACCESS_BACKGROUND_LOCATION")) {
            gEmmrt = "android.permission.ACCESS_BACKGROUND_LOCATION";
        }
        if (gEmmrt != null && z) {
            C57693ynI.copydefault.OLrzqt(z2, gEmmrt);
        } else if (iCopydefault == 0) {
            copydefault(z, OneSignal.PromptActionResult.PERMISSION_GRANTED);
            AkhnZx();
        } else {
            copydefault(z, promptActionResult);
            djBIcL();
        }
    }

    public static void copydefault(Context context, boolean z, boolean z2) {
        C57733ynw c57733ynwEZpvd = C57791ypA.Companion.EZpvd(context, context.getPackageName(), 4096);
        if (!c57733ynwEZpvd.EZpvd() || c57733ynwEZpvd.OLrzqt() == null) {
            copydefault(z, OneSignal.PromptActionResult.ERROR);
            return;
        }
        if (Arrays.asList(c57733ynwEZpvd.OLrzqt().requestedPermissions).contains("android.permission.ACCESS_BACKGROUND_LOCATION")) {
            gEmmrt = "android.permission.ACCESS_BACKGROUND_LOCATION";
        }
        if (gEmmrt != null && z) {
            C57693ynI.copydefault.OLrzqt(z2, gEmmrt);
        } else {
            copydefault(z, OneSignal.PromptActionResult.PERMISSION_GRANTED);
            AkhnZx();
        }
    }

    public static void AkhnZx() {
        OneSignal.KWHzl(OneSignal.LOG_LEVEL.DEBUG, "LocationController startGetLocation with lastLocation: " + EZpvd);
        try {
            if (values()) {
                C57730ynt.AhwBna();
            } else if (DbNXlk()) {
                C57687ynC.KWHzl();
            } else {
                OneSignal.KWHzl(OneSignal.LOG_LEVEL.WARN, "LocationController startGetLocation not possible, no location dependency found");
                djBIcL();
            }
        } catch (Throwable th) {
            OneSignal.OLrzqt(OneSignal.LOG_LEVEL.WARN, "Location permission exists but there was an error initializing: ", th);
            djBIcL();
        }
    }

    public static void isConnected() {
        synchronized (isConnected) {
            if (values()) {
                C57730ynt.AYXKKw();
            } else {
                if (DbNXlk()) {
                    C57687ynC.AEQbTJ();
                }
            }
        }
    }

    public static boolean values() {
        return OSUtils.DbNXlk() && OSUtils.AEQbTJ();
    }

    public static boolean DbNXlk() {
        return OSUtils.fJNWhG() && OSUtils.djBIcL();
    }

    public static void djBIcL() {
        synchronized (isConnected) {
            if (values()) {
                C57730ynt.OLrzqt();
            } else if (DbNXlk()) {
                C57687ynC.copydefault();
            }
        }
        OLrzqt((ActionBar) null);
    }

    public static void OLrzqt(ActionBar actionBar) {
        Thread thread;
        HashMap map = new HashMap();
        synchronized (LocationController.class) {
            map.putAll(valueOf);
            valueOf.clear();
            thread = OLrzqt;
        }
        Iterator it = map.keySet().iterator();
        while (it.hasNext()) {
            ((StateListAnimator) map.get((PermissionType) it.next())).EZpvd(actionBar);
        }
        if (thread != null && !Thread.currentThread().equals(thread)) {
            thread.interrupt();
        }
        if (thread == OLrzqt) {
            synchronized (LocationController.class) {
                if (thread == OLrzqt) {
                    OLrzqt = null;
                }
            }
        }
        AEQbTJ(OneSignal.aKErDB().KWHzl());
    }

    public static void EZpvd(Location location) {
        OneSignal.KWHzl(OneSignal.LOG_LEVEL.DEBUG, "LocationController fireCompleteForLocation with location: " + location);
        ActionBar actionBar = new ActionBar();
        actionBar.EZpvd = Float.valueOf(location.getAccuracy());
        actionBar.AEQbTJ = Boolean.valueOf(OneSignal.iRxXKY() ^ true);
        actionBar.AYXKKw = Integer.valueOf(!djBIcL ? 1 : 0);
        actionBar.copydefault = Long.valueOf(location.getTime());
        if (djBIcL) {
            BigDecimal bigDecimal = new BigDecimal(location.getLatitude());
            RoundingMode roundingMode = RoundingMode.HALF_UP;
            actionBar.OLrzqt = Double.valueOf(bigDecimal.setScale(7, roundingMode).doubleValue());
            actionBar.KWHzl = Double.valueOf(new BigDecimal(location.getLongitude()).setScale(7, roundingMode).doubleValue());
        } else {
            actionBar.OLrzqt = Double.valueOf(location.getLatitude());
            actionBar.KWHzl = Double.valueOf(location.getLongitude());
        }
        OLrzqt(actionBar);
        copydefault(AEQbTJ);
    }

    public static class Application extends HandlerThread {
        public Handler OLrzqt;

        public Application() {
            super("OSH_LocationHandlerThread");
            start();
            this.OLrzqt = new Handler(getLooper());
        }
    }
}
