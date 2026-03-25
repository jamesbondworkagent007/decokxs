package com.okinc.okex.center.ui;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.ConcatAdapter;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.biz.bean.ChatBotRequest;
import com.okinc.biz.event.SupportCenterEvent;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.liveness.lca.EopTrackEvent;
import com.okinc.okex.article.bean.SupportFaqArticle;
import com.okinc.okex.article.ui.FullArticleListActivity;
import com.okinc.okex.center.bean.MiniSupportResponse;
import com.okinc.okex.center.bean.RecommendationCard;
import com.okinc.okex.center.bean.SelfServiceToolBean;
import com.okinc.okex.center.bean.TopicListItem;
import com.okinc.okex.center.bean.enums.IntegratedSolutionPageType;
import com.okinc.okex.center.bean.enums.TransactionType;
import com.okinc.okex.center.ui.SupportIntegratedSolutionSimpleActivity;
import com.okinc.okex.center.ui.adapter.ActivityHighlightCardAdapter;
import com.okinc.okex.center.ui.adapter.RatingChatbotAdapter;
import com.okinc.okex.center.ui.displaymodels.AnnouncementPopupDisplayModel;
import com.okinc.okex.center.ui.displaymodels.ChatbotEntryDisplayModel;
import com.okinc.okex.center.ui.displaymodels.TransactionDisplayModel;
import com.okinc.okex.common.ui.OKSupportBaseActivity;
import com.okinc.okex.rating.net.RatingResult;
import com.okinc.p2p.api.OTCService;
import java.io.IOException;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.AbstractActivityC44872sfC;
import o.AbstractC47292tnL;
import o.ActivityC44038sBa;
import o.C32991mny;
import o.C33070mpX;
import o.C43251rlk;
import o.C44810sdu;
import o.C44987shL;
import o.C44988shM;
import o.C44994shS;
import o.C45055sia;
import o.C45059sie;
import o.C45062sih;
import o.C45065sik;
import o.C45217sld;
import o.C45359soM;
import o.C45363soQ;
import o.C45389soq;
import o.C45393sou;
import o.C45397soy;
import o.C47315tni;
import o.C52761wXj;
import o.C55326xho;
import o.C56392yDr;
import o.C56524yIo;
import o.C6805aWM;
import o.InterfaceC56387yDm;
import o.InterfaceC56388yDn;
import o.InterfaceC56514yIe;
import o.InterfaceC8224ayh;
import o.rVN;
import o.sxK;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class SupportIntegratedSolutionSimpleActivity extends AbstractActivityC44872sfC implements RatingChatbotAdapter.ActionBar, ActivityHighlightCardAdapter.StateListAnimator {
    public static final Application Companion = new Application(null);
    public static final int OLrzqt = 8;
    public AnnouncementPopupDisplayModel djBIcL;
    public final InterfaceC56387yDm fARcdN;

    @yCM
    public C45397soy selfServiceUseCase;

    @yCM
    public C45217sld.Application viewModelFactory;
    public boolean copydefault = true;
    public final InterfaceC56387yDm EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.sgE
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return SupportIntegratedSolutionSimpleActivity.AkhnZx(this.copydefault);
        }
    });
    public final InterfaceC56387yDm values = C56392yDr.copydefault(new Function0() { // from class: o.sgM
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return SupportIntegratedSolutionSimpleActivity.djBIcL();
        }
    });
    public final InterfaceC56387yDm fetchVPNInfo = C56392yDr.copydefault(new Function0() { // from class: o.sgL
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return SupportIntegratedSolutionSimpleActivity.hDKMBd(this.copydefault);
        }
    });
    public final InterfaceC56387yDm gEmmrt = C56392yDr.copydefault(new Function0() { // from class: o.sgI
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return SupportIntegratedSolutionSimpleActivity.values(this.OLrzqt);
        }
    });
    public final InterfaceC56387yDm AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.sgK
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return SupportIntegratedSolutionSimpleActivity.AhwBna();
        }
    });
    public final InterfaceC56387yDm AhwBna = C56392yDr.copydefault(new Function0() { // from class: o.sgR
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return SupportIntegratedSolutionSimpleActivity.fARcdN(this.copydefault);
        }
    });
    public final InterfaceC56387yDm isConnected = C56392yDr.copydefault(new Function0() { // from class: o.sgQ
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return SupportIntegratedSolutionSimpleActivity.getNewProxyInstance(this.KWHzl);
        }
    });
    public final InterfaceC56387yDm AYXKKw = C56392yDr.copydefault(new Function0() { // from class: o.sgN
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return SupportIntegratedSolutionSimpleActivity.valueOf();
        }
    });
    public final InterfaceC56387yDm DbNXlk = C56392yDr.copydefault(new Function0() { // from class: o.sgO
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return SupportIntegratedSolutionSimpleActivity.getFieldNames(this.copydefault);
        }
    });
    public final InterfaceC56387yDm valueOf = C56392yDr.copydefault(new Function0() { // from class: o.sgD
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return SupportIntegratedSolutionSimpleActivity.ejfBZ(this.copydefault);
        }
    });
    public final InterfaceC56387yDm AkhnZx = C56392yDr.copydefault(new Function0() { // from class: o.sgG
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return SupportIntegratedSolutionSimpleActivity.fJNWhG(this.OLrzqt);
        }
    });

    public final /* synthetic */ class ActionBar {
        public static final /* synthetic */ int[] EZpvd;
        public static final /* synthetic */ int[] copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[TransactionType.values().length];
            try {
                iArr[TransactionType.Deposit.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TransactionType.Withdrawal.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TransactionType.P2P.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            EZpvd = iArr;
            int[] iArr2 = new int[IntegratedSolutionPageType.values().length];
            try {
                iArr2[IntegratedSolutionPageType.RecommendationCard.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[IntegratedSolutionPageType.Transaction.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[IntegratedSolutionPageType.HotTopic.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[IntegratedSolutionPageType.MiniSupport.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            copydefault = iArr2;
        }
    }

    public static final /* synthetic */ class TaskDescription implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.EZpvd = function1;
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
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.EZpvd.invoke(obj);
        }
    }

    @Override // com.okinc.okex.common.ui.OKSupportBaseActivity
    public boolean AYXKKw() {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.okex.common.ui.OKSupportBaseActivity
    public boolean bo_() {
        return this.copydefault;
    }

    public static final class StateListAnimator implements ViewTreeObserver.OnGlobalLayoutListener {
        public final /* synthetic */ RecyclerView KWHzl;
        public final /* synthetic */ View copydefault;

        public StateListAnimator(View view, RecyclerView recyclerView) {
            this.copydefault = view;
            this.KWHzl = recyclerView;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (this.copydefault.isLaidOut()) {
                this.copydefault.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                this.KWHzl.scrollToPosition(0);
            }
        }
    }

    public SupportIntegratedSolutionSimpleActivity() {
        final Function0 function0 = null;
        this.fARcdN = new ViewModelLazy(C56524yIo.AEQbTJ(C45217sld.class), new Function0<ViewModelStore>() { // from class: com.okinc.okex.center.ui.SupportIntegratedSolutionSimpleActivity$special$$inlined$viewModels$default$2
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
        }, new Function0() { // from class: o.sgH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return SupportIntegratedSolutionSimpleActivity.uzCIH(this.KWHzl);
            }
        }, new Function0<CreationExtras>() { // from class: com.okinc.okex.center.ui.SupportIntegratedSolutionSimpleActivity$special$$inlined$viewModels$default$3
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

    public final C45217sld.Application uzCIH() {
        C45217sld.Application application = this.viewModelFactory;
        if (application != null) {
            return application;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public final C45217sld hDKMBd() {
        return (C45217sld) this.fARcdN.getValue();
    }

    public static final ViewModelProvider.Factory uzCIH(SupportIntegratedSolutionSimpleActivity supportIntegratedSolutionSimpleActivity) {
        return C45217sld.Companion.copydefault(supportIntegratedSolutionSimpleActivity.uzCIH(), supportIntegratedSolutionSimpleActivity.fARcdN());
    }

    public final C45397soy fJNWhG() {
        C45397soy c45397soy = this.selfServiceUseCase;
        if (c45397soy != null) {
            return c45397soy;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public final ActivityHighlightCardAdapter gEmmrt() {
        return (ActivityHighlightCardAdapter) this.EZpvd.getValue();
    }

    public static final ActivityHighlightCardAdapter AkhnZx(SupportIntegratedSolutionSimpleActivity supportIntegratedSolutionSimpleActivity) {
        ActivityHighlightCardAdapter activityHighlightCardAdapter = new ActivityHighlightCardAdapter(false, 1, null);
        activityHighlightCardAdapter.OLrzqt(supportIntegratedSolutionSimpleActivity);
        activityHighlightCardAdapter.AEQbTJ(false);
        supportIntegratedSolutionSimpleActivity.KWHzl("");
        return activityHighlightCardAdapter;
    }

    public final C45062sih AuCTel() {
        return (C45062sih) this.values.getValue();
    }

    public static final C45062sih djBIcL() {
        C45062sih c45062sih = new C45062sih();
        c45062sih.AEQbTJ(false);
        c45062sih.KWHzl(C33070mpX.AYXKKw(C47315tni.PendingIntent.DLGVGj));
        return c45062sih;
    }

    public final C45055sia fIwbmz() {
        return (C45055sia) this.fetchVPNInfo.getValue();
    }

    public static final C45055sia hDKMBd(SupportIntegratedSolutionSimpleActivity supportIntegratedSolutionSimpleActivity) {
        C45055sia c45055sia = new C45055sia();
        c45055sia.EZpvd(supportIntegratedSolutionSimpleActivity.fARcdN() != IntegratedSolutionPageType.HotTopic);
        c45055sia.copydefault(supportIntegratedSolutionSimpleActivity.new LoaderManager());
        return c45055sia;
    }

    public static final class LoaderManager implements C45055sia.Activity {
        public LoaderManager() {
        }

        @Override // o.C45055sia.Activity
        public void EZpvd(SelfServiceToolBean selfServiceToolBean) {
            Intrinsics.checkNotNullParameter(selfServiceToolBean, "");
            SupportIntegratedSolutionSimpleActivity.this.OLrzqt(selfServiceToolBean);
            SupportIntegratedSolutionSimpleActivity.this.AEQbTJ(selfServiceToolBean);
        }
    }

    public final void AEQbTJ(SelfServiceToolBean selfServiceToolBean) {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new SupportIntegratedSolutionSimpleActivity$openSelfService$1(this, selfServiceToolBean, null), 3, null);
    }

    public final C45062sih isConnected() {
        return (C45062sih) this.gEmmrt.getValue();
    }

    public static final C45062sih values(SupportIntegratedSolutionSimpleActivity supportIntegratedSolutionSimpleActivity) {
        C45062sih c45062sih = new C45062sih();
        c45062sih.AEQbTJ(false);
        c45062sih.KWHzl(supportIntegratedSolutionSimpleActivity.getString(C47315tni.PendingIntent.iKEqwx));
        return c45062sih;
    }

    public final C44810sdu DbNXlk() {
        return (C44810sdu) this.AEQbTJ.getValue();
    }

    public static final C44810sdu AhwBna() {
        return new C44810sdu(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final C44994shS ejfBZ() {
        return (C44994shS) this.AhwBna.getValue();
    }

    public static final C44994shS fARcdN(SupportIntegratedSolutionSimpleActivity supportIntegratedSolutionSimpleActivity) {
        C44994shS c44994shS = new C44994shS();
        c44994shS.AEQbTJ(false);
        c44994shS.EZpvd(C33070mpX.AYXKKw(C47315tni.PendingIntent.fGQ));
        c44994shS.OLrzqt(supportIntegratedSolutionSimpleActivity.new Activity());
        return c44994shS;
    }

    public static final class Activity implements C44994shS.StateListAnimator {
        public Activity() {
        }

        @Override // o.C44994shS.StateListAnimator
        public void EZpvd() {
            SupportIntegratedSolutionSimpleActivity.this.hDKMBd().getFieldNames();
        }
    }

    public final C45059sie getNewProxyInstance() {
        return (C45059sie) this.isConnected.getValue();
    }

    public static final C45059sie getNewProxyInstance(SupportIntegratedSolutionSimpleActivity supportIntegratedSolutionSimpleActivity) {
        C45059sie c45059sie = new C45059sie();
        c45059sie.AEQbTJ(false);
        c45059sie.KWHzl(supportIntegratedSolutionSimpleActivity.new Fragment());
        return c45059sie;
    }

    public static final class Fragment implements C45059sie.StateListAnimator {
        public Fragment() {
        }

        @Override // o.C45059sie.StateListAnimator
        public void KWHzl() {
            SupportIntegratedSolutionSimpleActivity.this.AuCTelauCTel();
        }
    }

    public final C44987shL fetchVPNInfo() {
        return (C44987shL) this.AYXKKw.getValue();
    }

    public static final C44987shL valueOf() {
        C44987shL c44987shL = new C44987shL();
        c44987shL.AEQbTJ(false);
        C44987shL.updateEmptyProperties$default(c44987shL, 6, C33070mpX.AYXKKw(C47315tni.PendingIntent.AubY), null, null, 12, null);
        return c44987shL;
    }

    private final RatingChatbotAdapter sSMYrx() {
        return (RatingChatbotAdapter) this.DbNXlk.getValue();
    }

    public static final RatingChatbotAdapter getFieldNames(SupportIntegratedSolutionSimpleActivity supportIntegratedSolutionSimpleActivity) {
        RatingChatbotAdapter ratingChatbotAdapter = new RatingChatbotAdapter();
        ratingChatbotAdapter.EZpvd(false);
        ratingChatbotAdapter.AEQbTJ(supportIntegratedSolutionSimpleActivity);
        return ratingChatbotAdapter;
    }

    public final AbstractC47292tnL values() {
        return (AbstractC47292tnL) this.valueOf.getValue();
    }

    public static final AbstractC47292tnL ejfBZ(SupportIntegratedSolutionSimpleActivity supportIntegratedSolutionSimpleActivity) {
        return AbstractC47292tnL.copydefault(supportIntegratedSolutionSimpleActivity.getLayoutInflater());
    }

    public final IntegratedSolutionPageType fARcdN() {
        return (IntegratedSolutionPageType) this.AkhnZx.getValue();
    }

    public static final IntegratedSolutionPageType fJNWhG(SupportIntegratedSolutionSimpleActivity supportIntegratedSolutionSimpleActivity) {
        return IntegratedSolutionPageType.values()[supportIntegratedSolutionSimpleActivity.getIntent().getIntExtra(EopTrackEvent.KEY_PAGE_TYPE, 0)];
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.center.ui.SupportIntegratedSolutionSimpleActivity.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final Intent EZpvd(@NotNull Context context, TransactionDisplayModel transactionDisplayModel, TopicListItem.TopicItem topicItem, RecommendationCard recommendationCard, String str, @NotNull IntegratedSolutionPageType integratedSolutionPageType) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(integratedSolutionPageType, "");
            Intent intent = new Intent(context, (Class<?>) SupportIntegratedSolutionSimpleActivity.class);
            intent.putExtra("transaction_item", transactionDisplayModel);
            intent.putExtra("topic_item", topicItem);
            intent.putExtra("recommendation_card", recommendationCard);
            intent.putExtra("mini_support_page_id", str);
            intent.putExtra(EopTrackEvent.KEY_PAGE_TYPE, integratedSolutionPageType.ordinal());
            return intent;
        }
    }

    @Override // com.okinc.okex.common.ui.OKSupportBaseActivity
    public View AkhnZx() {
        View root = values().getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        return root;
    }

    @Override // o.AbstractActivityC44872sfC, com.okinc.okex.common.ui.OKSupportBaseActivity, o.AbstractActivityC45319snZ, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String stringExtra = getIntent().getStringExtra("mini_support_page_id");
        if (Build.VERSION.SDK_INT >= 33) {
            hDKMBd().OLrzqt((TransactionDisplayModel) getIntent().getParcelableExtra("transaction_item", TransactionDisplayModel.class), (TopicListItem.TopicItem) getIntent().getParcelableExtra("topic_item", TopicListItem.TopicItem.class), (RecommendationCard) getIntent().getParcelableExtra("recommendation_card", RecommendationCard.class), stringExtra);
        } else {
            C45217sld c45217sldHDKMBd = hDKMBd();
            Intent intent = getIntent();
            TransactionDisplayModel transactionDisplayModel = intent != null ? (TransactionDisplayModel) intent.getParcelableExtra("transaction_item") : null;
            Intent intent2 = getIntent();
            TopicListItem.TopicItem topicItem = intent2 != null ? (TopicListItem.TopicItem) intent2.getParcelableExtra("topic_item") : null;
            Intent intent3 = getIntent();
            c45217sldHDKMBd.OLrzqt(transactionDisplayModel, topicItem, intent3 != null ? (RecommendationCard) intent3.getParcelableExtra("recommendation_card") : null, stringExtra);
        }
        hDKMBd().AEQbTJ();
        wlaJM();
        getWindow().getDecorView().post(new Runnable() { // from class: o.sgF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                SupportIntegratedSolutionSimpleActivity.AuCTel(this.OLrzqt);
            }
        });
    }

    public static final void AuCTel(SupportIntegratedSolutionSimpleActivity supportIntegratedSolutionSimpleActivity) {
        rVN.reportFullyDrawn$default((android.app.Activity) supportIntegratedSolutionSimpleActivity, true, (String) null, 2, (Object) null);
    }

    @Override // com.okinc.okex.common.ui.OKSupportBaseActivity
    public void initFrameContent(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "");
        values();
        ORxRYg();
        OcIXYQ();
        AxsJAY();
        OKSupportBaseActivity.setErrorRetryClickListener$default(this, 0, new Function0() { // from class: o.sgV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return SupportIntegratedSolutionSimpleActivity.fIwbmz(this.AEQbTJ);
            }
        }, 1, null);
    }

    public static final Unit fIwbmz(SupportIntegratedSolutionSimpleActivity supportIntegratedSolutionSimpleActivity) {
        supportIntegratedSolutionSimpleActivity.hDKMBd().AEQbTJ();
        return Unit.INSTANCE;
    }

    private final void AxsJAY() {
        C45217sld c45217sldHDKMBd = hDKMBd();
        c45217sldHDKMBd.EZpvd().observe(this, new TaskDescription(new Function1() { // from class: o.sgs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return SupportIntegratedSolutionSimpleActivity.OLrzqt(this.AEQbTJ, (java.util.List) obj);
            }
        }));
        c45217sldHDKMBd.djBIcL().observe(this, new TaskDescription(new Function1() { // from class: o.sgo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return SupportIntegratedSolutionSimpleActivity.OLrzqt(this.AEQbTJ, (java.lang.Boolean) obj);
            }
        }));
        c45217sldHDKMBd.ejfBZ().observe(this, new TaskDescription(new Function1() { // from class: o.sgt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return SupportIntegratedSolutionSimpleActivity.EZpvd(this.copydefault, (java.lang.Boolean) obj);
            }
        }));
        c45217sldHDKMBd.fARcdN().observe(this, new TaskDescription(new Function1() { // from class: o.sgx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return SupportIntegratedSolutionSimpleActivity.AEQbTJ(this.OLrzqt, (TransactionDisplayModel) obj);
            }
        }));
        c45217sldHDKMBd.fJNWhG().observe(this, new TaskDescription(new Function1() { // from class: o.sgv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return SupportIntegratedSolutionSimpleActivity.KWHzl(this.OLrzqt, (java.util.List) obj);
            }
        }));
        c45217sldHDKMBd.isConnected().observe(this, new TaskDescription(new Function1() { // from class: o.sgu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return SupportIntegratedSolutionSimpleActivity.AEQbTJ(this.EZpvd, (java.lang.String) obj);
            }
        }));
        c45217sldHDKMBd.gEmmrt().observe(this, new TaskDescription(new Function1() { // from class: o.sgw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return SupportIntegratedSolutionSimpleActivity.copydefault(this.AEQbTJ, (java.lang.String) obj);
            }
        }));
        c45217sldHDKMBd.hDKMBd().observe(this, new TaskDescription(new Function1() { // from class: o.sgC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return SupportIntegratedSolutionSimpleActivity.djBIcL(this.copydefault, (java.lang.Boolean) obj);
            }
        }));
        c45217sldHDKMBd.OLrzqt().observe(this, new TaskDescription(new Function1() { // from class: o.sgz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return SupportIntegratedSolutionSimpleActivity.OLrzqt(this.OLrzqt, (ChatbotEntryDisplayModel) obj);
            }
        }));
        c45217sldHDKMBd.valueOf().observe(this, new C32991mny(new Function1() { // from class: o.sgB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return SupportIntegratedSolutionSimpleActivity.OLrzqt((kotlin.Pair) obj);
            }
        }));
        c45217sldHDKMBd.values().observe(this, new TaskDescription(new Function1() { // from class: o.sgr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return SupportIntegratedSolutionSimpleActivity.KWHzl(this.copydefault, (AnnouncementPopupDisplayModel) obj);
            }
        }));
        LifecycleOwnerKt.getLifecycleScope(this).launchWhenStarted(new SupportIntegratedSolutionSimpleActivity$observeViewModel$2(this, null));
    }

    public static final Unit OLrzqt(SupportIntegratedSolutionSimpleActivity supportIntegratedSolutionSimpleActivity, List list) {
        supportIntegratedSolutionSimpleActivity.isConnected().AEQbTJ(true);
        supportIntegratedSolutionSimpleActivity.fetchVPNInfo().AEQbTJ(list.isEmpty());
        C44810sdu c44810sduDbNXlk = supportIntegratedSolutionSimpleActivity.DbNXlk();
        Intrinsics.copydefault(list);
        c44810sduDbNXlk.copydefault((List<SupportFaqArticle>) list);
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(SupportIntegratedSolutionSimpleActivity supportIntegratedSolutionSimpleActivity, Boolean bool) {
        supportIntegratedSolutionSimpleActivity.ejfBZ().AEQbTJ(bool.booleanValue());
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(SupportIntegratedSolutionSimpleActivity supportIntegratedSolutionSimpleActivity, Boolean bool) {
        supportIntegratedSolutionSimpleActivity.getNewProxyInstance().AEQbTJ(bool.booleanValue());
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(SupportIntegratedSolutionSimpleActivity supportIntegratedSolutionSimpleActivity, TransactionDisplayModel transactionDisplayModel) {
        if (transactionDisplayModel != null) {
            ActivityHighlightCardAdapter activityHighlightCardAdapterGEmmrt = supportIntegratedSolutionSimpleActivity.gEmmrt();
            activityHighlightCardAdapterGEmmrt.AEQbTJ(transactionDisplayModel);
            activityHighlightCardAdapterGEmmrt.AEQbTJ(true);
            RecyclerView recyclerView = supportIntegratedSolutionSimpleActivity.values().copydefault;
            Intrinsics.copydefault(recyclerView);
            recyclerView.getViewTreeObserver().addOnGlobalLayoutListener(new StateListAnimator(recyclerView, recyclerView));
        } else {
            supportIntegratedSolutionSimpleActivity.gEmmrt().AEQbTJ(false);
        }
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(SupportIntegratedSolutionSimpleActivity supportIntegratedSolutionSimpleActivity, List list) {
        C45062sih c45062sihAuCTel = supportIntegratedSolutionSimpleActivity.AuCTel();
        Intrinsics.copydefault(list);
        c45062sihAuCTel.AEQbTJ(!list.isEmpty());
        C45055sia c45055siaFIwbmz = supportIntegratedSolutionSimpleActivity.fIwbmz();
        RecyclerView recyclerView = supportIntegratedSolutionSimpleActivity.values().copydefault;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "");
        c45055siaFIwbmz.copydefault(recyclerView, list);
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(SupportIntegratedSolutionSimpleActivity supportIntegratedSolutionSimpleActivity, String str) {
        Intrinsics.copydefault((Object) str);
        supportIntegratedSolutionSimpleActivity.KWHzl(str);
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(SupportIntegratedSolutionSimpleActivity supportIntegratedSolutionSimpleActivity, String str) {
        if (str != null) {
            supportIntegratedSolutionSimpleActivity.EZpvd(str);
        }
        return Unit.INSTANCE;
    }

    public static final Unit djBIcL(SupportIntegratedSolutionSimpleActivity supportIntegratedSolutionSimpleActivity, Boolean bool) {
        supportIntegratedSolutionSimpleActivity.sSMYrx().EZpvd(true);
        if (bool.booleanValue()) {
            supportIntegratedSolutionSimpleActivity.sSMYrx().KWHzl();
        } else {
            supportIntegratedSolutionSimpleActivity.sSMYrx().EZpvd();
        }
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(SupportIntegratedSolutionSimpleActivity supportIntegratedSolutionSimpleActivity, ChatbotEntryDisplayModel chatbotEntryDisplayModel) {
        if (chatbotEntryDisplayModel != null) {
            supportIntegratedSolutionSimpleActivity.sSMYrx().EZpvd(chatbotEntryDisplayModel.getChatbotEnabled(), chatbotEntryDisplayModel.getChatWithUsTitle(), chatbotEntryDisplayModel.getChatbotIcon());
        }
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        final String str = (String) pair.component1();
        final String str2 = (String) pair.component2();
        C45363soQ.KWHzl("SupportCenter_ContextualPage_Page_View", true, new Function1() { // from class: o.sgq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return SupportIntegratedSolutionSimpleActivity.EZpvd(str, str2, (EventParamsList) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(String str, String str2, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "pageidparam", str, false, 4, null);
        EventParamsList.put$default(eventParamsList, "mini_support_type", str2, false, 4, null);
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(SupportIntegratedSolutionSimpleActivity supportIntegratedSolutionSimpleActivity, AnnouncementPopupDisplayModel announcementPopupDisplayModel) {
        if (!Intrinsics.EZpvd(supportIntegratedSolutionSimpleActivity.djBIcL, announcementPopupDisplayModel)) {
            supportIntegratedSolutionSimpleActivity.djBIcL = announcementPopupDisplayModel;
            FragmentManager supportFragmentManager = supportIntegratedSolutionSimpleActivity.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
            C45065sik.OLrzqt(announcementPopupDisplayModel, supportFragmentManager);
        }
        return Unit.INSTANCE;
    }

    private final void OcIXYQ() {
        RecyclerView recyclerView = values().copydefault;
        ConcatAdapter concatAdapter = new ConcatAdapter((RecyclerView.Adapter<? extends RecyclerView.ViewHolder>[]) new RecyclerView.Adapter[]{gEmmrt(), AuCTel(), fIwbmz(), isConnected(), DbNXlk(), ejfBZ(), getNewProxyInstance(), fetchVPNInfo(), sSMYrx()});
        GridLayoutManager gridLayoutManager = new GridLayoutManager(recyclerView.getContext(), 2);
        gridLayoutManager.setSpanSizeLookup(new C44988shM(concatAdapter));
        int iOLrzqt = C33070mpX.OLrzqt(C52761wXj.StateListAnimator.QUSxYX);
        int iOLrzqt2 = C33070mpX.OLrzqt(C52761wXj.StateListAnimator.ODWQjV);
        int iOLrzqt3 = C33070mpX.OLrzqt(C52761wXj.StateListAnimator.zuWLRA);
        int iOLrzqt4 = C33070mpX.OLrzqt(C52761wXj.StateListAnimator.ffGIBT);
        recyclerView.addItemDecoration(new C45393sou(AuCTel(), iOLrzqt2, 0, false, 4, null));
        recyclerView.addItemDecoration(new C45393sou(isConnected(), iOLrzqt2, 0, false, 4, null));
        recyclerView.addItemDecoration(new C45393sou(sSMYrx(), iOLrzqt2, 0, false, 12, null));
        recyclerView.addItemDecoration(new C45389soq(fIwbmz(), iOLrzqt, iOLrzqt, iOLrzqt3, iOLrzqt3 + iOLrzqt2, iOLrzqt4));
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.setAdapter(concatAdapter);
    }

    private final void ORxRYg() {
        EZpvd(false, true);
        EZpvd(C52761wXj.TaskDescription.UJpkuA, C47315tni.Activity.djBIcL, new View.OnClickListener() { // from class: o.sgU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                SupportIntegratedSolutionSimpleActivity.OLrzqt(this.EZpvd, view);
            }
        });
    }

    public static final void OLrzqt(SupportIntegratedSolutionSimpleActivity supportIntegratedSolutionSimpleActivity, View view) {
        supportIntegratedSolutionSimpleActivity.startActivity(ActivityC44038sBa.Application.createIntent$default(ActivityC44038sBa.Companion, supportIntegratedSolutionSimpleActivity, SupportCenterEvent.ArticlePageParam.IntegratedSolution.getValue(), null, 4, null));
    }

    public final void AuCTelauCTel() {
        FullArticleListActivity.FullArticleListRequest fullArticleListRequestDbNXlk = hDKMBd().DbNXlk();
        if (fullArticleListRequestDbNXlk != null) {
            startActivity(FullArticleListActivity.Companion.OLrzqt(this, fullArticleListRequestDbNXlk));
        }
    }

    public final void wlaJM() {
        DbNXlk().copydefault(new Function1() { // from class: o.sgS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return SupportIntegratedSolutionSimpleActivity.AYXKKw(this.AEQbTJ, (EventParamsList) obj);
            }
        });
        sSMYrx().copydefault(new Function1() { // from class: o.sgW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return SupportIntegratedSolutionSimpleActivity.AhwBna(this.EZpvd, (EventParamsList) obj);
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0043 A[PHI: r1
  0x0043: PHI (r1v22 java.lang.String) = (r1v7 java.lang.String), (r1v26 java.lang.String) binds: [B:14:0x003f, B:8:0x002c] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit AYXKKw(SupportIntegratedSolutionSimpleActivity supportIntegratedSolutionSimpleActivity, EventParamsList eventParamsList) {
        String slug;
        String str;
        TransactionType transactionType;
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("page", SupportCenterEvent.ArticlePageParam.IntegratedSolution.getValue(), true);
        if (!supportIntegratedSolutionSimpleActivity.hDKMBd().iwGUEr()) {
            TopicListItem.TopicItem topicItemAuCTel = supportIntegratedSolutionSimpleActivity.hDKMBd().AuCTel();
            slug = topicItemAuCTel != null ? topicItemAuCTel.getSlug() : null;
            str = slug == null ? "" : slug;
        } else {
            MiniSupportResponse miniSupportResponseAhwBna = supportIntegratedSolutionSimpleActivity.hDKMBd().AhwBna();
            slug = miniSupportResponseAhwBna != null ? miniSupportResponseAhwBna.getSlug() : null;
            if (slug == null) {
            }
        }
        EventParamsList.put$default(eventParamsList, "page_topic_name", str, false, 4, null);
        TransactionDisplayModel transactionDisplayModelUzCIH = supportIntegratedSolutionSimpleActivity.hDKMBd().uzCIH();
        String value = (transactionDisplayModelUzCIH == null || (transactionType = transactionDisplayModelUzCIH.getTransactionType()) == null) ? null : transactionType.getValue();
        EventParamsList.put$default(eventParamsList, "page_transaction_type", value == null ? "" : value, false, 4, null);
        TransactionDisplayModel transactionDisplayModelUzCIH2 = supportIntegratedSolutionSimpleActivity.hDKMBd().uzCIH();
        String statusValue = transactionDisplayModelUzCIH2 != null ? transactionDisplayModelUzCIH2.getStatusValue() : null;
        EventParamsList.put$default(eventParamsList, "page_transaction_status", statusValue == null ? "" : statusValue, false, 4, null);
        RecommendationCard recommendationCardAkhnZx = supportIntegratedSolutionSimpleActivity.hDKMBd().AkhnZx();
        String dataTrackingKey = recommendationCardAkhnZx != null ? recommendationCardAkhnZx.getDataTrackingKey() : null;
        EventParamsList.put$default(eventParamsList, "page_recommendation_type", dataTrackingKey == null ? "" : dataTrackingKey, false, 4, null);
        eventParamsList.put("mini_support_page", supportIntegratedSolutionSimpleActivity.hDKMBd().iwGUEr() ? "true" : "false", true);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003e A[PHI: r2
  0x003e: PHI (r2v4 java.lang.String) = (r2v2 java.lang.String), (r2v5 java.lang.String) binds: [B:12:0x003b, B:7:0x002a] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit AhwBna(SupportIntegratedSolutionSimpleActivity supportIntegratedSolutionSimpleActivity, EventParamsList eventParamsList) {
        String slug;
        String str = "";
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("page", SupportCenterEvent.ArticlePageParam.IntegratedSolution.getValue(), true);
        if (!supportIntegratedSolutionSimpleActivity.hDKMBd().iwGUEr()) {
            TopicListItem.TopicItem topicItemAuCTel = supportIntegratedSolutionSimpleActivity.hDKMBd().AuCTel();
            slug = topicItemAuCTel != null ? topicItemAuCTel.getSlug() : null;
            if (slug != null) {
                str = slug;
            }
        } else {
            MiniSupportResponse miniSupportResponseAhwBna = supportIntegratedSolutionSimpleActivity.hDKMBd().AhwBna();
            slug = miniSupportResponseAhwBna != null ? miniSupportResponseAhwBna.getSlug() : null;
            if (slug != null) {
            }
        }
        EventParamsList.put$default(eventParamsList, "page_topic_name", str, false, 4, null);
        eventParamsList.put("mini_support_page", supportIntegratedSolutionSimpleActivity.hDKMBd().iwGUEr() ? "true" : "false", true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void OLrzqt(final SelfServiceToolBean selfServiceToolBean) {
        C45363soQ.onSessionIdEvent$default("SupportCenter_Top_SelfService_Click", false, new Function1() { // from class: o.sgT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return SupportIntegratedSolutionSimpleActivity.EZpvd(this.KWHzl, selfServiceToolBean, (EventParamsList) obj);
            }
        }, 1, null);
    }

    public static final Unit EZpvd(SupportIntegratedSolutionSimpleActivity supportIntegratedSolutionSimpleActivity, SelfServiceToolBean selfServiceToolBean, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        Function1<EventParamsList, Unit> function1KWHzl = supportIntegratedSolutionSimpleActivity.DbNXlk().KWHzl();
        if (function1KWHzl != null) {
            function1KWHzl.invoke(eventParamsList);
        }
        eventParamsList.put("index", selfServiceToolBean.getDataTrackingKey(), false);
        return Unit.INSTANCE;
    }

    @Override // com.okinc.okex.center.ui.adapter.ActivityHighlightCardAdapter.StateListAnimator
    public void copydefault(SelfServiceToolBean selfServiceToolBean) {
        if (selfServiceToolBean != null) {
            OLrzqt(selfServiceToolBean);
            AEQbTJ(selfServiceToolBean);
        }
    }

    @Override // com.okinc.okex.center.ui.adapter.ActivityHighlightCardAdapter.StateListAnimator
    public void EZpvd(@NotNull String str, @NotNull TransactionType transactionType) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(transactionType, "");
        int i = ActionBar.EZpvd[transactionType.ordinal()];
        if (i == 1) {
            InterfaceC8224ayh interfaceC8224ayh = (InterfaceC8224ayh) C43251rlk.OLrzqt(InterfaceC8224ayh.class);
            if (interfaceC8224ayh != null) {
                InterfaceC8224ayh.TaskDescription.goToDepositHistoryDetails$default(interfaceC8224ayh, this, str, null, null, null, null, 60, null);
                return;
            }
            return;
        }
        if (i == 2) {
            InterfaceC8224ayh interfaceC8224ayh2 = (InterfaceC8224ayh) C43251rlk.OLrzqt(InterfaceC8224ayh.class);
            if (interfaceC8224ayh2 != null) {
                InterfaceC8224ayh.TaskDescription.goToWithdrawHistoryDetails$default(interfaceC8224ayh2, this, null, str, null, null, 26, null);
                return;
            }
            return;
        }
        if (i == 3) {
            OTCService oTCService = (OTCService) C43251rlk.OLrzqt(OTCService.class);
            if (oTCService != null) {
                OTCService.DefaultImpls.gotoC2COrderDetail$default(oTCService, this, str, null, 4, null);
                return;
            }
            return;
        }
        C55326xho.OLrzqt("Unknown transaction type: " + transactionType);
    }

    @Override // com.okinc.okex.center.ui.adapter.RatingChatbotAdapter.ActionBar
    public void copydefault(final boolean z) {
        C45363soQ.onSessionIdEvent$default("SupportCenter_Btm_HelpfulButton_Click", false, new Function1() { // from class: o.sgy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return SupportIntegratedSolutionSimpleActivity.AEQbTJ(this.EZpvd, z, (EventParamsList) obj);
            }
        }, 1, null);
        hDKMBd().AuCTelauCTel();
        RatingResult value = hDKMBd().fetchVPNInfo().getValue();
        if (value != null) {
            sxK.copydefault.KWHzl(this, value, z);
        }
    }

    public static final Unit AEQbTJ(SupportIntegratedSolutionSimpleActivity supportIntegratedSolutionSimpleActivity, boolean z, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        Function1<EventParamsList, Unit> function1Copydefault = supportIntegratedSolutionSimpleActivity.sSMYrx().copydefault();
        if (function1Copydefault != null) {
            function1Copydefault.invoke(eventParamsList);
        }
        eventParamsList.put(EopTrackEvent.KEY_BUTTON_NAME, z ? "yes" : "no", true);
        return Unit.INSTANCE;
    }

    @Override // com.okinc.okex.center.ui.adapter.RatingChatbotAdapter.ActionBar
    public void iwGUEr() {
        final String str;
        TransactionType transactionType;
        int i = ActionBar.copydefault[fARcdN().ordinal()];
        str = "";
        if (i == 1) {
            C45363soQ.onSessionIdEvent$default("SupportCenter_Recommendation_Chatbot_Click", false, null, 3, null);
            String chatbotSuffix = IntegratedSolutionPageType.RecommendationCard.getChatbotSuffix();
            RecommendationCard recommendationCardAkhnZx = hDKMBd().AkhnZx();
            String slug = recommendationCardAkhnZx != null ? recommendationCardAkhnZx.getSlug() : null;
            str = chatbotSuffix + "_" + (slug != null ? slug : "");
        } else if (i == 2) {
            C45363soQ.onSessionIdEvent$default("SupportCenter_Transaction_Chatbot_Click", false, new Function1() { // from class: o.sgp
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return SupportIntegratedSolutionSimpleActivity.gEmmrt(this.EZpvd, (EventParamsList) obj);
                }
            }, 1, null);
            String chatbotSuffix2 = IntegratedSolutionPageType.Transaction.getChatbotSuffix();
            TransactionDisplayModel transactionDisplayModelUzCIH = hDKMBd().uzCIH();
            String value = (transactionDisplayModelUzCIH == null || (transactionType = transactionDisplayModelUzCIH.getTransactionType()) == null) ? null : transactionType.getValue();
            str = chatbotSuffix2 + "_" + (value != null ? value : "");
        } else if (i == 3) {
            C45363soQ.onSessionIdEvent$default("SupportCenter_Topics_Chatbot_Click", false, new Function1() { // from class: o.sgA
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return SupportIntegratedSolutionSimpleActivity.djBIcL(this.copydefault, (EventParamsList) obj);
                }
            }, 1, null);
            String chatbotSuffix3 = IntegratedSolutionPageType.HotTopic.getChatbotSuffix();
            TopicListItem.TopicItem topicItemAuCTel = hDKMBd().AuCTel();
            String slug2 = topicItemAuCTel != null ? topicItemAuCTel.getSlug() : null;
            str = chatbotSuffix3 + "_" + (slug2 != null ? slug2 : "");
        } else {
            if (i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            C45363soQ.onSessionIdEvent$default("SupportCenter_ContextualPage_Chatbot_Click", false, new Function1() { // from class: o.sgJ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return SupportIntegratedSolutionSimpleActivity.valueOf(this.copydefault, (EventParamsList) obj);
                }
            }, 1, null);
            MiniSupportResponse miniSupportResponseAhwBna = hDKMBd().AhwBna();
            String slug3 = miniSupportResponseAhwBna != null ? miniSupportResponseAhwBna.getSlug() : null;
            if (slug3 != null) {
                str = slug3;
            }
        }
        C45359soM.copydefault.KWHzl();
        final ChatbotEntryDisplayModel value2 = hDKMBd().OLrzqt().getValue();
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new SupportIntegratedSolutionSimpleActivity$onChatbotClicked$1(this, C6805aWM.OLrzqt(new Function1() { // from class: o.sgP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return SupportIntegratedSolutionSimpleActivity.EZpvd(str, value2, (ChatBotRequest) obj);
            }
        }), null), 3, null);
    }

    public static final Unit gEmmrt(SupportIntegratedSolutionSimpleActivity supportIntegratedSolutionSimpleActivity, EventParamsList eventParamsList) {
        TransactionType transactionType;
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        TransactionDisplayModel transactionDisplayModelUzCIH = supportIntegratedSolutionSimpleActivity.hDKMBd().uzCIH();
        String value = (transactionDisplayModelUzCIH == null || (transactionType = transactionDisplayModelUzCIH.getTransactionType()) == null) ? null : transactionType.getValue();
        EventParamsList.put$default(eventParamsList, "transaction_type", value == null ? "" : value, false, 4, null);
        return Unit.INSTANCE;
    }

    public static final Unit djBIcL(SupportIntegratedSolutionSimpleActivity supportIntegratedSolutionSimpleActivity, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        TopicListItem.TopicItem topicItemAuCTel = supportIntegratedSolutionSimpleActivity.hDKMBd().AuCTel();
        String slug = topicItemAuCTel != null ? topicItemAuCTel.getSlug() : null;
        EventParamsList.put$default(eventParamsList, "page_topic_name", slug == null ? "" : slug, false, 4, null);
        return Unit.INSTANCE;
    }

    public static final Unit valueOf(SupportIntegratedSolutionSimpleActivity supportIntegratedSolutionSimpleActivity, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        String strAYXKKw = supportIntegratedSolutionSimpleActivity.hDKMBd().AYXKKw();
        EventParamsList.put$default(eventParamsList, "pageidparam", strAYXKKw == null ? "" : strAYXKKw, false, 4, null);
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(String str, ChatbotEntryDisplayModel chatbotEntryDisplayModel, ChatBotRequest chatBotRequest) throws IOException {
        Intrinsics.checkNotNullParameter(chatBotRequest, "");
        chatBotRequest.setOkaFrom("cg_" + str);
        String okAssistantGreeting = chatbotEntryDisplayModel != null ? chatbotEntryDisplayModel.getOkAssistantGreeting() : null;
        if (okAssistantGreeting == null) {
            okAssistantGreeting = "";
        }
        chatBotRequest.setOkaChatbotMessage(okAssistantGreeting);
        String xbotGreeting = chatbotEntryDisplayModel != null ? chatbotEntryDisplayModel.getXbotGreeting() : null;
        if (xbotGreeting == null) {
            xbotGreeting = "";
        }
        chatBotRequest.setGreetings(xbotGreeting);
        String adaGreeting = chatbotEntryDisplayModel != null ? chatbotEntryDisplayModel.getAdaGreeting() : null;
        if (adaGreeting == null) {
            adaGreeting = "";
        }
        chatBotRequest.setGreetingAda(adaGreeting);
        String contextualBot = chatbotEntryDisplayModel != null ? chatbotEntryDisplayModel.getContextualBot() : null;
        chatBotRequest.setContextualBot(contextualBot != null ? contextualBot : "");
        return Unit.INSTANCE;
    }

    @Override // o.AbstractActivityC44872sfC, com.okinc.okex.common.ui.OKSupportBaseActivity, o.AbstractActivityC45319snZ, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC44872sfC, com.okinc.okex.common.ui.OKSupportBaseActivity, o.AbstractActivityC45319snZ, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC44872sfC, com.okinc.okex.common.ui.OKSupportBaseActivity, o.AbstractActivityC45319snZ, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.AbstractActivityC44872sfC, com.okinc.okex.common.ui.OKSupportBaseActivity, o.AbstractActivityC45319snZ, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
