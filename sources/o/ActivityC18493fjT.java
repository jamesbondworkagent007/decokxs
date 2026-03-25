package o;

import android.view.View;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.google.common.base.Ascii;
import com.okinc.base.bugreport.DetectionInfoBean;
import com.okinc.business.defi.biz.constant.WalletType;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import com.okinc.business.defi.biz.net.bean.CheckMpcStatusResponse;
import com.okinc.business.defi.biz.net.bean.MpcStatus;
import com.okinc.business.defi.wallet.mine.bean.BatchCreateRootWalletInformationBean;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParam;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.p2p.api.OtcExtraKeys;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import me.relex.circleindicator.BuildConfig;
import o.C10604brb;
import o.C13754dXa;
import o.C14638dpI;
import o.C44103sDl;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fjT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class ActivityC18493fjT extends AbstractActivityC33013moT implements android.text.TextWatcher, C14638dpI.Application {
    public AbstractC16330ehr EZpvd;
    public final InterfaceC56387yDm KWHzl;
    public C14638dpI OLrzqt;
    public AbstractC16883esN copydefault;
    public static final Application Companion = new Application(null);
    public static final int AEQbTJ = 8;

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
    }

    public ActivityC18493fjT() {
        final Function0 function0 = null;
        this.KWHzl = new ViewModelLazy(C56524yIo.AEQbTJ(C19304fyk.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.defi.wallet.mine.DefiWalletBatchCreateAccountActivity$special$$inlined$viewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.defi.wallet.mine.DefiWalletBatchCreateAccountActivity$special$$inlined$viewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.defi.wallet.mine.DefiWalletBatchCreateAccountActivity$special$$inlined$viewModels$default$3
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

    public final C19304fyk AEQbTJ() {
        return (C19304fyk) this.KWHzl.getValue();
    }

    /* JADX INFO: renamed from: o.fjT$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.fjT.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final void OLrzqt(@NotNull android.content.Context context, @NotNull java.lang.String str, @NotNull java.lang.String str2, int i, @NotNull java.lang.String str3) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) ActivityC18493fjT.class);
            intent.putExtra("root_wallet_id", str);
            intent.putExtra("walletName", str2);
            intent.putExtra("walletType", i);
            intent.putExtra("from", str3);
            context.startActivity(intent);
        }
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.EZpvd = (AbstractC16330ehr) DataBindingUtil.setContentView(this, C13754dXa.TaskDescription.wlaJM);
        C33516mxt.EZpvd(this);
        valueOf();
        gEmmrt();
        C14638dpI c14638dpI = new C14638dpI(this);
        this.OLrzqt = c14638dpI;
        c14638dpI.copydefault(this);
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        AEQbTJ().AEQbTJ();
    }

    private final void valueOf() {
        java.lang.String stringExtra = getIntent().getStringExtra("root_wallet_id");
        if (stringExtra == null) {
            stringExtra = "";
        }
        java.lang.String stringExtra2 = getIntent().getStringExtra("walletName");
        if (stringExtra2 == null) {
            stringExtra2 = "";
        }
        int intExtra = getIntent().getIntExtra("walletType", 0);
        java.lang.String stringExtra3 = getIntent().getStringExtra("from");
        AEQbTJ().AEQbTJ(stringExtra, stringExtra2, intExtra, stringExtra3 != null ? stringExtra3 : "");
    }

    private final void gEmmrt() {
        C52794wYp c52794wYp;
        C55008xbo c55008xbo;
        C55008xbo c55008xbo2;
        C55008xbo c55008xbo3;
        AbstractC16330ehr abstractC16330ehr = this.EZpvd;
        if (abstractC16330ehr != null && (c55008xbo3 = abstractC16330ehr.djBIcL) != null) {
            c55008xbo3.setState(0);
            c55008xbo3.setText(AEQbTJ().AhwBna());
            C55001xbh c55001xbhAkhnZx = c55008xbo3.AkhnZx();
            if (c55001xbhAkhnZx != null) {
                c55001xbhAkhnZx.setEnabled(false);
                c55001xbhAkhnZx.setFocusable(false);
                c55001xbhAkhnZx.setFocusableInTouchMode(false);
            }
            C55009xbp c55009xbpFIwbmz = c55008xbo3.fIwbmz();
            if (c55009xbpFIwbmz != null) {
                C55009xbp.replaceFunctionDrawable$default(c55009xbpFIwbmz, C52761wXj.TaskDescription.DcMfJKsuEgdN, 0, 0, 0, 14, null);
            }
            C55009xbp c55009xbpFIwbmz2 = c55008xbo3.fIwbmz();
            if (c55009xbpFIwbmz2 != null) {
                c55009xbpFIwbmz2.setInterceptEvent(true);
            }
            C55009xbp c55009xbpFIwbmz3 = c55008xbo3.fIwbmz();
            if (c55009xbpFIwbmz3 != null) {
                c55009xbpFIwbmz3.setOnClickListener(new TaskDescription(c55009xbpFIwbmz3, 1000L, this));
            }
        }
        AbstractC16330ehr abstractC16330ehr2 = this.EZpvd;
        if (abstractC16330ehr2 != null && (c55008xbo2 = abstractC16330ehr2.EZpvd) != null) {
            c55008xbo2.setState(0);
            c55008xbo2.setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.RAaltf));
            C55001xbh c55001xbhAkhnZx2 = c55008xbo2.AkhnZx();
            if (c55001xbhAkhnZx2 != null) {
                c55001xbhAkhnZx2.setEnabled(false);
                c55001xbhAkhnZx2.setFocusable(false);
                c55001xbhAkhnZx2.setFocusableInTouchMode(false);
            }
            C55009xbp c55009xbpFIwbmz4 = c55008xbo2.fIwbmz();
            if (c55009xbpFIwbmz4 != null) {
                c55009xbpFIwbmz4.setInterceptEvent(true);
            }
            C55009xbp c55009xbpFIwbmz5 = c55008xbo2.fIwbmz();
            if (c55009xbpFIwbmz5 != null) {
                c55009xbpFIwbmz5.setOnClickListener(new PendingIntent(c55009xbpFIwbmz5, 1000L));
            }
        }
        AbstractC16330ehr abstractC16330ehr3 = this.EZpvd;
        if (abstractC16330ehr3 != null && (c55008xbo = abstractC16330ehr3.copydefault) != null) {
            c55008xbo.setState(0);
            c55008xbo.setText("1");
            C55001xbh c55001xbhAkhnZx3 = c55008xbo.AkhnZx();
            if (c55001xbhAkhnZx3 != null) {
                c55001xbhAkhnZx3.setInputType(2);
                c55001xbhAkhnZx3.setMaxInputLength(12);
                c55001xbhAkhnZx3.addTextChangedListener(this);
            }
            C55009xbp c55009xbpFIwbmz6 = c55008xbo.fIwbmz();
            if (c55009xbpFIwbmz6 != null) {
                c55009xbpFIwbmz6.EZpvd(copydefault());
            }
        }
        AbstractC16330ehr abstractC16330ehr4 = this.EZpvd;
        if (abstractC16330ehr4 != null && (c52794wYp = abstractC16330ehr4.KWHzl) != null) {
            c52794wYp.setOnClickListener(new StateListAnimator(c52794wYp, 1000L, this));
        }
        AEQbTJ().KWHzl().observe(this, new FragmentManager(new Function1() { // from class: o.fjY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC18493fjT.OLrzqt(this.OLrzqt, (java.lang.Integer) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: o.fjT$FragmentManager */
    public static final /* synthetic */ class FragmentManager implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 AEQbTJ;
        private static final byte[] $$c = {1, 37, -122, 42};
        private static final int $$d = WalletImportError.ERROR_CODE_AA_CREATE_KEY;
        private static int $10 = 0;
        private static int $11 = 1;
        private static final byte[] $$a = {Ascii.ESC, 95, 40, 70, -4, 7, -1, Ascii.GS, 7, 7, Ascii.CR, -12, 17, 0, Ascii.VT, -30, 0, 17, 5};
        private static final int $$b = 243;
        private static int valueOf = 0;
        private static int AYXKKw = 1;
        private static int EZpvd = 1694165108;
        private static char OLrzqt = 57175;
        private static char copydefault = 21273;
        private static char KWHzl = 27496;
        private static char djBIcL = 31650;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0029). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static java.lang.String $$e(short s, byte b, short s2) {
            int i;
            int i2;
            int i3 = 4 - (s * 4);
            int i4 = 119 - b;
            int i5 = 1 - (s2 * 4);
            byte[] bArr = $$c;
            byte[] bArr2 = new byte[i5];
            if (bArr == null) {
                int i6 = i3;
                int i7 = i5;
                i2 = 0;
                int i8 = (-i3) + i7;
                int i9 = i6 + 1;
                i = i2;
                i4 = i8;
                i3 = i9;
                i2 = i + 1;
                bArr2[i] = (byte) i4;
                if (i2 == i5) {
                    return new java.lang.String(bArr2, 0);
                }
                int i10 = i4;
                i6 = i3;
                i3 = bArr[i3];
                i7 = i10;
                int i82 = (-i3) + i7;
                int i92 = i6 + 1;
                i = i2;
                i4 = i82;
                i3 = i92;
                i2 = i + 1;
                bArr2[i] = (byte) i4;
                if (i2 == i5) {
                }
            } else {
                i = 0;
                i2 = i + 1;
                bArr2[i] = (byte) i4;
                if (i2 == i5) {
                }
            }
        }

        public FragmentManager(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.AEQbTJ = function1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x002e). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static void c(byte b, short s, byte b2, java.lang.Object[] objArr) {
            int i;
            int i2 = (b2 * 10) + 4;
            int i3 = s * 5;
            byte[] bArr = $$a;
            int i4 = 99 - (b * 20);
            byte[] bArr2 = new byte[11 - i3];
            int i5 = 10 - i3;
            if (bArr == null) {
                i4 = i5;
                int i6 = i2;
                int i7 = 0;
                i4 = i4 + (-i2) + 8;
                i2 = i6 + 1;
                i = i7;
                bArr2[i] = (byte) i4;
                i7 = i + 1;
                if (i == i5) {
                    objArr[0] = new java.lang.String(bArr2, 0);
                    return;
                }
                i6 = i2;
                i2 = bArr[i2];
                i4 = i4 + (-i2) + 8;
                i2 = i6 + 1;
                i = i7;
                bArr2[i] = (byte) i4;
                i7 = i + 1;
                if (i == i5) {
                }
            } else {
                i = 0;
                bArr2[i] = (byte) i4;
                i7 = i + 1;
                if (i == i5) {
                }
            }
        }

        public final boolean equals(java.lang.Object obj) {
            int i = 2 % 2;
            int i2 = valueOf;
            int i3 = i2 + 59;
            AYXKKw = i3 % 128;
            if (i3 % 2 == 0) {
                if (!(obj instanceof Observer)) {
                    return false;
                }
            } else if (!(obj instanceof Observer)) {
                return false;
            }
            int i4 = i2 + 37;
            int i5 = i4 % 128;
            AYXKKw = i5;
            int i6 = i4 % 2;
            if (!(obj instanceof InterfaceC56514yIe)) {
                return false;
            }
            int i7 = i5 + 63;
            valueOf = i7 % 128;
            int i8 = i7 % 2;
            boolean zEZpvd = Intrinsics.EZpvd(getFunctionDelegate(), ((InterfaceC56514yIe) obj).getFunctionDelegate());
            int i9 = AYXKKw + 73;
            valueOf = i9 % 128;
            int i10 = i9 % 2;
            return zEZpvd;
        }

        @Override // o.InterfaceC56514yIe
        public final InterfaceC56388yDn<?> getFunctionDelegate() {
            int i = 2 % 2;
            int i2 = valueOf + 75;
            AYXKKw = i2 % 128;
            if (i2 % 2 != 0) {
                return this.AEQbTJ;
            }
            throw null;
        }

        public final int hashCode() {
            int i = 2 % 2;
            int i2 = AYXKKw + 117;
            valueOf = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = getFunctionDelegate().hashCode();
            int i4 = AYXKKw + 33;
            valueOf = i4 % 128;
            int i5 = i4 % 2;
            return iHashCode;
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            int i = 2 % 2;
            int i2 = valueOf + 37;
            AYXKKw = i2 % 128;
            if (i2 % 2 == 0) {
                this.AEQbTJ.invoke(obj);
                int i3 = 32 / 0;
            } else {
                this.AEQbTJ.invoke(obj);
            }
            int i4 = valueOf + 43;
            AYXKKw = i4 % 128;
            int i5 = i4 % 2;
        }

        /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [111=4] */
        /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
        private static void b(char[] cArr, int i, java.lang.Object[] objArr) throws java.lang.Throwable {
            int i2;
            int i3 = 2 % 2;
            Zh zh = new Zh();
            char[] cArr2 = new char[cArr.length];
            zh.EZpvd = 0;
            char[] cArr3 = new char[2];
            while (zh.EZpvd < cArr.length) {
                int i4 = $10 + 13;
                $11 = i4 % 128;
                if (i4 % 2 == 0) {
                    cArr3[0] = cArr[zh.EZpvd];
                    cArr3[0] = cArr[zh.EZpvd << 1];
                    i2 = 1;
                } else {
                    cArr3[0] = cArr[zh.EZpvd];
                    cArr3[1] = cArr[zh.EZpvd + 1];
                    i2 = 0;
                }
                int i5 = 58224;
                while (i2 < 16) {
                    char c = cArr3[1];
                    char c2 = cArr3[0];
                    try {
                        java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(c), java.lang.Integer.valueOf((c2 + i5) ^ ((c2 << 4) + ((char) (((long) KWHzl) ^ 6538634990023091910L)))), java.lang.Integer.valueOf(c2 >>> 5), java.lang.Integer.valueOf(djBIcL)};
                        java.lang.Object objEZpvd = YY.EZpvd(-2045992360);
                        if (objEZpvd == null) {
                            byte b = $$c[0];
                            byte b2 = (byte) (b - 1);
                            byte b3 = b;
                            objEZpvd = YY.EZpvd(501, 5, (char) 0, -2111017180, false, $$e(b2, b3, (byte) (b3 - 1)), new java.lang.Class[]{java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE});
                        }
                        char cCharValue = ((java.lang.Character) ((java.lang.reflect.Method) objEZpvd).invoke(null, objArr2)).charValue();
                        cArr3[1] = cCharValue;
                        java.lang.Object[] objArr3 = {java.lang.Integer.valueOf(cArr3[0]), java.lang.Integer.valueOf((cCharValue + i5) ^ ((cCharValue << 4) + ((char) (((long) OLrzqt) ^ 6538634990023091910L)))), java.lang.Integer.valueOf(cCharValue >>> 5), java.lang.Integer.valueOf(copydefault)};
                        java.lang.Object objEZpvd2 = YY.EZpvd(-2045992360);
                        if (objEZpvd2 == null) {
                            byte b4 = $$c[0];
                            byte b5 = (byte) (b4 - 1);
                            byte b6 = b4;
                            objEZpvd2 = YY.EZpvd(501, 5, (char) 0, -2111017180, false, $$e(b5, b6, (byte) (b6 - 1)), new java.lang.Class[]{java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE});
                        }
                        cArr3[0] = ((java.lang.Character) ((java.lang.reflect.Method) objEZpvd2).invoke(null, objArr3)).charValue();
                        i5 -= 40503;
                        i2++;
                        int i6 = $10 + 31;
                        $11 = i6 % 128;
                        int i7 = i6 % 2;
                    } catch (java.lang.Throwable th) {
                        java.lang.Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                cArr2[zh.EZpvd] = cArr3[0];
                cArr2[zh.EZpvd + 1] = cArr3[1];
                java.lang.Object[] objArr4 = {zh, zh};
                java.lang.Object objEZpvd3 = YY.EZpvd(-549847163);
                if (objEZpvd3 == null) {
                    byte b7 = (byte) ($$c[0] - 1);
                    byte b8 = b7;
                    objEZpvd3 = YY.EZpvd(615, 5, (char) 1207, -619105543, false, $$e(b7, b8, b8), new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class});
                }
                ((java.lang.reflect.Method) objEZpvd3).invoke(null, objArr4);
            }
            objArr[0] = new java.lang.String(cArr2, 0, i);
        }

        /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [129=4] */
        /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
        private static void a(boolean z, int i, int i2, int i3, char[] cArr, java.lang.Object[] objArr) throws java.lang.Throwable {
            int i4 = 2 % 2;
            Zl zl = new Zl();
            char[] cArr2 = new char[i3];
            zl.OLrzqt = 0;
            while (zl.OLrzqt < i3) {
                int i5 = $10 + 65;
                $11 = i5 % 128;
                int i6 = i5 % 2;
                zl.KWHzl = cArr[zl.OLrzqt];
                cArr2[zl.OLrzqt] = (char) (i + zl.KWHzl);
                int i7 = zl.OLrzqt;
                try {
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr2[i7]), java.lang.Integer.valueOf(EZpvd)};
                    java.lang.Object objEZpvd = YY.EZpvd(1433686791);
                    if (objEZpvd == null) {
                        byte b = (byte) ($$c[0] - 1);
                        byte b2 = (byte) (b + 3);
                        objEZpvd = YY.EZpvd(625, 5, (char) 0, 1364500091, false, $$e(b, b2, (byte) (b2 - 3)), new java.lang.Class[]{java.lang.Integer.TYPE, java.lang.Integer.TYPE});
                    }
                    cArr2[i7] = ((java.lang.Character) ((java.lang.reflect.Method) objEZpvd).invoke(null, objArr2)).charValue();
                    java.lang.Object[] objArr3 = {zl, zl};
                    java.lang.Object objEZpvd2 = YY.EZpvd(654343494);
                    if (objEZpvd2 == null) {
                        byte[] bArr = $$c;
                        byte b3 = (byte) (bArr[0] - 1);
                        byte length = (byte) bArr.length;
                        objEZpvd2 = YY.EZpvd(625, 5, (char) 0, 589344826, false, $$e(b3, length, (byte) (length - 4)), new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class});
                    }
                    ((java.lang.reflect.Method) objEZpvd2).invoke(null, objArr3);
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            if (i2 > 0) {
                zl.AEQbTJ = i2;
                char[] cArr3 = new char[i3];
                java.lang.System.arraycopy(cArr2, 0, cArr3, 0, i3);
                java.lang.System.arraycopy(cArr3, 0, cArr2, i3 - zl.AEQbTJ, zl.AEQbTJ);
                java.lang.System.arraycopy(cArr3, zl.AEQbTJ, cArr2, 0, i3 - zl.AEQbTJ);
            }
            if (z) {
                int i8 = $10 + 109;
                $11 = i8 % 128;
                int i9 = i8 % 2;
                char[] cArr4 = new char[i3];
                zl.OLrzqt = 0;
                while (zl.OLrzqt < i3) {
                    int i10 = $11 + 17;
                    $10 = i10 % 128;
                    int i11 = i10 % 2;
                    cArr4[zl.OLrzqt] = cArr2[(i3 - zl.OLrzqt) - 1];
                    try {
                        java.lang.Object[] objArr4 = {zl, zl};
                        java.lang.Object objEZpvd3 = YY.EZpvd(654343494);
                        if (objEZpvd3 == null) {
                            byte[] bArr2 = $$c;
                            byte b4 = (byte) (bArr2[0] - 1);
                            byte length2 = (byte) bArr2.length;
                            objEZpvd3 = YY.EZpvd(625, 5, (char) 0, 589344826, false, $$e(b4, length2, (byte) (length2 - 4)), new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class});
                        }
                        ((java.lang.reflect.Method) objEZpvd3).invoke(null, objArr4);
                    } catch (java.lang.Throwable th2) {
                        java.lang.Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
                cArr2 = cArr4;
            }
            objArr[0] = new java.lang.String(cArr2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
        public static void copydefault(long j, long j2) throws java.lang.Throwable {
            java.lang.Object obj;
            int i = 2 % 2;
            long j3 = j ^ (j2 << 32);
            java.lang.Object[] objArr = new java.lang.Object[1];
            a(true, BuildConfig.VERSION_CODE, 5, 9, new char[]{65530, '\t', 6, '\b', 65500, 7, '\b', 2, 7}, objArr);
            java.lang.Object obj2 = C44103sDl.class.getField((java.lang.String) objArr[0]).get(null);
            try {
                java.lang.reflect.Constructor declaredConstructor = java.lang.StringBuilder.class.getDeclaredConstructor(null);
                declaredConstructor.setAccessible(true);
                java.lang.Object objNewInstance = declaredConstructor.newInstance(null);
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                a(false, 210, 18, 46, new char[]{6, 11, 4, 65521, 65534, '\n', '\r', 2, 15, 65504, 65534, '\t', '\t', 65535, 65534, 0, '\b', 65495, 65508, 18, 65534, 15, 1, 65519, 2, '\r', '\f', 15, 17, 65469, 0, 5, 2, 0, '\b', 65514, 2, '\n', '\f', 15, 22, 65520, 0, 65534, 11, 11}, objArr2);
                java.lang.String str = (java.lang.String) objArr2[0];
                int i2 = AYXKKw;
                int i3 = i2 + 83;
                valueOf = i3 % 128;
                int i4 = i3 % 2;
                int i5 = i2 + 53;
                valueOf = i5 % 128;
                if (i5 % 2 != 0) {
                    java.lang.Object[] objArr3 = new java.lang.Object[0];
                    objArr3[0] = str;
                    java.lang.Object[] objArr4 = new java.lang.Object[1];
                    b(new char[]{61969, 34133, 30682, 56528, 9812, 37339}, 97, objArr4);
                    java.lang.reflect.Method method = java.lang.StringBuilder.class.getMethod((java.lang.String) objArr4[0], java.lang.String.class);
                    method.setAccessible(false);
                    method.invoke(objNewInstance, objArr3);
                } else {
                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                    b(new char[]{61969, 34133, 30682, 56528, 9812, 37339}, 6, objArr5);
                    java.lang.reflect.Method method2 = java.lang.StringBuilder.class.getMethod((java.lang.String) objArr5[0], java.lang.String.class);
                    method2.setAccessible(true);
                    method2.invoke(objNewInstance, str);
                }
                java.lang.Object[] objArr6 = {java.lang.Long.valueOf(j3)};
                java.lang.Object[] objArr7 = new java.lang.Object[1];
                b(new char[]{61969, 34133, 30682, 56528, 9812, 37339}, 6, objArr7);
                java.lang.reflect.Method method3 = java.lang.StringBuilder.class.getMethod((java.lang.String) objArr7[0], java.lang.Long.TYPE);
                method3.setAccessible(true);
                method3.invoke(objNewInstance, objArr6);
                java.lang.Object[] objArr8 = new java.lang.Object[1];
                b(new char[]{9828, 56179, 31297, 9456, 58655, 24388, 56380, 14495, 1947, 13885, 18132, 6220, 51272, 59898, 48330, 52189, 36191, 11131, 64378, 50635, 10161, 65253}, 22, objArr8);
                java.lang.String str2 = (java.lang.String) objArr8[0];
                int i6 = AYXKKw + 31;
                valueOf = i6 % 128;
                int i7 = i6 % 2;
                java.lang.Object[] objArr9 = new java.lang.Object[1];
                b(new char[]{7277, 54877, 43318, 38081, 27696, 13459, 38323, 37771}, 8, objArr9);
                java.lang.reflect.Method method4 = java.lang.StringBuilder.class.getMethod((java.lang.String) objArr9[0], null);
                method4.setAccessible(true);
                java.lang.Object objInvoke = method4.invoke(objNewInstance, null);
                java.lang.Object[] objArr10 = new java.lang.Object[1];
                b(new char[]{47881, 60983, 35961, 23799}, 3, objArr10);
                java.lang.Object[] objArr11 = {objInvoke, (java.lang.String) objArr10[0]};
                java.lang.Object[] objArr12 = new java.lang.Object[1];
                a(true, 213, 21, 21, new char[]{'\f', 65535, 14, 65535, 7, 65531, '\f', 65531, 65514, 6, 6, 15, 65512, 14, '\t', 65512, 5, 65533, 65535, 2, 65533}, objArr12);
                java.lang.reflect.Method method5 = Intrinsics.class.getMethod((java.lang.String) objArr12[0], java.lang.Object.class, java.lang.String.class);
                method5.setAccessible(true);
                method5.invoke(null, objArr11);
                if (!pUU.class.getField("AEQbTJ").getBoolean(null)) {
                    java.lang.Object[] objArr13 = new java.lang.Object[1];
                    a(true, 206, 7, 23, new char[]{'\n', 65473, '\b', 16, 65517, '\f', 65520, 6, 27, '\n', '\r', 2, '\n', 21, '\n', 15, '\n', 65473, 21, 16, 15, 65473, 20}, objArr13);
                    java.lang.Object[] objArr14 = {((java.lang.String) objArr13[0]).toString()};
                    java.lang.reflect.Constructor declaredConstructor2 = java.lang.IllegalStateException.class.getDeclaredConstructor(java.lang.String.class);
                    declaredConstructor2.setAccessible(true);
                    throw ((java.lang.Throwable) declaredConstructor2.newInstance(objArr14));
                }
                int i8 = AYXKKw + 79;
                valueOf = i8 % 128;
                if (i8 % 2 != 0) {
                    obj = pUU.class.getField("copydefault").get(null);
                    int i9 = 32 / 0;
                } else {
                    obj = pUU.class.getField("copydefault").get(null);
                }
                int i10 = AYXKKw + 109;
                valueOf = i10 % 128;
                int i11 = i10 % 2;
                java.lang.reflect.Method method6 = Intrinsics.class.getMethod("copydefault", java.lang.Object.class);
                method6.setAccessible(true);
                method6.invoke(null, obj);
                int i12 = valueOf + 91;
                AYXKKw = i12 % 128;
                if (i12 % 2 == 0) {
                    java.lang.Object[] objArr15 = new java.lang.Object[2];
                    objArr15[1] = objInvoke;
                    objArr15[1] = str2;
                    java.lang.Class[] clsArr = new java.lang.Class[5];
                    clsArr[0] = java.lang.String.class;
                    clsArr[0] = java.lang.String.class;
                    java.lang.reflect.Method method7 = pUP.class.getMethod("copydefault", clsArr);
                    method7.setAccessible(false);
                    method7.invoke(obj, objArr15);
                } else {
                    java.lang.Object[] objArr16 = {str2, objInvoke};
                    java.lang.reflect.Method method8 = pUP.class.getMethod("copydefault", java.lang.String.class, java.lang.String.class);
                    method8.setAccessible(true);
                    method8.invoke(obj, objArr16);
                }
                byte[] bArr = $$a;
                byte b = bArr[13];
                byte b2 = b;
                java.lang.Object[] objArr17 = new java.lang.Object[1];
                c(b, b2, b2, objArr17);
                java.lang.reflect.Method method9 = C44103sDl.ActionBar.class.getMethod((java.lang.String) objArr17[0], null);
                method9.setAccessible(true);
                java.lang.Object objInvoke2 = method9.invoke(obj2, null);
                java.lang.Object[] objArr18 = new java.lang.Object[1];
                b(new char[]{19703, 3054, 53227, 33548, 44763, 49980, 15895, 15440, 6983, 62243, 36191, 11131, 52043, 38115, 38323, 37771}, 16, objArr18);
                DetectionInfoBean.class.getField((java.lang.String) objArr18[0]).setBoolean(objInvoke2, true);
                int i13 = AYXKKw + 63;
                valueOf = i13 % 128;
                int i14 = i13 % 2;
                byte b3 = bArr[13];
                byte b4 = b3;
                java.lang.Object[] objArr19 = new java.lang.Object[1];
                c(b3, b4, b4, objArr19);
                java.lang.reflect.Method method10 = C44103sDl.ActionBar.class.getMethod((java.lang.String) objArr19[0], null);
                method10.setAccessible(true);
                java.lang.Object objInvoke3 = method10.invoke(obj2, null);
                java.lang.Long lValueOf = java.lang.Long.valueOf(j3);
                java.lang.Object[] objArr20 = new java.lang.Object[1];
                a(true, com.flyco.tablayout.BuildConfig.VERSION_CODE, 4, 9, new char[]{16, 65533, 0, 65535, '\n', 1, '\t', 65508, 2}, objArr20);
                DetectionInfoBean.class.getField((java.lang.String) objArr20[0]).set(objInvoke3, lValueOf);
                byte b5 = (byte) (-bArr[6]);
                byte b6 = b5;
                java.lang.Object[] objArr21 = new java.lang.Object[1];
                c(b5, b6, b6, objArr21);
                java.lang.reflect.Method method11 = C44103sDl.ActionBar.class.getMethod((java.lang.String) objArr21[0], null);
                method11.setAccessible(true);
                method11.invoke(obj2, null);
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
    }

    /* JADX INFO: renamed from: o.fjT$ActionBar */
    /* JADX INFO: loaded from: classes18.dex */
    public static final class ActionBar implements Function0<Unit> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar() {
        }

        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public /* synthetic */ Unit invoke() {
            EZpvd();
            return Unit.INSTANCE;
        }

        public final void EZpvd() {
            if (ActivityC18493fjT.this.AEQbTJ().valueOf() != WalletType.MPCWallet.ordinal()) {
                ActivityC18493fjT.this.KWHzl();
                return;
            }
            if (!C43453rpa.AEQbTJ.KWHzl(ActivityC18493fjT.this)) {
                C55326xho.toastWithFailedIcon$default(C13754dXa.FragmentManager.registerCallbackMessenger, 0, 1, (java.lang.Object) null);
                return;
            }
            ActivityC18493fjT.this.showLoadingWithLogo();
            eSA esa = new eSA();
            final ActivityC18493fjT activityC18493fjT = ActivityC18493fjT.this;
            esa.KWHzl(activityC18493fjT, new Function1<java.lang.Boolean, Unit>() { // from class: o.fjT.ActionBar.2
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* synthetic */ Unit invoke(java.lang.Boolean bool) {
                    EZpvd(bool.booleanValue());
                    return Unit.INSTANCE;
                }

                public final void EZpvd(boolean z) {
                    activityC18493fjT.dismissLoadingWithLogo();
                    CheckMpcStatusResponse checkMpcStatusResponse = C15691eRs.AEQbTJ.KWHzl().get(activityC18493fjT.AEQbTJ().gEmmrt());
                    java.lang.Integer numValueOf = checkMpcStatusResponse != null ? java.lang.Integer.valueOf(checkMpcStatusResponse.getMpcStatus()) : null;
                    int value = MpcStatus.Backuped.getValue();
                    if (numValueOf != null && numValueOf.intValue() == value) {
                        activityC18493fjT.KWHzl();
                        return;
                    }
                    int value2 = MpcStatus.Escape.getValue();
                    if (numValueOf != null && numValueOf.intValue() == value2) {
                        C55326xho.toastWithFailedIcon$default(C33070mpX.AYXKKw(C13754dXa.FragmentManager.MediaBrowserCompatConnectionCallback), 0, 1, (java.lang.Object) null);
                        return;
                    }
                    int value3 = MpcStatus.Refreshed.getValue();
                    if (numValueOf != null && numValueOf.intValue() == value3) {
                        C55326xho.toastWithFailedIcon$default(C33070mpX.AYXKKw(C13754dXa.FragmentManager.getCurrent), 0, 1, (java.lang.Object) null);
                        return;
                    }
                    pUU.copydefault(activityC18493fjT.getTAG(), " status :" + z + " mpcStatus = " + (checkMpcStatusResponse != null ? java.lang.Integer.valueOf(checkMpcStatusResponse.getMpcStatus()) : null));
                }
            });
        }
    }

    /* JADX INFO: renamed from: o.fjT$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ ActivityC18493fjT OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, ActivityC18493fjT activityC18493fjT) {
            this.copydefault = view;
            this.EZpvd = j;
            this.OLrzqt = activityC18493fjT;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            C55008xbo c55008xbo;
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.EZpvd || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                AbstractC16330ehr abstractC16330ehr = this.OLrzqt.EZpvd;
                if (abstractC16330ehr == null || (c55008xbo = abstractC16330ehr.copydefault) == null) {
                    return;
                }
                java.lang.String strValueOf = java.lang.String.valueOf(this.OLrzqt.AEQbTJ().OLrzqt());
                c55008xbo.setText(strValueOf);
                C55001xbh c55001xbhAkhnZx = c55008xbo.AkhnZx();
                if (c55001xbhAkhnZx != null) {
                    c55001xbhAkhnZx.setSelection(strValueOf.length());
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.fjT$PendingIntent */
    public static final class PendingIntent implements View.OnClickListener {
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ long OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public PendingIntent(android.view.View view, long j) {
            this.EZpvd = view;
            this.OLrzqt = j;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.OLrzqt || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
            }
        }
    }

    /* JADX INFO: renamed from: o.fjT$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ ActivityC18493fjT AEQbTJ;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, ActivityC18493fjT activityC18493fjT) {
            this.KWHzl = view;
            this.copydefault = j;
            this.AEQbTJ = activityC18493fjT;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.copydefault || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                C10604brb instance$default = C10604brb.Application.getInstance$default(C10604brb.Companion, null, 1, null);
                ActivityC18493fjT activityC18493fjT = this.AEQbTJ;
                instance$default.KWHzl(activityC18493fjT, activityC18493fjT, activityC18493fjT.new ActionBar());
            }
        }
    }

    /* JADX INFO: renamed from: o.fjT$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ ActivityC18493fjT KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, ActivityC18493fjT activityC18493fjT) {
            this.AEQbTJ = view;
            this.EZpvd = j;
            this.KWHzl = activityC18493fjT;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.EZpvd || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.KWHzl.EZpvd();
            }
        }
    }

    public static final Unit OLrzqt(ActivityC18493fjT activityC18493fjT, java.lang.Integer num) {
        java.lang.String strValueOf;
        java.lang.String strCopydefault;
        C55008xbo c55008xbo;
        C55001xbh c55001xbhAkhnZx;
        C55008xbo c55008xbo2;
        C55008xbo c55008xbo3;
        C55008xbo c55008xbo4;
        C55008xbo c55008xbo5;
        C52794wYp c52794wYp;
        if (num == null) {
            return Unit.INSTANCE;
        }
        rVN.reportFullyDrawn$default((android.app.Activity) activityC18493fjT, true, (java.lang.String) null, 2, (java.lang.Object) null);
        AbstractC16330ehr abstractC16330ehr = activityC18493fjT.EZpvd;
        if (abstractC16330ehr != null && (c52794wYp = abstractC16330ehr.KWHzl) != null) {
            c52794wYp.setEnabled(num.intValue() > 0);
        }
        if (num.intValue() < 1) {
            AbstractC16883esN abstractC16883esN = activityC18493fjT.copydefault;
            Intrinsics.copydefault(abstractC16883esN);
            abstractC16883esN.EZpvd.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.QwvEab));
            AbstractC16330ehr abstractC16330ehr2 = activityC18493fjT.EZpvd;
            if (abstractC16330ehr2 != null && (c55008xbo5 = abstractC16330ehr2.copydefault) != null) {
                c55008xbo5.setState(3);
            }
            AbstractC16330ehr abstractC16330ehr3 = activityC18493fjT.EZpvd;
            if (abstractC16330ehr3 != null && (c55008xbo4 = abstractC16330ehr3.copydefault) != null) {
                c55008xbo4.setText("0");
            }
            strCopydefault = C33069mpW.copydefault(C13754dXa.FragmentManager.MediaBrowserCompatCustomActionResultReceiver, C56423yEv.EZpvd(C56390yDp.OLrzqt(OtcExtraKeys.AMOUNT, "0")));
        } else {
            AbstractC16330ehr abstractC16330ehr4 = activityC18493fjT.EZpvd;
            if (abstractC16330ehr4 != null && (c55008xbo3 = abstractC16330ehr4.copydefault) != null) {
                c55008xbo3.setState(0);
            }
            if (activityC18493fjT.AEQbTJ().AYXKKw() > num.intValue()) {
                strValueOf = num.toString();
            } else {
                strValueOf = java.lang.String.valueOf(activityC18493fjT.AEQbTJ().AYXKKw());
            }
            AbstractC16330ehr abstractC16330ehr5 = activityC18493fjT.EZpvd;
            if (abstractC16330ehr5 != null && (c55008xbo2 = abstractC16330ehr5.copydefault) != null) {
                c55008xbo2.setText(strValueOf);
            }
            AbstractC16330ehr abstractC16330ehr6 = activityC18493fjT.EZpvd;
            if (abstractC16330ehr6 != null && (c55008xbo = abstractC16330ehr6.copydefault) != null && (c55001xbhAkhnZx = c55008xbo.AkhnZx()) != null) {
                c55001xbhAkhnZx.setSelection(strValueOf.length());
            }
            strCopydefault = C33069mpW.copydefault(C13754dXa.FragmentManager.MediaBrowserCompatCustomActionResultReceiver, C56423yEv.EZpvd(C56390yDp.OLrzqt(OtcExtraKeys.AMOUNT, java.lang.String.valueOf(num))));
        }
        AbstractC16883esN abstractC16883esN2 = activityC18493fjT.copydefault;
        Intrinsics.copydefault(abstractC16883esN2);
        abstractC16883esN2.KWHzl.setText(strCopydefault);
        return Unit.INSTANCE;
    }

    public final void KWHzl() {
        androidx.fragment.app.FragmentManager supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
        new C14469dlz(supportFragmentManager, this, null, null, new Function1() { // from class: o.fjQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC18493fjT.EZpvd(this.copydefault, (java.lang.String) obj);
            }
        }, null, null, null, 232, null).EZpvd();
    }

    public static final Unit EZpvd(ActivityC18493fjT activityC18493fjT, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        ActivityC18496fjW.Companion.AEQbTJ(activityC18493fjT, activityC18493fjT.AEQbTJ().gEmmrt(), activityC18493fjT.AEQbTJ().AYXKKw(), activityC18493fjT.AEQbTJ().copydefault(), activityC18493fjT.AEQbTJ().valueOf(), str);
        activityC18493fjT.OLrzqt();
        return Unit.INSTANCE;
    }

    private final void OLrzqt() {
        C32866mlf.onEvent$default("Web3WalletAddAccountsInBulk_Btm_ConfirmButton_Click", (TrackChannel[]) null, new Function1() { // from class: o.fjV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC18493fjT.OLrzqt(this.KWHzl, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit OLrzqt(ActivityC18493fjT activityC18493fjT, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.add(new EventParam("account_type", activityC18493fjT.AEQbTJ().copydefault() == 1 ? "account_eoa" : "account_aa", true));
        java.lang.Integer value = activityC18493fjT.AEQbTJ().KWHzl().getValue();
        eventParamsList.add(new EventParam("available_max", java.lang.String.valueOf(value != null ? value.intValue() : 0), false));
        eventParamsList.add(new EventParam("input_number", java.lang.String.valueOf(activityC18493fjT.AEQbTJ().AYXKKw()), false));
        eventParamsList.add(new EventParam("previous_page", activityC18493fjT.AEQbTJ().EZpvd(), true));
        return Unit.INSTANCE;
    }

    private final android.view.View copydefault() {
        AbstractC16883esN abstractC16883esNCopydefault = AbstractC16883esN.copydefault(android.view.LayoutInflater.from(this), null, false);
        this.copydefault = abstractC16883esNCopydefault;
        Intrinsics.copydefault(abstractC16883esNCopydefault);
        C52794wYp c52794wYp = abstractC16883esNCopydefault.EZpvd;
        c52794wYp.setOnClickListener(new Activity(c52794wYp, 1000L, this));
        AbstractC16883esN abstractC16883esN = this.copydefault;
        Intrinsics.copydefault(abstractC16883esN);
        android.view.View root = abstractC16883esN.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        return root;
    }

    public final void EZpvd() {
        C18514fjo.Companion.KWHzl(AEQbTJ().gEmmrt(), new Function1() { // from class: o.fjS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC18493fjT.copydefault(this.KWHzl, (BatchCreateRootWalletInformationBean) obj);
            }
        }).show(getSupportFragmentManager(), "BatchAccountSelectWalletFragment");
    }

    public static final Unit copydefault(ActivityC18493fjT activityC18493fjT, BatchCreateRootWalletInformationBean batchCreateRootWalletInformationBean) {
        C55008xbo c55008xbo;
        if (batchCreateRootWalletInformationBean == null) {
            return Unit.INSTANCE;
        }
        activityC18493fjT.AEQbTJ().OLrzqt(batchCreateRootWalletInformationBean.getRootWalletId());
        activityC18493fjT.AEQbTJ().KWHzl(batchCreateRootWalletInformationBean.getWalletType().ordinal());
        AbstractC16330ehr abstractC16330ehr = activityC18493fjT.EZpvd;
        if (abstractC16330ehr != null && (c55008xbo = abstractC16330ehr.djBIcL) != null) {
            c55008xbo.setText(batchCreateRootWalletInformationBean.getName());
        }
        return Unit.INSTANCE;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        int i;
        C52794wYp c52794wYp;
        C55008xbo c55008xbo;
        C52794wYp c52794wYp2;
        C52794wYp c52794wYp3;
        C55008xbo c55008xbo2;
        C52794wYp c52794wYp4;
        C55008xbo c55008xbo3;
        C52794wYp c52794wYp5;
        C55008xbo c55008xbo4;
        C52794wYp c52794wYp6;
        C55008xbo c55008xbo5;
        java.lang.String strValueOf = java.lang.String.valueOf(editable);
        if (strValueOf.length() == 0) {
            AbstractC16330ehr abstractC16330ehr = this.EZpvd;
            if (abstractC16330ehr != null && (c55008xbo5 = abstractC16330ehr.copydefault) != null) {
                c55008xbo5.values();
            }
            AbstractC16330ehr abstractC16330ehr2 = this.EZpvd;
            if (abstractC16330ehr2 == null || (c52794wYp6 = abstractC16330ehr2.KWHzl) == null) {
                return;
            }
            c52794wYp6.setEnabled(false);
            return;
        }
        if (strValueOf.length() > 10) {
            AbstractC16330ehr abstractC16330ehr3 = this.EZpvd;
            if (abstractC16330ehr3 != null && (c55008xbo4 = abstractC16330ehr3.copydefault) != null) {
                c55008xbo4.setErrorText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.unsubscribe));
            }
            AbstractC16330ehr abstractC16330ehr4 = this.EZpvd;
            if (abstractC16330ehr4 == null || (c52794wYp5 = abstractC16330ehr4.KWHzl) == null) {
                return;
            }
            c52794wYp5.setEnabled(false);
            return;
        }
        if (!C9700baY.copydefault(strValueOf)) {
            AbstractC16330ehr abstractC16330ehr5 = this.EZpvd;
            if (abstractC16330ehr5 != null && (c55008xbo3 = abstractC16330ehr5.copydefault) != null) {
                c55008xbo3.setErrorText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.MediaBrowserCompatCallbackHandler));
            }
            AbstractC16330ehr abstractC16330ehr6 = this.EZpvd;
            if (abstractC16330ehr6 == null || (c52794wYp4 = abstractC16330ehr6.KWHzl) == null) {
                return;
            }
            c52794wYp4.setEnabled(false);
            return;
        }
        try {
            i = java.lang.Integer.parseInt(C33129mqd.AYXKKw(java.lang.String.valueOf(editable)));
        } catch (java.lang.Exception unused) {
            i = Integer.MAX_VALUE;
        }
        if (i > AEQbTJ().OLrzqt()) {
            AbstractC16330ehr abstractC16330ehr7 = this.EZpvd;
            if (abstractC16330ehr7 != null && (c55008xbo2 = abstractC16330ehr7.copydefault) != null) {
                c55008xbo2.setErrorText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.unsubscribe));
            }
            AbstractC16330ehr abstractC16330ehr8 = this.EZpvd;
            if (abstractC16330ehr8 == null || (c52794wYp3 = abstractC16330ehr8.KWHzl) == null) {
                return;
            }
            c52794wYp3.setEnabled(false);
            return;
        }
        if (i == 0) {
            AbstractC16330ehr abstractC16330ehr9 = this.EZpvd;
            if (abstractC16330ehr9 == null || (c52794wYp2 = abstractC16330ehr9.KWHzl) == null) {
                return;
            }
            c52794wYp2.setEnabled(false);
            return;
        }
        AEQbTJ().copydefault(i);
        AbstractC16330ehr abstractC16330ehr10 = this.EZpvd;
        if (abstractC16330ehr10 != null && (c55008xbo = abstractC16330ehr10.copydefault) != null) {
            c55008xbo.values();
        }
        AbstractC16330ehr abstractC16330ehr11 = this.EZpvd;
        if (abstractC16330ehr11 == null || (c52794wYp = abstractC16330ehr11.KWHzl) == null) {
            return;
        }
        c52794wYp.setEnabled(true);
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        C14638dpI c14638dpI = this.OLrzqt;
        if (c14638dpI != null) {
            c14638dpI.EZpvd();
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, android.content.Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == -1 && i == 10000000) {
            if (intent == null) {
                finish();
                return;
            }
            int intExtra = intent.getIntExtra("walletCount", 0);
            if (intExtra > 0) {
                AEQbTJ(intExtra);
            } else {
                finish();
            }
        }
    }

    public final void AEQbTJ(int i) {
        C55008xbo c55008xbo;
        AbstractC16330ehr abstractC16330ehr = this.EZpvd;
        if (abstractC16330ehr == null || (c55008xbo = abstractC16330ehr.copydefault) == null) {
            return;
        }
        c55008xbo.setText(java.lang.String.valueOf(i));
    }

    @Override // o.C14638dpI.Application
    public void AEQbTJ(boolean z, final int i) {
        AbstractC16330ehr abstractC16330ehr;
        NestedScrollView nestedScrollView;
        if (!z || (abstractC16330ehr = this.EZpvd) == null || (nestedScrollView = abstractC16330ehr.OLrzqt) == null) {
            return;
        }
        nestedScrollView.postDelayed(new java.lang.Runnable() { // from class: o.fjR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                ActivityC18493fjT.OLrzqt(this.AEQbTJ, i);
            }
        }, 100L);
    }

    public static final void OLrzqt(ActivityC18493fjT activityC18493fjT, int i) {
        NestedScrollView nestedScrollView;
        AbstractC16330ehr abstractC16330ehr = activityC18493fjT.EZpvd;
        if (abstractC16330ehr == null || (nestedScrollView = abstractC16330ehr.OLrzqt) == null) {
            return;
        }
        if (abstractC16330ehr != null && nestedScrollView != null) {
            i = nestedScrollView.getMaxScrollAmount();
        }
        nestedScrollView.smoothScrollTo(0, i);
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
