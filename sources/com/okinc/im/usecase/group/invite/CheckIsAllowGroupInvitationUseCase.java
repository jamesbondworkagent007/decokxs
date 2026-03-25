package com.okinc.im.usecase.group.invite;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import o.oDL;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class CheckIsAllowGroupInvitationUseCase {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int OLrzqt = 8;
    public final oDL KWHzl;
    public final CoroutineDispatcher copydefault;

    @yCM
    public CheckIsAllowGroupInvitationUseCase(@NotNull oDL odl, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(odl, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.KWHzl = odl;
        this.copydefault = coroutineDispatcher;
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.im.usecase.group.invite.CheckIsAllowGroupInvitationUseCase.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    public final Object EZpvd(String str, @NotNull Continuation<? super CheckIsAllGroupInvitationStatus> continuation) {
        return BuildersKt.withContext(this.copydefault, new CheckIsAllowGroupInvitationUseCase$execute$2(str, this, null), continuation);
    }

    public static final class CheckIsAllGroupInvitationStatus {
        public final Status EZpvd;
        public final Long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ CheckIsAllGroupInvitationStatus copy$default(CheckIsAllGroupInvitationStatus checkIsAllGroupInvitationStatus, Status status, Long l, int i, Object obj) {
            if ((i & 1) != 0) {
                status = checkIsAllGroupInvitationStatus.EZpvd;
            }
            if ((i & 2) != 0) {
                l = checkIsAllGroupInvitationStatus.copydefault;
            }
            return checkIsAllGroupInvitationStatus.AEQbTJ(status, l);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final CheckIsAllGroupInvitationStatus AEQbTJ(@NotNull Status status, Long l) {
            Intrinsics.checkNotNullParameter(status, "");
            return new CheckIsAllGroupInvitationStatus(status, l);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Long KWHzl() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Status copydefault() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CheckIsAllGroupInvitationStatus)) {
                return false;
            }
            CheckIsAllGroupInvitationStatus checkIsAllGroupInvitationStatus = (CheckIsAllGroupInvitationStatus) obj;
            return this.EZpvd == checkIsAllGroupInvitationStatus.EZpvd && Intrinsics.EZpvd(this.copydefault, checkIsAllGroupInvitationStatus.copydefault);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.EZpvd.hashCode();
            Long l = this.copydefault;
            return (iHashCode * 31) + (l == null ? 0 : l.hashCode());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "CheckIsAllGroupInvitationStatus(status=" + this.EZpvd + ", groupId=" + this.copydefault + ")";
        }

        public CheckIsAllGroupInvitationStatus(@NotNull Status status, Long l) {
            Intrinsics.checkNotNullParameter(status, "");
            this.EZpvd = status;
            this.copydefault = l;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 com.okinc.im.usecase.group.invite.CheckIsAllowGroupInvitationUseCase$CheckIsAllGroupInvitationStatus$Status)
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r2v0 java.lang.Long))
 A[MD:(com.okinc.im.usecase.group.invite.CheckIsAllowGroupInvitationUseCase$CheckIsAllGroupInvitationStatus$Status, java.lang.Long):void (m)] (LINE:111) call: com.okinc.im.usecase.group.invite.CheckIsAllowGroupInvitationUseCase.CheckIsAllGroupInvitationStatus.<init>(com.okinc.im.usecase.group.invite.CheckIsAllowGroupInvitationUseCase$CheckIsAllGroupInvitationStatus$Status, java.lang.Long):void type: THIS */
        public /* synthetic */ CheckIsAllGroupInvitationStatus(Status status, Long l, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(status, (i & 2) != 0 ? null : l);
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class Status {
            private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
            private static final /* synthetic */ Status[] $VALUES;
            public static final Status GROUP_DISBANDED = new Status("GROUP_DISBANDED", 0);
            public static final Status BEING_KICKED = new Status("BEING_KICKED", 1);
            public static final Status JOIN_GROUP = new Status("JOIN_GROUP", 2);
            public static final Status VIEW_GROUP = new Status("VIEW_GROUP", 3);
            public static final Status PENDING_APPROVAL = new Status("PENDING_APPROVAL", 4);
            public static final Status MISSING_PAY_FUNCTION = new Status("MISSING_PAY_FUNCTION", 5);
            public static final Status COR_RESTRICTED = new Status("COR_RESTRICTED", 6);
            public static final Status UNKNOWN = new Status("UNKNOWN", 7);

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private static final /* synthetic */ Status[] $values() {
                return new Status[]{GROUP_DISBANDED, BEING_KICKED, JOIN_GROUP, VIEW_GROUP, PENDING_APPROVAL, MISSING_PAY_FUNCTION, COR_RESTRICTED, UNKNOWN};
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static InterfaceC56445yFq<Status> getEntries() {
                return $ENTRIES;
            }

            private Status(String str, int i) {
            }

            static {
                Status[] statusArr$values = $values();
                $VALUES = statusArr$values;
                $ENTRIES = C56444yFp.AEQbTJ(statusArr$values);
            }

            public static Status valueOf(String str) {
                return (Status) Enum.valueOf(Status.class, str);
            }

            public static Status[] values() {
                return (Status[]) $VALUES.clone();
            }
        }
    }
}
