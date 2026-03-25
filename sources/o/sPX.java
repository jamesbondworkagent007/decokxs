package o;

import com.okinc.okimcore.model.im.OKMentionedInfo;

/* JADX INFO: loaded from: classes10.dex */
public final class sPX {
    public static final sPX copydefault = new sPX();

    public final /* synthetic */ class StateListAnimator {
        public static final /* synthetic */ int[] OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[OKMentionedInfo.MentionedType.values().length];
            try {
                iArr[OKMentionedInfo.MentionedType.NONE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[OKMentionedInfo.MentionedType.ALL.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[OKMentionedInfo.MentionedType.PART.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            OLrzqt = iArr;
        }
    }

    private sPX() {
    }

    public final int OLrzqt(OKMentionedInfo.MentionedType mentionedType) {
        int i = mentionedType == null ? -1 : StateListAnimator.OLrzqt[mentionedType.ordinal()];
        return (i == 1 || i != 2) ? 0 : 2;
    }
}
