package o;

import aws.smithy.kotlin.runtime.http.HttpMethod;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C5167Hh;
import o.C58617zJ;
import o.DL;
import o.DN;
import o.InterfaceC5164He;
import o.InterfaceC56347yC;
import o.SparseArray;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class ContextMenuInfo implements BH<SparseArray> {
    /* JADX DEBUG: Method merged with bridge method: KWHzl(Lo/DT;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
    @Override // o.BH
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public java.lang.Object KWHzl(@NotNull DT dt, @NotNull final SparseArray sparseArray, @NotNull Continuation<? super C5036Cg> continuation) {
        C5036Cg c5036Cg = new C5036Cg();
        c5036Cg.KWHzl(HttpMethod.GET);
        C5034Ce.EZpvd(c5036Cg, new Function1<DL.Application, Unit>() { // from class: aws.sdk.kotlin.runtime.auth.credentials.internal.sso.serde.GetRoleCredentialsOperationSerializer$serialize$2
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
                application.AYXKKw().EZpvd("/federation/credentials");
                DN.StateListAnimator stateListAnimatorEZpvd = application.EZpvd();
                InterfaceC5164He interfaceC5164HeGEmmrt = C5167Hh.KWHzl.gEmmrt();
                final SparseArray sparseArray2 = sparseArray;
                stateListAnimatorEZpvd.copydefault(interfaceC5164HeGEmmrt, new Function1<InterfaceC56347yC<String, String>, Unit>() { // from class: aws.sdk.kotlin.runtime.auth.credentials.internal.sso.serde.GetRoleCredentialsOperationSerializer$serialize$2.1
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
                        if (sparseArray2.EZpvd() != null) {
                            interfaceC56347yC.AEQbTJ("account_id", sparseArray2.EZpvd());
                        }
                        if (sparseArray2.OLrzqt() != null) {
                            interfaceC56347yC.AEQbTJ("role_name", sparseArray2.OLrzqt());
                        }
                    }
                });
            }
        });
        C5034Ce.OLrzqt(c5036Cg, new Function1<C58617zJ, Unit>() { // from class: aws.sdk.kotlin.runtime.auth.credentials.internal.sso.serde.GetRoleCredentialsOperationSerializer$serialize$3
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(1);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C58617zJ c58617zJ) {
                invoke2(c58617zJ);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull C58617zJ c58617zJ) {
                Intrinsics.checkNotNullParameter(c58617zJ, "");
                String strAEQbTJ = sparseArray.AEQbTJ();
                if (strAEQbTJ == null || strAEQbTJ.length() <= 0) {
                    return;
                }
                c58617zJ.OLrzqt("x-amz-sso_bearer_token", sparseArray.AEQbTJ());
            }
        });
        return c5036Cg;
    }
}
