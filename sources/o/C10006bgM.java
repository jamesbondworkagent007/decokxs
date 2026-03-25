package o;

import androidx.lifecycle.MutableLiveData;
import com.okinc.business.defi.biz.core.customchain.meta.CustomChainCoinMeta;
import com.okinc.business.defi.biz.core.wallet.update.WalletUpdateWorker;
import com.okinc.business.defi.biz.net.bean.AddCoinReq;
import com.okinc.business.defi.wallet.metricsmonitor.AddOrRemoveType;
import com.okinc.rxutils.RxBus;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.Bitmap;
import o.C10026bgg;
import o.C10407bnq;
import o.C13754dXa;
import o.InterfaceC18445fiY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bgM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C10006bgM extends AbstractC33073mpa {
    public final InterfaceC18445fiY EZpvd;
    public final C10407bnq KWHzl;
    public final java.util.ArrayList<C10026bgg.TaskDescription> OLrzqt;
    public final MutableLiveData<Bitmap<java.util.List<C10026bgg.TaskDescription>>> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C10006bgM() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final java.lang.Boolean OLrzqt(java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        return java.lang.Boolean.TRUE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.ArrayList<C10026bgg.TaskDescription> KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<Bitmap<java.util.List<C10026bgg.TaskDescription>>> OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0016: CONSTRUCTOR 
  (wrap:o.bnq:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:o.bnq:0x0008: INVOKE 
  (wrap:o.bnq$ActionBar:0x0006: SGET  A[WRAPPED] (LINE:33) o.bnq.Companion o.bnq$ActionBar)
  (null android.content.Context)
  (1 int)
  (null java.lang.Object)
 STATIC call: o.bnq.ActionBar.getInstance$default(o.bnq$ActionBar, android.content.Context, int, java.lang.Object):o.bnq A[MD:(o.bnq$ActionBar, android.content.Context, int, java.lang.Object):o.bnq (m), WRAPPED] (LINE:33)) : (r3v0 o.bnq))
  (wrap:o.fiY:?: TERNARY null = ((wrap:int:0x000c: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:o.fiY:0x0012: INVOKE 
  (wrap:o.fiY$StateListAnimator:0x0010: SGET  A[WRAPPED] (LINE:34) o.fiY.Companion o.fiY$StateListAnimator)
  (null android.content.Context)
  (1 int)
  (null java.lang.Object)
 STATIC call: o.fiY.StateListAnimator.getInstance$default(o.fiY$StateListAnimator, android.content.Context, int, java.lang.Object):o.fiY A[MD:(o.fiY$StateListAnimator, android.content.Context, int, java.lang.Object):o.fiY (m), WRAPPED] (LINE:34)) : (r4v0 o.fiY))
 A[MD:(o.bnq, o.fiY):void (m)] (LINE:32) call: o.bgM.<init>(o.bnq, o.fiY):void type: THIS */
    public /* synthetic */ C10006bgM(C10407bnq c10407bnq, InterfaceC18445fiY interfaceC18445fiY, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C10407bnq.ActionBar.getInstance$default(C10407bnq.Companion, null, 1, null) : c10407bnq, (i & 2) != 0 ? InterfaceC18445fiY.StateListAnimator.getInstance$default(InterfaceC18445fiY.Companion, null, 1, null) : interfaceC18445fiY);
    }

    public C10006bgM(@NotNull C10407bnq c10407bnq, @NotNull InterfaceC18445fiY interfaceC18445fiY) {
        Intrinsics.checkNotNullParameter(c10407bnq, "");
        Intrinsics.checkNotNullParameter(interfaceC18445fiY, "");
        this.KWHzl = c10407bnq;
        this.EZpvd = interfaceC18445fiY;
        this.copydefault = new MutableLiveData<>();
        this.OLrzqt = new java.util.ArrayList<>();
    }

    public static /* synthetic */ void getCoinList$default(C10006bgM c10006bgM, long j, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            j = Long.MIN_VALUE;
        }
        c10006bgM.EZpvd(j);
    }

    public final void EZpvd(long j) {
        this.copydefault.setValue(new Bitmap.TaskDescription());
        if (j == Long.MIN_VALUE) {
            AbstractC58260yxt<C10404bnn> abstractC58260yxtKWHzl = this.KWHzl.KWHzl(j);
            AbstractC58260yxt<java.util.List<C10594brR>> abstractC58260yxtCopydefault = this.KWHzl.copydefault(Long.MIN_VALUE);
            final Function2 function2 = new Function2() { // from class: o.bgL
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return C10006bgM.AEQbTJ(this.copydefault, (C10404bnn) obj, (java.util.List) obj2);
                }
            };
            AbstractC58260yxt abstractC58260yxtOLrzqt = AbstractC58260yxt.OLrzqt(abstractC58260yxtKWHzl, abstractC58260yxtCopydefault, new InterfaceC58223yxI() { // from class: o.bhm
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58223yxI
                public final java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) {
                    return C10006bgM.AEQbTJ(function2, obj, obj2);
                }
            }).OLrzqt(C58266yxz.OLrzqt());
            final Function1 function1 = new Function1() { // from class: o.bgJ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C10006bgM.djBIcL(this.OLrzqt, (java.util.List) obj);
                }
            };
            InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.bgK
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    C10006bgM.fARcdN(function1, obj);
                }
            };
            final Function1 function12 = new Function1() { // from class: o.bgP
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C10006bgM.AYXKKw(this.copydefault, (java.lang.Throwable) obj);
                }
            };
            InterfaceC58217yxC interfaceC58217yxCAEQbTJ = abstractC58260yxtOLrzqt.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.bgO
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    C10006bgM.fIwbmz(function12, obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(interfaceC58217yxCAEQbTJ, "");
            call().AEQbTJ(interfaceC58217yxCAEQbTJ);
            return;
        }
        if (j >= 0) {
            AbstractC58260yxt<C10404bnn> abstractC58260yxtOLrzqt2 = this.KWHzl.KWHzl(j).OLrzqt(yBP.KWHzl());
            final Function1 function13 = new Function1() { // from class: o.bgS
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C10006bgM.copydefault(this.EZpvd, (C10404bnn) obj);
                }
            };
            AbstractC58260yxt abstractC58260yxtOLrzqt3 = abstractC58260yxtOLrzqt2.copydefault(new InterfaceC58229yxO() { // from class: o.bgQ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return C10006bgM.AuCTel(function13, obj);
                }
            }).OLrzqt(C58266yxz.OLrzqt());
            final Function1 function14 = new Function1() { // from class: o.bgR
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C10006bgM.gEmmrt(this.OLrzqt, (java.util.List) obj);
                }
            };
            InterfaceC58227yxM interfaceC58227yxM2 = new InterfaceC58227yxM() { // from class: o.bgW
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    C10006bgM.ejfBZ(function14, obj);
                }
            };
            final Function1 function15 = new Function1() { // from class: o.bgN
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C10006bgM.AEQbTJ(this.EZpvd, (java.lang.Throwable) obj);
                }
            };
            InterfaceC58217yxC interfaceC58217yxCAEQbTJ2 = abstractC58260yxtOLrzqt3.AEQbTJ(interfaceC58227yxM2, new InterfaceC58227yxM() { // from class: o.bgX
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    C10006bgM.isConnected(function15, obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(interfaceC58217yxCAEQbTJ2, "");
            call().AEQbTJ(interfaceC58217yxCAEQbTJ2);
            return;
        }
        AbstractC58260yxt<java.util.List<C10594brR>> abstractC58260yxtOLrzqt4 = this.KWHzl.copydefault(j).OLrzqt(yBP.KWHzl());
        final Function1 function16 = new Function1() { // from class: o.bhh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C10006bgM.KWHzl(this.KWHzl, (java.util.List) obj);
            }
        };
        AbstractC58260yxt abstractC58260yxtOLrzqt5 = abstractC58260yxtOLrzqt4.OLrzqt(new InterfaceC58229yxO() { // from class: o.bhg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C10006bgM.DbNXlk(function16, obj);
            }
        }).OLrzqt(C58266yxz.OLrzqt());
        final Function1 function17 = new Function1() { // from class: o.bhf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C10006bgM.AYXKKw(this.AEQbTJ, (java.util.List) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM3 = new InterfaceC58227yxM() { // from class: o.bhj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C10006bgM.fetchVPNInfo(function17, obj);
            }
        };
        final Function1 function18 = new Function1() { // from class: o.bhi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C10006bgM.OLrzqt(this.KWHzl, (java.lang.Throwable) obj);
            }
        };
        InterfaceC58217yxC interfaceC58217yxCAEQbTJ3 = abstractC58260yxtOLrzqt5.AEQbTJ(interfaceC58227yxM3, new InterfaceC58227yxM() { // from class: o.bhl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C10006bgM.fJNWhG(function18, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(interfaceC58217yxCAEQbTJ3, "");
        call().AEQbTJ(interfaceC58217yxCAEQbTJ3);
    }

    public static final java.util.List AEQbTJ(Function2 function2, java.lang.Object obj, java.lang.Object obj2) {
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(obj2, "");
        return (java.util.List) function2.invoke(obj, obj2);
    }

    public static final java.util.List AEQbTJ(C10006bgM c10006bgM, C10404bnn c10404bnn, java.util.List list) {
        Intrinsics.checkNotNullParameter(c10404bnn, "");
        Intrinsics.checkNotNullParameter(list, "");
        java.util.List<C10026bgg.TaskDescription> listKWHzl = c10006bgM.KWHzl(c10404bnn.OLrzqt());
        c10006bgM.OLrzqt.clear();
        c10006bgM.OLrzqt.addAll(c10006bgM.KWHzl(c10404bnn.KWHzl()));
        java.util.List<C10026bgg.TaskDescription> listAEQbTJ = c10006bgM.AEQbTJ((java.util.List<C10594brR>) list);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.addAll(listKWHzl);
        arrayList.addAll(listAEQbTJ);
        return arrayList;
    }

    public static final void fARcdN(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit djBIcL(C10006bgM c10006bgM, java.util.List list) {
        c10006bgM.copydefault.setValue(new Bitmap.StateListAnimator(list));
        return Unit.INSTANCE;
    }

    public static final void fIwbmz(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AYXKKw(C10006bgM c10006bgM, java.lang.Throwable th) {
        c10006bgM.copydefault.setValue(new Bitmap.ActionBar(th.getMessage(), null, 2, null));
        return Unit.INSTANCE;
    }

    public static final java.util.List AuCTel(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.util.List) function1.invoke(obj);
    }

    public static final java.util.List copydefault(C10006bgM c10006bgM, C10404bnn c10404bnn) {
        Intrinsics.checkNotNullParameter(c10404bnn, "");
        c10006bgM.OLrzqt.clear();
        c10006bgM.OLrzqt.addAll(c10006bgM.KWHzl(c10404bnn.KWHzl()));
        return c10006bgM.KWHzl(c10404bnn.OLrzqt());
    }

    public static final void ejfBZ(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit gEmmrt(C10006bgM c10006bgM, java.util.List list) {
        c10006bgM.copydefault.setValue(new Bitmap.StateListAnimator(list));
        return Unit.INSTANCE;
    }

    public static final void isConnected(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(C10006bgM c10006bgM, java.lang.Throwable th) {
        c10006bgM.copydefault.setValue(new Bitmap.ActionBar(th.getMessage(), null, 2, null));
        return Unit.INSTANCE;
    }

    public static final InterfaceC58261yxu DbNXlk(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu KWHzl(C10006bgM c10006bgM, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        return AbstractC58260yxt.copydefault(c10006bgM.AEQbTJ((java.util.List<C10594brR>) list));
    }

    public static final void fetchVPNInfo(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AYXKKw(C10006bgM c10006bgM, java.util.List list) {
        c10006bgM.copydefault.setValue(new Bitmap.StateListAnimator(list));
        return Unit.INSTANCE;
    }

    public static final void fJNWhG(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(C10006bgM c10006bgM, java.lang.Throwable th) {
        c10006bgM.copydefault.setValue(new Bitmap.ActionBar(th.getMessage(), null, 2, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.bgM$Application */
    public static final class Application<T> implements java.util.Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            CustomChainCoinMeta customChainCoinMetaDjBIcL = ((C10026bgg.TaskDescription) t).djBIcL();
            boolean z = false;
            boolean z2 = customChainCoinMetaDjBIcL != null && customChainCoinMetaDjBIcL.AYXKKw() == 1;
            CustomChainCoinMeta customChainCoinMetaDjBIcL2 = ((C10026bgg.TaskDescription) t2).djBIcL();
            if (customChainCoinMetaDjBIcL2 != null && customChainCoinMetaDjBIcL2.AYXKKw() == 1) {
                z = true;
            }
            return yET.KWHzl(java.lang.Boolean.valueOf(!z2), java.lang.Boolean.valueOf(!z));
        }
    }

    public final void copydefault(@NotNull final C10324bmM c10324bmM, final int i, @NotNull final C10026bgg.TaskDescription taskDescription, @NotNull final Function0<Unit> function0) {
        AbstractC58185ywX<java.lang.Boolean> abstractC58185ywXKWHzl;
        C10854bwM c10854bwMKWHzl;
        AbstractC12782ctV abstractC12782ctV;
        C10862bwU c10862bwU;
        java.util.List<AddCoinReq> listEZpvd;
        java.util.List<AddCoinReq> arrayList;
        AbstractC12782ctV abstractC12782ctV2;
        C10862bwU c10862bwU2;
        Intrinsics.checkNotNullParameter(c10324bmM, "");
        Intrinsics.checkNotNullParameter(taskDescription, "");
        Intrinsics.checkNotNullParameter(function0, "");
        if (i == 0 && !this.KWHzl.gEmmrt(taskDescription.AhwBna()) && !taskDescription.OLrzqt()) {
            c10324bmM.setCheckState(taskDescription.gEmmrt());
            C33134mqi.copydefault(C13754dXa.FragmentManager.gVEiQJ);
            return;
        }
        if (!taskDescription.OLrzqt()) {
            C10525bqB c10525bqBCopydefault = taskDescription.copydefault();
            final boolean z = i == 1;
            if (c10525bqBCopydefault != null && (c10854bwMKWHzl = c10525bqBCopydefault.KWHzl()) != null && c10854bwMKWHzl.AuCTelauCTel() == 4) {
                java.lang.String strAhwBna = WalletUpdateWorker.Application.getInstance$default(WalletUpdateWorker.Companion, null, 1, null).AhwBna();
                C10862bwU c10862bwUAYXKKw = C10954byG.EZpvd.AYXKKw();
                AbstractC12782ctV abstractC12782ctVValues = c10525bqBCopydefault.values();
                if (c10525bqBCopydefault.ORxRYg()) {
                    java.util.ArrayList<java.lang.Long> arrayListFARcdN = c10525bqBCopydefault.fARcdN();
                    if (arrayListFARcdN == null) {
                        abstractC12782ctV = abstractC12782ctVValues;
                        c10862bwU = c10862bwUAYXKKw;
                        listEZpvd = yDY.AhwBna();
                    } else {
                        arrayList = new java.util.ArrayList<>(C56403yEb.AYXKKw(arrayListFARcdN, 10));
                        java.util.Iterator<T> it = arrayListFARcdN.iterator();
                        while (it.hasNext()) {
                            java.util.List<AddCoinReq> list = arrayList;
                            list.add(new AddCoinReq((java.lang.Long) null, (java.lang.String) null, (java.lang.String) null, 0, strAhwBna, c10525bqBCopydefault.values().DbNXlk(), (java.lang.Integer) null, java.lang.Long.valueOf(((java.lang.Number) it.next()).longValue()), 79, (DefaultConstructorMarker) null));
                            arrayList = list;
                            abstractC12782ctVValues = abstractC12782ctVValues;
                            c10862bwUAYXKKw = c10862bwUAYXKKw;
                        }
                        abstractC12782ctV2 = abstractC12782ctVValues;
                        c10862bwU2 = c10862bwUAYXKKw;
                        abstractC58185ywXKWHzl = c10862bwU2.OLrzqt(abstractC12782ctV2, arrayList);
                    }
                } else {
                    abstractC12782ctV = abstractC12782ctVValues;
                    c10862bwU = c10862bwUAYXKKw;
                    listEZpvd = C56402yEa.EZpvd(new AddCoinReq((java.lang.Long) null, (java.lang.String) null, (java.lang.String) null, 0, strAhwBna, c10525bqBCopydefault.values().DbNXlk(), (java.lang.Integer) null, java.lang.Long.valueOf(c10525bqBCopydefault.OLrzqt()), 79, (DefaultConstructorMarker) null));
                }
                arrayList = listEZpvd;
                abstractC12782ctV2 = abstractC12782ctV;
                c10862bwU2 = c10862bwU;
                abstractC58185ywXKWHzl = c10862bwU2.OLrzqt(abstractC12782ctV2, arrayList);
            } else {
                abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(java.lang.Boolean.TRUE);
            }
            final Function1 function1 = new Function1() { // from class: o.bgT
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C10006bgM.KWHzl(taskDescription, z, (java.lang.Boolean) obj);
                }
            };
            AbstractC58185ywX<R> abstractC58185ywXCopydefault = abstractC58185ywXKWHzl.copydefault(new InterfaceC58229yxO() { // from class: o.bhb
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return C10006bgM.hDKMBd(function1, obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXCopydefault, "");
            final boolean z2 = z;
            call().AEQbTJ(C33024moe.subscribeOnIO$default(abstractC58185ywXCopydefault, new Function1() { // from class: o.bhc
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C10006bgM.AEQbTJ(c10324bmM, taskDescription, (java.lang.Throwable) obj);
                }
            }, (Function0) null, new Function1() { // from class: o.bha
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C10006bgM.KWHzl(taskDescription, i, this, z2, function0, (java.lang.Boolean) obj);
                }
            }, 2, (java.lang.Object) null));
            return;
        }
        AbstractC58260yxt<java.lang.Long> abstractC58260yxtAEQbTJ = this.KWHzl.AEQbTJ(taskDescription.AhwBna(), i == 1);
        final Function1 function12 = new Function1() { // from class: o.bgY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C10006bgM.OLrzqt(taskDescription, i, function0, this, (java.lang.Long) obj);
            }
        };
        InterfaceC58227yxM<? super java.lang.Long> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.bgZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C10006bgM.getNewProxyInstance(function12, obj);
            }
        };
        final Function1 function13 = new Function1() { // from class: o.bhe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C10006bgM.copydefault(c10324bmM, taskDescription, (java.lang.Throwable) obj);
            }
        };
        InterfaceC58217yxC interfaceC58217yxCAEQbTJ = abstractC58260yxtAEQbTJ.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.bhd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C10006bgM.uzCIH(function13, obj);
            }
        });
        call().AEQbTJ(interfaceC58217yxCAEQbTJ);
        Intrinsics.copydefault(interfaceC58217yxCAEQbTJ);
    }

    public static final InterfaceC58261yxu hDKMBd(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu KWHzl(C10026bgg.TaskDescription taskDescription, boolean z, java.lang.Boolean bool) throws java.lang.Exception {
        Intrinsics.checkNotNullParameter(bool, "");
        if (bool.booleanValue()) {
            AbstractC58260yxt<java.util.List<java.lang.Long>> abstractC58260yxtCopydefault = C10407bnq.ActionBar.getInstance$default(C10407bnq.Companion, null, 1, null).copydefault(taskDescription.AhwBna(), z);
            final Function1 function1 = new Function1() { // from class: o.bgU
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C10006bgM.OLrzqt((java.util.List) obj);
                }
            };
            return abstractC58260yxtCopydefault.copydefault(new InterfaceC58229yxO() { // from class: o.bgV
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return C10006bgM.getFieldNames(function1, obj);
                }
            });
        }
        throw new java.lang.Exception(java.lang.String.valueOf(C33070mpX.AYXKKw(C13754dXa.FragmentManager.DxnCrt)));
    }

    public static final java.lang.Boolean getFieldNames(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.lang.Boolean) function1.invoke(obj);
    }

    public static final Unit KWHzl(C10026bgg.TaskDescription taskDescription, int i, C10006bgM c10006bgM, boolean z, Function0 function0, java.lang.Boolean bool) {
        RxBus.AEQbTJ(new C9934beu());
        taskDescription.OLrzqt(i);
        c10006bgM.AEQbTJ(z, taskDescription);
        function0.invoke();
        c10006bgM.AEQbTJ(taskDescription);
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(C10324bmM c10324bmM, C10026bgg.TaskDescription taskDescription, java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        c10324bmM.setCheckState(taskDescription.gEmmrt());
        return Unit.INSTANCE;
    }

    public static final void getNewProxyInstance(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(C10026bgg.TaskDescription taskDescription, int i, Function0 function0, C10006bgM c10006bgM, java.lang.Long l) {
        pUU.copydefault("result is " + l);
        if (l.longValue() > 0) {
            RxBus.AEQbTJ(new C9934beu());
            taskDescription.OLrzqt(i);
            function0.invoke();
            c10006bgM.AEQbTJ(taskDescription);
        }
        return Unit.INSTANCE;
    }

    public static final void uzCIH(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(C10324bmM c10324bmM, C10026bgg.TaskDescription taskDescription, java.lang.Throwable th) {
        c10324bmM.setCheckState(taskDescription.gEmmrt());
        return Unit.INSTANCE;
    }

    public final boolean copydefault() {
        return !this.OLrzqt.isEmpty();
    }

    public final void AEQbTJ(boolean z, C10026bgg.TaskDescription taskDescription) {
        try {
            if (z) {
                java.util.Iterator<C10026bgg.TaskDescription> it = this.OLrzqt.iterator();
                Intrinsics.checkNotNullExpressionValue(it, "");
                while (true) {
                    if (it.hasNext()) {
                        C10026bgg.TaskDescription next = it.next();
                        Intrinsics.checkNotNullExpressionValue(next, "");
                        if (Intrinsics.EZpvd((java.lang.Object) next.AhwBna(), (java.lang.Object) taskDescription.AhwBna())) {
                            it.remove();
                            break;
                        }
                    }
                }
            } else {
                this.OLrzqt.add(taskDescription);
            }
        } catch (java.lang.Exception e) {
            pUU.copydefault("updateRemovedCoinMetas error: " + e.getMessage());
        }
    }

    public final void AEQbTJ(C10026bgg.TaskDescription taskDescription) {
        AddOrRemoveType addOrRemoveType;
        AbstractC12782ctV abstractC12782ctVValues;
        InterfaceC18445fiY interfaceC18445fiY = this.EZpvd;
        java.lang.String strValueOf = taskDescription.valueOf();
        java.lang.String strIsConnected = taskDescription.isConnected();
        C10525bqB c10525bqBCopydefault = taskDescription.copydefault();
        java.lang.Long lValueOf = c10525bqBCopydefault != null ? java.lang.Long.valueOf(c10525bqBCopydefault.AEQbTJ()) : null;
        if (taskDescription.gEmmrt() == 0) {
            addOrRemoveType = AddOrRemoveType.REMOVE;
        } else {
            addOrRemoveType = AddOrRemoveType.ADD;
        }
        AddOrRemoveType addOrRemoveType2 = addOrRemoveType;
        C10525bqB c10525bqBCopydefault2 = taskDescription.copydefault();
        interfaceC18445fiY.KWHzl("SelectCoinViewModel", strValueOf, strIsConnected, lValueOf, addOrRemoveType2, (c10525bqBCopydefault2 == null || (abstractC12782ctVValues = c10525bqBCopydefault2.values()) == null) ? null : abstractC12782ctVValues.QwvEab());
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x00e5 A[EDGE_INSN: B:118:0x00e5->B:60:0x00e5 BREAK  A[LOOP:1: B:51:0x00bd->B:122:0x00bd], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01a7 A[EDGE_INSN: B:139:0x01a7->B:110:0x01a7 BREAK  A[LOOP:4: B:99:0x0178->B:144:0x0178], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00e7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int OLrzqt(@NotNull C10026bgg.TaskDescription taskDescription, @NotNull java.util.List<? extends java.lang.Object> list) {
        java.util.ListIterator<? extends java.lang.Object> listIterator;
        CustomChainCoinMeta customChainCoinMetaDjBIcL;
        C10525bqB c10525bqBCopydefault;
        C10854bwM c10854bwMKWHzl;
        C10854bwM c10854bwMKWHzl2;
        java.util.ListIterator<? extends java.lang.Object> listIterator2;
        CustomChainCoinMeta customChainCoinMetaDjBIcL2;
        Intrinsics.checkNotNullParameter(taskDescription, "");
        Intrinsics.checkNotNullParameter(list, "");
        int i = 0;
        int iNextIndex = -1;
        if (taskDescription.gEmmrt() == 0) {
            if (taskDescription.OLrzqt()) {
                for (java.lang.Object obj : list) {
                    if (obj instanceof C10026bgg.TaskDescription) {
                        C10026bgg.TaskDescription taskDescription2 = (C10026bgg.TaskDescription) obj;
                        if (taskDescription2.gEmmrt() == 0 && (customChainCoinMetaDjBIcL2 = taskDescription2.djBIcL()) != null) {
                            long jGEmmrt = customChainCoinMetaDjBIcL2.gEmmrt();
                            CustomChainCoinMeta customChainCoinMetaDjBIcL3 = taskDescription.djBIcL();
                            if (C33129mqd.gEmmrt(java.lang.Long.valueOf(jGEmmrt), customChainCoinMetaDjBIcL3 != null ? java.lang.Long.valueOf(customChainCoinMetaDjBIcL3.gEmmrt()) : null)) {
                                break;
                            }
                        }
                    }
                    i++;
                }
                i = -1;
                if (i >= 0 || i > list.size()) {
                    listIterator2 = list.listIterator(list.size());
                    while (true) {
                        if (listIterator2.hasPrevious()) {
                            break;
                        }
                        java.lang.Object objPrevious = listIterator2.previous();
                        if (objPrevious instanceof C10026bgg.TaskDescription) {
                            C10026bgg.TaskDescription taskDescription3 = (C10026bgg.TaskDescription) objPrevious;
                            if (taskDescription3.gEmmrt() == 0 && !Intrinsics.EZpvd((java.lang.Object) taskDescription3.AhwBna(), (java.lang.Object) taskDescription.AhwBna())) {
                                iNextIndex = listIterator2.nextIndex();
                                break;
                            }
                        }
                    }
                    if (iNextIndex < 0) {
                        return list.size();
                    }
                    return iNextIndex + 1;
                }
                return i;
            }
            for (java.lang.Object obj2 : list) {
                if (obj2 instanceof C10026bgg.TaskDescription) {
                    C10026bgg.TaskDescription taskDescription4 = (C10026bgg.TaskDescription) obj2;
                    if (taskDescription4.gEmmrt() == 0 && (c10525bqBCopydefault = taskDescription4.copydefault()) != null && (c10854bwMKWHzl = c10525bqBCopydefault.KWHzl()) != null) {
                        int iQfsBiF = c10854bwMKWHzl.QfsBiF();
                        C10525bqB c10525bqBCopydefault2 = taskDescription.copydefault();
                        if (C33129mqd.AEQbTJ(java.lang.Integer.valueOf(iQfsBiF), (c10525bqBCopydefault2 == null || (c10854bwMKWHzl2 = c10525bqBCopydefault2.KWHzl()) == null) ? null : java.lang.Integer.valueOf(c10854bwMKWHzl2.QfsBiF()))) {
                            break;
                        }
                    }
                }
                i++;
            }
            i = -1;
            if (i >= 0) {
            }
            listIterator2 = list.listIterator(list.size());
            while (true) {
                if (listIterator2.hasPrevious()) {
                }
            }
            if (iNextIndex < 0) {
            }
            return iNextIndex + 1;
        }
        if (taskDescription.gEmmrt() != 1) {
            return -1;
        }
        if (taskDescription.OLrzqt()) {
            for (java.lang.Object obj3 : list) {
                if (obj3 instanceof C10026bgg.TaskDescription) {
                    C10026bgg.TaskDescription taskDescription5 = (C10026bgg.TaskDescription) obj3;
                    if (taskDescription5.gEmmrt() != 0 && (customChainCoinMetaDjBIcL = taskDescription5.djBIcL()) != null) {
                        long jGEmmrt2 = customChainCoinMetaDjBIcL.gEmmrt();
                        CustomChainCoinMeta customChainCoinMetaDjBIcL4 = taskDescription.djBIcL();
                        if (C33129mqd.gEmmrt(java.lang.Long.valueOf(jGEmmrt2), customChainCoinMetaDjBIcL4 != null ? java.lang.Long.valueOf(customChainCoinMetaDjBIcL4.gEmmrt()) : null)) {
                            break;
                        }
                    }
                }
                i++;
            }
            i = -1;
            if (i >= 0 || i > list.size()) {
                listIterator = list.listIterator(list.size());
                while (true) {
                    if (listIterator.hasPrevious()) {
                        break;
                    }
                    java.lang.Object objPrevious2 = listIterator.previous();
                    if (objPrevious2 instanceof C10026bgg.TaskDescription) {
                        C10026bgg.TaskDescription taskDescription6 = (C10026bgg.TaskDescription) objPrevious2;
                        if (taskDescription6.gEmmrt() == 1 || taskDescription6.gEmmrt() == 2) {
                            if (!Intrinsics.EZpvd((java.lang.Object) taskDescription6.AhwBna(), (java.lang.Object) taskDescription.AhwBna())) {
                                iNextIndex = listIterator.nextIndex();
                                break;
                            }
                        }
                    }
                }
                return iNextIndex + 1;
            }
            return i;
        }
        for (java.lang.Object obj4 : list) {
            if (obj4 instanceof C10026bgg.TaskDescription) {
                C10026bgg.TaskDescription taskDescription7 = (C10026bgg.TaskDescription) obj4;
                if (taskDescription7.gEmmrt() != 0 && C33129mqd.gEmmrt(taskDescription7.KWHzl(), taskDescription.KWHzl())) {
                    break;
                }
            }
            i++;
        }
        i = -1;
        if (i >= 0) {
        }
        listIterator = list.listIterator(list.size());
        while (true) {
            if (listIterator.hasPrevious()) {
            }
        }
        return iNextIndex + 1;
    }

    public final java.lang.String copydefault(long j) {
        C10854bwM c10854bwMKWHzl;
        if (j == Long.MIN_VALUE) {
            return "allnetwork";
        }
        C10854bwM c10854bwMKWHzl2 = C10954byG.EZpvd.valueOf().KWHzl(java.lang.Long.valueOf(j));
        java.lang.String strFJNWhG = (c10854bwMKWHzl2 == null || (c10854bwMKWHzl = c10854bwMKWHzl2.KWHzl()) == null) ? null : c10854bwMKWHzl.fJNWhG();
        return strFJNWhG == null ? "" : strFJNWhG;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.util.List<C10026bgg.TaskDescription> AEQbTJ(java.util.List<C10594brR> list) {
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        for (C10594brR c10594brR : list) {
            CustomChainCoinMeta customChainCoinMetaFetchVPNInfo = c10594brR.fetchVPNInfo();
            C10026bgg.TaskDescription taskDescription = new C10026bgg.TaskDescription();
            taskDescription.KWHzl(customChainCoinMetaFetchVPNInfo.AkhnZx());
            taskDescription.OLrzqt(customChainCoinMetaFetchVPNInfo.fetchVPNInfo());
            taskDescription.gEmmrt(customChainCoinMetaFetchVPNInfo.ejfBZ());
            taskDescription.EZpvd(customChainCoinMetaFetchVPNInfo.values());
            taskDescription.AEQbTJ(customChainCoinMetaFetchVPNInfo.AhwBna());
            int i = 1;
            taskDescription.AEQbTJ(true);
            java.lang.String strFetchVPNInfo = customChainCoinMetaFetchVPNInfo.fetchVPNInfo();
            taskDescription.copydefault(strFetchVPNInfo == null || strFetchVPNInfo.length() == 0);
            if (!customChainCoinMetaFetchVPNInfo.fJNWhG()) {
                if (!this.KWHzl.AYXKKw(customChainCoinMetaFetchVPNInfo.AkhnZx())) {
                    i = 0;
                } else if (!this.KWHzl.KWHzl(customChainCoinMetaFetchVPNInfo.AkhnZx())) {
                    i = 2;
                }
            }
            taskDescription.OLrzqt(i);
            taskDescription.copydefault("0");
            taskDescription.EZpvd(c10594brR);
            taskDescription.AEQbTJ(customChainCoinMetaFetchVPNInfo);
            arrayList.add(taskDescription);
        }
        return CollectionsKt___CollectionsKt.EZpvd(arrayList, new Application());
    }

    public final java.util.List<C10026bgg.TaskDescription> KWHzl(java.util.List<C10525bqB> list) {
        int i;
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        for (C10525bqB c10525bqB : list) {
            C10026bgg.TaskDescription taskDescription = new C10026bgg.TaskDescription();
            taskDescription.KWHzl(c10525bqB.KWHzl().OcIXYQ());
            taskDescription.OLrzqt(c10525bqB.KWHzl().DbNXlk());
            taskDescription.gEmmrt(c10525bqB.KWHzl().fJNWhG());
            taskDescription.EZpvd(c10525bqB.KWHzl().gEmmrt());
            taskDescription.AEQbTJ(c10525bqB.AwvSrB());
            if (this.KWHzl.copydefault(c10525bqB.KWHzl().OcIXYQ())) {
                i = this.KWHzl.OLrzqt(c10525bqB.KWHzl().OcIXYQ()) ? 1 : 2;
            } else {
                i = 0;
            }
            taskDescription.OLrzqt(i);
            taskDescription.EZpvd(c10525bqB);
            taskDescription.copydefault(c10525bqB.AhwBna());
            arrayList.add(taskDescription);
        }
        return arrayList;
    }
}
