package o;

import com.okinc.market.ext.UpDownColor;
import java.math.BigDecimal;
import kotlin.Triple;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC49405unt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qqI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C41407qqI implements InterfaceC49405unt<InterfaceC41583qtZ, Triple<? extends java.lang.CharSequence, ? extends UpDownColor, ? extends java.lang.CharSequence>> {
    public static final int EZpvd = 8;
    public final InterfaceC54577xNn OLrzqt;
    public final C41560qtC copydefault;

    @Override // o.InterfaceC49376unQ
    public boolean EZpvd() {
        return false;
    }

    @yCM
    public C41407qqI(InterfaceC54577xNn interfaceC54577xNn, @NotNull C41560qtC c41560qtC) {
        Intrinsics.checkNotNullParameter(c41560qtC, "");
        this.OLrzqt = interfaceC54577xNn;
        this.copydefault = c41560qtC;
    }

    @Override // o.InterfaceC49376unQ
    public <Input, Output> Output EZpvd(Input input, @NotNull Function1<? super Input, ? extends Output> function1) {
        return (Output) InterfaceC49405unt.Activity.OLrzqt(this, input, function1);
    }

    @Override // o.InterfaceC49376unQ
    public <Input, Output> java.lang.Object KWHzl(Input input, @NotNull Function2<? super Input, ? super Continuation<? super Output>, ? extends java.lang.Object> function2, @NotNull Continuation<? super Output> continuation) {
        return InterfaceC49405unt.Activity.EZpvd(this, input, function2, continuation);
    }

    /* JADX DEBUG: Method merged with bridge method: copydefault(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public Triple<java.lang.CharSequence, UpDownColor, java.lang.CharSequence> copydefault(@NotNull InterfaceC41583qtZ interfaceC41583qtZ) {
        return (Triple) InterfaceC49405unt.Activity.EZpvd(this, interfaceC41583qtZ);
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.InterfaceC49405unt
    public Triple<java.lang.CharSequence, UpDownColor, java.lang.CharSequence> AEQbTJ(@NotNull InterfaceC41583qtZ interfaceC41583qtZ) {
        InterfaceC54581xNr interfaceC54581xNrOLrzqt;
        Intrinsics.checkNotNullParameter(interfaceC41583qtZ, "");
        InterfaceC54577xNn interfaceC54577xNn = this.OLrzqt;
        if (interfaceC54577xNn == null || (interfaceC54581xNrOLrzqt = interfaceC54577xNn.OLrzqt()) == null) {
            return new Triple<>(null, null, null);
        }
        return C49380unU.copydefault((kotlin.Pair) this.copydefault.copydefault(interfaceC41583qtZ.copydefault()), OLrzqt(interfaceC54581xNrOLrzqt, interfaceC41583qtZ.KWHzl()));
    }

    public final java.lang.CharSequence OLrzqt(InterfaceC54581xNr interfaceC54581xNr, BigDecimal bigDecimal) {
        if (bigDecimal == null) {
            return null;
        }
        xMW xmwKWHzl = interfaceC54581xNr.KWHzl();
        java.lang.String plainString = bigDecimal.toPlainString();
        Intrinsics.checkNotNullExpressionValue(plainString, "");
        return C54536xML.toSafeString$default(xmwKWHzl.AYXKKw(plainString).values().AkhnZx().isConnected().djBIcL(), false, 1, null);
    }
}
