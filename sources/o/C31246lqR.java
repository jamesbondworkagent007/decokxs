package o;

import com.okinc.business.web3pay.lib.features.contacts.RecentContactRepositoryImpl$deleteCache$1;
import com.okinc.business.web3pay.lib.features.contacts.RecentContactRepositoryImpl$getRecentContactList$$inlined$map$1$2$1;
import com.okinc.business.web3pay.lib.features.contacts.RecentContactRepositoryImpl$getRecentContactListByLatest$1;
import com.okinc.business.web3pay.lib.features.contacts.RecentContactRepositoryImpl$saveRecentContact$1;
import com.okinc.business.web3pay.lib.features.contacts.data.entity.Web3PayRecentContactEntity;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lqR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@yCR
public final class C31246lqR {
    public final InterfaceC31244lqP OLrzqt;
    public static final Activity Companion = new Activity(null);
    public static final int AEQbTJ = 8;

    /* JADX INFO: renamed from: o.lqR$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.lqR.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull java.lang.String str, int i, @NotNull Continuation<? super java.util.List<? extends AbstractC31317lrj>> continuation) throws java.lang.Throwable {
        RecentContactRepositoryImpl$getRecentContactListByLatest$1 recentContactRepositoryImpl$getRecentContactListByLatest$1;
        java.lang.Object objM7377constructorimpl;
        if (continuation instanceof RecentContactRepositoryImpl$getRecentContactListByLatest$1) {
            recentContactRepositoryImpl$getRecentContactListByLatest$1 = (RecentContactRepositoryImpl$getRecentContactListByLatest$1) continuation;
            int i2 = recentContactRepositoryImpl$getRecentContactListByLatest$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                recentContactRepositoryImpl$getRecentContactListByLatest$1.label = i2 - Integer.MIN_VALUE;
            } else {
                recentContactRepositoryImpl$getRecentContactListByLatest$1 = new RecentContactRepositoryImpl$getRecentContactListByLatest$1(this, continuation);
            }
        }
        java.lang.Object objAEQbTJ = recentContactRepositoryImpl$getRecentContactListByLatest$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i3 = recentContactRepositoryImpl$getRecentContactListByLatest$1.label;
        try {
            if (i3 == 0) {
                C56391yDq.AEQbTJ(objAEQbTJ);
                Result.Application application = Result.Companion;
                InterfaceC31244lqP interfaceC31244lqP = this.OLrzqt;
                recentContactRepositoryImpl$getRecentContactListByLatest$1.label = 1;
                objAEQbTJ = interfaceC31244lqP.AEQbTJ(str, i, recentContactRepositoryImpl$getRecentContactListByLatest$1);
                if (objAEQbTJ == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i3 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objAEQbTJ);
            }
            java.lang.Iterable iterable = (java.lang.Iterable) objAEQbTJ;
            java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(iterable, 10));
            java.util.Iterator it = iterable.iterator();
            while (it.hasNext()) {
                arrayList.add(AbstractC31317lrj.Companion.EZpvd((Web3PayRecentContactEntity) it.next()));
            }
            objM7377constructorimpl = Result.m7377constructorimpl(arrayList);
        } catch (CancellationException e) {
            throw e;
        } catch (java.lang.Throwable th) {
            pUU.AEQbTJ("Web3Pay", "suspendRunCatching", th);
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        return Result.m7380exceptionOrNullimpl(objM7377constructorimpl) == null ? objM7377constructorimpl : yDY.AhwBna();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull java.lang.String str, @NotNull AbstractC31317lrj abstractC31317lrj, int i, @NotNull Continuation<? super Result<Unit>> continuation) {
        RecentContactRepositoryImpl$saveRecentContact$1 recentContactRepositoryImpl$saveRecentContact$1;
        if (continuation instanceof RecentContactRepositoryImpl$saveRecentContact$1) {
            recentContactRepositoryImpl$saveRecentContact$1 = (RecentContactRepositoryImpl$saveRecentContact$1) continuation;
            int i2 = recentContactRepositoryImpl$saveRecentContact$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                recentContactRepositoryImpl$saveRecentContact$1.label = i2 - Integer.MIN_VALUE;
            } else {
                recentContactRepositoryImpl$saveRecentContact$1 = new RecentContactRepositoryImpl$saveRecentContact$1(this, continuation);
            }
        }
        java.lang.Object obj = recentContactRepositoryImpl$saveRecentContact$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i3 = recentContactRepositoryImpl$saveRecentContact$1.label;
        try {
            if (i3 == 0) {
                C56391yDq.AEQbTJ(obj);
                Result.Application application = Result.Companion;
                InterfaceC31244lqP interfaceC31244lqP = this.OLrzqt;
                Web3PayRecentContactEntity web3PayRecentContactEntityEZpvd = abstractC31317lrj.EZpvd(str);
                recentContactRepositoryImpl$saveRecentContact$1.label = 1;
                if (interfaceC31244lqP.copydefault(web3PayRecentContactEntityEZpvd, i, recentContactRepositoryImpl$saveRecentContact$1) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i3 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            return Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (CancellationException e) {
            throw e;
        } catch (java.lang.Throwable th) {
            pUU.AEQbTJ("Web3Pay", "suspendRunCatching", th);
            Result.Application application2 = Result.Companion;
            return Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
    }

    /* JADX INFO: renamed from: o.lqR$TaskDescription */
    public static final class TaskDescription implements Flow<java.util.List<? extends AbstractC31317lrj>> {
        public final /* synthetic */ Flow copydefault;

