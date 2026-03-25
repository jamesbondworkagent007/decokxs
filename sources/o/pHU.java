package o;

import com.okinc.business.rewards.okplatform.bean.BaseRichTextBlock;
import com.okinc.lexical.link.LexicalLinkSpan;
import com.okinc.lexical.link.RichTextLink;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import o.pHO;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class pHU implements pHO {
    public static final ActionBar Companion = new ActionBar(null);

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.pHU.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    @Override // o.pHO
    public boolean KWHzl(@NotNull BaseRichTextBlock baseRichTextBlock) {
        Intrinsics.checkNotNullParameter(baseRichTextBlock, "");
        java.lang.String type = baseRichTextBlock.getType();
        return type != null && android.text.TextUtils.equals(type, "link");
    }

    @Override // o.pHO
    public android.text.SpannableStringBuilder copydefault(@NotNull BaseRichTextBlock baseRichTextBlock, java.lang.String str, C37993pIg c37993pIg, boolean z) {
        pHK phkCopydefault;
        Intrinsics.checkNotNullParameter(baseRichTextBlock, "");
        RichTextLink richTextLink = (RichTextLink) baseRichTextBlock;
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
        if (C33129mqd.KWHzl((java.util.Collection) richTextLink.getChildren())) {
            for (BaseRichTextBlock baseRichTextBlock2 : richTextLink.getChildren()) {
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
            spannableStringBuilder.setSpan(new LexicalLinkSpan(richTextLink.getUrl()), 0, spannableStringBuilder.length(), 33);
            spannableStringBuilder.setSpan(new android.text.style.ForegroundColorSpan(C33070mpX.copydefault(C52761wXj.Activity.QIZEnU)), 0, spannableStringBuilder.length(), 33);
        }
        return spannableStringBuilder;
    }
}
