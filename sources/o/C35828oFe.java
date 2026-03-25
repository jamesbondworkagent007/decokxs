package o;

import com.okinc.im.usecase.messagelistmodel.RefreshMessageListModelUseCase$execute$1;
import com.okinc.okimcore.model.im.OKMessage;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: renamed from: o.oFe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C35828oFe {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int copydefault = 8;
    public final oGG EZpvd;

    @yCM
    public C35828oFe(@NotNull oGG ogg) {
        Intrinsics.checkNotNullParameter(ogg, "");
        this.EZpvd = ogg;
    }

    /* JADX INFO: renamed from: o.oFe$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.oFe.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x00ce -> B:25:0x00d4). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(@NotNull C36558odI c36558odI, @NotNull Continuation<? super C36558odI> continuation) throws java.lang.Throwable {
        RefreshMessageListModelUseCase$execute$1 refreshMessageListModelUseCase$execute$1;
        C35828oFe c35828oFe;
        java.util.Iterator it;
        C35828oFe c35828oFe2;
        C36558odI c36558odI2;
        java.util.List list;
        java.util.Collection collection;
        if (continuation instanceof RefreshMessageListModelUseCase$execute$1) {
            refreshMessageListModelUseCase$execute$1 = (RefreshMessageListModelUseCase$execute$1) continuation;
            int i = refreshMessageListModelUseCase$execute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                refreshMessageListModelUseCase$execute$1.label = i - Integer.MIN_VALUE;
                c35828oFe = this;
            } else {
                c35828oFe = this;
                refreshMessageListModelUseCase$execute$1 = new RefreshMessageListModelUseCase$execute$1(c35828oFe, continuation);
            }
        }
        java.lang.Object obj = refreshMessageListModelUseCase$execute$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = refreshMessageListModelUseCase$execute$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            java.util.List<C35254nrp> listAEQbTJ = c36558odI.AEQbTJ();
            java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listAEQbTJ, 10));
            java.util.Iterator<T> it2 = listAEQbTJ.iterator();
            while (it2.hasNext()) {
                arrayList.add(((C35254nrp) it2.next()).OLrzqt());
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(listAEQbTJ, 10));
            it = listAEQbTJ.iterator();
            c35828oFe2 = c35828oFe;
            c36558odI2 = c36558odI;
            list = arrayList;
            collection = arrayList2;
            if (it.hasNext()) {
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            collection = (java.util.Collection) refreshMessageListModelUseCase$execute$1.L$5;
            it = (java.util.Iterator) refreshMessageListModelUseCase$execute$1.L$4;
            java.util.Collection collection2 = (java.util.Collection) refreshMessageListModelUseCase$execute$1.L$3;
            java.util.List list2 = (java.util.List) refreshMessageListModelUseCase$execute$1.L$2;
            C36558odI c36558odI3 = (C36558odI) refreshMessageListModelUseCase$execute$1.L$1;
            C35828oFe c35828oFe3 = (C35828oFe) refreshMessageListModelUseCase$execute$1.L$0;
            C56391yDq.AEQbTJ(obj);
            c35828oFe2 = c35828oFe3;
            collection.add((C35254nrp) obj);
            collection = collection2;
            list = list2;
            c36558odI2 = c36558odI3;
            if (it.hasNext()) {
                C35254nrp c35254nrp = (C35254nrp) it.next();
                oGG ogg = c35828oFe2.EZpvd;
                OKMessage oKMessageOLrzqt = c35254nrp.OLrzqt();
                refreshMessageListModelUseCase$execute$1.L$0 = c35828oFe2;
                refreshMessageListModelUseCase$execute$1.L$1 = c36558odI2;
                refreshMessageListModelUseCase$execute$1.L$2 = list;
                refreshMessageListModelUseCase$execute$1.L$3 = collection;
                refreshMessageListModelUseCase$execute$1.L$4 = it;
                refreshMessageListModelUseCase$execute$1.L$5 = collection;
                refreshMessageListModelUseCase$execute$1.label = 1;
                C35828oFe c35828oFe4 = c35828oFe2;
                java.lang.Object objAEQbTJ = ogg.AEQbTJ(c36558odI2, oKMessageOLrzqt, list, (CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA & 8) != 0 ? null : null, (CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA & 16) != 0 ? null : null, (CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA & 32) != 0 ? null : null, (CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA & 64) != 0 ? null : null, (CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA & 128) != 0 ? null : null, refreshMessageListModelUseCase$execute$1);
                if (objAEQbTJ == objCopydefault) {
                    return objCopydefault;
                }
                c36558odI3 = c36558odI2;
                obj = objAEQbTJ;
                c35828oFe2 = c35828oFe4;
                list2 = list;
                collection2 = collection;
                collection.add((C35254nrp) obj);
                collection = collection2;
                list = list2;
                c36558odI2 = c36558odI3;
                if (it.hasNext()) {
                    C36558odI c36558odI4 = c36558odI2;
                    return c36558odI4.AEQbTJ((32318 & 1) != 0 ? c36558odI4.AhwBna : (java.util.List) collection, (32318 & 2) != 0 ? c36558odI4.KWHzl : null, (32318 & 4) != 0 ? c36558odI4.DbNXlk : null, (32318 & 8) != 0 ? c36558odI4.AkhnZx : null, (32318 & 16) != 0 ? c36558odI4.isConnected : null, (32318 & 32) != 0 ? c36558odI4.djBIcL : null, (32318 & 64) != 0 ? c36558odI4.EZpvd : false, (32318 & 128) != 0 ? c36558odI4.OLrzqt : false, (32318 & 256) != 0 ? c36558odI4.values : null, (32318 & 512) != 0 ? c36558odI4.AYXKKw : false, (32318 & 1024) != 0 ? c36558odI4.gEmmrt : null, (32318 & 2048) != 0 ? c36558odI4.copydefault : null, (32318 & 4096) != 0 ? c36558odI4.fetchVPNInfo : null, (32318 & 8192) != 0 ? c36558odI4.AEQbTJ : false, (32318 & 16384) != 0 ? c36558odI4.valueOf : false);
                }
            }
        }
    }
}
