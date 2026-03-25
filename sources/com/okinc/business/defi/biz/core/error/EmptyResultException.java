package com.okinc.business.defi.biz.core.error;

import kotlin.jvm.internal.DefaultConstructorMarker;
import o.C13754dXa;
import o.C33070mpX;
import o.pUU;

/* JADX INFO: loaded from: classes3.dex */
public final class EmptyResultException extends OKWException {
    public static final int $stable = 0;
    public static final StateListAnimator Companion = new StateListAnimator(null);

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.core.error.EmptyResultException.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ EmptyResultException(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private EmptyResultException() {
        super(C33070mpX.AYXKKw(C13754dXa.FragmentManager.aeJQwa), null);
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.core.error.EmptyResultException.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final Exception KWHzl() {
            pUU.copydefault("EmptyResultException", "Result is empty.");
            return new EmptyResultException(null);
        }
    }
}
