package o;

/* JADX INFO: loaded from: classes21.dex */
public abstract class UH {
    public static final byte[] AEQbTJ = new byte[128];

    static {
        char c = 0;
        while (true) {
            byte[] bArr = AEQbTJ;
            if (c >= bArr.length) {
                break;
            }
            bArr[c] = -1;
            c = (char) (c + 1);
        }
        for (char c2 = '0'; c2 <= '9'; c2 = (char) (c2 + 1)) {
            AEQbTJ[c2] = (byte) (c2 - '0');
        }
        for (char c3 = 'A'; c3 <= 'F'; c3 = (char) (c3 + 1)) {
            AEQbTJ[c3] = (byte) (c3 - '7');
        }
        for (char c4 = 'a'; c4 <= 'f'; c4 = (char) (c4 + 1)) {
            AEQbTJ[c4] = (byte) (c4 - 'W');
        }
        for (char c5 = '.'; c5 <= '.'; c5 = (char) (c5 + 1)) {
            AEQbTJ[c5] = -4;
        }
    }
}
