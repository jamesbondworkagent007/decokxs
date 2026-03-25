package o;

import aws.sdk.kotlin.services.rekognition.paginators.PaginatorsKt$describeProjectsPaginated$2;
import aws.sdk.kotlin.services.rekognition.paginators.PaginatorsKt$listCollectionsPaginated$2;
import aws.sdk.kotlin.services.rekognition.paginators.PaginatorsKt$listMediaAnalysisJobsPaginated$2;
import aws.sdk.kotlin.services.rekognition.paginators.PaginatorsKt$listStreamProcessorsPaginated$2;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import o.D;
import o.LinearLayout;
import o.O;
import o.P;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.cF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C11189cF {
    public static /* synthetic */ Flow describeProjectsPaginated$default(UrlInterceptRegistry urlInterceptRegistry, LinearLayout linearLayout, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            linearLayout = LinearLayout.EZpvd.AEQbTJ(new Function1<LinearLayout.StateListAnimator, Unit>() { // from class: aws.sdk.kotlin.services.rekognition.paginators.PaginatorsKt$describeProjectsPaginated$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull LinearLayout.StateListAnimator stateListAnimator) {
                    Intrinsics.checkNotNullParameter(stateListAnimator, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(LinearLayout.StateListAnimator stateListAnimator) {
                    invoke2(stateListAnimator);
                    return Unit.INSTANCE;
                }
            });
        }
        return OLrzqt(urlInterceptRegistry, linearLayout);
    }

    public static final Flow<Magnifier> OLrzqt(@NotNull UrlInterceptRegistry urlInterceptRegistry, @NotNull LinearLayout linearLayout) {
        Intrinsics.checkNotNullParameter(urlInterceptRegistry, "");
        Intrinsics.checkNotNullParameter(linearLayout, "");
        return FlowKt.flow(new PaginatorsKt$describeProjectsPaginated$2(linearLayout, urlInterceptRegistry, null));
    }

    public static /* synthetic */ Flow listCollectionsPaginated$default(UrlInterceptRegistry urlInterceptRegistry, D d, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            d = D.EZpvd.KWHzl(new Function1<D.StateListAnimator, Unit>() { // from class: aws.sdk.kotlin.services.rekognition.paginators.PaginatorsKt$listCollectionsPaginated$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull D.StateListAnimator stateListAnimator) {
                    Intrinsics.checkNotNullParameter(stateListAnimator, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(D.StateListAnimator stateListAnimator) {
                    invoke2(stateListAnimator);
                    return Unit.INSTANCE;
                }
            });
        }
        return KWHzl(urlInterceptRegistry, d);
    }

    public static final Flow<B> KWHzl(@NotNull UrlInterceptRegistry urlInterceptRegistry, @NotNull D d) {
        Intrinsics.checkNotNullParameter(urlInterceptRegistry, "");
        Intrinsics.checkNotNullParameter(d, "");
        return FlowKt.flow(new PaginatorsKt$listCollectionsPaginated$2(d, urlInterceptRegistry, null));
    }

    public static /* synthetic */ Flow listMediaAnalysisJobsPaginated$default(UrlInterceptRegistry urlInterceptRegistry, O o2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            o2 = O.OLrzqt.AEQbTJ(new Function1<O.Activity, Unit>() { // from class: aws.sdk.kotlin.services.rekognition.paginators.PaginatorsKt$listMediaAnalysisJobsPaginated$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull O.Activity activity) {
                    Intrinsics.checkNotNullParameter(activity, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(O.Activity activity) {
                    invoke2(activity);
                    return Unit.INSTANCE;
                }
            });
        }
        return OLrzqt(urlInterceptRegistry, o2);
    }

    public static final Flow<L> OLrzqt(@NotNull UrlInterceptRegistry urlInterceptRegistry, @NotNull O o2) {
        Intrinsics.checkNotNullParameter(urlInterceptRegistry, "");
        Intrinsics.checkNotNullParameter(o2, "");
        return FlowKt.flow(new PaginatorsKt$listMediaAnalysisJobsPaginated$2(o2, urlInterceptRegistry, null));
    }

    public static /* synthetic */ Flow listStreamProcessorsPaginated$default(UrlInterceptRegistry urlInterceptRegistry, P p, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            p = P.EZpvd.EZpvd(new Function1<P.StateListAnimator, Unit>() { // from class: aws.sdk.kotlin.services.rekognition.paginators.PaginatorsKt$listStreamProcessorsPaginated$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull P.StateListAnimator stateListAnimator) {
                    Intrinsics.checkNotNullParameter(stateListAnimator, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(P.StateListAnimator stateListAnimator) {
                    invoke2(stateListAnimator);
                    return Unit.INSTANCE;
                }
            });
        }
        return AEQbTJ(urlInterceptRegistry, p);
    }

    public static final Flow<U> AEQbTJ(@NotNull UrlInterceptRegistry urlInterceptRegistry, @NotNull P p) {
        Intrinsics.checkNotNullParameter(urlInterceptRegistry, "");
        Intrinsics.checkNotNullParameter(p, "");
        return FlowKt.flow(new PaginatorsKt$listStreamProcessorsPaginated$2(p, urlInterceptRegistry, null));
    }
}
