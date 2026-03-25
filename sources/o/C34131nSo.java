package o;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.im.biz.group.contacts.GiftContactInfo;
import com.okinc.okimcore.model.other.GroupMemberInfo;
import kotlin.jvm.internal.Intrinsics;
import o.C34131nSo;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nSo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C34131nSo extends AbstractC35894oHq<GroupMemberInfo, ActionBar> {
    public StateListAnimator EZpvd;

    /* JADX INFO: renamed from: o.nSo$StateListAnimator */
    /* JADX INFO: loaded from: classes16.dex */
    public interface StateListAnimator {
        void OLrzqt(@NotNull GiftContactInfo giftContactInfo);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(@NotNull StateListAnimator stateListAnimator) {
        Intrinsics.checkNotNullParameter(stateListAnimator, "");
        this.EZpvd = stateListAnimator;
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Ljava/lang/Object;Ljava/lang/Object;)Z */
    @Override // o.AbstractC35894oHq
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
        return Intrinsics.EZpvd((java.lang.Object) groupMemberInfo.getMemberId(), (java.lang.Object) groupMemberInfo2.getMemberId()) && Intrinsics.EZpvd((java.lang.Object) groupMemberInfo.getGroupId(), (java.lang.Object) groupMemberInfo2.getGroupId());
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public ActionBar onCreateViewHolder(@NotNull android.view.ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C33933nLf c33933nLfKWHzl = C33933nLf.KWHzl(android.view.LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c33933nLfKWHzl, "");
        return new ActionBar(this, c33933nLfKWHzl);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull ActionBar actionBar, int i) {
        Intrinsics.checkNotNullParameter(actionBar, "");
        GroupMemberInfo groupMemberInfo = KWHzl().getCurrentList().get(i);
        Intrinsics.copydefault(groupMemberInfo, "");
        actionBar.EZpvd(groupMemberInfo);
    }

    /* JADX INFO: renamed from: o.nSo$ActionBar */
    public final class ActionBar extends RecyclerView.ViewHolder {
        public final /* synthetic */ C34131nSo KWHzl;
        public final C33933nLf copydefault;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActionBar(@NotNull C34131nSo c34131nSo, C33933nLf c33933nLf) {
            super(c33933nLf.getRoot());
            Intrinsics.checkNotNullParameter(c33933nLf, "");
            this.KWHzl = c34131nSo;
            this.copydefault = c33933nLf;
        }

        public final void EZpvd(@NotNull final GroupMemberInfo groupMemberInfo) {
            Intrinsics.checkNotNullParameter(groupMemberInfo, "");
            C33933nLf c33933nLf = this.copydefault;
            final C34131nSo c34131nSo = this.KWHzl;
            C34132nSp.KWHzl.OLrzqt(c33933nLf, groupMemberInfo);
            c33933nLf.getRoot().setOnClickListener(new View.OnClickListener() { // from class: o.nSm
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C34131nSo.ActionBar.KWHzl(groupMemberInfo, c34131nSo, view);
                }
            });
            int dimensionPixelSize = this.copydefault.getRoot().getContext().getResources().getDimensionPixelSize(C52761wXj.StateListAnimator.finit);
            int dimensionPixelSize2 = this.copydefault.getRoot().getContext().getResources().getDimensionPixelSize(C52761wXj.StateListAnimator.fFgQHt);
            c33933nLf.KWHzl.setPadding(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize2);
        }

        public static final void KWHzl(GroupMemberInfo groupMemberInfo, C34131nSo c34131nSo, android.view.View view) {
            GiftContactInfo giftContactInfo = new GiftContactInfo(groupMemberInfo.getAvatar(), C44157sFk.EZpvd(groupMemberInfo), groupMemberInfo.getMemberId());
            StateListAnimator stateListAnimator = c34131nSo.EZpvd;
            if (stateListAnimator != null) {
                stateListAnimator.OLrzqt(giftContactInfo);
            }
        }
    }
}
