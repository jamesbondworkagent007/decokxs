package o;

import androidx.core.util.PatternsCompat;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes18.dex */
public final class oHJ {
    public static final Pattern KWHzl = PatternsCompat.AUTOLINK_WEB_URL;
    public static final Pattern copydefault = PatternsCompat.EMAIL_ADDRESS;
    public static final Pattern AEQbTJ = Pattern.compile("\\b(?:okex|okx|okxtr)://[^\\s]+");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final Pattern EZpvd() {
        return copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final Pattern OLrzqt() {
        return KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final Pattern copydefault() {
        return AEQbTJ;
    }
}
