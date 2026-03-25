package o;

import com.okinc.im.usecase.messagelistmodel.LoadMoreOlderMessageListToMessageListModelUseCaseV2$execute$1;
import com.okinc.okimcore.model.im.GetMessageDirection;
import com.okinc.okimcore.model.im.OKConversation;
import com.okinc.okimcore.model.im.OKMessage;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: renamed from: o.oFc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C35826oFc {
    public final oGG EZpvd;
    public final oEI OLrzqt;
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int AEQbTJ = 8;

    @yCM
    public C35826oFc(@NotNull oEI oei, @NotNull oGG ogg) {
        Intrinsics.checkNotNullParameter(oei, "");
        Intrinsics.checkNotNullParameter(ogg, "");
        this.OLrzqt = oei;
        this.EZpvd = ogg;
    }

    /* JADX INFO: renamed from: o.oFc$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.oFc.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x01c3 -> B:42:0x01cc). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(@NotNull C36558odI c36558odI, @NotNull Continuation<? super C36558odI> continuation) throws java.lang.Throwable {
        LoadMoreOlderMessageListToMessageListModelUseCaseV2$execute$1 loadMoreOlderMessageListToMessageListModelUseCaseV2$execute$1;
        java.lang.Object obj;
        C35826oFc c35826oFc;
        C36558odI c36558odI2;
        java.util.List<C35254nrp> list;
        java.util.List list2;
        java.util.Iterator it;
        C35826oFc c35826oFc2;
        C36558odI c36558odI3;
        sNM snm;
        java.util.List<C35254nrp> list3;
        java.util.Collection collection;
        java.util.List list4;
        int i;
        if (continuation instanceof LoadMoreOlderMessageListToMessageListModelUseCaseV2$execute$1) {
            loadMoreOlderMessageListToMessageListModelUseCaseV2$execute$1 = (LoadMoreOlderMessageListToMessageListModelUseCaseV2$execute$1) continuation;
            int i2 = loadMoreOlderMessageListToMessageListModelUseCaseV2$execute$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                loadMoreOlderMessageListToMessageListModelUseCaseV2$execute$1.label = i2 - Integer.MIN_VALUE;
            } else {
                loadMoreOlderMessageListToMessageListModelUseCaseV2$execute$1 = new LoadMoreOlderMessageListToMessageListModelUseCaseV2$execute$1(this, continuation);
            }
        }
        java.lang.Object obj2 = loadMoreOlderMessageListToMessageListModelUseCaseV2$execute$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i3 = loadMoreOlderMessageListToMessageListModelUseCaseV2$execute$1.label;
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
            OKMessage oKMessageEZpvd = nDD.OLrzqt.EZpvd(arrayList);
            oEI oei = this.OLrzqt;
            java.lang.String targetId = oKConversationOLrzqt.getTargetId();
            java.lang.Long lKWHzl = oKMessageEZpvd != null ? C56443yFo.KWHzl(C33129mqd.valueOf(C56443yFo.KWHzl(oKMessageEZpvd.getSeq()))) : null;
            GetMessageDirection getMessageDirection = GetMessageDirection.TOP;
            loadMoreOlderMessageListToMessageListModelUseCaseV2$execute$1.L$0 = this;
            loadMoreOlderMessageListToMessageListModelUseCaseV2$execute$1.L$1 = c36558odI;
            loadMoreOlderMessageListToMessageListModelUseCaseV2$execute$1.L$2 = listAEQbTJ;
            loadMoreOlderMessageListToMessageListModelUseCaseV2$execute$1.L$3 = arrayList;
            loadMoreOlderMessageListToMessageListModelUseCaseV2$execute$1.label = 1;
            obj = objCopydefault;
            java.lang.Object objCopydefault2 = oei.copydefault(targetId, lDjBIcL, (48 & 4) != 0 ? null : lKWHzl, (48 & 8) != 0 ? false : false, (48 & 16) != 0 ? 50L : 0L, (48 & 32) != 0 ? java.lang.Boolean.TRUE : null, getMessageDirection, (48 & 128) != 0 ? false : true, loadMoreOlderMessageListToMessageListModelUseCaseV2$execute$1);
            if (objCopydefault2 == obj) {
                return obj;
            }
            c35826oFc = this;
            c36558odI2 = c36558odI;
            list = listAEQbTJ;
            list2 = arrayList;
            obj2 = objCopydefault2;
        } else if (i3 == 1) {
            list2 = (java.util.List) loadMoreOlderMessageListToMessageListModelUseCaseV2$execute$1.L$3;
            list = (java.util.List) loadMoreOlderMessageListToMessageListModelUseCaseV2$execute$1.L$2;
            C36558odI c36558odI4 = (C36558odI) loadMoreOlderMessageListToMessageListModelUseCaseV2$execute$1.L$1;
            c35826oFc = (C35826oFc) loadMoreOlderMessageListToMessageListModelUseCaseV2$execute$1.L$0;
            C56391yDq.AEQbTJ(obj2);
            c36558odI2 = c36558odI4;
            obj = objCopydefault;
        } else {
            if (i3 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = loadMoreOlderMessageListToMessageListModelUseCaseV2$execute$1.I$0;
            collection = (java.util.Collection) loadMoreOlderMessageListToMessageListModelUseCaseV2$execute$1.L$7;
            it = (java.util.Iterator) loadMoreOlderMessageListToMessageListModelUseCaseV2$execute$1.L$6;
            java.util.Collection collection2 = (java.util.Collection) loadMoreOlderMessageListToMessageListModelUseCaseV2$execute$1.L$5;
            list4 = (java.util.List) loadMoreOlderMessageListToMessageListModelUseCaseV2$execute$1.L$4;
            snm = (sNM) loadMoreOlderMessageListToMessageListModelUseCaseV2$execute$1.L$3;
            java.util.List<C35254nrp> list5 = (java.util.List) loadMoreOlderMessageListToMessageListModelUseCaseV2$execute$1.L$2;
            C36558odI c36558odI5 = (C36558odI) loadMoreOlderMessageListToMessageListModelUseCaseV2$execute$1.L$1;
            C35826oFc c35826oFc3 = (C35826oFc) loadMoreOlderMessageListToMessageListModelUseCaseV2$execute$1.L$0;
            C56391yDq.AEQbTJ(obj2);
            obj = objCopydefault;
            c35826oFc2 = c35826oFc3;
            collection.add((C35254nrp) obj2);
            collection = collection2;
            list3 = list5;
            c36558odI3 = c36558odI5;
            if (it.hasNext()) {
                OKMessage oKMessage = (OKMessage) it.next();
                oGG ogg = c35826oFc2.EZpvd;
                loadMoreOlderMessageListToMessageListModelUseCaseV2$execute$1.L$0 = c35826oFc2;
                loadMoreOlderMessageListToMessageListModelUseCaseV2$execute$1.L$1 = c36558odI3;
                loadMoreOlderMessageListToMessageListModelUseCaseV2$execute$1.L$2 = list3;
                loadMoreOlderMessageListToMessageListModelUseCaseV2$execute$1.L$3 = snm;
                loadMoreOlderMessageListToMessageListModelUseCaseV2$execute$1.L$4 = list4;
                loadMoreOlderMessageListToMessageListModelUseCaseV2$execute$1.L$5 = collection;
                loadMoreOlderMessageListToMessageListModelUseCaseV2$execute$1.L$6 = it;
                loadMoreOlderMessageListToMessageListModelUseCaseV2$execute$1.L$7 = collection;
                loadMoreOlderMessageListToMessageListModelUseCaseV2$execute$1.I$0 = i;
                loadMoreOlderMessageListToMessageListModelUseCaseV2$execute$1.label = 2;
                C35826oFc c35826oFc4 = c35826oFc2;
                java.lang.Object objAEQbTJ = ogg.AEQbTJ(c36558odI3, oKMessage, list4, (CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA & 8) != 0 ? null : null, (CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA & 16) != 0 ? null : null, (CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA & 32) != 0 ? null : null, (CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA & 64) != 0 ? null : null, (CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA & 128) != 0 ? null : null, loadMoreOlderMessageListToMessageListModelUseCaseV2$execute$1);
                if (objAEQbTJ == obj) {
                    return obj;
                }
                c36558odI5 = c36558odI3;
                c35826oFc2 = c35826oFc4;
                collection2 = collection;
                list5 = list3;
                obj2 = objAEQbTJ;
                collection.add((C35254nrp) obj2);
                collection = collection2;
                list3 = list5;
                c36558odI3 = c36558odI5;
                if (it.hasNext()) {
                    C36558odI c36558odI6 = c36558odI3;
                    return c36558odI6.AEQbTJ((32318 & 1) != 0 ? c36558odI6.AhwBna : CollectionsKt___CollectionsKt.djBIcL(collection, (java.lang.Iterable) CollectionsKt___CollectionsKt.djBIcL((java.lang.Iterable) list3, i)), (32318 & 2) != 0 ? c36558odI6.KWHzl : null, (32318 & 4) != 0 ? c36558odI6.DbNXlk : null, (32318 & 8) != 0 ? c36558odI6.AkhnZx : null, (32318 & 16) != 0 ? c36558odI6.isConnected : null, (32318 & 32) != 0 ? c36558odI6.djBIcL : null, (32318 & 64) != 0 ? c36558odI6.EZpvd : false, (32318 & 128) != 0 ? c36558odI6.OLrzqt : snm.OLrzqt(), (32318 & 256) != 0 ? c36558odI6.values : null, (32318 & 512) != 0 ? c36558odI6.AYXKKw : false, (32318 & 1024) != 0 ? c36558odI6.gEmmrt : null, (32318 & 2048) != 0 ? c36558odI6.copydefault : null, (32318 & 4096) != 0 ? c36558odI6.fetchVPNInfo : null, (32318 & 8192) != 0 ? c36558odI6.AEQbTJ : false, (32318 & 16384) != 0 ? c36558odI6.valueOf : false);
                }
            }
        }
        sNM snm2 = (sNM) obj2;
        java.util.List<OKMessage> listCopydefault = snm2.copydefault();
        OKMessage oKMessage2 = (OKMessage) CollectionsKt___CollectionsKt.firstOrNull(list2);
        java.lang.String clientMessageId = oKMessage2 != null ? oKMessage2.getClientMessageId() : null;
        if (!c35826oFc.OLrzqt(listCopydefault, clientMessageId)) {
            return c36558odI2.AEQbTJ((32318 & 1) != 0 ? c36558odI2.AhwBna : null, (32318 & 2) != 0 ? c36558odI2.KWHzl : null, (32318 & 4) != 0 ? c36558odI2.DbNXlk : null, (32318 & 8) != 0 ? c36558odI2.AkhnZx : null, (32318 & 16) != 0 ? c36558odI2.isConnected : null, (32318 & 32) != 0 ? c36558odI2.djBIcL : null, (32318 & 64) != 0 ? c36558odI2.EZpvd : false, (32318 & 128) != 0 ? c36558odI2.OLrzqt : false, (32318 & 256) != 0 ? c36558odI2.values : null, (32318 & 512) != 0 ? c36558odI2.AYXKKw : false, (32318 & 1024) != 0 ? c36558odI2.gEmmrt : null, (32318 & 2048) != 0 ? c36558odI2.copydefault : null, (32318 & 4096) != 0 ? c36558odI2.fetchVPNInfo : null, (32318 & 8192) != 0 ? c36558odI2.AEQbTJ : false, (32318 & 16384) != 0 ? c36558odI2.valueOf : false);
        }
        int iEZpvd = c35826oFc.EZpvd(listCopydefault, clientMessageId);
        java.util.List listDjBIcL = CollectionsKt___CollectionsKt.djBIcL((java.util.Collection) listCopydefault, (java.lang.Iterable) CollectionsKt___CollectionsKt.djBIcL((java.lang.Iterable) list2, iEZpvd));
        java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(listCopydefault, 10));
        it = listCopydefault.iterator();
        c35826oFc2 = c35826oFc;
        c36558odI3 = c36558odI2;
        snm = snm2;
        list3 = list;
        collection = arrayList2;
        list4 = listDjBIcL;
        i = iEZpvd;
        if (it.hasNext()) {
        }
    }

    public final boolean OLrzqt(java.util.List<OKMessage> list, java.lang.String str) {
        return str != null && list.size() >= EZpvd(list, str);
    }

    public final int EZpvd(java.util.List<OKMessage> list, java.lang.String str) {
        int iNextIndex;
        if (str == null) {
            return 0;
        }
        java.util.ListIterator<OKMessage> listIterator = list.listIterator(list.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                iNextIndex = -1;
                break;
            }
            if (Intrinsics.EZpvd((java.lang.Object) listIterator.previous().getClientMessageId(), (java.lang.Object) str)) {
                iNextIndex = listIterator.nextIndex();
                break;
            }
        }
        if (iNextIndex == -1) {
            return 0;
        }
        return list.size() - iNextIndex;
    }
}
