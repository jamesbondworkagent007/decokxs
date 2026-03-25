package o;

import android.view.View;
import android.widget.CompoundButton;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.core.content.ContextCompat;
import androidx.core.os.BundleKt;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;
import androidx.lifecycle.Transformations;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.bytedance.applog.encryptor.IEncryptorType;
import com.google.common.base.Ascii;
import com.okinc.base.bugreport.DetectionInfoBean;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import com.okinc.business.defi.wallet.transaction.moduleModel.bean.DataInputModuleModel;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.okex.feedback.net.bean.ChildCategory;
import com.okinc.okex.feedback.net.bean.MainCategory;
import com.okinc.okex.feedback.viewmodel.FeedbackSubmitViewModel;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C32113mPz;
import o.C33012moS;
import o.C33625mzw;
import o.C44103sDl;
import o.C45614stP;
import o.C45618stT;
import o.C47315tni;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: renamed from: o.std, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class ActivityC45628std extends AbstractActivityC45608stJ implements C45614stP.TaskDescription {
    public static final Activity Companion = new Activity(null);
    public static final int EZpvd = 8;
    public final ActivityResultLauncher<android.content.Intent> AEQbTJ;
    public final ActivityResultLauncher<android.content.Intent> OLrzqt;
    public final InterfaceC56387yDm gEmmrt;
    public AbstractC47323tnq valueOf;
    public final InterfaceC56387yDm copydefault = C56392yDr.copydefault(new Function0() { // from class: o.sts
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return java.lang.Boolean.valueOf(ActivityC45628std.gEmmrt(this.EZpvd));
        }
    });
    public final InterfaceC56387yDm KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.stw
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return java.lang.Integer.valueOf(ActivityC45628std.AYXKKw(this.KWHzl));
        }
    });

    /* JADX INFO: renamed from: o.std$LoaderManager */
    public static final /* synthetic */ class LoaderManager implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public LoaderManager(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.copydefault = function1;
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
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.copydefault.invoke(obj);
        }
    }

    public ActivityC45628std() {
        final Function0 function0 = null;
        this.gEmmrt = new ViewModelLazy(C56524yIo.AEQbTJ(FeedbackSubmitViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.okex.feedback.FeedbackSubmitActivity$special$$inlined$viewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.okex.feedback.FeedbackSubmitActivity$special$$inlined$viewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.okex.feedback.FeedbackSubmitActivity$special$$inlined$viewModels$default$3
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
        ActivityResultLauncher<android.content.Intent> activityResultLauncherRegisterForActivityResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: o.stt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                ActivityC45628std.OLrzqt(this.AEQbTJ, (ActivityResult) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "");
        this.OLrzqt = activityResultLauncherRegisterForActivityResult;
        ActivityResultLauncher<android.content.Intent> activityResultLauncherRegisterForActivityResult2 = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: o.stu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                ActivityC45628std.copydefault(this.AEQbTJ, (ActivityResult) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult2, "");
        this.AEQbTJ = activityResultLauncherRegisterForActivityResult2;
    }

    /* JADX INFO: renamed from: o.std$Activity */
    /* JADX INFO: loaded from: classes19.dex */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.std.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final android.content.Intent AEQbTJ(@NotNull android.content.Context context, boolean z, int i) {
            Intrinsics.checkNotNullParameter(context, "");
            android.content.Intent intent = new android.content.Intent(context.getApplicationContext(), (java.lang.Class<?>) ActivityC45628std.class);
            intent.putExtras(BundleKt.bundleOf(C56390yDp.OLrzqt("KEY_IS_WHITELISTED", java.lang.Boolean.valueOf(z)), C56390yDp.OLrzqt("KEY_CATEGORY_ID", java.lang.Integer.valueOf(i))));
            return intent;
        }
    }

    private final boolean isConnected() {
        return ((java.lang.Boolean) this.copydefault.getValue()).booleanValue();
    }

    public static final boolean gEmmrt(ActivityC45628std activityC45628std) {
        android.content.Intent intent = activityC45628std.getIntent();
        if (intent != null) {
            return intent.getBooleanExtra("KEY_IS_WHITELISTED", false);
        }
        return false;
    }

    private final int AhwBna() {
        return ((java.lang.Number) this.KWHzl.getValue()).intValue();
    }

    public static final int AYXKKw(ActivityC45628std activityC45628std) {
        android.content.Intent intent = activityC45628std.getIntent();
        if (intent != null) {
            return intent.getIntExtra("KEY_CATEGORY_ID", 0);
        }
        return 0;
    }

    /* JADX DEBUG: Possible override for method o.stJ.EZpvd()V */
    public final FeedbackSubmitViewModel EZpvd() {
        return (FeedbackSubmitViewModel) this.gEmmrt.getValue();
    }

    public static final void OLrzqt(ActivityC45628std activityC45628std, ActivityResult activityResult) {
        Intrinsics.copydefault(activityResult);
        activityC45628std.KWHzl(true, activityResult);
    }

    public static final void copydefault(ActivityC45628std activityC45628std, ActivityResult activityResult) {
        Intrinsics.copydefault(activityResult);
        activityC45628std.KWHzl(false, activityResult);
    }

    public final void KWHzl(boolean z, ActivityResult activityResult) {
        android.content.Intent data;
        android.net.Uri data2;
        if (activityResult.getResultCode() != -1 || (data = activityResult.getData()) == null || (data2 = data.getData()) == null) {
            return;
        }
        java.lang.String strAEQbTJ = C45616stR.OLrzqt.AEQbTJ(this, data2, z);
        if (strAEQbTJ != null && !StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strAEQbTJ)) {
            EZpvd().EZpvd(new java.io.File(strAEQbTJ));
        } else {
            C55328xhq.show$default(C55328xhq.OLrzqt, "path error", ContextCompat.getDrawable(this, C52761wXj.TaskDescription.dPkBzA), 0, (java.lang.Integer) null, 0, 0, 60, (java.lang.Object) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean AkhnZx() {
        return AhwBna() != 4;
    }

    public final java.lang.CharSequence OLrzqt(java.lang.String str) {
        return C33574myy.setupSpanStyles$default(str + " *", new java.lang.String[]{"*"}, 0, null, false, new Function1() { // from class: o.stv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC45628std.valueOf(this.EZpvd, (java.util.List) obj);
            }
        }, 14, null);
    }

    public static final Unit valueOf(ActivityC45628std activityC45628std, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        list.add(new android.text.style.TextAppearanceSpan(activityC45628std, C32113mPz.Dialog.fARcdN));
        return Unit.INSTANCE;
    }

    public final void AEQbTJ() {
        if (AkhnZx()) {
            TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
            C32866mlf.onEvent$default("app_support_feedback_submit_page_back_click", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1) null, 2, (java.lang.Object) null);
        } else {
            TrackChannel[] trackChannelArrCopydefault2 = C32868mlh.OLrzqt.copydefault();
            C32866mlf.onEvent$default("app_support_security_bug_submit_page_back_click", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault2, trackChannelArrCopydefault2.length), (Function1) null, 2, (java.lang.Object) null);
        }
    }

    @Override // o.AbstractActivityC33041mov, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        AEQbTJ();
    }

    @Override // o.AbstractActivityC45608stJ, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        C55009xbp c55009xbpFIwbmz;
        C55009xbp c55009xbpFIwbmz2;
        super.onCreate(bundle);
        final AbstractC47323tnq abstractC47323tnq = (AbstractC47323tnq) DataBindingUtil.setContentView(this, C47315tni.ActionBar.OLrzqt);
        abstractC47323tnq.setLifecycleOwner(this);
        abstractC47323tnq.copydefault(getString(AkhnZx() ? C47315tni.PendingIntent.DNMMPQ : C47315tni.PendingIntent.USBtdM));
        C55018xby c55018xby = abstractC47323tnq.fJNWhG;
        java.lang.String string = getString(AkhnZx() ? C47315tni.PendingIntent.akftKQ : C47315tni.PendingIntent.QwvEab);
        Intrinsics.checkNotNullExpressionValue(string, "");
        c55018xby.setLabelText(string);
        c55018xby.setHintText(string);
        Transformations.map(EZpvd().AhwBna(), new Function1() { // from class: o.ste
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC45628std.OLrzqt((MainCategory) obj);
            }
        }).observe(this, new C32991mny(new Function1() { // from class: o.stF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC45628std.EZpvd(abstractC47323tnq, this, (MainCategory) obj);
            }
        }));
        Transformations.map(EZpvd().djBIcL(), new Function1() { // from class: o.stf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC45628std.AEQbTJ((ChildCategory) obj);
            }
        }).observe(this, new C32991mny(new Function1() { // from class: o.stj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC45628std.KWHzl(abstractC47323tnq, this, (ChildCategory) obj);
            }
        }));
        C55018xby c55018xby2 = abstractC47323tnq.ejfBZ;
        java.lang.String string2 = getString(C47315tni.PendingIntent.UscePu);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        c55018xby2.setLabelText(string2);
        c55018xby2.setHintText(getString(C47315tni.PendingIntent.zqTOFw));
        abstractC47323tnq.AEQbTJ(OLrzqt(getString(C47315tni.PendingIntent.gmHjFq)));
        abstractC47323tnq.KWHzl(EZpvd().AkhnZx());
        abstractC47323tnq.EZpvd(OLrzqt(getString(C47315tni.PendingIntent.aJFbMH)));
        abstractC47323tnq.copydefault(EZpvd().KWHzl());
        abstractC47323tnq.KWHzl(Transformations.map(EZpvd().copydefault(), new Function1() { // from class: o.stk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC45628std.copydefault((java.util.List) obj);
            }
        }));
        abstractC47323tnq.djBIcL(Transformations.map(EZpvd().copydefault(), new Function1() { // from class: o.stl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC45628std.gEmmrt(this.KWHzl, (java.util.List) obj);
            }
        }));
        abstractC47323tnq.EZpvd(Transformations.map(EZpvd().copydefault(), new Function1() { // from class: o.sti
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC45628std.AYXKKw(this.EZpvd, (java.util.List) obj);
            }
        }));
        abstractC47323tnq.AEQbTJ(Transformations.map(EZpvd().copydefault(), new Function1() { // from class: o.stm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC45628std.KWHzl((java.util.List) obj);
            }
        }));
        abstractC47323tnq.OLrzqt(Transformations.distinctUntilChanged(EZpvd().values()));
        abstractC47323tnq.copydefault(Transformations.map(EZpvd().DbNXlk(), new Function1() { // from class: o.str
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC45628std.OLrzqt((FeedbackSubmitViewModel.TaskDescription) obj);
            }
        }));
        this.valueOf = abstractC47323tnq;
        if (bundle == null) {
            EZpvd().KWHzl(AhwBna());
        }
        EZpvd().fetchVPNInfo().observe(this, new LoaderManager(new Function1() { // from class: o.stp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC45628std.AEQbTJ(this.OLrzqt, (java.lang.Boolean) obj);
            }
        }));
        Transformations.map(EZpvd().OLrzqt(), new Function1() { // from class: o.sth
            private static final byte[] $$c = {113, 48, -67, 32};
            private static final int $$d = 14;
            private static int $10 = 0;
            private static int $11 = 1;
            private static final byte[] $$a = {53, 37, -51, -57, 4, -7, 1, -29, -7, -7, -13, Ascii.FF, -17, 0, -11, Ascii.RS, 0, -17, -5};
            private static final int $$b = 60;
            private static int AYXKKw = 0;
            private static int valueOf = 1;
            private static int[] OLrzqt = {-1834572491, -1147294621, 485344489, 743869609, -1423158435, 1791485920, -1470656213, -779488264, 744995776, 820249051, -934726934, 1222080044, 1749333742, 2124172101, -278409020, -1014457413, 1495070788, 297521924};
            private static char[] AEQbTJ = {62924, 62494, 62498, 62481, 62511, 62513, 62510, 62483, 62484, 62495, 62947, 62496, 62507, 62504, 62927, 62497, 62508, 62912, 62487, 62937, 62485, 62486, 62480, 62506, 62914, 62922, 62509};
            private static int copydefault = 585627011;
            private static boolean KWHzl = true;
            private static boolean EZpvd = true;

            /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0026). Please report as a decompilation issue!!! */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            private static java.lang.String $$e(byte b, int i, short s) {
                int i2;
                int i3 = i * 2;
                int i4 = b + 99;
                int i5 = 3 - (s * 4);
                byte[] bArr = $$c;
                byte[] bArr2 = new byte[i3 + 1];
                if (bArr == null) {
                    int i6 = i3;
                    i2 = 0;
                    i4 += -i6;
                    bArr2[i2] = (byte) i4;
                    i5++;
                    if (i2 == i3) {
                        return new java.lang.String(bArr2, 0);
                    }
                    i2++;
                    i6 = bArr[i5];
                    i4 += -i6;
                    bArr2[i2] = (byte) i4;
                    i5++;
                    if (i2 == i3) {
                    }
                } else {
                    i2 = 0;
                    bArr2[i2] = (byte) i4;
                    i5++;
                    if (i2 == i3) {
                    }
                }
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x002b). Please report as a decompilation issue!!! */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            private static void c(short s, short s2, short s3, java.lang.Object[] objArr) {
                int i;
                int i2 = s3 * 5;
                int i3 = (s * 20) + 79;
                int i4 = (s2 * 10) + 4;
                byte[] bArr = $$a;
                byte[] bArr2 = new byte[i2 + 6];
                int i5 = i2 + 5;
                if (bArr == null) {
                    int i6 = i3;
                    i3 = i5;
                    int i7 = 0;
                    i4++;
                    i3 = i3 + i6 + 8;
                    i = i7;
                    bArr2[i] = (byte) i3;
                    i7 = i + 1;
                    if (i == i5) {
                        objArr[0] = new java.lang.String(bArr2, 0);
                        return;
                    }
                    i6 = bArr[i4];
                    i4++;
                    i3 = i3 + i6 + 8;
                    i = i7;
                    bArr2[i] = (byte) i3;
                    i7 = i + 1;
                    if (i == i5) {
                    }
                } else {
                    i = 0;
                    bArr2[i] = (byte) i3;
                    i7 = i + 1;
                    if (i == i5) {
                    }
                }
            }

            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                int i = 2 % 2;
                int i2 = AYXKKw + WalletImportError.ERROR_CODE_HARDWARE_ACCOUNT_EXIST;
                valueOf = i2 % 128;
                int i3 = i2 % 2;
                C32989mnw c32989mnwCopydefault = ActivityC45628std.copydefault((FeedbackSubmitViewModel.ActionBar) obj);
                int i4 = AYXKKw + 101;
                valueOf = i4 % 128;
                if (i4 % 2 != 0) {
                    return c32989mnwCopydefault;
                }
                throw null;
            }

            /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [148=5] */
            /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
            private static void a(int[] iArr, int i, java.lang.Object[] objArr) throws java.lang.Throwable {
                int length;
                int[] iArr2;
                int i2;
                int i3 = 2 % 2;
                Zm zm = new Zm();
                char[] cArr = new char[4];
                char[] cArr2 = new char[iArr.length * 2];
                int[] iArr3 = OLrzqt;
                int i4 = 698602880;
                int i5 = 3;
                if (iArr3 != null) {
                    int length2 = iArr3.length;
                    int[] iArr4 = new int[length2];
                    int i6 = 0;
                    while (i6 < length2) {
                        try {
                            java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(iArr3[i6])};
                            java.lang.Object objEZpvd = YY.EZpvd(i4);
                            if (objEZpvd == null) {
                                byte b = (byte) ($$d - i5);
                                byte b2 = (byte) 0;
                                objEZpvd = YY.EZpvd(CipherSuite.TLS_RSA_PSK_WITH_NULL_SHA256, 4, (char) 22195, 763566332, false, $$e(b, b2, b2), new java.lang.Class[]{java.lang.Integer.TYPE});
                            }
                            iArr4[i6] = ((java.lang.Integer) ((java.lang.reflect.Method) objEZpvd).invoke(null, objArr2)).intValue();
                            i6++;
                            i4 = 698602880;
                            i5 = 3;
                        } catch (java.lang.Throwable th) {
                            java.lang.Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                    iArr3 = iArr4;
                }
                int length3 = iArr3.length;
                int[] iArr5 = new int[length3];
                int[] iArr6 = OLrzqt;
                if (iArr6 != null) {
                    int i7 = $10 + 59;
                    $11 = i7 % 128;
                    if (i7 % 2 == 0) {
                        length = iArr6.length;
                        iArr2 = new int[length];
                        i2 = 1;
                    } else {
                        length = iArr6.length;
                        iArr2 = new int[length];
                        i2 = 0;
                    }
                    while (i2 < length) {
                        java.lang.Object[] objArr3 = {java.lang.Integer.valueOf(iArr6[i2])};
                        java.lang.Object objEZpvd2 = YY.EZpvd(698602880);
                        if (objEZpvd2 == null) {
                            byte b3 = (byte) 0;
                            objEZpvd2 = YY.EZpvd(CipherSuite.TLS_RSA_PSK_WITH_NULL_SHA256, 4, (char) 22195, 763566332, false, $$e((byte) ($$d - 3), b3, b3), new java.lang.Class[]{java.lang.Integer.TYPE});
                        }
                        iArr2[i2] = ((java.lang.Integer) ((java.lang.reflect.Method) objEZpvd2).invoke(null, objArr3)).intValue();
                        i2++;
                        int i8 = $11 + 3;
                        $10 = i8 % 128;
                        int i9 = i8 % 2;
                    }
                    iArr6 = iArr2;
                }
                java.lang.System.arraycopy(iArr6, 0, iArr5, 0, length3);
                zm.OLrzqt = 0;
                while (zm.OLrzqt < iArr.length) {
                    cArr[0] = (char) (iArr[zm.OLrzqt] >> 16);
                    cArr[1] = (char) iArr[zm.OLrzqt];
                    cArr[2] = (char) (iArr[zm.OLrzqt + 1] >> 16);
                    cArr[3] = (char) iArr[zm.OLrzqt + 1];
                    zm.copydefault = (cArr[0] << 16) + cArr[1];
                    zm.KWHzl = (cArr[2] << 16) + cArr[3];
                    Zm.EZpvd(iArr5);
                    for (int i10 = 0; i10 < 16; i10++) {
                        zm.copydefault ^= iArr5[i10];
                        java.lang.Object[] objArr4 = {zm, java.lang.Integer.valueOf(Zm.AEQbTJ(zm.copydefault)), zm, zm};
                        java.lang.Object objEZpvd3 = YY.EZpvd(984677556);
                        if (objEZpvd3 == null) {
                            byte b4 = (byte) 0;
                            objEZpvd3 = YY.EZpvd(180, 4, (char) 19181, 1049637320, false, $$e((byte) ($$d & 56), b4, b4), new java.lang.Class[]{java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class});
                        }
                        int iIntValue = ((java.lang.Integer) ((java.lang.reflect.Method) objEZpvd3).invoke(null, objArr4)).intValue();
                        zm.copydefault = zm.KWHzl;
                        zm.KWHzl = iIntValue;
                    }
                    int i11 = zm.copydefault;
                    zm.copydefault = zm.KWHzl;
                    zm.KWHzl = i11;
                    zm.KWHzl ^= iArr5[16];
                    zm.copydefault ^= iArr5[17];
                    int i12 = zm.copydefault;
                    int i13 = zm.KWHzl;
                    cArr[0] = (char) (zm.copydefault >>> 16);
                    cArr[1] = (char) zm.copydefault;
                    cArr[2] = (char) (zm.KWHzl >>> 16);
                    cArr[3] = (char) zm.KWHzl;
                    Zm.EZpvd(iArr5);
                    cArr2[zm.OLrzqt * 2] = cArr[0];
                    cArr2[(zm.OLrzqt * 2) + 1] = cArr[1];
                    cArr2[(zm.OLrzqt * 2) + 2] = cArr[2];
                    cArr2[(zm.OLrzqt * 2) + 3] = cArr[3];
                    try {
                        java.lang.Object[] objArr5 = {zm, zm};
                        java.lang.Object objEZpvd4 = YY.EZpvd(-1770687495);
                        if (objEZpvd4 == null) {
                            byte b5 = (byte) 0;
                            objEZpvd4 = YY.EZpvd(600, 5, (char) 29201, -1839874427, false, $$e((byte) ($$d - 4), b5, b5), new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class});
                        }
                        ((java.lang.reflect.Method) objEZpvd4).invoke(null, objArr5);
                        int i14 = $11 + 101;
                        $10 = i14 % 128;
                        int i15 = i14 % 2;
                    } catch (java.lang.Throwable th2) {
                        java.lang.Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
                objArr[0] = new java.lang.String(cArr2, 0, i);
            }

            /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [165=4, 152=4] */
            /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
            private static void b(char[] cArr, int[] iArr, int i, byte[] bArr, java.lang.Object[] objArr) throws java.lang.Throwable {
                int i2;
                int i3 = 2 % 2;
                Ze ze = new Ze();
                char[] cArr2 = AEQbTJ;
                if (cArr2 != null) {
                    int length = cArr2.length;
                    char[] cArr3 = new char[length];
                    for (int i4 = 0; i4 < length; i4++) {
                        try {
                            java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr2[i4])};
                            java.lang.Object objEZpvd = YY.EZpvd(-855574269);
                            if (objEZpvd == null) {
                                objEZpvd = YY.EZpvd(1075, 5, (char) 0, -920636289, false, IEncryptorType.DEFAULT_ENCRYPTOR, new java.lang.Class[]{java.lang.Integer.TYPE});
                            }
                            cArr3[i4] = ((java.lang.Character) ((java.lang.reflect.Method) objEZpvd).invoke(null, objArr2)).charValue();
                        } catch (java.lang.Throwable th) {
                            java.lang.Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                    cArr2 = cArr3;
                }
                java.lang.Object[] objArr3 = {java.lang.Integer.valueOf(copydefault)};
                java.lang.Object objEZpvd2 = YY.EZpvd(-1914793274);
                if (objEZpvd2 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objEZpvd2 = YY.EZpvd(496, 5, (char) 0, -1979818054, false, $$e(b, b2, b2), new java.lang.Class[]{java.lang.Integer.TYPE});
                }
                int iIntValue = ((java.lang.Integer) ((java.lang.reflect.Method) objEZpvd2).invoke(null, objArr3)).intValue();
                int i5 = -1317980492;
                if (EZpvd) {
                    ze.copydefault = bArr.length;
                    char[] cArr4 = new char[ze.copydefault];
                    ze.AEQbTJ = 0;
                    while (ze.AEQbTJ < ze.copydefault) {
                        cArr4[ze.AEQbTJ] = (char) (cArr2[bArr[(ze.copydefault - 1) - ze.AEQbTJ] + i] - iIntValue);
                        try {
                            java.lang.Object[] objArr4 = {ze, ze};
                            java.lang.Object objEZpvd3 = YY.EZpvd(i5);
                            if (objEZpvd3 == null) {
                                byte b3 = (byte) ($$d & 3);
                                byte b4 = (byte) (b3 - 2);
                                objEZpvd3 = YY.EZpvd(300, 21, (char) 0, -1252918328, false, $$e(b3, b4, b4), new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class});
                            }
                            ((java.lang.reflect.Method) objEZpvd3).invoke(null, objArr4);
                            int i6 = $11 + 93;
                            $10 = i6 % 128;
                            int i7 = i6 % 2;
                            i5 = -1317980492;
                        } catch (java.lang.Throwable th2) {
                            java.lang.Throwable cause2 = th2.getCause();
                            if (cause2 == null) {
                                throw th2;
                            }
                            throw cause2;
                        }
                    }
                    objArr[0] = new java.lang.String(cArr4);
                    return;
                }
                if (!KWHzl) {
                    ze.copydefault = iArr.length;
                    char[] cArr5 = new char[ze.copydefault];
                    ze.AEQbTJ = 0;
                    while (ze.AEQbTJ < ze.copydefault) {
                        int i8 = $11 + 61;
                        $10 = i8 % 128;
                        if (i8 % 2 != 0) {
                            cArr5[ze.AEQbTJ] = (char) (cArr2[iArr[ze.copydefault >>> ze.AEQbTJ] / i] << iIntValue);
                            i2 = ze.AEQbTJ;
                        } else {
                            cArr5[ze.AEQbTJ] = (char) (cArr2[iArr[(ze.copydefault - 1) - ze.AEQbTJ] - i] - iIntValue);
                            i2 = ze.AEQbTJ + 1;
                        }
                        ze.AEQbTJ = i2;
                    }
                    objArr[0] = new java.lang.String(cArr5);
                    return;
                }
                ze.copydefault = cArr.length;
                char[] cArr6 = new char[ze.copydefault];
                ze.AEQbTJ = 0;
                while (ze.AEQbTJ < ze.copydefault) {
                    int i9 = $11 + 37;
                    $10 = i9 % 128;
                    if (i9 % 2 != 0) {
                        cArr6[ze.AEQbTJ] = (char) (cArr2[cArr[ze.copydefault / ze.AEQbTJ] >> i] / iIntValue);
                        try {
                            java.lang.Object[] objArr5 = {ze, ze};
                            java.lang.Object objEZpvd4 = YY.EZpvd(-1317980492);
                            if (objEZpvd4 == null) {
                                byte b5 = (byte) ($$d & 3);
                                byte b6 = (byte) (b5 - 2);
                                objEZpvd4 = YY.EZpvd(300, 21, (char) 0, -1252918328, false, $$e(b5, b6, b6), new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class});
                            }
                            ((java.lang.reflect.Method) objEZpvd4).invoke(null, objArr5);
                        } catch (java.lang.Throwable th3) {
                            java.lang.Throwable cause3 = th3.getCause();
                            if (cause3 == null) {
                                throw th3;
                            }
                            throw cause3;
                        }
                    } else {
                        cArr6[ze.AEQbTJ] = (char) (cArr2[cArr[(ze.copydefault - 1) - ze.AEQbTJ] - i] - iIntValue);
                        java.lang.Object[] objArr6 = {ze, ze};
                        java.lang.Object objEZpvd5 = YY.EZpvd(-1317980492);
                        if (objEZpvd5 == null) {
                            byte b7 = (byte) ($$d & 3);
                            byte b8 = (byte) (b7 - 2);
                            objEZpvd5 = YY.EZpvd(300, 21, (char) 0, -1252918328, false, $$e(b7, b8, b8), new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class});
                        }
                        ((java.lang.reflect.Method) objEZpvd5).invoke(null, objArr6);
                    }
                }
                objArr[0] = new java.lang.String(cArr6);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
            public static void KWHzl(long j, long j2) throws java.lang.Throwable {
                int i = 2 % 2;
                int i2 = AYXKKw + 107;
                valueOf = i2 % 128;
                int i3 = i2 % 2;
                long j3 = j ^ (j2 << 32);
                java.lang.Object[] objArr = new java.lang.Object[1];
                a(new int[]{-826941595, -290072094, -1952851591, -236518075, -285094181, -1951816740}, 9, objArr);
                java.lang.Object obj = C44103sDl.class.getField((java.lang.String) objArr[0]).get(null);
                int i4 = AYXKKw + 109;
                valueOf = i4 % 128;
                int i5 = i4 % 2;
                try {
                    java.lang.reflect.Constructor declaredConstructor = java.lang.StringBuilder.class.getDeclaredConstructor(null);
                    declaredConstructor.setAccessible(true);
                    java.lang.Object objNewInstance = declaredConstructor.newInstance(null);
                    java.lang.Object[] objArr2 = new java.lang.Object[1];
                    b(null, null, 127, new byte[]{-108, -114, -116, -125, -112, -109, -109, -125, -110, -111, -126, -112, -121, -113, -114, -116, -121, -115, -116, -117, -118, -124, -119, -120, -121, -122, -123, -124, -125, -126, -127}, objArr2);
                    java.lang.Object[] objArr3 = {(java.lang.String) objArr2[0]};
                    java.lang.Object[] objArr4 = new java.lang.Object[1];
                    b(null, null, 127, new byte[]{-123, -107, -121, -120, -120, -125}, objArr4);
                    java.lang.reflect.Method method = java.lang.StringBuilder.class.getMethod((java.lang.String) objArr4[0], java.lang.String.class);
                    method.setAccessible(true);
                    method.invoke(objNewInstance, objArr3);
                    int i6 = valueOf + 41;
                    AYXKKw = i6 % 128;
                    int i7 = i6 % 2;
                    java.lang.Object[] objArr5 = {java.lang.Long.valueOf(j3)};
                    java.lang.Object[] objArr6 = new java.lang.Object[1];
                    b(null, null, 127, new byte[]{-123, -107, -121, -120, -120, -125}, objArr6);
                    java.lang.reflect.Method method2 = java.lang.StringBuilder.class.getMethod((java.lang.String) objArr6[0], java.lang.Long.TYPE);
                    method2.setAccessible(true);
                    method2.invoke(objNewInstance, objArr5);
                    java.lang.Object[] objArr7 = new java.lang.Object[1];
                    a(new int[]{-1935206575, 1427557261, 2136640627, 314018121, 1065387993, -1183969430, -733010977, 485493468, -2051755395, -500432737, 968537819, 775728123}, 22, objArr7);
                    java.lang.String str = (java.lang.String) objArr7[0];
                    java.lang.Object[] objArr8 = new java.lang.Object[1];
                    a(new int[]{438912690, 1790090765, -147645096, 395949141}, 8, objArr8);
                    java.lang.reflect.Method method3 = java.lang.StringBuilder.class.getMethod((java.lang.String) objArr8[0], null);
                    method3.setAccessible(true);
                    java.lang.Object objInvoke = method3.invoke(objNewInstance, null);
                    java.lang.Object[] objArr9 = new java.lang.Object[1];
                    b(null, null, 127, new byte[]{-111, -105, -106}, objArr9);
                    java.lang.Object[] objArr10 = {objInvoke, (java.lang.String) objArr9[0]};
                    java.lang.Object[] objArr11 = new java.lang.Object[1];
                    a(new int[]{-860663733, 1088907096, 1821450241, -2038157521, -1674325180, -1981824528, 1374527188, -1548322774, -1490628034, 1514394910, -1541718559, -369653643}, 21, objArr11);
                    java.lang.reflect.Method method4 = Intrinsics.class.getMethod((java.lang.String) objArr11[0], java.lang.Object.class, java.lang.String.class);
                    method4.setAccessible(true);
                    method4.invoke(null, objArr10);
                    if (!pUU.class.getField("AEQbTJ").getBoolean(null)) {
                        java.lang.Object[] objArr12 = new java.lang.Object[1];
                        a(new int[]{-667678964, -992087822, -711366675, 465644783, 664820231, 1865192263, -111391902, 1482911455, 13981941, -419203296, -160971422, -1237849549}, 23, objArr12);
                        java.lang.Object[] objArr13 = {((java.lang.String) objArr12[0]).toString()};
                        java.lang.reflect.Constructor declaredConstructor2 = java.lang.IllegalStateException.class.getDeclaredConstructor(java.lang.String.class);
                        declaredConstructor2.setAccessible(true);
                        throw ((java.lang.Throwable) declaredConstructor2.newInstance(objArr13));
                    }
                    int i8 = valueOf + 41;
                    AYXKKw = i8 % 128;
                    int i9 = i8 % 2;
                    java.lang.Object obj2 = pUU.class.getField("copydefault").get(null);
                    java.lang.reflect.Method method5 = Intrinsics.class.getMethod("copydefault", java.lang.Object.class);
                    method5.setAccessible(true);
                    method5.invoke(null, obj2);
                    java.lang.reflect.Method method6 = pUP.class.getMethod("OLrzqt", java.lang.String.class, java.lang.String.class);
                    method6.setAccessible(true);
                    method6.invoke(obj2, str, objInvoke);
                    byte[] bArr = $$a;
                    byte b = bArr[6];
                    java.lang.Object[] objArr14 = new java.lang.Object[1];
                    c(b, bArr[13], b, objArr14);
                    java.lang.reflect.Method method7 = C44103sDl.ActionBar.class.getMethod((java.lang.String) objArr14[0], null);
                    method7.setAccessible(true);
                    java.lang.Object objInvoke2 = method7.invoke(obj, null);
                    java.lang.Object[] objArr15 = new java.lang.Object[1];
                    b(null, null, 127, new byte[]{-123, -121, -115, -116, -125, -118, -118, -103, -124, -121, -111, -111, -126, -112, -121, -113, -105, -104}, objArr15);
                    DetectionInfoBean.class.getField((java.lang.String) objArr15[0]).setBoolean(objInvoke2, true);
                    int i10 = AYXKKw + 25;
                    valueOf = i10 % 128;
                    if (i10 % 2 == 0) {
                        byte b2 = bArr[6];
                        java.lang.Object[] objArr16 = new java.lang.Object[1];
                        c(b2, bArr[13], b2, objArr16);
                        java.lang.reflect.Method method8 = C44103sDl.ActionBar.class.getMethod((java.lang.String) objArr16[0], null);
                        method8.setAccessible(false);
                        java.lang.Object objInvoke3 = method8.invoke(obj, null);
                        java.lang.Long lValueOf = java.lang.Long.valueOf(j3);
                        java.lang.Object[] objArr17 = new java.lang.Object[1];
                        b(null, null, 32, new byte[]{-119, -101, -107, -102, -111, -126, -112, -121, -123}, objArr17);
                        DetectionInfoBean.class.getField((java.lang.String) objArr17[0]).set(objInvoke3, lValueOf);
                    } else {
                        byte b3 = bArr[6];
                        java.lang.Object[] objArr18 = new java.lang.Object[1];
                        c(b3, bArr[13], b3, objArr18);
                        java.lang.reflect.Method method9 = C44103sDl.ActionBar.class.getMethod((java.lang.String) objArr18[0], null);
                        method9.setAccessible(true);
                        java.lang.Object objInvoke4 = method9.invoke(obj, null);
                        java.lang.Long lValueOf2 = java.lang.Long.valueOf(j3);
                        java.lang.Object[] objArr19 = new java.lang.Object[1];
                        b(null, null, 127, new byte[]{-119, -101, -107, -102, -111, -126, -112, -121, -123}, objArr19);
                        DetectionInfoBean.class.getField((java.lang.String) objArr19[0]).set(objInvoke4, lValueOf2);
                    }
                    byte b4 = bArr[13];
                    java.lang.Object[] objArr20 = new java.lang.Object[1];
                    c(b4, bArr[6], b4, objArr20);
                    java.lang.reflect.Method method10 = C44103sDl.ActionBar.class.getMethod((java.lang.String) objArr20[0], null);
                    method10.setAccessible(true);
                    method10.invoke(obj, null);
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
        }).observe(this, new C32991mny(new Function1() { // from class: o.sto
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC45628std.AEQbTJ(this.EZpvd, (FeedbackSubmitViewModel.ActionBar) obj);
            }
        }));
        Transformations.map(EZpvd().AEQbTJ(), new Function1() { // from class: o.stA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC45628std.AEQbTJ((C45618stT.TaskDescription) obj);
            }
        }).observe(this, new C32991mny(new Function1() { // from class: o.stx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC45628std.KWHzl(this.OLrzqt, (C45618stT.TaskDescription) obj);
            }
        }));
        AbstractC47323tnq abstractC47323tnq2 = this.valueOf;
        AbstractC47323tnq abstractC47323tnq3 = null;
        if (abstractC47323tnq2 == null) {
            Intrinsics.gEmmrt("");
            abstractC47323tnq2 = null;
        }
        C33537myN c33537myN = abstractC47323tnq2.AEQbTJ;
        if (c33537myN != null) {
            c33537myN.setBackListener(new View.OnClickListener() { // from class: o.stB
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    ActivityC45628std.copydefault(this.AEQbTJ, view);
                }
            });
        }
        EZpvd().AYXKKw().observe(this, new LoaderManager(new Function1() { // from class: o.sty
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC45628std.isConnected(this.EZpvd, (java.util.List) obj);
            }
        }));
        AbstractC47323tnq abstractC47323tnq4 = this.valueOf;
        if (abstractC47323tnq4 == null) {
            Intrinsics.gEmmrt("");
            abstractC47323tnq4 = null;
        }
        C55018xby c55018xby3 = abstractC47323tnq4.fJNWhG;
        if (c55018xby3 != null && (c55009xbpFIwbmz2 = c55018xby3.fIwbmz()) != null) {
            c55009xbpFIwbmz2.setOnClickListener(new ActionBar(c55009xbpFIwbmz2, 1000L, this));
        }
        AbstractC47323tnq abstractC47323tnq5 = this.valueOf;
        if (abstractC47323tnq5 == null) {
            Intrinsics.gEmmrt("");
            abstractC47323tnq5 = null;
        }
        C55018xby c55018xby4 = abstractC47323tnq5.ejfBZ;
        if (c55018xby4 != null && (c55009xbpFIwbmz = c55018xby4.fIwbmz()) != null) {
            c55009xbpFIwbmz.setOnClickListener(new StateListAnimator(c55009xbpFIwbmz, 1000L, this));
        }
        AbstractC47323tnq abstractC47323tnq6 = this.valueOf;
        if (abstractC47323tnq6 == null) {
            Intrinsics.gEmmrt("");
            abstractC47323tnq6 = null;
        }
        android.widget.LinearLayout linearLayout = abstractC47323tnq6.copydefault;
        if (linearLayout != null) {
            linearLayout.setOnClickListener(new Application(linearLayout, 1000L, this));
        }
        AbstractC47323tnq abstractC47323tnq7 = this.valueOf;
        if (abstractC47323tnq7 == null) {
            Intrinsics.gEmmrt("");
            abstractC47323tnq7 = null;
        }
        wYK wyk = abstractC47323tnq7.OLrzqt;
        if (wyk != null) {
            wyk.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: o.stz
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z) {
                    ActivityC45628std.EZpvd(this.EZpvd, compoundButton, z);
                }
            });
        }
        AbstractC47323tnq abstractC47323tnq8 = this.valueOf;
        if (abstractC47323tnq8 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC47323tnq3 = abstractC47323tnq8;
        }
        C52794wYp c52794wYp = abstractC47323tnq3.fIwbmz;
        if (c52794wYp != null) {
            c52794wYp.setOnClickListener(new Fragment(c52794wYp, 1000L, this));
        }
        EZpvd().copydefault().observe(this, new LoaderManager(new Function1() { // from class: o.stC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC45628std.fetchVPNInfo(this.AEQbTJ, (java.util.List) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: o.std$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ ActivityC45628std OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, ActivityC45628std activityC45628std) {
            this.copydefault = view;
            this.AEQbTJ = j;
            this.OLrzqt = activityC45628std;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.AEQbTJ || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                if (this.OLrzqt.AkhnZx()) {
                    TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
                    C32866mlf.onEvent$default("app_support_feedback_main_category_click", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1) null, 2, (java.lang.Object) null);
                } else {
                    TrackChannel[] trackChannelArrCopydefault2 = C32868mlh.OLrzqt.copydefault();
                    C32866mlf.onEvent$default("app_support_security_bug_main_category_category_click", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault2, trackChannelArrCopydefault2.length), (Function1) null, 2, (java.lang.Object) null);
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.std$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ ActivityC45628std copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, ActivityC45628std activityC45628std) {
            this.AEQbTJ = view;
            this.OLrzqt = j;
            this.copydefault = activityC45628std;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.OLrzqt || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                if (this.copydefault.EZpvd().isConnected()) {
                    return;
                }
                this.copydefault.AYXKKw();
            }
        }
    }

    /* JADX INFO: renamed from: o.std$Fragment */
    public static final class Fragment implements View.OnClickListener {
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ ActivityC45628std copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Fragment(android.view.View view, long j, ActivityC45628std activityC45628std) {
            this.EZpvd = view;
            this.KWHzl = j;
            this.copydefault = activityC45628std;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.KWHzl || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                this.copydefault.EZpvd().fARcdN();
            }
        }
    }

    /* JADX INFO: renamed from: o.std$PendingIntent */
    public static final class PendingIntent implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ int EZpvd;
        public final /* synthetic */ ActivityC45628std KWHzl;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public PendingIntent(android.view.View view, long j, ActivityC45628std activityC45628std, int i) {
            this.AEQbTJ = view;
            this.copydefault = j;
            this.KWHzl = activityC45628std;
            this.EZpvd = i;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.copydefault || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.KWHzl.EZpvd().copydefault(this.EZpvd);
            }
        }
    }

    /* JADX INFO: renamed from: o.std$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ ActivityC45628std EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, ActivityC45628std activityC45628std) {
            this.KWHzl = view;
            this.copydefault = j;
            this.EZpvd = activityC45628std;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.copydefault || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                if (this.EZpvd.AkhnZx()) {
                    TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
                    C32866mlf.onEvent$default("app_support_feedback_sub_category_click", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1) null, 2, (java.lang.Object) null);
                } else {
                    TrackChannel[] trackChannelArrCopydefault2 = C32868mlh.OLrzqt.copydefault();
                    C32866mlf.onEvent$default("app_support_security_bug_sub_category_click", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault2, trackChannelArrCopydefault2.length), (Function1) null, 2, (java.lang.Object) null);
                }
            }
        }
    }

    public static final C32989mnw OLrzqt(MainCategory mainCategory) {
        return new C32989mnw(mainCategory);
    }

    public static final Unit EZpvd(AbstractC47323tnq abstractC47323tnq, ActivityC45628std activityC45628std, MainCategory mainCategory) {
        C55018xby c55018xby = abstractC47323tnq.fJNWhG;
        java.lang.String name = mainCategory != null ? mainCategory.getName() : null;
        if (name == null) {
            name = "";
        }
        c55018xby.setText(name);
        c55018xby.setBottomSheet(activityC45628std.KWHzl());
        abstractC47323tnq.ejfBZ.setBottomSheet(activityC45628std.OLrzqt());
        return Unit.INSTANCE;
    }

    public static final C32989mnw AEQbTJ(ChildCategory childCategory) {
        return new C32989mnw(childCategory);
    }

    public static final Unit KWHzl(AbstractC47323tnq abstractC47323tnq, ActivityC45628std activityC45628std, ChildCategory childCategory) {
        C55018xby c55018xby = abstractC47323tnq.ejfBZ;
        java.lang.String name = childCategory != null ? childCategory.getName() : null;
        if (name == null) {
            name = "";
        }
        c55018xby.setText(name);
        c55018xby.setBottomSheet(activityC45628std.OLrzqt());
        return Unit.INSTANCE;
    }

    public static final java.lang.Integer copydefault(java.util.List list) {
        return java.lang.Integer.valueOf((list == null || list.isEmpty()) ? C47315tni.Application.copydefault : C47315tni.Application.gEmmrt);
    }

    public static final java.lang.CharSequence gEmmrt(ActivityC45628std activityC45628std, java.util.List list) {
        if (!activityC45628std.EZpvd().isConnected()) {
            return (list == null || list.isEmpty()) ? activityC45628std.copydefault(false) : activityC45628std.copydefault(true);
        }
        java.lang.String string = activityC45628std.getString(C47315tni.PendingIntent.AuCTelauCTel);
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public static final java.lang.String AYXKKw(ActivityC45628std activityC45628std, java.util.List list) {
        return C33069mpW.KWHzl(activityC45628std, C47315tni.PendingIntent.getLabel, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt(DataInputModuleModel.DataInputItem.INPUT_TYPE_NUMBER, java.lang.String.valueOf(list != null ? list.size() : 0))));
    }

    public static final java.lang.Boolean KWHzl(java.util.List list) {
        return java.lang.Boolean.valueOf(!(list == null || list.isEmpty()));
    }

    public static final java.lang.Boolean OLrzqt(FeedbackSubmitViewModel.TaskDescription taskDescription) {
        Intrinsics.checkNotNullParameter(taskDescription, "");
        return java.lang.Boolean.valueOf(taskDescription instanceof FeedbackSubmitViewModel.TaskDescription.Activity);
    }

    public static final Unit AEQbTJ(ActivityC45628std activityC45628std, java.lang.Boolean bool) {
        if (bool.booleanValue()) {
            activityC45628std.showLoading();
        } else {
            activityC45628std.dismissLoading();
        }
        return Unit.INSTANCE;
    }

    public static final C32989mnw copydefault(FeedbackSubmitViewModel.ActionBar actionBar) {
        Intrinsics.checkNotNullParameter(actionBar, "");
        return new C32989mnw(actionBar);
    }

    public static final Unit AEQbTJ(ActivityC45628std activityC45628std, FeedbackSubmitViewModel.ActionBar actionBar) {
        Intrinsics.checkNotNullParameter(actionBar, "");
        if (actionBar instanceof FeedbackSubmitViewModel.ActionBar.StateListAnimator) {
            C55328xhq.show$default(C55328xhq.OLrzqt, C45358soL.serverErrorMessageOrDefault$default(((FeedbackSubmitViewModel.ActionBar.StateListAnimator) actionBar).OLrzqt(), null, 1, null), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 62, (java.lang.Object) null);
        } else if (Intrinsics.EZpvd(actionBar, FeedbackSubmitViewModel.ActionBar.C0549ActionBar.AEQbTJ)) {
            C55328xhq.show$default(C55328xhq.OLrzqt, activityC45628std.getString(C47315tni.PendingIntent.wlaJM), ContextCompat.getDrawable(activityC45628std, C52761wXj.TaskDescription.dPkBzA), 0, (java.lang.Integer) null, 0, 0, 60, (java.lang.Object) null);
        } else {
            if (!Intrinsics.EZpvd(actionBar, FeedbackSubmitViewModel.ActionBar.Activity.EZpvd)) {
                throw new NoWhenBranchMatchedException();
            }
            Unit unit = Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }

    public static final C32989mnw AEQbTJ(C45618stT.TaskDescription taskDescription) {
        Intrinsics.checkNotNullParameter(taskDescription, "");
        return new C32989mnw(taskDescription);
    }

    public static final Unit KWHzl(ActivityC45628std activityC45628std, C45618stT.TaskDescription taskDescription) {
        Intrinsics.checkNotNullParameter(taskDescription, "");
        if (taskDescription instanceof C45618stT.TaskDescription.StateListAnimator) {
            C55328xhq.show$default(C55328xhq.OLrzqt, C45358soL.serverErrorMessageOrDefault$default(((C45618stT.TaskDescription.StateListAnimator) taskDescription).AEQbTJ(), null, 1, null), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 62, (java.lang.Object) null);
            activityC45628std.OLrzqt(activityC45628std.AkhnZx() ? "app_support_feedback_submit_button_click" : "app_support_security_bug_submit_button_click", false);
        } else {
            if (!Intrinsics.EZpvd(taskDescription, C45618stT.TaskDescription.Application.copydefault)) {
                throw new NoWhenBranchMatchedException();
            }
            activityC45628std.startActivity(ActivityC45549ssD.Companion.AEQbTJ(activityC45628std, java.lang.Boolean.valueOf(activityC45628std.isConnected()), java.lang.Boolean.TRUE, null, java.lang.Integer.valueOf(!activityC45628std.AkhnZx() ? 1 : 0)));
            activityC45628std.finish();
            activityC45628std.OLrzqt(activityC45628std.AkhnZx() ? "app_support_feedback_submit_button_click" : "app_support_security_bug_submit_button_click", true);
        }
        return Unit.INSTANCE;
    }

    public static final void copydefault(ActivityC45628std activityC45628std, android.view.View view) {
        activityC45628std.finish();
        activityC45628std.AEQbTJ();
    }

    public static final Unit isConnected(ActivityC45628std activityC45628std, java.util.List list) {
        AbstractC47323tnq abstractC47323tnq = activityC45628std.valueOf;
        if (abstractC47323tnq == null) {
            Intrinsics.gEmmrt("");
            abstractC47323tnq = null;
        }
        C55018xby c55018xby = abstractC47323tnq.fJNWhG;
        if (c55018xby != null) {
            boolean z = list.size() == 1;
            c55018xby.setClickable(!z);
            if (z) {
                c55018xby.setState(3);
            } else {
                c55018xby.setState(0);
                c55018xby.fIwbmz();
            }
        }
        rVN.reportFullyDrawn$default((android.app.Activity) activityC45628std, true, (java.lang.String) null, 2, (java.lang.Object) null);
        return Unit.INSTANCE;
    }

    public static final void EZpvd(ActivityC45628std activityC45628std, android.widget.CompoundButton compoundButton, boolean z) {
        activityC45628std.EZpvd().fIwbmz();
    }

    public static final Unit fetchVPNInfo(ActivityC45628std activityC45628std, java.util.List list) {
        AbstractC47323tnq abstractC47323tnq = activityC45628std.valueOf;
        if (abstractC47323tnq == null) {
            Intrinsics.gEmmrt("");
            abstractC47323tnq = null;
        }
        android.widget.LinearLayout linearLayout = abstractC47323tnq.EZpvd;
        if (linearLayout != null) {
            linearLayout.removeAllViews();
            if (list != null) {
                int i = 0;
                for (java.lang.Object obj : list) {
                    if (i < 0) {
                        yDY.AYXKKw();
                    }
                    FeedbackSubmitViewModel.Application application = (FeedbackSubmitViewModel.Application) obj;
                    AbstractC47485tqt abstractC47485tqtOLrzqt = AbstractC47485tqt.OLrzqt(android.view.LayoutInflater.from(linearLayout.getContext()));
                    abstractC47485tqtOLrzqt.AEQbTJ(application.KWHzl());
                    abstractC47485tqtOLrzqt.OLrzqt(activityC45628std.OLrzqt(application.EZpvd()));
                    abstractC47485tqtOLrzqt.KWHzl(application.AEQbTJ());
                    android.widget.ImageView imageView = abstractC47485tqtOLrzqt.EZpvd;
                    imageView.setOnClickListener(new PendingIntent(imageView, 1000L, activityC45628std, i));
                    linearLayout.addView(abstractC47485tqtOLrzqt.getRoot());
                    i++;
                }
            }
        }
        return Unit.INSTANCE;
    }

    public final java.lang.String OLrzqt(long j) {
        if (j < 1024) {
            return j + "B";
        }
        long j2 = 1024;
        long j3 = j / j2;
        if (j3 < 1024) {
            return j3 + "KB";
        }
        return (j3 / j2) + "M";
    }

    public final java.lang.CharSequence copydefault(boolean z) {
        java.lang.String str;
        if (z) {
            str = getString(C47315tni.PendingIntent.AuCTelauCTel) + "\n";
        } else {
            str = "";
        }
        int i = C47315tni.PendingIntent.htlTjW;
        java.lang.Integer value = EZpvd().gEmmrt().getValue();
        java.lang.String strKWHzl = C33069mpW.KWHzl(this, i, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("maxFileCount", java.lang.Integer.valueOf(value != null ? value.intValue() : 0))));
        int i2 = C47315tni.PendingIntent.igXuih;
        java.lang.Integer value2 = EZpvd().valueOf().getValue();
        return C33574myy.setupSpanStyles$default(str + strKWHzl + " " + C33069mpW.KWHzl(this, i2, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("maxFileSize", java.lang.Integer.valueOf(value2 != null ? value2.intValue() : 0)))), new java.lang.String[]{strKWHzl}, 0, null, false, new Function1() { // from class: o.stn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC45628std.AhwBna(this.KWHzl, (java.util.List) obj);
            }
        }, 14, null);
    }

    public static final Unit AhwBna(ActivityC45628std activityC45628std, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        list.add(new android.text.style.TextAppearanceSpan(activityC45628std, C32113mPz.Dialog.gEmmrt));
        return Unit.INSTANCE;
    }

    public final void OLrzqt(java.lang.String str, final boolean z) {
        TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
        C32866mlf.EZpvd(str, (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.stq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC45628std.KWHzl(z, (EventParamsList) obj);
            }
        });
    }

    public static final Unit KWHzl(boolean z, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("status", z ? "success" : "fail ", true);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.moV.createBottomMenuDialog$default(o.moV, android.app.Activity, java.util.List, java.lang.CharSequence, java.lang.CharSequence, boolean, o.moS$PendingIntent, o.moS$StateListAnimator, int, java.lang.Object):o.moS */
    public final void AYXKKw() {
        C33015moV.AEQbTJ.AEQbTJ(this, yDY.copydefault(getString(C47315tni.PendingIntent.DTg), getString(C47315tni.PendingIntent.DGUQLIOvDItG)), (20 & 4) != 0 ? null : null, (20 & 8) != 0 ? null : getString(C47315tni.PendingIntent.zKcAg), (20 & 16) != 0 ? false : false, (20 & 32) != 0 ? new C33012moS.Dialog() : new FragmentManager(), (20 & 64) != 0 ? new C33012moS.Fragment() : new Dialog()).show(getSupportFragmentManager(), ActivityC45628std.class.getSimpleName());
    }

    /* JADX INFO: renamed from: o.std$FragmentManager */
    public static final class FragmentManager implements C33012moS.PendingIntent {
        @Override // o.C33012moS.PendingIntent
        public boolean AEQbTJ() {
            return true;
        }

        @Override // o.C33012moS.PendingIntent
        public boolean OLrzqt() {
            return true;
        }

        public FragmentManager() {
        }

        @Override // o.C33012moS.PendingIntent
        public boolean OLrzqt(android.view.View view, int i, java.lang.Object obj) {
            Intrinsics.checkNotNullParameter(view, "");
            Intrinsics.checkNotNullParameter(obj, "");
            if (i == 0) {
                ActivityC45628std.this.AEQbTJ(true, C45617stS.copydefault.KWHzl());
            } else {
                ActivityC45628std.this.AEQbTJ(false, C45617stS.copydefault.AEQbTJ());
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: o.std$Dialog */
    public static final class Dialog implements C33012moS.StateListAnimator {
        @Override // o.C33012moS.StateListAnimator
        public void copydefault(android.widget.TextView textView, int i, java.lang.Object obj) {
            Intrinsics.checkNotNullParameter(textView, "");
            Intrinsics.checkNotNullParameter(obj, "");
            textView.setText(obj.toString());
            textView.setGravity(17);
            android.content.Context context = textView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            textView.setHeight(C55298xhM.copydefault(50.0f, context));
        }
    }

    public final void AEQbTJ(boolean z, java.lang.String[] strArr) {
        getPermissionHelper().copydefault(this, 1, new TaskDescription(z, this, strArr));
    }

    /* JADX INFO: renamed from: o.std$TaskDescription */
    public static final class TaskDescription implements C33625mzw.Activity {
        public final /* synthetic */ java.lang.String[] AEQbTJ;
        public final /* synthetic */ boolean KWHzl;
        public final /* synthetic */ ActivityC45628std copydefault;

        @Override // o.C33625mzw.Activity
        public void EZpvd(java.util.List<java.lang.String> list) {
        }

        public TaskDescription(boolean z, ActivityC45628std activityC45628std, java.lang.String[] strArr) {
            this.KWHzl = z;
            this.copydefault = activityC45628std;
            this.AEQbTJ = strArr;
        }

        @Override // o.C33625mzw.Activity
        public void EZpvd() {
            if (this.KWHzl) {
                this.copydefault.OLrzqt(this.AEQbTJ);
            } else {
                this.copydefault.copydefault(this.AEQbTJ);
            }
        }
    }

    public final void OLrzqt(java.lang.String[] strArr) {
        android.content.Intent intent = new android.content.Intent("android.intent.action.PICK");
        intent.setType("*/*");
        intent.putExtra("android.intent.extra.MIME_TYPES", strArr);
        intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", false);
        this.OLrzqt.launch(intent);
    }

    public final void copydefault(java.lang.String[] strArr) {
        android.content.Intent intent = new android.content.Intent("android.intent.action.OPEN_DOCUMENT");
        intent.setType("*/*");
        intent.addCategory("android.intent.category.OPENABLE");
        intent.putExtra("android.intent.extra.MIME_TYPES", strArr);
        intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", false);
        intent.putExtra("android.content.extra.SHOW_ADVANCED", true);
        this.AEQbTJ.launch(intent);
    }

    public final C45614stP KWHzl() {
        java.util.List<java.lang.String> listAhwBna;
        java.util.List<MainCategory> value = EZpvd().AYXKKw().getValue();
        if (value == null) {
            listAhwBna = yDY.AhwBna();
        } else {
            listAhwBna = new java.util.ArrayList<>(C56403yEb.AYXKKw(value, 10));
            java.util.Iterator<T> it = value.iterator();
            while (it.hasNext()) {
                listAhwBna.add(((MainCategory) it.next()).getName());
            }
        }
        java.lang.String string = getString(C47315tni.PendingIntent.akftKQ);
        Intrinsics.checkNotNullExpressionValue(string, "");
        AbstractC47323tnq abstractC47323tnq = this.valueOf;
        if (abstractC47323tnq == null) {
            Intrinsics.gEmmrt("");
            abstractC47323tnq = null;
        }
        C55018xby c55018xby = abstractC47323tnq.fJNWhG;
        Intrinsics.checkNotNullExpressionValue(c55018xby, "");
        return EZpvd(string, c55018xby, listAhwBna, "main_category");
    }

    public final C45614stP OLrzqt() {
        java.util.List<java.lang.String> listAhwBna;
        java.util.ArrayList<ChildCategory> childrenList;
        MainCategory value = EZpvd().AhwBna().getValue();
        if (value == null || (childrenList = value.getChildrenList()) == null) {
            listAhwBna = yDY.AhwBna();
        } else {
            listAhwBna = new java.util.ArrayList<>(C56403yEb.AYXKKw(childrenList, 10));
            java.util.Iterator<T> it = childrenList.iterator();
            while (it.hasNext()) {
                listAhwBna.add(((ChildCategory) it.next()).getName());
            }
        }
        java.lang.String string = getString(C47315tni.PendingIntent.UscePu);
        Intrinsics.checkNotNullExpressionValue(string, "");
        AbstractC47323tnq abstractC47323tnq = this.valueOf;
        if (abstractC47323tnq == null) {
            Intrinsics.gEmmrt("");
            abstractC47323tnq = null;
        }
        C55018xby c55018xby = abstractC47323tnq.ejfBZ;
        Intrinsics.checkNotNullExpressionValue(c55018xby, "");
        return EZpvd(string, c55018xby, listAhwBna, "child_category");
    }

    public final C45614stP EZpvd(java.lang.String str, C55018xby c55018xby, java.util.List<java.lang.String> list, java.lang.String str2) {
        C45614stP c45614stP = new C45614stP();
        kotlin.Pair[] pairArr = new kotlin.Pair[4];
        pairArr[0] = C56390yDp.OLrzqt("list", new java.util.ArrayList(list));
        C55001xbh c55001xbhAkhnZx = c55018xby.AkhnZx();
        pairArr[1] = C56390yDp.OLrzqt("current", java.lang.String.valueOf(c55001xbhAkhnZx != null ? c55001xbhAkhnZx.getText() : null));
        pairArr[2] = C56390yDp.OLrzqt("title", str);
        pairArr[3] = C56390yDp.OLrzqt("tag", str2);
        c45614stP.setArguments(BundleKt.bundleOf(pairArr));
        return c45614stP;
    }

    @Override // o.C45614stP.TaskDescription
    public void copydefault(int i, @NotNull java.lang.String str, java.lang.String str2) {
        MainCategory value;
        java.util.ArrayList<ChildCategory> childrenList;
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.Object obj = null;
        if (Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) "main_category")) {
            java.util.List<MainCategory> value2 = EZpvd().AYXKKw().getValue();
            if (value2 != null) {
                java.util.Iterator<T> it = value2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    java.lang.Object next = it.next();
                    if (Intrinsics.EZpvd((java.lang.Object) ((MainCategory) next).getName(), (java.lang.Object) str)) {
                        obj = next;
                        break;
                    }
                }
                MainCategory mainCategory = (MainCategory) obj;
                if (mainCategory != null) {
                    EZpvd().OLrzqt(java.lang.Integer.valueOf(mainCategory.getId()));
                    return;
                }
                return;
            }
            return;
        }
        if (!Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) "child_category") || (value = EZpvd().AhwBna().getValue()) == null || (childrenList = value.getChildrenList()) == null) {
            return;
        }
        java.util.Iterator<T> it2 = childrenList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            java.lang.Object next2 = it2.next();
            if (Intrinsics.EZpvd((java.lang.Object) ((ChildCategory) next2).getName(), (java.lang.Object) str)) {
                obj = next2;
                break;
            }
        }
        ChildCategory childCategory = (ChildCategory) obj;
        if (childCategory != null) {
            EZpvd().EZpvd(java.lang.Integer.valueOf(childCategory.getId()));
        }
    }

    @Override // o.AbstractActivityC45608stJ, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC45608stJ, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC45608stJ, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.AbstractActivityC45608stJ, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
