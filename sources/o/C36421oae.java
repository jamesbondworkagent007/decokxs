package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.im.bean.tag.TagSize;
import com.okinc.im.widgets.SelectableDelegate;
import com.okinc.okimcore.model.other.GroupMemberInfo;
import com.okinc.okuser.data.User;
import kotlin.jvm.internal.Intrinsics;
import o.C35399nuc;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oae, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public class C36421oae extends AbstractC43310rmq<GroupMemberInfo, nNV> {
    public final boolean KWHzl;

    public void AEQbTJ() {
    }

    public SelectableDelegate<RecyclerView.ViewHolder, java.lang.String> EZpvd() {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void KWHzl(@NotNull C43312rms<nNV> c43312rms, @NotNull GroupMemberInfo groupMemberInfo) {
        Intrinsics.checkNotNullParameter(c43312rms, "");
        Intrinsics.checkNotNullParameter(groupMemberInfo, "");
    }

    public java.lang.String copydefault() {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC43310rmq
    public int getItemLayoutId() {
        return C35399nuc.Dialog.fXYAwm;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC43310rmq
    public int getVariableId() {
        return C35342ntX.djBIcL;
    }

    public C36421oae(boolean z) {
        this.KWHzl = z;
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Lo/rms;Ljava/lang/Object;)V */
    @Override // o.AbstractC43310rmq
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull final C43312rms<nNV> c43312rms, @NotNull final GroupMemberInfo groupMemberInfo) {
        int i;
        User userOLrzqt;
        Intrinsics.checkNotNullParameter(c43312rms, "");
        Intrinsics.checkNotNullParameter(groupMemberInfo, "");
        super.onBindViewHolder((C43312rms) c43312rms, groupMemberInfo);
        SelectableDelegate<RecyclerView.ViewHolder, java.lang.String> selectableDelegateEZpvd = EZpvd();
        boolean z = selectableDelegateEZpvd != null;
        final int bindingAdapterPosition = c43312rms.getBindingAdapterPosition();
        nNV nnv = (nNV) c43312rms.OLrzqt();
        nnv.values.setText(C44157sFk.EZpvd(groupMemberInfo));
        android.content.Context context = c43312rms.itemView.getContext();
        java.lang.String strCopydefault = copydefault();
        java.lang.String strAEQbTJ = C37683oyU.AEQbTJ(groupMemberInfo, strCopydefault);
        java.lang.CharSequence charSequence = null;
        if (C33129mqd.OLrzqt((java.lang.CharSequence) strAEQbTJ)) {
            nnv.djBIcL.setVisibility(0);
            android.widget.TextView textView = nnv.djBIcL;
            if (strAEQbTJ != null) {
                Intrinsics.copydefault(context);
                i = 8;
                charSequence = C37683oyU.setupHighlightSpanStyle$default(strAEQbTJ, context, strCopydefault, 0, 4, null);
            } else {
                i = 8;
            }
            textView.setText(charSequence);
        } else {
            i = 8;
            nnv.djBIcL.setVisibility(8);
            nnv.djBIcL.setText((java.lang.CharSequence) null);
        }
        AppCompatCheckBox appCompatCheckBox = nnv.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(appCompatCheckBox, "");
        appCompatCheckBox.setVisibility(z ? 0 : i);
        nnv.AEQbTJ.setChecked(selectableDelegateEZpvd != null && selectableDelegateEZpvd.AEQbTJ(bindingAdapterPosition));
        boolean z2 = this.KWHzl && (userOLrzqt = C44157sFk.gEmmrt().OLrzqt()) != null && userOLrzqt.isVip();
        android.widget.TextView textView2 = nnv.DbNXlk;
        Intrinsics.checkNotNullExpressionValue(textView2, "");
        C37716ozA.updateTagViewWithTagInfo$default(textView2, groupMemberInfo.getOfficialTags(), 8, null, false, false, z2, 28, null);
        C35893oHp c35893oHp = nnv.copydefault;
        Intrinsics.checkNotNullExpressionValue(c35893oHp, "");
        C37716ozA.KWHzl(c35893oHp, groupMemberInfo.getOfficialTags(), TagSize.DP_18);
        C35893oHp c35893oHp2 = nnv.copydefault;
        Intrinsics.checkNotNullExpressionValue(c35893oHp2, "");
        C35891oHn.OLrzqt(c35893oHp2, groupMemberInfo, this.KWHzl);
        if (!this.KWHzl) {
            android.widget.TextView textView3 = nnv.AhwBna;
            Intrinsics.checkNotNullExpressionValue(textView3, "");
            C37683oyU.AEQbTJ(textView3, groupMemberInfo.getRole());
        }
        c43312rms.itemView.setOnClickListener(new View.OnClickListener() { // from class: o.oaf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C36421oae.EZpvd(this.AEQbTJ, bindingAdapterPosition, c43312rms, groupMemberInfo, view);
            }
        });
    }

    public static final void EZpvd(C36421oae c36421oae, int i, C43312rms c43312rms, GroupMemberInfo groupMemberInfo, android.view.View view) {
        SelectableDelegate<RecyclerView.ViewHolder, java.lang.String> selectableDelegateEZpvd = c36421oae.EZpvd();
        if (selectableDelegateEZpvd != null) {
            selectableDelegateEZpvd.djBIcL(i);
        } else {
            c36421oae.KWHzl(c43312rms, groupMemberInfo);
        }
        c36421oae.AEQbTJ();
    }
}
