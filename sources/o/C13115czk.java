package o;

import com.okinc.business.defi.biz.constant.HardwareType;
import com.okinc.business.defi.biz.constant.WalletType;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import com.okinc.business.defi.biz.database.wallet.entity.ChainAddressEntity;
import com.okinc.business.defi.biz.database.wallet.entity.RootWalletEntity;
import com.okinc.business.defi.biz.database.wallet.entity.WalletEntity;
import com.okinc.business.defi.biz.database.wallet.entity.WalletRepairEntity;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C13115czk;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.czk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C13115czk extends AbstractC12984cxL {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C13115czk() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0012: CONSTRUCTOR 
  (wrap:o.cQM:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:o.cQM:0x000e: INVOKE 
  (wrap:o.dKx:0x000a: INVOKE 
  (wrap:android.app.Application:0x0006: INVOKE (wrap:o.baC$Activity:0x0004: SGET  A[WRAPPED] (LINE:25) o.baC.Companion o.baC$Activity) VIRTUAL call: o.baC.Activity.AEQbTJ():android.app.Application A[MD:():android.app.Application (m), WRAPPED] (LINE:25))
 STATIC call: o.dMb.EZpvd(android.content.Context):o.dKx A[MD:(android.content.Context):o.dKx (m), WRAPPED] (LINE:25))
 INTERFACE call: o.dKx.QKVWgx():o.cQM A[MD:():o.cQM (m), WRAPPED] (LINE:25)) : (r1v0 o.cQM))
 A[MD:(o.cQM):void (m)] (LINE:24) call: o.czk.<init>(o.cQM):void type: THIS */
    public /* synthetic */ C13115czk(cQM cqm, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13458dMb.EZpvd(C9678baC.Companion.AEQbTJ()).QKVWgx() : cqm);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13115czk(@NotNull cQM cqm) {
        super(null, null, cqm, 3, null);
        Intrinsics.checkNotNullParameter(cqm, "");
    }

    public final AbstractC58260yxt<Unit> copydefault(@NotNull java.util.ArrayList<WalletRepairEntity> arrayList, @NotNull java.util.ArrayList<ChainAddressEntity> arrayList2, @NotNull java.util.ArrayList<C12821cuH> arrayList3, @NotNull java.util.HashMap<java.lang.String, java.util.List<ChainAddressEntity>> map) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        Intrinsics.checkNotNullParameter(arrayList2, "");
        Intrinsics.checkNotNullParameter(arrayList3, "");
        Intrinsics.checkNotNullParameter(map, "");
        return EZpvd(arrayList, arrayList2, arrayList3, map);
    }

    /* JADX INFO: renamed from: o.czk$Activity */
    public static final class Activity implements Function1<?, InterfaceC58261yxu<? extends java.util.HashMap<java.lang.String, java.lang.Object>>> {
        public final /* synthetic */ java.util.List<AbstractC58260yxt<WalletEntity>> AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.util.List<? extends o.yxt<com.okinc.business.defi.biz.database.wallet.entity.WalletEntity>> */
        /* JADX WARN: Multi-variable type inference failed */
        public Activity(java.util.List<? extends AbstractC58260yxt<WalletEntity>> list) {
            this.AEQbTJ = list;
        }

        public static final java.util.HashMap KWHzl(Function1 function1, java.lang.Object obj) {
            Intrinsics.checkNotNullParameter(obj, "");
            return (java.util.HashMap) function1.invoke(obj);
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public final InterfaceC58261yxu<? extends java.util.HashMap<java.lang.String, java.lang.Object>> invoke(final kotlin.Pair<RootWalletEntity, ? extends java.util.List<RootWalletEntity>> pair) {
            Intrinsics.checkNotNullParameter(pair, "");
            AbstractC58260yxt abstractC58260yxtValueOf = C11607cUn.valueOf(C11607cUn.KWHzl(this.AEQbTJ));
            final Function1 function1 = new Function1() { // from class: o.czq
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C13115czk.Activity.KWHzl(pair, (java.util.List) obj);
                }
            };
            return abstractC58260yxtValueOf.copydefault(new InterfaceC58229yxO() { // from class: o.czp
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return C13115czk.Activity.KWHzl(function1, obj);
                }
            });
        }

        public static final java.util.HashMap KWHzl(kotlin.Pair pair, java.util.List list) {
            Intrinsics.checkNotNullParameter(list, "");
            return C56424yEw.AYXKKw(C56390yDp.OLrzqt("rootWalletEntity", pair.getFirst()), C56390yDp.OLrzqt("needUpdateRootWallets", pair.getSecond()), C56390yDp.OLrzqt("needImportPrivateKeyWalletList", list));
        }
    }

    public static final InterfaceC58261yxu hDKMBd(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu getFieldNames(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu KWHzl(C13115czk c13115czk, java.util.HashMap map, java.util.ArrayList arrayList, java.util.ArrayList arrayList2, java.util.HashMap map2) {
        Intrinsics.checkNotNullParameter(map2, "");
        return c13115czk.AEQbTJ().OLrzqt((RootWalletEntity) map2.get("rootWalletEntity"), (java.util.List<RootWalletEntity>) map2.get("needUpdateRootWallets"), (java.util.List<WalletEntity>) map2.get("needImportPrivateKeyWalletList"), map, arrayList, arrayList2);
    }

    public static final WalletEntity fJNWhG(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (WalletEntity) function1.invoke(obj);
    }

    /* JADX DEBUG: Type inference failed for r4v1. Raw type applied. Possible types: o.yxt<R>, java.lang.Object, o.yxt<com.okinc.business.defi.biz.database.wallet.entity.WalletEntity> */
    public final AbstractC58260yxt<WalletEntity> AEQbTJ(final C12821cuH c12821cuH, final int i) {
        AbstractC58260yxt<java.util.List<WalletEntity>> abstractC58260yxtDjBIcL = EZpvd().djBIcL();
        final Function1 function1 = new Function1() { // from class: o.czn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C13115czk.AEQbTJ(c12821cuH, i, (java.util.List) obj);
            }
        };
        AbstractC58260yxt abstractC58260yxtCopydefault = abstractC58260yxtDjBIcL.copydefault(new InterfaceC58229yxO() { // from class: o.czr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C13115czk.fJNWhG(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
        return abstractC58260yxtCopydefault;
    }

    public static final WalletEntity AEQbTJ(C12821cuH c12821cuH, int i, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        int size = list.size();
        java.util.Iterator it = list.iterator();
        int addressIndex = -1;
        while (it.hasNext()) {
            WalletEntity walletEntity = (WalletEntity) it.next();
            if (walletEntity.getOrderValue() > size) {
                size = walletEntity.getOrderValue();
            }
            if (Intrinsics.EZpvd((java.lang.Object) c12821cuH.fIwbmz().AEQbTJ(), (java.lang.Object) walletEntity.getRootWalletId()) && walletEntity.getAddressIndex() > addressIndex) {
                addressIndex = walletEntity.getAddressIndex();
            }
        }
        if (c12821cuH.fARcdN() != WalletType.HDWallet && c12821cuH.fARcdN() != WalletType.MPCWallet && c12821cuH.fARcdN() != WalletType.AAWallet && c12821cuH.fARcdN() == WalletType.HardwareWallet) {
            C13854daT c13854daTGEmmrt = c12821cuH.gEmmrt();
            if ((c13854daTGEmmrt != null ? c13854daTGEmmrt.KWHzl() : null) != HardwareType.Keystone) {
                C13854daT c13854daTGEmmrt2 = c12821cuH.gEmmrt();
                if ((c13854daTGEmmrt2 != null ? c13854daTGEmmrt2.KWHzl() : null) != HardwareType.OneKey) {
                    c12821cuH.OLrzqt(addressIndex + 1);
                }
            }
        }
        return c12821cuH.copydefault(size + 1, i);
    }

    public final AbstractC58260yxt<Unit> EZpvd(final java.util.ArrayList<WalletRepairEntity> arrayList, final java.util.ArrayList<ChainAddressEntity> arrayList2, java.util.ArrayList<C12821cuH> arrayList3, final java.util.HashMap<java.lang.String, java.util.List<ChainAddressEntity>> map) throws WalletImportError {
        AbstractC58260yxt<kotlin.Pair<RootWalletEntity, java.util.List<RootWalletEntity>>> abstractC58260yxtDjBIcL;
        java.util.ArrayList arrayList4 = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList3, 10));
        java.util.Iterator<T> it = arrayList3.iterator();
        while (it.hasNext()) {
            arrayList4.add(AEQbTJ((C12821cuH) it.next(), C11600cUg.OLrzqt(false)));
        }
        if (arrayList3.isEmpty()) {
            abstractC58260yxtDjBIcL = AbstractC58260yxt.copydefault(C56390yDp.OLrzqt(null, null));
            Intrinsics.copydefault(abstractC58260yxtDjBIcL);
        } else {
            abstractC58260yxtDjBIcL = djBIcL((C12821cuH) CollectionsKt___CollectionsKt.AuCTelauCTel(arrayList3));
        }
        final Activity activity = new Activity(arrayList4);
        AbstractC58260yxt<R> abstractC58260yxtOLrzqt = abstractC58260yxtDjBIcL.OLrzqt(new InterfaceC58229yxO() { // from class: o.czo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C13115czk.hDKMBd(activity, obj);
            }
        });
        final Function1 function1 = new Function1() { // from class: o.czl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C13115czk.KWHzl(this.OLrzqt, map, arrayList, arrayList2, (java.util.HashMap) obj);
            }
        };
        AbstractC58260yxt<Unit> abstractC58260yxtOLrzqt2 = abstractC58260yxtOLrzqt.OLrzqt((InterfaceC58229yxO<? super R, ? extends InterfaceC58261yxu<? extends R>>) new InterfaceC58229yxO() { // from class: o.czm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C13115czk.getFieldNames(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtOLrzqt2, "");
        return abstractC58260yxtOLrzqt2;
    }
}
