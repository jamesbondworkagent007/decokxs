package o;

import androidx.databinding.DataBindingUtil;
import com.okinc.business.defi.api.bean.PlatformItem;
import com.okinc.dapp.bean.DappChains;
import com.okinc.network.okg.cor.SubdomainStrategy;
import com.okinc.rxutils.RxBus;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.dBW;
import o.dLX;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class dBQ extends AbstractActivityC33041mov {
    public static Function0<Unit> OLrzqt;
    public Function0<Unit> EZpvd;
    public AbstractC13459dMc KWHzl;
    public static final Activity Companion = new Activity(null);
    public static final int copydefault = 8;

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.dBQ.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final void copydefault(Function0<Unit> function0) {
            dBQ.OLrzqt = function0;
        }

        public final void KWHzl(@NotNull android.app.Activity activity, @NotNull PlatformItem platformItem, java.util.List<DappChains> list, java.lang.String str, java.lang.Long l, Function0<Unit> function0, boolean z, boolean z2, @NotNull java.lang.String str2, java.lang.String str3, int[] iArr) {
            Intrinsics.checkNotNullParameter(activity, "");
            Intrinsics.checkNotNullParameter(platformItem, "");
            Intrinsics.checkNotNullParameter(str2, "");
            activity.startActivity(getIntent$default(this, activity, platformItem, list, str, l, function0, z, z2, str2, false, str3, iArr, 512, null));
        }

        /* JADX DEBUG: Multi-variable search result rejected for r16v0, resolved type: o.dBQ$Activity */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ android.content.Intent getIntent$default(Activity activity, android.content.Context context, PlatformItem platformItem, java.util.List list, java.lang.String str, java.lang.Long l, Function0 function0, boolean z, boolean z2, java.lang.String str2, boolean z3, java.lang.String str3, int[] iArr, int i, java.lang.Object obj) {
            return activity.AEQbTJ(context, platformItem, (i & 4) != 0 ? null : list, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : l, (i & 32) != 0 ? null : function0, (i & 64) != 0 ? false : z, (i & 128) != 0 ? false : z2, (i & 256) != 0 ? SubdomainStrategy.Global.INSTANCE.toString() : str2, (i & 512) != 0 ? false : z3, (i & 1024) != 0 ? "" : str3, (i & 2048) != 0 ? null : iArr);
        }

        public final android.content.Intent AEQbTJ(@NotNull android.content.Context context, @NotNull PlatformItem platformItem, java.util.List<DappChains> list, java.lang.String str, java.lang.Long l, Function0<Unit> function0, boolean z, boolean z2, @NotNull java.lang.String str2, boolean z3, java.lang.String str3, int[] iArr) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(platformItem, "");
            Intrinsics.checkNotNullParameter(str2, "");
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("item", platformItem);
            if (l != null) {
                l.longValue();
                intent.putExtra("chainid_default", l.longValue());
            }
            Intrinsics.copydefault(list, "");
            intent.putExtra("chains", (java.io.Serializable) list);
            copydefault(function0);
            intent.putExtra("wallet_id", str);
            intent.putExtra("IS_FROM_OUT", z);
            intent.putExtra("SHOW_TIP", z2);
            intent.putExtra("subdomainstrategy", str2);
            intent.putExtra("isFromNotification", z3);
            intent.putExtra("source", str3);
            intent.putExtra("TRANSITION_ANIM", iArr);
            intent.setClass(context, dBQ.class);
            return intent;
        }

        public static /* synthetic */ void newInstanceFromFastEntrance$default(Activity activity, android.app.Activity activity2, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 2) != 0) {
                str = "";
            }
            activity.KWHzl(activity2, str);
        }

        public final void KWHzl(@NotNull android.app.Activity activity, java.lang.String str) {
            Intrinsics.checkNotNullParameter(activity, "");
            RxBus.AEQbTJ(new dIO(""));
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("IS_FROM_FAST_ENTRANCE", true);
            intent.setClass(activity, dBQ.class);
            intent.putExtra("IS_FROM_OUT", true);
            intent.putExtra("source", str);
            activity.startActivity(intent);
            C14742drG.KWHzl.EZpvd();
        }
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.KWHzl = (AbstractC13459dMc) DataBindingUtil.setContentView(this, dLX.Fragment.copydefault);
        android.content.Intent intent = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "");
        OLrzqt(intent);
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.dBW.ActionBar.newInstance$default(o.dBW$ActionBar, com.okinc.business.defi.api.bean.PlatformItem, java.util.List, java.lang.String, java.lang.Long, kotlin.jvm.functions.Function0, boolean, boolean, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String, int, java.lang.Object):o.dBW */
    public final void OLrzqt(android.content.Intent intent) {
        java.lang.String string;
        java.util.List arrayList;
        java.lang.String stringExtra;
        boolean booleanExtra = intent != null ? intent.getBooleanExtra("IS_FROM_FAST_ENTRANCE", false) : false;
        java.lang.String str = (intent == null || (stringExtra = intent.getStringExtra("source")) == null) ? "" : stringExtra;
        boolean booleanExtra2 = intent != null ? intent.getBooleanExtra("IS_FROM_OUT", false) : false;
        if (!booleanExtra) {
            if (intent == null || (string = intent.getStringExtra("subdomainstrategy")) == null) {
                string = SubdomainStrategy.Global.INSTANCE.toString();
            }
            java.lang.String str2 = string;
            PlatformItem platformItem = intent != null ? (PlatformItem) intent.getParcelableExtra("item") : null;
            if ((intent != null ? intent.getSerializableExtra("chains") : null) == null) {
                arrayList = new java.util.ArrayList();
            } else {
                java.io.Serializable serializableExtra = intent != null ? intent.getSerializableExtra("chains") : null;
                Intrinsics.copydefault(serializableExtra, "");
                arrayList = (java.util.List) serializableExtra;
            }
            java.util.List list = arrayList;
            java.lang.Long lValueOf = intent != null ? java.lang.Long.valueOf(intent.getLongExtra("chainid_default", 1L)) : null;
            java.lang.String stringExtra2 = intent.getStringExtra("wallet_id");
            java.lang.String str3 = stringExtra2 == null ? "" : stringExtra2;
            boolean booleanExtra3 = intent.getBooleanExtra("SHOW_TIP", false);
            androidx.fragment.app.FragmentTransaction fragmentTransactionBeginTransaction = getSupportFragmentManager().beginTransaction();
            int i = dLX.Application.aKErDB;
            dBW.ActionBar actionBar = dBW.Companion;
            Intrinsics.copydefault(platformItem);
            fragmentTransactionBeginTransaction.replace(i, actionBar.EZpvd(platformItem, (1536 & 2) != 0 ? null : list, (1536 & 4) != 0 ? null : str3, (1536 & 8) != 0 ? null : lValueOf, (1536 & 16) != 0 ? null : OLrzqt, (1536 & 32) != 0 ? false : booleanExtra2, (1536 & 64) == 0 ? booleanExtra3 : false, (1536 & 128) != 0 ? SubdomainStrategy.Global.INSTANCE.toString() : str2, (1536 & 256) != 0 ? "" : str, (1536 & 512) != 0 ? java.lang.Boolean.FALSE : null, (1536 & 1024) == 0 ? null : null)).commitAllowingStateLoss();
            return;
        }
        getSupportFragmentManager().beginTransaction().replace(dLX.Application.aKErDB, dBW.ActionBar.newInstanceFromFastEntrance$default(dBW.Companion, null, null, null, 7, null)).commitAllowingStateLoss();
    }

    @Override // o.AbstractActivityC33041mov, androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(@NotNull final android.content.Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "");
        super.onNewIntent(intent);
        this.EZpvd = new Function0() { // from class: o.dBS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return dBQ.KWHzl(this.EZpvd, intent);
            }
        };
    }

    public static final Unit KWHzl(dBQ dbq, android.content.Intent intent) {
        dbq.OLrzqt(intent);
        return Unit.INSTANCE;
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        Function0<Unit> function0 = this.EZpvd;
        if (function0 != null) {
            function0.invoke();
            this.EZpvd = null;
        }
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
