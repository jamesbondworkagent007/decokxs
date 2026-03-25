package o;

import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.okimcore.model.im.RelationSourceType;
import com.okinc.okimcore.model.remote.OfficialTagInfo;
import com.okinc.okimcore.model.remote.RelationInfo;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C35399nuc;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oci, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C36531oci extends androidx.recyclerview.widget.ListAdapter<C36498ocB, Application> {
    public C36531oci() {
        super(new Activity());
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public Application onCreateViewHolder(@NotNull android.view.ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C34001nNt c34001nNtOLrzqt = C34001nNt.OLrzqt(android.view.LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c34001nNtOLrzqt, "");
        return new Application(c34001nNtOLrzqt);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull Application application, int i) {
        Intrinsics.checkNotNullParameter(application, "");
        C36498ocB item = getItem(i);
        Intrinsics.checkNotNullExpressionValue(item, "");
        application.OLrzqt(item);
    }

    /* JADX INFO: renamed from: o.oci$Application */
    public static final class Application extends RecyclerView.ViewHolder {
        public final C34001nNt AEQbTJ;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull C34001nNt c34001nNt) {
            super(c34001nNt.getRoot());
            Intrinsics.checkNotNullParameter(c34001nNt, "");
            this.AEQbTJ = c34001nNt;
        }

        public final void OLrzqt(@NotNull C36498ocB c36498ocB) {
            Intrinsics.checkNotNullParameter(c36498ocB, "");
            this.AEQbTJ.AYXKKw.setText(c36498ocB.gEmmrt());
            this.AEQbTJ.OLrzqt.setText(c36498ocB.AYXKKw() ? C33070mpX.AYXKKw(C35399nuc.LoaderManager.invokespecialhOMIpD) : c36498ocB.AEQbTJ());
            this.AEQbTJ.OLrzqt.setTextColor(c36498ocB.AYXKKw() ? C33070mpX.copydefault(C52761wXj.Activity.QwvEab) : C33070mpX.copydefault(C52761wXj.Activity.fdOvFl));
            java.lang.String strEZpvd = C36528ocf.EZpvd(c36498ocB.djBIcL());
            android.widget.TextView textView = this.AEQbTJ.KWHzl;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            textView.setVisibility(strEZpvd != null ? 0 : 8);
            if (strEZpvd != null) {
                this.AEQbTJ.KWHzl.setText(strEZpvd);
            }
            android.widget.ImageView imageView = this.AEQbTJ.djBIcL;
            Intrinsics.copydefault(imageView);
            OfficialTagInfo officialTagInfoKWHzl = c36498ocB.KWHzl();
            imageView.setVisibility((officialTagInfoKWHzl == null || !officialTagInfoKWHzl.containOfficialType()) ? 8 : 0);
            imageView.setColorFilter(C33070mpX.copydefault(C52761wXj.Activity.dvKsVJ));
            if (c36498ocB.KWHzl() != null) {
                OfficialTagInfo officialTagInfoKWHzl2 = c36498ocB.KWHzl();
                boolean zContainOfficialType = c36498ocB.KWHzl().containOfficialType();
                boolean zContainOfficialTypeOnly = c36498ocB.KWHzl().containOfficialTypeOnly();
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append("message.officialTagInfo: ");
                sb.append(officialTagInfoKWHzl2);
                sb.append(", containOfficialType: ");
                sb.append(zContainOfficialType);
                sb.append(", !containOfficialTypeOnly: ");
                sb.append(!zContainOfficialTypeOnly);
                pUU.EZpvd("LivestreamChatAdapter", sb.toString());
                android.widget.TextView textView2 = this.AEQbTJ.AEQbTJ;
                Intrinsics.copydefault(textView2);
                textView2.setVisibility(c36498ocB.KWHzl().containOfficialTypeOnly() ^ true ? 0 : 8);
                C37716ozA.updateTagViewWithTagInfo$default(textView2, OfficialTagInfo.copy$default(c36498ocB.KWHzl(), null, null, null, c36498ocB.KWHzl().getSupportTagsWithoutOfficial(), 7, null), 0, null, true, false, false, 54, null);
            }
            C35893oHp c35893oHp = this.AEQbTJ.EZpvd;
            Intrinsics.checkNotNullExpressionValue(c35893oHp, "");
            java.lang.String strOLrzqt = c36498ocB.OLrzqt();
            C35891oHn.OLrzqt(c35893oHp, new RelationInfo((java.lang.String) null, strOLrzqt == null ? "" : strOLrzqt, "", "", (java.lang.String) null, false, false, false, false, false, false, false, (java.lang.String) null, (OfficialTagInfo) null, 0L, false, (java.lang.String) null, (java.lang.String) null, (java.lang.Boolean) null, (java.lang.Boolean) null, (java.lang.Boolean) null, (java.lang.Boolean) null, (RelationSourceType) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.Boolean) null, (java.lang.Boolean) null, (java.lang.Boolean) null, (java.lang.Boolean) null, (java.lang.Boolean) null, (java.lang.String) null, (java.lang.Integer) null, (java.lang.Boolean) null, (java.lang.Boolean) null, (java.lang.Boolean) null, (java.lang.String) null, (java.lang.Boolean) null, -15, 63, (DefaultConstructorMarker) null));
        }
    }

    /* JADX INFO: renamed from: o.oci$Activity */
    public static final class Activity extends DiffUtil.ItemCallback<C36498ocB> {
        /* JADX DEBUG: Method merged with bridge method: areItemsTheSame(Ljava/lang/Object;Ljava/lang/Object;)Z */
        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public boolean areItemsTheSame(@NotNull C36498ocB c36498ocB, @NotNull C36498ocB c36498ocB2) {
            Intrinsics.checkNotNullParameter(c36498ocB, "");
            Intrinsics.checkNotNullParameter(c36498ocB2, "");
            java.lang.String strCopydefault = c36498ocB.copydefault();
            java.lang.String strCopydefault2 = c36498ocB2.copydefault();
            if (strCopydefault == null || strCopydefault2 == null) {
                return c36498ocB.EZpvd() == c36498ocB2.EZpvd();
            }
            return Intrinsics.EZpvd((java.lang.Object) strCopydefault, (java.lang.Object) strCopydefault2);
        }

        /* JADX DEBUG: Method merged with bridge method: areContentsTheSame(Ljava/lang/Object;Ljava/lang/Object;)Z */
        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public boolean areContentsTheSame(@NotNull C36498ocB c36498ocB, @NotNull C36498ocB c36498ocB2) {
            Intrinsics.checkNotNullParameter(c36498ocB, "");
            Intrinsics.checkNotNullParameter(c36498ocB2, "");
            return Intrinsics.EZpvd(c36498ocB, c36498ocB2);
        }
    }
}
