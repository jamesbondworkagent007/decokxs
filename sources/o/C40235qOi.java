package o;

import com.okinc.kyc.api.biz.restriction.OKComplianceRestrictionService;
import com.okinc.market.quotation.ui.model.CategoryGroupVo;
import com.okinc.market.quotation.ui.model.ChargeGroupVo;
import com.okinc.market.quotation.ui.model.OptionsCategoryGroupVo;
import com.okinc.trade.arch.util.Quartet;
import java.util.LinkedList;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C40239qOm;
import o.InterfaceC49404uns;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qOi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public class C40235qOi implements InterfaceC49404uns<C40229qOc, java.util.List<? extends InterfaceC40237qOk>> {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int KWHzl = 8;
    public final OKComplianceRestrictionService AEQbTJ;
    public final InterfaceC54577xNn AYXKKw;
    public final C41607qtx copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
    @Override // o.InterfaceC49404uns, o.InterfaceC49403unr
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public java.lang.Object KWHzl(@NotNull C40229qOc c40229qOc, @NotNull Continuation<? super java.util.List<? extends InterfaceC40237qOk>> continuation) {
        return copydefault(this, c40229qOc, continuation);
    }

    @yCM
    public C40235qOi(InterfaceC54577xNn interfaceC54577xNn, @NotNull OKComplianceRestrictionService oKComplianceRestrictionService, @NotNull C41607qtx c41607qtx) {
        Intrinsics.checkNotNullParameter(oKComplianceRestrictionService, "");
        Intrinsics.checkNotNullParameter(c41607qtx, "");
        this.AYXKKw = interfaceC54577xNn;
        this.AEQbTJ = oKComplianceRestrictionService;
        this.copydefault = c41607qtx;
    }

    @Override // o.InterfaceC49376unQ
    public <Input, Output> Output EZpvd(Input input, @NotNull Function1<? super Input, ? extends Output> function1) {
        return (Output) InterfaceC49404uns.Activity.OLrzqt(this, input, function1);
    }

    @Override // o.InterfaceC49376unQ
    public boolean EZpvd() {
        return InterfaceC49404uns.Activity.copydefault(this);
    }

    @Override // o.InterfaceC49376unQ
    public <Input, Output> java.lang.Object KWHzl(Input input, @NotNull Function2<? super Input, ? super Continuation<? super Output>, ? extends java.lang.Object> function2, @NotNull Continuation<? super Output> continuation) {
        return InterfaceC49404uns.Activity.KWHzl(this, input, function2, continuation);
    }

    public java.lang.Object KWHzl(@NotNull C40229qOc c40229qOc, @NotNull Continuation<? super java.util.List<? extends InterfaceC40237qOk>> continuation) {
        return InterfaceC49404uns.Activity.EZpvd(this, c40229qOc, continuation);
    }

    public /* synthetic */ java.lang.Object copydefault(java.lang.Object obj, Continuation continuation) {
        return KWHzl((C40229qOc) obj, (Continuation<? super java.util.List<? extends InterfaceC40237qOk>>) continuation);
    }

    /* JADX INFO: renamed from: o.qOi$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.qOi.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    public static /* synthetic */ java.lang.Object copydefault(C40235qOi c40235qOi, C40229qOc c40229qOc, Continuation<? super java.util.List<? extends InterfaceC40237qOk>> continuation) {
        InterfaceC54581xNr interfaceC54581xNrOLrzqt;
        xOW newProxyInstance;
        C40375qTn c40375qTn = C40375qTn.AEQbTJ;
        c40375qTn.copydefault("AssembleNavSearchResultUseCase", "onExecute() input: " + c40229qOc);
        Quartet<java.lang.String, java.util.List<InterfaceC41641que>, java.util.List<CategoryGroupVo>, java.util.List<ChargeGroupVo>> quartetCopydefault = c40229qOc.copydefault();
        Triple<java.lang.String, java.util.Map<OptionsCategoryGroupVo, java.util.Map<java.lang.String, java.util.List<InterfaceC41642quf>>>, java.lang.Integer> tripleKWHzl = c40229qOc.KWHzl();
        kotlin.Pair<java.util.List<InterfaceC40237qOk>, java.lang.Boolean> pairOLrzqt = c40229qOc.OLrzqt();
        kotlin.Pair<java.util.List<InterfaceC40237qOk>, C40239qOm.ActionBar.C0923ActionBar> pairAEQbTJ = c40229qOc.AEQbTJ();
        kotlin.Pair<java.util.List<InterfaceC40237qOk>, C40239qOm.ActionBar.Application> pairEZpvd = c40229qOc.EZpvd();
        java.util.List<InterfaceC40237qOk> listDjBIcL = c40229qOc.djBIcL();
        java.util.List<InterfaceC40237qOk> listComponent1 = pairOLrzqt.component1();
        boolean zBooleanValue = pairOLrzqt.component2().booleanValue();
        java.util.List<InterfaceC40237qOk> listComponent12 = pairAEQbTJ.component1();
        C40239qOm.ActionBar.C0923ActionBar c0923ActionBarComponent2 = pairAEQbTJ.component2();
        java.util.List<InterfaceC40237qOk> listComponent13 = pairEZpvd.component1();
        C40239qOm.ActionBar.Application applicationComponent2 = pairEZpvd.component2();
        InterfaceC54577xNn interfaceC54577xNn = c40235qOi.AYXKKw;
        boolean zKWHzl = C41388qpq.KWHzl((interfaceC54577xNn == null || (interfaceC54581xNrOLrzqt = interfaceC54577xNn.OLrzqt()) == null || (newProxyInstance = interfaceC54581xNrOLrzqt.getNewProxyInstance()) == null) ? null : C56443yFo.KWHzl(newProxyInstance.zuBGHE()));
        boolean z = !c40235qOi.AEQbTJ.AEQbTJ(OKComplianceRestrictionService.CefiMode.PRO);
        boolean zBooleanValue2 = ((java.lang.Boolean) c40235qOi.copydefault.KWHzl((java.lang.Object) Unit.INSTANCE)).booleanValue();
        c40375qTn.copydefault("AssembleNavSearchResultUseCase", "onExecute() - account settings: isTradingAccount=" + zKWHzl + ", isProModeHidden=" + z);
        LinkedList<InterfaceC40237qOk> linkedListOLrzqt = c40235qOi.OLrzqt(new LinkedList<>(), quartetCopydefault, listComponent1, zBooleanValue, tripleKWHzl, zKWHzl, z, listComponent12, listComponent13, c0923ActionBarComponent2, applicationComponent2, zBooleanValue2, listDjBIcL);
        c40375qTn.copydefault("AssembleNavSearchResultUseCase", "onExecute() completed, result size: " + linkedListOLrzqt.size());
        return linkedListOLrzqt;
    }

    public LinkedList<InterfaceC40237qOk> OLrzqt(@NotNull LinkedList<InterfaceC40237qOk> linkedList, Quartet<java.lang.String, ? extends java.util.List<? extends InterfaceC41641que>, ? extends java.util.List<CategoryGroupVo>, ? extends java.util.List<ChargeGroupVo>> quartet, @NotNull java.util.List<? extends InterfaceC40237qOk> list, boolean z, Triple<java.lang.String, ? extends java.util.Map<OptionsCategoryGroupVo, ? extends java.util.Map<java.lang.String, ? extends java.util.List<? extends InterfaceC41642quf>>>, java.lang.Integer> triple, boolean z2, boolean z3, @NotNull java.util.List<? extends InterfaceC40237qOk> list2, @NotNull java.util.List<? extends InterfaceC40237qOk> list3, C40239qOm.ActionBar.C0923ActionBar c0923ActionBar, C40239qOm.ActionBar.Application application, boolean z4, @NotNull java.util.List<? extends InterfaceC40237qOk> list4) {
        java.util.Map<OptionsCategoryGroupVo, ? extends java.util.Map<java.lang.String, ? extends java.util.List<? extends InterfaceC41642quf>>> second;
        java.util.List<? extends InterfaceC41641que> second2;
        Intrinsics.checkNotNullParameter(linkedList, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(list3, "");
        Intrinsics.checkNotNullParameter(list4, "");
        C40375qTn c40375qTn = C40375qTn.AEQbTJ;
        c40375qTn.copydefault("AssembleNavSearchResultUseCase", "onExecute() - adding spot part");
        EZpvd(linkedList, (quartet == null || (second2 = quartet.getSecond()) == null) ? 0 : second2.size(), list, z);
        if (triple != null && (second = triple.getSecond()) != null) {
            c40375qTn.copydefault("AssembleNavSearchResultUseCase", "onExecute() - adding simple options part");
            copydefault(linkedList, second);
        }
        if (!z2) {
            c40375qTn.copydefault("AssembleNavSearchResultUseCase", "onExecute() - adding futures and options quote part");
            KWHzl(linkedList, list2, list3, c0923ActionBar, application);
        } else if (!z3) {
            c40375qTn.copydefault("AssembleNavSearchResultUseCase", "onExecute() - adding account upgrade part");
            EZpvd(linkedList);
        }
        if (z4) {
            OLrzqt(linkedList, list4);
        }
        if (CollectionsKt___CollectionsKt.wlaJM(linkedList) instanceof C40238qOl) {
            linkedList.removeLast();
        }
        return linkedList;
    }

    public final void EZpvd(@NotNull LinkedList<InterfaceC40237qOk> linkedList, int i, @NotNull java.util.List<? extends InterfaceC40237qOk> list, boolean z) {
        Intrinsics.checkNotNullParameter(linkedList, "");
        Intrinsics.checkNotNullParameter(list, "");
        C40375qTn.AEQbTJ.copydefault("AssembleNavSearchResultUseCase", "addSpotPart() allSpotListCount: " + i + " spotVoList: " + list.size() + ", isAllowSpot: " + z);
        if (!list.isEmpty()) {
            linkedList.add(C40246qOt.OLrzqt);
            if (z) {
                linkedList.addAll(list);
            } else {
                linkedList.addAll(CollectionsKt___CollectionsKt.AhwBna((java.lang.Iterable) list, 2));
                if (i > 2) {
                    linkedList.add(C40249qOw.AEQbTJ);
                }
            }
            linkedList.add(C40238qOl.copydefault);
        }
    }

    public final void copydefault(@NotNull LinkedList<InterfaceC40237qOk> linkedList, @NotNull java.util.Map<OptionsCategoryGroupVo, ? extends java.util.Map<java.lang.String, ? extends java.util.List<? extends InterfaceC41642quf>>> map) {
        Intrinsics.checkNotNullParameter(linkedList, "");
        Intrinsics.checkNotNullParameter(map, "");
        C40375qTn.AEQbTJ.copydefault("AssembleNavSearchResultUseCase", "addSimpleOptionsPart() options: " + map.keySet());
        java.util.List listAxsJAYsNCnLh = CollectionsKt___CollectionsKt.AxsJAYsNCnLh(map.keySet());
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : listAxsJAYsNCnLh) {
            if (yDY.gEmmrt("BTC", "ETH").contains(((OptionsCategoryGroupVo) obj).OLrzqt())) {
                arrayList.add(obj);
            }
        }
        if (!C33129mqd.KWHzl((java.util.Collection) arrayList)) {
            arrayList = null;
        }
        if (arrayList != null) {
            C40375qTn.AEQbTJ.copydefault("AssembleNavSearchResultUseCase", "addSimpleOptionsPart() - adding simple options for symbols: " + arrayList);
            linkedList.add(new C40243qOq(arrayList));
            linkedList.add(C40238qOl.copydefault);
        }
    }

    public final void EZpvd(@NotNull LinkedList<InterfaceC40237qOk> linkedList) {
        Intrinsics.checkNotNullParameter(linkedList, "");
        C40375qTn.AEQbTJ.copydefault("AssembleNavSearchResultUseCase", "addAccountUpgradePart() called");
        linkedList.add(C40236qOj.EZpvd);
        linkedList.add(C40238qOl.copydefault);
    }

    public final void KWHzl(@NotNull LinkedList<InterfaceC40237qOk> linkedList, @NotNull java.util.List<? extends InterfaceC40237qOk> list, @NotNull java.util.List<? extends InterfaceC40237qOk> list2, C40239qOm.ActionBar.C0923ActionBar c0923ActionBar, C40239qOm.ActionBar.Application application) {
        Intrinsics.checkNotNullParameter(linkedList, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        java.lang.String str = "futuresVoList: " + list.size() + ", optionsVoList: " + list2.size() + ", futuresTabVo: " + c0923ActionBar + ", optionsTabVo: " + application;
        C40375qTn.AEQbTJ.copydefault("AssembleNavSearchResultUseCase", "addFuturesAndOptionsQuotePart() " + str);
        C40239qOm c40239qOm = new C40239qOm(c0923ActionBar, application);
        if (c0923ActionBar != null && c0923ActionBar.KWHzl()) {
            linkedList.add(c40239qOm);
            KWHzl(linkedList, list);
            linkedList.add(C40238qOl.copydefault);
        } else {
            if (application == null || !application.KWHzl()) {
                return;
            }
            linkedList.add(c40239qOm);
            EZpvd(linkedList, list2);
            linkedList.add(C40238qOl.copydefault);
        }
    }

    public final void KWHzl(@NotNull LinkedList<InterfaceC40237qOk> linkedList, @NotNull java.util.List<? extends InterfaceC40237qOk> list) {
        Intrinsics.checkNotNullParameter(linkedList, "");
        Intrinsics.checkNotNullParameter(list, "");
        C40375qTn.AEQbTJ.copydefault("AssembleNavSearchResultUseCase", "addFuturesPart() futures size: " + list.size());
        if (!list.isEmpty()) {
            linkedList.addAll(list);
        }
    }

    public final void EZpvd(@NotNull LinkedList<InterfaceC40237qOk> linkedList, @NotNull java.util.List<? extends InterfaceC40237qOk> list) {
        Intrinsics.checkNotNullParameter(linkedList, "");
        Intrinsics.checkNotNullParameter(list, "");
        C40375qTn.AEQbTJ.copydefault("AssembleNavSearchResultUseCase", "addOptionsQuotePart() options size: " + list.size());
        if (!list.isEmpty()) {
            linkedList.addAll(list);
        } else {
            linkedList.add(C40242qOp.AEQbTJ);
        }
    }

    public final void OLrzqt(@NotNull LinkedList<InterfaceC40237qOk> linkedList, @NotNull java.util.List<? extends InterfaceC40237qOk> list) {
        Intrinsics.checkNotNullParameter(linkedList, "");
        Intrinsics.checkNotNullParameter(list, "");
        C40375qTn.AEQbTJ.copydefault("AssembleNavSearchResultUseCase", "addDexPart() dexVoList: " + list.size());
        if (!list.isEmpty()) {
            linkedList.add(C40240qOn.KWHzl);
            linkedList.addAll(list);
            linkedList.add(C40238qOl.copydefault);
        }
    }
}
