package o;

import android.view.View;
import com.okinc.tradingbot.impl.strategy.itembinder.TacticsContentThumbnailData;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class wNV extends AbstractC59533zio<TacticsContentThumbnailData, wNT> {
    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public wNT onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        android.view.View viewInflate = layoutInflater.inflate(C48033uCm.Activity.aWJMta, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "");
        return new wNT(viewInflate);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull final wNT wnt, @NotNull final TacticsContentThumbnailData tacticsContentThumbnailData) {
        Intrinsics.checkNotNullParameter(wnt, "");
        Intrinsics.checkNotNullParameter(tacticsContentThumbnailData, "");
        wnt.OLrzqt().setText(tacticsContentThumbnailData.AEQbTJ());
        wnt.AEQbTJ().setVisibility(tacticsContentThumbnailData.EZpvd() ? 0 : 8);
        wnt.EZpvd().setText(tacticsContentThumbnailData.EZpvd() ? tacticsContentThumbnailData.KWHzl() : tacticsContentThumbnailData.copydefault());
        final android.content.Context context = wnt.AEQbTJ().getContext();
        wnt.AEQbTJ().setOnClickListener(new View.OnClickListener() { // from class: o.wOa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                wNV.KWHzl(tacticsContentThumbnailData, context, wnt, view);
            }
        });
    }

    public static final void KWHzl(TacticsContentThumbnailData tacticsContentThumbnailData, android.content.Context context, wNT wnt, android.view.View view) {
        android.graphics.drawable.Drawable drawableOLrzqt;
        if (tacticsContentThumbnailData.EZpvd()) {
            int i = C52761wXj.TaskDescription.ExKek;
            Intrinsics.copydefault(context);
            drawableOLrzqt = C33057mpK.OLrzqt(i, context, C33070mpX.copydefault(C52761wXj.Activity.Dff));
            wnt.EZpvd().setText(tacticsContentThumbnailData.copydefault());
            tacticsContentThumbnailData.AEQbTJ(false);
        } else {
            int i2 = C52761wXj.TaskDescription.DfrfUJ;
            Intrinsics.copydefault(context);
            drawableOLrzqt = C33057mpK.OLrzqt(i2, context, C33070mpX.copydefault(C52761wXj.Activity.Dff));
            wnt.EZpvd().setText(tacticsContentThumbnailData.KWHzl());
            tacticsContentThumbnailData.AEQbTJ(true);
        }
        if (drawableOLrzqt != null) {
            wnt.AEQbTJ().setImageDrawable(drawableOLrzqt);
        }
    }
}
