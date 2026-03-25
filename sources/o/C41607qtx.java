package o;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC49405unt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qtx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C41607qtx implements InterfaceC49405unt<Unit, java.lang.Boolean> {
    public static final int copydefault = 8;
    public final InterfaceC49494upc AEQbTJ;

    @Override // o.InterfaceC49376unQ
    public boolean EZpvd() {
        return false;
    }

    @yCM
    public C41607qtx(InterfaceC49494upc interfaceC49494upc) {
        this.AEQbTJ = interfaceC49494upc;
    }

    @Override // o.InterfaceC49376unQ
    public <Input, Output> Output EZpvd(Input input, @NotNull Function1<? super Input, ? extends Output> function1) {
        return (Output) InterfaceC49405unt.Activity.OLrzqt(this, input, function1);
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;)Ljava/lang/Object; */
    public java.lang.Boolean KWHzl(@NotNull Unit unit) {
        return (java.lang.Boolean) InterfaceC49405unt.Activity.EZpvd(this, unit);
    }

    @Override // o.InterfaceC49376unQ
    public <Input, Output> java.lang.Object KWHzl(Input input, @NotNull Function2<? super Input, ? super Continuation<? super Output>, ? extends java.lang.Object> function2, @NotNull Continuation<? super Output> continuation) {
        return InterfaceC49405unt.Activity.EZpvd(this, input, function2, continuation);
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.InterfaceC49405unt
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public java.lang.Boolean AEQbTJ(@NotNull Unit unit) {
        Intrinsics.checkNotNullParameter(unit, "");
        InterfaceC49494upc interfaceC49494upc = this.AEQbTJ;
        return java.lang.Boolean.valueOf(C41388qpq.KWHzl(interfaceC49494upc != null ? java.lang.Boolean.valueOf(interfaceC49494upc.EZpvd()) : null));
    }
}
