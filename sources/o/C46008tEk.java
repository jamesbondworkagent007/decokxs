package o;

import android.view.View;
import com.okinc.planet.biz_plugin.spot.data.SpotHoldingBean;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C47501trL;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tEk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public class C46008tEk extends AbstractC43310rmq<SpotHoldingBean, AbstractC46306tPl> {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public final Function1<SpotHoldingBean, Unit> OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC43310rmq
    public int getItemLayoutId() {
        return C47501trL.Application.apNbdB;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC43310rmq
    public int getVariableId() {
        return C47499trJ.KWHzl;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.planet.biz_plugin.spot.data.SpotHoldingBean, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public C46008tEk(@NotNull Function1<? super SpotHoldingBean, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.OLrzqt = function1;
    }

    /* JADX INFO: renamed from: o.tEk$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.tEk.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;Ljava/util/List;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C43312rms<AbstractC46306tPl> c43312rms, @NotNull SpotHoldingBean spotHoldingBean, @NotNull java.util.List<java.lang.Object> list) {
        Intrinsics.checkNotNullParameter(c43312rms, "");
        Intrinsics.checkNotNullParameter(spotHoldingBean, "");
        Intrinsics.checkNotNullParameter(list, "");
        if (!list.isEmpty()) {
            java.lang.Object obj = list.get(0);
            if (Intrinsics.EZpvd(obj, (java.lang.Object) "data_loaded")) {
                AbstractC46306tPl abstractC46306tPl = (AbstractC46306tPl) c43312rms.OLrzqt();
                C46001tEd.bindData$default(abstractC46306tPl.AEQbTJ, spotHoldingBean, null, null, 6, null);
                if (spotHoldingBean.isLoadingChatData()) {
                    abstractC46306tPl.AEQbTJ.OLrzqt();
                    return;
                } else {
                    abstractC46306tPl.AEQbTJ.KWHzl();
                    return;
                }
            }
            Intrinsics.EZpvd(obj, (java.lang.Object) "selection_changed");
        }
        super.onBindViewHolder((C43312rms) c43312rms, spotHoldingBean);
        AbstractC46306tPl abstractC46306tPl2 = (AbstractC46306tPl) c43312rms.OLrzqt();
        java.lang.Object tag = abstractC46306tPl2.AEQbTJ.getTag();
        java.lang.Boolean bool = tag instanceof java.lang.Boolean ? (java.lang.Boolean) tag : null;
        boolean z = spotHoldingBean.isSelect() != (bool != null ? bool.booleanValue() : false);
        abstractC46306tPl2.AEQbTJ.setTag(java.lang.Boolean.valueOf(spotHoldingBean.isSelect()));
        if (z && !spotHoldingBean.isSelect()) {
            abstractC46306tPl2.AEQbTJ.setExpanded(false, true, spotHoldingBean.getTradeAssetPlanetBean().getPnlRiseFall());
        }
        C46001tEd.bindData$default(abstractC46306tPl2.AEQbTJ, spotHoldingBean, null, null, 6, null);
        if (z && spotHoldingBean.isSelect()) {
            abstractC46306tPl2.AEQbTJ.setExpanded(true, true, spotHoldingBean.getTradeAssetPlanetBean().getPnlRiseFall());
        } else if (!z) {
            abstractC46306tPl2.AEQbTJ.setExpanded(spotHoldingBean.isSelect(), false, spotHoldingBean.getTradeAssetPlanetBean().getPnlRiseFall());
        }
        if (spotHoldingBean.isLoadingChatData()) {
            abstractC46306tPl2.AEQbTJ.OLrzqt();
        } else {
            abstractC46306tPl2.AEQbTJ.KWHzl();
        }
        C46001tEd c46001tEd = abstractC46306tPl2.AEQbTJ;
        c46001tEd.setOnClickListener(new Application(c46001tEd, 1000L, spotHoldingBean, this));
    }

    /* JADX INFO: renamed from: o.tEk$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ C46008tEk OLrzqt;
        public final /* synthetic */ SpotHoldingBean copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, SpotHoldingBean spotHoldingBean, C46008tEk c46008tEk) {
            this.KWHzl = view;
            this.EZpvd = j;
            this.copydefault = spotHoldingBean;
            this.OLrzqt = c46008tEk;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.EZpvd || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                if (this.copydefault.isSelect()) {
                    return;
                }
                this.OLrzqt.OLrzqt.invoke(this.copydefault);
            }
        }
    }
}
