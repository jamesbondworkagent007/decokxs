package o;

import com.amplitude.android.AutocaptureOption;
import java.util.LinkedHashSet;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.Jj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C5221Jj {
    public static final Activity Companion = new Activity(null);
    public static final C5221Jj KWHzl = new C5221Jj(true, true, true, true);
    public static final C5221Jj copydefault = new C5221Jj(false, false, false, false);
    public final java.util.List<Function1<C5221Jj, Unit>> AEQbTJ;
    public boolean AYXKKw;
    public boolean AhwBna;
    public boolean EZpvd;
    public boolean OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C5221Jj() {
        this(false, false, false, false, 15, null);
    }

    public C5221Jj(boolean z, boolean z2, boolean z3, boolean z4) {
        this.AhwBna = z;
        this.OLrzqt = z2;
        this.EZpvd = z3;
        this.AYXKKw = z4;
        this.AEQbTJ = new java.util.ArrayList();
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? true : (r2v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0005: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? false : (r3v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? false : (r4v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0010: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? false : (r5v0 boolean))
 A[MD:(boolean, boolean, boolean, boolean):void (m)] (LINE:7) call: o.Jj.<init>(boolean, boolean, boolean, boolean):void type: THIS */
    public /* synthetic */ C5221Jj(boolean z, boolean z2, boolean z3, boolean z4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? false : z3, (i & 8) != 0 ? false : z4);
    }

    /* JADX INFO: renamed from: o.Jj$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.Jj.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public final java.util.Set<AutocaptureOption> AEQbTJ() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (this.AhwBna) {
            linkedHashSet.add(AutocaptureOption.SESSIONS);
        }
        if (this.OLrzqt) {
            linkedHashSet.add(AutocaptureOption.APP_LIFECYCLES);
        }
        if (this.EZpvd) {
            linkedHashSet.add(AutocaptureOption.DEEP_LINKS);
        }
        if (this.AYXKKw) {
            linkedHashSet.add(AutocaptureOption.SCREEN_VIEWS);
        }
        return linkedHashSet;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C5221Jj(@NotNull Function1<? super C5221Jj, Unit> function1) {
        this(false, false, false, false, 15, null);
        Intrinsics.checkNotNullParameter(function1, "");
        this.AEQbTJ.add(function1);
    }
}
