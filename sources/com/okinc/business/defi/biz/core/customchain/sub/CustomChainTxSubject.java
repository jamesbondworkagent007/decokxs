package com.okinc.business.defi.biz.core.customchain.sub;

import com.okinc.business.defi.biz.core.customchain.meta.CustomChainMeta;
import com.okinc.business.defi.biz.core.customchain.rpc.CustomChainTransactionReceipt;
import com.okinc.business.defi.biz.core.customchain.sub.CustomChainTxSubject;
import com.okinc.business.defi.biz.core.error.OKWException;
import com.okinc.business.defi.biz.database.wallet.entity.CustomChainTransactionEntity;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringNumberConversionsKt;
import o.AbstractC10707btY;
import o.AbstractC10763bub;
import o.AbstractC10767buf;
import o.AbstractC58185ywX;
import o.AbstractC58247yxg;
import o.AbstractC58260yxt;
import o.C10598brV;
import o.C10734btz;
import o.C10746buK;
import o.C11473cPo;
import o.C11607cUn;
import o.C33129mqd;
import o.C54862xYb;
import o.C56392yDr;
import o.C56402yEa;
import o.C58266yxz;
import o.InterfaceC56387yDm;
import o.InterfaceC58217yxC;
import o.InterfaceC58223yxI;
import o.InterfaceC58227yxM;
import o.InterfaceC58229yxO;
import o.InterfaceC58239yxY;
import o.InterfaceC58261yxu;
import o.InterfaceC60096zvd;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class CustomChainTxSubject extends AbstractC10763bub<C10746buK> {
    public InterfaceC58217yxC AEQbTJ;
    public Long EZpvd;
    public InterfaceC58217yxC KWHzl;
    public String AhwBna = "";
    public String copydefault = "";
    public String valueOf = "";
    public final InterfaceC56387yDm AYXKKw = C56392yDr.copydefault(new Function0() { // from class: o.buB
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return CustomChainTxSubject.gEmmrt();
        }
    });
    public final InterfaceC56387yDm djBIcL = C56392yDr.copydefault(new Function0() { // from class: o.buD
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return CustomChainTxSubject.djBIcL();
        }
    });

    public static final C11473cPo gEmmrt() {
        return new C11473cPo();
    }

    public final C11473cPo AhwBna() {
        return (C11473cPo) this.AYXKKw.getValue();
    }

    public static final HashMap djBIcL() {
        return new HashMap();
    }

    public final HashMap<String, Integer> AYXKKw() {
        return (HashMap) this.djBIcL.getValue();
    }

    public final void KWHzl(@NotNull AbstractC10767buf abstractC10767buf) {
        Intrinsics.checkNotNullParameter(abstractC10767buf, "");
        Long l = this.EZpvd;
        long jAEQbTJ = abstractC10767buf.AEQbTJ();
        if (l == null || l.longValue() != jAEQbTJ || !Intrinsics.EZpvd((Object) this.AhwBna, (Object) abstractC10767buf.AhwBna())) {
            values();
            this.AhwBna = abstractC10767buf.AhwBna();
            this.EZpvd = Long.valueOf(abstractC10767buf.AEQbTJ());
            this.copydefault = abstractC10767buf.copydefault();
            CustomChainMeta customChainMetaEZpvd = C10598brV.AEQbTJ.EZpvd(abstractC10767buf.AEQbTJ());
            String strIsConnected = customChainMetaEZpvd != null ? customChainMetaEZpvd.isConnected() : null;
            this.valueOf = strIsConnected != null ? strIsConnected : "";
        }
        OLrzqt(abstractC10767buf);
        super.EZpvd(abstractC10767buf);
        isConnected();
    }

    public final void OLrzqt(@NotNull AbstractC10767buf abstractC10767buf) {
        Intrinsics.checkNotNullParameter(abstractC10767buf, "");
        super.AEQbTJ(abstractC10767buf);
        if (OLrzqt().isEmpty()) {
            values();
        }
    }

    public final void isConnected() {
        InterfaceC58217yxC interfaceC58217yxC = this.KWHzl;
        if (interfaceC58217yxC != null) {
            Intrinsics.copydefault(interfaceC58217yxC);
            if (!interfaceC58217yxC.isDisposed()) {
                return;
            }
        }
        InterfaceC58217yxC interfaceC58217yxC2 = this.KWHzl;
        if (interfaceC58217yxC2 != null) {
            interfaceC58217yxC2.dispose();
        }
        AbstractC58247yxg<Long> abstractC58247yxgInterval = AbstractC58247yxg.interval(1L, 20L, TimeUnit.SECONDS, C58266yxz.OLrzqt());
        final Function1 function1 = new Function1() { // from class: o.buh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return CustomChainTxSubject.EZpvd(this.copydefault, (java.lang.Long) obj);
            }
        };
        this.KWHzl = abstractC58247yxgInterval.subscribe(new InterfaceC58227yxM() { // from class: o.buo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                CustomChainTxSubject.AubY(function1, obj);
            }
        });
    }

    public static final void AubY(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(final CustomChainTxSubject customChainTxSubject, Long l) {
        if (customChainTxSubject.OLrzqt().isEmpty()) {
            customChainTxSubject.values();
        }
        if (customChainTxSubject.valueOf.length() == 0 || customChainTxSubject.copydefault.length() == 0 || customChainTxSubject.EZpvd == null || customChainTxSubject.AhwBna.length() == 0) {
            return Unit.INSTANCE;
        }
        InterfaceC58217yxC interfaceC58217yxC = customChainTxSubject.AEQbTJ;
        if (interfaceC58217yxC != null) {
            Intrinsics.copydefault(interfaceC58217yxC);
            if (!interfaceC58217yxC.isDisposed()) {
                return Unit.INSTANCE;
            }
        }
        AbstractC58260yxt<String> abstractC58260yxtCopydefault = C10734btz.KWHzl.copydefault(customChainTxSubject.valueOf, customChainTxSubject.copydefault);
        final Function1 function1 = new Function1() { // from class: o.buI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return CustomChainTxSubject.copydefault((java.lang.Throwable) obj);
            }
        };
        AbstractC58260yxt<String> abstractC58260yxtEZpvd = abstractC58260yxtCopydefault.EZpvd(new InterfaceC58229yxO() { // from class: o.buH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return CustomChainTxSubject.getFieldNames(function1, obj);
            }
        });
        final Function1 function12 = new Function1() { // from class: o.bud
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return CustomChainTxSubject.AEQbTJ(this.copydefault, (java.lang.String) obj);
            }
        };
        AbstractC58185ywX<R> abstractC58185ywXKWHzl = abstractC58260yxtEZpvd.KWHzl(new InterfaceC58229yxO() { // from class: o.buc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return CustomChainTxSubject.AuCTelauCTel(function12, obj);
            }
        });
        final Function1 function13 = new Function1() { // from class: o.buj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return CustomChainTxSubject.EZpvd(this.EZpvd, (C10746buK) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.bul
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                CustomChainTxSubject.iwGUEr(function13, obj);
            }
        };
        final Function1 function14 = new Function1() { // from class: o.buk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return CustomChainTxSubject.AEQbTJ(this.KWHzl, (java.lang.Throwable) obj);
            }
        };
        customChainTxSubject.AEQbTJ = abstractC58185ywXKWHzl.AEQbTJ((InterfaceC58227yxM<? super R>) interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.bui
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                CustomChainTxSubject.uzCIH(function14, obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final InterfaceC58261yxu getFieldNames(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu copydefault(Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        return AbstractC58260yxt.AEQbTJ(new SubException.RequestNonceError(th.getMessage()));
    }

    public static final InterfaceC60096zvd AuCTelauCTel(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd AEQbTJ(final CustomChainTxSubject customChainTxSubject, String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C11473cPo c11473cPoAhwBna = customChainTxSubject.AhwBna();
        String str2 = customChainTxSubject.AhwBna;
        Long l = customChainTxSubject.EZpvd;
        Intrinsics.copydefault(l);
        AbstractC58260yxt<List<CustomChainTransactionEntity>> abstractC58260yxtEZpvd = c11473cPoAhwBna.EZpvd(str2, l.longValue(), Long.parseLong(str), C56402yEa.EZpvd(1));
        final Function1 function1 = new Function1() { // from class: o.but
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return CustomChainTxSubject.KWHzl(this.EZpvd, (java.util.List) obj);
            }
        };
        return abstractC58260yxtEZpvd.KWHzl(new InterfaceC58229yxO() { // from class: o.buu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return CustomChainTxSubject.zLjUOn(function1, obj);
            }
        });
    }

    public static final InterfaceC60096zvd zLjUOn(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd KWHzl(CustomChainTxSubject customChainTxSubject, List list) throws SubException.NoPendingTxError {
        Intrinsics.checkNotNullParameter(list, "");
        if (list.isEmpty()) {
            throw new SubException.NoPendingTxError();
        }
        return customChainTxSubject.OLrzqt((List<CustomChainTransactionEntity>) list);
    }

    public static final void iwGUEr(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(CustomChainTxSubject customChainTxSubject, C10746buK c10746buK) {
        ArrayList<AbstractC10707btY<C10746buK>> arrayListOLrzqt = customChainTxSubject.OLrzqt();
        ArrayList<AbstractC10767buf> arrayList = new ArrayList();
        for (Object obj : arrayListOLrzqt) {
            if (obj instanceof AbstractC10767buf) {
                arrayList.add(obj);
            }
        }
        for (AbstractC10767buf abstractC10767buf : arrayList) {
            if (abstractC10767buf.AEQbTJ() == c10746buK.AEQbTJ() && abstractC10767buf.EZpvd() == c10746buK.copydefault() && (abstractC10767buf.KWHzl().isEmpty() || abstractC10767buf.KWHzl().contains(c10746buK.gEmmrt()))) {
                Intrinsics.copydefault(c10746buK);
                abstractC10767buf.OLrzqt(c10746buK);
            }
        }
        InterfaceC58217yxC interfaceC58217yxC = customChainTxSubject.AEQbTJ;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        return Unit.INSTANCE;
    }

    public static final void uzCIH(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(CustomChainTxSubject customChainTxSubject, Throwable th) {
        InterfaceC58217yxC interfaceC58217yxC = customChainTxSubject.AEQbTJ;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        if (!(th instanceof SubException.RequestNonceError)) {
            boolean z = th instanceof SubException.NoPendingTxError;
        }
        return Unit.INSTANCE;
    }

    public final AbstractC58185ywX<C10746buK> OLrzqt(List<CustomChainTransactionEntity> list) {
        ArrayList arrayList = new ArrayList();
        for (final CustomChainTransactionEntity customChainTransactionEntity : list) {
            AYXKKw().put(customChainTransactionEntity.getTxId(), Integer.valueOf(customChainTransactionEntity.getTxStatus()));
            AbstractC58260yxt<CustomChainTransactionReceipt> abstractC58260yxtAhwBna = C10734btz.KWHzl.AhwBna(this.valueOf, customChainTransactionEntity.getTxHash());
            final Function1 function1 = new Function1() { // from class: o.buv
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return CustomChainTxSubject.EZpvd(customChainTransactionEntity, this, (CustomChainTransactionReceipt) obj);
                }
            };
            arrayList.add(abstractC58260yxtAhwBna.OLrzqt(new InterfaceC58229yxO() { // from class: o.bus
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return CustomChainTxSubject.fJNWhG(function1, obj);
                }
            }));
        }
        final ArrayList arrayList2 = new ArrayList();
        final ArrayList arrayList3 = new ArrayList();
        AbstractC58185ywX abstractC58185ywXAEQbTJ = AbstractC58260yxt.AEQbTJ(arrayList);
        final Function1 function12 = new Function1() { // from class: o.buz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(CustomChainTxSubject.OLrzqt((CustomChainTxSubject.TaskDescription) obj));
            }
        };
        AbstractC58185ywX abstractC58185ywXKWHzl = abstractC58185ywXAEQbTJ.KWHzl(new InterfaceC58239yxY() { // from class: o.buw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58239yxY
            public final boolean test(java.lang.Object obj) {
                return CustomChainTxSubject.fARcdN(function12, obj);
            }
        });
        final Function1 function13 = new Function1() { // from class: o.buA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return CustomChainTxSubject.EZpvd(this.EZpvd, arrayList2, arrayList3, (CustomChainTxSubject.TaskDescription) obj);
            }
        };
        AbstractC58185ywX<C10746buK> abstractC58185ywXKWHzl2 = abstractC58185ywXKWHzl.KWHzl(new InterfaceC58229yxO() { // from class: o.bux
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return CustomChainTxSubject.hDKMBd(function13, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl2, "");
        return abstractC58185ywXKWHzl2;
    }

    public static final InterfaceC58261yxu fJNWhG(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu EZpvd(final CustomChainTransactionEntity customChainTransactionEntity, CustomChainTxSubject customChainTxSubject, final CustomChainTransactionReceipt customChainTransactionReceipt) {
        Intrinsics.checkNotNullParameter(customChainTransactionReceipt, "");
        String blockHash = customChainTransactionReceipt.getBlockHash();
        if (blockHash == null || blockHash.length() == 0) {
            return AbstractC58260yxt.copydefault(new TaskDescription(customChainTransactionEntity.getTxId(), customChainTransactionEntity.getTxHash(), customChainTransactionEntity.getNonce(), -1, "", customChainTransactionEntity.getCreateAt(), 0L));
        }
        AbstractC58260yxt<String> abstractC58260yxtEZpvd = C10734btz.KWHzl.EZpvd(customChainTxSubject.valueOf, customChainTransactionReceipt.getBlockHash());
        final Function1 function1 = new Function1() { // from class: o.bum
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return CustomChainTxSubject.EZpvd(customChainTransactionReceipt, customChainTransactionEntity, (java.lang.String) obj);
            }
        };
        return abstractC58260yxtEZpvd.copydefault(new InterfaceC58229yxO() { // from class: o.buq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return CustomChainTxSubject.values(function1, obj);
            }
        });
    }

    public static final TaskDescription values(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (TaskDescription) function1.invoke(obj);
    }

    public static final TaskDescription EZpvd(CustomChainTransactionReceipt customChainTransactionReceipt, CustomChainTransactionEntity customChainTransactionEntity, String str) {
        Integer intOrNull;
        Intrinsics.checkNotNullParameter(str, "");
        String status = customChainTransactionReceipt.getStatus();
        int iIntValue = (status == null || (intOrNull = StringsKt__StringNumberConversionsKt.toIntOrNull(status)) == null) ? -1 : intOrNull.intValue();
        String gasUsed = customChainTransactionReceipt.getGasUsed();
        if (gasUsed == null || gasUsed.length() == 0) {
            gasUsed = "0";
        }
        return new TaskDescription(customChainTransactionEntity.getTxId(), customChainTransactionEntity.getTxHash(), customChainTransactionEntity.getNonce(), iIntValue, gasUsed, customChainTransactionEntity.getCreateAt(), C33129mqd.valueOf(C54862xYb.OLrzqt(str, "1000")));
    }

    public static final boolean fARcdN(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return ((Boolean) function1.invoke(obj)).booleanValue();
    }

    public static final boolean OLrzqt(TaskDescription taskDescription) {
        Intrinsics.checkNotNullParameter(taskDescription, "");
        return taskDescription.AhwBna();
    }

    public static final InterfaceC60096zvd hDKMBd(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd EZpvd(final CustomChainTxSubject customChainTxSubject, final ArrayList arrayList, final ArrayList arrayList2, final TaskDescription taskDescription) {
        Intrinsics.checkNotNullParameter(taskDescription, "");
        C11473cPo c11473cPoAhwBna = customChainTxSubject.AhwBna();
        String str = customChainTxSubject.AhwBna;
        Long l = customChainTxSubject.EZpvd;
        Intrinsics.copydefault(l);
        AbstractC58260yxt<List<CustomChainTransactionEntity>> abstractC58260yxtOLrzqt = c11473cPoAhwBna.OLrzqt(str, l.longValue(), taskDescription.OLrzqt());
        final Function1 function1 = new Function1() { // from class: o.bun
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return CustomChainTxSubject.AEQbTJ(taskDescription, customChainTxSubject, arrayList, arrayList2, (java.util.List) obj);
            }
        };
        return abstractC58260yxtOLrzqt.OLrzqt(new InterfaceC58229yxO() { // from class: o.bur
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return CustomChainTxSubject.getNewProxyInstance(function1, obj);
            }
        }).EZpvd();
    }

    public static final InterfaceC58261yxu getNewProxyInstance(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu AEQbTJ(final TaskDescription taskDescription, final CustomChainTxSubject customChainTxSubject, ArrayList arrayList, ArrayList arrayList2, List list) {
        Intrinsics.checkNotNullParameter(list, "");
        int i = taskDescription.AEQbTJ() == 0 ? 3 : 4;
        Integer num = customChainTxSubject.AYXKKw().get(taskDescription.valueOf());
        if (num != null && num.intValue() == 4) {
            arrayList.add(taskDescription.copydefault());
        } else if (taskDescription.EZpvd() == 0) {
            arrayList2.add(customChainTxSubject.AhwBna().AEQbTJ(taskDescription.copydefault(), taskDescription.KWHzl(), i));
        } else {
            arrayList2.add(customChainTxSubject.AhwBna().EZpvd(taskDescription.copydefault(), taskDescription.EZpvd(), taskDescription.KWHzl(), i));
        }
        HashMap map = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            CustomChainTransactionEntity customChainTransactionEntity = (CustomChainTransactionEntity) it.next();
            if (!Intrinsics.EZpvd((Object) customChainTransactionEntity.getTxHash(), (Object) taskDescription.copydefault())) {
                if (!Intrinsics.EZpvd((Object) customChainTransactionEntity.getTxId(), (Object) taskDescription.valueOf())) {
                    if (map.get(customChainTransactionEntity.getTxId()) == null) {
                        map.put(customChainTransactionEntity.getTxId(), Boolean.TRUE);
                        arrayList2.add(customChainTxSubject.AhwBna().OLrzqt(customChainTransactionEntity.getTxHash(), 3));
                    } else {
                        arrayList.add(customChainTransactionEntity.getTxHash());
                    }
                } else {
                    arrayList.add(customChainTransactionEntity.getTxHash());
                }
            }
        }
        customChainTxSubject.AYXKKw().put(taskDescription.valueOf(), Integer.valueOf(taskDescription.AEQbTJ()));
        AbstractC58260yxt<Integer> abstractC58260yxtAEQbTJ = customChainTxSubject.AhwBna().AEQbTJ(arrayList);
        AbstractC58260yxt abstractC58260yxtKWHzl = C11607cUn.KWHzl(arrayList2);
        final Function1 function1 = new Function1() { // from class: o.bue
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return CustomChainTxSubject.KWHzl((java.util.List) obj);
            }
        };
        AbstractC58260yxt abstractC58260yxtCopydefault = abstractC58260yxtKWHzl.copydefault(new InterfaceC58229yxO() { // from class: o.bug
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return CustomChainTxSubject.fIwbmz(function1, obj);
            }
        });
        final Function2 function2 = new Function2() { // from class: o.bup
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return CustomChainTxSubject.OLrzqt((java.lang.Integer) obj, (java.lang.Integer) obj2);
            }
        };
        AbstractC58260yxt abstractC58260yxtOLrzqt = AbstractC58260yxt.OLrzqt(abstractC58260yxtAEQbTJ, abstractC58260yxtCopydefault, new InterfaceC58223yxI() { // from class: o.buy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58223yxI
            public final java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) {
                return CustomChainTxSubject.KWHzl(function2, obj, obj2);
            }
        });
        final Function1 function12 = new Function1() { // from class: o.buC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return CustomChainTxSubject.AEQbTJ(this.OLrzqt, taskDescription, (Unit) obj);
            }
        };
        return abstractC58260yxtOLrzqt.OLrzqt(new InterfaceC58229yxO() { // from class: o.buF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return CustomChainTxSubject.AuCTel(function12, obj);
            }
        });
    }

    public static final Integer KWHzl(List list) {
        Intrinsics.checkNotNullParameter(list, "");
        return Integer.valueOf(list.size());
    }

    public static final Integer fIwbmz(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (Integer) function1.invoke(obj);
    }

    public static final Unit KWHzl(Function2 function2, Object obj, Object obj2) {
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(obj2, "");
        return (Unit) function2.invoke(obj, obj2);
    }

    public static final InterfaceC58261yxu AuCTel(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final Unit OLrzqt(Integer num, Integer num2) {
        Intrinsics.checkNotNullParameter(num, "");
        Intrinsics.checkNotNullParameter(num2, "");
        return Unit.INSTANCE;
    }

    public static final InterfaceC58261yxu AEQbTJ(CustomChainTxSubject customChainTxSubject, TaskDescription taskDescription, Unit unit) {
        Intrinsics.checkNotNullParameter(unit, "");
        AbstractC58260yxt<List<CustomChainTransactionEntity>> abstractC58260yxtKWHzl = customChainTxSubject.AhwBna().KWHzl(taskDescription.valueOf(), yDY.gEmmrt(3, 4), 1);
        final Function1 function1 = new Function1() { // from class: o.buE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return CustomChainTxSubject.AEQbTJ((java.util.List) obj);
            }
        };
        return abstractC58260yxtKWHzl.copydefault(new InterfaceC58229yxO() { // from class: o.buG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return CustomChainTxSubject.ejfBZ(function1, obj);
            }
        });
    }

    public static final C10746buK ejfBZ(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (C10746buK) function1.invoke(obj);
    }

    public static final C10746buK AEQbTJ(List list) {
        Intrinsics.checkNotNullParameter(list, "");
        return C10746buK.Companion.AEQbTJ((CustomChainTransactionEntity) CollectionsKt___CollectionsKt.AuCTelauCTel(list));
    }

    public final void AkhnZx() {
        InterfaceC58217yxC interfaceC58217yxC = this.KWHzl;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        InterfaceC58217yxC interfaceC58217yxC2 = this.AEQbTJ;
        if (interfaceC58217yxC2 != null) {
            interfaceC58217yxC2.dispose();
        }
    }

    public final void values() {
        AkhnZx();
        copydefault();
    }

    /* JADX INFO: loaded from: classes14.dex */
    public static final class TaskDescription {
        public final long AEQbTJ;
        public final String AYXKKw;
        public final long EZpvd;
        public final int KWHzl;
        public final long OLrzqt;
        public final String copydefault;
        public final String valueOf;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int AEQbTJ() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean AhwBna() {
            int i = this.KWHzl;
            return i == 1 || i == 0;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long EZpvd() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String KWHzl() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long OLrzqt() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaskDescription OLrzqt(@NotNull String str, @NotNull String str2, long j, int i, @NotNull String str3, long j2, long j3) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            return new TaskDescription(str, str2, j, i, str3, j2, j3);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String copydefault() {
            return this.AYXKKw;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TaskDescription)) {
                return false;
            }
            TaskDescription taskDescription = (TaskDescription) obj;
            return Intrinsics.EZpvd((Object) this.valueOf, (Object) taskDescription.valueOf) && Intrinsics.EZpvd((Object) this.AYXKKw, (Object) taskDescription.AYXKKw) && this.OLrzqt == taskDescription.OLrzqt && this.KWHzl == taskDescription.KWHzl && Intrinsics.EZpvd((Object) this.copydefault, (Object) taskDescription.copydefault) && this.EZpvd == taskDescription.EZpvd && this.AEQbTJ == taskDescription.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((((((((((this.valueOf.hashCode() * 31) + this.AYXKKw.hashCode()) * 31) + Long.hashCode(this.OLrzqt)) * 31) + Integer.hashCode(this.KWHzl)) * 31) + this.copydefault.hashCode()) * 31) + Long.hashCode(this.EZpvd)) * 31) + Long.hashCode(this.AEQbTJ);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "TxResult(txId=" + this.valueOf + ", txHash=" + this.AYXKKw + ", nonce=" + this.OLrzqt + ", status=" + this.KWHzl + ", gasUsed=" + this.copydefault + ", createAt=" + this.EZpvd + ", confirmAt=" + this.AEQbTJ + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String valueOf() {
            return this.valueOf;
        }

        public TaskDescription(@NotNull String str, @NotNull String str2, long j, int i, @NotNull String str3, long j2, long j3) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            this.valueOf = str;
            this.AYXKKw = str2;
            this.OLrzqt = j;
            this.KWHzl = i;
            this.copydefault = str3;
            this.EZpvd = j2;
            this.AEQbTJ = j3;
        }
    }

    /* JADX INFO: loaded from: classes14.dex */
    public static abstract class SubException extends OKWException {
        private final String message;

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 java.lang.String) A[MD:(java.lang.String):void (m)] call: com.okinc.business.defi.biz.core.customchain.sub.CustomChainTxSubject.SubException.<init>(java.lang.String):void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ SubException(String str, DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.business.defi.biz.core.error.OKWException, java.lang.Throwable
        public String getMessage() {
            return this.message;
        }

        public static final class RequestNonceError extends SubException {
            public static final int $stable = 0;

            public RequestNonceError(String str) {
                super(str, null);
            }
        }

        private SubException(String str) {
            super(str, null);
            this.message = str;
        }

        public static final class NoPendingTxError extends SubException {
            public static final int $stable = 0;

            public NoPendingTxError() {
                super(null, 0 == true ? 1 : 0);
            }
        }
    }
}
