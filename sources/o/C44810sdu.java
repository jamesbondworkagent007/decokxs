package o;

import android.view.View;
import androidx.core.os.BundleKt;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.okex.article.bean.SupportFaqArticle;
import com.okinc.okex.center.bean.enums.TopCategory;
import java.util.Date;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.ActivityC45850szP;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.sdu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C44810sdu extends RecyclerView.Adapter<ActionBar> {
    public java.util.List<SupportFaqArticle> AEQbTJ;
    public final java.lang.String EZpvd;
    public boolean OLrzqt;
    public Function1<? super EventParamsList, Unit> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C44810sdu() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: kotlin.jvm.functions.Function1<? super com.okinc.components.track.bean.EventParamsList, kotlin.Unit>, kotlin.jvm.functions.Function1<com.okinc.components.track.bean.EventParamsList, kotlin.Unit> */
    public final Function1<EventParamsList, Unit> KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(Function1<? super EventParamsList, Unit> function1) {
        this.copydefault = function1;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000e: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0004: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:25)) : (r1v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
 A[MD:(java.util.List<com.okinc.okex.article.bean.SupportFaqArticle>, java.lang.String):void (m)] (LINE:24) call: o.sdu.<init>(java.util.List, java.lang.String):void type: THIS */
    public /* synthetic */ C44810sdu(java.util.List list, java.lang.String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? yDY.AhwBna() : list, (i & 2) != 0 ? "" : str);
    }

    public C44810sdu(@NotNull java.util.List<SupportFaqArticle> list, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.AEQbTJ = list;
        this.EZpvd = str;
    }

    public final void EZpvd(boolean z) {
        if (this.OLrzqt != z) {
            this.OLrzqt = z;
            notifyDataSetChanged();
        }
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public ActionBar onCreateViewHolder(@NotNull android.view.ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        AbstractC47389tpC abstractC47389tpCOLrzqt = AbstractC47389tpC.OLrzqt(android.view.LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(abstractC47389tpCOLrzqt, "");
        return new ActionBar(this, abstractC47389tpCOLrzqt);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull ActionBar actionBar, int i) {
        Intrinsics.checkNotNullParameter(actionBar, "");
        actionBar.AEQbTJ(this.AEQbTJ.get(i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        if (this.OLrzqt) {
            return this.AEQbTJ.size();
        }
        return 0;
    }

    /* JADX INFO: renamed from: o.sdu$TaskDescription */
    public static final class TaskDescription extends DiffUtil.Callback {
        public final /* synthetic */ java.util.List<SupportFaqArticle> OLrzqt;

        public TaskDescription(java.util.List<SupportFaqArticle> list) {
            this.OLrzqt = list;
        }

        @Override // androidx.recyclerview.widget.DiffUtil.Callback
        public int getOldListSize() {
            return C44810sdu.this.AEQbTJ.size();
        }

        @Override // androidx.recyclerview.widget.DiffUtil.Callback
        public int getNewListSize() {
            return this.OLrzqt.size();
        }

        @Override // androidx.recyclerview.widget.DiffUtil.Callback
        public boolean areItemsTheSame(int i, int i2) {
            return Intrinsics.EZpvd((java.lang.Object) ((SupportFaqArticle) C44810sdu.this.AEQbTJ.get(i)).getSlug(), (java.lang.Object) this.OLrzqt.get(i2).getSlug());
        }

        @Override // androidx.recyclerview.widget.DiffUtil.Callback
        public boolean areContentsTheSame(int i, int i2) {
            return Intrinsics.EZpvd(((SupportFaqArticle) C44810sdu.this.AEQbTJ.get(i)).getUpdateTime(), this.OLrzqt.get(i2).getUpdateTime()) && Intrinsics.EZpvd(((SupportFaqArticle) C44810sdu.this.AEQbTJ.get(i)).getOkxLikesNums(), this.OLrzqt.get(i2).getOkxLikesNums());
        }
    }

    public final void copydefault(@NotNull java.util.List<SupportFaqArticle> list) {
        Intrinsics.checkNotNullParameter(list, "");
        DiffUtil.DiffResult diffResultCalculateDiff = DiffUtil.calculateDiff(new TaskDescription(list));
        Intrinsics.checkNotNullExpressionValue(diffResultCalculateDiff, "");
        this.AEQbTJ = list;
        diffResultCalculateDiff.dispatchUpdatesTo(this);
    }

    public final void KWHzl(@NotNull java.util.List<SupportFaqArticle> list) {
        Intrinsics.checkNotNullParameter(list, "");
        copydefault(CollectionsKt___CollectionsKt.djBIcL((java.util.Collection) this.AEQbTJ, (java.lang.Iterable) list));
    }

    /* JADX INFO: renamed from: o.sdu$ActionBar */
    public final class ActionBar extends RecyclerView.ViewHolder {
        public final AbstractC47389tpC KWHzl;
        public final /* synthetic */ C44810sdu copydefault;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActionBar(@NotNull C44810sdu c44810sdu, AbstractC47389tpC abstractC47389tpC) {
            super(abstractC47389tpC.getRoot());
            Intrinsics.checkNotNullParameter(abstractC47389tpC, "");
            this.copydefault = c44810sdu;
            this.KWHzl = abstractC47389tpC;
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0074  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0098  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void AEQbTJ(@NotNull SupportFaqArticle supportFaqArticle) {
            int i;
            java.lang.String string;
            Intrinsics.checkNotNullParameter(supportFaqArticle, "");
            AbstractC47389tpC abstractC47389tpC = this.KWHzl;
            C44810sdu c44810sdu = this.copydefault;
            C55258xgZ c55258xgZ = abstractC47389tpC.EZpvd;
            Intrinsics.checkNotNullExpressionValue(c55258xgZ, "");
            C45391sos.AEQbTJ(c55258xgZ);
            abstractC47389tpC.EZpvd.setTextValue(supportFaqArticle.getTitle());
            java.lang.Long publishTime = supportFaqArticle.getPublishTime();
            if (publishTime != null) {
                Date date = new Date(publishTime.longValue() * ((long) 1000));
                android.widget.TextView textView = abstractC47389tpC.AEQbTJ;
                Intrinsics.checkNotNullExpressionValue(textView, "");
                textView.setVisibility(0);
                abstractC47389tpC.AEQbTJ.setText(pTA.formatStandardDate$default(date, null, 1, null));
            } else {
                android.widget.TextView textView2 = abstractC47389tpC.AEQbTJ;
                Intrinsics.checkNotNullExpressionValue(textView2, "");
                textView2.setVisibility(8);
            }
            java.lang.Integer okxLikesNums = supportFaqArticle.getOkxLikesNums();
            if (okxLikesNums == null) {
                android.widget.TextView textView3 = abstractC47389tpC.KWHzl;
                Intrinsics.checkNotNullExpressionValue(textView3, "");
                textView3.setVisibility(8);
            } else {
                if (okxLikesNums.intValue() <= 0) {
                    okxLikesNums = null;
                }
                if (okxLikesNums != null && (string = okxLikesNums.toString()) != null) {
                    android.widget.TextView textView4 = abstractC47389tpC.KWHzl;
                    Intrinsics.checkNotNullExpressionValue(textView4, "");
                    textView4.setVisibility(0);
                    abstractC47389tpC.KWHzl.setText(pTB.formatLocalized$default(string, null, 1, null));
                }
            }
            android.view.View view = abstractC47389tpC.AYXKKw;
            Intrinsics.checkNotNullExpressionValue(view, "");
            android.widget.TextView textView5 = abstractC47389tpC.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(textView5, "");
            if (textView5.getVisibility() == 0) {
                android.widget.TextView textView6 = abstractC47389tpC.KWHzl;
                Intrinsics.checkNotNullExpressionValue(textView6, "");
                i = textView6.getVisibility() != 0 ? 8 : 0;
            }
            view.setVisibility(i);
            android.view.View root = abstractC47389tpC.getRoot();
            root.setOnClickListener(new StateListAnimator(root, 1000L, supportFaqArticle, c44810sdu));
        }

        /* JADX INFO: renamed from: o.sdu$ActionBar$TaskDescription */
        public static final class TaskDescription implements Function1<EventParamsList, Unit> {
            public final /* synthetic */ SupportFaqArticle EZpvd;
            public final /* synthetic */ C44810sdu copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public TaskDescription(C44810sdu c44810sdu, SupportFaqArticle supportFaqArticle) {
                this.copydefault = c44810sdu;
                this.EZpvd = supportFaqArticle;
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
                Function1<EventParamsList, Unit> function1KWHzl = this.copydefault.KWHzl();
                if (function1KWHzl != null) {
                    function1KWHzl.invoke(eventParamsList);
                }
                eventParamsList.put("feature", this.copydefault.EZpvd, true);
                eventParamsList.put("article_title", C33129mqd.gEmmrt(this.EZpvd.getTitle()), false);
                eventParamsList.put("article_slug", java.lang.String.valueOf(this.EZpvd.getSlug()), false);
                EventParamsList.put$default(eventParamsList, "position", java.lang.String.valueOf(this.copydefault.AEQbTJ.indexOf(this.EZpvd) + 1), false, 4, null);
                TopCategory topCategory = this.EZpvd.getTopCategory();
                java.lang.String value = topCategory != null ? topCategory.getValue() : null;
                EventParamsList.put$default(eventParamsList, "article_tag", value == null ? "" : value, false, 4, null);
            }
        }

        /* JADX INFO: renamed from: o.sdu$ActionBar$StateListAnimator */
        public static final class StateListAnimator implements View.OnClickListener {
            public final /* synthetic */ C44810sdu AEQbTJ;
            public final /* synthetic */ long EZpvd;
            public final /* synthetic */ android.view.View OLrzqt;
            public final /* synthetic */ SupportFaqArticle copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public StateListAnimator(android.view.View view, long j, SupportFaqArticle supportFaqArticle, C44810sdu c44810sdu) {
                this.OLrzqt = view;
                this.EZpvd = j;
                this.copydefault = supportFaqArticle;
                this.AEQbTJ = c44810sdu;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.EZpvd || (this.OLrzqt instanceof android.widget.Checkable)) {
                    C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                    android.view.View view2 = this.OLrzqt;
                    C45363soQ.onSessionIdEvent$default("SupportCenter_Mid_Article_Click", false, new TaskDescription(this.AEQbTJ, this.copydefault), 1, null);
                    ActivityC45850szP.ActionBar actionBar = ActivityC45850szP.Companion;
                    android.content.Context context = view2.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "");
                    ActivityC45850szP.ActionBar.openPage$default(actionBar, context, BundleKt.bundleOf(C56390yDp.OLrzqt("url", this.copydefault.getUrl())), null, 4, null);
                }
            }
        }
    }
}
