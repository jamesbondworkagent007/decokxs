package com.okinc.business.market.features.trader.domain.usecase;

import com.okinc.business.market.data.model.CompactTagData;
import com.okinc.business.market.data.model.traders.TradersData;
import com.okinc.business.market.features.tag.domain.TagWrapper;
import com.okinc.business.market.features.trader.domain.model.Traders;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C29712kyn;
import o.C29728kzC;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.pUU;
import o.yDY;

/* JADX INFO: renamed from: com.okinc.business.market.features.trader.domain.usecase.MapTraderUseCase$map-gIAlu-s$$inlined$dexRunCatching$1, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class MapTraderUseCase$mapgIAlus$$inlined$dexRunCatching$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends List<? extends Traders>>>, Object> {
    final /* synthetic */ List $fromList$inlined;
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    final /* synthetic */ C29728kzC this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapTraderUseCase$mapgIAlus$$inlined$dexRunCatching$1(Continuation continuation, List list, C29728kzC c29728kzC) {
        super(2, continuation);
        this.$fromList$inlined = list;
        this.this$0 = c29728kzC;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MapTraderUseCase$mapgIAlus$$inlined$dexRunCatching$1(continuation, this.$fromList$inlined, this.this$0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends List<? extends Traders>>> continuation) {
        return ((MapTraderUseCase$mapgIAlus$$inlined$dexRunCatching$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Duplicate block (B:17:0x006c) to fix multi-entry loop: BACK_EDGE: B:17:0x006c -> B:18:0x0085 */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0085, code lost:
    
        r4 = (com.okinc.business.market.data.model.traders.TradersData) r4;
        r5 = r4.djBIcL();
        r6 = new java.util.ArrayList();
        r13 = r1;
        r14 = r2;
        r15 = r3;
        r10 = r5.iterator();
        r8 = r6;
        r9 = r3 + 1;
        r7 = r14;
        r6 = r4;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0063 A[Catch: all -> 0x018f, CancellationException -> 0x01a6, TryCatch #2 {CancellationException -> 0x01a6, all -> 0x018f, blocks: (B:6:0x0029, B:24:0x00d6, B:27:0x00dd, B:29:0x00e1, B:18:0x0085, B:20:0x008b, B:31:0x00e8, B:36:0x0100, B:40:0x010b, B:44:0x0116, B:47:0x011d, B:51:0x0128, B:55:0x0133, B:59:0x013e, B:63:0x0149, B:67:0x0154, B:71:0x015f, B:75:0x016a, B:79:0x0175, B:12:0x005d, B:14:0x0063, B:16:0x0069, B:17:0x006c, B:80:0x0188, B:11:0x0049), top: B:88:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008b A[Catch: all -> 0x018f, CancellationException -> 0x01a6, TryCatch #2 {CancellationException -> 0x01a6, all -> 0x018f, blocks: (B:6:0x0029, B:24:0x00d6, B:27:0x00dd, B:29:0x00e1, B:18:0x0085, B:20:0x008b, B:31:0x00e8, B:36:0x0100, B:40:0x010b, B:44:0x0116, B:47:0x011d, B:51:0x0128, B:55:0x0133, B:59:0x013e, B:63:0x0149, B:67:0x0154, B:71:0x015f, B:75:0x016a, B:79:0x0175, B:12:0x005d, B:14:0x0063, B:16:0x0069, B:17:0x006c, B:80:0x0188, B:11:0x0049), top: B:88:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00e1 A[Catch: all -> 0x018f, CancellationException -> 0x01a6, TryCatch #2 {CancellationException -> 0x01a6, all -> 0x018f, blocks: (B:6:0x0029, B:24:0x00d6, B:27:0x00dd, B:29:0x00e1, B:18:0x0085, B:20:0x008b, B:31:0x00e8, B:36:0x0100, B:40:0x010b, B:44:0x0116, B:47:0x011d, B:51:0x0128, B:55:0x0133, B:59:0x013e, B:63:0x0149, B:67:0x0154, B:71:0x015f, B:75:0x016a, B:79:0x0175, B:12:0x005d, B:14:0x0063, B:16:0x0069, B:17:0x006c, B:80:0x0188, B:11:0x0049), top: B:88:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00e8 A[Catch: all -> 0x018f, CancellationException -> 0x01a6, TRY_LEAVE, TryCatch #2 {CancellationException -> 0x01a6, all -> 0x018f, blocks: (B:6:0x0029, B:24:0x00d6, B:27:0x00dd, B:29:0x00e1, B:18:0x0085, B:20:0x008b, B:31:0x00e8, B:36:0x0100, B:40:0x010b, B:44:0x0116, B:47:0x011d, B:51:0x0128, B:55:0x0133, B:59:0x013e, B:63:0x0149, B:67:0x0154, B:71:0x015f, B:75:0x016a, B:79:0x0175, B:12:0x005d, B:14:0x0063, B:16:0x0069, B:17:0x006c, B:80:0x0188, B:11:0x0049), top: B:88:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0188 A[Catch: all -> 0x018f, CancellationException -> 0x01a6, TRY_LEAVE, TryCatch #2 {CancellationException -> 0x01a6, all -> 0x018f, blocks: (B:6:0x0029, B:24:0x00d6, B:27:0x00dd, B:29:0x00e1, B:18:0x0085, B:20:0x008b, B:31:0x00e8, B:36:0x0100, B:40:0x010b, B:44:0x0116, B:47:0x011d, B:51:0x0128, B:55:0x0133, B:59:0x013e, B:63:0x0149, B:67:0x0154, B:71:0x015f, B:75:0x016a, B:79:0x0175, B:12:0x005d, B:14:0x0063, B:16:0x0069, B:17:0x006c, B:80:0x0188, B:11:0x0049), top: B:88:0x0009 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x00cf -> B:24:0x00d6). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Collection arrayList;
        Iterator it;
        int i;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = this.label;
        int i3 = 1;
        try {
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            pUU.AEQbTJ("DEX", "dexRunCatching", th);
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            Result.Application application2 = Result.Companion;
            List list = this.$fromList$inlined;
            arrayList = new ArrayList(C56403yEb.AYXKKw(list, 10));
            it = list.iterator();
            i = 0;
            if (it.hasNext()) {
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i4 = this.I$1;
            int i5 = this.I$0;
            Iterator it2 = (Iterator) this.L$5;
            Collection collection = (Collection) this.L$4;
            Collection collection2 = (Collection) this.L$3;
            TradersData tradersData = (TradersData) this.L$2;
            Iterator it3 = (Iterator) this.L$1;
            Collection collection3 = (Collection) this.L$0;
            C56391yDq.AEQbTJ(obj);
            Object objEZpvd = ((Result) obj).m7386unboximpl();
            int i6 = i4;
            int i7 = i5;
            Iterator it4 = it2;
            Iterator it5 = it3;
            Collection collection4 = collection3;
            Collection collection5 = collection;
            Collection collection6 = collection2;
            if (Result.m7383isFailureimpl(objEZpvd)) {
                objEZpvd = null;
            }
            TagWrapper tagWrapper = (TagWrapper) objEZpvd;
            if (tagWrapper != null) {
                collection5.add(tagWrapper);
            }
            int i8 = i7;
            i3 = 1;
            if (it4.hasNext()) {
                CompactTagData compactTagData = (CompactTagData) it4.next();
                C29712kyn c29712kyn = this.this$0.AEQbTJ;
                this.L$0 = collection4;
                this.L$1 = it5;
                this.L$2 = tradersData;
                this.L$3 = collection6;
                this.L$4 = collection5;
                this.L$5 = it4;
                this.I$0 = i8;
                this.I$1 = i6;
                this.label = i3;
                TradersData tradersData2 = tradersData;
                Collection collection7 = collection6;
                Collection collection8 = collection5;
                i7 = i8;
                Iterator it6 = it4;
                objEZpvd = c29712kyn.EZpvd(compactTagData, (62 & 2) != 0 ? null : null, (62 & 4) != 0 ? null : null, (62 & 8) != 0 ? null : null, (62 & 16) != 0 ? null : null, (62 & 32) != 0 ? null : null, this);
                if (objEZpvd == objCopydefault) {
                    return objCopydefault;
                }
                collection6 = collection7;
                collection5 = collection8;
                it4 = it6;
                tradersData = tradersData2;
                if (Result.m7383isFailureimpl(objEZpvd)) {
                }
                TagWrapper tagWrapper2 = (TagWrapper) objEZpvd;
                if (tagWrapper2 != null) {
                }
                int i82 = i7;
                i3 = 1;
                if (it4.hasNext()) {
                    TradersData tradersData3 = tradersData;
                    Collection collection9 = collection6;
                    int i9 = i82;
                    List list2 = (List) collection5;
                    String strCopydefault = tradersData3.copydefault();
                    String str = strCopydefault == null ? "" : strCopydefault;
                    String strAhwBna = tradersData3.AhwBna();
                    String str2 = strAhwBna == null ? "" : strAhwBna;
                    String strAEQbTJ = tradersData3.AEQbTJ();
                    String str3 = strAEQbTJ == null ? "" : strAEQbTJ;
                    String strOLrzqt = tradersData3.OLrzqt();
                    if (strOLrzqt == null) {
                        strOLrzqt = "";
                    }
                    String strGEmmrt = tradersData3.gEmmrt();
                    String str4 = strGEmmrt == null ? "" : strGEmmrt;
                    String strEZpvd = tradersData3.EZpvd();
                    String str5 = strEZpvd == null ? "" : strEZpvd;
                    String strValues = tradersData3.values();
                    String str6 = strValues == null ? "" : strValues;
                    String strAkhnZx = tradersData3.AkhnZx();
                    String str7 = strAkhnZx == null ? "" : strAkhnZx;
                    String strAYXKKw = tradersData3.AYXKKw();
                    String str8 = strAYXKKw == null ? "" : strAYXKKw;
                    String strValueOf = tradersData3.valueOf();
                    String str9 = strValueOf == null ? "" : strValueOf;
                    String strIsConnected = tradersData3.isConnected();
                    String str10 = strIsConnected == null ? "" : strIsConnected;
                    String strDbNXlk = tradersData3.DbNXlk();
                    collection9.add(new Traders(i6, str, str2, str3, str4, strOLrzqt, str6, str7, str8, str9, str10, strDbNXlk == null ? "" : strDbNXlk, str5, list2));
                    arrayList = collection4;
                    it = it5;
                    i = i9;
                    i3 = 1;
                    if (it.hasNext()) {
                        objM7377constructorimpl = Result.m7377constructorimpl((List) arrayList);
                        return Result.m7376boximpl(objM7377constructorimpl);
                    }
                    Object next = it.next();
                    if (i < 0) {
                        yDY.AYXKKw();
                        TradersData tradersData4 = (TradersData) next;
                        List<CompactTagData> listDjBIcL = tradersData4.djBIcL();
                        ArrayList arrayList2 = new ArrayList();
                        it5 = it;
                        collection4 = arrayList;
                        i6 = i;
                        it4 = listDjBIcL.iterator();
                        collection5 = arrayList2;
                        i82 = i + 1;
                        collection6 = collection4;
                        tradersData = tradersData4;
                    } else {
                        TradersData tradersData42 = (TradersData) next;
                        List<CompactTagData> listDjBIcL2 = tradersData42.djBIcL();
                        ArrayList arrayList22 = new ArrayList();
                        it5 = it;
                        collection4 = arrayList;
                        i6 = i;
                        it4 = listDjBIcL2.iterator();
                        collection5 = arrayList22;
                        i82 = i + 1;
                        collection6 = collection4;
                        tradersData = tradersData42;
                    }
                    if (it4.hasNext()) {
                    }
                }
            }
        }
    }
}
