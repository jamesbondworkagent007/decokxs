package o;

import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C5166Hg;
import o.C57631ym;
import o.DB;
import o.DL;
import o.DS;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class BL {
    public static final void OLrzqt(@NotNull BP<C5036Cg> bp, @NotNull C57631ym c57631ym) {
        Intrinsics.checkNotNullParameter(bp, "");
        Intrinsics.checkNotNullParameter(c57631ym, "");
        AEQbTJ(bp.EZpvd(), bp.OLrzqt(), c57631ym);
    }

    public static final void AEQbTJ(@NotNull C5036Cg c5036Cg, @NotNull DT dt, @NotNull final C57631ym c57631ym) {
        Intrinsics.checkNotNullParameter(c5036Cg, "");
        Intrinsics.checkNotNullParameter(dt, "");
        Intrinsics.checkNotNullParameter(c57631ym, "");
        java.lang.String str = (java.lang.String) dt.OLrzqt(BC.copydefault.AEQbTJ());
        final java.lang.String str2 = (str != null ? str : "") + c57631ym.copydefault().OLrzqt();
        C5034Ce.EZpvd(c5036Cg, new Function1<DL.Application, Unit>() { // from class: aws.smithy.kotlin.runtime.http.operation.OperationEndpointKt$setResolvedEndpoint$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                application.EZpvd(c57631ym.copydefault().AhwBna());
                application.valueOf().AEQbTJ(c57631ym.copydefault().djBIcL());
                application.EZpvd(DB.copydefault.KWHzl(str2));
                application.OLrzqt(Integer.valueOf(c57631ym.copydefault().KWHzl()));
                final C57631ym c57631ym2 = c57631ym;
                application.EZpvd(new Function1<DS.TaskDescription, Unit>() { // from class: aws.smithy.kotlin.runtime.http.operation.OperationEndpointKt$setResolvedEndpoint$1.1
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    {
                        super(1);
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(DS.TaskDescription taskDescription) {
                        invoke2(taskDescription);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull DS.TaskDescription taskDescription) {
                        Intrinsics.checkNotNullParameter(taskDescription, "");
                        taskDescription.copydefault(taskDescription.EZpvd() || (taskDescription.KWHzl().isEmpty() && c57631ym2.copydefault().AEQbTJ().EZpvd()));
                        taskDescription.KWHzl().addAll(0, c57631ym2.copydefault().AEQbTJ().KWHzl());
                    }
                });
                application.EZpvd().copydefault((Map<C5166Hg, ? extends List<? extends C5166Hg>>) c57631ym.copydefault().copydefault());
                C5166Hg c5166HgEZpvd = c57631ym.copydefault().EZpvd();
                application.OLrzqt(c5166HgEZpvd != null ? c5166HgEZpvd.AEQbTJ() : null);
            }
        });
        c5036Cg.AEQbTJ().EZpvd("Host", c5036Cg.djBIcL().AEQbTJ());
        InterfaceC56482yH<java.lang.String> interfaceC56482yHOLrzqt = c57631ym.OLrzqt();
        if (interfaceC56482yHOLrzqt != null) {
            c5036Cg.AEQbTJ().KWHzl(interfaceC56482yHOLrzqt);
        }
    }
}
