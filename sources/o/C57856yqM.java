package o;

import com.robinhood.ticker.TickerView;

/* JADX INFO: renamed from: o.yqM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public class C57856yqM {
    public final int EZpvd;
    public final char[] KWHzl;
    public final java.util.Map<java.lang.Character, java.lang.Integer> OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public char[] OLrzqt() {
        return this.KWHzl;
    }

    public C57856yqM(java.lang.String str) {
        int i = 0;
        if (str.contains(java.lang.Character.toString((char) 0))) {
            throw new java.lang.IllegalArgumentException("You cannot include TickerUtils.EMPTY_CHAR in the character list.");
        }
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        this.EZpvd = length;
        this.OLrzqt = new java.util.HashMap(length);
        for (int i2 = 0; i2 < length; i2++) {
            this.OLrzqt.put(java.lang.Character.valueOf(charArray[i2]), java.lang.Integer.valueOf(i2));
        }
        char[] cArr = new char[(length * 2) + 1];
        this.KWHzl = cArr;
        cArr[0] = 0;
        while (i < length) {
            char[] cArr2 = this.KWHzl;
            int i3 = i + 1;
            cArr2[i3] = charArray[i];
            cArr2[length + 1 + i] = charArray[i];
            i = i3;
        }
    }

    public Activity KWHzl(char c, char c2, TickerView.ScrollingDirection scrollingDirection) {
        int i;
        int i2;
        int iKWHzl = KWHzl(c);
        int iKWHzl2 = KWHzl(c2);
        if (iKWHzl < 0 || iKWHzl2 < 0) {
            return null;
        }
        int i3 = AnonymousClass5.KWHzl[scrollingDirection.ordinal()];
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 == 3 && c != 0 && c2 != 0) {
                    if (iKWHzl2 < iKWHzl) {
                        i = this.EZpvd;
                        if ((i - iKWHzl) + iKWHzl2 < iKWHzl - iKWHzl2) {
                            iKWHzl2 += i;
                        }
                    } else if (iKWHzl < iKWHzl2) {
                        i2 = this.EZpvd;
                        if ((i2 - iKWHzl2) + iKWHzl < iKWHzl2 - iKWHzl) {
                            iKWHzl += i2;
                        }
                    }
                }
            } else if (iKWHzl < iKWHzl2) {
                i2 = this.EZpvd;
                iKWHzl += i2;
            }
        } else if (c2 == 0) {
            iKWHzl2 = this.KWHzl.length;
        } else if (iKWHzl2 < iKWHzl) {
            i = this.EZpvd;
            iKWHzl2 += i;
        }
        return new Activity(iKWHzl, iKWHzl2);
    }

    /* JADX INFO: renamed from: o.yqM$5, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass5 {
        public static final /* synthetic */ int[] KWHzl;

        static {
            int[] iArr = new int[TickerView.ScrollingDirection.values().length];
            KWHzl = iArr;
            try {
                iArr[TickerView.ScrollingDirection.DOWN.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                KWHzl[TickerView.ScrollingDirection.UP.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                KWHzl[TickerView.ScrollingDirection.ANY.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
        }
    }

    public java.util.Set<java.lang.Character> copydefault() {
        return this.OLrzqt.keySet();
    }

    public final int KWHzl(char c) {
        if (c == 0) {
            return 0;
        }
        if (this.OLrzqt.containsKey(java.lang.Character.valueOf(c))) {
            return this.OLrzqt.get(java.lang.Character.valueOf(c)).intValue() + 1;
        }
        return -1;
    }

    /* JADX INFO: renamed from: o.yqM$Activity */
    public class Activity {
        public final int AEQbTJ;
        public final int copydefault;

        public Activity(int i, int i2) {
            this.copydefault = i;
            this.AEQbTJ = i2;
        }
    }
}
