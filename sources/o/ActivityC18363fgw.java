package o;

import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.okinc.business.defi.biz.drivers.bean.ICloudNetworkListBean;
import com.okinc.business.defi.biz.drivers.bean.ICloudRestoreBean;
import com.okinc.business.defi.wallet.icloud.ICloudListActivity$onCreate$4;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.ActivityC18320fgF;
import o.C13754dXa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fgw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class ActivityC18363fgw extends AbstractActivityC33013moT {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int EZpvd = 8;
    public final ActivityResultLauncher<ICloudNetworkListBean> OLrzqt;
    public final InterfaceC56387yDm copydefault;
    public AbstractC16388eiw valueOf;
    public final InterfaceC56387yDm AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.fgA
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return ActivityC18363fgw.AhwBna(this.copydefault);
        }
    });
    public boolean KWHzl = true;
    public final InterfaceC56387yDm AhwBna = C56392yDr.copydefault(new Function0() { // from class: o.fgz
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return ActivityC18363fgw.djBIcL(this.EZpvd);
        }
    });
    public final InterfaceC56387yDm djBIcL = C56392yDr.copydefault(new Function0() { // from class: o.fgB
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return java.lang.Boolean.valueOf(ActivityC18363fgw.AYXKKw(this.copydefault));
        }
    });

    /* JADX INFO: renamed from: o.fgw$StateListAnimator */
    public static final /* synthetic */ class StateListAnimator implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.EZpvd = function1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean equals(java.lang.Object obj) {
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
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.EZpvd.invoke(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ActivityResultLauncher<ICloudNetworkListBean> KWHzl() {
        return this.OLrzqt;
    }

    public ActivityC18363fgw() {
        ActivityResultLauncher<ICloudNetworkListBean> activityResultLauncherRegisterForActivityResult = registerForActivityResult(new ActivityC18320fgF.Application(), new ActivityResultCallback() { // from class: o.fgy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                ActivityC18363fgw.AEQbTJ(this.OLrzqt, (java.lang.Boolean) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "");
        this.OLrzqt = activityResultLauncherRegisterForActivityResult;
        this.copydefault = C56392yDr.copydefault(new Function0() { // from class: o.fgx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return ActivityC18363fgw.copydefault();
            }
        });
    }

    public final C18399fhf EZpvd() {
        return (C18399fhf) this.AEQbTJ.getValue();
    }

    public static final C18399fhf AhwBna(ActivityC18363fgw activityC18363fgw) {
        return (C18399fhf) new ViewModelProvider(activityC18363fgw).get(C18399fhf.class);
    }

    private final int AhwBna() {
        android.content.Intent intent = getIntent();
        if (intent != null) {
            return intent.getIntExtra("cloudType", 1);
        }
        return 1;
    }

    private final java.util.List<java.lang.Integer> gEmmrt() {
        return (java.util.List) this.AhwBna.getValue();
    }

    public static final java.util.List djBIcL(ActivityC18363fgw activityC18363fgw) {
        int[] intArrayExtra;
        java.util.List listWlaJM;
        android.content.Intent intent = activityC18363fgw.getIntent();
        return (intent == null || (intArrayExtra = intent.getIntArrayExtra("support_wallet_types")) == null || (listWlaJM = yDV.wlaJM(intArrayExtra)) == null) ? yDY.AhwBna() : listWlaJM;
    }

    public final boolean OLrzqt() {
        return ((java.lang.Boolean) this.djBIcL.getValue()).booleanValue();
    }

    public static final boolean AYXKKw(ActivityC18363fgw activityC18363fgw) {
        android.content.Intent intent = activityC18363fgw.getIntent();
        if (intent != null) {
            return intent.getBooleanExtra("need_finish_activity", false);
        }
        return false;
    }

    /* JADX INFO: renamed from: o.fgw$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.fgw.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    /* JADX INFO: renamed from: o.fgw$ActionBar */
    public static final class ActionBar extends ActivityResultContract<ICloudRestoreBean, java.lang.Boolean> {
        /* JADX DEBUG: Method merged with bridge method: createIntent(Landroid/content/Context;Ljava/lang/Object;)Landroid/content/Intent; */
        @Override // androidx.activity.result.contract.ActivityResultContract
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public android.content.Intent createIntent(@NotNull android.content.Context context, @NotNull ICloudRestoreBean iCloudRestoreBean) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(iCloudRestoreBean, "");
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) ActivityC18363fgw.class);
            intent.putExtra("cloudType", iCloudRestoreBean.getCloudType());
            java.util.List<java.lang.Integer> supportedWalletTypes = iCloudRestoreBean.getSupportedWalletTypes();
            if (supportedWalletTypes != null) {
                intent.putExtra("support_wallet_types", CollectionsKt___CollectionsKt.fARcdN((java.util.Collection<java.lang.Integer>) supportedWalletTypes));
            }
            intent.putExtra("need_finish_activity", iCloudRestoreBean.getNeedFinishActivity());
            return intent;
        }

        /* JADX DEBUG: Method merged with bridge method: parseResult(ILandroid/content/Intent;)Ljava/lang/Object; */
        @Override // androidx.activity.result.contract.ActivityResultContract
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public java.lang.Boolean parseResult(int i, android.content.Intent intent) {
            return java.lang.Boolean.valueOf(intent != null ? intent.getBooleanExtra("import_cloud_result", false) : false);
        }
    }

    public static final void AEQbTJ(ActivityC18363fgw activityC18363fgw, java.lang.Boolean bool) {
        android.content.Intent intent = new android.content.Intent();
        Intrinsics.copydefault(bool);
        intent.putExtra("import_cloud_result", bool.booleanValue());
        activityC18363fgw.setResult(-1, intent);
        if (activityC18363fgw.OLrzqt() && bool.booleanValue()) {
            activityC18363fgw.finish();
        }
    }

    public static final C43316rmw copydefault() {
        return new C43316rmw();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C43316rmw djBIcL() {
        return (C43316rmw) this.copydefault.getValue();
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.valueOf = (AbstractC16388eiw) DataBindingUtil.setContentView(this, C13754dXa.TaskDescription.gkJEwt);
        EZpvd().KWHzl(AhwBna());
        EZpvd().OLrzqt(gEmmrt());
        AbstractC16388eiw abstractC16388eiw = null;
        if (AhwBna() == 2) {
            AbstractC16388eiw abstractC16388eiw2 = this.valueOf;
            if (abstractC16388eiw2 == null) {
                Intrinsics.gEmmrt("");
                abstractC16388eiw2 = null;
            }
            abstractC16388eiw2.AEQbTJ.setImageResource(C13754dXa.Activity.giSNqX);
        }
        java.lang.String strKWHzl = C14392dkb.AEQbTJ.KWHzl(this, AhwBna());
        AbstractC16388eiw abstractC16388eiw3 = this.valueOf;
        if (abstractC16388eiw3 == null) {
            Intrinsics.gEmmrt("");
            abstractC16388eiw3 = null;
        }
        abstractC16388eiw3.EZpvd.setEmptyTypeImage(6);
        AbstractC16388eiw abstractC16388eiw4 = this.valueOf;
        if (abstractC16388eiw4 == null) {
            Intrinsics.gEmmrt("");
            abstractC16388eiw4 = null;
        }
        abstractC16388eiw4.EZpvd.setTitle(C33069mpW.copydefault(C13754dXa.FragmentManager.set, C56423yEv.EZpvd(C56390yDp.OLrzqt("CloudName", strKWHzl))));
        AbstractC16388eiw abstractC16388eiw5 = this.valueOf;
        if (abstractC16388eiw5 == null) {
            Intrinsics.gEmmrt("");
            abstractC16388eiw5 = null;
        }
        abstractC16388eiw5.EZpvd.setSubTitle((java.lang.CharSequence) C33069mpW.copydefault(C13754dXa.FragmentManager.ViewTreeFullyDrawnReporterOwnerfindViewTreeFullyDrawnReporterOwner2, C56423yEv.EZpvd(C56390yDp.OLrzqt("CloudName", strKWHzl))));
        EZpvd().OLrzqt(this);
        EZpvd().KWHzl().observe(this, new StateListAnimator(new Function1() { // from class: o.fgu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC18363fgw.OLrzqt(this.EZpvd, (java.lang.Integer) obj);
            }
        }));
        EZpvd().OLrzqt().observe(this, new StateListAnimator(new Function1() { // from class: o.fgv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC18363fgw.AEQbTJ(this.OLrzqt, (java.lang.Integer) obj);
            }
        }));
        EZpvd().AEQbTJ().observe(this, new StateListAnimator(new Function1() { // from class: o.fgs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC18363fgw.OLrzqt(this.OLrzqt, (java.lang.String) obj);
            }
        }));
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new ICloudListActivity$onCreate$4(this, null), 3, null);
        AbstractC16388eiw abstractC16388eiw6 = this.valueOf;
        if (abstractC16388eiw6 == null) {
            Intrinsics.gEmmrt("");
            abstractC16388eiw6 = null;
        }
        abstractC16388eiw6.djBIcL.setLayoutManager(new LinearLayoutManager(this));
        AbstractC16388eiw abstractC16388eiw7 = this.valueOf;
        if (abstractC16388eiw7 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC16388eiw = abstractC16388eiw7;
        }
        abstractC16388eiw.djBIcL.setAdapter(djBIcL());
        AYXKKw();
    }

    public static final Unit OLrzqt(ActivityC18363fgw activityC18363fgw, java.lang.Integer num) {
        java.lang.String strCopydefault;
        AbstractC16388eiw abstractC16388eiw = activityC18363fgw.valueOf;
        if (abstractC16388eiw == null) {
            Intrinsics.gEmmrt("");
            abstractC16388eiw = null;
        }
        android.widget.TextView textView = abstractC16388eiw.AhwBna;
        if (num != null && num.intValue() == 1) {
            strCopydefault = C33069mpW.copydefault(C13754dXa.FragmentManager.RequiresOptIn, C56423yEv.EZpvd(C56390yDp.OLrzqt("num", java.lang.String.valueOf(num))));
        } else {
            strCopydefault = C33069mpW.copydefault(C13754dXa.FragmentManager.RequiresOptInLevel, C56423yEv.EZpvd(C56390yDp.OLrzqt("num", java.lang.String.valueOf(num))));
        }
        textView.setText(strCopydefault);
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(ActivityC18363fgw activityC18363fgw, java.lang.Integer num) {
        AbstractC16388eiw abstractC16388eiw = null;
        if (num != null && num.intValue() == 0) {
            AbstractC16388eiw abstractC16388eiw2 = activityC18363fgw.valueOf;
            if (abstractC16388eiw2 == null) {
                Intrinsics.gEmmrt("");
            } else {
                abstractC16388eiw = abstractC16388eiw2;
            }
            abstractC16388eiw.KWHzl.setVisibility(8);
        } else {
            AbstractC16388eiw abstractC16388eiw3 = activityC18363fgw.valueOf;
            if (abstractC16388eiw3 == null) {
                Intrinsics.gEmmrt("");
                abstractC16388eiw3 = null;
            }
            abstractC16388eiw3.KWHzl.setVisibility(0);
            AbstractC16388eiw abstractC16388eiw4 = activityC18363fgw.valueOf;
            if (abstractC16388eiw4 == null) {
                Intrinsics.gEmmrt("");
            } else {
                abstractC16388eiw = abstractC16388eiw4;
            }
            abstractC16388eiw.KWHzl.setText(C33069mpW.copydefault(C13754dXa.FragmentManager.allOf, C56423yEv.EZpvd(C56390yDp.OLrzqt("num", java.lang.String.valueOf(num)))));
        }
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(ActivityC18363fgw activityC18363fgw, java.lang.String str) {
        AbstractC16388eiw abstractC16388eiw = activityC18363fgw.valueOf;
        if (abstractC16388eiw == null) {
            Intrinsics.gEmmrt("");
            abstractC16388eiw = null;
        }
        abstractC16388eiw.OLrzqt.setText(str);
        return Unit.INSTANCE;
    }

    private final void AYXKKw() {
        djBIcL().register(C18338fgX.class, new C18394fha());
        djBIcL().register(C18397fhd.class, new C18398fhe());
        djBIcL().register(C18336fgV.class, new C18334fgT(AhwBna()));
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        showLoadingAtOnce();
        if (this.KWHzl) {
            this.KWHzl = false;
        } else {
            EZpvd().OLrzqt(this);
            dismissLoading();
        }
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
    public void onStart() {
        super.onStart();
    }
}
