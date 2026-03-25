package o;

import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.tradingbot.impl.botDetail.domain.usecase.FetchBotDetailEventHistoryUseCase$execute$1;
import com.okinc.tradingbot.impl.dto.GridEventHistoryDto;
import com.okinc.tradingbot.impl.dto.HistoryEventsDto;
import com.okinc.tradingbot.impl.dto.RecurringEventHistoryDto;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import o.AbstractC43419rot;
import o.InterfaceC50055vAf;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class uHA extends vNH<Activity, java.util.List<? extends HistoryEventsDto>> {
    public final InterfaceC50055vAf EZpvd;
    public final CoroutineDispatcher copydefault;

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, kotlin.coroutines.Continuation] */
    @Override // o.vNH
    public /* synthetic */ java.lang.Object OLrzqt(Activity activity, Continuation<? super java.util.List<? extends HistoryEventsDto>> continuation) {
        return KWHzl(activity, (Continuation<? super java.util.List<HistoryEventsDto>>) continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @yCM
    public uHA(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull InterfaceC50055vAf interfaceC50055vAf) {
        super(coroutineDispatcher);
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(interfaceC50055vAf, "");
        this.copydefault = coroutineDispatcher;
        this.EZpvd = interfaceC50055vAf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [25=5] */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x033b, code lost:
    
        if (r0.equals("spot_dca") == false) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x033f, code lost:
    
        r3 = r21.EZpvd;
        r8.label = 3;
        r0 = r3.AEQbTJ(r10, r0, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0347, code lost:
    
        if (r0 != r2) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0349, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0132, code lost:
    
        if (r0.equals("grid") == false) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x013c, code lost:
    
        if (r0.equals("contract_grid") == false) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0140, code lost:
    
        r3 = r21.EZpvd;
        r8.label = 2;
        r0 = r3.valueOf(r10, r0, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0148, code lost:
    
        if (r0 != r2) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x014a, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x028c, code lost:
    
        if (r0.equals("contract_dca") == false) goto L141;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02c0 A[Catch: all -> 0x02ef, TRY_LEAVE, TryCatch #5 {all -> 0x02ef, blocks: (B:15:0x003c, B:107:0x02a5, B:109:0x02ad, B:111:0x02b3, B:112:0x02c0, B:104:0x029a), top: B:145:0x0030 }] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0324 A[LOOP:0: B:117:0x031e->B:119:0x0324, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00af A[Catch: all -> 0x00de, TRY_LEAVE, TryCatch #4 {all -> 0x00de, blocks: (B:19:0x0049, B:39:0x0094, B:41:0x009c, B:43:0x00a2, B:44:0x00af, B:36:0x0081), top: B:145:0x0030 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0113 A[LOOP:1: B:49:0x010d->B:51:0x0113, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x020b A[Catch: all -> 0x0060, TRY_LEAVE, TryCatch #0 {all -> 0x0060, blocks: (B:26:0x005b, B:82:0x01f0, B:84:0x01f8, B:86:0x01fe, B:87:0x020b), top: B:144:0x005b }] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x026b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull Activity activity, @NotNull Continuation<? super java.util.List<HistoryEventsDto>> continuation) throws java.lang.Throwable {
        FetchBotDetailEventHistoryUseCase$execute$1 fetchBotDetailEventHistoryUseCase$execute$1;
        AbstractC43419rot actionBar;
        AbstractC43419rot actionBar2;
        AbstractC43419rot actionBar3;
        AbstractC43419rot actionBar4;
        java.util.ArrayList arrayList;
        java.util.List<HistoryEventsDto> listEZpvd;
        java.util.Iterator it;
        java.util.Iterator it2;
        java.lang.String strCopydefault;
        java.lang.String str;
        AbstractC43419rot actionBar5;
        ResponseData responseData;
        ResponseData responseData2;
        ResponseData responseData3;
        if (continuation instanceof FetchBotDetailEventHistoryUseCase$execute$1) {
            fetchBotDetailEventHistoryUseCase$execute$1 = (FetchBotDetailEventHistoryUseCase$execute$1) continuation;
            int i = fetchBotDetailEventHistoryUseCase$execute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                fetchBotDetailEventHistoryUseCase$execute$1.label = i - Integer.MIN_VALUE;
            } else {
                fetchBotDetailEventHistoryUseCase$execute$1 = new FetchBotDetailEventHistoryUseCase$execute$1(this, continuation);
            }
        }
        FetchBotDetailEventHistoryUseCase$execute$1 fetchBotDetailEventHistoryUseCase$execute$12 = fetchBotDetailEventHistoryUseCase$execute$1;
        java.lang.Object objEZpvd = fetchBotDetailEventHistoryUseCase$execute$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = fetchBotDetailEventHistoryUseCase$execute$12.label;
        try {
            try {
                try {
                    try {
                    } catch (java.lang.Throwable th) {
                        pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
                        actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
                    }
                } catch (java.lang.Throwable th2) {
                    pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th2);
                    actionBar2 = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th2));
                }
            } catch (java.lang.Throwable th3) {
                pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th3);
                actionBar3 = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th3));
            }
        } catch (java.lang.Throwable th4) {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th4);
            actionBar4 = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th4));
        }
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objEZpvd);
            strCopydefault = activity.copydefault();
            java.lang.String strAEQbTJ = activity.AEQbTJ();
            switch (strAEQbTJ.hashCode()) {
                case -1831183611:
                    break;
                case -1418042064:
                    if (strAEQbTJ.equals("ai_bot")) {
                        InterfaceC50055vAf interfaceC50055vAf = this.EZpvd;
                        fetchBotDetailEventHistoryUseCase$execute$12.label = 5;
                        objEZpvd = interfaceC50055vAf.EZpvd(strCopydefault, strAEQbTJ, fetchBotDetailEventHistoryUseCase$execute$12);
                        if (objEZpvd == objCopydefault) {
                            return objCopydefault;
                        }
                        responseData3 = (ResponseData) objEZpvd;
                        if (responseData3.getCode() == 0) {
                            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData3);
                            actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData3.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData3), C43401rob.EZpvd(responseData3), null, 8, null));
                            java.lang.Iterable iterable = (java.lang.Iterable) actionBar.AEQbTJ();
                            arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(iterable, 10));
                            it2 = iterable.iterator();
                            while (it2.hasNext()) {
                            }
                            listEZpvd = arrayList;
                            break;
                        }
                    }
                    listEZpvd = yDY.AhwBna();
                    break;
                case -1402017003:
                    break;
                case -557961837:
                    if (strAEQbTJ.equals("smart_arbitrage")) {
                        try {
                            InterfaceC50055vAf interfaceC50055vAf2 = this.EZpvd;
                            fetchBotDetailEventHistoryUseCase$execute$12.L$0 = strCopydefault;
                            fetchBotDetailEventHistoryUseCase$execute$12.label = 1;
                            objEZpvd = interfaceC50055vAf2.OLrzqt(strCopydefault, fetchBotDetailEventHistoryUseCase$execute$12);
                        } catch (java.lang.Throwable th5) {
                            th = th5;
                            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
                            actionBar5 = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
                            str = strCopydefault;
                        }
                        if (objEZpvd == objCopydefault) {
                            return objCopydefault;
                        }
                        str = strCopydefault;
                        responseData = (ResponseData) objEZpvd;
                        if (responseData.getCode() == 0) {
                            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
                            actionBar5 = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
                            listEZpvd = (java.util.List) actionBar5.AEQbTJ();
                            while (r3.hasNext()) {
                            }
                            break;
                        }
                    }
                    listEZpvd = yDY.AhwBna();
                    break;
                case -512749997:
                    break;
                case 3181382:
                    break;
                case 1165749981:
                    if (strAEQbTJ.equals("recurring")) {
                        InterfaceC50055vAf interfaceC50055vAf3 = this.EZpvd;
                        fetchBotDetailEventHistoryUseCase$execute$12.label = 4;
                        objEZpvd = InterfaceC50055vAf.ActionBar.fetchRecurringHistoryEvents$default(interfaceC50055vAf3, strCopydefault, null, null, null, fetchBotDetailEventHistoryUseCase$execute$12, 14, null);
                        if (objEZpvd == objCopydefault) {
                            return objCopydefault;
                        }
                        responseData2 = (ResponseData) objEZpvd;
                        if (responseData2.getCode() == 0) {
                            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData2);
                            actionBar2 = new AbstractC43419rot.ActionBar(new OKServerException(responseData2.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData2), C43401rob.EZpvd(responseData2), null, 8, null));
                            java.util.List list = (java.util.List) actionBar2.AEQbTJ();
                            java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
                            it = list.iterator();
                            while (it.hasNext()) {
                            }
                            listEZpvd = CollectionsKt___CollectionsKt.EZpvd(arrayList2, new TaskDescription());
                            break;
                        }
                    }
                    listEZpvd = yDY.AhwBna();
                    break;
                default:
                    listEZpvd = yDY.AhwBna();
                    break;
            }
        } else if (i2 == 1) {
            str = (java.lang.String) fetchBotDetailEventHistoryUseCase$execute$12.L$0;
            try {
                C56391yDq.AEQbTJ(objEZpvd);
                responseData = (ResponseData) objEZpvd;
                if (responseData.getCode() == 0 || responseData.getData() == null) {
                    pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
                    actionBar5 = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
                } else {
                    java.lang.Object data = responseData.getData();
                    Intrinsics.copydefault(data);
                    actionBar5 = new AbstractC43419rot.StateListAnimator(data);
                }
            } catch (java.lang.Throwable th6) {
                th = th6;
                strCopydefault = str;
                pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
                actionBar5 = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
                str = strCopydefault;
            }
            listEZpvd = (java.util.List) actionBar5.AEQbTJ();
            for (HistoryEventsDto historyEventsDto : listEZpvd) {
                if (!historyEventsDto.AhwBna().isEmpty()) {
                    historyEventsDto.AhwBna().put("algoId", str);
                }
            }
        } else if (i2 == 2) {
            C56391yDq.AEQbTJ(objEZpvd);
            ResponseData responseData4 = (ResponseData) objEZpvd;
            if (responseData4.getCode() != 0 || responseData4.getData() == null) {
                pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData4);
                actionBar3 = new AbstractC43419rot.ActionBar(new OKServerException(responseData4.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData4), C43401rob.EZpvd(responseData4), null, 8, null));
            } else {
                java.lang.Object data2 = responseData4.getData();
                Intrinsics.copydefault(data2);
                actionBar3 = new AbstractC43419rot.StateListAnimator(data2);
            }
            java.util.List list2 = (java.util.List) actionBar3.AEQbTJ();
            arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list2, 10));
            java.util.Iterator it3 = list2.iterator();
            while (it3.hasNext()) {
                arrayList.add(((GridEventHistoryDto) it3.next()).AEQbTJ());
            }
            listEZpvd = arrayList;
        } else if (i2 == 3) {
            C56391yDq.AEQbTJ(objEZpvd);
            ResponseData responseData5 = (ResponseData) objEZpvd;
            if (responseData5.getCode() != 0 || responseData5.getData() == null) {
                pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData5);
                actionBar4 = new AbstractC43419rot.ActionBar(new OKServerException(responseData5.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData5), C43401rob.EZpvd(responseData5), null, 8, null));
            } else {
                java.lang.Object data3 = responseData5.getData();
                Intrinsics.copydefault(data3);
                actionBar4 = new AbstractC43419rot.StateListAnimator(data3);
            }
            java.util.List list3 = (java.util.List) actionBar4.AEQbTJ();
            java.util.ArrayList arrayList3 = new java.util.ArrayList(C56403yEb.AYXKKw(list3, 10));
            java.util.Iterator it4 = list3.iterator();
            while (it4.hasNext()) {
                arrayList3.add(((GridEventHistoryDto) it4.next()).AEQbTJ());
            }
            listEZpvd = CollectionsKt___CollectionsKt.EZpvd(arrayList3, new StateListAnimator());
        } else if (i2 == 4) {
            C56391yDq.AEQbTJ(objEZpvd);
            responseData2 = (ResponseData) objEZpvd;
            if (responseData2.getCode() == 0 || responseData2.getData() == null) {
                pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData2);
                actionBar2 = new AbstractC43419rot.ActionBar(new OKServerException(responseData2.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData2), C43401rob.EZpvd(responseData2), null, 8, null));
            } else {
                java.lang.Object data4 = responseData2.getData();
                Intrinsics.copydefault(data4);
                actionBar2 = new AbstractC43419rot.StateListAnimator(data4);
            }
            java.util.List list4 = (java.util.List) actionBar2.AEQbTJ();
            java.util.ArrayList arrayList22 = new java.util.ArrayList(C56403yEb.AYXKKw(list4, 10));
            it = list4.iterator();
            while (it.hasNext()) {
                arrayList22.add(((RecurringEventHistoryDto) it.next()).toHistoryEventsDto());
            }
            listEZpvd = CollectionsKt___CollectionsKt.EZpvd(arrayList22, new TaskDescription());
        } else {
            if (i2 != 5) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objEZpvd);
            responseData3 = (ResponseData) objEZpvd;
            if (responseData3.getCode() == 0 || responseData3.getData() == null) {
                pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData3);
                actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData3.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData3), C43401rob.EZpvd(responseData3), null, 8, null));
            } else {
                java.lang.Object data5 = responseData3.getData();
                Intrinsics.copydefault(data5);
                actionBar = new AbstractC43419rot.StateListAnimator(data5);
            }
            java.lang.Iterable iterable2 = (java.lang.Iterable) actionBar.AEQbTJ();
            arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(iterable2, 10));
            it2 = iterable2.iterator();
            while (it2.hasNext()) {
                arrayList.add(((GridEventHistoryDto) it2.next()).AEQbTJ());
            }
            listEZpvd = arrayList;
        }
        return CollectionsKt___CollectionsKt.EZpvd(listEZpvd, new ActionBar());
    }

    public static final class Activity {
        public final java.lang.String EZpvd;
        public final java.lang.String KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Activity copy$default(Activity activity, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = activity.KWHzl;
            }
            if ((i & 2) != 0) {
                str2 = activity.EZpvd;
            }
            return activity.EZpvd(str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AEQbTJ() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Activity EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            return new Activity(str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String copydefault() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Activity)) {
                return false;
            }
            Activity activity = (Activity) obj;
            return Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) activity.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) activity.EZpvd);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (this.KWHzl.hashCode() * 31) + this.EZpvd.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Input(algoId=" + this.KWHzl + ", orderType=" + this.EZpvd + ")";
        }

        public Activity(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.KWHzl = str;
            this.EZpvd = str2;
        }
    }

    public static final class ActionBar<T> implements java.util.Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return yET.KWHzl(java.lang.Long.valueOf(((HistoryEventsDto) t2).KWHzl()), java.lang.Long.valueOf(((HistoryEventsDto) t).KWHzl()));
        }
    }

    public static final class StateListAnimator<T> implements java.util.Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return yET.KWHzl(((HistoryEventsDto) t2).copydefault(), ((HistoryEventsDto) t).copydefault());
        }
    }

    public static final class TaskDescription<T> implements java.util.Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return yET.KWHzl(((HistoryEventsDto) t2).copydefault(), ((HistoryEventsDto) t).copydefault());
        }
    }
}
