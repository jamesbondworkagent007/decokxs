package o;

import android.view.View;
import com.okinc.planet.domain.remote.dto.PublisherTopicInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C47501trL;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.twQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public class C47770twQ extends AbstractC43310rmq<PublisherTopicInfo, AbstractC46292tOy> {
    public final Function1<PublisherTopicInfo, Unit> EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC43310rmq
    public int getItemLayoutId() {
        return C47501trL.Application.DCUTEIdCUTEI;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC43310rmq
    public int getVariableId() {
        return C47499trJ.KWHzl;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.planet.domain.remote.dto.PublisherTopicInfo, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public C47770twQ(@NotNull Function1<? super PublisherTopicInfo, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.EZpvd = function1;
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Lo/rms;Ljava/lang/Object;)V */
    @Override // o.AbstractC43310rmq
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C43312rms<AbstractC46292tOy> c43312rms, @NotNull final PublisherTopicInfo publisherTopicInfo) {
        Intrinsics.checkNotNullParameter(c43312rms, "");
        Intrinsics.checkNotNullParameter(publisherTopicInfo, "");
        super.onBindViewHolder((C43312rms) c43312rms, publisherTopicInfo);
        AbstractC46292tOy abstractC46292tOy = (AbstractC46292tOy) c43312rms.OLrzqt();
        abstractC46292tOy.OLrzqt.setText("# " + publisherTopicInfo.getTag());
        abstractC46292tOy.getRoot().setOnClickListener(new View.OnClickListener() { // from class: o.twS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C47770twQ.AEQbTJ(this.KWHzl, publisherTopicInfo, view);
            }
        });
    }

    public static final void AEQbTJ(C47770twQ c47770twQ, PublisherTopicInfo publisherTopicInfo, android.view.View view) {
        c47770twQ.EZpvd.invoke(publisherTopicInfo);
    }
}
