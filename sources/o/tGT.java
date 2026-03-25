package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import com.okinc.im.bean.SearchResultData;
import com.okinc.okimcore.model.im.OKConversation;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC35180nqU;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class tGT extends tGG<C46088tHj, C46252tNl> {
    /* JADX DEBUG: Method merged with bridge method: copydefault(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/viewbinding/ViewBinding; */
    @Override // o.AbstractC47825txS
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public C46252tNl copydefault(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C46252tNl c46252tNlOLrzqt = C46252tNl.OLrzqt(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c46252tNlOLrzqt, "");
        return c46252tNlOLrzqt;
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Landroidx/viewbinding/ViewBinding;ILo/txV;)V */
    @Override // o.AbstractC47825txS
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public void AEQbTJ(@NotNull C46252tNl c46252tNl, int i, @NotNull final C46088tHj c46088tHj) {
        Intrinsics.checkNotNullParameter(c46252tNl, "");
        Intrinsics.checkNotNullParameter(c46088tHj, "");
        AppCompatImageView appCompatImageView = c46252tNl.copydefault;
        Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
        java.lang.String strEZpvd = c46088tHj.EZpvd();
        if (strEZpvd == null) {
            strEZpvd = "";
        }
        C33054mpH.loadAvatar$default(appCompatImageView, strEZpvd, null, null, 6, null);
        AppCompatTextView appCompatTextView = c46252tNl.AhwBna;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
        EZpvd(appCompatTextView, c46088tHj.OLrzqt());
        java.lang.String strAEQbTJ = c46088tHj.AEQbTJ();
        int i2 = 8;
        if (strAEQbTJ != null && strAEQbTJ.length() != 0) {
            AppCompatTextView appCompatTextView2 = c46252tNl.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(appCompatTextView2, "");
            appCompatTextView2.setVisibility(0);
            AppCompatTextView appCompatTextView3 = c46252tNl.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(appCompatTextView3, "");
            EZpvd(appCompatTextView3, c46088tHj.AEQbTJ());
        } else {
            AppCompatTextView appCompatTextView4 = c46252tNl.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(appCompatTextView4, "");
            appCompatTextView4.setVisibility(8);
        }
        android.widget.ImageView imageView = c46252tNl.KWHzl;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        if (c46088tHj.copydefault().getConversation() != null) {
            OKConversation conversation = c46088tHj.copydefault().getConversation();
            Intrinsics.copydefault(conversation);
            java.lang.Integer groupEntityType = conversation.getGroupEntityType();
            if (groupEntityType != null && groupEntityType.intValue() == 12) {
                i2 = 0;
            }
        }
        imageView.setVisibility(i2);
        android.widget.TextView textView = c46252tNl.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        tGZ.updateTagViewWithTagInfo$default(textView, c46088tHj.KWHzl(), 0, 2, null);
        c46252tNl.getRoot().setOnClickListener(new View.OnClickListener() { // from class: o.tGS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                tGT.KWHzl(this.KWHzl, c46088tHj, view);
            }
        });
    }

    public static final void KWHzl(tGT tgt, C46088tHj c46088tHj, android.view.View view) {
        Intrinsics.copydefault(view);
        tgt.KWHzl(view, c46088tHj.copydefault());
    }

    public final void KWHzl(android.view.View view, SearchResultData.GroupResult groupResult) {
        InterfaceC35180nqU interfaceC35180nqU = (InterfaceC35180nqU) C43251rlk.OLrzqt(InterfaceC35180nqU.class);
        if (interfaceC35180nqU != null) {
            android.content.Context context = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            OKConversation conversation = groupResult.getConversation();
            java.lang.String targetId = conversation != null ? conversation.getTargetId() : null;
            C59534zip adapter = getAdapter();
            AbstractC46077tGz abstractC46077tGz = adapter instanceof AbstractC46077tGz ? (AbstractC46077tGz) adapter : null;
            InterfaceC35180nqU.ActionBar.startChatActivity$default(interfaceC35180nqU, context, targetId, null, null, abstractC46077tGz != null ? abstractC46077tGz.KWHzl() : null, null, null, 108, null);
        }
    }
}
