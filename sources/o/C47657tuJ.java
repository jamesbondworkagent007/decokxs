package o;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.localization.util.format.DisplaySign;
import com.okinc.planet.biz_content.leaderboard.TopTraderFilterBottomSheet;
import com.okinc.planet.biz_content.leaderboard.adapter.TopTradersAdapterSource;
import com.okinc.planet.biz_content.leaderboard.bean.Rank;
import com.okinc.planet.biz_content.leaderboard.bean.Rate;
import java.util.LinkedHashSet;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C47501trL;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tuJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C47657tuJ extends RecyclerView.Adapter<ActionBar> {
    public StateListAnimator AEQbTJ;
    public int EZpvd;
    public final java.util.Set<java.lang.String> KWHzl;
    public final java.util.List<Rank> OLrzqt;
    public final TopTradersAdapterSource copydefault;

    /* JADX INFO: renamed from: o.tuJ$Application */
    public final /* synthetic */ class Application {
        public static final /* synthetic */ int[] EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[TopTradersAdapterSource.values().length];
            try {
                iArr[TopTradersAdapterSource.FRAGMENT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[TopTradersAdapterSource.ACTIVITY.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            EZpvd = iArr;
        }
    }

    /* JADX INFO: renamed from: o.tuJ$StateListAnimator */
    public interface StateListAnimator {
        void OLrzqt(@NotNull Rank rank);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C47657tuJ() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(StateListAnimator stateListAnimator) {
        this.AEQbTJ = stateListAnimator;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (wrap:com.okinc.planet.biz_content.leaderboard.adapter.TopTradersAdapterSource:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.planet.biz_content.leaderboard.adapter.TopTradersAdapterSource:0x0004: SGET  A[WRAPPED] (LINE:55) com.okinc.planet.biz_content.leaderboard.adapter.TopTradersAdapterSource.FRAGMENT com.okinc.planet.biz_content.leaderboard.adapter.TopTradersAdapterSource) : (r1v0 com.okinc.planet.biz_content.leaderboard.adapter.TopTradersAdapterSource))
 A[MD:(com.okinc.planet.biz_content.leaderboard.adapter.TopTradersAdapterSource):void (m)] (LINE:49) call: o.tuJ.<init>(com.okinc.planet.biz_content.leaderboard.adapter.TopTradersAdapterSource):void type: THIS */
    public /* synthetic */ C47657tuJ(TopTradersAdapterSource topTradersAdapterSource, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? TopTradersAdapterSource.FRAGMENT : topTradersAdapterSource);
    }

    public C47657tuJ(@NotNull TopTradersAdapterSource topTradersAdapterSource) {
        Intrinsics.checkNotNullParameter(topTradersAdapterSource, "");
        this.copydefault = topTradersAdapterSource;
        this.OLrzqt = new java.util.ArrayList();
        this.KWHzl = new LinkedHashSet();
        this.EZpvd = 2;
    }

    public final void KWHzl(int i) {
        int iCopydefault;
        if (this.copydefault == TopTradersAdapterSource.FRAGMENT && this.EZpvd != (iCopydefault = C56548yJl.copydefault(i, 0))) {
            int iMin = java.lang.Math.min(this.OLrzqt.size(), this.EZpvd);
            int iMin2 = java.lang.Math.min(this.OLrzqt.size(), iCopydefault);
            this.EZpvd = iCopydefault;
            if (iMin2 < iMin) {
                notifyItemRangeRemoved(iMin2, iMin - iMin2);
            } else if (iMin2 > iMin) {
                notifyItemRangeInserted(iMin, iMin2 - iMin);
            }
        }
    }

    public final void copydefault(@NotNull java.util.List<Rank> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.OLrzqt.clear();
        this.OLrzqt.addAll(list);
        notifyDataSetChanged();
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public ActionBar onCreateViewHolder(@NotNull android.view.ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        android.view.View viewInflate = android.view.LayoutInflater.from(viewGroup.getContext()).inflate(C47501trL.Application.zblBkD, viewGroup, false);
        Intrinsics.copydefault(viewInflate);
        return new ActionBar(viewInflate, this.copydefault);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull ActionBar actionBar, int i) {
        Intrinsics.checkNotNullParameter(actionBar, "");
        actionBar.AEQbTJ(this.OLrzqt.get(i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        int i = Application.EZpvd[this.copydefault.ordinal()];
        if (i == 1) {
            return java.lang.Math.min(this.OLrzqt.size(), this.EZpvd);
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return this.OLrzqt.size();
    }

    /* JADX DEBUG: Method merged with bridge method: onViewAttachedToWindow(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public void onViewAttachedToWindow(@NotNull ActionBar actionBar) {
        StateListAnimator stateListAnimator;
        Intrinsics.checkNotNullParameter(actionBar, "");
        super.onViewAttachedToWindow(actionBar);
        if (this.copydefault != TopTradersAdapterSource.ACTIVITY) {
            return;
        }
        int bindingAdapterPosition = actionBar.getBindingAdapterPosition();
        pUU.EZpvd("PlanetTopTradersAdapter", "onViewAttachedToWindow-pos = " + bindingAdapterPosition);
        if (bindingAdapterPosition < 0 || bindingAdapterPosition >= getItemCount()) {
            return;
        }
        Rank rank = this.OLrzqt.get(bindingAdapterPosition);
        java.lang.String authorId = rank.getAuthorId();
        if (C33129mqd.OLrzqt((java.lang.CharSequence) authorId)) {
            java.util.Set<java.lang.String> set = this.KWHzl;
            Intrinsics.copydefault((java.lang.Object) authorId);
            if (!set.add(authorId) || (stateListAnimator = this.AEQbTJ) == null) {
                return;
            }
            stateListAnimator.OLrzqt(rank);
        }
    }

    /* JADX INFO: renamed from: o.tuJ$ActionBar */
    public static final class ActionBar extends RecyclerView.ViewHolder {
        public final int AEQbTJ;
        public final android.widget.TextView AYXKKw;
        public final android.widget.TextView AhwBna;
        public final TopTradersAdapterSource EZpvd;
        public final C46496tWm KWHzl;
        public final int OLrzqt;
        public final android.widget.ImageView copydefault;
        public final android.widget.TextView djBIcL;
        public final android.widget.TextView gEmmrt;
        public final android.widget.TextView valueOf;

        /* JADX INFO: renamed from: o.tuJ$ActionBar$StateListAnimator */
        public final /* synthetic */ class StateListAnimator {
            public static final /* synthetic */ int[] KWHzl;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            static {
                int[] iArr = new int[TopTradersAdapterSource.values().length];
                try {
                    iArr[TopTradersAdapterSource.FRAGMENT.ordinal()] = 1;
                } catch (java.lang.NoSuchFieldError unused) {
                }
                try {
                    iArr[TopTradersAdapterSource.ACTIVITY.ordinal()] = 2;
                } catch (java.lang.NoSuchFieldError unused2) {
                }
                KWHzl = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActionBar(@NotNull android.view.View view, @NotNull TopTradersAdapterSource topTradersAdapterSource) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "");
            Intrinsics.checkNotNullParameter(topTradersAdapterSource, "");
            this.EZpvd = topTradersAdapterSource;
            C33512mxp c33512mxp = C33512mxp.AEQbTJ;
            android.content.Context context = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            this.OLrzqt = C33512mxp.tradeFallTagContent$default(c33512mxp, context, 0.0f, 2, null);
            android.content.Context context2 = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            this.AEQbTJ = C33512mxp.tradeRiseTagContent$default(c33512mxp, context2, 0.0f, 2, null);
            android.view.View viewFindViewById = view.findViewById(C47501trL.TaskDescription.ggKfIT);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
            this.copydefault = (android.widget.ImageView) viewFindViewById;
            android.view.View viewFindViewById2 = view.findViewById(C47501trL.TaskDescription.HJWChPURsaBn);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "");
            this.gEmmrt = (android.widget.TextView) viewFindViewById2;
            android.view.View viewFindViewById3 = view.findViewById(C47501trL.TaskDescription.HJWChPRGtXKC);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "");
            this.djBIcL = (android.widget.TextView) viewFindViewById3;
            android.view.View viewFindViewById4 = view.findViewById(C47501trL.TaskDescription.HJWChPRGtXKCRGtXKC);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "");
            this.AhwBna = (android.widget.TextView) viewFindViewById4;
            android.view.View viewFindViewById5 = view.findViewById(C47501trL.TaskDescription.DeEinT);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "");
            this.valueOf = (android.widget.TextView) viewFindViewById5;
            android.view.View viewFindViewById6 = view.findViewById(C47501trL.TaskDescription.getSerial);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "");
            this.AYXKKw = (android.widget.TextView) viewFindViewById6;
            android.view.View viewFindViewById7 = view.findViewById(C47501trL.TaskDescription.iHkeWl);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById7, "");
            this.KWHzl = (C46496tWm) viewFindViewById7;
        }

        public final void AEQbTJ(@NotNull Rank rank) {
            java.lang.String strCopydefault;
            Intrinsics.checkNotNullParameter(rank, "");
            java.lang.String strAEQbTJ = AEQbTJ();
            if (Intrinsics.EZpvd((java.lang.Object) strAEQbTJ, (java.lang.Object) TopTraderFilterBottomSheet.SelectionDays.YEAR_1.getValue())) {
                strCopydefault = C33069mpW.copydefault(C47501trL.Fragment.v, C56423yEv.EZpvd(C56390yDp.OLrzqt("num", "1")));
            } else {
                strCopydefault = C33069mpW.copydefault(C47501trL.Fragment.aeJQwa, C56423yEv.EZpvd(C56390yDp.OLrzqt("num", strAEQbTJ)));
            }
            this.AYXKKw.setText(strCopydefault);
            android.widget.ImageView imageView = this.copydefault;
            java.lang.String portrait = rank.getPortrait();
            C33054mpH.loadAvatar$default(imageView, portrait == null ? "" : portrait, null, null, 6, null);
            this.gEmmrt.setText(rank.getNickName());
            this.djBIcL.setTextColor(C33129mqd.djBIcL(rank.getPnl()) < 0.0f ? this.OLrzqt : this.AEQbTJ);
            this.AhwBna.setTextColor(C33129mqd.djBIcL(rank.getPnlRatio()) < 0.0f ? this.OLrzqt : this.AEQbTJ);
            this.djBIcL.setText(C38305pTw.formatFiatSymbol$default(C33129mqd.EZpvd(rank.getPnl()), "USD", null, null, DisplaySign.EXCEPT_ZERO, null, null, 54, null));
            this.AhwBna.setText(xMR.formatPercentWithSymbol$default(xMR.copydefault, C33129mqd.gEmmrt(rank.getPnlRatio()), 2, 0, null, 12, null));
            this.valueOf.setText(C38305pTw.formatFiatSymbol$default(C33129mqd.EZpvd(rank.getAsset()), "USD", null, null, null, null, null, 62, null));
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.List<Rate> rates = rank.getRates();
            if (rates != null) {
                for (Rate rate : rates) {
                    arrayList.add(new tVX(C33129mqd.valueOf(rate.getStatTime()), java.lang.Double.valueOf(C33129mqd.AEQbTJ(rate.getValue()))));
                }
            }
            C46496tWm.setData$default(this.KWHzl, arrayList, null, null, 6, null);
            android.view.View view = this.itemView;
            view.setOnClickListener(new Activity(view, 1000L, this, rank));
        }

        /* JADX INFO: renamed from: o.tuJ$ActionBar$ActionBar, reason: collision with other inner class name */
        public static final class C0966ActionBar implements Function1<EventParamsList, Unit> {
            public final /* synthetic */ Rank KWHzl;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public C0966ActionBar(Rank rank) {
                this.KWHzl = rank;
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function1
            public /* synthetic */ Unit invoke(EventParamsList eventParamsList) {
                KWHzl(eventParamsList);
                return Unit.INSTANCE;
            }

            public final void KWHzl(EventParamsList eventParamsList) {
                Intrinsics.checkNotNullParameter(eventParamsList, "");
                EventParamsList.put$default(eventParamsList, "profile_name", C33129mqd.gEmmrt(this.KWHzl.getNickName()), false, 4, null);
            }
        }

        /* JADX INFO: renamed from: o.tuJ$ActionBar$Activity */
        public static final class Activity implements View.OnClickListener {
            public final /* synthetic */ ActionBar AEQbTJ;
            public final /* synthetic */ android.view.View EZpvd;
            public final /* synthetic */ Rank KWHzl;
            public final /* synthetic */ long copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public Activity(android.view.View view, long j, ActionBar actionBar, Rank rank) {
                this.EZpvd = view;
                this.copydefault = j;
                this.AEQbTJ = actionBar;
                this.KWHzl = rank;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.copydefault || (this.EZpvd instanceof android.widget.Checkable)) {
                    C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                    int i = StateListAnimator.KWHzl[this.AEQbTJ.EZpvd.ordinal()];
                    if (i == 1) {
                        C32866mlf.onEvent$default("Orbit_Page_Toptrader_Click", (TrackChannel[]) null, new C0966ActionBar(this.KWHzl), 1, (java.lang.Object) null);
                    } else {
                        if (i != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        C32866mlf.onEvent$default("Orbit_Toptrader_Card_Click", (TrackChannel[]) null, this.AEQbTJ.new TaskDescription(this.KWHzl), 1, (java.lang.Object) null);
                    }
                    C46447tUr c46447tUr = C46447tUr.KWHzl;
                    android.content.Context context = this.AEQbTJ.itemView.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "");
                    java.lang.String authorId = this.KWHzl.getAuthorId();
                    C46447tUr.openPlanetUserProfilePage$default(c46447tUr, context, "", authorId == null ? "" : authorId, "", "", "overview", C56423yEv.EZpvd(C56390yDp.OLrzqt("isOrbiter", "1")), null, 128, null);
                }
            }
        }

        /* JADX INFO: renamed from: o.tuJ$ActionBar$TaskDescription */
        public static final class TaskDescription implements Function1<EventParamsList, Unit> {
            public final /* synthetic */ Rank EZpvd;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public TaskDescription(Rank rank) {
                this.EZpvd = rank;
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function1
            public /* synthetic */ Unit invoke(EventParamsList eventParamsList) {
                KWHzl(eventParamsList);
                return Unit.INSTANCE;
            }

            public final void KWHzl(EventParamsList eventParamsList) {
                Intrinsics.checkNotNullParameter(eventParamsList, "");
                java.lang.String strEZpvd = C46386tSk.copydefault.EZpvd(C46388tSm.Companion.KWHzl().copydefault());
                if (Intrinsics.EZpvd((java.lang.Object) strEZpvd, (java.lang.Object) TopTraderFilterBottomSheet.SelectionPNL.PNL_VALUE.getValue())) {
                    EventParamsList.put$default(eventParamsList, "ranking_method", "pnl", false, 4, null);
                } else if (Intrinsics.EZpvd((java.lang.Object) strEZpvd, (java.lang.Object) TopTraderFilterBottomSheet.SelectionPNL.PNL_PERCENTAGE.getValue())) {
                    EventParamsList.put$default(eventParamsList, "ranking_method", "pnl%", false, 4, null);
                }
                EventParamsList.put$default(eventParamsList, "period_filter_option", ActionBar.this.AEQbTJ(), false, 4, null);
                EventParamsList.put$default(eventParamsList, "profile_id", C33129mqd.gEmmrt(this.EZpvd.getAuthorId()), false, 4, null);
                EventParamsList.put$default(eventParamsList, "profile_name", C33129mqd.gEmmrt(this.EZpvd.getNickName()), false, 4, null);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final java.lang.String AEQbTJ() {
            java.lang.String strAEQbTJ = C46386tSk.copydefault.AEQbTJ(C46388tSm.Companion.KWHzl().copydefault());
            return Intrinsics.EZpvd((java.lang.Object) "0", (java.lang.Object) strAEQbTJ) ? TopTraderFilterBottomSheet.SelectionDays.DAY_30.getValue() : strAEQbTJ;
        }
    }
}
