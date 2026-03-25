package o;

import android.view.View;
import androidx.camera.video.AudioStats;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.localization.util.format.DisplaySign;
import com.okinc.market.common.constants.ExperienceRouteConst;
import com.okinc.planet.biz_content.leaderboard.adapter.PlanetLatestNewsAdapter$updatePriceData$2;
import com.okinc.planet.biz_content.leaderboard.bean.NewsFlashArticle;
import com.okinc.planet.biz_content.leaderboard.bean.NewsFlashAuthor;
import com.okinc.planet.biz_content.leaderboard.bean.NewsFlashMentionDetail;
import com.okinc.planet.biz_content.leaderboard.bean.SpotlightToken;
import java.lang.ref.WeakReference;
import java.math.RoundingMode;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C47501trL;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tuB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C47649tuB extends RecyclerView.Adapter<Activity> {
    public WeakReference<RecyclerView> copydefault;
    public final java.util.List<NewsFlashArticle> OLrzqt = new java.util.ArrayList();
    public final ConcurrentHashMap<java.lang.String, C47671tuX> AEQbTJ = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<java.lang.String, C47670tuW> KWHzl = new ConcurrentHashMap<>();

    public final void OLrzqt(@NotNull java.util.List<NewsFlashArticle> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.OLrzqt.clear();
        this.OLrzqt.addAll(list);
        notifyDataSetChanged();
    }

    public final void copydefault(@NotNull java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
        RecyclerView recyclerView;
        Intrinsics.checkNotNullParameter(map, "");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Map.Entry<java.lang.String, ? extends java.lang.Object> entry : map.entrySet()) {
            java.lang.String key = entry.getKey();
            java.lang.Object value = entry.getValue();
            if (value instanceof C47671tuX) {
                this.AEQbTJ.put(key, (C47671tuX) value);
                linkedHashSet.add(key);
            } else if (value instanceof C47670tuW) {
                this.KWHzl.put(key, (C47670tuW) value);
                linkedHashSet.add(key);
            }
        }
        if (linkedHashSet.isEmpty()) {
            return;
        }
        java.util.Map<java.lang.String, java.util.Set<java.lang.Integer>> mapOLrzqt = OLrzqt();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            java.util.Set<java.lang.Integer> setCopydefault = mapOLrzqt.get((java.lang.String) it.next());
            if (setCopydefault == null) {
                setCopydefault = yEE.copydefault();
            }
            C56406yEe.KWHzl(arrayList, setCopydefault);
        }
        java.util.Set setOqFWZa = CollectionsKt___CollectionsKt.OqFWZa(arrayList);
        WeakReference<RecyclerView> weakReference = this.copydefault;
        if (weakReference == null || (recyclerView = weakReference.get()) == null) {
            return;
        }
        java.util.Iterator it2 = setOqFWZa.iterator();
        while (it2.hasNext()) {
            int iIntValue = ((java.lang.Number) it2.next()).intValue();
            if (iIntValue >= 0 && iIntValue < getItemCount()) {
                RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(iIntValue);
                Activity activity = viewHolderFindViewHolderForAdapterPosition instanceof Activity ? (Activity) viewHolderFindViewHolderForAdapterPosition : null;
                if (activity != null && activity.getAdapterPosition() == iIntValue) {
                    activity.EZpvd(this.AEQbTJ, this.KWHzl, linkedHashSet, new PlanetLatestNewsAdapter$updatePriceData$2(this));
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(@NotNull RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "");
        super.onAttachedToRecyclerView(recyclerView);
        this.copydefault = new WeakReference<>(recyclerView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onDetachedFromRecyclerView(@NotNull RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "");
        super.onDetachedFromRecyclerView(recyclerView);
        this.copydefault = null;
    }

    public final java.util.Map<java.lang.String, java.util.Set<java.lang.Integer>> OLrzqt() {
        java.util.List<SpotlightToken> tokens;
        SpotlightToken spotlightToken;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int itemCount = getItemCount();
        for (int i = 0; i < itemCount; i++) {
            NewsFlashArticle newsFlashArticle = (NewsFlashArticle) CollectionsKt___CollectionsKt.AkhnZx(this.OLrzqt, i);
            if (newsFlashArticle != null && (tokens = newsFlashArticle.getTokens()) != null && (spotlightToken = (SpotlightToken) CollectionsKt___CollectionsKt.firstOrNull(tokens)) != null) {
                java.lang.String strCopydefault = copydefault(spotlightToken);
                if (strCopydefault.length() > 0) {
                    java.lang.Object linkedHashSet = linkedHashMap.get(strCopydefault);
                    if (linkedHashSet == null) {
                        linkedHashSet = new LinkedHashSet();
                        linkedHashMap.put(strCopydefault, linkedHashSet);
                    }
                    ((java.util.Set) linkedHashSet).add(java.lang.Integer.valueOf(i));
                }
            }
        }
        return linkedHashMap;
    }

    public final java.lang.String copydefault(SpotlightToken spotlightToken) {
        if (!Intrinsics.EZpvd((java.lang.Object) spotlightToken.getType(), (java.lang.Object) "cedefi")) {
            java.lang.String instId = spotlightToken.getInstId();
            return instId == null ? "" : instId;
        }
        return spotlightToken.getChainId() + "_" + spotlightToken.getTokenContractAddress();
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public Activity onCreateViewHolder(@NotNull android.view.ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        android.view.View viewInflate = android.view.LayoutInflater.from(viewGroup.getContext()).inflate(C47501trL.Application.aUsmxb, viewGroup, false);
        Intrinsics.copydefault(viewInflate);
        return new Activity(viewInflate);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull Activity activity, int i) {
        Intrinsics.checkNotNullParameter(activity, "");
        activity.EZpvd(this.OLrzqt.get(i), this.AEQbTJ, this.KWHzl);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.OLrzqt.size();
    }

    /* JADX INFO: renamed from: o.tuB$Activity */
    public static final class Activity extends RecyclerView.ViewHolder {
        public static final TaskDescription Companion = new TaskDescription(null);
        public static final int KWHzl = 8;
        public final android.widget.ImageView AEQbTJ;
        public final int AYXKKw;
        public final android.widget.TextView AhwBna;
        public final android.widget.TextView DbNXlk;
        public SpotlightToken EZpvd;
        public final android.widget.ImageView OLrzqt;
        public final int copydefault;
        public final android.widget.TextView djBIcL;
        public final android.widget.LinearLayout gEmmrt;
        public final android.widget.TextView isConnected;
        public final int valueOf;
        public final android.widget.TextView values;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull android.view.View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "");
            C33512mxp c33512mxp = C33512mxp.AEQbTJ;
            android.content.Context context = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            this.copydefault = C33512mxp.tradeFallTagContent$default(c33512mxp, context, 0.0f, 2, null);
            android.content.Context context2 = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            this.AYXKKw = C33512mxp.tradeRiseTagContent$default(c33512mxp, context2, 0.0f, 2, null);
            this.valueOf = C33070mpX.copydefault(C52761wXj.Activity.fdOvFl);
            android.view.View viewFindViewById = view.findViewById(C47501trL.TaskDescription.dpErvT);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
            this.values = (android.widget.TextView) viewFindViewById;
            android.view.View viewFindViewById2 = view.findViewById(C47501trL.TaskDescription.GqbzPL);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "");
            android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) viewFindViewById2;
            this.gEmmrt = linearLayout;
            android.view.View viewFindViewById3 = linearLayout.findViewById(C47501trL.TaskDescription.invokespecialaVhqwO);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "");
            this.AEQbTJ = (android.widget.ImageView) viewFindViewById3;
            android.view.View viewFindViewById4 = linearLayout.findViewById(C47501trL.TaskDescription.hfeTOA);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "");
            this.DbNXlk = (android.widget.TextView) viewFindViewById4;
            android.view.View viewFindViewById5 = linearLayout.findViewById(C47501trL.TaskDescription.iRgjgR);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "");
            this.isConnected = (android.widget.TextView) viewFindViewById5;
            android.view.View viewFindViewById6 = view.findViewById(C47501trL.TaskDescription.invokespecialDPHOMC);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "");
            this.OLrzqt = (android.widget.ImageView) viewFindViewById6;
            android.view.View viewFindViewById7 = view.findViewById(C47501trL.TaskDescription.gdwsGQ);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById7, "");
            this.djBIcL = (android.widget.TextView) viewFindViewById7;
            android.view.View viewFindViewById8 = view.findViewById(C47501trL.TaskDescription.HJWChPfvRMlC);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById8, "");
            this.AhwBna = (android.widget.TextView) viewFindViewById8;
        }

        /* JADX INFO: renamed from: o.tuB$Activity$TaskDescription */
        public static final class TaskDescription {
            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.tuB.Activity.TaskDescription.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private TaskDescription() {
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: o.tuB$Activity */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void updatePriceOnly$default(Activity activity, java.util.Map map, java.util.Map map2, java.util.Set set, Function1 function1, int i, java.lang.Object obj) {
            if ((i & 4) != 0) {
                set = null;
            }
            if ((i & 8) != 0) {
                function1 = null;
            }
            activity.EZpvd(map, map2, set, function1);
        }

        public final void EZpvd(@NotNull java.util.Map<java.lang.String, C47671tuX> map, @NotNull java.util.Map<java.lang.String, C47670tuW> map2, java.util.Set<java.lang.String> set, Function1<? super SpotlightToken, java.lang.String> function1) {
            java.lang.Double dEZpvd;
            Intrinsics.checkNotNullParameter(map, "");
            Intrinsics.checkNotNullParameter(map2, "");
            SpotlightToken spotlightToken = this.EZpvd;
            if (spotlightToken == null) {
                return;
            }
            if ((set == null || function1 == null || set.contains(function1.invoke(spotlightToken))) && (dEZpvd = EZpvd(spotlightToken, map, map2)) != null) {
                this.isConnected.setText(OLrzqt(dEZpvd.doubleValue()));
                this.isConnected.setTextColor(AEQbTJ(dEZpvd.doubleValue()));
                this.isConnected.setVisibility(0);
            }
        }

        public final void EZpvd(@NotNull NewsFlashArticle newsFlashArticle, @NotNull java.util.Map<java.lang.String, C47671tuX> map, @NotNull java.util.Map<java.lang.String, C47670tuW> map2) {
            java.util.List<NewsFlashAuthor> authors;
            Intrinsics.checkNotNullParameter(newsFlashArticle, "");
            Intrinsics.checkNotNullParameter(map, "");
            Intrinsics.checkNotNullParameter(map2, "");
            this.values.setText(C33129mqd.gEmmrt(newsFlashArticle.getTitle()));
            java.util.List<SpotlightToken> tokens = newsFlashArticle.getTokens();
            SpotlightToken spotlightToken = tokens != null ? (SpotlightToken) CollectionsKt___CollectionsKt.firstOrNull(tokens) : null;
            this.EZpvd = spotlightToken;
            if (spotlightToken != null) {
                this.gEmmrt.setVisibility(0);
                java.lang.String icon = spotlightToken.getIcon();
                if (icon != null && icon.length() != 0) {
                    C33054mpH.loadAvatar$default(this.AEQbTJ, spotlightToken.getIcon(), null, null, 6, null);
                }
                android.widget.TextView textView = this.DbNXlk;
                java.lang.String coinName = spotlightToken.getCoinName();
                if (coinName == null) {
                    coinName = "";
                }
                textView.setText(coinName);
                java.lang.Double dEZpvd = EZpvd(spotlightToken, map, map2);
                if (dEZpvd != null) {
                    this.isConnected.setText(OLrzqt(dEZpvd.doubleValue()));
                    this.isConnected.setTextColor(AEQbTJ(dEZpvd.doubleValue()));
                    this.isConnected.setVisibility(0);
                } else {
                    this.isConnected.setVisibility(8);
                }
            } else {
                this.gEmmrt.setVisibility(8);
            }
            NewsFlashMentionDetail mentionDetail = newsFlashArticle.getMentionDetail();
            NewsFlashAuthor newsFlashAuthor = (mentionDetail == null || (authors = mentionDetail.getAuthors()) == null) ? null : (NewsFlashAuthor) CollectionsKt___CollectionsKt.firstOrNull(authors);
            if (newsFlashAuthor != null) {
                java.lang.String portrait = newsFlashAuthor.getPortrait();
                if (portrait != null && portrait.length() != 0) {
                    C33054mpH.loadAvatar$default(this.OLrzqt, newsFlashAuthor.getPortrait(), null, null, 6, null);
                }
                android.widget.TextView textView2 = this.djBIcL;
                java.lang.String nickName = newsFlashAuthor.getNickName();
                textView2.setText(nickName != null ? nickName : "");
            }
            android.widget.TextView textView3 = this.AhwBna;
            tTZ ttz = tTZ.EZpvd;
            android.app.Application applicationOLrzqt = C32979mnm.EZpvd.OLrzqt();
            java.lang.String publishTime = newsFlashArticle.getPublishTime();
            textView3.setText(ttz.KWHzl(applicationOLrzqt, publishTime != null ? java.lang.Long.valueOf(C33129mqd.valueOf(publishTime)) : null));
            java.lang.String strGEmmrt = C33129mqd.gEmmrt(spotlightToken != null ? spotlightToken.getCoinName() : null);
            android.view.View view = this.itemView;
            view.setOnClickListener(new StateListAnimator(view, 1000L, this, newsFlashArticle, strGEmmrt));
        }

        /* JADX INFO: renamed from: o.tuB$Activity$StateListAnimator */
        public static final class StateListAnimator implements View.OnClickListener {
            public final /* synthetic */ NewsFlashArticle AEQbTJ;
            public final /* synthetic */ android.view.View EZpvd;
            public final /* synthetic */ long KWHzl;
            public final /* synthetic */ java.lang.String OLrzqt;
            public final /* synthetic */ Activity copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public StateListAnimator(android.view.View view, long j, Activity activity, NewsFlashArticle newsFlashArticle, java.lang.String str) {
                this.EZpvd = view;
                this.KWHzl = j;
                this.copydefault = activity;
                this.AEQbTJ = newsFlashArticle;
                this.OLrzqt = str;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.KWHzl || (this.EZpvd instanceof android.widget.Checkable)) {
                    C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                    C32866mlf.onEvent$default("Feeds_Mid_Item_Click", (TrackChannel[]) null, new ActionBar(this.OLrzqt), 1, (java.lang.Object) null);
                    C43056riA c43056riA = C43056riA.AEQbTJ;
                    android.content.Context context = this.copydefault.itemView.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "");
                    ExperienceRouteConst.MiniAppRoute miniAppRoute = ExperienceRouteConst.MiniAppRoute.COMMUNITY_DETAIL;
                    java.lang.String url = miniAppRoute.getUrl();
                    kotlin.Pair[] pairArr = new kotlin.Pair[3];
                    java.lang.String contentId = this.AEQbTJ.getContentId();
                    pairArr[0] = C56390yDp.OLrzqt("contentId", contentId != null ? contentId : "");
                    pairArr[1] = C56390yDp.OLrzqt("fromPage", "discover_card");
                    pairArr[2] = C56390yDp.OLrzqt("minversion", miniAppRoute.getMinAppVersion());
                    c43056riA.copydefault(context, "market", url, C56424yEw.gEmmrt(pairArr));
                }
            }
        }

        /* JADX INFO: renamed from: o.tuB$Activity$ActionBar */
        public static final class ActionBar implements Function1<EventParamsList, Unit> {
            public final /* synthetic */ java.lang.String copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public ActionBar(java.lang.String str) {
                this.copydefault = str;
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function1
            public /* synthetic */ Unit invoke(EventParamsList eventParamsList) {
                copydefault(eventParamsList);
                return Unit.INSTANCE;
            }

            public final void copydefault(EventParamsList eventParamsList) {
                Intrinsics.checkNotNullParameter(eventParamsList, "");
                EventParamsList.put$default(eventParamsList, "page", "discover_card", false, 4, null);
                EventParamsList.put$default(eventParamsList, "token_label", this.copydefault, false, 4, null);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:32:0x0094 A[PHI: r0
  0x0094: PHI (r0v8 java.lang.Double) = (r0v7 java.lang.Double), (r0v10 java.lang.Double) binds: [B:30:0x008d, B:27:0x0082] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:34:0x0097  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final java.lang.Double EZpvd(SpotlightToken spotlightToken, java.util.Map<java.lang.String, C47671tuX> map, java.util.Map<java.lang.String, C47670tuW> map2) {
            java.lang.Double last;
            java.lang.Double open24h;
            java.lang.Double sodUtc0;
            java.lang.Double sodUtc8;
            java.lang.Double sodUtc02;
            java.lang.Double open24h2;
            java.lang.Double dKWHzl;
            java.lang.String type = spotlightToken.getType();
            if (type == null) {
                type = "cefi";
            }
            InterfaceC46557tYt interfaceC46557tYt = (InterfaceC46557tYt) C43251rlk.OLrzqt(InterfaceC46557tYt.class);
            int iEZpvd = interfaceC46557tYt != null ? interfaceC46557tYt.EZpvd() : 0;
            if (Intrinsics.EZpvd((java.lang.Object) type, (java.lang.Object) "cedefi")) {
                C47670tuW c47670tuW = map2.get(spotlightToken.getChainId() + "_" + spotlightToken.getTokenContractAddress());
                if (c47670tuW != null) {
                    if (iEZpvd == 1) {
                        dKWHzl = c47670tuW.KWHzl();
                    } else if (iEZpvd == 2) {
                        dKWHzl = c47670tuW.EZpvd();
                    } else {
                        dKWHzl = c47670tuW.AEQbTJ();
                    }
                    if (dKWHzl != null) {
                        return java.lang.Double.valueOf(dKWHzl.doubleValue() / ((double) 100));
                    }
                    return null;
                }
                java.lang.Double last2 = spotlightToken.getLast();
                if (last2 != null) {
                    double dDoubleValue = last2.doubleValue();
                    if (iEZpvd != 1) {
                        open24h2 = (iEZpvd == 2 && (sodUtc02 = spotlightToken.getSodUtc8()) != null) ? sodUtc02 : spotlightToken.getOpen24h();
                        if (open24h2 != null) {
                            double dDoubleValue2 = open24h2.doubleValue();
                            if (dDoubleValue2 <= AudioStats.AUDIO_AMPLITUDE_NONE) {
                                return null;
                            }
                            return java.lang.Double.valueOf((dDoubleValue - dDoubleValue2) / dDoubleValue2);
                        }
                    } else {
                        sodUtc02 = spotlightToken.getSodUtc0();
                        if (sodUtc02 == null) {
                            open24h2 = spotlightToken.getOpen24h();
                        }
                        if (open24h2 != null) {
                        }
                    }
                }
                return null;
            }
            java.lang.String instId = spotlightToken.getInstId();
            C47671tuX c47671tuX = instId != null ? map.get(instId) : null;
            if ((c47671tuX == null || (last = c47671tuX.AEQbTJ()) == null) && (last = spotlightToken.getLast()) == null) {
                return null;
            }
            double dDoubleValue3 = last.doubleValue();
            if (c47671tuX == null || (open24h = c47671tuX.EZpvd()) == null) {
                open24h = spotlightToken.getOpen24h();
            }
            if (c47671tuX == null || (sodUtc0 = c47671tuX.OLrzqt()) == null) {
                sodUtc0 = spotlightToken.getSodUtc0();
            }
            if (c47671tuX == null || (sodUtc8 = c47671tuX.KWHzl()) == null) {
                sodUtc8 = spotlightToken.getSodUtc8();
            }
            if (iEZpvd != 1) {
                if (iEZpvd == 2 && sodUtc8 != null) {
                    open24h = sodUtc8;
                }
            } else if (sodUtc0 != null) {
                open24h = sodUtc0;
            }
            if (open24h == null) {
                return null;
            }
            double dDoubleValue4 = open24h.doubleValue();
            if (dDoubleValue4 <= AudioStats.AUDIO_AMPLITUDE_NONE) {
                return null;
            }
            return java.lang.Double.valueOf((dDoubleValue3 - dDoubleValue4) / dDoubleValue4);
        }

        public final java.lang.String OLrzqt(double d) {
            return pTB.formatICUPercent$default(pTB.OLrzqt(java.lang.Double.valueOf(d)), RoundingMode.DOWN, C38307pTy.Companion.KWHzl(2, 2), DisplaySign.EXCEPT_ZERO, java.lang.Double.valueOf(100.0d), null, 16, null);
        }

        public final int AEQbTJ(double d) {
            return java.lang.Math.abs(d) < 1.0E-4d ? this.valueOf : d > AudioStats.AUDIO_AMPLITUDE_NONE ? this.AYXKKw : this.copydefault;
        }
    }

    public final java.util.List<SpotlightToken> EZpvd() {
        java.util.List<NewsFlashArticle> list = this.OLrzqt;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            java.util.List<SpotlightToken> tokens = ((NewsFlashArticle) it.next()).getTokens();
            SpotlightToken spotlightToken = tokens != null ? (SpotlightToken) CollectionsKt___CollectionsKt.firstOrNull(tokens) : null;
            if (spotlightToken != null) {
                arrayList.add(spotlightToken);
            }
        }
        return arrayList;
    }
}
