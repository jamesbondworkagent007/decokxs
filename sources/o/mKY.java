package o;

import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.applog.IAppLogInstance;
import com.huawei.hms.framework.common.ContainerUtils;
import com.okinc.components.track.ABTestManager;
import com.okinc.components.track.amplitude.AmplitudeName;
import com.okinc.core.util.SPUtils;
import com.okinc.okuser.data.User;
import com.okinc.p2p.api.OtcExtraKeys;
import com.okinc.uilab.item.OKRegularCell;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.C31976mKx;
import o.C52761wXj;
import o.mKB;
import o.mKY;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes18.dex */
public final class mKY extends AbstractActivityC33041mov implements mKB.StateListAnimator {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int EZpvd = 8;
    public java.util.ArrayList<mKB.Application> AYXKKw;
    public wYD AhwBna;
    public RecyclerView djBIcL;
    public C55230xfy gEmmrt;
    public wYD valueOf;
    public final InterfaceC56387yDm AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.mKZ
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return mKY.djBIcL(this.copydefault);
        }
    });
    public final InterfaceC56387yDm OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.mLc
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return mKY.copydefault(this.EZpvd);
        }
    });
    public final InterfaceC56387yDm fetchVPNInfo = C56392yDr.copydefault(new Function0() { // from class: o.mLb
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return mKY.AYXKKw(this.OLrzqt);
        }
    });
    public java.util.ArrayList<mKB.Application> KWHzl = new java.util.ArrayList<>();
    public boolean AkhnZx = true;
    public boolean values = true;
    public final FragmentManager copydefault = new FragmentManager();

    public final AmplitudeName AEQbTJ() {
        return (AmplitudeName) this.AEQbTJ.getValue();
    }

    public static final AmplitudeName djBIcL(mKY mky) {
        java.io.Serializable serializableExtra = mky.getIntent().getSerializableExtra("EXT_AMP_NAME");
        Intrinsics.copydefault(serializableExtra, "");
        return (AmplitudeName) serializableExtra;
    }

    public final IAppLogInstance KWHzl() {
        return (IAppLogInstance) this.OLrzqt.getValue();
    }

    public static final IAppLogInstance copydefault(mKY mky) {
        return C32902mmO.KWHzl.EZpvd(mky.AEQbTJ());
    }

    public static final java.lang.String AYXKKw(mKY mky) {
        return mky.AEQbTJ() == AmplitudeName.CEFI ? "cefi_ab_test" : "web3_ab_test";
    }

    private final java.lang.String valueOf() {
        return (java.lang.String) this.fetchVPNInfo.getValue();
    }

    public static final class FragmentManager implements InterfaceC32861mla {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC32861mla
        public void EZpvd(AmplitudeName amplitudeName) {
            Intrinsics.checkNotNullParameter(amplitudeName, "");
        }

        public FragmentManager() {
        }

        @Override // o.InterfaceC32861mla
        public void KWHzl(AmplitudeName amplitudeName) {
            Intrinsics.checkNotNullParameter(amplitudeName, "");
            final mKY mky = mKY.this;
            mky.runOnUiThread(new java.lang.Runnable() { // from class: o.mLw
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    mKY.FragmentManager.KWHzl(mky);
                }
            });
        }

        public static final void KWHzl(mKY mky) {
            if (mky.isFinishing() || mky.isDestroyed()) {
                return;
            }
            mky.OLrzqt();
        }
    }

    public static final class PendingIntent implements android.text.TextWatcher {
        @Override // android.text.TextWatcher
        public void beforeTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        public PendingIntent() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(android.text.Editable editable) {
            java.lang.String string;
            if (editable == null || (string = editable.toString()) == null) {
                string = "";
            }
            mKY.this.EZpvd(string);
        }
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C31976mKx.Application.AuCTel);
        ABTestManager.AEQbTJ.KWHzl(this.copydefault, AEQbTJ());
        kotlin.Pair<java.util.ArrayList<mKB.Application>, java.lang.Integer> pairEZpvd = EZpvd();
        java.util.ArrayList<mKB.Application> arrayListComponent1 = pairEZpvd.component1();
        int iIntValue = pairEZpvd.component2().intValue();
        this.AYXKKw = arrayListComponent1;
        this.KWHzl = new java.util.ArrayList<>(arrayListComponent1);
        copydefault(iIntValue);
        this.AhwBna = (wYD) findViewById(C31976mKx.Activity.giSNqX);
        this.valueOf = (wYD) findViewById(C31976mKx.Activity.djSkpj);
        wYD wyd = this.AhwBna;
        C55230xfy c55230xfy = null;
        if (wyd == null) {
            Intrinsics.gEmmrt("");
            wyd = null;
        }
        wyd.setOKDSSize(-3);
        wYD wyd2 = this.valueOf;
        if (wyd2 == null) {
            Intrinsics.gEmmrt("");
            wyd2 = null;
        }
        wyd2.setOKDSSize(-3);
        wYD wyd3 = this.AhwBna;
        if (wyd3 == null) {
            Intrinsics.gEmmrt("");
            wyd3 = null;
        }
        wyd3.setOnClickListener(new View.OnClickListener() { // from class: o.mLa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                mKY.KWHzl(this.copydefault, view);
            }
        });
        wYD wyd4 = this.valueOf;
        if (wyd4 == null) {
            Intrinsics.gEmmrt("");
            wyd4 = null;
        }
        wyd4.setOnClickListener(new View.OnClickListener() { // from class: o.mLh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                mKY.copydefault(this.AEQbTJ, view);
            }
        });
        RecyclerView recyclerView = (RecyclerView) findViewById(C31976mKx.Activity.QkdxfA);
        this.djBIcL = recyclerView;
        if (recyclerView == null) {
            Intrinsics.gEmmrt("");
            recyclerView = null;
        }
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        RecyclerView recyclerView2 = this.djBIcL;
        if (recyclerView2 == null) {
            Intrinsics.gEmmrt("");
            recyclerView2 = null;
        }
        recyclerView2.setAdapter(new mKB(arrayListComponent1, this));
        C55230xfy c55230xfy2 = (C55230xfy) findViewById(C31976mKx.Activity.OJuSTm);
        this.gEmmrt = c55230xfy2;
        if (c55230xfy2 == null) {
            Intrinsics.gEmmrt("");
            c55230xfy2 = null;
        }
        c55230xfy2.KWHzl().setContentDescription("PDSkylabFlagFilterTextField");
        C55230xfy c55230xfy3 = this.gEmmrt;
        if (c55230xfy3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c55230xfy = c55230xfy3;
        }
        c55230xfy.KWHzl().addTextChangedListener(new PendingIntent());
    }

    public static final void KWHzl(mKY mky, android.view.View view) {
        mky.AhwBna();
    }

    public static final void copydefault(mKY mky, android.view.View view) {
        mky.copydefault();
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        ABTestManager.AEQbTJ.EZpvd(this.copydefault, AEQbTJ());
        super.onDestroy();
    }

    public final void OLrzqt() {
        java.lang.String string;
        kotlin.Pair<java.util.ArrayList<mKB.Application>, java.lang.Integer> pairEZpvd = EZpvd();
        java.util.ArrayList<mKB.Application> arrayListComponent1 = pairEZpvd.component1();
        int iIntValue = pairEZpvd.component2().intValue();
        this.AYXKKw = arrayListComponent1;
        this.KWHzl = new java.util.ArrayList<>(arrayListComponent1);
        copydefault(iIntValue);
        RecyclerView recyclerView = this.djBIcL;
        java.lang.String str = "";
        C55230xfy c55230xfy = null;
        if (recyclerView == null) {
            Intrinsics.gEmmrt("");
            recyclerView = null;
        }
        java.util.ArrayList<mKB.Application> arrayList = this.AYXKKw;
        if (arrayList == null) {
            Intrinsics.gEmmrt("");
            arrayList = null;
        }
        recyclerView.setAdapter(new mKB(arrayList, this));
        C55230xfy c55230xfy2 = this.gEmmrt;
        if (c55230xfy2 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c55230xfy = c55230xfy2;
        }
        android.text.Editable text = c55230xfy.KWHzl().getText();
        if (text != null && (string = text.toString()) != null) {
            str = string;
        }
        if (str.length() > 0) {
            EZpvd(str);
        }
    }

    public final kotlin.Pair<java.util.ArrayList<mKB.Application>, java.lang.Integer> EZpvd() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        SortedMap<java.lang.String, java.lang.Object> sortedMapEZpvd = EZpvd(KWHzl().getAllAbTestConfigs());
        if (sortedMapEZpvd != null) {
            java.util.Iterator<Map.Entry<java.lang.String, java.lang.Object>> it = sortedMapEZpvd.entrySet().iterator();
            while (it.hasNext()) {
                java.lang.String key = it.next().getKey();
                Intrinsics.copydefault((java.lang.Object) key);
                arrayList.add(new mKB.Application(key, null, null, false, false, false, 62, null));
                java.lang.String string = SPUtils.getString(key, null, valueOf());
                boolean z = string != null;
                if (string == null) {
                    string = java.lang.String.valueOf(OLrzqt(key));
                }
                arrayList.add(new mKB.Application(key, "value", string, true, false, z));
                java.lang.String string2 = SPUtils.getString("payload_key_prefix_" + key, null, valueOf());
                boolean z2 = string2 != null;
                if (string2 == null) {
                    string2 = java.lang.String.valueOf(AEQbTJ(key));
                }
                arrayList.add(new mKB.Application(key, "payload", string2, false, true, z2));
            }
        }
        return new kotlin.Pair<>(arrayList, java.lang.Integer.valueOf(sortedMapEZpvd != null ? sortedMapEZpvd.size() : 0));
    }

    public final void copydefault(int i) {
        if (AEQbTJ() == AmplitudeName.CEFI) {
            ((C33537myN) findViewById(C31976mKx.Activity.AEQbTJ)).setAppBarTitle("Cefi V2 (" + i + " flags)");
            return;
        }
        ((C33537myN) findViewById(C31976mKx.Activity.AEQbTJ)).setAppBarTitle("Web3 V2 (" + i + " flags)");
    }

    public final SortedMap<java.lang.String, java.lang.Object> EZpvd(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        TreeMap treeMap = new TreeMap();
        java.util.Iterator<java.lang.String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            java.lang.String next = itKeys.next();
            treeMap.put(next, jSONObject.get(next));
        }
        return treeMap;
    }

    public static /* synthetic */ void applyFilterAndSearch$default(mKY mky, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        mky.EZpvd(str);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: java.util.ArrayList<o.mKB$Application> */
    /* JADX WARN: Multi-variable type inference failed */
    public final void EZpvd(java.lang.String str) {
        java.util.ArrayList<mKB.Application> arrayList = new java.util.ArrayList<>();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        int i = 0;
        int i2 = 0;
        while (true) {
            boolean z = true;
            if (i2 >= this.KWHzl.size()) {
                break;
            }
            int i3 = i2 + 2;
            if (i3 < this.KWHzl.size()) {
                mKB.Application application = this.KWHzl.get(i2);
                Intrinsics.checkNotNullExpressionValue(application, "");
                mKB.Application application2 = application;
                mKB.Application application3 = this.KWHzl.get(i2 + 1);
                Intrinsics.checkNotNullExpressionValue(application3, "");
                mKB.Application application4 = application3;
                mKB.Application application5 = this.KWHzl.get(i3);
                Intrinsics.checkNotNullExpressionValue(application5, "");
                mKB.Application application6 = application5;
                if (!application4.copydefault() && !application6.copydefault()) {
                    z = false;
                }
                if ((this.AkhnZx && z) || (this.values && !z)) {
                    arrayList2.add(application2);
                    arrayList2.add(application4);
                    arrayList2.add(application6);
                }
                i2 += 3;
            } else {
                i2++;
            }
        }
        if (str.length() > 0) {
            while (i < arrayList2.size()) {
                java.lang.Object obj = arrayList2.get(i);
                Intrinsics.checkNotNullExpressionValue(obj, "");
                mKB.Application application7 = (mKB.Application) obj;
                if (application7.KWHzl().length() == 0 && StringsKt__StringsKt.AhwBna((java.lang.CharSequence) application7.OLrzqt(), (java.lang.CharSequence) str, true)) {
                    arrayList.add(application7);
                    int i4 = i + 1;
                    if (i4 < arrayList2.size() && ((mKB.Application) arrayList2.get(i4)).KWHzl().length() > 0) {
                        arrayList.add(arrayList2.get(i4));
                    }
                    int i5 = i + 2;
                    if (i5 < arrayList2.size() && ((mKB.Application) arrayList2.get(i5)).KWHzl().length() > 0) {
                        arrayList.add(arrayList2.get(i5));
                    }
                    i += 3;
                } else {
                    i++;
                }
            }
        } else {
            arrayList.addAll(arrayList2);
        }
        this.AYXKKw = arrayList;
        RecyclerView recyclerView = this.djBIcL;
        if (recyclerView == null) {
            Intrinsics.gEmmrt("");
            recyclerView = null;
        }
        recyclerView.setAdapter(new mKB(arrayList, this));
    }

    public final void AhwBna() {
        User userOLrzqt = C43292rmY.OLrzqt.AwvSrB().OLrzqt();
        java.lang.String tk = userOLrzqt != null ? userOLrzqt.getTk() : null;
        if (tk == null) {
            tk = "";
        }
        if (tk.length() == 0) {
            tk = "unknow_user_id";
        }
        Application applicationOLrzqt = Application.Companion.OLrzqt("DataTester_deviceID=" + KWHzl().getDid() + ", DataTester_SSID=" + KWHzl().getSsid() + ", DataTester_userUniqueID=" + KWHzl().getUserUniqueID() + ", device_id=" + xVW.copydefault() + ", user_id=" + tk);
        androidx.fragment.app.FragmentManager supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
        applicationOLrzqt.show(supportFragmentManager);
    }

    public final void copydefault() {
        Activity activityKWHzl = Activity.Companion.KWHzl(this.AkhnZx, this.values, new Function2() { // from class: o.mLd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return mKY.EZpvd(this.OLrzqt, ((java.lang.Boolean) obj).booleanValue(), ((java.lang.Boolean) obj2).booleanValue());
            }
        });
        androidx.fragment.app.FragmentManager supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
        activityKWHzl.show(supportFragmentManager);
    }

    public static final Unit EZpvd(mKY mky, boolean z, boolean z2) {
        mky.AkhnZx = z;
        mky.values = z2;
        mky.djBIcL();
        return Unit.INSTANCE;
    }

    @Override // o.mKB.StateListAnimator
    public void EZpvd(@NotNull java.lang.String str, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "");
        if (z) {
            StateListAnimator stateListAnimatorAEQbTJ = StateListAnimator.Companion.AEQbTJ(valueOf(), str, OLrzqt(str), copydefault(str), new Function1() { // from class: o.mLf
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return mKY.KWHzl(this.KWHzl, (java.lang.String) obj);
                }
            });
            androidx.fragment.app.FragmentManager supportFragmentManager = getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
            stateListAnimatorAEQbTJ.show(supportFragmentManager);
            return;
        }
        if (z2) {
            ActionBar actionBarKWHzl = ActionBar.Companion.KWHzl(valueOf(), str, java.lang.String.valueOf(AEQbTJ(str)), copydefault(str), new Function1() { // from class: o.mLg
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return mKY.copydefault(this.EZpvd, (java.lang.String) obj);
                }
            });
            androidx.fragment.app.FragmentManager supportFragmentManager2 = getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager2, "");
            actionBarKWHzl.show(supportFragmentManager2);
        }
    }

    public static final Unit KWHzl(mKY mky, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        java.util.ArrayList<mKB.Application> arrayList = mky.AYXKKw;
        if (arrayList == null) {
            Intrinsics.gEmmrt("");
            arrayList = null;
        }
        int i = 0;
        for (java.lang.Object obj : arrayList) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            mKB.Application application = (mKB.Application) obj;
            if (Intrinsics.EZpvd((java.lang.Object) application.OLrzqt(), (java.lang.Object) str) && application.AYXKKw()) {
                java.lang.String string = SPUtils.getString(str, null, mky.valueOf());
                application.EZpvd(string == null ? java.lang.String.valueOf(mky.OLrzqt(str)) : string);
                application.copydefault(string != null);
                RecyclerView recyclerView = mky.djBIcL;
                if (recyclerView == null) {
                    Intrinsics.gEmmrt("");
                    recyclerView = null;
                }
                RecyclerView.Adapter adapter = recyclerView.getAdapter();
                if (adapter != null) {
                    adapter.notifyItemChanged(i);
                }
            }
            if (Intrinsics.EZpvd((java.lang.Object) application.OLrzqt(), (java.lang.Object) str) && application.AEQbTJ()) {
                java.lang.String string2 = SPUtils.getString("payload_key_prefix_" + str, null, mky.valueOf());
                application.EZpvd(string2 == null ? java.lang.String.valueOf(mky.AEQbTJ(str)) : string2);
                application.copydefault(string2 != null);
                RecyclerView recyclerView2 = mky.djBIcL;
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
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(mKY mky, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        java.util.ArrayList<mKB.Application> arrayList = mky.AYXKKw;
        if (arrayList == null) {
            Intrinsics.gEmmrt("");
            arrayList = null;
        }
        int i = 0;
        for (java.lang.Object obj : arrayList) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            mKB.Application application = (mKB.Application) obj;
            if (Intrinsics.EZpvd((java.lang.Object) application.OLrzqt(), (java.lang.Object) str) && application.AYXKKw()) {
                java.lang.String string = SPUtils.getString(str, null, mky.valueOf());
                application.EZpvd(string == null ? java.lang.String.valueOf(mky.OLrzqt(str)) : string);
                application.copydefault(string != null);
                RecyclerView recyclerView = mky.djBIcL;
                if (recyclerView == null) {
                    Intrinsics.gEmmrt("");
                    recyclerView = null;
                }
                RecyclerView.Adapter adapter = recyclerView.getAdapter();
                if (adapter != null) {
                    adapter.notifyItemChanged(i);
                }
            }
            if (Intrinsics.EZpvd((java.lang.Object) application.OLrzqt(), (java.lang.Object) str) && application.AEQbTJ()) {
                java.lang.String string2 = SPUtils.getString("payload_key_prefix_" + str, null, mky.valueOf());
                application.EZpvd(string2 == null ? java.lang.String.valueOf(mky.AEQbTJ(str)) : string2);
                application.copydefault(string2 != null);
                RecyclerView recyclerView2 = mky.djBIcL;
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
        return Unit.INSTANCE;
    }

    public static final class Application extends wXX {
        public static final TaskDescription Companion = new TaskDescription(null);

        public static final class TaskDescription {
            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.mKY.Application.TaskDescription.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private TaskDescription() {
            }

            public final Application OLrzqt(@NotNull java.lang.String str) {
                Intrinsics.checkNotNullParameter(str, "");
                Application application = new Application();
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putString("user_info", str);
                application.setArguments(bundle);
                return application;
            }
        }

        @Override // o.wXX
        public void onCreateHeader(@NotNull C52781wYc c52781wYc) {
            Intrinsics.checkNotNullParameter(c52781wYc, "");
            c52781wYc.setType(67);
            c52781wYc.setTitle("User Information");
        }

        @Override // o.wXX
        public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
            java.lang.String string;
            boolean z;
            Intrinsics.checkNotNullParameter(constraintLayout, "");
            android.widget.ScrollView scrollView = new android.widget.ScrollView(constraintLayout.getContext());
            int i = -1;
            scrollView.setLayoutParams(new ConstraintLayout.LayoutParams(-1, -1));
            android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(constraintLayout.getContext());
            linearLayout.setOrientation(1);
            int i2 = -2;
            linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            android.os.Bundle arguments = getArguments();
            if (arguments == null || (string = arguments.getString("user_info")) == null) {
                string = "";
            }
            LinkedHashMap<java.lang.String, java.lang.String> linkedHashMapEZpvd = EZpvd(string);
            for (Map.Entry<java.lang.String, java.lang.String> entry : linkedHashMapEZpvd.entrySet()) {
                java.lang.String key = entry.getKey();
                final java.lang.String value = entry.getValue();
                final java.lang.String strKWHzl = KWHzl(key);
                android.content.Context context = constraintLayout.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                final OKRegularCell oKRegularCell = new OKRegularCell(context, null, 0, 6, null);
                oKRegularCell.setTitle(strKWHzl);
                oKRegularCell.setDescription(value);
                oKRegularCell.setCellStyle(0);
                oKRegularCell.setLayoutParams(new LinearLayout.LayoutParams(i, i2));
                android.content.Context context2 = oKRegularCell.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "");
                int iOLrzqt = C55298xhM.OLrzqt(16, context2);
                android.content.Context context3 = oKRegularCell.getContext();
                Intrinsics.checkNotNullExpressionValue(context3, "");
                int iOLrzqt2 = C55298xhM.OLrzqt(12, context3);
                android.content.Context context4 = oKRegularCell.getContext();
                Intrinsics.checkNotNullExpressionValue(context4, "");
                int iOLrzqt3 = C55298xhM.OLrzqt(16, context4);
                android.content.Context context5 = oKRegularCell.getContext();
                Intrinsics.checkNotNullExpressionValue(context5, "");
                oKRegularCell.setPadding(iOLrzqt, iOLrzqt2, iOLrzqt3, C55298xhM.OLrzqt(12, context5));
                oKRegularCell.setOnClickListener(new View.OnClickListener() { // from class: o.mLt
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view) {
                        mKY.Application.AEQbTJ(oKRegularCell, strKWHzl, value, view);
                    }
                });
                linearLayout.addView(oKRegularCell);
                java.util.Set<java.lang.String> setKeySet = linkedHashMapEZpvd.keySet();
                Intrinsics.checkNotNullExpressionValue(setKeySet, "");
                if (Intrinsics.EZpvd(CollectionsKt___CollectionsKt.aKErDB(setKeySet), (java.lang.Object) key)) {
                    z = true;
                } else {
                    android.view.View view = new android.view.View(constraintLayout.getContext());
                    view.setBackgroundColor(view.getContext().getColor(C52761wXj.Activity.fZc));
                    android.content.Context context6 = view.getContext();
                    Intrinsics.checkNotNullExpressionValue(context6, "");
                    z = true;
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, C55298xhM.OLrzqt(1, context6));
                    android.content.Context context7 = view.getContext();
                    Intrinsics.checkNotNullExpressionValue(context7, "");
                    int iOLrzqt4 = C55298xhM.OLrzqt(16, context7);
                    android.content.Context context8 = view.getContext();
                    Intrinsics.checkNotNullExpressionValue(context8, "");
                    layoutParams.setMargins(iOLrzqt4, 0, C55298xhM.OLrzqt(16, context8), 0);
                    view.setLayoutParams(layoutParams);
                    linearLayout.addView(view);
                }
                i = -1;
                i2 = -2;
            }
            scrollView.addView(linearLayout);
            ConstraintLayout.LayoutParams layoutParams2 = new ConstraintLayout.LayoutParams(-1, -1);
            layoutParams2.topToTop = 0;
            layoutParams2.startToStart = 0;
            layoutParams2.endToEnd = 0;
            layoutParams2.bottomToBottom = 0;
            Unit unit = Unit.INSTANCE;
            constraintLayout.addView(scrollView, layoutParams2);
        }

        public static final void AEQbTJ(OKRegularCell oKRegularCell, java.lang.String str, java.lang.String str2, android.view.View view) {
            java.lang.Object systemService = oKRegularCell.getContext().getSystemService("clipboard");
            Intrinsics.copydefault(systemService, "");
            ((android.content.ClipboardManager) systemService).setPrimaryClip(android.content.ClipData.newPlainText(str, str2));
            C55326xho.toastWithSuccessfulIcon$default("Copied " + str, 0, 1, (java.lang.Object) null);
        }

        public final LinkedHashMap<java.lang.String, java.lang.String> EZpvd(java.lang.String str) {
            LinkedHashMap<java.lang.String, java.lang.String> linkedHashMap = new LinkedHashMap<>();
            java.util.Iterator it = StringsKt__StringsKt.split$default((java.lang.CharSequence) C59449zhJ.replace$default(C59449zhJ.replace$default(str, "ExperimentUser(", "", false, 4, (java.lang.Object) null), ")", "", false, 4, (java.lang.Object) null), new java.lang.String[]{", "}, false, 0, 6, (java.lang.Object) null).iterator();
            while (it.hasNext()) {
                java.util.List listSplit$default = StringsKt__StringsKt.split$default((java.lang.CharSequence) it.next(), new java.lang.String[]{ContainerUtils.KEY_VALUE_DELIMITER}, false, 2, 2, (java.lang.Object) null);
                if (listSplit$default.size() == 2) {
                    linkedHashMap.put(StringsKt__StringsKt.hDKMBd((java.lang.CharSequence) listSplit$default.get(0)).toString(), StringsKt__StringsKt.hDKMBd((java.lang.CharSequence) listSplit$default.get(1)).toString());
                }
            }
            return linkedHashMap;
        }

        private final java.lang.String KWHzl(java.lang.String str) {
            return CollectionsKt___CollectionsKt.joinToString$default(StringsKt__StringsKt.split$default((java.lang.CharSequence) C59449zhJ.replace$default(str, "_", " ", false, 4, (java.lang.Object) null), new java.lang.String[]{" "}, false, 0, 6, (java.lang.Object) null), " ", null, null, 0, null, new Function1() { // from class: o.mLv
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return mKY.Application.OLrzqt((java.lang.String) obj);
                }
            }, 30, null);
        }

        public static final java.lang.CharSequence OLrzqt(java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            if (str.length() <= 0) {
                return str;
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            java.lang.String strValueOf = java.lang.String.valueOf(str.charAt(0));
            Intrinsics.copydefault(strValueOf, "");
            java.lang.String upperCase = strValueOf.toUpperCase(java.util.Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "");
            sb.append((java.lang.Object) upperCase);
            java.lang.String strSubstring = str.substring(1);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "");
            sb.append(strSubstring);
            return sb.toString();
        }
    }

    public static final class StateListAnimator extends wXX {
        public static final TaskDescription Companion = new TaskDescription(null);
        public static final int copydefault = 8;
        public final boolean AEQbTJ = true;
        public java.lang.String AhwBna;
        public java.lang.String EZpvd;
        public Function1<? super java.lang.String, Unit> KWHzl;
        public boolean OLrzqt;
        public android.widget.EditText djBIcL;
        public java.lang.String gEmmrt;
        public C55239xgG valueOf;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.wXX
        public boolean isFullScreen() {
            return this.AEQbTJ;
        }

        public static final class TaskDescription {
            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.mKY.StateListAnimator.TaskDescription.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private TaskDescription() {
            }

            public static /* synthetic */ StateListAnimator newInstance$default(TaskDescription taskDescription, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z, Function1 function1, int i, java.lang.Object obj) {
                if ((i & 8) != 0) {
                    z = false;
                }
                return taskDescription.AEQbTJ(str, str2, str3, z, function1);
            }

            public final StateListAnimator AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.String str3, boolean z, @NotNull Function1<? super java.lang.String, Unit> function1) {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
                Intrinsics.checkNotNullParameter(function1, "");
                StateListAnimator stateListAnimator = new StateListAnimator();
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putString("sp_name", str);
                bundle.putString(OtcExtraKeys.FLAG, str2);
                bundle.putString("value", str3);
                bundle.putBoolean("isLegacy", z);
                stateListAnimator.setArguments(bundle);
                stateListAnimator.KWHzl = function1;
                return stateListAnimator;
            }
        }

        @Override // o.wXX, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
        public void onCreate(android.os.Bundle bundle) {
            super.onCreate(bundle);
            android.os.Bundle arguments = getArguments();
            if (arguments != null) {
                java.lang.String string = arguments.getString("sp_name");
                if (string == null) {
                    string = "";
                }
                this.gEmmrt = string;
                java.lang.String string2 = arguments.getString(OtcExtraKeys.FLAG);
                this.EZpvd = string2 != null ? string2 : "";
                this.AhwBna = arguments.getString("value");
                this.OLrzqt = arguments.getBoolean("isLegacy");
            }
        }

        @Override // o.wXX
        public void onCreateHeader(@NotNull C52781wYc c52781wYc) {
            Intrinsics.checkNotNullParameter(c52781wYc, "");
            c52781wYc.setType(2);
        }

        @Override // o.wXX
        public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
            Intrinsics.checkNotNullParameter(constraintLayout, "");
            android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(constraintLayout.getContext());
            ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(-1, -1);
            android.content.Context context = frameLayout.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            int iOLrzqt = C55298xhM.OLrzqt(12, context);
            android.content.Context context2 = frameLayout.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            int iOLrzqt2 = C55298xhM.OLrzqt(12, context2);
            android.content.Context context3 = frameLayout.getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "");
            int iOLrzqt3 = C55298xhM.OLrzqt(12, context3);
            android.content.Context context4 = frameLayout.getContext();
            Intrinsics.checkNotNullExpressionValue(context4, "");
            layoutParams.setMargins(iOLrzqt, iOLrzqt2, iOLrzqt3, C55298xhM.OLrzqt(12, context4));
            layoutParams.topToTop = 0;
            layoutParams.startToStart = 0;
            layoutParams.endToEnd = 0;
            layoutParams.bottomToBottom = 0;
            frameLayout.setLayoutParams(layoutParams);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(frameLayout.getContext().getColor(C52761wXj.Activity.scanPackages));
            Intrinsics.checkNotNullExpressionValue(frameLayout.getContext(), "");
            gradientDrawable.setCornerRadius(C55298xhM.OLrzqt(12, r8));
            frameLayout.setBackground(gradientDrawable);
            android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(constraintLayout.getContext());
            linearLayout.setOrientation(1);
            linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            android.widget.TextView textView = new android.widget.TextView(constraintLayout.getContext());
            java.lang.String str = this.EZpvd;
            if (str == null) {
                Intrinsics.gEmmrt("");
                str = null;
            }
            textView.setText(str);
            textView.setTextAppearance(C52761wXj.LoaderManager.uzCIH);
            textView.setTextColor(textView.getContext().getColor(C52761wXj.Activity.fdOvFl));
            textView.setGravity(17);
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
            android.content.Context context5 = textView.getContext();
            Intrinsics.checkNotNullExpressionValue(context5, "");
            int iOLrzqt4 = C55298xhM.OLrzqt(16, context5);
            android.content.Context context6 = textView.getContext();
            Intrinsics.checkNotNullExpressionValue(context6, "");
            int iOLrzqt5 = C55298xhM.OLrzqt(16, context6);
            android.content.Context context7 = textView.getContext();
            Intrinsics.checkNotNullExpressionValue(context7, "");
            int iOLrzqt6 = C55298xhM.OLrzqt(16, context7);
            android.content.Context context8 = textView.getContext();
            Intrinsics.checkNotNullExpressionValue(context8, "");
            layoutParams2.setMargins(iOLrzqt4, iOLrzqt5, iOLrzqt6, C55298xhM.OLrzqt(8, context8));
            textView.setLayoutParams(layoutParams2);
            linearLayout.addView(textView);
            android.widget.LinearLayout linearLayout2 = new android.widget.LinearLayout(constraintLayout.getContext());
            linearLayout2.setOrientation(1);
            linearLayout2.setLayoutParams(new LinearLayout.LayoutParams(-1, 0, 1.0f));
            android.content.Context context9 = linearLayout2.getContext();
            Intrinsics.checkNotNullExpressionValue(context9, "");
            int iOLrzqt7 = C55298xhM.OLrzqt(16, context9);
            android.content.Context context10 = linearLayout2.getContext();
            Intrinsics.checkNotNullExpressionValue(context10, "");
            int iOLrzqt8 = C55298xhM.OLrzqt(16, context10);
            android.content.Context context11 = linearLayout2.getContext();
            Intrinsics.checkNotNullExpressionValue(context11, "");
            int iOLrzqt9 = C55298xhM.OLrzqt(16, context11);
            android.content.Context context12 = linearLayout2.getContext();
            Intrinsics.checkNotNullExpressionValue(context12, "");
            linearLayout2.setPadding(iOLrzqt7, iOLrzqt8, iOLrzqt9, C55298xhM.OLrzqt(16, context12));
            android.widget.LinearLayout linearLayout3 = new android.widget.LinearLayout(constraintLayout.getContext());
            linearLayout3.setOrientation(0);
            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
            android.content.Context context13 = linearLayout3.getContext();
            Intrinsics.checkNotNullExpressionValue(context13, "");
            layoutParams3.bottomMargin = C55298xhM.OLrzqt(4, context13);
            linearLayout3.setLayoutParams(layoutParams3);
            android.widget.TextView textView2 = new android.widget.TextView(constraintLayout.getContext());
            textView2.setText("Original value");
            textView2.setTextSize(14.0f);
            textView2.setTextAppearance(C52761wXj.LoaderManager.valueOf);
            textView2.setTextColor(textView2.getContext().getColor(C52761wXj.Activity.Dmq));
            textView2.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
            linearLayout3.addView(textView2);
            final android.widget.ImageView imageView = new android.widget.ImageView(constraintLayout.getContext());
            imageView.setImageResource(C52761wXj.TaskDescription.tIwhY);
            imageView.setBackgroundResource(C31976mKx.ActionBar.djBIcL);
            android.content.Context context14 = imageView.getContext();
            Intrinsics.checkNotNullExpressionValue(context14, "");
            int iOLrzqt10 = C55298xhM.OLrzqt(24, context14);
            android.content.Context context15 = imageView.getContext();
            Intrinsics.checkNotNullExpressionValue(context15, "");
            imageView.setLayoutParams(new LinearLayout.LayoutParams(iOLrzqt10, C55298xhM.OLrzqt(24, context15)));
            imageView.setOnClickListener(new View.OnClickListener() { // from class: o.mLn
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    mKY.StateListAnimator.AEQbTJ(imageView, this, view);
                }
            });
            linearLayout3.addView(imageView);
            linearLayout2.addView(linearLayout3);
            android.widget.TextView textView3 = new android.widget.TextView(constraintLayout.getContext());
            java.lang.String str2 = this.AhwBna;
            if (str2 == null) {
                str2 = AbstractJsonLexerKt.NULL;
            }
            textView3.setText(str2);
            textView3.setTextSize(16.0f);
            textView3.setTextColor(textView3.getContext().getColor(C52761wXj.Activity.DCUTEIddSDPG));
            textView3.setGravity(8388659);
            android.content.Context context16 = textView3.getContext();
            Intrinsics.checkNotNullExpressionValue(context16, "");
            int iOLrzqt11 = C55298xhM.OLrzqt(12, context16);
            android.content.Context context17 = textView3.getContext();
            Intrinsics.checkNotNullExpressionValue(context17, "");
            int iOLrzqt12 = C55298xhM.OLrzqt(12, context17);
            android.content.Context context18 = textView3.getContext();
            Intrinsics.checkNotNullExpressionValue(context18, "");
            int iOLrzqt13 = C55298xhM.OLrzqt(12, context18);
            android.content.Context context19 = textView3.getContext();
            Intrinsics.checkNotNullExpressionValue(context19, "");
            textView3.setPadding(iOLrzqt11, iOLrzqt12, iOLrzqt13, C55298xhM.OLrzqt(12, context19));
            textView3.setMinLines(1);
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            gradientDrawable2.setColor(textView3.getContext().getColor(C52761wXj.Activity.invokespecialaKhcqp));
            android.content.Context context20 = textView3.getContext();
            Intrinsics.checkNotNullExpressionValue(context20, "");
            gradientDrawable2.setStroke(C55298xhM.OLrzqt(1, context20), textView3.getContext().getColor(C52761wXj.Activity.ORxRYg));
            Intrinsics.checkNotNullExpressionValue(textView3.getContext(), "");
            gradientDrawable2.setCornerRadius(C55298xhM.OLrzqt(8, r11));
            textView3.setBackground(gradientDrawable2);
            LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, 0, 0.25f);
            android.content.Context context21 = textView3.getContext();
            Intrinsics.checkNotNullExpressionValue(context21, "");
            layoutParams4.bottomMargin = C55298xhM.OLrzqt(16, context21);
            textView3.setLayoutParams(layoutParams4);
            linearLayout2.addView(textView3);
            android.widget.LinearLayout linearLayout4 = new android.widget.LinearLayout(constraintLayout.getContext());
            linearLayout4.setOrientation(0);
            LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, -2);
            android.content.Context context22 = linearLayout4.getContext();
            Intrinsics.checkNotNullExpressionValue(context22, "");
            layoutParams5.bottomMargin = C55298xhM.OLrzqt(12, context22);
            linearLayout4.setLayoutParams(layoutParams5);
            android.widget.TextView textView4 = new android.widget.TextView(constraintLayout.getContext());
            textView4.setText("Override value");
            textView4.setTextSize(14.0f);
            textView4.setTextAppearance(C52761wXj.LoaderManager.valueOf);
            textView4.setTextColor(textView4.getContext().getColor(C52761wXj.Activity.Dmq));
            textView4.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
            linearLayout4.addView(textView4);
            android.widget.TextView textView5 = new android.widget.TextView(constraintLayout.getContext());
            textView5.setText("Use Override?");
            textView5.setTextSize(14.0f);
            textView5.setTextAppearance(C52761wXj.LoaderManager.valueOf);
            textView5.setTextColor(textView5.getContext().getColor(C52761wXj.Activity.Dmq));
            LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-2, -2);
            android.content.Context context23 = textView5.getContext();
            Intrinsics.checkNotNullExpressionValue(context23, "");
            layoutParams6.setMarginEnd(C55298xhM.OLrzqt(8, context23));
            textView5.setLayoutParams(layoutParams6);
            linearLayout4.addView(textView5);
            android.content.Context context24 = constraintLayout.getContext();
            Intrinsics.checkNotNullExpressionValue(context24, "");
            final C55239xgG c55239xgG = new C55239xgG(context24, null, 0, 6, null);
            java.lang.String str3 = this.EZpvd;
            if (str3 == null) {
                Intrinsics.gEmmrt("");
                str3 = null;
            }
            java.lang.String str4 = this.gEmmrt;
            if (str4 == null) {
                Intrinsics.gEmmrt("");
                str4 = null;
            }
            c55239xgG.setChecked(SPUtils.getString(str3, null, str4) != null);
            c55239xgG.setOKDSSize(-5);
            c55239xgG.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: o.mLq
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z) {
                    mKY.StateListAnimator.EZpvd(this.KWHzl, c55239xgG, compoundButton, z);
                }
            });
            this.valueOf = c55239xgG;
            linearLayout4.addView(c55239xgG);
            linearLayout2.addView(linearLayout4);
            android.widget.EditText editText = new android.widget.EditText(constraintLayout.getContext());
            editText.setHint("Enter override value");
            java.lang.String str5 = this.EZpvd;
            if (str5 == null) {
                Intrinsics.gEmmrt("");
                str5 = null;
            }
            java.lang.String str6 = str5 + "_draft";
            java.lang.String str7 = this.gEmmrt;
            if (str7 == null) {
                Intrinsics.gEmmrt("");
                str7 = null;
            }
            java.lang.String string = SPUtils.getString(str6, null, str7);
            if (string == null) {
                java.lang.String str8 = this.EZpvd;
                if (str8 == null) {
                    Intrinsics.gEmmrt("");
                    str8 = null;
                }
                java.lang.String str9 = this.gEmmrt;
                if (str9 == null) {
                    Intrinsics.gEmmrt("");
                    str9 = null;
                }
                string = SPUtils.getString(str8, null, str9);
                if (string == null) {
                    string = "";
                }
            }
            editText.setText(string);
            editText.setTextSize(16.0f);
            editText.setTextAppearance(C52761wXj.LoaderManager.valueOf);
            editText.setTextColor(editText.getContext().getColor(C52761wXj.Activity.fdOvFl));
            editText.setHintTextColor(editText.getContext().getColor(C52761wXj.Activity.DCUTEIddSDPG));
            editText.setGravity(48);
            android.content.Context context25 = editText.getContext();
            Intrinsics.checkNotNullExpressionValue(context25, "");
            int iOLrzqt14 = C55298xhM.OLrzqt(12, context25);
            android.content.Context context26 = editText.getContext();
            Intrinsics.checkNotNullExpressionValue(context26, "");
            int iOLrzqt15 = C55298xhM.OLrzqt(12, context26);
            android.content.Context context27 = editText.getContext();
            Intrinsics.checkNotNullExpressionValue(context27, "");
            int iOLrzqt16 = C55298xhM.OLrzqt(12, context27);
            android.content.Context context28 = editText.getContext();
            Intrinsics.checkNotNullExpressionValue(context28, "");
            editText.setPadding(iOLrzqt14, iOLrzqt15, iOLrzqt16, C55298xhM.OLrzqt(12, context28));
            editText.setInputType(131073);
            editText.setVerticalScrollBarEnabled(true);
            editText.setScrollBarStyle(16777216);
            editText.setVerticalScrollBarEnabled(true);
            editText.setOverScrollMode(0);
            editText.setMovementMethod(new android.text.method.ScrollingMovementMethod());
            GradientDrawable gradientDrawable3 = new GradientDrawable();
            gradientDrawable3.setColor(editText.getContext().getColor(C52761wXj.Activity.registerUser));
            android.content.Context context29 = editText.getContext();
            Intrinsics.checkNotNullExpressionValue(context29, "");
            gradientDrawable3.setStroke(C55298xhM.OLrzqt(1, context29), editText.getContext().getColor(C52761wXj.Activity.fdOvFl));
            Intrinsics.checkNotNullExpressionValue(editText.getContext(), "");
            gradientDrawable3.setCornerRadius(C55298xhM.OLrzqt(8, r8));
            editText.setBackground(gradientDrawable3);
            editText.setLayoutParams(new LinearLayout.LayoutParams(-1, 0, 0.75f));
            this.djBIcL = editText;
            linearLayout2.addView(editText);
            linearLayout.addView(linearLayout2);
            android.widget.LinearLayout linearLayout5 = new android.widget.LinearLayout(constraintLayout.getContext());
            linearLayout5.setOrientation(0);
            linearLayout5.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            android.content.Context context30 = linearLayout5.getContext();
            Intrinsics.checkNotNullExpressionValue(context30, "");
            int iOLrzqt17 = C55298xhM.OLrzqt(16, context30);
            android.content.Context context31 = linearLayout5.getContext();
            Intrinsics.checkNotNullExpressionValue(context31, "");
            int iOLrzqt18 = C55298xhM.OLrzqt(16, context31);
            android.content.Context context32 = linearLayout5.getContext();
            Intrinsics.checkNotNullExpressionValue(context32, "");
            int iOLrzqt19 = C55298xhM.OLrzqt(16, context32);
            android.content.Context context33 = linearLayout5.getContext();
            Intrinsics.checkNotNullExpressionValue(context33, "");
            linearLayout5.setPadding(iOLrzqt17, iOLrzqt18, iOLrzqt19, C55298xhM.OLrzqt(16, context33));
            linearLayout5.setGravity(17);
            android.content.Context context34 = constraintLayout.getContext();
            Intrinsics.checkNotNullExpressionValue(context34, "");
            C52794wYp c52794wYp = new C52794wYp(context34, null, 0, 6, null);
            c52794wYp.setText("Clear");
            c52794wYp.setOKDSType(258);
            c52794wYp.setOKDSSize(44);
            LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams(0, -2, 1.0f);
            android.content.Context context35 = c52794wYp.getContext();
            Intrinsics.checkNotNullExpressionValue(context35, "");
            layoutParams7.setMarginEnd(C55298xhM.OLrzqt(8, context35));
            c52794wYp.setLayoutParams(layoutParams7);
            c52794wYp.setOnClickListener(new View.OnClickListener() { // from class: o.mLo
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    mKY.StateListAnimator.AEQbTJ(this.AEQbTJ, view);
                }
            });
            linearLayout5.addView(c52794wYp);
            android.content.Context context36 = constraintLayout.getContext();
            Intrinsics.checkNotNullExpressionValue(context36, "");
            C52794wYp c52794wYp2 = new C52794wYp(context36, null, 0, 6, null);
            c52794wYp2.setText("Save");
            c52794wYp2.setOKDSType(259);
            c52794wYp2.setOKDSSize(44);
            LinearLayout.LayoutParams layoutParams8 = new LinearLayout.LayoutParams(0, -2, 1.0f);
            android.content.Context context37 = c52794wYp2.getContext();
            Intrinsics.checkNotNullExpressionValue(context37, "");
            layoutParams8.setMarginStart(C55298xhM.OLrzqt(8, context37));
            c52794wYp2.setLayoutParams(layoutParams8);
            c52794wYp2.setOnClickListener(new View.OnClickListener() { // from class: o.mLr
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    mKY.StateListAnimator.copydefault(this.copydefault, view);
                }
            });
            linearLayout5.addView(c52794wYp2);
            linearLayout.addView(linearLayout5);
            frameLayout.addView(linearLayout);
            constraintLayout.addView(frameLayout);
        }

        public static final void AEQbTJ(android.widget.ImageView imageView, StateListAnimator stateListAnimator, android.view.View view) {
            java.lang.Object systemService = imageView.getContext().getSystemService("clipboard");
            Intrinsics.copydefault(systemService, "");
            ((android.content.ClipboardManager) systemService).setPrimaryClip(android.content.ClipData.newPlainText("value", stateListAnimator.AhwBna));
            C55326xho.toastWithSuccessfulIcon$default("Copied original value", 0, 1, (java.lang.Object) null);
        }

        public static final void EZpvd(StateListAnimator stateListAnimator, C55239xgG c55239xgG, android.widget.CompoundButton compoundButton, boolean z) {
            android.text.Editable text;
            if (z) {
                android.widget.EditText editText = stateListAnimator.djBIcL;
                java.lang.String string = (editText == null || (text = editText.getText()) == null) ? null : text.toString();
                if (string == null || string.length() == 0) {
                    C55326xho.toastWithFailedIcon$default("Cannot override using null value", 0, 1, (java.lang.Object) null);
                    c55239xgG.setChecked(false);
                }
            }
        }

        public static final void AEQbTJ(StateListAnimator stateListAnimator, android.view.View view) {
            android.widget.EditText editText = stateListAnimator.djBIcL;
            if (editText != null) {
                editText.setText("");
            }
            C55239xgG c55239xgG = stateListAnimator.valueOf;
            if (c55239xgG != null) {
                c55239xgG.setChecked(false);
            }
        }

        public static final void copydefault(StateListAnimator stateListAnimator, android.view.View view) {
            java.lang.String string;
            android.text.Editable text;
            android.widget.EditText editText = stateListAnimator.djBIcL;
            if (editText == null || (text = editText.getText()) == null || (string = text.toString()) == null) {
                string = "";
            }
            java.lang.String str = stateListAnimator.EZpvd;
            if (str == null) {
                Intrinsics.gEmmrt("");
                str = null;
            }
            java.lang.String str2 = str + "_draft";
            java.lang.String str3 = stateListAnimator.gEmmrt;
            if (str3 == null) {
                Intrinsics.gEmmrt("");
                str3 = null;
            }
            SPUtils.put(str2, string, str3);
            C55239xgG c55239xgG = stateListAnimator.valueOf;
            if (c55239xgG != null && c55239xgG.isChecked()) {
                if (string.length() > 0) {
                    if (stateListAnimator.OLrzqt) {
                        java.lang.String str4 = stateListAnimator.EZpvd;
                        if (str4 == null) {
                            Intrinsics.gEmmrt("");
                            str4 = null;
                        }
                        java.lang.String str5 = stateListAnimator.gEmmrt;
                        if (str5 == null) {
                            Intrinsics.gEmmrt("");
                            str5 = null;
                        }
                        SPUtils.put(str4, string, str5);
                    } else {
                        java.lang.String str6 = stateListAnimator.EZpvd;
                        if (str6 == null) {
                            Intrinsics.gEmmrt("");
                            str6 = null;
                        }
                        TaskDescription taskDescription = mKY.Companion;
                        java.lang.String strOLrzqt = taskDescription.OLrzqt(string);
                        java.lang.String str7 = stateListAnimator.gEmmrt;
                        if (str7 == null) {
                            Intrinsics.gEmmrt("");
                            str7 = null;
                        }
                        SPUtils.put(str6, strOLrzqt, str7);
                        java.lang.String str8 = stateListAnimator.EZpvd;
                        if (str8 == null) {
                            Intrinsics.gEmmrt("");
                            str8 = null;
                        }
                        java.lang.String str9 = "payload_key_prefix_" + str8;
                        java.lang.String strKWHzl = taskDescription.KWHzl(string);
                        java.lang.String str10 = stateListAnimator.gEmmrt;
                        if (str10 == null) {
                            Intrinsics.gEmmrt("");
                            str10 = null;
                        }
                        SPUtils.put(str9, strKWHzl, str10);
                    }
                    java.lang.String str11 = stateListAnimator.EZpvd;
                    if (str11 == null) {
                        Intrinsics.gEmmrt("");
                        str11 = null;
                    }
                    java.lang.String str12 = str11 + "_draft";
                    java.lang.String str13 = stateListAnimator.gEmmrt;
                    if (str13 == null) {
                        Intrinsics.gEmmrt("");
                        str13 = null;
                    }
                    SPUtils.remove(str12, str13);
                } else if (stateListAnimator.OLrzqt) {
                    java.lang.String str14 = stateListAnimator.EZpvd;
                    if (str14 == null) {
                        Intrinsics.gEmmrt("");
                        str14 = null;
                    }
                    java.lang.String str15 = stateListAnimator.gEmmrt;
                    if (str15 == null) {
                        Intrinsics.gEmmrt("");
                        str15 = null;
                    }
                    SPUtils.remove(str14, str15);
                } else {
                    java.lang.String str16 = stateListAnimator.EZpvd;
                    if (str16 == null) {
                        Intrinsics.gEmmrt("");
                        str16 = null;
                    }
                    java.lang.String str17 = "payload_key_prefix_" + str16;
                    java.lang.String str18 = stateListAnimator.gEmmrt;
                    if (str18 == null) {
                        Intrinsics.gEmmrt("");
                        str18 = null;
                    }
                    SPUtils.remove(str17, str18);
                    java.lang.String str19 = stateListAnimator.EZpvd;
                    if (str19 == null) {
                        Intrinsics.gEmmrt("");
                        str19 = null;
                    }
                    java.lang.String str20 = stateListAnimator.gEmmrt;
                    if (str20 == null) {
                        Intrinsics.gEmmrt("");
                        str20 = null;
                    }
                    SPUtils.remove(str19, str20);
                }
            } else if (stateListAnimator.OLrzqt) {
                java.lang.String str21 = stateListAnimator.EZpvd;
                if (str21 == null) {
                    Intrinsics.gEmmrt("");
                    str21 = null;
                }
                java.lang.String str22 = stateListAnimator.gEmmrt;
                if (str22 == null) {
                    Intrinsics.gEmmrt("");
                    str22 = null;
                }
                SPUtils.remove(str21, str22);
            } else {
                java.lang.String str23 = stateListAnimator.EZpvd;
                if (str23 == null) {
                    Intrinsics.gEmmrt("");
                    str23 = null;
                }
                java.lang.String str24 = "payload_key_prefix_" + str23;
                java.lang.String str25 = stateListAnimator.gEmmrt;
                if (str25 == null) {
                    Intrinsics.gEmmrt("");
                    str25 = null;
                }
                SPUtils.remove(str24, str25);
                java.lang.String str26 = stateListAnimator.EZpvd;
                if (str26 == null) {
                    Intrinsics.gEmmrt("");
                    str26 = null;
                }
                java.lang.String str27 = stateListAnimator.gEmmrt;
                if (str27 == null) {
                    Intrinsics.gEmmrt("");
                    str27 = null;
                }
                SPUtils.remove(str26, str27);
            }
            C55326xho.toastWithSuccessfulIcon$default("Saved", 0, 1, (java.lang.Object) null);
        }

        @Override // o.wXX, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
        public void onDismiss(@NotNull android.content.DialogInterface dialogInterface) {
            Intrinsics.checkNotNullParameter(dialogInterface, "");
            super.onDismiss(dialogInterface);
            Function1<? super java.lang.String, Unit> function1 = this.KWHzl;
            if (function1 != null) {
                java.lang.String str = this.EZpvd;
                if (str == null) {
                    Intrinsics.gEmmrt("");
                    str = null;
                }
                function1.invoke(str);
            }
        }
    }

    public static final class ActionBar extends wXX {
        public android.widget.EditText AYXKKw;
        public C55239xgG AhwBna;
        public java.lang.String AkhnZx;
        public boolean EZpvd;
        public java.lang.String KWHzl;
        public android.widget.TextView OLrzqt;
        public final boolean copydefault = true;
        public java.lang.String djBIcL;
        public Function1<? super java.lang.String, Unit> gEmmrt;
        public C52794wYp valueOf;
        public static final StateListAnimator Companion = new StateListAnimator(null);
        public static final int AEQbTJ = 8;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.wXX
        public boolean isFullScreen() {
            return this.copydefault;
        }

        public static final class StateListAnimator {
            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.mKY.ActionBar.StateListAnimator.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private StateListAnimator() {
            }

            public static /* synthetic */ ActionBar newInstance$default(StateListAnimator stateListAnimator, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z, Function1 function1, int i, java.lang.Object obj) {
                if ((i & 8) != 0) {
                    z = false;
                }
                return stateListAnimator.KWHzl(str, str2, str3, z, function1);
            }

            public final ActionBar KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.String str3, boolean z, @NotNull Function1<? super java.lang.String, Unit> function1) {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
                Intrinsics.checkNotNullParameter(function1, "");
                ActionBar actionBar = new ActionBar();
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putString("sp_name", str);
                bundle.putString(OtcExtraKeys.FLAG, str2);
                bundle.putString("payload", str3);
                bundle.putBoolean("isLegacy", z);
                actionBar.setArguments(bundle);
                actionBar.gEmmrt = function1;
                return actionBar;
            }
        }

        @Override // o.wXX, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
        public void onCreate(android.os.Bundle bundle) {
            super.onCreate(bundle);
            android.os.Bundle arguments = getArguments();
            if (arguments != null) {
                java.lang.String string = arguments.getString("sp_name");
                if (string == null) {
                    string = "";
                }
                this.AkhnZx = string;
                java.lang.String string2 = arguments.getString(OtcExtraKeys.FLAG);
                this.KWHzl = string2 != null ? string2 : "";
                this.djBIcL = arguments.getString("payload");
                this.EZpvd = arguments.getBoolean("isLegacy");
            }
        }

        @Override // o.wXX
        public void onCreateHeader(@NotNull C52781wYc c52781wYc) {
            Intrinsics.checkNotNullParameter(c52781wYc, "");
            c52781wYc.setType(2);
        }

        @Override // o.wXX
        public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
            java.lang.String str;
            Intrinsics.checkNotNullParameter(constraintLayout, "");
            android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(constraintLayout.getContext());
            ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(-1, -1);
            android.content.Context context = frameLayout.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            int iOLrzqt = C55298xhM.OLrzqt(12, context);
            android.content.Context context2 = frameLayout.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            int iOLrzqt2 = C55298xhM.OLrzqt(12, context2);
            android.content.Context context3 = frameLayout.getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "");
            int iOLrzqt3 = C55298xhM.OLrzqt(12, context3);
            android.content.Context context4 = frameLayout.getContext();
            Intrinsics.checkNotNullExpressionValue(context4, "");
            layoutParams.setMargins(iOLrzqt, iOLrzqt2, iOLrzqt3, C55298xhM.OLrzqt(12, context4));
            layoutParams.topToTop = 0;
            layoutParams.startToStart = 0;
            layoutParams.endToEnd = 0;
            layoutParams.bottomToBottom = 0;
            frameLayout.setLayoutParams(layoutParams);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(frameLayout.getContext().getColor(C52761wXj.Activity.scanPackages));
            Intrinsics.checkNotNullExpressionValue(frameLayout.getContext(), "");
            gradientDrawable.setCornerRadius(C55298xhM.OLrzqt(12, r8));
            frameLayout.setBackground(gradientDrawable);
            android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(constraintLayout.getContext());
            linearLayout.setOrientation(1);
            linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            android.widget.TextView textView = new android.widget.TextView(constraintLayout.getContext());
            java.lang.String str2 = this.KWHzl;
            if (str2 == null) {
                Intrinsics.gEmmrt("");
                str2 = null;
            }
            textView.setText(str2);
            textView.setTextAppearance(C52761wXj.LoaderManager.uzCIH);
            textView.setTextColor(textView.getContext().getColor(C52761wXj.Activity.fdOvFl));
            textView.setGravity(17);
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
            android.content.Context context5 = textView.getContext();
            Intrinsics.checkNotNullExpressionValue(context5, "");
            int iOLrzqt4 = C55298xhM.OLrzqt(16, context5);
            android.content.Context context6 = textView.getContext();
            Intrinsics.checkNotNullExpressionValue(context6, "");
            int iOLrzqt5 = C55298xhM.OLrzqt(16, context6);
            android.content.Context context7 = textView.getContext();
            Intrinsics.checkNotNullExpressionValue(context7, "");
            int iOLrzqt6 = C55298xhM.OLrzqt(16, context7);
            android.content.Context context8 = textView.getContext();
            Intrinsics.checkNotNullExpressionValue(context8, "");
            layoutParams2.setMargins(iOLrzqt4, iOLrzqt5, iOLrzqt6, C55298xhM.OLrzqt(8, context8));
            textView.setLayoutParams(layoutParams2);
            linearLayout.addView(textView);
            android.widget.LinearLayout linearLayout2 = new android.widget.LinearLayout(constraintLayout.getContext());
            linearLayout2.setOrientation(1);
            linearLayout2.setLayoutParams(new LinearLayout.LayoutParams(-1, 0, 1.0f));
            android.content.Context context9 = linearLayout2.getContext();
            Intrinsics.checkNotNullExpressionValue(context9, "");
            int iOLrzqt7 = C55298xhM.OLrzqt(16, context9);
            android.content.Context context10 = linearLayout2.getContext();
            Intrinsics.checkNotNullExpressionValue(context10, "");
            int iOLrzqt8 = C55298xhM.OLrzqt(16, context10);
            android.content.Context context11 = linearLayout2.getContext();
            Intrinsics.checkNotNullExpressionValue(context11, "");
            int iOLrzqt9 = C55298xhM.OLrzqt(16, context11);
            android.content.Context context12 = linearLayout2.getContext();
            Intrinsics.checkNotNullExpressionValue(context12, "");
            linearLayout2.setPadding(iOLrzqt7, iOLrzqt8, iOLrzqt9, C55298xhM.OLrzqt(16, context12));
            android.widget.LinearLayout linearLayout3 = new android.widget.LinearLayout(constraintLayout.getContext());
            linearLayout3.setOrientation(0);
            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
            android.content.Context context13 = linearLayout3.getContext();
            Intrinsics.checkNotNullExpressionValue(context13, "");
            layoutParams3.bottomMargin = C55298xhM.OLrzqt(4, context13);
            linearLayout3.setLayoutParams(layoutParams3);
            android.widget.TextView textView2 = new android.widget.TextView(constraintLayout.getContext());
            textView2.setText("Original payload");
            textView2.setTextSize(14.0f);
            textView2.setTextAppearance(C52761wXj.LoaderManager.valueOf);
            textView2.setTextColor(textView2.getContext().getColor(C52761wXj.Activity.Dmq));
            textView2.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
            linearLayout3.addView(textView2);
            final android.widget.ImageView imageView = new android.widget.ImageView(constraintLayout.getContext());
            imageView.setImageResource(C52761wXj.TaskDescription.tIwhY);
            imageView.setBackgroundResource(C31976mKx.ActionBar.djBIcL);
            android.content.Context context14 = imageView.getContext();
            Intrinsics.checkNotNullExpressionValue(context14, "");
            int iOLrzqt10 = C55298xhM.OLrzqt(24, context14);
            android.content.Context context15 = imageView.getContext();
            Intrinsics.checkNotNullExpressionValue(context15, "");
            imageView.setLayoutParams(new LinearLayout.LayoutParams(iOLrzqt10, C55298xhM.OLrzqt(24, context15)));
            imageView.setOnClickListener(new View.OnClickListener() { // from class: o.mLm
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    mKY.ActionBar.OLrzqt(imageView, this, view);
                }
            });
            linearLayout3.addView(imageView);
            linearLayout2.addView(linearLayout3);
            android.widget.TextView textView3 = new android.widget.TextView(constraintLayout.getContext());
            java.lang.String str3 = this.djBIcL;
            if (str3 == null) {
                str3 = AbstractJsonLexerKt.NULL;
            }
            textView3.setText(str3);
            textView3.setTextSize(16.0f);
            textView3.setTextColor(textView3.getContext().getColor(C52761wXj.Activity.DCUTEIddSDPG));
            textView3.setGravity(8388659);
            android.content.Context context16 = textView3.getContext();
            Intrinsics.checkNotNullExpressionValue(context16, "");
            int iOLrzqt11 = C55298xhM.OLrzqt(12, context16);
            android.content.Context context17 = textView3.getContext();
            Intrinsics.checkNotNullExpressionValue(context17, "");
            int iOLrzqt12 = C55298xhM.OLrzqt(12, context17);
            android.content.Context context18 = textView3.getContext();
            Intrinsics.checkNotNullExpressionValue(context18, "");
            int iOLrzqt13 = C55298xhM.OLrzqt(12, context18);
            android.content.Context context19 = textView3.getContext();
            Intrinsics.checkNotNullExpressionValue(context19, "");
            textView3.setPadding(iOLrzqt11, iOLrzqt12, iOLrzqt13, C55298xhM.OLrzqt(12, context19));
            textView3.setMinLines(1);
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            gradientDrawable2.setColor(textView3.getContext().getColor(C52761wXj.Activity.invokespecialaKhcqp));
            android.content.Context context20 = textView3.getContext();
            Intrinsics.checkNotNullExpressionValue(context20, "");
            gradientDrawable2.setStroke(C55298xhM.OLrzqt(1, context20), textView3.getContext().getColor(C52761wXj.Activity.ORxRYg));
            Intrinsics.checkNotNullExpressionValue(textView3.getContext(), "");
            gradientDrawable2.setCornerRadius(C55298xhM.OLrzqt(8, r11));
            textView3.setBackground(gradientDrawable2);
            LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, 0, 0.43f);
            android.content.Context context21 = textView3.getContext();
            Intrinsics.checkNotNullExpressionValue(context21, "");
            layoutParams4.bottomMargin = C55298xhM.OLrzqt(16, context21);
            textView3.setLayoutParams(layoutParams4);
            linearLayout2.addView(textView3);
            android.widget.LinearLayout linearLayout4 = new android.widget.LinearLayout(constraintLayout.getContext());
            linearLayout4.setOrientation(0);
            LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, -2);
            android.content.Context context22 = linearLayout4.getContext();
            Intrinsics.checkNotNullExpressionValue(context22, "");
            layoutParams5.bottomMargin = C55298xhM.OLrzqt(12, context22);
            linearLayout4.setLayoutParams(layoutParams5);
            android.widget.TextView textView4 = new android.widget.TextView(constraintLayout.getContext());
            textView4.setText("Override payload");
            textView4.setTextSize(14.0f);
            textView4.setTextAppearance(C52761wXj.LoaderManager.valueOf);
            textView4.setTextColor(textView4.getContext().getColor(C52761wXj.Activity.Dmq));
            textView4.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
            linearLayout4.addView(textView4);
            android.widget.TextView textView5 = new android.widget.TextView(constraintLayout.getContext());
            textView5.setText("Use Override?");
            textView5.setTextSize(14.0f);
            textView5.setTextAppearance(C52761wXj.LoaderManager.valueOf);
            textView5.setTextColor(textView5.getContext().getColor(C52761wXj.Activity.Dmq));
            LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-2, -2);
            android.content.Context context23 = textView5.getContext();
            Intrinsics.checkNotNullExpressionValue(context23, "");
            layoutParams6.setMarginEnd(C55298xhM.OLrzqt(8, context23));
            textView5.setLayoutParams(layoutParams6);
            linearLayout4.addView(textView5);
            android.content.Context context24 = constraintLayout.getContext();
            Intrinsics.checkNotNullExpressionValue(context24, "");
            final C55239xgG c55239xgG = new C55239xgG(context24, null, 0, 6, null);
            java.lang.String str4 = this.KWHzl;
            if (str4 == null) {
                Intrinsics.gEmmrt("");
                str4 = null;
            }
            java.lang.String str5 = "payload_key_prefix_" + str4;
            java.lang.String str6 = this.AkhnZx;
            if (str6 == null) {
                Intrinsics.gEmmrt("");
                str6 = null;
            }
            c55239xgG.setChecked(SPUtils.getString(str5, null, str6) != null);
            c55239xgG.setOKDSSize(-5);
            c55239xgG.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: o.mLl
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z) {
                    mKY.ActionBar.EZpvd(this.copydefault, c55239xgG, compoundButton, z);
                }
            });
            this.AhwBna = c55239xgG;
            linearLayout4.addView(c55239xgG);
            linearLayout2.addView(linearLayout4);
            android.widget.EditText editText = new android.widget.EditText(constraintLayout.getContext());
            editText.setHint("Enter override payload");
            java.lang.String str7 = this.KWHzl;
            if (str7 == null) {
                Intrinsics.gEmmrt("");
                str7 = null;
            }
            java.lang.String str8 = "payload_key_prefix_" + str7 + "_draft";
            java.lang.String str9 = this.AkhnZx;
            if (str9 == null) {
                Intrinsics.gEmmrt("");
                str9 = null;
            }
            java.lang.String string = SPUtils.getString(str8, null, str9);
            if (string == null) {
                java.lang.String str10 = this.KWHzl;
                if (str10 == null) {
                    Intrinsics.gEmmrt("");
                    str10 = null;
                }
                java.lang.String str11 = "payload_key_prefix_" + str10;
                java.lang.String str12 = this.AkhnZx;
                if (str12 == null) {
                    Intrinsics.gEmmrt("");
                    str = null;
                    str12 = null;
                } else {
                    str = null;
                }
                string = SPUtils.getString(str11, str, str12);
                if (string == null) {
                    string = "";
                }
            }
            editText.setText(string);
            editText.setTextSize(16.0f);
            editText.setTextAppearance(C52761wXj.LoaderManager.valueOf);
            editText.setTextColor(editText.getContext().getColor(C52761wXj.Activity.fdOvFl));
            editText.setHintTextColor(editText.getContext().getColor(C52761wXj.Activity.DCUTEIddSDPG));
            editText.setGravity(48);
            android.content.Context context25 = editText.getContext();
            Intrinsics.checkNotNullExpressionValue(context25, "");
            int iOLrzqt14 = C55298xhM.OLrzqt(12, context25);
            android.content.Context context26 = editText.getContext();
            Intrinsics.checkNotNullExpressionValue(context26, "");
            int iOLrzqt15 = C55298xhM.OLrzqt(12, context26);
            android.content.Context context27 = editText.getContext();
            Intrinsics.checkNotNullExpressionValue(context27, "");
            int iOLrzqt16 = C55298xhM.OLrzqt(12, context27);
            android.content.Context context28 = editText.getContext();
            Intrinsics.checkNotNullExpressionValue(context28, "");
            editText.setPadding(iOLrzqt14, iOLrzqt15, iOLrzqt16, C55298xhM.OLrzqt(12, context28));
            editText.setInputType(131073);
            editText.setVerticalScrollBarEnabled(true);
            editText.setScrollBarStyle(16777216);
            editText.setVerticalScrollBarEnabled(true);
            editText.setOverScrollMode(0);
            editText.setMovementMethod(new android.text.method.ScrollingMovementMethod());
            GradientDrawable gradientDrawable3 = new GradientDrawable();
            gradientDrawable3.setColor(editText.getContext().getColor(C52761wXj.Activity.registerUser));
            android.content.Context context29 = editText.getContext();
            Intrinsics.checkNotNullExpressionValue(context29, "");
            gradientDrawable3.setStroke(C55298xhM.OLrzqt(1, context29), editText.getContext().getColor(C52761wXj.Activity.fdOvFl));
            Intrinsics.checkNotNullExpressionValue(editText.getContext(), "");
            gradientDrawable3.setCornerRadius(C55298xhM.OLrzqt(8, r8));
            editText.setBackground(gradientDrawable3);
            editText.setLayoutParams(new LinearLayout.LayoutParams(-1, 0, 0.57f));
            this.AYXKKw = editText;
            linearLayout2.addView(editText);
            android.widget.TextView textView6 = new android.widget.TextView(constraintLayout.getContext());
            textView6.setText("");
            textView6.setTextSize(12.0f);
            textView6.setTextAppearance(C52761wXj.LoaderManager.DTwDnp);
            textView6.setTextColor(textView6.getContext().getColor(C52761wXj.Activity.isElapsedRealtimeNanosAvailable));
            textView6.setGravity(17);
            textView6.setVisibility(8);
            LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams(-1, -2);
            android.content.Context context30 = textView6.getContext();
            Intrinsics.checkNotNullExpressionValue(context30, "");
            layoutParams7.topMargin = C55298xhM.OLrzqt(4, context30);
            android.content.Context context31 = textView6.getContext();
            Intrinsics.checkNotNullExpressionValue(context31, "");
            layoutParams7.bottomMargin = C55298xhM.OLrzqt(8, context31);
            android.content.Context context32 = textView6.getContext();
            Intrinsics.checkNotNullExpressionValue(context32, "");
            layoutParams7.setMarginStart(C55298xhM.OLrzqt(12, context32));
            android.content.Context context33 = textView6.getContext();
            Intrinsics.checkNotNullExpressionValue(context33, "");
            layoutParams7.setMarginEnd(C55298xhM.OLrzqt(12, context33));
            textView6.setLayoutParams(layoutParams7);
            this.OLrzqt = textView6;
            linearLayout2.addView(textView6);
            linearLayout.addView(linearLayout2);
            android.widget.LinearLayout linearLayout5 = new android.widget.LinearLayout(constraintLayout.getContext());
            linearLayout5.setOrientation(0);
            linearLayout5.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            android.content.Context context34 = linearLayout5.getContext();
            Intrinsics.checkNotNullExpressionValue(context34, "");
            int iOLrzqt17 = C55298xhM.OLrzqt(16, context34);
            android.content.Context context35 = linearLayout5.getContext();
            Intrinsics.checkNotNullExpressionValue(context35, "");
            int iOLrzqt18 = C55298xhM.OLrzqt(16, context35);
            android.content.Context context36 = linearLayout5.getContext();
            Intrinsics.checkNotNullExpressionValue(context36, "");
            int iOLrzqt19 = C55298xhM.OLrzqt(16, context36);
            android.content.Context context37 = linearLayout5.getContext();
            Intrinsics.checkNotNullExpressionValue(context37, "");
            linearLayout5.setPadding(iOLrzqt17, iOLrzqt18, iOLrzqt19, C55298xhM.OLrzqt(16, context37));
            linearLayout5.setGravity(17);
            android.content.Context context38 = constraintLayout.getContext();
            Intrinsics.checkNotNullExpressionValue(context38, "");
            C52794wYp c52794wYp = new C52794wYp(context38, null, 0, 6, null);
            c52794wYp.setText("Clear");
            c52794wYp.setOKDSType(258);
            c52794wYp.setOKDSSize(44);
            LinearLayout.LayoutParams layoutParams8 = new LinearLayout.LayoutParams(0, -2, 1.0f);
            android.content.Context context39 = c52794wYp.getContext();
            Intrinsics.checkNotNullExpressionValue(context39, "");
            layoutParams8.setMarginEnd(C55298xhM.OLrzqt(8, context39));
            c52794wYp.setLayoutParams(layoutParams8);
            c52794wYp.setOnClickListener(new View.OnClickListener() { // from class: o.mLi
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    mKY.ActionBar.AEQbTJ(this.copydefault, view);
                }
            });
            linearLayout5.addView(c52794wYp);
            android.content.Context context40 = constraintLayout.getContext();
            Intrinsics.checkNotNullExpressionValue(context40, "");
            C52794wYp c52794wYp2 = new C52794wYp(context40, null, 0, 6, null);
            c52794wYp2.setText("Save");
            c52794wYp2.setOKDSType(259);
            c52794wYp2.setOKDSSize(44);
            LinearLayout.LayoutParams layoutParams9 = new LinearLayout.LayoutParams(0, -2, 1.0f);
            android.content.Context context41 = c52794wYp2.getContext();
            Intrinsics.checkNotNullExpressionValue(context41, "");
            layoutParams9.setMarginStart(C55298xhM.OLrzqt(8, context41));
            c52794wYp2.setLayoutParams(layoutParams9);
            c52794wYp2.setOnClickListener(new View.OnClickListener() { // from class: o.mLj
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    mKY.ActionBar.KWHzl(this.EZpvd, view);
                }
            });
            this.valueOf = c52794wYp2;
            linearLayout5.addView(c52794wYp2);
            linearLayout.addView(linearLayout5);
            frameLayout.addView(linearLayout);
            constraintLayout.addView(frameLayout);
        }

        public static final void OLrzqt(android.widget.ImageView imageView, ActionBar actionBar, android.view.View view) {
            java.lang.Object systemService = imageView.getContext().getSystemService("clipboard");
            Intrinsics.copydefault(systemService, "");
            ((android.content.ClipboardManager) systemService).setPrimaryClip(android.content.ClipData.newPlainText("payload", actionBar.djBIcL));
            C55326xho.toastWithSuccessfulIcon$default("Copied original payload", 0, 1, (java.lang.Object) null);
        }

        public static final void EZpvd(ActionBar actionBar, C55239xgG c55239xgG, android.widget.CompoundButton compoundButton, boolean z) {
            android.text.Editable text;
            if (z) {
                android.widget.EditText editText = actionBar.AYXKKw;
                java.lang.String string = (editText == null || (text = editText.getText()) == null) ? null : text.toString();
                if (string == null || string.length() == 0) {
                    C55326xho.toastWithFailedIcon$default("Cannot override using null value", 0, 1, (java.lang.Object) null);
                    c55239xgG.setChecked(false);
                }
            }
        }

        public static final void AEQbTJ(ActionBar actionBar, android.view.View view) {
            android.widget.EditText editText = actionBar.AYXKKw;
            if (editText != null) {
                editText.setText("");
            }
            C55239xgG c55239xgG = actionBar.AhwBna;
            if (c55239xgG != null) {
                c55239xgG.setChecked(false);
            }
        }

        /* JADX DEBUG: Duplicate block (B:116:0x0048) to fix multi-entry loop: BACK_EDGE: B:116:0x0048 -> B:18:0x0048 */
        /* JADX WARN: Path cross not found for [B:117:0x001b, B:18:0x0048], limit reached: 121 */
        /* JADX WARN: Removed duplicated region for block: B:106:0x01d9  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x004d  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x006b  */
        /* JADX WARN: Removed duplicated region for block: B:82:0x0177  */
        /* JADX WARN: Removed duplicated region for block: B:84:0x017b  */
        /* JADX WARN: Removed duplicated region for block: B:91:0x019e  */
        /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:116:0x0048
            	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
            	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
            	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
            */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static final void KWHzl(o.mKY.ActionBar r11, android.view.View r12) {
            /*
                android.widget.EditText r12 = r11.AYXKKw
                java.lang.String r0 = ""
                if (r12 == 0) goto L12
                android.text.Editable r12 = r12.getText()
                if (r12 == 0) goto L12
                java.lang.String r12 = r12.toString()
                if (r12 != 0) goto L13
            L12:
                r12 = r0
            L13:
                int r1 = r12.length()
                r2 = 0
                r3 = 0
                if (r1 <= 0) goto L48
                java.lang.CharSequence r1 = kotlin.text.StringsKt.isConnected(r12)     // Catch: java.lang.Exception -> L48
                java.lang.String r1 = r1.toString()     // Catch: java.lang.Exception -> L48
                java.lang.String r4 = "{"
                r5 = 2
                boolean r4 = kotlin.text.StringsKt.startsWith$default(r1, r4, r2, r5, r3)     // Catch: java.lang.Exception -> L48
                if (r4 == 0) goto L36
                org.json.JSONObject r4 = new org.json.JSONObject     // Catch: java.lang.Exception -> L48
                r4.<init>(r1)     // Catch: java.lang.Exception -> L48
                java.lang.String r1 = r4.toString(r5)     // Catch: java.lang.Exception -> L48
                goto L49
            L36:
                java.lang.String r4 = "["
                boolean r4 = kotlin.text.StringsKt.startsWith$default(r1, r4, r2, r5, r3)     // Catch: java.lang.Exception -> L48
                if (r4 == 0) goto L48
                org.json.JSONArray r4 = new org.json.JSONArray     // Catch: java.lang.Exception -> L48
                r4.<init>(r1)     // Catch: java.lang.Exception -> L48
                java.lang.String r1 = r4.toString(r5)     // Catch: java.lang.Exception -> L48
                goto L49
            L48:
                r1 = r12
            L49:
                java.lang.String r4 = r11.KWHzl
                if (r4 != 0) goto L51
                kotlin.jvm.internal.Intrinsics.gEmmrt(r0)
                r4 = r3
            L51:
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r6 = "payload_key_prefix_"
                r5.append(r6)
                r5.append(r4)
                java.lang.String r4 = "_draft"
                r5.append(r4)
                java.lang.String r5 = r5.toString()
                java.lang.String r7 = r11.AkhnZx
                if (r7 != 0) goto L6f
                kotlin.jvm.internal.Intrinsics.gEmmrt(r0)
                r7 = r3
            L6f:
                com.okinc.core.util.SPUtils.put(r5, r1, r7)
                o.xgG r5 = r11.AhwBna
                r7 = 1
                if (r5 == 0) goto L177
                boolean r5 = r5.isChecked()
                if (r5 != r7) goto L177
                kotlin.jvm.internal.Intrinsics.copydefault(r1)
                int r5 = r1.length()
                if (r5 <= 0) goto L119
                boolean r5 = r11.EZpvd
                if (r5 == 0) goto Lb3
                java.lang.String r5 = r11.KWHzl
                if (r5 != 0) goto L92
                kotlin.jvm.internal.Intrinsics.gEmmrt(r0)
                r5 = r3
            L92:
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                r8.append(r6)
                r8.append(r5)
                java.lang.String r5 = r8.toString()
                o.mKY$TaskDescription r8 = o.mKY.Companion
                java.lang.String r8 = r8.KWHzl(r1)
                java.lang.String r9 = r11.AkhnZx
                if (r9 != 0) goto Laf
                kotlin.jvm.internal.Intrinsics.gEmmrt(r0)
                r9 = r3
            Laf:
                com.okinc.core.util.SPUtils.put(r5, r8, r9)
                goto Lf2
            Lb3:
                java.lang.String r5 = r11.KWHzl
                if (r5 != 0) goto Lbb
                kotlin.jvm.internal.Intrinsics.gEmmrt(r0)
                r5 = r3
            Lbb:
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                r8.append(r6)
                r8.append(r5)
                java.lang.String r5 = r8.toString()
                o.mKY$TaskDescription r8 = o.mKY.Companion
                java.lang.String r9 = r8.KWHzl(r1)
                java.lang.String r10 = r11.AkhnZx
                if (r10 != 0) goto Ld8
                kotlin.jvm.internal.Intrinsics.gEmmrt(r0)
                r10 = r3
            Ld8:
                com.okinc.core.util.SPUtils.put(r5, r9, r10)
                java.lang.String r5 = r11.KWHzl
                if (r5 != 0) goto Le3
                kotlin.jvm.internal.Intrinsics.gEmmrt(r0)
                r5 = r3
            Le3:
                java.lang.String r8 = r8.OLrzqt(r1)
                java.lang.String r9 = r11.AkhnZx
                if (r9 != 0) goto Lef
                kotlin.jvm.internal.Intrinsics.gEmmrt(r0)
                r9 = r3
            Lef:
                com.okinc.core.util.SPUtils.put(r5, r8, r9)
            Lf2:
                java.lang.String r5 = r11.KWHzl
                if (r5 != 0) goto Lfa
                kotlin.jvm.internal.Intrinsics.gEmmrt(r0)
                r5 = r3
            Lfa:
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                r8.append(r6)
                r8.append(r5)
                r8.append(r4)
                java.lang.String r4 = r8.toString()
                java.lang.String r5 = r11.AkhnZx
                if (r5 != 0) goto L114
                kotlin.jvm.internal.Intrinsics.gEmmrt(r0)
                r5 = r3
            L114:
                com.okinc.core.util.SPUtils.remove(r4, r5)
                goto L1d3
            L119:
                boolean r4 = r11.EZpvd
                if (r4 == 0) goto L141
                java.lang.String r4 = r11.KWHzl
                if (r4 != 0) goto L125
                kotlin.jvm.internal.Intrinsics.gEmmrt(r0)
                r4 = r3
            L125:
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                r5.append(r6)
                r5.append(r4)
                java.lang.String r4 = r5.toString()
                java.lang.String r5 = r11.AkhnZx
                if (r5 != 0) goto L13c
                kotlin.jvm.internal.Intrinsics.gEmmrt(r0)
                r5 = r3
            L13c:
                com.okinc.core.util.SPUtils.remove(r4, r5)
                goto L1d3
            L141:
                java.lang.String r4 = r11.KWHzl
                if (r4 != 0) goto L149
                kotlin.jvm.internal.Intrinsics.gEmmrt(r0)
                r4 = r3
            L149:
                java.lang.String r5 = r11.AkhnZx
                if (r5 != 0) goto L151
                kotlin.jvm.internal.Intrinsics.gEmmrt(r0)
                r5 = r3
            L151:
                com.okinc.core.util.SPUtils.remove(r4, r5)
                java.lang.String r4 = r11.KWHzl
                if (r4 != 0) goto L15c
                kotlin.jvm.internal.Intrinsics.gEmmrt(r0)
                r4 = r3
            L15c:
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                r5.append(r6)
                r5.append(r4)
                java.lang.String r4 = r5.toString()
                java.lang.String r5 = r11.AkhnZx
                if (r5 != 0) goto L173
                kotlin.jvm.internal.Intrinsics.gEmmrt(r0)
                r5 = r3
            L173:
                com.okinc.core.util.SPUtils.remove(r4, r5)
                goto L1d3
            L177:
                boolean r4 = r11.EZpvd
                if (r4 == 0) goto L19e
                java.lang.String r4 = r11.KWHzl
                if (r4 != 0) goto L183
                kotlin.jvm.internal.Intrinsics.gEmmrt(r0)
                r4 = r3
            L183:
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                r5.append(r6)
                r5.append(r4)
                java.lang.String r4 = r5.toString()
                java.lang.String r5 = r11.AkhnZx
                if (r5 != 0) goto L19a
                kotlin.jvm.internal.Intrinsics.gEmmrt(r0)
                r5 = r3
            L19a:
                com.okinc.core.util.SPUtils.remove(r4, r5)
                goto L1d3
            L19e:
                java.lang.String r4 = r11.KWHzl
                if (r4 != 0) goto L1a6
                kotlin.jvm.internal.Intrinsics.gEmmrt(r0)
                r4 = r3
            L1a6:
                java.lang.String r5 = r11.AkhnZx
                if (r5 != 0) goto L1ae
                kotlin.jvm.internal.Intrinsics.gEmmrt(r0)
                r5 = r3
            L1ae:
                com.okinc.core.util.SPUtils.remove(r4, r5)
                java.lang.String r4 = r11.KWHzl
                if (r4 != 0) goto L1b9
                kotlin.jvm.internal.Intrinsics.gEmmrt(r0)
                r4 = r3
            L1b9:
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                r5.append(r6)
                r5.append(r4)
                java.lang.String r4 = r5.toString()
                java.lang.String r5 = r11.AkhnZx
                if (r5 != 0) goto L1d0
                kotlin.jvm.internal.Intrinsics.gEmmrt(r0)
                r5 = r3
            L1d0:
                com.okinc.core.util.SPUtils.remove(r4, r5)
            L1d3:
                boolean r12 = kotlin.jvm.internal.Intrinsics.EZpvd(r1, r12)
                if (r12 != 0) goto L1f6
                kotlin.jvm.internal.Intrinsics.copydefault(r1)
                int r12 = r1.length()
                if (r12 <= 0) goto L1f6
                android.widget.EditText r12 = r11.AYXKKw
                if (r12 == 0) goto L1e9
                r12.setText(r1)
            L1e9:
                android.widget.EditText r11 = r11.AYXKKw
                if (r11 == 0) goto L1fb
                o.mLp r12 = new o.mLp
                r12.<init>()
                r11.post(r12)
                goto L1fb
            L1f6:
                java.lang.String r11 = "Saved"
                o.C55326xho.toastWithSuccessfulIcon$default(r11, r2, r7, r3)
            L1fb:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: o.mKY.ActionBar.KWHzl(o.mKY$ActionBar, android.view.View):void");
        }

        public static final void EZpvd() {
            C55326xho.toastWithSuccessfulIcon$default("Saved", 0, 1, (java.lang.Object) null);
        }

        @Override // o.wXX, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
        public void onDismiss(@NotNull android.content.DialogInterface dialogInterface) {
            Intrinsics.checkNotNullParameter(dialogInterface, "");
            super.onDismiss(dialogInterface);
            Function1<? super java.lang.String, Unit> function1 = this.gEmmrt;
            if (function1 != null) {
                java.lang.String str = this.KWHzl;
                if (str == null) {
                    Intrinsics.gEmmrt("");
                    str = null;
                }
                function1.invoke(str);
            }
        }
    }

    public static final class Activity extends wXX {
        public Function2<? super java.lang.Boolean, ? super java.lang.Boolean, Unit> EZpvd;
        public static final ActionBar Companion = new ActionBar(null);
        public static final int AEQbTJ = 8;
        public boolean OLrzqt = true;
        public boolean KWHzl = true;

        public static final class ActionBar {
            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.mKY.Activity.ActionBar.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private ActionBar() {
            }

            public final Activity KWHzl(boolean z, boolean z2, @NotNull Function2<? super java.lang.Boolean, ? super java.lang.Boolean, Unit> function2) {
                Intrinsics.checkNotNullParameter(function2, "");
                Activity activity = new Activity();
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putBoolean("show_overridden", z);
                bundle.putBoolean("show_unoverridden", z2);
                activity.setArguments(bundle);
                activity.EZpvd = function2;
                return activity;
            }
        }

        @Override // o.wXX, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
        public void onCreate(android.os.Bundle bundle) {
            super.onCreate(bundle);
            android.os.Bundle arguments = getArguments();
            if (arguments != null) {
                this.OLrzqt = arguments.getBoolean("show_overridden", true);
                this.KWHzl = arguments.getBoolean("show_unoverridden", true);
            }
        }

        @Override // o.wXX
        public void onCreateHeader(@NotNull C52781wYc c52781wYc) {
            Intrinsics.checkNotNullParameter(c52781wYc, "");
            c52781wYc.setType(67);
            c52781wYc.setTitle("Filter Options");
        }

        @Override // o.wXX
        public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
            Intrinsics.checkNotNullParameter(constraintLayout, "");
            android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(constraintLayout.getContext());
            linearLayout.setOrientation(1);
            linearLayout.setLayoutParams(new ConstraintLayout.LayoutParams(-1, -2));
            android.content.Context context = linearLayout.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            int iOLrzqt = C55298xhM.OLrzqt(16, context);
            android.content.Context context2 = linearLayout.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            int iOLrzqt2 = C55298xhM.OLrzqt(16, context2);
            android.content.Context context3 = linearLayout.getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "");
            int iOLrzqt3 = C55298xhM.OLrzqt(16, context3);
            android.content.Context context4 = linearLayout.getContext();
            Intrinsics.checkNotNullExpressionValue(context4, "");
            linearLayout.setPadding(iOLrzqt, iOLrzqt2, iOLrzqt3, C55298xhM.OLrzqt(16, context4));
            android.content.Context context5 = constraintLayout.getContext();
            Intrinsics.checkNotNullExpressionValue(context5, "");
            final wYK wyk = new wYK(context5, null, 0, 6, null);
            wyk.setText("Overridden Flags");
            wyk.setChecked(this.OLrzqt);
            wyk.setOKDSSize(-4);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            android.content.Context context6 = wyk.getContext();
            Intrinsics.checkNotNullExpressionValue(context6, "");
            layoutParams.bottomMargin = C55298xhM.OLrzqt(16, context6);
            wyk.setLayoutParams(layoutParams);
            android.content.Context context7 = constraintLayout.getContext();
            Intrinsics.checkNotNullExpressionValue(context7, "");
            final wYK wyk2 = new wYK(context7, null, 0, 6, null);
            wyk2.setText("Unoverridden Flags");
            wyk2.setChecked(this.KWHzl);
            wyk2.setOKDSSize(-4);
            wyk2.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            wyk.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: o.mLe
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z) {
                    mKY.Activity.KWHzl(this.copydefault, wyk2, compoundButton, z);
                }
            });
            wyk2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: o.mLk
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z) {
                    mKY.Activity.AEQbTJ(this.OLrzqt, wyk, compoundButton, z);
                }
            });
            linearLayout.addView(wyk);
            linearLayout.addView(wyk2);
            ConstraintLayout.LayoutParams layoutParams2 = new ConstraintLayout.LayoutParams(-1, -2);
            layoutParams2.topToTop = 0;
            layoutParams2.startToStart = 0;
            layoutParams2.endToEnd = 0;
            Unit unit = Unit.INSTANCE;
            constraintLayout.addView(linearLayout, layoutParams2);
        }

        public static final void KWHzl(Activity activity, wYK wyk, android.widget.CompoundButton compoundButton, boolean z) {
            Function2<? super java.lang.Boolean, ? super java.lang.Boolean, Unit> function2 = activity.EZpvd;
            if (function2 != null) {
                function2.invoke(java.lang.Boolean.valueOf(z), java.lang.Boolean.valueOf(wyk.isChecked()));
            }
        }

        public static final void AEQbTJ(Activity activity, wYK wyk, android.widget.CompoundButton compoundButton, boolean z) {
            Function2<? super java.lang.Boolean, ? super java.lang.Boolean, Unit> function2 = activity.EZpvd;
            if (function2 != null) {
                function2.invoke(java.lang.Boolean.valueOf(wyk.isChecked()), java.lang.Boolean.valueOf(z));
            }
        }
    }

    private final void djBIcL() {
        java.lang.String string;
        C55230xfy c55230xfy = this.gEmmrt;
        java.lang.String str = "";
        if (c55230xfy == null) {
            Intrinsics.gEmmrt("");
            c55230xfy = null;
        }
        android.text.Editable text = c55230xfy.KWHzl().getText();
        if (text != null && (string = text.toString()) != null) {
            str = string;
        }
        EZpvd(str);
    }

    public final java.lang.String OLrzqt(java.lang.String str) {
        java.lang.Object abConfig = KWHzl().getAbConfig(str, null);
        if (abConfig instanceof JSONObject) {
            JSONObject jSONObject = (JSONObject) abConfig;
            if (jSONObject.has("legacy_value") && jSONObject.has("legacy_payload")) {
                return jSONObject.get("legacy_value").toString();
            }
        }
        if (abConfig != null) {
            return abConfig.toString();
        }
        return null;
    }

    public final java.lang.String AEQbTJ(java.lang.String str) {
        java.lang.Object abConfig = KWHzl().getAbConfig(str, null);
        if (abConfig instanceof JSONObject) {
            JSONObject jSONObject = (JSONObject) abConfig;
            if (jSONObject.has("legacy_value") && jSONObject.has("legacy_payload")) {
                return jSONObject.get("legacy_payload").toString();
            }
        }
        if (abConfig != null) {
            return abConfig.toString();
        }
        return null;
    }

    public final boolean copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.Object abConfig = KWHzl().getAbConfig(str, null);
        if (abConfig instanceof JSONObject) {
            JSONObject jSONObject = (JSONObject) abConfig;
            if (jSONObject.has("legacy_value") && jSONObject.has("legacy_payload")) {
                return true;
            }
        }
        return false;
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.mKY.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final java.lang.String OLrzqt(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            try {
                JSONObject jSONObject = new JSONObject(StringsKt__StringsKt.hDKMBd((java.lang.CharSequence) str).toString());
                return (jSONObject.has("legacy_value") && jSONObject.has("legacy_payload")) ? jSONObject.get("legacy_value").toString() : str;
            } catch (java.lang.Exception unused) {
                return str;
            }
        }

        public final java.lang.String KWHzl(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            try {
                JSONObject jSONObject = new JSONObject(StringsKt__StringsKt.hDKMBd((java.lang.CharSequence) str).toString());
                return (jSONObject.has("legacy_value") && jSONObject.has("legacy_payload")) ? jSONObject.get("legacy_payload").toString() : str;
            } catch (java.lang.Exception unused) {
                return str;
            }
        }

        public final android.content.Intent AEQbTJ(@NotNull android.content.Context context, @NotNull AmplitudeName amplitudeName) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(amplitudeName, "");
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) mKY.class);
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
