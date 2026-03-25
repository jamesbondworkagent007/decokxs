package o;

import androidx.lifecycle.MutableLiveData;
import com.okinc.business.defi.biz.net.bean.TxRecord;
import com.okinc.business.defi.biz.net.bean.TxRecordList;
import com.okinc.network.okg.response.ResponseData;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.Bitmap;
import o.C10407bnq;
import o.C12827cuN;
import o.InterfaceC9739bbK;
import o.eIY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class eIY extends AbstractC33073mpa {
    public final C10948byA AEQbTJ;
    public boolean AYXKKw;
    public long AhwBna;
    public boolean AkhnZx;
    public long AuCTel;
    public java.lang.String DbNXlk;
    public C10854bwM EZpvd;
    public final MutableLiveData<java.lang.Integer> KWHzl;
    public int OLrzqt;
    public final MutableLiveData<java.lang.Boolean> copydefault;
    public boolean djBIcL;
    public final java.util.List<java.lang.Integer> ejfBZ;
    public boolean fARcdN;
    public final eIT fIwbmz;
    public AbstractC12782ctV fJNWhG;
    public final MutableLiveData<java.lang.Boolean> fetchVPNInfo;
    public final MutableLiveData<Bitmap<Unit>> gEmmrt;
    public final InterfaceC9739bbK getFieldNames;
    public final C12827cuN getNewProxyInstance;
    public final C13934dbu hDKMBd;
    public final java.util.List<C15489eKf> isConnected;
    public final C10407bnq iwGUEr;
    public int valueOf;
    public long values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public eIY() {
        this(null, null, null, null, null, null, 63, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<java.lang.Integer> AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<java.lang.Integer> AYXKKw() {
        return this.ejfBZ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<C15489eKf> AhwBna() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C12827cuN AkhnZx() {
        return this.getNewProxyInstance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<java.lang.Boolean> EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(long j) {
        this.AuCTel = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(boolean z) {
        this.djBIcL = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long KWHzl() {
        long j = this.AhwBna;
        if (j == 0) {
            return 0L;
        }
        return j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<Bitmap<Unit>> OLrzqt() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(long j) {
        this.values = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C10854bwM copydefault() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(long j) {
        this.AhwBna = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(@NotNull AbstractC12782ctV abstractC12782ctV) {
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        this.fJNWhG = abstractC12782ctV;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean fetchVPNInfo() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long gEmmrt() {
        long j = this.AuCTel;
        if (j == 0) {
            return 0L;
        }
        return !this.AkhnZx ? j : this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isConnected() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<java.lang.Boolean> valueOf() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0044: CONSTRUCTOR 
  (wrap:o.dbu:?: TERNARY null = ((wrap:int:0x0000: ARITH (r11v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:o.dbu:0x0006: CONSTRUCTOR  A[MD:():void (m), WRAPPED] (LINE:36) call: o.dbu.<init>():void type: CONSTRUCTOR) : (r5v0 o.dbu))
  (wrap:o.bbK:0x000f: TERNARY null = ((wrap:int:0x0009: ARITH (r11v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:o.bbK:0x000d: SGET  A[WRAPPED] (LINE:37) o.bmZ.KWHzl o.bmZ) : (r6v0 o.bbK))
  (wrap:o.cuN:0x001c: TERNARY null = ((wrap:int:0x0010: ARITH (r11v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:o.cuN:0x0018: INVOKE 
  (wrap:o.cuN$Application:0x0016: SGET  A[WRAPPED] (LINE:38) o.cuN.Companion o.cuN$Application)
  (null android.content.Context)
  (1 int)
  (null java.lang.Object)
 STATIC call: o.cuN.Application.getInstance$default(o.cuN$Application, android.content.Context, int, java.lang.Object):o.cuN A[MD:(o.cuN$Application, android.content.Context, int, java.lang.Object):o.cuN (m), WRAPPED] (LINE:38)) : (r7v0 o.cuN))
  (wrap:o.eIT:0x0026: TERNARY null = ((wrap:int:0x001d: ARITH (r11v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:o.eIT:0x0023: CONSTRUCTOR  A[MD:():void (m), WRAPPED] (LINE:39) call: o.eIR.<init>():void type: CONSTRUCTOR) : (r8v0 o.eIT))
  (wrap:o.bnq:0x0031: TERNARY null = ((wrap:int:0x0027: ARITH (r11v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:o.bnq:0x002d: INVOKE 
  (wrap:o.bnq$ActionBar:0x002b: SGET  A[WRAPPED] (LINE:40) o.bnq.Companion o.bnq$ActionBar)
  (null android.content.Context)
  (1 int)
  (null java.lang.Object)
 STATIC call: o.bnq.ActionBar.getInstance$default(o.bnq$ActionBar, android.content.Context, int, java.lang.Object):o.bnq A[MD:(o.bnq$ActionBar, android.content.Context, int, java.lang.Object):o.bnq (m), WRAPPED] (LINE:40)) : (r9v0 o.bnq))
  (wrap:o.byA:?: TERNARY null = ((wrap:int:0x0032: ARITH (r11v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (wrap:o.byA:0x0038: INVOKE (wrap:o.byG:0x0036: SGET  A[WRAPPED] (LINE:41) o.byG.EZpvd o.byG) VIRTUAL call: o.byG.valueOf():o.byA A[MD:():o.byA (m), WRAPPED] (LINE:41)) : (r10v0 o.byA))
 A[MD:(o.dbu, o.bbK, o.cuN, o.eIT, o.bnq, o.byA):void (m)] (LINE:35) call: o.eIY.<init>(o.dbu, o.bbK, o.cuN, o.eIT, o.bnq, o.byA):void type: THIS */
    public /* synthetic */ eIY(C13934dbu c13934dbu, InterfaceC9739bbK interfaceC9739bbK, C12827cuN c12827cuN, eIT eit, C10407bnq c10407bnq, C10948byA c10948byA, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new C13934dbu() : c13934dbu, (i & 2) != 0 ? C10337bmZ.KWHzl : interfaceC9739bbK, (i & 4) != 0 ? C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null) : c12827cuN, (i & 8) != 0 ? new eIR() : eit, (i & 16) != 0 ? C10407bnq.ActionBar.getInstance$default(C10407bnq.Companion, null, 1, null) : c10407bnq, (i & 32) != 0 ? C10954byG.EZpvd.valueOf() : c10948byA);
    }

    public eIY(@NotNull C13934dbu c13934dbu, @NotNull InterfaceC9739bbK interfaceC9739bbK, @NotNull C12827cuN c12827cuN, @NotNull eIT eit, @NotNull C10407bnq c10407bnq, @NotNull C10948byA c10948byA) {
        Intrinsics.checkNotNullParameter(c13934dbu, "");
        Intrinsics.checkNotNullParameter(interfaceC9739bbK, "");
        Intrinsics.checkNotNullParameter(c12827cuN, "");
        Intrinsics.checkNotNullParameter(eit, "");
        Intrinsics.checkNotNullParameter(c10407bnq, "");
        Intrinsics.checkNotNullParameter(c10948byA, "");
        this.hDKMBd = c13934dbu;
        this.getFieldNames = interfaceC9739bbK;
        this.getNewProxyInstance = c12827cuN;
        this.fIwbmz = eit;
        this.iwGUEr = c10407bnq;
        this.AEQbTJ = c10948byA;
        this.ejfBZ = new java.util.ArrayList();
        this.isConnected = new java.util.ArrayList();
        this.gEmmrt = new MutableLiveData<>();
        this.copydefault = new MutableLiveData<>();
        this.fetchVPNInfo = new MutableLiveData<>();
        this.KWHzl = new MutableLiveData<>(0);
        this.djBIcL = true;
        this.DbNXlk = "";
    }

    public final AbstractC12782ctV djBIcL() {
        AbstractC12782ctV abstractC12782ctV = this.fJNWhG;
        if (abstractC12782ctV != null) {
            return abstractC12782ctV;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public final void AEQbTJ(int i) {
        if (this.valueOf != i) {
            this.valueOf = i;
            AEQbTJ(true);
        }
    }

    private final boolean fARcdN() {
        return this.DbNXlk.length() == 0;
    }

    public final void EZpvd(@NotNull AbstractC12782ctV abstractC12782ctV, long j) {
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        copydefault(abstractC12782ctV);
        this.AYXKKw = this.iwGUEr.KWHzl(abstractC12782ctV);
        KWHzl(j);
    }

    public static final class Application<T> implements java.util.Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return yET.KWHzl(java.lang.Integer.valueOf(((C15489eKf) t).AYXKKw()), java.lang.Integer.valueOf(((C15489eKf) t2).AYXKKw()));
        }
    }

    public final void KWHzl(long j) {
        if (j == Long.MIN_VALUE) {
            if (C33129mqd.AEQbTJ(java.lang.Integer.valueOf(djBIcL().OFhtUX().size()), "1")) {
                this.EZpvd = null;
                return;
            } else {
                if (C33129mqd.AEQbTJ(java.lang.Integer.valueOf(djBIcL().OFhtUX().size()), "0")) {
                    this.EZpvd = (C10854bwM) CollectionsKt___CollectionsKt.firstOrNull(djBIcL().OFhtUX());
                    return;
                }
                return;
            }
        }
        this.EZpvd = this.AEQbTJ.copydefault(j);
    }

    public final boolean DbNXlk() {
        return C33129mqd.AEQbTJ(java.lang.Integer.valueOf(djBIcL().OFhtUX().size()), "1");
    }

    public static /* synthetic */ void loadMore$default(eIY eiy, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        eiy.OLrzqt(z);
    }

    public final void OLrzqt(boolean z) {
        this.djBIcL = z;
        values();
    }

    public static /* synthetic */ void refresh$default(eIY eiy, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        eiy.AEQbTJ(z);
    }

    public final void AEQbTJ(boolean z) {
        this.djBIcL = z;
        this.DbNXlk = "";
        this.AkhnZx = false;
        this.OLrzqt = 0;
        values();
    }

    public final void values() {
        if (this.gEmmrt.getValue() instanceof Bitmap.TaskDescription) {
            return;
        }
        this.gEmmrt.setValue(new Bitmap.TaskDescription());
        AbstractC58185ywX abstractC58185ywXEnsureInitialized$default = InterfaceC9739bbK.StateListAnimator.ensureInitialized$default(this.getFieldNames, false, 1, null);
        final Function1 function1 = new Function1() { // from class: o.eJl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return eIY.EZpvd(this.copydefault, (java.lang.Boolean) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXKWHzl = abstractC58185ywXEnsureInitialized$default.KWHzl(new InterfaceC58229yxO() { // from class: o.eJj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return eIY.fetchVPNInfo(function1, obj);
            }
        });
        final Function1 function12 = new Function1() { // from class: o.eJk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return eIY.KWHzl(this.AEQbTJ, (ResponseData) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywXKWHzl.AEQbTJ(new InterfaceC58229yxO() { // from class: o.eJn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return eIY.isConnected(function12, obj);
            }
        });
        final Function1 function13 = new Function1() { // from class: o.eIZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return eIY.AEQbTJ(this.OLrzqt, (eIY.TaskDescription) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.eJa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                eIY.DbNXlk(function13, obj);
            }
        };
        final Function1 function14 = new Function1() { // from class: o.eJd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return eIY.AEQbTJ(this.EZpvd, (java.lang.Throwable) obj);
            }
        };
        call().AEQbTJ(abstractC58185ywXAEQbTJ.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.eJg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                eIY.values(function14, obj);
            }
        }));
    }

    public static final InterfaceC60096zvd fetchVPNInfo(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd EZpvd(eIY eiy, java.lang.Boolean bool) {
        Intrinsics.checkNotNullParameter(bool, "");
        C13934dbu c13934dbu = eiy.hDKMBd;
        java.lang.String strDbNXlk = eiy.djBIcL().DbNXlk();
        C10854bwM c10854bwM = eiy.EZpvd;
        java.lang.Long lValueOf = c10854bwM != null ? java.lang.Long.valueOf(c10854bwM.fetchVPNInfo()) : null;
        long jGEmmrt = eiy.gEmmrt();
        long jKWHzl = eiy.KWHzl();
        java.lang.String str = eiy.DbNXlk;
        xWV xwv = (xWV) C43251rlk.OLrzqt(xWV.class);
        return c13934dbu.OLrzqt(strDbNXlk, lValueOf, jGEmmrt, jKWHzl, str, xwv != null ? xwv.OLrzqt() : true, 20, java.lang.Integer.valueOf(eiy.valueOf), null);
    }

    public static final TaskDescription isConnected(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (TaskDescription) function1.invoke(obj);
    }

    public static final TaskDescription KWHzl(eIY eiy, ResponseData responseData) {
        java.util.ArrayList arrayList;
        java.util.List<TxRecord> content;
        Intrinsics.checkNotNullParameter(responseData, "");
        TxRecordList txRecordList = (TxRecordList) responseData.getData();
        if (txRecordList == null || (content = txRecordList.getContent()) == null) {
            arrayList = null;
        } else {
            java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(content, 10));
            java.util.Iterator<T> it = content.iterator();
            while (it.hasNext()) {
                arrayList2.add(eiy.AEQbTJ((TxRecord) it.next()));
            }
            arrayList = arrayList2;
        }
        TxRecordList txRecordList2 = (TxRecordList) responseData.getData();
        return new TaskDescription(C33129mqd.AhwBna(txRecordList2 != null ? txRecordList2.getTotal() : null), new ResponseData(responseData.getCode(), responseData.getMsg(), responseData.getDetailMsg(), responseData.getErrorMsg(), arrayList, null, 32, null), (TxRecordList) responseData.getData());
    }

    public static final void DbNXlk(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(eIY eiy, TaskDescription taskDescription) {
        eiy.copydefault.setValue(java.lang.Boolean.TRUE);
        if (taskDescription.KWHzl().getCode() == 0) {
            eiy.OLrzqt++;
            Intrinsics.copydefault(taskDescription);
            eiy.KWHzl(taskDescription);
        } else {
            if (eiy.fARcdN() && eiy.isConnected.isEmpty()) {
                eiy.isConnected.add(new C15498eKo());
            }
            eiy.gEmmrt.setValue(new Bitmap.ActionBar(taskDescription.KWHzl().getDetailMsg(), null, 2, null));
        }
        return Unit.INSTANCE;
    }

    public static final void values(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(eIY eiy, java.lang.Throwable th) {
        if (eiy.fARcdN() && eiy.isConnected.isEmpty()) {
            eiy.isConnected.add(new C15498eKo());
        }
        eiy.gEmmrt.setValue(new Bitmap.ActionBar(th.getMessage(), null, 2, null));
        return Unit.INSTANCE;
    }

    public static final Unit valueOf(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (Unit) function1.invoke(obj);
    }

    public final void KWHzl(TaskDescription taskDescription) {
        AbstractC58260yxt abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault(taskDescription);
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
        AbstractC58260yxt abstractC58260yxtValueOf = C11607cUn.valueOf(abstractC58260yxtCopydefault);
        final Function1 function1 = new Function1() { // from class: o.eJc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return eIY.KWHzl(this.EZpvd, (eIY.TaskDescription) obj);
            }
        };
        AbstractC58260yxt abstractC58260yxtCopydefault2 = abstractC58260yxtValueOf.copydefault(new InterfaceC58229yxO() { // from class: o.eJb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return eIY.valueOf(function1, obj);
            }
        });
        final Function1 function12 = new Function1() { // from class: o.eJh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return eIY.EZpvd(this.OLrzqt, (Unit) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.eJf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                eIY.AhwBna(function12, obj);
            }
        };
        final Function1 function13 = new Function1() { // from class: o.eJe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return eIY.KWHzl(this.EZpvd, (java.lang.Throwable) obj);
            }
        };
        call().AEQbTJ(abstractC58260yxtCopydefault2.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.eJi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                eIY.AYXKKw(function13, obj);
            }
        }));
    }

    public static final Unit KWHzl(eIY eiy, TaskDescription taskDescription) {
        C15489eKf c15489eKf;
        TxRecord txRecordAuCTel;
        java.lang.String rowId;
        java.lang.String str = "";
        Intrinsics.checkNotNullParameter(taskDescription, "");
        boolean zFARcdN = eiy.fARcdN();
        if (zFARcdN) {
            eiy.isConnected.clear();
        }
        java.util.List<C15489eKf> data = taskDescription.KWHzl().getData();
        if (data != null && C33129mqd.KWHzl((java.util.Collection) data)) {
            java.util.List<C15489eKf> data2 = taskDescription.KWHzl().getData();
            if (data2 != null && (c15489eKf = (C15489eKf) CollectionsKt___CollectionsKt.wlaJM(data2)) != null && (txRecordAuCTel = c15489eKf.AuCTel()) != null && (rowId = txRecordAuCTel.getRowId()) != null) {
                str = rowId;
            }
            eiy.DbNXlk = str;
        }
        if (taskDescription.KWHzl().getData() != null && (!r0.isEmpty())) {
            eiy.OLrzqt(taskDescription);
            TxRecordList txRecordListEZpvd = taskDescription.EZpvd();
            if (eiy.OLrzqt == 50) {
                eiy.isConnected.add(new C15497eKn(txRecordListEZpvd != null ? txRecordListEZpvd.getExplorerUrl() : null));
                eiy.copydefault.setValue(java.lang.Boolean.FALSE);
            }
            if (txRecordListEZpvd != null) {
                java.lang.Boolean hasViewMore = txRecordListEZpvd.getHasViewMore();
                java.lang.Boolean bool = java.lang.Boolean.FALSE;
                if (Intrinsics.EZpvd(hasViewMore, bool) && eiy.OLrzqt < 50) {
                    if (zFARcdN || eiy.AkhnZx) {
                        eiy.isConnected.add(new C15497eKn(txRecordListEZpvd.getExplorerUrl()));
                        eiy.copydefault.setValue(bool);
                    } else {
                        eiy.AkhnZx = true;
                    }
                }
            }
        } else if (eiy.fARcdN()) {
            java.util.List<C15489eKf> list = eiy.isConnected;
            TxRecordList txRecordListEZpvd2 = taskDescription.EZpvd();
            list.add(new C15496eKm(txRecordListEZpvd2 != null ? txRecordListEZpvd2.getExplorerUrl() : null, eiy.fARcdN));
        }
        return Unit.INSTANCE;
    }

    public static final void AhwBna(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(eIY eiy, Unit unit) {
        MutableLiveData<Bitmap<Unit>> mutableLiveData = eiy.gEmmrt;
        Unit unit2 = Unit.INSTANCE;
        mutableLiveData.setValue(new Bitmap.StateListAnimator(unit2));
        return unit2;
    }

    public static final void AYXKKw(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit KWHzl(eIY eiy, java.lang.Throwable th) {
        MutableLiveData<Bitmap<Unit>> mutableLiveData = eiy.gEmmrt;
        Unit unit = Unit.INSTANCE;
        mutableLiveData.setValue(new Bitmap.StateListAnimator(unit));
        return unit;
    }

    public final void OLrzqt(TaskDescription taskDescription) {
        java.util.List<C15489eKf> listKWHzl;
        if (this.isConnected.isEmpty()) {
            java.util.List<C15489eKf> data = taskDescription.KWHzl().getData();
            if (data == null) {
                data = yDY.AhwBna();
            }
            this.isConnected.addAll(KWHzl(data));
            return;
        }
        C15489eKf c15489eKf = (C15489eKf) CollectionsKt___CollectionsKt.AubY(this.isConnected);
        java.util.List<C15489eKf> data2 = taskDescription.KWHzl().getData();
        if (data2 == null) {
            data2 = yDY.AhwBna();
        }
        java.util.Iterator<T> it = data2.iterator();
        boolean z = false;
        while (it.hasNext()) {
            z = ((C15489eKf) it.next()).AYXKKw() < c15489eKf.AYXKKw();
            if (z) {
                break;
            }
        }
        if (z) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.addAll(this.isConnected);
            arrayList.addAll(data2);
            this.isConnected.clear();
            listKWHzl = KWHzl(arrayList);
        } else {
            listKWHzl = KWHzl(data2);
        }
        this.isConnected.addAll(listKWHzl);
    }

    public final C15489eKf AEQbTJ(TxRecord txRecord) {
        return this.fIwbmz.KWHzl(txRecord);
    }

    /* JADX INFO: loaded from: classes15.dex */
    public static final class TaskDescription {
        public final TxRecordList AEQbTJ;
        public final int KWHzl;
        public final ResponseData<java.util.List<C15489eKf>> copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.eIY$TaskDescription */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, int i, ResponseData responseData, TxRecordList txRecordList, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                i = taskDescription.KWHzl;
            }
            if ((i2 & 2) != 0) {
                responseData = taskDescription.copydefault;
            }
            if ((i2 & 4) != 0) {
                txRecordList = taskDescription.AEQbTJ;
            }
            return taskDescription.copydefault(i, responseData, txRecordList);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TxRecordList EZpvd() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ResponseData<java.util.List<C15489eKf>> KWHzl() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaskDescription copydefault(int i, @NotNull ResponseData<java.util.List<C15489eKf>> responseData, TxRecordList txRecordList) {
            Intrinsics.checkNotNullParameter(responseData, "");
            return new TaskDescription(i, responseData, txRecordList);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TaskDescription)) {
                return false;
            }
            TaskDescription taskDescription = (TaskDescription) obj;
            return this.KWHzl == taskDescription.KWHzl && Intrinsics.EZpvd(this.copydefault, taskDescription.copydefault) && Intrinsics.EZpvd(this.AEQbTJ, taskDescription.AEQbTJ);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = java.lang.Integer.hashCode(this.KWHzl);
            int iHashCode2 = this.copydefault.hashCode();
            TxRecordList txRecordList = this.AEQbTJ;
            return (((iHashCode * 31) + iHashCode2) * 31) + (txRecordList == null ? 0 : txRecordList.hashCode());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "TxResponseDataInfo(count=" + this.KWHzl + ", responseData=" + this.copydefault + ", txRecordList=" + this.AEQbTJ + ")";
        }

        public TaskDescription(int i, @NotNull ResponseData<java.util.List<C15489eKf>> responseData, TxRecordList txRecordList) {
            Intrinsics.checkNotNullParameter(responseData, "");
            this.KWHzl = i;
            this.copydefault = responseData;
            this.AEQbTJ = txRecordList;
        }
    }

    public final java.util.List<C15489eKf> KWHzl(java.util.List<? extends C15489eKf> list) {
        return CollectionsKt___CollectionsKt.EZpvd(list, new Application());
    }
}
