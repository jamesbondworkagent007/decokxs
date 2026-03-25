package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.okinc.business.market.features.coindetail.ui.snipers.SniperViewBinder$1;
import com.okinc.business.market.features.tag.domain.TagMeta;
import com.okinc.business.market.features.tag.domain.TagWrapper;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import o.C57406yhn;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jPy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C26046jPy extends AbstractC25436iwg<C26041jPt, C21544hDh> {
    public Function1<? super C26041jPt, Unit> EZpvd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26046jPy(@NotNull Function1<? super C26041jPt, Unit> function1) {
        super(SniperViewBinder$1.INSTANCE);
        Intrinsics.checkNotNullParameter(function1, "");
        this.EZpvd = function1;
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C25435iwf<C21544hDh> c25435iwf, @NotNull C26041jPt c26041jPt) {
        java.lang.String strAhwBna;
        java.lang.String strAhwBna2;
        Intrinsics.checkNotNullParameter(c25435iwf, "");
        Intrinsics.checkNotNullParameter(c26041jPt, "");
        C21544hDh c21544hDh = (C21544hDh) c25435iwf.EZpvd();
        ConstraintLayout root = c21544hDh.getRoot();
        root.setOnClickListener(new ActionBar(root, 1000L, this, c26041jPt));
        jPA jpaCopydefault = C26045jPx.copydefault(c26041jPt.OLrzqt());
        android.graphics.drawable.Drawable drawableKWHzl = C33070mpX.KWHzl(jpaCopydefault.OLrzqt());
        java.lang.Integer numEZpvd = jpaCopydefault.EZpvd();
        if (numEZpvd != null) {
            drawableKWHzl = drawableKWHzl != null ? C33057mpK.copydefault(drawableKWHzl, C25382ivf.KWHzl(numEZpvd.intValue())) : null;
        }
        c21544hDh.KWHzl.setImageDrawable(drawableKWHzl);
        android.graphics.drawable.Drawable drawableCopydefault = null;
        java.lang.String str = null;
        for (TagWrapper tagWrapper : c26041jPt.EZpvd()) {
            if (Intrinsics.EZpvd((java.lang.Object) tagWrapper.OLrzqt(), (java.lang.Object) "sniper")) {
                android.content.Context context = c21544hDh.copydefault.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                if (C33054mpH.AEQbTJ(context)) {
                    TagMeta tagMetaAEQbTJ = tagWrapper.AEQbTJ();
                    if (tagMetaAEQbTJ != null) {
                        strAhwBna2 = tagMetaAEQbTJ.KWHzl();
                        str = strAhwBna2;
                    }
                    str = null;
                } else {
                    TagMeta tagMetaAEQbTJ2 = tagWrapper.AEQbTJ();
                    if (tagMetaAEQbTJ2 != null) {
                        strAhwBna2 = tagMetaAEQbTJ2.AhwBna();
                        str = strAhwBna2;
                    }
                    str = null;
                }
                android.graphics.drawable.Drawable drawableKWHzl2 = C33070mpX.KWHzl(C57406yhn.Activity.zsXlph);
                drawableCopydefault = drawableKWHzl2 != null ? C33057mpK.copydefault(drawableKWHzl2, C25382ivf.KWHzl(C52761wXj.Activity.gdmIOq)) : null;
            }
            if (Intrinsics.EZpvd((java.lang.Object) tagWrapper.OLrzqt(), (java.lang.Object) "suspicious") && drawableCopydefault == null) {
                android.content.Context context2 = c21544hDh.copydefault.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "");
                if (C33054mpH.AEQbTJ(context2)) {
                    TagMeta tagMetaAEQbTJ3 = tagWrapper.AEQbTJ();
                    if (tagMetaAEQbTJ3 != null) {
                        strAhwBna = tagMetaAEQbTJ3.KWHzl();
                        str = strAhwBna;
                    }
                    str = null;
                } else {
                    TagMeta tagMetaAEQbTJ4 = tagWrapper.AEQbTJ();
                    if (tagMetaAEQbTJ4 != null) {
                        strAhwBna = tagMetaAEQbTJ4.AhwBna();
                        str = strAhwBna;
                    }
                    str = null;
                }
                android.graphics.drawable.Drawable drawableKWHzl3 = C33070mpX.KWHzl(C57406yhn.Activity.gHZMYf);
                drawableCopydefault = drawableKWHzl3 != null ? C33057mpK.copydefault(drawableKWHzl3, C25382ivf.KWHzl(C52761wXj.Activity.DQzvGN)) : null;
            }
        }
        AppCompatImageView appCompatImageView = c21544hDh.copydefault;
        Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
        appCompatImageView.setVisibility(drawableCopydefault != null ? 0 : 8);
        if (str != null) {
            AppCompatImageView appCompatImageView2 = c21544hDh.copydefault;
            Intrinsics.checkNotNullExpressionValue(appCompatImageView2, "");
            C33054mpH.loadUrl$default(appCompatImageView2, str, null, 0, 0, 14, null);
        } else if (drawableCopydefault != null) {
            c21544hDh.copydefault.setImageDrawable(drawableCopydefault);
        }
    }

    /* JADX INFO: renamed from: o.jPy$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ C26041jPt EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ C26046jPy OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, C26046jPy c26046jPy, C26041jPt c26041jPt) {
            this.AEQbTJ = view;
            this.KWHzl = j;
            this.OLrzqt = c26046jPy;
            this.EZpvd = c26041jPt;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.KWHzl || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.OLrzqt.EZpvd.invoke(this.EZpvd);
            }
        }
    }
}
