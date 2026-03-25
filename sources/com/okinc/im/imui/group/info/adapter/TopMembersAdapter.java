package com.okinc.im.imui.group.info.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.im.bean.tag.TagSize;
import com.okinc.okimcore.model.other.GroupMemberInfo;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC34158nTo;
import o.AbstractC35894oHq;
import o.C33070mpX;
import o.C35399nuc;
import o.C35891oHn;
import o.C35893oHp;
import o.C37716ozA;
import o.C55296xhK;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import o.nLB;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class TopMembersAdapter extends AbstractC35894oHq<AbstractC34158nTo, RecyclerView.ViewHolder> {
    public ActionBar AEQbTJ;
    public boolean EZpvd;

    public interface ActionBar {
        void OLrzqt(@NotNull GroupMemberInfo groupMemberInfo);

        void copydefault();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(@NotNull ActionBar actionBar) {
        Intrinsics.checkNotNullParameter(actionBar, "");
        this.AEQbTJ = actionBar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(boolean z) {
        this.EZpvd = z;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class ItemType {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ ItemType[] $VALUES;
        public static final ItemType TOP_MEMBER = new ItemType("TOP_MEMBER", 0);
        public static final ItemType ADD_MEMBER = new ItemType("ADD_MEMBER", 1);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ ItemType[] $values() {
            return new ItemType[]{TOP_MEMBER, ADD_MEMBER};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<ItemType> getEntries() {
            return $ENTRIES;
        }

        private ItemType(String str, int i) {
        }

        static {
            ItemType[] itemTypeArr$values = $values();
            $VALUES = itemTypeArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(itemTypeArr$values);
        }

        public static ItemType valueOf(String str) {
            return (ItemType) Enum.valueOf(ItemType.class, str);
        }

        public static ItemType[] values() {
            return (ItemType[]) $VALUES.clone();
        }
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Ljava/lang/Object;Ljava/lang/Object;)Z */
    @Override // o.AbstractC35894oHq
    public boolean OLrzqt(@NotNull AbstractC34158nTo abstractC34158nTo, @NotNull AbstractC34158nTo abstractC34158nTo2) {
        Intrinsics.checkNotNullParameter(abstractC34158nTo, "");
        Intrinsics.checkNotNullParameter(abstractC34158nTo2, "");
        if ((abstractC34158nTo instanceof AbstractC34158nTo.StateListAnimator) && (abstractC34158nTo2 instanceof AbstractC34158nTo.StateListAnimator)) {
            return true;
        }
        if ((abstractC34158nTo instanceof AbstractC34158nTo.ActionBar) && (abstractC34158nTo2 instanceof AbstractC34158nTo.ActionBar)) {
            return Intrinsics.EZpvd((Object) ((AbstractC34158nTo.ActionBar) abstractC34158nTo).copydefault().getMemberId(), (Object) ((AbstractC34158nTo.ActionBar) abstractC34158nTo2).copydefault().getMemberId());
        }
        return false;
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;Ljava/lang/Object;)Z */
    @Override // o.AbstractC35894oHq
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public boolean KWHzl(@NotNull AbstractC34158nTo abstractC34158nTo, @NotNull AbstractC34158nTo abstractC34158nTo2) {
        Intrinsics.checkNotNullParameter(abstractC34158nTo, "");
        Intrinsics.checkNotNullParameter(abstractC34158nTo2, "");
        if (!(abstractC34158nTo instanceof AbstractC34158nTo.StateListAnimator) || !(abstractC34158nTo2 instanceof AbstractC34158nTo.StateListAnimator)) {
            if ((abstractC34158nTo instanceof AbstractC34158nTo.ActionBar) && (abstractC34158nTo2 instanceof AbstractC34158nTo.ActionBar)) {
                AbstractC34158nTo.ActionBar actionBar = (AbstractC34158nTo.ActionBar) abstractC34158nTo;
                AbstractC34158nTo.ActionBar actionBar2 = (AbstractC34158nTo.ActionBar) abstractC34158nTo2;
                if (!Intrinsics.EZpvd((Object) actionBar.OLrzqt(), (Object) actionBar2.OLrzqt()) || !Intrinsics.EZpvd((Object) actionBar.copydefault().getAvatar(), (Object) actionBar2.copydefault().getAvatar()) || actionBar.copydefault().getRole() != actionBar2.copydefault().getRole()) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        AbstractC34158nTo abstractC34158nTo = KWHzl().getCurrentList().get(i);
        if (abstractC34158nTo instanceof AbstractC34158nTo.ActionBar) {
            return ItemType.TOP_MEMBER.ordinal();
        }
        if (abstractC34158nTo instanceof AbstractC34158nTo.StateListAnimator) {
            return ItemType.ADD_MEMBER.ordinal();
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(@NotNull ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        nLB nlbEZpvd = nLB.EZpvd(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(nlbEZpvd, "");
        if (i == ItemType.TOP_MEMBER.ordinal()) {
            return new StateListAnimator(this, nlbEZpvd);
        }
        if (i == ItemType.ADD_MEMBER.ordinal()) {
            return new Activity(this, nlbEZpvd);
        }
        throw new IllegalArgumentException("Invalid view type");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull RecyclerView.ViewHolder viewHolder, int i) {
        Intrinsics.checkNotNullParameter(viewHolder, "");
        if (viewHolder instanceof StateListAnimator) {
            AbstractC34158nTo abstractC34158nTo = KWHzl().getCurrentList().get(i);
            Intrinsics.copydefault(abstractC34158nTo, "");
            AbstractC34158nTo.ActionBar actionBar = (AbstractC34158nTo.ActionBar) abstractC34158nTo;
            ((StateListAnimator) viewHolder).AEQbTJ(actionBar.copydefault(), actionBar.OLrzqt());
            return;
        }
        if (viewHolder instanceof Activity) {
            ((Activity) viewHolder).OLrzqt();
            return;
        }
        throw new IllegalArgumentException("Invalid view holder type");
    }

    public final class StateListAnimator extends RecyclerView.ViewHolder {
        public final nLB OLrzqt;
        public final /* synthetic */ TopMembersAdapter copydefault;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull TopMembersAdapter topMembersAdapter, nLB nlb) {
            super(nlb.getRoot());
            Intrinsics.checkNotNullParameter(nlb, "");
            this.copydefault = topMembersAdapter;
            this.OLrzqt = nlb;
        }

        public final void AEQbTJ(@NotNull GroupMemberInfo groupMemberInfo, @NotNull String str) {
            Intrinsics.checkNotNullParameter(groupMemberInfo, "");
            Intrinsics.checkNotNullParameter(str, "");
            nLB nlb = this.OLrzqt;
            TopMembersAdapter topMembersAdapter = this.copydefault;
            C35893oHp c35893oHp = nlb.copydefault;
            Intrinsics.checkNotNullExpressionValue(c35893oHp, "");
            C37716ozA.KWHzl(c35893oHp, groupMemberInfo.getOfficialTags(), TagSize.DP_18);
            C35893oHp c35893oHp2 = nlb.copydefault;
            Intrinsics.checkNotNullExpressionValue(c35893oHp2, "");
            C35891oHn.OLrzqt(c35893oHp2, groupMemberInfo, topMembersAdapter.AEQbTJ());
            nlb.KWHzl.setText(str);
            LinearLayout linearLayout = nlb.EZpvd;
            linearLayout.setOnClickListener(new ActionBar(linearLayout, 1000L, topMembersAdapter, groupMemberInfo));
        }

        public static final class ActionBar implements View.OnClickListener {
            public final /* synthetic */ View AEQbTJ;
            public final /* synthetic */ GroupMemberInfo EZpvd;
            public final /* synthetic */ long KWHzl;
            public final /* synthetic */ TopMembersAdapter copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public ActionBar(View view, long j, TopMembersAdapter topMembersAdapter, GroupMemberInfo groupMemberInfo) {
                this.AEQbTJ = view;
                this.KWHzl = j;
                this.copydefault = topMembersAdapter;
                this.EZpvd = groupMemberInfo;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.KWHzl || (this.AEQbTJ instanceof Checkable)) {
                    C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                    ActionBar actionBar = this.copydefault.AEQbTJ;
                    if (actionBar != null) {
                        actionBar.OLrzqt(this.EZpvd);
                    }
                }
            }
        }
    }

    public final class Activity extends RecyclerView.ViewHolder {
        public final /* synthetic */ TopMembersAdapter AEQbTJ;
        public final nLB KWHzl;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull TopMembersAdapter topMembersAdapter, nLB nlb) {
            super(nlb.getRoot());
            Intrinsics.checkNotNullParameter(nlb, "");
            this.AEQbTJ = topMembersAdapter;
            this.KWHzl = nlb;
        }

        public final void OLrzqt() {
            nLB nlb = this.KWHzl;
            TopMembersAdapter topMembersAdapter = this.AEQbTJ;
            int i = C35399nuc.ActionBar.DTwDnp;
            Context context = nlb.copydefault.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            nlb.copydefault.setImageDrawable(C33070mpX.EZpvd(i, context));
            LinearLayout linearLayout = nlb.EZpvd;
            linearLayout.setOnClickListener(new ActionBar(linearLayout, 1000L, topMembersAdapter));
        }

        public static final class ActionBar implements View.OnClickListener {
            public final /* synthetic */ TopMembersAdapter EZpvd;
            public final /* synthetic */ View OLrzqt;
            public final /* synthetic */ long copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public ActionBar(View view, long j, TopMembersAdapter topMembersAdapter) {
                this.OLrzqt = view;
                this.copydefault = j;
                this.EZpvd = topMembersAdapter;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.copydefault || (this.OLrzqt instanceof Checkable)) {
                    C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                    ActionBar actionBar = this.EZpvd.AEQbTJ;
                    if (actionBar != null) {
                        actionBar.copydefault();
                    }
                }
            }
        }
    }
}
