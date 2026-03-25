package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yXg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C56921yXg extends yWQ {
    public static final C56921yXg AYXKKw;
    public static final Activity EZpvd = new Activity(null);
    public static final C56921yXg KWHzl;
    public static final C56921yXg copydefault;
    public final boolean values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean EZpvd() {
        return this.values;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C56921yXg(@NotNull int[] iArr, boolean z) {
        super(java.util.Arrays.copyOf(iArr, iArr.length));
        Intrinsics.checkNotNullParameter(iArr, "");
        this.values = z;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C56921yXg(@NotNull int... iArr) {
        this(iArr, false);
        Intrinsics.checkNotNullParameter(iArr, "");
    }

    public final C56921yXg AEQbTJ(boolean z) {
        C56921yXg c56921yXg = z ? KWHzl : copydefault;
        return c56921yXg.copydefault(this) ? c56921yXg : this;
    }

    public final boolean EZpvd(@NotNull C56921yXg c56921yXg) {
        Intrinsics.checkNotNullParameter(c56921yXg, "");
        if (OLrzqt() == 2 && copydefault() == 0) {
            C56921yXg c56921yXg2 = KWHzl;
            if (c56921yXg2.OLrzqt() == 1 && c56921yXg2.copydefault() == 8) {
                return true;
            }
        }
        return AEQbTJ(c56921yXg.AEQbTJ(this.values));
    }

    public final boolean AEQbTJ(C56921yXg c56921yXg) {
        if ((OLrzqt() == 1 && copydefault() == 0) || OLrzqt() == 0) {
            return false;
        }
        return !copydefault(c56921yXg);
    }

    public final C56921yXg AEQbTJ() {
        return (OLrzqt() == 1 && copydefault() == 9) ? new C56921yXg(2, 0, 0) : new C56921yXg(OLrzqt(), copydefault() + 1, 0);
    }

    public final boolean copydefault(C56921yXg c56921yXg) {
        return OLrzqt() > c56921yXg.OLrzqt() || (OLrzqt() >= c56921yXg.OLrzqt() && copydefault() > c56921yXg.copydefault());
    }

    /* JADX INFO: renamed from: o.yXg$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.yXg.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    static {
        C56921yXg c56921yXg = new C56921yXg(2, 1, 0);
        KWHzl = c56921yXg;
        copydefault = c56921yXg.AEQbTJ();
        AYXKKw = new C56921yXg(new int[0]);
    }
}
