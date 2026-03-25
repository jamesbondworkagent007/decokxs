package o;

import android.view.View;
import androidx.camera.video.AudioStats;
import androidx.core.content.IntentCompat;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.business.market.bean.TokenInfoForAlert;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.market.alert.data.MarketUserAlert;
import com.okinc.market.alert.database.MarketAlertDataBase;
import com.okinc.market.common.biz_spot.bean.AlertRemindPo;
import com.okinc.market.common.biz_spot.bean.DeleteRuleRep;
import com.okinc.market.common.biz_spot.bean.PriceRemindRulesListBean;
import com.okinc.market.common.biz_spot.bean.Rules;
import com.okinc.market.common.biz_spot.bean.UnifiedPriceRemind;
import com.okinc.market.common.service.BizMarketService;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.okcomponents.feature.oknotificationcenter.api.business.systempush.model.AppNotificationBizType;
import com.okinc.okmarket.ui.market.remind.IAllPriceRemindActivity$deleteItem$10$1;
import com.okinc.okmarket.ui.market.remind.IAllPriceRemindActivity$deleteItem$3$1;
import com.okinc.okmarket.ui.market.remind.IAllPriceRemindActivity$getAllReminds$2$2;
import com.okinc.okmarket.ui.market.remind.IAllPriceRemindActivity$isMessageSettingsAlertOpen$1;
import com.okinc.okmarket.ui.market.remind.IAllPriceRemindActivity$onCreate$7$1;
import com.okinc.okmarket.ui.market.remind.IAllPriceRemindActivity$onCreate$8$1;
import com.okinc.okmarket.ui.market.remind.IAllPriceRemindActivity$onCreate$8$2;
import com.okinc.okmarket.ui.market.remind.IAllPriceRemindActivity$openAddAlertDialog$1;
import com.okinc.okmarket.ui.market.remind.IAllPriceRemindActivity$showErrorView$1$1;
import com.okinc.rxutils.RxBus;
import com.okinc.uilab.reminder.OKReminder;
import com.reown.foundation.util.jwt.JwtUtilsKt;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C33625mzw;
import o.C46818teO;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tdQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractActivityC46767tdQ extends AbstractActivityC33041mov {
    public android.widget.CheckBox AhwBna;
    public android.view.View AuCTel;
    public android.view.View AuCTelauCTel;
    public C33537myN DbNXlk;
    public android.view.View djBIcL;
    public int fJNWhG;
    public boolean fetchVPNInfo;
    public C52794wYp gEmmrt;
    public android.view.View getFieldNames;
    public UnifiedPriceRemind getNewProxyInstance;
    public OKReminder hDKMBd;
    public C52794wYp isConnected;
    public android.widget.TextView iwGUEr;
    public final InterfaceC56387yDm sSMYrx;
    public RecyclerView uzCIH;
    public double wlaJM;
    public TokenInfoForAlert zLjUOn;
    public C55173xeu zsXlph;
    public final InterfaceC56387yDm fARcdN = C56392yDr.copydefault(new Function0() { // from class: o.tel
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return AbstractActivityC46767tdQ.valueOf();
        }
    });
    public final InterfaceC56387yDm ejfBZ = C56392yDr.copydefault(new Function0() { // from class: o.ten
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return AbstractActivityC46767tdQ.djBIcL(this.OLrzqt);
        }
    });
    public final AtomicInteger values = new AtomicInteger();
    public final java.util.ArrayList<java.lang.String> fIwbmz = new java.util.ArrayList<>();
    public final BizMarketService AkhnZx = (BizMarketService) C43417ror.OLrzqt(C56524yIo.AEQbTJ(BizMarketService.class));
    public final InterfaceC56387yDm AubY = C56392yDr.copydefault(new Function0() { // from class: o.tem
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return AbstractActivityC46767tdQ.djBIcL();
        }
    });

    public abstract java.util.List<C46707tcJ> AEQbTJ(@NotNull java.util.List<PriceRemindRulesListBean> list);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.ArrayList<java.lang.String> AkhnZx() {
        return this.fIwbmz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AtomicInteger DbNXlk() {
        return this.values;
    }

    public abstract void OLrzqt(@NotNull Function0<Unit> function0);

    public AbstractActivityC46767tdQ() {
        final Function0 function0 = null;
        this.sSMYrx = new ViewModelLazy(C56524yIo.AEQbTJ(C46848tes.class), new Function0<ViewModelStore>() { // from class: com.okinc.okmarket.ui.market.remind.IAllPriceRemindActivity$special$$inlined$viewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.okmarket.ui.market.remind.IAllPriceRemindActivity$special$$inlined$viewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.okmarket.ui.market.remind.IAllPriceRemindActivity$special$$inlined$viewModels$default$3
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

    public static final java.util.ArrayList valueOf() {
        return new java.util.ArrayList();
    }

    public final java.util.ArrayList<C46707tcJ> isConnected() {
        return (java.util.ArrayList) this.fARcdN.getValue();
    }

    public static final C46754tdD djBIcL(AbstractActivityC46767tdQ abstractActivityC46767tdQ) {
        return new C46754tdD(abstractActivityC46767tdQ, abstractActivityC46767tdQ.isConnected());
    }

    public final C46754tdD values() {
        return (C46754tdD) this.ejfBZ.getValue();
    }

    public final C46848tes fetchVPNInfo() {
        return (C46848tes) this.sSMYrx.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C38383pWt OLrzqt() {
        return (C38383pWt) this.AubY.getValue();
    }

    public static final C38383pWt djBIcL() {
        return new C38383pWt(C38384pWu.Companion.copydefault(MarketAlertDataBase.Companion.EZpvd()));
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setContentView(qZH.ActionBar.OLrzqt);
        this.getNewProxyInstance = (UnifiedPriceRemind) IntentCompat.getParcelableExtra(getIntent(), "conin_info", UnifiedPriceRemind.class);
        this.zLjUOn = (TokenInfoForAlert) IntentCompat.getParcelableExtra(getIntent(), "token_alert_info", TokenInfoForAlert.class);
        this.wlaJM = getIntent().getDoubleExtra(JwtUtilsKt.DID_METHOD_KEY, AudioStats.AUDIO_AMPLITUDE_NONE);
        this.uzCIH = (RecyclerView) findViewById(qZH.StateListAnimator.setProfilesSinceInitCount);
        this.DbNXlk = (C33537myN) findViewById(qZH.StateListAnimator.isConnected);
        RecyclerView recyclerView = this.uzCIH;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
            recyclerView.setAdapter(values());
        }
        this.djBIcL = findViewById(qZH.StateListAnimator.RckOJh);
        this.gEmmrt = (C52794wYp) findViewById(qZH.StateListAnimator.gkJEwt);
        this.zsXlph = (C55173xeu) findViewById(qZH.StateListAnimator.QhYuFg);
        this.getFieldNames = findViewById(qZH.StateListAnimator.GhqvEQ);
        this.hDKMBd = (OKReminder) findViewById(qZH.StateListAnimator.QOeQqh);
        android.view.View viewFindViewById = findViewById(qZH.StateListAnimator.seuMaA);
        this.AuCTelauCTel = viewFindViewById;
        if (viewFindViewById != null) {
            viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: o.tek
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    AbstractActivityC46767tdQ.AEQbTJ(this.KWHzl, view);
                }
            });
        }
        C52794wYp c52794wYp = (C52794wYp) findViewById(qZH.StateListAnimator.DGUQLIhJrIAr);
        this.isConnected = c52794wYp;
        if (c52794wYp != null) {
            c52794wYp.setOnClickListener(new View.OnClickListener() { // from class: o.tdW
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    AbstractActivityC46767tdQ.valueOf(this.AEQbTJ, view);
                }
            });
        }
        C52794wYp c52794wYp2 = this.isConnected;
        if (c52794wYp2 != null) {
            c52794wYp2.setEnabled(false);
        }
        android.widget.CheckBox checkBox = (android.widget.CheckBox) findViewById(qZH.StateListAnimator.gEmmrt);
        this.AhwBna = checkBox;
        if (checkBox != null) {
            checkBox.setClickable(false);
        }
        values().OLrzqt(new Function1() { // from class: o.tdX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractActivityC46767tdQ.KWHzl(this.AEQbTJ, (java.util.List) obj);
            }
        });
        android.widget.TextView textView = (android.widget.TextView) findViewById(qZH.StateListAnimator.hcetpZ);
        this.iwGUEr = textView;
        if (textView != null) {
            textView.setOnClickListener(new View.OnClickListener() { // from class: o.tdY
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    AbstractActivityC46767tdQ.AhwBna(this.KWHzl, view);
                }
            });
        }
        this.AuCTel = findViewById(qZH.StateListAnimator.GhqvEQ);
        AEQbTJ();
        C32866mlf.onEvent$default("PriceAlert_AllAlerts_Page_View", (TrackChannel[]) null, new Function1() { // from class: o.tdV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractActivityC46767tdQ.AEQbTJ((EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
        C52794wYp c52794wYp3 = this.gEmmrt;
        if (c52794wYp3 != null) {
            c52794wYp3.setOnClickListener(new TaskDescription(c52794wYp3, 1000L, this));
        }
        values().KWHzl(new yHO() { // from class: o.tdU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHO
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return AbstractActivityC46767tdQ.EZpvd(this.OLrzqt, (C46705tcH) obj, ((java.lang.Integer) obj2).intValue(), (java.lang.String) obj3);
            }
        });
    }

    public static final void AEQbTJ(AbstractActivityC46767tdQ abstractActivityC46767tdQ, android.view.View view) {
        view.setSelected(!view.isSelected());
        abstractActivityC46767tdQ.values().AEQbTJ(view.isSelected());
    }

    public static final void valueOf(AbstractActivityC46767tdQ abstractActivityC46767tdQ, android.view.View view) {
        abstractActivityC46767tdQ.gEmmrt();
    }

    public static final Unit KWHzl(AbstractActivityC46767tdQ abstractActivityC46767tdQ, java.util.List list) {
        boolean z;
        Intrinsics.checkNotNullParameter(list, "");
        android.widget.CheckBox checkBox = abstractActivityC46767tdQ.AhwBna;
        if (checkBox != null) {
            if ((list instanceof java.util.Collection) && list.isEmpty()) {
                z = true;
                checkBox.setChecked(z);
            } else {
                java.util.Iterator it = list.iterator();
                while (it.hasNext()) {
                    C46707tcJ c46707tcJ = (C46707tcJ) it.next();
                    if (!c46707tcJ.djBIcL() || c46707tcJ.gEmmrt()) {
                        z = false;
                        break;
                    }
                }
                z = true;
                checkBox.setChecked(z);
            }
        }
        int size = abstractActivityC46767tdQ.values().AEQbTJ().size();
        if (size == 0) {
            C52794wYp c52794wYp = abstractActivityC46767tdQ.isConnected;
            if (c52794wYp != null) {
                c52794wYp.setEnabled(false);
            }
            C52794wYp c52794wYp2 = abstractActivityC46767tdQ.isConnected;
            if (c52794wYp2 != null) {
                c52794wYp2.setAlpha(0.5f);
            }
            C52794wYp c52794wYp3 = abstractActivityC46767tdQ.isConnected;
            if (c52794wYp3 != null) {
                c52794wYp3.setText(C33070mpX.AYXKKw(qZH.PendingIntent.NRYds));
            }
        } else {
            C52794wYp c52794wYp4 = abstractActivityC46767tdQ.isConnected;
            if (c52794wYp4 != null) {
                c52794wYp4.setEnabled(true);
            }
            C52794wYp c52794wYp5 = abstractActivityC46767tdQ.isConnected;
            if (c52794wYp5 != null) {
                c52794wYp5.setAlpha(1.0f);
            }
            C52794wYp c52794wYp6 = abstractActivityC46767tdQ.isConnected;
            if (c52794wYp6 != null) {
                c52794wYp6.setText(pTD.KWHzl(abstractActivityC46767tdQ, qZH.PendingIntent.GFUIi, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("num", java.lang.String.valueOf(size)))));
            }
        }
        return Unit.INSTANCE;
    }

    public static final void AhwBna(AbstractActivityC46767tdQ abstractActivityC46767tdQ, android.view.View view) {
        abstractActivityC46767tdQ.AEQbTJ(!abstractActivityC46767tdQ.fetchVPNInfo);
        C32866mlf.onEvent$default("PriceAlert_Top_Manage_Click", (TrackChannel[]) null, new Function1() { // from class: o.tec
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractActivityC46767tdQ.OLrzqt((EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit OLrzqt(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "entry_point", "mobile_entry_button", false, 4, null);
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "entry_point", "mobile_entry_button", false, 4, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.tdQ$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ AbstractActivityC46767tdQ EZpvd;
        public final /* synthetic */ long OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, AbstractActivityC46767tdQ abstractActivityC46767tdQ) {
            this.AEQbTJ = view;
            this.OLrzqt = j;
            this.EZpvd = abstractActivityC46767tdQ;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.OLrzqt || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this.EZpvd), null, null, new IAllPriceRemindActivity$onCreate$7$1(this.EZpvd, null), 3, null);
            }
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final Unit EZpvd(AbstractActivityC46767tdQ abstractActivityC46767tdQ, C46705tcH c46705tcH, int i, java.lang.String str) {
        Intrinsics.checkNotNullParameter(c46705tcH, "");
        C46705tcH c46705tcHKWHzl = c46705tcH.KWHzl((16777215 & 1) != 0 ? c46705tcH.ejfBZ : null, (16777215 & 2) != 0 ? c46705tcH.KWHzl : 0, (16777215 & 4) != 0 ? c46705tcH.values : null, (16777215 & 8) != 0 ? c46705tcH.gEmmrt : null, (16777215 & 16) != 0 ? c46705tcH.fJNWhG : 0, (16777215 & 32) != 0 ? c46705tcH.fARcdN : 0, (16777215 & 64) != 0 ? c46705tcH.DbNXlk : null, (16777215 & 128) != 0 ? c46705tcH.fetchVPNInfo : null, (16777215 & 256) != 0 ? c46705tcH.AkhnZx : false, (16777215 & 512) != 0 ? c46705tcH.AEQbTJ : 0, (16777215 & 1024) != 0 ? c46705tcH.djBIcL : null, (16777215 & 2048) != 0 ? c46705tcH.AhwBna : 0L, (16777215 & 4096) != 0 ? c46705tcH.fIwbmz : 0, (16777215 & 8192) != 0 ? c46705tcH.copydefault : null, (16777215 & 16384) != 0 ? c46705tcH.getNewProxyInstance : null, (16777215 & 32768) != 0 ? c46705tcH.uzCIH : null, (16777215 & 65536) != 0 ? c46705tcH.OLrzqt : null, (16777215 & 131072) != 0 ? c46705tcH.hDKMBd : null, (16777215 & 262144) != 0 ? c46705tcH.getFieldNames : 0, (16777215 & 524288) != 0 ? c46705tcH.valueOf : null, (16777215 & 1048576) != 0 ? c46705tcH.AuCTel : null, (16777215 & 2097152) != 0 ? c46705tcH.EZpvd : null, (16777215 & 4194304) != 0 ? c46705tcH.AYXKKw : null, (16777215 & 8388608) != 0 ? c46705tcH.isConnected : 0);
        if (str != null) {
            switch (str.hashCode()) {
                case 48:
                    if (str.equals("0")) {
                        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(abstractActivityC46767tdQ), null, null, new IAllPriceRemindActivity$onCreate$8$1(c46705tcHKWHzl, abstractActivityC46767tdQ, null), 3, null);
                    }
                    break;
                case 49:
                    if (str.equals("1")) {
                        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(abstractActivityC46767tdQ), null, null, new IAllPriceRemindActivity$onCreate$8$2(abstractActivityC46767tdQ, c46705tcHKWHzl, c46705tcH, null), 3, null);
                    }
                    break;
                case 50:
                    if (str.equals("2")) {
                        C32866mlf.onEvent$default("PriceAlert_AllAlerts_SwipeToDelete_Swipe", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
                        abstractActivityC46767tdQ.OLrzqt(c46705tcHKWHzl, i);
                    }
                    break;
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.teO.TaskDescription.newInstance$default(o.teO$TaskDescription, java.lang.String, java.lang.String, com.okinc.market.common.biz_spot.bean.AlertRemindPo, java.lang.String, java.lang.String, java.lang.String, int, com.okinc.business.market.bean.TokenInfoForAlert, int, java.lang.Object):o.teO */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0090 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(Continuation<? super Unit> continuation) throws java.lang.Throwable {
        IAllPriceRemindActivity$openAddAlertDialog$1 iAllPriceRemindActivity$openAddAlertDialog$1;
        int i;
        int iAEQbTJ;
        AbstractActivityC46767tdQ abstractActivityC46767tdQ;
        java.lang.String instrumentType;
        java.lang.String instrumentId;
        if (continuation instanceof IAllPriceRemindActivity$openAddAlertDialog$1) {
            iAllPriceRemindActivity$openAddAlertDialog$1 = (IAllPriceRemindActivity$openAddAlertDialog$1) continuation;
            int i2 = iAllPriceRemindActivity$openAddAlertDialog$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                iAllPriceRemindActivity$openAddAlertDialog$1.label = i2 - Integer.MIN_VALUE;
            } else {
                iAllPriceRemindActivity$openAddAlertDialog$1 = new IAllPriceRemindActivity$openAddAlertDialog$1(this, continuation);
            }
        }
        java.lang.Object objOLrzqt = iAllPriceRemindActivity$openAddAlertDialog$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i3 = iAllPriceRemindActivity$openAddAlertDialog$1.label;
        if (i3 == 0) {
            C56391yDq.AEQbTJ(objOLrzqt);
            C46818teO.TaskDescription taskDescription = C46818teO.Companion;
            UnifiedPriceRemind unifiedPriceRemind = this.getNewProxyInstance;
            java.lang.String str = (unifiedPriceRemind == null || (instrumentId = unifiedPriceRemind.getInstrumentId()) == null) ? "" : instrumentId;
            UnifiedPriceRemind unifiedPriceRemind2 = this.getNewProxyInstance;
            java.lang.String str2 = (unifiedPriceRemind2 == null || (instrumentType = unifiedPriceRemind2.getInstrumentType()) == null) ? "" : instrumentType;
            UnifiedPriceRemind unifiedPriceRemind3 = this.getNewProxyInstance;
            if (unifiedPriceRemind3 != null) {
                iAEQbTJ = unifiedPriceRemind3.getSourceType();
            } else {
                TokenInfoForAlert tokenInfoForAlert = this.zLjUOn;
                if (tokenInfoForAlert != null) {
                    iAEQbTJ = tokenInfoForAlert.AEQbTJ();
                } else {
                    i = 1;
                    C46818teO c46818teOOLrzqt = taskDescription.OLrzqt(str, str2, null, (56 & 8) != 0 ? "" : null, (56 & 16) != 0 ? "" : null, (56 & 32) != 0 ? "" : null, i, this.zLjUOn);
                    androidx.fragment.app.FragmentManager supportFragmentManager = getSupportFragmentManager();
                    Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
                    iAllPriceRemindActivity$openAddAlertDialog$1.L$0 = this;
                    iAllPriceRemindActivity$openAddAlertDialog$1.label = 1;
                    objOLrzqt = c46818teOOLrzqt.OLrzqt(supportFragmentManager, iAllPriceRemindActivity$openAddAlertDialog$1);
                    if (objOLrzqt != objCopydefault) {
                        return objCopydefault;
                    }
                    abstractActivityC46767tdQ = this;
                }
            }
            i = iAEQbTJ;
            C46818teO c46818teOOLrzqt2 = taskDescription.OLrzqt(str, str2, null, (56 & 8) != 0 ? "" : null, (56 & 16) != 0 ? "" : null, (56 & 32) != 0 ? "" : null, i, this.zLjUOn);
            androidx.fragment.app.FragmentManager supportFragmentManager2 = getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager2, "");
            iAllPriceRemindActivity$openAddAlertDialog$1.L$0 = this;
            iAllPriceRemindActivity$openAddAlertDialog$1.label = 1;
            objOLrzqt = c46818teOOLrzqt2.OLrzqt(supportFragmentManager2, iAllPriceRemindActivity$openAddAlertDialog$1);
            if (objOLrzqt != objCopydefault) {
            }
        } else {
            if (i3 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            abstractActivityC46767tdQ = (AbstractActivityC46767tdQ) iAllPriceRemindActivity$openAddAlertDialog$1.L$0;
            C56391yDq.AEQbTJ(objOLrzqt);
        }
        if (((java.lang.Boolean) objOLrzqt).booleanValue()) {
            abstractActivityC46767tdQ.AEQbTJ();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void ejfBZ() {
        if (fetchVPNInfo().EZpvd()) {
            int i = 0;
            fetchVPNInfo().OLrzqt(false);
            if (isConnected().size() >= 2) {
                UnifiedPriceRemind unifiedPriceRemindOLrzqt = fetchVPNInfo().OLrzqt();
                java.lang.String instrumentId = unifiedPriceRemindOLrzqt != null ? unifiedPriceRemindOLrzqt.getInstrumentId() : null;
                UnifiedPriceRemind unifiedPriceRemind = this.getNewProxyInstance;
                boolean zEZpvd = Intrinsics.EZpvd((java.lang.Object) instrumentId, (java.lang.Object) (unifiedPriceRemind != null ? unifiedPriceRemind.getInstrumentId() : null));
                pWL pwlKWHzl = fetchVPNInfo().KWHzl();
                if (pwlKWHzl != null) {
                    java.lang.String strEZpvd = pwlKWHzl.EZpvd();
                    TokenInfoForAlert tokenInfoForAlert = this.zLjUOn;
                    if (Intrinsics.EZpvd((java.lang.Object) strEZpvd, (java.lang.Object) (tokenInfoForAlert != null ? tokenInfoForAlert.OLrzqt() : null))) {
                        java.lang.String strKWHzl = pwlKWHzl.KWHzl();
                        TokenInfoForAlert tokenInfoForAlert2 = this.zLjUOn;
                        boolean z = Intrinsics.EZpvd((java.lang.Object) strKWHzl, (java.lang.Object) (tokenInfoForAlert2 != null ? tokenInfoForAlert2.copydefault() : null));
                        if (!zEZpvd && !z) {
                            i = 1;
                        }
                    }
                }
            }
            RecyclerView recyclerView = this.uzCIH;
            if (recyclerView != null) {
                recyclerView.smoothScrollToPosition(i);
            }
        }
    }

    public final void gEmmrt() {
        java.util.List<C46705tcH> listAEQbTJ = values().AEQbTJ();
        if (listAEQbTJ.isEmpty()) {
            return;
        }
        copydefault(listAEQbTJ);
    }

    public final void AuCTel() {
        java.lang.String strCopydefault;
        int i;
        int iOLrzqt;
        android.widget.TextView textView;
        if (isConnected().size() == 0 && (textView = this.iwGUEr) != null) {
            textView.setEnabled(false);
        }
        java.util.ArrayList<C46707tcJ> arrayListIsConnected = isConnected();
        if (!(arrayListIsConnected instanceof java.util.Collection) || !arrayListIsConnected.isEmpty()) {
            for (C46707tcJ c46707tcJ : arrayListIsConnected) {
                java.lang.String strCopydefault2 = c46707tcJ.copydefault();
                UnifiedPriceRemind unifiedPriceRemind = this.getNewProxyInstance;
                if (Intrinsics.EZpvd((java.lang.Object) strCopydefault2, (java.lang.Object) (unifiedPriceRemind != null ? unifiedPriceRemind.getInstrumentId() : null)) || Intrinsics.EZpvd((java.lang.Object) c46707tcJ.copydefault(), (java.lang.Object) getCeDefiSymbol$default(this, null, 1, null))) {
                    return;
                }
            }
        }
        UnifiedPriceRemind unifiedPriceRemind2 = this.getNewProxyInstance;
        if (unifiedPriceRemind2 == null) {
            TokenInfoForAlert tokenInfoForAlert = this.zLjUOn;
            if (tokenInfoForAlert != null) {
                java.util.ArrayList<C46707tcJ> arrayListIsConnected2 = isConnected();
                java.lang.String strAYXKKw = tokenInfoForAlert.AYXKKw();
                java.util.ArrayList arrayListCopydefault = yDY.copydefault(new C46705tcH("", 0, "", null, 0, 0, null, null, false, 0, null, 0L, 2, tokenInfoForAlert.OLrzqt(), tokenInfoForAlert.copydefault(), tokenInfoForAlert.EZpvd(), tokenInfoForAlert.KWHzl(), tokenInfoForAlert.AYXKKw(), 0, null, null, null, null, 0, 16519160, null));
                java.lang.String strEZpvd = tokenInfoForAlert.EZpvd();
                java.lang.String strKWHzl = tokenInfoForAlert.KWHzl();
                TokenInfoForAlert tokenInfoForAlert2 = this.zLjUOn;
                arrayListIsConnected2.add(0, new C46707tcJ(strAYXKKw, "", "", arrayListCopydefault, true, false, true, strEZpvd, strKWHzl, (tokenInfoForAlert2 == null || (strCopydefault = tokenInfoForAlert2.copydefault()) == null) ? "" : strCopydefault, 32, null));
                return;
            }
            return;
        }
        java.lang.String instrumentType = unifiedPriceRemind2 != null ? unifiedPriceRemind2.getInstrumentType() : null;
        if (instrumentType == null) {
            i = 0;
        } else {
            int iHashCode = instrumentType.hashCode();
            if (iHashCode == 2552066) {
                if (instrumentType.equals("SPOT")) {
                    iOLrzqt = C27553jxP.KWHzl.OLrzqt();
                    i = iOLrzqt;
                }
                i = 0;
            } else if (iHashCode != 2558355) {
                if (iHashCode == 214415088 && instrumentType.equals("FUTURES")) {
                    iOLrzqt = C27553jxP.KWHzl.KWHzl();
                    i = iOLrzqt;
                }
                i = 0;
            } else {
                if (instrumentType.equals("SWAP")) {
                    iOLrzqt = C27553jxP.KWHzl.AEQbTJ();
                    i = iOLrzqt;
                }
                i = 0;
            }
        }
        UnifiedPriceRemind unifiedPriceRemind3 = this.getNewProxyInstance;
        if (unifiedPriceRemind3 != null) {
            java.lang.String strCopydefault3 = C44585sZg.AEQbTJ(unifiedPriceRemind3.getInstrumentId()).copydefault();
            java.util.Locale locale = java.util.Locale.ROOT;
            Intrinsics.checkNotNullExpressionValue(locale, "");
            java.lang.String upperCase = strCopydefault3.toUpperCase(locale);
            Intrinsics.checkNotNullExpressionValue(upperCase, "");
            isConnected().add(0, new C46707tcJ(unifiedPriceRemind3.getCoinName(), unifiedPriceRemind3.getInstrumentId(), unifiedPriceRemind3.getDisplayId(), yDY.copydefault(new C46705tcH(unifiedPriceRemind3.getCoinName(), i, unifiedPriceRemind3.getInstrumentId(), null, 0, 0, null, null, false, 0, null, 0L, unifiedPriceRemind3.getSourceType(), null, null, null, null, null, 0, null, null, null, null, 0, 16773112, null)), true, false, true, C55687xoe.AEQbTJ.OLrzqt(upperCase), null, "", 288, null));
        }
    }

    public static /* synthetic */ java.lang.String getCeDefiSymbol$default(AbstractActivityC46767tdQ abstractActivityC46767tdQ, AlertRemindPo alertRemindPo, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getCeDefiSymbol");
        }
        if ((i & 1) != 0) {
            alertRemindPo = null;
        }
        return abstractActivityC46767tdQ.AEQbTJ(alertRemindPo);
    }

    public final java.lang.String AEQbTJ(AlertRemindPo alertRemindPo) {
        java.lang.String str;
        if (alertRemindPo != null) {
            str = alertRemindPo.getToken() + "," + alertRemindPo.getTokenAddress() + "," + alertRemindPo.getChainId();
        } else {
            TokenInfoForAlert tokenInfoForAlert = this.zLjUOn;
            java.lang.String strAYXKKw = tokenInfoForAlert != null ? tokenInfoForAlert.AYXKKw() : null;
            TokenInfoForAlert tokenInfoForAlert2 = this.zLjUOn;
            java.lang.String strCopydefault = tokenInfoForAlert2 != null ? tokenInfoForAlert2.copydefault() : null;
            TokenInfoForAlert tokenInfoForAlert3 = this.zLjUOn;
            str = strAYXKKw + "," + strCopydefault + "," + (tokenInfoForAlert3 != null ? tokenInfoForAlert3.OLrzqt() : null);
        }
        return C59449zhJ.replace$default(str, " ", "", false, 4, (java.lang.Object) null);
    }

    public final void AhwBna() {
        java.util.ArrayList<C46707tcJ> arrayListIsConnected = isConnected();
        if ((arrayListIsConnected instanceof java.util.Collection) && arrayListIsConnected.isEmpty()) {
            return;
        }
        java.util.Iterator<T> it = arrayListIsConnected.iterator();
        while (it.hasNext()) {
            java.lang.String strCopydefault = ((C46707tcJ) it.next()).copydefault();
            UnifiedPriceRemind unifiedPriceRemind = this.getNewProxyInstance;
            if (Intrinsics.EZpvd((java.lang.Object) strCopydefault, (java.lang.Object) (unifiedPriceRemind != null ? unifiedPriceRemind.getInstrumentId() : null))) {
                C56406yEe.AEQbTJ(isConnected(), new Function1() { // from class: o.tej
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return java.lang.Boolean.valueOf(AbstractActivityC46767tdQ.AEQbTJ((C46707tcJ) obj));
                    }
                });
                return;
            }
        }
    }

    public static final boolean AEQbTJ(C46707tcJ c46707tcJ) {
        Intrinsics.checkNotNullParameter(c46707tcJ, "");
        return c46707tcJ.gEmmrt();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void AEQbTJ() {
        showLoading();
        C33024moe.subscribeOnIO$default(this.AkhnZx.getListByInstrument(), new Function1() { // from class: o.tei
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractActivityC46767tdQ.OLrzqt(this.copydefault, (java.lang.Throwable) obj);
            }
        }, (Function0) null, new Function1() { // from class: o.teg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractActivityC46767tdQ.EZpvd(this.copydefault, (ResponseData) obj);
            }
        }, 2, (java.lang.Object) null);
    }

    public static final Unit EZpvd(final AbstractActivityC46767tdQ abstractActivityC46767tdQ, final ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        abstractActivityC46767tdQ.dismissLoading();
        C55173xeu c55173xeu = abstractActivityC46767tdQ.zsXlph;
        if (c55173xeu != null) {
            c55173xeu.setVisibility(8);
        }
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            abstractActivityC46767tdQ.fIwbmz.clear();
            java.util.ArrayList arrayList = (java.util.ArrayList) responseData.getData();
            if (arrayList != null) {
                java.util.Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    java.lang.String strKWHzl = C27553jxP.KWHzl.KWHzl(((AlertRemindPo) it.next()).getBizType());
                    if (!abstractActivityC46767tdQ.fIwbmz.contains(strKWHzl)) {
                        abstractActivityC46767tdQ.fIwbmz.add(strKWHzl);
                    }
                }
            }
            java.util.ArrayList arrayList2 = (java.util.ArrayList) responseData.getData();
            if (arrayList2 == null || arrayList2.isEmpty()) {
                abstractActivityC46767tdQ.isConnected().clear();
                abstractActivityC46767tdQ.AEQbTJ(false);
                if (abstractActivityC46767tdQ.isConnected().isEmpty()) {
                    abstractActivityC46767tdQ.AuCTel();
                }
                abstractActivityC46767tdQ.values().notifyDataSetChanged();
                rVN.reportFullyDrawn$default((android.app.Activity) abstractActivityC46767tdQ, true, (java.lang.String) null, 2, (java.lang.Object) null);
                return Unit.INSTANCE;
            }
            android.widget.TextView textView = abstractActivityC46767tdQ.iwGUEr;
            if (textView != null) {
                textView.setEnabled(C33129mqd.KWHzl((java.util.Collection) responseData.getData()));
            }
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(abstractActivityC46767tdQ), null, null, new IAllPriceRemindActivity$getAllReminds$2$2(responseData, abstractActivityC46767tdQ, null), 3, null);
            abstractActivityC46767tdQ.OLrzqt(new Function0() { // from class: o.teh
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return AbstractActivityC46767tdQ.OLrzqt(responseData, abstractActivityC46767tdQ);
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r11v18, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r11v22, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r11v27, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r11v28, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r11v29, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r11v30, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v5, types: [T, java.util.List] */
    public static final Unit OLrzqt(ResponseData responseData, AbstractActivityC46767tdQ abstractActivityC46767tdQ) {
        java.util.List<PriceRemindRulesListBean> listAhwBna;
        java.lang.Object next;
        T t;
        java.lang.Object next2;
        T t2;
        java.lang.Object next3;
        java.util.ArrayList arrayList = (java.util.ArrayList) responseData.getData();
        if (arrayList == null) {
            listAhwBna = yDY.AhwBna();
        } else {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (java.lang.Object obj : arrayList) {
                AlertRemindPo alertRemindPo = (AlertRemindPo) obj;
                java.lang.String instrumentName = alertRemindPo.getInstrumentName();
                if (instrumentName.length() == 0) {
                    instrumentName = abstractActivityC46767tdQ.AEQbTJ(alertRemindPo);
                }
                java.lang.Object arrayList2 = linkedHashMap.get(instrumentName);
                if (arrayList2 == null) {
                    arrayList2 = new java.util.ArrayList();
                    linkedHashMap.put(instrumentName, arrayList2);
                }
                ((java.util.List) arrayList2).add(obj);
            }
            listAhwBna = new java.util.ArrayList<>(linkedHashMap.size());
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                java.lang.String str = (java.lang.String) entry.getKey();
                AlertRemindPo alertRemindPo2 = (AlertRemindPo) CollectionsKt___CollectionsKt.firstOrNull((java.util.List) entry.getValue());
                listAhwBna.add(new PriceRemindRulesListBean(str, (java.lang.String) null, alertRemindPo2 != null ? alertRemindPo2.getBizType() : 0, (java.util.List) entry.getValue(), 2, (DefaultConstructorMarker) null));
            }
        }
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = abstractActivityC46767tdQ.AEQbTJ(listAhwBna);
        java.util.ArrayList<C46707tcJ> arrayListIsConnected = abstractActivityC46767tdQ.isConnected();
        if (!abstractActivityC46767tdQ.isConnected().isEmpty()) {
            for (C46707tcJ c46707tcJ : arrayListIsConnected) {
                java.util.Iterator it = ((java.lang.Iterable) objectRef.element).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next3 = null;
                        break;
                    }
                    next3 = it.next();
                    if (Intrinsics.EZpvd((java.lang.Object) c46707tcJ.OLrzqt(), (java.lang.Object) ((C46707tcJ) next3).OLrzqt())) {
                        break;
                    }
                }
                C46707tcJ c46707tcJ2 = (C46707tcJ) next3;
                if (c46707tcJ2 != null) {
                    c46707tcJ2.EZpvd(c46707tcJ.valueOf());
                }
            }
        }
        UnifiedPriceRemind unifiedPriceRemind = (UnifiedPriceRemind) abstractActivityC46767tdQ.getIntent().getParcelableExtra("conin_info");
        abstractActivityC46767tdQ.getNewProxyInstance = unifiedPriceRemind;
        if (unifiedPriceRemind != null) {
            java.util.Iterator it2 = ((java.lang.Iterable) objectRef.element).iterator();
            loop4: while (true) {
                if (!it2.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it2.next();
                java.util.ArrayList<C46705tcH> arrayListAEQbTJ = ((C46707tcJ) next2).AEQbTJ();
                if (!(arrayListAEQbTJ instanceof java.util.Collection) || !arrayListAEQbTJ.isEmpty()) {
                    java.util.Iterator<T> it3 = arrayListAEQbTJ.iterator();
                    while (it3.hasNext()) {
                        if (Intrinsics.EZpvd((java.lang.Object) ((C46705tcH) it3.next()).values(), (java.lang.Object) unifiedPriceRemind.getInstrumentId())) {
                            break loop4;
                        }
                    }
                }
            }
            C46707tcJ c46707tcJ3 = (C46707tcJ) next2;
            if (c46707tcJ3 != null) {
                c46707tcJ3.EZpvd(true);
            }
            if (c46707tcJ3 != null) {
                java.util.ArrayList arrayList3 = new java.util.ArrayList((java.util.Collection) objectRef.element);
                arrayList3.remove(c46707tcJ3);
                arrayList3.add(0, c46707tcJ3);
                t2 = arrayList3;
            } else {
                t2 = (java.util.List) objectRef.element;
            }
            objectRef.element = t2;
        }
        TokenInfoForAlert tokenInfoForAlert = abstractActivityC46767tdQ.zLjUOn;
        if (tokenInfoForAlert != null) {
            java.util.Iterator it4 = ((java.lang.Iterable) objectRef.element).iterator();
            loop6: while (true) {
                if (!it4.hasNext()) {
                    next = null;
                    break;
                }
                next = it4.next();
                java.util.ArrayList<C46705tcH> arrayListAEQbTJ2 = ((C46707tcJ) next).AEQbTJ();
                if (!(arrayListAEQbTJ2 instanceof java.util.Collection) || !arrayListAEQbTJ2.isEmpty()) {
                    for (C46705tcH c46705tcH : arrayListAEQbTJ2) {
                        if (Intrinsics.EZpvd((java.lang.Object) c46705tcH.AEQbTJ(), (java.lang.Object) tokenInfoForAlert.OLrzqt()) && Intrinsics.EZpvd((java.lang.Object) c46705tcH.fIwbmz(), (java.lang.Object) tokenInfoForAlert.copydefault())) {
                            break loop6;
                        }
                    }
                }
            }
            C46707tcJ c46707tcJ4 = (C46707tcJ) next;
            if (c46707tcJ4 != null) {
                c46707tcJ4.EZpvd(true);
            }
            if (c46707tcJ4 != null) {
                java.util.ArrayList arrayList4 = new java.util.ArrayList((java.util.Collection) objectRef.element);
                arrayList4.remove(c46707tcJ4);
                arrayList4.add(0, c46707tcJ4);
                t = arrayList4;
            } else {
                t = (java.util.List) objectRef.element;
            }
            objectRef.element = t;
        }
        abstractActivityC46767tdQ.isConnected().clear();
        abstractActivityC46767tdQ.isConnected().addAll((java.util.Collection) objectRef.element);
        abstractActivityC46767tdQ.AhwBna();
        abstractActivityC46767tdQ.AuCTel();
        abstractActivityC46767tdQ.ejfBZ();
        abstractActivityC46767tdQ.values().notifyDataSetChanged();
        rVN.reportFullyDrawn$default((android.app.Activity) abstractActivityC46767tdQ, true, (java.lang.String) null, 2, (java.lang.Object) null);
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(AbstractActivityC46767tdQ abstractActivityC46767tdQ, java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        C43296rmc.copydefault("lanwq", "getall reminders", th);
        abstractActivityC46767tdQ.dismissLoading();
        abstractActivityC46767tdQ.fIwbmz();
        rVN.reportFullyDrawn$default((android.app.Activity) abstractActivityC46767tdQ, false, (java.lang.String) null, 2, (java.lang.Object) null);
        return Unit.INSTANCE;
    }

    public final void OLrzqt(final C46705tcH c46705tcH, final int i) {
        java.lang.Object objM7377constructorimpl;
        C32866mlf.onEvent$default("price_alert_delete", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
        C33024moe.subscribeOnIO$default(C58156yvv.EZpvd(((BizMarketService) C43417ror.OLrzqt(C56524yIo.AEQbTJ(BizMarketService.class))).deletePriceRemind(new DeleteRuleRep(c46705tcH.AuCTel(), c46705tcH.fARcdN(), c46705tcH.KWHzl())), this), new Function1() { // from class: o.ted
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractActivityC46767tdQ.KWHzl((java.lang.Throwable) obj);
            }
        }, (Function0) null, new Function1() { // from class: o.tdZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractActivityC46767tdQ.copydefault(this.KWHzl, i, c46705tcH, (ResponseData) obj);
            }
        }, 2, (java.lang.Object) null);
        try {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new IAllPriceRemindActivity$deleteItem$3$1(this, c46705tcH, null), 3, null));
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
    }

    public static final Unit KWHzl(java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        return Unit.INSTANCE;
    }

    public final void copydefault(java.util.List<C46705tcH> list) {
        java.lang.Object objM7377constructorimpl;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (java.lang.Object obj : list) {
            java.lang.Integer numValueOf = java.lang.Integer.valueOf(((C46705tcH) obj).AuCTel());
            java.lang.Object arrayList4 = linkedHashMap.get(numValueOf);
            if (arrayList4 == null) {
                arrayList4 = new java.util.ArrayList();
                linkedHashMap.put(numValueOf, arrayList4);
            }
            ((java.util.List) arrayList4).add(obj);
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            int iIntValue = ((java.lang.Number) entry.getKey()).intValue();
            if (iIntValue == 1) {
                java.lang.Iterable iterable = (java.lang.Iterable) entry.getValue();
                java.util.ArrayList arrayList5 = new java.util.ArrayList(C56403yEb.AYXKKw(iterable, 10));
                java.util.Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList5.add(java.lang.Long.valueOf(C33129mqd.valueOf(((C46705tcH) it.next()).fARcdN())));
                }
                arrayList.addAll(arrayList5);
            } else if (iIntValue == 2) {
                java.lang.Iterable iterable2 = (java.lang.Iterable) entry.getValue();
                java.util.ArrayList arrayList6 = new java.util.ArrayList(C56403yEb.AYXKKw(iterable2, 10));
                java.util.Iterator it2 = iterable2.iterator();
                while (it2.hasNext()) {
                    arrayList6.add(java.lang.Long.valueOf(C33129mqd.valueOf(((C46705tcH) it2.next()).fARcdN())));
                }
                arrayList2.addAll(arrayList6);
            } else {
                java.lang.Iterable iterable3 = (java.lang.Iterable) entry.getValue();
                java.util.ArrayList arrayList7 = new java.util.ArrayList(C56403yEb.AYXKKw(iterable3, 10));
                java.util.Iterator it3 = iterable3.iterator();
                while (it3.hasNext()) {
                    arrayList7.add(java.lang.Long.valueOf(C33129mqd.valueOf(((C46705tcH) it3.next()).fARcdN())));
                }
                arrayList3.addAll(arrayList7);
            }
        }
        C32866mlf.onEvent$default("price_alert_delete", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
        C33024moe.subscribeOnIO$default(C58156yvv.EZpvd(((BizMarketService) C43417ror.OLrzqt(C56524yIo.AEQbTJ(BizMarketService.class))).deletePriceReminds(new Rules(arrayList, arrayList2, arrayList3)), this), new Function1() { // from class: o.tdT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return AbstractActivityC46767tdQ.AYXKKw((java.lang.Throwable) obj2);
            }
        }, (Function0) null, new Function1() { // from class: o.tee
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return AbstractActivityC46767tdQ.AEQbTJ(this.KWHzl, (ResponseData) obj2);
            }
        }, 2, (java.lang.Object) null);
        java.util.ArrayList arrayList8 = new java.util.ArrayList();
        for (C46705tcH c46705tcH : list) {
            java.lang.String strValues = c46705tcH.values();
            java.lang.String strKWHzl = C55686xod.KWHzl();
            int iKWHzl = c46705tcH.KWHzl();
            java.lang.String strFARcdN = c46705tcH.fARcdN();
            arrayList8.add(new MarketUserAlert(0L, strValues, strKWHzl, java.lang.String.valueOf(iKWHzl), c46705tcH.djBIcL(), strFARcdN, c46705tcH.AEQbTJ(), c46705tcH.fIwbmz(), 1, null));
        }
        try {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new IAllPriceRemindActivity$deleteItem$10$1(this, arrayList8, null), 3, null));
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
    }

    public static final Unit AYXKKw(java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        C43296rmc.copydefault("lanwq", "delete items", th);
        return Unit.INSTANCE;
    }

    public final void AEQbTJ(boolean z) {
        android.widget.ImageView backImage;
        if (z != this.fetchVPNInfo) {
            this.fetchVPNInfo = z;
            values().EZpvd(this.fetchVPNInfo);
            android.view.View view = this.AuCTel;
            if (view != null) {
                view.setVisibility(this.fetchVPNInfo ? 0 : 4);
            }
            android.view.View view2 = this.djBIcL;
            if (view2 != null) {
                view2.setVisibility(this.fetchVPNInfo ? 4 : 0);
            }
            android.widget.TextView textView = this.iwGUEr;
            if (textView != null) {
                textView.setText(C33070mpX.AYXKKw(z ? qZH.PendingIntent.QiTXOm : qZH.PendingIntent.QnnRaN));
            }
            if (this.fetchVPNInfo) {
                OKReminder oKReminder = this.hDKMBd;
                if (oKReminder != null) {
                    oKReminder.setVisibility(8);
                }
                RecyclerView recyclerView = this.uzCIH;
                if (recyclerView != null) {
                    recyclerView.setPadding(0, 0, 0, C55298xhM.copydefault(90.0f, (android.content.Context) this));
                }
            } else {
                fJNWhG();
            }
            C33537myN c33537myN = this.DbNXlk;
            if (c33537myN == null || (backImage = c33537myN.getBackImage()) == null) {
                return;
            }
            backImage.setVisibility(this.fetchVPNInfo ? 4 : 0);
        }
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        fJNWhG();
    }

    public final void fJNWhG() {
        C33625mzw.OLrzqt().AEQbTJ(this, new C33625mzw.StateListAnimator() { // from class: o.tea
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.C33625mzw.StateListAnimator
            public final void KWHzl(boolean z) {
                AbstractActivityC46767tdQ.OLrzqt(this.OLrzqt, z);
            }
        });
    }

    public static final void OLrzqt(AbstractActivityC46767tdQ abstractActivityC46767tdQ, boolean z) {
        if (z) {
            abstractActivityC46767tdQ.fJNWhG = 1;
            abstractActivityC46767tdQ.fARcdN();
        } else {
            abstractActivityC46767tdQ.fJNWhG = 0;
            abstractActivityC46767tdQ.OLrzqt(true);
        }
    }

    public static final Unit AhwBna(AbstractActivityC46767tdQ abstractActivityC46767tdQ) {
        if (abstractActivityC46767tdQ.fJNWhG == 0) {
            C33625mzw.OLrzqt().EZpvd(abstractActivityC46767tdQ);
        } else {
            ((rXQ) C43251rlk.copydefault(rXQ.class)).copydefault(abstractActivityC46767tdQ, 19, AppNotificationBizType.CEFI, 100, new Function1() { // from class: o.tdP
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return AbstractActivityC46767tdQ.OLrzqt((java.lang.Throwable) obj);
                }
            });
        }
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        return Unit.INSTANCE;
    }

    public final void fARcdN() {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new IAllPriceRemindActivity$isMessageSettingsAlertOpen$1(this, null), 3, null);
    }

    public static final void AYXKKw(AbstractActivityC46767tdQ abstractActivityC46767tdQ, android.view.View view) {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(abstractActivityC46767tdQ), null, null, new IAllPriceRemindActivity$showErrorView$1$1(abstractActivityC46767tdQ, null), 3, null);
    }

    public final void OLrzqt(boolean z) {
        if (!z) {
            OKReminder oKReminder = this.hDKMBd;
            if (oKReminder != null) {
                oKReminder.setVisibility(8);
            }
            RecyclerView recyclerView = this.uzCIH;
            if (recyclerView != null) {
                recyclerView.setPadding(0, 0, 0, C55298xhM.copydefault(90.0f, (android.content.Context) this));
                return;
            }
            return;
        }
        OKReminder oKReminder2 = this.hDKMBd;
        if (oKReminder2 != null) {
            oKReminder2.setVisibility(0);
        }
        RecyclerView recyclerView2 = this.uzCIH;
        if (recyclerView2 != null) {
            recyclerView2.setPadding(0, C55298xhM.copydefault(72.0f, (android.content.Context) this), 0, C55298xhM.copydefault(90.0f, (android.content.Context) this));
        }
        OKReminder oKReminder3 = this.hDKMBd;
        if (oKReminder3 != null) {
            oKReminder3.setStyle(4);
            oKReminder3.setCloseIconVisibility(false);
            oKReminder3.setPrimaryAction(getString(qZH.PendingIntent.DsrFlB), new Function0() { // from class: o.tef
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return AbstractActivityC46767tdQ.AhwBna(this.KWHzl);
                }
            });
            oKReminder3.setMessage(C33070mpX.AYXKKw(this.fJNWhG == 0 ? qZH.PendingIntent.DNMMPQ : qZH.PendingIntent.OTwTPd));
        }
    }

    public final void fIwbmz() {
        C55173xeu c55173xeu = this.zsXlph;
        if (c55173xeu != null) {
            c55173xeu.setVisibility(0);
        }
        C55173xeu c55173xeu2 = this.zsXlph;
        if (c55173xeu2 != null) {
            c55173xeu2.setRetryClickListener(new View.OnClickListener() { // from class: o.teb
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    AbstractActivityC46767tdQ.AYXKKw(this.copydefault, view);
                }
            });
        }
        C55173xeu c55173xeu3 = this.zsXlph;
        if (c55173xeu3 != null) {
            c55173xeu3.setEmptyTypeImage(2);
        }
        C55173xeu c55173xeu4 = this.zsXlph;
        if (c55173xeu4 != null) {
            c55173xeu4.setTitle(C33070mpX.AYXKKw(qZH.PendingIntent.sZqaRl));
        }
        C55173xeu c55173xeu5 = this.zsXlph;
        if (c55173xeu5 != null) {
            c55173xeu5.setSubTitle((java.lang.CharSequence) C33070mpX.AYXKKw(qZH.PendingIntent.putInt));
        }
        C55173xeu c55173xeu6 = this.zsXlph;
        if (c55173xeu6 != null) {
            c55173xeu6.setRetry(C33070mpX.AYXKKw(qZH.PendingIntent.HJWChP));
        }
    }

    public static final Unit copydefault(AbstractActivityC46767tdQ abstractActivityC46767tdQ, int i, C46705tcH c46705tcH, ResponseData responseData) {
        android.view.View view;
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 0) {
            abstractActivityC46767tdQ.isConnected().get(i).AEQbTJ().remove(c46705tcH);
            if (abstractActivityC46767tdQ.isConnected().get(i).AEQbTJ().size() == 0) {
                abstractActivityC46767tdQ.isConnected().remove(i);
            }
            java.util.ArrayList<C46707tcJ> arrayListIsConnected = abstractActivityC46767tdQ.isConnected();
            if ((arrayListIsConnected instanceof java.util.Collection) && arrayListIsConnected.isEmpty()) {
                abstractActivityC46767tdQ.AuCTel();
                if (abstractActivityC46767tdQ.isConnected().size() == 0) {
                    view.setVisibility(4);
                }
                abstractActivityC46767tdQ.values().notifyDataSetChanged();
                RxBus.AEQbTJ(new C49421uoI(true));
                C55326xho.toastWithSuccessfulIcon$default(C33070mpX.AYXKKw(qZH.PendingIntent.QfZsXX), 0, 1, (java.lang.Object) null);
            } else {
                java.util.Iterator<T> it = arrayListIsConnected.iterator();
                while (it.hasNext()) {
                    if (((C46707tcJ) it.next()).gEmmrt()) {
                        break;
                    }
                }
                abstractActivityC46767tdQ.AuCTel();
                if (abstractActivityC46767tdQ.isConnected().size() == 0 && (view = abstractActivityC46767tdQ.getFieldNames) != null) {
                    view.setVisibility(4);
                }
                abstractActivityC46767tdQ.values().notifyDataSetChanged();
                RxBus.AEQbTJ(new C49421uoI(true));
                C55326xho.toastWithSuccessfulIcon$default(C33070mpX.AYXKKw(qZH.PendingIntent.QfZsXX), 0, 1, (java.lang.Object) null);
            }
        } else {
            C55326xho.toast$default(responseData.getMsg(), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
        }
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(AbstractActivityC46767tdQ abstractActivityC46767tdQ, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 0) {
            abstractActivityC46767tdQ.AEQbTJ();
            C55326xho.toastWithSuccessfulIcon$default(C33070mpX.AYXKKw(qZH.PendingIntent.QfZsXX), 0, 1, (java.lang.Object) null);
            RxBus.AEQbTJ(new C49421uoI(true));
            abstractActivityC46767tdQ.AEQbTJ(false);
        } else {
            C55326xho.toast$default(responseData.getMsg(), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
        }
        return Unit.INSTANCE;
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
