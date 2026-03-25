package o;

import aws.smithy.kotlin.runtime.http.HttpMethod;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.AccelerateDecelerateInterpolator;
import o.C5167Hh;
import o.DL;
import o.DS;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class InputMethod implements BH<AccelerateDecelerateInterpolator> {
    /* JADX DEBUG: Method merged with bridge method: KWHzl(Lo/DT;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
    @Override // o.BH
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public java.lang.Object KWHzl(@NotNull DT dt, @NotNull final AccelerateDecelerateInterpolator accelerateDecelerateInterpolator, @NotNull Continuation<? super C5036Cg> continuation) {
        C5036Cg c5036Cg = new C5036Cg();
        c5036Cg.KWHzl(HttpMethod.GET);
        C5034Ce.EZpvd(c5036Cg, new Function1<DL.Application, Unit>() { // from class: aws.sdk.kotlin.services.polly.serde.GetSpeechSynthesisTaskOperationSerializer$serialize$2
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
                if (accelerateDecelerateInterpolator.EZpvd() == null) {
                    throw new IllegalArgumentException("taskId is bound to the URI and must not be null".toString());
                }
                DS.TaskDescription taskDescriptionAYXKKw = application.AYXKKw();
                final AccelerateDecelerateInterpolator accelerateDecelerateInterpolator2 = accelerateDecelerateInterpolator;
                taskDescriptionAYXKKw.EZpvd(new Function1<List<String>, Unit>() { // from class: aws.sdk.kotlin.services.polly.serde.GetSpeechSynthesisTaskOperationSerializer$serialize$2.2
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    {
                        super(1);
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(List<String> list) {
                        invoke2(list);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull List<String> list) {
                        Intrinsics.checkNotNullParameter(list, "");
                        C5167Hh.ActionBar actionBar = C5167Hh.KWHzl;
                        list.add(actionBar.KWHzl().EZpvd("v1"));
                        list.add(actionBar.KWHzl().EZpvd("synthesisTasks"));
                        list.add(actionBar.gEmmrt().EZpvd(String.valueOf(accelerateDecelerateInterpolator2.EZpvd())));
                    }
                });
            }
        });
        return c5036Cg;
    }
}
