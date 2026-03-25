package o;

import com.google.android.exoplayer2.util.MimeTypes;
import com.reown.foundation.util.jwt.JwtUtilsKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: renamed from: o.ygi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public class C57348ygi {
    public static java.lang.String copydefault;
    public static java.util.HashMap<java.lang.String, Application> KWHzl = new java.util.HashMap<>();
    public static java.util.HashMap<java.lang.String, java.lang.Integer> AEQbTJ = new java.util.HashMap<>();

    /* JADX INFO: renamed from: o.ygi$Application */
    public static class Application {
        public java.lang.String AEQbTJ;
        public int OLrzqt;

        public Application(int i, java.lang.String str) {
            this.OLrzqt = i;
            this.AEQbTJ = str;
        }
    }

    static {
        OLrzqt("MP3", 1, MimeTypes.AUDIO_MPEG);
        OLrzqt("M4A", 2, MimeTypes.AUDIO_MP4);
        OLrzqt("WAV", 3, "audio/x-wav");
        OLrzqt("AMR", 4, MimeTypes.AUDIO_AMR);
        OLrzqt("AWB", 5, MimeTypes.AUDIO_AMR_WB);
        OLrzqt("WMA", 6, "audio/x-ms-wma");
        OLrzqt("OGG", 7, "application/ogg");
        OLrzqt("MID", 11, "audio/midi");
        OLrzqt("XMF", 11, "audio/midi");
        OLrzqt("RTTTL", 11, "audio/midi");
        OLrzqt("SMF", 12, "audio/sp-midi");
        OLrzqt("IMY", 13, "audio/imelody");
        OLrzqt("MP4", 21, MimeTypes.VIDEO_MP4);
        OLrzqt("M4V", 22, MimeTypes.VIDEO_MP4);
        OLrzqt("3GP", 23, MimeTypes.VIDEO_H263);
        OLrzqt("3GPP", 23, MimeTypes.VIDEO_H263);
        OLrzqt("3G2", 24, "video/3gpp2");
        OLrzqt("3GPP2", 24, "video/3gpp2");
        OLrzqt("WMV", 25, "video/x-ms-wmv");
        OLrzqt("JPG", 31, "image/jpeg");
        OLrzqt("JPEG", 31, "image/jpeg");
        OLrzqt("GIF", 32, "image/gif");
        OLrzqt("PNG", 33, "image/png");
        OLrzqt("BMP", 34, "image/x-ms-bmp");
        OLrzqt("WBMP", 35, "image/vnd.wap.wbmp");
        OLrzqt("M3U", 41, "audio/x-mpegurl");
        OLrzqt("PLS", 42, "audio/x-scpls");
        OLrzqt("WPL", 43, "application/vnd.ms-wpl");
        OLrzqt("PDF", 51, "application/pdf");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.util.Iterator<java.lang.String> it = KWHzl.keySet().iterator();
        while (it.hasNext()) {
            if (sb.length() > 0) {
                sb.append(AbstractJsonLexerKt.COMMA);
            }
            sb.append(it.next());
        }
        copydefault = sb.toString();
    }

    public static void OLrzqt(java.lang.String str, int i, java.lang.String str2) {
        KWHzl.put(str, new Application(i, str2));
        AEQbTJ.put(str2, new java.lang.Integer(i));
    }

    public static Application KWHzl(java.lang.String str) {
        int iLastIndexOf = str.lastIndexOf(JwtUtilsKt.JWT_DELIMITER);
        if (iLastIndexOf < 0) {
            return null;
        }
        return KWHzl.get(str.substring(iLastIndexOf + 1).toUpperCase());
    }
}
