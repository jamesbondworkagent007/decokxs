package o;

import com.okinc.market.quotation.ui.model.CategoryGroupVo;
import com.okinc.market.search.features.navigation.coins.model.NavSearchCoinPageVo;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC49405unt;
import o.qPR;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class qOC implements InterfaceC49405unt<java.util.List<? extends CategoryGroupVo>, java.util.List<? extends qPR>> {
    public final C41607qtx EZpvd;
    public final InterfaceC54577xNn KWHzl;
    public final InterfaceC49497upf copydefault;

    @yCM
    public qOC(InterfaceC54577xNn interfaceC54577xNn, InterfaceC49497upf interfaceC49497upf, @NotNull C41607qtx c41607qtx) {
        Intrinsics.checkNotNullParameter(c41607qtx, "");
        this.KWHzl = interfaceC54577xNn;
        this.copydefault = interfaceC49497upf;
        this.EZpvd = c41607qtx;
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
    public java.util.List<qPR> OLrzqt(@NotNull java.util.List<CategoryGroupVo> list) {
        return (java.util.List) InterfaceC49405unt.Activity.EZpvd(this, list);
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.InterfaceC49405unt
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public java.util.List<qPR> AEQbTJ(@NotNull java.util.List<CategoryGroupVo> list) {
        int iIntValue;
        xND xndAEQbTJ;
        Intrinsics.checkNotNullParameter(list, "");
        InterfaceC54577xNn interfaceC54577xNn = this.KWHzl;
        int i = 0;
        boolean z = interfaceC54577xNn != null && interfaceC54577xNn.EZpvd();
        InterfaceC49497upf interfaceC49497upf = this.copydefault;
        boolean zEZpvd = (interfaceC49497upf == null || (xndAEQbTJ = interfaceC49497upf.AEQbTJ()) == null) ? false : Intrinsics.EZpvd(xndAEQbTJ.valueOf(), java.lang.Boolean.FALSE);
        boolean zBooleanValue = ((java.lang.Boolean) this.EZpvd.KWHzl((java.lang.Object) Unit.INSTANCE)).booleanValue();
        java.util.List listOLrzqt = C56402yEa.OLrzqt();
        if (!z && (!zEZpvd)) {
            listOLrzqt.add(qPR.ActionBar.AEQbTJ);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new qPR.Application(new NavSearchCoinPageVo((CategoryGroupVo) it.next())));
        }
        listOLrzqt.addAll(arrayList);
        if (zBooleanValue) {
            java.util.Iterator it2 = listOLrzqt.iterator();
            int i2 = 0;
            while (true) {
                iIntValue = -1;
                if (!it2.hasNext()) {
                    i2 = -1;
                    break;
                }
                qPR qpr = (qPR) it2.next();
                if ((qpr instanceof qPR.Application) && ((qPR.Application) qpr).AEQbTJ().EZpvd()) {
                    break;
                }
                i2++;
            }
            java.lang.Integer numValueOf = java.lang.Integer.valueOf(i2);
            if (numValueOf.intValue() < 0) {
                numValueOf = null;
            }
            if (numValueOf != null) {
                iIntValue = numValueOf.intValue();
            } else {
                java.util.Iterator it3 = listOLrzqt.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        break;
                    }
                    qPR qpr2 = (qPR) it3.next();
                    if ((qpr2 instanceof qPR.Application) && ((qPR.Application) qpr2).AEQbTJ().copydefault()) {
                        iIntValue = i;
                        break;
                    }
                    i++;
                }
            }
            if (iIntValue >= 0) {
                listOLrzqt.add(iIntValue + 1, qPR.TaskDescription.copydefault);
            }
        }
        return C56402yEa.fARcdN(listOLrzqt);
    }
}
