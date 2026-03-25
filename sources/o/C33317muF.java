package o;

import android.view.View;
import androidx.lifecycle.Lifecycle;
import com.airbnb.lottie.LottieDrawable;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;
import com.okinc.core.ok_app.homepage.pro.MainActivity;
import com.okinc.rxutils.RxBus;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C33160mrH;
import o.InterfaceC43294rma;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.muF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C33317muF extends AbstractC33351mun {
    public static final Activity Companion = new Activity(null);
    public static final int valueOf = 8;
    public final MainActivity AYXKKw;
    public int AhwBna;
    public final java.util.Map<InterfaceC33220msO, android.view.MenuItem> AkhnZx;
    public final InterfaceC56387yDm DbNXlk;
    public final InterfaceC56387yDm djBIcL;
    public java.util.List<? extends InterfaceC33220msO> fetchVPNInfo;
    public final java.util.Map<android.view.MenuItem, java.lang.Integer> isConnected;
    public final int values;

    public static final boolean EZpvd(android.view.View view) {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC33351mun
    public int valueOf() {
        return this.values;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33317muF(@NotNull MainActivity mainActivity) {
        super(mainActivity);
        Intrinsics.checkNotNullParameter(mainActivity, "");
        this.AYXKKw = mainActivity;
        this.isConnected = new LinkedHashMap();
        this.AkhnZx = new LinkedHashMap();
        this.AhwBna = -1;
        this.values = 1;
        this.djBIcL = C56392yDr.copydefault(new Function0() { // from class: o.muI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C33317muF.fetchVPNInfo();
            }
        });
        this.DbNXlk = C56392yDr.copydefault(new Function0() { // from class: o.muK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C33317muF.AkhnZx();
            }
        });
        this.fetchVPNInfo = isConnected();
        pUU.KWHzl("ProMainActivityDelegate", "Listen to tab bar update.");
        AbstractC58185ywX<java.lang.String> abstractC58185ywXAEQbTJ = RxBus.AEQbTJ("event_tab_bar_update");
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        C33527myD.subscribeByUI$default(C58156yvv.EZpvd(abstractC58185ywXAEQbTJ, mainActivity), (Function1) null, (Function0) null, new ActionBar(new WeakReference(this)), 3, (java.lang.Object) null);
    }

    /* JADX INFO: renamed from: o.muF$Activity */
    /* JADX INFO: loaded from: classes18.dex */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.muF.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public final java.util.List<InterfaceC33220msO> values() {
        return (java.util.List) this.djBIcL.getValue();
    }

    public static final java.util.List fetchVPNInfo() {
        java.util.List listKWHzl = C43251rlk.KWHzl(C56524yIo.AEQbTJ(InterfaceC33220msO.class));
        return listKWHzl == null ? yDY.AhwBna() : listKWHzl;
    }

    public final java.util.List<InterfaceC33220msO> isConnected() {
        java.util.List listGEmmrt;
        java.lang.Object next;
        if (C33216msK.KWHzl.KWHzl()) {
            listGEmmrt = yDY.gEmmrt(0, 3, 2, 5, 4);
        } else {
            listGEmmrt = yDY.gEmmrt(0, 1, 2, 6, 4);
        }
        java.util.List<InterfaceC33220msO> listValues = values();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : listValues) {
            if (((InterfaceC33220msO) obj).KWHzl()) {
                arrayList.add(obj);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it = listGEmmrt.iterator();
        while (it.hasNext()) {
            int iIntValue = ((java.lang.Number) it.next()).intValue();
            java.util.Iterator it2 = arrayList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
                if (((InterfaceC33220msO) next).djBIcL() == iIntValue) {
                    break;
                }
            }
            InterfaceC33220msO interfaceC33220msO = (InterfaceC33220msO) next;
            if (interfaceC33220msO != null) {
                arrayList2.add(interfaceC33220msO);
            }
        }
        return arrayList2;
    }

    public final java.util.HashMap<java.lang.String, InterfaceC33220msO> DbNXlk() {
        return (java.util.HashMap) this.DbNXlk.getValue();
    }

    public static final java.util.HashMap AkhnZx() {
        return new java.util.HashMap();
    }

    /* JADX INFO: renamed from: o.muF$ActionBar */
    /* JADX INFO: loaded from: classes18.dex */
    public static final class ActionBar implements Function1<java.lang.String, Unit> {
        public final Reference<C33317muF> EZpvd;

        public ActionBar(@NotNull Reference<C33317muF> reference) {
            Intrinsics.checkNotNullParameter(reference, "");
            this.EZpvd = reference;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(java.lang.String str) {
            KWHzl(str);
            return Unit.INSTANCE;
        }

        public void KWHzl(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            C33317muF c33317muF = this.EZpvd.get();
            if (c33317muF == null || c33317muF.AYXKKw.isFinishing() || c33317muF.AYXKKw.isDestroyed()) {
                return;
            }
            pUU.KWHzl("ProMainActivityDelegate", "Receive tab bar update event.");
            c33317muF.fetchVPNInfo = c33317muF.isConnected();
            c33317muF.AhwBna = 0;
            c33317muF.AhwBna();
            android.content.Intent intentCopydefault = c33317muF.copydefault();
            Intrinsics.checkNotNullExpressionValue(intentCopydefault, "");
            c33317muF.OLrzqt(intentCopydefault);
        }
    }

    @Override // o.AbstractC33351mun
    public void AEQbTJ(@NotNull android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "");
        super.AEQbTJ(bundle);
        this.AhwBna = bundle.getInt("current_index");
    }

    @Override // o.AbstractC33351mun
    public void AhwBna() {
        gEmmrt();
        this.isConnected.clear();
        this.AkhnZx.clear();
        OLrzqt().setContentDescription("AppTabbar");
        int i = 0;
        for (java.lang.Object obj : this.fetchVPNInfo) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            InterfaceC33220msO interfaceC33220msO = (InterfaceC33220msO) obj;
            android.view.MenuItem menuItemCopydefault = interfaceC33220msO.copydefault(OLrzqt());
            this.isConnected.put(menuItemCopydefault, java.lang.Integer.valueOf(i));
            this.AkhnZx.put(interfaceC33220msO, menuItemCopydefault);
            InterfaceC55083xdJ interfaceC55083xdJEZpvd = interfaceC33220msO.EZpvd(this.AYXKKw);
            if (interfaceC55083xdJEZpvd != null) {
                OLrzqt().setFloatingActionView(interfaceC55083xdJEZpvd, menuItemCopydefault.getItemId());
            }
            i++;
        }
        for (InterfaceC33220msO interfaceC33220msO2 : values()) {
            java.util.Iterator<T> it = interfaceC33220msO2.AEQbTJ().iterator();
            while (it.hasNext()) {
                DbNXlk().put((java.lang.String) it.next(), interfaceC33220msO2);
            }
        }
        int size = OLrzqt().getMenu().size();
        for (int i2 = 0; i2 < size; i2++) {
            OLrzqt().findViewById(OLrzqt().getMenu().getItem(i2).getItemId()).setOnLongClickListener(new View.OnLongClickListener() { // from class: o.muH
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(android.view.View view) {
                    return C33317muF.EZpvd(view);
                }
            });
        }
        fIwbmz();
    }

    private final void fIwbmz() {
        final BottomNavigationView.OnNavigationItemSelectedListener onNavigationItemSelectedListener = new BottomNavigationView.OnNavigationItemSelectedListener() { // from class: o.muJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.google.android.material.navigation.NavigationBarView.OnItemSelectedListener
            public final boolean onNavigationItemSelected(android.view.MenuItem menuItem) {
                return C33317muF.EZpvd(this.EZpvd, menuItem);
            }
        };
        OLrzqt().setOnNavigationItemSelectedListener(onNavigationItemSelectedListener);
        OLrzqt().setOnItemReselectedListener(new NavigationBarView.OnItemReselectedListener() { // from class: o.muG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.google.android.material.navigation.NavigationBarView.OnItemReselectedListener
            public final void onNavigationItemReselected(android.view.MenuItem menuItem) {
                C33317muF.copydefault(this.copydefault, onNavigationItemSelectedListener, menuItem);
            }
        });
    }

    public static final boolean EZpvd(C33317muF c33317muF, android.view.MenuItem menuItem) {
        Intrinsics.checkNotNullParameter(menuItem, "");
        RxBus.KWHzl("BottomNavigationClick");
        c33317muF.EZpvd();
        java.lang.Integer num = c33317muF.isConnected.get(menuItem);
        Intrinsics.copydefault(num);
        int iIntValue = num.intValue();
        if (iIntValue == c33317muF.AhwBna) {
            return false;
        }
        try {
            boolean zOnNavigationItemSelected = c33317muF.fetchVPNInfo.get(iIntValue).EZpvd().onNavigationItemSelected(menuItem);
            if (zOnNavigationItemSelected) {
                int i = c33317muF.AhwBna;
                if (i >= 0 && i < c33317muF.fetchVPNInfo.size()) {
                    InterfaceC33220msO interfaceC33220msO = c33317muF.fetchVPNInfo.get(c33317muF.AhwBna);
                    C55089xdP c55089xdPOLrzqt = c33317muF.OLrzqt();
                    android.view.Menu menu = c33317muF.OLrzqt().getMenu();
                    Intrinsics.checkNotNullExpressionValue(menu, "");
                    android.view.MenuItem item = menu.getItem(c33317muF.AhwBna);
                    Intrinsics.checkNotNullExpressionValue(item, "");
                    interfaceC33220msO.OLrzqt(c55089xdPOLrzqt, item);
                }
                c33317muF.copydefault(iIntValue);
            }
            return zOnNavigationItemSelected;
        } catch (java.lang.Exception e) {
            C6777aVl.Companion.EZpvd(new java.lang.Exception("currentItemIndex : " + iIntValue, e));
            return true;
        }
    }

    public static final void copydefault(C33317muF c33317muF, BottomNavigationView.OnNavigationItemSelectedListener onNavigationItemSelectedListener, android.view.MenuItem menuItem) {
        Intrinsics.checkNotNullParameter(menuItem, "");
        if (c33317muF.AhwBna == -1 || c33317muF.KWHzl() == null) {
            onNavigationItemSelectedListener.onNavigationItemSelected(menuItem);
            return;
        }
        java.lang.Integer num = c33317muF.isConnected.get(menuItem);
        if (num != null) {
            NavigationBarView.OnItemReselectedListener onItemReselectedListenerOLrzqt = c33317muF.fetchVPNInfo.get(num.intValue()).OLrzqt();
            if (onItemReselectedListenerOLrzqt != null) {
                onItemReselectedListenerOLrzqt.onNavigationItemReselected(menuItem);
            }
        }
        RxBus.KWHzl("BottomNavigationClick");
    }

    public final void copydefault(int i) {
        int iCopydefault = C56548yJl.copydefault(i, 0);
        this.AhwBna = iCopydefault;
        InterfaceC33220msO interfaceC33220msO = this.fetchVPNInfo.get(iCopydefault);
        java.lang.String strAhwBna = interfaceC33220msO.AhwBna();
        androidx.fragment.app.Fragment fragmentFindFragmentByTag = AEQbTJ().findFragmentByTag(strAhwBna);
        if (fragmentFindFragmentByTag == null) {
            fragmentFindFragmentByTag = interfaceC33220msO.copydefault();
        }
        androidx.fragment.app.Fragment fragmentFindFragmentByTag2 = AEQbTJ().findFragmentByTag(KWHzl());
        if (Intrinsics.EZpvd(fragmentFindFragmentByTag2, fragmentFindFragmentByTag)) {
            return;
        }
        androidx.fragment.app.FragmentTransaction fragmentTransactionBeginTransaction = AEQbTJ().beginTransaction();
        Intrinsics.checkNotNullExpressionValue(fragmentTransactionBeginTransaction, "");
        if (fragmentFindFragmentByTag2 != null) {
            fragmentTransactionBeginTransaction.hide(fragmentFindFragmentByTag2);
            if (fragmentFindFragmentByTag2.isAdded()) {
                fragmentTransactionBeginTransaction.setMaxLifecycle(fragmentFindFragmentByTag2, Lifecycle.State.STARTED);
                pUU.KWHzl("ProMainActivityDelegate", "hide fragment: " + fragmentFindFragmentByTag2.getTag());
            } else {
                pUU.valueOf("ProMainActivityDelegate", "hide fragment: " + fragmentFindFragmentByTag2.getTag() + ": not attach");
            }
        } else {
            pUU.valueOf("ProMainActivityDelegate", "hide fragment: currentFragment is null");
        }
        if (!fragmentFindFragmentByTag.isAdded()) {
            fragmentTransactionBeginTransaction.add(C33160mrH.StateListAnimator.fJNWhG, fragmentFindFragmentByTag, strAhwBna);
        } else {
            fragmentTransactionBeginTransaction.show(fragmentFindFragmentByTag).setMaxLifecycle(fragmentFindFragmentByTag, Lifecycle.State.RESUMED);
        }
        fragmentTransactionBeginTransaction.commitAllowingStateLoss();
        AEQbTJ(strAhwBna);
    }

    @Override // o.AbstractC33351mun
    public void OLrzqt(@NotNull android.content.Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "");
        copydefault(intent);
        android.os.Bundle extras = intent.getExtras();
        if (extras != null) {
            java.lang.String string = extras.getString("path", null);
            if (Intrinsics.EZpvd(string != null ? java.lang.Boolean.valueOf(OLrzqt(string, extras)) : null, java.lang.Boolean.TRUE)) {
                intent.removeExtra("path");
                return;
            }
        }
        copydefault(this.AhwBna);
        int i = this.AhwBna;
        if (i >= 0) {
            android.view.Menu menu = OLrzqt().getMenu();
            Intrinsics.checkNotNullExpressionValue(menu, "");
            if (i < menu.size()) {
                android.view.MenuItem item = OLrzqt().getMenu().getItem(this.AhwBna);
                android.graphics.drawable.Drawable icon = item.getIcon();
                if (icon instanceof LottieDrawable) {
                    ((LottieDrawable) icon).setProgress(1.0f);
                }
                item.setChecked(true);
            }
        }
    }

    public final boolean OLrzqt(java.lang.String str, android.os.Bundle bundle) {
        if (str != null) {
            InterfaceC33220msO interfaceC33220msO = DbNXlk().get(str);
            if (Intrinsics.EZpvd(interfaceC33220msO != null ? java.lang.Boolean.valueOf(interfaceC33220msO.AEQbTJ(str, OLrzqt(), bundle)) : null, java.lang.Boolean.TRUE)) {
                return true;
            }
        }
        if (!Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "main/deeplink")) {
            return false;
        }
        java.lang.String string = bundle.getString("url");
        if (android.text.TextUtils.isEmpty(string)) {
            return false;
        }
        InterfaceC43294rma interfaceC43294rma = (InterfaceC43294rma) C43251rlk.copydefault(InterfaceC43294rma.class);
        MainActivity mainActivity = this.AYXKKw;
        Intrinsics.copydefault((java.lang.Object) string);
        InterfaceC43294rma.Application.processDeeplink$default(interfaceC43294rma, mainActivity, string, null, new Function1() { // from class: o.muC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C33317muF.copydefault((AbstractC43238rlX) obj);
            }
        }, 4, null);
        return false;
    }

    public static final Unit copydefault(AbstractC43238rlX abstractC43238rlX) {
        Intrinsics.checkNotNullParameter(abstractC43238rlX, "");
        return Unit.INSTANCE;
    }

    @Override // o.AbstractC33351mun
    public void AEQbTJ(@NotNull android.content.Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "");
        copydefault(intent);
        android.os.Bundle extras = intent.getExtras();
        if (extras != null) {
            OLrzqt(extras.getString("path", ""), extras);
        }
    }

    @Override // o.AbstractC33351mun
    public void copydefault(@NotNull android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "");
        super.copydefault(bundle);
        bundle.putInt("current_index", this.AhwBna);
    }

    public final void copydefault(android.content.Intent intent) {
        java.util.Iterator<T> it = this.fetchVPNInfo.iterator();
        while (it.hasNext()) {
            ((InterfaceC33220msO) it.next()).copydefault(intent);
        }
    }
}
