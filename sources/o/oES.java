package o;

import com.okinc.im.usecase.messagelistmodel.ApplyReadReceiptEventToMessageListModelUseCase$execute$1;
import com.okinc.okimcore.model.im.OKMessage;
import com.okinc.okimcore.model.im.OKMessageContent;
import com.okinc.okimcore.model.im.OKReadReceiptMessage;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: loaded from: classes8.dex */
public final class oES {
    public final C35847oFx EZpvd;
    public final oGG OLrzqt;
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int AEQbTJ = 8;

    @yCM
    public oES(@NotNull C35847oFx c35847oFx, @NotNull oGG ogg) {
        Intrinsics.checkNotNullParameter(c35847oFx, "");
        Intrinsics.checkNotNullParameter(ogg, "");
        this.EZpvd = c35847oFx;
        this.OLrzqt = ogg;
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.oES.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x016b -> B:38:0x0175). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x017c -> B:40:0x018d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(@NotNull C36558odI c36558odI, @NotNull C44469sQz c44469sQz, @NotNull Continuation<? super C36558odI> continuation) throws java.lang.Throwable {
        ApplyReadReceiptEventToMessageListModelUseCase$execute$1 applyReadReceiptEventToMessageListModelUseCase$execute$1;
        oES oes;
        C36558odI c36558odI2;
        oES oes2;
        java.util.Collection arrayList;
        java.util.List list;
        ApplyReadReceiptEventToMessageListModelUseCase$execute$1 applyReadReceiptEventToMessageListModelUseCase$execute$12;
        java.util.Iterator it;
        C44469sQz c44469sQz2;
        java.util.List list2;
        C44469sQz c44469sQz3;
        C36558odI c36558odI3;
        oES oes3;
        java.util.Iterator it2;
        OKMessage oKMessage;
        if (continuation instanceof ApplyReadReceiptEventToMessageListModelUseCase$execute$1) {
            applyReadReceiptEventToMessageListModelUseCase$execute$1 = (ApplyReadReceiptEventToMessageListModelUseCase$execute$1) continuation;
            int i = applyReadReceiptEventToMessageListModelUseCase$execute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                applyReadReceiptEventToMessageListModelUseCase$execute$1.label = i - Integer.MIN_VALUE;
                oes = this;
            } else {
                oes = this;
                applyReadReceiptEventToMessageListModelUseCase$execute$1 = new ApplyReadReceiptEventToMessageListModelUseCase$execute$1(oes, continuation);
            }
        }
        java.lang.Object obj = applyReadReceiptEventToMessageListModelUseCase$execute$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = applyReadReceiptEventToMessageListModelUseCase$execute$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            OKMessage oKMessageCopydefault = c44469sQz.copydefault();
            OKMessageContent content = c44469sQz.copydefault().getContent();
            if (!Intrinsics.EZpvd((java.lang.Object) oKMessageCopydefault.getTargetId(), (java.lang.Object) c36558odI.OLrzqt().getTargetId()) || !(content instanceof OKReadReceiptMessage)) {
                return null;
            }
            java.util.List<C35254nrp> listAEQbTJ = c36558odI.AEQbTJ();
            java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(listAEQbTJ, 10));
            java.util.Iterator<T> it3 = listAEQbTJ.iterator();
            while (it3.hasNext()) {
                arrayList2.add(((C35254nrp) it3.next()).OLrzqt());
            }
            c36558odI2 = c36558odI;
            oes2 = oes;
            arrayList = new java.util.ArrayList();
            list = arrayList2;
            applyReadReceiptEventToMessageListModelUseCase$execute$12 = applyReadReceiptEventToMessageListModelUseCase$execute$1;
            it = listAEQbTJ.iterator();
            c44469sQz2 = c44469sQz;
            if (!it.hasNext()) {
            }
        } else if (i2 == 1) {
            it2 = (java.util.Iterator) applyReadReceiptEventToMessageListModelUseCase$execute$1.L$5;
            java.util.Collection collection = (java.util.Collection) applyReadReceiptEventToMessageListModelUseCase$execute$1.L$4;
            java.util.List list3 = (java.util.List) applyReadReceiptEventToMessageListModelUseCase$execute$1.L$3;
            C44469sQz c44469sQz4 = (C44469sQz) applyReadReceiptEventToMessageListModelUseCase$execute$1.L$2;
            C36558odI c36558odI4 = (C36558odI) applyReadReceiptEventToMessageListModelUseCase$execute$1.L$1;
            oES oes4 = (oES) applyReadReceiptEventToMessageListModelUseCase$execute$1.L$0;
            C56391yDq.AEQbTJ(obj);
            arrayList = collection;
            list2 = list3;
            c44469sQz3 = c44469sQz4;
            c36558odI3 = c36558odI4;
            oes3 = oes4;
            oKMessage = (OKMessage) obj;
            if (oKMessage == null) {
            }
        } else {
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it2 = (java.util.Iterator) applyReadReceiptEventToMessageListModelUseCase$execute$1.L$5;
            java.util.Collection collection2 = (java.util.Collection) applyReadReceiptEventToMessageListModelUseCase$execute$1.L$4;
            java.util.List list4 = (java.util.List) applyReadReceiptEventToMessageListModelUseCase$execute$1.L$3;
            C44469sQz c44469sQz5 = (C44469sQz) applyReadReceiptEventToMessageListModelUseCase$execute$1.L$2;
            C36558odI c36558odI5 = (C36558odI) applyReadReceiptEventToMessageListModelUseCase$execute$1.L$1;
            oES oes5 = (oES) applyReadReceiptEventToMessageListModelUseCase$execute$1.L$0;
            C56391yDq.AEQbTJ(obj);
            C35254nrp c35254nrp = (C35254nrp) obj;
            arrayList = collection2;
            list = list4;
            c36558odI2 = c36558odI5;
            oes2 = oes5;
            java.util.Iterator it4 = it2;
            applyReadReceiptEventToMessageListModelUseCase$execute$12 = applyReadReceiptEventToMessageListModelUseCase$execute$1;
            it = it4;
            if (c35254nrp != null) {
                arrayList.add(c35254nrp);
            }
            c44469sQz2 = c44469sQz5;
            if (!it.hasNext()) {
                C35254nrp c35254nrp2 = (C35254nrp) it.next();
                C35847oFx c35847oFx = oes2.EZpvd;
                OKMessage oKMessageOLrzqt = c35254nrp2.OLrzqt();
                applyReadReceiptEventToMessageListModelUseCase$execute$12.L$0 = oes2;
                applyReadReceiptEventToMessageListModelUseCase$execute$12.L$1 = c36558odI2;
                applyReadReceiptEventToMessageListModelUseCase$execute$12.L$2 = c44469sQz2;
                applyReadReceiptEventToMessageListModelUseCase$execute$12.L$3 = list;
                applyReadReceiptEventToMessageListModelUseCase$execute$12.L$4 = arrayList;
                applyReadReceiptEventToMessageListModelUseCase$execute$12.L$5 = it;
                applyReadReceiptEventToMessageListModelUseCase$execute$12.label = 1;
                oES oes6 = oes2;
                java.util.Collection collection3 = arrayList;
                java.lang.Object objEZpvd = c35847oFx.EZpvd(oKMessageOLrzqt, (28 & 2) != 0 ? null : null, (28 & 4) != 0 ? null : null, (28 & 8) != 0 ? null : null, (28 & 16) != 0 ? null : c44469sQz2, applyReadReceiptEventToMessageListModelUseCase$execute$12);
                if (objEZpvd == objCopydefault) {
                    return objCopydefault;
                }
                c44469sQz3 = c44469sQz2;
                list2 = list;
                c36558odI3 = c36558odI2;
                obj = objEZpvd;
                oes3 = oes6;
                arrayList = collection3;
                ApplyReadReceiptEventToMessageListModelUseCase$execute$1 applyReadReceiptEventToMessageListModelUseCase$execute$13 = applyReadReceiptEventToMessageListModelUseCase$execute$12;
                it2 = it;
                applyReadReceiptEventToMessageListModelUseCase$execute$1 = applyReadReceiptEventToMessageListModelUseCase$execute$13;
                oKMessage = (OKMessage) obj;
                if (oKMessage == null) {
                    oGG ogg = oes3.OLrzqt;
                    applyReadReceiptEventToMessageListModelUseCase$execute$1.L$0 = oes3;
                    applyReadReceiptEventToMessageListModelUseCase$execute$1.L$1 = c36558odI3;
                    applyReadReceiptEventToMessageListModelUseCase$execute$1.L$2 = c44469sQz3;
                    applyReadReceiptEventToMessageListModelUseCase$execute$1.L$3 = list2;
                    applyReadReceiptEventToMessageListModelUseCase$execute$1.L$4 = arrayList;
                    applyReadReceiptEventToMessageListModelUseCase$execute$1.L$5 = it2;
                    applyReadReceiptEventToMessageListModelUseCase$execute$1.label = 2;
                    oES oes7 = oes3;
                    C36558odI c36558odI6 = c36558odI3;
                    C44469sQz c44469sQz6 = c44469sQz3;
                    java.util.List list5 = list2;
                    java.util.Collection collection4 = arrayList;
                    java.lang.Object objAEQbTJ = ogg.AEQbTJ(c36558odI3, oKMessage, list2, (CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA & 8) != 0 ? null : null, (CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA & 16) != 0 ? null : null, (CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA & 32) != 0 ? null : null, (CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA & 64) != 0 ? null : null, (CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA & 128) != 0 ? null : null, applyReadReceiptEventToMessageListModelUseCase$execute$1);
                    if (objAEQbTJ == objCopydefault) {
                        return objCopydefault;
                    }
                    c44469sQz5 = c44469sQz6;
                    obj = objAEQbTJ;
                    oes5 = oes7;
                    c36558odI5 = c36558odI6;
                    list4 = list5;
                    collection2 = collection4;
                    C35254nrp c35254nrp3 = (C35254nrp) obj;
                    arrayList = collection2;
                    list = list4;
                    c36558odI2 = c36558odI5;
                    oes2 = oes5;
                    java.util.Iterator it42 = it2;
                    applyReadReceiptEventToMessageListModelUseCase$execute$12 = applyReadReceiptEventToMessageListModelUseCase$execute$1;
                    it = it42;
                    if (c35254nrp3 != null) {
                    }
                    c44469sQz2 = c44469sQz5;
                    if (!it.hasNext()) {
                        return c36558odI2.AEQbTJ((32318 & 1) != 0 ? c36558odI2.AhwBna : (java.util.List) arrayList, (32318 & 2) != 0 ? c36558odI2.KWHzl : null, (32318 & 4) != 0 ? c36558odI2.DbNXlk : null, (32318 & 8) != 0 ? c36558odI2.AkhnZx : null, (32318 & 16) != 0 ? c36558odI2.isConnected : null, (32318 & 32) != 0 ? c36558odI2.djBIcL : null, (32318 & 64) != 0 ? c36558odI2.EZpvd : false, (32318 & 128) != 0 ? c36558odI2.OLrzqt : false, (32318 & 256) != 0 ? c36558odI2.values : null, (32318 & 512) != 0 ? c36558odI2.AYXKKw : false, (32318 & 1024) != 0 ? c36558odI2.gEmmrt : null, (32318 & 2048) != 0 ? c36558odI2.copydefault : null, (32318 & 4096) != 0 ? c36558odI2.fetchVPNInfo : null, (32318 & 8192) != 0 ? c36558odI2.AEQbTJ : false, (32318 & 16384) != 0 ? c36558odI2.valueOf : false);
                    }
                } else {
                    java.util.List list6 = list2;
                    c44469sQz5 = c44469sQz3;
                    c35254nrp3 = null;
                    oes2 = oes3;
                    c36558odI2 = c36558odI3;
                    list = list6;
                    java.util.Iterator it422 = it2;
                    applyReadReceiptEventToMessageListModelUseCase$execute$12 = applyReadReceiptEventToMessageListModelUseCase$execute$1;
                    it = it422;
                    if (c35254nrp3 != null) {
                    }
                    c44469sQz2 = c44469sQz5;
                    if (!it.hasNext()) {
                    }
                }
            }
        }
    }
}
