package o;

import com.okinc.business.rewards.okplatform.LexicalDecorate;
import com.okinc.business.rewards.okplatform.bean.BaseRichTextBlock;
import com.okinc.business.rewards.okplatform.bean.RichTextRoot;
import com.okinc.lexical.table.RichTextTable;
import kotlin.jvm.internal.Intrinsics;
import o.pHO;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pIg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C37993pIg {
    public pHK EZpvd = new pHJ();
    public LexicalDecorate KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(@NotNull LexicalDecorate lexicalDecorate) {
        Intrinsics.checkNotNullParameter(lexicalDecorate, "");
        this.KWHzl = lexicalDecorate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LexicalDecorate OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final pHK copydefault() {
        return this.EZpvd;
    }

    public static /* synthetic */ android.text.SpannableStringBuilder startRenderSingle$default(C37993pIg c37993pIg, BaseRichTextBlock baseRichTextBlock, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return c37993pIg.EZpvd(baseRichTextBlock, z);
    }

    public final android.text.SpannableStringBuilder EZpvd(@NotNull BaseRichTextBlock baseRichTextBlock, boolean z) {
        Intrinsics.checkNotNullParameter(baseRichTextBlock, "");
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
        if (this.EZpvd != null && baseRichTextBlock.getType() != null) {
            pHK phk = this.EZpvd;
            Intrinsics.copydefault(phk);
            pHO pho = phk.OLrzqt().get(baseRichTextBlock.getType());
            if (pho != null && pho.KWHzl(baseRichTextBlock)) {
                spannableStringBuilder.append((java.lang.CharSequence) pHO.TaskDescription.renderBlock$default(pho, baseRichTextBlock, null, this, z, 2, null));
            }
        }
        return spannableStringBuilder;
    }

    public static /* synthetic */ C38001pIo renderTable$default(C37993pIg c37993pIg, android.content.Context context, RichTextTable richTextTable, LexicalDecorate lexicalDecorate, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            lexicalDecorate = null;
        }
        return c37993pIg.KWHzl(context, richTextTable, lexicalDecorate);
    }

    public final C38001pIo KWHzl(@NotNull android.content.Context context, @NotNull RichTextTable richTextTable, LexicalDecorate lexicalDecorate) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(richTextTable, "");
        return new C37992pIf().AEQbTJ(context, richTextTable, lexicalDecorate);
    }

    public static /* synthetic */ C37999pIm startRenderSection$default(C37993pIg c37993pIg, android.content.Context context, RichTextRoot richTextRoot, LexicalDecorate lexicalDecorate, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            lexicalDecorate = null;
        }
        return c37993pIg.KWHzl(context, richTextRoot, lexicalDecorate);
    }

    public final C37999pIm KWHzl(@NotNull android.content.Context context, @NotNull RichTextRoot richTextRoot, LexicalDecorate lexicalDecorate) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(richTextRoot, "");
        C37999pIm c37999pIm = new C37999pIm(context);
        c37999pIm.EZpvd(richTextRoot, lexicalDecorate);
        return c37999pIm;
    }
}
