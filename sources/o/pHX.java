package o;

import com.okinc.business.rewards.okplatform.bean.BaseRichTextBlock;
import com.okinc.lexical.paragraph.RichTextParagraph;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.pHO;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class pHX implements pHO {
    public static final TaskDescription Companion = new TaskDescription(null);

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.pHX.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    @Override // o.pHO
    public boolean KWHzl(@NotNull BaseRichTextBlock baseRichTextBlock) {
        Intrinsics.checkNotNullParameter(baseRichTextBlock, "");
        java.lang.String type = baseRichTextBlock.getType();
        return type != null && android.text.TextUtils.equals(type, "paragraph");
    }

    @Override // o.pHO
    public android.text.SpannableStringBuilder copydefault(@NotNull BaseRichTextBlock baseRichTextBlock, java.lang.String str, C37993pIg c37993pIg, boolean z) {
        pHK phkCopydefault;
        Intrinsics.checkNotNullParameter(baseRichTextBlock, "");
        RichTextParagraph richTextParagraph = (RichTextParagraph) baseRichTextBlock;
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
        if (C33129mqd.KWHzl((java.util.Collection) richTextParagraph.getChildren())) {
            for (BaseRichTextBlock baseRichTextBlock2 : richTextParagraph.getChildren()) {
                if (baseRichTextBlock2.getType() != null && c37993pIg != null && (phkCopydefault = c37993pIg.copydefault()) != null) {
                    java.util.HashMap<java.lang.String, pHO> mapOLrzqt = phkCopydefault.OLrzqt();
                    java.lang.String type = baseRichTextBlock2.getType();
                    Intrinsics.copydefault((java.lang.Object) type);
                    pHO pho = mapOLrzqt.get(type);
                    if (pho != null && pho.KWHzl(baseRichTextBlock2)) {
                        spannableStringBuilder.append((java.lang.CharSequence) pHO.TaskDescription.renderBlock$default(pho, baseRichTextBlock2, null, c37993pIg, false, 10, null));
                    }
                }
            }
        }
        java.lang.String string = spannableStringBuilder.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        if (string.length() > 0) {
            if (!z) {
                C37996pIj.makeUpMargin$default(C37996pIj.KWHzl, spannableStringBuilder, 0, 2, null);
            } else {
                C37996pIj.KWHzl.EZpvd(spannableStringBuilder);
            }
        }
        return spannableStringBuilder;
    }
}
