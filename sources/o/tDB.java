package o;

import android.view.View;
import com.bumptech.glide.Glide;
import com.okinc.planet.biz_plugin.future.data.FutureHistoryBean;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C47501trL;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public class tDB extends AbstractC43310rmq<FutureHistoryBean, AbstractC46309tPo> {
    public final Function1<FutureHistoryBean, Unit> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC43310rmq
    public int getItemLayoutId() {
        return C47501trL.Application.fXHmeK;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC43310rmq
    public int getVariableId() {
        return C47499trJ.KWHzl;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.planet.biz_plugin.future.data.FutureHistoryBean, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public tDB(@NotNull Function1<? super FutureHistoryBean, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.copydefault = function1;
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Lo/rms;Ljava/lang/Object;)V */
    @Override // o.AbstractC43310rmq
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C43312rms<AbstractC46309tPo> c43312rms, @NotNull FutureHistoryBean futureHistoryBean) {
        Intrinsics.checkNotNullParameter(c43312rms, "");
        Intrinsics.checkNotNullParameter(futureHistoryBean, "");
        super.onBindViewHolder((C43312rms) c43312rms, futureHistoryBean);
        AbstractC46309tPo abstractC46309tPo = (AbstractC46309tPo) c43312rms.OLrzqt();
        Glide.AEQbTJ(abstractC46309tPo.OLrzqt.getContext()).EZpvd(futureHistoryBean.getTradeHisPositionPlanetBean().getTokenIcon()).KWHzl(C47501trL.ActionBar.fARcdN).copydefault(C47501trL.ActionBar.fARcdN).EZpvd((NN<android.graphics.Bitmap>) new C5405Ql()).EZpvd(abstractC46309tPo.OLrzqt);
        abstractC46309tPo.KWHzl.setText(futureHistoryBean.getTradeHisPositionPlanetBean().getInstName());
        java.lang.String strEZpvd = ((InterfaceC49513upv) C43248rlh.KWHzl.AEQbTJ(InterfaceC49513upv.class)).EZpvd(futureHistoryBean.getTradeHisPositionPlanetBean().getTag());
        abstractC46309tPo.EZpvd.setText(strEZpvd);
        abstractC46309tPo.EZpvd.setVisibility(C33129mqd.OLrzqt((java.lang.CharSequence) strEZpvd) ? 0 : 8);
        if (futureHistoryBean.isSelect()) {
            abstractC46309tPo.AEQbTJ.setVisibility(0);
        } else {
            abstractC46309tPo.AEQbTJ.setVisibility(8);
        }
        android.view.View root = abstractC46309tPo.getRoot();
        root.setOnClickListener(new Application(root, 1000L, this, futureHistoryBean));
    }

    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ tDB KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ FutureHistoryBean copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, tDB tdb, FutureHistoryBean futureHistoryBean) {
            this.OLrzqt = view;
            this.AEQbTJ = j;
            this.KWHzl = tdb;
            this.copydefault = futureHistoryBean;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.AEQbTJ || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.KWHzl.copydefault.invoke(this.copydefault);
            }
        }
    }
}
