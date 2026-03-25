package o;

import com.google.android.exoplayer2.metadata.dvbsi.AppInfoTableDecoder;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.C33537myN;
import o.InterfaceC49405unt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qgR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C40886qgR implements InterfaceC49405unt<java.util.List<? extends C33537myN.ActionBar>, java.util.List<? extends C55276xgr>> {
    @yCM
    public C40886qgR() {
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

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Ljava/lang/Object;)Ljava/lang/Object; */
    public java.util.List<C55276xgr> OLrzqt(@NotNull java.util.List<? extends C33537myN.ActionBar> list) {
        return (java.util.List) InterfaceC49405unt.Activity.EZpvd(this, list);
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.InterfaceC49405unt
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public java.util.List<C55276xgr> AEQbTJ(@NotNull java.util.List<? extends C33537myN.ActionBar> list) {
        Intrinsics.checkNotNullParameter(list, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (C33537myN.ActionBar actionBar : list) {
            java.lang.String str = actionBar.copydefault;
            Intrinsics.checkNotNullExpressionValue(str, "");
            arrayList.add(new C55276xgr(str, actionBar, null, actionBar.OLrzqt, false, null, null, AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID, null));
        }
        return arrayList;
    }
}
