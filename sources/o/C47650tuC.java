package o;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.camera.video.AudioStats;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.offline.DownloadService;
import com.huawei.hms.framework.common.ContainerUtils;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.localization.util.format.DisplaySign;
import com.okinc.market.common.constants.ExperienceRouteConst;
import com.okinc.mln_ui.ui.okkit.UdMath;
import com.okinc.planet.biz_content.leaderboard.adapter.PlanetSpotlightAdapter$updatePriceData$2;
import com.okinc.planet.biz_content.leaderboard.bean.SpotlightArticle;
import com.okinc.planet.biz_content.leaderboard.bean.SpotlightAuthor;
import com.okinc.planet.biz_content.leaderboard.bean.SpotlightImage;
import com.okinc.planet.biz_content.leaderboard.bean.SpotlightToken;
import java.lang.ref.WeakReference;
import java.math.RoundingMode;
import java.net.URLEncoder;
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
import o.C47650tuC;
import o.C52761wXj;
import o.InterfaceC43294rma;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tuC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C47650tuC extends RecyclerView.Adapter<StateListAnimator> {
    public WeakReference<RecyclerView> djBIcL;
    public final java.util.List<SpotlightArticle> AEQbTJ = new java.util.ArrayList();
    public final java.util.Set<java.lang.String> EZpvd = new LinkedHashSet();
    public int KWHzl = 3;
    public final ConcurrentHashMap<java.lang.String, C47671tuX> copydefault = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<java.lang.String, C47670tuW> OLrzqt = new ConcurrentHashMap<>();

    public final void EZpvd(int i) {
        int iCopydefault = C56548yJl.copydefault(i, 0);
        if (this.KWHzl == iCopydefault) {
            return;
        }
        int iMin = java.lang.Math.min(this.AEQbTJ.size(), this.KWHzl);
        int iMin2 = java.lang.Math.min(this.AEQbTJ.size(), iCopydefault);
        this.KWHzl = iCopydefault;
        if (iMin2 < iMin) {
            notifyItemRangeRemoved(iMin2, iMin - iMin2);
            if (iMin2 > 0) {
                notifyItemRangeChanged(0, iMin2);
                return;
            }
            return;
        }
        if (iMin2 > iMin) {
            notifyItemRangeInserted(iMin, iMin2 - iMin);
            if (iMin > 0) {
                notifyItemRangeChanged(0, iMin);
            }
        }
    }

    public final void copydefault(@NotNull java.util.List<SpotlightArticle> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.AEQbTJ.clear();
        this.AEQbTJ.addAll(list);
        notifyDataSetChanged();
    }

    public final void KWHzl(@NotNull java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
        RecyclerView recyclerView;
        Intrinsics.checkNotNullParameter(map, "");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Map.Entry<java.lang.String, ? extends java.lang.Object> entry : map.entrySet()) {
            java.lang.String key = entry.getKey();
            java.lang.Object value = entry.getValue();
            if (value instanceof C47671tuX) {
                this.copydefault.put(key, (C47671tuX) value);
                linkedHashSet.add(key);
            } else if (value instanceof C47670tuW) {
                this.OLrzqt.put(key, (C47670tuW) value);
                linkedHashSet.add(key);
            }
        }
        if (linkedHashSet.isEmpty()) {
            return;
        }
        java.util.Map<java.lang.String, java.util.Set<java.lang.Integer>> mapEZpvd = EZpvd();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            java.util.Set<java.lang.Integer> setCopydefault = mapEZpvd.get((java.lang.String) it.next());
            if (setCopydefault == null) {
                setCopydefault = yEE.copydefault();
            }
            C56406yEe.KWHzl(arrayList, setCopydefault);
        }
        java.util.Set setOqFWZa = CollectionsKt___CollectionsKt.OqFWZa(arrayList);
        WeakReference<RecyclerView> weakReference = this.djBIcL;
        if (weakReference == null || (recyclerView = weakReference.get()) == null) {
            return;
        }
        java.util.Iterator it2 = setOqFWZa.iterator();
        while (it2.hasNext()) {
            int iIntValue = ((java.lang.Number) it2.next()).intValue();
            if (iIntValue >= 0 && iIntValue < getItemCount()) {
                RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(iIntValue);
                StateListAnimator stateListAnimator = viewHolderFindViewHolderForAdapterPosition instanceof StateListAnimator ? (StateListAnimator) viewHolderFindViewHolderForAdapterPosition : null;
                if (stateListAnimator != null && stateListAnimator.getAdapterPosition() == iIntValue) {
                    stateListAnimator.EZpvd(this.copydefault, this.OLrzqt, linkedHashSet, new PlanetSpotlightAdapter$updatePriceData$2(this));
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(@NotNull RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "");
        super.onAttachedToRecyclerView(recyclerView);
        this.djBIcL = new WeakReference<>(recyclerView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onDetachedFromRecyclerView(@NotNull RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "");
        super.onDetachedFromRecyclerView(recyclerView);
        this.djBIcL = null;
    }

    private final java.util.Map<java.lang.String, java.util.Set<java.lang.Integer>> EZpvd() {
        java.util.List<SpotlightToken> tokens;
        SpotlightToken spotlightToken;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int itemCount = getItemCount();
        for (int i = 0; i < itemCount; i++) {
            SpotlightArticle spotlightArticle = (SpotlightArticle) CollectionsKt___CollectionsKt.AkhnZx(this.AEQbTJ, i);
            if (spotlightArticle != null && (tokens = spotlightArticle.getTokens()) != null && (spotlightToken = (SpotlightToken) CollectionsKt___CollectionsKt.firstOrNull(tokens)) != null) {
                java.lang.String strOLrzqt = OLrzqt(spotlightToken);
                if (strOLrzqt.length() > 0) {
                    java.lang.Object linkedHashSet = linkedHashMap.get(strOLrzqt);
                    if (linkedHashSet == null) {
                        linkedHashSet = new LinkedHashSet();
                        linkedHashMap.put(strOLrzqt, linkedHashSet);
                    }
                    ((java.util.Set) linkedHashSet).add(java.lang.Integer.valueOf(i));
                }
            }
        }
        return linkedHashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.String OLrzqt(SpotlightToken spotlightToken) {
        if (Intrinsics.EZpvd((java.lang.Object) spotlightToken.getType(), (java.lang.Object) "cedefi")) {
            return spotlightToken.getChainId() + "_" + spotlightToken.getTokenContractAddress();
        }
        java.lang.String instId = spotlightToken.getInstId();
        return instId == null ? "" : instId;
    }

    /* JADX INFO: renamed from: o.tuC$StateListAnimator */
    public static final class StateListAnimator extends RecyclerView.ViewHolder {
        public final int AYXKKw;
        public final int AhwBna;
        public final android.widget.TextView AkhnZx;
        public final android.widget.TextView AuCTel;
        public final android.widget.LinearLayout DbNXlk;
        public SpotlightToken EZpvd;
        public final android.widget.FrameLayout KWHzl;
        public final android.widget.ImageView OLrzqt;
        public final int copydefault;
        public android.widget.TextView djBIcL;
        public final android.widget.TextView fJNWhG;
        public final android.widget.TextView fetchVPNInfo;
        public final android.widget.ImageView gEmmrt;
        public final android.widget.TextView isConnected;
        public final android.widget.ImageView valueOf;
        public final android.widget.TextView values;
        public static final TaskDescription Companion = new TaskDescription(null);
        public static final int AEQbTJ = 8;

        /* JADX INFO: renamed from: o.tuC$StateListAnimator$ActionBar */
        public static final class ActionBar implements View.OnClickListener {
            public final /* synthetic */ SpotlightArticle AEQbTJ;
            public final /* synthetic */ android.view.View EZpvd;
            public final /* synthetic */ java.lang.String KWHzl;
            public final /* synthetic */ java.lang.String OLrzqt;
            public final /* synthetic */ long copydefault;
            public final /* synthetic */ StateListAnimator djBIcL;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public ActionBar(android.view.View view, long j, StateListAnimator stateListAnimator, SpotlightArticle spotlightArticle, java.lang.String str, java.lang.String str2) {
                this.EZpvd = view;
                this.copydefault = j;
                this.djBIcL = stateListAnimator;
                this.AEQbTJ = spotlightArticle;
                this.OLrzqt = str;
                this.KWHzl = str2;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.copydefault || (this.EZpvd instanceof android.widget.Checkable)) {
                    C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                    C32866mlf.onEvent$default("Orbit_Page_Spotlight_Click", (TrackChannel[]) null, new Application(this.AEQbTJ, this.OLrzqt, this.KWHzl), 1, (java.lang.Object) null);
                    C43056riA c43056riA = C43056riA.AEQbTJ;
                    android.content.Context context = this.djBIcL.itemView.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "");
                    ExperienceRouteConst.MiniAppRoute miniAppRoute = ExperienceRouteConst.MiniAppRoute.COMMUNITY_DETAIL;
                    java.lang.String url = miniAppRoute.getUrl();
                    kotlin.Pair[] pairArr = new kotlin.Pair[3];
                    java.lang.String contentId = this.AEQbTJ.getContentId();
                    pairArr[0] = C56390yDp.OLrzqt("contentId", contentId != null ? contentId : "");
                    pairArr[1] = C56390yDp.OLrzqt("fromPage", "spotlight");
                    pairArr[2] = C56390yDp.OLrzqt("minversion", miniAppRoute.getMinAppVersion());
                    c43056riA.copydefault(context, "market", url, C56424yEw.gEmmrt(pairArr));
                }
            }
        }

        /* JADX INFO: renamed from: o.tuC$StateListAnimator$Activity */
        public static final class Activity implements View.OnClickListener {
            public final /* synthetic */ java.lang.String AEQbTJ;
            public final /* synthetic */ long EZpvd;
            public final /* synthetic */ java.lang.String KWHzl;
            public final /* synthetic */ android.view.View OLrzqt;
            public final /* synthetic */ java.lang.String copydefault;
            public final /* synthetic */ StateListAnimator djBIcL;
            public final /* synthetic */ SpotlightToken gEmmrt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public Activity(android.view.View view, long j, StateListAnimator stateListAnimator, SpotlightToken spotlightToken, java.lang.String str, java.lang.String str2, java.lang.String str3) {
                this.OLrzqt = view;
                this.EZpvd = j;
                this.djBIcL = stateListAnimator;
                this.gEmmrt = spotlightToken;
                this.KWHzl = str;
                this.AEQbTJ = str2;
                this.copydefault = str3;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.EZpvd || (this.OLrzqt instanceof android.widget.Checkable)) {
                    C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                    C32866mlf.onEvent$default("Orbit_Spotlight_Token_Click", (TrackChannel[]) null, new C0965StateListAnimator(this.AEQbTJ, this.copydefault, this.gEmmrt), 1, (java.lang.Object) null);
                    this.djBIcL.EZpvd(this.gEmmrt, this.KWHzl);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull android.view.View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "");
            C33512mxp c33512mxp = C33512mxp.AEQbTJ;
            android.content.Context context = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            this.copydefault = C33512mxp.tradeFallTagContent$default(c33512mxp, context, 0.0f, 2, null);
            android.content.Context context2 = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            this.AhwBna = C33512mxp.tradeRiseTagContent$default(c33512mxp, context2, 0.0f, 2, null);
            this.AYXKKw = C33070mpX.copydefault(C52761wXj.Activity.fdOvFl);
            android.view.View viewFindViewById = view.findViewById(C47501trL.TaskDescription.ggKfIT);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
            this.OLrzqt = (android.widget.ImageView) viewFindViewById;
            android.view.View viewFindViewById2 = view.findViewById(C47501trL.TaskDescription.HJWChPURsaBn);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "");
            this.isConnected = (android.widget.TextView) viewFindViewById2;
            android.view.View viewFindViewById3 = view.findViewById(C47501trL.TaskDescription.invokespecialaGOrKO);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "");
            this.gEmmrt = (android.widget.ImageView) viewFindViewById3;
            android.view.View viewFindViewById4 = view.findViewById(C47501trL.TaskDescription.HJWChPfvRMlC);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "");
            this.fJNWhG = (android.widget.TextView) viewFindViewById4;
            android.view.View viewFindViewById5 = view.findViewById(C47501trL.TaskDescription.sZqaRl);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "");
            this.values = (android.widget.TextView) viewFindViewById5;
            android.view.View viewFindViewById6 = view.findViewById(C47501trL.TaskDescription.DTeKQX);
            android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) viewFindViewById6;
            frameLayout.setClipToOutline(true);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "");
            this.KWHzl = frameLayout;
            android.view.View viewFindViewById7 = view.findViewById(C47501trL.TaskDescription.invokespecialDaTmkG);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById7, "");
            this.valueOf = (android.widget.ImageView) viewFindViewById7;
            android.view.View viewFindViewById8 = view.findViewById(C47501trL.TaskDescription.HJWChPQdUnVm);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById8, "");
            this.AkhnZx = (android.widget.TextView) viewFindViewById8;
            android.view.View viewFindViewById9 = view.findViewById(C47501trL.TaskDescription.GiPPlLgiPPlL);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById9, "");
            this.DbNXlk = (android.widget.LinearLayout) viewFindViewById9;
            android.view.View viewFindViewById10 = view.findViewById(C47501trL.TaskDescription.gCNefq);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById10, "");
            this.fetchVPNInfo = (android.widget.TextView) viewFindViewById10;
            android.view.View viewFindViewById11 = view.findViewById(C47501trL.TaskDescription.izFvvl);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById11, "");
            this.AuCTel = (android.widget.TextView) viewFindViewById11;
        }

        /* JADX INFO: renamed from: o.tuC$StateListAnimator$TaskDescription */
        public static final class TaskDescription {
            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.tuC.StateListAnimator.TaskDescription.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private TaskDescription() {
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: o.tuC$StateListAnimator */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void updatePriceOnly$default(StateListAnimator stateListAnimator, java.util.Map map, java.util.Map map2, java.util.Set set, Function1 function1, int i, java.lang.Object obj) {
            if ((i & 4) != 0) {
                set = null;
            }
            if ((i & 8) != 0) {
                function1 = null;
            }
            stateListAnimator.EZpvd(map, map2, set, function1);
        }

        public final void EZpvd(@NotNull java.util.Map<java.lang.String, C47671tuX> map, @NotNull java.util.Map<java.lang.String, C47670tuW> map2, java.util.Set<java.lang.String> set, Function1<? super SpotlightToken, java.lang.String> function1) {
            android.widget.TextView textView;
            java.lang.Double dAEQbTJ;
            Intrinsics.checkNotNullParameter(map, "");
            Intrinsics.checkNotNullParameter(map2, "");
            SpotlightToken spotlightToken = this.EZpvd;
            if (spotlightToken == null || (textView = this.djBIcL) == null) {
                return;
            }
            if ((set == null || function1 == null || set.contains(function1.invoke(spotlightToken))) && (dAEQbTJ = AEQbTJ(spotlightToken, map, map2)) != null) {
                textView.setText(KWHzl(dAEQbTJ.doubleValue()));
                textView.setTextColor(AEQbTJ(dAEQbTJ.doubleValue()));
                textView.setVisibility(0);
            }
        }

        public final void KWHzl(@NotNull SpotlightArticle spotlightArticle, @NotNull java.util.Map<java.lang.String, C47671tuX> map, @NotNull java.util.Map<java.lang.String, C47670tuW> map2, int i) {
            SpotlightToken spotlightToken;
            SpotlightImage spotlightImage;
            java.lang.String nickName;
            java.lang.String portrait;
            java.lang.String str = "";
            Intrinsics.checkNotNullParameter(spotlightArticle, "");
            Intrinsics.checkNotNullParameter(map, "");
            Intrinsics.checkNotNullParameter(map2, "");
            android.widget.ImageView imageView = this.OLrzqt;
            SpotlightAuthor author = spotlightArticle.getAuthor();
            C33054mpH.loadAvatar$default(imageView, (author == null || (portrait = author.getPortrait()) == null) ? "" : portrait, null, null, 6, null);
            android.widget.TextView textView = this.isConnected;
            SpotlightAuthor author2 = spotlightArticle.getAuthor();
            if (author2 != null && (nickName = author2.getNickName()) != null) {
                str = nickName;
            }
            textView.setText(str);
            android.widget.ImageView imageView2 = this.gEmmrt;
            SpotlightAuthor author3 = spotlightArticle.getAuthor();
            java.lang.String coinName = null;
            imageView2.setVisibility(Intrinsics.EZpvd((java.lang.Object) (author3 != null ? author3.getOfficialStatus() : null), (java.lang.Object) "1") ? 0 : 8);
            tTZ ttz = tTZ.EZpvd;
            android.app.Application applicationOLrzqt = C32979mnm.EZpvd.OLrzqt();
            java.lang.String publishTime = spotlightArticle.getPublishTime();
            this.fJNWhG.setText(ttz.KWHzl(applicationOLrzqt, publishTime != null ? java.lang.Long.valueOf(C33129mqd.valueOf(publishTime)) : null));
            this.values.setText(C33129mqd.gEmmrt(spotlightArticle.getContent()));
            java.util.List<SpotlightImage> imageList = spotlightArticle.getImageList();
            java.lang.String url = (imageList == null || (spotlightImage = (SpotlightImage) CollectionsKt___CollectionsKt.firstOrNull(imageList)) == null) ? null : spotlightImage.getUrl();
            if (url != null && url.length() != 0) {
                this.KWHzl.setVisibility(0);
                C33054mpH.copydefault(this.valueOf, url, C55298xhM.dp2px$default(8.0f, null, 1, null));
                int size = imageList.size();
                if (size > 1) {
                    this.AkhnZx.setVisibility(0);
                    this.AkhnZx.setText(java.lang.String.valueOf(size));
                } else {
                    this.AkhnZx.setVisibility(8);
                }
            } else {
                this.KWHzl.setVisibility(8);
            }
            java.util.List<SpotlightToken> tokens = spotlightArticle.getTokens();
            if (tokens != null && (spotlightToken = (SpotlightToken) CollectionsKt___CollectionsKt.firstOrNull(tokens)) != null) {
                coinName = spotlightToken.getCoinName();
            }
            java.lang.String strGEmmrt = C33129mqd.gEmmrt(coinName);
            java.lang.String strValueOf = java.lang.String.valueOf(i + 1);
            copydefault(spotlightArticle.getTokens(), map, map2, spotlightArticle.getOrderTag(), spotlightArticle.getContentId(), strValueOf);
            this.fetchVPNInfo.setText(EZpvd(spotlightArticle.getLikeCount()));
            this.AuCTel.setText(EZpvd(spotlightArticle.getViewCount()));
            android.view.View view = this.itemView;
            view.setOnClickListener(new ActionBar(view, 1000L, this, spotlightArticle, strValueOf, strGEmmrt));
        }

        /* JADX INFO: renamed from: o.tuC$StateListAnimator$Application */
        public static final class Application implements Function1<EventParamsList, Unit> {
            public final /* synthetic */ java.lang.String KWHzl;
            public final /* synthetic */ java.lang.String OLrzqt;
            public final /* synthetic */ SpotlightArticle copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public Application(SpotlightArticle spotlightArticle, java.lang.String str, java.lang.String str2) {
                this.copydefault = spotlightArticle;
                this.KWHzl = str;
                this.OLrzqt = str2;
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function1
            public /* synthetic */ Unit invoke(EventParamsList eventParamsList) {
                AEQbTJ(eventParamsList);
                return Unit.INSTANCE;
            }

            public final void AEQbTJ(EventParamsList eventParamsList) {
                Intrinsics.checkNotNullParameter(eventParamsList, "");
                EventParamsList.put$default(eventParamsList, DownloadService.KEY_CONTENT_ID, C33129mqd.gEmmrt(this.copydefault.getContentId()), false, 4, null);
                EventParamsList.put$default(eventParamsList, "pos", this.KWHzl, false, 4, null);
                EventParamsList.put$default(eventParamsList, "token", this.OLrzqt, false, 4, null);
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for r13v0, resolved type: android.view.LayoutInflater */
        /* JADX DEBUG: Multi-variable search result rejected for r1v9, resolved type: android.widget.TextView */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r12v0 */
        /* JADX WARN: Type inference failed for: r12v1, types: [boolean, int] */
        /* JADX WARN: Type inference failed for: r12v3 */
        public final void copydefault(java.util.List<SpotlightToken> list, java.util.Map<java.lang.String, C47671tuX> map, java.util.Map<java.lang.String, C47670tuW> map2, java.lang.String str, java.lang.String str2, java.lang.String str3) {
            this.DbNXlk.removeAllViews();
            this.EZpvd = null;
            this.djBIcL = null;
            int i = 8;
            if (list == null || list.isEmpty()) {
                this.DbNXlk.setVisibility(8);
                return;
            }
            ?? r12 = 0;
            this.DbNXlk.setVisibility(0);
            android.view.LayoutInflater layoutInflaterFrom = android.view.LayoutInflater.from(this.itemView.getContext());
            for (SpotlightToken spotlightToken : CollectionsKt___CollectionsKt.AhwBna((java.lang.Iterable) list, 1)) {
                this.EZpvd = spotlightToken;
                android.view.View viewInflate = layoutInflaterFrom.inflate(C47501trL.Application.fjfviF, this.DbNXlk, (boolean) r12);
                android.widget.ImageView imageView = (android.widget.ImageView) viewInflate.findViewById(C47501trL.TaskDescription.invokespecialaVhqwO);
                android.widget.TextView textView = (android.widget.TextView) viewInflate.findViewById(C47501trL.TaskDescription.hfeTOA);
                android.widget.TextView textView2 = (android.widget.TextView) viewInflate.findViewById(C47501trL.TaskDescription.iRgjgR);
                this.djBIcL = textView2;
                java.lang.String icon = spotlightToken.getIcon();
                if (icon != null && icon.length() != 0) {
                    Intrinsics.copydefault(imageView);
                    C33054mpH.loadAvatar$default(imageView, spotlightToken.getIcon(), null, null, 6, null);
                }
                java.lang.String coinName = spotlightToken.getCoinName();
                if (coinName == null) {
                    coinName = "";
                }
                textView.setText(coinName);
                java.lang.Double dAEQbTJ = AEQbTJ(spotlightToken, map, map2);
                if (dAEQbTJ != null) {
                    textView2.setText(KWHzl(dAEQbTJ.doubleValue()));
                    textView2.setTextColor(AEQbTJ(dAEQbTJ.doubleValue()));
                    textView2.setVisibility(r12);
                } else {
                    textView2.setVisibility(i);
                }
                viewInflate.setOnClickListener(new Activity(viewInflate, 1000L, this, spotlightToken, str, str2, str3));
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                if (this.DbNXlk.getChildCount() != 0) {
                    layoutParams.setMarginStart(C55298xhM.dp2px$default(8.0f, null, 1, null));
                }
                viewInflate.setLayoutParams(layoutParams);
                this.DbNXlk.addView(viewInflate);
                i = 8;
                r12 = 0;
            }
        }

        /* JADX INFO: renamed from: o.tuC$StateListAnimator$StateListAnimator, reason: collision with other inner class name */
        public static final class C0965StateListAnimator implements Function1<EventParamsList, Unit> {
            public final /* synthetic */ java.lang.String AEQbTJ;
            public final /* synthetic */ java.lang.String KWHzl;
            public final /* synthetic */ SpotlightToken copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public C0965StateListAnimator(java.lang.String str, java.lang.String str2, SpotlightToken spotlightToken) {
                this.KWHzl = str;
                this.AEQbTJ = str2;
                this.copydefault = spotlightToken;
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function1
            public /* synthetic */ Unit invoke(EventParamsList eventParamsList) {
                AEQbTJ(eventParamsList);
                return Unit.INSTANCE;
            }

            public final void AEQbTJ(EventParamsList eventParamsList) {
                Intrinsics.checkNotNullParameter(eventParamsList, "");
                EventParamsList.put$default(eventParamsList, DownloadService.KEY_CONTENT_ID, C33129mqd.gEmmrt(this.KWHzl), false, 4, null);
                EventParamsList.put$default(eventParamsList, "pos", this.AEQbTJ, false, 4, null);
                EventParamsList.put$default(eventParamsList, "token", C33129mqd.gEmmrt(this.copydefault.getCoinName()), false, 4, null);
            }
        }

        public final void EZpvd(SpotlightToken spotlightToken, java.lang.String str) {
            java.lang.String strOLrzqt;
            java.lang.String type = spotlightToken.getType();
            if (type == null) {
                type = "cefi";
            }
            if (Intrinsics.EZpvd((java.lang.Object) type, (java.lang.Object) "cedefi")) {
                strOLrzqt = OLrzqt(spotlightToken);
            } else {
                strOLrzqt = OLrzqt(spotlightToken, str);
            }
            java.lang.String str2 = strOLrzqt;
            if (str2.length() > 0) {
                InterfaceC43294rma interfaceC43294rma = (InterfaceC43294rma) C43251rlk.copydefault(InterfaceC43294rma.class);
                android.app.Activity activityAEQbTJ = C54819xWm.KWHzl().AEQbTJ();
                Intrinsics.checkNotNullExpressionValue(activityAEQbTJ, "");
                InterfaceC43294rma.Application.processDeeplink$default(interfaceC43294rma, activityAEQbTJ, str2, null, new Function1() { // from class: o.tuE
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C47650tuC.StateListAnimator.OLrzqt((AbstractC43238rlX) obj);
                    }
                }, 4, null);
            }
        }

        public static final Unit OLrzqt(AbstractC43238rlX abstractC43238rlX) {
            Intrinsics.checkNotNullParameter(abstractC43238rlX, "");
            return Unit.INSTANCE;
        }

        public final java.lang.String OLrzqt(SpotlightToken spotlightToken, java.lang.String str) {
            java.lang.String instId = spotlightToken.getInstId();
            if (instId == null) {
                return "";
            }
            java.lang.String instType = spotlightToken.getInstType();
            if (instType == null) {
                instType = "SPOT";
            }
            return "okx://trade_kline?id=" + instId + "&type=" + instType + "&refreshWidget=1&source=spotlight&tag=" + str;
        }

        public final java.lang.String OLrzqt(SpotlightToken spotlightToken) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.String chainId = spotlightToken.getChainId();
            if (chainId != null && chainId.length() > 0) {
                arrayList.add("chainId=" + chainId);
            }
            java.lang.String tokenContractAddress = spotlightToken.getTokenContractAddress();
            if (tokenContractAddress != null && tokenContractAddress.length() > 0) {
                arrayList.add("tokenaddr=" + tokenContractAddress);
            }
            java.lang.String coinName = spotlightToken.getCoinName();
            if (coinName != null && coinName.length() > 0) {
                try {
                    coinName = URLEncoder.encode(coinName, com.google.android.exoplayer2.C.UTF8_NAME);
                } catch (java.lang.Exception unused) {
                }
                arrayList.add("tokenName=" + coinName);
            }
            if (!(!arrayList.isEmpty())) {
                return "";
            }
            return "okx://pro/cedefi_kline?" + CollectionsKt___CollectionsKt.joinToString$default(arrayList, ContainerUtils.FIELD_DELIMITER, null, null, 0, null, null, 62, null);
        }

        private final java.lang.Double AEQbTJ(SpotlightToken spotlightToken, java.util.Map<java.lang.String, C47671tuX> map, java.util.Map<java.lang.String, C47670tuW> map2) {
            java.lang.Double last;
            java.lang.Double open24h;
            java.lang.Double sodUtc0;
            java.lang.Double sodUtc8;
            double dAEQbTJ;
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
                    dAEQbTJ = C33129mqd.AEQbTJ(dKWHzl) / ((double) 100);
                } else {
                    java.lang.Double last2 = spotlightToken.getLast();
                    if (last2 != null) {
                        double dDoubleValue = last2.doubleValue();
                        java.lang.Double open24h2 = spotlightToken.getOpen24h();
                        java.lang.Double sodUtc02 = spotlightToken.getSodUtc0();
                        java.lang.Double sodUtc82 = spotlightToken.getSodUtc8();
                        if (iEZpvd != 1) {
                            if (iEZpvd == 2 && sodUtc82 != null) {
                                open24h2 = sodUtc82;
                            }
                        } else if (sodUtc02 != null) {
                            open24h2 = sodUtc02;
                        }
                        if (open24h2 != null) {
                            double dDoubleValue2 = open24h2.doubleValue();
                            if (dDoubleValue2 <= AudioStats.AUDIO_AMPLITUDE_NONE) {
                                return null;
                            }
                            dAEQbTJ = (dDoubleValue - dDoubleValue2) / dDoubleValue2;
                        }
                    }
                    return null;
                }
                return java.lang.Double.valueOf(dAEQbTJ);
            }
            java.lang.String instId = spotlightToken.getInstId();
            C47671tuX c47671tuX = instId != null ? map.get(instId) : null;
            if ((c47671tuX != null && (last = c47671tuX.AEQbTJ()) != null) || (last = spotlightToken.getLast()) != null) {
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
                if (open24h != null) {
                    double dDoubleValue4 = open24h.doubleValue();
                    if (dDoubleValue4 <= AudioStats.AUDIO_AMPLITUDE_NONE) {
                        return null;
                    }
                    return java.lang.Double.valueOf((dDoubleValue3 - dDoubleValue4) / dDoubleValue4);
                }
            }
            return null;
        }

        private final java.lang.String KWHzl(double d) {
            return pTB.formatICUPercent$default(pTB.OLrzqt(java.lang.Double.valueOf(d)), RoundingMode.DOWN, C38307pTy.Companion.KWHzl(2, 2), DisplaySign.EXCEPT_ZERO, java.lang.Double.valueOf(100.0d), null, 16, null);
        }

        private final int AEQbTJ(double d) {
            return java.lang.Math.abs(d) < 1.0E-4d ? this.AYXKKw : d > AudioStats.AUDIO_AMPLITUDE_NONE ? this.AhwBna : this.copydefault;
        }

        public final java.lang.String EZpvd(java.lang.Long l) {
            if (!C33129mqd.OLrzqt((java.lang.CharSequence) C33129mqd.gEmmrt(l))) {
                return "0";
            }
            java.lang.String numberKmb = UdMath.formatNumberKmb(C33129mqd.gEmmrt(l), 1, 2, 0, 0);
            Intrinsics.copydefault((java.lang.Object) numberKmb);
            return numberKmb;
        }
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public StateListAnimator onCreateViewHolder(@NotNull android.view.ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        android.view.View viewInflate = android.view.LayoutInflater.from(viewGroup.getContext()).inflate(C47501trL.Application.fERRXa, viewGroup, false);
        if (viewInflate.getLayoutParams() != null) {
            ViewGroup.LayoutParams layoutParams = viewInflate.getLayoutParams();
            Intrinsics.copydefault(layoutParams);
            layoutParams.width = getItemCount() == 1 ? -1 : viewGroup.getContext().getResources().getDimensionPixelSize(C47501trL.StateListAnimator.AEQbTJ);
        }
        Intrinsics.copydefault(viewInflate);
        return new StateListAnimator(viewInflate);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull StateListAnimator stateListAnimator, int i) {
        Intrinsics.checkNotNullParameter(stateListAnimator, "");
        stateListAnimator.KWHzl(this.AEQbTJ.get(i), this.copydefault, this.OLrzqt, i);
        if (stateListAnimator.itemView.getLayoutParams() != null) {
            ViewGroup.LayoutParams layoutParams = stateListAnimator.itemView.getLayoutParams();
            Intrinsics.copydefault(layoutParams);
            layoutParams.width = getItemCount() == 1 ? -1 : stateListAnimator.itemView.getContext().getResources().getDimensionPixelSize(C47501trL.StateListAnimator.AEQbTJ);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return java.lang.Math.min(this.AEQbTJ.size(), this.KWHzl);
    }

    public final void copydefault(final int i) {
        if (i < 0 || i >= getItemCount()) {
            return;
        }
        final SpotlightArticle spotlightArticle = this.AEQbTJ.get(i);
        final java.lang.String contentId = spotlightArticle.getContentId();
        if (C33129mqd.OLrzqt((java.lang.CharSequence) contentId)) {
            java.util.Set<java.lang.String> set = this.EZpvd;
            Intrinsics.copydefault((java.lang.Object) contentId);
            if (set.add(contentId)) {
                C32866mlf.onEvent$default("Orbit_Page_Spotlight_Show", (TrackChannel[]) null, new Function1() { // from class: o.tuF
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C47650tuC.KWHzl(contentId, i, spotlightArticle, (EventParamsList) obj);
                    }
                }, 1, (java.lang.Object) null);
            }
        }
    }

    public static final Unit KWHzl(java.lang.String str, int i, SpotlightArticle spotlightArticle, EventParamsList eventParamsList) {
        SpotlightToken spotlightToken;
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, DownloadService.KEY_CONTENT_ID, C33129mqd.gEmmrt(str), false, 4, null);
        EventParamsList.put$default(eventParamsList, "pos", java.lang.String.valueOf(i + 1), false, 4, null);
        java.util.List<SpotlightToken> tokens = spotlightArticle.getTokens();
        EventParamsList.put$default(eventParamsList, "token", C33129mqd.gEmmrt((tokens == null || (spotlightToken = (SpotlightToken) CollectionsKt___CollectionsKt.firstOrNull(tokens)) == null) ? null : spotlightToken.getCoinName()), false, 4, null);
        return Unit.INSTANCE;
    }

    public final void AEQbTJ() {
        this.EZpvd.clear();
    }

    public final java.util.List<SpotlightToken> KWHzl() {
        java.util.List<SpotlightArticle> list = this.AEQbTJ;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            java.util.List<SpotlightToken> tokens = ((SpotlightArticle) it.next()).getTokens();
            SpotlightToken spotlightToken = tokens != null ? (SpotlightToken) CollectionsKt___CollectionsKt.firstOrNull(tokens) : null;
            if (spotlightToken != null) {
                arrayList.add(spotlightToken);
            }
        }
        return arrayList;
    }
}
