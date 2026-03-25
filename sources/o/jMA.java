package o;

import com.okinc.business.market.features.analysis.spot.sub.pnl_detail.domain.usecase.GetSortPnlListUseCase$onExecute$1;
import com.okinc.business.market.features.analysis.spot.sub.pnl_detail.ui.model.PnlDetailListSortType;
import com.okinc.business.market.features.analysis.spot.sub.pnl_detail.ui.model.PnlDetailVo;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class jMA extends AbstractC49400uno<TaskDescription, java.util.List<? extends PnlDetailVo.PnlListItem>> {
    public final CoroutineDispatcher EZpvd;
    public final C25960jMt copydefault;

    public final /* synthetic */ class Activity {
        public static final /* synthetic */ int[] AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[PnlDetailListSortType.values().length];
            try {
                iArr[PnlDetailListSortType.NAME_ASC.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[PnlDetailListSortType.NAME_DESC.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[PnlDetailListSortType.AMOUNT_ASC.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[PnlDetailListSortType.AMOUNT_DESC.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[PnlDetailListSortType.PNL_ASC.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[PnlDetailListSortType.PNL_DESC.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            AEQbTJ = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49400uno
    public CoroutineDispatcher AEQbTJ() {
        return this.EZpvd;
    }

    @Override // o.InterfaceC49403unr
    public /* bridge */ /* synthetic */ java.lang.Object KWHzl(java.lang.Object obj, Continuation continuation) {
        return KWHzl((TaskDescription) obj, (Continuation<? super java.util.List<PnlDetailVo.PnlListItem>>) continuation);
    }

    public static final class TaskDescription {
        public final java.util.List<PnlDetailVo.PnlListItem> EZpvd;
        public final java.util.List<PnlDetailVo.PnlListItem> OLrzqt;
        public final PnlDetailListSortType copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.jMA$TaskDescription */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, PnlDetailListSortType pnlDetailListSortType, java.util.List list, java.util.List list2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                pnlDetailListSortType = taskDescription.copydefault;
            }
            if ((i & 2) != 0) {
                list = taskDescription.EZpvd;
            }
            if ((i & 4) != 0) {
                list2 = taskDescription.OLrzqt;
            }
            return taskDescription.KWHzl(pnlDetailListSortType, list, list2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<PnlDetailVo.PnlListItem> AEQbTJ() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<PnlDetailVo.PnlListItem> EZpvd() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaskDescription KWHzl(@NotNull PnlDetailListSortType pnlDetailListSortType, @NotNull java.util.List<PnlDetailVo.PnlListItem> list, @NotNull java.util.List<PnlDetailVo.PnlListItem> list2) {
            Intrinsics.checkNotNullParameter(pnlDetailListSortType, "");
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(list2, "");
            return new TaskDescription(pnlDetailListSortType, list, list2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final PnlDetailListSortType copydefault() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TaskDescription)) {
                return false;
            }
            TaskDescription taskDescription = (TaskDescription) obj;
            return this.copydefault == taskDescription.copydefault && Intrinsics.EZpvd(this.EZpvd, taskDescription.EZpvd) && Intrinsics.EZpvd(this.OLrzqt, taskDescription.OLrzqt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((this.copydefault.hashCode() * 31) + this.EZpvd.hashCode()) * 31) + this.OLrzqt.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "GetSortPnlListUseCaseParams(sortType=" + this.copydefault + ", pnlList=" + this.EZpvd + ", originPnlList=" + this.OLrzqt + ")";
        }

        public TaskDescription(@NotNull PnlDetailListSortType pnlDetailListSortType, @NotNull java.util.List<PnlDetailVo.PnlListItem> list, @NotNull java.util.List<PnlDetailVo.PnlListItem> list2) {
            Intrinsics.checkNotNullParameter(pnlDetailListSortType, "");
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(list2, "");
            this.copydefault = pnlDetailListSortType;
            this.EZpvd = list;
            this.OLrzqt = list2;
        }
    }

    @yCM
    public jMA(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull C25960jMt c25960jMt) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(c25960jMt, "");
        this.EZpvd = coroutineDispatcher;
        this.copydefault = c25960jMt;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull TaskDescription taskDescription, @NotNull Continuation<? super java.util.List<PnlDetailVo.PnlListItem>> continuation) throws java.lang.Throwable {
        GetSortPnlListUseCase$onExecute$1 getSortPnlListUseCase$onExecute$1;
        if (continuation instanceof GetSortPnlListUseCase$onExecute$1) {
            getSortPnlListUseCase$onExecute$1 = (GetSortPnlListUseCase$onExecute$1) continuation;
            int i = getSortPnlListUseCase$onExecute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getSortPnlListUseCase$onExecute$1.label = i - Integer.MIN_VALUE;
            } else {
                getSortPnlListUseCase$onExecute$1 = new GetSortPnlListUseCase$onExecute$1(this, continuation);
            }
        }
        java.lang.Object objEZpvd = getSortPnlListUseCase$onExecute$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = getSortPnlListUseCase$onExecute$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objEZpvd);
            C25960jMt c25960jMt = this.copydefault;
            java.util.List<PnlDetailVo.PnlListItem> listEZpvd = taskDescription.EZpvd();
            getSortPnlListUseCase$onExecute$1.L$0 = taskDescription;
            getSortPnlListUseCase$onExecute$1.label = 1;
            objEZpvd = c25960jMt.EZpvd(listEZpvd, getSortPnlListUseCase$onExecute$1);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            taskDescription = (TaskDescription) getSortPnlListUseCase$onExecute$1.L$0;
            C56391yDq.AEQbTJ(objEZpvd);
        }
        java.util.List list = (java.util.List) objEZpvd;
        switch (Activity.AEQbTJ[taskDescription.copydefault().ordinal()]) {
            case 1:
                return CollectionsKt___CollectionsKt.EZpvd(list, new Dialog());
            case 2:
                return CollectionsKt___CollectionsKt.EZpvd(list, new Application());
            case 3:
                return CollectionsKt___CollectionsKt.EZpvd(list, new FragmentManager());
            case 4:
                return CollectionsKt___CollectionsKt.EZpvd(list, new StateListAnimator());
            case 5:
                return CollectionsKt___CollectionsKt.EZpvd(list, new Fragment());
            case 6:
                return CollectionsKt___CollectionsKt.EZpvd(list, new ActionBar());
            default:
                return taskDescription.AEQbTJ();
        }
    }

    public static final class ActionBar<T> implements java.util.Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return yET.KWHzl(C33129mqd.copydefault(((PnlDetailVo.PnlListItem) t).getOriginPnl()), C33129mqd.copydefault(((PnlDetailVo.PnlListItem) t2).getOriginPnl()));
        }
    }

    public static final class Application<T> implements java.util.Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return yET.KWHzl(((PnlDetailVo.PnlListItem) t).getName(), ((PnlDetailVo.PnlListItem) t2).getName());
        }
    }

    public static final class StateListAnimator<T> implements java.util.Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return yET.KWHzl(C33129mqd.copydefault(((PnlDetailVo.PnlListItem) t).getOriginBalance()), C33129mqd.copydefault(((PnlDetailVo.PnlListItem) t2).getOriginBalance()));
        }
    }

    public static final class Dialog<T> implements java.util.Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return yET.KWHzl(((PnlDetailVo.PnlListItem) t2).getName(), ((PnlDetailVo.PnlListItem) t).getName());
        }
    }

    public static final class Fragment<T> implements java.util.Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return yET.KWHzl(C33129mqd.copydefault(((PnlDetailVo.PnlListItem) t2).getOriginPnl()), C33129mqd.copydefault(((PnlDetailVo.PnlListItem) t).getOriginPnl()));
        }
    }

    public static final class FragmentManager<T> implements java.util.Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return yET.KWHzl(C33129mqd.copydefault(((PnlDetailVo.PnlListItem) t2).getOriginBalance()), C33129mqd.copydefault(((PnlDetailVo.PnlListItem) t).getOriginBalance()));
        }
    }
}
