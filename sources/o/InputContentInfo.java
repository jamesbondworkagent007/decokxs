package o;

import aws.smithy.kotlin.runtime.http.HttpMethod;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C5167Hh;
import o.DL;
import o.DN;
import o.InterfaceC5164He;
import o.InterfaceC56347yC;
import o.WindowManagerImpl;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class InputContentInfo implements BH<WindowManagerImpl> {
    /* JADX DEBUG: Method merged with bridge method: KWHzl(Lo/DT;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
    @Override // o.BH
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public java.lang.Object KWHzl(@NotNull DT dt, @NotNull final WindowManagerImpl windowManagerImpl, @NotNull Continuation<? super C5036Cg> continuation) {
        C5036Cg c5036Cg = new C5036Cg();
        c5036Cg.KWHzl(HttpMethod.GET);
        C5034Ce.EZpvd(c5036Cg, new Function1<DL.Application, Unit>() { // from class: aws.sdk.kotlin.services.polly.serde.DescribeVoicesOperationSerializer$serialize$2
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
                application.AYXKKw().EZpvd("/v1/voices");
                DN.StateListAnimator stateListAnimatorEZpvd = application.EZpvd();
                InterfaceC5164He interfaceC5164HeGEmmrt = C5167Hh.KWHzl.gEmmrt();
                final WindowManagerImpl windowManagerImpl2 = windowManagerImpl;
                stateListAnimatorEZpvd.copydefault(interfaceC5164HeGEmmrt, new Function1<InterfaceC56347yC<String, String>, Unit>() { // from class: aws.sdk.kotlin.services.polly.serde.DescribeVoicesOperationSerializer$serialize$2.1
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
                        if (windowManagerImpl2.OLrzqt() != null) {
                            interfaceC56347yC.AEQbTJ("Engine", windowManagerImpl2.OLrzqt().OLrzqt());
                        }
                        if (windowManagerImpl2.copydefault() != null) {
                            interfaceC56347yC.AEQbTJ("IncludeAdditionalLanguageCodes", String.valueOf(windowManagerImpl2.copydefault()));
                        }
                        if (windowManagerImpl2.AEQbTJ() != null) {
                            interfaceC56347yC.AEQbTJ("LanguageCode", windowManagerImpl2.AEQbTJ().KWHzl());
                        }
                        if (windowManagerImpl2.EZpvd() != null) {
                            interfaceC56347yC.AEQbTJ("NextToken", windowManagerImpl2.EZpvd());
                        }
                    }
                });
            }
        });
        return c5036Cg;
    }
}
