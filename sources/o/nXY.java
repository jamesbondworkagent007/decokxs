package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.im.bean.tag.TagSize;
import com.okinc.okimcore.model.other.GroupMemberInfo;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class nXY extends AbstractC35894oHq<GroupMemberInfo, TaskDescription> {
    public ActionBar OLrzqt;

    /* JADX INFO: loaded from: classes16.dex */
    public interface ActionBar {
        void EZpvd(@NotNull java.lang.String str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(@NotNull ActionBar actionBar) {
        Intrinsics.checkNotNullParameter(actionBar, "");
        this.OLrzqt = actionBar;
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Ljava/lang/Object;Ljava/lang/Object;)Z */
    @Override // o.AbstractC35894oHq
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public boolean OLrzqt(@NotNull GroupMemberInfo groupMemberInfo, @NotNull GroupMemberInfo groupMemberInfo2) {
        Intrinsics.checkNotNullParameter(groupMemberInfo, "");
        Intrinsics.checkNotNullParameter(groupMemberInfo2, "");
        return Intrinsics.EZpvd((java.lang.Object) groupMemberInfo.getMemberId(), (java.lang.Object) groupMemberInfo2.getMemberId());
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;Ljava/lang/Object;)Z */
    @Override // o.AbstractC35894oHq
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public boolean KWHzl(@NotNull GroupMemberInfo groupMemberInfo, @NotNull GroupMemberInfo groupMemberInfo2) {
        Intrinsics.checkNotNullParameter(groupMemberInfo, "");
        Intrinsics.checkNotNullParameter(groupMemberInfo2, "");
        return Intrinsics.EZpvd((java.lang.Object) groupMemberInfo.getMemberId(), (java.lang.Object) groupMemberInfo2.getMemberId()) && Intrinsics.EZpvd((java.lang.Object) groupMemberInfo.getNickName(), (java.lang.Object) groupMemberInfo2.getNickName()) && Intrinsics.EZpvd((java.lang.Object) groupMemberInfo.getRemarkName(), (java.lang.Object) groupMemberInfo2.getRemarkName()) && Intrinsics.EZpvd((java.lang.Object) groupMemberInfo.getAvatar(), (java.lang.Object) groupMemberInfo2.getAvatar()) && Intrinsics.EZpvd(groupMemberInfo.getOfficialTags(), groupMemberInfo2.getOfficialTags());
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public TaskDescription onCreateViewHolder(@NotNull android.view.ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C34013nOe c34013nOeOLrzqt = C34013nOe.OLrzqt(android.view.LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c34013nOeOLrzqt, "");
        return new TaskDescription(this, c34013nOeOLrzqt);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull TaskDescription taskDescription, int i) {
        Intrinsics.checkNotNullParameter(taskDescription, "");
        GroupMemberInfo groupMemberInfo = KWHzl().getCurrentList().get(i);
        Intrinsics.checkNotNullExpressionValue(groupMemberInfo, "");
        taskDescription.KWHzl(groupMemberInfo);
    }

    public final class TaskDescription extends RecyclerView.ViewHolder {
        public final C34013nOe OLrzqt;
        public final /* synthetic */ nXY copydefault;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TaskDescription(@NotNull nXY nxy, C34013nOe c34013nOe) {
            super(c34013nOe.getRoot());
            Intrinsics.checkNotNullParameter(c34013nOe, "");
            this.copydefault = nxy;
            this.OLrzqt = c34013nOe;
        }

        public final void KWHzl(@NotNull GroupMemberInfo groupMemberInfo) {
            Intrinsics.checkNotNullParameter(groupMemberInfo, "");
            C34013nOe c34013nOe = this.OLrzqt;
            nXY nxy = this.copydefault;
            c34013nOe.copydefault.setText(C44157sFk.EZpvd(groupMemberInfo));
            C35893oHp c35893oHp = c34013nOe.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(c35893oHp, "");
            C37716ozA.KWHzl(c35893oHp, groupMemberInfo.getOfficialTags(), TagSize.DP_18);
            C35893oHp c35893oHp2 = c34013nOe.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(c35893oHp2, "");
            C35891oHn.KWHzl(c35893oHp2, groupMemberInfo);
            c34013nOe.EZpvd.bringToFront();
            ConstraintLayout root = c34013nOe.getRoot();
            root.setOnClickListener(new ViewOnClickListenerC0895TaskDescription(root, 1000L, nxy, groupMemberInfo));
        }

        /* JADX INFO: renamed from: o.nXY$TaskDescription$TaskDescription, reason: collision with other inner class name */
        public static final class ViewOnClickListenerC0895TaskDescription implements View.OnClickListener {
            public final /* synthetic */ GroupMemberInfo EZpvd;
            public final /* synthetic */ nXY KWHzl;
            public final /* synthetic */ android.view.View OLrzqt;
            public final /* synthetic */ long copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public ViewOnClickListenerC0895TaskDescription(android.view.View view, long j, nXY nxy, GroupMemberInfo groupMemberInfo) {
                this.OLrzqt = view;
                this.copydefault = j;
                this.KWHzl = nxy;
                this.EZpvd = groupMemberInfo;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.copydefault || (this.OLrzqt instanceof android.widget.Checkable)) {
                    C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                    ActionBar actionBar = this.KWHzl.OLrzqt;
                    if (actionBar != null) {
                        actionBar.EZpvd(this.EZpvd.getMemberId());
                    }
                }
            }
        }
    }
}
