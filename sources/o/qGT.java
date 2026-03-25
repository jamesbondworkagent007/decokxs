package o;

import com.okinc.kyc.api.biz.restriction.OKComplianceRestrictionService;
import com.okinc.market.search.features.main.recommend.history.data.model.InvestCurrency;
import com.okinc.market.search.features.main.recommend.history.data.model.Product;
import com.okinc.market.search.features.main.root.data.po.SearchResultEarnProductPo;
import com.okinc.market.search.features.main.root.domain.usecase.SearchEarnProductsUseCase$invoke$1;
import com.okinc.market.search.features.main.root.domain.usecase.SearchEarnProductsUseCase$onExecute$1;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class qGT extends AbstractC49400uno<java.lang.String, java.util.List<? extends Product>> {
    private static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int copydefault = 8;
    public final CoroutineDispatcher AEQbTJ;
    public final qGE EZpvd;
    public final OKComplianceRestrictionService KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49400uno
    public CoroutineDispatcher AEQbTJ() {
        return this.AEQbTJ;
    }

    @yCM
    public qGT(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull OKComplianceRestrictionService oKComplianceRestrictionService, @NotNull qGE qge) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(oKComplianceRestrictionService, "");
        Intrinsics.checkNotNullParameter(qge, "");
        this.AEQbTJ = coroutineDispatcher;
        this.KWHzl = oKComplianceRestrictionService;
        this.EZpvd = qge;
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.qGT.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    /* JADX DEBUG: Method merged with bridge method: EZpvd(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.AbstractC49400uno
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object EZpvd(@NotNull java.lang.String str, @NotNull Continuation<? super java.util.List<Product>> continuation) throws java.lang.Throwable {
        SearchEarnProductsUseCase$invoke$1 searchEarnProductsUseCase$invoke$1;
        long j;
        if (continuation instanceof SearchEarnProductsUseCase$invoke$1) {
            searchEarnProductsUseCase$invoke$1 = (SearchEarnProductsUseCase$invoke$1) continuation;
            int i = searchEarnProductsUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                searchEarnProductsUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                searchEarnProductsUseCase$invoke$1 = new SearchEarnProductsUseCase$invoke$1(this, continuation);
            }
        }
        java.lang.Object objEZpvd = searchEarnProductsUseCase$invoke$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = searchEarnProductsUseCase$invoke$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objEZpvd);
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            searchEarnProductsUseCase$invoke$1.J$0 = jCurrentTimeMillis;
            searchEarnProductsUseCase$invoke$1.label = 1;
            objEZpvd = super.EZpvd(str, searchEarnProductsUseCase$invoke$1);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
            j = jCurrentTimeMillis;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j = searchEarnProductsUseCase$invoke$1.J$0;
            C56391yDq.AEQbTJ(objEZpvd);
        }
        kotlin.Pair pairOLrzqt = C56390yDp.OLrzqt((java.util.List) objEZpvd, C56443yFo.KWHzl(java.lang.System.currentTimeMillis() - j));
        C40375qTn.AEQbTJ.copydefault("SearchEarnProductsUseCase", "SearchEarnProductsUseCase total [cost: " + pairOLrzqt.getSecond() + "ms]");
        return pairOLrzqt.getFirst();
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC49403unr
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull java.lang.String str, @NotNull Continuation<? super java.util.List<Product>> continuation) throws java.lang.Throwable {
        SearchEarnProductsUseCase$onExecute$1 searchEarnProductsUseCase$onExecute$1;
        qGT qgt;
        long j;
        if (continuation instanceof SearchEarnProductsUseCase$onExecute$1) {
            searchEarnProductsUseCase$onExecute$1 = (SearchEarnProductsUseCase$onExecute$1) continuation;
            int i = searchEarnProductsUseCase$onExecute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                searchEarnProductsUseCase$onExecute$1.label = i - Integer.MIN_VALUE;
            } else {
                searchEarnProductsUseCase$onExecute$1 = new SearchEarnProductsUseCase$onExecute$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = searchEarnProductsUseCase$onExecute$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = searchEarnProductsUseCase$onExecute$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objCopydefault);
            if (C40386qTy.KWHzl()) {
                C40375qTn.AEQbTJ.copydefault("SearchEarnProductsUseCase", "sim mode, skip.");
                return null;
            }
            if (this.KWHzl.AEQbTJ(OKComplianceRestrictionService.Feature.SIMPLE_EARN)) {
                C40375qTn.AEQbTJ.copydefault("SearchEarnProductsUseCase", "feat SIMPLE_EARN hidden, skip.");
                return null;
            }
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            qGE qge = this.EZpvd;
            searchEarnProductsUseCase$onExecute$1.L$0 = this;
            searchEarnProductsUseCase$onExecute$1.L$1 = str;
            searchEarnProductsUseCase$onExecute$1.J$0 = jCurrentTimeMillis;
            searchEarnProductsUseCase$onExecute$1.label = 1;
            objCopydefault = qge.copydefault(searchEarnProductsUseCase$onExecute$1);
            if (objCopydefault == objCopydefault2) {
                return objCopydefault2;
            }
            qgt = this;
            j = jCurrentTimeMillis;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j = searchEarnProductsUseCase$onExecute$1.J$0;
            str = (java.lang.String) searchEarnProductsUseCase$onExecute$1.L$1;
            qgt = (qGT) searchEarnProductsUseCase$onExecute$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
        }
        SearchResultEarnProductPo searchResultEarnProductPo = (SearchResultEarnProductPo) objCopydefault;
        kotlin.Pair pairOLrzqt = C56390yDp.OLrzqt(searchResultEarnProductPo != null ? searchResultEarnProductPo.getProducts() : null, C56443yFo.KWHzl(java.lang.System.currentTimeMillis() - j));
        C40375qTn c40375qTn = C40375qTn.AEQbTJ;
        c40375qTn.copydefault("SearchEarnProductsUseCase", "getAllEarnProducts from repo [cost: " + pairOLrzqt.getSecond() + "ms]");
        java.util.List<Product> list = (java.util.List) pairOLrzqt.component1();
        if (list == null) {
            return null;
        }
        kotlin.Pair pairOLrzqt2 = C56390yDp.OLrzqt(qgt.KWHzl(str, list), C56443yFo.KWHzl(java.lang.System.currentTimeMillis() - java.lang.System.currentTimeMillis()));
        c40375qTn.copydefault("SearchEarnProductsUseCase", "matchingEarnProducts [cost: " + pairOLrzqt2.getSecond() + "ms]");
        return (java.util.List) pairOLrzqt2.component1();
    }

    public final java.util.List<Product> KWHzl(java.lang.String str, java.util.List<Product> list) {
        java.lang.String currencyName;
        java.lang.String currencyFullName;
        java.lang.String lowerCase = StringsKt__StringsKt.hDKMBd((java.lang.CharSequence) str).toString().toLowerCase(java.util.Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        java.lang.String strKWHzl = C54704xSf.OLrzqt.KWHzl(lowerCase);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            Product product = (Product) obj;
            InvestCurrency investCurrency = product.getInvestCurrency();
            if (investCurrency != null && (currencyName = investCurrency.getCurrencyName()) != null) {
                java.util.Locale locale = java.util.Locale.ROOT;
                java.lang.String lowerCase2 = currencyName.toLowerCase(locale);
                Intrinsics.checkNotNullExpressionValue(lowerCase2, "");
                if (lowerCase2 != null) {
                    if (Intrinsics.EZpvd(product.getNeedRegionalDisplay(), java.lang.Boolean.TRUE)) {
                        if (Intrinsics.EZpvd((java.lang.Object) lowerCase2, (java.lang.Object) strKWHzl)) {
                            arrayList.add(obj);
                        }
                    } else {
                        InvestCurrency investCurrency2 = product.getInvestCurrency();
                        if (investCurrency2 != null && (currencyFullName = investCurrency2.getCurrencyFullName()) != null) {
                            java.lang.String lowerCase3 = currencyFullName.toLowerCase(locale);
                            Intrinsics.checkNotNullExpressionValue(lowerCase3, "");
                            if (lowerCase3 != null && (StringsKt__StringsKt.contains$default((java.lang.CharSequence) lowerCase2, (java.lang.CharSequence) strKWHzl, false, 2, (java.lang.Object) null) || C59449zhJ.startsWith$default(lowerCase3, strKWHzl, false, 2, null))) {
                                arrayList.add(obj);
                            }
                        }
                    }
                }
            }
        }
        return arrayList;
    }
}
