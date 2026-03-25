package o;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC58725zN;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C58698zM implements InterfaceC58725zN {
    public static final C58698zM OLrzqt = new C58698zM();
    public static final boolean copydefault = true;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC56482yH
    public boolean AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return false;
    }

    @Override // o.InterfaceC56482yH
    public boolean EZpvd() {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC56482yH
    public boolean KWHzl() {
        return copydefault;
    }

    private C58698zM() {
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.util.List<java.lang.String>, kotlin.Unit>] */
    @Override // o.InterfaceC56482yH
    public void EZpvd(@NotNull Function2<? super java.lang.String, ? super java.util.List<? extends java.lang.String>, Unit> function2) {
        InterfaceC58725zN.TaskDescription.EZpvd(this, function2);
    }

    /* JADX DEBUG: Method merged with bridge method: copydefault(Ljava/lang/String;)Ljava/lang/Object; */
    @Override // o.InterfaceC56482yH
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public java.lang.String copydefault(@NotNull java.lang.String str) {
        return InterfaceC58725zN.TaskDescription.AEQbTJ(this, str);
    }

    @Override // o.InterfaceC56482yH
    public java.util.List<java.lang.String> KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return yDY.AhwBna();
    }

    @Override // o.InterfaceC56482yH
    public java.util.Set<java.lang.String> OLrzqt() {
        return yEE.copydefault();
    }

    @Override // o.InterfaceC56482yH
    public java.util.Set<Map.Entry<java.lang.String, java.util.List<java.lang.String>>> AEQbTJ() {
        return yEE.copydefault();
    }
}
