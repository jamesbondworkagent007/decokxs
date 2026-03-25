package o;

import android.view.View;
import com.bumptech.glide.Glide;
import com.okinc.planet.biz_plugin.future.data.FuturePositionBean;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C47501trL;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public class tDG extends AbstractC43310rmq<FuturePositionBean, AbstractC46309tPo> {
    public final Function1<FuturePositionBean, Unit> OLrzqt;

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

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.planet.biz_plugin.future.data.FuturePositionBean, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public tDG(@NotNull Function1<? super FuturePositionBean, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.OLrzqt = function1;
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Lo/rms;Ljava/lang/Object;)V */
    @Override // o.AbstractC43310rmq
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C43312rms<AbstractC46309tPo> c43312rms, @NotNull FuturePositionBean futurePositionBean) {
        Intrinsics.checkNotNullParameter(c43312rms, "");
        Intrinsics.checkNotNullParameter(futurePositionBean, "");
        super.onBindViewHolder((C43312rms) c43312rms, futurePositionBean);
        AbstractC46309tPo abstractC46309tPo = (AbstractC46309tPo) c43312rms.OLrzqt();
        Glide.AEQbTJ(abstractC46309tPo.OLrzqt.getContext()).EZpvd(futurePositionBean.getTradePositionPlanetBean().getTokenIcon()).KWHzl(C47501trL.ActionBar.fARcdN).copydefault(C47501trL.ActionBar.fARcdN).EZpvd((NN<android.graphics.Bitmap>) new C5405Ql()).EZpvd(abstractC46309tPo.OLrzqt);
        abstractC46309tPo.KWHzl.setText(futurePositionBean.getTradePositionPlanetBean().getInstName());
        java.lang.String strEZpvd = ((InterfaceC49513upv) C43248rlh.KWHzl.AEQbTJ(InterfaceC49513upv.class)).EZpvd(futurePositionBean.getTradePositionPlanetBean().getTag());
        abstractC46309tPo.EZpvd.setText(strEZpvd);
        abstractC46309tPo.EZpvd.setVisibility(C33129mqd.OLrzqt((java.lang.CharSequence) strEZpvd) ? 0 : 8);
        if (futurePositionBean.isSelect()) {
            abstractC46309tPo.AEQbTJ.setVisibility(0);
        } else {
            abstractC46309tPo.AEQbTJ.setVisibility(8);
        }
        android.view.View root = abstractC46309tPo.getRoot();
        root.setOnClickListener(new Application(root, 1000L, this, futurePositionBean));
    }

    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ FuturePositionBean EZpvd;
        public final /* synthetic */ tDG KWHzl;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, tDG tdg, FuturePositionBean futurePositionBean) {
            this.copydefault = view;
            this.OLrzqt = j;
            this.KWHzl = tdg;
            this.EZpvd = futurePositionBean;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.OLrzqt || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                this.KWHzl.OLrzqt.invoke(this.EZpvd);
            }
        }
    }
}
