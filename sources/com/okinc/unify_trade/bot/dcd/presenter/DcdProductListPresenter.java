package com.okinc.unify_trade.bot.dcd.presenter;

import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.TradeLiveData;
import com.okinc.uilab.view.OKSortTextView;
import com.okinc.unify_trade.biz.ProductItemResp;
import com.okinc.unify_trade.bot.data.DcdProductListReq;
import com.okinc.unify_trade.bot.dcd.config.DcdProductSortCategory;
import com.okinc.unify_trade.refactor.presenter.AbsPresenter;
import java.util.Comparator;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import o.C33129mqd;
import o.C54237xAz;
import o.C55804xqp;
import o.C56402yEa;
import o.InterfaceC54501xKt;
import o.xKK;
import o.yDY;
import o.yET;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class DcdProductListPresenter extends AbsPresenter {
    public DcdProductSortCategory AEQbTJ;
    public final TradeLiveData<List<ProductItemResp>> EZpvd;
    public DcdProductListReq KWHzl;
    public List<ProductItemResp> OLrzqt;
    public final C54237xAz copydefault;
    public OKSortTextView.SortType valueOf;

    public final /* synthetic */ class StateListAnimator {
        public static final /* synthetic */ int[] OLrzqt;
        public static final /* synthetic */ int[] copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[OKSortTextView.SortType.values().length];
            try {
                iArr[OKSortTextView.SortType.UP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OKSortTextView.SortType.DOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            OLrzqt = iArr;
            int[] iArr2 = new int[DcdProductSortCategory.values().length];
            try {
                iArr2[DcdProductSortCategory.STRIKE.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[DcdProductSortCategory.TERM.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[DcdProductSortCategory.APR.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            copydefault = iArr2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<List<ProductItemResp>> AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(DcdProductListReq dcdProductListReq) {
        this.KWHzl = dcdProductListReq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DcdProductListReq EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(@NotNull List<ProductItemResp> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.OLrzqt = list;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DcdProductListPresenter(@NotNull android.app.Application application, @NotNull SavedStateHandle savedStateHandle) {
        super(application, savedStateHandle);
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        this.copydefault = new C54237xAz();
        this.EZpvd = new TradeLiveData<>();
        this.OLrzqt = yDY.AhwBna();
    }

    public final void KWHzl(String str, String str2) {
        DcdProductListReq dcdProductListReq = this.KWHzl;
        if (dcdProductListReq == null) {
            return;
        }
        C54237xAz c54237xAz = this.copydefault;
        if (dcdProductListReq == null) {
            return;
        }
        c54237xAz.AEQbTJ(dcdProductListReq);
        c54237xAz.EZpvd(str);
        c54237xAz.copydefault(str2);
        c54237xAz.OLrzqt(this.EZpvd, new ActionBar());
        c54237xAz.OLrzqt(true);
    }

    public static final class ActionBar implements InterfaceC54501xKt<C55804xqp<List<? extends ProductItemResp>>, List<? extends ProductItemResp>> {
        public ActionBar() {
        }

        /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // o.InterfaceC54501xKt
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public List<ProductItemResp> KWHzl(C55804xqp<List<ProductItemResp>> c55804xqp) {
            Intrinsics.checkNotNullParameter(c55804xqp, "");
            DcdProductListPresenter.this.OLrzqt(c55804xqp.copydefault());
            return DcdProductListPresenter.this.OLrzqt();
        }
    }

    public final List<ProductItemResp> OLrzqt() {
        OKSortTextView.SortType sortType = this.valueOf;
        int i = sortType == null ? -1 : StateListAnimator.OLrzqt[sortType.ordinal()];
        if (i != 1) {
            return i != 2 ? this.OLrzqt : CollectionsKt___CollectionsKt.EZpvd(this.OLrzqt, new Application());
        }
        return CollectionsKt___CollectionsKt.EZpvd(this.OLrzqt, new Activity());
    }

    public final void KWHzl(@NotNull DcdProductSortCategory dcdProductSortCategory, @NotNull OKSortTextView.SortType sortType) {
        Intrinsics.checkNotNullParameter(dcdProductSortCategory, "");
        Intrinsics.checkNotNullParameter(sortType, "");
        this.AEQbTJ = dcdProductSortCategory;
        this.valueOf = sortType;
        this.EZpvd.postValue(OLrzqt());
    }

    public final double copydefault(DcdProductSortCategory dcdProductSortCategory, ProductItemResp productItemResp) {
        String strike;
        int i = dcdProductSortCategory == null ? -1 : StateListAnimator.copydefault[dcdProductSortCategory.ordinal()];
        if (i == 1) {
            strike = productItemResp.getStrike();
        } else if (i == 2) {
            strike = productItemResp.getTerm();
        } else {
            strike = i != 3 ? "" : productItemResp.getAnnualYieldPercentage();
        }
        return C33129mqd.AEQbTJ(strike);
    }

    @Override // com.okinc.unify_trade.refactor.presenter.AbsPresenter
    public List<xKK> getUseCaseList() {
        return C56402yEa.EZpvd(this.copydefault);
    }

    public static final class Activity<T> implements Comparator {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity() {
        }

        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            DcdProductListPresenter dcdProductListPresenter = DcdProductListPresenter.this;
            double dCopydefault = dcdProductListPresenter.copydefault(dcdProductListPresenter.AEQbTJ, (ProductItemResp) t);
            DcdProductListPresenter dcdProductListPresenter2 = DcdProductListPresenter.this;
            return yET.KWHzl(Double.valueOf(dCopydefault), Double.valueOf(dcdProductListPresenter2.copydefault(dcdProductListPresenter2.AEQbTJ, (ProductItemResp) t2)));
        }
    }

    public static final class Application<T> implements Comparator {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application() {
        }

        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            DcdProductListPresenter dcdProductListPresenter = DcdProductListPresenter.this;
            double dCopydefault = dcdProductListPresenter.copydefault(dcdProductListPresenter.AEQbTJ, (ProductItemResp) t2);
            DcdProductListPresenter dcdProductListPresenter2 = DcdProductListPresenter.this;
            return yET.KWHzl(Double.valueOf(dCopydefault), Double.valueOf(dcdProductListPresenter2.copydefault(dcdProductListPresenter2.AEQbTJ, (ProductItemResp) t)));
        }
    }
}
