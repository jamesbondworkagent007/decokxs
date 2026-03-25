package com.okinc.business.defi.biz.core.password;

import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.C33129mqd;
import o.C56390yDp;

/* JADX INFO: loaded from: classes3.dex */
public final class PasswordCheckResult {
    private int code;
    private long lockRemain;
    private int remain;
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getLockRemain() {
        return this.lockRemain;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getRemain() {
        return this.remain;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isFailed() {
        return this.code == -2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isLocked() {
        return this.code == -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isPassed() {
        return this.code == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLockRemain(long j) {
        this.lockRemain = j;
    }

    /* JADX INFO: renamed from: getLockRemain, reason: collision with other method in class */
    public final Pair<String, String> m6402getLockRemain() {
        long j = this.lockRemain;
        long j2 = 3600000;
        long j3 = j / j2;
        return C56390yDp.OLrzqt(C33129mqd.AYXKKw(Long.valueOf(j3)), C33129mqd.AYXKKw(Long.valueOf((j - (j2 * j3)) / ((long) 60000))));
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.core.password.PasswordCheckResult.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final PasswordCheckResult OLrzqt() {
            PasswordCheckResult passwordCheckResult = new PasswordCheckResult();
            passwordCheckResult.code = 0;
            passwordCheckResult.remain = 0;
            passwordCheckResult.setLockRemain(0L);
            return passwordCheckResult;
        }

        public final PasswordCheckResult copydefault(long j) {
            PasswordCheckResult passwordCheckResult = new PasswordCheckResult();
            passwordCheckResult.code = -1;
            passwordCheckResult.remain = 0;
            passwordCheckResult.setLockRemain(j);
            return passwordCheckResult;
        }

        public final PasswordCheckResult EZpvd(int i) {
            PasswordCheckResult passwordCheckResult = new PasswordCheckResult();
            passwordCheckResult.code = -2;
            passwordCheckResult.remain = i;
            passwordCheckResult.setLockRemain(0L);
            return passwordCheckResult;
        }
    }
}
