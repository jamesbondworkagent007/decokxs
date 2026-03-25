package o;

import com.okinc.business.rewards.okplatform.LexicalDecorate;
import com.okinc.business.rewards.okplatform.bean.BaseRichTextBlock;
import com.okinc.lexical.table.RichTextTable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pIf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C37992pIf implements pHO {
    public static final ActionBar Companion = new ActionBar(null);

    /* JADX INFO: renamed from: o.pIf$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.pIf.ActionBar.<init>():void type: THIS */
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
        return type != null && android.text.TextUtils.equals(type, "table");
    }

    @Override // o.pHO
    public android.text.SpannableStringBuilder copydefault(@NotNull BaseRichTextBlock baseRichTextBlock, java.lang.String str, C37993pIg c37993pIg, boolean z) {
        Intrinsics.checkNotNullParameter(baseRichTextBlock, "");
        return new android.text.SpannableStringBuilder();
    }

    public static /* synthetic */ C38001pIo renderTable$default(C37992pIf c37992pIf, android.content.Context context, RichTextTable richTextTable, LexicalDecorate lexicalDecorate, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            lexicalDecorate = null;
        }
        return c37992pIf.AEQbTJ(context, richTextTable, lexicalDecorate);
    }

    public final C38001pIo AEQbTJ(@NotNull android.content.Context context, @NotNull RichTextTable richTextTable, LexicalDecorate lexicalDecorate) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(richTextTable, "");
        C38001pIo c38001pIo = new C38001pIo(context);
        c38001pIo.setTableData(richTextTable, lexicalDecorate);
        return c38001pIo;
    }
}
