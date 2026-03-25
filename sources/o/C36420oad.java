package o;

import com.okinc.im.bean.tag.TagSize;
import com.okinc.okimcore.model.other.GroupMemberInfo;
import kotlin.jvm.internal.Intrinsics;
import o.C35399nuc;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oad, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public class C36420oad extends AbstractC43310rmq<GroupMemberInfo, nLB> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC43310rmq
    public int getItemLayoutId() {
        return C35399nuc.Dialog.fXHmeK;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC43310rmq
    public int getVariableId() {
        return C35342ntX.djBIcL;
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Lo/rms;Ljava/lang/Object;)V */
    @Override // o.AbstractC43310rmq
    /* JADX INFO: renamed from: AEQbTJ */
    public void onBindViewHolder(@NotNull C43312rms<nLB> c43312rms, @NotNull GroupMemberInfo groupMemberInfo) {
        Intrinsics.checkNotNullParameter(c43312rms, "");
        Intrinsics.checkNotNullParameter(groupMemberInfo, "");
        super.onBindViewHolder((C43312rms) c43312rms, groupMemberInfo);
        nLB nlb = (nLB) c43312rms.OLrzqt();
        C35893oHp c35893oHp = nlb.copydefault;
        Intrinsics.checkNotNullExpressionValue(c35893oHp, "");
        C37716ozA.KWHzl(c35893oHp, groupMemberInfo.getOfficialTags(), TagSize.DP_18);
        C35893oHp c35893oHp2 = nlb.copydefault;
        Intrinsics.checkNotNullExpressionValue(c35893oHp2, "");
        C35891oHn.KWHzl(c35893oHp2, groupMemberInfo);
        nlb.KWHzl.setText(C44157sFk.EZpvd(groupMemberInfo));
    }
}
