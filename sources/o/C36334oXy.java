package o;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.kline.news.data.po.KlineFlashAuthorPo;
import com.okinc.kline.news.data.vo.KlineFlashVo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oXy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C36334oXy extends AbstractC59533zio<KlineFlashVo, ActionBar> {

    /* JADX INFO: renamed from: o.oXy$ActionBar */
    public static final class ActionBar extends RecyclerView.ViewHolder {
        public final C36102oPi OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C36102oPi KWHzl() {
            return this.OLrzqt;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActionBar(@NotNull C36102oPi c36102oPi) {
            super(c36102oPi.getRoot());
            Intrinsics.checkNotNullParameter(c36102oPi, "");
            this.OLrzqt = c36102oPi;
        }
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public ActionBar onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C36102oPi c36102oPiAEQbTJ = C36102oPi.AEQbTJ(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c36102oPiAEQbTJ, "");
        return new ActionBar(c36102oPiAEQbTJ);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull ActionBar actionBar, @NotNull KlineFlashVo klineFlashVo) {
        Intrinsics.checkNotNullParameter(actionBar, "");
        Intrinsics.checkNotNullParameter(klineFlashVo, "");
        android.widget.ImageView imageView = actionBar.KWHzl().copydefault;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        KlineFlashAuthorPo author = klineFlashVo.getPo().getAuthor();
        C33054mpH.KWHzl(imageView, author != null ? author.getPortrait() : null);
        android.widget.TextView textView = actionBar.KWHzl().OLrzqt;
        java.lang.String translatedTitle = klineFlashVo.getPo().getTranslatedTitle();
        textView.setText((translatedTitle == null || translatedTitle.length() == 0) ? klineFlashVo.getPo().getTitle() : klineFlashVo.getPo().getTranslatedTitle());
        actionBar.KWHzl().AYXKKw.setText(klineFlashVo.getTime());
        android.widget.TextView textView2 = actionBar.KWHzl().AhwBna;
        KlineFlashAuthorPo author2 = klineFlashVo.getPo().getAuthor();
        textView2.setText(author2 != null ? author2.getNickName() : null);
        android.view.View view = actionBar.itemView;
        view.setOnClickListener(new Application(view, 1000L, klineFlashVo, actionBar));
    }

    /* JADX INFO: renamed from: o.oXy$StateListAnimator */
    public static final class StateListAnimator implements Function1<EventParamsList, Unit> {
        public final /* synthetic */ ActionBar EZpvd;
        public final /* synthetic */ KlineFlashVo KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(KlineFlashVo klineFlashVo, ActionBar actionBar) {
            this.KWHzl = klineFlashVo;
            this.EZpvd = actionBar;
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
            java.lang.String contentId = this.KWHzl.getPo().getContentId();
            EventParamsList.put$default(eventParamsList, "feed_item_id", contentId == null ? "" : contentId, false, 4, null);
            EventParamsList.put$default(eventParamsList, "position", java.lang.String.valueOf(this.EZpvd.getBindingAdapterPosition()), false, 4, null);
            EventParamsList.put$default(eventParamsList, "token", this.KWHzl.getQueryName(), false, 4, null);
            EventParamsList.put$default(eventParamsList, "user_language", pSC.AEQbTJ.KWHzl(), false, 4, null);
        }
    }

    /* JADX INFO: renamed from: o.oXy$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ KlineFlashVo AEQbTJ;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ ActionBar copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, KlineFlashVo klineFlashVo, ActionBar actionBar) {
            this.KWHzl = view;
            this.OLrzqt = j;
            this.AEQbTJ = klineFlashVo;
            this.copydefault = actionBar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.OLrzqt || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                kotlin.Pair[] pairArr = new kotlin.Pair[3];
                java.lang.String contentId = this.AEQbTJ.getPo().getContentId();
                if (contentId == null) {
                    contentId = "";
                }
                pairArr[0] = C56390yDp.OLrzqt("contentId", contentId);
                pairArr[1] = C56390yDp.OLrzqt("fromPage", "chart");
                pairArr[2] = C56390yDp.OLrzqt("feedType", 4);
                java.util.Map<java.lang.String, ? extends java.lang.Object> mapDjBIcL = C56424yEw.djBIcL(pairArr);
                if (this.AEQbTJ.getChainId() != null && this.AEQbTJ.getTokenAddress() != null) {
                    mapDjBIcL.put("token", this.AEQbTJ.getQueryName());
                    mapDjBIcL.put("chainId", this.AEQbTJ.getChainId());
                    mapDjBIcL.put("contractAddress", this.AEQbTJ.getTokenAddress());
                }
                C43056riA c43056riA = C43056riA.AEQbTJ;
                android.content.Context context = this.copydefault.itemView.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                c43056riA.copydefault(context, "market", "/feed/detail", mapDjBIcL);
                C32866mlf.onEvent$default("KLine_Top_NewsContent_Click", (TrackChannel[]) null, new StateListAnimator(this.AEQbTJ, this.copydefault), 1, (java.lang.Object) null);
            }
        }
    }
}
