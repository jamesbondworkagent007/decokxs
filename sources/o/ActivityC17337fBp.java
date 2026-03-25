package o;

import android.media.AudioAttributes;
import androidx.activity.OnBackPressedCallback;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.MyItemTouchHelper;
import androidx.recyclerview.widget.OkDefaultItemAnimator;
import androidx.recyclerview.widget.OrientationHelper;
import androidx.recyclerview.widget.RecyclerView;
import com.engagelab.privates.analysis.constants.MTAnalysisConstants;
import com.okinc.business.defi.biz.constant.WalletType;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import com.okinc.business.defi.biz.net.bean.TxToastCheckRes;
import com.okinc.business.defi.wallet.eip7702.data.model.EIP7702WalletStatus;
import com.okinc.business.defi.wallet.mine.walletmanage.WalletEditActivity$initData$2;
import com.okinc.business.defi.wallet.mine.walletmanage.walletmanageradapter.SafeLinearLayoutManager;
import com.okinc.components.track.ABTestManager;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.wallet.api.bean.EnterWalletMainBean;
import java.util.Collections;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.DebugKt;
import o.ActivityC17337fBp;
import o.C12827cuN;
import o.C13754dXa;
import o.C17351fCc;
import o.C18521fjv;
import o.C52761wXj;
import o.C52812wZg;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fBp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class ActivityC17337fBp extends AbstractActivityC33013moT {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int OLrzqt = 8;
    public Application AEQbTJ;
    public boolean AYXKKw;
    public final C17237eyx AkhnZx;
    public boolean DbNXlk;
    public AbstractC16442ejx EZpvd;
    public java.lang.Boolean djBIcL;
    public final InterfaceC56387yDm gEmmrt;
    public final InterfaceC56387yDm values;
    public java.lang.String copydefault = "WalletEditActivity";
    public final InterfaceC56387yDm KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.fBG
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return ActivityC17337fBp.gEmmrt();
        }
    });
    public final InterfaceC56387yDm AhwBna = C56392yDr.copydefault(new Function0() { // from class: o.fBO
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return ActivityC17337fBp.DbNXlk(this.OLrzqt);
        }
    });
    public final InterfaceC56387yDm isConnected = C56392yDr.copydefault(new Function0() { // from class: o.fBN
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return ActivityC17337fBp.ejfBZ(this.AEQbTJ);
        }
    });
    public java.lang.String valueOf = "";
    public final ActionBar fetchVPNInfo = new ActionBar();

    /* JADX INFO: renamed from: o.fBp$Activity */
    /* JADX INFO: loaded from: classes15.dex */
    public final /* synthetic */ class Activity {
        public static final /* synthetic */ int[] OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[WalletType.values().length];
            try {
                iArr[WalletType.AAWallet.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[WalletType.MPCWallet.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[WalletType.HardwareWallet.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[WalletType.TrackingWallet.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            OLrzqt = iArr;
        }
    }

    /* JADX INFO: renamed from: o.fBp$PendingIntent */
    public static final /* synthetic */ class PendingIntent implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public PendingIntent(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.AEQbTJ = function1;
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
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.AEQbTJ.invoke(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractActivityC33041mov
    public java.lang.String getTAG() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractActivityC33041mov
    public void setTAG(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.copydefault = str;
    }

    public ActivityC17337fBp() {
        C12827cuN.Application application = C12827cuN.Companion;
        this.AkhnZx = new C17237eyx(new C17262ezV(C12827cuN.Application.getInstance$default(application, null, 1, null), null, null, 6, null), 0 == true ? 1 : 0, 0 == true ? 1 : 0, new C17241ezA(new C17262ezV(C12827cuN.Application.getInstance$default(application, null, 1, null), null, null, 6, null)), 0 == true ? 1 : 0, 22, null);
        this.gEmmrt = C56392yDr.copydefault(new Function0() { // from class: o.fBM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return ActivityC17337fBp.AkhnZx(this.EZpvd);
            }
        });
        this.values = C56392yDr.copydefault(new Function0() { // from class: o.fBK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Float.valueOf(ActivityC17337fBp.EZpvd());
            }
        });
    }

    /* JADX INFO: renamed from: o.fBp$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.fBp.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final void EZpvd(@NotNull android.content.Context context, @NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(str, "");
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) ActivityC17337fBp.class);
            intent.putExtra("wallet_id", str);
            context.startActivity(intent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C17351fCc.Activity AkhnZx() {
        return (C17351fCc.Activity) this.KWHzl.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C17351fCc.Activity gEmmrt() {
        return new C17351fCc.Activity();
    }

    public final C17410fEh copydefault() {
        return (C17410fEh) this.AhwBna.getValue();
    }

    public static final C17410fEh DbNXlk(ActivityC17337fBp activityC17337fBp) {
        return (C17410fEh) new ViewModelProvider(activityC17337fBp).get(C17410fEh.class);
    }

    /* JADX INFO: renamed from: o.fBp$LoaderManager */
    public static final class LoaderManager implements RecyclerView.OnChildAttachStateChangeListener {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.recyclerview.widget.RecyclerView.OnChildAttachStateChangeListener
        public void onChildViewDetachedFromWindow(android.view.View view) {
            Intrinsics.checkNotNullParameter(view, "");
        }

        public LoaderManager() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnChildAttachStateChangeListener
        public void onChildViewAttachedToWindow(android.view.View view) {
            Intrinsics.checkNotNullParameter(view, "");
            ActivityC17337fBp.this.fJNWhG();
        }
    }

    public final LoaderManager djBIcL() {
        return (LoaderManager) this.isConnected.getValue();
    }

    public static final LoaderManager ejfBZ(ActivityC17337fBp activityC17337fBp) {
        return activityC17337fBp.new LoaderManager();
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        pUU.OLrzqt(">>>prom Edit onCreate");
        super.onCreate(bundle);
        this.EZpvd = (AbstractC16442ejx) DataBindingUtil.setContentView(this, C13754dXa.TaskDescription.OJuSTm);
        AbstractC16442ejx abstractC16442ejx = null;
        C32866mlf.onEvent$default("Web3WalletManagement_ManagePage_Manage_View", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
        AbstractC16442ejx abstractC16442ejx2 = this.EZpvd;
        if (abstractC16442ejx2 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC16442ejx = abstractC16442ejx2;
        }
        abstractC16442ejx.KWHzl.setTitleTypeface("harmony_sans_bold.ttf");
        ejfBZ();
        isConnected();
        fARcdN();
        values();
    }

    private final void ejfBZ() {
        java.lang.String stringExtra;
        android.content.Intent intent = getIntent();
        if (intent == null || (stringExtra = intent.getStringExtra("wallet_id")) == null) {
            stringExtra = "";
        }
        this.valueOf = stringExtra;
    }

    /* JADX INFO: renamed from: o.fBp$ActionBar */
    public static final class ActionBar extends OnBackPressedCallback {
        public ActionBar() {
            super(true);
        }

        @Override // androidx.activity.OnBackPressedCallback
        public void handleOnBackPressed() {
            final ActivityC17337fBp activityC17337fBp = ActivityC17337fBp.this;
            activityC17337fBp.EZpvd((Function1<? super java.lang.Integer, Unit>) new Function1() { // from class: o.fBU
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return ActivityC17337fBp.ActionBar.KWHzl(activityC17337fBp, ((java.lang.Integer) obj).intValue());
                }
            });
        }

        public static final Unit KWHzl(ActivityC17337fBp activityC17337fBp, int i) {
            activityC17337fBp.DbNXlk();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void DbNXlk() {
        this.fetchVPNInfo.setEnabled(false);
        getOnBackPressedDispatcher().onBackPressed();
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        getOnBackPressedDispatcher().addCallback(this.fetchVPNInfo);
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.fetchVPNInfo.remove();
    }

    public final void EZpvd(final Function1<? super java.lang.Integer, Unit> function1) {
        LinkedHashMap<java.lang.String, java.util.List<java.lang.String>> linkedHashMap = new LinkedHashMap<>();
        java.util.List<fDL<java.lang.Object>> listCopydefault = AkhnZx().copydefault();
        if (listCopydefault != null) {
            java.util.ArrayList<Application> arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : listCopydefault) {
                if (obj instanceof Application) {
                    arrayList.add(obj);
                }
            }
            for (Application application : arrayList) {
                java.lang.String strEZpvd = application.EZpvd().EZpvd();
                java.util.ArrayList<java.lang.Object> arrayListCopydefault = application.copydefault();
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                for (java.lang.Object obj2 : arrayListCopydefault) {
                    if (obj2 instanceof eCF) {
                        arrayList2.add(obj2);
                    }
                }
                java.util.ArrayList arrayList3 = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList2, 10));
                java.util.Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    arrayList3.add(((eCF) it.next()).copydefault().DbNXlk());
                }
                linkedHashMap.put(strEZpvd, arrayList3);
            }
        }
        AbstractC58260yxt abstractC58260yxtKWHzl = C58156yvv.KWHzl(C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).EZpvd(linkedHashMap), this);
        final Function1 function12 = new Function1() { // from class: o.fBy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj3) {
                return ActivityC17337fBp.EZpvd(function1, (java.lang.Integer) obj3);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.fBL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj3) {
                ActivityC17337fBp.AkhnZx(function12, obj3);
            }
        };
        final Function1 function13 = new Function1() { // from class: o.fBT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj3) {
                return ActivityC17337fBp.AhwBna(this.copydefault, (java.lang.Throwable) obj3);
            }
        };
        addDisposable(abstractC58260yxtKWHzl.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.fBS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj3) {
                ActivityC17337fBp.fetchVPNInfo(function13, obj3);
            }
        }));
    }

    public static final void AkhnZx(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(Function1 function1, java.lang.Integer num) {
        Intrinsics.copydefault(num);
        function1.invoke(num);
        return Unit.INSTANCE;
    }

    public static final void fetchVPNInfo(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AhwBna(ActivityC17337fBp activityC17337fBp, java.lang.Throwable th) {
        pUU.copydefault(activityC17337fBp.getTAG(), "saveWalletSort error message :" + th.getMessage());
        return Unit.INSTANCE;
    }

    private final void values() {
        copydefault().EZpvd().observe(this, new PendingIntent(new Function1() { // from class: o.fBF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC17337fBp.EZpvd(this.OLrzqt, (java.util.List) obj);
            }
        }));
        copydefault().copydefault();
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new WalletEditActivity$initData$2(this, null), 3, null);
    }

    public static final Unit EZpvd(ActivityC17337fBp activityC17337fBp, java.util.List list) {
        if (list.isEmpty()) {
            dZK.AEQbTJ.AEQbTJ(activityC17337fBp, new EnterWalletMainBean((java.lang.Boolean) null, (java.lang.String) null, (java.lang.Integer) null, (java.lang.String) null, false, false, (com.okinc.wallet.api.bean.ScanResult) null, WalletImportError.ERROR_CODE_GET_EOA_ADDRESS_KEY, (DefaultConstructorMarker) null));
            return Unit.INSTANCE;
        }
        C17351fCc.Activity activityAkhnZx = activityC17337fBp.AkhnZx();
        Intrinsics.copydefault(list);
        activityAkhnZx.EZpvd((java.util.List<? extends fDL<java.lang.Object>>) list);
        AbstractC16442ejx abstractC16442ejx = null;
        rVN.reportFullyDrawn$default((android.app.Activity) activityC17337fBp, true, (java.lang.String) null, 2, (java.lang.Object) null);
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            activityC17337fBp.AkhnZx().KWHzl((fDL<java.lang.Object>) it.next());
        }
        AbstractC16442ejx abstractC16442ejx2 = activityC17337fBp.EZpvd;
        if (abstractC16442ejx2 == null) {
            Intrinsics.gEmmrt("");
            abstractC16442ejx2 = null;
        }
        if (abstractC16442ejx2.OLrzqt.getAdapter() == null) {
            AbstractC16442ejx abstractC16442ejx3 = activityC17337fBp.EZpvd;
            if (abstractC16442ejx3 == null) {
                Intrinsics.gEmmrt("");
            } else {
                abstractC16442ejx = abstractC16442ejx3;
            }
            abstractC16442ejx.OLrzqt.setAdapter(activityC17337fBp.AkhnZx());
        } else {
            activityC17337fBp.AkhnZx().notifyDataSetChanged();
        }
        if (activityC17337fBp.valueOf.length() > 0 && !activityC17337fBp.AYXKKw && !C13912dbY.copydefault.values()) {
            activityC17337fBp.AYXKKw = true;
            activityC17337fBp.OLrzqt((java.util.List<fDL<java.lang.Object>>) list, activityC17337fBp.valueOf);
        }
        return Unit.INSTANCE;
    }

    public final void OLrzqt(java.util.List<fDL<java.lang.Object>> list, java.lang.String str) {
        fDL<java.lang.Object> next;
        boolean z;
        java.util.Iterator<fDL<java.lang.Object>> it = list.iterator();
        int i = 0;
        loop0: while (it.hasNext() && (!((z = (next = it.next()) instanceof Application)) || !Intrinsics.EZpvd((java.lang.Object) ((Application) next).EZpvd().EZpvd(), (java.lang.Object) str))) {
            i++;
            if (z) {
                Application application = (Application) next;
                int iOLrzqt = application.OLrzqt();
                for (int i2 = 0; i2 < iOLrzqt; i2++) {
                    java.lang.Object objCopydefault = application.copydefault(i2);
                    if ((objCopydefault instanceof AbstractC12782ctV) && Intrinsics.EZpvd((java.lang.Object) ((AbstractC12782ctV) objCopydefault).DbNXlk(), (java.lang.Object) str)) {
                        break loop0;
                    }
                    i++;
                }
            }
        }
        AbstractC16442ejx abstractC16442ejx = this.EZpvd;
        if (abstractC16442ejx == null) {
            Intrinsics.gEmmrt("");
            abstractC16442ejx = null;
        }
        abstractC16442ejx.OLrzqt.scrollToPosition(i);
    }

    private final void isConnected() {
        AkhnZx().AEQbTJ(Application.class, (fDP) new fEG(new yHO() { // from class: o.fBz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHO
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return ActivityC17337fBp.AEQbTJ(this.EZpvd, (RecyclerView.ViewHolder) obj, obj2, ((java.lang.Integer) obj3).intValue());
            }
        }, new Function2() { // from class: o.fBw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return ActivityC17337fBp.AYXKKw(this.copydefault, obj, ((java.lang.Integer) obj2).intValue());
            }
        }, new yHO() { // from class: o.fBv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHO
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return ActivityC17337fBp.KWHzl(this.AEQbTJ, obj, ((java.lang.Integer) obj2).intValue(), ((java.lang.Boolean) obj3).booleanValue());
            }
        }, new Function2() { // from class: o.fBB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return ActivityC17337fBp.AhwBna(this.KWHzl, obj, ((java.lang.Integer) obj2).intValue());
            }
        }));
        AkhnZx().AEQbTJ(eCF.class, (fDP) new fEA(new yHO() { // from class: o.fBA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHO
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return ActivityC17337fBp.OLrzqt(this.OLrzqt, (RecyclerView.ViewHolder) obj, obj2, ((java.lang.Integer) obj3).intValue());
            }
        }, new Function2() { // from class: o.fBD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return ActivityC17337fBp.valueOf(this.OLrzqt, obj, ((java.lang.Integer) obj2).intValue());
            }
        }, new Function2() { // from class: o.fBE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return ActivityC17337fBp.gEmmrt(this.OLrzqt, obj, ((java.lang.Integer) obj2).intValue());
            }
        }, new Function2() { // from class: o.fBC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return ActivityC17337fBp.djBIcL(this.EZpvd, obj, ((java.lang.Integer) obj2).intValue());
            }
        }));
        AkhnZx().AEQbTJ(fED.class, (fDP) new C17428fEz());
    }

    public static final Unit AEQbTJ(ActivityC17337fBp activityC17337fBp, RecyclerView.ViewHolder viewHolder, java.lang.Object obj, int i) {
        Intrinsics.checkNotNullParameter(viewHolder, "");
        Intrinsics.checkNotNullParameter(obj, "");
        activityC17337fBp.AhwBna().startDrag(viewHolder);
        Application application = (Application) obj;
        activityC17337fBp.AEQbTJ = application;
        activityC17337fBp.AkhnZx().AEQbTJ(application);
        activityC17337fBp.AEQbTJ(viewHolder.itemView, true);
        return Unit.INSTANCE;
    }

    public static final Unit AYXKKw(final ActivityC17337fBp activityC17337fBp, java.lang.Object obj, int i) {
        Intrinsics.checkNotNullParameter(obj, "");
        AbstractC12784ctX abstractC12784ctXEZpvd = ((Application) obj).EZpvd();
        activityC17337fBp.AkhnZx.EZpvd(new C17263ezW(activityC17337fBp, abstractC12784ctXEZpvd.EZpvd(), abstractC12784ctXEZpvd.fJNWhG(), abstractC12784ctXEZpvd.fJNWhG(), false, activityC17337fBp.getTAG(), new Function1() { // from class: o.fBx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return ActivityC17337fBp.EZpvd(this.KWHzl, (java.lang.String) obj2);
            }
        }));
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(ActivityC17337fBp activityC17337fBp, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        activityC17337fBp.copydefault().AEQbTJ();
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(ActivityC17337fBp activityC17337fBp, java.lang.Object obj, int i, boolean z) {
        Intrinsics.checkNotNullParameter(obj, "");
        if (z) {
            activityC17337fBp.KWHzl(((Application) obj).EZpvd());
        } else {
            C55326xho.toast$default(C13754dXa.FragmentManager.initDelegate, (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
        }
        return Unit.INSTANCE;
    }

    public static final Unit AhwBna(ActivityC17337fBp activityC17337fBp, java.lang.Object obj, int i) {
        Intrinsics.checkNotNullParameter(obj, "");
        activityC17337fBp.OLrzqt(((Application) obj).EZpvd());
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(ActivityC17337fBp activityC17337fBp, RecyclerView.ViewHolder viewHolder, java.lang.Object obj, int i) {
        Intrinsics.checkNotNullParameter(viewHolder, "");
        Intrinsics.checkNotNullParameter(obj, "");
        activityC17337fBp.AhwBna().startDrag(viewHolder);
        activityC17337fBp.AEQbTJ(viewHolder.itemView, true);
        return Unit.INSTANCE;
    }

    public static final Unit valueOf(ActivityC17337fBp activityC17337fBp, java.lang.Object obj, int i) {
        Intrinsics.checkNotNullParameter(obj, "");
        activityC17337fBp.OLrzqt((AbstractC12782ctV) obj);
        return Unit.INSTANCE;
    }

    public static final Unit gEmmrt(ActivityC17337fBp activityC17337fBp, java.lang.Object obj, int i) {
        Intrinsics.checkNotNullParameter(obj, "");
        activityC17337fBp.EZpvd((AbstractC12782ctV) obj);
        return Unit.INSTANCE;
    }

    public static final Unit djBIcL(ActivityC17337fBp activityC17337fBp, java.lang.Object obj, int i) {
        Intrinsics.checkNotNullParameter(obj, "");
        activityC17337fBp.AEQbTJ((AbstractC12782ctV) obj);
        return Unit.INSTANCE;
    }

    public final void AEQbTJ(final AbstractC12782ctV abstractC12782ctV) {
        this.DbNXlk = true;
        EZpvd(new Function1() { // from class: o.fBm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC17337fBp.EZpvd(this.KWHzl, abstractC12782ctV, ((java.lang.Integer) obj).intValue());
            }
        });
        C32866mlf.onEvent$default("Web3WalletManagement_EditWallet_Entry_Click", (TrackChannel[]) null, new Function1() { // from class: o.fBn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC17337fBp.copydefault(this.copydefault, abstractC12782ctV, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit EZpvd(ActivityC17337fBp activityC17337fBp, AbstractC12782ctV abstractC12782ctV, int i) {
        ActivityC15218eAe.Companion.copydefault(activityC17337fBp, abstractC12782ctV.DbNXlk());
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(ActivityC17337fBp activityC17337fBp, AbstractC12782ctV abstractC12782ctV, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "wallet_or_account", MTAnalysisConstants.Account.KEY_ACCOUNT, false, 4, null);
        EventParamsList.put$default(eventParamsList, "wallet_type", activityC17337fBp.KWHzl(abstractC12782ctV), false, 4, null);
        return Unit.INSTANCE;
    }

    public final java.lang.String KWHzl(AbstractC12782ctV abstractC12782ctV) {
        int i = Activity.OLrzqt[abstractC12782ctV.QwvEab().ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? TxToastCheckRes.EOA_ADDRESS_TYPE : "watch_only" : "hardware" : "mpc" : "aa";
    }

    private final void EZpvd(final AbstractC12782ctV abstractC12782ctV) {
        java.lang.String strEZpvd;
        C18521fjv.TaskDescription taskDescription = C18521fjv.Companion;
        AbstractC12784ctX abstractC12784ctXGwTjWJ = abstractC12782ctV.gwTjWJ();
        java.lang.String str = (abstractC12784ctXGwTjWJ == null || (strEZpvd = abstractC12784ctXGwTjWJ.EZpvd()) == null) ? "" : strEZpvd;
        java.lang.String string = getString(C13754dXa.FragmentManager.aappFQ);
        Intrinsics.checkNotNullExpressionValue(string, "");
        C18521fjv c18521fjvKWHzl = taskDescription.KWHzl(1, (20 & 2) != 0 ? "" : str, (20 & 4) != 0 ? "" : null, (20 & 8) != 0 ? "" : string, (20 & 16) != 0 ? "" : null, (20 & 32) == 0 ? abstractC12782ctV.AkhnZx() : "");
        c18521fjvKWHzl.show(getSupportFragmentManager(), ActivityC17337fBp.class.getName());
        c18521fjvKWHzl.KWHzl(new Function1() { // from class: o.fBu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC17337fBp.KWHzl(this.copydefault, abstractC12782ctV, (java.lang.String) obj);
            }
        });
    }

    public static final Unit KWHzl(final ActivityC17337fBp activityC17337fBp, AbstractC12782ctV abstractC12782ctV, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        activityC17337fBp.showLoading();
        AbstractC58185ywX abstractC58185ywXEZpvd = C58156yvv.EZpvd(abstractC12782ctV.fIwbmz(str), activityC17337fBp);
        final Function1 function1 = new Function1() { // from class: o.fBt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC17337fBp.AEQbTJ(this.KWHzl, (java.lang.Integer) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.fBq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                ActivityC17337fBp.AhwBna(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.fBr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC17337fBp.KWHzl(this.KWHzl, (java.lang.Throwable) obj);
            }
        };
        activityC17337fBp.addDisposable(abstractC58185ywXEZpvd.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.fBs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                ActivityC17337fBp.djBIcL(function12, obj);
            }
        }));
        return Unit.INSTANCE;
    }

    public static final void AhwBna(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(ActivityC17337fBp activityC17337fBp, java.lang.Integer num) {
        activityC17337fBp.dismissLoading();
        activityC17337fBp.copydefault().copydefault();
        return Unit.INSTANCE;
    }

    public static final void djBIcL(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit KWHzl(ActivityC17337fBp activityC17337fBp, java.lang.Throwable th) {
        activityC17337fBp.dismissLoading();
        pUU.copydefault(activityC17337fBp.getTAG(), "onEditAccountNameClick rename error message :" + th.getMessage());
        return Unit.INSTANCE;
    }

    private final void OLrzqt(AbstractC12782ctV abstractC12782ctV) {
        C17237eyx c17237eyx = this.AkhnZx;
        java.lang.String strDbNXlk = abstractC12782ctV.DbNXlk();
        WalletType walletTypeQwvEab = abstractC12782ctV.QwvEab();
        AbstractC12784ctX abstractC12784ctXGwTjWJ = abstractC12782ctV.gwTjWJ();
        c17237eyx.EZpvd(new C17263ezW(this, strDbNXlk, walletTypeQwvEab, abstractC12784ctXGwTjWJ != null ? abstractC12784ctXGwTjWJ.fJNWhG() : null, false, getTAG(), new Function1() { // from class: o.fBo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC17337fBp.copydefault(this.EZpvd, (java.lang.String) obj);
            }
        }));
    }

    public static final Unit copydefault(ActivityC17337fBp activityC17337fBp, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        activityC17337fBp.copydefault().AEQbTJ();
        return Unit.INSTANCE;
    }

    public final void OLrzqt(final AbstractC12784ctX abstractC12784ctX) {
        this.DbNXlk = true;
        EZpvd(new Function1() { // from class: o.fBP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC17337fBp.EZpvd(this.EZpvd, abstractC12784ctX, ((java.lang.Integer) obj).intValue());
            }
        });
        C32866mlf.onEvent$default("Web3WalletManagement_EditWallet_Entry_Click", (TrackChannel[]) null, new Function1() { // from class: o.fBQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC17337fBp.KWHzl(this.OLrzqt, abstractC12784ctX, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit EZpvd(ActivityC17337fBp activityC17337fBp, AbstractC12784ctX abstractC12784ctX, int i) {
        eAZ.Companion.copydefault(activityC17337fBp, abstractC12784ctX.EZpvd());
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(ActivityC17337fBp activityC17337fBp, AbstractC12784ctX abstractC12784ctX, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "wallet_or_account", "wallet", false, 4, null);
        EventParamsList.put$default(eventParamsList, "wallet_type", activityC17337fBp.AEQbTJ(abstractC12784ctX), false, 4, null);
        return Unit.INSTANCE;
    }

    public final java.lang.String AEQbTJ(AbstractC12784ctX abstractC12784ctX) {
        int i = Activity.OLrzqt[abstractC12784ctX.fJNWhG().ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? TxToastCheckRes.EOA_ADDRESS_TYPE : "watch_only" : "hardware" : "mpc" : "aa";
    }

    private final void KWHzl(final AbstractC12784ctX abstractC12784ctX) {
        C18521fjv.TaskDescription taskDescription = C18521fjv.Companion;
        java.lang.String strEZpvd = abstractC12784ctX.EZpvd();
        java.lang.String string = getString(C13754dXa.FragmentManager.aappFQ);
        Intrinsics.checkNotNullExpressionValue(string, "");
        C18521fjv c18521fjvKWHzl = taskDescription.KWHzl(0, (20 & 2) != 0 ? "" : strEZpvd, (20 & 4) != 0 ? "" : null, (20 & 8) != 0 ? "" : string, (20 & 16) != 0 ? "" : null, (20 & 32) == 0 ? abstractC12784ctX.AuCTel() : "");
        c18521fjvKWHzl.show(getSupportFragmentManager(), ActivityC17337fBp.class.getName());
        c18521fjvKWHzl.KWHzl(new Function1() { // from class: o.fBJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC17337fBp.AEQbTJ(this.EZpvd, abstractC12784ctX, (java.lang.String) obj);
            }
        });
    }

    public static final Unit AEQbTJ(final ActivityC17337fBp activityC17337fBp, AbstractC12784ctX abstractC12784ctX, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        activityC17337fBp.copydefault().KWHzl();
        AbstractC58260yxt abstractC58260yxtKWHzl = C58156yvv.KWHzl(abstractC12784ctX.copydefault(str), activityC17337fBp);
        final Function1 function1 = new Function1() { // from class: o.fBR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC17337fBp.copydefault(this.AEQbTJ, (java.lang.Integer) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.fBY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                ActivityC17337fBp.AYXKKw(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.fBV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC17337fBp.copydefault(this.OLrzqt, (java.lang.Throwable) obj);
            }
        };
        activityC17337fBp.addDisposable(abstractC58260yxtKWHzl.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.fBW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                ActivityC17337fBp.gEmmrt(function12, obj);
            }
        }));
        return Unit.INSTANCE;
    }

    public static final void AYXKKw(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(ActivityC17337fBp activityC17337fBp, java.lang.Integer num) {
        activityC17337fBp.copydefault().OLrzqt();
        activityC17337fBp.copydefault().copydefault();
        return Unit.INSTANCE;
    }

    public static final void gEmmrt(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(ActivityC17337fBp activityC17337fBp, java.lang.Throwable th) {
        activityC17337fBp.dismissLoading();
        pUU.copydefault(activityC17337fBp.getTAG(), "onEditRootWalletNameClick rename error message :" + th.getMessage());
        return Unit.INSTANCE;
    }

    public final void AEQbTJ() {
        Application application = this.AEQbTJ;
        if (application != null) {
            AkhnZx().KWHzl(application);
        }
        this.AEQbTJ = null;
    }

    public final MyItemTouchHelper AhwBna() {
        return (MyItemTouchHelper) this.gEmmrt.getValue();
    }

    public static final MyItemTouchHelper AkhnZx(ActivityC17337fBp activityC17337fBp) {
        return new MyItemTouchHelper(activityC17337fBp.new TaskDescription());
    }

    private final void fARcdN() {
        AbstractC16442ejx abstractC16442ejx = this.EZpvd;
        AbstractC16442ejx abstractC16442ejx2 = null;
        if (abstractC16442ejx == null) {
            Intrinsics.gEmmrt("");
            abstractC16442ejx = null;
        }
        abstractC16442ejx.OLrzqt.setLayoutManager(new SafeLinearLayoutManager(this));
        MyItemTouchHelper myItemTouchHelperAhwBna = AhwBna();
        AbstractC16442ejx abstractC16442ejx3 = this.EZpvd;
        if (abstractC16442ejx3 == null) {
            Intrinsics.gEmmrt("");
            abstractC16442ejx3 = null;
        }
        myItemTouchHelperAhwBna.attachToRecyclerView(abstractC16442ejx3.OLrzqt);
        AbstractC16442ejx abstractC16442ejx4 = this.EZpvd;
        if (abstractC16442ejx4 == null) {
            Intrinsics.gEmmrt("");
            abstractC16442ejx4 = null;
        }
        abstractC16442ejx4.OLrzqt.addOnChildAttachStateChangeListener(djBIcL());
        AbstractC16442ejx abstractC16442ejx5 = this.EZpvd;
        if (abstractC16442ejx5 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC16442ejx2 = abstractC16442ejx5;
        }
        abstractC16442ejx2.OLrzqt.setItemAnimator(new OkDefaultItemAnimator());
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (this.DbNXlk) {
            copydefault().copydefault();
        }
    }

    /* JADX INFO: renamed from: o.fBp$Application */
    public static final class Application implements fDL<java.lang.Object> {
        public boolean AEQbTJ;
        public final InterfaceC56387yDm EZpvd;
        public final AbstractC12784ctX KWHzl;
        public java.util.Map<java.lang.String, ? extends EIP7702WalletStatus> OLrzqt;
        public boolean copydefault;

        @Override // o.fDL
        public boolean AEQbTJ() {
            return true;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AbstractC12784ctX EZpvd() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean KWHzl() {
            return this.AEQbTJ;
        }

        public Application(@NotNull AbstractC12784ctX abstractC12784ctX, boolean z, boolean z2, java.util.Map<java.lang.String, ? extends EIP7702WalletStatus> map) {
            Intrinsics.checkNotNullParameter(abstractC12784ctX, "");
            this.KWHzl = abstractC12784ctX;
            this.copydefault = z;
            this.AEQbTJ = z2;
            this.OLrzqt = map;
            this.EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.fBX
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return ActivityC17337fBp.Application.copydefault(this.KWHzl);
                }
            });
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 o.ctX)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? true : (r2v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0005: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? false : (r3v0 boolean))
  (r4v0 java.util.Map)
 A[MD:(o.ctX, boolean, boolean, java.util.Map<java.lang.String, ? extends com.okinc.business.defi.wallet.eip7702.data.model.EIP7702WalletStatus>):void (m)] (LINE:407) call: o.fBp.Application.<init>(o.ctX, boolean, boolean, java.util.Map):void type: THIS */
        public /* synthetic */ Application(AbstractC12784ctX abstractC12784ctX, boolean z, boolean z2, java.util.Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(abstractC12784ctX, (i & 2) != 0 ? true : z, (i & 4) != 0 ? false : z2, map);
        }

        public final java.util.ArrayList<java.lang.Object> copydefault() {
            return (java.util.ArrayList) this.EZpvd.getValue();
        }

        public static final java.util.ArrayList copydefault(Application application) {
            EIP7702WalletStatus eIP7702WalletStatus;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.List<AbstractC12782ctV> listKWHzl = application.KWHzl.KWHzl();
            java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(listKWHzl, 10));
            for (AbstractC12782ctV abstractC12782ctV : listKWHzl) {
                java.util.Map<java.lang.String, ? extends EIP7702WalletStatus> map = application.OLrzqt;
                if (map == null || (eIP7702WalletStatus = map.get(abstractC12782ctV.DbNXlk())) == null) {
                    eIP7702WalletStatus = EIP7702WalletStatus.Unknown;
                }
                arrayList2.add(new eCF(abstractC12782ctV, eIP7702WalletStatus));
            }
            arrayList.addAll(arrayList2);
            return arrayList;
        }

        @Override // o.fDL
        public int OLrzqt() {
            return copydefault().size();
        }

        @Override // o.fDL
        public java.lang.Object copydefault(int i) {
            java.lang.Object obj = copydefault().get(i);
            Intrinsics.checkNotNullExpressionValue(obj, "");
            return obj;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void fetchVPNInfo() {
        java.lang.Object systemService = getSystemService("vibrator");
        Intrinsics.copydefault(systemService, "");
        android.os.Vibrator vibrator = (android.os.Vibrator) systemService;
        if (vibrator.hasVibrator()) {
            vibrator.vibrate(100L, new AudioAttributes.Builder().build());
        }
    }

    public static final float EZpvd() {
        return C33052mpF.px2dp$default(32, (android.content.Context) null, 1, (java.lang.Object) null);
    }

    public final float valueOf() {
        return ((java.lang.Number) this.values.getValue()).floatValue();
    }

    public final void AEQbTJ(android.view.View view, boolean z) {
        if (view != null) {
            if (z) {
                view.setElevation(valueOf());
                view.setTranslationZ(valueOf());
                view.setScaleX(1.03f);
                view.setScaleY(1.03f);
                view.setBackground(C33070mpX.KWHzl(C52761wXj.Activity.OLrzqt));
                return;
            }
            view.setElevation(0.0f);
            view.setTranslationZ(0.0f);
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
            view.setBackground(null);
        }
    }

    /* JADX INFO: renamed from: o.fBp$TaskDescription */
    public final class TaskDescription extends MyItemTouchHelper.SimpleCallback {
        public android.util.Range<java.lang.Integer> AEQbTJ;
        public int AYXKKw;
        public int AkhnZx;
        public int EZpvd;
        public int KWHzl;
        public RecyclerView.ViewHolder OLrzqt;
        public int copydefault;
        public boolean djBIcL;
        public int fetchVPNInfo;
        public int gEmmrt;
        public final OrientationHelper valueOf;

        @Override // androidx.recyclerview.widget.MyItemTouchHelper.Callback
        public boolean isItemViewSwipeEnabled() {
            return false;
        }

        @Override // androidx.recyclerview.widget.MyItemTouchHelper.Callback
        public boolean isLongPressDragEnabled() {
            return false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.recyclerview.widget.MyItemTouchHelper.Callback
        public boolean onMoveToTarget(@NotNull RecyclerView recyclerView, @NotNull RecyclerView.ViewHolder viewHolder) {
            Intrinsics.checkNotNullParameter(recyclerView, "");
            Intrinsics.checkNotNullParameter(viewHolder, "");
            this.gEmmrt = -1;
            this.EZpvd = -1;
            this.KWHzl = -1;
            this.copydefault = -1;
            this.OLrzqt = null;
            this.AEQbTJ = null;
            return false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.recyclerview.widget.MyItemTouchHelper.Callback
        public void onSwiped(@NotNull RecyclerView.ViewHolder viewHolder, int i) {
            Intrinsics.checkNotNullParameter(viewHolder, "");
        }

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public TaskDescription() {
            super(3, 0);
            this.EZpvd = -1;
            this.gEmmrt = -1;
            this.copydefault = -1;
            this.KWHzl = -1;
            this.AkhnZx = -1;
            this.fetchVPNInfo = -1;
            AbstractC16442ejx abstractC16442ejx = ActivityC17337fBp.this.EZpvd;
            if (abstractC16442ejx == null) {
                Intrinsics.gEmmrt("");
                abstractC16442ejx = null;
            }
            this.valueOf = OrientationHelper.createVerticalHelper(abstractC16442ejx.OLrzqt.getLayoutManager());
        }

        /* JADX WARN: Code restructure failed: missing block: B:25:0x0121, code lost:
        
            if (r0.contains(java.lang.Integer.valueOf(r13)) == false) goto L26;
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x01e2, code lost:
        
            if (r0.contains(java.lang.Integer.valueOf(r13)) == false) goto L45;
         */
        @Override // androidx.recyclerview.widget.MyItemTouchHelper.Callback
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public boolean onMove(@NotNull RecyclerView recyclerView, @NotNull RecyclerView.ViewHolder viewHolder, @NotNull RecyclerView.ViewHolder viewHolder2) {
            int iEZpvd;
            android.util.Range<java.lang.Integer> range;
            android.util.Range<java.lang.Integer> range2;
            Intrinsics.checkNotNullParameter(recyclerView, "");
            Intrinsics.checkNotNullParameter(viewHolder, "");
            Intrinsics.checkNotNullParameter(viewHolder2, "");
            int absoluteAdapterPosition = viewHolder.getAbsoluteAdapterPosition();
            int bindingAdapterPosition = viewHolder2.getBindingAdapterPosition();
            pUU.copydefault("fcj  originalPosition " + absoluteAdapterPosition + " targetPosition " + bindingAdapterPosition);
            int[] iArrCopydefault = ActivityC17337fBp.this.AkhnZx().copydefault(absoluteAdapterPosition);
            int[] iArrCopydefault2 = ActivityC17337fBp.this.AkhnZx().copydefault(bindingAdapterPosition);
            if (iArrCopydefault[0] == iArrCopydefault2[0] && iArrCopydefault[1] >= 0 && iArrCopydefault2[1] >= 0) {
                fDL<java.lang.Object> fdlAEQbTJ = ActivityC17337fBp.this.AkhnZx().AEQbTJ(iArrCopydefault[0]);
                Intrinsics.copydefault(fdlAEQbTJ, "");
                Collections.swap(((Application) fdlAEQbTJ).copydefault(), iArrCopydefault[1], iArrCopydefault2[1]);
                ActivityC17337fBp.this.AkhnZx().notifyItemMoved(absoluteAdapterPosition, bindingAdapterPosition);
                ActivityC17337fBp.this.fetchVPNInfo();
                return true;
            }
            if (iArrCopydefault[1] == -1 && ActivityC17337fBp.this.AkhnZx().AEQbTJ(iArrCopydefault2[0]).AEQbTJ()) {
                this.EZpvd = absoluteAdapterPosition;
                this.KWHzl = iArrCopydefault[0];
                this.AYXKKw = this.valueOf.getDecoratedMeasurement(viewHolder.itemView);
                this.copydefault = iArrCopydefault2[0];
                pUU.copydefault("fcj 1 originalPosition " + absoluteAdapterPosition + " globalTargetPosition " + this.gEmmrt + " " + iArrCopydefault2[1] + " " + this.AEQbTJ);
                if (iArrCopydefault2[1] == -1) {
                    pUU.copydefault("fcj targetArray[1] originalPosition " + absoluteAdapterPosition + " globalTargetPosition " + this.gEmmrt);
                    int iOLrzqt = bindingAdapterPosition > absoluteAdapterPosition ? ActivityC17337fBp.this.AkhnZx().AEQbTJ(iArrCopydefault2[0]).OLrzqt() + bindingAdapterPosition : bindingAdapterPosition;
                    if (iOLrzqt != this.gEmmrt) {
                        android.util.Range<java.lang.Integer> range3 = this.AEQbTJ;
                        if (range3 != null) {
                            Intrinsics.copydefault(range3);
                        }
                        this.gEmmrt = iOLrzqt;
                        pUU.copydefault("fcj 1 in originalPosition " + absoluteAdapterPosition + " globalTargetPosition " + iOLrzqt);
                        if (iOLrzqt > absoluteAdapterPosition) {
                            range2 = new android.util.Range<>(java.lang.Integer.valueOf(absoluteAdapterPosition + 1), java.lang.Integer.valueOf(this.gEmmrt - 2));
                        } else {
                            range2 = new android.util.Range<>(java.lang.Integer.valueOf(this.gEmmrt + 2), java.lang.Integer.valueOf(absoluteAdapterPosition - 1));
                        }
                        this.AEQbTJ = range2;
                        ActivityC17337fBp.this.fetchVPNInfo();
                        copydefault(recyclerView);
                        Collections.swap(ActivityC17337fBp.this.AkhnZx().copydefault(), iArrCopydefault[0], iArrCopydefault2[0]);
                        EZpvd(absoluteAdapterPosition, iOLrzqt);
                        AEQbTJ(recyclerView);
                        int i = this.gEmmrt;
                        if (i != -1) {
                            RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(i);
                            this.OLrzqt = viewHolderFindViewHolderForAdapterPosition;
                            if (viewHolderFindViewHolderForAdapterPosition == null) {
                                pUU.copydefault("fcj target is null");
                                ActivityC17337fBp.this.AhwBna().recoverAnimation = false;
                            }
                        }
                        return false;
                    }
                } else {
                    if (bindingAdapterPosition < absoluteAdapterPosition) {
                        iEZpvd = ActivityC17337fBp.this.AkhnZx().EZpvd(iArrCopydefault2[0]);
                    } else {
                        iEZpvd = ActivityC17337fBp.this.AkhnZx().EZpvd(iArrCopydefault2[0]) + ActivityC17337fBp.this.AkhnZx().AEQbTJ(iArrCopydefault2[0]).OLrzqt();
                    }
                    if (iEZpvd != this.gEmmrt) {
                        android.util.Range<java.lang.Integer> range4 = this.AEQbTJ;
                        if (range4 != null) {
                            Intrinsics.copydefault(range4);
                        }
                        this.gEmmrt = iEZpvd;
                        if (iEZpvd > absoluteAdapterPosition) {
                            range = new android.util.Range<>(java.lang.Integer.valueOf(absoluteAdapterPosition + 1), java.lang.Integer.valueOf(this.gEmmrt - 2));
                        } else {
                            range = new android.util.Range<>(java.lang.Integer.valueOf(this.gEmmrt + 2), java.lang.Integer.valueOf(absoluteAdapterPosition - 1));
                        }
                        this.AEQbTJ = range;
                        ActivityC17337fBp.this.fetchVPNInfo();
                        copydefault(recyclerView);
                        Collections.swap(ActivityC17337fBp.this.AkhnZx().copydefault(), iArrCopydefault[0], iArrCopydefault2[0]);
                        EZpvd(absoluteAdapterPosition, iEZpvd);
                        AEQbTJ(recyclerView);
                        int i2 = this.gEmmrt;
                        if (i2 != -1) {
                            RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition2 = recyclerView.findViewHolderForAdapterPosition(i2);
                            this.OLrzqt = viewHolderFindViewHolderForAdapterPosition2;
                            if (viewHolderFindViewHolderForAdapterPosition2 == null) {
                                ActivityC17337fBp.this.AhwBna().recoverAnimation = false;
                            }
                        }
                        return false;
                    }
                }
                if (this.gEmmrt == bindingAdapterPosition) {
                    this.gEmmrt = -1;
                    this.EZpvd = -1;
                    this.KWHzl = -1;
                    this.copydefault = -1;
                    this.OLrzqt = null;
                    this.AEQbTJ = null;
                }
            }
            return false;
        }

        public final void copydefault(RecyclerView recyclerView) {
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            if (layoutManager == null || layoutManager.getChildCount() <= 0) {
                return;
            }
            android.view.View childAt = layoutManager.getChildAt(0);
            Intrinsics.copydefault(childAt);
            RecyclerView.ViewHolder viewHolderFindContainingViewHolder = recyclerView.findContainingViewHolder(childAt);
            Intrinsics.copydefault(viewHolderFindContainingViewHolder);
            this.AkhnZx = viewHolderFindContainingViewHolder.getBindingAdapterPosition();
            this.fetchVPNInfo = childAt.getTop();
        }

        public final void AEQbTJ(RecyclerView recyclerView) {
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            Intrinsics.copydefault(layoutManager, "");
            ((SafeLinearLayoutManager) layoutManager).scrollToPositionWithOffset(this.AkhnZx, this.fetchVPNInfo);
        }

        public final void EZpvd(int i, int i2) {
            if (i < i2) {
                int i3 = ActivityC17337fBp.this.AkhnZx().copydefault(i2)[0];
                Intrinsics.copydefault(ActivityC17337fBp.this.AkhnZx().copydefault());
                if (i3 < r1.size() - 1) {
                    ActivityC17337fBp.this.AkhnZx().notifyItemMoved(i + 1, i2 + 1);
                    ActivityC17337fBp.this.AkhnZx().notifyItemMoved(i, i2);
                    return;
                } else {
                    ActivityC17337fBp.this.AkhnZx().notifyItemMoved(i + 1, i2);
                    ActivityC17337fBp.this.AkhnZx().notifyItemMoved(i, i2);
                    return;
                }
            }
            int i4 = ActivityC17337fBp.this.AkhnZx().copydefault(i)[0];
            Intrinsics.copydefault(ActivityC17337fBp.this.AkhnZx().copydefault());
            if (i4 < r1.size() - 1) {
                ActivityC17337fBp.this.AkhnZx().notifyItemMoved(i, i2);
                ActivityC17337fBp.this.AkhnZx().notifyItemMoved(i + 1, i2 + 1);
            } else {
                ActivityC17337fBp.this.AkhnZx().notifyItemMoved(i - 1, i2);
                ActivityC17337fBp.this.AkhnZx().notifyItemMoved(i, i2);
            }
        }

        @Override // androidx.recyclerview.widget.MyItemTouchHelper.Callback
        public void onMoved(@NotNull RecyclerView recyclerView, @NotNull RecyclerView.ViewHolder viewHolder, int i, @NotNull RecyclerView.ViewHolder viewHolder2, int i2, int i3, int i4) {
            Intrinsics.checkNotNullParameter(recyclerView, "");
            Intrinsics.checkNotNullParameter(viewHolder, "");
            Intrinsics.checkNotNullParameter(viewHolder2, "");
            if (this.gEmmrt == -1) {
                super.onMoved(recyclerView, viewHolder, i, viewHolder2, i2, i3, i4);
            } else if (this.djBIcL) {
                this.djBIcL = false;
                AEQbTJ(viewHolder, viewHolder2);
            }
        }

        public final void AEQbTJ(RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2) {
            int decoratedStart;
            if (this.gEmmrt != -1) {
                RecyclerView.LayoutManager layoutManager = this.valueOf.getLayoutManager();
                Intrinsics.copydefault(layoutManager, "");
                SafeLinearLayoutManager safeLinearLayoutManager = (SafeLinearLayoutManager) layoutManager;
                ActivityC17337fBp activityC17337fBp = ActivityC17337fBp.this;
                int layoutPosition = viewHolder2.getLayoutPosition();
                int layoutPosition2 = viewHolder.getLayoutPosition();
                int iEZpvd = activityC17337fBp.AkhnZx().EZpvd(activityC17337fBp.AkhnZx().copydefault(layoutPosition)[0]);
                if (layoutPosition > layoutPosition2) {
                    decoratedStart = this.valueOf.getDecoratedEnd(viewHolder2.itemView) - this.AYXKKw;
                } else {
                    decoratedStart = this.valueOf.getDecoratedStart(viewHolder2.itemView);
                }
                safeLinearLayoutManager.scrollToPositionWithOffset(iEZpvd, decoratedStart);
                this.gEmmrt = -1;
                this.EZpvd = -1;
                this.KWHzl = -1;
                this.copydefault = -1;
                this.OLrzqt = null;
                this.AEQbTJ = null;
            }
        }

        @Override // androidx.recyclerview.widget.MyItemTouchHelper.Callback
        public int interpolateOutOfBoundsScroll(@NotNull RecyclerView recyclerView, int i, int i2, int i3, long j) {
            Intrinsics.checkNotNullParameter(recyclerView, "");
            int iInterpolateOutOfBoundsScroll = super.interpolateOutOfBoundsScroll(recyclerView, i, i2, i3, j);
            if (1 <= iInterpolateOutOfBoundsScroll && iInterpolateOutOfBoundsScroll < 10) {
                return 10;
            }
            if (iInterpolateOutOfBoundsScroll <= -9 || iInterpolateOutOfBoundsScroll >= -1) {
                return iInterpolateOutOfBoundsScroll;
            }
            return -10;
        }

        @Override // androidx.recyclerview.widget.MyItemTouchHelper.Callback
        public void clearView(@NotNull RecyclerView recyclerView, @NotNull RecyclerView.ViewHolder viewHolder) {
            Intrinsics.checkNotNullParameter(recyclerView, "");
            Intrinsics.checkNotNullParameter(viewHolder, "");
            int childCount = recyclerView.getChildCount();
            for (int i = 0; i < childCount; i++) {
                ActivityC17337fBp.this.AEQbTJ(recyclerView.getChildAt(i), false);
            }
            try {
                ActivityC17337fBp.this.AEQbTJ();
            } catch (java.lang.Exception e) {
                e.printStackTrace();
            }
            if (!ActivityC17337fBp.this.AhwBna().recoverAnimation) {
                ActivityC17337fBp.this.AhwBna().recoverAnimation = true;
            } else {
                super.clearView(recyclerView, viewHolder);
            }
        }

        @Override // androidx.recyclerview.widget.MyItemTouchHelper.Callback
        public boolean canDropOver(@NotNull RecyclerView recyclerView, @NotNull RecyclerView.ViewHolder viewHolder, @NotNull RecyclerView.ViewHolder viewHolder2) {
            Intrinsics.checkNotNullParameter(recyclerView, "");
            Intrinsics.checkNotNullParameter(viewHolder, "");
            Intrinsics.checkNotNullParameter(viewHolder2, "");
            int bindingAdapterPosition = viewHolder.getBindingAdapterPosition();
            int bindingAdapterPosition2 = viewHolder2.getBindingAdapterPosition();
            int[] iArrCopydefault = ActivityC17337fBp.this.AkhnZx().copydefault(bindingAdapterPosition);
            int[] iArrCopydefault2 = ActivityC17337fBp.this.AkhnZx().copydefault(bindingAdapterPosition2);
            return (iArrCopydefault[0] == iArrCopydefault2[0] && iArrCopydefault[1] >= 0 && iArrCopydefault2[1] >= 0) || iArrCopydefault[1] == -1;
        }

        @Override // androidx.recyclerview.widget.MyItemTouchHelper.Callback
        public void onChildDraw(@NotNull android.graphics.Canvas canvas, @NotNull RecyclerView recyclerView, @NotNull RecyclerView.ViewHolder viewHolder, float f, float f2, int i, boolean z) {
            Intrinsics.checkNotNullParameter(canvas, "");
            Intrinsics.checkNotNullParameter(recyclerView, "");
            Intrinsics.checkNotNullParameter(viewHolder, "");
            RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(viewHolder.getBindingAdapterPosition() - 1);
            RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition2 = recyclerView.findViewHolderForAdapterPosition(viewHolder.getBindingAdapterPosition() + 1);
            super.onChildDraw(canvas, recyclerView, viewHolder, f, ((!((f2 > 0.0f ? 1 : (f2 == 0.0f ? 0 : -1)) < 0) || viewHolderFindViewHolderForAdapterPosition == null || canDropOver(recyclerView, viewHolder, viewHolderFindViewHolderForAdapterPosition)) && (!(f2 > 0.0f) || viewHolderFindViewHolderForAdapterPosition2 == null || canDropOver(recyclerView, viewHolder, viewHolderFindViewHolderForAdapterPosition2))) ? f2 : 0.0f, i, z);
        }

        @Override // androidx.recyclerview.widget.MyItemTouchHelper.Callback
        public void onDragRelease(@NotNull RecyclerView.ViewHolder viewHolder) {
            Intrinsics.checkNotNullParameter(viewHolder, "");
            super.onDragRelease(viewHolder);
            this.gEmmrt = -1;
            this.EZpvd = -1;
            this.KWHzl = -1;
            this.copydefault = -1;
            this.OLrzqt = null;
            this.AEQbTJ = null;
            this.djBIcL = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void fJNWhG() {
        final android.view.View childAt;
        if (AYXKKw()) {
            return;
        }
        C13912dbY c13912dbY = C13912dbY.copydefault;
        if (c13912dbY.values()) {
            AbstractC16442ejx abstractC16442ejx = this.EZpvd;
            if (abstractC16442ejx == null) {
                Intrinsics.gEmmrt("");
                abstractC16442ejx = null;
            }
            RecyclerView.LayoutManager layoutManager = abstractC16442ejx.OLrzqt.getLayoutManager();
            if (layoutManager == null || (childAt = layoutManager.getChildAt(1)) == null) {
                return;
            }
            c13912dbY.KWHzl(false);
            childAt.post(new java.lang.Runnable() { // from class: o.fBI
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    ActivityC17337fBp.copydefault(this.OLrzqt, childAt);
                }
            });
        }
    }

    public static final void copydefault(final ActivityC17337fBp activityC17337fBp, android.view.View view) {
        C52812wZg c52812wZg = new C52812wZg(activityC17337fBp);
        AppCompatImageView appCompatImageView = (AppCompatImageView) view.findViewById(C13754dXa.ActionBar.sEcTXd);
        if (appCompatImageView == null) {
            return;
        }
        C52812wZg.StateListAnimator stateListAnimator = new C52812wZg.StateListAnimator(appCompatImageView);
        stateListAnimator.EZpvd(1);
        stateListAnimator.copydefault(0);
        stateListAnimator.AEQbTJ(0);
        stateListAnimator.KWHzl(0);
        stateListAnimator.OLrzqt(0);
        stateListAnimator.AEQbTJ(C55298xhM.dp$default(24.0f, (android.content.Context) null, 1, (java.lang.Object) null));
        stateListAnimator.AEQbTJ(activityC17337fBp.getString(C13754dXa.FragmentManager.bindRcKey));
        stateListAnimator.OLrzqt(activityC17337fBp.getString(C13754dXa.FragmentManager.ActivityResultLauncherKt));
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(stateListAnimator);
        c52812wZg.EZpvd(arrayList);
        c52812wZg.OLrzqt(3);
        c52812wZg.KWHzl(true);
        android.widget.TextView textViewValues = c52812wZg.values();
        if (textViewValues != null) {
            textViewValues.setVisibility(arrayList.size() <= 1 ? 8 : 0);
        }
        C52794wYp c52794wYpAkhnZx = c52812wZg.AkhnZx();
        if (c52794wYpAkhnZx != null) {
            c52794wYpAkhnZx.setVisibility(8);
        }
        c52812wZg.KWHzl(new Function0() { // from class: o.fBH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return ActivityC17337fBp.isConnected(this.OLrzqt);
            }
        });
        c52812wZg.fARcdN();
    }

    public static final Unit isConnected(ActivityC17337fBp activityC17337fBp) {
        AbstractC16442ejx abstractC16442ejx = activityC17337fBp.EZpvd;
        if (abstractC16442ejx == null) {
            Intrinsics.gEmmrt("");
            abstractC16442ejx = null;
        }
        abstractC16442ejx.OLrzqt.removeOnChildAttachStateChangeListener(activityC17337fBp.djBIcL());
        return Unit.INSTANCE;
    }

    public final boolean AYXKKw() {
        if (this.djBIcL == null) {
            this.djBIcL = java.lang.Boolean.valueOf(Intrinsics.EZpvd((java.lang.Object) ABTestManager.getValue$default(ABTestManager.AEQbTJ, "e2e_disable_wallet_manage_edit_pop_up", null, 2, null), (java.lang.Object) DebugKt.DEBUG_PROPERTY_VALUE_ON));
        }
        return Intrinsics.EZpvd(this.djBIcL, java.lang.Boolean.TRUE);
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }
}
