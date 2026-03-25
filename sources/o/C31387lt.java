package o;

import aws.smithy.kotlin.runtime.http.HttpMethod;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.DL;
import o.zP;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C31387lt implements BH<C8403bC> {
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [o.DT, java.lang.Object, kotlin.coroutines.Continuation] */
    @Override // o.BH
    public /* bridge */ /* synthetic */ java.lang.Object KWHzl(DT dt, C8403bC c8403bC, Continuation continuation) {
        return KWHzl2(dt, c8403bC, (Continuation<? super C5036Cg>) continuation);
    }

    /* JADX INFO: renamed from: KWHzl, reason: avoid collision after fix types in other method */
    public java.lang.Object KWHzl2(@NotNull DT dt, @NotNull C8403bC c8403bC, @NotNull Continuation<? super C5036Cg> continuation) {
        C5036Cg c5036Cg = new C5036Cg();
        c5036Cg.KWHzl(HttpMethod.POST);
        C5034Ce.EZpvd(c5036Cg, new Function1<DL.Application, Unit>() { // from class: aws.sdk.kotlin.services.rekognition.serde.StopProjectVersionOperationSerializer$serialize$2
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
        c5036Cg.EZpvd(zP.EZpvd.OLrzqt(C31546lw.copydefault(dt, c8403bC)));
        if (!(c5036Cg.KWHzl() instanceof zP.StateListAnimator)) {
            c5036Cg.AEQbTJ().KWHzl("Content-Type", "application/x-amz-json-1.1");
        }
        return c5036Cg;
    }
}
