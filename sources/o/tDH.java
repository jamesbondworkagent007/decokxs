package o;

import android.view.View;
import com.okinc.planet.biz_plugin.future.data.FuturePositionBean;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C47501trL;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public class tDH extends AbstractC43310rmq<FuturePositionBean, AbstractC46296tPb> {
    public static final ActionBar Companion = new ActionBar(null);
    public final Function1<FuturePositionBean, Unit> OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC43310rmq
    public int getItemLayoutId() {
        return C47501trL.Application.alsFma;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC43310rmq
    public int getVariableId() {
        return C47499trJ.KWHzl;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.planet.biz_plugin.future.data.FuturePositionBean, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public tDH(@NotNull Function1<? super FuturePositionBean, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.OLrzqt = function1;
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.tDH.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;Ljava/util/List;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C43312rms<AbstractC46296tPb> c43312rms, @NotNull FuturePositionBean futurePositionBean, @NotNull java.util.List<java.lang.Object> list) {
        Intrinsics.checkNotNullParameter(c43312rms, "");
        Intrinsics.checkNotNullParameter(futurePositionBean, "");
        Intrinsics.checkNotNullParameter(list, "");
        if (!list.isEmpty()) {
            java.lang.Object obj = list.get(0);
            if (Intrinsics.EZpvd(obj, (java.lang.Object) "data_loaded")) {
                AbstractC46296tPb abstractC46296tPb = (AbstractC46296tPb) c43312rms.OLrzqt();
                C45971tDa.bindData$default(abstractC46296tPb.OLrzqt, futurePositionBean, null, null, 6, null);
                if (futurePositionBean.isLoadingChatData()) {
                    abstractC46296tPb.OLrzqt.KWHzl();
                    return;
                } else {
                    abstractC46296tPb.OLrzqt.copydefault();
                    return;
                }
            }
            Intrinsics.EZpvd(obj, (java.lang.Object) "selection_changed");
        }
        super.onBindViewHolder((C43312rms) c43312rms, futurePositionBean);
        AbstractC46296tPb abstractC46296tPb2 = (AbstractC46296tPb) c43312rms.OLrzqt();
        java.lang.Object tag = abstractC46296tPb2.OLrzqt.getTag();
        java.lang.Boolean bool = tag instanceof java.lang.Boolean ? (java.lang.Boolean) tag : null;
        boolean z = futurePositionBean.isSelect() != (bool != null ? bool.booleanValue() : false);
        abstractC46296tPb2.OLrzqt.setTag(java.lang.Boolean.valueOf(futurePositionBean.isSelect()));
        if (z && !futurePositionBean.isSelect()) {
            abstractC46296tPb2.OLrzqt.setExpanded(false, true, futurePositionBean.getTradePositionPlanetBean().getPnlRiseFall());
        }
        C45971tDa.bindData$default(abstractC46296tPb2.OLrzqt, futurePositionBean, null, null, 6, null);
        if (z && futurePositionBean.isSelect()) {
            abstractC46296tPb2.OLrzqt.setExpanded(true, true, futurePositionBean.getTradePositionPlanetBean().getPnlRiseFall());
        } else if (!z) {
            abstractC46296tPb2.OLrzqt.setExpanded(futurePositionBean.isSelect(), false, futurePositionBean.getTradePositionPlanetBean().getPnlRiseFall());
        }
        if (futurePositionBean.isLoadingChatData()) {
            abstractC46296tPb2.OLrzqt.KWHzl();
        } else {
            abstractC46296tPb2.OLrzqt.copydefault();
        }
        C45971tDa c45971tDa = abstractC46296tPb2.OLrzqt;
        c45971tDa.setOnClickListener(new Activity(c45971tDa, 1000L, futurePositionBean, this));
    }

    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ FuturePositionBean EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ tDH copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, FuturePositionBean futurePositionBean, tDH tdh) {
            this.KWHzl = view;
            this.OLrzqt = j;
            this.EZpvd = futurePositionBean;
            this.copydefault = tdh;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.OLrzqt || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                if (this.EZpvd.isSelect()) {
                    return;
                }
                this.copydefault.OLrzqt.invoke(this.EZpvd);
            }
        }
    }
}
