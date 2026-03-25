package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import com.okinc.market.discover.features.filter.data.model.TokenGroupVo;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class pYR extends AbstractC40510qYn<TokenGroupVo, C42858reO> {
    public final pYC EZpvd;

    public pYR(@NotNull pYC pyc) {
        Intrinsics.checkNotNullParameter(pyc, "");
        this.EZpvd = pyc;
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/viewbinding/ViewBinding; */
    @Override // o.AbstractC40510qYn
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public C42858reO AEQbTJ(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C42858reO c42858reOOLrzqt = C42858reO.OLrzqt(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c42858reOOLrzqt, "");
        return c42858reOOLrzqt;
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Landroidx/viewbinding/ViewBinding;ILo/qYt;)V */
    @Override // o.AbstractC40510qYn
    public void AEQbTJ(@NotNull final C42858reO c42858reO, int i, @NotNull final TokenGroupVo tokenGroupVo) {
        Intrinsics.checkNotNullParameter(c42858reO, "");
        Intrinsics.checkNotNullParameter(tokenGroupVo, "");
        c42858reO.copydefault.setText(tokenGroupVo.EZpvd());
        c42858reO.KWHzl.KWHzl(tokenGroupVo.OLrzqt(), tokenGroupVo.KWHzl());
        AppCompatImageView appCompatImageView = c42858reO.EZpvd;
        Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
        appCompatImageView.setVisibility(tokenGroupVo.AEQbTJ() ? 0 : 8);
        if (tokenGroupVo.AEQbTJ()) {
            AppCompatImageView appCompatImageView2 = c42858reO.EZpvd;
            appCompatImageView2.setOnClickListener(new ActionBar(appCompatImageView2, 1000L, this, tokenGroupVo));
            pYT pyt = c42858reO.KWHzl;
            pyt.setOnClickListener(new Application(pyt, 1000L, this, tokenGroupVo));
        } else {
            c42858reO.EZpvd.setOnClickListener(null);
            c42858reO.KWHzl.setOnClickListener(null);
        }
        c42858reO.OLrzqt.setSelected(tokenGroupVo.gEmmrt());
        c42858reO.getRoot().setOnClickListener(new View.OnClickListener() { // from class: o.pYV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                pYR.OLrzqt(tokenGroupVo, this, c42858reO, view);
            }
        });
    }

    public static final void OLrzqt(TokenGroupVo tokenGroupVo, pYR pyr, C42858reO c42858reO, android.view.View view) {
        if (Intrinsics.EZpvd((java.lang.Object) tokenGroupVo.copydefault(), (java.lang.Object) "5") && tokenGroupVo.OLrzqt().isEmpty()) {
            pyr.EZpvd.OLrzqt(tokenGroupVo);
        } else {
            c42858reO.OLrzqt.setSelected(!tokenGroupVo.gEmmrt());
            pyr.EZpvd.copydefault(TokenGroupVo.copy$default(tokenGroupVo, null, null, null, null, c42858reO.OLrzqt.isSelected(), false, 47, null));
        }
    }

    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ pYR AEQbTJ;
        public final /* synthetic */ TokenGroupVo EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, pYR pyr, TokenGroupVo tokenGroupVo) {
            this.KWHzl = view;
            this.copydefault = j;
            this.AEQbTJ = pyr;
            this.EZpvd = tokenGroupVo;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.copydefault || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                this.AEQbTJ.EZpvd.OLrzqt(this.EZpvd);
            }
        }
    }

    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ pYR AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ TokenGroupVo KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, pYR pyr, TokenGroupVo tokenGroupVo) {
            this.OLrzqt = view;
            this.EZpvd = j;
            this.AEQbTJ = pyr;
            this.KWHzl = tokenGroupVo;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.EZpvd || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.AEQbTJ.EZpvd.OLrzqt(this.KWHzl);
            }
        }
    }
}
