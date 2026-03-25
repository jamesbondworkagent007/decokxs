package o;

import com.okinc.im.usecase.relationlist.GetServerSuggestedRelationListUseCase$execute$1;
import com.okinc.network.okg.cache.CacheStrategy;
import com.okinc.okimcore.model.remote.RelationInfo;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oGq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C35867oGq {
    public final InterfaceC44177sGd KWHzl;
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int AEQbTJ = 8;

    @yCM
    public C35867oGq(@NotNull InterfaceC44177sGd interfaceC44177sGd) {
        Intrinsics.checkNotNullParameter(interfaceC44177sGd, "");
        this.KWHzl = interfaceC44177sGd;
    }

    /* JADX INFO: renamed from: o.oGq$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.oGq.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(@NotNull CacheStrategy cacheStrategy, @NotNull Continuation<? super java.util.List<RelationInfo>> continuation) throws java.lang.Throwable {
        GetServerSuggestedRelationListUseCase$execute$1 getServerSuggestedRelationListUseCase$execute$1;
        if (continuation instanceof GetServerSuggestedRelationListUseCase$execute$1) {
            getServerSuggestedRelationListUseCase$execute$1 = (GetServerSuggestedRelationListUseCase$execute$1) continuation;
            int i = getServerSuggestedRelationListUseCase$execute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getServerSuggestedRelationListUseCase$execute$1.label = i - Integer.MIN_VALUE;
            } else {
                getServerSuggestedRelationListUseCase$execute$1 = new GetServerSuggestedRelationListUseCase$execute$1(this, continuation);
            }
        }
        java.lang.Object objOLrzqt = getServerSuggestedRelationListUseCase$execute$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = getServerSuggestedRelationListUseCase$execute$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objOLrzqt);
            InterfaceC44177sGd interfaceC44177sGd = this.KWHzl;
            getServerSuggestedRelationListUseCase$execute$1.label = 1;
            objOLrzqt = interfaceC44177sGd.OLrzqt(cacheStrategy, getServerSuggestedRelationListUseCase$execute$1);
            if (objOLrzqt == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objOLrzqt);
        }
        java.util.List list = (java.util.List) objOLrzqt;
        pUU.KWHzl("GetSuggestedListUseCase", "Get suggested list result size: " + list.size());
        return list;
    }
}
