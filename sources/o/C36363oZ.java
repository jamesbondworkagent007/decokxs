package o;

import aws.sdk.kotlin.services.textract.paginators.PaginatorsKt$listAdapterVersionsPaginated$2;
import aws.sdk.kotlin.services.textract.paginators.PaginatorsKt$listAdaptersPaginated$2;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import o.C37079on;
import o.C37132oo;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C36363oZ {
    public static /* synthetic */ Flow listAdaptersPaginated$default(InterfaceC31925mJ interfaceC31925mJ, C37079on c37079on, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            c37079on = C37079on.KWHzl.KWHzl(new Function1<C37079on.Activity, Unit>() { // from class: aws.sdk.kotlin.services.textract.paginators.PaginatorsKt$listAdaptersPaginated$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull C37079on.Activity activity) {
                    Intrinsics.checkNotNullParameter(activity, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(C37079on.Activity activity) {
                    invoke2(activity);
                    return Unit.INSTANCE;
                }
            });
        }
        return EZpvd(interfaceC31925mJ, c37079on);
    }

    public static final Flow<C37185op> EZpvd(@NotNull InterfaceC31925mJ interfaceC31925mJ, @NotNull C37079on c37079on) {
        Intrinsics.checkNotNullParameter(interfaceC31925mJ, "");
        Intrinsics.checkNotNullParameter(c37079on, "");
        return FlowKt.flow(new PaginatorsKt$listAdaptersPaginated$2(c37079on, interfaceC31925mJ, null));
    }

    public static /* synthetic */ Flow listAdapterVersionsPaginated$default(InterfaceC31925mJ interfaceC31925mJ, C37132oo c37132oo, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            c37132oo = C37132oo.AEQbTJ.OLrzqt(new Function1<C37132oo.StateListAnimator, Unit>() { // from class: aws.sdk.kotlin.services.textract.paginators.PaginatorsKt$listAdapterVersionsPaginated$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull C37132oo.StateListAnimator stateListAnimator) {
                    Intrinsics.checkNotNullParameter(stateListAnimator, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(C37132oo.StateListAnimator stateListAnimator) {
                    invoke2(stateListAnimator);
                    return Unit.INSTANCE;
                }
            });
        }
        return EZpvd(interfaceC31925mJ, c37132oo);
    }

    public static final Flow<C37026om> EZpvd(@NotNull InterfaceC31925mJ interfaceC31925mJ, @NotNull C37132oo c37132oo) {
        Intrinsics.checkNotNullParameter(interfaceC31925mJ, "");
        Intrinsics.checkNotNullParameter(c37132oo, "");
        return FlowKt.flow(new PaginatorsKt$listAdapterVersionsPaginated$2(c37132oo, interfaceC31925mJ, null));
    }
}
