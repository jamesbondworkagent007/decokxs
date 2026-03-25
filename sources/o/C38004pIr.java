package o;

import com.okinc.business.rewards.okplatform.LexicalDecorate;
import com.okinc.lexical.table.RichTextTableCell;
import kotlin.jvm.internal.Intrinsics;
import o.C28102kOz;
import o.C52761wXj;
import o.pHO;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pIr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public class C38004pIr extends AbstractC43310rmq<RichTextTableCell, kOR> {
    public static final int copydefault = LexicalDecorate.$stable;
    public final LexicalDecorate EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC43310rmq
    public int getItemLayoutId() {
        return C28102kOz.Activity.EZpvd;
    }

    @Override // o.AbstractC43310rmq
    public int getVariableId() {
        return 0;
    }

    public C38004pIr(LexicalDecorate lexicalDecorate) {
        this.EZpvd = lexicalDecorate;
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Lo/rms;Ljava/lang/Object;)V */
    @Override // o.AbstractC43310rmq
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C43312rms<kOR> c43312rms, @NotNull RichTextTableCell richTextTableCell) {
        Intrinsics.checkNotNullParameter(c43312rms, "");
        Intrinsics.checkNotNullParameter(richTextTableCell, "");
        super.onBindViewHolder((C43312rms) c43312rms, richTextTableCell);
        C37993pIg c37993pIg = new C37993pIg();
        LexicalDecorate lexicalDecorate = this.EZpvd;
        if (lexicalDecorate != null) {
            c37993pIg.KWHzl(lexicalDecorate);
        }
        android.text.SpannableStringBuilder spannableStringBuilderRenderBlock$default = pHO.TaskDescription.renderBlock$default(new C37991pIe(), richTextTableCell, null, c37993pIg, false, 10, null);
        ((kOR) c43312rms.OLrzqt()).copydefault.setMovementMethod(C37998pIl.AEQbTJ);
        ((kOR) c43312rms.OLrzqt()).copydefault.setText(spannableStringBuilderRenderBlock$default);
        if (richTextTableCell.getHeaderState() != 0) {
            ((kOR) c43312rms.OLrzqt()).copydefault.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.GzAsTt));
            ((kOR) c43312rms.OLrzqt()).copydefault.getPaint().setFakeBoldText(true);
        } else {
            ((kOR) c43312rms.OLrzqt()).copydefault.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.DeEinT));
            ((kOR) c43312rms.OLrzqt()).copydefault.getPaint().setFakeBoldText(false);
        }
    }
}
