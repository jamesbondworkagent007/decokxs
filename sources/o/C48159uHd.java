package o;

import com.okinc.network.okg.cache.CacheStrategy;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.tradingbot.impl.balance.domain.FetchAccountGroupUseCase$execute$1;
import com.okinc.tradingbot.impl.balance.dto.AccountBalance;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import o.AbstractC43419rot;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.uHd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C48159uHd extends vNH<Application, ActionBar> {
    public final InterfaceC48160uHe AEQbTJ;
    public final CoroutineDispatcher EZpvd;
    public volatile java.util.ArrayList<AccountBalance> KWHzl;
    public volatile java.lang.Long copydefault;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C48159uHd(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull InterfaceC48160uHe interfaceC48160uHe) {
        super(coroutineDispatcher);
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(interfaceC48160uHe, "");
        this.EZpvd = coroutineDispatcher;
        this.AEQbTJ = interfaceC48160uHe;
    }

    /* JADX INFO: renamed from: o.uHd$Application */
    public static final class Application {
        public final CacheStrategy EZpvd;
        public final java.lang.String KWHzl;
        public final java.lang.String OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Application copy$default(Application application, java.lang.String str, java.lang.String str2, CacheStrategy cacheStrategy, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = application.KWHzl;
            }
            if ((i & 2) != 0) {
                str2 = application.OLrzqt;
            }
            if ((i & 4) != 0) {
                cacheStrategy = application.EZpvd;
            }
            return application.AEQbTJ(str, str2, cacheStrategy);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Application AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull CacheStrategy cacheStrategy) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(cacheStrategy, "");
            return new Application(str, str2, cacheStrategy);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final CacheStrategy KWHzl() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String OLrzqt() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String copydefault() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Application)) {
                return false;
            }
            Application application = (Application) obj;
            return Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) application.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) application.OLrzqt) && this.EZpvd == application.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((this.KWHzl.hashCode() * 31) + this.OLrzqt.hashCode()) * 31) + this.EZpvd.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Input(ordType=" + this.KWHzl + ", currencyId=" + this.OLrzqt + ", cacheStrategy=" + this.EZpvd + ")";
        }

        public Application(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull CacheStrategy cacheStrategy) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(cacheStrategy, "");
            this.KWHzl = str;
            this.OLrzqt = str2;
            this.EZpvd = cacheStrategy;
        }
    }

    /* JADX INFO: renamed from: o.uHd$ActionBar */
    public static final class ActionBar {
        public final java.util.ArrayList<AccountBalance> KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.uHd$ActionBar */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ActionBar copy$default(ActionBar actionBar, java.util.ArrayList arrayList, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                arrayList = actionBar.KWHzl;
            }
            return actionBar.EZpvd(arrayList);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ActionBar EZpvd(@NotNull java.util.ArrayList<AccountBalance> arrayList) {
            Intrinsics.checkNotNullParameter(arrayList, "");
            return new ActionBar(arrayList);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.ArrayList<AccountBalance> copydefault() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ActionBar) && Intrinsics.EZpvd(this.KWHzl, ((ActionBar) obj).KWHzl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.KWHzl.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Output(data=" + this.KWHzl + ")";
        }

        public ActionBar(@NotNull java.util.ArrayList<AccountBalance> arrayList) {
            Intrinsics.checkNotNullParameter(arrayList, "");
            this.KWHzl = arrayList;
        }
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a6 A[Catch: all -> 0x0031, TRY_LEAVE, TryCatch #0 {all -> 0x0031, blocks: (B:12:0x002d, B:30:0x008b, B:32:0x0093, B:34:0x0099, B:35:0x00a6), top: B:42:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.vNH
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object OLrzqt(@NotNull Application application, @NotNull Continuation<? super ActionBar> continuation) throws java.lang.Throwable {
        FetchAccountGroupUseCase$execute$1 fetchAccountGroupUseCase$execute$1;
        java.lang.Throwable th;
        C48159uHd c48159uHd;
        AbstractC43419rot actionBar;
        ResponseData responseData;
        if (continuation instanceof FetchAccountGroupUseCase$execute$1) {
            fetchAccountGroupUseCase$execute$1 = (FetchAccountGroupUseCase$execute$1) continuation;
            int i = fetchAccountGroupUseCase$execute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                fetchAccountGroupUseCase$execute$1.label = i - Integer.MIN_VALUE;
            } else {
                fetchAccountGroupUseCase$execute$1 = new FetchAccountGroupUseCase$execute$1(this, continuation);
            }
        }
        java.lang.Object objKWHzl = fetchAccountGroupUseCase$execute$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = fetchAccountGroupUseCase$execute$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objKWHzl);
            java.util.ArrayList<AccountBalance> arrayList = this.KWHzl;
            java.lang.Long l = this.copydefault;
            if (application.KWHzl() == CacheStrategy.NO_CACHE || arrayList == null || l == null || C33129mqd.AEQbTJ(C33129mqd.subS$default(C56443yFo.KWHzl(android.os.SystemClock.elapsedRealtime()), l, null, null, null, 14, null), C56443yFo.AEQbTJ(500))) {
                try {
                    InterfaceC48160uHe interfaceC48160uHe = this.AEQbTJ;
                    java.lang.String strOLrzqt = application.OLrzqt();
                    java.lang.String strCopydefault = application.copydefault();
                    fetchAccountGroupUseCase$execute$1.L$0 = this;
                    fetchAccountGroupUseCase$execute$1.label = 1;
                    objKWHzl = interfaceC48160uHe.KWHzl(strOLrzqt, strCopydefault, fetchAccountGroupUseCase$execute$1);
                    if (objKWHzl == objCopydefault) {
                        return objCopydefault;
                    }
                    c48159uHd = this;
                    responseData = (ResponseData) objKWHzl;
                    if (responseData.getCode() != 0) {
                        pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
                        actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
                    }
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    c48159uHd = this;
                    pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
                    actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
                }
            } else {
                return new ActionBar(arrayList);
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c48159uHd = (C48159uHd) fetchAccountGroupUseCase$execute$1.L$0;
            try {
                C56391yDq.AEQbTJ(objKWHzl);
                responseData = (ResponseData) objKWHzl;
                if (responseData.getCode() != 0 && responseData.getData() != null) {
                    java.lang.Object data = responseData.getData();
                    Intrinsics.copydefault(data);
                    actionBar = new AbstractC43419rot.StateListAnimator(data);
                } else {
                    pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
                    actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
                }
            } catch (java.lang.Throwable th3) {
                th = th3;
                pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
                actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
            }
        }
        java.util.ArrayList<AccountBalance> arrayList2 = new java.util.ArrayList<>((java.util.List) actionBar.AEQbTJ());
        c48159uHd.KWHzl = arrayList2;
        c48159uHd.copydefault = C56443yFo.KWHzl(android.os.SystemClock.elapsedRealtime());
        return new ActionBar(arrayList2);
    }
}
