package com.okinc.okex.center.ui.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.okinc.okex.center.bean.TopicListItem;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC45381soi;
import o.C33129mqd;
import o.C47406tpT;
import o.C47407tpU;
import o.C55296xhK;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class TopicListAdapter extends AbstractC45381soi<TopicListItem, RecyclerView.ViewHolder> {
    public StateListAnimator AEQbTJ;
    public final boolean OLrzqt;

    /* JADX INFO: loaded from: classes16.dex */
    public interface StateListAnimator {
        void OLrzqt(@NotNull TopicListItem.TopicItem topicItem);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TopicListAdapter() {
        this(false, 1, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(@NotNull StateListAnimator stateListAnimator) {
        Intrinsics.checkNotNullParameter(stateListAnimator, "");
        this.AEQbTJ = stateListAnimator;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? false : (r1v0 boolean))
 A[MD:(boolean):void (m)] (LINE:17) call: com.okinc.okex.center.ui.adapter.TopicListAdapter.<init>(boolean):void type: THIS */
    public /* synthetic */ TopicListAdapter(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z);
    }

    public TopicListAdapter(boolean z) {
        this.OLrzqt = z;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class TopicType {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ TopicType[] $VALUES;
        public static final TopicType TOPIC_HEADER = new TopicType("TOPIC_HEADER", 0);
        public static final TopicType TOPIC_ITEM = new TopicType("TOPIC_ITEM", 1);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ TopicType[] $values() {
            return new TopicType[]{TOPIC_HEADER, TOPIC_ITEM};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<TopicType> getEntries() {
            return $ENTRIES;
        }

        private TopicType(String str, int i) {
        }

        static {
            TopicType[] topicTypeArr$values = $values();
            $VALUES = topicTypeArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(topicTypeArr$values);
        }

        public static TopicType valueOf(String str) {
            return (TopicType) Enum.valueOf(TopicType.class, str);
        }

        public static TopicType[] values() {
            return (TopicType[]) $VALUES.clone();
        }
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;Ljava/lang/Object;)Z */
    @Override // o.AbstractC45381soi
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public boolean KWHzl(@NotNull TopicListItem topicListItem, @NotNull TopicListItem topicListItem2) {
        Intrinsics.checkNotNullParameter(topicListItem, "");
        Intrinsics.checkNotNullParameter(topicListItem2, "");
        if ((topicListItem instanceof TopicListItem.TopicHeaderItem) && (topicListItem2 instanceof TopicListItem.TopicHeaderItem)) {
            return Intrinsics.EZpvd((Object) ((TopicListItem.TopicHeaderItem) topicListItem).getText(), (Object) ((TopicListItem.TopicHeaderItem) topicListItem2).getText());
        }
        if ((topicListItem instanceof TopicListItem.TopicItem) && (topicListItem2 instanceof TopicListItem.TopicItem)) {
            return Intrinsics.EZpvd((Object) ((TopicListItem.TopicItem) topicListItem).getId(), (Object) ((TopicListItem.TopicItem) topicListItem2).getId());
        }
        return false;
    }

    /* JADX DEBUG: Method merged with bridge method: copydefault(Ljava/lang/Object;Ljava/lang/Object;)Z */
    @Override // o.AbstractC45381soi
    /* JADX INFO: renamed from: KWHzl, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public boolean copydefault(@NotNull TopicListItem topicListItem, @NotNull TopicListItem topicListItem2) {
        Intrinsics.checkNotNullParameter(topicListItem, "");
        Intrinsics.checkNotNullParameter(topicListItem2, "");
        if ((topicListItem instanceof TopicListItem.TopicHeaderItem) && (topicListItem2 instanceof TopicListItem.TopicHeaderItem)) {
            return Intrinsics.EZpvd((Object) ((TopicListItem.TopicHeaderItem) topicListItem).getText(), (Object) ((TopicListItem.TopicHeaderItem) topicListItem2).getText());
        }
        if ((topicListItem instanceof TopicListItem.TopicItem) && (topicListItem2 instanceof TopicListItem.TopicItem)) {
            TopicListItem.TopicItem topicItem = (TopicListItem.TopicItem) topicListItem;
            TopicListItem.TopicItem topicItem2 = (TopicListItem.TopicItem) topicListItem2;
            if (Intrinsics.EZpvd((Object) topicItem.getId(), (Object) topicItem2.getId()) && Intrinsics.EZpvd((Object) topicItem.getTitle(), (Object) topicItem2.getTitle()) && Intrinsics.EZpvd((Object) topicItem.getDescription(), (Object) topicItem2.getDescription()) && Intrinsics.EZpvd((Object) topicItem.getIconUrl(), (Object) topicItem2.getIconUrl()) && Intrinsics.EZpvd(topicItem.getTags(), topicItem2.getTags())) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return copydefault().getCurrentList().get(i) instanceof TopicListItem.TopicHeaderItem ? TopicType.TOPIC_HEADER.ordinal() : TopicType.TOPIC_ITEM.ordinal();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(@NotNull ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
        if (i == TopicType.TOPIC_HEADER.ordinal()) {
            C47407tpU c47407tpUOLrzqt = C47407tpU.OLrzqt(layoutInflaterFrom, viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(c47407tpUOLrzqt, "");
            return new Activity(this, c47407tpUOLrzqt);
        }
        if (i == TopicType.TOPIC_ITEM.ordinal()) {
            C47406tpT c47406tpTEZpvd = C47406tpT.EZpvd(layoutInflaterFrom, viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(c47406tpTEZpvd, "");
            return new Application(this, c47406tpTEZpvd);
        }
        throw new IllegalArgumentException("Invalid viewType: " + i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull RecyclerView.ViewHolder viewHolder, int i) {
        Intrinsics.checkNotNullParameter(viewHolder, "");
        if (viewHolder instanceof Application) {
            TopicListItem topicListItem = copydefault().getCurrentList().get(i);
            Intrinsics.copydefault(topicListItem, "");
            ((Application) viewHolder).AEQbTJ((TopicListItem.TopicItem) topicListItem);
        } else if (viewHolder instanceof Activity) {
            TopicListItem topicListItem2 = copydefault().getCurrentList().get(i);
            Intrinsics.copydefault(topicListItem2, "");
            ((Activity) viewHolder).copydefault((TopicListItem.TopicHeaderItem) topicListItem2);
        }
    }

    public final class Application extends RecyclerView.ViewHolder {
        public final /* synthetic */ TopicListAdapter KWHzl;
        public final C47406tpT OLrzqt;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull TopicListAdapter topicListAdapter, C47406tpT c47406tpT) {
            super(c47406tpT.getRoot());
            Intrinsics.checkNotNullParameter(c47406tpT, "");
            this.KWHzl = topicListAdapter;
            this.OLrzqt = c47406tpT;
        }

        public final void AEQbTJ(@NotNull TopicListItem.TopicItem topicItem) {
            Intrinsics.checkNotNullParameter(topicItem, "");
            C47406tpT c47406tpT = this.OLrzqt;
            TopicListAdapter topicListAdapter = this.KWHzl;
            c47406tpT.OLrzqt.setText(C33129mqd.gEmmrt(topicItem.getTitle()));
            TextView textView = c47406tpT.EZpvd;
            Intrinsics.copydefault(textView);
            textView.setVisibility(topicListAdapter.OLrzqt ? 0 : 8);
            textView.setText(C33129mqd.gEmmrt(topicItem.getDescription()));
            Glide.KWHzl(c47406tpT.copydefault).EZpvd(topicItem.getIconUrl()).EZpvd(c47406tpT.copydefault);
            ConstraintLayout root = c47406tpT.getRoot();
            root.setOnClickListener(new StateListAnimator(root, 1000L, topicListAdapter, topicItem));
        }

        public static final class StateListAnimator implements View.OnClickListener {
            public final /* synthetic */ TopicListItem.TopicItem AEQbTJ;
            public final /* synthetic */ long EZpvd;
            public final /* synthetic */ TopicListAdapter KWHzl;
            public final /* synthetic */ View copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public StateListAnimator(View view, long j, TopicListAdapter topicListAdapter, TopicListItem.TopicItem topicItem) {
                this.copydefault = view;
                this.EZpvd = j;
                this.KWHzl = topicListAdapter;
                this.AEQbTJ = topicItem;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.EZpvd || (this.copydefault instanceof Checkable)) {
                    C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                    StateListAnimator stateListAnimator = this.KWHzl.AEQbTJ;
                    if (stateListAnimator != null) {
                        stateListAnimator.OLrzqt(this.AEQbTJ);
                    }
                }
            }
        }
    }

    public final class Activity extends RecyclerView.ViewHolder {
        public final /* synthetic */ TopicListAdapter AEQbTJ;
        public final C47407tpU EZpvd;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull TopicListAdapter topicListAdapter, C47407tpU c47407tpU) {
            super(c47407tpU.getRoot());
            Intrinsics.checkNotNullParameter(c47407tpU, "");
            this.AEQbTJ = topicListAdapter;
            this.EZpvd = c47407tpU;
        }

        public final void copydefault(@NotNull TopicListItem.TopicHeaderItem topicHeaderItem) {
            Intrinsics.checkNotNullParameter(topicHeaderItem, "");
            this.EZpvd.EZpvd.setText(topicHeaderItem.getText());
        }
    }
}
