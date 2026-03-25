package o;

import aws.sdk.kotlin.services.polly.paginators.PaginatorsKt$listSpeechSynthesisTasksPaginated$2;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import o.BounceInterpolator;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class ScaleAnimation {
    public static /* synthetic */ Flow listSpeechSynthesisTasksPaginated$default(ViewHierarchyEncoder viewHierarchyEncoder, BounceInterpolator bounceInterpolator, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            bounceInterpolator = BounceInterpolator.copydefault.copydefault(new Function1<BounceInterpolator.StateListAnimator, Unit>() { // from class: aws.sdk.kotlin.services.polly.paginators.PaginatorsKt$listSpeechSynthesisTasksPaginated$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull BounceInterpolator.StateListAnimator stateListAnimator) {
                    Intrinsics.checkNotNullParameter(stateListAnimator, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(BounceInterpolator.StateListAnimator stateListAnimator) {
                    invoke2(stateListAnimator);
                    return Unit.INSTANCE;
                }
            });
        }
        return OLrzqt(viewHierarchyEncoder, bounceInterpolator);
    }

    public static final Flow<AnticipateOvershootInterpolator> OLrzqt(@NotNull ViewHierarchyEncoder viewHierarchyEncoder, @NotNull BounceInterpolator bounceInterpolator) {
        Intrinsics.checkNotNullParameter(viewHierarchyEncoder, "");
        Intrinsics.checkNotNullParameter(bounceInterpolator, "");
        return FlowKt.flow(new PaginatorsKt$listSpeechSynthesisTasksPaginated$2(bounceInterpolator, viewHierarchyEncoder, null));
    }
}
