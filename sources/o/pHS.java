package o;

import com.okinc.business.rewards.okplatform.LexicalDecorate;
import com.okinc.business.rewards.okplatform.bean.BaseRichTextBlock;
import com.okinc.lexical.heading.RichTextHeading;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import o.pHO;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class pHS implements pHO {
    public static final StateListAnimator Companion = new StateListAnimator(null);

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.pHS.StateListAnimator.<init>():void type: THIS */
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
        return type != null && android.text.TextUtils.equals(type, "heading");
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x010d  */
    @Override // o.pHO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public android.text.SpannableStringBuilder copydefault(@NotNull BaseRichTextBlock baseRichTextBlock, java.lang.String str, C37993pIg c37993pIg, boolean z) {
        float textSizeH1;
        float textSizeH2;
        float textSizeH3;
        android.text.style.AbsoluteSizeSpan absoluteSizeSpan;
        int i;
        Intrinsics.checkNotNullParameter(baseRichTextBlock, "");
        RichTextHeading richTextHeading = (RichTextHeading) baseRichTextBlock;
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
        C37994pIh c37994pIh = new C37994pIh();
        pHU phu = new pHU();
        android.text.style.AbsoluteSizeSpan absoluteSizeSpan2 = null;
        LexicalDecorate lexicalDecorateOLrzqt = c37993pIg != null ? c37993pIg.OLrzqt() : null;
        if (lexicalDecorateOLrzqt != null) {
            textSizeH1 = lexicalDecorateOLrzqt.getTextSizeH1();
            textSizeH2 = lexicalDecorateOLrzqt.getTextSizeH2();
            textSizeH3 = lexicalDecorateOLrzqt.getTextSizeH3();
        } else {
            textSizeH1 = 18.0f;
            textSizeH2 = 13.0f;
            textSizeH3 = 10.0f;
        }
        float f = textSizeH3;
        float f2 = textSizeH1;
        float f3 = textSizeH2;
        int i2 = (int) f;
        if (C33129mqd.KWHzl((java.util.Collection) richTextHeading.getChildren())) {
            for (BaseRichTextBlock baseRichTextBlock2 : richTextHeading.getChildren()) {
                if (android.text.TextUtils.equals(baseRichTextBlock2.getType(), "link")) {
                    spannableStringBuilder.append((java.lang.CharSequence) pHO.TaskDescription.renderBlock$default(phu, baseRichTextBlock2, null, c37993pIg, false, 10, null));
                } else if (android.text.TextUtils.equals(baseRichTextBlock2.getType(), "text")) {
                    spannableStringBuilder.append((java.lang.CharSequence) pHO.TaskDescription.renderBlock$default(c37994pIh, baseRichTextBlock2, null, c37993pIg, false, 10, null));
                }
            }
            richTextHeading.getTag();
            if (android.text.TextUtils.equals(richTextHeading.getTag(), "h1")) {
                absoluteSizeSpan = new android.text.style.AbsoluteSizeSpan(C55298xhM.sp2px$default(f2, null, 1, null));
                i = 22;
            } else if (android.text.TextUtils.equals(richTextHeading.getTag(), "h2")) {
                absoluteSizeSpan = new android.text.style.AbsoluteSizeSpan(C55298xhM.sp2px$default(f3, null, 1, null));
                i = 18;
            } else {
                if (android.text.TextUtils.equals(richTextHeading.getTag(), "h3")) {
                    absoluteSizeSpan = new android.text.style.AbsoluteSizeSpan(C55298xhM.sp2px$default(f, null, 1, null));
                    i = 14;
                }
                spannableStringBuilder.setSpan(absoluteSizeSpan2, 0, spannableStringBuilder.length(), 33);
                if (!android.text.TextUtils.equals(richTextHeading.getTag(), "h3")) {
                    spannableStringBuilder.setSpan(new android.text.style.TextAppearanceSpan(C52762wXk.AEQbTJ(), C52761wXj.LoaderManager.fFgQHt), 0, spannableStringBuilder.length(), 33);
                }
                if (z) {
                    C37996pIj.KWHzl.KWHzl(spannableStringBuilder, i2);
                } else {
                    C37996pIj.KWHzl.EZpvd(spannableStringBuilder);
                }
            }
            absoluteSizeSpan2 = absoluteSizeSpan;
            i2 = i;
            spannableStringBuilder.setSpan(absoluteSizeSpan2, 0, spannableStringBuilder.length(), 33);
            if (!android.text.TextUtils.equals(richTextHeading.getTag(), "h3")) {
            }
            if (z) {
            }
        }
        return spannableStringBuilder;
    }
}
