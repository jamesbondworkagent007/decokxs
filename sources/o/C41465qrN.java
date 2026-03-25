package o;

import com.okinc.market.ext.UpDownColor;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.FutureInstrument;
import com.okinc.unify_trade.biz.SwapInstrument;
import java.math.BigDecimal;
import kotlin.Triple;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC49405unt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qrN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C41465qrN implements InterfaceC49405unt<InterfaceC41638qub, C41461qrJ> {
    public final C41560qtC AEQbTJ;
    public final InterfaceC46553tYp EZpvd;
    public final qTB KWHzl;
    public final InterfaceC54577xNn OLrzqt;

    @Override // o.InterfaceC49376unQ
    public boolean EZpvd() {
        return false;
    }

    @yCM
    public C41465qrN(InterfaceC54577xNn interfaceC54577xNn, @NotNull qTB qtb, @NotNull InterfaceC46553tYp interfaceC46553tYp, @NotNull C41560qtC c41560qtC) {
        Intrinsics.checkNotNullParameter(qtb, "");
        Intrinsics.checkNotNullParameter(interfaceC46553tYp, "");
        Intrinsics.checkNotNullParameter(c41560qtC, "");
        this.OLrzqt = interfaceC54577xNn;
        this.KWHzl = qtb;
        this.EZpvd = interfaceC46553tYp;
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

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Ljava/lang/Object;)Ljava/lang/Object; */
    public C41461qrJ OLrzqt(@NotNull InterfaceC41638qub interfaceC41638qub) {
        return (C41461qrJ) InterfaceC49405unt.Activity.EZpvd(this, interfaceC41638qub);
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.InterfaceC49405unt
    /* JADX INFO: renamed from: AYXKKw, reason: merged with bridge method [inline-methods] */
    public C41461qrJ AEQbTJ(@NotNull InterfaceC41638qub interfaceC41638qub) {
        InterfaceC54581xNr interfaceC54581xNrOLrzqt;
        Intrinsics.checkNotNullParameter(interfaceC41638qub, "");
        InterfaceC54577xNn interfaceC54577xNn = this.OLrzqt;
        if (interfaceC54577xNn == null || (interfaceC54581xNrOLrzqt = interfaceC54577xNn.OLrzqt()) == null) {
            return new C41461qrJ(null, null, null, null, new kotlin.Pair(null, java.lang.Boolean.TRUE), null, null);
        }
        java.lang.CharSequence charSequenceCopydefault = copydefault(interfaceC41638qub);
        kotlin.Pair pair = (kotlin.Pair) this.AEQbTJ.copydefault(interfaceC41638qub.KWHzl());
        return new C41461qrJ(charSequenceCopydefault, (java.lang.String) pair.component1(), (UpDownColor) pair.component2(), EZpvd(interfaceC54581xNrOLrzqt, interfaceC41638qub.values(), interfaceC41638qub.AhwBna()), C56390yDp.OLrzqt(AEQbTJ(interfaceC54581xNrOLrzqt, interfaceC41638qub.values(), interfaceC41638qub.fIwbmz()), java.lang.Boolean.valueOf(KWHzl(interfaceC41638qub.values()))), KWHzl(interfaceC54581xNrOLrzqt, interfaceC41638qub.values(), interfaceC41638qub.AuCTel(), interfaceC41638qub.AhwBna()), EZpvd(interfaceC54581xNrOLrzqt, interfaceC41638qub.fARcdN()));
    }

    /* JADX INFO: renamed from: AEQbTJ, reason: avoid collision after fix types in other method */
    public static final java.lang.CharSequence AEQbTJ2(InterfaceC41638qub interfaceC41638qub) {
        return C54799xVt.getTitleByIdAndType$default(C54799xVt.AEQbTJ, interfaceC41638qub.values().getInstId(), interfaceC41638qub.values().getInstType(), false, false, null, false, null, 92, null);
    }

    public static final java.lang.CharSequence KWHzl(InterfaceC41638qub interfaceC41638qub) {
        return C54799xVt.getTitleByIdAndType$default(C54799xVt.AEQbTJ, interfaceC41638qub.values().getInstId(), interfaceC41638qub.values().getInstType(), false, false, 12, null);
    }

    public static final java.lang.CharSequence EZpvd(InterfaceC41638qub interfaceC41638qub) {
        return C59449zhJ.replace$default(interfaceC41638qub.values().getInstFamily(), "-", "", false, 4, (java.lang.Object) null);
    }

    public final java.lang.CharSequence copydefault(InterfaceC41638qub interfaceC41638qub) {
        BizInstrument bizInstrumentValues = interfaceC41638qub.values();
        if (bizInstrumentValues instanceof SwapInstrument) {
            return AEQbTJ2(interfaceC41638qub);
        }
        if (!(bizInstrumentValues instanceof FutureInstrument)) {
            return "";
        }
        if (interfaceC41638qub.values().isPreMarketPair()) {
            return EZpvd(interfaceC41638qub);
        }
        return KWHzl(interfaceC41638qub);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v10, resolved type: o.xLw */
    /* JADX DEBUG: Multi-variable search result rejected for r1v2, resolved type: o.xLw */
    /* JADX DEBUG: Multi-variable search result rejected for r1v5, resolved type: o.xLw */
    /* JADX DEBUG: Multi-variable search result rejected for r1v9, resolved type: o.xLw */
    /* JADX WARN: Multi-variable type inference failed */
    public final java.lang.CharSequence EZpvd(InterfaceC54581xNr interfaceC54581xNr, BizInstrument bizInstrument, java.lang.Double d) {
        AbstractC54531xLw abstractC54531xLwDjBIcL;
        if (d == null) {
            return null;
        }
        d.doubleValue();
        if (bizInstrument instanceof SwapInstrument) {
            abstractC54531xLwDjBIcL = interfaceC54581xNr.djBIcL("SWAP");
        } else {
            abstractC54531xLwDjBIcL = bizInstrument instanceof FutureInstrument ? interfaceC54581xNr.djBIcL("FUTURES") : 0;
        }
        if (abstractC54531xLwDjBIcL == 0) {
            return null;
        }
        java.lang.String instFamily = bizInstrument.getInstFamily();
        java.lang.String string = d.toString();
        if (bizInstrument.isPositiveContract()) {
            return C54536xML.toSafeString$default(abstractC54531xLwDjBIcL.gEmmrt(instFamily).AYXKKw(string).djBIcL(), false, 1, null);
        }
        if (abstractC54531xLwDjBIcL instanceof InterfaceC54532xLx) {
            return C54536xML.toSafeString$default(AEQbTJ(((InterfaceC54532xLx) abstractC54531xLwDjBIcL).copydefault(instFamily), interfaceC54581xNr).AYXKKw(string).values().AkhnZx().isConnected().djBIcL(), false, 1, null);
        }
        return null;
    }

    public final xMS AEQbTJ(xMS xms, InterfaceC54581xNr interfaceC54581xNr) {
        xOW newProxyInstance = interfaceC54581xNr.getNewProxyInstance();
        if ((newProxyInstance != null ? newProxyInstance.AEQbTJ("USD") : null) == null) {
            Triple<java.lang.String, java.lang.String, java.lang.Integer> tripleCopydefault = this.KWHzl.copydefault("USD");
            xms.KWHzl(tripleCopydefault.getFirst(), tripleCopydefault.getSecond(), java.lang.String.valueOf(tripleCopydefault.getThird().intValue()), tripleCopydefault.getFirst(), tripleCopydefault.getSecond(), java.lang.String.valueOf(tripleCopydefault.getThird().intValue()), true);
        }
        return xms;
    }

    public final java.lang.CharSequence AEQbTJ(InterfaceC54581xNr interfaceC54581xNr, BizInstrument bizInstrument, java.lang.Double d) {
        AbstractC54531xLw abstractC54531xLwDjBIcL;
        if (d == null) {
            return null;
        }
        d.doubleValue();
        if (bizInstrument instanceof SwapInstrument) {
            abstractC54531xLwDjBIcL = interfaceC54581xNr.djBIcL("SWAP");
        } else {
            abstractC54531xLwDjBIcL = bizInstrument instanceof FutureInstrument ? interfaceC54581xNr.djBIcL("FUTURES") : null;
        }
        if (abstractC54531xLwDjBIcL == null) {
            return null;
        }
        java.lang.String string = d.toString();
        if (Intrinsics.EZpvd(bizInstrument.isNegativeContract(), java.lang.Boolean.TRUE)) {
            return C54536xML.toSafeString$default(abstractC54531xLwDjBIcL.gEmmrt(bizInstrument.getInstFamily()).AYXKKw(string).values().AkhnZx().isConnected().djBIcL(), false, 1, null);
        }
        return interfaceC54581xNr.KWHzl().AYXKKw(string).values().AkhnZx().isConnected().djBIcL().EZpvd(true);
    }

    public final boolean KWHzl(BizInstrument bizInstrument) {
        java.lang.String upperCase = this.EZpvd.zLjUOn().getIsoCode().toUpperCase(java.util.Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "");
        return !Intrinsics.EZpvd((java.lang.Object) upperCase, (java.lang.Object) "USD") || bizInstrument.isPositiveContract();
    }

    public final java.lang.CharSequence KWHzl(InterfaceC54581xNr interfaceC54581xNr, BizInstrument bizInstrument, BigDecimal bigDecimal, java.lang.Double d) {
        AbstractC54531xLw abstractC54531xLwDjBIcL;
        if (bigDecimal == null) {
            return null;
        }
        if (bizInstrument instanceof SwapInstrument) {
            abstractC54531xLwDjBIcL = interfaceC54581xNr.djBIcL("SWAP");
        } else {
            abstractC54531xLwDjBIcL = bizInstrument instanceof FutureInstrument ? interfaceC54581xNr.djBIcL("FUTURES") : null;
        }
        if (abstractC54531xLwDjBIcL == null) {
            return null;
        }
        java.lang.String plainString = bigDecimal.toPlainString();
        C54571xNh c54571xNhAhwBna = AbstractC54531xLw.createTradeConverterWithIndex$default(abstractC54531xLwDjBIcL, bizInstrument.getInstFamily(), null, 2, null).AhwBna(C33129mqd.gEmmrt(d));
        Intrinsics.copydefault((java.lang.Object) plainString);
        C54536xML c54536xMLDjBIcL = c54571xNhAhwBna.djBIcL(plainString);
        java.lang.String strCopydefault = c54571xNhAhwBna.copydefault(plainString);
        if (strCopydefault == null) {
            strCopydefault = "";
        }
        return c54536xMLDjBIcL.OLrzqt(strCopydefault) + " " + c54536xMLDjBIcL.gEmmrt();
    }

    private final java.lang.CharSequence EZpvd(InterfaceC54581xNr interfaceC54581xNr, BigDecimal bigDecimal) {
        if (bigDecimal == null) {
            return null;
        }
        xMW xmwKWHzl = interfaceC54581xNr.KWHzl();
        java.lang.String plainString = bigDecimal.toPlainString();
        Intrinsics.checkNotNullExpressionValue(plainString, "");
        return xmwKWHzl.AYXKKw(plainString).EZpvd();
    }
}
