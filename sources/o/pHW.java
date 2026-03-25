package o;

import com.okinc.business.rewards.okplatform.bean.BaseRichTextBlock;
import com.okinc.lexical.listorbullet.RichTextList;
import com.okinc.lexical.listorbullet.RichTextListItem;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.pHO;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class pHW implements pHO {
    public static final TaskDescription Companion = new TaskDescription(null);

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.pHW.TaskDescription.<init>():void type: THIS */
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
        return type != null && android.text.TextUtils.equals(type, "list");
    }

    @Override // o.pHO
    public android.text.SpannableStringBuilder copydefault(@NotNull BaseRichTextBlock baseRichTextBlock, java.lang.String str, C37993pIg c37993pIg, boolean z) {
        pHK phkCopydefault;
        Intrinsics.checkNotNullParameter(baseRichTextBlock, "");
        RichTextList richTextList = (RichTextList) baseRichTextBlock;
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
        if (C33129mqd.KWHzl((java.util.Collection) richTextList.getChildren())) {
            for (RichTextListItem richTextListItem : richTextList.getChildren()) {
                if (richTextListItem.getType() != null && c37993pIg != null && (phkCopydefault = c37993pIg.copydefault()) != null) {
                    java.util.HashMap<java.lang.String, pHO> mapOLrzqt = phkCopydefault.OLrzqt();
                    java.lang.String type = richTextListItem.getType();
                    Intrinsics.copydefault((java.lang.Object) type);
                    pHO pho = mapOLrzqt.get(type);
                    if (pho != null && pho.KWHzl(richTextListItem)) {
                        if (pho instanceof pHT) {
                            spannableStringBuilder.append((java.lang.CharSequence) pHO.TaskDescription.renderBlock$default(pho, richTextListItem, richTextList.getListType(), c37993pIg, false, 8, null));
                        } else {
                            spannableStringBuilder.append((java.lang.CharSequence) pHO.TaskDescription.renderBlock$default(pho, richTextListItem, null, c37993pIg, false, 10, null));
                        }
                    }
                }
            }
        }
        java.lang.String string = spannableStringBuilder.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        if (string.length() > 0) {
            C37996pIj.KWHzl.EZpvd(spannableStringBuilder);
        }
        return spannableStringBuilder;
    }
}
