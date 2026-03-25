package o;

import aws.smithy.kotlin.runtime.http.HttpMethod;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.DL;
import o.zP;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.iu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C25297iu implements BH<O> {
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [o.DT, java.lang.Object, kotlin.coroutines.Continuation] */
    @Override // o.BH
    public /* bridge */ /* synthetic */ java.lang.Object KWHzl(DT dt, O o2, Continuation continuation) {
        return KWHzl2(dt, o2, (Continuation<? super C5036Cg>) continuation);
    }

    /* JADX INFO: renamed from: KWHzl, reason: avoid collision after fix types in other method */
    public java.lang.Object KWHzl2(@NotNull DT dt, @NotNull O o2, @NotNull Continuation<? super C5036Cg> continuation) {
        C5036Cg c5036Cg = new C5036Cg();
        c5036Cg.KWHzl(HttpMethod.POST);
        C5034Ce.EZpvd(c5036Cg, new Function1<DL.Application, Unit>() { // from class: aws.sdk.kotlin.services.rekognition.serde.ListMediaAnalysisJobsOperationSerializer$serialize$2
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(DL.Application application) {
                invoke2(application);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull DL.Application application) {
                Intrinsics.checkNotNullParameter(application, "");
                application.AYXKKw().EZpvd("/");
            }
        });
        c5036Cg.EZpvd(zP.EZpvd.OLrzqt(C25244it.copydefault(dt, o2)));
        if (!(c5036Cg.KWHzl() instanceof zP.StateListAnimator)) {
            c5036Cg.AEQbTJ().KWHzl("Content-Type", "application/x-amz-json-1.1");
        }
        return c5036Cg;
    }
}
