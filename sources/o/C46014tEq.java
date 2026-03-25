package o;

import android.view.View;
import com.bumptech.glide.Glide;
import com.okinc.planet.biz_plugin.spot.data.SpotHoldingBean;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C47501trL;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tEq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public class C46014tEq extends AbstractC43310rmq<SpotHoldingBean, AbstractC46309tPo> {
    public final Function1<SpotHoldingBean, Unit> OLrzqt;

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

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.planet.biz_plugin.spot.data.SpotHoldingBean, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public C46014tEq(@NotNull Function1<? super SpotHoldingBean, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.OLrzqt = function1;
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Lo/rms;Ljava/lang/Object;)V */
    @Override // o.AbstractC43310rmq
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C43312rms<AbstractC46309tPo> c43312rms, @NotNull SpotHoldingBean spotHoldingBean) {
        Intrinsics.checkNotNullParameter(c43312rms, "");
        Intrinsics.checkNotNullParameter(spotHoldingBean, "");
        super.onBindViewHolder((C43312rms) c43312rms, spotHoldingBean);
        AbstractC46309tPo abstractC46309tPo = (AbstractC46309tPo) c43312rms.OLrzqt();
        Glide.AEQbTJ(abstractC46309tPo.OLrzqt.getContext()).EZpvd(spotHoldingBean.getTradeAssetPlanetBean().getTokenIcon()).KWHzl(C47501trL.ActionBar.fARcdN).copydefault(C47501trL.ActionBar.fARcdN).EZpvd((NN<android.graphics.Bitmap>) new C5405Ql()).EZpvd(abstractC46309tPo.OLrzqt);
        abstractC46309tPo.KWHzl.setText(spotHoldingBean.getTradeAssetPlanetBean().getTokenName());
        if (spotHoldingBean.isSelect()) {
            abstractC46309tPo.AEQbTJ.setVisibility(0);
        } else {
            abstractC46309tPo.AEQbTJ.setVisibility(8);
        }
        android.view.View root = abstractC46309tPo.getRoot();
        root.setOnClickListener(new Application(root, 1000L, this, spotHoldingBean));
    }

    /* JADX INFO: renamed from: o.tEq$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ C46014tEq KWHzl;
        public final /* synthetic */ SpotHoldingBean OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, C46014tEq c46014tEq, SpotHoldingBean spotHoldingBean) {
            this.AEQbTJ = view;
            this.EZpvd = j;
            this.KWHzl = c46014tEq;
            this.OLrzqt = spotHoldingBean;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.EZpvd || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.KWHzl.OLrzqt.invoke(this.OLrzqt);
            }
        }
    }
}
