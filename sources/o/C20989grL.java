package o;

import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.grL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C20989grL extends C43318rmy<java.lang.String, AbstractC16700eoq> {
    public C20989grL() {
        super(C13754dXa.TaskDescription.hlXVux, dTV.EZpvd);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Lo/rms;Ljava/lang/Object;)V */
    @Override // o.AbstractC43310rmq
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C43312rms<AbstractC16700eoq> c43312rms, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(c43312rms, "");
        Intrinsics.checkNotNullParameter(str, "");
        super.onBindViewHolder((C43312rms) c43312rms, str);
        android.widget.ImageView imageView = ((AbstractC16700eoq) c43312rms.OLrzqt()).copydefault;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        C57659ymb.copydefault(imageView, str, C14726dqr.OLrzqt.OLrzqt(), 0.5f, 44.0f);
    }
}
