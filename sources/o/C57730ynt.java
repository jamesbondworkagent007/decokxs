package o;

import android.location.Location;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationServices;
import com.onesignal.LocationController;
import com.onesignal.OneSignal;

/* JADX INFO: renamed from: o.ynt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public class C57730ynt extends LocationController {
    public static C57736ynz KWHzl;
    public static Activity copydefault;

    public static int AEQbTJ() {
        return 30000;
    }

    public static void AhwBna() {
        copydefault();
    }

    public static void copydefault() {
        Location location;
        if (LocationController.OLrzqt != null) {
            return;
        }
        synchronized (LocationController.isConnected) {
            gEmmrt();
            if (KWHzl == null || (location = LocationController.EZpvd) == null) {
                Application application = new Application();
                C57736ynz c57736ynz = new C57736ynz(new GoogleApiClient.Builder(LocationController.AEQbTJ).addApi(LocationServices.API).addConnectionCallbacks(application).addOnConnectionFailedListener(application).setHandler(LocationController.fetchVPNInfo().OLrzqt).build());
                KWHzl = c57736ynz;
                c57736ynz.KWHzl();
            } else {
                LocationController.EZpvd(location);
            }
        }
    }

    public static void gEmmrt() {
        java.lang.Thread thread = new java.lang.Thread(new java.lang.Runnable() { // from class: o.ynt.2
            @Override // java.lang.Runnable
            public void run() {
                try {
                    java.lang.Thread.sleep(C57730ynt.AEQbTJ());
                    OneSignal.KWHzl(OneSignal.LOG_LEVEL.WARN, "Location permission exists but GoogleApiClient timed out. Maybe related to mismatch google-play aar versions.");
                    LocationController.djBIcL();
                    LocationController.copydefault(LocationController.AEQbTJ);
                } catch (java.lang.InterruptedException unused) {
                }
            }
        }, "OS_GMS_LOCATION_FALLBACK");
        LocationController.OLrzqt = thread;
        thread.start();
    }

    public static void OLrzqt() {
        synchronized (LocationController.isConnected) {
            C57736ynz c57736ynz = KWHzl;
            if (c57736ynz != null) {
                c57736ynz.OLrzqt();
            }
            KWHzl = null;
        }
    }

    public static void AYXKKw() {
        synchronized (LocationController.isConnected) {
            OneSignal.KWHzl(OneSignal.LOG_LEVEL.DEBUG, "GMSLocationController onFocusChange!");
            C57736ynz c57736ynz = KWHzl;
            if (c57736ynz != null && c57736ynz.AEQbTJ().isConnected()) {
                C57736ynz c57736ynz2 = KWHzl;
                if (c57736ynz2 != null) {
                    GoogleApiClient googleApiClientAEQbTJ = c57736ynz2.AEQbTJ();
                    if (copydefault != null) {
                        LocationServices.FusedLocationApi.removeLocationUpdates(googleApiClientAEQbTJ, copydefault);
                    }
                    copydefault = new Activity(googleApiClientAEQbTJ);
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.ynt$Application */
    public static class Application implements GoogleApiClient.ConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener {
        private Application() {
        }

        @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
        public void onConnected(android.os.Bundle bundle) {
            synchronized (LocationController.isConnected) {
                if (C57730ynt.KWHzl != null && C57730ynt.KWHzl.AEQbTJ() != null) {
                    OneSignal.LOG_LEVEL log_level = OneSignal.LOG_LEVEL.DEBUG;
                    OneSignal.KWHzl(log_level, "GMSLocationController GoogleApiClientListener onConnected lastLocation: " + LocationController.EZpvd);
                    if (LocationController.EZpvd == null) {
                        LocationController.EZpvd = TaskDescription.copydefault(C57730ynt.KWHzl.AEQbTJ());
                        OneSignal.KWHzl(log_level, "GMSLocationController GoogleApiClientListener lastLocation: " + LocationController.EZpvd);
                        Location location = LocationController.EZpvd;
                        if (location != null) {
                            LocationController.EZpvd(location);
                        }
                    }
                    C57730ynt.copydefault = new Activity(C57730ynt.KWHzl.AEQbTJ());
                    return;
                }
                OneSignal.KWHzl(OneSignal.LOG_LEVEL.DEBUG, "GMSLocationController GoogleApiClientListener onConnected googleApiClient not available, returning");
            }
        }

        @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
        public void onConnectionSuspended(int i) {
            OneSignal.KWHzl(OneSignal.LOG_LEVEL.DEBUG, "GMSLocationController GoogleApiClientListener onConnectionSuspended i: " + i);
            C57730ynt.OLrzqt();
        }

        @Override // com.google.android.gms.common.api.internal.OnConnectionFailedListener
        public void onConnectionFailed(@androidx.annotation.NonNull ConnectionResult connectionResult) {
            OneSignal.KWHzl(OneSignal.LOG_LEVEL.DEBUG, "GMSLocationController GoogleApiClientListener onConnectionSuspended connectionResult: " + connectionResult);
            C57730ynt.OLrzqt();
        }
    }

    /* JADX INFO: renamed from: o.ynt$Activity */
    public static class Activity implements LocationListener {
        public GoogleApiClient AEQbTJ;

        public Activity(GoogleApiClient googleApiClient) {
            this.AEQbTJ = googleApiClient;
            KWHzl();
        }

        public final void KWHzl() {
            long j = OneSignal.iRxXKY() ? 270000L : 570000L;
            if (this.AEQbTJ != null) {
                LocationRequest priority = LocationRequest.create().setFastestInterval(j).setInterval(j).setMaxWaitTime((long) (j * 1.5d)).setPriority(102);
                OneSignal.KWHzl(OneSignal.LOG_LEVEL.DEBUG, "GMSLocationController GoogleApiClient requestLocationUpdates!");
                TaskDescription.EZpvd(this.AEQbTJ, priority, this);
            }
        }
    }

    /* JADX INFO: renamed from: o.ynt$TaskDescription */
    public static class TaskDescription {
        public static void EZpvd(GoogleApiClient googleApiClient, LocationRequest locationRequest, LocationListener locationListener) {
            try {
                synchronized (LocationController.isConnected) {
                    if (android.os.Looper.myLooper() == null) {
                        android.os.Looper.prepare();
                    }
                    if (googleApiClient.isConnected()) {
                        LocationServices.FusedLocationApi.requestLocationUpdates(googleApiClient, locationRequest, locationListener);
                    }
                }
            } catch (java.lang.Throwable th) {
                OneSignal.OLrzqt(OneSignal.LOG_LEVEL.WARN, "FusedLocationApi.requestLocationUpdates failed!", th);
            }
        }

        public static Location copydefault(GoogleApiClient googleApiClient) {
            synchronized (LocationController.isConnected) {
                if (!googleApiClient.isConnected()) {
                    return null;
                }
                return LocationServices.FusedLocationApi.getLastLocation(googleApiClient);
            }
        }
    }
}
