package o;

import androidx.core.view.ViewCompat;
import com.okinc.okimcore.model.im.OKStreamPlaceHolderMessage;
import com.okinc.okimcore.model.im.inhouseim.ws.StreamPlaceHolderMessageData;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class sSV {
    public static final Activity Companion = new Activity(null);

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.sSV.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public static /* synthetic */ android.text.SpannableStringBuilder convertMarkdownToSpannable$default(sSV ssv, java.lang.String str, int i, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 2) != 0) {
            i = ViewCompat.MEASURED_STATE_MASK;
        }
        if ((i3 & 4) != 0) {
            i2 = -16776961;
        }
        return ssv.AEQbTJ(str, i, i2);
    }

    public final android.text.SpannableStringBuilder AEQbTJ(java.lang.String str, @androidx.annotation.ColorInt int i, @androidx.annotation.ColorInt int i2) {
        if (str == null || str.length() == 0) {
            return new android.text.SpannableStringBuilder("");
        }
        java.util.List<java.lang.String> listSplit$default = StringsKt__StringsKt.split$default((java.lang.CharSequence) str, new java.lang.String[]{"\n"}, false, 0, 6, (java.lang.Object) null);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.String str2 : listSplit$default) {
            if (new Regex("^\\*\\s+(.+)").matches(str2)) {
                java.lang.String strSubstring = str2.substring(2);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "");
                arrayList.add("• " + strSubstring);
            } else if (new Regex("^-\\s+(.+)").matches(str2)) {
                java.lang.String strSubstring2 = str2.substring(2);
                Intrinsics.checkNotNullExpressionValue(strSubstring2, "");
                arrayList.add("• " + strSubstring2);
            } else if (new Regex("^\\d+\\.\\s+(.+)").matches(str2)) {
                arrayList.add(str2);
            } else {
                arrayList.add(str2);
            }
        }
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(CollectionsKt___CollectionsKt.joinToString$default(arrayList, "\n", null, null, 0, null, null, 62, null));
        OLrzqt(spannableStringBuilder);
        return spannableStringBuilder;
    }

    public static /* synthetic */ android.text.SpannableStringBuilder convertStreamMessageToSpannable$default(sSV ssv, StreamPlaceHolderMessageData streamPlaceHolderMessageData, int i, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 2) != 0) {
            i = ViewCompat.MEASURED_STATE_MASK;
        }
        if ((i3 & 4) != 0) {
            i2 = -16776961;
        }
        return ssv.AEQbTJ(streamPlaceHolderMessageData, i, i2);
    }

    public final android.text.SpannableStringBuilder AEQbTJ(@NotNull StreamPlaceHolderMessageData streamPlaceHolderMessageData, @androidx.annotation.ColorInt int i, @androidx.annotation.ColorInt int i2) {
        Intrinsics.checkNotNullParameter(streamPlaceHolderMessageData, "");
        java.lang.String content = streamPlaceHolderMessageData.getContent();
        android.text.SpannableStringBuilder spannableStringBuilderAEQbTJ = AEQbTJ(content != null ? content : "", i, i2);
        if (!Intrinsics.EZpvd(streamPlaceHolderMessageData.getComplete(), java.lang.Boolean.TRUE)) {
            spannableStringBuilderAEQbTJ.append(" ");
            int length = spannableStringBuilderAEQbTJ.length();
            spannableStringBuilderAEQbTJ.append("●●●");
            spannableStringBuilderAEQbTJ.setSpan(new android.text.style.ForegroundColorSpan(-7829368), length, spannableStringBuilderAEQbTJ.length(), 33);
            spannableStringBuilderAEQbTJ.setSpan(new Application(), length, spannableStringBuilderAEQbTJ.length(), 33);
        }
        return spannableStringBuilderAEQbTJ;
    }

    public static /* synthetic */ android.text.SpannableStringBuilder convertStreamMessageToSpannable$default(sSV ssv, OKStreamPlaceHolderMessage oKStreamPlaceHolderMessage, int i, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 2) != 0) {
            i = ViewCompat.MEASURED_STATE_MASK;
        }
        if ((i3 & 4) != 0) {
            i2 = -16776961;
        }
        return ssv.OLrzqt(oKStreamPlaceHolderMessage, i, i2);
    }

    public final android.text.SpannableStringBuilder OLrzqt(@NotNull OKStreamPlaceHolderMessage oKStreamPlaceHolderMessage, @androidx.annotation.ColorInt int i, @androidx.annotation.ColorInt int i2) {
        Intrinsics.checkNotNullParameter(oKStreamPlaceHolderMessage, "");
        return AEQbTJ(oKStreamPlaceHolderMessage.getContent(), i, i2);
    }

    public final void OLrzqt(android.text.SpannableStringBuilder spannableStringBuilder) {
        AEQbTJ(spannableStringBuilder, "\\*\\*([^*]+?)\\*\\*");
        AEQbTJ(spannableStringBuilder, "__([^_]+?)__");
    }

    public final void AEQbTJ(android.text.SpannableStringBuilder spannableStringBuilder, java.lang.String str) {
        Regex regex = new Regex(str);
        java.lang.String string = spannableStringBuilder.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        int i = 0;
        for (MatchResult matchResult : C59467zhb.zuBGHE(Regex.findAll$default(regex, string, 0, 2, null))) {
            int iKWHzl = matchResult.copydefault().KWHzl() - i;
            int iCopydefault = matchResult.copydefault().copydefault();
            java.lang.String str2 = matchResult.OLrzqt().get(1);
            spannableStringBuilder.replace(iKWHzl, (iCopydefault + 1) - i, (java.lang.CharSequence) str2);
            spannableStringBuilder.setSpan(new android.text.style.StyleSpan(1), iKWHzl, str2.length() + iKWHzl, 33);
            i += 4;
        }
    }

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Application extends android.text.style.CharacterStyle implements android.text.style.UpdateAppearance {
        public boolean AEQbTJ = true;
        public final android.os.Handler EZpvd;
        public final StateListAnimator OLrzqt;

        public Application() {
            android.os.Handler handler = new android.os.Handler(android.os.Looper.getMainLooper());
            this.EZpvd = handler;
            StateListAnimator stateListAnimator = new StateListAnimator();
            this.OLrzqt = stateListAnimator;
            handler.post(stateListAnimator);
        }

        public static final class StateListAnimator implements java.lang.Runnable {
            public StateListAnimator() {
            }

            @Override // java.lang.Runnable
            public void run() {
                Application.this.AEQbTJ = !r0.AEQbTJ;
                Application.this.EZpvd.postDelayed(this, 500L);
            }
        }

        @Override // android.text.style.CharacterStyle
        public void updateDrawState(@NotNull android.text.TextPaint textPaint) {
            Intrinsics.checkNotNullParameter(textPaint, "");
            if (this.AEQbTJ) {
                return;
            }
            textPaint.setColor(0);
        }
    }
}
