package o;

import com.okinc.im.usecase.messagelistmodel.LoadMoreNewerMessageListToMessageListModelUseCaseV2$execute$1;
import com.okinc.okimcore.model.im.GetMessageDirection;
import com.okinc.okimcore.model.im.OKConversation;
import com.okinc.okimcore.model.im.OKMessage;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.oGG;
import org.jetbrains.annotations.NotNull;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: renamed from: o.oFb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C35825oFb {
    public static final Activity Companion = new Activity(null);
    public static final int OLrzqt = 8;
    public final oGG AEQbTJ;
    public final oEI EZpvd;

    @yCM
    public C35825oFb(@NotNull oEI oei, @NotNull oGG ogg) {
        Intrinsics.checkNotNullParameter(oei, "");
        Intrinsics.checkNotNullParameter(ogg, "");
        this.EZpvd = oei;
        this.AEQbTJ = ogg;
    }

    /* JADX INFO: renamed from: o.oFb$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.oFb.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x01d7 -> B:45:0x01e1). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(@NotNull C36558odI c36558odI, @NotNull Continuation<? super C36558odI> continuation) throws java.lang.Throwable {
        LoadMoreNewerMessageListToMessageListModelUseCaseV2$execute$1 loadMoreNewerMessageListToMessageListModelUseCaseV2$execute$1;
        java.lang.Object obj;
        C35825oFb c35825oFb;
        C36558odI c36558odI2;
        java.util.List<C35254nrp> list;
        java.util.List list2;
        java.util.Iterator it;
        C35825oFb c35825oFb2;
        C36558odI c36558odI3;
        sNM snm;
        java.lang.Long l;
        java.util.List<OKMessage> list3;
        int i;
        java.util.List<C35254nrp> list4;
        java.util.Collection collection;
        if (continuation instanceof LoadMoreNewerMessageListToMessageListModelUseCaseV2$execute$1) {
            loadMoreNewerMessageListToMessageListModelUseCaseV2$execute$1 = (LoadMoreNewerMessageListToMessageListModelUseCaseV2$execute$1) continuation;
            int i2 = loadMoreNewerMessageListToMessageListModelUseCaseV2$execute$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                loadMoreNewerMessageListToMessageListModelUseCaseV2$execute$1.label = i2 - Integer.MIN_VALUE;
            } else {
                loadMoreNewerMessageListToMessageListModelUseCaseV2$execute$1 = new LoadMoreNewerMessageListToMessageListModelUseCaseV2$execute$1(this, continuation);
            }
        }
        java.lang.Object obj2 = loadMoreNewerMessageListToMessageListModelUseCaseV2$execute$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i3 = loadMoreNewerMessageListToMessageListModelUseCaseV2$execute$1.label;
        if (i3 == 0) {
            C56391yDq.AEQbTJ(obj2);
            OKConversation oKConversationOLrzqt = c36558odI.OLrzqt();
            java.lang.Long lDjBIcL = c36558odI.djBIcL();
            java.util.List<C35254nrp> listAEQbTJ = c36558odI.AEQbTJ();
            java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listAEQbTJ, 10));
            java.util.Iterator<T> it2 = listAEQbTJ.iterator();
            while (it2.hasNext()) {
                arrayList.add(((C35254nrp) it2.next()).OLrzqt());
            }
            OKMessage oKMessageCopydefault = nDD.OLrzqt.copydefault(arrayList);
            oEI oei = this.EZpvd;
            java.lang.String targetId = oKConversationOLrzqt.getTargetId();
            java.lang.Long lKWHzl = oKMessageCopydefault != null ? C56443yFo.KWHzl(C33129mqd.valueOf(C56443yFo.KWHzl(oKMessageCopydefault.getSeq()))) : null;
            GetMessageDirection getMessageDirection = GetMessageDirection.BOTTOM;
            loadMoreNewerMessageListToMessageListModelUseCaseV2$execute$1.L$0 = this;
            loadMoreNewerMessageListToMessageListModelUseCaseV2$execute$1.L$1 = c36558odI;
            loadMoreNewerMessageListToMessageListModelUseCaseV2$execute$1.L$2 = listAEQbTJ;
            loadMoreNewerMessageListToMessageListModelUseCaseV2$execute$1.L$3 = arrayList;
            loadMoreNewerMessageListToMessageListModelUseCaseV2$execute$1.label = 1;
            obj = objCopydefault;
            java.lang.Object objCopydefault2 = oei.copydefault(targetId, lDjBIcL, (48 & 4) != 0 ? null : lKWHzl, (48 & 8) != 0 ? false : false, (48 & 16) != 0 ? 50L : 0L, (48 & 32) != 0 ? java.lang.Boolean.TRUE : null, getMessageDirection, (48 & 128) != 0 ? false : true, loadMoreNewerMessageListToMessageListModelUseCaseV2$execute$1);
            if (objCopydefault2 == obj) {
                return obj;
            }
            c35825oFb = this;
            c36558odI2 = c36558odI;
            list = listAEQbTJ;
            list2 = arrayList;
            obj2 = objCopydefault2;
        } else if (i3 == 1) {
            list2 = (java.util.List) loadMoreNewerMessageListToMessageListModelUseCaseV2$execute$1.L$3;
            list = (java.util.List) loadMoreNewerMessageListToMessageListModelUseCaseV2$execute$1.L$2;
            C36558odI c36558odI4 = (C36558odI) loadMoreNewerMessageListToMessageListModelUseCaseV2$execute$1.L$1;
            c35825oFb = (C35825oFb) loadMoreNewerMessageListToMessageListModelUseCaseV2$execute$1.L$0;
            C56391yDq.AEQbTJ(obj2);
            c36558odI2 = c36558odI4;
            obj = objCopydefault;
        } else {
            if (i3 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = loadMoreNewerMessageListToMessageListModelUseCaseV2$execute$1.I$0;
            collection = (java.util.Collection) loadMoreNewerMessageListToMessageListModelUseCaseV2$execute$1.L$8;
            it = (java.util.Iterator) loadMoreNewerMessageListToMessageListModelUseCaseV2$execute$1.L$7;
            java.util.Collection collection2 = (java.util.Collection) loadMoreNewerMessageListToMessageListModelUseCaseV2$execute$1.L$6;
            java.lang.Long l2 = (java.lang.Long) loadMoreNewerMessageListToMessageListModelUseCaseV2$execute$1.L$5;
            list3 = (java.util.List) loadMoreNewerMessageListToMessageListModelUseCaseV2$execute$1.L$4;
            snm = (sNM) loadMoreNewerMessageListToMessageListModelUseCaseV2$execute$1.L$3;
            java.util.List<C35254nrp> list5 = (java.util.List) loadMoreNewerMessageListToMessageListModelUseCaseV2$execute$1.L$2;
            C36558odI c36558odI5 = (C36558odI) loadMoreNewerMessageListToMessageListModelUseCaseV2$execute$1.L$1;
            C35825oFb c35825oFb3 = (C35825oFb) loadMoreNewerMessageListToMessageListModelUseCaseV2$execute$1.L$0;
            C56391yDq.AEQbTJ(obj2);
            obj = objCopydefault;
            c35825oFb2 = c35825oFb3;
            collection.add((C35254nrp) obj2);
            collection = collection2;
            l = l2;
            list4 = list5;
            c36558odI3 = c36558odI5;
            if (it.hasNext()) {
                OKMessage oKMessage = (OKMessage) it.next();
                oGG ogg = c35825oFb2.AEQbTJ;
                oGG.TaskDescription taskDescription = new oGG.TaskDescription(l);
                loadMoreNewerMessageListToMessageListModelUseCaseV2$execute$1.L$0 = c35825oFb2;
                loadMoreNewerMessageListToMessageListModelUseCaseV2$execute$1.L$1 = c36558odI3;
                loadMoreNewerMessageListToMessageListModelUseCaseV2$execute$1.L$2 = list4;
                loadMoreNewerMessageListToMessageListModelUseCaseV2$execute$1.L$3 = snm;
                loadMoreNewerMessageListToMessageListModelUseCaseV2$execute$1.L$4 = list3;
                loadMoreNewerMessageListToMessageListModelUseCaseV2$execute$1.L$5 = l;
                loadMoreNewerMessageListToMessageListModelUseCaseV2$execute$1.L$6 = collection;
                loadMoreNewerMessageListToMessageListModelUseCaseV2$execute$1.L$7 = it;
                loadMoreNewerMessageListToMessageListModelUseCaseV2$execute$1.L$8 = collection;
                loadMoreNewerMessageListToMessageListModelUseCaseV2$execute$1.I$0 = i;
                loadMoreNewerMessageListToMessageListModelUseCaseV2$execute$1.label = 2;
                C35825oFb c35825oFb4 = c35825oFb2;
                java.lang.Object objAEQbTJ = ogg.AEQbTJ(c36558odI3, oKMessage, list3, (CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA & 8) != 0 ? null : null, (CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA & 16) != 0 ? null : null, (CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA & 32) != 0 ? null : null, (CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA & 64) != 0 ? null : taskDescription, (CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA & 128) != 0 ? null : null, loadMoreNewerMessageListToMessageListModelUseCaseV2$execute$1);
                if (objAEQbTJ == obj) {
                    return obj;
                }
                c36558odI5 = c36558odI3;
                c35825oFb2 = c35825oFb4;
                collection2 = collection;
                java.util.List<C35254nrp> list6 = list4;
                l2 = l;
                obj2 = objAEQbTJ;
                list5 = list6;
                collection.add((C35254nrp) obj2);
                collection = collection2;
                l = l2;
                list4 = list5;
                c36558odI3 = c36558odI5;
                if (it.hasNext()) {
                    return c36558odI3.AEQbTJ((32318 & 1) != 0 ? c36558odI3.AhwBna : CollectionsKt___CollectionsKt.djBIcL((java.util.Collection) CollectionsKt___CollectionsKt.AYXKKw((java.util.List) list4, i), collection), (32318 & 2) != 0 ? c36558odI3.KWHzl : null, (32318 & 4) != 0 ? c36558odI3.DbNXlk : null, (32318 & 8) != 0 ? c36558odI3.AkhnZx : null, (32318 & 16) != 0 ? c36558odI3.isConnected : null, (32318 & 32) != 0 ? c36558odI3.djBIcL : null, (32318 & 64) != 0 ? c36558odI3.EZpvd : snm.EZpvd(), (32318 & 128) != 0 ? c36558odI3.OLrzqt : false, (32318 & 256) != 0 ? c36558odI3.values : l, (32318 & 512) != 0 ? c36558odI3.AYXKKw : false, (32318 & 1024) != 0 ? c36558odI3.gEmmrt : null, (32318 & 2048) != 0 ? c36558odI3.copydefault : null, (32318 & 4096) != 0 ? c36558odI3.fetchVPNInfo : null, (32318 & 8192) != 0 ? c36558odI3.AEQbTJ : false, (32318 & 16384) != 0 ? c36558odI3.valueOf : false);
                }
            }
        }
        sNM snm2 = (sNM) obj2;
        java.util.List<OKMessage> listCopydefault = snm2.copydefault();
        OKMessage oKMessage2 = (OKMessage) CollectionsKt___CollectionsKt.wlaJM(list2);
        java.lang.String clientMessageId = oKMessage2 != null ? oKMessage2.getClientMessageId() : null;
        if (!c35825oFb.KWHzl(listCopydefault, clientMessageId)) {
            return c36558odI2.AEQbTJ((32318 & 1) != 0 ? c36558odI2.AhwBna : null, (32318 & 2) != 0 ? c36558odI2.KWHzl : null, (32318 & 4) != 0 ? c36558odI2.DbNXlk : null, (32318 & 8) != 0 ? c36558odI2.AkhnZx : null, (32318 & 16) != 0 ? c36558odI2.isConnected : null, (32318 & 32) != 0 ? c36558odI2.djBIcL : null, (32318 & 64) != 0 ? c36558odI2.EZpvd : false, (32318 & 128) != 0 ? c36558odI2.OLrzqt : false, (32318 & 256) != 0 ? c36558odI2.values : null, (32318 & 512) != 0 ? c36558odI2.AYXKKw : false, (32318 & 1024) != 0 ? c36558odI2.gEmmrt : null, (32318 & 2048) != 0 ? c36558odI2.copydefault : null, (32318 & 4096) != 0 ? c36558odI2.fetchVPNInfo : null, (32318 & 8192) != 0 ? c36558odI2.AEQbTJ : false, (32318 & 16384) != 0 ? c36558odI2.valueOf : false);
        }
        int iCopydefault = c35825oFb.copydefault(listCopydefault, clientMessageId);
        java.util.List<OKMessage> listDjBIcL = CollectionsKt___CollectionsKt.djBIcL((java.util.Collection) CollectionsKt___CollectionsKt.AYXKKw(list2, iCopydefault), (java.lang.Iterable) listCopydefault);
        java.lang.Long lKWHzl2 = nDD.OLrzqt.KWHzl(listDjBIcL);
        if (lKWHzl2 == null) {
            lKWHzl2 = c36558odI2.AYXKKw();
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(listCopydefault, 10));
        it = listCopydefault.iterator();
        c35825oFb2 = c35825oFb;
        c36558odI3 = c36558odI2;
        snm = snm2;
        l = lKWHzl2;
        list3 = listDjBIcL;
        i = iCopydefault;
        list4 = list;
        collection = arrayList2;
        if (it.hasNext()) {
        }
    }

    public final boolean KWHzl(java.util.List<OKMessage> list, java.lang.String str) {
        return str != null && list.size() >= copydefault(list, str);
    }

    public final int copydefault(java.util.List<OKMessage> list, java.lang.String str) {
        if (str == null) {
            return 0;
        }
        java.util.Iterator<OKMessage> it = list.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (Intrinsics.EZpvd((java.lang.Object) it.next().getClientMessageId(), (java.lang.Object) str)) {
                break;
            }
            i++;
        }
        if (i == -1) {
            return 0;
        }
        return i + 1;
    }
}
