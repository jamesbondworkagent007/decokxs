package o;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC43264rlx;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rmh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C43301rmh implements InterfaceC43264rlx {
    public final InterfaceC56387yDm EZpvd;
    public InterfaceC43264rlx KWHzl;
    public final java.lang.String OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C43301rmh() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(InterfaceC43264rlx interfaceC43264rlx) {
        this.KWHzl = interfaceC43264rlx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC43264rlx copydefault() {
        return this.KWHzl;
    }

    public C43301rmh(java.lang.String str) {
        this.OLrzqt = str;
        this.EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.rmk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C43301rmh.copydefault(this.KWHzl);
            }
        });
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r1v0 java.lang.String))
 A[MD:(java.lang.String):void (m)] (LINE:13) call: o.rmh.<init>(java.lang.String):void type: THIS */
    public /* synthetic */ C43301rmh(java.lang.String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str);
    }

    @Override // o.InterfaceC43264rlx
    public int AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        return InterfaceC43264rlx.Activity.KWHzl(this, str, str2);
    }

    @Override // o.InterfaceC43264rlx
    public int EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        return InterfaceC43264rlx.Activity.OLrzqt(this, str, str2);
    }

    @Override // o.InterfaceC43264rlx
    public int EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.Throwable th) {
        return InterfaceC43264rlx.Activity.KWHzl(this, str, str2, th);
    }

    @Override // o.InterfaceC43264rlx
    public java.lang.String EZpvd(java.lang.Throwable th) {
        return InterfaceC43264rlx.Activity.EZpvd(this, th);
    }

    @Override // o.InterfaceC43264rlx
    public int KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        return InterfaceC43264rlx.Activity.EZpvd(this, str, str2);
    }

    @Override // o.InterfaceC43264rlx
    public int KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.Throwable th) {
        return InterfaceC43264rlx.Activity.OLrzqt(this, str, str2, th);
    }

    @Override // o.InterfaceC43264rlx
    public int OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        return InterfaceC43264rlx.Activity.copydefault(this, str, str2);
    }

    @Override // o.InterfaceC43264rlx
    public int OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.Throwable th) {
        return InterfaceC43264rlx.Activity.AEQbTJ(this, str, str2, th);
    }

    @Override // o.InterfaceC43264rlx
    public int copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        return InterfaceC43264rlx.Activity.AEQbTJ(this, str, str2);
    }

    public final C43300rmg KWHzl() {
        return (C43300rmg) this.EZpvd.getValue();
    }

    public static final C43300rmg copydefault(C43301rmh c43301rmh) {
        return new C43300rmg(c43301rmh.OLrzqt);
    }

    @Override // o.InterfaceC43264rlx
    public void KWHzl(boolean z) {
        OLrzqt().KWHzl(z);
    }

    @Override // o.InterfaceC43264rlx
    public int KWHzl(int i, @NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return OLrzqt().KWHzl(i, str, str2);
    }

    @Override // o.InterfaceC43216rlB
    public void init(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        OLrzqt().init(context);
    }

    @Override // o.InterfaceC43216rlB
    public boolean isInitialized() {
        return OLrzqt().isInitialized();
    }

    public final InterfaceC43264rlx OLrzqt() {
        InterfaceC43264rlx interfaceC43264rlx = this.KWHzl;
        return interfaceC43264rlx == null ? KWHzl() : interfaceC43264rlx;
    }
}
