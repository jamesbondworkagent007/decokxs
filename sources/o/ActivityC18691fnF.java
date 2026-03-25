package o;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.core.os.BundleKt;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.okinc.business.defi.common.utils.CDNSourceManager;
import com.okinc.business.defi.wallet.mine.backup.BackupWalletAnimationTipActivity$handleJump$3;
import com.okinc.business.defi.wallet.mine.backup.BackupWalletAnimationTipActivity$onCreate$1;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParam;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.liveness.lca.EopTrackEvent;
import com.okinc.network.okg.cor.SubdomainStrategy;
import com.okinc.wallet.api.bean.EnterWalletMainBean;
import com.okinc.web.WebActivity;
import com.okinc.web3.security.listener.BackupMnemonicListener;
import com.okinc.web3.security.service.Web3SecurityService;
import com.okinc.web3.security.service.Web3SecurityServiceProvider;
import com.okinc.web3.security.track.Web3SecurityTrackEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.ActivityC18691fnF;
import o.C12827cuN;
import o.C13754dXa;
import o.C52761wXj;
import o.InterfaceC32801mkT;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fnF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class ActivityC18691fnF extends AbstractActivityC33013moT {
    public static final Activity Companion = new Activity(null);
    public static final int copydefault = 8;
    public int AYXKKw;
    public int AhwBna;
    public final InterfaceC56387yDm KWHzl;
    public AbstractC16239egF OLrzqt;
    public java.lang.String EZpvd = "";
    public java.lang.String valueOf = "";
    public int AEQbTJ = 3000;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(int i) {
        this.AhwBna = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int OLrzqt() {
        return this.AYXKKw;
    }

    public ActivityC18691fnF() {
        final Function0 function0 = null;
        this.KWHzl = new ViewModelLazy(C56524yIo.AEQbTJ(C18807fpQ.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.defi.wallet.mine.backup.BackupWalletAnimationTipActivity$special$$inlined$viewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.defi.wallet.mine.backup.BackupWalletAnimationTipActivity$special$$inlined$viewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.defi.wallet.mine.backup.BackupWalletAnimationTipActivity$special$$inlined$viewModels$default$3
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

    /* JADX INFO: renamed from: o.fnF$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.fnF.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public static /* synthetic */ void startActivity$default(Activity activity, android.content.Context context, java.lang.String str, java.lang.String str2, int i, int i2, java.lang.Object obj) {
            if ((i2 & 2) != 0) {
                str = "";
            }
            if ((i2 & 4) != 0) {
                str2 = "";
            }
            if ((i2 & 8) != 0) {
                i = 0;
            }
            activity.AEQbTJ(context, str, str2, i);
        }

        public final void AEQbTJ(@NotNull android.content.Context context, @NotNull java.lang.String str, @NotNull java.lang.String str2, int i) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) ActivityC18691fnF.class);
            intent.putExtra("wallet_id", str);
            intent.putExtra("path", str2);
            intent.putExtra("type", i);
            context.startActivity(intent);
        }
    }

    private final void valueOf() {
        java.lang.String stringExtra = getIntent().getStringExtra("wallet_id");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.valueOf = stringExtra;
        java.lang.String stringExtra2 = getIntent().getStringExtra("path");
        this.EZpvd = stringExtra2 != null ? stringExtra2 : "";
        this.AYXKKw = getIntent().getIntExtra("type", 0);
    }

    public final C18807fpQ EZpvd() {
        return (C18807fpQ) this.KWHzl.getValue();
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.mkT.ActionBar.setupClickProtection$default(o.mkT, android.view.View, o.miC, android.content.Context, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function2, int, java.lang.Object):void */
    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.OLrzqt = (AbstractC16239egF) DataBindingUtil.setContentView(this, C13754dXa.TaskDescription.KWHzl);
        valueOf();
        AbstractC16239egF abstractC16239egF = this.OLrzqt;
        AbstractC16239egF abstractC16239egF2 = null;
        if (abstractC16239egF == null) {
            Intrinsics.gEmmrt("");
            abstractC16239egF = null;
        }
        abstractC16239egF.AEQbTJ.setVisibility(0);
        AbstractC16239egF abstractC16239egF3 = this.OLrzqt;
        if (abstractC16239egF3 == null) {
            Intrinsics.gEmmrt("");
            abstractC16239egF3 = null;
        }
        abstractC16239egF3.AEQbTJ.setOKDSType(257);
        AbstractC16239egF abstractC16239egF4 = this.OLrzqt;
        if (abstractC16239egF4 == null) {
            Intrinsics.gEmmrt("");
            abstractC16239egF4 = null;
        }
        abstractC16239egF4.OLrzqt.setOKDSType(260);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new BackupWalletAnimationTipActivity$onCreate$1(null), 3, null);
        InterfaceC32801mkT interfaceC32801mkT = (InterfaceC32801mkT) C43251rlk.copydefault(InterfaceC32801mkT.class);
        AbstractC16239egF abstractC16239egF5 = this.OLrzqt;
        if (abstractC16239egF5 == null) {
            Intrinsics.gEmmrt("");
            abstractC16239egF5 = null;
        }
        C52794wYp c52794wYp = abstractC16239egF5.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(c52794wYp, "");
        InterfaceC32801mkT.ActionBar.setupClickProtection$default(interfaceC32801mkT, c52794wYp, null, this, null, null, 26, null);
        AbstractC16239egF abstractC16239egF6 = this.OLrzqt;
        if (abstractC16239egF6 == null) {
            Intrinsics.gEmmrt("");
            abstractC16239egF6 = null;
        }
        ConstraintLayout constraintLayout = abstractC16239egF6.copydefault;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
        ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
        if (layoutParams != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            int i = marginLayoutParams.topMargin;
            AbstractC16239egF abstractC16239egF7 = this.OLrzqt;
            if (abstractC16239egF7 == null) {
                Intrinsics.gEmmrt("");
                abstractC16239egF7 = null;
            }
            marginLayoutParams.topMargin = i + C33570myu.AEQbTJ(abstractC16239egF7.copydefault.getContext());
            constraintLayout.setLayoutParams(marginLayoutParams);
            AbstractC16239egF abstractC16239egF8 = this.OLrzqt;
            if (abstractC16239egF8 == null) {
                Intrinsics.gEmmrt("");
            } else {
                abstractC16239egF2 = abstractC16239egF8;
            }
            abstractC16239egF2.EZpvd.setOnClickListener(new View.OnClickListener() { // from class: o.fnJ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    ActivityC18691fnF.fetchVPNInfo(this.KWHzl, view);
                }
            });
            int intExtra = getIntent().getIntExtra("step", 1);
            if (intExtra == 1) {
                djBIcL();
            } else if (intExtra == 2) {
                gEmmrt();
            } else if (intExtra == 3) {
                AhwBna();
            }
            getWindow().getDecorView().post(new java.lang.Runnable() { // from class: o.fnK
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    ActivityC18691fnF.OLrzqt(this.EZpvd);
                }
            });
            return;
        }
        throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }

    public static final void fetchVPNInfo(ActivityC18691fnF activityC18691fnF, android.view.View view) {
        activityC18691fnF.finish();
    }

    public static final void OLrzqt(ActivityC18691fnF activityC18691fnF) {
        rVN.reportFullyDrawn$default((android.app.Activity) activityC18691fnF, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    public final void KWHzl(int i) {
        android.content.Intent intent = new android.content.Intent(this, (java.lang.Class<?>) ActivityC18691fnF.class);
        intent.putExtra("wallet_id", this.valueOf);
        intent.putExtra("path", this.EZpvd);
        intent.putExtra("type", this.AYXKKw);
        intent.putExtra("step", i);
        intent.addFlags(67108864);
        startActivity(intent);
    }

    public final void djBIcL() {
        AbstractC16239egF abstractC16239egF = this.OLrzqt;
        AbstractC16239egF abstractC16239egF2 = null;
        if (abstractC16239egF == null) {
            Intrinsics.gEmmrt("");
            abstractC16239egF = null;
        }
        android.widget.ImageView imageView = abstractC16239egF.KWHzl;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        C14677dpv.OLrzqt(imageView, CDNSourceManager.ImageSource.WalletBackUpTipsNoCamera);
        AbstractC16239egF abstractC16239egF3 = this.OLrzqt;
        if (abstractC16239egF3 == null) {
            Intrinsics.gEmmrt("");
            abstractC16239egF3 = null;
        }
        abstractC16239egF3.AEQbTJ.setOnClickListener(new View.OnClickListener() { // from class: o.fnU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                ActivityC18691fnF.AkhnZx(this.OLrzqt, view);
            }
        });
        OLrzqt(0);
        if (this.AYXKKw == 1) {
            AbstractC16239egF abstractC16239egF4 = this.OLrzqt;
            if (abstractC16239egF4 == null) {
                Intrinsics.gEmmrt("");
                abstractC16239egF4 = null;
            }
            abstractC16239egF4.OLrzqt.setText(C13754dXa.FragmentManager.CheckResult);
            AbstractC16239egF abstractC16239egF5 = this.OLrzqt;
            if (abstractC16239egF5 == null) {
                Intrinsics.gEmmrt("");
                abstractC16239egF5 = null;
            }
            abstractC16239egF5.OLrzqt.setOnClickListener(new View.OnClickListener() { // from class: o.fnS
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    ActivityC18691fnF.values(this.OLrzqt, view);
                }
            });
            AbstractC16239egF abstractC16239egF6 = this.OLrzqt;
            if (abstractC16239egF6 == null) {
                Intrinsics.gEmmrt("");
                abstractC16239egF6 = null;
            }
            abstractC16239egF6.AYXKKw.setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.ContentView));
            AbstractC16239egF abstractC16239egF7 = this.OLrzqt;
            if (abstractC16239egF7 == null) {
                Intrinsics.gEmmrt("");
                abstractC16239egF7 = null;
            }
            abstractC16239egF7.AhwBna.setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.codename));
            AbstractC16239egF abstractC16239egF8 = this.OLrzqt;
            if (abstractC16239egF8 == null) {
                Intrinsics.gEmmrt("");
            } else {
                abstractC16239egF2 = abstractC16239egF8;
            }
            abstractC16239egF2.gEmmrt.setText(KWHzl(C33069mpW.KWHzl(this, C13754dXa.FragmentManager.ChecksSdkIntAtLeast, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56424yEw.gEmmrt(C56390yDp.OLrzqt("count", java.lang.String.valueOf(1)), C56390yDp.OLrzqt("total", "3")))));
            return;
        }
        AbstractC16239egF abstractC16239egF9 = this.OLrzqt;
        if (abstractC16239egF9 == null) {
            Intrinsics.gEmmrt("");
            abstractC16239egF9 = null;
        }
        abstractC16239egF9.OLrzqt.setText(C13754dXa.FragmentManager.removeAllTabs);
        AbstractC16239egF abstractC16239egF10 = this.OLrzqt;
        if (abstractC16239egF10 == null) {
            Intrinsics.gEmmrt("");
            abstractC16239egF10 = null;
        }
        abstractC16239egF10.OLrzqt.setOnClickListener(new View.OnClickListener() { // from class: o.foa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                ActivityC18691fnF.isConnected(this.OLrzqt, view);
            }
        });
        AbstractC16239egF abstractC16239egF11 = this.OLrzqt;
        if (abstractC16239egF11 == null) {
            Intrinsics.gEmmrt("");
            abstractC16239egF11 = null;
        }
        abstractC16239egF11.AYXKKw.setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.requestFocus));
        AbstractC16239egF abstractC16239egF12 = this.OLrzqt;
        if (abstractC16239egF12 == null) {
            Intrinsics.gEmmrt("");
            abstractC16239egF12 = null;
        }
        abstractC16239egF12.AhwBna.setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.selectTab));
        AbstractC16239egF abstractC16239egF13 = this.OLrzqt;
        if (abstractC16239egF13 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC16239egF2 = abstractC16239egF13;
        }
        abstractC16239egF2.gEmmrt.setText(KWHzl(C33069mpW.KWHzl(this, C13754dXa.FragmentManager.removeTabAt, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56424yEw.gEmmrt(C56390yDp.OLrzqt("count", java.lang.String.valueOf(1)), C56390yDp.OLrzqt("total", "3")))));
    }

    public static final void AkhnZx(ActivityC18691fnF activityC18691fnF, android.view.View view) {
        activityC18691fnF.KWHzl(2);
    }

    public static final void values(ActivityC18691fnF activityC18691fnF, android.view.View view) {
        activityC18691fnF.finish();
    }

    public static final void isConnected(ActivityC18691fnF activityC18691fnF, android.view.View view) {
        activityC18691fnF.finish();
    }

    public final void gEmmrt() {
        AbstractC16239egF abstractC16239egF = this.OLrzqt;
        AbstractC16239egF abstractC16239egF2 = null;
        if (abstractC16239egF == null) {
            Intrinsics.gEmmrt("");
            abstractC16239egF = null;
        }
        abstractC16239egF.AEQbTJ.setOnClickListener(new View.OnClickListener() { // from class: o.fnV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                ActivityC18691fnF.DbNXlk(this.OLrzqt, view);
            }
        });
        OLrzqt(1);
        AbstractC16239egF abstractC16239egF3 = this.OLrzqt;
        if (abstractC16239egF3 == null) {
            Intrinsics.gEmmrt("");
            abstractC16239egF3 = null;
        }
        android.widget.ImageView imageView = abstractC16239egF3.KWHzl;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        C14677dpv.OLrzqt(imageView, CDNSourceManager.ImageSource.ICloudTipsNoBackUp);
        if (this.AYXKKw == 1) {
            AbstractC16239egF abstractC16239egF4 = this.OLrzqt;
            if (abstractC16239egF4 == null) {
                Intrinsics.gEmmrt("");
                abstractC16239egF4 = null;
            }
            abstractC16239egF4.OLrzqt.setText(C13754dXa.FragmentManager.CheckResult);
            AbstractC16239egF abstractC16239egF5 = this.OLrzqt;
            if (abstractC16239egF5 == null) {
                Intrinsics.gEmmrt("");
                abstractC16239egF5 = null;
            }
            abstractC16239egF5.OLrzqt.setOnClickListener(new View.OnClickListener() { // from class: o.fnT
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    ActivityC18691fnF.fJNWhG(this.EZpvd, view);
                }
            });
            AbstractC16239egF abstractC16239egF6 = this.OLrzqt;
            if (abstractC16239egF6 == null) {
                Intrinsics.gEmmrt("");
                abstractC16239egF6 = null;
            }
            abstractC16239egF6.gEmmrt.setText(KWHzl(C33069mpW.KWHzl(this, C13754dXa.FragmentManager.ChecksSdkIntAtLeast, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56424yEw.gEmmrt(C56390yDp.OLrzqt("count", java.lang.String.valueOf(2)), C56390yDp.OLrzqt("total", "3")))));
            AbstractC16239egF abstractC16239egF7 = this.OLrzqt;
            if (abstractC16239egF7 == null) {
                Intrinsics.gEmmrt("");
                abstractC16239egF7 = null;
            }
            abstractC16239egF7.AYXKKw.setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.DeprecatedSinceApi));
            AbstractC16239egF abstractC16239egF8 = this.OLrzqt;
            if (abstractC16239egF8 == null) {
                Intrinsics.gEmmrt("");
            } else {
                abstractC16239egF2 = abstractC16239egF8;
            }
            abstractC16239egF2.AhwBna.setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.suggest));
            return;
        }
        AbstractC16239egF abstractC16239egF9 = this.OLrzqt;
        if (abstractC16239egF9 == null) {
            Intrinsics.gEmmrt("");
            abstractC16239egF9 = null;
        }
        abstractC16239egF9.OLrzqt.setText(C13754dXa.FragmentManager.removeAllTabs);
        AbstractC16239egF abstractC16239egF10 = this.OLrzqt;
        if (abstractC16239egF10 == null) {
            Intrinsics.gEmmrt("");
            abstractC16239egF10 = null;
        }
        abstractC16239egF10.OLrzqt.setOnClickListener(new View.OnClickListener() { // from class: o.fnW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                ActivityC18691fnF.AuCTel(this.EZpvd, view);
            }
        });
        AbstractC16239egF abstractC16239egF11 = this.OLrzqt;
        if (abstractC16239egF11 == null) {
            Intrinsics.gEmmrt("");
            abstractC16239egF11 = null;
        }
        abstractC16239egF11.gEmmrt.setText(KWHzl(C33069mpW.KWHzl(this, C13754dXa.FragmentManager.removeTabAt, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56424yEw.gEmmrt(C56390yDp.OLrzqt("count", java.lang.String.valueOf(2)), C56390yDp.OLrzqt("total", "3")))));
        AbstractC16239egF abstractC16239egF12 = this.OLrzqt;
        if (abstractC16239egF12 == null) {
            Intrinsics.gEmmrt("");
            abstractC16239egF12 = null;
        }
        abstractC16239egF12.AYXKKw.setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.setBackgroundDrawable));
        AbstractC16239egF abstractC16239egF13 = this.OLrzqt;
        if (abstractC16239egF13 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC16239egF2 = abstractC16239egF13;
        }
        abstractC16239egF2.AhwBna.setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.setCustomView));
    }

    public static final void DbNXlk(ActivityC18691fnF activityC18691fnF, android.view.View view) {
        activityC18691fnF.KWHzl(3);
    }

    public static final void fJNWhG(ActivityC18691fnF activityC18691fnF, android.view.View view) {
        activityC18691fnF.finish();
    }

    public static final void AuCTel(ActivityC18691fnF activityC18691fnF, android.view.View view) {
        activityC18691fnF.finish();
    }

    public final void AhwBna() {
        AbstractC16239egF abstractC16239egF = this.OLrzqt;
        AbstractC16239egF abstractC16239egF2 = null;
        if (abstractC16239egF == null) {
            Intrinsics.gEmmrt("");
            abstractC16239egF = null;
        }
        abstractC16239egF.AEQbTJ.setOnClickListener(new View.OnClickListener() { // from class: o.fnM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                ActivityC18691fnF.ejfBZ(this.KWHzl, view);
            }
        });
        OLrzqt(2);
        AbstractC16239egF abstractC16239egF3 = this.OLrzqt;
        if (abstractC16239egF3 == null) {
            Intrinsics.gEmmrt("");
            abstractC16239egF3 = null;
        }
        android.widget.ImageView imageView = abstractC16239egF3.KWHzl;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        C14677dpv.OLrzqt(imageView, CDNSourceManager.ImageSource.WalletBackUpTipsNoShare);
        if (this.AYXKKw == 1) {
            AbstractC16239egF abstractC16239egF4 = this.OLrzqt;
            if (abstractC16239egF4 == null) {
                Intrinsics.gEmmrt("");
                abstractC16239egF4 = null;
            }
            abstractC16239egF4.OLrzqt.setText(C13754dXa.FragmentManager.CheckResult);
            AbstractC16239egF abstractC16239egF5 = this.OLrzqt;
            if (abstractC16239egF5 == null) {
                Intrinsics.gEmmrt("");
                abstractC16239egF5 = null;
            }
            abstractC16239egF5.OLrzqt.setOnClickListener(new View.OnClickListener() { // from class: o.fnI
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    ActivityC18691fnF.fIwbmz(this.EZpvd, view);
                }
            });
            AbstractC16239egF abstractC16239egF6 = this.OLrzqt;
            if (abstractC16239egF6 == null) {
                Intrinsics.gEmmrt("");
                abstractC16239egF6 = null;
            }
            abstractC16239egF6.gEmmrt.setText(KWHzl(C33069mpW.KWHzl(this, C13754dXa.FragmentManager.ChecksSdkIntAtLeast, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56424yEw.gEmmrt(C56390yDp.OLrzqt("count", java.lang.String.valueOf(3)), C56390yDp.OLrzqt("total", "3")))));
            AbstractC16239egF abstractC16239egF7 = this.OLrzqt;
            if (abstractC16239egF7 == null) {
                Intrinsics.gEmmrt("");
                abstractC16239egF7 = null;
            }
            abstractC16239egF7.AYXKKw.setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.lambda));
            AbstractC16239egF abstractC16239egF8 = this.OLrzqt;
            if (abstractC16239egF8 == null) {
                Intrinsics.gEmmrt("");
            } else {
                abstractC16239egF2 = abstractC16239egF8;
            }
            abstractC16239egF2.AhwBna.setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.f1056api));
            return;
        }
        AbstractC16239egF abstractC16239egF9 = this.OLrzqt;
        if (abstractC16239egF9 == null) {
            Intrinsics.gEmmrt("");
            abstractC16239egF9 = null;
        }
        abstractC16239egF9.OLrzqt.setText(C13754dXa.FragmentManager.removeAllTabs);
        AbstractC16239egF abstractC16239egF10 = this.OLrzqt;
        if (abstractC16239egF10 == null) {
            Intrinsics.gEmmrt("");
            abstractC16239egF10 = null;
        }
        abstractC16239egF10.OLrzqt.setOnClickListener(new View.OnClickListener() { // from class: o.fnQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                ActivityC18691fnF.fARcdN(this.EZpvd, view);
            }
        });
        AbstractC16239egF abstractC16239egF11 = this.OLrzqt;
        if (abstractC16239egF11 == null) {
            Intrinsics.gEmmrt("");
            abstractC16239egF11 = null;
        }
        abstractC16239egF11.gEmmrt.setText(KWHzl(C33069mpW.KWHzl(this, C13754dXa.FragmentManager.removeTabAt, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56424yEw.gEmmrt(C56390yDp.OLrzqt("count", java.lang.String.valueOf(3)), C56390yDp.OLrzqt("total", "3")))));
        AbstractC16239egF abstractC16239egF12 = this.OLrzqt;
        if (abstractC16239egF12 == null) {
            Intrinsics.gEmmrt("");
            abstractC16239egF12 = null;
        }
        abstractC16239egF12.AYXKKw.setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.setDefaultDisplayHomeAsUpEnabled));
        AbstractC16239egF abstractC16239egF13 = this.OLrzqt;
        if (abstractC16239egF13 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC16239egF2 = abstractC16239egF13;
        }
        abstractC16239egF2.AhwBna.setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.removeTab));
    }

    public static final void ejfBZ(ActivityC18691fnF activityC18691fnF, android.view.View view) {
        C32866mlf.onEvent$default("Web3Onboarding_BackupNoticeStep1_Button_Click", (TrackChannel[]) null, new Function1() { // from class: o.fnL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC18691fnF.copydefault((EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
        activityC18691fnF.copydefault();
    }

    public static final Unit copydefault(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.add(new EventParam(EopTrackEvent.KEY_BUTTON_NAME, TtmlNode.START, true));
        return Unit.INSTANCE;
    }

    public static final void fIwbmz(ActivityC18691fnF activityC18691fnF, android.view.View view) {
        activityC18691fnF.finish();
    }

    public static final void fARcdN(ActivityC18691fnF activityC18691fnF, android.view.View view) {
        activityC18691fnF.finish();
    }

    /* JADX INFO: renamed from: o.fnF$Application */
    public static final class Application extends android.os.CountDownTimer {
        public final /* synthetic */ int copydefault;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Application(int i, long j) {
            super(j, 1000L);
            this.copydefault = i;
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j) {
            ActivityC18691fnF.this.AEQbTJ((int) j);
            ActivityC18691fnF.this.EZpvd(this.copydefault);
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            AbstractC16239egF abstractC16239egF = ActivityC18691fnF.this.OLrzqt;
            AbstractC16239egF abstractC16239egF2 = null;
            if (abstractC16239egF == null) {
                Intrinsics.gEmmrt("");
                abstractC16239egF = null;
            }
            abstractC16239egF.AEQbTJ.setEnabled(true);
            if (ActivityC18691fnF.this.OLrzqt() == 1) {
                AbstractC16239egF abstractC16239egF3 = ActivityC18691fnF.this.OLrzqt;
                if (abstractC16239egF3 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    abstractC16239egF2 = abstractC16239egF3;
                }
                abstractC16239egF2.AEQbTJ.setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.BoolRes));
                return;
            }
            AbstractC16239egF abstractC16239egF4 = ActivityC18691fnF.this.OLrzqt;
            if (abstractC16239egF4 == null) {
                Intrinsics.gEmmrt("");
            } else {
                abstractC16239egF2 = abstractC16239egF4;
            }
            abstractC16239egF2.AEQbTJ.setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.openOptionsMenu));
        }
    }

    public final void OLrzqt(int i) {
        AbstractC16239egF abstractC16239egF = null;
        if (i == 0 || i == 1) {
            AbstractC16239egF abstractC16239egF2 = this.OLrzqt;
            if (abstractC16239egF2 == null) {
                Intrinsics.gEmmrt("");
            } else {
                abstractC16239egF = abstractC16239egF2;
            }
            abstractC16239egF.AEQbTJ.setEnabled(false);
            new Application(i, this.AEQbTJ).start();
            return;
        }
        if (i != 2) {
            return;
        }
        AbstractC16239egF abstractC16239egF3 = this.OLrzqt;
        if (abstractC16239egF3 == null) {
            Intrinsics.gEmmrt("");
            abstractC16239egF3 = null;
        }
        abstractC16239egF3.AEQbTJ.setEnabled(true);
        if (this.AYXKKw == 1) {
            AbstractC16239egF abstractC16239egF4 = this.OLrzqt;
            if (abstractC16239egF4 == null) {
                Intrinsics.gEmmrt("");
            } else {
                abstractC16239egF = abstractC16239egF4;
            }
            abstractC16239egF.AEQbTJ.setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.BinderThread));
            return;
        }
        AbstractC16239egF abstractC16239egF5 = this.OLrzqt;
        if (abstractC16239egF5 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC16239egF = abstractC16239egF5;
        }
        abstractC16239egF.AEQbTJ.setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.isTitleTruncated));
    }

    public final void EZpvd(int i) {
        int i2 = (this.AhwBna / 1000) + 1;
        AbstractC16239egF abstractC16239egF = null;
        if (i < 2) {
            if (this.AYXKKw == 1) {
                AbstractC16239egF abstractC16239egF2 = this.OLrzqt;
                if (abstractC16239egF2 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    abstractC16239egF = abstractC16239egF2;
                }
                abstractC16239egF.AEQbTJ.setText(C33069mpW.KWHzl(this, C13754dXa.FragmentManager.CallSuper, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("count", java.lang.String.valueOf(i2)))));
                return;
            }
            AbstractC16239egF abstractC16239egF3 = this.OLrzqt;
            if (abstractC16239egF3 == null) {
                Intrinsics.gEmmrt("");
            } else {
                abstractC16239egF = abstractC16239egF3;
            }
            abstractC16239egF.AEQbTJ.setText(C33069mpW.KWHzl(this, C13754dXa.FragmentManager.removeOnMenuVisibilityListener, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("count", java.lang.String.valueOf(i2)))));
            return;
        }
        if (this.AYXKKw == 1) {
            AbstractC16239egF abstractC16239egF4 = this.OLrzqt;
            if (abstractC16239egF4 == null) {
                Intrinsics.gEmmrt("");
            } else {
                abstractC16239egF = abstractC16239egF4;
            }
            abstractC16239egF.AEQbTJ.setText(C33069mpW.KWHzl(this, C13754dXa.FragmentManager.ArrayRes, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("count", java.lang.String.valueOf(i2)))));
            return;
        }
        AbstractC16239egF abstractC16239egF5 = this.OLrzqt;
        if (abstractC16239egF5 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC16239egF = abstractC16239egF5;
        }
        abstractC16239egF.AEQbTJ.setText(C33069mpW.KWHzl(this, C13754dXa.FragmentManager.onDestroy, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("count", java.lang.String.valueOf(i2)))));
    }

    public final void copydefault() {
        if (this.valueOf.length() == 0) {
            java.lang.String str = this.EZpvd;
            if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "route_backup_wallet_list")) {
                ActivityC18768fod.Companion.AEQbTJ(this);
            } else if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "defi_main")) {
                dZK.AEQbTJ.AEQbTJ(this, new EnterWalletMainBean((java.lang.Boolean) null, (java.lang.String) null, (java.lang.Integer) null, (java.lang.String) null, false, false, (com.okinc.wallet.api.bean.ScanResult) null, 127, (DefaultConstructorMarker) null));
            }
            C13912dbY.copydefault.AEQbTJ(false);
            finish();
            return;
        }
        if (C14471dmA.EZpvd.copydefault()) {
            androidx.fragment.app.FragmentManager supportFragmentManager = getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
            new C14461dlr(supportFragmentManager, "backupWalletAnimation", new Function1() { // from class: o.fnO
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return ActivityC18691fnF.EZpvd(this.copydefault, (java.lang.String) obj);
                }
            }, null, null, false, 56, null).EZpvd();
            return;
        }
        ActivityC18760foV.Companion.EZpvd(this, this.valueOf, this.EZpvd, this.AYXKKw);
        C13912dbY.copydefault.AEQbTJ(false);
        finish();
    }

    public static final Unit EZpvd(ActivityC18691fnF activityC18691fnF, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        activityC18691fnF.showLoading();
        activityC18691fnF.AEQbTJ(str);
        return Unit.INSTANCE;
    }

    public final android.text.SpannableStringBuilder KWHzl(java.lang.String str) {
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(str);
        if (str.length() == 0 || str.length() < 2) {
            return spannableStringBuilder;
        }
        android.text.style.ForegroundColorSpan foregroundColorSpan = new android.text.style.ForegroundColorSpan(ContextCompat.getColor(this, C52761wXj.Activity.UlJrfe));
        int length = str.length();
        spannableStringBuilder.setSpan(foregroundColorSpan, length - 2, length, 33);
        return spannableStringBuilder;
    }

    public static final InterfaceC58261yxu copydefault(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final kotlin.Pair EZpvd(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu OLrzqt(java.lang.String str, final AbstractC12784ctX abstractC12784ctX) {
        Intrinsics.checkNotNullParameter(abstractC12784ctX, "");
        AbstractC58260yxt<java.lang.String> abstractC58260yxtOLrzqt = abstractC12784ctX.OLrzqt(str);
        final Function1 function1 = new Function1() { // from class: o.fnR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC18691fnF.AEQbTJ(abstractC12784ctX, (java.lang.String) obj);
            }
        };
        return abstractC58260yxtOLrzqt.copydefault(new InterfaceC58229yxO() { // from class: o.fnN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return ActivityC18691fnF.EZpvd(function1, obj);
            }
        });
    }

    public static final kotlin.Pair AEQbTJ(AbstractC12784ctX abstractC12784ctX, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return C56390yDp.OLrzqt(abstractC12784ctX, str);
    }

    public static final Unit OLrzqt(ActivityC18691fnF activityC18691fnF, java.lang.String str, kotlin.Pair pair) {
        java.lang.String string;
        java.lang.Object first = pair.getFirst();
        Intrinsics.checkNotNullExpressionValue(first, "");
        AbstractC12784ctX abstractC12784ctX = (AbstractC12784ctX) first;
        Web3SecurityService service = Web3SecurityServiceProvider.getService();
        if (abstractC12784ctX.AYXKKw()) {
            string = abstractC12784ctX.AuCTel();
        } else {
            string = activityC18691fnF.getString(C13754dXa.FragmentManager.onExtraCallback);
            Intrinsics.copydefault((java.lang.Object) string);
        }
        java.lang.Object second = pair.getSecond();
        Intrinsics.checkNotNullExpressionValue(second, "");
        service.startBackupMnemonic(activityC18691fnF, string, (java.lang.String) second, str, abstractC12784ctX.AYXKKw(), Intrinsics.EZpvd((java.lang.Object) activityC18691fnF.EZpvd, (java.lang.Object) "route_finish_activity"), activityC18691fnF.new StateListAnimator(abstractC12784ctX));
        C13912dbY.copydefault.AEQbTJ(false);
        activityC18691fnF.finish();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.fnF$StateListAnimator */
    public static final class StateListAnimator implements BackupMnemonicListener {
        public final /* synthetic */ AbstractC12784ctX OLrzqt;

        public StateListAnimator(AbstractC12784ctX abstractC12784ctX) {
            this.OLrzqt = abstractC12784ctX;
        }

        @Override // com.okinc.web3.security.listener.BackupMnemonicListener
        public void onOpenMnemonicArticle(android.app.Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "");
            java.lang.String string = ActivityC18691fnF.this.getString(C13754dXa.FragmentManager.GhqvEQ);
            Intrinsics.checkNotNullExpressionValue(string, "");
            WebActivity.TaskDescription.openPage$default(WebActivity.Companion, activity, BundleKt.bundleOf(C56390yDp.OLrzqt("url", string), C56390yDp.OLrzqt("subdomainstrategy", SubdomainStrategy.Global.INSTANCE.toString())), null, 4, null);
            C32866mlf.onEvent$default(Web3SecurityTrackEvent.Web3Onboarding_SeedDisplay_Button_Click, (TrackChannel[]) null, new Function1() { // from class: o.fnX
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return ActivityC18691fnF.StateListAnimator.AEQbTJ((EventParamsList) obj);
                }
            }, 1, (java.lang.Object) null);
        }

        public static final Unit AEQbTJ(EventParamsList eventParamsList) {
            Intrinsics.checkNotNullParameter(eventParamsList, "");
            eventParamsList.add(new EventParam(EopTrackEvent.KEY_BUTTON_NAME, "info", true));
            return Unit.INSTANCE;
        }

        public static final void copydefault(Function1 function1, java.lang.Object obj) {
            function1.invoke(obj);
        }

        @Override // com.okinc.web3.security.listener.BackupMnemonicListener
        public void onCheckMnemonicPassed(final android.app.Activity activity, final Function0<Unit> function0) {
            Intrinsics.checkNotNullParameter(activity, "");
            Intrinsics.checkNotNullParameter(function0, "");
            AbstractC58260yxt<java.lang.Integer> abstractC58260yxtCopydefault = this.OLrzqt.copydefault();
            final ActivityC18691fnF activityC18691fnF = ActivityC18691fnF.this;
            final Function1 function1 = new Function1() { // from class: o.fnZ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return ActivityC18691fnF.StateListAnimator.EZpvd(function0, activityC18691fnF, activity, (java.lang.Integer) obj);
                }
            };
            InterfaceC58227yxM<? super java.lang.Integer> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.fnY
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    ActivityC18691fnF.StateListAnimator.copydefault(function1, obj);
                }
            };
            final ActivityC18691fnF activityC18691fnF2 = ActivityC18691fnF.this;
            final Function1 function12 = new Function1() { // from class: o.fob
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return ActivityC18691fnF.StateListAnimator.EZpvd(function0, activityC18691fnF2, (java.lang.Throwable) obj);
                }
            };
            abstractC58260yxtCopydefault.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.foc
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    ActivityC18691fnF.StateListAnimator.AEQbTJ(function12, obj);
                }
            });
        }

        /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [476=5] */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public static final Unit EZpvd(Function0 function0, ActivityC18691fnF activityC18691fnF, android.app.Activity activity, java.lang.Integer num) {
            Function0<Unit> function0AT_;
            function0.invoke();
            if (activityC18691fnF.AEQbTJ().length() > 0) {
                java.lang.String strAEQbTJ = activityC18691fnF.AEQbTJ();
                switch (strAEQbTJ.hashCode()) {
                    case -1293401068:
                        if (strAEQbTJ.equals("defi_main")) {
                            dZK.AEQbTJ.AEQbTJ(activity, new EnterWalletMainBean((java.lang.Boolean) null, (java.lang.String) null, (java.lang.Integer) null, (java.lang.String) null, false, false, (com.okinc.wallet.api.bean.ScanResult) null, 127, (DefaultConstructorMarker) null));
                        }
                        break;
                    case -651391466:
                        if (strAEQbTJ.equals("route_defi_manual_backup")) {
                            dZK.AEQbTJ.AEQbTJ(activity, new EnterWalletMainBean((java.lang.Boolean) null, (java.lang.String) null, (java.lang.Integer) null, (java.lang.String) null, false, false, (com.okinc.wallet.api.bean.ScanResult) null, 127, (DefaultConstructorMarker) null));
                        }
                        break;
                    case -38718190:
                        if (strAEQbTJ.equals("route_defi_wallet_detail")) {
                            eAZ.Companion.copydefault(activity, "");
                        }
                        break;
                    case 584736733:
                        if (strAEQbTJ.equals("route_backup_wallet_list")) {
                            ActivityC18768fod.Companion.AEQbTJ(activity);
                        }
                        break;
                    case 2100912965:
                        if (strAEQbTJ.equals("route_finish_activity") && (function0AT_ = ((xWS) C43251rlk.copydefault(xWS.class)).aT_()) != null) {
                            function0AT_.invoke();
                        }
                        break;
                }
            } else {
                dZK.AEQbTJ.AEQbTJ(activity, new EnterWalletMainBean((java.lang.Boolean) null, (java.lang.String) null, (java.lang.Integer) null, (java.lang.String) null, false, false, (com.okinc.wallet.api.bean.ScanResult) null, 127, (DefaultConstructorMarker) null));
            }
            return Unit.INSTANCE;
        }

        public static final void AEQbTJ(Function1 function1, java.lang.Object obj) {
            function1.invoke(obj);
        }

        public static final Unit EZpvd(Function0 function0, ActivityC18691fnF activityC18691fnF, java.lang.Throwable th) {
            function0.invoke();
            pUU.copydefault(activityC18691fnF.getTAG(), "backupWalletByMnemonic error message :" + th.getMessage());
            return Unit.INSTANCE;
        }
    }

    private final void AEQbTJ(final java.lang.String str) {
        int i = this.AYXKKw;
        if (i != 0) {
            if (i != 1) {
                return;
            }
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new BackupWalletAnimationTipActivity$handleJump$3(this, str, null), 3, null);
        } else {
            AbstractC58260yxt<AbstractC12784ctX> abstractC58260yxtDjBIcL = C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).djBIcL(this.valueOf);
            final Function1 function1 = new Function1() { // from class: o.fnD
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return ActivityC18691fnF.OLrzqt(str, (AbstractC12784ctX) obj);
                }
            };
            AbstractC58260yxt<R> abstractC58260yxtOLrzqt = abstractC58260yxtDjBIcL.OLrzqt(new InterfaceC58229yxO() { // from class: o.fnG
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return ActivityC18691fnF.copydefault(function1, obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(abstractC58260yxtOLrzqt, "");
            C11607cUn.subscribeOnIO$default(abstractC58260yxtOLrzqt, (Function1) null, new Function1() { // from class: o.fnP
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return ActivityC18691fnF.OLrzqt(this.OLrzqt, str, (kotlin.Pair) obj);
                }
            }, 1, (java.lang.Object) null);
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
    public void onResume() {
        super.onResume();
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
