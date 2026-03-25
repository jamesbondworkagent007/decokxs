package o;

import java.util.concurrent.TimeoutException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.AbstractC5307Mr;
import o.C5213Jb;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.Lw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5286Lw {
    public static final C5213Jb EZpvd(InterfaceC5215Jd interfaceC5215Jd, long j) throws TimeoutException {
        final C5304Mo c5304Mo = new C5304Mo();
        Function1<C5213Jb, Unit> function1 = new Function1<C5213Jb, Unit>() { // from class: com.amplitude.experiment.ConnectorUserProviderKt$getIdentityOrWait$callback$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C5213Jb c5213Jb) {
                invoke2(c5213Jb);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull C5213Jb c5213Jb) {
                Intrinsics.checkNotNullParameter(c5213Jb, "");
                c5304Mo.EZpvd(new AbstractC5307Mr.StateListAnimator(c5213Jb));
            }
        };
        interfaceC5215Jd.EZpvd(function1);
        C5213Jb c5213JbAEQbTJ = interfaceC5215Jd.AEQbTJ();
        if (KWHzl(c5213JbAEQbTJ)) {
            AbstractC5307Mr abstractC5307MrEZpvd = c5304Mo.EZpvd(j);
            if (abstractC5307MrEZpvd instanceof AbstractC5307Mr.StateListAnimator) {
                c5213JbAEQbTJ = (C5213Jb) ((AbstractC5307Mr.StateListAnimator) abstractC5307MrEZpvd).KWHzl();
            } else if (abstractC5307MrEZpvd instanceof AbstractC5307Mr.ActionBar) {
                if (((AbstractC5307Mr.ActionBar) abstractC5307MrEZpvd).KWHzl() instanceof TimeoutException) {
                    throw new TimeoutException("Timed out waiting for Amplitude Analytics SDK to initialize. You should ensure that the analytics SDK is initialized prior to calling fetch().");
                }
                c5213JbAEQbTJ = new C5213Jb(null, null, null, 7, null);
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
        interfaceC5215Jd.copydefault(function1);
        return c5213JbAEQbTJ;
    }

    public static final boolean KWHzl(C5213Jb c5213Jb) {
        java.lang.String strOLrzqt;
        java.lang.String strKWHzl = c5213Jb.KWHzl();
        return (strKWHzl == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strKWHzl)) && ((strOLrzqt = c5213Jb.OLrzqt()) == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strOLrzqt));
    }
}
