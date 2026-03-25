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
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC44051sBn;
import o.AbstractC45381soi;
import o.AbstractC47400tpN;
import o.AbstractC47401tpO;
import o.AbstractC47403tpQ;
import o.C33070mpX;
import o.C52761wXj;
import o.C55296xhK;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class SupportSearchSuggestionsAdapter extends AbstractC45381soi<AbstractC44051sBn, Application> {
    public ActionBar OLrzqt;

    /* JADX INFO: loaded from: classes16.dex */
    public interface ActionBar {
        void KWHzl(@NotNull AbstractC44051sBn.Application application);

        void KWHzl(@NotNull AbstractC44051sBn.TaskDescription taskDescription);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(@NotNull ActionBar actionBar) {
        Intrinsics.checkNotNullParameter(actionBar, "");
        this.OLrzqt = actionBar;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class ItemType {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ ItemType[] $VALUES;
        public static final ItemType SEARCH_INTENT = new ItemType("SEARCH_INTENT", 0);
        public static final ItemType SECTION_HEADER = new ItemType("SECTION_HEADER", 1);
        public static final ItemType RECENTLY_UPDATED_ARTICLE = new ItemType("RECENTLY_UPDATED_ARTICLE", 2);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ ItemType[] $values() {
            return new ItemType[]{SEARCH_INTENT, SECTION_HEADER, RECENTLY_UPDATED_ARTICLE};
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
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public boolean KWHzl(@NotNull AbstractC44051sBn abstractC44051sBn, @NotNull AbstractC44051sBn abstractC44051sBn2) {
        Intrinsics.checkNotNullParameter(abstractC44051sBn, "");
        Intrinsics.checkNotNullParameter(abstractC44051sBn2, "");
        if ((abstractC44051sBn instanceof AbstractC44051sBn.TaskDescription) && (abstractC44051sBn2 instanceof AbstractC44051sBn.TaskDescription)) {
            return Intrinsics.EZpvd((Object) ((AbstractC44051sBn.TaskDescription) abstractC44051sBn).KWHzl(), (Object) ((AbstractC44051sBn.TaskDescription) abstractC44051sBn2).KWHzl());
        }
        if ((abstractC44051sBn instanceof AbstractC44051sBn.Activity) && (abstractC44051sBn2 instanceof AbstractC44051sBn.Activity)) {
            return Intrinsics.EZpvd((Object) ((AbstractC44051sBn.Activity) abstractC44051sBn).EZpvd(), (Object) ((AbstractC44051sBn.Activity) abstractC44051sBn2).EZpvd());
        }
        if ((abstractC44051sBn instanceof AbstractC44051sBn.Application) && (abstractC44051sBn2 instanceof AbstractC44051sBn.Application)) {
            return Intrinsics.EZpvd((Object) ((AbstractC44051sBn.Application) abstractC44051sBn).KWHzl().getSlug(), (Object) ((AbstractC44051sBn.Application) abstractC44051sBn2).KWHzl().getSlug());
        }
        return false;
    }

    /* JADX DEBUG: Method merged with bridge method: copydefault(Ljava/lang/Object;Ljava/lang/Object;)Z */
    @Override // o.AbstractC45381soi
    /* JADX INFO: renamed from: KWHzl, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public boolean copydefault(@NotNull AbstractC44051sBn abstractC44051sBn, @NotNull AbstractC44051sBn abstractC44051sBn2) {
        Intrinsics.checkNotNullParameter(abstractC44051sBn, "");
        Intrinsics.checkNotNullParameter(abstractC44051sBn2, "");
        if ((abstractC44051sBn instanceof AbstractC44051sBn.TaskDescription) && (abstractC44051sBn2 instanceof AbstractC44051sBn.TaskDescription)) {
            return Intrinsics.EZpvd((Object) ((AbstractC44051sBn.TaskDescription) abstractC44051sBn).AEQbTJ(), (Object) ((AbstractC44051sBn.TaskDescription) abstractC44051sBn2).AEQbTJ());
        }
        if (!(abstractC44051sBn instanceof AbstractC44051sBn.Activity) || !(abstractC44051sBn2 instanceof AbstractC44051sBn.Activity)) {
            if ((abstractC44051sBn instanceof AbstractC44051sBn.Application) && (abstractC44051sBn2 instanceof AbstractC44051sBn.Application)) {
                AbstractC44051sBn.Application application = (AbstractC44051sBn.Application) abstractC44051sBn;
                AbstractC44051sBn.Application application2 = (AbstractC44051sBn.Application) abstractC44051sBn2;
                if (!Intrinsics.EZpvd((Object) application.KWHzl().getTitle(), (Object) application2.KWHzl().getTitle()) || !Intrinsics.EZpvd((Object) application.KWHzl().getUrl(), (Object) application2.KWHzl().getUrl()) || application.KWHzl().getCategorySlug() != application2.KWHzl().getCategorySlug()) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public Application onCreateViewHolder(@NotNull ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
        if (i == ItemType.SEARCH_INTENT.ordinal()) {
            AbstractC47400tpN abstractC47400tpNAEQbTJ = AbstractC47400tpN.AEQbTJ(layoutInflaterFrom, viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(abstractC47400tpNAEQbTJ, "");
            return new TaskDescription(this, abstractC47400tpNAEQbTJ);
        }
        if (i == ItemType.SECTION_HEADER.ordinal()) {
            AbstractC47401tpO abstractC47401tpOOLrzqt = AbstractC47401tpO.OLrzqt(layoutInflaterFrom, viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(abstractC47401tpOOLrzqt, "");
            return new Activity(this, abstractC47401tpOOLrzqt);
        }
        if (i == ItemType.RECENTLY_UPDATED_ARTICLE.ordinal()) {
            AbstractC47403tpQ abstractC47403tpQKWHzl = AbstractC47403tpQ.KWHzl(layoutInflaterFrom, viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(abstractC47403tpQKWHzl, "");
            TextView textView = abstractC47403tpQKWHzl.OLrzqt;
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
            return new StateListAnimator(this, abstractC47403tpQKWHzl);
        }
        throw new IllegalArgumentException("Invalid view type: " + i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        AbstractC44051sBn abstractC44051sBn = copydefault().getCurrentList().get(i);
        if (abstractC44051sBn instanceof AbstractC44051sBn.TaskDescription) {
            return ItemType.SEARCH_INTENT.ordinal();
        }
        if (abstractC44051sBn instanceof AbstractC44051sBn.Activity) {
            return ItemType.SECTION_HEADER.ordinal();
        }
        if (abstractC44051sBn instanceof AbstractC44051sBn.Application) {
            return ItemType.RECENTLY_UPDATED_ARTICLE.ordinal();
        }
        throw new IllegalArgumentException("Unrecognised display model");
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull Application application, int i) {
        Intrinsics.checkNotNullParameter(application, "");
        AbstractC44051sBn abstractC44051sBn = copydefault().getCurrentList().get(i);
        Intrinsics.checkNotNullExpressionValue(abstractC44051sBn, "");
        application.EZpvd(abstractC44051sBn);
    }

    public static abstract class Application extends RecyclerView.ViewHolder {
        public abstract void EZpvd(@NotNull AbstractC44051sBn abstractC44051sBn);

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull ViewDataBinding viewDataBinding) {
            super(viewDataBinding.getRoot());
            Intrinsics.checkNotNullParameter(viewDataBinding, "");
        }
    }

    public final class TaskDescription extends Application {
        public final /* synthetic */ SupportSearchSuggestionsAdapter KWHzl;
        public final AbstractC47400tpN copydefault;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TaskDescription(@NotNull SupportSearchSuggestionsAdapter supportSearchSuggestionsAdapter, AbstractC47400tpN abstractC47400tpN) {
            super(abstractC47400tpN);
            Intrinsics.checkNotNullParameter(abstractC47400tpN, "");
            this.KWHzl = supportSearchSuggestionsAdapter;
            this.copydefault = abstractC47400tpN;
        }

        @Override // com.okinc.okex.search.ui.adapter.SupportSearchSuggestionsAdapter.Application
        public void EZpvd(@NotNull AbstractC44051sBn abstractC44051sBn) {
            Intrinsics.checkNotNullParameter(abstractC44051sBn, "");
            if ((abstractC44051sBn instanceof AbstractC44051sBn.TaskDescription ? (AbstractC44051sBn.TaskDescription) abstractC44051sBn : null) != null) {
                SupportSearchSuggestionsAdapter supportSearchSuggestionsAdapter = this.KWHzl;
                AbstractC47400tpN abstractC47400tpN = this.copydefault;
                abstractC47400tpN.KWHzl.setText(((AbstractC44051sBn.TaskDescription) abstractC44051sBn).AEQbTJ());
                View root = abstractC47400tpN.getRoot();
                root.setOnClickListener(new StateListAnimator(root, 1000L, supportSearchSuggestionsAdapter, abstractC44051sBn));
            }
        }

        public static final class StateListAnimator implements View.OnClickListener {
            public final /* synthetic */ long AEQbTJ;
            public final /* synthetic */ AbstractC44051sBn EZpvd;
            public final /* synthetic */ SupportSearchSuggestionsAdapter OLrzqt;
            public final /* synthetic */ View copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public StateListAnimator(View view, long j, SupportSearchSuggestionsAdapter supportSearchSuggestionsAdapter, AbstractC44051sBn abstractC44051sBn) {
                this.copydefault = view;
                this.AEQbTJ = j;
                this.OLrzqt = supportSearchSuggestionsAdapter;
                this.EZpvd = abstractC44051sBn;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.AEQbTJ || (this.copydefault instanceof Checkable)) {
                    C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                    ActionBar actionBar = this.OLrzqt.OLrzqt;
                    if (actionBar != null) {
                        actionBar.KWHzl((AbstractC44051sBn.TaskDescription) this.EZpvd);
                    }
                }
            }
        }
    }

    public final class Activity extends Application {
        public final AbstractC47401tpO OLrzqt;
        public final /* synthetic */ SupportSearchSuggestionsAdapter copydefault;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull SupportSearchSuggestionsAdapter supportSearchSuggestionsAdapter, AbstractC47401tpO abstractC47401tpO) {
            super(abstractC47401tpO);
            Intrinsics.checkNotNullParameter(abstractC47401tpO, "");
            this.copydefault = supportSearchSuggestionsAdapter;
            this.OLrzqt = abstractC47401tpO;
        }

        @Override // com.okinc.okex.search.ui.adapter.SupportSearchSuggestionsAdapter.Application
        public void EZpvd(@NotNull AbstractC44051sBn abstractC44051sBn) {
            Intrinsics.checkNotNullParameter(abstractC44051sBn, "");
            if ((abstractC44051sBn instanceof AbstractC44051sBn.Activity ? (AbstractC44051sBn.Activity) abstractC44051sBn : null) != null) {
                this.OLrzqt.OLrzqt.setText(((AbstractC44051sBn.Activity) abstractC44051sBn).EZpvd());
            }
        }
    }

    public final class StateListAnimator extends Application {
        public final /* synthetic */ SupportSearchSuggestionsAdapter KWHzl;
        public final AbstractC47403tpQ copydefault;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull SupportSearchSuggestionsAdapter supportSearchSuggestionsAdapter, AbstractC47403tpQ abstractC47403tpQ) {
            super(abstractC47403tpQ);
            Intrinsics.checkNotNullParameter(abstractC47403tpQ, "");
            this.KWHzl = supportSearchSuggestionsAdapter;
            this.copydefault = abstractC47403tpQ;
        }

        @Override // com.okinc.okex.search.ui.adapter.SupportSearchSuggestionsAdapter.Application
        public void EZpvd(@NotNull AbstractC44051sBn abstractC44051sBn) {
            Intrinsics.checkNotNullParameter(abstractC44051sBn, "");
            if ((abstractC44051sBn instanceof AbstractC44051sBn.Application ? (AbstractC44051sBn.Application) abstractC44051sBn : null) != null) {
                SupportSearchSuggestionsAdapter supportSearchSuggestionsAdapter = this.KWHzl;
                AbstractC47403tpQ abstractC47403tpQ = this.copydefault;
                abstractC47403tpQ.OLrzqt.setText(((AbstractC44051sBn.Application) abstractC44051sBn).KWHzl().getTitle());
                View root = abstractC47403tpQ.getRoot();
                root.setOnClickListener(new Activity(root, 1000L, supportSearchSuggestionsAdapter, abstractC44051sBn));
            }
        }

        public static final class Activity implements View.OnClickListener {
            public final /* synthetic */ View EZpvd;
            public final /* synthetic */ SupportSearchSuggestionsAdapter KWHzl;
            public final /* synthetic */ long OLrzqt;
            public final /* synthetic */ AbstractC44051sBn copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public Activity(View view, long j, SupportSearchSuggestionsAdapter supportSearchSuggestionsAdapter, AbstractC44051sBn abstractC44051sBn) {
                this.EZpvd = view;
                this.OLrzqt = j;
                this.KWHzl = supportSearchSuggestionsAdapter;
                this.copydefault = abstractC44051sBn;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.OLrzqt || (this.EZpvd instanceof Checkable)) {
                    C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                    ActionBar actionBar = this.KWHzl.OLrzqt;
                    if (actionBar != null) {
                        actionBar.KWHzl((AbstractC44051sBn.Application) this.copydefault);
                    }
                }
            }
        }
    }
}
