package o;

import android.view.View;
import com.bumptech.glide.Glide;
import com.okinc.planet.domain.remote.dto.PublisherTokenInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C47501trL;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.twM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public class C47766twM extends AbstractC43310rmq<PublisherTokenInfo, AbstractC46285tOr> {
    public final Function1<PublisherTokenInfo, Unit> AEQbTJ;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC43310rmq
    public int getItemLayoutId() {
        return C47501trL.Application.Dmq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC43310rmq
    public int getVariableId() {
        return C47499trJ.KWHzl;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.planet.domain.remote.dto.PublisherTokenInfo, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public C47766twM(@NotNull Function1<? super PublisherTokenInfo, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.AEQbTJ = function1;
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Lo/rms;Ljava/lang/Object;)V */
    @Override // o.AbstractC43310rmq
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C43312rms<AbstractC46285tOr> c43312rms, @NotNull final PublisherTokenInfo publisherTokenInfo) {
        Intrinsics.checkNotNullParameter(c43312rms, "");
        Intrinsics.checkNotNullParameter(publisherTokenInfo, "");
        super.onBindViewHolder((C43312rms) c43312rms, publisherTokenInfo);
        AbstractC46285tOr abstractC46285tOr = (AbstractC46285tOr) c43312rms.OLrzqt();
        abstractC46285tOr.KWHzl.setText("$ " + publisherTokenInfo.getName());
        abstractC46285tOr.EZpvd.setText(publisherTokenInfo.getFullName());
        abstractC46285tOr.getRoot().setOnClickListener(new View.OnClickListener() { // from class: o.twO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C47766twM.KWHzl(this.EZpvd, publisherTokenInfo, view);
            }
        });
        Glide.AEQbTJ(abstractC46285tOr.OLrzqt.getContext()).EZpvd(publisherTokenInfo.getIcon()).KWHzl(C47501trL.ActionBar.fARcdN).copydefault(C47501trL.ActionBar.fARcdN).EZpvd((NN<android.graphics.Bitmap>) new C5405Ql()).EZpvd(abstractC46285tOr.OLrzqt);
    }

    public static final void KWHzl(C47766twM c47766twM, PublisherTokenInfo publisherTokenInfo, android.view.View view) {
        c47766twM.AEQbTJ.invoke(publisherTokenInfo);
    }
}
