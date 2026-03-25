package o;

import com.okinc.im.usecase.messagelistmodel.ApplyDownloadedMessagesToMessageListModelUseCase$execute$1;
import com.okinc.okimcore.model.im.OKConversation;
import com.okinc.okimcore.model.im.OKMessage;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: loaded from: classes8.dex */
public final class oEQ {
    public final oGG EZpvd;
    public final oEL OLrzqt;
    public static final ActionBar Companion = new ActionBar(null);
    public static final int AEQbTJ = 8;

    @yCM
    public oEQ(@NotNull oGG ogg, @NotNull oEL oel) {
        Intrinsics.checkNotNullParameter(ogg, "");
        Intrinsics.checkNotNullParameter(oel, "");
        this.EZpvd = ogg;
        this.OLrzqt = oel;
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.oEQ.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    /* JADX WARN: Path cross not found for [B:63:0x01e2, B:82:0x02c3], limit reached: 113 */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0311  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:90:0x0305 -> B:29:0x00db). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(@NotNull C36558odI c36558odI, @NotNull java.util.List<OKMessage> list, @NotNull Continuation<? super C36558odI> continuation) throws java.lang.Throwable {
        ApplyDownloadedMessagesToMessageListModelUseCase$execute$1 applyDownloadedMessagesToMessageListModelUseCase$execute$1;
        oEQ oeq;
        oEQ oeq2;
        java.util.List<C35254nrp> list2;
        ApplyDownloadedMessagesToMessageListModelUseCase$execute$1 applyDownloadedMessagesToMessageListModelUseCase$execute$12;
        java.util.Iterator it;
        C36558odI c36558odI2;
        java.lang.Object next;
        long j;
        long j2;
        C36558odI c36558odI3;
        oEQ oeq3;
        java.util.List<C35254nrp> list3;
        OKMessage oKMessage;
        java.util.Iterator it2;
        long seq;
        java.lang.Long lKWHzl;
        java.lang.Long lKWHzl2;
        if (continuation instanceof ApplyDownloadedMessagesToMessageListModelUseCase$execute$1) {
            applyDownloadedMessagesToMessageListModelUseCase$execute$1 = (ApplyDownloadedMessagesToMessageListModelUseCase$execute$1) continuation;
            int i = applyDownloadedMessagesToMessageListModelUseCase$execute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                applyDownloadedMessagesToMessageListModelUseCase$execute$1.label = i - Integer.MIN_VALUE;
                oeq = this;
            } else {
                oeq = this;
                applyDownloadedMessagesToMessageListModelUseCase$execute$1 = new ApplyDownloadedMessagesToMessageListModelUseCase$execute$1(oeq, continuation);
            }
        }
        java.lang.Object obj = applyDownloadedMessagesToMessageListModelUseCase$execute$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        switch (applyDownloadedMessagesToMessageListModelUseCase$execute$1.label) {
            case 0:
                C56391yDq.AEQbTJ(obj);
                OKConversation oKConversationOLrzqt = c36558odI.OLrzqt();
                java.util.List<C35254nrp> listFJNWhG = CollectionsKt___CollectionsKt.fJNWhG((java.util.Collection) c36558odI.AEQbTJ());
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (java.lang.Object obj2 : list) {
                    OKMessage oKMessage2 = (OKMessage) obj2;
                    if (Intrinsics.EZpvd((java.lang.Object) oKMessage2.getTargetId(), (java.lang.Object) oKConversationOLrzqt.getTargetId())) {
                        java.util.Iterator<T> it3 = c36558odI.AEQbTJ().iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                next = it3.next();
                                if (((C35254nrp) next).OLrzqt().getSeq() == oKMessage2.getSeq()) {
                                }
                            } else {
                                next = null;
                            }
                        }
                        if (next == null) {
                            arrayList.add(obj2);
                        }
                    }
                }
                oeq2 = oeq;
                list2 = listFJNWhG;
                applyDownloadedMessagesToMessageListModelUseCase$execute$12 = applyDownloadedMessagesToMessageListModelUseCase$execute$1;
                it = arrayList.iterator();
                c36558odI2 = c36558odI;
                if (!it.hasNext()) {
                    OKMessage oKMessage3 = (OKMessage) it.next();
                    java.util.Iterator<T> it4 = list2.iterator();
                    if (it4.hasNext()) {
                        lKWHzl = C56443yFo.KWHzl(((C35254nrp) it4.next()).OLrzqt().getSeq());
                        while (it4.hasNext()) {
                            java.lang.Long lKWHzl3 = C56443yFo.KWHzl(((C35254nrp) it4.next()).OLrzqt().getSeq());
                            if (lKWHzl.compareTo(lKWHzl3) > 0) {
                                lKWHzl = lKWHzl3;
                            }
                        }
                    } else {
                        lKWHzl = null;
                    }
                    long jLongValue = lKWHzl != null ? lKWHzl.longValue() : 0L;
                    java.util.Iterator<T> it5 = list2.iterator();
                    if (it5.hasNext()) {
                        lKWHzl2 = C56443yFo.KWHzl(((C35254nrp) it5.next()).OLrzqt().getSeq());
                        while (it5.hasNext()) {
                            java.lang.Long lKWHzl4 = C56443yFo.KWHzl(((C35254nrp) it5.next()).OLrzqt().getSeq());
                            if (lKWHzl2.compareTo(lKWHzl4) < 0) {
                                lKWHzl2 = lKWHzl4;
                            }
                        }
                    } else {
                        lKWHzl2 = null;
                    }
                    long jLongValue2 = lKWHzl2 != null ? lKWHzl2.longValue() : 0L;
                    oGG ogg = oeq2.EZpvd;
                    java.util.List listAhwBna = yDY.AhwBna();
                    applyDownloadedMessagesToMessageListModelUseCase$execute$12.L$0 = oeq2;
                    applyDownloadedMessagesToMessageListModelUseCase$execute$12.L$1 = c36558odI2;
                    applyDownloadedMessagesToMessageListModelUseCase$execute$12.L$2 = list2;
                    applyDownloadedMessagesToMessageListModelUseCase$execute$12.L$3 = it;
                    applyDownloadedMessagesToMessageListModelUseCase$execute$12.L$4 = oKMessage3;
                    applyDownloadedMessagesToMessageListModelUseCase$execute$12.J$0 = jLongValue;
                    applyDownloadedMessagesToMessageListModelUseCase$execute$12.J$1 = jLongValue2;
                    applyDownloadedMessagesToMessageListModelUseCase$execute$12.label = 1;
                    long j3 = jLongValue2;
                    long j4 = jLongValue;
                    oEQ oeq4 = oeq2;
                    java.util.List<C35254nrp> list4 = list2;
                    java.lang.Object objAEQbTJ = ogg.AEQbTJ(c36558odI2, oKMessage3, listAhwBna, (CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA & 8) != 0 ? null : null, (CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA & 16) != 0 ? null : null, (CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA & 32) != 0 ? null : null, (CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA & 64) != 0 ? null : null, (CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA & 128) != 0 ? null : null, applyDownloadedMessagesToMessageListModelUseCase$execute$12);
                    if (objAEQbTJ == objCopydefault) {
                        return objCopydefault;
                    }
                    c36558odI3 = c36558odI2;
                    obj = objAEQbTJ;
                    oeq3 = oeq4;
                    j = j3;
                    j2 = j4;
                    oKMessage = oKMessage3;
                    list3 = list4;
                    ApplyDownloadedMessagesToMessageListModelUseCase$execute$1 applyDownloadedMessagesToMessageListModelUseCase$execute$13 = applyDownloadedMessagesToMessageListModelUseCase$execute$12;
                    it2 = it;
                    applyDownloadedMessagesToMessageListModelUseCase$execute$1 = applyDownloadedMessagesToMessageListModelUseCase$execute$13;
                    C35254nrp c35254nrp = (C35254nrp) obj;
                    seq = oKMessage.getSeq();
                    if (j2 <= seq || seq > j) {
                        c36558odI2 = c36558odI3;
                        if (oKMessage.getSeq() >= j2) {
                            oEL oel = oeq3.OLrzqt;
                            applyDownloadedMessagesToMessageListModelUseCase$execute$1.L$0 = oeq3;
                            applyDownloadedMessagesToMessageListModelUseCase$execute$1.L$1 = c36558odI2;
                            applyDownloadedMessagesToMessageListModelUseCase$execute$1.L$2 = list3;
                            applyDownloadedMessagesToMessageListModelUseCase$execute$1.L$3 = it2;
                            applyDownloadedMessagesToMessageListModelUseCase$execute$1.L$4 = null;
                            applyDownloadedMessagesToMessageListModelUseCase$execute$1.label = 5;
                            if (oel.copydefault(c36558odI2, true, list3, 0, oKMessage, applyDownloadedMessagesToMessageListModelUseCase$execute$1) == objCopydefault) {
                                return objCopydefault;
                            }
                        } else {
                            oEL oel2 = oeq3.OLrzqt;
                            int size = list3.size();
                            applyDownloadedMessagesToMessageListModelUseCase$execute$1.L$0 = oeq3;
                            applyDownloadedMessagesToMessageListModelUseCase$execute$1.L$1 = c36558odI2;
                            applyDownloadedMessagesToMessageListModelUseCase$execute$1.L$2 = list3;
                            applyDownloadedMessagesToMessageListModelUseCase$execute$1.L$3 = it2;
                            applyDownloadedMessagesToMessageListModelUseCase$execute$1.L$4 = null;
                            applyDownloadedMessagesToMessageListModelUseCase$execute$1.label = 6;
                            if (oel2.copydefault(c36558odI2, true, list3, size, oKMessage, applyDownloadedMessagesToMessageListModelUseCase$execute$1) == objCopydefault) {
                                return objCopydefault;
                            }
                        }
                    } else {
                        int iOLrzqt = yDY.OLrzqt(list3, c35254nrp, new TaskDescription(), 0, list3.size());
                        pUU.KWHzl("ApplyDownloadedMessagesToMessageListModelUseCase", "downloaded message id = " + oKMessage.getSeq());
                        java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(list3, 10));
                        java.util.Iterator<T> it6 = list3.iterator();
                        while (it6.hasNext()) {
                            arrayList2.add(C56443yFo.KWHzl(((C35254nrp) it6.next()).OLrzqt().getSeq()));
                        }
                        pUU.KWHzl("ApplyDownloadedMessagesToMessageListModelUseCase", "message list = " + arrayList2);
                        pUU.KWHzl("ApplyDownloadedMessagesToMessageListModelUseCase", "insertion index = " + iOLrzqt);
                        if (iOLrzqt < 0) {
                            oEL oel3 = oeq3.OLrzqt;
                            int iAbs = java.lang.Math.abs(iOLrzqt);
                            applyDownloadedMessagesToMessageListModelUseCase$execute$1.L$0 = oeq3;
                            applyDownloadedMessagesToMessageListModelUseCase$execute$1.L$1 = c36558odI3;
                            applyDownloadedMessagesToMessageListModelUseCase$execute$1.L$2 = list3;
                            applyDownloadedMessagesToMessageListModelUseCase$execute$1.L$3 = it2;
                            applyDownloadedMessagesToMessageListModelUseCase$execute$1.L$4 = null;
                            applyDownloadedMessagesToMessageListModelUseCase$execute$1.label = 2;
                            int i2 = iAbs - 1;
                            c36558odI2 = c36558odI3;
                            if (oel3.copydefault(c36558odI3, true, list3, i2, oKMessage, applyDownloadedMessagesToMessageListModelUseCase$execute$1) == objCopydefault) {
                                return objCopydefault;
                            }
                        } else {
                            c36558odI2 = c36558odI3;
                            if (iOLrzqt <= yDY.AuCTel(list3)) {
                                oEL oel4 = oeq3.OLrzqt;
                                applyDownloadedMessagesToMessageListModelUseCase$execute$1.L$0 = oeq3;
                                applyDownloadedMessagesToMessageListModelUseCase$execute$1.L$1 = c36558odI2;
                                applyDownloadedMessagesToMessageListModelUseCase$execute$1.L$2 = list3;
                                applyDownloadedMessagesToMessageListModelUseCase$execute$1.L$3 = it2;
                                applyDownloadedMessagesToMessageListModelUseCase$execute$1.L$4 = null;
                                applyDownloadedMessagesToMessageListModelUseCase$execute$1.label = 3;
                                if (oel4.copydefault(c36558odI2, false, list3, iOLrzqt, oKMessage, applyDownloadedMessagesToMessageListModelUseCase$execute$1) == objCopydefault) {
                                    return objCopydefault;
                                }
                            } else {
                                oEL oel5 = oeq3.OLrzqt;
                                int size2 = list3.size();
                                applyDownloadedMessagesToMessageListModelUseCase$execute$1.L$0 = oeq3;
                                applyDownloadedMessagesToMessageListModelUseCase$execute$1.L$1 = c36558odI2;
                                applyDownloadedMessagesToMessageListModelUseCase$execute$1.L$2 = list3;
                                applyDownloadedMessagesToMessageListModelUseCase$execute$1.L$3 = it2;
                                applyDownloadedMessagesToMessageListModelUseCase$execute$1.L$4 = null;
                                applyDownloadedMessagesToMessageListModelUseCase$execute$1.label = 4;
                                if (oel5.copydefault(c36558odI2, true, list3, size2, oKMessage, applyDownloadedMessagesToMessageListModelUseCase$execute$1) == objCopydefault) {
                                    return objCopydefault;
                                }
                            }
                        }
                    }
                    java.util.Iterator it7 = it2;
                    applyDownloadedMessagesToMessageListModelUseCase$execute$12 = applyDownloadedMessagesToMessageListModelUseCase$execute$1;
                    it = it7;
                    oEQ oeq5 = oeq3;
                    list2 = list3;
                    oeq2 = oeq5;
                    if (!it.hasNext()) {
                        C36558odI c36558odI4 = c36558odI2;
                        return c36558odI4.AEQbTJ((32318 & 1) != 0 ? c36558odI4.AhwBna : list2, (32318 & 2) != 0 ? c36558odI4.KWHzl : null, (32318 & 4) != 0 ? c36558odI4.DbNXlk : null, (32318 & 8) != 0 ? c36558odI4.AkhnZx : null, (32318 & 16) != 0 ? c36558odI4.isConnected : null, (32318 & 32) != 0 ? c36558odI4.djBIcL : null, (32318 & 64) != 0 ? c36558odI4.EZpvd : false, (32318 & 128) != 0 ? c36558odI4.OLrzqt : false, (32318 & 256) != 0 ? c36558odI4.values : null, (32318 & 512) != 0 ? c36558odI4.AYXKKw : false, (32318 & 1024) != 0 ? c36558odI4.gEmmrt : null, (32318 & 2048) != 0 ? c36558odI4.copydefault : null, (32318 & 4096) != 0 ? c36558odI4.fetchVPNInfo : null, (32318 & 8192) != 0 ? c36558odI4.AEQbTJ : false, (32318 & 16384) != 0 ? c36558odI4.valueOf : false);
                    }
                }
                break;
            case 1:
                j = applyDownloadedMessagesToMessageListModelUseCase$execute$1.J$1;
                j2 = applyDownloadedMessagesToMessageListModelUseCase$execute$1.J$0;
                OKMessage oKMessage4 = (OKMessage) applyDownloadedMessagesToMessageListModelUseCase$execute$1.L$4;
                java.util.Iterator it8 = (java.util.Iterator) applyDownloadedMessagesToMessageListModelUseCase$execute$1.L$3;
                java.util.List<C35254nrp> list5 = (java.util.List) applyDownloadedMessagesToMessageListModelUseCase$execute$1.L$2;
                c36558odI3 = (C36558odI) applyDownloadedMessagesToMessageListModelUseCase$execute$1.L$1;
                oEQ oeq6 = (oEQ) applyDownloadedMessagesToMessageListModelUseCase$execute$1.L$0;
                C56391yDq.AEQbTJ(obj);
                oeq3 = oeq6;
                list3 = list5;
                oKMessage = oKMessage4;
                it2 = it8;
                C35254nrp c35254nrp2 = (C35254nrp) obj;
                seq = oKMessage.getSeq();
                if (j2 <= seq) {
                }
                c36558odI2 = c36558odI3;
                if (oKMessage.getSeq() >= j2) {
                }
                java.util.Iterator it72 = it2;
                applyDownloadedMessagesToMessageListModelUseCase$execute$12 = applyDownloadedMessagesToMessageListModelUseCase$execute$1;
                it = it72;
                oEQ oeq52 = oeq3;
                list2 = list3;
                oeq2 = oeq52;
                if (!it.hasNext()) {
                }
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                java.util.Iterator it9 = (java.util.Iterator) applyDownloadedMessagesToMessageListModelUseCase$execute$1.L$3;
                java.util.List<C35254nrp> list6 = (java.util.List) applyDownloadedMessagesToMessageListModelUseCase$execute$1.L$2;
                C36558odI c36558odI5 = (C36558odI) applyDownloadedMessagesToMessageListModelUseCase$execute$1.L$1;
                oEQ oeq7 = (oEQ) applyDownloadedMessagesToMessageListModelUseCase$execute$1.L$0;
                C56391yDq.AEQbTJ(obj);
                list2 = list6;
                c36558odI2 = c36558odI5;
                oeq2 = oeq7;
                applyDownloadedMessagesToMessageListModelUseCase$execute$12 = applyDownloadedMessagesToMessageListModelUseCase$execute$1;
                it = it9;
                if (!it.hasNext()) {
                }
                break;
            default:
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public static final class TaskDescription<T> implements java.util.Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return yET.KWHzl(java.lang.Long.valueOf(((C35254nrp) t).OLrzqt().getSentTime()), java.lang.Long.valueOf(((C35254nrp) t2).OLrzqt().getSentTime()));
        }
    }
}
