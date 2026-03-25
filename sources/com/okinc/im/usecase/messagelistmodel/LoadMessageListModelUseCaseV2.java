package com.okinc.im.usecase.messagelistmodel;

import com.okinc.okimcore.model.im.OKConversation;
import com.okinc.okimcore.model.im.OKMessage;
import com.reown.android.pulse.model.EventType;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C33129mqd;
import o.C36558odI;
import o.C37708oyt;
import o.C56391yDq;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import o.oEI;
import o.oGH;
import o.sKH;
import o.yCL;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class LoadMessageListModelUseCaseV2 {
    public static final Application Companion = new Application(null);
    public static final int OLrzqt = 8;
    public final C37708oyt AEQbTJ;
    public final oEI EZpvd;
    public final sKH KWHzl;
    public final oGH copydefault;

    public final /* synthetic */ class TaskDescription {
        public static final /* synthetic */ int[] copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[ExecuteScenario.values().length];
            try {
                iArr[ExecuteScenario.INIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ExecuteScenario.RELOAD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            copydefault = iArr;
        }
    }

    @yCM
    public LoadMessageListModelUseCaseV2(@NotNull oEI oei, @NotNull oGH ogh, @NotNull sKH skh, @yCL(AEQbTJ = "TrackerMessageListUseCase") @NotNull C37708oyt c37708oyt) {
        Intrinsics.checkNotNullParameter(oei, "");
        Intrinsics.checkNotNullParameter(ogh, "");
        Intrinsics.checkNotNullParameter(skh, "");
        Intrinsics.checkNotNullParameter(c37708oyt, "");
        this.EZpvd = oei;
        this.copydefault = ogh;
        this.KWHzl = skh;
        this.AEQbTJ = c37708oyt;
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.im.usecase.messagelistmodel.LoadMessageListModelUseCaseV2.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class ExecuteScenario {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ ExecuteScenario[] $VALUES;
        public static final ExecuteScenario INIT = new ExecuteScenario(EventType.INIT, 0);
        public static final ExecuteScenario RELOAD = new ExecuteScenario("RELOAD", 1);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ ExecuteScenario[] $values() {
            return new ExecuteScenario[]{INIT, RELOAD};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<ExecuteScenario> getEntries() {
            return $ENTRIES;
        }

        private ExecuteScenario(String str, int i) {
        }

        static {
            ExecuteScenario[] executeScenarioArr$values = $values();
            $VALUES = executeScenarioArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(executeScenarioArr$values);
        }

        public static ExecuteScenario valueOf(String str) {
            return (ExecuteScenario) Enum.valueOf(ExecuteScenario.class, str);
        }

        public static ExecuteScenario[] values() {
            return (ExecuteScenario[]) $VALUES.clone();
        }
    }

    public final Object EZpvd(@NotNull OKConversation oKConversation, OKMessage oKMessage, String str, @NotNull ExecuteScenario executeScenario, @NotNull Continuation<? super C36558odI> continuation) {
        int i = TaskDescription.copydefault[executeScenario.ordinal()];
        int i2 = 2;
        if (i != 1) {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i2 = 0;
        }
        return this.AEQbTJ.copydefault(new LoadMessageListModelUseCaseV2$execute$2(oKConversation, str, oKMessage, this, null), i2, new Object[]{oKConversation}, continuation);
    }

    public final void KWHzl(String str, OKMessage oKMessage) {
        Object objM7377constructorimpl;
        if (oKMessage != null) {
            try {
                Result.Application application = Result.Companion;
                this.KWHzl.KWHzl(str, C33129mqd.valueOf(Long.valueOf(oKMessage.getSeq())));
                objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
            } catch (Throwable th) {
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
            Result.m7376boximpl(objM7377constructorimpl);
        }
    }
}
