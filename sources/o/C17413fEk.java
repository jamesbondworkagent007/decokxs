package o;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.okinc.business.defi.biz.constant.WalletType;
import com.okinc.business.defi.biz.model.wallet.MpcWalletEncodeInfo;
import com.okinc.business.defi.biz.net.bean.TeeAndEip7702Item;
import com.okinc.business.defi.wallet.eip7702.data.model.EIP7702WalletStatus;
import com.okinc.business.defi.wallet.mine.walletmanage.viewmodel.WalletManagerViewModel$createDemoGuideData$1;
import com.okinc.business.defi.wallet.mine.walletmanage.viewmodel.WalletManagerViewModel$getAllWalletAssets$1;
import com.okinc.business.defi.wallet.mine.walletmanage.viewmodel.WalletManagerViewModel$getEIP7702WalletStatus$1;
import com.okinc.business.defi.wallet.mine.walletmanage.viewmodel.WalletManagerViewModel$getEIP7702WalletStatus$rootWallets$1;
import com.okinc.business.defi.wallet.mine.walletmanage.viewmodel.WalletManagerViewModel$getTeeAndEIP7702WalletStatus$1;
import com.okinc.business.defi.wallet.mine.walletmanage.viewmodel.WalletManagerViewModel$getTeeAndEIP7702WalletStatus$rootWallets$1;
import com.okinc.business.defi.wallet.mine.walletmanage.viewmodel.WalletManagerViewModel$wrapRootWalletList$1;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;
import o.C12827cuN;
import o.C13754dXa;
import o.C17351fCc;
import o.InterfaceC13426dKx;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fEk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C17413fEk extends AbstractC33073mpa {
    public final MutableLiveData<java.lang.Boolean> AEQbTJ;
    public fDT AYXKKw;
    public final C17412fEj AhwBna;
    public final MutableLiveData<java.lang.Boolean> AkhnZx;
    public final MutableLiveData<java.lang.Integer> AuCTel;
    public final MutableLiveData<java.lang.String> DbNXlk;
    public int EZpvd;
    public final C15274eCg KWHzl;
    public final C10546bqW OLrzqt;
    public final MutableLiveData<java.util.List<fDL<java.lang.Object>>> copydefault;
    public final MutableLiveData<java.lang.Boolean> djBIcL;
    public MutableLiveData<java.lang.Integer> ejfBZ;
    public int fJNWhG;
    public final C17926fXk fetchVPNInfo;
    public boolean gEmmrt;
    public boolean isConnected;
    public boolean valueOf;
    public final java.lang.String values;

    /* JADX INFO: renamed from: o.fEk$Application */
    public static final class Application extends cCS {
        public java.lang.String gasjUx;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.cCS, o.AbstractC12782ctV, o.InterfaceC9738bbJ
        public java.lang.String AEQbTJ() {
            return this.gasjUx;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void zuBGHE(java.lang.String str) {
            this.gasjUx = str;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C17413fEk() {
        this(null, null, null, 7, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(boolean z) {
        this.gEmmrt = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AYXKKw() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AhwBna() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int AkhnZx() {
        return this.fJNWhG;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<java.lang.String> DbNXlk() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(boolean z) {
        this.isConnected = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<java.lang.Boolean> KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<java.util.List<fDL<java.lang.Object>>> OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(int i) {
        this.fJNWhG = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(int i) {
        this.EZpvd = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(boolean z) {
        this.valueOf = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean copydefault() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<java.lang.Boolean> djBIcL() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<java.lang.Integer> fetchVPNInfo() {
        return this.ejfBZ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C17412fEj gEmmrt() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<java.lang.Boolean> valueOf() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<java.lang.Integer> values() {
        return this.AuCTel;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0024: CONSTRUCTOR 
  (wrap:o.eCg:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:o.eCg:0x0008: CONSTRUCTOR (null o.eCh), (1 int), (null kotlin.jvm.internal.DefaultConstructorMarker) A[MD:(o.eCh, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:59) call: o.eCg.<init>(o.eCh, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r3v0 o.eCg))
  (wrap:o.fXk:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:o.fXk:0x001e: CONSTRUCTOR 
  (wrap:o.fVJ:0x0015: INVOKE 
  (wrap:o.dKx:0x0011: INVOKE 
  (wrap:o.dKx$TaskDescription:0x000f: SGET  A[WRAPPED] (LINE:61) o.dKx.Companion o.dKx$TaskDescription)
  (null android.content.Context)
  (1 int)
  (null java.lang.Object)
 STATIC call: o.dKx.TaskDescription.getInstance$default(o.dKx$TaskDescription, android.content.Context, int, java.lang.Object):o.dKx A[MD:(o.dKx$TaskDescription, android.content.Context, int, java.lang.Object):o.dKx (m), WRAPPED] (LINE:61))
 INTERFACE call: o.dKx.getFieldNames():o.fVJ A[MD:():o.fVJ (m), WRAPPED] (LINE:61))
 A[MD:(o.fVJ):void (m), WRAPPED] (LINE:60) call: o.fXk.<init>(o.fVJ):void type: CONSTRUCTOR) : (r4v0 o.fXk))
  (wrap:o.fDT:?: TERNARY null = ((wrap:int:0x001f: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null o.fDT) : (r5v0 o.fDT))
 A[MD:(o.eCg, o.fXk, o.fDT):void (m)] (LINE:58) call: o.fEk.<init>(o.eCg, o.fXk, o.fDT):void type: THIS */
    public /* synthetic */ C17413fEk(C15274eCg c15274eCg, C17926fXk c17926fXk, fDT fdt, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new C15274eCg(null, 1, null) : c15274eCg, (i & 2) != 0 ? new C17926fXk(InterfaceC13426dKx.TaskDescription.getInstance$default(InterfaceC13426dKx.Companion, null, 1, null).getFieldNames()) : c17926fXk, (i & 4) != 0 ? null : fdt);
    }

    public C17413fEk(@NotNull C15274eCg c15274eCg, @NotNull C17926fXk c17926fXk, fDT fdt) {
        Intrinsics.checkNotNullParameter(c15274eCg, "");
        Intrinsics.checkNotNullParameter(c17926fXk, "");
        this.KWHzl = c15274eCg;
        this.fetchVPNInfo = c17926fXk;
        this.AYXKKw = fdt;
        this.values = C17413fEk.class.getName();
        this.gEmmrt = true;
        this.copydefault = new MutableLiveData<>();
        this.AkhnZx = new MutableLiveData<>();
        this.DbNXlk = new MutableLiveData<>();
        this.ejfBZ = new MutableLiveData<>();
        C17412fEj c17412fEj = new C17412fEj();
        this.AhwBna = c17412fEj;
        this.djBIcL = new MutableLiveData<>();
        this.AEQbTJ = new MutableLiveData<>();
        this.AuCTel = new MutableLiveData<>();
        this.OLrzqt = new C10546bqW(null, null, 3, null);
        if (this.AYXKKw == null) {
            this.AYXKKw = new fDR(ViewModelKt.getViewModelScope(this), null, 2, null);
        }
        c17412fEj.AEQbTJ(C55298xhM.sp2pxFloat$default(52.0f, null, 1, null));
    }

    public final void OLrzqt(boolean z) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new WalletManagerViewModel$getAllWalletAssets$1(this, z, null), 3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(@NotNull java.util.List<? extends InterfaceC9735bbG> list, @NotNull Continuation<? super Result<? extends java.util.Map<java.lang.String, ? extends EIP7702WalletStatus>>> continuation) {
        WalletManagerViewModel$getEIP7702WalletStatus$1 walletManagerViewModel$getEIP7702WalletStatus$1;
        C17413fEk c17413fEk;
        C17413fEk c17413fEk2;
        if (continuation instanceof WalletManagerViewModel$getEIP7702WalletStatus$1) {
            walletManagerViewModel$getEIP7702WalletStatus$1 = (WalletManagerViewModel$getEIP7702WalletStatus$1) continuation;
            int i = walletManagerViewModel$getEIP7702WalletStatus$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                walletManagerViewModel$getEIP7702WalletStatus$1.label = i - Integer.MIN_VALUE;
            } else {
                walletManagerViewModel$getEIP7702WalletStatus$1 = new WalletManagerViewModel$getEIP7702WalletStatus$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = walletManagerViewModel$getEIP7702WalletStatus$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = walletManagerViewModel$getEIP7702WalletStatus$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            if (!C33129mqd.KWHzl((java.util.Collection) list)) {
                CoroutineDispatcher io2 = Dispatchers.getIO();
                WalletManagerViewModel$getEIP7702WalletStatus$rootWallets$1 walletManagerViewModel$getEIP7702WalletStatus$rootWallets$1 = new WalletManagerViewModel$getEIP7702WalletStatus$rootWallets$1(null);
                walletManagerViewModel$getEIP7702WalletStatus$1.L$0 = this;
                walletManagerViewModel$getEIP7702WalletStatus$1.label = 1;
                objWithContext = BuildersKt.withContext(io2, walletManagerViewModel$getEIP7702WalletStatus$rootWallets$1, walletManagerViewModel$getEIP7702WalletStatus$1);
                if (objWithContext == objCopydefault) {
                    return objCopydefault;
                }
                c17413fEk = this;
            } else {
                c17413fEk2 = this;
                if (!list.isEmpty()) {
                    Result.Application application = Result.Companion;
                    return Result.m7377constructorimpl(C56391yDq.EZpvd(new java.lang.Exception("rootWalletList empty")));
                }
                C15274eCg c15274eCg = c17413fEk2.KWHzl;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                Intrinsics.copydefault(list);
                java.util.Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    java.util.List<InterfaceC9738bbJ> listKWHzl = ((InterfaceC9735bbG) it.next()).KWHzl();
                    java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(listKWHzl, 10));
                    java.util.Iterator<T> it2 = listKWHzl.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(((InterfaceC9738bbJ) it2.next()).DbNXlk());
                    }
                    arrayList.addAll(arrayList2);
                }
                walletManagerViewModel$getEIP7702WalletStatus$1.L$0 = null;
                walletManagerViewModel$getEIP7702WalletStatus$1.label = 2;
                java.lang.Object objKWHzl = c15274eCg.KWHzl(arrayList, false, walletManagerViewModel$getEIP7702WalletStatus$1);
                return objKWHzl == objCopydefault ? objCopydefault : objKWHzl;
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objWithContext);
                return ((Result) objWithContext).m7386unboximpl();
            }
            c17413fEk = (C17413fEk) walletManagerViewModel$getEIP7702WalletStatus$1.L$0;
            C56391yDq.AEQbTJ(objWithContext);
        }
        java.util.List<? extends InterfaceC9735bbG> list2 = (java.util.List) objWithContext;
        c17413fEk2 = c17413fEk;
        list = list2;
        if (!list.isEmpty()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(@NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
        WalletManagerViewModel$getTeeAndEIP7702WalletStatus$1 walletManagerViewModel$getTeeAndEIP7702WalletStatus$1;
        C17413fEk c17413fEk;
        if (continuation instanceof WalletManagerViewModel$getTeeAndEIP7702WalletStatus$1) {
            walletManagerViewModel$getTeeAndEIP7702WalletStatus$1 = (WalletManagerViewModel$getTeeAndEIP7702WalletStatus$1) continuation;
            int i = walletManagerViewModel$getTeeAndEIP7702WalletStatus$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                walletManagerViewModel$getTeeAndEIP7702WalletStatus$1.label = i - Integer.MIN_VALUE;
            } else {
                walletManagerViewModel$getTeeAndEIP7702WalletStatus$1 = new WalletManagerViewModel$getTeeAndEIP7702WalletStatus$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = walletManagerViewModel$getTeeAndEIP7702WalletStatus$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = walletManagerViewModel$getTeeAndEIP7702WalletStatus$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher io2 = Dispatchers.getIO();
            WalletManagerViewModel$getTeeAndEIP7702WalletStatus$rootWallets$1 walletManagerViewModel$getTeeAndEIP7702WalletStatus$rootWallets$1 = new WalletManagerViewModel$getTeeAndEIP7702WalletStatus$rootWallets$1(null);
            walletManagerViewModel$getTeeAndEIP7702WalletStatus$1.L$0 = this;
            walletManagerViewModel$getTeeAndEIP7702WalletStatus$1.label = 1;
            objWithContext = BuildersKt.withContext(io2, walletManagerViewModel$getTeeAndEIP7702WalletStatus$rootWallets$1, walletManagerViewModel$getTeeAndEIP7702WalletStatus$1);
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
            c17413fEk = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objWithContext);
                return Unit.INSTANCE;
            }
            c17413fEk = (C17413fEk) walletManagerViewModel$getTeeAndEIP7702WalletStatus$1.L$0;
            C56391yDq.AEQbTJ(objWithContext);
        }
        java.util.List list = (java.util.List) objWithContext;
        if (list.isEmpty()) {
            return Unit.INSTANCE;
        }
        C17926fXk c17926fXk = c17413fEk.fetchVPNInfo;
        Intrinsics.copydefault(list);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            AbstractC12784ctX abstractC12784ctX = (AbstractC12784ctX) obj;
            if (abstractC12784ctX.fJNWhG() == WalletType.HDWallet || abstractC12784ctX.fJNWhG() == WalletType.KeyWallet) {
                arrayList.add(obj);
            }
        }
        java.util.ArrayList<AbstractC12782ctV> arrayList2 = new java.util.ArrayList();
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C56406yEe.KWHzl(arrayList2, ((AbstractC12784ctX) it.next()).KWHzl());
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList2, 10));
        for (AbstractC12782ctV abstractC12782ctV : arrayList2) {
            arrayList3.add(new TeeAndEip7702Item(abstractC12782ctV.DbNXlk(), abstractC12782ctV.ejfBZ()));
        }
        walletManagerViewModel$getTeeAndEIP7702WalletStatus$1.L$0 = null;
        walletManagerViewModel$getTeeAndEIP7702WalletStatus$1.label = 2;
        if (c17926fXk.KWHzl(arrayList3, walletManagerViewModel$getTeeAndEIP7702WalletStatus$1) == objCopydefault) {
            return objCopydefault;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x008e -> B:28:0x00cd). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0094 -> B:28:0x00cd). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00ba -> B:27:0x00c0). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(java.util.List<? extends AbstractC12784ctX> list, java.util.Map<java.lang.String, ? extends EIP7702WalletStatus> map, Continuation<? super java.util.List<? extends fDL<java.lang.Object>>> continuation) throws java.lang.Throwable {
        WalletManagerViewModel$wrapRootWalletList$1 walletManagerViewModel$wrapRootWalletList$1;
        C17413fEk c17413fEk;
        java.util.Iterator<? extends AbstractC12784ctX> it;
        java.util.ArrayList<AbstractC12784ctX> arrayList;
        java.util.Map<java.lang.String, ? extends EIP7702WalletStatus> map2;
        java.util.List list2;
        java.lang.String mpcId;
        java.util.HashMap map3;
        if (continuation instanceof WalletManagerViewModel$wrapRootWalletList$1) {
            walletManagerViewModel$wrapRootWalletList$1 = (WalletManagerViewModel$wrapRootWalletList$1) continuation;
            int i = walletManagerViewModel$wrapRootWalletList$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                walletManagerViewModel$wrapRootWalletList$1.label = i - Integer.MIN_VALUE;
            } else {
                walletManagerViewModel$wrapRootWalletList$1 = new WalletManagerViewModel$wrapRootWalletList$1(this, continuation);
            }
        }
        java.lang.Object objEZpvd = walletManagerViewModel$wrapRootWalletList$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = walletManagerViewModel$wrapRootWalletList$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objEZpvd);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            c17413fEk = this;
            it = list.iterator();
            arrayList = arrayList3;
            map2 = map;
            list2 = arrayList2;
            if (it.hasNext()) {
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                arrayList = (java.util.ArrayList) walletManagerViewModel$wrapRootWalletList$1.L$1;
                list2 = (java.util.List) walletManagerViewModel$wrapRootWalletList$1.L$0;
                C56391yDq.AEQbTJ(objEZpvd);
                map3 = (java.util.HashMap) objEZpvd;
                if (map3 == null) {
                    map3 = new java.util.HashMap();
                }
                for (AbstractC12784ctX abstractC12784ctX : arrayList) {
                    MpcWalletEncodeInfo mpcWalletEncodeInfoIsConnected = abstractC12784ctX.isConnected();
                    java.lang.Integer num = (java.lang.Integer) map3.get(mpcWalletEncodeInfoIsConnected != null ? mpcWalletEncodeInfoIsConnected.getMpcId() : null);
                    abstractC12784ctX.AEQbTJ(num != null ? num.intValue() : 0);
                }
                list2.remove(yDY.AuCTel(list2));
                return list2;
            }
            AbstractC12784ctX abstractC12784ctX2 = (AbstractC12784ctX) walletManagerViewModel$wrapRootWalletList$1.L$6;
            AbstractC12784ctX abstractC12784ctX3 = (AbstractC12784ctX) walletManagerViewModel$wrapRootWalletList$1.L$5;
            it = (java.util.Iterator) walletManagerViewModel$wrapRootWalletList$1.L$4;
            java.util.ArrayList arrayList4 = (java.util.ArrayList) walletManagerViewModel$wrapRootWalletList$1.L$3;
            java.util.List list3 = (java.util.List) walletManagerViewModel$wrapRootWalletList$1.L$2;
            java.util.Map<java.lang.String, ? extends EIP7702WalletStatus> map4 = (java.util.Map) walletManagerViewModel$wrapRootWalletList$1.L$1;
            c17413fEk = (C17413fEk) walletManagerViewModel$wrapRootWalletList$1.L$0;
            C56391yDq.AEQbTJ(objEZpvd);
            abstractC12784ctX2.EZpvd(((java.lang.Number) objEZpvd).intValue());
            arrayList = arrayList4;
            map2 = map4;
            AbstractC12784ctX next = abstractC12784ctX3;
            list2 = list3;
            if (c17413fEk.AhwBna.valueOf(next)) {
                list2.add(new fEW(next));
            }
            list2.add(new fED());
            if (it.hasNext()) {
                next = it.next();
                list2.add(c17413fEk.KWHzl(next, map2));
                if (next.zLjUOn() && next.AubY()) {
                    arrayList.add(next);
                    C12827cuN instance$default = C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null);
                    java.lang.String strEZpvd = next.EZpvd();
                    walletManagerViewModel$wrapRootWalletList$1.L$0 = c17413fEk;
                    walletManagerViewModel$wrapRootWalletList$1.L$1 = map2;
                    walletManagerViewModel$wrapRootWalletList$1.L$2 = list2;
                    walletManagerViewModel$wrapRootWalletList$1.L$3 = arrayList;
                    walletManagerViewModel$wrapRootWalletList$1.L$4 = it;
                    walletManagerViewModel$wrapRootWalletList$1.L$5 = next;
                    walletManagerViewModel$wrapRootWalletList$1.L$6 = next;
                    walletManagerViewModel$wrapRootWalletList$1.label = 1;
                    java.lang.Object objOLrzqt = instance$default.OLrzqt(strEZpvd, walletManagerViewModel$wrapRootWalletList$1);
                    if (objOLrzqt == objCopydefault) {
                        return objCopydefault;
                    }
                    map4 = map2;
                    objEZpvd = objOLrzqt;
                    list3 = list2;
                    abstractC12784ctX3 = next;
                    arrayList4 = arrayList;
                    abstractC12784ctX2 = abstractC12784ctX3;
                    abstractC12784ctX2.EZpvd(((java.lang.Number) objEZpvd).intValue());
                    arrayList = arrayList4;
                    map2 = map4;
                    AbstractC12784ctX next2 = abstractC12784ctX3;
                    list2 = list3;
                }
                if (c17413fEk.AhwBna.valueOf(next2)) {
                }
                list2.add(new fED());
                if (it.hasNext()) {
                    fDT fdt = c17413fEk.AYXKKw;
                    if (fdt != null) {
                        java.util.ArrayList arrayList5 = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList, 10));
                        java.util.Iterator it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            MpcWalletEncodeInfo mpcWalletEncodeInfoIsConnected2 = ((AbstractC12784ctX) it2.next()).isConnected();
                            if (mpcWalletEncodeInfoIsConnected2 == null || (mpcId = mpcWalletEncodeInfoIsConnected2.getMpcId()) == null) {
                                mpcId = "";
                            }
                            arrayList5.add(mpcId);
                        }
                        walletManagerViewModel$wrapRootWalletList$1.L$0 = list2;
                        walletManagerViewModel$wrapRootWalletList$1.L$1 = arrayList;
                        walletManagerViewModel$wrapRootWalletList$1.L$2 = null;
                        walletManagerViewModel$wrapRootWalletList$1.L$3 = null;
                        walletManagerViewModel$wrapRootWalletList$1.L$4 = null;
                        walletManagerViewModel$wrapRootWalletList$1.L$5 = null;
                        walletManagerViewModel$wrapRootWalletList$1.L$6 = null;
                        walletManagerViewModel$wrapRootWalletList$1.label = 2;
                        objEZpvd = fdt.EZpvd(arrayList5, walletManagerViewModel$wrapRootWalletList$1);
                        if (objEZpvd == objCopydefault) {
                            return objCopydefault;
                        }
                        map3 = (java.util.HashMap) objEZpvd;
                        if (map3 == null) {
                        }
                        while (r13.hasNext()) {
                        }
                        list2.remove(yDY.AuCTel(list2));
                        return list2;
                    }
                    map3 = new java.util.HashMap();
                    while (r13.hasNext()) {
                    }
                    list2.remove(yDY.AuCTel(list2));
                    return list2;
                }
            }
        }
    }

    public final void AEQbTJ(@NotNull AbstractC12782ctV abstractC12782ctV) {
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        isConnected();
        AbstractC58260yxt<java.lang.Integer> abstractC58260yxtCopydefault = C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).copydefault(abstractC12782ctV.DbNXlk());
        final Function1 function1 = new Function1() { // from class: o.fEn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C17413fEk.AEQbTJ(this.AEQbTJ, (java.lang.Integer) obj);
            }
        };
        InterfaceC58227yxM<? super java.lang.Integer> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.fEl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C17413fEk.copydefault(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.fEo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C17413fEk.OLrzqt(this.OLrzqt, (java.lang.Throwable) obj);
            }
        };
        call().AEQbTJ(abstractC58260yxtCopydefault.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.fEt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C17413fEk.AEQbTJ(function12, obj);
            }
        }));
    }

    public static final void copydefault(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(C17413fEk c17413fEk, java.lang.Integer num) {
        c17413fEk.EZpvd();
        c17413fEk.AEQbTJ.setValue(java.lang.Boolean.TRUE);
        return Unit.INSTANCE;
    }

    public static final void AEQbTJ(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(C17413fEk c17413fEk, java.lang.Throwable th) {
        c17413fEk.EZpvd();
        pUU.copydefault(c17413fEk.values, "changeWallet error message :" + th.getMessage());
        c17413fEk.AEQbTJ.setValue(java.lang.Boolean.FALSE);
        return Unit.INSTANCE;
    }

    public final void isConnected() {
        this.djBIcL.setValue(java.lang.Boolean.TRUE);
    }

    public final void EZpvd() {
        this.djBIcL.setValue(java.lang.Boolean.FALSE);
    }

    public final C17351fCc.TaskDescription KWHzl(AbstractC12784ctX abstractC12784ctX, java.util.Map<java.lang.String, ? extends EIP7702WalletStatus> map) {
        return new C17351fCc.TaskDescription(abstractC12784ctX, false, false, map, 6, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(Continuation<? super Unit> continuation) throws java.lang.Throwable {
        WalletManagerViewModel$createDemoGuideData$1 walletManagerViewModel$createDemoGuideData$1;
        C17413fEk c17413fEk;
        MutableLiveData mutableLiveData;
        if (continuation instanceof WalletManagerViewModel$createDemoGuideData$1) {
            walletManagerViewModel$createDemoGuideData$1 = (WalletManagerViewModel$createDemoGuideData$1) continuation;
            int i = walletManagerViewModel$createDemoGuideData$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                walletManagerViewModel$createDemoGuideData$1.label = i - Integer.MIN_VALUE;
            } else {
                walletManagerViewModel$createDemoGuideData$1 = new WalletManagerViewModel$createDemoGuideData$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = walletManagerViewModel$createDemoGuideData$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = walletManagerViewModel$createDemoGuideData$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objCopydefault);
            cCD ccd = new cCD();
            ccd.gEmmrt(C33070mpX.AYXKKw(C13754dXa.FragmentManager.HJWChPQdUnVm) + " A");
            java.util.ArrayList arrayList = new java.util.ArrayList(3);
            Application application = new Application();
            application.fARcdN(C33070mpX.AYXKKw(C13754dXa.FragmentManager.setOnBackInvokedDispatcher) + " 01");
            application.EZpvd(true);
            application.OLrzqt(true);
            application.copydefault(true);
            application.AEQbTJ(true);
            application.zuBGHE("test_address_1");
            Application application2 = new Application();
            application2.fARcdN(C33070mpX.AYXKKw(C13754dXa.FragmentManager.setOnBackInvokedDispatcher) + " 02");
            application2.EZpvd(true);
            application2.OLrzqt(true);
            application.copydefault(true);
            application2.AEQbTJ(false);
            application2.zuBGHE("test_address_2");
            Application application3 = new Application();
            application3.fARcdN(C33070mpX.AYXKKw(C13754dXa.FragmentManager.RgaQzq) + " 01");
            application3.copydefault(WalletType.AAWallet);
            application3.EZpvd(true);
            application3.OLrzqt(true);
            application.copydefault(true);
            application3.AEQbTJ(false);
            application3.KWHzl(WalletType.HDWallet);
            application3.zuBGHE("test_address_3");
            arrayList.add(application);
            arrayList.add(application2);
            arrayList.add(application3);
            ccd.OLrzqt(arrayList);
            MutableLiveData<java.util.List<fDL<java.lang.Object>>> mutableLiveData2 = this.copydefault;
            java.util.List<? extends AbstractC12784ctX> listEZpvd = C56402yEa.EZpvd(ccd);
            walletManagerViewModel$createDemoGuideData$1.L$0 = this;
            walletManagerViewModel$createDemoGuideData$1.L$1 = mutableLiveData2;
            walletManagerViewModel$createDemoGuideData$1.label = 1;
            objCopydefault = copydefault(listEZpvd, null, walletManagerViewModel$createDemoGuideData$1);
            if (objCopydefault == objCopydefault2) {
                return objCopydefault2;
            }
            c17413fEk = this;
            mutableLiveData = mutableLiveData2;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            mutableLiveData = (MutableLiveData) walletManagerViewModel$createDemoGuideData$1.L$1;
            c17413fEk = (C17413fEk) walletManagerViewModel$createDemoGuideData$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
        }
        mutableLiveData.setValue(objCopydefault);
        c17413fEk.DbNXlk.setValue("0");
        c17413fEk.fJNWhG = 3;
        c17413fEk.ejfBZ.setValue(C56443yFo.AEQbTJ(3));
        return Unit.INSTANCE;
    }
}
