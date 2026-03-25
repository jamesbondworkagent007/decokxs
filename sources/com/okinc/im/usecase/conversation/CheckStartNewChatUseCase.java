package com.okinc.im.usecase.conversation;

import com.google.common.annotations.VisibleForTesting;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import o.oDZ;
import o.pUU;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class CheckStartNewChatUseCase {
    public final oDZ OLrzqt;
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int AEQbTJ = 8;

    @yCM
    public CheckStartNewChatUseCase(@NotNull oDZ odz) {
        Intrinsics.checkNotNullParameter(odz, "");
        this.OLrzqt = odz;
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.im.usecase.conversation.CheckStartNewChatUseCase.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.im.usecase.conversation.CheckStartNewChatUseCase */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object execute$default(CheckStartNewChatUseCase checkStartNewChatUseCase, Set set, Continuation continuation, int i, Object obj) {
        if ((i & 1) != 0) {
            set = null;
        }
        return checkStartNewChatUseCase.KWHzl(set, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object KWHzl(Set<? extends CheckStep> set, @NotNull Continuation<? super NewChatCheckResult> continuation) throws Throwable {
        CheckStartNewChatUseCase$execute$1 checkStartNewChatUseCase$execute$1;
        Set<CheckStep> set2;
        if (continuation instanceof CheckStartNewChatUseCase$execute$1) {
            checkStartNewChatUseCase$execute$1 = (CheckStartNewChatUseCase$execute$1) continuation;
            int i = checkStartNewChatUseCase$execute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                checkStartNewChatUseCase$execute$1.label = i - Integer.MIN_VALUE;
            } else {
                checkStartNewChatUseCase$execute$1 = new CheckStartNewChatUseCase$execute$1(this, continuation);
            }
        }
        Object obj = checkStartNewChatUseCase$execute$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = checkStartNewChatUseCase$execute$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            Set<CheckStep> linkedHashSet = new LinkedHashSet<>();
            if (set != null) {
                C56443yFo.KWHzl(linkedHashSet.addAll(set));
            }
            pUU.KWHzl("CheckStartNewChatUseCase", "Execute check start new chat, passList:" + set);
            Function1<? super Continuation<? super Boolean>, ? extends Object> checkStartNewChatUseCase$execute$checkKycSuccess$1 = new CheckStartNewChatUseCase$execute$checkKycSuccess$1(this, null);
            CheckStep checkStep = CheckStep.Kyc;
            checkStartNewChatUseCase$execute$1.L$0 = linkedHashSet;
            checkStartNewChatUseCase$execute$1.label = 1;
            Object objAEQbTJ = AEQbTJ(checkStartNewChatUseCase$execute$checkKycSuccess$1, checkStep, linkedHashSet, checkStartNewChatUseCase$execute$1);
            if (objAEQbTJ == objCopydefault) {
                return objCopydefault;
            }
            obj = objAEQbTJ;
            set2 = linkedHashSet;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            set2 = (Set) checkStartNewChatUseCase$execute$1.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        if (!((Boolean) obj).booleanValue()) {
            return new NewChatCheckResult(CheckStep.Kyc, set2);
        }
        set2.add(CheckStep.AllPassed);
        pUU.KWHzl("CheckStartNewChatUseCase", "All passed");
        return new NewChatCheckResult(null, set2);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @VisibleForTesting
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object AEQbTJ(@NotNull Function1<? super Continuation<? super Boolean>, ? extends Object> function1, @NotNull CheckStep checkStep, @NotNull Set<CheckStep> set, @NotNull Continuation<? super Boolean> continuation) throws Throwable {
        CheckStartNewChatUseCase$checkStep$1 checkStartNewChatUseCase$checkStep$1;
        if (continuation instanceof CheckStartNewChatUseCase$checkStep$1) {
            checkStartNewChatUseCase$checkStep$1 = (CheckStartNewChatUseCase$checkStep$1) continuation;
            int i = checkStartNewChatUseCase$checkStep$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                checkStartNewChatUseCase$checkStep$1.label = i - Integer.MIN_VALUE;
            } else {
                checkStartNewChatUseCase$checkStep$1 = new CheckStartNewChatUseCase$checkStep$1(this, continuation);
            }
        }
        Object objInvoke = checkStartNewChatUseCase$checkStep$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = checkStartNewChatUseCase$checkStep$1.label;
        boolean z = true;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objInvoke);
            if (set.contains(checkStep)) {
                return C56443yFo.KWHzl(true);
            }
            checkStartNewChatUseCase$checkStep$1.L$0 = checkStep;
            checkStartNewChatUseCase$checkStep$1.L$1 = set;
            checkStartNewChatUseCase$checkStep$1.label = 1;
            objInvoke = function1.invoke(checkStartNewChatUseCase$checkStep$1);
            if (objInvoke == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            set = (Set) checkStartNewChatUseCase$checkStep$1.L$1;
            checkStep = (CheckStep) checkStartNewChatUseCase$checkStep$1.L$0;
            C56391yDq.AEQbTJ(objInvoke);
        }
        boolean zBooleanValue = ((Boolean) objInvoke).booleanValue();
        pUU.KWHzl("CheckStartNewChatUseCase", "CheckStep:" + checkStep + ", result:" + zBooleanValue);
        if (zBooleanValue) {
            set.add(checkStep);
        } else {
            z = false;
        }
        return C56443yFo.KWHzl(z);
    }

    /* JADX INFO: loaded from: classes16.dex */
    public static final class NewChatCheckResult {
        public static final int $stable = 8;
        private final CheckStep failedStep;
        private final Set<CheckStep> passList;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.im.usecase.conversation.CheckStartNewChatUseCase$NewChatCheckResult */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ NewChatCheckResult copy$default(NewChatCheckResult newChatCheckResult, CheckStep checkStep, Set set, int i, Object obj) {
            if ((i & 1) != 0) {
                checkStep = newChatCheckResult.failedStep;
            }
            if ((i & 2) != 0) {
                set = newChatCheckResult.passList;
            }
            return newChatCheckResult.copy(checkStep, set);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final CheckStep component1() {
            return this.failedStep;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Set<CheckStep> component2() {
            return this.passList;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final NewChatCheckResult copy(CheckStep checkStep, @NotNull Set<? extends CheckStep> set) {
            Intrinsics.checkNotNullParameter(set, "");
            return new NewChatCheckResult(checkStep, set);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NewChatCheckResult)) {
                return false;
            }
            NewChatCheckResult newChatCheckResult = (NewChatCheckResult) obj;
            return this.failedStep == newChatCheckResult.failedStep && Intrinsics.EZpvd(this.passList, newChatCheckResult.passList);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final CheckStep getFailedStep() {
            return this.failedStep;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Set<CheckStep> getPassList() {
            return this.passList;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            CheckStep checkStep = this.failedStep;
            return ((checkStep == null ? 0 : checkStep.hashCode()) * 31) + this.passList.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean isAllPass() {
            return this.failedStep == null;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "NewChatCheckResult(failedStep=" + this.failedStep + ", passList=" + this.passList + ")";
        }

        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.Set<? extends com.okinc.im.usecase.conversation.CheckStartNewChatUseCase$CheckStep> */
        /* JADX WARN: Multi-variable type inference failed */
        public NewChatCheckResult(CheckStep checkStep, @NotNull Set<? extends CheckStep> set) {
            Intrinsics.checkNotNullParameter(set, "");
            this.failedStep = checkStep;
            this.passList = set;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: classes16.dex */
    public static final class CheckStep {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ CheckStep[] $VALUES;
        public static final CheckStep Kyc = new CheckStep("Kyc", 0);
        public static final CheckStep AllPassed = new CheckStep("AllPassed", 1);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ CheckStep[] $values() {
            return new CheckStep[]{Kyc, AllPassed};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<CheckStep> getEntries() {
            return $ENTRIES;
        }

        private CheckStep(String str, int i) {
        }

        static {
            CheckStep[] checkStepArr$values = $values();
            $VALUES = checkStepArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(checkStepArr$values);
        }

        public static CheckStep valueOf(String str) {
            return (CheckStep) Enum.valueOf(CheckStep.class, str);
        }

        public static CheckStep[] values() {
            return (CheckStep[]) $VALUES.clone();
        }
    }
}
