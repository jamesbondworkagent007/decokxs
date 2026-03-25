package o;

import com.okinc.im.usecase.messagelistmodel.LoadMessageListModelUseCase$execute$2;
import com.okinc.im.usecase.messagelistmodel.LoadMessageListModelUseCaseV2;
import com.okinc.okimcore.model.im.OKConversation;
import com.okinc.okimcore.model.im.OKMessage;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class oEX {
    public final sRZ AhwBna;
    public final oGH EZpvd;
    public final oCC KWHzl;
    public final oEH OLrzqt;
    public final oCB copydefault;
    public final C37708oyt gEmmrt;
    public static final Activity Companion = new Activity(null);
    public static final int AEQbTJ = 8;

    public final /* synthetic */ class TaskDescription {
        public static final /* synthetic */ int[] EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[LoadMessageListModelUseCaseV2.ExecuteScenario.values().length];
            try {
                iArr[LoadMessageListModelUseCaseV2.ExecuteScenario.INIT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[LoadMessageListModelUseCaseV2.ExecuteScenario.RELOAD.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            EZpvd = iArr;
        }
    }

    @yCM
    public oEX(@NotNull oCC occ, @NotNull oCB ocb, @NotNull oEH oeh, @NotNull sRZ srz, @NotNull oGH ogh, @yCL(AEQbTJ = "TrackerMessageListUseCase") @NotNull C37708oyt c37708oyt) {
        Intrinsics.checkNotNullParameter(occ, "");
        Intrinsics.checkNotNullParameter(ocb, "");
        Intrinsics.checkNotNullParameter(oeh, "");
        Intrinsics.checkNotNullParameter(srz, "");
        Intrinsics.checkNotNullParameter(ogh, "");
        Intrinsics.checkNotNullParameter(c37708oyt, "");
        this.KWHzl = occ;
        this.copydefault = ocb;
        this.OLrzqt = oeh;
        this.AhwBna = srz;
        this.EZpvd = ogh;
        this.gEmmrt = c37708oyt;
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.oEX.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public final java.lang.Object AEQbTJ(@NotNull OKConversation oKConversation, OKMessage oKMessage, java.lang.String str, @NotNull LoadMessageListModelUseCaseV2.ExecuteScenario executeScenario, @NotNull Continuation<? super C36558odI> continuation) {
        int i = TaskDescription.EZpvd[executeScenario.ordinal()];
        int i2 = 2;
        if (i != 1) {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i2 = 0;
        }
        return this.gEmmrt.copydefault(new LoadMessageListModelUseCase$execute$2(this, oKConversation, oKMessage, str, null), i2, new java.lang.Object[]{oKConversation}, continuation);
    }
}
