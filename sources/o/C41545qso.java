package o;

import com.okinc.market.ext.UpDownColor;
import com.okinc.trade.arch.util.Quartet;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC49405unt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qso, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C41545qso implements InterfaceC49405unt<InterfaceC41642quf, Quartet<? extends java.lang.CharSequence, ? extends java.lang.CharSequence, ? extends java.lang.CharSequence, ? extends UpDownColor>> {
    public static final int OLrzqt = 8;
    public final C41560qtC AEQbTJ;
    public final InterfaceC54577xNn EZpvd;

    @Override // o.InterfaceC49376unQ
    public boolean EZpvd() {
        return false;
    }

    @yCM
    public C41545qso(InterfaceC54577xNn interfaceC54577xNn, @NotNull C41560qtC c41560qtC) {
        Intrinsics.checkNotNullParameter(c41560qtC, "");
        this.EZpvd = interfaceC54577xNn;
        this.AEQbTJ = c41560qtC;
    }

    @Override // o.InterfaceC49376unQ
    public <Input, Output> Output EZpvd(Input input, @NotNull Function1<? super Input, ? extends Output> function1) {
        return (Output) InterfaceC49405unt.Activity.OLrzqt(this, input, function1);
    }

    @Override // o.InterfaceC49376unQ
    public <Input, Output> java.lang.Object KWHzl(Input input, @NotNull Function2<? super Input, ? super Continuation<? super Output>, ? extends java.lang.Object> function2, @NotNull Continuation<? super Output> continuation) {
        return InterfaceC49405unt.Activity.EZpvd(this, input, function2, continuation);
    }

    /* JADX DEBUG: Method merged with bridge method: EZpvd(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public Quartet<java.lang.CharSequence, java.lang.CharSequence, java.lang.CharSequence, UpDownColor> EZpvd(@NotNull InterfaceC41642quf interfaceC41642quf) {
        return (Quartet) InterfaceC49405unt.Activity.EZpvd(this, interfaceC41642quf);
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.InterfaceC49405unt
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public Quartet<java.lang.CharSequence, java.lang.CharSequence, java.lang.CharSequence, UpDownColor> AEQbTJ(@NotNull InterfaceC41642quf interfaceC41642quf) {
        InterfaceC54581xNr interfaceC54581xNrOLrzqt;
        AbstractC54531xLw abstractC54531xLwDjBIcL;
        Intrinsics.checkNotNullParameter(interfaceC41642quf, "");
        InterfaceC54577xNn interfaceC54577xNn = this.EZpvd;
        if (interfaceC54577xNn == null || (interfaceC54581xNrOLrzqt = interfaceC54577xNn.OLrzqt()) == null || (abstractC54531xLwDjBIcL = interfaceC54581xNrOLrzqt.djBIcL("OPTION")) == null) {
            return new Quartet<>(null, null, null, null);
        }
        java.lang.String strAEQbTJ2 = AEQbTJ2(interfaceC41642quf);
        java.lang.String strAEQbTJ = AEQbTJ(interfaceC41642quf, abstractC54531xLwDjBIcL);
        kotlin.Pair pair = (kotlin.Pair) this.AEQbTJ.copydefault(interfaceC41642quf.KWHzl());
        return new Quartet<>(strAEQbTJ2, strAEQbTJ, (java.lang.String) pair.component1(), (UpDownColor) pair.component2());
    }

    /* JADX INFO: renamed from: AEQbTJ, reason: avoid collision after fix types in other method */
    public final java.lang.String AEQbTJ2(InterfaceC41642quf interfaceC41642quf) {
        return pTB.formatLocalized$default(interfaceC41642quf.OLrzqt().getOptionStk(), null, 1, null);
    }

    public final java.lang.String AEQbTJ(InterfaceC41642quf interfaceC41642quf, AbstractC54531xLw abstractC54531xLw) {
        if (interfaceC41642quf.copydefault() != null) {
            return abstractC54531xLw.gEmmrt(interfaceC41642quf.OLrzqt().getInstFly()).values(java.lang.String.valueOf(interfaceC41642quf.copydefault()));
        }
        return null;
    }
}
