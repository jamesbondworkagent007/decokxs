package o;

import com.okinc.modular.deeplinkv2.LinkSource;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@yCR
public final class pLL implements InterfaceC43236rlV {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int EZpvd = 8;
    public final InterfaceC43294rma AEQbTJ;

    @yCM
    public pLL(@NotNull InterfaceC43294rma interfaceC43294rma) {
        Intrinsics.checkNotNullParameter(interfaceC43294rma, "");
        this.AEQbTJ = interfaceC43294rma;
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.pLL.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    public static final Unit copydefault(AbstractC43238rlX abstractC43238rlX) {
        Intrinsics.checkNotNullParameter(abstractC43238rlX, "");
        return Unit.INSTANCE;
    }

    @Override // o.InterfaceC43236rlV
    public void KWHzl(@NotNull android.content.Context context, @NotNull InterfaceC43232rlR interfaceC43232rlR, @NotNull java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(interfaceC43232rlR, "");
        Intrinsics.checkNotNullParameter(map, "");
        this.AEQbTJ.AEQbTJ(context, AEQbTJ(interfaceC43232rlR), map, LinkSource.CAMPAIGN_HANDLER, true, new Function1() { // from class: o.pLP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return pLL.copydefault((AbstractC43238rlX) obj);
            }
        });
    }

    public final java.lang.String AEQbTJ(InterfaceC43232rlR interfaceC43232rlR) {
        return "okx://app/web?url=" + interfaceC43232rlR.AEQbTJ();
    }
}
