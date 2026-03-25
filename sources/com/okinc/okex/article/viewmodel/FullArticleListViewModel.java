package com.okinc.okex.article.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Transformations;
import androidx.lifecycle.ViewModelKt;
import com.okinc.okex.article.bean.SupportFaqArticle;
import com.okinc.okex.article.ui.FullArticleListActivity;
import com.okinc.okex.article.viewmodel.FullArticleListViewModel;
import com.okinc.okex.center.bean.enums.TopCategory;
import com.okinc.okex.rating.net.RatingResult;
import java.util.List;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.MainCoroutineDispatcher;
import o.AbstractC33073mpa;
import o.C32942mnB;
import o.C32989mnw;
import o.C44711scA;
import o.C44760scx;
import o.C45347soA;
import o.C56391yDq;
import o.C56442yFn;
import o.sxK;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class FullArticleListViewModel extends AbstractC33073mpa {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int KWHzl = 8;
    public final MutableLiveData<TopCategory> AEQbTJ;
    public final MutableLiveData<Boolean> AYXKKw;
    public final MutableLiveData<List<String>> AhwBna;
    public final LiveData<Boolean> AkhnZx;
    public final MutableLiveData<String> DbNXlk;
    public final MutableLiveData<Integer> EZpvd;
    public final MutableLiveData<List<SupportFaqArticle>> OLrzqt;
    public final MutableLiveData<C32989mnw<Throwable>> copydefault;
    public final MutableLiveData<Boolean> djBIcL;
    public final MutableLiveData<Boolean> gEmmrt;
    public final MutableLiveData<RatingResult> isConnected;
    public final MutableLiveData<FullArticleListActivity.FilterListBy> valueOf;
    public final C45347soA values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<Boolean> AYXKKw() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<String> AhwBna() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<C32989mnw<Throwable>> EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<RatingResult> KWHzl() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<Boolean> OLrzqt() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<List<SupportFaqArticle>> copydefault() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<Boolean> gEmmrt() {
        return this.gEmmrt;
    }

    @yCM
    public FullArticleListViewModel(@NotNull C45347soA c45347soA) {
        Intrinsics.checkNotNullParameter(c45347soA, "");
        this.values = c45347soA;
        this.gEmmrt = new MutableLiveData<>();
        this.copydefault = new MutableLiveData<>();
        this.OLrzqt = new MutableLiveData<>();
        MutableLiveData<Boolean> mutableLiveData = new MutableLiveData<>();
        this.AYXKKw = mutableLiveData;
        this.valueOf = new MutableLiveData<>();
        this.AhwBna = new MutableLiveData<>();
        this.AEQbTJ = new MutableLiveData<>();
        this.EZpvd = new MutableLiveData<>();
        this.DbNXlk = new MutableLiveData<>();
        MutableLiveData<RatingResult> mutableLiveData2 = new MutableLiveData<>();
        this.isConnected = mutableLiveData2;
        MutableLiveData<Boolean> mutableLiveData3 = new MutableLiveData<>(Boolean.FALSE);
        this.djBIcL = mutableLiveData3;
        this.AkhnZx = Transformations.map(C32942mnB.OLrzqt(mutableLiveData2, mutableLiveData, mutableLiveData3), new Function1() { // from class: o.sdw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(FullArticleListViewModel.OLrzqt((Triple) obj));
            }
        });
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.article.viewmodel.FullArticleListViewModel.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    public static final boolean OLrzqt(Triple triple) {
        Intrinsics.checkNotNullParameter(triple, "");
        RatingResult ratingResult = (RatingResult) triple.component1();
        Boolean bool = (Boolean) triple.component2();
        Boolean bool2 = (Boolean) triple.component3();
        Boolean bool3 = Boolean.FALSE;
        return Intrinsics.EZpvd(bool2, bool3) && Intrinsics.EZpvd(bool, bool3) && sxK.copydefault.OLrzqt(ratingResult);
    }

    public final boolean djBIcL() {
        Integer value = this.EZpvd.getValue();
        return value == null || value.intValue() <= 1;
    }

    public final void isConnected() {
        List<String> value;
        TopCategory value2;
        FullArticleListActivity.FilterListBy value3 = this.valueOf.getValue();
        if (value3 == null || (value = this.AhwBna.getValue()) == null || (value2 = this.AEQbTJ.getValue()) == null) {
            return;
        }
        AEQbTJ(value3, value, value2);
    }

    public final void AEQbTJ(@NotNull FullArticleListActivity.FilterListBy filterListBy, @NotNull List<String> list, @NotNull TopCategory topCategory) {
        Intrinsics.checkNotNullParameter(filterListBy, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(topCategory, "");
        this.valueOf.setValue(filterListBy);
        this.AhwBna.setValue(list);
        this.AEQbTJ.setValue(topCategory);
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), C44711scA.EZpvd.KWHzl(), null, new FullArticleListViewModel$fetchInitialArticleList$1(this, topCategory, null), 2, null);
    }

    public final void AEQbTJ() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new FullArticleListViewModel$fetchNextPage$1(this, null), 3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object copydefault(TopCategory topCategory, int i, Continuation<? super Unit> continuation) throws Throwable {
        FullArticleListViewModel$fetchArticles$1 fullArticleListViewModel$fetchArticles$1;
        FullArticleListViewModel fullArticleListViewModel;
        if (continuation instanceof FullArticleListViewModel$fetchArticles$1) {
            fullArticleListViewModel$fetchArticles$1 = (FullArticleListViewModel$fetchArticles$1) continuation;
            int i2 = fullArticleListViewModel$fetchArticles$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fullArticleListViewModel$fetchArticles$1.label = i2 - Integer.MIN_VALUE;
            } else {
                fullArticleListViewModel$fetchArticles$1 = new FullArticleListViewModel$fetchArticles$1(this, continuation);
            }
        }
        Object objWithContext = fullArticleListViewModel$fetchArticles$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i3 = fullArticleListViewModel$fetchArticles$1.label;
        if (i3 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            C44760scx.log$default("fetchArticles: page[" + i + "] sort[" + topCategory + "]", null, 2, null);
            CoroutineDispatcher coroutineDispatcherOLrzqt = C44711scA.EZpvd.OLrzqt();
            FullArticleListViewModel$fetchArticles$result$1 fullArticleListViewModel$fetchArticles$result$1 = new FullArticleListViewModel$fetchArticles$result$1(this, topCategory, i, null);
            fullArticleListViewModel$fetchArticles$1.L$0 = this;
            fullArticleListViewModel$fetchArticles$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcherOLrzqt, fullArticleListViewModel$fetchArticles$result$1, fullArticleListViewModel$fetchArticles$1);
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
            fullArticleListViewModel = this;
        } else {
            if (i3 != 1) {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objWithContext);
                return Unit.INSTANCE;
            }
            fullArticleListViewModel = (FullArticleListViewModel) fullArticleListViewModel$fetchArticles$1.L$0;
            C56391yDq.AEQbTJ(objWithContext);
        }
        MainCoroutineDispatcher mainCoroutineDispatcherKWHzl = C44711scA.EZpvd.KWHzl();
        FullArticleListViewModel$fetchArticles$2 fullArticleListViewModel$fetchArticles$2 = new FullArticleListViewModel$fetchArticles$2((C45347soA.ActionBar) objWithContext, fullArticleListViewModel, null);
        fullArticleListViewModel$fetchArticles$1.L$0 = null;
        fullArticleListViewModel$fetchArticles$1.label = 2;
        if (BuildersKt.withContext(mainCoroutineDispatcherKWHzl, fullArticleListViewModel$fetchArticles$2, fullArticleListViewModel$fetchArticles$1) == objCopydefault) {
            return objCopydefault;
        }
        return Unit.INSTANCE;
    }

    public final Object KWHzl(List<SupportFaqArticle> list, Continuation<? super String> continuation) {
        return BuildersKt.withContext(C44711scA.EZpvd.EZpvd(), new FullArticleListViewModel$collectSectionSlugs$2(list, null), continuation);
    }

    public final void valueOf() {
        this.djBIcL.setValue(Boolean.TRUE);
    }
}
