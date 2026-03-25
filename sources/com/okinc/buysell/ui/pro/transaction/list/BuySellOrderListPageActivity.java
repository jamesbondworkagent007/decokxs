package com.okinc.buysell.ui.pro.transaction.list;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.buysell.ui.pro.transaction.list.BuySellOrderListPageActivity;
import com.okinc.buysell.ui.pro.transaction.list.viewmodel.BuySellOrderListPageActivityViewModel;
import com.okinc.crcore.shared.net.responsebean.bsc.UserInfoBean;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractActivityC30194lPi;
import o.AbstractC32996moC;
import o.C30186lPa;
import o.C31351lsQ;
import o.C31413ltZ;
import o.C32991mny;
import o.C43251rlk;
import o.C56392yDr;
import o.C56524yIo;
import o.InterfaceC47278tmy;
import o.InterfaceC56387yDm;
import o.InterfaceC8104awT;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class BuySellOrderListPageActivity extends AbstractActivityC30194lPi {
    public static final Activity Companion = new Activity(null);
    public static final int KWHzl = 8;
    public int AYXKKw;
    public C31413ltZ EZpvd;
    public final InterfaceC56387yDm copydefault;

    @yCM
    public InterfaceC47278tmy userManager;
    public final InterfaceC56387yDm OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.lOM
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return BuySellOrderListPageActivity.KWHzl(this.AEQbTJ);
        }
    });
    public final int AEQbTJ = C31351lsQ.Application.awiJhF;
    public String djBIcL = "";
    public String gEmmrt = "";
    public String AhwBna = "";

    public BuySellOrderListPageActivity() {
        final Function0 function0 = null;
        this.copydefault = new ViewModelLazy(C56524yIo.AEQbTJ(BuySellOrderListPageActivityViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.buysell.ui.pro.transaction.list.BuySellOrderListPageActivity$special$$inlined$viewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.buysell.ui.pro.transaction.list.BuySellOrderListPageActivity$special$$inlined$viewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.buysell.ui.pro.transaction.list.BuySellOrderListPageActivity$special$$inlined$viewModels$default$3
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

    public final BuySellOrderListPageActivityViewModel AEQbTJ() {
        return (BuySellOrderListPageActivityViewModel) this.copydefault.getValue();
    }

    /* JADX DEBUG: Possible override for method o.lPi.EZpvd()V */
    public final InterfaceC47278tmy EZpvd() {
        InterfaceC47278tmy interfaceC47278tmy = this.userManager;
        if (interfaceC47278tmy != null) {
            return interfaceC47278tmy;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    /* JADX DEBUG: Possible override for method o.lPi.KWHzl()V */
    public final AbstractC32996moC KWHzl() {
        return (AbstractC32996moC) this.OLrzqt.getValue();
    }

    public static final C30186lPa KWHzl(BuySellOrderListPageActivity buySellOrderListPageActivity) {
        return C30186lPa.Companion.copydefault(0, buySellOrderListPageActivity.AYXKKw, buySellOrderListPageActivity.djBIcL, buySellOrderListPageActivity.gEmmrt, false, buySellOrderListPageActivity.AhwBna);
    }

    @Override // o.AbstractActivityC30194lPi, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C31413ltZ c31413ltZCopydefault = C31413ltZ.copydefault(getLayoutInflater());
        this.EZpvd = c31413ltZCopydefault;
        if (c31413ltZCopydefault == null) {
            Intrinsics.gEmmrt("");
            c31413ltZCopydefault = null;
        }
        setContentView(c31413ltZCopydefault.getRoot());
        if (!EZpvd().values()) {
            InterfaceC8104awT.StateListAnimator.routeLogin$default((InterfaceC8104awT) C43251rlk.copydefault(InterfaceC8104awT.class), this, null, 2, null);
            finish();
            return;
        }
        if (getIntent().hasExtra("tab_index")) {
            this.AYXKKw = getIntent().getIntExtra("tab_index", 0);
        }
        EZpvd(true);
        AEQbTJ().EZpvd();
        AEQbTJ().copydefault().observe(this, new C32991mny(new Function1() { // from class: o.lOK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return BuySellOrderListPageActivity.copydefault(this.OLrzqt, (BuySellOrderListPageActivityViewModel.Application) obj);
            }
        }));
    }

    public static final Unit copydefault(BuySellOrderListPageActivity buySellOrderListPageActivity, BuySellOrderListPageActivityViewModel.Application application) {
        Intrinsics.checkNotNullParameter(application, "");
        buySellOrderListPageActivity.EZpvd(false);
        if (application instanceof BuySellOrderListPageActivityViewModel.Application.Activity) {
            buySellOrderListPageActivity.KWHzl((UserInfoBean) null);
        } else {
            if (!(application instanceof BuySellOrderListPageActivityViewModel.Application.C0386Application)) {
                throw new NoWhenBranchMatchedException();
            }
            buySellOrderListPageActivity.KWHzl(((BuySellOrderListPageActivityViewModel.Application.C0386Application) application).copydefault());
        }
        return Unit.INSTANCE;
    }

    public final void EZpvd(boolean z) {
        C31413ltZ c31413ltZ = null;
        if (z) {
            C31413ltZ c31413ltZ2 = this.EZpvd;
            if (c31413ltZ2 == null) {
                Intrinsics.gEmmrt("");
                c31413ltZ2 = null;
            }
            c31413ltZ2.OLrzqt.getRoot().setVisibility(0);
            C31413ltZ c31413ltZ3 = this.EZpvd;
            if (c31413ltZ3 == null) {
                Intrinsics.gEmmrt("");
            } else {
                c31413ltZ = c31413ltZ3;
            }
            c31413ltZ.copydefault.setVisibility(8);
            return;
        }
        C31413ltZ c31413ltZ4 = this.EZpvd;
        if (c31413ltZ4 == null) {
            Intrinsics.gEmmrt("");
            c31413ltZ4 = null;
        }
        c31413ltZ4.OLrzqt.getRoot().setVisibility(8);
        C31413ltZ c31413ltZ5 = this.EZpvd;
        if (c31413ltZ5 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c31413ltZ = c31413ltZ5;
        }
        c31413ltZ.copydefault.setVisibility(0);
    }

    public final void KWHzl(UserInfoBean userInfoBean) {
        AbstractC32996moC abstractC32996moCKWHzl = KWHzl();
        if (abstractC32996moCKWHzl == null || getSupportFragmentManager().isDestroyed()) {
            return;
        }
        getSupportFragmentManager().beginTransaction().replace(this.AEQbTJ, abstractC32996moCKWHzl).commitAllowingStateLoss();
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.buysell.ui.pro.transaction.list.BuySellOrderListPageActivity.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final void copydefault(@NotNull Context context, int i) {
            Intrinsics.checkNotNullParameter(context, "");
            Intent intent = new Intent(context, (Class<?>) BuySellOrderListPageActivity.class);
            intent.putExtra("tab_index", i);
            context.startActivity(intent);
        }
    }

    @Override // o.AbstractActivityC30194lPi, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC30194lPi, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC30194lPi, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.AbstractActivityC30194lPi, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
