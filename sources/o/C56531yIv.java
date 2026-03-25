package o;

import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KVariance;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yIv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C56531yIv implements yJD {
    public static final StateListAnimator copydefault = new StateListAnimator(null);
    public volatile java.util.List<? extends InterfaceC56559yJw> AEQbTJ;
    public final java.lang.String EZpvd;
    public final java.lang.Object KWHzl;
    public final KVariance OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.yJD
    public java.lang.String OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.yJD
    public KVariance copydefault() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends o.yJw>, java.util.List<o.yJw> */
    @Override // o.yJD
    public java.util.List<InterfaceC56559yJw> EZpvd() {
        java.util.List list = this.AEQbTJ;
        if (list != null) {
            return list;
        }
        java.util.List<InterfaceC56559yJw> listEZpvd = C56402yEa.EZpvd(C56524yIo.KWHzl(java.lang.Object.class));
        this.AEQbTJ = listEZpvd;
        return listEZpvd;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj instanceof C56531yIv) {
            C56531yIv c56531yIv = (C56531yIv) obj;
            if (Intrinsics.EZpvd(this.KWHzl, c56531yIv.KWHzl) && Intrinsics.EZpvd((java.lang.Object) OLrzqt(), (java.lang.Object) c56531yIv.OLrzqt())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        java.lang.Object obj = this.KWHzl;
        return ((obj != null ? obj.hashCode() : 0) * 31) + OLrzqt().hashCode();
    }

    public java.lang.String toString() {
        return copydefault.OLrzqt(this);
    }

    /* JADX INFO: renamed from: o.yIv$StateListAnimator */
    public static final class StateListAnimator {

        /* JADX INFO: renamed from: o.yIv$StateListAnimator$ActionBar */
        public final /* synthetic */ class ActionBar {
            public static final /* synthetic */ int[] OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            static {
                int[] iArr = new int[KVariance.values().length];
                try {
                    iArr[KVariance.INVARIANT.ordinal()] = 1;
                } catch (java.lang.NoSuchFieldError unused) {
                }
                try {
                    iArr[KVariance.IN.ordinal()] = 2;
                } catch (java.lang.NoSuchFieldError unused2) {
                }
                try {
                    iArr[KVariance.OUT.ordinal()] = 3;
                } catch (java.lang.NoSuchFieldError unused3) {
                }
                OLrzqt = iArr;
            }
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.yIv.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final java.lang.String OLrzqt(@NotNull yJD yjd) {
            Intrinsics.checkNotNullParameter(yjd, "");
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            int i = ActionBar.OLrzqt[yjd.copydefault().ordinal()];
            if (i == 1) {
                Unit unit = Unit.INSTANCE;
            } else if (i == 2) {
                sb.append("in ");
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                sb.append("out ");
            }
            sb.append(yjd.OLrzqt());
            return sb.toString();
        }
    }
}
