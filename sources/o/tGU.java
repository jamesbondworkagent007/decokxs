package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import com.okinc.im.bean.SearchResultData;
import com.okinc.okimcore.model.im.OKMessage;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC35180nqU;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class tGU extends tGG<C46094tHp, C46251tNk> {
    /* JADX DEBUG: Method merged with bridge method: copydefault(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/viewbinding/ViewBinding; */
    @Override // o.AbstractC47825txS
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public C46251tNk copydefault(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C46251tNk c46251tNkOLrzqt = C46251tNk.OLrzqt(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c46251tNkOLrzqt, "");
        return c46251tNkOLrzqt;
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Landroidx/viewbinding/ViewBinding;ILo/txV;)V */
    @Override // o.AbstractC47825txS
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public void AEQbTJ(@NotNull C46251tNk c46251tNk, int i, @NotNull final C46094tHp c46094tHp) {
        Intrinsics.checkNotNullParameter(c46251tNk, "");
        Intrinsics.checkNotNullParameter(c46094tHp, "");
        AppCompatImageView appCompatImageView = c46251tNk.KWHzl;
        Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
        java.lang.String strAEQbTJ = c46094tHp.AEQbTJ();
        if (strAEQbTJ == null) {
            strAEQbTJ = "";
        }
        C33054mpH.loadAvatar$default(appCompatImageView, strAEQbTJ, null, null, 6, null);
        c46251tNk.djBIcL.setText(c46094tHp.valueOf());
        AppCompatTextView appCompatTextView = c46251tNk.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
        EZpvd(appCompatTextView, c46094tHp.EZpvd());
        java.lang.String strOLrzqt = c46094tHp.OLrzqt();
        int i2 = 8;
        if (strOLrzqt != null && strOLrzqt.length() != 0) {
            android.widget.TextView textView = c46251tNk.gEmmrt;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            textView.setVisibility(0);
            c46251tNk.gEmmrt.setText(c46094tHp.OLrzqt());
        } else {
            android.widget.TextView textView2 = c46251tNk.gEmmrt;
            Intrinsics.checkNotNullExpressionValue(textView2, "");
            textView2.setVisibility(8);
        }
        android.widget.ImageView imageView = c46251tNk.EZpvd;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        java.lang.Integer groupEntityType = c46094tHp.copydefault().getConversation().getGroupEntityType();
        if (groupEntityType != null && groupEntityType.intValue() == 12) {
            i2 = 0;
        }
        imageView.setVisibility(i2);
        android.widget.TextView textView3 = c46251tNk.AhwBna;
        Intrinsics.checkNotNullExpressionValue(textView3, "");
        tGZ.updateTagViewWithTagInfo$default(textView3, c46094tHp.KWHzl(), 0, 2, null);
        c46251tNk.getRoot().setOnClickListener(new View.OnClickListener() { // from class: o.tGY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                tGU.copydefault(this.copydefault, c46094tHp, view);
            }
        });
    }

    public static final void copydefault(tGU tgu, C46094tHp c46094tHp, android.view.View view) {
        Intrinsics.copydefault(view);
        tgu.EZpvd(view, c46094tHp.copydefault());
    }

    public final void EZpvd(android.view.View view, SearchResultData.Message message) {
        InterfaceC35180nqU interfaceC35180nqU = (InterfaceC35180nqU) C43251rlk.OLrzqt(InterfaceC35180nqU.class);
        if (interfaceC35180nqU != null) {
            android.content.Context context = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            java.lang.String targetId = message.getConversation().getTargetId();
            OKMessage message2 = message.getMessage();
            C59534zip adapter = getAdapter();
            AbstractC46077tGz abstractC46077tGz = adapter instanceof AbstractC46077tGz ? (AbstractC46077tGz) adapter : null;
            InterfaceC35180nqU.ActionBar.startChatActivity$default(interfaceC35180nqU, context, targetId, null, message2, abstractC46077tGz != null ? abstractC46077tGz.KWHzl() : null, null, null, 100, null);
        }
    }
}
