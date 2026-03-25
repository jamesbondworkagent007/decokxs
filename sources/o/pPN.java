package o;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import o.pKK;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class pPN extends AbstractC43310rmq<pKX, AbstractC38076pLi> {
    public final pPR EZpvd;
    public final pKY OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC43310rmq
    public int getItemLayoutId() {
        return pKK.ActionBar.valueOf;
    }

    @Override // o.AbstractC43310rmq
    public int getVariableId() {
        return 0;
    }

    public pPN(@NotNull pPR ppr, @NotNull pKY pky) {
        Intrinsics.checkNotNullParameter(ppr, "");
        Intrinsics.checkNotNullParameter(pky, "");
        this.EZpvd = ppr;
        this.OLrzqt = pky;
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Lo/rms;Ljava/lang/Object;)V */
    @Override // o.AbstractC43310rmq
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C43312rms<AbstractC38076pLi> c43312rms, @NotNull pKX pkx) {
        Intrinsics.checkNotNullParameter(c43312rms, "");
        Intrinsics.checkNotNullParameter(pkx, "");
        super.onBindViewHolder((C43312rms) c43312rms, pkx);
        AbstractC38076pLi abstractC38076pLi = (AbstractC38076pLi) c43312rms.OLrzqt();
        android.widget.ImageView imageView = abstractC38076pLi.KWHzl;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        C33054mpH.loadUrl$default(imageView, pkx.copydefault(), null, 0, 0, 14, null);
        abstractC38076pLi.AEQbTJ.setText(pkx.gEmmrt());
        abstractC38076pLi.copydefault.setText(pkx.gEmmrt());
        abstractC38076pLi.EZpvd.setTextColor(this.OLrzqt.copydefault(C33129mqd.AEQbTJ(pkx.OLrzqt())));
        abstractC38076pLi.EZpvd.setText(pkx.EZpvd());
        android.view.View root = abstractC38076pLi.getRoot();
        root.setOnClickListener(new ActionBar(root, 1000L, this, pkx));
    }

    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ pPN EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ pKX OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, pPN ppn, pKX pkx) {
            this.AEQbTJ = view;
            this.KWHzl = j;
            this.EZpvd = ppn;
            this.OLrzqt = pkx;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.KWHzl || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.EZpvd.EZpvd.AEQbTJ(this.OLrzqt);
            }
        }
    }
}
