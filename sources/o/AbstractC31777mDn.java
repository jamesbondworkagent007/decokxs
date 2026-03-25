package o;

import com.okinc.localization.util.format.DisplaySign;
import java.math.BigDecimal;
import java.math.RoundingMode;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C38307pTy;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Marker;

/* JADX INFO: renamed from: o.mDn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public abstract class AbstractC31777mDn {
    public static final Application Companion = new Application(null);
    public static final BigDecimal copydefault = new BigDecimal("0.00000001");
    public static final BigDecimal AEQbTJ = new BigDecimal("0.01");

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.mDn.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ AbstractC31777mDn(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract BigDecimal AEQbTJ();

    public abstract java.lang.String EZpvd();

    public abstract int KWHzl(@NotNull BigDecimal bigDecimal);

    public abstract C38307pTy copydefault();

    public abstract C38307pTy valueOf();

    private AbstractC31777mDn() {
    }

    /* JADX INFO: renamed from: o.mDn$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.mDn.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final BigDecimal KWHzl() {
            return AbstractC31777mDn.copydefault;
        }

        public final BigDecimal copydefault() {
            return AbstractC31777mDn.AEQbTJ;
        }
    }

    public final java.lang.String KWHzl(@NotNull RoundingMode roundingMode, @NotNull DisplaySign displaySign) {
        Intrinsics.checkNotNullParameter(roundingMode, "");
        Intrinsics.checkNotNullParameter(displaySign, "");
        BigDecimal bigDecimal = BigDecimal.ZERO;
        Intrinsics.checkNotNullExpressionValue(bigDecimal, "");
        return pTB.formatICUNumber$default(bigDecimal, roundingMode, valueOf(), displaySign, null, 8, null);
    }

    public final java.lang.String KWHzl(@NotNull BigDecimal bigDecimal, @NotNull RoundingMode roundingMode, @NotNull DisplaySign displaySign) {
        Intrinsics.checkNotNullParameter(bigDecimal, "");
        Intrinsics.checkNotNullParameter(roundingMode, "");
        Intrinsics.checkNotNullParameter(displaySign, "");
        return pTB.formatICUNumber$default(bigDecimal, roundingMode, EZpvd(bigDecimal), displaySign, null, 8, null);
    }

    public static /* synthetic */ java.lang.String format$default(AbstractC31777mDn abstractC31777mDn, BigDecimal bigDecimal, boolean z, RoundingMode roundingMode, DisplaySign displaySign, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: format");
        }
        if ((i & 4) != 0) {
            roundingMode = RoundingMode.DOWN;
        }
        if ((i & 8) != 0) {
            displaySign = DisplaySign.AUTO;
        }
        return abstractC31777mDn.KWHzl(bigDecimal, z, roundingMode, displaySign);
    }

    public final java.lang.String KWHzl(@NotNull BigDecimal bigDecimal, boolean z, @NotNull RoundingMode roundingMode, @NotNull DisplaySign displaySign) {
        Intrinsics.checkNotNullParameter(bigDecimal, "");
        Intrinsics.checkNotNullParameter(roundingMode, "");
        Intrinsics.checkNotNullParameter(displaySign, "");
        BigDecimal bigDecimal2 = BigDecimal.ZERO;
        if (bigDecimal.compareTo(bigDecimal2) == 0) {
            return KWHzl(roundingMode, displaySign);
        }
        boolean z2 = bigDecimal.compareTo(bigDecimal2) < 0;
        if (bigDecimal.abs().compareTo(AEQbTJ()) < 0 && z) {
            return copydefault(z2, displaySign);
        }
        return KWHzl(bigDecimal, roundingMode, displaySign);
    }

    public final C38307pTy EZpvd(@NotNull BigDecimal bigDecimal) {
        Intrinsics.checkNotNullParameter(bigDecimal, "");
        if (bigDecimal.compareTo(BigDecimal.ZERO) == 0) {
            return valueOf();
        }
        return AEQbTJ(bigDecimal);
    }

    public C38307pTy AEQbTJ(@NotNull BigDecimal bigDecimal) {
        Intrinsics.checkNotNullParameter(bigDecimal, "");
        return copydefault();
    }

    public static /* synthetic */ java.lang.String formatSmallValue$default(AbstractC31777mDn abstractC31777mDn, boolean z, DisplaySign displaySign, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: formatSmallValue");
        }
        if ((i & 2) != 0) {
            displaySign = DisplaySign.AUTO;
        }
        return abstractC31777mDn.copydefault(z, displaySign);
    }

    public final java.lang.String copydefault(boolean z, DisplaySign displaySign) {
        java.lang.String str;
        java.lang.String localized$default = pTB.formatLocalized$default(EZpvd(), null, 1, null);
        if (z) {
            str = "-";
        } else {
            str = (displaySign == DisplaySign.EXCEPT_ZERO || displaySign == DisplaySign.ALWAYS) ? Marker.ANY_NON_NULL_MARKER : "";
        }
        return str + "<" + localized$default;
    }

    /* JADX INFO: renamed from: o.mDn$ActionBar */
    public static final class ActionBar extends AbstractC31777mDn {
        public static final int EZpvd;
        public static final C38307pTy KWHzl;
        public static final ActionBar OLrzqt = new ActionBar();
        public static final C38307pTy djBIcL;
        public static final C38307pTy valueOf;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.AbstractC31777mDn
        public java.lang.String EZpvd() {
            return "0.01";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.AbstractC31777mDn
        public int KWHzl(@NotNull BigDecimal bigDecimal) {
            Intrinsics.checkNotNullParameter(bigDecimal, "");
            return 2;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.AbstractC31777mDn
        public C38307pTy copydefault() {
            return KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ActionBar)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return -370196793;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Rule1";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.AbstractC31777mDn
        public C38307pTy valueOf() {
            return djBIcL;
        }

        private ActionBar() {
            super(null);
        }

        static {
            C38307pTy.Application application = C38307pTy.Companion;
            djBIcL = application.EZpvd(2);
            KWHzl = application.EZpvd(2);
            valueOf = application.EZpvd(2);
            int i = C38307pTy.AEQbTJ;
            EZpvd = i | i | i;
        }

        @Override // o.AbstractC31777mDn
        public BigDecimal AEQbTJ() {
            return AbstractC31777mDn.Companion.copydefault();
        }
    }

    /* JADX INFO: renamed from: o.mDn$StateListAnimator */
    public static final class StateListAnimator extends AbstractC31777mDn {
        public static final C38307pTy AhwBna;
        public static final C38307pTy EZpvd;
        public static final StateListAnimator KWHzl = new StateListAnimator();
        public static final int OLrzqt;
        public static final C38307pTy gEmmrt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.AbstractC31777mDn
        public java.lang.String EZpvd() {
            return "0.00000001";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.AbstractC31777mDn
        public int KWHzl(@NotNull BigDecimal bigDecimal) {
            Intrinsics.checkNotNullParameter(bigDecimal, "");
            return 8;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.AbstractC31777mDn
        public C38307pTy copydefault() {
            return EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StateListAnimator)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return -370196792;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Rule2";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.AbstractC31777mDn
        public C38307pTy valueOf() {
            return AhwBna;
        }

        private StateListAnimator() {
            super(null);
        }

        static {
            C38307pTy.Application application = C38307pTy.Companion;
            AhwBna = application.AEQbTJ(0);
            EZpvd = application.AEQbTJ(8);
            gEmmrt = application.AEQbTJ(8);
            int i = C38307pTy.AEQbTJ;
            OLrzqt = i | i | i;
        }

        @Override // o.AbstractC31777mDn
        public BigDecimal AEQbTJ() {
            return AbstractC31777mDn.Companion.KWHzl();
        }
    }

    /* JADX INFO: renamed from: o.mDn$Activity */
    public static final class Activity extends AbstractC31777mDn {
        public static final C38307pTy EZpvd;
        public static final int KWHzl;
        public static final Activity OLrzqt = new Activity();
        public static final C38307pTy gEmmrt;
        public static final C38307pTy valueOf;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.AbstractC31777mDn
        public java.lang.String EZpvd() {
            return "0.00000001";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.AbstractC31777mDn
        public C38307pTy copydefault() {
            return EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public C38307pTy djBIcL() {
            return valueOf;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Activity)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return -370196791;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Rule3";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.AbstractC31777mDn
        public C38307pTy valueOf() {
            return gEmmrt;
        }

        private Activity() {
            super(null);
        }

        static {
            C38307pTy.Application application = C38307pTy.Companion;
            gEmmrt = application.AEQbTJ(0);
            EZpvd = application.EZpvd(2);
            valueOf = application.AEQbTJ(8);
            int i = C38307pTy.AEQbTJ;
            KWHzl = i | i | i;
        }

        @Override // o.AbstractC31777mDn
        public BigDecimal AEQbTJ() {
            return AbstractC31777mDn.Companion.KWHzl();
        }

        @Override // o.AbstractC31777mDn
        public C38307pTy AEQbTJ(@NotNull BigDecimal bigDecimal) {
            Intrinsics.checkNotNullParameter(bigDecimal, "");
            return bigDecimal.abs().compareTo(AbstractC31777mDn.Companion.copydefault()) >= 0 ? copydefault() : djBIcL();
        }

        @Override // o.AbstractC31777mDn
        public int KWHzl(@NotNull BigDecimal bigDecimal) {
            Intrinsics.checkNotNullParameter(bigDecimal, "");
            return bigDecimal.abs().compareTo(AbstractC31777mDn.Companion.copydefault()) >= 0 ? 2 : 8;
        }
    }
}
