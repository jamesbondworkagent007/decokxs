package o;

import com.alibaba.sdk.android.oss.common.OSSConstants;
import com.engagelab.privates.common.constants.MTCommonConstants;
import com.engagelab.privates.push.constants.MTPushConstants;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.zxing.client.result.ExpandedProductParsedResult;
import com.okinc.account.api.model.security.otp.OtpEventTracker;
import com.okinc.liveness.lca.EopTrackEvent;
import com.okinc.p2p.api.OtcExtraKeys;
import com.okinc.p2p.api.OtcRouteConst;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.spongycastle.jce.provider.BouncyCastleProvider;

/* JADX INFO: renamed from: o.acl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7064acl {
    public static final java.lang.String[] EZpvd = {"aa", "ab", "ace", "ach", "ada", "ady", "ae", "af", "afa", "afh", "agq", "ain", "ak", "akk", "ale", "alg", "alt", "am", "an", "ang", "anp", "apa", "ar", "arc", "arn", "arp", "ars", "art", "arw", "as", "asa", "ast", "ath", "aus", "av", "awa", "ay", "az", "ba", "bad", "bai", "bal", "ban", "bas", "bat", "bax", "bbj", "be", "bej", "bem", "ber", "bez", "bfd", "bg", "bh", "bho", "bi", "bik", "bin", "bkm", "bla", "bm", "bn", "bnt", "bo", TtmlNode.TAG_BR, "bra", "brx", "bs", "bss", "btk", "bua", "bug", "bum", "byn", "byv", "ca", "cad", "cai", "car", "cau", "cay", "cch", "ce", "ceb", "cel", "cgg", "ch", "chb", "chg", "chk", "chm", "chn", "cho", "chp", "chr", "chy", "ckb", "cmc", "co", "cop", "cpe", "cpf", "cpp", "cr", "crh", "crp", "cs", "csb", "cu", "cus", "cv", "cy", "da", "dak", "dar", "dav", MTPushConstants.NotificationTime.KEY_DAYS, "de", "del", "den", "dgr", "din", "dje", "doi", "dra", "dsb", "dua", "dum", "dv", "dyo", "dyu", "dz", "dzg", "ebu", "ee", "efi", "egy", "eka", "el", "elx", "en", "enm", "eo", "es", "et", "eu", "ewo", "fa", "fan", "fat", "ff", "fi", "fil", "fiu", "fj", "fo", "fon", "fr", "frm", "fro", "frr", "frs", "fur", "fy", "ga", "gaa", "gay", "gba", "gd", "gem", "gez", "gil", "gl", "gmh", "gn", "goh", "gon", "gor", "got", "grb", "grc", "gsw", "gu", "guz", "gv", "gwi", "ha", "hai", "haw", "he", "hi", "hil", "him", "hit", "hmn", "ho", "hr", "hsb", "ht", "hu", "hup", "hy", "hz", "ia", "iba", "ibb", "id", "ie", "ig", "ii", "ijo", "ik", "ilo", "inc", "ine", "inh", "io", "ira", "iro", "is", "it", "iu", "ja", "jbo", "jgo", "jmc", "jpr", "jrb", com.ibm.icu.text.DateFormat.HOUR_GENERIC_TZ, "ka", "kaa", "kab", "kac", "kaj", "kam", "kar", "kaw", "kbd", "kbl", "kcg", "kde", "kea", "kfo", "kg", "kha", "khi", "kho", "khq", "ki", "kj", "kk", "kkj", "kl", "kln", "km", "kmb", "kn", "ko", "kok", "kos", "kpe", "kr", "krc", "krl", "kro", "kru", "ks", "ksb", "ksf", "ksh", "ku", "kum", "kut", "kv", "kw", "ky", "la", "lad", "lag", "lah", "lam", "lb", "lez", "lg", "li", "lkt", "ln", "lo", "lol", "loz", "lt", "lu", "lua", "lui", "lun", "luo", "lus", "luy", "lv", "mad", "maf", "mag", "mai", "mak", "man", "map", "mas", "mde", "mdf", "mdr", "men", "mer", "mfe", "mg", "mga", "mgh", "mgo", "mh", "mi", "mic", "min", "mis", "mk", "mkh", "ml", "mn", "mnc", "mni", "mno", "mo", "moh", "mos", "mr", com.ibm.icu.text.DateFormat.MINUTE_SECOND, "mt", "mua", "mul", "mun", "mus", "mwl", "mwr", "my", "mye", "myn", "myv", "na", "nah", "nai", "nap", "naq", "nb", "nd", "nds", "ne", OtpEventTracker.OTP_EVENT_VALUE_NEW, "ng", "nia", "nic", "niu", "nl", "nmg", "nn", "nnh", "no", "nog", "non", "nqo", MTCommonConstants.Network.RADIO_5G, "nso", "nub", "nus", "nv", "nwc", "ny", "nym", "nyn", "nyo", "nzi", "oc", "oj", "om", "or", "os", "osa", "ota", "oto", "pa", "paa", "pag", "pal", "pam", "pap", "pau", "peo", "phi", "phn", "pi", "pl", "pon", "pra", "pro", "ps", "pt", "qu", "raj", "rap", "rar", "rm", "rn", "ro", "roa", "rof", "rom", "ru", "rup", "rw", "rwk", "sa", "sad", "sah", "sai", "sal", "sam", "saq", "sas", "sat", "sba", "sbp", "sc", "scn", "sco", "sd", "se", "see", "seh", "sel", "sem", "ses", "sg", "sga", "sgn", "shi", "shn", "shu", "si", "sid", "sio", "sit", "sk", "sl", "sla", "sm", "sma", "smi", "smj", "smn", OtpEventTracker.OTP_EVENT_VALUE_SMS, "sn", "snk", "so", "sog", "son", "sq", "sr", "srn", "srr", "ss", "ssa", "ssy", "st", "su", "suk", "sus", "sux", "sv", "sw", "swb", "swc", "syc", "syr", "ta", "tai", "te", "tem", "teo", "ter", "tet", "tg", "th", "ti", "tig", "tiv", "tk", "tkl", "tl", "tlh", "tli", "tmh", "tn", "to", "tog", "tpi", "tr", "trv", "ts", "tsi", TtmlNode.TAG_TT, "tum", "tup", "tut", "tvl", "tw", "twq", "ty", "tyv", "tzm", "udm", "ug", "uga", "uk", "umb", com.google.android.exoplayer2.C.LANGUAGE_UNDETERMINED, com.sparrowwallet.hummingbird.UR.UR_PREFIX, "uz", "vai", "ve", "vi", "vo", "vot", "vun", "wa", "wae", "wak", "wal", "war", "was", "wen", "wo", "xal", "xh", "xog", "yao", "yap", "yav", "ybb", "yi", "yo", "ypk", "yue", "za", "zap", "zbl", "zen", "zh", "znd", "zu", "zun", "zxx", "zza"};
    public static final java.lang.String[] isConnected = {"id", "he", "yi", com.ibm.icu.text.DateFormat.HOUR_GENERIC_TZ, "sr", "nb"};
    public static final java.lang.String[] AYXKKw = {"in", "iw", "ji", "jw", "sh", "no"};
    public static final java.lang.String[] AEQbTJ = {"aar", "abk", "ace", "ach", "ada", "ady", "ave", "afr", "afa", "afh", "agq", "ain", "aka", "akk", "ale", "alg", "alt", "amh", "arg", "ang", "anp", "apa", "ara", "arc", "arn", "arp", "ars", "art", "arw", "asm", "asa", "ast", "ath", "aus", "ava", "awa", "aym", "aze", "bak", "bad", "bai", "bal", "ban", "bas", "bat", "bax", "bbj", "bel", "bej", "bem", "ber", "bez", "bfd", "bul", "bih", "bho", "bis", "bik", "bin", "bkm", "bla", "bam", "ben", "bnt", "bod", "bre", "bra", "brx", "bos", "bss", "btk", "bua", "bug", "bum", "byn", "byv", "cat", "cad", "cai", "car", "cau", "cay", "cch", "che", "ceb", "cel", "cgg", "cha", "chb", "chg", "chk", "chm", "chn", "cho", "chp", "chr", "chy", "ckb", "cmc", "cos", "cop", "cpe", "cpf", "cpp", "cre", "crh", "crp", "ces", "csb", "chu", "cus", "chv", "cym", "dan", "dak", "dar", "dav", MTPushConstants.NotificationTime.KEY_DAYS, "deu", "del", "den", "dgr", "din", "dje", "doi", "dra", "dsb", "dua", "dum", TtmlNode.TAG_DIV, "dyo", "dyu", "dzo", "dzg", "ebu", "ewe", "efi", "egy", "eka", "ell", "elx", "eng", "enm", "epo", "spa", "est", "eus", "ewo", "fas", "fan", "fat", "ful", "fin", "fil", "fiu", "fij", "fao", "fon", "fra", "frm", "fro", "frr", "frs", "fur", "fry", "gle", "gaa", "gay", "gba", "gla", "gem", "gez", "gil", "glg", "gmh", "grn", "goh", "gon", "gor", "got", "grb", "grc", "gsw", "guj", "guz", "glv", "gwi", "hau", "hai", "haw", "heb", "hin", "hil", "him", "hit", "hmn", "hmo", "hrv", "hsb", "hat", "hun", "hup", "hye", "her", "ina", "iba", "ibb", "ind", "ile", "ibo", "iii", "ijo", "ipk", "ilo", "inc", "ine", "inh", "ido", "ira", "iro", "isl", "ita", "iku", "jpn", "jbo", "jgo", "jmc", "jpr", "jrb", "jav", "kat", "kaa", "kab", "kac", "kaj", "kam", "kar", "kaw", "kbd", "kbl", "kcg", "kde", "kea", "kfo", "kon", "kha", "khi", "kho", "khq", "kik", "kua", "kaz", "kkj", "kal", "kln", "khm", "kmb", "kan", "kor", "kok", "kos", "kpe", "kau", "krc", "krl", "kro", "kru", "kas", "ksb", "ksf", "ksh", "kur", "kum", "kut", "kom", EopTrackEvent.KEY_COR, "kir", "lat", "lad", "lag", "lah", "lam", "ltz", "lez", "lug", "lim", "lkt", "lin", "lao", "lol", "loz", "lit", "lub", "lua", "lui", "lun", "luo", "lus", "luy", "lav", "mad", "maf", "mag", "mai", "mak", "man", "map", "mas", "mde", "mdf", "mdr", "men", "mer", "mfe", "mlg", "mga", "mgh", "mgo", "mah", "mri", "mic", "min", "mis", "mkd", "mkh", "mal", "mon", "mnc", "mni", "mno", "mol", "moh", "mos", "mar", "msa", "mlt", "mua", "mul", "mun", "mus", "mwl", "mwr", "mya", "mye", "myn", "myv", "nau", "nah", "nai", "nap", "naq", "nob", "nde", "nds", "nep", OtpEventTracker.OTP_EVENT_VALUE_NEW, "ndo", "nia", "nic", "niu", "nld", "nmg", "nno", "nnh", "nor", "nog", "non", "nqo", "nbl", "nso", "nub", "nus", OtcRouteConst.MAIN_ROUTE_NAV, "nwc", "nya", "nym", "nyn", "nyo", "nzi", "oci", "oji", "orm", "ori", OSSConstants.RESOURCE_NAME_OSS, "osa", "ota", "oto", "pan", "paa", "pag", "pal", "pam", "pap", "pau", "peo", "phi", "phn", "pli", "pol", "pon", "pra", "pro", "pus", "por", "que", "raj", "rap", "rar", "roh", "run", "ron", "roa", "rof", "rom", "rus", "rup", "kin", "rwk", "san", "sad", "sah", "sai", "sal", "sam", "saq", "sas", "sat", "sba", "sbp", "srd", "scn", "sco", "snd", "sme", "see", "seh", "sel", "sem", "ses", "sag", "sga", "sgn", "shi", "shn", "shu", "sin", "sid", "sio", "sit", "slk", "slv", "sla", "smo", "sma", "smi", "smj", "smn", OtpEventTracker.OTP_EVENT_VALUE_SMS, "sna", "snk", "som", "sog", "son", "sqi", "srp", "srn", "srr", "ssw", "ssa", "ssy", "sot", "sun", "suk", "sus", "sux", "swe", "swa", "swb", "swc", "syc", "syr", "tam", "tai", "tel", "tem", "teo", "ter", "tet", "tgk", "tha", "tir", "tig", "tiv", "tuk", "tkl", "tgl", "tlh", "tli", "tmh", "tsn", "ton", "tog", "tpi", "tur", "trv", "tso", "tsi", "tat", "tum", "tup", "tut", "tvl", "twi", "twq", "tah", "tyv", "tzm", "udm", "uig", "uga", "ukr", "umb", com.google.android.exoplayer2.C.LANGUAGE_UNDETERMINED, "urd", "uzb", "vai", "ven", "vie", "vol", "vot", "vun", "wln", "wae", "wak", "wal", "war", "was", "wen", "wol", "xal", "xho", "xog", "yao", "yap", "yav", "ybb", "yid", "yor", "ypk", "yue", "zha", "zap", "zbl", "zen", "zho", "znd", "zul", "zun", "zxx", "zza"};
    public static final java.lang.String[] gEmmrt = {"ind", "heb", "yid", "jaw", "srp"};
    public static final java.lang.String[] KWHzl = {"AD", "AE", "AF", "AG", "AI", "AL", "AM", "AO", "AQ", "AR", "AS", "AT", "AU", "AW", "AX", "AZ", "BA", "BB", "BD", "BE", "BF", "BG", "BH", "BI", "BJ", "BL", "BM", "BN", "BO", "BQ", "BR", "BS", "BT", "BV", "BW", "BY", "BZ", "CA", "CC", "CD", "CF", "CG", "CH", "CI", "CK", "CL", "CM", "CN", "CO", "CR", "CU", "CV", "CW", "CX", "CY", "CZ", "DE", "DJ", "DK", "DM", "DO", "DZ", "EC", "EE", "EG", "EH", "ER", "ES", "ET", "FI", "FJ", "FK", "FM", "FO", "FR", "GA", "GB", "GD", "GE", "GF", "GG", "GH", "GI", "GL", "GM", "GN", "GP", "GQ", "GR", "GS", "GT", "GU", "GW", "GY", "HK", "HM", "HN", "HR", "HT", "HU", "ID", "IE", "IL", OtcExtraKeys.IM, "IN", "IO", "IQ", "IR", "IS", "IT", "JE", "JM", "JO", "JP", "KE", ExpandedProductParsedResult.KILOGRAM, "KH", "KI", "KM", "KN", "KP", "KR", "KW", "KY", "KZ", "LA", ExpandedProductParsedResult.POUND, "LC", "LI", "LK", "LR", "LS", "LT", "LU", "LV", "LY", "MA", "MC", "MD", "ME", "MF", "MG", "MH", "MK", "ML", "MM", "MN", "MO", "MP", "MQ", "MR", "MS", "MT", "MU", "MV", "MW", "MX", "MY", "MZ", "NA", "NC", "NE", "NF", "NG", "NI", "NL", "NO", "NP", "NR", "NU", "NZ", "OM", "PA", "PE", "PF", "PG", "PH", "PK", "PL", "PM", "PN", "PR", "PS", "PT", "PW", "PY", "QA", "RE", "RO", "RS", "RU", "RW", "SA", "SB", BouncyCastleProvider.PROVIDER_NAME, "SD", "SE", "SG", "SH", "SI", "SJ", "SK", "SL", "SM", "SN", "SO", "SR", "SS", "ST", "SV", "SX", "SY", "SZ", "TC", "TD", "TF", "TG", "TH", "TJ", "TK", "TL", "TM", "TN", "TO", "TR", "TT", "TV", "TW", "TZ", "UA", "UG", "UM", "US", "UY", "UZ", "VA", "VC", "VE", "VG", "VI", "VN", "VU", "WF", "WS", "YE", "YT", "ZA", "ZM", "ZW"};
    public static final java.lang.String[] OLrzqt = {"AN", "BU", "CS", "DD", "DY", "FX", "HV", "NH", "RH", "SU", "TP", "UK", "VD", "YD", "YU", "ZR"};
    public static final java.lang.String[] djBIcL = {"CW", "MM", "RS", "DE", "BJ", "FR", "BF", "VU", "ZW", "RU", "TL", "GB", "VN", "YE", "RS", "CD"};
    public static final java.lang.String[] valueOf = {"AN", "BU", "CS", "FX", "RO", "SU", "TP", "YD", "YU", "ZR"};
    public static final java.lang.String[] copydefault = {"AND", "ARE", "AFG", "ATG", "AIA", "ALB", "ARM", "AGO", "ATA", "ARG", "ASM", "AUT", "AUS", "ABW", "ALA", "AZE", "BIH", "BRB", "BGD", "BEL", "BFA", "BGR", "BHR", "BDI", "BEN", "BLM", "BMU", "BRN", "BOL", "BES", "BRA", "BHS", "BTN", "BVT", "BWA", "BLR", "BLZ", "CAN", "CCK", "COD", "CAF", "COG", "CHE", "CIV", "COK", "CHL", "CMR", "CHN", "COL", "CRI", "CUB", "CPV", "CUW", "CXR", "CYP", "CZE", "DEU", "DJI", "DNK", "DMA", "DOM", "DZA", "ECU", "EST", "EGY", "ESH", "ERI", "ESP", "ETH", "FIN", "FJI", "FLK", "FSM", "FRO", "FRA", "GAB", "GBR", "GRD", "GEO", "GUF", "GGY", "GHA", "GIB", "GRL", "GMB", "GIN", "GLP", "GNQ", "GRC", "SGS", "GTM", "GUM", "GNB", "GUY", "HKG", "HMD", "HND", "HRV", "HTI", "HUN", "IDN", "IRL", "ISR", "IMN", "IND", "IOT", "IRQ", "IRN", "ISL", "ITA", "JEY", "JAM", "JOR", "JPN", "KEN", "KGZ", "KHM", "KIR", "COM", "KNA", "PRK", "KOR", "KWT", "CYM", "KAZ", "LAO", "LBN", "LCA", "LIE", "LKA", "LBR", "LSO", "LTU", "LUX", "LVA", "LBY", "MAR", "MCO", "MDA", "MNE", "MAF", "MDG", "MHL", "MKD", "MLI", "MMR", "MNG", "MAC", "MNP", "MTQ", "MRT", "MSR", "MLT", "MUS", "MDV", "MWI", "MEX", "MYS", "MOZ", "NAM", "NCL", "NER", "NFK", "NGA", "NIC", "NLD", "NOR", "NPL", "NRU", "NIU", "NZL", "OMN", "PAN", "PER", "PYF", "PNG", "PHL", "PAK", "POL", "SPM", "PCN", "PRI", "PSE", "PRT", "PLW", "PRY", "QAT", "REU", "ROU", "SRB", "RUS", "RWA", "SAU", "SLB", "SYC", "SDN", "SWE", "SGP", "SHN", "SVN", "SJM", "SVK", "SLE", "SMR", "SEN", "SOM", "SUR", "SSD", "STP", "SLV", "SXM", "SYR", "SWZ", "TCA", "TCD", "ATF", "TGO", "THA", "TJK", "TKL", SSLSocketFactory.TLS, "TKM", "TUN", "TON", "TUR", "TTO", "TUV", "TWN", "TZA", "UKR", "UGA", "UMI", "USA", "URY", "UZB", "VAT", "VCT", "VEN", "VGB", "VIR", "VNM", "VUT", "WLF", "WSM", "YEM", "MYT", "ZAF", "ZMB", "ZWE"};
    public static final java.lang.String[] AhwBna = {"ANT", "BUR", "SCG", "FXX", "ROM", "SUN", "TMP", "YMD", "YUG", "ZAR"};

    public static java.lang.String[] EZpvd() {
        return (java.lang.String[]) KWHzl.clone();
    }

    public static java.lang.String[] OLrzqt() {
        return (java.lang.String[]) EZpvd.clone();
    }

    public static java.lang.String AEQbTJ(java.lang.String str) {
        int iKWHzl = KWHzl(KWHzl, str);
        if (iKWHzl >= 0) {
            return copydefault[iKWHzl];
        }
        int iKWHzl2 = KWHzl(valueOf, str);
        return iKWHzl2 >= 0 ? AhwBna[iKWHzl2] : "";
    }

    public static java.lang.String EZpvd(java.lang.String str) {
        int iKWHzl = KWHzl(EZpvd, str);
        if (iKWHzl >= 0) {
            return AEQbTJ[iKWHzl];
        }
        int iKWHzl2 = KWHzl(AYXKKw, str);
        return iKWHzl2 >= 0 ? gEmmrt[iKWHzl2] : "";
    }

    public static java.lang.String KWHzl(java.lang.String str) {
        int iKWHzl = KWHzl(AEQbTJ, str);
        if (iKWHzl >= 0) {
            return EZpvd[iKWHzl];
        }
        int iKWHzl2 = KWHzl(gEmmrt, str);
        if (iKWHzl2 >= 0) {
            return AYXKKw[iKWHzl2];
        }
        return null;
    }

    public static java.lang.String gEmmrt(java.lang.String str) {
        int iKWHzl = KWHzl(copydefault, str);
        if (iKWHzl >= 0) {
            return KWHzl[iKWHzl];
        }
        int iKWHzl2 = KWHzl(AhwBna, str);
        if (iKWHzl2 >= 0) {
            return valueOf[iKWHzl2];
        }
        return null;
    }

    public static int KWHzl(java.lang.String[] strArr, java.lang.String str) {
        for (int i = 0; i < strArr.length; i++) {
            if (str.equals(strArr[i])) {
                return i;
            }
        }
        return -1;
    }

    public static java.lang.String copydefault(java.lang.String str) {
        int iKWHzl = KWHzl(OLrzqt, str);
        return iKWHzl >= 0 ? djBIcL[iKWHzl] : str;
    }

    public static java.lang.String OLrzqt(java.lang.String str) {
        int iKWHzl = KWHzl(AYXKKw, str);
        return iKWHzl >= 0 ? isConnected[iKWHzl] : str;
    }
}
