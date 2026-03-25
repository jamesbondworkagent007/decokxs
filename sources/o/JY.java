package o;

import android.content.pm.PackageManager;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.location.LocationManager;
import android.os.Build;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import androidx.autofill.HintConstants;
import androidx.core.content.ContextCompat;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.lang.reflect.InvocationTargetException;
import java.util.UUID;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class JY {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public Activity AEQbTJ;
    public boolean EZpvd;
    public final android.content.Context OLrzqt;
    public boolean copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean DbNXlk() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean fARcdN() {
        return this.EZpvd;
    }

    public JY(@NotNull android.content.Context context, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(context, "");
        this.OLrzqt = context;
        this.EZpvd = z;
        this.copydefault = z2;
    }

    public final Activity OLrzqt() {
        if (this.AEQbTJ == null) {
            this.AEQbTJ = new Activity();
        }
        return this.AEQbTJ;
    }

    public final class Activity {
        public boolean AhwBna = true;
        public java.lang.String KWHzl = AEQbTJ();
        public final java.lang.String AkhnZx = isConnected();
        public final java.lang.String DbNXlk = "android";
        public final java.lang.String values = AhwBna();
        public final java.lang.String AEQbTJ = EZpvd();
        public final java.lang.String gEmmrt = djBIcL();
        public final java.lang.String AYXKKw = valueOf();
        public final java.lang.String EZpvd = KWHzl();
        public final java.lang.String copydefault = AYXKKw();
        public final java.lang.String valueOf = gEmmrt();
        public final boolean djBIcL = OLrzqt();
        public java.lang.String OLrzqt = copydefault();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AkhnZx() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AuCTelauCTel() {
            return this.AkhnZx;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AubY() {
            return this.AYXKKw;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String DbNXlk() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String fIwbmz() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String fetchVPNInfo() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String getFieldNames() {
            return this.valueOf;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean iwGUEr() {
            return this.AhwBna;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String uzCIH() {
            return this.gEmmrt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String values() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String wlaJM() {
            return this.values;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String zLjUOn() {
            return this.DbNXlk;
        }

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public Activity() {
        }

        public final java.lang.String isConnected() {
            try {
                android.content.pm.PackageInfo packageInfo = JY.this.OLrzqt.getPackageManager().getPackageInfo(JY.this.OLrzqt.getPackageName(), 0);
                Intrinsics.checkNotNullExpressionValue(packageInfo, "");
                return packageInfo.versionName;
            } catch (PackageManager.NameNotFoundException | java.lang.Exception unused) {
                return null;
            }
        }

        public final java.lang.String AhwBna() {
            java.lang.String str = Build.VERSION.RELEASE;
            Intrinsics.checkNotNullExpressionValue(str, "");
            return str;
        }

        public final java.lang.String EZpvd() {
            java.lang.String str = android.os.Build.BRAND;
            Intrinsics.checkNotNullExpressionValue(str, "");
            return str;
        }

        public final java.lang.String djBIcL() {
            java.lang.String str = android.os.Build.MANUFACTURER;
            Intrinsics.checkNotNullExpressionValue(str, "");
            return str;
        }

        public final java.lang.String valueOf() {
            java.lang.String str = android.os.Build.MODEL;
            Intrinsics.checkNotNullExpressionValue(str, "");
            return str;
        }

        public final java.lang.String KWHzl() {
            try {
                java.lang.Object systemService = JY.this.OLrzqt.getSystemService(HintConstants.AUTOFILL_HINT_PHONE);
                Intrinsics.copydefault(systemService, "");
                return ((TelephonyManager) systemService).getNetworkOperatorName();
            } catch (java.lang.Exception unused) {
                return null;
            }
        }

        public final java.lang.String AYXKKw() {
            java.lang.String strFJNWhG = fJNWhG();
            if (strFJNWhG != null && strFJNWhG.length() != 0) {
                return strFJNWhG;
            }
            java.lang.String strAuCTel = AuCTel();
            return (strAuCTel == null || strAuCTel.length() == 0) ? ejfBZ() : strAuCTel;
        }

        public final java.lang.String fJNWhG() {
            Location locationIsConnected;
            java.util.List<Address> fromLocation;
            if (JY.this.fARcdN() && (locationIsConnected = JY.this.isConnected()) != null) {
                try {
                    if (Geocoder.isPresent() && (fromLocation = JY.this.gEmmrt().getFromLocation(locationIsConnected.getLatitude(), locationIsConnected.getLongitude(), 1)) != null) {
                        for (Address address : fromLocation) {
                            if (address != null) {
                                return address.getCountryCode();
                            }
                        }
                    }
                } catch (java.io.IOException | java.lang.IllegalArgumentException | java.lang.IllegalStateException | java.lang.NoSuchMethodError | java.lang.NullPointerException | java.lang.SecurityException unused) {
                }
            }
            return null;
        }

        public final java.lang.String AuCTel() {
            java.lang.String networkCountryIso;
            try {
                java.lang.Object systemService = JY.this.OLrzqt.getSystemService(HintConstants.AUTOFILL_HINT_PHONE);
                Intrinsics.copydefault(systemService, "");
                TelephonyManager telephonyManager = (TelephonyManager) systemService;
                if (telephonyManager.getPhoneType() == 2 || (networkCountryIso = telephonyManager.getNetworkCountryIso()) == null) {
                    return null;
                }
                java.util.Locale locale = java.util.Locale.US;
                Intrinsics.checkNotNullExpressionValue(locale, "");
                java.lang.String upperCase = networkCountryIso.toUpperCase(locale);
                Intrinsics.checkNotNullExpressionValue(upperCase, "");
                return upperCase;
            } catch (java.lang.Exception unused) {
                return null;
            }
        }

        public final java.util.Locale getNewProxyInstance() {
            android.os.LocaleList locales = android.content.res.Resources.getSystem().getConfiguration().getLocales();
            Intrinsics.checkNotNullExpressionValue(locales, "");
            if (locales.isEmpty()) {
                java.util.Locale locale = java.util.Locale.getDefault();
                Intrinsics.checkNotNullExpressionValue(locale, "");
                return locale;
            }
            java.util.Locale locale2 = locales.get(0);
            Intrinsics.checkNotNullExpressionValue(locale2, "");
            return locale2;
        }

        public final java.lang.String ejfBZ() {
            java.lang.String country = getNewProxyInstance().getCountry();
            Intrinsics.checkNotNullExpressionValue(country, "");
            return country;
        }

        public final java.lang.String gEmmrt() {
            java.lang.String language = getNewProxyInstance().getLanguage();
            Intrinsics.checkNotNullExpressionValue(language, "");
            return language;
        }

        public final java.lang.String AEQbTJ() {
            if (!JY.this.DbNXlk()) {
                return null;
            }
            if (Intrinsics.EZpvd((java.lang.Object) "Amazon", (java.lang.Object) djBIcL())) {
                return fARcdN();
            }
            return hDKMBd();
        }

        public final java.lang.String copydefault() {
            try {
                java.lang.Object objInvoke = java.lang.Class.forName("com.google.android.gms.appset.AppSet").getMethod("getClient", android.content.Context.class).invoke(null, JY.this.OLrzqt);
                java.lang.Object objInvoke2 = Tasks.class.getMethod("await", Task.class).invoke(null, objInvoke.getClass().getMethod("getAppSetIdInfo", new java.lang.Class[0]).invoke(objInvoke, new java.lang.Object[0]));
                java.lang.Object objInvoke3 = objInvoke2.getClass().getMethod("getId", new java.lang.Class[0]).invoke(objInvoke2, new java.lang.Object[0]);
                Intrinsics.copydefault(objInvoke3, "");
                this.OLrzqt = (java.lang.String) objInvoke3;
            } catch (java.lang.ClassNotFoundException unused) {
                C5239Kb.Companion.KWHzl().KWHzl("Google Play Services SDK not found for app set id!");
            } catch (InvocationTargetException unused2) {
                C5239Kb.Companion.KWHzl().KWHzl("Google Play Services not available for app set id");
            } catch (java.lang.Exception unused3) {
                C5239Kb.Companion.KWHzl().EZpvd("Encountered an error connecting to Google Play Services for app set id");
            }
            return this.OLrzqt;
        }

        public final java.lang.String fARcdN() {
            android.content.ContentResolver contentResolver = JY.this.OLrzqt.getContentResolver();
            this.AhwBna = Settings.Secure.getInt(contentResolver, "limit_ad_tracking", 0) == 1;
            java.lang.String string = Settings.Secure.getString(contentResolver, "advertising_id");
            this.KWHzl = string;
            return string;
        }

        public final java.lang.String hDKMBd() {
            boolean z = true;
            try {
                java.lang.Object objInvoke = AdvertisingIdClient.class.getMethod("getAdvertisingIdInfo", android.content.Context.class).invoke(null, JY.this.OLrzqt);
                java.lang.Object objInvoke2 = objInvoke.getClass().getMethod("isLimitAdTrackingEnabled", new java.lang.Class[0]).invoke(objInvoke, new java.lang.Object[0]);
                java.lang.Boolean bool = objInvoke2 instanceof java.lang.Boolean ? (java.lang.Boolean) objInvoke2 : null;
                if (bool == null || !bool.booleanValue()) {
                    z = false;
                }
                this.AhwBna = z;
                java.lang.Object objInvoke3 = objInvoke.getClass().getMethod("getId", new java.lang.Class[0]).invoke(objInvoke, new java.lang.Object[0]);
                Intrinsics.copydefault(objInvoke3, "");
                this.KWHzl = (java.lang.String) objInvoke3;
            } catch (java.lang.ClassNotFoundException unused) {
                C5239Kb.Companion.KWHzl().KWHzl("Google Play Services SDK not found for advertising id!");
            } catch (InvocationTargetException unused2) {
                C5239Kb.Companion.KWHzl().KWHzl("Google Play Services not available for advertising id");
            } catch (java.lang.Exception unused3) {
                C5239Kb.Companion.KWHzl().EZpvd("Encountered an error connecting to Google Play Services for advertising id");
            }
            return this.KWHzl;
        }

        public final boolean OLrzqt() {
            try {
                java.lang.Object objInvoke = java.lang.Class.forName("com.google.android.gms.common.GooglePlayServicesUtil").getMethod("isGooglePlayServicesAvailable", android.content.Context.class).invoke(null, JY.this.OLrzqt);
                java.lang.Integer num = objInvoke instanceof java.lang.Integer ? (java.lang.Integer) objInvoke : null;
                if (num != null) {
                    return num.intValue() == 0;
                }
                return false;
            } catch (java.lang.ClassNotFoundException unused) {
                C5239Kb.Companion.KWHzl().KWHzl("Google Play Services Util not found!");
                return false;
            } catch (java.lang.IllegalAccessException unused2) {
                C5239Kb.Companion.KWHzl().KWHzl("Google Play Services not available");
                return false;
            } catch (java.lang.NoClassDefFoundError unused3) {
                C5239Kb.Companion.KWHzl().KWHzl("Google Play Services Util not found!");
                return false;
            } catch (java.lang.NoSuchMethodException unused4) {
                C5239Kb.Companion.KWHzl().KWHzl("Google Play Services not available");
                return false;
            } catch (InvocationTargetException unused5) {
                C5239Kb.Companion.KWHzl().KWHzl("Google Play Services not available");
                return false;
            } catch (java.lang.Exception e) {
                C5239Kb.Companion.KWHzl().KWHzl("Error when checking for Google Play Services: " + e);
                return false;
            }
        }
    }

    public final boolean AuCTel() {
        Activity activityOLrzqt = OLrzqt();
        Intrinsics.copydefault(activityOLrzqt);
        return activityOLrzqt.iwGUEr();
    }

    public final java.lang.String fetchVPNInfo() {
        Activity activityOLrzqt = OLrzqt();
        Intrinsics.copydefault(activityOLrzqt);
        return activityOLrzqt.AuCTelauCTel();
    }

    public final java.lang.String values() {
        Activity activityOLrzqt = OLrzqt();
        Intrinsics.copydefault(activityOLrzqt);
        return activityOLrzqt.zLjUOn();
    }

    public final java.lang.String AkhnZx() {
        Activity activityOLrzqt = OLrzqt();
        Intrinsics.copydefault(activityOLrzqt);
        return activityOLrzqt.wlaJM();
    }

    public final java.lang.String copydefault() {
        Activity activityOLrzqt = OLrzqt();
        Intrinsics.copydefault(activityOLrzqt);
        return activityOLrzqt.DbNXlk();
    }

    public final java.lang.String djBIcL() {
        Activity activityOLrzqt = OLrzqt();
        Intrinsics.copydefault(activityOLrzqt);
        return activityOLrzqt.uzCIH();
    }

    public final java.lang.String valueOf() {
        Activity activityOLrzqt = OLrzqt();
        Intrinsics.copydefault(activityOLrzqt);
        return activityOLrzqt.AubY();
    }

    public final java.lang.String KWHzl() {
        Activity activityOLrzqt = OLrzqt();
        Intrinsics.copydefault(activityOLrzqt);
        return activityOLrzqt.fetchVPNInfo();
    }

    public final java.lang.String AYXKKw() {
        Activity activityOLrzqt = OLrzqt();
        Intrinsics.copydefault(activityOLrzqt);
        return activityOLrzqt.fIwbmz();
    }

    public final java.lang.String AhwBna() {
        Activity activityOLrzqt = OLrzqt();
        Intrinsics.copydefault(activityOLrzqt);
        return activityOLrzqt.getFieldNames();
    }

    public final java.lang.String EZpvd() {
        Activity activityOLrzqt = OLrzqt();
        Intrinsics.copydefault(activityOLrzqt);
        return activityOLrzqt.values();
    }

    public final java.lang.String AEQbTJ() {
        Activity activityOLrzqt = OLrzqt();
        Intrinsics.copydefault(activityOLrzqt);
        return activityOLrzqt.AkhnZx();
    }

    public final Location isConnected() {
        java.util.List<java.lang.String> providers;
        Location lastKnownLocation;
        Location location = null;
        if (!this.EZpvd) {
            return null;
        }
        if (ContextCompat.checkSelfPermission(this.OLrzqt, "android.permission.ACCESS_COARSE_LOCATION") != 0 && ContextCompat.checkSelfPermission(this.OLrzqt, "android.permission.ACCESS_FINE_LOCATION") != 0) {
            return null;
        }
        java.lang.Object systemService = this.OLrzqt.getSystemService("location");
        LocationManager locationManager = systemService instanceof LocationManager ? (LocationManager) systemService : null;
        if (locationManager == null) {
            return null;
        }
        try {
            providers = locationManager.getProviders(true);
        } catch (java.lang.SecurityException | java.lang.Exception unused) {
            providers = null;
        }
        if (providers == null) {
            return null;
        }
        java.util.ArrayList<Location> arrayList = new java.util.ArrayList();
        for (java.lang.String str : providers) {
            try {
                Intrinsics.copydefault((java.lang.Object) str);
                lastKnownLocation = locationManager.getLastKnownLocation(str);
            } catch (java.lang.SecurityException unused2) {
                C5239Kb.Companion.KWHzl().KWHzl("Failed to get most recent location");
                lastKnownLocation = null;
            } catch (java.lang.Exception unused3) {
                C5239Kb.Companion.KWHzl().KWHzl("Failed to get most recent location");
                lastKnownLocation = null;
            }
            if (lastKnownLocation != null) {
                arrayList.add(lastKnownLocation);
            }
        }
        long time = -1;
        for (Location location2 : arrayList) {
            if (location2.getTime() > time) {
                time = location2.getTime();
                location = location2;
            }
        }
        return location;
    }

    public final Geocoder gEmmrt() {
        return new Geocoder(this.OLrzqt, java.util.Locale.ENGLISH);
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.JY.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final java.lang.String EZpvd() {
            java.lang.String string = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(string, "");
            return string;
        }
    }
}
