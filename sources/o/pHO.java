package o;

import com.okinc.business.rewards.okplatform.bean.BaseRichTextBlock;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public interface pHO {
    boolean KWHzl(@NotNull BaseRichTextBlock baseRichTextBlock);

    android.text.SpannableStringBuilder copydefault(@NotNull BaseRichTextBlock baseRichTextBlock, java.lang.String str, C37993pIg c37993pIg, boolean z);

    public static final class TaskDescription {
        public static /* synthetic */ android.text.SpannableStringBuilder renderBlock$default(pHO pho, BaseRichTextBlock baseRichTextBlock, java.lang.String str, C37993pIg c37993pIg, boolean z, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: renderBlock");
            }
            if ((i & 2) != 0) {
                str = "";
            }
            if ((i & 8) != 0) {
                z = false;
            }
            return pho.copydefault(baseRichTextBlock, str, c37993pIg, z);
        }
    }
}
