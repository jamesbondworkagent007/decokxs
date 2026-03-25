package o;

/* JADX INFO: renamed from: o.mqw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C33148mqw {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ boolean copydefault(java.lang.String str) {
        int length = str.length();
        int iCharCount = 0;
        while (iCharCount < length) {
            int iCodePointAt = str.codePointAt(iCharCount);
            if (!java.lang.Character.isWhitespace(iCodePointAt)) {
                return false;
            }
            iCharCount += java.lang.Character.charCount(iCodePointAt);
        }
        return true;
    }
}
