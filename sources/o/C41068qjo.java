package o;

import com.okinc.unify_find.data.UpDownRank;
import java.math.BigDecimal;
import kotlin.Triple;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC49405unt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qjo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C41068qjo implements InterfaceC49405unt<UpDownRank, Triple<? extends java.lang.CharSequence, ? extends java.lang.CharSequence, ? extends java.lang.CharSequence>> {
    public final InterfaceC54577xNn EZpvd;

    @Override // o.InterfaceC49376unQ
    public boolean EZpvd() {
        return false;
    }

    @yCM
    public C41068qjo(InterfaceC54577xNn interfaceC54577xNn) {
        this.EZpvd = interfaceC54577xNn;
    }

    @Override // o.InterfaceC49376unQ
    public <Input, Output> Output EZpvd(Input input, @NotNull Function1<? super Input, ? extends Output> function1) {
        return (Output) InterfaceC49405unt.Activity.OLrzqt(this, input, function1);
    }

    @Override // o.InterfaceC49376unQ
    public <Input, Output> java.lang.Object KWHzl(Input input, @NotNull Function2<? super Input, ? super Continuation<? super Output>, ? extends java.lang.Object> function2, @NotNull Continuation<? super Output> continuation) {
        return InterfaceC49405unt.Activity.EZpvd(this, input, function2, continuation);
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public Triple<java.lang.CharSequence, java.lang.CharSequence, java.lang.CharSequence> OLrzqt(@NotNull UpDownRank upDownRank) {
        return (Triple) InterfaceC49405unt.Activity.EZpvd(this, upDownRank);
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.InterfaceC49405unt
    public Triple<java.lang.CharSequence, java.lang.CharSequence, java.lang.CharSequence> AEQbTJ(@NotNull UpDownRank upDownRank) {
        InterfaceC54581xNr interfaceC54581xNrOLrzqt;
        Intrinsics.checkNotNullParameter(upDownRank, "");
        InterfaceC54577xNn interfaceC54577xNn = this.EZpvd;
        if (interfaceC54577xNn == null || (interfaceC54581xNrOLrzqt = interfaceC54577xNn.OLrzqt()) == null) {
            return new Triple<>(null, null, null);
        }
        return new Triple<>(pTB.formatLocalized$default(upDownRank.getLastPrice(), null, 1, null), KWHzl(interfaceC54581xNrOLrzqt, java.lang.Double.valueOf(C33129mqd.AEQbTJ(upDownRank.getLastPrice()))), OLrzqt(interfaceC54581xNrOLrzqt, C33129mqd.EZpvd(upDownRank.getTurnOverV2())));
    }

    public final java.lang.CharSequence KWHzl(InterfaceC54581xNr interfaceC54581xNr, java.lang.Double d) {
        if (d == null) {
            return null;
        }
        d.doubleValue();
        return C54536xML.toSafeString$default(interfaceC54581xNr.KWHzl().AYXKKw(d.toString()).values().AkhnZx().isConnected().djBIcL(), false, 1, null);
    }

    public final java.lang.CharSequence OLrzqt(InterfaceC54581xNr interfaceC54581xNr, BigDecimal bigDecimal) {
        if (bigDecimal == null) {
            return null;
        }
        xMW xmwKWHzl = interfaceC54581xNr.KWHzl();
        java.lang.String plainString = bigDecimal.toPlainString();
        Intrinsics.checkNotNullExpressionValue(plainString, "");
        return xmwKWHzl.AYXKKw(plainString).EZpvd();
    }
}
