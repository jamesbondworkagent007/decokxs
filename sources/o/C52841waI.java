package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52841waI;
import o.InterfaceC43294rma;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.waI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C52841waI {
    public static final Activity Companion = new Activity(null);

    /* JADX INFO: renamed from: o.waI$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.waI.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final void EZpvd(@NotNull android.content.Context context) {
            Intrinsics.checkNotNullParameter(context, "");
            InterfaceC43294rma.Application.processDeeplink$default((InterfaceC43294rma) C43251rlk.copydefault(InterfaceC43294rma.class), context, "okx://exchange/miniapp?appid=okluatradingeco&pageurl=/bot/smart_arb/recommendation", null, new Function1() { // from class: o.waH
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C52841waI.Activity.KWHzl((AbstractC43238rlX) obj);
                }
            }, 4, null);
        }

        public static final Unit KWHzl(AbstractC43238rlX abstractC43238rlX) {
            Intrinsics.checkNotNullParameter(abstractC43238rlX, "");
            return Unit.INSTANCE;
        }
    }
}
