package o;

import aws.smithy.kotlin.runtime.http.HttpMethod;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.DL;
import o.zP;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ez, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C17240ez implements BH<Filter> {
    /* JADX DEBUG: Method merged with bridge method: KWHzl(Lo/DT;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
    @Override // o.BH
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public java.lang.Object KWHzl(@NotNull DT dt, @NotNull Filter filter, @NotNull Continuation<? super C5036Cg> continuation) {
        C5036Cg c5036Cg = new C5036Cg();
        c5036Cg.KWHzl(HttpMethod.POST);
        C5034Ce.EZpvd(c5036Cg, new Function1<DL.Application, Unit>() { // from class: aws.sdk.kotlin.services.rekognition.serde.DeleteProjectPolicyOperationSerializer$serialize$2
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
        c5036Cg.EZpvd(zP.EZpvd.OLrzqt(C15213eA.AEQbTJ(dt, filter)));
        if (!(c5036Cg.KWHzl() instanceof zP.StateListAnimator)) {
            c5036Cg.AEQbTJ().KWHzl("Content-Type", "application/x-amz-json-1.1");
        }
        return c5036Cg;
    }
}
