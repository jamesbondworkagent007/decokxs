package o;

import aws.sdk.kotlin.services.translate.paginators.PaginatorsKt$listLanguagesPaginated$2;
import aws.sdk.kotlin.services.translate.paginators.PaginatorsKt$listParallelDataPaginated$2;
import aws.sdk.kotlin.services.translate.paginators.PaginatorsKt$listTerminologiesPaginated$2;
import aws.sdk.kotlin.services.translate.paginators.PaginatorsKt$listTextTranslationJobsPaginated$2;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import o.C46024tF;
import o.C47541ts;
import o.C47647tu;
import o.C47859ty;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ug, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C48988ug {
    public static /* synthetic */ Flow listLanguagesPaginated$default(InterfaceC44254sJ interfaceC44254sJ, C47647tu c47647tu, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            c47647tu = C47647tu.copydefault.KWHzl(new Function1<C47647tu.Application, Unit>() { // from class: aws.sdk.kotlin.services.translate.paginators.PaginatorsKt$listLanguagesPaginated$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull C47647tu.Application application) {
                    Intrinsics.checkNotNullParameter(application, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(C47647tu.Application application) {
                    invoke2(application);
                    return Unit.INSTANCE;
                }
            });
        }
        return AEQbTJ(interfaceC44254sJ, c47647tu);
    }

    public static final Flow<C47492tr> AEQbTJ(@NotNull InterfaceC44254sJ interfaceC44254sJ, @NotNull C47647tu c47647tu) {
        Intrinsics.checkNotNullParameter(interfaceC44254sJ, "");
        Intrinsics.checkNotNullParameter(c47647tu, "");
        return FlowKt.flow(new PaginatorsKt$listLanguagesPaginated$2(c47647tu, interfaceC44254sJ, null));
    }

    public static /* synthetic */ Flow listParallelDataPaginated$default(InterfaceC44254sJ interfaceC44254sJ, C47541ts c47541ts, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            c47541ts = C47541ts.EZpvd.OLrzqt(new Function1<C47541ts.TaskDescription, Unit>() { // from class: aws.sdk.kotlin.services.translate.paginators.PaginatorsKt$listParallelDataPaginated$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull C47541ts.TaskDescription taskDescription) {
                    Intrinsics.checkNotNullParameter(taskDescription, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(C47541ts.TaskDescription taskDescription) {
                    invoke2(taskDescription);
                    return Unit.INSTANCE;
                }
            });
        }
        return EZpvd(interfaceC44254sJ, c47541ts);
    }

    public static final Flow<C47753tw> EZpvd(@NotNull InterfaceC44254sJ interfaceC44254sJ, @NotNull C47541ts c47541ts) {
        Intrinsics.checkNotNullParameter(interfaceC44254sJ, "");
        Intrinsics.checkNotNullParameter(c47541ts, "");
        return FlowKt.flow(new PaginatorsKt$listParallelDataPaginated$2(c47541ts, interfaceC44254sJ, null));
    }

    public static /* synthetic */ Flow listTerminologiesPaginated$default(InterfaceC44254sJ interfaceC44254sJ, C47859ty c47859ty, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            c47859ty = C47859ty.OLrzqt.KWHzl(new Function1<C47859ty.ActionBar, Unit>() { // from class: aws.sdk.kotlin.services.translate.paginators.PaginatorsKt$listTerminologiesPaginated$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull C47859ty.ActionBar actionBar) {
                    Intrinsics.checkNotNullParameter(actionBar, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(C47859ty.ActionBar actionBar) {
                    invoke2(actionBar);
                    return Unit.INSTANCE;
                }
            });
        }
        return OLrzqt(interfaceC44254sJ, c47859ty);
    }

    public static final Flow<C45888tA> OLrzqt(@NotNull InterfaceC44254sJ interfaceC44254sJ, @NotNull C47859ty c47859ty) {
        Intrinsics.checkNotNullParameter(interfaceC44254sJ, "");
        Intrinsics.checkNotNullParameter(c47859ty, "");
        return FlowKt.flow(new PaginatorsKt$listTerminologiesPaginated$2(c47859ty, interfaceC44254sJ, null));
    }

    public static /* synthetic */ Flow listTextTranslationJobsPaginated$default(InterfaceC44254sJ interfaceC44254sJ, C46024tF c46024tF, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            c46024tF = C46024tF.copydefault.copydefault(new Function1<C46024tF.Activity, Unit>() { // from class: aws.sdk.kotlin.services.translate.paginators.PaginatorsKt$listTextTranslationJobsPaginated$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull C46024tF.Activity activity) {
                    Intrinsics.checkNotNullParameter(activity, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(C46024tF.Activity activity) {
                    invoke2(activity);
                    return Unit.INSTANCE;
                }
            });
        }
        return AEQbTJ(interfaceC44254sJ, c46024tF);
    }

    public static final Flow<C45970tD> AEQbTJ(@NotNull InterfaceC44254sJ interfaceC44254sJ, @NotNull C46024tF c46024tF) {
        Intrinsics.checkNotNullParameter(interfaceC44254sJ, "");
        Intrinsics.checkNotNullParameter(c46024tF, "");
        return FlowKt.flow(new PaginatorsKt$listTextTranslationJobsPaginated$2(c46024tF, interfaceC44254sJ, null));
    }
}
