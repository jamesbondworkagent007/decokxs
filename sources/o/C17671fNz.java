package o;

import com.okinc.business.defi.biz.constant.WalletType;
import com.okinc.business.defi.biz.model.ChainAddress;
import com.okinc.business.defi.biz.net.bean.CheckAaAddressRequest;
import com.okinc.business.defi.biz.net.bean.CheckAaAddressResponse;
import com.okinc.business.defi.wallet.smart.AAAddressCheckManager$checkAllAddressList$1;
import com.okinc.business.defi.wallet.smart.AAAddressCheckManager$checkAllAddressList$2;
import com.okinc.business.defi.wallet.smart.AAAddressCheckManager$checkCreateAAWalletByRooWalletId$1;
import com.okinc.business.defi.wallet.smart.AAAddressCheckManager$deleteAAWalletOfZeroAsset$1;
import com.okinc.network.okg.response.OKServerException;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.rx2.RxAwaitKt;
import o.AbstractC43419rot;
import o.InterfaceC9738bbJ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fNz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C17671fNz {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int copydefault = 8;
    public final ConcurrentHashMap<java.lang.String, CheckAaAddressResponse> AEQbTJ;
    public final C13934dbu AYXKKw;
    public final C12827cuN AhwBna;
    public final MutableSharedFlow<java.util.Set<java.lang.String>> EZpvd;
    public volatile boolean KWHzl;
    public final C10954byG OLrzqt;
    public volatile boolean gEmmrt;
    public final SharedFlow<java.util.Set<java.lang.String>> valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<java.util.Set<java.lang.String>> KWHzl() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(boolean z) {
        this.KWHzl = z;
    }

    public C17671fNz(@NotNull C13934dbu c13934dbu, @NotNull C12827cuN c12827cuN, @NotNull C10954byG c10954byG) {
        Intrinsics.checkNotNullParameter(c13934dbu, "");
        Intrinsics.checkNotNullParameter(c12827cuN, "");
        Intrinsics.checkNotNullParameter(c10954byG, "");
        this.AYXKKw = c13934dbu;
        this.AhwBna = c12827cuN;
        this.OLrzqt = c10954byG;
        this.AEQbTJ = new ConcurrentHashMap<>();
        MutableSharedFlow<java.util.Set<java.lang.String>> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.EZpvd = mutableSharedFlowMutableSharedFlow$default;
        this.valueOf = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
        this.KWHzl = true;
        this.gEmmrt = true;
    }

    /* JADX INFO: renamed from: o.fNz$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.fNz.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public static /* synthetic */ C17671fNz getInstance$default(TaskDescription taskDescription, android.content.Context context, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                context = C9678baC.Companion.AEQbTJ();
            }
            return taskDescription.EZpvd(context);
        }

        public final C17671fNz EZpvd(@NotNull android.content.Context context) {
            Intrinsics.checkNotNullParameter(context, "");
            return C13458dMb.EZpvd(context).AEQbTJ();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(@NotNull Continuation<? super Result<java.lang.Boolean>> continuation) throws java.lang.Throwable {
        AAAddressCheckManager$checkAllAddressList$1 aAAddressCheckManager$checkAllAddressList$1;
        if (continuation instanceof AAAddressCheckManager$checkAllAddressList$1) {
            aAAddressCheckManager$checkAllAddressList$1 = (AAAddressCheckManager$checkAllAddressList$1) continuation;
            int i = aAAddressCheckManager$checkAllAddressList$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                aAAddressCheckManager$checkAllAddressList$1.label = i - Integer.MIN_VALUE;
            } else {
                aAAddressCheckManager$checkAllAddressList$1 = new AAAddressCheckManager$checkAllAddressList$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = aAAddressCheckManager$checkAllAddressList$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = aAAddressCheckManager$checkAllAddressList$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher io2 = Dispatchers.getIO();
            AAAddressCheckManager$checkAllAddressList$2 aAAddressCheckManager$checkAllAddressList$2 = new AAAddressCheckManager$checkAllAddressList$2(this, null);
            aAAddressCheckManager$checkAllAddressList$1.label = 1;
            objWithContext = BuildersKt.withContext(io2, aAAddressCheckManager$checkAllAddressList$2, aAAddressCheckManager$checkAllAddressList$1);
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objWithContext);
        }
        return ((Result) objWithContext).m7386unboximpl();
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:103:0x002b */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:26:0x0075 */
    /* JADX DEBUG: Type inference failed for r0v15. Raw type applied. Possible types: T */
    /* JADX DEBUG: Type inference failed for r14v0. Raw type applied. Possible types: java.util.Iterator<T>, java.util.Iterator */
    /* JADX DEBUG: Type inference failed for r16v1. Raw type applied. Possible types: java.util.Iterator<T>, java.util.Iterator */
    /* JADX DEBUG: Type inference failed for r6v1. Raw type applied. Possible types: T */
    /* JADX DEBUG: Type inference failed for r6v18. Raw type applied. Possible types: T */
    /* JADX DEBUG: Type inference failed for r6v7. Raw type applied. Possible types: java.util.Iterator<T>, java.util.Iterator */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01d8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01d9  */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v5, types: [kotlin.jvm.internal.Ref$BooleanRef] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16, types: [kotlin.jvm.internal.Ref$BooleanRef] */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v29 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [kotlin.jvm.internal.Ref$BooleanRef] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r5v0, types: [int] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r6v8, types: [T, java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(java.util.List<? extends AbstractC12784ctX> list, Continuation<? super java.lang.Boolean> continuation) throws java.lang.Throwable {
        AAAddressCheckManager$deleteAAWalletOfZeroAsset$1 aAAddressCheckManager$deleteAAWalletOfZeroAsset$1;
        ?? r11;
        ?? r2;
        Ref.ObjectRef objectRef;
        C17671fNz c17671fNz;
        ?? r22;
        C17671fNz c17671fNz2;
        java.util.Set<java.lang.String> set;
        java.lang.Object next;
        java.lang.String str;
        ?? r5;
        ?? r52;
        java.util.Set<java.lang.String> set2;
        MutableSharedFlow<java.util.Set<java.lang.String>> mutableSharedFlow;
        ?? r23;
        ?? r24 = "";
        if (continuation instanceof AAAddressCheckManager$deleteAAWalletOfZeroAsset$1) {
            aAAddressCheckManager$deleteAAWalletOfZeroAsset$1 = (AAAddressCheckManager$deleteAAWalletOfZeroAsset$1) continuation;
            int i = aAAddressCheckManager$deleteAAWalletOfZeroAsset$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                aAAddressCheckManager$deleteAAWalletOfZeroAsset$1.label = i - Integer.MIN_VALUE;
            } else {
                aAAddressCheckManager$deleteAAWalletOfZeroAsset$1 = new AAAddressCheckManager$deleteAAWalletOfZeroAsset$1(this, continuation);
            }
        }
        java.lang.Object obj = aAAddressCheckManager$deleteAAWalletOfZeroAsset$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        ?? r53 = aAAddressCheckManager$deleteAAWalletOfZeroAsset$1.label;
        try {
            try {
                try {
                } catch (java.lang.Throwable th) {
                    th = th;
                    r11 = r53;
                }
            } catch (CancellationException e) {
                throw e;
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
            r11 = r24;
        }
        if (r53 == 0) {
            C56391yDq.AEQbTJ(obj);
            if (!this.gEmmrt) {
                return C56443yFo.KWHzl(false);
            }
            Ref.BooleanRef booleanRef = new Ref.BooleanRef();
            Result.Application application = Result.Companion;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            java.util.Map mapOLrzqt = C56424yEw.OLrzqt(C59467zhb.fetchVPNInfo(C59467zhb.DbNXlk(C56427yEz.DbNXlk(this.AEQbTJ), new Function1() { // from class: o.fNx
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return java.lang.Boolean.valueOf(C17671fNz.OLrzqt((Map.Entry) obj2));
                }
            }), new Function1() { // from class: o.fNA
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return C17671fNz.KWHzl((Map.Entry) obj2);
                }
            }));
            if (!mapOLrzqt.isEmpty()) {
                objectRef = new Ref.ObjectRef();
                objectRef.element = "";
                for (AbstractC12784ctX abstractC12784ctX : list) {
                    java.lang.String str2 = "";
                    for (AbstractC12782ctV abstractC12782ctV : abstractC12784ctX.KWHzl()) {
                        if (abstractC12782ctV.getFieldNames()) {
                            str = str2;
                            for (Map.Entry entry : mapOLrzqt.entrySet()) {
                                java.lang.String str3 = (java.lang.String) entry.getKey();
                                if (abstractC12782ctV.DbNXlk((java.lang.String) entry.getValue())) {
                                    arrayList.add(abstractC12782ctV.DbNXlk());
                                    linkedHashSet.add(abstractC12784ctX.EZpvd());
                                    if (abstractC12782ctV.zuWLRA() && str.length() == 0) {
                                        str = str3;
                                    }
                                }
                            }
                        } else {
                            str = str2;
                        }
                        str2 = str;
                    }
                    if (((java.lang.CharSequence) objectRef.element).length() == 0 && str2.length() > 0) {
                        java.util.Iterator it = abstractC12784ctX.KWHzl().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                            java.lang.String str4 = str2;
                            if (((AbstractC12782ctV) next).DbNXlk(str4)) {
                                break;
                            }
                            str2 = str4;
                        }
                        AbstractC12782ctV abstractC12782ctV2 = (AbstractC12782ctV) next;
                        if (abstractC12782ctV2 != null) {
                            objectRef.element = abstractC12782ctV2.DbNXlk();
                        }
                    }
                }
                if (!arrayList.isEmpty()) {
                    AbstractC58260yxt<java.lang.Integer> abstractC58260yxtAuCTelauCTel = this.AhwBna.AuCTelauCTel(arrayList);
                    aAAddressCheckManager$deleteAAWalletOfZeroAsset$1.L$0 = this;
                    aAAddressCheckManager$deleteAAWalletOfZeroAsset$1.L$1 = booleanRef;
                    aAAddressCheckManager$deleteAAWalletOfZeroAsset$1.L$2 = linkedHashSet;
                    aAAddressCheckManager$deleteAAWalletOfZeroAsset$1.L$3 = objectRef;
                    aAAddressCheckManager$deleteAAWalletOfZeroAsset$1.label = 1;
                    if (RxAwaitKt.await(abstractC58260yxtAuCTelauCTel, aAAddressCheckManager$deleteAAWalletOfZeroAsset$1) == objCopydefault) {
                        return objCopydefault;
                    }
                    c17671fNz2 = this;
                    set = linkedHashSet;
                    r5 = booleanRef;
                } else {
                    c17671fNz = this;
                    r22 = booleanRef;
                    c17671fNz.gEmmrt = false;
                    r24 = r22;
                    Result.m7377constructorimpl(Unit.INSTANCE);
                    r2 = r24;
                    return C56443yFo.KWHzl(r2.element);
                }
            } else {
                r24 = booleanRef;
                Result.m7377constructorimpl(Unit.INSTANCE);
                r2 = r24;
                return C56443yFo.KWHzl(r2.element);
            }
        } else {
            if (r53 != 1) {
                if (r53 != 2) {
                    if (r53 != 3) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Ref.BooleanRef booleanRef2 = (Ref.BooleanRef) aAAddressCheckManager$deleteAAWalletOfZeroAsset$1.L$1;
                    c17671fNz = (C17671fNz) aAAddressCheckManager$deleteAAWalletOfZeroAsset$1.L$0;
                    C56391yDq.AEQbTJ(obj);
                    r23 = booleanRef2;
                    r23.element = true;
                    r22 = r23;
                    c17671fNz.gEmmrt = false;
                    r24 = r22;
                    Result.m7377constructorimpl(Unit.INSTANCE);
                    r2 = r24;
                    return C56443yFo.KWHzl(r2.element);
                }
                set = (java.util.Set) aAAddressCheckManager$deleteAAWalletOfZeroAsset$1.L$2;
                Ref.BooleanRef booleanRef3 = (Ref.BooleanRef) aAAddressCheckManager$deleteAAWalletOfZeroAsset$1.L$1;
                c17671fNz2 = (C17671fNz) aAAddressCheckManager$deleteAAWalletOfZeroAsset$1.L$0;
                C56391yDq.AEQbTJ(obj);
                r52 = booleanRef3;
                set2 = set;
                ?? r25 = r52;
                mutableSharedFlow = c17671fNz2.EZpvd;
                aAAddressCheckManager$deleteAAWalletOfZeroAsset$1.L$0 = c17671fNz2;
                aAAddressCheckManager$deleteAAWalletOfZeroAsset$1.L$1 = r25;
                aAAddressCheckManager$deleteAAWalletOfZeroAsset$1.L$2 = null;
                aAAddressCheckManager$deleteAAWalletOfZeroAsset$1.L$3 = null;
                aAAddressCheckManager$deleteAAWalletOfZeroAsset$1.label = 3;
                if (mutableSharedFlow.emit(set2, aAAddressCheckManager$deleteAAWalletOfZeroAsset$1) != objCopydefault) {
                    return objCopydefault;
                }
                c17671fNz = c17671fNz2;
                r23 = r25;
                r23.element = true;
                r22 = r23;
                c17671fNz.gEmmrt = false;
                r24 = r22;
                Result.m7377constructorimpl(Unit.INSTANCE);
                r2 = r24;
                return C56443yFo.KWHzl(r2.element);
            }
            Ref.ObjectRef objectRef2 = (Ref.ObjectRef) aAAddressCheckManager$deleteAAWalletOfZeroAsset$1.L$3;
            java.util.Set<java.lang.String> set3 = (java.util.Set) aAAddressCheckManager$deleteAAWalletOfZeroAsset$1.L$2;
            r11 = (Ref.BooleanRef) aAAddressCheckManager$deleteAAWalletOfZeroAsset$1.L$1;
            C17671fNz c17671fNz3 = (C17671fNz) aAAddressCheckManager$deleteAAWalletOfZeroAsset$1.L$0;
            try {
                C56391yDq.AEQbTJ(obj);
                objectRef = objectRef2;
                set = set3;
                r5 = r11;
                c17671fNz2 = c17671fNz3;
            } catch (java.lang.Throwable th3) {
                th = th3;
                Result.Application application2 = Result.Companion;
                Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                r2 = r11;
            }
        }
        r52 = r5;
        if (((java.lang.CharSequence) objectRef.element).length() > 0) {
            AbstractC58260yxt<java.lang.Integer> abstractC58260yxtCopydefault = c17671fNz2.AhwBna.copydefault((java.lang.String) objectRef.element);
            aAAddressCheckManager$deleteAAWalletOfZeroAsset$1.L$0 = c17671fNz2;
            aAAddressCheckManager$deleteAAWalletOfZeroAsset$1.L$1 = r5;
            aAAddressCheckManager$deleteAAWalletOfZeroAsset$1.L$2 = set;
            aAAddressCheckManager$deleteAAWalletOfZeroAsset$1.L$3 = null;
            aAAddressCheckManager$deleteAAWalletOfZeroAsset$1.label = 2;
            r52 = r5;
            if (RxAwaitKt.await(abstractC58260yxtCopydefault, aAAddressCheckManager$deleteAAWalletOfZeroAsset$1) == objCopydefault) {
                return objCopydefault;
            }
        }
        set2 = set;
        ?? r252 = r52;
        mutableSharedFlow = c17671fNz2.EZpvd;
        aAAddressCheckManager$deleteAAWalletOfZeroAsset$1.L$0 = c17671fNz2;
        aAAddressCheckManager$deleteAAWalletOfZeroAsset$1.L$1 = r252;
        aAAddressCheckManager$deleteAAWalletOfZeroAsset$1.L$2 = null;
        aAAddressCheckManager$deleteAAWalletOfZeroAsset$1.L$3 = null;
        aAAddressCheckManager$deleteAAWalletOfZeroAsset$1.label = 3;
        if (mutableSharedFlow.emit(set2, aAAddressCheckManager$deleteAAWalletOfZeroAsset$1) != objCopydefault) {
        }
    }

    public static final boolean OLrzqt(Map.Entry entry) {
        Intrinsics.checkNotNullParameter(entry, "");
        return !((CheckAaAddressResponse) entry.getValue()).getHasAaAddress() && C33129mqd.OLrzqt((java.lang.CharSequence) ((CheckAaAddressResponse) entry.getValue()).getAaAddress());
    }

    public static final kotlin.Pair KWHzl(Map.Entry entry) {
        Intrinsics.checkNotNullParameter(entry, "");
        java.lang.Object key = entry.getKey();
        java.lang.String aaAddress = ((CheckAaAddressResponse) entry.getValue()).getAaAddress();
        Intrinsics.copydefault((java.lang.Object) aaAddress);
        return C56390yDp.OLrzqt(key, aaAddress);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00b0 A[Catch: all -> 0x0113, CancellationException -> 0x027a, TRY_LEAVE, TryCatch #1 {all -> 0x0113, blocks: (B:28:0x00a0, B:29:0x00aa, B:31:0x00b0), top: B:139:0x00a0 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(@NotNull java.lang.String str, @NotNull Continuation<? super java.lang.Boolean> continuation) throws java.lang.Throwable {
        AAAddressCheckManager$checkCreateAAWalletByRooWalletId$1 aAAddressCheckManager$checkCreateAAWalletByRooWalletId$1;
        java.util.ArrayList arrayList;
        java.util.HashSet hashSet;
        long jFetchVPNInfo;
        C17671fNz c17671fNz;
        C17671fNz c17671fNz2;
        long j;
        java.util.ArrayList arrayList2;
        java.util.ArrayList arrayList3;
        java.lang.Object objM7377constructorimpl;
        java.lang.Throwable thM7380exceptionOrNullimpl;
        java.util.HashSet hashSet2;
        java.util.ArrayList<java.lang.String> arrayList4;
        C17671fNz c17671fNz3;
        java.lang.String address;
        java.lang.String eoaAddress;
        CheckAaAddressResponse checkAaAddressResponse;
        CheckAaAddressResponse checkAaAddressResponse2;
        if (continuation instanceof AAAddressCheckManager$checkCreateAAWalletByRooWalletId$1) {
            aAAddressCheckManager$checkCreateAAWalletByRooWalletId$1 = (AAAddressCheckManager$checkCreateAAWalletByRooWalletId$1) continuation;
            int i = aAAddressCheckManager$checkCreateAAWalletByRooWalletId$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                aAAddressCheckManager$checkCreateAAWalletByRooWalletId$1.label = i - Integer.MIN_VALUE;
            } else {
                aAAddressCheckManager$checkCreateAAWalletByRooWalletId$1 = new AAAddressCheckManager$checkCreateAAWalletByRooWalletId$1(this, continuation);
            }
        }
        java.lang.Object objAwait = aAAddressCheckManager$checkCreateAAWalletByRooWalletId$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = aAAddressCheckManager$checkCreateAAWalletByRooWalletId$1.label;
        boolean z = false;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objAwait);
                arrayList = new java.util.ArrayList();
                hashSet = new java.util.HashSet();
                C10854bwM c10854bwMIsConnected = this.OLrzqt.valueOf().isConnected();
                jFetchVPNInfo = c10854bwMIsConnected != null ? c10854bwMIsConnected.fetchVPNInfo() : -1L;
                try {
                    Result.Application application = Result.Companion;
                    AbstractC58260yxt<AbstractC12784ctX> abstractC58260yxtDjBIcL = this.AhwBna.djBIcL(str);
                    aAAddressCheckManager$checkCreateAAWalletByRooWalletId$1.L$0 = this;
                    aAAddressCheckManager$checkCreateAAWalletByRooWalletId$1.L$1 = arrayList;
                    aAAddressCheckManager$checkCreateAAWalletByRooWalletId$1.L$2 = hashSet;
                    aAAddressCheckManager$checkCreateAAWalletByRooWalletId$1.J$0 = jFetchVPNInfo;
                    aAAddressCheckManager$checkCreateAAWalletByRooWalletId$1.label = 1;
                    objAwait = RxAwaitKt.await(abstractC58260yxtDjBIcL, aAAddressCheckManager$checkCreateAAWalletByRooWalletId$1);
                } catch (java.lang.Throwable th) {
                    th = th;
                    c17671fNz = this;
                    Result.Application application2 = Result.Companion;
                    objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                    arrayList3 = arrayList;
                    thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                    if (thM7380exceptionOrNullimpl != null) {
                    }
                }
                if (objAwait == objCopydefault) {
                    return objCopydefault;
                }
                c17671fNz2 = this;
                j = jFetchVPNInfo;
                arrayList2 = arrayList;
                while (r0.hasNext()) {
                }
                arrayList3 = arrayList2;
                objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
                jFetchVPNInfo = j;
                c17671fNz = c17671fNz2;
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                if (thM7380exceptionOrNullimpl != null) {
                }
            } else if (i2 == 1) {
                jFetchVPNInfo = aAAddressCheckManager$checkCreateAAWalletByRooWalletId$1.J$0;
                hashSet = (java.util.HashSet) aAAddressCheckManager$checkCreateAAWalletByRooWalletId$1.L$2;
                arrayList = (java.util.ArrayList) aAAddressCheckManager$checkCreateAAWalletByRooWalletId$1.L$1;
                c17671fNz = (C17671fNz) aAAddressCheckManager$checkCreateAAWalletByRooWalletId$1.L$0;
                try {
                    C56391yDq.AEQbTJ(objAwait);
                    j = jFetchVPNInfo;
                    arrayList2 = arrayList;
                    c17671fNz2 = c17671fNz;
                    try {
                        for (AbstractC12782ctV abstractC12782ctV : ((AbstractC12784ctX) objAwait).KWHzl()) {
                            arrayList3 = arrayList2;
                            try {
                                ChainAddress chainAddress = (ChainAddress) InterfaceC9738bbJ.StateListAnimator.addressFromRealChainId$default(abstractC12782ctV, j, null, 2, null);
                                java.lang.String str2 = "";
                                if (chainAddress == null || (address = chainAddress.getAddress()) == null) {
                                    address = "";
                                }
                                if (abstractC12782ctV.getFieldNames()) {
                                    if (chainAddress != null && (eoaAddress = chainAddress.getEoaAddress()) != null) {
                                        str2 = eoaAddress;
                                    }
                                    if (!hashSet.contains(str2)) {
                                        hashSet.add(str2);
                                    }
                                }
                                if (abstractC12782ctV.QwvEab() != WalletType.TrackingWallet && !abstractC12782ctV.getFieldNames() && abstractC12782ctV.AuCTelauCTel()) {
                                    arrayList3.add(address);
                                }
                                arrayList2 = arrayList3;
                            } catch (java.lang.Throwable th2) {
                                th = th2;
                                arrayList = arrayList3;
                                jFetchVPNInfo = j;
                                c17671fNz = c17671fNz2;
                                Result.Application application22 = Result.Companion;
                                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                                arrayList3 = arrayList;
                                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                                if (thM7380exceptionOrNullimpl != null) {
                                }
                            }
                        }
                        arrayList3 = arrayList2;
                        objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
                        jFetchVPNInfo = j;
                        c17671fNz = c17671fNz2;
                    } catch (java.lang.Throwable th3) {
                        th = th3;
                        arrayList3 = arrayList2;
                    }
                } catch (java.lang.Throwable th4) {
                    th = th4;
                    Result.Application application222 = Result.Companion;
                    objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                    arrayList3 = arrayList;
                    thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                    if (thM7380exceptionOrNullimpl != null) {
                    }
                }
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                if (thM7380exceptionOrNullimpl != null) {
                    pUU.copydefault("AAAddressCheckManager", "checkCreateAAWalletByRooWalletId error message = " + thM7380exceptionOrNullimpl.getMessage());
                    return C56443yFo.KWHzl(false);
                }
                java.util.ArrayList arrayList5 = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList3, 10));
                java.util.Iterator it = arrayList3.iterator();
                while (it.hasNext()) {
                    arrayList5.add(new CheckAaAddressRequest((java.lang.String) it.next(), jFetchVPNInfo));
                }
                if (arrayList5.isEmpty()) {
                    return C56443yFo.KWHzl(false);
                }
                C13934dbu c13934dbu = c17671fNz.AYXKKw;
                aAAddressCheckManager$checkCreateAAWalletByRooWalletId$1.L$0 = c17671fNz;
                aAAddressCheckManager$checkCreateAAWalletByRooWalletId$1.L$1 = arrayList3;
                aAAddressCheckManager$checkCreateAAWalletByRooWalletId$1.L$2 = hashSet;
                aAAddressCheckManager$checkCreateAAWalletByRooWalletId$1.label = 2;
                objAwait = c13934dbu.KWHzl(arrayList5, aAAddressCheckManager$checkCreateAAWalletByRooWalletId$1);
                if (objAwait == objCopydefault) {
                    return objCopydefault;
                }
                hashSet2 = hashSet;
                arrayList4 = arrayList3;
                c17671fNz3 = c17671fNz;
            } else {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                hashSet2 = (java.util.HashSet) aAAddressCheckManager$checkCreateAAWalletByRooWalletId$1.L$2;
                arrayList4 = (java.util.ArrayList) aAAddressCheckManager$checkCreateAAWalletByRooWalletId$1.L$1;
                c17671fNz3 = (C17671fNz) aAAddressCheckManager$checkCreateAAWalletByRooWalletId$1.L$0;
                C56391yDq.AEQbTJ(objAwait);
            }
            AbstractC43419rot abstractC43419rot = (AbstractC43419rot) objAwait;
            if (abstractC43419rot instanceof AbstractC43419rot.StateListAnimator) {
                java.util.List<CheckAaAddressResponse> list = (java.util.List) ((AbstractC43419rot.StateListAnimator) abstractC43419rot).KWHzl();
                for (CheckAaAddressResponse checkAaAddressResponse3 : list) {
                    if (!c17671fNz3.AEQbTJ.containsKey(checkAaAddressResponse3.getEoaAddress())) {
                        c17671fNz3.AEQbTJ.put(checkAaAddressResponse3.getEoaAddress(), checkAaAddressResponse3);
                    }
                }
                if (!(list instanceof java.util.Collection) || !list.isEmpty()) {
                    java.util.Iterator it2 = list.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        CheckAaAddressResponse checkAaAddressResponse4 = (CheckAaAddressResponse) it2.next();
                        if (checkAaAddressResponse4.getHasAaAddress() && !hashSet2.contains(checkAaAddressResponse4.getEoaAddress())) {
                            z = true;
                            break;
                        }
                    }
                }
                return C56443yFo.KWHzl(z);
            }
            if (abstractC43419rot instanceof AbstractC43419rot.ActionBar) {
                pUU.copydefault("AAAddressCheckManager", "checkAllAddressList error message = " + ((OKServerException) ((AbstractC43419rot.ActionBar) abstractC43419rot).KWHzl()).getMessage());
                for (java.lang.String str3 : arrayList4) {
                    if (!hashSet2.contains(str3) && (checkAaAddressResponse2 = c17671fNz3.AEQbTJ.get(str3)) != null && checkAaAddressResponse2.getHasAaAddress()) {
                        return C56443yFo.KWHzl(true);
                    }
                }
                return C56443yFo.KWHzl(false);
            }
            for (java.lang.String str4 : arrayList4) {
                if (!hashSet2.contains(str4) && (checkAaAddressResponse = c17671fNz3.AEQbTJ.get(str4)) != null) {
                    if (checkAaAddressResponse.getHasAaAddress()) {
                        return C56443yFo.KWHzl(true);
                    }
                }
            }
            return C56443yFo.KWHzl(false);
        } catch (CancellationException e) {
            throw e;
        }
    }

    public final boolean EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        CheckAaAddressResponse checkAaAddressResponse = this.AEQbTJ.get(str);
        return checkAaAddressResponse != null && checkAaAddressResponse.getHasAaAddress();
    }
}
