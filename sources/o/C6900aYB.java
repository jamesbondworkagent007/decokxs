package o;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: renamed from: o.aYB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C6900aYB implements InterfaceC6910aYL, java.lang.Cloneable {
    public static final int BATTERY_STATUS_CHARGING = 1;
    public static final int BATTERY_STATUS_FULL = 2;
    public static final int BATTERY_STATUS_NOT_CHARGING = 0;
    public static final java.util.Set<java.lang.String> sIgnoreKeys;

    @SerializedName("_af_id")
    public java.lang.String afId;

    @SerializedName("_amp_did")
    public java.lang.String ampDeviceId;

    @SerializedName("_battery_level")
    public int batteryLevel;

    @SerializedName("_battery_state")
    public int batteryState;

    @SerializedName("_broker_id")
    public java.lang.String brokerId;

    @SerializedName("_carrier")
    public java.lang.String carrier;

    @SerializedName("_data_finder_did")
    public java.lang.String dataFinderDeviceId;

    @SerializedName("_did")
    public java.lang.String deviceId;

    @SerializedName("_model")
    public java.lang.String deviceModel;

    @SerializedName("_gsm_sim_state")
    public java.lang.String gsmSimState;

    @SerializedName("_gsm_sim_state2")
    public java.lang.String gsmSimState2;

    @SerializedName("_init_svc_adbd")
    public java.lang.String initSvcADBD;

    @SerializedName("_is_debug_app")
    public boolean isDebugApp;

    @SerializedName("_is_debug_system")
    public boolean isDebugSystem;

    @SerializedName("_is_rooted")
    public boolean isRooted;

    @SerializedName("_mk")
    public java.lang.String manufacturer;

    @SerializedName("_net_type")
    public java.lang.String netType;

    @SerializedName("_okcoin_satoshi_mode")
    public java.lang.String okcoin_satoshi_mode;

    @SerializedName("_os_type")
    public java.lang.String osType;

    @SerializedName("_package_id")
    public java.lang.String packageId;

    @SerializedName("_ro_build_fingerprint")
    public java.lang.String roBuildFingerprint;

    @SerializedName("_screen_h")
    public int screenH;

    @SerializedName("_screen_w")
    public int screenW;

    @SerializedName("_system_boot_time")
    public java.lang.String systemBootTime;

    @SerializedName("_ts")
    public long timestamp;

    @SerializedName("_user_id")
    public java.lang.String userId;

    @SerializedName("_wifi_list")
    public java.util.ArrayList<java.lang.String> wifiList;

    static {
        java.util.HashSet hashSet = new java.util.HashSet();
        sIgnoreKeys = hashSet;
        hashSet.add("extensions");
        hashSet.add("_lan");
        hashSet.add("_broker_id");
        hashSet.add("_user_id");
        hashSet.add("_okcoin_satoshi_mode");
    }

    @Override // o.InterfaceC6910aYL
    public java.lang.String format() {
        java.lang.String string;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(C6946aYv.OLrzqt(this, sIgnoreKeys));
        int iLastIndexOf = sb.lastIndexOf("\r\n");
        if (iLastIndexOf >= 0) {
            sb = new java.lang.StringBuilder(sb.substring(0, iLastIndexOf));
        }
        try {
            string = C6924aYZ.AEQbTJ(sb.toString());
        } catch (java.lang.Exception e) {
            pUU.AEQbTJ("tag", e);
            string = null;
        }
        if (android.text.TextUtils.isEmpty(string)) {
            string = sb.toString();
        }
        return string + "\r\n";
    }

    public java.lang.String toString() {
        return "{carrier:" + this.carrier + ";deviceId:" + this.deviceId + ";ampDeviceId:" + this.ampDeviceId + ";dataFinderDeviceId:" + this.dataFinderDeviceId + ";deviceModel:" + this.deviceModel + ";netType:" + this.netType + ";osType:" + this.osType + ";osType:" + this.osType + ";screenH:" + this.screenH + ";screenW:" + this.screenW + ";timestamp:" + this.timestamp + ";userId:" + this.userId + ";afId:" + this.afId + ";packageId:" + this.packageId + ";brokerId:" + this.brokerId + ";batteryState:" + this.batteryState + ";batteryLevel:" + this.batteryLevel + ";isRooted:" + this.isRooted + ";isDebugSystem:" + this.isDebugSystem + ";isDebugApp:" + this.isDebugApp + ";initSvcADBD:" + this.initSvcADBD + ";gsmSimState:" + this.gsmSimState + ";gsmSimState2:" + this.gsmSimState2 + ";roBuildFingerprint:" + this.roBuildFingerprint + ";systemBootTime:" + this.systemBootTime + ";wifiList:" + this.wifiList + ";okcoin_satoshi_mode:" + this.okcoin_satoshi_mode + ";}";
    }

    public java.lang.Object clone() throws java.lang.CloneNotSupportedException {
        C6900aYB c6900aYB = (C6900aYB) super.clone();
        c6900aYB.carrier = this.carrier;
        c6900aYB.deviceId = this.deviceId;
        c6900aYB.ampDeviceId = this.ampDeviceId;
        c6900aYB.dataFinderDeviceId = this.dataFinderDeviceId;
        c6900aYB.deviceModel = this.deviceModel;
        c6900aYB.manufacturer = this.manufacturer;
        c6900aYB.netType = this.netType;
        c6900aYB.osType = this.osType;
        c6900aYB.screenH = this.screenH;
        c6900aYB.screenW = this.screenW;
        c6900aYB.timestamp = this.timestamp;
        c6900aYB.userId = this.userId;
        c6900aYB.afId = this.afId;
        c6900aYB.batteryState = this.batteryState;
        c6900aYB.batteryLevel = this.batteryLevel;
        c6900aYB.isRooted = this.isRooted;
        c6900aYB.isDebugSystem = this.isDebugSystem;
        c6900aYB.isDebugApp = this.isDebugApp;
        c6900aYB.initSvcADBD = this.initSvcADBD;
        c6900aYB.gsmSimState = this.gsmSimState;
        c6900aYB.gsmSimState2 = this.gsmSimState2;
        c6900aYB.roBuildFingerprint = this.roBuildFingerprint;
        c6900aYB.systemBootTime = this.systemBootTime;
        c6900aYB.wifiList = this.wifiList;
        c6900aYB.okcoin_satoshi_mode = this.okcoin_satoshi_mode;
        return c6900aYB;
    }
}
