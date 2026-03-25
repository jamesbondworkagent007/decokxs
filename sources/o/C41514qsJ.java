package o;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import o.InterfaceC49405unt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qsJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C41514qsJ implements InterfaceC49405unt<Function0<? extends Unit>, kotlin.Pair<? extends java.lang.Boolean, ? extends androidx.fragment.app.Fragment>> {
    public final InterfaceC49497upf copydefault;

    @yCM
    public C41514qsJ(InterfaceC49497upf interfaceC49497upf) {
        this.copydefault = interfaceC49497upf;
    }

    @Override // o.InterfaceC49376unQ
    public <Input, Output> Output EZpvd(Input input, @NotNull Function1<? super Input, ? extends Output> function1) {
        return (Output) InterfaceC49405unt.Activity.OLrzqt(this, input, function1);
    }

    @Override // o.InterfaceC49376unQ
    public boolean EZpvd() {
        return InterfaceC49405unt.Activity.KWHzl(this);
    }

    @Override // o.InterfaceC49376unQ
    public <Input, Output> java.lang.Object KWHzl(Input input, @NotNull Function2<? super Input, ? super Continuation<? super Output>, ? extends java.lang.Object> function2, @NotNull Continuation<? super Output> continuation) {
        return InterfaceC49405unt.Activity.EZpvd(this, input, function2, continuation);
    }

    /* JADX DEBUG: Method merged with bridge method: EZpvd(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public kotlin.Pair<java.lang.Boolean, androidx.fragment.app.Fragment> EZpvd(Function0<Unit> function0) {
        return (kotlin.Pair) InterfaceC49405unt.Activity.EZpvd(this, function0);
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.InterfaceC49405unt
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public kotlin.Pair<java.lang.Boolean, androidx.fragment.app.Fragment> AEQbTJ(Function0<Unit> function0) {
        kotlin.Pair<java.lang.Boolean, androidx.fragment.app.Fragment> pair;
        xND xndAEQbTJ;
        InterfaceC49497upf interfaceC49497upf = this.copydefault;
        androidx.fragment.app.Fragment fragment = null;
        boolean zKWHzl = C41388qpq.KWHzl((interfaceC49497upf == null || (xndAEQbTJ = interfaceC49497upf.AEQbTJ()) == null) ? null : xndAEQbTJ.fetchVPNInfo());
        InterfaceC49497upf interfaceC49497upf2 = this.copydefault;
        if (interfaceC49497upf2 == null || (pair = interfaceC49497upf2.OLrzqt(function0)) == null) {
            pair = new kotlin.Pair<>(java.lang.Boolean.FALSE, null);
        }
        boolean zBooleanValue = pair.component1().booleanValue();
        androidx.fragment.app.Fragment fragmentComponent2 = pair.component2();
        if (zBooleanValue && fragmentComponent2 != null) {
            fragment = fragmentComponent2;
        }
        return C56390yDp.OLrzqt(java.lang.Boolean.valueOf(zKWHzl), fragment);
    }
}
