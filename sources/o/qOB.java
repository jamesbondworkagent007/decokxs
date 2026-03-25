package o;

import com.okinc.kyc.api.biz.restriction.FeatureRestrictionInfo;
import com.okinc.kyc.api.biz.restriction.OKComplianceRestrictionService;
import com.okinc.market.search.features.navigation.root.domain.GetBizModeSubPagesUseCase$onExecute$1;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import o.InterfaceC49404uns;
import o.InterfaceC54577xNn;
import o.qPR;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class qOB implements InterfaceC49404uns<C40252qOz, java.util.List<? extends qPR>> {
    public final OKComplianceRestrictionService AEQbTJ;
    public final C41607qtx KWHzl;
    public final InterfaceC54577xNn OLrzqt;
    public final InterfaceC49497upf copydefault;

    @yCM
    public qOB(InterfaceC54577xNn interfaceC54577xNn, @NotNull OKComplianceRestrictionService oKComplianceRestrictionService, InterfaceC49497upf interfaceC49497upf, @NotNull C41607qtx c41607qtx) {
        Intrinsics.checkNotNullParameter(oKComplianceRestrictionService, "");
        Intrinsics.checkNotNullParameter(c41607qtx, "");
        this.OLrzqt = interfaceC54577xNn;
        this.AEQbTJ = oKComplianceRestrictionService;
        this.copydefault = interfaceC49497upf;
        this.KWHzl = c41607qtx;
    }

    @Override // o.InterfaceC49376unQ
    public <Input, Output> Output EZpvd(Input input, @NotNull Function1<? super Input, ? extends Output> function1) {
        return (Output) InterfaceC49404uns.Activity.OLrzqt(this, input, function1);
    }

    @Override // o.InterfaceC49376unQ
    public boolean EZpvd() {
        return InterfaceC49404uns.Activity.copydefault(this);
    }

    @Override // o.InterfaceC49404uns, o.InterfaceC49403unr
    public /* bridge */ /* synthetic */ java.lang.Object KWHzl(java.lang.Object obj, Continuation continuation) {
        return KWHzl((C40252qOz) obj, (Continuation<? super java.util.List<? extends qPR>>) continuation);
    }

    @Override // o.InterfaceC49376unQ
    public <Input, Output> java.lang.Object KWHzl(Input input, @NotNull Function2<? super Input, ? super Continuation<? super Output>, ? extends java.lang.Object> function2, @NotNull Continuation<? super Output> continuation) {
        return InterfaceC49404uns.Activity.KWHzl(this, input, function2, continuation);
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public java.lang.Object AEQbTJ(@NotNull C40252qOz c40252qOz, @NotNull Continuation<? super java.util.List<? extends qPR>> continuation) {
        return InterfaceC49404uns.Activity.EZpvd(this, c40252qOz, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull C40252qOz c40252qOz, @NotNull Continuation<? super java.util.List<? extends qPR>> continuation) throws java.lang.Throwable {
        GetBizModeSubPagesUseCase$onExecute$1 getBizModeSubPagesUseCase$onExecute$1;
        qOB qob;
        java.lang.String str;
        java.lang.Object objM7386unboximpl;
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> map;
        java.util.ArrayList<java.lang.String> arrayListEjfBZ;
        java.util.List<java.lang.String> listOLrzqt;
        xND xndAEQbTJ;
        if (continuation instanceof GetBizModeSubPagesUseCase$onExecute$1) {
            getBizModeSubPagesUseCase$onExecute$1 = (GetBizModeSubPagesUseCase$onExecute$1) continuation;
            int i = getBizModeSubPagesUseCase$onExecute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getBizModeSubPagesUseCase$onExecute$1.label = i - Integer.MIN_VALUE;
            } else {
                getBizModeSubPagesUseCase$onExecute$1 = new GetBizModeSubPagesUseCase$onExecute$1(this, continuation);
            }
        }
        GetBizModeSubPagesUseCase$onExecute$1 getBizModeSubPagesUseCase$onExecute$12 = getBizModeSubPagesUseCase$onExecute$1;
        java.lang.Object obj = getBizModeSubPagesUseCase$onExecute$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = getBizModeSubPagesUseCase$onExecute$12.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            java.lang.String strCopydefault = c40252qOz.copydefault();
            java.util.Map<java.lang.String, java.util.List<java.lang.String>> mapKWHzl = c40252qOz.KWHzl();
            InterfaceC54577xNn interfaceC54577xNn = this.OLrzqt;
            if (interfaceC54577xNn == null) {
                return null;
            }
            getBizModeSubPagesUseCase$onExecute$12.L$0 = this;
            getBizModeSubPagesUseCase$onExecute$12.L$1 = strCopydefault;
            getBizModeSubPagesUseCase$onExecute$12.L$2 = mapKWHzl;
            getBizModeSubPagesUseCase$onExecute$12.label = 1;
            java.lang.Object objM8790ensureInitialize0E7RQCE$default = InterfaceC54577xNn.ActionBar.m8790ensureInitialize0E7RQCE$default(interfaceC54577xNn, false, null, getBizModeSubPagesUseCase$onExecute$12, 3, null);
            if (objM8790ensureInitialize0E7RQCE$default == objCopydefault) {
                return objCopydefault;
            }
            qob = this;
            str = strCopydefault;
            objM7386unboximpl = objM8790ensureInitialize0E7RQCE$default;
            map = mapKWHzl;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            java.util.Map<java.lang.String, java.util.List<java.lang.String>> map2 = (java.util.Map) getBizModeSubPagesUseCase$onExecute$12.L$2;
            java.lang.String str2 = (java.lang.String) getBizModeSubPagesUseCase$onExecute$12.L$1;
            qOB qob2 = (qOB) getBizModeSubPagesUseCase$onExecute$12.L$0;
            C56391yDq.AEQbTJ(obj);
            objM7386unboximpl = ((Result) obj).m7386unboximpl();
            map = map2;
            qob = qob2;
            str = str2;
        }
        if (Result.m7384isSuccessimpl(objM7386unboximpl)) {
            if (Result.m7383isFailureimpl(objM7386unboximpl)) {
                objM7386unboximpl = null;
            }
            InterfaceC54581xNr interfaceC54581xNr = (InterfaceC54581xNr) objM7386unboximpl;
            if (interfaceC54581xNr != null && (arrayListEjfBZ = interfaceC54581xNr.ejfBZ()) != null && (listOLrzqt = qob.OLrzqt(arrayListEjfBZ)) != null) {
                InterfaceC49497upf interfaceC49497upf = qob.copydefault;
                boolean zEZpvd = false;
                if (interfaceC49497upf != null && (xndAEQbTJ = interfaceC49497upf.AEQbTJ()) != null) {
                    zEZpvd = Intrinsics.EZpvd(xndAEQbTJ.valueOf(), C56443yFo.KWHzl(false));
                }
                return qob.KWHzl(qob.copydefault(listOLrzqt, str, map, qob.OLrzqt.EZpvd(), !zEZpvd));
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x002d  */
    /* JADX WARN: Type inference failed for: r1v0, types: [T, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v12, types: [T, java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.util.List<java.lang.String> copydefault(java.util.List<java.lang.String> list, java.lang.String str, java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>> map, boolean z, boolean z2) {
        boolean z3;
        java.util.List<java.lang.String> list2;
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = new java.util.ArrayList();
        FeatureRestrictionInfo featureRestrictionInfoEZpvd = this.AEQbTJ.EZpvd(OKComplianceRestrictionService.Feature.HIDE_DERIVATIVES_SURVEY_ENTRY);
        if (featureRestrictionInfoEZpvd == null || !Intrinsics.EZpvd(featureRestrictionInfoEZpvd.getRestricted(), java.lang.Boolean.TRUE)) {
            z3 = false;
        } else {
            z3 = true;
            if (!kKA.isLogin$default(kKA.EZpvd, null, 1, null)) {
            }
        }
        if (!z && z2) {
            ((java.util.List) objectRef.element).add("Watchlist");
        }
        java.util.List list3 = (java.util.List) objectRef.element;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            java.lang.String str2 = (java.lang.String) obj;
            if (!Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) "MARGIN") && !Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) "FUTURES")) {
                arrayList.add(obj);
            }
        }
        list3.addAll(arrayList);
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "trade_page") && z3 && !z) {
            ((java.util.List) objectRef.element).add("Derivatives");
        }
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "page_alert")) {
            ((java.util.List) objectRef.element).remove("Watchlist");
            ((java.util.List) objectRef.element).remove("OPTION");
        }
        if (map != null && (list2 = map.get("bizType")) != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (java.lang.Object obj2 : list2) {
                if (((java.util.List) objectRef.element).contains((java.lang.String) obj2)) {
                    arrayList2.add(obj2);
                }
            }
            objectRef.element = CollectionsKt___CollectionsKt.fJNWhG((java.util.Collection) arrayList2);
        }
        return (java.util.List) objectRef.element;
    }

    public final java.util.List<java.lang.String> OLrzqt(java.util.List<java.lang.String> list) {
        if (((java.lang.Boolean) this.KWHzl.KWHzl((java.lang.Object) Unit.INSTANCE)).booleanValue()) {
            list = CollectionsKt___CollectionsKt.fJNWhG((java.util.Collection) list);
            list.remove("CEDEFI");
            int iIndexOf = list.indexOf("OPTION");
            if (iIndexOf > -1) {
                list.add(iIndexOf, "CEDEFI");
            } else {
                list.add("CEDEFI");
            }
        }
        return list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [138=6] */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.util.List<qPR> KWHzl(java.util.List<java.lang.String> list) {
        qPR qpr;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.String str : list) {
            switch (str.hashCode()) {
                case -1956807563:
                    qpr = str.equals("OPTION") ? qPR.FragmentManager.OLrzqt : null;
                    break;
                case -1647870036:
                    if (str.equals("Derivatives")) {
                        qpr = qPR.StateListAnimator.copydefault;
                        break;
                    }
                    break;
                case 2552066:
                    if (str.equals("SPOT")) {
                        qpr = qPR.PendingIntent.copydefault;
                        break;
                    }
                    break;
                case 2558355:
                    if (str.equals("SWAP")) {
                        qpr = qPR.Dialog.KWHzl;
                        break;
                    }
                    break;
                case 1724028365:
                    if (str.equals("Watchlist")) {
                        qpr = qPR.ActionBar.AEQbTJ;
                        break;
                    }
                    break;
                case 1983970406:
                    if (str.equals("CEDEFI")) {
                        qpr = qPR.TaskDescription.copydefault;
                        break;
                    }
                    break;
            }
            if (qpr != null) {
                arrayList.add(qpr);
            }
        }
        return arrayList;
    }
}
