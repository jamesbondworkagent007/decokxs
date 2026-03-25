package o;

import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.LifecycleOwnerKt;
import com.okinc.business.defi.wallet.detail.DefiWalletAccountListActivity$refreshListData$1;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C13754dXa;
import o.eBX;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class eAL extends AbstractActivityC33013moT {
    public static final Activity Companion = new Activity(null);
    public static final int EZpvd = 8;
    public AbstractC16328ehp KWHzl;
    public java.lang.String AYXKKw = "";
    public boolean AhwBna = true;
    public final java.util.ArrayList<eBX> copydefault = new java.util.ArrayList<>();
    public final InterfaceC56387yDm AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.eAP
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return eAL.valueOf(this.KWHzl);
        }
    });
    public final C15274eCg OLrzqt = new C15274eCg(null, 1, null);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.AYXKKw;
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.eAL.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final void AEQbTJ(@NotNull android.content.Context context, @NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(str, "");
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) eAL.class);
            intent.putExtra("root_wallet_id", str);
            context.startActivity(intent);
        }
    }

    private final void AEQbTJ() {
        java.lang.String stringExtra = getIntent().getStringExtra("root_wallet_id");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.AYXKKw = stringExtra;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C43316rmw copydefault() {
        return (C43316rmw) this.AEQbTJ.getValue();
    }

    public static final C43316rmw valueOf(final eAL eal) {
        C43316rmw c43316rmw = new C43316rmw();
        c43316rmw.register(eBX.LoaderManager.class, new eBU(new Function1() { // from class: o.eAO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return eAL.AEQbTJ(this.copydefault, (eBX.LoaderManager) obj);
            }
        }));
        return c43316rmw;
    }

    public static final Unit AEQbTJ(eAL eal, eBX.LoaderManager loaderManager) {
        Intrinsics.checkNotNullParameter(loaderManager, "");
        eal.KWHzl(loaderManager);
        return Unit.INSTANCE;
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.KWHzl = (AbstractC16328ehp) DataBindingUtil.setContentView(this, C13754dXa.TaskDescription.zsXlph);
        AEQbTJ();
        KWHzl();
    }

    private final void KWHzl() {
        if (this.AYXKKw.length() == 0) {
            finish();
            return;
        }
        AbstractC16328ehp abstractC16328ehp = this.KWHzl;
        AbstractC16328ehp abstractC16328ehp2 = null;
        if (abstractC16328ehp == null) {
            Intrinsics.gEmmrt("");
            abstractC16328ehp = null;
        }
        abstractC16328ehp.EZpvd.setAppBarTitle(C33070mpX.AYXKKw(C13754dXa.FragmentManager.OnBackPressedDispatcher1));
        AbstractC16328ehp abstractC16328ehp3 = this.KWHzl;
        if (abstractC16328ehp3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC16328ehp2 = abstractC16328ehp3;
        }
        abstractC16328ehp2.OLrzqt.setAdapter(copydefault());
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        EZpvd();
    }

    private final void EZpvd() {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new DefiWalletAccountListActivity$refreshListData$1(this, null), 3, null);
    }

    public final void KWHzl(eBX.LoaderManager loaderManager) {
        ActivityC18691fnF.Companion.AEQbTJ(this, loaderManager.KWHzl(), "", 1);
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
