package org.jdom2.output;

import com.google.android.exoplayer2.C;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import o.C59868zpE;
import o.InterfaceC59875zpL;

/* JADX INFO: loaded from: classes24.dex */
public class Format implements Cloneable {
    public static final InterfaceC59875zpL AEQbTJ;
    public static final InterfaceC59875zpL KWHzl;
    public static final InterfaceC59875zpL copydefault;
    public static final InterfaceC59875zpL EZpvd = new InterfaceC59875zpL() { // from class: org.jdom2.output.Format.1
    };
    public static final String OLrzqt = LineSeparator.DEFAULT.value();
    public String valueOf = null;
    public String AkhnZx = OLrzqt;
    public String AYXKKw = C.UTF8_NAME;
    public boolean DbNXlk = false;
    public boolean fetchVPNInfo = false;
    public boolean isConnected = false;
    public boolean AhwBna = false;
    public boolean gEmmrt = false;
    public TextMode values = TextMode.PRESERVE;
    public InterfaceC59875zpL djBIcL = EZpvd;

    public enum TextMode {
        PRESERVE,
        TRIM,
        NORMALIZE,
        TRIM_FULL_WHITE
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean AYXKKw() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String AhwBna() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TextMode AkhnZx() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InterfaceC59875zpL KWHzl() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean OLrzqt() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String copydefault() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String djBIcL() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean fetchVPNInfo() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean gEmmrt() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean valueOf() {
        return this.DbNXlk;
    }

    public static final class Activity implements InterfaceC59875zpL {
        private Activity() {
        }
    }

    static {
        copydefault = new Activity();
        AEQbTJ = new ActionBar();
        KWHzl = new TaskDescription();
    }

    public static final class ActionBar implements InterfaceC59875zpL {
        private ActionBar() {
        }
    }

    public static final class TaskDescription implements InterfaceC59875zpL {
        private TaskDescription() {
        }
    }

    public static final class Application implements InterfaceC59875zpL {
        public final CharsetEncoder KWHzl;

        public Application(CharsetEncoder charsetEncoder) {
            this.KWHzl = charsetEncoder;
        }
    }

    public static Format AEQbTJ() {
        return new Format();
    }

    public static final String copydefault(String str) {
        int length = str.length() - 1;
        int i = 0;
        while (i <= length && C59868zpE.AYXKKw(str.charAt(i))) {
            i++;
        }
        while (length > i && C59868zpE.AYXKKw(str.charAt(length))) {
            length--;
        }
        if (i > length) {
            return "";
        }
        StringBuilder sb = new StringBuilder((length - i) + 1);
        boolean z = true;
        while (i <= length) {
            char cCharAt = str.charAt(i);
            if (!C59868zpE.AYXKKw(cCharAt)) {
                sb.append(cCharAt);
                z = true;
            } else if (z) {
                sb.append(' ');
                z = false;
            }
            i++;
        }
        return sb.toString();
    }

    public static final String EZpvd(String str) {
        int length = str.length() - 1;
        while (length > 0 && C59868zpE.AYXKKw(str.charAt(length))) {
            length--;
        }
        int i = 0;
        while (i <= length && C59868zpE.AYXKKw(str.charAt(i))) {
            i++;
        }
        return i > length ? "" : str.substring(i, length + 1);
    }

    public static final InterfaceC59875zpL AEQbTJ(String str) {
        if (C.UTF8_NAME.equalsIgnoreCase(str) || C.UTF16_NAME.equalsIgnoreCase(str)) {
            return copydefault;
        }
        if (str.toUpperCase().startsWith("ISO-8859-") || "Latin1".equalsIgnoreCase(str)) {
            return AEQbTJ;
        }
        if (C.ASCII_NAME.equalsIgnoreCase(str) || "ASCII".equalsIgnoreCase(str)) {
            return KWHzl;
        }
        try {
            return new Application(Charset.forName(str).newEncoder());
        } catch (Exception unused) {
            return EZpvd;
        }
    }

    private Format() {
        KWHzl(C.UTF8_NAME);
    }

    public Format KWHzl(String str) {
        this.AYXKKw = str;
        this.djBIcL = AEQbTJ(str);
        return this;
    }

    /* JADX DEBUG: Method merged with bridge method: clone()Ljava/lang/Object; */
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public Format clone() {
        try {
            return (Format) super.clone();
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }
}
