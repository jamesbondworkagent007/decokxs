package com.okinc.okex.article.ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Checkable;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.ConcatAdapter;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.biz.event.SupportCenterEvent;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.liveness.lca.EopTrackEvent;
import com.okinc.okex.article.bean.SupportFaqArticle;
import com.okinc.okex.article.ui.FullArticleListActivity;
import com.okinc.okex.article.viewmodel.FullArticleListViewModel;
import com.okinc.okex.center.bean.enums.TopCategory;
import com.okinc.okex.center.ui.adapter.LoadingAdapter;
import com.okinc.okex.center.ui.adapter.RatingChatbotAdapter;
import com.okinc.okex.rating.net.RatingResult;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.AbstractActivityC44814sdy;
import o.AbstractC47304tnX;
import o.ActivityC44038sBa;
import o.C32991mny;
import o.C33070mpX;
import o.C33546myW;
import o.C44728scR;
import o.C44810sdu;
import o.C44987shL;
import o.C45144skJ;
import o.C45359soM;
import o.C45363soQ;
import o.C45393sou;
import o.C47315tni;
import o.C52761wXj;
import o.C55052xcf;
import o.C55173xeu;
import o.C55296xhK;
import o.C56392yDr;
import o.C56444yFp;
import o.C56524yIo;
import o.InterfaceC56387yDm;
import o.InterfaceC56388yDn;
import o.InterfaceC56445yFq;
import o.InterfaceC56514yIe;
import o.InterfaceC57900yrD;
import o.InterfaceC57934yrl;
import o.rVN;
import o.sxK;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class FullArticleListActivity extends AbstractActivityC44814sdy implements C44728scR.Activity, RatingChatbotAdapter.ActionBar {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int OLrzqt = 8;
    public final InterfaceC56387yDm DbNXlk;
    public final InterfaceC56387yDm EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.scW
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return FullArticleListActivity.fetchVPNInfo(this.copydefault);
        }
    });
    public final InterfaceC56387yDm AhwBna = C56392yDr.copydefault(new Function0() { // from class: o.sde
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return FullArticleListActivity.AhwBna();
        }
    });
    public final InterfaceC56387yDm copydefault = C56392yDr.copydefault(new Function0() { // from class: o.sdb
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return FullArticleListActivity.valueOf();
        }
    });
    public final InterfaceC56387yDm gEmmrt = C56392yDr.copydefault(new Function0() { // from class: o.sdc
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return FullArticleListActivity.values(this.EZpvd);
        }
    });
    public final InterfaceC56387yDm AYXKKw = C56392yDr.copydefault(new Function0() { // from class: o.sdd
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return FullArticleListActivity.wlaJM();
        }
    });
    public final InterfaceC56387yDm KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.sdg
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return FullArticleListActivity.gEmmrt();
        }
    });
    public final InterfaceC56387yDm AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.sdh
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return FullArticleListActivity.valueOf(this.OLrzqt);
        }
    });
    public final InterfaceC56387yDm valueOf = C56392yDr.copydefault(new Function0() { // from class: o.sdf
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return FullArticleListActivity.AkhnZx(this.AEQbTJ);
        }
    });
    public final InterfaceC56387yDm djBIcL = C56392yDr.copydefault(new Function0() { // from class: o.sdi
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return FullArticleListActivity.DbNXlk(this.AEQbTJ);
        }
    });
    public final InterfaceC56387yDm AkhnZx = C56392yDr.copydefault(new Function0() { // from class: o.sdn
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return FullArticleListActivity.fIwbmz(this.EZpvd);
        }
    });
    public final InterfaceC56387yDm values = C56392yDr.copydefault(new Function0() { // from class: o.sda
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return FullArticleListActivity.isConnected(this.copydefault);
        }
    });

    public static final /* synthetic */ class ActionBar implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.copydefault = function1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean equals(Object obj) {
            if ((obj instanceof Observer) && (obj instanceof InterfaceC56514yIe)) {
                return Intrinsics.EZpvd(getFunctionDelegate(), ((InterfaceC56514yIe) obj).getFunctionDelegate());
            }
            return false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC56514yIe
        public final InterfaceC56388yDn<?> getFunctionDelegate() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.copydefault.invoke(obj);
        }
    }

    public final /* synthetic */ class Activity {
        public static final /* synthetic */ int[] OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[FullArticleListRequest.FullArticleListSource.values().length];
            try {
                iArr[FullArticleListRequest.FullArticleListSource.FAQS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            OLrzqt = iArr;
        }
    }

    @Override // com.okinc.okex.common.ui.OKSupportBaseActivity
    public boolean AYXKKw() {
        return true;
    }

    public FullArticleListActivity() {
        final Function0 function0 = null;
        this.DbNXlk = new ViewModelLazy(C56524yIo.AEQbTJ(FullArticleListViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.okex.article.ui.FullArticleListActivity$special$$inlined$viewModels$default$2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = this.getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
                return viewModelStore;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.okex.article.ui.FullArticleListActivity$special$$inlined$viewModels$default$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
                return defaultViewModelProviderFactory;
            }
        }, new Function0<CreationExtras>() { // from class: com.okinc.okex.article.ui.FullArticleListActivity$special$$inlined$viewModels$default$3
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function02 = function0;
                if (function02 != null && (creationExtras = (CreationExtras) function02.invoke()) != null) {
                    return creationExtras;
                }
                CreationExtras defaultViewModelCreationExtras = this.getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "");
                return defaultViewModelCreationExtras;
            }
        });
    }

    public final AbstractC47304tnX values() {
        return (AbstractC47304tnX) this.EZpvd.getValue();
    }

    public static final AbstractC47304tnX fetchVPNInfo(FullArticleListActivity fullArticleListActivity) {
        return AbstractC47304tnX.AEQbTJ(fullArticleListActivity.getLayoutInflater());
    }

    public final C44728scR fARcdN() {
        return (C44728scR) this.AhwBna.getValue();
    }

    public static final C44728scR AhwBna() {
        return C44728scR.Companion.EZpvd();
    }

    public final FullArticleListViewModel fIwbmz() {
        return (FullArticleListViewModel) this.DbNXlk.getValue();
    }

    private final C44810sdu uzCIH() {
        return (C44810sdu) this.copydefault.getValue();
    }

    public static final C44810sdu valueOf() {
        return new C44810sdu(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    private final RatingChatbotAdapter hDKMBd() {
        return (RatingChatbotAdapter) this.gEmmrt.getValue();
    }

    public static final RatingChatbotAdapter values(FullArticleListActivity fullArticleListActivity) {
        RatingChatbotAdapter ratingChatbotAdapter = new RatingChatbotAdapter();
        ratingChatbotAdapter.EZpvd(true);
        ratingChatbotAdapter.AEQbTJ(fullArticleListActivity);
        return ratingChatbotAdapter;
    }

    private final LoadingAdapter getNewProxyInstance() {
        return (LoadingAdapter) this.AYXKKw.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LoadingAdapter wlaJM() {
        return new LoadingAdapter(LoadingAdapter.LoadingStyle.ARTICLES);
    }

    public final C44987shL fetchVPNInfo() {
        return (C44987shL) this.KWHzl.getValue();
    }

    public static final C44987shL gEmmrt() {
        return new C44987shL();
    }

    public final String djBIcL() {
        return (String) this.AEQbTJ.getValue();
    }

    public static final String valueOf(FullArticleListActivity fullArticleListActivity) {
        Intent intent = fullArticleListActivity.getIntent();
        String stringExtra = intent != null ? intent.getStringExtra("ARG_LIST_HEADER") : null;
        if (stringExtra != null) {
            return stringExtra;
        }
        throw new IllegalArgumentException("List Header not found".toString());
    }

    public final FilterListBy DbNXlk() {
        return (FilterListBy) this.valueOf.getValue();
    }

    public static final FilterListBy AkhnZx(FullArticleListActivity fullArticleListActivity) {
        Intent intent = fullArticleListActivity.getIntent();
        String stringExtra = intent != null ? intent.getStringExtra("ARG_FILTER_LIST_BY") : null;
        if (stringExtra == null) {
            stringExtra = "";
        }
        FilterListBy filterListByValueOf = FilterListBy.valueOf(stringExtra);
        if (filterListByValueOf != null) {
            return filterListByValueOf;
        }
        throw new IllegalArgumentException("Filter Type not found".toString());
    }

    public final List<String> isConnected() {
        return (List) this.djBIcL.getValue();
    }

    public static final ArrayList DbNXlk(FullArticleListActivity fullArticleListActivity) {
        Intent intent = fullArticleListActivity.getIntent();
        ArrayList<String> stringArrayListExtra = intent != null ? intent.getStringArrayListExtra("ARG_FILTER_IDS") : null;
        if (stringArrayListExtra != null) {
            return stringArrayListExtra;
        }
        throw new IllegalArgumentException("Filter IDs not found".toString());
    }

    public final String ejfBZ() {
        return (String) this.AkhnZx.getValue();
    }

    public static final String fIwbmz(FullArticleListActivity fullArticleListActivity) {
        Intent intent = fullArticleListActivity.getIntent();
        String stringExtra = intent != null ? intent.getStringExtra("ARG_TOPIC_SLUG") : null;
        return stringExtra == null ? "" : stringExtra;
    }

    public final FullArticleListRequest.FullArticleListSource fJNWhG() {
        return (FullArticleListRequest.FullArticleListSource) this.values.getValue();
    }

    public static final FullArticleListRequest.FullArticleListSource isConnected(FullArticleListActivity fullArticleListActivity) {
        return FullArticleListRequest.FullArticleListSource.values()[fullArticleListActivity.getIntent().getIntExtra("ARG_SOURCE", FullArticleListRequest.FullArticleListSource.OTHERS.ordinal())];
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class FilterListBy {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ FilterListBy[] $VALUES;
        public static final FilterListBy TAGS = new FilterListBy("TAGS", 0);
        public static final FilterListBy SECTIONS = new FilterListBy("SECTIONS", 1);
        public static final FilterListBy TRANSACTION_TYPE = new FilterListBy("TRANSACTION_TYPE", 2);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ FilterListBy[] $values() {
            return new FilterListBy[]{TAGS, SECTIONS, TRANSACTION_TYPE};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<FilterListBy> getEntries() {
            return $ENTRIES;
        }

        private FilterListBy(String str, int i) {
        }

        static {
            FilterListBy[] filterListByArr$values = $values();
            $VALUES = filterListByArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(filterListByArr$values);
        }

        public static FilterListBy valueOf(String str) {
            return (FilterListBy) Enum.valueOf(FilterListBy.class, str);
        }

        public static FilterListBy[] values() {
            return (FilterListBy[]) $VALUES.clone();
        }
    }

    public static final class FullArticleListRequest {
        public final String AEQbTJ;
        public final String AYXKKw;
        public final String AhwBna;
        public final String EZpvd;
        public final List<String> KWHzl;
        public final FullArticleListSource OLrzqt;
        public final FilterListBy copydefault;
        public final String valueOf;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final FullArticleListSource AEQbTJ() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String AhwBna() {
            return this.AhwBna;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<String> EZpvd() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final FilterListBy KWHzl() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final FullArticleListRequest OLrzqt(@NotNull String str, @NotNull FilterListBy filterListBy, @NotNull List<String> list, @NotNull FullArticleListSource fullArticleListSource, String str2, String str3, String str4, String str5) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(filterListBy, "");
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(fullArticleListSource, "");
            return new FullArticleListRequest(str, filterListBy, list, fullArticleListSource, str2, str3, str4, str5);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String OLrzqt() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String copydefault() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FullArticleListRequest)) {
                return false;
            }
            FullArticleListRequest fullArticleListRequest = (FullArticleListRequest) obj;
            return Intrinsics.EZpvd((Object) this.EZpvd, (Object) fullArticleListRequest.EZpvd) && this.copydefault == fullArticleListRequest.copydefault && Intrinsics.EZpvd(this.KWHzl, fullArticleListRequest.KWHzl) && this.OLrzqt == fullArticleListRequest.OLrzqt && Intrinsics.EZpvd((Object) this.valueOf, (Object) fullArticleListRequest.valueOf) && Intrinsics.EZpvd((Object) this.AhwBna, (Object) fullArticleListRequest.AhwBna) && Intrinsics.EZpvd((Object) this.AYXKKw, (Object) fullArticleListRequest.AYXKKw) && Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) fullArticleListRequest.AEQbTJ);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String gEmmrt() {
            return this.valueOf;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.EZpvd.hashCode();
            int iHashCode2 = this.copydefault.hashCode();
            int iHashCode3 = this.KWHzl.hashCode();
            int iHashCode4 = this.OLrzqt.hashCode();
            String str = this.valueOf;
            int iHashCode5 = str == null ? 0 : str.hashCode();
            String str2 = this.AhwBna;
            int iHashCode6 = str2 == null ? 0 : str2.hashCode();
            String str3 = this.AYXKKw;
            int iHashCode7 = str3 == null ? 0 : str3.hashCode();
            String str4 = this.AEQbTJ;
            return (((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + (str4 != null ? str4.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "FullArticleListRequest(articleListHeader=" + this.EZpvd + ", filterListBy=" + this.copydefault + ", filterByIds=" + this.KWHzl + ", source=" + this.OLrzqt + ", topicSlug=" + this.valueOf + ", transactionStatus=" + this.AhwBna + ", transactionType=" + this.AYXKKw + ", recommendationTopic=" + this.AEQbTJ + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String valueOf() {
            return this.AYXKKw;
        }

        public FullArticleListRequest(@NotNull String str, @NotNull FilterListBy filterListBy, @NotNull List<String> list, @NotNull FullArticleListSource fullArticleListSource, String str2, String str3, String str4, String str5) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(filterListBy, "");
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(fullArticleListSource, "");
            this.EZpvd = str;
            this.copydefault = filterListBy;
            this.KWHzl = list;
            this.OLrzqt = fullArticleListSource;
            this.valueOf = str2;
            this.AhwBna = str3;
            this.AYXKKw = str4;
            this.AEQbTJ = str5;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0030: CONSTRUCTOR 
  (r12v0 java.lang.String)
  (r13v0 com.okinc.okex.article.ui.FullArticleListActivity$FilterListBy)
  (r14v0 java.util.List)
  (wrap:com.okinc.okex.article.ui.FullArticleListActivity$FullArticleListRequest$FullArticleListSource:?: TERNARY null = ((wrap:int:0x0002: ARITH (r20v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0008: SGET  A[WRAPPED] (LINE:111) com.okinc.okex.article.ui.FullArticleListActivity.FullArticleListRequest.FullArticleListSource.OTHERS com.okinc.okex.article.ui.FullArticleListActivity$FullArticleListRequest$FullArticleListSource) : (r15v0 com.okinc.okex.article.ui.FullArticleListActivity$FullArticleListRequest$FullArticleListSource))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r20v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r20v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r20v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r20v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r19v0 java.lang.String))
 A[MD:(java.lang.String, com.okinc.okex.article.ui.FullArticleListActivity$FilterListBy, java.util.List<java.lang.String>, com.okinc.okex.article.ui.FullArticleListActivity$FullArticleListRequest$FullArticleListSource, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:107) call: com.okinc.okex.article.ui.FullArticleListActivity.FullArticleListRequest.<init>(java.lang.String, com.okinc.okex.article.ui.FullArticleListActivity$FilterListBy, java.util.List, com.okinc.okex.article.ui.FullArticleListActivity$FullArticleListRequest$FullArticleListSource, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
        public /* synthetic */ FullArticleListRequest(String str, FilterListBy filterListBy, List list, FullArticleListSource fullArticleListSource, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, filterListBy, list, (i & 8) != 0 ? FullArticleListSource.OTHERS : fullArticleListSource, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? null : str4, (i & 128) != 0 ? null : str5);
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class FullArticleListSource {
            private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
            private static final /* synthetic */ FullArticleListSource[] $VALUES;
            public static final FullArticleListSource FAQS = new FullArticleListSource("FAQS", 0);
            public static final FullArticleListSource OTHERS = new FullArticleListSource("OTHERS", 1);

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private static final /* synthetic */ FullArticleListSource[] $values() {
                return new FullArticleListSource[]{FAQS, OTHERS};
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static InterfaceC56445yFq<FullArticleListSource> getEntries() {
                return $ENTRIES;
            }

            private FullArticleListSource(String str, int i) {
            }

            static {
                FullArticleListSource[] fullArticleListSourceArr$values = $values();
                $VALUES = fullArticleListSourceArr$values;
                $ENTRIES = C56444yFp.AEQbTJ(fullArticleListSourceArr$values);
            }

            public static FullArticleListSource valueOf(String str) {
                return (FullArticleListSource) Enum.valueOf(FullArticleListSource.class, str);
            }

            public static FullArticleListSource[] values() {
                return (FullArticleListSource[]) $VALUES.clone();
            }
        }
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.article.ui.FullArticleListActivity.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final Intent OLrzqt(@NotNull Context context, @NotNull FullArticleListRequest fullArticleListRequest) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(fullArticleListRequest, "");
            Intent intent = new Intent(context.getApplicationContext(), (Class<?>) FullArticleListActivity.class);
            intent.putExtra("ARG_LIST_HEADER", fullArticleListRequest.copydefault());
            intent.putExtra("ARG_FILTER_LIST_BY", fullArticleListRequest.KWHzl().name());
            intent.putExtra("ARG_SOURCE", fullArticleListRequest.AEQbTJ().ordinal());
            intent.putExtra("ARG_TOPIC_SLUG", fullArticleListRequest.gEmmrt());
            intent.putExtra("ARG_TRANSACTION_TYPE", fullArticleListRequest.valueOf());
            intent.putExtra("ARG_TRANSACTION_STATUS", fullArticleListRequest.AhwBna());
            intent.putExtra("ARG_RECOMMENDATION_TOPIC", fullArticleListRequest.OLrzqt());
            intent.putStringArrayListExtra("ARG_FILTER_IDS", new ArrayList<>(fullArticleListRequest.EZpvd()));
            return intent;
        }
    }

    @Override // com.okinc.okex.common.ui.OKSupportBaseActivity
    public View AkhnZx() {
        View root = values().getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        return root;
    }

    @Override // com.okinc.okex.common.ui.OKSupportBaseActivity
    public void initFrameContent(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "");
        AbstractC47304tnX abstractC47304tnXValues = values();
        KWHzl(djBIcL());
        EZpvd(C52761wXj.TaskDescription.UJpkuA, C47315tni.Activity.djBIcL, new View.OnClickListener() { // from class: o.sdq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                FullArticleListActivity.AEQbTJ(this.EZpvd, view2);
            }
        });
        C55052xcf c55052xcf = abstractC47304tnXValues.OLrzqt;
        Integer displayStringId = TopCategory.Trending.getDisplayStringId();
        String strAYXKKw = displayStringId != null ? C33070mpX.AYXKKw(displayStringId.intValue()) : null;
        if (strAYXKKw == null) {
            strAYXKKw = "";
        }
        c55052xcf.setTitle(strAYXKKw);
        c55052xcf.setOnClickListener(new TaskDescription(c55052xcf, 1000L, this));
        hDKMBd().AEQbTJ(this);
        abstractC47304tnXValues.AEQbTJ.addItemDecoration(new C45393sou(hDKMBd(), getResources().getDimensionPixelSize(C52761wXj.StateListAnimator.ODWQjV), 0, true, 4, null));
        abstractC47304tnXValues.AEQbTJ.setAdapter(new ConcatAdapter((RecyclerView.Adapter<? extends RecyclerView.ViewHolder>[]) new RecyclerView.Adapter[]{getNewProxyInstance(), uzCIH(), fetchVPNInfo(), hDKMBd()}));
        abstractC47304tnXValues.KWHzl.KWHzl(new InterfaceC57900yrD() { // from class: o.sdr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC57900yrD
            public final void EZpvd(InterfaceC57934yrl interfaceC57934yrl) {
                FullArticleListActivity.copydefault(this.EZpvd, interfaceC57934yrl);
            }
        });
        C55173xeu c55173xeu = abstractC47304tnXValues.EZpvd;
        Intrinsics.checkNotNullExpressionValue(c55173xeu, "");
        new C45144skJ(c55173xeu).KWHzl(new View.OnClickListener() { // from class: o.sdp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                FullArticleListActivity.KWHzl(this.EZpvd, view2);
            }
        });
        AuCTelauCTel();
        AuCTel();
    }

    public static final void AEQbTJ(FullArticleListActivity fullArticleListActivity, View view) {
        fullArticleListActivity.startActivity(ActivityC44038sBa.Application.createIntent$default(ActivityC44038sBa.Companion, fullArticleListActivity, SupportCenterEvent.ArticlePageParam.FullArticleList.getValue(), null, 4, null));
    }

    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ View AEQbTJ;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ FullArticleListActivity copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(View view, long j, FullArticleListActivity fullArticleListActivity) {
            this.AEQbTJ = view;
            this.OLrzqt = j;
            this.copydefault = fullArticleListActivity;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.OLrzqt || (this.AEQbTJ instanceof Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                C44728scR c44728scRFARcdN = this.copydefault.fARcdN();
                FragmentManager supportFragmentManager = this.copydefault.getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
                c44728scRFARcdN.show(supportFragmentManager);
            }
        }
    }

    public static final void copydefault(FullArticleListActivity fullArticleListActivity, InterfaceC57934yrl interfaceC57934yrl) {
        Intrinsics.checkNotNullParameter(interfaceC57934yrl, "");
        fullArticleListActivity.fIwbmz().AEQbTJ();
    }

    public static final void KWHzl(FullArticleListActivity fullArticleListActivity, View view) {
        fullArticleListActivity.fIwbmz().isConnected();
    }

    @Override // o.C44728scR.Activity
    public void AEQbTJ(@NotNull TopCategory topCategory) {
        Intrinsics.checkNotNullParameter(topCategory, "");
        C55052xcf c55052xcf = values().OLrzqt;
        Integer displayStringId = topCategory.getDisplayStringId();
        String strAYXKKw = displayStringId != null ? C33070mpX.AYXKKw(displayStringId.intValue()) : null;
        c55052xcf.setTitle(strAYXKKw != null ? strAYXKKw : "");
        fIwbmz().AEQbTJ(DbNXlk(), isConnected(), topCategory);
    }

    @Override // com.okinc.okex.center.ui.adapter.RatingChatbotAdapter.ActionBar
    public void copydefault(final boolean z) {
        C45363soQ.onSessionIdEvent$default("SupportCenter_Btm_HelpfulButton_Click", false, new Function1() { // from class: o.scX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return FullArticleListActivity.copydefault(this.AEQbTJ, z, (EventParamsList) obj);
            }
        }, 1, null);
        fIwbmz().valueOf();
        RatingResult value = fIwbmz().KWHzl().getValue();
        if (value != null) {
            sxK.copydefault.KWHzl(this, value, z);
        }
    }

    public static final Unit copydefault(FullArticleListActivity fullArticleListActivity, boolean z, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        Function1<EventParamsList, Unit> function1Copydefault = fullArticleListActivity.hDKMBd().copydefault();
        if (function1Copydefault != null) {
            function1Copydefault.invoke(eventParamsList);
        }
        eventParamsList.put(EopTrackEvent.KEY_BUTTON_NAME, z ? "yes" : "no", true);
        return Unit.INSTANCE;
    }

    @Override // com.okinc.okex.center.ui.adapter.RatingChatbotAdapter.ActionBar
    public void iwGUEr() {
        final String strEjfBZ;
        if (Activity.OLrzqt[fJNWhG().ordinal()] == 1) {
            strEjfBZ = fIwbmz().AhwBna().getValue();
            if (strEjfBZ == null) {
                strEjfBZ = "";
            }
        } else {
            strEjfBZ = ejfBZ();
        }
        C45363soQ.onSessionIdEvent$default("SupportCenter_FAQsection_Chatbot_Click", false, new Function1() { // from class: o.scV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return FullArticleListActivity.copydefault(strEjfBZ, (EventParamsList) obj);
            }
        }, 1, null);
        C45359soM.copydefault.KWHzl();
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new FullArticleListActivity$onChatbotClicked$2(this, strEjfBZ, null), 3, null);
    }

    public static final Unit copydefault(String str, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "section", str, false, 4, null);
        return Unit.INSTANCE;
    }

    private final void AuCTelauCTel() {
        fIwbmz().gEmmrt().observe(this, new ActionBar(new Function1() { // from class: o.sdj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return FullArticleListActivity.AEQbTJ(this.OLrzqt, (java.lang.Boolean) obj);
            }
        }));
        fIwbmz().copydefault().observe(this, new ActionBar(new Function1() { // from class: o.sdl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return FullArticleListActivity.OLrzqt(this.KWHzl, (java.util.List) obj);
            }
        }));
        fIwbmz().OLrzqt().observe(this, new ActionBar(new Function1() { // from class: o.sdo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return FullArticleListActivity.EZpvd(this.copydefault, (java.lang.Boolean) obj);
            }
        }));
        fIwbmz().AYXKKw().observe(this, new ActionBar(new Function1() { // from class: o.sdm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return FullArticleListActivity.valueOf(this.KWHzl, (java.lang.Boolean) obj);
            }
        }));
        fIwbmz().EZpvd().observe(this, new C32991mny(new Function1() { // from class: o.sdk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return FullArticleListActivity.OLrzqt(this.AEQbTJ, (java.lang.Throwable) obj);
            }
        }));
        fIwbmz().AEQbTJ(DbNXlk(), isConnected(), TopCategory.Trending);
    }

    public static final Unit AEQbTJ(FullArticleListActivity fullArticleListActivity, Boolean bool) {
        if (bool.booleanValue()) {
            fullArticleListActivity.EZpvd(true);
        }
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(FullArticleListActivity fullArticleListActivity, List list) {
        if (list != null && (!list.isEmpty())) {
            if (fullArticleListActivity.fIwbmz().djBIcL()) {
                fullArticleListActivity.uzCIH().copydefault((List<SupportFaqArticle>) list);
                fullArticleListActivity.values().AEQbTJ.scrollToPosition(0);
            } else {
                fullArticleListActivity.uzCIH().KWHzl((List<SupportFaqArticle>) list);
            }
        } else if (fullArticleListActivity.fIwbmz().djBIcL()) {
            C44987shL.updateEmptyProperties$default(fullArticleListActivity.fetchVPNInfo(), 6, C33070mpX.AYXKKw(C47315tni.PendingIntent.AubY), null, null, 12, null);
        }
        fullArticleListActivity.EZpvd(false);
        rVN.reportFullyDrawn$default((android.app.Activity) fullArticleListActivity, true, (String) null, 2, (Object) null);
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(FullArticleListActivity fullArticleListActivity, Boolean bool) {
        C33546myW c33546myW = fullArticleListActivity.values().KWHzl;
        Intrinsics.copydefault(bool);
        c33546myW.AhwBna(bool.booleanValue());
        fullArticleListActivity.hDKMBd().EZpvd(!bool.booleanValue());
        return Unit.INSTANCE;
    }

    public static final Unit valueOf(FullArticleListActivity fullArticleListActivity, Boolean bool) {
        if (bool.booleanValue()) {
            fullArticleListActivity.hDKMBd().KWHzl();
        } else {
            fullArticleListActivity.hDKMBd().EZpvd();
        }
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(FullArticleListActivity fullArticleListActivity, Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        AbstractC47304tnX abstractC47304tnXValues = fullArticleListActivity.values();
        fullArticleListActivity.EZpvd(false);
        C55173xeu c55173xeu = abstractC47304tnXValues.EZpvd;
        Intrinsics.checkNotNullExpressionValue(c55173xeu, "");
        c55173xeu.setVisibility(0);
        C33546myW c33546myW = abstractC47304tnXValues.KWHzl;
        Intrinsics.checkNotNullExpressionValue(c33546myW, "");
        c33546myW.setVisibility(8);
        rVN.reportFullyDrawn$default((android.app.Activity) fullArticleListActivity, false, (String) null, 2, (Object) null);
        return Unit.INSTANCE;
    }

    public final void EZpvd(boolean z) {
        AbstractC47304tnX abstractC47304tnXValues = values();
        C33546myW c33546myW = abstractC47304tnXValues.KWHzl;
        Intrinsics.checkNotNullExpressionValue(c33546myW, "");
        boolean z2 = false;
        c33546myW.setVisibility(0);
        C55173xeu c55173xeu = abstractC47304tnXValues.EZpvd;
        Intrinsics.checkNotNullExpressionValue(c55173xeu, "");
        c55173xeu.setVisibility(8);
        if (z) {
            hDKMBd().EZpvd(false);
            abstractC47304tnXValues.KWHzl.AhwBna(false);
        }
        if (!z) {
            abstractC47304tnXValues.KWHzl.valueOf();
        }
        getNewProxyInstance().AEQbTJ(z);
        uzCIH().EZpvd(!z);
        C44987shL c44987shLFetchVPNInfo = fetchVPNInfo();
        if (!z && uzCIH().getItemCount() == 0) {
            z2 = true;
        }
        c44987shLFetchVPNInfo.AEQbTJ(z2);
    }

    public final void AuCTel() {
        final String value;
        if (fJNWhG() == FullArticleListRequest.FullArticleListSource.FAQS) {
            value = SupportCenterEvent.ArticlePageParam.Faq.getValue();
        } else {
            value = SupportCenterEvent.ArticlePageParam.FullArticleList.getValue();
        }
        uzCIH().copydefault(new Function1() { // from class: o.scZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return FullArticleListActivity.OLrzqt(value, this, (EventParamsList) obj);
            }
        });
        hDKMBd().copydefault(new Function1() { // from class: o.scY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return FullArticleListActivity.copydefault(value, this, (EventParamsList) obj);
            }
        });
    }

    public static final Unit OLrzqt(String str, FullArticleListActivity fullArticleListActivity, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("page", str, true);
        EventParamsList.put$default(eventParamsList, "page_topic_name", fullArticleListActivity.ejfBZ(), false, 4, null);
        Intent intent = fullArticleListActivity.getIntent();
        String stringExtra = intent != null ? intent.getStringExtra("ARG_TRANSACTION_TYPE") : null;
        EventParamsList.put$default(eventParamsList, "page_transaction_type", stringExtra == null ? "" : stringExtra, false, 4, null);
        Intent intent2 = fullArticleListActivity.getIntent();
        String stringExtra2 = intent2 != null ? intent2.getStringExtra("ARG_TRANSACTION_STATUS") : null;
        EventParamsList.put$default(eventParamsList, "page_transaction_status", stringExtra2 == null ? "" : stringExtra2, false, 4, null);
        Intent intent3 = fullArticleListActivity.getIntent();
        String stringExtra3 = intent3 != null ? intent3.getStringExtra("ARG_RECOMMENDATION_TOPIC") : null;
        EventParamsList.put$default(eventParamsList, "page_recommendation_type", stringExtra3 == null ? "" : stringExtra3, false, 4, null);
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(String str, FullArticleListActivity fullArticleListActivity, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("page", str, true);
        EventParamsList.put$default(eventParamsList, "page_topic_name", fullArticleListActivity.ejfBZ(), false, 4, null);
        eventParamsList.put("mini_support_page", "false", true);
        return Unit.INSTANCE;
    }

    @Override // o.AbstractActivityC44814sdy, com.okinc.okex.common.ui.OKSupportBaseActivity, o.AbstractActivityC45319snZ, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC44814sdy, com.okinc.okex.common.ui.OKSupportBaseActivity, o.AbstractActivityC45319snZ, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC44814sdy, com.okinc.okex.common.ui.OKSupportBaseActivity, o.AbstractActivityC45319snZ, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.AbstractActivityC44814sdy, com.okinc.okex.common.ui.OKSupportBaseActivity, o.AbstractActivityC45319snZ, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }

    @Override // o.AbstractActivityC44814sdy, com.okinc.okex.common.ui.OKSupportBaseActivity, o.AbstractActivityC45319snZ, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }
}
