package o;

import com.okinc.common.okcore.localization.BaseLanguageListTaskImpl$execute$1;
import com.okinc.localization.bean.LanguageItem;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uniffi.ok_future_utils.OkffiException;

/* JADX INFO: renamed from: o.mfI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public abstract class AbstractC32525mfI implements AYE {
    public final pTU EZpvd;
    public final java.lang.String OLrzqt;

    public abstract java.lang.String AEQbTJ();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final pTU EZpvd() {
        return this.EZpvd;
    }

    public abstract java.lang.Object KWHzl(@NotNull Continuation<? super java.util.List<LanguageItem>> continuation);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.OLrzqt;
    }

    public abstract java.lang.String OLrzqt();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AYE
    public java.lang.Object copydefault(@NotNull Continuation<? super C2758AYc> continuation) {
        return AEQbTJ(this, continuation);
    }

    public AbstractC32525mfI(@NotNull pTU ptu, java.lang.String str) {
        Intrinsics.checkNotNullParameter(ptu, "");
        this.EZpvd = ptu;
        this.OLrzqt = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ java.lang.Object AEQbTJ(AbstractC32525mfI abstractC32525mfI, Continuation<? super C2758AYc> continuation) throws java.lang.Throwable {
        BaseLanguageListTaskImpl$execute$1 baseLanguageListTaskImpl$execute$1;
        java.util.List listAhwBna;
        if (continuation instanceof BaseLanguageListTaskImpl$execute$1) {
            baseLanguageListTaskImpl$execute$1 = (BaseLanguageListTaskImpl$execute$1) continuation;
            int i = baseLanguageListTaskImpl$execute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                baseLanguageListTaskImpl$execute$1.label = i - Integer.MIN_VALUE;
            } else {
                baseLanguageListTaskImpl$execute$1 = new BaseLanguageListTaskImpl$execute$1(abstractC32525mfI, continuation);
            }
        }
        java.lang.Object objKWHzl = baseLanguageListTaskImpl$execute$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = baseLanguageListTaskImpl$execute$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objKWHzl);
                pUU.KWHzl(abstractC32525mfI.AEQbTJ(), "execute: fetching from " + abstractC32525mfI.OLrzqt() + " for market=" + abstractC32525mfI.OLrzqt);
                baseLanguageListTaskImpl$execute$1.L$0 = abstractC32525mfI;
                baseLanguageListTaskImpl$execute$1.label = 1;
                objKWHzl = abstractC32525mfI.KWHzl(baseLanguageListTaskImpl$execute$1);
                if (objKWHzl == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                abstractC32525mfI = (AbstractC32525mfI) baseLanguageListTaskImpl$execute$1.L$0;
                C56391yDq.AEQbTJ(objKWHzl);
            }
            java.util.List list = (java.util.List) objKWHzl;
            if (list == null) {
                listAhwBna = yDY.AhwBna();
            } else {
                listAhwBna = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
                java.util.Iterator it = list.iterator();
                while (it.hasNext()) {
                    listAhwBna.add(abstractC32525mfI.OLrzqt((LanguageItem) it.next()));
                }
            }
            pUU.KWHzl(abstractC32525mfI.AEQbTJ(), "execute: success, " + listAhwBna.size() + " languages for market=" + abstractC32525mfI.OLrzqt);
            return new C2758AYc(listAhwBna);
        } catch (java.lang.Exception e) {
            pUU.AEQbTJ(abstractC32525mfI.AEQbTJ(), "execute: error - " + e.getMessage() + " for market=" + abstractC32525mfI.OLrzqt, e);
            java.lang.String message = e.getMessage();
            if (message == null) {
                message = "Unknown error";
            }
            throw new OkffiException.Exception(message);
        }
    }

    @Override // o.AYE
    public void copydefault() {
        pUU.KWHzl(AEQbTJ(), "cancel: task cancelled for market=" + this.OLrzqt);
    }

    public final AXZ OLrzqt(LanguageItem languageItem) {
        java.lang.String languageTag = languageItem.getLocale().toLanguageTag();
        Intrinsics.checkNotNullExpressionValue(languageTag, "");
        java.lang.String market = languageItem.getMarket();
        java.lang.String displayName = languageItem.getDisplayName();
        java.lang.String cefiDisplayName = languageItem.getCefiDisplayName();
        return new AXZ(languageTag, market, displayName, cefiDisplayName == null ? "" : cefiDisplayName, languageItem.getHideInCefiMode());
    }
}
