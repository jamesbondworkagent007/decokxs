package o;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.im.bean.tag.TagSize;
import com.okinc.im.widgets.SelectableDelegate;
import com.okinc.okimcore.model.remote.RelationInfo;
import kotlin.jvm.internal.Intrinsics;
import o.C35399nuc;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nAw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public class C33653nAw extends AbstractC43310rmq<RelationInfo, nNW> {
    public java.lang.String AEQbTJ() {
        return null;
    }

    public SelectableDelegate<RecyclerView.ViewHolder, java.lang.String> OLrzqt() {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void copydefault(@NotNull C43312rms<nNW> c43312rms, @NotNull RelationInfo relationInfo) {
        Intrinsics.checkNotNullParameter(c43312rms, "");
        Intrinsics.checkNotNullParameter(relationInfo, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC43310rmq
    public int getItemLayoutId() {
        return C35399nuc.Dialog.gdmIOq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC43310rmq
    public int getVariableId() {
        return C35342ntX.djBIcL;
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Lo/rms;Ljava/lang/Object;)V */
    @Override // o.AbstractC43310rmq
    /* JADX INFO: renamed from: KWHzl */
    public void onBindViewHolder(@NotNull final C43312rms<nNW> c43312rms, @NotNull final RelationInfo relationInfo) {
        Intrinsics.checkNotNullParameter(c43312rms, "");
        Intrinsics.checkNotNullParameter(relationInfo, "");
        final SelectableDelegate<RecyclerView.ViewHolder, java.lang.String> selectableDelegateOLrzqt = OLrzqt();
        boolean z = selectableDelegateOLrzqt != null && selectableDelegateOLrzqt.KWHzl();
        final int adapterPosition = c43312rms.getAdapterPosition();
        ((nNW) c43312rms.OLrzqt()).copydefault(z);
        if (z) {
            Intrinsics.copydefault(selectableDelegateOLrzqt);
            ((nNW) c43312rms.OLrzqt()).EZpvd(selectableDelegateOLrzqt.AEQbTJ(adapterPosition));
        }
        super.onBindViewHolder((C43312rms) c43312rms, relationInfo);
        nNW nnw = (nNW) c43312rms.OLrzqt();
        C35893oHp c35893oHp = nnw.KWHzl;
        Intrinsics.checkNotNullExpressionValue(c35893oHp, "");
        C35891oHn.OLrzqt(c35893oHp, relationInfo);
        C35893oHp c35893oHp2 = nnw.KWHzl;
        Intrinsics.checkNotNullExpressionValue(c35893oHp2, "");
        C37716ozA.KWHzl(c35893oHp2, relationInfo.getOfficialTags(), TagSize.DP_18);
        android.widget.TextView textView = nnw.djBIcL;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        C37716ozA.updateTagViewWithTagInfo$default(textView, relationInfo.getOfficialTags(), 0, null, false, false, false, 62, null);
        java.lang.String strAEQbTJ = AEQbTJ();
        java.lang.CharSequence charSequence = null;
        java.lang.String displayName$default = C44157sFk.getDisplayName$default(relationInfo, null, 1, null);
        android.widget.TextView textView2 = nnw.gEmmrt;
        android.content.Context context = nnw.KWHzl.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        textView2.setText(C37683oyU.setupHighlightSpanStyle$default(displayName$default, context, strAEQbTJ, 0, 4, null));
        java.lang.String strAEQbTJ2 = C37683oyU.AEQbTJ(relationInfo, strAEQbTJ);
        if (C33129mqd.OLrzqt((java.lang.CharSequence) strAEQbTJ2)) {
            nnw.valueOf.setVisibility(0);
            android.widget.TextView textView3 = nnw.valueOf;
            if (strAEQbTJ2 != null) {
                android.content.Context context2 = textView3.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "");
                charSequence = C37683oyU.setupHighlightSpanStyle$default(strAEQbTJ2, context2, strAEQbTJ, 0, 4, null);
            }
            textView3.setText(charSequence);
        } else {
            nnw.valueOf.setVisibility(8);
            nnw.valueOf.setText((java.lang.CharSequence) null);
        }
        wYK wyk = nnw.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(wyk, "");
        oGZ.OLrzqt(wyk);
        c43312rms.itemView.setOnClickListener(new View.OnClickListener() { // from class: o.nAt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C33653nAw.OLrzqt(selectableDelegateOLrzqt, adapterPosition, this, c43312rms, relationInfo, view);
            }
        });
    }

    public static final void OLrzqt(SelectableDelegate selectableDelegate, int i, C33653nAw c33653nAw, C43312rms c43312rms, RelationInfo relationInfo, android.view.View view) {
        if (selectableDelegate != null && selectableDelegate.KWHzl()) {
            Intrinsics.copydefault(selectableDelegate);
            selectableDelegate.djBIcL(i);
        } else {
            c33653nAw.copydefault(c43312rms, relationInfo);
        }
    }
}
