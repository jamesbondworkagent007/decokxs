package o;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC43294rma;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.hvQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@yCR
public final class C23287hvQ extends AbstractC43215rlA implements gKN {
    public final jAL AEQbTJ;
    public final InterfaceC29443ktj AYXKKw;
    public final C28603kdr AhwBna;
    public final C28586kda EZpvd;
    public final jAK KWHzl;
    public final jAF OLrzqt;
    public final C25640jAx copydefault;

    @yCM
    public C23287hvQ(@NotNull C28586kda c28586kda, @NotNull C28603kdr c28603kdr, @NotNull jAL jal, @NotNull jAK jak, @NotNull jAF jaf, @NotNull C25640jAx c25640jAx, @NotNull InterfaceC29443ktj interfaceC29443ktj) {
        Intrinsics.checkNotNullParameter(c28586kda, "");
        Intrinsics.checkNotNullParameter(c28603kdr, "");
        Intrinsics.checkNotNullParameter(jal, "");
        Intrinsics.checkNotNullParameter(jak, "");
        Intrinsics.checkNotNullParameter(jaf, "");
        Intrinsics.checkNotNullParameter(c25640jAx, "");
        Intrinsics.checkNotNullParameter(interfaceC29443ktj, "");
        this.EZpvd = c28586kda;
        this.AhwBna = c28603kdr;
        this.AEQbTJ = jal;
        this.KWHzl = jak;
        this.OLrzqt = jaf;
        this.copydefault = c25640jAx;
        this.AYXKKw = interfaceC29443ktj;
    }

    @Override // o.gKN
    public java.lang.Object EZpvd(@NotNull android.content.Context context, @NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull java.lang.String str, boolean z, Function1<? super java.lang.Boolean, Unit> function1, @NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
        java.lang.Object objCopydefault = jAT.copydefault(this.EZpvd, this.AhwBna, this.AEQbTJ, this.KWHzl, this.OLrzqt, this.copydefault, context, fragmentManager, str, (Function1<? super java.lang.Boolean, Unit>) function1, (1024 & 1024) != 0, (Continuation<? super Unit>) continuation);
        return objCopydefault == C56442yFn.copydefault() ? objCopydefault : Unit.INSTANCE;
    }

    @Override // o.gKN
    public java.lang.Object KWHzl(@NotNull android.content.Context context, @NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull java.lang.String str, boolean z, Function1<? super java.lang.Boolean, Unit> function1, @NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
        java.lang.Object objEZpvd = jAT.EZpvd(this.EZpvd, this.AhwBna, this.AEQbTJ, this.KWHzl, this.OLrzqt, this.copydefault, context, fragmentManager, str, z, function1, continuation);
        return objEZpvd == C56442yFn.copydefault() ? objEZpvd : Unit.INSTANCE;
    }

    @Override // o.gKN
    public java.lang.Object AEQbTJ(@NotNull android.content.Context context, @NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull java.lang.String str, @NotNull java.lang.String str2, Function1<? super java.lang.String, Unit> function1, @NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
        java.lang.Object objCopydefault = jAT.copydefault(this.EZpvd, this.AhwBna, context, fragmentManager, str, str2, function1, continuation);
        return objCopydefault == C56442yFn.copydefault() ? objCopydefault : Unit.INSTANCE;
    }

    @Override // o.gKN
    public java.lang.Object EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull Continuation<? super Unit> continuation) {
        java.lang.Object objKWHzl = this.AYXKKw.KWHzl(str, str2, continuation);
        return objKWHzl == C56442yFn.copydefault() ? objKWHzl : Unit.INSTANCE;
    }

    @Override // o.gKN
    public boolean KWHzl(@NotNull android.content.Context context, boolean z) {
        Intrinsics.checkNotNullParameter(context, "");
        return C26233jWw.copydefault.copydefault(z);
    }

    @Override // o.gKN
    public boolean EZpvd() {
        return C26233jWw.copydefault.OLrzqt();
    }

    @Override // o.gKN
    public void AEQbTJ(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        gKZ gkz = gKZ.EZpvd;
        InterfaceC43294rma.Application.processDeeplink$default((InterfaceC43294rma) C43251rlk.copydefault(InterfaceC43294rma.class), context, gkz.OLrzqt(gkz.AEQbTJ("dex/market/smart-money"), C56390yDp.OLrzqt("tab", "ranking"), C56390yDp.OLrzqt("instant", java.lang.Boolean.TRUE)), null, new Function1() { // from class: o.hvR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C23287hvQ.EZpvd((AbstractC43238rlX) obj);
            }
        }, 4, null);
    }

    public static final Unit EZpvd(AbstractC43238rlX abstractC43238rlX) {
        Intrinsics.checkNotNullParameter(abstractC43238rlX, "");
        return Unit.INSTANCE;
    }

    @Override // o.gKN
    public float EZpvd(float f, float f2, float f3) {
        return C29156koN.KWHzl(f, f2, f3);
    }

    @Override // o.gKN
    public float EZpvd(float f, float f2) {
        return C29156koN.EZpvd(f, f2);
    }
}
