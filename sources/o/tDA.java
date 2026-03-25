package o;

import android.view.View;
import com.okinc.planet.biz_plugin.future.data.FutureHistoryBean;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C47501trL;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public class tDA extends AbstractC43310rmq<FutureHistoryBean, AbstractC46297tPc> {
    public static final Activity Companion = new Activity(null);
    public final Function1<FutureHistoryBean, Unit> OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC43310rmq
    public int getItemLayoutId() {
        return C47501trL.Application.aHXSQp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC43310rmq
    public int getVariableId() {
        return C47499trJ.KWHzl;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.planet.biz_plugin.future.data.FutureHistoryBean, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public tDA(@NotNull Function1<? super FutureHistoryBean, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.OLrzqt = function1;
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.tDA.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;Ljava/util/List;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C43312rms<AbstractC46297tPc> c43312rms, @NotNull FutureHistoryBean futureHistoryBean, @NotNull java.util.List<java.lang.Object> list) {
        Intrinsics.checkNotNullParameter(c43312rms, "");
        Intrinsics.checkNotNullParameter(futureHistoryBean, "");
        Intrinsics.checkNotNullParameter(list, "");
        if (!list.isEmpty()) {
            java.lang.Object obj = list.get(0);
            if (Intrinsics.EZpvd(obj, (java.lang.Object) "data_loaded")) {
                AbstractC46297tPc abstractC46297tPc = (AbstractC46297tPc) c43312rms.OLrzqt();
                tCD.bindData$default(abstractC46297tPc.AEQbTJ, futureHistoryBean, null, null, 6, null);
                if (futureHistoryBean.isLoadingChatData()) {
                    abstractC46297tPc.AEQbTJ.EZpvd();
                    return;
                } else {
                    abstractC46297tPc.AEQbTJ.AEQbTJ();
                    return;
                }
            }
            Intrinsics.EZpvd(obj, (java.lang.Object) "selection_changed");
        }
        super.onBindViewHolder((C43312rms) c43312rms, futureHistoryBean);
        AbstractC46297tPc abstractC46297tPc2 = (AbstractC46297tPc) c43312rms.OLrzqt();
        java.lang.Object tag = abstractC46297tPc2.AEQbTJ.getTag();
        java.lang.Boolean bool = tag instanceof java.lang.Boolean ? (java.lang.Boolean) tag : null;
        boolean z = futureHistoryBean.isSelect() != (bool != null ? bool.booleanValue() : false);
        abstractC46297tPc2.AEQbTJ.setTag(java.lang.Boolean.valueOf(futureHistoryBean.isSelect()));
        if (z && !futureHistoryBean.isSelect()) {
            abstractC46297tPc2.AEQbTJ.setExpanded(false, true, futureHistoryBean.getTradeHisPositionPlanetBean().getPnlRiseFall());
        }
        tCD.bindData$default(abstractC46297tPc2.AEQbTJ, futureHistoryBean, null, null, 6, null);
        if (z && futureHistoryBean.isSelect()) {
            abstractC46297tPc2.AEQbTJ.setExpanded(true, true, futureHistoryBean.getTradeHisPositionPlanetBean().getPnlRiseFall());
        } else if (!z) {
            abstractC46297tPc2.AEQbTJ.setExpanded(futureHistoryBean.isSelect(), false, futureHistoryBean.getTradeHisPositionPlanetBean().getPnlRiseFall());
        }
        if (futureHistoryBean.isLoadingChatData()) {
            abstractC46297tPc2.AEQbTJ.EZpvd();
        } else {
            abstractC46297tPc2.AEQbTJ.AEQbTJ();
        }
        tCD tcd = abstractC46297tPc2.AEQbTJ;
        tcd.setOnClickListener(new StateListAnimator(tcd, 1000L, futureHistoryBean, this));
    }

    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ tDA OLrzqt;
        public final /* synthetic */ FutureHistoryBean copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, FutureHistoryBean futureHistoryBean, tDA tda) {
            this.KWHzl = view;
            this.AEQbTJ = j;
            this.copydefault = futureHistoryBean;
            this.OLrzqt = tda;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.AEQbTJ || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                if (this.copydefault.isSelect()) {
                    return;
                }
                this.OLrzqt.OLrzqt.invoke(this.copydefault);
            }
        }
    }
}
