package o;

import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.biz.share.ShareFileProvider;
import com.okinc.p2p.api.OtcExtraKeys;
import com.okinc.share.bean.ShareConfig;
import com.okinc.share.bean.image.ImageShareParams;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fkp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class ActivityC18568fkp extends AbstractActivityC33013moT implements android.text.TextWatcher {
    public static final Activity Companion = new Activity(null);
    public static final int KWHzl = 8;
    public final InterfaceC56387yDm AhwBna;
    public AbstractC16308ehV EZpvd;
    public TaskDescription copydefault;
    public java.lang.String djBIcL;
    public java.lang.String valueOf = "";
    public java.lang.String AEQbTJ = "";
    public java.lang.String AYXKKw = "";
    public final InterfaceC56387yDm OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.fks
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return ActivityC18568fkp.KWHzl(this.EZpvd);
        }
    });

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
    }

    public ActivityC18568fkp() {
        final Function0 function0 = null;
        this.AhwBna = new ViewModelLazy(C56524yIo.AEQbTJ(C19301fyh.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.defi.wallet.mine.EosAccountActivity$special$$inlined$viewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.defi.wallet.mine.EosAccountActivity$special$$inlined$viewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.defi.wallet.mine.EosAccountActivity$special$$inlined$viewModels$default$3
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

    public final C19301fyh EZpvd() {
        return (C19301fyh) this.AhwBna.getValue();
    }

    public final java.util.ArrayList<kotlin.Pair<java.lang.String, androidx.fragment.app.Fragment>> KWHzl() {
        return (java.util.ArrayList) this.OLrzqt.getValue();
    }

    public static final java.util.ArrayList KWHzl(ActivityC18568fkp activityC18568fkp) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.String str = activityC18568fkp.valueOf;
        if (str == null || str.length() == 0) {
            java.lang.String string = activityC18568fkp.getString(C13754dXa.FragmentManager.QslYrK);
            C18533fkG c18533fkG = new C18533fkG();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("id", activityC18568fkp.djBIcL);
            c18533fkG.setArguments(bundle);
            Unit unit = Unit.INSTANCE;
            arrayList.add(C56390yDp.OLrzqt(string, c18533fkG));
            java.lang.String string2 = activityC18568fkp.getString(C13754dXa.FragmentManager.gGNlxh);
            C18578fkz c18578fkz = new C18578fkz();
            android.os.Bundle bundle2 = new android.os.Bundle();
            bundle2.putString("id", activityC18568fkp.djBIcL);
            c18578fkz.setArguments(bundle2);
            arrayList.add(C56390yDp.OLrzqt(string2, c18578fkz));
        } else {
            java.lang.String string3 = activityC18568fkp.getString(C13754dXa.FragmentManager.QslYrK);
            C18533fkG c18533fkG2 = new C18533fkG();
            android.os.Bundle bundle3 = new android.os.Bundle();
            bundle3.putString("id", activityC18568fkp.djBIcL);
            bundle3.putString("name", activityC18568fkp.valueOf);
            bundle3.putString(OtcExtraKeys.ORDER_DETAIL_KEY, activityC18568fkp.AEQbTJ);
            bundle3.putString("order_id_key", activityC18568fkp.AYXKKw);
            c18533fkG2.setArguments(bundle3);
            Unit unit2 = Unit.INSTANCE;
            arrayList.add(C56390yDp.OLrzqt(string3, c18533fkG2));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: o.fkp$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.fkp.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final void AEQbTJ(@NotNull android.content.Context context, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) ActivityC18568fkp.class);
            intent.putExtra("id", str);
            intent.putExtra("name", str2);
            intent.putExtra(OtcExtraKeys.ORDER_DETAIL_KEY, str3);
            intent.putExtra("order_id_key", str4);
            context.startActivity(intent);
        }
    }

    private final void AEQbTJ() {
        android.content.Intent intent = getIntent();
        java.lang.String stringExtra = intent != null ? intent.getStringExtra("id") : null;
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.djBIcL = stringExtra;
        android.content.Intent intent2 = getIntent();
        java.lang.String stringExtra2 = intent2 != null ? intent2.getStringExtra("name") : null;
        if (stringExtra2 == null) {
            stringExtra2 = "";
        }
        this.valueOf = stringExtra2;
        android.content.Intent intent3 = getIntent();
        java.lang.String stringExtra3 = intent3 != null ? intent3.getStringExtra(OtcExtraKeys.ORDER_DETAIL_KEY) : null;
        if (stringExtra3 == null) {
            stringExtra3 = "";
        }
        this.AEQbTJ = stringExtra3;
        android.content.Intent intent4 = getIntent();
        java.lang.String stringExtra4 = intent4 != null ? intent4.getStringExtra("order_id_key") : null;
        this.AYXKKw = stringExtra4 != null ? stringExtra4 : "";
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        C55008xbo c55008xbo;
        C55008xbo c55008xbo2;
        C55008xbo c55008xbo3;
        C55008xbo c55008xbo4;
        C55254xgV c55254xgV;
        C33547myX c33547myX;
        super.onCreate(bundle);
        AEQbTJ();
        this.EZpvd = (AbstractC16308ehV) DataBindingUtil.setContentView(this, C13754dXa.TaskDescription.RcXXUw);
        androidx.fragment.app.FragmentManager supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
        TaskDescription taskDescription = new TaskDescription(this, supportFragmentManager);
        this.copydefault = taskDescription;
        AbstractC16308ehV abstractC16308ehV = this.EZpvd;
        if (abstractC16308ehV != null && (c33547myX = abstractC16308ehV.EZpvd) != null) {
            c33547myX.setAdapter(taskDescription);
        }
        AbstractC16308ehV abstractC16308ehV2 = this.EZpvd;
        if (abstractC16308ehV2 != null && (c55254xgV = abstractC16308ehV2.copydefault) != null) {
            c55254xgV.setupWithViewPager(abstractC16308ehV2 != null ? abstractC16308ehV2.EZpvd : null);
        }
        AbstractC16308ehV abstractC16308ehV3 = this.EZpvd;
        if (abstractC16308ehV3 != null && (c55008xbo4 = abstractC16308ehV3.OLrzqt) != null) {
            c55008xbo4.OLrzqt(this);
        }
        java.lang.String str = this.valueOf;
        if (str == null || str.length() == 0) {
            AbstractC16308ehV abstractC16308ehV4 = this.EZpvd;
            if (abstractC16308ehV4 != null && (c55008xbo = abstractC16308ehV4.OLrzqt) != null) {
                c55008xbo.setEnabled(true);
            }
        } else {
            AbstractC16308ehV abstractC16308ehV5 = this.EZpvd;
            if (abstractC16308ehV5 != null && (c55008xbo3 = abstractC16308ehV5.OLrzqt) != null) {
                c55008xbo3.setEnabled(false);
            }
            AbstractC16308ehV abstractC16308ehV6 = this.EZpvd;
            if (abstractC16308ehV6 != null && (c55008xbo2 = abstractC16308ehV6.OLrzqt) != null) {
                c55008xbo2.setText(this.valueOf);
            }
        }
        getWindow().getDecorView().post(new java.lang.Runnable() { // from class: o.fkq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                ActivityC18568fkp.OLrzqt(this.OLrzqt);
            }
        });
    }

    public static final void OLrzqt(ActivityC18568fkp activityC18568fkp) {
        rVN.reportFullyDrawn$default((android.app.Activity) activityC18568fkp, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    /* JADX INFO: renamed from: o.fkp$TaskDescription */
    /* JADX INFO: loaded from: classes15.dex */
    public final class TaskDescription extends AbstractC33000moG {
        public final /* synthetic */ ActivityC18568fkp EZpvd;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TaskDescription(@NotNull ActivityC18568fkp activityC18568fkp, androidx.fragment.app.FragmentManager fragmentManager) {
            super(fragmentManager);
            Intrinsics.checkNotNullParameter(fragmentManager, "");
            this.EZpvd = activityC18568fkp;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public int getCount() {
            return this.EZpvd.KWHzl().size();
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public java.lang.CharSequence getPageTitle(int i) {
            return (java.lang.CharSequence) ((kotlin.Pair) this.EZpvd.KWHzl().get(i)).getFirst();
        }

        @Override // androidx.fragment.app.FragmentPagerAdapter
        public androidx.fragment.app.Fragment getItem(int i) {
            return (androidx.fragment.app.Fragment) ((kotlin.Pair) this.EZpvd.KWHzl().get(i)).getSecond();
        }
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        EZpvd().EZpvd().setValue(java.lang.String.valueOf(charSequence));
    }

    public final void share(@NotNull final android.view.View view) {
        android.view.Display defaultDisplay;
        Intrinsics.checkNotNullParameter(view, "");
        android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
        android.view.WindowManager windowManager = getWindowManager();
        if (windowManager != null && (defaultDisplay = windowManager.getDefaultDisplay()) != null) {
            defaultDisplay.getMetrics(displayMetrics);
        }
        final int i = displayMetrics.widthPixels;
        final int i2 = displayMetrics.heightPixels;
        final C49352umt c49352umt = new C49352umt(this);
        c49352umt.setSrcFrom("eosaccount_create_qrcode", new Function0() { // from class: o.fkt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return ActivityC18568fkp.OLrzqt(c49352umt, i, i2, view, this);
            }
        });
    }

    public static final Unit OLrzqt(C49352umt c49352umt, int i, int i2, android.view.View view, final ActivityC18568fkp activityC18568fkp) {
        C33487mxQ.EZpvd(c49352umt, i, i2);
        android.graphics.Bitmap bitmapOLrzqt = C33487mxQ.OLrzqt(view, c49352umt);
        final InterfaceC48893ueK interfaceC48893ueK = (InterfaceC48893ueK) C43251rlk.copydefault(InterfaceC48893ueK.class);
        ShareFileProvider.StateListAnimator stateListAnimator = ShareFileProvider.Companion;
        Intrinsics.copydefault(bitmapOLrzqt);
        stateListAnimator.copydefault(bitmapOLrzqt, activityC18568fkp, new Function1() { // from class: o.fkr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC18568fkp.KWHzl((java.lang.Throwable) obj);
            }
        }, new Function1() { // from class: o.fkw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC18568fkp.copydefault(interfaceC48893ueK, activityC18568fkp, (java.io.File) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Class process forced to load method for inline: com.okinc.share.bean.ShareConfig.ActionBar.create$default(com.okinc.share.bean.ShareConfig$ActionBar, com.okinc.share.api.params.IShareParams, kotlin.jvm.functions.Function1, int, java.lang.Object):com.okinc.share.bean.ShareConfig */
    /* JADX DEBUG: Class process forced to load method for inline: com.okinc.share.bean.image.ImageShareParams.ActionBar.create$default(com.okinc.share.bean.image.ImageShareParams$ActionBar, java.lang.String, kotlin.jvm.functions.Function1, int, java.lang.Object):com.okinc.share.bean.image.ImageShareParams */
    public static final Unit copydefault(InterfaceC48893ueK interfaceC48893ueK, ActivityC18568fkp activityC18568fkp, java.io.File file) {
        Intrinsics.checkNotNullParameter(file, "");
        ImageShareParams.ActionBar actionBar = ImageShareParams.Companion;
        java.lang.String absolutePath = file.getAbsolutePath();
        Intrinsics.checkNotNullExpressionValue(absolutePath, "");
        interfaceC48893ueK.copydefault(activityC18568fkp, ShareConfig.ActionBar.create$default(ShareConfig.Companion, ImageShareParams.ActionBar.create$default(actionBar, absolutePath, null, 2, null), null, 2, null));
        return Unit.INSTANCE;
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
