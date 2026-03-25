package o;

import androidx.camera.video.AudioStats;
import com.okinc.market.ext.UpDownColor;
import com.okinc.unify_trade.biz.SpotInstrument;
import java.math.BigDecimal;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC49405unt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qsT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C41524qsT implements InterfaceC49405unt<InterfaceC41641que, C41518qsN> {
    public final InterfaceC56387yDm KWHzl;
    public final InterfaceC54577xNn OLrzqt;
    public final C41560qtC copydefault;

    @Override // o.InterfaceC49376unQ
    public boolean EZpvd() {
        return false;
    }

    @yCM
    public C41524qsT(InterfaceC54577xNn interfaceC54577xNn, @NotNull C41560qtC c41560qtC) {
        Intrinsics.checkNotNullParameter(c41560qtC, "");
        this.OLrzqt = interfaceC54577xNn;
        this.copydefault = c41560qtC;
        this.KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.qsR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C41524qsT.KWHzl();
            }
        });
    }

    @Override // o.InterfaceC49376unQ
    public <Input, Output> Output EZpvd(Input input, @NotNull Function1<? super Input, ? extends Output> function1) {
        return (Output) InterfaceC49405unt.Activity.OLrzqt(this, input, function1);
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public C41518qsN KWHzl(@NotNull InterfaceC41641que interfaceC41641que) {
        return (C41518qsN) InterfaceC49405unt.Activity.EZpvd(this, interfaceC41641que);
    }

    @Override // o.InterfaceC49376unQ
    public <Input, Output> java.lang.Object KWHzl(Input input, @NotNull Function2<? super Input, ? super Continuation<? super Output>, ? extends java.lang.Object> function2, @NotNull Continuation<? super Output> continuation) {
        return InterfaceC49405unt.Activity.EZpvd(this, input, function2, continuation);
    }

    public final C54536xML AEQbTJ() {
        return (C54536xML) this.KWHzl.getValue();
    }

    public static final C54536xML KWHzl() {
        return new C54536xML();
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.InterfaceC49405unt
    public C41518qsN AEQbTJ(@NotNull InterfaceC41641que interfaceC41641que) {
        InterfaceC54581xNr interfaceC54581xNrOLrzqt;
        Intrinsics.checkNotNullParameter(interfaceC41641que, "");
        InterfaceC54577xNn interfaceC54577xNn = this.OLrzqt;
        if (interfaceC54577xNn == null || (interfaceC54581xNrOLrzqt = interfaceC54577xNn.OLrzqt()) == null) {
            return new C41518qsN(null, null, null, null, null, null);
        }
        kotlin.Pair pair = (kotlin.Pair) this.copydefault.copydefault(interfaceC41641que.KWHzl());
        return new C41518qsN((java.lang.String) pair.component1(), (UpDownColor) pair.component2(), OLrzqt(interfaceC54581xNrOLrzqt, interfaceC41641que.values(), interfaceC41641que.djBIcL()), KWHzl(interfaceC54581xNrOLrzqt, interfaceC41641que.AuCTel()), copydefault(interfaceC41641que.fIwbmz()), OLrzqt(interfaceC54581xNrOLrzqt, interfaceC41641que.fJNWhG()));
    }

    public final java.lang.CharSequence OLrzqt(InterfaceC54581xNr interfaceC54581xNr, SpotInstrument spotInstrument, java.lang.Double d) {
        C54536xML c54536xMLAYXKKw;
        C54536xML c54536xMLDjBIcL;
        if (d == null) {
            return null;
        }
        d.doubleValue();
        if (Intrinsics.EZpvd(d, AudioStats.AUDIO_AMPLITUDE_NONE)) {
            return null;
        }
        java.lang.String instFamily = spotInstrument.getInstFamily();
        AbstractC54531xLw abstractC54531xLwDjBIcL = interfaceC54581xNr.djBIcL("SPOT");
        xMS xmsGEmmrt = abstractC54531xLwDjBIcL != null ? abstractC54531xLwDjBIcL.gEmmrt(instFamily) : null;
        if (xmsGEmmrt == null || (c54536xMLAYXKKw = xmsGEmmrt.AYXKKw(d.toString())) == null || (c54536xMLDjBIcL = c54536xMLAYXKKw.djBIcL()) == null) {
            return null;
        }
        return C54536xML.toSafeString$default(c54536xMLDjBIcL, false, 1, null);
    }

    private final java.lang.CharSequence KWHzl(InterfaceC54581xNr interfaceC54581xNr, java.lang.Double d) {
        if (d == null) {
            return null;
        }
        d.doubleValue();
        return C54536xML.toSafeString$default(interfaceC54581xNr.KWHzl().AYXKKw(d.toString()).values().AkhnZx().isConnected().djBIcL(), false, 1, null);
    }

    public final java.lang.CharSequence copydefault(BigDecimal bigDecimal) {
        if (bigDecimal == null) {
            return null;
        }
        C54536xML c54536xMLAEQbTJ = AEQbTJ();
        java.lang.String plainString = bigDecimal.toPlainString();
        Intrinsics.checkNotNullExpressionValue(plainString, "");
        return c54536xMLAEQbTJ.OLrzqt(plainString);
    }

    private final java.lang.CharSequence OLrzqt(InterfaceC54581xNr interfaceC54581xNr, BigDecimal bigDecimal) {
        if (bigDecimal == null) {
            return null;
        }
        xMW xmwKWHzl = interfaceC54581xNr.KWHzl();
        java.lang.String plainString = bigDecimal.toPlainString();
        Intrinsics.checkNotNullExpressionValue(plainString, "");
        return xmwKWHzl.AYXKKw(plainString).EZpvd();
    }
}
