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
import o.C47407tpU;
import o.C47412tpZ;
import o.C55296xhK;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class TopicListHomeCardAdapter extends AbstractC45381soi<TopicListItem, RecyclerView.ViewHolder> {
    public final boolean AEQbTJ;
    public TaskDescription KWHzl;

    /* JADX INFO: loaded from: classes16.dex */
    public interface TaskDescription {
        void KWHzl(@NotNull TopicListItem.TopicItem topicItem);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TopicListHomeCardAdapter() {
        this(false, 1, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(@NotNull TaskDescription taskDescription) {
        Intrinsics.checkNotNullParameter(taskDescription, "");
        this.KWHzl = taskDescription;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? false : (r1v0 boolean))
 A[MD:(boolean):void (m)] (LINE:17) call: com.okinc.okex.center.ui.adapter.TopicListHomeCardAdapter.<init>(boolean):void type: THIS */
    public /* synthetic */ TopicListHomeCardAdapter(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z);
    }

    public TopicListHomeCardAdapter(boolean z) {
        this.AEQbTJ = z;
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
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
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
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
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
            return new Application(this, c47407tpUOLrzqt);
        }
        if (i == TopicType.TOPIC_ITEM.ordinal()) {
            C47412tpZ c47412tpZAEQbTJ = C47412tpZ.AEQbTJ(layoutInflaterFrom, viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(c47412tpZAEQbTJ, "");
            return new StateListAnimator(this, c47412tpZAEQbTJ);
        }
        throw new IllegalArgumentException("Invalid viewType: " + i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull RecyclerView.ViewHolder viewHolder, int i) {
        Intrinsics.checkNotNullParameter(viewHolder, "");
        if (viewHolder instanceof StateListAnimator) {
            TopicListItem topicListItem = copydefault().getCurrentList().get(i);
            Intrinsics.copydefault(topicListItem, "");
            ((StateListAnimator) viewHolder).KWHzl((TopicListItem.TopicItem) topicListItem);
        } else if (viewHolder instanceof Application) {
            TopicListItem topicListItem2 = copydefault().getCurrentList().get(i);
            Intrinsics.copydefault(topicListItem2, "");
            ((Application) viewHolder).KWHzl((TopicListItem.TopicHeaderItem) topicListItem2);
        }
    }

    public final class StateListAnimator extends RecyclerView.ViewHolder {
        public final /* synthetic */ TopicListHomeCardAdapter KWHzl;
        public final C47412tpZ OLrzqt;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull TopicListHomeCardAdapter topicListHomeCardAdapter, C47412tpZ c47412tpZ) {
            super(c47412tpZ.getRoot());
            Intrinsics.checkNotNullParameter(c47412tpZ, "");
            this.KWHzl = topicListHomeCardAdapter;
            this.OLrzqt = c47412tpZ;
        }

        public final void KWHzl(@NotNull TopicListItem.TopicItem topicItem) {
            Intrinsics.checkNotNullParameter(topicItem, "");
            C47412tpZ c47412tpZ = this.OLrzqt;
            TopicListHomeCardAdapter topicListHomeCardAdapter = this.KWHzl;
            c47412tpZ.OLrzqt.setText(C33129mqd.gEmmrt(topicItem.getTitle()));
            TextView textView = c47412tpZ.copydefault;
            Intrinsics.copydefault(textView);
            textView.setVisibility(topicListHomeCardAdapter.AEQbTJ ? 0 : 8);
            textView.setText(C33129mqd.gEmmrt(topicItem.getDescription()));
            Glide.KWHzl(c47412tpZ.AEQbTJ).EZpvd(topicItem.getIconUrl()).EZpvd(c47412tpZ.AEQbTJ);
            ConstraintLayout root = c47412tpZ.getRoot();
            root.setOnClickListener(new Application(root, 1000L, topicListHomeCardAdapter, topicItem));
        }

        public static final class Application implements View.OnClickListener {
            public final /* synthetic */ View AEQbTJ;
            public final /* synthetic */ long EZpvd;
            public final /* synthetic */ TopicListItem.TopicItem OLrzqt;
            public final /* synthetic */ TopicListHomeCardAdapter copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public Application(View view, long j, TopicListHomeCardAdapter topicListHomeCardAdapter, TopicListItem.TopicItem topicItem) {
                this.AEQbTJ = view;
                this.EZpvd = j;
                this.copydefault = topicListHomeCardAdapter;
                this.OLrzqt = topicItem;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.EZpvd || (this.AEQbTJ instanceof Checkable)) {
                    C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                    TaskDescription taskDescription = this.copydefault.KWHzl;
                    if (taskDescription != null) {
                        taskDescription.KWHzl(this.OLrzqt);
                    }
                }
            }
        }
    }

    public final class Application extends RecyclerView.ViewHolder {
        public final C47407tpU AEQbTJ;
        public final /* synthetic */ TopicListHomeCardAdapter EZpvd;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull TopicListHomeCardAdapter topicListHomeCardAdapter, C47407tpU c47407tpU) {
            super(c47407tpU.getRoot());
            Intrinsics.checkNotNullParameter(c47407tpU, "");
            this.EZpvd = topicListHomeCardAdapter;
            this.AEQbTJ = c47407tpU;
        }

        public final void KWHzl(@NotNull TopicListItem.TopicHeaderItem topicHeaderItem) {
            Intrinsics.checkNotNullParameter(topicHeaderItem, "");
            this.AEQbTJ.EZpvd.setText(topicHeaderItem.getText());
        }
    }
}
