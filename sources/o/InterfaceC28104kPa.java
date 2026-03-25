package o;

import com.okinc.business.rewards.okplatform.LexicalDecorate;
import com.okinc.business.rewards.okplatform.bean.RichTextRoot;

/* JADX INFO: renamed from: o.kPa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public interface InterfaceC28104kPa {
    void setLexicalRichData(RichTextRoot richTextRoot, LexicalDecorate lexicalDecorate);

    /* JADX INFO: renamed from: o.kPa$ActionBar */
    /* JADX INFO: loaded from: classes15.dex */
    public static final class ActionBar {
        public static /* synthetic */ void setLexicalRichData$default(InterfaceC28104kPa interfaceC28104kPa, RichTextRoot richTextRoot, LexicalDecorate lexicalDecorate, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setLexicalRichData");
            }
            if ((i & 2) != 0) {
                lexicalDecorate = null;
            }
            interfaceC28104kPa.setLexicalRichData(richTextRoot, lexicalDecorate);
        }
    }
}
