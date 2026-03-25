package o;

import aws.smithy.kotlin.runtime.http.HttpMethod;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.AnimationUtils;
import o.C5167Hh;
import o.DL;
import o.DN;
import o.InterfaceC5164He;
import o.InterfaceC56347yC;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class ClientCertRequest implements BH<AnimationUtils> {
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [o.DT, java.lang.Object, kotlin.coroutines.Continuation] */
    @Override // o.BH
    public /* bridge */ /* synthetic */ java.lang.Object KWHzl(DT dt, AnimationUtils animationUtils, Continuation continuation) {
        return KWHzl2(dt, animationUtils, (Continuation<? super C5036Cg>) continuation);
    }

    /* JADX INFO: renamed from: KWHzl, reason: avoid collision after fix types in other method */
    public java.lang.Object KWHzl2(@NotNull DT dt, @NotNull final AnimationUtils animationUtils, @NotNull Continuation<? super C5036Cg> continuation) {
        C5036Cg c5036Cg = new C5036Cg();
        c5036Cg.KWHzl(HttpMethod.GET);
        C5034Ce.EZpvd(c5036Cg, new Function1<DL.Application, Unit>() { // from class: aws.sdk.kotlin.services.polly.serde.ListLexiconsOperationSerializer$serialize$2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(1);
            }

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
                application.AYXKKw().EZpvd("/v1/lexicons");
                DN.StateListAnimator stateListAnimatorEZpvd = application.EZpvd();
                InterfaceC5164He interfaceC5164HeGEmmrt = C5167Hh.KWHzl.gEmmrt();
                final AnimationUtils animationUtils2 = animationUtils;
                stateListAnimatorEZpvd.copydefault(interfaceC5164HeGEmmrt, new Function1<InterfaceC56347yC<String, String>, Unit>() { // from class: aws.sdk.kotlin.services.polly.serde.ListLexiconsOperationSerializer$serialize$2.1
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    {
                        super(1);
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC56347yC<String, String> interfaceC56347yC) {
                        invoke2(interfaceC56347yC);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull InterfaceC56347yC<String, String> interfaceC56347yC) {
                        Intrinsics.checkNotNullParameter(interfaceC56347yC, "");
                        if (animationUtils2.KWHzl() != null) {
                            interfaceC56347yC.AEQbTJ("NextToken", animationUtils2.KWHzl());
                        }
                    }
                });
            }
        });
        return c5036Cg;
    }
}
