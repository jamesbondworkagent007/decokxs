package o;

import com.okinc.business.rewards.okplatform.LexicalDecorate;
import com.okinc.business.rewards.okplatform.bean.BaseRichTextBlock;
import com.okinc.lexical.text.GeneralRichText;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pIh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C37994pIh implements pHO {
    public static final StateListAnimator Companion = new StateListAnimator(null);

    /* JADX INFO: renamed from: o.pIh$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.pIh.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    @Override // o.pHO
    public boolean KWHzl(@NotNull BaseRichTextBlock baseRichTextBlock) {
        Intrinsics.checkNotNullParameter(baseRichTextBlock, "");
        java.lang.String type = baseRichTextBlock.getType();
        return type != null && android.text.TextUtils.equals(type, "text");
    }

    @Override // o.pHO
    public android.text.SpannableStringBuilder copydefault(@NotNull BaseRichTextBlock baseRichTextBlock, java.lang.String str, C37993pIg c37993pIg, boolean z) {
        LexicalDecorate lexicalDecorateOLrzqt;
        Intrinsics.checkNotNullParameter(baseRichTextBlock, "");
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
        GeneralRichText generalRichText = (GeneralRichText) baseRichTextBlock;
        spannableStringBuilder.append((java.lang.CharSequence) generalRichText.getText());
        generalRichText.getFormat();
        int format = generalRichText.getFormat();
        if (format == 1) {
            spannableStringBuilder.setSpan(new android.text.style.TextAppearanceSpan(C52762wXk.AEQbTJ(), C52761wXj.LoaderManager.fFgQHt), 0, spannableStringBuilder.length(), 33);
        } else if (format == 2) {
            spannableStringBuilder.setSpan(new android.text.style.StyleSpan(2), 0, spannableStringBuilder.length(), 33);
        } else if (format == 3) {
            spannableStringBuilder.setSpan(new android.text.style.StyleSpan(3), 0, spannableStringBuilder.length(), 33);
        } else {
            switch (format) {
                case 8:
                    spannableStringBuilder.setSpan(new android.text.style.UnderlineSpan(), 0, spannableStringBuilder.length(), 33);
                    break;
                case 9:
                    spannableStringBuilder.setSpan(new android.text.style.TextAppearanceSpan(C52762wXk.AEQbTJ(), C52761wXj.LoaderManager.fFgQHt), 0, spannableStringBuilder.length(), 33);
                    spannableStringBuilder.setSpan(new android.text.style.UnderlineSpan(), 0, spannableStringBuilder.length(), 33);
                    break;
                case 10:
                    spannableStringBuilder.setSpan(new android.text.style.StyleSpan(2), 0, spannableStringBuilder.length(), 33);
                    spannableStringBuilder.setSpan(new android.text.style.UnderlineSpan(), 0, spannableStringBuilder.length(), 33);
                    break;
                case 11:
                    spannableStringBuilder.setSpan(new android.text.style.StyleSpan(3), 0, spannableStringBuilder.length(), 33);
                    spannableStringBuilder.setSpan(new android.text.style.UnderlineSpan(), 0, spannableStringBuilder.length(), 33);
                    break;
            }
        }
        if (c37993pIg != null && (lexicalDecorateOLrzqt = c37993pIg.OLrzqt()) != null) {
            spannableStringBuilder.setSpan(new android.text.style.ForegroundColorSpan(C33070mpX.copydefault(lexicalDecorateOLrzqt.getTextColor())), 0, spannableStringBuilder.length(), 33);
        }
        return spannableStringBuilder;
    }
}
