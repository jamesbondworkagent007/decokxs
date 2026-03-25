package com.amplifyframework.storage;

import com.okinc.ok_kyc_core.data.remote.networkmodel.CardSyncResponse;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import o.yEE;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes21.dex */
public final class TransferState {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ TransferState[] $VALUES;
    public static final Companion Companion;
    public static final TransferState WAITING = new TransferState("WAITING", 0);
    public static final TransferState IN_PROGRESS = new TransferState("IN_PROGRESS", 1);
    public static final TransferState PAUSED = new TransferState("PAUSED", 2);
    public static final TransferState RESUMED_WAITING = new TransferState("RESUMED_WAITING", 3);
    public static final TransferState COMPLETED = new TransferState("COMPLETED", 4);
    public static final TransferState CANCELED = new TransferState("CANCELED", 5);
    public static final TransferState PENDING_FAILED = new TransferState("PENDING_FAILED", 6);
    public static final TransferState FAILED = new TransferState(CardSyncResponse.FAILED, 7);
    public static final TransferState PART_COMPLETED = new TransferState("PART_COMPLETED", 8);
    public static final TransferState PENDING_CANCEL = new TransferState("PENDING_CANCEL", 9);
    public static final TransferState PENDING_PAUSE = new TransferState("PENDING_PAUSE", 10);
    public static final TransferState UNKNOWN = new TransferState("UNKNOWN", 11);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ TransferState[] $values() {
        return new TransferState[]{WAITING, IN_PROGRESS, PAUSED, RESUMED_WAITING, COMPLETED, CANCELED, PENDING_FAILED, FAILED, PART_COMPLETED, PENDING_CANCEL, PENDING_PAUSE, UNKNOWN};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<TransferState> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final TransferState getState(@NotNull String str) {
        return Companion.getState(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final boolean isCancelled(TransferState transferState) {
        return Companion.isCancelled(transferState);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final boolean isInTerminalState(TransferState transferState) {
        return Companion.isInTerminalState(transferState);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final boolean isPaused(TransferState transferState) {
        return Companion.isPaused(transferState);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final boolean isStarted(TransferState transferState) {
        return Companion.isStarted(transferState);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static TransferState valueOf(String str) {
        return (TransferState) Enum.valueOf(TransferState.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static TransferState[] values() {
        return (TransferState[]) $VALUES.clone();
    }

    private TransferState(String str, int i) {
    }

    static {
        TransferState[] transferStateArr$values = $values();
        $VALUES = transferStateArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(transferStateArr$values);
        Companion = new Companion(null);
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.amplifyframework.storage.TransferState.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final TransferState getState(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            try {
                return TransferState.valueOf(str);
            } catch (IllegalArgumentException unused) {
                return TransferState.UNKNOWN;
            }
        }

        public final boolean isStarted(TransferState transferState) {
            return CollectionsKt___CollectionsKt.KWHzl((Iterable<? extends TransferState>) ((Iterable<? extends Object>) yEE.AhwBna(TransferState.WAITING, TransferState.IN_PROGRESS, TransferState.RESUMED_WAITING)), transferState);
        }

        public final boolean isInTerminalState(TransferState transferState) {
            return CollectionsKt___CollectionsKt.KWHzl((Iterable<? extends TransferState>) ((Iterable<? extends Object>) yEE.AhwBna(TransferState.COMPLETED, TransferState.CANCELED, TransferState.FAILED, TransferState.PART_COMPLETED)), transferState);
        }

        public final boolean isPaused(TransferState transferState) {
            return CollectionsKt___CollectionsKt.KWHzl((Iterable<? extends TransferState>) ((Iterable<? extends Object>) yEE.AhwBna(TransferState.PENDING_PAUSE, TransferState.PAUSED)), transferState);
        }

        public final boolean isCancelled(TransferState transferState) {
            return CollectionsKt___CollectionsKt.KWHzl((Iterable<? extends TransferState>) ((Iterable<? extends Object>) yEE.AhwBna(TransferState.PENDING_CANCEL, TransferState.CANCELED)), transferState);
        }
    }
}
