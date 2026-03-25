package o;

import aws.smithy.kotlin.runtime.http.HttpMethod;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C5167Hh;
import o.DL;
import o.DS;
import o.GridLayoutAnimationController;
import o.zP;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class FindAddress implements BH<GridLayoutAnimationController> {
    /* JADX DEBUG: Method merged with bridge method: KWHzl(Lo/DT;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
    @Override // o.BH
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public java.lang.Object KWHzl(@NotNull DT dt, @NotNull final GridLayoutAnimationController gridLayoutAnimationController, @NotNull Continuation<? super C5036Cg> continuation) {
        C5036Cg c5036Cg = new C5036Cg();
        c5036Cg.KWHzl(HttpMethod.PUT);
        C5034Ce.EZpvd(c5036Cg, new Function1<DL.Application, Unit>() { // from class: aws.sdk.kotlin.services.polly.serde.PutLexiconOperationSerializer$serialize$2
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
                if (gridLayoutAnimationController.copydefault() == null) {
                    throw new IllegalArgumentException("name is bound to the URI and must not be null".toString());
                }
                DS.TaskDescription taskDescriptionAYXKKw = application.AYXKKw();
                final GridLayoutAnimationController gridLayoutAnimationController2 = gridLayoutAnimationController;
                taskDescriptionAYXKKw.EZpvd(new Function1<List<String>, Unit>() { // from class: aws.sdk.kotlin.services.polly.serde.PutLexiconOperationSerializer$serialize$2.2
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
                        list.add(actionBar.KWHzl().EZpvd("lexicons"));
                        list.add(actionBar.gEmmrt().EZpvd(String.valueOf(gridLayoutAnimationController2.copydefault())));
                    }
                });
            }
        });
        c5036Cg.EZpvd(zP.EZpvd.OLrzqt(FindActionModeCallback.AEQbTJ(dt, gridLayoutAnimationController)));
        if (!(c5036Cg.KWHzl() instanceof zP.StateListAnimator)) {
            c5036Cg.AEQbTJ().KWHzl("Content-Type", "application/json");
        }
        return c5036Cg;
    }
}
