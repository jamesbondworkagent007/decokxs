package com.okinc.okex.search.ui.adapter;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;
import android.widget.TextView;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.okex.search.ui.displaymodels.SearchArticleDisplayModel;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC44050sBm;
import o.AbstractC45381soi;
import o.AbstractC47396tpJ;
import o.AbstractC47401tpO;
import o.C33070mpX;
import o.C52761wXj;
import o.C55296xhK;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class SupportSearchHistoryAdapter extends AbstractC45381soi<AbstractC44050sBm, TaskDescription> {
    public StateListAnimator AEQbTJ;

    /* JADX INFO: loaded from: classes16.dex */
    public interface StateListAnimator {
        void copydefault(@NotNull SearchArticleDisplayModel searchArticleDisplayModel);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(@NotNull StateListAnimator stateListAnimator) {
        Intrinsics.checkNotNullParameter(stateListAnimator, "");
        this.AEQbTJ = stateListAnimator;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class ItemType {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ ItemType[] $VALUES;
        public static final ItemType SECTION_HEADER = new ItemType("SECTION_HEADER", 0);
        public static final ItemType RECENTLY_VIEWED_ARTICLE = new ItemType("RECENTLY_VIEWED_ARTICLE", 1);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ ItemType[] $values() {
            return new ItemType[]{SECTION_HEADER, RECENTLY_VIEWED_ARTICLE};
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

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;Ljava/lang/Object;)Z */
    @Override // o.AbstractC45381soi
    /* JADX INFO: renamed from: copydefault, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public boolean KWHzl(@NotNull AbstractC44050sBm abstractC44050sBm, @NotNull AbstractC44050sBm abstractC44050sBm2) {
        Intrinsics.checkNotNullParameter(abstractC44050sBm, "");
        Intrinsics.checkNotNullParameter(abstractC44050sBm2, "");
        if ((abstractC44050sBm instanceof AbstractC44050sBm.ActionBar) && (abstractC44050sBm2 instanceof AbstractC44050sBm.ActionBar)) {
            return Intrinsics.EZpvd((Object) ((AbstractC44050sBm.ActionBar) abstractC44050sBm).OLrzqt(), (Object) ((AbstractC44050sBm.ActionBar) abstractC44050sBm2).OLrzqt());
        }
        if ((abstractC44050sBm instanceof AbstractC44050sBm.TaskDescription) && (abstractC44050sBm2 instanceof AbstractC44050sBm.TaskDescription)) {
            return Intrinsics.EZpvd((Object) ((AbstractC44050sBm.TaskDescription) abstractC44050sBm).copydefault().getSlug(), (Object) ((AbstractC44050sBm.TaskDescription) abstractC44050sBm2).copydefault().getSlug());
        }
        return false;
    }

    /* JADX DEBUG: Method merged with bridge method: copydefault(Ljava/lang/Object;Ljava/lang/Object;)Z */
    @Override // o.AbstractC45381soi
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public boolean copydefault(@NotNull AbstractC44050sBm abstractC44050sBm, @NotNull AbstractC44050sBm abstractC44050sBm2) {
        Intrinsics.checkNotNullParameter(abstractC44050sBm, "");
        Intrinsics.checkNotNullParameter(abstractC44050sBm2, "");
        if (!(abstractC44050sBm instanceof AbstractC44050sBm.ActionBar) || !(abstractC44050sBm2 instanceof AbstractC44050sBm.ActionBar)) {
            if ((abstractC44050sBm instanceof AbstractC44050sBm.TaskDescription) && (abstractC44050sBm2 instanceof AbstractC44050sBm.TaskDescription)) {
                AbstractC44050sBm.TaskDescription taskDescription = (AbstractC44050sBm.TaskDescription) abstractC44050sBm;
                AbstractC44050sBm.TaskDescription taskDescription2 = (AbstractC44050sBm.TaskDescription) abstractC44050sBm2;
                if (!Intrinsics.EZpvd((Object) taskDescription.copydefault().getTitle(), (Object) taskDescription2.copydefault().getTitle()) || !Intrinsics.EZpvd((Object) taskDescription.copydefault().getUrl(), (Object) taskDescription2.copydefault().getUrl()) || taskDescription.copydefault().getPublishTime() != taskDescription2.copydefault().getPublishTime() || taskDescription.copydefault().getUpdateTime() != taskDescription2.copydefault().getUpdateTime() || taskDescription.copydefault().getOkxLikesNums() != taskDescription2.copydefault().getOkxLikesNums() || !Intrinsics.EZpvd((Object) taskDescription.copydefault().getCategoryName(), (Object) taskDescription2.copydefault().getCategoryName()) || taskDescription.copydefault().getCategorySlug() != taskDescription2.copydefault().getCategorySlug()) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public TaskDescription onCreateViewHolder(@NotNull ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
        if (i == ItemType.SECTION_HEADER.ordinal()) {
            AbstractC47401tpO abstractC47401tpOOLrzqt = AbstractC47401tpO.OLrzqt(layoutInflaterFrom, viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(abstractC47401tpOOLrzqt, "");
            return new Application(this, abstractC47401tpOOLrzqt);
        }
        if (i == ItemType.RECENTLY_VIEWED_ARTICLE.ordinal()) {
            AbstractC47396tpJ abstractC47396tpJAEQbTJ = AbstractC47396tpJ.AEQbTJ(layoutInflaterFrom, viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(abstractC47396tpJAEQbTJ, "");
            TextView textView = abstractC47396tpJAEQbTJ.EZpvd;
            Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
            Drawable drawable = compoundDrawablesRelative[0];
            if (drawable != null) {
                DrawableCompat.setTint(drawable, C33070mpX.copydefault(C52761wXj.Activity.fdOvFl));
            } else {
                drawable = null;
            }
            Drawable drawable2 = compoundDrawablesRelative[2];
            if (drawable2 != null) {
                DrawableCompat.setTint(drawable2, C33070mpX.copydefault(C52761wXj.Activity.QwvEab));
            } else {
                drawable2 = null;
            }
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, (Drawable) null, drawable2, (Drawable) null);
            return new Activity(this, abstractC47396tpJAEQbTJ);
        }
        throw new IllegalArgumentException("Unrecognised view type");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        AbstractC44050sBm abstractC44050sBm = copydefault().getCurrentList().get(i);
        if (abstractC44050sBm instanceof AbstractC44050sBm.ActionBar) {
            return ItemType.SECTION_HEADER.ordinal();
        }
        if (abstractC44050sBm instanceof AbstractC44050sBm.TaskDescription) {
            return ItemType.RECENTLY_VIEWED_ARTICLE.ordinal();
        }
        throw new IllegalArgumentException("Unrecognised display model");
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull TaskDescription taskDescription, int i) {
        Intrinsics.checkNotNullParameter(taskDescription, "");
        AbstractC44050sBm abstractC44050sBm = copydefault().getCurrentList().get(i);
        Intrinsics.checkNotNullExpressionValue(abstractC44050sBm, "");
        taskDescription.OLrzqt(abstractC44050sBm);
    }

    public static abstract class TaskDescription extends RecyclerView.ViewHolder {
        public abstract void OLrzqt(@NotNull AbstractC44050sBm abstractC44050sBm);

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TaskDescription(@NotNull ViewDataBinding viewDataBinding) {
            super(viewDataBinding.getRoot());
            Intrinsics.checkNotNullParameter(viewDataBinding, "");
        }
    }

    public final class Application extends TaskDescription {
        public final /* synthetic */ SupportSearchHistoryAdapter AEQbTJ;
        public final AbstractC47401tpO copydefault;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull SupportSearchHistoryAdapter supportSearchHistoryAdapter, AbstractC47401tpO abstractC47401tpO) {
            super(abstractC47401tpO);
            Intrinsics.checkNotNullParameter(abstractC47401tpO, "");
            this.AEQbTJ = supportSearchHistoryAdapter;
            this.copydefault = abstractC47401tpO;
        }

        @Override // com.okinc.okex.search.ui.adapter.SupportSearchHistoryAdapter.TaskDescription
        public void OLrzqt(@NotNull AbstractC44050sBm abstractC44050sBm) {
            Intrinsics.checkNotNullParameter(abstractC44050sBm, "");
            if ((abstractC44050sBm instanceof AbstractC44050sBm.ActionBar ? (AbstractC44050sBm.ActionBar) abstractC44050sBm : null) != null) {
                this.copydefault.OLrzqt.setText(((AbstractC44050sBm.ActionBar) abstractC44050sBm).OLrzqt());
            }
        }
    }

    public final class Activity extends TaskDescription {
        public final AbstractC47396tpJ KWHzl;
        public final /* synthetic */ SupportSearchHistoryAdapter copydefault;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull SupportSearchHistoryAdapter supportSearchHistoryAdapter, AbstractC47396tpJ abstractC47396tpJ) {
            super(abstractC47396tpJ);
            Intrinsics.checkNotNullParameter(abstractC47396tpJ, "");
            this.copydefault = supportSearchHistoryAdapter;
            this.KWHzl = abstractC47396tpJ;
        }

        @Override // com.okinc.okex.search.ui.adapter.SupportSearchHistoryAdapter.TaskDescription
        public void OLrzqt(@NotNull AbstractC44050sBm abstractC44050sBm) {
            Intrinsics.checkNotNullParameter(abstractC44050sBm, "");
            if ((abstractC44050sBm instanceof AbstractC44050sBm.TaskDescription ? (AbstractC44050sBm.TaskDescription) abstractC44050sBm : null) != null) {
                SupportSearchHistoryAdapter supportSearchHistoryAdapter = this.copydefault;
                AbstractC47396tpJ abstractC47396tpJ = this.KWHzl;
                abstractC47396tpJ.EZpvd.setText(((AbstractC44050sBm.TaskDescription) abstractC44050sBm).copydefault().getTitle());
                View root = abstractC47396tpJ.getRoot();
                root.setOnClickListener(new TaskDescription(root, 1000L, supportSearchHistoryAdapter, abstractC44050sBm));
            }
        }

        public static final class TaskDescription implements View.OnClickListener {
            public final /* synthetic */ AbstractC44050sBm EZpvd;
            public final /* synthetic */ View KWHzl;
            public final /* synthetic */ long OLrzqt;
            public final /* synthetic */ SupportSearchHistoryAdapter copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public TaskDescription(View view, long j, SupportSearchHistoryAdapter supportSearchHistoryAdapter, AbstractC44050sBm abstractC44050sBm) {
                this.KWHzl = view;
                this.OLrzqt = j;
                this.copydefault = supportSearchHistoryAdapter;
                this.EZpvd = abstractC44050sBm;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.OLrzqt || (this.KWHzl instanceof Checkable)) {
                    C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                    StateListAnimator stateListAnimator = this.copydefault.AEQbTJ;
                    if (stateListAnimator != null) {
                        stateListAnimator.copydefault(((AbstractC44050sBm.TaskDescription) this.EZpvd).copydefault());
                    }
                }
            }
        }
    }
}
