package o;

import com.okinc.market.quotation.ui.model.CategoryGroupVo;
import com.okinc.market.quotation.ui.model.ChargeGroupVo;
import com.okinc.unify_trade.biz.SpotInstrument;
import com.okinc.unify_trade.biz.TradeCoinInfo;
import kotlin.Triple;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC49405unt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qsO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C41519qsO implements InterfaceC49405unt<Triple<? extends CategoryGroupVo, ? extends ChargeGroupVo, ? extends java.util.List<? extends InterfaceC41641que>>, java.util.List<? extends InterfaceC41641que>> {
    public final InterfaceC54577xNn OLrzqt;
    private static final TaskDescription Companion = new TaskDescription(null);
    public static final int AEQbTJ = 8;

    @yCM
    public C41519qsO(InterfaceC54577xNn interfaceC54577xNn) {
        this.OLrzqt = interfaceC54577xNn;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // o.InterfaceC49405unt
    public /* bridge */ /* synthetic */ java.util.List<? extends InterfaceC41641que> AEQbTJ(Triple<? extends CategoryGroupVo, ? extends ChargeGroupVo, ? extends java.util.List<? extends InterfaceC41641que>> triple) {
        return AEQbTJ2((Triple<CategoryGroupVo, ChargeGroupVo, ? extends java.util.List<? extends InterfaceC41641que>>) triple);
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

    /* JADX DEBUG: Method merged with bridge method: copydefault(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public java.util.List<InterfaceC41641que> copydefault(@NotNull Triple<CategoryGroupVo, ChargeGroupVo, ? extends java.util.List<? extends InterfaceC41641que>> triple) {
        return (java.util.List) InterfaceC49405unt.Activity.EZpvd(this, triple);
    }

    /* JADX INFO: renamed from: o.qsO$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.qsO.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    /* JADX INFO: renamed from: AEQbTJ, reason: avoid collision after fix types in other method */
    public java.util.List<InterfaceC41641que> AEQbTJ2(@NotNull Triple<CategoryGroupVo, ChargeGroupVo, ? extends java.util.List<? extends InterfaceC41641que>> triple) {
        InterfaceC54581xNr interfaceC54581xNrOLrzqt;
        final java.util.HashMap<java.lang.String, TradeCoinInfo> mapDjBIcL;
        Intrinsics.checkNotNullParameter(triple, "");
        InterfaceC54577xNn interfaceC54577xNn = this.OLrzqt;
        if (interfaceC54577xNn == null || (interfaceC54581xNrOLrzqt = interfaceC54577xNn.OLrzqt()) == null || (mapDjBIcL = interfaceC54581xNrOLrzqt.djBIcL()) == null) {
            return null;
        }
        final CategoryGroupVo categoryGroupVoComponent1 = triple.component1();
        final ChargeGroupVo chargeGroupVoComponent2 = triple.component2();
        java.util.List<? extends InterfaceC41641que> listComponent3 = triple.component3();
        C41434qqj c41434qqj = C41434qqj.KWHzl;
        c41434qqj.KWHzl("FilterSpotVosUseCase", "filter spot vos, category=" + categoryGroupVoComponent1 + ", charge=" + chargeGroupVoComponent2 + ", inputSize=" + listComponent3.size());
        java.util.List<InterfaceC41641que> listKWHzl = C41389qpr.KWHzl(listComponent3, new Function1() { // from class: o.qsQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(C41519qsO.AEQbTJ(this.EZpvd, mapDjBIcL, categoryGroupVoComponent1, chargeGroupVoComponent2, (InterfaceC41641que) obj));
            }
        });
        int size = listKWHzl.size();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("filter spot vos result: ");
        sb.append(size);
        sb.append(" items");
        c41434qqj.KWHzl("FilterSpotVosUseCase", sb.toString());
        return listKWHzl;
    }

    public static final boolean AEQbTJ(C41519qsO c41519qsO, java.util.Map map, CategoryGroupVo categoryGroupVo, ChargeGroupVo chargeGroupVo, InterfaceC41641que interfaceC41641que) {
        Intrinsics.checkNotNullParameter(interfaceC41641que, "");
        return c41519qsO.AEQbTJ(interfaceC41641que.values(), map, categoryGroupVo) && c41519qsO.AEQbTJ(interfaceC41641que.values(), chargeGroupVo);
    }

    public final boolean AEQbTJ(SpotInstrument spotInstrument, java.util.Map<java.lang.String, TradeCoinInfo> map, CategoryGroupVo categoryGroupVo) {
        java.util.ArrayList<java.lang.String> groups;
        CategoryGroupVo.TaskDescription taskDescription = CategoryGroupVo.Companion;
        if (Intrinsics.EZpvd(categoryGroupVo, taskDescription.KWHzl()) || Intrinsics.EZpvd(categoryGroupVo, taskDescription.EZpvd()) || Intrinsics.EZpvd(categoryGroupVo, taskDescription.AEQbTJ()) || Intrinsics.EZpvd(categoryGroupVo, taskDescription.djBIcL())) {
            return true;
        }
        TradeCoinInfo tradeCoinInfo = map.get(spotInstrument.getBaseCcy());
        return C41388qpq.KWHzl((tradeCoinInfo == null || (groups = tradeCoinInfo.getGroups()) == null) ? null : java.lang.Boolean.valueOf(CollectionsKt___CollectionsKt.KWHzl((java.lang.Iterable<? extends java.lang.String>) ((java.lang.Iterable<? extends java.lang.Object>) groups), categoryGroupVo.gEmmrt().getId())));
    }

    public final boolean AEQbTJ(SpotInstrument spotInstrument, ChargeGroupVo chargeGroupVo) {
        if (chargeGroupVo == null) {
            return true;
        }
        if (Intrinsics.EZpvd(chargeGroupVo, ChargeGroupVo.Companion.KWHzl())) {
            return false;
        }
        return chargeGroupVo.OLrzqt().getTypes().contains(spotInstrument.getQuoteCcy());
    }
}
