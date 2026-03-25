package o;

import android.icu.util.Calendar;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import o.InterfaceC49405unt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qgW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C40891qgW implements InterfaceC49405unt<java.lang.Long, java.lang.Boolean> {
    @yCM
    public C40891qgW() {
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // o.InterfaceC49405unt
    public /* synthetic */ java.lang.Boolean AEQbTJ(java.lang.Long l) {
        return EZpvd(l.longValue());
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

    public java.lang.Boolean OLrzqt(long j) {
        return (java.lang.Boolean) InterfaceC49405unt.Activity.EZpvd(this, java.lang.Long.valueOf(j));
    }

    public /* synthetic */ java.lang.Object OLrzqt(java.lang.Object obj) {
        return OLrzqt(((java.lang.Number) obj).longValue());
    }

    public java.lang.Boolean EZpvd(long j) {
        Calendar calendar = Calendar.getInstance();
        int i = calendar.get(1);
        int i2 = calendar.get(2);
        int i3 = calendar.get(5);
        calendar.setTimeInMillis(j);
        return java.lang.Boolean.valueOf(calendar.get(1) == i && calendar.get(2) == i2 && calendar.get(5) == i3);
    }
}
