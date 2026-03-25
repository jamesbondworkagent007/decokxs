package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import com.okinc.im.bean.SearchResultData;
import com.okinc.okimcore.model.im.OKConversation;
import com.okinc.okimcore.model.remote.RelationInfo;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC35180nqU;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class tGV extends tGG<C46087tHi, C46250tNj> {
    /* JADX DEBUG: Method merged with bridge method: copydefault(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/viewbinding/ViewBinding; */
    @Override // o.AbstractC47825txS
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public C46250tNj copydefault(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C46250tNj c46250tNjEZpvd = C46250tNj.EZpvd(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c46250tNjEZpvd, "");
        return c46250tNjEZpvd;
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Landroidx/viewbinding/ViewBinding;ILo/txV;)V */
    @Override // o.AbstractC47825txS
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public void AEQbTJ(@NotNull C46250tNj c46250tNj, int i, @NotNull final C46087tHi c46087tHi) {
        Intrinsics.checkNotNullParameter(c46250tNj, "");
        Intrinsics.checkNotNullParameter(c46087tHi, "");
        AppCompatImageView appCompatImageView = c46250tNj.KWHzl;
        Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
        java.lang.String strAEQbTJ = c46087tHi.AEQbTJ();
        if (strAEQbTJ == null) {
            strAEQbTJ = "";
        }
        C33054mpH.loadAvatar$default(appCompatImageView, strAEQbTJ, null, null, 6, null);
        AppCompatTextView appCompatTextView = c46250tNj.djBIcL;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
        EZpvd(appCompatTextView, c46087tHi.EZpvd());
        java.lang.String strKWHzl = c46087tHi.KWHzl();
        int i2 = 8;
        if (strKWHzl != null && strKWHzl.length() != 0) {
            AppCompatTextView appCompatTextView2 = c46250tNj.EZpvd;
            Intrinsics.checkNotNullExpressionValue(appCompatTextView2, "");
            appCompatTextView2.setVisibility(0);
            AppCompatTextView appCompatTextView3 = c46250tNj.EZpvd;
            Intrinsics.checkNotNullExpressionValue(appCompatTextView3, "");
            EZpvd(appCompatTextView3, c46087tHi.KWHzl());
        } else {
            AppCompatTextView appCompatTextView4 = c46250tNj.EZpvd;
            Intrinsics.checkNotNullExpressionValue(appCompatTextView4, "");
            appCompatTextView4.setVisibility(8);
        }
        android.widget.ImageView imageView = c46250tNj.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        if (c46087tHi.OLrzqt().getConversation() != null) {
            OKConversation conversation = c46087tHi.OLrzqt().getConversation();
            Intrinsics.copydefault(conversation);
            java.lang.Integer groupEntityType = conversation.getGroupEntityType();
            if (groupEntityType != null && groupEntityType.intValue() == 12) {
                i2 = 0;
            }
        }
        imageView.setVisibility(i2);
        android.widget.TextView textView = c46250tNj.copydefault;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        tGZ.updateTagViewWithTagInfo$default(textView, c46087tHi.copydefault(), 0, 2, null);
        c46250tNj.getRoot().setOnClickListener(new View.OnClickListener() { // from class: o.tGR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                tGV.KWHzl(this.AEQbTJ, c46087tHi, view);
            }
        });
    }

    public static final void KWHzl(tGV tgv, C46087tHi c46087tHi, android.view.View view) {
        Intrinsics.copydefault(view);
        tgv.copydefault(view, c46087tHi.OLrzqt());
    }

    public final void copydefault(android.view.View view, SearchResultData.ChatAndContact chatAndContact) {
        InterfaceC35180nqU interfaceC35180nqU = (InterfaceC35180nqU) C43251rlk.OLrzqt(InterfaceC35180nqU.class);
        if (interfaceC35180nqU != null) {
            android.content.Context context = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            OKConversation conversation = chatAndContact.getConversation();
            java.lang.String targetId = conversation != null ? conversation.getTargetId() : null;
            RelationInfo relation = chatAndContact.getRelation();
            java.lang.String contactsId = relation != null ? relation.getContactsId() : null;
            C59534zip adapter = getAdapter();
            AbstractC46077tGz abstractC46077tGz = adapter instanceof AbstractC46077tGz ? (AbstractC46077tGz) adapter : null;
            InterfaceC35180nqU.ActionBar.startChatActivity$default(interfaceC35180nqU, context, targetId, null, null, abstractC46077tGz != null ? abstractC46077tGz.KWHzl() : null, contactsId, null, 76, null);
        }
    }
}
