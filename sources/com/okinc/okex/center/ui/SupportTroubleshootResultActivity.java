package com.okinc.okex.center.ui;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
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
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.liveness.lca.EopTrackEvent;
import com.okinc.okex.article.bean.SupportFaqArticle;
import com.okinc.okex.article.ui.FullArticleListActivity;
import com.okinc.okex.center.bean.SelfServiceToolBean;
import com.okinc.okex.center.bean.TroubleshootResultPageData;
import com.okinc.okex.center.bean.enums.TransactionType;
import com.okinc.okex.center.ui.SupportTroubleshootResultActivity;
import com.okinc.okex.center.ui.adapter.RatingChatbotAdapter;
import com.okinc.okex.center.ui.adapter.TroubleshootResultAdapter;
import com.okinc.okex.center.ui.displaymodels.ChatbotEntryDisplayModel;
import com.okinc.okex.center.viewmodel.SupportTroubleshootResultViewModel;
import com.okinc.okex.rating.net.RatingResult;
import com.okinc.p2p.api.OTCService;
import java.io.IOException;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.AbstractActivityC44874sfE;
import o.AbstractC47299tnS;
import o.ActivityC44878sfI;
import o.C33070mpX;
import o.C43251rlk;
import o.C44810sdu;
import o.C44987shL;
import o.C44988shM;
import o.C44994shS;
import o.C45055sia;
import o.C45059sie;
import o.C45062sih;
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
import o.sxK;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class SupportTroubleshootResultActivity extends AbstractActivityC44874sfE implements TroubleshootResultAdapter.Activity, C45055sia.Activity, RatingChatbotAdapter.ActionBar {

    @yCM
    public C45397soy selfServiceUseCase;
    public final InterfaceC56387yDm values;
    public static final ActionBar Companion = new ActionBar(null);
    public static final int AEQbTJ = 8;
    public final InterfaceC56387yDm KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.shn
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return SupportTroubleshootResultActivity.AhwBna(this.copydefault);
        }
    });
    public final InterfaceC56387yDm fetchVPNInfo = C56392yDr.copydefault(new Function0() { // from class: o.shv
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return SupportTroubleshootResultActivity.fJNWhG(this.KWHzl);
        }
    });
    public final InterfaceC56387yDm DbNXlk = C56392yDr.copydefault(new Function0() { // from class: o.sht
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return SupportTroubleshootResultActivity.DTwDnp();
        }
    });
    public final InterfaceC56387yDm AYXKKw = C56392yDr.copydefault(new Function0() { // from class: o.shs
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return SupportTroubleshootResultActivity.values(this.AEQbTJ);
        }
    });
    public final InterfaceC56387yDm OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.shr
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return SupportTroubleshootResultActivity.gEmmrt();
        }
    });
    public final InterfaceC56387yDm copydefault = C56392yDr.copydefault(new Function0() { // from class: o.shu
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return SupportTroubleshootResultActivity.AuCTel();
        }
    });
    public final InterfaceC56387yDm gEmmrt = C56392yDr.copydefault(new Function0() { // from class: o.shz
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return SupportTroubleshootResultActivity.fetchVPNInfo(this.OLrzqt);
        }
    });
    public final InterfaceC56387yDm isConnected = C56392yDr.copydefault(new Function0() { // from class: o.shy
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return SupportTroubleshootResultActivity.DbNXlk(this.copydefault);
        }
    });
    public final InterfaceC56387yDm AhwBna = C56392yDr.copydefault(new Function0() { // from class: o.shw
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return SupportTroubleshootResultActivity.ejfBZ();
        }
    });
    public final InterfaceC56387yDm valueOf = C56392yDr.copydefault(new Function0() { // from class: o.shx
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return SupportTroubleshootResultActivity.AkhnZx(this.EZpvd);
        }
    });
    public final InterfaceC56387yDm djBIcL = C56392yDr.copydefault(new Function0() { // from class: o.shq
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return SupportTroubleshootResultActivity.isConnected(this.AEQbTJ);
        }
    });

    /* JADX INFO: loaded from: classes19.dex */
    public final /* synthetic */ class Application {
        public static final /* synthetic */ int[] AEQbTJ;

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
            AEQbTJ = iArr;
        }
    }

    public static final /* synthetic */ class TaskDescription implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.OLrzqt = function1;
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
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.OLrzqt.invoke(obj);
        }
    }

    @Override // com.okinc.okex.common.ui.OKSupportBaseActivity
    public boolean AYXKKw() {
        return true;
    }

    public SupportTroubleshootResultActivity() {
        final Function0 function0 = null;
        this.values = new ViewModelLazy(C56524yIo.AEQbTJ(SupportTroubleshootResultViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.okex.center.ui.SupportTroubleshootResultActivity$special$$inlined$viewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.okex.center.ui.SupportTroubleshootResultActivity$special$$inlined$viewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.okex.center.ui.SupportTroubleshootResultActivity$special$$inlined$viewModels$default$3
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

    public final SupportTroubleshootResultViewModel isConnected() {
        return (SupportTroubleshootResultViewModel) this.values.getValue();
    }

    public final C45397soy values() {
        C45397soy c45397soy = this.selfServiceUseCase;
        if (c45397soy != null) {
            return c45397soy;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public final AbstractC47299tnS AhwBna() {
        return (AbstractC47299tnS) this.KWHzl.getValue();
    }

    public static final AbstractC47299tnS AhwBna(SupportTroubleshootResultActivity supportTroubleshootResultActivity) {
        return AbstractC47299tnS.OLrzqt(supportTroubleshootResultActivity.getLayoutInflater());
    }

    public final TroubleshootResultAdapter DbNXlk() {
        return (TroubleshootResultAdapter) this.fetchVPNInfo.getValue();
    }

    public static final TroubleshootResultAdapter fJNWhG(SupportTroubleshootResultActivity supportTroubleshootResultActivity) {
        TroubleshootResultAdapter troubleshootResultAdapter = new TroubleshootResultAdapter();
        troubleshootResultAdapter.OLrzqt(supportTroubleshootResultActivity);
        return troubleshootResultAdapter;
    }

    private final C45062sih getNewProxyInstance() {
        return (C45062sih) this.DbNXlk.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C45062sih DTwDnp() {
        C45062sih c45062sih = new C45062sih();
        c45062sih.AEQbTJ(false);
        c45062sih.KWHzl(C33070mpX.AYXKKw(C47315tni.PendingIntent.DLGVGj));
        return c45062sih;
    }

    private final C45055sia uzCIH() {
        return (C45055sia) this.AYXKKw.getValue();
    }

    public static final C45055sia values(SupportTroubleshootResultActivity supportTroubleshootResultActivity) {
        C45055sia c45055sia = new C45055sia();
        c45055sia.copydefault(supportTroubleshootResultActivity);
        return c45055sia;
    }

    private final C45062sih fIwbmz() {
        return (C45062sih) this.OLrzqt.getValue();
    }

    public static final C45062sih gEmmrt() {
        C45062sih c45062sih = new C45062sih();
        c45062sih.AEQbTJ(false);
        c45062sih.KWHzl(C33070mpX.AYXKKw(C47315tni.PendingIntent.iKEqwx));
        return c45062sih;
    }

    private final C44810sdu fJNWhG() {
        return (C44810sdu) this.copydefault.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C44810sdu AuCTel() {
        return new C44810sdu(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    private final C44994shS hDKMBd() {
        return (C44994shS) this.gEmmrt.getValue();
    }

    public static final C44994shS fetchVPNInfo(SupportTroubleshootResultActivity supportTroubleshootResultActivity) {
        C44994shS c44994shS = new C44994shS();
        c44994shS.AEQbTJ(false);
        c44994shS.EZpvd(C33070mpX.AYXKKw(C47315tni.PendingIntent.fGQ));
        c44994shS.OLrzqt(supportTroubleshootResultActivity.new StateListAnimator());
        return c44994shS;
    }

    public static final class StateListAnimator implements C44994shS.StateListAnimator {
        public StateListAnimator() {
        }

        @Override // o.C44994shS.StateListAnimator
        public void EZpvd() {
            SupportTroubleshootResultActivity.this.isConnected().OLrzqt(false);
        }
    }

    private final C45059sie AuCTelauCTel() {
        return (C45059sie) this.isConnected.getValue();
    }

    public static final C45059sie DbNXlk(SupportTroubleshootResultActivity supportTroubleshootResultActivity) {
        C45059sie c45059sie = new C45059sie();
        c45059sie.AEQbTJ(false);
        c45059sie.KWHzl(supportTroubleshootResultActivity.new Activity());
        return c45059sie;
    }

    public static final class Activity implements C45059sie.StateListAnimator {
        public Activity() {
        }

        @Override // o.C45059sie.StateListAnimator
        public void KWHzl() {
            SupportTroubleshootResultActivity.this.wlaJM();
        }
    }

    private final C44987shL fARcdN() {
        return (C44987shL) this.AhwBna.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C44987shL ejfBZ() {
        C44987shL c44987shL = new C44987shL();
        c44987shL.AEQbTJ(false);
        C44987shL.updateEmptyProperties$default(c44987shL, 6, C33070mpX.AYXKKw(C47315tni.PendingIntent.AubY), null, null, 12, null);
        return c44987shL;
    }

    public final RatingChatbotAdapter fetchVPNInfo() {
        return (RatingChatbotAdapter) this.valueOf.getValue();
    }

    public static final RatingChatbotAdapter AkhnZx(SupportTroubleshootResultActivity supportTroubleshootResultActivity) {
        RatingChatbotAdapter ratingChatbotAdapter = new RatingChatbotAdapter();
        ratingChatbotAdapter.EZpvd(true);
        ratingChatbotAdapter.EZpvd();
        ratingChatbotAdapter.AEQbTJ();
        ratingChatbotAdapter.AEQbTJ(supportTroubleshootResultActivity);
        return ratingChatbotAdapter;
    }

    public final TroubleshootResultPageData djBIcL() {
        return (TroubleshootResultPageData) this.djBIcL.getValue();
    }

    public static final TroubleshootResultPageData isConnected(SupportTroubleshootResultActivity supportTroubleshootResultActivity) {
        TroubleshootResultPageData troubleshootResultPageData;
        if (Build.VERSION.SDK_INT >= 33) {
            troubleshootResultPageData = (TroubleshootResultPageData) supportTroubleshootResultActivity.getIntent().getParcelableExtra("arg_page_data", TroubleshootResultPageData.class);
        } else {
            troubleshootResultPageData = (TroubleshootResultPageData) supportTroubleshootResultActivity.getIntent().getParcelableExtra("arg_page_data");
        }
        if (troubleshootResultPageData != null) {
            return troubleshootResultPageData;
        }
        throw new IllegalArgumentException("Missing result data".toString());
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.center.ui.SupportTroubleshootResultActivity.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final Intent EZpvd(@NotNull Context context, @NotNull TroubleshootResultPageData troubleshootResultPageData) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(troubleshootResultPageData, "");
            Intent intent = new Intent(context, (Class<?>) SupportTroubleshootResultActivity.class);
            intent.putExtra("arg_page_data", troubleshootResultPageData);
            return intent;
        }
    }

    @Override // com.okinc.okex.common.ui.OKSupportBaseActivity
    public View AkhnZx() {
        View root = AhwBna().getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        return root;
    }

    @Override // com.okinc.okex.common.ui.OKSupportBaseActivity
    public void initFrameContent(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "");
        AhwBna();
        QOLQEE();
        sSMYrx();
        AxsJAY();
    }

    private final void sSMYrx() {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new SupportTroubleshootResultActivity$initViewModel$1(this, null), 3, null);
        SupportTroubleshootResultViewModel supportTroubleshootResultViewModelIsConnected = isConnected();
        supportTroubleshootResultViewModelIsConnected.gEmmrt().observe(this, new TaskDescription(new Function1() { // from class: o.shB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return SupportTroubleshootResultActivity.EZpvd(this.EZpvd, (TroubleshootResultAdapter.TaskDescription) obj);
            }
        }));
        supportTroubleshootResultViewModelIsConnected.valueOf().observe(this, new TaskDescription(new Function1() { // from class: o.shD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return SupportTroubleshootResultActivity.EZpvd(this.OLrzqt, (java.util.List) obj);
            }
        }));
        supportTroubleshootResultViewModelIsConnected.AYXKKw().observe(this, new TaskDescription(new Function1() { // from class: o.shE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return SupportTroubleshootResultActivity.KWHzl(this.copydefault, (java.util.List) obj);
            }
        }));
        supportTroubleshootResultViewModelIsConnected.AhwBna().observe(this, new TaskDescription(new Function1() { // from class: o.shJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return SupportTroubleshootResultActivity.KWHzl(this.OLrzqt, (java.lang.Boolean) obj);
            }
        }));
        supportTroubleshootResultViewModelIsConnected.AkhnZx().observe(this, new TaskDescription(new Function1() { // from class: o.shK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return SupportTroubleshootResultActivity.copydefault(this.copydefault, (java.lang.Boolean) obj);
            }
        }));
        supportTroubleshootResultViewModelIsConnected.ejfBZ().observe(this, new TaskDescription(new Function1() { // from class: o.shH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return SupportTroubleshootResultActivity.gEmmrt(this.EZpvd, (java.lang.Boolean) obj);
            }
        }));
        supportTroubleshootResultViewModelIsConnected.copydefault().observe(this, new TaskDescription(new Function1() { // from class: o.shp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return SupportTroubleshootResultActivity.copydefault(this.AEQbTJ, (ChatbotEntryDisplayModel) obj);
            }
        }));
    }

    public static final Unit EZpvd(SupportTroubleshootResultActivity supportTroubleshootResultActivity, TroubleshootResultAdapter.TaskDescription taskDescription) {
        supportTroubleshootResultActivity.DbNXlk().OLrzqt(taskDescription);
        supportTroubleshootResultActivity.DbNXlk().AEQbTJ(true);
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(SupportTroubleshootResultActivity supportTroubleshootResultActivity, List list) {
        C45062sih newProxyInstance = supportTroubleshootResultActivity.getNewProxyInstance();
        Intrinsics.copydefault(list);
        newProxyInstance.AEQbTJ(!list.isEmpty());
        C45055sia c45055siaUzCIH = supportTroubleshootResultActivity.uzCIH();
        RecyclerView recyclerView = supportTroubleshootResultActivity.AhwBna().copydefault;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "");
        c45055siaUzCIH.copydefault(recyclerView, list);
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(SupportTroubleshootResultActivity supportTroubleshootResultActivity, List list) {
        supportTroubleshootResultActivity.fIwbmz().AEQbTJ(true);
        supportTroubleshootResultActivity.fARcdN().AEQbTJ(list.isEmpty());
        C44810sdu c44810sduFJNWhG = supportTroubleshootResultActivity.fJNWhG();
        Intrinsics.copydefault(list);
        c44810sduFJNWhG.copydefault((List<SupportFaqArticle>) list);
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(SupportTroubleshootResultActivity supportTroubleshootResultActivity, Boolean bool) {
        supportTroubleshootResultActivity.hDKMBd().AEQbTJ(bool.booleanValue());
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(SupportTroubleshootResultActivity supportTroubleshootResultActivity, Boolean bool) {
        supportTroubleshootResultActivity.AuCTelauCTel().AEQbTJ(bool.booleanValue());
        return Unit.INSTANCE;
    }

    public static final Unit gEmmrt(SupportTroubleshootResultActivity supportTroubleshootResultActivity, Boolean bool) {
        if (bool.booleanValue()) {
            supportTroubleshootResultActivity.fetchVPNInfo().KWHzl();
        } else {
            supportTroubleshootResultActivity.fetchVPNInfo().EZpvd();
        }
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(SupportTroubleshootResultActivity supportTroubleshootResultActivity, ChatbotEntryDisplayModel chatbotEntryDisplayModel) {
        if (chatbotEntryDisplayModel != null) {
            supportTroubleshootResultActivity.fetchVPNInfo().EZpvd(chatbotEntryDisplayModel.getChatbotEnabled(), chatbotEntryDisplayModel.getChatWithUsTitle(), chatbotEntryDisplayModel.getChatbotIcon());
        }
        return Unit.INSTANCE;
    }

    private final void AxsJAY() {
        RecyclerView recyclerView = AhwBna().copydefault;
        ConcatAdapter concatAdapter = new ConcatAdapter((RecyclerView.Adapter<? extends RecyclerView.ViewHolder>[]) new RecyclerView.Adapter[]{DbNXlk(), getNewProxyInstance(), uzCIH(), fIwbmz(), fJNWhG(), hDKMBd(), AuCTelauCTel(), fARcdN(), fetchVPNInfo()});
        GridLayoutManager gridLayoutManager = new GridLayoutManager(recyclerView.getContext(), 2);
        gridLayoutManager.setSpanSizeLookup(new C44988shM(concatAdapter));
        recyclerView.setLayoutManager(gridLayoutManager);
        int iOLrzqt = C33070mpX.OLrzqt(C52761wXj.StateListAnimator.QUSxYX);
        int iOLrzqt2 = C33070mpX.OLrzqt(C52761wXj.StateListAnimator.ODWQjV);
        int iOLrzqt3 = C33070mpX.OLrzqt(C52761wXj.StateListAnimator.zuWLRA);
        int iOLrzqt4 = C33070mpX.OLrzqt(C52761wXj.StateListAnimator.ffGIBT);
        recyclerView.addItemDecoration(new C45393sou(getNewProxyInstance(), iOLrzqt2, 0, false, 4, null));
        recyclerView.addItemDecoration(new C45389soq(uzCIH(), iOLrzqt, iOLrzqt, iOLrzqt3, iOLrzqt3 + iOLrzqt2, iOLrzqt4));
        recyclerView.addItemDecoration(new C45393sou(fIwbmz(), iOLrzqt2, 0, false, 4, null));
        recyclerView.addItemDecoration(new C45393sou(fetchVPNInfo(), iOLrzqt2, 0, false, 4, null));
        recyclerView.setAdapter(concatAdapter);
        isConnected().OLrzqt(djBIcL());
        C45363soQ.onSessionIdEvent$default("SupportCenter_DepositStatusChecker_Result_View", false, new Function1() { // from class: o.shm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return SupportTroubleshootResultActivity.copydefault(this.EZpvd, (EventParamsList) obj);
            }
        }, 1, null);
    }

    public static final Unit copydefault(SupportTroubleshootResultActivity supportTroubleshootResultActivity, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("scenario", supportTroubleshootResultActivity.isConnected().KWHzl(supportTroubleshootResultActivity.djBIcL().getScenarioKey()), true);
        return Unit.INSTANCE;
    }

    private final void QOLQEE() {
        EZpvd(C52761wXj.TaskDescription.DztXDE, C52761wXj.Activity.fdOvFl, new View.OnClickListener() { // from class: o.shA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                SupportTroubleshootResultActivity.OLrzqt(this.AEQbTJ, view);
            }
        });
    }

    public static final void OLrzqt(SupportTroubleshootResultActivity supportTroubleshootResultActivity, View view) {
        Intent intentCreateIntent$default = ActivityC44878sfI.StateListAnimator.createIntent$default(ActivityC44878sfI.Companion, supportTroubleshootResultActivity, null, 2, null);
        intentCreateIntent$default.setFlags(603979776);
        supportTroubleshootResultActivity.startActivity(intentCreateIntent$default);
    }

    @Override // com.okinc.okex.center.ui.adapter.TroubleshootResultAdapter.Activity
    public void EZpvd(@NotNull String str, @NotNull TransactionType transactionType) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(transactionType, "");
        int i = Application.AEQbTJ[transactionType.ordinal()];
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

    @Override // com.okinc.okex.center.ui.adapter.TroubleshootResultAdapter.Activity
    public void AEQbTJ(final SelfServiceToolBean selfServiceToolBean) {
        C45363soQ.onSessionIdEvent$default("SupportCenter_DepositTicketEntrance_RequestHelp_Click", false, new Function1() { // from class: o.sho
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return SupportTroubleshootResultActivity.OLrzqt(selfServiceToolBean, (EventParamsList) obj);
            }
        }, 1, null);
        copydefault(selfServiceToolBean);
    }

    public static final Unit OLrzqt(SelfServiceToolBean selfServiceToolBean, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        String dataTrackingKey = selfServiceToolBean != null ? selfServiceToolBean.getDataTrackingKey() : null;
        EventParamsList.put$default(eventParamsList, "scenario", dataTrackingKey == null ? "" : dataTrackingKey, false, 4, null);
        return Unit.INSTANCE;
    }

    @Override // o.C45055sia.Activity
    public void EZpvd(@NotNull final SelfServiceToolBean selfServiceToolBean) {
        Intrinsics.checkNotNullParameter(selfServiceToolBean, "");
        C45363soQ.onSessionIdEvent$default("SupportCenter_Top_SelfService_Click", false, new Function1() { // from class: o.shC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return SupportTroubleshootResultActivity.AEQbTJ(selfServiceToolBean, this, (EventParamsList) obj);
            }
        }, 1, null);
        copydefault(selfServiceToolBean);
    }

    public static final Unit AEQbTJ(SelfServiceToolBean selfServiceToolBean, SupportTroubleshootResultActivity supportTroubleshootResultActivity, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("index", selfServiceToolBean.getDataTrackingKey(), false);
        eventParamsList.put("page", "result", true);
        EventParamsList.put$default(eventParamsList, "page_topic_name", selfServiceToolBean.getSlug(), false, 4, null);
        TransactionType transactionTypeFJNWhG = supportTroubleshootResultActivity.isConnected().fJNWhG();
        String value = transactionTypeFJNWhG != null ? transactionTypeFJNWhG.getValue() : null;
        EventParamsList.put$default(eventParamsList, "page_transaction_type", value == null ? "" : value, false, 4, null);
        String strAuCTel = supportTroubleshootResultActivity.isConnected().AuCTel();
        EventParamsList.put$default(eventParamsList, "page_transaction_status", strAuCTel == null ? "" : strAuCTel, false, 4, null);
        eventParamsList.put("mini_support_page", "false", true);
        return Unit.INSTANCE;
    }

    public final void copydefault(SelfServiceToolBean selfServiceToolBean) {
        if (selfServiceToolBean != null) {
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new SupportTroubleshootResultActivity$runSelfServiceAction$1$1(this, selfServiceToolBean, null), 3, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void wlaJM() {
        FullArticleListActivity.FullArticleListRequest fullArticleListRequestOLrzqt = isConnected().OLrzqt();
        if (fullArticleListRequestOLrzqt != null) {
            startActivity(FullArticleListActivity.Companion.OLrzqt(this, fullArticleListRequestOLrzqt));
        }
    }

    @Override // com.okinc.okex.center.ui.adapter.RatingChatbotAdapter.ActionBar
    public void copydefault(final boolean z) {
        C45363soQ.onSessionIdEvent$default("SupportCenter_Btm_HelpfulButton_Click", false, new Function1() { // from class: o.shk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return SupportTroubleshootResultActivity.OLrzqt(this.KWHzl, z, (EventParamsList) obj);
            }
        }, 1, null);
        isConnected().fARcdN();
        RatingResult value = isConnected().values().getValue();
        if (value != null) {
            sxK.copydefault.KWHzl(this, value, z);
        }
    }

    public static final Unit OLrzqt(SupportTroubleshootResultActivity supportTroubleshootResultActivity, boolean z, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("page", "result", true);
        String strDjBIcL = supportTroubleshootResultActivity.isConnected().djBIcL();
        EventParamsList.put$default(eventParamsList, "page_topic_name", strDjBIcL == null ? "" : strDjBIcL, false, 4, null);
        eventParamsList.put("mini_support_page", "false", true);
        eventParamsList.put(EopTrackEvent.KEY_BUTTON_NAME, z ? "yes" : "no", true);
        return Unit.INSTANCE;
    }

    @Override // com.okinc.okex.center.ui.adapter.RatingChatbotAdapter.ActionBar
    public void iwGUEr() {
        C45359soM.copydefault.KWHzl();
        final ChatbotEntryDisplayModel value = isConnected().copydefault().getValue();
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new SupportTroubleshootResultActivity$onChatbotClicked$1(this, C6805aWM.OLrzqt(new Function1() { // from class: o.shF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return SupportTroubleshootResultActivity.AEQbTJ(this.EZpvd, value, (ChatBotRequest) obj);
            }
        }), null), 3, null);
    }

    public static final Unit AEQbTJ(SupportTroubleshootResultActivity supportTroubleshootResultActivity, ChatbotEntryDisplayModel chatbotEntryDisplayModel, ChatBotRequest chatBotRequest) throws IOException {
        Intrinsics.checkNotNullParameter(chatBotRequest, "");
        chatBotRequest.setOkaFrom(supportTroubleshootResultActivity.isConnected().DbNXlk());
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

    @Override // o.AbstractActivityC44874sfE, com.okinc.okex.common.ui.OKSupportBaseActivity, o.AbstractActivityC45319snZ, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC44874sfE, com.okinc.okex.common.ui.OKSupportBaseActivity, o.AbstractActivityC45319snZ, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC44874sfE, com.okinc.okex.common.ui.OKSupportBaseActivity, o.AbstractActivityC45319snZ, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.AbstractActivityC44874sfE, com.okinc.okex.common.ui.OKSupportBaseActivity, o.AbstractActivityC45319snZ, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }

    @Override // o.AbstractActivityC44874sfE, com.okinc.okex.common.ui.OKSupportBaseActivity, o.AbstractActivityC45319snZ, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }
}
