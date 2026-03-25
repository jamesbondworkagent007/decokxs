package o;

import com.okinc.localization.util.format.DisplaySign;
import com.okinc.market.ext.UpDownColor;
import com.okinc.market.ranking.core.model.po.SearchHotPo;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.InterfaceC49405unt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qDt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C39949qDt implements InterfaceC49405unt<Triple<? extends C39994qFk, ? extends java.lang.Boolean, ? extends java.lang.Integer>, Unit> {
    @yCM
    public C39949qDt() {
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // o.InterfaceC49405unt
    public /* synthetic */ Unit AEQbTJ(Triple<? extends C39994qFk, ? extends java.lang.Boolean, ? extends java.lang.Integer> triple) {
        OLrzqt(triple);
        return Unit.INSTANCE;
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

    public /* bridge */ /* synthetic */ java.lang.Object copydefault(java.lang.Object obj) {
        copydefault((Triple<C39994qFk, java.lang.Boolean, java.lang.Integer>) obj);
        return Unit.INSTANCE;
    }

    public void copydefault(@NotNull Triple<C39994qFk, java.lang.Boolean, java.lang.Integer> triple) {
        InterfaceC49405unt.Activity.EZpvd(this, triple);
    }

    public void OLrzqt(@NotNull Triple<C39994qFk, java.lang.Boolean, java.lang.Integer> triple) {
        Intrinsics.checkNotNullParameter(triple, "");
        C39994qFk c39994qFkComponent1 = triple.component1();
        boolean zBooleanValue = triple.component2().booleanValue();
        int iIntValue = triple.component3().intValue();
        java.lang.Object objAkhnZx = c39994qFkComponent1.AkhnZx();
        SearchHotPo searchHotPo = objAkhnZx instanceof SearchHotPo ? (SearchHotPo) objAkhnZx : null;
        java.lang.String localized$default = (searchHotPo == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) searchHotPo.getLastPrice())) ? "--" : pTB.formatLocalized$default(searchHotPo.getLastPrice(), null, 1, null);
        UpDownColor upDownColorAEQbTJ = UpDownColor.Companion.AEQbTJ(searchHotPo != null ? searchHotPo.getChangePer() : null);
        java.lang.String iCUPercent$default = pTB.formatICUPercent$default(C33129mqd.EZpvd(searchHotPo != null ? searchHotPo.getChangePer() : null), null, null, DisplaySign.EXCEPT_ZERO, java.lang.Double.valueOf(100.0d), null, 19, null);
        c39994qFkComponent1.AEQbTJ(localized$default);
        c39994qFkComponent1.EZpvd(iCUPercent$default);
        c39994qFkComponent1.AEQbTJ(upDownColorAEQbTJ);
        c39994qFkComponent1.OLrzqt(iIntValue + 1);
        c39994qFkComponent1.copydefault(true);
        c39994qFkComponent1.gEmmrt(!zBooleanValue);
        c39994qFkComponent1.copydefault(pTB.formatICUCompact$default(C33129mqd.EZpvd(searchHotPo != null ? searchHotPo.getSearchCount() : null), null, C38307pTy.Companion.AEQbTJ(2), null, null, 13, null));
    }
}
