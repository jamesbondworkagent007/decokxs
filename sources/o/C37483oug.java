package o;

import android.view.View;
import com.okinc.im.bean.SearchResultData;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C37483oug;
import o.InterfaceC35897oHt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oug, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C37483oug implements InterfaceC35897oHt<SearchResultData> {
    public final Function1<SearchResultData.LoadMore, Unit> AEQbTJ;

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.im.bean.SearchResultData$LoadMore, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public C37483oug(@NotNull Function1<? super SearchResultData.LoadMore, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.AEQbTJ = function1;
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Lo/oHr;Ljava/lang/Object;Ljava/util/List;)V */
    @Override // o.InterfaceC35897oHt
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public void AEQbTJ(@NotNull C35895oHr c35895oHr, @NotNull SearchResultData searchResultData, @NotNull java.util.List<? extends java.lang.Object> list) {
        InterfaceC35897oHt.Application.AEQbTJ(this, c35895oHr, searchResultData, list);
    }

    @Override // o.InterfaceC35897oHt
    public C35895oHr AEQbTJ(@NotNull android.view.ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        nNU nnuKWHzl = nNU.KWHzl(android.view.LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(nnuKWHzl, "");
        return new Application(this, nnuKWHzl);
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Lo/oHr;Ljava/lang/Object;I)V */
    @Override // o.InterfaceC35897oHt
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public void AEQbTJ(@NotNull C35895oHr c35895oHr, @NotNull SearchResultData searchResultData, int i) {
        Intrinsics.checkNotNullParameter(c35895oHr, "");
        Intrinsics.checkNotNullParameter(searchResultData, "");
        if ((c35895oHr instanceof Application) && (searchResultData instanceof SearchResultData.LoadMore)) {
            ((Application) c35895oHr).OLrzqt((SearchResultData.LoadMore) searchResultData);
        }
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Ljava/lang/Object;)Z */
    @Override // o.InterfaceC35897oHt
    public boolean AEQbTJ(@NotNull SearchResultData searchResultData) {
        Intrinsics.checkNotNullParameter(searchResultData, "");
        return searchResultData instanceof SearchResultData.LoadMore;
    }

    /* JADX DEBUG: Method merged with bridge method: copydefault(Lo/oHr;Ljava/lang/Object;)V */
    @Override // o.InterfaceC35897oHt
    public void copydefault(@NotNull C35895oHr c35895oHr, @NotNull SearchResultData searchResultData) {
        Intrinsics.checkNotNullParameter(c35895oHr, "");
        Intrinsics.checkNotNullParameter(searchResultData, "");
        if (c35895oHr instanceof Application) {
            ((Application) c35895oHr).EZpvd();
        }
    }

    /* JADX INFO: renamed from: o.oug$Application */
    public final class Application extends C35895oHr {
        public final /* synthetic */ C37483oug EZpvd;
        public final nNU OLrzqt;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull C37483oug c37483oug, nNU nnu) {
            super(nnu.getRoot().getContext(), nnu.getRoot());
            Intrinsics.checkNotNullParameter(nnu, "");
            this.EZpvd = c37483oug;
            this.OLrzqt = nnu;
        }

        public final void OLrzqt(@NotNull final SearchResultData.LoadMore loadMore) {
            Intrinsics.checkNotNullParameter(loadMore, "");
            this.OLrzqt.OLrzqt.fIwbmz();
            C52794wYp c52794wYp = this.OLrzqt.OLrzqt;
            final C37483oug c37483oug = this.EZpvd;
            c52794wYp.setOnClickListener(new View.OnClickListener() { // from class: o.oul
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C37483oug.Application.KWHzl(this.OLrzqt, c37483oug, loadMore, view);
                }
            });
        }

        public static final void KWHzl(Application application, C37483oug c37483oug, SearchResultData.LoadMore loadMore, android.view.View view) {
            C52794wYp.startLoading$default(application.OLrzqt.OLrzqt, 0L, 1, null);
            c37483oug.AEQbTJ.invoke(loadMore);
        }

        public final void EZpvd() {
            this.OLrzqt.OLrzqt.fIwbmz();
        }
    }
}
