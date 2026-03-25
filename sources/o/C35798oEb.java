package o;

import com.okinc.im.usecase.group.paid.GetPaidListCategoriesUseCase$invoke$1;
import com.okinc.im.usecase.group.paid.GetPaidListCategoriesUseCase$invoke$result$1$response$1;
import com.okinc.okimcore.model.im.group.paidgroup.BillingCyclePaymentStatus;
import com.okinc.okimcore.model.remote.InHouseIMPaidGroupCategory;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import o.AbstractC44424sPh;
import o.C35399nuc;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oEb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C35798oEb {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int KWHzl = 8;
    public final sIR AEQbTJ;
    public final CoroutineDispatcher OLrzqt;
    public final InterfaceC56387yDm copydefault;

    @yCM
    public C35798oEb(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull sIR sir) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(sir, "");
        this.OLrzqt = coroutineDispatcher;
        this.AEQbTJ = sir;
        this.copydefault = C56392yDr.copydefault(new Function0() { // from class: o.oDY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C35798oEb.copydefault();
            }
        });
    }

    /* JADX INFO: renamed from: o.oEb$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.oEb.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public final C34286nYi OLrzqt() {
        return (C34286nYi) this.copydefault.getValue();
    }

    public static final C34286nYi copydefault() {
        return new C34286nYi(BillingCyclePaymentStatus.UNKNOWN.getRawValue(), C33070mpX.AYXKKw(C35399nuc.LoaderManager.valueOf), -1, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0065 A[Catch: all -> 0x0033, TRY_ENTER, TryCatch #0 {all -> 0x0033, blocks: (B:12:0x002f, B:23:0x005d, B:26:0x0065, B:30:0x00be, B:27:0x0096, B:29:0x009a, B:31:0x00c3, B:32:0x00c8), top: B:41:0x002f }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0096 A[Catch: all -> 0x0033, TryCatch #0 {all -> 0x0033, blocks: (B:12:0x002f, B:23:0x005d, B:26:0x0065, B:30:0x00be, B:27:0x0096, B:29:0x009a, B:31:0x00c3, B:32:0x00c8), top: B:41:0x002f }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(@NotNull java.lang.String str, @NotNull Continuation<? super java.util.List<C34286nYi>> continuation) throws java.lang.Throwable {
        GetPaidListCategoriesUseCase$invoke$1 getPaidListCategoriesUseCase$invoke$1;
        C35798oEb c35798oEb;
        java.lang.Object objM7377constructorimpl;
        AbstractC44424sPh abstractC44424sPh;
        java.util.List<InHouseIMPaidGroupCategory> listAhwBna;
        if (continuation instanceof GetPaidListCategoriesUseCase$invoke$1) {
            getPaidListCategoriesUseCase$invoke$1 = (GetPaidListCategoriesUseCase$invoke$1) continuation;
            int i = getPaidListCategoriesUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getPaidListCategoriesUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                getPaidListCategoriesUseCase$invoke$1 = new GetPaidListCategoriesUseCase$invoke$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = getPaidListCategoriesUseCase$invoke$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = getPaidListCategoriesUseCase$invoke$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            try {
                Result.Application application = Result.Companion;
                long j = java.lang.Long.parseLong(str);
                CoroutineDispatcher coroutineDispatcher = this.OLrzqt;
                GetPaidListCategoriesUseCase$invoke$result$1$response$1 getPaidListCategoriesUseCase$invoke$result$1$response$1 = new GetPaidListCategoriesUseCase$invoke$result$1$response$1(this, j, null);
                getPaidListCategoriesUseCase$invoke$1.L$0 = this;
                getPaidListCategoriesUseCase$invoke$1.L$1 = str;
                getPaidListCategoriesUseCase$invoke$1.label = 1;
                objWithContext = BuildersKt.withContext(coroutineDispatcher, getPaidListCategoriesUseCase$invoke$result$1$response$1, getPaidListCategoriesUseCase$invoke$1);
                if (objWithContext == objCopydefault) {
                    return objCopydefault;
                }
                c35798oEb = this;
                abstractC44424sPh = (AbstractC44424sPh) objWithContext;
                if (!(abstractC44424sPh instanceof AbstractC44424sPh.TaskDescription)) {
                }
                objM7377constructorimpl = Result.m7377constructorimpl(listAhwBna);
            } catch (java.lang.Throwable th) {
                th = th;
                c35798oEb = this;
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (java.lang.String) getPaidListCategoriesUseCase$invoke$1.L$1;
            c35798oEb = (C35798oEb) getPaidListCategoriesUseCase$invoke$1.L$0;
            try {
                C56391yDq.AEQbTJ(objWithContext);
                abstractC44424sPh = (AbstractC44424sPh) objWithContext;
                if (!(abstractC44424sPh instanceof AbstractC44424sPh.TaskDescription)) {
                    pUU.KWHzl("GetPaidListCategoriesUseCase", "Successfully fetched paid list categories for group " + str + ": " + ((AbstractC44424sPh.TaskDescription) abstractC44424sPh).OLrzqt().size() + " categories");
                    listAhwBna = ((AbstractC44424sPh.TaskDescription) abstractC44424sPh).OLrzqt();
                } else {
                    if (!(abstractC44424sPh instanceof AbstractC44424sPh.Activity)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    pUU.copydefault("GetPaidListCategoriesUseCase", "Failed Result for paid list categories for group " + str + ": " + ((AbstractC44424sPh.Activity) abstractC44424sPh).AEQbTJ());
                    listAhwBna = yDY.AhwBna();
                }
                objM7377constructorimpl = Result.m7377constructorimpl(listAhwBna);
            } catch (java.lang.Throwable th2) {
                th = th2;
                Result.Application application22 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
        }
        java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            pUU.AEQbTJ("GetPaidListCategoriesUseCase", "Error Result for paid list categories for group " + str, thM7380exceptionOrNullimpl);
        }
        C56391yDq.AEQbTJ(objM7377constructorimpl);
        return CollectionsKt___CollectionsKt.djBIcL((java.util.Collection) C56402yEa.EZpvd(c35798oEb.OLrzqt()), (java.lang.Iterable) c35798oEb.KWHzl((java.util.List) objM7377constructorimpl));
    }

    public final java.util.List<C34286nYi> KWHzl(java.util.List<InHouseIMPaidGroupCategory> list) {
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        for (InHouseIMPaidGroupCategory inHouseIMPaidGroupCategory : list) {
            arrayList.add(new C34286nYi(inHouseIMPaidGroupCategory.getBillingCyclePaymentStatus().getRawValue(), inHouseIMPaidGroupCategory.getLabel(), inHouseIMPaidGroupCategory.getCount(), false, 8, null));
        }
        return arrayList;
    }
}
