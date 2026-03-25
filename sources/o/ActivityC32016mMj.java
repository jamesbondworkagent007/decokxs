package o;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.components.track.amplitude.AmplitudeName;
import com.okinc.core.util.SPUtils;
import java.util.Map;
import java.util.SortedMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C31973mKu;
import o.C31976mKx;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mMj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class ActivityC32016mMj extends AbstractActivityC33041mov implements C31973mKu.Application {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int EZpvd = 8;
    public java.util.ArrayList<C31973mKu.Activity> AEQbTJ;
    public RecyclerView OLrzqt;
    public final ActivityResultLauncher<android.content.Intent> copydefault;
    public final InterfaceC56387yDm KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.mMg
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return ActivityC32016mMj.EZpvd(this.KWHzl);
        }
    });
    public final InterfaceC56387yDm djBIcL = C56392yDr.copydefault(new Function0() { // from class: o.mMi
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return ActivityC32016mMj.AYXKKw(this.AEQbTJ);
        }
    });
    public final InterfaceC56387yDm AYXKKw = C56392yDr.copydefault(new Function0() { // from class: o.mMh
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return ActivityC32016mMj.djBIcL(this.KWHzl);
        }
    });

    public ActivityC32016mMj() {
        ActivityResultLauncher<android.content.Intent> activityResultLauncherRegisterForActivityResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: o.mMk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                ActivityC32016mMj.OLrzqt(this.EZpvd, (ActivityResult) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "");
        this.copydefault = activityResultLauncherRegisterForActivityResult;
    }

    private final AmplitudeName OLrzqt() {
        return (AmplitudeName) this.KWHzl.getValue();
    }

    public static final AmplitudeName EZpvd(ActivityC32016mMj activityC32016mMj) {
        java.io.Serializable serializableExtra = activityC32016mMj.getIntent().getSerializableExtra("EXT_AMP_NAME");
        Intrinsics.copydefault(serializableExtra, "");
        return (AmplitudeName) serializableExtra;
    }

    public static final LI AYXKKw(ActivityC32016mMj activityC32016mMj) {
        return C32905mmR.EZpvd.OLrzqt(activityC32016mMj.OLrzqt());
    }

    public final LI EZpvd() {
        return (LI) this.djBIcL.getValue();
    }

    private final java.lang.String KWHzl() {
        return (java.lang.String) this.AYXKKw.getValue();
    }

    public static final java.lang.String djBIcL(ActivityC32016mMj activityC32016mMj) {
        return activityC32016mMj.OLrzqt() == AmplitudeName.CEFI ? "cefi_ab_test" : "web3_ab_test";
    }

    public static final void OLrzqt(ActivityC32016mMj activityC32016mMj, ActivityResult activityResult) {
        if (activityResult.getResultCode() == -1) {
            android.content.Intent data = activityResult.getData();
            java.lang.String stringExtra = data != null ? data.getStringExtra("Flag") : null;
            java.util.ArrayList<C31973mKu.Activity> arrayList = activityC32016mMj.AEQbTJ;
            if (arrayList == null) {
                Intrinsics.gEmmrt("");
                arrayList = null;
            }
            int i = 0;
            for (java.lang.Object obj : arrayList) {
                if (i < 0) {
                    yDY.AYXKKw();
                }
                C31973mKu.Activity activity = (C31973mKu.Activity) obj;
                if (Intrinsics.EZpvd((java.lang.Object) activity.OLrzqt(), (java.lang.Object) stringExtra) && activity.KWHzl()) {
                    activity.OLrzqt(SPUtils.getString(stringExtra, null, activityC32016mMj.KWHzl()));
                    RecyclerView recyclerView = activityC32016mMj.OLrzqt;
                    if (recyclerView == null) {
                        Intrinsics.gEmmrt("");
                        recyclerView = null;
                    }
                    RecyclerView.Adapter adapter = recyclerView.getAdapter();
                    if (adapter != null) {
                        adapter.notifyItemChanged(i);
                    }
                }
                if (Intrinsics.EZpvd((java.lang.Object) activity.OLrzqt(), (java.lang.Object) stringExtra) && activity.AEQbTJ()) {
                    activity.OLrzqt(SPUtils.getString("payload_key_prefix_" + stringExtra, null, activityC32016mMj.KWHzl()));
                    RecyclerView recyclerView2 = activityC32016mMj.OLrzqt;
                    if (recyclerView2 == null) {
                        Intrinsics.gEmmrt("");
                        recyclerView2 = null;
                    }
                    RecyclerView.Adapter adapter2 = recyclerView2.getAdapter();
                    if (adapter2 != null) {
                        adapter2.notifyItemChanged(i);
                    }
                }
                i++;
            }
        }
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        LJ ljAEQbTJ;
        super.onCreate(bundle);
        setContentView(C31976mKx.Application.fIwbmz);
        java.util.ArrayList<C31973mKu.Activity> arrayList = new java.util.ArrayList<>();
        LI liEZpvd = EZpvd();
        RecyclerView recyclerView = null;
        java.util.Map<java.lang.String, LP> mapCopydefault = liEZpvd != null ? liEZpvd.copydefault() : null;
        if (mapCopydefault == null) {
            mapCopydefault = C56424yEw.KWHzl();
        }
        SortedMap sortedMapGEmmrt = C56423yEv.gEmmrt(mapCopydefault);
        arrayList.add(new C31973mKu.Activity("User info", null, null, false, false, 30, null));
        LI liEZpvd2 = EZpvd();
        arrayList.add(new C31973mKu.Activity("User info", "", java.lang.String.valueOf((liEZpvd2 == null || (ljAEQbTJ = liEZpvd2.AEQbTJ()) == null) ? null : ljAEQbTJ.AEQbTJ()), false, false, 24, null));
        for (Map.Entry entry : sortedMapGEmmrt.entrySet()) {
            java.lang.String str = (java.lang.String) entry.getKey();
            LP lp = (LP) entry.getValue();
            Intrinsics.copydefault((java.lang.Object) str);
            arrayList.add(new C31973mKu.Activity(str, null, null, false, false, 30, null));
            arrayList.add(new C31973mKu.Activity(str, "Value", java.lang.String.valueOf(lp != null ? lp.OLrzqt : null), false, false, 24, null));
            arrayList.add(new C31973mKu.Activity(str, "Override value", SPUtils.getString(str, null, KWHzl()), true, false));
            arrayList.add(new C31973mKu.Activity(str, "Payload", java.lang.String.valueOf(lp != null ? lp.AEQbTJ : null), false, false, 24, null));
            arrayList.add(new C31973mKu.Activity(str, "Override payload", SPUtils.getString("payload_key_prefix_" + str, null, KWHzl()), false, true));
        }
        this.AEQbTJ = arrayList;
        if (OLrzqt() == AmplitudeName.CEFI) {
            ((C33537myN) findViewById(C31976mKx.Activity.AEQbTJ)).setAppBarTitle("Cefi(" + sortedMapGEmmrt.size() + " flags)");
        } else {
            ((C33537myN) findViewById(C31976mKx.Activity.AEQbTJ)).setAppBarTitle("Web3(" + sortedMapGEmmrt.size() + " flags)");
        }
        RecyclerView recyclerView2 = (RecyclerView) findViewById(C31976mKx.Activity.QkdxfA);
        this.OLrzqt = recyclerView2;
        if (recyclerView2 == null) {
            Intrinsics.gEmmrt("");
            recyclerView2 = null;
        }
        recyclerView2.setLayoutManager(new LinearLayoutManager(this));
        RecyclerView recyclerView3 = this.OLrzqt;
        if (recyclerView3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            recyclerView = recyclerView3;
        }
        recyclerView.setAdapter(new C31973mKu(arrayList, this));
        C55230xfy c55230xfy = (C55230xfy) findViewById(C31976mKx.Activity.OJuSTm);
        c55230xfy.KWHzl().setContentDescription("PDSkylabFlagFilterTextField");
        c55230xfy.KWHzl().addTextChangedListener(new Activity(arrayList, this));
    }

    /* JADX INFO: renamed from: o.mMj$Activity */
    public static final class Activity implements android.text.TextWatcher {
        public final /* synthetic */ ActivityC32016mMj EZpvd;
        public final /* synthetic */ java.util.ArrayList KWHzl;

        @Override // android.text.TextWatcher
        public void beforeTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        public Activity(java.util.ArrayList arrayList, ActivityC32016mMj activityC32016mMj) {
            this.KWHzl = arrayList;
            this.EZpvd = activityC32016mMj;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(android.text.Editable editable) {
            java.lang.String string;
            if (editable == null || (string = editable.toString()) == null) {
                string = "";
            }
            RecyclerView recyclerView = null;
            if (string.length() <= 0) {
                this.EZpvd.AEQbTJ = this.KWHzl;
                RecyclerView recyclerView2 = this.EZpvd.OLrzqt;
                if (recyclerView2 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    recyclerView = recyclerView2;
                }
                recyclerView.setAdapter(new C31973mKu(this.KWHzl, this.EZpvd));
                return;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (C31973mKu.Activity activity : this.KWHzl) {
                if (StringsKt__StringsKt.AhwBna((java.lang.CharSequence) activity.OLrzqt(), (java.lang.CharSequence) string, true)) {
                    arrayList.add(activity);
                }
            }
            this.EZpvd.AEQbTJ = arrayList;
            RecyclerView recyclerView3 = this.EZpvd.OLrzqt;
            if (recyclerView3 == null) {
                Intrinsics.gEmmrt("");
            } else {
                recyclerView = recyclerView3;
            }
            recyclerView.setAdapter(new C31973mKu(arrayList, this.EZpvd));
        }
    }

    @Override // o.C31973mKu.Application
    public void OLrzqt(@NotNull java.lang.String str) {
        java.util.Map<java.lang.String, LP> mapCopydefault;
        Intrinsics.checkNotNullParameter(str, "");
        LI liEZpvd = EZpvd();
        LP lp = (liEZpvd == null || (mapCopydefault = liEZpvd.copydefault()) == null) ? null : mapCopydefault.get(str);
        this.copydefault.launch(ActivityC32007mMa.Companion.copydefault(this, KWHzl(), str, lp != null ? lp.OLrzqt : null, java.lang.String.valueOf(lp != null ? lp.AEQbTJ : null)));
    }

    /* JADX INFO: renamed from: o.mMj$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.mMj.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final android.content.Intent copydefault(@NotNull android.content.Context context, @NotNull AmplitudeName amplitudeName) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(amplitudeName, "");
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) ActivityC32016mMj.class);
            intent.putExtra("EXT_AMP_NAME", amplitudeName);
            return intent;
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
    public void onResume() {
        super.onResume();
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
