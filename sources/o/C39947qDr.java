package o;

import com.okinc.market.ext.UpDownColor;
import com.okinc.market.search.features.main.recommend.hot.data.po.SearchHotPo;
import java.math.BigDecimal;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import o.InterfaceC49403unr;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qDr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C39947qDr implements InterfaceC49403unr<C39994qFk, Unit> {
    @yCM
    public C39947qDr() {
    }

    /* JADX DEBUG: Method merged with bridge method: copydefault(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public java.lang.Object copydefault(@NotNull C39994qFk c39994qFk, @NotNull Continuation<? super Unit> continuation) {
        return InterfaceC49403unr.Application.KWHzl(this, c39994qFk, continuation);
    }

    @Override // o.InterfaceC49376unQ
    public <Input, Output> Output EZpvd(Input input, @NotNull Function1<? super Input, ? extends Output> function1) {
        return (Output) InterfaceC49403unr.Application.EZpvd(this, input, function1);
    }

    @Override // o.InterfaceC49376unQ
    public boolean EZpvd() {
        return InterfaceC49403unr.Application.copydefault(this);
    }

    @Override // o.InterfaceC49376unQ
    public <Input, Output> java.lang.Object KWHzl(Input input, @NotNull Function2<? super Input, ? super Continuation<? super Output>, ? extends java.lang.Object> function2, @NotNull Continuation<? super Output> continuation) {
        return InterfaceC49403unr.Application.KWHzl(this, input, function2, continuation);
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
    @Override // o.InterfaceC49403unr
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public java.lang.Object KWHzl(@NotNull C39994qFk c39994qFk, @NotNull Continuation<? super Unit> continuation) {
        java.lang.Object objAkhnZx = c39994qFk.AkhnZx();
        SearchHotPo searchHotPo = objAkhnZx instanceof SearchHotPo ? (SearchHotPo) objAkhnZx : null;
        if (searchHotPo == null) {
            return Unit.INSTANCE;
        }
        kotlin.Pair<java.lang.Double, java.lang.String> pairCopydefault = copydefault(searchHotPo);
        java.lang.String localized$default = searchHotPo.getCurrentPrice().length() == 0 ? "--" : pTB.formatLocalized$default(searchHotPo.getCurrentPrice(), null, 1, null);
        UpDownColor upDownColorAEQbTJ = UpDownColor.Companion.AEQbTJ(new BigDecimal(java.lang.String.valueOf(pairCopydefault.getFirst().doubleValue())));
        java.lang.String strAEQbTJ = pTF.KWHzl.AEQbTJ(pairCopydefault.getSecond());
        c39994qFk.AEQbTJ(localized$default);
        c39994qFk.EZpvd(strAEQbTJ);
        c39994qFk.AEQbTJ(upDownColorAEQbTJ);
        return Unit.INSTANCE;
    }

    public final kotlin.Pair<java.lang.Double, java.lang.String> copydefault(SearchHotPo searchHotPo) {
        return C55692xoj.calApplies$default(C55692xoj.KWHzl, searchHotPo.getCurrentPrice(), searchHotPo.getDayChange(), searchHotPo.getUtc0Change(), searchHotPo.getUtc8Change(), false, 16, null);
    }
}
