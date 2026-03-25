package o;

import com.fasterxml.jackson.core.JsonPointer;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: renamed from: o.zor, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C59854zor {
    public final java.lang.String AEQbTJ;
    public final java.lang.String EZpvd;
    public final java.lang.String KWHzl;
    public final java.lang.String OLrzqt;
    public final java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.AEQbTJ;
    }

    public C59854zor(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        C59851zoo.AEQbTJ(str, "Package identifier");
        this.KWHzl = str;
        this.EZpvd = str2 == null ? "UNAVAILABLE" : str2;
        this.AEQbTJ = str3 == null ? "UNAVAILABLE" : str3;
        this.copydefault = str4 == null ? "UNAVAILABLE" : str4;
        this.OLrzqt = str5 == null ? "UNAVAILABLE" : str5;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(this.KWHzl.length() + 20 + this.EZpvd.length() + this.AEQbTJ.length() + this.copydefault.length() + this.OLrzqt.length());
        sb.append("VersionInfo(");
        sb.append(this.KWHzl);
        sb.append(AbstractJsonLexerKt.COLON);
        sb.append(this.EZpvd);
        if (!"UNAVAILABLE".equals(this.AEQbTJ)) {
            sb.append(AbstractJsonLexerKt.COLON);
            sb.append(this.AEQbTJ);
        }
        if (!"UNAVAILABLE".equals(this.copydefault)) {
            sb.append(AbstractJsonLexerKt.COLON);
            sb.append(this.copydefault);
        }
        sb.append(')');
        if (!"UNAVAILABLE".equals(this.OLrzqt)) {
            sb.append('@');
            sb.append(this.OLrzqt);
        }
        return sb.toString();
    }

    public static C59854zor copydefault(java.lang.String str, java.lang.ClassLoader classLoader) {
        java.util.Properties properties;
        java.io.InputStream resourceAsStream;
        C59851zoo.AEQbTJ(str, "Package identifier");
        if (classLoader == null) {
            classLoader = java.lang.Thread.currentThread().getContextClassLoader();
        }
        try {
            resourceAsStream = classLoader.getResourceAsStream(str.replace('.', JsonPointer.SEPARATOR) + "/version.properties");
        } catch (java.io.IOException unused) {
            properties = null;
        }
        if (resourceAsStream != null) {
            try {
                properties = new java.util.Properties();
                properties.load(resourceAsStream);
                try {
                    resourceAsStream.close();
                } catch (java.io.IOException unused2) {
                }
            } catch (java.lang.Throwable th) {
                resourceAsStream.close();
                throw th;
            }
        } else {
            properties = null;
        }
        if (properties != null) {
            return OLrzqt(str, properties, classLoader);
        }
        return null;
    }

    public static C59854zor OLrzqt(java.lang.String str, java.util.Map<?, ?> map, java.lang.ClassLoader classLoader) {
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        C59851zoo.AEQbTJ(str, "Package identifier");
        if (map != null) {
            java.lang.String str5 = (java.lang.String) map.get("info.module");
            if (str5 != null && str5.length() < 1) {
                str5 = null;
            }
            java.lang.String str6 = (java.lang.String) map.get("info.release");
            if (str6 != null && (str6.length() < 1 || str6.equals("${pom.version}"))) {
                str6 = null;
            }
            java.lang.String str7 = (java.lang.String) map.get("info.timestamp");
            if (str7 != null && (str7.length() < 1 || str7.equals("${mvn.timestamp}"))) {
                str7 = null;
            }
            str4 = str7;
            str2 = str5;
            str3 = str6;
        } else {
            str2 = null;
            str3 = null;
            str4 = null;
        }
        return new C59854zor(str, str2, str3, str4, classLoader != null ? classLoader.toString() : null);
    }

    public static java.lang.String OLrzqt(java.lang.String str, java.lang.String str2, java.lang.Class<?> cls) {
        C59854zor c59854zorCopydefault = copydefault(str2, cls.getClassLoader());
        return java.lang.String.format("%s/%s (Java/%s)", str, c59854zorCopydefault != null ? c59854zorCopydefault.OLrzqt() : "UNAVAILABLE", java.lang.System.getProperty("java.version"));
    }
}
