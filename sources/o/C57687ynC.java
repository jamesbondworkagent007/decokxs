package o;

import android.location.Location;
import com.huawei.hmf.tasks.OnFailureListener;
import com.huawei.hmf.tasks.OnSuccessListener;
import com.huawei.hms.location.FusedLocationProviderClient;
import com.huawei.hms.location.LocationCallback;
import com.huawei.hms.location.LocationRequest;
import com.huawei.hms.location.LocationServices;
import com.onesignal.LocationController;
import com.onesignal.OneSignal;

/* JADX INFO: renamed from: o.ynC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public class C57687ynC extends LocationController {
    public static TaskDescription KWHzl;
    public static FusedLocationProviderClient copydefault;

    public static void KWHzl() {
        EZpvd();
    }

    public static void EZpvd() {
        synchronized (LocationController.isConnected) {
            if (copydefault == null) {
                try {
                    copydefault = LocationServices.getFusedLocationProviderClient(LocationController.AEQbTJ);
                } catch (java.lang.Exception e) {
                    OneSignal.KWHzl(OneSignal.LOG_LEVEL.ERROR, "Huawei LocationServices getFusedLocationProviderClient failed! " + e);
                    copydefault();
                    return;
                }
            }
            Location location = LocationController.EZpvd;
            if (location != null) {
                LocationController.EZpvd(location);
            } else {
                copydefault.getLastLocation().addOnSuccessListener(new OnSuccessListener<Location>() { // from class: o.ynC.5
                    /* JADX DEBUG: Method merged with bridge method: onSuccess(Ljava/lang/Object;)V */
                    @Override // com.huawei.hmf.tasks.OnSuccessListener
                    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
                    public void onSuccess(Location location2) {
                        OneSignal.KWHzl(OneSignal.LOG_LEVEL.WARN, "Huawei LocationServices getLastLocation returned location: " + location2);
                        if (location2 == null) {
                            C57687ynC.copydefault();
                            return;
                        }
                        LocationController.EZpvd = location2;
                        LocationController.EZpvd(location2);
                        C57687ynC.KWHzl = new TaskDescription(C57687ynC.copydefault);
                    }
                }).addOnFailureListener(new OnFailureListener() { // from class: o.ynC.4
                    @Override // com.huawei.hmf.tasks.OnFailureListener
                    public void onFailure(java.lang.Exception exc) {
                        OneSignal.OLrzqt(OneSignal.LOG_LEVEL.ERROR, "Huawei LocationServices getLastLocation failed!", exc);
                        C57687ynC.copydefault();
                    }
                });
            }
        }
    }

    public static void copydefault() {
        synchronized (LocationController.isConnected) {
            copydefault = null;
        }
    }

    public static void AEQbTJ() {
        synchronized (LocationController.isConnected) {
            OneSignal.KWHzl(OneSignal.LOG_LEVEL.DEBUG, "HMSLocationController onFocusChange!");
            if (LocationController.DbNXlk() && copydefault == null) {
                return;
            }
            FusedLocationProviderClient fusedLocationProviderClient = copydefault;
            if (fusedLocationProviderClient != null) {
                TaskDescription taskDescription = KWHzl;
                if (taskDescription != null) {
                    fusedLocationProviderClient.removeLocationUpdates(taskDescription);
                }
                KWHzl = new TaskDescription(copydefault);
            }
        }
    }

    /* JADX INFO: renamed from: o.ynC$TaskDescription */
    public static class TaskDescription extends LocationCallback {
        public FusedLocationProviderClient KWHzl;

        public TaskDescription(FusedLocationProviderClient fusedLocationProviderClient) {
            this.KWHzl = fusedLocationProviderClient;
            copydefault();
        }

        public final void copydefault() {
            long j = OneSignal.iRxXKY() ? 270000L : 570000L;
            LocationRequest priority = LocationRequest.create().setFastestInterval(j).setInterval(j).setMaxWaitTime((long) (j * 1.5d)).setPriority(102);
            OneSignal.KWHzl(OneSignal.LOG_LEVEL.DEBUG, "HMSLocationController Huawei LocationServices requestLocationUpdates!");
            this.KWHzl.requestLocationUpdates(priority, this, LocationController.fetchVPNInfo().getLooper());
        }
    }
}
