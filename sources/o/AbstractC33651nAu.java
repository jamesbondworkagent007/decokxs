package o;

import android.view.View;
import com.okinc.okimcore.model.remote.RelationInfo;
import kotlin.jvm.internal.Intrinsics;
import o.C35399nuc;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nAu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public abstract class AbstractC33651nAu extends AbstractC43310rmq<RelationInfo, nLX> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void AEQbTJ(@NotNull C43312rms<nLX> c43312rms, @NotNull RelationInfo relationInfo) {
        Intrinsics.checkNotNullParameter(c43312rms, "");
        Intrinsics.checkNotNullParameter(relationInfo, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC43310rmq
    public int getItemLayoutId() {
        return C35399nuc.Dialog.sVXHln;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC43310rmq
    public int getVariableId() {
        return C35342ntX.djBIcL;
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Lo/rms;Ljava/lang/Object;)V */
    @Override // o.AbstractC43310rmq
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull final C43312rms<nLX> c43312rms, @NotNull final RelationInfo relationInfo) {
        Intrinsics.checkNotNullParameter(c43312rms, "");
        Intrinsics.checkNotNullParameter(relationInfo, "");
        super.onBindViewHolder((C43312rms) c43312rms, relationInfo);
        nLX nlx = (nLX) c43312rms.OLrzqt();
        C35893oHp c35893oHp = nlx.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(c35893oHp, "");
        C35891oHn.OLrzqt(c35893oHp, relationInfo);
        nlx.gEmmrt.setText(C44157sFk.getDisplayName$default(relationInfo, null, 1, null));
        if (relationInfo.getOfficialTags() != null) {
            android.widget.TextView textView = nlx.AYXKKw;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            C37716ozA.updateTagViewWithTagInfo$default(textView, relationInfo.getOfficialTags(), 8, null, false, false, false, 60, null);
        }
        C52794wYp c52794wYp = nlx.EZpvd;
        c52794wYp.setVisibility(0);
        c52794wYp.setOnClickListener(new View.OnClickListener() { // from class: o.nAz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                AbstractC33651nAu.OLrzqt(this.OLrzqt, c43312rms, relationInfo, view);
            }
        });
    }

    public static final void OLrzqt(AbstractC33651nAu abstractC33651nAu, C43312rms c43312rms, RelationInfo relationInfo, android.view.View view) {
        abstractC33651nAu.AEQbTJ(c43312rms, relationInfo);
    }
}
