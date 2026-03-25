package o;

import com.okinc.market.quotation.ui.model.CategoryGroupVo;
import com.okinc.market.quotation.ui.model.ChargeGroupVo;
import com.okinc.market.quotation.ui.model.OptionsCategoryGroupVo;
import com.okinc.market.quotation.ui.model.OptionsDirection;
import com.okinc.market.quotation.ui.model.SortBy;
import com.okinc.market.quotation.ui.model.SortOrder;
import com.okinc.market.quotation.ui.model.dex.DexChainGroupVo;
import com.okinc.market.search.features.navigation.options.model.NavSearchOptionsQuotePageVo;
import com.okinc.trade.arch.util.Quartet;
import com.okinc.trade.arch.util.Quintet;
import java.util.LinkedList;
import kotlin.Triple;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.C40239qOm;
import o.InterfaceC49405unt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qOf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C40232qOf implements InterfaceC49405unt<Quintet<? extends java.lang.String, ? extends Quartet<? extends java.lang.String, ? extends java.util.List<? extends InterfaceC41641que>, ? extends java.util.List<? extends CategoryGroupVo>, ? extends java.util.List<? extends ChargeGroupVo>>, ? extends kotlin.Pair<? extends java.lang.String, ? extends C41467qrP>, ? extends Triple<? extends java.lang.String, ? extends java.util.Map<OptionsCategoryGroupVo, ? extends java.util.Map<java.lang.String, ? extends java.util.List<? extends InterfaceC41642quf>>>, ? extends java.lang.Integer>, ? extends Triple<? extends java.lang.String, ? extends java.util.List<? extends DexChainGroupVo>, ? extends java.util.List<? extends InterfaceC41655qus>>>, C40244qOr> {
    @yCM
    public C40232qOf() {
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // o.InterfaceC49405unt
    public /* bridge */ /* synthetic */ C40244qOr AEQbTJ(Quintet<? extends java.lang.String, ? extends Quartet<? extends java.lang.String, ? extends java.util.List<? extends InterfaceC41641que>, ? extends java.util.List<? extends CategoryGroupVo>, ? extends java.util.List<? extends ChargeGroupVo>>, ? extends kotlin.Pair<? extends java.lang.String, ? extends C41467qrP>, ? extends Triple<? extends java.lang.String, ? extends java.util.Map<OptionsCategoryGroupVo, ? extends java.util.Map<java.lang.String, ? extends java.util.List<? extends InterfaceC41642quf>>>, ? extends java.lang.Integer>, ? extends Triple<? extends java.lang.String, ? extends java.util.List<? extends DexChainGroupVo>, ? extends java.util.List<? extends InterfaceC41655qus>>> quintet) {
        return AEQbTJ2((Quintet<java.lang.String, ? extends Quartet<java.lang.String, ? extends java.util.List<? extends InterfaceC41641que>, ? extends java.util.List<CategoryGroupVo>, ? extends java.util.List<ChargeGroupVo>>, kotlin.Pair<java.lang.String, C41467qrP>, ? extends Triple<java.lang.String, ? extends java.util.Map<OptionsCategoryGroupVo, ? extends java.util.Map<java.lang.String, ? extends java.util.List<? extends InterfaceC41642quf>>>, java.lang.Integer>, ? extends Triple<java.lang.String, ? extends java.util.List<DexChainGroupVo>, ? extends java.util.List<? extends InterfaceC41655qus>>>) quintet);
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
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public C40244qOr OLrzqt(@NotNull Quintet<java.lang.String, ? extends Quartet<java.lang.String, ? extends java.util.List<? extends InterfaceC41641que>, ? extends java.util.List<CategoryGroupVo>, ? extends java.util.List<ChargeGroupVo>>, kotlin.Pair<java.lang.String, C41467qrP>, ? extends Triple<java.lang.String, ? extends java.util.Map<OptionsCategoryGroupVo, ? extends java.util.Map<java.lang.String, ? extends java.util.List<? extends InterfaceC41642quf>>>, java.lang.Integer>, ? extends Triple<java.lang.String, ? extends java.util.List<DexChainGroupVo>, ? extends java.util.List<? extends InterfaceC41655qus>>> quintet) {
        return (C40244qOr) InterfaceC49405unt.Activity.EZpvd(this, quintet);
    }

    /* JADX INFO: renamed from: AEQbTJ, reason: avoid collision after fix types in other method */
    public C40244qOr AEQbTJ2(@NotNull Quintet<java.lang.String, ? extends Quartet<java.lang.String, ? extends java.util.List<? extends InterfaceC41641que>, ? extends java.util.List<CategoryGroupVo>, ? extends java.util.List<ChargeGroupVo>>, kotlin.Pair<java.lang.String, C41467qrP>, ? extends Triple<java.lang.String, ? extends java.util.Map<OptionsCategoryGroupVo, ? extends java.util.Map<java.lang.String, ? extends java.util.List<? extends InterfaceC41642quf>>>, java.lang.Integer>, ? extends Triple<java.lang.String, ? extends java.util.List<DexChainGroupVo>, ? extends java.util.List<? extends InterfaceC41655qus>>> quintet) {
        Intrinsics.checkNotNullParameter(quintet, "");
        return KWHzl(quintet);
    }

    public final C40244qOr KWHzl(Quintet<java.lang.String, ? extends Quartet<java.lang.String, ? extends java.util.List<? extends InterfaceC41641que>, ? extends java.util.List<CategoryGroupVo>, ? extends java.util.List<ChargeGroupVo>>, kotlin.Pair<java.lang.String, C41467qrP>, ? extends Triple<java.lang.String, ? extends java.util.Map<OptionsCategoryGroupVo, ? extends java.util.Map<java.lang.String, ? extends java.util.List<? extends InterfaceC41642quf>>>, java.lang.Integer>, ? extends Triple<java.lang.String, ? extends java.util.List<DexChainGroupVo>, ? extends java.util.List<? extends InterfaceC41655qus>>> quintet) {
        C41467qrP second;
        kotlin.Pair<java.lang.String, C41467qrP> pairComponent3 = quintet.component3();
        Triple<java.lang.String, ? extends java.util.Map<OptionsCategoryGroupVo, ? extends java.util.Map<java.lang.String, ? extends java.util.List<? extends InterfaceC41642quf>>>, java.lang.Integer> tripleComponent4 = quintet.component4();
        C40239qOm.ActionBar.Application application = null;
        C40239qOm.ActionBar.C0923ActionBar c0923ActionBar = (pairComponent3 == null || (second = pairComponent3.getSecond()) == null || !second.gEmmrt()) ? null : new C40239qOm.ActionBar.C0923ActionBar(true);
        java.util.Map<OptionsCategoryGroupVo, ? extends java.util.Map<java.lang.String, ? extends java.util.List<? extends InterfaceC41642quf>>> second2 = tripleComponent4 != null ? tripleComponent4.getSecond() : null;
        if (second2 != null && !second2.isEmpty()) {
            application = new C40239qOm.ActionBar.Application(false, NavSearchOptionsQuotePageVo.Companion.KWHzl(second2), 0, 0, null, OptionsDirection.ALL, new kotlin.Pair(SortBy.NONE, SortOrder.NONE));
        }
        LinkedList linkedList = new LinkedList();
        if (c0923ActionBar != null) {
            linkedList.add(c0923ActionBar);
        }
        if (application != null) {
            linkedList.add(application);
        }
        return new C40244qOr(false, c0923ActionBar, application);
    }
}
