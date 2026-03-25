package o;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.LottieAnimationView;
import com.airbnb.lottie.RenderMode;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.okinc.business.defi.wallet.transaction.moduleModel.bean.DataInputModuleModel;
import com.okinc.components.security.scanner.DeviceScanner;
import com.okinc.components.security.scanner.EnsecureAppInfo;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C32679miD;
import o.C32726miy;
import o.C32788mkG;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: renamed from: o.mka, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C32808mka extends androidx.fragment.app.Fragment {
    public int AhwBna;
    public boolean AkhnZx;
    public LottieAnimationView AuCTel;
    public C32779mjy AwvSrB;
    public int AxsJAY;
    public boolean DbNXlk;
    public int copydefault;
    public java.lang.Runnable djBIcL;
    public long ejfBZ;
    public ActivityC32771mjq fIwbmz;
    public InterfaceC32766mjl fJNWhG;
    public int fetchVPNInfo;
    public android.animation.ValueAnimator hDKMBd;
    public boolean isConnected;
    public boolean values;
    public C32682miG wlaJM;
    public int zuBGHE;
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int KWHzl = 8;
    public static final java.util.List<java.lang.Integer> EZpvd = yDY.gEmmrt(1, 2, 3, 4);
    public final C58216yxB gEmmrt = new C58216yxB();
    public java.util.List<EnsecureAppInfo> OLrzqt = new java.util.ArrayList();
    public final android.os.Handler valueOf = new android.os.Handler(android.os.Looper.getMainLooper());
    public float AEQbTJ = 1.0f;
    public float getNewProxyInstance = 4.0f;
    public float AYXKKw = 1.0f;
    public java.util.Map<java.lang.Integer, Application> zLjUOn = C56424yEw.isConnected(C56424yEw.KWHzl());
    public final java.util.Map<java.lang.Integer, ActionBar> uzCIH = new LinkedHashMap();
    public final java.util.Map<java.lang.Integer, Activity> getFieldNames = new LinkedHashMap();
    public final java.util.Map<java.lang.Integer, C32782mkA> zsXlph = new LinkedHashMap();
    public final java.util.Set<EnsecureAppInfo> AuCTelauCTel = new LinkedHashSet();
    public final long AubY = 500;
    public java.util.List<java.lang.Integer> iwGUEr = new java.util.ArrayList();
    public java.util.Map<java.lang.Integer, C32809mkb> fARcdN = C56424yEw.KWHzl();

    /* JADX INFO: renamed from: o.mka$PendingIntent */
    public static final /* synthetic */ class PendingIntent implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public PendingIntent(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.KWHzl = function1;
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
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.KWHzl.invoke(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(@NotNull InterfaceC32766mjl interfaceC32766mjl) {
        Intrinsics.checkNotNullParameter(interfaceC32766mjl, "");
        this.fJNWhG = interfaceC32766mjl;
    }

    private final android.content.pm.PackageManager getNewProxyInstance() {
        android.content.pm.PackageManager packageManager = C43246rlf.OLrzqt.valueOf().getApplicationContext().getPackageManager();
        Intrinsics.checkNotNullExpressionValue(packageManager, "");
        return packageManager;
    }

    public final int AEQbTJ() {
        ActivityC32771mjq activityC32771mjq = this.fIwbmz;
        if (activityC32771mjq == null) {
            Intrinsics.gEmmrt("");
            activityC32771mjq = null;
        }
        return activityC32771mjq.OLrzqt();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.String hDKMBd() {
        java.lang.String string;
        android.os.Bundle arguments = getArguments();
        return (arguments == null || (string = arguments.getString("scene")) == null) ? "" : string;
    }

    /* JADX INFO: renamed from: o.mka$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.mka.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final java.util.List<java.lang.Integer> OLrzqt() {
            return C32808mka.EZpvd;
        }

        public static /* synthetic */ C32808mka newInstance$default(TaskDescription taskDescription, boolean z, boolean z2, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 2) != 0) {
                z2 = false;
            }
            if ((i & 4) != 0) {
                str = "";
            }
            return taskDescription.EZpvd(z, z2, str);
        }

        public final C32808mka EZpvd(boolean z, boolean z2, @NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            C32808mka c32808mka = new C32808mka();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putBoolean("isShowLastRecord", z2);
            bundle.putBoolean("isShowScanResult", z);
            bundle.putString("scene", str);
            c32808mka.setArguments(bundle);
            return c32808mka;
        }
    }

    /* JADX INFO: renamed from: o.mka$AssistContent */
    public static final class AssistContent implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ C32808mka KWHzl;
        public final /* synthetic */ Activity OLrzqt;
        public final /* synthetic */ int copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AssistContent(android.view.View view, long j, C32808mka c32808mka, int i, Activity activity) {
            this.AEQbTJ = view;
            this.EZpvd = j;
            this.KWHzl = c32808mka;
            this.copydefault = i;
            this.OLrzqt = activity;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.EZpvd || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.KWHzl.OLrzqt(this.copydefault, this.OLrzqt);
            }
        }
    }

    /* JADX INFO: renamed from: o.mka$BroadcastReceiver */
    public static final class BroadcastReceiver implements View.OnClickListener {
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ C32808mka copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public BroadcastReceiver(android.view.View view, long j, C32808mka c32808mka) {
            this.OLrzqt = view;
            this.EZpvd = j;
            this.copydefault = c32808mka;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.EZpvd || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.copydefault.AkhnZx();
                InterfaceC32766mjl interfaceC32766mjl = this.copydefault.fJNWhG;
                if (interfaceC32766mjl != null) {
                    interfaceC32766mjl.KWHzl();
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.mka$ClipData */
    public static final class ClipData implements View.OnClickListener {
        public final /* synthetic */ C32808mka AEQbTJ;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ClipData(android.view.View view, long j, C32808mka c32808mka) {
            this.OLrzqt = view;
            this.copydefault = j;
            this.AEQbTJ = c32808mka;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.copydefault || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                InterfaceC32766mjl interfaceC32766mjl = this.AEQbTJ.fJNWhG;
                if (interfaceC32766mjl != null) {
                    interfaceC32766mjl.EZpvd();
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.mka$ComponentCallbacks */
    public static final class ComponentCallbacks implements View.OnClickListener {
        public final /* synthetic */ C32808mka AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ android.view.View KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ComponentCallbacks(android.view.View view, long j, C32808mka c32808mka) {
            this.KWHzl = view;
            this.EZpvd = j;
            this.AEQbTJ = c32808mka;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.EZpvd || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                this.AEQbTJ.AkhnZx();
                InterfaceC32766mjl interfaceC32766mjl = this.AEQbTJ.fJNWhG;
                if (interfaceC32766mjl != null) {
                    interfaceC32766mjl.KWHzl();
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.mka$ComponentCallbacks2 */
    public static final class ComponentCallbacks2 implements View.OnClickListener {
        public final /* synthetic */ C32808mka AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ long OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ComponentCallbacks2(android.view.View view, long j, C32808mka c32808mka) {
            this.EZpvd = view;
            this.OLrzqt = j;
            this.AEQbTJ = c32808mka;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.OLrzqt || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                C32866mlf.onEvent$default("DeviceScanning_Logout_Button_Click", (TrackChannel[]) null, this.AEQbTJ.new SharedElementCallback(), 1, (java.lang.Object) null);
                InterfaceC32766mjl interfaceC32766mjl = this.AEQbTJ.fJNWhG;
                if (interfaceC32766mjl != null) {
                    interfaceC32766mjl.EZpvd();
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.mka$Dialog */
    public static final class Dialog implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ C32808mka copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Dialog(android.view.View view, long j, C32808mka c32808mka) {
            this.KWHzl = view;
            this.AEQbTJ = j;
            this.copydefault = c32808mka;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.AEQbTJ || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                java.util.List list = this.copydefault.OLrzqt;
                if (!(list instanceof java.util.Collection) || !list.isEmpty()) {
                    java.util.Iterator it = list.iterator();
                    while (it.hasNext()) {
                        if (((EnsecureAppInfo) it.next()).getScanResult().getLevel() == EnsecureAppInfo.RiskLevel.DEVICE_SECURITY_LEVEL_HIGH) {
                            C32750mjV c32750mjVKWHzl = C32750mjV.Companion.KWHzl(this.copydefault.new StateListAnimator());
                            androidx.fragment.app.FragmentManager parentFragmentManager = this.copydefault.getParentFragmentManager();
                            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "");
                            c32750mjVKWHzl.show(parentFragmentManager);
                            return;
                        }
                    }
                }
                InterfaceC32766mjl interfaceC32766mjl = this.copydefault.fJNWhG;
                if (interfaceC32766mjl != null) {
                    interfaceC32766mjl.EZpvd();
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.mka$LoaderManager */
    public static final class LoaderManager implements View.OnClickListener {
        public final /* synthetic */ C32808mka AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ android.view.View KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public LoaderManager(android.view.View view, long j, C32808mka c32808mka) {
            this.KWHzl = view;
            this.EZpvd = j;
            this.AEQbTJ = c32808mka;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.EZpvd || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                this.AEQbTJ.AhwBna();
            }
        }
    }

    /* JADX INFO: renamed from: o.mka$TaskStackBuilder */
    public static final class TaskStackBuilder implements View.OnClickListener {
        public final /* synthetic */ C32808mka AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ long OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskStackBuilder(android.view.View view, long j, C32808mka c32808mka) {
            this.EZpvd = view;
            this.OLrzqt = j;
            this.AEQbTJ = c32808mka;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.OLrzqt || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                this.AEQbTJ.valueOf();
            }
        }
    }

    /* JADX INFO: renamed from: o.mka$ActionBar */
    /* JADX INFO: loaded from: classes18.dex */
    public static final class ActionBar {
        public final boolean AEQbTJ;
        public final int EZpvd;
        public final boolean OLrzqt;
        public final java.util.List<EnsecureAppInfo> copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.mka$ActionBar */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ActionBar copy$default(ActionBar actionBar, int i, boolean z, boolean z2, java.util.List list, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                i = actionBar.EZpvd;
            }
            if ((i2 & 2) != 0) {
                z = actionBar.OLrzqt;
            }
            if ((i2 & 4) != 0) {
                z2 = actionBar.AEQbTJ;
            }
            if ((i2 & 8) != 0) {
                list = actionBar.copydefault;
            }
            return actionBar.copydefault(i, z, z2, list);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean AEQbTJ() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<EnsecureAppInfo> KWHzl() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean OLrzqt() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ActionBar copydefault(int i, boolean z, boolean z2, @NotNull java.util.List<EnsecureAppInfo> list) {
            Intrinsics.checkNotNullParameter(list, "");
            return new ActionBar(i, z, z2, list);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ActionBar)) {
                return false;
            }
            ActionBar actionBar = (ActionBar) obj;
            return this.EZpvd == actionBar.EZpvd && this.OLrzqt == actionBar.OLrzqt && this.AEQbTJ == actionBar.AEQbTJ && Intrinsics.EZpvd(this.copydefault, actionBar.copydefault);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((((java.lang.Integer.hashCode(this.EZpvd) * 31) + java.lang.Boolean.hashCode(this.OLrzqt)) * 31) + java.lang.Boolean.hashCode(this.AEQbTJ)) * 31) + this.copydefault.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "ScanItemState(scanType=" + this.EZpvd + ", isExpanded=" + this.OLrzqt + ", isCompleted=" + this.AEQbTJ + ", scanResults=" + this.copydefault + ")";
        }

        public ActionBar(int i, boolean z, boolean z2, @NotNull java.util.List<EnsecureAppInfo> list) {
            Intrinsics.checkNotNullParameter(list, "");
            this.EZpvd = i;
            this.OLrzqt = z;
            this.AEQbTJ = z2;
            this.copydefault = list;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0013: CONSTRUCTOR 
  (r2v0 int)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? false : (r3v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? false : (r4v0 boolean))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x000f: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:192)) : (r5v0 java.util.List))
 A[MD:(int, boolean, boolean, java.util.List<com.okinc.components.security.scanner.EnsecureAppInfo>):void (m)] (LINE:188) call: o.mka.ActionBar.<init>(int, boolean, boolean, java.util.List):void type: THIS */
        public /* synthetic */ ActionBar(int i, boolean z, boolean z2, java.util.List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, (i2 & 2) != 0 ? false : z, (i2 & 4) != 0 ? false : z2, (i2 & 8) != 0 ? yDY.AhwBna() : list);
        }
    }

    /* JADX INFO: renamed from: o.mka$Activity */
    /* JADX INFO: loaded from: classes18.dex */
    public static final class Activity {
        public final RecyclerView AEQbTJ;
        public final LottieAnimationView EZpvd;
        public final android.widget.LinearLayout KWHzl;
        public final android.widget.TextView OLrzqt;
        public final android.widget.LinearLayout copydefault;
        public final android.widget.TextView valueOf;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Activity copy$default(Activity activity, android.widget.LinearLayout linearLayout, android.widget.LinearLayout linearLayout2, RecyclerView recyclerView, LottieAnimationView lottieAnimationView, android.widget.TextView textView, android.widget.TextView textView2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                linearLayout = activity.KWHzl;
            }
            if ((i & 2) != 0) {
                linearLayout2 = activity.copydefault;
            }
            android.widget.LinearLayout linearLayout3 = linearLayout2;
            if ((i & 4) != 0) {
                recyclerView = activity.AEQbTJ;
            }
            RecyclerView recyclerView2 = recyclerView;
            if ((i & 8) != 0) {
                lottieAnimationView = activity.EZpvd;
            }
            LottieAnimationView lottieAnimationView2 = lottieAnimationView;
            if ((i & 16) != 0) {
                textView = activity.valueOf;
            }
            android.widget.TextView textView3 = textView;
            if ((i & 32) != 0) {
                textView2 = activity.OLrzqt;
            }
            return activity.KWHzl(linearLayout, linearLayout3, recyclerView2, lottieAnimationView2, textView3, textView2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.widget.TextView AEQbTJ() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.widget.TextView AhwBna() {
            return this.valueOf;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final RecyclerView EZpvd() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.widget.LinearLayout KWHzl() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Activity KWHzl(@NotNull android.widget.LinearLayout linearLayout, @NotNull android.widget.LinearLayout linearLayout2, @NotNull RecyclerView recyclerView, @NotNull LottieAnimationView lottieAnimationView, @NotNull android.widget.TextView textView, @NotNull android.widget.TextView textView2) {
            Intrinsics.checkNotNullParameter(linearLayout, "");
            Intrinsics.checkNotNullParameter(linearLayout2, "");
            Intrinsics.checkNotNullParameter(recyclerView, "");
            Intrinsics.checkNotNullParameter(lottieAnimationView, "");
            Intrinsics.checkNotNullParameter(textView, "");
            Intrinsics.checkNotNullParameter(textView2, "");
            return new Activity(linearLayout, linearLayout2, recyclerView, lottieAnimationView, textView, textView2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.widget.LinearLayout OLrzqt() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final LottieAnimationView copydefault() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Activity)) {
                return false;
            }
            Activity activity = (Activity) obj;
            return Intrinsics.EZpvd(this.KWHzl, activity.KWHzl) && Intrinsics.EZpvd(this.copydefault, activity.copydefault) && Intrinsics.EZpvd(this.AEQbTJ, activity.AEQbTJ) && Intrinsics.EZpvd(this.EZpvd, activity.EZpvd) && Intrinsics.EZpvd(this.valueOf, activity.valueOf) && Intrinsics.EZpvd(this.OLrzqt, activity.OLrzqt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((((((((this.KWHzl.hashCode() * 31) + this.copydefault.hashCode()) * 31) + this.AEQbTJ.hashCode()) * 31) + this.EZpvd.hashCode()) * 31) + this.valueOf.hashCode()) * 31) + this.OLrzqt.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "ScanItemView(scanItem=" + this.KWHzl + ", scanItemHeader=" + this.copydefault + ", rvScanResults=" + this.AEQbTJ + ", ivProgressIcon=" + this.EZpvd + ", tvItemTitle=" + this.valueOf + ", tvItemInfo=" + this.OLrzqt + ")";
        }

        public Activity(@NotNull android.widget.LinearLayout linearLayout, @NotNull android.widget.LinearLayout linearLayout2, @NotNull RecyclerView recyclerView, @NotNull LottieAnimationView lottieAnimationView, @NotNull android.widget.TextView textView, @NotNull android.widget.TextView textView2) {
            Intrinsics.checkNotNullParameter(linearLayout, "");
            Intrinsics.checkNotNullParameter(linearLayout2, "");
            Intrinsics.checkNotNullParameter(recyclerView, "");
            Intrinsics.checkNotNullParameter(lottieAnimationView, "");
            Intrinsics.checkNotNullParameter(textView, "");
            Intrinsics.checkNotNullParameter(textView2, "");
            this.KWHzl = linearLayout;
            this.copydefault = linearLayout2;
            this.AEQbTJ = recyclerView;
            this.EZpvd = lottieAnimationView;
            this.valueOf = textView;
            this.OLrzqt = textView2;
        }
    }

    public final void KWHzl(Activity activity, java.lang.String str) {
        android.graphics.drawable.Drawable drawable;
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "up")) {
            drawable = ContextCompat.getDrawable(activity.AhwBna().getContext(), C52761wXj.TaskDescription.dUDNAs);
        } else {
            drawable = Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "down") ? ContextCompat.getDrawable(activity.AhwBna().getContext(), C52761wXj.TaskDescription.QSLkRj) : null;
        }
        activity.AhwBna().setCompoundDrawablesRelativeWithIntrinsicBounds((android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, drawable, (android.graphics.drawable.Drawable) null);
    }

    @Override // androidx.fragment.app.Fragment
    public android.view.View onCreateView(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        C32682miG c32682miGEZpvd = C32682miG.EZpvd(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c32682miGEZpvd, "");
        this.wlaJM = c32682miGEZpvd;
        this.values = false;
        this.iwGUEr.clear();
        KWHzl(c32682miGEZpvd);
        android.os.Bundle arguments = getArguments();
        this.DbNXlk = arguments != null ? arguments.getBoolean("isShowLastRecord") : false;
        android.os.Bundle arguments2 = getArguments();
        boolean z = arguments2 != null ? arguments2.getBoolean("isShowScanResult") : false;
        C32779mjy c32779mjyCopydefault = C32731mjC.copydefault(this);
        this.AwvSrB = c32779mjyCopydefault;
        if (c32779mjyCopydefault == null) {
            Intrinsics.gEmmrt("");
            c32779mjyCopydefault = null;
        }
        c32779mjyCopydefault.KWHzl(hDKMBd());
        C32779mjy c32779mjy = this.AwvSrB;
        if (c32779mjy == null) {
            Intrinsics.gEmmrt("");
            c32779mjy = null;
        }
        c32779mjy.DbNXlk();
        AuCTel();
        if (!z) {
            C32682miG c32682miG = this.wlaJM;
            if (c32682miG != null) {
                wYF wyf = c32682miG.OLrzqt;
                wyf.setType(5);
                wyf.setVisibility(0);
                C52794wYp c52794wYpAEQbTJ = wyf.AEQbTJ();
                if (c52794wYpAEQbTJ != null) {
                    c52794wYpAEQbTJ.setVisibility(8);
                }
                C52794wYp c52794wYpCopydefault = wyf.copydefault();
                if (c52794wYpCopydefault != null) {
                    c52794wYpCopydefault.setVisibility(0);
                    c52794wYpCopydefault.setOKDSType(257);
                    c52794wYpCopydefault.setClickable(false);
                    c52794wYpCopydefault.setText(C33070mpX.AYXKKw(C32726miy.Dialog.gHZMYf));
                    c52794wYpCopydefault.OLrzqt(0L);
                }
            }
            djBIcL();
            this.ejfBZ = java.lang.System.currentTimeMillis();
            if (AEQbTJ() == DeviceScanner.ScannerStatus.START.getValue()) {
                C32779mjy c32779mjy2 = this.AwvSrB;
                if (c32779mjy2 == null) {
                    Intrinsics.gEmmrt("");
                    c32779mjy2 = null;
                }
                c32779mjy2.AuCTel();
                C32788mkG.StateListAnimator.recordScanStatus$default(C32788mkG.Companion, DeviceScanner.ScannerStatus.RUNNING.getValue(), null, 2, null);
            }
        }
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
        return c32682miGEZpvd.getRoot();
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        this.AkhnZx = false;
        if (AEQbTJ() == DeviceScanner.ScannerStatus.RUNNING.getValue()) {
            fIwbmz();
        }
        LottieAnimationView lottieAnimationView = this.AuCTel;
        if (lottieAnimationView != null) {
            lottieAnimationView.pauseAnimation();
        }
        for (Application application : this.zLjUOn.values()) {
            if (application != null && application.OLrzqt() && application != null) {
                application.KWHzl();
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        super.onAttach(context);
        this.fIwbmz = (ActivityC32771mjq) context;
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (this.AkhnZx) {
            return;
        }
        this.AkhnZx = true;
        if (AEQbTJ() == DeviceScanner.ScannerStatus.RUNNING.getValue()) {
            fetchVPNInfo();
            for (Application application : this.zLjUOn.values()) {
                if (application != null && application.OLrzqt() && application != null) {
                    application.gEmmrt();
                }
            }
            return;
        }
        if (AEQbTJ() == DeviceScanner.ScannerStatus.COMPLETED.getValue()) {
            if (this.DbNXlk && this.OLrzqt.isEmpty()) {
                this.OLrzqt = EZpvd(this.DbNXlk);
            }
            gEmmrt();
            KWHzl(this.DbNXlk);
            return;
        }
        if (AEQbTJ() == DeviceScanner.ScannerStatus.PENDING.getValue()) {
            C32779mjy c32779mjy = this.AwvSrB;
            C32779mjy c32779mjy2 = null;
            if (c32779mjy == null) {
                Intrinsics.gEmmrt("");
                c32779mjy = null;
            }
            if (!c32779mjy.valueOf()) {
                C32779mjy c32779mjy3 = this.AwvSrB;
                if (c32779mjy3 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    c32779mjy2 = c32779mjy3;
                }
                c32779mjy2.OLrzqt(true);
                return;
            }
            fetchVPNInfo();
            for (Application application2 : this.zLjUOn.values()) {
                if (application2 != null && application2.OLrzqt() && application2 != null) {
                    application2.gEmmrt();
                }
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        C32779mjy c32779mjy = this.AwvSrB;
        if (c32779mjy == null) {
            Intrinsics.gEmmrt("");
            c32779mjy = null;
        }
        c32779mjy.AkhnZx();
        int scanstatus$default = C32788mkG.StateListAnimator.readScanstatus$default(C32788mkG.Companion, null, 1, null);
        if (scanstatus$default != DeviceScanner.ScannerStatus.RUNNING.getValue() && scanstatus$default != DeviceScanner.ScannerStatus.PENDING.getValue()) {
            C32730mjB.AEQbTJ.copydefault();
        }
        android.animation.ValueAnimator valueAnimator = this.hDKMBd;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        LottieAnimationView lottieAnimationView = this.AuCTel;
        if (lottieAnimationView != null) {
            lottieAnimationView.cancelAnimation();
        }
        for (Application application : this.zLjUOn.values()) {
            if (application != null) {
                application.copydefault();
            }
        }
        this.valueOf.removeCallbacksAndMessages(null);
        this.gEmmrt.OLrzqt();
        this.zsXlph.clear();
        this.AuCTelauCTel.clear();
        this.wlaJM = null;
    }

    public final void AuCTel() {
        C32779mjy c32779mjy = this.AwvSrB;
        C32779mjy c32779mjy2 = null;
        if (c32779mjy == null) {
            Intrinsics.gEmmrt("");
            c32779mjy = null;
        }
        c32779mjy.AYXKKw().observe(getViewLifecycleOwner(), new PendingIntent(new Function1() { // from class: o.mkq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C32808mka.EZpvd(this.KWHzl, (C32768mjn) obj);
            }
        }));
        C32779mjy c32779mjy3 = this.AwvSrB;
        if (c32779mjy3 == null) {
            Intrinsics.gEmmrt("");
            c32779mjy3 = null;
        }
        c32779mjy3.gEmmrt().observe(getViewLifecycleOwner(), new PendingIntent(new Function1() { // from class: o.mkt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C32808mka.copydefault(this.KWHzl, (java.util.Map) obj);
            }
        }));
        C32779mjy c32779mjy4 = this.AwvSrB;
        if (c32779mjy4 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c32779mjy2 = c32779mjy4;
        }
        c32779mjy2.djBIcL().observe(getViewLifecycleOwner(), new PendingIntent(new Function1() { // from class: o.mkr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C32808mka.EZpvd(this.copydefault, (C32762mjh) obj);
            }
        }));
    }

    public static final Unit EZpvd(C32808mka c32808mka, C32768mjn c32768mjn) {
        if (!c32808mka.values) {
            c32808mka.iwGUEr.add(java.lang.Integer.valueOf(c32768mjn.copydefault()));
        } else {
            c32808mka.EZpvd(c32768mjn.copydefault());
            c32808mka.AxsJAY = c32768mjn.AEQbTJ();
        }
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(C32808mka c32808mka, java.util.Map map) {
        Intrinsics.copydefault(map);
        c32808mka.copydefault((java.util.Map<java.lang.Integer, C32809mkb>) map);
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(C32808mka c32808mka, C32762mjh c32762mjh) {
        if (c32762mjh.KWHzl() == DeviceScanner.ScannerStatus.COMPLETED) {
            c32808mka.OLrzqt = CollectionsKt___CollectionsKt.fJNWhG((java.util.Collection) c32762mjh.copydefault());
            showScanResult$default(c32808mka, false, 1, null);
        }
        return Unit.INSTANCE;
    }

    public final void KWHzl(C32682miG c32682miG) {
        OLrzqt(c32682miG);
        C32682miG c32682miG2 = this.wlaJM;
        if (c32682miG2 != null) {
            C33537myN c33537myN = c32682miG2.EZpvd;
            android.widget.TextView title = c33537myN.getTitle();
            if (title != null) {
                title.setText(C33070mpX.AYXKKw(C32726miy.Dialog.QbewEr));
                title.setVisibility(0);
            }
            c33537myN.getBackImage().setVisibility(0);
            c33537myN.getDoImage().setVisibility(0);
            c33537myN.setBackClickable(true);
            android.widget.ImageView backImage = c33537myN.getBackImage();
            backImage.setOnClickListener(new Dialog(backImage, 1000L, this));
            android.widget.ImageView doImage = c33537myN.getDoImage();
            doImage.setOnClickListener(new LoaderManager(doImage, 1000L, this));
            android.widget.TextView textView = c32682miG2.valueOf;
            if (Intrinsics.EZpvd((java.lang.Object) hDKMBd(), (java.lang.Object) "defi")) {
                textView.setText(C33070mpX.AYXKKw(C32726miy.Dialog.sSMYrx));
            } else {
                textView.setText(C33070mpX.AYXKKw(C32726miy.Dialog.EZpvd));
            }
        }
        copydefault(c32682miG);
        EZpvd(c32682miG);
    }

    /* JADX INFO: renamed from: o.mka$StateListAnimator */
    public static final class StateListAnimator implements Function0<Unit> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator() {
        }

        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public /* synthetic */ Unit invoke() {
            KWHzl();
            return Unit.INSTANCE;
        }

        public final void KWHzl() {
            InterfaceC32766mjl interfaceC32766mjl = C32808mka.this.fJNWhG;
            if (interfaceC32766mjl != null) {
                interfaceC32766mjl.EZpvd();
            }
        }
    }

    public final void EZpvd(C32682miG c32682miG) {
        android.widget.TextView textView = c32682miG.valueOf;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        android.graphics.drawable.Drawable drawable = ContextCompat.getDrawable(requireContext(), C32679miD.ActionBar.KWHzl);
        if (drawable != null) {
            int i = (int) (8 * getResources().getDisplayMetrics().density);
            drawable.setBounds(0, 0, i, i);
            drawable.setTint(ContextCompat.getColor(requireContext(), C52761wXj.Activity.UlJrfe));
            textView.setCompoundDrawables(drawable, null, null, null);
        }
    }

    public static /* synthetic */ java.util.List getAppList$default(C32808mka c32808mka, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return c32808mka.EZpvd(z);
    }

    public final java.util.List<EnsecureAppInfo> EZpvd(boolean z) {
        if (z) {
            return OLrzqt();
        }
        java.util.List<EnsecureAppInfo> list = this.OLrzqt;
        for (EnsecureAppInfo ensecureAppInfo : list) {
            ensecureAppInfo.setIgnored(C32788mkG.Companion.copydefault(ensecureAppInfo.getPackageName()));
        }
        return CollectionsKt___CollectionsKt.fJNWhG((java.util.Collection) list);
    }

    public static /* synthetic */ void showScanResult$default(C32808mka c32808mka, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        c32808mka.KWHzl(z);
    }

    public static /* synthetic */ void handleIgnoredApps$default(C32808mka c32808mka, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        c32808mka.OLrzqt(z);
    }

    public final void OLrzqt(boolean z) {
        java.util.List<EnsecureAppInfo> listCopydefault = copydefault(z);
        if (!listCopydefault.isEmpty()) {
            OLrzqt(listCopydefault);
        } else {
            EZpvd();
        }
    }

    public static /* synthetic */ java.util.List collectIgnoredApps$default(C32808mka c32808mka, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return c32808mka.copydefault(z);
    }

    public final java.util.List<EnsecureAppInfo> copydefault(boolean z) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (z) {
            java.util.List<EnsecureAppInfo> listOLrzqt = OLrzqt();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (java.lang.Object obj : listOLrzqt) {
                if (((EnsecureAppInfo) obj).isIgnored()) {
                    arrayList2.add(obj);
                }
            }
            arrayList.addAll(arrayList2);
        } else {
            java.util.List<EnsecureAppInfo> list = this.OLrzqt;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            for (java.lang.Object obj2 : list) {
                if (((EnsecureAppInfo) obj2).isIgnored()) {
                    arrayList3.add(obj2);
                }
            }
            arrayList.addAll(arrayList3);
        }
        return arrayList;
    }

    public final void OLrzqt(java.util.List<EnsecureAppInfo> list) {
        if (!this.uzCIH.containsKey(5)) {
            copydefault(5, new ActionBar(5, false, false, null, 14, null));
        }
        copydefault(5, list);
        Activity activityAEQbTJ = AEQbTJ(5);
        if (activityAEQbTJ != null) {
            activityAEQbTJ.KWHzl().setVisibility(0);
            activityAEQbTJ.AhwBna().setText(C33069mpW.copydefault(this, C32726miy.Dialog.zuBGHE, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("num", java.lang.String.valueOf(list.size())))));
            activityAEQbTJ.AEQbTJ().setVisibility(8);
            activityAEQbTJ.copydefault().setVisibility(8);
            Application application = this.zLjUOn.get(5);
            if (application != null) {
                application.EZpvd(true);
            }
            ActionBar actionBarOLrzqt = OLrzqt(5);
            if (actionBarOLrzqt == null || !(!actionBarOLrzqt.KWHzl().isEmpty())) {
                return;
            }
            copydefault(5, ActionBar.copy$default(actionBarOLrzqt, 0, true, false, null, 13, null));
            EZpvd(activityAEQbTJ);
        }
    }

    public final void EZpvd() {
        Activity activityAEQbTJ = AEQbTJ(5);
        if (activityAEQbTJ != null) {
            activityAEQbTJ.KWHzl().setVisibility(8);
            activityAEQbTJ.AhwBna().setText(C33070mpX.AYXKKw(C32726miy.Dialog.zuBGHE));
            activityAEQbTJ.AEQbTJ().setVisibility(0);
            activityAEQbTJ.copydefault().setVisibility(0);
        }
    }

    public static /* synthetic */ void updateUIForScanCompletion$default(C32808mka c32808mka, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        c32808mka.AhwBna(z);
    }

    public final void AhwBna(boolean z) {
        android.view.ViewPropertyAnimator viewPropertyAnimatorAnimate;
        LottieAnimationView lottieAnimationView = this.AuCTel;
        if (lottieAnimationView != null) {
            lottieAnimationView.cancelAnimation();
        }
        C32682miG c32682miG = this.wlaJM;
        if (c32682miG != null) {
            android.widget.RelativeLayout relativeLayout = c32682miG.AkhnZx;
            if (relativeLayout != null) {
                relativeLayout.setVisibility(8);
            }
            android.widget.TextView textView = c32682miG.fARcdN;
            if (textView != null) {
                textView.setVisibility(8);
            }
            android.widget.TextView textView2 = c32682miG.fJNWhG;
            if (textView2 != null) {
                textView2.setVisibility(8);
            }
            android.widget.RelativeLayout relativeLayout2 = c32682miG.AEQbTJ;
            if (relativeLayout2 != null) {
                relativeLayout2.setVisibility(0);
            }
            android.widget.TextView textView3 = c32682miG.ejfBZ;
            if (textView3 != null) {
                textView3.setVisibility(0);
            }
            android.widget.TextView textView4 = c32682miG.ejfBZ;
            if (textView4 != null) {
                textView4.setAlpha(0.0f);
            }
            android.widget.TextView textView5 = c32682miG.ejfBZ;
            if (textView5 != null && (viewPropertyAnimatorAnimate = textView5.animate()) != null) {
                viewPropertyAnimatorAnimate.cancel();
            }
        }
        if (z) {
            C32788mkG.StateListAnimator.recordScanStatus$default(C32788mkG.Companion, DeviceScanner.ScannerStatus.COMPLETED.getValue(), null, 2, null);
            C32682miG c32682miG2 = this.wlaJM;
            if (c32682miG2 != null) {
                if (Intrinsics.EZpvd((java.lang.Object) hDKMBd(), (java.lang.Object) FirebaseAnalytics.Event.LOGIN)) {
                    c32682miG2.ejfBZ.setText(C33070mpX.AYXKKw(C32726miy.Dialog.AhwBna));
                    c32682miG2.getFieldNames.setText(C33070mpX.AYXKKw(C32726miy.Dialog.AEQbTJ));
                    djBIcL(true);
                } else {
                    c32682miG2.ejfBZ.setText(C33070mpX.AYXKKw(C32726miy.Dialog.zLjUOn));
                    djBIcL(false);
                }
                wYF wyf = c32682miG2.OLrzqt;
                wyf.setType(14);
                wyf.setVisibility(0);
                C52794wYp c52794wYpAEQbTJ = wyf.AEQbTJ();
                if (c52794wYpAEQbTJ != null) {
                    c52794wYpAEQbTJ.setVisibility(0);
                    c52794wYpAEQbTJ.setOKDSType(260);
                    if (Intrinsics.EZpvd((java.lang.Object) hDKMBd(), (java.lang.Object) FirebaseAnalytics.Event.LOGIN)) {
                        c52794wYpAEQbTJ.setText(C33070mpX.AYXKKw(C32726miy.Dialog.OLrzqt));
                    } else {
                        c52794wYpAEQbTJ.setText(C33070mpX.AYXKKw(C32726miy.Dialog.AkhnZx));
                    }
                    c52794wYpAEQbTJ.setClickable(false);
                    c52794wYpAEQbTJ.setEnabled(false);
                    c52794wYpAEQbTJ.setOnClickListener(new TaskStackBuilder(c52794wYpAEQbTJ, 1000L, this));
                }
                C52794wYp c52794wYpCopydefault = wyf.copydefault();
                if (c52794wYpCopydefault != null) {
                    c52794wYpCopydefault.setVisibility(0);
                    c52794wYpCopydefault.setOKDSType(257);
                    c52794wYpCopydefault.setClickable(true);
                    c52794wYpCopydefault.setEnabled(true);
                    if (Intrinsics.EZpvd((java.lang.Object) hDKMBd(), (java.lang.Object) FirebaseAnalytics.Event.LOGIN)) {
                        c52794wYpCopydefault.setText(C33070mpX.AYXKKw(C32726miy.Dialog.copydefault));
                        c52794wYpCopydefault.setOnClickListener(new ComponentCallbacks2(c52794wYpCopydefault, 1000L, this));
                    } else {
                        c52794wYpCopydefault.setText(C33070mpX.AYXKKw(C32726miy.Dialog.AxsJAY));
                        c52794wYpCopydefault.setOnClickListener(new ComponentCallbacks(c52794wYpCopydefault, 1000L, this));
                    }
                    c52794wYpCopydefault.fIwbmz();
                }
            }
        } else {
            C32788mkG.StateListAnimator.recordScanStatus$default(C32788mkG.Companion, DeviceScanner.ScannerStatus.IDLE.getValue(), null, 2, null);
            C32682miG c32682miG3 = this.wlaJM;
            if (c32682miG3 != null) {
                c32682miG3.ejfBZ.setText(C33070mpX.AYXKKw(C32726miy.Dialog.AwvSrB));
                djBIcL(false);
                wYF wyf2 = c32682miG3.OLrzqt;
                wyf2.setType(5);
                wyf2.setVisibility(0);
                C52794wYp c52794wYpAEQbTJ2 = wyf2.AEQbTJ();
                if (c52794wYpAEQbTJ2 != null) {
                    c52794wYpAEQbTJ2.setVisibility(8);
                }
                C52794wYp c52794wYpCopydefault2 = wyf2.copydefault();
                if (c52794wYpCopydefault2 != null) {
                    c52794wYpCopydefault2.setVisibility(0);
                    c52794wYpCopydefault2.setOKDSType(257);
                    c52794wYpCopydefault2.setClickable(true);
                    c52794wYpCopydefault2.setEnabled(true);
                    if (Intrinsics.EZpvd((java.lang.Object) hDKMBd(), (java.lang.Object) FirebaseAnalytics.Event.LOGIN)) {
                        c52794wYpCopydefault2.setText(C33070mpX.AYXKKw(C32726miy.Dialog.KWHzl));
                        c52794wYpCopydefault2.setOnClickListener(new ClipData(c52794wYpCopydefault2, 1000L, this));
                    } else {
                        c52794wYpCopydefault2.setText(C33070mpX.AYXKKw(C32726miy.Dialog.AxsJAY));
                        c52794wYpCopydefault2.setOnClickListener(new BroadcastReceiver(c52794wYpCopydefault2, 1000L, this));
                    }
                    c52794wYpCopydefault2.fIwbmz();
                }
            }
            java.util.Iterator<T> it = EZpvd.iterator();
            while (it.hasNext()) {
                Activity activityAEQbTJ = AEQbTJ(((java.lang.Number) it.next()).intValue());
                if (activityAEQbTJ != null) {
                    KWHzl(activityAEQbTJ, (java.lang.String) null);
                    activityAEQbTJ.AEQbTJ().setText(C33070mpX.AYXKKw(C32726miy.Dialog.getFieldNames));
                }
            }
        }
        AEQbTJ(z);
    }

    /* JADX INFO: renamed from: o.mka$SharedElementCallback */
    public static final class SharedElementCallback implements Function1<EventParamsList, Unit> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public SharedElementCallback() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(EventParamsList eventParamsList) {
            copydefault(eventParamsList);
            return Unit.INSTANCE;
        }

        public final void copydefault(EventParamsList eventParamsList) {
            Intrinsics.checkNotNullParameter(eventParamsList, "");
            java.util.List<EnsecureAppInfo> list = C32808mka.this.OLrzqt;
            java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
            for (EnsecureAppInfo ensecureAppInfo : list) {
                arrayList.add(C56390yDp.OLrzqt(ensecureAppInfo.getAppName(), ensecureAppInfo.getPackageName()));
            }
            eventParamsList.put("name", C33129mqd.gEmmrt(arrayList), false);
            eventParamsList.put(DataInputModuleModel.DataInputItem.INPUT_TYPE_NUMBER, C33129mqd.gEmmrt(java.lang.Integer.valueOf(C32808mka.this.OLrzqt.size())), false);
            EventParamsList.put$default(eventParamsList, "scene", C32677miB.OLrzqt.KWHzl(C32808mka.this.hDKMBd()), false, 4, null);
        }
    }

    public final java.util.List<EnsecureAppInfo> OLrzqt() {
        final java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Map map = (java.util.Map) C32788mkG.StateListAnimator.readScanResult$default(C32788mkG.Companion, null, 1, null).getSecond();
        final Function2 function2 = new Function2() { // from class: o.mjY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C32808mka.copydefault(this.OLrzqt, arrayList, (java.lang.String) obj, (EnsecureAppInfo.ScanResult) obj2);
            }
        };
        map.forEach(new java.util.function.BiConsumer() { // from class: o.mjZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.function.BiConsumer
            public final void accept(java.lang.Object obj, java.lang.Object obj2) {
                C32808mka.KWHzl(function2, obj, obj2);
            }
        });
        return arrayList;
    }

    public static final void KWHzl(Function2 function2, java.lang.Object obj, java.lang.Object obj2) {
        function2.invoke(obj, obj2);
    }

    public static final Unit copydefault(C32808mka c32808mka, java.util.List list, java.lang.String str, EnsecureAppInfo.ScanResult scanResult) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(scanResult, "");
        android.content.pm.ApplicationInfo applicationInfoOLrzqt = C32786mkE.KWHzl.OLrzqt(c32808mka.getContext(), str);
        if (applicationInfoOLrzqt != null) {
            java.lang.String string = applicationInfoOLrzqt.loadLabel(c32808mka.getNewProxyInstance()).toString();
            java.lang.String str2 = applicationInfoOLrzqt.packageName;
            Intrinsics.checkNotNullExpressionValue(str2, "");
            EnsecureAppInfo ensecureAppInfo = new EnsecureAppInfo(applicationInfoOLrzqt, string, str2, applicationInfoOLrzqt.loadIcon(c32808mka.getNewProxyInstance()), scanResult, false, 32, null);
            ensecureAppInfo.setIgnored(C32788mkG.Companion.copydefault(str));
            list.add(ensecureAppInfo);
        }
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(int i, C32808mka c32808mka, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("total_delete", java.lang.String.valueOf(i), false);
        EventParamsList.put$default(eventParamsList, "scene", C32677miB.OLrzqt.KWHzl(c32808mka.hDKMBd()), false, 4, null);
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(java.util.List list, C32808mka c32808mka, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("deleted", java.lang.String.valueOf(list.size()), false);
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            EnsecureAppInfo ensecureAppInfo = (EnsecureAppInfo) it.next();
            arrayList.add(C56390yDp.OLrzqt(ensecureAppInfo.getAppName(), ensecureAppInfo.getPackageName()));
        }
        EventParamsList.put$default(eventParamsList, "name", C33129mqd.gEmmrt(arrayList), false, 4, null);
        EventParamsList.put$default(eventParamsList, "scene", C32677miB.OLrzqt.KWHzl(c32808mka.hDKMBd()), false, 4, null);
        return Unit.INSTANCE;
    }

    public static final Unit djBIcL(java.util.List list, C32808mka c32808mka, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("deleted", java.lang.String.valueOf(list.size()), false);
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            EnsecureAppInfo ensecureAppInfo = (EnsecureAppInfo) it.next();
            arrayList.add(C56390yDp.OLrzqt(ensecureAppInfo.getAppName(), ensecureAppInfo.getPackageName()));
        }
        EventParamsList.put$default(eventParamsList, "name", C33129mqd.gEmmrt(arrayList), false, 4, null);
        EventParamsList.put$default(eventParamsList, "scene", C32677miB.OLrzqt.KWHzl(c32808mka.hDKMBd()), false, 4, null);
        return Unit.INSTANCE;
    }

    public static final boolean gEmmrt(C32808mka c32808mka, EnsecureAppInfo ensecureAppInfo) {
        boolean z;
        Intrinsics.checkNotNullParameter(ensecureAppInfo, "");
        java.util.List<EnsecureAppInfo> list = c32808mka.OLrzqt;
        if ((list instanceof java.util.Collection) && list.isEmpty()) {
            z = false;
        } else {
            java.util.Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (Intrinsics.EZpvd((java.lang.Object) ((EnsecureAppInfo) it.next()).getPackageName(), (java.lang.Object) ensecureAppInfo.getPackageName())) {
                    z = true;
                    break;
                }
            }
            z = false;
        }
        return !z;
    }

    public final boolean OLrzqt(java.lang.String str) {
        return C32786mkE.KWHzl.copydefault(getContext(), str);
    }

    public static final java.lang.Comparable AEQbTJ(EnsecureAppInfo ensecureAppInfo) {
        Intrinsics.checkNotNullParameter(ensecureAppInfo, "");
        return java.lang.Integer.valueOf(ensecureAppInfo.getScanResult().getLevel().ordinal());
    }

    public final java.util.List<EnsecureAppInfo> KWHzl(java.util.List<EnsecureAppInfo> list) {
        return CollectionsKt___CollectionsKt.fJNWhG((java.util.Collection) CollectionsKt___CollectionsKt.EZpvd(list, yET.OLrzqt(new Function1() { // from class: o.mks
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C32808mka.AEQbTJ((EnsecureAppInfo) obj);
            }
        }, new Function1() { // from class: o.mkx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C32808mka.EZpvd((EnsecureAppInfo) obj);
            }
        }, new Function1() { // from class: o.mkz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C32808mka.djBIcL((EnsecureAppInfo) obj);
            }
        })));
    }

    public static final java.lang.Comparable EZpvd(EnsecureAppInfo ensecureAppInfo) {
        Intrinsics.checkNotNullParameter(ensecureAppInfo, "");
        return java.lang.Boolean.valueOf(!ensecureAppInfo.isIgnored());
    }

    public static final java.lang.Comparable djBIcL(EnsecureAppInfo ensecureAppInfo) {
        Intrinsics.checkNotNullParameter(ensecureAppInfo, "");
        return ensecureAppInfo.getPackageName();
    }

    public final void valueOf() {
        final java.util.List<EnsecureAppInfo> listKWHzl = KWHzl();
        C32747mjS c32747mjSAEQbTJ = C32747mjS.Companion.AEQbTJ(Intrinsics.EZpvd((java.lang.Object) hDKMBd(), (java.lang.Object) FirebaseAnalytics.Event.LOGIN) ? 3 : 0, new Function0() { // from class: o.mky
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C32808mka.AEQbTJ(listKWHzl, this);
            }
        });
        androidx.fragment.app.FragmentManager parentFragmentManager = getParentFragmentManager();
        Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "");
        c32747mjSAEQbTJ.show(parentFragmentManager);
    }

    public static final Unit KWHzl(java.util.List list, C32808mka c32808mka, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("ignored", java.lang.String.valueOf(list.size()), false);
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            EnsecureAppInfo ensecureAppInfo = (EnsecureAppInfo) it.next();
            arrayList.add(C56390yDp.OLrzqt(ensecureAppInfo.getAppName(), ensecureAppInfo.getPackageName()));
        }
        eventParamsList.put("name", C33129mqd.gEmmrt(arrayList), false);
        eventParamsList.put("scene", C32677miB.OLrzqt.KWHzl(c32808mka.hDKMBd()), false);
        return Unit.INSTANCE;
    }

    public final java.util.List<EnsecureAppInfo> KWHzl() {
        return CollectionsKt___CollectionsKt.AxsJAYsNCnLh(this.AuCTelauCTel);
    }

    private final java.util.Map<java.lang.Integer, java.util.List<EnsecureAppInfo>> EZpvd(java.util.List<EnsecureAppInfo> list) {
        return C32788mkG.Companion.OLrzqt(list, this.OLrzqt);
    }

    public final void copydefault(C32682miG c32682miG) {
        java.util.List listGEmmrt = yDY.gEmmrt(c32682miG.fetchVPNInfo.getRoot(), c32682miG.gEmmrt.getRoot(), c32682miG.djBIcL.getRoot(), c32682miG.DbNXlk.getRoot(), c32682miG.values.getRoot());
        java.lang.String str = "";
        java.util.List listGEmmrt2 = yDY.gEmmrt("", C33070mpX.AYXKKw(C32726miy.Dialog.wlaJM), C33070mpX.AYXKKw(C32726miy.Dialog.AubY), C33070mpX.AYXKKw(C32726miy.Dialog.AuCTelauCTel), C33070mpX.AYXKKw(C32726miy.Dialog.zsXlph));
        java.util.List listGEmmrt3 = yDY.gEmmrt("", C33070mpX.AYXKKw(C32726miy.Dialog.iwGUEr), C33070mpX.AYXKKw(C32726miy.Dialog.uzCIH), C33070mpX.AYXKKw(C32726miy.Dialog.fARcdN), C33070mpX.AYXKKw(C32726miy.Dialog.getNewProxyInstance));
        java.util.Iterator<T> it = EZpvd.iterator();
        while (it.hasNext()) {
            int iIntValue = ((java.lang.Number) it.next()).intValue();
            copydefault(iIntValue, new ActionBar(iIntValue, false, false, null, 14, null));
        }
        int i = 0;
        for (java.util.Iterator it2 = CollectionsKt___CollectionsKt.djBIcL((java.util.Collection) C56402yEa.EZpvd(5), (java.lang.Iterable) EZpvd).iterator(); it2.hasNext(); it2 = it2) {
            java.lang.Object next = it2.next();
            if (i < 0) {
                yDY.AYXKKw();
            }
            int iIntValue2 = ((java.lang.Number) next).intValue();
            java.lang.Object obj = listGEmmrt.get(i);
            Intrinsics.checkNotNullExpressionValue(obj, str);
            android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) obj;
            java.lang.String str2 = (java.lang.String) listGEmmrt2.get(i);
            java.lang.String str3 = (java.lang.String) listGEmmrt3.get(i);
            android.widget.TextView textView = (android.widget.TextView) linearLayout.findViewById(C32726miy.Activity.QKVWgx);
            android.widget.TextView textView2 = (android.widget.TextView) linearLayout.findViewById(C32726miy.Activity.sSMYrx);
            LottieAnimationView lottieAnimationView = (LottieAnimationView) linearLayout.findViewById(C32726miy.Activity.values);
            java.util.Map<java.lang.Integer, Application> map = this.zLjUOn;
            Intrinsics.copydefault(textView);
            Intrinsics.copydefault(textView2);
            Intrinsics.copydefault(lottieAnimationView);
            map.put(java.lang.Integer.valueOf(iIntValue2), new Application(this, textView, textView2, lottieAnimationView, str2, str3, iIntValue2));
            Activity activityOLrzqt = OLrzqt(linearLayout, str2, str3);
            this.getFieldNames.put(java.lang.Integer.valueOf(iIntValue2), activityOLrzqt);
            KWHzl(activityOLrzqt, iIntValue2);
            EZpvd(activityOLrzqt.EZpvd());
            i++;
            listGEmmrt = listGEmmrt;
            str = str;
            listGEmmrt2 = listGEmmrt2;
            listGEmmrt3 = listGEmmrt3;
        }
    }

    public final Activity OLrzqt(android.widget.LinearLayout linearLayout, java.lang.String str, java.lang.String str2) {
        android.widget.LinearLayout linearLayout2 = (android.widget.LinearLayout) linearLayout.findViewById(C32726miy.Activity.wlaJM);
        RecyclerView recyclerView = (RecyclerView) linearLayout.findViewById(C32726miy.Activity.iwGUEr);
        LottieAnimationView lottieAnimationView = (LottieAnimationView) linearLayout.findViewById(C32726miy.Activity.values);
        android.widget.TextView textView = (android.widget.TextView) linearLayout.findViewById(C32726miy.Activity.QKVWgx);
        android.widget.TextView textView2 = (android.widget.TextView) linearLayout.findViewById(C32726miy.Activity.sSMYrx);
        textView.setText(str);
        textView2.setText(str2);
        Intrinsics.copydefault(linearLayout2);
        Intrinsics.copydefault(recyclerView);
        Intrinsics.copydefault(lottieAnimationView);
        Intrinsics.copydefault(textView);
        Intrinsics.copydefault(textView2);
        Activity activity = new Activity(linearLayout, linearLayout2, recyclerView, lottieAnimationView, textView, textView2);
        KWHzl(activity, (java.lang.String) null);
        return activity;
    }

    public final void KWHzl(Activity activity, int i) {
        android.widget.LinearLayout linearLayoutOLrzqt = activity.OLrzqt();
        linearLayoutOLrzqt.setOnClickListener(new AssistContent(linearLayoutOLrzqt, 1000L, this, i, activity));
    }

    private final void EZpvd(RecyclerView recyclerView) {
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.setNestedScrollingEnabled(false);
        RecyclerView.RecycledViewPool recycledViewPool = new RecyclerView.RecycledViewPool();
        recycledViewPool.setMaxRecycledViews(0, 0);
        recyclerView.setRecycledViewPool(recycledViewPool);
        recyclerView.setItemViewCacheSize(0);
    }

    public final void OLrzqt(int i, Activity activity) {
        ActionBar actionBarOLrzqt = OLrzqt(i);
        if (actionBarOLrzqt == null || !actionBarOLrzqt.AEQbTJ() || actionBarOLrzqt.KWHzl().isEmpty()) {
            return;
        }
        boolean z = !actionBarOLrzqt.OLrzqt();
        copydefault(i, ActionBar.copy$default(actionBarOLrzqt, 0, z, false, null, 13, null));
        Application application = this.zLjUOn.get(java.lang.Integer.valueOf(i));
        if (application != null) {
            application.OLrzqt(z);
        }
        if (z) {
            EZpvd(activity);
        } else {
            KWHzl(activity);
        }
    }

    public final void EZpvd(Activity activity) {
        RecyclerView.RecycledViewPool recycledViewPool = new RecyclerView.RecycledViewPool();
        recycledViewPool.setMaxRecycledViews(0, 0);
        activity.EZpvd().setRecycledViewPool(recycledViewPool);
        activity.EZpvd().setItemViewCacheSize(0);
        activity.EZpvd().setLayoutManager(new LinearLayoutManager(activity.EZpvd().getContext()));
        activity.EZpvd().setVisibility(0);
        KWHzl(activity, "up");
        android.view.animation.Animation animationLoadAnimation = android.view.animation.AnimationUtils.loadAnimation(activity.EZpvd().getContext(), android.R.anim.fade_in);
        animationLoadAnimation.setDuration(200L);
        activity.EZpvd().startAnimation(animationLoadAnimation);
    }

    public final void KWHzl(Activity activity) {
        KWHzl(activity, "down");
        activity.EZpvd().setVisibility(8);
        android.view.animation.Animation animationLoadAnimation = android.view.animation.AnimationUtils.loadAnimation(activity.EZpvd().getContext(), android.R.anim.fade_out);
        animationLoadAnimation.setDuration(100L);
        activity.EZpvd().startAnimation(animationLoadAnimation);
    }

    public final void copydefault(int i, java.util.List<EnsecureAppInfo> list) {
        Activity activityAEQbTJ;
        boolean zEZpvd;
        ActionBar actionBarOLrzqt = OLrzqt(i);
        if (actionBarOLrzqt == null || (activityAEQbTJ = AEQbTJ(i)) == null) {
            return;
        }
        Application application = this.zLjUOn.get(java.lang.Integer.valueOf(i));
        if (list != null && !list.isEmpty()) {
            java.util.List<EnsecureAppInfo> listAxsJAYsNCnLh = CollectionsKt___CollectionsKt.AxsJAYsNCnLh(KWHzl(CollectionsKt___CollectionsKt.fJNWhG((java.util.Collection) list)));
            if (application != null) {
                zEZpvd = application.EZpvd();
            } else {
                zEZpvd = !listAxsJAYsNCnLh.isEmpty();
            }
            copydefault(i, ActionBar.copy$default(actionBarOLrzqt, 0, zEZpvd, true, listAxsJAYsNCnLh, 1, null));
            java.util.Map<java.lang.Integer, C32782mkA> map = this.zsXlph;
            java.lang.Integer numValueOf = java.lang.Integer.valueOf(i);
            C32782mkA c32782mkA = map.get(numValueOf);
            if (c32782mkA == null) {
                if (i == 5) {
                    c32782mkA = new C32782mkA(new Function1() { // from class: o.mkg
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return C32808mka.valueOf(this.OLrzqt, (EnsecureAppInfo) obj);
                        }
                    }, new Function2() { // from class: o.mkc
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return C32808mka.EZpvd(this.AEQbTJ, (EnsecureAppInfo) obj, ((java.lang.Boolean) obj2).booleanValue());
                        }
                    }, true, new Function1() { // from class: o.mkd
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return C32808mka.djBIcL(this.KWHzl, (EnsecureAppInfo) obj);
                        }
                    });
                } else {
                    c32782mkA = new C32782mkA(new Function1() { // from class: o.mkf
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return C32808mka.AYXKKw(this.copydefault, (EnsecureAppInfo) obj);
                        }
                    }, new Function2() { // from class: o.mke
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return C32808mka.djBIcL(this.EZpvd, (EnsecureAppInfo) obj, ((java.lang.Boolean) obj2).booleanValue());
                        }
                    }, false, null, 12, null);
                }
                map.put(numValueOf, c32782mkA);
            }
            C32782mkA c32782mkA2 = c32782mkA;
            RecyclerView.RecycledViewPool recycledViewPool = new RecyclerView.RecycledViewPool();
            recycledViewPool.setMaxRecycledViews(0, 0);
            activityAEQbTJ.EZpvd().setRecycledViewPool(recycledViewPool);
            activityAEQbTJ.EZpvd().setItemViewCacheSize(0);
            activityAEQbTJ.EZpvd().setLayoutManager(new LinearLayoutManager(activityAEQbTJ.EZpvd().getContext()));
            activityAEQbTJ.EZpvd().setAdapter(c32782mkA2);
            c32782mkA2.copydefault(listAxsJAYsNCnLh);
            c32782mkA2.notifyDataSetChanged();
            KWHzl(activityAEQbTJ.EZpvd(), listAxsJAYsNCnLh, c32782mkA2);
            if (zEZpvd) {
                EZpvd(activityAEQbTJ);
            } else {
                KWHzl(activityAEQbTJ, "down");
            }
            if (application != null) {
                application.OLrzqt(zEZpvd);
                return;
            }
            return;
        }
        KWHzl(activityAEQbTJ, (java.lang.String) null);
        activityAEQbTJ.AEQbTJ().setText(C33070mpX.AYXKKw(C32726miy.Dialog.getFieldNames));
        copydefault(i, ActionBar.copy$default(actionBarOLrzqt, 0, false, true, yDY.AhwBna(), 1, null));
        if (application != null) {
            application.OLrzqt(false);
        }
    }

    public static final Unit valueOf(C32808mka c32808mka, EnsecureAppInfo ensecureAppInfo) {
        Intrinsics.checkNotNullParameter(ensecureAppInfo, "");
        c32808mka.valueOf(ensecureAppInfo);
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(C32808mka c32808mka, EnsecureAppInfo ensecureAppInfo, boolean z) {
        Intrinsics.checkNotNullParameter(ensecureAppInfo, "");
        c32808mka.EZpvd(ensecureAppInfo, z);
        return Unit.INSTANCE;
    }

    public static final Unit djBIcL(C32808mka c32808mka, EnsecureAppInfo ensecureAppInfo) {
        Intrinsics.checkNotNullParameter(ensecureAppInfo, "");
        c32808mka.AhwBna(ensecureAppInfo);
        return Unit.INSTANCE;
    }

    public static final Unit AYXKKw(C32808mka c32808mka, EnsecureAppInfo ensecureAppInfo) {
        Intrinsics.checkNotNullParameter(ensecureAppInfo, "");
        c32808mka.valueOf(ensecureAppInfo);
        return Unit.INSTANCE;
    }

    public static final Unit djBIcL(C32808mka c32808mka, EnsecureAppInfo ensecureAppInfo, boolean z) {
        Intrinsics.checkNotNullParameter(ensecureAppInfo, "");
        c32808mka.EZpvd(ensecureAppInfo, z);
        return Unit.INSTANCE;
    }

    public final Activity AEQbTJ(int i) {
        return this.getFieldNames.get(java.lang.Integer.valueOf(i));
    }

    public final void valueOf(EnsecureAppInfo ensecureAppInfo) {
        if (ensecureAppInfo != null) {
            android.content.Intent intent = new android.content.Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(android.net.Uri.parse("package:" + ensecureAppInfo.getPackageName()));
            startActivity(intent);
        }
    }

    public final void EZpvd(EnsecureAppInfo ensecureAppInfo, boolean z) {
        if (z) {
            this.AuCTelauCTel.add(ensecureAppInfo);
        } else {
            this.AuCTelauCTel.remove(ensecureAppInfo);
        }
        getFieldNames();
    }

    public final void getFieldNames() {
        wYF wyf;
        C52794wYp c52794wYpAEQbTJ;
        wYF wyf2;
        C52794wYp c52794wYpAEQbTJ2;
        if (this.AuCTelauCTel.size() > 0) {
            C32682miG c32682miG = this.wlaJM;
            if (c32682miG == null || (wyf2 = c32682miG.OLrzqt) == null || (c52794wYpAEQbTJ2 = wyf2.AEQbTJ()) == null) {
                return;
            }
            c52794wYpAEQbTJ2.setClickable(true);
            c52794wYpAEQbTJ2.setEnabled(true);
            return;
        }
        C32682miG c32682miG2 = this.wlaJM;
        if (c32682miG2 == null || (wyf = c32682miG2.OLrzqt) == null || (c52794wYpAEQbTJ = wyf.AEQbTJ()) == null) {
            return;
        }
        c52794wYpAEQbTJ.setClickable(false);
        c52794wYpAEQbTJ.setEnabled(false);
    }

    public final void AhwBna(final EnsecureAppInfo ensecureAppInfo) {
        C32747mjS c32747mjSOLrzqt = C32747mjS.Companion.OLrzqt(true, new Function0() { // from class: o.mki
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C32808mka.OLrzqt(ensecureAppInfo, this);
            }
        });
        androidx.fragment.app.FragmentManager parentFragmentManager = getParentFragmentManager();
        Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "");
        c32747mjSOLrzqt.show(parentFragmentManager);
    }

    public static final Unit OLrzqt(EnsecureAppInfo ensecureAppInfo, C32808mka c32808mka) {
        java.lang.Object next;
        C32788mkG.Companion.EZpvd(ensecureAppInfo.getPackageName());
        ensecureAppInfo.setIgnored(false);
        java.util.Iterator<T> it = c32808mka.OLrzqt.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.EZpvd((java.lang.Object) ((EnsecureAppInfo) next).getPackageName(), (java.lang.Object) ensecureAppInfo.getPackageName())) {
                break;
            }
        }
        EnsecureAppInfo ensecureAppInfo2 = (EnsecureAppInfo) next;
        if (ensecureAppInfo2 != null) {
            ensecureAppInfo2.setIgnored(ensecureAppInfo.isIgnored());
        }
        c32808mka.copydefault(ensecureAppInfo, true);
        c32808mka.AYXKKw(ensecureAppInfo);
        c32808mka.fARcdN();
        c32808mka.OLrzqt(false);
        java.util.List<EnsecureAppInfo> list = c32808mka.OLrzqt;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            if (((EnsecureAppInfo) obj).isIgnored()) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            c32808mka.EZpvd();
        }
        java.util.List<EnsecureAppInfo> list2 = c32808mka.OLrzqt;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj2 : list2) {
            if (!((EnsecureAppInfo) obj2).isIgnored()) {
                arrayList2.add(obj2);
            }
        }
        if (arrayList2.size() == 1) {
            c32808mka.AhwBna(true);
        }
        return Unit.INSTANCE;
    }

    public final void AYXKKw(EnsecureAppInfo ensecureAppInfo) {
        ActionBar actionBarOLrzqt;
        java.lang.Integer numCopydefault = copydefault(ensecureAppInfo.getScanResult().getReason());
        if (numCopydefault == null || (actionBarOLrzqt = OLrzqt(numCopydefault.intValue())) == null) {
            return;
        }
        java.util.List<EnsecureAppInfo> listFJNWhG = CollectionsKt___CollectionsKt.fJNWhG((java.util.Collection) actionBarOLrzqt.KWHzl());
        listFJNWhG.add(ensecureAppInfo);
        copydefault(numCopydefault.intValue(), ActionBar.copy$default(actionBarOLrzqt, 0, true, true, listFJNWhG, 1, null));
        final Activity activityAEQbTJ = AEQbTJ(numCopydefault.intValue());
        if (activityAEQbTJ != null) {
            java.util.Map<java.lang.Integer, C32782mkA> map = this.zsXlph;
            C32782mkA c32782mkA = map.get(numCopydefault);
            if (c32782mkA == null) {
                c32782mkA = new C32782mkA(new Function1() { // from class: o.mkk
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C32808mka.AhwBna(this.copydefault, (EnsecureAppInfo) obj);
                    }
                }, new Function2() { // from class: o.mkh
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return C32808mka.copydefault(this.copydefault, (EnsecureAppInfo) obj, ((java.lang.Boolean) obj2).booleanValue());
                    }
                }, false, null, 12, null);
                map.put(numCopydefault, c32782mkA);
            }
            final C32782mkA c32782mkA2 = c32782mkA;
            if (activityAEQbTJ.EZpvd().getAdapter() == null) {
                activityAEQbTJ.EZpvd().setAdapter(c32782mkA2);
            }
            c32782mkA2.copydefault(listFJNWhG);
            adjustRecyclerViewHeight$default(this, activityAEQbTJ.EZpvd(), listFJNWhG, null, 4, null);
            KWHzl(activityAEQbTJ, "up");
            activityAEQbTJ.EZpvd().setVisibility(0);
            activityAEQbTJ.EZpvd().post(new java.lang.Runnable() { // from class: o.mko
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    C32808mka.AEQbTJ(activityAEQbTJ, c32782mkA2);
                }
            });
        }
        valueOf(numCopydefault.intValue());
    }

    public static final Unit AhwBna(C32808mka c32808mka, EnsecureAppInfo ensecureAppInfo) {
        Intrinsics.checkNotNullParameter(ensecureAppInfo, "");
        c32808mka.valueOf(ensecureAppInfo);
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(C32808mka c32808mka, EnsecureAppInfo ensecureAppInfo, boolean z) {
        Intrinsics.checkNotNullParameter(ensecureAppInfo, "");
        c32808mka.EZpvd(ensecureAppInfo, z);
        return Unit.INSTANCE;
    }

    public static final void AEQbTJ(Activity activity, C32782mkA c32782mkA) {
        activity.EZpvd().requestLayout();
        activity.EZpvd().invalidate();
        c32782mkA.notifyDataSetChanged();
    }

    public final java.lang.Integer copydefault(java.lang.String str) {
        return C32788mkG.Companion.KWHzl(str);
    }

    public final ActionBar OLrzqt(int i) {
        return this.uzCIH.get(java.lang.Integer.valueOf(i));
    }

    public final void copydefault(int i, @NotNull ActionBar actionBar) {
        Intrinsics.checkNotNullParameter(actionBar, "");
        this.uzCIH.put(java.lang.Integer.valueOf(i), actionBar);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.mka */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void adjustRecyclerViewHeight$default(C32808mka c32808mka, RecyclerView recyclerView, java.util.List list, RecyclerView.Adapter adapter, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            adapter = null;
        }
        c32808mka.KWHzl(recyclerView, (java.util.List<EnsecureAppInfo>) list, (RecyclerView.Adapter<?>) adapter);
    }

    public final void KWHzl(final RecyclerView recyclerView, final java.util.List<EnsecureAppInfo> list, final RecyclerView.Adapter<?> adapter) {
        recyclerView.post(new java.lang.Runnable() { // from class: o.mkw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C32808mka.copydefault(recyclerView, list, adapter);
            }
        });
    }

    public static final void copydefault(RecyclerView recyclerView, java.util.List list, RecyclerView.Adapter adapter) {
        int i = (int) (64 * recyclerView.getContext().getResources().getDisplayMetrics().density);
        int size = list.size();
        ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
        layoutParams.height = size * i;
        recyclerView.setLayoutParams(layoutParams);
        recyclerView.requestLayout();
        recyclerView.invalidate();
        if (adapter != null) {
            adapter.notifyDataSetChanged();
        }
    }

    public static /* synthetic */ void removeIgnoredAppFromUI$default(C32808mka c32808mka, EnsecureAppInfo ensecureAppInfo, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        c32808mka.copydefault(ensecureAppInfo, z);
    }

    public final void copydefault(EnsecureAppInfo ensecureAppInfo, boolean z) {
        java.util.Iterator<T> it = (z ? C56402yEa.EZpvd(5) : EZpvd).iterator();
        while (it.hasNext()) {
            int iIntValue = ((java.lang.Number) it.next()).intValue();
            ActionBar actionBarOLrzqt = OLrzqt(iIntValue);
            C32782mkA c32782mkA = this.zsXlph.get(java.lang.Integer.valueOf(iIntValue));
            Activity activityAEQbTJ = AEQbTJ(iIntValue);
            if (actionBarOLrzqt != null && c32782mkA != null && activityAEQbTJ != null) {
                java.util.List<EnsecureAppInfo> listKWHzl = actionBarOLrzqt.KWHzl();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (java.lang.Object obj : listKWHzl) {
                    if (!Intrinsics.EZpvd((java.lang.Object) ((EnsecureAppInfo) obj).getPackageName(), (java.lang.Object) ensecureAppInfo.getPackageName())) {
                        arrayList.add(obj);
                    }
                }
                copydefault(iIntValue, ActionBar.copy$default(actionBarOLrzqt, 0, false, false, arrayList, 7, null));
                c32782mkA.copydefault(arrayList);
                adjustRecyclerViewHeight$default(this, activityAEQbTJ.EZpvd(), arrayList, null, 4, null);
            }
        }
    }

    public final void djBIcL(int i) {
        Activity activityAEQbTJ = AEQbTJ(i);
        ActionBar actionBarOLrzqt = OLrzqt(i);
        if (activityAEQbTJ == null || actionBarOLrzqt == null) {
            return;
        }
        activityAEQbTJ.AEQbTJ().setText(C33070mpX.AYXKKw(C32726miy.Dialog.getFieldNames));
        KWHzl(activityAEQbTJ, (java.lang.String) null);
        activityAEQbTJ.EZpvd().setVisibility(8);
        adjustRecyclerViewHeight$default(this, activityAEQbTJ.EZpvd(), yDY.AhwBna(), null, 4, null);
        Application application = this.zLjUOn.get(java.lang.Integer.valueOf(i));
        if (application != null) {
            application.copydefault(false);
        }
    }

    public final void valueOf(int i) {
        Activity activityAEQbTJ = AEQbTJ(i);
        ActionBar actionBarOLrzqt = OLrzqt(i);
        if (activityAEQbTJ == null || actionBarOLrzqt == null) {
            return;
        }
        Application application = this.zLjUOn.get(java.lang.Integer.valueOf(i));
        if (application != null) {
            application.copydefault(true);
        }
        if (!actionBarOLrzqt.KWHzl().isEmpty()) {
            KWHzl(activityAEQbTJ, "down");
        }
    }

    public final void isConnected() {
        wYF wyf;
        this.uzCIH.clear();
        java.util.Iterator<T> it = EZpvd.iterator();
        while (it.hasNext()) {
            int iIntValue = ((java.lang.Number) it.next()).intValue();
            copydefault(iIntValue, new ActionBar(iIntValue, false, false, null, 14, null));
        }
        this.AuCTelauCTel.clear();
        this.zsXlph.clear();
        C32682miG c32682miG = this.wlaJM;
        if (c32682miG != null && (wyf = c32682miG.OLrzqt) != null) {
            wyf.setType(5);
            wyf.setVisibility(0);
            C52794wYp c52794wYpAEQbTJ = wyf.AEQbTJ();
            if (c52794wYpAEQbTJ != null) {
                c52794wYpAEQbTJ.setVisibility(8);
            }
            C52794wYp c52794wYpCopydefault = wyf.copydefault();
            if (c52794wYpCopydefault != null) {
                c52794wYpCopydefault.setVisibility(0);
                c52794wYpCopydefault.setOKDSType(257);
                c52794wYpCopydefault.setClickable(false);
                c52794wYpCopydefault.setText(C33070mpX.AYXKKw(C32726miy.Dialog.gHZMYf));
                c52794wYpCopydefault.OLrzqt(0L);
            }
        }
        for (Activity activity : this.getFieldNames.values()) {
            activity.EZpvd().setVisibility(8);
            KWHzl(activity, (java.lang.String) null);
        }
        for (Application application : this.zLjUOn.values()) {
            if (application != null) {
                application.AhwBna();
            }
        }
        EZpvd();
    }

    public final void fetchVPNInfo() {
        android.widget.TextView textView;
        if (AEQbTJ() == DeviceScanner.ScannerStatus.RUNNING.getValue()) {
            C32779mjy c32779mjy = this.AwvSrB;
            C32779mjy c32779mjy2 = null;
            if (c32779mjy == null) {
                Intrinsics.gEmmrt("");
                c32779mjy = null;
            }
            Triple<java.lang.Integer, java.lang.Integer, java.lang.Integer> tripleEZpvd = c32779mjy.EZpvd();
            int iIntValue = tripleEZpvd != null ? tripleEZpvd.getFirst().intValue() : 0;
            int iIntValue2 = tripleEZpvd != null ? tripleEZpvd.getSecond().intValue() : 0;
            C32779mjy c32779mjy3 = this.AwvSrB;
            if (c32779mjy3 == null) {
                Intrinsics.gEmmrt("");
            } else {
                c32779mjy2 = c32779mjy3;
            }
            java.util.Map<java.lang.Integer, C32809mkb> mapAEQbTJ = c32779mjy2.AEQbTJ();
            if (iIntValue <= 0) {
                this.values = true;
                return;
            }
            this.AhwBna = iIntValue;
            this.zuBGHE = iIntValue;
            this.AxsJAY = iIntValue2;
            if (!this.iwGUEr.isEmpty()) {
                java.lang.Integer num = (java.lang.Integer) CollectionsKt___CollectionsKt.UeEOUB(this.iwGUEr);
                int iIntValue3 = num != null ? num.intValue() : iIntValue;
                if (iIntValue3 > iIntValue) {
                    EZpvd(iIntValue3);
                }
                this.iwGUEr.clear();
            }
            C32682miG c32682miG = this.wlaJM;
            if (c32682miG != null && (textView = c32682miG.fARcdN) != null) {
                textView.setText(iIntValue + "%");
            }
            this.values = true;
            KWHzl(mapAEQbTJ, iIntValue);
            copydefault(iIntValue);
            values();
            if (iIntValue < 100) {
                KWHzl(iIntValue);
            }
        }
    }

    public final void values() {
        LottieAnimationView lottieAnimationView = this.AuCTel;
        if (lottieAnimationView != null) {
            lottieAnimationView.removeAllAnimatorListeners();
            lottieAnimationView.setMinAndMaxFrame(CipherSuite.TLS_DHE_PSK_WITH_AES_128_CBC_SHA256, 595);
            lottieAnimationView.setRepeatCount(-1);
            lottieAnimationView.setSpeed(this.AYXKKw);
            lottieAnimationView.playAnimation();
        }
    }

    public final void EZpvd(int i) {
        gEmmrt(i);
        KWHzl(i);
    }

    public final void KWHzl(int i) {
        int iValueOf = C56548yJl.valueOf(i + 9, 100);
        this.copydefault = iValueOf;
        if (this.AhwBna < iValueOf && !this.isConnected) {
            this.isConnected = true;
            PictureInPictureParams pictureInPictureParams = new PictureInPictureParams();
            this.djBIcL = pictureInPictureParams;
            this.valueOf.postDelayed(pictureInPictureParams, this.AubY);
        }
    }

    /* JADX INFO: renamed from: o.mka$PictureInPictureParams */
    public static final class PictureInPictureParams implements java.lang.Runnable {
        public PictureInPictureParams() {
        }

        @Override // java.lang.Runnable
        public void run() {
            android.widget.TextView textView;
            if (C32808mka.this.isConnected) {
                if (C32808mka.this.AhwBna < C32808mka.this.copydefault) {
                    C32808mka.this.AhwBna++;
                    C32682miG c32682miG = C32808mka.this.wlaJM;
                    if (c32682miG != null && (textView = c32682miG.fARcdN) != null) {
                        textView.setText(C32808mka.this.AhwBna + "%");
                    }
                    C32808mka c32808mka = C32808mka.this;
                    c32808mka.copydefault(c32808mka.AhwBna);
                    C32808mka.this.valueOf.postDelayed(this, C32808mka.this.AubY);
                    return;
                }
                C32808mka.this.isConnected = false;
                C32808mka.this.djBIcL = null;
            }
        }
    }

    public final void fJNWhG() {
        this.isConnected = false;
        java.lang.Runnable runnable = this.djBIcL;
        if (runnable != null) {
            this.valueOf.removeCallbacks(runnable);
        }
        this.djBIcL = null;
    }

    public final void gEmmrt(final int i) {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.runOnUiThread(new java.lang.Runnable() { // from class: o.mkv
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    C32808mka.KWHzl(this.KWHzl, i);
                }
            });
        }
    }

    public static final void KWHzl(final C32808mka c32808mka, int i) {
        c32808mka.zuBGHE = C56548yJl.valueOf(i, 100);
        android.animation.ValueAnimator valueAnimator = c32808mka.hDKMBd;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        android.animation.ValueAnimator valueAnimatorOfInt = android.animation.ValueAnimator.ofInt(c32808mka.AhwBna, c32808mka.zuBGHE);
        valueAnimatorOfInt.setDuration(300L);
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o.mkj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator2) {
                C32808mka.EZpvd(this.OLrzqt, valueAnimator2);
            }
        });
        valueAnimatorOfInt.addListener(c32808mka.new VoiceInteractor());
        c32808mka.hDKMBd = valueAnimatorOfInt;
        valueAnimatorOfInt.start();
    }

    public static final void EZpvd(C32808mka c32808mka, android.animation.ValueAnimator valueAnimator) {
        android.widget.TextView textView;
        Intrinsics.checkNotNullParameter(valueAnimator, "");
        java.lang.Object animatedValue = valueAnimator.getAnimatedValue();
        Intrinsics.copydefault(animatedValue, "");
        int iIntValue = ((java.lang.Integer) animatedValue).intValue();
        c32808mka.AhwBna = iIntValue;
        C32682miG c32682miG = c32808mka.wlaJM;
        if (c32682miG != null && (textView = c32682miG.fARcdN) != null) {
            textView.setText(iIntValue + "%");
        }
        c32808mka.copydefault(c32808mka.AhwBna);
    }

    /* JADX INFO: renamed from: o.mka$VoiceInteractor */
    public static final class VoiceInteractor extends android.animation.AnimatorListenerAdapter {
        public VoiceInteractor() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(android.animation.Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
            C32808mka c32808mka = C32808mka.this;
            c32808mka.AhwBna = c32808mka.zuBGHE;
            C32808mka c32808mka2 = C32808mka.this;
            c32808mka2.copydefault(c32808mka2.AhwBna);
        }
    }

    public final void AhwBna() {
        getParentFragmentManager().beginTransaction().add(android.R.id.content, new C32784mkC(), "UninstallRiskyAppTipsFragment").addToBackStack("UninstallRiskyAppTipsFragment").commit();
    }

    public final void OLrzqt(C32682miG c32682miG) {
        LottieAnimationView lottieAnimationView = c32682miG.KWHzl;
        this.AuCTel = lottieAnimationView;
        if (lottieAnimationView != null) {
            lottieAnimationView.setAnimation(iwGUEr() ? C32726miy.TaskDescription.valueOf : C32726miy.TaskDescription.AhwBna);
            lottieAnimationView.setCacheComposition(true);
            lottieAnimationView.setRenderMode(RenderMode.HARDWARE);
            lottieAnimationView.setLayerType(2, null);
        }
        LottieAnimationView lottieAnimationView2 = c32682miG.AYXKKw;
        if (lottieAnimationView2 != null) {
            lottieAnimationView2.setCacheComposition(true);
            lottieAnimationView2.setRenderMode(RenderMode.HARDWARE);
            lottieAnimationView2.setLayerType(2, null);
        }
        DbNXlk();
    }

    public final void djBIcL() {
        LottieAnimationView lottieAnimationView = this.AuCTel;
        if (lottieAnimationView != null) {
            lottieAnimationView.setMinAndMaxFrame(0, CipherSuite.TLS_DHE_PSK_WITH_AES_128_CBC_SHA256);
            lottieAnimationView.setRepeatCount(0);
            lottieAnimationView.setSpeed(1.0f);
            lottieAnimationView.addAnimatorListener(new FragmentManager());
            lottieAnimationView.playAnimation();
        }
    }

    /* JADX INFO: renamed from: o.mka$FragmentManager */
    public static final class FragmentManager extends android.animation.AnimatorListenerAdapter {
        public FragmentManager() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(android.animation.Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
            C32808mka.this.AYXKKw();
        }
    }

    public final void AYXKKw() {
        LottieAnimationView lottieAnimationView = this.AuCTel;
        if (lottieAnimationView != null) {
            lottieAnimationView.removeAllAnimatorListeners();
            lottieAnimationView.setMinAndMaxFrame(CipherSuite.TLS_DHE_PSK_WITH_AES_128_CBC_SHA256, 595);
            lottieAnimationView.setRepeatCount(-1);
            lottieAnimationView.setSpeed(this.AEQbTJ);
            this.AYXKKw = this.AEQbTJ;
            lottieAnimationView.playAnimation();
        }
    }

    public final void copydefault(int i) {
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        long j = jCurrentTimeMillis - this.ejfBZ;
        float fOLrzqt = OLrzqt(j > 0 ? ((i - this.fetchVPNInfo) * 1000.0f) / j : 0.0f, j);
        LottieAnimationView lottieAnimationView = this.AuCTel;
        if (lottieAnimationView != null && java.lang.Math.abs(this.AYXKKw - fOLrzqt) > 0.1f) {
            lottieAnimationView.setSpeed(fOLrzqt);
            this.AYXKKw = fOLrzqt;
        }
        this.fetchVPNInfo = i;
        this.ejfBZ = jCurrentTimeMillis;
    }

    public final float OLrzqt(float f, long j) {
        if (j < 100) {
            return this.AYXKKw;
        }
        if (f <= 0.0f) {
            float f2 = this.AYXKKw;
            float f3 = this.AEQbTJ;
            return f2 > f3 + 0.1f ? C56548yJl.copydefault((f2 * 0.9f) + (0.1f * f3), f3) : f3;
        }
        float fKWHzl = C56548yJl.KWHzl(f / 2.0f, 0.0f, 1.0f);
        float f4 = this.AEQbTJ;
        float f5 = this.getNewProxyInstance;
        return C56548yJl.KWHzl((this.AYXKKw * 0.7f) + ((((f5 - f4) * fKWHzl) + f4) * 0.3f), f4, f5);
    }

    /* JADX INFO: renamed from: o.mka$Application */
    /* JADX INFO: loaded from: classes18.dex */
    public final class Application {
        public boolean AEQbTJ;
        public android.animation.ValueAnimator AYXKKw;
        public final java.lang.String AhwBna;
        public final android.widget.TextView AkhnZx;
        public final java.lang.String DbNXlk;
        public boolean EZpvd;
        public final android.widget.TextView KWHzl;
        public final int OLrzqt;
        public boolean copydefault;
        public boolean djBIcL;
        public final /* synthetic */ C32808mka fetchVPNInfo;
        public boolean gEmmrt;
        public final java.lang.String isConnected;
        public final LottieAnimationView valueOf;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean EZpvd() {
            return this.djBIcL;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(boolean z) {
            this.djBIcL = z;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean OLrzqt() {
            return this.gEmmrt;
        }

        public Application(@NotNull C32808mka c32808mka, @NotNull android.widget.TextView textView, @NotNull android.widget.TextView textView2, @NotNull LottieAnimationView lottieAnimationView, @NotNull java.lang.String str, java.lang.String str2, int i) {
            Intrinsics.checkNotNullParameter(textView, "");
            Intrinsics.checkNotNullParameter(textView2, "");
            Intrinsics.checkNotNullParameter(lottieAnimationView, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.fetchVPNInfo = c32808mka;
            this.AkhnZx = textView;
            this.KWHzl = textView2;
            this.valueOf = lottieAnimationView;
            this.DbNXlk = str;
            this.AhwBna = str2;
            this.OLrzqt = i;
            this.isConnected = C33070mpX.AYXKKw(C32726miy.Dialog.hDKMBd);
            OLrzqt(str2);
            valueOf();
        }

        public final void AEQbTJ() {
            this.gEmmrt = true;
            this.copydefault = false;
            this.AEQbTJ = true;
            OLrzqt(this.isConnected);
            djBIcL();
            Activity activityAEQbTJ = this.fetchVPNInfo.AEQbTJ(this.OLrzqt);
            if (activityAEQbTJ != null) {
                this.fetchVPNInfo.KWHzl(activityAEQbTJ, (java.lang.String) null);
            }
        }

        public final void copydefault(boolean z) {
            this.gEmmrt = false;
            this.copydefault = true;
            this.AEQbTJ = true;
            this.EZpvd = z;
            if (z) {
                this.djBIcL = true;
            }
            OLrzqt(z ? this.AhwBna : C33070mpX.AYXKKw(C32726miy.Dialog.getFieldNames));
            AYXKKw();
            KWHzl(z);
        }

        public final void EZpvd(boolean z) {
            copydefault(z);
        }

        public final void OLrzqt(java.lang.String str) {
            this.KWHzl.setText(str);
        }

        public final void djBIcL() {
            ViewGroup.LayoutParams layoutParams = this.valueOf.getLayoutParams();
            Intrinsics.copydefault(layoutParams, "");
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            float f = 16;
            layoutParams2.width = (int) (this.fetchVPNInfo.getResources().getDisplayMetrics().density * f);
            layoutParams2.height = (int) (f * this.fetchVPNInfo.getResources().getDisplayMetrics().density);
            layoutParams2.setMarginEnd((int) (4 * this.fetchVPNInfo.getResources().getDisplayMetrics().density));
            this.valueOf.setLayoutParams(layoutParams2);
            if (this.fetchVPNInfo.iwGUEr()) {
                this.valueOf.setAnimation(C32726miy.TaskDescription.AEQbTJ);
            } else {
                this.valueOf.setAnimation(C32726miy.TaskDescription.KWHzl);
            }
            this.valueOf.setRepeatCount(-1);
            this.valueOf.setProgress(0.0f);
            this.valueOf.playAnimation();
        }

        public final void valueOf() {
            ViewGroup.LayoutParams layoutParams = this.valueOf.getLayoutParams();
            Intrinsics.copydefault(layoutParams, "");
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            float f = 16;
            layoutParams2.width = (int) (this.fetchVPNInfo.getResources().getDisplayMetrics().density * f);
            layoutParams2.height = (int) (f * this.fetchVPNInfo.getResources().getDisplayMetrics().density);
            layoutParams2.setMarginEnd((int) (4 * this.fetchVPNInfo.getResources().getDisplayMetrics().density));
            this.valueOf.setLayoutParams(layoutParams2);
            this.valueOf.setImageResource(C32726miy.StateListAnimator.copydefault);
        }

        public final void AYXKKw() {
            android.animation.ValueAnimator valueAnimator = this.AYXKKw;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.AYXKKw = null;
            this.valueOf.pauseAnimation();
            this.valueOf.setRotation(0.0f);
        }

        public final void KWHzl(boolean z) {
            ViewGroup.LayoutParams layoutParams = this.valueOf.getLayoutParams();
            Intrinsics.copydefault(layoutParams, "");
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            float f = 20;
            layoutParams2.width = (int) (this.fetchVPNInfo.getResources().getDisplayMetrics().density * f);
            layoutParams2.height = (int) (f * this.fetchVPNInfo.getResources().getDisplayMetrics().density);
            layoutParams2.setMarginEnd((int) (2 * this.fetchVPNInfo.getResources().getDisplayMetrics().density));
            this.valueOf.setLayoutParams(layoutParams2);
            if (z) {
                this.valueOf.setImageResource(C52761wXj.TaskDescription.ZqidTP);
                this.valueOf.setColorFilter(C33070mpX.copydefault(C52761wXj.Activity.DQzvGN), PorterDuff.Mode.SRC_IN);
            } else {
                this.valueOf.setImageResource(C52761wXj.TaskDescription.hQkvHM);
                this.valueOf.setColorFilter(C33070mpX.copydefault(C52761wXj.Activity.RihMUf), PorterDuff.Mode.SRC_IN);
            }
        }

        public final void KWHzl() {
            android.animation.ValueAnimator valueAnimator = this.AYXKKw;
            if (valueAnimator != null) {
                valueAnimator.pause();
            }
            this.valueOf.pauseAnimation();
        }

        public final void gEmmrt() {
            android.animation.ValueAnimator valueAnimator = this.AYXKKw;
            if (valueAnimator != null) {
                valueAnimator.resume();
            }
            if (this.gEmmrt) {
                this.valueOf.playAnimation();
            }
        }

        public final void copydefault() {
            android.animation.ValueAnimator valueAnimator = this.AYXKKw;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.AYXKKw = null;
            this.valueOf.cancelAnimation();
        }

        public final void AhwBna() {
            this.gEmmrt = false;
            this.copydefault = false;
            this.AEQbTJ = false;
            this.djBIcL = false;
            this.EZpvd = false;
            OLrzqt(this.AhwBna);
            AYXKKw();
            this.valueOf.setRotation(0.0f);
            this.valueOf.clearColorFilter();
            ViewGroup.LayoutParams layoutParams = this.valueOf.getLayoutParams();
            Intrinsics.copydefault(layoutParams, "");
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            float f = 16;
            layoutParams2.width = (int) (this.fetchVPNInfo.getResources().getDisplayMetrics().density * f);
            layoutParams2.height = (int) (f * this.fetchVPNInfo.getResources().getDisplayMetrics().density);
            layoutParams2.setMarginEnd((int) (4 * this.fetchVPNInfo.getResources().getDisplayMetrics().density));
            this.valueOf.setLayoutParams(layoutParams2);
            this.valueOf.setImageResource(C32726miy.StateListAnimator.copydefault);
            Activity activityAEQbTJ = this.fetchVPNInfo.AEQbTJ(this.OLrzqt);
            if (activityAEQbTJ != null) {
                this.fetchVPNInfo.KWHzl(activityAEQbTJ, (java.lang.String) null);
            }
        }
    }

    public final void AEQbTJ(boolean z) {
        LottieAnimationView lottieAnimationView;
        int i;
        C32682miG c32682miG = this.wlaJM;
        if (c32682miG == null || (lottieAnimationView = c32682miG.AYXKKw) == null) {
            return;
        }
        if (z && iwGUEr()) {
            i = C32726miy.TaskDescription.EZpvd;
        } else if (z && !iwGUEr()) {
            i = C32726miy.TaskDescription.gEmmrt;
        } else if (z || !iwGUEr()) {
            i = (z || iwGUEr()) ? C32726miy.TaskDescription.EZpvd : C32726miy.TaskDescription.OLrzqt;
        } else {
            i = C32726miy.TaskDescription.copydefault;
        }
        lottieAnimationView.setAnimation(i);
        lottieAnimationView.setRepeatCount(0);
        lottieAnimationView.setSpeed(1.0f);
        lottieAnimationView.addAnimatorListener(new Fragment());
        lottieAnimationView.playAnimation();
    }

    /* JADX INFO: renamed from: o.mka$Fragment */
    public static final class Fragment extends android.animation.AnimatorListenerAdapter {
        public Fragment() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(android.animation.Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
            C32808mka.this.ejfBZ();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean iwGUEr() {
        return C33492mxV.OLrzqt();
    }

    public final void ejfBZ() {
        android.widget.TextView textView;
        android.widget.TextView textView2;
        C32682miG c32682miG = this.wlaJM;
        if (c32682miG != null && (textView2 = c32682miG.ejfBZ) != null) {
            textView2.setVisibility(0);
            textView2.animate().cancel();
            textView2.setAlpha(0.0f);
            textView2.animate().alpha(1.0f).setDuration(500L).start();
        }
        C32682miG c32682miG2 = this.wlaJM;
        if (c32682miG2 == null || (textView = c32682miG2.getFieldNames) == null || textView.getVisibility() != 0) {
            return;
        }
        textView.animate().cancel();
        textView.setAlpha(0.0f);
        textView.animate().alpha(1.0f).setDuration(500L).start();
    }

    public final void djBIcL(boolean z) {
        C32682miG c32682miG = this.wlaJM;
        if (c32682miG != null) {
            android.widget.TextView textView = c32682miG.getFieldNames;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            android.widget.Space space = c32682miG.AuCTel;
            Intrinsics.checkNotNullExpressionValue(space, "");
            if (z) {
                textView.setVisibility(0);
                if (space != null) {
                    space.setVisibility(0);
                    return;
                }
                return;
            }
            textView.setVisibility(8);
            if (space != null) {
                space.setVisibility(8);
            }
        }
    }

    public final void DbNXlk() {
        android.widget.TextView textView;
        android.widget.TextView textView2;
        android.widget.TextView textView3;
        android.widget.RelativeLayout relativeLayout;
        C32682miG c32682miG = this.wlaJM;
        if (c32682miG != null && (relativeLayout = c32682miG.AEQbTJ) != null) {
            relativeLayout.setVisibility(8);
        }
        C32682miG c32682miG2 = this.wlaJM;
        if (c32682miG2 != null && (textView3 = c32682miG2.ejfBZ) != null) {
            textView3.setVisibility(8);
        }
        C32682miG c32682miG3 = this.wlaJM;
        if (c32682miG3 != null && (textView2 = c32682miG3.ejfBZ) != null) {
            textView2.setAlpha(0.0f);
        }
        djBIcL(false);
        C32682miG c32682miG4 = this.wlaJM;
        if (c32682miG4 == null || (textView = c32682miG4.getFieldNames) == null) {
            return;
        }
        textView.setAlpha(0.0f);
    }

    public final void AkhnZx() {
        isConnected();
        DbNXlk();
        fJNWhG();
        C32779mjy c32779mjy = this.AwvSrB;
        if (c32779mjy == null) {
            Intrinsics.gEmmrt("");
            c32779mjy = null;
        }
        c32779mjy.copydefault();
    }

    public final void fIwbmz() {
        if (AEQbTJ() == DeviceScanner.ScannerStatus.RUNNING.getValue()) {
            C32779mjy c32779mjy = this.AwvSrB;
            if (c32779mjy == null) {
                Intrinsics.gEmmrt("");
                c32779mjy = null;
            }
            int i = this.AhwBna;
            c32779mjy.KWHzl(i, this.AxsJAY, i);
        }
    }

    public final void copydefault(java.util.Map<java.lang.Integer, C32809mkb> map) {
        Application application;
        for (Map.Entry<java.lang.Integer, C32809mkb> entry : map.entrySet()) {
            int iIntValue = entry.getKey().intValue();
            C32809mkb value = entry.getValue();
            C32809mkb c32809mkb = this.fARcdN.get(java.lang.Integer.valueOf(iIntValue));
            if (!Intrinsics.EZpvd(c32809mkb, value) && (application = this.zLjUOn.get(java.lang.Integer.valueOf(iIntValue))) != null) {
                if (value.EZpvd() && !value.AEQbTJ() && (c32809mkb == null || !c32809mkb.EZpvd() || (c32809mkb != null && c32809mkb.AEQbTJ()))) {
                    application.AEQbTJ();
                }
                if (value.AEQbTJ() && (c32809mkb == null || !c32809mkb.AEQbTJ())) {
                    application.copydefault(value.copydefault());
                }
            }
        }
        this.fARcdN = map;
    }

    public final void KWHzl(boolean z) {
        java.util.List<EnsecureAppInfo> list = this.OLrzqt;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            if (!((EnsecureAppInfo) obj).isIgnored()) {
                arrayList.add(obj);
            }
        }
        AhwBna(!arrayList.isEmpty());
        java.util.Map<java.lang.Integer, java.util.List<EnsecureAppInfo>> mapEZpvd = EZpvd(list);
        java.util.Iterator<T> it = EZpvd.iterator();
        while (it.hasNext()) {
            int iIntValue = ((java.lang.Number) it.next()).intValue();
            java.util.List<EnsecureAppInfo> listAhwBna = mapEZpvd.get(java.lang.Integer.valueOf(iIntValue));
            if (listAhwBna == null) {
                listAhwBna = yDY.AhwBna();
            }
            Application application = this.zLjUOn.get(java.lang.Integer.valueOf(iIntValue));
            if (application != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                for (java.lang.Object obj2 : listAhwBna) {
                    if (!((EnsecureAppInfo) obj2).isIgnored()) {
                        arrayList2.add(obj2);
                    }
                }
                application.EZpvd(!arrayList2.isEmpty());
            }
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            for (java.lang.Object obj3 : listAhwBna) {
                if (!((EnsecureAppInfo) obj3).isIgnored()) {
                    arrayList3.add(obj3);
                }
            }
            if (!arrayList3.isEmpty()) {
                copydefault(iIntValue, listAhwBna);
                ActionBar actionBarOLrzqt = OLrzqt(iIntValue);
                Activity activityAEQbTJ = AEQbTJ(iIntValue);
                Application application2 = this.zLjUOn.get(java.lang.Integer.valueOf(iIntValue));
                if (actionBarOLrzqt != null && activityAEQbTJ != null && actionBarOLrzqt.AEQbTJ() && (!actionBarOLrzqt.KWHzl().isEmpty())) {
                    boolean zEZpvd = application2 != null ? application2.EZpvd() : false;
                    if (actionBarOLrzqt.OLrzqt() != zEZpvd) {
                        copydefault(iIntValue, ActionBar.copy$default(actionBarOLrzqt, 0, zEZpvd, false, null, 13, null));
                    }
                    if (zEZpvd) {
                        EZpvd(activityAEQbTJ);
                    } else {
                        activityAEQbTJ.EZpvd().setVisibility(8);
                        KWHzl(activityAEQbTJ, "down");
                    }
                }
            }
        }
        OLrzqt(z);
    }

    public final void gEmmrt() {
        java.lang.Integer numCopydefault;
        java.lang.Integer numCopydefault2;
        java.util.List<EnsecureAppInfo> list = this.OLrzqt;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            if (OLrzqt(((EnsecureAppInfo) obj).getPackageName())) {
                arrayList.add(obj);
            }
        }
        java.util.List<EnsecureAppInfo> listFJNWhG = CollectionsKt___CollectionsKt.fJNWhG((java.util.Collection) arrayList);
        final int size = this.OLrzqt.size() - listFJNWhG.size();
        if (size != 0) {
            C32866mlf.onEvent$default("DeviceScanning_Total_Button_View", (TrackChannel[]) null, new Function1() { // from class: o.mkp
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return C32808mka.KWHzl(size, this, (EventParamsList) obj2);
                }
            }, 1, (java.lang.Object) null);
            java.util.List<EnsecureAppInfo> list2 = this.OLrzqt;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (java.lang.Object obj2 : list2) {
                EnsecureAppInfo ensecureAppInfo = (EnsecureAppInfo) obj2;
                if (!OLrzqt(ensecureAppInfo.getPackageName()) && (((numCopydefault2 = copydefault(ensecureAppInfo.getScanResult().getReason())) != null && numCopydefault2.intValue() == 3) || (numCopydefault2 != null && numCopydefault2.intValue() == 4))) {
                    arrayList2.add(obj2);
                }
            }
            final java.util.List listFJNWhG2 = CollectionsKt___CollectionsKt.fJNWhG((java.util.Collection) arrayList2);
            if (!listFJNWhG2.isEmpty()) {
                C32866mlf.onEvent$default("DeviceScanning_BlackApp_Button_View", (TrackChannel[]) null, new Function1() { // from class: o.mkn
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj3) {
                        return C32808mka.OLrzqt(listFJNWhG2, this, (EventParamsList) obj3);
                    }
                }, 1, (java.lang.Object) null);
            }
            java.util.List<EnsecureAppInfo> list3 = this.OLrzqt;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            for (java.lang.Object obj3 : list3) {
                EnsecureAppInfo ensecureAppInfo2 = (EnsecureAppInfo) obj3;
                if (!OLrzqt(ensecureAppInfo2.getPackageName()) && (((numCopydefault = copydefault(ensecureAppInfo2.getScanResult().getReason())) != null && numCopydefault.intValue() == 1) || (numCopydefault != null && numCopydefault.intValue() == 2))) {
                    arrayList3.add(obj3);
                }
            }
            final java.util.List listFJNWhG3 = CollectionsKt___CollectionsKt.fJNWhG((java.util.Collection) arrayList3);
            if (!listFJNWhG3.isEmpty()) {
                C32866mlf.onEvent$default("DeviceScanning_OverRight_Button_View", (TrackChannel[]) null, new Function1() { // from class: o.mkm
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj4) {
                        return C32808mka.djBIcL(listFJNWhG3, this, (EventParamsList) obj4);
                    }
                }, 1, (java.lang.Object) null);
            }
        }
        this.OLrzqt = listFJNWhG;
        for (Map.Entry<java.lang.Integer, ActionBar> entry : this.uzCIH.entrySet()) {
            int iIntValue = entry.getKey().intValue();
            ActionBar value = entry.getValue();
            java.util.List<EnsecureAppInfo> listKWHzl = value.KWHzl();
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            for (java.lang.Object obj4 : listKWHzl) {
                EnsecureAppInfo ensecureAppInfo3 = (EnsecureAppInfo) obj4;
                java.util.List<EnsecureAppInfo> list4 = this.OLrzqt;
                if (!(list4 instanceof java.util.Collection) || !list4.isEmpty()) {
                    java.util.Iterator<T> it = list4.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (Intrinsics.EZpvd((java.lang.Object) ((EnsecureAppInfo) it.next()).getPackageName(), (java.lang.Object) ensecureAppInfo3.getPackageName())) {
                                arrayList4.add(obj4);
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
            }
            copydefault(iIntValue, ActionBar.copy$default(value, 0, false, false, arrayList4, 7, null));
        }
        C56406yEe.djBIcL(this.AuCTelauCTel, new Function1() { // from class: o.mku
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj5) {
                return java.lang.Boolean.valueOf(C32808mka.gEmmrt(this.EZpvd, (EnsecureAppInfo) obj5));
            }
        });
        getFieldNames();
        if (size != 0) {
            fARcdN();
        }
    }

    public final void fARcdN() {
        java.util.Iterator<T> it = EZpvd.iterator();
        while (it.hasNext()) {
            int iIntValue = ((java.lang.Number) it.next()).intValue();
            ActionBar actionBar = this.uzCIH.get(java.lang.Integer.valueOf(iIntValue));
            Activity activityAEQbTJ = AEQbTJ(iIntValue);
            if (actionBar != null && activityAEQbTJ != null) {
                java.util.List<EnsecureAppInfo> listKWHzl = actionBar.KWHzl();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (java.lang.Object obj : listKWHzl) {
                    if (!((EnsecureAppInfo) obj).isIgnored()) {
                        arrayList.add(obj);
                    }
                }
                copydefault(iIntValue, ActionBar.copy$default(actionBar, 0, false, false, arrayList, 7, null));
                C32782mkA c32782mkA = this.zsXlph.get(java.lang.Integer.valueOf(iIntValue));
                if (c32782mkA != null) {
                    c32782mkA.copydefault(arrayList);
                    adjustRecyclerViewHeight$default(this, activityAEQbTJ.EZpvd(), arrayList, null, 4, null);
                    if (arrayList.isEmpty()) {
                        djBIcL(iIntValue);
                    } else if (actionBar.OLrzqt()) {
                        activityAEQbTJ.EZpvd().setVisibility(0);
                        KWHzl(activityAEQbTJ, "up");
                    } else {
                        activityAEQbTJ.EZpvd().setVisibility(8);
                        KWHzl(activityAEQbTJ, "down");
                    }
                }
            }
        }
    }

    public final void KWHzl(java.util.Map<java.lang.Integer, C32809mkb> map, int i) {
        java.util.List<EnsecureAppInfo> listAhwBna;
        if (map != null) {
            java.util.Iterator<T> it = EZpvd.iterator();
            while (it.hasNext()) {
                int iIntValue = ((java.lang.Number) it.next()).intValue();
                C32809mkb c32809mkb = map.get(java.lang.Integer.valueOf(iIntValue));
                Application application = this.zLjUOn.get(java.lang.Integer.valueOf(iIntValue));
                if (c32809mkb != null && application != null) {
                    boolean zAEQbTJ = c32809mkb.AEQbTJ();
                    boolean zCopydefault = c32809mkb.copydefault();
                    boolean zEZpvd = c32809mkb.EZpvd();
                    if (zAEQbTJ) {
                        application.copydefault(zCopydefault);
                        ActionBar actionBarOLrzqt = OLrzqt(iIntValue);
                        if (actionBarOLrzqt != null) {
                            if (zCopydefault) {
                                listAhwBna = actionBarOLrzqt.KWHzl();
                            } else {
                                listAhwBna = yDY.AhwBna();
                            }
                            copydefault(iIntValue, ActionBar.copy$default(actionBarOLrzqt, 0, false, true, listAhwBna, 3, null));
                        }
                    } else {
                        if (zEZpvd) {
                            application.AEQbTJ();
                        }
                        ActionBar actionBarOLrzqt2 = OLrzqt(iIntValue);
                        if (actionBarOLrzqt2 != null) {
                            copydefault(iIntValue, ActionBar.copy$default(actionBarOLrzqt2, 0, false, false, null, 11, null));
                        }
                    }
                }
            }
        }
    }

    public static final Unit AEQbTJ(java.util.List list, final C32808mka c32808mka) {
        java.lang.Object next;
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            EnsecureAppInfo ensecureAppInfo = (EnsecureAppInfo) it.next();
            C32788mkG.Companion.AhwBna(ensecureAppInfo.getPackageName());
            ensecureAppInfo.setIgnored(true);
            java.util.Iterator<T> it2 = c32808mka.OLrzqt.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
                if (Intrinsics.EZpvd((java.lang.Object) ((EnsecureAppInfo) next).getPackageName(), (java.lang.Object) ensecureAppInfo.getPackageName())) {
                    break;
                }
            }
            EnsecureAppInfo ensecureAppInfo2 = (EnsecureAppInfo) next;
            if (ensecureAppInfo2 != null) {
                ensecureAppInfo2.setIgnored(ensecureAppInfo.isIgnored());
            }
            removeIgnoredAppFromUI$default(c32808mka, ensecureAppInfo, false, 2, null);
        }
        c32808mka.fARcdN();
        c32808mka.OLrzqt(false);
        java.util.List<EnsecureAppInfo> list2 = c32808mka.OLrzqt;
        final java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list2) {
            if (((EnsecureAppInfo) obj).isIgnored()) {
                arrayList.add(obj);
            }
        }
        C32866mlf.onEvent$default("DeviceScanning_Total_Button_View", (TrackChannel[]) null, new Function1() { // from class: o.mkl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return C32808mka.KWHzl(arrayList, c32808mka, (EventParamsList) obj2);
            }
        }, 1, (java.lang.Object) null);
        java.util.List<EnsecureAppInfo> list3 = c32808mka.OLrzqt;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj2 : list3) {
            if (!((EnsecureAppInfo) obj2).isIgnored()) {
                arrayList2.add(obj2);
            }
        }
        if (arrayList2.isEmpty()) {
            if (Intrinsics.EZpvd((java.lang.Object) c32808mka.hDKMBd(), (java.lang.Object) FirebaseAnalytics.Event.LOGIN)) {
                C32788mkG.StateListAnimator stateListAnimator = C32788mkG.Companion;
                stateListAnimator.AYXKKw(c32808mka.hDKMBd());
                C32788mkG.StateListAnimator.recordScanStatus$default(stateListAnimator, DeviceScanner.ScannerStatus.IDLE.getValue(), null, 2, null);
                InterfaceC32766mjl interfaceC32766mjl = c32808mka.fJNWhG;
                if (interfaceC32766mjl != null) {
                    interfaceC32766mjl.EZpvd();
                }
            } else {
                c32808mka.AhwBna(false);
            }
        }
        c32808mka.AuCTelauCTel.clear();
        return Unit.INSTANCE;
    }
}
