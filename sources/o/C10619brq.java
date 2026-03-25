package o;

import com.okinc.business.defi.biz.core.common.WalletSelectedChainBean;
import com.okinc.business.defi.biz.core.customchain.meta.CustomChainCoinMeta;
import com.okinc.business.defi.biz.core.customchain.meta.CustomChainMeta;
import com.okinc.business.defi.biz.database.wallet.entity.CustomChainCoinBalanceEntity;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.brq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C10619brq {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int OLrzqt = 8;
    public final C12827cuN AEQbTJ;
    public final C10598brV EZpvd;
    public final C10734btz KWHzl;
    public final cOR copydefault;
    public final C10614brl valueOf;

    public C10619brq(@NotNull C12827cuN c12827cuN, @NotNull C10734btz c10734btz, @NotNull cOR cor, @NotNull C10598brV c10598brV, @NotNull C10614brl c10614brl) {
        Intrinsics.checkNotNullParameter(c12827cuN, "");
        Intrinsics.checkNotNullParameter(c10734btz, "");
        Intrinsics.checkNotNullParameter(cor, "");
        Intrinsics.checkNotNullParameter(c10598brV, "");
        Intrinsics.checkNotNullParameter(c10614brl, "");
        this.AEQbTJ = c12827cuN;
        this.KWHzl = c10734btz;
        this.copydefault = cor;
        this.EZpvd = c10598brV;
        this.valueOf = c10614brl;
    }

    /* JADX INFO: renamed from: o.brq$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.brq.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public static /* synthetic */ C10619brq getInstance$default(TaskDescription taskDescription, android.content.Context context, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                context = C9678baC.Companion.AEQbTJ();
            }
            return taskDescription.KWHzl(context);
        }

        public final C10619brq KWHzl(@NotNull android.content.Context context) {
            Intrinsics.checkNotNullParameter(context, "");
            return C13458dMb.EZpvd(context).gEmmrt();
        }
    }

    /* JADX DEBUG: Type inference failed for r4v2. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<java.util.List<o.brR>> */
    public final AbstractC58185ywX<java.util.List<C10594brR>> copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        AbstractC58260yxt<AbstractC12782ctV> abstractC58260yxtOLrzqt = this.AEQbTJ.OLrzqt(str, false);
        final Function1 function1 = new Function1() { // from class: o.brF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C10619brq.OLrzqt(this.KWHzl, (AbstractC12782ctV) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXKWHzl = abstractC58260yxtOLrzqt.KWHzl(new InterfaceC58229yxO() { // from class: o.brD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C10619brq.AuCTel(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    public static final InterfaceC60096zvd AuCTel(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd OLrzqt(C10619brq c10619brq, AbstractC12782ctV abstractC12782ctV) {
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        return AbstractC58185ywX.KWHzl(AbstractC58185ywX.KWHzl(abstractC12782ctV.QkdxfA()), c10619brq.OLrzqt(abstractC12782ctV).EZpvd());
    }

    /* JADX DEBUG: Type inference failed for r0v2. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<java.util.List<o.brR>> */
    public final AbstractC58185ywX<java.util.List<C10594brR>> AEQbTJ() {
        AbstractC58260yxt<AbstractC12782ctV> abstractC58260yxtCopydefault = this.AEQbTJ.copydefault(false);
        final Function1 function1 = new Function1() { // from class: o.brt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C10619brq.copydefault(this.copydefault, (AbstractC12782ctV) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXKWHzl = abstractC58260yxtCopydefault.KWHzl(new InterfaceC58229yxO() { // from class: o.brA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C10619brq.fIwbmz(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    public static final InterfaceC60096zvd fIwbmz(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd copydefault(C10619brq c10619brq, AbstractC12782ctV abstractC12782ctV) {
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        return AbstractC58185ywX.KWHzl(AbstractC58185ywX.KWHzl(abstractC12782ctV.QkdxfA()), c10619brq.OLrzqt(abstractC12782ctV).EZpvd());
    }

    /* JADX DEBUG: Type inference failed for r4v2. Raw type applied. Possible types: o.yxt<R>, java.lang.Object, o.yxt<java.util.List<o.brR>> */
    public final AbstractC58260yxt<java.util.List<C10594brR>> AEQbTJ(@NotNull java.lang.String str, @NotNull final java.util.List<java.lang.Long> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        AbstractC58260yxt<AbstractC12782ctV> abstractC58260yxtOLrzqt = this.AEQbTJ.OLrzqt(str, false);
        final Function1 function1 = new Function1() { // from class: o.brn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C10619brq.AEQbTJ(this.OLrzqt, list, (AbstractC12782ctV) obj);
            }
        };
        AbstractC58260yxt abstractC58260yxtOLrzqt2 = abstractC58260yxtOLrzqt.OLrzqt(new InterfaceC58229yxO() { // from class: o.brr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C10619brq.getNewProxyInstance(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtOLrzqt2, "");
        return abstractC58260yxtOLrzqt2;
    }

    public static final InterfaceC58261yxu getNewProxyInstance(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu AEQbTJ(C10619brq c10619brq, java.util.List list, AbstractC12782ctV abstractC12782ctV) {
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        return c10619brq.EZpvd(abstractC12782ctV, (java.util.List<java.lang.Long>) list);
    }

    public final AbstractC58260yxt<kotlin.Pair<C10594brR, java.lang.String>> OLrzqt(@NotNull final java.lang.String str, final long j) {
        Intrinsics.checkNotNullParameter(str, "");
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        AbstractC58260yxt<AbstractC12782ctV> abstractC58260yxtOLrzqt = this.AEQbTJ.OLrzqt(str, false);
        final Function1 function1 = new Function1() { // from class: o.brG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C10619brq.copydefault(objectRef, this, str, j, (AbstractC12782ctV) obj);
            }
        };
        AbstractC58260yxt<R> abstractC58260yxtOLrzqt2 = abstractC58260yxtOLrzqt.OLrzqt(new InterfaceC58229yxO() { // from class: o.brE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C10619brq.hDKMBd(function1, obj);
            }
        });
        final Function1 function12 = new Function1() { // from class: o.brI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C10619brq.AEQbTJ(objectRef, this, str, j, (Triple) obj);
            }
        };
        AbstractC58260yxt<kotlin.Pair<C10594brR, java.lang.String>> abstractC58260yxtOLrzqt3 = abstractC58260yxtOLrzqt2.OLrzqt((InterfaceC58229yxO<? super R, ? extends InterfaceC58261yxu<? extends R>>) new InterfaceC58229yxO() { // from class: o.brK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C10619brq.uzCIH(function12, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtOLrzqt3, "");
        return abstractC58260yxtOLrzqt3;
    }

    public static final InterfaceC58261yxu hDKMBd(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r10v0, resolved type: o.ctV */
    /* JADX WARN: Multi-variable type inference failed */
    public static final InterfaceC58261yxu copydefault(Ref.ObjectRef objectRef, C10619brq c10619brq, java.lang.String str, long j, AbstractC12782ctV abstractC12782ctV) {
        java.lang.String strIsConnected;
        java.lang.Object next;
        java.lang.Object next2;
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        objectRef.element = abstractC12782ctV;
        WalletSelectedChainBean walletSelectedChainBeanKWHzl = c10619brq.valueOf.KWHzl(str);
        java.util.Iterator<T> it = abstractC12782ctV.OxVOHk().iterator();
        while (true) {
            strIsConnected = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((C10594brR) next).OLrzqt() == j) {
                break;
            }
        }
        C10594brR c10594brR = (C10594brR) next;
        if (Intrinsics.EZpvd((java.lang.Object) walletSelectedChainBeanKWHzl.getChainId(), (java.lang.Object) java.lang.String.valueOf(c10594brR != null ? java.lang.Long.valueOf(c10594brR.AEQbTJ()) : null))) {
            strIsConnected = walletSelectedChainBeanKWHzl.getRpcUrl();
        } else {
            java.util.Iterator<T> it2 = c10619brq.EZpvd.fetchVPNInfo().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it2.next();
                CustomChainMeta customChainMeta = (CustomChainMeta) next2;
                if (c10594brR != null && customChainMeta.EZpvd() == c10594brR.AEQbTJ()) {
                    break;
                }
            }
            CustomChainMeta customChainMeta2 = (CustomChainMeta) next2;
            if (customChainMeta2 != null) {
                strIsConnected = customChainMeta2.isConnected();
            }
        }
        if (c10594brR != null && strIsConnected != null && strIsConnected.length() != 0) {
            return c10619brq.AEQbTJ(c10594brR, strIsConnected);
        }
        AbstractC58260yxt abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault(new Triple(-1, java.lang.Long.valueOf(j), "rpcUrl is empty"));
        Intrinsics.copydefault(abstractC58260yxtCopydefault);
        return abstractC58260yxtCopydefault;
    }

    public static final InterfaceC58261yxu uzCIH(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v4, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final InterfaceC58261yxu AEQbTJ(Ref.ObjectRef objectRef, C10619brq c10619brq, java.lang.String str, final long j, Triple triple) {
        java.lang.Object next;
        Intrinsics.checkNotNullParameter(triple, "");
        if (((java.lang.Number) triple.getFirst()).intValue() == -1) {
            T t = objectRef.element;
            Intrinsics.copydefault(t);
            java.util.Iterator<T> it = ((AbstractC12782ctV) t).QkdxfA().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (j == ((C10594brR) next).OLrzqt()) {
                    break;
                }
            }
            return AbstractC58260yxt.copydefault(new kotlin.Pair(next, triple.getThird()));
        }
        AbstractC58260yxt<java.util.List<C10594brR>> abstractC58260yxtOLrzqt = c10619brq.OLrzqt(str, C56402yEa.EZpvd(triple), C56402yEa.EZpvd(java.lang.Long.valueOf(j)));
        final Function1 function1 = new Function1() { // from class: o.brJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C10619brq.EZpvd(j, (java.util.List) obj);
            }
        };
        return abstractC58260yxtOLrzqt.copydefault(new InterfaceC58229yxO() { // from class: o.brM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C10619brq.fJNWhG(function1, obj);
            }
        });
    }

    public static final kotlin.Pair fJNWhG(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    public final AbstractC58260yxt<java.util.List<kotlin.Pair<java.lang.Long, java.lang.String>>> copydefault(@NotNull final java.lang.String str, @NotNull java.lang.String str2, @NotNull final java.util.List<java.lang.Long> list) {
        java.lang.Object next;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        WalletSelectedChainBean walletSelectedChainBeanKWHzl = this.valueOf.KWHzl(str);
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            CustomChainCoinMeta customChainCoinMetaOLrzqt = this.EZpvd.OLrzqt(((java.lang.Number) it.next()).longValue());
            java.lang.String strIsConnected = null;
            if (Intrinsics.EZpvd((java.lang.Object) walletSelectedChainBeanKWHzl.getChainId(), (java.lang.Object) java.lang.String.valueOf(customChainCoinMetaOLrzqt != null ? java.lang.Long.valueOf(customChainCoinMetaOLrzqt.copydefault()) : null))) {
                strIsConnected = walletSelectedChainBeanKWHzl.getRpcUrl();
            } else {
                java.util.Iterator<T> it2 = this.EZpvd.fetchVPNInfo().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it2.next();
                    CustomChainMeta customChainMeta = (CustomChainMeta) next;
                    if (customChainCoinMetaOLrzqt != null && customChainMeta.EZpvd() == customChainCoinMetaOLrzqt.copydefault()) {
                        break;
                    }
                }
                CustomChainMeta customChainMeta2 = (CustomChainMeta) next;
                if (customChainMeta2 != null) {
                    strIsConnected = customChainMeta2.isConnected();
                }
            }
            if (customChainCoinMetaOLrzqt != null && strIsConnected != null && strIsConnected.length() != 0) {
                arrayList.add(OLrzqt(customChainCoinMetaOLrzqt, str2, strIsConnected));
            }
        }
        AbstractC58260yxt abstractC58260yxtKWHzl = C11607cUn.KWHzl(arrayList);
        final Function1 function1 = new Function1() { // from class: o.brx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C10619brq.copydefault(this.AEQbTJ, str, list, (java.util.List) obj);
            }
        };
        AbstractC58260yxt<java.util.List<kotlin.Pair<java.lang.Long, java.lang.String>>> abstractC58260yxtOLrzqt = abstractC58260yxtKWHzl.OLrzqt(new InterfaceC58229yxO() { // from class: o.brC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C10619brq.zLjUOn(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtOLrzqt, "");
        return abstractC58260yxtOLrzqt;
    }

    public static final InterfaceC58261yxu zLjUOn(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final java.util.List AubY(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.util.List) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu copydefault(C10619brq c10619brq, java.lang.String str, java.util.List list, final java.util.List list2) {
        Intrinsics.checkNotNullParameter(list2, "");
        AbstractC58260yxt<java.util.List<C10594brR>> abstractC58260yxtOLrzqt = c10619brq.OLrzqt(str, (java.util.List<Triple<java.lang.Integer, java.lang.Long, java.lang.String>>) list2, (java.util.List<java.lang.Long>) list);
        final Function1 function1 = new Function1() { // from class: o.brz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C10619brq.EZpvd(list2, (java.util.List) obj);
            }
        };
        return abstractC58260yxtOLrzqt.copydefault(new InterfaceC58229yxO() { // from class: o.brB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C10619brq.AubY(function1, obj);
            }
        });
    }

    public static final java.util.List EZpvd(java.util.List list, java.util.List list2) {
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.copydefault(list);
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            Triple triple = (Triple) it.next();
            java.lang.Object second = triple.getSecond();
            java.lang.CharSequence charSequence = (java.lang.CharSequence) triple.getThird();
            if (charSequence.length() == 0) {
                charSequence = "0";
            }
            arrayList.add(C56390yDp.OLrzqt(second, charSequence));
        }
        return arrayList;
    }

    public final AbstractC58260yxt<java.util.List<C10594brR>> OLrzqt(final AbstractC12782ctV abstractC12782ctV) {
        java.lang.Object next;
        java.lang.String strIsConnected;
        C10856bwO.copydefault("CustomChainAssetManager", 0, "refreshWalletAsset start, walletId: " + abstractC12782ctV.DbNXlk());
        java.util.ArrayList arrayList = new java.util.ArrayList();
        WalletSelectedChainBean walletSelectedChainBeanKWHzl = this.valueOf.KWHzl(abstractC12782ctV.DbNXlk());
        java.util.List<C10594brR> listODXsMY = abstractC12782ctV.ODXsMY();
        java.util.ArrayList<C10594brR> arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj : listODXsMY) {
            if (Intrinsics.EZpvd((java.lang.Object) walletSelectedChainBeanKWHzl.getChainId(), (java.lang.Object) java.lang.String.valueOf(((C10594brR) obj).AEQbTJ()))) {
                arrayList2.add(obj);
            }
        }
        for (C10594brR c10594brR : arrayList2) {
            if (C33129mqd.OLrzqt((java.lang.CharSequence) walletSelectedChainBeanKWHzl.getRpcUrl())) {
                strIsConnected = walletSelectedChainBeanKWHzl.getRpcUrl();
            } else {
                java.util.Iterator<T> it = this.EZpvd.fetchVPNInfo().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (((CustomChainMeta) next).EZpvd() == c10594brR.AEQbTJ()) {
                        break;
                    }
                }
                CustomChainMeta customChainMeta = (CustomChainMeta) next;
                strIsConnected = customChainMeta != null ? customChainMeta.isConnected() : null;
            }
            if (strIsConnected != null && strIsConnected.length() != 0) {
                arrayList.add(AEQbTJ(c10594brR, strIsConnected));
            }
        }
        AbstractC58260yxt abstractC58260yxtKWHzl = C11607cUn.KWHzl(arrayList);
        final Function1 function1 = new Function1() { // from class: o.brs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return C10619brq.KWHzl(abstractC12782ctV, this, (java.util.List) obj2);
            }
        };
        AbstractC58260yxt<java.util.List<C10594brR>> abstractC58260yxtOLrzqt = abstractC58260yxtKWHzl.OLrzqt(new InterfaceC58229yxO() { // from class: o.brw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj2) {
                return C10619brq.ejfBZ(function1, obj2);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtOLrzqt, "");
        return abstractC58260yxtOLrzqt;
    }

    public static final InterfaceC58261yxu ejfBZ(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu KWHzl(AbstractC12782ctV abstractC12782ctV, C10619brq c10619brq, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        C10856bwO.copydefault("CustomChainAssetManager", 0, "refreshWalletAsset finish, walletId: " + abstractC12782ctV.DbNXlk() + ", size: " + list.size());
        return c10619brq.OLrzqt(abstractC12782ctV.DbNXlk(), (java.util.List<Triple<java.lang.Integer, java.lang.Long, java.lang.String>>) list, yDY.AhwBna());
    }

    public final AbstractC58260yxt<java.util.List<C10594brR>> EZpvd(final AbstractC12782ctV abstractC12782ctV, final java.util.List<java.lang.Long> list) {
        java.lang.String strIsConnected;
        java.lang.Object next;
        java.lang.Object next2;
        WalletSelectedChainBean walletSelectedChainBeanKWHzl = this.valueOf.KWHzl(abstractC12782ctV.DbNXlk());
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            long jLongValue = ((java.lang.Number) it.next()).longValue();
            java.util.Iterator<T> it2 = abstractC12782ctV.OxVOHk().iterator();
            while (true) {
                strIsConnected = null;
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
                if (((C10594brR) next).OLrzqt() == jLongValue) {
                    break;
                }
            }
            C10594brR c10594brR = (C10594brR) next;
            if (Intrinsics.EZpvd((java.lang.Object) walletSelectedChainBeanKWHzl.getChainId(), (java.lang.Object) java.lang.String.valueOf(c10594brR != null ? java.lang.Long.valueOf(c10594brR.AEQbTJ()) : null))) {
                strIsConnected = walletSelectedChainBeanKWHzl.getRpcUrl();
            } else {
                java.util.Iterator<T> it3 = this.EZpvd.fetchVPNInfo().iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it3.next();
                    CustomChainMeta customChainMeta = (CustomChainMeta) next2;
                    if (c10594brR != null && customChainMeta.EZpvd() == c10594brR.AEQbTJ()) {
                        break;
                    }
                }
                CustomChainMeta customChainMeta2 = (CustomChainMeta) next2;
                if (customChainMeta2 != null) {
                    strIsConnected = customChainMeta2.isConnected();
                }
            }
            if (c10594brR != null && strIsConnected != null && strIsConnected.length() != 0) {
                arrayList.add(AEQbTJ(c10594brR, strIsConnected));
            }
        }
        AbstractC58260yxt abstractC58260yxtKWHzl = C11607cUn.KWHzl(arrayList);
        final Function1 function1 = new Function1() { // from class: o.brO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C10619brq.copydefault(this.AEQbTJ, abstractC12782ctV, list, (java.util.List) obj);
            }
        };
        AbstractC58260yxt<java.util.List<C10594brR>> abstractC58260yxtOLrzqt = abstractC58260yxtKWHzl.OLrzqt(new InterfaceC58229yxO() { // from class: o.brT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C10619brq.getFieldNames(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtOLrzqt, "");
        return abstractC58260yxtOLrzqt;
    }

    public static final InterfaceC58261yxu getFieldNames(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu copydefault(C10619brq c10619brq, AbstractC12782ctV abstractC12782ctV, java.util.List list, java.util.List list2) {
        Intrinsics.checkNotNullParameter(list2, "");
        return c10619brq.OLrzqt(abstractC12782ctV.DbNXlk(), (java.util.List<Triple<java.lang.Integer, java.lang.Long, java.lang.String>>) list2, (java.util.List<java.lang.Long>) list);
    }

    public final AbstractC58260yxt<Triple<java.lang.Integer, java.lang.Long, java.lang.String>> AEQbTJ(final C10594brR c10594brR, java.lang.String str) {
        AbstractC58260yxt<java.lang.String> abstractC58260yxtEZpvd;
        InterfaceC9780bbz interfaceC9780bbzEZpvd = c10594brR.EZpvd();
        java.lang.String address = interfaceC9780bbzEZpvd != null ? interfaceC9780bbzEZpvd.getAddress() : null;
        if (address == null) {
            address = "";
        }
        if (c10594brR.fetchVPNInfo().fJNWhG()) {
            abstractC58260yxtEZpvd = this.KWHzl.AEQbTJ(str, address);
        } else {
            abstractC58260yxtEZpvd = this.KWHzl.EZpvd(str, address, c10594brR.fetchVPNInfo().djBIcL());
        }
        final Function1 function1 = new Function1() { // from class: o.bro
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C10619brq.EZpvd(c10594brR, (java.lang.String) obj);
            }
        };
        AbstractC58260yxt<Triple<java.lang.Integer, java.lang.Long, java.lang.String>> abstractC58260yxtAhwBna = abstractC58260yxtEZpvd.copydefault(new InterfaceC58229yxO() { // from class: o.brp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C10619brq.AkhnZx(function1, obj);
            }
        }).AhwBna(new InterfaceC58229yxO() { // from class: o.bry
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C10619brq.OLrzqt(c10594brR, (java.lang.Throwable) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtAhwBna, "");
        return abstractC58260yxtAhwBna;
    }

    public static final Triple AkhnZx(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (Triple) function1.invoke(obj);
    }

    public static final Triple EZpvd(C10594brR c10594brR, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new Triple(0, java.lang.Long.valueOf(c10594brR.OLrzqt()), str);
    }

    public static final Triple OLrzqt(C10594brR c10594brR, java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        return new Triple(-1, java.lang.Long.valueOf(c10594brR.OLrzqt()), java.lang.String.valueOf(th.getMessage()));
    }

    public final AbstractC58260yxt<Triple<java.lang.Integer, java.lang.Long, java.lang.String>> OLrzqt(final CustomChainCoinMeta customChainCoinMeta, java.lang.String str, java.lang.String str2) {
        AbstractC58260yxt<java.lang.String> abstractC58260yxtEZpvd;
        if (customChainCoinMeta.fJNWhG()) {
            abstractC58260yxtEZpvd = this.KWHzl.AEQbTJ(str2, str);
        } else {
            abstractC58260yxtEZpvd = this.KWHzl.EZpvd(str2, str, customChainCoinMeta.djBIcL());
        }
        final Function1 function1 = new Function1() { // from class: o.brQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C10619brq.OLrzqt(customChainCoinMeta, (java.lang.String) obj);
            }
        };
        AbstractC58260yxt<Triple<java.lang.Integer, java.lang.Long, java.lang.String>> abstractC58260yxtAhwBna = abstractC58260yxtEZpvd.copydefault(new InterfaceC58229yxO() { // from class: o.brN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C10619brq.fARcdN(function1, obj);
            }
        }).AhwBna(new InterfaceC58229yxO() { // from class: o.brP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C10619brq.copydefault(customChainCoinMeta, (java.lang.Throwable) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtAhwBna, "");
        return abstractC58260yxtAhwBna;
    }

    public static final Triple fARcdN(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (Triple) function1.invoke(obj);
    }

    public static final Triple OLrzqt(CustomChainCoinMeta customChainCoinMeta, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new Triple(0, java.lang.Long.valueOf(customChainCoinMeta.valueOf()), str);
    }

    public static final Triple copydefault(CustomChainCoinMeta customChainCoinMeta, java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        return new Triple(-1, java.lang.Long.valueOf(customChainCoinMeta.valueOf()), "");
    }

    public final AbstractC58260yxt<java.util.List<C10594brR>> OLrzqt(final java.lang.String str, java.util.List<Triple<java.lang.Integer, java.lang.Long, java.lang.String>> list, final java.util.List<java.lang.Long> list2) {
        long j;
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            Triple triple = (Triple) it.next();
            int iIntValue = ((java.lang.Number) triple.component1()).intValue();
            long jLongValue = ((java.lang.Number) triple.component2()).longValue();
            java.lang.String str2 = (java.lang.String) triple.component3();
            if (iIntValue == 0) {
                j = jCurrentTimeMillis;
                arrayList.add(new CustomChainCoinBalanceEntity(str, jLongValue, str2, null, 0, jCurrentTimeMillis, 24, null));
            } else {
                j = jCurrentTimeMillis;
            }
            jCurrentTimeMillis = j;
        }
        AbstractC58260yxt<Unit> abstractC58260yxtKWHzl = this.copydefault.KWHzl(arrayList);
        final Function1 function1 = new Function1() { // from class: o.brH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C10619brq.copydefault(this.KWHzl, str, list2, (Unit) obj);
            }
        };
        AbstractC58260yxt<R> abstractC58260yxtOLrzqt = abstractC58260yxtKWHzl.OLrzqt(new InterfaceC58229yxO() { // from class: o.brL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C10619brq.zsXlph(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtOLrzqt, "");
        return C11607cUn.valueOf(abstractC58260yxtOLrzqt);
    }

    public static final InterfaceC58261yxu zsXlph(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu copydefault(C10619brq c10619brq, java.lang.String str, final java.util.List list, Unit unit) {
        Intrinsics.checkNotNullParameter(unit, "");
        AbstractC58260yxt abstractC58260yxtKWHzl = C11607cUn.KWHzl(c10619brq.AEQbTJ.copydefault(str, false));
        final Function1 function1 = new Function1() { // from class: o.bru
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C10619brq.EZpvd(list, (AbstractC12782ctV) obj);
            }
        };
        return abstractC58260yxtKWHzl.copydefault(new InterfaceC58229yxO() { // from class: o.brv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C10619brq.iwGUEr(function1, obj);
            }
        });
    }

    public static final java.util.List iwGUEr(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.util.List) function1.invoke(obj);
    }

    public static final java.util.List EZpvd(java.util.List list, AbstractC12782ctV abstractC12782ctV) {
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        if (list.isEmpty()) {
            return abstractC12782ctV.QkdxfA();
        }
        java.util.List<C10594brR> listQkdxfA = abstractC12782ctV.QkdxfA();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : listQkdxfA) {
            if (CollectionsKt___CollectionsKt.OqFWZa(list).contains(java.lang.Long.valueOf(((C10594brR) obj).OLrzqt()))) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final kotlin.Pair EZpvd(long j, java.util.List list) {
        java.lang.Object next;
        Intrinsics.checkNotNullParameter(list, "");
        java.util.Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (j == ((C10594brR) next).OLrzqt()) {
                break;
            }
        }
        return new kotlin.Pair(next, "");
    }
}
