package o;

import com.okinc.okimcore.model.im.OKEmojiMessage;
import com.okinc.okimcore.model.im.OKTextMessage;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt__CharJVMKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class sFF {
    public static final sFF KWHzl = new sFF();

    public static final class Activity {
        public final int OLrzqt;
        public final boolean copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Activity copy$default(Activity activity, int i, boolean z, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                i = activity.OLrzqt;
            }
            if ((i2 & 2) != 0) {
                z = activity.copydefault;
            }
            return activity.OLrzqt(i, z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean EZpvd() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Activity OLrzqt(int i, boolean z) {
            return new Activity(i, z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int copydefault() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Activity)) {
                return false;
            }
            Activity activity = (Activity) obj;
            return this.OLrzqt == activity.OLrzqt && this.copydefault == activity.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (java.lang.Integer.hashCode(this.OLrzqt) * 31) + java.lang.Boolean.hashCode(this.copydefault);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "EmojiMatchResult(totalEmoji=" + this.OLrzqt + ", isAllEmoji=" + this.copydefault + ")";
        }

        public Activity(int i, boolean z) {
            this.OLrzqt = i;
            this.copydefault = z;
        }
    }

    private sFF() {
    }

    public final Activity EZpvd(java.lang.String str) throws java.io.IOException {
        Pattern patternCompile = Pattern.compile("(?:[\\u2700-\\u27bf]|(?:[\\ud83c\\udde6-\\ud83c\\uddff]){2}|[\\ud800\\udc00-\\uDBFF\\uDFFF]|[\\u2600-\\u26FF])[\\ufe0e\\ufe0f]?(?:[\\u0300-\\u036f\\ufe20-\\ufe23\\u20d0-\\u20f0]|[\\ud83c\\udffb-\\ud83c\\udfff])?(?:\\u200d(?:[^\\ud800-\\udfff]|(?:[\\ud83c\\udde6-\\ud83c\\uddff]){2}|[\\ud800\\udc00-\\uDBFF\\uDFFF]|[\\u2600-\\u26FF])[\\ufe0e\\ufe0f]?(?:[\\u0300-\\u036f\\ufe20-\\ufe23\\u20d0-\\u20f0]|[\\ud83c\\udffb-\\ud83c\\udfff])?)*|[\\u0023-\\u0039]\\ufe0f?\\u20e3|\\u3299|\\u3297|\\u303d|\\u3030|\\u24c2|[\\ud83c\\udd70-\\ud83c\\udd71]|[\\ud83c\\udd7e-\\ud83c\\udd7f]|\\ud83c\\udd8e|[\\ud83c\\udd91-\\ud83c\\udd9a]|[\\ud83c\\udde6-\\ud83c\\uddff]|[\\ud83c\\ude01-\\ud83c\\ude02]|\\ud83c\\ude1a|\\ud83c\\ude2f|[\\ud83c\\ude32-\\ud83c\\ude3a]|[\\ud83c\\ude50-\\ud83c\\ude51]|\\u203c|\\u2049|[\\u25aa-\\u25ab]|\\u25b6|\\u25c0|[\\u25fb-\\u25fe]|\\u00a9|\\u00ae|\\u2122|\\u2139|\\ud83c\\udc04|[\\u2600-\\u26FF]|\\u2b05|\\u2b06|\\u2b07|\\u2b1b|\\u2b1c|\\u2b50|\\u2b55|\\u231a|\\u231b|\\u2328|\\u23cf|[\\u23e9-\\u23f3]|[\\u23f8-\\u23fa]|\\ud83c\\udccf|\\u2934|\\u2935|[\\u2190-\\u21ff]");
        Intrinsics.checkNotNullExpressionValue(patternCompile, "");
        Matcher matcher = patternCompile.matcher(str);
        Intrinsics.checkNotNullExpressionValue(matcher, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (matcher.find()) {
            java.lang.String strGroup = matcher.group();
            Intrinsics.copydefault((java.lang.Object) strGroup);
            arrayList.add(strGroup);
        }
        int size = arrayList.size();
        int length = CollectionsKt___CollectionsKt.joinToString$default(arrayList, "", null, null, 0, null, null, 62, null).length();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (!CharsKt__CharJVMKt.EZpvd(cCharAt)) {
                sb.append(cCharAt);
            }
        }
        return new Activity(size, length == sb.toString().length());
    }

    public final OKTextMessage OLrzqt(@NotNull OKTextMessage oKTextMessage) {
        Intrinsics.checkNotNullParameter(oKTextMessage, "");
        java.lang.String content = oKTextMessage.getContent();
        if (content == null || content.length() == 0) {
            return oKTextMessage;
        }
        Activity activityEZpvd = EZpvd(content);
        if (!activityEZpvd.EZpvd() || activityEZpvd.copydefault() > 3) {
            return oKTextMessage;
        }
        OKEmojiMessage oKEmojiMessage = new OKEmojiMessage();
        oKEmojiMessage.setContent(content);
        oKEmojiMessage.setTotalEmoji(activityEZpvd.copydefault());
        return oKEmojiMessage;
    }
}
