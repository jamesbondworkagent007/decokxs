package o;

import com.google.gson.Gson;
import com.okinc.business.defi.biz.database.wallet.entity.CustomFeeEntity;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import o.C8419bCP;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bTp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC9346bTp extends AbstractC8485bDc<C9215bRQ> {
    public final AbstractC8564bFB<?, ?> AkhnZx;
    public java.lang.String DbNXlk;
    public java.lang.String fetchVPNInfo;
    public java.lang.String isConnected;
    public boolean valueOf;
    public java.lang.String values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final kotlin.Pair EZpvd(kotlin.Pair pair, kotlin.Pair pair2) {
        Intrinsics.checkNotNullParameter(pair, "");
        Intrinsics.checkNotNullParameter(pair2, "");
        return pair;
    }

    public abstract C9215bRQ AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(java.lang.String str) {
        this.DbNXlk = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(java.lang.String str) {
        this.fetchVPNInfo = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(java.lang.String str) {
        this.isConnected = str;
    }

    public abstract C9215bRQ copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(java.lang.String str) {
        this.values = str;
    }

    public abstract java.lang.String djBIcL(int i);

    public abstract boolean ejfBZ();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String fARcdN() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String getFieldNames() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getNewProxyInstance() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String hDKMBd() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String iwGUEr() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AbstractC8564bFB<?, ?> uzCIH() {
        return this.AkhnZx;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC9346bTp(@NotNull AbstractC8564bFB<?, ?> abstractC8564bFB) {
        super(abstractC8564bFB);
        Intrinsics.checkNotNullParameter(abstractC8564bFB, "");
        this.AkhnZx = abstractC8564bFB;
    }

    @Override // o.AbstractC8426bCW
    public AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> gEmmrt() {
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXGEmmrt = super.gEmmrt();
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXAuCTelauCTel = AuCTelauCTel();
        final Function2 function2 = new Function2() { // from class: o.bTr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return AbstractC9346bTp.EZpvd((kotlin.Pair) obj, (kotlin.Pair) obj2);
            }
        };
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXEZpvd = AbstractC58185ywX.EZpvd(abstractC58185ywXGEmmrt, abstractC58185ywXAuCTelauCTel, new InterfaceC58223yxI() { // from class: o.bTt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58223yxI
            public final java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) {
                return AbstractC9346bTp.copydefault(function2, obj, obj2);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXEZpvd, "");
        return abstractC58185ywXEZpvd;
    }

    public static final kotlin.Pair copydefault(Function2 function2, java.lang.Object obj, java.lang.Object obj2) {
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(obj2, "");
        return (kotlin.Pair) function2.invoke(obj, obj2);
    }

    /* JADX DEBUG: Type inference failed for r0v9. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> */
    public final AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> AuCTelauCTel() {
        java.lang.Integer bizType = this.AkhnZx.OJuSTm().getBizType();
        if ((bizType != null && bizType.intValue() == 1) || DbNXlk() == 4) {
            AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(C56390yDp.OLrzqt(java.lang.Boolean.TRUE, ""));
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
            return abstractC58185ywXKWHzl;
        }
        AbstractC58185ywX<java.util.List<CustomFeeEntity>> abstractC58185ywXEZpvd = C8419bCP.TaskDescription.getInstance$default(C8419bCP.Companion, null, 1, null).OLrzqt(java.lang.Long.valueOf(AYXKKw().fetchVPNInfo())).EZpvd();
        final Function1 function1 = new Function1() { // from class: o.bTD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC9346bTp.OLrzqt((java.lang.Throwable) obj);
            }
        };
        AbstractC58185ywX<java.util.List<CustomFeeEntity>> abstractC58185ywXDjBIcL = abstractC58185ywXEZpvd.djBIcL(new InterfaceC58229yxO() { // from class: o.bTK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return AbstractC9346bTp.valueOf(function1, obj);
            }
        });
        final Function1 function12 = new Function1() { // from class: o.bTv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC9346bTp.AEQbTJ(this.copydefault, (java.util.List) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywXDjBIcL.AEQbTJ(new InterfaceC58229yxO() { // from class: o.bTs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return AbstractC9346bTp.djBIcL(function12, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final java.util.List valueOf(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.util.List) function1.invoke(obj);
    }

    public static final java.util.List OLrzqt(java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        return yDY.AhwBna();
    }

    public static final kotlin.Pair djBIcL(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    public static final kotlin.Pair AEQbTJ(AbstractC9346bTp abstractC9346bTp, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        CustomFeeEntity customFeeEntity = (CustomFeeEntity) CollectionsKt___CollectionsKt.firstOrNull(list);
        if (customFeeEntity != null) {
            if (abstractC9346bTp.ejfBZ() && customFeeEntity.getBaseFee().length() > 0 && customFeeEntity.getPriorityFee().length() > 0 && C33129mqd.AEQbTJ(customFeeEntity.getBaseFee(), 0) && C33129mqd.AEQbTJ(customFeeEntity.getPriorityFee(), 0)) {
                C10856bwO.copydefault("TXFeeBaseEVMHandler", 0, "queryLocalCustomFee " + new Gson().toJson(customFeeEntity));
                abstractC9346bTp.OLrzqt(customFeeEntity.getBaseFee(), customFeeEntity.getPriorityFee(), abstractC9346bTp.djBIcL(4), false, false);
                abstractC9346bTp.valueOf = true;
            } else if (!abstractC9346bTp.ejfBZ() && customFeeEntity.getGasPrice().length() > 0 && C33129mqd.AEQbTJ(customFeeEntity.getGasPrice(), 0)) {
                C10856bwO.copydefault("TXFeeBaseEVMHandler", 0, "queryLocalCustomFee " + new Gson().toJson(customFeeEntity));
                abstractC9346bTp.AEQbTJ(customFeeEntity.getGasPrice(), abstractC9346bTp.djBIcL(4), false, false);
                abstractC9346bTp.valueOf = true;
            }
        }
        return C56390yDp.OLrzqt(java.lang.Boolean.TRUE, "");
    }

    public static /* synthetic */ java.lang.String getGasLimit$default(AbstractC9346bTp abstractC9346bTp, int i, int i2, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getGasLimit");
        }
        if ((i2 & 1) != 0) {
            i = abstractC9346bTp.DbNXlk();
        }
        return abstractC9346bTp.djBIcL(i);
    }

    public void AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        OLrzqt(z, z2, new CustomFeeEntity(AYXKKw().fetchVPNInfo(), str, null, null, 12, null));
    }

    public void OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        OLrzqt(z, z2, new CustomFeeEntity(AYXKKw().fetchVPNInfo(), null, str, str2, 2, null));
    }

    public final void EZpvd(boolean z) {
        if (z) {
            return;
        }
        AbstractC58260yxt<Unit> abstractC58260yxtKWHzl = C8419bCP.TaskDescription.getInstance$default(C8419bCP.Companion, null, 1, null).KWHzl(java.lang.Long.valueOf(AYXKKw().fetchVPNInfo()));
        final Function1 function1 = new Function1() { // from class: o.bTu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC9346bTp.copydefault(this.AEQbTJ, (Unit) obj);
            }
        };
        InterfaceC58227yxM<? super Unit> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.bTy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                AbstractC9346bTp.DbNXlk(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.bTz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC9346bTp.djBIcL((java.lang.Throwable) obj);
            }
        };
        abstractC58260yxtKWHzl.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.bTw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                AbstractC9346bTp.fARcdN(function12, obj);
            }
        });
    }

    public static final void DbNXlk(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(AbstractC9346bTp abstractC9346bTp, Unit unit) {
        abstractC9346bTp.valueOf = false;
        return Unit.INSTANCE;
    }

    public static final void fARcdN(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit djBIcL(java.lang.Throwable th) {
        C55326xho.toastWithFailedIcon$default(C13754dXa.FragmentManager.isHandleNativeActionModesEnabled, 0, 1, (java.lang.Object) null);
        C43296rmc.copydefault("TXFeeBaseEVMHandler", "updateIsSaveCustomFee failed", th);
        return Unit.INSTANCE;
    }

    public static final void isConnected(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public final void OLrzqt(final boolean z, boolean z2, CustomFeeEntity customFeeEntity) {
        if (z) {
            AbstractC58260yxt<Unit> abstractC58260yxtCopydefault = C8419bCP.TaskDescription.getInstance$default(C8419bCP.Companion, null, 1, null).copydefault(customFeeEntity);
            final Function1 function1 = new Function1() { // from class: o.bTn
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return AbstractC9346bTp.KWHzl(this.KWHzl, z, (Unit) obj);
                }
            };
            InterfaceC58227yxM<? super Unit> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.bTm
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    AbstractC9346bTp.isConnected(function1, obj);
                }
            };
            final Function1 function12 = new Function1() { // from class: o.bTA
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return AbstractC9346bTp.valueOf((java.lang.Throwable) obj);
                }
            };
            abstractC58260yxtCopydefault.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.bTx
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    AbstractC9346bTp.values(function12, obj);
                }
            });
            return;
        }
        if (z2) {
            AbstractC58260yxt<Unit> abstractC58260yxtKWHzl = C8419bCP.TaskDescription.getInstance$default(C8419bCP.Companion, null, 1, null).KWHzl(java.lang.Long.valueOf(customFeeEntity.getChainId()));
            final Function1 function13 = new Function1() { // from class: o.bTC
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return AbstractC9346bTp.AEQbTJ(this.copydefault, z, (Unit) obj);
                }
            };
            InterfaceC58227yxM<? super Unit> interfaceC58227yxM2 = new InterfaceC58227yxM() { // from class: o.bTB
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    AbstractC9346bTp.fetchVPNInfo(function13, obj);
                }
            };
            final Function1 function14 = new Function1() { // from class: o.bTE
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return AbstractC9346bTp.gEmmrt((java.lang.Throwable) obj);
                }
            };
            abstractC58260yxtKWHzl.AEQbTJ(interfaceC58227yxM2, new InterfaceC58227yxM() { // from class: o.bTF
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    AbstractC9346bTp.AkhnZx(function14, obj);
                }
            });
        }
    }

    public static final Unit KWHzl(AbstractC9346bTp abstractC9346bTp, boolean z, Unit unit) {
        abstractC9346bTp.valueOf = z;
        return Unit.INSTANCE;
    }

    public static final void values(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit valueOf(java.lang.Throwable th) {
        C55326xho.toastWithFailedIcon$default(C13754dXa.FragmentManager.isHandleNativeActionModesEnabled, 0, 1, (java.lang.Object) null);
        C43296rmc.copydefault("TXFeeBaseEVMHandler", "saveLocalCustomFee failed", th);
        return Unit.INSTANCE;
    }

    public static final void fetchVPNInfo(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(AbstractC9346bTp abstractC9346bTp, boolean z, Unit unit) {
        abstractC9346bTp.valueOf = z;
        return Unit.INSTANCE;
    }

    public static final void AkhnZx(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit gEmmrt(java.lang.Throwable th) {
        C55326xho.toastWithFailedIcon$default(C13754dXa.FragmentManager.isHandleNativeActionModesEnabled, 0, 1, (java.lang.Object) null);
        C43296rmc.copydefault("TXFeeBaseEVMHandler", "deleteLocalCustomFee failed", th);
        return Unit.INSTANCE;
    }
}
