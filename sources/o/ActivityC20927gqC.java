package o;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.business.defi.api.model.tx.signdata.MultiTransferSignData;
import com.okinc.business.defi.biz.constant.MultiTransferMode;
import com.okinc.business.defi.wallet.transfer.batch.multiTransferBean.ReceiveAddressSavedInstanceData;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.ActivityC20923gpz;
import o.C13754dXa;
import o.C21004gra;
import o.C52761wXj;
import o.C9694baS;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gqC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class ActivityC20927gqC extends AbstractActivityC33013moT implements InterfaceC20523giW {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int EZpvd = 8;
    public final InterfaceC56387yDm AEQbTJ;
    public AbstractC16942etT KWHzl;

    public ActivityC20927gqC() {
        final Function0 function0 = null;
        this.AEQbTJ = new ViewModelLazy(C56524yIo.AEQbTJ(C21004gra.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.defi.wallet.transfer.batch.multiSendAddress.DefiWalletMultiSelectSendAddressActivity$special$$inlined$viewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.defi.wallet.transfer.batch.multiSendAddress.DefiWalletMultiSelectSendAddressActivity$special$$inlined$viewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.defi.wallet.transfer.batch.multiSendAddress.DefiWalletMultiSelectSendAddressActivity$special$$inlined$viewModels$default$3
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

    private final C21004gra AEQbTJ() {
        return (C21004gra) this.AEQbTJ.getValue();
    }

    /* JADX INFO: renamed from: o.gqC$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.gqC.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final android.content.Intent AEQbTJ(@NotNull android.content.Context context, int i, @NotNull java.lang.String str, long j) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(str, "");
            android.content.Intent intent = new android.content.Intent();
            intent.setClass(context, ActivityC20927gqC.class);
            intent.putExtras(C20931gqG.Companion.KWHzl(i, str, java.lang.String.valueOf(j)));
            return intent;
        }
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.KWHzl = (AbstractC16942etT) DataBindingUtil.setContentView(this, C13754dXa.TaskDescription.HJWChPURsaBn);
        KWHzl();
        C20931gqG c20931gqG = new C20931gqG();
        c20931gqG.setArguments(getIntent().getExtras());
        getSupportFragmentManager().beginTransaction().replace(C13754dXa.ActionBar.putInt, c20931gqG).commitAllowingStateLoss();
        getWindow().getDecorView().post(new java.lang.Runnable() { // from class: o.gqB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                ActivityC20927gqC.EZpvd(this.copydefault);
            }
        });
    }

    public static final void EZpvd(ActivityC20927gqC activityC20927gqC) {
        rVN.reportFullyDrawn$default((android.app.Activity) activityC20927gqC, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    private final void KWHzl() {
        AbstractC16942etT abstractC16942etT = this.KWHzl;
        AbstractC16942etT abstractC16942etT2 = null;
        if (abstractC16942etT == null) {
            Intrinsics.gEmmrt("");
            abstractC16942etT = null;
        }
        abstractC16942etT.AEQbTJ.setExpandedTitleColor(0);
        AbstractC16942etT abstractC16942etT3 = this.KWHzl;
        if (abstractC16942etT3 == null) {
            Intrinsics.gEmmrt("");
            abstractC16942etT3 = null;
        }
        abstractC16942etT3.AkhnZx.setNavigationOnClickListener(new View.OnClickListener() { // from class: o.gqz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                ActivityC20927gqC.EZpvd(this.KWHzl, view);
            }
        });
        AbstractC16942etT abstractC16942etT4 = this.KWHzl;
        if (abstractC16942etT4 == null) {
            Intrinsics.gEmmrt("");
            abstractC16942etT4 = null;
        }
        abstractC16942etT4.djBIcL.setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.registerForActivityResultlambda1));
        AbstractC16942etT abstractC16942etT5 = this.KWHzl;
        if (abstractC16942etT5 == null) {
            Intrinsics.gEmmrt("");
            abstractC16942etT5 = null;
        }
        abstractC16942etT5.AkhnZx.setTitle(C33070mpX.AYXKKw(C13754dXa.FragmentManager.registerForActivityResultlambda1));
        AbstractC16942etT abstractC16942etT6 = this.KWHzl;
        if (abstractC16942etT6 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC16942etT2 = abstractC16942etT6;
        }
        AppCompatImageView appCompatImageView = abstractC16942etT2.gEmmrt;
        Intrinsics.copydefault(appCompatImageView);
        appCompatImageView.setVisibility(0);
        appCompatImageView.setImageDrawable(C33070mpX.KWHzl(C52761wXj.TaskDescription.GGlJim));
        appCompatImageView.setOnClickListener(new View.OnClickListener() { // from class: o.gqA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                ActivityC20927gqC.gEmmrt(this.EZpvd, view);
            }
        });
    }

    public static final void EZpvd(ActivityC20927gqC activityC20927gqC, android.view.View view) {
        activityC20927gqC.finish();
    }

    public static final void gEmmrt(ActivityC20927gqC activityC20927gqC, android.view.View view) {
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(activityC20927gqC);
        viewOnClickListenerC54939xaY.EZpvd(C33070mpX.AYXKKw(C13754dXa.FragmentManager.ReportDrawnAfter));
        viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) C33070mpX.AYXKKw(C13754dXa.FragmentManager.DarRvM), new View.OnClickListener() { // from class: o.gqF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                ActivityC20927gqC.AEQbTJ(viewOnClickListenerC54939xaY, view2);
            }
        });
        viewOnClickListenerC54939xaY.setCanceledOnTouchOutside(false);
        viewOnClickListenerC54939xaY.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AEQbTJ(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }

    public final void EZpvd(@NotNull final Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        AbstractC16942etT abstractC16942etT = this.KWHzl;
        AbstractC16942etT abstractC16942etT2 = null;
        if (abstractC16942etT == null) {
            Intrinsics.gEmmrt("");
            abstractC16942etT = null;
        }
        abstractC16942etT.isConnected.setOnClickListener(new View.OnClickListener() { // from class: o.gqE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                ActivityC20927gqC.AEQbTJ(this.OLrzqt, view);
            }
        });
        AbstractC16942etT abstractC16942etT3 = this.KWHzl;
        if (abstractC16942etT3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC16942etT2 = abstractC16942etT3;
        }
        abstractC16942etT2.AhwBna.setOnClickListener(new View.OnClickListener() { // from class: o.gqH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                ActivityC20927gqC.OLrzqt(function0, view);
            }
        });
    }

    public static final void AEQbTJ(final ActivityC20927gqC activityC20927gqC, android.view.View view) {
        java.lang.String string;
        java.lang.String string2;
        java.util.ArrayList<C21004gra.Application> arrayListCopydefault = activityC20927gqC.AEQbTJ().copydefault();
        java.lang.Long lGEmmrt = activityC20927gqC.AEQbTJ().gEmmrt();
        long jLongValue = lGEmmrt != null ? lGEmmrt.longValue() : -1L;
        java.lang.Integer numFetchVPNInfo = activityC20927gqC.AEQbTJ().fetchVPNInfo();
        int iIntValue = numFetchVPNInfo != null ? numFetchVPNInfo.intValue() : MultiTransferMode.MODE_NONE.getValue();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(arrayListCopydefault, 10));
        java.util.Iterator<T> it = arrayListCopydefault.iterator();
        while (it.hasNext()) {
            arrayList2.add(((C21004gra.Application) it.next()).OLrzqt().DbNXlk());
        }
        arrayList.addAll(arrayList2);
        Unit unit = Unit.INSTANCE;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.util.ArrayList arrayList4 = new java.util.ArrayList(C56403yEb.AYXKKw(arrayListCopydefault, 10));
        java.util.Iterator<T> it2 = arrayListCopydefault.iterator();
        while (it2.hasNext()) {
            InterfaceC9738bbJ interfaceC9738bbJOLrzqt = ((C21004gra.Application) it2.next()).OLrzqt();
            java.lang.Long lOLrzqt = activityC20927gqC.AEQbTJ().OLrzqt();
            arrayList4.add(interfaceC9738bbJOLrzqt.EZpvd(lOLrzqt != null ? lOLrzqt.longValue() : -1L));
        }
        arrayList3.addAll(arrayList4);
        Unit unit2 = Unit.INSTANCE;
        MultiTransferSignData multiTransferSignData = new MultiTransferSignData(jLongValue, iIntValue, arrayList, arrayList3, new java.util.ArrayList());
        C9694baS.Application application = C9694baS.Companion;
        ActivityC20923gpz.Activity activity = ActivityC20923gpz.Companion;
        android.os.Bundle extras = activityC20927gqC.getIntent().getExtras();
        if (extras == null || (string = extras.getString("wallet_id")) == null) {
            string = "";
        }
        java.lang.String str = string;
        java.lang.Long lOLrzqt2 = activityC20927gqC.AEQbTJ().OLrzqt();
        if (lOLrzqt2 == null || (string2 = lOLrzqt2.toString()) == null) {
            string2 = MultiTransferSignData.DEFAULT_INTERVAL;
        }
        application.EZpvd(activityC20927gqC, activity.copydefault(activityC20927gqC, str, string2, multiTransferSignData, activityC20927gqC.AEQbTJ().DbNXlk()), new Function2() { // from class: o.gqD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return ActivityC20927gqC.copydefault(this.OLrzqt, ((java.lang.Integer) obj).intValue(), (android.content.Intent) obj2);
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit copydefault(ActivityC20927gqC activityC20927gqC, int i, android.content.Intent intent) {
        android.os.Bundle extras;
        MultiTransferSignData multiTransferSignData;
        android.os.Bundle extras2;
        android.os.Bundle extras3;
        android.os.Bundle extras4;
        if (i == 0) {
            ReceiveAddressSavedInstanceData receiveAddressSavedInstanceData = null;
            if (Build.VERSION.SDK_INT >= 33) {
                multiTransferSignData = (intent == null || (extras4 = intent.getExtras()) == null) ? null : (MultiTransferSignData) extras4.getParcelable("data", MultiTransferSignData.class);
                if (multiTransferSignData != null) {
                    return Unit.INSTANCE;
                }
                java.util.ArrayList<java.lang.String> arrayList = new java.util.ArrayList<>();
                for (C21004gra.Application application : activityC20927gqC.AEQbTJ().copydefault()) {
                    java.util.ArrayList<java.lang.String> walletId = multiTransferSignData.getWalletId();
                    if (walletId != null && !walletId.contains(application.OLrzqt().DbNXlk())) {
                        arrayList.add(application.OLrzqt().DbNXlk());
                    }
                }
                activityC20927gqC.AEQbTJ().AEQbTJ(arrayList);
                if (Build.VERSION.SDK_INT >= 33) {
                    if (intent != null && (extras3 = intent.getExtras()) != null) {
                        receiveAddressSavedInstanceData = (ReceiveAddressSavedInstanceData) extras3.getParcelable("saved_instance_data", ReceiveAddressSavedInstanceData.class);
                    }
                } else if (intent != null && (extras2 = intent.getExtras()) != null) {
                    receiveAddressSavedInstanceData = (ReceiveAddressSavedInstanceData) extras2.getParcelable("saved_instance_data");
                }
                activityC20927gqC.AEQbTJ().EZpvd(receiveAddressSavedInstanceData);
            } else {
                if (intent != null && (extras = intent.getExtras()) != null) {
                    multiTransferSignData = (MultiTransferSignData) extras.getParcelable("data");
                }
                if (multiTransferSignData != null) {
                }
            }
        }
        if (i == -1) {
            activityC20927gqC.setResult(i, intent);
            activityC20927gqC.finish();
        }
        return Unit.INSTANCE;
    }

    public static final void OLrzqt(Function0 function0, android.view.View view) {
        function0.invoke();
    }

    public final void copydefault() {
        AbstractC16942etT abstractC16942etT = null;
        if (AEQbTJ().AkhnZx()) {
            AbstractC16942etT abstractC16942etT2 = this.KWHzl;
            if (abstractC16942etT2 == null) {
                Intrinsics.gEmmrt("");
                abstractC16942etT2 = null;
            }
            abstractC16942etT2.AhwBna.setVisibility(8);
            AbstractC16942etT abstractC16942etT3 = this.KWHzl;
            if (abstractC16942etT3 == null) {
                Intrinsics.gEmmrt("");
                abstractC16942etT3 = null;
            }
            abstractC16942etT3.isConnected.setVisibility(0);
            AbstractC16942etT abstractC16942etT4 = this.KWHzl;
            if (abstractC16942etT4 == null) {
                Intrinsics.gEmmrt("");
                abstractC16942etT4 = null;
            }
            ViewGroup.LayoutParams layoutParams = abstractC16942etT4.AhwBna.getLayoutParams();
            Intrinsics.copydefault(layoutParams, "");
            ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
            layoutParams2.setMarginEnd(C55298xhM.dp2px$default(0.0f, null, 1, null));
            AbstractC16942etT abstractC16942etT5 = this.KWHzl;
            if (abstractC16942etT5 == null) {
                Intrinsics.gEmmrt("");
            } else {
                abstractC16942etT = abstractC16942etT5;
            }
            abstractC16942etT.AhwBna.setLayoutParams(layoutParams2);
            return;
        }
        AbstractC16942etT abstractC16942etT6 = this.KWHzl;
        if (abstractC16942etT6 == null) {
            Intrinsics.gEmmrt("");
            abstractC16942etT6 = null;
        }
        abstractC16942etT6.AhwBna.setVisibility(0);
        AbstractC16942etT abstractC16942etT7 = this.KWHzl;
        if (abstractC16942etT7 == null) {
            Intrinsics.gEmmrt("");
            abstractC16942etT7 = null;
        }
        abstractC16942etT7.isConnected.setVisibility(0);
        AbstractC16942etT abstractC16942etT8 = this.KWHzl;
        if (abstractC16942etT8 == null) {
            Intrinsics.gEmmrt("");
            abstractC16942etT8 = null;
        }
        ViewGroup.LayoutParams layoutParams3 = abstractC16942etT8.AhwBna.getLayoutParams();
        Intrinsics.copydefault(layoutParams3, "");
        ConstraintLayout.LayoutParams layoutParams4 = (ConstraintLayout.LayoutParams) layoutParams3;
        layoutParams4.setMarginEnd(C55298xhM.dp2px$default(64.0f, null, 1, null));
        AbstractC16942etT abstractC16942etT9 = this.KWHzl;
        if (abstractC16942etT9 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC16942etT = abstractC16942etT9;
        }
        abstractC16942etT.AhwBna.setLayoutParams(layoutParams4);
    }

    public final C52794wYp EZpvd() {
        AbstractC16942etT abstractC16942etT = this.KWHzl;
        if (abstractC16942etT == null) {
            Intrinsics.gEmmrt("");
            abstractC16942etT = null;
        }
        C52794wYp c52794wYp = abstractC16942etT.isConnected;
        Intrinsics.checkNotNullExpressionValue(c52794wYp, "");
        return c52794wYp;
    }

    public final android.widget.LinearLayout OLrzqt() {
        AbstractC16942etT abstractC16942etT = this.KWHzl;
        if (abstractC16942etT == null) {
            Intrinsics.gEmmrt("");
            abstractC16942etT = null;
        }
        android.widget.LinearLayout linearLayout = abstractC16942etT.AhwBna;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "");
        return linearLayout;
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
