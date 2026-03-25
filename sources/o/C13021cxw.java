package o;

import com.okinc.business.defi.biz.constant.WalletDeleteStatus;
import com.okinc.business.defi.biz.database.extra.entity.DeletedWalletEntity;
import com.okinc.business.defi.biz.net.bean.WalletDeleteRes;
import com.okinc.network.okg.response.ResponseData;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C11274cId;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.cxw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C13021cxw {
    public static volatile C13021cxw copydefault;
    public final C13934dbu EZpvd;
    public final C11274cId OLrzqt;
    public static final ActionBar Companion = new ActionBar(null);
    public static final int AEQbTJ = 8;

    public C13021cxw(@NotNull C11274cId c11274cId, @NotNull C13934dbu c13934dbu) {
        Intrinsics.checkNotNullParameter(c11274cId, "");
        Intrinsics.checkNotNullParameter(c13934dbu, "");
        this.OLrzqt = c11274cId;
        this.EZpvd = c13934dbu;
    }

    /* JADX INFO: renamed from: o.cxw$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.cxw.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public static /* synthetic */ C13021cxw getInstance$default(ActionBar actionBar, C11274cId c11274cId, C13934dbu c13934dbu, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                c11274cId = C11274cId.Activity.getInstance$default(C11274cId.Companion, null, 1, null);
            }
            if ((i & 2) != 0) {
                c13934dbu = new C13934dbu();
            }
            return actionBar.EZpvd(c11274cId, c13934dbu);
        }

        public final C13021cxw EZpvd(@NotNull C11274cId c11274cId, @NotNull C13934dbu c13934dbu) {
            Intrinsics.checkNotNullParameter(c11274cId, "");
            Intrinsics.checkNotNullParameter(c13934dbu, "");
            C13021cxw c13021cxw = C13021cxw.copydefault;
            if (c13021cxw == null) {
                synchronized (this) {
                    c13021cxw = C13021cxw.copydefault;
                    if (c13021cxw == null) {
                        c13021cxw = new C13021cxw(c11274cId, c13934dbu);
                        ActionBar actionBar = C13021cxw.Companion;
                        C13021cxw.copydefault = c13021cxw;
                    }
                }
            }
            return c13021cxw;
        }
    }

    public static /* synthetic */ AbstractC58185ywX sync$default(C13021cxw c13021cxw, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return c13021cxw.AEQbTJ(z);
    }

    public final AbstractC58185ywX<java.lang.Integer> AEQbTJ(final boolean z) {
        AbstractC58185ywX<java.util.List<DeletedWalletEntity>> abstractC58185ywXEZpvd = this.OLrzqt.KWHzl(WalletDeleteStatus.HasDeleteData.getValue()).EZpvd();
        final Function1 function1 = new Function1() { // from class: o.cxu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C13021cxw.AEQbTJ(this.KWHzl, (java.util.List) obj);
            }
        };
        AbstractC58185ywX<R> abstractC58185ywXKWHzl = abstractC58185ywXEZpvd.KWHzl(new InterfaceC58229yxO() { // from class: o.cxt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C13021cxw.OLrzqt(function1, obj);
            }
        });
        final Function1 function12 = new Function1() { // from class: o.cxx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C13021cxw.EZpvd(z, this, (java.lang.Integer) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXKWHzl2 = abstractC58185ywXKWHzl.KWHzl((InterfaceC58229yxO<? super R, ? extends InterfaceC60096zvd<? extends R>>) new InterfaceC58229yxO() { // from class: o.cxz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C13021cxw.AYXKKw(function12, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl2, "");
        return C33527myD.KWHzl(abstractC58185ywXKWHzl2);
    }

    public static final InterfaceC60096zvd OLrzqt(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd AEQbTJ(C13021cxw c13021cxw, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        if (!list.isEmpty()) {
            return c13021cxw.AEQbTJ((java.util.List<DeletedWalletEntity>) list);
        }
        AbstractC58185ywX abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(0);
        Intrinsics.copydefault(abstractC58185ywXKWHzl);
        return abstractC58185ywXKWHzl;
    }

    public static final InterfaceC60096zvd AYXKKw(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd EZpvd(boolean z, C13021cxw c13021cxw, java.lang.Integer num) {
        Intrinsics.checkNotNullParameter(num, "");
        if (z) {
            return c13021cxw.OLrzqt.OLrzqt().EZpvd();
        }
        return AbstractC58185ywX.KWHzl(0);
    }

    /* JADX DEBUG: Type inference failed for r11v4. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<java.lang.Integer> */
    public final AbstractC58185ywX<java.lang.Integer> AEQbTJ(java.util.List<DeletedWalletEntity> list) {
        DeletedWalletEntity deletedWalletEntity = (DeletedWalletEntity) CollectionsKt___CollectionsKt.AEQbTJ(list, kotlin.random.Random.Default);
        java.lang.String xpub = deletedWalletEntity.getXpub();
        if (xpub.length() == 0) {
            xpub = xYW.AEQbTJ.gEmmrt(deletedWalletEntity.getXpriv());
        }
        C13934dbu c13934dbu = this.EZpvd;
        java.lang.String xpriv = deletedWalletEntity.getXpriv();
        java.lang.String id = deletedWalletEntity.getId();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((DeletedWalletEntity) it.next()).getId());
        }
        AbstractC58185ywX<ResponseData<WalletDeleteRes>> abstractC58185ywXOLrzqt = c13934dbu.OLrzqt(xpriv, id, arrayList, xpub).OLrzqt(AbstractC58185ywX.KWHzl(new ResponseData(0, null, null, null, null, null, 63, null)));
        final Function1 function1 = new Function1() { // from class: o.cxC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C13021cxw.OLrzqt(this.copydefault, (ResponseData) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXKWHzl = abstractC58185ywXOLrzqt.KWHzl(new InterfaceC58229yxO() { // from class: o.cxA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C13021cxw.AEQbTJ(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    public static final InterfaceC60096zvd AEQbTJ(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd OLrzqt(C13021cxw c13021cxw, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        WalletDeleteRes walletDeleteRes = (WalletDeleteRes) responseData.getData();
        java.util.List<java.lang.String> successWalletIdList = walletDeleteRes != null ? walletDeleteRes.getSuccessWalletIdList() : null;
        if (successWalletIdList != null && !successWalletIdList.isEmpty()) {
            C11274cId c11274cId = c13021cxw.OLrzqt;
            WalletDeleteRes walletDeleteRes2 = (WalletDeleteRes) responseData.getData();
            java.util.List<java.lang.String> successWalletIdList2 = walletDeleteRes2 != null ? walletDeleteRes2.getSuccessWalletIdList() : null;
            if (successWalletIdList2 == null) {
                successWalletIdList2 = yDY.AhwBna();
            }
            return c11274cId.AEQbTJ(successWalletIdList2).EZpvd();
        }
        return AbstractC58185ywX.KWHzl(0);
    }
}
