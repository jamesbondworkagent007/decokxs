package o;

import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.tradingbot.impl.planet.domain.GetOngoingBotsUseCase$execute$1;
import com.okinc.tradingbot.impl.planet.domain.GetOngoingBotsUseCase$execute$bots$1;
import com.okinc.tradingbot.impl.planet.dto.BotDto;
import com.okinc.tradingbot.impl.planet.model.BotUiState;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import o.AbstractC43419rot;
import o.InterfaceC50055vAf;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wpk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C53664wpk extends vNH<TaskDescription, ActionBar> {
    public static final Activity Companion = new Activity(null);
    public static final int EZpvd = 8;
    public final C53673wpt AEQbTJ;
    public final InterfaceC50055vAf KWHzl;
    public final CoroutineDispatcher OLrzqt;
    public final CoroutineDispatcher copydefault;
    public final C53672wps djBIcL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @yCM
    public C53664wpk(@NotNull InterfaceC50055vAf interfaceC50055vAf, @NotNull C53673wpt c53673wpt, @NotNull C53672wps c53672wps, @NotNull CoroutineDispatcher coroutineDispatcher, @NotNull CoroutineDispatcher coroutineDispatcher2) {
        super(coroutineDispatcher);
        Intrinsics.checkNotNullParameter(interfaceC50055vAf, "");
        Intrinsics.checkNotNullParameter(c53673wpt, "");
        Intrinsics.checkNotNullParameter(c53672wps, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher2, "");
        this.KWHzl = interfaceC50055vAf;
        this.AEQbTJ = c53673wpt;
        this.djBIcL = c53672wps;
        this.copydefault = coroutineDispatcher;
        this.OLrzqt = coroutineDispatcher2;
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
    /* JADX DEBUG: Multi-variable search result rejected for r9v2, resolved type: java.lang.String */
    /* JADX DEBUG: Multi-variable search result rejected for r9v3, resolved type: java.lang.String */
    /* JADX DEBUG: Multi-variable search result rejected for r9v5, resolved type: java.lang.String */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b0 A[Catch: all -> 0x00e2, TRY_LEAVE, TryCatch #0 {all -> 0x00e2, blocks: (B:29:0x0095, B:31:0x009d, B:33:0x00a3, B:34:0x00b0), top: B:67:0x0095 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0122 A[LOOP:0: B:45:0x011c->B:47:0x0122, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0148 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x015e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // o.vNH
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object OLrzqt(@NotNull TaskDescription taskDescription, @NotNull Continuation<? super ActionBar> continuation) throws java.lang.Throwable {
        GetOngoingBotsUseCase$execute$1 getOngoingBotsUseCase$execute$1;
        boolean z;
        Continuation continuation2;
        int i;
        C53664wpk c53664wpk;
        InterfaceC50055vAf interfaceC50055vAf;
        java.lang.Integer numAEQbTJ;
        java.lang.String strKWHzl;
        AbstractC43419rot actionBar;
        java.util.List list;
        java.util.Iterator it;
        java.util.List listAxsJAYsNCnLh;
        C53673wpt c53673wpt;
        C53664wpk c53664wpk2;
        ResponseData responseData;
        java.lang.Object objWithContext;
        java.util.List list2;
        if (continuation instanceof GetOngoingBotsUseCase$execute$1) {
            getOngoingBotsUseCase$execute$1 = (GetOngoingBotsUseCase$execute$1) continuation;
            int i2 = getOngoingBotsUseCase$execute$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                getOngoingBotsUseCase$execute$1.label = i2 - Integer.MIN_VALUE;
            } else {
                getOngoingBotsUseCase$execute$1 = new GetOngoingBotsUseCase$execute$1(this, continuation);
            }
        }
        java.lang.Object ongoingBotsForShare$default = getOngoingBotsUseCase$execute$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i3 = getOngoingBotsUseCase$execute$1.label;
        if (i3 == 0) {
            C56391yDq.AEQbTJ(ongoingBotsForShare$default);
            try {
                interfaceC50055vAf = this.KWHzl;
                numAEQbTJ = C56443yFo.AEQbTJ(15);
                strKWHzl = taskDescription.KWHzl();
                getOngoingBotsUseCase$execute$1.L$0 = this;
                getOngoingBotsUseCase$execute$1.label = 1;
                z = true;
                continuation2 = null;
                i = 2;
            } catch (java.lang.Throwable th) {
                th = th;
                z = true;
                continuation2 = null;
                i = 2;
            }
            try {
                ongoingBotsForShare$default = InterfaceC50055vAf.ActionBar.getOngoingBotsForShare$default(interfaceC50055vAf, numAEQbTJ, strKWHzl, true, null, getOngoingBotsUseCase$execute$1, 8, null);
            } catch (java.lang.Throwable th2) {
                th = th2;
                c53664wpk = this;
                pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
                actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
                list = (java.util.List) actionBar.AEQbTJ();
                java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
                it = list.iterator();
                while (it.hasNext()) {
                }
                listAxsJAYsNCnLh = CollectionsKt___CollectionsKt.AxsJAYsNCnLh(CollectionsKt___CollectionsKt.OqFWZa(arrayList));
                c53673wpt = c53664wpk.AEQbTJ;
                getOngoingBotsUseCase$execute$1.L$0 = c53664wpk;
                getOngoingBotsUseCase$execute$1.L$1 = list;
                getOngoingBotsUseCase$execute$1.label = i;
                if (c53673wpt.KWHzl(listAxsJAYsNCnLh, (Continuation) getOngoingBotsUseCase$execute$1) != objCopydefault) {
                }
            }
            if (ongoingBotsForShare$default == objCopydefault) {
                return objCopydefault;
            }
            c53664wpk = this;
            responseData = (ResponseData) ongoingBotsForShare$default;
            if (responseData.getCode() != 0) {
                pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
                actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
                list = (java.util.List) actionBar.AEQbTJ();
                java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
                it = list.iterator();
                while (it.hasNext()) {
                }
                listAxsJAYsNCnLh = CollectionsKt___CollectionsKt.AxsJAYsNCnLh(CollectionsKt___CollectionsKt.OqFWZa(arrayList2));
                c53673wpt = c53664wpk.AEQbTJ;
                getOngoingBotsUseCase$execute$1.L$0 = c53664wpk;
                getOngoingBotsUseCase$execute$1.L$1 = list;
                getOngoingBotsUseCase$execute$1.label = i;
                if (c53673wpt.KWHzl(listAxsJAYsNCnLh, (Continuation) getOngoingBotsUseCase$execute$1) != objCopydefault) {
                }
            }
        } else if (i3 == 1) {
            c53664wpk = (C53664wpk) getOngoingBotsUseCase$execute$1.L$0;
            try {
                C56391yDq.AEQbTJ(ongoingBotsForShare$default);
                z = true;
                continuation2 = null;
                i = 2;
            } catch (java.lang.Throwable th3) {
                th = th3;
                z = true;
                continuation2 = null;
                i = 2;
                pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
                actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
                list = (java.util.List) actionBar.AEQbTJ();
                java.util.ArrayList arrayList22 = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
                it = list.iterator();
                while (it.hasNext()) {
                }
                listAxsJAYsNCnLh = CollectionsKt___CollectionsKt.AxsJAYsNCnLh(CollectionsKt___CollectionsKt.OqFWZa(arrayList22));
                c53673wpt = c53664wpk.AEQbTJ;
                getOngoingBotsUseCase$execute$1.L$0 = c53664wpk;
                getOngoingBotsUseCase$execute$1.L$1 = list;
                getOngoingBotsUseCase$execute$1.label = i;
                if (c53673wpt.KWHzl(listAxsJAYsNCnLh, (Continuation) getOngoingBotsUseCase$execute$1) != objCopydefault) {
                }
            }
            try {
                responseData = (ResponseData) ongoingBotsForShare$default;
                if (responseData.getCode() != 0 && responseData.getData() != null) {
                    java.lang.Object data = responseData.getData();
                    Intrinsics.copydefault(data);
                    actionBar = new AbstractC43419rot.StateListAnimator(data);
                } else {
                    pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
                    actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
                }
            } catch (java.lang.Throwable th4) {
                th = th4;
                pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
                actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
            }
            list = (java.util.List) actionBar.AEQbTJ();
            java.util.ArrayList arrayList222 = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
            it = list.iterator();
            while (it.hasNext()) {
                arrayList222.add(((BotDto) it.next()).djBIcL());
            }
            listAxsJAYsNCnLh = CollectionsKt___CollectionsKt.AxsJAYsNCnLh(CollectionsKt___CollectionsKt.OqFWZa(arrayList222));
            c53673wpt = c53664wpk.AEQbTJ;
            getOngoingBotsUseCase$execute$1.L$0 = c53664wpk;
            getOngoingBotsUseCase$execute$1.L$1 = list;
            getOngoingBotsUseCase$execute$1.label = i;
            if (c53673wpt.KWHzl(listAxsJAYsNCnLh, (Continuation) getOngoingBotsUseCase$execute$1) != objCopydefault) {
                return objCopydefault;
            }
            c53664wpk2 = c53664wpk;
            CoroutineDispatcher coroutineDispatcher = c53664wpk2.OLrzqt;
            GetOngoingBotsUseCase$execute$bots$1 getOngoingBotsUseCase$execute$bots$1 = new GetOngoingBotsUseCase$execute$bots$1(list, c53664wpk2, continuation2);
            getOngoingBotsUseCase$execute$1.L$0 = list;
            getOngoingBotsUseCase$execute$1.L$1 = continuation2;
            getOngoingBotsUseCase$execute$1.label = 3;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, getOngoingBotsUseCase$execute$bots$1, getOngoingBotsUseCase$execute$1);
            if (objWithContext != objCopydefault) {
            }
        } else if (i3 == 2) {
            java.util.List list3 = (java.util.List) getOngoingBotsUseCase$execute$1.L$1;
            c53664wpk2 = (C53664wpk) getOngoingBotsUseCase$execute$1.L$0;
            C56391yDq.AEQbTJ(ongoingBotsForShare$default);
            list = list3;
            z = true;
            continuation2 = null;
            CoroutineDispatcher coroutineDispatcher2 = c53664wpk2.OLrzqt;
            GetOngoingBotsUseCase$execute$bots$1 getOngoingBotsUseCase$execute$bots$12 = new GetOngoingBotsUseCase$execute$bots$1(list, c53664wpk2, continuation2);
            getOngoingBotsUseCase$execute$1.L$0 = list;
            getOngoingBotsUseCase$execute$1.L$1 = continuation2;
            getOngoingBotsUseCase$execute$1.label = 3;
            objWithContext = BuildersKt.withContext(coroutineDispatcher2, getOngoingBotsUseCase$execute$bots$12, getOngoingBotsUseCase$execute$1);
            if (objWithContext != objCopydefault) {
                return objCopydefault;
            }
            list2 = list;
            ongoingBotsForShare$default = objWithContext;
        } else {
            if (i3 != 3) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            list2 = (java.util.List) getOngoingBotsUseCase$execute$1.L$0;
            C56391yDq.AEQbTJ(ongoingBotsForShare$default);
            z = true;
            continuation2 = null;
        }
        java.util.List list4 = (java.util.List) ongoingBotsForShare$default;
        boolean z2 = list2.size() >= 15 ? z : false;
        BotDto botDto = (BotDto) CollectionsKt___CollectionsKt.wlaJM(list2);
        return new ActionBar(z2, botDto != null ? botDto.EZpvd() : continuation2, list4);
    }

    /* JADX INFO: renamed from: o.wpk$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.wpk.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    /* JADX INFO: renamed from: o.wpk$TaskDescription */
    public static final class TaskDescription {
        public final java.lang.String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = taskDescription.copydefault;
            }
            return taskDescription.EZpvd(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaskDescription EZpvd(java.lang.String str) {
            return new TaskDescription(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String KWHzl() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TaskDescription) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) ((TaskDescription) obj).copydefault);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            java.lang.String str = this.copydefault;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Input(lastShownAlgoId=" + this.copydefault + ")";
        }

        public TaskDescription(java.lang.String str) {
            this.copydefault = str;
        }
    }

    /* JADX INFO: renamed from: o.wpk$ActionBar */
    public static final class ActionBar {
        public final java.lang.String AEQbTJ;
        public final boolean KWHzl;
        public final java.util.List<BotUiState> copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.wpk$ActionBar */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ActionBar copy$default(ActionBar actionBar, boolean z, java.lang.String str, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                z = actionBar.KWHzl;
            }
            if ((i & 2) != 0) {
                str = actionBar.AEQbTJ;
            }
            if ((i & 4) != 0) {
                list = actionBar.copydefault;
            }
            return actionBar.AEQbTJ(z, str, list);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ActionBar AEQbTJ(boolean z, java.lang.String str, @NotNull java.util.List<BotUiState> list) {
            Intrinsics.checkNotNullParameter(list, "");
            return new ActionBar(z, str, list);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean AEQbTJ() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String KWHzl() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<BotUiState> copydefault() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ActionBar)) {
                return false;
            }
            ActionBar actionBar = (ActionBar) obj;
            return this.KWHzl == actionBar.KWHzl && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) actionBar.AEQbTJ) && Intrinsics.EZpvd(this.copydefault, actionBar.copydefault);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = java.lang.Boolean.hashCode(this.KWHzl);
            java.lang.String str = this.AEQbTJ;
            return (((iHashCode * 31) + (str == null ? 0 : str.hashCode())) * 31) + this.copydefault.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Output(hasMore=" + this.KWHzl + ", lastShownAlgoId=" + this.AEQbTJ + ", bots=" + this.copydefault + ")";
        }

        public ActionBar(boolean z, java.lang.String str, @NotNull java.util.List<BotUiState> list) {
            Intrinsics.checkNotNullParameter(list, "");
            this.KWHzl = z;
            this.AEQbTJ = str;
            this.copydefault = list;
        }
    }
}
