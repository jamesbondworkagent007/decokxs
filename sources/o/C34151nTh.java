package o;

import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.im.bean.tag.TagSize;
import com.okinc.okimcore.model.other.GroupMemberInfo;
import com.okinc.okimcore.model.remote.OfficialTagInfo;
import com.okinc.okimcore.model.remote.OfficialTagType;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC34158nTo;
import o.C35399nuc;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nTh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C34151nTh extends RecyclerView.Adapter<Activity> {
    public java.util.List<AbstractC34158nTo.ActionBar> EZpvd = yDY.AhwBna();

    public final boolean OLrzqt(GroupMemberInfo groupMemberInfo) {
        java.util.List<OfficialTagType> supportTagTypes;
        OfficialTagInfo officialTags = groupMemberInfo.getOfficialTags();
        if (officialTags != null && (supportTagTypes = officialTags.getSupportTagTypes()) != null && !supportTagTypes.isEmpty()) {
            for (OfficialTagType officialTagType : supportTagTypes) {
                if (officialTagType == OfficialTagType.VipRM || officialTagType == OfficialTagType.VipSupport) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.EZpvd.size();
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public Activity onCreateViewHolder(@NotNull android.view.ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C34022nOn c34022nOnOLrzqt = C34022nOn.OLrzqt(android.view.LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c34022nOnOLrzqt, "");
        return new Activity(this, c34022nOnOLrzqt);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull Activity activity, int i) {
        Intrinsics.checkNotNullParameter(activity, "");
        activity.KWHzl(this.EZpvd.get(i));
    }

    /* JADX INFO: renamed from: o.nTh$Activity */
    public final class Activity extends RecyclerView.ViewHolder {
        public final /* synthetic */ C34151nTh KWHzl;
        public final C34022nOn copydefault;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull C34151nTh c34151nTh, C34022nOn c34022nOn) {
            super(c34022nOn.getRoot());
            Intrinsics.checkNotNullParameter(c34022nOn, "");
            this.KWHzl = c34151nTh;
            this.copydefault = c34022nOn;
        }

        public final void KWHzl(@NotNull AbstractC34158nTo.ActionBar actionBar) {
            Intrinsics.checkNotNullParameter(actionBar, "");
            GroupMemberInfo groupMemberInfoCopydefault = actionBar.copydefault();
            C34022nOn c34022nOn = this.copydefault;
            C35893oHp c35893oHp = c34022nOn.EZpvd;
            Intrinsics.checkNotNullExpressionValue(c35893oHp, "");
            C37716ozA.KWHzl(c35893oHp, groupMemberInfoCopydefault.getOfficialTags(), TagSize.DP_18);
            C35893oHp c35893oHp2 = c34022nOn.EZpvd;
            Intrinsics.checkNotNullExpressionValue(c35893oHp2, "");
            C35891oHn.OLrzqt(c35893oHp2, groupMemberInfoCopydefault, true);
            c34022nOn.copydefault.setText(actionBar.OLrzqt());
            android.content.Context context = this.copydefault.getRoot().getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            java.lang.String strKWHzl = KWHzl(context, groupMemberInfoCopydefault);
            android.widget.TextView textView = c34022nOn.KWHzl;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            textView.setVisibility(strKWHzl != null ? 0 : 8);
            c34022nOn.KWHzl.setText(strKWHzl);
        }

        public final java.lang.String KWHzl(android.content.Context context, GroupMemberInfo groupMemberInfo) {
            java.util.List<OfficialTagType> supportTagTypes;
            OfficialTagInfo officialTags = groupMemberInfo.getOfficialTags();
            if (officialTags != null && (supportTagTypes = officialTags.getSupportTagTypes()) != null) {
                if (!supportTagTypes.isEmpty()) {
                    java.util.Iterator<T> it = supportTagTypes.iterator();
                    while (it.hasNext()) {
                        if (((OfficialTagType) it.next()) == OfficialTagType.VipRM) {
                            return context.getString(C35399nuc.LoaderManager.OmPrLP);
                        }
                    }
                }
                if (!supportTagTypes.isEmpty()) {
                    java.util.Iterator<T> it2 = supportTagTypes.iterator();
                    while (it2.hasNext()) {
                        if (((OfficialTagType) it2.next()) == OfficialTagType.VipSupport) {
                            return context.getString(C35399nuc.LoaderManager.RYPzIz);
                        }
                    }
                }
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: o.nTh$StateListAnimator */
    public static final class StateListAnimator extends DiffUtil.Callback {
        public final java.util.List<AbstractC34158nTo.ActionBar> AEQbTJ;
        public final java.util.List<AbstractC34158nTo.ActionBar> OLrzqt;

        public StateListAnimator(@NotNull java.util.List<AbstractC34158nTo.ActionBar> list, @NotNull java.util.List<AbstractC34158nTo.ActionBar> list2) {
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(list2, "");
            this.OLrzqt = list;
            this.AEQbTJ = list2;
        }

        @Override // androidx.recyclerview.widget.DiffUtil.Callback
        public int getOldListSize() {
            return this.OLrzqt.size();
        }

        @Override // androidx.recyclerview.widget.DiffUtil.Callback
        public int getNewListSize() {
            return this.AEQbTJ.size();
        }

        @Override // androidx.recyclerview.widget.DiffUtil.Callback
        public boolean areItemsTheSame(int i, int i2) {
            return Intrinsics.EZpvd((java.lang.Object) this.OLrzqt.get(i).copydefault().getMemberId(), (java.lang.Object) this.AEQbTJ.get(i2).copydefault().getMemberId());
        }

        @Override // androidx.recyclerview.widget.DiffUtil.Callback
        public boolean areContentsTheSame(int i, int i2) {
            return Intrinsics.EZpvd(this.OLrzqt.get(i), this.AEQbTJ.get(i2));
        }
    }

    public final void EZpvd(@NotNull java.util.List<? extends AbstractC34158nTo> list) {
        Intrinsics.checkNotNullParameter(list, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            if (obj instanceof AbstractC34158nTo.ActionBar) {
                arrayList.add(obj);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj2 : arrayList) {
            if (OLrzqt(((AbstractC34158nTo.ActionBar) obj2).copydefault())) {
                arrayList2.add(obj2);
            }
        }
        DiffUtil.DiffResult diffResultCalculateDiff = DiffUtil.calculateDiff(new StateListAnimator(this.EZpvd, arrayList2));
        Intrinsics.checkNotNullExpressionValue(diffResultCalculateDiff, "");
        this.EZpvd = arrayList2;
        diffResultCalculateDiff.dispatchUpdatesTo(this);
    }
}
