package o;

import com.okinc.business.defi.biz.constant.WalletDeleteStatus;
import com.okinc.business.defi.biz.constant.WalletSyncStatus;
import com.okinc.business.defi.biz.database.extra.entity.DeletedWalletEntity;
import com.okinc.business.defi.biz.database.wallet.entity.WalletEntity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C13021cxw;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ctW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C12783ctW {
    public final cQM AEQbTJ;
    public final C13021cxw EZpvd;
    public final C11274cId KWHzl;
    public final cQL copydefault;

    public C12783ctW(@NotNull cQM cqm, @NotNull cQL cql, @NotNull C11274cId c11274cId, @NotNull C13021cxw c13021cxw) {
        Intrinsics.checkNotNullParameter(cqm, "");
        Intrinsics.checkNotNullParameter(cql, "");
        Intrinsics.checkNotNullParameter(c11274cId, "");
        Intrinsics.checkNotNullParameter(c13021cxw, "");
        this.AEQbTJ = cqm;
        this.copydefault = cql;
        this.KWHzl = c11274cId;
        this.EZpvd = c13021cxw;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000c: CONSTRUCTOR 
  (r1v0 o.cQM)
  (r2v0 o.cQL)
  (r3v0 o.cId)
  (wrap:o.cxw:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:o.cxw:0x0008: INVOKE 
  (wrap:o.cxw$ActionBar:0x0004: SGET  A[WRAPPED] (LINE:22) o.cxw.Companion o.cxw$ActionBar)
  (null o.cId)
  (null o.dbu)
  (3 int)
  (null java.lang.Object)
 STATIC call: o.cxw.ActionBar.getInstance$default(o.cxw$ActionBar, o.cId, o.dbu, int, java.lang.Object):o.cxw A[MD:(o.cxw$ActionBar, o.cId, o.dbu, int, java.lang.Object):o.cxw (m), WRAPPED] (LINE:22)) : (r4v0 o.cxw))
 A[MD:(o.cQM, o.cQL, o.cId, o.cxw):void (m)] (LINE:18) call: o.ctW.<init>(o.cQM, o.cQL, o.cId, o.cxw):void type: THIS */
    /* JADX DEBUG: Class process forced to load method for inline: o.cxw.ActionBar.getInstance$default(o.cxw$ActionBar, o.cId, o.dbu, int, java.lang.Object):o.cxw */
    public /* synthetic */ C12783ctW(cQM cqm, cQL cql, C11274cId c11274cId, C13021cxw c13021cxw, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(cqm, cql, c11274cId, (i & 8) != 0 ? C13021cxw.ActionBar.getInstance$default(C13021cxw.Companion, null, null, 3, null) : c13021cxw);
    }

    public final AbstractC58260yxt<java.lang.Integer> AEQbTJ(@NotNull final java.util.List<java.lang.String> list) {
        Intrinsics.checkNotNullParameter(list, "");
        final java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList2.add(this.AEQbTJ.fetchVPNInfo((java.lang.String) it.next()));
        }
        AbstractC58260yxt abstractC58260yxtKWHzl = C11607cUn.KWHzl(arrayList2);
        final Function1 function1 = new Function1() { // from class: o.cuj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C12783ctW.OLrzqt(this.AEQbTJ, arrayList, (java.util.List) obj);
            }
        };
        AbstractC58260yxt abstractC58260yxtOLrzqt = abstractC58260yxtKWHzl.OLrzqt(new InterfaceC58229yxO() { // from class: o.cug
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C12783ctW.hDKMBd(function1, obj);
            }
        });
        final Function1 function12 = new Function1() { // from class: o.cuk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C12783ctW.EZpvd(this.copydefault, list, (java.util.List) obj);
            }
        };
        AbstractC58260yxt abstractC58260yxtOLrzqt2 = abstractC58260yxtOLrzqt.OLrzqt(new InterfaceC58229yxO() { // from class: o.cun
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C12783ctW.getNewProxyInstance(function12, obj);
            }
        });
        final Function1 function13 = new Function1() { // from class: o.cuo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C12783ctW.gEmmrt(this.copydefault, arrayList, (Unit) obj);
            }
        };
        AbstractC58260yxt abstractC58260yxtOLrzqt3 = abstractC58260yxtOLrzqt2.OLrzqt(new InterfaceC58229yxO() { // from class: o.cum
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C12783ctW.getFieldNames(function13, obj);
            }
        });
        final Function1 function14 = new Function1() { // from class: o.cur
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C12783ctW.djBIcL(this.AEQbTJ, (java.lang.Integer) obj);
            }
        };
        AbstractC58260yxt<java.lang.Integer> abstractC58260yxtOLrzqt4 = abstractC58260yxtOLrzqt3.OLrzqt(new InterfaceC58229yxO() { // from class: o.cus
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C12783ctW.uzCIH(function14, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtOLrzqt4, "");
        return abstractC58260yxtOLrzqt4;
    }

    public static final InterfaceC58261yxu hDKMBd(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu getNewProxyInstance(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu EZpvd(C12783ctW c12783ctW, java.util.List list, java.util.List list2) {
        Intrinsics.checkNotNullParameter(list2, "");
        return c12783ctW.copydefault.KWHzl(list);
    }

    public static final InterfaceC58261yxu getFieldNames(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu gEmmrt(C12783ctW c12783ctW, java.util.ArrayList arrayList, Unit unit) {
        Intrinsics.checkNotNullParameter(unit, "");
        C11274cId c11274cId = c12783ctW.KWHzl;
        java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList, 10));
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            DeletedWalletEntity deletedWalletEntity = (DeletedWalletEntity) it.next();
            arrayList2.add(new DeletedWalletEntity(deletedWalletEntity.getId(), deletedWalletEntity.getXpriv(), deletedWalletEntity.getXpub(), WalletDeleteStatus.HasDeleteData.getValue()));
        }
        return c11274cId.copydefault(arrayList2);
    }

    public static final InterfaceC58261yxu uzCIH(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu djBIcL(C12783ctW c12783ctW, java.lang.Integer num) {
        Intrinsics.checkNotNullParameter(num, "");
        return C13021cxw.sync$default(c12783ctW.EZpvd, false, 1, null).valueOf();
    }

    public final AbstractC58260yxt<java.lang.Integer> KWHzl(@NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        final java.util.ArrayList arrayList = new java.util.ArrayList();
        AbstractC58260yxt<java.util.List<WalletEntity>> abstractC58260yxtFetchVPNInfo = this.AEQbTJ.fetchVPNInfo(str);
        final Function1 function1 = new Function1() { // from class: o.cud
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C12783ctW.KWHzl(arrayList, this, (java.util.List) obj);
            }
        };
        AbstractC58260yxt<R> abstractC58260yxtOLrzqt = abstractC58260yxtFetchVPNInfo.OLrzqt(new InterfaceC58229yxO() { // from class: o.cua
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C12783ctW.fIwbmz(function1, obj);
            }
        });
        final Function1 function12 = new Function1() { // from class: o.cul
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C12783ctW.KWHzl(this.copydefault, str, (java.util.List) obj);
            }
        };
        AbstractC58260yxt abstractC58260yxtOLrzqt2 = abstractC58260yxtOLrzqt.OLrzqt((InterfaceC58229yxO<? super R, ? extends InterfaceC58261yxu<? extends R>>) new InterfaceC58229yxO() { // from class: o.cuu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C12783ctW.fARcdN(function12, obj);
            }
        });
        final Function1 function13 = new Function1() { // from class: o.cuB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C12783ctW.OLrzqt(this.copydefault, arrayList, (Unit) obj);
            }
        };
        AbstractC58260yxt abstractC58260yxtOLrzqt3 = abstractC58260yxtOLrzqt2.OLrzqt(new InterfaceC58229yxO() { // from class: o.cuA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C12783ctW.AuCTel(function13, obj);
            }
        });
        final Function1 function14 = new Function1() { // from class: o.cuF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C12783ctW.AEQbTJ(this.OLrzqt, (java.lang.Integer) obj);
            }
        };
        AbstractC58260yxt<java.lang.Integer> abstractC58260yxtOLrzqt4 = abstractC58260yxtOLrzqt3.OLrzqt(new InterfaceC58229yxO() { // from class: o.cuE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C12783ctW.iwGUEr(function14, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtOLrzqt4, "");
        return abstractC58260yxtOLrzqt4;
    }

    public static final InterfaceC58261yxu fIwbmz(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu fARcdN(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu KWHzl(C12783ctW c12783ctW, java.lang.String str, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        return c12783ctW.copydefault.EZpvd(str);
    }

    public static final InterfaceC58261yxu AuCTel(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu OLrzqt(C12783ctW c12783ctW, java.util.ArrayList arrayList, Unit unit) {
        Intrinsics.checkNotNullParameter(unit, "");
        C11274cId c11274cId = c12783ctW.KWHzl;
        java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList, 10));
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            DeletedWalletEntity deletedWalletEntity = (DeletedWalletEntity) it.next();
            arrayList2.add(new DeletedWalletEntity(deletedWalletEntity.getId(), deletedWalletEntity.getXpriv(), deletedWalletEntity.getXpub(), WalletDeleteStatus.HasDeleteData.getValue()));
        }
        return c11274cId.copydefault(arrayList2);
    }

    public static final InterfaceC58261yxu iwGUEr(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu AEQbTJ(C12783ctW c12783ctW, java.lang.Integer num) {
        Intrinsics.checkNotNullParameter(num, "");
        return C13021cxw.sync$default(c12783ctW.EZpvd, false, 1, null).valueOf();
    }

    public static final InterfaceC58261yxu zsXlph(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    /* JADX DEBUG: Type inference failed for r5v1. Raw type applied. Possible types: o.yxt<R>, java.lang.Object, o.yxt<java.lang.Integer> */
    public final AbstractC58260yxt<java.lang.Integer> AEQbTJ(@NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        AbstractC58260yxt<WalletEntity> abstractC58260yxtAkhnZx = this.AEQbTJ.AkhnZx(str);
        final Function1 function1 = new Function1() { // from class: o.cuC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C12783ctW.OLrzqt(this.KWHzl, str, (WalletEntity) obj);
            }
        };
        AbstractC58260yxt abstractC58260yxtOLrzqt = abstractC58260yxtAkhnZx.OLrzqt(new InterfaceC58229yxO() { // from class: o.cuD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C12783ctW.zsXlph(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtOLrzqt, "");
        return abstractC58260yxtOLrzqt;
    }

    public static final InterfaceC58261yxu OLrzqt(final C12783ctW c12783ctW, final java.lang.String str, WalletEntity walletEntity) {
        Intrinsics.checkNotNullParameter(walletEntity, "");
        if (walletEntity.getSyncStatus() == WalletSyncStatus.NotSync.getValue()) {
            AbstractC58260yxt<Unit> abstractC58260yxtOLrzqt = c12783ctW.copydefault.OLrzqt(str);
            final Function1 function1 = new Function1() { // from class: o.cup
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C12783ctW.copydefault((Unit) obj);
                }
            };
            return abstractC58260yxtOLrzqt.copydefault(new InterfaceC58229yxO() { // from class: o.cut
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return C12783ctW.AubY(function1, obj);
                }
            });
        }
        final java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(new DeletedWalletEntity(walletEntity.getId(), walletEntity.getXpriv(), walletEntity.getXpub(), WalletDeleteStatus.NotDeleteData.getValue()));
        AbstractC58260yxt<java.util.List<java.lang.Long>> abstractC58260yxtOLrzqt2 = c12783ctW.KWHzl.OLrzqt(arrayList);
        final Function1 function12 = new Function1() { // from class: o.cuq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C12783ctW.OLrzqt(this.AEQbTJ, str, (java.util.List) obj);
            }
        };
        AbstractC58260yxt<R> abstractC58260yxtOLrzqt3 = abstractC58260yxtOLrzqt2.OLrzqt(new InterfaceC58229yxO() { // from class: o.cuw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C12783ctW.wlaJM(function12, obj);
            }
        });
        final Function1 function13 = new Function1() { // from class: o.cuy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C12783ctW.AhwBna(this.EZpvd, arrayList, (Unit) obj);
            }
        };
        AbstractC58260yxt abstractC58260yxtOLrzqt4 = abstractC58260yxtOLrzqt3.OLrzqt((InterfaceC58229yxO<? super R, ? extends InterfaceC58261yxu<? extends R>>) new InterfaceC58229yxO() { // from class: o.cuv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C12783ctW.zLjUOn(function13, obj);
            }
        });
        final Function1 function14 = new Function1() { // from class: o.cux
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C12783ctW.AYXKKw(this.AEQbTJ, (java.lang.Integer) obj);
            }
        };
        return abstractC58260yxtOLrzqt4.OLrzqt(new InterfaceC58229yxO() { // from class: o.cuz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C12783ctW.AuCTelauCTel(function14, obj);
            }
        });
    }

    public static final java.lang.Integer AubY(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.lang.Integer) function1.invoke(obj);
    }

    public static final java.lang.Integer copydefault(Unit unit) {
        Intrinsics.checkNotNullParameter(unit, "");
        return 1;
    }

    public static final InterfaceC58261yxu wlaJM(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu OLrzqt(C12783ctW c12783ctW, java.lang.String str, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        return c12783ctW.copydefault.OLrzqt(str);
    }

    public static final InterfaceC58261yxu zLjUOn(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu AhwBna(C12783ctW c12783ctW, java.util.ArrayList arrayList, Unit unit) {
        Intrinsics.checkNotNullParameter(unit, "");
        C11274cId c11274cId = c12783ctW.KWHzl;
        java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList, 10));
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            DeletedWalletEntity deletedWalletEntity = (DeletedWalletEntity) it.next();
            arrayList2.add(new DeletedWalletEntity(deletedWalletEntity.getId(), deletedWalletEntity.getXpriv(), deletedWalletEntity.getXpub(), WalletDeleteStatus.HasDeleteData.getValue()));
        }
        return c11274cId.copydefault(arrayList2);
    }

    public static final InterfaceC58261yxu AuCTelauCTel(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu AYXKKw(C12783ctW c12783ctW, java.lang.Integer num) {
        Intrinsics.checkNotNullParameter(num, "");
        return C13021cxw.sync$default(c12783ctW.EZpvd, false, 1, null).valueOf();
    }

    public final AbstractC58260yxt<java.lang.Integer> KWHzl(@NotNull final java.util.List<java.lang.String> list) {
        Intrinsics.checkNotNullParameter(list, "");
        final java.util.ArrayList arrayList = new java.util.ArrayList();
        AbstractC58260yxt<java.util.List<WalletEntity>> abstractC58260yxtCopydefault = this.AEQbTJ.copydefault(list);
        final Function1 function1 = new Function1() { // from class: o.cuG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C12783ctW.AEQbTJ(arrayList, this, (java.util.List) obj);
            }
        };
        AbstractC58260yxt<R> abstractC58260yxtOLrzqt = abstractC58260yxtCopydefault.OLrzqt(new InterfaceC58229yxO() { // from class: o.cuI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C12783ctW.AxsJAY(function1, obj);
            }
        });
        final Function1 function12 = new Function1() { // from class: o.cub
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C12783ctW.copydefault(this.copydefault, list, (java.util.List) obj);
            }
        };
        AbstractC58260yxt abstractC58260yxtOLrzqt2 = abstractC58260yxtOLrzqt.OLrzqt((InterfaceC58229yxO<? super R, ? extends InterfaceC58261yxu<? extends R>>) new InterfaceC58229yxO() { // from class: o.cuc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C12783ctW.zuBGHE(function12, obj);
            }
        });
        final Function1 function13 = new Function1() { // from class: o.cue
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C12783ctW.AYXKKw(this.OLrzqt, arrayList, (Unit) obj);
            }
        };
        AbstractC58260yxt abstractC58260yxtOLrzqt3 = abstractC58260yxtOLrzqt2.OLrzqt(new InterfaceC58229yxO() { // from class: o.cuf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C12783ctW.gHZMYf(function13, obj);
            }
        });
        final Function1 function14 = new Function1() { // from class: o.cui
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C12783ctW.gEmmrt(this.AEQbTJ, (java.lang.Integer) obj);
            }
        };
        AbstractC58260yxt<java.lang.Integer> abstractC58260yxtOLrzqt4 = abstractC58260yxtOLrzqt3.OLrzqt(new InterfaceC58229yxO() { // from class: o.cuh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C12783ctW.sSMYrx(function14, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtOLrzqt4, "");
        return abstractC58260yxtOLrzqt4;
    }

    public static final InterfaceC58261yxu AxsJAY(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu zuBGHE(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu copydefault(C12783ctW c12783ctW, java.util.List list, java.util.List list2) {
        Intrinsics.checkNotNullParameter(list2, "");
        return c12783ctW.copydefault.OLrzqt((java.util.List<java.lang.String>) list);
    }

    public static final InterfaceC58261yxu gHZMYf(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu AYXKKw(C12783ctW c12783ctW, java.util.ArrayList arrayList, Unit unit) {
        Intrinsics.checkNotNullParameter(unit, "");
        C11274cId c11274cId = c12783ctW.KWHzl;
        java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList, 10));
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            DeletedWalletEntity deletedWalletEntity = (DeletedWalletEntity) it.next();
            arrayList2.add(new DeletedWalletEntity(deletedWalletEntity.getId(), deletedWalletEntity.getXpriv(), deletedWalletEntity.getXpub(), WalletDeleteStatus.HasDeleteData.getValue()));
        }
        return c11274cId.copydefault(arrayList2);
    }

    public static final InterfaceC58261yxu sSMYrx(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu gEmmrt(C12783ctW c12783ctW, java.lang.Integer num) {
        Intrinsics.checkNotNullParameter(num, "");
        return C13021cxw.sync$default(c12783ctW.EZpvd, false, 1, null).valueOf();
    }

    public static final InterfaceC58261yxu OLrzqt(C12783ctW c12783ctW, java.util.ArrayList arrayList, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            java.util.List list2 = (java.util.List) it.next();
            java.util.ArrayList<WalletEntity> arrayList2 = new java.util.ArrayList();
            for (java.lang.Object obj : list2) {
                if (((WalletEntity) obj).getSyncStatus() != WalletSyncStatus.NotSync.getValue()) {
                    arrayList2.add(obj);
                }
            }
            java.util.ArrayList arrayList3 = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList2, 10));
            for (WalletEntity walletEntity : arrayList2) {
                arrayList3.add(new DeletedWalletEntity(walletEntity.getId(), walletEntity.getXpriv(), walletEntity.getXpub(), WalletDeleteStatus.NotDeleteData.getValue()));
            }
            arrayList.addAll(arrayList3);
        }
        return c12783ctW.KWHzl.OLrzqt(arrayList);
    }

    public static final InterfaceC58261yxu KWHzl(java.util.ArrayList arrayList, C12783ctW c12783ctW, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        java.util.ArrayList<WalletEntity> arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            if (((WalletEntity) obj).getSyncStatus() != WalletSyncStatus.NotSync.getValue()) {
                arrayList2.add(obj);
            }
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList2, 10));
        for (WalletEntity walletEntity : arrayList2) {
            arrayList3.add(new DeletedWalletEntity(walletEntity.getId(), walletEntity.getXpriv(), walletEntity.getXpub(), WalletDeleteStatus.NotDeleteData.getValue()));
        }
        arrayList.addAll(arrayList3);
        return c12783ctW.KWHzl.OLrzqt(arrayList);
    }

    public static final InterfaceC58261yxu AEQbTJ(java.util.ArrayList arrayList, C12783ctW c12783ctW, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        java.util.ArrayList<WalletEntity> arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            if (((WalletEntity) obj).getSyncStatus() != WalletSyncStatus.NotSync.getValue()) {
                arrayList2.add(obj);
            }
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList2, 10));
        for (WalletEntity walletEntity : arrayList2) {
            arrayList3.add(new DeletedWalletEntity(walletEntity.getId(), walletEntity.getXpriv(), walletEntity.getXpub(), WalletDeleteStatus.NotDeleteData.getValue()));
        }
        arrayList.addAll(arrayList3);
        return c12783ctW.KWHzl.OLrzqt(arrayList);
    }
}
