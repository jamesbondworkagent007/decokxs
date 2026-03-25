package o;

import android.view.View;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.GlideException;
import com.google.android.material.imageview.ShapeableImageView;
import com.okinc.business.defi.biz.net.bean.NftCollection;
import java.math.RoundingMode;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import o.InterfaceC18139fck;
import org.jetbrains.annotations.NotNull;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: renamed from: o.fch, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C18136fch extends AbstractC59533zio<InterfaceC18139fck.StateListAnimator, C18135fcg> {
    public final StateListAnimator AEQbTJ;

    /* JADX INFO: renamed from: o.fch$StateListAnimator */
    public interface StateListAnimator {
        void copydefault(@NotNull NftCollection nftCollection);
    }

    /* JADX INFO: renamed from: o.fch$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ C18136fch EZpvd;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ InterfaceC18139fck.StateListAnimator copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, C18136fch c18136fch, InterfaceC18139fck.StateListAnimator stateListAnimator) {
            this.OLrzqt = view;
            this.AEQbTJ = j;
            this.EZpvd = c18136fch;
            this.copydefault = stateListAnimator;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C57594ylP.AEQbTJ(this.OLrzqt) > this.AEQbTJ || (this.OLrzqt instanceof android.widget.Checkable)) {
                C57594ylP.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.EZpvd.AEQbTJ.copydefault(this.copydefault.EZpvd());
            }
        }
    }

    public C18136fch(@NotNull StateListAnimator stateListAnimator) {
        Intrinsics.checkNotNullParameter(stateListAnimator, "");
        this.AEQbTJ = stateListAnimator;
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public C18135fcg onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        AbstractC16719epI abstractC16719epICopydefault = AbstractC16719epI.copydefault(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(abstractC16719epICopydefault, "");
        return new C18135fcg(abstractC16719epICopydefault);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C18135fcg c18135fcg, @NotNull InterfaceC18139fck.StateListAnimator stateListAnimator) {
        java.lang.String strAEQbTJ;
        Intrinsics.checkNotNullParameter(c18135fcg, "");
        Intrinsics.checkNotNullParameter(stateListAnimator, "");
        AbstractC16719epI abstractC16719epIOLrzqt = c18135fcg.OLrzqt();
        OLrzqt(abstractC16719epIOLrzqt, stateListAnimator.EZpvd());
        abstractC16719epIOLrzqt.EZpvd.setText(stateListAnimator.EZpvd().getProjectName());
        java.lang.String price = stateListAnimator.EZpvd().getFloorPrice().getPrice();
        if (price.length() <= 0) {
            price = null;
        }
        if (price == null || (strAEQbTJ = AEQbTJ(price)) == null) {
            strAEQbTJ = "--";
        }
        abstractC16719epIOLrzqt.AYXKKw.setText(strAEQbTJ);
        copydefault(abstractC16719epIOLrzqt, stateListAnimator.EZpvd());
        android.view.View root = abstractC16719epIOLrzqt.getRoot();
        root.setOnClickListener(new Application(root, 1000L, this, stateListAnimator));
    }

    public final java.lang.String AEQbTJ(java.lang.String str) {
        if (C33129mqd.gEmmrt(str, "0")) {
            return pTB.formatDownToMax$default(C33129mqd.EZpvd(str), 4, null, 2, null);
        }
        if (C33129mqd.AEQbTJ(str, "0") && C33129mqd.gEmmrt(str, "0.0001")) {
            return "<" + pTB.toLocalizationStringWithMaxPrecision$default("0.0001", 4, RoundingMode.UP, null, 4, null);
        }
        if (C33129mqd.AEQbTJ(str, "1000000000000")) {
            return ">" + pTB.toLocalizationStringWithMaxPrecision$default("1000", 0, RoundingMode.UP, null, 4, null) + "B";
        }
        return pTB.toLocalizationStringWithMaxPrecision$default(str, 4, RoundingMode.UP, null, 4, null);
    }

    public final void OLrzqt(AbstractC16719epI abstractC16719epI, NftCollection nftCollection) {
        if (nftCollection.getImage().length() > 0) {
            Intrinsics.copydefault(Glide.KWHzl(abstractC16719epI.AEQbTJ).EZpvd(nftCollection.getImage()).KWHzl(C13754dXa.Activity.djBIcL).EZpvd((android.widget.ImageView) abstractC16719epI.AEQbTJ));
        } else if (nftCollection.getCollectionImage().length() > 0) {
            Intrinsics.copydefault(Glide.KWHzl(abstractC16719epI.AEQbTJ).EZpvd(nftCollection.getCollectionImage()).copydefault(C33052mpF.dpInt$default(CipherSuite.TLS_RSA_PSK_WITH_AES_128_CBC_SHA, (android.content.Context) null, 1, (java.lang.Object) null), C33052mpF.dpInt$default(CipherSuite.TLS_RSA_PSK_WITH_AES_128_CBC_SHA, (android.content.Context) null, 1, (java.lang.Object) null)).KWHzl(C13754dXa.Activity.djBIcL).EZpvd((android.widget.ImageView) abstractC16719epI.AEQbTJ));
        } else {
            abstractC16719epI.AEQbTJ.setImageResource(C13754dXa.Activity.djBIcL);
        }
    }

    public final void copydefault(AbstractC16719epI abstractC16719epI, NftCollection nftCollection) {
        java.lang.String currencyUrl = nftCollection.getFloorPrice().getCurrencyUrl();
        if (currencyUrl.length() == 0) {
            ShapeableImageView shapeableImageView = abstractC16719epI.copydefault;
            Intrinsics.checkNotNullExpressionValue(shapeableImageView, "");
            shapeableImageView.setVisibility(8);
            return;
        }
        Glide.KWHzl(abstractC16719epI.copydefault).EZpvd(currencyUrl).copydefault((RY<android.graphics.drawable.Drawable>) new TaskDescription(abstractC16719epI)).EZpvd((android.widget.ImageView) abstractC16719epI.copydefault);
    }

    /* JADX INFO: renamed from: o.fch$TaskDescription */
    public static final class TaskDescription implements RY<android.graphics.drawable.Drawable> {
        public final /* synthetic */ AbstractC16719epI AEQbTJ;

        /* JADX DEBUG: Method merged with bridge method: copydefault(Ljava/lang/Object;Ljava/lang/Object;Lo/Sq;Lcom/bumptech/glide/load/DataSource;Z)Z */
        @Override // o.RY
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public boolean copydefault(android.graphics.drawable.Drawable drawable, java.lang.Object obj, InterfaceC5462Sq<android.graphics.drawable.Drawable> interfaceC5462Sq, com.bumptech.glide.load.DataSource dataSource, boolean z) {
            return false;
        }

        public TaskDescription(AbstractC16719epI abstractC16719epI) {
            this.AEQbTJ = abstractC16719epI;
        }

        @Override // o.RY
        public boolean OLrzqt(GlideException glideException, java.lang.Object obj, InterfaceC5462Sq<android.graphics.drawable.Drawable> interfaceC5462Sq, boolean z) {
            ShapeableImageView shapeableImageView = this.AEQbTJ.copydefault;
            Intrinsics.checkNotNullExpressionValue(shapeableImageView, "");
            shapeableImageView.setVisibility(8);
            return true;
        }
    }
}
