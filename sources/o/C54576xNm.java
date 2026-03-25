package o;

import com.okinc.tradeapi.bean.SourceResp;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.trade.core.BizInstrumentInitializer$setBizTypeAndId$1;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC54574xNk;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xNm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C54576xNm {
    public static final C54576xNm AEQbTJ = new C54576xNm();

    private C54576xNm() {
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(java.lang.String str, java.lang.String str2, @NotNull Continuation<? super AbstractC54574xNk> continuation) throws java.lang.Throwable {
        BizInstrumentInitializer$setBizTypeAndId$1 bizInstrumentInitializer$setBizTypeAndId$1;
        AbstractC54531xLw abstractC54531xLw;
        BizInstrument bizInstrumentCopydefault;
        if (continuation instanceof BizInstrumentInitializer$setBizTypeAndId$1) {
            bizInstrumentInitializer$setBizTypeAndId$1 = (BizInstrumentInitializer$setBizTypeAndId$1) continuation;
            int i = bizInstrumentInitializer$setBizTypeAndId$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                bizInstrumentInitializer$setBizTypeAndId$1.label = i - Integer.MIN_VALUE;
            } else {
                bizInstrumentInitializer$setBizTypeAndId$1 = new BizInstrumentInitializer$setBizTypeAndId$1(this, continuation);
            }
        }
        java.lang.Object objEZpvd = bizInstrumentInitializer$setBizTypeAndId$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = bizInstrumentInitializer$setBizTypeAndId$1.label;
        SourceResp sourceResp = null;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objEZpvd);
            if (C33129mqd.OLrzqt((java.lang.CharSequence) str)) {
                InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
                if (interfaceC54581xNrOLrzqt == null) {
                    abstractC54531xLw = null;
                    if (str2 != null || str2.length() == 0) {
                        bizInstrumentCopydefault = abstractC54531xLw == null ? abstractC54531xLw.copydefault() : null;
                        if (bizInstrumentCopydefault == null) {
                            bizInstrumentCopydefault = abstractC54531xLw != null ? abstractC54531xLw.copydefault() : null;
                        }
                        if (bizInstrumentCopydefault == null) {
                            return AbstractC54574xNk.ActionBar.KWHzl;
                        }
                        InterfaceC54581xNr interfaceC54581xNrOLrzqt2 = C54589xNz.EZpvd.OLrzqt();
                        if (interfaceC54581xNrOLrzqt2 != null) {
                            interfaceC54581xNrOLrzqt2.KWHzl(bizInstrumentCopydefault);
                        }
                    } else {
                        if (abstractC54531xLw != null) {
                            bizInstrumentCopydefault = abstractC54531xLw.valueOf(str2);
                        }
                        if (bizInstrumentCopydefault == null) {
                        }
                        if (bizInstrumentCopydefault == null) {
                        }
                    }
                    if (sourceResp == null) {
                    }
                }
                if (str == null) {
                    str = "";
                }
                bizInstrumentInitializer$setBizTypeAndId$1.L$0 = str2;
                bizInstrumentInitializer$setBizTypeAndId$1.label = 1;
                objEZpvd = interfaceC54581xNrOLrzqt.EZpvd(str, bizInstrumentInitializer$setBizTypeAndId$1);
                if (objEZpvd == objCopydefault) {
                    return objCopydefault;
                }
            }
            InterfaceC54581xNr interfaceC54581xNrOLrzqt3 = C54589xNz.EZpvd.OLrzqt();
            if (interfaceC54581xNrOLrzqt3 != null) {
                bizInstrumentInitializer$setBizTypeAndId$1.L$0 = null;
                bizInstrumentInitializer$setBizTypeAndId$1.label = 2;
                objEZpvd = interfaceC54581xNrOLrzqt3.EZpvd(bizInstrumentInitializer$setBizTypeAndId$1);
                if (objEZpvd == objCopydefault) {
                    return objCopydefault;
                }
                sourceResp = (SourceResp) objEZpvd;
            }
            if (sourceResp == null) {
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objEZpvd);
            sourceResp = (SourceResp) objEZpvd;
            return (sourceResp == null && Intrinsics.EZpvd(sourceResp.isSuccess(), C56443yFo.KWHzl(true))) ? new AbstractC54574xNk.TaskDescription((AbstractC54531xLw) sourceResp.getData()) : AbstractC54574xNk.ActionBar.KWHzl;
        }
        java.lang.String str3 = (java.lang.String) bizInstrumentInitializer$setBizTypeAndId$1.L$0;
        C56391yDq.AEQbTJ(objEZpvd);
        str2 = str3;
        abstractC54531xLw = (AbstractC54531xLw) objEZpvd;
        if (str2 != null) {
            if (abstractC54531xLw == null) {
            }
            if (bizInstrumentCopydefault == null) {
            }
            if (bizInstrumentCopydefault == null) {
            }
        }
        if (sourceResp == null) {
        }
    }
}
