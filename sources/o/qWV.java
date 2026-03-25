package o;

import com.okinc.market.watch.usecase.GroupWatchListSubscribeUseCaseV2$onExecute$1;
import com.okinc.market.watch.usecase.GroupWatchListSubscribeUseCaseV2$onExecute$flow$1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class qWV extends AbstractC49400uno<java.lang.String, Flow<? extends java.util.List<? extends qWH>>> {
    private static final ActionBar Companion = new ActionBar(null);
    public static final int EZpvd = 8;
    public final C41607qtx AEQbTJ;
    public final CoroutineDispatcher KWHzl;
    public final qWQ OLrzqt;
    public final qWD copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49400uno
    public CoroutineDispatcher AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final qWD copydefault() {
        return this.copydefault;
    }

    @Override // o.InterfaceC49403unr
    public /* synthetic */ java.lang.Object KWHzl(java.lang.Object obj, Continuation continuation) {
        return EZpvd((java.lang.String) obj, (Continuation<? super Flow<? extends java.util.List<? extends qWH>>>) continuation);
    }

    @yCM
    public qWV(@NotNull qWQ qwq, @NotNull CoroutineDispatcher coroutineDispatcher, @NotNull qWD qwd, @NotNull C41607qtx c41607qtx) {
        Intrinsics.checkNotNullParameter(qwq, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(qwd, "");
        Intrinsics.checkNotNullParameter(c41607qtx, "");
        this.OLrzqt = qwq;
        this.KWHzl = coroutineDispatcher;
        this.copydefault = qwd;
        this.AEQbTJ = c41607qtx;
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.qWV.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object EZpvd(@NotNull java.lang.String str, @NotNull Continuation<? super Flow<? extends java.util.List<? extends qWH>>> continuation) throws java.lang.Throwable {
        GroupWatchListSubscribeUseCaseV2$onExecute$1 groupWatchListSubscribeUseCaseV2$onExecute$1;
        boolean zBooleanValue;
        java.lang.Object objKWHzl;
        qWV qwv;
        if (continuation instanceof GroupWatchListSubscribeUseCaseV2$onExecute$1) {
            groupWatchListSubscribeUseCaseV2$onExecute$1 = (GroupWatchListSubscribeUseCaseV2$onExecute$1) continuation;
            int i = groupWatchListSubscribeUseCaseV2$onExecute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                groupWatchListSubscribeUseCaseV2$onExecute$1.label = i - Integer.MIN_VALUE;
            } else {
                groupWatchListSubscribeUseCaseV2$onExecute$1 = new GroupWatchListSubscribeUseCaseV2$onExecute$1(this, continuation);
            }
        }
        java.lang.Object obj = groupWatchListSubscribeUseCaseV2$onExecute$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = groupWatchListSubscribeUseCaseV2$onExecute$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            pUU.KWHzl("GroupWatchListSubscribeUseCaseV2", "start to get fav data by group，groupId=" + str);
            zBooleanValue = this.AEQbTJ.AEQbTJ(Unit.INSTANCE).booleanValue();
            qWQ qwq = this.OLrzqt;
            java.lang.String strKWHzl = C55686xod.KWHzl();
            groupWatchListSubscribeUseCaseV2$onExecute$1.L$0 = this;
            groupWatchListSubscribeUseCaseV2$onExecute$1.L$1 = str;
            groupWatchListSubscribeUseCaseV2$onExecute$1.Z$0 = zBooleanValue;
            groupWatchListSubscribeUseCaseV2$onExecute$1.label = 1;
            objKWHzl = qwq.KWHzl(strKWHzl, str, groupWatchListSubscribeUseCaseV2$onExecute$1);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
            qwv = this;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            boolean z = groupWatchListSubscribeUseCaseV2$onExecute$1.Z$0;
            java.lang.String str2 = (java.lang.String) groupWatchListSubscribeUseCaseV2$onExecute$1.L$1;
            qWV qwv2 = (qWV) groupWatchListSubscribeUseCaseV2$onExecute$1.L$0;
            C56391yDq.AEQbTJ(obj);
            zBooleanValue = z;
            str = str2;
            qwv = qwv2;
            objKWHzl = obj;
        }
        return FlowKt.flowCombine(FlowKt.distinctUntilChanged((Flow) objKWHzl), qwv.copydefault.KWHzl(), new GroupWatchListSubscribeUseCaseV2$onExecute$flow$1(str, zBooleanValue, qwv, null));
    }
}
