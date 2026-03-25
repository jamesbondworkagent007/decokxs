package o;

import android.view.View;
import androidx.activity.ComponentActivity;
import com.bumptech.glide.Glide;
import com.okinc.dapp.bean.DappSearchResultBean;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.dLX;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.dyb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C15134dyb extends AbstractC43310rmq<DappSearchResultBean, AbstractC13482dMz> {
    public Function1<? super DappSearchResultBean, Unit> AEQbTJ;
    public ComponentActivity EZpvd;
    public Function1<? super DappSearchResultBean, Unit> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC43310rmq
    public int getItemLayoutId() {
        return dLX.Fragment.fARcdN;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC43310rmq
    public int getVariableId() {
        return dLZ.EZpvd;
    }

    public C15134dyb(@NotNull ComponentActivity componentActivity, @NotNull Function1<? super DappSearchResultBean, Unit> function1, Function1<? super DappSearchResultBean, Unit> function12) {
        Intrinsics.checkNotNullParameter(componentActivity, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.EZpvd = componentActivity;
        this.copydefault = function1;
        this.AEQbTJ = function12;
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Lo/rms;Ljava/lang/Object;)V */
    @Override // o.AbstractC43310rmq
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C43312rms<AbstractC13482dMz> c43312rms, @NotNull final DappSearchResultBean dappSearchResultBean) {
        Intrinsics.checkNotNullParameter(c43312rms, "");
        Intrinsics.checkNotNullParameter(dappSearchResultBean, "");
        super.onBindViewHolder((C43312rms) c43312rms, dappSearchResultBean);
        c43312rms.itemView.setOnClickListener(new View.OnClickListener() { // from class: o.dye
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C15134dyb.OLrzqt(this.AEQbTJ, dappSearchResultBean, view);
            }
        });
        if (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) dappSearchResultBean.getLogo())) {
            ((AbstractC13482dMz) c43312rms.OLrzqt()).AEQbTJ.setImageResource(dLX.ActionBar.AYXKKw);
        } else {
            C14923duc c14923duc = C14923duc.EZpvd;
            android.widget.ImageView imageView = ((AbstractC13482dMz) c43312rms.OLrzqt()).AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(imageView, "");
            int iAEQbTJ = c14923duc.AEQbTJ(imageView, 24);
            C14867dtZ c14867dtZ = C14867dtZ.AEQbTJ;
            ComponentCallbacks2C5333Nr componentCallbacks2C5333NrOLrzqt = Glide.OLrzqt((android.app.Activity) this.EZpvd);
            Intrinsics.checkNotNullExpressionValue(componentCallbacks2C5333NrOLrzqt, "");
            Intrinsics.copydefault(C14867dtZ.loadCropUrl$default(c14867dtZ, componentCallbacks2C5333NrOLrzqt, dappSearchResultBean.getLogo(), iAEQbTJ, 0, 4, null).copydefault(dLX.ActionBar.AYXKKw).KWHzl(dLX.ActionBar.AYXKKw).EZpvd((NN<android.graphics.Bitmap>) new C33484mxN(this.EZpvd)).EZpvd(((AbstractC13482dMz) c43312rms.OLrzqt()).AEQbTJ));
        }
        ((AbstractC13482dMz) c43312rms.OLrzqt()).EZpvd.setOnClickListener(new View.OnClickListener() { // from class: o.dyh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C15134dyb.KWHzl(this.AEQbTJ, dappSearchResultBean, view);
            }
        });
    }

    public static final void OLrzqt(C15134dyb c15134dyb, DappSearchResultBean dappSearchResultBean, android.view.View view) {
        Function1<? super DappSearchResultBean, Unit> function1 = c15134dyb.AEQbTJ;
        if (function1 != null) {
            function1.invoke(dappSearchResultBean.copy((2047 & 1) != 0 ? dappSearchResultBean.balance : null, (2047 & 2) != 0 ? dappSearchResultBean.category : 0, (2047 & 4) != 0 ? dappSearchResultBean.deepLink : null, (2047 & 8) != 0 ? dappSearchResultBean.id : null, (2047 & 16) != 0 ? dappSearchResultBean.logo : null, (2047 & 32) != 0 ? dappSearchResultBean.user : null, (2047 & 64) != 0 ? dappSearchResultBean.volume : null, (2047 & 128) != 0 ? dappSearchResultBean.name : null, (2047 & 256) != 0 ? dappSearchResultBean.shortDescribe : null, (2047 & 512) != 0 ? dappSearchResultBean.isFav : false, (2047 & 1024) != 0 ? dappSearchResultBean.chains : null, (2047 & 2048) != 0 ? dappSearchResultBean.timestamp : 0L));
        }
    }

    public static final void KWHzl(C15134dyb c15134dyb, DappSearchResultBean dappSearchResultBean, android.view.View view) {
        c15134dyb.copydefault.invoke(dappSearchResultBean);
    }
}
