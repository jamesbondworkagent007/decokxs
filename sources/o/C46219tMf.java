package o;

import com.okinc.kyc.api.biz.restriction.OKComplianceRestrictionService;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC46217tMd;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tMf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C46219tMf {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int copydefault = 8;
    public final OKComplianceRestrictionService AEQbTJ;
    public final InterfaceC33171mrS OLrzqt;

    public C46219tMf(@NotNull OKComplianceRestrictionService oKComplianceRestrictionService, @NotNull InterfaceC33171mrS interfaceC33171mrS) {
        Intrinsics.checkNotNullParameter(oKComplianceRestrictionService, "");
        Intrinsics.checkNotNullParameter(interfaceC33171mrS, "");
        this.AEQbTJ = oKComplianceRestrictionService;
        this.OLrzqt = interfaceC33171mrS;
        if (!interfaceC33171mrS.isInitialized()) {
            throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
        }
        if (!oKComplianceRestrictionService.isInitialized()) {
            throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
        }
    }

    /* JADX INFO: renamed from: o.tMf$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.tMf.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final C46219tMf copydefault() {
            C46219tMf c46219tMfZblBkD;
            synchronized (this) {
                c46219tMfZblBkD = tPF.copydefault.zblBkD();
            }
            return c46219tMfZblBkD;
        }
    }

    public final boolean EZpvd() {
        return this.OLrzqt.ejfBZ();
    }

    public final boolean KWHzl() {
        return this.OLrzqt.getFieldNames();
    }

    public final boolean OLrzqt(@NotNull AbstractC46217tMd abstractC46217tMd) {
        Function0<java.lang.Boolean> function0AEQbTJ;
        Intrinsics.checkNotNullParameter(abstractC46217tMd, "");
        if (abstractC46217tMd instanceof AbstractC46217tMd.StateListAnimator) {
            return EZpvd() && ((function0AEQbTJ = ((AbstractC46217tMd.StateListAnimator) abstractC46217tMd).AEQbTJ()) == null || function0AEQbTJ.invoke().booleanValue());
        }
        throw new NoWhenBranchMatchedException();
    }
}
