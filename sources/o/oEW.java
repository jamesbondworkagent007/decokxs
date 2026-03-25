package o;

import com.okinc.im.usecase.messagelistmodel.LoadLastPageUseCase$execute$1;
import com.okinc.okimcore.model.im.GetMessageDirection;
import com.okinc.okimcore.model.im.OKConversation;
import com.okinc.okimcore.model.im.OKMessage;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import o.oGG;
import org.jetbrains.annotations.NotNull;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: loaded from: classes8.dex */
public final class oEW {
    public static final Activity Companion = new Activity(null);
    public static final int KWHzl = 8;
    public final oEI AEQbTJ;
    public final CoroutineDispatcher EZpvd;
    public final oGG copydefault;

    @yCM
    public oEW(@NotNull oEI oei, @NotNull oGG ogg, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(oei, "");
        Intrinsics.checkNotNullParameter(ogg, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.AEQbTJ = oei;
        this.copydefault = ogg;
        this.EZpvd = coroutineDispatcher;
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.oEW.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.oEI.execute$default(o.oEI, java.lang.String, java.lang.Long, java.lang.Long, boolean, long, java.lang.Boolean, com.okinc.okimcore.model.im.GetMessageDirection, boolean, kotlin.coroutines.Continuation, int, java.lang.Object):java.lang.Object */
    /* JADX DEBUG: Class process forced to load method for inline: o.oGG.execute$default(o.oGG, o.odI, com.okinc.okimcore.model.im.OKMessage, java.util.List, o.oGG$ActionBar, o.oGG$Application, java.lang.Boolean, o.oGG$TaskDescription, o.oGG$StateListAnimator, kotlin.coroutines.Continuation, int, java.lang.Object):java.lang.Object */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x0119 -> B:31:0x011f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(@NotNull C36558odI c36558odI, @NotNull Continuation<? super C36558odI> continuation) throws java.lang.Throwable {
        LoadLastPageUseCase$execute$1 loadLastPageUseCase$execute$1;
        java.lang.Object obj;
        oEW oew;
        java.lang.Object obj2;
        C36558odI c36558odI2;
        java.util.List<OKMessage> listCopydefault;
        java.lang.Long lKWHzl;
        oEW oew2;
        C36558odI c36558odI3;
        java.util.Collection arrayList;
        sNM snm;
        java.util.Iterator it;
        if (continuation instanceof LoadLastPageUseCase$execute$1) {
            loadLastPageUseCase$execute$1 = (LoadLastPageUseCase$execute$1) continuation;
            int i = loadLastPageUseCase$execute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                loadLastPageUseCase$execute$1.label = i - Integer.MIN_VALUE;
            } else {
                loadLastPageUseCase$execute$1 = new LoadLastPageUseCase$execute$1(this, continuation);
            }
        }
        java.lang.Object obj3 = loadLastPageUseCase$execute$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = loadLastPageUseCase$execute$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj3);
            OKConversation oKConversationOLrzqt = c36558odI.OLrzqt();
            oEI oei = this.AEQbTJ;
            java.lang.String targetId = oKConversationOLrzqt.getTargetId();
            java.lang.String startMsgSeq = oKConversationOLrzqt.getStartMsgSeq();
            java.lang.Long lKWHzl2 = startMsgSeq != null ? C56443yFo.KWHzl(C33129mqd.valueOf(startMsgSeq)) : null;
            GetMessageDirection getMessageDirection = GetMessageDirection.TOP;
            loadLastPageUseCase$execute$1.L$0 = this;
            loadLastPageUseCase$execute$1.L$1 = c36558odI;
            loadLastPageUseCase$execute$1.label = 1;
            obj = objCopydefault;
            java.lang.Object objCopydefault2 = oei.copydefault(targetId, lKWHzl2, (48 & 4) != 0 ? null : null, (48 & 8) != 0 ? false : false, (48 & 16) != 0 ? 50L : 0L, (48 & 32) != 0 ? java.lang.Boolean.TRUE : null, getMessageDirection, (48 & 128) != 0 ? false : true, loadLastPageUseCase$execute$1);
            if (objCopydefault2 == obj) {
                return obj;
            }
            oew = this;
            obj2 = objCopydefault2;
            c36558odI2 = c36558odI;
        } else if (i2 == 1) {
            c36558odI2 = (C36558odI) loadLastPageUseCase$execute$1.L$1;
            oEW oew3 = (oEW) loadLastPageUseCase$execute$1.L$0;
            C56391yDq.AEQbTJ(obj3);
            oew = oew3;
            obj2 = obj3;
            obj = objCopydefault;
        } else {
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            arrayList = (java.util.Collection) loadLastPageUseCase$execute$1.L$7;
            it = (java.util.Iterator) loadLastPageUseCase$execute$1.L$6;
            java.util.Collection collection = (java.util.Collection) loadLastPageUseCase$execute$1.L$5;
            java.lang.Long l = (java.lang.Long) loadLastPageUseCase$execute$1.L$4;
            java.util.List<OKMessage> list = (java.util.List) loadLastPageUseCase$execute$1.L$3;
            sNM snm2 = (sNM) loadLastPageUseCase$execute$1.L$2;
            C36558odI c36558odI4 = (C36558odI) loadLastPageUseCase$execute$1.L$1;
            oEW oew4 = (oEW) loadLastPageUseCase$execute$1.L$0;
            C56391yDq.AEQbTJ(obj3);
            oEW oew5 = oew4;
            sNM snm3 = snm2;
            java.lang.Long l2 = l;
            C36558odI c36558odI5 = c36558odI4;
            java.lang.Object objAEQbTJ = obj3;
            obj = objCopydefault;
            arrayList.add((C35254nrp) objAEQbTJ);
            arrayList = collection;
            c36558odI3 = c36558odI5;
            listCopydefault = list;
            lKWHzl = l2;
            snm = snm3;
            oew2 = oew5;
            if (it.hasNext()) {
                OKMessage oKMessage = (OKMessage) it.next();
                oGG ogg = oew2.copydefault;
                oGG.TaskDescription taskDescription = new oGG.TaskDescription(lKWHzl);
                loadLastPageUseCase$execute$1.L$0 = oew2;
                loadLastPageUseCase$execute$1.L$1 = c36558odI3;
                loadLastPageUseCase$execute$1.L$2 = snm;
                loadLastPageUseCase$execute$1.L$3 = listCopydefault;
                loadLastPageUseCase$execute$1.L$4 = lKWHzl;
                loadLastPageUseCase$execute$1.L$5 = arrayList;
                loadLastPageUseCase$execute$1.L$6 = it;
                loadLastPageUseCase$execute$1.L$7 = arrayList;
                loadLastPageUseCase$execute$1.label = 2;
                objAEQbTJ = ogg.AEQbTJ(c36558odI3, oKMessage, listCopydefault, (CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA & 8) != 0 ? null : null, (CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA & 16) != 0 ? null : null, (CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA & 32) != 0 ? null : null, (CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA & 64) != 0 ? null : taskDescription, (CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA & 128) != 0 ? null : null, loadLastPageUseCase$execute$1);
                if (objAEQbTJ == obj) {
                    return obj;
                }
                oew5 = oew2;
                snm3 = snm;
                l2 = lKWHzl;
                list = listCopydefault;
                c36558odI5 = c36558odI3;
                collection = arrayList;
                arrayList.add((C35254nrp) objAEQbTJ);
                arrayList = collection;
                c36558odI3 = c36558odI5;
                listCopydefault = list;
                lKWHzl = l2;
                snm = snm3;
                oew2 = oew5;
                if (it.hasNext()) {
                    C36558odI c36558odI6 = c36558odI3;
                    return c36558odI6.AEQbTJ((32318 & 1) != 0 ? c36558odI6.AhwBna : (java.util.List) arrayList, (32318 & 2) != 0 ? c36558odI6.KWHzl : null, (32318 & 4) != 0 ? c36558odI6.DbNXlk : null, (32318 & 8) != 0 ? c36558odI6.AkhnZx : null, (32318 & 16) != 0 ? c36558odI6.isConnected : null, (32318 & 32) != 0 ? c36558odI6.djBIcL : null, (32318 & 64) != 0 ? c36558odI6.EZpvd : false, (32318 & 128) != 0 ? c36558odI6.OLrzqt : snm.OLrzqt(), (32318 & 256) != 0 ? c36558odI6.values : lKWHzl, (32318 & 512) != 0 ? c36558odI6.AYXKKw : false, (32318 & 1024) != 0 ? c36558odI6.gEmmrt : null, (32318 & 2048) != 0 ? c36558odI6.copydefault : null, (32318 & 4096) != 0 ? c36558odI6.fetchVPNInfo : null, (32318 & 8192) != 0 ? c36558odI6.AEQbTJ : false, (32318 & 16384) != 0 ? c36558odI6.valueOf : false);
                }
            }
        }
        sNM snm4 = (sNM) obj2;
        listCopydefault = snm4.copydefault();
        lKWHzl = nDD.OLrzqt.KWHzl(listCopydefault);
        oew2 = oew;
        c36558odI3 = c36558odI2;
        arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listCopydefault, 10));
        snm = snm4;
        it = listCopydefault.iterator();
        if (it.hasNext()) {
        }
    }
}
