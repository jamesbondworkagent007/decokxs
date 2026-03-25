package o;

import com.okinc.planet.manager.SocialTradeManager$checkInstrumentSuspend$1;
import com.okinc.planet.manager.SocialTradeManager$ensureInitializedSuspend$1;
import com.okinc.tradeapi.framework.constant.TradeKey;
import com.okinc.unify_trade.biz.BizInstrument;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC54577xNn;
import o.InterfaceC54581xNr;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tSq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C46392tSq {
    public static final C46392tSq EZpvd = new C46392tSq();
    public static final InterfaceC56387yDm copydefault = C56392yDr.copydefault(new Function0() { // from class: o.tSo
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C46392tSq.KWHzl();
        }
    });
    public static final int AEQbTJ = 8;

    private C46392tSq() {
    }

    public final InterfaceC54577xNn OLrzqt() {
        return (InterfaceC54577xNn) copydefault.getValue();
    }

    public final InterfaceC54577xNn AhwBna() {
        return OLrzqt();
    }

    public final InterfaceC54581xNr EZpvd() {
        return OLrzqt().OLrzqt();
    }

    public final java.lang.Boolean copydefault() {
        InterfaceC54581xNr interfaceC54581xNrCopydefault = OLrzqt().copydefault();
        if (interfaceC54581xNrCopydefault != null) {
            return java.lang.Boolean.valueOf(InterfaceC54581xNr.TaskDescription.isInit$default(interfaceC54581xNrCopydefault, null, 1, null));
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(@NotNull Continuation<? super java.lang.Boolean> continuation) throws java.lang.Throwable {
        SocialTradeManager$ensureInitializedSuspend$1 socialTradeManager$ensureInitializedSuspend$1;
        java.lang.Object objM8790ensureInitialize0E7RQCE$default;
        if (continuation instanceof SocialTradeManager$ensureInitializedSuspend$1) {
            socialTradeManager$ensureInitializedSuspend$1 = (SocialTradeManager$ensureInitializedSuspend$1) continuation;
            int i = socialTradeManager$ensureInitializedSuspend$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                socialTradeManager$ensureInitializedSuspend$1.label = i - Integer.MIN_VALUE;
            } else {
                socialTradeManager$ensureInitializedSuspend$1 = new SocialTradeManager$ensureInitializedSuspend$1(this, continuation);
            }
        }
        SocialTradeManager$ensureInitializedSuspend$1 socialTradeManager$ensureInitializedSuspend$12 = socialTradeManager$ensureInitializedSuspend$1;
        java.lang.Object obj = socialTradeManager$ensureInitializedSuspend$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = socialTradeManager$ensureInitializedSuspend$12.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            if (Intrinsics.EZpvd(copydefault(), C56443yFo.KWHzl(true))) {
                return C56443yFo.KWHzl(true);
            }
            InterfaceC54577xNn interfaceC54577xNnOLrzqt = OLrzqt();
            socialTradeManager$ensureInitializedSuspend$12.label = 1;
            objM8790ensureInitialize0E7RQCE$default = InterfaceC54577xNn.ActionBar.m8790ensureInitialize0E7RQCE$default(interfaceC54577xNnOLrzqt, false, null, socialTradeManager$ensureInitializedSuspend$12, 3, null);
            if (objM8790ensureInitialize0E7RQCE$default == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objM8790ensureInitialize0E7RQCE$default = ((Result) obj).m7386unboximpl();
        }
        return C56443yFo.KWHzl(Result.m7384isSuccessimpl(objM8790ensureInitialize0E7RQCE$default));
    }

    public final java.lang.String KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = OLrzqt().OLrzqt();
        if (interfaceC54581xNrOLrzqt != null) {
            return interfaceC54581xNrOLrzqt.valueOf(str);
        }
        return null;
    }

    public final BizInstrument KWHzl(@NotNull java.lang.String str, java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = OLrzqt().OLrzqt();
        if (interfaceC54581xNrOLrzqt != null) {
            return InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrOLrzqt, str, str2, null, null, 12, null);
        }
        return null;
    }

    public final xMS AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        java.lang.String instFamily;
        java.lang.String str3 = "";
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        InterfaceC54581xNr interfaceC54581xNrEZpvd = EZpvd();
        AbstractC54531xLw abstractC54531xLwOLrzqt = interfaceC54581xNrEZpvd != null ? interfaceC54581xNrEZpvd.OLrzqt(str2) : null;
        BizInstrument bizInstrumentValueOf = abstractC54531xLwOLrzqt != null ? abstractC54531xLwOLrzqt.valueOf(str) : null;
        if (abstractC54531xLwOLrzqt == null) {
            return null;
        }
        if (bizInstrumentValueOf != null && (instFamily = bizInstrumentValueOf.getInstFamily()) != null) {
            str3 = instFamily;
        }
        return abstractC54531xLwOLrzqt.gEmmrt(str3);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00a6 -> B:33:0x00a7). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(@NotNull java.util.Set<java.lang.String> set, @NotNull Continuation<? super java.lang.Boolean> continuation) throws java.lang.Throwable {
        SocialTradeManager$checkInstrumentSuspend$1 socialTradeManager$checkInstrumentSuspend$1;
        java.util.Collection arrayList;
        java.util.Iterator it;
        InterfaceC54581xNr interfaceC54581xNr;
        if (continuation instanceof SocialTradeManager$checkInstrumentSuspend$1) {
            socialTradeManager$checkInstrumentSuspend$1 = (SocialTradeManager$checkInstrumentSuspend$1) continuation;
            int i = socialTradeManager$checkInstrumentSuspend$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                socialTradeManager$checkInstrumentSuspend$1.label = i - Integer.MIN_VALUE;
            } else {
                socialTradeManager$checkInstrumentSuspend$1 = new SocialTradeManager$checkInstrumentSuspend$1(this, continuation);
            }
        }
        java.lang.Object objEZpvd = socialTradeManager$checkInstrumentSuspend$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = socialTradeManager$checkInstrumentSuspend$1.label;
        boolean z = false;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objEZpvd);
            InterfaceC54581xNr interfaceC54581xNrEZpvd = EZpvd();
            if (interfaceC54581xNrEZpvd == null) {
                return C56443yFo.KWHzl(false);
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (java.lang.Object obj : set) {
                AbstractC54531xLw abstractC54531xLwOLrzqt = interfaceC54581xNrEZpvd.OLrzqt((java.lang.String) obj);
                if (abstractC54531xLwOLrzqt != null && !AbstractC54531xLw.isInitFun$default(abstractC54531xLwOLrzqt, false, 1, null)) {
                    arrayList2.add(obj);
                }
            }
            arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList2, 10));
            it = arrayList2.iterator();
            interfaceC54581xNr = interfaceC54581xNrEZpvd;
            if (it.hasNext()) {
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            arrayList = (java.util.Collection) socialTradeManager$checkInstrumentSuspend$1.L$3;
            it = (java.util.Iterator) socialTradeManager$checkInstrumentSuspend$1.L$2;
            java.util.Collection collection = (java.util.Collection) socialTradeManager$checkInstrumentSuspend$1.L$1;
            interfaceC54581xNr = (InterfaceC54581xNr) socialTradeManager$checkInstrumentSuspend$1.L$0;
            C56391yDq.AEQbTJ(objEZpvd);
            arrayList.add((AbstractC54531xLw) objEZpvd);
            arrayList = collection;
            if (it.hasNext()) {
                java.lang.String str = (java.lang.String) it.next();
                socialTradeManager$checkInstrumentSuspend$1.L$0 = interfaceC54581xNr;
                socialTradeManager$checkInstrumentSuspend$1.L$1 = arrayList;
                socialTradeManager$checkInstrumentSuspend$1.L$2 = it;
                socialTradeManager$checkInstrumentSuspend$1.L$3 = arrayList;
                socialTradeManager$checkInstrumentSuspend$1.label = 1;
                objEZpvd = interfaceC54581xNr.EZpvd(str, socialTradeManager$checkInstrumentSuspend$1);
                if (objEZpvd == objCopydefault) {
                    return objCopydefault;
                }
                collection = arrayList;
                arrayList.add((AbstractC54531xLw) objEZpvd);
                arrayList = collection;
                if (it.hasNext()) {
                    java.util.List list = (java.util.List) arrayList;
                    if ((list instanceof java.util.Collection) && list.isEmpty()) {
                        z = true;
                    } else {
                        java.util.Iterator it2 = list.iterator();
                        while (it2.hasNext()) {
                            if (((AbstractC54531xLw) it2.next()) == null) {
                                break;
                            }
                        }
                        z = true;
                    }
                    return C56443yFo.KWHzl(z);
                }
            }
        }
    }

    public static final InterfaceC54577xNn KWHzl() {
        return (InterfaceC54577xNn) ((InterfaceC49425uoM) C43251rlk.copydefault(InterfaceC49425uoM.class)).KWHzl(TradeKey.MANAGER);
    }
}
