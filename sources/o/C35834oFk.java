package o;

import com.okinc.im.usecase.messagelistmodel.ResetTargetMessageAndSearchKeyFromMessageListModelUseCase$execute$1;
import com.okinc.okimcore.model.im.OKMessage;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import o.oGG;
import org.jetbrains.annotations.NotNull;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: renamed from: o.oFk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C35834oFk {
    public final oGG KWHzl;
    public final C35847oFx copydefault;

    @yCM
    public C35834oFk(@NotNull oGG ogg, @NotNull C35847oFx c35847oFx) {
        Intrinsics.checkNotNullParameter(ogg, "");
        Intrinsics.checkNotNullParameter(c35847oFx, "");
        this.KWHzl = ogg;
        this.copydefault = c35847oFx;
    }

    /* JADX DEBUG: Duplicate block (B:38:0x01f1) to fix multi-entry loop: BACK_EDGE: B:38:0x01f1 -> B:39:0x01f9 */
    /* JADX WARN: Removed duplicated region for block: B:23:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x01ba -> B:33:0x01c8). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(@NotNull C36558odI c36558odI, @NotNull Continuation<? super C36558odI> continuation) throws java.lang.Throwable {
        ResetTargetMessageAndSearchKeyFromMessageListModelUseCase$execute$1 resetTargetMessageAndSearchKeyFromMessageListModelUseCase$execute$1;
        C35834oFk c35834oFk;
        C35834oFk c35834oFk2;
        java.util.Iterator it;
        java.util.List list;
        java.util.Collection collection;
        C36558odI c36558odI2;
        ResetTargetMessageAndSearchKeyFromMessageListModelUseCase$execute$1 resetTargetMessageAndSearchKeyFromMessageListModelUseCase$execute$12;
        C36558odI c36558odI3;
        C36558odI c36558odI4;
        java.util.Collection collection2;
        C36558odI c36558odI5;
        C35254nrp c35254nrp;
        java.util.Iterator it2;
        java.util.Collection collection3;
        C36558odI c36558odI6;
        C36558odI c36558odI7;
        C35834oFk c35834oFk3;
        java.util.List list2;
        OKMessage oKMessage;
        java.util.List list3;
        if (continuation instanceof ResetTargetMessageAndSearchKeyFromMessageListModelUseCase$execute$1) {
            resetTargetMessageAndSearchKeyFromMessageListModelUseCase$execute$1 = (ResetTargetMessageAndSearchKeyFromMessageListModelUseCase$execute$1) continuation;
            int i = resetTargetMessageAndSearchKeyFromMessageListModelUseCase$execute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                resetTargetMessageAndSearchKeyFromMessageListModelUseCase$execute$1.label = i - Integer.MIN_VALUE;
                c35834oFk = this;
            } else {
                c35834oFk = this;
                resetTargetMessageAndSearchKeyFromMessageListModelUseCase$execute$1 = new ResetTargetMessageAndSearchKeyFromMessageListModelUseCase$execute$1(c35834oFk, continuation);
            }
        }
        java.lang.Object obj = resetTargetMessageAndSearchKeyFromMessageListModelUseCase$execute$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = resetTargetMessageAndSearchKeyFromMessageListModelUseCase$execute$1.label;
        int i3 = 1;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            C36558odI c36558odIAEQbTJ = c36558odI.AEQbTJ((32318 & 1) != 0 ? c36558odI.AhwBna : null, (32318 & 2) != 0 ? c36558odI.KWHzl : null, (32318 & 4) != 0 ? c36558odI.DbNXlk : null, (32318 & 8) != 0 ? c36558odI.AkhnZx : null, (32318 & 16) != 0 ? c36558odI.isConnected : null, (32318 & 32) != 0 ? c36558odI.djBIcL : null, (32318 & 64) != 0 ? c36558odI.EZpvd : false, (32318 & 128) != 0 ? c36558odI.OLrzqt : false, (32318 & 256) != 0 ? c36558odI.values : null, (32318 & 512) != 0 ? c36558odI.AYXKKw : false, (32318 & 1024) != 0 ? c36558odI.gEmmrt : null, (32318 & 2048) != 0 ? c36558odI.copydefault : null, (32318 & 4096) != 0 ? c36558odI.fetchVPNInfo : null, (32318 & 8192) != 0 ? c36558odI.AEQbTJ : false, (32318 & 16384) != 0 ? c36558odI.valueOf : false);
            java.util.List<C35254nrp> listAEQbTJ = c36558odIAEQbTJ.AEQbTJ();
            java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listAEQbTJ, 10));
            java.util.Iterator<T> it3 = listAEQbTJ.iterator();
            while (it3.hasNext()) {
                arrayList.add(((C35254nrp) it3.next()).OLrzqt());
            }
            java.util.List<C35254nrp> listAEQbTJ2 = c36558odIAEQbTJ.AEQbTJ();
            java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(listAEQbTJ2, 10));
            c35834oFk2 = c35834oFk;
            it = listAEQbTJ2.iterator();
            list = arrayList;
            collection = arrayList2;
            c36558odI2 = c36558odIAEQbTJ;
            resetTargetMessageAndSearchKeyFromMessageListModelUseCase$execute$12 = resetTargetMessageAndSearchKeyFromMessageListModelUseCase$execute$1;
            c36558odI3 = c36558odI2;
            c36558odI4 = c36558odI;
            if (!it.hasNext()) {
            }
        } else if (i2 == 1) {
            list2 = (java.util.List) resetTargetMessageAndSearchKeyFromMessageListModelUseCase$execute$1.L$8;
            java.util.Collection collection4 = (java.util.Collection) resetTargetMessageAndSearchKeyFromMessageListModelUseCase$execute$1.L$7;
            C36558odI c36558odI8 = (C36558odI) resetTargetMessageAndSearchKeyFromMessageListModelUseCase$execute$1.L$6;
            C35254nrp c35254nrp2 = (C35254nrp) resetTargetMessageAndSearchKeyFromMessageListModelUseCase$execute$1.L$5;
            java.util.Iterator it4 = (java.util.Iterator) resetTargetMessageAndSearchKeyFromMessageListModelUseCase$execute$1.L$4;
            collection3 = (java.util.Collection) resetTargetMessageAndSearchKeyFromMessageListModelUseCase$execute$1.L$3;
            C36558odI c36558odI9 = (C36558odI) resetTargetMessageAndSearchKeyFromMessageListModelUseCase$execute$1.L$2;
            C36558odI c36558odI10 = (C36558odI) resetTargetMessageAndSearchKeyFromMessageListModelUseCase$execute$1.L$1;
            C35834oFk c35834oFk4 = (C35834oFk) resetTargetMessageAndSearchKeyFromMessageListModelUseCase$execute$1.L$0;
            C56391yDq.AEQbTJ(obj);
            collection2 = collection4;
            c36558odI5 = c36558odI8;
            c35834oFk3 = c35834oFk4;
            c35254nrp = c35254nrp2;
            c36558odI7 = c36558odI10;
            it2 = it4;
            c36558odI6 = c36558odI9;
            oKMessage = (OKMessage) obj;
            if (oKMessage == null) {
            }
        } else {
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            list2 = (java.util.List) resetTargetMessageAndSearchKeyFromMessageListModelUseCase$execute$1.L$8;
            java.util.Collection collection5 = (java.util.Collection) resetTargetMessageAndSearchKeyFromMessageListModelUseCase$execute$1.L$7;
            C36558odI c36558odI11 = (C36558odI) resetTargetMessageAndSearchKeyFromMessageListModelUseCase$execute$1.L$6;
            C35254nrp c35254nrp3 = (C35254nrp) resetTargetMessageAndSearchKeyFromMessageListModelUseCase$execute$1.L$5;
            java.util.Iterator it5 = (java.util.Iterator) resetTargetMessageAndSearchKeyFromMessageListModelUseCase$execute$1.L$4;
            collection3 = (java.util.Collection) resetTargetMessageAndSearchKeyFromMessageListModelUseCase$execute$1.L$3;
            C36558odI c36558odI12 = (C36558odI) resetTargetMessageAndSearchKeyFromMessageListModelUseCase$execute$1.L$2;
            C36558odI c36558odI13 = (C36558odI) resetTargetMessageAndSearchKeyFromMessageListModelUseCase$execute$1.L$1;
            C35834oFk c35834oFk5 = (C35834oFk) resetTargetMessageAndSearchKeyFromMessageListModelUseCase$execute$1.L$0;
            C56391yDq.AEQbTJ(obj);
            C35254nrp c35254nrp4 = (C35254nrp) obj;
            if (c35254nrp4 == null) {
                list3 = list2;
                it = it5;
                resetTargetMessageAndSearchKeyFromMessageListModelUseCase$execute$12 = resetTargetMessageAndSearchKeyFromMessageListModelUseCase$execute$1;
                c36558odI3 = c36558odI12;
                c35834oFk2 = c35834oFk5;
                c36558odI5 = c36558odI11;
            } else {
                C35834oFk c35834oFk6 = c35834oFk5;
                c36558odI5 = c36558odI11;
                list3 = list2;
                c35254nrp4 = c35254nrp3;
                collection5 = collection5;
                resetTargetMessageAndSearchKeyFromMessageListModelUseCase$execute$12 = resetTargetMessageAndSearchKeyFromMessageListModelUseCase$execute$1;
                c36558odI13 = c36558odI13;
                c36558odI3 = c36558odI12;
                it = it5;
                c35834oFk2 = c35834oFk6;
            }
            collection5.add(c35254nrp4);
            c36558odI4 = c36558odI13;
            c36558odI2 = c36558odI5;
            i3 = 1;
            list = list3;
            collection = collection3;
            if (!it.hasNext()) {
                C35254nrp c35254nrp5 = (C35254nrp) it.next();
                C35847oFx c35847oFx = c35834oFk2.copydefault;
                OKMessage oKMessageOLrzqt = c35254nrp5.OLrzqt();
                java.lang.Long lDjBIcL = c36558odI3.djBIcL();
                resetTargetMessageAndSearchKeyFromMessageListModelUseCase$execute$12.L$0 = c35834oFk2;
                resetTargetMessageAndSearchKeyFromMessageListModelUseCase$execute$12.L$1 = c36558odI4;
                resetTargetMessageAndSearchKeyFromMessageListModelUseCase$execute$12.L$2 = c36558odI3;
                resetTargetMessageAndSearchKeyFromMessageListModelUseCase$execute$12.L$3 = collection;
                resetTargetMessageAndSearchKeyFromMessageListModelUseCase$execute$12.L$4 = it;
                resetTargetMessageAndSearchKeyFromMessageListModelUseCase$execute$12.L$5 = c35254nrp5;
                resetTargetMessageAndSearchKeyFromMessageListModelUseCase$execute$12.L$6 = c36558odI2;
                resetTargetMessageAndSearchKeyFromMessageListModelUseCase$execute$12.L$7 = collection;
                resetTargetMessageAndSearchKeyFromMessageListModelUseCase$execute$12.L$8 = list;
                resetTargetMessageAndSearchKeyFromMessageListModelUseCase$execute$12.label = i3;
                C35834oFk c35834oFk7 = c35834oFk2;
                java.util.Collection collection6 = collection;
                java.util.List list4 = list;
                java.util.Iterator it6 = it;
                java.lang.Object objEZpvd = c35847oFx.EZpvd(oKMessageOLrzqt, (28 & 2) != 0 ? null : lDjBIcL, (28 & 4) != 0 ? null : null, (28 & 8) != 0 ? null : null, (28 & 16) != 0 ? null : null, resetTargetMessageAndSearchKeyFromMessageListModelUseCase$execute$12);
                if (objEZpvd == objCopydefault) {
                    return objCopydefault;
                }
                c36558odI7 = c36558odI4;
                c36558odI6 = c36558odI3;
                resetTargetMessageAndSearchKeyFromMessageListModelUseCase$execute$1 = resetTargetMessageAndSearchKeyFromMessageListModelUseCase$execute$12;
                c36558odI5 = c36558odI2;
                obj = objEZpvd;
                collection3 = collection6;
                collection2 = collection3;
                list2 = list4;
                c35254nrp = c35254nrp5;
                c35834oFk3 = c35834oFk7;
                it2 = it6;
                oKMessage = (OKMessage) obj;
                if (oKMessage == null) {
                    oGG ogg = c35834oFk3.KWHzl;
                    oGG.Application application = new oGG.Application(null);
                    oGG.ActionBar actionBar = new oGG.ActionBar(null);
                    resetTargetMessageAndSearchKeyFromMessageListModelUseCase$execute$1.L$0 = c35834oFk3;
                    resetTargetMessageAndSearchKeyFromMessageListModelUseCase$execute$1.L$1 = c36558odI7;
                    resetTargetMessageAndSearchKeyFromMessageListModelUseCase$execute$1.L$2 = c36558odI6;
                    resetTargetMessageAndSearchKeyFromMessageListModelUseCase$execute$1.L$3 = collection3;
                    resetTargetMessageAndSearchKeyFromMessageListModelUseCase$execute$1.L$4 = it2;
                    resetTargetMessageAndSearchKeyFromMessageListModelUseCase$execute$1.L$5 = c35254nrp;
                    resetTargetMessageAndSearchKeyFromMessageListModelUseCase$execute$1.L$6 = c36558odI5;
                    resetTargetMessageAndSearchKeyFromMessageListModelUseCase$execute$1.L$7 = collection2;
                    resetTargetMessageAndSearchKeyFromMessageListModelUseCase$execute$1.L$8 = list2;
                    resetTargetMessageAndSearchKeyFromMessageListModelUseCase$execute$1.label = 2;
                    C35834oFk c35834oFk8 = c35834oFk3;
                    C36558odI c36558odI14 = c36558odI7;
                    C36558odI c36558odI15 = c36558odI6;
                    java.util.Collection collection7 = collection3;
                    java.util.Iterator it7 = it2;
                    C35254nrp c35254nrp6 = c35254nrp;
                    C36558odI c36558odI16 = c36558odI5;
                    java.util.Collection collection8 = collection2;
                    java.lang.Object objAEQbTJ = ogg.AEQbTJ(c36558odI7, oKMessage, list2, (CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA & 8) != 0 ? null : actionBar, (CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA & 16) != 0 ? null : application, (CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA & 32) != 0 ? null : null, (CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA & 64) != 0 ? null : null, (CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA & 128) != 0 ? null : null, resetTargetMessageAndSearchKeyFromMessageListModelUseCase$execute$1);
                    if (objAEQbTJ == objCopydefault) {
                        return objCopydefault;
                    }
                    c36558odI12 = c36558odI15;
                    it5 = it7;
                    c35254nrp3 = c35254nrp6;
                    obj = objAEQbTJ;
                    c36558odI13 = c36558odI14;
                    c35834oFk5 = c35834oFk8;
                    collection3 = collection7;
                    c36558odI11 = c36558odI16;
                    collection5 = collection8;
                    C35254nrp c35254nrp42 = (C35254nrp) obj;
                    if (c35254nrp42 == null) {
                    }
                    collection5.add(c35254nrp42);
                    c36558odI4 = c36558odI13;
                    c36558odI2 = c36558odI5;
                    i3 = 1;
                    list = list3;
                    collection = collection3;
                    if (!it.hasNext()) {
                        return c36558odI2.AEQbTJ((32318 & 1) != 0 ? c36558odI2.AhwBna : CollectionsKt___CollectionsKt.AxsJAYsNCnLh((java.util.List) collection), (32318 & 2) != 0 ? c36558odI2.KWHzl : null, (32318 & 4) != 0 ? c36558odI2.DbNXlk : null, (32318 & 8) != 0 ? c36558odI2.AkhnZx : null, (32318 & 16) != 0 ? c36558odI2.isConnected : null, (32318 & 32) != 0 ? c36558odI2.djBIcL : null, (32318 & 64) != 0 ? c36558odI2.EZpvd : false, (32318 & 128) != 0 ? c36558odI2.OLrzqt : false, (32318 & 256) != 0 ? c36558odI2.values : null, (32318 & 512) != 0 ? c36558odI2.AYXKKw : false, (32318 & 1024) != 0 ? c36558odI2.gEmmrt : null, (32318 & 2048) != 0 ? c36558odI2.copydefault : null, (32318 & 4096) != 0 ? c36558odI2.fetchVPNInfo : null, (32318 & 8192) != 0 ? c36558odI2.AEQbTJ : false, (32318 & 16384) != 0 ? c36558odI2.valueOf : false);
                    }
                } else {
                    list3 = list2;
                    c35254nrp42 = c35254nrp;
                    collection5 = collection2;
                    resetTargetMessageAndSearchKeyFromMessageListModelUseCase$execute$12 = resetTargetMessageAndSearchKeyFromMessageListModelUseCase$execute$1;
                    c36558odI13 = c36558odI7;
                    c36558odI3 = c36558odI6;
                    it = it2;
                    c35834oFk2 = c35834oFk3;
                    collection5.add(c35254nrp42);
                    c36558odI4 = c36558odI13;
                    c36558odI2 = c36558odI5;
                    i3 = 1;
                    list = list3;
                    collection = collection3;
                    if (!it.hasNext()) {
                    }
                }
            }
        }
    }
}
