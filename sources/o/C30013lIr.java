package o;

import com.okinc.buysell.ui.paymentmethod.data.SelectionRow;
import kotlin.jvm.internal.Intrinsics;
import o.C31351lsQ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lIr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C30013lIr extends C43318rmy<SelectionRow.SectionHeader, AbstractC31514lvU> {
    public C30013lIr() {
        super(C31351lsQ.ActionBar.gasjUx, 0);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Lo/rms;Ljava/lang/Object;)V */
    @Override // o.AbstractC43310rmq
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C43312rms<AbstractC31514lvU> c43312rms, @NotNull SelectionRow.SectionHeader sectionHeader) {
        Intrinsics.checkNotNullParameter(c43312rms, "");
        Intrinsics.checkNotNullParameter(sectionHeader, "");
        super.onBindViewHolder((C43312rms) c43312rms, sectionHeader);
        AbstractC31514lvU abstractC31514lvU = (AbstractC31514lvU) c43312rms.OLrzqt();
        if (abstractC31514lvU != null) {
            abstractC31514lvU.OLrzqt.setText(sectionHeader.EZpvd());
            abstractC31514lvU.KWHzl.setVisibility(sectionHeader.OLrzqt() ? 0 : 8);
        }
    }
}
