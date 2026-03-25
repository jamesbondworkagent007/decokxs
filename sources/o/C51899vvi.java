package o;

import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.components.track.TrackChannel;
import com.okinc.unify_trade.bot.data.TacticsListLabelData;
import com.okinc.unify_trade.bot.market_place.userpage.BotLeadUserOrderHistoryContentShowData;
import com.okinc.unify_trade.bot.market_place.userpage.BotLeadUserOrderHistoryShowData;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vvi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C51899vvi extends AbstractC59533zio<BotLeadUserOrderHistoryShowData, C51901vvk> {
    public final InterfaceC51898vvh OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC51898vvh EZpvd() {
        return this.OLrzqt;
    }

    public C51899vvi(@NotNull InterfaceC51898vvh interfaceC51898vvh) {
        Intrinsics.checkNotNullParameter(interfaceC51898vvh, "");
        this.OLrzqt = interfaceC51898vvh;
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public C51901vvk onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        android.view.View viewInflate = layoutInflater.inflate(C48033uCm.Activity.DTg, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "");
        return new C51901vvk(viewInflate);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull final C51901vvk c51901vvk, @NotNull BotLeadUserOrderHistoryShowData botLeadUserOrderHistoryShowData) {
        Intrinsics.checkNotNullParameter(c51901vvk, "");
        Intrinsics.checkNotNullParameter(botLeadUserOrderHistoryShowData, "");
        c51901vvk.AhwBna().setText(botLeadUserOrderHistoryShowData.getTitle());
        c51901vvk.EZpvd().setVisibility((C33129mqd.OLrzqt((java.lang.CharSequence) botLeadUserOrderHistoryShowData.getSide()) && C33129mqd.OLrzqt((java.lang.CharSequence) botLeadUserOrderHistoryShowData.getLeverage())) ? 0 : 8);
        java.util.ArrayList<TacticsListLabelData> labelList = botLeadUserOrderHistoryShowData.getLabelList();
        if (C33129mqd.AEQbTJ(labelList != null ? java.lang.Integer.valueOf(labelList.size()) : null, 0)) {
            c51901vvk.EZpvd().setVisibility(0);
            c51901vvk.EZpvd().setExpand(true);
            c51901vvk.EZpvd().removeAllViews();
            java.util.ArrayList<TacticsListLabelData> labelList2 = botLeadUserOrderHistoryShowData.getLabelList();
            if (labelList2 != null) {
                for (TacticsListLabelData tacticsListLabelData : labelList2) {
                    C55372xih c55372xihEZpvd = c51901vvk.EZpvd();
                    C52534wOz c52534wOz = C52534wOz.KWHzl;
                    android.content.Context context = c51901vvk.copydefault().getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "");
                    c55372xihEZpvd.addView(c52534wOz.copydefault(context, tacticsListLabelData));
                }
            }
        } else {
            c51901vvk.EZpvd().setVisibility(8);
        }
        c51901vvk.OLrzqt().setLayoutManager(new GridLayoutManager(c51901vvk.OLrzqt().getContext(), 2));
        c51901vvk.OLrzqt().setNestedScrollingEnabled(false);
        if (c51901vvk.OLrzqt().getItemDecorationCount() == 0) {
            RecyclerView recyclerViewOLrzqt = c51901vvk.OLrzqt();
            android.content.Context context2 = c51901vvk.itemView.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            recyclerViewOLrzqt.addItemDecoration(new C57584ylF(2, 0, C33052mpF.EZpvd(16.0f, context2)));
        }
        RecyclerView recyclerViewOLrzqt2 = c51901vvk.OLrzqt();
        C59534zip c59534zip = new C59534zip();
        android.content.Context context3 = c51901vvk.OLrzqt().getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "");
        c59534zip.register(BotLeadUserOrderHistoryContentShowData.class, new C51897vvg(context3));
        recyclerViewOLrzqt2.setAdapter(c59534zip);
        c51901vvk.OLrzqt().setOnTouchListener(new View.OnTouchListener() { // from class: o.vvl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
                return C51899vvi.EZpvd(c51901vvk, view, motionEvent);
            }
        });
        java.util.List<BotLeadUserOrderHistoryContentShowData> content = botLeadUserOrderHistoryShowData.getContent();
        if (content != null) {
            RecyclerView.Adapter adapter = c51901vvk.OLrzqt().getAdapter();
            Intrinsics.copydefault(adapter, "");
            C33064mpR.OLrzqt((C59534zip) adapter, content);
        }
        android.view.View viewAEQbTJ = c51901vvk.AEQbTJ();
        int i = getAdapter().getItems().size() - 1 != c51901vvk.getBindingAdapterPosition() ? 0 : 8;
        viewAEQbTJ.setVisibility(i);
        android.widget.ImageView imageViewKWHzl = c51901vvk.KWHzl();
        imageViewKWHzl.setOnClickListener(new Activity(imageViewKWHzl, 1000L, this, botLeadUserOrderHistoryShowData));
        android.view.View viewCopydefault = c51901vvk.copydefault();
        viewCopydefault.setOnClickListener(new Application(viewCopydefault, 1000L, this, botLeadUserOrderHistoryShowData));
        RecyclerView recyclerViewOLrzqt3 = c51901vvk.OLrzqt();
        recyclerViewOLrzqt3.setOnClickListener(new TaskDescription(recyclerViewOLrzqt3, 1000L, this, botLeadUserOrderHistoryShowData));
    }

    public static final boolean EZpvd(C51901vvk c51901vvk, android.view.View view, android.view.MotionEvent motionEvent) {
        if (motionEvent == null || motionEvent.getAction() != 1) {
            return false;
        }
        c51901vvk.OLrzqt().performClick();
        return false;
    }

    public final void OLrzqt() {
        C32866mlf.onEvent$default("LeadBotHomepage_RunningBotsShare_Button_Click", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
    }

    /* JADX INFO: renamed from: o.vvi$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ BotLeadUserOrderHistoryShowData KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ C51899vvi copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, C51899vvi c51899vvi, BotLeadUserOrderHistoryShowData botLeadUserOrderHistoryShowData) {
            this.OLrzqt = view;
            this.AEQbTJ = j;
            this.copydefault = c51899vvi;
            this.KWHzl = botLeadUserOrderHistoryShowData;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.AEQbTJ || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.copydefault.EZpvd().AEQbTJ(this.KWHzl);
                this.copydefault.OLrzqt();
            }
        }
    }

    /* JADX INFO: renamed from: o.vvi$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ C51899vvi AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ BotLeadUserOrderHistoryShowData KWHzl;
        public final /* synthetic */ long OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, C51899vvi c51899vvi, BotLeadUserOrderHistoryShowData botLeadUserOrderHistoryShowData) {
            this.EZpvd = view;
            this.OLrzqt = j;
            this.AEQbTJ = c51899vvi;
            this.KWHzl = botLeadUserOrderHistoryShowData;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.OLrzqt || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                this.AEQbTJ.EZpvd().copydefault(this.KWHzl);
            }
        }
    }

    /* JADX INFO: renamed from: o.vvi$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ BotLeadUserOrderHistoryShowData EZpvd;
        public final /* synthetic */ C51899vvi KWHzl;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, C51899vvi c51899vvi, BotLeadUserOrderHistoryShowData botLeadUserOrderHistoryShowData) {
            this.AEQbTJ = view;
            this.copydefault = j;
            this.KWHzl = c51899vvi;
            this.EZpvd = botLeadUserOrderHistoryShowData;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.copydefault || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.KWHzl.EZpvd().copydefault(this.EZpvd);
            }
        }
    }
}
