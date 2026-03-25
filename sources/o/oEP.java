package o;

import com.okinc.im.usecase.messagelistmodel.ApplyIsShowMessageStatusMessageListModelUseCase$execute$1;
import com.okinc.okimcore.model.im.OKMessage;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.oGG;
import org.jetbrains.annotations.NotNull;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: loaded from: classes8.dex */
public final class oEP {
    public static final Activity Companion = new Activity(null);
    public static final int EZpvd = 8;
    public final oGG OLrzqt;

    @yCM
    public oEP(@NotNull oGG ogg) {
        Intrinsics.checkNotNullParameter(ogg, "");
        this.OLrzqt = ogg;
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.oEP.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00ea -> B:39:0x0159). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x013e -> B:38:0x014d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(java.lang.Long l, @NotNull C36558odI c36558odI, @NotNull Continuation<? super C36558odI> continuation) throws java.lang.Throwable {
        ApplyIsShowMessageStatusMessageListModelUseCase$execute$1 applyIsShowMessageStatusMessageListModelUseCase$execute$1;
        oEP oep;
        java.lang.Long l2;
        oEP oep2;
        java.util.Iterator it;
        java.util.List list;
        C36558odI c36558odI2;
        ApplyIsShowMessageStatusMessageListModelUseCase$execute$1 applyIsShowMessageStatusMessageListModelUseCase$execute$12;
        java.util.Collection collection;
        java.lang.Long l3;
        java.lang.Long l4 = l;
        if (continuation instanceof ApplyIsShowMessageStatusMessageListModelUseCase$execute$1) {
            applyIsShowMessageStatusMessageListModelUseCase$execute$1 = (ApplyIsShowMessageStatusMessageListModelUseCase$execute$1) continuation;
            int i = applyIsShowMessageStatusMessageListModelUseCase$execute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                applyIsShowMessageStatusMessageListModelUseCase$execute$1.label = i - Integer.MIN_VALUE;
                oep = this;
            } else {
                oep = this;
                applyIsShowMessageStatusMessageListModelUseCase$execute$1 = new ApplyIsShowMessageStatusMessageListModelUseCase$execute$1(oep, continuation);
            }
        }
        java.lang.Object obj = applyIsShowMessageStatusMessageListModelUseCase$execute$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = applyIsShowMessageStatusMessageListModelUseCase$execute$1.label;
        int i3 = 1;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            pUU.KWHzl("ApplyIsShowMessageStatusMessageListModelUseCase", "targetMessageId:" + l4);
            java.lang.Long lAYXKKw = c36558odI.AYXKKw();
            java.lang.Long l5 = Intrinsics.EZpvd(lAYXKKw, l4) ? null : l4;
            java.util.List<C35254nrp> listAEQbTJ = c36558odI.AEQbTJ();
            java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listAEQbTJ, 10));
            java.util.Iterator<T> it2 = listAEQbTJ.iterator();
            while (it2.hasNext()) {
                arrayList.add(((C35254nrp) it2.next()).OLrzqt());
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(listAEQbTJ, 10));
            l2 = lAYXKKw;
            oep2 = oep;
            it = listAEQbTJ.iterator();
            list = arrayList;
            c36558odI2 = c36558odI;
            java.lang.Long l6 = l5;
            applyIsShowMessageStatusMessageListModelUseCase$execute$12 = applyIsShowMessageStatusMessageListModelUseCase$execute$1;
            collection = arrayList2;
            l3 = l6;
            if (!it.hasNext()) {
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            java.util.Collection collection2 = (java.util.Collection) applyIsShowMessageStatusMessageListModelUseCase$execute$1.L$8;
            java.util.Iterator it3 = (java.util.Iterator) applyIsShowMessageStatusMessageListModelUseCase$execute$1.L$7;
            java.util.Collection collection3 = (java.util.Collection) applyIsShowMessageStatusMessageListModelUseCase$execute$1.L$6;
            java.util.List list2 = (java.util.List) applyIsShowMessageStatusMessageListModelUseCase$execute$1.L$5;
            java.lang.Long l7 = (java.lang.Long) applyIsShowMessageStatusMessageListModelUseCase$execute$1.L$4;
            java.lang.Long l8 = (java.lang.Long) applyIsShowMessageStatusMessageListModelUseCase$execute$1.L$3;
            C36558odI c36558odI3 = (C36558odI) applyIsShowMessageStatusMessageListModelUseCase$execute$1.L$2;
            java.lang.Long l9 = (java.lang.Long) applyIsShowMessageStatusMessageListModelUseCase$execute$1.L$1;
            oEP oep3 = (oEP) applyIsShowMessageStatusMessageListModelUseCase$execute$1.L$0;
            C56391yDq.AEQbTJ(obj);
            C35254nrp c35254nrp = (C35254nrp) obj;
            it = it3;
            c36558odI2 = c36558odI3;
            oep2 = oep3;
            applyIsShowMessageStatusMessageListModelUseCase$execute$12 = applyIsShowMessageStatusMessageListModelUseCase$execute$1;
            list = list2;
            collection = collection2;
            l4 = l9;
            l2 = l8;
            l3 = l7;
            collection.add(c35254nrp);
            collection = collection3;
            i3 = 1;
            if (!it.hasNext()) {
                C35254nrp c35254nrp2 = (C35254nrp) it.next();
                long seq = c35254nrp2.OLrzqt().getSeq();
                if ((l4 != null && seq == l4.longValue()) || c35254nrp2.DbNXlk()) {
                    oGG ogg = oep2.OLrzqt;
                    OKMessage oKMessageOLrzqt = c35254nrp2.OLrzqt();
                    oGG.TaskDescription taskDescription = new oGG.TaskDescription(l3);
                    applyIsShowMessageStatusMessageListModelUseCase$execute$12.L$0 = oep2;
                    applyIsShowMessageStatusMessageListModelUseCase$execute$12.L$1 = l4;
                    applyIsShowMessageStatusMessageListModelUseCase$execute$12.L$2 = c36558odI2;
                    applyIsShowMessageStatusMessageListModelUseCase$execute$12.L$3 = l2;
                    applyIsShowMessageStatusMessageListModelUseCase$execute$12.L$4 = l3;
                    applyIsShowMessageStatusMessageListModelUseCase$execute$12.L$5 = list;
                    applyIsShowMessageStatusMessageListModelUseCase$execute$12.L$6 = collection;
                    applyIsShowMessageStatusMessageListModelUseCase$execute$12.L$7 = it;
                    applyIsShowMessageStatusMessageListModelUseCase$execute$12.L$8 = collection;
                    applyIsShowMessageStatusMessageListModelUseCase$execute$12.label = i3;
                    java.lang.Long l10 = l3;
                    oEP oep4 = oep2;
                    java.lang.Long l11 = l2;
                    java.util.List list3 = list;
                    java.util.Iterator it4 = it;
                    java.lang.Object objAEQbTJ = ogg.AEQbTJ(c36558odI2, oKMessageOLrzqt, list, (CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA & 8) != 0 ? null : null, (CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA & 16) != 0 ? null : null, (CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA & 32) != 0 ? null : null, (CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA & 64) != 0 ? null : taskDescription, (CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA & 128) != 0 ? null : null, applyIsShowMessageStatusMessageListModelUseCase$execute$12);
                    if (objAEQbTJ == objCopydefault) {
                        return objCopydefault;
                    }
                    l9 = l4;
                    c36558odI3 = c36558odI2;
                    collection2 = collection;
                    l7 = l10;
                    obj = objAEQbTJ;
                    oep3 = oep4;
                    list2 = list3;
                    l8 = l11;
                    collection3 = collection2;
                    applyIsShowMessageStatusMessageListModelUseCase$execute$1 = applyIsShowMessageStatusMessageListModelUseCase$execute$12;
                    it3 = it4;
                    C35254nrp c35254nrp3 = (C35254nrp) obj;
                    it = it3;
                    c36558odI2 = c36558odI3;
                    oep2 = oep3;
                    applyIsShowMessageStatusMessageListModelUseCase$execute$12 = applyIsShowMessageStatusMessageListModelUseCase$execute$1;
                    list = list2;
                    collection = collection2;
                    l4 = l9;
                    l2 = l8;
                    l3 = l7;
                    collection.add(c35254nrp3);
                    collection = collection3;
                    i3 = 1;
                    if (!it.hasNext()) {
                        java.lang.Long l12 = l3;
                        pUU.KWHzl("ApplyIsShowMessageStatusMessageListModelUseCase", "oldShowStatusSeq = " + l2 + ", newShowStatusSeq = " + l12);
                        C36558odI c36558odI4 = c36558odI2;
                        return c36558odI4.AEQbTJ((32318 & 1) != 0 ? c36558odI4.AhwBna : (java.util.List) collection, (32318 & 2) != 0 ? c36558odI4.KWHzl : null, (32318 & 4) != 0 ? c36558odI4.DbNXlk : null, (32318 & 8) != 0 ? c36558odI4.AkhnZx : null, (32318 & 16) != 0 ? c36558odI4.isConnected : null, (32318 & 32) != 0 ? c36558odI4.djBIcL : null, (32318 & 64) != 0 ? c36558odI4.EZpvd : false, (32318 & 128) != 0 ? c36558odI4.OLrzqt : false, (32318 & 256) != 0 ? c36558odI4.values : l12, (32318 & 512) != 0 ? c36558odI4.AYXKKw : false, (32318 & 1024) != 0 ? c36558odI4.gEmmrt : null, (32318 & 2048) != 0 ? c36558odI4.copydefault : null, (32318 & 4096) != 0 ? c36558odI4.fetchVPNInfo : null, (32318 & 8192) != 0 ? c36558odI4.AEQbTJ : false, (32318 & 16384) != 0 ? c36558odI4.valueOf : false);
                    }
                } else {
                    c35254nrp3 = c35254nrp2;
                    collection3 = collection;
                    collection.add(c35254nrp3);
                    collection = collection3;
                    i3 = 1;
                    if (!it.hasNext()) {
                    }
                }
            }
        }
    }
}
