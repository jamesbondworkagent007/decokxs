package o;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Deferred;
import o.InterfaceC58536zG;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C58644zK implements InterfaceC58536zG {
    public static final C58644zK KWHzl = new C58644zK();
    public static final boolean EZpvd = true;

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
        return EZpvd;
    }

    private C58644zK() {
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.util.List<? extends kotlinx.coroutines.Deferred<java.lang.String>>, kotlin.Unit>] */
    @Override // o.InterfaceC56482yH
    public void EZpvd(@NotNull Function2<? super java.lang.String, ? super java.util.List<? extends Deferred<? extends java.lang.String>>, Unit> function2) {
        InterfaceC58536zG.TaskDescription.copydefault(this, function2);
    }

    /* JADX DEBUG: Method merged with bridge method: copydefault(Ljava/lang/String;)Ljava/lang/Object; */
    @Override // o.InterfaceC56482yH
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public Deferred<java.lang.String> copydefault(@NotNull java.lang.String str) {
        return InterfaceC58536zG.TaskDescription.AEQbTJ(this, str);
    }

    /* JADX DEBUG: Return type fixed from 'java.util.List<kotlinx.coroutines.Deferred<java.lang.String>>' to match base method */
    @Override // o.InterfaceC56482yH
    public java.util.List<Deferred<? extends java.lang.String>> KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return yDY.AhwBna();
    }

    @Override // o.InterfaceC56482yH
    public java.util.Set<java.lang.String> OLrzqt() {
        return yEE.copydefault();
    }

    /* JADX DEBUG: Return type fixed from 'java.util.Set<java.util.Map$Entry<java.lang.String, java.util.List<kotlinx.coroutines.Deferred<java.lang.String>>>>' to match base method */
    @Override // o.InterfaceC56482yH
    public java.util.Set<Map.Entry<java.lang.String, java.util.List<Deferred<? extends java.lang.String>>>> AEQbTJ() {
        return yEE.copydefault();
    }
}
