package o;

import androidx.exifinterface.media.ExifInterface;
import com.amplifyframework.ui.liveness.state.FreshnessState;
import com.bytedance.applog.aggregation.MetricsSQLiteCacheKt;
import com.flyco.tablayout.BuildConfig;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.mlkit.common.MlKitException;
import com.google.zxing.pdf417.PDF417Common;
import com.okinc.business.defi.biz.model.wallet.ExtJson;
import org.htmlcleaner.HtmlCleanerException;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: renamed from: o.zpr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C59898zpr {
    public static final C59898zpr KWHzl;
    public java.util.Map<java.lang.String, C59896zpp> AEQbTJ = new java.util.HashMap();
    public java.util.Map<java.lang.Integer, C59896zpp> EZpvd = new java.util.HashMap();
    public boolean OLrzqt;
    public boolean copydefault;
    public int valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int AEQbTJ() {
        return this.valueOf;
    }

    static {
        boolean z = true;
        KWHzl = new C59898zpr(z, z) { // from class: o.zpr.5
        };
    }

    public C59898zpr(boolean z, boolean z2) {
        this.OLrzqt = z;
        this.copydefault = z2;
        OLrzqt(new C59896zpp("nbsp", CipherSuite.TLS_DH_RSA_WITH_AES_128_GCM_SHA256, null, true));
        OLrzqt(new C59896zpp("iexcl", CipherSuite.TLS_DH_RSA_WITH_AES_256_GCM_SHA384, null, true));
        OLrzqt(new C59896zpp("cent", CipherSuite.TLS_DHE_DSS_WITH_AES_128_GCM_SHA256, null, true));
        OLrzqt(new C59896zpp("pound", CipherSuite.TLS_DHE_DSS_WITH_AES_256_GCM_SHA384, null, true));
        OLrzqt(new C59896zpp("curren", CipherSuite.TLS_DH_DSS_WITH_AES_128_GCM_SHA256, null, true));
        OLrzqt(new C59896zpp("yen", CipherSuite.TLS_DH_DSS_WITH_AES_256_GCM_SHA384, null, true));
        OLrzqt(new C59896zpp("brvbar", CipherSuite.TLS_DH_anon_WITH_AES_128_GCM_SHA256, null, true));
        OLrzqt(new C59896zpp("sect", CipherSuite.TLS_DH_anon_WITH_AES_256_GCM_SHA384, null, true));
        OLrzqt(new C59896zpp("uml", CipherSuite.TLS_PSK_WITH_AES_128_GCM_SHA256, null, true));
        OLrzqt(new C59896zpp("copy", CipherSuite.TLS_PSK_WITH_AES_256_GCM_SHA384, null, true));
        OLrzqt(new C59896zpp("ordf", CipherSuite.TLS_DHE_PSK_WITH_AES_128_GCM_SHA256, null, true));
        OLrzqt(new C59896zpp("laquo", CipherSuite.TLS_DHE_PSK_WITH_AES_256_GCM_SHA384, null, true));
        OLrzqt(new C59896zpp("not", 172, null, true));
        OLrzqt(new C59896zpp("shy", CipherSuite.TLS_RSA_PSK_WITH_AES_256_GCM_SHA384, null, true));
        OLrzqt(new C59896zpp("reg", CipherSuite.TLS_PSK_WITH_AES_128_CBC_SHA256, null, true));
        OLrzqt(new C59896zpp("macr", CipherSuite.TLS_PSK_WITH_AES_256_CBC_SHA384, null, true));
        OLrzqt(new C59896zpp("deg", CipherSuite.TLS_PSK_WITH_NULL_SHA256, null, true));
        OLrzqt(new C59896zpp("plusmn", CipherSuite.TLS_PSK_WITH_NULL_SHA384, null, true));
        OLrzqt(new C59896zpp("sup2", CipherSuite.TLS_DHE_PSK_WITH_AES_128_CBC_SHA256, null, true));
        OLrzqt(new C59896zpp("sup3", CipherSuite.TLS_DHE_PSK_WITH_AES_256_CBC_SHA384, null, true));
        OLrzqt(new C59896zpp("acute", 180, null, true));
        OLrzqt(new C59896zpp("micro", CipherSuite.TLS_DHE_PSK_WITH_NULL_SHA384, null, true));
        OLrzqt(new C59896zpp("para", CipherSuite.TLS_RSA_PSK_WITH_AES_128_CBC_SHA256, null, true));
        OLrzqt(new C59896zpp("middot", CipherSuite.TLS_RSA_PSK_WITH_AES_256_CBC_SHA384, null, true));
        OLrzqt(new C59896zpp("cedil", CipherSuite.TLS_RSA_PSK_WITH_NULL_SHA256, null, true));
        OLrzqt(new C59896zpp("sup1", CipherSuite.TLS_RSA_PSK_WITH_NULL_SHA384, null, true));
        OLrzqt(new C59896zpp("ordm", CipherSuite.TLS_RSA_WITH_CAMELLIA_128_CBC_SHA256, null, true));
        OLrzqt(new C59896zpp("raquo", CipherSuite.TLS_DH_DSS_WITH_CAMELLIA_128_CBC_SHA256, null, true));
        OLrzqt(new C59896zpp("frac14", 188, null, true));
        OLrzqt(new C59896zpp("frac12", 189, null, true));
        OLrzqt(new C59896zpp("frac34", 190, null, true));
        OLrzqt(new C59896zpp("iquest", 191, null, true));
        OLrzqt(new C59896zpp("Agrave", 192, null, true));
        OLrzqt(new C59896zpp("Aacute", CipherSuite.TLS_DH_DSS_WITH_CAMELLIA_256_CBC_SHA256, null, true));
        OLrzqt(new C59896zpp("Acirc", CipherSuite.TLS_DH_RSA_WITH_CAMELLIA_256_CBC_SHA256, null, true));
        OLrzqt(new C59896zpp("Atilde", CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA256, null, true));
        OLrzqt(new C59896zpp("Auml", CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA256, null, true));
        OLrzqt(new C59896zpp("Aring", CipherSuite.TLS_DH_anon_WITH_CAMELLIA_256_CBC_SHA256, null, true));
        OLrzqt(new C59896zpp("AElig", 198, null, true));
        OLrzqt(new C59896zpp("Ccedil", 199, null, true));
        OLrzqt(new C59896zpp("Egrave", 200, null, true));
        OLrzqt(new C59896zpp("Eacute", 201, null, true));
        OLrzqt(new C59896zpp("Ecirc", 202, null, true));
        OLrzqt(new C59896zpp("Euml", 203, null, true));
        OLrzqt(new C59896zpp("Igrave", 204, null, true));
        OLrzqt(new C59896zpp("Iacute", MlKitException.CODE_SCANNER_PIPELINE_INITIALIZATION_ERROR, null, true));
        OLrzqt(new C59896zpp("Icirc", 206, null, true));
        OLrzqt(new C59896zpp("Iuml", 207, null, true));
        OLrzqt(new C59896zpp("ETH", 208, null, true));
        OLrzqt(new C59896zpp("Ntilde", 209, null, true));
        OLrzqt(new C59896zpp("Ograve", 210, null, true));
        OLrzqt(new C59896zpp("Oacute", 211, null, true));
        OLrzqt(new C59896zpp("Ocirc", BuildConfig.VERSION_CODE, null, true));
        OLrzqt(new C59896zpp("Otilde", 213, null, true));
        OLrzqt(new C59896zpp("Ouml", me.relex.circleindicator.BuildConfig.VERSION_CODE, null, true));
        OLrzqt(new C59896zpp("times", 215, null, true));
        OLrzqt(new C59896zpp("Oslash", 216, null, true));
        OLrzqt(new C59896zpp("Ugrave", 217, null, true));
        OLrzqt(new C59896zpp("Uacute", 218, null, true));
        OLrzqt(new C59896zpp("Ucirc", 219, null, true));
        OLrzqt(new C59896zpp("Uuml", 220, null, true));
        OLrzqt(new C59896zpp("Yacute", 221, null, true));
        OLrzqt(new C59896zpp("THORN", 222, null, true));
        OLrzqt(new C59896zpp("szlig", 223, null, true));
        OLrzqt(new C59896zpp("agrave", 224, null, true));
        OLrzqt(new C59896zpp("aacute", 225, null, true));
        OLrzqt(new C59896zpp("acirc", 226, null, true));
        OLrzqt(new C59896zpp("atilde", 227, null, true));
        OLrzqt(new C59896zpp("auml", 228, null, true));
        OLrzqt(new C59896zpp("aring", FreshnessState.FIRST_SCENE_ALPHA, null, true));
        OLrzqt(new C59896zpp("aelig", 230, null, true));
        OLrzqt(new C59896zpp("ccedil", 231, null, true));
        OLrzqt(new C59896zpp("egrave", 232, null, true));
        OLrzqt(new C59896zpp("eacute", 233, null, true));
        OLrzqt(new C59896zpp("ecirc", 234, null, true));
        OLrzqt(new C59896zpp("euml", 235, null, true));
        OLrzqt(new C59896zpp("igrave", 236, null, true));
        OLrzqt(new C59896zpp("iacute", 237, null, true));
        OLrzqt(new C59896zpp("icirc", 238, null, true));
        OLrzqt(new C59896zpp("iuml", 239, null, true));
        OLrzqt(new C59896zpp("eth", PsExtractor.VIDEO_STREAM_MASK, null, true));
        OLrzqt(new C59896zpp("ntilde", 241, null, true));
        OLrzqt(new C59896zpp("ograve", 242, null, true));
        OLrzqt(new C59896zpp("oacute", 243, null, true));
        OLrzqt(new C59896zpp("ocirc", 244, null, true));
        OLrzqt(new C59896zpp("otilde", 245, null, true));
        OLrzqt(new C59896zpp("ouml", 246, null, true));
        OLrzqt(new C59896zpp("divide", 247, null, true));
        OLrzqt(new C59896zpp("oslash", 248, null, true));
        OLrzqt(new C59896zpp("ugrave", 249, null, true));
        OLrzqt(new C59896zpp("uacute", 250, null, true));
        OLrzqt(new C59896zpp("ucirc", 251, null, true));
        OLrzqt(new C59896zpp("uuml", 252, null, true));
        OLrzqt(new C59896zpp("yacute", 253, null, true));
        OLrzqt(new C59896zpp("thorn", 254, null, true));
        OLrzqt(new C59896zpp("yuml", 255, null, true));
        OLrzqt(new C59896zpp("OElig", 338, null, true));
        OLrzqt(new C59896zpp("oelig", 339, null, true));
        OLrzqt(new C59896zpp("Scaron", 352, null, true));
        OLrzqt(new C59896zpp("scaron", 353, null, true));
        OLrzqt(new C59896zpp("Yuml", 376, null, true));
        OLrzqt(new C59896zpp("fnof", 402, null, true));
        OLrzqt(new C59896zpp("circ", 710, null, true));
        OLrzqt(new C59896zpp("tilde", 732, null, true));
        if (this.OLrzqt) {
            OLrzqt(new C59896zpp("Alpha", 913, null, true));
            OLrzqt(new C59896zpp("Beta", 914, null, true));
            OLrzqt(new C59896zpp(ExifInterface.TAG_GAMMA, 915, null, true));
            OLrzqt(new C59896zpp("Delta", 916, null, true));
            OLrzqt(new C59896zpp("Epsilon", 917, null, true));
            OLrzqt(new C59896zpp("Zeta", 918, null, true));
            OLrzqt(new C59896zpp("Eta", 919, null, true));
            OLrzqt(new C59896zpp("Theta", 920, null, true));
            OLrzqt(new C59896zpp("Iota", 921, null, true));
            OLrzqt(new C59896zpp("Kappa", 922, null, true));
            OLrzqt(new C59896zpp("Lambda", 923, null, true));
            OLrzqt(new C59896zpp("Mu", 924, null, true));
            OLrzqt(new C59896zpp("Nu", 925, null, true));
            OLrzqt(new C59896zpp("Xi", 926, null, true));
            OLrzqt(new C59896zpp("Omicron", 927, null, true));
            OLrzqt(new C59896zpp("Pi", PDF417Common.MAX_CODEWORDS_IN_BARCODE, null, true));
            OLrzqt(new C59896zpp("Rho", PDF417Common.NUMBER_OF_CODEWORDS, null, true));
            OLrzqt(new C59896zpp("Sigma", 931, null, true));
            OLrzqt(new C59896zpp("Tau", 932, null, true));
            OLrzqt(new C59896zpp("Upsilon", 933, null, true));
            OLrzqt(new C59896zpp("Phi", 934, null, true));
            OLrzqt(new C59896zpp("Chi", 935, null, true));
            OLrzqt(new C59896zpp("Psi", 936, null, true));
            OLrzqt(new C59896zpp("Omega", 937, null, true));
            OLrzqt(new C59896zpp("alpha", 945, null, true));
            OLrzqt(new C59896zpp("beta", 946, null, true));
            OLrzqt(new C59896zpp("gamma", 947, null, true));
            OLrzqt(new C59896zpp("delta", 948, null, true));
            OLrzqt(new C59896zpp("epsilon", 949, null, true));
            OLrzqt(new C59896zpp("zeta", 950, null, true));
            OLrzqt(new C59896zpp("eta", 951, null, true));
            OLrzqt(new C59896zpp("theta", 952, null, true));
            OLrzqt(new C59896zpp("iota", 953, null, true));
            OLrzqt(new C59896zpp("kappa", 954, null, true));
            OLrzqt(new C59896zpp("lambda", 955, null, true));
            OLrzqt(new C59896zpp("mu", 956, null, true));
            OLrzqt(new C59896zpp("nu", 957, null, true));
            OLrzqt(new C59896zpp("xi", 958, null, true));
            OLrzqt(new C59896zpp("omicron", 959, null, true));
            OLrzqt(new C59896zpp("pi", 960, null, true));
            OLrzqt(new C59896zpp("rho", 961, null, true));
            OLrzqt(new C59896zpp("sigmaf", 962, null, true));
            OLrzqt(new C59896zpp("sigma", 963, null, true));
            OLrzqt(new C59896zpp("tau", 964, null, true));
            OLrzqt(new C59896zpp("upsilon", 965, null, true));
            OLrzqt(new C59896zpp("phi", 966, null, true));
            OLrzqt(new C59896zpp("chi", 967, null, true));
            OLrzqt(new C59896zpp("psi", 968, null, true));
            OLrzqt(new C59896zpp("omega", 969, null, true));
            OLrzqt(new C59896zpp("thetasym", 977, null, true));
            OLrzqt(new C59896zpp("upsih", 978, null, true));
            OLrzqt(new C59896zpp("piv", 982, null, true));
        }
        OLrzqt(new C59896zpp("ensp", 8194, null, true));
        OLrzqt(new C59896zpp("emsp", 8195, null, true));
        OLrzqt(new C59896zpp("thinsp", 8201, null, true));
        OLrzqt(new C59896zpp("zwnj", 8204, null, true));
        OLrzqt(new C59896zpp("zwj", 8205, null, true));
        OLrzqt(new C59896zpp("lrm", 8206, null, true));
        OLrzqt(new C59896zpp("rlm", 8207, null, true));
        OLrzqt(new C59896zpp("ndash", 8211, null, true));
        OLrzqt(new C59896zpp("mdash", 8212, null, true));
        OLrzqt(new C59896zpp("lsquo", 8216, null, true));
        OLrzqt(new C59896zpp("rsquo", 8217, null, true));
        OLrzqt(new C59896zpp("sbquo", 8218, null, true));
        OLrzqt(new C59896zpp("ldquo", 8220, null, true));
        OLrzqt(new C59896zpp("rdquo", 8221, null, true));
        OLrzqt(new C59896zpp("bdquo", 8222, null, true));
        OLrzqt(new C59896zpp("dagger", 8224, null, true));
        OLrzqt(new C59896zpp("Dagger", 8225, null, true));
        OLrzqt(new C59896zpp("bull", 8226, null, true));
        OLrzqt(new C59896zpp("hellip", 8230, null, true));
        OLrzqt(new C59896zpp("permil", 8240, null, true));
        OLrzqt(new C59896zpp("prime", 8242, null, true));
        OLrzqt(new C59896zpp("Prime", 8243, null, true));
        OLrzqt(new C59896zpp("lsaquo", 8249, null, true));
        OLrzqt(new C59896zpp("rsaquo", 8250, null, true));
        OLrzqt(new C59896zpp("oline", 8254, null, true));
        OLrzqt(new C59896zpp("frasl", 8260, null, true));
        OLrzqt(new C59896zpp("euro", 8364, null, true));
        OLrzqt(new C59896zpp(TtmlNode.TAG_IMAGE, 8465, null, true));
        OLrzqt(new C59896zpp("weierp", 8472, null, true));
        OLrzqt(new C59896zpp("real", 8476, null, true));
        OLrzqt(new C59896zpp(ExtJson.BRC20TYPE_TRADE, 8482, null, true));
        OLrzqt(new C59896zpp("alefsym", 8501, null, true));
        OLrzqt(new C59896zpp("larr", 8592, null, true));
        OLrzqt(new C59896zpp("uarr", 8593, null, true));
        OLrzqt(new C59896zpp("rarr", 8594, null, true));
        OLrzqt(new C59896zpp("darr", 8595, null, true));
        OLrzqt(new C59896zpp("harr", 8596, null, true));
        OLrzqt(new C59896zpp("crarr", 8629, null, true));
        OLrzqt(new C59896zpp("lArr", 8656, null, true));
        OLrzqt(new C59896zpp("uArr", 8657, null, true));
        OLrzqt(new C59896zpp("rArr", 8658, null, true));
        OLrzqt(new C59896zpp("dArr", 8659, null, true));
        OLrzqt(new C59896zpp("hArr", 8660, null, true));
        if (this.copydefault) {
            OLrzqt(new C59896zpp("forall", 8704, null, true));
            OLrzqt(new C59896zpp("part", 8706, null, true));
            OLrzqt(new C59896zpp("exist", 8707, null, true));
            OLrzqt(new C59896zpp("empty", 8709, null, true));
            OLrzqt(new C59896zpp("nabla", 8711, null, true));
            OLrzqt(new C59896zpp("isin", 8712, null, true));
            OLrzqt(new C59896zpp("notin", 8713, null, true));
            OLrzqt(new C59896zpp("ni", 8715, null, true));
            OLrzqt(new C59896zpp("prod", 8719, null, true));
            OLrzqt(new C59896zpp(MetricsSQLiteCacheKt.METRICS_SUM, 8721, null, true));
            OLrzqt(new C59896zpp("minus", 8722, null, true));
            OLrzqt(new C59896zpp("lowast", 8727, null, true));
            OLrzqt(new C59896zpp("radic", 8730, null, true));
            OLrzqt(new C59896zpp("prop", 8733, null, true));
            OLrzqt(new C59896zpp("infin", 8734, null, true));
            OLrzqt(new C59896zpp("ang", 8736, null, true));
            OLrzqt(new C59896zpp("and", 8743, null, true));
            OLrzqt(new C59896zpp("or", 8744, null, true));
            OLrzqt(new C59896zpp("cap", 8745, null, true));
            OLrzqt(new C59896zpp("cup", 8746, null, true));
            OLrzqt(new C59896zpp("int", 8747, null, true));
            OLrzqt(new C59896zpp("there4", 8756, null, true));
            OLrzqt(new C59896zpp("sim", 8764, null, true));
            OLrzqt(new C59896zpp("cong", 8773, null, true));
            OLrzqt(new C59896zpp("asymp", 8776, null, true));
            OLrzqt(new C59896zpp("ne", 8800, null, true));
            OLrzqt(new C59896zpp("equiv", 8801, null, true));
            OLrzqt(new C59896zpp("le", 8804, null, true));
            OLrzqt(new C59896zpp("ge", 8805, null, true));
            OLrzqt(new C59896zpp("sub", 8834, null, true));
            OLrzqt(new C59896zpp("sup", 8835, null, true));
            OLrzqt(new C59896zpp("nsub", 8836, null, true));
            OLrzqt(new C59896zpp("sube", 8838, null, true));
            OLrzqt(new C59896zpp("supe", 8839, null, true));
            OLrzqt(new C59896zpp("oplus", 8853, null, true));
            OLrzqt(new C59896zpp("otimes", 8855, null, true));
            OLrzqt(new C59896zpp("perp", 8869, null, true));
            OLrzqt(new C59896zpp("sdot", 8901, null, true));
            OLrzqt(new C59896zpp("lceil", 8968, null, true));
            OLrzqt(new C59896zpp("rceil", 8969, null, true));
            OLrzqt(new C59896zpp("lfloor", 8970, null, true));
            OLrzqt(new C59896zpp("rfloor", 8971, null, true));
            OLrzqt(new C59896zpp("lang", 9001, null, true));
            OLrzqt(new C59896zpp("rang", 9002, null, true));
            OLrzqt(new C59896zpp("loz", 9674, null, true));
            OLrzqt(new C59896zpp("spades", 9824, null, true));
            OLrzqt(new C59896zpp("clubs", 9827, null, true));
            OLrzqt(new C59896zpp("hearts", 9829, null, true));
            OLrzqt(new C59896zpp("diams", 9830, null, true));
        }
        OLrzqt(new C59896zpp("amp", 38, null, false));
        OLrzqt(new C59896zpp("lt", 60, null, false));
        OLrzqt(new C59896zpp("gt", 62, null, false));
        OLrzqt(new C59896zpp("quot", 34, null, false));
        OLrzqt(new C59896zpp("apos", 39, "'", false));
    }

    public C59896zpp AEQbTJ(java.lang.String str) {
        java.lang.String strSubstring;
        if (str.length() == 0) {
            return null;
        }
        int i = str.charAt(0) == '&' ? 1 : 0;
        int iIndexOf = str.indexOf(59);
        if (iIndexOf < 0) {
            strSubstring = str.substring(i);
        } else {
            strSubstring = str.substring(i, iIndexOf);
        }
        return this.AEQbTJ.get(strSubstring);
    }

    public C59896zpp EZpvd(int i) {
        return this.EZpvd.get(java.lang.Integer.valueOf(i));
    }

    public final void OLrzqt(C59896zpp c59896zpp) {
        C59896zpp c59896zppPut = this.AEQbTJ.put(c59896zpp.gEmmrt(), c59896zpp);
        if (c59896zppPut != null) {
            throw new HtmlCleanerException("replaced " + c59896zppPut + " with " + c59896zpp);
        }
        C59896zpp c59896zppPut2 = this.EZpvd.put(java.lang.Integer.valueOf(c59896zpp.AhwBna()), c59896zpp);
        if (c59896zppPut2 != null) {
            throw new HtmlCleanerException("replaced " + c59896zppPut2 + " with " + c59896zpp);
        }
        this.valueOf = java.lang.Math.max(this.valueOf, c59896zpp.gEmmrt().length());
    }
}
