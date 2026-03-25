package o;

import com.okinc.business.dex.trade.copytrading.edit.domain.usecase.GetCopyTradingCurrencyTokenListUseCase$invoke$1;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.dexlogic.bean.MemeCurrencyBean;
import com.okinc.business.dexlogic.main.limmitorder.bean.BizMode;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gSr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C19878gSr {
    public final kYE EZpvd;
    public final kKG copydefault;

    @yCM
    public C19878gSr(@NotNull kYE kye, @NotNull kKG kkg) {
        Intrinsics.checkNotNullParameter(kye, "");
        Intrinsics.checkNotNullParameter(kkg, "");
        this.EZpvd = kye;
        this.copydefault = kkg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [26=4] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ab A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c9 A[Catch: all -> 0x00dc, CancellationException -> 0x00ef, LOOP:0: B:36:0x00c3->B:38:0x00c9, LOOP_END, TryCatch #2 {CancellationException -> 0x00ef, all -> 0x00dc, blocks: (B:13:0x002c, B:35:0x00ac, B:36:0x00c3, B:38:0x00c9, B:39:0x00d7, B:18:0x0045, B:32:0x008e, B:21:0x0056, B:28:0x0077, B:24:0x0061), top: B:46:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(@NotNull java.lang.String str, @NotNull Continuation<? super Result<? extends java.util.List<DexMultiTokenInfoBean>>> continuation) throws java.lang.Throwable {
        GetCopyTradingCurrencyTokenListUseCase$invoke$1 getCopyTradingCurrencyTokenListUseCase$invoke$1;
        kYE kye;
        java.lang.Object objCopydefault;
        C19878gSr c19878gSr;
        java.lang.String str2;
        java.lang.String str3;
        kYE kye2;
        java.util.Iterator it;
        if (continuation instanceof GetCopyTradingCurrencyTokenListUseCase$invoke$1) {
            getCopyTradingCurrencyTokenListUseCase$invoke$1 = (GetCopyTradingCurrencyTokenListUseCase$invoke$1) continuation;
            int i = getCopyTradingCurrencyTokenListUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getCopyTradingCurrencyTokenListUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                getCopyTradingCurrencyTokenListUseCase$invoke$1 = new GetCopyTradingCurrencyTokenListUseCase$invoke$1(this, continuation);
            }
        }
        GetCopyTradingCurrencyTokenListUseCase$invoke$1 getCopyTradingCurrencyTokenListUseCase$invoke$12 = getCopyTradingCurrencyTokenListUseCase$invoke$1;
        java.lang.Object objOLrzqt = getCopyTradingCurrencyTokenListUseCase$invoke$12.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = getCopyTradingCurrencyTokenListUseCase$invoke$12.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objOLrzqt);
                Result.Application application = Result.Companion;
                kye = this.EZpvd;
                kKG kkg = this.copydefault;
                getCopyTradingCurrencyTokenListUseCase$invoke$12.L$0 = this;
                getCopyTradingCurrencyTokenListUseCase$invoke$12.L$1 = str;
                getCopyTradingCurrencyTokenListUseCase$invoke$12.L$2 = kye;
                getCopyTradingCurrencyTokenListUseCase$invoke$12.label = 1;
                objCopydefault = kkg.copydefault(getCopyTradingCurrencyTokenListUseCase$invoke$12);
                if (objCopydefault == objCopydefault2) {
                    return objCopydefault2;
                }
                c19878gSr = this;
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 != 3) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C56391yDq.AEQbTJ(objOLrzqt);
                        java.lang.Iterable iterable = (java.lang.Iterable) ((AbstractC43419rot) objOLrzqt).AEQbTJ();
                        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(iterable, 10));
                        it = iterable.iterator();
                        while (it.hasNext()) {
                            arrayList.add(((MemeCurrencyBean) it.next()).getCurrencyTokenInfo());
                        }
                        return Result.m7377constructorimpl(arrayList);
                    }
                    str3 = (java.lang.String) getCopyTradingCurrencyTokenListUseCase$invoke$12.L$2;
                    kye2 = (kYE) getCopyTradingCurrencyTokenListUseCase$invoke$12.L$1;
                    java.lang.String str4 = (java.lang.String) getCopyTradingCurrencyTokenListUseCase$invoke$12.L$0;
                    C56391yDq.AEQbTJ(objOLrzqt);
                    str2 = str4;
                    java.lang.Integer numAEQbTJ = C56443yFo.AEQbTJ(BizMode.COPY_TRADE.getValue());
                    getCopyTradingCurrencyTokenListUseCase$invoke$12.L$0 = null;
                    getCopyTradingCurrencyTokenListUseCase$invoke$12.L$1 = null;
                    getCopyTradingCurrencyTokenListUseCase$invoke$12.L$2 = null;
                    getCopyTradingCurrencyTokenListUseCase$invoke$12.label = 3;
                    objOLrzqt = kye2.OLrzqt(str3, (java.lang.String) objOLrzqt, numAEQbTJ, str2, getCopyTradingCurrencyTokenListUseCase$invoke$12);
                    if (objOLrzqt == objCopydefault2) {
                        return objCopydefault2;
                    }
                    java.lang.Iterable iterable2 = (java.lang.Iterable) ((AbstractC43419rot) objOLrzqt).AEQbTJ();
                    java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(iterable2, 10));
                    it = iterable2.iterator();
                    while (it.hasNext()) {
                    }
                    return Result.m7377constructorimpl(arrayList2);
                }
                kYE kye3 = (kYE) getCopyTradingCurrencyTokenListUseCase$invoke$12.L$2;
                java.lang.String str5 = (java.lang.String) getCopyTradingCurrencyTokenListUseCase$invoke$12.L$1;
                c19878gSr = (C19878gSr) getCopyTradingCurrencyTokenListUseCase$invoke$12.L$0;
                C56391yDq.AEQbTJ(objOLrzqt);
                kye = kye3;
                str = str5;
                objCopydefault = objOLrzqt;
            }
            java.lang.String str6 = (java.lang.String) objCopydefault;
            kKG kkg2 = c19878gSr.copydefault;
            getCopyTradingCurrencyTokenListUseCase$invoke$12.L$0 = str;
            getCopyTradingCurrencyTokenListUseCase$invoke$12.L$1 = kye;
            getCopyTradingCurrencyTokenListUseCase$invoke$12.L$2 = str6;
            getCopyTradingCurrencyTokenListUseCase$invoke$12.label = 2;
            java.lang.Object objAEQbTJ = kkg2.AEQbTJ(getCopyTradingCurrencyTokenListUseCase$invoke$12);
            if (objAEQbTJ == objCopydefault2) {
                return objCopydefault2;
            }
            str2 = str;
            str3 = str6;
            kye2 = kye;
            objOLrzqt = objAEQbTJ;
            java.lang.Integer numAEQbTJ2 = C56443yFo.AEQbTJ(BizMode.COPY_TRADE.getValue());
            getCopyTradingCurrencyTokenListUseCase$invoke$12.L$0 = null;
            getCopyTradingCurrencyTokenListUseCase$invoke$12.L$1 = null;
            getCopyTradingCurrencyTokenListUseCase$invoke$12.L$2 = null;
            getCopyTradingCurrencyTokenListUseCase$invoke$12.label = 3;
            objOLrzqt = kye2.OLrzqt(str3, (java.lang.String) objOLrzqt, numAEQbTJ2, str2, getCopyTradingCurrencyTokenListUseCase$invoke$12);
            if (objOLrzqt == objCopydefault2) {
            }
            java.lang.Iterable iterable22 = (java.lang.Iterable) ((AbstractC43419rot) objOLrzqt).AEQbTJ();
            java.util.ArrayList arrayList22 = new java.util.ArrayList(C56403yEb.AYXKKw(iterable22, 10));
            it = iterable22.iterator();
            while (it.hasNext()) {
            }
            return Result.m7377constructorimpl(arrayList22);
        } catch (CancellationException e) {
            throw e;
        } catch (java.lang.Throwable th) {
            pUU.AEQbTJ("DEX", "dexRunCatching", th);
            Result.Application application2 = Result.Companion;
            return Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
    }
}
