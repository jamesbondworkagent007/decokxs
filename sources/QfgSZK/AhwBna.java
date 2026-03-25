package QfgSZK;

import com.engagelab.privates.push.constants.MTPushConstants;
import com.ibm.icu.text.DateFormat;
import com.okinc.business.defi.biz.core.error.WalletImportError;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
final class AhwBna {
    public static final AhwBna ADVERTISING_ID;
    public static final AhwBna AGENT_APP_INFO;
    public static final AhwBna AGENT_BRAND;
    public static final AhwBna AGENT_CONF_OS;
    public static final AhwBna AGENT_DEVICE;
    public static final AhwBna AGENT_LANGUAGE;
    public static final AhwBna AGENT_LOCALE;
    public static final AhwBna AGENT_MODEL;
    public static final AhwBna AGENT_OS;
    public static final AhwBna AGENT_OS_VERSION;
    public static final AhwBna AGENT_PARENT_PID;
    public static final AhwBna AGENT_PROCESS_ID;
    public static final AhwBna AGENT_SECURITY_PATCH_LEVEL;
    public static final AhwBna AGENT_TYPE;
    public static final AhwBna AGENT_VERSION;
    public static final AhwBna APP_HASHES;
    public static final AhwBna APP_INSTALLATION_TIME;
    public static final AhwBna APP_MODIFICATION_TIME;
    public static final AhwBna APP_SELF_HASH_MD5;
    public static final AhwBna APP_SELF_HASH_SHA256;
    public static final AhwBna CONNECTIONS_INFO;
    public static final AhwBna CPU_NAME;
    public static final AhwBna CPU_SPEED;
    public static final AhwBna CRASH_LOG_STRING;
    public static int Cb_ = 0;
    public static final AhwBna DEVICE_BATTERY_STATUS;
    public static final AhwBna DEVICE_BOOT_TIME;
    public static final AhwBna DEVICE_CAMERA_DESCRIPTION;
    public static final AhwBna DEVICE_DEV_ENABLED_STATUS;
    public static final AhwBna DEVICE_DISPLAY_HEIGHT_IN_PIXEL;
    public static final AhwBna DEVICE_DISPLAY_NATIVE_BOUND_X;
    public static final AhwBna DEVICE_DISPLAY_NATIVE_BOUND_Y;
    public static final AhwBna DEVICE_DISPLAY_RESOLUTION;
    public static final AhwBna DEVICE_DISPLAY_WIDTH_IN_PIXEL;
    public static final AhwBna DEVICE_DISPLAY_XDPI;
    public static final AhwBna DEVICE_DISPLAY_YDPI;
    public static final AhwBna DEVICE_ENCRYPTION_STATUS;
    public static final AhwBna DEVICE_FINGERPRINT;
    public static final AhwBna DEVICE_FLASH_COOKIE;
    public static final AhwBna DEVICE_FONT_COUNT;
    public static final AhwBna DEVICE_FONT_HASH;
    public static final AhwBna DEVICE_FREE_SPACE;
    public static final AhwBna DEVICE_LOCAL_STORAGE_COOKIE;
    public static final AhwBna DEVICE_NAME;
    public static final AhwBna DEVICE_SOFTWARE_ID;
    public static final AhwBna DEVICE_STATE;
    public static final AhwBna DEVICE_TOTAL_SPACE;
    public static final AhwBna DEVICE_VERSION_BRAND;
    public static final AhwBna DRM_ID;
    public static final AhwBna EM_PATH_COUNT;
    public static final AhwBna EM_PATH_STR;
    public static int E__ = 9162;
    public static final AhwBna FIREBASE_PUSH_TOKEN;
    public static final AhwBna IN_CALL_STATUS;
    public static final AhwBna IN_CALL_TYPE;
    public static final AhwBna LOCATION_ACCURACY;
    public static final AhwBna LOCATION_ALTITUDE;
    public static final AhwBna LOCATION_LATITUDE;
    public static final AhwBna LOCATION_LONGITUDE;
    public static final AhwBna LOCATION_MOCK_STATUS;
    public static final AhwBna LOCATION_VERTICAL_ACCURACY;
    public static final AhwBna MALICIOUS_APP_STATUS;
    public static final AhwBna MEM_TOTAL;
    public static final AhwBna NETWORK_INFO_BSSID;
    public static final AhwBna NETWORK_INFO_IPV4;
    public static final AhwBna NETWORK_INFO_IPV6;
    public static final AhwBna NETWORK_INFO_MAC;
    public static final AhwBna NETWORK_INFO_RSSI;
    public static final AhwBna NETWORK_INFO_SECURITY_TYPE;
    public static final AhwBna NETWORK_INFO_SSID;
    public static final AhwBna NETWORK_INFO_SSID_HASH;
    public static final AhwBna NETWORK_INFO_TYPE;
    public static final AhwBna NETWORK_INFO_VPN;
    public static final AhwBna NETWORK_INFO_WFS;
    public static final AhwBna NUM_OF_CPU_CORES;
    public static final AhwBna PLUGIN_PATH_STR;
    public static final AhwBna RAT_DETECTION_INFO;
    public static final AhwBna REGISTERED_EXCEPTION;
    public static final AhwBna ROOT_DETECTION_PATH_COUNT;
    public static final AhwBna ROOT_DETECTION_PATH_STR;
    public static final AhwBna SELF_HASH_AUTH_MODULE;
    public static final AhwBna SELF_HASH_BASE_MODULE;
    public static final AhwBna SELF_HASH_DSH_MODULE;
    public static final AhwBna SELINUX_MODE;
    public static final AhwBna SHARED_LIB_INFO;
    public static final AhwBna STORAGE_EMULATED_TIMESTAMP;
    public static final AhwBna STRONG_AUTH_STATUS;
    public static final AhwBna STRONG_ID_DATE;
    public static final AhwBna STRONG_ID_KEY;
    public static final AhwBna STRONG_ID_RANDOM;
    public static final AhwBna STRONG_ID_SIGNATURE;
    public static final AhwBna STRONG_ID_TYPE;
    public static final AhwBna SUBSCRIBER_CELL_ID;
    public static final AhwBna SUBSCRIBER_CELL_INFO;
    public static final AhwBna SYSTEM_PROXY;
    public static final AhwBna TAMPER_CODE_AUTH_MODULE;
    public static final AhwBna TAMPER_CODE_BASE_MODULE;
    public static final AhwBna TAMPER_CODE_BB_MODULE;
    public static final AhwBna TAMPER_CODE_DSH_MODULE;
    public static final AhwBna TAMPER_CODE_SENSOR_MODULE;
    public static final AhwBna TIMEZONE_DST_DIFF;
    public static final AhwBna TIMEZONE_GMT_OFFSET;
    public static final AhwBna TIMEZONE_NAME;
    public static final AhwBna USER_PERMISSIONS;
    private static final /* synthetic */ AhwBna[] gkhjaB;
    private final String ikCdHO;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    static {
        GCXiNH.Cwg = MTPushConstants.RemoteWhat.TAG_UPDATE;
        GCXiNH.OHr = 2270;
        Cb_ = 4021;
        AGENT_LOCALE = new AhwBna(GCXiNH.fsw("\\V~B\u007fnMQOinf"), 0, GCXiNH.fsw("|}T"));
        APP_HASHES = new AhwBna(GCXiNH.fsw("\\AkScpRVI{"), 1, GCXiNH.fsw("ty"));
        TIMEZONE_GMT_OFFSET = new AhwBna(GCXiNH.fsw("IXvIq~O[Soowufnaep`"), 2, "c");
        TIMEZONE_DST_DIFF = new AhwBna(GCXiNH.fsw("IXvIq~O[Slqwumaap"), 3, DateFormat.ABBR_SPECIFIC_TZ);
        TIMEZONE_NAME = new AhwBna(GCXiNH.fsw("IXvIq~O[Sfcno"), 4, GCXiNH.fsw("ik_"));
        DEVICE_NAME = new AhwBna(GCXiNH.fsw("YTmEht^PMeg"), 5, GCXiNH.fsw("spVi"));
        DEVICE_LOCAL_STORAGE_COOKIE = new AhwBna(GCXiNH.fsw("YTmEht^RCkcouz|hdtsvmr\u007f`uty"), 6, GCXiNH.fsw("qb"));
        DEVICE_FLASH_COOKIE = new AhwBna(GCXiNH.fsw("YTmEht^X@iqkujgh}|q"), 7, GCXiNH.fsw("{v"));
        DEVICE_SOFTWARE_ID = new AhwBna(GCXiNH.fsw("YTmEht^MCnvtk{mx\u007fq"), 8, GCXiNH.fsw("nfRh"));
        DEVICE_DISPLAY_RESOLUTION = new AhwBna(GCXiNH.fsw("YTmEht^ZE{rokpwusf{\u007fgey`p"), 9, "f");
        DEVICE_DISPLAY_WIDTH_IN_PIXEL = new AhwBna(GCXiNH.fsw("YTmEht^ZE{rokpwp\u007fq`{mx~pntd~v"), 10, GCXiNH.fsw("\u007fyH\u007f\\Ay"));
        DEVICE_DISPLAY_HEIGHT_IN_PIXEL = new AhwBna(GCXiNH.fsw("YTmEht^ZE{rokpwos|s{fnyaamuc\u007fu"), 11, GCXiNH.fsw("\u007fyH\u007fCAy"));
        DEVICE_DISPLAY_XDPI = new AhwBna(GCXiNH.fsw("YTmEht^ZE{rokpw\u007fre}"), 12, GCXiNH.fsw("\u007fyHtOAh"));
        DEVICE_DISPLAY_YDPI = new AhwBna(GCXiNH.fsw("YTmEht^ZE{rokpw~re}"), 13, GCXiNH.fsw("\u007fyHuOAh"));
        DEVICE_DISPLAY_NATIVE_BOUND_X = new AhwBna(GCXiNH.fsw("YTmEht^ZE{rokpwiwa}ewnr`ksxdb"), 14, GCXiNH.fsw("\u007fyH\u007fESy"));
        DEVICE_DISPLAY_NATIVE_BOUND_Y = new AhwBna(GCXiNH.fsw("YTmEht^ZE{rokpwiwa}ewnr`ksxdc"), 15, GCXiNH.fsw("\u007fyH\u007fESx"));
        DEVICE_CAMERA_DESCRIPTION = new AhwBna(GCXiNH.fsw("YTmEht^]Megqkvlbevfzbey`p"), 16, GCXiNH.fsw("~pVhNBb"));
        DEVICE_FINGERPRINT = new AhwBna(GCXiNH.fsw("YTmEht^XEfefxyznxa"), 17, GCXiNH.fsw("pu]"));
        APP_SELF_HASH_MD5 = new AhwBna(GCXiNH.fsw("\\AkSxtMXS`cpbvec\u0003"), 18, GCXiNH.fsw("|y"));
        APP_SELF_HASH_SHA256 = new AhwBna(GCXiNH.fsw("\\AkSxtMXS`cpbv{ow\u0007\u0001\u0005"), 19, GCXiNH.fsw("|y\t"));
        SELF_HASH_BASE_MODULE = new AhwBna(GCXiNH.fsw("NTwJty@MDw`bylwjyqa\u007fw"), 20, GCXiNH.fsw("npS"));
        SELF_HASH_DSH_MODULE = new AhwBna(GCXiNH.fsw("NTwJty@MDwfpbvehr`xv"), 21, GCXiNH.fsw("puZd"));
        SELF_HASH_AUTH_MODULE = new AhwBna(GCXiNH.fsw("NTwJty@MDwcv~awjyqa\u007fw"), 22, GCXiNH.fsw("|dZd"));
        DEVICE_FONT_COUNT = new AhwBna(GCXiNH.fsw("YTmEht^XCfv|if}ib"), 23, GCXiNH.fsw("{eHb"));
        DEVICE_FONT_HASH = new AhwBna(GCXiNH.fsw("YTmEht^XCfv|bh{o"), 24, GCXiNH.fsw("{eH"));
        DEVICE_BOOT_TIME = new AhwBna(GCXiNH.fsw("YTmEht^\\Cgv|~`eb"), 25, GCXiNH.fsw("|sO"));
        AGENT_APP_INFO = new AhwBna(GCXiNH.fsw("\\V~B\u007fn@N\\wkmlf"), 26, GCXiNH.fsw("|\u007fM"));
        DEVICE_FREE_SPACE = new AhwBna(GCXiNH.fsw("YTmEht^X^mg|yyids"), 27, GCXiNH.fsw("|wH"));
        DEVICE_TOTAL_SPACE = new AhwBna(GCXiNH.fsw("YTmEht^JC|couzxfup"), 28, GCXiNH.fsw("|eH"));
        DEVICE_STATE = new AhwBna(GCXiNH.fsw("YTmEht^MXivf"), 29, GCXiNH.fsw("puH"));
        NETWORK_INFO_BSSID = new AhwBna(GCXiNH.fsw("STo[dcJAEfdluk{t\u007fq"), 30, GCXiNH.fsw("jsH"));
        NETWORK_INFO_SSID_HASH = new AhwBna(GCXiNH.fsw("STo[dcJAEfdluz{nrj|ray"), 31, GCXiNH.fsw("jbH"));
        NETWORK_INFO_SSID = new AhwBna(GCXiNH.fsw("STo[dcJAEfdluz{nr"), 32, GCXiNH.fsw("jbHo"));
        NETWORK_INFO_RSSI = new AhwBna(GCXiNH.fsw("STo[dcJAEfdlu{{t\u007f"), 33, GCXiNH.fsw("jcI"));
        NETWORK_INFO_TYPE = new AhwBna(GCXiNH.fsw("STo[dcJAEfdlu}qws"), 34, GCXiNH.fsw("jr"));
        NETWORK_INFO_IPV4 = new AhwBna(GCXiNH.fsw("STo[dcJAEfdlu`xq\u0002"), 35, GCXiNH.fsw("taM8"));
        NETWORK_INFO_IPV6 = new AhwBna(GCXiNH.fsw("STo[dcJAEfdlu`xq\u0000"), 36, GCXiNH.fsw("taM:"));
        NETWORK_INFO_MAC = new AhwBna(GCXiNH.fsw("STo[dcJAEfdludid"), 37, GCXiNH.fsw("ppX"));
        NETWORK_INFO_WFS = new AhwBna(GCXiNH.fsw("STo[dcJAEfdlu~nt"), 38, GCXiNH.fsw("jwH"));
        NETWORK_INFO_VPN = new AhwBna(GCXiNH.fsw("STo[dcJAEfdlu\u007fxi"), 39, GCXiNH.fsw("kaU"));
        NETWORK_INFO_SECURITY_TYPE = new AhwBna(GCXiNH.fsw("STo[dcJAEfdluzmdcg}gkndvnx"), 40, GCXiNH.fsw("jbO"));
        SUBSCRIBER_CELL_INFO = new AhwBna(GCXiNH.fsw("NDy_hcH\\Iz}`oedx\u007f{r|"), 41, GCXiNH.fsw("|bR"));
        SUBSCRIBER_CELL_ID = new AhwBna(GCXiNH.fsw("NDy_hcH\\Iz}`oedx\u007fq"), 42, GCXiNH.fsw("|rR"));
        ADVERTISING_ID = new AhwBna(GCXiNH.fsw("\\UmIyeHMEfe|cm"), 43, GCXiNH.fsw("|uRh"));
        SELINUX_MODE = new AhwBna(GCXiNH.fsw("NTwEedYAAgff"), 44, GCXiNH.fsw("nt"));
        SHARED_LIB_INFO = new AhwBna(GCXiNH.fsw("NYz^nu^REj}jdog"), 45, GCXiNH.fsw("ptC>"));
        CONNECTIONS_INFO = new AhwBna(GCXiNH.fsw("^^uBnrUWCfq|cgnh"), 46, GCXiNH.fsw("srR"));
        APP_INSTALLATION_TIME = new AhwBna(GCXiNH.fsw("\\AkSb\u007fRJMdnb~`giia}~w"), 47, GCXiNH.fsw("|aRx"));
        APP_MODIFICATION_TIME = new AhwBna(GCXiNH.fsw("\\AkSf~EWJaab~`giia}~w"), 48, GCXiNH.fsw("||O"));
        SYSTEM_PROXY = new AhwBna(GCXiNH.fsw("NHhXn|^N^gzz"), 49, GCXiNH.fsw("naC"));
        NUM_OF_CPU_CORES = new AhwBna(GCXiNH.fsw("SDvSdw^]\\}}`e{mt"), 50, GCXiNH.fsw("syX"));
        CPU_NAME = new AhwBna(GCXiNH.fsw("^AnSepL["), 51, GCXiNH.fsw("~aU"));
        CPU_SPEED = new AhwBna(GCXiNH.fsw("^AnSxaD[H"), 52, GCXiNH.fsw("~aH"));
        MEM_TOTAL = new AhwBna(GCXiNH.fsw("PTvS\u007f~U_@"), 53, GCXiNH.fsw("peT"));
        MALICIOUS_APP_STATUS = new AhwBna(GCXiNH.fsw("PPwEhxNK_wcszv{swaa`"), 54, GCXiNH.fsw("p}Z|["));
        AGENT_OS_VERSION = new AhwBna(GCXiNH.fsw("\\V~B\u007fnNMS~gqy`gi"), 55, GCXiNH.fsw("|~M"));
        AGENT_SECURITY_PATCH_LEVEL = new AhwBna(GCXiNH.fsw("\\V~B\u007fnR[O}pj~pwwwaw{m}uy{q"), 56, GCXiNH.fsw("|bK`"));
        AGENT_LANGUAGE = new AhwBna(GCXiNH.fsw("\\V~B\u007fnM_Bowbml"), 57, GCXiNH.fsw("|}"));
        AGENT_BRAND = new AhwBna(GCXiNH.fsw("\\V~B\u007fnCLMff"), 58, GCXiNH.fsw("|s"));
        AGENT_DEVICE = new AhwBna(GCXiNH.fsw("\\V~B\u007fnE[Zaaf"), 59, GCXiNH.fsw("|u"));
        AGENT_MODEL = new AhwBna(GCXiNH.fsw("\\V~B\u007fnLQHmn"), 60, GCXiNH.fsw("||"));
        AGENT_OS = new AhwBna(GCXiNH.fsw("\\V~B\u007fnNM"), 61, GCXiNH.fsw("|~H"));
        AGENT_CONF_OS = new AhwBna(GCXiNH.fsw("\\V~B\u007fnBQBn}ly"), 62, GCXiNH.fsw("~~H"));
        AGENT_TYPE = new AhwBna(GCXiNH.fsw("\\V~B\u007fnUG\\m"), 63, GCXiNH.fsw("|e"));
        AGENT_VERSION = new AhwBna(GCXiNH.fsw("\\V~B\u007fnW[^{kld"), 64, GCXiNH.fsw("|g"));
        AGENT_PROCESS_ID = new AhwBna(GCXiNH.fsw("\\V~B\u007fnQLCkgpyvac"), 65, GCXiNH.fsw("mx_"));
        AGENT_PARENT_PID = new AhwBna(GCXiNH.fsw("\\V~B\u007fnQ_^mlwuyac"), 66, GCXiNH.fsw("maRh"));
        DEVICE_BATTERY_STATUS = new AhwBna(GCXiNH.fsw("YTmEht^\\M|vfxpwtbt`fa"), 67, GCXiNH.fsw("\u007feHx"));
        DEVICE_VERSION_BRAND = new AhwBna(GCXiNH.fsw("YTmEht^HIzqjegwedtzw"), 68, GCXiNH.fsw("\u007fyHhF^"));
        DEVICE_ENCRYPTION_STATUS = new AhwBna(GCXiNH.fsw("YTmEht^[Bkpzz}ahxjggsee|"), 69, GCXiNH.fsw("ptC:"));
        DEVICE_DEV_ENABLED_STATUS = new AhwBna(GCXiNH.fsw("YTmEht^ZI~}fdhjksqk`fpdzm"), 70, GCXiNH.fsw("y|"));
        TAMPER_CODE_BASE_MODULE = new AhwBna(GCXiNH.fsw("IPv\\nc^]Clg|hh{bix{wg}u"), 71, GCXiNH.fsw("mcHx"));
        TAMPER_CODE_AUTH_MODULE = new AhwBna(GCXiNH.fsw("IPv\\nc^]Clg|k||oix{wg}u"), 72, GCXiNH.fsw("|dOa"));
        TAMPER_CODE_BB_MODULE = new AhwBna(GCXiNH.fsw("IPv\\nc^]Clg|hkwjyqa\u007fw"), 73, GCXiNH.fsw("\u007fsOa"));
        TAMPER_CODE_DSH_MODULE = new AhwBna(GCXiNH.fsw("IPv\\nc^]Clg|nz`x{zpf~t"), 74, GCXiNH.fsw("puOa"));
        TAMPER_CODE_SENSOR_MODULE = new AhwBna(GCXiNH.fsw("IPv\\nc^]Clg|ylftygk~}uec{"), 75, GCXiNH.fsw("n\u007fOa"));
        EM_PATH_COUNT = new AhwBna(GCXiNH.fsw("X\\d\\jeIAOgwm~"), 76, GCXiNH.fsw("pc"));
        EM_PATH_STR = new AhwBna(GCXiNH.fsw("X\\d\\jeIA_|p"), 77, GCXiNH.fsw("pcI"));
        PLUGIN_PATH_STR = new AhwBna(GCXiNH.fsw("M]nKb\u007f^NM|j|y}z"), 78, GCXiNH.fsw("m}_iH\u0000"));
        LOCATION_LATITUDE = new AhwBna(GCXiNH.fsw("Q^xM\u007fxNPSdcwc}}cs"), 79, GCXiNH.fsw("iuWm_"));
        LOCATION_LONGITUDE = new AhwBna(GCXiNH.fsw("Q^xM\u007fxNPSdmmm`|rrp"), 80, GCXiNH.fsw("iuWcE"));
        LOCATION_ALTITUDE = new AhwBna(GCXiNH.fsw("Q^xM\u007fxNPSinwc}}cs"), 81, GCXiNH.fsw("iuWmGE"));
        LOCATION_ACCURACY = new AhwBna(GCXiNH.fsw("Q^xM\u007fxNPSia`\u007f{ido"), 82, GCXiNH.fsw("iuWmHR"));
        LOCATION_VERTICAL_ACCURACY = new AhwBna(GCXiNH.fsw("Q^xM\u007fxNPS~gq~`kfzjupqdbn}d"), 83, GCXiNH.fsw("iuWzJRb"));
        LOCATION_MOCK_STATUS = new AhwBna(GCXiNH.fsw("Q^xM\u007fxNPSem`av{swaa`"), 84, GCXiNH.fsw("p}Hx"));
        ROOT_DETECTION_PATH_COUNT = new AhwBna(GCXiNH.fsw("O^tXtuDJIkvjegwwwa|lq~eaj"), 85, GCXiNH.fsw("zc"));
        ROOT_DETECTION_PATH_STR = new AhwBna(GCXiNH.fsw("O^tXtuDJIkvjegwwwa|laeb"), 86, GCXiNH.fsw("zcI"));
        RAT_DETECTION_INFO = new AhwBna(GCXiNH.fsw("OPoSotU[O|kldvaipz"), 87, GCXiNH.fsw("ouR"));
        FIREBASE_PUSH_TOKEN = new AhwBna(GCXiNH.fsw("[XiIipR[Sxwpbv|h}pz"), 88, GCXiNH.fsw("npd|_"));
        IN_CALL_STATUS = new AhwBna(GCXiNH.fsw("T_dOj}MA_|cw\u007fz"), 89, GCXiNH.fsw("trH"));
        IN_CALL_TYPE = new AhwBna(GCXiNH.fsw("T_dOj}MAXqrf"), 90, GCXiNH.fsw("trO"));
        STRONG_ID_SIGNATURE = new AhwBna(GCXiNH.fsw("NEiCev^WHwqjmgiscgq"), 91, GCXiNH.fsw("nx_SXXf"));
        STRONG_ID_RANDOM = new AhwBna(GCXiNH.fsw("NEiCev^WHwpbdmgj"), 92, GCXiNH.fsw("nx_SY_e"));
        STRONG_ID_TYPE = new AhwBna(GCXiNH.fsw("NEiCev^WHwvzzl"), 93, GCXiNH.fsw("nx_S_Hq{"));
        STRONG_ID_DATE = new AhwBna(GCXiNH.fsw("NEiCev^WHwfb~l"), 94, GCXiNH.fsw("nx_SOPu{"));
        STRONG_ID_KEY = new AhwBna(GCXiNH.fsw("NEiCev^WHwifs"), 95, GCXiNH.fsw("nx_S@Tx"));
        STRONG_AUTH_STATUS = new AhwBna(GCXiNH.fsw("NEiCev^_Y|j|y}iscf"), 96, GCXiNH.fsw("npd\u007f_"));
        CRASH_LOG_STRING = new AhwBna(GCXiNH.fsw("^Cz_cnMQKwqwx`f`"), 97, GCXiNH.fsw("~cHd"));
        USER_PERMISSIONS = new AhwBna(GCXiNH.fsw("HB~^taDLAaqpcfft"), 98, GCXiNH.fsw("haW"));
        STORAGE_EMULATED_TIMESTAMP = new AhwBna(GCXiNH.fsw("NEt^jvDAIewok}mcia}~wbdnsm"), 99, GCXiNH.fsw("|xO"));
        DRM_ID = new AhwBna(GCXiNH.fsw("YCvSbu"), 100, GCXiNH.fsw("ycV"));
        REGISTERED_EXCEPTION = new AhwBna(GCXiNH.fsw("OT|ExeDLIl}frjmwb|{}"), 101, GCXiNH.fsw("xiHxY"));
        gkhjaB = gEmmrt();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private AhwBna(String str, int i, String str2) {
        this.ikCdHO = str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Duplicate block (B:40:0x0253) to fix multi-entry loop: BACK_EDGE: B:40:0x0253 -> B:41:0x0255 */
    private static /* synthetic */ AhwBna[] gEmmrt() {
        int i;
        AhwBna[] ahwBnaArr = new AhwBna[102];
        ahwBnaArr[0] = AGENT_LOCALE;
        ahwBnaArr[1] = APP_HASHES;
        ahwBnaArr[2] = TIMEZONE_GMT_OFFSET;
        ahwBnaArr[3] = TIMEZONE_DST_DIFF;
        ahwBnaArr[4] = TIMEZONE_NAME;
        ahwBnaArr[5] = DEVICE_NAME;
        ahwBnaArr[6] = DEVICE_LOCAL_STORAGE_COOKIE;
        ahwBnaArr[7] = DEVICE_FLASH_COOKIE;
        ahwBnaArr[8] = DEVICE_SOFTWARE_ID;
        ahwBnaArr[9] = DEVICE_DISPLAY_RESOLUTION;
        ahwBnaArr[10] = DEVICE_DISPLAY_WIDTH_IN_PIXEL;
        ahwBnaArr[11] = DEVICE_DISPLAY_HEIGHT_IN_PIXEL;
        ahwBnaArr[12] = DEVICE_DISPLAY_XDPI;
        ahwBnaArr[13] = DEVICE_DISPLAY_YDPI;
        ahwBnaArr[14] = DEVICE_DISPLAY_NATIVE_BOUND_X;
        ahwBnaArr[15] = DEVICE_DISPLAY_NATIVE_BOUND_Y;
        ahwBnaArr[16] = DEVICE_CAMERA_DESCRIPTION;
        ahwBnaArr[17] = DEVICE_FINGERPRINT;
        ahwBnaArr[18] = APP_SELF_HASH_MD5;
        ahwBnaArr[19] = APP_SELF_HASH_SHA256;
        ahwBnaArr[20] = SELF_HASH_BASE_MODULE;
        ahwBnaArr[21] = SELF_HASH_DSH_MODULE;
        ahwBnaArr[22] = SELF_HASH_AUTH_MODULE;
        ahwBnaArr[23] = DEVICE_FONT_COUNT;
        ahwBnaArr[24] = DEVICE_FONT_HASH;
        ahwBnaArr[25] = DEVICE_BOOT_TIME;
        ahwBnaArr[26] = AGENT_APP_INFO;
        ahwBnaArr[27] = DEVICE_FREE_SPACE;
        ahwBnaArr[28] = DEVICE_TOTAL_SPACE;
        ahwBnaArr[29] = DEVICE_STATE;
        ahwBnaArr[30] = NETWORK_INFO_BSSID;
        ahwBnaArr[31] = NETWORK_INFO_SSID_HASH;
        ahwBnaArr[32] = NETWORK_INFO_SSID;
        ahwBnaArr[33] = NETWORK_INFO_RSSI;
        ahwBnaArr[34] = NETWORK_INFO_TYPE;
        ahwBnaArr[35] = NETWORK_INFO_IPV4;
        ahwBnaArr[36] = NETWORK_INFO_IPV6;
        ahwBnaArr[37] = NETWORK_INFO_MAC;
        ahwBnaArr[38] = NETWORK_INFO_WFS;
        ahwBnaArr[39] = NETWORK_INFO_VPN;
        ahwBnaArr[40] = NETWORK_INFO_SECURITY_TYPE;
        ahwBnaArr[41] = SUBSCRIBER_CELL_INFO;
        ahwBnaArr[42] = SUBSCRIBER_CELL_ID;
        ahwBnaArr[43] = ADVERTISING_ID;
        ahwBnaArr[44] = SELINUX_MODE;
        ahwBnaArr[45] = SHARED_LIB_INFO;
        ahwBnaArr[46] = CONNECTIONS_INFO;
        ahwBnaArr[47] = APP_INSTALLATION_TIME;
        ahwBnaArr[48] = APP_MODIFICATION_TIME;
        ahwBnaArr[49] = SYSTEM_PROXY;
        AhwBna ahwBna = NUM_OF_CPU_CORES;
        if ((E__ ^ 9162) != 0) {
            while (true) {
                int i2 = E__;
                int i3 = i2 + 39;
                if (i3 == 81) {
                    E__ = ((i2 + i2) >> 50) + i2;
                } else {
                    if (i3 == 192) {
                        E__ = (i2 >> 15) ^ 1487;
                        break;
                    }
                    if (i3 == 287) {
                        while (true) {
                            E__ = ((E__ ^ 3403) * 99) % 24;
                        }
                    } else if (i3 == 482) {
                        while (true) {
                            E__ = (E__ * 107) + i2;
                        }
                    }
                }
            }
        }
        ahwBnaArr[50] = ahwBna;
        ahwBnaArr[51] = CPU_NAME;
        ahwBnaArr[52] = CPU_SPEED;
        ahwBnaArr[53] = MEM_TOTAL;
        ahwBnaArr[54] = MALICIOUS_APP_STATUS;
        ahwBnaArr[55] = AGENT_OS_VERSION;
        ahwBnaArr[56] = AGENT_SECURITY_PATCH_LEVEL;
        ahwBnaArr[57] = AGENT_LANGUAGE;
        ahwBnaArr[58] = AGENT_BRAND;
        ahwBnaArr[59] = AGENT_DEVICE;
        ahwBnaArr[60] = AGENT_MODEL;
        ahwBnaArr[61] = AGENT_OS;
        ahwBnaArr[62] = AGENT_CONF_OS;
        AhwBna ahwBna2 = AGENT_TYPE;
        if ((E__ ^ 9162) != 0) {
            while (true) {
                int i4 = E__;
                int i5 = i4 + 65;
                if (i5 == 63) {
                    while (true) {
                        E__ = (E__ % 7) + i4;
                    }
                } else if (i5 != 191) {
                    if (i5 == 354) {
                        E__ = ((i4 * 71) % 99) * 14;
                        break;
                    }
                } else {
                    break;
                }
            }
            E__ = (E__ * 65) >> WalletImportError.ERROR_CODE_HARDWARE_ACCOUNT_EXIST;
        }
        ahwBnaArr[63] = ahwBna2;
        ahwBnaArr[64] = AGENT_VERSION;
        ahwBnaArr[65] = AGENT_PROCESS_ID;
        ahwBnaArr[66] = AGENT_PARENT_PID;
        ahwBnaArr[67] = DEVICE_BATTERY_STATUS;
        ahwBnaArr[68] = DEVICE_VERSION_BRAND;
        ahwBnaArr[69] = DEVICE_ENCRYPTION_STATUS;
        ahwBnaArr[70] = DEVICE_DEV_ENABLED_STATUS;
        ahwBnaArr[71] = TAMPER_CODE_BASE_MODULE;
        ahwBnaArr[72] = TAMPER_CODE_AUTH_MODULE;
        ahwBnaArr[73] = TAMPER_CODE_BB_MODULE;
        ahwBnaArr[74] = TAMPER_CODE_DSH_MODULE;
        ahwBnaArr[75] = TAMPER_CODE_SENSOR_MODULE;
        if (E__ > 9161) {
            ahwBnaArr[76] = EM_PATH_COUNT;
            ahwBnaArr[77] = EM_PATH_STR;
            ahwBnaArr[78] = PLUGIN_PATH_STR;
            ahwBnaArr[79] = LOCATION_LATITUDE;
            ahwBnaArr[80] = LOCATION_LONGITUDE;
            ahwBnaArr[81] = LOCATION_ALTITUDE;
            ahwBnaArr[82] = LOCATION_ACCURACY;
            ahwBnaArr[83] = LOCATION_VERTICAL_ACCURACY;
            ahwBnaArr[84] = LOCATION_MOCK_STATUS;
            ahwBnaArr[85] = ROOT_DETECTION_PATH_COUNT;
            ahwBnaArr[86] = ROOT_DETECTION_PATH_STR;
            ahwBnaArr[87] = RAT_DETECTION_INFO;
            ahwBnaArr[88] = FIREBASE_PUSH_TOKEN;
            ahwBnaArr[89] = IN_CALL_STATUS;
            ahwBnaArr[90] = IN_CALL_TYPE;
            ahwBnaArr[91] = STRONG_ID_SIGNATURE;
            ahwBnaArr[92] = STRONG_ID_RANDOM;
            ahwBnaArr[93] = STRONG_ID_TYPE;
            ahwBnaArr[94] = STRONG_ID_DATE;
            ahwBnaArr[95] = STRONG_ID_KEY;
            ahwBnaArr[96] = STRONG_AUTH_STATUS;
            ahwBnaArr[97] = CRASH_LOG_STRING;
            ahwBnaArr[98] = USER_PERMISSIONS;
            ahwBnaArr[99] = STORAGE_EMULATED_TIMESTAMP;
            ahwBnaArr[100] = DRM_ID;
            ahwBnaArr[101] = REGISTERED_EXCEPTION;
            return ahwBnaArr;
        }
        do {
            int i6 = E__;
            i = i6 + 26;
            if (i == 39) {
                E__ = ((i6 + i6) % 88) ^ 5351;
            } else if (i == 192) {
                while (true) {
                    E__ = (E__ * 41) + i6;
                }
            } else if (i != 272) {
            }
            while (true) {
                E__ = (E__ ^ 7919) * 70;
            }
        } while (i != 440);
        while (true) {
            E__ >>= 191;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static AhwBna valueOf(String str) {
        return (AhwBna) Enum.valueOf(AhwBna.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static AhwBna[] values() {
        return (AhwBna[]) gkhjaB.clone();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String DbNXlk() {
        return this.ikCdHO;
    }
}
