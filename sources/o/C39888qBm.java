package o;

import com.okinc.kyc.api.biz.restriction.OKComplianceRestrictionService;
import com.okinc.market.quotation.ui.model.CategoryGroupVo;
import com.okinc.market.quotation.ui.model.ChargeGroupVo;
import com.okinc.market.quotation.ui.model.OptionsCategoryGroupVo;
import com.okinc.trade.arch.util.Quartet;
import java.util.LinkedList;
import kotlin.Triple;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C40239qOm;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qBm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C39888qBm extends C40235qOi {
    private static final TaskDescription Companion = new TaskDescription(null);
    public static final int EZpvd = C41607qtx.copydefault;
    public final C41607qtx OLrzqt;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @yCM
    public C39888qBm(InterfaceC54577xNn interfaceC54577xNn, @NotNull OKComplianceRestrictionService oKComplianceRestrictionService, @NotNull C41607qtx c41607qtx) {
        super(interfaceC54577xNn, oKComplianceRestrictionService, c41607qtx);
        Intrinsics.checkNotNullParameter(oKComplianceRestrictionService, "");
        Intrinsics.checkNotNullParameter(c41607qtx, "");
        this.OLrzqt = c41607qtx;
    }

    /* JADX INFO: renamed from: o.qBm$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.qBm.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    @Override // o.C40235qOi
    public LinkedList<InterfaceC40237qOk> OLrzqt(@NotNull LinkedList<InterfaceC40237qOk> linkedList, Quartet<java.lang.String, ? extends java.util.List<? extends InterfaceC41641que>, ? extends java.util.List<CategoryGroupVo>, ? extends java.util.List<ChargeGroupVo>> quartet, @NotNull java.util.List<? extends InterfaceC40237qOk> list, boolean z, Triple<java.lang.String, ? extends java.util.Map<OptionsCategoryGroupVo, ? extends java.util.Map<java.lang.String, ? extends java.util.List<? extends InterfaceC41642quf>>>, java.lang.Integer> triple, boolean z2, boolean z3, @NotNull java.util.List<? extends InterfaceC40237qOk> list2, @NotNull java.util.List<? extends InterfaceC40237qOk> list3, C40239qOm.ActionBar.C0923ActionBar c0923ActionBar, C40239qOm.ActionBar.Application application, boolean z4, @NotNull java.util.List<? extends InterfaceC40237qOk> list4) {
        java.util.List<? extends InterfaceC41641que> second;
        Intrinsics.checkNotNullParameter(linkedList, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(list3, "");
        Intrinsics.checkNotNullParameter(list4, "");
        C40375qTn c40375qTn = C40375qTn.AEQbTJ;
        c40375qTn.copydefault("LandscapeAssembleNavSearchResultUseCase", "onExecute() - adding spot part");
        EZpvd(linkedList, (quartet == null || (second = quartet.getSecond()) == null) ? 0 : second.size(), list, true);
        c40375qTn.copydefault("LandscapeAssembleNavSearchResultUseCase", "onExecute() - adding futures and options quote part");
        if (!list2.isEmpty()) {
            linkedList.add(C40241qOo.KWHzl);
            KWHzl(linkedList, list2);
            linkedList.add(C40238qOl.copydefault);
        }
        if (application != null) {
            linkedList.add(new C40245qOs(application));
            EZpvd(linkedList, list3);
        }
        if (CollectionsKt___CollectionsKt.wlaJM(linkedList) instanceof C40238qOl) {
            linkedList.removeLast();
        }
        return linkedList;
    }
}
