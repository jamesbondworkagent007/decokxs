package o;

import android.view.View;
import com.okinc.im.bean.tag.TagSize;
import com.okinc.okimcore.model.remote.RelationInfo;
import kotlin.jvm.internal.Intrinsics;
import o.C35399nuc;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nAv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public class C33652nAv extends AbstractC43310rmq<RelationInfo, nLA> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void EZpvd(@NotNull C43312rms<nLA> c43312rms, @NotNull RelationInfo relationInfo) {
        Intrinsics.checkNotNullParameter(c43312rms, "");
        Intrinsics.checkNotNullParameter(relationInfo, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC43310rmq
    public int getItemLayoutId() {
        return C35399nuc.Dialog.apNbdB;
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
    public void onBindViewHolder(@NotNull final C43312rms<nLA> c43312rms, @NotNull final RelationInfo relationInfo) {
        Intrinsics.checkNotNullParameter(c43312rms, "");
        Intrinsics.checkNotNullParameter(relationInfo, "");
        super.onBindViewHolder((C43312rms) c43312rms, relationInfo);
        nLA nla = (nLA) c43312rms.OLrzqt();
        C35893oHp c35893oHp = nla.KWHzl;
        Intrinsics.checkNotNullExpressionValue(c35893oHp, "");
        C37716ozA.KWHzl(c35893oHp, relationInfo.getOfficialTags(), TagSize.DP_18);
        C35893oHp c35893oHp2 = nla.KWHzl;
        Intrinsics.checkNotNullExpressionValue(c35893oHp2, "");
        C35891oHn.OLrzqt(c35893oHp2, relationInfo);
        c43312rms.itemView.setOnClickListener(new View.OnClickListener() { // from class: o.nAs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C33652nAv.EZpvd(this.copydefault, c43312rms, relationInfo, view);
            }
        });
    }

    public static final void EZpvd(C33652nAv c33652nAv, C43312rms c43312rms, RelationInfo relationInfo, android.view.View view) {
        c33652nAv.EZpvd(c43312rms, relationInfo);
    }
}