        /* JADX INFO: renamed from: o.lqR$TaskDescription$3, reason: invalid class name */
        public static final class AnonymousClass3<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector KWHzl;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass3(FlowCollector flowCollector) {
                this.KWHzl = flowCollector;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(java.lang.Object obj, Continuation continuation) throws java.lang.Throwable {
                RecentContactRepositoryImpl$getRecentContactList$$inlined$map$1$2$1 recentContactRepositoryImpl$getRecentContactList$$inlined$map$1$2$1;
                if (continuation instanceof RecentContactRepositoryImpl$getRecentContactList$$inlined$map$1$2$1) {
                    recentContactRepositoryImpl$getRecentContactList$$inlined$map$1$2$1 = (RecentContactRepositoryImpl$getRecentContactList$$inlined$map$1$2$1) continuation;
                    int i = recentContactRepositoryImpl$getRecentContactList$$inlined$map$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        recentContactRepositoryImpl$getRecentContactList$$inlined$map$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        recentContactRepositoryImpl$getRecentContactList$$inlined$map$1$2$1 = new RecentContactRepositoryImpl$getRecentContactList$$inlined$map$1$2$1(this, continuation);
                    }
                }
                java.lang.Object obj2 = recentContactRepositoryImpl$getRecentContactList$$inlined$map$1$2$1.result;
                java.lang.Object objCopydefault = C56442yFn.copydefault();
                int i2 = recentContactRepositoryImpl$getRecentContactList$$inlined$map$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.KWHzl;
                    java.util.List list = (java.util.List) obj;
                    java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
                    java.util.Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(AbstractC31317lrj.Companion.EZpvd((Web3PayRecentContactEntity) it.next()));
                    }
                    recentContactRepositoryImpl$getRecentContactList$$inlined$map$1$2$1.label = 1;
                    if (flowCollector.emit(arrayList, recentContactRepositoryImpl$getRecentContactList$$inlined$map$1$2$1) == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    if (i2 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj2);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(FlowCollector<? super java.util.List<? extends AbstractC31317lrj>> flowCollector, Continuation continuation) {
            java.lang.Object objCollect = this.copydefault.collect(new AnonymousClass3(flowCollector), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull Continuation<? super Result<Unit>> continuation) {
        RecentContactRepositoryImpl$deleteCache$1 recentContactRepositoryImpl$deleteCache$1;
        if (continuation instanceof RecentContactRepositoryImpl$deleteCache$1) {
            recentContactRepositoryImpl$deleteCache$1 = (RecentContactRepositoryImpl$deleteCache$1) continuation;
            int i = recentContactRepositoryImpl$deleteCache$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                recentContactRepositoryImpl$deleteCache$1.label = i - Integer.MIN_VALUE;
            } else {
                recentContactRepositoryImpl$deleteCache$1 = new RecentContactRepositoryImpl$deleteCache$1(this, continuation);
            }
        }
        java.lang.Object obj = recentContactRepositoryImpl$deleteCache$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = recentContactRepositoryImpl$deleteCache$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(obj);
                Result.Application application = Result.Companion;
                InterfaceC31244lqP interfaceC31244lqP = this.OLrzqt;
                recentContactRepositoryImpl$deleteCache$1.label = 1;
                if (interfaceC31244lqP.AEQbTJ(recentContactRepositoryImpl$deleteCache$1) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            return Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (CancellationException e) {
            throw e;
        } catch (java.lang.Throwable th) {
            pUU.AEQbTJ("Web3Pay", "suspendRunCatching", th);
            Result.Application application2 = Result.Companion;
            return Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
    }
}
