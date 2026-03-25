package o;

import com.okinc.market.quotation.domain.util.GetCategoryGroupUseCase$invoke$1;
import com.okinc.market.quotation.domain.util.GetCategoryGroupUseCase$onExecute$1;
import com.okinc.market.quotation.ui.model.CategoryGroupVo;
import com.okinc.tradeapi.bean.TradeGroupData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import o.InterfaceC49404uns;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qtB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@yCR
public final class C41559qtB implements InterfaceC49404uns<Unit, java.util.List<? extends CategoryGroupVo>> {
    public final C41605qtv AEQbTJ;
    public final InterfaceC54577xNn KWHzl;
    public final Mutex copydefault;

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
        return KWHzl((Unit) obj, (Continuation<? super java.util.List<CategoryGroupVo>>) continuation);
    }

    @Override // o.InterfaceC49376unQ
    public <Input, Output> java.lang.Object KWHzl(Input input, @NotNull Function2<? super Input, ? super Continuation<? super Output>, ? extends java.lang.Object> function2, @NotNull Continuation<? super Output> continuation) {
        return InterfaceC49404uns.Activity.KWHzl(this, input, function2, continuation);
    }

    @yCM
    public C41559qtB(InterfaceC54577xNn interfaceC54577xNn, @NotNull C41605qtv c41605qtv) {
        Intrinsics.checkNotNullParameter(c41605qtv, "");
        this.KWHzl = interfaceC54577xNn;
        this.AEQbTJ = c41605qtv;
        this.copydefault = MutexKt.Mutex$default(false, 1, null);
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:32:0x0023 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Unit] */
    /* JADX WARN: Type inference failed for: r7v1, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v4, types: [kotlinx.coroutines.sync.Mutex] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object copydefault(@NotNull Unit unit, @NotNull Continuation<? super java.util.List<CategoryGroupVo>> continuation) throws java.lang.Throwable {
        GetCategoryGroupUseCase$invoke$1 getCategoryGroupUseCase$invoke$1;
        C41559qtB c41559qtB;
        ?? r2;
        Mutex mutex;
        if (continuation instanceof GetCategoryGroupUseCase$invoke$1) {
            getCategoryGroupUseCase$invoke$1 = (GetCategoryGroupUseCase$invoke$1) continuation;
            int i = getCategoryGroupUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getCategoryGroupUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                getCategoryGroupUseCase$invoke$1 = new GetCategoryGroupUseCase$invoke$1(this, continuation);
            }
        }
        java.lang.Object objEZpvd = getCategoryGroupUseCase$invoke$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = getCategoryGroupUseCase$invoke$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objEZpvd);
                Mutex mutex2 = this.copydefault;
                getCategoryGroupUseCase$invoke$1.L$0 = this;
                getCategoryGroupUseCase$invoke$1.L$1 = unit;
                getCategoryGroupUseCase$invoke$1.L$2 = mutex2;
                getCategoryGroupUseCase$invoke$1.label = 1;
                if (mutex2.lock(null, getCategoryGroupUseCase$invoke$1) == objCopydefault) {
                    return objCopydefault;
                }
                c41559qtB = this;
                r2 = unit;
                mutex = mutex2;
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Mutex mutex3 = (Mutex) getCategoryGroupUseCase$invoke$1.L$0;
                    C56391yDq.AEQbTJ(objEZpvd);
                    unit = mutex3;
                    return (java.util.List) objEZpvd;
                }
                Mutex mutex4 = (Mutex) getCategoryGroupUseCase$invoke$1.L$2;
                Unit unit2 = (Unit) getCategoryGroupUseCase$invoke$1.L$1;
                c41559qtB = (C41559qtB) getCategoryGroupUseCase$invoke$1.L$0;
                C56391yDq.AEQbTJ(objEZpvd);
                r2 = unit2;
                mutex = mutex4;
            }
            getCategoryGroupUseCase$invoke$1.L$0 = mutex;
            getCategoryGroupUseCase$invoke$1.L$1 = null;
            getCategoryGroupUseCase$invoke$1.L$2 = null;
            getCategoryGroupUseCase$invoke$1.label = 2;
            objEZpvd = InterfaceC49404uns.Activity.EZpvd(c41559qtB, r2, getCategoryGroupUseCase$invoke$1);
            unit = mutex;
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
            return (java.util.List) objEZpvd;
        } finally {
            unit.unlock(null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull Unit unit, @NotNull Continuation<? super java.util.List<CategoryGroupVo>> continuation) throws java.lang.Throwable {
        GetCategoryGroupUseCase$onExecute$1 getCategoryGroupUseCase$onExecute$1;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt;
        C41559qtB c41559qtB;
        InterfaceC54581xNr interfaceC54581xNr;
        if (continuation instanceof GetCategoryGroupUseCase$onExecute$1) {
            getCategoryGroupUseCase$onExecute$1 = (GetCategoryGroupUseCase$onExecute$1) continuation;
            int i = getCategoryGroupUseCase$onExecute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getCategoryGroupUseCase$onExecute$1.label = i - Integer.MIN_VALUE;
            } else {
                getCategoryGroupUseCase$onExecute$1 = new GetCategoryGroupUseCase$onExecute$1(this, continuation);
            }
        }
        java.lang.Object obj = getCategoryGroupUseCase$onExecute$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = getCategoryGroupUseCase$onExecute$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC54577xNn interfaceC54577xNn = this.KWHzl;
            if (interfaceC54577xNn == null || (interfaceC54581xNrOLrzqt = interfaceC54577xNn.OLrzqt()) == null) {
                return null;
            }
            getCategoryGroupUseCase$onExecute$1.L$0 = this;
            getCategoryGroupUseCase$onExecute$1.L$1 = interfaceC54581xNrOLrzqt;
            getCategoryGroupUseCase$onExecute$1.label = 1;
            if (C55608xnE.KWHzl(interfaceC54581xNrOLrzqt, true, (Continuation<? super Unit>) getCategoryGroupUseCase$onExecute$1) == objCopydefault) {
                return objCopydefault;
            }
            c41559qtB = this;
            interfaceC54581xNr = interfaceC54581xNrOLrzqt;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC54581xNr = (InterfaceC54581xNr) getCategoryGroupUseCase$onExecute$1.L$1;
            c41559qtB = (C41559qtB) getCategoryGroupUseCase$onExecute$1.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        java.util.ArrayList<TradeGroupData> arrayListHDKMBd = interfaceC54581xNr.hDKMBd();
        boolean zBooleanValue = ((java.lang.Boolean) c41559qtB.AEQbTJ.copydefault(Unit.INSTANCE)).booleanValue();
        CategoryGroupVo.TaskDescription taskDescription = CategoryGroupVo.Companion;
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(arrayListHDKMBd, 10));
        java.util.Iterator<T> it = arrayListHDKMBd.iterator();
        while (it.hasNext()) {
            arrayList.add(new CategoryGroupVo((TradeGroupData) it.next()));
        }
        return taskDescription.OLrzqt(taskDescription.EZpvd(arrayList), zBooleanValue);
    }
}
