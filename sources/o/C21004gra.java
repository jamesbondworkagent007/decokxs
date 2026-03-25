package o;

import androidx.lifecycle.MutableLiveData;
import com.okinc.business.defi.biz.constant.MultiTransferMode;
import com.okinc.business.defi.wallet.transfer.batch.multiTransferBean.ReceiveAddressSavedInstanceData;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import o.C10407bnq;
import o.InterfaceC9742bbN;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gra, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C21004gra extends AbstractC33073mpa {
    public java.lang.Long AEQbTJ;
    public ReceiveAddressSavedInstanceData AYXKKw;
    public Application EZpvd;
    public boolean KWHzl;
    public int OLrzqt;
    public java.lang.Long copydefault;
    public java.lang.Integer djBIcL;
    public int valueOf;
    public java.lang.String gEmmrt = "";
    public final MutableLiveData<java.util.List<Activity>> AhwBna = new MutableLiveData<>();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AYXKKw() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ReceiveAddressSavedInstanceData DbNXlk() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(ReceiveAddressSavedInstanceData receiveAddressSavedInstanceData) {
        this.AYXKKw = receiveAddressSavedInstanceData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(java.lang.Long l) {
        this.copydefault = l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(java.lang.Integer num) {
        this.djBIcL = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(java.lang.Long l) {
        this.AEQbTJ = l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.gEmmrt = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Long OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Application djBIcL() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Integer fetchVPNInfo() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Long gEmmrt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<java.util.List<Activity>> values() {
        return this.AhwBna;
    }

    public final void valueOf() {
        C10407bnq instance$default = C10407bnq.ActionBar.getInstance$default(C10407bnq.Companion, null, 1, null);
        java.lang.Long l = this.AEQbTJ;
        if (l != null) {
            AbstractC58185ywX abstractC58185ywXRefreshAllWalletsCoinAsset$default = C10407bnq.refreshAllWalletsCoinAsset$default(instance$default, C56402yEa.EZpvd(java.lang.Long.valueOf(l.longValue())), null, false, false, 10, null);
            final Function1 function1 = new Function1() { // from class: o.grf
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C21004gra.AEQbTJ(this.copydefault, (java.util.List) obj);
                }
            };
            AbstractC58185ywX abstractC58185ywXKWHzl = abstractC58185ywXRefreshAllWalletsCoinAsset$default.KWHzl(new InterfaceC58229yxO() { // from class: o.grc
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return C21004gra.djBIcL(function1, obj);
                }
            });
            final Function1 function12 = new Function1() { // from class: o.grd
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C21004gra.OLrzqt(this.OLrzqt, (java.util.ArrayList) obj);
                }
            };
            InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.grh
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    C21004gra.KWHzl(function12, obj);
                }
            };
            final Function1 function13 = new Function1() { // from class: o.grl
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C21004gra.AEQbTJ((java.lang.Throwable) obj);
                }
            };
            abstractC58185ywXKWHzl.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.grk
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    C21004gra.valueOf(function13, obj);
                }
            });
        }
    }

    public static final InterfaceC60096zvd djBIcL(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd AEQbTJ(final C21004gra c21004gra, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        if (C33129mqd.KWHzl((java.util.Collection) list)) {
            AbstractC58260yxt<java.util.List<InterfaceC9735bbG>> abstractC58260yxtEZpvd = ((InterfaceC9852bdR) C43251rlk.copydefault(InterfaceC9852bdR.class)).gEmmrt().EZpvd();
            final Function1 function1 = new Function1() { // from class: o.gri
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C21004gra.copydefault(this.KWHzl, (java.util.List) obj);
                }
            };
            return abstractC58260yxtEZpvd.copydefault(new InterfaceC58229yxO() { // from class: o.grj
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return C21004gra.AhwBna(function1, obj);
                }
            }).EZpvd();
        }
        return AbstractC58185ywX.KWHzl(new java.util.ArrayList());
    }

    public static final java.util.ArrayList AhwBna(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.util.ArrayList) function1.invoke(obj);
    }

    public static final boolean KWHzl(C21004gra c21004gra, InterfaceC9738bbJ interfaceC9738bbJ) {
        Intrinsics.checkNotNullParameter(interfaceC9738bbJ, "");
        return c21004gra.EZpvd(interfaceC9738bbJ, c21004gra.copydefault);
    }

    public static final boolean copydefault(InterfaceC9738bbJ interfaceC9738bbJ) {
        Intrinsics.checkNotNullParameter(interfaceC9738bbJ, "");
        return interfaceC9738bbJ.djSkpj();
    }

    public static final void KWHzl(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(C21004gra c21004gra, java.util.ArrayList arrayList) {
        c21004gra.AhwBna.postValue(arrayList);
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(java.lang.Throwable th) {
        return Unit.INSTANCE;
    }

    public static final void valueOf(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public final void copydefault(@NotNull java.lang.String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        java.util.List<Activity> value = this.AhwBna.getValue();
        if (value == null) {
            value = yDY.AhwBna();
        } else {
            java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(value, 10));
            for (Activity activity : value) {
                if (Intrinsics.EZpvd((java.lang.Object) activity.copydefault().EZpvd(), (java.lang.Object) str)) {
                    activity.KWHzl(z);
                }
                arrayList.add(Unit.INSTANCE);
            }
        }
        this.AhwBna.postValue(value);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x007b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x004f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void OLrzqt(@NotNull java.lang.String str) {
        InterfaceC9738bbJ interfaceC9738bbJOLrzqt;
        java.lang.String strDbNXlk;
        java.lang.String str2 = "";
        Intrinsics.checkNotNullParameter(str, "");
        Application application = this.EZpvd;
        if (application != null && (interfaceC9738bbJOLrzqt = application.OLrzqt()) != null && (strDbNXlk = interfaceC9738bbJOLrzqt.DbNXlk()) != null) {
            str2 = strDbNXlk;
        }
        boolean zEZpvd = Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) str2);
        java.util.List<Activity> value = this.AhwBna.getValue();
        if (value == null) {
            value = yDY.AhwBna();
        } else {
            java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(value, 10));
            java.util.Iterator<T> it = value.iterator();
            boolean z = false;
            boolean z2 = false;
            loop0: while (it.hasNext()) {
                for (Application application2 : ((Activity) it.next()).copydefault().KWHzl()) {
                    if (application2.KWHzl()) {
                        application2.OLrzqt(false);
                        if (!z) {
                            this.EZpvd = null;
                        }
                        if (zEZpvd) {
                            break loop0;
                        }
                        z2 = true;
                        if (!Intrinsics.EZpvd((java.lang.Object) application2.OLrzqt().DbNXlk(), (java.lang.Object) str)) {
                            application2.OLrzqt(true);
                            this.EZpvd = application2;
                            if (z2) {
                                break loop0;
                            } else {
                                z = true;
                            }
                        }
                    } else if (!Intrinsics.EZpvd((java.lang.Object) application2.OLrzqt().DbNXlk(), (java.lang.Object) str)) {
                    }
                }
                arrayList.add(Unit.INSTANCE);
            }
        }
        this.AhwBna.postValue(value);
    }

    public final java.util.ArrayList<Application> copydefault() {
        if (AkhnZx()) {
            return isConnected();
        }
        return AhwBna();
    }

    public final java.util.ArrayList<Application> isConnected() {
        java.util.ArrayList<Application> arrayList = new java.util.ArrayList<>();
        Application application = this.EZpvd;
        if (application != null) {
            arrayList.add(application);
        }
        return arrayList;
    }

    public final java.util.ArrayList<Application> AhwBna() {
        java.util.ArrayList<Application> arrayList = new java.util.ArrayList<>();
        java.util.List<Activity> value = this.AhwBna.getValue();
        if (value != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(value, 10));
            java.util.Iterator<T> it = value.iterator();
            while (it.hasNext()) {
                java.util.List<Application> listKWHzl = ((Activity) it.next()).copydefault().KWHzl();
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                for (java.lang.Object obj : listKWHzl) {
                    if (((Application) obj).KWHzl()) {
                        arrayList3.add(obj);
                    }
                }
                arrayList2.add(java.lang.Boolean.valueOf(arrayList.addAll(arrayList3)));
            }
        }
        return arrayList;
    }

    public final void AEQbTJ(@NotNull java.util.ArrayList<java.lang.String> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        java.util.List<Activity> value = this.AhwBna.getValue();
        if (value != null) {
            java.util.Iterator<T> it = value.iterator();
            while (it.hasNext()) {
                for (Application application : ((Activity) it.next()).copydefault().KWHzl()) {
                    if (arrayList.contains(application.OLrzqt().DbNXlk())) {
                        EZpvd(application.OLrzqt().DbNXlk(), false, false);
                    }
                }
            }
        }
        MutableLiveData<java.util.List<Activity>> mutableLiveData = this.AhwBna;
        mutableLiveData.postValue(mutableLiveData.getValue());
    }

    public final int EZpvd() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.List<Activity> value = this.AhwBna.getValue();
        if (value != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(value, 10));
            java.util.Iterator<T> it = value.iterator();
            while (it.hasNext()) {
                java.util.List<Application> listKWHzl = ((Activity) it.next()).copydefault().KWHzl();
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                for (java.lang.Object obj : listKWHzl) {
                    if (C33129mqd.AEQbTJ(((Application) obj).copydefault(), 0)) {
                        arrayList3.add(obj);
                    }
                }
                arrayList2.add(java.lang.Boolean.valueOf(arrayList.addAll(arrayList3)));
            }
        }
        return arrayList.size();
    }

    public final int KWHzl() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.List<Activity> value = this.AhwBna.getValue();
        if (value != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(value, 10));
            java.util.Iterator<T> it = value.iterator();
            while (it.hasNext()) {
                arrayList2.add(java.lang.Boolean.valueOf(arrayList.addAll(((Activity) it.next()).copydefault().KWHzl())));
            }
        }
        return arrayList.size();
    }

    public static /* synthetic */ void updateWalletSelectStateForMultiMode$default(C21004gra c21004gra, java.lang.String str, boolean z, boolean z2, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            z2 = false;
        }
        c21004gra.EZpvd(str, z, z2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x0104, code lost:
    
        r15 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void EZpvd(@NotNull java.lang.String str, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "");
        java.util.List<Activity> value = this.AhwBna.getValue();
        boolean z3 = false;
        if (value == null) {
            value = new java.util.ArrayList<>();
        } else {
            java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(value, 10));
            for (Activity activity : value) {
                java.util.List<Application> listKWHzl = activity.copydefault().KWHzl();
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                for (java.lang.Object obj : listKWHzl) {
                    if (C33129mqd.AEQbTJ(((Application) obj).copydefault(), 0)) {
                        arrayList2.add(obj);
                    }
                }
                int size = arrayList2.size();
                if (z || z2) {
                    if (Intrinsics.EZpvd((java.lang.Object) activity.copydefault().EZpvd(), (java.lang.Object) str) || z2) {
                        java.util.List<Application> listKWHzl2 = activity.copydefault().KWHzl();
                        java.util.ArrayList arrayList3 = new java.util.ArrayList(C56403yEb.AYXKKw(listKWHzl2, 10));
                        int i = 0;
                        for (Application application : listKWHzl2) {
                            if (C33129mqd.AEQbTJ(application.copydefault(), 0)) {
                                boolean z4 = z2 ? false : false;
                                application.OLrzqt(z4);
                            }
                            if (application.KWHzl()) {
                                i++;
                            }
                            arrayList3.add(Unit.INSTANCE);
                        }
                        activity.AEQbTJ(!z2 ? !(C33129mqd.AEQbTJ(java.lang.Integer.valueOf(size), 0) && size == i) : this.KWHzl || size <= 0);
                        if (!z2) {
                            break;
                        }
                    }
                    arrayList.add(Unit.INSTANCE);
                } else {
                    boolean z5 = false;
                    int i2 = size;
                    for (Application application2 : activity.copydefault().KWHzl()) {
                        if (Intrinsics.EZpvd((java.lang.Object) application2.OLrzqt().DbNXlk(), (java.lang.Object) str)) {
                            application2.OLrzqt(!application2.KWHzl());
                            z5 = true;
                        }
                        if (!application2.KWHzl() && C33129mqd.AEQbTJ(application2.copydefault(), 0)) {
                            i2--;
                        }
                    }
                    activity.AEQbTJ(i2 == size && size > 0);
                    if (z5) {
                        break;
                    } else {
                        arrayList.add(Unit.INSTANCE);
                    }
                }
            }
        }
        if (AhwBna().size() == EZpvd() && C33129mqd.AEQbTJ(java.lang.Integer.valueOf(EZpvd()), 0)) {
            z3 = true;
        }
        this.KWHzl = z3;
        this.AhwBna.postValue(value);
    }

    public final boolean EZpvd(InterfaceC9738bbJ interfaceC9738bbJ, java.lang.Long l) {
        return l != null && interfaceC9738bbJ.AhwBna(l.longValue()) && interfaceC9738bbJ.djSkpj();
    }

    public final boolean AkhnZx() {
        java.lang.Integer num = this.djBIcL;
        return num != null && num.intValue() == MultiTransferMode.MODE_ONE_TO_MANY.getValue();
    }

    /* JADX INFO: renamed from: o.gra$Activity */
    public static final class Activity {
        public boolean AEQbTJ;
        public boolean EZpvd;
        public boolean KWHzl;
        public ActionBar OLrzqt;
        public boolean copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(boolean z) {
            this.AEQbTJ = z;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean AEQbTJ() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(boolean z) {
            this.KWHzl = z;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(boolean z) {
            this.copydefault = z;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean KWHzl() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean OLrzqt() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ActionBar copydefault() {
            return this.OLrzqt;
        }

        public Activity(@NotNull ActionBar actionBar, boolean z, boolean z2, boolean z3, boolean z4) {
            Intrinsics.checkNotNullParameter(actionBar, "");
            this.OLrzqt = actionBar;
            this.copydefault = z;
            this.EZpvd = z2;
            this.AEQbTJ = z3;
            this.KWHzl = z4;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001e: CONSTRUCTOR 
  (r8v0 o.gra$ActionBar)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r13v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? true : (r9v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0008: ARITH (r13v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? true : (r10v0 boolean))
  (wrap:boolean:0x0014: TERNARY null = ((wrap:int:0x000f: ARITH (r13v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? false : (r11v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0015: ARITH (r13v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? true : (r12v0 boolean))
 A[MD:(o.gra$ActionBar, boolean, boolean, boolean, boolean):void (m)] (LINE:283) call: o.gra.Activity.<init>(o.gra$ActionBar, boolean, boolean, boolean, boolean):void type: THIS */
        public /* synthetic */ Activity(ActionBar actionBar, boolean z, boolean z2, boolean z3, boolean z4, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(actionBar, (i & 2) != 0 ? true : z, (i & 4) != 0 ? true : z2, (i & 8) != 0 ? false : z3, (i & 16) != 0 ? true : z4);
        }
    }

    /* JADX INFO: renamed from: o.gra$ActionBar */
    public static final class ActionBar {
        public java.util.List<Application> AEQbTJ;
        public java.lang.CharSequence EZpvd;
        public java.lang.String KWHzl;
        public boolean copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.CharSequence AEQbTJ() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String EZpvd() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<Application> KWHzl() {
            return this.AEQbTJ;
        }

        public ActionBar(@NotNull java.lang.String str, @NotNull java.util.List<Application> list, boolean z, @NotNull java.lang.CharSequence charSequence) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(charSequence, "");
            this.KWHzl = str;
            this.AEQbTJ = list;
            this.copydefault = z;
            this.EZpvd = charSequence;
        }
    }

    /* JADX INFO: renamed from: o.gra$Application */
    public static final class Application {
        public java.lang.String AEQbTJ;
        public java.lang.String EZpvd;
        public java.lang.String KWHzl;
        public boolean OLrzqt;
        public InterfaceC9738bbJ copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AEQbTJ() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String EZpvd() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean KWHzl() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final InterfaceC9738bbJ OLrzqt() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(boolean z) {
            this.OLrzqt = z;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String copydefault() {
            return this.AEQbTJ;
        }

        public Application(@NotNull InterfaceC9738bbJ interfaceC9738bbJ, boolean z, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3) {
            Intrinsics.checkNotNullParameter(interfaceC9738bbJ, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            this.copydefault = interfaceC9738bbJ;
            this.OLrzqt = z;
            this.AEQbTJ = str;
            this.EZpvd = str2;
            this.KWHzl = str3;
        }
    }

    public final java.util.ArrayList<Activity> OLrzqt(java.util.List<? extends InterfaceC9735bbG> list) {
        java.lang.String strFJNWhG;
        java.lang.String strAYXKKw;
        InterfaceC9742bbN interfaceC9742bbN;
        java.lang.String displayAmount$default;
        InterfaceC9742bbN interfaceC9742bbN2;
        int i = 10;
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        for (InterfaceC9735bbG interfaceC9735bbG : list) {
            java.lang.String strEZpvd = interfaceC9735bbG.EZpvd();
            boolean zAEQbTJ = interfaceC9735bbG.AEQbTJ();
            java.lang.CharSequence charSequenceAEQbTJ = interfaceC9735bbG.AEQbTJ(false);
            java.util.List<InterfaceC9738bbJ> listKWHzl = interfaceC9735bbG.KWHzl();
            java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(listKWHzl, i));
            for (InterfaceC9738bbJ interfaceC9738bbJ : listKWHzl) {
                C10854bwM c10854bwMKWHzl = C10954byG.EZpvd.valueOf().KWHzl(this.AEQbTJ);
                if (c10854bwMKWHzl == null || (strFJNWhG = c10854bwMKWHzl.fJNWhG()) == null) {
                    strFJNWhG = "";
                }
                java.lang.String str = strFJNWhG;
                java.lang.Long l = this.AEQbTJ;
                java.util.List<InterfaceC9742bbN> listAYXKKw = interfaceC9738bbJ.AYXKKw(l != null ? l.longValue() : -1L);
                if (listAYXKKw == null || (interfaceC9742bbN2 = (InterfaceC9742bbN) CollectionsKt___CollectionsKt.firstOrNull(listAYXKKw)) == null || (strAYXKKw = interfaceC9742bbN2.AYXKKw()) == null) {
                    strAYXKKw = "0";
                }
                java.lang.Long l2 = this.AEQbTJ;
                java.util.List<InterfaceC9742bbN> listAYXKKw2 = interfaceC9738bbJ.AYXKKw(l2 != null ? l2.longValue() : -1L);
                arrayList2.add(new Application(interfaceC9738bbJ, false, strAYXKKw, (listAYXKKw2 == null || (interfaceC9742bbN = (InterfaceC9742bbN) CollectionsKt___CollectionsKt.firstOrNull(listAYXKKw2)) == null || (displayAmount$default = InterfaceC9742bbN.TaskDescription.getDisplayAmount$default(interfaceC9742bbN, false, false, 3, null)) == null) ? "0" : displayAmount$default, str));
            }
            arrayList.add(new Activity(new ActionBar(strEZpvd, (java.util.ArrayList) CollectionsKt___CollectionsKt.OLrzqt(arrayList2, new java.util.ArrayList()), zAEQbTJ, charSequenceAEQbTJ), true, true, false, false, 16, null));
            i = 10;
        }
        Activity activity = (Activity) CollectionsKt___CollectionsKt.wlaJM(arrayList);
        if (activity != null) {
            activity.EZpvd(false);
        }
        return (java.util.ArrayList) CollectionsKt___CollectionsKt.OLrzqt(arrayList, new java.util.ArrayList());
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [T, java.util.ArrayList, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r7v1, types: [T, java.util.ArrayList, java.util.Collection] */
    public static final java.util.ArrayList copydefault(final C21004gra c21004gra, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            InterfaceC9735bbG interfaceC9735bbG = (InterfaceC9735bbG) obj;
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            java.util.List<InterfaceC9738bbJ> listKWHzl = interfaceC9735bbG.KWHzl();
            ?? arrayList2 = new java.util.ArrayList();
            for (java.lang.Object obj2 : listKWHzl) {
                InterfaceC9738bbJ interfaceC9738bbJ = (InterfaceC9738bbJ) obj2;
                if (interfaceC9738bbJ.AubY() || interfaceC9738bbJ.AwvSrB() || interfaceC9738bbJ.QVAiDq()) {
                    arrayList2.add(obj2);
                }
            }
            objectRef.element = arrayList2;
            c21004gra.OLrzqt += interfaceC9735bbG.KWHzl().size();
            Function1 function1 = c21004gra.copydefault != null ? new Function1() { // from class: o.grg
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj3) {
                    return java.lang.Boolean.valueOf(C21004gra.KWHzl(this.EZpvd, (InterfaceC9738bbJ) obj3));
                }
            } : new Function1() { // from class: o.gre
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj3) {
                    return java.lang.Boolean.valueOf(C21004gra.copydefault((InterfaceC9738bbJ) obj3));
                }
            };
            java.lang.Iterable iterable = (java.lang.Iterable) objectRef.element;
            ?? arrayList3 = new java.util.ArrayList();
            for (java.lang.Object obj3 : iterable) {
                if (((java.lang.Boolean) function1.invoke((InterfaceC9738bbJ) obj3)).booleanValue()) {
                    arrayList3.add(obj3);
                }
            }
            objectRef.element = arrayList3;
            java.util.List<InterfaceC9738bbJ> listKWHzl2 = interfaceC9735bbG.KWHzl();
            Intrinsics.copydefault(listKWHzl2, "");
            java.util.ArrayList arrayList4 = (java.util.ArrayList) listKWHzl2;
            arrayList4.clear();
            arrayList4.addAll((java.util.Collection) objectRef.element);
            c21004gra.valueOf += interfaceC9735bbG.KWHzl().size() - ((java.util.List) objectRef.element).size();
            if (C33129mqd.KWHzl((java.util.Collection) interfaceC9735bbG.KWHzl())) {
                arrayList.add(obj);
            }
        }
        return c21004gra.OLrzqt(arrayList);
    }
}
